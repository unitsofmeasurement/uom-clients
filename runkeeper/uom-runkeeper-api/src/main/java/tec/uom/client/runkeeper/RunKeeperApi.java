/*
 * Copyright 2016 Units of Measurement
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tec.uom.client.runkeeper;

import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.api.service.Preconditions;
import org.agorava.spi.ProviderConfigOauth20Final;

/**
 * @author Werner Keil Date: 06/03/16
 */
@RunKeeper
public class RunKeeperApi extends ProviderConfigOauth20Final {
	private static final String DEFAULT_WEB_BASE_URL = "https://runkeeper.com/apps";

//	private SimpleDateFormat format = new SimpleDateFormat(
//			"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
//	private String apiBaseUrl = DEFAULT_API_BASE_URL;
//	private Version apiVersion = Version.BETA_1;

	private static final String MEDIA_NAME = "RunKeeper";
	private static final String AUTHORIZE_URL = DEFAULT_WEB_BASE_URL +"/authorize?client_id=%s&response_type=code&redirect_uri=%s";
	private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL
			+ "&scope=%s";

	@Override
	public String getAccessTokenEndpoint() {
		return DEFAULT_WEB_BASE_URL + "/token";
	}

	@Override
	public String getAuthorizationUrl(OAuthAppSettings oAuthAppSettings) {
		Preconditions
				.checkValidUrl(oAuthAppSettings.getCallback(),
						"Must provide a valid url as callback. RunKeeper does not support OOB");

		// Append scope if present
		if (oAuthAppSettings.hasScope()) {
			System.out.println("Has Scope: " + oAuthAppSettings.getScope());
			return String.format(SCOPED_AUTHORIZE_URL,
					oAuthAppSettings.getApiKey(),
					OAuthEncoder.encode(oAuthAppSettings.getCallback()),
					OAuthEncoder.encode(oAuthAppSettings.getScope()));
		} else {
			return String.format(AUTHORIZE_URL,
					oAuthAppSettings.getApiKey(),
					OAuthEncoder.encode(oAuthAppSettings.getCallback()));
		}
	}

	@Override
	public String getProviderName() {
		return MEDIA_NAME;
	}
}

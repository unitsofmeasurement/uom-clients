/*
 * Copyright 2015-2016 Units of Measurement
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

package tec.uom.client.fitbit;

import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.api.service.Preconditions;
import org.agorava.spi.ProviderConfigOauth20;
import tec.uom.client.fitbit.model.Scope;

/**
 * @author Werner Keil Date: 04/03/16
 */
@Fitbit
public class FitbitApi extends ProviderConfigOauth20 {

/*
	public static enum Version implements Versioned {

		BETA_1;

		private String version;

		private Version() {
			version = name().replaceAll("^.*_([^_]+)$", "$1");
		}

		public String getVersion() {
			return version;
		}

		public static Version fromVersion(String v) {
			return Version.valueOf("BETA_" + v);
		}
	}
*/
	//	private static final String DEFAULT_API_BASE_URL = "api.fitbit.com";
	private static final String DEFAULT_WEB_BASE_URL = "https://www.fitbit.com";
//	https://www.fitbit.com/oauth2
	protected static final String SUBSCRIBER_ID_HEADER_NAME = "X-Fitbit-Subscriber-Id";

//	private SimpleDateFormat format = new SimpleDateFormat(
//			"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
//	private String apiBaseUrl = DEFAULT_API_BASE_URL;
//	private Version apiVersion = Version.BETA_1;

	private static final String MEDIA_NAME = "Fitbit";
	private static final String AUTHORIZE_URL = DEFAULT_WEB_BASE_URL +"/oauth2/authorize?client_id=%s&redirect_uri=%s&response_type=token";
	private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL
			+ "&scope=%s";

	@Override
	public String getAccessTokenEndpoint() {
		//return "https://" + apiBaseUrl + "/oauth/request_token";
		return DEFAULT_WEB_BASE_URL + "/oauth2/token";
	}

	@Override
	public String getAuthorizationUrl(OAuthAppSettings oAuthAppSettings) {
		Preconditions
				.checkValidUrl(oAuthAppSettings.getCallback(),
						"Must provide a valid url as callback. Fitbit does not support OOB");

		// Append scope if present
		if (oAuthAppSettings.hasScope()) {
			System.out.println("Has Scope: " + oAuthAppSettings.getScope());
			return String.format(SCOPED_AUTHORIZE_URL,
					oAuthAppSettings.getApiKey(),
					OAuthEncoder.encode(oAuthAppSettings.getCallback()),
					OAuthEncoder.encode(oAuthAppSettings.getScope()));
		} else {
			System.out.println("No Scope, substituting " + Scope.PROFILE);
			return String.format(SCOPED_AUTHORIZE_URL,
					oAuthAppSettings.getApiKey(),
					OAuthEncoder.encode(oAuthAppSettings.getCallback()),
					Scope.PROFILE.getId());
		}
	}

	@Override
	public String getProviderName() {
		return MEDIA_NAME;
	}
}

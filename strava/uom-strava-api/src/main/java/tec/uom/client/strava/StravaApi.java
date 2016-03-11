/*
 * Copyright 2016 Agorava
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

package tec.uom.client.strava;

import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.api.service.Preconditions;
import org.agorava.spi.ProviderConfigOauth20;

@Strava
public class StravaApi extends ProviderConfigOauth20 {
	
    private static final String AUTHORIZE_URL = "https://www.strava.com/oauth/authorize?client_id=%s&response_type=code&redirect_uri=%s";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    private static final String TOKEN_URL = "https://www.strava.com/oauth/token";

    @Override
    public String getAccessTokenEndpoint() {
        return TOKEN_URL;
    }

    @Override
    public String getAuthorizationUrl(OAuthAppSettings config) {
        Preconditions.checkValidUrl(config.getCallback(), "Must provide a valid url as callback. Strava does not support OOB");
        final StringBuilder sb = new StringBuilder();
        
        // Append scope if present
        if (config.hasScope()) {
            sb.append(String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()), OAuthEncoder.encode(config.getScope())));
            boolean viewPrivate = true;
            boolean write = true;
            if (viewPrivate || write)  {
                sb.append("&scope=");

                if (viewPrivate) {
                    sb.append("view_private");
                }
                if (viewPrivate && write) {
                    sb.append(",");
                }
                if (write) {
                    sb.append("write");
                }
            }
        } else {
           sb.append(String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback())));
        }
        
//        sb.append("&state=" + state);
        
        String approvalPrompt = "auto";
        
        if (!approvalPrompt.equals("force") && !approvalPrompt.equals("auto")) {
            throw new IllegalArgumentException("approvalPrompt should be 'force' or 'auto'");
        }
        sb.append("&approval_prompt=" + approvalPrompt);

        return sb.toString();
    }
    
    @Override
    public String getProviderName() {
        return "Strava";
    }
}

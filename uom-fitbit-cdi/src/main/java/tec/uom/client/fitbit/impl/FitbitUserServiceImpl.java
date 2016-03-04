/*
 * Copyright 2014-2016 Units of Measurement
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
package tec.uom.client.fitbit.impl;

import tec.uom.client.fitbit.Fitbit;
import tec.uom.client.fitbit.FitbitBaseService;
import tec.uom.client.fitbit.FitbitUserService;
import tec.uom.client.fitbit.model.user.UserInfo;

/**
 *
 * @author Werner Keil
 */

@Fitbit
public class FitbitUserServiceImpl extends FitbitBaseService implements FitbitUserService {

    @Override
    public UserInfo getUserProfile() {
    	final String url = buildAbsoluteUri("1/user/-/profile.json");
    	System.out.println("URI: " + url);
        return getService().get(url, UserInfo.class);
    }

    @Override
    public UserInfo getUserProfile(String login) {
        return getService().get(buildAbsoluteUri("1/user/" + login + "/profile.json"), UserInfo.class);
    }
}

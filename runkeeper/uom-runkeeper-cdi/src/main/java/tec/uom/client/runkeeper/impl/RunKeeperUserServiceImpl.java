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
package tec.uom.client.runkeeper.impl;

import tec.uom.client.runkeeper.RunKeeper;
import tec.uom.client.runkeeper.RunKeeperBaseService;
import tec.uom.client.runkeeper.RunKeeperUserService;
import tec.uom.client.runkeeper.model.User;

/**
 *
 * @author Werner Keil
 */
@RunKeeper
public class RunKeeperUserServiceImpl extends RunKeeperBaseService implements RunKeeperUserService {

    @Override
    public User getUserProfile() {
    	final String url = buildAbsoluteUri("/user");
//    	System.out.println("URI: " + url);
        //return getService().get(url, User.class);
//    	System.out.println(getService().get(url, User.class));
    	
    	return new User("44482199", "Werner Keil", "https://d30a49kyitztvg.cloudfront.net/Cve2yAgLG5AUEPmUhanbqcNX_med.jpg");
    }

    @Override
    public User getUserProfile(String login) {
    	// 44482199
        return getService().get(buildAbsoluteUri("/user/" + login + "/profile.json"), User.class);
    }
}

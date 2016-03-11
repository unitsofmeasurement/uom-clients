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
package tec.uom.client.withings.cdi;

import tec.uom.client.withings.WithingsBaseService;
import tec.uom.client.withings.WithingsUserService;
import tec.uom.client.withings.Withings;
import tec.uom.client.withings.model.User;

/**
 *
 * @author Werner Keil
 */

@Withings
public class WithingsUserServiceImpl extends WithingsBaseService implements WithingsUserService {

    @Override
    public User getUserProfile() {
        //return getService().get(buildAbsoluteUri("athlete"), User.class);
    	return new User("1234", "wkeil", "Werner", "Keil", "werner@catmedia.us", 
    			"https://p4.withings.com/p4/userprofile/8/0/5/805ed12950865d7c3208cdd0b8d36383d7a09f92_128x128?rev=1457398223");
    }

    @Override
    public User getUserProfile(String login) { // TODO could be int id.
        return getService().get(buildAbsoluteUri("athletes/" + login), User.class);
    }
}

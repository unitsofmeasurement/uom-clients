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

import java.util.Locale;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tec.uom.client.fitbit.Fitbit;
import tec.uom.client.fitbit.FitbitBaseService;
import tec.uom.client.fitbit.FitbitUserService;
import tec.uom.client.fitbit.model.user.Gender;
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
        //return getService().get(url, UserInfo.class);
        return new UserInfo("12345", "Werner Keil", Gender.MALE, null, Quantities.getQuantity(1.88, Units.METRE),
        		Quantities.getQuantity(88, Units.KILOGRAM), null, null, "Werner Keil", "Werner", "Germany", "BW", "Karlsruhe",
        		null, null, 0, Locale.GERMANY, 
        		"https://d6y8zfzc2qfsl.cloudfront.net/9E9003F9-E844-D03F-77A9-EE0D47F081CC_photo_800.jpg",
        		null, null, null, null, null);
    }

    @Override
    public UserInfo getUserProfile(String login) {
        return getService().get(buildAbsoluteUri("1/user/" + login + "/profile.json"), UserInfo.class);
    }
}

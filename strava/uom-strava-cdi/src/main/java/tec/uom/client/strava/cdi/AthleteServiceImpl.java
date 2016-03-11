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
package tec.uom.client.strava.cdi;

import tec.uom.client.strava.AthleteService;
import tec.uom.client.strava.Strava;
import tec.uom.client.strava.StravaBaseService;
import tec.uom.client.strava.model.Athlete;

/**
 *
 * @author Werner Keil
 */

@Strava
public class AthleteServiceImpl extends StravaBaseService implements AthleteService {

    @Override
    public Athlete getUserProfile() {
        return getService().get(buildAbsoluteUri("athlete"), Athlete.class);
    }

    @Override
    public Athlete getUserProfile(String login) { // TODO could be int id.
        return getService().get(buildAbsoluteUri("athletes/" + login), Athlete.class);
    }
}

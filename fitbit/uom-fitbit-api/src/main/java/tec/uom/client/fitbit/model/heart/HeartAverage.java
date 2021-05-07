/*
 * Copyright 2015 Units of Measurement
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

package tec.uom.client.fitbit.model.heart;

import javax.measure.Quantity;

import tech.uom.domain.health.HeartRate;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 05/05/15
 * Time: 1:52 PM
 */
public class HeartAverage {

    private final String tracker;
    private final Quantity<HeartRate> heartRate;

    public HeartAverage(String tracker, Quantity<HeartRate> heartRate) {
        this.tracker = tracker;
        this.heartRate = heartRate;
    }

    public String getTracker() {
        return tracker;
    }

    public Quantity<HeartRate> getHeartRate() {
        return heartRate;
    }
}

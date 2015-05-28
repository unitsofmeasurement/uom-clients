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

import hirondelle.date4j.DateTime;

import javax.measure.Quantity;

import tec.uom.lib.common.function.LongIdentifiable;
import tec.uom.domain.health.HeartRate;

/**
 * User: Werner
 * Date: 09/25/14
 * Time: 18:20
 */
public class HeartLog implements LongIdentifiable{

    private final long logId;
    private final String tracker;
    private final Quantity<HeartRate> heartRate;
    private final DateTime time;

    public HeartLog(long logId, String tracker, Quantity<HeartRate> heartRate, DateTime time) {
        this.logId = logId;
        this.tracker = tracker;
        this.heartRate = heartRate;
        this.time = time;
    }

    public long getId() {
        return logId;
    }

    public String getTracker() {
        return tracker;
    }

    public Quantity<HeartRate> getHeartRate() {
        return heartRate;
    }

    public DateTime getTime() {
        return time;
    }
}

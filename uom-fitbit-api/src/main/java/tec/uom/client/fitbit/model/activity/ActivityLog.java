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

package tec.uom.client.fitbit.model.activity;

import hirondelle.date4j.DateTime;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;
import javax.measure.quantity.Time;

import tec.uom.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityLog extends LoggedActivityReference {
    final long logId;
    DateTime startTime;
    boolean hasStartTime;
    boolean isFavorite;

    public ActivityLog(long logId, long activityId, String name, String description, Long activityParentId, String activityParentName, 
    		DateTime startTime, Quantity<Time> duration, Quantity<Length> distance, Quantity<Energy> calories,
    		 Quantity<Step> steps, boolean isFavorite) {
        super(activityId, name, description, activityParentId, activityParentName, calories, duration, distance, steps);
        this.logId = logId;
        this.startTime = startTime;
        this.hasStartTime = true;
        this.isFavorite = isFavorite;
    }

    public long getLogId() {
        return logId;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public boolean getHasStartTime() {
        return hasStartTime;
    }
}
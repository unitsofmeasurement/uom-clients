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

package tec.uom.client.fitbit.model.user;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import tec.uom.client.fitbit.model.user.FriendStats.StatisticInfo;
import tec.uom.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class FriendStats {
    private UserInfo user;
    private StatisticInfo summary;
    private StatisticInfo average;

    public FriendStats(UserInfo user, StatisticInfo summary, StatisticInfo average) {
        this.user = user;
        this.summary = summary;
        this.average = average;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public StatisticInfo getSummary() {
        return summary;
    }

    public void setSummary(StatisticInfo summary) {
        this.summary = summary;
    }

    public StatisticInfo getAverage() {
        return average;
    }

    public void setAverage(StatisticInfo average) {
        this.average = average;
    }

    public static class StatisticInfo {
        private Quantity<Step> steps;
        private Quantity<Energy> calories;
        private Quantity<Length> distance;

        public StatisticInfo() {

        }

        public StatisticInfo(Quantity<Step> steps, Quantity<Energy> calories, Quantity<Length> distance) {
            this.steps = steps;
            this.calories = calories;
            this.distance = distance;
        }

        public Quantity<Step> getSteps() {
            return steps;
        }

        public void setSteps(Quantity<Step> steps) {
            this.steps = steps;
        }

        public Quantity<Energy> getCalories() {
            return calories;
        }

        public void setCalories(Quantity<Energy> calories) {
            this.calories = calories;
        }

        public Quantity<Length> getDistance() {
            return distance;
        }

        public void setDistance(Quantity<Length> distance) {
            this.distance = distance;
        }

    }

}

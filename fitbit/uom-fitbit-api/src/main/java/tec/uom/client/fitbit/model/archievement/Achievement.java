/*
 * Copyright 2014-2015 Units of Measurement
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

package tec.uom.client.fitbit.model.archievement;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import tec.uom.domain.health.Floor;
import tec.uom.domain.health.Step;

/**
 * User: Werner
 * Date: 08/24/14
 * Time: 18:20
 */
public class Achievement {

    private Quantity<Energy> caloriesOut;
    private Quantity<Floor> floors;
    private Quantity<Length> distance;
    private Quantity<Step> steps;

    public Achievement(Quantity<Energy> caloriesOut, Quantity<Floor> floors, Quantity<Length> distance, Quantity<Step> steps) {
        this.caloriesOut = caloriesOut;
        this.floors = floors;
        this.distance = distance;
        this.steps = steps;
    }

    public Quantity<Energy> getCaloriesOut() {
        return caloriesOut;
    }

    public Quantity<Floor> getFloors() {
        return floors;
    }

    public Quantity<Length> getDistance() {
        return distance;
    }

    public Quantity<Step> getSteps() {
        return steps;
    }

}

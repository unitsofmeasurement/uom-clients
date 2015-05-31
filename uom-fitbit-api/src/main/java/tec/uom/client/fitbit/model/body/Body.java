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

package tec.uom.client.fitbit.model.body;

import javax.measure.Quantity;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;

public class Body {
    private Quantity<Mass> weight;
    private double bmi;
    private Quantity<Mass> fat;
    private double neck;
    private Quantity<Length> bicep;
    private double forearm;
    private double chest;
    private double waist;
    private double hips;
    private double thigh;
    private double calf;

    public Body(Quantity<Mass> weight, double bmi, Quantity<Mass> fat, double neck, Quantity<Length> bicep, double forearm, double chest, double waist, double hips, double thigh, double calf) {
        this.weight = weight;
        this.bmi = bmi;
        this.fat = fat;
        this.neck = neck;
        this.bicep = bicep;
        this.forearm = forearm;
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
        this.thigh = thigh;
        this.calf = calf;
    }

    public Quantity<Mass> getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public Quantity<Mass> getFat() {
        return fat;
    }

    public double getNeck() {
        return neck;
    }

    public Quantity<Length> getBicep() {
        return bicep;
    }

    public double getForearm() {
        return forearm;
    }

    public double getChest() {
        return chest;
    }

    public double getWaist() {
        return waist;
    }

    public double getHips() {
        return hips;
    }

    public double getThigh() {
        return thigh;
    }

    public double getCalf() {
        return calf;
    }
}

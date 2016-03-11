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
package tec.uom.client.withings.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;

import tec.uom.client.withings.Withings;
import tec.uom.client.withings.model.User;

/**
 * Jackson module for setting up mixin annotations on Strava model types. This enables the use of Jackson annotations without
 * directly annotating the model classes themselves.
 *
 * @author Werner Keil
 */
@SuppressWarnings("serial")
@Withings
public class WithingsModule extends SimpleModule {

    public WithingsModule() {
        super("StravaModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(User.class, AthleteMixin.class);
    }
}

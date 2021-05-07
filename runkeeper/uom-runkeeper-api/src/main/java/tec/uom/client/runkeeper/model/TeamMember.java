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
package tec.uom.client.runkeeper.model;

import tech.uom.lib.common.function.LongIdentifiable;
import tech.uom.lib.common.function.Nameable;

public class TeamMember implements LongIdentifiable, Nameable {

    private long userID;
    private String status;
    private String name;
    private String profile;
    
	@Override
	public String getName() {
		return name;
	}
	@Override
	public long getId() {
		return userID;
	}
}

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

package tec.uom.client.fitbit.model;

import tech.uom.lib.common.function.DescriptionSupplier;
import tech.uom.lib.common.function.Identifiable;

/**
 * 
 * @author Werner Keil
 * 
 * Applications must only request permission for resources they intend to access or modify. OAuth 2.0 refers to these permissions as scopes. All Fitbit API endpoints require one or more scopes, which are listed in each endpoint's documentation.
 * Applications must specify a list of scopes when redirecting the user to the authorization page. The access token issued will only contain the scopes the application requested.
 *
 */
public enum Scope implements Identifiable<String>, DescriptionSupplier {
	ACTIVITY("activity", "The activity scope includes activity data and exercise log related features, such as steps, distance, calories burned, and active minutes"), 
	HEARTRATE("heartrate", "The heartrate scope includes the continuous heart rate data and related analysis"),
	LOCATION("location", "The location scope includes the GPS and other location data"),
	NUTRITION("nutrition", "The nutrition scope includes calorie consumption and nutrition related features, such as food/water logging, goals, and plans"),
	PROFILE("profile", "The profile scope is the basic user information");
// FIXME add more scopes
	private final String id;
	private final String description;

	Scope(String id, String description) {
		this.id = id;
		this.description = description;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public static Scope ofId(String id) {
		for (Scope s : Scope.values()) {
			if (s.id == id)
				return s;
		}
		return null;
	}
}

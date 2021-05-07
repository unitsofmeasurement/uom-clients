/*
 * Copyright 2015, 2021 Units of Measurement
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
import tech.uom.lib.common.function.IntIdentifiable;
//import tech.uom.lib.common.function.LabelSupplier;

public enum AccessType implements IntIdentifiable, DescriptionSupplier {
		//LabelSupplier {
	READ(0, "Read-only", "read"), 
	READ_WRITE(1, "Read & Write", "read and write");

	private int id;
	String description;
	String label;

	AccessType(int id, String label, String description) {
		this.id = id;
		this.description = description;
		this.label = label;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public String getLabel() {
		return label;
	}

	public static AccessType valueOf(byte id) {
		for (AccessType level : AccessType.values()) {
			if (level.id == id)
				return level;
		}
		return null;
	}
}

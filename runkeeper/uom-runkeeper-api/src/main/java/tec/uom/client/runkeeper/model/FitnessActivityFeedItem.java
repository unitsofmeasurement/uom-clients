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

import java.math.BigDecimal;

public class FitnessActivityFeedItem {

    private BigDecimal duration;
    private BigDecimal total_distance;
    private long total_calories;
    private boolean has_path;
    private String entry_mode;
    private String source;
    private String start_time;
    private String type;
    private String uri;

    public BigDecimal getDuration() {
        return duration;
    }

    public BigDecimal getTotalDistance() {
        return total_distance;
    }

    public boolean hasPath() {
        return has_path;
    }

    public String getEntryMode() {
        return entry_mode;
    }

    public String getSource() {
        return source;
    }

    public String getStartTime() {
        return start_time;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "FitnessActivityFeedItem{" +
                "duration=" + duration +
                ", total_distance=" + total_distance +
                ", total_calories=" + total_calories +
                ", has_path=" + has_path +
                ", entry_mode='" + entry_mode + '\'' +
                ", source='" + source + '\'' +
                ", start_time='" + start_time + '\'' +
                ", type='" + type + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}

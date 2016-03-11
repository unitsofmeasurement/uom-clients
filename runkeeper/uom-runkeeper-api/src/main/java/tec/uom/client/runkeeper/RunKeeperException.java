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
package tec.uom.client.runkeeper;

import org.agorava.api.exception.AgoravaException;
import org.agorava.api.rest.Response;

/**
 * @author Werner Keil
 *
 */
public class RunKeeperException extends AgoravaException {
    private int statusCode = -1;
    private static final long serialVersionUID = -2623309261327598087L;
    public RunKeeperException(String msg) {
        super(msg);
    }

    public RunKeeperException(Exception cause) {
        super(cause);
    }

    public RunKeeperException(String msg, int statusCode) {
        super(msg);
        this.statusCode = statusCode;

    }

    public RunKeeperException(String msg, Exception cause) {
        super(msg, cause);
    }

    public RunKeeperException(String msg, Exception cause, int statusCode) {
        super(msg, cause);
        this.statusCode = statusCode;

    }

    public RunKeeperException(String cause, Response res) throws RunKeeperException {
        this(cause + '\n' + res.getBody(), res.getCode());
        statusCode = res.getCode();
    }

    public int getStatusCode() {
        return statusCode;
    }
}
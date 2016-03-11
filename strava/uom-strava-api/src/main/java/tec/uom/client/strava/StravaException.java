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
package tec.uom.client.strava;

//import com.fitbit.api.client.http.Response;

import org.agorava.api.exception.AgoravaException;
import org.agorava.api.rest.Response;

/**
 * @author Yusuke Yamamoto
 * @author Werner Keil
 *
 */
public class StravaException extends AgoravaException {
    private int statusCode = -1;
    private static final long serialVersionUID = -2623309261327598087L;
//    private List<FitbitApiError> apiErrors;

    public StravaException(String msg) {
        super(msg);
    }

    public StravaException(Exception cause) {
        super(cause);
    }

    public StravaException(String msg, int statusCode) {
        super(msg);
        this.statusCode = statusCode;

    }

    public StravaException(String msg, Exception cause) {
        super(msg, cause);
    }

    public StravaException(String msg, Exception cause, int statusCode) {
        super(msg, cause);
        this.statusCode = statusCode;

    }

    public StravaException(String cause, Response res) throws StravaException {
        this(cause + '\n' + res.getBody(), res.getCode());
        statusCode = res.getCode();
//        apiErrors = FitbitApiError.constructFitbitApiErrorList(res);
    }

    public int getStatusCode() {
        return statusCode;
    }

//    public List<FitbitApiError> getApiErrors() {
//        return apiErrors;
//    }
}
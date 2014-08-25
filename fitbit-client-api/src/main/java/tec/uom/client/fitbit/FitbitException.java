/*
 * Copyright 2014 Units of Measurement
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
package tec.uom.client.fitbit;

//import com.fitbit.api.client.http.Response;

import org.agorava.api.exception.AgoravaException;
import org.agorava.api.rest.Response;

/**
 * @author Yusuke Yamamoto
 * @author Werner Keil
 *
 */
public class FitbitException extends AgoravaException {
    private int statusCode = -1;
    private static final long serialVersionUID = -2623309261327598087L;
//    private List<FitbitApiError> apiErrors;

    public FitbitException(String msg) {
        super(msg);
    }

    public FitbitException(Exception cause) {
        super(cause);
    }

    public FitbitException(String msg, int statusCode) {
        super(msg);
        this.statusCode = statusCode;

    }

    public FitbitException(String msg, Exception cause) {
        super(msg, cause);
    }

    public FitbitException(String msg, Exception cause, int statusCode) {
        super(msg, cause);
        this.statusCode = statusCode;

    }

    public FitbitException(String cause, Response res) throws FitbitException {
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
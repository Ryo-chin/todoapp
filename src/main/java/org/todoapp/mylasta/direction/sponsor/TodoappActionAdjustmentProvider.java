/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.todoapp.mylasta.direction.sponsor;

import org.dbflute.util.DfStringUtil;
import org.dbflute.util.DfTypeUtil;
import org.lastaflute.web.path.ActionAdjustmentProvider;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jflute
 * @author ryo-chin
 */
public class TodoappActionAdjustmentProvider implements ActionAdjustmentProvider {

    protected static final String API_URL_PREFIX = "/api";

    @Override
    public String toString() {
        return DfTypeUtil.toClassTitle(this) + ":{}";
    }

    @Override
    public boolean isForcedRoutingExcept(HttpServletRequest request, String requestPath) {
        // of course, request to angular resources does not need routing
        // (requestPath might contain /dbflute-intro/ so use contains())
        return !requestPath.contains(API_URL_PREFIX);
    }

    @Override
    public String customizeActionMappingRequestPath(String requestPath) {
        // action class name does not need 'Api' prefix
        return DfStringUtil.substringFirstRear(requestPath, API_URL_PREFIX);
    }
}

/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.body;

/**
 * Created by steve on 29/09/16.
 */
public class BodyConfig {
    public static final String CONFIG_NAME = "body";
    boolean enabled;
    boolean cacheRequestBody;
    int maxBuffers;
    boolean skipProxyBodyHandler;

    public BodyConfig() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isCacheRequestBody() {
        return cacheRequestBody;
    }

    public void setCacheRequestBody(boolean cacheRequestBody) {
        this.cacheRequestBody = cacheRequestBody;
    }

    public int getMaxBuffers() {
        return maxBuffers;
    }

    public void setMaxBuffers(int maxBuffers) {
        this.maxBuffers = maxBuffers;
    }

    public boolean isSkipProxyBodyHandler() {
        return skipProxyBodyHandler;
    }

    public void setSkipProxyBodyHandler(boolean skipProxyBodyHandler) {
        this.skipProxyBodyHandler = skipProxyBodyHandler;
    }
}

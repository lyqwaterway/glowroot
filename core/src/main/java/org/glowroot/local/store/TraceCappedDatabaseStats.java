/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.glowroot.local.store;

public class TraceCappedDatabaseStats implements TraceCappedDatabaseStatsMXBean {

    static final String TRACE_ENTRIES = "trace entries";
    static final String TRACE_PROFILES = "trace profiles";

    private final CappedDatabase cappedDatabase;

    TraceCappedDatabaseStats(CappedDatabase cappedDatabase) {
        this.cappedDatabase = cappedDatabase;
    }

    @Override
    public CappedDatabaseStats getTraceEntries() {
        return cappedDatabase.getStats(TRACE_ENTRIES);
    }

    @Override
    public CappedDatabaseStats getTraceProfiles() {
        return cappedDatabase.getStats(TRACE_PROFILES);
    }
}
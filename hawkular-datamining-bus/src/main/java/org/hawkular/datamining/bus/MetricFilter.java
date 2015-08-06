/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hawkular.datamining.bus;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavol Loffay
 */
public class MetricFilter {

    private static final Set<String> neededSources = new HashSet<>();
    static {
        neededSources.add("MI~R~[dhcp130-144~Local~/]~MT~WildFly Memory Metrics~Heap Used");
//        neededSources.add("MI~R~[dhcp130-144~Local~/]~MT~WildFly Memory Metrics~NonHeap Used");
    }


    public static boolean isNeeded(String source) {
        return neededSources.contains(source);
    }
}

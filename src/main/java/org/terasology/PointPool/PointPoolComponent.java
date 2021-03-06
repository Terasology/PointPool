/*
 * Copyright 2019 MovingBlocks
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
package org.terasology.PointPool;

import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

public class PointPoolComponent implements Component {

    @Replicate
    public int poolValue = 100;

    /* Defines the maximum value possible for the pool */
    @Replicate
    public int maxPoolValue = 100;

    @Replicate
    public String poolType = "";

    public PointPoolComponent() {
    }

    public PointPoolComponent(int poolValue, int maxPoolValue, String poolType) {
        this.poolValue = poolValue;
        this.maxPoolValue = maxPoolValue;
        this.poolType = poolType;
    }
}

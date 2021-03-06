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
package org.terasology.PointPool.event;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;

/**
 * Event sent to fill pool by given value
 */
public class FillPoolEvent implements Event {

    private int value;
    private EntityRef instigator;

    public FillPoolEvent(int value) {
        this(value, EntityRef.NULL);
    }

    public FillPoolEvent(int value, EntityRef instigator) {
        this.value = value;
        this.instigator = instigator;
    }

    public int getValue() {
        return value;
    }

    public EntityRef getInstigator() {
        return instigator;
    }
}

/**
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehcache.sizeof.filters;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * Filter to filter types or fields of object graphs passed to a SizeOf engine
 *
 * @author Chris Dennis
 * @see org.ehcache.sizeof.SizeOf
 */
public interface SizeOfFilter {

    /**
     * Returns the fields to walk and measure for a type
     *
     * @param klazz  the type
     * @param fields the fields already "qualified"
     * @return the filtered Set
     */
    Collection<Field> filterFields(Class<?> klazz, Collection<Field> fields);

    /**
     * Checks whether the type needs to be filtered
     *
     * @param klazz the type
     * @return true, if to be filtered out
     */
    boolean filterClass(Class<?> klazz);
}

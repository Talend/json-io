package com.cedarsoftware.io.factory;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cedarsoftware.io.JsonIoException;
import com.cedarsoftware.io.JsonObject;
import com.cedarsoftware.io.JsonReader;
import com.cedarsoftware.io.Resolver;
import com.cedarsoftware.io.util.SingletonList;
import com.cedarsoftware.io.util.SingletonMap;
import com.cedarsoftware.io.util.SingletonSet;

/**
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br>
 *         Copyright (c) Cedar Software LLC
 *         <br><br>
 *         Licensed under the Apache License, Version 2.0 (the "License");
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br><br>
 *         <a href="http://www.apache.org/licenses/LICENSE-2.0">License</a>
 *         <br><br>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
public class SingletonFactory implements JsonReader.ClassFactory {
    @Override
    public Object newInstance(Class<?> c, JsonObject jObj, Resolver resolver) {
        if (List.class.isAssignableFrom(c)) {
            return new SingletonList<>();
        } else if (Set.class.isAssignableFrom(c)) {
            return new SingletonSet<>();
        } else if (Map.class.isAssignableFrom(c)) {
            return new SingletonMap<>();
        }
        throw new JsonIoException("SingletonFactory handed Class for which it was not expecting: " + c.getName());
    }
}

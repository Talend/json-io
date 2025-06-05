package com.cedarsoftware.io;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.Test;

/**
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br>
 *         Copyright (c) Cedar Software LLC
 *         <br><br>
 *         Licensed under the Apache License, Version 2.0 (the "License")
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
class AtomicLong2Test
{
    static class TestAtomicLongField
    {
        AtomicLong value;
        AtomicLong nullValue;
        AtomicLong strValue;
        AtomicLong emptyStrValue;
        AtomicLong objValue;
        AtomicLong[] values;
    }

    @Test
    void testAssignAtomicLong() {
        String json = "{\"@type\":\"com.cedarsoftware.io.AtomicLong2Test$TestAtomicLongField\",\"value\":16,\"nullValue\":null,\"strValue\":\"50\",\"emptyStrValue\":\"\", \"objValue\":{\"value\":-9},\"values\":[-5,null,5, \"45\"]}";
        TestAtomicLongField atom2 = TestUtil.toObjects(json, null);

        assert atom2.value.get() == 16;
        assert atom2.nullValue == null;
        assert atom2.strValue.get() == 50;
        assert atom2.emptyStrValue.get() == 0;
        assert atom2.objValue.get() == -9;
        assert atom2.values.length == 4;
        assert atom2.values[0].get() == -5;
        assert atom2.values[1] == null;
        assert atom2.values[2].get() == 5;
        assert atom2.values[3].get() == 45;
    }
}

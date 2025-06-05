package com.cedarsoftware.io;

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
class WithoutCustomReaderClass
{
    private String test;
    private CustomDataClass customReaderInner;

    void setTest(String test)
    {
        this.test = test;
    }

    String getTest()
    {
        return test;
    }

    void setCustomReaderInner(CustomDataClass customReaderInner)
    {
        this.customReaderInner = customReaderInner;
    }

    CustomDataClass getCustomReaderInner()
    {
        return customReaderInner;
    }
}

/*
 * (C) Copyright Uwe Schindler (Generics Policeman) and others.
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

/* The binary class file is packaged together with the source distribution.
 */

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

class Java7MethodHandles {
  static void main(String... args) throws Throwable {
    MethodHandle mh = MethodHandles.publicLookup().findVirtual(StringBuilder.class, "append",
      MethodType.methodType(StringBuilder.class, int.class));
    StringBuilder result = (StringBuilder) mh.invoke(new StringBuilder(), 1);
  }
}

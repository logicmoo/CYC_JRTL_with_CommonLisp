/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

//// Internal Imports

//// External Imports
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface SubLFloat extends SubLNumber, SubLObject {

	List decode();

	SubLNumber digits();

	List integerDecode();

	SubLNumber precision();

	SubLNumber radix();

	SubLFloat scale(SubLInteger val);

	SubLNumber sign();
}

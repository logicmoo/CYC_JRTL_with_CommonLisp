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

package  com.cyc.tool.subl.jrtl.nativeCode.type.exception;

//// Internal Imports

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;


//// External Imports

public  final class ExceptionFactory {

  //// Constructors

  /** Creates a new instance of ExceptionFactory. */
  private ExceptionFactory() {
  }

  //// Public Area

  public static final SubLException makeException() {
    return new SubLException();
  }

  public static final SubLException makeException(String str) {
    return new SubLException(str);
  }

  public static final SubLException makeException(SubLString str) {
    return makeException(str.getString());
  }

  public static final SubLException makeException(String str, Throwable t) {
    verifyHandleable(t);
    return new SubLException(str, t);
  }

  public static final SubLException makeException(SubLString str, Throwable t) {
    verifyHandleable(t);
    return makeException(str.getString(), t);
  }

  //// Protected Area

  //// Private Area
  
  private static final void verifyHandleable(Throwable t) {
    if ((t != null) && (t instanceof Unhandleable)) {
      throw (Unhandleable)t;
    }
  }

  //// Internal Rep

  //// Main

}

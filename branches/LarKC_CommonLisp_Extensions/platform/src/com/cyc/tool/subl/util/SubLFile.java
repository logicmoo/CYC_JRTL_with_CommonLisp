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

package  com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

//// Internal Imports

//// External Imports

public  interface SubLFile extends CommonSymbols {
  
  //// Public Area
  
  /**
   * Declares the mapping between functions and symbols for all named
   * functions defined in the file.
   * Like CRTL define.
   */  
  public void declareFunctions(); 
  /**
   * Initializes all global variables and private internal variables
   * for constants defined in the file.
   * Like CRTL init.
   */  
  public void initializeVariables();
  /**
   * Runs all top-level forms in order.
   * Like CRTL setup.
   */  
  public void runTopLevelForms();
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

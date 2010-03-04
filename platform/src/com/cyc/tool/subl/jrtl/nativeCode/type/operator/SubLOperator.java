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

package  com.cyc.tool.subl.jrtl.nativeCode.type.operator;

//// External Imports
import java.util.*;
import java.lang.reflect.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

/**
 * <P>SubLOperator is designed to...
 *
 * @note SubLOperator currently does NOT extend SubLObject, to avoid confusion
 * between the eval and evaluate methods on SubLSpecialOperator, which is a subclass
 * of SubLOperator.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author pace
 * @date December 15, 2005, 4:25 PM
 * @version $Id: SubLOperator.java 126640 2008-12-04 13:39:36Z builder $
 */

public interface SubLOperator extends SubLObject {
 
  SubLSymbol getFunctionSymbol();
  
  boolean isSpecial();
  
  SubLSpecialOperator toSpecialOperator();
  
  //@todo some generalization of evalViaApply and apply?
  // It would take a form in which this is the operator
  // and an environment.
}

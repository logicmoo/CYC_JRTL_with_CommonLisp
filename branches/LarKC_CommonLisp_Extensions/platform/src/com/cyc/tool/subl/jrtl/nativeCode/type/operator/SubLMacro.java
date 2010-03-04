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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;



//// Internal Imports

//// External Imports

/**
 * <P>SubLMacro is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author pace
 * @date December 15, 2005, 4:30 PM
 * @version $Id: SubLMacro.java 126764 2009-01-07 22:27:23Z tbrussea $
 */

public final class SubLMacro extends AbstractSubLOperator {
  
  SubLMacro(SubLFunction macroExpander) {
     super(macroExpander.getFunctionSymbol());
    this.macroExpander = macroExpander;
    if (macroExpander == null) {
      Errors.error("Got null macro expander function.");
    }
  }
  
  public String toString() {
    SubLSymbol macroSymbol = macroExpander.getFunctionSymbol();
    if (macroSymbol != null) {
      return "#<Macro " + macroSymbol + ">";
    } else {
      return super.toString();
    }
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return macroExpander.hashCode(currentDepth + 1);
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  /** Method created to avoid casting */
  public final SubLMacro toMacro() { // SubLMacro
    return this;
  }

  public boolean isInterpreted() {
    return macroExpander.isInterpreted();
  }
  
  public SubLFunction getMacroExpander() {
    return macroExpander;
  }
  
  public final boolean isSpecial() { return false; }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return true; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  private SubLFunction macroExpander;
}

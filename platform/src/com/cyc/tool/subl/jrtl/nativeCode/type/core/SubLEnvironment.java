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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;

//// External Imports
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;


public  final class SubLEnvironment extends AbstractSubLObject {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLEnvironment.
   */
  private SubLEnvironment() {
    this(SubLEnvironment.defaultEnvironment);
  }
  
  private SubLEnvironment(SubLEnvironment outerEnv) {
    outerEnvironment = outerEnv;
  }
  
  //// Public Area
  
  public String toTypeName() {
    return "ENVIRONMENT";
  }
  
  public static SubLEnvironment currentEnvironment() {
    SubLThread thread = SubLProcess.currentSubLThread();
    if (thread.env != null) {
      return thread.env;
    }
    return defaultEnvironment;
  }
  
  public static void setCurrentEnvironment(SubLEnvironment env) {
    SubLThread thread = SubLProcess.currentSubLThread();
    thread.env = env;
  }
  
  public static SubLEnvironment getDefaultEnvironment() {
    return defaultEnvironment;
  }
  
  public SubLPackage getCurrentPackage() {
    return SubLPackage.getCurrentPackage();
  }
  
  public SubLEnvironment getOuterEnvironment() {
    return outerEnvironment;
  }
  
  public SubLEnvironment extend() {
    SubLEnvironment extendedEnv = new SubLEnvironment(this);
    SubLProcess.currentSubLThread().env = extendedEnv;
    return extendedEnv;
  }
  
  public void unextend() {
    if (outerEnvironment != null) {
      SubLThread thread = SubLProcess.currentSubLThread();
      thread.env = outerEnvironment;
    } else {
      Errors.error("Illegal attempt to reclaim base enviroment.");
    }
  }
  
  public SubLObject noteBinding(SubLSymbol var, SubLObject newValue) {
    if (var.isDynamic()) {
      SubLObject oldValue = var.currentBinding(SubLProcess.currentSubLThread().bindingsList);
      var.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
      return oldValue;
    } else if (var.isGlobal()) {
      return Errors.error("Illegal attempt to dynamically bind a global symbol: " + var);
    } else {
      if (this == defaultEnvironment) {
        // The outermost environment must be immutable or we have to worry about synchronization issues. -APB
        Errors.error("Illegal ttempt to modify ther outermost environment.");
      }
      EnvironmentBinding varBinding = new EnvironmentBinding(var, newValue); // @todo resource these!!!!!!!!!! -APB
      bindingStack.add(varBinding);
      return null;
    }
  }
  
  public SubLObject lookupBinding(SubLSymbol var) {
    if (!var.isUndeclared()) {
      Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
    }
    // first try scanning through this environment
    for (int i = 0, size = bindingStack.size(); i < size; i++) {
      EnvironmentBinding currentBinding = bindingStack.get(i);
      if (currentBinding.getVar() == var) {
        return currentBinding.getValue();
      }
    }
    
    // then try scanning the outer environments
    if (outerEnvironment == null) {
      return var.getGlobalValue();
    } else {
      return outerEnvironment.lookupBinding(var);
    }
  }
  
  public void setBinding(SubLSymbol var, SubLObject value) {
    if (var.isDynamic()) {
      var.setDynamicValue(value);
      return;
    } else if (var.isGlobal()) {
      var.setGlobalValue(value);
      return;
    }
    // first try scanning through this environment
    for (int i = 0, size = bindingStack.size(); i < size; i++) {
      EnvironmentBinding currentBinding = bindingStack.get(i);
      if (currentBinding.getVar() == var) {
        currentBinding.setValue(value);
        return;
      }
    }

    // then try scanning the outer environments
    if (outerEnvironment == null) {
      if (var.isConstantSymbol()) {
        Errors.error("Can't set the value of constant symbol: " + this);
      } 
      var.forceGlobalValue(value);
    } else {
      outerEnvironment.setBinding(var, value);
    }
  }
  
  public int hashCode(int currentDepth) {
    return super.superHash();
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  /** Method created to avoid casting */
  public final SubLEnvironment toEnv() { // SubLEnvironment
    return this;
  }
    
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
  public final boolean isMacroOperator() { return false; }
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
  public final boolean isEnvironment() { return true; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  private static void noteDefaultBindings() {
  }
  
  private static final class EnvironmentBinding {
    // @todo consider merging with BindingState.Binding
    EnvironmentBinding(SubLSymbol var, SubLObject value) {
      this.var = var;
      this.value = value;
    }
    
    SubLSymbol getVar() {
      return var;
    }
    
    SubLObject getValue() {
      return value;
    }
    
    void setValue(SubLObject value) {
      this.value = value;
    }
    
    private final SubLSymbol var;
    private SubLObject value;
    
  }
  
  //// Internal Rep
  
  private final SubLEnvironment outerEnvironment;
  private final ArrayList<EnvironmentBinding> bindingStack = new ArrayList<EnvironmentBinding>();
  
  private static final SubLEnvironment defaultEnvironment = new SubLEnvironment(null);
  
  static { noteDefaultBindings(); }
  
}

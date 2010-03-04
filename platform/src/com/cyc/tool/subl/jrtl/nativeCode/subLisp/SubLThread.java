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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqlHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqualHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqualpHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;
import com.cyc.tool.subl.util.PatchFileLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class SubLThread extends Thread implements CommonSymbols {
  
  //// Constructors
  
  /**
   *
   * @param target
   * @param name
   */
  public SubLThread(Runnable target, String name) {
    super(target, name);
    init();
  }
  
  /**
   *
   * @param group
   * @param target
   * @param name
   */
  public SubLThread(ThreadGroup group, Runnable target, String name) {
    super(group, target, name);
    init();
  }
  
  /**
   *
   * @param group
   * @param target
   * @param name
   * @param stackSize
   */
  public SubLThread(ThreadGroup group, Runnable target, String name, long stackSize) {
    super(group, target, name, stackSize);
    init();
  }
  
  //// Public Area
  
  public void start() {
    launchContext = new Exception();
    super.start();
  }
  
  /**
   *
   * @return
   */
  public SubLProcess getSubLProcess() {
    return subLProcess;
  }
  
  public Resourcer getResourcer() { return resourcer; }
  
  public SubLObject[] getSubLObjectArraySize2() { return sublArraySize2; }
  
  
  /**
   *
   * @return
   */
  public Exception getLaunchContext() {
    return launchContext;
  }
  
  public void run() {
    try {
      super.run();
    } finally {
      assert (previousName != null);
      // cleanup
      ((SubLThread)Thread.currentThread()).setSubLProcess(null);
    }
  }
  
  public final SubLObject resetMultipleValues() {
    int size = valuesCount;
    if (size == 0) { return NIL; }
    valuesCount = 0;
    value1 = NIL;
    value2 = NIL;
    if (size < 3) { return NIL; }
    value3 = NIL;
    value4 = NIL;
    value5 = NIL;
    value6 = NIL;
    value7 = NIL;
    value8 = NIL;
    if (size < 9) { return NIL; }
    valuesArray.clear();
    return NIL;
  }
  
   public final SubLObject setFirstMultipleValue(final SubLObject value1) {
    if (valuesCount <= 0) {
      valuesCount = 1;
    }
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1) {
    valuesCount = 1;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2) {
    valuesCount = 2;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
        final SubLObject value3) {
    valuesCount = 3;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
        final SubLObject value3, final SubLObject value4) {
    valuesCount = 4;
    this.value4 = value4;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
        final SubLObject value3, final SubLObject value4, final SubLObject value5) {
    valuesCount = 5;
    this.value5 = value5;
    this.value4 = value4;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
      final SubLObject value3, final SubLObject value4,
      final SubLObject value5, final SubLObject value6) {
    valuesCount = 6;
    this.value6 = value6;
    this.value5 = value5;
    this.value4 = value4;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
      final SubLObject value3, final SubLObject value4,
      final SubLObject value5, final SubLObject value6, final SubLObject value7) {
    valuesCount = 7;
    this.value7 = value7;
    this.value6 = value6;
    this.value5 = value5;
    this.value4 = value4;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject value1, final SubLObject value2, 
      final SubLObject value3, final SubLObject value4, final SubLObject value5, 
      final SubLObject value6, final SubLObject value7, final SubLObject value8) {
    valuesCount = 8;
    this.value8 = value8;
    this.value7 = value7;
    this.value6 = value6;
    this.value5 = value5;
    this.value4 = value4;
    this.value3 = value3;
    this.value2 = value2;
    return this.value1 = value1;
  }
  
  public final SubLObject values(final SubLObject[] moreValues) {
    int size = valuesCount = moreValues.length;
    if (size == 0) { return NIL; }
    switch (size) {
      default:
      case 8:
        value8 = moreValues[7];
      case 7:
        value7 = moreValues[6];
      case 6:
        value6 = moreValues[5];
      case 5:
        value5 = moreValues[4];
      case 4:
        value4 = moreValues[3];
      case 3:
        value3 = moreValues[2];
      case 2:
        value2 = moreValues[1];
      case 1:
        value1 = moreValues[0];
    }
    for (int i = 8; i < size; i++) {
      valuesArray.add(moreValues[i]);
    }
    return moreValues[0];
  }
  
  public final SubLObject nthMultipleValue(final int n) {
    if (valuesCount < n) {
      return NIL;
    }
    switch (n) {
      case 0:
        return value1;
      case 1:
        return value2;
      case 2:
        return value3;
      case 3:
        return value4;
      case 4:
        return value5;
      case 5:
        return value6;
      case 6:
        return value7;
      case 7:
        return value8;
      default:
        if (n >= valuesCount) { return NIL; }
        return valuesArray.get(n - 8);
    }
  }
  
  public final SubLObject nthMultipleValue(final SubLObject n) {
    return nthMultipleValue(n.intValue());
  }
  
  public final SubLObject firstMultipleValue() {
    return (valuesCount < 1) ? NIL : value1;
  }
  
  public final SubLObject secondMultipleValue() {
    return (valuesCount < 2) ? NIL : value2;
  }
  
  public final SubLObject thirdMultipleValue() {
    return (valuesCount < 3) ? NIL : value3;
  }
  
  public final SubLObject fourthMultipleValue() {
    return (valuesCount < 4) ? NIL : value4;
  }
  
  public final SubLObject fifthMultipleValue() {
    return (valuesCount < 5) ? NIL : value5;
  }
  
  public final SubLObject sixthMultipleValue() {
    return (valuesCount < 6) ? NIL : value6;
  }
  
  public final SubLObject seventhMultipleValue() {
    return (valuesCount < 7) ? NIL : value7;
  }
  
  public final SubLObject eighthMultipleValue() {
    return (valuesCount < 8) ? NIL : value8;
  }
  
  public final SubLList multiple_value_list(SubLObject val1) {
    int size = valuesCount;
    if (size == 0) { size = 1; }
    SubLList result = NIL;
    List<SubLObject> valuesArray = this.valuesArray;
    for (int i = valuesArray.size() - 1; i >= 0; i--) {
      result = result.push(valuesArray.get(i));
    }
    switch (size) {
      default:
      case 8:
        result = result.push(value8);
      case 7:
        result = result.push(value7);
      case 6:
        result = result.push(value6);
      case 5:
        result = result.push(value5);
      case 4:
        result = result.push(value4);
      case 3:
        result = result.push(value3);
      case 2:
        result = result.push(value2);
      case 1:
        result = result.push(val1);
    }
    resetMultipleValues();
    return result;
  }
  
  public final SubLList getMultipleValues() {
    int size = valuesCount;
    if (size == 0) { return NIL; }
    SubLList result = NIL;
    List<SubLObject> valuesArray = this.valuesArray;
    for (int i = valuesArray.size() - 1; i >= 0; i--) {
      result = result.push(valuesArray.get(i));
    }
    switch (size) {
      default:
      case 8:
        result = result.push(value8);
      case 7:
        result = result.push(value7);
      case 6:
        result = result.push(value6);
      case 5:
        result = result.push(value5);
      case 4:
        result = result.push(value4);
      case 3:
        result = result.push(value3);
      case 2:
        result = result.push(value2);
      case 1:
        result = result.push(value1);
    }
    resetMultipleValues();
    return result;
  }
  
  public final SubLList multiple_value_list_eval(SubLObject form, SubLEnvironment env) {
    SubLList result;
    resetMultipleValues();
    result = multiple_value_list(form.eval(env));
    resetMultipleValues();
    return result;
  }
  
  /* helper method for MULTIPLE-VALUE-LIST */
  public SubLObject arg2(final SubLObject arg1, final SubLObject arg2) {
    return arg2;
  }
  
  /* helper method for NTH-VALUE */
  public final SubLObject nth_value_step_1(final SubLObject num) {
    resetMultipleValues();
    return num;
  }
  
  /* helper method for NTH-VALUE */
  public final SubLObject nth_value_step_2(final SubLObject num, final SubLObject form) {
    SubLObject result = nthMultipleValue(num.intValue());
    resetMultipleValues();
    return result;
  }
  
  public final SubLObject first_value_helper(final SubLObject arg1, final SubLObject result) {
    resetMultipleValues();
    return result;
  }
  
  public final SubLObject second_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value2;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject third_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value3;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject fourth_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value4;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject fifth_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value5;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject sixth_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value6;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject seventh_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value7;
    resetMultipleValues();
    return rslt;
  }
  
  public final SubLObject eighth_value_helper(final SubLObject arg1, final SubLObject result) {
    SubLObject rslt = value8;
    resetMultipleValues();
    return rslt;
  }
  
  
  //// Protected Area
  /**
   *
   * @param subLProcess passing in null indicates that we're done with this SubLProcess
   */
  public void setSubLProcess(SubLProcess subLProcess) {
    this.subLProcess = subLProcess;
    if (subLProcess != null) {
      previousName = getName();
      // also set the thread name, so it'll match up for debugging
      SubLString newSubLName = subLProcess.getName();
      String newJavaName = newSubLName.toString();
      setName(newJavaName);
    } else {
      setName(previousName == null ? "" : previousName);
    }
  }
  
  public void reset() {
    subLProcess = null;
    launchContext = null;
    resourcer = new Resourcer();
    clearBindings();
    Arrays.fill(sublArraySize1, null);
    Arrays.fill(sublArraySize2, null);
    Arrays.fill(sublArraySize3, null);
    Arrays.fill(sublArraySize4, null);
    Arrays.fill(sublArraySize5, null);
    hashtableEqKeyEntry.clear();
    hashtableEqlKeyEntry.clear();
    hashtableEqualKeyEntry.clear();
    hashtableEqualpKeyEntry.clear();
    valuesArray.clear();
    valuesCount = 0;
    value1 = SubLNil.NIL;
    value2 = SubLNil.NIL;
    value3 = SubLNil.NIL;
    value4 = SubLNil.NIL;
    value5 = SubLNil.NIL;
    value6 = SubLNil.NIL;
    value7 = SubLNil.NIL;
    value8 = SubLNil.NIL;
    env = SubLEnvironment.getDefaultEnvironment();
  }

  private void init() {
    setContextClassLoader(PatchFileLoader.PATCH_FILE_LOADER);
  }
  
  public void clearBindings() {
    Arrays.fill(bindingsList, null);
  }
  
  public static Object getInterruptLock() {
    return SubLProcess.currentSubLThread().interruptLock;
  }
  
  //// Private Area
  
  //// Internal Rep
  private Exception launchContext;
  private SubLProcess subLProcess;
  private Resourcer resourcer = new Resourcer();
  public final SubLObject[] sublArraySize1 = new SubLObject[1];
  public final SubLObject[] sublArraySize2 = new SubLObject[2];
  public final SubLObject[] sublArraySize3 = new SubLObject[3];
  public final SubLObject[] sublArraySize4 = new SubLObject[4];
  public final SubLObject[] sublArraySize5 = new SubLObject[5];
  public final SubLHashtableKeyEntry hashtableEqKeyEntry = new SubLEqHashtableKeyEntryImpl();
  public final SubLHashtableKeyEntry hashtableEqlKeyEntry = new SubLEqlHashtableKeyEntryImpl();
  public final SubLHashtableKeyEntry hashtableEqualKeyEntry = new SubLEqualHashtableKeyEntryImpl();
  public final SubLHashtableKeyEntry hashtableEqualpKeyEntry = new SubLEqualpHashtableKeyEntryImpl();
  public final SubLObject[] bindingsList = new SubLObject[MAX_DYNAMIC_BINDINGS];
  public static final int MAX_DYNAMIC_BINDINGS = 4096 * 2;
  public static final ComparatorGenericKey genericSortComparator = new ComparatorGenericKey(null, null);
  public static final ComparatorIdentityKey identitySortComparator = new ComparatorIdentityKey(null);
  public final byte[] byteBuffer = new byte[256];
  
  public final ArrayList<SubLObject> valuesArray = new ArrayList<SubLObject>(128);
  public int valuesCount = 0;
  public SubLObject value1 = SubLNil.NIL;
  public SubLObject value2 = SubLNil.NIL;
  public SubLObject value3 = SubLNil.NIL;
  public SubLObject value4 = SubLNil.NIL;
  public SubLObject value5 = SubLNil.NIL;
  public SubLObject value6 = SubLNil.NIL;
  public SubLObject value7 = SubLNil.NIL;
  public SubLObject value8 = SubLNil.NIL;
  public SubLEnvironment env = SubLEnvironment.getDefaultEnvironment();
  
  public final Object interruptLock = new Object();
  
  /**
   * We might reuse this thread for other purposes, so we want to
   * set the name to be the name of the SubLProcess while it's being
   * used to run that SubLProcess, but when we're done, we want to
   * reset it to the name it had beforehand, so this is the variable
   * where we stash that.
   */
  private String previousName;
  
  //// Main
  
  /**
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}

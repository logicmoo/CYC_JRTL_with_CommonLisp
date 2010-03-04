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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;

//// Internal Imports

//// External Imports

public  final class Values extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Values. */
  public Values() {}
  public static final SubLFile me = new Values();
  
  //// Public Area
  
  public static SubLSymbol $multiple_values_limit$;
  
  public static final SubLObject setFirstMultipleValue(final SubLObject value1) {
    return SubLProcess.currentSubLThread().setFirstMultipleValue(value1);
  }
  
  public static final SubLObject values(final SubLObject value1) {
    return SubLProcess.currentSubLThread().values(value1);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2) {
    return SubLProcess.currentSubLThread().values(value1, value2);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3, value4);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4, final SubLObject value5) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3, value4, value5);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4,
      final SubLObject value5, final SubLObject value6) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3, value4, value5, value6);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4,
      final SubLObject value5, final SubLObject value6, final SubLObject value7) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3, value4, value5, value6, value7);
  }
  
  public static final SubLObject values(final SubLObject value1, final SubLObject value2, final SubLObject value3, final SubLObject value4,
      final SubLObject value5, final SubLObject value6, final SubLObject value7, final SubLObject value8) {
    return SubLProcess.currentSubLThread().values(value1, value2, value3, value4, value5, value6, value7, value8);
  }
  
  public static final SubLObject values(final SubLObject[] moreValues) {
    return SubLProcess.currentSubLThread().values(moreValues);
  }
  
  /* helper methods for CMULTIPLE-VALUE-BIND */
  public static final void resetMultipleValues(final SubLThread thread) {
    thread.resetMultipleValues();
  }
  
  public static final SubLObject resetMultipleValues() {
    SubLProcess.currentSubLThread().resetMultipleValues();
    return NIL;
  }
  
  public static final SubLObject nthMultipleValue(final SubLThread thread, final int n) {
    return thread.nthMultipleValue(n);
  }
  
  public static final SubLObject nthMultipleValue(final SubLThread thread, final SubLObject n) {
    return thread.nthMultipleValue(n.intValue());
  }
  
  public static final SubLObject nthMultipleValue(final int n) {
    return SubLProcess.currentSubLThread().nthMultipleValue(n);
  }
  
  public static final SubLObject nthMultipleValue(final SubLObject n) {
    return SubLProcess.currentSubLThread().nthMultipleValue(n.intValue());
  }
  
  public static final SubLObject firstMultipleValue(final SubLThread thread) {
    return thread.firstMultipleValue();
  }
  
  public static final SubLObject firstMultipleValue() {
    return SubLProcess.currentSubLThread().firstMultipleValue();
  }
  
  public static final SubLObject secondMultipleValue(final SubLThread thread) {
    return thread.secondMultipleValue();
  }
  
  public static final SubLObject secondMultipleValue() {
    return SubLProcess.currentSubLThread().secondMultipleValue();
  }
  
  public static final SubLObject thirdMultipleValue(final SubLThread thread) {
    return thread.thirdMultipleValue();
  }
  
  public static final SubLObject thirdMultipleValue() {
    return SubLProcess.currentSubLThread().thirdMultipleValue();
  }
  
  
  public static final SubLObject fourthMultipleValue(final SubLThread thread) {
    return thread.fourthMultipleValue();
  }
  
  public static final SubLObject fourthMultipleValue() {
    return SubLProcess.currentSubLThread().fourthMultipleValue();
  }
  
  
  public static final SubLObject fifthMultipleValue(final SubLThread thread) {
    return thread.fifthMultipleValue();
  }
  
  public static final SubLObject fifthMultipleValue() {
    return SubLProcess.currentSubLThread().fifthMultipleValue();
  }
  
  public static final SubLObject sixthMultipleValue(final SubLThread thread) {
    return thread.sixthMultipleValue();
  }
  
  public static final SubLObject sixthMultipleValue() {
    return SubLProcess.currentSubLThread().sixthMultipleValue();
  }
  
  public static final SubLObject seventhMultipleValue(final SubLThread thread) {
    return thread.seventhMultipleValue();
  }
  
  public static final SubLObject seventhMultipleValue() {
    return SubLProcess.currentSubLThread().seventhMultipleValue();
  }
  
  public static final SubLObject eighthMultipleValue(final SubLThread thread) {
    return thread.eighthMultipleValue();
  }
  
  public static final SubLObject eighthMultipleValue() {
    return SubLProcess.currentSubLThread().eighthMultipleValue();
  }
  
  /* helper method for MULTIPLE-VALUE-LIST */
  public static final SubLList multiple_value_list(final SubLObject value1) {
    return SubLProcess.currentSubLThread().multiple_value_list(value1);
  }
  
  public static final SubLList getMultipleValues() {
    return SubLProcess.currentSubLThread().getMultipleValues();
  }
  
  public static final SubLList multiple_value_list_eval(final SubLObject form, final SubLEnvironment env) {
    return SubLProcess.currentSubLThread().multiple_value_list_eval(form, env);
  }
  
  /* helper method for MULTIPLE-VALUE-LIST */
  public static final SubLObject arg2(final SubLObject arg1, final SubLObject arg2) {
    return arg2;
  }
  
  /* helper method for NTH-VALUE */
  public static final SubLObject nth_value_step_1(final SubLObject num) {
    return SubLProcess.currentSubLThread().nth_value_step_1(num);
  }
  
  /* helper method for NTH-VALUE */
  public static final SubLObject nth_value_step_2(final SubLObject num, final SubLObject form) {
    return SubLProcess.currentSubLThread().nth_value_step_2(num, form);
  }
  
  public static final SubLObject first_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().first_value_helper(arg1, result);
  }
  
  public static final SubLObject second_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().second_value_helper(arg1, result);
  }
  
  public static final SubLObject third_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().third_value_helper(arg1, result);
  }
  
  public static final SubLObject fourth_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().fourth_value_helper(arg1, result);
  }
  
  public static final SubLObject fifth_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().fifth_value_helper(arg1, result);
  }
  
  public static final SubLObject sixth_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().sixth_value_helper(arg1, result);
  }
  
  public static final SubLObject seventh_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().seventh_value_helper(arg1, result);
  }
  
  public static final SubLObject eighth_value_helper(final SubLObject arg1, final SubLObject result) {
    return SubLProcess.currentSubLThread().eighth_value_helper(arg1, result);
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "values", "VALUES", 0, 0, true);
  }
  
  public void initializeVariables() {
    // @note this is arbitrary...number of mult values is really only limited by max arraylist size which is extremely high -APB
    $multiple_values_limit$ = SubLFiles.defconstant(me, "*MULTIPLE-VALUES-LIMIT*", SubLObjectFactory.makeInteger(1024));
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

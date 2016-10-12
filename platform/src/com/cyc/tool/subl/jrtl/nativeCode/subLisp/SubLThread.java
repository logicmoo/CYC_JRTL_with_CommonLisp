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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqlHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqualHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLEqualpHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;
import com.cyc.tool.subl.util.PatchFileLoader;

public class SubLThread extends Thread implements CommonSymbols {

	//// Constructors

	final public byte[] byteBufferLarge = new byte[16 * 1024];

	public static int MAX_DYNAMIC_BINDINGS = 4096 * 2;

	public static ComparatorGenericKey genericSortComparator = new ComparatorGenericKey(null, null);

	public static ComparatorIdentityKey identitySortComparator = new ComparatorIdentityKey(null);

	//// Public Area

	public static Object getInterruptLock() {
		return SubLProcess.currentSubLThread().interruptLock;
	}

	/**
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	//// Internal Rep
	private Exception launchContext;

	private SubLProcess subLProcess;

	private Resourcer resourcer = new Resourcer();

	public SubLObject[] sublArraySize1 = new SubLObject[1];

	public SubLObject[] sublArraySize2 = new SubLObject[2];

	public SubLObject[] sublArraySize3 = new SubLObject[3];

	public SubLObject[] sublArraySize4 = new SubLObject[4];

	public SubLObject[] sublArraySize5 = new SubLObject[5];

	public SubLHashtableKeyEntry hashtableEqKeyEntry = new SubLEqHashtableKeyEntryImpl();

	public SubLHashtableKeyEntry hashtableEqlKeyEntry = new SubLEqlHashtableKeyEntryImpl();

	public SubLHashtableKeyEntry hashtableEqualKeyEntry = new SubLEqualHashtableKeyEntryImpl();

	public SubLHashtableKeyEntry hashtableEqualpKeyEntry = new SubLEqualpHashtableKeyEntryImpl();

	public SubLObject[] bindingsList = new SubLObject[SubLThread.MAX_DYNAMIC_BINDINGS];

	public byte[] byteBuffer = new byte[256];

	public ArrayList<SubLObject> valuesArray = new ArrayList<SubLObject>(128);

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
	public Deque<SubLObject> throwStack = new ArrayDeque<SubLObject>();
	public Object interruptLock = new Object();

	/**
	 * We might reuse this thread for other purposes, so we want to set the name
	 * to be the name of the SubLProcess while it's being used to run that
	 * SubLProcess, but when we're done, we want to reset it to the name it had
	 * beforehand, so this is the variable where we stash that.
	 */
	private String previousName;

	/**
	 *
	 * @param target
	 * @param name
	 */
	public SubLThread(Runnable target, String name) {
		super(target, name);
		this.init();
	}

	/**
	 *
	 * @param group
	 * @param target
	 * @param name
	 */
	public SubLThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		this.init();
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
		this.init();
	}

	/* helper method for MULTIPLE-VALUE-LIST */
	public SubLObject arg2(SubLObject arg1, SubLObject arg2) {
		return arg2;
	}

	public void clearBindings() {
		Arrays.fill(this.bindingsList, null);
	}

	public SubLObject eighth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value8;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject eighthMultipleValue() {
		return this.valuesCount < 8 ? CommonSymbols.NIL : this.value8;
	}

	public SubLObject fifth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value5;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject fifthMultipleValue() {
		return this.valuesCount < 5 ? CommonSymbols.NIL : this.value5;
	}

	public SubLObject first_value_helper(SubLObject arg1, SubLObject result) {
		this.resetMultipleValues();
		return result;
	}

	public SubLObject firstMultipleValue() {
		return this.valuesCount < 1 ? CommonSymbols.NIL : this.value1;
	}

	public SubLObject fourth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value4;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject fourthMultipleValue() {
		return this.valuesCount < 4 ? CommonSymbols.NIL : this.value4;
	}

	/**
	 *
	 * @return
	 */
	public Exception getLaunchContext() {
		return this.launchContext;
	}

	public SubLList getMultipleValues() {
		int size = this.valuesCount;
		if (size == 0)
			return CommonSymbols.NIL;
		SubLList result = CommonSymbols.NIL;
		List<SubLObject> valuesArray = this.valuesArray;
		for (int i = valuesArray.size() - 1; i >= 0; i--)
			result = result.push(valuesArray.get(i));
		switch (size) {
		default:
		case 8:
			result = result.push(this.value8);
		case 7:
			result = result.push(this.value7);
		case 6:
			result = result.push(this.value6);
		case 5:
			result = result.push(this.value5);
		case 4:
			result = result.push(this.value4);
		case 3:
			result = result.push(this.value3);
		case 2:
			result = result.push(this.value2);
		case 1:
			result = result.push(this.value1);
		}
		this.resetMultipleValues();
		return result;
	}

	public Resourcer getResourcer() {
		return this.resourcer;
	}

	public SubLObject[] getSubLObjectArraySize2() {
		return this.sublArraySize2;
	}

	//// Private Area

	/**
	 *
	 * @return
	 */
	public SubLProcess getSubLProcess() {
		return this.subLProcess;
	}

	public List<SubLObject> getValuesAsList() {
		if (this.valuesCount == 0)
			return null;
		ArrayList result = new ArrayList(this.valuesCount);
		int count = 0;
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value1);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value2);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value3);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value4);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value5);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value6);
		if (count++ >= this.valuesCount)
			return result;
		result.add(this.value7);
		if (count++ < this.valuesCount) {
			result.add(this.value8);
			result.addAll(this.valuesArray);
			return result;
		}
		return result;
	}

	public SubLVector getValuesAsVector() {
		if (this.valuesCount == 0)
			return null;
		SubLVector result = SubLObjectFactory.makeVector(this.valuesCount);
		int count = 0;
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value1);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value2);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value3);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value4);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value5);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value6);
		if (count >= this.valuesCount)
			return result;
		result.set(count++, this.value7);
		if (count < this.valuesCount) {
			result.set(count++, this.value8);
			for (int i = 0, size = this.valuesArray.size(); i < size; ++i)
				result.set(count++, this.valuesArray.get(i));
			return result;
		}
		return result;
	}

	private void init() {
		this.setContextClassLoader(PatchFileLoader.PATCH_FILE_LOADER);
	}

	public SubLList multiple_value_list(SubLObject val1) {
		int size = this.valuesCount;
		if (size == 0)
			size = 1;
		SubLList result = CommonSymbols.NIL;
		List<SubLObject> valuesArray = this.valuesArray;
		for (int i = valuesArray.size() - 1; i >= 0; i--)
			result = result.push(valuesArray.get(i));
		switch (size) {
		default:
		case 8:
			result = result.push(this.value8);
		case 7:
			result = result.push(this.value7);
		case 6:
			result = result.push(this.value6);
		case 5:
			result = result.push(this.value5);
		case 4:
			result = result.push(this.value4);
		case 3:
			result = result.push(this.value3);
		case 2:
			result = result.push(this.value2);
		case 1:
			result = result.push(val1);
		}
		this.resetMultipleValues();
		return result;
	}

	public SubLList multiple_value_list_eval(SubLObject form, SubLEnvironment env) {
		SubLList result;
		this.resetMultipleValues();
		result = this.multiple_value_list(form.eval(env));
		this.resetMultipleValues();
		return result;
	}

	/* helper method for NTH-VALUE */
	public SubLObject nth_value_step_1(SubLObject num) {
		this.resetMultipleValues();
		return num;
	}

	/* helper method for NTH-VALUE */
	public SubLObject nth_value_step_2(SubLObject num, SubLObject form) {
		SubLObject result = this.nthMultipleValue(num.intValue());
		this.resetMultipleValues();
		return result;
	}

	public SubLObject nthMultipleValue(int n) {
		if (this.valuesCount < n)
			return CommonSymbols.NIL;
		switch (n) {
		case 0:
			return this.value1;
		case 1:
			return this.value2;
		case 2:
			return this.value3;
		case 3:
			return this.value4;
		case 4:
			return this.value5;
		case 5:
			return this.value6;
		case 6:
			return this.value7;
		case 7:
			return this.value8;
		default:
			if (n >= this.valuesCount)
				return CommonSymbols.NIL;
			return this.valuesArray.get(n - 8);
		}
	}

	public SubLObject nthMultipleValue(SubLObject n) {
		return this.nthMultipleValue(n.intValue());
	}

	public void reset() {
		this.subLProcess = null;
		this.launchContext = null;
		this.resourcer = new Resourcer();
		this.clearBindings();
		Arrays.fill(this.sublArraySize1, null);
		Arrays.fill(this.sublArraySize2, null);
		Arrays.fill(this.sublArraySize3, null);
		Arrays.fill(this.sublArraySize4, null);
		Arrays.fill(this.sublArraySize5, null);
		this.hashtableEqKeyEntry.clear();
		this.hashtableEqlKeyEntry.clear();
		this.hashtableEqualKeyEntry.clear();
		this.hashtableEqualpKeyEntry.clear();
		this.valuesArray.clear();
		this.valuesCount = 0;
		this.value1 = SubLNil.NIL;
		this.value2 = SubLNil.NIL;
		this.value3 = SubLNil.NIL;
		this.value4 = SubLNil.NIL;
		this.value5 = SubLNil.NIL;
		this.value6 = SubLNil.NIL;
		this.value7 = SubLNil.NIL;
		this.value8 = SubLNil.NIL;
		this.throwStack.clear();
		this.env = SubLEnvironment.getDefaultEnvironment();
	}

	public SubLObject resetMultipleValues() {
		int size = this.valuesCount;
		if (size == 0)
			return CommonSymbols.NIL;
		this.valuesCount = 0;
		this.value1 = CommonSymbols.NIL;
		this.value2 = CommonSymbols.NIL;
		if (size < 3)
			return CommonSymbols.NIL;
		this.value3 = CommonSymbols.NIL;
		this.value4 = CommonSymbols.NIL;
		this.value5 = CommonSymbols.NIL;
		this.value6 = CommonSymbols.NIL;
		this.value7 = CommonSymbols.NIL;
		this.value8 = CommonSymbols.NIL;
		if (size < 9)
			return CommonSymbols.NIL;
		this.valuesArray.clear();
		return CommonSymbols.NIL;
	}

	public void restoreValuesFromList(List<SubLObject> newValues) {
		if (newValues == null) {
			this.resetMultipleValues();
			return;
		}
		this.valuesArray.clear();
		this.valuesCount = newValues.size();
		int count = 0;
		if (count >= this.valuesCount)
			return;
		this.value1 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value2 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value3 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value4 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value5 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value6 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value7 = newValues.get(count++);
		if (count < this.valuesCount) {
			this.value8 = newValues.get(count++);
			for (int i = 8, size = newValues.size(); i < size; ++i)
				this.valuesArray.add(newValues.get(i));
		}
	}

	public void restoreValuesFromVector(SubLVector newValues) {
		if (newValues == null) {
			this.resetMultipleValues();
			return;
		}
		this.valuesArray.clear();
		this.valuesCount = newValues.size();
		int count = 0;
		if (count >= this.valuesCount)
			return;
		this.value1 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value2 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value3 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value4 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value5 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value6 = newValues.get(count++);
		if (count >= this.valuesCount)
			return;
		this.value7 = newValues.get(count++);
		if (count < this.valuesCount) {
			this.value8 = newValues.get(count++);
			for (int i = 8, size = newValues.size(); i < size; ++i)
				this.valuesArray.add(newValues.get(i));
		}
	}

	public void run() {
		try {
			super.run();
		} finally {
			assert this.previousName != null;
			// cleanup
			((SubLThread) Thread.currentThread()).setSubLProcess(null);
		}
	}

	public SubLObject second_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value2;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject secondMultipleValue() {
		return this.valuesCount < 2 ? CommonSymbols.NIL : this.value2;
	}

	public SubLObject setFirstMultipleValue(SubLObject value1) {
		if (this.valuesCount <= 0)
			this.valuesCount = 1;
		return this.value1 = value1;
	}

	//// Protected Area
	/**
	 *
	 * @param subLProcess
	 *            passing in null indicates that we're done with this
	 *            SubLProcess
	 */
	public void setSubLProcess(SubLProcess subLProcess) {
		this.subLProcess = subLProcess;
		if (subLProcess != null) {
			this.previousName = this.getName();
			// also set the thread name, so it'll match up for debugging
			SubLString newSubLName = subLProcess.getName();
			String newJavaName = newSubLName.toString();
			this.setName(newJavaName);
		} else
			this.setName(this.previousName == null ? "" : this.previousName);
	}

	public SubLObject seventh_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value7;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject seventhMultipleValue() {
		return this.valuesCount < 7 ? CommonSymbols.NIL : this.value7;
	}

	public SubLObject sixth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value6;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject sixthMultipleValue() {
		return this.valuesCount < 6 ? CommonSymbols.NIL : this.value6;
	}

	public void start() {
		this.launchContext = new Exception();
		super.start();
	}

	public SubLObject third_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = this.value3;
		this.resetMultipleValues();
		return rslt;
	}

	public SubLObject thirdMultipleValue() {
		return this.valuesCount < 3 ? CommonSymbols.NIL : this.value3;
	}

	public SubLObject values(SubLObject value1) {
		this.valuesCount = 1;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2) {
		this.valuesCount = 2;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3) {
		this.valuesCount = 3;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4) {
		this.valuesCount = 4;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5) {
		this.valuesCount = 5;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5, SubLObject value6) {
		this.valuesCount = 6;
		this.value6 = value6;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5, SubLObject value6, SubLObject value7) {
		this.valuesCount = 7;
		this.value7 = value7;
		this.value6 = value6;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5, SubLObject value6, SubLObject value7, SubLObject value8) {
		this.valuesCount = 8;
		this.value8 = value8;
		this.value7 = value7;
		this.value6 = value6;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	//// Main

	public SubLObject values(SubLObject[] moreValues) {
		int size = this.valuesCount = moreValues.length;
		if (size == 0)
			return CommonSymbols.NIL;
		switch (size) {
		default:
		case 8:
			this.value8 = moreValues[7];
		case 7:
			this.value7 = moreValues[6];
		case 6:
			this.value6 = moreValues[5];
		case 5:
			this.value5 = moreValues[4];
		case 4:
			this.value4 = moreValues[3];
		case 3:
			this.value3 = moreValues[2];
		case 2:
			this.value2 = moreValues[1];
		case 1:
			this.value1 = moreValues[0];
		}
		for (int i = 8; i < size; i++)
			this.valuesArray.add(moreValues[i]);
		return moreValues[0];
	}

}

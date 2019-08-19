/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispThread;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
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

final public class SubLThread extends Thread {

	public final class OverPoppableDeque extends ArrayDeque<SubLObject> {
		@Override
		public SubLObject pop() {
			try {
				return super.pop();
			} catch (Throwable e) {
				// e.printStackTrace();
				return Lisp.NIL;
			}
		}
	}

	public LispThread lispThread;

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 */
	public LispThread getLispThread() {

		if (lispThread == null) {
			lispThread = LispThread.map.get(this);
			if (lispThread == null) {
				lispThread = LispThread.currentThread();
			}
		}
		return lispThread;
	}

	/**
	 * Interrupts this thread.
	 *
	 * <p>
	 * Unless the current thread is interrupting itself, which is always permitted,
	 * the {@link #checkAccess() checkAccess} method of this thread is invoked,
	 * which may cause a {@link SecurityException} to be thrown.
	 *
	 * <p>
	 * If this thread is blocked in an invocation of the {@link Object#wait()
	 * wait()}, {@link Object#wait(long) wait(long)}, or
	 * {@link Object#wait(long, int) wait(long, int)} methods of the {@link Object}
	 * class, or of the {@link #join()}, {@link #join(long)},
	 * {@link #join(long, int)}, {@link #sleep(long)}, or {@link #sleep(long, int)},
	 * methods of this class, then its interrupt status will be cleared and it will
	 * receive an {@link InterruptedException}.
	 *
	 * <p>
	 * If this thread is blocked in an I/O operation upon an
	 * {@link java.nio.channels.InterruptibleChannel InterruptibleChannel} then the
	 * channel will be closed, the thread's interrupt status will be set, and the
	 * thread will receive a {@link java.nio.channels.ClosedByInterruptException}.
	 *
	 * <p>
	 * If this thread is blocked in a {@link java.nio.channels.Selector} then the
	 * thread's interrupt status will be set and it will return immediately from the
	 * selection operation, possibly with a non-zero value, just as if the
	 * selector's {@link java.nio.channels.Selector#wakeup wakeup} method were
	 * invoked.
	 *
	 * <p>
	 * If none of the previous conditions hold then this thread's interrupt status
	 * will be set.
	 * </p>
	 *
	 * <p>
	 * Interrupting a thread that is not alive need not have any effect.
	 *
	 * @throws SecurityException if the current thread cannot modify this thread
	 *
	 * @revised 6.0
	 * @spec JSR-51
	 */
	@Override
	public void interrupt() {
		super.interrupt();
	}

	public Thread asJavaTread() {
		return intoJavaThread(this);
	}

	public static boolean isSubLThread(Object currentThread) {
		if ((currentThread instanceof SubLThread)) { //
			assert ((currentThread.getClass() == SubLThread.class));
			return true;
		}
		return false;
	}

	@Override
	public void start() {
		launchContext = new Exception();
		super.start();
	}

	// public String getName()
	// {
	// return super.getName();
	// }
	//
	// public void setName(String newJavaName)
	// {
	// super.setName(newJavaName);
	//
	// }
	//
	// public void setPriority(int subLPriorityToJavaPriority)
	// {
	// super.setPriority(subLPriorityToJavaPriority);
	//
	// }

	@Override
	public boolean isInterrupted() {
		return super.isInterrupted();
	}

	public static Thread currentJavaThread() {
		SubLThread subLThread = SubLProcess.currentSubLThreadOrNull();
		if (subLThread != null)
			return subLThread.asJavaTread();
		return Thread.currentThread();
	}

	public static SubLThread intoSubLThread(Thread myGetOwner) {
		return (SubLThread) myGetOwner;
	}

	public static Thread intoJavaThread(SubLThread myGetOwner) {
		return myGetOwner;
	}

	@Override
	public void setContextClassLoader(ClassLoader cl) {
		super.setContextClassLoader(cl);
	}

	@Override
	public ClassLoader getContextClassLoader() {
		return super.getContextClassLoader();
	}

	/**
	 * Returns a reference to the currently executing thread object.
	 *
	 * @return the currently executing thread.
	 */
	public static Thread currentThread() {
		final Thread currentThread = Thread.currentThread();
		return currentThread;
	}

	public static boolean currentThreadIsSubL() {
		final Thread currentThread = Thread.currentThread();
		return isSubLThread(currentThread);
	}

	public SubLThread(Runnable target, String name) {
		super(target, name);
		init();
	}

	public SubLThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		init();
	}

	public SubLThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		init();
	}

	public static Object getInterruptLock() {
		return SubLProcess.currentSubLThread().interruptLock;
	}

	public static void main(String[] args) {
	}

	private volatile Exception launchContext;
	private volatile SubLProcess subLProcess;
	private Resourcer resourcer;
	public SubLObject[] sublArraySize1;
	public SubLObject[] sublArraySize2;
	public SubLObject[] sublArraySize3;
	public SubLObject[] sublArraySize4;
	public SubLObject[] sublArraySize5;
	public SubLHashtable.SubLHashtableKeyEntry hashtableEqKeyEntry;
	public SubLHashtable.SubLHashtableKeyEntry hashtableEqlKeyEntry;
	public SubLHashtable.SubLHashtableKeyEntry hashtableEqualKeyEntry;
	public SubLHashtable.SubLHashtableKeyEntry hashtableEqualpKeyEntry;
	public SubLObject[] bindingsList;
	public byte[] byteBuffer;
	public byte[] byteBufferLarge;
	public ArrayList<SubLObject> valuesArray;
	public int valuesCount;
	public SubLObject value1;
	public SubLObject value2;
	public SubLObject value3;
	public SubLObject value4;
	public SubLObject value5;
	public SubLObject value6;
	public SubLObject value7;
	public SubLObject value8;
	public org.armedbear.lisp.Environment env;
	public Deque<SubLObject> throwStack;
	public Object interruptLock;
	private volatile String previousName;
	public static int MAX_DYNAMIC_BINDINGS = 16384;
	final public static ComparatorGenericKey genericSortComparator = new ComparatorGenericKey(null, null);
	final public static ComparatorIdentityKey identitySortComparator = new ComparatorIdentityKey(null);

	private void init() {
		setContextClassLoader(PatchFileLoader.PATCH_FILE_LOADER);
		resourcer = new Resourcer();
		sublArraySize1 = new SubLObject[1];
		sublArraySize2 = new SubLObject[2];
		sublArraySize3 = new SubLObject[3];
		sublArraySize4 = new SubLObject[4];
		sublArraySize5 = new SubLObject[5];
		hashtableEqKeyEntry = new SubLHashtable.SubLEqHashtableKeyEntryImpl();
		hashtableEqlKeyEntry = new SubLHashtable.SubLEqlHashtableKeyEntryImpl();
		hashtableEqualKeyEntry = new SubLHashtable.SubLEqualHashtableKeyEntryImpl();
		hashtableEqualpKeyEntry = new SubLHashtable.SubLEqualpHashtableKeyEntryImpl();
		bindingsList = new SubLObject[MAX_DYNAMIC_BINDINGS];
		byteBuffer = new byte[256];
		byteBufferLarge = new byte[16384];
		valuesArray = new ArrayList<SubLObject>(128);
		valuesCount = 0;
		value1 = SubLNil.NIL;
		value2 = SubLNil.NIL;
		value3 = SubLNil.NIL;
		value4 = SubLNil.NIL;
		value5 = SubLNil.NIL;
		value6 = SubLNil.NIL;
		value7 = SubLNil.NIL;
		value8 = SubLNil.NIL;
		env = (Environment) SubLEnvironment.getDefaultEnvironment();
		throwStack = new OverPoppableDeque();
		interruptLock = new Object();
	}

	public SubLObject arg2(SubLObject arg1, SubLObject arg2) {
		return arg2;
	}

	public void clearBindings() {
		// getLispThread().clearBindings();
		Arrays.fill(bindingsList, null);
	}

	public SubLObject eighth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value8;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject eighthMultipleValue() {
		return valuesCount < 8 ? SubLNil.NIL : value8;
	}

	public SubLObject fifth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value5;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject fifthMultipleValue() {
		return valuesCount < 5 ? SubLNil.NIL : value5;
	}

	public SubLObject first_value_helper(SubLObject arg1, SubLObject result) {
		resetMultipleValues();
		return result;
	}

	public SubLObject firstMultipleValue() {
		return valuesCount < 1 ? SubLNil.NIL : value1;
	}

	public SubLObject fourth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value4;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject fourthMultipleValue() {
		return valuesCount < 4 ? SubLNil.NIL : value4;
	}

	public Exception getLaunchContext() {
		return launchContext;
	}

	public SubLList getMultipleValues() {
		int size = valuesCount;
		if (size == 0)
			return SubLNil.NIL;
		SubLList result = SubLNil.NIL;
		List<SubLObject> valuesArrayInt = valuesArray;
		for (int i = valuesArrayInt.size() - 1; i >= 0; --i)
			result = result.push(valuesArrayInt.get(i));
		switch (size) {
		default:
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
			resetMultipleValues();
			return result;
		}
	}

	public Resourcer getResourcer() {
		return resourcer;
	}

	public SubLObject[] getSubLObjectArraySize2() {
		return sublArraySize2;
	}

	public SubLProcess getSubLProcess() {
		return subLProcess;
	}

	public List<SubLObject> getValuesAsList() {
		if (valuesCount == 0)
			return null;
		ArrayList result = new ArrayList(valuesCount);
		int count = 0;
		if (count++ >= valuesCount)
			return result;
		result.add(value1);
		if (count++ >= valuesCount)
			return result;
		result.add(value2);
		if (count++ >= valuesCount)
			return result;
		result.add(value3);
		if (count++ >= valuesCount)
			return result;
		result.add(value4);
		if (count++ >= valuesCount)
			return result;
		result.add(value5);
		if (count++ >= valuesCount)
			return result;
		result.add(value6);
		if (count++ >= valuesCount)
			return result;
		result.add(value7);
		if (count++ < valuesCount) {
			result.add(value8);
			result.addAll(valuesArray);
			return result;
		}
		return result;
	}

	public SubLVector getValuesAsVector() {
		if (valuesCount == 0)
			return null;
		SubLVector result = SubLObjectFactory.makeVector(valuesCount);
		int count = 0;
		if (count >= valuesCount)
			return result;
		result.set(count++, value1);
		if (count >= valuesCount)
			return result;
		result.set(count++, value2);
		if (count >= valuesCount)
			return result;
		result.set(count++, value3);
		if (count >= valuesCount)
			return result;
		result.set(count++, value4);
		if (count >= valuesCount)
			return result;
		result.set(count++, value5);
		if (count >= valuesCount)
			return result;
		result.set(count++, value6);
		if (count >= valuesCount)
			return result;
		result.set(count++, value7);
		if (count < valuesCount) {
			result.set(count++, value8);
			for (int i = 0, size = valuesArray.size(); i < size; ++i)
				result.set(count++, valuesArray.get(i));
			return result;
		}
		return result;
	}

	public SubLList multiple_value_list(SubLObject val1) {
		int size = valuesCount;
		if (size == 0)
			size = 1;
		SubLList result = SubLNil.NIL;
		List<SubLObject> valuesArray = this.valuesArray;
		for (int i = valuesArray.size() - 1; i >= 0; --i)
			result = result.push(valuesArray.get(i));
		switch (size) {
		default:
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
			resetMultipleValues();
			return result;
		}
	}

	public SubLList multiple_value_list_eval(SubLObject form, SubLEnvironment env) {
		resetMultipleValues();
		SubLList result = multiple_value_list(form.eval(env));
		resetMultipleValues();
		return result;
	}

	public SubLObject nth_value_step_1(SubLObject num) {
		resetMultipleValues();
		return num;
	}

	public SubLObject nth_value_step_2(SubLObject num, SubLObject form) {
		SubLObject result = this.nthMultipleValue(num.intValue());
		resetMultipleValues();
		return result;
	}

	public SubLObject nthMultipleValue(int n) {
		if (valuesCount < n)
			return SubLNil.NIL;
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
			if (n >= valuesCount)
				return SubLNil.NIL;
			return valuesArray.get(n - 8);
		}
	}

	public SubLObject nthMultipleValue(SubLObject n) {
		return this.nthMultipleValue(n.intValue());
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
		final SubLNil nil = SubLNil.NIL;
		value1 = nil;
		value2 = nil;
		value3 = nil;
		value4 = nil;
		value5 = nil;
		value6 = nil;
		value7 = nil;
		value8 = nil;
		throwStack.clear();
		env = (Environment) SubLEnvironment.getDefaultEnvironment();
	}

	public SubLObject resetMultipleValues() {
		int size = valuesCount;
		final SubLNil nil = SubLNil.NIL;
		if (size == 0)
			return nil;
		valuesCount = 0;
		value1 = nil;
		value2 = nil;
		if (size < 3)
			return nil;
		value3 = nil;
		value4 = nil;
		value5 = nil;
		value6 = nil;
		value7 = nil;
		value8 = nil;
		if (size < 9)
			return nil;
		valuesArray.clear();
		return nil;
	}

	public void restoreValuesFromList(List<SubLObject> newValues) {
		if (newValues == null) {
			resetMultipleValues();
			return;
		}
		valuesArray.clear();
		valuesCount = newValues.size();
		int count = 0;
		if (count >= valuesCount)
			return;
		value1 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value2 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value3 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value4 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value5 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value6 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value7 = newValues.get(count++);
		if (count < valuesCount) {
			value8 = newValues.get(count++);
			for (int i = 8, size = newValues.size(); i < size; ++i)
				valuesArray.add(newValues.get(i));
		}
	}

	public void restoreValuesFromVector(SubLVector newValues) {
		if (newValues == null) {
			resetMultipleValues();
			return;
		}
		valuesArray.clear();
		valuesCount = newValues.size();
		int count = 0;
		if (count >= valuesCount)
			return;
		value1 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value2 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value3 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value4 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value5 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value6 = newValues.get(count++);
		if (count >= valuesCount)
			return;
		value7 = newValues.get(count++);
		if (count < valuesCount) {
			value8 = newValues.get(count++);
			for (int i = 8, size = newValues.size(); i < size; ++i)
				valuesArray.add(newValues.get(i));
		}
	}

	// @Override
	@Override
	public void run() {
		try {
			// TODO? Main.setSubLisp(true);
			super.run();
		} catch (Throwable t) {
			t.printStackTrace(SystemCurrent.originalSystemErr);
		} finally {
			assert previousName != null;
			SubLProcess.currentSubLThread().setSubLProcess(null);
		}
	}

	public SubLObject second_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value2;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject secondMultipleValue() {
		return valuesCount < 2 ? SubLNil.NIL : value2;
	}

	public SubLObject setFirstMultipleValue(SubLObject value1) {
		if (valuesCount <= 0)
			valuesCount = 1;
		return this.value1 = value1;
	}

	public void setSubLProcess(SubLProcess subLProcess) {
		this.subLProcess = subLProcess;
		if (subLProcess != null) {
			previousName = getName();
			SubLString newSubLName = subLProcess.getName();
			String newJavaName = newSubLName.getStringValue();
			setName(newJavaName);
		} else
			setName(previousName == null ? "" : previousName);
	}

	public SubLObject seventh_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value7;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject seventhMultipleValue() {
		return valuesCount < 7 ? SubLNil.NIL : value7;
	}

	public SubLObject sixth_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value6;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject sixthMultipleValue() {
		return valuesCount < 6 ? SubLNil.NIL : value6;
	}

	public SubLObject third_value_helper(SubLObject arg1, SubLObject result) {
		SubLObject rslt = value3;
		resetMultipleValues();
		return rslt;
	}

	public SubLObject thirdMultipleValue() {
		return valuesCount < 3 ? SubLNil.NIL : value3;
	}

	public SubLObject values(SubLObject value1) {
		valuesCount = 1;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2) {
		valuesCount = 2;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3) {
		valuesCount = 3;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4) {
		valuesCount = 4;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5) {
		valuesCount = 5;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5, SubLObject value6) {
		valuesCount = 6;
		this.value6 = value6;
		this.value5 = value5;
		this.value4 = value4;
		this.value3 = value3;
		this.value2 = value2;
		return this.value1 = value1;
	}

	public SubLObject values(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4,
			SubLObject value5, SubLObject value6, SubLObject value7) {
		valuesCount = 7;
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

	public SubLObject values(SubLObject[] moreValues) {
		int length = moreValues.length;
		valuesCount = length;
		int size = length;
		if (size == 0)
			return SubLNil.NIL;
		switch (size) {
		default:
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
			for (int i = 8; i < size; ++i)
				valuesArray.add(moreValues[i]);
			return moreValues[0];
		}
	}

	public SubLObject[] getBindingsList() {
		return bindingsList;
	}

	public void setBindingsList(SubLObject[] bindingsList) {
		this.bindingsList = bindingsList;
	}

}

/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SafeRunnable;

public abstract class SubLProcess extends SafeRunnable implements Runnable, SubLObject {

	static {

	}
    @Override
    public SubLProcess toLispObject() {
        return this;
    }

    public static class DefaultThunk implements Thunk {
        public DefaultThunk(SubLObject function) {
            this(function, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
        }

        public DefaultThunk(SubLObject function, SubLObject[] arguments) {
            this.function = function;
            this.arguments = arguments;
            sender = SubLThread.currentJavaThread();
        }

        public static Thunk requestTaskTermination() {
            return new InterruptReadLoopThunk();
        }

        public static Thunk requestTermination() {
            return new DefaultThunk(CommonSymbols.KILL_KEYWORD);
        }

        private SubLObject function;
        private SubLObject[] arguments;
        private Thread sender;

        public Thread getSender() {
            return sender;
        }

        @Override
        public SubLObject invoke() {
            SubLFunction func = function.getFunc();
            SubLObject result = Functions.funcall(func, arguments);
            return result;
        }

        @Override
        public boolean isTerminationRequest() {
            return function.eql(CommonSymbols.KILL_KEYWORD);
        }
    }

    public static class InterruptReadLoopThunk implements Thunk {
        @Override
        public SubLObject invoke() {
            throw new ResumeException();
        }

        @Override
        public boolean isTerminationRequest() {
            return false;
        }
    }

    public static class NeverTimesOut implements TimeOut {
        public static TimeOut NO_TIMEOUT;
        static {
            NO_TIMEOUT = new NeverTimesOut();
        }

        @Override
        public boolean hasTimeoutArrived() {
            return false;
        }
    }

    public static class SubLProcessState {
        private SubLProcessState(String name) {
            state = SubLObjectFactory.makeString(name);
        }

        public SubLString state;
        public SubLSymbol stateSymbol;

        @Override
        public String toString() {
            return state.toString();
        }

        public SubLString toSubLString() {
            return state;
        }

        public SubLSymbol toSymbol() {
            if (stateSymbol == null)
                stateSymbol = SubLObjectFactory.makeSublispSymbol(toString());
            return stateSymbol;
        }
    }

    public static class TerminationRequest extends Unhandleable {
    }

    public interface Thunk {
        SubLObject invoke();

        boolean isTerminationRequest();
    }

    public interface TimeOut {
        boolean hasTimeoutArrived();
    }

    public static class TimesOutAfter implements TimeOut {
        public TimesOutAfter(SubLNumber microseconds) {
            endTime = Numbers.add(Time.get_internal_real_time(), microseconds).toNumber();
            timeHasArrived = false;
        }

        private SubLNumber endTime;
        private boolean timeHasArrived;

        @Override
        public boolean hasTimeoutArrived() {
            if (timeHasArrived)
                return true;
            SubLObject result = Numbers.numL(endTime, Time.get_internal_real_time());
            return timeHasArrived = result != SubLNil.NIL;
        }
    }

    public SubLProcess(String name) {
        this(SubLObjectFactory.makeString(name));
    }

    SubLProcess parent;
    public SubLProcess(SubLString name) {
    	super(null);
    	parent = SubLProcess.currentProcess();
        isPossiblyStillborn = false;
        runThread = null;
        priority = SubLProcess.DEFAULT_PRIORITY;
        whoState = Threads.UNSET_STRING;
        state = SubLProcess.DEAD_STATE;
        interrupts = Collections.synchronizedList(new ArrayList<Thunk>());
        isRunning = false;
        setState(SubLProcess.INITIALIZING_STATE);
        setWhoState(Threads.INITIALIZING_STRING);
        priority = SubLProcess.DEFAULT_PRIORITY;
        this.name = name;
    }

    private static void sleep(long msecs, int nanos) throws InterruptedException {
        Thread.sleep(msecs, nanos);
    }

    public static SubLProcess currentProcess() {
        return currentSubLThread().getSubLProcess();
    }

    public static SubLProcess[] currentProcesses() {
        synchronized (SubLProcess.currentProcesses) {
            SubLProcess[] result = new SubLProcess[SubLProcess.currentProcesses.size()];
            return SubLProcess.currentProcesses.toArray(result);
        }
    }

    final static HashMap<Thread, SubLThread> map = new HashMap<Thread, SubLThread>();
    private static ThreadLocal<SubLThread> threads = new ThreadLocal<SubLThread>() {
        @Override
        public SubLThread initialValue() {

            Thread thisThread = SubLThread.currentJavaThread();
            SubLThread thread = map.get(thisThread);
            if (thread == null) {
                thread = new SubLThread(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        if (true)
                            Errors.unimplementedMethod("Auto-generated method stub:  Type1477805356591.run");

                    }
                }, "From " + thisThread);
                oneOnlyJT = thisThread;
                oneOnlyLT = thread;
                map.put(thisThread, thread);
            }
            return thread;
        }
    };

    static Thread oneOnlyJT;
    static SubLThread oneOnlyLT;

    public static SubLThread currentSubLThread() {
        Object t = SubLThread.currentJavaThread();
        if (t instanceof SubLThread)
            return (SubLThread) t;
        if (SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD != null)
            return SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD;
        synchronized (map) {
            if (t == oneOnlyJT)
                return oneOnlyLT;
        }
        return threads.get();

    }

    public static SubLThread currentSubLThreadOrNull() {
        Object t = SubLThread.currentThread();
        if (t instanceof SubLThread)
            return (SubLThread) t;
        if (SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD != null)
            return SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD;
        synchronized (map) {
            if (t == oneOnlyJT)
                return oneOnlyLT;
        }
        return map.get(t);

    }

    public static void currentThrowStackPop() {
        currentThrowStackPop(null);
    }

    public static void currentThrowStackPop(SubLObject object) {
        SubLObject top = currentSubLThread().throwStack.pop();
        if (object != null && object != top)
            Errors.error("Throw-Stack for " + currentSubLThread() + " out of sync; expected " + object + ", but got "
                    + top);
    }

    public static void currentThrowStackPush(SubLObject object) {
        currentSubLThread().throwStack.push(object);
    }

    public static SubLObject nthMultipleValue(SubLObject nth) {
        int n = nth.intValue();
        SubLThread thread = currentSubLThread();
        switch (n) {
            case 0:
                return thread.value1;
            case 1:
                return thread.value2;
            case 2:
                return thread.value3;
            case 3:
                return thread.value4;
            case 4:
                return thread.value5;
            case 5:
                return thread.value6;
            case 6:
                return thread.value7;
            case 7:
                return thread.value8;
            default:
                if (n >= thread.valuesCount)
                    return SubLNil.NIL;
                return thread.valuesArray.get(n - 8);
        }
    }

    public static synchronized void setAllegoSingleThreadedThread(SubLThread thread) {
        SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD = thread;
    }

    public static void sleepForNanoSeconds(long nanoSecs) {
        SubLSemaphore.sleepSem.acquireWithTimeoutNanoSecs(1, nanoSecs);
    }

    protected static int subLPriorityToJavaPriority(SubLFixnum priority) {
        return priority.intValue();
    }

    private volatile boolean isPossiblyStillborn;
    private volatile SubLThread runThread;
    private SubLString name;
    private SubLFixnum priority;
    private volatile SubLString whoState;
    private volatile SubLProcessState state;
    private List<Thunk> interrupts;
    private boolean isRunning;
    public static String PROCESS_TYPE_NAME;
    public static Thunk READ_LOOP_INTERRUPT_THUNK;
    public static SubLProcessState INITIALIZING_STATE;
    public static SubLProcessState RUN_STATE;
    public static SubLProcessState WAIT_STATE;
    public static SubLProcessState DEAD_STATE;
    public static SubLProcessState BLOCKED_STATE;
    private static SubLThread ALLEGRO_SINGLE_THREADED_THREAD;
    private static SubLFixnum DEFAULT_PRIORITY;
    private static Set<SubLProcess> currentProcesses;
    static {
        SubLProcess.PROCESS_TYPE_NAME = "PROCESS";
        SubLProcess.READ_LOOP_INTERRUPT_THUNK = new InterruptReadLoopThunk();
        INITIALIZING_STATE = new SubLProcessState("INITIALIZING");
        RUN_STATE = new SubLProcessState("RUN");
        WAIT_STATE = new SubLProcessState("WAIT");
        DEAD_STATE = new SubLProcessState("DEAD");
        BLOCKED_STATE = new SubLProcessState("BLOCKED");
        SubLProcess.ALLEGRO_SINGLE_THREADED_THREAD = null;
        DEFAULT_PRIORITY = (SubLFixnum) SubLObjectFactory.makeInteger(5);
        currentProcesses = new HashSet<SubLProcess>(128);
    }

    private SubLObject structFieldError(int fieldNum) {
        if (!(this instanceof SubLStruct))
            Errors.error(this + " is not of type STRUCTURE.");
        else
            Errors.error(this + " does not have a slot: " + fieldNum + ".");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject add(SubLObject num) {
        return Errors.error("Not a number: " + this + ".");
    }

    public void addInterrupt(SubLObject function) {
        this.addInterrupt(new DefaultThunk(function));
    }

    public void addInterrupt(Thunk thunk) {
        interrupts.add(thunk);
        interrupt();
    }

    @Override
    public void addKey(SubLObject key) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "KEYHASH");
    }

    @Override
    public SubLList asArrayList() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    @Override
    public SubLList asConsList() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    @Override
    public BigInteger bigIntegerValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return BigInteger.ZERO;
    }

    @Override
    public void bind(SubLObject newValue, SubLObject[] bindings) {
        Errors.error("Illegal attempt to bind non symbol: " + this + ".");
    }

    public synchronized void block() {
        waitUntilInitializationHasFinished();
        SubLProcessState prevState = getState();
        SubLString prevWhoState = getWhoState();
        try {
            setState(SubLProcess.BLOCKED_STATE);
            setWhoState(Threads.BLOCKED_STRING);
            boolean waitFinished = false;
            while (!waitFinished)
                try {
                    this.wait();
                    waitFinished = true;
                } catch (InterruptedException xcpt) {
                    processInterrupts();
                }
        } finally {
            setState(prevState);
            setWhoState(prevWhoState);
        }
    }

    @Override
    public boolean canFastHash() {
        return true;
    }

    @Override
    public char charValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "CHAR");
        return '\0';
    }

    @Override
    public void checkType(SubLSymbol predicate) throws SubLException {
    }

    @Override
    public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
    }

    @Override
    public Object clone() {
        return this;
    }

    @Override
    public SubLObject currentBinding(SubLObject[] bindings) {
        Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject dec() {
        return Errors.error("Not a number: " + this + ".");
    }

    @Override
    public double doubleValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return Double.MIN_VALUE;
    }

    @Override
    public SubLObject eighth() {
        return this.get(7);
    }

    @Override
    public void enforceType(SubLSymbol predicate) throws SubLException {
        UnaryFunction Function = UnaryFunction.makeInstance(predicate);
        if (SubLNil.NIL == Function.processItem(this))
            Errors.error("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
                    + toTypeName());
    }

    @Override
    public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
    }

    @Override
    public boolean eql(SubLObject obj) {
        return lispEquals(obj);
    }

    @Override
    public boolean equal(SubLObject obj) {
        return eql(obj);
    }

    @Override
    public boolean equalp(SubLObject obj) {
        return equal(obj);
    }

    @Override
    public boolean lispEquals(Object obj) {
        return this == obj;
    }

    @Override
    public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
        return this;
    }

    @Override
    public SubLObject fifth() {
        return this.get(4);
    }

    @Override
    public SubLObject first() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject fourth() {
        return this.get(3);
    }

    @Override
    public SubLObject get(int index) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject get(SubLObject obj) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE");
        return SubLNil.NIL;
    }

    @Override
    public SubLCharacter getCharacter(int index) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRING");
        return null;
    }

    @Override
    public SubLObject getField(int fieldNum) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRUCT");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject getField0() {
        structFieldError(0);
        return null;
    }

    @Override
    public SubLObject getField1() {
        structFieldError(1);
        return null;
    }

    @Override
    public SubLObject getField10() {
        structFieldError(10);
        return null;
    }

    @Override
    public SubLObject getField11() {
        structFieldError(11);
        return null;
    }

    @Override
    public SubLObject getField12() {
        structFieldError(12);
        return null;
    }

    @Override
    public SubLObject getField13() {
        structFieldError(13);
        return null;
    }

    @Override
    public SubLObject getField14() {
        structFieldError(14);
        return null;
    }

    @Override
    public SubLObject getField15() {
        structFieldError(15);
        return null;
    }

    @Override
    public SubLObject getField16() {
        structFieldError(16);
        return null;
    }

    @Override
    public SubLObject getField17() {
        structFieldError(17);
        return null;
    }

    @Override
    public SubLObject getField18() {
        structFieldError(18);
        return null;
    }

    @Override
    public SubLObject getField19() {
        structFieldError(19);
        return null;
    }

    @Override
    public SubLObject getField2() {
        structFieldError(2);
        return null;
    }

    @Override
    public SubLObject getField20() {
        structFieldError(20);
        return null;
    }

    @Override
    public SubLObject getField3() {
        structFieldError(3);
        return null;
    }

    @Override
    public SubLObject getField4() {
        structFieldError(4);
        return null;
    }

    @Override
    public SubLObject getField5() {
        structFieldError(5);
        return null;
    }

    @Override
    public SubLObject getField6() {
        structFieldError(6);
        return null;
    }

    @Override
    public SubLObject getField7() {
        structFieldError(7);
        return null;
    }

    @Override
    public SubLObject getField8() {
        structFieldError(8);
        return null;
    }

    @Override
    public SubLObject getField9() {
        structFieldError(9);
        return null;
    }

    @Override
    public String getFileDesignator() {
        Errors.error(this + " is not a file name designator.");
        return null;
    }

    @Override
    public SubLFunction getFunc() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "FUNCTION");
        return null;
    }

    public SubLString getName() {
        return name;
    }

    @Override
    public int getNumSize() {
        Errors.error("Not a number: " + this + ".");
        return -1;
    }

    public SubLFixnum getPriority() {
        return priority;
    }

    public synchronized SubLProcessState getState() {
        return state;
    }

    public synchronized SubLSymbol getStateSymbol() {
        return state.toSymbol();
    }

    @Override
    public SubLStream getStream(boolean followSynonymStream) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STREAM");
        return null;
    }

    @Override
    public String getStringValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRING");
        return "";
    }

    @Override
    public SubLSymbol getType() {
        return Types.$dtp_process$;
    }

    @Override
    public SubLFixnum getTypeCode() {
        return CommonSymbols.FOURTEEN_INTEGER;
    }

    public synchronized SubLString getWhoState() {
        return whoState;
    }

    @Override
    public int hashCode(int currentDepth) {
        if (currentDepth < 8)
            return superHash();
        return 0;
    }

    @Override
    public boolean hasKey(SubLObject obj) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "KEYHASH");
        return false;
    }

    public boolean hasWatingInterrupts() {
        return !interrupts.isEmpty();
    }

    @Override
    public SubLObject inc() {
        return Errors.error("Not a number: " + this + ".");
    }

    public void interrupt() {
        waitUntilInitializationHasFinished();
        try {
            synchronized (SubLThread.getInterruptLock()) {
                runThread.interrupt();
            }
        } catch (NullPointerException ex) {
        }
    }

    @Override
    public int intValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return Integer.MIN_VALUE;
    }

    public boolean isActive() {
        return state == SubLProcess.RUN_STATE;
    }

    @Override
    public boolean isAlien() {
        return false;
    }

    @Override
    public boolean isArrayBased() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return true;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public boolean isBigIntegerBignum() {
        return false;
    }

    @Override
    public boolean isBignum() {
        return false;
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    @Override
    public boolean isChar() {
        return false;
    }

    @Override
    public boolean isCons() {
        return false;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public boolean isEnvironment() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public boolean isFixnum() {
        return false;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isFunctionSpec() {
        return false;
    }

    @Override
    public boolean isGuid() {
        return false;
    }

    @Override
    public boolean isHashtable() {
        return false;
    }

    @Override
    public boolean isHashtableIterator() {
        return false;
    }

    @Override
    public boolean isIntBignum() {
        return false;
    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public boolean isKeyhash() {
        return false;
    }

    @Override
    public boolean isKeyhashIterator() {
        return false;
    }

    @Override
    public boolean isKeyword() {
        return false;
    }

    @Override
    public boolean isList() {
        return false;
    }

    @Override
    public boolean isLock() {
        return false;
    }

    @Override
    public boolean isLongBignum() {
        return false;
    }

    @Override
    public boolean isMacroOperator() {
        return false;
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    public boolean isNotInterruptible() {
        return Threads.$is_thread_performing_cleanupP$ == null
                || Threads.$is_thread_performing_cleanupP$.getDynamicValue() != SubLNil.NIL;
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isPackage() {
        return false;
    }

    @Override
    public boolean isPackageIterator() {
        return false;
    }

    @Override
    public boolean isPositive() {
        return false;
    }

    @Override
    public boolean isProcess() {
        return true;
    }

    @Override
    public boolean isReadWriteLock() {
        return false;
    }

    @Override
    public boolean isRegexPattern() {
        return false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public boolean isSemaphore() {
        return false;
    }

    @Override
    public boolean isSequence() {
        return false;
    }

    @Override
    public boolean isStream() {
        return false;
    }

    @Override
    public boolean isString() {
        return false;
    }

    @Override
    public boolean isStructure() {
        return false;
    }

    @Override
    public boolean isSymbol() {
        return false;
    }

    @Override
    public boolean isVector() {
        return false;
    }

    @Override
    public boolean isZero() {
        return false;
    }

    public void killProcess() {
        this.addInterrupt(DefaultThunk.requestTermination());
    }

    @Override
    public SubLObject last(int i) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return this;
    }

    @Override
    public long longValue() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return Long.MIN_VALUE;
    }

    @Override
    public SubLObject makeCopy() {
        return this;
    }

    @Override
    public SubLObject makeDeepCopy() {
        return this;
    }

    @Override
    public SubLObject mult(SubLObject num) {
        return Errors.error("Not a number: " + this + ".");
    }

    public Thunk nextInterrupt() {
        Thunk interruptRequest = null;
        if (!interrupts.isEmpty())
            interruptRequest = interrupts.remove(0);
        return interruptRequest;
    }

    @Override
    public SubLObject ninth() {
        return this.get(8);
    }

    @Override
    public SubLObject nthCdr(int index) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    @Override
    public boolean numE(SubLObject x) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return false;
    }

    @Override
    public boolean numG(SubLObject x) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return false;
    }

    @Override
    public boolean numGE(SubLObject x) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return false;
    }

    @Override
    public boolean numL(SubLObject x) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return false;
    }

    @Override
    public boolean numLE(SubLObject x) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return false;
    }

    public void processInterrupts() {
        if (runThread != null)
            Thread.interrupted();
        if (isNotInterruptible())
            return;
        while (hasWatingInterrupts()) {
            Thunk current = nextInterrupt();
            if (current != null) {
                if (current.isTerminationRequest())
                    throw new TerminationRequest();
                current.invoke();
            }
        }
    }

    public SubLObject processWait(SubLObject whostate, SubLObject predicate, TimeOut timeOut) {
        waitUntilInitializationHasFinished();
        SubLString whoStateTyped = whostate.toStr();
        SubLFunction pred = predicate.getFunc();
        SubLNumber waitTimeRaw = Threads.$process_wait_sleep_time$.getValue().toNumber();
        long waitTimeMicroSecs = waitTimeRaw.longValue();
        boolean done = Functions.funcall(pred) != SubLNil.NIL;
        if (!done) {
            SubLProcessState oldState = setState(SubLProcess.WAIT_STATE);
            SubLString oldWhoState = setWhoState(whoStateTyped);
            try {
                do {
                    sleepForNanoSeconds(waitTimeMicroSecs * 1000L);
                    done = Functions.funcall(pred) != SubLNil.NIL;
                } while (!done && !timeOut.hasTimeoutArrived());
            } finally {
                setState(oldState);
                setWhoState(oldWhoState);
            }
        }
        return CommonSymbols.T;
    }

    @Override
    public SubLObject put(SubLObject key, SubLObject value) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE");
        return SubLNil.NIL;
    }

    @Override
    public void rebind(SubLObject oldValue, SubLObject[] bindings) {
        Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
    }

    @Override
    public boolean remKey(SubLObject obj) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE");
        return false;
    }

    @Override
    public SubLObject remove(SubLObject obj) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE");
        return SubLNil.NIL;
    }

    @Override
    public SubLObject rest() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return SubLNil.NIL;
    }

    @Override
    public SubLSequence reverse(boolean isDestructive) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
        return SubLNil.NIL;
    }

    @Override
    public void run() {
      Throwable problem = null;
      runThread = currentSubLThread();
        try {
            runThread.clearBindings();
            synchronized (SubLProcess.currentProcesses) {
                SubLProcess.currentProcesses.add(this);
            }
            runThread.setSubLProcess(this);
            setPriority(getPriority());
            setState(SubLProcess.RUN_STATE);
            setWhoState(Threads.RUN_STRING);
            Threads.possiblyHandleInterrupts(false);
            safeRun();
        } catch (TerminationRequest terminate) {
          problem = terminate;
          return;
        } catch (Exception e) {
          problem = e;
            try {
                e.printStackTrace();
                Errors.handleError(e);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        } finally {
            setState(SubLProcess.DEAD_STATE);
            setWhoState(Threads.DEAD_STRING);
            runThread.setSubLProcess(null);
            Thread.interrupted();
            runThread.reset();
            runThread = null;
            synchronized (SubLProcess.currentProcesses) {
                SubLProcess.currentProcesses.remove(this);
            }
        }
    }

    @Override
    public abstract void safeRun();

    @Override
    public SubLObject second() {
        return this.get(1);
    }

    @Override
    public void set(int index, SubLObject val) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
    }

    @Override
    public void setField(int fieldNum, SubLObject value) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRUCT");
    }

    @Override
    public SubLObject setField0(SubLObject newVal) {
        return structFieldError(0);
    }

    @Override
    public SubLObject setField1(SubLObject newVal) {
        return structFieldError(1);
    }

    @Override
    public SubLObject setField10(SubLObject newVal) {
        return structFieldError(10);
    }

    @Override
    public SubLObject setField11(SubLObject newVal) {
        return structFieldError(11);
    }

    @Override
    public SubLObject setField12(SubLObject newVal) {
        return structFieldError(12);
    }

    @Override
    public SubLObject setField13(SubLObject newVal) {
        return structFieldError(13);
    }

    @Override
    public SubLObject setField14(SubLObject newVal) {
        return structFieldError(14);
    }

    @Override
    public SubLObject setField15(SubLObject newVal) {
        return structFieldError(15);
    }

    @Override
    public SubLObject setField16(SubLObject newVal) {
        return structFieldError(16);
    }

    @Override
    public SubLObject setField17(SubLObject newVal) {
        return structFieldError(17);
    }

    @Override
    public SubLObject setField18(SubLObject newVal) {
        return structFieldError(18);
    }

    @Override
    public SubLObject setField19(SubLObject newVal) {
        return structFieldError(19);
    }

    @Override
    public SubLObject setField2(SubLObject newVal) {
        return structFieldError(2);
    }

    @Override
    public SubLObject setField20(SubLObject newVal) {
        return structFieldError(20);
    }

    @Override
    public SubLObject setField3(SubLObject newVal) {
        return structFieldError(3);
    }

    @Override
    public SubLObject setField4(SubLObject newVal) {
        return structFieldError(4);
    }

    @Override
    public SubLObject setField5(SubLObject newVal) {
        return structFieldError(5);
    }

    @Override
    public SubLObject setField6(SubLObject newVal) {
        return structFieldError(6);
    }

    @Override
    public SubLObject setField7(SubLObject newVal) {
        return structFieldError(7);
    }

    @Override
    public SubLObject setField8(SubLObject newVal) {
        return structFieldError(8);
    }

    @Override
    public SubLObject setField9(SubLObject newVal) {
        return structFieldError(9);
    }

    @Override
    public SubLCons setFirst(SubLObject first) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    public void setIsRunning(boolean newVal) {
        isRunning = newVal;
    }

    public synchronized SubLFixnum setPriority(SubLFixnum newPriority) {
        SubLFixnum oldPriority = priority;
        priority = newPriority;
        if (runThread != null)
            try {
                runThread.setPriority(subLPriorityToJavaPriority(newPriority));
            } catch (NullPointerException ex) {
            }
        return oldPriority;
    }

    @Override
    public SubLCons setRest(SubLObject rest) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    public synchronized SubLProcessState setState(SubLProcessState newState) {
        if (state == null)
            Errors.error("Invalid null state attempted to be assigned to process: " + this);
        SubLProcessState oldState = state;
        state = newState;
        return oldState;
    }

    public synchronized SubLString setWhoState(SubLString newState) {
        SubLString oldState = whoState;
        whoState = newState;
        return oldState;
    }

    @Override
    public SubLObject seventh() {
        return this.get(6);
    }

    @Override
    public SubLObject sixth() {
        return this.get(5);
    }

    @Override
    public int size() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
        return -1;
    }

    @Override
    public int size(int max) {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
        return -1;
    }

    @Override
    public SubLObject sub(SubLObject num) {
        return Errors.error("Not a number: " + this + ".");
    }

    //	@Override
    //	public int superHash() {
    //		return super.hashCode();
    //	}

    @Override
    public SubLObject tenth() {
        return this.get(9);
    }

    @Override
    public SubLObject third() {
        return this.get(2);
    }

    @Override
    public SubLCharacter toChar() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "CHAR");
        return null;
    }

    @Override
    public SubLCons toCons() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "CONS");
        return null;
    }

    @Override
    public SubLDoubleFloat toDouble() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "FLOAT");
        return null;
    }

    @Override
    public SubLEnvironment toEnv() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "ENVIRONMENT");
        return null;
    }

    @Override
    public SubLFixnum toFixnum() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "FIXNUM");
        return null;
    }

    @Override
    public SubLGuid toGuid() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "GUID");
        return null;
    }

    @Override
    public SubLHashtable toHashtable() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE");
        return null;
    }

    @Override
    public SubLHashtableIterator toHashtableIterator() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "HASHTABLE-ITERATOR");
        return null;
    }

    @Override
    public SubLInputBinaryStream toInputBinaryStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "INPUT-BINARY-STREAM");
        return null;
    }

    @Override
    public SubLInputStream toInputStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "INPUT-STREAM");
        return null;
    }

    @Override
    public SubLInputTextStream toInputTextStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "INPUT-TEXT-STREAM");
        return null;
    }

    @Override
    public SubLInteger toInteger() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "INTEGER");
        return null;
    }

    @Override
    public SubLKeyhash toKeyhash() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "KEYHASH");
        return null;
    }

    @Override
    public SubLKeyhashIterator toKeyhashIterator() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "KEYHASH-ITERATOR");
        return null;
    }

    @Override
    public SubLList toList() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LIST");
        return null;
    }

    @Override
    public SubLLock toLock() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "LOCK");
        return null;
    }

    @Override
    public SubLMacro toMacro() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "MACRO");
        return null;
    }

    @Override
    public SubLNumber toNumber() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "NUMBER");
        return null;
    }

    @Override
    public SubLOutputBinaryStream toOutputBinaryStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "OUTPUT-BINARY-STREAM");
        return null;
    }

    @Override
    public SubLOutputStream toOutputStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "OUTPUT-STREAM");
        return null;
    }

    @Override
    public SubLOutputTextStream toOutputTextStream() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "OUTPUT-TEXT-STREAM");
        return null;
    }

    @Override
    public SubLPackage toPackage() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "PACKAGE");
        return null;
    }

    @Override
    public SubLPackageIterator toPackageIterator() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "PACKAGE-ITERATOR");
        return null;
    }

    @Override
    public SubLProcess toProcess() {
        return this;
    }

    @Override
    public SubLReadWriteLock toReadWriteLock() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "READ-WRITE-LOCK");
        return null;
    }

    @Override
    public SubLRegexPattern toRegexPattern() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "REGEX-PATTERN");
        return null;
    }

    @Override
    public SubLSemaphore toSemaphore() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEMAPHORE");
        return null;
    }

    @Override
    public SubLSequence toSeq() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SEQUENCE");
        return null;
    }

    @Override
    public SubLString toStr() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRING");
        return null;
    }

    @Override
    public String printObjectImpl() {
    	checkUnreadableOk();
        return "#<PROCESS " + name + " " + getState() + " " + this.easyToString() + ">";
    }

    @Override
    public SubLStruct toStruct() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "STRUCTURE");
        return null;
    }

    @Override
    public SubLSymbol toSymbol() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "SYMBOL");
        return null;
    }

    @Override
    public String toTypeName() {
        return SubLProcess.PROCESS_TYPE_NAME;
    }

    @Override
    public SubLVector toVect() {
        org.armedbear.lisp.Lisp.lisp_type_error(this, "VECTOR");
        return null;
    }

    public synchronized void unblock() {
        notify();
    }

    public void waitUntilInitializationHasFinished() {
        if (SubLThread.currentThread() == runThread)
            return;
        while (getState() == SubLProcess.INITIALIZING_STATE)
            Thread.yield();
    }
}

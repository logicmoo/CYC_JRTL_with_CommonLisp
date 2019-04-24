//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Functions extends SubLTrampolineFile {
    public static class SubLFuncallCountComaprator implements Comparator<SubLCompiledFunction.FuncallCounts> {
        public SubLFuncallCountComaprator(int arity) {
            this.arity = 0;
            this.arity = arity;
        }

        private int arity;

        @Override
        public int compare(SubLCompiledFunction.FuncallCounts o1, SubLCompiledFunction.FuncallCounts o2) {
            if (o1.counts[arity] == o2.counts[arity])
                return 0;
            return o1.counts[arity] < o2.counts[arity] ? 1 : -1;
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this;
        }
    }

    public static SubLObject apply(SubLObject function, SubLObject arg) {
        if (arg == SubLNil.NIL)
            return funcall(function);
        SubLObject arg2 = arg.first();
        SubLObject loopVar = arg.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2);
        SubLObject arg3 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3);
        SubLObject arg4 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4);
        SubLObject arg5 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5);
        SubLObject arg6 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5, arg6);
        SubLObject arg7 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5, arg6, arg7);
        SubLObject arg8 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        SubLObject arg9 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        SubLObject arg10 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
        return apply(function, arg, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject apply(SubLObject function, SubLObject arg, SubLObject otherArgs) {
        if (otherArgs == SubLNil.NIL)
            return funcall(function, arg);
        SubLObject arg2 = otherArgs.first();
        SubLObject loopVar = otherArgs.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2);
        SubLObject arg3 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3);
        SubLObject arg4 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4);
        SubLObject arg5 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4, arg5);
        SubLObject arg6 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4, arg5, arg6);
        SubLObject arg7 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4, arg5, arg6, arg7);
        SubLObject arg8 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        SubLObject arg9 = loopVar.first();
        loopVar = loopVar.rest();
        if (loopVar == SubLNil.NIL)
            return funcall(function, arg, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        Resourcer resourcer = Resourcer.getInstance();
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(1);
            args[0] = otherArgs;
            return apply(function, arg, args);
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLObject apply(SubLObject function, SubLObject arg, SubLObject[] restArgs) {
        int restLength = restArgs.length;
        ArrayList<SubLObject> list = new ArrayList<SubLObject>(1 + restLength + 16);
        SubLObject lastList = arg;
        if (restLength > 0) {
            list.add(arg);
            for (int i = 0; i < restLength - 1; ++i)
                list.add(restArgs[i]);
            lastList = restArgs[restLength - 1];
        }
        if (!lastList.isList())
            Errors.error("Invalid argument supplied to APPLY: " + arg + ".");
        Resourcer resourcer = Resourcer.getInstance();
        if (lastList != SubLNil.NIL) {
            SubLListListIterator iter = null;
            try {
                iter = resourcer.acquireSubLListListIterator(lastList.toList());
                while (iter.hasNext())
                    list.add(iter.nextSubLObject());
            } finally {
                resourcer.releaseSubLListListIterator(iter);
            }
        }
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(list.size());
            list.toArray(args);
            SubLObject result = funcall(function, args);
            return result;
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLList arglist(SubLObject function) {
        SubLOperator functionTyped = function.toSymbol().getFunction();
        return functionTyped.getArglist();
    }

    public static SubLObject clear_funcall_stats() {
        return Errors.unimplementedMethod("CLEAR-FUNCALL-STATS");
    }

    public static SubLObject funcall(SubLObject function) {
        final SubLFunction func = function.getFunc();
        return ZeroArityFunction.makeInstance(func).processItem();
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1) {
        final SubLFunction func = function.getFunc();
        return UnaryFunction.makeInstance(func).processItem(arg1);
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2) {
        return BinaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2);
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        return TernaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3);
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        return QuataryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3, arg4);
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        return QuintaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3, arg4, arg5);
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        Resourcer resourcer = Resourcer.getInstance();
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(6);
            args[0] = arg1;
            args[1] = arg2;
            args[2] = arg3;
            args[3] = arg4;
            args[4] = arg5;
            args[5] = arg6;
            return funcall(function, args);
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
        Resourcer resourcer = Resourcer.getInstance();
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(7);
            args[0] = arg1;
            args[1] = arg2;
            args[2] = arg3;
            args[3] = arg4;
            args[4] = arg5;
            args[5] = arg6;
            args[6] = arg7;
            return funcall(function, args);
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        Resourcer resourcer = Resourcer.getInstance();
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(8);
            args[0] = arg1;
            args[1] = arg2;
            args[2] = arg3;
            args[3] = arg4;
            args[4] = arg5;
            args[5] = arg6;
            args[6] = arg7;
            args[7] = arg8;
            return funcall(function, args);
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8,
            SubLObject arg9) {
        Resourcer resourcer = Resourcer.getInstance();
        SubLObject[] args = null;
        try {
            args = resourcer.acquireSubLObjectArray(9);
            args[0] = arg1;
            args[1] = arg2;
            args[2] = arg3;
            args[3] = arg4;
            args[4] = arg5;
            args[5] = arg6;
            args[6] = arg7;
            args[7] = arg8;
            args[8] = arg9;
            return funcall(function, args);
        } finally {
            resourcer.releaseSubLObjectArray(args);
        }
    }

    public static SubLObject funcall(SubLObject function, SubLObject[] args) {
        if (args.length < 6 && false)
            switch (args.length) {
                case 0:
                    return funcall(function);
                case 1:
                    return funcall(function, args[0]);
                case 2:
                    return funcall(function, args[0], args[1]);
                case 3:
                    return funcall(function, args[0], args[1], args[2]);
                case 4:
                    return funcall(function, args[0], args[1], args[2], args[3]);
                case 5:
                    return funcall(function, args[0], args[1], args[2], args[3], args[4]);
            }
        return function.getFunc().funcall(args);
    }

    public static SubLObject funcall_stats(SubLObject minNumOfCalls) {
        if (minNumOfCalls == CommonSymbols.UNPROVIDED)
            minNumOfCalls = SubLNumberFactory.makeInteger(100);
        ArrayList<SubLCompiledFunction.FuncallCounts> list = SubLCompiledFunction.funcallCountsArray;
        for (int i = 0, size = 51; i < size; ++i) {
            SubLCompiledFunction.FuncallCounts[] results = list.toArray(new SubLCompiledFunction.FuncallCounts[list.size()]);
            Arrays.sort(results, new SubLFuncallCountComaprator(i));
            boolean hasPrintHeader = false;
            for (int j = 0, size2 = results.length; j < size2; ++j) {
                SubLCompiledFunction.FuncallCounts obj1 = results[j];
                if (obj1.counts[i] < minNumOfCalls.intValue())
                    break;
                if (!hasPrintHeader) {
                    System.out.println("******************************");
                    System.out.println("FUNCALLS OF ARITY: " + i);
                    hasPrintHeader = true;
                }
                System.out.println(obj1.getMethodName() + " " + obj1.counts[i]);
            }
        }
        return SubLNil.NIL;
    }

    public static SubLObject print_function(SubLObject function, SubLObject stream) {
        stream.toOutputTextStream().writeString(function.princToString());
        return function;
    }

    public static SubLFile me;
    public static SubLSymbol $call_arguments_limit$;
    static {
        me = new Functions();
    }

    @Override
    public void declareFunctions() {
        SubLFiles.declareFunction(Functions.me, "funcall", "FUNCALL", 1, 0, true);
        SubLFiles.declareFunction(Functions.me, "apply", "APPLY", 2, 0, true);
        SubLFiles.declareFunction(Functions.me, "arglist", "ARGLIST", 1, 0, false);
        SubLFiles.declareFunction(Functions.me, "funcall_stats", "FUNCALL-STATS", 0, 1, false);
        SubLFiles.declareFunction(Functions.me, "clear_funcall_stats", "CLEAR_FUNCALL-STATS", 0, 0, false);
    }

    @Override
    public void initializeVariables() {
        Functions.$call_arguments_limit$ = SubLFiles.defconstant(Functions.me, "CALL-ARGUMENTS-LIMIT", SubLObjectFactory.makeInteger(16384));
    }

    @Override
    public void runTopLevelForms() {
    }
}

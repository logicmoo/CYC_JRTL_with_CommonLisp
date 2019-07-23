/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class FunctionArgListDescription {
    public static class OptionalArgDescription {
        public OptionalArgDescription(SubLObject desc) {
            if (desc.isSymbol()) {
                init(desc, SubLNil.NIL, SubLNil.NIL);
                return;
            }
            if (desc.isCons()) {
                SubLCons advancedDesc = desc.toCons();
                SubLObject name = SubLNil.NIL;
                SubLObject defaultValue = SubLNil.NIL;
                SubLObject wasSetArgName = SubLNil.NIL;
                if (advancedDesc.size() >= 1)
                    name = advancedDesc.get(0);
                if (advancedDesc.size() >= 2)
                    defaultValue = advancedDesc.get(1);
                if (advancedDesc.size() >= 3)
                    wasSetArgName = advancedDesc.get(2);
                if (advancedDesc.size() > 3)
                    Errors.error("Too many arguments for optional argument: " + advancedDesc);
                init(name, defaultValue, wasSetArgName);
                return;
            }
            Errors.error("Got invalid type for optional argument: " + desc.toTypeName() + "\nValue: " + desc);
        }

        private SubLSymbol argName;
        private SubLSymbol wasSetArgName;
        private SubLObject defaultValue;

        public SubLSymbol getArgName() {
            return argName;
        }

        public SubLObject getDefaultValue() {
            return defaultValue;
        }

        public SubLSymbol getWasSetArgName() {
            return wasSetArgName;
        }

        public void init(SubLObject argName, SubLObject defaultValue, SubLObject wasSetArgName) {
            if (!isAllowableArgSymbol(argName))
                Errors.error("Formal optional argument name expected type SYMBOL, got: " + argName.toTypeName());
            if (!isAllowableArgSymbol(wasSetArgName) && SubLNil.NIL != wasSetArgName)
                Errors.error("Formal optional argument name expected type SYMBOL, got: " + argName.toTypeName());
            this.argName = (SubLSymbol) argName;
            this.wasSetArgName = (SubLSymbol) wasSetArgName;
            this.defaultValue = defaultValue;
        }
    }

    public FunctionArgListDescription(SubLObject args) {
        this(args, "");
    }

    public FunctionArgListDescription(SubLObject args, String docString) {
        this.args = new ArrayList<SubLSymbol>();
        optionals = new ArrayList<OptionalArgDescription>();
        rest = null;
        this.docString = "";
        if (docString != null)
            this.docString = docString;
        parseFormalArgs(args);
    }

    private static boolean isAllowableArgSymbol(SubLObject obj) {
        return obj.isSymbol() && !isOptionalSymbol(obj) && !isRestSymbol(obj) && !obj.isBoolean() && !obj.isKeyword();
    }

    private static boolean isBody(SubLObject obj) {
        return true;
    }

    private static boolean isOptionalDeclaration(SubLObject obj) {
        return isAllowableArgSymbol(obj) || obj.isCons();
    }

    private static boolean isOptionalSymbol(SubLObject obj) {
        return obj == CommonSymbols.OPTIONAL_SYMBOL;
    }

    private static boolean isRestSymbol(SubLObject obj) {
        return obj == CommonSymbols.REST_SYMBOL;
    }

    public static void main(String[] args) {
    }

    private List<SubLSymbol> args;
    private List<OptionalArgDescription> optionals;
    private SubLSymbol rest;
    private String docString;

    private void addOptionalArg(OptionalArgDescription desc) {
        optionals.add(desc);
    }

    private void addRequiredArg(SubLObject symbol) {
        if (!isAllowableArgSymbol(symbol))
            Errors.error("Formal required argument name expected type SYMBOL, got: " + symbol.getClass());
        args.add(symbol.toSymbol());
    }

    private String expandOptional(Stack argsStack) {
        StringBuilder buf = new StringBuilder();
        OptionalArgDescription opd = null;
        boolean wasSet = false;
        Iterator iter = optionals.iterator();
        while (iter.hasNext()) {
            opd = (OptionalArgDescription) iter.next();
            buf.append("(").append(SubLString.convertSubLStringToJavaString("" + opd.getArgName())).append(" ");
            if (argsStack.isEmpty()) {
                buf.append(SubLString.convertSubLStringToJavaString("" + opd.getDefaultValue()));
                wasSet = false;
            } else {
                buf.append(SubLString.convertSubLStringToJavaString("" + argsStack.pop()));
                wasSet = true;
            }
            buf.append(") ");
            if (opd.getWasSetArgName() != SubLNil.NIL) {
                buf.append("(").append(SubLString.convertSubLStringToJavaString("" + opd.getWasSetArgName())).append(" ");
                buf.append(wasSet ? CommonSymbols.T : SubLNil.NIL).append(") ");
            }
        }
        return buf.toString();
    }

    private ArrayList expandOptional(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
        OptionalArgDescription opd = null;
        boolean wasSet = false;
        Iterator iter = optionals.iterator();
        while (iter.hasNext()) {
            opd = (OptionalArgDescription) iter.next();
            SubLSymbol optionalVariable = opd.getArgName();
            SubLObject actualValue = null;
            if (argsStack.isEmpty()) {
                SubLObject optionalDefaultForm = opd.getDefaultValue();
                actualValue = optionalDefaultForm.eval(env);
                wasSet = false;
            } else {
                actualValue = (SubLObject) argsStack.pop();
                if (actualValue == CommonSymbols.UNPROVIDED) {
                    SubLObject optionalDefaultForm = opd.getDefaultValue();
                    actualValue = optionalDefaultForm.eval(env);
                    wasSet = false;
                } else
                    wasSet = true;
            }
            SubLObject oldDynamicValue = env.noteBinding(optionalVariable, actualValue);
            oldDynamicValues = SubLSpecialOperatorDeclarations.possiblyNoteOldDynamicValue(optionalVariable, oldDynamicValue, oldDynamicValues);
            SubLSymbol providedVariable = opd.getWasSetArgName();
            if (providedVariable != SubLNil.NIL) {
                oldDynamicValue = env.noteBinding(providedVariable, SubLObjectFactory.makeBoolean(wasSet));
                oldDynamicValues = SubLSpecialOperatorDeclarations.possiblyNoteOldDynamicValue(providedVariable, oldDynamicValue, oldDynamicValues);
            }
        }
        return oldDynamicValues;
    }

    private String expandRequired(Stack argsStack) {
        StringBuilder buf = new StringBuilder();
        Iterator iter = args.iterator();
        while (iter.hasNext()) {
            if (argsStack.isEmpty())
                throw new InvalidSubLExpressionException("Function passed too few arguments.");
            buf.append("(").append(SubLString.convertSubLStringToJavaString("" + iter.next())).append(" ").append(SubLString.convertSubLStringToJavaString("" + argsStack.pop())).append(") ");
        }
        return buf.toString();
    }

    private ArrayList expandRequired(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
        Iterator iter = args.iterator();
        while (iter.hasNext()) {
            if (argsStack.isEmpty())
                throw new InvalidSubLExpressionException("Function passed too few arguments.");
            SubLSymbol requiredVariable = (SubLSymbol) iter.next();
            SubLObject actualArg = (SubLObject) argsStack.pop();
            SubLObject oldDynamicValue = env.noteBinding(requiredVariable, actualArg);
            oldDynamicValues = SubLSpecialOperatorDeclarations.possiblyNoteOldDynamicValue(requiredVariable, oldDynamicValue, oldDynamicValues);
        }
        return oldDynamicValues;
    }

    private String expandRest(Stack argsStack) {
        if (!allowsRest())
            return "";
        StringBuilder buf = new StringBuilder();
        Object val = SubLNil.NIL;
        if (!argsStack.isEmpty()) {
            StringBuilder restBuf = (StringBuilder) (val = new StringBuilder("'("));
            while (!argsStack.isEmpty())
                restBuf.append(SubLString.convertSubLStringToJavaString("" + argsStack.pop())).append(" ");
            restBuf.append(")");
        }
        buf.append("(").append(SubLString.convertSubLStringToJavaString("" + rest)).append(" ").append(val).append(") ");
        return buf.toString();
    }

    private ArrayList expandRest(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
        if (!allowsRest())
            return oldDynamicValues;
        SubLObject[] actualRestArgs = (SubLObject[]) argsStack.pop();
        int size = actualRestArgs.length;
        SubLList restList = SubLNil.NIL;
        for (int i = size - 1; i >= 0; --i) {
            SubLObject actualArg = actualRestArgs[i];
            restList = restList.push(actualArg);
        }
        SubLObject oldDynamicValue = env.noteBinding(rest, restList);
        oldDynamicValues = SubLSpecialOperatorDeclarations.possiblyNoteOldDynamicValue(rest, oldDynamicValue, oldDynamicValues);
        return oldDynamicValues;
    }

    private void parseFormalArgs(SubLObject args) {
        if (!args.isList())
            Errors.error("Invalid formal argument list type.\nWanted type " + AbstractSubLList.LIST_TYPE_NAME + " got type: " + args.toTypeName() + "\nValue: " + args);
        if (args == SubLNil.NIL)
            return;
        SubLObject[] argArray = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
            argArray = resourcer.acquireSubLObjectArray(args.toList());
            int i = 0;
            int size = argArray.length;
            int curArg = 0;
            while (i < size && isAllowableArgSymbol(argArray[i]))
                addRequiredArg(argArray[curArg = i++]);
            if (i < size && isOptionalSymbol(argArray[i])) {
                curArg = i++;
                if (i < size && isOptionalDeclaration(argArray[i])) {
                    OptionalArgDescription optionDesc = new OptionalArgDescription(argArray[curArg = i++]);
                    addOptionalArg(optionDesc);
                } else
                    Errors.error("&OPTIONAL present but no optional arguments given.\nValue: " + args);
                while (i < size && isOptionalDeclaration(argArray[i])) {
                    OptionalArgDescription optionDesc = new OptionalArgDescription(argArray[curArg = i++]);
                    addOptionalArg(optionDesc);
                }
            }
            if (i < size && isRestSymbol(argArray[i])) {
                curArg = i++;
                if (i < size && isAllowableArgSymbol(argArray[i]))
                    setRestSymbol(argArray[curArg = i++]);
                else
                    Errors.error("&REST present but no variable given.\nValue: " + args);
            }
            if (curArg == size - 1)
                return;
            Errors.error("Invalid formal argument list: " + args);
        } finally {
            resourcer.releaseSubLObjectArray(argArray);
        }
    }

    private void setRestSymbol(SubLObject symbol) {
        if (!isAllowableArgSymbol(symbol))
            Errors.error("Formal rest argument name expected type SYMBOL, got: " + symbol.getClass());
        rest = (SubLSymbol) symbol;
    }

    public boolean allowsRest() {
        return rest != null;
    }

    public ArrayList expandArgBindings(Object[] actualArgs, SubLEnvironment newEnv) {
        Stack<Object> argsStack = new Stack<Object>();
        for (int i = actualArgs.length - 1; i >= 0; --i)
            argsStack.push(actualArgs[i]);
        ArrayList oldDynamicValues = null;
        this.expandRequired(argsStack, newEnv, oldDynamicValues);
        this.expandOptional(argsStack, newEnv, oldDynamicValues);
        this.expandRest(argsStack, newEnv, oldDynamicValues);
        if (!argsStack.isEmpty())
            throw new InvalidSubLExpressionException("Not enough arguments supplied to function.");
        return oldDynamicValues;
    }

    public int getOptionalArgCount() {
        return optionals.size();
    }

    public List getOptionalVariableSymbols() {
        return optionals;
    }

    public int getRequiredArgCount() {
        return args.size();
    }

    public List getRequiredVariableSymbols() {
        return args;
    }

    public SubLSymbol getRestSymbol() {
        return rest;
    }
}

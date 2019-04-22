//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.util.ArrayList;

import org.armedbear.lisp.Function;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.FunctionArgListDescription;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInterpretedFunction extends Function implements SubLFunction {
	@Override
	public boolean isSubLispBased() {
		return true;
	}

	SubLInterpretedFunction(SubLCons form, SubLEnvironment env) {
		this(form, env, null);
	}

	SubLInterpretedFunction(SubLCons form, SubLEnvironment env, SubLSymbol functionSymbol) {
		super(functionSymbol);
		this.form = form;
		if (!isPossiblyLambdaExpression(form, functionSymbol == null)) {
			throw new InvalidSubLExpressionException("Got invalid interpreted function definition: " + form);
		}
		if (form.size() >= 2) {
			argDesc = new FunctionArgListDescription(form.get(1));
		} else {
			argDesc = new FunctionArgListDescription(CommonSymbols.NIL);
		}
		requiredArgCount = argDesc.getRequiredArgCount();
		optionalArgCount = argDesc.getOptionalArgCount();
		allowsRest = argDesc.allowsRest();
		if (form.size() >= 3) {
			body = form.cddr();
			if (!body.isCons()) {
				throw new InvalidSubLExpressionException("Got invalid body for interpreted function: " + body);
			}
			body = SubLObjectFactory.makeCons(CommonSymbols.PROGN, body);
		} else {
			body = CommonSymbols.NIL;
		}
		this.env = env;
		if (functionSymbol != null) {
			functionSymbol.setFunction(this);
		}
	}

	public static boolean isLambdaSymbol(SubLObject obj) {
		return obj == CommonSymbols.LAMBDA_SYMBOL;
	}

	public static boolean isPossiblyLambdaExpression(SubLObject exp, boolean checkForLambda) {
		if (!exp.isCons()) {
			return false;
		}
		final SubLCons cons = exp.toCons();
		final int size = cons.size();
		if (size < 2) {
			return false;
		}
		if (!checkForLambda) {
			return true;
		}
		final SubLObject possibleLamdaSymbol = cons.get(0);
		return isLambdaSymbol(possibleLamdaSymbol);
	}

	public static void main(String[] args) {
	}

	private final SubLList form;
	private FunctionArgListDescription argDesc;
	private SubLObject body;
	private final SubLEnvironment env;
	public static String LAMBDA_FUNCTION_TYPE_NAME = "INTERPRETED-FUNCTION";

	@Override
	public LispObject arrayify(LispObject... args) {
		if(args.length==0) return (LispObject) apply(args);
		return (LispObject) apply(args);
	}

	@Override
	public SubLObject apply(Object[] args) {
		final SubLEnvironment oldEnv = SubLEnvironment.currentEnvironment();
		final SubLEnvironment newEnv = env.extend();
		SubLObject result = CommonSymbols.NIL;
		ArrayList oldDynamicValues = null;
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.throwStack.push(CommonSymbols.RETURN_TAG);
		try {
			oldDynamicValues = argDesc.expandArgBindings(args, newEnv);
			body.eval(newEnv);
		} catch (final CatchableThrow ct) {
			result = Dynamic.handleCatchableThrow(ct, CommonSymbols.RETURN_TAG);
		} finally {
			thread.throwStack.pop();
			SubLSpecialOperatorDeclarations.possiblyRebindDynamics(oldDynamicValues);
			newEnv.unextend();
			SubLEnvironment.setCurrentEnvironment(oldEnv);
		}
		Values.setFirstMultipleValue(result);
		return result;
	}

	@Override
	public int applyArity() {
		return getRequiredArgCount() + getOptionalArgCount();
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public SubLList getArglist() {
		Errors.unimplementedMethod("SubLInterpretedFunction.getArglist()");
		return CommonSymbols.NIL;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8) {
			return form.hashCode(currentDepth + 1);
		}
		return 0;
	}

	@Override
	public boolean isAlien() {
		return false;
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
		return true;
	}

	@Override
	public boolean isFunctionSpec() {
		return true;
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
	public boolean isInterpreted() {
		return true;
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
	public boolean isNil() {
		return false;
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
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
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
	public boolean isSpecial() {
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

//	@Override
//	public String toString() {
//		final SubLSymbol functionSymbol = getFunctionSymbol();
//		if (functionSymbol != null) {
//			return "#<Interpreted Function " + functionSymbol + ">";
//		}
//		return super.toString();
//	}

	@Override
	public String toTypeName() {
		return "INTERPRETED-FUNCTION";
	}
}

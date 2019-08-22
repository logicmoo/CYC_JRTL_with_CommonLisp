/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static org.logicmoo.system.Startup.currentLisp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLSpecialOperatorImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class SubLSpecialOperatorDeclarations extends SubLTrampolineFile {
	private static void csetf_internal(SubLObject place, SubLObject value, SubLEnvironment env) {
		if (place.isSymbol())
			env.setBinding(place.toSymbol(), value);
		else if (place.isCons()) {
			SubLCons placeForm = place.toCons();
			SubLSymbol accessor = place.first().toSymbol();
			SubLObject arg2 = place.second().eval(env);
			SubLSymbol setter = null;
			if (accessor == CommonSymbols.CAR)
				arg2.setFirst(value);
			else if (accessor == CommonSymbols.CDR)
				arg2.setRest(value);
			else if (accessor == CommonSymbols.SYMBOL_VALUE)
				env.setBinding(arg2.toSymbol(), value);
			else {
				SubLObject arg3 = placeForm.third().eval(env);
				if (accessor == CommonSymbols.NTH)
					arg3.toCons().set(arg2.intValue(), value);
				else if (accessor == CommonSymbols.GETHASH)
					arg3.put(arg2, value);
				else if (accessor == CommonSymbols.GETHASH_WITHOUT_VALUES)
					arg3.put(arg2, value);
				else if (accessor == CommonSymbols.CHAR)
					arg2.set(arg3.intValue(), value);
				else if (accessor == CommonSymbols.AREF)
					arg2.set(arg3.intValue(), value);
				else if (accessor == CommonSymbols.GET)
					arg2.toSymbol().setProperty(arg3, value);
				else if ((setter = Structures.getStructureSetter(accessor)) != null)
					Functions.funcall(setter, arg2, value);
				else
					Errors.error("'" + place + "' is not a valid setf place. Cannot set to the value: " + value + ".");
			}
		} else
			Errors.error("'" + place + "' is not a valid setf place. Cannot set to the value: " + value + ".");
	}

	public static SubLObject cand(SubLCons specialForm, SubLEnvironment env) {
		SubLObject item = null;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			while (iter.hasNext()) {
				item = iter.nextSubLObject();
				if (item.eval(env) == SubLNil.NIL)
					return SubLNil.NIL;
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		return CommonSymbols.T;
	}

	public static SubLObject ccatch(SubLCons specialForm, SubLEnvironment env) {
		if (specialForm.size() < 3)
			Errors.error("ccatch expects at least 2 arguments, got: " + (specialForm.size() - 1));
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			SubLObject tagForm = iter.nextSubLObject();
			SubLSymbol var = (SubLSymbol) iter.next();
			SubLObject tag = tagForm.eval(env);
			SubLObject value = null;
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.throwStack.push(tag);
			try {
				value = list_progn(iter, env);
			} catch (Throwable t) {
				value = Errors.handleThrowable(t, tag);
				env.setBinding(var, value);
			} finally {
				thread.throwStack.pop();
			}
			return value;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject cdec(SubLCons forms, SubLEnvironment env) {
		SubLObject place = forms.second();
		SubLObject delta = forms.third().eval(env);
		if (delta == SubLNil.NIL)
			delta = CommonSymbols.ONE_INTEGER;
		SubLObject value = Numbers.subtract(place.eval(env), delta);
		csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject cdo(SubLCons specialForm, SubLEnvironment env) {
		SubLList varSpec = specialForm.second().toList().asConsList();
		SubLList endSpec = specialForm.third().toList();
		SubLList body = specialForm.nthCdr(3).toList();
		SubLEnvironment newEnv = env.extend();
		ArrayList oldDynamicValues = null;
		try {
			for (SubLList current = varSpec; current != SubLNil.NIL; current = current.rest().toList()) {
				SubLSymbol curVar = current.first().first().toSymbol();
				SubLObject curVal = current.first().rest().first().eval(newEnv);
				SubLObject oldDynamicValue = newEnv.noteBinding(curVar, curVal);
				oldDynamicValues = possiblyNoteOldDynamicValue(curVar, oldDynamicValue, oldDynamicValues);
			}
			SubLObject condition = endSpec.first();
			while (condition.eval(newEnv) == SubLNil.NIL) {
				list_progn(body, newEnv);
				for (SubLList current2 = varSpec; current2 != SubLNil.NIL; current2 = current2.rest().toList()) {
					SubLObject place = current2.first().rest().rest();
					if (place != SubLNil.NIL) {
						SubLSymbol curVar2 = current2.first().first().toSymbol();
						SubLObject curVal2 = place.first().eval(newEnv);
						newEnv.setBinding(curVar2, curVal2);
					}
				}
			}
			return list_progn(endSpec.rest().toList(), newEnv);
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			newEnv.unextend();
		}
	}

	public static SubLObject cdo_all_symbols(SubLCons forms, SubLEnvironment env) {
		if (false)
			Errors.unimplementedMethod("SubLSpecialOperatorDeclarations.cdo_all_symbols()");
		SubLObject result = SubLNil.NIL;

		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		SubLListListIterator bodyIter = null;
		try {
			bodyIter = resourcer.acquireSubLListListIterator(forms, 1);
			SubLObject varSpec = bodyIter.nextSubLObject();
			SubLSymbol keyVar = varSpec.first().toSymbol();

			Set<Symbol> symbols = Package.getAllSymbols();

			SubLObject keyOldDynamicValue = newEnv.noteBinding(keyVar, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(keyVar, keyOldDynamicValue, oldDynamicValues);

			Iterator hashIter = symbols.iterator();
			while (hashIter.hasNext()) {
				SubLObject key = (SubLObject) hashIter.next();
				newEnv.setBinding(keyVar, key);
				bodyIter.init(forms, 1);
				result = list_progn(bodyIter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(bodyIter);
			newEnv.unextend();
		}
		return result;
	}

	public static SubLObject cdo_external_symbols(SubLCons forms, SubLEnvironment env) {
		if (false)
			return Errors.unimplementedMethod("SubLSpecialOperatorDeclarations.cdo_external_symbols()");
		SubLObject result = SubLNil.NIL;

		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		SubLListListIterator bodyIter = null;
		try {
			bodyIter = resourcer.acquireSubLListListIterator(forms, 1);
			SubLObject varSpec = bodyIter.nextSubLObject();
			SubLSymbol keyVar = varSpec.first().toSymbol();

			Package pkg = maybePackage(varSpec);
			Collection symbols = pkg.getExternalSymbols();

			SubLObject keyOldDynamicValue = newEnv.noteBinding(keyVar, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(keyVar, keyOldDynamicValue, oldDynamicValues);

			Iterator hashIter = symbols.iterator();
			while (hashIter.hasNext()) {
				SubLObject key = (SubLObject) hashIter.next();
				newEnv.setBinding(keyVar, key);
				bodyIter.init(forms, 1);
				result = list_progn(bodyIter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(bodyIter);
			newEnv.unextend();
		}
		return result;

	}

	public static SubLObject cdo_symbols(final SubLCons forms, SubLEnvironment env) {
		if (false)
			return Errors.unimplementedMethod("SubLSpecialOperatorDeclarations.cdo_symbols()");
		SubLObject result = SubLNil.NIL;

		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		SubLListListIterator bodyIter = null;
		try {
			bodyIter = resourcer.acquireSubLListListIterator(forms, 1);
			SubLObject varSpec = bodyIter.nextSubLObject();
			SubLSymbol keyVar = varSpec.first().toSymbol();

			Package pkg = maybePackage(varSpec);
			List<Symbol> symbols = pkg.getAccessibleSymbols();

			SubLObject keyOldDynamicValue = newEnv.noteBinding(keyVar, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(keyVar, keyOldDynamicValue, oldDynamicValues);

			Iterator hashIter = symbols.iterator();
			while (hashIter.hasNext()) {
				SubLObject key = (SubLObject) hashIter.next();
				newEnv.setBinding(keyVar, key);
				bodyIter.init(forms, 1);
				result = list_progn(bodyIter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(bodyIter);
			newEnv.unextend();
		}
		return result;
	}

	/**
	 * @param varSpec
	 * @return
	 */
	private static Package maybePackage(SubLObject varSpec) {
		Package pkg;

		if (varSpec.toCons().listLength() == 2)
			pkg = Lisp.coerceToPackage(varSpec.second().toLispObject());
		else
			pkg = Lisp.getCurrentPackage();
		return pkg;
	}

	public static SubLObject cdohash(SubLCons forms, SubLEnvironment env) {
		SubLObject result = SubLNil.NIL;
		SubLListListIterator bodyIter = null;
		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			bodyIter = resourcer.acquireSubLListListIterator(forms, 1);
			SubLObject varSpec = bodyIter.nextSubLObject();
			SubLSymbol keyVar = varSpec.first().toSymbol();
			SubLSymbol valueVar = varSpec.second().toSymbol();
			SubLObject keyOldDynamicValue = newEnv.noteBinding(keyVar, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(keyVar, keyOldDynamicValue, oldDynamicValues);
			SubLObject valueOldDynamicValue = newEnv.noteBinding(valueVar, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(valueVar, valueOldDynamicValue, oldDynamicValues);
			SubLHashtable table = varSpec.third().eval(env).toHashtable();
			SubLObject key = null;
			SubLObject value = null;
			Iterator hashIter = Hashtables.getEntrySetIterator(table);
			try {
				while (Hashtables.iteratorHasNext(hashIter)) {
					Map.Entry entry = Hashtables.iteratorNextEntry(hashIter);
					key = Hashtables.getEntryKey(entry);
					value = Hashtables.getEntryValue(entry);
					newEnv.setBinding(keyVar, key);
					newEnv.setBinding(valueVar, value);
					bodyIter.init(forms, 2);
					result = list_progn(bodyIter, newEnv);
				}
			} finally {
				Hashtables.releaseEntrySetIterator(hashIter);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(bodyIter);
			newEnv.unextend();
		}
		return result;
	}

	public static SubLObject cdolist(SubLCons forms, SubLEnvironment env) {
		SubLObject result = SubLNil.NIL;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			iter = resourcer.acquireSubLListListIterator(forms, 1);
			SubLObject varSpec = iter.nextSubLObject();
			SubLSymbol symbol = varSpec.first().toSymbol();
			SubLList list = varSpec.second().eval(env).toList();
			iter2 = resourcer.acquireSubLListListIterator(list);
			SubLObject oldDynamicValue = newEnv.noteBinding(symbol, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(symbol, oldDynamicValue, oldDynamicValues);
			while (iter2.hasNext()) {
				SubLObject item = iter2.nextSubLObject();
				newEnv.setBinding(symbol, item);
				iter.init(forms, 2);
				result = list_progn(iter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
			newEnv.unextend();
		}
		return SubLNil.NIL;
	}

	public static SubLObject cdotimes(SubLCons forms, SubLEnvironment env) {
		SubLObject result = SubLNil.NIL;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			iter = resourcer.acquireSubLListListIterator(forms, 1);
			if (!iter.hasNext())
				throw new InvalidSubLExpressionException("CDOTIMES was not passed enough arguments.");
			SubLList varDeclList = iter.nextSubLObject().toList();
			int declSize = varDeclList.size();
			if (declSize < 2 || declSize > 3)
				throw new InvalidSubLExpressionException("CDOTIMES var declaration was not passed 2-3 arguments.");
			SubLSymbol varSymbol = varDeclList.first().toSymbol();
			int size = varDeclList.second().eval(env).intValue();
			SubLObject oldDynamicValue = newEnv.noteBinding(varSymbol, CommonSymbols.ZERO_INTEGER);
			oldDynamicValues = possiblyNoteOldDynamicValue(varSymbol, oldDynamicValue, oldDynamicValues);
			for (int count = 0; count < size; ++count) {
				newEnv.setBinding(varSymbol, SubLObjectFactory.makeInteger(count));
				iter.init(forms, 2);
				list_progn(iter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(iter);
			newEnv.unextend();
		}
		return SubLNil.NIL;
	}

	public static SubLObject check_type(SubLCons specialForm, SubLEnvironment env) {
		return SubLNil.NIL;
	}

	public static SubLObject cinc(SubLCons forms, SubLEnvironment env) {
		SubLObject place = forms.second();
		SubLObject delta = forms.third().eval(env);
		if (delta == SubLNil.NIL)
			delta = CommonSymbols.ONE_INTEGER;
		SubLObject value = Numbers.add(place.eval(env), delta);
		csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject clet(SubLCons specialForm, SubLEnvironment env) {
		SubLList bindings = specialForm.second().toList();
		SubLSymbol var = null;
		SubLObject initialization = null;
		SubLEnvironment newEnv = env.extend();
		SubLObject value = null;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		try {
			iter = resourcer.acquireSubLListListIterator(bindings);
			while (iter.hasNext()) {
				SubLObject binding = iter.nextSubLObject();
				if (binding.isCons()) {
					var = binding.first().toSymbol();
					initialization = binding.second();
				} else {
					var = binding.toSymbol();
					initialization = SubLNil.NIL;
				}
				try {
					SubLObject initialValue = initialization.eval(newEnv);
					SubLObject oldDynamicValue = newEnv.noteBinding(var, initialValue);
					oldDynamicValues = possiblyNoteOldDynamicValue(var, oldDynamicValue, oldDynamicValues);
				} catch (SubLException e) {

					SubLObject initialValue = initialization.eval(newEnv);
					SubLObject oldDynamicValue = newEnv.noteBinding(var, initialValue);
					oldDynamicValues = possiblyNoteOldDynamicValue(var, oldDynamicValue, oldDynamicValues);

				}
			}
			resourcer.releaseSubLListListIterator(iter);
			iter = resourcer.acquireSubLListListIterator(specialForm, 2);
			value = list_progn(iter, newEnv);
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(iter);
			newEnv.unextend();
		}
		return value;
	}

	public static SubLObject cmultiple_value_bind(SubLCons specialForm, SubLEnvironment env) {
		if (specialForm.size() < 3)
			Errors.error("cmultiple-value-bind expects at least 2 arguments, got: " + (specialForm.size() - 1));
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject value = null;
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			SubLList vars = iter.nextSubLObject().toList();
			SubLObject form = iter.nextSubLObject();
			Values.resetMultipleValues();
			SubLObject firstValue = form.eval(env);
			iter2 = resourcer.acquireSubLListListIterator(vars);
			if (vars != SubLNil.NIL) {
				int varIndex = 0;
				SubLSymbol var = iter2.nextSubLObject().toSymbol();
				SubLObject oldDynamicValue = newEnv.noteBinding(var, firstValue);
				oldDynamicValues = possiblyNoteOldDynamicValue(var, oldDynamicValue, oldDynamicValues);
				while (iter2.hasNext()) {
					var = iter2.nextSubLObject().toSymbol();
					oldDynamicValue = newEnv.noteBinding(var, Values.nthMultipleValue(++varIndex));
					oldDynamicValues = possiblyNoteOldDynamicValue(var, oldDynamicValue, oldDynamicValues);
				}
			}
			value = list_progn(iter, newEnv);
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
			newEnv.unextend();
		}
		return value;
	}

	public static SubLObject cnot(SubLObject arg) {
		boolean val = arg == SubLNil.NIL;
		return SubLObjectFactory.makeBoolean(val);
	}

	public static SubLObject cor(SubLCons specialForm, SubLEnvironment env) {
		SubLObject item = null;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			while (iter.hasNext()) {
				item = iter.nextSubLObject();
				item = item.eval(env);
				if (item != SubLNil.NIL)
					return CommonSymbols.T;
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		return SubLNil.NIL;
	}

	public static SubLObject cpop(SubLCons forms, SubLEnvironment env) {
		SubLObject place = forms.second();
		SubLList placeList = place.eval(env).toList();
		SubLObject value = placeList.rest();
		csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject cprogv(SubLCons specialForm, SubLEnvironment env) {
		SubLList varList = specialForm.second().eval(env).toList().asConsList();
		SubLObject valList = specialForm.third().eval(env).toList().asConsList();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			while (varList != SubLNil.NIL) {
				SubLSymbol curVar = varList.first().toSymbol();
				SubLObject curVal = valList.first();
				SubLObject oldDynamicValue = newEnv.noteBinding(curVar, curVal);
				oldDynamicValues = possiblyNoteOldDynamicValue(curVar, oldDynamicValue, oldDynamicValues);
				valList = valList.rest().toList();
				varList = varList.rest().toList();
			}
			return list_progn(specialForm.cdddr().toList(), newEnv);
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			newEnv.unextend();
		}
	}

	public static SubLObject cpush(SubLCons forms, SubLEnvironment env) {
		SubLObject item = forms.second().eval(env);
		SubLObject place = forms.third();
		SubLList placeList = place.eval(env).toList();
		SubLCons value = placeList.push(item);
		if (value != placeList)
			csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject cpushnew(SubLCons forms, SubLEnvironment env) {
		SubLObject item = forms.second().eval(env);
		SubLObject place = forms.third();
		SubLList placeList = place.eval(env).toList();
		SubLObject test = forms.fourth().eval(env);
		SubLObject key = forms.fifth().eval(env);
		BinaryFunction testFunc = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunc = SubLTrampolineFile.extractUnaryFunc(key);
		SubLCons value = placeList.pushNew(item, testFunc, keyFunc);
		if (value != placeList)
			csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject csetf(SubLCons specialForm, SubLEnvironment env) {
		int size = specialForm.size();
		if (specialForm.size() != 3)
			Errors.error("csetf expects 2 arguments, got: " + size + ". \nForm: " + specialForm + ".");
		SubLObject place = specialForm.second();
		SubLObject value = specialForm.third().eval(env);
		csetf_internal(place, value, env);
		return value;
	}

	public static SubLObject csetq(SubLCons specialForm, SubLEnvironment env) {
		SubLObject value = SubLNil.NIL;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			if (!iter.hasNext())
				Errors.error("CSETQ expects at least 2 arguments\nit was given " + iter.itemsRemaining() + "arguments.");
			while (iter.hasNext()) {
				SubLSymbol var = (SubLSymbol) iter.nextSubLObject();
				if (!iter.hasNext())
					Errors.error("CSETQ requires an even number of arguments.");
				SubLObject valueForm = iter.nextSubLObject();
				value = valueForm.eval(env);
				env.setBinding(var, value);
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		return value;
	}

	public static SubLObject csome(SubLCons specialForm, SubLEnvironment env) {
		SubLObject result = SubLNil.NIL;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		ArrayList oldDynamicValues = null;
		SubLEnvironment newEnv = env.extend();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			SubLObject varSpec = iter.nextSubLObject();
			SubLSymbol symbol = varSpec.first().toSymbol();
			SubLSymbol done = varSpec.third().toSymbol();
			SubLList list = varSpec.second().eval(env).toList();
			iter2 = resourcer.acquireSubLListListIterator(list);
			SubLObject oldDynamicValue = newEnv.noteBinding(symbol, SubLNil.NIL);
			oldDynamicValues = possiblyNoteOldDynamicValue(symbol, oldDynamicValue, oldDynamicValues);
			while (iter2.hasNext() && done.eval(newEnv) == SubLNil.NIL) {
				SubLObject item = iter2.nextSubLObject();
				newEnv.setBinding(symbol, item);
				iter.init(specialForm, 2);
				result = list_progn(iter, newEnv);
			}
		} finally {
			possiblyRebindDynamics(oldDynamicValues);
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
			newEnv.unextend();
		}
		return result;
	}

	public static SubLObject ctime(SubLCons specialForm, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			SubLSymbol var = specialForm.second().toSymbol();
			iter = resourcer.acquireSubLListListIterator(specialForm, 2);
			long startTime = System.nanoTime();
			SubLObject value = list_progn(iter, env);
			long endTime = System.nanoTime();
			SubLObject elapsedTime = SubLObjectFactory.makeDouble((endTime - startTime) / 1.0E9);
			env.setBinding(var, elapsedTime);
			return value;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject cunwind_protect(SubLCons specialForm, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			SubLObject protectedForm = specialForm.second();
			SubLObject value;
			try {
				value = protectedForm.eval(env);
			} finally {
				SubLObject[] allThreadBindings = SubLProcess.currentSubLThread().bindingsList;
				SubLObject oldIsCleaningUpValue = Threads.$is_thread_performing_cleanupP$.currentBinding(allThreadBindings);
				SubLObject vals = Values.getValuesAsVector();
				try {
					Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, allThreadBindings);
					iter = resourcer.acquireSubLListListIterator(specialForm, 2);
					list_progn(iter, env);
					Values.restoreValuesFromVector(vals);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(oldIsCleaningUpValue, allThreadBindings);
				}
			}
			return value;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject cvs_id(SubLCons specialForm, SubLEnvironment env) {
		SubLObject string = specialForm.second().toStr();
		return SubLNil.NIL;
	}

	public static SubLObject declaim(SubLCons specialForm, SubLEnvironment env) {
		return SubLNil.NIL;
	}

	public static SubLObject declare(SubLCons specialForm, SubLEnvironment env) {
		return SubLNil.NIL;
	}

	public static SubLObject defconstant(SubLCons specialForm, SubLEnvironment env) {
		SubLSymbol variable = specialForm.second().toSymbol();
		SubLObject initialization = specialForm.third();
		SubLObject documentation = specialForm.fourth();
		SubLFiles.defconstant(null, variable.getName(), initialization.eval(env));
		return variable;
	}

	public static SubLObject define(SubLCons specialForm, SubLEnvironment env) {
		if (specialForm.size() < 4)
			// if(false)
			Errors.error("define expects at least 3 arguments, got: " + (specialForm.size() - 1));
		if (specialForm.size() < 2)
			Errors.error("define expects at least 2 arguments, got: " + (specialForm.size()));
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			SubLSymbol name = iter.nextSubLObject().toSymbol();
			SubLList arglist = iter.nextSubLObject().toList();
			SubLCons lambdaExpression = SubLObjectFactory.makeListS(CommonSymbols.LAMBDA_SYMBOL, arglist, iter);
			SubLInterpretedFunction interpretedFunction = SubLObjectFactory.makeInterpretedFunction(name, lambdaExpression, env);
			name.setFunction(interpretedFunction);
			return name;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject deflexical(SubLCons specialForm, SubLEnvironment env) {
		SubLObject variable = specialForm.second().toSymbol();
		SubLObject initialization = specialForm.third();
		SubLObject documentation = specialForm.fourth();
		SubLFiles.deflexical(null, variable.princToString(), initialization.eval(env));
		return variable;
	}

	public static SubLObject defmacro(SubLCons specialForm, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			SubLSymbol name = iter.nextSubLObject().toSymbol();
			SubLList arglist = iter.nextSubLObject().toList();
			SubLCons lambdaExpression = ConsesLow.list(CommonSymbols.LAMBDA_SYMBOL, ConsesLow.list(CommonSymbols.MACRO_FORM, CommonSymbols.MACRO_ENV), SubLObjectFactory.makeListS(CommonSymbols.CDESTRUCTURING_BIND, arglist, ConsesLow.list(CommonSymbols.CDR, CommonSymbols.MACRO_FORM), iter)).toCons();
			SubLInterpretedFunction macroExpander = SubLObjectFactory.makeInterpretedFunction(name, lambdaExpression, env);
			SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
			name.setFunction(macro);
			return name;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject defparameter(SubLCons specialForm, SubLEnvironment env) {
		SubLObject variable = specialForm.second().toSymbol();
		SubLObject initialization = specialForm.third();
		SubLObject documentation = specialForm.fourth();
		final String varname = variable.princToString();
		SubLFiles.defparameter(null, varname, initialization.eval(env));
		return variable;
	}

	public static SubLObject defvar(SubLCons specialForm, SubLEnvironment env) {
		SubLObject variable = specialForm.second().toSymbol();
		SubLObject initialization = specialForm.third();
		SubLObject documentation = specialForm.fourth();
		SubLFiles.defvar(null, variable.princToString(), initialization.eval(env));
		return variable;
	}

	public static SubLObject enforce_must(SubLCons specialForm, SubLEnvironment env) {
		SubLObject testObj = specialForm.second();
		if (testObj.eval(env) == SubLNil.NIL) {
			SubLString formatString = specialForm.third().toStr();
			int nargs = specialForm.size() - 3;
			if (nargs == 0)
				Errors.error(formatString);
			else if (nargs == 1)
				Errors.error(formatString, specialForm.fourth().eval(env));
			else if (nargs == 2)
				Errors.error(formatString, specialForm.fourth().eval(env), specialForm.fifth().eval(env));
			else if (nargs == 3)
				Errors.error(formatString, specialForm.fourth().eval(env), specialForm.fifth().eval(env), specialForm.sixth().eval(env));
			else {
				if (nargs < 0)
					Errors.error("Got invalid enforce must construct: " + specialForm);
				SubLObject[] args = null;
				SubLListListIterator iter = null;
				Resourcer resourcer = Resourcer.getInstance();
				try {
					args = resourcer.acquireSubLObjectArray(nargs);
					iter = resourcer.acquireSubLListListIterator(specialForm, 3);
					int i = 0;
					while (iter.hasNext())
						args[i++] = iter.nextSubLObject().eval(env);
					Errors.error(formatString, args);
				} finally {
					resourcer.releaseSubLListListIterator(iter);
					resourcer.releaseSubLObjectArray(args);
				}
			}
		}
		return SubLNil.NIL;
	}

	public static SubLObject enforce_type(SubLCons specialForm, SubLEnvironment env) {
		SubLObject obj = specialForm.second();
		SubLSymbol test = specialForm.third().toSymbol();
		obj.eval(env).enforceType(test);
		return SubLNil.NIL;
	}

	public static SubLObject fif(SubLCons specialForm, SubLEnvironment env) {
		SubLObject condition = specialForm.second();
		SubLObject testCondition = condition.eval(env);
		if (testCondition != SubLNil.NIL) {
			SubLObject ifClause = specialForm.third();
			return ifClause.eval(env);
		}
		SubLObject elseClause = specialForm.fourth();
		return elseClause.eval(env);
	}

	public static SubLObject function(SubLCons specialForm, SubLEnvironment env) {
		SubLFunction function = null;
		int size = specialForm.size();
		if (size != 2)
			throw new InvalidSubLExpressionException("Got incorrect number of arguments to FUNCTION: " + specialForm);
		SubLObject object = specialForm.second();
		if (SubLInterpretedFunction.isPossiblyLambdaExpression(object, true))
			return SubLObjectFactory.makeInterpretedFunction(null, object.toCons(), env);
		if (object.isFunction())
			return object;
		if (object.isSymbol())
			return object.toSymbol().getFunction();
		return Symbols.symbol_function(object.eval(env));
	}

	public static SubLObject funless(SubLCons specialForm, SubLEnvironment env) {
		SubLObject condition = specialForm.second();
		if (condition.eval(env) == SubLNil.NIL) {
			SubLObject ifClause = specialForm.third();
			return ifClause.eval(env);
		}
		return SubLNil.NIL;
	}

	public static SubLObject fwhen(SubLCons specialForm, SubLEnvironment env) {
		SubLObject condition = specialForm.second();
		if (condition.eval(env) != SubLNil.NIL) {
			SubLObject ifClause = specialForm.third();
			return ifClause.eval(env);
		}
		return SubLNil.NIL;
	}

	public static SubLObject ignore(SubLObject[] moreValues) {
		return SubLNil.NIL;
	}

	public static SubLObject multiple_value_list(SubLCons specialForm, SubLEnvironment env) {
		SubLObject form = specialForm.second();
		Values.resetMultipleValues();
		final SubLObject retForm = form.eval(env);
		SubLList result = Values.multiple_value_list(retForm);
		Values.resetMultipleValues();
		return result;
	}

	public static SubLObject must(SubLCons specialForm, SubLEnvironment env) {
		if (Errors.$ignore_mustsP$.getValue() == SubLNil.NIL)
			return enforce_must(specialForm, env);
		return SubLNil.NIL;
	}

	public static SubLObject nth_value(SubLCons specialForm, SubLEnvironment env) {
		int n = specialForm.second().eval(env).intValue();
		SubLObject formResult = specialForm.third().eval(env);
		Values.setFirstMultipleValue(formResult);
		SubLObject result = Values.nthMultipleValue(n);
		Values.resetMultipleValues();
		return result;
	}

	public static SubLObject pcase(SubLCons specialForm, SubLEnvironment env) {
		SubLObject testObject = specialForm.second().eval(env);
		SubLList clauses = specialForm.cddr().toList();
		SubLCons clause = null;
		SubLObject key = null;
		SubLList evaluatableCode = null;
		while (clauses != SubLNil.NIL) {
			clause = clauses.first().toCons();
			clauses = clauses.rest().toList();
			key = clause.first();
			if (key.isCons()) {
				if (key.toCons().member(testObject) != SubLNil.NIL) {
					evaluatableCode = clause.rest().toList();
					return list_progn(evaluatableCode, env);
				}
				continue;
			} else {
				if (key == CommonSymbols.T || key == CommonSymbols.OTHERWISE) {
					evaluatableCode = clause.rest().toList();
					return list_progn(evaluatableCode, env);
				}
				if (key.eql(testObject)) {
					evaluatableCode = clause.rest().toList();
					return list_progn(evaluatableCode, env);
				}
				continue;
			}
		}
		return SubLNil.NIL;
	}

	public static SubLObject pcond(SubLCons specialForm, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			while (iter.hasNext()) {
				SubLList clause = iter.nextSubLObject().toList();
				SubLObject value = clause.first().eval(env);
				if (value != SubLNil.NIL) {
					resourcer.releaseSubLListListIterator(iter);
					iter = resourcer.acquireSubLListListIterator(clause, 1);
					if (iter.hasNext())
						return list_progn(iter, env);
					return value;
				}
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		return SubLNil.NIL;
	}

	public static SubLObject pif(SubLCons specialForm, SubLEnvironment env) {
		return fif(specialForm, env);
	}

	public static ArrayList possiblyNoteOldDynamicValue(SubLSymbol variable, SubLObject value, ArrayList oldDynamicValues) {
		if (variable.isDynamic()) {
			if (oldDynamicValues == null)
				oldDynamicValues = new ArrayList<SubLSymbol>();
			oldDynamicValues.add(variable);
			oldDynamicValues.add(value);
		}
		return oldDynamicValues;
	}

	public static void possiblyRebindDynamics(ArrayList oldDynamicValues) {
		if (oldDynamicValues != null) {
			int i = 0;
			int size = oldDynamicValues.size();
			while (i < size) {
				SubLSymbol dynamicVariable = (SubLSymbol) oldDynamicValues.get(i++);
				SubLObject oldDynamicValue = (SubLObject) oldDynamicValues.get(i++);
				dynamicVariable.rebind(oldDynamicValue, SubLProcess.currentSubLThread().bindingsList);
			}
		}
	}

	public static SubLObject proclaim(SubLObject declarationSpecifier) {
		if (declarationSpecifier.isCons()) {
			SubLCons declSpec = declarationSpecifier.toCons();
			SubLObject functor = declSpec.first();
			if (SubLNil.NIL != conses_high.member(functor, SubLSpecialOperatorDeclarations.accessTypes, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
				SubLObject visibility = declSpec.second();
				if (SubLNil.NIL != conses_high.member(visibility, SubLSpecialOperatorDeclarations.visibilityTypes, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
					SubLObject symbols = declSpec.cddr();
					SubLObject symbol = SubLNil.NIL;
					symbol = symbols.first();
					while (SubLNil.NIL != symbols) {
						Symbols.put(symbol, functor, visibility);
						symbols = symbols.rest();
						symbol = symbols.first();
					}
				} else
					Errors.warn(SubLObjectFactory.makeString("~S is not a known ~S visibility type."), visibility, functor);
			} else if (SubLNil.NIL != conses_high.member(functor, SubLSpecialOperatorDeclarations.inlineTypes, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
				SubLObject symbols2 = declSpec.rest();
				SubLObject symbol2 = SubLNil.NIL;
				symbol2 = symbols2.first();
				while (SubLNil.NIL != symbols2) {
					Symbols.put(symbol2, SubLSpecialOperatorDeclarations.inlineMode, functor);
					symbols2 = symbols2.rest();
					symbol2 = symbols2.first();
				}
			} else if (functor == SubLSpecialOperatorDeclarations.optimizeFuncall) {
				SubLObject symbols2 = declSpec.rest();
				SubLObject symbol2 = SubLNil.NIL;
				symbol2 = symbols2.first();
				while (SubLNil.NIL != symbols2) {
					Symbols.put(symbol2, SubLSpecialOperatorDeclarations.optimizeFuncall, CommonSymbols.T);
					symbols2 = symbols2.rest();
					symbol2 = symbols2.first();
				}
			}
		}
		return CommonSymbols.T;
	}

	public static SubLObject progn(SubLCons specialForm, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			return list_progn(iter, env);
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject punless(SubLCons specialForm, SubLEnvironment env) {
		SubLObject condition = specialForm.second();
		if (condition.eval(env) == SubLNil.NIL) {
			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				iter = resourcer.acquireSubLListListIterator(specialForm, 2);
				return list_progn(iter, env);
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		}
		return SubLNil.NIL;
	}

	public static SubLObject pwhen(SubLCons specialForm, SubLEnvironment env) {
		SubLObject condition = specialForm.second();
		if (condition.eval(env) != SubLNil.NIL) {
			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			try {
				iter = resourcer.acquireSubLListListIterator(specialForm, 2);
				return list_progn(iter, env);
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		}
		return SubLNil.NIL;
	}

	public static SubLObject quit() {
		boolean was = Main.isSubLisp();
		SubLReader o = SubLMain.getMainReader();

		if (o != null)
			o.exitReadloop();
		if (!was) {
			Interpreter interpreter = currentLisp();
			if (interpreter != null)
				interpreter.kill(0);
		}
		return SubLNil.NIL;
	}

	public static SubLObject quote(SubLCons specialForm, SubLEnvironment env) {
		return specialForm.second();
	}

	public static SubLObject ret(SubLCons specialForm, SubLEnvironment env) {
		int size = specialForm.size();
		if (size != 2)
			throw new InvalidSubLExpressionException("Got incorrect number of arguments to RET: " + specialForm);
		SubLObject form = specialForm.second();
		SubLObject returnValue = form.eval(env);
		return Dynamic.sublisp_throw(CommonSymbols.RETURN_TAG, returnValue);
	}

	public static SubLObject with_error_handler(SubLCons specialForm, SubLEnvironment env) {
		SubLObject handler = specialForm.second().eval(env);
		SubLObject oldValue = Errors.$error_handler$.getDynamicValue();
		try {
			Dynamic.bind(Errors.$error_handler$, handler);
			try {
				SubLListListIterator iter = null;
				Resourcer resourcer = Resourcer.getInstance();
				try {
					iter = resourcer.acquireSubLListListIterator(specialForm, 2);
					return list_progn(iter, env);
				} finally {
					resourcer.releaseSubLListListIterator(iter);
				}
			} catch (Throwable catch_var) {
				Errors.handleThrowable(catch_var, SubLNil.NIL);
			}
		} finally {
			Dynamic.rebind(Errors.$error_handler$, oldValue);
		}
		return SubLNil.NIL;
	}

	public static SubLObject with_static_area(SubLCons specialForm, SubLEnvironment env) {
		return progn(specialForm, env);
	}

	public static SubLObject with_thread_private_area(SubLCons specialForm, SubLEnvironment env) {
		return progn(specialForm, env);
	}

	public static SubLObject with_working_area(SubLCons specialForm, SubLEnvironment env) {
		return progn(specialForm, env);
	}

	static SubLObject list_progn(SubLList forms, SubLEnvironment env) {
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(forms);
			return list_progn(iter, env);
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject list_progn(SubLListListIterator forms, SubLEnvironment env) {
		SubLObject result = SubLNil.NIL;
		while (forms.hasNext()) {
			final SubLObject nextForm = forms.nextSubLObject();
			result = nextForm.eval(env);
		}
		return result;
	}

	public static SubLSpecialOperatorDeclarations me;
	public static SubLSymbol star;
	public static SubLSymbol doubleStar;
	public static SubLSymbol tripleStar;
	private static SubLList accessTypes;
	private static SubLList visibilityTypes;
	private static SubLList inlineTypes;
	private static SubLSymbol inlineMode;
	private static SubLSymbol optimizeFuncall;
	static {
		me = new SubLSpecialOperatorDeclarations();
		SubLSpecialOperatorDeclarations.star = null;
		SubLSpecialOperatorDeclarations.doubleStar = null;
		SubLSpecialOperatorDeclarations.tripleStar = null;
		SubLSpecialOperatorDeclarations.accessTypes = ConsesLow.list(SubLObjectFactory.makeSymbol("FACCESS"), SubLObjectFactory.makeSymbol("VACCESS"));
		SubLSpecialOperatorDeclarations.visibilityTypes = ConsesLow.list(SubLObjectFactory.makeSymbol("PRIVATE"), SubLObjectFactory.makeSymbol("PROTECTED"), SubLObjectFactory.makeSymbol("PUBLIC"));
		SubLSpecialOperatorDeclarations.inlineTypes = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"), SubLObjectFactory.makeSymbol("NOTINLINE"));
		SubLSpecialOperatorDeclarations.inlineMode = SubLObjectFactory.makeSymbol("INLINE-MODE");
		SubLSpecialOperatorDeclarations.optimizeFuncall = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");
	}

	private void declareSpecialOperator(String methodName, String symbolName) {
		try {
			Class[] parameterArray = { SubLCons.class, SubLEnvironment.class };
			Method method = this.getClass().getMethod(methodName, parameterArray);
			SubLSymbol operatorSymbol = SubLObjectFactory.makeSublispSymbol(symbolName);
			SubLCompiledFunction evaluationFunction = SubLObjectFactory.makeCompiledFunction(method, operatorSymbol, 2, 0, false);
			new SubLSpecialOperatorImpl(evaluationFunction, operatorSymbol);
		} catch (Exception e) {
			Errors.handleError("Failed to declare special operator: " + methodName, e);
		}
	}

	@Override
	public void declareFunctions() {
		declareSpecialOperator("define", "DEFINE");
		declareSpecialOperator("defmacro", "DEFMACRO");
		declareSpecialOperator("defconstant", "DEFCONSTANT");
		declareSpecialOperator("defparameter", "DEFPARAMETER");
		declareSpecialOperator("defvar", "DEFVAR");
		declareSpecialOperator("deflexical", "DEFLEXICAL");
		declareSpecialOperator("progn", "PROGN");
		declareSpecialOperator("pif", "PIF");
		declareSpecialOperator("pwhen", "PWHEN");
		declareSpecialOperator("punless", "PUNLESS");
		declareSpecialOperator("pcond", "PCOND");
		declareSpecialOperator("pcase", "PCASE");
		declareSpecialOperator("csetq", "CSETQ");
		declareSpecialOperator("csetf", "CSETF");
		declareSpecialOperator("cinc", "CINC");
		declareSpecialOperator("cdec", "CDEC");
		declareSpecialOperator("cpush", "CPUSH");
		declareSpecialOperator("cpushnew", "CPUSHNEW");
		declareSpecialOperator("cpop", "CPOP");
		declareSpecialOperator("clet", "CLET");
		declareSpecialOperator("cprogv", "CPROGV");
		declareSpecialOperator("cmultiple_value_bind", "CMULTIPLE-VALUE-BIND");
		declareSpecialOperator("multiple_value_list", "MULTIPLE-VALUE-LIST");
		declareSpecialOperator("nth_value", "NTH-VALUE");
		declareSpecialOperator("cdo", "CDO");
		declareSpecialOperator("cdotimes", "CDOTIMES");
		declareSpecialOperator("cdolist", "CDOLIST");
		declareSpecialOperator("csome", "CSOME");
		declareSpecialOperator("cdohash", "CDOHASH");
		declareSpecialOperator("cdo_symbols", "CDO-SYMBOLS");
		declareSpecialOperator("cdo_all_symbols", "CDO-ALL-SYMBOLS");
		declareSpecialOperator("cdo_external_symbols", "CDO-EXTERNAL-SYMBOLS");
		declareSpecialOperator("ccatch", "CCATCH");
		declareSpecialOperator("cunwind_protect", "CUNWIND-PROTECT");
		declareSpecialOperator("ctime", "CTIME");
		declareSpecialOperator("ret", "RET");
		declareSpecialOperator("enforce_type", "ENFORCE-TYPE");
		declareSpecialOperator("check_type", "CHECK-TYPE");
		declareSpecialOperator("enforce_must", "ENFORCE-MUST");
		declareSpecialOperator("must", "MUST");
		SubLFiles.declareFunction(me, "cnot", "CNOT", 1, 0, false);
		declareSpecialOperator("cand", "CAND");
		declareSpecialOperator("cor", "COR");
		declareSpecialOperator("fif", "FIF");
		declareSpecialOperator("fwhen", "FWHEN");
		declareSpecialOperator("funless", "FUNLESS");
		SubLFiles.declareFunction(me, "ignore", "IGNORE", 0, 0, true);
		declareSpecialOperator("cvs_id", "CVS-ID");
		declareSpecialOperator("declare", "DECLARE");
		declareSpecialOperator("declaim", "DECLAIM");
		SubLFiles.declareFunction(me, "proclaim", "PROCLAIM", 1, 0, false);
		declareSpecialOperator("quote", "QUOTE");
		declareSpecialOperator("function", "FUNCTION");
		declareSpecialOperator("with_error_handler", "WITH-ERROR-HANDLER");
		declareSpecialOperator("with_static_area", "WITH-STATIC-AREA");
		declareSpecialOperator("with_thread_private_area", "WITH-THREAD-PRIVATE-AREA");
		declareSpecialOperator("with_working_area", "WITH-WORKING-AREA");
		SubLFiles.declareFunction(me, "quit", "QUIT", 0, 0, false);
	}

	@Override
	public void initializeVariables() {
		SubLSpecialOperatorDeclarations.star = SubLFiles.defvar(me, "*", SubLNil.NIL);
		SubLSpecialOperatorDeclarations.doubleStar = SubLFiles.defvar(me, "**", SubLNil.NIL);
		SubLSpecialOperatorDeclarations.tripleStar = SubLFiles.defvar(me, "***", SubLNil.NIL);
	}

	@Override
	public void runTopLevelForms() {
	}
}

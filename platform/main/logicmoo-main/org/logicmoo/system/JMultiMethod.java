package org.logicmoo.system;

import java.lang.reflect.Method;

import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLOperator;

public interface JMultiMethod {

	void addMethod(Method m);

	AbstractSubLOperator toLispObject();

	boolean isSubLispBased();

	SubLObject superApply(SubLCons form, SubLEnvironment env);

	Object invokeFromProlog(Term list, Term result) throws Exception;

}

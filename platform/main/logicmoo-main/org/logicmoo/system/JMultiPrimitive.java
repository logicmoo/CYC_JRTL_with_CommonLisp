/*
   This file is part of the LarKC platform
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.logicmoo.system;

import java.lang.reflect.Method;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.Symbol;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class JMultiPrimitive extends Primitive implements JMultiMethod {

	final JMultiMethodSelector impl;

	public JMultiPrimitive(Symbol sym) {
		super(sym, "&rest any");
		impl = new JMultiMethodSelector(this);
	}

	@Override
	public void addMethod(Method m) {
		impl.addMethod(m);
	}

	@Override
	public LispObject arrayify(LispObject... args) {
		return impl.executeEVA(null, args);
	}

	@Override
	public LispObject execute(LispObject args, Environment env) {
		return impl.executeAE(args, env);
	}

	@Override
	public LispObject execute(LispObject[] args) {
		return impl.executeEVA(Environment.currentLispEnvironment(), args);
	}

	@Override
	public SubLObject apply(SubLCons p0, SubLEnvironment p1) {
		return getBinaryFunction().processItem(p0, p1);
		// return Lisp.eval(cons, env);
		// Errors.unimplementedMethod("Auto-generated method stub:
		// SubLFunction.apply");
		// return null;
	}

	@Override
	public SubLObject superApply(SubLCons p0, SubLEnvironment p1) {
		return super.apply(p0, p1);
	}

	@Override
	public LispObject funcallCL(LispObject... args) {
		return this.execute(args);
	}

	@Override
	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
		if (isSubLispBased()) {
			return super.evalViaApply(form, env);
		}
		return Lisp.eval((Cons) form, (Environment) env);
	}

	@Override
	public boolean isInterpreted() {
		return true;
	}

	@Override
	public boolean isFunction() {
		return impl.isFunction();
	}

	@Override
	public boolean isSpecial() {
		return impl.isSpecial();
	}

	@Override
	public boolean isSpecialRestOnly() {
		if (super.isSpecialRestOnly()) {
			return true;
		}
		return false;
	}

	@Override
	public Object invokeFromProlog(Term list, Term result) throws Exception {
		return impl.invokeFromProlog(list, result);
	}

}
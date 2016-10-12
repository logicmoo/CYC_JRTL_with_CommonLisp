/*
 * Environment.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Environment.java 12513 2010-03-02 22:35:36Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Environment extends AbstractLispObject {
	// ### make-environment
	public static Primitive MAKE_ENVIRONMENT = new JavaPrimitive("make-environment", Lisp.PACKAGE_SYS, true,
			"&optional parent-environment") {

		public SubLObject execute() {
			return new Environment();
		}

		public SubLObject execute(SubLObject arg) {
			if (arg == Lisp.NIL)
				return new Environment();
			return new Environment(Lisp.checkEnvironment(arg));
		}
	};
	// ### environment-add-macro-definition
	public static Primitive ENVIRONMENT_ADD_MACRO_DEFINITION = new JavaPrimitive("environment-add-macro-definition",
			Lisp.PACKAGE_SYS, true, "environment name expander") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			Environment env = Lisp.checkEnvironment(first);
			SubLObject name = second;
			SubLObject expander = third;
			env.addFunctionBinding(name, expander);
			return env;
		}
	};
	// ### environment-add-function-definition
	public static Primitive ENVIRONMENT_ADD_FUNCTION_DEFINITION = new JavaPrimitive(
			"environment-add-function-definition", Lisp.PACKAGE_SYS, true, "environment name lambda-expression") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			Lisp.checkEnvironment(first).addFunctionBinding(second, third);
			return first;
		}
	};
	// ### environment-add-symbol-binding
	public static Primitive ENVIRONMENT_ADD_SYMBOL_BINDING = new JavaPrimitive("environment-add-symbol-binding",
			Lisp.PACKAGE_SYS, true, "environment symbol value") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			Lisp.checkEnvironment(first).bindSymbolVoid(Lisp.checkSymbol(second), third);
			return first;
		}
	};
	// ### empty-environment-p
	private static Primitive EMPTY_ENVIRONMENT_P = new JavaPrimitive("empty-environment-p", Lisp.PACKAGE_SYS, true,
			"environment") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkEnvironment(arg).isEmpty() ? Lisp.T : Lisp.NIL;
		}
	};

	// ### environment-variables
	private static Primitive ENVIRONMENT_VARS = new JavaPrimitive("environment-variables", Lisp.PACKAGE_SYS, true,
			"environment") {

		public SubLObject execute(SubLObject arg) {
			Environment env = Lisp.checkEnvironment(arg);
			SubLObject result = Lisp.NIL;
			for (Binding binding = env.vars; binding != null; binding = binding.next)
				if (!binding.specialp)
					result = result.push(LispObjectFactory.makeCons(binding.symbol, binding.value));
			return result.nreverse();
		}
	};

	// ### environment-all-variables
	private static Primitive ENVIRONMENT_ALL_VARS = new JavaPrimitive("environment-all-variables", Lisp.PACKAGE_SYS,
			true, "environment") {

		public SubLObject execute(SubLObject arg) {
			Environment env = Lisp.checkEnvironment(arg);
			SubLObject result = Lisp.NIL;
			for (Binding binding = env.vars; binding != null; binding = binding.next)
				if (binding.specialp)
					result = result.push(binding.symbol);
				else
					result = result.push(LispObjectFactory.makeCons(binding.symbol, binding.value));
			return result.nreverse();
		}
	};

	// ### environment-all-functions
	private static Primitive ENVIRONMENT_ALL_FUNS = new JavaPrimitive("environment-all-functions", Lisp.PACKAGE_SYS,
			true, "environment") {

		public SubLObject execute(SubLObject arg) {
			Environment env = Lisp.checkEnvironment(arg);
			SubLObject result = Lisp.NIL;
			for (FunctionBinding binding = env.lastFunctionBinding; binding != null; binding = binding.next)
				result = result.push(LispObjectFactory.makeCons(binding.name, binding.value));
			return result.nreverse();
		}
	};

	Binding vars;

	FunctionBinding lastFunctionBinding;

	private Binding blocks;

	private Binding tags;

	public boolean inactive; // default value: false == active

	public Environment() {
	}

	public Environment(Environment parent) {
		if (parent != null) {
			this.vars = parent.vars;
			this.lastFunctionBinding = parent.lastFunctionBinding;
			this.blocks = parent.blocks;
			this.tags = parent.tags;
		}
	}

	// Construct a new Environment extending parent with the specified symbol-
	// value binding.
	public Environment(Environment parent, SubLSymbol symbol, SubLObject value) {
		this(parent);
		this.vars = new Binding(symbol, value, this.vars);
	}

	public void addBlock(SubLObject symbol, SubLObject block) {
		this.blocks = new Binding(symbol, this, block, this.blocks);
	}

	// Function bindings.
	public void addFunctionBinding(SubLObject name, SubLObject value) {
		if (Main.isSubLisp) {
			Errors.warn("flet?!!?" + name);
		}
		this.lastFunctionBinding = new FunctionBinding(name, value, this.lastFunctionBinding);
	}

	public void addTagBinding(SubLObject tag, SubLObject code) {
		this.tags = new Binding(tag, this, code, this.tags);
	}

	public void bindSymbolVoid(SubLSymbol symbol, SubLObject value) {
		this.vars = new Binding(symbol, value, this.vars);
	}

	public SubLObject classOf() {
		return BuiltInClass.ENVIRONMENT;
	}

	public void declareSpecial(SubLSymbol var) {
		this.vars = new Binding(var, null, this.vars);
		this.vars.specialp = true;
	}

	public Binding getBinding(SubLObject symbol) {
		Binding binding = this.vars;
		while (binding != null) {
			if (binding.symbol == symbol)
				return binding;
			binding = binding.next;
		}
		return null;
	}

	public Binding getBlockBinding(SubLObject block) {
		Binding binding = this.blocks;
		while (binding != null) {
			if (binding.symbol == block)
				return binding;
			binding = binding.next;
		}
		return null;
	}

	public Binding getTagBinding(SubLObject tag) {
		Binding binding = this.tags;
		while (binding != null) {
			if (binding.symbol.eql(tag))
				return binding;
			binding = binding.next;
		}
		return null;
	}

	/**
	 * Return true if a symbol is declared special.
	 *
	 * If there is no binding in the current (lexical) environment, the current
	 * dynamic environment (thread) is checked.
	 */
	public boolean isDeclaredSpecial(SubLSymbol var) {
		Binding binding = this.getBinding(var);
		return binding != null ? binding.specialp : LispThread.currentThread().getSpecialBinding(var) != null;
	}

	public boolean isEmpty() {
		if (this.lastFunctionBinding != null)
			return false;
		if (this.vars != null)
			for (Binding binding = this.vars; binding != null; binding = binding.next)
				if (!binding.specialp)
					return false;
		return true;
	}

	public SubLObject lookup(SubLObject symbol) {
		Binding binding = this.vars;
		while (binding != null) {
			if (binding.symbol == symbol)
				return binding.value;
			binding = binding.next;
		}
		return null;
	}

	public SubLObject lookupBlock(SubLObject symbol) {
		Binding binding = this.blocks;
		while (binding != null) {
			if (binding.symbol == symbol)
				return binding.value;
			binding = binding.next;
		}
		return null;
	}

	public SubLObject lookupFunction(SubLObject name)

	{
		FunctionBinding binding = this.lastFunctionBinding;
		if (name instanceof SubLSymbol) {
			while (binding != null) {
				if (binding.name == name)
					return binding.value;
				binding = binding.next;
			}
			// Not found in environment.
			return name.getSymbolFunction();
		}
		if (name instanceof SubLCons)
			while (binding != null) {
				if (binding.name.equal(name))
					return binding.value;
				binding = binding.next;
			}
		return null;
	}

	// Returns body with declarations removed.
	public SubLObject processDeclarations(SubLObject body)

	{
		SubLObject bodyAndDecls = Lisp.parseBody(body, false);
		SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
		for (; specials != Lisp.NIL; specials = specials.rest())
			this.declareSpecial(Lisp.checkSymbol(specials.first()));

		return bodyAndDecls.first();
	}

	public void rebind(SubLSymbol symbol, SubLObject value) {
		Binding binding = this.getBinding(symbol);
		binding.value = value;
	}

	public SubLObject typeOf() {
		return LispSymbols.ENVIRONMENT;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.ENVIRONMENT)
			return Lisp.T;
		if (type == BuiltInClass.ENVIRONMENT)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		return this.unreadableString(LispSymbols.ENVIRONMENT);
	}
}

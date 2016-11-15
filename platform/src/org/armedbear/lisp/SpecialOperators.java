/*
 * SpecialOperators.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: SpecialOperators.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.util.LinkedList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SpecialOperators {
	private static class sf_declare extends SpecialOperator {
		sf_declare() {
			super(LispSymbols.DECLARE, "&rest declaration-specifiers");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return Lisp.NIL;
		}
	}

	private static class sf_flet extends SpecialOperator {
		sf_flet() {
			super(LispSymbols.FLET, "definitions &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return SpecialOperators._flet(args, env, false);
		}
	};

	private static class sf_function extends SpecialOperator {
		sf_function() {
			super(LispSymbols.FUNCTION, "thing");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return function_info.coerce_function(args, env, false);
		}

	}

	private static class sf_if extends SpecialOperator {
		sf_if() {
			super(LispSymbols.IF, "test then &optional else");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			LispThread thread = LispThread.currentThread();
			switch (args.cl_length()) {
			case 2: {
				if (Lisp.eval(((SubLCons) args).first(), env, thread) != Lisp.NIL)
					return Lisp.eval(args.second(), env, thread);
				thread.clearValues();
				return Lisp.NIL;
			}
			case 3: {
				if (Lisp.eval(((SubLCons) args).first(), env, thread) != Lisp.NIL)
					return Lisp.eval(args.second(), env, thread);
				return Lisp.eval(((SubLCons) args).rest().second(), env, thread);
			}
			default:
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			}
		}
	};

	private static class sf_labels extends SpecialOperator {
		sf_labels() {
			super(LispSymbols.LABELS, "definitions &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return SpecialOperators._flet(args, env, true);
		}
	}

	private static class sf_let extends SpecialOperator {
		sf_let() {
			super(LispSymbols.LET, "bindings &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args == Lisp.NIL)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			return SpecialOperators._let(args, env, false);
		}
	};

	private static class sf_let_star extends SpecialOperator {
		sf_let_star() {
			super(LispSymbols.LET_STAR, "bindings &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args == Lisp.NIL)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			return SpecialOperators._let(args, env, true);
		}
	}

	private static class sf_load_time_value extends SpecialOperator {
		sf_load_time_value() {
			super(LispSymbols.LOAD_TIME_VALUE, "form &optional read-only-p");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			switch (args.cl_length()) {
			case 1:
			case 2:
				return Lisp.eval(args.first(), new Environment(), LispThread.currentThread());
			default:
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			}
		}
	};

	private static class sf_locally extends SpecialOperator {
		sf_locally() {
			super(LispSymbols.LOCALLY, "&body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			LispThread thread = LispThread.currentThread();
			Environment ext = new Environment(env);
			args = ext.processDeclarations(args);
			return Lisp.progn(args, ext, thread);
		}
	}

	private static class sf_progn extends SpecialOperator {
		sf_progn() {
			super(LispSymbols.PROGN, "&rest forms");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			LispThread thread = LispThread.currentThread();
			return Lisp.progn(args, env, thread);
		}
	}

	private static class sf_progv extends SpecialOperator {
		sf_progv() {
			super(LispSymbols.PROGV, "symbols values &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args.cl_length() < 2)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			LispThread thread = LispThread.currentThread();
			SubLObject symbols = Lisp.checkList(Lisp.eval(args.first(), env, thread));
			SubLObject values = Lisp.checkList(Lisp.eval(args.second(), env, thread));
			SpecialBindingsMark mark = thread.markSpecialBindings();
			try {
				// Set up the new bindings.
				Lisp.progvBindVars(symbols, values, thread);
				// Implicit PROGN.
				return Lisp.progn(args.rest().rest(), env, thread);
			} finally {
				thread.resetSpecialBindings(mark);
			}
		}
	};

	private static class sf_quote extends SpecialOperator {
		sf_quote() {
			super(LispSymbols.QUOTE, "thing");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args.rest() != Lisp.NIL)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			return args.first();
		}
	}

	private static class sf_setq extends SpecialOperator {
		sf_setq() {
			super(LispSymbols.SETQ, "&rest vars-and-values");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			SubLObject value = Nil.NIL;
			LispThread thread = LispThread.currentThread();
			while (args != Lisp.NIL) {
				SubLSymbol symbol = Lisp.checkSymbol(args.first());
				if (symbol.isConstant())
					return Lisp
							.error(new ProgramError(symbol.writeToString() + " is a constant and thus cannot be set."));
				args = args.rest();
				if (symbol.isSpecialVariable() || env.isDeclaredSpecial(symbol)) {
					SpecialBinding binding = thread.getSpecialBinding(symbol);
					if (binding != null) {
						if (binding.value instanceof SymbolMacro) {
							SubLObject expansion = ((SymbolMacro) binding.value).getExpansion();
							SubLObject form = Lisp.list(LispSymbols.SETF, expansion, args.first());
							value = Lisp.eval(form, env, thread);
						} else {
							value = Lisp.eval(args.first(), env, thread);
							binding.value = value;
						}
					} else if (symbol.getSymbolValue() instanceof SymbolMacro) {
						SubLObject expansion = ((SymbolMacro) symbol.getSymbolValue()).getExpansion();
						SubLObject form = Lisp.list(LispSymbols.SETF, expansion, args.first());
						value = Lisp.eval(form, env, thread);
					} else {
						value = Lisp.eval(args.first(), env, thread);
						symbol.setSymbolValue(value);
					}
				} else {
					// Not special.
					Binding binding = env.getBinding(symbol);
					if (binding != null) {
						if (binding.value instanceof SymbolMacro) {
							SubLObject expansion = ((SymbolMacro) binding.value).getExpansion();
							SubLObject form = Lisp.list(LispSymbols.SETF, expansion, args.first());
							value = Lisp.eval(form, env, thread);
						} else {
							value = Lisp.eval(args.first(), env, thread);
							binding.value = value;
						}
					} else if (symbol.getSymbolValue() instanceof SymbolMacro) {
						SubLObject expansion = ((SymbolMacro) symbol.getSymbolValue()).getExpansion();
						SubLObject form = Lisp.list(LispSymbols.SETF, expansion, args.first());
						value = Lisp.eval(form, env, thread);
					} else {
						value = Lisp.eval(args.first(), env, thread);
						symbol.setSymbolValue(value);
					}
				}
				args = args.rest();
			}
			// Return primary value only!
			thread._values = null;
			return value;
		}
	};

	private static class sf_symbol_macrolet extends SpecialOperator {
		sf_symbol_macrolet() {
			super(LispSymbols.SYMBOL_MACROLET, "macrobindings &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			SubLObject varList = Lisp.checkList(args.first());
			LispThread thread = LispThread.currentThread();
			SpecialBindingsMark mark = thread.markSpecialBindings();
			Environment ext = new Environment(env);
			try {
				// Declare our free specials, this will correctly raise
				SubLObject body = ext.processDeclarations(args.rest());

				for (int i = varList.cl_length(); i-- > 0;) {
					SubLObject obj = varList.first();
					varList = varList.rest();
					if (obj instanceof SubLCons && obj.cl_length() == 2) {
						SubLSymbol symbol = Lisp.checkSymbol(obj.first());
						if (symbol.isSpecialVariable() || ext.isDeclaredSpecial(symbol))
							return Lisp.error(new ProgramError("Attempt to bind the special variable "
									+ symbol.writeToString() + " with SYMBOL-MACROLET."));
						Lisp.bindArg(null, symbol, new SymbolMacro(obj.second()), ext, thread);
					} else
						return Lisp.error(new ProgramError(
								"Malformed symbol-expansion pair in SYMBOL-MACROLET: " + obj.writeToString()));
				}
				return Lisp.progn(body, ext, thread);
			} finally {
				thread.resetSpecialBindings(mark);
			}
		}
	}

	private static class sf_the extends SpecialOperator {
		sf_the() {
			super(LispSymbols.THE, "type value");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args.cl_length() != 2)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			SubLObject rv = Lisp.eval(args.second(), env, LispThread.currentThread());

			// check only the most simple types: single symbols
			// (class type specifiers/primitive types)
			// DEFTYPE-d types need expansion;
			// doing so would slow down our execution too much

			// An implementation is allowed not to check the type,
			// the fact that we do so here is mainly driven by the
			// requirement to verify argument types in structure-slot
			// accessors (defstruct.lisp)

			// The policy below is in line with the level of verification
			// in the compiler at *safety* levels below 3
			SubLObject type = args.first();
			if (type instanceof SubLSymbol && Lisp.get(type, LispSymbols.DEFTYPE_DEFINITION) == Lisp.NIL
					|| type instanceof BuiltInClass)
				if (rv.typep(type) == Lisp.NIL)
					Lisp.type_error(rv, type);

			return rv;
		}
	};

	// ### quote
	private static SpecialOperator QUOTE = new sf_quote();

	// ### if
	private static SpecialOperator IF = new sf_if();;

	// ### let
	private static SpecialOperator LET = new sf_let();

	// ### let*
	private static SpecialOperator LET_STAR = new sf_let_star();;

	// ### symbol-macrolet
	private static SpecialOperator SYMBOL_MACROLET = new sf_symbol_macrolet();

	// ### load-time-value form &optional read-only-p => object
	private static SpecialOperator LOAD_TIME_VALUE = new sf_load_time_value();;

	// ### locally
	private static SpecialOperator LOCALLY = new sf_locally();

	// ### progn
	private static SpecialOperator PROGN = new sf_progn();

	// ### flet
	private static SpecialOperator FLET = new sf_flet();;

	// ### labels
	private static SpecialOperator LABELS = new sf_labels();

	// ### the value-type form => result*
	private static SpecialOperator THE = new sf_the();;

	// ### progv
	private static SpecialOperator PROGV = new sf_progv();

	// ### declare
	private static SpecialOperator DECLARE = new sf_declare();;

	// ### function
	private static SpecialOperator FUNCTION = new sf_function();

	// ### setq
	private static SpecialOperator SETQ = new sf_setq();;

	static SubLObject _flet(SubLObject args, Environment env, boolean recursive)

	{
		// First argument is a list of local function definitions.
		SubLObject defs = Lisp.checkList(args.first());
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		Environment funEnv = new Environment(env);
		while (defs != Lisp.NIL) {
			SubLObject def = Lisp.checkList(defs.first());
			SubLObject name = def.first();
			SubLSymbol symbol;
			if (name instanceof SubLSymbol) {
				symbol = Lisp.checkSymbol(name);
				if (symbol.getSymbolFunction() instanceof SpecialOperator) {
					String message = symbol.getJavaSymbolName() + " is a special operator and may not be redefined";
					return Lisp.error(new ProgramError(message));
				}
			} else if (Lisp.isValidSetfFunctionName(name))
				symbol = Lisp.checkSymbol(name.second());
			else
				return Lisp.type_error(name, Lisp.FUNCTION_NAME);
			SubLObject rest = def.rest();
			SubLObject parameters = rest.first();
			SubLObject body = rest.rest();
			SubLObject decls = Lisp.NIL;
			while (body.first() instanceof SubLCons && body.first().first() == LispSymbols.DECLARE) {
				decls = LispObjectFactory.makeCons(body.first(), decls);
				body = body.rest();
			}
			body = LispObjectFactory.makeCons(symbol, body);
			body = LispObjectFactory.makeCons(LispSymbols.BLOCK, body);
			body = LispObjectFactory.makeCons(body, Lisp.NIL);
			while (decls != Lisp.NIL) {
				body = LispObjectFactory.makeCons(decls.first(), body);
				decls = decls.rest();
			}
			SubLObject lambda_expression = LispObjectFactory.makeCons(LispSymbols.LAMBDA,
					LispObjectFactory.makeCons(parameters, body));
			SubLObject lambda_name = Lisp.list(recursive ? LispSymbols.LABELS : LispSymbols.FLET, name);
			Closure closure = new Closure(lambda_name, lambda_expression, recursive ? funEnv : env);
			funEnv.addFunctionBinding(name, closure);
			defs = defs.rest();
		}
		try {
			Environment ext = new Environment(funEnv);
			SubLObject body = args.rest();
			body = ext.processDeclarations(body);
			return Lisp.progn(body, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	static SubLObject _let(SubLObject args, Environment env, boolean sequential)

	{
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		try {
			SubLObject varList = Lisp.checkList(args.first());
			SubLObject bodyAndDecls = Lisp.parseBody(args.rest(), false);
			SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
			SubLObject body = bodyAndDecls.first();

			Environment ext = new Environment(env);
			LinkedList<SubLCons> nonSequentialVars = new LinkedList<SubLCons>();
			while (varList != Lisp.NIL) {
				SubLSymbol symbol;
				SubLObject value;
				SubLObject obj = varList.first();
				if (obj instanceof SubLCons) {
					if (obj.cl_length() > 2)
						return Lisp.error(new LispError("The " + (sequential ? "LET*" : "LET")
								+ " binding specification " + obj.writeToString() + " is invalid."));
					symbol = Lisp.checkSymbol(((SubLCons) obj).first());
					value = Lisp.eval(obj.second(), sequential ? ext : env, thread);
				} else {
					symbol = Lisp.checkSymbol(obj);
					value = Lisp.NIL;
				}
				if (sequential) {
					ext = new Environment(ext);
					Lisp.bindArg(specials, symbol, value, ext, thread);
				} else
					nonSequentialVars.add(LispObjectFactory.makeCons(symbol, value));
				varList = ((SubLCons) varList).rest();
			}
			if (!sequential)
				for (SubLCons x : nonSequentialVars)
					Lisp.bindArg(specials, (SubLSymbol) x.first(), x.rest(), ext, thread);

			// Make sure free special declarations are visible in the body.
			// "The scope of free declarations specifically does not include
			// initialization forms for bindings established by the form
			// containing the declarations." (3.3.4)
			for (; specials != Lisp.NIL; specials = specials.rest())
				ext.declareSpecial((SubLSymbol) specials.first());

			return Lisp.progn(body, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	};
}

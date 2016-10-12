/*
 * Do.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Do.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Do {
	public static class dolist extends SpecialOperator {
		protected dolist() {
			super(LispSymbols.DOLIST);
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			SubLObject bodyForm = args.rest();
			args = args.first();
			SubLSymbol var = Lisp.checkSymbol(args.first());
			SubLObject listForm = args.second();
			LispThread thread = LispThread.currentThread();
			SubLObject resultForm = args.rest().rest().first();
			SpecialBindingsMark mark = thread.markSpecialBindings();
			// Process declarations.
			SubLObject bodyAndDecls = Lisp.parseBody(bodyForm, false);
			SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
			bodyForm = bodyAndDecls.first();

			SubLObject blockId = new BlockLispObject();
			Environment ext = new Environment(env);
			try {
				// Implicit block.
				ext.addBlock(Lisp.NIL, blockId);
				// Evaluate the list form.
				SubLObject list = Lisp.checkList(Lisp.eval(listForm, ext, thread));
				// Look for tags.
				SubLObject remaining = bodyForm;
				SubLObject localTags = Lisp.preprocessTagBody(bodyForm, ext);

				Object binding;
				if (specials != Lisp.NIL && Lisp.memq(var, specials)) {
					thread.bindSpecial(var, null);
					binding = thread.getSpecialBinding(var);
					ext.declareSpecial(var);
				} else if (var.isSpecialVariable()) {
					thread.bindSpecial(var, null);
					binding = thread.getSpecialBinding(var);
				} else {
					ext.bindSymbolVoid(var, null);
					binding = ext.getBinding(var);
				}
				while (specials != Lisp.NIL) {
					ext.declareSpecial(Lisp.checkSymbol(specials.first()));
					specials = specials.rest();
				}
				while (list != Lisp.NIL) {
					if (binding instanceof SpecialBinding)
						((SpecialBinding) binding).value = list.first();
					else
						((Binding) binding).value = list.first();

					Lisp.processTagBody(bodyForm, localTags, ext);

					list = list.rest();
					if (Lisp.interrupted)
						Lisp.handleInterrupt();
				}
				if (binding instanceof SpecialBinding)
					((SpecialBinding) binding).value = Lisp.NIL;
				else
					((Binding) binding).value = Lisp.NIL;
				SubLObject result = Lisp.eval(resultForm, ext, thread);
				return result;
			} catch (Return ret) {
				if (ret.getBlock() == blockId)
					return ret.getResult();
				throw ret;
			} finally {
				thread.resetSpecialBindings(mark);
				ext.inactive = true;
			}
		}
	}

	public static class dotimes extends SpecialOperator {
		dotimes() {
			super(LispSymbols.DOTIMES);
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			SubLObject bodyForm = args.rest();
			args = args.first();
			SubLSymbol var = Lisp.checkSymbol(args.first());
			SubLObject countForm = args.second();
			LispThread thread = LispThread.currentThread();
			SubLObject resultForm = args.rest().rest().first();
			SpecialBindingsMark mark = thread.markSpecialBindings();

			SubLObject bodyAndDecls = Lisp.parseBody(bodyForm, false);
			SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
			bodyForm = bodyAndDecls.first();

			SubLObject blockId = new BlockLispObject();
			Environment ext = new Environment(env);
			try {
				ext.addBlock(Lisp.NIL, blockId);

				SubLObject limit = Lisp.eval(countForm, ext, thread);
				SubLObject localTags = Lisp.preprocessTagBody(bodyForm, ext);

				SubLObject result;
				// Establish a reusable binding.
				Object binding;
				if (specials != Lisp.NIL && Lisp.memq(var, specials)) {
					thread.bindSpecial(var, null);
					binding = thread.getSpecialBinding(var);
					ext.declareSpecial(var);
				} else if (var.isSpecialVariable()) {
					thread.bindSpecial(var, null);
					binding = thread.getSpecialBinding(var);
				} else {
					ext.bindSymbolVoid(var, null);
					binding = ext.getBinding(var);
				}
				while (specials != Lisp.NIL) {
					ext.declareSpecial(Lisp.checkSymbol(specials.first()));
					specials = specials.rest();
				}
				if (limit instanceof Fixnum) {
					int count = ((Fixnum) limit).value;
					int i;
					for (i = 0; i < count; i++) {
						if (binding instanceof SpecialBinding)
							((SpecialBinding) binding).value = LispObjectFactory.makeInteger(i);
						else
							((Binding) binding).value = LispObjectFactory.makeInteger(i);

						Lisp.processTagBody(bodyForm, localTags, ext);

						if (Lisp.interrupted)
							Lisp.handleInterrupt();
					}
					if (binding instanceof SpecialBinding)
						((SpecialBinding) binding).value = LispObjectFactory.makeInteger(i);
					else
						((Binding) binding).value = LispObjectFactory.makeInteger(i);
					result = Lisp.eval(resultForm, ext, thread);
				} else if (limit instanceof Bignum) {
					SubLObject i = Fixnum.ZERO;
					while (i.numL(limit)) {
						if (binding instanceof SpecialBinding)
							((SpecialBinding) binding).value = i;
						else
							((Binding) binding).value = i;

						Lisp.processTagBody(bodyForm, localTags, ext);

						i = i.inc();
						if (Lisp.interrupted)
							Lisp.handleInterrupt();
					}
					if (binding instanceof SpecialBinding)
						((SpecialBinding) binding).value = i;
					else
						((Binding) binding).value = i;
					result = Lisp.eval(resultForm, ext, thread);
				} else
					return Lisp.error(new TypeError(limit, LispSymbols.INTEGER));
				return result;
			} catch (Return ret) {
				if (ret.getBlock() == blockId)
					return ret.getResult();
				throw ret;
			} finally {
				thread.resetSpecialBindings(mark);
				ext.inactive = true;
			}
		}
	};

	private static class sf_do extends SpecialOperator {
		sf_do() {
			super(LispSymbols.DO, "varlist endlist &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return Do._do(args, env, false);
		}
	}

	private static class sf_do_star extends SpecialOperator {
		sf_do_star() {
			super(LispSymbols.DO_STAR, "varlist endlist &body body");
		}

		public SubLObject execute(SubLObject args, Environment env)

		{
			return Do._do(args, env, true);
		}
	};

	// ### do
	private static SpecialOperator DO = new sf_do();

	// ### do*
	private static SpecialOperator DO_STAR = new sf_do_star();

	// ### dolist
	private static dolist DOLIST = new dolist();

	private static dotimes DOTIMES = new dotimes();

	static SubLObject _do(SubLObject args, Environment env, boolean sequential)

	{
		SubLObject varlist = args.first();
		SubLObject second = args.second();
		SubLObject end_test_form = second.first();
		SubLObject result_forms = second.rest();
		SubLObject body = args.cddr();
		// Process variable specifications.
		int numvars = varlist.cl_length();
		SubLSymbol[] vars = new SubLSymbol[numvars];
		SubLObject[] initforms = LispObjectFactory.makeLispObjectArray(numvars);
		SubLObject[] stepforms = LispObjectFactory.makeLispObjectArray(numvars);
		for (int i = 0; i < numvars; i++) {
			SubLObject varspec = varlist.first();
			if (varspec instanceof SubLCons) {
				vars[i] = Lisp.checkSymbol(varspec.first());
				initforms[i] = varspec.second();
				// Is there a step form?
				if (varspec.cddr() != Lisp.NIL)
					stepforms[i] = varspec.third();
			} else {
				// Not a cons, must be a symbol.
				vars[i] = Lisp.checkSymbol(varspec);
				initforms[i] = Lisp.NIL;
			}
			varlist = varlist.rest();
		}
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		// Process declarations.

		SubLObject bodyAndDecls = Lisp.parseBody(body, false);
		SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
		body = bodyAndDecls.first();

		Environment ext = new Environment(env);
		for (int i = 0; i < numvars; i++) {
			SubLSymbol var = vars[i];
			SubLObject value = Lisp.eval(initforms[i], sequential ? ext : env, thread);
			ext = new Environment(ext);
			if (specials != Lisp.NIL && Lisp.memq(var, specials))
				thread.bindSpecial(var, value);
			else if (var.isSpecialVariable())
				thread.bindSpecial(var, value);
			else
				ext.bindSymbolVoid(var, value);
		}
		SubLObject list = specials;
		while (list != Lisp.NIL) {
			ext.declareSpecial(Lisp.checkSymbol(list.first()));
			list = list.rest();
		}
		// Look for tags.
		SubLObject localTags = Lisp.preprocessTagBody(body, ext);
		SubLObject blockId = new BlockLispObject();
		try {
			// Implicit block.
			ext.addBlock(Lisp.NIL, blockId);
			while (true) {
				// Execute body.
				// Test for termination.
				if (Lisp.eval(end_test_form, ext, thread) != Lisp.NIL)
					break;

				Lisp.processTagBody(body, localTags, ext);

				// Update variables.
				if (sequential)
					for (int i = 0; i < numvars; i++) {
						SubLObject step = stepforms[i];
						if (step != null) {
							SubLSymbol symbol = vars[i];
							SubLObject value = Lisp.eval(step, ext, thread);
							if (symbol.isSpecialVariable() || ext.isDeclaredSpecial(symbol))
								thread.rebindSpecial(symbol, value);
							else
								ext.rebind(symbol, value);
						}
					}
				else {
					// Evaluate step forms.
					SubLObject results[] = LispObjectFactory.makeLispObjectArray(numvars);
					for (int i = 0; i < numvars; i++) {
						SubLObject step = stepforms[i];
						if (step != null) {
							SubLObject result = Lisp.eval(step, ext, thread);
							results[i] = result;
						}
					}
					// Update variables.
					for (int i = 0; i < numvars; i++)
						if (results[i] != null) {
							SubLSymbol symbol = vars[i];
							SubLObject value = results[i];
							if (symbol.isSpecialVariable() || ext.isDeclaredSpecial(symbol))
								thread.rebindSpecial(symbol, value);
							else
								ext.rebind(symbol, value);
						}
				}
				if (Lisp.interrupted)
					Lisp.handleInterrupt();
			}
			SubLObject result = Lisp.progn(result_forms, ext, thread);
			return result;
		} catch (Return ret) {
			if (ret.getBlock() == blockId)
				return ret.getResult();
			throw ret;
		} finally {
			thread.resetSpecialBindings(mark);
			ext.inactive = true;
		}
	}

}

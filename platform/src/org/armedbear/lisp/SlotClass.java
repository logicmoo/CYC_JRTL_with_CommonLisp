/*
 * SlotClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SlotClass.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SlotClass extends LispClass {
	// ### class-direct-slots
	private static Primitive CLASS_DIRECT_SLOTS = new JavaPrimitive("class-direct-slots", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SlotClass)
				return ((SlotClass) arg).getDirectSlotDefinitions();
			if (arg instanceof BuiltInClass)
				return Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.STANDARD_CLASS);
		}
	};
	// ### %set-class-direct-slots
	private static Primitive _SET_CLASS_DIRECT_SLOTS = new JavaPrimitive("%set-class-direct-slots", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SlotClass) {
				((SlotClass) first).setDirectSlotDefinitions(second);
				return second;
			} else
				return Lisp.type_error(first, LispSymbols.STANDARD_CLASS);
		}
	};
	// ### %class-slots
	private static Primitive _CLASS_SLOTS = new JavaPrimitive(LispSymbols._CLASS_SLOTS, "class") {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SlotClass)
				return ((SlotClass) arg).getSlotDefinitions();
			if (arg instanceof BuiltInClass)
				return Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.STANDARD_CLASS);
		}
	};
	// ### set-class-slots
	private static Primitive SET_CLASS_SLOTS = new JavaPrimitive(LispSymbols.SET_CLASS_SLOTS,
			"class slot-definitions") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SlotClass) {
				((SlotClass) first).setSlotDefinitions(second);
				return second;
			} else
				return Lisp.type_error(first, LispSymbols.STANDARD_CLASS);
		}
	};

	// ### class-direct-default-initargs
	private static Primitive CLASS_DIRECT_DEFAULT_INITARGS = new JavaPrimitive("class-direct-default-initargs",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SlotClass)
				return ((SlotClass) arg).getDirectDefaultInitargs();
			if (arg instanceof BuiltInClass)
				return Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.STANDARD_CLASS);
		}
	};

	// ### %set-class-direct-default-initargs
	private static Primitive _SET_CLASS_DIRECT_DEFAULT_INITARGS = new JavaPrimitive(
			"%set-class-direct-default-initargs", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SlotClass) {
				((SlotClass) first).setDirectDefaultInitargs(second);
				return second;
			}
			return Lisp.type_error(first, LispSymbols.STANDARD_CLASS);
		}
	};

	// ### class-default-initargs
	private static Primitive CLASS_DEFAULT_INITARGS = new JavaPrimitive("class-default-initargs", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject arg)

		{
			if (arg instanceof SlotClass)
				return ((SlotClass) arg).getDefaultInitargs();
			if (arg instanceof BuiltInClass)
				return Lisp.NIL;
			return Lisp.type_error(arg, LispSymbols.STANDARD_CLASS);
		}
	};

	// ### %set-class-default-initargs
	private static Primitive _SET_CLASS_DEFAULT_INITARGS = new JavaPrimitive("%set-class-default-initargs",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SlotClass) {
				((SlotClass) first).setDefaultInitargs(second);
				return second;
			}
			return Lisp.type_error(first, LispSymbols.STANDARD_CLASS);
		}
	};

	// ### compute-class-default-initargs
	private static Primitive COMPUTE_CLASS_DEFAULT_INITARGS = new JavaPrimitive("compute-class-default-initargs",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg)

		{
			SlotClass c;
			if (arg instanceof SlotClass)
				c = (SlotClass) arg;
			else
				return Lisp.type_error(arg, LispSymbols.STANDARD_CLASS);
			return c.computeDefaultInitargs();
		}
	};

	private SubLObject directSlotDefinitions = Lisp.NIL;

	private SubLObject slotDefinitions = Lisp.NIL;

	private SubLObject directDefaultInitargs = Lisp.NIL;

	private SubLObject defaultInitargs = Lisp.NIL;

	public SlotClass(Layout layout) {
		super(layout);
	}

	public SlotClass(Layout layout, SubLSymbol symbol, SubLObject directSuperclasses) {
		super(layout, symbol, directSuperclasses);
	}

	public SlotClass(SubLSymbol symbol, SubLObject directSuperclasses)

	{
		this(null, symbol, directSuperclasses);
	}

	SubLObject computeDefaultInitargs() {
		SubLObject result = Lisp.NIL;
		SubLObject cpl = this.getCPL();
		while (cpl != Lisp.NIL) {
			LispClass c = (LispClass) cpl.first();
			if (c instanceof StandardClass) {
				SubLObject obj = ((StandardClass) c).getDirectDefaultInitargs();
				if (obj != Lisp.NIL)
					result = LispSymbols.APPEND.execute(result, obj);
			}
			cpl = cpl.rest();
		}
		return result;
	}

	public void finalizeClass() {
		if (this.isFinalized())
			return;

		SubLObject defs = this.getSlotDefinitions();
		Debug.assertTrue(defs == Lisp.NIL);
		SubLObject cpl = this.getCPL();
		Debug.assertTrue(cpl != null);
		Debug.assertTrue(cpl.isList());
		cpl = cpl.reverse();
		while (cpl != Lisp.NIL) {
			SubLObject car = cpl.first();
			if (car instanceof StandardClass) {
				StandardClass cls = (StandardClass) car;
				SubLObject directDefs = cls.getDirectSlotDefinitions();
				Debug.assertTrue(directDefs != null);
				Debug.assertTrue(directDefs.isList());
				while (directDefs != Lisp.NIL) {
					defs = defs.push(directDefs.first());
					directDefs = directDefs.rest();
				}
			}
			cpl = cpl.rest();
		}
		this.setSlotDefinitions(defs.nreverse());
		SubLObject[] instanceSlotNames = new SubLObject[defs.cl_length()];
		int i = 0;
		SubLObject tail = this.getSlotDefinitions();
		while (tail != Lisp.NIL) {
			SlotDefinitionObject slotDefinition = (SlotDefinitionObject) tail.first();
			slotDefinition.setLocation(i);
			instanceSlotNames[i++] = slotDefinition.getSlotDefName();
			tail = tail.rest();
		}
		this.setClassLayout(new Layout(this, instanceSlotNames, Lisp.NIL));
		this.setDefaultInitargs(this.computeDefaultInitargs());
		this.setFinalized(true);
	}

	public SubLObject getDefaultInitargs() {
		return this.defaultInitargs;
	}

	public SubLObject getDirectDefaultInitargs() {
		return this.directDefaultInitargs;
	}

	public SubLObject getDirectSlotDefinitions() {
		return this.directSlotDefinitions;
	}

	public SubLObject getParts() {
		SubLObject result = super.getParts().nreverse();
		result = result.push(LispObjectFactory.makeCons("DIRECT-SLOTS", this.getDirectSlotDefinitions()));
		result = result.push(LispObjectFactory.makeCons("SLOTS", this.getSlotDefinitions()));
		result = result.push(LispObjectFactory.makeCons("DIRECT-DEFAULT-INITARGS", this.getDirectDefaultInitargs()));
		result = result.push(LispObjectFactory.makeCons("DEFAULT-INITARGS", this.getDefaultInitargs()));
		return result.nreverse();
	}

	public SubLObject getSlotDefinitions() {
		return this.slotDefinitions;
	}

	public void setDefaultInitargs(SubLObject defaultInitargs) {
		this.defaultInitargs = defaultInitargs;
	}

	public void setDirectDefaultInitargs(SubLObject directDefaultInitargs) {
		this.directDefaultInitargs = directDefaultInitargs;
	}

	public void setDirectSlotDefinitions(SubLObject directSlotDefinitions) {
		this.directSlotDefinitions = directSlotDefinitions;
	}

	public void setSlotDefinitions(SubLObject slotDefinitions) {
		this.slotDefinitions = slotDefinitions;
	}

	public SubLObject typep(SubLObject type) {
		return super.typep(type);
	}
}

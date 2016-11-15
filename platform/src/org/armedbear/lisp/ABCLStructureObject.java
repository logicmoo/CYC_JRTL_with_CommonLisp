/*
 * StructureObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: StructureObject.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class ABCLStructureObject extends AbstractStructureObject {
	// ### structure-object-p object => generalized-boolean
	private static Primitive STRUCTURE_OBJECT_P = new JavaPrimitive("structure-object-p", Lisp.PACKAGE_SYS, true,
			"object") {

		public SubLObject execute(SubLObject arg) {
			return arg instanceof StructureObject ? Lisp.T : Lisp.NIL;
		}
	};

	// ### structure-length instance => length
	private static Primitive STRUCTURE_LENGTH = new JavaPrimitive("structure-length", Lisp.PACKAGE_SYS, true,
			"instance") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StructureObject)
				return LispObjectFactory.makeInteger(((StructureObject) arg).getNumSlots());
			return Lisp.type_error(arg, LispSymbols.STRUCTURE_OBJECT);
		}
	};

	// ### structure-ref instance index => value
	private static Primitive STRUCTURE_REF = new JavaPrimitive("structure-ref", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof StructureObject)
				try {
					return ((StructureObject) first).getSlotValue(second.intValue());
				} catch (ArrayIndexOutOfBoundsException e) {
					// Shouldn't happen.
					return Lisp.error(new LispError("Internal error."));
				}
			return Lisp.type_error(first, LispSymbols.STRUCTURE_OBJECT);
		}
	};

	// ### structure-set instance index new-value => new-value
	private static Primitive STRUCTURE_SET = new JavaPrimitive("structure-set", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{

			if (first instanceof StructureObject)
				try {
					((StructureObject) first).setSlotValue(second.intValue(), third);
					return third;
				} catch (ArrayIndexOutOfBoundsException e) {
					// Shouldn't happen.
					return Lisp.error(new LispError("Internal error."));
				}
			return Lisp.type_error(first, LispSymbols.STRUCTURE_OBJECT);
		}
	};

	// ### make-structure
	private static Primitive MAKE_STRUCTURE = new JavaPrimitive("make-structure", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second, third);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second, third, fourth);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second, third, fourth, fifth);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second, third, fourth, fifth, sixth);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth, SubLObject seventh)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second, third, fourth, fifth, sixth, seventh);
		}
	};

	// ### %make-structure name slot-values => object
	private static Primitive _MAKE_STRUCTURE = new JavaPrimitive("%make-structure", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return new ABCLStructureObject(Lisp.checkSymbol(first), second.copyToArray());
		}
	};

	// ### copy-structure structure => copy
	private static Primitive COPY_STRUCTURE = new JavaPrimitive(LispSymbols.COPY_STRUCTURE, "structure") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StructureObject)
				return new ABCLStructureObject((StructureObject) arg);
			return Lisp.type_error(arg, LispSymbols.STRUCTURE_OBJECT);
		}
	};

	SubLObject[] slots;

	public ABCLStructureObject(StructureObject obj) {
		super((SubLSymbol) obj.typeOf());
		final SubLObject[] oslots = obj.getSlots();
		this.slots = new SubLObject[oslots.length];
		for (int i = this.slots.length; i-- > 0;)
			this.slots[i] = oslots[i];
	}

	public ABCLStructureObject(SubLSymbol symbol)

	{
		super(symbol);
		if (this.structureClass == null) {
			System.err.println("No mitens sitten: " + BuiltInClass.SYSTEM_STREAM.toString());
			System.err.println("joopa joo:" + LispSymbols.SYSTEM_STREAM.getJavaSymbolName());
			System.err.println("Oh noes, structure object got a null class:" + symbol.toString() + ", symbol name:"
					+ symbol.getJavaSymbolName());
		}
		this.slots = LispObjectFactory.makeLispObjectArray(0);
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0)

	{
		super(symbol);
		SubLObject[] slots = LispObjectFactory.makeLispObjectArray(1);
		slots[0] = obj0;
		this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1)

	{
		super(symbol);
		SubLObject[] slots = LispObjectFactory.makeLispObjectArray(2);
		slots[0] = obj0;
		slots[1] = obj1;
		this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1, SubLObject obj2)

	{
		super(symbol);
		SubLObject[] slots = LispObjectFactory.makeLispObjectArray(3);
		slots[0] = obj0;
		slots[1] = obj1;
		slots[2] = obj2;
		this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1, SubLObject obj2, SubLObject obj3)

	{
		super(symbol);
		SubLObject[] slots = LispObjectFactory.makeLispObjectArray(4);
		slots[0] = obj0;
		slots[1] = obj1;
		slots[2] = obj2;
		slots[3] = obj3;
		this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1, SubLObject obj2, SubLObject obj3,
			SubLObject obj4)

	{
		super(symbol);
		this.slots = LispObjectFactory.makeLispObjectArray(5);
		this.slots[0] = obj0;
		this.slots[1] = obj1;
		this.slots[2] = obj2;
		this.slots[3] = obj3;
		this.slots[4] = obj4;
		// this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1, SubLObject obj2, SubLObject obj3,
			SubLObject obj4, SubLObject obj5)

	{
		super(symbol);
		SubLObject[] slots = LispObjectFactory.makeLispObjectArray(6);
		slots[0] = obj0;
		slots[1] = obj1;
		slots[2] = obj2;
		slots[3] = obj3;
		slots[4] = obj4;
		slots[5] = obj5;
		this.slots = slots;
	}

	public ABCLStructureObject(SubLSymbol symbol, SubLObject[] slots)

	{
		super(symbol);
		this.slots = slots;
	}

	public SubLObject classOf() {
		return this.structureClass;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof StructureObject) {
			StructureObject o = (StructureObject) obj;
			if (this.structureClass != o.getStructureClass())
				return false;
			final SubLObject[] oslots = o.getSlots();
			for (int i = 0; i < this.slots.length; i++)
				if (!this.slots[i].equalp(oslots[i]))
					return false;
			return true;
		}
		return false;
	}

	public int getFixnumSlotValue(int index) {
		try {
			return this.slots[index].intValue();
			// if (obj instanceof Fixnum) return ((Fixnum)obj).value;
			// type_error(obj, LispSymbols.FIXNUM);
			// // Not reached.
			// return 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index);
			// Not reached.
			return 0;
		}
	}

	public int getNumSlots() {
		return this.slots.length;
	}

	public SubLObject getParts() {
		SubLObject result = Lisp.NIL;
		result = result.push(LispObjectFactory.makeCons("class", this.structureClass));
		SubLObject effectiveSlots = this.structureClass.getSlotDefinitions();
		SubLObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
		Debug.assertTrue(effectiveSlotsArray.length == this.slots.length);
		for (int i = 0; i < this.slots.length; i++) {
			SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
			SubLObject slotName = slotDefinition.AREF(1);
			result = result.push(LispObjectFactory.makeCons(slotName, this.slots[i]));
		}
		return result.nreverse();
	}

	public SubLObject[] getSlots() {
		return this.slots;
	}

	public SubLObject getSlotValue(int index) {
		try {
			return this.slots[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return this.badIndex(index);
		}
	}

	public SubLObject getSlotValue_0() {
		try {
			return this.slots[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			return this.badIndex(0);
		}
	}

	public SubLObject getSlotValue_1() {
		try {
			return this.slots[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			return this.badIndex(1);
		}
	}

	public SubLObject getSlotValue_2() {
		try {
			return this.slots[2];
		} catch (ArrayIndexOutOfBoundsException e) {
			return this.badIndex(2);
		}
	}

	public SubLObject getSlotValue_3() {
		try {
			return this.slots[3];
		} catch (ArrayIndexOutOfBoundsException e) {
			return this.badIndex(3);
		}
	}

	public boolean getSlotValueAsBoolean(int index) {
		try {
			return this.slots[index] != Lisp.NIL ? true : false;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index);
			// Not reached.
			return false;
		}
	}

	public int psxhash(int depth) {
		int result = Lisp.mix(this.structureClass.sxhash(), 7814971);
		if (depth > 0) {
			int limit = this.slots.length;
			if (limit > 4)
				limit = 4;
			for (int i = 0; i < limit; i++)
				result = Lisp.mix(this.slots[i].psxhash(depth - 1), result);
		}
		return result & 0x7fffffff;
	}

	public void setSlotValue(int index, SubLObject value)

	{
		try {
			this.slots[index] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index);
		}
	}

	public void setSlotValue_0(SubLObject value)

	{
		try {
			this.slots[0] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(0);
		}
	}

	public void setSlotValue_1(SubLObject value)

	{
		try {
			this.slots[1] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(1);
		}
	}

	public void setSlotValue_2(SubLObject value)

	{
		try {
			this.slots[2] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(2);
		}
	}

	public void setSlotValue_3(SubLObject value)

	{
		try {
			this.slots[3] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(3);
		}
	}

	public SubLObject typeOf() {
		return this.structureClass.getLispClassName();
	}

	public SubLObject typep(SubLObject type) {
		if (type instanceof StructureClass)
			return Lisp.memq(type, this.structureClass.getCPL()) ? Lisp.T : Lisp.NIL;
		if (type == this.structureClass.getLispClassName())
			return Lisp.T;
		if (type == LispSymbols.STRUCTURE_OBJECT)
			return Lisp.T;
		if (type == BuiltInClass.STRUCTURE_OBJECT)
			return Lisp.T;
		if (type instanceof SubLSymbol) {
			LispClass c = LispClass.findClass((SubLSymbol) type);
			if (c != null)
				return Lisp.memq(c, this.structureClass.getCPL()) ? Lisp.T : Lisp.NIL;
		}
		return super.typep(type);
	}

	public String writeToString() {
		try {
			LispThread thread = LispThread.currentThread();
			// FIXME
			if (this.typep(LispSymbols.RESTART) != Lisp.NIL) {
				SubLSymbol PRINT_RESTART = Lisp.PACKAGE_SYS.intern("PRINT-RESTART");
				SubLObject fun = PRINT_RESTART.getSymbolFunction();
				StringOutputStream stream = new StringOutputStream();
				thread.execute(fun, this, stream);
				return stream.getOutputString().getString();
			}
			if (Lisp._PRINT_STRUCTURE_.symbolValue(thread) == Lisp.NIL)
				return this.unreadableString(this.structureClass.getLispClassName().writeToString());
			int maxLevel = Integer.MAX_VALUE;
			SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
			if (printLevel instanceof Fixnum)
				maxLevel = ((Fixnum) printLevel).value;
			SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = currentPrintLevel.intValue();
			if (currentLevel >= maxLevel && this.slots.length > 0)
				return "#";
			StringBuilder sb = new StringBuilder("#S(");
			sb.append(this.structureClass.getLispClassName().writeToString());
			if (currentLevel < maxLevel) {
				SubLObject effectiveSlots = this.structureClass.getSlotDefinitions();
				SubLObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
				Debug.assertTrue(effectiveSlotsArray.length == this.slots.length);
				SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
				int limit;
				if (printLength instanceof Fixnum)
					limit = Math.min(this.slots.length, ((Fixnum) printLength).value);
				else
					limit = this.slots.length;
				boolean printCircle = LispSymbols.PRINT_CIRCLE.symbolValue(thread) != Lisp.NIL;
				for (int i = 0; i < limit; i++) {
					sb.append(' ');
					SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
					// FIXME AREF(1)
					SubLObject slotName = slotDefinition.AREF(1);
					Debug.assertTrue(slotName instanceof SubLSymbol);
					sb.append(':');
					sb.append(((SubLSymbol) slotName).getSubLName().getString());
					sb.append(' ');
					if (printCircle) {
						StringOutputStream stream = new StringOutputStream();
						thread.execute(LispSymbols.OUTPUT_OBJECT.getSymbolFunction(), this.slots[i], stream);
						sb.append(stream.getOutputString().getString());
					} else
						sb.append(this.slots[i].writeToString());
				}
				if (limit < this.slots.length)
					sb.append(" ...");
			}
			sb.append(')');
			return sb.toString();
		} catch (StackOverflowError e) {
			e.printStackTrace();
			Lisp.error(new StorageCondition("Stack overflow."));
			return null; // Not reached.
		}
	}
}

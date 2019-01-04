///*
// * StandardObject.java
// *
// * Copyright (C) 2003-2006 Peter Graves
// * $Id$
// *
// * This program is free software; you can redistribute it and/or
// * modify it under the terms of the GNU General Public License
// * as published by the Free Software Foundation; either version 2
// * of the License, or (at your option) any later version.
// *
// * This program is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU General Public License for more details.
// *
// * You should have received a copy of the GNU General Public License
// * along with this program; if not, write to the Free Software
// * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
// *
// * As a special exception, the copyright holders of this library give you
// * permission to link this library with independent modules to produce an
// * executable, regardless of the license terms of these independent
// * modules, and to copy and distribute the resulting executable under
// * terms of your choice, provided that you also meet, for each linked
// * independent module, the terms and conditions of the license of that
// * module.  An independent module is a module which is not derived from
// * or based on this library.  If you modify this library, you may extend
// * this exception to your version of the library, but you are not
// * obligated to do so.  If you do not wish to do so, delete this
// * exception statement from your version.
// */
//
//package org.armedbear.lisp;
//
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructInterpreted;
//import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
//
//public class StandardObjectImpl extends AbstractSubLStruct
//{
//	@Override
//	public SubLObject getField0()
//	{
//		return Fixnum.getInstance(getFieldCount());
//	}
//
//	@Override
//	public SubLObject getField1()
//	{
//		return getName();
//	}
//
//	@Override
//	public int getFieldCount()
//	{
//		return slots.length;
//	}
//
//	protected Layout layout;
//	protected LispObject[] slots;
//
//	protected StandardObjectImpl() {
//		layout = new Layout(StandardClass.STANDARD_OBJECT, NIL, NIL);
//	}
//
//	public LispObject getSlotValue(int index) {
//		return type_error(this, Symbol.STRUCTURE_OBJECT);
//	}
//
//	/**
//	 * @param slotName
//	 * @return
//	 */
//	final public int getInstanceSlotIndex(LispObject slotName)
//	{
//
//		return updateLayout().getSlotIndex(slotName);
//	}
//
//	public LispObject getSharedSlotLocation(LispObject slotName)
//	{
//		return getLayout().getSharedSlotLocation(slotName);
//	}
//
//	protected StandardObjectImpl(Layout layout) {
//		this(layout, layout.getLength());
//	}
//
//	protected StandardObjectImpl(Layout layout, int length) {
//		this.layout = layout;
//		slots = new LispObject[length];
//		for (int i = slots.length; i-- > 0;)
//			slots[i] = UNBOUND_VALUE;
//	}
//
//	protected StandardObjectImpl(LispClass cls, int length) {
//		layout = cls == null ? null : cls.getClassLayout();
//		slots = new LispObject[length];
//		for (int i = slots.length; i-- > 0;)
//			slots[i] = UNBOUND_VALUE;
//	}
//
//	protected StandardObjectImpl(LispClass cls) {
//		layout = cls == null ? null : cls.getClassLayout();
//		slots = new LispObject[layout == null ? 0 : layout.getLength()];
//		for (int i = slots.length; i-- > 0;)
//			slots[i] = UNBOUND_VALUE;
//	}
//
//	//
//	//  public LispObject getParts()
//	//  {
//	//    LispObject parts = NIL;
//	//    if (layout != null)
//	//      {
//	//    	final Layout layout = updateLayout();
//	//    	Debug.assertTrue(layout != null);
//	//
//	//      }
//	//    parts = parts.push(new Cons("LAYOUT", layout));
//	//    if (layout != null)
//	//      {
//	//        LispObject[] slotNames = layout.getSlotNames();
//	//        if (slotNames != null)
//	//          {
//	//            for (int i = 0; i < slotNames.length; i++)
//	//              {
//	//                parts = parts.push(new Cons(slotNames[i], slots[i]));
//	//              }
//	//          }
//	//      }
//	//    return parts.nreverse();
//	//  }
//	//
//	public final LispObject getLispClass()
//	{
//		return getLayout().getLispClass();
//	}
//	//
//	//  private LispObject helperGetClassName()
//	//  {
//	//    final LispObject c1 = layout.getLispClass();
//	//    if (c1 instanceof LispClass)
//	//        return ((LispClass)c1).getLispClassName();
//	//    else
//	//        return LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);
//	//  }
//	//
//	//  private LispObject helperGetCPL()
//	//  {
//	//    final LispObject c1 = layout.getLispClass();
//	//    if (c1 instanceof LispClass)
//	//        return ((LispClass)c1).getCPL();
//	//    else
//	//        return LispThread.currentThread().execute(Symbol.CLASS_PRECEDENCE_LIST, c1);
//	//  }
//	//
//
//	public LispObject typeOf()
//	{
//		// "For objects of metaclass STRUCTURE-CLASS or STANDARD-CLASS, and for
//		// conditions, TYPE-OF returns the proper name of the class returned by
//		// CLASS-OF if it has a proper name, and otherwise returns the class
//		// itself."
//		final Layout layout = getLayout();
//
//		final LispObject c1 = layout.getLispClass();
//		LispObject name;
//		if (c1 instanceof LispClass)
//			name = ((LispClass) c1).getLispClassName();
//		else
//			name = LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);
//
//		// The proper name of a class is "a symbol that names the class whose
//		// name is that symbol".
//		if (name != NIL && name != UNBOUND_VALUE)
//		{
//			// TYPE-OF.9
//			final LispObject c2 = LispClass.findClass(name, false);
//			if (c2 == c1)
//				return name;
//		}
//		return c1;
//	}
//
//	//  public LispObject typeOf()
//	//  {
//	//    // "For objects of metaclass STRUCTURE-CLASS or STANDARD-CLASS, and for
//	//    // conditions, TYPE-OF returns the proper name of the class returned by
//	//    // CLASS-OF if it has a proper name, and otherwise returns the class
//	//    // itself."
//	//    final LispObject c1 = layout.getLispClass();
//	//    LispObject name;
//	//    if (c1 instanceof LispClass)
//	//        name = ((LispClass)c1).getLispClassName();
//	//    else
//	//        name = LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);
//	//
//	//    // The proper name of a class is "a symbol that names the class whose
//	//    // name is that symbol".
//	//    if (name != NIL && name != UNBOUND_VALUE)
//	//      {
//	//        // TYPE-OF.9
//	//        final LispObject c2 = LispClass.findClass(name, false);
//	//        if (c2 == c1)
//	//          return name;
//	//      }
//	//    return c1;
//	//  }
//
//	public LispObject classOf()
//	{
//		final Layout layout = getLayout();
//		return layout.getLispClass();
//	}
//
//	@Override
//	public SubLSymbol getName()
//	{
//		//return classOf().
//		LispObject sym = typeOf();
//		if (sym instanceof SubLSymbol)
//			return (SubLSymbol) sym;
//		if (sym instanceof LispClass)
//			return ((LispClass) sym).getLispClassName().toSymbol();
//		sym = classOf();
//		if (sym instanceof SubLSymbol)
//			return (SubLSymbol) sym;
//		if (sym instanceof LispClass)
//			return ((LispClass) sym).getLispClassName().toSymbol();
//		return sym.toSymbol();
//	}
//	//
//	//  public LispObject typep(LispObject type)
//	//  {
//	//    if (type == Symbol.STANDARD_OBJECT)
//	//      return T;
//	//    if (type == StandardClass.STANDARD_OBJECT)
//	//      return T;
//	//    LispObject cls = layout != null ? layout.getLispClass() : null;
//	//    if (cls != null)
//	//      {
//	//        if (type == cls)
//	//          return T;
//	//        if (type == helperGetClassName())
//	//          return T;
//	//        LispObject cpl = helperGetCPL();
//	//        while (cpl != NIL)
//	//          {
//	//            if (type == cpl.car())
//	//              return T;
//	//
//	//            LispObject otherName;
//	//            LispObject otherClass = cpl.car();
//	//            if (otherClass instanceof LispClass) {
//	//              if (type == ((LispClass)otherClass).getLispClassName())
//	//                return T;
//	//            }
//	//            else
//	//            if (type == LispThread
//	//                .currentThread().execute(Symbol.CLASS_NAME, otherClass))
//	//                return T;
//	//
//	//            cpl = cpl.cdr();
//	//          }
//	//      }
//	//    return super.typep(type);
//	//  }
//	//
//	//  public String printObjectImpl()
//	//  {
//	//    final LispThread thread = LispThread.currentThread();
//	//    int maxLevel = Integer.MAX_VALUE;
//	//    LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
//	//    if (printLevel instanceof Fixnum)
//	//      maxLevel = ((Fixnum)printLevel).value;
//	//    LispObject currentPrintLevel =
//	//      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
//	//    int currentLevel = Fixnum.getValue(currentPrintLevel);
//	//    if (currentLevel >= maxLevel)
//	//      return "#";
//	//    return unreadableString(typeOf().printObject() + " "+ SubLObjectFactory.makeList(slots));
//	//  }
//
//	public synchronized Layout updateLayout()
//	{
//		if (!layout.isInvalid())
//			return layout;
//		Layout oldLayout = layout;
//		LispObject cls = oldLayout.getLispClass();
//		Layout newLayout;
//
//		if (cls instanceof LispClass)
//			newLayout = ((LispClass) cls).getClassLayout();
//		else
//			newLayout = (Layout) Symbol.CLASS_LAYOUT.execute(cls);
//
//		Debug.assertTrue(!newLayout.isInvalid());
//		final StandardObjectImpl newInstance = new StandardObjectImpl(newLayout);
//		// Debug.assertTrue(newInstance.getLayout() == newLayout);
//		LispObject added = NIL;
//		LispObject discarded = NIL;
//		LispObject plist = NIL;
//		// Old local slots.
//		LispObject[] oldSlotNames = oldLayout.getSlotNames();
//		final LispObject[] newInstanceslots = newInstance.getSlots();
//		for (int i = 0; i < oldSlotNames.length; i++)
//		{
//			LispObject slotName = oldSlotNames[i];
//			int j = newLayout.getSlotIndex(slotName);
//			if (j >= 0)
//				newInstanceslots[j] = slots[i];
//			else
//			{
//				discarded = discarded.push(slotName);
//				if (slots[i] != UNBOUND_VALUE)
//				{
//					plist = plist.push(slotName);
//					plist = plist.push(slots[i]);
//				}
//			}
//		}
//		// Old shared slots.
//		LispObject rest = oldLayout.getSharedSlots(); // A list.
//		if (rest != null)
//		{
//			while (rest != NIL)
//			{
//				LispObject location = rest.car();
//				LispObject slotName = location.car();
//				int i = newLayout.getSlotIndex(slotName);
//				if (i >= 0)
//					newInstanceslots[i] = location.cdr();
//				rest = rest.cdr();
//			}
//		}
//		// Go through all the new local slots to compute the added slots.
//		LispObject[] newSlotNames = newLayout.getSlotNames();
//		for (int i = 0; i < newSlotNames.length; i++)
//		{
//			LispObject slotName = newSlotNames[i];
//			int j = oldLayout.getSlotIndex(slotName);
//			if (j >= 0)
//				continue;
//			LispObject location = oldLayout.getSharedSlotLocation(slotName);
//			if (location != null)
//				continue;
//			// Not found.
//			added = added.push(slotName);
//		}
//		// Swap slots.
//		LispObject[] tempSlots = slots;
//		slots = newInstanceslots;
//		newInstance.setSlots(tempSlots);
//		// Swap layouts.
//		Layout tempLayout = layout;
//		setLayout(newInstance.getLayout());
//		newInstance.setLayout(tempLayout);
//		Debug.assertTrue(!layout.isInvalid());
//		// Call UPDATE-INSTANCE-FOR-REDEFINED-CLASS.
//		Symbol.UPDATE_INSTANCE_FOR_REDEFINED_CLASS.execute(this, added, discarded, plist);
//		return newLayout;
//	}
//
//	//  // Only handles instance slots (not shared slots).
//	//  public LispObject getInstanceSlotValue(LispObject slotName)
//	//
//	//  {
//	//    Layout  layout = updateLayout();
//	//    Debug.assertTrue(layout != null);
//	//    int index = layout.getSlotIndex(slotName);
//	//    if (index < 0) {
//	//      // Not found.
//	//      final LispThread thread = LispThread.currentThread();
//	//      // If the operation is slot-value, only the primary value [of
//	//      // slot-missing] will be used by the caller, and all other values
//	//      // will be ignored.
//	//      LispObject value = thread.execute(Symbol.SLOT_MISSING,
//	//                                        this.getLispClass(), this,
//	//                                        slotName, Symbol.SLOT_VALUE);
//	//      thread._values = null;
//	//      return value;
//	//    }
//	//    return slots[index];
//	//  }
//	//
//	//  // Only handles instance slots (not shared slots).
//	//  public void setInstanceSlotValue(LispObject slotName, LispObject newValue)
//	//
//	//  {
//	//	    final Layout layout = updateLayout();
//	//	    Debug.assertTrue(layout != null);
//	//    int index = layout.getSlotIndex(slotName);
//	//    if (index < 0) {
//	//      // Not found.
//	//      final LispThread thread = LispThread.currentThread();
//	//      // If the operation is setf or slot-makunbound, any values
//	//      // [returned by slot-missing] will be ignored by the caller.
//	//      thread.execute(Symbol.SLOT_MISSING, this.getLispClass(), this,
//	//                     slotName, Symbol.SETF, newValue);
//	//      thread._values = null;
//	//    }
//	//    slots[index] = newValue;
//	//  }
//
//	//  public LispObject SLOT_VALUE(LispObject slotName)
//	//  {
//	//		final Layout layout = updateLayout();
//	//		Debug.assertTrue(layout != null);
//	//    LispObject value;
//	//    final LispObject index = layout.slotTable.get(slotName);
//	//    if (index != null)
//	//      {
//	//        // Found instance slot.
//	//        value = slots[((Fixnum)index).value];
//	//      }
//	//    else
//	//      {
//	//        // Check for shared slot.
//	//        LispObject location = layout.getSharedSlotLocation(slotName);
//	//        if (location == null)
//	//          return Symbol.SLOT_MISSING.execute(getLispClass(), this, slotName,
//	//                                             Symbol.SLOT_VALUE);
//	//        value = location.cdr();
//	//      }
//	//    if (value == UNBOUND_VALUE)
//	//      {
//	//        value = Symbol.SLOT_UNBOUND.execute(getLispClass(), this, slotName);
//	//        LispThread.currentThread()._values = null;
//	//      }
//	//    return value;
//	//  }
//	//
//	//  public void setSlotValue(LispObject slotName, LispObject newValue)
//	//  {
//	//		final Layout layout = updateLayout();
//	//		Debug.assertTrue(layout != null);
//	//    final LispObject index = layout.slotTable.get(slotName);
//	//    if (index != null)
//	//      {
//	//        // Found instance slot.
//	//        slots[((Fixnum)index).value] = newValue;
//	//        return;
//	//      }
//	//    // Check for shared slot.
//	//    LispObject location = layout.getSharedSlotLocation(slotName);
//	//    if (location != null)
//	//      {
//	//        location.setCdr(newValue);
//	//        return;
//	//      }
//	//    LispObject[] args = new LispObject[5];
//	//    args[0] = getLispClass();
//	//    args[1] = this;
//	//    args[2] = slotName;
//	//    args[3] = Symbol.SETF;
//	//    args[4] = newValue;
//	//    Symbol.SLOT_MISSING.execute(args);
//	//  }
//
//	@Override
//	public int hashCode(int currentDepth)
//	{
//		return superHash();
//	}
//
//	@Override
//	public void clear()
//	{
//		// TODO Auto-generated method stub
//		if (true)
//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.clear");
//	}
//
//	@Override
//	public SubLStructDecl getStructDecl()
//	{
//		// TODO Auto-generated method stub
//		if (true)
//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.getStructDecl");
//		return null;
//	}
//
//	@Override
//	public void setName(SubLSymbol p0)
//	{
//		// TODO Auto-generated method stub
//		if (true)
//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.setName");
//
//	}
//
//	@Override
//	public SubLObject getField(int fieldNum)
//	{
//		// TODO Auto-generated method stub
//		if (true)
//			Errors.unimplementedMethod("Auto-generated method stub:  AbstractSubLStruct.getField");
//		return null;
//	}
//
//	@Override
//	public void setField(int fieldNum, SubLObject value)
//	{
//		// TODO Auto-generated method stub
//		if (true)
//			Errors.unimplementedMethod("Auto-generated method stub:  AbstractSubLStruct.setField");
//
//	}
//
//	@Override
//	public LispObject[] getSlots()
//	{
//		return slots;
//	}
//
//	//@Override
//	public void setSlots(LispObject[] tempSlots)
//	{
//		this.slots = tempSlots;
//	}
////
////	@Override
//	public LispObject setSlotArray(int index, LispObject newValue)
//	{
//		try
//		{
//			slots[index] = newValue;
//			return newValue;
//		} catch (ArrayIndexOutOfBoundsException e)
//		{
//			return boundsError(index);
//		}
//	}
//
////	@Override
//	public LispObject getSlotArrayElement(int index)
//	{
//		return slots[index];
//	}
//
//	public Layout getLayout()
//	{
//		return layout;
//	}
//
//	public void setLayout(Layout layout)
//	{
//		Debug.assertTrue(layout != null);
//		this.layout = layout;
//	}
//
//	@Override
//
//	public String printObjectImpl()
//	{
//		return printObjectImplSlotBased();
//	}
//
//}

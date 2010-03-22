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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class ABCLStructureObject extends AbstractStructureObject
{
  final SubLObject[] slots;

  public ABCLStructureObject(SubLSymbol symbol)

  {
  	super(symbol);
    if (structureClass == null) {
        System.err.println("No mitens sitten: " + BuiltInClass.SYSTEM_STREAM.toString());
        System.err.println("joopa joo:" + LispSymbols.SYSTEM_STREAM.getJavaSymbolName());
        System.err.println("Oh noes, structure object got a null class:" + symbol.toString() + ", symbol name:" + symbol.getJavaSymbolName() );
    }
    slots = makeLispObjectArray(0);
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject[] slots)

  {
  	super(symbol);
    this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0)

  {
  	super(symbol);
    SubLObject[] slots = makeLispObjectArray(1);
    slots[0] = obj0;
    this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1)

  {
  	super(symbol);
    SubLObject[] slots = makeLispObjectArray(2);
    slots[0] = obj0;
    slots[1] = obj1;
    this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1,
                         SubLObject obj2)

  {
  	super(symbol);
    SubLObject[] slots = makeLispObjectArray(3);
    slots[0] = obj0;
    slots[1] = obj1;
    slots[2] = obj2;
    this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1,
                         SubLObject obj2, SubLObject obj3)

  {
  	super(symbol);
    SubLObject[] slots = makeLispObjectArray(4);
    slots[0] = obj0;
    slots[1] = obj1;
    slots[2] = obj2;
    slots[3] = obj3;
    this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1,
                         SubLObject obj2, SubLObject obj3, SubLObject obj4)

  {
  	super(symbol);
    slots = makeLispObjectArray(5);
    slots[0] = obj0;
    slots[1] = obj1;
    slots[2] = obj2;
    slots[3] = obj3;
    slots[4] = obj4;
    //this.slots = slots;
  }

  public ABCLStructureObject(SubLSymbol symbol, SubLObject obj0, SubLObject obj1,
                         SubLObject obj2, SubLObject obj3, SubLObject obj4,
                         SubLObject obj5)

  {
  	super(symbol);
    SubLObject[] slots = makeLispObjectArray(6);
    slots[0] = obj0;
    slots[1] = obj1;
    slots[2] = obj2;
    slots[3] = obj3;
    slots[4] = obj4;
    slots[5] = obj5;
    this.slots = slots;
  }

  public ABCLStructureObject(StructureObject obj)
  {
    super((SubLSymbol) obj.typeOf());
  	final SubLObject[] oslots = obj.getSlots();
    slots = new SubLObject[oslots.length];
    for (int i = slots.length; i-- > 0;)
      slots[i] = oslots[i];
  }

  @Override
  public SubLObject typeOf()
  {
    return structureClass.getLispClassName();
  }

  @Override
  public SubLObject classOf()
  {
    return structureClass;
  }

  @Override
  public SubLObject getParts()
  {
    SubLObject result = NIL;
    result = result.push(makeCons("class", structureClass));
    SubLObject effectiveSlots = structureClass.getSlotDefinitions();
    SubLObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
    Debug.assertTrue(effectiveSlotsArray.length == slots.length);
    for (int i = 0; i < slots.length; i++)
      {
        SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
        SubLObject slotName = slotDefinition.AREF(1);
        result = result.push(makeCons(slotName, slots[i]));
      }
    return result.nreverse();
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type instanceof StructureClass)
      return memq(type, structureClass.getCPL()) ? T : NIL;
    if (type == structureClass.getLispClassName())
      return T;
    if (type == LispSymbols.STRUCTURE_OBJECT)
      return T;
    if (type == BuiltInClass.STRUCTURE_OBJECT)
      return T;
    if (type instanceof SubLSymbol)
      {
        LispClass c = LispClass.findClass((SubLSymbol)type);
        if (c != null)
          return memq(c, structureClass.getCPL()) ? T : NIL;
      }
    return super.typep(type);
  }

  @Override
  public boolean equalp(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof StructureObject)
      {
        StructureObject o = (StructureObject) obj;
        if (structureClass != o.getStructureClass())
          return false;
      	final SubLObject[] oslots = o.getSlots();
        for (int i = 0; i < slots.length; i++)
          {
            if (!slots[i].equalp(oslots[i]))
              return false;
          }
        return true;
      }
    return false;
  }

  @Override
  public SubLObject getSlotValue_0()
  {
    try
      {
        return slots[0];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return badIndex(0);
      }
  }

  @Override
  public SubLObject getSlotValue_1()
  {
    try
      {
        return slots[1];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return badIndex(1);
      }
  }

  @Override
  public SubLObject getSlotValue_2()
  {
    try
      {
        return slots[2];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return badIndex(2);
      }
  }

  @Override
  public SubLObject getSlotValue_3()
  {
    try
      {
        return slots[3];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return badIndex(3);
      }
  }

  @Override
  public SubLObject getSlotValue(int index)
  {
    try
      {
        return slots[index];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return badIndex(index);
      }
  }

  @Override
  public int getFixnumSlotValue(int index)
  {
    try
      {
        return slots[index].intValue();
				//          if (obj instanceof Fixnum) return ((Fixnum)obj).value;
				//          type_error(obj, LispSymbols.FIXNUM);
				//      // Not reached.
				//          return 0;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index);
        // Not reached.
        return 0;
      }
  }

  @Override
  public boolean getSlotValueAsBoolean(int index)
  {
    try
      {
        return slots[index] != NIL ? true : false;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index);
        // Not reached.
        return false;
      }
  }

  @Override
  public void setSlotValue_0(SubLObject value)

  {
    try
      {
        slots[0] = value;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(0);
      }
  }

  @Override
  public void setSlotValue_1(SubLObject value)

  {
    try
      {
        slots[1] = value;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(1);
      }
  }

  @Override
  public void setSlotValue_2(SubLObject value)

  {
    try
      {
        slots[2] = value;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(2);
      }
  }

  @Override
  public void setSlotValue_3(SubLObject value)

  {
    try
      {
        slots[3] = value;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(3);
      }
  }

  @Override
  public void setSlotValue(int index, SubLObject value)

  {
    try
      {
        slots[index] = value;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index);
      }
  }

  @Override
  public final int psxhash(int depth)
  {
    int result = mix(structureClass.sxhash(), 7814971);
    if (depth > 0)
      {
        int limit = slots.length;
        if (limit > 4)
          limit = 4;
        for (int i = 0; i < limit; i++)
          result = mix(slots[i].psxhash(depth - 1), result);
      }
    return result & 0x7fffffff;
  }

  @Override
  public String writeToString()
  {
    try
      {
        final LispThread thread = LispThread.currentThread();
        // FIXME
        if (typep(LispSymbols.RESTART) != NIL)
          {
            SubLSymbol PRINT_RESTART = PACKAGE_SYS.intern("PRINT-RESTART");
            SubLObject fun = PRINT_RESTART.getSymbolFunction();
            StringOutputStream stream = new StringOutputStream();
            thread.execute(fun, this, stream);
            return stream.getOutputString().getString();
          }
        if (_PRINT_STRUCTURE_.symbolValue(thread) == NIL)
          return unreadableString(structureClass.getLispClassName().writeToString());
        int maxLevel = Integer.MAX_VALUE;
        SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
        if (printLevel instanceof Fixnum)
          maxLevel = ((Fixnum)printLevel).value;
        SubLObject currentPrintLevel =
          _CURRENT_PRINT_LEVEL_.symbolValue(thread);
        int currentLevel = currentPrintLevel.intValue();
        if (currentLevel >= maxLevel && slots.length > 0)
          return "#";
        StringBuilder sb = new StringBuilder("#S(");
        sb.append(structureClass.getLispClassName().writeToString());
        if (currentLevel < maxLevel)
          {
            SubLObject effectiveSlots = structureClass.getSlotDefinitions();
            SubLObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
            Debug.assertTrue(effectiveSlotsArray.length == slots.length);
            final SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
            final int limit;
            if (printLength instanceof Fixnum)
              limit = Math.min(slots.length, ((Fixnum)printLength).value);
            else
              limit = slots.length;
            final boolean printCircle =
              (LispSymbols.PRINT_CIRCLE.symbolValue(thread) != NIL);
            for (int i = 0; i < limit; i++)
              {
                sb.append(' ');
                SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
                // FIXME AREF(1)
                SubLObject slotName = slotDefinition.AREF(1);
                Debug.assertTrue(slotName instanceof SubLSymbol);
                sb.append(':');
                sb.append(((SubLSymbol)slotName).getSubLName().getString());
                sb.append(' ');
                if (printCircle)
                  {
                    StringOutputStream stream = new StringOutputStream();
                    thread.execute(LispSymbols.OUTPUT_OBJECT.getSymbolFunction(),
                                   slots[i], stream);
                    sb.append(stream.getOutputString().getString());
                  }
                else
                  sb.append(slots[i].writeToString());
              }
            if (limit < slots.length)
              sb.append(" ...");
          }
        sb.append(')');
        return sb.toString();
      }
    catch (StackOverflowError e)
      {
	e.printStackTrace();
        error(new StorageCondition("Stack overflow."));
        return null; // Not reached.
      }
  }

  // ### structure-object-p object => generalized-boolean
  private static final Primitive STRUCTURE_OBJECT_P =
    new JavaPrimitive("structure-object-p", PACKAGE_SYS, true, "object")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        return arg instanceof StructureObject ? T : NIL;
      }
    };

  // ### structure-length instance => length
  private static final Primitive STRUCTURE_LENGTH =
    new JavaPrimitive("structure-length", PACKAGE_SYS, true, "instance")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          if (arg instanceof StructureObject)
            return LispObjectFactory.makeInteger(((StructureObject)arg).getNumSlots());
        return type_error(arg, LispSymbols.STRUCTURE_OBJECT);
      }
    };

  // ### structure-ref instance index => value
  private static final Primitive STRUCTURE_REF =
    new JavaPrimitive("structure-ref", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
    if (first instanceof StructureObject)
        try
          {
            return ((StructureObject)first).getSlotValue(second.intValue());
          }
        catch (ArrayIndexOutOfBoundsException e)
          {
            // Shouldn't happen.
            return error(new LispError("Internal error."));
          }      
      return type_error(first, LispSymbols.STRUCTURE_OBJECT);
      }
    };

  // ### structure-set instance index new-value => new-value
  private static final Primitive STRUCTURE_SET =
    new JavaPrimitive("structure-set", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
          
            if (first instanceof StructureObject)
                try
                  {
                    ((StructureObject)first).setSlotValue(second.intValue(), third);
                    return third;
                  }
                catch (ArrayIndexOutOfBoundsException e)
                  {
                    // Shouldn't happen.
                    return error(new LispError("Internal error."));
                  }      
              return type_error(first, LispSymbols.STRUCTURE_OBJECT);
              }      
    };

  // ### make-structure
  private static final Primitive MAKE_STRUCTURE =
    new JavaPrimitive("make-structure", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          return new ABCLStructureObject(checkSymbol(first), second);
      }
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
          return new ABCLStructureObject(checkSymbol(first), second, third);
      }
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third, SubLObject fourth)

      {
          return new ABCLStructureObject(checkSymbol(first), second, third, fourth);
      }
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third, SubLObject fourth,
                                SubLObject fifth)

      {
          return new ABCLStructureObject(checkSymbol(first), second, third, fourth,
                  fifth);
      }
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third, SubLObject fourth,
                                SubLObject fifth, SubLObject sixth)

      {
          return new ABCLStructureObject(checkSymbol(first), second, third, fourth,
                  fifth, sixth);
      }
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third, SubLObject fourth,
                                SubLObject fifth, SubLObject sixth,
                                SubLObject seventh)

      {
          return new ABCLStructureObject(checkSymbol(first), second, third, fourth,
                  fifth, sixth, seventh);
      }
    };

  // ### %make-structure name slot-values => object
  private static final Primitive _MAKE_STRUCTURE =
    new JavaPrimitive("%make-structure", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          return new ABCLStructureObject(checkSymbol(first), second.copyToArray());
      }
    };

  // ### copy-structure structure => copy
  private static final Primitive COPY_STRUCTURE =
    new JavaPrimitive(LispSymbols.COPY_STRUCTURE, "structure")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          if (arg instanceof StructureObject)
            return new ABCLStructureObject((StructureObject)arg);
          return type_error(arg, LispSymbols.STRUCTURE_OBJECT);
      }
    };

	@Override
	public SubLObject[] getSlots() {
		return slots;
	}

	public int getNumSlots() {
		return slots.length;
	}
}

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

public abstract class AbstractStructureObject extends AbstractLispObject implements StructureObject
{
  protected final StructureClass structureClass;

  public AbstractStructureObject(SubLSymbol symbol)

  {
      structureClass = (StructureClass) LispClass.findClass(symbol/*, true*/); // Might return null.
    if (getStructureClass() == null) {
        System.err.println("No mitens sitten: " + BuiltInClass.SYSTEM_STREAM.toString());
        System.err.println("joopa joo:" + LispSymbols.SYSTEM_STREAM.getJavaSymbolName());
        System.err.println("Oh noes, structure object got a null class:" + symbol.toString() + ", symbol name:" + symbol.getJavaSymbolName() );
    }
  }

  @Override
  public SubLObject typeOf()
  {
    return getStructureClass().getLispClassName();
  }

  @Override
  public SubLObject classOf()
  {
    return getStructureClass();
  }

  @Override
  public SubLObject getParts()
  {
  	final SubLObject[] slots = getSlots();
    SubLObject result = NIL;
    result = result.push(makeCons("class", getStructureClass()));
    SubLObject effectiveSlots = getStructureClass().getSlotDefinitions();
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

  public abstract SubLObject[] getSlots();
  

	@Override
  public SubLObject typep(SubLObject type)
  {
    if (type instanceof StructureClass)
      return memq(type, getStructureClass().getCPL()) ? T : NIL;
    if (type == getStructureClass().getLispClassName())
      return T;
    if (type == LispSymbols.STRUCTURE_OBJECT)
      return T;
    if (type == BuiltInClass.STRUCTURE_OBJECT)
      return T;
    if (type instanceof SubLSymbol)
      {
        LispClass c = LispClass.findClass((SubLSymbol)type);
        if (c != null)
          return memq(c, getStructureClass().getCPL()) ? T : NIL;
      }
    return super.typep(type);
  }

  @Override
  public boolean equalp(SubLObject obj)
  {
    if (this == obj)
      return true;
  	final SubLObject[] slots = getSlots();
    if (obj instanceof StructureObject)
      {
        StructureObject o = (StructureObject) obj;
      	final SubLObject[] oslots = o.getSlots();
        if (getStructureClass() != o.getStructureClass())
          return false;
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
  abstract public SubLObject getSlotValue_0();

  @Override
  abstract public SubLObject getSlotValue_1();

  @Override
  abstract public SubLObject getSlotValue_2();

  @Override
  abstract public SubLObject getSlotValue_3();

  @Override
  abstract public SubLObject getSlotValue(int index);


  @Override
  abstract public void setSlotValue_0(SubLObject value);

  @Override
  abstract public void setSlotValue_1(SubLObject value);

  @Override
  abstract public void setSlotValue_2(SubLObject value);
  
  @Override
  abstract public void setSlotValue_3(SubLObject value);

  @Override
  abstract public void setSlotValue(int index, SubLObject value);
  

  public SubLObject badIndex(int n)
  {
    StringBuilder sb = new StringBuilder("Invalid slot index ");
    sb.append(LispObjectFactory.makeInteger(n).writeToString());
    sb.append(" for ");
    sb.append(writeToString());
    return error(new LispError(sb.toString()));
  }

  @Override
  public final int psxhash()
  {
    return psxhash(4);
  }

  @Override
  public int psxhash(int depth)
  {
  	final SubLObject[] slots = getSlots();
    int result = mix(getStructureClass().sxhash(), 7814971);
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
      	final SubLObject[] slots = getSlots();
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
          return unreadableString(getStructureClass().getLispClassName().writeToString());
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
        sb.append(getStructureClass().getLispClassName().writeToString());
        if (currentLevel < maxLevel)
          {
            SubLObject effectiveSlots = getStructureClass().getSlotDefinitions();
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

  public StructureClass getStructureClass() {
		return structureClass;
	}

}

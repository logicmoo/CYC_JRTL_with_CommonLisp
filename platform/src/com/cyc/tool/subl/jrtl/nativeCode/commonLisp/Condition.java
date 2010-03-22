/*
 * Condition.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Condition.java 12512 2010-02-28 15:54:17Z vvoutilainen $
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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public class Condition extends StandardObject
{
  protected String message;

  public Condition()
  {
    super(StandardClass.CONDITION);
    Debug.assertTrue(slots.length == 2);
    setFormatArguments(NIL);
  }

  protected Condition(LispClass cls)
  {
    super(cls);
    Debug.assertTrue(slots.length >= 2);
    setFormatArguments(NIL);
  }

  public Condition(LispClass cls, int length)
  {
    super(cls, length);
  }

  public Condition(SubLObject initArgs)
  {
    super(StandardClass.CONDITION);
    Debug.assertTrue(slots.length == 2);
    initialize(initArgs);
  }

  protected void initialize(SubLObject initArgs)
  {
    SubLObject control = null;
    SubLObject arguments = null;
    SubLObject first, second;
    while (initArgs instanceof SubLCons)
      {
        first = initArgs.first();
        initArgs = initArgs.rest();
        second = initArgs.first();
        initArgs = initArgs.rest();
        if (first == Keyword.FORMAT_CONTROL)
          {
            if (control == null)
              control = second;
          }
        else if (first == Keyword.FORMAT_ARGUMENTS)
          {
            if (arguments == null)
              arguments = second;
          }
      }
    if (control != null)
      setFormatControl(control);
    if (arguments == null)
      arguments = NIL;
    setFormatArguments(arguments);
  }

  public Condition(String message)
  {
    super(StandardClass.CONDITION);
    Debug.assertTrue(slots.length == 2);
    setFormatControl(message);
    setFormatArguments(NIL);
  }

  public final SubLObject getFormatControl()
  {
    return getInstanceSlotValue(LispSymbols.FORMAT_CONTROL);
  }

  public final void setFormatControl(SubLObject formatControl)

  {
    setInstanceSlotValue(LispSymbols.FORMAT_CONTROL, formatControl);
  }

  public final void setFormatControl(String s)
  {
    setFormatControl(makeString(s));
  }

  public final SubLObject getFormatArguments()
  {
    return getInstanceSlotValue(LispSymbols.FORMAT_ARGUMENTS);
  }

  public final void setFormatArguments(SubLObject formatArguments)

  {
    setInstanceSlotValue(LispSymbols.FORMAT_ARGUMENTS, formatArguments);
  }

  /**
   * Extending classes should override this method if they want to
   * customize how they will be printed.
   */
  public String getMessage()
  {
  	SubLObject o = getFormatControl();
  	if (o instanceof SubLString) return o.getString();
    return o.writeToString();
  }

  @Override
  public SubLObject typeOf()
  {
    LispClass c = getLispClass();
    if (c != null)
      return c.getLispClassName();
    return LispSymbols.CONDITION;
  }

  @Override
  public SubLObject classOf()
  {
    LispClass c = getLispClass();
    if (c != null)
      return c;
    return StandardClass.CONDITION;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.CONDITION)
      return T;
    if (type == StandardClass.CONDITION)
      return T;
    return super.typep(type);
  }

  public String getConditionReport()
  {
    String s = getMessage();
    if (s != null)
      return s;
    SubLObject formatControl = getFormatControl();
    if (formatControl != NIL)
      {
        return format(formatControl, getFormatArguments());
      }
    return unreadableString(typeOf().writeToString());
  }

  @Override
  public final String writeToString()
  {
    final LispThread thread = LispThread.currentThread();
    if (LispSymbols.PRINT_ESCAPE.symbolValue(thread) == NIL)
      {
        String s = getMessage();
        if (s != null)
          return s;
        SubLObject formatControl = getFormatControl();
        if (formatControl instanceof Function)
          {
            StringOutputStream stream = new StringOutputStream();
            LispSymbols.APPLY.execute(formatControl, stream, getFormatArguments());
            return stream.getOutputString().getString();
          }
        if (formatControl instanceof SubLString)
          {
            SubLObject f = LispSymbols.FORMAT.getSymbolFunction();
            if (f == null || f instanceof Autoload)
              return format(formatControl, getFormatArguments());
            return LispSymbols.APPLY.execute(f, NIL, formatControl, getFormatArguments()).getString();
          }
      }
    final int maxLevel;
    SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
    if (printLevel instanceof Fixnum)
      maxLevel = ((Fixnum)printLevel).value;
    else
      maxLevel = Integer.MAX_VALUE;
    SubLObject currentPrintLevel =
      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
    int currentLevel = ((Fixnum)currentPrintLevel).value;
    if (currentLevel >= maxLevel)
      return "#";
    return unreadableString(typeOf().writeToString());
  }
}

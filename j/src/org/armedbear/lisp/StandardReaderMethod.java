/*
 * StandardReaderMethod.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: StandardReaderMethod.java,v 1.2 2005-12-27 20:00:58 piso Exp $
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
 */

package org.armedbear.lisp;

public final class StandardReaderMethod extends StandardMethod
{
  public StandardReaderMethod()
  {
    super(StandardClass.STANDARD_READER_METHOD,
          StandardClass.STANDARD_READER_METHOD.getClassLayout().getLength());
  }

  // ### reader-method-slot-name
  private static final Primitive READER_METHOD_SLOT_NAME =
      new Primitive("reader-method-slot-name", PACKAGE_MOP, false, "reader-method")
  {
      public LispObject execute(LispObject arg) throws ConditionThrowable
      {
          try
          {
              return ((StandardReaderMethod)arg).slots[StandardReaderMethodClass.SLOT_INDEX_SLOT_NAME];
          }
          catch (ClassCastException e)
          {
              return signalTypeError(arg, Symbol.STANDARD_READER_METHOD);
          }
      }
  };

  // ### set-reader-method-slot-name
  private static final Primitive SET_READER_METHOD_SLOT_NAME =
      new Primitive("set-reader-method-slot-name", PACKAGE_MOP, false,
                    "reader-method slot-name")
  {
      public LispObject execute(LispObject first, LispObject second)
          throws ConditionThrowable
      {
          try
          {
              ((StandardReaderMethod)first).slots[StandardReaderMethodClass.SLOT_INDEX_SLOT_NAME] = second;
              return second;
          }
          catch (ClassCastException e)
          {
              return signalTypeError(first, Symbol.STANDARD_READER_METHOD);
          }
      }
  };
}
/*
 * copy_list.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: copy_list.java,v 1.2 2005-12-01 14:52:39 piso Exp $
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

// ### copy-list list => copy
public final class copy_list extends Primitive
{
  private copy_list()
  {
    super(Symbol.COPY_LIST, "list");
  }

  public LispObject execute(LispObject arg) throws ConditionThrowable
  {
    if (arg == NIL)
      return NIL;
    Cons result = new Cons(arg.car());
    Cons splice = result;
    arg = arg.cdr();
    while (arg instanceof Cons)
      {
        Cons cons = (Cons) arg;
        Cons temp = new Cons(cons.car);
        splice.cdr = temp;
        splice = temp;
        arg = cons.cdr;
      }
    splice.cdr = arg;
    return result;
  }

  private static final Primitive COPY_LIST = new copy_list();
};

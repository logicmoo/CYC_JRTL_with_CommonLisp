/*
 * machine_type.java
 *
 * Copyright (C) 2004-2007 Peter Graves
 * $Id: machine_type.java,v 1.3 2007-03-02 12:04:05 piso Exp $
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
 */

package org.armedbear.lisp;

// ### machine-type
public final class machine_type extends Primitive
{
  private machine_type()
  {
    super("machine-type");
  }

  public LispObject execute() throws ConditionThrowable
  {
    return new SimpleString(System.getProperty("os.arch"));
  }

  private static final Primitive MACHINE_TYPE = new machine_type();
}

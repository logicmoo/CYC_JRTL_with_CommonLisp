/*
 * Binding.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Binding.java,v 1.2 2003-11-19 01:58:31 piso Exp $
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

// Package accessibility.
final class Binding
{
    LispObject symbol;
    LispObject value;
    boolean specialp;
    final Binding next;

    Binding()
    {
        next = null;
    }

    Binding(LispObject symbol, LispObject value, Binding next)
    {
        this.symbol = symbol;
        this.value = value;
        this.next = next;
    }
}

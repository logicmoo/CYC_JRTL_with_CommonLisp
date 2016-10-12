/*
 * Cons.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Cons.java 12516 2010-03-03 21:05:41Z astalla $
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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

public interface LispCons extends SubLList {

	public abstract SubLObject cddr();

	public abstract int cl_length();

	public abstract SubLObject classOf();

	public abstract boolean constantp();

	public abstract SubLObject[] copyToArray();

	public abstract SubLObject elt(int index);

	public abstract boolean endp();

	public abstract boolean equal(SubLObject obj);

	public abstract boolean equalp(SubLObject obj);

	public abstract SubLObject execute();

	public abstract SubLObject execute(SubLObject arg);

	public abstract SubLObject execute(SubLObject first, SubLObject second);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh);

	public abstract SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth);

	public abstract SubLObject execute(SubLObject[] args);

	public abstract SubLObject first();

	public abstract boolean isAtom();

	public abstract boolean isList();

	public abstract SubLObject nreverse();

	public abstract SubLObject NTH(int index);

	public abstract SubLObject NTH(SubLObject arg);

	public abstract SubLObject nthCdr(int n);

	public abstract int psxhash();

	public abstract SubLObject rest();

	public abstract SubLObject reverse();

	public abstract SubLObject second();

	public abstract void setCar(SubLObject car);

	public abstract void setCdr(SubLObject cdr);

	public abstract SubLCons setFirst(SubLObject obj);

	public abstract SubLCons setRest(SubLObject obj);

	public abstract int sxhash();

	public abstract SubLObject third();

	public abstract String toString();

	public abstract SubLObject typeOf();

	public abstract SubLObject typep(SubLObject typeSpecifier);

	public abstract String writeToString();
}
/*
 * ConditionThrowable.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ConditionThrowable.java,v 1.7 2003-12-12 01:09:24 piso Exp $
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

public class ConditionThrowable extends Throwable
{
    public Condition condition;

    public ConditionThrowable()
    {
    }

    public ConditionThrowable(Condition condition)
    {
        this.condition = condition;
    }

    public ConditionThrowable(String message)
    {
        super(message);
    }

    public LispObject getCondition()
    {
        return condition != null ? condition : new Condition();
    }
}

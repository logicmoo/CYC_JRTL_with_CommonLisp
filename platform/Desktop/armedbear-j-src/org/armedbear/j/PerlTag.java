/*
 * PerlTag.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: PerlTag.java,v 1.1.1.1 2002/09/24 16:07:43 piso Exp $
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

package org.armedbear.j;

public final class PerlTag extends LocalTag
{
    public PerlTag(String name, Line line)
    {
        super(name, line);
    }

    @Override
	public String getMethodName()
    {
        int index = name.lastIndexOf("::");
        if (index >= 0)
            return name.substring(index + 2);
        else
            return name;
    }

    @Override
	public String getLongName()
    {
        return name;
    }

    @Override
	public String toString()
    {
        return name;
    }
}

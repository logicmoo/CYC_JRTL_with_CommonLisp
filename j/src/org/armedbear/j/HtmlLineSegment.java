/*
 * HtmlLineSegment.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: HtmlLineSegment.java,v 1.1.1.1 2002-09-24 16:09:14 piso Exp $
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

public final class HtmlLineSegment extends LineSegment
{
    private Link link;

    public HtmlLineSegment(String text, int format)
    {
        super(text, format);
    }

    public HtmlLineSegment(String text, int format, Link link)
    {
        super(text, format);
        this.link = link;
    }

    public final Link getLink()
    {
        return link;
    }

    public final void recycle()
    {
        // Do nothing.
    }
}

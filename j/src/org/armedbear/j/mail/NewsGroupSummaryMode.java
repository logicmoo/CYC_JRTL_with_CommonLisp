/*
 * NewsGroupSummaryMode.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: NewsGroupSummaryMode.java,v 1.1.1.1 2002-09-24 16:10:14 piso Exp $
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

package org.armedbear.j.mail;

import java.awt.event.KeyEvent;
import org.armedbear.j.AbstractMode;
import org.armedbear.j.Buffer;
import org.armedbear.j.Constants;
import org.armedbear.j.Formatter;
import org.armedbear.j.KeyMap;
import org.armedbear.j.Mode;
import org.armedbear.j.Property;

public final class NewsGroupSummaryMode extends AbstractMode
    implements Constants, Mode
{
    private static final Mode mode = new NewsGroupSummaryMode();

    private NewsGroupSummaryMode()
    {
        super(NEWS_GROUP_SUMMARY_MODE, NEWS_GROUP_SUMMARY_MODE_NAME);
        setProperty(Property.VERTICAL_RULE, 0);
        setProperty(Property.SHOW_LINE_NUMBERS, false);
        setProperty(Property.SHOW_CHANGE_MARKS, false);
    }

    public static final Mode getMode()
    {
        return mode;
    }

    public final Formatter getFormatter(Buffer buffer)
    {
        return new MailboxFormatter(buffer);
    }

    protected final void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_ENTER, 0, "readArticle");
    }
}

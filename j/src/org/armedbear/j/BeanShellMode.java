/*
 * BeanShellMode.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: BeanShellMode.java,v 1.2 2003-06-12 16:35:36 piso Exp $
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

import java.awt.event.KeyEvent;

public final class BeanShellMode extends JavaMode implements Constants, Mode
{
    private static final Mode mode = new BeanShellMode();

    private BeanShellMode()
    {
        super(BEANSHELL_MODE, BEANSHELL_MODE_NAME);
        keywords = new Keywords(this);
        conditionals = javaConditionals;
    }

    public static final Mode getMode()
    {
        return mode;
    }

    protected void setKeyMapDefaults(KeyMap km)
    {
        super.setKeyMapDefaults(km);
        km.unmapKey(KeyEvent.VK_F9, 0); // compile
        km.unmapKey(KeyEvent.VK_F9, CTRL_MASK); // recompile
    }

    public void populateModeMenu(Editor editor, Menu menu)
    {
        // No mode menu yet.
    }
}

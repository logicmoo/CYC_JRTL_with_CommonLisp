/*
 * API.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: API.java,v 1.3 2003-06-13 15:34:36 piso Exp $
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

public final class API
{
    private API()
    {
    }

    public static boolean globalMapKey(String keyText, String command)
    {
        return KeyMap.getGlobalKeyMap().mapKey(keyText, command);
    }

    public static boolean globalUnmapKey(String keyText)
    {
        return KeyMap.getGlobalKeyMap().unmapKey(keyText);
    }

    public static boolean mapKeyForMode(String keyText, String command, String modeName)
    {
        Mode mode = Editor.getModeList().getModeFromModeName(modeName);
        if (mode == null) {
            Log.error("mode not found \"".concat(modeName).concat("\""));
            return false;
        }
        return mode.getKeyMap().mapKey(keyText, command);
    }

    public static boolean unmapKeyForMode(String keyText, String modeName)
    {
        Mode mode = Editor.getModeList().getModeFromModeName(modeName);
        if (mode == null) {
            Log.error("mode not found \"".concat(modeName).concat("\""));
            return false;
        }
        return mode.getKeyMap().mapKey(keyText, null);
    }

    public static final void setGlobalProperty(String key, String value)
    {
        Editor.setGlobalProperty(key, value);
    }
}

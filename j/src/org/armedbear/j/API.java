/*
 * API.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: API.java,v 1.2 2002-10-26 01:28:17 piso Exp $
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

    public static void globalMapKey(String keyText, String command)
    {
        KeyMap km = KeyMap.getGlobalOverrides(true);
        synchronized(km) {
            km.mapKey(keyText, command);
        }
    }

    public static void globalUnmapKey(String keyText)
    {
        KeyMap km = KeyMap.getGlobalOverrides(true);
        synchronized(km) {
            km.mapKey(keyText, null);
        }
    }

    public static void mapKeyForMode(String keyText, String command, String modeName)
    {
        Mode mode = Editor.getModeList().getModeFromModeName(modeName);
        if (mode == null) {
            Log.error("mode not found \"".concat(modeName).concat("\""));
            return;
        }
        KeyMap km = mode.getOverrides(true);
        synchronized(km) {
            km.mapKey(keyText, command);
        }
    }

    public static void unmapKeyForMode(String keyText, String modeName)
    {
        Mode mode = Editor.getModeList().getModeFromModeName(modeName);
        if (mode == null) {
            Log.error("mode not found \"".concat(modeName).concat("\""));
            return;
        }
        KeyMap km = mode.getOverrides(true);
        synchronized(km) {
            km.mapKey(keyText, null);
        }
    }

    public static final void setGlobalProperty(String key, String value)
    {
        Editor.setGlobalProperty(key, value);
    }
}

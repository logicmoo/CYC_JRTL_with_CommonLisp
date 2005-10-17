/*
 * Site.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Site.java,v 1.3 2005-10-17 16:45:19 piso Exp $
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

import java.io.File;
import java.net.URL;

public final class Site extends Lisp
{
    private static final String LISP_HOME;

    static {
        String lispHome = null;
        URL url = Lisp.class.getResource("boot.lisp");
        if (url != null) {
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                String path = url.getPath();
                int index = path.lastIndexOf('/');
                if (index >= 0) {
                    lispHome = path.substring(0, index + 1);
                    if (Utilities.isPlatformWindows) {
                        if (lispHome.length() > 0 && lispHome.charAt(0) == '/')
                            lispHome = lispHome.substring(1);
                    }
                }
            }
        }
        LISP_HOME = lispHome;
    }

    public static final String getLispHome()
    {
        return LISP_HOME;
    }

    // ### *lisp-home*
    private static final Symbol _LISP_HOME_ =
        exportSpecial("*LISP-HOME*", PACKAGE_EXT, NIL);

    static {
        try {
            String s = Site.getLispHome();
            if (s != null)
                _LISP_HOME_.setSymbolValue(new Pathname(s));
        }
        catch (Throwable t) {
            Debug.trace(t);
        }
    }
}

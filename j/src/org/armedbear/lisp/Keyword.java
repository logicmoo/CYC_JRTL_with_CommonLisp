/*
 * Keyword.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Keyword.java,v 1.8 2003-09-21 02:05:20 piso Exp $
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

public final class Keyword extends Lisp
{
    public static final Symbol internKeyword(String s)
    {
        return PACKAGE_KEYWORD.intern(s);
    }

    public static final Symbol
        ABORT            = internKeyword("ABORT"),
        ALLOW_OTHER_KEYS = internKeyword("ALLOW-OTHER-KEYS"),
        CAPITALIZE       = internKeyword("CAPITALIZE"),
        DOWNCASE         = internKeyword("DOWNCASE"),
        ELEMENT_TYPE     = internKeyword("ELEMENT-TYPE"),
        ERROR            = internKeyword("ERROR"),
        EXTERNAL         = internKeyword("EXTERNAL"),
        FILL_POINTER     = internKeyword("FILL-POINTER"),
        INHERITED        = internKeyword("INHERITED"),
        INITIAL_CONTENTS = internKeyword("INITIAL-CONTENTS"),
        INITIAL_ELEMENT  = internKeyword("INITIAL-ELEMENT"),
        INTERNAL         = internKeyword("INTERNAL"),
        NAME             = internKeyword("NAME"),
        NICKNAMES        = internKeyword("NICKNAMES"),
        NO_ERROR         = internKeyword("NO-ERROR"),
        SUPERSEDE        = internKeyword("SUPERSEDE"),
        UPCASE           = internKeyword("UPCASE"),
        USE              = internKeyword("USE"),
        WILD             = internKeyword("WILD");
}

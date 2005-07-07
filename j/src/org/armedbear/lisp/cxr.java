/*
 * cxr.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: cxr.java,v 1.11 2005-07-07 05:28:34 piso Exp $
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

public final class cxr extends Lisp
{
    // ### set-car
    private static final Primitive SET_CAR =
        new Primitive("set-car", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            first.setCar(second);
            return second;
        }
    };

    // ### set-cdr
    private static final Primitive SET_CDR =
        new Primitive("set-cdr", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            first.setCdr(second);
            return second;
        }
    };

    // ### car
    private static final Primitive CAR = new Primitive("car", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car();
        }
    };

    // ### cdr
    private static final Primitive CDR = new Primitive("cdr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr();
        }
    };

    // ### caar
    private static final Primitive CAAR = new Primitive("caar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().car();
        }
    };

    // ### cadr
    private static final Primitive CADR = new Primitive("cadr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cadr();
        }
    };

    // ### cdar
    private static final Primitive CDAR = new Primitive("cdar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().cdr();
        }
    };

    // ### cddr
    private static final Primitive CDDR = new Primitive("cddr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr().cdr();
        }
    };

    // ### caddr
    private static final Primitive CADDR = new Primitive("caddr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.caddr();
        }
    };

    // ### caadr
    private static final Primitive CAADR = new Primitive("caadr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr().car().car();
        }
    };

    // ### caaar
    private static final Primitive CAAAR = new Primitive("caaar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().car().car();
        }
    };

    // ### cdaar
    private static final Primitive CDAAR = new Primitive("cdaar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().car().cdr();
        }
    };

    // ### cddar
    private static final Primitive CDDAR = new Primitive("cddar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().cdr().cdr();
        }
    };

    // ### cdddr
    private static final Primitive CDDDR = new Primitive("cdddr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr().cdr().cdr();
        }
    };

    // ### cadar
    private static final Primitive CADAR = new Primitive("cadar", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car().cdr().car();
        }
    };

    // ### cdadr
    private static final Primitive CDADR = new Primitive("cdadr", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr().car().cdr();
        }
    };

    // ### first
    private static final Primitive FIRST = new Primitive("first", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.car();
        }
    };

    // ### second
    private static final Primitive SECOND = new Primitive("second", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cadr();
        }
    };

    // ### third
    private static final Primitive THIRD = new Primitive("third", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.caddr();
        }
    };

    // ### fourth
    private static final Primitive FOURTH = new Primitive("fourth", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr().cdr().cadr();
        }
    };

    // ### rest
    private static final Primitive REST = new Primitive("rest", "list")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.cdr();
        }
    };
}

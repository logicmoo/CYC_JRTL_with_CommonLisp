/*
 * Mailbox.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: Mailbox.java,v 1.1 2004-06-26 14:55:33 asimon Exp $
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
import java.util.Stack;

public final class Mailbox extends LispObject
{

    private Stack box = new Stack();  

    private void send (LispObject o) 
    {
        synchronized(this) {
            box.push(o);
            notifyAll();
        }
    }

    private LispObject read ()
    {
        while (box.empty()) 
            synchronized(this) {
                try {
                    wait();
                } catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        return (LispObject) box.pop();
    }

    private LispObject peek ()
    {
        return (LispObject) box.peek();
    }

    private LispObject empty ()
    {
        return box.empty() ? T : NIL;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<MAILBOX @ #x");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(">");
        return sb.toString();
    }


    // ### make-mailbox
    private static final Primitive0 MAKE_MAILBOX =
        new Primitive0("make-mailbox", PACKAGE_EXT, true, "")
    {
        public LispObject execute() throws ConditionThrowable
        {
            return new Mailbox();
        }
    };

    // ### mailbox-send mailbox object
    private static final Primitive2 MAILBOX_SEND =
        new Primitive2("mailbox-send", PACKAGE_EXT, true, "mailbox object")
    {
        public LispObject execute(LispObject first, LispObject second) throws ConditionThrowable
        {
            if (first instanceof Mailbox) {
                Mailbox mbox = (Mailbox) first;
                mbox.send(second);
                return T;
            } else 
                return signal(new TypeError(first, "Mailbox"));
        }
    };

    // ### mailbox-read mailbox
    private static final Primitive1 MAILBOX_READ =
        new Primitive1("mailbox-read", PACKAGE_EXT, true, "mailbox")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Mailbox) {
                Mailbox mbox = (Mailbox) arg;
                return mbox.read();
            } else 
                return signal(new TypeError(arg, "Mailbox"));
        }
    };

    // ### mailbox-peek mailbox
    private static final Primitive1 MAILBOX_PEEK =
        new Primitive1("mailbox-peek", PACKAGE_EXT, true, "mailbox")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Mailbox) {
                Mailbox mbox = (Mailbox) arg;
                return mbox.peek();
            } else 
                return signal(new TypeError(arg, "Mailbox"));
        }
    };

    // ### mailbox-empty-p mailbox
    private static final Primitive1 MAILBOX_EMPTY_P =
        new Primitive1("mailbox-empty-p", PACKAGE_EXT, true, "mailbox")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof Mailbox) {
                Mailbox mbox = (Mailbox) arg;
                return mbox.empty();
            } else 
                return signal(new TypeError(arg, "Mailbox"));
        }
    };
}


/*
 * JHandler.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: JHandler.java,v 1.5 2003-12-13 00:58:51 piso Exp $
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

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class JHandler extends Lisp
{
    private static final Map table = new WeakHashMap();

    public static void callLisp (String s, Object o) {
        callLisp(s, o, "");
    }

    public static void callLisp (String s, Object o, String s1) {
        callLisp(s, o, s1, new int[] {});
    }

    public static void callLisp (String s, Object o, String s1, int ai[]) {
        callLisp(s, o, new String[] { s1 }, ai);
    }

    public static void callLisp (String s, Object o, String as[]) {
        callLisp(s, o, as, new int[] {});
    }

    public static void callLisp (String s, Object o, String as[], int ai[]) {
        if (table.containsKey(o)) {
            Map entryTable =  (Map)table.get(o);
            if (entryTable.containsKey(s)) {
                Function f = ((Entry)entryTable.get(s)).getHandler();
                LispObject data = ((Entry)entryTable.get(s)).getData();
                Fixnum count = ((Entry)entryTable.get(s)).getCount();
                Fixnum[] lispAi = new Fixnum[ai.length];
                for (int i = 0; i < ai.length; i++) {
                    lispAi[i] = new Fixnum(ai[i]);
                }
                LispObject lispAiVector = new Vector(lispAi);
                LispString[] lispAs = new LispString[as.length];
                for (int i = 0; i < as.length; i++) {
                    lispAs[i] = new LispString(as[i]);
                }
                LispObject lispAsVector = new Vector(lispAs);
                LispObject[] args = new LispObject[] //FIXME: count -> seq_num
                { data, new JavaObject(o), lispAiVector, lispAsVector, Keyword.internKeyword(s), count };
                try {
                    f.execute(args);
                }
                catch (ConditionThrowable t) {
                    t.printStackTrace();
                }
            }
        }
    }

    // jregister-handler1 object event handler data count
    private static final Primitive _JREGISTER_HANDLER =
        new Primitive("%jregister-handler", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 5)
                return signal(new WrongNumberOfArgumentsException(this));
            Map entryTable = null;
            Object object = args[0].javaInstance();
            String event = ((Symbol)args[1]).getName();
            if (!table.containsKey(object)) {
                entryTable = new HashMap();
                table.put(object,entryTable);
            } else {
                entryTable = (Map)table.get(object);
            }
            Entry entry = new Entry((Function) args[2], args[3], event, entryTable);
            if (args[4] != NIL)
                entry.addCount(((Fixnum)args[4]).getValue());
            entryTable.put(event,entry);
            return T;
        }
    };
}

class Entry
{
    public Entry (Function handler, LispObject data, String event, Map entryTable) {
        this.entryTable = entryTable;
        this.event = event;
        this.handler = handler;
        this.data = data;
    }

    public Function getHandler () {
        return handler;
    }

    public void addData (LispObject data) {
        this.data = data;
    }

    public LispObject getData () {
        return data;
    }

    public void addCount (int count) {
        this.count = count;
    }

    public Fixnum getCount () {
        if (count == 0)
            entryTable.remove(event);
        return (new Fixnum (count--));
    }

    Function handler;
    LispObject data;
    int count = -1;
    Map entryTable;
    String event;
}

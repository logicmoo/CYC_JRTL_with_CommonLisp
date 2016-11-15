/*
 * JHandler.java
 *
 * Copyright (C) 2003-2005 Andras Simon, Peter Graves
 * $Id: JHandler.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class JHandler {
	private static class Entry {
		Function handler;
		SubLObject data;
		int count = -1;
		Map<String, Entry> entryTable;
		String event;

		public Entry(Function handler, SubLObject data, String event, Map<String, Entry> entryTable) {
			this.entryTable = entryTable;
			this.event = event;
			this.handler = handler;
			this.data = data;
		}

		public void addCount(int count) {
			this.count = count;
		}

		public void addData(SubLObject data) {
			this.data = data;
		}

		public Fixnum getCount() {
			if (this.count == 0)
				this.entryTable.remove(this.event);
			return LispObjectFactory.makeInteger(this.count--);
		}

		public SubLObject getData() {
			return this.data;
		}

		public Function getHandler() {
			return this.handler;
		}
	}

	static Map<Object, Map<String, Entry>> table = new WeakHashMap<Object, Map<String, Entry>>();

	// jregister-handler1 object event handler data count
	private static Primitive _JREGISTER_HANDLER = new JavaPrimitive("%jregister-handler", Lisp.PACKAGE_JAVA) {

		public SubLObject execute(SubLObject[] args) {
			if (args.length != 5)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			Map<String, Entry> entryTable = null;
			Object object = args[0].javaInstance();
			String event = ((SubLSymbol) args[1]).getJavaSymbolName();
			if (!JHandler.table.containsKey(object)) {
				entryTable = new HashMap<String, Entry>();
				JHandler.table.put(object, entryTable);
			} else
				entryTable = JHandler.table.get(object);
			Entry entry = new Entry((Function) args[2], args[3], event, entryTable);
			if (args[4] != Lisp.NIL)
				entry.addCount(((Fixnum) args[4]).value);
			entryTable.put(event, entry);
			return Lisp.T;
		}
	};

	public static void callLisp(String s, Object o) {
		JHandler.callLisp(s, o, "");
	}

	public static void callLisp(String s, Object o, String s1) {
		JHandler.callLisp(s, o, s1, new int[] {});
	}

	public static void callLisp(String s, Object o, String as[]) {
		JHandler.callLisp(s, o, as, new int[] {});
	}

	public static void callLisp(String s, Object o, String s1, int ai[]) {
		JHandler.callLisp(s, o, new String[] { s1 }, ai);
	}

	public static void callLisp(String s, Object o, String as[], int ai[]) {
		if (JHandler.table.containsKey(o)) {
			Map<String, Entry> entryTable = JHandler.table.get(o);
			if (entryTable.containsKey(s)) {
				Function f = entryTable.get(s).getHandler();
				SubLObject data = entryTable.get(s).getData();
				Fixnum count = entryTable.get(s).getCount();
				Fixnum[] lispAi = new Fixnum[ai.length];
				for (int i = 0; i < ai.length; i++)
					lispAi[i] = LispObjectFactory.makeInteger(ai[i]);
				SubLObject lispAiVector = LispObjectFactory.makeSimpleVector(lispAi);
				SubLString[] lispAs = new SubLString[as.length];
				for (int i = 0; i < as.length; i++)
					lispAs[i] = LispObjectFactory.makeString(as[i]);
				SubLObject lispAsVector = LispObjectFactory.makeSimpleVector(lispAs);
				SubLObject[] args = new SubLObject[] // FIXME: count -> seq_num
				{ data, new ABCLJavaObject(o), lispAiVector, lispAsVector, Lisp.internKeyword(s), count };
				f.execute(args);
			}
		}
	}
}

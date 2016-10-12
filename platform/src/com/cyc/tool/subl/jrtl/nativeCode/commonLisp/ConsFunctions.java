/*
 * cxr.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: cxr.java 12472 2010-02-14 13:32:12Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ConsFunctions {
	public static class assq extends JavaPrimitive {
		assq() {
			super("assq", Lisp.PACKAGE_EXT, true);
		}

		public SubLObject execute(SubLObject item, SubLObject alist)

		{
			return Lisp.assq(item, alist);
		}

	}

	public static class assql extends JavaPrimitive {
		assql() {
			super("assql", Lisp.PACKAGE_EXT);
		}

		public SubLObject execute(SubLObject item, SubLObject alist) {
			return ConsFunctions.ASSQL_execute(item, alist);
		}

	};

	private static class copy_list extends JavaPrimitive {
		copy_list() {
			super(LispSymbols.COPY_LIST, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return ConsFunctions.COPY_LIST_execute(arg);
		}
	}

	public static class get_properties extends JavaPrimitive {
		get_properties() {
			super(LispSymbols.GET_PROPERTIES, "plist indicator-list");
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispThread thread = LispThread.currentThread();
			SubLObject plist = first;
			while (plist != Lisp.NIL)
				if (plist.rest() instanceof SubLCons) {
					SubLObject indicator = ((SubLCons) plist).first();
					SubLObject indicators = second;
					while (indicators instanceof SubLCons) {
						if (indicator == ((SubLCons) indicators).first())
							return thread.setValues(indicator, plist.second(), plist);
						indicators = ((SubLCons) indicators).rest();
					}
					if (indicators != Lisp.NIL)
						return Lisp.type_error(indicators, LispSymbols.LIST);
					plist = plist.cddr();
				} else
					return Lisp.type_error(plist.rest(), LispSymbols.CONS);
			return thread.setValues(Lisp.NIL, Lisp.NIL, Lisp.NIL);
		}
	}

	public static class last extends JavaPrimitive {
		public last() {
			super("last", "list &optional n");
		}

		public SubLObject execute(SubLObject arg) {
			return ConsFunctions.LAST_execute(arg);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			SubLObject list = Lisp.checkList(first);
			if (second instanceof Fixnum) {
				int n = ((Fixnum) second).value;
				if (n >= 0) {
					if (list == Lisp.NIL)
						return Lisp.NIL;
					SubLObject result = list;
					while (list instanceof SubLCons) {
						list = list.rest();
						if (n-- <= 0)
							result = result.rest();
					}
					return result;
				}
			} else if (second instanceof Bignum) {
				if (list == Lisp.NIL)
					return Lisp.NIL;
				SubLObject n = second;
				SubLObject result = list;
				while (list instanceof SubLCons) {
					list = list.rest();
					if (!n.isPositive())
						result = result.rest();
					n = n.dec();
				}
				return result;
			}
			return Lisp.type_error(second, LispSymbols.UNSIGNED_BYTE);
		}
	};

	private static class pf_caaar extends JavaPrimitive {
		pf_caaar() {
			super(LispSymbols.CAAAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().first().first();
		}
	}

	private static class pf_caadr extends JavaPrimitive {
		pf_caadr() {
			super(LispSymbols.CAADR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest().first().first();
		}
	}

	private static class pf_caar extends JavaPrimitive {
		pf_caar() {
			super(LispSymbols.CAAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().first();
		}
	};

	private static class pf_cadar extends JavaPrimitive {
		pf_cadar() {
			super(LispSymbols.CADAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().rest().first();
		}
	}

	private static class pf_caddr extends JavaPrimitive {
		pf_caddr() {
			super(LispSymbols.CADDR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.third();
		}
	};

	private static class pf_cadr extends JavaPrimitive {
		pf_cadr() {
			super(LispSymbols.CADR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.second();
		}
	}

	private static class pf_car extends JavaPrimitive {
		pf_car() {
			super(LispSymbols.CAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first();
		}
	};

	private static class pf_cdaar extends JavaPrimitive {
		pf_cdaar() {
			super(LispSymbols.CDAAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().first().rest();
		}
	}

	private static class pf_cdadr extends JavaPrimitive {
		pf_cdadr() {
			super(LispSymbols.CDADR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest().first().rest();
		}
	};

	private static class pf_cdar extends JavaPrimitive {
		pf_cdar() {
			super(LispSymbols.CDAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().rest();
		}
	}

	private static class pf_cddar extends JavaPrimitive {
		pf_cddar() {
			super(LispSymbols.CDDAR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first().rest().rest();
		}
	};

	private static class pf_cdddr extends JavaPrimitive {
		pf_cdddr() {
			super(LispSymbols.CDDDR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest().rest().rest();
		}
	}

	private static class pf_cddr extends JavaPrimitive {
		pf_cddr() {
			super(LispSymbols.CDDR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest().rest();
		}
	};

	private static class pf_cdr extends JavaPrimitive {
		pf_cdr() {
			super(LispSymbols.CDR, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest();
		}
	}

	private static class pf_first extends JavaPrimitive {
		pf_first() {
			super(LispSymbols.FIRST, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.first();
		}
	};

	private static class pf_fourth extends JavaPrimitive {
		pf_fourth() {
			super(LispSymbols.FOURTH, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest().rest().second();
		}
	}

	private static class pf_rest extends JavaPrimitive {
		pf_rest() {
			super(LispSymbols.REST, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.rest();
		}
	};

	private static class pf_second extends JavaPrimitive {
		pf_second() {
			super(LispSymbols.SECOND, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.second();
		}
	}

	private static class pf_set_car extends JavaPrimitive {
		pf_set_car() {
			super("set-car", Lisp.PACKAGE_SYS, true);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			first.setCar(second);
			return second;
		}
	};

	private static class pf_set_cdr extends JavaPrimitive {
		pf_set_cdr() {
			super("set-cdr", Lisp.PACKAGE_SYS, true);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			first.setCdr(second);
			return second;
		}
	}

	private static class pf_third extends JavaPrimitive {
		pf_third() {
			super(LispSymbols.THIRD, "list");
		}

		public SubLObject execute(SubLObject arg) {
			return arg.third();
		}
	};

	// ### simple-list-remove-duplicates
	public static class simple_list_remove_duplicates extends JavaPrimitive {
		simple_list_remove_duplicates() {
			super("simple-list-remove-duplicates", Lisp.PACKAGE_SYS, false, "list");
		}

		public SubLObject execute(SubLObject list) {
			SubLObject result = Lisp.NIL;
			while (list != Lisp.NIL) {
				SubLObject item = list.first();
				boolean duplicate = false;
				SubLObject tail = list.rest();
				while (tail != Lisp.NIL) {
					if (item.eql(tail.first())) {
						duplicate = true;
						break;
					}
					tail = tail.rest();
				}
				if (!duplicate)
					result = LispObjectFactory.makeCons(item, result);
				list = list.rest();
			}
			return result.nreverse();
		}
	}

	// ### set-car
	private static Primitive SET_CAR = new pf_set_car();;

	// ### set-cdr
	private static Primitive SET_CDR = new pf_set_cdr();

	// ### car
	private static Primitive CAR = new pf_car();;

	// ### cdr
	private static Primitive CDR = new pf_cdr();

	// ### caar
	private static Primitive CAAR = new pf_caar();;

	// ### cadr
	private static Primitive CADR = new pf_cadr();

	// ### cdar
	private static Primitive CDAR = new pf_cdar();;

	// ### cddr
	private static Primitive CDDR = new pf_cddr();

	// ### caddr
	private static Primitive CADDR = new pf_caddr();;

	// ### caadr
	private static Primitive CAADR = new pf_caadr();

	// ### caaar
	private static Primitive CAAAR = new pf_caaar();;

	// ### cdaar
	private static Primitive CDAAR = new pf_cdaar();

	// ### cddar
	private static Primitive CDDAR = new pf_cddar();;

	// ### cdddr
	private static Primitive CDDDR = new pf_cdddr();

	// ### cadar
	private static Primitive CADAR = new pf_cadar();;

	// ### cdadr
	private static Primitive CDADR = new pf_cdadr();

	// ### first
	private static Primitive FIRST = new pf_first();;

	// ### second
	private static Primitive SECOND = new pf_second();

	// ### third
	private static Primitive THIRD = new pf_third();

	// ### fourth
	private static Primitive FOURTH = new pf_fourth();

	// ### rest
	private static Primitive REST = new pf_rest();

	// ### last list &optional n => tail
	private static Primitive LAST = new last();;

	// ### copy-list list => copy
	private static Primitive COPY_LIST = new copy_list();

	// ### assql item alist => entry
	private static Primitive ASSQL = new assql();

	// ### assq item alist => entry
	private static Primitive ASSQ = new assq();

	private static Primitive SIMPLE_LIST_REMOVE_DUPLICATES = new simple_list_remove_duplicates();

	// ### get-properties
	private static Primitive GET_PROPERTIES = new get_properties();

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(ConsFunctions.class);
		InlinedPrimitiveRegistry.inlineStaticNow(ConsFunctions.class, LispSymbols.LIST, "list_exec", 2, 0, false);
		InlinedPrimitiveRegistry.inlineStaticNow(ConsFunctions.class, LispSymbols.NOT, "not_exec", 1, 0, false);
	}

	@InlinableMethod
	public static SubLObject ASSQ_execute(SubLObject item, SubLObject alist)

	{
		return Lisp.assq(item, alist);
	}

	@InlinableMethod
	static public SubLObject ASSQL_execute(SubLObject item, SubLObject alist) {
		while (alist != Lisp.NIL) {
			SubLObject cons = alist.first();
			if (cons instanceof SubLCons) {
				if (cons.first().eql(item))
					return cons;
			} else if (cons != Lisp.NIL)
				return Lisp.type_error(cons, LispSymbols.LIST);
			alist = alist.rest();
		}
		return Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject COPY_LIST_execute(SubLObject arg) {
		if (arg == Lisp.NIL)
			return Lisp.NIL;
		SubLCons result = LispObjectFactory.makeCons(arg.first());
		SubLCons splice = result;
		arg = arg.rest();
		while (arg instanceof SubLCons) {
			SubLCons cons = (SubLCons) arg;
			SubLCons temp = LispObjectFactory.makeCons(cons.first());
			splice.setCdr(temp);
			splice = temp;
			arg = cons.rest();
		}
		splice.setCdr(arg);
		return result;
	}

	@InlinableMethod
	static public SubLObject LAST_execute(SubLObject arg) {
		if (arg == Lisp.NIL)
			return Lisp.NIL;
		if (arg instanceof SubLCons)
			while (true) {
				SubLObject cdr = ((SubLCons) arg).rest();
				if (!(cdr instanceof SubLCons))
					return arg;
				arg = cdr;
			}
		else
			return Lisp.type_error(arg, LispSymbols.LIST);
	}

	static public SubLObject list_exec(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeCons(first, LispObjectFactory.makeCons(second));
	}

	static public SubLObject not_exec(SubLObject first) {
		return first.NOT();
	}

	@InlinableMethod
	static public SubLObject SET_CAR_execute(SubLObject first, SubLObject second) {
		first.setCar(second);
		return second;
	}

	@InlinableMethod
	public static SubLObject SET_CDR_execute(SubLObject first, SubLObject second) {
		first.setCdr(second);
		return second;
	}
}

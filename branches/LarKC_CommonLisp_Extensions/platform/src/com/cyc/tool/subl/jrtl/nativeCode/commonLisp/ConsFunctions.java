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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;


import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class ConsFunctions {
    // ### set-car
    private static final Primitive SET_CAR = new pf_set_car();
    private static final class pf_set_car extends JavaPrimitive {
        pf_set_car() {
            super("set-car", PACKAGE_SYS, true);
        }

        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            first.setCar(second);
            return second;
        }
    };

    @InlinableMethod
    static public SubLObject SET_CAR_execute(SubLObject first, SubLObject second)
    {
        first.setCar(second);
        return second;
    }

    // ### set-cdr
    private static final Primitive SET_CDR = new pf_set_cdr();
    private static final class pf_set_cdr extends JavaPrimitive {
        pf_set_cdr() {
            super("set-cdr", PACKAGE_SYS, true);
        }

        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            first.setCdr(second);
            return second;
        }
    };
    
    @InlinableMethod
    public static SubLObject SET_CDR_execute(SubLObject first, SubLObject second)
    {
        first.setCdr(second);
        return second;
    }

    // ### car
    private static final Primitive CAR = new pf_car();
    private static final class pf_car extends JavaPrimitive {
        pf_car() {
            super(LispSymbols.CAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first();
        }
    };

    // ### cdr
    private static final Primitive CDR = new pf_cdr();
    private static final class pf_cdr extends JavaPrimitive {
        pf_cdr() {
            super(LispSymbols.CDR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest();
        }
    };

    // ### caar
    private static final Primitive CAAR = new pf_caar();
    private static final class pf_caar extends JavaPrimitive {
        pf_caar() {
            super(LispSymbols.CAAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().first();
        }
    };

    // ### cadr
    private static final Primitive CADR = new pf_cadr();
    private static final class pf_cadr extends JavaPrimitive {
        pf_cadr() {
            super(LispSymbols.CADR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.second();
        }
    };

    // ### cdar
    private static final Primitive CDAR = new pf_cdar();
    private static final class pf_cdar extends JavaPrimitive {
        pf_cdar() {
            super(LispSymbols.CDAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().rest();
        }
    };

    // ### cddr
    private static final Primitive CDDR = new pf_cddr();
    private static final class pf_cddr extends JavaPrimitive {
        pf_cddr() {
            super(LispSymbols.CDDR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest().rest();
        }
    };

    // ### caddr
    private static final Primitive CADDR = new pf_caddr();
    private static final class pf_caddr extends JavaPrimitive {
        pf_caddr() {
            super(LispSymbols.CADDR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.third();
        }
    };

    // ### caadr
    private static final Primitive CAADR = new pf_caadr();
    private static final class pf_caadr extends JavaPrimitive {
        pf_caadr() {
            super(LispSymbols.CAADR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest().first().first();
        }
    };

    // ### caaar
    private static final Primitive CAAAR = new pf_caaar();
    private static final class pf_caaar extends JavaPrimitive {
        pf_caaar() {
            super(LispSymbols.CAAAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().first().first();
        }
    };

    // ### cdaar
    private static final Primitive CDAAR = new pf_cdaar();
    private static final class pf_cdaar extends JavaPrimitive {
        pf_cdaar() {
            super(LispSymbols.CDAAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().first().rest();
        }
    };

    // ### cddar
    private static final Primitive CDDAR = new pf_cddar();
    private static final class pf_cddar extends JavaPrimitive {
        pf_cddar() {
            super(LispSymbols.CDDAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().rest().rest();
        }
    };

    // ### cdddr
    private static final Primitive CDDDR = new pf_cdddr();
    private static final class pf_cdddr extends JavaPrimitive {
        pf_cdddr() {
            super(LispSymbols.CDDDR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest().rest().rest();
        }
    };

    // ### cadar
    private static final Primitive CADAR = new pf_cadar();
    private static final class pf_cadar extends JavaPrimitive {
        pf_cadar() {
            super(LispSymbols.CADAR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first().rest().first();
        }
    };

    // ### cdadr
    private static final Primitive CDADR = new pf_cdadr();
    private static final class pf_cdadr extends JavaPrimitive {
        pf_cdadr() {
            super(LispSymbols.CDADR, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest().first().rest();
        }
    };

    // ### first
    private static final Primitive FIRST = new pf_first();
    private static final class pf_first extends JavaPrimitive {
        pf_first() {
            super(LispSymbols.FIRST, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.first();
        }
    };

    // ### second
    private static final Primitive SECOND = new pf_second();
    private static final class pf_second extends JavaPrimitive {
        pf_second() {
            super(LispSymbols.SECOND, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.second();
        }
    };

    // ### third
    private static final Primitive THIRD = new pf_third();
    private static final class pf_third extends JavaPrimitive {
        pf_third() {
            super(LispSymbols.THIRD, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.third();
        }
    };

    // ### fourth
    private static final Primitive FOURTH = new pf_fourth();
    private static final class pf_fourth extends JavaPrimitive {
        pf_fourth() {
            super(LispSymbols.FOURTH, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest().rest().second();
        }
    };

    // ### rest
    private static final Primitive REST = new pf_rest();
    private static final class pf_rest extends JavaPrimitive {
        pf_rest() {
            super(LispSymbols.REST, "list");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            return arg.rest();
        }
    };
    
    @InlinableMethod
	  static public SubLObject LAST_execute(SubLObject arg)
	  {
	    if (arg == NIL)
	      return NIL;
	    if (arg instanceof SubLCons)
	      {
	        while (true)
	          {
	            SubLObject cdr = ((SubLCons)arg).rest();
	            if (!(cdr instanceof SubLCons))
	              return arg;
	            arg = cdr;
	          }
	      }
	    else
	      return type_error(arg, LispSymbols.LIST);
	  }
	  
    //### last list &optional n => tail
    private static final Primitive LAST = new last();
  	public final static class last extends JavaPrimitive
  	{
  	  public last()
  	  {
  	    super("last", "list &optional n");
  	  }

  	  @Override
  	  public SubLObject execute(SubLObject arg)
  	  {
  	      return LAST_execute(arg);
  	  }

  	  @Override
  	  public SubLObject execute(SubLObject first, SubLObject second)

  	  {
  	    SubLObject list = checkList(first);
  	    if (second instanceof Fixnum)
  	      {
  	        int n = ((Fixnum)second).value;
  	        if (n >= 0) {
  	          if (list == NIL)
  	            return NIL;
  	          SubLObject result = list;
  	          while (list instanceof SubLCons)
  	            {
  	              list = list.rest();
  	              if (n-- <= 0)
  	                result = result.rest();
  	            }
  	          return result;
  	        }
  	      }
  	    else if (second instanceof Bignum)
  	      {
  	        if (list == NIL)
  	          return NIL;
  	        SubLObject n = second;
  	        SubLObject result = list;
  	        while (list instanceof SubLCons)
  	          {
  	            list = list.rest();
  	            if (!n.isPositive())
  	              result = result.rest();
  	            n = n.dec();
  	          }
  	        return result;
  	      }
  	    return type_error(second, LispSymbols.UNSIGNED_BYTE);
  	  }
  	}

	// ### copy-list list => copy
	private static final Primitive COPY_LIST = new copy_list();

	private static class copy_list extends JavaPrimitive {
		copy_list() {
			super(LispSymbols.COPY_LIST, "list");
		}

		@Override
		public SubLObject execute(SubLObject arg) {
			return COPY_LIST_execute(arg);
		}
	};
	
	@InlinableMethod
	static public SubLObject COPY_LIST_execute(SubLObject arg) {
		if (arg == NIL)
			return NIL;
		SubLCons result = makeCons(arg.first());
		SubLCons splice = result;
		arg = arg.rest();
		while (arg instanceof SubLCons) {
			SubLCons cons = (SubLCons) arg;
			SubLCons temp = makeCons(cons.first());
			splice.setCdr(temp);
			splice = temp;
			arg = cons.rest();
		}
		splice.setCdr(arg);
		return result;
	}

	// ### assql item alist => entry
	private static final Primitive ASSQL = new assql();

	public final static class assql extends JavaPrimitive {
		assql() {
			super("assql", PACKAGE_EXT);
		}
		@Override
		public SubLObject execute(SubLObject item, SubLObject alist)
		{
			return ASSQL_execute(item,alist);
		}

	}
	
	@InlinableMethod
	static public SubLObject ASSQL_execute(SubLObject item, SubLObject alist)
	{
		while (alist != NIL) {
			SubLObject cons = alist.first();
			if (cons instanceof SubLCons) {
				if (cons.first().eql(item))
					return cons;
			} else if (cons != NIL)
				return type_error(cons, LispSymbols.LIST);
			alist = alist.rest();
		}
		return NIL;
	}

	// ### assq item alist => entry
	private static final Primitive ASSQ = new assq();

	public final static class assq extends JavaPrimitive {
		assq() {
			super("assq", PACKAGE_EXT, true);
		}

		@Override
		public SubLObject execute(SubLObject item, SubLObject alist)

		{
			return Lisp.assq(item, alist);
		}

	}
	
	@InlinableMethod
	public static SubLObject ASSQ_execute(SubLObject item, SubLObject alist)

	{
		return Lisp.assq(item, alist);
	}
	
	private static final Primitive SIMPLE_LIST_REMOVE_DUPLICATES = new simple_list_remove_duplicates();

	//### simple-list-remove-duplicates
	public final static class simple_list_remove_duplicates extends JavaPrimitive {
		simple_list_remove_duplicates() {
			super("simple-list-remove-duplicates", PACKAGE_SYS, false, "list");
		}

		@Override
		public SubLObject execute(SubLObject list) {
			SubLObject result = NIL;
			while (list != NIL) {
				SubLObject item = list.first();
				boolean duplicate = false;
				SubLObject tail = list.rest();
				while (tail != NIL) {
					if (item.eql(tail.first())) {
						duplicate = true;
						break;
					}
					tail = tail.rest();
				}
				if (!duplicate)
					result = makeCons(item, result);
				list = list.rest();
			}
			return result.nreverse();
		}
	}

	
//### get-properties
  private static final Primitive GET_PROPERTIES = new get_properties();
	public final static class get_properties extends JavaPrimitive
	{
	  get_properties()
	  {
	    super(LispSymbols.GET_PROPERTIES, "plist indicator-list");
	  }

	  @Override
	  public SubLObject execute(SubLObject first, SubLObject second)

	  {
	    final LispThread thread = LispThread.currentThread();
	    SubLObject plist = first;
	    while (plist != NIL)
	      {
	        if (plist.rest() instanceof SubLCons)
	          {
	            SubLObject indicator = ((SubLCons)plist).first();
	            SubLObject indicators = second;
	            while (indicators instanceof SubLCons)
	              {
	                if (indicator == ((SubLCons)indicators).first())
	                  return thread.setValues(indicator, plist.second(), plist);
	                indicators = ((SubLCons)indicators).rest();
	              }
	            if (indicators != NIL)
	              return type_error(indicators, LispSymbols.LIST);
	            plist = plist.cddr();
	          }
	        else
	          return type_error(plist.rest(), LispSymbols.CONS);
	      }
	    return thread.setValues(NIL, NIL, NIL);
	  }
	}
	
	static public SubLObject list_exec(SubLObject first, SubLObject second) {
		return makeCons(first, makeCons(second));
	}
	static public SubLObject not_exec(SubLObject first) {
		return first.NOT();
	}
	
  static {
    InlinedPrimitiveRegistry.inlineStaticsNow(ConsFunctions.class);
    InlinedPrimitiveRegistry.inlineStaticNow(ConsFunctions.class,LispSymbols.LIST,"list_exec",2,0,false);
    InlinedPrimitiveRegistry.inlineStaticNow(ConsFunctions.class,LispSymbols.NOT,"not_exec",1,0,false);
  }
}

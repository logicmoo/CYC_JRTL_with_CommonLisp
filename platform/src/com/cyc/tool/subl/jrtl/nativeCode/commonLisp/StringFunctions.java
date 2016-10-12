/*
 * StringFunctions.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * Copyright (C) 2010 Ville Voutilainen
 * $Id: StringFunctions.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

/**
 * Description of the Class
 *
 * @author Administrator
 */
public class StringFunctions {

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf___string_equal extends JavaPrimitive {
		/** Constructor for the pf___string_equal object */
		pf___string_equal() {
			super("%%string=", Lisp.PACKAGE_SYS, false);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2) {
			return StringFunctions.pf___string_equal_execute(string1, string2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__make_string extends JavaPrimitive {
		/** Constructor for the pf__make_string object */
		pf__make_string() {
			super("%make-string", Lisp.PACKAGE_SYS, false);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param size
		 *            Description of Parameter
		 * @param initialElement
		 *            Description of Parameter
		 * @param elementType
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject size, SubLObject initialElement, SubLObject elementType) {
			return StringFunctions.pf__make_string_execute(size, initialElement, elementType);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__nstring_capitalize extends JavaPrimitive {
		/** Constructor for the pf__nstring_capitalize object */
		pf__nstring_capitalize() {
			super("%nstring-capitalize", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__nstring_capitalize_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__nstring_downcase extends JavaPrimitive {
		/** Constructor for the pf__nstring_downcase object */
		pf__nstring_downcase() {
			super("%nstring-downcase", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__nstring_downcase_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__nstring_upcase extends JavaPrimitive {
		/** Constructor for the pf__nstring_upcase object */
		pf__nstring_upcase() {
			super("%nstring-upcase", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__nstring_upcase_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_capitalize extends JavaPrimitive {
		/** Constructor for the pf__string_capitalize object */
		pf__string_capitalize() {
			super("%string-capitalize", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__string_capitalize_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_downcase extends JavaPrimitive {
		/** Constructor for the pf__string_downcase object */
		pf__string_downcase() {
			super("%string-downcase", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__string_downcase_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_equal extends JavaPrimitive {
		/** Constructor for the pf__string_equal object */
		pf__string_equal() {
			super("%string=", Lisp.PACKAGE_SYS, false);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_equal_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_equal_ignore_case extends JavaPrimitive {
		/** Constructor for the pf__string_equal_ignore_case object */
		pf__string_equal_ignore_case() {
			super("%string-equal", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_equal_ignore_case_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_ge extends JavaPrimitive {
		/** Constructor for the pf__string_ge object */
		pf__string_ge() {
			super("%string>=", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_ge_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_greater_than extends JavaPrimitive {
		/** Constructor for the pf__string_greater_than object */
		pf__string_greater_than() {
			super("%string>", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_greater_than_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_greaterp extends JavaPrimitive {
		/** Constructor for the pf__string_greaterp object */
		pf__string_greaterp() {
			super("%string-greaterp", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_greaterp_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_le extends JavaPrimitive {
		/** Constructor for the pf__string_le object */
		pf__string_le() {
			super("%string<=", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_le_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_less_than extends JavaPrimitive {
		/** Constructor for the pf__string_less_than object */
		pf__string_less_than() {
			super("%string<", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_less_than_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_lessp extends JavaPrimitive {
		/** Constructor for the pf__string_lessp object */
		pf__string_lessp() {
			super("%string-lessp", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_lessp_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_not_equal extends JavaPrimitive {
		/** Constructor for the pf__string_not_equal object */
		pf__string_not_equal() {
			super("%string/=", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_not_equal_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_not_equal_ignore_case extends JavaPrimitive {
		/** Constructor for the pf__string_not_equal_ignore_case object */
		pf__string_not_equal_ignore_case() {
			super("%string-not-equal", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_not_equal_ignore_case_execute(string1, string2, start1, end1, start2,
					end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_not_greaterp extends JavaPrimitive {
		/** Constructor for the pf__string_not_greaterp object */
		pf__string_not_greaterp() {
			super("%string-not-greaterp", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_not_greaterp_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_not_lessp extends JavaPrimitive {
		/** Constructor for the pf__string_not_lessp object */
		pf__string_not_lessp() {
			super("%string-not-lessp", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string1
		 *            Description of Parameter
		 * @param string2
		 *            Description of Parameter
		 * @param start1
		 *            Description of Parameter
		 * @param end1
		 *            Description of Parameter
		 * @param start2
		 *            Description of Parameter
		 * @param end2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
				SubLObject start2, SubLObject end2) {
			return StringFunctions.pf__string_not_lessp_execute(string1, string2, start1, end1, start2, end2);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf__string_upcase extends JavaPrimitive {
		/** Constructor for the pf__string_upcase object */
		pf__string_upcase() {
			super("%string-upcase", Lisp.PACKAGE_SYS, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param string
		 *            Description of Parameter
		 * @param start
		 *            Description of Parameter
		 * @param end
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject string, SubLObject start, SubLObject end) {
			return StringFunctions.pf__string_upcase_execute(string, start, end);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_char extends JavaPrimitive {
		/** Constructor for the pf_char object */
		pf_char() {
			super(LispSymbols.CHAR, "string index");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return StringFunctions.pf_char_execute(first, second);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_schar extends JavaPrimitive {
		/** Constructor for the pf_schar object */
		pf_schar() {
			super(LispSymbols.SCHAR, "string index");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return StringFunctions.pf_schar_execute(first, second);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_set_char extends JavaPrimitive {
		/** Constructor for the pf_set_char object */
		pf_set_char() {
			super(LispSymbols.SET_CHAR, "string index character");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return StringFunctions.pf_set_char_execute(first, second, third);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_set_schar extends JavaPrimitive {
		/** Constructor for the pf_set_schar object */
		pf_set_schar() {
			super(LispSymbols.SET_SCHAR, "string index character");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return StringFunctions.pf_set_schar_execute(first, second, third);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_simple_string_p extends JavaPrimitive {
		/** Constructor for the pf_simple_string_p object */
		pf_simple_string_p() {
			super("simple-string-p", "object");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return StringFunctions.pf_simple_string_p_execute(arg);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_simple_string_search extends JavaPrimitive {
		/** Constructor for the pf_simple_string_search object */
		pf_simple_string_search() {
			super("simple-string-search", Lisp.PACKAGE_EXT, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return StringFunctions.pf_simple_string_search_execute(first, second);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_string_fill extends JavaPrimitive {
		/** Constructor for the pf_string_fill object */
		pf_string_fill() {
			super("simple-string-fill", Lisp.PACKAGE_EXT, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return StringFunctions.pf_string_fill_execute(first, second);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_string_find extends JavaPrimitive {
		/** Constructor for the pf_string_find object */
		pf_string_find() {
			super("string-find", Lisp.PACKAGE_EXT, true, "char string");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second) {
			return StringFunctions.pf_string_find_execute(first, second);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_string_position extends JavaPrimitive {
		/** Constructor for the pf_string_position object */
		pf_string_position() {
			super("string-position", Lisp.PACKAGE_EXT, true);
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return StringFunctions.pf_string_position_execute(first, second, third);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	private static class pf_stringp extends JavaPrimitive {
		/** Constructor for the pf_stringp object */
		pf_stringp() {
			super("stringp", "object");
		}

		// Override
		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */
		public SubLObject execute(SubLObject arg) {
			return StringFunctions.pf_stringp_execute(arg);
		}
	}

	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	static class StringIndicesAndChars {
		/** Description of the Field */
		public SubLString string1;
		/** Description of the Field */
		public boolean convertCase = false;
		/** Description of the Field */
		public char[] array1;
		/** Description of the Field */
		public char[] array2;
		/** Description of the Field */
		public int start1 = 0;
		/** Description of the Field */
		public int end1 = 0;
		/** Description of the Field */
		public int start2 = 0;
		/** Description of the Field */
		public int end2 = 0;
	}

	// ### stringp
	/** Description of the Field */
	public static Primitive STRINGP = new pf_stringp();

	// ### simple-string-p
	/** Description of the Field */
	public static Primitive SIMPLE_STRING_P = new pf_simple_string_p();

	// ### %string/=
	// Case sensitive.
	static Primitive _STRING_NOT_EQUAL = new pf__string_not_equal();

	// ### %string-not-equal
	// Case insensitive.
	static Primitive _STRING_NOT_EQUAL_IGNORE_CASE = new pf__string_not_equal_ignore_case();

	// ### %%string=
	// Case sensitive.
	private static Primitive __STRING_EQUAL = new pf___string_equal();

	// ### %string=
	// Case sensitive.
	private static Primitive _STRING_EQUAL = new pf__string_equal();

	// ### %string-equal
	// Case insensitive.
	private static Primitive _STRING_EQUAL_IGNORE_CASE = new pf__string_equal_ignore_case();

	// ### %string<
	// Case sensitive.
	private static Primitive _STRING_LESS_THAN = new pf__string_less_than();

	// ### %string>
	// Case sensitive.
	private static Primitive _STRING_GREATER_THAN = new pf__string_greater_than();

	// ### %string<=
	// Case sensitive.
	private static Primitive _STRING_LE = new pf__string_le();

	// ### %string>=
	// Case sensitive.
	private static Primitive _STRING_GE = new pf__string_ge();

	// ### %string-lessp
	// Case insensitive.
	private static Primitive _STRING_LESSP = new pf__string_lessp();

	// ### %string-greaterp
	// Case insensitive.
	private static Primitive _STRING_GREATERP = new pf__string_greaterp();

	// ### %string-not-lessp
	// Case insensitive.
	private static Primitive _STRING_NOT_LESSP = new pf__string_not_lessp();

	// ### %string-not-greaterp
	// Case insensitive.
	private static Primitive _STRING_NOT_GREATERP = new pf__string_not_greaterp();

	// ### %string-upcase
	private static Primitive _STRING_UPCASE = new pf__string_upcase();

	// ### %string-downcase
	private static Primitive _STRING_DOWNCASE = new pf__string_downcase();

	// ### %string-capitalize
	private static Primitive _STRING_CAPITALIZE = new pf__string_capitalize();

	// ### %nstring-upcase
	private static Primitive _NSTRING_UPCASE = new pf__nstring_upcase();

	// ### %nstring-downcase
	private static Primitive _NSTRING_DOWNCASE = new pf__nstring_downcase();

	// ### %nstring-capitalize
	private static Primitive _NSTRING_CAPITALIZE = new pf__nstring_capitalize();

	// ### %make-string
	// %make-string size initial-element element-type => string
	// Returns a simple string.
	private static Primitive _MAKE_STRING = new pf__make_string();

	// ### char
	private static Primitive CHAR = new pf_char();

	// ### schar
	private static Primitive SCHAR = new pf_schar();

	// ### set-char
	private static Primitive SET_CHAR = new pf_set_char();

	// ### set-schar
	private static Primitive SET_SCHAR = new pf_set_schar();

	// ### string-position
	private static Primitive STRING_POSITION = new pf_string_position();

	// ### string-find
	private static Primitive STRING_FIND = new pf_string_find();

	// ### simple-string-search pattern string => position
	// Searches string for a substring that matches pattern.
	private static Primitive SIMPLE_STRING_SEARCH = new pf_simple_string_search();

	// ### simple-string-fill string character => string
	private static Primitive STRING_FILL = new pf_string_fill();

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(StringFunctions.class);
	}

	/**
	 * Description of the Method
	 *
	 * @param indicesAndChars
	 *            Description of Parameter
	 */
	private static void checkParams(StringIndicesAndChars indicesAndChars) {
		if (indicesAndChars.start1 < 0 || indicesAndChars.start1 > indicesAndChars.array1.length)
			Lisp.error(new TypeError("Invalid start position " + indicesAndChars.start1 + "."));
		if (indicesAndChars.end1 < 0 || indicesAndChars.end1 > indicesAndChars.array1.length)
			Lisp.error(new TypeError("Invalid end position " + indicesAndChars.end1 + "."));

		if (indicesAndChars.start1 > indicesAndChars.end1)
			Lisp.error(new TypeError(
					"Start (" + indicesAndChars.start1 + ") is greater than end (" + indicesAndChars.end1 + ")."));
		if (indicesAndChars.array2 != null) {
			if (indicesAndChars.start2 < 0 || indicesAndChars.start2 > indicesAndChars.array2.length)
				Lisp.error(new TypeError("Invalid start2 position " + indicesAndChars.start2 + "."));
			if (indicesAndChars.end2 < 0 || indicesAndChars.end2 > indicesAndChars.array2.length)
				Lisp.error(new TypeError("Invalid end2 position " + indicesAndChars.end2 + "."));
			if (indicesAndChars.start2 > indicesAndChars.end2)
				Lisp.error(new TypeError("Start2 (" + indicesAndChars.start2 + ") is greater than end2 ("
						+ indicesAndChars.end2 + ")."));
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param indicesAndChars
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static int lessThan(StringIndicesAndChars indicesAndChars) {
		int i = indicesAndChars.start1;
		int j = indicesAndChars.start2;
		while (true) {
			if (i == indicesAndChars.end1) {
				// Reached end of string1.
				if (j == indicesAndChars.end2)
					return -1;
				// Strings are identical.
				return i;
			}
			if (j == indicesAndChars.end2)
				// Reached end of string2.
				return -1;
			char c1 = StringFunctions.upcaseIfNeeded(indicesAndChars.array1[i], indicesAndChars.convertCase);
			char c2 = StringFunctions.upcaseIfNeeded(indicesAndChars.array2[j], indicesAndChars.convertCase);
			if (c1 == c2) {
				++i;
				++j;
				continue;
			}
			if (c1 < c2)
				return i;
			// c1 > c2
			return -1;
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param indicesAndChars
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static int lessThanOrEqual(StringIndicesAndChars indicesAndChars) {
		int i = indicesAndChars.start1;
		int j = indicesAndChars.start2;
		while (true) {
			if (i == indicesAndChars.end1)
				// Reached end of string1.
				return i;
			if (j == indicesAndChars.end2)
				// Reached end of string2.
				return -1;
			char c1 = StringFunctions.upcaseIfNeeded(indicesAndChars.array1[i], indicesAndChars.convertCase);
			char c2 = StringFunctions.upcaseIfNeeded(indicesAndChars.array2[j], indicesAndChars.convertCase);
			if (c1 == c2) {
				++i;
				++j;
				continue;
			}
			if (c1 > c2)
				return -1;
			// c1 < c2
			return i;
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param indicesAndChars
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static int notEqual(StringIndicesAndChars indicesAndChars) {
		int i = indicesAndChars.start1;
		int j = indicesAndChars.start2;
		while (true) {
			if (i == indicesAndChars.end1) {
				// Reached end of string1.
				if (j == indicesAndChars.end2)
					return -1;
				// Strings are identical.
				return i;
			}
			if (j == indicesAndChars.end2)
				// Reached end of string2 before end of string1.
				return i;
			if (StringFunctions.upcaseIfNeeded(indicesAndChars.array1[i],
					indicesAndChars.convertCase) != StringFunctions.upcaseIfNeeded(indicesAndChars.array2[j],
							indicesAndChars.convertCase))
				return i;
			++i;
			++j;
		}
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string1
				 *            Description of Parameter
				 * @param string2
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf___string_equal_execute(SubLObject string1, SubLObject string2) {
		StringIndicesAndChars chars = StringFunctions.stringIndicesAndChars(string1, string2);
		return Arrays.equals(chars.array1, chars.array2) ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param size
				 *            Description of Parameter
				 * @param initialElement
				 *            Description of Parameter
				 * @param elementType
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__make_string_execute(SubLObject size, SubLObject initialElement, SubLObject elementType) {
		final int n = size.intValue();
		if (n < 0 || n >= Lisp.ARRAY_DIMENSION_MAX) {
			StringBuilder sb = new StringBuilder();
			sb.append("The size specified for this string (");
			sb.append(n);
			sb.append(')');
			if (n >= Lisp.ARRAY_DIMENSION_MAX) {
				sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
				sb.append(Lisp.ARRAY_DIMENSION_MAX);
				sb.append(").");
			} else
				sb.append(" is negative.");
			return Lisp.error(new LispError(sb.toString()));
		}
		// Ignore elementType.
		SubLString string = LispObjectFactory.makeString(n);
		if (initialElement != Lisp.NIL) {
			// Initial element was specified.
			char c = Lisp.checkCharacter(initialElement).charValue();
			string.fill(c);
		}
		return string;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__nstring_capitalize_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		boolean lastCharWasAlphanumeric = false;
		SubLString retString = indicesAndChars.string1;
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++) {
			char c = retString.charAt(i);
			if (Character.isLowerCase(c)) {
				if (!lastCharWasAlphanumeric)
					retString.setChar(i, CharacterFunctions.toUpperCase(c));
				lastCharWasAlphanumeric = true;
			} else if (Character.isUpperCase(c)) {
				if (lastCharWasAlphanumeric)
					retString.setChar(i, CharacterFunctions.toLowerCase(c));
				lastCharWasAlphanumeric = true;
			} else
				lastCharWasAlphanumeric = Character.isDigit(c);
		}
		return retString;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__nstring_downcase_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		SubLString retString = indicesAndChars.string1;
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++)
			retString.setChar(i, CharacterFunctions.toLowerCase(retString.charAt(i)));
		return retString;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__nstring_upcase_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		SubLString retString = indicesAndChars.string1;
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++)
			retString.setChar(i, CharacterFunctions.toUpperCase(retString.charAt(i)));
		return retString;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__string_capitalize_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		char[] array = new char[indicesAndChars.array1.length];
		boolean lastCharWasAlphanumeric = false;
		System.arraycopy(indicesAndChars.array1, 0, array, 0, indicesAndChars.start1);
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++) {
			char c = indicesAndChars.array1[i];
			if (Character.isLowerCase(c)) {
				array[i] = lastCharWasAlphanumeric ? c : CharacterFunctions.toUpperCase(c);
				lastCharWasAlphanumeric = true;
			} else if (Character.isUpperCase(c)) {
				array[i] = lastCharWasAlphanumeric ? CharacterFunctions.toLowerCase(c) : c;
				lastCharWasAlphanumeric = true;
			} else {
				array[i] = c;
				lastCharWasAlphanumeric = Character.isDigit(c);
			}
		}
		System.arraycopy(indicesAndChars.array1, indicesAndChars.end1, array, indicesAndChars.end1,
				indicesAndChars.array1.length - indicesAndChars.end1);
		return LispObjectFactory.makeString(array);
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__string_downcase_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		char[] array = new char[indicesAndChars.array1.length];
		System.arraycopy(indicesAndChars.array1, 0, array, 0, indicesAndChars.start1);
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++)
			array[i] = CharacterFunctions.toLowerCase(indicesAndChars.array1[i]);
		System.arraycopy(indicesAndChars.array1, indicesAndChars.end1, array, indicesAndChars.end1,
				indicesAndChars.array1.length - indicesAndChars.end1);
		return LispObjectFactory.makeString(array);
	}

	@InlinableMethod
	static public SubLObject pf__string_equal_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		return StringFunctions._STRING_NOT_EQUAL.execute(string1, string2, start1, end1, start2, end2) == Lisp.NIL
				? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_equal_ignore_case_execute(SubLObject string1, SubLObject string2,
			SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
		return StringFunctions._STRING_NOT_EQUAL_IGNORE_CASE.execute(string1, string2, start1, end1, start2,
				end2) == Lisp.NIL ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_ge_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		// note the swap of the strings and lengths here..
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string2, string1, start2, end2,
				start1, end1);
		int tmp = StringFunctions.lessThanOrEqual(indicesAndChars);
		return StringFunctions.swapReturnValue(tmp, indicesAndChars);
	}

	@InlinableMethod
	static public SubLObject pf__string_greater_than_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		// note the swap of the strings and lengths here..
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string2, string1, start2, end2,
				start1, end1);
		int tmp = StringFunctions.lessThan(indicesAndChars);
		return StringFunctions.swapReturnValue(tmp, indicesAndChars);
	}

	@InlinableMethod
	static public SubLObject pf__string_greaterp_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		// note the swap of the strings and lengths here..
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string2, string1, start2, end2,
				start1, end1);
		indicesAndChars.convertCase = true;
		int tmp = StringFunctions.lessThan(indicesAndChars);
		return StringFunctions.swapReturnValue(tmp, indicesAndChars);
	}

	@InlinableMethod
	static public SubLObject pf__string_le_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {

		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		int retVal = StringFunctions.lessThanOrEqual(indicesAndChars);
		return retVal >= 0 ? LispObjectFactory.makeInteger(retVal) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_less_than_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		int retVal = StringFunctions.lessThan(indicesAndChars);
		return retVal >= 0 ? LispObjectFactory.makeInteger(retVal) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_lessp_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		indicesAndChars.convertCase = true;
		int retVal = StringFunctions.lessThan(indicesAndChars);
		return retVal >= 0 ? LispObjectFactory.makeInteger(retVal) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_not_equal_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		int tmp = StringFunctions.notEqual(indicesAndChars);
		return tmp >= 0 ? LispObjectFactory.makeInteger(tmp) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_not_equal_ignore_case_execute(SubLObject string1, SubLObject string2,
			SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		indicesAndChars.convertCase = true;
		int tmp = StringFunctions.notEqual(indicesAndChars);
		return tmp >= 0 ? LispObjectFactory.makeInteger(tmp) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_not_greaterp_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string1, string2, start1, end1,
				start2, end2);
		indicesAndChars.convertCase = true;
		int tmp = StringFunctions.lessThanOrEqual(indicesAndChars);
		return tmp >= 0 ? LispObjectFactory.makeInteger(tmp) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf__string_not_lessp_execute(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		// note the swap of the strings and lengths here..
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string2, string1, start2, end2,
				start1, end1);
		indicesAndChars.convertCase = true;
		int tmp = StringFunctions.lessThanOrEqual(indicesAndChars);
		return StringFunctions.swapReturnValue(tmp, indicesAndChars);
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param string
				 *            Description of Parameter
				 * @param start
				 *            Description of Parameter
				 * @param end
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf__string_upcase_execute(SubLObject string, SubLObject start, SubLObject end) {
		StringIndicesAndChars indicesAndChars = StringFunctions.stringIndicesAndChars(string, start, end);
		char[] array = new char[indicesAndChars.array1.length];
		System.arraycopy(indicesAndChars.array1, 0, array, 0, indicesAndChars.start1);
		for (int i = indicesAndChars.start1; i < indicesAndChars.end1; i++)
			array[i] = CharacterFunctions.toUpperCase(indicesAndChars.array1[i]);
		System.arraycopy(indicesAndChars.array1, indicesAndChars.end1, array, indicesAndChars.end1,
				indicesAndChars.array1.length - indicesAndChars.end1);
		return LispObjectFactory.makeString(array);
	}

	@InlinableMethod
	static public SubLObject pf_char_execute(SubLObject first, SubLObject second) {
		return first.CHAR(second.intValue());
	}

	@InlinableMethod
	static public SubLObject pf_schar_execute(SubLObject first, SubLObject second) {
		return first.SCHAR(second.intValue());
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param first
				 *            Description of Parameter
				 * @param second
				 *            Description of Parameter
				 * @param third
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf_set_char_execute(SubLObject first, SubLObject second, SubLObject third) {
		Lisp.checkString(first).setChar(second.intValue(), third.charValue());
		return third;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param first
				 *            Description of Parameter
				 * @param second
				 *            Description of Parameter
				 * @param third
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf_set_schar_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first instanceof SimpleString) {
			((SubLString) first).setChar(second.intValue(), third.charValue());
			return third;
		}
		return Lisp.type_error(first, LispSymbols.SIMPLE_STRING);
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param arg
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf_simple_string_p_execute(SubLObject arg) {
		return arg.SIMPLE_STRING_P();
	}

	@InlinableMethod
	static public SubLObject pf_simple_string_search_execute(SubLObject first, SubLObject second) {
		// FIXME Don't call getStringValue() here! (Just look at the chars.)
		int index = second.getString().indexOf(first.getString());
		return index >= 0 ? LispObjectFactory.makeInteger(index) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject pf_string_fill_execute(SubLObject first, SubLObject second) {
		if (first instanceof SubLString) {
			SubLString s = (SubLString) first;
			s.fill(second.charValue());
			return first;
		}
		return Lisp.type_error(first, LispSymbols.SIMPLE_STRING);
	}

	@InlinableMethod
	static public SubLObject pf_string_find_execute(SubLObject first, SubLObject second) {
		if (first instanceof LispCharacter) {
			final char c = ((LispCharacter) first).value;
			SubLString string = Lisp.checkString(second);
			final int limit = string.cl_length();
			for (int i = 0; i < limit; i++)
				if (string.charAt(i) == c)
					return first;
		}
		return Lisp.NIL;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param first
				 *            Description of Parameter
				 * @param second
				 *            Description of Parameter
				 * @param third
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf_string_position_execute(SubLObject first, SubLObject second, SubLObject third) {
		char c = first.charValue();
		SubLString string = Lisp.checkString(second);
		int start = third.intValue();
		for (int i = start, limit = string.cl_length(); i < limit; i++)
			if (string.charAt(i) == c)
				return Lisp.number(i);
		return Lisp.NIL;
	}

	@InlinableMethod
	static final/**
				 * Description of the Method
				 *
				 * @param arg
				 *            Description of Parameter
				 * @return Description of the Returned Value
				 */
	public SubLObject pf_stringp_execute(SubLObject arg) {
		return arg.STRINGP();
	}

	/**
	 * Description of the Method
	 *
	 * @param params
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static StringIndicesAndChars stringIndicesAndChars(SubLObject... params) {
		StringIndicesAndChars retVal = new StringIndicesAndChars();
		retVal.string1 = Lisp.checkString(params[0].STRING());
		retVal.array1 = retVal.string1.getStringChars();
		retVal.end1 = retVal.array1.length;
		if (params.length == 3) {
			if (params[1] != Lisp.NIL)
				retVal.start1 = params[1].intValue();
			if (params[2] != Lisp.NIL)
				retVal.end1 = params[2].intValue();
		} else {
			retVal.array2 = params[1].STRING().getStringChars();
			retVal.end2 = retVal.array2.length;
			if (params.length > 2) {
				if (params[2] != Lisp.NIL)
					retVal.start1 = params[2].intValue();
				if (params[3] != Lisp.NIL)
					retVal.end1 = params[3].intValue();
				if (params[4] != Lisp.NIL)
					retVal.start2 = params[4].intValue();
				if (params[5] != Lisp.NIL)
					retVal.end2 = params[5].intValue();
			}
		}
		StringFunctions.checkParams(retVal);
		return retVal;
	}

	/**
	 * Description of the Method
	 *
	 * @param original
	 *            Description of Parameter
	 * @param indicesAndChars
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static SubLObject swapReturnValue(int original, StringIndicesAndChars indicesAndChars) {
		if (original < 0)
			return Lisp.NIL;
		int delta = original - indicesAndChars.start1;
		int retVal = indicesAndChars.start2 + delta;
		return LispObjectFactory.makeInteger(retVal);
	}

	/**
	 * Description of the Method
	 *
	 * @param c
	 *            Description of Parameter
	 * @param convert
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	private static char upcaseIfNeeded(char c, boolean convert) {
		return convert ? CharacterFunctions.toUpperCase(c) : c;
	}
}

/*
 * Primitives.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: Primitives.java 12516 2010-03-03 21:05:41Z astalla $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.math.BigInteger;
import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlineSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.NoInline;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/**
 * Description of the Class
 *
 * @author Administrator
 */
public class Primitives {
	private static class pf__class_name extends JavaPrimitive {
		/** Constructor for the pf__class_name object */
		pf__class_name() {
			super("%class-name", Lisp.PACKAGE_SYS, true, "class");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__class_name_execute(arg);
		}
	}

	private static class pf__class_precedence_list extends JavaPrimitive {
		/** Constructor for the pf__class_precedence_list object */
		pf__class_precedence_list() {
			super("%class-precedence-list", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__class_precedence_list_execute(arg);
		}
	}

	private static class pf__defconstant extends JavaPrimitive {
		/** Constructor for the pf__defconstant object */
		pf__defconstant() {
			super("%defconstant", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__defconstant_execute(first, second, third);
		}
	}

	private static class pf__defparameter extends JavaPrimitive {
		/** Constructor for the pf__defparameter object */
		pf__defparameter() {
			super("%defparameter", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__defparameter_execute(first, second, third);
		}
	}

	private static class pf__defun extends JavaPrimitive {
		/** Constructor for the pf__defun object */
		pf__defun() {
			super("%defun", Lisp.PACKAGE_SYS, true, "name definition");
		}

		/**
		 * Description of the Method
		 *
		 * @param name
		 *            Description of Parameter
		 * @param definition
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject name, SubLObject definition) {
			return Primitives.pf__defun_execute(name, definition);
		}
	}

	private static class pf__defvar extends JavaPrimitive {
		/** Constructor for the pf__defvar object */
		pf__defvar() {
			super("%defvar", Lisp.PACKAGE_SYS, false);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__defvar_execute(arg);
		}

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
			return Primitives.pf__defvar_execute(first, second);
		}
	}

	private static class pf__documentation extends JavaPrimitive {
		/** Constructor for the pf__documentation object */
		pf__documentation() {
			super("%documentation", Lisp.PACKAGE_SYS, true, "object doc-type");
		}

		/**
		 * Description of the Method
		 *
		 * @param object
		 *            Description of Parameter
		 * @param docType
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject object, SubLObject docType) {
			return Primitives.pf__documentation_execute(object, docType);
		}
	}

	private static class pf__elt extends JavaPrimitive {
		/** Constructor for the _pf_elt object */
		pf__elt() {
			super("%ELT", Lisp.PACKAGE_SYS, false, "sequence index");
		}

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
			return Primitives._pf_elt_execute(first, second);
		}
	}

	private static class pf__eval extends JavaPrimitive {
		/** Constructor for the pf__eval object */
		pf__eval() {
			super("%eval", Lisp.PACKAGE_SYS, false, "form");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__eval_execute(arg);
		}
	}

	private static class pf__format extends JavaPrimitive {
		/** Constructor for the pf__format object */
		pf__format() {
			super("%format", Lisp.PACKAGE_SYS, false, "destination control-string &rest args");
		}

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
			return Primitives.pf__format_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf__format_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf__format_execute(args);
		}
	}

	private static class pf__fresh_line extends JavaPrimitive {
		/** Constructor for the pf__fresh_line object */
		pf__fresh_line() {
			super("%fresh-line", Lisp.PACKAGE_SYS, false, "output-stream");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__fresh_line_execute(arg);
		}
	}

	private static class pf__in_package extends JavaPrimitive {
		/** Constructor for the pf__in_package object */
		pf__in_package() {
			super("%in-package", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__in_package_execute(arg);
		}
	}

	private static class pf__length extends JavaPrimitive {
		/** Constructor for the _pf_length object */
		pf__length() {
			super("%LENGTH", Lisp.PACKAGE_SYS, false, "sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives._pf_length_execute(arg);
		}
	}

	private static class pf__make_list extends JavaPrimitive {
		/** Constructor for the pf__make_list object */
		pf__make_list() {
			super("%make-list", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__make_list_execute(first, second);
		}
	}

	private static class pf__make_package extends JavaPrimitive {
		/** Constructor for the pf__make_package object */
		pf__make_package() {
			super("%make-package", Lisp.PACKAGE_SYS, false);
		}

		/**
		 * This invocation is solely used to be able to create a package to bind
		 * to *FASL-ANONYMOUS-PACKAGE*
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf__make_package_execute();
		}

		/**
		 * This invocation is used by MAKE-PACKAGE to create a package
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
			return Primitives.pf__make_package_execute(first, second, third);
		}
	}

	private static class pf__member extends JavaPrimitive {
		/** Constructor for the pf__member object */
		pf__member() {
			super("%member", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param item
		 *            Description of Parameter
		 * @param list
		 *            Description of Parameter
		 * @param key
		 *            Description of Parameter
		 * @param test
		 *            Description of Parameter
		 * @param testNot
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject item, SubLObject list, SubLObject key, SubLObject test,
				SubLObject testNot) {
			return Primitives.pf__member_execute(item, list, key, test, testNot);
		}
	}

	private static class pf__output_object extends JavaPrimitive {
		/** Constructor for the pf__output_object object */
		pf__output_object() {
			super("%output-object", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__output_object_execute(first, second);
		}
	}

	private static class pf__putf extends JavaPrimitive {
		/** Constructor for the pf__putf object */
		pf__putf() {
			super("%putf", Lisp.PACKAGE_SYS, true, "plist indicator new-value");
		}

		/**
		 * Description of the Method
		 *
		 * @param plist
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @param newValue
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject plist, SubLObject indicator, SubLObject newValue) {
			return Primitives.pf__putf_execute(plist, indicator, newValue);
		}
	}

	@NoInline
	private static class pf__set_class_direct_methods extends JavaPrimitive {
		/** Constructor for the pf__set_class_direct_methods object */
		pf__set_class_direct_methods() {
			super("%set-class-direct-methods", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__set_class_direct_methods_execute(first, second);
		}
	}

	private static class pf__set_class_direct_subclasses extends JavaPrimitive {
		/** Constructor for the pf__set_class_direct_subclasses object */
		pf__set_class_direct_subclasses() {
			super("%set-class-direct-subclasses", Lisp.PACKAGE_SYS, true, "class direct-subclasses");
		}

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
			return Primitives.pf__set_class_direct_subclasses_execute(first, second);
		}
	}

	private static class pf__set_class_direct_superclasses extends JavaPrimitive {
		/** Constructor for the pf__set_class_direct_superclasses object */
		pf__set_class_direct_superclasses() {
			super("%set-class-direct-superclasses", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__set_class_direct_superclasses_execute(first, second);
		}
	}

	private static class pf__set_class_documentation extends JavaPrimitive {
		/** Constructor for the pf__set_class_documentation object */
		pf__set_class_documentation() {
			super("%set-class-documentation", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__set_class_documentation_execute(first, second);
		}
	}

	private static class pf__set_class_finalized_p extends JavaPrimitive {
		/** Constructor for the pf__set_class_finalized_p object */
		pf__set_class_finalized_p() {
			super("%set-class-finalized-p", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__set_class_finalized_p_execute(first, second);
		}
	}

	private static class pf__set_class_layout extends JavaPrimitive {
		/** Constructor for the pf__set_class_layout object */
		pf__set_class_layout() {
			super("%set-class-layout", Lisp.PACKAGE_SYS, true, "class layout");
		}

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
			return Primitives.pf__set_class_layout_execute(first, second);
		}
	}

	private static class pf__set_class_name extends JavaPrimitive {
		/** Constructor for the pf__set_class_name object */
		pf__set_class_name() {
			super("%set-class-name", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__set_class_name_execute(first, second);
		}
	}

	private static class pf__set_documentation extends JavaPrimitive {
		/** Constructor for the pf__set_documentation object */
		pf__set_documentation() {
			super("%set-documentation", Lisp.PACKAGE_SYS, true, "object doc-type documentation");
		}

		/**
		 * Description of the Method
		 *
		 * @param object
		 *            Description of Parameter
		 * @param docType
		 *            Description of Parameter
		 * @param documentation
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject object, SubLObject docType, SubLObject documentation) {
			return Primitives.pf__set_documentation_execute(object, docType, documentation);
		}
	}

	private static class pf__set_elt extends JavaPrimitive {
		/** Constructor for the pf__set_elt object */
		pf__set_elt() {
			super("%set-elt", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__set_elt_execute(first, second, third);
		}
	}

	private static class pf__set_lambda_name extends JavaPrimitive {
		/** Constructor for the pf__set_lambda_name object */
		pf__set_lambda_name() {
			super("%set-lambda-name", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__set_lambda_name_execute(first, second);
		}
	}

	private static class pf__set_nth extends JavaPrimitive {
		/** Constructor for the pf__set_nth object */
		pf__set_nth() {
			super("%set-nth", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__set_nth_execute(first, second, third);
		}
	}

	private static class pf__set_symbol_function extends JavaPrimitive {
		/** Constructor for the pf__set_symbol_function object */
		pf__set_symbol_function() {
			super("%set-symbol-function", Lisp.PACKAGE_SYS, false, "symbol function");
		}

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
			return Primitives.pf__set_symbol_function_execute(first, second);
		}
	}

	private static class pf__set_symbol_plist extends JavaPrimitive {
		/** Constructor for the pf__set_symbol_plist object */
		pf__set_symbol_plist() {
			super("%set-symbol-plist", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf__set_symbol_plist_execute(first, second);
		}
	}

	private static class pf__stream_output_object extends JavaPrimitive {
		/** Constructor for the pf__stream_output_object object */
		pf__stream_output_object() {
			super("%stream-output-object", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf__stream_output_object_execute(first, second);
		}
	}

	private static class pf__stream_terpri extends JavaPrimitive {
		/** Constructor for the pf__stream_terpri object */
		pf__stream_terpri() {
			super("%stream-terpri", Lisp.PACKAGE_SYS, true, "output-stream");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__stream_terpri_execute(arg);
		}
	}

	private static class pf__terpri extends JavaPrimitive {
		/** Constructor for the pf__terpri object */
		pf__terpri() {
			super("%terpri", Lisp.PACKAGE_SYS, false, "output-stream");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__terpri_execute(arg);
		}
	}

	private static class pf__write_to_string extends JavaPrimitive {
		/** Constructor for the pf__write_to_string object */
		pf__write_to_string() {
			super("%write-to-string", Lisp.PACKAGE_SYS, false);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf__write_to_string_execute(arg);
		}
	}

	private static class pf_abs extends JavaPrimitive {
		/** Constructor for the pf_abs object */
		pf_abs() {
			super(LispSymbols.ABS, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_abs_execute(arg);
		}
	}

	private static class pf_add extends JavaPrimitive {
		/** Constructor for the pf_add object */
		pf_add() {
			super(LispSymbols.PLUS, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_add_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_add_execute(arg);
		}

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
			return Primitives.pf_add_execute(first, second);
		}

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
			return Primitives.pf_add_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_add_execute(args);
		}
	}

	private static class pf_append extends JavaPrimitive {
		/** Constructor for the pf_append object */
		pf_append() {
			super(LispSymbols.APPEND, "&rest lists");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_append_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_append_execute(arg);
		}

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
			return Primitives.pf_append_execute(first, second);
		}

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
			return Primitives.pf_append_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_append_execute(args);
		}
	}

	private static class pf_apply extends JavaPrimitive {
		/** Constructor for the pf_apply object */
		pf_apply() {
			super(LispSymbols.APPLY, "function &rest args");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_apply_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_apply_execute(arg);
		}

		/**
		 * Description of the Method
		 *
		 * @param fun
		 *            Description of Parameter
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject fun, SubLObject args) {
			return Primitives.pf_apply_execute(fun, args);
		}

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
			return Primitives.pf_apply_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_apply_execute(args);
		}
	}

	private static class pf_atom extends JavaPrimitive {
		/** Constructor for the pf_atom object */
		pf_atom() {
			super(LispSymbols.ATOM, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_atom_execute(arg);
		}
	}

	@NoInline
	private static class pf_autocompile extends JavaPrimitive {
		/** Constructor for the pf_autocompile object */
		pf_autocompile() {
			super(LispSymbols.AUTOCOMPILE, "function");
		}

		/**
		 * Description of the Method
		 *
		 * @param function
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject function) {
			return Primitives.pf_autocompile_execute(function);
		}
	}

	private static class pf_boundp extends JavaPrimitive {
		/** Constructor for the pf_boundp object */
		pf_boundp() {
			super(LispSymbols.BOUNDP, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_boundp_execute(arg);
		}
	}

	private static class pf_built_in_function_p extends JavaPrimitive {
		/** Constructor for the pf_built_in_function_p object */
		pf_built_in_function_p() {
			super("built-in-function-p", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_built_in_function_p_execute(arg);
		}
	}

	private static class pf_call_count extends JavaPrimitive {
		/** Constructor for the pf_call_count object */
		pf_call_count() {
			super("call-count", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_call_count_execute(arg);
		}
	}

	private static class pf_char_to_utf8 extends JavaPrimitive {
		/** Constructor for the pf_char_to_utf8 object */
		pf_char_to_utf8() {
			super("char-to-utf8", Lisp.PACKAGE_EXT, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_char_to_utf8_execute(arg);
		}
	}

	private static class pf_class_direct_methods extends JavaPrimitive {
		/** Constructor for the pf_class_direct_methods object */
		pf_class_direct_methods() {
			super("class-direct-methods", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_direct_methods_execute(arg);
		}
	}

	private static class pf_class_direct_subclasses extends JavaPrimitive {
		/** Constructor for the pf_class_direct_subclasses object */
		pf_class_direct_subclasses() {
			super("class-direct-subclasses", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_direct_subclasses_execute(arg);
		}
	}

	private static class pf_class_direct_superclasses extends JavaPrimitive {
		/** Constructor for the pf_class_direct_superclasses object */
		pf_class_direct_superclasses() {
			super("class-direct-superclasses", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_direct_superclasses_execute(arg);
		}
	}

	private static class pf_class_documentation extends JavaPrimitive {
		/** Constructor for the pf_class_documentation object */
		pf_class_documentation() {
			super("class-documentation", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_documentation_execute(arg);
		}
	}

	private static class pf_class_finalized_p extends JavaPrimitive {
		/** Constructor for the pf_class_finalized_p object */
		pf_class_finalized_p() {
			super("class-finalized-p", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_finalized_p_execute(arg);
		}
	}

	@NoInline
	private static class pf_class_layout extends JavaPrimitive {
		/** Constructor for the pf_class_layout object */
		pf_class_layout() {
			super("class-layout", Lisp.PACKAGE_SYS, true, "class");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_layout_execute(arg);
		}
	}

	@NoInline
	private static class pf_class_of extends JavaPrimitive {
		/** Constructor for the pf_class_of object */
		pf_class_of() {
			super(LispSymbols.CLASS_OF, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_class_of_execute(arg);
		}
	}

	private static class pf_classp extends JavaPrimitive {
		/** Constructor for the pf_classp object */
		pf_classp() {
			super("classp", Lisp.PACKAGE_EXT, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_classp_execute(arg);
		}
	}

	private static class pf_coerce_to_function extends JavaPrimitive {
		/** Constructor for the pf_coerce_to_function object */
		pf_coerce_to_function() {
			super("coerce-to-function", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_coerce_to_function_execute(arg);
		}
	}

	private static class pf_compiled_function_p extends JavaPrimitive {
		/** Constructor for the pf_compiled_function_p object */
		pf_compiled_function_p() {
			super(LispSymbols.COMPILED_FUNCTION_P, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_compiled_function_p_execute(arg);
		}
	}

	private static class pf_complex extends JavaPrimitive {
		/** Constructor for the pf_complex object */
		pf_complex() {
			super(LispSymbols.COMPLEX, "realpart &optional imagpart");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_complex_execute(arg);
		}

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
			return Primitives.pf_complex_execute(first, second);
		}
	}

	private static class pf_complexp extends JavaPrimitive {
		/** Constructor for the pf_complexp object */
		pf_complexp() {
			super(LispSymbols.COMPLEXP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_complexp_execute(arg);
		}
	}

	private static class pf_cons extends JavaPrimitive {
		/** Constructor for the pf_cons object */
		pf_cons() {
			super(LispSymbols.CONS, "object-1 object-2");
		}

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
			return Primitives.pf_cons_execute(first, second);
		}
	}

	private static class pf_consp extends JavaPrimitive {
		/** Constructor for the pf_consp object */
		pf_consp() {
			super(LispSymbols.CONSP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_consp_execute(arg);
		}
	}

	private static class pf_constantp extends JavaPrimitive {
		/** Constructor for the pf_constantp object */
		pf_constantp() {
			super(LispSymbols.CONSTANTP, "form &optional environment");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_constantp_execute(arg);
		}

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
			return Primitives.pf_constantp_execute(first, second);
		}
	}

	private static class pf_delete_eq extends JavaPrimitive {
		/** Constructor for the pf_delete_eq object */
		pf_delete_eq() {
			super("delete-eq", Lisp.PACKAGE_SYS, true, "item sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param item
		 *            Description of Parameter
		 * @param sequence
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject item, SubLObject sequence) {
			return Primitives.pf_delete_eq_execute(item, sequence);
		}
	}

	private static class pf_delete_eql extends JavaPrimitive {
		/** Constructor for the pf_delete_eql object */
		pf_delete_eql() {
			super("delete-eql", Lisp.PACKAGE_SYS, true, "item sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param item
		 *            Description of Parameter
		 * @param sequence
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject item, SubLObject sequence) {
			return Primitives.pf_delete_eql_execute(item, sequence);
		}
	}

	private static class pf_denominator extends JavaPrimitive {
		/** Constructor for the pf_denominator object */
		pf_denominator() {
			super(LispSymbols.DENOMINATOR, "rational");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_denominator_execute(arg);
		}
	}

	private static class pf_divide extends JavaPrimitive {
		/** Constructor for the pf_divide object */
		pf_divide() {
			super(LispSymbols.SLASH, "numerator &rest denominators");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_divide_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_divide_execute(arg);
		}

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
			return Primitives.pf_divide_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_divide_execute(args);
		}
	}

	private static class pf_elt extends JavaPrimitive {
		/** Constructor for the pf_elt object */
		pf_elt() {
			super("ELT", Lisp.PACKAGE_SYS, false, "sequence index");
		}

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
			return Primitives.pf_elt_execute(first, second);
		}
	}

	private static class pf_endp extends JavaPrimitive {
		/** Constructor for the pf_endp object */
		pf_endp() {
			super(LispSymbols.ENDP, "list");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_endp_execute(arg);
		}
	}

	private static class pf_eq extends JavaPrimitive {
		/** Constructor for the pf_eq object */
		pf_eq() {
			super(LispSymbols.EQ, "x y");
		}

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
			return Primitives.pf_eq_execute(first, second);
		}
	}

	private static class pf_eql extends JavaPrimitive {
		/** Constructor for the pf_eql object */
		pf_eql() {
			super(LispSymbols.EQL, "x y");
		}

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
			return Primitives.pf_eql_execute(first, second);
		}
	}

	private static class pf_equal extends JavaPrimitive {
		/** Constructor for the pf_equal object */
		pf_equal() {
			super(LispSymbols.EQUAL, "x y");
		}

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
			return Primitives.pf_equal_execute(first, second);
		}
	}

	private static class pf_equalp extends JavaPrimitive {
		/** Constructor for the pf_equalp object */
		pf_equalp() {
			super(LispSymbols.EQUALP, "x y");
		}

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
			return Primitives.pf_equalp_execute(first, second);
		}
	}

	private static class pf_equals extends JavaPrimitive {
		/** Constructor for the pf_equals object */
		pf_equals() {
			super(LispSymbols.EQUALS, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_equals_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_equals_execute(arg);
		}

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
			return Primitives.pf_equals_execute(first, second);
		}

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
			return Primitives.pf_equals_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_equals_execute(array);
		}
	}

	@NoInline
	private static class pf_error extends JavaPrimitive {
		/** Constructor for the pf_error object */
		pf_error() {
			super(LispSymbols.ERROR, "datum &rest arguments");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_error_execute(args);
		}
	}

	private static class pf_evenp extends JavaPrimitive {
		/** Constructor for the pf_evenp object */
		pf_evenp() {
			super(LispSymbols.EVENP, "integer");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_evenp_execute(arg);
		}
	}

	private static class pf_export extends JavaPrimitive {
		/** Constructor for the pf_export object */
		pf_export() {
			super(LispSymbols.EXPORT, "symbols &optional package");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_export_execute(arg);
		}

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
			return Primitives.pf_export_execute(first, second);
		}
	}

	private static class pf_fboundp extends JavaPrimitive {
		/** Constructor for the pf_fboundp object */
		pf_fboundp() {
			super(LispSymbols.FBOUNDP, "name");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_fboundp_execute(arg);
		}
	}

	private static class pf_fdefinition_block_name extends JavaPrimitive {
		/** Constructor for the pf_fdefinition_block_name object */
		pf_fdefinition_block_name() {
			super("fdefinition-block-name", Lisp.PACKAGE_SYS, true, "function-name");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_fdefinition_block_name_execute(arg);
		}
	}

	private static class pf_find_package extends JavaPrimitive {
		/** Constructor for the pf_find_package object */
		pf_find_package() {
			super(LispSymbols.FIND_PACKAGE, "name");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_find_package_execute(arg);
		}
	}

	private static class pf_find_symbol extends JavaPrimitive {
		/** Constructor for the pf_find_symbol object */
		pf_find_symbol() {
			super(LispSymbols.FIND_SYMBOL, "string &optional package");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_find_symbol_execute(arg);
		}

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
			return Primitives.pf_find_symbol_execute(first, second);
		}
	}

	private static class pf_fixnump extends JavaPrimitive {
		/** Constructor for the pf_fixnump object */
		pf_fixnump() {
			super("fixnump", Lisp.PACKAGE_EXT, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_fixnump_execute(arg);
		}
	}

	private static class pf_fmakunbound extends JavaPrimitive {
		/** Constructor for the pf_fmakunbound object */
		pf_fmakunbound() {
			super(LispSymbols.FMAKUNBOUND, "name");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_fmakunbound_execute(arg);
		}
	}

	private static class pf_fset extends JavaPrimitive {
		/** Constructor for the pf_fset object */
		pf_fset() {
			super("fset", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_fset_execute(first, second);
		}

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
			return Primitives.pf_fset_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf_fset_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @param fifth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth) {
			return Primitives.pf_fset_execute(first, second, third, fourth, fifth);
		}
	}

	private static class pf_funcall extends JavaPrimitive {
		/** Constructor for the pf_funcall object */
		pf_funcall() {
			super(LispSymbols.FUNCALL, "function &rest args");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_funcall_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_funcall_execute(arg);
		}

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
			return Primitives.pf_funcall_execute(first, second);
		}

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
			return Primitives.pf_funcall_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf_funcall_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @param fifth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth) {
			return Primitives.pf_funcall_execute(first, second, third, fourth, fifth);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @param fifth
		 *            Description of Parameter
		 * @param sixth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth) {
			return Primitives.pf_funcall_execute(first, second, third, fourth, fifth, sixth);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @param fifth
		 *            Description of Parameter
		 * @param sixth
		 *            Description of Parameter
		 * @param seventh
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth, SubLObject seventh) {
			return Primitives.pf_funcall_execute(first, second, third, fourth, fifth, sixth, seventh);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @param fifth
		 *            Description of Parameter
		 * @param sixth
		 *            Description of Parameter
		 * @param seventh
		 *            Description of Parameter
		 * @param eigth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eigth) {
			return Primitives.pf_funcall_execute(first, second, third, fourth, fifth, sixth, seventh, eigth);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_funcall_execute(args);
		}
	}

	private static class pf_funcall_key extends JavaPrimitive {
		/** Constructor for the pf_funcall_key object */
		pf_funcall_key() {
			super("funcall-key", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf_funcall_key_execute(first, second);
		}
	}

	private static class pf_function_lambda_expression extends JavaPrimitive {
		/** Constructor for the pf_function_lambda_expression object */
		pf_function_lambda_expression() {
			super(LispSymbols.FUNCTION_LAMBDA_EXPRESSION, "function");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_function_lambda_expression_execute(arg);
		}
	}

	private static class pf_function_plist extends JavaPrimitive {
		/** Constructor for the pf_function_plist object */
		pf_function_plist() {
			super("function-plist", Lisp.PACKAGE_SYS, true, "function");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_function_plist_execute(arg);
		}
	}

	private static class pf_functionp extends JavaPrimitive {
		/** Constructor for the pf_functionp object */
		pf_functionp() {
			super(LispSymbols.FUNCTIONP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_functionp_execute(arg);
		}
	}

	private static class pf_gcd_2 extends JavaPrimitive {
		/** Constructor for the pf_gcd_2 object */
		pf_gcd_2() {
			super("gcd-2", Lisp.PACKAGE_SYS, false);
		}

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
			return Primitives.pf_gcd_2_execute(first, second);
		}
	}

	private static class pf_ge extends JavaPrimitive {
		/** Constructor for the pf_ge object */
		pf_ge() {
			super(LispSymbols.GE, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_ge_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_ge_execute(arg);
		}

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
			return Primitives.pf_ge_execute(first, second);
		}

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
			return Primitives.pf_ge_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_ge_execute(array);
		}
	}

	private static class pf_gensym extends JavaPrimitive {
		/** Constructor for the pf_gensym object */
		pf_gensym() {
			super(LispSymbols.GENSYM, "&optional x");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_gensym_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_gensym_execute(arg);
		}
	}

	private static class pf_get extends JavaPrimitive {
		/** Constructor for the pf_get object */
		pf_get() {
			super(LispSymbols.GET, "symbol indicator &optional default");
		}

		/**
		 * Description of the Method
		 *
		 * @param symbol
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject symbol, SubLObject indicator) {
			return Primitives.pf_get_execute(symbol, indicator);
		}

		/**
		 * Description of the Method
		 *
		 * @param symbol
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @param defaultValue
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue) {
			return Primitives.pf_get_execute(symbol, indicator, defaultValue);
		}
	}

	private static class pf_getf extends JavaPrimitive {
		/** Constructor for the pf_getf object */
		pf_getf() {
			super(LispSymbols.GETF, "plist indicator &optional default");
		}

		/**
		 * Description of the Method
		 *
		 * @param plist
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject plist, SubLObject indicator) {
			return Primitives.pf_getf_execute(plist, indicator);
		}

		/**
		 * Description of the Method
		 *
		 * @param plist
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @param defaultValue
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject plist, SubLObject indicator, SubLObject defaultValue) {
			return Primitives.pf_getf_execute(plist, indicator, defaultValue);
		}
	}

	private static class pf_gt extends JavaPrimitive {
		/** Constructor for the pf_gt object */
		pf_gt() {
			super(LispSymbols.GT, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_gt_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_gt_execute(arg);
		}

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
			return Primitives.pf_gt_execute(first, second);
		}

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
			return Primitives.pf_gt_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_gt_execute(array);
		}
	}

	private static class pf_hot_count extends JavaPrimitive {
		/** Constructor for the pf_hot_count object */
		pf_hot_count() {
			super("hot-count", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_hot_count_execute(arg);
		}
	}

	private static class pf_identity extends JavaPrimitive {
		/** Constructor for the pf_identity object */
		pf_identity() {
			super(LispSymbols.IDENTITY, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_identity_execute(arg);
		}
	}

	private static class pf_identity_hash_code extends JavaPrimitive {
		/** Constructor for the pf_identity_hash_code object */
		pf_identity_hash_code() {
			super("identity-hash-code", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_identity_hash_code_execute(arg);
		}
	}

	private static class pf_imagpart extends JavaPrimitive {
		/** Constructor for the pf_imagpart object */
		pf_imagpart() {
			super(LispSymbols.IMAGPART, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_imagpart_execute(arg);
		}
	}

	private static class pf_inspected_description extends JavaPrimitive {
		/** Constructor for the pf_inspected_description object */
		pf_inspected_description() {
			super("inspected-description", Lisp.PACKAGE_SYS, false);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_inspected_description_execute(arg);
		}
	}

	private static class pf_inspected_parts extends JavaPrimitive {
		/** Constructor for the pf_inspected_parts object */
		pf_inspected_parts() {
			super("inspected-parts", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_inspected_parts_execute(arg);
		}
	}

	private static class pf_integer_length extends JavaPrimitive {
		/** Constructor for the pf_integer_length object */
		pf_integer_length() {
			super(LispSymbols.INTEGER_LENGTH, "integer");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_integer_length_execute(arg);
		}
	}

	private static class pf_integerp extends JavaPrimitive {
		/** Constructor for the pf_integerp object */
		pf_integerp() {
			super(LispSymbols.INTEGERP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_integerp_execute(arg);
		}
	}

	private static class pf_intern extends JavaPrimitive {
		/** Constructor for the pf_intern object */
		pf_intern() {
			super(LispSymbols.INTERN, "string &optional package");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_intern_execute(arg);
		}

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
			return Primitives.pf_intern_execute(first, second);
		}
	}

	private static class pf_keywordp extends JavaPrimitive {
		/** Constructor for the pf_keywordp object */
		pf_keywordp() {
			super(LispSymbols.KEYWORDP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_keywordp_execute(arg);
		}
	}

	private static class pf_lambda_name extends JavaPrimitive {
		/** Constructor for the pf_lambda_name object */
		pf_lambda_name() {
			super("lambda-name", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_lambda_name_execute(arg);
		}
	}

	private static class pf_le extends JavaPrimitive {
		/** Constructor for the pf_le object */
		pf_le() {
			super(LispSymbols.LE, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_le_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_le_execute(arg);
		}

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
			return Primitives.pf_le_execute(first, second);
		}

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
			return Primitives.pf_le_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_le_execute(array);
		}
	}

	private static class pf_length extends JavaPrimitive {
		/** Constructor for the pf_length object */
		pf_length() {
			super("LENGTH", Lisp.PACKAGE_SYS, false, "sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_length_execute(arg);
		}
	}

	private static class pf_list extends JavaPrimitive {
		/** Constructor for the pf_list object */
		pf_list() {
			super(LispSymbols.LIST, "&rest objects");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_list_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_list_execute(arg);
		}

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
			return Primitives.pf_list_execute(first, second);
		}

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
			return Primitives.pf_list_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf_list_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_list_execute(args);
		}
	}

	private static class pf_list_delete_eq extends JavaPrimitive {
		/** Constructor for the pf_list_delete_eq object */
		pf_list_delete_eq() {
			super("list-delete-eq", Lisp.PACKAGE_SYS, true, "item list");
		}

		/**
		 * Description of the Method
		 *
		 * @param item
		 *            Description of Parameter
		 * @param list
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject item, SubLObject list) {
			return Primitives.pf_list_delete_eq_execute(item, list);
		}
	}

	private static class pf_list_delete_eql extends JavaPrimitive {
		/** Constructor for the pf_list_delete_eql object */
		pf_list_delete_eql() {
			super("list-delete-eql", Lisp.PACKAGE_SYS, true, "item list");
		}

		/**
		 * Description of the Method
		 *
		 * @param item
		 *            Description of Parameter
		 * @param list
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject item, SubLObject list) {
			return Primitives.pf_list_delete_eql_execute(item, list);
		}
	}

	private static class pf_list_star extends JavaPrimitive {
		/** Constructor for the pf_list_star object */
		pf_list_star() {
			super(LispSymbols.LIST_STAR, "&rest objects");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_list_star_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_list_star_execute(arg);
		}

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
			return Primitives.pf_list_star_execute(first, second);
		}

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
			return Primitives.pf_list_star_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf_list_star_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_list_star_execute(args);
		}
	}

	private static class pf_listp extends JavaPrimitive {
		/** Constructor for the pf_listp object */
		pf_listp() {
			super(LispSymbols.LISTP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_listp_execute(arg);
		}
	}

	private static class pf_lt extends JavaPrimitive {
		/** Constructor for the pf_lt object */
		pf_lt() {
			super(LispSymbols.LT, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_lt_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_lt_execute(arg);
		}

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
			return Primitives.pf_lt_execute(first, second);
		}

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
			return Primitives.pf_lt_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_lt_execute(array);
		}
	}

	private static class pf_macro_function extends JavaPrimitive {
		/** Constructor for the pf_macro_function object */
		pf_macro_function() {
			super(LispSymbols.MACRO_FUNCTION, "symbol &optional environment");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_macro_function_execute(arg);
		}

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
			return Primitives.pf_macro_function_execute(first, second);
		}
	}

	private static class pf_macro_function_p extends JavaPrimitive {
		/** Constructor for the pf_macro_function_p object */
		pf_macro_function_p() {
			super("macro-function-p", Lisp.PACKAGE_SYS, true, "value");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_macro_function_p_execute(arg);
		}
	}

	private static class pf_macroexpand extends JavaPrimitive {
		/** Constructor for the pf_macroexpand object */
		pf_macroexpand() {
			super(LispSymbols.MACROEXPAND, "form &optional env");
		}

		/**
		 * Description of the Method
		 *
		 * @param form
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject form) {
			return Primitives.pf_macroexpand_execute(form);
		}

		/**
		 * Description of the Method
		 *
		 * @param form
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject form, SubLObject env) {
			return Primitives.pf_macroexpand_execute(form, env);
		}
	}

	@NoInline
	private static class pf_macroexpand_1 extends JavaPrimitive {
		/** Constructor for the pf_macroexpand_1 object */
		pf_macroexpand_1() {
			super(LispSymbols.MACROEXPAND_1, "form &optional env");
		}

		/**
		 * Description of the Method
		 *
		 * @param form
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject form) {
			return Primitives.pf_macroexpand_1_execute(form);
		}

		/**
		 * Description of the Method
		 *
		 * @param form
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject form, SubLObject env) {
			return Primitives.pf_macroexpand_1_execute(form, env);
		}
	}

	@NoInline
	private static class pf_make_closure extends JavaPrimitive {
		/** Constructor for the pf_make_closure object */
		pf_make_closure() {
			super("make-closure", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_make_closure_execute(first, second);
		}
	}

	private static class pf_make_expander_for_macrolet extends JavaPrimitive {
		/** Constructor for the pf_make_expander_for_macrolet object */
		pf_make_expander_for_macrolet() {
			super("make-expander-for-macrolet", Lisp.PACKAGE_SYS, true, "definition");
		}

		/**
		 * Description of the Method
		 *
		 * @param definition
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject definition) {
			return Primitives.pf_make_expander_for_macrolet_execute(definition);
		}
	}

	private static class pf_make_keyword extends JavaPrimitive {
		/** Constructor for the pf_make_keyword object */
		pf_make_keyword() {
			super("make-keyword", Lisp.PACKAGE_SYS, true, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_make_keyword_execute(arg);
		}
	}

	private static class pf_make_macro extends JavaPrimitive {
		/** Constructor for the pf_make_macro object */
		pf_make_macro() {
			super("make-macro", Lisp.PACKAGE_SYS, true, "name expansion-function");
		}

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
			return Primitives.pf_make_macro_execute(first, second);
		}
	}

	private static class pf_make_symbol extends JavaPrimitive {
		/** Constructor for the pf_make_symbol object */
		pf_make_symbol() {
			super(LispSymbols.MAKE_SYMBOL, "name");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_make_symbol_execute(arg);
		}
	}

	private static class pf_make_symbol_macro extends JavaPrimitive {
		/** Constructor for the pf_make_symbol_macro object */
		pf_make_symbol_macro() {
			super("make-symbol-macro", Lisp.PACKAGE_SYS, true, "expansion");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_make_symbol_macro_execute(arg);
		}
	}

	private static class pf_makunbound extends JavaPrimitive {
		/** Constructor for the pf_makunbound object */
		pf_makunbound() {
			super(LispSymbols.MAKUNBOUND, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_makunbound_execute(arg);
		}
	}

	private static class pf_mapc extends JavaPrimitive {
		/** Constructor for the pf_mapc object */
		pf_mapc() {
			super(LispSymbols.MAPC, "function &rest lists");
		}

		/**
		 * Description of the Method
		 *
		 * @param fun
		 *            Description of Parameter
		 * @param list
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject fun, SubLObject list) {
			return Primitives.pf_mapc_execute(fun, list);
		}

		/**
		 * Description of the Method
		 *
		 * @param fun
		 *            Description of Parameter
		 * @param list1
		 *            Description of Parameter
		 * @param list2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject fun, SubLObject list1, SubLObject list2) {
			return Primitives.pf_mapc_execute(fun, list1, list2);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_mapc_execute(args);
		}
	}

	private static class pf_mapcar extends JavaPrimitive {
		/** Constructor for the pf_mapcar object */
		pf_mapcar() {
			super(LispSymbols.MAPCAR, "function &rest lists");
		}

		/**
		 * Description of the Method
		 *
		 * @param fun
		 *            Description of Parameter
		 * @param list
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject fun, SubLObject list) {
			return Primitives.pf_mapcar_execute(fun, list);
		}

		/**
		 * Description of the Method
		 *
		 * @param fun
		 *            Description of Parameter
		 * @param list1
		 *            Description of Parameter
		 * @param list2
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject fun, SubLObject list1, SubLObject list2) {
			return Primitives.pf_mapcar_execute(fun, list1, list2);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_mapcar_execute(args);
		}
	}

	private static class pf_max extends JavaPrimitive {
		/** Constructor for the pf_max object */
		pf_max() {
			super(LispSymbols.MAX, "&rest reals");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_max_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_max_execute(arg);
		}

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
			return Primitives.pf_max_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_max_execute(args);
		}
	}

	private static class pf_min extends JavaPrimitive {
		/** Constructor for the pf_min object */
		pf_min() {
			super(LispSymbols.MIN, "&rest reals");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_min_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_min_execute(arg);
		}

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
			return Primitives.pf_min_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_min_execute(args);
		}
	}

	private static class pf_minusp extends JavaPrimitive {
		/** Constructor for the pf_minusp object */
		pf_minusp() {
			super(LispSymbols.MINUSP, "real");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_minusp_execute(arg);
		}
	}

	private static class pf_multiply extends JavaPrimitive {
		/** Constructor for the pf_multiply object */
		pf_multiply() {
			super(LispSymbols.STAR, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_multiply_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_multiply_execute(arg);
		}

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
			return Primitives.pf_multiply_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_multiply_execute(args);
		}
	}

	private static class pf_nconc extends JavaPrimitive {
		/** Constructor for the pf_nconc object */
		pf_nconc() {
			super(LispSymbols.NCONC, "&rest lists");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_nconc_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_nconc_execute(arg);
		}

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
			return Primitives.pf_nconc_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_nconc_execute(array);
		}
	}

	private static class pf_not extends JavaPrimitive {
		/** Constructor for the pf_not object */
		pf_not() {
			super(LispSymbols.NOT, "x");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_not_execute(arg);
		}
	}

	private static class pf_not_equals extends JavaPrimitive {
		/** Constructor for the pf_not_equals object */
		pf_not_equals() {
			super(LispSymbols.NOT_EQUALS, "&rest numbers");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_not_equals_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_not_equals_execute(arg);
		}

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
			return Primitives.pf_not_equals_execute(first, second);
		}

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
			return Primitives.pf_not_equals_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param array
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] array) {
			return Primitives.pf_not_equals_execute(array);
		}
	}

	private static class pf_nreconc extends JavaPrimitive {
		/** Constructor for the pf_nreconc object */
		pf_nreconc() {
			super(LispSymbols.NRECONC, "list tail");
		}

		/**
		 * Description of the Method
		 *
		 * @param list
		 *            Description of Parameter
		 * @param obj
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject list, SubLObject obj) {
			return Primitives.pf_nreconc_execute(list, obj);
		}
	}

	private static class pf_nreverse extends JavaPrimitive {
		/** Constructor for the pf_nreverse object */
		pf_nreverse() {
			super("%NREVERSE", Lisp.PACKAGE_SYS, false, "sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_nreverse_execute(arg);
		}
	}

	private static class pf_nth extends JavaPrimitive {
		/** Constructor for the pf_nth object */
		pf_nth() {
			super(LispSymbols.NTH, "n list");
		}

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
			return Primitives.pf_nth_execute(first, second);
		}
	}

	private static class pf_nthcdr extends JavaPrimitive {
		/** Constructor for the pf_nthcdr object */
		pf_nthcdr() {
			super(LispSymbols.NTHCDR, "n list");
		}

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
			return Primitives.pf_nthcdr_execute(first, second);
		}
	}

	private static class pf_null extends JavaPrimitive {
		/** Constructor for the pf_null object */
		pf_null() {
			super(LispSymbols.NULL, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_null_execute(arg);
		}
	}

	private static class pf_numberp extends JavaPrimitive {
		/** Constructor for the pf_numberp object */
		pf_numberp() {
			super(LispSymbols.NUMBERP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_numberp_execute(arg);
		}
	}

	private static class pf_numerator extends JavaPrimitive {
		/** Constructor for the pf_numerator object */
		pf_numerator() {
			super(LispSymbols.NUMERATOR, "rational");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_numerator_execute(arg);
		}
	}

	private static class pf_oddp extends JavaPrimitive {
		/** Constructor for the pf_oddp object */
		pf_oddp() {
			super(LispSymbols.ODDP, "integer");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_oddp_execute(arg);
		}
	}

	private static class pf_one_minus extends JavaPrimitive {
		/** Constructor for the pf_one_minus object */
		pf_one_minus() {
			super(LispSymbols.ONE_MINUS, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_one_minus_execute(arg);
		}
	}

	private static class pf_one_plus extends JavaPrimitive {
		/** Constructor for the pf_one_plus object */
		pf_one_plus() {
			super(LispSymbols.ONE_PLUS, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_one_plus_execute(arg);
		}
	}

	private static class pf_package_external_symbols extends JavaPrimitive {
		/** Constructor for the pf_package_external_symbols object */
		pf_package_external_symbols() {
			super("package-external-symbols", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_package_external_symbols_execute(arg);
		}
	}

	private static class pf_package_inherited_symbols extends JavaPrimitive {
		/** Constructor for the pf_package_inherited_symbols object */
		pf_package_inherited_symbols() {
			super("package-inherited-symbols", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_package_inherited_symbols_execute(arg);
		}
	}

	private static class pf_package_internal_symbols extends JavaPrimitive {
		/** Constructor for the pf_package_internal_symbols object */
		pf_package_internal_symbols() {
			super("package-internal-symbols", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_package_internal_symbols_execute(arg);
		}
	}

	private static class pf_package_symbols extends JavaPrimitive {
		/** Constructor for the pf_package_symbols object */
		pf_package_symbols() {
			super("package-symbols", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_package_symbols_execute(arg);
		}
	}

	private static class pf_plusp extends JavaPrimitive {
		/** Constructor for the pf_plusp object */
		pf_plusp() {
			super(LispSymbols.PLUSP, "real");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_plusp_execute(arg);
		}
	}

	private static class pf_put extends JavaPrimitive {
		/** Constructor for the pf_put object */
		pf_put() {
			super("put", Lisp.PACKAGE_SYS, true);
		}

		/**
		 * Description of the Method
		 *
		 * @param symbol
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @param value
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject value) {
			return Primitives.pf_put_execute(symbol, indicator, value);
		}

		/**
		 * Description of the Method
		 *
		 * @param symbol
		 *            Description of Parameter
		 * @param indicator
		 *            Description of Parameter
		 * @param defaultValue
		 *            Description of Parameter
		 * @param value
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue, SubLObject value) {
			return Primitives.pf_put_execute(symbol, indicator, defaultValue, value);
		}
	}

	private static class pf_rationalp extends JavaPrimitive {
		/** Constructor for the pf_rationalp object */
		pf_rationalp() {
			super(LispSymbols.RATIONALP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_rationalp_execute(arg);
		}
	}

	private static class pf_realp extends JavaPrimitive {
		/** Constructor for the pf_realp object */
		pf_realp() {
			super(LispSymbols.REALP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_realp_execute(arg);
		}
	}

	private static class pf_realpart extends JavaPrimitive {
		/** Constructor for the pf_realpart object */
		pf_realpart() {
			super(LispSymbols.REALPART, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_realpart_execute(arg);
		}
	}

	private static class pf_remprop extends JavaPrimitive {
		/** Constructor for the pf_remprop object */
		pf_remprop() {
			super(LispSymbols.REMPROP, "symbol indicator");
		}

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
			return Primitives.pf_remprop_execute(first, second);
		}
	}

	private static class pf_reverse extends JavaPrimitive {
		/** Constructor for the pf_reverse object */
		pf_reverse() {
			super("%reverse", Lisp.PACKAGE_SYS, false, "sequence");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_reverse_execute(arg);
		}
	}

	private static class pf_rplaca extends JavaPrimitive {
		/** Constructor for the pf_rplaca object */
		pf_rplaca() {
			super(LispSymbols.RPLACA, "cons object");
		}

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
			return Primitives.pf_rplaca_execute(first, second);
		}
	}

	private static class pf_rplacd extends JavaPrimitive {
		/** Constructor for the pf_rplacd object */
		pf_rplacd() {
			super(LispSymbols.RPLACD, "cons object");
		}

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
			return Primitives.pf_rplacd_execute(first, second);
		}
	}

	private static class pf_set extends JavaPrimitive {
		/** Constructor for the pf_set object */
		pf_set() {
			super(LispSymbols.SET, "symbol value");
		}

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
			return Primitives.pf_set_execute(first, second);
		}
	}

	private static class pf_set_call_count extends JavaPrimitive {
		/** Constructor for the pf_set_call_count object */
		pf_set_call_count() {
			super("set-call-count", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_set_call_count_execute(first, second);
		}
	}

	private static class pf_set_class_precedence_list extends JavaPrimitive {
		/** Constructor for the pf_set_class_precedence_list object */
		pf_set_class_precedence_list() {
			super("set-class-precedence-list", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_set_class_precedence_list_execute(first, second);
		}
	}

	private static class pf_set_hot_count extends JavaPrimitive {
		/** Constructor for the pf_set_hot_count object */
		pf_set_hot_count() {
			super("set-hot-count", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_set_hot_count_execute(first, second);
		}
	}

	private static class pf_setf_function_name_p extends JavaPrimitive {
		/** Constructor for the pf_setf_function_name_p object */
		pf_setf_function_name_p() {
			super("setf-function-name-p", Lisp.PACKAGE_SYS, true, "thing");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_setf_function_name_p_execute(arg);
		}
	}

	@NoInline
	private static class pf_signal extends JavaPrimitive {
		/** Constructor for the pf_signal object */
		pf_signal() {
			super(LispSymbols.SIGNAL, "datum &rest arguments");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_signal_execute(args);
		}
	}

	private static class pf_simple_typep extends JavaPrimitive {
		/** Constructor for the pf_simple_typep object */
		pf_simple_typep() {
			super("simple-typep", Lisp.PACKAGE_SYS, true);
		}

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
			return Primitives.pf_simple_typep_execute(first, second);
		}
	}

	private static class pf_special_operator_p extends JavaPrimitive {
		/** Constructor for the pf_special_operator_p object */
		pf_special_operator_p() {
			super(LispSymbols.SPECIAL_OPERATOR_P, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_special_operator_p_execute(arg);
		}
	}

	private static class pf_standard_object_p extends JavaPrimitive {
		/** Constructor for the pf_standard_object_p object */
		pf_standard_object_p() {
			super("standard-object-p", Lisp.PACKAGE_SYS, true, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_standard_object_p_execute(arg);
		}
	}

	private static class pf_streamp extends JavaPrimitive {
		/** Constructor for the pf_streamp object */
		pf_streamp() {
			super(LispSymbols.STREAMP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_streamp_execute(arg);
		}
	}

	private static class pf_string extends JavaPrimitive {
		/** Constructor for the pf_string object */
		pf_string() {
			super(LispSymbols.STRING, "x");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_string_execute(arg);
		}
	}

	private static class pf_subseq extends JavaPrimitive {
		/** Constructor for the pf_subseq object */
		pf_subseq() {
			super(Lisp.PACKAGE_SYS.intern("%SUBSEQ"), "sequence start &optional end");
		}

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
			return Primitives.pf_subseq_execute(first, second);
		}

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
			return Primitives.pf_subseq_execute(first, second, third);
		}
	}

	private static class pf_subtract extends JavaPrimitive {
		/** Constructor for the pf_subtract object */
		pf_subtract() {
			super(LispSymbols.MINUS, "minuend &rest subtrahends");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_subtract_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_subtract_execute(arg);
		}

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
			return Primitives.pf_subtract_execute(first, second);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_subtract_execute(args);
		}
	}

	private static class pf_symbol_function extends JavaPrimitive {
		/** Constructor for the pf_symbol_function object */
		pf_symbol_function() {
			super(LispSymbols.SYMBOL_FUNCTION, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_function_execute(arg);
		}
	}

	private static class pf_symbol_macro_p extends JavaPrimitive {
		/** Constructor for the pf_symbol_macro_p object */
		pf_symbol_macro_p() {
			super("symbol-macro-p", Lisp.PACKAGE_SYS, true, "value");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_macro_p_execute(arg);
		}
	}

	private static class pf_symbol_name extends JavaPrimitive {
		/** Constructor for the pf_symbol_name object */
		pf_symbol_name() {
			super(LispSymbols.SYMBOL_NAME, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_name_execute(arg);
		}
	}

	private static class pf_symbol_package extends JavaPrimitive {
		/** Constructor for the pf_symbol_package object */
		pf_symbol_package() {
			super(LispSymbols.SYMBOL_PACKAGE, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_package_execute(arg);
		}
	}

	private static class pf_symbol_plist extends JavaPrimitive {
		/** Constructor for the pf_symbol_plist object */
		pf_symbol_plist() {
			super(LispSymbols.SYMBOL_PLIST, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_plist_execute(arg);
		}
	}

	private static class pf_symbol_value extends JavaPrimitive {
		/** Constructor for the pf_symbol_value object */
		pf_symbol_value() {
			super(LispSymbols.SYMBOL_VALUE, "symbol");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbol_value_execute(arg);
		}
	}

	private static class pf_symbolp extends JavaPrimitive {
		/** Constructor for the pf_symbolp object */
		pf_symbolp() {
			super(LispSymbols.SYMBOLP, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_symbolp_execute(arg);
		}
	}

	private static class pf_type_of extends JavaPrimitive {
		/** Constructor for the pf_type_of object */
		pf_type_of() {
			super(LispSymbols.TYPE_OF, "object");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_type_of_execute(arg);
		}
	}

	@NoInline
	private static class pf_undefined_function_called extends JavaPrimitive {
		/** Constructor for the pf_undefined_function_called object */
		pf_undefined_function_called() {
			super(LispSymbols.UNDEFINED_FUNCTION_CALLED, "name arguments");
		}

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
			return Primitives.pf_undefined_function_called_execute(first, second);
		}
	}

	private static class pf_unintern extends JavaPrimitive {
		/** Constructor for the pf_unintern object */
		pf_unintern() {
			super(LispSymbols.UNINTERN, "symbol &optional package");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_unintern_execute(args);
		}
	}

	private static class pf_uptime extends JavaPrimitive {
		/** Constructor for the pf_uptime object */
		pf_uptime() {
			super("uptime", Lisp.PACKAGE_EXT, true);
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_uptime_execute();
		}
	}

	private static class pf_use_package extends JavaPrimitive {
		/** Constructor for the pf_use_package object */
		pf_use_package() {
			super(LispSymbols.USE_PACKAGE, "packages-to-use &optional package");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_use_package_execute(args);
		}
	}

	private static class pf_values extends JavaPrimitive {
		/** Constructor for the pf_values object */
		pf_values() {
			super(LispSymbols.VALUES, "&rest object");
		}

		/**
		 * Description of the Method
		 *
		 * @return Description of the Returned Value
		 */

		public SubLObject execute() {
			return Primitives.pf_values_execute();
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_values_execute(arg);
		}

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
			return Primitives.pf_values_execute(first, second);
		}

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
			return Primitives.pf_values_execute(first, second, third);
		}

		/**
		 * Description of the Method
		 *
		 * @param first
		 *            Description of Parameter
		 * @param second
		 *            Description of Parameter
		 * @param third
		 *            Description of Parameter
		 * @param fourth
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return Primitives.pf_values_execute(first, second, third, fourth);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject[] args) {
			return Primitives.pf_values_execute(args);
		}
	}

	private static class pf_values_list extends JavaPrimitive {
		/** Constructor for the pf_values_list object */
		pf_values_list() {
			super(LispSymbols.VALUES_LIST, "list");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_values_list_execute(arg);
		}
	}

	private static class pf_zerop extends JavaPrimitive {
		/** Constructor for the pf_zerop object */
		pf_zerop() {
			super(LispSymbols.ZEROP, "number");
		}

		/**
		 * Description of the Method
		 *
		 * @param arg
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject arg) {
			return Primitives.pf_zerop_execute(arg);
		}
	}

	private static class sf_and extends SpecialOperator {
		/** Constructor for the sf_and object */
		sf_and() {
			super(LispSymbols.AND, "&rest forms");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_and_execute(args, env);
		}
	}

	private static class sf_block extends SpecialOperator {
		/** Constructor for the sf_block object */
		sf_block() {
			super(LispSymbols.BLOCK, "name &rest forms");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_block_execute(args, env);
		}
	}

	private static class sf_case extends SpecialOperator {
		/** Constructor for the sf_case object */
		sf_case() {
			super(LispSymbols.CASE, "keyform &body cases");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_case_execute(args, env);
		}
	}

	private static class sf_catch extends SpecialOperator {
		/** Constructor for the sf_catch object */
		sf_catch() {
			super(LispSymbols.CATCH, "tag &body body");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_catch_execute(args, env);
		}
	}

	private static class sf_cond extends SpecialOperator {
		/** Constructor for the sf_cond object */
		sf_cond() {
			super(LispSymbols.COND, "&rest clauses");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_cond_execute(args, env);
		}
	}

	private static class sf_defmacro extends SpecialOperator {
		/** Constructor for the sf_defmacro object */
		sf_defmacro() {
			super(LispSymbols.DEFMACRO);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_defmacro_execute(args, env);
		}
	}

	private static class sf_ecase extends SpecialOperator {
		/** Constructor for the sf_ecase object */
		sf_ecase() {
			super(LispSymbols.ECASE, "keyform &body cases");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_ecase_execute(args, env);
		}
	}

	private static class sf_eval_when extends SpecialOperator {
		/** Constructor for the sf_eval_when object */
		sf_eval_when() {
			super(LispSymbols.EVAL_WHEN, "situations &rest forms");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_eval_when_execute(args, env);
		}
	}

	private static class sf_go extends SpecialOperator {
		/** Constructor for the sf_go object */
		sf_go() {
			super(LispSymbols.GO, "tag");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_go_execute(args, env);
		}
	}

	private static class sf_macrolet extends SpecialOperator {
		/** Constructor for the sf_macrolet object */
		sf_macrolet() {
			super(LispSymbols.MACROLET, "definitions &rest body");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_macrolet_execute(args, env);
		}
	}

	private static class sf_multiple_value_bind extends SpecialOperator {
		/** Constructor for the sf_multiple_value_bind object */
		sf_multiple_value_bind() {
			super(LispSymbols.MULTIPLE_VALUE_BIND, "vars value-form &body body");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_multiple_value_bind_execute(args, env);
		}
	}

	private static class sf_multiple_value_call extends SpecialOperator {
		/** Constructor for the sf_multiple_value_call object */
		sf_multiple_value_call() {
			super(LispSymbols.MULTIPLE_VALUE_CALL, "fun &rest args");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_multiple_value_call_execute(args, env);
		}
	}

	private static class sf_multiple_value_list extends SpecialOperator {
		/** Constructor for the sf_multiple_value_list object */
		sf_multiple_value_list() {
			super(LispSymbols.MULTIPLE_VALUE_LIST, "value-form");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_multiple_value_list_execute(args, env);
		}
	}

	private static class sf_multiple_value_prog1 extends SpecialOperator {
		/** Constructor for the sf_multiple_value_prog1 object */
		sf_multiple_value_prog1() {
			super(LispSymbols.MULTIPLE_VALUE_PROG1, "values-form &rest forms");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_multiple_value_prog1_execute(args, env);
		}
	}

	private static class sf_nth_value extends SpecialOperator {
		/** Constructor for the sf_nth_value object */
		sf_nth_value() {
			super(LispSymbols.NTH_VALUE, "n form");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_nth_value_execute(args, env);
		}
	}

	private static class sf_or extends SpecialOperator {
		/** Constructor for the sf_or object */
		sf_or() {
			super(LispSymbols.OR, "&rest forms");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_or_execute(args, env);
		}
	}

	private static class sf_return_from extends SpecialOperator {
		/** Constructor for the sf_return_from object */
		sf_return_from() {
			super(LispSymbols.RETURN_FROM, "name &optional value");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_return_from_execute(args, env);
		}
	}

	private static class sf_tagbody extends SpecialOperator {
		/** Constructor for the sf_tagbody object */
		sf_tagbody() {
			super(LispSymbols.TAGBODY, "&rest statements");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_tagbody_execute(args, env);
		}
	}

	private static class sf_throw extends SpecialOperator {
		/** Constructor for the sf_throw object */
		sf_throw() {
			super(LispSymbols.THROW, "tag result");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_throw_execute(args, env);
		}
	}

	private static class sf_unless extends SpecialOperator {
		/** Constructor for the sf_unless object */
		sf_unless() {
			super(LispSymbols.UNLESS);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_unless_execute(args, env);
		}
	}

	private static class sf_unwind_protect extends SpecialOperator {
		/** Constructor for the sf_unwind_protect object */
		sf_unwind_protect() {
			super(LispSymbols.UNWIND_PROTECT, "protected &body cleanup");
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_unwind_protect_execute(args, env);
		}
	}

	private static class sf_when extends SpecialOperator {
		/** Constructor for the sf_when object */
		sf_when() {
			super(LispSymbols.WHEN);
		}

		/**
		 * Description of the Method
		 *
		 * @param args
		 *            Description of Parameter
		 * @param env
		 *            Description of Parameter
		 * @return Description of the Returned Value
		 */

		public SubLObject execute(SubLObject args, Environment env) {
			return Primitives.sf_when_execute(args, env);
		}
	}

	// ### *
	public static Primitive MULTIPLY = new pf_multiply();

	// ### /
	public static Primitive DIVIDE = new pf_divide();

	// ### min
	public static Primitive MIN = new pf_min();

	// ### max
	public static Primitive MAX = new pf_max();

	// ### append
	public static Primitive APPEND = new pf_append();

	// ### funcall
	// This needs to be public for LispAPI.java.
	public static Primitive FUNCALL = new pf_funcall();

	@NoInline
	// ### apply
	public static Primitive APPLY = new pf_apply();

	// ### nreverse
	public static Primitive NREVERSE = new pf_nreverse();

	// ### symbol-name
	public static Primitive SYMBOL_NAME = new pf_symbol_name();

	// ### symbol-package
	public static Primitive SYMBOL_PACKAGE = new pf_symbol_package();

	// ### symbol-function
	public static Primitive SYMBOL_FUNCTION = new pf_symbol_function();

	@NoInline
	// ### %set-symbol-function
	public static Primitive _SET_SYMBOL_FUNCTION = new pf__set_symbol_function();

	// ### symbol-plist
	public static Primitive SYMBOL_PLIST = new pf_symbol_plist();

	// ### keywordp
	public static Primitive KEYWORDP = new pf_keywordp();

	// ### make-symbol
	public static Primitive MAKE_SYMBOL = new pf_make_symbol();

	// ### makunbound
	public static Primitive MAKUNBOUND = new pf_makunbound();

	// ### eql
	static Primitive EQL = new pf_eql();

	// ### list-delete-eq item list => result-list
	static Primitive LIST_DELETE_EQ = new pf_list_delete_eq();

	// ### list-delete-eql item list => result-list
	static Primitive LIST_DELETE_EQL = new pf_list_delete_eql();

	// ### identity
	private static Primitive IDENTITY = new pf_identity();

	// ### compiled-function-p
	private static Primitive COMPILED_FUNCTION_P = new pf_compiled_function_p();

	// ### consp
	private static Primitive CONSP = new pf_consp();

	// ### listp
	private static Primitive LISTP = new pf_listp();

	// ### abs
	private static Primitive ABS = new pf_abs();

	@NoInline
	// ### %eval
	private static Primitive _EVAL = new pf__eval();

	// ### eq
	private static Primitive EQ = new pf_eq();

	// ### equal
	private static Primitive EQUAL = new pf_equal();

	// ### equalp
	private static Primitive EQUALP = new pf_equalp();

	// ### values
	private static Primitive VALUES = new pf_values();

	// ### values-list list => element*
	// Returns the elements of the list as multiple values.
	private static Primitive VALUES_LIST = new pf_values_list();

	// ### cons
	private static Primitive CONS = new pf_cons();

	@NoInline
	// ### length
	private static Primitive _LENGTH = new pf__length();

	// ### length
	private static Primitive LENGTH = new pf_length();

	// ### elt
	private static Primitive ELT = new pf_elt();

	@NoInline
	// ### %elt
	private static Primitive _ELT = new pf__elt();

	// ### atom
	private static Primitive ATOM = new pf_atom();

	// ### constantp
	private static Primitive CONSTANTP = new pf_constantp();

	// ### functionp
	private static Primitive FUNCTIONP = new pf_functionp();

	// ### special-operator-p
	private static Primitive SPECIAL_OPERATOR_P = new pf_special_operator_p();

	// ### symbolp
	private static Primitive SYMBOLP = new pf_symbolp();

	// ### endp
	private static Primitive ENDP = new pf_endp();

	// ### null
	private static Primitive NULL = new pf_null();

	// ### not
	private static Primitive NOT = new pf_not();

	// ### plusp
	private static Primitive PLUSP = new pf_plusp();

	// ### minusp
	private static Primitive MINUSP = new pf_minusp();

	// ### zerop
	private static Primitive ZEROP = new pf_zerop();

	// ### fixnump
	private static Primitive FIXNUMP = new pf_fixnump();

	// ### symbol-value
	private static Primitive SYMBOL_VALUE = new pf_symbol_value();

	// ### set symbol value => value
	private static Primitive SET = new pf_set();

	// ### rplaca
	private static Primitive RPLACA = new pf_rplaca();

	// ### rplacd
	private static Primitive RPLACD = new pf_rplacd();

	// ### +
	private static Primitive ADD = new pf_add();

	// ### 1+
	private static Primitive ONE_PLUS = new pf_one_plus();

	// ### -
	private static Primitive SUBTRACT = new pf_subtract();

	// ### 1-
	private static Primitive ONE_MINUS = new pf_one_minus();

	// ### when
	private static SpecialOperator WHEN = new sf_when();

	// ### unless
	private static SpecialOperator UNLESS = new sf_unless();

	// ### %stream-output-object object stream => object
	private static Primitive _STREAM_OUTPUT_OBJECT = new pf__stream_output_object();

	// ### %output-object object stream => object
	private static Primitive _OUTPUT_OBJECT = new pf__output_object();

	// ### %write-to-string object => string
	private static Primitive _WRITE_TO_STRING = new pf__write_to_string();

	// ### %stream-terpri output-stream => nil
	private static Primitive _STREAM_TERPRI = new pf__stream_terpri();

	// ### %terpri output-stream => nil
	private static Primitive _TERPRI = new pf__terpri();

	// ### %fresh-line
	// %fresh-line &optional output-stream => generalized-boolean
	private static Primitive _FRESH_LINE = new pf__fresh_line();

	// ### boundp
	// Determines only whether a symbol has a value in the global environment;
	// any lexical bindings are ignored.
	private static Primitive BOUNDP = new pf_boundp();

	// ### fboundp
	private static Primitive FBOUNDP = new pf_fboundp();

	// ### fmakunbound name => name
	private static Primitive FMAKUNBOUND = new pf_fmakunbound();

	@NoInline
	// ### setf-function-name-p
	private static Primitive SETF_FUNCTION_NAME_P = new pf_setf_function_name_p();

	// ### remprop
	private static Primitive REMPROP = new pf_remprop();

	// ### nconc
	private static Primitive NCONC = new pf_nconc();

	// ### =
	// Numeric equality.
	private static Primitive EQUALS = new pf_equals();

	// ### /=
	// Returns true if no two numbers are the same; otherwise returns false.
	private static Primitive NOT_EQUALS = new pf_not_equals();

	// ### <
	// Numeric comparison.
	private static Primitive LT = new pf_lt();

	// ### <=
	private static Primitive LE = new pf_le();

	// ### >
	private static Primitive GT = new pf_gt();

	// ### >=
	private static Primitive GE = new pf_ge();

	// ### nth n list => object
	private static Primitive NTH = new pf_nth();

	// ### %set-nth n list new-object => new-object
	private static Primitive _SET_NTH = new pf__set_nth();

	// ### nthcdr
	private static Primitive NTHCDR = new pf_nthcdr();

	/** Stub to be replaced later when signal.lisp has been loaded. */
	// ### error
	@NoInline
	private static Primitive ERROR = new pf_error();

	/** Stub replaced when compiler-pass2.lisp has been loaded */
	// ### autocompile
	@NoInline
	private static Primitive AUTOCOMPILE = new pf_autocompile();

	// ### signal
	/**
	 * Placeholder function, to be replaced by the function defined in
	 * signal.lisp Calling this function is an error: we're not set up for
	 * signalling yet.
	 */
	@NoInline
	private static Primitive SIGNAL = new pf_signal();

	// ### undefined-function-called
	// Redefined in restart.lisp.
	@NoInline
	private static Primitive UNDEFINED_FUNCTION_CALLED = new pf_undefined_function_called();

	// ### %format
	@NoInline
	private static Primitive _FORMAT = new pf__format();

	private static SubLSymbol _SIMPLE_FORMAT_FUNCTION_ = Lisp.internSpecial("*SIMPLE-FORMAT-FUNCTION*",
			Lisp.PACKAGE_SYS, Primitives._FORMAT);

	// ### %defun name definition => name
	@NoInline
	private static Primitive _DEFUN = new pf__defun();

	// ### fdefinition-block-name
	@NoInline
	private static Primitive FDEFINITION_BLOCK_NAME = new pf_fdefinition_block_name();

	// ### macro-function
	private static Primitive MACRO_FUNCTION = new pf_macro_function();

	// ### defmacro
	@NoInline
	private static SpecialOperator DEFMACRO = new sf_defmacro();

	// ### make-macro
	@NoInline
	private static Primitive MAKE_MACRO = new pf_make_macro();

	// ### macro-function-p
	private static Primitive MACRO_FUNCTION_P = new pf_macro_function_p();

	// ### make-symbol-macro
	@NoInline
	private static Primitive MAKE_SYMBOL_MACRO = new pf_make_symbol_macro();

	// ### symbol-macro-p
	private static Primitive SYMBOL_MACRO_P = new pf_symbol_macro_p();

	// ### %defparameter
	@NoInline
	private static Primitive _DEFPARAMETER = new pf__defparameter();

	// ### %defvar
	private static Primitive _DEFVAR = new pf__defvar();

	// ### %defconstant name initial-value documentation => name
	private static Primitive _DEFCONSTANT = new pf__defconstant();

	// ### cond
	private static SpecialOperator COND = new sf_cond();

	// ### case
	private static SpecialOperator CASE = new sf_case();

	// ### ecase
	private static SpecialOperator ECASE = new sf_ecase();

	// @NoInline
	// ### type-of
	private static Primitive TYPE_OF = new pf_type_of();

	// ### class-of
	@NoInline
	private static Primitive CLASS_OF = new pf_class_of();

	// ### simple-typep
	private static Primitive SIMPLE_TYPEP = new pf_simple_typep();

	// ### function-lambda-expression function =>
	// lambda-expression, closure-p, name
	private static Primitive FUNCTION_LAMBDA_EXPRESSION = new pf_function_lambda_expression();

	// ### mapcar
	private static Primitive MAPCAR = new pf_mapcar();

	// ### mapc
	private static Primitive MAPC = new pf_mapc();

	@NoInline
	// ### macroexpand
	private static Primitive MACROEXPAND = new pf_macroexpand();

	@NoInline
	// ### macroexpand-1
	private static Primitive MACROEXPAND_1 = new pf_macroexpand_1();

	// ### gensym
	private static Primitive GENSYM = new pf_gensym();

	// ### string
	private static Primitive STRING = new pf_string();

	// ### intern string &optional package => symbol, status
	// STATUS is one of :INHERITED, :EXTERNAL, :INTERNAL or NIL.
	// "It is implementation-dependent whether the string that becomes the new
	// symbol's name is the given string or a copy of it."
	private static Primitive INTERN = new pf_intern();

	// ### unintern
	// unintern symbol &optional package => generalized-boolean
	private static Primitive UNINTERN = new pf_unintern();

	// ### find-package
	private static Primitive FIND_PACKAGE = new pf_find_package();

	// ### %make-package
	// %make-package package-name nicknames use => package
	private static Primitive _MAKE_PACKAGE = new pf__make_package();

	@NoInline

	// ### %in-package
	private static Primitive _IN_PACKAGE = new pf__in_package();

	@NoInline

	// ### use-package packages-to-use &optional package => t
	private static Primitive USE_PACKAGE = new pf_use_package();

	// ### package-symbols
	private static Primitive PACKAGE_SYMBOLS = new pf_package_symbols();

	@NoInline

	// ### package-internal-symbols
	private static Primitive PACKAGE_INTERNAL_SYMBOLS = new pf_package_internal_symbols();

	@NoInline

	// ### package-external-symbols
	private static Primitive PACKAGE_EXTERNAL_SYMBOLS = new pf_package_external_symbols();

	@NoInline

	// ### package-inherited-symbols
	private static Primitive PACKAGE_INHERITED_SYMBOLS = new pf_package_inherited_symbols();

	@NoInline

	// ### export symbols &optional package
	private static Primitive EXPORT = new pf_export();

	@NoInline

	// ### find-symbol string &optional package => symbol, status
	private static Primitive FIND_SYMBOL = new pf_find_symbol();

	@NoInline

	// ### fset name function &optional source-position arglist documentation
	// => function
	private static Primitive FSET = new pf_fset();

	@NoInline

	// ### %set-symbol-plist
	private static Primitive _SET_SYMBOL_PLIST = new pf__set_symbol_plist();

	@NoInline

	// ### getf plist indicator &optional default => value
	private static Primitive GETF = new pf_getf();

	@NoInline

	// ### get symbol indicator &optional default => value
	private static Primitive GET = new pf_get();

	@NoInline

	// ### put symbol indicator value => value
	private static Primitive PUT = new pf_put();

	@NoInline

	// ### macrolet
	private static SpecialOperator MACROLET = new sf_macrolet();

	@NoInline

	private static Primitive MAKE_EXPANDER_FOR_MACROLET = new pf_make_expander_for_macrolet();

	@NoInline

	// ### tagbody
	private static SpecialOperator TAGBODY = new sf_tagbody();

	@NoInline

	// ### go
	private static SpecialOperator GO = new sf_go();

	@NoInline
	// ### block
	private static SpecialOperator BLOCK = new sf_block();

	@NoInline
	// ### return-from
	private static SpecialOperator RETURN_FROM = new sf_return_from();

	@NoInline
	// ### catch
	private static SpecialOperator CATCH = new sf_catch();

	@NoInline

	// ### throw
	private static SpecialOperator THROW = new sf_throw();

	// ### unwind-protect
	private static SpecialOperator UNWIND_PROTECT = new sf_unwind_protect();

	// ### eval-when
	private static SpecialOperator EVAL_WHEN = new sf_eval_when();

	// ### multiple-value-bind
	// multiple-value-bind (var*) values-form declaration* form*
	// Should be a macro.
	private static SpecialOperator MULTIPLE_VALUE_BIND = new sf_multiple_value_bind();

	// ### multiple-value-prog1
	private static SpecialOperator MULTIPLE_VALUE_PROG1 = new sf_multiple_value_prog1();

	// ### multiple-value-call
	private static SpecialOperator MULTIPLE_VALUE_CALL = new sf_multiple_value_call();

	// ### and
	// Should be a macro.
	private static SpecialOperator AND = new sf_and();

	// ### or
	// Should be a macro.
	private static SpecialOperator OR = new sf_or();

	// ### multiple-value-list form => list
	// Evaluates form and creates a list of the multiple values it returns.
	// Should be a macro.
	private static SpecialOperator MULTIPLE_VALUE_LIST = new sf_multiple_value_list();

	// ### nth-value n form => object
	// Evaluates n and then form and returns the nth value returned by form, or
	// NIL if n >= number of values returned.
	// Should be a macro.
	private static SpecialOperator NTH_VALUE = new sf_nth_value();

	// ### call-count
	private static Primitive CALL_COUNT = new pf_call_count();

	// ### set-call-count
	private static Primitive SET_CALL_COUNT = new pf_set_call_count();

	// ### hot-count
	private static Primitive HOT_COUNT = new pf_hot_count();

	// ### set-hot-count
	private static Primitive SET_HOT_COUNT = new pf_set_hot_count();

	// ### lambda-name
	private static Primitive LAMBDA_NAME = new pf_lambda_name();

	// ### %set-lambda-name
	private static Primitive _SET_LAMBDA_NAME = new pf__set_lambda_name();

	// ### subseq sequence start &optional end
	private static Primitive SUBSEQ = new pf_subseq();

	@InlineSymbol
	// ### list
	private static Primitive LIST = new pf_list();

	// ### list*
	private static Primitive LIST_STAR = new pf_list_star();

	// ### nreconc
	private static Primitive NRECONC = new pf_nreconc();

	// ### reverse
	private static Primitive REVERSE = new pf_reverse();

	// ### delete-eq item sequence => result-sequence
	private static Primitive DELETE_EQ = new pf_delete_eq();

	// ### delete-eql item seqluence => result-seqluence
	private static Primitive DELETE_EQL = new pf_delete_eql();

	// ### %set-elt
	// %setelt sequence index newval => newval
	private static Primitive _SET_ELT = new pf__set_elt();

	// ### %make-list
	private static Primitive _MAKE_LIST = new pf__make_list();

	// ### %member item list key test test-not => tail
	private static Primitive _MEMBER = new pf__member();

	// ### funcall-key function-or-nil element
	private static Primitive FUNCALL_KEY = new pf_funcall_key();

	// ### coerce-to-function
	private static Primitive COERCE_TO_FUNCTION = new pf_coerce_to_function();

	// ### make-closure lambda-form environment => closure
	private static Primitive MAKE_CLOSURE = new pf_make_closure();

	// ### streamp
	private static Primitive STREAMP = new pf_streamp();

	// ### integerp
	private static Primitive INTEGERP = new pf_integerp();

	// ### evenp
	private static Primitive EVENP = new pf_evenp();

	// ### oddp
	private static Primitive ODDP = new pf_oddp();

	// ### numberp
	private static Primitive NUMBERP = new pf_numberp();

	// ### realp
	private static Primitive REALP = new pf_realp();

	// ### rationalp
	private static Primitive RATIONALP = new pf_rationalp();

	// ### complex
	private static Primitive COMPLEX = new pf_complex();

	// ### complexp
	private static Primitive COMPLEXP = new pf_complexp();

	// ### numerator
	private static Primitive NUMERATOR = new pf_numerator();

	// ### denominator
	private static Primitive DENOMINATOR = new pf_denominator();

	// ### realpart
	private static Primitive REALPART = new pf_realpart();

	// ### imagpart
	private static Primitive IMAGPART = new pf_imagpart();

	// ### integer-length
	private static Primitive INTEGER_LENGTH = new pf_integer_length();

	// ### gcd-2
	private static Primitive GCD_2 = new pf_gcd_2();

	// ### identity-hash-code
	private static Primitive IDENTITY_HASH_CODE = new pf_identity_hash_code();

	// ### uptime
	private static Primitive UPTIME = new pf_uptime();

	// ### built-in-function-p
	private static Primitive BUILT_IN_FUNCTION_P = new pf_built_in_function_p();

	// ### inspected-parts
	private static Primitive INSPECTED_PARTS = new pf_inspected_parts();

	// ### inspected-description
	private static Primitive INSPECTED_DESCRIPTION = new pf_inspected_description();

	// ### %class-name
	private static Primitive _CLASS_NAME = new pf__class_name();

	// ### %set-class-name
	private static Primitive _SET_CLASS_NAME = new pf__set_class_name();

	// ### class-layout
	@NoInline
	private static Primitive CLASS_LAYOUT = new pf_class_layout();

	// ### %set-class-layout
	private static Primitive _SET_CLASS_LAYOUT = new pf__set_class_layout();

	// ### class-direct-superclasses
	private static Primitive CLASS_DIRECT_SUPERCLASSES = new pf_class_direct_superclasses();

	// ### %set-class-direct-superclasses
	private static Primitive _SET_CLASS_DIRECT_SUPERCLASSES = new pf__set_class_direct_superclasses();

	// ### class-direct-subclasses
	private static Primitive CLASS_DIRECT_SUBCLASSES = new pf_class_direct_subclasses();

	// ### %set-class-direct-subclasses
	private static Primitive _SET_CLASS_DIRECT_SUBCLASSES = new pf__set_class_direct_subclasses();

	// ### %class-precedence-list
	private static Primitive _CLASS_PRECEDENCE_LIST = new pf__class_precedence_list();

	// ### set-class-precedence-list
	private static Primitive SET_CLASS_PRECEDENCE_LIST = new pf_set_class_precedence_list();

	// ### class-direct-methods
	private static Primitive CLASS_DIRECT_METHODS = new pf_class_direct_methods();

	// ### %set-class-direct-methods
	@NoInline
	private static Primitive _SET_CLASS_DIRECT_METHODS = new pf__set_class_direct_methods();

	// ### class-documentation
	private static Primitive CLASS_DOCUMENTATION = new pf_class_documentation();

	// ### %set-class-documentation
	private static Primitive _SET_CLASS_DOCUMENTATION = new pf__set_class_documentation();

	// ### class-finalized-p
	private static Primitive CLASS_FINALIZED_P = new pf_class_finalized_p();

	// ### %set-class-finalized-p
	private static Primitive _SET_CLASS_FINALIZED_P = new pf__set_class_finalized_p();

	// ### classp
	private static Primitive CLASSP = new pf_classp();

	// ### char-to-utf8 char => octets
	private static Primitive CHAR_TO_UTF8 = new pf_char_to_utf8();

	// ### %documentation
	private static Primitive _DOCUMENTATION = new pf__documentation();

	// ### %set-documentation
	private static Primitive _SET_DOCUMENTATION = new pf__set_documentation();

	// ### %putf
	private static Primitive _PUTF = new pf__putf();

	// ### function-plist
	private static Primitive FUNCTION_PLIST = new pf_function_plist();

	// ### make-keyword
	private static Primitive MAKE_KEYWORD = new pf_make_keyword();

	// ### standard-object-p object => generalized-boolean
	private static Primitive STANDARD_OBJECT_P = new pf_standard_object_p();

	// ### copy-tree
	private static Primitive COPY_TREE = new JavaPrimitive(LispSymbols.COPY_TREE, "object") {

		public SubLObject execute(SubLObject arg) {
			return Primitives.COPY_TREE_execute(arg);
		}
	};

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(Primitives.class);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject _pf_elt_execute(SubLObject first, SubLObject second) {
		return first.elt(second.intValue());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject _pf_length_execute(SubLObject arg) {
		return arg.LENGTH();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 */
	static void checkRedefinition(SubLObject arg) {
		final LispThread thread = LispThread.currentThread();
		if (Lisp._WARN_ON_REDEFINITION_.symbolValue(thread) != Lisp.NIL)
			if (arg instanceof SubLSymbol) {
				SubLObject oldDefinition = arg.getSymbolFunction();
				if (oldDefinition != null && !(oldDefinition instanceof Autoload)
						&& !(oldDefinition instanceof AutoloadedFunctionProxy)) {
					SubLObject oldSource = Extensions.SOURCE_PATHNAME.execute(arg);
					SubLObject currentSource = Lisp._SOURCE_.symbolValue(thread);
					if (currentSource == Lisp.NIL)
						currentSource = Keyword.TOP_LEVEL;
					if (oldSource != Lisp.NIL)
						if (currentSource.equal(oldSource))
							return;
					if (currentSource == Keyword.TOP_LEVEL)
						LispSymbols.STYLE_WARN.execute(LispObjectFactory.makeString("redefining ~S at top level"), arg);
					else {
						SpecialBindingsMark mark = thread.markSpecialBindings();
						thread.bindSpecial(LispSymbols._PACKAGE_, Lisp.PACKAGE_CL);
						try {
							LispSymbols.STYLE_WARN.execute(LispObjectFactory.makeString("redefining ~S in ~S"), arg,
									currentSource);
						} finally {
							thread.resetSpecialBindings(mark);
						}
					}
				}
			}
	}

	static public SubLObject COPY_TREE_execute(SubLObject arg) {
		if (arg instanceof SubLCons) {
			SubLCons cons = (SubLCons) arg;
			return LispObjectFactory.makeCons(Primitives.COPY_TREE_execute(cons.first()),
					Primitives.COPY_TREE_execute(cons.rest()));
		} else
			return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param list
	 *            Description of Parameter
	 * @param start
	 *            Description of Parameter
	 * @param end
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static SubLObject list_subseq(SubLObject list, int start, int end) {
		int index = 0;
		SubLObject result = Lisp.NIL;
		while (list != Lisp.NIL) {
			if (end >= 0 && index == end)
				return result.nreverse();
			if (index++ >= start)
				result = LispObjectFactory.makeCons(list.first(), result);
			list = list.rest();
		}
		return result.nreverse();
	}

	private static SubLObject num_args_err() {
		// TODO Auto-generated method stub
		return Lisp.error(new WrongNumberOfArgumentsException("num_args_err"));
	}

	/**
	 * Description of the Method
	 *
	 * @param s
	 *            Description of Parameter
	 * @param destination
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static private SubLObject outputFormattedString(String s, SubLObject destination) {
		if (destination == Lisp.T) {
			Lisp.checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue())._writeString(s);
			return Lisp.NIL;
		}
		if (destination == Lisp.NIL)
			return LispObjectFactory.makeString(s);
		if (destination instanceof TwoWayStream) {
			LispStream out = ((TwoWayStream) destination).getOutputStream();
			if (out instanceof LispStream) {
				out._writeString(s);
				return Lisp.NIL;
			}
			Lisp.error(
					new TypeError("The value " + destination.writeToString() + " is not a character output stream."));
		}
		if (destination instanceof LispStream) {
			((LispStream) destination)._writeString(s);
			return Lisp.NIL;
		}
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__class_name_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getLispClassName();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__class_precedence_list_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getCPL();
	}

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
	static public SubLObject pf__defconstant_execute(SubLObject first, SubLObject second, SubLObject third) {
		final SubLSymbol symbol;
		symbol = Lisp.checkSymbol(first);
		if (third != Lisp.NIL)
			if (third instanceof SubLString)
				symbol.setDocumentation(LispSymbols.VARIABLE, third);
			else
				return Lisp.type_error(third, LispSymbols.STRING);
		symbol.initializeConstant(second);
		return symbol;
	}

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
	static public SubLObject pf__defparameter_execute(SubLObject first, SubLObject second, SubLObject third) {
		final SubLSymbol symbol;
		symbol = Lisp.checkSymbol(first);
		if (third instanceof SubLString)
			symbol.setDocumentation(LispSymbols.VARIABLE, third);
		else if (third != Lisp.NIL)
			Lisp.type_error(third, LispSymbols.STRING);
		symbol.initializeSpecial(second);
		return symbol;
	}

	/**
	 * Description of the Method
	 *
	 * @param name
	 *            Description of Parameter
	 * @param definition
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__defun_execute(SubLObject name, SubLObject definition) {
		if (name instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) name;
			if (symbol.getSymbolFunction() instanceof SpecialOperator) {
				String message = symbol.getJavaSymbolName() + " is a special operator and may not be redefined.";
				return Lisp.error(new ProgramError(message));
			}
		} else if (!Lisp.isValidSetfFunctionName(name))
			return Lisp.type_error(name, Lisp.FUNCTION_NAME);
		if (definition instanceof Function) {
			LispSymbols.FSET.execute(name, definition, Lisp.NIL, ((Function) definition).getLambdaList());
			return name;
		}
		return Lisp.type_error(definition, LispSymbols.FUNCTION);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__defvar_execute(SubLObject arg) {
		final SubLSymbol symbol;
		symbol = Lisp.checkSymbol(arg);
		symbol.setSpecial(true);
		return symbol;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__defvar_execute(SubLObject first, SubLObject second) {
		final SubLSymbol symbol;
		symbol = Lisp.checkSymbol(first);
		symbol.initializeSpecial(second);
		return symbol;
	}

	/**
	 * Description of the Method
	 *
	 * @param object
	 *            Description of Parameter
	 * @param docType
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__documentation_execute(SubLObject object, SubLObject docType) {
		SubLObject doc = object.getDocumentation(docType);
		if (doc == Lisp.NIL)
			if (docType == LispSymbols.FUNCTION && object instanceof SubLSymbol) {
				SubLObject function = object.getSymbolFunction();
				if (function != null)
					doc = function.getDocumentation(docType);
			}
		return doc;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@NoInline
	static public SubLObject pf__eval_execute(SubLObject arg) {
		return Lisp.eval(arg, new Environment(), LispThread.currentThread());
	}

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
	static public SubLObject pf__format_execute(SubLObject first, SubLObject second, SubLObject third) {
		SubLObject destination = first;
		// Copy remaining arguments.
		SubLObject[] _args = LispObjectFactory.makeLispObjectArray(2);
		_args[0] = second;
		_args[1] = third;
		String s = Primitives.static__format(_args);
		return Primitives.outputFormattedString(s, destination);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__format_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth) {
		SubLObject destination = first;
		// Copy remaining arguments.
		SubLObject[] _args = LispObjectFactory.makeLispObjectArray(3);
		_args[0] = second;
		_args[1] = third;
		_args[2] = fourth;
		String s = Primitives.static__format(_args);
		return Primitives.outputFormattedString(s, destination);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__format_execute(SubLObject[] args) {
		if (args.length < 2)
			return Primitives.num_args_err();
		SubLObject destination = args[0];
		// Copy remaining arguments.
		SubLObject[] _args = new SubLObject[args.length - 1];
		for (int i = 0; i < _args.length; i++)
			_args[i] = args[i + 1];
		String s = Primitives.static__format(_args);
		return Primitives.outputFormattedString(s, destination);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__fresh_line_execute(SubLObject arg) {
		if (arg == Lisp.T)
			arg = LispSymbols.TERMINAL_IO.symbolValue();
		else if (arg == Lisp.NIL)
			arg = LispSymbols.STANDARD_OUTPUT.symbolValue();
		final LispStream stream;
		stream = Lisp.checkStream(arg);
		return stream.freshLine();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__in_package_execute(SubLObject arg) {
		final String packageName = Lisp.javaString(arg);
		final SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg == null)
			return Lisp.error(new PackageError("The name " + packageName + " does not designate any package."));
		SpecialBinding binding = LispThread.currentThread().getSpecialBinding(LispSymbols._PACKAGE_);
		if (binding != null)
			binding.value = pkg;
		else
			// No dynamic binding.
			LispSymbols._PACKAGE_.setSymbolValue(pkg);
		return pkg;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__make_list_execute(SubLObject first, SubLObject second) {
		int size = first.intValue();
		if (size < 0)
			return Lisp.type_error(first,
					Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO, LispSymbols.MOST_POSITIVE_FIXNUM.getSymbolValue()));
		SubLObject result = Lisp.NIL;
		for (int i = size; i-- > 0;)
			result = LispObjectFactory.makeCons(second, result);
		return result;
	}

	/**
	 * This invocation is solely used to be able to create a package to bind to
	 * *FASL-ANONYMOUS-PACKAGE*
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__make_package_execute() {
		return new SubLPackage();
	}

	/**
	 * This invocation is used by MAKE-PACKAGE to create a package
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__make_package_execute(SubLObject first, SubLObject second, SubLObject third) {
		String packageName = Lisp.javaString(first);
		SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg != null)
			Lisp.error(new LispError("Package " + packageName + " already exists."));
		SubLObject nicknames = Lisp.checkList(second);
		if (nicknames != Lisp.NIL) {
			SubLObject list = nicknames;
			while (list != Lisp.NIL) {
				String nick = Lisp.javaString(list.first());
				if (LispPackages.findPackage(nick) != null)
					Lisp.error(new PackageError("A package named " + nick + " already exists."));
				list = list.rest();
			}
		}
		SubLObject use = Lisp.checkList(third);
		if (use != Lisp.NIL) {
			SubLObject list = use;
			while (list != Lisp.NIL) {
				SubLObject obj = list.first();
				if (obj instanceof SubLPackage) {
					// OK.
				} else {
					String s = Lisp.javaString(obj);
					SubLPackage p = LispPackages.findPackage(s);
					if (p == null) {
						Lisp.error(new LispError(obj.writeToString() + " is not the name of a package."));
						return Lisp.NIL;
					}
				}
				list = list.rest();
			}
		}
		// Now create the package.
		pkg = LispPackages.createPackage(packageName);
		// Add the nicknames.
		while (nicknames != Lisp.NIL) {
			String nick = Lisp.javaString(nicknames.first());
			pkg.addNickname(nick);
			nicknames = nicknames.rest();
		}
		// Create the use list.
		while (use != Lisp.NIL) {
			SubLObject obj = use.first();
			if (obj instanceof SubLPackage)
				pkg.usePackage((SubLPackage) obj);
			else {
				String s = Lisp.javaString(obj);
				SubLPackage p = LispPackages.findPackage(s);
				if (p == null) {
					Lisp.error(new LispError(obj.writeToString() + " is not the name of a package."));
					return Lisp.NIL;
				}
				pkg.usePackage(p);
			}
			use = use.rest();
		}
		return pkg;
	}

	/**
	 * Description of the Method
	 *
	 * @param item
	 *            Description of Parameter
	 * @param list
	 *            Description of Parameter
	 * @param key
	 *            Description of Parameter
	 * @param test
	 *            Description of Parameter
	 * @param testNot
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__member_execute(SubLObject item, SubLObject list, SubLObject key, SubLObject test,
			SubLObject testNot) {
		SubLObject tail = Lisp.checkList(list);
		if (test != Lisp.NIL && testNot != Lisp.NIL)
			Lisp.error(new LispError("MEMBER: test and test-not both supplied"));
		if (testNot == Lisp.NIL)
			if (test == Lisp.NIL || test == LispSymbols.EQL)
				test = Primitives.EQL;
		if (key == Lisp.NIL) {
			if (test == Primitives.EQL)
				while (tail instanceof SubLCons) {
					if (item.eql(((SubLCons) tail).first()))
						return tail;
					tail = ((SubLCons) tail).rest();
				}
			else if (test != Lisp.NIL)
				while (tail instanceof SubLCons) {
					SubLObject candidate = ((SubLCons) tail).first();
					if (test.execute(item, candidate) != Lisp.NIL)
						return tail;
					tail = ((SubLCons) tail).rest();
				}
			else
				// test == NIL
				while (tail instanceof SubLCons) {
				SubLObject candidate = ((SubLCons) tail).first();
				if (testNot.execute(item, candidate) == Lisp.NIL)
				return tail;
				tail = ((SubLCons) tail).rest();
				}
		} else
			// key != NIL
			while (tail instanceof SubLCons) {
			SubLObject candidate = key.execute(((SubLCons) tail).first());
			if (test != Lisp.NIL) {
			if (test.execute(item, candidate) != Lisp.NIL)
			return tail;
			} else if (testNot.execute(item, candidate) == Lisp.NIL)
			return tail;
			tail = ((SubLCons) tail).rest();
			}
		if (tail != Lisp.NIL)
			Lisp.type_error(tail, LispSymbols.LIST);
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__output_object_execute(SubLObject first, SubLObject second) {
		final SubLObject out;
		if (second == Lisp.T)
			out = LispSymbols.TERMINAL_IO.symbolValue();
		else if (second == Lisp.NIL)
			out = LispSymbols.STANDARD_OUTPUT.symbolValue();
		else
			out = second;
		Lisp.checkStream(out)._writeString(first.writeToString());
		return first;
	}

	/**
	 * Description of the Method
	 *
	 * @param plist
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @param newValue
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__putf_execute(SubLObject plist, SubLObject indicator, SubLObject newValue) {
		return Lisp.putf(plist, indicator, newValue);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_direct_methods_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setDirectMethods(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_direct_subclasses_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setDirectSubclasses(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_direct_superclasses_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setDirectSuperclasses(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_documentation_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setDocumentation(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_finalized_p_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setFinalized(second != Lisp.NIL);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_layout_execute(SubLObject first, SubLObject second) {
		if (second instanceof Layout) {
			Lisp.checkClass(first).setClassLayout((Layout) second);
			return second;
		}
		return Lisp.type_error(second, LispSymbols.LAYOUT);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_class_name_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setLispClassName(Lisp.checkSymbol(second));
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param object
	 *            Description of Parameter
	 * @param docType
	 *            Description of Parameter
	 * @param documentation
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_documentation_execute(SubLObject object, SubLObject docType,
			SubLObject documentation) {
		object.setDocumentation(docType, documentation);
		return documentation;
	}

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
	static public SubLObject pf__set_elt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first instanceof AbstractVector) {
			((AbstractVector) first).aset(second.intValue(), third);
			return third;
		}
		if (first instanceof SubLCons) {
			int index = second.intValue();
			if (index < 0)
				Lisp.error(new TypeError());
			SubLObject list = first;
			int i = 0;
			while (true) {
				if (i == index) {
					list.setCar(third);
					return third;
				}
				list = list.rest();
				if (list == Lisp.NIL)
					Lisp.error(new TypeError());
				++i;
			}
		}
		return Lisp.type_error(first, LispSymbols.SEQUENCE);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_lambda_name_execute(SubLObject first, SubLObject second) {
		if (first instanceof Operator) {
			((Operator) first).setLambdaName(second);
			return second;
		}
		if (first instanceof StandardGenericFunction) {
			((StandardGenericFunction) first).setGenericFunctionName(second);
			return second;
		}
		return Lisp.type_error(first, LispSymbols.FUNCTION);
	}

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
	static public SubLObject pf__set_nth_execute(SubLObject first, SubLObject second, SubLObject third) {
		int index = first.intValue();
		if (index < 0)
			Lisp.error(new TypeError("(SETF NTH): invalid index " + index + "."));
		int i = 0;
		while (true) {
			if (i == index) {
				second.setCar(third);
				return third;
			}
			second = second.rest();
			if (second == Lisp.NIL)
				return Lisp.error(new LispError("(SETF NTH): the index " + index + "is too large."));
			++i;
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_symbol_function_execute(SubLObject first, SubLObject second) {
		Lisp.checkSymbol(first).setSymbolFunction(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__set_symbol_plist_execute(SubLObject first, SubLObject second) {
		Lisp.checkSymbol(first).setPropertyList(Lisp.checkList(second));
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__stream_output_object_execute(SubLObject first, SubLObject second) {
		Lisp.checkStream(second)._writeString(first.writeToString());
		return first;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__stream_terpri_execute(SubLObject arg) {
		Lisp.checkStream(arg)._writeChar('\n');
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__terpri_execute(SubLObject arg) {
		if (arg == Lisp.T)
			arg = LispSymbols.TERMINAL_IO.symbolValue();
		else if (arg == Lisp.NIL)
			arg = LispSymbols.STANDARD_OUTPUT.symbolValue();
		final LispStream stream;
		stream = Lisp.checkStream(arg);
		return stream.terpri();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf__write_to_string_execute(SubLObject arg) {
		return LispObjectFactory.makeString(arg.writeToString());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_abs_execute(SubLObject arg) {
		return arg.ABS();
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_add_execute() {
		return Fixnum.ZERO;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_add_execute(SubLObject arg) {
		if (arg.isNumber())
			return arg;
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_add_execute(SubLObject first, SubLObject second) {
		return first.add(second);
	}

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
	static public SubLObject pf_add_execute(SubLObject first, SubLObject second, SubLObject third) {
		return first.add(second).add(third);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_add_execute(SubLObject[] args) {
		SubLObject result = Fixnum.ZERO;
		final int length = args.length;
		for (int i = 0; i < length; i++)
			result = result.add(args[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_append_execute() {
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_append_execute(SubLObject arg) {
		return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_append_execute(SubLObject first, SubLObject second) {
		if (first == Lisp.NIL)
			return second;
		// APPEND is required to copy its first argument.
		SubLCons result = LispObjectFactory.makeCons(first.first());
		SubLCons splice = result;
		first = first.rest();
		while (first != Lisp.NIL) {
			SubLCons temp = LispObjectFactory.makeCons(first.first());
			splice.setCdr(temp);
			splice = temp;
			first = first.rest();
		}
		splice.setCdr(second);
		return result;
	}

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
	static public SubLObject pf_append_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first == Lisp.NIL)
			return Primitives.pf_append_execute(second, third);
		SubLCons result = LispObjectFactory.makeCons(first.first());
		SubLCons splice = result;
		first = first.rest();
		while (first != Lisp.NIL) {
			SubLCons temp = LispObjectFactory.makeCons(first.first());
			splice.setCdr(temp);
			splice = temp;
			first = first.rest();
		}
		while (second != Lisp.NIL) {
			SubLCons temp = LispObjectFactory.makeCons(second.first());
			splice.setCdr(temp);
			splice = temp;
			second = second.rest();
		}
		splice.setCdr(third);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_append_execute(SubLObject[] args) {
		SubLCons result = null;
		SubLCons splice = null;
		final int limit = args.length - 1;
		int i;
		for (i = 0; i < limit; i++) {
			SubLObject top = args[i];
			if (top == Lisp.NIL)
				continue;
			result = LispObjectFactory.makeCons(top.first());
			splice = result;
			top = top.rest();
			while (top != Lisp.NIL) {
				SubLCons temp = LispObjectFactory.makeCons(top.first());
				splice.setCdr(temp);
				splice = temp;
				top = top.rest();
			}
			break;
		}
		if (result == null)
			return args[i];
		for (++i; i < limit; i++) {
			SubLObject top = args[i];
			while (top != Lisp.NIL) {
				SubLCons temp = LispObjectFactory.makeCons(top.first());
				splice.setCdr(temp);
				splice = temp;
				top = top.rest();
			}
		}
		splice.setCdr(args[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_apply_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_apply_execute(SubLObject arg) {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param fun
	 *            Description of Parameter
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_apply_execute(SubLObject fun, SubLObject args) {
		final LispThread thread = LispThread.currentThread();
		final int length = args.cl_length();
		switch (length) {
		case 0:
			return thread.execute(fun);
		case 1:
			return thread.execute(fun, ((SubLCons) args).first());
		case 2: {
			SubLCons cons = (SubLCons) args;
			return thread.execute(fun, cons.first(), ((SubLCons) cons.rest()).first());
		}
		case 3:
			return thread.execute(fun, args.first(), args.second(), args.rest().rest().first());
		default: {
			final SubLObject[] funArgs = LispObjectFactory.makeLispObjectArray(length);
			int j = 0;
			while (args != Lisp.NIL) {
				funArgs[j++] = args.first();
				args = args.rest();
			}
			return Lisp.funcall(fun, funArgs, thread);
		}
		}
	}

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
	static public SubLObject pf_apply_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (third.isList()) {
			final int numFunArgs = 1 + third.cl_length();
			final SubLObject[] funArgs = LispObjectFactory.makeLispObjectArray(numFunArgs);
			funArgs[0] = second;
			int j = 1;
			while (third != Lisp.NIL) {
				funArgs[j++] = third.first();
				third = third.rest();
			}
			return Lisp.funcall(first, funArgs, LispThread.currentThread());
		}
		return Lisp.type_error(third, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_apply_execute(SubLObject[] args) {
		final int numArgs = args.length;
		SubLObject spread = args[numArgs - 1];
		if (spread.isList()) {
			final int numFunArgs = numArgs - 2 + spread.cl_length();
			final SubLObject[] funArgs = LispObjectFactory.makeLispObjectArray(numFunArgs);
			int j = 0;
			for (int i = 1; i < numArgs - 1; i++)
				funArgs[j++] = args[i];
			while (spread != Lisp.NIL) {
				funArgs[j++] = spread.first();
				spread = spread.rest();
			}
			return Lisp.funcall(args[0], funArgs, LispThread.currentThread());
		}
		return Lisp.type_error(spread, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_atom_execute(SubLObject arg) {
		return arg instanceof SubLCons ? Lisp.NIL : Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param function
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_autocompile_execute(SubLObject function) {
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_boundp_execute(SubLObject arg) {
		final SubLSymbol symbol;
		symbol = Lisp.checkSymbol(arg);
		// PROGV: "If too few values are supplied, the remaining symbols
		// are bound and then made to have no value." So BOUNDP must
		// explicitly check for a binding with no value.
		SpecialBinding binding = LispThread.currentThread().getSpecialBinding(symbol);
		if (binding != null)
			return binding.value != null ? Lisp.T : Lisp.NIL;
		// No binding.
		return symbol.getSymbolValue() != null ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_built_in_function_p_execute(SubLObject arg) {
		return Lisp.checkSymbol(arg).isBuiltInFunction() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_call_count_execute(SubLObject arg) {
		// return Fixnum.getInstance(arg.getCallCount());
		int total = Profiler.getTotals(arg.getCallCount());
		return LispObjectFactory.makeInteger(total);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_char_to_utf8_execute(SubLObject arg) {
		final LispCharacter c;
		c = Lisp.checkCharacter(arg);
		char[] chars = new char[1];
		chars[0] = c.value;
		String s = new String(chars);
		final byte[] bytes;
		try {
			bytes = s.getBytes("UTF8");
		} catch (java.io.UnsupportedEncodingException e) {
			return Lisp.error(new LispError("UTF8 is not a supported encoding."));
		}
		SubLObject[] objects = new SubLObject[bytes.length];
		for (int i = bytes.length; i-- > 0;) {
			int n = bytes[i];
			if (n < 0)
				n += 256;
			objects[i] = LispObjectFactory.makeInteger(n);
		}
		return LispObjectFactory.makeSimpleVector(objects);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_direct_methods_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getDirectMethods();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_direct_subclasses_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getDirectSubclasses();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_direct_superclasses_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getDirectSuperclasses();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_documentation_execute(SubLObject arg) {
		return Lisp.checkClass(arg).getDocumentation();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_finalized_p_execute(SubLObject arg) {
		return Lisp.checkClass(arg).isFinalized() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_layout_execute(SubLObject arg) {
		Layout layout = Lisp.checkClass(arg).getClassLayout();
		return layout != null ? layout : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_class_of_execute(SubLObject arg) {
		return arg.classOf();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_classp_execute(SubLObject arg) {
		return arg instanceof LispClass ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_coerce_to_function_execute(SubLObject arg) {
		return Lisp.coerceToFunction(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_compiled_function_p_execute(SubLObject arg) {
		return arg.typep(LispSymbols.COMPILED_FUNCTION);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_complex_execute(SubLObject arg) {
		if (arg instanceof SingleFloat)
			return LispObjectFactory.makeComplex(arg, SingleFloat.ZERO);
		if (arg instanceof DoubleFloat)
			return LispObjectFactory.makeComplex(arg, DoubleFloat.ZERO);
		if (arg.realp())
			return arg;
		return Lisp.type_error(arg, LispSymbols.REAL);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_complex_execute(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeComplex(first, second);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_complexp_execute(SubLObject arg) {
		return arg.COMPLEXP();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_cons_execute(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeCons(first, second);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_consp_execute(SubLObject arg) {
		return arg instanceof SubLCons ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_constantp_execute(SubLObject arg) {
		return arg.constantp() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_constantp_execute(SubLObject first, SubLObject second) {
		return first.constantp() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param item
	 *            Description of Parameter
	 * @param sequence
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_delete_eq_execute(SubLObject item, SubLObject sequence) {
		if (sequence instanceof AbstractVector)
			return ((AbstractVector) sequence).deleteEq(item);
		else
			return Primitives.LIST_DELETE_EQ.execute(item, sequence);
	}

	/**
	 * Description of the Method
	 *
	 * @param item
	 *            Description of Parameter
	 * @param sequence
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_delete_eql_execute(SubLObject item, SubLObject sequence) {
		if (sequence instanceof AbstractVector)
			return ((AbstractVector) sequence).deleteEql(item);
		else
			return Primitives.LIST_DELETE_EQL.execute(item, sequence);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_denominator_execute(SubLObject arg) {
		return arg.DENOMINATOR();
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_divide_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_divide_execute(SubLObject arg) {
		return Fixnum.ONE.divideBy(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_divide_execute(SubLObject first, SubLObject second) {
		return first.divideBy(second);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_divide_execute(SubLObject[] args) {
		SubLObject result = args[0];
		for (int i = 1; i < args.length; i++)
			result = result.divideBy(args[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_elt_execute(SubLObject first, SubLObject second) {
		return first.elt(second.intValue());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_endp_execute(SubLObject arg) {
		return arg.endp() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_eq_execute(SubLObject first, SubLObject second) {
		return first == second ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_eql_execute(SubLObject first, SubLObject second) {
		return first.eql(second) ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equal_execute(SubLObject first, SubLObject second) {
		return first.equal(second) ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equalp_execute(SubLObject first, SubLObject second) {
		return first.equalp(second) ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equals_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equals_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equals_execute(SubLObject first, SubLObject second) {
		return first.numE(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_equals_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numE(second) && second.numE(third))
			return Lisp.T;
		else
			return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_equals_execute(SubLObject[] array) {
		final int length = array.length;
		final SubLObject obj = array[0];
		for (int i = 1; i < length; i++)
			if (array[i].isNotEqualTo(obj))
				return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_error_execute(SubLObject[] args) {
		Error e = new Error();

		e.printStackTrace();

		System.out.println("ERROR placeholder called with arguments:");

		if (args.length == 1 && args[0] instanceof Condition) {
			System.out.println(args[0].writeToString());
			System.out.println(((Condition) args[0]).getConditionReport());
		} else
			for (SubLObject a : args)
				System.out.println(a.writeToString());

		// ###FIXME: Bail out, but do it nicer...
		System.exit(1);
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_evenp_execute(SubLObject arg) {
		return arg.EVENP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_export_execute(SubLObject arg) {
		final SubLPackage pkg = (SubLPackage) LispSymbols._PACKAGE_.symbolValue();
		if (arg instanceof SubLCons)
			for (SubLObject list = arg; list != Lisp.NIL; list = list.rest())
				pkg.export(Lisp.checkSymbol(list.first()));
		else
			pkg.export(Lisp.checkSymbol(arg));
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_export_execute(SubLObject first, SubLObject second) {
		if (first instanceof SubLCons) {
			SubLPackage pkg = Lisp.coerceToPackage(second);
			for (SubLObject list = first; list != Lisp.NIL; list = list.rest())
				pkg.export(Lisp.checkSymbol(list.first()));
		} else
			Lisp.coerceToPackage(second).export(Lisp.checkSymbol(first));
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fboundp_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol)
			return arg.getSymbolFunction() != null ? Lisp.T : Lisp.NIL;
		if (Lisp.isValidSetfFunctionName(arg)) {
			SubLObject f = Lisp.get(arg.second(), LispSymbols.SETF_FUNCTION, null);
			return f != null ? Lisp.T : Lisp.NIL;
		}
		return Lisp.type_error(arg, Lisp.FUNCTION_NAME);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fdefinition_block_name_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol)
			return arg;
		if (Lisp.isValidSetfFunctionName(arg))
			return arg.second();
		return Lisp.type_error(arg, Lisp.FUNCTION_NAME);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_find_package_execute(SubLObject arg) {
		if (arg instanceof SubLPackage)
			return arg;
		if (arg instanceof SubLString) {
			SubLPackage pkg = LispPackages.findPackage(arg.getString());
			return pkg != null ? pkg : Lisp.NIL;
		}
		if (arg instanceof SubLSymbol) {
			SubLPackage pkg = LispPackages.findPackage(Lisp.checkSymbol(arg).getJavaSymbolName());
			return pkg != null ? pkg : Lisp.NIL;
		}
		if (arg instanceof LispCharacter) {
			String packageName = String.valueOf(new char[] { ((LispCharacter) arg).charValue() });
			SubLPackage pkg = LispPackages.findPackage(packageName);
			return pkg != null ? pkg : Lisp.NIL;
		}
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_find_symbol_execute(SubLObject arg) {
		return Lisp.getCurrentPackage().findSymbol(Lisp.checkString(arg).getString());
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_find_symbol_execute(SubLObject first, SubLObject second) {
		return Lisp.coerceToPackage(second).findSymbol(Lisp.checkString(first).getString());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fixnump_execute(SubLObject arg) {
		return arg instanceof Fixnum ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fmakunbound_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol) {
			Lisp.checkSymbol(arg).setSymbolFunction(null);
			return arg;
		}
		if (Lisp.isValidSetfFunctionName(arg)) {
			Lisp.remprop((SubLSymbol) arg.second(), LispSymbols.SETF_FUNCTION);
			return arg;
		}
		return Lisp.type_error(arg, Lisp.FUNCTION_NAME);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second) {
		return Primitives.pf_fset_execute(first, second, Lisp.NIL, Lisp.NIL, Lisp.NIL);
	}

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
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third) {
		return Primitives.pf_fset_execute(first, second, third, Lisp.NIL, Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return Primitives.pf_fset_execute(first, second, third, fourth, Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @param fifth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth) {
		if (first instanceof SubLSymbol) {
			Primitives.checkRedefinition(first);
			SubLSymbol symbol = Lisp.checkSymbol(first);
			symbol.setSymbolFunction(second);
			final LispThread thread = LispThread.currentThread();
			SubLObject sourcePathname = Lisp._SOURCE_.symbolValue(thread);
			SubLObject sourcePosition = third;
			if (sourcePathname != Lisp.NIL)
				sourcePosition = Lisp._SOURCE_POSITION_.symbolValue(thread);
			if (sourcePathname == Lisp.NIL)
				sourcePathname = Keyword.TOP_LEVEL;
			if (sourcePathname != Keyword.TOP_LEVEL)
				Lisp.put(symbol, LispSymbols._SOURCE, LispObjectFactory.makeCons(sourcePathname, third));
			else
				Lisp.put(symbol, LispSymbols._SOURCE, sourcePathname);
		} else if (Lisp.isValidSetfFunctionName(first)) {
			// SETF function
			Primitives.checkRedefinition(first);
			SubLSymbol symbol = Lisp.checkSymbol(first.second());
			Lisp.put(symbol, LispSymbols.SETF_FUNCTION, second);
		} else
			return Lisp.type_error(first, Lisp.FUNCTION_NAME);
		if (second instanceof Operator) {
			Operator op = (Operator) second;
			op.setLambdaName(first);
			if (fourth != Lisp.NIL)
				op.setLambdaList(fourth);
			if (fifth != Lisp.NIL)
				op.setDocumentation(LispSymbols.FUNCTION, fifth);
		}
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject arg) {
		return LispThread.currentThread().execute(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().execute(first, second);
	}

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
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispThread.currentThread().execute(first, second, third);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth) {
		return LispThread.currentThread().execute(first, second, third, fourth);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @param fifth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @param fifth
	 *            Description of Parameter
	 * @param sixth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @param fifth
	 *            Description of Parameter
	 * @param sixth
	 *            Description of Parameter
	 * @param seventh
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth, SubLObject seventh) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @param fifth
	 *            Description of Parameter
	 * @param sixth
	 *            Description of Parameter
	 * @param seventh
	 *            Description of Parameter
	 * @param eigth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eigth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth, seventh, eigth);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_execute(SubLObject[] args) {
		final int length = args.length - 1;
		// Number of arguments.
		if (length == 8)
			return LispThread.currentThread().execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6],
					args[7], args[8]);
		else {
			SubLObject[] newArgs = LispObjectFactory.makeLispObjectArray(length);
			System.arraycopy(args, 1, newArgs, 0, length);
			return LispThread.currentThread().execute(args[0], newArgs);
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_funcall_key_execute(SubLObject first, SubLObject second) {
		if (first != Lisp.NIL)
			return LispThread.currentThread().execute(first, second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_function_lambda_expression_execute(SubLObject arg) {
		final SubLObject value1;
		final SubLObject value2;
		final SubLObject value3;
		if (arg instanceof CompiledClosure) {
			value1 = Lisp.NIL;
			value2 = Lisp.T;
			SubLObject name = ((CompiledClosure) arg).getLambdaName();
			value3 = name != null ? name : Lisp.NIL;
		} else if (arg instanceof Closure) {
			Closure closure = (Closure) arg;
			SubLObject expr = closure.getBody();
			expr = LispObjectFactory.makeCons(closure.getLambdaList(), expr);
			expr = LispObjectFactory.makeCons(LispSymbols.LAMBDA, expr);
			value1 = expr;
			Environment env = closure.getEnvironment();
			if (env == null || env.isEmpty())
				value2 = Lisp.NIL;
			else
				value2 = env;
			// Return environment as closure-p.
			SubLObject name = ((Closure) arg).getLambdaName();
			value3 = name != null ? name : Lisp.NIL;
		} else if (arg instanceof Function) {
			value1 = Lisp.NIL;
			value2 = Lisp.T;
			value3 = ((Function) arg).getLambdaName();
		} else if (arg instanceof StandardGenericFunction) {
			value1 = Lisp.NIL;
			value2 = Lisp.T;
			value3 = ((StandardGenericFunction) arg).getGenericFunctionName();
		} else
			return Lisp.type_error(arg, LispSymbols.FUNCTION);
		return LispThread.currentThread().setValues(value1, value2, value3);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_function_plist_execute(SubLObject arg) {
		return Lisp.checkFunction(arg).getPropertyList();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_functionp_execute(SubLObject arg) {
		return arg instanceof Function || arg instanceof StandardGenericFunction ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gcd_2_execute(SubLObject first, SubLObject second) {
		BigInteger n1;
		BigInteger n2;
		if (first instanceof Fixnum)
			n1 = BigInteger.valueOf(((Fixnum) first).value);
		else if (first instanceof Bignum)
			n1 = ((Bignum) first).bigIntegerValue();
		else
			return Lisp.type_error(first, LispSymbols.INTEGER);
		if (second instanceof Fixnum)
			n2 = BigInteger.valueOf(((Fixnum) second).value);
		else if (second instanceof Bignum)
			n2 = ((Bignum) second).bigIntegerValue();
		else
			return Lisp.type_error(second, LispSymbols.INTEGER);
		return Lisp.number(n1.gcd(n2));
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_ge_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_ge_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_ge_execute(SubLObject first, SubLObject second) {
		return first.numGE(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_ge_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numGE(second) && second.numGE(third))
			return Lisp.T;
		else
			return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_ge_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++)
			if (array[i].numG(array[i - 1]))
				return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gensym_execute() {
		return Lisp.gensym("G", LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gensym_execute(SubLObject arg) {
		if (arg instanceof Fixnum) {
			int n = ((Fixnum) arg).value;
			if (n >= 0) {
				StringBuilder sb = new StringBuilder("G");
				sb.append(n);
				// Decimal representation.
				return LispObjectFactory.makeSymbol(LispObjectFactory.makeString(sb));
			}
		} else if (arg instanceof Bignum) {
			BigInteger n = ((Bignum) arg).bigIntegerValue();
			if (n.signum() >= 0) {
				StringBuilder sb = new StringBuilder("G");
				sb.append(n.toString());
				// Decimal representation.
				return LispObjectFactory.makeSymbol(LispObjectFactory.makeString(sb));
			}
		} else if (arg instanceof SubLString)
			return Lisp.gensym(arg.getString(), LispThread.currentThread());
		return Lisp.type_error(arg, Lisp.list(LispSymbols.OR, LispSymbols.STRING, LispSymbols.UNSIGNED_BYTE));
	}

	/**
	 * Description of the Method
	 *
	 * @param symbol
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_get_execute(SubLObject symbol, SubLObject indicator) {
		return Lisp.get(symbol, indicator, Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param symbol
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @param defaultValue
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_get_execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue) {
		return Lisp.get(symbol, indicator, defaultValue);
	}

	/**
	 * Description of the Method
	 *
	 * @param plist
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_getf_execute(SubLObject plist, SubLObject indicator) {
		return Lisp.getf(plist, indicator, Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param plist
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @param defaultValue
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_getf_execute(SubLObject plist, SubLObject indicator, SubLObject defaultValue) {
		return Lisp.getf(plist, indicator, defaultValue);
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gt_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gt_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gt_execute(SubLObject first, SubLObject second) {
		return first.numG(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_gt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numG(second) && second.numG(third))
			return Lisp.T;
		else
			return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_gt_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++)
			if (array[i].numGE(array[i - 1]))
				return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_hot_count_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.getHotCount());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_identity_execute(SubLObject arg) {
		return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_identity_hash_code_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(System.identityHashCode(arg));
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_imagpart_execute(SubLObject arg) {
		if (arg instanceof Complex)
			return ((Complex) arg).getImaginaryPart();
		return arg.mult(Fixnum.ZERO);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_inspected_description_execute(SubLObject arg) {
		return arg.getDescription();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_inspected_parts_execute(SubLObject arg) {
		return arg.getParts();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_integer_length_execute(SubLObject arg) {
		if (arg instanceof Fixnum) {
			int n = ((Fixnum) arg).value;
			if (n < 0)
				n = ~n;
			int count = 0;
			while (n > 0) {
				n = n >>> 1;
				++count;
			}
			return LispObjectFactory.makeInteger(count);
		}
		if (arg instanceof Bignum)
			return LispObjectFactory.makeInteger(((Bignum) arg).bigIntegerValue().bitLength());
		return Lisp.type_error(arg, LispSymbols.INTEGER);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_integerp_execute(SubLObject arg) {
		return arg.INTEGERP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_intern_execute(SubLObject arg) {
		final SubLString s;
		if (arg instanceof SimpleString)
			s = (SimpleString) arg;
		else
			s = LispObjectFactory.makeString(arg.getString());
		final LispThread thread = LispThread.currentThread();
		SubLPackage pkg = (SubLPackage) LispSymbols._PACKAGE_.symbolValue(thread);
		return pkg.intern(s, thread);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_intern_execute(SubLObject first, SubLObject second) {
		final SubLString s;
		if (first instanceof SimpleString)
			s = (SimpleString) first;
		else
			// Not a simple string.
			s = LispObjectFactory.makeString(first.getString());
		SubLPackage pkg = Lisp.coerceToPackage(second);
		return pkg.intern(s, LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_keywordp_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol)
			if (Lisp.checkSymbol(arg).isKeyword())
				return Lisp.T;
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_lambda_name_execute(SubLObject arg) {
		if (arg instanceof Operator)
			return ((Operator) arg).getLambdaName();
		if (arg instanceof StandardGenericFunction)
			return ((StandardGenericFunction) arg).getGenericFunctionName();
		return Lisp.type_error(arg, LispSymbols.FUNCTION);
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_le_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_le_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_le_execute(SubLObject first, SubLObject second) {
		return first.numLE(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_le_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numLE(second) && second.numLE(third))
			return Lisp.T;
		else
			return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_le_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++)
			if (array[i].numL(array[i - 1]))
				return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_length_execute(SubLObject arg) {
		return arg.LENGTH();
	}

	/**
	 * Description of the Method
	 *
	 * @param item
	 *            Description of Parameter
	 * @param list
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_delete_eq_execute(SubLObject item, SubLObject list) {
		if (list instanceof SubLCons) {
			SubLObject tail = list;
			SubLObject splice = list;
			while (tail instanceof SubLCons) {
				SubLObject car = tail.first();
				if (car == item) {
					if (tail.rest() != Lisp.NIL) {
						SubLObject temp = tail;
						tail.setCar(temp.second());
						tail.setCdr(temp.cddr());
					} else {
						// Last item.
						if (tail == list)
							return Lisp.NIL;
						splice.setCdr(Lisp.NIL);
						return list;
					}
				} else {
					splice = tail;
					tail = tail.rest();
				}
			}
			if (tail == Lisp.NIL)
				return list;
			else
				return Lisp.type_error(tail, LispSymbols.LIST);
		} else if (list == Lisp.NIL)
			return list;
		else
			return Lisp.type_error(list, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @param item
	 *            Description of Parameter
	 * @param list
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_delete_eql_execute(SubLObject item, SubLObject list) {
		if (list instanceof SubLCons) {
			SubLObject tail = list;
			SubLObject splice = list;
			while (tail instanceof SubLCons) {
				SubLObject car = tail.first();
				if (car.eql(item)) {
					if (tail.rest() != Lisp.NIL) {
						SubLObject temp = tail;
						tail.setCar(temp.second());
						tail.setCdr(temp.cddr());
					} else {
						// Last item.
						if (tail == list)
							return Lisp.NIL;
						splice.setCdr(Lisp.NIL);
						return list;
					}
				} else {
					splice = tail;
					tail = tail.rest();
				}
			}
			if (tail == Lisp.NIL)
				return list;
			else
				return Lisp.type_error(tail, LispSymbols.LIST);
		} else if (list == Lisp.NIL)
			return list;
		else
			return Lisp.type_error(list, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_execute() {
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject arg) {
		return LispObjectFactory.makeCons(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeCons(first, LispObjectFactory.makeCons(second));
	}

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
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispObjectFactory.makeCons(first, LispObjectFactory.makeCons(second, LispObjectFactory.makeCons(third)));
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return LispObjectFactory.makeCons(first, LispObjectFactory.makeCons(second,
				LispObjectFactory.makeCons(third, LispObjectFactory.makeCons(fourth))));
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_execute(SubLObject[] args) {
		SubLObject result = Lisp.NIL;
		for (int i = args.length; i-- > 0;)
			result = LispObjectFactory.makeCons(args[i], result);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_star_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_star_execute(SubLObject arg) {
		return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeCons(first, second);
	}

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
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispObjectFactory.makeCons(first, LispObjectFactory.makeCons(second, third));
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth) {
		return LispObjectFactory.makeCons(first,
				LispObjectFactory.makeCons(second, LispObjectFactory.makeCons(third, fourth)));
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_list_star_execute(SubLObject[] args) {
		int i = args.length - 1;
		SubLObject result = args[i];
		while (i-- > 0)
			result = LispObjectFactory.makeCons(args[i], result);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_listp_execute(SubLObject arg) {
		return arg.LISTP();
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_lt_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_lt_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_lt_execute(SubLObject first, SubLObject second) {
		return first.numL(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_lt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numL(second) && second.numL(third))
			return Lisp.T;
		else
			return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_lt_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++)
			if (array[i].numLE(array[i - 1]))
				return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macro_function_execute(SubLObject arg) {
		SubLObject obj = arg.getSymbolFunction();
		if (obj instanceof AutoloadMacro) {
			((AutoloadMacro) obj).load();
			obj = arg.getSymbolFunction();
		}
		if (obj instanceof MacroObject)
			return ((MacroObject) obj).expander;
		if (obj instanceof SpecialOperator) {
			obj = Lisp.get(arg, LispSymbols.MACROEXPAND_MACRO, Lisp.NIL);
			if (obj instanceof AutoloadMacro) {
				((AutoloadMacro) obj).load();
				obj = Lisp.get(arg, LispSymbols.MACROEXPAND_MACRO, Lisp.NIL);
			}
			if (obj instanceof MacroObject)
				return ((MacroObject) obj).expander;
		}
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macro_function_execute(SubLObject first, SubLObject second) {
		SubLObject obj;
		if (second != Lisp.NIL) {
			Environment env = Lisp.checkEnvironment(second);
			obj = env.lookupFunction(first);
		} else
			obj = first.getSymbolFunction();
		if (obj instanceof AutoloadMacro) {
			((AutoloadMacro) obj).load();
			obj = first.getSymbolFunction();
		}
		if (obj instanceof MacroObject)
			return ((MacroObject) obj).expander;
		if (obj instanceof SpecialOperator) {
			obj = Lisp.get(first, LispSymbols.MACROEXPAND_MACRO, Lisp.NIL);
			if (obj instanceof AutoloadMacro) {
				((AutoloadMacro) obj).load();
				obj = Lisp.get(first, LispSymbols.MACROEXPAND_MACRO, Lisp.NIL);
			}
			if (obj instanceof MacroObject)
				return ((MacroObject) obj).expander;
		}
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macro_function_p_execute(SubLObject arg) {
		return arg instanceof MacroObject ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param form
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macroexpand_1_execute(SubLObject form) {
		return Lisp.macroexpand_1(form, new Environment(), LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param form
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@NoInline
	static public SubLObject pf_macroexpand_1_execute(SubLObject form, SubLObject env) {
		return Lisp.macroexpand_1(form, env != Lisp.NIL ? Lisp.checkEnvironment(env) : new Environment(),
				LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param form
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macroexpand_execute(SubLObject form) {
		return Lisp.macroexpand(form, new Environment(), LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param form
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_macroexpand_execute(SubLObject form, SubLObject env) {
		return Lisp.macroexpand(form, env != Lisp.NIL ? Lisp.checkEnvironment(env) : new Environment(),
				LispThread.currentThread());
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_closure_execute(SubLObject first, SubLObject second) {
		if (first instanceof SubLCons && ((SubLCons) first).first() == LispSymbols.LAMBDA) {
			final Environment env;
			if (second == Lisp.NIL)
				env = new Environment();
			else
				env = Lisp.checkEnvironment(second);
			return new Closure(first, env);
		}
		return Lisp.error(new TypeError("The argument to MAKE-CLOSURE is not a lambda form."));
	}

	/**
	 * Description of the Method
	 *
	 * @param definition
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_expander_for_macrolet_execute(SubLObject definition) {
		SubLSymbol symbol = Lisp.checkSymbol(definition.first());
		SubLObject lambdaList = definition.second();
		SubLObject body = definition.cddr();
		SubLObject block = LispObjectFactory.makeCons(LispSymbols.BLOCK, LispObjectFactory.makeCons(symbol, body));
		SubLObject toBeApplied = Lisp.list(LispSymbols.LAMBDA, lambdaList, block);
		final LispThread thread = LispThread.currentThread();
		SubLObject formArg = Lisp.gensym("WHOLE-", thread);
		SubLObject envArg = Lisp.gensym("ENVIRONMENT-", thread);
		// Ignored.
		SubLObject expander = Lisp.list(LispSymbols.LAMBDA, Lisp.list(formArg, envArg),
				Lisp.list(LispSymbols.APPLY, toBeApplied, Lisp.list(LispSymbols.CDR, formArg)));
		return expander;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_keyword_execute(SubLObject arg) {
		return Lisp.PACKAGE_KEYWORD.intern(Lisp.checkSymbol(arg).getSubLName());
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_macro_execute(SubLObject first, SubLObject second) {
		return new MacroObject(first, second);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_symbol_execute(SubLObject arg) {
		if (arg instanceof SimpleString)
			return LispObjectFactory.makeSymbol((SimpleString) arg);
		// Not a simple string.
		if (arg instanceof SubLString)
			return LispObjectFactory.makeSymbol(arg.getString());
		return Lisp.type_error(arg, LispSymbols.STRING);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_make_symbol_macro_execute(SubLObject arg) {
		return new SymbolMacro(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_makunbound_execute(SubLObject arg) {
		Lisp.checkSymbol(arg).setSymbolValue(null);
		return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param fun
	 *            Description of Parameter
	 * @param list
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapc_execute(SubLObject fun, SubLObject list) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = list;
		while (list != Lisp.NIL) {
			SubLCons cons;
			if (list instanceof SubLCons)
				cons = (SubLCons) list;
			else
				return Lisp.type_error(list, LispSymbols.LIST);
			thread.execute(fun, cons.first());
			list = cons.rest();
		}
		thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param fun
	 *            Description of Parameter
	 * @param list1
	 *            Description of Parameter
	 * @param list2
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapc_execute(SubLObject fun, SubLObject list1, SubLObject list2) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = list1;
		while (list1 != Lisp.NIL && list2 != Lisp.NIL) {
			thread.execute(fun, list1.first(), list2.first());
			list1 = ((SubLCons) list1).rest();
			list2 = ((SubLCons) list2).rest();
		}
		thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapc_execute(SubLObject[] args) {
		final int numArgs = args.length;
		if (numArgs < 2)
			return Primitives.num_args_err();
		int commonLength = -1;
		for (int i = 1; i < numArgs; i++) {
			if (!args[i].isList())
				Lisp.type_error(args[i], LispSymbols.LIST);
			int len = args[i].cl_length();
			if (commonLength < 0)
				commonLength = len;
			else if (commonLength > len)
				commonLength = len;
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject result = args[1];
		final int numFunArgs = numArgs - 1;
		final SubLObject[] funArgs = LispObjectFactory.makeLispObjectArray(numFunArgs);
		for (int i = 0; i < commonLength; i++) {
			for (int j = 0; j < numFunArgs; j++)
				funArgs[j] = args[j + 1].first();
			Lisp.funcall(args[0], funArgs, thread);
			for (int j = 1; j < numArgs; j++)
				args[j] = args[j].rest();
		}
		thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param fun
	 *            Description of Parameter
	 * @param list
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapcar_execute(SubLObject fun, SubLObject list) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.NIL;
		SubLCons splice = null;
		while (list != Lisp.NIL) {
			SubLCons cons;
			if (list instanceof SubLCons)
				cons = (SubLCons) list;
			else
				return Lisp.type_error(list, LispSymbols.LIST);
			SubLObject obj = thread.execute(fun, cons.first());
			if (splice == null) {
				splice = LispObjectFactory.makeCons(obj, result);
				result = splice;
			} else {
				SubLCons c = LispObjectFactory.makeCons(obj);
				splice.setCdr(c);
				splice = c;
			}
			list = cons.rest();
		}
		thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param fun
	 *            Description of Parameter
	 * @param list1
	 *            Description of Parameter
	 * @param list2
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapcar_execute(SubLObject fun, SubLObject list1, SubLObject list2) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.NIL;
		SubLCons splice = null;
		while (list1 != Lisp.NIL && list2 != Lisp.NIL) {
			SubLObject obj = thread.execute(fun, list1.first(), list2.first());
			if (splice == null) {
				splice = LispObjectFactory.makeCons(obj, result);
				result = splice;
			} else {
				SubLCons cons = LispObjectFactory.makeCons(obj);
				splice.setCdr(cons);
				splice = cons;
			}
			list1 = list1.rest();
			list2 = list2.rest();
		}
		thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_mapcar_execute(SubLObject[] args) {
		final int numArgs = args.length;
		if (numArgs < 2)
			return Primitives.num_args_err();
		int commonLength = -1;
		for (int i = 1; i < numArgs; i++) {
			if (!args[i].isList())
				Lisp.type_error(args[i], LispSymbols.LIST);
			int len = args[i].cl_length();
			if (commonLength < 0)
				commonLength = len;
			else if (commonLength > len)
				commonLength = len;
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject[] results = LispObjectFactory.makeLispObjectArray(commonLength);
		final int numFunArgs = numArgs - 1;
		final SubLObject[] funArgs = LispObjectFactory.makeLispObjectArray(numFunArgs);
		for (int i = 0; i < commonLength; i++) {
			for (int j = 0; j < numFunArgs; j++)
				funArgs[j] = args[j + 1].first();
			results[i] = Lisp.funcall(args[0], funArgs, thread);
			for (int j = 1; j < numArgs; j++)
				args[j] = args[j].rest();
		}
		thread._values = null;
		SubLObject result = Lisp.NIL;
		for (int i = commonLength; i-- > 0;)
			result = LispObjectFactory.makeCons(results[i], result);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_max_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_max_execute(SubLObject arg) {
		if (arg.realp())
			return arg;
		return Lisp.type_error(arg, LispSymbols.REAL);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_max_execute(SubLObject first, SubLObject second) {
		return first.numG(second) ? first : second;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_max_execute(SubLObject[] args) {
		SubLObject result = args[0];
		if (!result.realp())
			Lisp.type_error(result, LispSymbols.REAL);
		for (int i = 1; i < args.length; i++)
			if (args[i].numG(result))
				result = args[i];
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_min_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_min_execute(SubLObject arg) {
		if (arg.realp())
			return arg;
		return Lisp.type_error(arg, LispSymbols.REAL);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_min_execute(SubLObject first, SubLObject second) {
		return first.numL(second) ? first : second;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_min_execute(SubLObject[] args) {
		SubLObject result = args[0];
		if (!result.realp())
			Lisp.type_error(result, LispSymbols.REAL);
		for (int i = 1; i < args.length; i++)
			if (args[i].numL(result))
				result = args[i];
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_minusp_execute(SubLObject arg) {
		return arg.MINUSP();
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_multiply_execute() {
		return Fixnum.ONE;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_multiply_execute(SubLObject arg) {
		if (arg.isNumber())
			return arg;
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_multiply_execute(SubLObject first, SubLObject second) {
		return first.mult(second);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_multiply_execute(SubLObject[] args) {
		SubLObject result = Fixnum.ONE;
		for (int i = 0; i < args.length; i++)
			result = result.mult(args[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nconc_execute() {
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nconc_execute(SubLObject arg) {
		return arg;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nconc_execute(SubLObject first, SubLObject second) {
		if (first == Lisp.NIL)
			return second;
		if (first instanceof SubLCons) {
			SubLObject result = first;
			SubLCons splice = null;
			while (first instanceof SubLCons) {
				splice = (SubLCons) first;
				first = splice.rest();
			}
			splice.setCdr(second);
			return result;
		}
		return Lisp.type_error(first, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nconc_execute(SubLObject[] array) {
		SubLObject result = null;
		SubLCons splice = null;
		final int limit = array.length - 1;
		int i;
		for (i = 0; i < limit; i++) {
			SubLObject list = array[i];
			if (list == Lisp.NIL)
				continue;
			if (list instanceof SubLCons) {
				if (splice != null) {
					splice.setCdr(list);
					splice = (SubLCons) list;
				}
				while (list instanceof SubLCons) {
					if (result == null) {
						result = list;
						splice = (SubLCons) result;
					} else
						splice = (SubLCons) list;
					list = splice.rest();
				}
			} else
				Lisp.type_error(list, LispSymbols.LIST);
		}
		if (result == null)
			return array[i];
		splice.setCdr(array[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_not_equals_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_not_equals_execute(SubLObject arg) {
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_not_equals_execute(SubLObject first, SubLObject second) {
		return first.isNotEqualTo(second) ? Lisp.T : Lisp.NIL;
	}

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
	static public SubLObject pf_not_equals_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numE(second))
			return Lisp.NIL;
		if (first.numE(third))
			return Lisp.NIL;
		if (second.numE(third))
			return Lisp.NIL;
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param array
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_not_equals_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 0; i < length; i++) {
			final SubLObject obj = array[i];
			for (int j = i + 1; j < length; j++)
				if (array[j].numE(obj))
					return Lisp.NIL;
		}
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_not_execute(SubLObject arg) {
		return arg == Lisp.NIL ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param list
	 *            Description of Parameter
	 * @param obj
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nreconc_execute(SubLObject list, SubLObject obj) {
		if (list instanceof SubLCons) {
			SubLObject list3 = list.rest();
			if (list3 instanceof SubLCons) {
				if (list3.rest() instanceof SubLCons) {
					SubLObject list1 = list3;
					SubLObject list2 = Lisp.NIL;
					do {
						SubLObject h = list3.rest();
						list3.setCdr(list2);
						list2 = list3;
						list3 = h;
					} while (list3.rest() instanceof SubLCons);
					list.setCdr(list2);
					list1.setCdr(list3);
				}
				SubLObject h = list.first();
				list.setCar(list3.first());
				list3.setCar(h);
				list3.setCdr(obj);
			} else if (list3 == Lisp.NIL)
				list.setCdr(obj);
			else
				Lisp.type_error(list3, LispSymbols.LIST);
			return list;
		} else if (list == Lisp.NIL)
			return obj;
		else
			return Lisp.type_error(list, LispSymbols.LIST);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nreverse_execute(SubLObject arg) {
		return arg.nreverse();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nth_execute(SubLObject first, SubLObject second) {
		return second.NTH(first);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_nthcdr_execute(SubLObject first, SubLObject second) {
		final int index = first.intValue();
		if (index < 0)
			return Lisp.type_error(first, Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO));
		for (int i = 0; i < index; i++) {
			second = second.rest();
			if (second == Lisp.NIL)
				return Lisp.NIL;
		}
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_null_execute(SubLObject arg) {
		return arg == Lisp.NIL ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_numberp_execute(SubLObject arg) {
		return arg.NUMBERP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_numerator_execute(SubLObject arg) {
		return arg.NUMERATOR();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_oddp_execute(SubLObject arg) {
		return arg.ODDP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_one_minus_execute(SubLObject arg) {
		return arg.dec();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_one_plus_execute(SubLObject arg) {
		return arg.inc();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_package_external_symbols_execute(SubLObject arg) {
		return Lisp.coerceToPackage(arg).PACKAGE_EXTERNAL_SYMBOLS();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_package_inherited_symbols_execute(SubLObject arg) {
		return Lisp.coerceToPackage(arg).PACKAGE_INHERITED_SYMBOLS();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_package_internal_symbols_execute(SubLObject arg) {
		return Lisp.coerceToPackage(arg).PACKAGE_INTERNAL_SYMBOLS();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_package_symbols_execute(SubLObject arg) {
		return Lisp.coerceToPackage(arg).getSymbols();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_plusp_execute(SubLObject arg) {
		return arg.PLUSP();
	}

	/**
	 * Description of the Method
	 *
	 * @param symbol
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @param value
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_put_execute(SubLObject symbol, SubLObject indicator, SubLObject value) {
		return Lisp.put(Lisp.checkSymbol(symbol), indicator, value);
	}

	/**
	 * Description of the Method
	 *
	 * @param symbol
	 *            Description of Parameter
	 * @param indicator
	 *            Description of Parameter
	 * @param defaultValue
	 *            Description of Parameter
	 * @param value
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_put_execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue,
			SubLObject value) {
		return Lisp.put(Lisp.checkSymbol(symbol), indicator, value);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_rationalp_execute(SubLObject arg) {
		return arg.RATIONALP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_realp_execute(SubLObject arg) {
		return arg.REALP();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_realpart_execute(SubLObject arg) {
		if (arg instanceof Complex)
			return ((Complex) arg).getRealPart();
		if (arg.isNumber())
			return arg;
		return Lisp.type_error(arg, LispSymbols.NUMBER);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_remprop_execute(SubLObject first, SubLObject second) {
		return Lisp.remprop(Lisp.checkSymbol(first), second);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_reverse_execute(SubLObject arg) {
		return arg.reverse();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_rplaca_execute(SubLObject first, SubLObject second) {
		first.setCar(second);
		return first;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_rplacd_execute(SubLObject first, SubLObject second) {
		first.setCdr(second);
		return first;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_set_call_count_execute(SubLObject first, SubLObject second) {
		first.setCallCount(second.intValue());
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_set_class_precedence_list_execute(SubLObject first, SubLObject second) {
		Lisp.checkClass(first).setCPL(second);
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_set_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().setSpecialVariable(Lisp.checkSymbol(first), second);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_set_hot_count_execute(SubLObject first, SubLObject second) {
		first.setHotCount(second.intValue());
		return second;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_setf_function_name_p_execute(SubLObject arg) {
		return Lisp.isValidSetfFunctionName(arg) ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_signal_execute(SubLObject[] args) {
		if (args.length < 1)
			return Primitives.num_args_err();
		if (args[0] instanceof Condition)
			return Lisp.error(args[0]);
		return Lisp.error(new SimpleCondition());
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_simple_typep_execute(SubLObject first, SubLObject second) {
		return first.typep(second);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_special_operator_p_execute(SubLObject arg) {
		return arg.isSpecialOperator() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_standard_object_p_execute(SubLObject arg) {
		return arg instanceof StandardObject ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_streamp_execute(SubLObject arg) {
		return arg instanceof LispStream ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_string_execute(SubLObject arg) {
		return arg.STRING();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_subseq_execute(SubLObject first, SubLObject second) {
		final int start = second.intValue();
		if (start < 0) {
			StringBuilder sb = new StringBuilder("Bad start index (");
			sb.append(start);
			sb.append(") for SUBSEQ.");
			Lisp.error(new TypeError(sb.toString()));
		}
		if (first.isList())
			return Primitives.list_subseq(first, start, -1);
		if (first instanceof AbstractVector) {
			final AbstractVector v = (AbstractVector) first;
			return v.subseq(start, v.cl_length());
		}
		return Lisp.type_error(first, LispSymbols.SEQUENCE);
	}

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
	static public SubLObject pf_subseq_execute(SubLObject first, SubLObject second, SubLObject third) {
		final int start = second.intValue();
		if (start < 0) {
			StringBuilder sb = new StringBuilder("Bad start index (");
			sb.append(start);
			sb.append(").");
			Lisp.error(new TypeError(sb.toString()));
		}
		int end;
		if (third != Lisp.NIL) {
			end = third.intValue();
			if (start > end) {
				StringBuilder sb = new StringBuilder("Start index (");
				sb.append(start);
				sb.append(") is greater than end index (");
				sb.append(end);
				sb.append(") for SUBSEQ.");
				Lisp.error(new TypeError(sb.toString()));
			}
		} else
			end = -1;
		if (first.isList())
			return Primitives.list_subseq(first, start, end);
		if (first instanceof AbstractVector) {
			final AbstractVector v = (AbstractVector) first;
			if (end < 0)
				end = v.cl_length();
			return v.subseq(start, end);
		}
		return Lisp.type_error(first, LispSymbols.SEQUENCE);
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_subtract_execute() {
		return Primitives.num_args_err();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_subtract_execute(SubLObject arg) {
		return arg.negate();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_subtract_execute(SubLObject first, SubLObject second) {
		return first.sub(second);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_subtract_execute(SubLObject[] args) {
		SubLObject result = args[0];
		for (int i = 1; i < args.length; i++)
			result = result.sub(args[i]);
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_function_execute(SubLObject arg) {
		SubLObject function = Lisp.checkSymbol(arg).getSymbolFunction();
		if (function != null)
			return function;
		return Lisp.error(new UndefinedFunction(arg));
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_macro_p_execute(SubLObject arg) {
		return arg instanceof SymbolMacro ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_name_execute(SubLObject arg) {
		return Lisp.checkSymbol(arg).getSubLName();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_package_execute(SubLObject arg) {
		return Lisp.checkSymbol(arg).getLispPackage();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_plist_execute(SubLObject arg) {
		return Lisp.checkSymbol(arg).getPropertyList();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbol_value_execute(SubLObject arg) {
		final SubLObject value;
		value = Lisp.checkSymbol(arg).symbolValue();
		if (value instanceof SymbolMacro)
			return Lisp.error(new LispError(arg.writeToString() + " has no dynamic value."));
		return value;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_symbolp_execute(SubLObject arg) {
		return arg instanceof SubLSymbol ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_type_of_execute(SubLObject arg) {
		return arg.typeOf();
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_undefined_function_called_execute(SubLObject first, SubLObject second) {
		return Lisp.error(new UndefinedFunction(first));
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_unintern_execute(SubLObject[] args) {
		if (args.length == 0 || args.length > 2)
			return Primitives.num_args_err();
		SubLSymbol symbol = Lisp.checkSymbol(args[0]);
		SubLPackage pkg;
		if (args.length == 2)
			pkg = Lisp.coerceToPackage(args[1]);
		else
			pkg = Lisp.getCurrentPackage();
		return pkg.unintern(symbol);
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_uptime_execute() {
		return Lisp.number(System.currentTimeMillis() - Main.startTimeMillis);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_use_package_execute(SubLObject[] args) {
		if (args.length < 1 || args.length > 2)
			return Primitives.num_args_err();
		SubLPackage pkg;
		if (args.length == 2)
			pkg = Lisp.coerceToPackage(args[1]);
		else
			pkg = Lisp.getCurrentPackage();
		if (args[0].isList()) {
			SubLObject list = args[0];
			while (list != Lisp.NIL) {
				pkg.usePackage(Lisp.coerceToPackage(list.first()));
				list = list.rest();
			}
		} else
			pkg.usePackage(Lisp.coerceToPackage(args[0]));
		return Lisp.T;
	}

	/**
	 * Description of the Method
	 *
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_values_execute() {
		return LispThread.currentThread().setValues();
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject arg) {
		return LispThread.currentThread().setValues(arg);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().setValues(first, second);
	}

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
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispThread.currentThread().setValues(first, second, third);
	}

	/**
	 * Description of the Method
	 *
	 * @param first
	 *            Description of Parameter
	 * @param second
	 *            Description of Parameter
	 * @param third
	 *            Description of Parameter
	 * @param fourth
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth) {
		return LispThread.currentThread().setValues(first, second, third, fourth);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_values_execute(SubLObject[] args) {
		return LispThread.currentThread().setValues(args);
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_values_list_execute(SubLObject arg) {
		if (arg == Lisp.NIL)
			return LispThread.currentThread().setValues();
		if (arg.rest() == Lisp.NIL)
			return arg.first();
		return LispThread.currentThread().setValues(arg.copyToArray());
	}

	/**
	 * Description of the Method
	 *
	 * @param arg
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject pf_zerop_execute(SubLObject arg) {
		return arg.ZEROP();
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_and_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.T;
		while (args != Lisp.NIL) {
			result = Lisp.eval(args.first(), env, thread);
			if (result == Lisp.NIL) {
				if (((SubLCons) args).rest() != Lisp.NIL)
					// Not the last form.
					thread._values = null;
				break;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_block_execute(SubLObject args, Environment env) {
		if (args == Lisp.NIL)
			return Primitives.num_args_err();
		SubLObject tag;
		tag = Lisp.checkSymbol(args.first());
		SubLObject body = ((SubLCons) args).rest();
		Environment ext = new Environment(env);
		final SubLObject block = new BlockLispObject();
		ext.addBlock(tag, block);
		SubLObject result = Lisp.NIL;
		final LispThread thread = LispThread.currentThread();
		try {
			return Lisp.progn(body, ext, thread);
		} catch (Return ret) {
			if (ret.getBlock() == block)
				return ret.getResult();
			throw ret;
		} finally {
			ext.inactive = true;
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_case_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject key = Lisp.eval(args.first(), env, thread);
		args = args.rest();
		while (args != Lisp.NIL) {
			SubLObject clause = args.first();
			SubLObject keys = clause.first();
			boolean match = false;
			if (keys.isList())
				while (keys != Lisp.NIL) {
					SubLObject candidate = keys.first();
					if (key.eql(candidate)) {
						match = true;
						break;
					}
					keys = keys.rest();
				}
			else {
				SubLObject candidate = keys;
				if (candidate == Lisp.T || candidate == LispSymbols.OTHERWISE)
					match = true;
				else if (key.eql(candidate))
					match = true;
			}
			if (match)
				return Lisp.progn(clause.rest(), env, thread);
			args = args.rest();
		}
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_catch_execute(SubLObject args, Environment env) {
		if (args.cl_length() < 1)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		SubLObject tag = Lisp.eval(args.first(), env, thread);
		thread.pushCatchTag(tag);
		SubLObject body = args.rest();
		SubLObject result = Lisp.NIL;
		try {
			return Lisp.progn(body, env, thread);
		} catch (Throw t) {
			if (t.tag == tag)
				return t.getResult(thread);
			throw t;
		} catch (Return ret) {
			throw ret;
		} finally {
			thread.popCatchTag();
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_cond_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.NIL;
		while (args != Lisp.NIL) {
			SubLObject clause = args.first();
			result = Lisp.eval(clause.first(), env, thread);
			thread._values = null;
			if (result != Lisp.NIL) {
				SubLObject body = clause.rest();
				while (body != Lisp.NIL) {
					result = Lisp.eval(body.first(), env, thread);
					body = ((SubLCons) body).rest();
				}
				return result;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_defmacro_execute(SubLObject args, Environment env) {
		SubLSymbol symbol = Lisp.checkSymbol(args.first());
		SubLObject lambdaList = Lisp.checkList(args.second());
		SubLObject body = args.cddr();
		SubLObject block = LispObjectFactory.makeCons(LispSymbols.BLOCK, LispObjectFactory.makeCons(symbol, body));
		SubLObject toBeApplied = Lisp.list(LispSymbols.FUNCTION, Lisp.list(LispSymbols.LAMBDA, lambdaList, block));
		final LispThread thread = LispThread.currentThread();
		SubLObject formArg = Lisp.gensym("FORM-", thread);
		SubLObject envArg = Lisp.gensym("ENV-", thread);
		// Ignored.
		SubLObject expander = Lisp.list(LispSymbols.LAMBDA, Lisp.list(formArg, envArg),
				Lisp.list(LispSymbols.APPLY, toBeApplied, Lisp.list(LispSymbols.CDR, formArg)));
		Closure expansionFunction = new Closure(expander, env);
		MacroObject macroObject = new MacroObject(symbol, expansionFunction);
		if (symbol.getSymbolFunction() instanceof SpecialOperator)
			Lisp.put(symbol, LispSymbols.MACROEXPAND_MACRO, macroObject);
		else
			symbol.setSymbolFunction(macroObject);
		macroObject.setLambdaList(lambdaList);
		thread._values = null;
		return symbol;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_ecase_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject key = Lisp.eval(args.first(), env, thread);
		SubLObject clauses = args.rest();
		while (clauses != Lisp.NIL) {
			SubLObject clause = clauses.first();
			SubLObject keys = clause.first();
			boolean match = false;
			if (keys.isList())
				while (keys != Lisp.NIL) {
					SubLObject candidate = keys.first();
					if (key.eql(candidate)) {
						match = true;
						break;
					}
					keys = keys.rest();
				}
			else {
				SubLObject candidate = keys;
				if (key.eql(candidate))
					match = true;
			}
			if (match)
				return Lisp.progn(clause.rest(), env, thread);
			clauses = clauses.rest();
		}
		SubLObject expectedType = Lisp.NIL;
		clauses = args.rest();
		while (clauses != Lisp.NIL) {
			SubLObject clause = clauses.first();
			SubLObject keys = clause.first();
			if (keys.isList())
				while (keys != Lisp.NIL) {
					expectedType = expectedType.push(keys.first());
					keys = keys.rest();
				}
			else
				expectedType = expectedType.push(keys);
			clauses = clauses.rest();
		}
		expectedType = expectedType.nreverse();
		expectedType = expectedType.push(LispSymbols.MEMBER);
		return Lisp.type_error(key, expectedType);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_eval_when_execute(SubLObject args, Environment env) {
		SubLObject situations = args.first();
		if (situations != Lisp.NIL)
			if (Lisp.memq(Keyword.EXECUTE, situations) || Lisp.memq(LispSymbols.EVAL, situations))
				return Lisp.progn(args.rest(), env, LispThread.currentThread());
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_go_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 1)
			return Primitives.num_args_err();
		Binding binding = env.getTagBinding(args.first());
		if (binding == null)
			return Lisp
					.error(new ControlError("No tag named " + args.first().writeToString() + " is currently visible."));

		return Lisp.nonLocalGo(binding, args.first());
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_macrolet_execute(SubLObject args, Environment env) {
		SubLObject defs = Lisp.checkList(args.first());
		final LispThread thread = LispThread.currentThread();
		final SpecialBindingsMark mark = thread.markSpecialBindings();

		try {
			Environment ext = new Environment(env);
			while (defs != Lisp.NIL) {
				SubLObject def = Lisp.checkList(defs.first());
				SubLSymbol symbol = Lisp.checkSymbol(def.first());
				SubLSymbol make_expander_for_macrolet = Lisp.PACKAGE_SYS.intern("MAKE-EXPANDER-FOR-MACROLET");
				SubLObject expander = make_expander_for_macrolet.execute(def);
				Closure expansionFunction = new Closure(expander, env);
				MacroObject macroObject = new MacroObject(symbol, expansionFunction);
				ext.addFunctionBinding(symbol, macroObject);
				defs = defs.rest();
			}
			return Lisp.progn(ext.processDeclarations(args.rest()), ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_multiple_value_bind_execute(SubLObject args, Environment env) {
		SubLObject vars = args.first();
		args = args.rest();
		SubLObject valuesForm = args.first();
		SubLObject body = args.rest();
		final LispThread thread = LispThread.currentThread();
		SubLObject value = Lisp.eval(valuesForm, env, thread);
		SubLObject[] values = thread._values;
		if (values == null) {
			// eval() did not return multiple values.
			values = LispObjectFactory.makeLispObjectArray(1);
			values[0] = value;
		}
		// Process declarations.
		SubLObject bodyAndDecls = Lisp.parseBody(body, false);
		SubLObject specials = Lisp.parseSpecials(bodyAndDecls.NTH(1));
		body = bodyAndDecls.first();

		final SpecialBindingsMark mark = thread.markSpecialBindings();
		final Environment ext = new Environment(env);
		int i = 0;
		SubLObject var = vars.first();
		while (var != Lisp.NIL) {
			final SubLSymbol sym;

			sym = Lisp.checkSymbol(var);

			SubLObject val = i < values.length ? values[i] : Lisp.NIL;
			if (specials != Lisp.NIL && Lisp.memq(sym, specials)) {
				thread.bindSpecial(sym, val);
				ext.declareSpecial(sym);
			} else if (sym.isSpecialVariable())
				thread.bindSpecial(sym, val);
			else
				ext.bindSymbolVoid(sym, val);
			vars = vars.rest();
			var = vars.first();
			++i;
		}
		// Make sure free special declarations are visible in the body.
		// "The scope of free declarations specifically does not include
		// initialization forms for bindings established by the form
		// containing the declarations." (3.3.4)
		while (specials != Lisp.NIL) {
			SubLSymbol symbol = (SubLSymbol) specials.first();
			ext.declareSpecial(symbol);
			specials = ((SubLCons) specials).rest();
		}
		thread._values = null;
		SubLObject result = Lisp.NIL;
		try {
			result = Lisp.progn(body, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_multiple_value_call_execute(SubLObject args, Environment env) {
		if (args.cl_length() == 0)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		SubLObject function;
		SubLObject obj = Lisp.eval(args.first(), env, thread);
		args = args.rest();
		if (obj instanceof SubLSymbol) {
			function = obj.getSymbolFunction();
			if (function == null)
				Lisp.error(new UndefinedFunction(obj));
		} else if (obj instanceof Function)
			function = obj;
		else {
			Lisp.error(new LispError(obj.writeToString() + " is not a function name."));
			return Lisp.NIL;
		}
		ArrayList<SubLObject> arrayList = new ArrayList<SubLObject>();
		while (args != Lisp.NIL) {
			SubLObject form = args.first();
			SubLObject result = Lisp.eval(form, env, thread);
			SubLObject[] values = thread._values;
			if (values != null)
				for (int i = 0; i < values.length; i++)
					arrayList.add(values[i]);
			else
				arrayList.add(result);
			args = ((SubLCons) args).rest();
		}
		SubLObject[] argv = new SubLObject[arrayList.size()];
		arrayList.toArray(argv);
		return Lisp.funcall(function, argv, thread);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_multiple_value_list_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 1)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.eval(((SubLCons) args).first(), env, thread);
		SubLObject[] values = thread._values;
		if (values == null)
			return LispObjectFactory.makeCons(result);
		thread._values = null;
		SubLObject list = Lisp.NIL;
		for (int i = values.length; i-- > 0;)
			list = LispObjectFactory.makeCons(values[i], list);
		return list;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_multiple_value_prog1_execute(SubLObject args, Environment env) {
		if (args.cl_length() == 0)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.eval(args.first(), env, thread);
		SubLObject[] values = thread._values;
		while ((args = args.rest()) != Lisp.NIL)
			Lisp.eval(args.first(), env, thread);
		if (values != null)
			thread.setValues(values);
		else
			thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_nth_value_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 2)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		int n = Lisp.eval(args.first(), env, thread).intValue();
		if (n < 0)
			n = 0;
		SubLObject result = Lisp.eval(args.second(), env, thread);
		SubLObject[] values = thread._values;
		thread._values = null;
		if (values == null)
			// A single value was returned.
			return n == 0 ? result : Lisp.NIL;
		if (n < values.length)
			return values[n];
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_or_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = Lisp.NIL;
		while (args != Lisp.NIL) {
			result = Lisp.eval(args.first(), env, thread);
			if (result != Lisp.NIL) {
				if (((SubLCons) args).rest() != Lisp.NIL)
					// Not the last form.
					thread._values = null;
				break;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_return_from_execute(SubLObject args, Environment env) {
		final int length = args.cl_length();
		if (length < 1 || length > 2)
			return Primitives.num_args_err();
		SubLSymbol symbol;
		symbol = Lisp.checkSymbol(args.first());

		return Lisp.nonLocalReturn(env.getBlockBinding(symbol), symbol,
				length == 2 ? Lisp.eval(args.second(), env, LispThread.currentThread()) : Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_tagbody_execute(SubLObject args, Environment env) {
		Environment ext = new Environment(env);
		try {
			return Lisp.processTagBody(args, Lisp.preprocessTagBody(args, ext), ext);
		} finally {
			ext.inactive = true;
		}
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_throw_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 2)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		thread.throwToTag(Lisp.eval(args.first(), env, thread), Lisp.eval(args.second(), env, thread));
		// Not reached.
		return Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_unless_execute(SubLObject args, Environment env) {
		if (args == Lisp.NIL)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		if (Lisp.eval(args.first(), env, thread) == Lisp.NIL) {
			args = args.rest();
			thread.clearValues();
			return Lisp.progn(args, env, thread);
		}
		return thread.setValues(Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_unwind_protect_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result;
		SubLObject[] values;
		try {
			result = Lisp.eval(args.first(), env, thread);
		} finally {
			values = thread._values;
			SubLObject body = args.rest();
			while (body != Lisp.NIL) {
				Lisp.eval(body.first(), env, thread);
				body = ((SubLCons) body).rest();
			}
			thread._values = values;
		}
		if (values != null)
			thread.setValues(values);
		else
			thread._values = null;
		return result;
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @param env
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static public SubLObject sf_when_execute(SubLObject args, Environment env) {
		if (args == Lisp.NIL)
			return Primitives.num_args_err();
		final LispThread thread = LispThread.currentThread();
		if (Lisp.eval(args.first(), env, thread) != Lisp.NIL) {
			args = args.rest();
			thread.clearValues();
			return Lisp.progn(args, env, thread);
		}
		return thread.setValues(Lisp.NIL);
	}

	/**
	 * Description of the Method
	 *
	 * @param args
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	static private String static__format(SubLObject[] args) {
		SubLObject formatControl = args[0];
		SubLObject formatArguments = Lisp.NIL;
		for (int i = 1; i < args.length; i++)
			formatArguments = LispObjectFactory.makeCons(args[i], formatArguments);
		formatArguments = formatArguments.nreverse();
		return Lisp.format(formatControl, formatArguments);
	}
}

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

import javax.jws.Oneway;


import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlineSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.NoInline;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.LispPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

/**
 *  Description of the Class
 *
 * @author    Administrator
 */
public final class Primitives {
	private static SubLObject num_args_err() {
		// TODO Auto-generated method stub
		return error(new WrongNumberOfArgumentsException("num_args_err"));
	}

	// ### *
	public static final Primitive MULTIPLY = new pf_multiply();

	// ### /
	public static final Primitive DIVIDE = new pf_divide();

	// ### min
	public static final Primitive MIN = new pf_min();

	// ### max
	public static final Primitive MAX = new pf_max();

	// ### append
	public static final Primitive APPEND = new pf_append();

	// ### funcall
	// This needs to be public for LispAPI.java.
	public static final Primitive FUNCALL = new pf_funcall();

	@NoInline
	// ### apply
	public static final Primitive APPLY = new pf_apply();

	// ### nreverse
	public static final Primitive NREVERSE = new pf_nreverse();

	// ### symbol-name
	public static final Primitive SYMBOL_NAME = new pf_symbol_name();

	// ### symbol-package
	public static final Primitive SYMBOL_PACKAGE = new pf_symbol_package();

	// ### symbol-function
	public static final Primitive SYMBOL_FUNCTION = new pf_symbol_function();

	@NoInline
	// ### %set-symbol-function
	public static final Primitive _SET_SYMBOL_FUNCTION = new pf__set_symbol_function();

	// ### symbol-plist
	public static final Primitive SYMBOL_PLIST = new pf_symbol_plist();

	// ### keywordp
	public static final Primitive KEYWORDP = new pf_keywordp();

	// ### make-symbol
	public static final Primitive MAKE_SYMBOL = new pf_make_symbol();

	// ### makunbound
	public static final Primitive MAKUNBOUND = new pf_makunbound();

	// ### eql
	static final Primitive EQL = new pf_eql();

	// ### list-delete-eq item list => result-list
	static final Primitive LIST_DELETE_EQ = new pf_list_delete_eq();

	// ### list-delete-eql item list => result-list
	static final Primitive LIST_DELETE_EQL = new pf_list_delete_eql();

	// ### identity
	private static final Primitive IDENTITY = new pf_identity();

	// ### compiled-function-p
	private static final Primitive COMPILED_FUNCTION_P = new pf_compiled_function_p();

	// ### consp
	private static final Primitive CONSP = new pf_consp();

	// ### listp
	private static final Primitive LISTP = new pf_listp();

	// ### abs
	private static final Primitive ABS = new pf_abs();

	@NoInline
	// ### %eval
	private static final Primitive _EVAL = new pf__eval();

	// ### eq
	private static final Primitive EQ = new pf_eq();

	// ### equal
	private static final Primitive EQUAL = new pf_equal();

	// ### equalp
	private static final Primitive EQUALP = new pf_equalp();

	// ### values
	private static final Primitive VALUES = new pf_values();

	// ### values-list list => element*
	// Returns the elements of the list as multiple values.
	private static final Primitive VALUES_LIST = new pf_values_list();

	// ### cons
	private static final Primitive CONS = new pf_cons();

	@NoInline
	// ### length
	private static final Primitive _LENGTH = new pf__length();

	// ### length
	private static final Primitive LENGTH = new pf_length();

	// ### elt
	private static final Primitive ELT = new pf_elt();

	@NoInline
	// ### %elt
	private static final Primitive _ELT = new pf__elt();

	// ### atom
	private static final Primitive ATOM = new pf_atom();

	// ### constantp
	private static final Primitive CONSTANTP = new pf_constantp();

	// ### functionp
	private static final Primitive FUNCTIONP = new pf_functionp();

	// ### special-operator-p
	private static final Primitive SPECIAL_OPERATOR_P = new pf_special_operator_p();

	// ### symbolp
	private static final Primitive SYMBOLP = new pf_symbolp();

	// ### endp
	private static final Primitive ENDP = new pf_endp();

	// ### null
	private static final Primitive NULL = new pf_null();

	// ### not
	private static final Primitive NOT = new pf_not();

	// ### plusp
	private static final Primitive PLUSP = new pf_plusp();

	// ### minusp
	private static final Primitive MINUSP = new pf_minusp();

	// ### zerop
	private static final Primitive ZEROP = new pf_zerop();

	// ### fixnump
	private static final Primitive FIXNUMP = new pf_fixnump();

	// ### symbol-value
	private static final Primitive SYMBOL_VALUE = new pf_symbol_value();

	// ### set symbol value => value
	private static final Primitive SET = new pf_set();

	// ### rplaca
	private static final Primitive RPLACA = new pf_rplaca();

	// ### rplacd
	private static final Primitive RPLACD = new pf_rplacd();

	// ### +
	private static final Primitive ADD = new pf_add();

	// ### 1+
	private static final Primitive ONE_PLUS = new pf_one_plus();

	// ### -
	private static final Primitive SUBTRACT = new pf_subtract();

	// ### 1-
	private static final Primitive ONE_MINUS = new pf_one_minus();

	// ### when
	private static final SpecialOperator WHEN = new sf_when();

	// ### unless
	private static final SpecialOperator UNLESS = new sf_unless();

	// ### %stream-output-object object stream => object
	private static final Primitive _STREAM_OUTPUT_OBJECT = new pf__stream_output_object();

	// ### %output-object object stream => object
	private static final Primitive _OUTPUT_OBJECT = new pf__output_object();

	// ### %write-to-string object => string
	private static final Primitive _WRITE_TO_STRING = new pf__write_to_string();

	// ### %stream-terpri output-stream => nil
	private static final Primitive _STREAM_TERPRI = new pf__stream_terpri();

	// ### %terpri output-stream => nil
	private static final Primitive _TERPRI = new pf__terpri();

	// ### %fresh-line
	// %fresh-line &optional output-stream => generalized-boolean
	private static final Primitive _FRESH_LINE = new pf__fresh_line();

	// ### boundp
	// Determines only whether a symbol has a value in the global environment;
	// any lexical bindings are ignored.
	private static final Primitive BOUNDP = new pf_boundp();

	// ### fboundp
	private static final Primitive FBOUNDP = new pf_fboundp();

	// ### fmakunbound name => name
	private static final Primitive FMAKUNBOUND = new pf_fmakunbound();

	@NoInline
	// ### setf-function-name-p
	private static final Primitive SETF_FUNCTION_NAME_P = new pf_setf_function_name_p();

	// ### remprop
	private static final Primitive REMPROP = new pf_remprop();

	// ### nconc
	private static final Primitive NCONC = new pf_nconc();

	// ### =
	// Numeric equality.
	private static final Primitive EQUALS = new pf_equals();

	// ### /=
	// Returns true if no two numbers are the same; otherwise returns false.
	private static final Primitive NOT_EQUALS = new pf_not_equals();

	// ### <
	// Numeric comparison.
	private static final Primitive LT = new pf_lt();

	// ### <=
	private static final Primitive LE = new pf_le();

	// ### >
	private static final Primitive GT = new pf_gt();

	// ### >=
	private static final Primitive GE = new pf_ge();

	// ### nth n list => object
	private static final Primitive NTH = new pf_nth();

	// ### %set-nth n list new-object => new-object
	private static final Primitive _SET_NTH = new pf__set_nth();

	// ### nthcdr
	private static final Primitive NTHCDR = new pf_nthcdr();

	/**  Stub to be replaced later when signal.lisp has been loaded. */
	// ### error
	@NoInline
	private static final Primitive ERROR = new pf_error();

	/**  Stub replaced when compiler-pass2.lisp has been loaded */
	// ### autocompile
	@NoInline
	private static final Primitive AUTOCOMPILE = new pf_autocompile();

	// ### signal
	/**
	 *  Placeholder function, to be replaced by the function defined in signal.lisp Calling this function is an error:
	 *  we're not set up for signalling yet.
	 */
	@NoInline
	private static final Primitive SIGNAL = new pf_signal();

	// ### undefined-function-called
	// Redefined in restart.lisp.
	@NoInline
	private static final Primitive UNDEFINED_FUNCTION_CALLED = new pf_undefined_function_called();

	// ### %format
	@NoInline
	private static final Primitive _FORMAT = new pf__format();

	private static final SubLSymbol _SIMPLE_FORMAT_FUNCTION_ = internSpecial("*SIMPLE-FORMAT-FUNCTION*", PACKAGE_SYS, _FORMAT);

	// ### %defun name definition => name
	@NoInline
	private static final Primitive _DEFUN = new pf__defun();

	// ### fdefinition-block-name
	@NoInline
	private static final Primitive FDEFINITION_BLOCK_NAME = new pf_fdefinition_block_name();

	// ### macro-function
	private static final Primitive MACRO_FUNCTION = new pf_macro_function();

	// ### defmacro
	@NoInline
	private static final SpecialOperator DEFMACRO = new sf_defmacro();

	// ### make-macro
	@NoInline
	private static final Primitive MAKE_MACRO = new pf_make_macro();

	// ### macro-function-p
	private static final Primitive MACRO_FUNCTION_P = new pf_macro_function_p();

	// ### make-symbol-macro
	@NoInline
	private static final Primitive MAKE_SYMBOL_MACRO = new pf_make_symbol_macro();

	// ### symbol-macro-p
	private static final Primitive SYMBOL_MACRO_P = new pf_symbol_macro_p();

	// ### %defparameter
	@NoInline
	private static final Primitive _DEFPARAMETER = new pf__defparameter();

	// ### %defvar
	private static final Primitive _DEFVAR = new pf__defvar();

	// ### %defconstant name initial-value documentation => name
	private static final Primitive _DEFCONSTANT = new pf__defconstant();

	// ### cond
	private static final SpecialOperator COND = new sf_cond();

	// ### case
	private static final SpecialOperator CASE = new sf_case();

	// ### ecase
	private static final SpecialOperator ECASE = new sf_ecase();

	//@NoInline
	// ### type-of
	private static final Primitive TYPE_OF = new pf_type_of();

	// ### class-of
	@NoInline
	private static final Primitive CLASS_OF = new pf_class_of();

	// ### simple-typep
	private static final Primitive SIMPLE_TYPEP = new pf_simple_typep();

	// ### function-lambda-expression function =>
	// lambda-expression, closure-p, name
	private static final Primitive FUNCTION_LAMBDA_EXPRESSION = new pf_function_lambda_expression();

	// ### mapcar
	private static final Primitive MAPCAR = new pf_mapcar();

	// ### mapc
	private static final Primitive MAPC = new pf_mapc();

	@NoInline
	// ### macroexpand
	private static final Primitive MACROEXPAND = new pf_macroexpand();

	@NoInline
	// ### macroexpand-1
	private static final Primitive MACROEXPAND_1 = new pf_macroexpand_1();

	// ### gensym
	private static final Primitive GENSYM = new pf_gensym();

	// ### string
	private static final Primitive STRING = new pf_string();

	// ### intern string &optional package => symbol, status
	// STATUS is one of :INHERITED, :EXTERNAL, :INTERNAL or NIL.
	// "It is implementation-dependent whether the string that becomes the new
	// symbol's name is the given string or a copy of it."
	private static final Primitive INTERN = new pf_intern();

	// ### unintern
	// unintern symbol &optional package => generalized-boolean
	private static final Primitive UNINTERN = new pf_unintern();

	// ### find-package
	private static final Primitive FIND_PACKAGE = new pf_find_package();

	// ### %make-package
	// %make-package package-name nicknames use => package
	private static final Primitive _MAKE_PACKAGE = new pf__make_package();
	@NoInline

	// ### %in-package
	private static final Primitive _IN_PACKAGE = new pf__in_package();
	@NoInline

	// ### use-package packages-to-use &optional package => t
	private static final Primitive USE_PACKAGE = new pf_use_package();

	// ### package-symbols
	private static final Primitive PACKAGE_SYMBOLS = new pf_package_symbols();
	@NoInline

	// ### package-internal-symbols
	private static final Primitive PACKAGE_INTERNAL_SYMBOLS = new pf_package_internal_symbols();
	@NoInline

	// ### package-external-symbols
	private static final Primitive PACKAGE_EXTERNAL_SYMBOLS = new pf_package_external_symbols();
	@NoInline

	// ### package-inherited-symbols
	private static final Primitive PACKAGE_INHERITED_SYMBOLS = new pf_package_inherited_symbols();
	@NoInline

	// ### export symbols &optional package
	private static final Primitive EXPORT = new pf_export();
	@NoInline

	// ### find-symbol string &optional package => symbol, status
	private static final Primitive FIND_SYMBOL = new pf_find_symbol();
	@NoInline

	// ### fset name function &optional source-position arglist documentation
	// => function
	private static final Primitive FSET = new pf_fset();
	@NoInline

	// ### %set-symbol-plist
	private static final Primitive _SET_SYMBOL_PLIST = new pf__set_symbol_plist();
	@NoInline

	// ### getf plist indicator &optional default => value
	private static final Primitive GETF = new pf_getf();
	@NoInline

	// ### get symbol indicator &optional default => value
	private static final Primitive GET = new pf_get();
	@NoInline

	// ### put symbol indicator value => value
	private static final Primitive PUT = new pf_put();
	@NoInline

	// ### macrolet
	private static final SpecialOperator MACROLET = new sf_macrolet();
	@NoInline

	private static final Primitive MAKE_EXPANDER_FOR_MACROLET = new pf_make_expander_for_macrolet();
	@NoInline

	// ### tagbody
	private static final SpecialOperator TAGBODY = new sf_tagbody();
	@NoInline

	// ### go
	private static final SpecialOperator GO = new sf_go();
	
	@NoInline
	// ### block
	private static final SpecialOperator BLOCK = new sf_block();

	@NoInline
	// ### return-from
	private static final SpecialOperator RETURN_FROM = new sf_return_from();

	@NoInline
	// ### catch
	private static final SpecialOperator CATCH = new sf_catch();
	@NoInline

	// ### throw
	private static final SpecialOperator THROW = new sf_throw();

	// ### unwind-protect
	private static final SpecialOperator UNWIND_PROTECT = new sf_unwind_protect();

	// ### eval-when
	private static final SpecialOperator EVAL_WHEN = new sf_eval_when();

	// ### multiple-value-bind
	// multiple-value-bind (var*) values-form declaration* form*
	// Should be a macro.
	private static final SpecialOperator MULTIPLE_VALUE_BIND = new sf_multiple_value_bind();

	// ### multiple-value-prog1
	private static final SpecialOperator MULTIPLE_VALUE_PROG1 = new sf_multiple_value_prog1();

	// ### multiple-value-call
	private static final SpecialOperator MULTIPLE_VALUE_CALL = new sf_multiple_value_call();

	// ### and
	// Should be a macro.
	private static final SpecialOperator AND = new sf_and();

	// ### or
	// Should be a macro.
	private static final SpecialOperator OR = new sf_or();

	// ### multiple-value-list form => list
	// Evaluates form and creates a list of the multiple values it returns.
	// Should be a macro.
	private static final SpecialOperator MULTIPLE_VALUE_LIST = new sf_multiple_value_list();

	// ### nth-value n form => object
	// Evaluates n and then form and returns the nth value returned by form, or
	// NIL if n >= number of values returned.
	// Should be a macro.
	private static final SpecialOperator NTH_VALUE = new sf_nth_value();

	// ### call-count
	private static final Primitive CALL_COUNT = new pf_call_count();

	// ### set-call-count
	private static final Primitive SET_CALL_COUNT = new pf_set_call_count();

	// ### hot-count
	private static final Primitive HOT_COUNT = new pf_hot_count();

	// ### set-hot-count
	private static final Primitive SET_HOT_COUNT = new pf_set_hot_count();

	// ### lambda-name
	private static final Primitive LAMBDA_NAME = new pf_lambda_name();

	// ### %set-lambda-name
	private static final Primitive _SET_LAMBDA_NAME = new pf__set_lambda_name();

	// ### subseq sequence start &optional end
	private static final Primitive SUBSEQ = new pf_subseq();

	@InlineSymbol
	// ### list
	private static final Primitive LIST = new pf_list();

	// ### list*
	private static final Primitive LIST_STAR = new pf_list_star();

	// ### nreconc
	private static final Primitive NRECONC = new pf_nreconc();

	// ### reverse
	private static final Primitive REVERSE = new pf_reverse();

	// ### delete-eq item sequence => result-sequence
	private static final Primitive DELETE_EQ = new pf_delete_eq();

	// ### delete-eql item seqluence => result-seqluence
	private static final Primitive DELETE_EQL = new pf_delete_eql();
	// ### %set-elt
	// %setelt sequence index newval => newval
	private static final Primitive _SET_ELT = new pf__set_elt();

	// ### %make-list
	private static final Primitive _MAKE_LIST = new pf__make_list();

	// ### %member item list key test test-not => tail
	private static final Primitive _MEMBER = new pf__member();

	// ### funcall-key function-or-nil element
	private static final Primitive FUNCALL_KEY = new pf_funcall_key();

	// ### coerce-to-function
	private static final Primitive COERCE_TO_FUNCTION = new pf_coerce_to_function();

	// ### make-closure lambda-form environment => closure
	private static final Primitive MAKE_CLOSURE = new pf_make_closure();

	// ### streamp
	private static final Primitive STREAMP = new pf_streamp();

	// ### integerp
	private static final Primitive INTEGERP = new pf_integerp();

	// ### evenp
	private static final Primitive EVENP = new pf_evenp();

	// ### oddp
	private static final Primitive ODDP = new pf_oddp();

	// ### numberp
	private static final Primitive NUMBERP = new pf_numberp();

	// ### realp
	private static final Primitive REALP = new pf_realp();

	// ### rationalp
	private static final Primitive RATIONALP = new pf_rationalp();

	// ### complex
	private static final Primitive COMPLEX = new pf_complex();

	// ### complexp
	private static final Primitive COMPLEXP = new pf_complexp();

	// ### numerator
	private static final Primitive NUMERATOR = new pf_numerator();

	// ### denominator
	private static final Primitive DENOMINATOR = new pf_denominator();

	// ### realpart
	private static final Primitive REALPART = new pf_realpart();

	// ### imagpart
	private static final Primitive IMAGPART = new pf_imagpart();

	// ### integer-length
	private static final Primitive INTEGER_LENGTH = new pf_integer_length();

	// ### gcd-2
	private static final Primitive GCD_2 = new pf_gcd_2();

	// ### identity-hash-code
	private static final Primitive IDENTITY_HASH_CODE = new pf_identity_hash_code();
	// ### uptime
	private static final Primitive UPTIME = new pf_uptime();

	// ### built-in-function-p
	private static final Primitive BUILT_IN_FUNCTION_P = new pf_built_in_function_p();

	// ### inspected-parts
	private static final Primitive INSPECTED_PARTS = new pf_inspected_parts();

	// ### inspected-description
	private static final Primitive INSPECTED_DESCRIPTION = new pf_inspected_description();

	// ### %class-name
	private static final Primitive _CLASS_NAME = new pf__class_name();

	// ### %set-class-name
	private static final Primitive _SET_CLASS_NAME = new pf__set_class_name();

	// ### class-layout
	@NoInline
	private static final Primitive CLASS_LAYOUT = new pf_class_layout();

	// ### %set-class-layout
	private static final Primitive _SET_CLASS_LAYOUT = new pf__set_class_layout();

	// ### class-direct-superclasses
	private static final Primitive CLASS_DIRECT_SUPERCLASSES = new pf_class_direct_superclasses();

	// ### %set-class-direct-superclasses
	private static final Primitive _SET_CLASS_DIRECT_SUPERCLASSES = new pf__set_class_direct_superclasses();

	// ### class-direct-subclasses
	private static final Primitive CLASS_DIRECT_SUBCLASSES = new pf_class_direct_subclasses();

	// ### %set-class-direct-subclasses
	private static final Primitive _SET_CLASS_DIRECT_SUBCLASSES = new pf__set_class_direct_subclasses();

	// ### %class-precedence-list
	private static final Primitive _CLASS_PRECEDENCE_LIST = new pf__class_precedence_list();

	// ### set-class-precedence-list
	private static final Primitive SET_CLASS_PRECEDENCE_LIST = new pf_set_class_precedence_list();

	// ### class-direct-methods
	private static final Primitive CLASS_DIRECT_METHODS = new pf_class_direct_methods();

	// ### %set-class-direct-methods
	@NoInline
	private static final Primitive _SET_CLASS_DIRECT_METHODS = new pf__set_class_direct_methods();

	// ### class-documentation
	private static final Primitive CLASS_DOCUMENTATION = new pf_class_documentation();

	// ### %set-class-documentation
	private static final Primitive _SET_CLASS_DOCUMENTATION = new pf__set_class_documentation();

	// ### class-finalized-p
	private static final Primitive CLASS_FINALIZED_P = new pf_class_finalized_p();

	// ### %set-class-finalized-p
	private static final Primitive _SET_CLASS_FINALIZED_P = new pf__set_class_finalized_p();

	// ### classp
	private static final Primitive CLASSP = new pf_classp();

	// ### char-to-utf8 char => octets
	private static final Primitive CHAR_TO_UTF8 = new pf_char_to_utf8();

	// ### %documentation
	private static final Primitive _DOCUMENTATION = new pf__documentation();

	// ### %set-documentation
	private static final Primitive _SET_DOCUMENTATION = new pf__set_documentation();

	// ### %putf
	private static final Primitive _PUTF = new pf__putf();

	// ### function-plist
	private static final Primitive FUNCTION_PLIST = new pf_function_plist();

	// ### make-keyword
	private static final Primitive MAKE_KEYWORD = new pf_make_keyword();

	// ### standard-object-p object => generalized-boolean
	private static final Primitive STANDARD_OBJECT_P = new pf_standard_object_p();

	// ### copy-tree
	private static final Primitive COPY_TREE = new JavaPrimitive(LispSymbols.COPY_TREE, "object") {

		@Override
		public SubLObject execute(SubLObject arg) {
			return COPY_TREE_execute(arg);
		}
	};

	static final public SubLObject COPY_TREE_execute(SubLObject arg) {
		if (arg instanceof SubLCons) {
			SubLCons cons = (SubLCons) arg;
			return makeCons(COPY_TREE_execute(cons.first()), COPY_TREE_execute(cons.rest()));
		} else {
			return arg;
		}
	}

	/**
	 *  Description of the Method
	 *
	 * @param  arg  Description of Parameter
	 */
	static void checkRedefinition(SubLObject arg) {
		final LispThread thread = LispThread.currentThread();
		if (_WARN_ON_REDEFINITION_.symbolValue(thread) != NIL) {
			if (arg instanceof SubLSymbol) {
				SubLObject oldDefinition = arg.getSymbolFunction();
				if (oldDefinition != null && !(oldDefinition instanceof Autoload)
						&& !(oldDefinition instanceof AutoloadedFunctionProxy)) {
					SubLObject oldSource = Extensions.SOURCE_PATHNAME.execute(arg);
					SubLObject currentSource = _SOURCE_.symbolValue(thread);
					if (currentSource == NIL) {
						currentSource = Keyword.TOP_LEVEL;
					}
					if (oldSource != NIL) {
						if (currentSource.equal(oldSource)) {
							return;
						}
						// OK
					}
					if (currentSource == Keyword.TOP_LEVEL) {
						LispSymbols.STYLE_WARN.execute(makeString("redefining ~S at top level"), arg);

					} else {
						SpecialBindingsMark mark = thread.markSpecialBindings();
						thread.bindSpecial(LispSymbols._PACKAGE_, PACKAGE_CL);
						try {
							LispSymbols.STYLE_WARN.execute(makeString("redefining ~S in ~S"), arg, currentSource);
						} finally {
							thread.resetSpecialBindings(mark);
						}
					}
				}
			}
		}
	}

	/**
	 *  Description of the Method
	 *
	 * @param  list   Description of Parameter
	 * @param  start  Description of Parameter
	 * @param  end    Description of Parameter
	 * @return        Description of the Returned Value
	 */
	static final SubLObject list_subseq(SubLObject list, int start, int end) {
		int index = 0;
		SubLObject result = NIL;
		while (list != NIL) {
			if (end >= 0 && index == end) {
				return result.nreverse();
			}
			if (index++ >= start) {
				result = makeCons(list.first(), result);
			}
			list = list.rest();
		}
		return result.nreverse();
	}

	private static final class pf_multiply extends JavaPrimitive {
		/**  Constructor for the pf_multiply object */
		pf_multiply() {
			super(LispSymbols.STAR, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_multiply_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_multiply_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_multiply_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_multiply_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_multiply_execute() {
		return Fixnum.ONE;
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_multiply_execute(SubLObject arg) {
		if (arg.isNumber()) {
			return arg;
		}
		return type_error(arg, LispSymbols.NUMBER);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_multiply_execute(SubLObject first, SubLObject second) {
		return first.mult(second);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_multiply_execute(SubLObject[] args) {
		SubLObject result = Fixnum.ONE;
		for (int i = 0; i < args.length; i++) {
			result = result.mult(args[i]);
		}
		return result;
	}

	private static final class pf_divide extends JavaPrimitive {
		/**  Constructor for the pf_divide object */
		pf_divide() {
			super(LispSymbols.SLASH, "numerator &rest denominators");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_divide_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_divide_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_divide_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_divide_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_divide_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_divide_execute(SubLObject arg) {
		return Fixnum.ONE.divideBy(arg);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_divide_execute(SubLObject first, SubLObject second) {
		return first.divideBy(second);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_divide_execute(SubLObject[] args) {
		SubLObject result = args[0];
		for (int i = 1; i < args.length; i++) {
			result = result.divideBy(args[i]);
		}
		return result;
	}

	private static final class pf_min extends JavaPrimitive {
		/**  Constructor for the pf_min object */
		pf_min() {
			super(LispSymbols.MIN, "&rest reals");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_min_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_min_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_min_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_min_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_min_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_min_execute(SubLObject arg) {
		if (arg.realp()) {
			return arg;
		}
		return type_error(arg, LispSymbols.REAL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_min_execute(SubLObject first, SubLObject second) {
		return first.numL(second) ? first : second;
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_min_execute(SubLObject[] args) {
		SubLObject result = args[0];
		if (!result.realp()) {
			type_error(result, LispSymbols.REAL);
		}
		for (int i = 1; i < args.length; i++) {
			if (args[i].numL(result)) {
				result = args[i];
			}
		}
		return result;
	}

	private static final class pf_max extends JavaPrimitive {
		/**  Constructor for the pf_max object */
		pf_max() {
			super(LispSymbols.MAX, "&rest reals");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_max_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_max_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_max_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_max_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_max_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_max_execute(SubLObject arg) {
		if (arg.realp()) {
			return arg;
		}
		return type_error(arg, LispSymbols.REAL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_max_execute(SubLObject first, SubLObject second) {
		return first.numG(second) ? first : second;
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_max_execute(SubLObject[] args) {
		SubLObject result = args[0];
		if (!result.realp()) {
			type_error(result, LispSymbols.REAL);
		}
		for (int i = 1; i < args.length; i++) {
			if (args[i].numG(result)) {
				result = args[i];
			}
		}
		return result;
	}

	private static final class pf_identity extends JavaPrimitive {
		/**  Constructor for the pf_identity object */
		pf_identity() {
			super(LispSymbols.IDENTITY, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_identity_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_identity_execute(SubLObject arg) {
		return arg;
	}

	private static final class pf_compiled_function_p extends JavaPrimitive {
		/**  Constructor for the pf_compiled_function_p object */
		pf_compiled_function_p() {
			super(LispSymbols.COMPILED_FUNCTION_P, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_compiled_function_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_compiled_function_p_execute(SubLObject arg) {
		return arg.typep(LispSymbols.COMPILED_FUNCTION);
	}

	private static final class pf_consp extends JavaPrimitive {
		/**  Constructor for the pf_consp object */
		pf_consp() {
			super(LispSymbols.CONSP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_consp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_consp_execute(SubLObject arg) {
		return arg instanceof SubLCons ? T : NIL;
	}

	private static final class pf_listp extends JavaPrimitive {
		/**  Constructor for the pf_listp object */
		pf_listp() {
			super(LispSymbols.LISTP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_listp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_listp_execute(SubLObject arg) {
		return arg.LISTP();
	}

	private static final class pf_abs extends JavaPrimitive {
		/**  Constructor for the pf_abs object */
		pf_abs() {
			super(LispSymbols.ABS, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_abs_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_abs_execute(SubLObject arg) {
		return arg.ABS();
	}

	private static final class pf__eval extends JavaPrimitive {
		/**  Constructor for the pf__eval object */
		pf__eval() {
			super("%eval", PACKAGE_SYS, false, "form");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__eval_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	@NoInline
	static public SubLObject pf__eval_execute(SubLObject arg) {
		return eval(arg, new Environment(), LispThread.currentThread());
	}

	private static final class pf_eq extends JavaPrimitive {
		/**  Constructor for the pf_eq object */
		pf_eq() {
			super(LispSymbols.EQ, "x y");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_eq_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_eq_execute(SubLObject first, SubLObject second) {
		return first == second ? T : NIL;
	}

	private static final class pf_eql extends JavaPrimitive {
		/**  Constructor for the pf_eql object */
		pf_eql() {
			super(LispSymbols.EQL, "x y");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_eql_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_eql_execute(SubLObject first, SubLObject second) {
		return first.eql(second) ? T : NIL;
	}

	private static final class pf_equal extends JavaPrimitive {
		/**  Constructor for the pf_equal object */
		pf_equal() {
			super(LispSymbols.EQUAL, "x y");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_equal_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_equal_execute(SubLObject first, SubLObject second) {
		return first.equal(second) ? T : NIL;
	}

	private static final class pf_equalp extends JavaPrimitive {
		/**  Constructor for the pf_equalp object */
		pf_equalp() {
			super(LispSymbols.EQUALP, "x y");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_equalp_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_equalp_execute(SubLObject first, SubLObject second) {
		return first.equalp(second) ? T : NIL;
	}

	private static final class pf_values extends JavaPrimitive {
		/**  Constructor for the pf_values object */
		pf_values() {
			super(LispSymbols.VALUES, "&rest object");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_values_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_values_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_values_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_values_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf_values_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_values_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_values_execute() {
		return LispThread.currentThread().setValues();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject arg) {
		return LispThread.currentThread().setValues(arg);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().setValues(first, second);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispThread.currentThread().setValues(first, second, third);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_values_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return LispThread.currentThread().setValues(first, second, third, fourth);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_values_execute(SubLObject[] args) {
		return LispThread.currentThread().setValues(args);
	}

	private static final class pf_values_list extends JavaPrimitive {
		/**  Constructor for the pf_values_list object */
		pf_values_list() {
			super(LispSymbols.VALUES_LIST, "list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_values_list_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_values_list_execute(SubLObject arg) {
		if (arg == NIL) {
			return LispThread.currentThread().setValues();
		}
		if (arg.rest() == NIL) {
			return arg.first();
		}
		return LispThread.currentThread().setValues(arg.copyToArray());
	}

	private static final class pf_cons extends JavaPrimitive {
		/**  Constructor for the pf_cons object */
		pf_cons() {
			super(LispSymbols.CONS, "object-1 object-2");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_cons_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_cons_execute(SubLObject first, SubLObject second) {
		return makeCons(first, second);
	}

	private static final class pf__length extends JavaPrimitive {
		/**  Constructor for the _pf_length object */
		pf__length() {
			super("%LENGTH", PACKAGE_SYS, false, "sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return _pf_length_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject _pf_length_execute(SubLObject arg) {
		return arg.LENGTH();
	}

	private static final class pf_length extends JavaPrimitive {
		/**  Constructor for the pf_length object */
		pf_length() {
			super("LENGTH", PACKAGE_SYS, false, "sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_length_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_length_execute(SubLObject arg) {
		return arg.LENGTH();
	}

	private static final class pf_elt extends JavaPrimitive {
		/**  Constructor for the pf_elt object */
		pf_elt() {
			super("ELT", PACKAGE_SYS, false, "sequence index");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_elt_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_elt_execute(SubLObject first, SubLObject second) {
		return first.elt(second.intValue());
	}

	private static final class pf__elt extends JavaPrimitive {
		/**  Constructor for the _pf_elt object */
		pf__elt() {
			super("%ELT", PACKAGE_SYS, false, "sequence index");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return _pf_elt_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject _pf_elt_execute(SubLObject first, SubLObject second) {
		return first.elt(second.intValue());
	}

	private static final class pf_atom extends JavaPrimitive {
		/**  Constructor for the pf_atom object */
		pf_atom() {
			super(LispSymbols.ATOM, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_atom_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_atom_execute(SubLObject arg) {
		return arg instanceof SubLCons ? NIL : T;
	}

	private static final class pf_constantp extends JavaPrimitive {
		/**  Constructor for the pf_constantp object */
		pf_constantp() {
			super(LispSymbols.CONSTANTP, "form &optional environment");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_constantp_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_constantp_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_constantp_execute(SubLObject arg) {
		return arg.constantp() ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_constantp_execute(SubLObject first, SubLObject second) {
		return first.constantp() ? T : NIL;
	}

	private static final class pf_functionp extends JavaPrimitive {
		/**  Constructor for the pf_functionp object */
		pf_functionp() {
			super(LispSymbols.FUNCTIONP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_functionp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_functionp_execute(SubLObject arg) {
		return (arg instanceof Function || arg instanceof StandardGenericFunction) ? T : NIL;
	}

	private static final class pf_special_operator_p extends JavaPrimitive {
		/**  Constructor for the pf_special_operator_p object */
		pf_special_operator_p() {
			super(LispSymbols.SPECIAL_OPERATOR_P, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_special_operator_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_special_operator_p_execute(SubLObject arg) {
		return arg.isSpecialOperator() ? T : NIL;
	}

	private static final class pf_symbolp extends JavaPrimitive {
		/**  Constructor for the pf_symbolp object */
		pf_symbolp() {
			super(LispSymbols.SYMBOLP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbolp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbolp_execute(SubLObject arg) {
		return arg instanceof SubLSymbol ? T : NIL;
	}

	private static final class pf_endp extends JavaPrimitive {
		/**  Constructor for the pf_endp object */
		pf_endp() {
			super(LispSymbols.ENDP, "list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_endp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_endp_execute(SubLObject arg) {
		return arg.endp() ? T : NIL;
	}

	private static final class pf_null extends JavaPrimitive {
		/**  Constructor for the pf_null object */
		pf_null() {
			super(LispSymbols.NULL, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_null_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_null_execute(SubLObject arg) {
		return arg == NIL ? T : NIL;
	}

	private static final class pf_not extends JavaPrimitive {
		/**  Constructor for the pf_not object */
		pf_not() {
			super(LispSymbols.NOT, "x");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_not_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_not_execute(SubLObject arg) {
		return arg == NIL ? T : NIL;
	}

	private static final class pf_plusp extends JavaPrimitive {
		/**  Constructor for the pf_plusp object */
		pf_plusp() {
			super(LispSymbols.PLUSP, "real");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_plusp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_plusp_execute(SubLObject arg) {
		return arg.PLUSP();
	}

	private static final class pf_minusp extends JavaPrimitive {
		/**  Constructor for the pf_minusp object */
		pf_minusp() {
			super(LispSymbols.MINUSP, "real");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_minusp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_minusp_execute(SubLObject arg) {
		return arg.MINUSP();
	}

	private static final class pf_zerop extends JavaPrimitive {
		/**  Constructor for the pf_zerop object */
		pf_zerop() {
			super(LispSymbols.ZEROP, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_zerop_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_zerop_execute(SubLObject arg) {
		return arg.ZEROP();
	}

	private static final class pf_fixnump extends JavaPrimitive {
		/**  Constructor for the pf_fixnump object */
		pf_fixnump() {
			super("fixnump", PACKAGE_EXT, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_fixnump_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_fixnump_execute(SubLObject arg) {
		return arg instanceof Fixnum ? T : NIL;
	}

	private static final class pf_symbol_value extends JavaPrimitive {
		/**  Constructor for the pf_symbol_value object */
		pf_symbol_value() {
			super(LispSymbols.SYMBOL_VALUE, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_value_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_value_execute(SubLObject arg) {
		final SubLObject value;
		value = checkSymbol(arg).symbolValue();
		if (value instanceof SymbolMacro) {
			return error(new LispError(arg.writeToString() + " has no dynamic value."));
		}
		return value;
	}

	private static final class pf_set extends JavaPrimitive {
		/**  Constructor for the pf_set object */
		pf_set() {
			super(LispSymbols.SET, "symbol value");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_set_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_set_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().setSpecialVariable(checkSymbol(first), second);
	}

	private static final class pf_rplaca extends JavaPrimitive {
		/**  Constructor for the pf_rplaca object */
		pf_rplaca() {
			super(LispSymbols.RPLACA, "cons object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_rplaca_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_rplaca_execute(SubLObject first, SubLObject second) {
		first.setCar(second);
		return first;
	}

	private static final class pf_rplacd extends JavaPrimitive {
		/**  Constructor for the pf_rplacd object */
		pf_rplacd() {
			super(LispSymbols.RPLACD, "cons object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_rplacd_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_rplacd_execute(SubLObject first, SubLObject second) {
		first.setCdr(second);
		return first;
	}

	private static final class pf_add extends JavaPrimitive {
		/**  Constructor for the pf_add object */
		pf_add() {
			super(LispSymbols.PLUS, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_add_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_add_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_add_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_add_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_add_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_add_execute() {
		return Fixnum.ZERO;
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_add_execute(SubLObject arg) {
		if (arg.isNumber()) {
			return arg;
		}
		return type_error(arg, LispSymbols.NUMBER);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_add_execute(SubLObject first, SubLObject second) {
		return first.add(second);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_add_execute(SubLObject first, SubLObject second, SubLObject third) {
		return first.add(second).add(third);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_add_execute(SubLObject[] args) {
		SubLObject result = Fixnum.ZERO;
		final int length = args.length;
		for (int i = 0; i < length; i++) {
			result = result.add(args[i]);
		}
		return result;
	}

	private static final class pf_one_plus extends JavaPrimitive {
		/**  Constructor for the pf_one_plus object */
		pf_one_plus() {
			super(LispSymbols.ONE_PLUS, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_one_plus_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_one_plus_execute(SubLObject arg) {
		return arg.inc();
	}

	private static final class pf_subtract extends JavaPrimitive {
		/**  Constructor for the pf_subtract object */
		pf_subtract() {
			super(LispSymbols.MINUS, "minuend &rest subtrahends");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_subtract_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_subtract_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_subtract_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_subtract_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_subtract_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_subtract_execute(SubLObject arg) {
		return arg.negate();
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_subtract_execute(SubLObject first, SubLObject second) {
		return first.sub(second);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_subtract_execute(SubLObject[] args) {
		SubLObject result = args[0];
		for (int i = 1; i < args.length; i++) {
			result = result.sub(args[i]);
		}
		return result;
	}

	private static final class pf_one_minus extends JavaPrimitive {
		/**  Constructor for the pf_one_minus object */
		pf_one_minus() {
			super(LispSymbols.ONE_MINUS, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_one_minus_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_one_minus_execute(SubLObject arg) {
		return arg.dec();
	}

	private static final class sf_when extends SpecialOperator {
		/**  Constructor for the sf_when object */
		sf_when() {
			super(LispSymbols.WHEN);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_when_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_when_execute(SubLObject args, Environment env) {
		if (args == NIL) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		if (eval(args.first(), env, thread) != NIL) {
			args = args.rest();
			thread.clearValues();
			return progn(args, env, thread);
		}
		return thread.setValues(NIL);
	}

	private static final class sf_unless extends SpecialOperator {
		/**  Constructor for the sf_unless object */
		sf_unless() {
			super(LispSymbols.UNLESS);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_unless_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_unless_execute(SubLObject args, Environment env) {
		if (args == NIL) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		if (eval(args.first(), env, thread) == NIL) {
			args = args.rest();
			thread.clearValues();
			return progn(args, env, thread);
		}
		return thread.setValues(NIL);
	}

	private static final class pf__stream_output_object extends JavaPrimitive {
		/**  Constructor for the pf__stream_output_object object */
		pf__stream_output_object() {
			super("%stream-output-object", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__stream_output_object_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__stream_output_object_execute(SubLObject first, SubLObject second) {
		checkStream(second)._writeString(first.writeToString());
		return first;
	}

	private static final class pf__output_object extends JavaPrimitive {
		/**  Constructor for the pf__output_object object */
		pf__output_object() {
			super("%output-object", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__output_object_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__output_object_execute(SubLObject first, SubLObject second) {
		final SubLObject out;
		if (second == T) {
			out = LispSymbols.TERMINAL_IO.symbolValue();
		} else if (second == NIL) {
			out = LispSymbols.STANDARD_OUTPUT.symbolValue();
		} else {
			out = second;
		}
		checkStream(out)._writeString(first.writeToString());
		return first;
	}

	private static final class pf__write_to_string extends JavaPrimitive {
		/**  Constructor for the pf__write_to_string object */
		pf__write_to_string() {
			super("%write-to-string", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__write_to_string_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__write_to_string_execute(SubLObject arg) {
		return makeString(arg.writeToString());
	}

	private static final class pf__stream_terpri extends JavaPrimitive {
		/**  Constructor for the pf__stream_terpri object */
		pf__stream_terpri() {
			super("%stream-terpri", PACKAGE_SYS, true, "output-stream");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__stream_terpri_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__stream_terpri_execute(SubLObject arg) {
		checkStream(arg)._writeChar('\n');
		return NIL;
	}

	private static final class pf__terpri extends JavaPrimitive {
		/**  Constructor for the pf__terpri object */
		pf__terpri() {
			super("%terpri", PACKAGE_SYS, false, "output-stream");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__terpri_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__terpri_execute(SubLObject arg) {
		if (arg == T) {
			arg = LispSymbols.TERMINAL_IO.symbolValue();
		} else if (arg == NIL) {
			arg = LispSymbols.STANDARD_OUTPUT.symbolValue();
		}
		final LispStream stream;
		stream = checkStream(arg);
		return stream.terpri();
	}

	private static final class pf__fresh_line extends JavaPrimitive {
		/**  Constructor for the pf__fresh_line object */
		pf__fresh_line() {
			super("%fresh-line", PACKAGE_SYS, false, "output-stream");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__fresh_line_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__fresh_line_execute(SubLObject arg) {
		if (arg == T) {
			arg = LispSymbols.TERMINAL_IO.symbolValue();
		} else if (arg == NIL) {
			arg = LispSymbols.STANDARD_OUTPUT.symbolValue();
		}
		final LispStream stream;
		stream = checkStream(arg);
		return stream.freshLine();
	}

	private static final class pf_boundp extends JavaPrimitive {
		/**  Constructor for the pf_boundp object */
		pf_boundp() {
			super(LispSymbols.BOUNDP, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_boundp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_boundp_execute(SubLObject arg) {
		final SubLSymbol symbol;
		symbol = checkSymbol(arg);
		// PROGV: "If too few values are supplied, the remaining symbols
		// are bound and then made to have no value." So BOUNDP must
		// explicitly check for a binding with no value.
		SpecialBinding binding = LispThread.currentThread().getSpecialBinding(symbol);
		if (binding != null) {
			return binding.value != null ? T : NIL;
		}
		// No binding.
		return symbol.getSymbolValue() != null ? T : NIL;
	}

	private static final class pf_fboundp extends JavaPrimitive {
		/**  Constructor for the pf_fboundp object */
		pf_fboundp() {
			super(LispSymbols.FBOUNDP, "name");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_fboundp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_fboundp_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol) {
			return arg.getSymbolFunction() != null ? T : NIL;
		}
		if (isValidSetfFunctionName(arg)) {
			SubLObject f = get(arg.second(), LispSymbols.SETF_FUNCTION, null);
			return f != null ? T : NIL;
		}
		return type_error(arg, FUNCTION_NAME);
	}

	private static final class pf_fmakunbound extends JavaPrimitive {
		/**  Constructor for the pf_fmakunbound object */
		pf_fmakunbound() {
			super(LispSymbols.FMAKUNBOUND, "name");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_fmakunbound_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_fmakunbound_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol) {
			checkSymbol(arg).setSymbolFunction(null);
			return arg;
		}
		if (isValidSetfFunctionName(arg)) {
			remprop((SubLSymbol) arg.second(), LispSymbols.SETF_FUNCTION);
			return arg;
		}
		return type_error(arg, FUNCTION_NAME);
	}

	private static final class pf_setf_function_name_p extends JavaPrimitive {
		/**  Constructor for the pf_setf_function_name_p object */
		pf_setf_function_name_p() {
			super("setf-function-name-p", PACKAGE_SYS, true, "thing");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_setf_function_name_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_setf_function_name_p_execute(SubLObject arg) {
		return isValidSetfFunctionName(arg) ? T : NIL;
	}

	private static final class pf_remprop extends JavaPrimitive {
		/**  Constructor for the pf_remprop object */
		pf_remprop() {
			super(LispSymbols.REMPROP, "symbol indicator");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_remprop_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_remprop_execute(SubLObject first, SubLObject second) {
		return remprop(checkSymbol(first), second);
	}

	private static final class pf_append extends JavaPrimitive {
		/**  Constructor for the pf_append object */
		pf_append() {
			super(LispSymbols.APPEND, "&rest lists");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_append_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_append_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_append_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_append_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_append_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_append_execute() {
		return NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_append_execute(SubLObject arg) {
		return arg;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_append_execute(SubLObject first, SubLObject second) {
		if (first == NIL) {
			return second;
		}
		// APPEND is required to copy its first argument.
		SubLCons result = makeCons(first.first());
		SubLCons splice = result;
		first = first.rest();
		while (first != NIL) {
			SubLCons temp = makeCons(first.first());
			splice.setCdr(temp);
			splice = temp;
			first = first.rest();
		}
		splice.setCdr(second);
		return result;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_append_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first == NIL) {
			return pf_append_execute(second, third);
		}
		SubLCons result = makeCons(first.first());
		SubLCons splice = result;
		first = first.rest();
		while (first != NIL) {
			SubLCons temp = makeCons(first.first());
			splice.setCdr(temp);
			splice = temp;
			first = first.rest();
		}
		while (second != NIL) {
			SubLCons temp = makeCons(second.first());
			splice.setCdr(temp);
			splice = temp;
			second = second.rest();
		}
		splice.setCdr(third);
		return result;
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_append_execute(SubLObject[] args) {
		SubLCons result = null;
		SubLCons splice = null;
		final int limit = args.length - 1;
		int i;
		for (i = 0; i < limit; i++) {
			SubLObject top = args[i];
			if (top == NIL) {
				continue;
			}
			result = makeCons(top.first());
			splice = result;
			top = top.rest();
			while (top != NIL) {
				SubLCons temp = makeCons(top.first());
				splice.setCdr(temp);
				splice = temp;
				top = top.rest();
			}
			break;
		}
		if (result == null) {
			return args[i];
		}
		for (++i; i < limit; i++) {
			SubLObject top = args[i];
			while (top != NIL) {
				SubLCons temp = makeCons(top.first());
				splice.setCdr(temp);
				splice = temp;
				top = top.rest();
			}
		}
		splice.setCdr(args[i]);
		return result;
	}

	private static final class pf_nconc extends JavaPrimitive {
		/**  Constructor for the pf_nconc object */
		pf_nconc() {
			super(LispSymbols.NCONC, "&rest lists");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_nconc_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_nconc_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_nconc_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_nconc_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_nconc_execute() {
		return NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_nconc_execute(SubLObject arg) {
		return arg;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_nconc_execute(SubLObject first, SubLObject second) {
		if (first == NIL) {
			return second;
		}
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
		return type_error(first, LispSymbols.LIST);
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_nconc_execute(SubLObject[] array) {
		SubLObject result = null;
		SubLCons splice = null;
		final int limit = array.length - 1;
		int i;
		for (i = 0; i < limit; i++) {
			SubLObject list = array[i];
			if (list == NIL) {
				continue;
			}
			if (list instanceof SubLCons) {
				if (splice != null) {
					splice.setCdr(list);
					splice = (SubLCons) list;
				}
				while (list instanceof SubLCons) {
					if (result == null) {
						result = list;
						splice = (SubLCons) result;
					} else {
						splice = (SubLCons) list;
					}
					list = splice.rest();
				}
			} else {
				type_error(list, LispSymbols.LIST);
			}
		}
		if (result == null) {
			return array[i];
		}
		splice.setCdr(array[i]);
		return result;
	}

	private static final class pf_equals extends JavaPrimitive {
		/**  Constructor for the pf_equals object */
		pf_equals() {
			super(LispSymbols.EQUALS, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_equals_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_equals_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_equals_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_equals_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_equals_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_equals_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_equals_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_equals_execute(SubLObject first, SubLObject second) {
		return first.numE(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_equals_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numE(second) && second.numE(third)) {
			return T;
		} else {
			return NIL;
		}
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_equals_execute(SubLObject[] array) {
		final int length = array.length;
		final SubLObject obj = array[0];
		for (int i = 1; i < length; i++) {
			if (array[i].isNotEqualTo(obj)) {
				return NIL;
			}
		}
		return T;
	}

	private static final class pf_not_equals extends JavaPrimitive {
		/**  Constructor for the pf_not_equals object */
		pf_not_equals() {
			super(LispSymbols.NOT_EQUALS, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_not_equals_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_not_equals_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_not_equals_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_not_equals_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_not_equals_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_not_equals_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_not_equals_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_not_equals_execute(SubLObject first, SubLObject second) {
		return first.isNotEqualTo(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_not_equals_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numE(second)) {
			return NIL;
		}
		if (first.numE(third)) {
			return NIL;
		}
		if (second.numE(third)) {
			return NIL;
		}
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_not_equals_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 0; i < length; i++) {
			final SubLObject obj = array[i];
			for (int j = i + 1; j < length; j++) {
				if (array[j].numE(obj)) {
					return NIL;
				}
			}
		}
		return T;
	}

	private static final class pf_lt extends JavaPrimitive {
		/**  Constructor for the pf_lt object */
		pf_lt() {
			super(LispSymbols.LT, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_lt_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_lt_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_lt_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_lt_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_lt_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_lt_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_lt_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_lt_execute(SubLObject first, SubLObject second) {
		return first.numL(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_lt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numL(second) && second.numL(third)) {
			return T;
		} else {
			return NIL;
		}
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_lt_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++) {
			if (array[i].numLE(array[i - 1])) {
				return NIL;
			}
		}
		return T;
	}

	private static final class pf_le extends JavaPrimitive {
		/**  Constructor for the pf_le object */
		pf_le() {
			super(LispSymbols.LE, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_le_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_le_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_le_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_le_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_le_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_le_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_le_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_le_execute(SubLObject first, SubLObject second) {
		return first.numLE(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_le_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numLE(second) && second.numLE(third)) {
			return T;
		} else {
			return NIL;
		}
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_le_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++) {
			if (array[i].numL(array[i - 1])) {
				return NIL;
			}
		}
		return T;
	}

	private static final class pf_gt extends JavaPrimitive {
		/**  Constructor for the pf_gt object */
		pf_gt() {
			super(LispSymbols.GT, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_gt_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_gt_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_gt_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_gt_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_gt_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_gt_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_gt_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_gt_execute(SubLObject first, SubLObject second) {
		return first.numG(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_gt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numG(second) && second.numG(third)) {
			return T;
		} else {
			return NIL;
		}
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_gt_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++) {
			if (array[i].numGE(array[i - 1])) {
				return NIL;
			}
		}
		return T;
	}

	private static final class pf_ge extends JavaPrimitive {
		/**  Constructor for the pf_ge object */
		pf_ge() {
			super(LispSymbols.GE, "&rest numbers");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_ge_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_ge_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_ge_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_ge_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  array  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] array) {
			return pf_ge_execute(array);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_ge_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_ge_execute(SubLObject arg) {
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_ge_execute(SubLObject first, SubLObject second) {
		return first.numGE(second) ? T : NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_ge_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.numGE(second) && second.numGE(third)) {
			return T;
		} else {
			return NIL;
		}
	}

	/**
		*  Description of the Method
		*
		* @param  array  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_ge_execute(SubLObject[] array) {
		final int length = array.length;
		for (int i = 1; i < length; i++) {
			if (array[i].numG(array[i - 1])) {
				return NIL;
			}
		}
		return T;
	}

	private static final class pf_nth extends JavaPrimitive {
		/**  Constructor for the pf_nth object */
		pf_nth() {
			super(LispSymbols.NTH, "n list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_nth_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_nth_execute(SubLObject first, SubLObject second) {
		return second.NTH(first);
	}

	private static final class pf__set_nth extends JavaPrimitive {
		/**  Constructor for the pf__set_nth object */
		pf__set_nth() {
			super("%set-nth", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__set_nth_execute(first, second, third);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_nth_execute(SubLObject first, SubLObject second, SubLObject third) {
		int index = first.intValue();
		if (index < 0) {
			error(new TypeError("(SETF NTH): invalid index " + index + "."));
		}
		int i = 0;
		while (true) {
			if (i == index) {
				second.setCar(third);
				return third;
			}
			second = second.rest();
			if (second == NIL) {
				return error(new LispError("(SETF NTH): the index " + index + "is too large."));
			}
			++i;
		}
	}

	private static final class pf_nthcdr extends JavaPrimitive {
		/**  Constructor for the pf_nthcdr object */
		pf_nthcdr() {
			super(LispSymbols.NTHCDR, "n list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_nthcdr_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_nthcdr_execute(SubLObject first, SubLObject second) {
		final int index = first.intValue();
		if (index < 0) {
			return type_error(first, list(LispSymbols.INTEGER, Fixnum.ZERO));
		}
		for (int i = 0; i < index; i++) {
			second = second.rest();
			if (second == NIL) {
				return NIL;
			}
		}
		return second;
	}

	@NoInline
	private static final class pf_error extends JavaPrimitive {
		/**  Constructor for the pf_error object */
		pf_error() {
			super(LispSymbols.ERROR, "datum &rest arguments");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_error_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_error_execute(SubLObject[] args) {
		Error e = new Error();

		e.printStackTrace();

		System.out.println("ERROR placeholder called with arguments:");

		if (args.length == 1 && args[0] instanceof Condition) {
			System.out.println(args[0].writeToString());
			System.out.println(((Condition) args[0]).getConditionReport());
		} else {
			for (SubLObject a : args) {
				System.out.println(a.writeToString());
			}
		}

		//###FIXME: Bail out, but do it nicer...
		System.exit(1);
		return NIL;
	}

	@NoInline
	private static final class pf_autocompile extends JavaPrimitive {
		/**  Constructor for the pf_autocompile object */
		pf_autocompile() {
			super(LispSymbols.AUTOCOMPILE, "function");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  function  Description of Parameter
		 * @return           Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject function) {
			return pf_autocompile_execute(function);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  function  Description of Parameter
		* @return           Description of the Returned Value
		*/
	static public SubLObject pf_autocompile_execute(SubLObject function) {
		return NIL;
	}

	@NoInline
	private static final class pf_signal extends JavaPrimitive {
		/**  Constructor for the pf_signal object */
		pf_signal() {
			super(LispSymbols.SIGNAL, "datum &rest arguments");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_signal_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_signal_execute(SubLObject[] args) {
		if (args.length < 1) {
			return num_args_err();
		}
		if (args[0] instanceof Condition) {
			return error((Condition) args[0]);
		}
		return error(new SimpleCondition());
	}

	@NoInline
	private static final class pf_undefined_function_called extends JavaPrimitive {
		/**  Constructor for the pf_undefined_function_called object */
		pf_undefined_function_called() {
			super(LispSymbols.UNDEFINED_FUNCTION_CALLED, "name arguments");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_undefined_function_called_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_undefined_function_called_execute(SubLObject first, SubLObject second) {
		return error(new UndefinedFunction(first));
	}

	private static final class pf__format extends JavaPrimitive {
		/**  Constructor for the pf__format object */
		pf__format() {
			super("%format", PACKAGE_SYS, false, "destination control-string &rest args");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__format_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf__format_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf__format_execute(args);
		}
	}

	/**
	 *  Description of the Method
	 *
	 * @param  args  Description of Parameter
	 * @return       Description of the Returned Value
	 */
	static private final String static__format(SubLObject[] args) {
		SubLObject formatControl = args[0];
		SubLObject formatArguments = NIL;
		for (int i = 1; i < args.length; i++) {
			formatArguments = makeCons(args[i], formatArguments);
		}
		formatArguments = formatArguments.nreverse();
		return format(formatControl, formatArguments);
	}

	/**
	 *  Description of the Method
	 *
	 * @param  s            Description of Parameter
	 * @param  destination  Description of Parameter
	 * @return              Description of the Returned Value
	 */
	static private final SubLObject outputFormattedString(String s, SubLObject destination) {
		if (destination == T) {
			checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue())._writeString(s);
			return NIL;
		}
		if (destination == NIL) {
			return makeString(s);
		}
		if (destination instanceof TwoWayStream) {
			LispStream out = ((TwoWayStream) destination).getOutputStream();
			if (out instanceof LispStream) {
				(out)._writeString(s);
				return NIL;
			}
			error(new TypeError("The value " + destination.writeToString() + " is not a character output stream."));
		}
		if (destination instanceof LispStream) {
			((LispStream) destination)._writeString(s);
			return NIL;
		}
		return NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__format_execute(SubLObject first, SubLObject second, SubLObject third) {
		SubLObject destination = first;
		// Copy remaining arguments.
		SubLObject[] _args = makeLispObjectArray(2);
		_args[0] = second;
		_args[1] = third;
		String s = static__format(_args);
		return outputFormattedString(s, destination);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__format_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		SubLObject destination = first;
		// Copy remaining arguments.
		SubLObject[] _args = makeLispObjectArray(3);
		_args[0] = second;
		_args[1] = third;
		_args[2] = fourth;
		String s = static__format(_args);
		return outputFormattedString(s, destination);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf__format_execute(SubLObject[] args) {
		if (args.length < 2) {
			return num_args_err();
		}
		SubLObject destination = args[0];
		// Copy remaining arguments.
		SubLObject[] _args = new SubLObject[args.length - 1];
		for (int i = 0; i < _args.length; i++) {
			_args[i] = args[i + 1];
		}
		String s = static__format(_args);
		return outputFormattedString(s, destination);
	}

	private static final class pf__defun extends JavaPrimitive {
		/**  Constructor for the pf__defun object */
		pf__defun() {
			super("%defun", PACKAGE_SYS, true, "name definition");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  name        Description of Parameter
		 * @param  definition  Description of Parameter
		 * @return             Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject name, SubLObject definition) {
			return pf__defun_execute(name, definition);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  name        Description of Parameter
		* @param  definition  Description of Parameter
		* @return             Description of the Returned Value
		*/
	static public SubLObject pf__defun_execute(SubLObject name, SubLObject definition) {
		if (name instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) name;
			if (symbol.getSymbolFunction() instanceof SpecialOperator) {
				String message = symbol.getJavaSymbolName() + " is a special operator and may not be redefined.";
				return error(new ProgramError(message));
			}
		} else if (!isValidSetfFunctionName(name)) {
			return type_error(name, FUNCTION_NAME);
		}
		if (definition instanceof Function) {
			LispSymbols.FSET.execute(name, definition, NIL, ((Function) definition).getLambdaList());
			return name;
		}
		return type_error(definition, LispSymbols.FUNCTION);
	}

	private static final class pf_fdefinition_block_name extends JavaPrimitive {
		/**  Constructor for the pf_fdefinition_block_name object */
		pf_fdefinition_block_name() {
			super("fdefinition-block-name", PACKAGE_SYS, true, "function-name");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_fdefinition_block_name_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_fdefinition_block_name_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol) {
			return arg;
		}
		if (isValidSetfFunctionName(arg)) {
			return arg.second();
		}
		return type_error(arg, FUNCTION_NAME);
	}

	private static final class pf_macro_function extends JavaPrimitive {
		/**  Constructor for the pf_macro_function object */
		pf_macro_function() {
			super(LispSymbols.MACRO_FUNCTION, "symbol &optional environment");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_macro_function_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_macro_function_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_macro_function_execute(SubLObject arg) {
		SubLObject obj = arg.getSymbolFunction();
		if (obj instanceof AutoloadMacro) {
			((AutoloadMacro) obj).load();
			obj = arg.getSymbolFunction();
		}
		if (obj instanceof MacroObject) {
			return ((MacroObject) obj).expander;
		}
		if (obj instanceof SpecialOperator) {
			obj = get(arg, LispSymbols.MACROEXPAND_MACRO, NIL);
			if (obj instanceof AutoloadMacro) {
				((AutoloadMacro) obj).load();
				obj = get(arg, LispSymbols.MACROEXPAND_MACRO, NIL);
			}
			if (obj instanceof MacroObject) {
				return ((MacroObject) obj).expander;
			}
		}
		return NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_macro_function_execute(SubLObject first, SubLObject second) {
		SubLObject obj;
		if (second != NIL) {
			Environment env = checkEnvironment(second);
			obj = env.lookupFunction(first);
		} else {
			obj = first.getSymbolFunction();
		}
		if (obj instanceof AutoloadMacro) {
			((AutoloadMacro) obj).load();
			obj = first.getSymbolFunction();
		}
		if (obj instanceof MacroObject) {
			return ((MacroObject) obj).expander;
		}
		if (obj instanceof SpecialOperator) {
			obj = get(first, LispSymbols.MACROEXPAND_MACRO, NIL);
			if (obj instanceof AutoloadMacro) {
				((AutoloadMacro) obj).load();
				obj = get(first, LispSymbols.MACROEXPAND_MACRO, NIL);
			}
			if (obj instanceof MacroObject) {
				return ((MacroObject) obj).expander;
			}
		}
		return NIL;
	}

	private static final class sf_defmacro extends SpecialOperator {
		/**  Constructor for the sf_defmacro object */
		sf_defmacro() {
			super(LispSymbols.DEFMACRO);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_defmacro_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_defmacro_execute(SubLObject args, Environment env) {
		SubLSymbol symbol = checkSymbol(args.first());
		SubLObject lambdaList = checkList(args.second());
		SubLObject body = args.cddr();
		SubLObject block = makeCons(LispSymbols.BLOCK, makeCons(symbol, body));
		SubLObject toBeApplied = list(LispSymbols.FUNCTION, list(LispSymbols.LAMBDA, lambdaList, block));
		final LispThread thread = LispThread.currentThread();
		SubLObject formArg = gensym("FORM-", thread);
		SubLObject envArg = gensym("ENV-", thread);
		// Ignored.
		SubLObject expander = list(LispSymbols.LAMBDA, list(formArg, envArg), list(LispSymbols.APPLY, toBeApplied, list(LispSymbols.CDR,
				formArg)));
		Closure expansionFunction = new Closure(expander, env);
		MacroObject macroObject = new MacroObject(symbol, expansionFunction);
		if (symbol.getSymbolFunction() instanceof SpecialOperator) {
			put(symbol, LispSymbols.MACROEXPAND_MACRO, macroObject);
		} else {
			symbol.setSymbolFunction(macroObject);
		}
		macroObject.setLambdaList(lambdaList);
		thread._values = null;
		return symbol;
	}

	private static final class pf_make_macro extends JavaPrimitive {
		/**  Constructor for the pf_make_macro object */
		pf_make_macro() {
			super("make-macro", PACKAGE_SYS, true, "name expansion-function");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_make_macro_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_make_macro_execute(SubLObject first, SubLObject second) {
		return new MacroObject(first, second);
	}

	private static final class pf_macro_function_p extends JavaPrimitive {
		/**  Constructor for the pf_macro_function_p object */
		pf_macro_function_p() {
			super("macro-function-p", PACKAGE_SYS, true, "value");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_macro_function_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_macro_function_p_execute(SubLObject arg) {
		return (arg instanceof MacroObject) ? T : NIL;
	}

	private static final class pf_make_symbol_macro extends JavaPrimitive {
		/**  Constructor for the pf_make_symbol_macro object */
		pf_make_symbol_macro() {
			super("make-symbol-macro", PACKAGE_SYS, true, "expansion");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_make_symbol_macro_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_make_symbol_macro_execute(SubLObject arg) {
		return new SymbolMacro(arg);
	}

	private static final class pf_symbol_macro_p extends JavaPrimitive {
		/**  Constructor for the pf_symbol_macro_p object */
		pf_symbol_macro_p() {
			super("symbol-macro-p", PACKAGE_SYS, true, "value");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_macro_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_macro_p_execute(SubLObject arg) {
		return (arg instanceof SymbolMacro) ? T : NIL;
	}

	private static final class pf__defparameter extends JavaPrimitive {
		/**  Constructor for the pf__defparameter object */
		pf__defparameter() {
			super("%defparameter", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__defparameter_execute(first, second, third);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__defparameter_execute(SubLObject first, SubLObject second, SubLObject third) {
		final SubLSymbol symbol;
		symbol = checkSymbol(first);
		if (third instanceof SubLString) {
			symbol.setDocumentation(LispSymbols.VARIABLE, third);
		} else if (third != NIL) {
			type_error(third, LispSymbols.STRING);
		}
		symbol.initializeSpecial(second);
		return symbol;
	}

	private static final class pf__defvar extends JavaPrimitive {
		/**  Constructor for the pf__defvar object */
		pf__defvar() {
			super("%defvar", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__defvar_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__defvar_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__defvar_execute(SubLObject arg) {
		final SubLSymbol symbol;
		symbol = checkSymbol(arg);
		symbol.setSpecial(true);
		return symbol;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__defvar_execute(SubLObject first, SubLObject second) {
		final SubLSymbol symbol;
		symbol = checkSymbol(first);
		symbol.initializeSpecial(second);
		return symbol;
	}

	private static final class pf__defconstant extends JavaPrimitive {
		/**  Constructor for the pf__defconstant object */
		pf__defconstant() {
			super("%defconstant", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__defconstant_execute(first, second, third);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__defconstant_execute(SubLObject first, SubLObject second, SubLObject third) {
		final SubLSymbol symbol;
		symbol = checkSymbol(first);
		if (third != NIL) {
			if (third instanceof SubLString) {
				symbol.setDocumentation(LispSymbols.VARIABLE, third);
			} else {
				return type_error(third, LispSymbols.STRING);
			}
		}
		symbol.initializeConstant(second);
		return symbol;
	}

	private static final class sf_cond extends SpecialOperator {
		/**  Constructor for the sf_cond object */
		sf_cond() {
			super(LispSymbols.COND, "&rest clauses");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_cond_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_cond_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = NIL;
		while (args != NIL) {
			SubLObject clause = args.first();
			result = eval(clause.first(), env, thread);
			thread._values = null;
			if (result != NIL) {
				SubLObject body = clause.rest();
				while (body != NIL) {
					result = eval(body.first(), env, thread);
					body = ((SubLCons) body).rest();
				}
				return result;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	private static final class sf_case extends SpecialOperator {
		/**  Constructor for the sf_case object */
		sf_case() {
			super(LispSymbols.CASE, "keyform &body cases");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_case_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_case_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject key = eval(args.first(), env, thread);
		args = args.rest();
		while (args != NIL) {
			SubLObject clause = args.first();
			SubLObject keys = clause.first();
			boolean match = false;
			if (keys.isList()) {
				while (keys != NIL) {
					SubLObject candidate = keys.first();
					if (key.eql(candidate)) {
						match = true;
						break;
					}
					keys = keys.rest();
				}
			} else {
				SubLObject candidate = keys;
				if (candidate == T || candidate == LispSymbols.OTHERWISE) {
					match = true;
				} else if (key.eql(candidate)) {
					match = true;
				}
			}
			if (match) {
				return progn(clause.rest(), env, thread);
			}
			args = args.rest();
		}
		return NIL;
	}

	private static final class sf_ecase extends SpecialOperator {
		/**  Constructor for the sf_ecase object */
		sf_ecase() {
			super(LispSymbols.ECASE, "keyform &body cases");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_ecase_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_ecase_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject key = eval(args.first(), env, thread);
		SubLObject clauses = args.rest();
		while (clauses != NIL) {
			SubLObject clause = clauses.first();
			SubLObject keys = clause.first();
			boolean match = false;
			if (keys.isList()) {
				while (keys != NIL) {
					SubLObject candidate = keys.first();
					if (key.eql(candidate)) {
						match = true;
						break;
					}
					keys = keys.rest();
				}
			} else {
				SubLObject candidate = keys;
				if (key.eql(candidate)) {
					match = true;
				}
			}
			if (match) {
				return progn(clause.rest(), env, thread);
			}
			clauses = clauses.rest();
		}
		SubLObject expectedType = NIL;
		clauses = args.rest();
		while (clauses != NIL) {
			SubLObject clause = clauses.first();
			SubLObject keys = clause.first();
			if (keys.isList()) {
				while (keys != NIL) {
					expectedType = expectedType.push(keys.first());
					keys = keys.rest();
				}
			} else {
				expectedType = expectedType.push(keys);
			}
			clauses = clauses.rest();
		}
		expectedType = expectedType.nreverse();
		expectedType = expectedType.push(LispSymbols.MEMBER);
		return type_error(key, expectedType);
	}

	private static final class pf_type_of extends JavaPrimitive {
		/**  Constructor for the pf_type_of object */
		pf_type_of() {
			super(LispSymbols.TYPE_OF, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_type_of_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_type_of_execute(SubLObject arg) {
		return arg.typeOf();
	}

	@NoInline
	private static final class pf_class_of extends JavaPrimitive {
		/**  Constructor for the pf_class_of object */
		pf_class_of() {
			super(LispSymbols.CLASS_OF, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_of_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_of_execute(SubLObject arg) {
		return arg.classOf();
	}

	private static final class pf_simple_typep extends JavaPrimitive {
		/**  Constructor for the pf_simple_typep object */
		pf_simple_typep() {
			super("simple-typep", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_simple_typep_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_simple_typep_execute(SubLObject first, SubLObject second) {
		return first.typep(second);
	}

	private static final class pf_function_lambda_expression extends JavaPrimitive {
		/**  Constructor for the pf_function_lambda_expression object */
		pf_function_lambda_expression() {
			super(LispSymbols.FUNCTION_LAMBDA_EXPRESSION, "function");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_function_lambda_expression_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_function_lambda_expression_execute(SubLObject arg) {
		final SubLObject value1;
		final SubLObject value2;
		final SubLObject value3;
		if (arg instanceof CompiledClosure) {
			value1 = NIL;
			value2 = T;
			SubLObject name = ((CompiledClosure) arg).getLambdaName();
			value3 = name != null ? name : NIL;
		} else if (arg instanceof Closure) {
			Closure closure = (Closure) arg;
			SubLObject expr = closure.getBody();
			expr = makeCons(closure.getLambdaList(), expr);
			expr = makeCons(LispSymbols.LAMBDA, expr);
			value1 = expr;
			Environment env = closure.getEnvironment();
			if (env == null || env.isEmpty()) {
				value2 = NIL;
			} else {
				value2 = env;
			}
			// Return environment as closure-p.
			SubLObject name = ((Closure) arg).getLambdaName();
			value3 = name != null ? name : NIL;
		} else if (arg instanceof Function) {
			value1 = NIL;
			value2 = T;
			value3 = ((Function) arg).getLambdaName();
		} else if (arg instanceof StandardGenericFunction) {
			value1 = NIL;
			value2 = T;
			value3 = ((StandardGenericFunction) arg).getGenericFunctionName();
		} else {
			return type_error(arg, LispSymbols.FUNCTION);
		}
		return LispThread.currentThread().setValues(value1, value2, value3);
	}

	private static final class pf_funcall extends JavaPrimitive {
		/**  Constructor for the pf_funcall object */
		pf_funcall() {
			super(LispSymbols.FUNCALL, "function &rest args");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_funcall_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_funcall_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_funcall_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_funcall_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf_funcall_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @param  fifth   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth) {
			return pf_funcall_execute(first, second, third, fourth, fifth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @param  fifth   Description of Parameter
		 * @param  sixth   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth) {
			return pf_funcall_execute(first, second, third, fourth, fifth, sixth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first    Description of Parameter
		 * @param  second   Description of Parameter
		 * @param  third    Description of Parameter
		 * @param  fourth   Description of Parameter
		 * @param  fifth    Description of Parameter
		 * @param  sixth    Description of Parameter
		 * @param  seventh  Description of Parameter
		 * @return          Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth, SubLObject seventh) {
			return pf_funcall_execute(first, second, third, fourth, fifth, sixth, seventh);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first    Description of Parameter
		 * @param  second   Description of Parameter
		 * @param  third    Description of Parameter
		 * @param  fourth   Description of Parameter
		 * @param  fifth    Description of Parameter
		 * @param  sixth    Description of Parameter
		 * @param  seventh  Description of Parameter
		 * @param  eigth    Description of Parameter
		 * @return          Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
				SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eigth) {
			return pf_funcall_execute(first, second, third, fourth, fifth, sixth, seventh, eigth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_funcall_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject arg) {
		return LispThread.currentThread().execute(arg);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second) {
		return LispThread.currentThread().execute(first, second);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third) {
		return LispThread.currentThread().execute(first, second, third);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return LispThread.currentThread().execute(first, second, third, fourth);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @param  fifth   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @param  fifth   Description of Parameter
		* @param  sixth   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth);
	}

	/**
		*  Description of the Method
		*
		* @param  first    Description of Parameter
		* @param  second   Description of Parameter
		* @param  third    Description of Parameter
		* @param  fourth   Description of Parameter
		* @param  fifth    Description of Parameter
		* @param  sixth    Description of Parameter
		* @param  seventh  Description of Parameter
		* @return          Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	/**
		*  Description of the Method
		*
		* @param  first    Description of Parameter
		* @param  second   Description of Parameter
		* @param  third    Description of Parameter
		* @param  fourth   Description of Parameter
		* @param  fifth    Description of Parameter
		* @param  sixth    Description of Parameter
		* @param  seventh  Description of Parameter
		* @param  eigth    Description of Parameter
		* @return          Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eigth) {
		return LispThread.currentThread().execute(first, second, third, fourth, fifth, sixth, seventh, eigth);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_funcall_execute(SubLObject[] args) {
		final int length = args.length - 1;
		// Number of arguments.
		if (length == 8) {
			return LispThread.currentThread().execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7],
					args[8]);
		} else {
			SubLObject[] newArgs = makeLispObjectArray(length);
			System.arraycopy(args, 1, newArgs, 0, length);
			return LispThread.currentThread().execute(args[0], newArgs);
		}
	}

	private static final class pf_apply extends JavaPrimitive {
		/**  Constructor for the pf_apply object */
		pf_apply() {
			super(LispSymbols.APPLY, "function &rest args");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_apply_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_apply_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  fun   Description of Parameter
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject fun, SubLObject args) {
			return pf_apply_execute(fun, args);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_apply_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(final SubLObject[] args) {
			return pf_apply_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_apply_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_apply_execute(SubLObject arg) {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  fun   Description of Parameter
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
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
			final SubLObject[] funArgs = makeLispObjectArray(length);
			int j = 0;
			while (args != NIL) {
				funArgs[j++] = args.first();
				args = args.rest();
			}
			return funcall(fun, funArgs, thread);
		}
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_apply_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (third.isList()) {
			final int numFunArgs = 1 + third.cl_length();
			final SubLObject[] funArgs = makeLispObjectArray(numFunArgs);
			funArgs[0] = second;
			int j = 1;
			while (third != NIL) {
				funArgs[j++] = third.first();
				third = third.rest();
			}
			return funcall(first, funArgs, LispThread.currentThread());
		}
		return type_error(third, LispSymbols.LIST);
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_apply_execute(final SubLObject[] args) {
		final int numArgs = args.length;
		SubLObject spread = args[numArgs - 1];
		if (spread.isList()) {
			final int numFunArgs = numArgs - 2 + spread.cl_length();
			final SubLObject[] funArgs = makeLispObjectArray(numFunArgs);
			int j = 0;
			for (int i = 1; i < numArgs - 1; i++) {
				funArgs[j++] = args[i];
			}
			while (spread != NIL) {
				funArgs[j++] = spread.first();
				spread = spread.rest();
			}
			return funcall(args[0], funArgs, LispThread.currentThread());
		}
		return type_error(spread, LispSymbols.LIST);
	}

	private static final class pf_mapcar extends JavaPrimitive {
		/**  Constructor for the pf_mapcar object */
		pf_mapcar() {
			super(LispSymbols.MAPCAR, "function &rest lists");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  fun   Description of Parameter
		 * @param  list  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject fun, SubLObject list) {
			return pf_mapcar_execute(fun, list);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  fun    Description of Parameter
		 * @param  list1  Description of Parameter
		 * @param  list2  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject fun, SubLObject list1, SubLObject list2) {
			return pf_mapcar_execute(fun, list1, list2);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(final SubLObject[] args) {
			return pf_mapcar_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  fun   Description of Parameter
		* @param  list  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_mapcar_execute(SubLObject fun, SubLObject list) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = NIL;
		SubLCons splice = null;
		while (list != NIL) {
			SubLCons cons;
			if (list instanceof SubLCons) {
				cons = (SubLCons) list;
			} else {
				return type_error(list, LispSymbols.LIST);
			}
			SubLObject obj = thread.execute(fun, cons.first());
			if (splice == null) {
				splice = makeCons(obj, result);
				result = splice;
			} else {
				SubLCons c = makeCons(obj);
				splice.setCdr(c);
				splice = c;
			}
			list = cons.rest();
		}
		thread._values = null;
		return result;
	}

	/**
		*  Description of the Method
		*
		* @param  fun    Description of Parameter
		* @param  list1  Description of Parameter
		* @param  list2  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_mapcar_execute(SubLObject fun, SubLObject list1, SubLObject list2) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = NIL;
		SubLCons splice = null;
		while (list1 != NIL && list2 != NIL) {
			SubLObject obj = thread.execute(fun, list1.first(), list2.first());
			if (splice == null) {
				splice = makeCons(obj, result);
				result = splice;
			} else {
				SubLCons cons = makeCons(obj);
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
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_mapcar_execute(final SubLObject[] args) {
		final int numArgs = args.length;
		if (numArgs < 2) {
			return num_args_err();
		}
		int commonLength = -1;
		for (int i = 1; i < numArgs; i++) {
			if (!args[i].isList()) {
				type_error(args[i], LispSymbols.LIST);
			}
			int len = args[i].cl_length();
			if (commonLength < 0) {
				commonLength = len;
			} else if (commonLength > len) {
				commonLength = len;
			}
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject[] results = makeLispObjectArray(commonLength);
		final int numFunArgs = numArgs - 1;
		final SubLObject[] funArgs = makeLispObjectArray(numFunArgs);
		for (int i = 0; i < commonLength; i++) {
			for (int j = 0; j < numFunArgs; j++) {
				funArgs[j] = args[j + 1].first();
			}
			results[i] = funcall(args[0], funArgs, thread);
			for (int j = 1; j < numArgs; j++) {
				args[j] = args[j].rest();
			}
		}
		thread._values = null;
		SubLObject result = NIL;
		for (int i = commonLength; i-- > 0;) {
			result = makeCons(results[i], result);
		}
		return result;
	}

	private static final class pf_mapc extends JavaPrimitive {
		/**  Constructor for the pf_mapc object */
		pf_mapc() {
			super(LispSymbols.MAPC, "function &rest lists");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  fun   Description of Parameter
		 * @param  list  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject fun, SubLObject list) {
			return pf_mapc_execute(fun, list);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  fun    Description of Parameter
		 * @param  list1  Description of Parameter
		 * @param  list2  Description of Parameter
		 * @return        Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject fun, SubLObject list1, SubLObject list2) {
			return pf_mapc_execute(fun, list1, list2);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(final SubLObject[] args) {
			return pf_mapc_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  fun   Description of Parameter
		* @param  list  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_mapc_execute(SubLObject fun, SubLObject list) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = list;
		while (list != NIL) {
			SubLCons cons;
			if (list instanceof SubLCons) {
				cons = (SubLCons) list;
			} else {
				return type_error(list, LispSymbols.LIST);
			}
			thread.execute(fun, cons.first());
			list = cons.rest();
		}
		thread._values = null;
		return result;
	}

	/**
		*  Description of the Method
		*
		* @param  fun    Description of Parameter
		* @param  list1  Description of Parameter
		* @param  list2  Description of Parameter
		* @return        Description of the Returned Value
		*/
	static public SubLObject pf_mapc_execute(SubLObject fun, SubLObject list1, SubLObject list2) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = list1;
		while (list1 != NIL && list2 != NIL) {
			thread.execute(fun, list1.first(), list2.first());
			list1 = ((SubLCons) list1).rest();
			list2 = ((SubLCons) list2).rest();
		}
		thread._values = null;
		return result;
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_mapc_execute(final SubLObject[] args) {
		final int numArgs = args.length;
		if (numArgs < 2) {
			return num_args_err();
		}
		int commonLength = -1;
		for (int i = 1; i < numArgs; i++) {
			if (!args[i].isList()) {
				type_error(args[i], LispSymbols.LIST);
			}
			int len = args[i].cl_length();
			if (commonLength < 0) {
				commonLength = len;
			} else if (commonLength > len) {
				commonLength = len;
			}
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject result = args[1];
		final int numFunArgs = numArgs - 1;
		final SubLObject[] funArgs = makeLispObjectArray(numFunArgs);
		for (int i = 0; i < commonLength; i++) {
			for (int j = 0; j < numFunArgs; j++) {
				funArgs[j] = args[j + 1].first();
			}
			funcall(args[0], funArgs, thread);
			for (int j = 1; j < numArgs; j++) {
				args[j] = args[j].rest();
			}
		}
		thread._values = null;
		return result;
	}

	private static final class pf_macroexpand extends JavaPrimitive {
		/**  Constructor for the pf_macroexpand object */
		pf_macroexpand() {
			super(LispSymbols.MACROEXPAND, "form &optional env");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  form  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject form) {
			return pf_macroexpand_execute(form);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  form  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject form, SubLObject env) {
			return pf_macroexpand_execute(form, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  form  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_macroexpand_execute(SubLObject form) {
		return macroexpand(form, new Environment(), LispThread.currentThread());
	}

	/**
		*  Description of the Method
		*
		* @param  form  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_macroexpand_execute(SubLObject form, SubLObject env) {
		return macroexpand(form, env != NIL ? checkEnvironment(env) : new Environment(), LispThread.currentThread());
	}

	@NoInline
	private static final class pf_macroexpand_1 extends JavaPrimitive {
		/**  Constructor for the pf_macroexpand_1 object */
		pf_macroexpand_1() {
			super(LispSymbols.MACROEXPAND_1, "form &optional env");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  form  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject form) {
			return pf_macroexpand_1_execute(form);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  form  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject form, SubLObject env) {
			return pf_macroexpand_1_execute(form, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  form  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_macroexpand_1_execute(SubLObject form) {
		return macroexpand_1(form, new Environment(), LispThread.currentThread());
	}

	/**
		*  Description of the Method
		*
		* @param  form  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	@NoInline
	static public SubLObject pf_macroexpand_1_execute(SubLObject form, SubLObject env) {
		return macroexpand_1(form, env != NIL ? checkEnvironment(env) : new Environment(), LispThread.currentThread());
	}

	private static final class pf_gensym extends JavaPrimitive {
		/**  Constructor for the pf_gensym object */
		pf_gensym() {
			super(LispSymbols.GENSYM, "&optional x");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_gensym_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_gensym_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_gensym_execute() {
		return gensym("G", LispThread.currentThread());
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_gensym_execute(SubLObject arg) {
		if (arg instanceof Fixnum) {
			int n = ((Fixnum) arg).value;
			if (n >= 0) {
				StringBuilder sb = new StringBuilder("G");
				sb.append(n);
				// Decimal representation.
				return makeSymbol(makeString(sb));
			}
		} else if (arg instanceof Bignum) {
			BigInteger n = ((Bignum) arg).bigIntegerValue();
			if (n.signum() >= 0) {
				StringBuilder sb = new StringBuilder("G");
				sb.append(n.toString());
				// Decimal representation.
				return makeSymbol(makeString(sb));
			}
		} else if (arg instanceof SubLString) {
			return gensym(arg.getString(), LispThread.currentThread());
		}
		return type_error(arg, list(LispSymbols.OR, LispSymbols.STRING, LispSymbols.UNSIGNED_BYTE));
	}

	private static final class pf_string extends JavaPrimitive {
		/**  Constructor for the pf_string object */
		pf_string() {
			super(LispSymbols.STRING, "x");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_string_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_string_execute(SubLObject arg) {
		return arg.STRING();
	}

	private static final class pf_intern extends JavaPrimitive {
		/**  Constructor for the pf_intern object */
		pf_intern() {
			super(LispSymbols.INTERN, "string &optional package");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_intern_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_intern_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_intern_execute(SubLObject arg) {
		final SubLString s;
		if (arg instanceof SimpleString) {
			s = (SimpleString) arg;
		} else {
			s = makeString(arg.getString());
		}
		final LispThread thread = LispThread.currentThread();
		SubLPackage pkg = (SubLPackage) LispSymbols._PACKAGE_.symbolValue(thread);
		return pkg.intern(s, thread);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_intern_execute(SubLObject first, SubLObject second) {
		final SubLString s;
		if (first instanceof SimpleString) {
			s = (SimpleString) first;
		} else {
		       // Not a simple string.
			s = makeString(first.getString());
		}
		SubLPackage pkg = coerceToPackage(second);
		return pkg.intern(s, LispThread.currentThread());
	}

	private static final class pf_unintern extends JavaPrimitive {
		/**  Constructor for the pf_unintern object */
		pf_unintern() {
			super(LispSymbols.UNINTERN, "symbol &optional package");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_unintern_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_unintern_execute(SubLObject[] args) {
		if (args.length == 0 || args.length > 2) {
			return num_args_err();
		}
		SubLSymbol symbol = checkSymbol(args[0]);
		SubLPackage pkg;
		if (args.length == 2) {
			pkg = coerceToPackage(args[1]);
		} else {
			pkg = getCurrentPackage();
		}
		return pkg.unintern(symbol);
	}

	private static final class pf_find_package extends JavaPrimitive {
		/**  Constructor for the pf_find_package object */
		pf_find_package() {
			super(LispSymbols.FIND_PACKAGE, "name");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_find_package_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_find_package_execute(SubLObject arg) {
		if (arg instanceof SubLPackage) {
			return arg;
		}
		if (arg instanceof SubLString) {
			SubLPackage pkg = LispPackages.findPackage(arg.getString());
			return pkg != null ? pkg : NIL;
		}
		if (arg instanceof SubLSymbol) {
			SubLPackage pkg = LispPackages.findPackage(checkSymbol(arg).getJavaSymbolName());
			return pkg != null ? pkg : NIL;
		}
		if (arg instanceof LispCharacter) {
			String packageName = String.valueOf(new char[] { ((LispCharacter) arg).charValue() });
			SubLPackage pkg = LispPackages.findPackage(packageName);
			return pkg != null ? pkg : NIL;
		}
		return NIL;
	}

	private static final class pf__make_package extends JavaPrimitive {
		/**  Constructor for the pf__make_package object */
		pf__make_package() {
			super("%make-package", PACKAGE_SYS, false);
		}

		/**
		 *  This invocation is solely used to be able to create a package to bind to *FASL-ANONYMOUS-PACKAGE*
		 *
		 * @return    Description of the Returned Value
		 */

		@Override
		public SubLObject execute() {
			return pf__make_package_execute();
		}

		/**
		 *  This invocation is used by MAKE-PACKAGE to create a package
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */

		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__make_package_execute(first, second, third);
		}
	}

	/**
		*  This invocation is solely used to be able to create a package to bind to *FASL-ANONYMOUS-PACKAGE*
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf__make_package_execute() {
		return new SubLPackage();
	}

	/**
		*  This invocation is used by MAKE-PACKAGE to create a package
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__make_package_execute(SubLObject first, SubLObject second, SubLObject third) {
		String packageName = javaString(first);
		SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg != null) {
			error(new LispError("Package " + packageName + " already exists."));
		}
		SubLObject nicknames = checkList(second);
		if (nicknames != NIL) {
			SubLObject list = nicknames;
			while (list != NIL) {
				String nick = javaString(list.first());
				if (LispPackages.findPackage(nick) != null) {
					error(new PackageError("A package named " + nick + " already exists."));
				}
				list = list.rest();
			}
		}
		SubLObject use = checkList(third);
		if (use != NIL) {
			SubLObject list = use;
			while (list != NIL) {
				SubLObject obj = list.first();
				if (obj instanceof SubLPackage) {
					// OK.
				} else {
					String s = javaString(obj);
					SubLPackage p = LispPackages.findPackage(s);
					if (p == null) {
						error(new LispError(obj.writeToString() + " is not the name of a package."));
						return NIL;
					}
				}
				list = list.rest();
			}
		}
		// Now create the package.
		pkg = LispPackages.createPackage(packageName);
		// Add the nicknames.
		while (nicknames != NIL) {
			String nick = javaString(nicknames.first());
			pkg.addNickname(nick);
			nicknames = nicknames.rest();
		}
		// Create the use list.
		while (use != NIL) {
			SubLObject obj = use.first();
			if (obj instanceof SubLPackage) {
				pkg.usePackage((SubLPackage) obj);
			} else {
				String s = javaString(obj);
				SubLPackage p = LispPackages.findPackage(s);
				if (p == null) {
					error(new LispError(obj.writeToString() + " is not the name of a package."));
					return NIL;
				}
				pkg.usePackage(p);
			}
			use = use.rest();
		}
		return pkg;
	}

	private static final class pf__in_package extends JavaPrimitive {
		/**  Constructor for the pf__in_package object */
		pf__in_package() {
			super("%in-package", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__in_package_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__in_package_execute(SubLObject arg) {
		final String packageName = javaString(arg);
		final SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg == null) {
			return error(new PackageError("The name " + packageName + " does not designate any package."));
		}
		SpecialBinding binding = LispThread.currentThread().getSpecialBinding(LispSymbols._PACKAGE_);
		if (binding != null) {
			binding.value = pkg;
		} else {
			// No dynamic binding.
			LispSymbols._PACKAGE_.setSymbolValue(pkg);
		}
		return pkg;
	}

	private static final class pf_use_package extends JavaPrimitive {
		/**  Constructor for the pf_use_package object */
		pf_use_package() {
			super(LispSymbols.USE_PACKAGE, "packages-to-use &optional package");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_use_package_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_use_package_execute(SubLObject[] args) {
		if (args.length < 1 || args.length > 2) {
			return num_args_err();
		}
		SubLPackage pkg;
		if (args.length == 2) {
			pkg = coerceToPackage(args[1]);
		} else {
			pkg = getCurrentPackage();
		}
		if (args[0].isList()) {
			SubLObject list = args[0];
			while (list != NIL) {
				pkg.usePackage(coerceToPackage(list.first()));
				list = list.rest();
			}
		} else {
			pkg.usePackage(coerceToPackage(args[0]));
		}
		return T;
	}

	private static final class pf_package_symbols extends JavaPrimitive {
		/**  Constructor for the pf_package_symbols object */
		pf_package_symbols() {
			super("package-symbols", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_package_symbols_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_package_symbols_execute(SubLObject arg) {
		return coerceToPackage(arg).getSymbols();
	}

	private static final class pf_package_internal_symbols extends JavaPrimitive {
		/**  Constructor for the pf_package_internal_symbols object */
		pf_package_internal_symbols() {
			super("package-internal-symbols", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_package_internal_symbols_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_package_internal_symbols_execute(SubLObject arg) {
		return coerceToPackage(arg).PACKAGE_INTERNAL_SYMBOLS();
	}

	private static final class pf_package_external_symbols extends JavaPrimitive {
		/**  Constructor for the pf_package_external_symbols object */
		pf_package_external_symbols() {
			super("package-external-symbols", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_package_external_symbols_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_package_external_symbols_execute(SubLObject arg) {
		return coerceToPackage(arg).PACKAGE_EXTERNAL_SYMBOLS();
	}

	private static final class pf_package_inherited_symbols extends JavaPrimitive {
		/**  Constructor for the pf_package_inherited_symbols object */
		pf_package_inherited_symbols() {
			super("package-inherited-symbols", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_package_inherited_symbols_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_package_inherited_symbols_execute(SubLObject arg) {
		return coerceToPackage(arg).PACKAGE_INHERITED_SYMBOLS();
	}

	private static final class pf_export extends JavaPrimitive {
		/**  Constructor for the pf_export object */
		pf_export() {
			super(LispSymbols.EXPORT, "symbols &optional package");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_export_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_export_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_export_execute(SubLObject arg) {
		final SubLPackage pkg = (SubLPackage) LispSymbols._PACKAGE_.symbolValue();
		if (arg instanceof SubLCons) {
			for (SubLObject list = arg; list != NIL; list = list.rest()) {
				pkg.export(checkSymbol(list.first()));
			}
		} else {
			pkg.export(checkSymbol(arg));
		}
		return T;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_export_execute(SubLObject first, SubLObject second) {
		if (first instanceof SubLCons) {
			SubLPackage pkg = coerceToPackage(second);
			for (SubLObject list = first; list != NIL; list = list.rest()) {
				pkg.export(checkSymbol(list.first()));
			}
		} else {
			coerceToPackage(second).export(checkSymbol(first));
		}
		return T;
	}

	private static final class pf_find_symbol extends JavaPrimitive {
		/**  Constructor for the pf_find_symbol object */
		pf_find_symbol() {
			super(LispSymbols.FIND_SYMBOL, "string &optional package");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_find_symbol_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_find_symbol_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_find_symbol_execute(SubLObject arg) {
		return getCurrentPackage().findSymbol(checkString(arg).getString());
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_find_symbol_execute(SubLObject first, SubLObject second) {
		return coerceToPackage(second).findSymbol(checkString(first).getString());
	}

	private static final class pf_fset extends JavaPrimitive {
		/**  Constructor for the pf_fset object */
		pf_fset() {
			super("fset", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_fset_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_fset_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf_fset_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @param  fifth   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth) {
			return pf_fset_execute(first, second, third, fourth, fifth);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second) {
		return pf_fset_execute(first, second, NIL, NIL, NIL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third) {
		return pf_fset_execute(first, second, third, NIL, NIL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return pf_fset_execute(first, second, third, fourth, NIL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @param  fifth   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_fset_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth) {
		if (first instanceof SubLSymbol) {
			checkRedefinition(first);
			SubLSymbol symbol = checkSymbol(first);
			symbol.setSymbolFunction(second);
			final LispThread thread = LispThread.currentThread();
			SubLObject sourcePathname = _SOURCE_.symbolValue(thread);
			SubLObject sourcePosition = third;
			if (sourcePathname != NIL) {
				sourcePosition = _SOURCE_POSITION_.symbolValue(thread);
			}
			if (sourcePathname == NIL) {
				sourcePathname = Keyword.TOP_LEVEL;
			}
			if (sourcePathname != Keyword.TOP_LEVEL) {
				put(symbol, LispSymbols._SOURCE, makeCons(sourcePathname, third));
			} else {
				put(symbol, LispSymbols._SOURCE, sourcePathname);
			}
		} else if (isValidSetfFunctionName(first)) {
			// SETF function
			checkRedefinition(first);
			SubLSymbol symbol = checkSymbol(first.second());
			put(symbol, LispSymbols.SETF_FUNCTION, second);
		} else {
			return type_error(first, FUNCTION_NAME);
		}
		if (second instanceof Operator) {
			Operator op = (Operator) second;
			op.setLambdaName(first);
			if (fourth != NIL) {
				op.setLambdaList(fourth);
			}
			if (fifth != NIL) {
				op.setDocumentation(LispSymbols.FUNCTION, fifth);
			}
		}
		return second;
	}

	private static final class pf__set_symbol_plist extends JavaPrimitive {
		/**  Constructor for the pf__set_symbol_plist object */
		pf__set_symbol_plist() {
			super("%set-symbol-plist", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_symbol_plist_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_symbol_plist_execute(SubLObject first, SubLObject second) {
		checkSymbol(first).setPropertyList(checkList(second));
		return second;
	}

	private static final class pf_getf extends JavaPrimitive {
		/**  Constructor for the pf_getf object */
		pf_getf() {
			super(LispSymbols.GETF, "plist indicator &optional default");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  plist      Description of Parameter
		 * @param  indicator  Description of Parameter
		 * @return            Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject plist, SubLObject indicator) {
			return pf_getf_execute(plist, indicator);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  plist         Description of Parameter
		 * @param  indicator     Description of Parameter
		 * @param  defaultValue  Description of Parameter
		 * @return               Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject plist, SubLObject indicator, SubLObject defaultValue) {
			return pf_getf_execute(plist, indicator, defaultValue);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  plist      Description of Parameter
		* @param  indicator  Description of Parameter
		* @return            Description of the Returned Value
		*/
	static public SubLObject pf_getf_execute(SubLObject plist, SubLObject indicator) {
		return getf(plist, indicator, NIL);
	}

	/**
		*  Description of the Method
		*
		* @param  plist         Description of Parameter
		* @param  indicator     Description of Parameter
		* @param  defaultValue  Description of Parameter
		* @return               Description of the Returned Value
		*/
	static public SubLObject pf_getf_execute(SubLObject plist, SubLObject indicator, SubLObject defaultValue) {
		return getf(plist, indicator, defaultValue);
	}

	private static final class pf_get extends JavaPrimitive {
		/**  Constructor for the pf_get object */
		pf_get() {
			super(LispSymbols.GET, "symbol indicator &optional default");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  symbol     Description of Parameter
		 * @param  indicator  Description of Parameter
		 * @return            Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject symbol, SubLObject indicator) {
			return pf_get_execute(symbol, indicator);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  symbol        Description of Parameter
		 * @param  indicator     Description of Parameter
		 * @param  defaultValue  Description of Parameter
		 * @return               Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue) {
			return pf_get_execute(symbol, indicator, defaultValue);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  symbol     Description of Parameter
		* @param  indicator  Description of Parameter
		* @return            Description of the Returned Value
		*/
	static public SubLObject pf_get_execute(SubLObject symbol, SubLObject indicator) {
		return get(symbol, indicator, NIL);
	}

	/**
		*  Description of the Method
		*
		* @param  symbol        Description of Parameter
		* @param  indicator     Description of Parameter
		* @param  defaultValue  Description of Parameter
		* @return               Description of the Returned Value
		*/
	static public SubLObject pf_get_execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue) {
		return get(symbol, indicator, defaultValue);
	}

	private static final class pf_put extends JavaPrimitive {
		/**  Constructor for the pf_put object */
		pf_put() {
			super("put", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  symbol     Description of Parameter
		 * @param  indicator  Description of Parameter
		 * @param  value      Description of Parameter
		 * @return            Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject value) {
			return pf_put_execute(symbol, indicator, value);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  symbol        Description of Parameter
		 * @param  indicator     Description of Parameter
		 * @param  defaultValue  Description of Parameter
		 * @param  value         Description of Parameter
		 * @return               Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue, SubLObject value) {
			return pf_put_execute(symbol, indicator, defaultValue, value);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  symbol     Description of Parameter
		* @param  indicator  Description of Parameter
		* @param  value      Description of Parameter
		* @return            Description of the Returned Value
		*/
	static public SubLObject pf_put_execute(SubLObject symbol, SubLObject indicator, SubLObject value) {
		return put(checkSymbol(symbol), indicator, value);
	}

	/**
		*  Description of the Method
		*
		* @param  symbol        Description of Parameter
		* @param  indicator     Description of Parameter
		* @param  defaultValue  Description of Parameter
		* @param  value         Description of Parameter
		* @return               Description of the Returned Value
		*/
	static public SubLObject pf_put_execute(SubLObject symbol, SubLObject indicator, SubLObject defaultValue,
			SubLObject value) {
		return put(checkSymbol(symbol), indicator, value);
	}

	private static final class sf_macrolet extends SpecialOperator {
		/**  Constructor for the sf_macrolet object */
		sf_macrolet() {
			super(LispSymbols.MACROLET, "definitions &rest body");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_macrolet_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_macrolet_execute(SubLObject args, Environment env) {
		SubLObject defs = checkList(args.first());
		final LispThread thread = LispThread.currentThread();
		final SpecialBindingsMark mark = thread.markSpecialBindings();

		try {
			Environment ext = new Environment(env);
			while (defs != NIL) {
				SubLObject def = checkList(defs.first());
				SubLSymbol symbol = checkSymbol(def.first());
				SubLSymbol make_expander_for_macrolet = PACKAGE_SYS.intern("MAKE-EXPANDER-FOR-MACROLET");
				SubLObject expander = make_expander_for_macrolet.execute(def);
				Closure expansionFunction = new Closure(expander, env);
				MacroObject macroObject = new MacroObject(symbol, expansionFunction);
				ext.addFunctionBinding(symbol, macroObject);
				defs = defs.rest();
			}
			return progn(ext.processDeclarations(args.rest()), ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	private static final class pf_make_expander_for_macrolet extends JavaPrimitive {
		/**  Constructor for the pf_make_expander_for_macrolet object */
		pf_make_expander_for_macrolet() {
			super("make-expander-for-macrolet", PACKAGE_SYS, true, "definition");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  definition  Description of Parameter
		 * @return             Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject definition) {
			return pf_make_expander_for_macrolet_execute(definition);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  definition  Description of Parameter
		* @return             Description of the Returned Value
		*/
	static public SubLObject pf_make_expander_for_macrolet_execute(SubLObject definition) {
		SubLSymbol symbol = checkSymbol(definition.first());
		SubLObject lambdaList = definition.second();
		SubLObject body = definition.cddr();
		SubLObject block = makeCons(LispSymbols.BLOCK, makeCons(symbol, body));
		SubLObject toBeApplied = list(LispSymbols.LAMBDA, lambdaList, block);
		final LispThread thread = LispThread.currentThread();
		SubLObject formArg = gensym("WHOLE-", thread);
		SubLObject envArg = gensym("ENVIRONMENT-", thread);
		// Ignored.
		SubLObject expander = list(LispSymbols.LAMBDA, list(formArg, envArg), list(LispSymbols.APPLY, toBeApplied, list(LispSymbols.CDR,
				formArg)));
		return expander;
	}

	private static final class sf_tagbody extends SpecialOperator {
		/**  Constructor for the sf_tagbody object */
		sf_tagbody() {
			super(LispSymbols.TAGBODY, "&rest statements");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_tagbody_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_tagbody_execute(SubLObject args, Environment env) {
		Environment ext = new Environment(env);
		try {
			return processTagBody(args, preprocessTagBody(args, ext), ext);
		} finally {
			ext.inactive = true;
		}
	}

	private static final class sf_go extends SpecialOperator {
		/**  Constructor for the sf_go object */
		sf_go() {
			super(LispSymbols.GO, "tag");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_go_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_go_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 1) {
			return num_args_err();
		}
		Binding binding = env.getTagBinding(args.first());
		if (binding == null) {
			return error(new ControlError("No tag named " + args.first().writeToString() + " is currently visible."));
		}

		return nonLocalGo(binding, args.first());
	}

	private static final class sf_block extends SpecialOperator {
		/**  Constructor for the sf_block object */
		sf_block() {
			super(LispSymbols.BLOCK, "name &rest forms");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_block_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_block_execute(SubLObject args, Environment env) {
		if (args == NIL) {
			return num_args_err();
		}
		SubLObject tag;
		tag = checkSymbol(args.first());
		SubLObject body = ((SubLCons) args).rest();
		Environment ext = new Environment(env);
		final SubLObject block = new BlockLispObject();
		ext.addBlock(tag, block);
		SubLObject result = NIL;
		final LispThread thread = LispThread.currentThread();
		try {
			return progn(body, ext, thread);
		} catch (Return ret) {
			if (ret.getBlock() == block) {
				return ret.getResult();
			}
			throw ret;
		} finally {
			ext.inactive = true;
		}
	}

	private static final class sf_return_from extends SpecialOperator {
		/**  Constructor for the sf_return_from object */
		sf_return_from() {
			super(LispSymbols.RETURN_FROM, "name &optional value");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_return_from_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_return_from_execute(SubLObject args, Environment env) {
		final int length = args.cl_length();
		if (length < 1 || length > 2) {
			return num_args_err();
		}
		SubLSymbol symbol;
		symbol = checkSymbol(args.first());

		return nonLocalReturn(env.getBlockBinding(symbol), symbol, (length == 2) ? eval(args.second(), env, LispThread
				.currentThread()) : NIL);
	}

	private static final class sf_catch extends SpecialOperator {
		/**  Constructor for the sf_catch object */
		sf_catch() {
			super(LispSymbols.CATCH, "tag &body body");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_catch_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_catch_execute(SubLObject args, Environment env) {
		if (args.cl_length() < 1) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject tag = eval(args.first(), env, thread);
		thread.pushCatchTag(tag);
		SubLObject body = args.rest();
		SubLObject result = NIL;
		try {
			return progn(body, env, thread);
		} catch (Throw t) {
			if (t.tag == tag) {
				return t.getResult(thread);
			}
			throw t;
		} catch (Return ret) {
			throw ret;
		} finally {
			thread.popCatchTag();
		}
	}

	private static final class sf_throw extends SpecialOperator {
		/**  Constructor for the sf_throw object */
		sf_throw() {
			super(LispSymbols.THROW, "tag result");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_throw_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_throw_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 2) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		thread.throwToTag(eval(args.first(), env, thread), eval(args.second(), env, thread));
		// Not reached.
		return NIL;
	}

	private static final class sf_unwind_protect extends SpecialOperator {
		/**  Constructor for the sf_unwind_protect object */
		sf_unwind_protect() {
			super(LispSymbols.UNWIND_PROTECT, "protected &body cleanup");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_unwind_protect_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_unwind_protect_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result;
		SubLObject[] values;
		try {
			result = eval(args.first(), env, thread);
		} finally {
			values = thread._values;
			SubLObject body = args.rest();
			while (body != NIL) {
				eval(body.first(), env, thread);
				body = ((SubLCons) body).rest();
			}
			thread._values = values;
		}
		if (values != null) {
			thread.setValues(values);
		} else {
			thread._values = null;
		}
		return result;
	}

	private static final class sf_eval_when extends SpecialOperator {
		/**  Constructor for the sf_eval_when object */
		sf_eval_when() {
			super(LispSymbols.EVAL_WHEN, "situations &rest forms");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_eval_when_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_eval_when_execute(SubLObject args, Environment env) {
		SubLObject situations = args.first();
		if (situations != NIL) {
			if (memq(Keyword.EXECUTE, situations) || memq(LispSymbols.EVAL, situations)) {
				return progn(args.rest(), env, LispThread.currentThread());
			}
		}
		return NIL;
	}

	private static final class sf_multiple_value_bind extends SpecialOperator {
		/**  Constructor for the sf_multiple_value_bind object */
		sf_multiple_value_bind() {
			super(LispSymbols.MULTIPLE_VALUE_BIND, "vars value-form &body body");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_multiple_value_bind_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_multiple_value_bind_execute(SubLObject args, Environment env) {
		SubLObject vars = args.first();
		args = args.rest();
		SubLObject valuesForm = args.first();
		SubLObject body = args.rest();
		final LispThread thread = LispThread.currentThread();
		SubLObject value = eval(valuesForm, env, thread);
		SubLObject[] values = thread._values;
		if (values == null) {
			// eval() did not return multiple values.
			values = makeLispObjectArray(1);
			values[0] = value;
		}
		// Process declarations.
		SubLObject bodyAndDecls = parseBody(body, false);
		SubLObject specials = parseSpecials(bodyAndDecls.NTH(1));
		body = bodyAndDecls.first();

		final SpecialBindingsMark mark = thread.markSpecialBindings();
		final Environment ext = new Environment(env);
		int i = 0;
		SubLObject var = vars.first();
		while (var != NIL) {
			final SubLSymbol sym;

			sym = checkSymbol(var);

			SubLObject val = i < values.length ? values[i] : NIL;
			if (specials != NIL && memq(sym, specials)) {
				thread.bindSpecial(sym, val);
				ext.declareSpecial(sym);
			} else if (sym.isSpecialVariable()) {
				thread.bindSpecial(sym, val);
			} else {
				ext.bindSymbolVoid(sym, val);
			}
			vars = vars.rest();
			var = vars.first();
			++i;
		}
		// Make sure free special declarations are visible in the body.
		// "The scope of free declarations specifically does not include
		// initialization forms for bindings established by the form
		// containing the declarations." (3.3.4)
		while (specials != NIL) {
			SubLSymbol symbol = (SubLSymbol) specials.first();
			ext.declareSpecial(symbol);
			specials = ((SubLCons) specials).rest();
		}
		thread._values = null;
		SubLObject result = NIL;
		try {
			result = progn(body, ext, thread);
		} finally {
			thread.resetSpecialBindings(mark);
		}
		return result;
	}

	private static final class sf_multiple_value_prog1 extends SpecialOperator {
		/**  Constructor for the sf_multiple_value_prog1 object */
		sf_multiple_value_prog1() {
			super(LispSymbols.MULTIPLE_VALUE_PROG1, "values-form &rest forms");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_multiple_value_prog1_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_multiple_value_prog1_execute(SubLObject args, Environment env) {
		if (args.cl_length() == 0) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject result = eval(args.first(), env, thread);
		SubLObject[] values = thread._values;
		while ((args = args.rest()) != NIL) {
			eval(args.first(), env, thread);
		}
		if (values != null) {
			thread.setValues(values);
		} else {
			thread._values = null;
		}
		return result;
	}

	private static final class sf_multiple_value_call extends SpecialOperator {
		/**  Constructor for the sf_multiple_value_call object */
		sf_multiple_value_call() {
			super(LispSymbols.MULTIPLE_VALUE_CALL, "fun &rest args");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_multiple_value_call_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_multiple_value_call_execute(SubLObject args, Environment env) {
		if (args.cl_length() == 0) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject function;
		SubLObject obj = eval(args.first(), env, thread);
		args = args.rest();
		if (obj instanceof SubLSymbol) {
			function = obj.getSymbolFunction();
			if (function == null) {
				error(new UndefinedFunction(obj));
			}
		} else if (obj instanceof Function) {
			function = obj;
		} else {
			error(new LispError(obj.writeToString() + " is not a function name."));
			return NIL;
		}
		ArrayList<SubLObject> arrayList = new ArrayList<SubLObject>();
		while (args != NIL) {
			SubLObject form = args.first();
			SubLObject result = eval(form, env, thread);
			SubLObject[] values = thread._values;
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					arrayList.add(values[i]);
				}
			} else {
				arrayList.add(result);
			}
			args = ((SubLCons) args).rest();
		}
		SubLObject[] argv = new SubLObject[arrayList.size()];
		arrayList.toArray(argv);
		return funcall(function, argv, thread);
	}

	private static final class sf_and extends SpecialOperator {
		/**  Constructor for the sf_and object */
		sf_and() {
			super(LispSymbols.AND, "&rest forms");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_and_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_and_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = T;
		while (args != NIL) {
			result = eval(args.first(), env, thread);
			if (result == NIL) {
				if (((SubLCons) args).rest() != NIL) {
					// Not the last form.
					thread._values = null;
				}
				break;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	private static final class sf_or extends SpecialOperator {
		/**  Constructor for the sf_or object */
		sf_or() {
			super(LispSymbols.OR, "&rest forms");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_or_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_or_execute(SubLObject args, Environment env) {
		final LispThread thread = LispThread.currentThread();
		SubLObject result = NIL;
		while (args != NIL) {
			result = eval(args.first(), env, thread);
			if (result != NIL) {
				if (((SubLCons) args).rest() != NIL) {
					// Not the last form.
					thread._values = null;
				}
				break;
			}
			args = ((SubLCons) args).rest();
		}
		return result;
	}

	private static final class sf_multiple_value_list extends SpecialOperator {
		/**  Constructor for the sf_multiple_value_list object */
		sf_multiple_value_list() {
			super(LispSymbols.MULTIPLE_VALUE_LIST, "value-form");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_multiple_value_list_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_multiple_value_list_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 1) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		SubLObject result = eval(((SubLCons) args).first(), env, thread);
		SubLObject[] values = thread._values;
		if (values == null) {
			return makeCons(result);
		}
		thread._values = null;
		SubLObject list = NIL;
		for (int i = values.length; i-- > 0;) {
			list = makeCons(values[i], list);
		}
		return list;
	}

	private static final class sf_nth_value extends SpecialOperator {
		/**  Constructor for the sf_nth_value object */
		sf_nth_value() {
			super(LispSymbols.NTH_VALUE, "n form");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @param  env   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject args, Environment env) {
			return sf_nth_value_execute(args, env);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @param  env   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject sf_nth_value_execute(SubLObject args, Environment env) {
		if (args.cl_length() != 2) {
			return num_args_err();
		}
		final LispThread thread = LispThread.currentThread();
		int n = eval(args.first(), env, thread).intValue();
		if (n < 0) {
			n = 0;
		}
		SubLObject result = eval(args.second(), env, thread);
		SubLObject[] values = thread._values;
		thread._values = null;
		if (values == null) {
			// A single value was returned.
			return n == 0 ? result : NIL;
		}
		if (n < values.length) {
			return values[n];
		}
		return NIL;
	}

	private static final class pf_call_count extends JavaPrimitive {
		/**  Constructor for the pf_call_count object */
		pf_call_count() {
			super("call-count", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_call_count_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_call_count_execute(SubLObject arg) {
		//return Fixnum.getInstance(arg.getCallCount());
		int total = Profiler.getTotals(arg.getCallCount());
		return LispObjectFactory.makeInteger(total);
	}

	private static final class pf_set_call_count extends JavaPrimitive {
		/**  Constructor for the pf_set_call_count object */
		pf_set_call_count() {
			super("set-call-count", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_set_call_count_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_set_call_count_execute(SubLObject first, SubLObject second) {
		first.setCallCount(second.intValue());
		return second;
	}

	private static final class pf_hot_count extends JavaPrimitive {
		/**  Constructor for the pf_hot_count object */
		pf_hot_count() {
			super("hot-count", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_hot_count_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_hot_count_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.getHotCount());
	}

	private static final class pf_set_hot_count extends JavaPrimitive {
		/**  Constructor for the pf_set_hot_count object */
		pf_set_hot_count() {
			super("set-hot-count", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_set_hot_count_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_set_hot_count_execute(SubLObject first, SubLObject second) {
		first.setHotCount(second.intValue());
		return second;
	}

	private static final class pf_lambda_name extends JavaPrimitive {
		/**  Constructor for the pf_lambda_name object */
		pf_lambda_name() {
			super("lambda-name", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_lambda_name_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_lambda_name_execute(SubLObject arg) {
		if (arg instanceof Operator) {
			return ((Operator) arg).getLambdaName();
		}
		if (arg instanceof StandardGenericFunction) {
			return ((StandardGenericFunction) arg).getGenericFunctionName();
		}
		return type_error(arg, LispSymbols.FUNCTION);
	}

	private static final class pf__set_lambda_name extends JavaPrimitive {
		/**  Constructor for the pf__set_lambda_name object */
		pf__set_lambda_name() {
			super("%set-lambda-name", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_lambda_name_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
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
		return type_error(first, LispSymbols.FUNCTION);
	}

	private static final class pf_subseq extends JavaPrimitive {
		/**  Constructor for the pf_subseq object */
		pf_subseq() {
			super(PACKAGE_SYS.intern("%SUBSEQ"), "sequence start &optional end");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_subseq_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_subseq_execute(first, second, third);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_subseq_execute(SubLObject first, SubLObject second) {
		final int start = second.intValue();
		if (start < 0) {
			StringBuilder sb = new StringBuilder("Bad start index (");
			sb.append(start);
			sb.append(") for SUBSEQ.");
			error(new TypeError(sb.toString()));
		}
		if (first.isList()) {
			return list_subseq(first, start, -1);
		}
		if (first instanceof AbstractVector) {
			final AbstractVector v = (AbstractVector) first;
			return v.subseq(start, v.cl_length());
		}
		return type_error(first, LispSymbols.SEQUENCE);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_subseq_execute(SubLObject first, SubLObject second, SubLObject third) {
		final int start = second.intValue();
		if (start < 0) {
			StringBuilder sb = new StringBuilder("Bad start index (");
			sb.append(start);
			sb.append(").");
			error(new TypeError(sb.toString()));
		}
		int end;
		if (third != NIL) {
			end = third.intValue();
			if (start > end) {
				StringBuilder sb = new StringBuilder("Start index (");
				sb.append(start);
				sb.append(") is greater than end index (");
				sb.append(end);
				sb.append(") for SUBSEQ.");
				error(new TypeError(sb.toString()));
			}
		} else {
			end = -1;
		}
		if (first.isList()) {
			return list_subseq(first, start, end);
		}
		if (first instanceof AbstractVector) {
			final AbstractVector v = (AbstractVector) first;
			if (end < 0) {
				end = v.cl_length();
			}
			return v.subseq(start, end);
		}
		return type_error(first, LispSymbols.SEQUENCE);
	}

	private static final class pf_list extends JavaPrimitive {
		/**  Constructor for the pf_list object */
		pf_list() {
			super(LispSymbols.LIST, "&rest objects");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_list_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_list_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_list_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_list_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf_list_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_list_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_list_execute() {
		return NIL;
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject arg) {
		return makeCons(arg);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second) {
		return makeCons(first, makeCons(second));
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second, SubLObject third) {
		return makeCons(first, makeCons(second, makeCons(third)));
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	@InlinableMethod
	static public SubLObject pf_list_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return makeCons(first, makeCons(second, makeCons(third, makeCons(fourth))));
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_list_execute(SubLObject[] args) {
		SubLObject result = NIL;
		for (int i = args.length; i-- > 0;) {
			result = makeCons(args[i], result);
		}
		return result;
	}

	private static final class pf_list_star extends JavaPrimitive {
		/**  Constructor for the pf_list_star object */
		pf_list_star() {
			super(LispSymbols.LIST_STAR, "&rest objects");
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_list_star_execute();
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_list_star_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_list_star_execute(first, second);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf_list_star_execute(first, second, third);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @param  fourth  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
			return pf_list_star_execute(first, second, third, fourth);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  args  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject[] args) {
			return pf_list_star_execute(args);
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute() {
		return num_args_err();
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute(SubLObject arg) {
		return arg;
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second) {
		return makeCons(first, second);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second, SubLObject third) {
		return makeCons(first, makeCons(second, third));
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @param  fourth  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		return makeCons(first, makeCons(second, makeCons(third, fourth)));
	}

	/**
		*  Description of the Method
		*
		* @param  args  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_list_star_execute(SubLObject[] args) {
		int i = args.length - 1;
		SubLObject result = args[i];
		while (i-- > 0) {
			result = makeCons(args[i], result);
		}
		return result;
	}

	private static final class pf_nreverse extends JavaPrimitive {
		/**  Constructor for the pf_nreverse object */
		pf_nreverse() {
			super("%NREVERSE", PACKAGE_SYS, false, "sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_nreverse_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_nreverse_execute(SubLObject arg) {
		return arg.nreverse();
	}

	private static final class pf_nreconc extends JavaPrimitive {
		/**  Constructor for the pf_nreconc object */
		pf_nreconc() {
			super(LispSymbols.NRECONC, "list tail");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  list  Description of Parameter
		 * @param  obj   Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject list, SubLObject obj) {
			return pf_nreconc_execute(list, obj);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  list  Description of Parameter
		* @param  obj   Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_nreconc_execute(SubLObject list, SubLObject obj) {
		if (list instanceof SubLCons) {
			SubLObject list3 = list.rest();
			if (list3 instanceof SubLCons) {
				if (list3.rest() instanceof SubLCons) {
					SubLObject list1 = list3;
					SubLObject list2 = NIL;
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
			} else if (list3 == NIL) {
				list.setCdr(obj);
			} else {
				type_error(list3, LispSymbols.LIST);
			}
			return list;
		} else if (list == NIL) {
			return obj;
		} else {
			return type_error(list, LispSymbols.LIST);
		}
	}

	private static final class pf_reverse extends JavaPrimitive {
		/**  Constructor for the pf_reverse object */
		pf_reverse() {
			super("%reverse", PACKAGE_SYS, false, "sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_reverse_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_reverse_execute(SubLObject arg) {
		return arg.reverse();
	}

	private static final class pf_delete_eq extends JavaPrimitive {
		/**  Constructor for the pf_delete_eq object */
		pf_delete_eq() {
			super("delete-eq", PACKAGE_SYS, true, "item sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  item      Description of Parameter
		 * @param  sequence  Description of Parameter
		 * @return           Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject item, SubLObject sequence) {
			return pf_delete_eq_execute(item, sequence);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  item      Description of Parameter
		* @param  sequence  Description of Parameter
		* @return           Description of the Returned Value
		*/
	static public SubLObject pf_delete_eq_execute(SubLObject item, SubLObject sequence) {
		if (sequence instanceof AbstractVector) {
			return ((AbstractVector) sequence).deleteEq(item);
		} else {
			return LIST_DELETE_EQ.execute(item, sequence);
		}
	}

	private static final class pf_delete_eql extends JavaPrimitive {
		/**  Constructor for the pf_delete_eql object */
		pf_delete_eql() {
			super("delete-eql", PACKAGE_SYS, true, "item sequence");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  item      Description of Parameter
		 * @param  sequence  Description of Parameter
		 * @return           Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject item, SubLObject sequence) {
			return pf_delete_eql_execute(item, sequence);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  item      Description of Parameter
		* @param  sequence  Description of Parameter
		* @return           Description of the Returned Value
		*/
	static public SubLObject pf_delete_eql_execute(SubLObject item, SubLObject sequence) {
		if (sequence instanceof AbstractVector) {
			return ((AbstractVector) sequence).deleteEql(item);
		} else {
			return LIST_DELETE_EQL.execute(item, sequence);
		}
	}

	private static final class pf_list_delete_eq extends JavaPrimitive {
		/**  Constructor for the pf_list_delete_eq object */
		pf_list_delete_eq() {
			super("list-delete-eq", PACKAGE_SYS, true, "item list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  item  Description of Parameter
		 * @param  list  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject item, SubLObject list) {
			return pf_list_delete_eq_execute(item, list);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  item  Description of Parameter
		* @param  list  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_list_delete_eq_execute(SubLObject item, SubLObject list) {
		if (list instanceof SubLCons) {
			SubLObject tail = list;
			SubLObject splice = list;
			while (tail instanceof SubLCons) {
				SubLObject car = tail.first();
				if (car == item) {
					if (tail.rest() != NIL) {
						SubLObject temp = tail;
						tail.setCar(temp.second());
						tail.setCdr(temp.cddr());
					} else {
						// Last item.
						if (tail == list) {
							return NIL;
						}
						splice.setCdr(NIL);
						return list;
					}
				} else {
					splice = tail;
					tail = tail.rest();
				}
			}
			if (tail == NIL) {
				return list;
			} else {
				return type_error(tail, LispSymbols.LIST);
			}
		} else if (list == NIL) {
			return list;
		} else {
			return type_error(list, LispSymbols.LIST);
		}
	}

	private static final class pf_list_delete_eql extends JavaPrimitive {
		/**  Constructor for the pf_list_delete_eql object */
		pf_list_delete_eql() {
			super("list-delete-eql", PACKAGE_SYS, true, "item list");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  item  Description of Parameter
		 * @param  list  Description of Parameter
		 * @return       Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject item, SubLObject list) {
			return pf_list_delete_eql_execute(item, list);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  item  Description of Parameter
		* @param  list  Description of Parameter
		* @return       Description of the Returned Value
		*/
	static public SubLObject pf_list_delete_eql_execute(SubLObject item, SubLObject list) {
		if (list instanceof SubLCons) {
			SubLObject tail = list;
			SubLObject splice = list;
			while (tail instanceof SubLCons) {
				SubLObject car = tail.first();
				if (car.eql(item)) {
					if (tail.rest() != NIL) {
						SubLObject temp = tail;
						tail.setCar(temp.second());
						tail.setCdr(temp.cddr());
					} else {
						// Last item.
						if (tail == list) {
							return NIL;
						}
						splice.setCdr(NIL);
						return list;
					}
				} else {
					splice = tail;
					tail = tail.rest();
				}
			}
			if (tail == NIL) {
				return list;
			} else {
				return type_error(tail, LispSymbols.LIST);
			}
		} else if (list == NIL) {
			return list;
		} else {
			return type_error(list, LispSymbols.LIST);
		}
	}

	private static final class pf__set_elt extends JavaPrimitive {
		/**  Constructor for the pf__set_elt object */
		pf__set_elt() {
			super("%set-elt", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @param  third   Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return pf__set_elt_execute(first, second, third);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @param  third   Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_elt_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first instanceof AbstractVector) {
			((AbstractVector) first).aset(second.intValue(), third);
			return third;
		}
		if (first instanceof SubLCons) {
			int index = second.intValue();
			if (index < 0) {
				error(new TypeError());
			}
			SubLObject list = first;
			int i = 0;
			while (true) {
				if (i == index) {
					list.setCar(third);
					return third;
				}
				list = list.rest();
				if (list == NIL) {
					error(new TypeError());
				}
				++i;
			}
		}
		return type_error(first, LispSymbols.SEQUENCE);
	}

	private static final class pf__make_list extends JavaPrimitive {
		/**  Constructor for the pf__make_list object */
		pf__make_list() {
			super("%make-list", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__make_list_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__make_list_execute(SubLObject first, SubLObject second) {
		int size = first.intValue();
		if (size < 0) {
			return type_error(first, list(LispSymbols.INTEGER, Fixnum.ZERO, LispSymbols.MOST_POSITIVE_FIXNUM.getSymbolValue()));
		}
		SubLObject result = NIL;
		for (int i = size; i-- > 0;) {
			result = makeCons(second, result);
		}
		return result;
	}

	private static final class pf__member extends JavaPrimitive {
		/**  Constructor for the pf__member object */
		pf__member() {
			super("%member", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  item     Description of Parameter
		 * @param  list     Description of Parameter
		 * @param  key      Description of Parameter
		 * @param  test     Description of Parameter
		 * @param  testNot  Description of Parameter
		 * @return          Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject item, SubLObject list, SubLObject key, SubLObject test, SubLObject testNot) {
			return pf__member_execute(item, list, key, test, testNot);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  item     Description of Parameter
		* @param  list     Description of Parameter
		* @param  key      Description of Parameter
		* @param  test     Description of Parameter
		* @param  testNot  Description of Parameter
		* @return          Description of the Returned Value
		*/
	static public SubLObject pf__member_execute(SubLObject item, SubLObject list, SubLObject key, SubLObject test,
			SubLObject testNot) {
		SubLObject tail = checkList(list);
		if (test != NIL && testNot != NIL) {
			error(new LispError("MEMBER: test and test-not both supplied"));
		}
		if (testNot == NIL) {
			if (test == NIL || test == LispSymbols.EQL) {
				test = EQL;
			}
		}
		if (key == NIL) {
			if (test == EQL) {
				while (tail instanceof SubLCons) {
					if (item.eql(((SubLCons) tail).first())) {
						return tail;
					}
					tail = ((SubLCons) tail).rest();
				}
			} else if (test != NIL) {
				while (tail instanceof SubLCons) {
					SubLObject candidate = ((SubLCons) tail).first();
					if (test.execute(item, candidate) != NIL) {
						return tail;
					}
					tail = ((SubLCons) tail).rest();
				}
			} else {
				// test == NIL
				while (tail instanceof SubLCons) {
					SubLObject candidate = ((SubLCons) tail).first();
					if (testNot.execute(item, candidate) == NIL) {
						return tail;
					}
					tail = ((SubLCons) tail).rest();
				}
			}
		} else {
			// key != NIL
			while (tail instanceof SubLCons) {
				SubLObject candidate = key.execute(((SubLCons) tail).first());
				if (test != NIL) {
					if (test.execute(item, candidate) != NIL) {
						return tail;
					}
				} else {
					if (testNot.execute(item, candidate) == NIL) {
						return tail;
					}
				}
				tail = ((SubLCons) tail).rest();
			}
		}
		if (tail != NIL) {
			type_error(tail, LispSymbols.LIST);
		}
		return NIL;
	}

	private static final class pf_funcall_key extends JavaPrimitive {
		/**  Constructor for the pf_funcall_key object */
		pf_funcall_key() {
			super("funcall-key", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_funcall_key_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_funcall_key_execute(SubLObject first, SubLObject second) {
		if (first != NIL) {
			return LispThread.currentThread().execute(first, second);
		}
		return second;
	}

	private static final class pf_coerce_to_function extends JavaPrimitive {
		/**  Constructor for the pf_coerce_to_function object */
		pf_coerce_to_function() {
			super("coerce-to-function", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_coerce_to_function_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_coerce_to_function_execute(SubLObject arg) {
		return coerceToFunction(arg);
	}

	@NoInline
	private static final class pf_make_closure extends JavaPrimitive {
		/**  Constructor for the pf_make_closure object */
		pf_make_closure() {
			super("make-closure", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_make_closure_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_make_closure_execute(SubLObject first, SubLObject second) {
		if (first instanceof SubLCons && ((SubLCons) first).first() == LispSymbols.LAMBDA) {
			final Environment env;
			if (second == NIL) {
				env = new Environment();
			} else {
				env = checkEnvironment(second);
			}
			return new Closure(first, env);
		}
		return error(new TypeError("The argument to MAKE-CLOSURE is not a lambda form."));
	}

	private static final class pf_streamp extends JavaPrimitive {
		/**  Constructor for the pf_streamp object */
		pf_streamp() {
			super(LispSymbols.STREAMP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_streamp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_streamp_execute(SubLObject arg) {
		return arg instanceof LispStream ? T : NIL;
	}

	private static final class pf_integerp extends JavaPrimitive {
		/**  Constructor for the pf_integerp object */
		pf_integerp() {
			super(LispSymbols.INTEGERP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_integerp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_integerp_execute(SubLObject arg) {
		return arg.INTEGERP();
	}

	private static final class pf_evenp extends JavaPrimitive {
		/**  Constructor for the pf_evenp object */
		pf_evenp() {
			super(LispSymbols.EVENP, "integer");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_evenp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_evenp_execute(SubLObject arg) {
		return arg.EVENP();
	}

	private static final class pf_oddp extends JavaPrimitive {
		/**  Constructor for the pf_oddp object */
		pf_oddp() {
			super(LispSymbols.ODDP, "integer");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_oddp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_oddp_execute(SubLObject arg) {
		return arg.ODDP();
	}

	private static final class pf_numberp extends JavaPrimitive {
		/**  Constructor for the pf_numberp object */
		pf_numberp() {
			super(LispSymbols.NUMBERP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_numberp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_numberp_execute(SubLObject arg) {
		return arg.NUMBERP();
	}

	private static final class pf_realp extends JavaPrimitive {
		/**  Constructor for the pf_realp object */
		pf_realp() {
			super(LispSymbols.REALP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_realp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_realp_execute(SubLObject arg) {
		return arg.REALP();
	}

	private static final class pf_rationalp extends JavaPrimitive {
		/**  Constructor for the pf_rationalp object */
		pf_rationalp() {
			super(LispSymbols.RATIONALP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_rationalp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_rationalp_execute(SubLObject arg) {
		return arg.RATIONALP();
	}

	private static final class pf_complex extends JavaPrimitive {
		/**  Constructor for the pf_complex object */
		pf_complex() {
			super(LispSymbols.COMPLEX, "realpart &optional imagpart");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_complex_execute(arg);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_complex_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_complex_execute(SubLObject arg) {
		if (arg instanceof SingleFloat) {
			return LispObjectFactory.makeComplex(arg, SingleFloat.ZERO);
		}
		if (arg instanceof DoubleFloat) {
			return LispObjectFactory.makeComplex(arg, DoubleFloat.ZERO);
		}
		if (arg.realp()) {
			return arg;
		}
		return type_error(arg, LispSymbols.REAL);
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_complex_execute(SubLObject first, SubLObject second) {
		return LispObjectFactory.makeComplex(first, second);
	}

	private static final class pf_complexp extends JavaPrimitive {
		/**  Constructor for the pf_complexp object */
		pf_complexp() {
			super(LispSymbols.COMPLEXP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_complexp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_complexp_execute(SubLObject arg) {
		return arg.COMPLEXP();
	}

	private static final class pf_numerator extends JavaPrimitive {
		/**  Constructor for the pf_numerator object */
		pf_numerator() {
			super(LispSymbols.NUMERATOR, "rational");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_numerator_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_numerator_execute(SubLObject arg) {
		return arg.NUMERATOR();
	}

	private static final class pf_denominator extends JavaPrimitive {
		/**  Constructor for the pf_denominator object */
		pf_denominator() {
			super(LispSymbols.DENOMINATOR, "rational");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_denominator_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_denominator_execute(SubLObject arg) {
		return arg.DENOMINATOR();
	}

	private static final class pf_realpart extends JavaPrimitive {
		/**  Constructor for the pf_realpart object */
		pf_realpart() {
			super(LispSymbols.REALPART, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_realpart_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_realpart_execute(SubLObject arg) {
		if (arg instanceof Complex) {
			return ((Complex) arg).getRealPart();
		}
		if (arg.isNumber()) {
			return arg;
		}
		return type_error(arg, LispSymbols.NUMBER);
	}

	private static final class pf_imagpart extends JavaPrimitive {
		/**  Constructor for the pf_imagpart object */
		pf_imagpart() {
			super(LispSymbols.IMAGPART, "number");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_imagpart_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_imagpart_execute(SubLObject arg) {
		if (arg instanceof Complex) {
			return ((Complex) arg).getImaginaryPart();
		}
		return arg.mult(Fixnum.ZERO);
	}

	private static final class pf_integer_length extends JavaPrimitive {
		/**  Constructor for the pf_integer_length object */
		pf_integer_length() {
			super(LispSymbols.INTEGER_LENGTH, "integer");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_integer_length_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_integer_length_execute(SubLObject arg) {
		if (arg instanceof Fixnum) {
			int n = ((Fixnum) arg).value;
			if (n < 0) {
				n = ~n;
			}
			int count = 0;
			while (n > 0) {
				n = n >>> 1;
				++count;
			}
			return LispObjectFactory.makeInteger(count);
		}
		if (arg instanceof Bignum) {
			return LispObjectFactory.makeInteger(((Bignum) arg).bigIntegerValue().bitLength());
		}
		return type_error(arg, LispSymbols.INTEGER);
	}

	private static final class pf_gcd_2 extends JavaPrimitive {
		/**  Constructor for the pf_gcd_2 object */
		pf_gcd_2() {
			super("gcd-2", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_gcd_2_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_gcd_2_execute(SubLObject first, SubLObject second) {
		BigInteger n1;
		BigInteger n2;
		if (first instanceof Fixnum) {
			n1 = BigInteger.valueOf(((Fixnum) first).value);
		} else if (first instanceof Bignum) {
			n1 = ((Bignum) first).bigIntegerValue();
		} else {
			return type_error(first, LispSymbols.INTEGER);
		}
		if (second instanceof Fixnum) {
			n2 = BigInteger.valueOf(((Fixnum) second).value);
		} else if (second instanceof Bignum) {
			n2 = ((Bignum) second).bigIntegerValue();
		} else {
			return type_error(second, LispSymbols.INTEGER);
		}
		return number(n1.gcd(n2));
	}

	private static final class pf_identity_hash_code extends JavaPrimitive {
		/**  Constructor for the pf_identity_hash_code object */
		pf_identity_hash_code() {
			super("identity-hash-code", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_identity_hash_code_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_identity_hash_code_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(System.identityHashCode(arg));
	}

	private static final class pf_uptime extends JavaPrimitive {
		/**  Constructor for the pf_uptime object */
		pf_uptime() {
			super("uptime", PACKAGE_EXT, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @return    Description of the Returned Value
		 */
		@Override
		public SubLObject execute() {
			return pf_uptime_execute();
		}
	}

	/**
		*  Description of the Method
		*
		* @return    Description of the Returned Value
		*/
	static public SubLObject pf_uptime_execute() {
		return number(System.currentTimeMillis() - Main.startTimeMillis);
	}

	private static final class pf_built_in_function_p extends JavaPrimitive {
		/**  Constructor for the pf_built_in_function_p object */
		pf_built_in_function_p() {
			super("built-in-function-p", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_built_in_function_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_built_in_function_p_execute(SubLObject arg) {
		return checkSymbol(arg).isBuiltInFunction() ? T : NIL;
	}

	private static final class pf_inspected_parts extends JavaPrimitive {
		/**  Constructor for the pf_inspected_parts object */
		pf_inspected_parts() {
			super("inspected-parts", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_inspected_parts_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_inspected_parts_execute(SubLObject arg) {
		return arg.getParts();
	}

	private static final class pf_inspected_description extends JavaPrimitive {
		/**  Constructor for the pf_inspected_description object */
		pf_inspected_description() {
			super("inspected-description", PACKAGE_SYS, false);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_inspected_description_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_inspected_description_execute(SubLObject arg) {
		return arg.getDescription();
	}

	private static final class pf_symbol_name extends JavaPrimitive {
		/**  Constructor for the pf_symbol_name object */
		pf_symbol_name() {
			super(LispSymbols.SYMBOL_NAME, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_name_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_name_execute(SubLObject arg) {
		return checkSymbol(arg).getSubLName();
	}

	private static final class pf_symbol_package extends JavaPrimitive {
		/**  Constructor for the pf_symbol_package object */
		pf_symbol_package() {
			super(LispSymbols.SYMBOL_PACKAGE, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_package_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_package_execute(SubLObject arg) {
		return checkSymbol(arg).getLispPackage();
	}

	private static final class pf_symbol_function extends JavaPrimitive {
		/**  Constructor for the pf_symbol_function object */
		pf_symbol_function() {
			super(LispSymbols.SYMBOL_FUNCTION, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_function_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_function_execute(SubLObject arg) {
		SubLObject function = checkSymbol(arg).getSymbolFunction();
		if (function != null) {
			return function;
		}
		return error(new UndefinedFunction(arg));
	}

	private static final class pf__set_symbol_function extends JavaPrimitive {
		/**  Constructor for the pf__set_symbol_function object */
		pf__set_symbol_function() {
			super("%set-symbol-function", PACKAGE_SYS, false, "symbol function");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_symbol_function_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_symbol_function_execute(SubLObject first, SubLObject second) {
		checkSymbol(first).setSymbolFunction(second);
		return second;
	}

	private static final class pf_symbol_plist extends JavaPrimitive {
		/**  Constructor for the pf_symbol_plist object */
		pf_symbol_plist() {
			super(LispSymbols.SYMBOL_PLIST, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_symbol_plist_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_symbol_plist_execute(SubLObject arg) {
		return checkSymbol(arg).getPropertyList();
	}

	private static final class pf_keywordp extends JavaPrimitive {
		/**  Constructor for the pf_keywordp object */
		pf_keywordp() {
			super(LispSymbols.KEYWORDP, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_keywordp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_keywordp_execute(SubLObject arg) {
		if (arg instanceof SubLSymbol) {
			if (checkSymbol(arg).isKeyword()) {
				return T;
			}
		}
		return NIL;
	}

	private static final class pf_make_symbol extends JavaPrimitive {
		/**  Constructor for the pf_make_symbol object */
		pf_make_symbol() {
			super(LispSymbols.MAKE_SYMBOL, "name");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_make_symbol_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_make_symbol_execute(SubLObject arg) {
		if (arg instanceof SimpleString) {
			return makeSymbol((SimpleString) arg);
		}
		// Not a simple string.
		if (arg instanceof SubLString) {
			return makeSymbol(arg.getString());
		}
		return type_error(arg, LispSymbols.STRING);
	}

	private static final class pf_makunbound extends JavaPrimitive {
		/**  Constructor for the pf_makunbound object */
		pf_makunbound() {
			super(LispSymbols.MAKUNBOUND, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_makunbound_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_makunbound_execute(SubLObject arg) {
		checkSymbol(arg).setSymbolValue(null);
		return arg;
	}

	private static final class pf__class_name extends JavaPrimitive {
		/**  Constructor for the pf__class_name object */
		pf__class_name() {
			super("%class-name", PACKAGE_SYS, true, "class");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__class_name_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__class_name_execute(SubLObject arg) {
		return checkClass(arg).getLispClassName();
	}

	private static final class pf__set_class_name extends JavaPrimitive {
		/**  Constructor for the pf__set_class_name object */
		pf__set_class_name() {
			super("%set-class-name", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_name_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_name_execute(SubLObject first, SubLObject second) {
		checkClass(first).setLispClassName(checkSymbol(second));
		return second;
	}

	@NoInline
	private static final class pf_class_layout extends JavaPrimitive {
		/**  Constructor for the pf_class_layout object */
		pf_class_layout() {
			super("class-layout", PACKAGE_SYS, true, "class");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_layout_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_layout_execute(SubLObject arg) {
		Layout layout = checkClass(arg).getClassLayout();
		return layout != null ? layout : NIL;
	}

	private static final class pf__set_class_layout extends JavaPrimitive {
		/**  Constructor for the pf__set_class_layout object */
		pf__set_class_layout() {
			super("%set-class-layout", PACKAGE_SYS, true, "class layout");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_layout_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_layout_execute(SubLObject first, SubLObject second) {
		if (second instanceof Layout) {
			checkClass(first).setClassLayout((Layout) second);
			return second;
		}
		return type_error(second, LispSymbols.LAYOUT);
	}

	private static final class pf_class_direct_superclasses extends JavaPrimitive {
		/**  Constructor for the pf_class_direct_superclasses object */
		pf_class_direct_superclasses() {
			super("class-direct-superclasses", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_direct_superclasses_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_direct_superclasses_execute(SubLObject arg) {
		return checkClass(arg).getDirectSuperclasses();
	}

	private static final class pf__set_class_direct_superclasses extends JavaPrimitive {
		/**  Constructor for the pf__set_class_direct_superclasses object */
		pf__set_class_direct_superclasses() {
			super("%set-class-direct-superclasses", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_direct_superclasses_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_direct_superclasses_execute(SubLObject first, SubLObject second) {
		checkClass(first).setDirectSuperclasses(second);
		return second;
	}

	private static final class pf_class_direct_subclasses extends JavaPrimitive {
		/**  Constructor for the pf_class_direct_subclasses object */
		pf_class_direct_subclasses() {
			super("class-direct-subclasses", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_direct_subclasses_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_direct_subclasses_execute(SubLObject arg) {
		return checkClass(arg).getDirectSubclasses();
	}

	private static final class pf__set_class_direct_subclasses extends JavaPrimitive {
		/**  Constructor for the pf__set_class_direct_subclasses object */
		pf__set_class_direct_subclasses() {
			super("%set-class-direct-subclasses", PACKAGE_SYS, true, "class direct-subclasses");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_direct_subclasses_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_direct_subclasses_execute(SubLObject first, SubLObject second) {
		checkClass(first).setDirectSubclasses(second);
		return second;
	}

	private static final class pf__class_precedence_list extends JavaPrimitive {
		/**  Constructor for the pf__class_precedence_list object */
		pf__class_precedence_list() {
			super("%class-precedence-list", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf__class_precedence_list_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf__class_precedence_list_execute(SubLObject arg) {
		return checkClass(arg).getCPL();
	}

	private static final class pf_set_class_precedence_list extends JavaPrimitive {
		/**  Constructor for the pf_set_class_precedence_list object */
		pf_set_class_precedence_list() {
			super("set-class-precedence-list", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf_set_class_precedence_list_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf_set_class_precedence_list_execute(SubLObject first, SubLObject second) {
		checkClass(first).setCPL(second);
		return second;
	}

	private static final class pf_class_direct_methods extends JavaPrimitive {
		/**  Constructor for the pf_class_direct_methods object */
		pf_class_direct_methods() {
			super("class-direct-methods", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_direct_methods_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_direct_methods_execute(SubLObject arg) {
		return checkClass(arg).getDirectMethods();
	}

	@NoInline
	private static final class pf__set_class_direct_methods extends JavaPrimitive {
		/**  Constructor for the pf__set_class_direct_methods object */
		pf__set_class_direct_methods() {
			super("%set-class-direct-methods", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_direct_methods_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_direct_methods_execute(SubLObject first, SubLObject second) {
		checkClass(first).setDirectMethods(second);
		return second;
	}

	private static final class pf_class_documentation extends JavaPrimitive {
		/**  Constructor for the pf_class_documentation object */
		pf_class_documentation() {
			super("class-documentation", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_documentation_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_documentation_execute(SubLObject arg) {
		return checkClass(arg).getDocumentation();
	}

	private static final class pf__set_class_documentation extends JavaPrimitive {
		/**  Constructor for the pf__set_class_documentation object */
		pf__set_class_documentation() {
			super("%set-class-documentation", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_documentation_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_documentation_execute(SubLObject first, SubLObject second) {
		checkClass(first).setDocumentation(second);
		return second;
	}

	private static final class pf_class_finalized_p extends JavaPrimitive {
		/**  Constructor for the pf_class_finalized_p object */
		pf_class_finalized_p() {
			super("class-finalized-p", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_class_finalized_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_class_finalized_p_execute(SubLObject arg) {
		return checkClass(arg).isFinalized() ? T : NIL;
	}

	private static final class pf__set_class_finalized_p extends JavaPrimitive {
		/**  Constructor for the pf__set_class_finalized_p object */
		pf__set_class_finalized_p() {
			super("%set-class-finalized-p", PACKAGE_SYS, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  first   Description of Parameter
		 * @param  second  Description of Parameter
		 * @return         Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return pf__set_class_finalized_p_execute(first, second);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  first   Description of Parameter
		* @param  second  Description of Parameter
		* @return         Description of the Returned Value
		*/
	static public SubLObject pf__set_class_finalized_p_execute(SubLObject first, SubLObject second) {
		checkClass(first).setFinalized(second != NIL);
		return second;
	}

	private static final class pf_classp extends JavaPrimitive {
		/**  Constructor for the pf_classp object */
		pf_classp() {
			super("classp", PACKAGE_EXT, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_classp_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_classp_execute(SubLObject arg) {
		return arg instanceof LispClass ? T : NIL;
	}

	private static final class pf_char_to_utf8 extends JavaPrimitive {
		/**  Constructor for the pf_char_to_utf8 object */
		pf_char_to_utf8() {
			super("char-to-utf8", PACKAGE_EXT, true);
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_char_to_utf8_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_char_to_utf8_execute(SubLObject arg) {
		final LispCharacter c;
		c = checkCharacter(arg);
		char[] chars = new char[1];
		chars[0] = c.value;
		String s = new String(chars);
		final byte[] bytes;
		try {
			bytes = s.getBytes("UTF8");
		} catch (java.io.UnsupportedEncodingException e) {
			return error(new LispError("UTF8 is not a supported encoding."));
		}
		SubLObject[] objects = new SubLObject[bytes.length];
		for (int i = bytes.length; i-- > 0;) {
			int n = bytes[i];
			if (n < 0) {
				n += 256;
			}
			objects[i] = LispObjectFactory.makeInteger(n);
		}
		return makeSimpleVector(objects);
	}

	private static final class pf__documentation extends JavaPrimitive {
		/**  Constructor for the pf__documentation object */
		pf__documentation() {
			super("%documentation", PACKAGE_SYS, true, "object doc-type");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  object   Description of Parameter
		 * @param  docType  Description of Parameter
		 * @return          Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject object, SubLObject docType) {
			return pf__documentation_execute(object, docType);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  object   Description of Parameter
		* @param  docType  Description of Parameter
		* @return          Description of the Returned Value
		*/
	static public SubLObject pf__documentation_execute(SubLObject object, SubLObject docType) {
		SubLObject doc = object.getDocumentation(docType);
		if (doc == NIL) {
			if (docType == LispSymbols.FUNCTION && object instanceof SubLSymbol) {
				SubLObject function = object.getSymbolFunction();
				if (function != null) {
					doc = function.getDocumentation(docType);
				}
			}
		}
		return doc;
	}

	private static final class pf__set_documentation extends JavaPrimitive {
		/**  Constructor for the pf__set_documentation object */
		pf__set_documentation() {
			super("%set-documentation", PACKAGE_SYS, true, "object doc-type documentation");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  object         Description of Parameter
		 * @param  docType        Description of Parameter
		 * @param  documentation  Description of Parameter
		 * @return                Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject object, SubLObject docType, SubLObject documentation) {
			return pf__set_documentation_execute(object, docType, documentation);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  object         Description of Parameter
		* @param  docType        Description of Parameter
		* @param  documentation  Description of Parameter
		* @return                Description of the Returned Value
		*/
	static public SubLObject pf__set_documentation_execute(SubLObject object, SubLObject docType, SubLObject documentation) {
		object.setDocumentation(docType, documentation);
		return documentation;
	}

	private static final class pf__putf extends JavaPrimitive {
		/**  Constructor for the pf__putf object */
		pf__putf() {
			super("%putf", PACKAGE_SYS, true, "plist indicator new-value");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  plist      Description of Parameter
		 * @param  indicator  Description of Parameter
		 * @param  newValue   Description of Parameter
		 * @return            Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject plist, SubLObject indicator, SubLObject newValue) {
			return pf__putf_execute(plist, indicator, newValue);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  plist      Description of Parameter
		* @param  indicator  Description of Parameter
		* @param  newValue   Description of Parameter
		* @return            Description of the Returned Value
		*/
	static public SubLObject pf__putf_execute(SubLObject plist, SubLObject indicator, SubLObject newValue) {
		return putf(plist, indicator, newValue);
	}

	private static final class pf_function_plist extends JavaPrimitive {
		/**  Constructor for the pf_function_plist object */
		pf_function_plist() {
			super("function-plist", PACKAGE_SYS, true, "function");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_function_plist_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_function_plist_execute(SubLObject arg) {
		return checkFunction(arg).getPropertyList();
	}

	private static final class pf_make_keyword extends JavaPrimitive {
		/**  Constructor for the pf_make_keyword object */
		pf_make_keyword() {
			super("make-keyword", PACKAGE_SYS, true, "symbol");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_make_keyword_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_make_keyword_execute(SubLObject arg) {
		return PACKAGE_KEYWORD.intern(checkSymbol(arg).getSubLName());
	}

	private static final class pf_standard_object_p extends JavaPrimitive {
		/**  Constructor for the pf_standard_object_p object */
		pf_standard_object_p() {
			super("standard-object-p", PACKAGE_SYS, true, "object");
		}

		/**
		 *  Description of the Method
		 *
		 * @param  arg  Description of Parameter
		 * @return      Description of the Returned Value
		 */
		@Override
		public SubLObject execute(SubLObject arg) {
			return pf_standard_object_p_execute(arg);
		}
	}

	/**
		*  Description of the Method
		*
		* @param  arg  Description of Parameter
		* @return      Description of the Returned Value
		*/
	static public SubLObject pf_standard_object_p_execute(SubLObject arg) {
		return arg instanceof StandardObject ? T : NIL;
	}

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(Primitives.class);
	}
}

/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;



import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class complex_special_forms extends SubLSystemTrampolineFile {
	public static SubLObject _defstruct_construct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject c_structure_tag = NIL;
		SubLObject size = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list61);
		c_structure_tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list61);
		size = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list61);
		type_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list61);
		type = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list61);
			return NIL;
		}
		if (NIL != c_structure_tag)
			return list(_CLEAR_STRUCTURE, list(_NEW_STRUCTURE, c_structure_tag, size), size);

		return list(_CLEAR_SUB_STRUCTURE, list(_NEW_STRUCTURE, $dtp_structures_bag$, size), size, type_var);
	}

	public static SubLObject _defstruct_get_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject index = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		destructuring_bind_must_consp(current, datum, $list58);
		object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list58);
		index = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list58);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list58);
		slot = current.first();
		current = current.rest();
		if (NIL == current)
			return list(_STRUCTURE_SLOT, object, index);

		cdestructuring_bind_error(datum, $list58);
		return NIL;
	}

	public static SubLObject _defstruct_object_p(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject c_structure_tag = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list52);
		object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list52);
		c_structure_tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list52);
		type_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list52);
		type = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list52);
			return NIL;
		}
		if (NIL != c_structure_tag)
			return list(_STRUCTURE_TYPE, object, c_structure_tag);

		return list(CAND, list(_STRUCTURES_BAG_P, object), list(EQ, listS(_STRUCTURE_SLOT, object, $list57), type_var));
	}

	public static SubLObject _defstruct_set_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject index = NIL;
		SubLObject value = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		destructuring_bind_must_consp(current, datum, $list59);
		object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list59);
		index = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list59);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list59);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list59);
		slot = current.first();
		current = current.rest();
		if (NIL == current)
			return list(_SET_STRUCTURE_SLOT, object, index, value);

		cdestructuring_bind_error(datum, $list59);
		return NIL;
	}

	public static SubLObject accessor_package(SubLObject accessor) {
		return getter_package(accessor);
	}

	public static SubLObject build_regmethod_call(SubLObject type, SubLObject method_table, SubLObject method_function) {
		SubLObject dtp_var = dtp_var(type);
		return list(_REGISTER_METHOD, method_table, dtp_var, list(FUNCTION, method_function));
	}

	public static SubLObject build_regmethod_list(SubLObject type, SubLObject method_table, SubLObject method_function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject reglist = NIL;
		SubLObject alias_list = second(assoc(symbol_name(type), $polymorphic_type_hierarchy$.getDynamicValue(thread), symbol_function($sym14$STRING_), UNPROVIDED));
		if (NIL != alias_list) {
			SubLObject cdolist_list_var = alias_list;
			SubLObject curr = NIL;
			curr = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				reglist = cons(build_regmethod_call(curr, method_table, method_function), reglist);
				cdolist_list_var = cdolist_list_var.rest();
				curr = cdolist_list_var.first();
			}
		} else
			reglist = list(build_regmethod_call(type, method_table, method_function));

		return reglist;
	}

	public static SubLObject declare_complex_special_forms_file() {
		declareFunction(me, "intern_accessor", "INTERN-ACCESSOR", 1, 0, false);
		declareMacro(me, "defpolymorphic", "DEFPOLYMORPHIC");
		declareMacro(me, "define_method", "DEFINE-METHOD");
		declareFunction(me, "defpolymorphic_internal", "DEFPOLYMORPHIC-INTERNAL", 3, 0, false);
		declareFunction(me, "define_method_internal", "DEFINE-METHOD-INTERNAL", 3, 0, false);
		declareFunction(me, "build_regmethod_call", "BUILD-REGMETHOD-CALL", 3, 0, false);
		declareFunction(me, "build_regmethod_list", "BUILD-REGMETHOD-LIST", 3, 0, false);
		declareFunction(me, "method_table_var", "METHOD-TABLE-VAR", 1, 0, false);
		declareFunction(me, "method_function_var", "METHOD-FUNCTION-VAR", 2, 0, false);
		declareFunction(me, "dtp_var", "DTP-VAR", 1, 0, false);
		declareFunction(me, "full_formal_parameter_list", "FULL-FORMAL-PARAMETER-LIST", 1, 0, false);
		declareMacro(me, "defstruct", "DEFSTRUCT");
		declareFunction(me, "defstruct_analyze", "DEFSTRUCT-ANALYZE", 3, 0, false);
		declareFunction(me, "defstruct_conc_name", "DEFSTRUCT-CONC-NAME", 2, 0, false);
		declareFunction(me, "defstruct_predicate", "DEFSTRUCT-PREDICATE", 1, 0, false);
		declareFunction(me, "defstruct_constructor", "DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
		declareFunction(me, "defstruct_host_fn_name", "DEFSTRUCT-HOST-FN-NAME", 1, 0, false);
		declareFunction(me, "defstruct_type_var", "DEFSTRUCT-TYPE-VAR", 1, 0, false);
		declareFunction(me, "defstruct_slot_keywords", "DEFSTRUCT-SLOT-KEYWORDS", 1, 0, false);
		declareFunction(me, "defstruct_getters", "DEFSTRUCT-GETTERS", 2, 0, false);
		declareFunction(me, "defstruct_getter", "DEFSTRUCT-GETTER", 2, 0, false);
		declareFunction(me, "defstruct_setters", "DEFSTRUCT-SETTERS", 1, 0, false);
		declareFunction(me, "defstruct_setter", "DEFSTRUCT-SETTER", 1, 0, false);
		declareFunction(me, "getter_package", "GETTER-PACKAGE", 1, 0, false);
		declareFunction(me, "accessor_package", "ACCESSOR-PACKAGE", 1, 0, false);
		declareFunction(me, "setter_from_accessor", "SETTER-FROM-ACCESSOR", 1, 0, false);
		declareFunction(me, "defstruct_lisp_constructor", "DEFSTRUCT-LISP-CONSTRUCTOR", 1, 0, false);
		declareFunction(me, "defstruct_expand", "DEFSTRUCT-EXPAND", 1, 0, false);
		declareMacro(me, "_defstruct_object_p", "_DEFSTRUCT-OBJECT-P");
		declareMacro(me, "_defstruct_get_slot", "_DEFSTRUCT-GET-SLOT");
		declareMacro(me, "_defstruct_set_slot", "_DEFSTRUCT-SET-SLOT");
		declareMacro(me, "_defstruct_construct", "_DEFSTRUCT-CONSTRUCT");
		declareFunction(me, "defstruct_type_var_form", "DEFSTRUCT-TYPE-VAR-FORM", 3, 0, false);
		declareFunction(me, "defstruct_print_method", "DEFSTRUCT-PRINT-METHOD", 2, 0, false);
		declareFunction(me, "defstruct_print_forms", "DEFSTRUCT-PRINT-FORMS", 4, 0, false);
		declareFunction(me, "defstruct_register_form", "DEFSTRUCT-REGISTER-FORM", 4, 0, false);
		declareFunction(me, "defstruct_predicate_form", "DEFSTRUCT-PREDICATE-FORM", 4, 0, false);
		declareFunction(me, "defstruct_predicate_arglist", "DEFSTRUCT-PREDICATE-ARGLIST", 1, 0, false);
		declareFunction(me, "defstruct_predicate_variable", "DEFSTRUCT-PREDICATE-VARIABLE", 1, 0, false);
		declareFunction(me, "defstruct_first_function_variable", "DEFSTRUCT-FIRST-FUNCTION-VARIABLE", 2, 0, false);
		declareFunction(me, "defstruct_getter_forms", "DEFSTRUCT-GETTER-FORMS", 5, 0, false);
		declareFunction(me, "defstruct_getter_form", "DEFSTRUCT-GETTER-FORM", 5, 0, false);
		declareFunction(me, "defstruct_getter_arglist", "DEFSTRUCT-GETTER-ARGLIST", 1, 0, false);
		declareFunction(me, "defstruct_getter_variable", "DEFSTRUCT-GETTER-VARIABLE", 1, 0, false);
		declareFunction(me, "defstruct_setter_forms", "DEFSTRUCT-SETTER-FORMS", 5, 0, false);
		declareFunction(me, "defstruct_setter_form", "DEFSTRUCT-SETTER-FORM", 5, 0, false);
		declareFunction(me, "defstruct_setter_arglist", "DEFSTRUCT-SETTER-ARGLIST", 1, 0, false);
		declareFunction(me, "defstruct_def_csetf_forms", "DEFSTRUCT-DEF-CSETF-FORMS", 2, 0, false);
		declareFunction(me, "defstruct_constructor_form", "DEFSTRUCT-CONSTRUCTOR-FORM", 6, 0, false);
		declareFunction(me, "defstruct_constructor_arglist", "DEFSTRUCT-CONSTRUCTOR-ARGLIST", 1, 0, false);
		declareFunction(me, "defstruct_constructor_arglist_handler", "DEFSTRUCT-CONSTRUCTOR-ARGLIST-HANDLER", 4, 0, false);
		declareFunction(me, "defstruct_host_function", "DEFSTRUCT-HOST-FUNCTION", 5, 0, false);
		declareFunction(me, "defstruct_host_arglist", "DEFSTRUCT-HOST-ARGLIST", 0, 0, false);
		declareMacro(me, "with_call_profiling", "WITH-CALL-PROFILING");
		declareFunction(me, "possibly_note_function_entry", "POSSIBLY-NOTE-FUNCTION-ENTRY", 1, 0, false);
		declareFunction(me, "initialize_call_profiling_table", "INITIALIZE-CALL-PROFILING-TABLE", 0, 0, false);
		declareFunction(me, "finalize_call_profiling_table", "FINALIZE-CALL-PROFILING-TABLE", 1, 0, false);
		return NIL;
	}

	public static SubLObject define_method(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject lambda_list = NIL;
		destructuring_bind_must_consp(current, datum, $list0);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return define_method_internal(name, lambda_list, body);
	}

	public static SubLObject define_method_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject type = second(arglist.first());
		SubLObject plain_args = bq_cons(arglist.first().first(), append(arglist.rest(), NIL));
		SubLObject method_table_var = method_table_var(name);
		SubLObject method_function = method_function_var(name, type);
		SubLObject regmethod_list = build_regmethod_list(type, method_table_var, method_function);
		return listS(PROGN, listS(DEFINE, method_function, plain_args, append(body, NIL)), append(regmethod_list, NIL));
	}

	public static SubLObject defpolymorphic(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject lambda_list = NIL;
		destructuring_bind_must_consp(current, datum, $list0);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return defpolymorphic_internal(name, lambda_list, body);
	}

	public static SubLObject defpolymorphic_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject method_table_var = method_table_var(name);
		SubLObject method_function_var = make_symbol($str1$METHOD_FUNCTION);
		SubLObject doc_string = NIL;
		if (body.first().isString()) {
			doc_string = list(body.first());
			body = body.rest();
		}
		return list(PROGN, listS(DEFLEXICAL, method_table_var, $list4), listS(DEFINE, name, arglist, append(doc_string, list(listS(CLET, list(list(method_function_var, list(_METHOD, arglist.first(), method_table_var))), list(PWHEN, method_function_var, list(RET, listS(FUNCALL, method_function_var, append(full_formal_parameter_list(arglist), NIL)))), append(body, NIL))))));
	}

	public static SubLObject defstruct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list22);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject name = NIL;
		destructuring_bind_must_consp(current, datum, $list22);
		name = current.first();
		SubLObject options;
		current = options = current.rest();
		SubLObject slots;
		current = slots = temp;
		SubLObject analysis = defstruct_analyze(name, options, slots);
		return defstruct_expand(analysis);
	}

	public static SubLObject defstruct_analyze(SubLObject name, SubLObject options, SubLObject slots) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != symbolp(name) : "Types.symbolp " + name;
		SubLObject conc_name = second(assoc($CONC_NAME, options, UNPROVIDED, UNPROVIDED));
		SubLObject print_function = second(assoc($PRINT_FUNCTION, options, UNPROVIDED, UNPROVIDED));
		SubLObject c_structure_tag = second(assoc($C_STRUCTURE_TAG, options, UNPROVIDED, UNPROVIDED));
		SubLObject raw_make_visit_fnP = assoc($kw27$GENERATE_VISIT_FUNCTION_, options, UNPROVIDED, UNPROVIDED);
		SubLObject make_visit_fnP = (NIL == raw_make_visit_fnP) ? $default_generate_visit_functionP$.getDynamicValue(thread) : second(raw_make_visit_fnP);
		conc_name = defstruct_conc_name(name, conc_name);
		SubLObject predicate = defstruct_predicate(name);
		SubLObject constructor = defstruct_constructor(name);
		SubLObject type_var = defstruct_type_var(name);
		SubLObject slot_keywords = defstruct_slot_keywords(slots);
		SubLObject getters = defstruct_getters(conc_name, slots);
		SubLObject setters = defstruct_setters(getters);
		SubLObject host_fn_name = defstruct_host_fn_name(name);
		return listS($NAME, name, append(new SubLObject[] { NIL != conc_name ? list($CONC_NAME, conc_name) : NIL, NIL != print_function ? list($PRINT_FUNCTION, print_function) : NIL, NIL != c_structure_tag ? list($C_STRUCTURE_TAG, c_structure_tag) : NIL, NIL != make_visit_fnP ? list($kw27$GENERATE_VISIT_FUNCTION_, make_visit_fnP, $HOST_FN_NAME, host_fn_name) : NIL,
				list(new SubLObject[] { $PREDICATE, predicate, $CONSTRUCTOR, constructor, $TYPE_VAR, type_var, $SLOTS, slots, $SLOT_KEYWORDS, slot_keywords, $GETTERS, getters, $SETTERS, setters }) }));
	}

	public static SubLObject defstruct_conc_name(SubLObject name, SubLObject conc_name) {
		if (NIL != conc_name)
			return conc_name;

		return intern_accessor(cconcatenate(symbol_name(name), $str17$_));
	}

	public static SubLObject defstruct_constructor(SubLObject name) {
		return intern_accessor(cconcatenate($str38$MAKE_, symbol_name(name)));
	}

	public static SubLObject defstruct_constructor_arglist(SubLObject constructor) {
		return $list84;
	}

	public static SubLObject defstruct_constructor_arglist_handler(SubLObject arglist_var, SubLObject new_var, SubLObject slot_keywords, SubLObject setters) {
		SubLObject current_value = make_symbol($str85$CURRENT_VALUE);
		SubLObject current_arg = make_symbol($str86$CURRENT_ARG);
		SubLObject next = make_symbol($$$NEXT);
		SubLObject gencaseslots = NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		SubLObject slot_keyword;
		SubLObject setter;
		for (cdotimes_end_var = length(slot_keywords), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
			slot_keyword = nth(n, slot_keywords);
			setter = nth(n, setters);
			gencaseslots = cons(list(slot_keyword, list(setter, new_var, current_value)), gencaseslots);
		}
		gencaseslots = cons(list(OTHERWISE, list(ERROR, $str90$Invalid_slot__S_for_construction_, current_arg)), gencaseslots);
		return list(CDO, list(list(next, arglist_var, list(CDDR, next))), list(list(NULL, next)), list(CLET, list(list(current_arg, list(CAR, next)), list(current_value, list(CADR, next))), listS(PCASE, current_arg, append(nreverse(gencaseslots), NIL))));
	}

	public static SubLObject defstruct_constructor_form(SubLObject type, SubLObject constructor, SubLObject c_structure_tag, SubLObject type_var, SubLObject slot_keywords, SubLObject setters) {
		SubLObject arglist = defstruct_constructor_arglist(constructor);
		SubLObject arglist_var = second(arglist);
		SubLObject new_var = NEW;
		SubLObject size = length(slot_keywords);
		SubLObject arglist_handler = defstruct_constructor_arglist_handler(arglist_var, new_var, slot_keywords, setters);
		return list(DEFINE, constructor, arglist, list(CLET, list(list(new_var, list(_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, type_var, type))), arglist_handler, list(RET, new_var)));
	}

	public static SubLObject defstruct_def_csetf_forms(SubLObject getters, SubLObject setters) {
		SubLObject forms = NIL;
		SubLObject rest_getters = NIL;
		SubLObject rest_setters = NIL;
		SubLObject getter = NIL;
		SubLObject setter = NIL;
		rest_getters = getters;
		rest_setters = setters;
		getter = rest_getters.first();
		setter = rest_setters.first();
		while (NIL != rest_getters) {
			forms = cons(list(_DEF_CSETF, list(QUOTE, getter), list(QUOTE, setter)), forms);
			rest_getters = rest_getters.rest();
			rest_setters = rest_setters.rest();
			getter = rest_getters.first();
			setter = rest_setters.first();
		}
		return nreverse(forms);
	}

	public static SubLObject defstruct_expand(SubLObject analysis) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = analysis;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, analysis, $list44);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, analysis, $list44);
			if (NIL == member(current_$1, $list45, UNPROVIDED, UNPROVIDED))
				bad = T;

			if (current_$1 == $ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();

			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p))
			cdestructuring_bind_error(analysis, $list44);

		SubLObject name_tail = property_list_member($NAME, analysis);
		SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
		SubLObject conc_name_tail = property_list_member($CONC_NAME, analysis);
		SubLObject conc_name = (NIL != conc_name_tail) ? cadr(conc_name_tail) : NIL;
		SubLObject print_function_tail = property_list_member($PRINT_FUNCTION, analysis);
		SubLObject print_function = (NIL != print_function_tail) ? cadr(print_function_tail) : NIL;
		SubLObject c_structure_tag_tail = property_list_member($C_STRUCTURE_TAG, analysis);
		SubLObject c_structure_tag = (NIL != c_structure_tag_tail) ? cadr(c_structure_tag_tail) : NIL;
		SubLObject generate_visit_functionP_tail = property_list_member($kw27$GENERATE_VISIT_FUNCTION_, analysis);
		SubLObject generate_visit_functionP = (NIL != generate_visit_functionP_tail) ? cadr(generate_visit_functionP_tail) : NIL;
		SubLObject predicate_tail = property_list_member($PREDICATE, analysis);
		SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
		SubLObject constructor_tail = property_list_member($CONSTRUCTOR, analysis);
		SubLObject constructor = (NIL != constructor_tail) ? cadr(constructor_tail) : NIL;
		SubLObject host_fn_name_tail = property_list_member($HOST_FN_NAME, analysis);
		SubLObject host_fn_name = (NIL != host_fn_name_tail) ? cadr(host_fn_name_tail) : NIL;
		SubLObject type_var_tail = property_list_member($TYPE_VAR, analysis);
		SubLObject type_var = (NIL != type_var_tail) ? cadr(type_var_tail) : NIL;
		SubLObject slots_tail = property_list_member($SLOTS, analysis);
		SubLObject slots = (NIL != slots_tail) ? cadr(slots_tail) : NIL;
		SubLObject slot_keywords_tail = property_list_member($SLOT_KEYWORDS, analysis);
		SubLObject slot_keywords = (NIL != slot_keywords_tail) ? cadr(slot_keywords_tail) : NIL;
		SubLObject getters_tail = property_list_member($GETTERS, analysis);
		SubLObject getters = (NIL != getters_tail) ? cadr(getters_tail) : NIL;
		SubLObject setters_tail = property_list_member($SETTERS, analysis);
		SubLObject setters = (NIL != setters_tail) ? cadr(setters_tail) : NIL;
		if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))
			c_structure_tag = NIL;

		SubLObject type_var_form = defstruct_type_var_form(type_var, name, c_structure_tag);
		SubLObject print_method = defstruct_print_method(name, print_function);
		SubLObject print_forms = defstruct_print_forms(c_structure_tag, type_var, print_function, print_method);
		SubLObject register_form = defstruct_register_form(name, c_structure_tag, slots, print_method);
		SubLObject predicate_form = defstruct_predicate_form(name, predicate, c_structure_tag, type_var);
		SubLObject getter_forms = defstruct_getter_forms(name, c_structure_tag, predicate, slots, getters);
		SubLObject setter_forms = defstruct_setter_forms(name, c_structure_tag, predicate, slots, setters);
		SubLObject def_csetf_forms = defstruct_def_csetf_forms(getters, setters);
		SubLObject host_fn_form = (NIL != generate_visit_functionP) ? defstruct_host_function(name, host_fn_name, constructor, slot_keywords, getters) : NIL;
		SubLObject constructor_form = defstruct_constructor_form(name, constructor, c_structure_tag, type_var, slot_keywords, setters);
		return listS(PROGN, type_var_form, append(print_forms, NIL != register_form ? list(register_form) : NIL, listS(list(DECLAIM, list(OPTIMIZE_FUNCALL, predicate)), predicate_form, append(getter_forms, setter_forms, def_csetf_forms, list(constructor_form, list(IDENTITY, list(QUOTE, name)), NIL != generate_visit_functionP ? host_fn_form : $list51)))));
	}

	public static SubLObject defstruct_first_function_variable(SubLObject function, SubLObject v_default) {
		return v_default;
	}

	public static SubLObject defstruct_getter(SubLObject conc_name, SubLObject slot) {
		return intern_accessor(Strings.string_upcase(cconcatenate(symbol_name(conc_name), symbol_name(slot)), UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject defstruct_getter_arglist(SubLObject getter) {
		return list(defstruct_getter_variable(getter));
	}

	public static SubLObject defstruct_getter_form(SubLObject getter, SubLObject index, SubLObject predicate, SubLObject type, SubLObject slot) {
		SubLObject arglist = defstruct_getter_arglist(getter);
		SubLObject getter_var = arglist.first();
		return list(DEFINE, getter, arglist, list(CHECK_TYPE, getter_var, predicate), list(RET, list(_DEFSTRUCT_GET_SLOT, getter_var, index, type, slot)));
	}

	public static SubLObject defstruct_getter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate, SubLObject slots, SubLObject getters) {
		SubLObject forms = NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject getter;
		SubLObject index;
		for (cdotimes_end_var = length(getters), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
			slot = nth(i, slots);
			getter = nth(i, getters);
			index = (NIL != c_structure_tag) ? i : add(i, TWO_INTEGER);
			forms = cons(defstruct_getter_form(getter, index, predicate, type, slot), forms);
		}
		return nreverse(forms);
	}

	public static SubLObject defstruct_getter_variable(SubLObject getter) {
		return defstruct_first_function_variable(getter, OBJECT);
	}

	public static SubLObject defstruct_getters(SubLObject conc_name, SubLObject slots) {
		SubLObject getters = NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject getter = defstruct_getter(conc_name, slot);
			getters = cons(getter, getters);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return nreverse(getters);
	}

	public static SubLObject defstruct_host_arglist() {
		return $list104;
	}

	public static SubLObject defstruct_host_fn_name(SubLObject name) {
		return intern_accessor(cconcatenate($str39$VISIT_DEFSTRUCT_, symbol_name(name)));
	}

	public static SubLObject defstruct_host_function(SubLObject type_name, SubLObject host_fn, SubLObject constructor_fn, SubLObject slot_keywords, SubLObject getters) {
		SubLObject arglist = defstruct_host_arglist();
		SubLObject object_arg = arglist.first();
		SubLObject visitor_fn_arg = second(arglist);
		SubLObject size = length(slot_keywords);
		SubLObject statements = NIL;
		statements = cons(list(FUNCALL, visitor_fn_arg, object_arg, $BEGIN, list(QUOTE, constructor_fn), size), statements);
		SubLObject index;
		SubLObject slot_keyword;
		SubLObject slot_getter;
		for (index = NIL, index = ZERO_INTEGER; index.numL(size); index = add(index, ONE_INTEGER)) {
			slot_keyword = nth(index, slot_keywords);
			slot_getter = nth(index, getters);
			statements = cons(list(FUNCALL, visitor_fn_arg, object_arg, $SLOT, slot_keyword, list(slot_getter, object_arg)), statements);
		}
		statements = cons(list(FUNCALL, visitor_fn_arg, object_arg, $END, list(QUOTE, constructor_fn), size), statements);
		statements = nreverse(statements);
		return list(PROGN, list(DEFINE, host_fn, arglist, bq_cons(PROGN, append(statements, NIL)), list(RET, object_arg)), list(DEFINE_METHOD, VISIT_DEFSTRUCT_OBJECT, bq_cons(list(OBJ, type_name), $list103), list(RET, bq_cons(host_fn, $list104))));
	}

	public static SubLObject defstruct_lisp_constructor(SubLObject constructor) {
		return intern_accessor(cconcatenate(symbol_name(constructor), $str43$_1));
	}

	public static SubLObject defstruct_predicate(SubLObject name) {
		return intern_accessor(cconcatenate(symbol_name(name), $str37$_P));
	}

	public static SubLObject defstruct_predicate_arglist(SubLObject predicate) {
		return list(defstruct_predicate_variable(predicate));
	}

	public static SubLObject defstruct_predicate_form(SubLObject type, SubLObject predicate, SubLObject c_structure_tag, SubLObject type_var) {
		SubLObject arglist = defstruct_predicate_arglist(predicate);
		SubLObject predicate_var = arglist.first();
		return list(DEFINE, predicate, arglist, list(RET, list(_DEFSTRUCT_OBJECT_P, predicate_var, c_structure_tag, type_var, type)));
	}

	public static SubLObject defstruct_predicate_variable(SubLObject predicate) {
		return defstruct_first_function_variable(predicate, OBJECT);
	}

	public static SubLObject defstruct_print_forms(SubLObject c_structure_tag, SubLObject tag_var, SubLObject print_function, SubLObject print_method) {
		if (NIL == print_function)
			print_function = DEFAULT_STRUCT_PRINT_FUNCTION;

		return listS(list(DECLAIM, list(FACCESS, PRIVATE, print_method)), list(DEFINE, print_method, $list71, bq_cons(print_function, $list72)), append(NIL != c_structure_tag ? NIL : list(list(_REGISTER_METHOD, $print_object_method_table$, tag_var, list(FUNCTION, print_method))), NIL));
	}

	public static SubLObject defstruct_print_method(SubLObject name, SubLObject print_function) {
		return intern_accessor(cconcatenate(symbol_name(name), $str67$_PRINT_FUNCTION_TRAMPOLINE));
	}

	public static SubLObject defstruct_register_form(SubLObject name, SubLObject c_structure_tag, SubLObject slots, SubLObject print_method) {
		if (NIL != c_structure_tag)
			return list(_REGISTER_DEFSTRUCT, symbol_name(name), c_structure_tag, length(slots), list(QUOTE, print_method), list(QUOTE, slots));

		return NIL;
	}

	public static SubLObject defstruct_setter(SubLObject getter) {
		SubLObject getter_name = symbol_name(getter);
		SubLObject getter_package = getter_package(getter);
		SubLObject setter_name = cconcatenate($str40$_CSETF_, getter_name);
		SubLObject setter_package = getter_package;
		return intern(setter_name, setter_package);
	}

	public static SubLObject defstruct_setter_arglist(SubLObject setter) {
		return $list80;
	}

	public static SubLObject defstruct_setter_form(SubLObject setter, SubLObject index, SubLObject predicate, SubLObject type, SubLObject slot) {
		SubLObject arglist = defstruct_setter_arglist(setter);
		SubLObject object_var = arglist.first();
		SubLObject value_var = second(arglist);
		return list(DEFINE, setter, arglist, list(CHECK_TYPE, object_var, predicate), list(RET, list(_DEFSTRUCT_SET_SLOT, object_var, index, value_var, type, slot)));
	}

	public static SubLObject defstruct_setter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate, SubLObject slots, SubLObject setters) {
		SubLObject forms = NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject setter;
		SubLObject index;
		for (cdotimes_end_var = length(setters), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
			slot = nth(i, slots);
			setter = nth(i, setters);
			index = (NIL != c_structure_tag) ? i : add(i, TWO_INTEGER);
			forms = cons(defstruct_setter_form(setter, index, predicate, type, slot), forms);
		}
		return nreverse(forms);
	}

	public static SubLObject defstruct_setters(SubLObject getters) {
		SubLObject setters = NIL;
		SubLObject cdolist_list_var = getters;
		SubLObject getter = NIL;
		getter = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject setter = defstruct_setter(getter);
			setters = cons(setter, setters);
			cdolist_list_var = cdolist_list_var.rest();
			getter = cdolist_list_var.first();
		}
		return nreverse(setters);
	}

	public static SubLObject defstruct_slot_keywords(SubLObject slots) {
		SubLObject slot_keywords = NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject slot_keyword = make_keyword(symbol_name(slot));
			slot_keywords = cons(slot_keyword, slot_keywords);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return nreverse(slot_keywords);
	}

	public static SubLObject defstruct_type_var(SubLObject name) {
		return intern_accessor(cconcatenate($str19$_DTP_, new SubLObject[] { symbol_name(name), $str15$_ }));
	}

	public static SubLObject defstruct_type_var_form(SubLObject type_var, SubLObject name, SubLObject c_structure_tag) {
		return list(DEFCONSTANT, type_var, NIL != c_structure_tag ? c_structure_tag : list(QUOTE, name));
	}

	public static SubLObject dtp_var(SubLObject name) {
		SubLObject symbol = intern_accessor(cconcatenate($str19$_DTP_, new SubLObject[] { symbol_name(name), $str15$_ }));
		return symbol;
	}

	public static SubLObject finalize_call_profiling_table(SubLObject table) {
		SubLObject pairs = NIL;
		SubLObject function = NIL;
		SubLObject count = NIL;
		Iterator cdohash_iterator = getEntrySetIterator(table);
		try {
			while (iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				function = getEntryKey(cdohash_entry);
				count = getEntryValue(cdohash_entry);
				pairs = cons(cons(function, count), pairs);
			}
		} finally {
			releaseEntrySetIterator(cdohash_iterator);
		}
		pairs = Sort.sort(pairs, symbol_function($sym111$_), symbol_function(CDR));
		return pairs;
	}

	public static SubLObject full_formal_parameter_list(SubLObject arglist) {
		SubLObject answer = NIL;
		SubLObject cdolist_list_var = arglist;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (arg.isCons())
				answer = cons(arg.first(), answer);
			else if (arg != $sym20$_OPTIONAL)
				if (arg != $sym21$_REST)
					answer = cons(arg, answer);

			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return nreverse(answer);
	}

	public static SubLObject getter_package(SubLObject getter) {
		SubLObject v_package = symbol_package(getter);
		if (!package_name(v_package).equal($$$CYC))
			v_package = find_package($$$SUBLISP);

		return v_package;
	}

	public static SubLObject init_complex_special_forms_file() {
		defparameter("*POLYMORPHIC-TYPE-HIERARCHY*", $list11);
		defparameter("*DEFAULT-GENERATE-VISIT-FUNCTION?*", T);
		defvar("*CALL-PROFILING-ENABLED?*", NIL);
		defvar("*CALL-PROFILING-TABLE*", NIL);
		return NIL;
	}

	public static SubLObject initialize_call_profiling_table() {
		return make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED);
	}

	public static SubLObject intern_accessor(SubLObject string) {
		return intern(string, UNPROVIDED);
	}

	public static SubLObject method_function_var(SubLObject name, SubLObject type) {
		return intern_accessor(cconcatenate(symbol_name(name), new SubLObject[] { $str17$_, symbol_name(type), $str18$_METHOD }));
	}

	public static SubLObject method_table_var(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject symbol = NIL;
		SubLObject _prev_bind_0 = $package$.currentBinding(thread);
		try {
			$package$.bind(accessor_package(name), thread);
			symbol = intern_accessor(cconcatenate($str15$_, new SubLObject[] { symbol_name(name), $str16$_METHOD_TABLE_ }));
		} finally {
			$package$.rebind(_prev_bind_0, thread);
		}
		return symbol;
	}

	public static SubLObject possibly_note_function_entry(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != $call_profiling_enabledP$.getDynamicValue(thread)) && (NIL != $call_profiling_table$.getDynamicValue(thread)))
			sethash(name, $call_profiling_table$.getDynamicValue(thread), add(gethash_without_values(name, $call_profiling_table$.getDynamicValue(thread), ZERO_INTEGER), ONE_INTEGER));

		return NIL;
	}

	public static SubLObject setter_from_accessor(SubLObject accessor) {
		return defstruct_setter(accessor);
	}

	public static SubLObject setup_complex_special_forms_file() {
		return NIL;
	}

	public static SubLObject with_call_profiling(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject place = NIL;
		destructuring_bind_must_consp(current, datum, $list105);
		place = current.first();
		SubLObject body;
		current = body = current.rest();
		return list(CLET, $list106, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETF, place, $list109)));
	}

	public static final SubLFile me = new complex_special_forms();

	public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms";

	// defparameter
	public static final SubLSymbol $polymorphic_type_hierarchy$ = makeSymbol("*POLYMORPHIC-TYPE-HIERARCHY*");

	// defparameter
	public static final SubLSymbol $default_generate_visit_functionP$ = makeSymbol("*DEFAULT-GENERATE-VISIT-FUNCTION?*");

	// defvar
	public static final SubLSymbol $call_profiling_enabledP$ = makeSymbol("*CALL-PROFILING-ENABLED?*");

	// defvar
	public static final SubLSymbol $call_profiling_table$ = makeSymbol("*CALL-PROFILING-TABLE*");

	// Internal Constants
	public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str1$METHOD_FUNCTION = makeString("METHOD-FUNCTION");

	public static final SubLList $list4 = list(list(makeSymbol("MAKE-VECTOR"), makeInteger(256), NIL));

	public static final SubLSymbol _METHOD = makeSymbol("_METHOD");

	private static final SubLList $list11 = list(list(makeString("INTEGER"), list(makeSymbol("FIXNUM"), makeSymbol("BIGNUM"))), list(makeString("NUMBER"), list(makeSymbol("FIXNUM"), makeSymbol("BIGNUM"), makeSymbol("FLOAT"))), list(makeString("SEQUENCE"), list(makeSymbol("CONS"), makeSymbol("VECTOR"), makeSymbol("STRING"))));

	private static final SubLSymbol _REGISTER_METHOD = makeSymbol("_REGISTER-METHOD");

	private static final SubLSymbol $sym14$STRING_ = makeSymbol("STRING=");

	private static final SubLString $str15$_ = makeString("*");

	private static final SubLString $str16$_METHOD_TABLE_ = makeString("-METHOD-TABLE*");

	public static final SubLString $str17$_ = makeString("-");

	private static final SubLString $str18$_METHOD = makeString("-METHOD");

	private static final SubLString $str19$_DTP_ = makeString("*DTP-");

	private static final SubLSymbol $sym20$_OPTIONAL = makeSymbol("&OPTIONAL");

	private static final SubLSymbol $sym21$_REST = makeSymbol("&REST");

	private static final SubLList $list22 = list(list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("SLOTS"));

	private static final SubLSymbol $C_STRUCTURE_TAG = makeKeyword("C-STRUCTURE-TAG");

	private static final SubLSymbol $kw27$GENERATE_VISIT_FUNCTION_ = makeKeyword("GENERATE-VISIT-FUNCTION?");

	private static final SubLSymbol $HOST_FN_NAME = makeKeyword("HOST-FN-NAME");

	private static final SubLSymbol $TYPE_VAR = makeKeyword("TYPE-VAR");

	private static final SubLString $str37$_P = makeString("-P");

	private static final SubLString $str38$MAKE_ = makeString("MAKE-");

	private static final SubLString $str39$VISIT_DEFSTRUCT_ = makeString("VISIT-DEFSTRUCT-");

	private static final SubLString $str40$_CSETF_ = makeString("_CSETF-");

	private static final SubLString $$$CYC = makeString("CYC");

	private static final SubLString $$$SUBLISP = makeString("SUBLISP");

	private static final SubLString $str43$_1 = makeString("-1");

	private static final SubLList $list44 = list(
			new SubLObject[] { makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("CONC-NAME"), makeSymbol("PRINT-FUNCTION"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("GENERATE-VISIT-FUNCTION?"), makeSymbol("PREDICATE"), makeSymbol("CONSTRUCTOR"), makeSymbol("HOST-FN-NAME"), makeSymbol("TYPE-VAR"), makeSymbol("SLOTS"), makeSymbol("SLOT-KEYWORDS"), makeSymbol("GETTERS"), makeSymbol("SETTERS") });

	private static final SubLList $list45 = list(
			new SubLObject[] { makeKeyword("NAME"), makeKeyword("CONC-NAME"), makeKeyword("PRINT-FUNCTION"), makeKeyword("C-STRUCTURE-TAG"), makeKeyword("GENERATE-VISIT-FUNCTION?"), makeKeyword("PREDICATE"), makeKeyword("CONSTRUCTOR"), makeKeyword("HOST-FN-NAME"), makeKeyword("TYPE-VAR"), makeKeyword("SLOTS"), makeKeyword("SLOT-KEYWORDS"), makeKeyword("GETTERS"), makeKeyword("SETTERS") });

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	public static final SubLList $list51 = list(makeSymbol("PROGN"));

	public static final SubLList $list52 = list(makeSymbol("OBJECT"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	public static final SubLSymbol _STRUCTURE_TYPE = makeSymbol("_STRUCTURE-TYPE");

	public static final SubLSymbol _STRUCTURES_BAG_P = makeSymbol("_STRUCTURES-BAG-P");

	public static final SubLSymbol _STRUCTURE_SLOT = makeSymbol("_STRUCTURE-SLOT");

	public static final SubLList $list57 = list(ONE_INTEGER);

	public static final SubLList $list58 = list(makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	public static final SubLList $list59 = list(makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("VALUE"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	public static final SubLSymbol _SET_STRUCTURE_SLOT = makeSymbol("_SET-STRUCTURE-SLOT");

	public static final SubLList $list61 = list(makeSymbol("C-STRUCTURE-TAG"), makeSymbol("SIZE"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	public static final SubLSymbol _CLEAR_STRUCTURE = makeSymbol("_CLEAR-STRUCTURE");

	public static final SubLSymbol _NEW_STRUCTURE = makeSymbol("_NEW-STRUCTURE");

	public static final SubLSymbol _CLEAR_SUB_STRUCTURE = makeSymbol("_CLEAR-SUB-STRUCTURE");

	public static final SubLSymbol $dtp_structures_bag$ = makeSymbol("*DTP-STRUCTURES-BAG*");

	public static final SubLString $str67$_PRINT_FUNCTION_TRAMPOLINE = makeString("-PRINT-FUNCTION-TRAMPOLINE");

	public static final SubLList $list71 = list(makeSymbol("OBJECT"), makeSymbol("STREAM"));

	public static final SubLList $list72 = list(makeSymbol("OBJECT"), makeSymbol("STREAM"), ZERO_INTEGER);

	public static final SubLSymbol $print_object_method_table$ = makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");

	public static final SubLSymbol _REGISTER_DEFSTRUCT = makeSymbol("_REGISTER-DEFSTRUCT");

	public static final SubLSymbol _DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P");

	public static final SubLSymbol _DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT");

	public static final SubLSymbol _DEFSTRUCT_SET_SLOT = makeSymbol("_DEFSTRUCT-SET-SLOT");

	public static final SubLList $list80 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));

	public static final SubLSymbol _DEF_CSETF = makeSymbol("_DEF-CSETF");

	public static final SubLSymbol _DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT");

	public static final SubLList $list84 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));

	public static final SubLString $str85$CURRENT_VALUE = makeString("CURRENT-VALUE");

	public static final SubLString $str86$CURRENT_ARG = makeString("CURRENT-ARG");

	public static final SubLString $$$NEXT = makeString("NEXT");

	public static final SubLString $str90$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	public static final SubLSymbol DEFINE_METHOD = makeSymbol("DEFINE-METHOD");

	public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT = makeSymbol("VISIT-DEFSTRUCT-OBJECT");

	public static final SubLList $list103 = list(makeSymbol("VISITOR-FN"));

	public static final SubLList $list104 = list(makeSymbol("OBJ"), makeSymbol("VISITOR-FN"));

	public static final SubLList $list105 = list(makeSymbol("PLACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list106 = list(list(makeSymbol("*CALL-PROFILING-TABLE*"), list(makeSymbol("INITIALIZE-CALL-PROFILING-TABLE"))), list(makeSymbol("*CALL-PROFILING-ENABLED?*"), T));

	public static final SubLList $list109 = list(list(makeSymbol("FINALIZE-CALL-PROFILING-TABLE"), makeSymbol("*CALL-PROFILING-TABLE*")));

	public static final SubLSymbol $sym111$_ = makeSymbol(">");

	static {

	}

	@Override
	public void declareFunctions() {
		declare_complex_special_forms_file();
	}

	@Override
	public void initializeVariables() {
		init_complex_special_forms_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_complex_special_forms_file();
	}
}

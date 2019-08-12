//
// For LarKC
//
package org.logicmoo.translate.spoon;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static org.armedbear.lisp.Lisp.NIL;
import static org.armedbear.lisp.Lisp.T;
import static org.armedbear.lisp.Lisp.UNPROVIDED;

import java.util.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import com.cyc.tool.subl.util.SubLTranslatedFile.*;

public class spoon_test extends SubLTrampolineFile {
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18321L)
	public static SubLObject _defstruct_construct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject c_structure_tag = NIL;
		SubLObject size = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list61);
		c_structure_tag = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list61);
		size = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list61);
		type_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list61);
		type = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(datum, spoon_test.$list61);
			return NIL;
		}
		if (NIL != c_structure_tag)
			return ConsesLow.list(spoon_test.$sym62$_CLEAR_STRUCTURE,
					ConsesLow.list(spoon_test.$sym63$_NEW_STRUCTURE, c_structure_tag, size), size);
		return ConsesLow.list(spoon_test.$sym64$_CLEAR_SUB_STRUCTURE,
				ConsesLow.list(spoon_test.$sym63$_NEW_STRUCTURE, spoon_test.$sym65$_DTP_STRUCTURES_BAG_, size), size,
				type_var);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18010L)
	public static SubLObject _defstruct_get_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject index = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list58);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list58);
		index = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list58);
		type = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list58);
		slot = current.first();
		current = current.rest();
		if (NIL == current)
			return ConsesLow.list(spoon_test.$sym56$_STRUCTURE_SLOT, object, index);
		cdestructuring_bind.cdestructuring_bind_error(datum, spoon_test.$list58);
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17700L)
	public static SubLObject _defstruct_object_p(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject c_structure_tag = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list52);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list52);
		c_structure_tag = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list52);
		type_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list52);
		type = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(datum, spoon_test.$list52);
			return NIL;
		}
		if (NIL != c_structure_tag)
			return ConsesLow.list(spoon_test.$sym53$_STRUCTURE_TYPE, object, c_structure_tag);
		return ConsesLow.list(spoon_test.$sym54$CAND, ConsesLow.list(spoon_test.$sym55$_STRUCTURES_BAG_P, object),
				ConsesLow.list(EQ, ConsesLow.listS(spoon_test.$sym56$_STRUCTURE_SLOT, object, spoon_test.$list57),
						type_var));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18157L)
	public static SubLObject _defstruct_set_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = NIL;
		SubLObject index = NIL;
		SubLObject value = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list59);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list59);
		index = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list59);
		value = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list59);
		type = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list59);
		slot = current.first();
		current = current.rest();
		if (NIL == current)
			return ConsesLow.list(spoon_test.$sym60$_SET_STRUCTURE_SLOT, object, index, value);
		cdestructuring_bind.cdestructuring_bind_error(datum, spoon_test.$list59);
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13226L)
	public static SubLObject accessor_package(SubLObject accessor) {
		return getter_package(accessor);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6513L)
	public static SubLObject build_regmethod_call(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		SubLObject dtp_var = dtp_var(type);
		return ConsesLow.list(spoon_test.$sym12$_REGISTER_METHOD, method_table, dtp_var,
				ConsesLow.list(spoon_test.$sym13$FUNCTION, method_function));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6767L)
	public static SubLObject build_regmethod_list(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject reglist = NIL;
		SubLObject alias_list = conses_high.second(conses_high.assoc(Symbols.symbol_name(type),
				spoon_test.$polymorphic_type_hierarchy$.getDynamicValue(thread),
				Symbols.symbol_function(spoon_test.$sym14$STRING_), UNPROVIDED));
		if (NIL != alias_list) {
			SubLObject cdolist_list_var = alias_list;
			SubLObject curr = NIL;
			curr = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				reglist = ConsesLow.cons(build_regmethod_call(curr, method_table, method_function), reglist);
				cdolist_list_var = cdolist_list_var.rest();
				curr = cdolist_list_var.first();
			}
		} else
			reglist = ConsesLow.list(build_regmethod_call(type, method_table, method_function));
		return reglist;
	}

	public static SubLObject declare_complex_special_forms_file() {
		SubLFiles.declareFunction(me, "intern_accessor", "INTERN-ACCESSOR", 1, 0, false);
		SubLFiles.declareMacro(me, "defpolymorphic", "DEFPOLYMORPHIC");
		SubLFiles.declareMacro(me, "define_method", "DEFINE-METHOD");
		SubLFiles.declareFunction(me, "defpolymorphic_internal", "DEFPOLYMORPHIC-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction(me, "define_method_internal", "DEFINE-METHOD-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction(me, "build_regmethod_call", "BUILD-REGMETHOD-CALL", 3, 0, false);
		SubLFiles.declareFunction(me, "build_regmethod_list", "BUILD-REGMETHOD-LIST", 3, 0, false);
		SubLFiles.declareFunction(me, "method_table_var", "METHOD-TABLE-VAR", 1, 0, false);
		SubLFiles.declareFunction(me, "method_function_var", "METHOD-FUNCTION-VAR", 2, 0, false);
		SubLFiles.declareFunction(me, "dtp_var", "DTP-VAR", 1, 0, false);
		SubLFiles.declareFunction(me, "full_formal_parameter_list", "FULL-FORMAL-PARAMETER-LIST", 1, 0, false);
		SubLFiles.declareMacro(me, "defstruct", "DEFSTRUCT");
		SubLFiles.declareFunction(me, "defstruct_analyze", "DEFSTRUCT-ANALYZE", 3, 0, false);
		SubLFiles.declareFunction(me, "defstruct_conc_name", "DEFSTRUCT-CONC-NAME", 2, 0, false);
		SubLFiles.declareFunction(me, "defstruct_predicate", "DEFSTRUCT-PREDICATE", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_constructor", "DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_host_fn_name", "DEFSTRUCT-HOST-FN-NAME", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_type_var", "DEFSTRUCT-TYPE-VAR", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_slot_keywords", "DEFSTRUCT-SLOT-KEYWORDS", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_getters", "DEFSTRUCT-GETTERS", 2, 0, false);
		SubLFiles.declareFunction(me, "defstruct_getter", "DEFSTRUCT-GETTER", 2, 0, false);
		SubLFiles.declareFunction(me, "defstruct_setters", "DEFSTRUCT-SETTERS", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_setter", "DEFSTRUCT-SETTER", 1, 0, false);
		SubLFiles.declareFunction(me, "getter_package", "GETTER-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(me, "accessor_package", "ACCESSOR-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(me, "setter_from_accessor", "SETTER-FROM-ACCESSOR", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_lisp_constructor", "DEFSTRUCT-LISP-CONSTRUCTOR", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_expand", "DEFSTRUCT-EXPAND", 1, 0, false);
		SubLFiles.declareMacro(me, "_defstruct_object_p", "_DEFSTRUCT-OBJECT-P");
		SubLFiles.declareMacro(me, "_defstruct_get_slot", "_DEFSTRUCT-GET-SLOT");
		SubLFiles.declareMacro(me, "_defstruct_set_slot", "_DEFSTRUCT-SET-SLOT");
		SubLFiles.declareMacro(me, "_defstruct_construct", "_DEFSTRUCT-CONSTRUCT");
		SubLFiles.declareFunction(me, "defstruct_type_var_form", "DEFSTRUCT-TYPE-VAR-FORM", 3, 0, false);
		SubLFiles.declareFunction(me, "defstruct_print_method", "DEFSTRUCT-PRINT-METHOD", 2, 0, false);
		SubLFiles.declareFunction(me, "defstruct_print_forms", "DEFSTRUCT-PRINT-FORMS", 4, 0, false);
		SubLFiles.declareFunction(me, "defstruct_register_form", "DEFSTRUCT-REGISTER-FORM", 4, 0, false);
		SubLFiles.declareFunction(me, "defstruct_predicate_form", "DEFSTRUCT-PREDICATE-FORM", 4, 0, false);
		SubLFiles.declareFunction(me, "defstruct_predicate_arglist", "DEFSTRUCT-PREDICATE-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_predicate_variable", "DEFSTRUCT-PREDICATE-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_first_function_variable", "DEFSTRUCT-FIRST-FUNCTION-VARIABLE", 2, 0,
				false);
		SubLFiles.declareFunction(me, "defstruct_getter_forms", "DEFSTRUCT-GETTER-FORMS", 5, 0, false);
		SubLFiles.declareFunction(me, "defstruct_getter_form", "DEFSTRUCT-GETTER-FORM", 5, 0, false);
		SubLFiles.declareFunction(me, "defstruct_getter_arglist", "DEFSTRUCT-GETTER-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_getter_variable", "DEFSTRUCT-GETTER-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_setter_forms", "DEFSTRUCT-SETTER-FORMS", 5, 0, false);
		SubLFiles.declareFunction(me, "defstruct_setter_form", "DEFSTRUCT-SETTER-FORM", 5, 0, false);
		SubLFiles.declareFunction(me, "defstruct_setter_arglist", "DEFSTRUCT-SETTER-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_def_csetf_forms", "DEFSTRUCT-DEF-CSETF-FORMS", 2, 0, false);
		SubLFiles.declareFunction(me, "defstruct_constructor_form", "DEFSTRUCT-CONSTRUCTOR-FORM", 6, 0, false);
		SubLFiles.declareFunction(me, "defstruct_constructor_arglist", "DEFSTRUCT-CONSTRUCTOR-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(me, "defstruct_constructor_arglist_handler", "DEFSTRUCT-CONSTRUCTOR-ARGLIST-HANDLER",
				4, 0, false);
		SubLFiles.declareFunction(me, "defstruct_host_function", "DEFSTRUCT-HOST-FUNCTION", 5, 0, false);
		SubLFiles.declareFunction(me, "defstruct_host_arglist", "DEFSTRUCT-HOST-ARGLIST", 0, 0, false);
		SubLFiles.declareMacro(me, "with_call_profiling", "WITH-CALL-PROFILING");
		SubLFiles.declareFunction(me, "possibly_note_function_entry", "POSSIBLY-NOTE-FUNCTION-ENTRY", 1, 0, false);
		SubLFiles.declareFunction(me, "initialize_call_profiling_table", "INITIALIZE-CALL-PROFILING-TABLE", 0, 0,
				false);
		SubLFiles.declareFunction(me, "finalize_call_profiling_table", "FINALIZE-CALL-PROFILING-TABLE", 1, 0, false);
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 2882L)
	public static SubLObject define_method(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject lambda_list = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list0);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return define_method_internal(name, lambda_list, body);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 5718L)
	public static SubLObject define_method_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject type = conses_high.second(arglist.first());
		SubLObject plain_args = reader.bq_cons(arglist.first().first(), ConsesLow.append(arglist.rest(), NIL));
		SubLObject method_table_var = method_table_var(name);
		SubLObject method_function = method_function_var(name, type);
		SubLObject regmethod_list = build_regmethod_list(type, method_table_var, method_function);
		return ConsesLow.listS(spoon_test.$sym2$PROGN,
				ConsesLow.listS(spoon_test.$sym5$DEFINE, method_function, plain_args, ConsesLow.append(body, NIL)),
				ConsesLow.append(regmethod_list, NIL));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 1228L)
	public static SubLObject defpolymorphic(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject lambda_list = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list0);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return defpolymorphic_internal(name, lambda_list, body);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 4930L)
	public static SubLObject defpolymorphic_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject method_table_var = method_table_var(name);
		SubLObject method_function_var = Symbols.make_symbol(spoon_test.$str1$METHOD_FUNCTION);
		SubLObject doc_string = NIL;
		if (body.first().isString()) {
			doc_string = ConsesLow.list(body.first());
			body = body.rest();
		}
		return ConsesLow.list(spoon_test.$sym2$PROGN,
				ConsesLow.listS(spoon_test.$sym3$DEFLEXICAL, method_table_var, spoon_test.$list4),
				ConsesLow.listS(spoon_test.$sym5$DEFINE, name, arglist,
						ConsesLow.append(doc_string, ConsesLow.list(ConsesLow.listS(spoon_test.$sym6$CLET,
								ConsesLow.list(ConsesLow.list(method_function_var,
										ConsesLow.list(spoon_test.$sym7$_METHOD, arglist.first(), method_table_var))),
								ConsesLow.list(spoon_test.$sym8$PWHEN, method_function_var,
										ConsesLow.list(spoon_test.$sym9$RET,
												ConsesLow.listS(spoon_test.$sym10$FUNCALL, method_function_var,
														ConsesLow.append(full_formal_parameter_list(arglist), NIL)))),
								ConsesLow.append(body, NIL))))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 8214L)
	public static SubLObject defstruct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list22);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject name = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list22);
		name = current.first();
		SubLObject options;
		current = options = current.rest();
		SubLObject slots;
		current = slots = temp;
		SubLObject analysis = defstruct_analyze(name, options, slots);
		return defstruct_expand(analysis);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 9867L)
	public static SubLObject defstruct_analyze(SubLObject name, SubLObject options, SubLObject slots) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != Types.symbolp(name) : name;
		SubLObject conc_name = conses_high
				.second(conses_high.assoc(spoon_test.$kw24$CONC_NAME, options, UNPROVIDED, UNPROVIDED));
		SubLObject print_function = conses_high
				.second(conses_high.assoc(spoon_test.$kw25$PRINT_FUNCTION, options, UNPROVIDED, UNPROVIDED));
		SubLObject c_structure_tag = conses_high
				.second(conses_high.assoc(spoon_test.$kw26$C_STRUCTURE_TAG, options, UNPROVIDED, UNPROVIDED));
		SubLObject raw_make_visit_fnP = conses_high.assoc(spoon_test.$kw27$GENERATE_VISIT_FUNCTION_, options,
				UNPROVIDED, UNPROVIDED);
		SubLObject make_visit_fnP = NIL == raw_make_visit_fnP
				? spoon_test.$default_generate_visit_functionP$.getDynamicValue(thread)
				: conses_high.second(raw_make_visit_fnP);
		conc_name = defstruct_conc_name(name, conc_name);
		SubLObject predicate = defstruct_predicate(name);
		SubLObject constructor = defstruct_constructor(name);
		SubLObject type_var = defstruct_type_var(name);
		SubLObject slot_keywords = defstruct_slot_keywords(slots);
		SubLObject getters = defstruct_getters(conc_name, slots);
		SubLObject setters = defstruct_setters(getters);
		SubLObject host_fn_name = defstruct_host_fn_name(name);
		return ConsesLow.listS(spoon_test.$kw28$NAME, name, ConsesLow.append(new SubLObject[]{
				NIL != conc_name ? ConsesLow.list(spoon_test.$kw24$CONC_NAME, conc_name) : NIL,
				NIL != print_function ? ConsesLow.list(spoon_test.$kw25$PRINT_FUNCTION, print_function) : NIL,
				NIL != c_structure_tag ? ConsesLow.list(spoon_test.$kw26$C_STRUCTURE_TAG, c_structure_tag) : NIL,
				NIL != make_visit_fnP
						? ConsesLow.list(spoon_test.$kw27$GENERATE_VISIT_FUNCTION_, make_visit_fnP,
								spoon_test.$kw29$HOST_FN_NAME, host_fn_name)
						: NIL,
				ConsesLow.list(new SubLObject[]{spoon_test.$kw30$PREDICATE, predicate, spoon_test.$kw31$CONSTRUCTOR,
						constructor, spoon_test.$kw32$TYPE_VAR, type_var, spoon_test.$kw33$SLOTS, slots,
						spoon_test.$kw34$SLOT_KEYWORDS, slot_keywords, spoon_test.$kw35$GETTERS, getters,
						spoon_test.$kw36$SETTERS, setters})}));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11393L)
	public static SubLObject defstruct_conc_name(SubLObject name, SubLObject conc_name) {
		if (NIL != conc_name)
			return conc_name;
		return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), spoon_test.$str17$_));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11642L)
	public static SubLObject defstruct_constructor(SubLObject name) {
		return intern_accessor(Sequences.cconcatenate(spoon_test.$str38$MAKE_, Symbols.symbol_name(name)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23564L)
	public static SubLObject defstruct_constructor_arglist(SubLObject constructor) {
		return spoon_test.$list84;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23670L)
	public static SubLObject defstruct_constructor_arglist_handler(SubLObject arglist_var, SubLObject new_var,
			SubLObject slot_keywords, SubLObject setters) {
		SubLObject current_value = Symbols.make_symbol(spoon_test.$str85$CURRENT_VALUE);
		SubLObject current_arg = Symbols.make_symbol(spoon_test.$str86$CURRENT_ARG);
		SubLObject next = Symbols.make_symbol(spoon_test.$str87$NEXT);
		SubLObject gencaseslots = NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		SubLObject slot_keyword;
		SubLObject setter;
		for (cdotimes_end_var = Sequences.length(slot_keywords), n = NIL, n = ZERO_INTEGER; n
				.numL(cdotimes_end_var); n = Numbers.add(n, ONE_INTEGER)) {
			slot_keyword = ConsesLow.nth(n, slot_keywords);
			setter = ConsesLow.nth(n, setters);
			gencaseslots = ConsesLow.cons(ConsesLow.list(slot_keyword, ConsesLow.list(setter, new_var, current_value)),
					gencaseslots);
		}
		gencaseslots = ConsesLow.cons(
				ConsesLow
						.list(spoon_test.$sym88$OTHERWISE,
								ConsesLow.list(spoon_test.$sym89$ERROR,
										spoon_test.$str90$Invalid_slot__S_for_construction_, current_arg)),
				gencaseslots);
		return ConsesLow.list(spoon_test.$sym91$CDO,
				ConsesLow.list(ConsesLow.list(next, arglist_var, ConsesLow.list(spoon_test.$sym92$CDDR, next))),
				ConsesLow.list(ConsesLow.list(spoon_test.$sym93$NULL, next)),
				ConsesLow.list(spoon_test.$sym6$CLET,
						ConsesLow.list(ConsesLow.list(current_arg, ConsesLow.list(spoon_test.$sym94$CAR, next)),
								ConsesLow.list(current_value, ConsesLow.list(spoon_test.$sym95$CADR, next))),
						ConsesLow.listS(spoon_test.$sym96$PCASE, current_arg,
								ConsesLow.append(Sequences.nreverse(gencaseslots), NIL))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22933L)
	public static SubLObject defstruct_constructor_form(SubLObject type, SubLObject constructor,
			SubLObject c_structure_tag, SubLObject type_var, SubLObject slot_keywords, SubLObject setters) {
		SubLObject arglist = defstruct_constructor_arglist(constructor);
		SubLObject arglist_var = conses_high.second(arglist);
		SubLObject new_var = spoon_test.$sym82$NEW;
		SubLObject size = Sequences.length(slot_keywords);
		SubLObject arglist_handler = defstruct_constructor_arglist_handler(arglist_var, new_var, slot_keywords,
				setters);
		return ConsesLow.list(spoon_test.$sym5$DEFINE, constructor, arglist, ConsesLow.list(spoon_test.$sym6$CLET,
				ConsesLow.list(ConsesLow.list(new_var,
						ConsesLow.list(spoon_test.$sym83$_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, type_var, type))),
				arglist_handler, ConsesLow.list(spoon_test.$sym9$RET, new_var)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22547L)
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
			forms = ConsesLow.cons(ConsesLow.list(spoon_test.$sym81$_DEF_CSETF,
					ConsesLow.list(spoon_test.$sym50$QUOTE, getter), ConsesLow.list(spoon_test.$sym50$QUOTE, setter)),
					forms);
			rest_getters = rest_getters.rest();
			rest_setters = rest_setters.rest();
			getter = rest_getters.first();
			setter = rest_setters.first();
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 15527L)
	public static SubLObject defstruct_expand(SubLObject analysis) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = analysis;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, analysis, spoon_test.$list44);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, analysis, spoon_test.$list44);
			if (NIL == conses_high.member(current_$1, spoon_test.$list45, UNPROVIDED, UNPROVIDED))
				bad = T;
			if (current_$1 == spoon_test.$kw46$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (NIL != bad && NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(analysis, spoon_test.$list44);
		SubLObject name_tail = cdestructuring_bind.property_list_member(spoon_test.$kw28$NAME, analysis);
		SubLObject name = NIL != name_tail ? conses_high.cadr(name_tail) : NIL;
		SubLObject conc_name_tail = cdestructuring_bind.property_list_member(spoon_test.$kw24$CONC_NAME, analysis);
		SubLObject conc_name = NIL != conc_name_tail ? conses_high.cadr(conc_name_tail) : NIL;
		SubLObject print_function_tail = cdestructuring_bind.property_list_member(spoon_test.$kw25$PRINT_FUNCTION,
				analysis);
		SubLObject print_function = NIL != print_function_tail ? conses_high.cadr(print_function_tail) : NIL;
		SubLObject c_structure_tag_tail = cdestructuring_bind.property_list_member(spoon_test.$kw26$C_STRUCTURE_TAG,
				analysis);
		SubLObject c_structure_tag = NIL != c_structure_tag_tail ? conses_high.cadr(c_structure_tag_tail) : NIL;
		SubLObject generate_visit_functionP_tail = cdestructuring_bind
				.property_list_member(spoon_test.$kw27$GENERATE_VISIT_FUNCTION_, analysis);
		SubLObject generate_visit_functionP = NIL != generate_visit_functionP_tail
				? conses_high.cadr(generate_visit_functionP_tail)
				: NIL;
		SubLObject predicate_tail = cdestructuring_bind.property_list_member(spoon_test.$kw30$PREDICATE, analysis);
		SubLObject predicate = NIL != predicate_tail ? conses_high.cadr(predicate_tail) : NIL;
		SubLObject constructor_tail = cdestructuring_bind.property_list_member(spoon_test.$kw31$CONSTRUCTOR, analysis);
		SubLObject constructor = NIL != constructor_tail ? conses_high.cadr(constructor_tail) : NIL;
		SubLObject host_fn_name_tail = cdestructuring_bind.property_list_member(spoon_test.$kw29$HOST_FN_NAME,
				analysis);
		SubLObject host_fn_name = NIL != host_fn_name_tail ? conses_high.cadr(host_fn_name_tail) : NIL;
		SubLObject type_var_tail = cdestructuring_bind.property_list_member(spoon_test.$kw32$TYPE_VAR, analysis);
		SubLObject type_var = NIL != type_var_tail ? conses_high.cadr(type_var_tail) : NIL;
		SubLObject slots_tail = cdestructuring_bind.property_list_member(spoon_test.$kw33$SLOTS, analysis);
		SubLObject slots = NIL != slots_tail ? conses_high.cadr(slots_tail) : NIL;
		SubLObject slot_keywords_tail = cdestructuring_bind.property_list_member(spoon_test.$kw34$SLOT_KEYWORDS,
				analysis);
		SubLObject slot_keywords = NIL != slot_keywords_tail ? conses_high.cadr(slot_keywords_tail) : NIL;
		SubLObject getters_tail = cdestructuring_bind.property_list_member(spoon_test.$kw35$GETTERS, analysis);
		SubLObject getters = NIL != getters_tail ? conses_high.cadr(getters_tail) : NIL;
		SubLObject setters_tail = cdestructuring_bind.property_list_member(spoon_test.$kw36$SETTERS, analysis);
		SubLObject setters = NIL != setters_tail ? conses_high.cadr(setters_tail) : NIL;
		if (NIL != Sequences.find(spoon_test.$kw47$SL2JAVA, reader.$features$.getDynamicValue(thread), UNPROVIDED,
				UNPROVIDED, UNPROVIDED, UNPROVIDED))
			c_structure_tag = NIL;
		SubLObject type_var_form = defstruct_type_var_form(type_var, name, c_structure_tag);
		SubLObject print_method = defstruct_print_method(name, print_function);
		SubLObject print_forms = defstruct_print_forms(c_structure_tag, type_var, print_function, print_method);
		SubLObject register_form = defstruct_register_form(name, c_structure_tag, slots, print_method);
		SubLObject predicate_form = defstruct_predicate_form(name, predicate, c_structure_tag, type_var);
		SubLObject getter_forms = defstruct_getter_forms(name, c_structure_tag, predicate, slots, getters);
		SubLObject setter_forms = defstruct_setter_forms(name, c_structure_tag, predicate, slots, setters);
		SubLObject def_csetf_forms = defstruct_def_csetf_forms(getters, setters);
		SubLObject host_fn_form = NIL != generate_visit_functionP
				? defstruct_host_function(name, host_fn_name, constructor, slot_keywords, getters)
				: NIL;
		SubLObject constructor_form = defstruct_constructor_form(name, constructor, c_structure_tag, type_var,
				slot_keywords, setters);
		return ConsesLow.listS(spoon_test.$sym2$PROGN, type_var_form, ConsesLow.append(print_forms,
				NIL != register_form ? ConsesLow.list(register_form) : NIL,
				ConsesLow.listS(ConsesLow
						.list(spoon_test.$sym48$DECLAIM, ConsesLow.list(spoon_test.$sym49$OPTIMIZE_FUNCALL, predicate)),
						predicate_form,
						ConsesLow.append(getter_forms, setter_forms, def_csetf_forms,
								ConsesLow.list(constructor_form,
										ConsesLow.list(IDENTITY, ConsesLow.list(spoon_test.$sym50$QUOTE, name)),
										NIL != generate_visit_functionP ? host_fn_form : spoon_test.$list51)))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20489L)
	public static SubLObject defstruct_first_function_variable(SubLObject function, SubLObject v_default) {
		return v_default;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12421L)
	public static SubLObject defstruct_getter(SubLObject conc_name, SubLObject slot) {
		return intern_accessor(
				Strings.string_upcase(Sequences.cconcatenate(Symbols.symbol_name(conc_name), Symbols.symbol_name(slot)),
						UNPROVIDED, UNPROVIDED));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21512L)
	public static SubLObject defstruct_getter_arglist(SubLObject getter) {
		return ConsesLow.list(defstruct_getter_variable(getter));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21214L)
	public static SubLObject defstruct_getter_form(SubLObject getter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		SubLObject arglist = defstruct_getter_arglist(getter);
		SubLObject getter_var = arglist.first();
		return ConsesLow.list(spoon_test.$sym5$DEFINE, getter, arglist,
				ConsesLow.list(spoon_test.$sym77$CHECK_TYPE, getter_var, predicate),
				ConsesLow.list(spoon_test.$sym9$RET,
						ConsesLow.list(spoon_test.$sym78$_DEFSTRUCT_GET_SLOT, getter_var, index, type, slot)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20801L)
	public static SubLObject defstruct_getter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject getters) {
		SubLObject forms = NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject getter;
		SubLObject index;
		for (cdotimes_end_var = Sequences.length(getters), i = NIL, i = ZERO_INTEGER; i
				.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
			slot = ConsesLow.nth(i, slots);
			getter = ConsesLow.nth(i, getters);
			index = NIL != c_structure_tag ? i : Numbers.add(i, TWO_INTEGER);
			forms = ConsesLow.cons(defstruct_getter_form(getter, index, predicate, type, slot), forms);
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21603L)
	public static SubLObject defstruct_getter_variable(SubLObject getter) {
		return defstruct_first_function_variable(getter, spoon_test.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12210L)
	public static SubLObject defstruct_getters(SubLObject conc_name, SubLObject slots) {
		SubLObject getters = NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject getter = defstruct_getter(conc_name, slot);
			getters = ConsesLow.cons(getter, getters);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return Sequences.nreverse(getters);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25599L)
	public static SubLObject defstruct_host_arglist() {
		return spoon_test.$list104;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11749L)
	public static SubLObject defstruct_host_fn_name(SubLObject name) {
		return intern_accessor(Sequences.cconcatenate(spoon_test.$str39$VISIT_DEFSTRUCT_, Symbols.symbol_name(name)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 24480L)
	public static SubLObject defstruct_host_function(SubLObject type_name, SubLObject host_fn,
			SubLObject constructor_fn, SubLObject slot_keywords, SubLObject getters) {
		SubLObject arglist = defstruct_host_arglist();
		SubLObject object_arg = arglist.first();
		SubLObject visitor_fn_arg = conses_high.second(arglist);
		SubLObject size = Sequences.length(slot_keywords);
		SubLObject statements = NIL;
		statements = ConsesLow.cons(ConsesLow.list(spoon_test.$sym10$FUNCALL, visitor_fn_arg, object_arg,
				spoon_test.$kw97$BEGIN, ConsesLow.list(spoon_test.$sym50$QUOTE, constructor_fn), size), statements);
		SubLObject index;
		SubLObject slot_keyword;
		SubLObject slot_getter;
		for (index = NIL, index = ZERO_INTEGER; index.numL(size); index = Numbers.add(index, ONE_INTEGER)) {
			slot_keyword = ConsesLow.nth(index, slot_keywords);
			slot_getter = ConsesLow.nth(index, getters);
			statements = ConsesLow.cons(ConsesLow.list(spoon_test.$sym10$FUNCALL, visitor_fn_arg, object_arg,
					spoon_test.$kw98$SLOT, slot_keyword, ConsesLow.list(slot_getter, object_arg)), statements);
		}
		statements = ConsesLow.cons(ConsesLow.list(spoon_test.$sym10$FUNCALL, visitor_fn_arg, object_arg,
				spoon_test.$kw99$END, ConsesLow.list(spoon_test.$sym50$QUOTE, constructor_fn), size), statements);
		statements = Sequences.nreverse(statements);
		return ConsesLow.list(spoon_test.$sym2$PROGN,
				ConsesLow.list(spoon_test.$sym5$DEFINE, host_fn, arglist,
						reader.bq_cons(spoon_test.$sym2$PROGN, ConsesLow.append(statements, NIL)),
						ConsesLow.list(spoon_test.$sym9$RET, object_arg)),
				ConsesLow.list(spoon_test.$sym100$DEFINE_METHOD, spoon_test.$sym101$VISIT_DEFSTRUCT_OBJECT,
						reader.bq_cons(ConsesLow.list(spoon_test.$sym102$OBJ, type_name), spoon_test.$list103),
						ConsesLow.list(spoon_test.$sym9$RET, reader.bq_cons(host_fn, spoon_test.$list104))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13455L)
	public static SubLObject defstruct_lisp_constructor(SubLObject constructor) {
		return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(constructor), spoon_test.$str43$_1));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11540L)
	public static SubLObject defstruct_predicate(SubLObject name) {
		return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), spoon_test.$str37$_P));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20271L)
	public static SubLObject defstruct_predicate_arglist(SubLObject predicate) {
		return ConsesLow.list(defstruct_predicate_variable(predicate));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19971L)
	public static SubLObject defstruct_predicate_form(SubLObject type, SubLObject predicate, SubLObject c_structure_tag,
			SubLObject type_var) {
		SubLObject arglist = defstruct_predicate_arglist(predicate);
		SubLObject predicate_var = arglist.first();
		return ConsesLow.list(spoon_test.$sym5$DEFINE, predicate, arglist, ConsesLow.list(spoon_test.$sym9$RET,
				ConsesLow.list(spoon_test.$sym75$_DEFSTRUCT_OBJECT_P, predicate_var, c_structure_tag, type_var, type)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20376L)
	public static SubLObject defstruct_predicate_variable(SubLObject predicate) {
		return defstruct_first_function_variable(predicate, spoon_test.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19232L)
	public static SubLObject defstruct_print_forms(SubLObject c_structure_tag, SubLObject tag_var,
			SubLObject print_function, SubLObject print_method) {
		if (NIL == print_function)
			print_function = spoon_test.$sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
		return ConsesLow.listS(
				ConsesLow.list(spoon_test.$sym48$DECLAIM,
						ConsesLow.list(spoon_test.$sym69$FACCESS, spoon_test.$sym70$PRIVATE, print_method)),
				ConsesLow.list(spoon_test.$sym5$DEFINE, print_method, spoon_test.$list71,
						reader.bq_cons(print_function, spoon_test.$list72)),
				ConsesLow.append(NIL != c_structure_tag
						? NIL
						: ConsesLow.list(ConsesLow.list(spoon_test.$sym12$_REGISTER_METHOD,
								spoon_test.$sym73$_PRINT_OBJECT_METHOD_TABLE_, tag_var,
								ConsesLow.list(spoon_test.$sym13$FUNCTION, print_method))),
						NIL));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19062L)
	public static SubLObject defstruct_print_method(SubLObject name, SubLObject print_function) {
		return intern_accessor(
				Sequences.cconcatenate(Symbols.symbol_name(name), spoon_test.$str67$_PRINT_FUNCTION_TRAMPOLINE));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19715L)
	public static SubLObject defstruct_register_form(SubLObject name, SubLObject c_structure_tag, SubLObject slots,
			SubLObject print_method) {
		if (NIL != c_structure_tag)
			return ConsesLow.list(spoon_test.$sym74$_REGISTER_DEFSTRUCT, Symbols.symbol_name(name), c_structure_tag,
					Sequences.length(slots), ConsesLow.list(spoon_test.$sym50$QUOTE, print_method),
					ConsesLow.list(spoon_test.$sym50$QUOTE, slots));
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12764L)
	public static SubLObject defstruct_setter(SubLObject getter) {
		SubLObject getter_name = Symbols.symbol_name(getter);
		SubLObject getter_package = getter_package(getter);
		SubLObject setter_name = Sequences.cconcatenate(spoon_test.$str40$_CSETF_, getter_name);
		SubLObject setter_package = getter_package;
		return Packages.intern(setter_name, setter_package);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22461L)
	public static SubLObject defstruct_setter_arglist(SubLObject setter) {
		return spoon_test.$list80;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22119L)
	public static SubLObject defstruct_setter_form(SubLObject setter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		SubLObject arglist = defstruct_setter_arglist(setter);
		SubLObject object_var = arglist.first();
		SubLObject value_var = conses_high.second(arglist);
		return ConsesLow.list(spoon_test.$sym5$DEFINE, setter, arglist,
				ConsesLow.list(spoon_test.$sym77$CHECK_TYPE, object_var, predicate),
				ConsesLow.list(spoon_test.$sym9$RET, ConsesLow.list(spoon_test.$sym79$_DEFSTRUCT_SET_SLOT, object_var,
						index, value_var, type, slot)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21707L)
	public static SubLObject defstruct_setter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject setters) {
		SubLObject forms = NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject setter;
		SubLObject index;
		for (cdotimes_end_var = Sequences.length(setters), i = NIL, i = ZERO_INTEGER; i
				.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
			slot = ConsesLow.nth(i, slots);
			setter = ConsesLow.nth(i, setters);
			index = NIL != c_structure_tag ? i : Numbers.add(i, TWO_INTEGER);
			forms = ConsesLow.cons(defstruct_setter_form(setter, index, predicate, type, slot), forms);
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12565L)
	public static SubLObject defstruct_setters(SubLObject getters) {
		SubLObject setters = NIL;
		SubLObject cdolist_list_var = getters;
		SubLObject getter = NIL;
		getter = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject setter = defstruct_setter(getter);
			setters = ConsesLow.cons(setter, setters);
			cdolist_list_var = cdolist_list_var.rest();
			getter = cdolist_list_var.first();
		}
		return Sequences.nreverse(setters);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11976L)
	public static SubLObject defstruct_slot_keywords(SubLObject slots) {
		SubLObject slot_keywords = NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject slot_keyword = Symbols.make_keyword(Symbols.symbol_name(slot));
			slot_keywords = ConsesLow.cons(slot_keyword, slot_keywords);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return Sequences.nreverse(slot_keywords);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11868L)
	public static SubLObject defstruct_type_var(SubLObject name) {
		return intern_accessor(Sequences.cconcatenate(spoon_test.$str19$_DTP_,
				new SubLObject[]{Symbols.symbol_name(name), spoon_test.$str15$_}));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18642L)
	public static SubLObject defstruct_type_var_form(SubLObject type_var, SubLObject name, SubLObject c_structure_tag) {
		return ConsesLow.list(spoon_test.$sym66$DEFCONSTANT, type_var,
				NIL != c_structure_tag ? c_structure_tag : ConsesLow.list(spoon_test.$sym50$QUOTE, name));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7690L)
	public static SubLObject dtp_var(SubLObject name) {
		SubLObject symbol = intern_accessor(Sequences.cconcatenate(spoon_test.$str19$_DTP_,
				new SubLObject[]{Symbols.symbol_name(name), spoon_test.$str15$_}));
		return symbol;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26660L)
	public static SubLObject finalize_call_profiling_table(SubLObject table) {
		SubLObject pairs = NIL;
		SubLObject function = NIL;
		SubLObject count = NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				function = Hashtables.getEntryKey(cdohash_entry);
				count = Hashtables.getEntryValue(cdohash_entry);
				pairs = ConsesLow.cons(ConsesLow.cons(function, count), pairs);
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		pairs = Sort.sort(pairs, Symbols.symbol_function(spoon_test.$sym111$_),
				Symbols.symbol_function(spoon_test.$sym112$CDR));
		return pairs;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7883L)
	public static SubLObject full_formal_parameter_list(SubLObject arglist) {
		SubLObject answer = NIL;
		SubLObject cdolist_list_var = arglist;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (arg.isCons())
				answer = ConsesLow.cons(arg.first(), answer);
			else if (arg != spoon_test.$sym20$_OPTIONAL)
				if (arg != SubLObjectFactory.makeSymbol("&REST"))
					answer = ConsesLow.cons(arg, answer);
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return Sequences.nreverse(answer);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13031L)
	public static SubLObject getter_package(SubLObject getter) {
		SubLObject v_package = Symbols.symbol_package(getter);
		if (!Packages.package_name(v_package).equal(spoon_test.$str41$CYC))
			v_package = Packages.find_package(spoon_test.$str42$SUBLISP);
		return v_package;
	}

	public static SubLObject init_complex_special_forms_file() {
		spoon_test.$polymorphic_type_hierarchy$ = SubLFiles.defparameter("*POLYMORPHIC-TYPE-HIERARCHY*",
				spoon_test.$list11);
		spoon_test.$default_generate_visit_functionP$ = SubLFiles.defparameter("*DEFAULT-GENERATE-VISIT-FUNCTION?*", T);
		spoon_test.$call_profiling_enabledP$ = SubLFiles.defvar("*CALL-PROFILING-ENABLED?*", NIL);
		spoon_test.$call_profiling_table$ = SubLFiles.defvar("*CALL-PROFILING-TABLE*", NIL);
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26565L)
	public static SubLObject initialize_call_profiling_table() {
		return Hashtables.make_hash_table(spoon_test.$int$1000, Symbols.symbol_function(EQ), UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 1032L)
	public static SubLObject intern_accessor(SubLObject string) {
		return Packages.intern(string, UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7553L)
	public static SubLObject method_function_var(SubLObject name, SubLObject type) {
		return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name),
				new SubLObject[]{spoon_test.$str17$_, Symbols.symbol_name(type), spoon_test.$str18$_METHOD}));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7293L)
	public static SubLObject method_table_var(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject symbol = NIL;
		SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
		try {
			Packages.$package$.bind(accessor_package(name), thread);
			symbol = intern_accessor(Sequences.cconcatenate(spoon_test.$str15$_,
					new SubLObject[]{Symbols.symbol_name(name), spoon_test.$str16$_METHOD_TABLE_}));
		} finally {
			Packages.$package$.rebind(_prev_bind_0, thread);
		}
		return symbol;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26367L)
	public static SubLObject possibly_note_function_entry(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != spoon_test.$call_profiling_enabledP$.getDynamicValue(thread)
				&& NIL != spoon_test.$call_profiling_table$.getDynamicValue(thread))
			Hashtables.sethash(name, spoon_test.$call_profiling_table$.getDynamicValue(thread),
					Numbers.add(
							Hashtables.gethash_without_values(name,
									spoon_test.$call_profiling_table$.getDynamicValue(thread), ZERO_INTEGER),
							ONE_INTEGER));
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13331L)
	public static SubLObject setter_from_accessor(SubLObject accessor) {
		return defstruct_setter(accessor);
	}

	public static SubLObject setup_complex_special_forms_file() {
		return NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25962L)
	public static SubLObject with_call_profiling(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject place = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, spoon_test.$list105);
		place = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.list(spoon_test.$sym6$CLET, spoon_test.$list106,
				ConsesLow.list(spoon_test.$sym107$CUNWIND_PROTECT,
						reader.bq_cons(spoon_test.$sym2$PROGN, ConsesLow.append(body, NIL)),
						ConsesLow.listS(spoon_test.$sym108$CSETF, place, spoon_test.$list109)));
	}

	public static SubLFile me;
	final public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms";
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6149L)
	public static SubLSymbol $polymorphic_type_hierarchy$;
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 9720L)
	public static SubLSymbol $default_generate_visit_functionP$;
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25661L)
	public static SubLSymbol $call_profiling_enabledP$;
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25853L)
	public static SubLSymbol $call_profiling_table$;
	private static final SubLList $list0;
	private static final SubLString $str1$METHOD_FUNCTION;
	private static final SubLSymbol $sym2$PROGN;
	private static final SubLSymbol $sym3$DEFLEXICAL;
	private static final SubLList $list4;
	private static final SubLSymbol $sym5$DEFINE;
	private static final SubLSymbol $sym6$CLET;
	private static final SubLSymbol $sym7$_METHOD;
	private static final SubLSymbol $sym8$PWHEN;
	final private static SubLSymbol $sym9$RET = SubLObjectFactory.makeSymbol("RET");
	private static final SubLSymbol $sym10$FUNCALL;
	private static final SubLList $list11;
	private static final SubLSymbol $sym12$_REGISTER_METHOD;
	private static final SubLSymbol $sym13$FUNCTION;
	private static final SubLSymbol $sym14$STRING_;
	private static final SubLString $str15$_;
	private static final SubLString $str16$_METHOD_TABLE_;
	private static final SubLString $str17$_;
	private static final SubLString $str18$_METHOD;
	private static final SubLString $str19$_DTP_;
	private static final SubLSymbol $sym20$_OPTIONAL;
	private static final SubLList $list22;
	private static final SubLSymbol $sym23$SYMBOLP;
	private static final SubLSymbol $kw24$CONC_NAME;
	private static final SubLSymbol $kw25$PRINT_FUNCTION;
	private static final SubLSymbol $kw26$C_STRUCTURE_TAG;
	private static final SubLSymbol $kw27$GENERATE_VISIT_FUNCTION_;
	private static final SubLSymbol $kw28$NAME;
	private static final SubLSymbol $kw29$HOST_FN_NAME;
	private static final SubLSymbol $kw30$PREDICATE;
	private static final SubLSymbol $kw31$CONSTRUCTOR;
	private static final SubLSymbol $kw32$TYPE_VAR;
	private static final SubLSymbol $kw33$SLOTS;
	private static final SubLSymbol $kw34$SLOT_KEYWORDS;
	private static final SubLSymbol $kw35$GETTERS;
	private static final SubLSymbol $kw36$SETTERS;
	private static final SubLString $str37$_P;
	private static final SubLString $str38$MAKE_;
	private static final SubLString $str39$VISIT_DEFSTRUCT_;
	private static final SubLString $str40$_CSETF_;
	private static final SubLString $str41$CYC;
	private static final SubLString $str42$SUBLISP;
	private static final SubLString $str43$_1;
	private static final SubLList $list44;
	private static final SubLList $list45;
	private static final SubLSymbol $kw46$ALLOW_OTHER_KEYS;
	private static final SubLSymbol $kw47$SL2JAVA;
	private static final SubLSymbol $sym48$DECLAIM;
	private static final SubLSymbol $sym49$OPTIMIZE_FUNCALL;
	private static final SubLSymbol $sym50$QUOTE;
	private static final SubLList $list51;
	private static final SubLList $list52;
	private static final SubLSymbol $sym53$_STRUCTURE_TYPE;
	private static final SubLSymbol $sym54$CAND;
	private static final SubLSymbol $sym55$_STRUCTURES_BAG_P;
	private static final SubLSymbol $sym56$_STRUCTURE_SLOT;
	private static final SubLList $list57;
	private static final SubLList $list58;
	private static final SubLList $list59;
	private static final SubLSymbol $sym60$_SET_STRUCTURE_SLOT;
	private static final SubLList $list61;
	private static final SubLSymbol $sym62$_CLEAR_STRUCTURE;
	private static final SubLSymbol $sym63$_NEW_STRUCTURE;
	private static final SubLSymbol $sym64$_CLEAR_SUB_STRUCTURE;
	private static final SubLSymbol $sym65$_DTP_STRUCTURES_BAG_;
	private static final SubLSymbol $sym66$DEFCONSTANT;
	private static final SubLString $str67$_PRINT_FUNCTION_TRAMPOLINE;
	private static final SubLSymbol $sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
	private static final SubLSymbol $sym69$FACCESS;
	private static final SubLSymbol $sym70$PRIVATE;
	private static final SubLList $list71;
	private static final SubLList $list72;
	private static final SubLSymbol $sym73$_PRINT_OBJECT_METHOD_TABLE_;
	private static final SubLSymbol $sym74$_REGISTER_DEFSTRUCT;
	private static final SubLSymbol $sym75$_DEFSTRUCT_OBJECT_P;
	private static final SubLSymbol $sym76$OBJECT;
	private static final SubLSymbol $sym77$CHECK_TYPE;
	private static final SubLSymbol $sym78$_DEFSTRUCT_GET_SLOT;
	private static final SubLSymbol $sym79$_DEFSTRUCT_SET_SLOT;
	private static final SubLList $list80;
	private static final SubLSymbol $sym81$_DEF_CSETF;
	private static final SubLSymbol $sym82$NEW;
	private static final SubLSymbol $sym83$_DEFSTRUCT_CONSTRUCT;
	private static final SubLList $list84;
	private static final SubLString $str85$CURRENT_VALUE;
	private static final SubLString $str86$CURRENT_ARG;
	private static final SubLString $str87$NEXT;
	private static final SubLSymbol $sym88$OTHERWISE;
	private static final SubLSymbol $sym89$ERROR;
	private static final SubLString $str90$Invalid_slot__S_for_construction_;
	private static final SubLSymbol $sym91$CDO;
	private static final SubLSymbol $sym92$CDDR;
	private static final SubLSymbol $sym93$NULL;
	private static final SubLSymbol $sym94$CAR;
	private static final SubLSymbol $sym95$CADR;
	private static final SubLSymbol $sym96$PCASE;
	private static final SubLSymbol $kw97$BEGIN;
	private static final SubLSymbol $kw98$SLOT;
	private static final SubLSymbol $kw99$END;
	private static final SubLSymbol $sym100$DEFINE_METHOD;
	private static final SubLSymbol $sym101$VISIT_DEFSTRUCT_OBJECT;
	private static final SubLSymbol $sym102$OBJ;
	private static final SubLList $list103;
	private static final SubLList $list104;
	private static final SubLList $list105;
	private static final SubLList $list106;
	private static final SubLSymbol $sym107$CUNWIND_PROTECT;
	private static final SubLSymbol $sym108$CSETF;
	private static final SubLList $list109;
	private static final SubLInteger $int$1000;
	private static final SubLSymbol $sym111$_;
	private static final SubLSymbol $sym112$CDR;
	static {
		me = new spoon_test();

		$sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		spoon_test.$polymorphic_type_hierarchy$ = null;
		spoon_test.$default_generate_visit_functionP$ = null;
		spoon_test.$call_profiling_enabledP$ = null;
		spoon_test.$call_profiling_table$ = null;
		$list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("LAMBDA-LIST"),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str1$METHOD_FUNCTION = SubLObjectFactory.makeString("METHOD-FUNCTION");
		$sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym3$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
		$list4 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-VECTOR"), SubLObjectFactory.makeInteger(256), NIL));
		$sym5$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
		$sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym7$_METHOD = SubLObjectFactory.makeSymbol("_METHOD");
		$sym10$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
		$list11 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeString("INTEGER"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"))),
				ConsesLow.list(SubLObjectFactory.makeString("NUMBER"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"),
								SubLObjectFactory.makeSymbol("FLOAT"))),
				ConsesLow.list(SubLObjectFactory.makeString("SEQUENCE"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("VECTOR"),
								SubLObjectFactory.makeSymbol("STRING"))));
		$sym12$_REGISTER_METHOD = SubLObjectFactory.makeSymbol("_REGISTER-METHOD");
		$sym13$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
		$sym14$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
		$str15$_ = SubLObjectFactory.makeString("*");
		$str16$_METHOD_TABLE_ = SubLObjectFactory.makeString("-METHOD-TABLE*");
		$str17$_ = SubLObjectFactory.makeString("-");
		$str18$_METHOD = SubLObjectFactory.makeString("-METHOD");
		$str19$_DTP_ = SubLObjectFactory.makeString("*DTP-");
		$sym20$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");

		$list22 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("&REST"),
						SubLObjectFactory.makeSymbol("OPTIONS")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("SLOTS"));
		$sym23$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
		$kw24$CONC_NAME = SubLObjectFactory.makeKeyword("CONC-NAME");
		$kw25$PRINT_FUNCTION = SubLObjectFactory.makeKeyword("PRINT-FUNCTION");
		$kw26$C_STRUCTURE_TAG = SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG");
		$kw27$GENERATE_VISIT_FUNCTION_ = SubLObjectFactory.makeKeyword("GENERATE-VISIT-FUNCTION?");
		$kw28$NAME = SubLObjectFactory.makeKeyword("NAME");
		$kw29$HOST_FN_NAME = SubLObjectFactory.makeKeyword("HOST-FN-NAME");
		$kw30$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
		$kw31$CONSTRUCTOR = SubLObjectFactory.makeKeyword("CONSTRUCTOR");
		$kw32$TYPE_VAR = SubLObjectFactory.makeKeyword("TYPE-VAR");
		$kw33$SLOTS = SubLObjectFactory.makeKeyword("SLOTS");
		$kw34$SLOT_KEYWORDS = SubLObjectFactory.makeKeyword("SLOT-KEYWORDS");
		$kw35$GETTERS = SubLObjectFactory.makeKeyword("GETTERS");
		$kw36$SETTERS = SubLObjectFactory.makeKeyword("SETTERS");
		$str37$_P = SubLObjectFactory.makeString("-P");
		$str38$MAKE_ = SubLObjectFactory.makeString("MAKE-");
		$str39$VISIT_DEFSTRUCT_ = SubLObjectFactory.makeString("VISIT-DEFSTRUCT-");
		$str40$_CSETF_ = SubLObjectFactory.makeString("_CSETF-");
		$str41$CYC = SubLObjectFactory.makeString("CYC");
		$str42$SUBLISP = SubLObjectFactory.makeString("SUBLISP");
		$str43$_1 = SubLObjectFactory.makeString("-1");
		$list44 = ConsesLow.list(new SubLObject[]{SubLObjectFactory.makeSymbol("&KEY"),
				SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("CONC-NAME"),
				SubLObjectFactory.makeSymbol("PRINT-FUNCTION"), SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"),
				SubLObjectFactory.makeSymbol("GENERATE-VISIT-FUNCTION?"), SubLObjectFactory.makeSymbol("PREDICATE"),
				SubLObjectFactory.makeSymbol("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("HOST-FN-NAME"),
				SubLObjectFactory.makeSymbol("TYPE-VAR"), SubLObjectFactory.makeSymbol("SLOTS"),
				SubLObjectFactory.makeSymbol("SLOT-KEYWORDS"), SubLObjectFactory.makeSymbol("GETTERS"),
				SubLObjectFactory.makeSymbol("SETTERS")});
		$list45 = ConsesLow.list(new SubLObject[]{SubLObjectFactory.makeKeyword("NAME"),
				SubLObjectFactory.makeKeyword("CONC-NAME"), SubLObjectFactory.makeKeyword("PRINT-FUNCTION"),
				SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG"),
				SubLObjectFactory.makeKeyword("GENERATE-VISIT-FUNCTION?"), SubLObjectFactory.makeKeyword("PREDICATE"),
				SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeKeyword("HOST-FN-NAME"),
				SubLObjectFactory.makeKeyword("TYPE-VAR"), SubLObjectFactory.makeKeyword("SLOTS"),
				SubLObjectFactory.makeKeyword("SLOT-KEYWORDS"), SubLObjectFactory.makeKeyword("GETTERS"),
				SubLObjectFactory.makeKeyword("SETTERS")});
		$kw46$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		$kw47$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
		$sym48$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
		$sym49$OPTIMIZE_FUNCALL = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");
		$sym50$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		$list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("PROGN"));
		$list52 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), SubLObjectFactory.makeSymbol("TYPE-VAR"),
				SubLObjectFactory.makeSymbol("TYPE"));
		$sym53$_STRUCTURE_TYPE = SubLObjectFactory.makeSymbol("_STRUCTURE-TYPE");
		$sym54$CAND = SubLObjectFactory.makeSymbol("CAND");
		$sym55$_STRUCTURES_BAG_P = SubLObjectFactory.makeSymbol("_STRUCTURES-BAG-P");
		$sym56$_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_STRUCTURE-SLOT");
		$list57 = ConsesLow.list(ONE_INTEGER);
		$list58 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("INDEX"),
				SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("SLOT"));
		$list59 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("INDEX"),
				SubLObjectFactory.makeSymbol("VALUE"), SubLObjectFactory.makeSymbol("TYPE"),
				SubLObjectFactory.makeSymbol("SLOT"));
		$sym60$_SET_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_SET-STRUCTURE-SLOT");
		$list61 = ConsesLow.list(SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), SubLObjectFactory.makeSymbol("SIZE"),
				SubLObjectFactory.makeSymbol("TYPE-VAR"), SubLObjectFactory.makeSymbol("TYPE"));
		$sym62$_CLEAR_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-STRUCTURE");
		$sym63$_NEW_STRUCTURE = SubLObjectFactory.makeSymbol("_NEW-STRUCTURE");
		$sym64$_CLEAR_SUB_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-SUB-STRUCTURE");
		$sym65$_DTP_STRUCTURES_BAG_ = SubLObjectFactory.makeSymbol("*DTP-STRUCTURES-BAG*");
		$sym66$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
		$str67$_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeString("-PRINT-FUNCTION-TRAMPOLINE");
		$sym68$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		$sym69$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
		$sym70$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
		$list71 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("STREAM"));
		$list72 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("STREAM"),
				ZERO_INTEGER);
		$sym73$_PRINT_OBJECT_METHOD_TABLE_ = SubLObjectFactory.makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");
		$sym74$_REGISTER_DEFSTRUCT = SubLObjectFactory.makeSymbol("_REGISTER-DEFSTRUCT");
		$sym75$_DEFSTRUCT_OBJECT_P = SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P");
		$sym76$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
		$sym77$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
		$sym78$_DEFSTRUCT_GET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT");
		$sym79$_DEFSTRUCT_SET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT");
		$list80 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("VALUE"));
		$sym81$_DEF_CSETF = SubLObjectFactory.makeSymbol("_DEF-CSETF");
		$sym82$NEW = SubLObjectFactory.makeSymbol("NEW");
		$sym83$_DEFSTRUCT_CONSTRUCT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT");
		$list84 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("ARGLIST"));
		$str85$CURRENT_VALUE = SubLObjectFactory.makeString("CURRENT-VALUE");
		$str86$CURRENT_ARG = SubLObjectFactory.makeString("CURRENT-ARG");
		$str87$NEXT = SubLObjectFactory.makeString("NEXT");
		$sym88$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
		$sym89$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		$str90$Invalid_slot__S_for_construction_ = SubLObjectFactory
				.makeString("Invalid slot ~S for construction function");
		$sym91$CDO = SubLObjectFactory.makeSymbol("CDO");
		$sym92$CDDR = SubLObjectFactory.makeSymbol("CDDR");
		$sym93$NULL = SubLObjectFactory.makeSymbol("NULL");
		$sym94$CAR = SubLObjectFactory.makeSymbol("CAR");
		$sym95$CADR = SubLObjectFactory.makeSymbol("CADR");
		$sym96$PCASE = SubLObjectFactory.makeSymbol("PCASE");
		$kw97$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
		$kw98$SLOT = SubLObjectFactory.makeKeyword("SLOT");
		$kw99$END = SubLObjectFactory.makeKeyword("END");
		$sym100$DEFINE_METHOD = SubLObjectFactory.makeSymbol("DEFINE-METHOD");
		$sym101$VISIT_DEFSTRUCT_OBJECT = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT");
		$sym102$OBJ = SubLObjectFactory.makeSymbol("OBJ");
		$list103 = ConsesLow.list(SubLObjectFactory.makeSymbol("VISITOR-FN"));
		$list104 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJ"), SubLObjectFactory.makeSymbol("VISITOR-FN"));
		$list105 = ConsesLow.list(SubLObjectFactory.makeSymbol("PLACE"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		$list106 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZE-CALL-PROFILING-TABLE"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-ENABLED?*"), T));
		$sym107$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		$sym108$CSETF = SubLObjectFactory.makeSymbol("CSETF");
		$list109 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FINALIZE-CALL-PROFILING-TABLE"),
				SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*")));
		$int$1000 = SubLObjectFactory.makeInteger(1000);
		$sym111$_ = SubLObjectFactory.makeSymbol(">");
		$sym112$CDR = SubLObjectFactory.makeSymbol("CDR");
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

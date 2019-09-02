package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_parameter_types extends SubLTranslatedFile implements V10 {
	public static final SubLFile me = new system_parameter_types();

	public static final String myName = "com.cyc.cycjava_2.cycl.system_parameter_types";

	private static final SubLSymbol $system_parameter_type_definitions$ = makeSymbol("*SYSTEM-PARAMETER-TYPE-DEFINITIONS*");

	private static final SubLSymbol $CHECKER = makeKeyword("CHECKER");

	private static final SubLInteger $int$65536 = makeInteger(65536);

	private static final SubLSymbol UNDEFINED = makeSymbol("UNDEFINED");

	private static final SubLString $$$undefined = makeString("undefined");

	private static final SubLString $str9$__TRUE___or___FALSE__ = makeString("::TRUE:: or ::FALSE::");

	private static final SubLSymbol BOOLEAN_CHECKER_P = makeSymbol("BOOLEAN-CHECKER-P");

	private static final SubLString $$$a_string = makeString("a string");

	private static final SubLSymbol FULL_PATH = makeSymbol("FULL-PATH");

	private static final SubLString $$$a_valid_directory_path = makeString("a valid directory path");

	private static final SubLString $$$an_integer = makeString("an integer");

	private static final SubLString $$$a_symbol = makeString("a symbol");

	private static final SubLString $str24$a_TCP_IP_port_number = makeString("a TCP/IP port number");

	private static final SubLSymbol PORT_CHECKER_P = makeSymbol("PORT-CHECKER-P");

	private static final SubLSymbol PORT_OFFSET = makeSymbol("PORT-OFFSET");

	private static final SubLString $str27$a_TCP_IP_port_offset = makeString("a TCP/IP port offset");

	private static final SubLString $str28$ = makeString("");

	private static final SubLList $list32 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("INNER-TYPES"));

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $$$one_of_ = makeString("one of ");

	private static final SubLString $str38$__ = makeString(", ");

	private static final SubLString $str39$Cannot_interpret_type__A_declarat = makeString("Cannot interpret type ~A declaration.");

	private static final SubLString $str40$Invalid_operator__A_should_have_b = makeString("Invalid operator ~A should have been filtered before here.");

	private static final SubLString $str41$Implementation_error__invalid_typ = makeString("Implementation error, invalid type ~A should have been filtered before here.");

	public static SubLObject register_system_parameter_type(final SubLObject symbol, final SubLObject possible_value_string, final SubLObject checker_fn) {
		final SubLObject description = list($SYMBOL, symbol, $VALUES, possible_value_string, $CHECKER, checker_fn);
		$system_parameter_type_definitions$.setGlobalValue(list_utilities.alist_enter($system_parameter_type_definitions$.getGlobalValue(), symbol, description, UNPROVIDED));
		return symbol;
	}

	public static SubLObject boolean_checker_p(final SubLObject obj) {
		return makeBoolean((obj == T) || (obj == NIL));
	}

	public static SubLObject port_checker_p(final SubLObject obj) {
		return makeBoolean((NIL != subl_promotions.non_negative_integer_p(obj)) && obj.numL($int$65536));
	}

	public static SubLObject get_system_parameter_type_possible_values_string(final SubLObject type) {
		final SubLObject description = list_utilities.alist_lookup($system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED);
		return getf(description, $VALUES, $str28$);
	}

	public static SubLObject get_system_parameter_type_checker(final SubLObject type) {
		final SubLObject description = list_utilities.alist_lookup($system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED);
		return getf(description, $CHECKER, FALSE);
	}

	public static SubLObject get_system_parameter_member_type_members(final SubLObject inner_types) {
		final SubLObject alist = symbol_value(inner_types.first());
		final SubLObject values = Mapping.mapcar(CAR, alist);
		return values;
	}

	public static SubLObject determine_system_parameter_type_possible_values_string(final SubLObject type, SubLObject flavor) {
		if (flavor == UNPROVIDED) {
			flavor = $SUBL;
		}
		SubLObject value_string = $str28$;
		if (type.isCons()) {
			SubLObject s = NIL;
			try {
				s = make_private_string_output_stream();
				SubLObject operator = NIL;
				destructuring_bind_must_consp(type, type, $list32);
				operator = type.first();
				final SubLObject inner_types;
				final SubLObject current = inner_types = type.rest();
				if ((OR == operator) || (AND == operator)) {
					final SubLObject op_name = Strings.string_downcase(symbol_name(operator), UNPROVIDED, UNPROVIDED);
					SubLObject list_var = NIL;
					SubLObject inner_type = NIL;
					SubLObject index = NIL;
					list_var = inner_types;
					inner_type = list_var.first();
					for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), inner_type = list_var.first(), index = add(ONE_INTEGER, index)) {
						final SubLObject inner_value_string = determine_system_parameter_type_possible_values_string(inner_type, UNPROVIDED);
						if (!index.isZero()) {
							write_string($$$_, s, UNPROVIDED, UNPROVIDED);
							write_string(op_name, s, UNPROVIDED, UNPROVIDED);
							write_string($$$_, s, UNPROVIDED, UNPROVIDED);
						}
						write_string(inner_value_string, s, UNPROVIDED, UNPROVIDED);
					}
				} else if (MEMBER == operator) {
					final SubLObject values = get_system_parameter_member_type_members(inner_types);
					SubLObject list_var = NIL;
					SubLObject value = NIL;
					SubLObject index = NIL;
					list_var = values;
					value = list_var.first();
					for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), value = list_var.first(), index = add(ONE_INTEGER, index)) {
						if (index.isZero()) {
							write_string($$$one_of_, s, UNPROVIDED, UNPROVIDED);
						} else {
							write_string($str38$__, s, UNPROVIDED, UNPROVIDED);
						}
						if ($SUBL == flavor) {
							prin1(value, s);
						} else {
							princ(value, s);
						}
					}
				} else {
					Errors.error($str39$Cannot_interpret_type__A_declarat);
				}

				value_string = get_output_stream_string(s);
			} finally {
				final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
				try {
					bind($is_thread_performing_cleanupP$, T);
					final SubLObject _values = getValuesAsVector();
					close(s, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					rebind($is_thread_performing_cleanupP$, _prev_bind_0);
				}
			}
		} else if (type.isSymbol()) {
			value_string = get_system_parameter_type_possible_values_string(type);
		}
		return value_string;
	}

	public static SubLObject valid_system_parameter_typeP(final SubLObject type) {
		if (type.isCons()) {
			SubLObject operator = NIL;
			destructuring_bind_must_consp(type, type, $list32);
			operator = type.first();
			final SubLObject inner_types;
			final SubLObject current = inner_types = type.rest();
			if ((OR == operator) || (AND == operator)) {
				SubLObject cdolist_list_var = inner_types;
				SubLObject inner_type = NIL;
				inner_type = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL == valid_system_parameter_typeP(inner_type)) {
						return NIL;
					}
					cdolist_list_var = cdolist_list_var.rest();
					inner_type = cdolist_list_var.first();
				}
			} else {
				if (MEMBER != operator) {
					return NIL;
				}
				final SubLObject values = get_system_parameter_member_type_members(inner_types);
			}
			return T;
		}
		if (type.isSymbol()) {
			return list_utilities.alist_has_keyP($system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject check_system_parameter_value(final SubLObject value, final SubLObject type) {
		if (type.isCons()) {
			SubLObject operator = NIL;
			destructuring_bind_must_consp(type, type, $list32);
			operator = type.first();
			final SubLObject inner_types;
			final SubLObject current = inner_types = type.rest();
			final SubLObject pcase_var = operator;
			if (pcase_var.eql(OR)) {
				SubLObject cdolist_list_var = inner_types;
				SubLObject inner_type = NIL;
				inner_type = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != check_system_parameter_value(value, inner_type)) {
						return T;
					}
					cdolist_list_var = cdolist_list_var.rest();
					inner_type = cdolist_list_var.first();
				}
				return NIL;
			}
			if (pcase_var.eql(AND)) {
				SubLObject cdolist_list_var = inner_types;
				SubLObject inner_type = NIL;
				inner_type = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL == check_system_parameter_value(value, inner_type)) {
						return NIL;
					}
					cdolist_list_var = cdolist_list_var.rest();
					inner_type = cdolist_list_var.first();
				}
				return T;
			}
			if (pcase_var.eql(MEMBER)) {
				final SubLObject values = get_system_parameter_member_type_members(inner_types);
				return subl_promotions.memberP(value, values, EQUAL, UNPROVIDED);
			}
			Errors.error($str40$Invalid_operator__A_should_have_b, type);
		} else {
			if (type.isSymbol()) {
				final SubLObject checker_fn = get_system_parameter_type_checker(type);
				return funcall(checker_fn, value);
			}
			Errors.error($str41$Implementation_error__invalid_typ);
		}
		return NIL;
	}

	public static SubLObject declare_system_parameter_types_file() {
		declareFunction("register_system_parameter_type", "REGISTER-SYSTEM-PARAMETER-TYPE", 3, 0, false);
		declareFunction("boolean_checker_p", "BOOLEAN-CHECKER-P", 1, 0, false);
		declareFunction("port_checker_p", "PORT-CHECKER-P", 1, 0, false);
		declareFunction("get_system_parameter_type_possible_values_string", "GET-SYSTEM-PARAMETER-TYPE-POSSIBLE-VALUES-STRING", 1, 0, false);
		declareFunction("get_system_parameter_type_checker", "GET-SYSTEM-PARAMETER-TYPE-CHECKER", 1, 0, false);
		declareFunction("get_system_parameter_member_type_members", "GET-SYSTEM-PARAMETER-MEMBER-TYPE-MEMBERS", 1, 0, false);
		declareFunction("determine_system_parameter_type_possible_values_string", "DETERMINE-SYSTEM-PARAMETER-TYPE-POSSIBLE-VALUES-STRING", 1, 1, false);
		declareFunction("valid_system_parameter_typeP", "VALID-SYSTEM-PARAMETER-TYPE?", 1, 0, false);
		declareFunction("check_system_parameter_value", "CHECK-SYSTEM-PARAMETER-VALUE", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_system_parameter_types_file() {
		deflexical("*SYSTEM-PARAMETER-TYPE-DEFINITIONS*", SubLTrampolineFile.maybeDefault($system_parameter_type_definitions$, $system_parameter_type_definitions$, NIL));
		return NIL;
	}

	public static SubLObject setup_system_parameter_types_file() {
		declare_defglobal($system_parameter_type_definitions$);
		register_system_parameter_type(UNDEFINED, $$$undefined, NULL);
		register_system_parameter_type(BOOLEAN, $str9$__TRUE___or___FALSE__, BOOLEAN_CHECKER_P);
		register_system_parameter_type(STRING, $$$a_string, STRINGP);
		register_system_parameter_type(FULL_PATH, $$$a_valid_directory_path, DIRECTORY_P);
		register_system_parameter_type(INTEGER, $$$an_integer, INTEGERP);
		register_system_parameter_type(SYMBOL, $$$a_symbol, SYMBOLP);
		register_system_parameter_type(PORT, $str24$a_TCP_IP_port_number, PORT_CHECKER_P);
		register_system_parameter_type(PORT_OFFSET, $str27$a_TCP_IP_port_offset, PORT_CHECKER_P);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_system_parameter_types_file();
	}

	@Override
	public void initializeVariables() {
		init_system_parameter_types_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_system_parameter_types_file();
	}

}

/**
 * Total time: 138 ms
 */

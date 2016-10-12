/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class complex_special_forms extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new complex_special_forms();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms";
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6028)
	public static SubLSymbol $polymorphic_type_hierarchy$ = null;

	//// Definitions

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 24991)
	public static SubLSymbol $call_profiling_enabledP$ = null;

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25183)
	public static SubLSymbol $call_profiling_table$ = null;

	public static SubLList $list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"),
			SubLObjectFactory.makeSymbol("LAMBDA-LIST"), SubLObjectFactory.makeSymbol("&BODY"),
			SubLObjectFactory.makeSymbol("BODY"));

	public static SubLString $str1$METHOD_FUNCTION = SubLObjectFactory.makeString("METHOD-FUNCTION");

	public static SubLSymbol $sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	public static SubLSymbol $sym3$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");

	public static SubLList $list4 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-VECTOR"),
			SubLObjectFactory.makeInteger(256), CommonSymbols.NIL));

	public static SubLSymbol $sym5$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");

	public static SubLSymbol $sym6$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLSymbol $sym7$_METHOD = SubLObjectFactory.makeSymbol("_METHOD");

	public static SubLSymbol $sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");

	public static SubLSymbol $sym9$RET = SubLObjectFactory.makeSymbol("RET");

	public static SubLSymbol $sym10$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");

	public static SubLSymbol $sym11$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");

	public static SubLSymbol $sym12$OPTIMIZE_FUNCALL = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");

	public static SubLList $list13 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeString("INTEGER"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"))),
			ConsesLow.list(SubLObjectFactory.makeString("NUMBER"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"),
							SubLObjectFactory.makeSymbol("FLOAT"))),
			ConsesLow.list(SubLObjectFactory.makeString("SEQUENCE"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("VECTOR"),
							SubLObjectFactory.makeSymbol("STRING"))));

	public static SubLSymbol $sym14$_REGISTER_METHOD = SubLObjectFactory.makeSymbol("_REGISTER-METHOD");

	public static SubLSymbol $sym15$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");

	public static SubLSymbol $sym16$STRING_ = SubLObjectFactory.makeSymbol("STRING=");

	public static SubLString $str17$_ = SubLObjectFactory.makeString("*");

	public static SubLString $str18$_METHOD_TABLE_ = SubLObjectFactory.makeString("-METHOD-TABLE*");

	public static SubLString $str19$_ = SubLObjectFactory.makeString("-");

	public static SubLString $str20$_METHOD = SubLObjectFactory.makeString("-METHOD");

	public static SubLString $str21$_DTP_ = SubLObjectFactory.makeString("*DTP-");

	public static SubLSymbol $sym22$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");

	public static SubLSymbol $sym23$_REST = SubLObjectFactory.makeSymbol("&REST");

	public static SubLList $list24 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("&REST"),
					SubLObjectFactory.makeSymbol("OPTIONS")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("SLOTS"));

	public static SubLSymbol $sym25$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");

	public static SubLSymbol $kw26$CONC_NAME = SubLObjectFactory.makeKeyword("CONC-NAME");

	public static SubLSymbol $kw27$PRINT_FUNCTION = SubLObjectFactory.makeKeyword("PRINT-FUNCTION");

	public static SubLSymbol $kw28$C_STRUCTURE_TAG = SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG");

	public static SubLSymbol $kw29$GENERATE_VISIT_FUNCTION_ = SubLObjectFactory.makeKeyword("GENERATE-VISIT-FUNCTION?");

	public static SubLSymbol $kw30$NAME = SubLObjectFactory.makeKeyword("NAME");

	public static SubLSymbol $kw31$HOST_FN_NAME = SubLObjectFactory.makeKeyword("HOST-FN-NAME");

	public static SubLSymbol $kw32$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");

	public static SubLSymbol $kw33$CONSTRUCTOR = SubLObjectFactory.makeKeyword("CONSTRUCTOR");

	public static SubLSymbol $kw34$TYPE_VAR = SubLObjectFactory.makeKeyword("TYPE-VAR");

	public static SubLSymbol $kw35$SLOTS = SubLObjectFactory.makeKeyword("SLOTS");

	public static SubLSymbol $kw36$SLOT_KEYWORDS = SubLObjectFactory.makeKeyword("SLOT-KEYWORDS");

	public static SubLSymbol $kw37$GETTERS = SubLObjectFactory.makeKeyword("GETTERS");

	public static SubLSymbol $kw38$SETTERS = SubLObjectFactory.makeKeyword("SETTERS");

	public static SubLString $str39$_P = SubLObjectFactory.makeString("-P");

	public static SubLString $str40$MAKE_ = SubLObjectFactory.makeString("MAKE-");

	public static SubLString $str41$VISIT_DEFSTRUCT_ = SubLObjectFactory.makeString("VISIT-DEFSTRUCT-");

	public static SubLString $str42$_CSETF_ = SubLObjectFactory.makeString("_CSETF-");

	public static SubLString $str43$CYC = SubLObjectFactory.makeString("CYC");

	public static SubLString $str44$SUBLISP = SubLObjectFactory.makeString("SUBLISP");

	public static SubLString $str45$_1 = SubLObjectFactory.makeString("-1");

	public static SubLList $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"),
			SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("CONC-NAME"),
			SubLObjectFactory.makeSymbol("PRINT-FUNCTION"), SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"),
			SubLObjectFactory.makeSymbol("GENERATE-VISIT-FUNCTION?"), SubLObjectFactory.makeSymbol("PREDICATE"),
			SubLObjectFactory.makeSymbol("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("HOST-FN-NAME"),
			SubLObjectFactory.makeSymbol("TYPE-VAR"), SubLObjectFactory.makeSymbol("SLOTS"),
			SubLObjectFactory.makeSymbol("SLOT-KEYWORDS"), SubLObjectFactory.makeSymbol("GETTERS"),
			SubLObjectFactory.makeSymbol("SETTERS") });

	public static SubLList $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"),
			SubLObjectFactory.makeKeyword("CONC-NAME"), SubLObjectFactory.makeKeyword("PRINT-FUNCTION"),
			SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG"), SubLObjectFactory.makeKeyword("GENERATE-VISIT-FUNCTION?"),
			SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("CONSTRUCTOR"),
			SubLObjectFactory.makeKeyword("HOST-FN-NAME"), SubLObjectFactory.makeKeyword("TYPE-VAR"),
			SubLObjectFactory.makeKeyword("SLOTS"), SubLObjectFactory.makeKeyword("SLOT-KEYWORDS"),
			SubLObjectFactory.makeKeyword("GETTERS"), SubLObjectFactory.makeKeyword("SETTERS") });

	public static SubLSymbol $kw48$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");

	public static SubLSymbol $kw49$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");

	public static SubLSymbol $sym50$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");

	public static SubLList $list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("PROGN"));

	public static SubLList $list52 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), SubLObjectFactory.makeSymbol("TYPE-VAR"),
			SubLObjectFactory.makeSymbol("TYPE"));

	public static SubLSymbol $sym53$_STRUCTURE_TYPE = SubLObjectFactory.makeSymbol("_STRUCTURE-TYPE");

	public static SubLSymbol $sym54$CAND = SubLObjectFactory.makeSymbol("CAND");

	public static SubLSymbol $sym55$_STRUCTURES_BAG_P = SubLObjectFactory.makeSymbol("_STRUCTURES-BAG-P");

	public static SubLSymbol $sym56$_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_STRUCTURE-SLOT");

	public static SubLList $list57 = ConsesLow.list(CommonSymbols.ONE_INTEGER);

	public static SubLList $list58 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("TYPE"),
			SubLObjectFactory.makeSymbol("SLOT"));

	public static SubLList $list59 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("VALUE"),
			SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("SLOT"));

	public static SubLSymbol $sym60$_SET_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_SET-STRUCTURE-SLOT");

	//// Internal Constants

	public static SubLList $list61 = ConsesLow.list(SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"),
			SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("TYPE-VAR"),
			SubLObjectFactory.makeSymbol("TYPE"));
	public static SubLSymbol $sym62$_CLEAR_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-STRUCTURE");
	public static SubLSymbol $sym63$_NEW_STRUCTURE = SubLObjectFactory.makeSymbol("_NEW-STRUCTURE");
	public static SubLSymbol $sym64$_CLEAR_SUB_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-SUB-STRUCTURE");
	public static SubLSymbol $sym65$_DTP_STRUCTURES_BAG_ = SubLObjectFactory.makeSymbol("*DTP-STRUCTURES-BAG*");
	public static SubLSymbol $sym66$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
	public static SubLString $str67$_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
			.makeString("-PRINT-FUNCTION-TRAMPOLINE");
	public static SubLSymbol $sym68$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory
			.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
	public static SubLSymbol $sym69$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
	public static SubLSymbol $sym70$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
	public static SubLList $list71 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("STREAM"));
	public static SubLList $list72 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("STREAM"), CommonSymbols.ZERO_INTEGER);
	public static SubLSymbol $sym73$_PRINT_OBJECT_METHOD_TABLE_ = SubLObjectFactory
			.makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");
	public static SubLSymbol $sym74$_REGISTER_DEFSTRUCT = SubLObjectFactory.makeSymbol("_REGISTER-DEFSTRUCT");
	public static SubLSymbol $sym75$_DEFSTRUCT_OBJECT_P = SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P");
	public static SubLSymbol $sym76$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
	public static SubLSymbol $sym77$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
	public static SubLSymbol $sym78$_DEFSTRUCT_GET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT");
	public static SubLSymbol $sym79$_DEFSTRUCT_SET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT");
	public static SubLList $list80 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
			SubLObjectFactory.makeSymbol("VALUE"));
	public static SubLSymbol $sym81$_DEF_CSETF = SubLObjectFactory.makeSymbol("_DEF-CSETF");
	public static SubLSymbol $sym82$NEW = SubLObjectFactory.makeSymbol("NEW");
	public static SubLSymbol $sym83$_DEFSTRUCT_CONSTRUCT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT");
	public static SubLList $list84 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"),
			SubLObjectFactory.makeSymbol("ARGLIST"));
	public static SubLString $str85$CURRENT_VALUE = SubLObjectFactory.makeString("CURRENT-VALUE");
	public static SubLString $str86$CURRENT_ARG = SubLObjectFactory.makeString("CURRENT-ARG");
	public static SubLString $str87$NEXT = SubLObjectFactory.makeString("NEXT");
	public static SubLSymbol $sym88$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
	public static SubLSymbol $sym89$ERROR = SubLObjectFactory.makeSymbol("ERROR");
	public static SubLString $str90$Invalid_slot__S_for_construction_ = SubLObjectFactory
			.makeString("Invalid slot ~S for construction function");
	public static SubLSymbol $sym91$CDO = SubLObjectFactory.makeSymbol("CDO");
	public static SubLSymbol $sym92$CDDR = SubLObjectFactory.makeSymbol("CDDR");
	public static SubLSymbol $sym93$NULL = SubLObjectFactory.makeSymbol("NULL");
	public static SubLSymbol $sym94$CAR = SubLObjectFactory.makeSymbol("CAR");
	public static SubLSymbol $sym95$CADR = SubLObjectFactory.makeSymbol("CADR");
	public static SubLSymbol $sym96$PCASE = SubLObjectFactory.makeSymbol("PCASE");
	public static SubLSymbol $kw97$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
	public static SubLSymbol $kw98$SLOT = SubLObjectFactory.makeKeyword("SLOT");
	public static SubLSymbol $kw99$END = SubLObjectFactory.makeKeyword("END");
	public static SubLSymbol $sym100$DEFINE_METHOD = SubLObjectFactory.makeSymbol("DEFINE-METHOD");
	public static SubLSymbol $sym101$VISIT_DEFSTRUCT_OBJECT = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT");
	public static SubLSymbol $sym102$OBJ = SubLObjectFactory.makeSymbol("OBJ");
	public static SubLList $list103 = ConsesLow.list(SubLObjectFactory.makeSymbol("VISITOR-FN"));
	public static SubLList $list104 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJ"),
			SubLObjectFactory.makeSymbol("VISITOR-FN"));
	public static SubLList $list105 = ConsesLow.list(SubLObjectFactory.makeSymbol("PLACE"),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLList $list106 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZE-CALL-PROFILING-TABLE"))),
			ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-ENABLED?*"), CommonSymbols.T));
	public static SubLSymbol $sym107$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
	public static SubLSymbol $sym108$CSETF = SubLObjectFactory.makeSymbol("CSETF");
	public static SubLList $list109 = ConsesLow
			.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FINALIZE-CALL-PROFILING-TABLE"),
					SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*")));
	public static SubLInteger $int110$1000 = SubLObjectFactory.makeInteger(1000);
	public static SubLSymbol $sym111$_ = SubLObjectFactory.makeSymbol(">");
	public static SubLSymbol $sym112$CDR = SubLObjectFactory.makeSymbol("CDR");

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17651)
	public static SubLObject _defstruct_construct(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject c_structure_tag = CommonSymbols.NIL;
			SubLObject size = CommonSymbols.NIL;
			SubLObject type_var = CommonSymbols.NIL;
			SubLObject type = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
			c_structure_tag = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
			size = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
			type_var = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
			type = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current) {
				if (CommonSymbols.NIL != c_structure_tag)
					return ConsesLow.list(complex_special_forms.$sym62$_CLEAR_STRUCTURE,
							ConsesLow.list(complex_special_forms.$sym63$_NEW_STRUCTURE, c_structure_tag, size), size);
				else
					return ConsesLow.list(complex_special_forms.$sym64$_CLEAR_SUB_STRUCTURE,
							ConsesLow.list(complex_special_forms.$sym63$_NEW_STRUCTURE,
									complex_special_forms.$sym65$_DTP_STRUCTURES_BAG_, size),
							size, type_var);
			} else
				cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list61);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17340)
	public static SubLObject _defstruct_get_slot(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject object = CommonSymbols.NIL;
			SubLObject index = CommonSymbols.NIL;
			SubLObject type = CommonSymbols.NIL;
			SubLObject slot = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
			object = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
			index = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
			type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
			slot = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current)
				return ConsesLow.list(complex_special_forms.$sym56$_STRUCTURE_SLOT, object, index);
			else
				cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list58);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17030)
	public static SubLObject _defstruct_object_p(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject object = CommonSymbols.NIL;
			SubLObject c_structure_tag = CommonSymbols.NIL;
			SubLObject type_var = CommonSymbols.NIL;
			SubLObject type = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
			object = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
			c_structure_tag = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
			type_var = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
			type = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current) {
				if (CommonSymbols.NIL != c_structure_tag)
					return ConsesLow.list(complex_special_forms.$sym53$_STRUCTURE_TYPE, object, c_structure_tag);
				else
					return ConsesLow.list(complex_special_forms.$sym54$CAND,
							ConsesLow.list(complex_special_forms.$sym55$_STRUCTURES_BAG_P, object),
							ConsesLow.list(CommonSymbols.EQ,
									ConsesLow.listS(complex_special_forms.$sym56$_STRUCTURE_SLOT, object,
											complex_special_forms.$list57),
									type_var));
			} else
				cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list52);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17487)
	public static SubLObject _defstruct_set_slot(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject object = CommonSymbols.NIL;
			SubLObject index = CommonSymbols.NIL;
			SubLObject value = CommonSymbols.NIL;
			SubLObject type = CommonSymbols.NIL;
			SubLObject slot = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
			object = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
			index = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
			value = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
			type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
			slot = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current)
				return ConsesLow.list(complex_special_forms.$sym60$_SET_STRUCTURE_SLOT, object, index, value);
			else
				cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list59);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12816)
	public static SubLObject accessor_package(SubLObject accessor) {
		return complex_special_forms.getter_package(accessor);
	}

	/** Given one type, this method builds the right call to register-method. */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6392)
	public static SubLObject build_regmethod_call(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		{
			SubLObject dtp_var = complex_special_forms.dtp_var(type);
			return ConsesLow.list(complex_special_forms.$sym14$_REGISTER_METHOD, method_table, dtp_var,
					ConsesLow.list(complex_special_forms.$sym15$FUNCTION, method_function));
		}
	}

	/**
	 * This function builds a list of _register-method calls, as appropriate for
	 * the type.
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6646)
	public static SubLObject build_regmethod_list(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject reglist = CommonSymbols.NIL;
				SubLObject alias_list = conses_high.second(conses_high.assoc(Symbols.symbol_name(type),
						complex_special_forms.$polymorphic_type_hierarchy$.getDynamicValue(thread),
						Symbols.symbol_function(complex_special_forms.$sym16$STRING_), CommonSymbols.UNPROVIDED));
				if (CommonSymbols.NIL != alias_list) {
					SubLObject cdolist_list_var = alias_list;
					SubLObject curr = CommonSymbols.NIL;
					for (curr = cdolist_list_var
							.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
									.rest(), curr = cdolist_list_var.first())
						reglist = ConsesLow.cons(
								complex_special_forms.build_regmethod_call(curr, method_table, method_function),
								reglist);
				} else
					reglist = ConsesLow
							.list(complex_special_forms.build_regmethod_call(type, method_table, method_function));
				return reglist;
			}
		}
	}

	public static SubLObject declare_complex_special_forms_file() {
		SubLFiles.declareFunction(complex_special_forms.myName, "intern_accessor", "INTERN-ACCESSOR", 1, 0, false);
		SubLFiles.declareMacro(complex_special_forms.myName, "defpolymorphic", "DEFPOLYMORPHIC");
		SubLFiles.declareMacro(complex_special_forms.myName, "define_method", "DEFINE-METHOD");
		SubLFiles.declareFunction(complex_special_forms.myName, "defpolymorphic_internal", "DEFPOLYMORPHIC-INTERNAL", 3,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "define_method_internal", "DEFINE-METHOD-INTERNAL", 3,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "build_regmethod_call", "BUILD-REGMETHOD-CALL", 3, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "build_regmethod_list", "BUILD-REGMETHOD-LIST", 3, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "method_table_var", "METHOD-TABLE-VAR", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "method_function_var", "METHOD-FUNCTION-VAR", 2, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "dtp_var", "DTP-VAR", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "full_formal_parameter_list",
				"FULL-FORMAL-PARAMETER-LIST", 1, 0, false);
		SubLFiles.declareMacro(complex_special_forms.myName, "defstruct", "DEFSTRUCT");
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_analyze", "DEFSTRUCT-ANALYZE", 3, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_conc_name", "DEFSTRUCT-CONC-NAME", 2, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_predicate", "DEFSTRUCT-PREDICATE", 1, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_constructor", "DEFSTRUCT-CONSTRUCTOR", 1, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_host_fn_name", "DEFSTRUCT-HOST-FN-NAME", 1,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_type_var", "DEFSTRUCT-TYPE-VAR", 1, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_slot_keywords", "DEFSTRUCT-SLOT-KEYWORDS", 1,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getters", "DEFSTRUCT-GETTERS", 2, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getter", "DEFSTRUCT-GETTER", 2, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_setters", "DEFSTRUCT-SETTERS", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_setter", "DEFSTRUCT-SETTER", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "getter_package", "GETTER-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "accessor_package", "ACCESSOR-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "setter_from_accessor", "SETTER-FROM-ACCESSOR", 1, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_lisp_constructor",
				"DEFSTRUCT-LISP-CONSTRUCTOR", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_expand", "DEFSTRUCT-EXPAND", 1, 0, false);
		SubLFiles.declareMacro(complex_special_forms.myName, "_defstruct_object_p", "_DEFSTRUCT-OBJECT-P");
		SubLFiles.declareMacro(complex_special_forms.myName, "_defstruct_get_slot", "_DEFSTRUCT-GET-SLOT");
		SubLFiles.declareMacro(complex_special_forms.myName, "_defstruct_set_slot", "_DEFSTRUCT-SET-SLOT");
		SubLFiles.declareMacro(complex_special_forms.myName, "_defstruct_construct", "_DEFSTRUCT-CONSTRUCT");
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_type_var_form", "DEFSTRUCT-TYPE-VAR-FORM", 3,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_print_method", "DEFSTRUCT-PRINT-METHOD", 2,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_print_forms", "DEFSTRUCT-PRINT-FORMS", 4, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_register_form", "DEFSTRUCT-REGISTER-FORM", 4,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_predicate_form", "DEFSTRUCT-PREDICATE-FORM",
				4, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_predicate_arglist",
				"DEFSTRUCT-PREDICATE-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_predicate_variable",
				"DEFSTRUCT-PREDICATE-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_first_function_variable",
				"DEFSTRUCT-FIRST-FUNCTION-VARIABLE", 2, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getter_forms", "DEFSTRUCT-GETTER-FORMS", 5,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getter_form", "DEFSTRUCT-GETTER-FORM", 5, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getter_arglist", "DEFSTRUCT-GETTER-ARGLIST",
				1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_getter_variable",
				"DEFSTRUCT-GETTER-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_setter_forms", "DEFSTRUCT-SETTER-FORMS", 5,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_setter_form", "DEFSTRUCT-SETTER-FORM", 5, 0,
				false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_setter_arglist", "DEFSTRUCT-SETTER-ARGLIST",
				1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_def_csetf_forms",
				"DEFSTRUCT-DEF-CSETF-FORMS", 2, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_constructor_form",
				"DEFSTRUCT-CONSTRUCTOR-FORM", 6, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_constructor_arglist",
				"DEFSTRUCT-CONSTRUCTOR-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_constructor_arglist_handler",
				"DEFSTRUCT-CONSTRUCTOR-ARGLIST-HANDLER", 4, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_host_function", "DEFSTRUCT-HOST-FUNCTION", 5,
				0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "defstruct_host_arglist", "DEFSTRUCT-HOST-ARGLIST", 0,
				0, false);
		SubLFiles.declareMacro(complex_special_forms.myName, "with_call_profiling", "WITH-CALL-PROFILING");
		SubLFiles.declareFunction(complex_special_forms.myName, "possibly_note_function_entry",
				"POSSIBLY-NOTE-FUNCTION-ENTRY", 1, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "initialize_call_profiling_table",
				"INITIALIZE-CALL-PROFILING-TABLE", 0, 0, false);
		SubLFiles.declareFunction(complex_special_forms.myName, "finalize_call_profiling_table",
				"FINALIZE-CALL-PROFILING-TABLE", 1, 0, false);
		return CommonSymbols.NIL;
	}

	/**
	 * Defines a method for the polymorphic function <name> that runs if
	 * <dispatch-arg> is of type <type>. The lambda list must have the same
	 * structure as in the DEFPOLYMORPHIC call.
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 2821)
	public static SubLObject define_method(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject name = CommonSymbols.NIL;
			SubLObject lambda_list = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
			name = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
			lambda_list = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				return complex_special_forms.define_method_internal(name, lambda_list, body);
			}
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 5546)
	public static SubLObject define_method_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		{
			SubLObject type = conses_high.second(arglist.first());
			SubLObject plain_args = reader.bq_cons(arglist.first().first(),
					ConsesLow.append(arglist.rest(), CommonSymbols.NIL));
			SubLObject method_table_var = complex_special_forms.method_table_var(name);
			SubLObject method_function = complex_special_forms.method_function_var(name, type);
			SubLObject regmethod_list = complex_special_forms.build_regmethod_list(type, method_table_var,
					method_function);
			return ConsesLow.listS(complex_special_forms.$sym2$PROGN,
					ConsesLow.list(complex_special_forms.$sym11$DECLAIM,
							ConsesLow.list(complex_special_forms.$sym12$OPTIMIZE_FUNCALL, method_function)),
					ConsesLow.listS(complex_special_forms.$sym5$DEFINE, method_function, plain_args,
							ConsesLow.append(body, CommonSymbols.NIL)),
					ConsesLow.append(regmethod_list, CommonSymbols.NIL));
		}
	}

	/**
	 * Defines a new polymorphic function that dispatches on the type of its
	 * first argument. <body> defines a default method. The function
	 * define-method can be used to define additional methods. For example:
	 *
	 * (defpolymorphic test (a b) (list a b))
	 *
	 * (define-method test ((a cons) b) (cons b a))
	 *
	 * (define-method test ((a fixnum) b) (+ a b))
	 *
	 * The defpolymorphic form defines the function TEST with a default method.
	 * The two define-method forms specialize the behavior of TEST for lists and
	 * fixnums. sin (test 'foo 'bar) => (FOO BAR) (test '(foo) 'bar) => (BAR
	 * FOO) (test 2 3) => 5
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 1167)
	public static SubLObject defpolymorphic(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject name = CommonSymbols.NIL;
			SubLObject lambda_list = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
			name = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
			lambda_list = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				return complex_special_forms.defpolymorphic_internal(name, lambda_list, body);
			}
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 4758)
	public static SubLObject defpolymorphic_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		{
			SubLObject method_table_var = complex_special_forms.method_table_var(name);
			SubLObject method_function_var = Symbols.make_symbol(complex_special_forms.$str1$METHOD_FUNCTION);
			SubLObject doc_string = CommonSymbols.NIL;
			if (body.first().isString()) {
				doc_string = ConsesLow.list(body.first());
				body = body.rest();
			}
			return ConsesLow.list(complex_special_forms.$sym2$PROGN,
					ConsesLow.listS(complex_special_forms.$sym3$DEFLEXICAL, method_table_var,
							complex_special_forms.$list4),
					ConsesLow.listS(complex_special_forms.$sym5$DEFINE, name, arglist,
							ConsesLow.append(doc_string,
									ConsesLow.list(ConsesLow.listS(complex_special_forms.$sym6$CLET,
											ConsesLow.list(ConsesLow.list(method_function_var,
													ConsesLow.list(complex_special_forms.$sym7$_METHOD, arglist.first(),
															method_table_var))),
											ConsesLow.list(complex_special_forms.$sym8$PWHEN, method_function_var,
													ConsesLow.list(complex_special_forms.$sym9$RET,
															ConsesLow.listS(complex_special_forms.$sym10$FUNCALL,
																	method_function_var,
																	ConsesLow.append(complex_special_forms
																			.full_formal_parameter_list(arglist),
																			CommonSymbols.NIL)))),
											ConsesLow.append(body, CommonSymbols.NIL))))));
		}
	}

	/**
	 * Like Common Lisp defstruct except: (1) slot initializations are not
	 * allowed.
	 *
	 * (2) there is an option: (:c-structure-tag val), where val is an integer
	 * between 128-255. If you add a new defstruct, and you want efficient C
	 * code support, you must have the person who maintains the Sublisp Run-Time
	 * Library (RTL) add the tag by hand.
	 *
	 * (3) the only other options: (:conc-name whatever) (:print-function
	 * #'whatever) (:generate-visit-function? T-or-NIL)
	 *
	 * the default structure print function is default-struct-print-function :
	 * object stream depth
	 *
	 * (4) The make constructor takes an argument list, which is expected to
	 * have the keyword/value pairs, i.e. (make-foo :a 1 :b 2) in common lisp is
	 * (make-foo '(:a 1 :b 2)) for us.
	 *
	 * (5) Reading of structures is not supported by the reader.
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 8093)
	public static SubLObject defstruct(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list24);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject name = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list24);
					name = current.first();
					current = current.rest();
					{
						SubLObject options = current;
						current = temp;
						{
							SubLObject slots = current;
							SubLObject analysis = complex_special_forms.defstruct_analyze(name, options, slots);
							return complex_special_forms.defstruct_expand(analysis);
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 9599)
	public static SubLObject defstruct_analyze(SubLObject name, SubLObject options, SubLObject slots) {
		SubLTrampolineFile.checkType(name, complex_special_forms.$sym25$SYMBOLP);
		{
			SubLObject conc_name = conses_high.second(conses_high.assoc(complex_special_forms.$kw26$CONC_NAME, options,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			SubLObject print_function = conses_high.second(conses_high.assoc(complex_special_forms.$kw27$PRINT_FUNCTION,
					options, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			SubLObject c_structure_tag = conses_high
					.second(conses_high.assoc(complex_special_forms.$kw28$C_STRUCTURE_TAG, options,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			SubLObject make_visit_fnP = conses_high
					.second(conses_high.assoc(complex_special_forms.$kw29$GENERATE_VISIT_FUNCTION_, options,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
			conc_name = complex_special_forms.defstruct_conc_name(name, conc_name);
			{
				SubLObject predicate = complex_special_forms.defstruct_predicate(name);
				SubLObject constructor = complex_special_forms.defstruct_constructor(name);
				SubLObject type_var = complex_special_forms.defstruct_type_var(name);
				SubLObject slot_keywords = complex_special_forms.defstruct_slot_keywords(slots);
				SubLObject getters = complex_special_forms.defstruct_getters(conc_name, slots);
				SubLObject setters = complex_special_forms.defstruct_setters(getters);
				SubLObject host_fn_name = complex_special_forms.defstruct_host_fn_name(name);
				return ConsesLow.listS(complex_special_forms.$kw30$NAME, name, ConsesLow.append(
						new SubLObject[] {
								CommonSymbols.NIL != conc_name
										? (SubLObject) ConsesLow.list(complex_special_forms.$kw26$CONC_NAME, conc_name)
										: CommonSymbols.NIL,
								CommonSymbols.NIL != print_function
										? (SubLObject) ConsesLow.list(complex_special_forms.$kw27$PRINT_FUNCTION,
												print_function)
										: CommonSymbols.NIL,
								CommonSymbols.NIL != c_structure_tag ? (SubLObject) ConsesLow
										.list(complex_special_forms.$kw28$C_STRUCTURE_TAG, c_structure_tag)
										: CommonSymbols.NIL,
								CommonSymbols.NIL != make_visit_fnP
										? (SubLObject) ConsesLow.list(
												complex_special_forms.$kw29$GENERATE_VISIT_FUNCTION_, make_visit_fnP,
												complex_special_forms.$kw31$HOST_FN_NAME, host_fn_name)
										: CommonSymbols.NIL,
								ConsesLow.list(new SubLObject[] { complex_special_forms.$kw32$PREDICATE, predicate,
										complex_special_forms.$kw33$CONSTRUCTOR, constructor,
										complex_special_forms.$kw34$TYPE_VAR, type_var,
										complex_special_forms.$kw35$SLOTS, slots,
										complex_special_forms.$kw36$SLOT_KEYWORDS, slot_keywords,
										complex_special_forms.$kw37$GETTERS, getters,
										complex_special_forms.$kw38$SETTERS, setters }) }));
			}
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 10983)
	public static SubLObject defstruct_conc_name(SubLObject name, SubLObject conc_name) {
		if (CommonSymbols.NIL != conc_name)
			return conc_name;
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), complex_special_forms.$str19$_));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11232)
	public static SubLObject defstruct_constructor(SubLObject name) {
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str40$MAKE_, Symbols.symbol_name(name)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22894)
	public static SubLObject defstruct_constructor_arglist(SubLObject constructor) {
		return complex_special_forms.$list84;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23000)
	public static SubLObject defstruct_constructor_arglist_handler(SubLObject arglist_var, SubLObject new_var,
			SubLObject slot_keywords, SubLObject setters) {
		{
			SubLObject current_value = Symbols.make_symbol(complex_special_forms.$str85$CURRENT_VALUE);
			SubLObject current_arg = Symbols.make_symbol(complex_special_forms.$str86$CURRENT_ARG);
			SubLObject next = Symbols.make_symbol(complex_special_forms.$str87$NEXT);
			SubLObject gencaseslots = CommonSymbols.NIL;
			SubLObject cdotimes_end_var = Sequences.length(slot_keywords);
			SubLObject n = CommonSymbols.NIL;
			for (n = CommonSymbols.ZERO_INTEGER; n
					.numL(cdotimes_end_var); n = Numbers.add(n, CommonSymbols.ONE_INTEGER)) {
				SubLObject slot_keyword = ConsesLow.nth(n, slot_keywords);
				SubLObject setter = ConsesLow.nth(n, setters);
				gencaseslots = ConsesLow.cons(
						ConsesLow.list(slot_keyword, ConsesLow.list(setter, new_var, current_value)), gencaseslots);
			}
			gencaseslots = ConsesLow.cons(
					ConsesLow.list(complex_special_forms.$sym88$OTHERWISE,
							ConsesLow.list(complex_special_forms.$sym89$ERROR,
									complex_special_forms.$str90$Invalid_slot__S_for_construction_, current_arg)),
					gencaseslots);
			return ConsesLow.list(complex_special_forms.$sym91$CDO,
					ConsesLow.list(
							ConsesLow.list(next, arglist_var, ConsesLow.list(complex_special_forms.$sym92$CDDR, next))),
					ConsesLow.list(ConsesLow.list(complex_special_forms.$sym93$NULL, next)),
					ConsesLow.list(complex_special_forms.$sym6$CLET,
							ConsesLow.list(
									ConsesLow.list(current_arg, ConsesLow.list(complex_special_forms.$sym94$CAR, next)),
									ConsesLow.list(current_value,
											ConsesLow.list(complex_special_forms.$sym95$CADR, next))),
							ConsesLow.listS(complex_special_forms.$sym96$PCASE, current_arg,
									ConsesLow.append(Sequences.nreverse(gencaseslots), CommonSymbols.NIL))));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22263)
	public static SubLObject defstruct_constructor_form(SubLObject type, SubLObject constructor,
			SubLObject c_structure_tag, SubLObject type_var, SubLObject slot_keywords, SubLObject setters) {
		{
			SubLObject arglist = complex_special_forms.defstruct_constructor_arglist(constructor);
			SubLObject arglist_var = conses_high.second(arglist);
			SubLObject new_var = complex_special_forms.$sym82$NEW;
			SubLObject size = Sequences.length(slot_keywords);
			SubLObject arglist_handler = complex_special_forms.defstruct_constructor_arglist_handler(arglist_var,
					new_var, slot_keywords, setters);
			return ConsesLow.list(complex_special_forms.$sym5$DEFINE, constructor, arglist,
					ConsesLow.list(complex_special_forms.$sym6$CLET,
							ConsesLow.list(ConsesLow.list(new_var,
									ConsesLow.list(complex_special_forms.$sym83$_DEFSTRUCT_CONSTRUCT, c_structure_tag,
											size, type_var, type))),
							arglist_handler, ConsesLow.list(complex_special_forms.$sym9$RET, new_var)));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21877)
	public static SubLObject defstruct_def_csetf_forms(SubLObject getters, SubLObject setters) {
		{
			SubLObject forms = CommonSymbols.NIL;
			SubLObject rest_getters = CommonSymbols.NIL;
			SubLObject rest_setters = CommonSymbols.NIL;
			SubLObject getter = CommonSymbols.NIL;
			SubLObject setter = CommonSymbols.NIL;
			for (rest_getters = getters, rest_setters = setters, getter = rest_getters.first(), setter = rest_setters
					.first(); CommonSymbols.NIL != rest_getters; rest_getters = rest_getters
							.rest(), rest_setters = rest_setters
									.rest(), getter = rest_getters.first(), setter = rest_setters.first())
				forms = ConsesLow.cons(ConsesLow.list(complex_special_forms.$sym81$_DEF_CSETF,
						ConsesLow.list(complex_special_forms.$sym50$QUOTE, getter),
						ConsesLow.list(complex_special_forms.$sym50$QUOTE, setter)), forms);
			return Sequences.nreverse(forms);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 14988)
	public static SubLObject defstruct_expand(SubLObject analysis) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = analysis;
				SubLObject current = datum;
				SubLObject allow_other_keys_p = CommonSymbols.NIL;
				SubLObject rest = current;
				SubLObject bad = CommonSymbols.NIL;
				SubLObject current_1 = CommonSymbols.NIL;
				for (; CommonSymbols.NIL != rest;) {
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, complex_special_forms.$list46);
					current_1 = rest.first();
					rest = rest.rest();
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, complex_special_forms.$list46);
					if (CommonSymbols.NIL == conses_high.member(current_1, complex_special_forms.$list47,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
						bad = CommonSymbols.T;
					if (current_1 == complex_special_forms.$kw48$ALLOW_OTHER_KEYS)
						allow_other_keys_p = rest.first();
					rest = rest.rest();
				}
				if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
					cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list46);
				{
					SubLObject name_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw30$NAME,
							current);
					SubLObject name = CommonSymbols.NIL != name_tail ? (SubLObject) conses_high.cadr(name_tail)
							: CommonSymbols.NIL;
					SubLObject conc_name_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw26$CONC_NAME, current);
					SubLObject conc_name = CommonSymbols.NIL != conc_name_tail
							? (SubLObject) conses_high.cadr(conc_name_tail) : CommonSymbols.NIL;
					SubLObject print_function_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw27$PRINT_FUNCTION, current);
					SubLObject print_function = CommonSymbols.NIL != print_function_tail
							? (SubLObject) conses_high.cadr(print_function_tail) : CommonSymbols.NIL;
					SubLObject c_structure_tag_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw28$C_STRUCTURE_TAG, current);
					SubLObject c_structure_tag = CommonSymbols.NIL != c_structure_tag_tail
							? (SubLObject) conses_high.cadr(c_structure_tag_tail) : CommonSymbols.NIL;
					SubLObject generate_visit_functionP_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw29$GENERATE_VISIT_FUNCTION_, current);
					SubLObject generate_visit_functionP = CommonSymbols.NIL != generate_visit_functionP_tail
							? (SubLObject) conses_high.cadr(generate_visit_functionP_tail) : CommonSymbols.NIL;
					SubLObject predicate_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw32$PREDICATE, current);
					SubLObject predicate = CommonSymbols.NIL != predicate_tail
							? (SubLObject) conses_high.cadr(predicate_tail) : CommonSymbols.NIL;
					SubLObject constructor_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw33$CONSTRUCTOR, current);
					SubLObject constructor = CommonSymbols.NIL != constructor_tail
							? (SubLObject) conses_high.cadr(constructor_tail) : CommonSymbols.NIL;
					SubLObject host_fn_name_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw31$HOST_FN_NAME, current);
					SubLObject host_fn_name = CommonSymbols.NIL != host_fn_name_tail
							? (SubLObject) conses_high.cadr(host_fn_name_tail) : CommonSymbols.NIL;
					SubLObject type_var_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw34$TYPE_VAR, current);
					SubLObject type_var = CommonSymbols.NIL != type_var_tail
							? (SubLObject) conses_high.cadr(type_var_tail) : CommonSymbols.NIL;
					SubLObject slots_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw35$SLOTS,
							current);
					SubLObject slots = CommonSymbols.NIL != slots_tail ? (SubLObject) conses_high.cadr(slots_tail)
							: CommonSymbols.NIL;
					SubLObject slot_keywords_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw36$SLOT_KEYWORDS, current);
					SubLObject slot_keywords = CommonSymbols.NIL != slot_keywords_tail
							? (SubLObject) conses_high.cadr(slot_keywords_tail) : CommonSymbols.NIL;
					SubLObject getters_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw37$GETTERS, current);
					SubLObject getters = CommonSymbols.NIL != getters_tail ? (SubLObject) conses_high.cadr(getters_tail)
							: CommonSymbols.NIL;
					SubLObject setters_tail = cdestructuring_bind
							.property_list_member(complex_special_forms.$kw38$SETTERS, current);
					SubLObject setters = CommonSymbols.NIL != setters_tail ? (SubLObject) conses_high.cadr(setters_tail)
							: CommonSymbols.NIL;
					if (CommonSymbols.NIL != Sequences.find(complex_special_forms.$kw49$SL2JAVA,
							reader.$features$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
						c_structure_tag = CommonSymbols.NIL;
					{
						SubLObject type_var_form = complex_special_forms.defstruct_type_var_form(type_var, name,
								c_structure_tag);
						SubLObject print_method = complex_special_forms.defstruct_print_method(name, print_function);
						SubLObject print_forms = complex_special_forms.defstruct_print_forms(c_structure_tag, type_var,
								print_function, print_method);
						SubLObject register_form = complex_special_forms.defstruct_register_form(name, c_structure_tag,
								slots, print_method);
						SubLObject predicate_form = complex_special_forms.defstruct_predicate_form(name, predicate,
								c_structure_tag, type_var);
						SubLObject getter_forms = complex_special_forms.defstruct_getter_forms(name, c_structure_tag,
								predicate, slots, getters);
						SubLObject setter_forms = complex_special_forms.defstruct_setter_forms(name, c_structure_tag,
								predicate, slots, setters);
						SubLObject def_csetf_forms = complex_special_forms.defstruct_def_csetf_forms(getters, setters);
						SubLObject host_fn_form = CommonSymbols.NIL != generate_visit_functionP
								? (SubLObject) complex_special_forms.defstruct_host_function(name, host_fn_name,
										constructor, slot_keywords, getters)
								: CommonSymbols.NIL;
						SubLObject constructor_form = complex_special_forms.defstruct_constructor_form(name,
								constructor, c_structure_tag, type_var, slot_keywords, setters);
						return ConsesLow.listS(complex_special_forms.$sym2$PROGN, type_var_form,
								ConsesLow.append(print_forms,
										CommonSymbols.NIL != register_form ? (SubLObject) ConsesLow.list(register_form)
												: CommonSymbols.NIL,
										ConsesLow.listS(
												ConsesLow.list(complex_special_forms.$sym11$DECLAIM, ConsesLow.list(
														complex_special_forms.$sym12$OPTIMIZE_FUNCALL, predicate)),
												predicate_form,
												ConsesLow.append(getter_forms, setter_forms, def_csetf_forms,
														ConsesLow.list(constructor_form,
																ConsesLow.list(CommonSymbols.IDENTITY, ConsesLow.list(
																		complex_special_forms.$sym50$QUOTE, name)),
																CommonSymbols.NIL != generate_visit_functionP
																		? (SubLObject) host_fn_form
																		: complex_special_forms.$list51)))));
					}
				}
			}
		}
	}

	/**
	 * return a symbol to use as the first variable in the arglist of FUNCTION
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19819)
	public static SubLObject defstruct_first_function_variable(SubLObject function, SubLObject v_default) {
		return v_default;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12011)
	public static SubLObject defstruct_getter(SubLObject conc_name, SubLObject slot) {
		return complex_special_forms.intern_accessor(
				Strings.string_upcase(Sequences.cconcatenate(Symbols.symbol_name(conc_name), Symbols.symbol_name(slot)),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20842)
	public static SubLObject defstruct_getter_arglist(SubLObject getter) {
		return ConsesLow.list(complex_special_forms.defstruct_getter_variable(getter));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20544)
	public static SubLObject defstruct_getter_form(SubLObject getter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		{
			SubLObject arglist = complex_special_forms.defstruct_getter_arglist(getter);
			SubLObject getter_var = arglist.first();
			return ConsesLow.list(complex_special_forms.$sym5$DEFINE, getter, arglist,
					ConsesLow.list(complex_special_forms.$sym77$CHECK_TYPE, getter_var, predicate),
					ConsesLow.list(complex_special_forms.$sym9$RET, ConsesLow
							.list(complex_special_forms.$sym78$_DEFSTRUCT_GET_SLOT, getter_var, index, type, slot)));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20131)
	public static SubLObject defstruct_getter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject getters) {
		{
			SubLObject forms = CommonSymbols.NIL;
			SubLObject cdotimes_end_var = Sequences.length(getters);
			SubLObject i = CommonSymbols.NIL;
			for (i = CommonSymbols.ZERO_INTEGER; i
					.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				SubLObject slot = ConsesLow.nth(i, slots);
				SubLObject getter = ConsesLow.nth(i, getters);
				SubLObject index = CommonSymbols.NIL != c_structure_tag ? (SubLObject) i
						: Numbers.add(i, CommonSymbols.TWO_INTEGER);
				forms = ConsesLow
						.cons(complex_special_forms.defstruct_getter_form(getter, index, predicate, type, slot), forms);
			}
			return Sequences.nreverse(forms);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20933)
	public static SubLObject defstruct_getter_variable(SubLObject getter) {
		return complex_special_forms.defstruct_first_function_variable(getter, complex_special_forms.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11800)
	public static SubLObject defstruct_getters(SubLObject conc_name, SubLObject slots) {
		{
			SubLObject getters = CommonSymbols.NIL;
			SubLObject cdolist_list_var = slots;
			SubLObject slot = CommonSymbols.NIL;
			for (slot = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), slot = cdolist_list_var.first()) {
				SubLObject getter = complex_special_forms.defstruct_getter(conc_name, slot);
				getters = ConsesLow.cons(getter, getters);
			}
			return Sequences.nreverse(getters);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 24929)
	public static SubLObject defstruct_host_arglist() {
		return complex_special_forms.$list104;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11339)
	public static SubLObject defstruct_host_fn_name(SubLObject name) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(complex_special_forms.$str41$VISIT_DEFSTRUCT_, Symbols.symbol_name(name)));
	}

	/** Returns the form for the visitation of a structure object. */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23810)
	public static SubLObject defstruct_host_function(SubLObject type_name, SubLObject host_fn,
			SubLObject constructor_fn, SubLObject slot_keywords, SubLObject getters) {
		{
			SubLObject arglist = complex_special_forms.defstruct_host_arglist();
			SubLObject object_arg = arglist.first();
			SubLObject visitor_fn_arg = conses_high.second(arglist);
			SubLObject size = Sequences.length(slot_keywords);
			SubLObject statements = CommonSymbols.NIL;
			statements = ConsesLow.cons(
					ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg, object_arg,
							complex_special_forms.$kw97$BEGIN,
							ConsesLow.list(complex_special_forms.$sym50$QUOTE, constructor_fn), size),
					statements);
			{
				SubLObject index = CommonSymbols.NIL;
				for (index = CommonSymbols.ZERO_INTEGER; index
						.numL(size); index = Numbers.add(index, CommonSymbols.ONE_INTEGER)) {
					SubLObject slot_keyword = ConsesLow.nth(index, slot_keywords);
					SubLObject slot_getter = ConsesLow.nth(index, getters);
					statements = ConsesLow.cons(ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg,
							object_arg, complex_special_forms.$kw98$SLOT, slot_keyword,
							ConsesLow.list(slot_getter, object_arg)), statements);
				}
			}
			statements = ConsesLow.cons(
					ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg, object_arg,
							complex_special_forms.$kw99$END,
							ConsesLow.list(complex_special_forms.$sym50$QUOTE, constructor_fn), size),
					statements);
			statements = Sequences.nreverse(statements);
			return ConsesLow.list(complex_special_forms.$sym2$PROGN,
					ConsesLow.list(complex_special_forms.$sym5$DEFINE, host_fn, arglist,
							reader.bq_cons(complex_special_forms.$sym2$PROGN,
									ConsesLow.append(statements, CommonSymbols.NIL)),
							ConsesLow.list(complex_special_forms.$sym9$RET, object_arg)),
					ConsesLow.list(complex_special_forms.$sym100$DEFINE_METHOD,
							complex_special_forms.$sym101$VISIT_DEFSTRUCT_OBJECT,
							reader.bq_cons(ConsesLow.list(complex_special_forms.$sym102$OBJ, type_name),
									complex_special_forms.$list103),
							ConsesLow.list(complex_special_forms.$sym9$RET,
									reader.bq_cons(host_fn, complex_special_forms.$list104))));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13045)
	public static SubLObject defstruct_lisp_constructor(SubLObject constructor) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(Symbols.symbol_name(constructor), complex_special_forms.$str45$_1));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11130)
	public static SubLObject defstruct_predicate(SubLObject name) {
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), complex_special_forms.$str39$_P));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19601)
	public static SubLObject defstruct_predicate_arglist(SubLObject predicate) {
		return ConsesLow.list(complex_special_forms.defstruct_predicate_variable(predicate));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19301)
	public static SubLObject defstruct_predicate_form(SubLObject type, SubLObject predicate, SubLObject c_structure_tag,
			SubLObject type_var) {
		{
			SubLObject arglist = complex_special_forms.defstruct_predicate_arglist(predicate);
			SubLObject predicate_var = arglist.first();
			return ConsesLow.list(complex_special_forms.$sym5$DEFINE, predicate, arglist,
					ConsesLow.list(complex_special_forms.$sym9$RET,
							ConsesLow.list(complex_special_forms.$sym75$_DEFSTRUCT_OBJECT_P, predicate_var,
									c_structure_tag, type_var, type)));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19706)
	public static SubLObject defstruct_predicate_variable(SubLObject predicate) {
		return complex_special_forms.defstruct_first_function_variable(predicate, complex_special_forms.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18562)
	public static SubLObject defstruct_print_forms(SubLObject c_structure_tag, SubLObject tag_var,
			SubLObject print_function, SubLObject print_method) {
		if (CommonSymbols.NIL == print_function)
			print_function = complex_special_forms.$sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
		return ConsesLow
				.listS(ConsesLow.list(complex_special_forms.$sym11$DECLAIM, ConsesLow.list(
						complex_special_forms.$sym69$FACCESS, complex_special_forms.$sym70$PRIVATE, print_method)),
						ConsesLow.list(complex_special_forms.$sym5$DEFINE, print_method, complex_special_forms.$list71,
								reader.bq_cons(print_function, complex_special_forms.$list72)),
						ConsesLow.append(
								CommonSymbols.NIL != c_structure_tag ? (SubLObject) CommonSymbols.NIL
										: ConsesLow.list(ConsesLow.list(complex_special_forms.$sym14$_REGISTER_METHOD,
												complex_special_forms.$sym73$_PRINT_OBJECT_METHOD_TABLE_, tag_var,
												ConsesLow.list(complex_special_forms.$sym15$FUNCTION, print_method))),
								CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18392)
	public static SubLObject defstruct_print_method(SubLObject name, SubLObject print_function) {
		return complex_special_forms.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name),
				complex_special_forms.$str67$_PRINT_FUNCTION_TRAMPOLINE));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19045)
	public static SubLObject defstruct_register_form(SubLObject name, SubLObject c_structure_tag, SubLObject slots,
			SubLObject print_method) {
		if (CommonSymbols.NIL != c_structure_tag)
			return ConsesLow.list(complex_special_forms.$sym74$_REGISTER_DEFSTRUCT, Symbols.symbol_name(name),
					c_structure_tag, Sequences.length(slots),
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, print_method),
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, slots));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12354)
	public static SubLObject defstruct_setter(SubLObject getter) {
		{
			SubLObject getter_name = Symbols.symbol_name(getter);
			SubLObject getter_package = complex_special_forms.getter_package(getter);
			SubLObject setter_name = Sequences.cconcatenate(complex_special_forms.$str42$_CSETF_, getter_name);
			SubLObject setter_package = getter_package;
			return Packages.intern(setter_name, setter_package);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21791)
	public static SubLObject defstruct_setter_arglist(SubLObject setter) {
		return complex_special_forms.$list80;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21449)
	public static SubLObject defstruct_setter_form(SubLObject setter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		{
			SubLObject arglist = complex_special_forms.defstruct_setter_arglist(setter);
			SubLObject object_var = arglist.first();
			SubLObject value_var = conses_high.second(arglist);
			return ConsesLow.list(complex_special_forms.$sym5$DEFINE, setter, arglist,
					ConsesLow.list(complex_special_forms.$sym77$CHECK_TYPE, object_var, predicate),
					ConsesLow.list(complex_special_forms.$sym9$RET,
							ConsesLow.list(complex_special_forms.$sym79$_DEFSTRUCT_SET_SLOT, object_var, index,
									value_var, type, slot)));
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21037)
	public static SubLObject defstruct_setter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject setters) {
		{
			SubLObject forms = CommonSymbols.NIL;
			SubLObject cdotimes_end_var = Sequences.length(setters);
			SubLObject i = CommonSymbols.NIL;
			for (i = CommonSymbols.ZERO_INTEGER; i
					.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				SubLObject slot = ConsesLow.nth(i, slots);
				SubLObject setter = ConsesLow.nth(i, setters);
				SubLObject index = CommonSymbols.NIL != c_structure_tag ? (SubLObject) i
						: Numbers.add(i, CommonSymbols.TWO_INTEGER);
				forms = ConsesLow
						.cons(complex_special_forms.defstruct_setter_form(setter, index, predicate, type, slot), forms);
			}
			return Sequences.nreverse(forms);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12155)
	public static SubLObject defstruct_setters(SubLObject getters) {
		{
			SubLObject setters = CommonSymbols.NIL;
			SubLObject cdolist_list_var = getters;
			SubLObject getter = CommonSymbols.NIL;
			for (getter = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), getter = cdolist_list_var.first()) {
				SubLObject setter = complex_special_forms.defstruct_setter(getter);
				setters = ConsesLow.cons(setter, setters);
			}
			return Sequences.nreverse(setters);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11566)
	public static SubLObject defstruct_slot_keywords(SubLObject slots) {
		{
			SubLObject slot_keywords = CommonSymbols.NIL;
			SubLObject cdolist_list_var = slots;
			SubLObject slot = CommonSymbols.NIL;
			for (slot = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), slot = cdolist_list_var.first()) {
				SubLObject slot_keyword = Symbols.make_keyword(Symbols.symbol_name(slot));
				slot_keywords = ConsesLow.cons(slot_keyword, slot_keywords);
			}
			return Sequences.nreverse(slot_keywords);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11458)
	public static SubLObject defstruct_type_var(SubLObject name) {
		return complex_special_forms.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str21$_DTP_,
				new SubLObject[] { Symbols.symbol_name(name), complex_special_forms.$str17$_ }));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17972)
	public static SubLObject defstruct_type_var_form(SubLObject type_var, SubLObject name, SubLObject c_structure_tag) {
		return ConsesLow.list(complex_special_forms.$sym66$DEFCONSTANT, type_var, CommonSymbols.NIL != c_structure_tag
				? (SubLObject) c_structure_tag : ConsesLow.list(complex_special_forms.$sym50$QUOTE, name));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7569)
	public static SubLObject dtp_var(SubLObject name) {
		{
			SubLObject symbol = complex_special_forms
					.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str21$_DTP_,
							new SubLObject[] { Symbols.symbol_name(name), complex_special_forms.$str17$_ }));
			return symbol;
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25990)
	public static SubLObject finalize_call_profiling_table(SubLObject table) {
		{
			SubLObject pairs = CommonSymbols.NIL;
			SubLObject function = CommonSymbols.NIL;
			SubLObject count = CommonSymbols.NIL;
			{
				Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
				try {
					while (Hashtables.iteratorHasNext(cdohash_iterator)) {
						Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
						function = Hashtables.getEntryKey(cdohash_entry);
						count = Hashtables.getEntryValue(cdohash_entry);
						pairs = ConsesLow.cons(ConsesLow.cons(function, count), pairs);
					}
				} finally {
					Hashtables.releaseEntrySetIterator(cdohash_iterator);
				}
			}
			pairs = Sort.sort(pairs, Symbols.symbol_function(complex_special_forms.$sym111$_),
					Symbols.symbol_function(complex_special_forms.$sym112$CDR));
			return pairs;
		}
	}

	/** Given a function ARGLIST, return a list of all the formal parameters */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7762)
	public static SubLObject full_formal_parameter_list(SubLObject arglist) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = arglist;
			SubLObject arg = CommonSymbols.NIL;
			for (arg = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), arg = cdolist_list_var.first())
				if (arg.isCons())
					answer = ConsesLow.cons(arg.first(), answer);
				else if (arg == complex_special_forms.$sym22$_OPTIONAL || arg == complex_special_forms.$sym23$_REST) {
				} else
					answer = ConsesLow.cons(arg, answer);
			return Sequences.nreverse(answer);
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12621)
	public static SubLObject getter_package(SubLObject getter) {
		{
			SubLObject v_package = Symbols.symbol_package(getter);
			if (!Packages.package_name(v_package).equal(complex_special_forms.$str43$CYC))
				v_package = Packages.find_package(complex_special_forms.$str44$SUBLISP);
			return v_package;
		}
	}

	public static SubLObject init_complex_special_forms_file() {
		complex_special_forms.$polymorphic_type_hierarchy$ = SubLFiles.defparameter("*POLYMORPHIC-TYPE-HIERARCHY*",
				complex_special_forms.$list13);
		complex_special_forms.$call_profiling_enabledP$ = SubLFiles.defvar("*CALL-PROFILING-ENABLED?*",
				CommonSymbols.NIL);
		complex_special_forms.$call_profiling_table$ = SubLFiles.defvar("*CALL-PROFILING-TABLE*", CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25895)
	public static SubLObject initialize_call_profiling_table() {
		return Hashtables.make_hash_table(complex_special_forms.$int110$1000, Symbols.symbol_function(CommonSymbols.EQ),
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 971)
	public static SubLObject intern_accessor(SubLObject string) {
		return Packages.intern(string, CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7432)
	public static SubLObject method_function_var(SubLObject name, SubLObject type) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(Symbols.symbol_name(name), new SubLObject[] { complex_special_forms.$str19$_,
						Symbols.symbol_name(type), complex_special_forms.$str20$_METHOD }));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7172)
	public static SubLObject method_table_var(SubLObject name) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject symbol = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
					try {
						Packages.$package$.bind(complex_special_forms.accessor_package(name), thread);
						symbol = complex_special_forms.intern_accessor(
								Sequences.cconcatenate(complex_special_forms.$str17$_, new SubLObject[] {
										Symbols.symbol_name(name), complex_special_forms.$str18$_METHOD_TABLE_ }));
					} finally {
						Packages.$package$.rebind(_prev_bind_0, thread);
					}
				}
				return symbol;
			}
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25697)
	public static SubLObject possibly_note_function_entry(SubLObject name) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(thread)
					&& CommonSymbols.NIL != complex_special_forms.$call_profiling_table$.getDynamicValue(thread))
				Hashtables
						.sethash(name,
								complex_special_forms.$call_profiling_table$
										.getDynamicValue(thread),
								Numbers.add(Hashtables.gethash_without_values(name,
										complex_special_forms.$call_profiling_table$.getDynamicValue(thread),
										CommonSymbols.ZERO_INTEGER), CommonSymbols.ONE_INTEGER));
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12921)
	public static SubLObject setter_from_accessor(SubLObject accessor) {
		return complex_special_forms.defstruct_setter(accessor);
	}

	public static SubLObject setup_complex_special_forms_file() {
		// CVS_ID("Id");
		return CommonSymbols.NIL;
	}

	/**
	 * Execute BODY with call profiling enabled. On exit PLACE will be set to an
	 * alist of (FUNCTION . COUNT) pairs.
	 */
	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25292)
	public static SubLObject with_call_profiling(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject place = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list105);
			place = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				return ConsesLow.list(complex_special_forms.$sym6$CLET, complex_special_forms.$list106, ConsesLow.list(
						complex_special_forms.$sym107$CUNWIND_PROTECT,
						reader.bq_cons(complex_special_forms.$sym2$PROGN, ConsesLow.append(body, CommonSymbols.NIL)),
						ConsesLow.listS(complex_special_forms.$sym108$CSETF, place, complex_special_forms.$list109)));
			}
		}
	}

	private complex_special_forms() {
	}

	//// Initializers

	public void declareFunctions() {
		complex_special_forms.declare_complex_special_forms_file();
	}

	public void initializeVariables() {
		complex_special_forms.init_complex_special_forms_file();
	}

	public void runTopLevelForms() {
		complex_special_forms.setup_complex_special_forms_file();
	}

}

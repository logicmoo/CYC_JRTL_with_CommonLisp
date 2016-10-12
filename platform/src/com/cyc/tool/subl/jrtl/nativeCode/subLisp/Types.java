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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Types implements SubLFile {

	//// Constructors

	public static SubLFile me = new Types();

	public static SubLSymbol $suspend_type_checkingP$ = null;

	//// Public Area

	public static SubLSymbol $dtp_symbol$;

	// @todo add these: guid_p, streamp, hash_table_p, processp, packagep,
	// structurep, macrop, macro_operator_p -APB
	// PS Don't forget to add UnaryFunctions for them as well

	// @todo investigate these: tcp_server_p, lockp, structure_bag_p,
	// rtl_structure, string_designatorp, sformp -APB

	public static SubLSymbol $dtp_cons$;
	public static SubLSymbol $dtp_fixnum$;
	public static SubLSymbol $dtp_float$;
	public static SubLSymbol $dtp_character$;
	public static SubLSymbol $dtp_string$;
	public static SubLSymbol $dtp_vector$;
	public static SubLSymbol $dtp_function$;
	public static SubLSymbol $dtp_hash_table$;
	public static SubLSymbol $dtp_package$;
	public static SubLSymbol $dtp_stream$;
	public static SubLSymbol $dtp_binum$;
	public static SubLSymbol $dtp_lock$;
	public static SubLSymbol $dtp_read_write_lock$;
	public static SubLSymbol $dtp_semaphore$;
	public static SubLSymbol $dtp_alien$;
	public static SubLSymbol $dtp_bignum$;
	public static SubLSymbol $dtp_process$;
	public static SubLSymbol $dtp_guid$;
	public static SubLSymbol $dtp_keyhash$;

	public static SubLObject atom(SubLObject x) {
		return x.isAtom() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject bignump(SubLObject x) {
		return x.isBignum() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject booleanp(SubLObject x) {
		return x.isBoolean() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject characterp(SubLObject x) {
		return x.isChar() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject consp(SubLObject x) {
		return x.isCons() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject errorp(SubLObject x) {
		return x.isError() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject fixnump(SubLObject x) {
		return x.isFixnum() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject floatp(SubLObject x) {
		return x.isDouble() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject function_spec_p(SubLObject x) {
		return x.isFunctionSpec() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject functionp(SubLObject x) {
		return x.isFunction() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject hash_table_p(SubLObject x) {
		return x.isHashtable() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject integerp(SubLObject x) {
		return x.isInteger() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject keyhash_p(SubLObject x) {
		return x.isKeyhash() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject keywordp(SubLObject x) {
		return x.isKeyword() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject listp(SubLObject x) {
		return x.isList() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject lock_p(SubLObject x) {
		return x.isLock() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject long_bignum_p(SubLObject x) {
		return x.isBigIntegerBignum() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject macro_operator_p(SubLObject x) {
		return x.isMacroOperator() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject medium_bignum_p(SubLObject x) {
		return x.isLongBignum() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject numberp(SubLObject x) {
		return x.isNumber() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject packagep(SubLObject x) {
		return x.isPackage() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject processp(SubLObject x) {
		return x.isProcess() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject sequencep(SubLObject x) {
		return x.isSequence() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject short_bignum_p(SubLObject x) {
		return x.isIntBignum() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject streamp(SubLObject x) {
		return x.isStream() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject stringp(SubLObject x) {
		return x.isString() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject structure_p(SubLObject x) {
		return x.isStructure() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject sublisp_false() {
		return CommonSymbols.NIL;
	}

	public static SubLObject sublisp_false(SubLObject arg) {
		return CommonSymbols.NIL;
	}

	public static SubLObject sublisp_false(SubLObject arg1, SubLObject arg2) {
		return CommonSymbols.NIL;
	}

	public static SubLObject sublisp_false(SubLObject[] args) {
		return CommonSymbols.NIL;
	}

	public static SubLObject sublisp_null(SubLObject x) {
		return x == CommonSymbols.NIL ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject sublisp_true() {
		return CommonSymbols.T;
	}

	public static SubLObject sublisp_true(SubLObject arg) {
		return CommonSymbols.T;
	}

	public static SubLObject sublisp_true(SubLObject arg1, SubLObject arg2) {
		return CommonSymbols.T;
	}

	public static SubLObject sublisp_true(SubLObject[] args) {
		return CommonSymbols.T;
	}

	public static SubLObject symbolp(SubLObject x) {
		return x.isSymbol() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	public static SubLSymbol type_of(SubLObject x) {
		return x.getType();
	}

	public static SubLFixnum typeCode_of(SubLObject x) {
		return x.getTypeCode();
	}

	public static SubLObject vectorp(SubLObject x) {
		return x.isVector() ? CommonSymbols.RET_T : CommonSymbols.NIL;
	}

	/** There should only ever be one instance of this */
	private Types() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Types.me, "sublisp_null", "NULL", 1, 0, false);
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			SubLFiles.declareFunction(Types.me, "booleanp", "BOOLEANP", 1, 0, false);
		} finally {
			SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE);
		}
		SubLFiles.declareFunction(Types.me, "symbolp", "SYMBOLP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "keywordp", "KEYWORDP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "atom", "ATOM", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "consp", "CONSP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "listp", "LISTP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "sequencep", "SEQUENCEP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "numberp", "NUMBERP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "fixnump", "FIXNUMP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "bignump", "BIGNUMP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "short_bignum_p", "SHORT-BIGNUM-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "medium_bignum_p", "MEDIUM-BIGNUM-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "long_bignum_p", "LONG-BIGNUM-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "integerp", "INTEGERP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "floatp", "FLOATP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "characterp", "CHARACTERP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "stringp", "STRINGP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "vectorp", "VECTORP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "functionp", "FUNCTIONP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "function_spec_p", "FUNCTION-SPEC-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "macro_operator_p", "MACRO-OPERATOR-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "hash_table_p", "HASH-TABLE-P", 1, 0, false);
		// SubLFiles.declareFunction(me, "keyhash_p", "KEYHASH-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "processp", "PROCESSP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "lock_p", "LOCK-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "structure_p", "STRUCTURE-P", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "streamp", "STREAMP", 1, 0, false);
		SubLFiles.declareFunction(Types.me, "packagep", "PACKAGEP", 1, 0, false);

		SubLFiles.declareFunction(Types.me, "type_of", "TYPE-OF", 1, 0, false);

		SubLFiles.declareFunction(Types.me, "sublisp_true", "TRUE", 0, 0, true);
		SubLFiles.declareFunction(Types.me, "sublisp_false", "FALSE", 0, 0, true);
	}

	public void initializeVariables() {
		Types.$dtp_symbol$ = SubLFiles.defconstant(Types.me, "*DTP-SYMBOL*", CommonSymbols.TWO_INTEGER);
		Types.$dtp_cons$ = SubLFiles.defconstant(Types.me, "*DTP-CONS*", CommonSymbols.FOUR_INTEGER);
		Types.$dtp_fixnum$ = SubLFiles.defconstant(Types.me, "*DTP-FIXNUM*", CommonSymbols.SIX_INTEGER);
		Types.$dtp_float$ = SubLFiles.defconstant(Types.me, "*DTP-FLOAT*", CommonSymbols.SEVEN_INTEGER);
		Types.$dtp_character$ = SubLFiles.defconstant(Types.me, "*DTP-CHARACTER*", CommonSymbols.EIGHT_INTEGER);
		Types.$dtp_string$ = SubLFiles.defconstant(Types.me, "*DTP-STRING*", CommonSymbols.THIRTY_TWO_INTEGER);
		Types.$dtp_vector$ = SubLFiles.defconstant(Types.me, "*DTP-VECTOR*", CommonSymbols.THIRTY_THREE_INTEGER);
		Types.$dtp_function$ = SubLFiles.defconstant(Types.me, "*DTP-FUNCTION*", CommonSymbols.FIVE_INTEGER);
		Types.$dtp_hash_table$ = SubLFiles.defconstant(Types.me, "*DTP-HASH-TABLE*", CommonSymbols.NINE_INTEGER);
		Types.$dtp_package$ = SubLFiles.defconstant(Types.me, "*DTP-PACKAGE*", CommonSymbols.ONE_INTEGER);
		Types.$dtp_stream$ = SubLFiles.defconstant(Types.me, "*DTP-STREAM*",
				CommonSymbols.TWO_HUNDRED_FORTY_FOUR_INTEGER);
		Types.$dtp_bignum$ = SubLFiles.defconstant(Types.me, "*DTP-BIGNUM*", CommonSymbols.THIRTY_FOUR_INTEGER);
		Types.$dtp_process$ = SubLFiles.defconstant(Types.me, "*DTP-PROCESS*", CommonSymbols.FOURTEEN_INTEGER);
		Types.$dtp_lock$ = SubLFiles.defconstant(Types.me, "*DTP-LOCK*", CommonSymbols.FIFTEEN_INTEGER);
		// $dtp_read_write_lock$ = SubLFiles.defconstant(me,
		// "*DTP-READ-WRITE-LOCK*", FIFTEEN_INTEGER);
		// $dtp_semaphore$ = SubLFiles.defconstant(me, "*DTP-SEMAPHORE*",
		// FIFTEEN_INTEGER);
		Types.$dtp_alien$ = SubLFiles.defconstant(Types.me, "*DTP-ALIEN*", CommonSymbols.THIRTEEN_INTEGER);
		Types.$dtp_guid$ = SubLFiles.defconstant(Types.me, "*DTP-GUID*",
				CommonSymbols.ONE_HUNDRED_TWENTY_SEVEN_INTEGER);
		Types.$dtp_keyhash$ = SubLFiles.defconstant(Types.me, "*DTP-KEYHASH*",
				CommonSymbols.ONE_HUNDRED_THIRTY_SEVEN_INTEGER);
		Types.$suspend_type_checkingP$ = SubLFiles.defvar(Types.me, "*SUSPEND-TYPE-CHECKING?*", CommonSymbols.NIL);
	}

	public void runTopLevelForms() {
	}

}

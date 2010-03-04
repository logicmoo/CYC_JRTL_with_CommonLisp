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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public  final class Types implements SubLFile {
  
  //// Constructors
  
  /** There should only ever be one instance of this */
  private Types() {}
  public static final SubLFile me = new Types();
  
  //// Public Area
  
  public static SubLSymbol $suspend_type_checkingP$ = null;
  
  
  // @todo add these: guid_p, streamp, hash_table_p, processp, packagep,
  // structurep, macrop, macro_operator_p -APB
  // PS Don't forget to add UnaryFunctions for them as well
  
  // @todo investigate these: tcp_server_p, lockp, structure_bag_p,
  // rtl_structure, string_designatorp, sformp -APB
  
  public static SubLSymbol $dtp_symbol$;
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
  
  public static final SubLObject sublisp_null(SubLObject x) {
    return (x == NIL) ? RET_T : NIL;
  }
  
  public static final SubLObject booleanp(SubLObject x) {
    return x.isBoolean() ? RET_T : NIL;
  }
  
  public static final SubLObject symbolp(SubLObject x) {
    return x.isSymbol() ? RET_T : NIL;
  }
  
  public static final SubLObject keywordp(SubLObject x) {
    return x.isKeyword() ? RET_T : NIL;
  }
  
  public static final SubLObject atom(SubLObject x) {
    return x.isAtom() ? RET_T : NIL;
  }
  
  public static final SubLObject consp(SubLObject x) {
    return x.isCons() ? RET_T : NIL;
  }
  
  public static final SubLObject listp(SubLObject x) {
    return x.isList() ? RET_T : NIL;
  }
  
  public static final SubLObject sequencep(SubLObject x) {
    return x.isSequence() ? RET_T : NIL;
  }
  
  public static final SubLObject numberp(SubLObject x) {
    return x.isNumber() ? RET_T : NIL;
  }
  
  public static final SubLObject fixnump(SubLObject x) {
    return x.isFixnum() ? RET_T : NIL;
  }
  
  public static final SubLObject bignump(SubLObject x) {
    return x.isBignum() ? RET_T : NIL;
  }
  
  public static final SubLObject short_bignum_p(SubLObject x) {
    return x.isIntBignum() ? RET_T : NIL;
  }
  
  public static final SubLObject medium_bignum_p(SubLObject x) {
    return x.isLongBignum() ? RET_T : NIL;
  }
  
  public static final SubLObject long_bignum_p(SubLObject x) {
    return x.isBigIntegerBignum() ? RET_T : NIL;
  }
  
  public static final SubLObject integerp(SubLObject x) {
    return x.isInteger() ? RET_T : NIL;
  }
  
  public static final SubLObject floatp(SubLObject x) {
    return x.isDouble() ? RET_T : NIL;
  }
  
  public static final SubLObject characterp(SubLObject x) {
    return x.isChar() ? RET_T : NIL;
  }
  
  public static final SubLObject stringp(SubLObject x) {
    return x.isString() ? RET_T : NIL;
  }
  
  public static final SubLObject vectorp(SubLObject x) {
    return x.isVector() ? RET_T : NIL;
  }
  
  public static final SubLObject functionp(SubLObject x) {
    return x.isFunction() ? RET_T : NIL;
  }
  
  public static final SubLObject function_spec_p(SubLObject x) {
    return x.isFunctionSpec() ? RET_T : NIL;
  }
  
  public static final SubLObject macro_operator_p(SubLObject x) {
    return x.isMacroOperator() ? RET_T : NIL;
  }
  
  public static final SubLObject hash_table_p(SubLObject x) {
    return x.isHashtable() ? RET_T : NIL;
  }
  
  public static final SubLObject keyhash_p(SubLObject x) {
    return x.isKeyhash() ? RET_T : NIL;
  }
  
  public static final SubLObject processp(SubLObject x) {
    return x.isProcess() ? RET_T : NIL;
  }
  
  public static final SubLObject lock_p(SubLObject x) {
    return x.isLock() ? RET_T : NIL;
  }
  
  public static final SubLObject structure_p(SubLObject x) {
    return x.isStructure() ? RET_T : NIL;
  }
  
  public static final SubLObject streamp(SubLObject x) {
    return x.isStream() ? RET_T : NIL;
  }
  
  public static final SubLObject packagep(SubLObject x) {
    return x.isPackage() ? RET_T : NIL;
  }
  
  public static final SubLObject errorp(SubLObject x) {
    return x.isError() ? RET_T : NIL;
  }
  
  public static final SubLFixnum typeCode_of(SubLObject x) {
    return x.getTypeCode();
  }
  
  public static final SubLSymbol type_of(SubLObject x) {
    return x.getType();
  }
  
  public static final SubLObject sublisp_true(SubLObject[] args) {
    return T;
  }
  
  public static final SubLObject sublisp_true() {
    return T;
  }
  
  public static final SubLObject sublisp_true(SubLObject arg) {
    return T;
  }
  
  public static final SubLObject sublisp_true(SubLObject arg1, SubLObject arg2) {
    return T;
  }
  
  public static final SubLObject sublisp_false(SubLObject[] args) {
    return NIL;
  }
  
  public static final SubLObject sublisp_false() {
    return NIL;
  }
  
  public static final SubLObject sublisp_false(SubLObject arg) {
    return NIL;
  }
  
  public static final SubLObject sublisp_false(SubLObject arg1, SubLObject arg2) {
    return NIL;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "sublisp_null", "NULL", 1, 0, false);
    try {
      SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
      SubLFiles.declareFunction(me, "booleanp", "BOOLEANP", 1, 0, false);
    } finally {
      SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE);
    }
    SubLFiles.declareFunction(me, "symbolp", "SYMBOLP", 1, 0, false);
    SubLFiles.declareFunction(me, "keywordp", "KEYWORDP", 1, 0, false);
    SubLFiles.declareFunction(me, "atom", "ATOM", 1, 0, false);
    SubLFiles.declareFunction(me, "consp", "CONSP", 1, 0, false);
    SubLFiles.declareFunction(me, "listp", "LISTP", 1, 0, false);
    SubLFiles.declareFunction(me, "sequencep", "SEQUENCEP", 1, 0, false);
    SubLFiles.declareFunction(me, "numberp", "NUMBERP", 1, 0, false);
    SubLFiles.declareFunction(me, "fixnump", "FIXNUMP", 1, 0, false);
    SubLFiles.declareFunction(me, "bignump", "BIGNUMP", 1, 0, false);
    SubLFiles.declareFunction(me, "short_bignum_p", "SHORT-BIGNUM-P", 1, 0, false);
    SubLFiles.declareFunction(me, "medium_bignum_p", "MEDIUM-BIGNUM-P", 1, 0, false);
    SubLFiles.declareFunction(me, "long_bignum_p", "LONG-BIGNUM-P", 1, 0, false);
    SubLFiles.declareFunction(me, "integerp", "INTEGERP", 1, 0, false);
    SubLFiles.declareFunction(me, "floatp", "FLOATP", 1, 0, false);
    SubLFiles.declareFunction(me, "characterp", "CHARACTERP", 1, 0, false);
    SubLFiles.declareFunction(me, "stringp", "STRINGP", 1, 0, false);
    SubLFiles.declareFunction(me, "vectorp", "VECTORP", 1, 0, false);
    SubLFiles.declareFunction(me, "functionp", "FUNCTIONP", 1, 0, false);
    SubLFiles.declareFunction(me, "function_spec_p", "FUNCTION-SPEC-P", 1, 0, false);
    SubLFiles.declareFunction(me, "macro_operator_p", "MACRO-OPERATOR-P", 1, 0, false);
    SubLFiles.declareFunction(me, "hash_table_p", "HASH-TABLE-P", 1, 0, false);
    //SubLFiles.declareFunction(me, "keyhash_p", "KEYHASH-P", 1, 0, false);
    SubLFiles.declareFunction(me, "processp", "PROCESSP", 1, 0, false);
    SubLFiles.declareFunction(me, "lock_p", "LOCK-P", 1, 0, false);
    SubLFiles.declareFunction(me, "structure_p", "STRUCTURE-P", 1, 0, false);
    SubLFiles.declareFunction(me, "streamp", "STREAMP", 1, 0, false);
    SubLFiles.declareFunction(me, "packagep", "PACKAGEP", 1, 0, false);
    
    SubLFiles.declareFunction(me, "type_of", "TYPE-OF", 1, 0, false);
    
    SubLFiles.declareFunction(me, "sublisp_true",  "TRUE",  0, 0, true);
    SubLFiles.declareFunction(me, "sublisp_false", "FALSE", 0, 0, true);
  }
  
  public void initializeVariables() {
    $dtp_symbol$     = SubLFiles.defconstant(me, "*DTP-SYMBOL*",     TWO_INTEGER);
    $dtp_cons$       = SubLFiles.defconstant(me, "*DTP-CONS*",       FOUR_INTEGER);
    $dtp_fixnum$     = SubLFiles.defconstant(me, "*DTP-FIXNUM*",     SIX_INTEGER);
    $dtp_float$      = SubLFiles.defconstant(me, "*DTP-FLOAT*",      SEVEN_INTEGER);
    $dtp_character$  = SubLFiles.defconstant(me, "*DTP-CHARACTER*",  EIGHT_INTEGER);
    $dtp_string$     = SubLFiles.defconstant(me, "*DTP-STRING*",     THIRTY_TWO_INTEGER);
    $dtp_vector$     = SubLFiles.defconstant(me, "*DTP-VECTOR*",     THIRTY_THREE_INTEGER);
    $dtp_function$   = SubLFiles.defconstant(me, "*DTP-FUNCTION*",   FIVE_INTEGER);
    $dtp_hash_table$ = SubLFiles.defconstant(me, "*DTP-HASH-TABLE*", NINE_INTEGER);
    $dtp_package$    = SubLFiles.defconstant(me, "*DTP-PACKAGE*",    ONE_INTEGER);
    $dtp_stream$     = SubLFiles.defconstant(me, "*DTP-STREAM*",     TWO_HUNDRED_FORTY_FOUR_INTEGER);
    $dtp_bignum$     = SubLFiles.defconstant(me, "*DTP-BIGNUM*",     THIRTY_FOUR_INTEGER);
    $dtp_process$    = SubLFiles.defconstant(me, "*DTP-PROCESS*",    FOURTEEN_INTEGER);
    $dtp_lock$       = SubLFiles.defconstant(me, "*DTP-LOCK*",       FIFTEEN_INTEGER);
    //$dtp_read_write_lock$       = SubLFiles.defconstant(me, "*DTP-READ-WRITE-LOCK*",       FIFTEEN_INTEGER);
    //$dtp_semaphore$       = SubLFiles.defconstant(me, "*DTP-SEMAPHORE*",       FIFTEEN_INTEGER);
    $dtp_alien$      = SubLFiles.defconstant(me, "*DTP-ALIEN*",      THIRTEEN_INTEGER);
    $dtp_guid$       = SubLFiles.defconstant(me, "*DTP-GUID*",       ONE_HUNDRED_TWENTY_SEVEN_INTEGER);
    $dtp_keyhash$    = SubLFiles.defconstant(me, "*DTP-KEYHASH*",    ONE_HUNDRED_THIRTY_SEVEN_INTEGER);
    $suspend_type_checkingP$ = SubLFiles.defvar(me, "*SUSPEND-TYPE-CHECKING?*", NIL);
  }
  
  public void runTopLevelForms() {
  }
  
}

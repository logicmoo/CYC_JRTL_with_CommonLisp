package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xref_database
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xref_database";
  public static final String myFingerPrint = "5903266a683532bf099586ca2323ed9d160c58170e258380d50515b5a255088c";
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 942L)
  public static SubLSymbol $empty_set_contents$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLSymbol $dtp_xref_module$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLSymbol $dtp_xref_system$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 87636L)
  public static SubLSymbol $current_xref_module$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88227L)
  public static SubLSymbol $xref_module_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88682L)
  public static SubLSymbol $xref_file_position_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89319L)
  public static SubLSymbol $xref_method_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89716L)
  public static SubLSymbol $xref_global_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 94425L)
  public static SubLSymbol $xref_trace$;
  private static final SubLSymbol $sym0$XREF_MODULE;
  private static final SubLSymbol $sym1$XREF_MODULE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_XREF_MODULE;
  private static final SubLSymbol $sym7$XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$XREF_M_NAME;
  private static final SubLSymbol $sym10$_CSETF_XREF_M_NAME;
  private static final SubLSymbol $sym11$XREF_M_XREF_SYSTEM;
  private static final SubLSymbol $sym12$_CSETF_XREF_M_XREF_SYSTEM;
  private static final SubLSymbol $sym13$XREF_M_FEATURES;
  private static final SubLSymbol $sym14$_CSETF_XREF_M_FEATURES;
  private static final SubLSymbol $sym15$XREF_M_METHOD_DEFINITIONS;
  private static final SubLSymbol $sym16$_CSETF_XREF_M_METHOD_DEFINITIONS;
  private static final SubLSymbol $sym17$XREF_M_METHOD_POSITION_TABLE;
  private static final SubLSymbol $sym18$_CSETF_XREF_M_METHOD_POSITION_TABLE;
  private static final SubLSymbol $sym19$XREF_M_METHOD_METHOD_TABLE;
  private static final SubLSymbol $sym20$_CSETF_XREF_M_METHOD_METHOD_TABLE;
  private static final SubLSymbol $sym21$XREF_M_METHOD_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym22$_CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym23$XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $sym24$_CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $sym25$XREF_M_METHOD_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $sym26$_CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $sym27$XREF_M_GLOBAL_DEFINITIONS;
  private static final SubLSymbol $sym28$_CSETF_XREF_M_GLOBAL_DEFINITIONS;
  private static final SubLSymbol $sym29$XREF_M_GLOBAL_POSITION_TABLE;
  private static final SubLSymbol $sym30$_CSETF_XREF_M_GLOBAL_POSITION_TABLE;
  private static final SubLSymbol $sym31$XREF_M_GLOBAL_METHOD_TABLE;
  private static final SubLSymbol $sym32$_CSETF_XREF_M_GLOBAL_METHOD_TABLE;
  private static final SubLSymbol $sym33$XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym34$_CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym35$XREF_M_TOP_METHOD_TABLE;
  private static final SubLSymbol $sym36$_CSETF_XREF_M_TOP_METHOD_TABLE;
  private static final SubLSymbol $sym37$XREF_M_TOP_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym38$_CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $sym39$XREF_M_TOP_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $sym40$_CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $sym41$XREF_M_TOP_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $sym42$_CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $sym43$XREF_M_METHOD_FORMAL_ARGLIST_TABLE;
  private static final SubLSymbol $sym44$_CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE;
  private static final SubLSymbol $sym45$XREF_M_GLOBAL_BINDING_TYPE_TABLE;
  private static final SubLSymbol $sym46$_CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE;
  private static final SubLSymbol $kw47$NAME;
  private static final SubLSymbol $kw48$XREF_SYSTEM;
  private static final SubLSymbol $kw49$FEATURES;
  private static final SubLSymbol $kw50$METHOD_DEFINITIONS;
  private static final SubLSymbol $kw51$METHOD_POSITION_TABLE;
  private static final SubLSymbol $kw52$METHOD_METHOD_TABLE;
  private static final SubLSymbol $kw53$METHOD_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $kw54$METHOD_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $kw55$METHOD_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $kw56$GLOBAL_DEFINITIONS;
  private static final SubLSymbol $kw57$GLOBAL_POSITION_TABLE;
  private static final SubLSymbol $kw58$GLOBAL_METHOD_TABLE;
  private static final SubLSymbol $kw59$GLOBAL_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $kw60$TOP_METHOD_TABLE;
  private static final SubLSymbol $kw61$TOP_GLOBAL_REFERENCE_TABLE;
  private static final SubLSymbol $kw62$TOP_GLOBAL_MODIFICATION_TABLE;
  private static final SubLSymbol $kw63$TOP_GLOBAL_BINDING_TABLE;
  private static final SubLSymbol $kw64$METHOD_FORMAL_ARGLIST_TABLE;
  private static final SubLSymbol $kw65$GLOBAL_BINDING_TYPE_TABLE;
  private static final SubLString $str66$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw67$BEGIN;
  private static final SubLSymbol $sym68$MAKE_XREF_MODULE;
  private static final SubLSymbol $kw69$SLOT;
  private static final SubLSymbol $kw70$END;
  private static final SubLSymbol $sym71$VISIT_DEFSTRUCT_OBJECT_XREF_MODULE_METHOD;
  private static final SubLString $str72$_A____S_methods___S_globals;
  private static final SubLSymbol $sym73$SXHASH_XREF_MODULE_METHOD;
  private static final SubLSymbol $sym74$STRINGP;
  private static final SubLSymbol $sym75$XREF_SYSTEM_P;
  private static final SubLSymbol $sym76$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym77$SYMBOLP;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw81$DONE;
  private static final SubLSymbol $sym82$XRM_VAR;
  private static final SubLSymbol $sym83$DEFINITION;
  private static final SubLSymbol $sym84$POSITION;
  private static final SubLSymbol $sym85$CLET;
  private static final SubLSymbol $sym86$DO_LIST;
  private static final SubLSymbol $sym87$XRM_METHOD_DEFINITIONS;
  private static final SubLSymbol $sym88$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym89$IGNORE;
  private static final SubLSymbol $sym90$DO_XRM_METHOD_DEFINITIONS;
  private static final SubLSymbol $sym91$XRM_VAR;
  private static final SubLSymbol $sym92$POSITION;
  private static final SubLSymbol $sym93$DO_DICTIONARY;
  private static final SubLSymbol $sym94$XRM_METHOD_POSITION_TABLE;
  private static final SubLSymbol $sym95$DO_XRM_METHODS;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$XRM_VAR;
  private static final SubLSymbol $sym98$DEFINITION;
  private static final SubLSymbol $sym99$POSITION;
  private static final SubLSymbol $sym100$XRM_GLOBAL_DEFINITIONS;
  private static final SubLSymbol $sym101$DO_XRM_GLOBAL_DEFINITIONS;
  private static final SubLSymbol $sym102$XRM_VAR;
  private static final SubLSymbol $sym103$POSITION;
  private static final SubLSymbol $sym104$XRM_GLOBAL_POSITION_TABLE;
  private static final SubLSymbol $sym105$DO_XRM_GLOBALS;
  private static final SubLSymbol $sym106$CAR;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLSymbol $kw109$UNSPECIFIED;
  private static final SubLSymbol $sym110$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym111$LISTP;
  private static final SubLSymbol $sym112$BINDING_TYPE_P;
  private static final SubLSymbol $sym113$XREF_SYSTEM;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$PRINT_XREF_SYSTEM;
  private static final SubLSymbol $sym119$XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$XREF_S_NAME;
  private static final SubLSymbol $sym122$_CSETF_XREF_S_NAME;
  private static final SubLSymbol $sym123$XREF_S_FEATURES;
  private static final SubLSymbol $sym124$_CSETF_XREF_S_FEATURES;
  private static final SubLSymbol $sym125$XREF_S_XREF_MODULE_TABLE;
  private static final SubLSymbol $sym126$_CSETF_XREF_S_XREF_MODULE_TABLE;
  private static final SubLSymbol $sym127$XREF_S_METHOD_DEFINITION_TABLE;
  private static final SubLSymbol $sym128$_CSETF_XREF_S_METHOD_DEFINITION_TABLE;
  private static final SubLSymbol $sym129$XREF_S_GLOBAL_DEFINITION_TABLE;
  private static final SubLSymbol $sym130$_CSETF_XREF_S_GLOBAL_DEFINITION_TABLE;
  private static final SubLSymbol $sym131$XREF_S_METHOD_CALLED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym132$_CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym133$XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $sym134$_CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $sym135$XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym136$_CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym137$XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym138$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym139$XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym140$_CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE;
  private static final SubLSymbol $sym141$XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE;
  private static final SubLSymbol $sym142$_CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE;
  private static final SubLSymbol $sym143$XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $sym144$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $sym145$XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym146$_CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym147$XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym148$_CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym149$XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym150$_CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $kw151$XREF_MODULE_TABLE;
  private static final SubLSymbol $kw152$METHOD_DEFINITION_TABLE;
  private static final SubLSymbol $kw153$GLOBAL_DEFINITION_TABLE;
  private static final SubLSymbol $kw154$METHOD_CALLED_BY_METHOD_TABLE;
  private static final SubLSymbol $kw155$METHOD_CALLED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $kw156$METHOD_CALLED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $kw157$GLOBAL_REFERENCED_BY_METHOD_TABLE;
  private static final SubLSymbol $kw158$GLOBAL_MODIFIED_BY_METHOD_TABLE;
  private static final SubLSymbol $kw159$GLOBAL_REBOUND_BY_METHOD_TABLE;
  private static final SubLSymbol $kw160$GLOBAL_REFERENCED_BY_GLOBAL_TABLE;
  private static final SubLSymbol $kw161$GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $kw162$GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $kw163$GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE;
  private static final SubLSymbol $sym164$MAKE_XREF_SYSTEM;
  private static final SubLSymbol $sym165$VISIT_DEFSTRUCT_OBJECT_XREF_SYSTEM_METHOD;
  private static final SubLString $str166$_A____S_features___S_modules;
  private static final SubLInteger $int167$10000;
  private static final SubLInteger $int168$1000;
  private static final SubLInteger $int169$500;
  private static final SubLString $str170$Module__A_features_changed_to__S;
  private static final SubLSymbol $kw171$SL2C;
  private static final SubLSymbol $kw172$SL2JAVA;
  private static final SubLString $str173$Unexpected_backend__S;
  private static final SubLSymbol $sym174$XRM_NAME;
  private static final SubLSymbol $sym175$NOT_EQ;
  private static final SubLSymbol $sym176$CDR;
  private static final SubLSymbol $kw177$METHODS;
  private static final SubLSymbol $kw178$GLOBALS;
  private static final SubLSymbol $sym179$XREF_METHOD_POTENTIALLY_PRIVATE_P;
  private static final SubLSymbol $sym180$XREF_GLOBAL_POTENTIALLY_PRIVATE_P;
  private static final SubLSymbol $sym181$CODE_COMMENT;
  private static final SubLString $str182$_subl_;
  private static final SubLString $str183$_;
  private static final SubLSymbol $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLSymbol $sym187$SYSTEM_VAR;
  private static final SubLSymbol $sym188$MODULE_VAR;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$FWHEN;
  private static final SubLSymbol $sym191$NEW_XREF_MODULE;
  private static final SubLSymbol $sym192$_CURRENT_XREF_MODULE_;
  private static final SubLSymbol $sym193$PWHEN;
  private static final SubLSymbol $sym194$XRS_MERGE_XREF_MODULE;
  private static final SubLList $list195;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$CURRENT_XREF_MODULE;
  private static final SubLSymbol $sym198$WITH_CURRENT_XREF_MODULE;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$NAME_VAR;
  private static final SubLSymbol $sym201$CHECK_TYPE;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$_XREF_MODULE_SCOPE_;
  private static final SubLList $list204;
  private static final SubLSymbol $sym205$POSITION_VAR;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$_XREF_FILE_POSITION_SCOPE_;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$XREF_WITHIN_METHOD;
  private static final SubLList $list210;
  private static final SubLSymbol $sym211$METHOD_VAR;
  private static final SubLList $list212;
  private static final SubLSymbol $sym213$_XREF_METHOD_SCOPE_;
  private static final SubLList $list214;
  private static final SubLSymbol $sym215$GLOBAL_VAR;
  private static final SubLSymbol $sym216$_XREF_GLOBAL_SCOPE_;
  private static final SubLSymbol $kw217$METHOD;
  private static final SubLSymbol $kw218$GLOBAL;
  private static final SubLSymbol $kw219$FILE;
  private static final SubLString $str220$___def_glob____S;
  private static final SubLString $str221$___defmacro____S;
  private static final SubLString $str222$___define______S;
  private static final SubLString $str223$____arglist____S;
  private static final SubLString $str224$____binding_type____S;
  private static final SubLString $str225$____ref_glob_____S;
  private static final SubLString $str226$____mod_glob_____S;
  private static final SubLString $str227$Initializer_for__S_modifies__S;
  private static final SubLString $str228$____bind_glob_____S;
  private static final SubLString $str229$Initializer_for__S_rebinds__S;
  private static final SubLString $str230$____macro_use____S;
  private static final SubLString $str231$____fun_call_____S;
  private static final SubLString $str232$__module_removed_____A;
  private static final SubLSymbol $sym233$STRING_LESSP;
  private static final SubLSymbol $sym234$SYMBOL_NAME;
  private static final SubLSymbol $sym235$_;
  private static final SubLSymbol $sym236$XREF_GLOBAL_ACCESS_COUNT;
  private static final SubLSymbol $sym237$XREF_METHOD_CALL_COUNT;

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_xref_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $xref_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_name(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_xref_system(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_features(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_definitions(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_position_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_method_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_global_reference_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_global_modification_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_global_binding_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_global_definitions(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_global_position_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_global_method_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_global_global_reference_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_top_method_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_top_global_reference_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_top_global_modification_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_top_global_binding_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_method_formal_arglist_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField19();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject xref_m_global_binding_type_table(final SubLObject v_object)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.getField20();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_xref_system(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_features(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_definitions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_position_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_global_reference_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_global_modification_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_global_binding_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_global_definitions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_global_position_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_global_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_global_global_reference_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_top_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_top_global_reference_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_top_global_modification_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_top_global_binding_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_method_formal_arglist_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField19( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject _csetf_xref_m_global_binding_type_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_module_p( v_object ) : v_object;
    return v_object.setField20( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject make_xref_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $xref_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw47$NAME ) )
      {
        _csetf_xref_m_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$XREF_SYSTEM ) )
      {
        _csetf_xref_m_xref_system( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$FEATURES ) )
      {
        _csetf_xref_m_features( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$METHOD_DEFINITIONS ) )
      {
        _csetf_xref_m_method_definitions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$METHOD_POSITION_TABLE ) )
      {
        _csetf_xref_m_method_position_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$METHOD_METHOD_TABLE ) )
      {
        _csetf_xref_m_method_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$METHOD_GLOBAL_REFERENCE_TABLE ) )
      {
        _csetf_xref_m_method_global_reference_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$METHOD_GLOBAL_MODIFICATION_TABLE ) )
      {
        _csetf_xref_m_method_global_modification_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$METHOD_GLOBAL_BINDING_TABLE ) )
      {
        _csetf_xref_m_method_global_binding_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$GLOBAL_DEFINITIONS ) )
      {
        _csetf_xref_m_global_definitions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$GLOBAL_POSITION_TABLE ) )
      {
        _csetf_xref_m_global_position_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$GLOBAL_METHOD_TABLE ) )
      {
        _csetf_xref_m_global_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$GLOBAL_GLOBAL_REFERENCE_TABLE ) )
      {
        _csetf_xref_m_global_global_reference_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw60$TOP_METHOD_TABLE ) )
      {
        _csetf_xref_m_top_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw61$TOP_GLOBAL_REFERENCE_TABLE ) )
      {
        _csetf_xref_m_top_global_reference_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw62$TOP_GLOBAL_MODIFICATION_TABLE ) )
      {
        _csetf_xref_m_top_global_modification_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw63$TOP_GLOBAL_BINDING_TABLE ) )
      {
        _csetf_xref_m_top_global_binding_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw64$METHOD_FORMAL_ARGLIST_TABLE ) )
      {
        _csetf_xref_m_method_formal_arglist_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw65$GLOBAL_BINDING_TYPE_TABLE ) )
      {
        _csetf_xref_m_global_binding_type_table( v_new, current_value );
      }
      else
      {
        Errors.error( $str66$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject visit_defstruct_xref_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw67$BEGIN, $sym68$MAKE_XREF_MODULE, NINETEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw47$NAME, xref_m_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw48$XREF_SYSTEM, xref_m_xref_system( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw49$FEATURES, xref_m_features( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw50$METHOD_DEFINITIONS, xref_m_method_definitions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw51$METHOD_POSITION_TABLE, xref_m_method_position_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw52$METHOD_METHOD_TABLE, xref_m_method_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw53$METHOD_GLOBAL_REFERENCE_TABLE, xref_m_method_global_reference_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw54$METHOD_GLOBAL_MODIFICATION_TABLE, xref_m_method_global_modification_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw55$METHOD_GLOBAL_BINDING_TABLE, xref_m_method_global_binding_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw56$GLOBAL_DEFINITIONS, xref_m_global_definitions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw57$GLOBAL_POSITION_TABLE, xref_m_global_position_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw58$GLOBAL_METHOD_TABLE, xref_m_global_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw59$GLOBAL_GLOBAL_REFERENCE_TABLE, xref_m_global_global_reference_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw60$TOP_METHOD_TABLE, xref_m_top_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw61$TOP_GLOBAL_REFERENCE_TABLE, xref_m_top_global_reference_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw62$TOP_GLOBAL_MODIFICATION_TABLE, xref_m_top_global_modification_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw63$TOP_GLOBAL_BINDING_TABLE, xref_m_top_global_binding_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw64$METHOD_FORMAL_ARGLIST_TABLE, xref_m_method_formal_arglist_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw65$GLOBAL_BINDING_TYPE_TABLE, xref_m_global_binding_type_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw70$END, $sym68$MAKE_XREF_MODULE, NINETEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 1809L)
  public static SubLObject visit_defstruct_object_xref_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_xref_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 4941L)
  public static SubLObject print_xref_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      final SubLObject name = xrm_name( v_object );
      final SubLObject module_count = xrm_total_method_count( v_object );
      final SubLObject global_count = xrm_total_global_count( v_object );
      PrintLow.format( stream, $str72$_A____S_methods___S_globals, new SubLObject[] { name, module_count, global_count
      } );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 5333L)
  public static SubLObject sxhash_xref_module_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( xref_m_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 5418L)
  public static SubLObject new_xref_module(final SubLObject xref_system, final SubLObject name, final SubLObject features)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != xref_system_p( xref_system ) : xref_system;
    assert NIL != list_utilities.non_dotted_list_p( features ) : features;
    SubLObject cdolist_list_var = features;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.symbolp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject xrm = make_xref_module( UNPROVIDED );
    _csetf_xref_m_name( xrm, name );
    _csetf_xref_m_xref_system( xrm, xref_system );
    _csetf_xref_m_features( xrm, features );
    _csetf_xref_m_method_definitions( xrm, NIL );
    _csetf_xref_m_method_position_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_method_method_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_method_global_reference_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_method_global_modification_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_method_global_binding_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_global_definitions( xrm, NIL );
    _csetf_xref_m_global_position_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_global_method_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_global_global_reference_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_top_method_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_top_global_reference_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_top_global_modification_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_top_global_binding_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_method_formal_arglist_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_m_global_binding_type_table( xrm, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 6992L)
  public static SubLObject do_xrm_method_definitions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method = NIL;
    SubLObject xrm = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    xrm = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      if( NIL == conses_high.member( current_$1, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw81$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject xrm_var = $sym82$XRM_VAR;
    final SubLObject definition = $sym83$DEFINITION;
    final SubLObject position = $sym84$POSITION;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( xrm_var, xrm ) ), ConsesLow.list( $sym86$DO_LIST, ConsesLow.list( definition, ConsesLow.list( $sym87$XRM_METHOD_DEFINITIONS, xrm_var ), $kw81$DONE,
        done ), ConsesLow.listS( $sym88$CDESTRUCTURING_BIND, reader.bq_cons( method, position ), definition, ConsesLow.list( $sym89$IGNORE, position ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 7343L)
  public static SubLObject xrm_method_definitions(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return xref_m_method_definitions( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 7505L)
  public static SubLObject do_xrm_methods(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method = NIL;
    SubLObject xrm = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    xrm = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      if( NIL == conses_high.member( current_$2, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw81$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject xrm_var = $sym91$XRM_VAR;
    final SubLObject position = $sym92$POSITION;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( xrm_var, xrm ) ), ConsesLow.listS( $sym93$DO_DICTIONARY, ConsesLow.list( method, position, ConsesLow.list( $sym94$XRM_METHOD_POSITION_TABLE,
        xrm_var ), done ), ConsesLow.list( $sym89$IGNORE, position ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 7776L)
  public static SubLObject xrm_method_position_table(final SubLObject xrm)
  {
    return xref_m_method_position_table( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 7900L)
  public static SubLObject do_xrm_global_definitions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject global = NIL;
    SubLObject xrm = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    global = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    xrm = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      if( NIL == conses_high.member( current_$3, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw81$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject xrm_var = $sym97$XRM_VAR;
    final SubLObject definition = $sym98$DEFINITION;
    final SubLObject position = $sym99$POSITION;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( xrm_var, xrm ) ), ConsesLow.list( $sym86$DO_LIST, ConsesLow.list( definition, ConsesLow.list( $sym100$XRM_GLOBAL_DEFINITIONS, xrm_var ), $kw81$DONE,
        done ), ConsesLow.listS( $sym88$CDESTRUCTURING_BIND, reader.bq_cons( global, position ), definition, ConsesLow.list( $sym89$IGNORE, position ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 8238L)
  public static SubLObject xrm_global_definitions(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return xref_m_global_definitions( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 8400L)
  public static SubLObject do_xrm_globals(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject global = NIL;
    SubLObject xrm = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    global = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    xrm = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      if( NIL == conses_high.member( current_$4, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw81$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject xrm_var = $sym102$XRM_VAR;
    final SubLObject position = $sym103$POSITION;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( xrm_var, xrm ) ), ConsesLow.listS( $sym93$DO_DICTIONARY, ConsesLow.list( global, position, ConsesLow.list( $sym104$XRM_GLOBAL_POSITION_TABLE,
        xrm_var ), done ), ConsesLow.list( $sym89$IGNORE, position ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 8671L)
  public static SubLObject xrm_global_position_table(final SubLObject xrm)
  {
    return xref_m_global_position_table( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 8795L)
  public static SubLObject xrm_name(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return xref_m_name( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 8898L)
  public static SubLObject xrm_xref_system(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return xref_m_xref_system( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9003L)
  public static SubLObject xrm_module_features(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return xref_m_features( xrm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9109L)
  public static SubLObject xrm_method_definition_count(final SubLObject xrm, final SubLObject method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    return Sequences.count( method, xref_m_method_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9389L)
  public static SubLObject xrm_total_method_definition_count(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return Sequences.length( xref_m_method_definitions( xrm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9528L)
  public static SubLObject xrm_total_method_count(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return dictionary.dictionary_length( xref_m_method_position_table( xrm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9670L)
  public static SubLObject xrm_has_multiple_method_definitionsP(final SubLObject xrm)
  {
    return makeBoolean( !xrm_total_method_definition_count( xrm ).numE( xrm_total_method_count( xrm ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 9820L)
  public static SubLObject xrm_global_definition_count(final SubLObject xrm, final SubLObject global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    return Sequences.count( global, xref_m_global_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 10087L)
  public static SubLObject xrm_total_global_definition_count(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return Sequences.length( xref_m_global_definitions( xrm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 10226L)
  public static SubLObject xrm_total_global_count(final SubLObject xrm)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    return dictionary.dictionary_length( xref_m_global_position_table( xrm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 10368L)
  public static SubLObject xrm_has_multiple_global_definitionsP(final SubLObject xrm)
  {
    return makeBoolean( !xrm_total_global_definition_count( xrm ).numE( xrm_total_global_count( xrm ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 10518L)
  public static SubLObject xrm_method_definition_postion(final SubLObject xrm, final SubLObject method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    return dictionary.dictionary_lookup_without_values( xref_m_method_position_table( xrm ), method, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 10731L)
  public static SubLObject xrm_method_definition_positions(final SubLObject xrm, final SubLObject method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    SubLObject positions = NIL;
    SubLObject cdolist_list_var = xref_m_method_definitions( xrm );
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject candidate_method = NIL;
      SubLObject position = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
      candidate_method = current.first();
      current = ( position = current.rest() );
      if( candidate_method.eql( method ) )
      {
        positions = ConsesLow.cons( position, positions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return Sequences.nreverse( positions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 11100L)
  public static SubLObject xrm_global_definition_postion(final SubLObject xrm, final SubLObject global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    return dictionary.dictionary_lookup_without_values( xref_m_global_position_table( xrm ), global, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 11313L)
  public static SubLObject xrm_global_definition_positions(final SubLObject xrm, final SubLObject global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    SubLObject positions = NIL;
    SubLObject cdolist_list_var = xref_m_global_definitions( xrm );
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject candidate_global = NIL;
      SubLObject position = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
      candidate_global = current.first();
      current = ( position = current.rest() );
      if( candidate_global.eql( global ) )
      {
        positions = ConsesLow.cons( position, positions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return Sequences.nreverse( positions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 11682L)
  public static SubLObject xrm_method_formal_arglist(final SubLObject xrm, final SubLObject method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    return dictionary.dictionary_lookup_without_values( xref_m_method_formal_arglist_table( xrm ), method, $kw109$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 11906L)
  public static SubLObject xrm_global_binding_type(final SubLObject xrm, final SubLObject global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    return dictionary.dictionary_lookup_without_values( xref_m_global_binding_type_table( xrm ), global, $kw109$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 12125L)
  public static SubLObject xrm_record_method_definition(final SubLObject xrm, final SubLObject method, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    _csetf_xref_m_method_definitions( xrm, ConsesLow.cons( ConsesLow.cons( method, position ), xref_m_method_definitions( xrm ) ) );
    dictionary.dictionary_enter( xrm_method_position_table( xrm ), method, position );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 12474L)
  public static SubLObject xrm_unrecord_method_definition(final SubLObject xrm, final SubLObject method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    _csetf_xref_m_method_definitions( xrm, Sequences.delete( method, xref_m_method_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    dictionary.dictionary_remove( xrm_method_position_table( xrm ), method );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 12773L)
  public static SubLObject xrm_record_method_formal_arglist(final SubLObject xrm, final SubLObject method, final SubLObject formal_arglist)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( method ) : method;
    assert NIL != Types.listp( formal_arglist ) : formal_arglist;
    dictionary.dictionary_enter( xref_m_method_formal_arglist_table( xrm ), method, formal_arglist );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 13047L)
  public static SubLObject xrm_record_global_binding_type(final SubLObject xrm, final SubLObject global, final SubLObject binding_type)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    assert NIL != form_translation.binding_type_p( binding_type ) : binding_type;
    dictionary.dictionary_enter( xref_m_global_binding_type_table( xrm ), global, binding_type );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 13320L)
  public static SubLObject xrm_record_global_definition(final SubLObject xrm, final SubLObject global, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    _csetf_xref_m_global_definitions( xrm, ConsesLow.cons( ConsesLow.cons( global, position ), xref_m_global_definitions( xrm ) ) );
    dictionary.dictionary_enter( xrm_global_position_table( xrm ), global, position );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 13646L)
  public static SubLObject xrm_unrecord_global_definition(final SubLObject xrm, final SubLObject global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( global ) : global;
    _csetf_xref_m_global_definitions( xrm, Sequences.delete( global, xref_m_global_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    dictionary.dictionary_remove( xrm_global_position_table( xrm ), global );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 13945L)
  public static SubLObject xrm_record_method_calls_method(final SubLObject xrm, final SubLObject defined_method, final SubLObject referenced_method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_method ) : defined_method;
    assert NIL != Types.symbolp( referenced_method ) : referenced_method;
    dictionary_utilities.dictionary_pushnew( xref_m_method_method_table( xrm ), defined_method, referenced_method, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 14251L)
  public static SubLObject xrm_record_method_references_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject referenced_global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_method ) : defined_method;
    assert NIL != Types.symbolp( referenced_global ) : referenced_global;
    dictionary_utilities.dictionary_pushnew( xref_m_method_global_reference_table( xrm ), defined_method, referenced_global, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 14573L)
  public static SubLObject xrm_record_method_modifies_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject modified_global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_method ) : defined_method;
    assert NIL != Types.symbolp( modified_global ) : modified_global;
    dictionary_utilities.dictionary_pushnew( xref_m_method_global_modification_table( xrm ), defined_method, modified_global, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 14889L)
  public static SubLObject xrm_record_method_rebinds_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject rebound_global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_method ) : defined_method;
    assert NIL != Types.symbolp( rebound_global ) : rebound_global;
    dictionary_utilities.dictionary_pushnew( xref_m_method_global_binding_table( xrm ), defined_method, rebound_global, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 15196L)
  public static SubLObject xrm_record_global_calls_method(final SubLObject xrm, final SubLObject defined_global, final SubLObject referenced_method)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_global ) : defined_global;
    assert NIL != Types.symbolp( referenced_method ) : referenced_method;
    dictionary_utilities.dictionary_pushnew( xref_m_global_method_table( xrm ), defined_global, referenced_method, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 15503L)
  public static SubLObject xrm_record_global_references_global(final SubLObject xrm, final SubLObject defined_global, final SubLObject referenced_global)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( defined_global ) : defined_global;
    assert NIL != Types.symbolp( referenced_global ) : referenced_global;
    dictionary_utilities.dictionary_pushnew( xref_m_global_global_reference_table( xrm ), defined_global, referenced_global, Symbols.symbol_function( EQ ), UNPROVIDED );
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 15824L)
  public static SubLObject xrm_record_top_calls_method(final SubLObject xrm, final SubLObject referenced_method, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( referenced_method ) : referenced_method;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    SubLObject positions = dictionary.dictionary_lookup_without_values( xref_m_top_method_table( xrm ), referenced_method, UNPROVIDED );
    if( !position.eql( positions.first() ) )
    {
      positions = ConsesLow.cons( position, positions );
      dictionary.dictionary_enter( xref_m_top_method_table( xrm ), referenced_method, positions );
    }
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 16305L)
  public static SubLObject xrm_record_top_references_global(final SubLObject xrm, final SubLObject referenced_global, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( referenced_global ) : referenced_global;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    SubLObject positions = dictionary.dictionary_lookup_without_values( xref_m_top_global_reference_table( xrm ), referenced_global, UNPROVIDED );
    if( !position.eql( positions.first() ) )
    {
      positions = ConsesLow.cons( position, positions );
      dictionary.dictionary_enter( xref_m_top_global_reference_table( xrm ), referenced_global, positions );
    }
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 16811L)
  public static SubLObject xrm_record_top_modifies_global(final SubLObject xrm, final SubLObject modified_global, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( modified_global ) : modified_global;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    SubLObject positions = dictionary.dictionary_lookup_without_values( xref_m_top_global_modification_table( xrm ), modified_global, UNPROVIDED );
    if( !position.eql( positions.first() ) )
    {
      positions = ConsesLow.cons( position, positions );
      dictionary.dictionary_enter( xref_m_top_global_modification_table( xrm ), modified_global, positions );
    }
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17313L)
  public static SubLObject xrm_record_top_rebinds_global(final SubLObject xrm, final SubLObject rebound_global, SubLObject position)
  {
    assert NIL != xref_module_p( xrm ) : xrm;
    assert NIL != Types.symbolp( rebound_global ) : rebound_global;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    SubLObject positions = dictionary.dictionary_lookup_without_values( xref_m_top_global_binding_table( xrm ), rebound_global, UNPROVIDED );
    if( !position.eql( positions.first() ) )
    {
      positions = ConsesLow.cons( position, positions );
      dictionary.dictionary_enter( xref_m_top_global_binding_table( xrm ), rebound_global, positions );
    }
    return xrm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_system_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_xref_system( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_system_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $xref_system_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_name(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_features(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_xref_module_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_method_definition_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_definition_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_method_called_by_method_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_method_called_by_global_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_method_called_at_top_level_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_referenced_by_method_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_modified_by_method_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_rebound_by_method_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_referenced_by_global_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_referenced_at_top_level_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_modified_at_top_level_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject xref_s_global_rebound_at_top_level_table(final SubLObject v_object)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_features(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_xref_module_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_method_definition_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_definition_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_method_called_by_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_method_called_by_global_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_method_called_at_top_level_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_referenced_by_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_modified_by_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_rebound_by_method_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_referenced_by_global_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_referenced_at_top_level_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_modified_at_top_level_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject _csetf_xref_s_global_rebound_at_top_level_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xref_system_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject make_xref_system(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $xref_system_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw47$NAME ) )
      {
        _csetf_xref_s_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$FEATURES ) )
      {
        _csetf_xref_s_features( v_new, current_value );
      }
      else if( pcase_var.eql( $kw151$XREF_MODULE_TABLE ) )
      {
        _csetf_xref_s_xref_module_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw152$METHOD_DEFINITION_TABLE ) )
      {
        _csetf_xref_s_method_definition_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw153$GLOBAL_DEFINITION_TABLE ) )
      {
        _csetf_xref_s_global_definition_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw154$METHOD_CALLED_BY_METHOD_TABLE ) )
      {
        _csetf_xref_s_method_called_by_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw155$METHOD_CALLED_BY_GLOBAL_TABLE ) )
      {
        _csetf_xref_s_method_called_by_global_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw156$METHOD_CALLED_AT_TOP_LEVEL_TABLE ) )
      {
        _csetf_xref_s_method_called_at_top_level_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw157$GLOBAL_REFERENCED_BY_METHOD_TABLE ) )
      {
        _csetf_xref_s_global_referenced_by_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw158$GLOBAL_MODIFIED_BY_METHOD_TABLE ) )
      {
        _csetf_xref_s_global_modified_by_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw159$GLOBAL_REBOUND_BY_METHOD_TABLE ) )
      {
        _csetf_xref_s_global_rebound_by_method_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw160$GLOBAL_REFERENCED_BY_GLOBAL_TABLE ) )
      {
        _csetf_xref_s_global_referenced_by_global_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw161$GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE ) )
      {
        _csetf_xref_s_global_referenced_at_top_level_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw162$GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE ) )
      {
        _csetf_xref_s_global_modified_at_top_level_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw163$GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE ) )
      {
        _csetf_xref_s_global_rebound_at_top_level_table( v_new, current_value );
      }
      else
      {
        Errors.error( $str66$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject visit_defstruct_xref_system(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw67$BEGIN, $sym164$MAKE_XREF_SYSTEM, FIFTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw47$NAME, xref_s_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw49$FEATURES, xref_s_features( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw151$XREF_MODULE_TABLE, xref_s_xref_module_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw152$METHOD_DEFINITION_TABLE, xref_s_method_definition_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw153$GLOBAL_DEFINITION_TABLE, xref_s_global_definition_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw154$METHOD_CALLED_BY_METHOD_TABLE, xref_s_method_called_by_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw155$METHOD_CALLED_BY_GLOBAL_TABLE, xref_s_method_called_by_global_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw156$METHOD_CALLED_AT_TOP_LEVEL_TABLE, xref_s_method_called_at_top_level_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw157$GLOBAL_REFERENCED_BY_METHOD_TABLE, xref_s_global_referenced_by_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw158$GLOBAL_MODIFIED_BY_METHOD_TABLE, xref_s_global_modified_by_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw159$GLOBAL_REBOUND_BY_METHOD_TABLE, xref_s_global_rebound_by_method_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw160$GLOBAL_REFERENCED_BY_GLOBAL_TABLE, xref_s_global_referenced_by_global_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw161$GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE, xref_s_global_referenced_at_top_level_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw162$GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE, xref_s_global_modified_at_top_level_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw163$GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE, xref_s_global_rebound_at_top_level_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw70$END, $sym164$MAKE_XREF_SYSTEM, FIFTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 17800L)
  public static SubLObject visit_defstruct_object_xref_system_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_xref_system( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 20170L)
  public static SubLObject print_xref_system(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      final SubLObject name = xrs_name( v_object );
      final SubLObject feature_count = Sequences.length( xref_s_features( v_object ) );
      final SubLObject module_count = xrs_module_count( v_object );
      PrintLow.format( stream, $str166$_A____S_features___S_modules, new SubLObject[] { name, feature_count, module_count
      } );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 20556L)
  public static SubLObject new_xref_system(final SubLObject name, final SubLObject features)
  {
    assert NIL != Types.stringp( name ) : name;
    assert NIL != list_utilities.non_dotted_list_p( features ) : features;
    SubLObject cdolist_list_var = features;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.symbolp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject method_count = $int167$10000;
    final SubLObject global_count = $int168$1000;
    final SubLObject module_count = $int169$500;
    final SubLObject xrs = make_xref_system( UNPROVIDED );
    _csetf_xref_s_name( xrs, name );
    _csetf_xref_s_features( xrs, features );
    _csetf_xref_s_xref_module_table( xrs, Hashtables.make_hash_table( module_count, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    _csetf_xref_s_method_definition_table( xrs, Hashtables.make_hash_table( method_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_definition_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_method_called_by_method_table( xrs, Hashtables.make_hash_table( method_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_method_called_by_global_table( xrs, Hashtables.make_hash_table( method_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_method_called_at_top_level_table( xrs, Hashtables.make_hash_table( method_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_referenced_by_method_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_modified_by_method_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_rebound_by_method_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_referenced_by_global_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_referenced_at_top_level_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_modified_at_top_level_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_xref_s_global_rebound_at_top_level_table( xrs, Hashtables.make_hash_table( global_count, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 22142L)
  public static SubLObject xrs_name(final SubLObject xrs)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    return xref_s_name( xrs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 22246L)
  public static SubLObject xrs_features(final SubLObject xrs)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    return xref_s_features( xrs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 22346L)
  public static SubLObject xrs_module_count(final SubLObject xrs)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    return Hashtables.hash_table_count( xref_s_xref_module_table( xrs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 22492L)
  public static SubLObject xrs_lookup_module(final SubLObject xrs, final SubLObject module_name)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.stringp( module_name ) : module_name;
    return Hashtables.gethash_without_values( module_name, xref_s_xref_module_table( xrs ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 22694L)
  public static SubLObject xrs_method_defining_xrm(final SubLObject xrs, final SubLObject method)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.symbolp( method ) : method;
    final SubLObject table = xref_s_method_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( method, table, NIL );
    if( NIL != xref_module_p( xrm_data ) )
    {
      return xrm_data;
    }
    return xrm_data.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 23003L)
  public static SubLObject xrs_method_defining_xrms(final SubLObject xrs, final SubLObject method)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.symbolp( method ) : method;
    final SubLObject table = xref_s_method_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( method, table, NIL );
    if( NIL != xref_module_p( xrm_data ) )
    {
      return ConsesLow.list( xrm_data );
    }
    return conses_high.copy_list( xrm_data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 23324L)
  public static SubLObject xrs_method_definition_count(final SubLObject xrs, final SubLObject method)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    final SubLObject table = xref_s_method_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( method, table, NIL );
    SubLObject count = ZERO_INTEGER;
    if( NIL != xref_module_p( xrm_data ) )
    {
      final SubLObject xrm = xrm_data;
      count = Numbers.add( count, xrm_method_definition_count( xrm, method ) );
    }
    else
    {
      SubLObject cdolist_list_var = xrm_data;
      SubLObject xrm2 = NIL;
      xrm2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, xrm_method_definition_count( xrm2, method ) );
        cdolist_list_var = cdolist_list_var.rest();
        xrm2 = cdolist_list_var.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 23762L)
  public static SubLObject xrs_global_defining_xrm(final SubLObject xrs, final SubLObject global)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject table = xref_s_global_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( global, table, NIL );
    if( NIL != xref_module_p( xrm_data ) )
    {
      return xrm_data;
    }
    return xrm_data.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 24072L)
  public static SubLObject xrs_global_defining_xrms(final SubLObject xrs, final SubLObject global)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject table = xref_s_global_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( global, table, NIL );
    if( NIL != xref_module_p( xrm_data ) )
    {
      return ConsesLow.list( xrm_data );
    }
    return conses_high.copy_list( xrm_data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 24393L)
  public static SubLObject xrs_global_definition_count(final SubLObject xrs, final SubLObject global)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    final SubLObject table = xref_s_global_definition_table( xrs );
    final SubLObject xrm_data = Hashtables.gethash_without_values( global, table, NIL );
    SubLObject count = ZERO_INTEGER;
    if( NIL != xref_module_p( xrm_data ) )
    {
      final SubLObject xrm = xrm_data;
      count = Numbers.add( count, xrm_global_definition_count( xrm, global ) );
    }
    else
    {
      SubLObject cdolist_list_var = xrm_data;
      SubLObject xrm2 = NIL;
      xrm2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, xrm_global_definition_count( xrm2, global ) );
        cdolist_list_var = cdolist_list_var.rest();
        xrm2 = cdolist_list_var.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 24831L)
  public static SubLObject xrs_possibly_note_module_features(final SubLObject xrs, final SubLObject module, final SubLObject new_features)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != Types.stringp( module ) : module;
    final SubLObject xrm = xrs_lookup_module( xrs, module );
    if( NIL != xrm )
    {
      final SubLObject old_features = xrm_module_features( xrm );
      if( !old_features.equal( new_features ) )
      {
        Errors.warn( $str170$Module__A_features_changed_to__S, module, new_features );
        _csetf_xref_m_features( xrm, new_features );
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 25336L)
  public static SubLObject current_xref_system()
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return system_translation.sys_tran_xref_database( sys_tran );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 25579L)
  public static SubLObject current_xref_system_modules()
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return conses_high.copy_list( system_translation.sys_tran_modules( sys_tran ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 25754L)
  public static SubLObject current_xref_system_features()
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return conses_high.copy_tree( system_translation.sys_tran_features( sys_tran ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 25931L)
  public static SubLObject current_xref_system_relevant_modules(final SubLObject candidate_modules)
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      SubLObject relevant_modules = NIL;
      SubLObject cdolist_list_var = candidate_modules;
      SubLObject module = NIL;
      module = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != system_translation.sys_tran_includes_moduleP( sys_tran, module ) )
        {
          relevant_modules = ConsesLow.cons( module, relevant_modules );
        }
        cdolist_list_var = cdolist_list_var.rest();
        module = cdolist_list_var.first();
      }
      return Sequences.nreverse( relevant_modules );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 26282L)
  public static SubLObject current_xref_module_p(final SubLObject module)
  {
    return list_utilities.sublisp_boolean( xref_find_xrm_by_module( module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 26457L)
  public static SubLObject xref_find_xrm_by_module(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      return xrs_lookup_module( xrs, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 26636L)
  public static SubLObject xref_module_features(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return conses_high.copy_tree( system_translation.sys_tran_module_features( sys_tran, module ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 26855L)
  public static SubLObject xref_module_input_filename(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return system_translation.sys_tran_module_input_filename( sys_tran, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 27074L)
  public static SubLObject xref_predefined_method_p(final SubLObject method)
  {
    assert NIL != Types.symbolp( method ) : method;
    if( method.isMacroOperator() )
    {
      return makeBoolean( !control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( method ) ) );
    }
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL == sys_tran )
    {
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject backend = pcase_var = system_translation.sys_tran_backend( sys_tran );
    if( pcase_var.eql( $kw171$SL2C ) )
    {
      return c_name_translation.c_backend_predefined_function_p( method );
    }
    if( pcase_var.eql( $kw172$SL2JAVA ) )
    {
      return java_name_translation.java_backend_predefined_function_p( method );
    }
    return Errors.error( $str173$Unexpected_backend__S, backend );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 27622L)
  public static SubLObject xref_predefined_global_p(final SubLObject global)
  {
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL == sys_tran )
    {
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject backend = pcase_var = system_translation.sys_tran_backend( sys_tran );
    if( pcase_var.eql( $kw171$SL2C ) )
    {
      return c_name_translation.c_backend_predefined_global_p( global );
    }
    if( pcase_var.eql( $kw172$SL2JAVA ) )
    {
      return java_name_translation.java_backend_predefined_global_p( global );
    }
    return Errors.error( $str173$Unexpected_backend__S, backend );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 28035L)
  public static SubLObject xref_method_formal_arglist(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject xrm = xrs_method_defining_xrm( xrs, method );
      if( NIL != xrm )
      {
        return xrm_method_formal_arglist( xrm, method );
      }
    }
    return $kw109$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 28418L)
  public static SubLObject method_formal_arglist(final SubLObject method)
  {
    assert NIL != Types.symbolp( method ) : method;
    SubLObject arglist = xref_method_formal_arglist( method );
    if( arglist == $kw109$UNSPECIFIED && NIL != subl_promotions.function_symbol_p( method ) )
    {
      arglist = subl_promotions.function_symbol_arglist( method );
    }
    return arglist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 28850L)
  public static SubLObject xref_global_binding_type(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject xrm = xrs_global_defining_xrm( xrs, global );
      if( NIL != xrm )
      {
        return xrm_global_binding_type( xrm, global );
      }
    }
    return $kw109$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 29225L)
  public static SubLObject xref_method_definition_count(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    return ( NIL != xrs ) ? xrs_method_definition_count( xrs, method ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 29578L)
  public static SubLObject xref_method_undefinedP(final SubLObject method)
  {
    return Numbers.numE( ZERO_INTEGER, xref_method_definition_count( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 29745L)
  public static SubLObject xref_method_defining_xrm(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      return xrs_method_defining_xrm( xrs, method );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 29901L)
  public static SubLObject xref_method_defining_module(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    return ( NIL != xrm ) ? xrm_name( xrm ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 30133L)
  public static SubLObject xref_method_has_multiple_definitionsP(final SubLObject method)
  {
    return Numbers.numLE( TWO_INTEGER, xref_method_definition_count( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 30327L)
  public static SubLObject xref_method_defining_modules(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrs_method_defining_xrms( xrs, method ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 30603L)
  public static SubLObject xref_global_definition_count(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    return ( NIL != xrs ) ? xrs_global_definition_count( xrs, global ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 30956L)
  public static SubLObject xref_global_undefinedP(final SubLObject global)
  {
    return Numbers.numE( ZERO_INTEGER, xref_global_definition_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 31123L)
  public static SubLObject xref_global_defining_xrm(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      return xrs_global_defining_xrm( xrs, global );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 31279L)
  public static SubLObject xref_global_defining_module(final SubLObject global)
  {
    final SubLObject xrm = xref_global_defining_xrm( global );
    return ( NIL != xrm ) ? xrm_name( xrm ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 31511L)
  public static SubLObject xref_global_has_multiple_definitionsP(final SubLObject global)
  {
    return Numbers.numLE( TWO_INTEGER, xref_global_definition_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 31706L)
  public static SubLObject xref_global_defining_modules(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrs_global_defining_xrms( xrs, global ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 31982L)
  public static SubLObject xref_method_definition_position(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject xrm = xrs_method_defining_xrm( xrs, method );
      if( NIL != xrm )
      {
        return xrm_method_definition_postion( xrm, method );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 32368L)
  public static SubLObject xref_method_definition_positions(final SubLObject method)
  {
    final SubLObject pcase_var = xref_method_definition_count( method );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      final SubLObject module = xref_method_defining_module( method );
      final SubLObject position = xref_method_definition_position( method );
      return ConsesLow.list( ConsesLow.cons( module, position ) );
    }
    final SubLObject xrs = current_xref_system();
    SubLObject results = NIL;
    SubLObject cdolist_list_var = xrs_method_defining_xrms( xrs, method );
    SubLObject xrm = NIL;
    xrm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject module2 = xrm_name( xrm );
      SubLObject cdolist_list_var_$5;
      final SubLObject positions = cdolist_list_var_$5 = xrm_method_definition_positions( xrm, method );
      SubLObject position2 = NIL;
      position2 = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        results = ConsesLow.cons( ConsesLow.cons( module2, position2 ), results );
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        position2 = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      xrm = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 33131L)
  public static SubLObject xref_global_definition_position(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject xrm = xrs_global_defining_xrm( xrs, global );
      if( NIL != xrm )
      {
        return xrm_global_definition_postion( xrm, global );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 33517L)
  public static SubLObject xref_global_definition_positions(final SubLObject global)
  {
    final SubLObject pcase_var = xref_global_definition_count( global );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      final SubLObject module = xref_global_defining_module( global );
      final SubLObject position = xref_global_definition_position( global );
      return ConsesLow.list( ConsesLow.cons( module, position ) );
    }
    final SubLObject xrs = current_xref_system();
    SubLObject results = NIL;
    SubLObject cdolist_list_var = xrs_global_defining_xrms( xrs, global );
    SubLObject xrm = NIL;
    xrm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject module2 = xrm_name( xrm );
      SubLObject cdolist_list_var_$6;
      final SubLObject positions = cdolist_list_var_$6 = xrm_global_definition_positions( xrm, global );
      SubLObject position2 = NIL;
      position2 = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        results = ConsesLow.cons( ConsesLow.cons( module2, position2 ), results );
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        position2 = cdolist_list_var_$6.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      xrm = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 34281L)
  public static SubLObject xref_methods_defined_by_module(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return NIL;
    }
    final SubLObject v_methods = Sequences.nreverse( Mapping.mapcar( Symbols.symbol_function( $sym106$CAR ), xrm_method_definitions( xrm ) ) );
    if( NIL != xrm_has_multiple_method_definitionsP( xrm ) )
    {
      return list_utilities.fast_delete_duplicates( v_methods, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_methods;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 34756L)
  public static SubLObject xref_module_method_definition_count(final SubLObject module, final SubLObject method)
  {
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.symbolp( method ) : method;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return ZERO_INTEGER;
    }
    if( NIL != xrm_has_multiple_method_definitionsP( xrm ) )
    {
      return Sequences.count( method, xrm_method_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED );
    }
    return ( NIL != dictionary.dictionary_lookup_without_values( xrm_method_position_table( xrm ), method, UNPROVIDED ) ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 35238L)
  public static SubLObject xref_module_method_definition_positions(final SubLObject module, final SubLObject method)
  {
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.symbolp( method ) : method;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return NIL;
    }
    if( NIL != xrm_has_multiple_method_definitionsP( xrm ) )
    {
      final SubLObject all_position_info = xrm_method_definitions( xrm );
      final SubLObject position_info = Sequences.remove( method, all_position_info, Symbols.symbol_function( $sym175$NOT_EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject positions = list_utilities.nmapcar( Symbols.symbol_function( $sym176$CDR ), position_info );
      return positions;
    }
    final SubLObject table = xrm_method_position_table( xrm );
    final SubLObject position = dictionary.dictionary_lookup_without_values( table, method, UNPROVIDED );
    return ( NIL != position ) ? ConsesLow.list( position ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 35953L)
  public static SubLObject xref_globals_defined_by_module(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return NIL;
    }
    final SubLObject globals = Sequences.nreverse( Mapping.mapcar( Symbols.symbol_function( $sym106$CAR ), xrm_global_definitions( xrm ) ) );
    if( NIL != xrm_has_multiple_global_definitionsP( xrm ) )
    {
      return list_utilities.fast_delete_duplicates( globals, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return globals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 36428L)
  public static SubLObject xref_module_global_definition_count(final SubLObject module, final SubLObject global)
  {
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return ZERO_INTEGER;
    }
    if( NIL != xrm_has_multiple_global_definitionsP( xrm ) )
    {
      return Sequences.count( global, xrm_global_definitions( xrm ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED );
    }
    return ( NIL != dictionary.dictionary_lookup_without_values( xrm_global_position_table( xrm ), global, UNPROVIDED ) ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 36910L)
  public static SubLObject xref_module_global_definition_positions(final SubLObject module, final SubLObject global)
  {
    assert NIL != Types.stringp( module ) : module;
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL == xrm )
    {
      return NIL;
    }
    if( NIL != xrm_has_multiple_global_definitionsP( xrm ) )
    {
      final SubLObject all_position_info = xrm_global_definitions( xrm );
      final SubLObject position_info = Sequences.remove( global, all_position_info, Symbols.symbol_function( $sym175$NOT_EQ ), Symbols.symbol_function( $sym106$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject positions = list_utilities.nmapcar( Symbols.symbol_function( $sym176$CDR ), position_info );
      return positions;
    }
    final SubLObject table = xrm_global_position_table( xrm );
    final SubLObject position = dictionary.dictionary_lookup_without_values( table, global, UNPROVIDED );
    return ( NIL != position ) ? ConsesLow.list( position ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 37625L)
  public static SubLObject xref_method_called_by_methodP(final SubLObject client_method, final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_method_method_table( xrm );
      final SubLObject method_set = dictionary.dictionary_lookup_without_values( table, method, NIL );
      return list_utilities.member_eqP( client_method, method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 38016L)
  public static SubLObject xref_methods_called_by_method(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_method_method_table( xrm );
      final SubLObject method_set = dictionary.dictionary_lookup_without_values( table, method, NIL );
      return conses_high.copy_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 38350L)
  public static SubLObject xref_globals_referenced_by_method(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_method_global_reference_table( xrm );
      final SubLObject global_set = dictionary.dictionary_lookup_without_values( table, method, NIL );
      return conses_high.copy_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 38703L)
  public static SubLObject xref_globals_modified_by_method(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_method_global_modification_table( xrm );
      final SubLObject global_set = dictionary.dictionary_lookup_without_values( table, method, NIL );
      return conses_high.copy_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 39055L)
  public static SubLObject xref_globals_rebound_by_method(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_method_global_binding_table( xrm );
      final SubLObject global_set = dictionary.dictionary_lookup_without_values( table, method, NIL );
      return conses_high.copy_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 39399L)
  public static SubLObject xref_globals_accessed_by_method(final SubLObject method)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( xref_globals_referenced_by_method( method ), xref_globals_modified_by_method( method ), xref_globals_rebound_by_method( method ) ), Symbols
        .symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 39741L)
  public static SubLObject xref_method_called_by_globalP(final SubLObject client_method, final SubLObject global)
  {
    final SubLObject xrm = xref_global_defining_xrm( global );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_global_method_table( xrm );
      final SubLObject method_set = dictionary.dictionary_lookup_without_values( table, global, NIL );
      return list_utilities.member_eqP( client_method, method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 40132L)
  public static SubLObject xref_methods_called_by_global(final SubLObject global)
  {
    final SubLObject xrm = xref_global_defining_xrm( global );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_global_method_table( xrm );
      final SubLObject method_set = dictionary.dictionary_lookup_without_values( table, global, NIL );
      return conses_high.copy_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 40466L)
  public static SubLObject xref_globals_referenced_by_global(final SubLObject global)
  {
    final SubLObject xrm = xref_global_defining_xrm( global );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_global_global_reference_table( xrm );
      final SubLObject global_set = dictionary.dictionary_lookup_without_values( table, global, NIL );
      return conses_high.copy_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 40818L)
  public static SubLObject xref_method_called_by_moduleP(final SubLObject client_method, final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_method_table( xrm );
      final SubLObject positions = dictionary.dictionary_lookup_without_values( table, client_method, NIL );
      return list_utilities.sublisp_boolean( positions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 41236L)
  public static SubLObject xref_module_positions_calling_method(final SubLObject module, final SubLObject client_method)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_method_table( xrm );
      final SubLObject positions = dictionary.dictionary_lookup_without_values( table, client_method, NIL );
      return conses_high.copy_list( positions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 41626L)
  public static SubLObject xref_methods_called_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_method_table( xrm );
      return dictionary.dictionary_keys( table );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 41906L)
  public static SubLObject xref_module_positions_referencing_global(final SubLObject module, final SubLObject client_global)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_reference_table( xrm );
      final SubLObject positions = dictionary.dictionary_lookup_without_values( table, client_global, NIL );
      return conses_high.copy_list( positions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 42324L)
  public static SubLObject xref_globals_referenced_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_reference_table( xrm );
      return dictionary.dictionary_keys( table );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 42624L)
  public static SubLObject xref_module_positions_modifying_global(final SubLObject module, final SubLObject client_global)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_modification_table( xrm );
      final SubLObject positions = dictionary.dictionary_lookup_without_values( table, client_global, NIL );
      return conses_high.copy_list( positions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 43040L)
  public static SubLObject xref_globals_modified_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_modification_table( xrm );
      return dictionary.dictionary_keys( table );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 43339L)
  public static SubLObject xref_module_positions_rebinding_global(final SubLObject module, final SubLObject client_global)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_binding_table( xrm );
      final SubLObject positions = dictionary.dictionary_lookup_without_values( table, client_global, NIL );
      return conses_high.copy_list( positions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 43750L)
  public static SubLObject xref_globals_rebound_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      final SubLObject table = xref_m_top_global_binding_table( xrm );
      return dictionary.dictionary_keys( table );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 44042L)
  public static SubLObject xref_module_positions_accessing_global(final SubLObject module, final SubLObject client_global)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( xref_module_positions_referencing_global( module, client_global ), xref_module_positions_modifying_global( module, client_global ),
        xref_module_positions_rebinding_global( module, client_global ) ), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 44510L)
  public static SubLObject xref_globals_accessed_by_module(final SubLObject module)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( xref_globals_referenced_by_module( module ), xref_globals_modified_by_module( module ), xref_globals_rebound_by_module( module ) ), Symbols
        .symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 44874L)
  public static SubLObject xref_methods_that_call_method(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_method_called_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      return set_contents.set_contents_element_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 45239L)
  public static SubLObject xref_globals_that_call_method(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_method_called_by_global_table( xrs );
      final SubLObject global_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      return set_contents.set_contents_element_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 45591L)
  public static SubLObject xrms_that_call_method(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_method_called_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      return set_contents.set_contents_element_list( xrm_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 45941L)
  public static SubLObject xref_modules_that_call_method(final SubLObject method)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_call_method( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 46132L)
  public static SubLObject xref_method_call_count(final SubLObject method)
  {
    final SubLObject xrs = current_xref_system();
    SubLObject count = ZERO_INTEGER;
    if( NIL != xrs )
    {
      SubLObject table = xref_s_method_called_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( method_set ) );
      table = xref_s_method_called_by_global_table( xrs );
      final SubLObject global_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( global_set ) );
      table = xref_s_method_called_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( method, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( xrm_set ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 46816L)
  public static SubLObject xref_method_unused_p(final SubLObject method)
  {
    return Numbers.numE( ZERO_INTEGER, xref_method_call_count( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 46949L)
  public static SubLObject xref_methods_that_reference_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_referenced_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 47331L)
  public static SubLObject xref_globals_that_reference_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_referenced_by_global_table( xrs );
      final SubLObject global_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( global_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 47697L)
  public static SubLObject xrms_that_reference_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_referenced_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( xrm_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 48061L)
  public static SubLObject xref_modules_that_reference_global(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_reference_global( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 48268L)
  public static SubLObject xref_global_reference_count(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    SubLObject count = ZERO_INTEGER;
    if( NIL != xrs )
    {
      SubLObject table = xref_s_global_referenced_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( method_set ) );
      table = xref_s_global_referenced_by_global_table( xrs );
      final SubLObject global_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( global_set ) );
      table = xref_s_global_referenced_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( xrm_set ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 48981L)
  public static SubLObject xref_global_never_referenced_p(final SubLObject global)
  {
    return Numbers.numE( ZERO_INTEGER, xref_global_reference_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 49133L)
  public static SubLObject xref_methods_that_modify_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_modified_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 49476L)
  public static SubLObject xrms_that_modify_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_modified_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( xrm_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 49832L)
  public static SubLObject xref_modules_that_modify_global(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_modify_global( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 50030L)
  public static SubLObject xref_global_modification_count(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    SubLObject count = ZERO_INTEGER;
    if( NIL != xrs )
    {
      SubLObject table = xref_s_global_modified_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( method_set ) );
      table = xref_s_global_modified_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( xrm_set ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 50567L)
  public static SubLObject xref_global_never_modified_p(final SubLObject global)
  {
    return Numbers.numE( ZERO_INTEGER, xref_global_modification_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 50723L)
  public static SubLObject xref_methods_that_rebind_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_rebound_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( method_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 51065L)
  public static SubLObject xrms_that_rebind_global(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject table = xref_s_global_rebound_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      return set_contents.set_contents_element_list( xrm_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 51420L)
  public static SubLObject xref_modules_that_rebind_global(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_rebind_global( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 51618L)
  public static SubLObject xref_global_binding_count(final SubLObject global)
  {
    final SubLObject xrs = current_xref_system();
    SubLObject count = ZERO_INTEGER;
    if( NIL != xrs )
    {
      SubLObject table = xref_s_global_rebound_by_method_table( xrs );
      final SubLObject method_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( method_set ) );
      table = xref_s_global_rebound_at_top_level_table( xrs );
      final SubLObject xrm_set = Hashtables.gethash_without_values( global, table, UNPROVIDED );
      count = Numbers.add( count, set_contents.set_contents_size( xrm_set ) );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 52148L)
  public static SubLObject xref_global_never_rebound_p(final SubLObject global)
  {
    return Numbers.numE( ZERO_INTEGER, xref_global_binding_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 52295L)
  public static SubLObject xref_methods_that_access_global(final SubLObject global)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( xref_methods_that_reference_global( global ), xref_methods_that_modify_global( global ), xref_methods_that_rebind_global( global ) ), Symbols
        .symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 52637L)
  public static SubLObject xrms_that_access_global(final SubLObject global)
  {
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( xrms_that_reference_global( global ), xrms_that_modify_global( global ), xrms_that_rebind_global( global ) ), Symbols.symbol_function( EQ ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 52951L)
  public static SubLObject xref_modules_that_access_global(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_access_global( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 53158L)
  public static SubLObject xref_global_access_count(final SubLObject global)
  {
    return Numbers.add( xref_global_reference_count( global ), xref_global_modification_count( global ), xref_global_binding_count( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 53437L)
  public static SubLObject xref_global_never_accessed_p(final SubLObject global)
  {
    return makeBoolean( NIL != xref_global_never_referenced_p( global ) && NIL != xref_global_never_modified_p( global ) && NIL != xref_global_never_rebound_p( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 53716L)
  public static SubLObject xref_xrms_accessed_by_method(final SubLObject method)
  {
    final SubLObject xrm = xref_method_defining_xrm( method );
    if( NIL != xrm )
    {
      SubLObject accessed_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
      SubLObject table = xref_m_method_global_reference_table( xrm );
      SubLObject cdolist_list_var;
      final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, NIL );
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_global_defining_xrm( referenced_global );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
      table = xref_m_method_global_modification_table( xrm );
      final SubLObject modified_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, NIL );
      SubLObject modified_global = NIL;
      modified_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_global_defining_xrm( modified_global );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        modified_global = cdolist_list_var.first();
      }
      table = xref_m_method_global_binding_table( xrm );
      final SubLObject rebound_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, NIL );
      SubLObject rebound_global = NIL;
      rebound_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_global_defining_xrm( rebound_global );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        rebound_global = cdolist_list_var.first();
      }
      table = xref_m_method_method_table( xrm );
      final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, NIL );
      SubLObject called_method = NIL;
      called_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_method_defining_xrm( called_method );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        called_method = cdolist_list_var.first();
      }
      return set_contents.set_contents_element_list( accessed_xrms );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 55504L)
  public static SubLObject xref_modules_accessed_by_method(final SubLObject method)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xref_xrms_accessed_by_method( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 55702L)
  public static SubLObject xref_xrms_accessed_by_global(final SubLObject global)
  {
    final SubLObject xrm = xref_global_defining_xrm( global );
    if( NIL != xrm )
    {
      SubLObject accessed_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
      SubLObject table = xref_m_global_global_reference_table( xrm );
      SubLObject cdolist_list_var;
      final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, global, NIL );
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_global_defining_xrm( referenced_global );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
      table = xref_m_global_method_table( xrm );
      final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, global, NIL );
      SubLObject called_method = NIL;
      called_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject accessed_xrm = xref_method_defining_xrm( called_method );
        if( NIL != accessed_xrm )
        {
          accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        called_method = cdolist_list_var.first();
      }
      return set_contents.set_contents_element_list( accessed_xrms );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 56725L)
  public static SubLObject xref_modules_accessed_by_global(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xref_xrms_accessed_by_global( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 56923L)
  public static SubLObject xref_xrms_accessed_by_xrm(final SubLObject xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != xref_module_p( xrm ) : xrm;
    SubLObject accessed_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    SubLObject table = xref_m_top_global_reference_table( xrm );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject accessed_xrm = xref_global_defining_xrm( referenced_global );
      if( NIL != accessed_xrm )
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    table = xref_m_top_global_modification_table( xrm );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject accessed_xrm = xref_global_defining_xrm( modified_global );
      if( NIL != accessed_xrm )
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    table = xref_m_top_global_binding_table( xrm );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject accessed_xrm = xref_global_defining_xrm( rebound_global );
      if( NIL != accessed_xrm )
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    table = xref_m_top_method_table( xrm );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject called_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject accessed_xrm = xref_method_defining_xrm( called_method );
      if( NIL != accessed_xrm )
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return set_contents.set_contents_element_list( accessed_xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 58461L)
  public static SubLObject xref_modules_accessed_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xref_xrms_accessed_by_xrm( xrm ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 58746L)
  public static SubLObject xref_xrms_accessed_anywhere_by_xrm(final SubLObject xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject accessed_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = xref_xrms_accessed_by_global( defined_global );
      SubLObject accessed_xrm = NIL;
      accessed_xrm = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        cdolist_list_var = cdolist_list_var.rest();
        accessed_xrm = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = xref_xrms_accessed_by_method( defined_method );
      SubLObject accessed_xrm = NIL;
      accessed_xrm = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        accessed_xrms = set_contents.set_contents_add( accessed_xrm, accessed_xrms, Symbols.symbol_function( EQ ) );
        cdolist_list_var = cdolist_list_var.rest();
        accessed_xrm = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    SubLObject cdolist_list_var2 = xref_xrms_accessed_by_xrm( xrm );
    SubLObject accessed_xrm2 = NIL;
    accessed_xrm2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      accessed_xrms = set_contents.set_contents_add( accessed_xrm2, accessed_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      accessed_xrm2 = cdolist_list_var2.first();
    }
    return set_contents.set_contents_element_list( accessed_xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 59550L)
  public static SubLObject xref_modules_accessed_anywhere_by_module(final SubLObject module)
  {
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xref_xrms_accessed_anywhere_by_xrm( xrm ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 59869L)
  public static SubLObject xref_globals_accessed_anywhere_by_module(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      SubLObject accessed_globals = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
      SubLObject xrm_var = xrm;
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( xrm_var ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = xref_globals_referenced_by_global( defined_global );
        SubLObject accessed_global = NIL;
        accessed_global = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accessed_globals = set_contents.set_contents_add( accessed_global, accessed_globals, Symbols.symbol_function( EQ ) );
          cdolist_list_var = cdolist_list_var.rest();
          accessed_global = cdolist_list_var.first();
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      xrm_var = xrm;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( xrm_var ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = xref_globals_accessed_by_method( defined_method );
        SubLObject accessed_global = NIL;
        accessed_global = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accessed_globals = set_contents.set_contents_add( accessed_global, accessed_globals, Symbols.symbol_function( EQ ) );
          cdolist_list_var = cdolist_list_var.rest();
          accessed_global = cdolist_list_var.first();
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      SubLObject cdolist_list_var2 = xref_globals_accessed_by_module( module );
      SubLObject accessed_global2 = NIL;
      accessed_global2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        accessed_globals = set_contents.set_contents_add( accessed_global2, accessed_globals, Symbols.symbol_function( EQ ) );
        cdolist_list_var2 = cdolist_list_var2.rest();
        accessed_global2 = cdolist_list_var2.first();
      }
      return set_contents.set_contents_element_list( accessed_globals );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 60913L)
  public static SubLObject xref_methods_accessed_anywhere_by_module(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject xrm = xref_find_xrm_by_module( module );
    if( NIL != xrm )
    {
      SubLObject accessed_methods = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
      SubLObject xrm_var = xrm;
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( xrm_var ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = xref_methods_called_by_global( defined_global );
        SubLObject accessed_method = NIL;
        accessed_method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accessed_methods = set_contents.set_contents_add( accessed_method, accessed_methods, Symbols.symbol_function( EQ ) );
          cdolist_list_var = cdolist_list_var.rest();
          accessed_method = cdolist_list_var.first();
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      xrm_var = xrm;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( xrm_var ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = xref_methods_called_by_method( defined_method );
        SubLObject accessed_method = NIL;
        accessed_method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accessed_methods = set_contents.set_contents_add( accessed_method, accessed_methods, Symbols.symbol_function( EQ ) );
          cdolist_list_var = cdolist_list_var.rest();
          accessed_method = cdolist_list_var.first();
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      SubLObject cdolist_list_var2 = xref_methods_called_by_module( module );
      SubLObject accessed_method2 = NIL;
      accessed_method2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        accessed_methods = set_contents.set_contents_add( accessed_method2, accessed_methods, Symbols.symbol_function( EQ ) );
        cdolist_list_var2 = cdolist_list_var2.rest();
        accessed_method2 = cdolist_list_var2.first();
      }
      return set_contents.set_contents_element_list( accessed_methods );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 61911L)
  public static SubLObject xrms_that_access_method(final SubLObject method)
  {
    SubLObject client_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    SubLObject cdolist_list_var = xref_globals_that_call_method( method );
    SubLObject client_global = NIL;
    client_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_xrm = xref_global_defining_xrm( client_global );
      client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_global = cdolist_list_var.first();
    }
    cdolist_list_var = xref_methods_that_call_method( method );
    SubLObject client_method = NIL;
    client_method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_xrm = xref_method_defining_xrm( client_method );
      client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_method = cdolist_list_var.first();
    }
    cdolist_list_var = xrms_that_call_method( method );
    SubLObject client_xrm2 = NIL;
    client_xrm2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      client_xrms = set_contents.set_contents_add( client_xrm2, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_xrm2 = cdolist_list_var.first();
    }
    return set_contents.set_contents_element_list( client_xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 62725L)
  public static SubLObject xref_modules_that_access_method(final SubLObject method)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_access_method( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 62928L)
  public static SubLObject xrms_that_access_global_anywhere(final SubLObject global)
  {
    SubLObject client_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    SubLObject cdolist_list_var = xref_globals_that_reference_global( global );
    SubLObject client_global = NIL;
    client_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_xrm = xref_global_defining_xrm( client_global );
      client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_global = cdolist_list_var.first();
    }
    cdolist_list_var = xref_methods_that_access_global( global );
    SubLObject client_method = NIL;
    client_method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_xrm = xref_method_defining_xrm( client_method );
      client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_method = cdolist_list_var.first();
    }
    cdolist_list_var = xrms_that_access_global( global );
    SubLObject client_xrm2 = NIL;
    client_xrm2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      client_xrms = set_contents.set_contents_add( client_xrm2, client_xrms, Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      client_xrm2 = cdolist_list_var.first();
    }
    return set_contents.set_contents_element_list( client_xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 63759L)
  public static SubLObject xref_modules_that_access_global_anywhere(final SubLObject global)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_access_global_anywhere( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 63897L)
  public static SubLObject xrms_that_access_xrm_anywhere(final SubLObject server_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject client_xrms = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( server_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject server_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = xrms_that_access_method( server_method );
      SubLObject client_xrm = NIL;
      client_xrm = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
        cdolist_list_var = cdolist_list_var.rest();
        client_xrm = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( server_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject server_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = xrms_that_access_global_anywhere( server_global );
      SubLObject client_xrm = NIL;
      client_xrm = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        client_xrms = set_contents.set_contents_add( client_xrm, client_xrms, Symbols.symbol_function( EQ ) );
        cdolist_list_var = cdolist_list_var.rest();
        client_xrm = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return set_contents.set_contents_element_list( client_xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 64588L)
  public static SubLObject xref_modules_that_access_module_anywhere(final SubLObject server_module)
  {
    final SubLObject server_xrm = xref_find_xrm_by_module( server_module );
    if( NIL != server_xrm )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym174$XRM_NAME ), xrms_that_access_xrm_anywhere( server_xrm ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 64942L)
  public static SubLObject xref_justify_module_referencing_module(final SubLObject client_module, final SubLObject server_module)
  {
    SubLObject used_methods = NIL;
    SubLObject used_globals = NIL;
    SubLObject cdolist_list_var;
    final SubLObject v_methods = cdolist_list_var = xref_methods_defined_by_module( server_module );
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_modules = xref_modules_that_access_method( method );
      if( NIL != list_utilities.member_equalP( client_module, client_modules ) )
      {
        used_methods = ConsesLow.cons( method, used_methods );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    final SubLObject globals = cdolist_list_var = xref_globals_defined_by_module( server_module );
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject client_modules = xref_modules_that_access_global_anywhere( global );
      if( NIL != list_utilities.member_equalP( client_module, client_modules ) )
      {
        used_globals = ConsesLow.cons( global, used_globals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    return ConsesLow.list( ConsesLow.list( $kw177$METHODS, used_methods ), ConsesLow.list( $kw178$GLOBALS, used_globals ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 66135L)
  public static SubLObject xref_some_external_module_accesses_method_anywhereP(final SubLObject method)
  {
    final SubLObject defining_xrm = xref_method_defining_xrm( method );
    SubLObject cdolist_list_var;
    final SubLObject accessing_xrms = cdolist_list_var = xrms_that_access_method( method );
    SubLObject accessing_xrm = NIL;
    accessing_xrm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !defining_xrm.eql( accessing_xrm ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      accessing_xrm = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 66575L)
  public static SubLObject xref_method_potentially_private_p(final SubLObject method)
  {
    return makeBoolean( NIL == form_translation.private_method_p( method ) && NIL == xref_some_external_module_accesses_method_anywhereP( method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 66847L)
  public static SubLObject xref_module_potentially_private_methods(final SubLObject module)
  {
    return list_utilities.delete_if_not( $sym179$XREF_METHOD_POTENTIALLY_PRIVATE_P, xref_methods_defined_by_module( module ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 67111L)
  public static SubLObject xref_some_external_module_accesses_global_anywhereP(final SubLObject global)
  {
    final SubLObject defining_xrm = xref_global_defining_xrm( global );
    SubLObject cdolist_list_var;
    final SubLObject accessing_xrms = cdolist_list_var = xrms_that_access_global_anywhere( global );
    SubLObject accessing_xrm = NIL;
    accessing_xrm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !defining_xrm.eql( accessing_xrm ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      accessing_xrm = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 67540L)
  public static SubLObject xref_global_potentially_private_p(final SubLObject global)
  {
    return makeBoolean( NIL == form_translation.private_global_p( global ) && NIL == xref_some_external_module_accesses_global_anywhereP( global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 67812L)
  public static SubLObject xref_module_potentially_private_globals(final SubLObject module)
  {
    return list_utilities.delete_if_not( $sym180$XREF_GLOBAL_POTENTIALLY_PRIVATE_P, xref_globals_defined_by_module( module ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 68078L)
  public static SubLObject xref_method_source_definition_info(final SubLObject method)
  {
    final SubLObject position = xref_method_definition_position( method );
    if( NIL != position )
    {
      final SubLObject module = xref_method_defining_module( method );
      if( NIL != module )
      {
        final SubLObject filename = xref_module_relative_input_filename( module );
        if( NIL != filename )
        {
          return Values.values( filename, position );
        }
      }
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 68479L)
  public static SubLObject xref_global_source_definition_info(final SubLObject global)
  {
    final SubLObject position = xref_global_definition_position( global );
    if( NIL != position )
    {
      final SubLObject module = xref_global_defining_module( global );
      if( NIL != module )
      {
        final SubLObject filename = xref_module_relative_input_filename( module );
        if( NIL != filename )
        {
          return Values.values( filename, position );
        }
      }
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 68856L)
  public static SubLObject xref_method_source_definition_comment(final SubLObject method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject filename = xref_method_source_definition_info( method );
    final SubLObject position = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != filename && NIL != position )
    {
      return xref_source_definition_comment( filename, position );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 69109L)
  public static SubLObject xref_global_source_definition_comment(final SubLObject global)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject filename = xref_global_source_definition_info( global );
    final SubLObject position = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != filename && NIL != position )
    {
      return xref_source_definition_comment( filename, position );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 69362L)
  public static SubLObject xref_source_definition_comment(final SubLObject filename, SubLObject position)
  {
    assert NIL != Types.stringp( filename ) : filename;
    assert NIL != subl_promotions.non_negative_integer_p( position ) : position;
    return ConsesLow.list( $sym181$CODE_COMMENT, Sequences.cconcatenate( $str182$_subl_, new SubLObject[] { format_nil.format_nil_a_no_copy( filename ), $str183$_, format_nil.format_nil_a_no_copy( position )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 69580L)
  public static SubLObject xref_module_relative_input_filename_internal(final SubLObject module)
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      return system_translation.sys_tran_relative_input_filename( sys_tran, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 69580L)
  public static SubLObject xref_module_relative_input_filename(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return xref_module_relative_input_filename_internal( module );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( xref_module_relative_input_filename_internal( module ) ) );
      memoization_state.caching_state_put( caching_state, module, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 69813L)
  public static SubLObject xrs_merge_xref_module(final SubLObject xrs, final SubLObject new_xrm)
  {
    assert NIL != xref_system_p( xrs ) : xrs;
    assert NIL != xref_module_p( new_xrm ) : new_xrm;
    final SubLObject name = xrm_name( new_xrm );
    final SubLObject old_xrm = xrs_lookup_module( xrs, name );
    if( NIL != old_xrm )
    {
      xrs_remove_old_xrm( xrs, old_xrm );
    }
    xrs_merge_new_xrm( xrs, new_xrm );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 70220L)
  public static SubLObject xrs_merge_new_xrm(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLObject name = xrm_name( new_xrm );
    final SubLObject table = xref_s_xref_module_table( xrs );
    Hashtables.sethash( name, table, new_xrm );
    xrs_merge_new_method_definitions( xrs, new_xrm );
    xrs_merge_new_global_definitions( xrs, new_xrm );
    xrs_merge_new_method_called_by_method( xrs, new_xrm );
    xrs_merge_new_method_called_by_global( xrs, new_xrm );
    xrs_merge_new_method_called_at_top_level( xrs, new_xrm );
    xrs_merge_new_global_referenced_by_method( xrs, new_xrm );
    xrs_merge_new_global_referenced_by_global( xrs, new_xrm );
    xrs_merge_new_global_referenced_at_top_level( xrs, new_xrm );
    xrs_merge_new_global_modified_by_method( xrs, new_xrm );
    xrs_merge_new_global_modified_at_top_level( xrs, new_xrm );
    xrs_merge_new_global_rebound_by_method( xrs, new_xrm );
    xrs_merge_new_global_rebound_at_top_level( xrs, new_xrm );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 71238L)
  public static SubLObject xrs_merge_definition(final SubLObject new_xrm, final SubLObject new_object, final SubLObject backtable)
  {
    final SubLObject old_module_spec = Hashtables.gethash_without_values( new_object, backtable, UNPROVIDED );
    SubLObject new_module_spec = NIL;
    if( NIL == old_module_spec )
    {
      new_module_spec = new_xrm;
    }
    else if( NIL != xref_module_p( old_module_spec ) )
    {
      new_module_spec = ConsesLow.list( new_xrm, old_module_spec );
    }
    else
    {
      new_module_spec = ConsesLow.cons( new_xrm, old_module_spec );
    }
    Hashtables.sethash( new_object, backtable, new_module_spec );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 71950L)
  public static SubLObject xrs_merge_new_method_definitions(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject backtable = xref_s_method_definition_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( new_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_definition( new_xrm, method, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 72224L)
  public static SubLObject xrs_merge_new_global_definitions(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject backtable = xref_s_global_definition_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( new_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_definition( new_xrm, global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 72498L)
  public static SubLObject xrs_merge_update_backpointer(final SubLObject client_object, final SubLObject server_object, final SubLObject backtable)
  {
    SubLObject back_contents = Hashtables.gethash_without_values( server_object, backtable, $empty_set_contents$.getGlobalValue() );
    back_contents = set_contents.set_contents_add( client_object, back_contents, Symbols.symbol_function( EQ ) );
    Hashtables.sethash( server_object, backtable, back_contents );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 72848L)
  public static SubLObject xrs_merge_new_method_called_by_method(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_method_table( new_xrm );
    final SubLObject backtable = xref_s_method_called_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject calls_methods = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = calls_methods;
      SubLObject call_method = NIL;
      call_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( method, call_method, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        call_method = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 73249L)
  public static SubLObject xrs_merge_new_method_called_by_global(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_global_method_table( new_xrm );
    final SubLObject backtable = xref_s_method_called_by_global_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject calls_methods = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = calls_methods;
      SubLObject call_method = NIL;
      call_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( global, call_method, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        call_method = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 73650L)
  public static SubLObject xrs_merge_new_method_called_at_top_level(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_method_table( new_xrm );
    final SubLObject backtable = xref_s_method_called_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_update_backpointer( new_xrm, call_method, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 74057L)
  public static SubLObject xrs_merge_new_global_referenced_by_method(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_reference_table( new_xrm );
    final SubLObject backtable = xref_s_global_referenced_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject referenced_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = referenced_globals;
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( method, referenced_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 74503L)
  public static SubLObject xrs_merge_new_global_referenced_by_global(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_global_global_reference_table( new_xrm );
    final SubLObject backtable = xref_s_global_referenced_by_global_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject referenced_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = referenced_globals;
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( global, referenced_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 74948L)
  public static SubLObject xrs_merge_new_global_referenced_at_top_level(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_reference_table( new_xrm );
    final SubLObject backtable = xref_s_global_referenced_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_update_backpointer( new_xrm, referenced_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 75389L)
  public static SubLObject xrs_merge_new_global_modified_by_method(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_modification_table( new_xrm );
    final SubLObject backtable = xref_s_global_modified_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject modified_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = modified_globals;
      SubLObject modified_global = NIL;
      modified_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( method, modified_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        modified_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 75824L)
  public static SubLObject xrs_merge_new_global_modified_at_top_level(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_modification_table( new_xrm );
    final SubLObject backtable = xref_s_global_modified_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_update_backpointer( new_xrm, modified_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 76258L)
  public static SubLObject xrs_merge_new_global_rebound_by_method(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_binding_table( new_xrm );
    final SubLObject backtable = xref_s_global_rebound_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject rebound_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = rebound_globals;
      SubLObject rebound_global = NIL;
      rebound_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_merge_update_backpointer( method, rebound_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        rebound_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 76681L)
  public static SubLObject xrs_merge_new_global_rebound_at_top_level(final SubLObject xrs, final SubLObject new_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_binding_table( new_xrm );
    final SubLObject backtable = xref_s_global_rebound_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_merge_update_backpointer( new_xrm, rebound_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 77105L)
  public static SubLObject xrs_remove_old_xrm(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLObject name = xrm_name( old_xrm );
    final SubLObject table = xref_s_xref_module_table( xrs );
    Hashtables.remhash( name, table );
    xrs_remove_old_method_definitions( xrs, old_xrm );
    xrs_remove_old_global_definitions( xrs, old_xrm );
    xrs_remove_old_method_called_by_method( xrs, old_xrm );
    xrs_remove_old_method_called_by_global( xrs, old_xrm );
    xrs_remove_old_method_called_at_top_level( xrs, old_xrm );
    xrs_remove_old_global_referenced_by_method( xrs, old_xrm );
    xrs_remove_old_global_referenced_by_global( xrs, old_xrm );
    xrs_remove_old_global_referenced_at_top_level( xrs, old_xrm );
    xrs_remove_old_global_modified_by_method( xrs, old_xrm );
    xrs_remove_old_global_modified_at_top_level( xrs, old_xrm );
    xrs_remove_old_global_rebound_by_method( xrs, old_xrm );
    xrs_remove_old_global_rebound_at_top_level( xrs, old_xrm );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 78140L)
  public static SubLObject xrs_remove_definition(final SubLObject old_xrm, final SubLObject old_object, final SubLObject backtable)
  {
    final SubLObject old_module_spec = Hashtables.gethash_without_values( old_object, backtable, UNPROVIDED );
    SubLObject new_module_spec = NIL;
    if( NIL != old_module_spec )
    {
      if( NIL != xref_module_p( old_module_spec ) )
      {
        new_module_spec = NIL;
      }
      else
      {
        new_module_spec = Sequences.delete( old_xrm, old_module_spec, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.singletonP( new_module_spec ) )
        {
          new_module_spec = new_module_spec.first();
        }
      }
    }
    if( NIL == new_module_spec )
    {
      Hashtables.remhash( old_object, backtable );
    }
    else
    {
      Hashtables.sethash( old_object, backtable, new_module_spec );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 78807L)
  public static SubLObject xrs_remove_old_method_definitions(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject backtable = xref_s_method_definition_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_method_position_table( old_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_definition( old_xrm, method, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 79086L)
  public static SubLObject xrs_remove_old_global_definitions(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject backtable = xref_s_global_definition_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( xrm_global_position_table( old_xrm ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject position = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_definition( old_xrm, global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 79365L)
  public static SubLObject xrs_remove_update_backpointer(final SubLObject client_object, final SubLObject server_object, final SubLObject backtable)
  {
    SubLObject back_contents = Hashtables.gethash_without_values( server_object, backtable, $empty_set_contents$.getGlobalValue() );
    back_contents = set_contents.set_contents_delete( client_object, back_contents, Symbols.symbol_function( EQ ) );
    if( NIL != set_contents.set_contents_emptyP( back_contents ) )
    {
      Hashtables.remhash( server_object, backtable );
    }
    else
    {
      Hashtables.sethash( server_object, backtable, back_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 79799L)
  public static SubLObject xrs_remove_old_method_called_by_method(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_method_table( old_xrm );
    final SubLObject backtable = xref_s_method_called_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject calls_methods = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = calls_methods;
      SubLObject call_method = NIL;
      call_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( method, call_method, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        call_method = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 80202L)
  public static SubLObject xrs_remove_old_method_called_by_global(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_global_method_table( old_xrm );
    final SubLObject backtable = xref_s_method_called_by_global_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject calls_methods = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = calls_methods;
      SubLObject call_method = NIL;
      call_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( global, call_method, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        call_method = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 80605L)
  public static SubLObject xrs_remove_old_method_called_at_top_level(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_method_table( old_xrm );
    final SubLObject backtable = xref_s_method_called_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_update_backpointer( old_xrm, call_method, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 81014L)
  public static SubLObject xrs_remove_old_global_referenced_by_method(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_reference_table( old_xrm );
    final SubLObject backtable = xref_s_global_referenced_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject referenced_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = referenced_globals;
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( method, referenced_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 81462L)
  public static SubLObject xrs_remove_old_global_referenced_by_global(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_global_global_reference_table( old_xrm );
    final SubLObject backtable = xref_s_global_referenced_by_global_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject referenced_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = referenced_globals;
      SubLObject referenced_global = NIL;
      referenced_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( global, referenced_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        referenced_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 81909L)
  public static SubLObject xrs_remove_old_global_referenced_at_top_level(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_reference_table( old_xrm );
    final SubLObject backtable = xref_s_global_referenced_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_update_backpointer( old_xrm, referenced_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 82352L)
  public static SubLObject xrs_remove_old_global_modified_by_method(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_modification_table( old_xrm );
    final SubLObject backtable = xref_s_global_modified_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject modified_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = modified_globals;
      SubLObject modified_global = NIL;
      modified_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( method, modified_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        modified_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 82789L)
  public static SubLObject xrs_remove_old_global_modified_at_top_level(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_modification_table( old_xrm );
    final SubLObject backtable = xref_s_global_modified_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_update_backpointer( old_xrm, modified_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 83225L)
  public static SubLObject xrs_remove_old_global_rebound_by_method(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_method_global_binding_table( old_xrm );
    final SubLObject backtable = xref_s_global_rebound_by_method_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject method = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject rebound_globals = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = rebound_globals;
      SubLObject rebound_global = NIL;
      rebound_global = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xrs_remove_update_backpointer( method, rebound_global, backtable );
        cdolist_list_var = cdolist_list_var.rest();
        rebound_global = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 83650L)
  public static SubLObject xrs_remove_old_global_rebound_at_top_level(final SubLObject xrs, final SubLObject old_xrm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = xref_m_top_global_binding_table( old_xrm );
    final SubLObject backtable = xref_s_global_rebound_at_top_level_table( xrs );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject positions = thread.secondMultipleValue();
      thread.resetMultipleValues();
      xrs_remove_update_backpointer( old_xrm, rebound_global, backtable );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 84076L)
  public static SubLObject xref_possibly_record_global_undefinition(final SubLObject global, final SubLObject new_xrm)
  {
    final SubLObject old_xrm = xref_global_defining_xrm( global );
    if( NIL != old_xrm && !xrm_name( old_xrm ).equal( xrm_name( new_xrm ) ) )
    {
      final SubLObject xrs = xrm_xref_system( old_xrm );
      xrs_unrecord_global_backpointers( xrs, old_xrm, global );
      xrm_unrecord_global_definition( old_xrm, global );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 84480L)
  public static SubLObject xrs_unrecord_global_backpointers(final SubLObject xrs, final SubLObject old_xrm, final SubLObject global)
  {
    SubLObject backtable = xref_s_method_called_by_global_table( xrs );
    SubLObject table = xref_m_global_method_table( old_xrm );
    SubLObject cdolist_list_var;
    final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, global, UNPROVIDED );
    SubLObject called_method = NIL;
    called_method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( global, called_method, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      called_method = cdolist_list_var.first();
    }
    backtable = xref_s_global_referenced_by_global_table( xrs );
    table = xref_m_global_global_reference_table( old_xrm );
    final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, global, UNPROVIDED );
    SubLObject referenced_global = NIL;
    referenced_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( global, referenced_global, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      referenced_global = cdolist_list_var.first();
    }
    backtable = xref_s_global_definition_table( xrs );
    xrs_remove_definition( old_xrm, global, backtable );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 85303L)
  public static SubLObject xref_possibly_record_method_undefinition(final SubLObject method, final SubLObject new_xrm)
  {
    final SubLObject old_xrm = xref_method_defining_xrm( method );
    if( NIL != old_xrm && !xrm_name( old_xrm ).equal( xrm_name( new_xrm ) ) )
    {
      final SubLObject xrs = xrm_xref_system( old_xrm );
      xrs_unrecord_method_backpointers( xrs, old_xrm, method );
      xrm_unrecord_method_definition( old_xrm, method );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 85678L)
  public static SubLObject xrs_unrecord_method_backpointers(final SubLObject xrs, final SubLObject old_xrm, final SubLObject method)
  {
    SubLObject backtable = xref_s_method_called_by_method_table( xrs );
    SubLObject table = xref_m_method_method_table( old_xrm );
    SubLObject cdolist_list_var;
    final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, UNPROVIDED );
    SubLObject called_method = NIL;
    called_method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( method, called_method, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      called_method = cdolist_list_var.first();
    }
    backtable = xref_s_global_referenced_by_method_table( xrs );
    table = xref_m_method_global_reference_table( old_xrm );
    final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, UNPROVIDED );
    SubLObject referenced_global = NIL;
    referenced_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( method, referenced_global, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      referenced_global = cdolist_list_var.first();
    }
    backtable = xref_s_global_modified_by_method_table( xrs );
    table = xref_m_method_global_modification_table( old_xrm );
    final SubLObject modified_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, UNPROVIDED );
    SubLObject modified_global = NIL;
    modified_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( method, modified_global, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      modified_global = cdolist_list_var.first();
    }
    backtable = xref_s_global_rebound_by_method_table( xrs );
    table = xref_m_method_global_binding_table( old_xrm );
    final SubLObject rebound_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values( table, method, UNPROVIDED );
    SubLObject rebound_global = NIL;
    rebound_global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xrs_remove_update_backpointer( method, rebound_global, backtable );
      cdolist_list_var = cdolist_list_var.rest();
      rebound_global = cdolist_list_var.first();
    }
    backtable = xref_s_method_definition_table( xrs );
    xrs_remove_definition( old_xrm, method, backtable );
    return xrs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 87133L)
  public static SubLObject within_new_xref_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list185 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list185 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list185 );
      if( NIL == conses_high.member( current_$7, $list186, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list185 );
    }
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw47$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject features_tail = cdestructuring_bind.property_list_member( $kw49$FEATURES, current );
    final SubLObject features = ( NIL != features_tail ) ? conses_high.cadr( features_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject system_var = $sym187$SYSTEM_VAR;
    final SubLObject module_var = $sym188$MODULE_VAR;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( reader.bq_cons( system_var, $list189 ), ConsesLow.list( module_var, ConsesLow.list( $sym190$FWHEN, system_var, ConsesLow.list( $sym191$NEW_XREF_MODULE, system_var,
        name, features ) ) ) ), ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list( $sym192$_CURRENT_XREF_MODULE_, module_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym193$PWHEN, module_var,
            ConsesLow.list( $sym194$XRS_MERGE_XREF_MODULE, system_var, module_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 87723L)
  public static SubLObject with_current_xref_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject xrm = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    xrm = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( reader.bq_cons( xrm, $list196 ) ), ConsesLow.listS( $sym193$PWHEN, xrm, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 87860L)
  public static SubLObject current_xref_module()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_xref_module$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 87972L)
  public static SubLObject xref_within_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    module_name = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject name_var = $sym200$NAME_VAR;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( name_var, module_name ) ), ConsesLow.listS( $sym201$CHECK_TYPE, name_var, $list202 ), ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list(
        $sym203$_XREF_MODULE_SCOPE_, name_var ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88308L)
  public static SubLObject xref_module_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $xref_module_scope$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88372L)
  public static SubLObject xref_within_file_position(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject file_position = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list204 );
    file_position = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject position_var = $sym205$POSITION_VAR;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( position_var, file_position ) ), ConsesLow.listS( $sym201$CHECK_TYPE, position_var, $list206 ), ConsesLow.listS( $sym85$CLET, ConsesLow.list(
        ConsesLow.list( $sym207$_XREF_FILE_POSITION_SCOPE_, position_var ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88777L)
  public static SubLObject xref_file_position_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $xref_file_position_scope$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88855L)
  public static SubLObject xref_within_define(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    name = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym209$XREF_WITHIN_METHOD, name, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 88977L)
  public static SubLObject xref_within_defmacro(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    name = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym209$XREF_WITHIN_METHOD, name, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89084L)
  public static SubLObject xref_within_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list210 );
    method = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject method_var = $sym211$METHOD_VAR;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( method_var, method ) ), ConsesLow.listS( $sym201$CHECK_TYPE, method_var, $list212 ), ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list(
        $sym213$_XREF_METHOD_SCOPE_, method_var ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89400L)
  public static SubLObject xref_method_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $xref_method_scope$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89464L)
  public static SubLObject xref_within_global(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject global = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    global = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject global_var = $sym215$GLOBAL_VAR;
    return ConsesLow.list( $sym85$CLET, ConsesLow.list( ConsesLow.list( global_var, global ) ), ConsesLow.listS( $sym201$CHECK_TYPE, global_var, $list212 ), ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list(
        $sym216$_XREF_GLOBAL_SCOPE_, global_var ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89797L)
  public static SubLObject xref_global_scope()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $xref_global_scope$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 89861L)
  public static SubLObject xref_reference_scope()
  {
    final SubLObject file_position_scope = xref_file_position_scope();
    if( NIL != xref_method_scope() )
    {
      return Values.values( $kw217$METHOD, xref_method_scope(), file_position_scope );
    }
    if( NIL != xref_global_scope() )
    {
      return Values.values( $kw218$GLOBAL, xref_global_scope(), file_position_scope );
    }
    if( NIL != xref_module_scope() )
    {
      return Values.values( $kw219$FILE, xref_module_scope(), file_position_scope );
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 90325L)
  public static SubLObject xref_note_global_definition(final SubLObject global)
  {
    xref_trace( $str220$___def_glob____S, global, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      final SubLObject position = xref_file_position_scope();
      xref_possibly_record_global_undefinition( global, xrm );
      xrm_record_global_definition( xrm, global, position );
    }
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 90685L)
  public static SubLObject xref_note_macro_definition(final SubLObject macro)
  {
    xref_trace( $str221$___defmacro____S, macro, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      final SubLObject position = xref_file_position_scope();
      xref_possibly_record_method_undefinition( macro, xrm );
      xrm_record_method_definition( xrm, macro, position );
    }
    return macro;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 90993L)
  public static SubLObject xref_note_function_definition(final SubLObject function)
  {
    xref_trace( $str222$___define______S, function, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      final SubLObject position = xref_file_position_scope();
      xref_possibly_record_method_undefinition( function, xrm );
      xrm_record_method_definition( xrm, function, position );
    }
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 91319L)
  public static SubLObject xref_note_method_formal_arglist(final SubLObject method, final SubLObject arglist)
  {
    xref_trace( $str223$____arglist____S, arglist, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      xrm_record_method_formal_arglist( xrm, method, arglist );
    }
    return method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 91537L)
  public static SubLObject xref_note_global_binding_type(final SubLObject global, final SubLObject binding_type)
  {
    xref_trace( $str224$____binding_type____S, binding_type, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      xrm_record_global_binding_type( xrm, global, binding_type );
    }
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 91770L)
  public static SubLObject xref_note_global_reference(final SubLObject global)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xref_trace( $str225$____ref_glob_____S, global, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      thread.resetMultipleValues();
      final SubLObject definition_type = xref_reference_scope();
      final SubLObject definer = thread.secondMultipleValue();
      final SubLObject file_position = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pcase_var = definition_type;
      if( pcase_var.eql( $kw217$METHOD ) )
      {
        xrm_record_method_references_global( xrm, definer, global );
      }
      else if( pcase_var.eql( $kw218$GLOBAL ) )
      {
        xrm_record_global_references_global( xrm, definer, global );
      }
      else if( pcase_var.eql( $kw219$FILE ) )
      {
        xrm_record_top_references_global( xrm, global, file_position );
      }
    }
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 92250L)
  public static SubLObject xref_note_global_modification(final SubLObject global)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xref_trace( $str226$____mod_glob_____S, global, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      thread.resetMultipleValues();
      final SubLObject definition_type = xref_reference_scope();
      final SubLObject definer = thread.secondMultipleValue();
      final SubLObject file_position = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pcase_var = definition_type;
      if( pcase_var.eql( $kw217$METHOD ) )
      {
        xrm_record_method_modifies_global( xrm, definer, global );
      }
      else if( pcase_var.eql( $kw218$GLOBAL ) )
      {
        Errors.error( $str227$Initializer_for__S_modifies__S, definer, global );
      }
      else if( pcase_var.eql( $kw219$FILE ) )
      {
        xrm_record_top_modifies_global( xrm, global, file_position );
      }
    }
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 92727L)
  public static SubLObject xref_note_global_binding(final SubLObject global)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xref_trace( $str228$____bind_glob_____S, global, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      thread.resetMultipleValues();
      final SubLObject definition_type = xref_reference_scope();
      final SubLObject definer = thread.secondMultipleValue();
      final SubLObject file_position = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pcase_var = definition_type;
      if( pcase_var.eql( $kw217$METHOD ) )
      {
        xrm_record_method_rebinds_global( xrm, definer, global );
      }
      else if( pcase_var.eql( $kw218$GLOBAL ) )
      {
        Errors.error( $str229$Initializer_for__S_rebinds__S, definer, global );
      }
      else if( pcase_var.eql( $kw219$FILE ) )
      {
        xrm_record_top_rebinds_global( xrm, global, file_position );
      }
    }
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 93197L)
  public static SubLObject xref_note_macro_use(final SubLObject macro)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xref_trace( $str230$____macro_use____S, macro, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      thread.resetMultipleValues();
      final SubLObject definition_type = xref_reference_scope();
      final SubLObject definer = thread.secondMultipleValue();
      final SubLObject file_position = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pcase_var = definition_type;
      if( pcase_var.eql( $kw217$METHOD ) )
      {
        xrm_record_method_calls_method( xrm, definer, macro );
      }
      else if( pcase_var.eql( $kw218$GLOBAL ) )
      {
        xrm_record_global_calls_method( xrm, definer, macro );
      }
      else if( pcase_var.eql( $kw219$FILE ) )
      {
        xrm_record_top_calls_method( xrm, macro, file_position );
      }
    }
    return macro;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 93650L)
  public static SubLObject xref_note_function_call(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    xref_trace( $str231$____fun_call_____S, function, UNPROVIDED );
    final SubLObject xrm = current_xref_module();
    if( NIL != xrm )
    {
      thread.resetMultipleValues();
      final SubLObject definition_type = xref_reference_scope();
      final SubLObject definer = thread.secondMultipleValue();
      final SubLObject file_position = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pcase_var = definition_type;
      if( pcase_var.eql( $kw217$METHOD ) )
      {
        xrm_record_method_calls_method( xrm, definer, function );
      }
      else if( pcase_var.eql( $kw218$GLOBAL ) )
      {
        xrm_record_global_calls_method( xrm, definer, function );
      }
      else if( pcase_var.eql( $kw219$FILE ) )
      {
        xrm_record_top_calls_method( xrm, function, file_position );
      }
    }
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 94124L)
  public static SubLObject xref_note_module_removal(final SubLObject module_name)
  {
    xref_trace( $str232$__module_removed_____A, module_name, UNPROVIDED );
    final SubLObject xrs = current_xref_system();
    if( NIL != xrs )
    {
      final SubLObject old_xrm = xrs_lookup_module( xrs, module_name );
      if( NIL != old_xrm )
      {
        xrs_remove_old_xrm( xrs, old_xrm );
      }
    }
    return module_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 94518L)
  public static SubLObject xref_trace(final SubLObject control_string, SubLObject arg1, SubLObject arg2)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $xref_trace$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), control_string, arg1, arg2 );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 94712L)
  public static SubLObject xref_sort_called_globals(SubLObject globals)
  {
    globals = Sort.sort( globals, Symbols.symbol_function( $sym233$STRING_LESSP ), Symbols.symbol_function( $sym234$SYMBOL_NAME ) );
    if( NIL != current_xref_system() )
    {
      globals = Sort.stable_sort( globals, Symbols.symbol_function( $sym235$_ ), Symbols.symbol_function( $sym236$XREF_GLOBAL_ACCESS_COUNT ) );
    }
    return globals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95017L)
  public static SubLObject xref_sort_called_methods(SubLObject v_methods)
  {
    v_methods = Sort.sort( v_methods, Symbols.symbol_function( $sym233$STRING_LESSP ), Symbols.symbol_function( $sym234$SYMBOL_NAME ) );
    if( NIL != current_xref_system() )
    {
      v_methods = Sort.stable_sort( v_methods, Symbols.symbol_function( $sym235$_ ), Symbols.symbol_function( $sym237$XREF_METHOD_CALL_COUNT ) );
    }
    return v_methods;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95250L)
  public static SubLObject xref_sort_referenced_xrms(final SubLObject xrms)
  {
    return Sort.sort( xrms, Symbols.symbol_function( $sym233$STRING_LESSP ), Symbols.symbol_function( $sym174$XRM_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95346L)
  public static SubLObject xref_sort_referenced_modules(final SubLObject v_modules)
  {
    return Sort.sort( v_modules, Symbols.symbol_function( $sym233$STRING_LESSP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95440L)
  public static SubLObject xref_sort_calling_globals(final SubLObject globals)
  {
    return Sort.sort( globals, Symbols.symbol_function( $sym233$STRING_LESSP ), Symbols.symbol_function( $sym234$SYMBOL_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95546L)
  public static SubLObject xref_sort_calling_methods(final SubLObject v_methods)
  {
    return Sort.sort( v_methods, Symbols.symbol_function( $sym233$STRING_LESSP ), Symbols.symbol_function( $sym234$SYMBOL_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95651L)
  public static SubLObject xref_sort_calling_xrms(final SubLObject xrms)
  {
    return xref_sort_referenced_xrms( xrms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xref-database.lisp", position = 95739L)
  public static SubLObject xref_sort_calling_modules(final SubLObject v_modules)
  {
    return xref_sort_referenced_modules( v_modules );
  }

  public static SubLObject declare_xref_database_file()
  {
    SubLFiles.declareFunction( me, "xref_module_print_function_trampoline", "XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_module_p", "XREF-MODULE-P", 1, 0, false );
    new $xref_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "xref_m_name", "XREF-M-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_xref_system", "XREF-M-XREF-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_features", "XREF-M-FEATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_definitions", "XREF-M-METHOD-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_position_table", "XREF-M-METHOD-POSITION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_method_table", "XREF-M-METHOD-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_global_reference_table", "XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_global_modification_table", "XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_global_binding_table", "XREF-M-METHOD-GLOBAL-BINDING-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_global_definitions", "XREF-M-GLOBAL-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_global_position_table", "XREF-M-GLOBAL-POSITION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_global_method_table", "XREF-M-GLOBAL-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_global_global_reference_table", "XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_top_method_table", "XREF-M-TOP-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_top_global_reference_table", "XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_top_global_modification_table", "XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_top_global_binding_table", "XREF-M-TOP-GLOBAL-BINDING-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_method_formal_arglist_table", "XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_m_global_binding_type_table", "XREF-M-GLOBAL-BINDING-TYPE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_name", "_CSETF-XREF-M-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_xref_system", "_CSETF-XREF-M-XREF-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_features", "_CSETF-XREF-M-FEATURES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_definitions", "_CSETF-XREF-M-METHOD-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_position_table", "_CSETF-XREF-M-METHOD-POSITION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_method_table", "_CSETF-XREF-M-METHOD-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_global_reference_table", "_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_global_modification_table", "_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_global_binding_table", "_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_global_definitions", "_CSETF-XREF-M-GLOBAL-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_global_position_table", "_CSETF-XREF-M-GLOBAL-POSITION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_global_method_table", "_CSETF-XREF-M-GLOBAL-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_global_global_reference_table", "_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_top_method_table", "_CSETF-XREF-M-TOP-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_top_global_reference_table", "_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_top_global_modification_table", "_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_top_global_binding_table", "_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_method_formal_arglist_table", "_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_m_global_binding_type_table", "_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_xref_module", "MAKE-XREF-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_xref_module", "VISIT-DEFSTRUCT-XREF-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_xref_module_method", "VISIT-DEFSTRUCT-OBJECT-XREF-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_xref_module", "PRINT-XREF-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_xref_module_method", "SXHASH-XREF-MODULE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_xref_module", "NEW-XREF-MODULE", 3, 0, false );
    SubLFiles.declareMacro( me, "do_xrm_method_definitions", "DO-XRM-METHOD-DEFINITIONS" );
    SubLFiles.declareFunction( me, "xrm_method_definitions", "XRM-METHOD-DEFINITIONS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_xrm_methods", "DO-XRM-METHODS" );
    SubLFiles.declareFunction( me, "xrm_method_position_table", "XRM-METHOD-POSITION-TABLE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_xrm_global_definitions", "DO-XRM-GLOBAL-DEFINITIONS" );
    SubLFiles.declareFunction( me, "xrm_global_definitions", "XRM-GLOBAL-DEFINITIONS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_xrm_globals", "DO-XRM-GLOBALS" );
    SubLFiles.declareFunction( me, "xrm_global_position_table", "XRM-GLOBAL-POSITION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_name", "XRM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_xref_system", "XRM-XREF-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_module_features", "XRM-MODULE-FEATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_method_definition_count", "XRM-METHOD-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_total_method_definition_count", "XRM-TOTAL-METHOD-DEFINITION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_total_method_count", "XRM-TOTAL-METHOD-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_has_multiple_method_definitionsP", "XRM-HAS-MULTIPLE-METHOD-DEFINITIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_global_definition_count", "XRM-GLOBAL-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_total_global_definition_count", "XRM-TOTAL-GLOBAL-DEFINITION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_total_global_count", "XRM-TOTAL-GLOBAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_has_multiple_global_definitionsP", "XRM-HAS-MULTIPLE-GLOBAL-DEFINITIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "xrm_method_definition_postion", "XRM-METHOD-DEFINITION-POSTION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_method_definition_positions", "XRM-METHOD-DEFINITION-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_global_definition_postion", "XRM-GLOBAL-DEFINITION-POSTION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_global_definition_positions", "XRM-GLOBAL-DEFINITION-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_method_formal_arglist", "XRM-METHOD-FORMAL-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_global_binding_type", "XRM-GLOBAL-BINDING-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_definition", "XRM-RECORD-METHOD-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_unrecord_method_definition", "XRM-UNRECORD-METHOD-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_formal_arglist", "XRM-RECORD-METHOD-FORMAL-ARGLIST", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_global_binding_type", "XRM-RECORD-GLOBAL-BINDING-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_global_definition", "XRM-RECORD-GLOBAL-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_unrecord_global_definition", "XRM-UNRECORD-GLOBAL-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_calls_method", "XRM-RECORD-METHOD-CALLS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_references_global", "XRM-RECORD-METHOD-REFERENCES-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_modifies_global", "XRM-RECORD-METHOD-MODIFIES-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_method_rebinds_global", "XRM-RECORD-METHOD-REBINDS-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_global_calls_method", "XRM-RECORD-GLOBAL-CALLS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_global_references_global", "XRM-RECORD-GLOBAL-REFERENCES-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_top_calls_method", "XRM-RECORD-TOP-CALLS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_top_references_global", "XRM-RECORD-TOP-REFERENCES-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_top_modifies_global", "XRM-RECORD-TOP-MODIFIES-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xrm_record_top_rebinds_global", "XRM-RECORD-TOP-REBINDS-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "xref_system_print_function_trampoline", "XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_system_p", "XREF-SYSTEM-P", 1, 0, false );
    new $xref_system_p$UnaryFunction();
    SubLFiles.declareFunction( me, "xref_s_name", "XREF-S-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_features", "XREF-S-FEATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_xref_module_table", "XREF-S-XREF-MODULE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_method_definition_table", "XREF-S-METHOD-DEFINITION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_definition_table", "XREF-S-GLOBAL-DEFINITION-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_method_called_by_method_table", "XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_method_called_by_global_table", "XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_method_called_at_top_level_table", "XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_referenced_by_method_table", "XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_modified_by_method_table", "XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_rebound_by_method_table", "XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_referenced_by_global_table", "XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_referenced_at_top_level_table", "XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_modified_at_top_level_table", "XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_s_global_rebound_at_top_level_table", "XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_name", "_CSETF-XREF-S-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_features", "_CSETF-XREF-S-FEATURES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_xref_module_table", "_CSETF-XREF-S-XREF-MODULE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_method_definition_table", "_CSETF-XREF-S-METHOD-DEFINITION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_definition_table", "_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_method_called_by_method_table", "_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_method_called_by_global_table", "_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_method_called_at_top_level_table", "_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_referenced_by_method_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_modified_by_method_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_rebound_by_method_table", "_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_referenced_by_global_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_referenced_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_modified_at_top_level_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xref_s_global_rebound_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_xref_system", "MAKE-XREF-SYSTEM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_xref_system", "VISIT-DEFSTRUCT-XREF-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_xref_system_method", "VISIT-DEFSTRUCT-OBJECT-XREF-SYSTEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_xref_system", "PRINT-XREF-SYSTEM", 3, 0, false );
    SubLFiles.declareFunction( me, "new_xref_system", "NEW-XREF-SYSTEM", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_name", "XRS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xrs_features", "XRS-FEATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "xrs_module_count", "XRS-MODULE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xrs_lookup_module", "XRS-LOOKUP-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_method_defining_xrm", "XRS-METHOD-DEFINING-XRM", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_method_defining_xrms", "XRS-METHOD-DEFINING-XRMS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_method_definition_count", "XRS-METHOD-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_global_defining_xrm", "XRS-GLOBAL-DEFINING-XRM", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_global_defining_xrms", "XRS-GLOBAL-DEFINING-XRMS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_global_definition_count", "XRS-GLOBAL-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_possibly_note_module_features", "XRS-POSSIBLY-NOTE-MODULE-FEATURES", 3, 0, false );
    SubLFiles.declareFunction( me, "current_xref_system", "CURRENT-XREF-SYSTEM", 0, 0, false );
    SubLFiles.declareFunction( me, "current_xref_system_modules", "CURRENT-XREF-SYSTEM-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "current_xref_system_features", "CURRENT-XREF-SYSTEM-FEATURES", 0, 0, false );
    SubLFiles.declareFunction( me, "current_xref_system_relevant_modules", "CURRENT-XREF-SYSTEM-RELEVANT-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "current_xref_module_p", "CURRENT-XREF-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_find_xrm_by_module", "XREF-FIND-XRM-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_features", "XREF-MODULE-FEATURES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_input_filename", "XREF-MODULE-INPUT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_predefined_method_p", "XREF-PREDEFINED-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_predefined_global_p", "XREF-PREDEFINED-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_formal_arglist", "XREF-METHOD-FORMAL-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "method_formal_arglist", "METHOD-FORMAL-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_binding_type", "XREF-GLOBAL-BINDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_definition_count", "XREF-METHOD-DEFINITION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_undefinedP", "XREF-METHOD-UNDEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_defining_xrm", "XREF-METHOD-DEFINING-XRM", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_defining_module", "XREF-METHOD-DEFINING-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_has_multiple_definitionsP", "XREF-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_defining_modules", "XREF-METHOD-DEFINING-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_definition_count", "XREF-GLOBAL-DEFINITION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_undefinedP", "XREF-GLOBAL-UNDEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_defining_xrm", "XREF-GLOBAL-DEFINING-XRM", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_defining_module", "XREF-GLOBAL-DEFINING-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_has_multiple_definitionsP", "XREF-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_defining_modules", "XREF-GLOBAL-DEFINING-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_definition_position", "XREF-METHOD-DEFINITION-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_definition_positions", "XREF-METHOD-DEFINITION-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_definition_position", "XREF-GLOBAL-DEFINITION-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_definition_positions", "XREF-GLOBAL-DEFINITION-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_defined_by_module", "XREF-METHODS-DEFINED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_method_definition_count", "XREF-MODULE-METHOD-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_module_method_definition_positions", "XREF-MODULE-METHOD-DEFINITION-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_defined_by_module", "XREF-GLOBALS-DEFINED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_global_definition_count", "XREF-MODULE-GLOBAL-DEFINITION-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_module_global_definition_positions", "XREF-MODULE-GLOBAL-DEFINITION-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_method_called_by_methodP", "XREF-METHOD-CALLED-BY-METHOD?", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_called_by_method", "XREF-METHODS-CALLED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_referenced_by_method", "XREF-GLOBALS-REFERENCED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_modified_by_method", "XREF-GLOBALS-MODIFIED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_rebound_by_method", "XREF-GLOBALS-REBOUND-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_accessed_by_method", "XREF-GLOBALS-ACCESSED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_called_by_globalP", "XREF-METHOD-CALLED-BY-GLOBAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_called_by_global", "XREF-METHODS-CALLED-BY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_referenced_by_global", "XREF-GLOBALS-REFERENCED-BY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_called_by_moduleP", "XREF-METHOD-CALLED-BY-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_module_positions_calling_method", "XREF-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_called_by_module", "XREF-METHODS-CALLED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_positions_referencing_global", "XREF-MODULE-POSITIONS-REFERENCING-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_referenced_by_module", "XREF-GLOBALS-REFERENCED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_positions_modifying_global", "XREF-MODULE-POSITIONS-MODIFYING-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_modified_by_module", "XREF-GLOBALS-MODIFIED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_positions_rebinding_global", "XREF-MODULE-POSITIONS-REBINDING-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_rebound_by_module", "XREF-GLOBALS-REBOUND-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_positions_accessing_global", "XREF-MODULE-POSITIONS-ACCESSING-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_accessed_by_module", "XREF-GLOBALS-ACCESSED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_that_call_method", "XREF-METHODS-THAT-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_that_call_method", "XREF-GLOBALS-THAT-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_call_method", "XRMS-THAT-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_call_method", "XREF-MODULES-THAT-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_call_count", "XREF-METHOD-CALL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_unused_p", "XREF-METHOD-UNUSED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_that_reference_global", "XREF-METHODS-THAT-REFERENCE-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_that_reference_global", "XREF-GLOBALS-THAT-REFERENCE-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_reference_global", "XRMS-THAT-REFERENCE-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_reference_global", "XREF-MODULES-THAT-REFERENCE-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_reference_count", "XREF-GLOBAL-REFERENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_never_referenced_p", "XREF-GLOBAL-NEVER-REFERENCED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_that_modify_global", "XREF-METHODS-THAT-MODIFY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_modify_global", "XRMS-THAT-MODIFY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_modify_global", "XREF-MODULES-THAT-MODIFY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_modification_count", "XREF-GLOBAL-MODIFICATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_never_modified_p", "XREF-GLOBAL-NEVER-MODIFIED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_that_rebind_global", "XREF-METHODS-THAT-REBIND-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_rebind_global", "XRMS-THAT-REBIND-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_rebind_global", "XREF-MODULES-THAT-REBIND-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_binding_count", "XREF-GLOBAL-BINDING-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_never_rebound_p", "XREF-GLOBAL-NEVER-REBOUND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_that_access_global", "XREF-METHODS-THAT-ACCESS-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_access_global", "XRMS-THAT-ACCESS-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_access_global", "XREF-MODULES-THAT-ACCESS-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_access_count", "XREF-GLOBAL-ACCESS-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_never_accessed_p", "XREF-GLOBAL-NEVER-ACCESSED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_xrms_accessed_by_method", "XREF-XRMS-ACCESSED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_accessed_by_method", "XREF-MODULES-ACCESSED-BY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_xrms_accessed_by_global", "XREF-XRMS-ACCESSED-BY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_accessed_by_global", "XREF-MODULES-ACCESSED-BY-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_xrms_accessed_by_xrm", "XREF-XRMS-ACCESSED-BY-XRM", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_accessed_by_module", "XREF-MODULES-ACCESSED-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_xrms_accessed_anywhere_by_xrm", "XREF-XRMS-ACCESSED-ANYWHERE-BY-XRM", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_accessed_anywhere_by_module", "XREF-MODULES-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_globals_accessed_anywhere_by_module", "XREF-GLOBALS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_methods_accessed_anywhere_by_module", "XREF-METHODS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_access_method", "XRMS-THAT-ACCESS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_access_method", "XREF-MODULES-THAT-ACCESS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_access_global_anywhere", "XRMS-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_access_global_anywhere", "XREF-MODULES-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false );
    SubLFiles.declareFunction( me, "xrms_that_access_xrm_anywhere", "XRMS-THAT-ACCESS-XRM-ANYWHERE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_modules_that_access_module_anywhere", "XREF-MODULES-THAT-ACCESS-MODULE-ANYWHERE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_justify_module_referencing_module", "XREF-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_some_external_module_accesses_method_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-METHOD-ANYWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_potentially_private_p", "XREF-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_potentially_private_methods", "XREF-MODULE-POTENTIALLY-PRIVATE-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_some_external_module_accesses_global_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-GLOBAL-ANYWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_potentially_private_p", "XREF-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_potentially_private_globals", "XREF-MODULE-POTENTIALLY-PRIVATE-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_source_definition_info", "XREF-METHOD-SOURCE-DEFINITION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_source_definition_info", "XREF-GLOBAL-SOURCE-DEFINITION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_method_source_definition_comment", "XREF-METHOD-SOURCE-DEFINITION-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_global_source_definition_comment", "XREF-GLOBAL-SOURCE-DEFINITION-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_source_definition_comment", "XREF-SOURCE-DEFINITION-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_module_relative_input_filename_internal", "XREF-MODULE-RELATIVE-INPUT-FILENAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_module_relative_input_filename", "XREF-MODULE-RELATIVE-INPUT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_xref_module", "XRS-MERGE-XREF-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_xrm", "XRS-MERGE-NEW-XRM", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_definition", "XRS-MERGE-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_method_definitions", "XRS-MERGE-NEW-METHOD-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_definitions", "XRS-MERGE-NEW-GLOBAL-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_update_backpointer", "XRS-MERGE-UPDATE-BACKPOINTER", 3, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_method_called_by_method", "XRS-MERGE-NEW-METHOD-CALLED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_method_called_by_global", "XRS-MERGE-NEW-METHOD-CALLED-BY-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_method_called_at_top_level", "XRS-MERGE-NEW-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_referenced_by_method", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_referenced_by_global", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_referenced_at_top_level", "XRS-MERGE-NEW-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_modified_by_method", "XRS-MERGE-NEW-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_modified_at_top_level", "XRS-MERGE-NEW-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_rebound_by_method", "XRS-MERGE-NEW-GLOBAL-REBOUND-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_merge_new_global_rebound_at_top_level", "XRS-MERGE-NEW-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_xrm", "XRS-REMOVE-OLD-XRM", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_definition", "XRS-REMOVE-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_method_definitions", "XRS-REMOVE-OLD-METHOD-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_definitions", "XRS-REMOVE-OLD-GLOBAL-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_update_backpointer", "XRS-REMOVE-UPDATE-BACKPOINTER", 3, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_method_called_by_method", "XRS-REMOVE-OLD-METHOD-CALLED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_method_called_by_global", "XRS-REMOVE-OLD-METHOD-CALLED-BY-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_method_called_at_top_level", "XRS-REMOVE-OLD-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_referenced_by_method", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_referenced_by_global", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_referenced_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_modified_by_method", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_modified_at_top_level", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_rebound_by_method", "XRS-REMOVE-OLD-GLOBAL-REBOUND-BY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_remove_old_global_rebound_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_possibly_record_global_undefinition", "XREF-POSSIBLY-RECORD-GLOBAL-UNDEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_unrecord_global_backpointers", "XRS-UNRECORD-GLOBAL-BACKPOINTERS", 3, 0, false );
    SubLFiles.declareFunction( me, "xref_possibly_record_method_undefinition", "XREF-POSSIBLY-RECORD-METHOD-UNDEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "xrs_unrecord_method_backpointers", "XRS-UNRECORD-METHOD-BACKPOINTERS", 3, 0, false );
    SubLFiles.declareMacro( me, "within_new_xref_module", "WITHIN-NEW-XREF-MODULE" );
    SubLFiles.declareMacro( me, "with_current_xref_module", "WITH-CURRENT-XREF-MODULE" );
    SubLFiles.declareFunction( me, "current_xref_module", "CURRENT-XREF-MODULE", 0, 0, false );
    SubLFiles.declareMacro( me, "xref_within_module", "XREF-WITHIN-MODULE" );
    SubLFiles.declareFunction( me, "xref_module_scope", "XREF-MODULE-SCOPE", 0, 0, false );
    SubLFiles.declareMacro( me, "xref_within_file_position", "XREF-WITHIN-FILE-POSITION" );
    SubLFiles.declareFunction( me, "xref_file_position_scope", "XREF-FILE-POSITION-SCOPE", 0, 0, false );
    SubLFiles.declareMacro( me, "xref_within_define", "XREF-WITHIN-DEFINE" );
    SubLFiles.declareMacro( me, "xref_within_defmacro", "XREF-WITHIN-DEFMACRO" );
    SubLFiles.declareMacro( me, "xref_within_method", "XREF-WITHIN-METHOD" );
    SubLFiles.declareFunction( me, "xref_method_scope", "XREF-METHOD-SCOPE", 0, 0, false );
    SubLFiles.declareMacro( me, "xref_within_global", "XREF-WITHIN-GLOBAL" );
    SubLFiles.declareFunction( me, "xref_global_scope", "XREF-GLOBAL-SCOPE", 0, 0, false );
    SubLFiles.declareFunction( me, "xref_reference_scope", "XREF-REFERENCE-SCOPE", 0, 0, false );
    SubLFiles.declareFunction( me, "xref_note_global_definition", "XREF-NOTE-GLOBAL-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_macro_definition", "XREF-NOTE-MACRO-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_function_definition", "XREF-NOTE-FUNCTION-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_method_formal_arglist", "XREF-NOTE-METHOD-FORMAL-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_note_global_binding_type", "XREF-NOTE-GLOBAL-BINDING-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "xref_note_global_reference", "XREF-NOTE-GLOBAL-REFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_global_modification", "XREF-NOTE-GLOBAL-MODIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_global_binding", "XREF-NOTE-GLOBAL-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_macro_use", "XREF-NOTE-MACRO-USE", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_function_call", "XREF-NOTE-FUNCTION-CALL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_note_module_removal", "XREF-NOTE-MODULE-REMOVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_trace", "XREF-TRACE", 1, 2, false );
    SubLFiles.declareFunction( me, "xref_sort_called_globals", "XREF-SORT-CALLED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_called_methods", "XREF-SORT-CALLED-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_referenced_xrms", "XREF-SORT-REFERENCED-XRMS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_referenced_modules", "XREF-SORT-REFERENCED-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_calling_globals", "XREF-SORT-CALLING-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_calling_methods", "XREF-SORT-CALLING-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_calling_xrms", "XREF-SORT-CALLING-XRMS", 1, 0, false );
    SubLFiles.declareFunction( me, "xref_sort_calling_modules", "XREF-SORT-CALLING-MODULES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_xref_database_file()
  {
    $empty_set_contents$ = SubLFiles.deflexical( "*EMPTY-SET-CONTENTS*", set_contents.new_set_contents( ZERO_INTEGER, UNPROVIDED ) );
    $dtp_xref_module$ = SubLFiles.defconstant( "*DTP-XREF-MODULE*", $sym0$XREF_MODULE );
    $dtp_xref_system$ = SubLFiles.defconstant( "*DTP-XREF-SYSTEM*", $sym113$XREF_SYSTEM );
    $current_xref_module$ = SubLFiles.defparameter( "*CURRENT-XREF-MODULE*", NIL );
    $xref_module_scope$ = SubLFiles.defparameter( "*XREF-MODULE-SCOPE*", NIL );
    $xref_file_position_scope$ = SubLFiles.defparameter( "*XREF-FILE-POSITION-SCOPE*", NIL );
    $xref_method_scope$ = SubLFiles.defparameter( "*XREF-METHOD-SCOPE*", NIL );
    $xref_global_scope$ = SubLFiles.defparameter( "*XREF-GLOBAL-SCOPE*", NIL );
    $xref_trace$ = SubLFiles.defvar( "*XREF-TRACE*", NIL );
    return NIL;
  }

  public static SubLObject setup_xref_database_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), Symbols.symbol_function( $sym7$XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$XREF_M_NAME, $sym10$_CSETF_XREF_M_NAME );
    Structures.def_csetf( $sym11$XREF_M_XREF_SYSTEM, $sym12$_CSETF_XREF_M_XREF_SYSTEM );
    Structures.def_csetf( $sym13$XREF_M_FEATURES, $sym14$_CSETF_XREF_M_FEATURES );
    Structures.def_csetf( $sym15$XREF_M_METHOD_DEFINITIONS, $sym16$_CSETF_XREF_M_METHOD_DEFINITIONS );
    Structures.def_csetf( $sym17$XREF_M_METHOD_POSITION_TABLE, $sym18$_CSETF_XREF_M_METHOD_POSITION_TABLE );
    Structures.def_csetf( $sym19$XREF_M_METHOD_METHOD_TABLE, $sym20$_CSETF_XREF_M_METHOD_METHOD_TABLE );
    Structures.def_csetf( $sym21$XREF_M_METHOD_GLOBAL_REFERENCE_TABLE, $sym22$_CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE );
    Structures.def_csetf( $sym23$XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE, $sym24$_CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE );
    Structures.def_csetf( $sym25$XREF_M_METHOD_GLOBAL_BINDING_TABLE, $sym26$_CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE );
    Structures.def_csetf( $sym27$XREF_M_GLOBAL_DEFINITIONS, $sym28$_CSETF_XREF_M_GLOBAL_DEFINITIONS );
    Structures.def_csetf( $sym29$XREF_M_GLOBAL_POSITION_TABLE, $sym30$_CSETF_XREF_M_GLOBAL_POSITION_TABLE );
    Structures.def_csetf( $sym31$XREF_M_GLOBAL_METHOD_TABLE, $sym32$_CSETF_XREF_M_GLOBAL_METHOD_TABLE );
    Structures.def_csetf( $sym33$XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE, $sym34$_CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE );
    Structures.def_csetf( $sym35$XREF_M_TOP_METHOD_TABLE, $sym36$_CSETF_XREF_M_TOP_METHOD_TABLE );
    Structures.def_csetf( $sym37$XREF_M_TOP_GLOBAL_REFERENCE_TABLE, $sym38$_CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE );
    Structures.def_csetf( $sym39$XREF_M_TOP_GLOBAL_MODIFICATION_TABLE, $sym40$_CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE );
    Structures.def_csetf( $sym41$XREF_M_TOP_GLOBAL_BINDING_TABLE, $sym42$_CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE );
    Structures.def_csetf( $sym43$XREF_M_METHOD_FORMAL_ARGLIST_TABLE, $sym44$_CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE );
    Structures.def_csetf( $sym45$XREF_M_GLOBAL_BINDING_TYPE_TABLE, $sym46$_CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE );
    Equality.identity( $sym0$XREF_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), Symbols.symbol_function( $sym71$VISIT_DEFSTRUCT_OBJECT_XREF_MODULE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), Symbols.symbol_function( $sym73$SXHASH_XREF_MODULE_METHOD ) );
    access_macros.register_macro_helper( $sym87$XRM_METHOD_DEFINITIONS, $sym90$DO_XRM_METHOD_DEFINITIONS );
    access_macros.register_macro_helper( $sym94$XRM_METHOD_POSITION_TABLE, $sym95$DO_XRM_METHODS );
    access_macros.register_macro_helper( $sym100$XRM_GLOBAL_DEFINITIONS, $sym101$DO_XRM_GLOBAL_DEFINITIONS );
    access_macros.register_macro_helper( $sym104$XRM_GLOBAL_POSITION_TABLE, $sym105$DO_XRM_GLOBALS );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_xref_system$.getGlobalValue(), Symbols.symbol_function( $sym119$XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list120 );
    Structures.def_csetf( $sym121$XREF_S_NAME, $sym122$_CSETF_XREF_S_NAME );
    Structures.def_csetf( $sym123$XREF_S_FEATURES, $sym124$_CSETF_XREF_S_FEATURES );
    Structures.def_csetf( $sym125$XREF_S_XREF_MODULE_TABLE, $sym126$_CSETF_XREF_S_XREF_MODULE_TABLE );
    Structures.def_csetf( $sym127$XREF_S_METHOD_DEFINITION_TABLE, $sym128$_CSETF_XREF_S_METHOD_DEFINITION_TABLE );
    Structures.def_csetf( $sym129$XREF_S_GLOBAL_DEFINITION_TABLE, $sym130$_CSETF_XREF_S_GLOBAL_DEFINITION_TABLE );
    Structures.def_csetf( $sym131$XREF_S_METHOD_CALLED_BY_METHOD_TABLE, $sym132$_CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE );
    Structures.def_csetf( $sym133$XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE, $sym134$_CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE );
    Structures.def_csetf( $sym135$XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE, $sym136$_CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE );
    Structures.def_csetf( $sym137$XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE, $sym138$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE );
    Structures.def_csetf( $sym139$XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE, $sym140$_CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE );
    Structures.def_csetf( $sym141$XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE, $sym142$_CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE );
    Structures.def_csetf( $sym143$XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE, $sym144$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE );
    Structures.def_csetf( $sym145$XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE, $sym146$_CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE );
    Structures.def_csetf( $sym147$XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE, $sym148$_CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE );
    Structures.def_csetf( $sym149$XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE, $sym150$_CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE );
    Equality.identity( $sym113$XREF_SYSTEM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xref_system$.getGlobalValue(), Symbols.symbol_function( $sym165$VISIT_DEFSTRUCT_OBJECT_XREF_SYSTEM_METHOD ) );
    memoization_state.note_memoized_function( $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME );
    access_macros.register_macro_helper( $sym197$CURRENT_XREF_MODULE, $sym198$WITH_CURRENT_XREF_MODULE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xref_database_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xref_database_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xref_database_file();
  }
  static
  {
    me = new xref_database();
    $empty_set_contents$ = null;
    $dtp_xref_module$ = null;
    $dtp_xref_system$ = null;
    $current_xref_module$ = null;
    $xref_module_scope$ = null;
    $xref_file_position_scope$ = null;
    $xref_method_scope$ = null;
    $xref_global_scope$ = null;
    $xref_trace$ = null;
    $sym0$XREF_MODULE = makeSymbol( "XREF-MODULE" );
    $sym1$XREF_MODULE_P = makeSymbol( "XREF-MODULE-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "XREF-SYSTEM" ), makeSymbol( "FEATURES" ), makeSymbol( "METHOD-DEFINITIONS" ), makeSymbol( "METHOD-POSITION-TABLE" ), makeSymbol(
        "METHOD-METHOD-TABLE" ), makeSymbol( "METHOD-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "METHOD-GLOBAL-MODIFICATION-TABLE" ), makeSymbol( "METHOD-GLOBAL-BINDING-TABLE" ), makeSymbol( "GLOBAL-DEFINITIONS" ),
      makeSymbol( "GLOBAL-POSITION-TABLE" ), makeSymbol( "GLOBAL-METHOD-TABLE" ), makeSymbol( "GLOBAL-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "TOP-METHOD-TABLE" ), makeSymbol( "TOP-GLOBAL-REFERENCE-TABLE" ), makeSymbol(
          "TOP-GLOBAL-MODIFICATION-TABLE" ), makeSymbol( "TOP-GLOBAL-BINDING-TABLE" ), makeSymbol( "METHOD-FORMAL-ARGLIST-TABLE" ), makeSymbol( "GLOBAL-BINDING-TYPE-TABLE" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "XREF-SYSTEM" ), makeKeyword( "FEATURES" ), makeKeyword( "METHOD-DEFINITIONS" ), makeKeyword( "METHOD-POSITION-TABLE" ), makeKeyword(
        "METHOD-METHOD-TABLE" ), makeKeyword( "METHOD-GLOBAL-REFERENCE-TABLE" ), makeKeyword( "METHOD-GLOBAL-MODIFICATION-TABLE" ), makeKeyword( "METHOD-GLOBAL-BINDING-TABLE" ), makeKeyword( "GLOBAL-DEFINITIONS" ),
      makeKeyword( "GLOBAL-POSITION-TABLE" ), makeKeyword( "GLOBAL-METHOD-TABLE" ), makeKeyword( "GLOBAL-GLOBAL-REFERENCE-TABLE" ), makeKeyword( "TOP-METHOD-TABLE" ), makeKeyword( "TOP-GLOBAL-REFERENCE-TABLE" ),
      makeKeyword( "TOP-GLOBAL-MODIFICATION-TABLE" ), makeKeyword( "TOP-GLOBAL-BINDING-TABLE" ), makeKeyword( "METHOD-FORMAL-ARGLIST-TABLE" ), makeKeyword( "GLOBAL-BINDING-TYPE-TABLE" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "XREF-M-NAME" ), makeSymbol( "XREF-M-XREF-SYSTEM" ), makeSymbol( "XREF-M-FEATURES" ), makeSymbol( "XREF-M-METHOD-DEFINITIONS" ), makeSymbol(
        "XREF-M-METHOD-POSITION-TABLE" ), makeSymbol( "XREF-M-METHOD-METHOD-TABLE" ), makeSymbol( "XREF-M-METHOD-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE" ), makeSymbol(
            "XREF-M-METHOD-GLOBAL-BINDING-TABLE" ), makeSymbol( "XREF-M-GLOBAL-DEFINITIONS" ), makeSymbol( "XREF-M-GLOBAL-POSITION-TABLE" ), makeSymbol( "XREF-M-GLOBAL-METHOD-TABLE" ), makeSymbol(
                "XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "XREF-M-TOP-METHOD-TABLE" ), makeSymbol( "XREF-M-TOP-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "XREF-M-TOP-GLOBAL-MODIFICATION-TABLE" ), makeSymbol(
                    "XREF-M-TOP-GLOBAL-BINDING-TABLE" ), makeSymbol( "XREF-M-METHOD-FORMAL-ARGLIST-TABLE" ), makeSymbol( "XREF-M-GLOBAL-BINDING-TYPE-TABLE" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-XREF-M-NAME" ), makeSymbol( "_CSETF-XREF-M-XREF-SYSTEM" ), makeSymbol( "_CSETF-XREF-M-FEATURES" ), makeSymbol( "_CSETF-XREF-M-METHOD-DEFINITIONS" ),
      makeSymbol( "_CSETF-XREF-M-METHOD-POSITION-TABLE" ), makeSymbol( "_CSETF-XREF-M-METHOD-METHOD-TABLE" ), makeSymbol( "_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE" ), makeSymbol(
          "_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE" ), makeSymbol( "_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE" ), makeSymbol( "_CSETF-XREF-M-GLOBAL-DEFINITIONS" ), makeSymbol(
              "_CSETF-XREF-M-GLOBAL-POSITION-TABLE" ), makeSymbol( "_CSETF-XREF-M-GLOBAL-METHOD-TABLE" ), makeSymbol( "_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "_CSETF-XREF-M-TOP-METHOD-TABLE" ),
      makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE" ), makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE" ), makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE" ), makeSymbol(
          "_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE" ), makeSymbol( "_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE" )
    } );
    $sym6$PRINT_XREF_MODULE = makeSymbol( "PRINT-XREF-MODULE" );
    $sym7$XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "XREF-MODULE-P" ) );
    $sym9$XREF_M_NAME = makeSymbol( "XREF-M-NAME" );
    $sym10$_CSETF_XREF_M_NAME = makeSymbol( "_CSETF-XREF-M-NAME" );
    $sym11$XREF_M_XREF_SYSTEM = makeSymbol( "XREF-M-XREF-SYSTEM" );
    $sym12$_CSETF_XREF_M_XREF_SYSTEM = makeSymbol( "_CSETF-XREF-M-XREF-SYSTEM" );
    $sym13$XREF_M_FEATURES = makeSymbol( "XREF-M-FEATURES" );
    $sym14$_CSETF_XREF_M_FEATURES = makeSymbol( "_CSETF-XREF-M-FEATURES" );
    $sym15$XREF_M_METHOD_DEFINITIONS = makeSymbol( "XREF-M-METHOD-DEFINITIONS" );
    $sym16$_CSETF_XREF_M_METHOD_DEFINITIONS = makeSymbol( "_CSETF-XREF-M-METHOD-DEFINITIONS" );
    $sym17$XREF_M_METHOD_POSITION_TABLE = makeSymbol( "XREF-M-METHOD-POSITION-TABLE" );
    $sym18$_CSETF_XREF_M_METHOD_POSITION_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-POSITION-TABLE" );
    $sym19$XREF_M_METHOD_METHOD_TABLE = makeSymbol( "XREF-M-METHOD-METHOD-TABLE" );
    $sym20$_CSETF_XREF_M_METHOD_METHOD_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-METHOD-TABLE" );
    $sym21$XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol( "XREF-M-METHOD-GLOBAL-REFERENCE-TABLE" );
    $sym22$_CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE" );
    $sym23$XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol( "XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE" );
    $sym24$_CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE" );
    $sym25$XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol( "XREF-M-METHOD-GLOBAL-BINDING-TABLE" );
    $sym26$_CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE" );
    $sym27$XREF_M_GLOBAL_DEFINITIONS = makeSymbol( "XREF-M-GLOBAL-DEFINITIONS" );
    $sym28$_CSETF_XREF_M_GLOBAL_DEFINITIONS = makeSymbol( "_CSETF-XREF-M-GLOBAL-DEFINITIONS" );
    $sym29$XREF_M_GLOBAL_POSITION_TABLE = makeSymbol( "XREF-M-GLOBAL-POSITION-TABLE" );
    $sym30$_CSETF_XREF_M_GLOBAL_POSITION_TABLE = makeSymbol( "_CSETF-XREF-M-GLOBAL-POSITION-TABLE" );
    $sym31$XREF_M_GLOBAL_METHOD_TABLE = makeSymbol( "XREF-M-GLOBAL-METHOD-TABLE" );
    $sym32$_CSETF_XREF_M_GLOBAL_METHOD_TABLE = makeSymbol( "_CSETF-XREF-M-GLOBAL-METHOD-TABLE" );
    $sym33$XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol( "XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE" );
    $sym34$_CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol( "_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE" );
    $sym35$XREF_M_TOP_METHOD_TABLE = makeSymbol( "XREF-M-TOP-METHOD-TABLE" );
    $sym36$_CSETF_XREF_M_TOP_METHOD_TABLE = makeSymbol( "_CSETF-XREF-M-TOP-METHOD-TABLE" );
    $sym37$XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol( "XREF-M-TOP-GLOBAL-REFERENCE-TABLE" );
    $sym38$_CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE" );
    $sym39$XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol( "XREF-M-TOP-GLOBAL-MODIFICATION-TABLE" );
    $sym40$_CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE" );
    $sym41$XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol( "XREF-M-TOP-GLOBAL-BINDING-TABLE" );
    $sym42$_CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol( "_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE" );
    $sym43$XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol( "XREF-M-METHOD-FORMAL-ARGLIST-TABLE" );
    $sym44$_CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol( "_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE" );
    $sym45$XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol( "XREF-M-GLOBAL-BINDING-TYPE-TABLE" );
    $sym46$_CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol( "_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE" );
    $kw47$NAME = makeKeyword( "NAME" );
    $kw48$XREF_SYSTEM = makeKeyword( "XREF-SYSTEM" );
    $kw49$FEATURES = makeKeyword( "FEATURES" );
    $kw50$METHOD_DEFINITIONS = makeKeyword( "METHOD-DEFINITIONS" );
    $kw51$METHOD_POSITION_TABLE = makeKeyword( "METHOD-POSITION-TABLE" );
    $kw52$METHOD_METHOD_TABLE = makeKeyword( "METHOD-METHOD-TABLE" );
    $kw53$METHOD_GLOBAL_REFERENCE_TABLE = makeKeyword( "METHOD-GLOBAL-REFERENCE-TABLE" );
    $kw54$METHOD_GLOBAL_MODIFICATION_TABLE = makeKeyword( "METHOD-GLOBAL-MODIFICATION-TABLE" );
    $kw55$METHOD_GLOBAL_BINDING_TABLE = makeKeyword( "METHOD-GLOBAL-BINDING-TABLE" );
    $kw56$GLOBAL_DEFINITIONS = makeKeyword( "GLOBAL-DEFINITIONS" );
    $kw57$GLOBAL_POSITION_TABLE = makeKeyword( "GLOBAL-POSITION-TABLE" );
    $kw58$GLOBAL_METHOD_TABLE = makeKeyword( "GLOBAL-METHOD-TABLE" );
    $kw59$GLOBAL_GLOBAL_REFERENCE_TABLE = makeKeyword( "GLOBAL-GLOBAL-REFERENCE-TABLE" );
    $kw60$TOP_METHOD_TABLE = makeKeyword( "TOP-METHOD-TABLE" );
    $kw61$TOP_GLOBAL_REFERENCE_TABLE = makeKeyword( "TOP-GLOBAL-REFERENCE-TABLE" );
    $kw62$TOP_GLOBAL_MODIFICATION_TABLE = makeKeyword( "TOP-GLOBAL-MODIFICATION-TABLE" );
    $kw63$TOP_GLOBAL_BINDING_TABLE = makeKeyword( "TOP-GLOBAL-BINDING-TABLE" );
    $kw64$METHOD_FORMAL_ARGLIST_TABLE = makeKeyword( "METHOD-FORMAL-ARGLIST-TABLE" );
    $kw65$GLOBAL_BINDING_TYPE_TABLE = makeKeyword( "GLOBAL-BINDING-TYPE-TABLE" );
    $str66$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw67$BEGIN = makeKeyword( "BEGIN" );
    $sym68$MAKE_XREF_MODULE = makeSymbol( "MAKE-XREF-MODULE" );
    $kw69$SLOT = makeKeyword( "SLOT" );
    $kw70$END = makeKeyword( "END" );
    $sym71$VISIT_DEFSTRUCT_OBJECT_XREF_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-XREF-MODULE-METHOD" );
    $str72$_A____S_methods___S_globals = makeString( "~A : ~S methods, ~S globals" );
    $sym73$SXHASH_XREF_MODULE_METHOD = makeSymbol( "SXHASH-XREF-MODULE-METHOD" );
    $sym74$STRINGP = makeSymbol( "STRINGP" );
    $sym75$XREF_SYSTEM_P = makeSymbol( "XREF-SYSTEM-P" );
    $sym76$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym77$SYMBOLP = makeSymbol( "SYMBOLP" );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "XRM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list79 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw80$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw81$DONE = makeKeyword( "DONE" );
    $sym82$XRM_VAR = makeUninternedSymbol( "XRM-VAR" );
    $sym83$DEFINITION = makeUninternedSymbol( "DEFINITION" );
    $sym84$POSITION = makeUninternedSymbol( "POSITION" );
    $sym85$CLET = makeSymbol( "CLET" );
    $sym86$DO_LIST = makeSymbol( "DO-LIST" );
    $sym87$XRM_METHOD_DEFINITIONS = makeSymbol( "XRM-METHOD-DEFINITIONS" );
    $sym88$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym89$IGNORE = makeSymbol( "IGNORE" );
    $sym90$DO_XRM_METHOD_DEFINITIONS = makeSymbol( "DO-XRM-METHOD-DEFINITIONS" );
    $sym91$XRM_VAR = makeUninternedSymbol( "XRM-VAR" );
    $sym92$POSITION = makeUninternedSymbol( "POSITION" );
    $sym93$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym94$XRM_METHOD_POSITION_TABLE = makeSymbol( "XRM-METHOD-POSITION-TABLE" );
    $sym95$DO_XRM_METHODS = makeSymbol( "DO-XRM-METHODS" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "GLOBAL" ), makeSymbol( "XRM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym97$XRM_VAR = makeUninternedSymbol( "XRM-VAR" );
    $sym98$DEFINITION = makeUninternedSymbol( "DEFINITION" );
    $sym99$POSITION = makeUninternedSymbol( "POSITION" );
    $sym100$XRM_GLOBAL_DEFINITIONS = makeSymbol( "XRM-GLOBAL-DEFINITIONS" );
    $sym101$DO_XRM_GLOBAL_DEFINITIONS = makeSymbol( "DO-XRM-GLOBAL-DEFINITIONS" );
    $sym102$XRM_VAR = makeUninternedSymbol( "XRM-VAR" );
    $sym103$POSITION = makeUninternedSymbol( "POSITION" );
    $sym104$XRM_GLOBAL_POSITION_TABLE = makeSymbol( "XRM-GLOBAL-POSITION-TABLE" );
    $sym105$DO_XRM_GLOBALS = makeSymbol( "DO-XRM-GLOBALS" );
    $sym106$CAR = makeSymbol( "CAR" );
    $list107 = ConsesLow.cons( makeSymbol( "CANDIDATE-METHOD" ), makeSymbol( "POSITION" ) );
    $list108 = ConsesLow.cons( makeSymbol( "CANDIDATE-GLOBAL" ), makeSymbol( "POSITION" ) );
    $kw109$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $sym110$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym111$LISTP = makeSymbol( "LISTP" );
    $sym112$BINDING_TYPE_P = makeSymbol( "BINDING-TYPE-P" );
    $sym113$XREF_SYSTEM = makeSymbol( "XREF-SYSTEM" );
    $list114 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "FEATURES" ), makeSymbol( "XREF-MODULE-TABLE" ), makeSymbol( "METHOD-DEFINITION-TABLE" ), makeSymbol( "GLOBAL-DEFINITION-TABLE" ),
      makeSymbol( "METHOD-CALLED-BY-METHOD-TABLE" ), makeSymbol( "METHOD-CALLED-BY-GLOBAL-TABLE" ), makeSymbol( "METHOD-CALLED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "GLOBAL-REFERENCED-BY-METHOD-TABLE" ), makeSymbol(
          "GLOBAL-MODIFIED-BY-METHOD-TABLE" ), makeSymbol( "GLOBAL-REBOUND-BY-METHOD-TABLE" ), makeSymbol( "GLOBAL-REFERENCED-BY-GLOBAL-TABLE" ), makeSymbol( "GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" ), makeSymbol(
              "GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" )
    } );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "FEATURES" ), makeKeyword( "XREF-MODULE-TABLE" ), makeKeyword( "METHOD-DEFINITION-TABLE" ), makeKeyword( "GLOBAL-DEFINITION-TABLE" ),
      makeKeyword( "METHOD-CALLED-BY-METHOD-TABLE" ), makeKeyword( "METHOD-CALLED-BY-GLOBAL-TABLE" ), makeKeyword( "METHOD-CALLED-AT-TOP-LEVEL-TABLE" ), makeKeyword( "GLOBAL-REFERENCED-BY-METHOD-TABLE" ), makeKeyword(
          "GLOBAL-MODIFIED-BY-METHOD-TABLE" ), makeKeyword( "GLOBAL-REBOUND-BY-METHOD-TABLE" ), makeKeyword( "GLOBAL-REFERENCED-BY-GLOBAL-TABLE" ), makeKeyword( "GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" ), makeKeyword(
              "GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" ), makeKeyword( "GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" )
    } );
    $list116 = ConsesLow.list( new SubLObject[] { makeSymbol( "XREF-S-NAME" ), makeSymbol( "XREF-S-FEATURES" ), makeSymbol( "XREF-S-XREF-MODULE-TABLE" ), makeSymbol( "XREF-S-METHOD-DEFINITION-TABLE" ), makeSymbol(
        "XREF-S-GLOBAL-DEFINITION-TABLE" ), makeSymbol( "XREF-S-METHOD-CALLED-BY-METHOD-TABLE" ), makeSymbol( "XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE" ), makeSymbol( "XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE" ), makeSymbol(
            "XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE" ), makeSymbol( "XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE" ), makeSymbol( "XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE" ), makeSymbol(
                "XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE" ), makeSymbol( "XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" ), makeSymbol(
                    "XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" )
    } );
    $list117 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-XREF-S-NAME" ), makeSymbol( "_CSETF-XREF-S-FEATURES" ), makeSymbol( "_CSETF-XREF-S-XREF-MODULE-TABLE" ), makeSymbol(
        "_CSETF-XREF-S-METHOD-DEFINITION-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE" ), makeSymbol( "_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE" ), makeSymbol(
            "_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE" ), makeSymbol( "_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE" ), makeSymbol(
                "_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE" ), makeSymbol(
                    "_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" ), makeSymbol( "_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" )
    } );
    $sym118$PRINT_XREF_SYSTEM = makeSymbol( "PRINT-XREF-SYSTEM" );
    $sym119$XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE" );
    $list120 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "XREF-SYSTEM-P" ) );
    $sym121$XREF_S_NAME = makeSymbol( "XREF-S-NAME" );
    $sym122$_CSETF_XREF_S_NAME = makeSymbol( "_CSETF-XREF-S-NAME" );
    $sym123$XREF_S_FEATURES = makeSymbol( "XREF-S-FEATURES" );
    $sym124$_CSETF_XREF_S_FEATURES = makeSymbol( "_CSETF-XREF-S-FEATURES" );
    $sym125$XREF_S_XREF_MODULE_TABLE = makeSymbol( "XREF-S-XREF-MODULE-TABLE" );
    $sym126$_CSETF_XREF_S_XREF_MODULE_TABLE = makeSymbol( "_CSETF-XREF-S-XREF-MODULE-TABLE" );
    $sym127$XREF_S_METHOD_DEFINITION_TABLE = makeSymbol( "XREF-S-METHOD-DEFINITION-TABLE" );
    $sym128$_CSETF_XREF_S_METHOD_DEFINITION_TABLE = makeSymbol( "_CSETF-XREF-S-METHOD-DEFINITION-TABLE" );
    $sym129$XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol( "XREF-S-GLOBAL-DEFINITION-TABLE" );
    $sym130$_CSETF_XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE" );
    $sym131$XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol( "XREF-S-METHOD-CALLED-BY-METHOD-TABLE" );
    $sym132$_CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol( "_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE" );
    $sym133$XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol( "XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE" );
    $sym134$_CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol( "_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE" );
    $sym135$XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol( "XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE" );
    $sym136$_CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol( "_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE" );
    $sym137$XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol( "XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE" );
    $sym138$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE" );
    $sym139$XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol( "XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE" );
    $sym140$_CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE" );
    $sym141$XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol( "XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE" );
    $sym142$_CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE" );
    $sym143$XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol( "XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE" );
    $sym144$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE" );
    $sym145$XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol( "XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" );
    $sym146$_CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" );
    $sym147$XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol( "XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" );
    $sym148$_CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" );
    $sym149$XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol( "XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" );
    $sym150$_CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol( "_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" );
    $kw151$XREF_MODULE_TABLE = makeKeyword( "XREF-MODULE-TABLE" );
    $kw152$METHOD_DEFINITION_TABLE = makeKeyword( "METHOD-DEFINITION-TABLE" );
    $kw153$GLOBAL_DEFINITION_TABLE = makeKeyword( "GLOBAL-DEFINITION-TABLE" );
    $kw154$METHOD_CALLED_BY_METHOD_TABLE = makeKeyword( "METHOD-CALLED-BY-METHOD-TABLE" );
    $kw155$METHOD_CALLED_BY_GLOBAL_TABLE = makeKeyword( "METHOD-CALLED-BY-GLOBAL-TABLE" );
    $kw156$METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeKeyword( "METHOD-CALLED-AT-TOP-LEVEL-TABLE" );
    $kw157$GLOBAL_REFERENCED_BY_METHOD_TABLE = makeKeyword( "GLOBAL-REFERENCED-BY-METHOD-TABLE" );
    $kw158$GLOBAL_MODIFIED_BY_METHOD_TABLE = makeKeyword( "GLOBAL-MODIFIED-BY-METHOD-TABLE" );
    $kw159$GLOBAL_REBOUND_BY_METHOD_TABLE = makeKeyword( "GLOBAL-REBOUND-BY-METHOD-TABLE" );
    $kw160$GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeKeyword( "GLOBAL-REFERENCED-BY-GLOBAL-TABLE" );
    $kw161$GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeKeyword( "GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE" );
    $kw162$GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeKeyword( "GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE" );
    $kw163$GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeKeyword( "GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE" );
    $sym164$MAKE_XREF_SYSTEM = makeSymbol( "MAKE-XREF-SYSTEM" );
    $sym165$VISIT_DEFSTRUCT_OBJECT_XREF_SYSTEM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-XREF-SYSTEM-METHOD" );
    $str166$_A____S_features___S_modules = makeString( "~A : ~S features, ~S modules" );
    $int167$10000 = makeInteger( 10000 );
    $int168$1000 = makeInteger( 1000 );
    $int169$500 = makeInteger( 500 );
    $str170$Module__A_features_changed_to__S = makeString( "Module ~A features changed to ~S" );
    $kw171$SL2C = makeKeyword( "SL2C" );
    $kw172$SL2JAVA = makeKeyword( "SL2JAVA" );
    $str173$Unexpected_backend__S = makeString( "Unexpected backend ~S" );
    $sym174$XRM_NAME = makeSymbol( "XRM-NAME" );
    $sym175$NOT_EQ = makeSymbol( "NOT-EQ" );
    $sym176$CDR = makeSymbol( "CDR" );
    $kw177$METHODS = makeKeyword( "METHODS" );
    $kw178$GLOBALS = makeKeyword( "GLOBALS" );
    $sym179$XREF_METHOD_POTENTIALLY_PRIVATE_P = makeSymbol( "XREF-METHOD-POTENTIALLY-PRIVATE-P" );
    $sym180$XREF_GLOBAL_POTENTIALLY_PRIVATE_P = makeSymbol( "XREF-GLOBAL-POTENTIALLY-PRIVATE-P" );
    $sym181$CODE_COMMENT = makeSymbol( "CODE-COMMENT" );
    $str182$_subl_ = makeString( "@subl " );
    $str183$_ = makeString( " " );
    $sym184$XREF_MODULE_RELATIVE_INPUT_FILENAME = makeSymbol( "XREF-MODULE-RELATIVE-INPUT-FILENAME" );
    $list185 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "NAME" ), makeSymbol( "FEATURES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list186 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "FEATURES" ) );
    $sym187$SYSTEM_VAR = makeUninternedSymbol( "SYSTEM-VAR" );
    $sym188$MODULE_VAR = makeUninternedSymbol( "MODULE-VAR" );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-XREF-SYSTEM" ) ) );
    $sym190$FWHEN = makeSymbol( "FWHEN" );
    $sym191$NEW_XREF_MODULE = makeSymbol( "NEW-XREF-MODULE" );
    $sym192$_CURRENT_XREF_MODULE_ = makeSymbol( "*CURRENT-XREF-MODULE*" );
    $sym193$PWHEN = makeSymbol( "PWHEN" );
    $sym194$XRS_MERGE_XREF_MODULE = makeSymbol( "XRS-MERGE-XREF-MODULE" );
    $list195 = ConsesLow.list( makeSymbol( "XRM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-XREF-MODULE" ) ) );
    $sym197$CURRENT_XREF_MODULE = makeSymbol( "CURRENT-XREF-MODULE" );
    $sym198$WITH_CURRENT_XREF_MODULE = makeSymbol( "WITH-CURRENT-XREF-MODULE" );
    $list199 = ConsesLow.list( makeSymbol( "MODULE-NAME" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym200$NAME_VAR = makeUninternedSymbol( "NAME-VAR" );
    $sym201$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list202 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $sym203$_XREF_MODULE_SCOPE_ = makeSymbol( "*XREF-MODULE-SCOPE*" );
    $list204 = ConsesLow.list( makeSymbol( "FILE-POSITION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym205$POSITION_VAR = makeUninternedSymbol( "POSITION-VAR" );
    $list206 = ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ) );
    $sym207$_XREF_FILE_POSITION_SCOPE_ = makeSymbol( "*XREF-FILE-POSITION-SCOPE*" );
    $list208 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym209$XREF_WITHIN_METHOD = makeSymbol( "XREF-WITHIN-METHOD" );
    $list210 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym211$METHOD_VAR = makeUninternedSymbol( "METHOD-VAR" );
    $list212 = ConsesLow.list( makeSymbol( "SYMBOLP" ) );
    $sym213$_XREF_METHOD_SCOPE_ = makeSymbol( "*XREF-METHOD-SCOPE*" );
    $list214 = ConsesLow.list( makeSymbol( "GLOBAL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym215$GLOBAL_VAR = makeUninternedSymbol( "GLOBAL-VAR" );
    $sym216$_XREF_GLOBAL_SCOPE_ = makeSymbol( "*XREF-GLOBAL-SCOPE*" );
    $kw217$METHOD = makeKeyword( "METHOD" );
    $kw218$GLOBAL = makeKeyword( "GLOBAL" );
    $kw219$FILE = makeKeyword( "FILE" );
    $str220$___def_glob____S = makeString( "~% def glob : ~S" );
    $str221$___defmacro____S = makeString( "~% defmacro : ~S" );
    $str222$___define______S = makeString( "~% define   : ~S" );
    $str223$____arglist____S = makeString( "~%  arglist : ~S" );
    $str224$____binding_type____S = makeString( "~%  binding-type : ~S" );
    $str225$____ref_glob_____S = makeString( "~%  ref glob  : ~S" );
    $str226$____mod_glob_____S = makeString( "~%  mod glob  : ~S" );
    $str227$Initializer_for__S_modifies__S = makeString( "Initializer for ~S modifies ~S" );
    $str228$____bind_glob_____S = makeString( "~%  bind glob  : ~S" );
    $str229$Initializer_for__S_rebinds__S = makeString( "Initializer for ~S rebinds ~S" );
    $str230$____macro_use____S = makeString( "~%  macro use : ~S" );
    $str231$____fun_call_____S = makeString( "~%  fun call  : ~S" );
    $str232$__module_removed_____A = makeString( "~%module removed  : ~A" );
    $sym233$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym234$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym235$_ = makeSymbol( "<" );
    $sym236$XREF_GLOBAL_ACCESS_COUNT = makeSymbol( "XREF-GLOBAL-ACCESS-COUNT" );
    $sym237$XREF_METHOD_CALL_COUNT = makeSymbol( "XREF-METHOD-CALL-COUNT" );
  }

  public static final class $xref_module_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $xref_system;
    public SubLObject $features;
    public SubLObject $method_definitions;
    public SubLObject $method_position_table;
    public SubLObject $method_method_table;
    public SubLObject $method_global_reference_table;
    public SubLObject $method_global_modification_table;
    public SubLObject $method_global_binding_table;
    public SubLObject $global_definitions;
    public SubLObject $global_position_table;
    public SubLObject $global_method_table;
    public SubLObject $global_global_reference_table;
    public SubLObject $top_method_table;
    public SubLObject $top_global_reference_table;
    public SubLObject $top_global_modification_table;
    public SubLObject $top_global_binding_table;
    public SubLObject $method_formal_arglist_table;
    public SubLObject $global_binding_type_table;
    private static final SubLStructDeclNative structDecl;

    public $xref_module_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$xref_system = CommonSymbols.NIL;
      this.$features = CommonSymbols.NIL;
      this.$method_definitions = CommonSymbols.NIL;
      this.$method_position_table = CommonSymbols.NIL;
      this.$method_method_table = CommonSymbols.NIL;
      this.$method_global_reference_table = CommonSymbols.NIL;
      this.$method_global_modification_table = CommonSymbols.NIL;
      this.$method_global_binding_table = CommonSymbols.NIL;
      this.$global_definitions = CommonSymbols.NIL;
      this.$global_position_table = CommonSymbols.NIL;
      this.$global_method_table = CommonSymbols.NIL;
      this.$global_global_reference_table = CommonSymbols.NIL;
      this.$top_method_table = CommonSymbols.NIL;
      this.$top_global_reference_table = CommonSymbols.NIL;
      this.$top_global_modification_table = CommonSymbols.NIL;
      this.$top_global_binding_table = CommonSymbols.NIL;
      this.$method_formal_arglist_table = CommonSymbols.NIL;
      this.$global_binding_type_table = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $xref_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$xref_system;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$features;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$method_definitions;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$method_position_table;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$method_method_table;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$method_global_reference_table;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$method_global_modification_table;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$method_global_binding_table;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$global_definitions;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$global_position_table;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$global_method_table;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$global_global_reference_table;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$top_method_table;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$top_global_reference_table;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$top_global_modification_table;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$top_global_binding_table;
    }

    @Override
    public SubLObject getField19()
    {
      return this.$method_formal_arglist_table;
    }

    @Override
    public SubLObject getField20()
    {
      return this.$global_binding_type_table;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$xref_system = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$features = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$method_definitions = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$method_position_table = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$method_method_table = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$method_global_reference_table = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$method_global_modification_table = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$method_global_binding_table = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$global_definitions = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$global_position_table = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$global_method_table = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$global_global_reference_table = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$top_method_table = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$top_global_reference_table = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$top_global_modification_table = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$top_global_binding_table = value;
    }

    @Override
    public SubLObject setField19(final SubLObject value)
    {
      return this.$method_formal_arglist_table = value;
    }

    @Override
    public SubLObject setField20(final SubLObject value)
    {
      return this.$global_binding_type_table = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $xref_module_native.class, $sym0$XREF_MODULE, $sym1$XREF_MODULE_P, $list2, $list3, new String[] { "$name", "$xref_system", "$features", "$method_definitions",
        "$method_position_table", "$method_method_table", "$method_global_reference_table", "$method_global_modification_table", "$method_global_binding_table", "$global_definitions", "$global_position_table",
        "$global_method_table", "$global_global_reference_table", "$top_method_table", "$top_global_reference_table", "$top_global_modification_table", "$top_global_binding_table", "$method_formal_arglist_table",
        "$global_binding_type_table"
      }, $list4, $list5, $sym6$PRINT_XREF_MODULE );
    }
  }

  public static final class $xref_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $xref_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "XREF-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return xref_module_p( arg1 );
    }
  }

  public static final class $xref_system_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $features;
    public SubLObject $xref_module_table;
    public SubLObject $method_definition_table;
    public SubLObject $global_definition_table;
    public SubLObject $method_called_by_method_table;
    public SubLObject $method_called_by_global_table;
    public SubLObject $method_called_at_top_level_table;
    public SubLObject $global_referenced_by_method_table;
    public SubLObject $global_modified_by_method_table;
    public SubLObject $global_rebound_by_method_table;
    public SubLObject $global_referenced_by_global_table;
    public SubLObject $global_referenced_at_top_level_table;
    public SubLObject $global_modified_at_top_level_table;
    public SubLObject $global_rebound_at_top_level_table;
    private static final SubLStructDeclNative structDecl;

    public $xref_system_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$features = CommonSymbols.NIL;
      this.$xref_module_table = CommonSymbols.NIL;
      this.$method_definition_table = CommonSymbols.NIL;
      this.$global_definition_table = CommonSymbols.NIL;
      this.$method_called_by_method_table = CommonSymbols.NIL;
      this.$method_called_by_global_table = CommonSymbols.NIL;
      this.$method_called_at_top_level_table = CommonSymbols.NIL;
      this.$global_referenced_by_method_table = CommonSymbols.NIL;
      this.$global_modified_by_method_table = CommonSymbols.NIL;
      this.$global_rebound_by_method_table = CommonSymbols.NIL;
      this.$global_referenced_by_global_table = CommonSymbols.NIL;
      this.$global_referenced_at_top_level_table = CommonSymbols.NIL;
      this.$global_modified_at_top_level_table = CommonSymbols.NIL;
      this.$global_rebound_at_top_level_table = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $xref_system_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$features;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$xref_module_table;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$method_definition_table;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$global_definition_table;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$method_called_by_method_table;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$method_called_by_global_table;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$method_called_at_top_level_table;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$global_referenced_by_method_table;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$global_modified_by_method_table;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$global_rebound_by_method_table;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$global_referenced_by_global_table;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$global_referenced_at_top_level_table;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$global_modified_at_top_level_table;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$global_rebound_at_top_level_table;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$features = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$xref_module_table = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$method_definition_table = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$global_definition_table = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$method_called_by_method_table = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$method_called_by_global_table = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$method_called_at_top_level_table = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$global_referenced_by_method_table = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$global_modified_by_method_table = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$global_rebound_by_method_table = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$global_referenced_by_global_table = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$global_referenced_at_top_level_table = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$global_modified_at_top_level_table = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$global_rebound_at_top_level_table = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $xref_system_native.class, $sym113$XREF_SYSTEM, $sym75$XREF_SYSTEM_P, $list114, $list115, new String[] { "$name", "$features", "$xref_module_table",
        "$method_definition_table", "$global_definition_table", "$method_called_by_method_table", "$method_called_by_global_table", "$method_called_at_top_level_table", "$global_referenced_by_method_table",
        "$global_modified_by_method_table", "$global_rebound_by_method_table", "$global_referenced_by_global_table", "$global_referenced_at_top_level_table", "$global_modified_at_top_level_table",
        "$global_rebound_at_top_level_table"
      }, $list116, $list117, $sym118$PRINT_XREF_SYSTEM );
    }
  }

  public static final class $xref_system_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $xref_system_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "XREF-SYSTEM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return xref_system_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1047 ms
 * 
 */
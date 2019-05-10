package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.set_contents;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_modules";
  public static final String myFingerPrint = "f5f9fcc424bd7fc666d1bc2ddf032d2b8831d8370456272003b844b3b510e8bf";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 870L)
  private static SubLSymbol $meta_removal_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 1192L)
  private static SubLSymbol $hl_module_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3737L)
  private static SubLSymbol $valid_hl_module_subtypes$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3855L)
  private static SubLSymbol $default_hl_module_subtype$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 4009L)
  private static SubLSymbol $hl_module_property_defaults$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLSymbol $dtp_hl_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
  private static SubLSymbol $cfasl_create_invalid_hl_module_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17099L)
  private static SubLSymbol $hl_module_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36199L)
  private static SubLSymbol $removal_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36873L)
  private static SubLSymbol $removal_modules_external$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37222L)
  private static SubLSymbol $removal_modules_generic$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38061L)
  private static SubLSymbol $removal_modules_universal$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39716L)
  private static SubLSymbol $removal_modules_specific$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42062L)
  private static SubLSymbol $removal_modules_specific_use_generic$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42268L)
  private static SubLSymbol $removal_modules_specific_use_meta_removal$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42484L)
  private static SubLSymbol $removal_modules_specific_dont_use_universal$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42663L)
  private static SubLSymbol $solely_specific_removal_module_predicate_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50871L)
  private static SubLSymbol $classify_removal_modules_with_deterministic_sortP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53737L)
  private static SubLSymbol $removal_pruning_module_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54501L)
  private static SubLSymbol $conjunctive_removal_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60197L)
  private static SubLSymbol $transformation_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61217L)
  private static SubLSymbol $meta_transformation_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62420L)
  private static SubLSymbol $rewrite_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65023L)
  private static SubLSymbol $structural_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65712L)
  private static SubLSymbol $meta_structural_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66784L)
  private static SubLSymbol $cfasl_wide_opcode_hl_module$;
  private static final SubLSymbol $sym0$_META_REMOVAL_MODULES_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$MODULE_VAR;
  private static final SubLSymbol $sym4$CLET;
  private static final SubLSymbol $sym5$DO_LIST;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PWHEN;
  private static final SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_;
  private static final SubLSymbol $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$KB;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$MODULE_SUBTYPE;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$ALL;
  private static final SubLSymbol $kw16$OR;
  private static final SubLSymbol $sym17$ALLOWED_MODULES_SPEC_P;
  private static final SubLSymbol $kw18$AND;
  private static final SubLSymbol $kw19$NOT;
  private static final SubLSymbol $kw20$MODULE_TYPE;
  private static final SubLSymbol $sym21$HL_MODULE_P;
  private static final SubLSymbol $sym22$HL_MODULE;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$PRINT_HL_MODULE;
  private static final SubLSymbol $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$HL_MOD_NAME;
  private static final SubLSymbol $sym31$_CSETF_HL_MOD_NAME;
  private static final SubLSymbol $sym32$HL_MOD_PLIST;
  private static final SubLSymbol $sym33$_CSETF_HL_MOD_PLIST;
  private static final SubLSymbol $sym34$HL_MOD_SENSE;
  private static final SubLSymbol $sym35$_CSETF_HL_MOD_SENSE;
  private static final SubLSymbol $sym36$HL_MOD_PREDICATE;
  private static final SubLSymbol $sym37$_CSETF_HL_MOD_PREDICATE;
  private static final SubLSymbol $sym38$HL_MOD_ANY_PREDICATES;
  private static final SubLSymbol $sym39$_CSETF_HL_MOD_ANY_PREDICATES;
  private static final SubLSymbol $sym40$HL_MOD_ARITY;
  private static final SubLSymbol $sym41$_CSETF_HL_MOD_ARITY;
  private static final SubLSymbol $sym42$HL_MOD_DIRECTION;
  private static final SubLSymbol $sym43$_CSETF_HL_MOD_DIRECTION;
  private static final SubLSymbol $sym44$HL_MOD_REQUIRED_PATTERN;
  private static final SubLSymbol $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN;
  private static final SubLSymbol $sym46$HL_MOD_REQUIRED_MT;
  private static final SubLSymbol $sym47$_CSETF_HL_MOD_REQUIRED_MT;
  private static final SubLSymbol $sym48$HL_MOD_EXCLUSIVE_FUNC;
  private static final SubLSymbol $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC;
  private static final SubLSymbol $sym50$HL_MOD_REQUIRED_FUNC;
  private static final SubLSymbol $sym51$_CSETF_HL_MOD_REQUIRED_FUNC;
  private static final SubLSymbol $sym52$HL_MOD_COMPLETENESS;
  private static final SubLSymbol $sym53$_CSETF_HL_MOD_COMPLETENESS;
  private static final SubLSymbol $kw54$NAME;
  private static final SubLSymbol $kw55$PLIST;
  private static final SubLSymbol $kw56$SENSE;
  private static final SubLSymbol $kw57$PREDICATE;
  private static final SubLSymbol $kw58$ANY_PREDICATES;
  private static final SubLSymbol $kw59$ARITY;
  private static final SubLSymbol $kw60$DIRECTION;
  private static final SubLSymbol $kw61$REQUIRED_PATTERN;
  private static final SubLSymbol $kw62$REQUIRED_MT;
  private static final SubLSymbol $kw63$EXCLUSIVE_FUNC;
  private static final SubLSymbol $kw64$REQUIRED_FUNC;
  private static final SubLSymbol $kw65$COMPLETENESS;
  private static final SubLString $str66$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw67$BEGIN;
  private static final SubLSymbol $sym68$MAKE_HL_MODULE;
  private static final SubLSymbol $kw69$SLOT;
  private static final SubLSymbol $kw70$END;
  private static final SubLSymbol $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD;
  private static final SubLString $str72$_HL_Module___a_;
  private static final SubLSymbol $sym73$SXHASH_HL_MODULE_METHOD;
  private static final SubLSymbol $sym74$PROPERTY_LIST_P;
  private static final SubLSymbol $sym75$HL_MODULE_PROPERTY_P;
  private static final SubLSymbol $kw76$EXCLUSIVE;
  private static final SubLSymbol $kw77$SUPPLANTS;
  private static final SubLString $str78$_supplants_is_meaningless_without;
  private static final SubLSymbol $sym79$CFASL_CREATE_INVALID_HL_MODULE;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_;
  private static final SubLSymbol $kw82$FREE;
  private static final SubLSymbol $kw83$DEFAULT;
  private static final SubLSymbol $sym84$_HL_MODULE_STORE_;
  private static final SubLInteger $int85$212;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLSymbol $kw88$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw89$DONE;
  private static final SubLSymbol $sym90$NAME_VAR;
  private static final SubLSymbol $sym91$DO_HASH_TABLE;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$IGNORE;
  private static final SubLSymbol $sym94$HL_MODULE_STORE;
  private static final SubLSymbol $sym95$DO_HL_MODULES;
  private static final SubLSymbol $kw96$ABDUCTION;
  private static final SubLSymbol $kw97$UNIVERSAL;
  private static final SubLSymbol $kw98$MODULE_SOURCE;
  private static final SubLSymbol $kw99$ANYTHING;
  private static final SubLSymbol $kw100$REQUIRED;
  private static final SubLSymbol $kw101$COST_PATTERN;
  private static final SubLSymbol $kw102$COST_EXPRESSION;
  private static final SubLSymbol $kw103$COST;
  private static final SubLSymbol $kw104$CHECK;
  private static final SubLSymbol $kw105$UNKNOWN;
  private static final SubLSymbol $kw106$NOT_FULLY_BOUND;
  private static final SubLString $str107$check;
  private static final SubLSymbol $kw108$RULE_SELECT;
  private static final SubLSymbol $kw109$RULE_FILTER;
  private static final SubLSymbol $kw110$EXPAND;
  private static final SubLSymbol $kw111$REMOVAL;
  private static final SubLSymbol $sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
  private static final SubLSymbol $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
  private static final SubLSymbol $sym114$DEFAULT_EXPAND_FUNC;
  private static final SubLSymbol $kw115$EXPAND_PATTERN;
  private static final SubLSymbol $kw116$EXPAND_ITERATIVE_PATTERN;
  private static final SubLSymbol $sym117$PATTERN_MATCHES_FORMULA;
  private static final SubLSymbol $kw118$FORWARD;
  private static final SubLSymbol $kw119$INPUT_EXTRACT_PATTERN;
  private static final SubLSymbol $kw120$INPUT_VERIFY_PATTERN;
  private static final SubLSymbol $kw121$INPUT_ENCODE_PATTERN;
  private static final SubLSymbol $kw122$OUTPUT_CHECK_PATTERN;
  private static final SubLSymbol $kw123$OUTPUT_GENERATE_PATTERN;
  private static final SubLSymbol $kw124$OUTPUT_DECODE_PATTERN;
  private static final SubLSymbol $kw125$OUTPUT_VERIFY_PATTERN;
  private static final SubLSymbol $kw126$OUTPUT_CONSTRUCT_PATTERN;
  private static final SubLSymbol $kw127$SUPPORT_PATTERN;
  private static final SubLSymbol $kw128$SUPPORT;
  private static final SubLSymbol $kw129$SUPPORT_MODULE;
  private static final SubLSymbol $kw130$SUPPORT_MT;
  private static final SubLSymbol $kw131$SUPPORT_STRENGTH;
  private static final SubLSymbol $kw132$EVERY_PREDICATES;
  private static final SubLSymbol $kw133$APPLICABILITY;
  private static final SubLSymbol $kw134$APPLICABILITY_PATTERN;
  private static final SubLSymbol $kw135$DOCUMENTATION;
  private static final SubLSymbol $kw136$EXAMPLE;
  private static final SubLSymbol $kw137$COMPLETE;
  private static final SubLSymbol $kw138$INCOMPLETE;
  private static final SubLSymbol $kw139$COMPLETE_PATTERN;
  private static final SubLSymbol $kw140$COMPLETENESS_PATTERN;
  private static final SubLSymbol $kw141$EXTERNAL;
  private static final SubLSymbol $sym142$FUNCTION_SYMBOL_P;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$STRING_LESSP;
  private static final SubLSymbol $sym145$SYMBOL_NAME;
  private static final SubLSymbol $sym146$_REMOVAL_MODULES_;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$DO_SET;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$REMOVAL_MODULES;
  private static final SubLSymbol $sym151$DO_REMOVAL_MODULES;
  private static final SubLSymbol $sym152$_REMOVAL_MODULES_EXTERNAL_;
  private static final SubLSymbol $sym153$_REMOVAL_MODULES_GENERIC_;
  private static final SubLSymbol $sym154$HL_MODULE_SENSE;
  private static final SubLSymbol $sym155$_REMOVAL_MODULES_UNIVERSAL_;
  private static final SubLSymbol $sym156$_REMOVAL_MODULES_SPECIFIC_;
  private static final SubLInteger $int157$32;
  private static final SubLSymbol $sym158$FORT_P;
  private static final SubLSymbol $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_;
  private static final SubLSymbol $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_;
  private static final SubLSymbol $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_;
  private static final SubLSymbol $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_;
  private static final SubLInteger $int163$50;
  private static final SubLSymbol $kw164$POS;
  private static final SubLSymbol $kw165$NEG;
  private static final SubLString $str166$removal_module__S_must_have_a__SE;
  private static final SubLSymbol $sym167$CAR;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION;
  private static final SubLSymbol $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_;
  private static final SubLList $list171;
  private static final SubLSymbol $kw172$PRUNING;
  private static final SubLSymbol $sym173$_CONJUNCTIVE_REMOVAL_MODULES_;
  private static final SubLList $list174;
  private static final SubLList $list175;
  private static final SubLSymbol $sym176$REMOVAL_MODULES_CONJUNCTIVE;
  private static final SubLSymbol $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES;
  private static final SubLSymbol $kw178$REMOVAL_CONJUNCTIVE;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$META_REMOVAL_MODULES;
  private static final SubLSymbol $sym181$DO_META_REMOVAL_MODULES;
  private static final SubLSymbol $kw182$META_REMOVAL;
  private static final SubLSymbol $sym183$_TRANSFORMATION_MODULES_;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$TRANSFORMATION_MODULES;
  private static final SubLSymbol $sym186$DO_TRANSFORMATION_MODULES;
  private static final SubLSymbol $kw187$TRANSFORMATION;
  private static final SubLSymbol $sym188$_META_TRANSFORMATION_MODULES_;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$META_TRANSFORMATION_MODULES;
  private static final SubLSymbol $sym191$DO_META_TRANSFORMATION_MODULES;
  private static final SubLSymbol $kw192$META_TRANSFORMATION;
  private static final SubLSymbol $sym193$_REWRITE_MODULES_;
  private static final SubLList $list194;
  private static final SubLSymbol $kw195$REWRITE_SUPPORT;
  private static final SubLSymbol $kw196$REWRITE_CLOSURE;
  private static final SubLSymbol $kw197$REWRITE;
  private static final SubLString $str198$rewrite_module__S_must_have_a__SE;
  private static final SubLSymbol $sym199$_STRUCTURAL_MODULES_;
  private static final SubLSymbol $kw200$STRUCTURAL;
  private static final SubLSymbol $sym201$_META_STRUCTURAL_MODULES_;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$META_STRUCTURAL_MODULES;
  private static final SubLSymbol $sym204$DO_META_STRUCTURAL_MODULES;
  private static final SubLSymbol $kw205$META_STRUCTURAL;
  private static final SubLInteger $int206$256;
  private static final SubLSymbol $sym207$CFASL_INPUT_HL_MODULE;
  private static final SubLSymbol $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3019L)
  public static SubLObject hl_module_property_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && NIL != subl_promotions.memberP( v_object, $hl_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3146L)
  public static SubLObject do_hl_module_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject property_var = NIL;
    SubLObject value_var = NIL;
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    property_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    value_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    hl_module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module_var = $sym3$MODULE_VAR;
      return ConsesLow.list( $sym4$CLET, ConsesLow.list( ConsesLow.list( module_var, hl_module ) ), ConsesLow.list( $sym5$DO_LIST, reader.bq_cons( property_var, $list6 ), ConsesLow.list( $sym7$PWHEN, ConsesLow.list(
          $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var ), ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( value_var, ConsesLow.list( $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var,
              property_var ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3543L)
  public static SubLObject hl_module_properties()
  {
    return $hl_module_properties$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3618L)
  public static SubLObject removal_module_plist_indicators()
  {
    return hl_module_properties();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3908L)
  public static SubLObject hl_module_subtype_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $valid_hl_module_subtypes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 5520L)
  public static SubLObject allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw15$ALL == v_object || NIL != disjunctive_allowed_modules_spec_p( v_object ) || NIL != conjunctive_allowed_modules_spec_p( v_object ) || NIL != negated_allowed_modules_spec_p( v_object )
        || NIL != hl_module_type_spec_p( v_object ) || NIL != hl_module_subtype_spec_p( v_object ) || NIL != property_allowed_modules_spec_p( v_object ) || NIL != find_hl_module_by_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 6872L)
  public static SubLObject non_universal_allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw15$ALL != v_object && NIL != allowed_modules_spec_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7061L)
  public static SubLObject disjunctive_allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw16$OR == v_object.first() && NIL != list_utilities.list_of_type_p( $sym17$ALLOWED_MODULES_SPEC_P, v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7244L)
  public static SubLObject conjunctive_allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw18$AND == v_object.first() && NIL != list_utilities.list_of_type_p( $sym17$ALLOWED_MODULES_SPEC_P, v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7428L)
  public static SubLObject negated_allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw19$NOT == v_object.first() && NIL != list_utilities.list_of_type_p( $sym17$ALLOWED_MODULES_SPEC_P, v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7608L)
  public static SubLObject hl_module_type_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && $kw20$MODULE_TYPE == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7731L)
  public static SubLObject hl_module_subtype_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && $kw13$MODULE_SUBTYPE == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7860L)
  public static SubLObject property_allowed_modules_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && NIL != hl_module_property_p( v_object.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7998L)
  public static SubLObject hl_module_allowedP(final SubLObject hl_module, final SubLObject allowed_modules_spec)
  {
    assert NIL != hl_module_p( hl_module ) : hl_module;
    assert NIL != allowed_modules_spec_p( allowed_modules_spec ) : allowed_modules_spec;
    return hl_module_allowed_by_allowed_modules_specP( hl_module, allowed_modules_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 8872L)
  public static SubLObject hl_module_allowed_by_allowed_modules_specP(final SubLObject hl_module, final SubLObject allowed_modules_spec)
  {
    if( $kw15$ALL == allowed_modules_spec )
    {
      return T;
    }
    if( NIL != disjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != hl_module_allowed_by_allowed_modules_specP( hl_module, allowed_modules_subspec ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return NIL;
    }
    if( NIL != conjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == hl_module_allowed_by_allowed_modules_specP( hl_module, allowed_modules_subspec ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return T;
    }
    if( NIL != negated_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      return makeBoolean( NIL == hl_module_allowed_by_allowed_modules_specP( hl_module, conses_high.second( allowed_modules_spec ) ) );
    }
    if( NIL != hl_module_type_spec_p( allowed_modules_spec ) )
    {
      return Equality.eql( conses_high.second( allowed_modules_spec ), hl_module_type( hl_module ) );
    }
    if( NIL != hl_module_subtype_spec_p( allowed_modules_spec ) )
    {
      return subl_promotions.memberP( conses_high.second( allowed_modules_spec ), hl_module_subtypes( hl_module ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != property_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      final SubLObject property = allowed_modules_spec.first();
      final SubLObject allowed_value = conses_high.second( allowed_modules_spec );
      final SubLObject actual_value = hl_module_property_without_values( hl_module, property );
      return Equality.equal( allowed_value, actual_value );
    }
    return Equality.eql( hl_module, find_hl_module_by_name( allowed_modules_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 10326L)
  public static SubLObject simple_allowed_modules_spec_p(final SubLObject allowed_modules_spec)
  {
    if( NIL != find_hl_module_by_name( allowed_modules_spec ) )
    {
      return T;
    }
    if( NIL != disjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == simple_allowed_modules_spec_p( allowed_modules_subspec ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return T;
    }
    if( NIL != conjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == simple_allowed_modules_spec_p( allowed_modules_subspec ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return T;
    }
    if( $kw15$ALL == allowed_modules_spec || NIL != negated_allowed_modules_spec_p( allowed_modules_spec ) || NIL != hl_module_type_spec_p( allowed_modules_spec ) || NIL != hl_module_subtype_spec_p(
        allowed_modules_spec ) || NIL != property_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 11232L)
  public static SubLObject get_modules_from_simple_allowed_modules_spec(final SubLObject allowed_modules_spec)
  {
    if( NIL != disjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject module_specs = NIL;
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        module_specs = ConsesLow.append( module_specs, get_modules_from_simple_allowed_modules_spec( allowed_modules_subspec ) );
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return module_specs;
    }
    if( NIL != conjunctive_allowed_modules_spec_p( allowed_modules_spec ) )
    {
      SubLObject module_specs = NIL;
      SubLObject cdolist_list_var = allowed_modules_spec.rest();
      SubLObject allowed_modules_subspec = NIL;
      allowed_modules_subspec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        module_specs = ConsesLow.append( module_specs, get_modules_from_simple_allowed_modules_spec( allowed_modules_subspec ) );
        cdolist_list_var = cdolist_list_var.rest();
        allowed_modules_subspec = cdolist_list_var.first();
      }
      return module_specs;
    }
    return ConsesLow.list( find_hl_module_by_name( allowed_modules_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_hl_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $hl_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_name(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_plist(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_sense(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_predicate(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_any_predicates(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_arity(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_direction(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_required_pattern(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_required_mt(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_exclusive_func(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_required_func(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject hl_mod_completeness(final SubLObject v_object)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_sense(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_any_predicates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_arity(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_required_pattern(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_required_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_exclusive_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_required_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject _csetf_hl_mod_completeness(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hl_module_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject make_hl_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $hl_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw54$NAME ) )
      {
        _csetf_hl_mod_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$PLIST ) )
      {
        _csetf_hl_mod_plist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$SENSE ) )
      {
        _csetf_hl_mod_sense( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$PREDICATE ) )
      {
        _csetf_hl_mod_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$ANY_PREDICATES ) )
      {
        _csetf_hl_mod_any_predicates( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$ARITY ) )
      {
        _csetf_hl_mod_arity( v_new, current_value );
      }
      else if( pcase_var.eql( $kw60$DIRECTION ) )
      {
        _csetf_hl_mod_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw61$REQUIRED_PATTERN ) )
      {
        _csetf_hl_mod_required_pattern( v_new, current_value );
      }
      else if( pcase_var.eql( $kw62$REQUIRED_MT ) )
      {
        _csetf_hl_mod_required_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw63$EXCLUSIVE_FUNC ) )
      {
        _csetf_hl_mod_exclusive_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw64$REQUIRED_FUNC ) )
      {
        _csetf_hl_mod_required_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw65$COMPLETENESS ) )
      {
        _csetf_hl_mod_completeness( v_new, current_value );
      }
      else
      {
        Errors.error( $str66$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject visit_defstruct_hl_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw67$BEGIN, $sym68$MAKE_HL_MODULE, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw54$NAME, hl_mod_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw55$PLIST, hl_mod_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw56$SENSE, hl_mod_sense( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw57$PREDICATE, hl_mod_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw58$ANY_PREDICATES, hl_mod_any_predicates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw59$ARITY, hl_mod_arity( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw60$DIRECTION, hl_mod_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw61$REQUIRED_PATTERN, hl_mod_required_pattern( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw62$REQUIRED_MT, hl_mod_required_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw63$EXCLUSIVE_FUNC, hl_mod_exclusive_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw64$REQUIRED_FUNC, hl_mod_required_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw69$SLOT, $kw65$COMPLETENESS, hl_mod_completeness( obj ) );
    Functions.funcall( visitor_fn, obj, $kw70$END, $sym68$MAKE_HL_MODULE, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
  public static SubLObject visit_defstruct_object_hl_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_hl_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12898L)
  public static SubLObject print_hl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = hl_module_name( v_object );
    PrintLow.format( stream, $str72$_HL_Module___a_, name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13068L)
  public static SubLObject sxhash_hl_module_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( hl_mod_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13151L)
  public static SubLObject check_hl_module_property_list(final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.property_list_p( plist ) : plist;
    SubLObject exclusive_specifiedP = NIL;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    SubLObject pcase_var;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != hl_module_property_p( property ) : property;
      pcase_var = property;
      if( pcase_var.eql( $kw76$EXCLUSIVE ) )
      {
        exclusive_specifiedP = T;
      }
    }
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      pcase_var = property;
      if( pcase_var.eql( $kw77$SUPPLANTS ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == exclusive_specifiedP )
      {
        Errors.error( $str78$_supplants_is_meaningless_without, plist );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13871L)
  public static SubLObject new_hl_module(final SubLObject name, SubLObject plist)
  {
    check_hl_module_property_list( plist );
    final SubLObject hl_module = allocate_hl_module( name );
    plist = canonicalize_hl_module_plist( plist );
    _csetf_hl_mod_plist( hl_module, plist );
    add_hl_module( hl_module );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
  public static SubLObject clear_cfasl_create_invalid_hl_module()
  {
    final SubLObject cs = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
  public static SubLObject remove_cfasl_create_invalid_hl_module(final SubLObject name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue(), ConsesLow.list( name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
  public static SubLObject cfasl_create_invalid_hl_module_internal(final SubLObject name)
  {
    return new_hl_module( name, $list80 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
  public static SubLObject cfasl_create_invalid_hl_module(final SubLObject name)
  {
    SubLObject caching_state = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym79$CFASL_CREATE_INVALID_HL_MODULE, $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cfasl_create_invalid_hl_module_internal( name ) ) );
      memoization_state.caching_state_put( caching_state, name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14487L)
  public static SubLObject canonicalize_hl_module_plist(SubLObject plist)
  {
    final SubLObject module_subtypes = conses_high.getf( plist, $kw13$MODULE_SUBTYPE, UNPROVIDED );
    if( !module_subtypes.isList() )
    {
      plist = conses_high.putf( conses_high.copy_list( plist ), $kw13$MODULE_SUBTYPE, ConsesLow.list( module_subtypes ) );
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14844L)
  public static SubLObject allocate_hl_module(final SubLObject name)
  {
    SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      remove_hl_module( hl_module );
    }
    else
    {
      hl_module = make_hl_module( UNPROVIDED );
      _csetf_hl_mod_name( hl_module, name );
    }
    _csetf_hl_mod_plist( hl_module, NIL );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15143L)
  public static SubLObject destroy_hl_module(final SubLObject hl_module)
  {
    remove_hl_module( hl_module );
    _csetf_hl_mod_plist( hl_module, $kw82$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15291L)
  public static SubLObject hl_module_name(final SubLObject hl_module)
  {
    assert NIL != hl_module_p( hl_module ) : hl_module;
    return hl_mod_name( hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15486L)
  public static SubLObject hl_module_plist(final SubLObject hl_module)
  {
    return hl_mod_plist( hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15603L)
  public static SubLObject hl_module_property(final SubLObject hl_module, final SubLObject property)
  {
    final SubLObject plist = hl_module_plist( hl_module );
    final SubLObject value = conses_high.getf( plist, property, $kw83$DEFAULT );
    if( value == $kw83$DEFAULT )
    {
      final SubLObject v_default = dictionary.dictionary_lookup_without_values( $hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED );
      return subl_promotions.values2( v_default, T );
    }
    return subl_promotions.values2( value, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16228L)
  public static SubLObject hl_module_property_without_values(final SubLObject hl_module, final SubLObject property)
  {
    final SubLObject plist = hl_module_plist( hl_module );
    SubLObject value = conses_high.getf( plist, property, $kw83$DEFAULT );
    if( value == $kw83$DEFAULT )
    {
      value = dictionary.dictionary_lookup_without_values( $hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16827L)
  public static SubLObject hl_module_property_not_defaultP(final SubLObject hl_module, final SubLObject property)
  {
    final SubLObject value = hl_module_property_without_values( hl_module, property );
    final SubLObject v_default = dictionary.dictionary_lookup_without_values( $hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED );
    return makeBoolean( !value.equal( v_default ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17736L)
  public static SubLObject do_hl_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    hl_module_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list86 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list86 );
      if( NIL == conses_high.member( current_$1, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject name_var = $sym90$NAME_VAR;
    return ConsesLow.listS( $sym91$DO_HASH_TABLE, ConsesLow.list( name_var, hl_module_var, $list92, $kw89$DONE, done ), ConsesLow.list( $sym93$IGNORE, name_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17971L)
  public static SubLObject hl_module_store()
  {
    return $hl_module_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18064L)
  public static SubLObject find_hl_module_by_name(final SubLObject name)
  {
    final SubLObject hl_module = Hashtables.gethash_without_values( name, $hl_module_store$.getGlobalValue(), UNPROVIDED );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18216L)
  public static SubLObject add_hl_module(final SubLObject hl_module)
  {
    final SubLObject name = hl_module_name( hl_module );
    Hashtables.sethash( name, $hl_module_store$.getGlobalValue(), hl_module );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18422L)
  public static SubLObject remove_hl_module(final SubLObject hl_module)
  {
    final SubLObject name = hl_module_name( hl_module );
    Hashtables.remhash( name, $hl_module_store$.getGlobalValue() );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18609L)
  public static SubLObject setup_module(final SubLObject name, final SubLObject type, final SubLObject plist)
  {
    SubLObject new_plist = conses_high.copy_list( plist );
    new_plist = conses_high.putf( plist, $kw20$MODULE_TYPE, type );
    final SubLObject hl_module = new_hl_module( name, new_plist );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18890L)
  public static SubLObject default_cost_func(SubLObject v_object)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = NIL;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18975L)
  public static SubLObject default_expand_func(SubLObject arg1, SubLObject arg2)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19068L)
  public static SubLObject hl_module_type(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw20$MODULE_TYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19193L)
  public static SubLObject hl_module_subtypes(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw13$MODULE_SUBTYPE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19311L)
  public static SubLObject abductive_hl_moduleP(final SubLObject hl_module)
  {
    return list_utilities.member_eqP( $kw96$ABDUCTION, hl_module_subtypes( hl_module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19427L)
  public static SubLObject hl_module_universal(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw97$UNIVERSAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19544L)
  public static SubLObject hl_module_source(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw98$MODULE_SOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19702L)
  public static SubLObject hl_module_sense(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw56$SENSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19808L)
  public static SubLObject hl_module_sense_relevant_p(final SubLObject hl_module, final SubLObject sense)
  {
    final SubLObject module_sense = hl_module_sense( hl_module );
    return makeBoolean( NIL == module_sense || module_sense.eql( sense ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19992L)
  public static SubLObject hl_module_required_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw61$REQUIRED_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20120L)
  public static SubLObject hl_module_required_pattern_matched_p(final SubLObject hl_module, final SubLObject asent)
  {
    final SubLObject pattern = hl_module_required_pattern( hl_module );
    return makeBoolean( $kw99$ANYTHING == pattern || NIL != formula_pattern_match.pattern_matches_formula_without_bindings( pattern, asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20355L)
  public static SubLObject hl_module_required_mt(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw62$REQUIRED_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20473L)
  public static SubLObject hl_module_required_mt_result(final SubLObject hl_module)
  {
    final SubLObject required_mt_prop = hl_module_required_mt( hl_module );
    if( NIL != required_mt_prop )
    {
      return interpret_hl_module_mt_prop( required_mt_prop );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20761L)
  public static SubLObject interpret_hl_module_mt_prop(final SubLObject mt_prop)
  {
    if( NIL != hlmt.hlmt_p( mt_prop ) )
    {
      return mt_prop;
    }
    if( mt_prop.isSymbol() && NIL != Symbols.boundp( mt_prop ) )
    {
      return Symbols.symbol_value( mt_prop );
    }
    return eval_in_api.possibly_cyc_api_eval( mt_prop );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20990L)
  public static SubLObject hl_module_required_mt_relevantP(final SubLObject hl_module)
  {
    final SubLObject required_mt = hl_module_required_mt_result( hl_module );
    return makeBoolean( NIL == required_mt || NIL != mt_relevance_macros.relevant_mtP( required_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21186L)
  public static SubLObject hl_module_required_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw100$REQUIRED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21303L)
  public static SubLObject hl_module_required_func_p(final SubLObject hl_module, final SubLObject asent)
  {
    final SubLObject required_func = hl_module_required_func( hl_module );
    return makeBoolean( NIL == required_func || NIL != Functions.funcall( required_func, asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21501L)
  public static SubLObject hl_module_cost_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw101$COST_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21621L)
  public static SubLObject hl_module_cost_expression(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw102$COST_EXPRESSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21747L)
  public static SubLObject hl_module_cost_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw103$COST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21856L)
  public static SubLObject hl_module_cost(final SubLObject hl_module, final SubLObject v_object, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject cost = hl_module_cost_pattern_result( hl_module, v_object );
    if( !cost.isNumber() )
    {
      cost = hl_module_cost_expression_result( hl_module );
      if( !cost.isNumber() )
      {
        cost = hl_module_cost_function_result( hl_module, v_object );
      }
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22349L)
  public static SubLObject hl_module_asent_cost(final SubLObject hl_module, final SubLObject asent)
  {
    return hl_module_cost( hl_module, asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22467L)
  public static SubLObject hl_module_clause_cost(final SubLObject hl_module, final SubLObject contextualized_dnf_clause)
  {
    return hl_module_cost( hl_module, contextualized_dnf_clause, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22626L)
  public static SubLObject hl_module_cost_pattern_result(final SubLObject hl_module, final SubLObject formula)
  {
    final SubLObject cost_pattern = hl_module_cost_pattern( hl_module );
    if( NIL != cost_pattern )
    {
      return formula_pattern_match.pattern_transform_formula( cost_pattern, formula, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22996L)
  public static SubLObject hl_module_cost_expression_result(final SubLObject hl_module)
  {
    final SubLObject cost_expression = hl_module_cost_expression( hl_module );
    if( NIL == cost_expression )
    {
      return NIL;
    }
    if( cost_expression.isNumber() )
    {
      return cost_expression;
    }
    if( cost_expression.isSymbol() && NIL != Symbols.boundp( cost_expression ) )
    {
      return Symbols.symbol_value( cost_expression );
    }
    return eval_in_api.possibly_cyc_api_eval( cost_expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23600L)
  public static SubLObject hl_module_cost_function_result(final SubLObject hl_module, final SubLObject v_object)
  {
    final SubLObject cost_func = hl_module_cost_func( hl_module );
    if( NIL != eval_in_api.possibly_cyc_api_function_spec_p( cost_func ) )
    {
      final SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1( cost_func, v_object );
      return cost;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23997L)
  public static SubLObject hl_module_asent_cost_function_result(final SubLObject hl_module, final SubLObject asent)
  {
    return hl_module_cost_function_result( hl_module, asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24266L)
  public static SubLObject hl_module_clause_cost_function_result(final SubLObject hl_module, final SubLObject contextualized_dnf_clause)
  {
    return hl_module_cost_function_result( hl_module, contextualized_dnf_clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24597L)
  public static SubLObject hl_module_is_checkP(final SubLObject hl_module)
  {
    final SubLObject check = hl_module_property_without_values( hl_module, $kw104$CHECK );
    if( check == $kw105$UNKNOWN )
    {
      return guess_hl_module_is_checkP( hl_module );
    }
    return list_utilities.sublisp_boolean( check );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24977L)
  public static SubLObject guess_hl_module_is_checkP(final SubLObject hl_module)
  {
    final SubLObject required_pattern = hl_module_required_pattern( hl_module );
    if( NIL != cycl_utilities.expression_find( $kw106$NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject name = string_utilities.str( hl_module_name( hl_module ) );
    final SubLObject checkP = string_utilities.substringP( $str107$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return checkP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25354L)
  public static SubLObject hl_module_rule_select_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw108$RULE_SELECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25477L)
  public static SubLObject hl_module_rule_filter_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw109$RULE_FILTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25600L)
  public static SubLObject hl_module_expand_func(final SubLObject hl_module)
  {
    inference_analysis.cinc_module_expand_count( hl_module );
    final SubLObject expand = hl_module_property_without_values( hl_module, $kw110$EXPAND );
    if( $kw83$DEFAULT == expand )
    {
      return default_expand_func_for_hl_module( hl_module );
    }
    return expand;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25864L)
  public static SubLObject default_expand_func_for_hl_module(final SubLObject hl_module)
  {
    if( $kw111$REMOVAL != hl_module_type( hl_module ) )
    {
      return $sym114$DEFAULT_EXPAND_FUNC;
    }
    if( NIL != hl_module_is_checkP( hl_module ) )
    {
      return $sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
    }
    return $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26142L)
  public static SubLObject hl_module_expand_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw115$EXPAND_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26266L)
  public static SubLObject hl_module_expand_iterative_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw116$EXPAND_ITERATIVE_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26410L)
  public static SubLObject hl_module_predicate(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw57$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26524L)
  public static SubLObject hl_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate)
  {
    final SubLObject hl_module_predicate = hl_module_predicate( hl_module );
    if( NIL != hl_module_predicate )
    {
      return Equality.eql( hl_module_predicate, predicate );
    }
    final SubLObject hl_module_any_preds = hl_module_any_predicates( hl_module );
    if( NIL != hl_module_any_preds )
    {
      return subl_promotions.memberP( predicate, hl_module_any_preds, $sym117$PATTERN_MATCHES_FORMULA, UNPROVIDED );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26928L)
  public static SubLObject hl_module_arity(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw59$ARITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27034L)
  public static SubLObject hl_module_arity_relevant_p(final SubLObject hl_module, final SubLObject asent)
  {
    final SubLObject hl_module_arity = hl_module_arity( hl_module );
    return makeBoolean( NIL == hl_module_arity || ( NIL != el_utilities.el_formula_without_sequence_termP( asent ) && hl_module_arity.numE( Sequences.length( asent.rest() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27357L)
  public static SubLObject hl_module_exclusive_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw76$EXCLUSIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28186L)
  public static SubLObject hl_module_supplants_info(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw77$SUPPLANTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28305L)
  public static SubLObject hl_module_direction(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw60$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28420L)
  public static SubLObject hl_module_direction_relevantP(final SubLObject hl_module)
  {
    if( NIL == kb_control_vars.within_forward_inferenceP() )
    {
      return T;
    }
    final SubLObject direction = hl_module_direction( hl_module );
    return Equality.eq( direction, $kw118$FORWARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28935L)
  public static SubLObject hl_module_input_extract_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw119$INPUT_EXTRACT_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29074L)
  public static SubLObject hl_module_input_verify_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw120$INPUT_VERIFY_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29210L)
  public static SubLObject hl_module_input_encode_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw121$INPUT_ENCODE_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29346L)
  public static SubLObject hl_module_output_check_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw122$OUTPUT_CHECK_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29482L)
  public static SubLObject hl_module_output_generate_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw123$OUTPUT_GENERATE_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29626L)
  public static SubLObject hl_module_output_decode_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw124$OUTPUT_DECODE_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29766L)
  public static SubLObject hl_module_output_verify_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw125$OUTPUT_VERIFY_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29904L)
  public static SubLObject hl_module_output_construct_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw126$OUTPUT_CONSTRUCT_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30048L)
  public static SubLObject hl_module_support_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw127$SUPPORT_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30174L)
  public static SubLObject hl_module_support_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw128$SUPPORT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30289L)
  public static SubLObject hl_module_support_module(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw129$SUPPORT_MODULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30413L)
  public static SubLObject hl_module_support_mt(final SubLObject hl_module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject support_mt = hl_module_property( hl_module, $kw130$SUPPORT_MT );
    final SubLObject default_inferredP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != default_inferredP )
    {
      support_mt = mt_relevance_macros.current_mt_relevance_mt();
    }
    return support_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30670L)
  public static SubLObject hl_module_support_mt_result(final SubLObject hl_module)
  {
    final SubLObject support_mt_prop = hl_module_support_mt( hl_module );
    return interpret_hl_module_mt_prop( support_mt_prop );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30845L)
  public static SubLObject hl_module_support_strength(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw131$SUPPORT_STRENGTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30973L)
  public static SubLObject hl_module_every_predicates(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw132$EVERY_PREDICATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31101L)
  public static SubLObject hl_module_applicability_func(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw133$APPLICABILITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31228L)
  public static SubLObject hl_module_applicability_pattern(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw134$APPLICABILITY_PATTERN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31366L)
  public static SubLObject hl_module_any_predicates(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw58$ANY_PREDICATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31490L)
  public static SubLObject hl_module_documentation_string(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw135$DOCUMENTATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31619L)
  public static SubLObject hl_module_example_string(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw136$EXAMPLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31736L)
  public static SubLObject hl_module_completeP(final SubLObject hl_module, final SubLObject asent)
  {
    return Equality.eq( $kw137$COMPLETE, hl_module_completeness( hl_module, asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31856L)
  public static SubLObject hl_module_incompleteP(final SubLObject hl_module, final SubLObject asent)
  {
    return Equality.eq( $kw138$INCOMPLETE, hl_module_completeness( hl_module, asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 32122L)
  public static SubLObject hl_module_completeness(final SubLObject hl_module, final SubLObject asent, SubLObject default_completeness)
  {
    if( default_completeness == UNPROVIDED )
    {
      default_completeness = $kw138$INCOMPLETE;
    }
    final SubLObject completeness = hl_module_property_without_values( hl_module, $kw65$COMPLETENESS );
    if( NIL != completeness )
    {
      return completeness;
    }
    SubLObject pattern = hl_module_property_without_values( hl_module, $kw139$COMPLETE_PATTERN );
    if( NIL != pattern && NIL != formula_pattern_match.pattern_matches_formula_without_bindings( pattern, asent ) )
    {
      return $kw137$COMPLETE;
    }
    pattern = hl_module_property_without_values( hl_module, $kw140$COMPLETENESS_PATTERN );
    if( NIL != pattern )
    {
      final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula( pattern, asent, UNPROVIDED );
      if( NIL != completeness2 )
      {
        return completeness2;
      }
    }
    return default_completeness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 33747L)
  public static SubLObject hl_module_clause_completeness(final SubLObject hl_module, final SubLObject clause)
  {
    final SubLObject completeness = hl_module_property_without_values( hl_module, $kw65$COMPLETENESS );
    if( NIL != completeness )
    {
      return completeness;
    }
    SubLObject pattern = hl_module_property_without_values( hl_module, $kw139$COMPLETE_PATTERN );
    if( NIL != pattern && NIL != formula_pattern_match.pattern_matches_formula_without_bindings( pattern, clause ) )
    {
      return $kw137$COMPLETE;
    }
    pattern = hl_module_property_without_values( hl_module, $kw140$COMPLETENESS_PATTERN );
    if( NIL != pattern )
    {
      final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula( pattern, clause, UNPROVIDED );
      if( NIL != completeness2 )
      {
        return completeness2;
      }
    }
    return $kw138$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35197L)
  public static SubLObject hl_module_externalP(final SubLObject hl_module)
  {
    return hl_module_property_without_values( hl_module, $kw141$EXTERNAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35310L)
  public static SubLObject hl_module_activeP(final SubLObject hl_module, SubLObject inactive_hl_modules)
  {
    if( inactive_hl_modules == UNPROVIDED )
    {
      inactive_hl_modules = NIL;
    }
    return makeBoolean( NIL == subl_promotions.memberP( hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35442L)
  public static SubLObject hl_module_implementation_methods(SubLObject hl_module)
  {
    if( hl_module.isSymbol() )
    {
      hl_module = find_hl_module_by_name( hl_module );
    }
    assert NIL != hl_module_p( hl_module ) : hl_module;
    final SubLObject plist = hl_module_plist( hl_module );
    SubLObject all_methods = NIL;
    SubLObject remainder;
    SubLObject key;
    SubLObject value;
    SubLObject cdolist_list_var;
    SubLObject v_methods;
    SubLObject method;
    SubLObject item_var;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      key = remainder.first();
      value = conses_high.cadr( remainder );
      v_methods = ( cdolist_list_var = list_utilities.tree_gather( value, Symbols.symbol_function( $sym142$FUNCTION_SYMBOL_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      method = NIL;
      method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == list_utilities.member_eqP( method, $list143 ) )
        {
          item_var = method;
          if( NIL == conses_high.member( item_var, all_methods, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            all_methods = ConsesLow.cons( item_var, all_methods );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        method = cdolist_list_var.first();
      }
    }
    return Sort.sort( all_methods, Symbols.symbol_function( $sym144$STRING_LESSP ), Symbols.symbol_function( $sym145$SYMBOL_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36463L)
  public static SubLObject do_removal_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      if( NIL == conses_high.member( current_$2, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym148$DO_SET, ConsesLow.list( hl_module, $list149, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36607L)
  public static SubLObject removal_modules()
  {
    return $removal_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36705L)
  public static SubLObject removal_module_p(final SubLObject v_object)
  {
    return set.set_memberP( v_object, $removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36795L)
  public static SubLObject removal_module_count()
  {
    return set.set_size( $removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37005L)
  public static SubLObject some_external_removal_modulesP()
  {
    return list_utilities.sublisp_boolean( $removal_modules_external$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37101L)
  public static SubLObject removal_modules_external()
  {
    return $removal_modules_external$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37489L)
  public static SubLObject generic_removal_module_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != removal_module_p( v_object ) && NIL != subl_promotions.memberP( v_object, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37630L)
  public static SubLObject generic_removal_modules()
  {
    return conses_high.copy_list( $removal_modules_generic$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37792L)
  public static SubLObject generic_removal_modules_for_sense(final SubLObject sense)
  {
    return Sequences.remove( enumeration_types.inverse_sense( sense ), $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function( EQL ), $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37969L)
  public static SubLObject generic_removal_module_count()
  {
    return Sequences.length( $removal_modules_generic$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38263L)
  public static SubLObject universal_removal_modules()
  {
    return conses_high.copy_list( $removal_modules_universal$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38429L)
  public static SubLObject universal_removal_module_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != removal_module_p( v_object ) && NIL != subl_promotions.memberP( v_object, $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38580L)
  public static SubLObject universal_removal_module_count()
  {
    return Sequences.length( $removal_modules_universal$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38676L)
  public static SubLObject universal_removal_module_exception_predicates(final SubLObject universal_module)
  {
    return list_utilities.alist_lookup( $removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38974L)
  public static SubLObject universal_removal_module_exception_predicateP(final SubLObject universal_module, final SubLObject predicate)
  {
    return subl_promotions.memberP( predicate, universal_removal_module_exception_predicates( universal_module ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39160L)
  public static SubLObject predicate_doesnt_use_universal_removal_moduleP(final SubLObject predicate, final SubLObject universal_module)
  {
    if( NIL != forts.fort_p( predicate ) && NIL == universal_removal_module_exception_predicateP( universal_module, predicate ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39535L)
  public static SubLObject universal_removal_modules_for_sense(final SubLObject sense)
  {
    return Sequences.remove( enumeration_types.inverse_sense( sense ), $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function( EQL ), $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40007L)
  public static SubLObject removal_modules_specific(final SubLObject predicate)
  {
    assert NIL != forts.fort_p( predicate ) : predicate;
    return conses_high.copy_list( Hashtables.gethash_without_values( predicate, $removal_modules_specific$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40264L)
  public static SubLObject predicate_has_specific_removal_modulesP(final SubLObject predicate)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( predicate, $removal_modules_specific$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40417L)
  public static SubLObject removal_modules_specific_for_sense(final SubLObject predicate, final SubLObject sense)
  {
    assert NIL != forts.fort_p( predicate ) : predicate;
    return Sequences.remove( enumeration_types.inverse_sense( sense ), Hashtables.gethash_without_values( predicate, $removal_modules_specific$.getGlobalValue(), NIL ), Symbols.symbol_function( EQL ),
        $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40796L)
  public static SubLObject removal_modules_universal_for_predicate_and_sense(final SubLObject predicate, final SubLObject sense)
  {
    assert NIL != forts.fort_p( predicate ) : predicate;
    SubLObject universal_modules = NIL;
    SubLObject cdolist_list_var = universal_removal_modules_for_sense( sense );
    SubLObject universal_module = NIL;
    universal_module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == predicate_doesnt_use_universal_removal_moduleP( predicate, universal_module ) )
      {
        universal_modules = ConsesLow.cons( universal_module, universal_modules );
      }
      cdolist_list_var = cdolist_list_var.rest();
      universal_module = cdolist_list_var.first();
    }
    return Sequences.nreverse( universal_modules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41376L)
  public static SubLObject predicates_with_specific_removal_modules()
  {
    return hash_table_utilities.hash_table_keys( $removal_modules_specific$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41516L)
  public static SubLObject specific_removal_modules()
  {
    return set.set_element_list( specific_removal_module_set() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41644L)
  public static SubLObject specific_removal_module_count()
  {
    return set.set_size( specific_removal_module_set() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41743L)
  public static SubLObject specific_removal_module_set()
  {
    final SubLObject v_set = set.new_set( EQL, removal_module_count() );
    SubLObject pred = NIL;
    SubLObject hl_module_list = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $removal_modules_specific$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        pred = Hashtables.getEntryKey( cdohash_entry );
        SubLObject cdolist_list_var;
        hl_module_list = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == generic_removal_module_p( hl_module ) )
          {
            set.set_add( hl_module, v_set );
          }
          cdolist_list_var = cdolist_list_var.rest();
          hl_module = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42798L)
  public static SubLObject clear_solely_specific_removal_module_predicate_store()
  {
    set.clear_set( $solely_specific_removal_module_predicate_store$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42947L)
  public static SubLObject rebuild_solely_specific_removal_module_predicate_store()
  {
    return set.set_rebuild( $solely_specific_removal_module_predicate_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43096L)
  public static SubLObject register_solely_specific_removal_module_predicate(final SubLObject predicate)
  {
    return set.set_add( predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43384L)
  public static SubLObject deregister_solely_specific_removal_module_predicate(final SubLObject predicate)
  {
    return set.set_remove( predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43548L)
  public static SubLObject solely_specific_removal_module_predicateP(final SubLObject predicate)
  {
    return set.set_memberP( predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43703L)
  public static SubLObject inference_removal_module(final SubLObject name, final SubLObject plist)
  {
    final SubLObject strengthened_plist = strengthen_removal_module_properties( name, plist );
    final SubLObject hl_module = setup_module( name, $kw111$REMOVAL, strengthened_plist );
    set.set_add( hl_module, $removal_modules$.getGlobalValue() );
    classify_removal_module( hl_module );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44315L)
  public static SubLObject inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL == existing )
      {
        existing = ConsesLow.list( hl_module );
        $removal_modules_specific_use_generic$.setGlobalValue( ConsesLow.cons( existing, $removal_modules_specific_use_generic$.getGlobalValue() ) );
      }
      ConsesLow.rplacd( existing, conses_high.adjoin( predicate, existing.rest(), UNPROVIDED, UNPROVIDED ) );
      return inference_removal_module_note_specific( predicate, hl_module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44876L)
  public static SubLObject inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL == existing )
      {
        existing = ConsesLow.list( hl_module );
        $removal_modules_specific_use_meta_removal$.setGlobalValue( ConsesLow.cons( existing, $removal_modules_specific_use_meta_removal$.getGlobalValue() ) );
      }
      ConsesLow.rplacd( existing, conses_high.adjoin( predicate, existing.rest(), UNPROVIDED, UNPROVIDED ) );
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45398L)
  public static SubLObject inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL == existing )
      {
        existing = ConsesLow.list( hl_module );
        $removal_modules_specific_dont_use_universal$.setGlobalValue( ConsesLow.cons( existing, $removal_modules_specific_dont_use_universal$.getGlobalValue() ) );
      }
      ConsesLow.rplacd( existing, conses_high.adjoin( predicate, existing.rest(), UNPROVIDED, UNPROVIDED ) );
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45929L)
  public static SubLObject redeclare_inference_removal_module(final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      set.set_add( hl_module, $removal_modules$.getGlobalValue() );
      classify_removal_module( hl_module );
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46309L)
  public static SubLObject strengthen_removal_module_properties(final SubLObject name, SubLObject plist)
  {
    plist = conses_high.copy_tree( plist );
    final SubLObject pcase_var;
    final SubLObject sense = pcase_var = conses_high.getf( plist, $kw56$SENSE, UNPROVIDED );
    if( !pcase_var.eql( $kw164$POS ) )
    {
      if( !pcase_var.eql( $kw165$NEG ) )
      {
        Errors.error( $str166$removal_module__S_must_have_a__SE, name );
      }
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46681L)
  public static SubLObject undeclare_inference_removal_module(final SubLObject name, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      remove_hl_module( hl_module );
      set.set_remove( hl_module, $removal_modules$.getGlobalValue() );
      $removal_modules_generic$.setGlobalValue( Sequences.remove( hl_module, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      $removal_modules_universal$.setGlobalValue( Sequences.remove( hl_module, $removal_modules_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      $removal_modules_specific_use_generic$.setGlobalValue( Sequences.delete( hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym167$CAR ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      $removal_modules_specific_use_meta_removal$.setGlobalValue( Sequences.delete( hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function(
          $sym167$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      $removal_modules_specific_dont_use_universal$.setGlobalValue( Sequences.delete( hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function(
          $sym167$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != reclassifyP )
      {
        reclassify_removal_modules();
      }
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 47702L)
  public static SubLObject undeclare_inference_meta_removal_module(final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      remove_hl_module( hl_module );
      set.set_remove( hl_module, $meta_removal_modules$.getGlobalValue() );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48001L)
  public static SubLObject undeclare_inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = NIL;
    }
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      final SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL != existing )
      {
        ConsesLow.rplacd( existing, Sequences.delete( predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        if( NIL == existing.rest() )
        {
          $removal_modules_specific_use_generic$.setGlobalValue( Sequences.delete( existing, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
      }
      if( NIL != reclassifyP )
      {
        reclassify_removal_modules();
      }
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48650L)
  public static SubLObject undeclare_inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = NIL;
    }
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      final SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL != existing )
      {
        ConsesLow.rplacd( existing, Sequences.delete( predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        if( NIL == existing.rest() )
        {
          $removal_modules_specific_use_meta_removal$.setGlobalValue( Sequences.delete( existing, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) );
        }
      }
      if( NIL != reclassifyP )
      {
        reclassify_removal_modules();
      }
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49316L)
  public static SubLObject undeclare_inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = NIL;
    }
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module )
    {
      final SubLObject existing = conses_high.assoc( hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      if( NIL != existing )
      {
        ConsesLow.rplacd( existing, Sequences.delete( predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        if( NIL == existing.rest() )
        {
          $removal_modules_specific_dont_use_universal$.setGlobalValue( Sequences.delete( existing, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) );
        }
      }
      if( NIL != reclassifyP )
      {
        reclassify_removal_modules();
      }
      return hl_module;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49986L)
  public static SubLObject reclassify_removal_modules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_removal_modules();
    rebuild_solely_specific_removal_module_predicate_store();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = $removal_modules_specific_use_generic$.getGlobalValue();
        SubLObject generic_info = NIL;
        generic_info = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = generic_info;
          SubLObject hl_module = NIL;
          SubLObject predicates = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list168 );
          hl_module = current.first();
          current = current.rest();
          SubLObject cdolist_list_var_$3;
          predicates = ( cdolist_list_var_$3 = current );
          SubLObject predicate = NIL;
          predicate = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            inference_removal_module_note_specific( predicate, hl_module );
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            predicate = cdolist_list_var_$3.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          generic_info = cdolist_list_var.first();
        }
        final SubLObject set_var = removal_modules();
        final SubLObject set_contents_var = set.do_set_internal( set_var );
        SubLObject basis_object;
        SubLObject state_$4;
        SubLObject hl_module2;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state_$4 ); state_$4 = set_contents.do_set_contents_update_state( state_$4 ) )
        {
          hl_module2 = set_contents.do_set_contents_next( basis_object, state_$4 );
          if( NIL != set_contents.do_set_contents_element_validP( state_$4, hl_module2 ) )
          {
            classify_removal_module( hl_module2 );
          }
        }
        preference_modules.reclassify_preference_modules();
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50630L)
  public static SubLObject clear_removal_modules()
  {
    Hashtables.clrhash( $removal_modules_specific$.getGlobalValue() );
    $removal_modules_external$.setGlobalValue( NIL );
    $removal_modules_generic$.setGlobalValue( NIL );
    $removal_modules_universal$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 51047L)
  public static SubLObject classify_removal_module(final SubLObject hl_module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != hl_module_externalP( hl_module ) )
    {
      if( NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue( thread ) )
      {
        $removal_modules_external$.setGlobalValue( list_utilities.sort_adjoin( hl_module, $removal_modules_external$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY ) );
      }
      else if( NIL == conses_high.member( hl_module, $removal_modules_external$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $removal_modules_external$.setGlobalValue( ConsesLow.cons( hl_module, $removal_modules_external$.getGlobalValue() ) );
      }
    }
    else
    {
      final SubLObject predicate_spec = hl_module_predicate( hl_module );
      final SubLObject universalP = hl_module_universal( hl_module );
      if( NIL != universalP )
      {
        if( NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue( thread ) )
        {
          $removal_modules_universal$.setGlobalValue( list_utilities.sort_adjoin( hl_module, $removal_modules_universal$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY ) );
        }
        else if( NIL == conses_high.member( hl_module, $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $removal_modules_universal$.setGlobalValue( ConsesLow.cons( hl_module, $removal_modules_universal$.getGlobalValue() ) );
        }
      }
      else if( NIL == predicate_spec )
      {
        if( NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue( thread ) )
        {
          $removal_modules_generic$.setGlobalValue( list_utilities.sort_adjoin( hl_module, $removal_modules_generic$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY ) );
        }
        else if( NIL == conses_high.member( hl_module, $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $removal_modules_generic$.setGlobalValue( ConsesLow.cons( hl_module, $removal_modules_generic$.getGlobalValue() ) );
        }
      }
      else if( predicate_spec.isAtom() )
      {
        inference_removal_module_note_specific( predicate_spec, hl_module );
      }
      else
      {
        SubLObject cdolist_list_var = predicate_spec;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          inference_removal_module_note_specific( predicate, hl_module );
          cdolist_list_var = cdolist_list_var.rest();
          predicate = cdolist_list_var.first();
        }
      }
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52357L)
  public static SubLObject inference_removal_module_note_specific(final SubLObject predicate, final SubLObject hl_module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( predicate, $removal_modules_specific$.getGlobalValue(), ( NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue( thread ) ) ? list_utilities.sort_adjoin( hl_module, Hashtables
        .gethash( predicate, $removal_modules_specific$.getGlobalValue(), NIL ), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY )
        : conses_high.adjoin( hl_module, Hashtables.gethash( predicate, $removal_modules_specific$.getGlobalValue(), NIL ), UNPROVIDED, UNPROVIDED ) );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52791L)
  public static SubLObject inference_removal_moduleL_for_classification(final SubLObject module1, final SubLObject module2)
  {
    final SubLObject module1_specific_use_genericP = removal_module_specific_use_genericP( module1 );
    final SubLObject module2_specific_use_genericP = removal_module_specific_use_genericP( module2 );
    if( NIL != module1_specific_use_genericP && NIL == module2_specific_use_genericP )
    {
      return NIL;
    }
    if( NIL == module1_specific_use_genericP && NIL != module2_specific_use_genericP )
    {
      return T;
    }
    final SubLObject name1 = Symbols.symbol_name( hl_module_name( module1 ) );
    final SubLObject name2 = Symbols.symbol_name( hl_module_name( module2 ) );
    final SubLObject name1_length = Sequences.length( name1 );
    final SubLObject name2_length = Sequences.length( name2 );
    if( name1_length.numL( name2_length ) )
    {
      return T;
    }
    if( name1_length.numG( name2_length ) )
    {
      return NIL;
    }
    return Strings.stringL( name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53578L)
  public static SubLObject removal_module_specific_use_genericP_internal(final SubLObject module)
  {
    return conses_high.assoc( module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53578L)
  public static SubLObject removal_module_specific_use_genericP(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return removal_module_specific_use_genericP_internal( module );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( removal_module_specific_use_genericP_internal( module ) ) );
      memoization_state.caching_state_put( caching_state, module, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53925L)
  public static SubLObject inference_removal_pruning_module(final SubLObject name, final SubLObject plist)
  {
    SubLObject removal_plist = list_utilities.merge_plist( plist, $removal_pruning_module_properties$.getGlobalValue() );
    final SubLObject subtypes = conses_high.adjoin( $kw172$PRUNING, conses_high.getf( plist, $kw13$MODULE_SUBTYPE, NIL ), UNPROVIDED, UNPROVIDED );
    removal_plist = conses_high.putf( removal_plist, $kw13$MODULE_SUBTYPE, subtypes );
    return inference_removal_module( name, removal_plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54351L)
  public static SubLObject removal_pruning_moduleP(final SubLObject v_object)
  {
    return makeBoolean( NIL != removal_module_p( v_object ) && NIL != list_utilities.member_eqP( $kw172$PRUNING, hl_module_subtypes( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54682L)
  public static SubLObject do_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list174 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list174 );
      if( NIL == conses_high.member( current_$6, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list174 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym148$DO_SET, ConsesLow.list( module, $list175, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54990L)
  public static SubLObject removal_modules_conjunctive()
  {
    return $conjunctive_removal_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55124L)
  public static SubLObject conjunctive_removal_module_p(final SubLObject v_object)
  {
    return set.set_memberP( v_object, $conjunctive_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55295L)
  public static SubLObject conjunctive_removal_module_count()
  {
    return set.set_size( $conjunctive_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55397L)
  public static SubLObject conjunctive_removal_modules()
  {
    SubLObject v_modules = NIL;
    final SubLObject set_var = removal_modules_conjunctive();
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject module;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      module = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, module ) )
      {
        v_modules = ConsesLow.cons( module, v_modules );
      }
    }
    return v_modules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55621L)
  public static SubLObject inference_conjunctive_removal_module(final SubLObject name, final SubLObject plist)
  {
    final SubLObject hl_module = setup_module( name, $kw178$REMOVAL_CONJUNCTIVE, plist );
    set.set_add( hl_module, $conjunctive_removal_modules$.getGlobalValue() );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57550L)
  public static SubLObject undeclare_inference_conjunctive_removal_module(final SubLObject name)
  {
    final SubLObject hl_module = find_hl_module_by_name( name );
    if( NIL != hl_module_p( hl_module ) )
    {
      remove_hl_module( hl_module );
      return set.set_remove( hl_module, $conjunctive_removal_modules$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57905L)
  public static SubLObject do_meta_removal_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      if( NIL == conses_high.member( current_$7, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( hl_module, $list179, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58091L)
  public static SubLObject meta_removal_modules()
  {
    return $meta_removal_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58204L)
  public static SubLObject meta_removal_module_list()
  {
    return conses_high.copy_list( $meta_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58292L)
  public static SubLObject meta_removal_module_p(final SubLObject v_object)
  {
    SubLObject cdolist_list_var = meta_removal_modules();
    SubLObject module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( v_object.eql( module ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58423L)
  public static SubLObject meta_removal_module_count()
  {
    return Sequences.length( $meta_removal_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58509L)
  public static SubLObject meta_removal_module_specific_predicates(final SubLObject meta_removal_module)
  {
    return list_utilities.alist_lookup( $removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58795L)
  public static SubLObject meta_removal_module_specific_predicateP(final SubLObject meta_removal_module, final SubLObject predicate)
  {
    return subl_promotions.memberP( predicate, meta_removal_module_specific_predicates( meta_removal_module ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58975L)
  public static SubLObject predicate_uses_meta_removal_moduleP(final SubLObject predicate, final SubLObject meta_removal_module)
  {
    if( NIL != forts.fort_p( predicate ) && NIL != solely_specific_removal_module_predicateP( predicate ) && NIL == meta_removal_module_specific_predicateP( meta_removal_module, predicate ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59424L)
  public static SubLObject inference_meta_removal_module(final SubLObject name, SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw182$META_REMOVAL, plist );
    if( NIL == conses_high.member( item_var, $meta_removal_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $meta_removal_modules$.setGlobalValue( ConsesLow.cons( item_var, $meta_removal_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59899L)
  public static SubLObject removal_proof_module_p(final SubLObject hl_module)
  {
    return makeBoolean( NIL != removal_module_p( hl_module ) || NIL != conjunctive_removal_module_p( hl_module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60507L)
  public static SubLObject do_transformation_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      if( NIL == conses_high.member( current_$8, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( hl_module, $list184, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60666L)
  public static SubLObject transformation_modules()
  {
    return $transformation_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60785L)
  public static SubLObject transformation_module_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60885L)
  public static SubLObject transformation_module_count()
  {
    return Sequences.length( $transformation_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60975L)
  public static SubLObject inference_transformation_module(final SubLObject name, final SubLObject plist)
  {
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw187$TRANSFORMATION, plist );
    if( NIL == conses_high.member( item_var, $transformation_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $transformation_modules$.setGlobalValue( ConsesLow.cons( item_var, $transformation_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61635L)
  public static SubLObject do_meta_transformation_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      if( NIL == conses_high.member( current_$9, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( hl_module, $list189, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61804L)
  public static SubLObject meta_transformation_modules()
  {
    return $meta_transformation_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61938L)
  public static SubLObject meta_transformation_module_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $meta_transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62048L)
  public static SubLObject meta_transformation_module_count()
  {
    return Sequences.length( $meta_transformation_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62148L)
  public static SubLObject inference_meta_transformation_module(final SubLObject name, SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw192$META_TRANSFORMATION, plist );
    if( NIL == conses_high.member( item_var, $meta_transformation_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $meta_transformation_modules$.setGlobalValue( ConsesLow.cons( item_var, $meta_transformation_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62699L)
  public static SubLObject do_rewrite_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list174 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list174 );
      if( NIL == conses_high.member( current_$10, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list174 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( module, $list194, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62838L)
  public static SubLObject rewrite_modules()
  {
    return conses_high.copy_list( $rewrite_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62915L)
  public static SubLObject rewrite_module_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $rewrite_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63001L)
  public static SubLObject rewrite_module_count()
  {
    return Sequences.length( $rewrite_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63077L)
  public static SubLObject rewrite_module_support(final SubLObject module)
  {
    final SubLObject support_spec = hl_module_property_without_values( module, $kw195$REWRITE_SUPPORT );
    if( support_spec.isSymbol() )
    {
      return Symbols.symbol_value( support_spec );
    }
    return support_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63383L)
  public static SubLObject rewrite_module_closure(final SubLObject module)
  {
    return hl_module_property_without_values( module, $kw196$REWRITE_CLOSURE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63604L)
  public static SubLObject inference_rewrite_module(final SubLObject name, final SubLObject plist)
  {
    final SubLObject strengthened_plist = strengthen_rewrite_module_properties( name, plist );
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw197$REWRITE, strengthened_plist );
    if( NIL == conses_high.member( item_var, $rewrite_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $rewrite_modules$.setGlobalValue( ConsesLow.cons( item_var, $rewrite_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63991L)
  public static SubLObject undeclare_rewrite_module(final SubLObject hl_module)
  {
    return deregister_rewrite_module( hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64091L)
  public static SubLObject undeclare_rewrite_module_by_name(final SubLObject name)
  {
    return deregister_rewrite_module_by_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64197L)
  public static SubLObject deregister_rewrite_module(final SubLObject module)
  {
    remove_hl_module( module );
    $rewrite_modules$.setGlobalValue( Sequences.remove( module, $rewrite_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64448L)
  public static SubLObject deregister_rewrite_module_by_name(final SubLObject name)
  {
    final SubLObject module = find_hl_module_by_name( name );
    return deregister_rewrite_module( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64651L)
  public static SubLObject strengthen_rewrite_module_properties(final SubLObject name, SubLObject plist)
  {
    plist = conses_high.copy_tree( plist );
    final SubLObject pcase_var;
    final SubLObject sense = pcase_var = conses_high.getf( plist, $kw56$SENSE, UNPROVIDED );
    if( !pcase_var.eql( $kw164$POS ) )
    {
      if( !pcase_var.eql( $kw165$NEG ) )
      {
        Errors.error( $str198$rewrite_module__S_must_have_a__SE, name );
      }
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65334L)
  public static SubLObject structural_module_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65426L)
  public static SubLObject inference_structural_module(final SubLObject name, SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw200$STRUCTURAL, plist );
    if( NIL == conses_high.member( item_var, $structural_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $structural_modules$.setGlobalValue( ConsesLow.cons( item_var, $structural_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65627L)
  public static SubLObject structural_module_count()
  {
    return Sequences.length( $structural_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66051L)
  public static SubLObject do_meta_structural_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hl_module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    hl_module = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list147 );
      if( NIL == conses_high.member( current_$11, $list87, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw88$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw89$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_LIST, ConsesLow.list( hl_module, $list202, $kw89$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66212L)
  public static SubLObject meta_structural_modules()
  {
    return $meta_structural_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66334L)
  public static SubLObject meta_structural_module_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $meta_structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66436L)
  public static SubLObject meta_structural_module_count()
  {
    return Sequences.length( $meta_structural_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66528L)
  public static SubLObject inference_meta_structural_module(final SubLObject name, SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    final SubLObject item_var;
    final SubLObject hl_module = item_var = setup_module( name, $kw205$META_STRUCTURAL, plist );
    if( NIL == conses_high.member( item_var, $meta_structural_modules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $meta_structural_modules$.setGlobalValue( ConsesLow.cons( item_var, $meta_structural_modules$.getGlobalValue() ) );
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66919L)
  public static SubLObject cfasl_output_object_hl_module_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_wide_output_hl_module( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67036L)
  public static SubLObject cfasl_wide_output_hl_module(final SubLObject hl_module, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_hl_module$.getGlobalValue(), stream );
    cfasl_output_hl_module_internal( hl_module, stream );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67239L)
  public static SubLObject cfasl_output_hl_module_internal(final SubLObject hl_module, final SubLObject stream)
  {
    cfasl.cfasl_output( hl_module_name( hl_module ), stream );
    cfasl.cfasl_output( hl_module_plist( hl_module ), stream );
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67430L)
  public static SubLObject cfasl_input_hl_module(final SubLObject stream)
  {
    final SubLObject name = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject plist = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return new_hl_module( name, plist );
  }

  public static SubLObject declare_inference_modules_file()
  {
    SubLFiles.declareFunction( me, "hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_hl_module_properties", "DO-HL-MODULE-PROPERTIES" );
    SubLFiles.declareFunction( me, "hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false );
    new $allowed_modules_spec_p$UnaryFunction();
    SubLFiles.declareFunction( me, "non_universal_allowed_modules_spec_p", "NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disjunctive_allowed_modules_spec_p", "DISJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_allowed_modules_spec_p", "CONJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negated_allowed_modules_spec_p", "NEGATED-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_type_spec_p", "HL-MODULE-TYPE-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_subtype_spec_p", "HL-MODULE-SUBTYPE-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "property_allowed_modules_spec_p", "PROPERTY-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_allowedP", "HL-MODULE-ALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_allowed_by_allowed_modules_specP", "HL-MODULE-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_allowed_modules_spec_p", "SIMPLE-ALLOWED-MODULES-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_modules_from_simple_allowed_modules_spec", "GET-MODULES-FROM-SIMPLE-ALLOWED-MODULES-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_print_function_trampoline", "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_p", "HL-MODULE-P", 1, 0, false );
    new $hl_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "hl_mod_name", "HL-MOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_plist", "HL-MOD-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_sense", "HL-MOD-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_predicate", "HL-MOD-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_any_predicates", "HL-MOD-ANY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_arity", "HL-MOD-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_direction", "HL-MOD-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_required_pattern", "HL-MOD-REQUIRED-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_required_mt", "HL-MOD-REQUIRED-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_exclusive_func", "HL-MOD-EXCLUSIVE-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_required_func", "HL-MOD-REQUIRED-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_mod_completeness", "HL-MOD-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_name", "_CSETF-HL-MOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_plist", "_CSETF-HL-MOD-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_sense", "_CSETF-HL-MOD-SENSE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_predicate", "_CSETF-HL-MOD-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_any_predicates", "_CSETF-HL-MOD-ANY-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_arity", "_CSETF-HL-MOD-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_direction", "_CSETF-HL-MOD-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_required_pattern", "_CSETF-HL-MOD-REQUIRED-PATTERN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_required_mt", "_CSETF-HL-MOD-REQUIRED-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_exclusive_func", "_CSETF-HL-MOD-EXCLUSIVE-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_required_func", "_CSETF-HL-MOD-REQUIRED-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hl_mod_completeness", "_CSETF-HL-MOD-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_hl_module", "MAKE-HL-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_hl_module", "VISIT-DEFSTRUCT-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_hl_module_method", "VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_hl_module", "PRINT-HL-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_hl_module_method", "SXHASH-HL-MODULE-METHOD", 1, 0, false );
    new $sxhash_hl_module_method$UnaryFunction();
    SubLFiles.declareFunction( me, "check_hl_module_property_list", "CHECK-HL-MODULE-PROPERTY-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hl_module", "NEW-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_cfasl_create_invalid_hl_module", "CLEAR-CFASL-CREATE-INVALID-HL-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cfasl_create_invalid_hl_module", "REMOVE-CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_create_invalid_hl_module_internal", "CFASL-CREATE-INVALID-HL-MODULE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_create_invalid_hl_module", "CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_hl_module_plist", "CANONICALIZE-HL-MODULE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "allocate_hl_module", "ALLOCATE-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_hl_module", "DESTROY-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_name", "HL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_plist", "HL-MODULE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_property", "HL-MODULE-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_property_without_values", "HL-MODULE-PROPERTY-WITHOUT-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_property_not_defaultP", "HL-MODULE-PROPERTY-NOT-DEFAULT?", 2, 0, false );
    SubLFiles.declareMacro( me, "do_hl_modules", "DO-HL-MODULES" );
    SubLFiles.declareFunction( me, "hl_module_store", "HL-MODULE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_hl_module_by_name", "FIND-HL-MODULE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "add_hl_module", "ADD-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_hl_module", "REMOVE-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "setup_module", "SETUP-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "default_cost_func", "DEFAULT-COST-FUNC", 0, 1, false );
    SubLFiles.declareFunction( me, "default_expand_func", "DEFAULT-EXPAND-FUNC", 0, 2, false );
    SubLFiles.declareFunction( me, "hl_module_type", "HL-MODULE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_subtypes", "HL-MODULE-SUBTYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "abductive_hl_moduleP", "ABDUCTIVE-HL-MODULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_universal", "HL-MODULE-UNIVERSAL", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_source", "HL-MODULE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_sense", "HL-MODULE-SENSE", 1, 0, false );
    new $hl_module_sense$UnaryFunction();
    SubLFiles.declareFunction( me, "hl_module_sense_relevant_p", "HL-MODULE-SENSE-RELEVANT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_pattern", "HL-MODULE-REQUIRED-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_pattern_matched_p", "HL-MODULE-REQUIRED-PATTERN-MATCHED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_mt", "HL-MODULE-REQUIRED-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_mt_result", "HL-MODULE-REQUIRED-MT-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_hl_module_mt_prop", "INTERPRET-HL-MODULE-MT-PROP", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_mt_relevantP", "HL-MODULE-REQUIRED-MT-RELEVANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_func", "HL-MODULE-REQUIRED-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_required_func_p", "HL-MODULE-REQUIRED-FUNC-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_pattern", "HL-MODULE-COST-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_expression", "HL-MODULE-COST-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_func", "HL-MODULE-COST-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost", "HL-MODULE-COST", 2, 1, false );
    SubLFiles.declareFunction( me, "hl_module_asent_cost", "HL-MODULE-ASENT-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_clause_cost", "HL-MODULE-CLAUSE-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_pattern_result", "HL-MODULE-COST-PATTERN-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_expression_result", "HL-MODULE-COST-EXPRESSION-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_cost_function_result", "HL-MODULE-COST-FUNCTION-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_asent_cost_function_result", "HL-MODULE-ASENT-COST-FUNCTION-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_clause_cost_function_result", "HL-MODULE-CLAUSE-COST-FUNCTION-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_is_checkP", "HL-MODULE-IS-CHECK?", 1, 0, false );
    SubLFiles.declareFunction( me, "guess_hl_module_is_checkP", "GUESS-HL-MODULE-IS-CHECK?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_rule_select_func", "HL-MODULE-RULE-SELECT-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_rule_filter_func", "HL-MODULE-RULE-FILTER-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_expand_func", "HL-MODULE-EXPAND-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "default_expand_func_for_hl_module", "DEFAULT-EXPAND-FUNC-FOR-HL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_expand_pattern", "HL-MODULE-EXPAND-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_expand_iterative_pattern", "HL-MODULE-EXPAND-ITERATIVE-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_predicate", "HL-MODULE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_predicate_relevant_p", "HL-MODULE-PREDICATE-RELEVANT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_arity", "HL-MODULE-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_arity_relevant_p", "HL-MODULE-ARITY-RELEVANT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_exclusive_func", "HL-MODULE-EXCLUSIVE-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_supplants_info", "HL-MODULE-SUPPLANTS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_direction", "HL-MODULE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_direction_relevantP", "HL-MODULE-DIRECTION-RELEVANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_input_extract_pattern", "HL-MODULE-INPUT-EXTRACT-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_input_verify_pattern", "HL-MODULE-INPUT-VERIFY-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_input_encode_pattern", "HL-MODULE-INPUT-ENCODE-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_output_check_pattern", "HL-MODULE-OUTPUT-CHECK-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_output_generate_pattern", "HL-MODULE-OUTPUT-GENERATE-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_output_decode_pattern", "HL-MODULE-OUTPUT-DECODE-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_output_verify_pattern", "HL-MODULE-OUTPUT-VERIFY-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_output_construct_pattern", "HL-MODULE-OUTPUT-CONSTRUCT-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_pattern", "HL-MODULE-SUPPORT-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_func", "HL-MODULE-SUPPORT-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_module", "HL-MODULE-SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_mt", "HL-MODULE-SUPPORT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_mt_result", "HL-MODULE-SUPPORT-MT-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_support_strength", "HL-MODULE-SUPPORT-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_every_predicates", "HL-MODULE-EVERY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_applicability_func", "HL-MODULE-APPLICABILITY-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_applicability_pattern", "HL-MODULE-APPLICABILITY-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_any_predicates", "HL-MODULE-ANY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_documentation_string", "HL-MODULE-DOCUMENTATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_example_string", "HL-MODULE-EXAMPLE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_completeP", "HL-MODULE-COMPLETE?", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_incompleteP", "HL-MODULE-INCOMPLETE?", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_completeness", "HL-MODULE-COMPLETENESS", 2, 1, false );
    SubLFiles.declareFunction( me, "hl_module_clause_completeness", "HL-MODULE-CLAUSE-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_externalP", "HL-MODULE-EXTERNAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_activeP", "HL-MODULE-ACTIVE?", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_module_implementation_methods", "HL-MODULE-IMPLEMENTATION-METHODS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_removal_modules", "DO-REMOVAL-MODULES" );
    SubLFiles.declareFunction( me, "removal_modules", "REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_module_p", "REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_module_count", "REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "some_external_removal_modulesP", "SOME-EXTERNAL-REMOVAL-MODULES?", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_modules_external", "REMOVAL-MODULES-EXTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "generic_removal_module_p", "GENERIC-REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_removal_modules", "GENERIC-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "generic_removal_modules_for_sense", "GENERIC-REMOVAL-MODULES-FOR-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_removal_module_count", "GENERIC-REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_modules", "UNIVERSAL-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_module_p", "UNIVERSAL-REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_module_count", "UNIVERSAL-REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_module_exception_predicates", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_module_exception_predicateP", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_doesnt_use_universal_removal_moduleP", "PREDICATE-DOESNT-USE-UNIVERSAL-REMOVAL-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "universal_removal_modules_for_sense", "UNIVERSAL-REMOVAL-MODULES-FOR-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_modules_specific", "REMOVAL-MODULES-SPECIFIC", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_has_specific_removal_modulesP", "PREDICATE-HAS-SPECIFIC-REMOVAL-MODULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_modules_specific_for_sense", "REMOVAL-MODULES-SPECIFIC-FOR-SENSE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_modules_universal_for_predicate_and_sense", "REMOVAL-MODULES-UNIVERSAL-FOR-PREDICATE-AND-SENSE", 2, 0, false );
    SubLFiles.declareFunction( me, "predicates_with_specific_removal_modules", "PREDICATES-WITH-SPECIFIC-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_removal_modules", "SPECIFIC-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_removal_module_count", "SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_removal_module_set", "SPECIFIC-REMOVAL-MODULE-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_solely_specific_removal_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_solely_specific_removal_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "register_solely_specific_removal_module_predicate", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_solely_specific_removal_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "solely_specific_removal_module_predicateP", "SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_module", "INFERENCE-REMOVAL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_module_use_generic", "INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_module_use_meta_removal", "INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_module_dont_use_universal", "INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 0, false );
    SubLFiles.declareFunction( me, "redeclare_inference_removal_module", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "strengthen_removal_module_properties", "STRENGTHEN-REMOVAL-MODULE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_inference_removal_module", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false );
    SubLFiles.declareFunction( me, "undeclare_inference_meta_removal_module", "UNDECLARE-INFERENCE-META-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "undeclare_inference_removal_module_use_generic", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 1, false );
    SubLFiles.declareFunction( me, "undeclare_inference_removal_module_use_meta_removal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 1, false );
    SubLFiles.declareFunction( me, "undeclare_inference_removal_module_dont_use_universal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 1, false );
    SubLFiles.declareFunction( me, "reclassify_removal_modules", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_removal_modules", "CLEAR-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "classify_removal_module", "CLASSIFY-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_module_note_specific", "INFERENCE-REMOVAL-MODULE-NOTE-SPECIFIC", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_moduleL_for_classification", "INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_module_specific_use_genericP_internal", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_module_specific_use_genericP", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_removal_pruning_module", "INFERENCE-REMOVAL-PRUNING-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_pruning_moduleP", "REMOVAL-PRUNING-MODULE?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_conjunctive_removal_modules", "DO-CONJUNCTIVE-REMOVAL-MODULES" );
    SubLFiles.declareFunction( me, "removal_modules_conjunctive", "REMOVAL-MODULES-CONJUNCTIVE", 0, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_removal_module_p", "CONJUNCTIVE-REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_removal_module_count", "CONJUNCTIVE-REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_removal_modules", "CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_conjunctive_removal_module", "INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_inference_conjunctive_removal_module", "UNDECLARE-INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_meta_removal_modules", "DO-META-REMOVAL-MODULES" );
    SubLFiles.declareFunction( me, "meta_removal_modules", "META-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_removal_module_list", "META-REMOVAL-MODULE-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_removal_module_p", "META-REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_removal_module_count", "META-REMOVAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_removal_module_specific_predicates", "META-REMOVAL-MODULE-SPECIFIC-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_removal_module_specific_predicateP", "META-REMOVAL-MODULE-SPECIFIC-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_uses_meta_removal_moduleP", "PREDICATE-USES-META-REMOVAL-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_meta_removal_module", "INFERENCE-META-REMOVAL-MODULE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_proof_module_p", "REMOVAL-PROOF-MODULE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_transformation_modules", "DO-TRANSFORMATION-MODULES" );
    SubLFiles.declareFunction( me, "transformation_modules", "TRANSFORMATION-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_p", "TRANSFORMATION-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_count", "TRANSFORMATION-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_transformation_module", "INFERENCE-TRANSFORMATION-MODULE", 2, 0, false );
    SubLFiles.declareMacro( me, "do_meta_transformation_modules", "DO-META-TRANSFORMATION-MODULES" );
    SubLFiles.declareFunction( me, "meta_transformation_modules", "META-TRANSFORMATION-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_transformation_module_p", "META-TRANSFORMATION-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_transformation_module_count", "META-TRANSFORMATION-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_meta_transformation_module", "INFERENCE-META-TRANSFORMATION-MODULE", 1, 1, false );
    SubLFiles.declareMacro( me, "do_rewrite_modules", "DO-REWRITE-MODULES" );
    SubLFiles.declareFunction( me, "rewrite_modules", "REWRITE-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rewrite_module_p", "REWRITE-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rewrite_module_count", "REWRITE-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "rewrite_module_support", "REWRITE-MODULE-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "rewrite_module_closure", "REWRITE-MODULE-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_rewrite_module", "INFERENCE-REWRITE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_rewrite_module", "UNDECLARE-REWRITE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "undeclare_rewrite_module_by_name", "UNDECLARE-REWRITE-MODULE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_rewrite_module", "DEREGISTER-REWRITE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_rewrite_module_by_name", "DEREGISTER-REWRITE-MODULE-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "strengthen_rewrite_module_properties", "STRENGTHEN-REWRITE-MODULE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "structural_module_p", "STRUCTURAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_structural_module", "INFERENCE-STRUCTURAL-MODULE", 1, 1, false );
    SubLFiles.declareFunction( me, "structural_module_count", "STRUCTURAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareMacro( me, "do_meta_structural_modules", "DO-META-STRUCTURAL-MODULES" );
    SubLFiles.declareFunction( me, "meta_structural_modules", "META-STRUCTURAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_structural_module_p", "META-STRUCTURAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_structural_module_count", "META-STRUCTURAL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_meta_structural_module", "INFERENCE-META-STRUCTURAL-MODULE", 1, 1, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_hl_module_method", "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_hl_module", "CFASL-WIDE-OUTPUT-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_hl_module_internal", "CFASL-OUTPUT-HL-MODULE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_hl_module", "CFASL-INPUT-HL-MODULE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_modules_file()
  {
    $meta_removal_modules$ = SubLFiles.deflexical( "*META-REMOVAL-MODULES*", ( maybeDefault( $sym0$_META_REMOVAL_MODULES_, $meta_removal_modules$, NIL ) ) );
    $hl_module_properties$ = SubLFiles.deflexical( "*HL-MODULE-PROPERTIES*", $list1 );
    $valid_hl_module_subtypes$ = SubLFiles.deflexical( "*VALID-HL-MODULE-SUBTYPES*", $list10 );
    $default_hl_module_subtype$ = SubLFiles.deflexical( "*DEFAULT-HL-MODULE-SUBTYPE*", $kw11$KB );
    $hl_module_property_defaults$ = SubLFiles.deflexical( "*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist( Sequences.reverse( ConsesLow.listS( $list12, ConsesLow.list(
        $kw13$MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue() ), $list14 ) ), Symbols.symbol_function( EQL ) ) );
    $dtp_hl_module$ = SubLFiles.defconstant( "*DTP-HL-MODULE*", $sym22$HL_MODULE );
    $cfasl_create_invalid_hl_module_caching_state$ = SubLFiles.deflexical( "*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", NIL );
    $hl_module_store$ = SubLFiles.deflexical( "*HL-MODULE-STORE*", maybeDefault( $sym84$_HL_MODULE_STORE_, $hl_module_store$, () -> ( Hashtables.make_hash_table( $int85$212, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    $removal_modules$ = SubLFiles.deflexical( "*REMOVAL-MODULES*", maybeDefault( $sym146$_REMOVAL_MODULES_, $removal_modules$, () -> ( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ) ) ) );
    $removal_modules_external$ = SubLFiles.deflexical( "*REMOVAL-MODULES-EXTERNAL*", ( maybeDefault( $sym152$_REMOVAL_MODULES_EXTERNAL_, $removal_modules_external$, NIL ) ) );
    $removal_modules_generic$ = SubLFiles.deflexical( "*REMOVAL-MODULES-GENERIC*", ( maybeDefault( $sym153$_REMOVAL_MODULES_GENERIC_, $removal_modules_generic$, NIL ) ) );
    $removal_modules_universal$ = SubLFiles.deflexical( "*REMOVAL-MODULES-UNIVERSAL*", ( maybeDefault( $sym155$_REMOVAL_MODULES_UNIVERSAL_, $removal_modules_universal$, NIL ) ) );
    $removal_modules_specific$ = SubLFiles.deflexical( "*REMOVAL-MODULES-SPECIFIC*", maybeDefault( $sym156$_REMOVAL_MODULES_SPECIFIC_, $removal_modules_specific$, () -> ( Hashtables.make_hash_table( $int157$32,
        UNPROVIDED, UNPROVIDED ) ) ) );
    $removal_modules_specific_use_generic$ = SubLFiles.deflexical( "*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", ( maybeDefault( $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_, $removal_modules_specific_use_generic$,
        NIL ) ) );
    $removal_modules_specific_use_meta_removal$ = SubLFiles.deflexical( "*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", ( maybeDefault( $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_,
        $removal_modules_specific_use_meta_removal$, NIL ) ) );
    $removal_modules_specific_dont_use_universal$ = SubLFiles.deflexical( "*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", ( maybeDefault( $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_,
        $removal_modules_specific_dont_use_universal$, NIL ) ) );
    $solely_specific_removal_module_predicate_store$ = SubLFiles.deflexical( "*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", maybeDefault( $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_,
        $solely_specific_removal_module_predicate_store$, () -> ( set.new_set( EQL, $int163$50 ) ) ) );
    $classify_removal_modules_with_deterministic_sortP$ = SubLFiles.defparameter( "*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", T );
    $removal_pruning_module_properties$ = SubLFiles.deflexical( "*REMOVAL-PRUNING-MODULE-PROPERTIES*", $list171 );
    $conjunctive_removal_modules$ = SubLFiles.deflexical( "*CONJUNCTIVE-REMOVAL-MODULES*", maybeDefault( $sym173$_CONJUNCTIVE_REMOVAL_MODULES_, $conjunctive_removal_modules$, () -> ( set.new_set( Symbols.symbol_function(
        EQL ), UNPROVIDED ) ) ) );
    $transformation_modules$ = SubLFiles.deflexical( "*TRANSFORMATION-MODULES*", ( maybeDefault( $sym183$_TRANSFORMATION_MODULES_, $transformation_modules$, NIL ) ) );
    $meta_transformation_modules$ = SubLFiles.deflexical( "*META-TRANSFORMATION-MODULES*", ( maybeDefault( $sym188$_META_TRANSFORMATION_MODULES_, $meta_transformation_modules$, NIL ) ) );
    $rewrite_modules$ = SubLFiles.deflexical( "*REWRITE-MODULES*", ( maybeDefault( $sym193$_REWRITE_MODULES_, $rewrite_modules$, NIL ) ) );
    $structural_modules$ = SubLFiles.deflexical( "*STRUCTURAL-MODULES*", ( maybeDefault( $sym199$_STRUCTURAL_MODULES_, $structural_modules$, NIL ) ) );
    $meta_structural_modules$ = SubLFiles.deflexical( "*META-STRUCTURAL-MODULES*", ( maybeDefault( $sym201$_META_STRUCTURAL_MODULES_, $meta_structural_modules$, NIL ) ) );
    $cfasl_wide_opcode_hl_module$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-HL-MODULE*", $int206$256 );
    return NIL;
  }

  public static SubLObject setup_inference_modules_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_META_REMOVAL_MODULES_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function( $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list29 );
    Structures.def_csetf( $sym30$HL_MOD_NAME, $sym31$_CSETF_HL_MOD_NAME );
    Structures.def_csetf( $sym32$HL_MOD_PLIST, $sym33$_CSETF_HL_MOD_PLIST );
    Structures.def_csetf( $sym34$HL_MOD_SENSE, $sym35$_CSETF_HL_MOD_SENSE );
    Structures.def_csetf( $sym36$HL_MOD_PREDICATE, $sym37$_CSETF_HL_MOD_PREDICATE );
    Structures.def_csetf( $sym38$HL_MOD_ANY_PREDICATES, $sym39$_CSETF_HL_MOD_ANY_PREDICATES );
    Structures.def_csetf( $sym40$HL_MOD_ARITY, $sym41$_CSETF_HL_MOD_ARITY );
    Structures.def_csetf( $sym42$HL_MOD_DIRECTION, $sym43$_CSETF_HL_MOD_DIRECTION );
    Structures.def_csetf( $sym44$HL_MOD_REQUIRED_PATTERN, $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN );
    Structures.def_csetf( $sym46$HL_MOD_REQUIRED_MT, $sym47$_CSETF_HL_MOD_REQUIRED_MT );
    Structures.def_csetf( $sym48$HL_MOD_EXCLUSIVE_FUNC, $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC );
    Structures.def_csetf( $sym50$HL_MOD_REQUIRED_FUNC, $sym51$_CSETF_HL_MOD_REQUIRED_FUNC );
    Structures.def_csetf( $sym52$HL_MOD_COMPLETENESS, $sym53$_CSETF_HL_MOD_COMPLETENESS );
    Equality.identity( $sym22$HL_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function( $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function( $sym73$SXHASH_HL_MODULE_METHOD ) );
    memoization_state.note_globally_cached_function( $sym79$CFASL_CREATE_INVALID_HL_MODULE );
    subl_macro_promotions.declare_defglobal( $sym84$_HL_MODULE_STORE_ );
    access_macros.register_macro_helper( $sym94$HL_MODULE_STORE, $sym95$DO_HL_MODULES );
    subl_macro_promotions.declare_defglobal( $sym146$_REMOVAL_MODULES_ );
    access_macros.register_macro_helper( $sym150$REMOVAL_MODULES, $sym151$DO_REMOVAL_MODULES );
    subl_macro_promotions.declare_defglobal( $sym152$_REMOVAL_MODULES_EXTERNAL_ );
    subl_macro_promotions.declare_defglobal( $sym153$_REMOVAL_MODULES_GENERIC_ );
    subl_macro_promotions.declare_defglobal( $sym155$_REMOVAL_MODULES_UNIVERSAL_ );
    subl_macro_promotions.declare_defglobal( $sym156$_REMOVAL_MODULES_SPECIFIC_ );
    subl_macro_promotions.declare_defglobal( $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_ );
    subl_macro_promotions.declare_defglobal( $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_ );
    subl_macro_promotions.declare_defglobal( $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_ );
    subl_macro_promotions.declare_defglobal( $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_ );
    memoization_state.note_memoized_function( $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_ );
    subl_macro_promotions.declare_defglobal( $sym173$_CONJUNCTIVE_REMOVAL_MODULES_ );
    access_macros.register_macro_helper( $sym176$REMOVAL_MODULES_CONJUNCTIVE, $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES );
    access_macros.register_macro_helper( $sym180$META_REMOVAL_MODULES, $sym181$DO_META_REMOVAL_MODULES );
    subl_macro_promotions.declare_defglobal( $sym183$_TRANSFORMATION_MODULES_ );
    access_macros.register_macro_helper( $sym185$TRANSFORMATION_MODULES, $sym186$DO_TRANSFORMATION_MODULES );
    subl_macro_promotions.declare_defglobal( $sym188$_META_TRANSFORMATION_MODULES_ );
    access_macros.register_macro_helper( $sym190$META_TRANSFORMATION_MODULES, $sym191$DO_META_TRANSFORMATION_MODULES );
    subl_macro_promotions.declare_defglobal( $sym193$_REWRITE_MODULES_ );
    subl_macro_promotions.declare_defglobal( $sym199$_STRUCTURAL_MODULES_ );
    subl_macro_promotions.declare_defglobal( $sym201$_META_STRUCTURAL_MODULES_ );
    access_macros.register_macro_helper( $sym203$META_STRUCTURAL_MODULES, $sym204$DO_META_STRUCTURAL_MODULES );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_hl_module$.getGlobalValue(), $sym207$CFASL_INPUT_HL_MODULE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function( $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_modules_file();
  }
  static
  {
    me = new inference_modules();
    $meta_removal_modules$ = null;
    $hl_module_properties$ = null;
    $valid_hl_module_subtypes$ = null;
    $default_hl_module_subtype$ = null;
    $hl_module_property_defaults$ = null;
    $dtp_hl_module$ = null;
    $cfasl_create_invalid_hl_module_caching_state$ = null;
    $hl_module_store$ = null;
    $removal_modules$ = null;
    $removal_modules_external$ = null;
    $removal_modules_generic$ = null;
    $removal_modules_universal$ = null;
    $removal_modules_specific$ = null;
    $removal_modules_specific_use_generic$ = null;
    $removal_modules_specific_use_meta_removal$ = null;
    $removal_modules_specific_dont_use_universal$ = null;
    $solely_specific_removal_module_predicate_store$ = null;
    $classify_removal_modules_with_deterministic_sortP$ = null;
    $removal_pruning_module_properties$ = null;
    $conjunctive_removal_modules$ = null;
    $transformation_modules$ = null;
    $meta_transformation_modules$ = null;
    $rewrite_modules$ = null;
    $structural_modules$ = null;
    $meta_structural_modules$ = null;
    $cfasl_wide_opcode_hl_module$ = null;
    $sym0$_META_REMOVAL_MODULES_ = makeSymbol( "*META-REMOVAL-MODULES*" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-TYPE" ), makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "MODULE-SOURCE" ), makeKeyword( "CHECK" ), makeKeyword( "EXTERNAL" ), makeKeyword(
        "UNIVERSAL" ), makeKeyword( "SENSE" ), makeKeyword( "DIRECTION" ), makeKeyword( "PREDICATE" ), makeKeyword( "EVERY-PREDICATES" ), makeKeyword( "ANY-PREDICATES" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword(
            "REQUIRED-MT" ), makeKeyword( "ARITY" ), makeKeyword( "EXCLUSIVE" ), makeKeyword( "SUPPLANTS" ), makeKeyword( "REQUIRED" ), makeKeyword( "APPLICABILITY-PATTERN" ), makeKeyword( "APPLICABILITY" ), makeKeyword(
                "COST-PATTERN" ), makeKeyword( "COST-EXPRESSION" ), makeKeyword( "COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE-PATTERN" ), makeKeyword( "COMPLETENESS-PATTERN" ), makeKeyword(
                    "INPUT-EXTRACT-PATTERN" ), makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword( "INPUT-ENCODE-PATTERN" ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), makeKeyword(
                        "OUTPUT-DECODE-PATTERN" ), makeKeyword( "OUTPUT-VERIFY-PATTERN" ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), makeKeyword( "RULE-SELECT" ), makeKeyword( "RULE-FILTER" ), makeKeyword(
                            "EXPAND-ITERATIVE-PATTERN" ), makeKeyword( "EXPAND-PATTERN" ), makeKeyword( "EXPAND" ), makeKeyword( "REWRITE-CLOSURE" ), makeKeyword( "SUPPORT-PATTERN" ), makeKeyword( "SUPPORT" ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "SUPPORT-MT" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "REWRITE-SUPPORT" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "INCOMPLETENESS" ), makeKeyword(
          "ADD" ), makeKeyword( "REMOVE" ), makeKeyword( "REMOVE-ALL" ), makeKeyword( "PREFERRED-OVER" ), makeKeyword( "DOCUMENTATION" ), makeKeyword( "EXAMPLE" ), makeKeyword( "PRETTY-NAME" )
    } );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY-VAR" ), makeSymbol( "VALUE-VAR" ), makeSymbol( "HL-MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$MODULE_VAR = makeUninternedSymbol( "MODULE-VAR" );
    $sym4$CLET = makeSymbol( "CLET" );
    $sym5$DO_LIST = makeSymbol( "DO-LIST" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE-PROPERTIES" ) ) );
    $sym7$PWHEN = makeSymbol( "PWHEN" );
    $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = makeSymbol( "HL-MODULE-PROPERTY-NOT-DEFAULT?" );
    $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES = makeSymbol( "HL-MODULE-PROPERTY-WITHOUT-VALUES" );
    $list10 = ConsesLow.list( makeKeyword( "SKSI" ), makeKeyword( "KB" ), makeKeyword( "ABDUCTION" ), makeKeyword( "PRUNING" ) );
    $kw11$KB = makeKeyword( "KB" );
    $list12 = ConsesLow.list( makeKeyword( "MODULE-TYPE" ) );
    $kw13$MODULE_SUBTYPE = makeKeyword( "MODULE-SUBTYPE" );
    $list14 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "MODULE-SOURCE" ) ), ConsesLow.list( makeKeyword( "UNIVERSAL" ) ), ConsesLow.list( makeKeyword( "SENSE" ) ), ConsesLow.cons( makeKeyword(
        "REQUIRED-PATTERN" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "REQUIRED-MT" ) ), ConsesLow.list( makeKeyword( "REQUIRED" ) ), ConsesLow.list( makeKeyword( "COST-PATTERN" ) ), ConsesLow.list(
            makeKeyword( "COST-EXPRESSION" ) ), ConsesLow.cons( makeKeyword( "COST" ), makeSymbol( "DEFAULT-COST-FUNC" ) ), ConsesLow.list( makeKeyword( "COMPLETENESS" ) ), ConsesLow.list( makeKeyword(
                "COMPLETE-PATTERN" ) ), ConsesLow.list( makeKeyword( "COMPLETENESS-PATTERN" ) ), ConsesLow.cons( makeKeyword( "CHECK" ), makeKeyword( "UNKNOWN" ) ), ConsesLow.list( makeKeyword( "RULE-SELECT" ) ),
      ConsesLow.cons( makeKeyword( "EXPAND" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeKeyword( "EXPAND-PATTERN" ) ), ConsesLow.list( makeKeyword( "EXPAND-ITERATIVE-PATTERN" ) ), ConsesLow.list( makeKeyword(
          "PREDICATE" ) ), ConsesLow.list( makeKeyword( "ARITY" ) ), ConsesLow.list( makeKeyword( "EXCLUSIVE" ) ), ConsesLow.cons( makeKeyword( "SUPPLANTS" ), makeKeyword( "ALL" ) ), ConsesLow.cons( makeKeyword(
              "DIRECTION" ), makeKeyword( "FORWARD" ) ), ConsesLow.cons( makeKeyword( "INPUT-EXTRACT-PATTERN" ), makeKeyword( "INPUT" ) ), ConsesLow.cons( makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword(
                  "ANYTHING" ) ), ConsesLow.cons( makeKeyword( "INPUT-ENCODE-PATTERN" ), makeKeyword( "INPUT" ) ), ConsesLow.list( makeKeyword( "OUTPUT-CHECK-PATTERN" ) ), ConsesLow.list( makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ) ), ConsesLow.cons( makeKeyword( "OUTPUT-DECODE-PATTERN" ), makeKeyword( "INPUT" ) ), ConsesLow.cons( makeKeyword( "OUTPUT-VERIFY-PATTERN" ), makeKeyword( "ANYTHING" ) ),
      ConsesLow.cons( makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), makeKeyword( "INPUT" ) ), ConsesLow.list( makeKeyword( "SUPPORT-PATTERN" ) ), ConsesLow.list( makeKeyword( "SUPPORT" ) ), ConsesLow.cons( makeKeyword(
          "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ) ), ConsesLow.list( makeKeyword( "SUPPORT-MT" ) ), ConsesLow.cons( makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeKeyword(
              "EVERY-PREDICATES" ) ), ConsesLow.cons( makeKeyword( "APPLICABILITY" ), makeSymbol( "FALSE" ) ), ConsesLow.list( makeKeyword( "APPLICABILITY-PATTERN" ) ), ConsesLow.list( makeKeyword( "ANY-PREDICATES" ) ),
      ConsesLow.cons( makeKeyword( "DOCUMENTATION" ), makeString( "" ) ), ConsesLow.cons( makeKeyword( "EXAMPLE" ), makeString( "" ) ), ConsesLow.list( makeKeyword( "EXTERNAL" ) ), ConsesLow.list( makeKeyword(
          "REWRITE-SUPPORT" ) ), ConsesLow.list( makeKeyword( "REWRITE-CLOSURE" ) )
    } );
    $kw15$ALL = makeKeyword( "ALL" );
    $kw16$OR = makeKeyword( "OR" );
    $sym17$ALLOWED_MODULES_SPEC_P = makeSymbol( "ALLOWED-MODULES-SPEC-P" );
    $kw18$AND = makeKeyword( "AND" );
    $kw19$NOT = makeKeyword( "NOT" );
    $kw20$MODULE_TYPE = makeKeyword( "MODULE-TYPE" );
    $sym21$HL_MODULE_P = makeSymbol( "HL-MODULE-P" );
    $sym22$HL_MODULE = makeSymbol( "HL-MODULE" );
    $list23 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "PLIST" ), makeSymbol( "SENSE" ), makeSymbol( "PREDICATE" ), makeSymbol( "ANY-PREDICATES" ), makeSymbol( "ARITY" ), makeSymbol(
        "DIRECTION" ), makeSymbol( "REQUIRED-PATTERN" ), makeSymbol( "REQUIRED-MT" ), makeSymbol( "EXCLUSIVE-FUNC" ), makeSymbol( "REQUIRED-FUNC" ), makeSymbol( "COMPLETENESS" )
    } );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "PLIST" ), makeKeyword( "SENSE" ), makeKeyword( "PREDICATE" ), makeKeyword( "ANY-PREDICATES" ), makeKeyword( "ARITY" ), makeKeyword(
        "DIRECTION" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword( "REQUIRED-MT" ), makeKeyword( "EXCLUSIVE-FUNC" ), makeKeyword( "REQUIRED-FUNC" ), makeKeyword( "COMPLETENESS" )
    } );
    $list25 = ConsesLow.list( new SubLObject[] { makeSymbol( "HL-MOD-NAME" ), makeSymbol( "HL-MOD-PLIST" ), makeSymbol( "HL-MOD-SENSE" ), makeSymbol( "HL-MOD-PREDICATE" ), makeSymbol( "HL-MOD-ANY-PREDICATES" ),
      makeSymbol( "HL-MOD-ARITY" ), makeSymbol( "HL-MOD-DIRECTION" ), makeSymbol( "HL-MOD-REQUIRED-PATTERN" ), makeSymbol( "HL-MOD-REQUIRED-MT" ), makeSymbol( "HL-MOD-EXCLUSIVE-FUNC" ), makeSymbol(
          "HL-MOD-REQUIRED-FUNC" ), makeSymbol( "HL-MOD-COMPLETENESS" )
    } );
    $list26 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-HL-MOD-NAME" ), makeSymbol( "_CSETF-HL-MOD-PLIST" ), makeSymbol( "_CSETF-HL-MOD-SENSE" ), makeSymbol( "_CSETF-HL-MOD-PREDICATE" ), makeSymbol(
        "_CSETF-HL-MOD-ANY-PREDICATES" ), makeSymbol( "_CSETF-HL-MOD-ARITY" ), makeSymbol( "_CSETF-HL-MOD-DIRECTION" ), makeSymbol( "_CSETF-HL-MOD-REQUIRED-PATTERN" ), makeSymbol( "_CSETF-HL-MOD-REQUIRED-MT" ),
      makeSymbol( "_CSETF-HL-MOD-EXCLUSIVE-FUNC" ), makeSymbol( "_CSETF-HL-MOD-REQUIRED-FUNC" ), makeSymbol( "_CSETF-HL-MOD-COMPLETENESS" )
    } );
    $sym27$PRINT_HL_MODULE = makeSymbol( "PRINT-HL-MODULE" );
    $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list29 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "HL-MODULE-P" ) );
    $sym30$HL_MOD_NAME = makeSymbol( "HL-MOD-NAME" );
    $sym31$_CSETF_HL_MOD_NAME = makeSymbol( "_CSETF-HL-MOD-NAME" );
    $sym32$HL_MOD_PLIST = makeSymbol( "HL-MOD-PLIST" );
    $sym33$_CSETF_HL_MOD_PLIST = makeSymbol( "_CSETF-HL-MOD-PLIST" );
    $sym34$HL_MOD_SENSE = makeSymbol( "HL-MOD-SENSE" );
    $sym35$_CSETF_HL_MOD_SENSE = makeSymbol( "_CSETF-HL-MOD-SENSE" );
    $sym36$HL_MOD_PREDICATE = makeSymbol( "HL-MOD-PREDICATE" );
    $sym37$_CSETF_HL_MOD_PREDICATE = makeSymbol( "_CSETF-HL-MOD-PREDICATE" );
    $sym38$HL_MOD_ANY_PREDICATES = makeSymbol( "HL-MOD-ANY-PREDICATES" );
    $sym39$_CSETF_HL_MOD_ANY_PREDICATES = makeSymbol( "_CSETF-HL-MOD-ANY-PREDICATES" );
    $sym40$HL_MOD_ARITY = makeSymbol( "HL-MOD-ARITY" );
    $sym41$_CSETF_HL_MOD_ARITY = makeSymbol( "_CSETF-HL-MOD-ARITY" );
    $sym42$HL_MOD_DIRECTION = makeSymbol( "HL-MOD-DIRECTION" );
    $sym43$_CSETF_HL_MOD_DIRECTION = makeSymbol( "_CSETF-HL-MOD-DIRECTION" );
    $sym44$HL_MOD_REQUIRED_PATTERN = makeSymbol( "HL-MOD-REQUIRED-PATTERN" );
    $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN = makeSymbol( "_CSETF-HL-MOD-REQUIRED-PATTERN" );
    $sym46$HL_MOD_REQUIRED_MT = makeSymbol( "HL-MOD-REQUIRED-MT" );
    $sym47$_CSETF_HL_MOD_REQUIRED_MT = makeSymbol( "_CSETF-HL-MOD-REQUIRED-MT" );
    $sym48$HL_MOD_EXCLUSIVE_FUNC = makeSymbol( "HL-MOD-EXCLUSIVE-FUNC" );
    $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC = makeSymbol( "_CSETF-HL-MOD-EXCLUSIVE-FUNC" );
    $sym50$HL_MOD_REQUIRED_FUNC = makeSymbol( "HL-MOD-REQUIRED-FUNC" );
    $sym51$_CSETF_HL_MOD_REQUIRED_FUNC = makeSymbol( "_CSETF-HL-MOD-REQUIRED-FUNC" );
    $sym52$HL_MOD_COMPLETENESS = makeSymbol( "HL-MOD-COMPLETENESS" );
    $sym53$_CSETF_HL_MOD_COMPLETENESS = makeSymbol( "_CSETF-HL-MOD-COMPLETENESS" );
    $kw54$NAME = makeKeyword( "NAME" );
    $kw55$PLIST = makeKeyword( "PLIST" );
    $kw56$SENSE = makeKeyword( "SENSE" );
    $kw57$PREDICATE = makeKeyword( "PREDICATE" );
    $kw58$ANY_PREDICATES = makeKeyword( "ANY-PREDICATES" );
    $kw59$ARITY = makeKeyword( "ARITY" );
    $kw60$DIRECTION = makeKeyword( "DIRECTION" );
    $kw61$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $kw62$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $kw63$EXCLUSIVE_FUNC = makeKeyword( "EXCLUSIVE-FUNC" );
    $kw64$REQUIRED_FUNC = makeKeyword( "REQUIRED-FUNC" );
    $kw65$COMPLETENESS = makeKeyword( "COMPLETENESS" );
    $str66$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw67$BEGIN = makeKeyword( "BEGIN" );
    $sym68$MAKE_HL_MODULE = makeSymbol( "MAKE-HL-MODULE" );
    $kw69$SLOT = makeKeyword( "SLOT" );
    $kw70$END = makeKeyword( "END" );
    $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD" );
    $str72$_HL_Module___a_ = makeString( "[HL Module: ~a]" );
    $sym73$SXHASH_HL_MODULE_METHOD = makeSymbol( "SXHASH-HL-MODULE-METHOD" );
    $sym74$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym75$HL_MODULE_PROPERTY_P = makeSymbol( "HL-MODULE-PROPERTY-P" );
    $kw76$EXCLUSIVE = makeKeyword( "EXCLUSIVE" );
    $kw77$SUPPLANTS = makeKeyword( "SUPPLANTS" );
    $str78$_supplants_is_meaningless_without = makeString( ":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive." );
    $sym79$CFASL_CREATE_INVALID_HL_MODULE = makeSymbol( "CFASL-CREATE-INVALID-HL-MODULE" );
    $list80 = ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "INVALID" ) );
    $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_ = makeSymbol( "*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*" );
    $kw82$FREE = makeKeyword( "FREE" );
    $kw83$DEFAULT = makeKeyword( "DEFAULT" );
    $sym84$_HL_MODULE_STORE_ = makeSymbol( "*HL-MODULE-STORE*" );
    $int85$212 = makeInteger( 212 );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list87 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw88$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw89$DONE = makeKeyword( "DONE" );
    $sym90$NAME_VAR = makeUninternedSymbol( "NAME-VAR" );
    $sym91$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $list92 = ConsesLow.list( makeSymbol( "HL-MODULE-STORE" ) );
    $sym93$IGNORE = makeSymbol( "IGNORE" );
    $sym94$HL_MODULE_STORE = makeSymbol( "HL-MODULE-STORE" );
    $sym95$DO_HL_MODULES = makeSymbol( "DO-HL-MODULES" );
    $kw96$ABDUCTION = makeKeyword( "ABDUCTION" );
    $kw97$UNIVERSAL = makeKeyword( "UNIVERSAL" );
    $kw98$MODULE_SOURCE = makeKeyword( "MODULE-SOURCE" );
    $kw99$ANYTHING = makeKeyword( "ANYTHING" );
    $kw100$REQUIRED = makeKeyword( "REQUIRED" );
    $kw101$COST_PATTERN = makeKeyword( "COST-PATTERN" );
    $kw102$COST_EXPRESSION = makeKeyword( "COST-EXPRESSION" );
    $kw103$COST = makeKeyword( "COST" );
    $kw104$CHECK = makeKeyword( "CHECK" );
    $kw105$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw106$NOT_FULLY_BOUND = makeKeyword( "NOT-FULLY-BOUND" );
    $str107$check = makeString( "check" );
    $kw108$RULE_SELECT = makeKeyword( "RULE-SELECT" );
    $kw109$RULE_FILTER = makeKeyword( "RULE-FILTER" );
    $kw110$EXPAND = makeKeyword( "EXPAND" );
    $kw111$REMOVAL = makeKeyword( "REMOVAL" );
    $sym112$INFERENCE_REMOVE_CHECK_DEFAULT = makeSymbol( "INFERENCE-REMOVE-CHECK-DEFAULT" );
    $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT = makeSymbol( "INFERENCE-REMOVE-UNIFY-DEFAULT" );
    $sym114$DEFAULT_EXPAND_FUNC = makeSymbol( "DEFAULT-EXPAND-FUNC" );
    $kw115$EXPAND_PATTERN = makeKeyword( "EXPAND-PATTERN" );
    $kw116$EXPAND_ITERATIVE_PATTERN = makeKeyword( "EXPAND-ITERATIVE-PATTERN" );
    $sym117$PATTERN_MATCHES_FORMULA = makeSymbol( "PATTERN-MATCHES-FORMULA" );
    $kw118$FORWARD = makeKeyword( "FORWARD" );
    $kw119$INPUT_EXTRACT_PATTERN = makeKeyword( "INPUT-EXTRACT-PATTERN" );
    $kw120$INPUT_VERIFY_PATTERN = makeKeyword( "INPUT-VERIFY-PATTERN" );
    $kw121$INPUT_ENCODE_PATTERN = makeKeyword( "INPUT-ENCODE-PATTERN" );
    $kw122$OUTPUT_CHECK_PATTERN = makeKeyword( "OUTPUT-CHECK-PATTERN" );
    $kw123$OUTPUT_GENERATE_PATTERN = makeKeyword( "OUTPUT-GENERATE-PATTERN" );
    $kw124$OUTPUT_DECODE_PATTERN = makeKeyword( "OUTPUT-DECODE-PATTERN" );
    $kw125$OUTPUT_VERIFY_PATTERN = makeKeyword( "OUTPUT-VERIFY-PATTERN" );
    $kw126$OUTPUT_CONSTRUCT_PATTERN = makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" );
    $kw127$SUPPORT_PATTERN = makeKeyword( "SUPPORT-PATTERN" );
    $kw128$SUPPORT = makeKeyword( "SUPPORT" );
    $kw129$SUPPORT_MODULE = makeKeyword( "SUPPORT-MODULE" );
    $kw130$SUPPORT_MT = makeKeyword( "SUPPORT-MT" );
    $kw131$SUPPORT_STRENGTH = makeKeyword( "SUPPORT-STRENGTH" );
    $kw132$EVERY_PREDICATES = makeKeyword( "EVERY-PREDICATES" );
    $kw133$APPLICABILITY = makeKeyword( "APPLICABILITY" );
    $kw134$APPLICABILITY_PATTERN = makeKeyword( "APPLICABILITY-PATTERN" );
    $kw135$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $kw136$EXAMPLE = makeKeyword( "EXAMPLE" );
    $kw137$COMPLETE = makeKeyword( "COMPLETE" );
    $kw138$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw139$COMPLETE_PATTERN = makeKeyword( "COMPLETE-PATTERN" );
    $kw140$COMPLETENESS_PATTERN = makeKeyword( "COMPLETENESS-PATTERN" );
    $kw141$EXTERNAL = makeKeyword( "EXTERNAL" );
    $sym142$FUNCTION_SYMBOL_P = makeSymbol( "FUNCTION-SYMBOL-P" );
    $list143 = ConsesLow.list( makeSymbol( "TRUE" ), makeSymbol( "FALSE" ) );
    $sym144$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym145$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym146$_REMOVAL_MODULES_ = makeSymbol( "*REMOVAL-MODULES*" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym148$DO_SET = makeSymbol( "DO-SET" );
    $list149 = ConsesLow.list( makeSymbol( "REMOVAL-MODULES" ) );
    $sym150$REMOVAL_MODULES = makeSymbol( "REMOVAL-MODULES" );
    $sym151$DO_REMOVAL_MODULES = makeSymbol( "DO-REMOVAL-MODULES" );
    $sym152$_REMOVAL_MODULES_EXTERNAL_ = makeSymbol( "*REMOVAL-MODULES-EXTERNAL*" );
    $sym153$_REMOVAL_MODULES_GENERIC_ = makeSymbol( "*REMOVAL-MODULES-GENERIC*" );
    $sym154$HL_MODULE_SENSE = makeSymbol( "HL-MODULE-SENSE" );
    $sym155$_REMOVAL_MODULES_UNIVERSAL_ = makeSymbol( "*REMOVAL-MODULES-UNIVERSAL*" );
    $sym156$_REMOVAL_MODULES_SPECIFIC_ = makeSymbol( "*REMOVAL-MODULES-SPECIFIC*" );
    $int157$32 = makeInteger( 32 );
    $sym158$FORT_P = makeSymbol( "FORT-P" );
    $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_ = makeSymbol( "*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*" );
    $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_ = makeSymbol( "*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*" );
    $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_ = makeSymbol( "*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*" );
    $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_ = makeSymbol( "*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*" );
    $int163$50 = makeInteger( 50 );
    $kw164$POS = makeKeyword( "POS" );
    $kw165$NEG = makeKeyword( "NEG" );
    $str166$removal_module__S_must_have_a__SE = makeString( "removal module ~S must have a :SENSE of :POS or :NEG" );
    $sym167$CAR = makeSymbol( "CAR" );
    $list168 = ConsesLow.cons( makeSymbol( "HL-MODULE" ), makeSymbol( "PREDICATES" ) );
    $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION = makeSymbol( "INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION" );
    $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_ = makeSymbol( "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?" );
    $list171 = ConsesLow.list( makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ) );
    $kw172$PRUNING = makeKeyword( "PRUNING" );
    $sym173$_CONJUNCTIVE_REMOVAL_MODULES_ = makeSymbol( "*CONJUNCTIVE-REMOVAL-MODULES*" );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list175 = ConsesLow.list( makeSymbol( "REMOVAL-MODULES-CONJUNCTIVE" ) );
    $sym176$REMOVAL_MODULES_CONJUNCTIVE = makeSymbol( "REMOVAL-MODULES-CONJUNCTIVE" );
    $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol( "DO-CONJUNCTIVE-REMOVAL-MODULES" );
    $kw178$REMOVAL_CONJUNCTIVE = makeKeyword( "REMOVAL-CONJUNCTIVE" );
    $list179 = ConsesLow.list( makeSymbol( "META-REMOVAL-MODULES" ) );
    $sym180$META_REMOVAL_MODULES = makeSymbol( "META-REMOVAL-MODULES" );
    $sym181$DO_META_REMOVAL_MODULES = makeSymbol( "DO-META-REMOVAL-MODULES" );
    $kw182$META_REMOVAL = makeKeyword( "META-REMOVAL" );
    $sym183$_TRANSFORMATION_MODULES_ = makeSymbol( "*TRANSFORMATION-MODULES*" );
    $list184 = ConsesLow.list( makeSymbol( "TRANSFORMATION-MODULES" ) );
    $sym185$TRANSFORMATION_MODULES = makeSymbol( "TRANSFORMATION-MODULES" );
    $sym186$DO_TRANSFORMATION_MODULES = makeSymbol( "DO-TRANSFORMATION-MODULES" );
    $kw187$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $sym188$_META_TRANSFORMATION_MODULES_ = makeSymbol( "*META-TRANSFORMATION-MODULES*" );
    $list189 = ConsesLow.list( makeSymbol( "META-TRANSFORMATION-MODULES" ) );
    $sym190$META_TRANSFORMATION_MODULES = makeSymbol( "META-TRANSFORMATION-MODULES" );
    $sym191$DO_META_TRANSFORMATION_MODULES = makeSymbol( "DO-META-TRANSFORMATION-MODULES" );
    $kw192$META_TRANSFORMATION = makeKeyword( "META-TRANSFORMATION" );
    $sym193$_REWRITE_MODULES_ = makeSymbol( "*REWRITE-MODULES*" );
    $list194 = ConsesLow.list( makeSymbol( "REWRITE-MODULES" ) );
    $kw195$REWRITE_SUPPORT = makeKeyword( "REWRITE-SUPPORT" );
    $kw196$REWRITE_CLOSURE = makeKeyword( "REWRITE-CLOSURE" );
    $kw197$REWRITE = makeKeyword( "REWRITE" );
    $str198$rewrite_module__S_must_have_a__SE = makeString( "rewrite module ~S must have a :SENSE of :POS or :NEG" );
    $sym199$_STRUCTURAL_MODULES_ = makeSymbol( "*STRUCTURAL-MODULES*" );
    $kw200$STRUCTURAL = makeKeyword( "STRUCTURAL" );
    $sym201$_META_STRUCTURAL_MODULES_ = makeSymbol( "*META-STRUCTURAL-MODULES*" );
    $list202 = ConsesLow.list( makeSymbol( "META-STRUCTURAL-MODULES" ) );
    $sym203$META_STRUCTURAL_MODULES = makeSymbol( "META-STRUCTURAL-MODULES" );
    $sym204$DO_META_STRUCTURAL_MODULES = makeSymbol( "DO-META-STRUCTURAL-MODULES" );
    $kw205$META_STRUCTURAL = makeKeyword( "META-STRUCTURAL" );
    $int206$256 = makeInteger( 256 );
    $sym207$CFASL_INPUT_HL_MODULE = makeSymbol( "CFASL-INPUT-HL-MODULE" );
    $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD" );
  }

  public static final class $allowed_modules_spec_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $allowed_modules_spec_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ALLOWED-MODULES-SPEC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return allowed_modules_spec_p( arg1 );
    }
  }

  public static final class $hl_module_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $plist;
    public SubLObject $sense;
    public SubLObject $predicate;
    public SubLObject $any_predicates;
    public SubLObject $arity;
    public SubLObject $direction;
    public SubLObject $required_pattern;
    public SubLObject $required_mt;
    public SubLObject $exclusive_func;
    public SubLObject $required_func;
    public SubLObject $completeness;
    private static final SubLStructDeclNative structDecl;

    public $hl_module_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
      this.$sense = CommonSymbols.NIL;
      this.$predicate = CommonSymbols.NIL;
      this.$any_predicates = CommonSymbols.NIL;
      this.$arity = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$required_pattern = CommonSymbols.NIL;
      this.$required_mt = CommonSymbols.NIL;
      this.$exclusive_func = CommonSymbols.NIL;
      this.$required_func = CommonSymbols.NIL;
      this.$completeness = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $hl_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$plist;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sense;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$predicate;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$any_predicates;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$arity;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$direction;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$required_pattern;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$required_mt;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$exclusive_func;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$required_func;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$completeness;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$plist = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sense = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$predicate = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$any_predicates = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$arity = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$direction = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$required_pattern = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$required_mt = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$exclusive_func = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$required_func = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$completeness = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $hl_module_native.class, $sym22$HL_MODULE, $sym21$HL_MODULE_P, $list23, $list24, new String[] { "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity",
        "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness"
      }, $list25, $list26, $sym27$PRINT_HL_MODULE );
    }
  }

  public static final class $hl_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $hl_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HL-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hl_module_p( arg1 );
    }
  }

  public static final class $sxhash_hl_module_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_hl_module_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-HL-MODULE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_hl_module_method( arg1 );
    }
  }

  public static final class $hl_module_sense$UnaryFunction
      extends
        UnaryFunction
  {
    public $hl_module_sense$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HL-MODULE-SENSE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hl_module_sense( arg1 );
    }
  }
}
/*
 * 
 * Total time: 790 ms
 * 
 */
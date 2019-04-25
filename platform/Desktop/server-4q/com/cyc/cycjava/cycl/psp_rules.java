package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_rules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.psp_rules";
  public static final String myFingerPrint = "51ac9eadd0ee15bd9a92503f9ab276f9adc213a54045420746ce0e6e34b2e1f8";
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLSymbol $dtp_phrase_structure_parser_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2639L)
  private static SubLSymbol $psp_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7292L)
  private static SubLSymbol $psp_rule_fort_weights$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8190L)
  public static SubLSymbol $psp_rule_arity_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10983L)
  private static SubLSymbol $psp_traced_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16247L)
  private static SubLSymbol $psp_syntactic_constraint_types$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16927L)
  private static SubLSymbol $psp_semantic_constraint_types$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
  private static SubLSymbol $psp_cycl_fails_constraintP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
  private static SubLSymbol $psp_phrase_types_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
  private static SubLSymbol $psp_sub_categories_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
  private static SubLSymbol $psp_sub_pos_preds_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
  private static SubLSymbol $psp_frame_type_instances_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
  private static SubLSymbol $psp_rewrite_caching_state$;
  private static final SubLSymbol $sym0$PHRASE_STRUCTURE_PARSER_RULE;
  private static final SubLSymbol $sym1$PHRASE_STRUCTURE_PARSER_RULE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PPRINT_PSP_RULE;
  private static final SubLSymbol $sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PSP_RULE_FORT;
  private static final SubLSymbol $sym10$_CSETF_PSP_RULE_FORT;
  private static final SubLSymbol $sym11$PSP_RULE_ARITY;
  private static final SubLSymbol $sym12$_CSETF_PSP_RULE_ARITY;
  private static final SubLSymbol $sym13$PSP_RULE_CATEGORY;
  private static final SubLSymbol $sym14$_CSETF_PSP_RULE_CATEGORY;
  private static final SubLSymbol $sym15$PSP_RULE_HEAD;
  private static final SubLSymbol $sym16$_CSETF_PSP_RULE_HEAD;
  private static final SubLSymbol $sym17$PSP_RULE_CONSTRAINTS;
  private static final SubLSymbol $sym18$_CSETF_PSP_RULE_CONSTRAINTS;
  private static final SubLSymbol $sym19$PSP_RULE_SEMX;
  private static final SubLSymbol $sym20$_CSETF_PSP_RULE_SEMX;
  private static final SubLSymbol $sym21$PSP_RULE_WEIGHT;
  private static final SubLSymbol $sym22$_CSETF_PSP_RULE_WEIGHT;
  private static final SubLSymbol $kw23$FORT;
  private static final SubLSymbol $kw24$ARITY;
  private static final SubLSymbol $kw25$CATEGORY;
  private static final SubLSymbol $kw26$HEAD;
  private static final SubLSymbol $kw27$CONSTRAINTS;
  private static final SubLSymbol $kw28$SEMX;
  private static final SubLSymbol $kw29$WEIGHT;
  private static final SubLString $str30$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw31$BEGIN;
  private static final SubLSymbol $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE;
  private static final SubLSymbol $kw33$SLOT;
  private static final SubLSymbol $kw34$END;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD;
  private static final SubLString $str36$__PSP_RULE___S_;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CDESTRUCTURING_BIND;
  private static final SubLInteger $int39$128;
  private static final SubLSymbol $sym40$ADD_PHRASE_STRUCTURE_RULE;
  private static final SubLSymbol $sym41$REMOVE_PHRASE_STRUCTURE_RULE;
  private static final SubLObject $const42$PhraseStructureRule;
  private static final SubLObject $const43$isa;
  private static final SubLSymbol $kw44$BREADTH;
  private static final SubLSymbol $kw45$QUEUE;
  private static final SubLSymbol $kw46$STACK;
  private static final SubLSymbol $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw48$ERROR;
  private static final SubLString $str49$_A_is_not_a__A;
  private static final SubLSymbol $sym50$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw51$CERROR;
  private static final SubLString $str52$continue_anyway;
  private static final SubLSymbol $kw53$WARN;
  private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str56$attempting_to_bind_direction_link;
  private static final SubLList $list57;
  private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw59$INITIALIZED;
  private static final SubLObject $const60$psRuleArity;
  private static final SubLObject $const61$psRuleCategory;
  private static final SubLObject $const62$psRuleSyntacticHeadDtr;
  private static final SubLObject $const63$psRuleConstraint;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$STORED;
  private static final SubLSymbol $sym66$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const67$EverythingPSC;
  private static final SubLObject $const68$psRuleSemanticsFromDtr;
  private static final SubLSymbol $kw69$IDENTITY;
  private static final SubLSymbol $kw70$TEMPLATE;
  private static final SubLObject $const71$psRuleTemplateDtr;
  private static final SubLSymbol $kw72$INSTANCE;
  private static final SubLObject $const73$PSBindingFn;
  private static final SubLSymbol $kw74$TYPE;
  private static final SubLObject $const75$PSBindingFn_TypeLevel;
  private static final SubLObject $const76$psRuleTemplateBindings;
  private static final SubLSymbol $kw77$NONE;
  private static final SubLObject $const78$PSRule_NounNounCompound;
  private static final SubLFloat $float79$0_5;
  private static final SubLObject $const80$PSRule_NameNounCompound;
  private static final SubLObject $const81$PSRule_AdjectiveNameCompound;
  private static final SubLObject $const82$PSRule_NameNameNounCompound;
  private static final SubLSymbol $sym83$PSP_RULE_FORT_WEIGHTS;
  private static final SubLString $str84$psRuleWeight;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLFloat $float88$0_95;
  private static final SubLSymbol $kw89$INFINITE_RECURSION_RULE;
  private static final SubLList $list90;
  private static final SubLObject $const91$ConstituentTypeConstraintFn;
  private static final SubLObject $const92$POSPredConstraintFn;
  private static final SubLSymbol $kw93$FRAME;
  private static final SubLSymbol $kw94$STUB;
  private static final SubLSymbol $sym95$_PSP_TRACED_RULES_;
  private static final SubLSymbol $sym96$FORT_P;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$PWHEN;
  private static final SubLSymbol $sym99$PSP_TRACED_RULE_;
  private static final SubLSymbol $sym100$DO_PSP_TRACE_REPORT;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$FORMAT;
  private static final SubLString $str103$___S___meets_the_first_dtr_constr;
  private static final SubLSymbol $sym104$PSP_SEMANTIC_CONSTRAINT_;
  private static final SubLString $str105$___S____A_constraint__S___;
  private static final SubLString $str106$failed;
  private static final SubLString $str107$met;
  private static final SubLSymbol $kw108$LIST;
  private static final SubLSymbol $kw109$UNKNOWN;
  private static final SubLString $str110$___S___failed_constraint__S___S;
  private static final SubLSymbol $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_;
  private static final SubLObject $const112$PhraseStructureConstraint_Syntact;
  private static final SubLObject $const113$resultIsa;
  private static final SubLSymbol $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_;
  private static final SubLObject $const115$PhraseStructureConstraint_Semanti;
  private static final SubLSymbol $sym116$PSP_CYCL_FAILS_CONSTRAINT_;
  private static final SubLList $list117;
  private static final SubLObject $const118$PSRuleIsaConstraintFn;
  private static final SubLObject $const119$PSRuleGenlsConstraintFn;
  private static final SubLSymbol $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_;
  private static final SubLInteger $int121$256;
  private static final SubLSymbol $kw122$GAP;
  private static final SubLObject $const123$PrepositionalPhrase;
  private static final SubLObject $const124$DetNbarAgrConstraintFn;
  private static final SubLSymbol $sym125$PSP_PHRASE_TYPES;
  private static final SubLObject $const126$NLPhrase;
  private static final SubLSymbol $sym127$_PSP_PHRASE_TYPES_CACHING_STATE_;
  private static final SubLSymbol $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_;
  private static final SubLObject $const129$Preposition;
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLObject $const132$Number_SP;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$GENL_POS_PRED_;
  private static final SubLSymbol $sym135$PSP_SUB_CATEGORIES;
  private static final SubLInteger $int136$32;
  private static final SubLSymbol $sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_;
  private static final SubLSymbol $sym138$PSP_SUB_POS_PREDS;
  private static final SubLInteger $int139$64;
  private static final SubLSymbol $sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_;
  private static final SubLSymbol $sym141$PSP_FRAME_TYPE_INSTANCES;
  private static final SubLSymbol $sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_;
  private static final SubLSymbol $sym143$PSP_REWRITE;
  private static final SubLObject $const144$rewriteOf;
  private static final SubLSymbol $sym145$_PSP_REWRITE_CACHING_STATE_;
  private static final SubLSymbol $sym146$PSP_ISA_;
  private static final SubLSymbol $sym147$PSP_GENL_;
  private static final SubLList $list148;
  private static final SubLSymbol $sym149$PSP_SPEC_CONST_CONSTRAINT_;
  private static final SubLSymbol $kw150$PASSIVE_WITH_BY;
  private static final SubLList $list151;
  private static final SubLObject $const152$NounPhrase;
  private static final SubLObject $const153$subcatFrameDependentConstraint;
  private static final SubLList $list154;
  private static final SubLObject $const155$PPCompFrameFn;
  private static final SubLObject $const156$TransitivePPFrameType;
  private static final SubLObject $const157$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const158$NLWordForm;
  private static final SubLObject $const159$lexemeOfWordForm;
  private static final SubLObject $const160$DitransitivePPFrameType;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$PSP_PARSE_TREE_FOR_EDGE;

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject phrase_structure_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_psp_rule( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject phrase_structure_parser_rule_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $phrase_structure_parser_rule_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_fort(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_arity(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_category(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_head(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_constraints(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_semx(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject psp_rule_weight(final SubLObject v_object)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_fort(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_arity(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_head(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_semx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject _csetf_psp_rule_weight(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != phrase_structure_parser_rule_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject make_phrase_structure_parser_rule(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $phrase_structure_parser_rule_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw23$FORT ) )
      {
        _csetf_psp_rule_fort( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$ARITY ) )
      {
        _csetf_psp_rule_arity( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$CATEGORY ) )
      {
        _csetf_psp_rule_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$HEAD ) )
      {
        _csetf_psp_rule_head( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$CONSTRAINTS ) )
      {
        _csetf_psp_rule_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$SEMX ) )
      {
        _csetf_psp_rule_semx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$WEIGHT ) )
      {
        _csetf_psp_rule_weight( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject visit_defstruct_phrase_structure_parser_rule(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw23$FORT, psp_rule_fort( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw24$ARITY, psp_rule_arity( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw25$CATEGORY, psp_rule_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw26$HEAD, psp_rule_head( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw27$CONSTRAINTS, psp_rule_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw28$SEMX, psp_rule_semx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$WEIGHT, psp_rule_weight( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
  public static SubLObject visit_defstruct_object_phrase_structure_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_phrase_structure_parser_rule( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1312L)
  public static SubLObject pprint_psp_rule(final SubLObject psp_rule, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str36$__PSP_RULE___S_, psp_rule_fort( psp_rule ) );
    return psp_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1476L)
  public static SubLObject new_psp_rule(SubLObject fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight)
  {
    if( fort == UNPROVIDED )
    {
      fort = NIL;
    }
    if( v_arity == UNPROVIDED )
    {
      v_arity = NIL;
    }
    if( category == UNPROVIDED )
    {
      category = NIL;
    }
    if( head == UNPROVIDED )
    {
      head = NIL;
    }
    if( constraints == UNPROVIDED )
    {
      constraints = psp_new_constraints();
    }
    if( semx == UNPROVIDED )
    {
      semx = NIL;
    }
    if( weight == UNPROVIDED )
    {
      weight = NIL;
    }
    final SubLObject rule = make_phrase_structure_parser_rule( UNPROVIDED );
    _csetf_psp_rule_arity( rule, v_arity );
    _csetf_psp_rule_fort( rule, fort );
    _csetf_psp_rule_category( rule, category );
    _csetf_psp_rule_head( rule, head );
    _csetf_psp_rule_constraints( rule, constraints );
    _csetf_psp_rule_semx( rule, semx );
    _csetf_psp_rule_weight( rule, weight );
    return rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1966L)
  public static SubLObject psp_new_constraints()
  {
    return dictionary.new_dictionary( Symbols.symbol_function( EQL ), EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2040L)
  public static SubLObject psp_constraints_on_dtr(final SubLObject dtr_num, final SubLObject constraints)
  {
    return dictionary.dictionary_lookup_without_values( constraints, dtr_num, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2166L)
  public static SubLObject psp_new_constraint(final SubLObject type, final SubLObject target)
  {
    return ConsesLow.list( type, target );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2244L)
  public static SubLObject psp_constraint_type(final SubLObject constraint)
  {
    return constraint.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2322L)
  public static SubLObject psp_constraint_target(final SubLObject constraint)
  {
    return conses_high.second( constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2403L)
  public static SubLObject psp_destructure_constraint(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject constraint = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
      constraint = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym38$CDESTRUCTURING_BIND, ConsesLow.list( type, target ), constraint, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2840L)
  public static SubLObject psp_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $psp_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2893L)
  public static SubLObject clear_psp_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    psp_semantics.psp_semx_clear_handlers();
    psp_main.clear_psp_caches();
    clear_psp_rules_caches();
    return set.clear_set( $psp_rules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3118L)
  public static SubLObject add_phrase_structure_rule(final SubLObject argument, final SubLObject assertion)
  {
    clear_psp_rules();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3317L)
  public static SubLObject remove_phrase_structure_rule(final SubLObject argument, final SubLObject assertion)
  {
    clear_psp_rules();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3523L)
  public static SubLObject initialize_psp_rules(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_psp_rules();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject node_var = $const42$PhraseStructureRule;
          final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const43$isa ), thread );
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              SubLObject node_var_$4 = node_var;
              final SubLObject deck_type = $kw46$STACK;
              final SubLObject recur_deck = deck.create_deck( deck_type );
              final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                try
                {
                  final SubLObject tv_var = NIL;
                  final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                    if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                    {
                      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                      if( pcase_var.eql( $kw48$ERROR ) )
                      {
                        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw51$CERROR ) )
                      {
                        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw53$WARN ) )
                      {
                        Errors.warn( $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                      }
                      else
                      {
                        Errors.warn( $str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                        Errors.cerror( $str52$continue_anyway, $str49$_A_is_not_a__A, tv_var, $sym50$SBHL_TRUE_TV_P );
                      }
                    }
                    final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const43$isa ) ), thread );
                      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                          $const43$isa ) ) ), thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                          .get_sbhl_module( $const43$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const43$isa ) ), thread );
                      if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                      {
                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                          sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                              .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const43$isa ) ) ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$4, UNPROVIDED );
                          while ( NIL != node_var_$4)
                          {
                            final SubLObject tt_node_var = node_var_$4;
                            SubLObject cdolist_list_var;
                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const43$isa ) );
                            SubLObject module_var = NIL;
                            module_var = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                    .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                                if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                {
                                  final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != d_link )
                                  {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const43$isa ) ),
                                        sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != mt_links )
                                    {
                                      SubLObject iteration_state;
                                      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt_$16 ) )
                                        {
                                          final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt_$16, thread );
                                            SubLObject iteration_state_$18;
                                            for( iteration_state_$18 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state_$18 ); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next( iteration_state_$18 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$18 );
                                              final SubLObject link_nodes = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                              {
                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                  final SubLObject sol = link_nodes;
                                                  if( NIL != set.set_p( sol ) )
                                                  {
                                                    final SubLObject set_contents_var = set.do_set_internal( sol );
                                                    SubLObject basis_object;
                                                    SubLObject state_$20;
                                                    SubLObject rule_fort;
                                                    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$20 = NIL, state_$20 = set_contents.do_set_contents_initial_state(
                                                        basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$20 ); state_$20 = set_contents.do_set_contents_update_state(
                                                            state_$20 ) )
                                                    {
                                                      rule_fort = set_contents.do_set_contents_next( basis_object, state_$20 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state_$20, rule_fort ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort,
                                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( rule_fort ) )
                                                        {
                                                          store_one_psp_rule_fort( rule_fort );
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else if( sol.isList() )
                                                  {
                                                    SubLObject csome_list_var = sol;
                                                    SubLObject rule_fort2 = NIL;
                                                    rule_fort2 = csome_list_var.first();
                                                    while ( NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( rule_fort2 ) )
                                                        {
                                                          store_one_psp_rule_fort( rule_fort2 );
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      rule_fort2 = csome_list_var.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str55$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$18 );
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  {
                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                    SubLObject instance_tuple = NIL;
                                    instance_tuple = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      SubLObject current;
                                      final SubLObject datum = current = instance_tuple;
                                      SubLObject link_node = NIL;
                                      SubLObject mt_$17 = NIL;
                                      SubLObject tv2 = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
                                      link_node = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
                                      mt_$17 = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
                                      tv2 = current.first();
                                      current = current.rest();
                                      if( NIL == current )
                                      {
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt_$17 ) )
                                        {
                                          final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt_$17, thread );
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol;
                                                final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject rule_fort;
                                                  SubLObject state_$21;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$21 = NIL, state_$21 = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$21 ); state_$21 = set_contents.do_set_contents_update_state( state_$21 ) )
                                                  {
                                                    rule_fort = set_contents.do_set_contents_next( basis_object, state_$21 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state_$21, rule_fort ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( rule_fort ) )
                                                      {
                                                        store_one_psp_rule_fort( rule_fort );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var_$25 = sol;
                                                  SubLObject rule_fort2 = NIL;
                                                  rule_fort2 = csome_list_var_$25.first();
                                                  while ( NIL != csome_list_var_$25)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( rule_fort2 ) )
                                                      {
                                                        store_one_psp_rule_fort( rule_fort2 );
                                                      }
                                                    }
                                                    csome_list_var_$25 = csome_list_var_$25.rest();
                                                    rule_fort2 = csome_list_var_$25.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str55$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$11, thread );
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$10, thread );
                                          }
                                        }
                                      }
                                      else
                                      {
                                        cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      instance_tuple = csome_list_var2.first();
                                    }
                                  }
                                }
                                else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                {
                                  SubLObject cdolist_list_var_$26;
                                  final SubLObject new_list = cdolist_list_var_$26 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                      .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const43$isa ) ),
                                          sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const43$isa ) ),
                                          sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                  SubLObject generating_fn = NIL;
                                  generating_fn = cdolist_list_var_$26.first();
                                  while ( NIL != cdolist_list_var_$26)
                                  {
                                    final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                      final SubLObject sol2;
                                      final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                      if( NIL != set.set_p( sol2 ) )
                                      {
                                        final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                        SubLObject basis_object2;
                                        SubLObject state_$22;
                                        SubLObject rule_fort3;
                                        for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state_$22 = NIL, state_$22 = set_contents.do_set_contents_initial_state( basis_object2,
                                            set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state_$22 ); state_$22 = set_contents.do_set_contents_update_state( state_$22 ) )
                                        {
                                          rule_fort3 = set_contents.do_set_contents_next( basis_object2, state_$22 );
                                          if( NIL != set_contents.do_set_contents_element_validP( state_$22, rule_fort3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort3,
                                              sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            if( NIL != forts.fort_p( rule_fort3 ) )
                                            {
                                              store_one_psp_rule_fort( rule_fort3 );
                                            }
                                          }
                                        }
                                      }
                                      else if( sol2.isList() )
                                      {
                                        SubLObject csome_list_var3 = sol2;
                                        SubLObject rule_fort4 = NIL;
                                        rule_fort4 = csome_list_var3.first();
                                        while ( NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            if( NIL != forts.fort_p( rule_fort4 ) )
                                            {
                                              store_one_psp_rule_fort( rule_fort4 );
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          rule_fort4 = csome_list_var3.first();
                                        }
                                      }
                                      else
                                      {
                                        Errors.error( $str55$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$12, thread );
                                    }
                                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                    generating_fn = cdolist_list_var_$26.first();
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$7, thread );
                                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                              }
                              cdolist_list_var = cdolist_list_var.rest();
                              module_var = cdolist_list_var.first();
                            }
                            SubLObject cdolist_list_var2;
                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                                $const43$isa ) ) );
                            SubLObject module_var2 = NIL;
                            module_var2 = cdolist_list_var2.first();
                            while ( NIL != cdolist_list_var2)
                            {
                              final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                    .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                final SubLObject node2 = function_terms.naut_to_nart( node_var_$4 );
                                if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                {
                                  final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != d_link2 )
                                  {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != mt_links2 )
                                    {
                                      SubLObject iteration_state2;
                                      for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt_$18 ) )
                                        {
                                          final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt_$18, thread );
                                            SubLObject iteration_state_$19;
                                            for( iteration_state_$19 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state_$19 ); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next( iteration_state_$19 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$19 );
                                              final SubLObject link_nodes4 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                              {
                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                  final SubLObject sol3 = link_nodes4;
                                                  if( NIL != set.set_p( sol3 ) )
                                                  {
                                                    final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                    SubLObject basis_object3;
                                                    SubLObject state_$23;
                                                    SubLObject node_vars_link_node;
                                                    for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state_$23 = NIL, state_$23 = set_contents.do_set_contents_initial_state(
                                                        basis_object3, set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state_$23 ); state_$23 = set_contents.do_set_contents_update_state(
                                                            state_$23 ) )
                                                    {
                                                      node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state_$23 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state_$23, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                          node_vars_link_node, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node, recur_deck );
                                                      }
                                                    }
                                                  }
                                                  else if( sol3.isList() )
                                                  {
                                                    SubLObject csome_list_var4 = sol3;
                                                    SubLObject node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL != csome_list_var4)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node2, recur_deck );
                                                      }
                                                      csome_list_var4 = csome_list_var4.rest();
                                                      node_vars_link_node2 = csome_list_var4.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str55$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$15, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$19 );
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$14, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                }
                                else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                {
                                  SubLObject cdolist_list_var_$27;
                                  final SubLObject new_list2 = cdolist_list_var_$27 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                      .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                          UNPROVIDED ) ) )
                                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                          sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                  SubLObject generating_fn2 = NIL;
                                  generating_fn2 = cdolist_list_var_$27.first();
                                  while ( NIL != cdolist_list_var_$27)
                                  {
                                    final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                      final SubLObject sol4;
                                      final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                      if( NIL != set.set_p( sol4 ) )
                                      {
                                        final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                        SubLObject basis_object4;
                                        SubLObject state_$24;
                                        SubLObject node_vars_link_node3;
                                        for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state_$24 = NIL, state_$24 = set_contents.do_set_contents_initial_state( basis_object4,
                                            set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state_$24 ); state_$24 = set_contents.do_set_contents_update_state( state_$24 ) )
                                        {
                                          node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state_$24 );
                                          if( NIL != set_contents.do_set_contents_element_validP( state_$24, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                              UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node3, recur_deck );
                                          }
                                        }
                                      }
                                      else if( sol4.isList() )
                                      {
                                        SubLObject csome_list_var5 = sol4;
                                        SubLObject node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL != csome_list_var5)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node4, recur_deck );
                                          }
                                          csome_list_var5 = csome_list_var5.rest();
                                          node_vars_link_node4 = csome_list_var5.first();
                                        }
                                      }
                                      else
                                      {
                                        Errors.error( $str55$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$16, thread );
                                    }
                                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                    generating_fn2 = cdolist_list_var_$27.first();
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$8, thread );
                                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$13, thread );
                              }
                              cdolist_list_var2 = cdolist_list_var2.rest();
                              module_var2 = cdolist_list_var2.first();
                            }
                            node_var_$4 = deck.deck_pop( recur_deck );
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$11, thread );
                          sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$6, thread );
                          sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$6, thread );
                        }
                      }
                      else
                      {
                        sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                            UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$10, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$5, thread );
                      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$4, thread );
                    sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$4, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$3, thread );
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return $psp_rules$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3907L)
  public static SubLObject psp_check_initializations()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == set.non_empty_set_p( $psp_rules$.getDynamicValue( thread ) ) )
    {
      initialize_psp_rules( UNPROVIDED );
    }
    return $kw59$INITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 4042L)
  public static SubLObject store_one_psp_rule_fort(final SubLObject rule_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_vars.$psp_rule_lookup_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject v_arity = kb_mapping_utilities.fpred_value( rule_fort, $const60$psRuleArity, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject category = kb_mapping_utilities.fpred_value( rule_fort, $const61$psRuleCategory, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject head = kb_mapping_utilities.fpred_value( rule_fort, $const62$psRuleSyntacticHeadDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject weight = psp_rule_fort_weight_factor( rule_fort, v_arity );
      final SubLObject raw_constraints = kb_mapping_utilities.pred_values( rule_fort, $const63$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject constraints = psp_new_constraints();
      final SubLObject semx = psp_get_semx_for_rule_fort( rule_fort );
      if( NIL == category )
      {
      }
      if( NIL == head )
      {
      }
      if( NIL != raw_constraints )
      {
        SubLObject cdolist_list_var = raw_constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != psp_valid_raw_constraintP( constraint ) )
          {
            SubLObject current;
            final SubLObject datum = current = psp_parse_constraint( constraint );
            SubLObject c_type = NIL;
            SubLObject dtr = NIL;
            SubLObject target = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
            c_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
            dtr = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
            target = current.first();
            current = current.rest();
            if( NIL == current )
            {
              dictionary_utilities.dictionary_push( constraints, dtr, psp_new_constraint( c_type, target ) );
              if( NIL != psp_frame_specific_raw_constraintP( constraint ) )
              {
                dictionary_utilities.dictionary_push( constraints, dtr, psp_frame_constraint_from_raw_constraint( constraint ) );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          constraint = cdolist_list_var.first();
        }
      }
      if( NIL != category && NIL != head && NIL != raw_constraints )
      {
        final SubLObject new_rule = add_psp_rule( rule_fort, v_arity, category, head, constraints, semx, weight );
        psp_add_derivable_rules( new_rule );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return $kw65$STORED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 5549L)
  public static SubLObject psp_valid_raw_constraintP(final SubLObject constraint)
  {
    return makeBoolean( NIL != nart_handles.valid_nartP( constraint, UNPROVIDED ) && NIL != el_utilities.formula_arityE( narts_high.nart_hl_formula( constraint ), TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 5701L)
  public static SubLObject psp_get_semx_for_rule_fort(final SubLObject rule_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type = NIL;
    SubLObject head_dtr_num = NIL;
    SubLObject binding_expressions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym66$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const67$EverythingPSC, thread );
      final SubLObject identity_arg = kb_mapping_utilities.fpred_value( rule_fort, $const68$psRuleSemanticsFromDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != identity_arg )
      {
        type = $kw69$IDENTITY;
        head_dtr_num = identity_arg;
      }
      else
      {
        binding_expressions = psp_binding_expressions_for_rule_fort( rule_fort );
        type = $kw70$TEMPLATE;
        head_dtr_num = kb_mapping_utilities.fpred_value( rule_fort, $const71$psRuleTemplateDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.listS( type, head_dtr_num, binding_expressions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 6373L)
  public static SubLObject psp_binding_expressions_for_rule_fort(final SubLObject rule_fort)
  {
    SubLObject binding_expressions = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( rule_fort, $const76$psRuleTemplateBindings, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject nat = NIL;
    nat = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      binding_expressions = ConsesLow.cons( conses_high.subst( $kw72$INSTANCE, $const73$PSBindingFn, conses_high.subst( $kw74$TYPE, $const75$PSBindingFn_TypeLevel, nat, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ),
          binding_expressions );
      cdolist_list_var = cdolist_list_var.rest();
      nat = cdolist_list_var.first();
    }
    return binding_expressions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 6769L)
  public static SubLObject psp_rule_fort_weight_factor(final SubLObject rule_fort, SubLObject v_arity)
  {
    if( v_arity == UNPROVIDED )
    {
      v_arity = NIL;
    }
    final SubLObject explicit_weight_factor = psp_explicit_weight_factor_for_rule_fort( rule_fort );
    return ( NIL != psp_chart.psp_weight_p( explicit_weight_factor ) ) ? explicit_weight_factor : psp_rule_weight_factor_from_arity( v_arity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7117L)
  public static SubLObject psp_explicit_weight_factor_for_rule_fort(final SubLObject rule_fort)
  {
    return list_utilities.alist_lookup( psp_rule_fort_weights(), rule_fort, Symbols.symbol_function( EQL ), $kw77$NONE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7654L)
  public static SubLObject psp_rule_fort_weights_internal()
  {
    final SubLObject weight_pred = constants_high.find_constant( $str84$psRuleWeight );
    if( NIL != constant_handles.valid_constantP( weight_pred, UNPROVIDED ) )
    {
      final SubLObject raw_alist = ask_utilities.ask_template( $list85, reader.bq_cons( weight_pred, $list86 ), parsing_vars.$psp_rule_lookup_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject adjusted_alist = NIL;
      SubLObject cdolist_list_var = raw_alist;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject rule = NIL;
        SubLObject raw_weight = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
        rule = current.first();
        current = ( raw_weight = current.rest() );
        adjusted_alist = list_utilities.alist_enter( adjusted_alist, rule, parsing_utilities.psp_weight_from_float( raw_weight ), UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      return adjusted_alist;
    }
    return $psp_rule_fort_weights$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7654L)
  public static SubLObject psp_rule_fort_weights()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_rule_fort_weights_internal();
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$PSP_RULE_FORT_WEIGHTS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$PSP_RULE_FORT_WEIGHTS, ZERO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$PSP_RULE_FORT_WEIGHTS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_rule_fort_weights_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8267L)
  public static SubLObject psp_rule_weight_factor_from_arity(final SubLObject rule_arity)
  {
    if( NIL != subl_promotions.positive_integer_p( rule_arity ) && rule_arity.numG( ONE_INTEGER ) )
    {
      final SubLObject extra_dtr_count = number_utilities.f_1_( rule_arity );
      return psp_chart.psp_weight_compose( ConsesLow.make_list( extra_dtr_count, $psp_rule_arity_weight$.getGlobalValue() ) );
    }
    return parsing_vars.$psp_max_weight$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8630L)
  public static SubLObject add_psp_rule(final SubLObject rule_fort, final SubLObject v_arity, final SubLObject category, final SubLObject head, final SubLObject constraints, final SubLObject semx,
      final SubLObject weight)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ( NIL == v_arity || v_arity.eql( ONE_INTEGER ) ) && NIL != psp_category_meets_constraintsP( category, constraints ) )
    {
      return $kw89$INFINITE_RECURSION_RULE;
    }
    final SubLObject new_rule = new_psp_rule( rule_fort, v_arity, category, head, constraints, semx, weight );
    set.set_add( new_rule, $psp_rules$.getDynamicValue( thread ) );
    return new_rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9190L)
  public static SubLObject psp_rule_struct_for_rule_fort(final SubLObject rule_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject set_contents_var = set.do_set_internal( $psp_rules$.getDynamicValue( thread ) );
    SubLObject basis_object;
    SubLObject state;
    SubLObject rule_struct;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == ans && NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      rule_struct = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, rule_struct ) && rule_fort.eql( psp_rule_fort( rule_struct ) ) )
      {
        ans = rule_struct;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9419L)
  public static SubLObject psp_category_meets_constraintsP(final SubLObject category, final SubLObject constraints)
  {
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = psp_constraints_on_dtr( ONE_INTEGER, constraints );
      SubLObject constraint = NIL;
      constraint = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject type = NIL;
        SubLObject target = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
        target = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( type.eql( $const91$ConstituentTypeConstraintFn ) && NIL == psp_constraint_target_includesP( target, category, UNPROVIDED ) )
          {
            failP = T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
        }
        csome_list_var = csome_list_var.rest();
        constraint = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9812L)
  public static SubLObject psp_parse_constraint(final SubLObject constraint)
  {
    SubLObject current;
    final SubLObject datum = current = function_terms.nart_to_naut( constraint );
    SubLObject c_type = NIL;
    SubLObject dtr = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    c_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    dtr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pcase_var = c_type;
      if( pcase_var.eql( $const91$ConstituentTypeConstraintFn ) )
      {
        target = psp_sub_categories( target );
      }
      else if( pcase_var.eql( $const92$POSPredConstraintFn ) )
      {
        target = psp_sub_pos_preds( target, UNPROVIDED );
      }
      return ConsesLow.list( c_type, dtr, target );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10232L)
  public static SubLObject psp_frame_specific_raw_constraintP(final SubLObject constraint)
  {
    SubLObject current;
    final SubLObject datum = current = function_terms.nart_to_naut( constraint );
    SubLObject c_type = NIL;
    SubLObject dtr = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    c_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    dtr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( c_type.eql( $const91$ConstituentTypeConstraintFn ) && NIL != psp_frame_specific_constituent_typeP( target ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10562L)
  public static SubLObject psp_frame_constraint_from_raw_constraint(final SubLObject constraint)
  {
    final SubLObject target = cycl_utilities.nat_arg2( constraint, UNPROVIDED );
    final SubLObject target_frame_type = psp_frame_type_from_constituent_type( target );
    final SubLObject target_set = psp_frame_type_instances( target_frame_type, UNPROVIDED );
    return psp_new_constraint( $kw93$FRAME, target_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10851L)
  public static SubLObject psp_add_derivable_rules(final SubLObject new_rule)
  {
    return $kw94$STUB;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11101L)
  public static SubLObject psp_trace(final SubLObject rule_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( rule_fort ) : rule_fort;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_vars.$psp_rule_lookup_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != isa.isaP( rule_fort, $const42$PhraseStructureRule, UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member( rule_fort, $psp_traced_rules$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols
          .symbol_function( IDENTITY ) ) )
      {
        $psp_traced_rules$.setGlobalValue( ConsesLow.cons( rule_fort, $psp_traced_rules$.getGlobalValue() ) );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return $psp_traced_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11349L)
  public static SubLObject psp_untrace(SubLObject rule_fort)
  {
    if( rule_fort == UNPROVIDED )
    {
      rule_fort = NIL;
    }
    $psp_traced_rules$.setGlobalValue( ( NIL != rule_fort ) ? Sequences.remove( rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL );
    return $psp_traced_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11515L)
  public static SubLObject psp_traced_ruleP(final SubLObject rule_fort)
  {
    return subl_promotions.memberP( rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11611L)
  public static SubLObject psp_trace_report(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject rule_fort = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    rule_fort = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym98$PWHEN, ConsesLow.list( $sym99$PSP_TRACED_RULE_, rule_fort ), ConsesLow.listS( $sym100$DO_PSP_TRACE_REPORT, format_str, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11831L)
  public static SubLObject do_psp_trace_report(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym102$FORMAT, T, format_str, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 12000L)
  public static SubLObject psp_rules_starting_with_edge(final SubLObject edge, SubLObject root_category)
  {
    if( root_category == UNPROVIDED )
    {
      root_category = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rules = NIL;
    final SubLObject edge_left_index = interval_span.interval_span_start( psp_chart.get_psp_edge_span( edge ) );
    final SubLObject set_contents_var = set.do_set_internal( $psp_rules$.getDynamicValue( thread ) );
    SubLObject basis_object;
    SubLObject state;
    SubLObject rule;
    SubLObject dtr1_constraints;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      rule = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, rule ) )
      {
        dtr1_constraints = psp_constraints_on_dtr( ONE_INTEGER, psp_rule_constraints( rule ) );
        if( NIL != psp_rule_could_start_at_indexP( rule, edge_left_index ) && ( NIL == root_category || NIL != psp_valid_constituent_typeP( psp_rule_category( rule ), root_category ) )
            && NIL != psp_edge_meets_syntax_constraintsP( edge, dtr1_constraints, UNPROVIDED, UNPROVIDED ) )
        {
          rules = ConsesLow.cons( rule, rules );
          if( NIL != psp_traced_ruleP( psp_rule_fort( rule ) ) )
          {
            PrintLow.format( T, $str103$___S___meets_the_first_dtr_constr, new SubLObject[] { edge, psp_rule_fort( rule ), psp_chart.get_psp_edge_frame( edge )
            } );
          }
        }
      }
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 12954L)
  public static SubLObject psp_rule_could_start_at_indexP(final SubLObject rule, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject chart_end_index = ( NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue( thread ) ) ? parsing_vars.$psp_chart_end_index$.getDynamicValue( thread )
        : psp_chart.psp_chart_length( parsing_vars.$psp_chart$.getDynamicValue( thread ) );
    final SubLObject known_arity = psp_rule_arity( rule );
    final SubLObject rule_min_arity = ( NIL != known_arity ) ? known_arity : ONE_INTEGER;
    SubLObject minimal_end_index = Numbers.add( index, rule_min_arity );
    if( NIL != psp_chart.psp_gap_allowedP() )
    {
      minimal_end_index = Numbers.subtract( minimal_end_index, ONE_INTEGER );
    }
    return Numbers.numGE( chart_end_index, minimal_end_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 13420L)
  public static SubLObject psp_filter_cycls(final SubLObject dtr_cycls, final SubLObject dtr_num, final SubLObject rule, final SubLObject edge)
  {
    SubLObject filtered_cycls = NIL;
    final SubLObject constraint_table = psp_rule_constraints( rule );
    final SubLObject constraints = list_utilities.remove_if_not( $sym104$PSP_SEMANTIC_CONSTRAINT_, psp_constraints_on_dtr( dtr_num, constraint_table ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = dtr_cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject failP = NIL;
      if( NIL == failP )
      {
        SubLObject csome_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = csome_list_var.first();
        while ( NIL == failP && NIL != csome_list_var)
        {
          constraint = psp_cyclify_targets( constraint, edge );
          failP = psp_cycl_fails_constraintP( cycl, constraint );
          if( NIL != psp_traced_ruleP( psp_chart.psp_edge_rule_fort( edge ) ) )
          {
            PrintLow.format( T, $str105$___S____A_constraint__S___, new SubLObject[] { cycl, ( NIL != failP ) ? $str106$failed : $str107$met, constraint
            } );
          }
          csome_list_var = csome_list_var.rest();
          constraint = csome_list_var.first();
        }
      }
      if( NIL == failP )
      {
        filtered_cycls = ConsesLow.cons( cycl, filtered_cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return filtered_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 14255L)
  public static SubLObject psp_cyclify_targets(SubLObject constraint, final SubLObject edge)
  {
    SubLObject current;
    final SubLObject datum = current = constraint;
    SubLObject type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( target.isInteger() )
      {
        final SubLObject target_dtr = psp_chart.psp_edge_nth_dtr( target, edge );
        final SubLObject target_cycls = psp_semantics.psp_cycls_to_cycls( psp_semantics.psp_semantics_for_edge( target_dtr, UNPROVIDED, UNPROVIDED ) );
        constraint = ConsesLow.list( type, reader.bq_cons( $kw108$LIST, target_cycls ) );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
    }
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 14708L)
  public static SubLObject psp_edge_passes_semantic_constraintsP(final SubLObject edge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_struct = psp_chart.psp_edge_rule_struct( edge );
    final SubLObject constraint_table = psp_rule_constraints( rule_struct );
    final SubLObject dtrs = psp_chart.psp_edge_dtrs( edge );
    SubLObject failP = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( constraint_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject dtr_num = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject constraints = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == failP )
      {
        SubLObject csome_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = csome_list_var.first();
        while ( NIL == failP && NIL != csome_list_var)
        {
          if( NIL != psp_semantic_constraintP( constraint ) && NIL != psp_edge_fails_constraintP( ConsesLow.nth( number_utilities.f_1_( dtr_num ), dtrs ), constraint, dtrs ) )
          {
            failP = T;
          }
          csome_list_var = csome_list_var.rest();
          constraint = csome_list_var.first();
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 15223L)
  public static SubLObject psp_edge_meets_syntax_constraintsP(final SubLObject edge, final SubLObject constraints, SubLObject mother, SubLObject traced_rule_fort)
  {
    if( mother == UNPROVIDED )
    {
      mother = NIL;
    }
    if( traced_rule_fort == UNPROVIDED )
    {
      traced_rule_fort = NIL;
    }
    if( constraints.eql( $kw109$UNKNOWN ) )
    {
      return T;
    }
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = constraints;
      SubLObject constraint = NIL;
      constraint = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL != psp_syntactic_constraintP( constraint ) && NIL != psp_edge_fails_constraintP( edge, constraint, mother ) )
        {
          failP = T;
          if( NIL != traced_rule_fort )
          {
            final SubLObject target = psp_constraint_target( constraint );
            PrintLow.format( T, $str110$___S___failed_constraint__S___S, new SubLObject[] { edge, psp_constraint_type( constraint ), ( NIL != set.set_p( target ) ) ? set.set_element_list( target ) : target
            } );
          }
        }
        csome_list_var = csome_list_var.rest();
        constraint = csome_list_var.first();
      }
    }
    return Types.sublisp_null( failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16092L)
  public static SubLObject psp_syntactic_constraintP(final SubLObject constraint)
  {
    return psp_syntactic_constraint_typeP( psp_constraint_type( constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16305L)
  public static SubLObject clear_psp_syntactic_constraint_types()
  {
    $psp_syntactic_constraint_types$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16422L)
  public static SubLObject psp_syntactic_constraint_typeP(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $psp_syntactic_constraint_types$.getGlobalValue() )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_vars.$psp_rule_lookup_mt$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        $psp_syntactic_constraint_types$.setGlobalValue( ConsesLow.cons( $kw93$FRAME, kb_mapping_utilities.pred_values( $const112$PhraseStructureConstraint_Syntact, $const113$resultIsa, TWO_INTEGER, ONE_INTEGER,
            UNPROVIDED ) ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return subl_promotions.memberP( type, $psp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16774L)
  public static SubLObject psp_semantic_constraintP(final SubLObject constraint)
  {
    return psp_semantic_constraint_typeP( psp_constraint_type( constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16984L)
  public static SubLObject clear_psp_semantic_constraint_types()
  {
    $psp_semantic_constraint_types$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17099L)
  public static SubLObject psp_semantic_constraint_typeP(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $psp_semantic_constraint_types$.getGlobalValue() )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_vars.$psp_rule_lookup_mt$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        $psp_semantic_constraint_types$.setGlobalValue( kb_mapping_utilities.pred_values( $const115$PhraseStructureConstraint_Semanti, $const113$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return subl_promotions.memberP( type, $psp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
  public static SubLObject clear_psp_cycl_fails_constraintP()
  {
    final SubLObject cs = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
  public static SubLObject remove_psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $psp_cycl_fails_constraintP_caching_state$.getGlobalValue(), ConsesLow.list( psp_cycl, constraint ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
  public static SubLObject psp_cycl_fails_constraintP_internal(final SubLObject psp_cycl, final SubLObject constraint)
  {
    SubLObject cycl = psp_semantics.psp_cycl_cycl( psp_cycl );
    SubLObject failP = T;
    SubLObject c_type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint, constraint, $list117 );
    c_type = constraint.first();
    SubLObject current = constraint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list117 );
    target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( target.isList() && target.first() == $kw108$LIST )
      {
        SubLObject succeedP = NIL;
        if( NIL == succeedP )
        {
          SubLObject csome_list_var = target.rest();
          SubLObject item = NIL;
          item = csome_list_var.first();
          while ( NIL == succeedP && NIL != csome_list_var)
          {
            if( NIL == psp_cycl_fails_constraintP( cycl, ConsesLow.list( c_type, item ) ) )
            {
              succeedP = T;
            }
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
          }
        }
        failP = makeBoolean( NIL == succeedP );
      }
      else
      {
        cycl = parsing_utilities.strip_nl_tags( cycl, UNPROVIDED );
        target = parsing_utilities.strip_nl_tags( target, UNPROVIDED );
        final SubLObject pcase_var = c_type;
        if( pcase_var.eql( $const118$PSRuleIsaConstraintFn ) )
        {
          failP = makeBoolean( NIL == psp_isaP( cycl, target ) );
        }
        else if( pcase_var.eql( $const119$PSRuleGenlsConstraintFn ) )
        {
          failP = makeBoolean( NIL == psp_genlP( cycl, target ) );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint, $list117 );
    }
    return failP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
  public static SubLObject psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint)
  {
    SubLObject caching_state = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym116$PSP_CYCL_FAILS_CONSTRAINT_, $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int121$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( psp_cycl, constraint );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( psp_cycl.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && constraint.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_cycl_fails_constraintP_internal( psp_cycl, constraint ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( psp_cycl, constraint ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 18222L)
  public static SubLObject psp_edge_fails_constraintP(final SubLObject edge, final SubLObject constraint, final SubLObject mother)
  {
    final SubLObject edge_is_gapP = Equality.eq( edge, $kw122$GAP );
    if( NIL != edge_is_gapP && NIL == psp_chart.psp_gap_allowedP() )
    {
      return T;
    }
    SubLObject c_type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint, constraint, $list117 );
    c_type = constraint.first();
    SubLObject current = constraint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list117 );
    target = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint, $list117 );
      return NIL;
    }
    final SubLObject pcase_var = c_type;
    if( pcase_var.eql( $const91$ConstituentTypeConstraintFn ) )
    {
      if( NIL != psp_lexeme_constraintP( target ) )
      {
        return psp_edge_fails_lexeme_constraintP( edge, target );
      }
      final SubLObject edge_cat = ( NIL != edge_is_gapP ) ? psp_chart.psp_allowed_gap_category() : psp_chart.get_psp_edge_category( edge );
      if( NIL != psp_chart.psp_pp_gap_allowedP() && NIL != psp_constraint_target_includesP( target, $const123$PrepositionalPhrase, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL != psp_constraint_target_includesP( target, edge_cat, UNPROVIDED ) )
      {
        return NIL;
      }
      return T;
    }
    else
    {
      if( pcase_var.eql( $const124$DetNbarAgrConstraintFn ) )
      {
        return makeBoolean( NIL != edge_is_gapP || NIL == psp_det_nbar_agreeP( edge, target, mother ) );
      }
      if( pcase_var.eql( $const92$POSPredConstraintFn ) )
      {
        final SubLObject failsP = makeBoolean( NIL == edge_is_gapP && NIL == psp_constraint_target_includesP( target, psp_chart.get_psp_edge_pos_pred( edge ), UNPROVIDED ) );
        return failsP;
      }
      if( !pcase_var.eql( $kw93$FRAME ) )
      {
        return T;
      }
      if( NIL != edge_is_gapP )
      {
        return NIL;
      }
      final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr( edge );
      final SubLObject edge_frame = ( NIL != lexical_head_dtr ) ? psp_chart.get_psp_edge_frame( lexical_head_dtr ) : NIL;
      return makeBoolean( NIL == psp_constraint_target_includesP( target, edge_frame, UNPROVIDED ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
  public static SubLObject clear_psp_phrase_types()
  {
    final SubLObject cs = $psp_phrase_types_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
  public static SubLObject remove_psp_phrase_types(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_phrase_types_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
  public static SubLObject psp_phrase_types_internal(final SubLObject mt)
  {
    return genls.all_specs( $const126$NLPhrase, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
  public static SubLObject psp_phrase_types(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    SubLObject caching_state = $psp_phrase_types_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym125$PSP_PHRASE_TYPES, $sym127$_PSP_PHRASE_TYPES_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_phrase_types_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19702L)
  public static SubLObject psp_constraints_require_phraseP_internal(final SubLObject constraints)
  {
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var = constraints;
      SubLObject constraint = NIL;
      constraint = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject c_type = NIL;
        SubLObject target = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
        c_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
        target = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( c_type.eql( $const91$ConstituentTypeConstraintFn ) && NIL == ans )
          {
            SubLObject csome_list_var_$42;
            SubLObject phrase_type;
            for( csome_list_var_$42 = psp_phrase_types( UNPROVIDED ), phrase_type = NIL, phrase_type = csome_list_var_$42.first(); NIL == ans && NIL != csome_list_var_$42; ans = set.set_memberP( phrase_type,
                target ), csome_list_var_$42 = csome_list_var_$42.rest(), phrase_type = csome_list_var_$42.first() )
            {
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list117 );
        }
        csome_list_var = csome_list_var.rest();
        constraint = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19702L)
  public static SubLObject psp_constraints_require_phraseP(final SubLObject constraints)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_constraints_require_phraseP_internal( constraints );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_constraints_require_phraseP_internal( constraints ) ) );
      memoization_state.caching_state_put( caching_state, constraints, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 20072L)
  public static SubLObject psp_edge_fails_lexeme_constraintP(final SubLObject edge, final SubLObject target)
  {
    final SubLObject target_wu = cycl_utilities.nat_arg3( set.set_element_list( target ).first(), UNPROVIDED );
    if( NIL != psp_chart.psp_pp_gap_allowedP() )
    {
      final SubLObject gap_string = psp_chart.psp_pp_gap_string();
      SubLObject csome_list_var = lexicon_accessors.words_of_stringXspeech_part( gap_string, $const129$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject wu = NIL;
      wu = csome_list_var.first();
      while ( NIL != csome_list_var)
      {
        if( wu.equal( target_wu ) )
        {
          return NIL;
        }
        csome_list_var = csome_list_var.rest();
        wu = csome_list_var.first();
      }
      return T;
    }
    if( edge == $kw122$GAP )
    {
      return NIL;
    }
    return makeBoolean( NIL == psp_edge_has_wuP( edge, target_wu ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 20505L)
  public static SubLObject psp_lexeme_constraintP(final SubLObject target)
  {
    SubLObject successP = NIL;
    final SubLObject set_contents_var = set.do_set_internal( target );
    SubLObject basis_object;
    SubLObject state;
    SubLObject target_cycl;
    SubLObject failP;
    SubLObject arg;
    SubLObject arg_$43;
    SubLObject target_arg;
    SubLObject target_arg_$44;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == successP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      target_cycl = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, target_cycl ) && NIL != el_utilities.possibly_naut_p( target_cycl ) )
      {
        failP = NIL;
        if( NIL == failP )
        {
          arg = NIL;
          arg_$43 = NIL;
          target_arg = NIL;
          target_arg_$44 = NIL;
          arg = target_cycl;
          arg_$43 = arg.first();
          target_arg = $list130;
          target_arg_$44 = target_arg.first();
          while ( NIL == failP && ( NIL != target_arg || NIL != arg ))
          {
            if( NIL != target_arg_$44 )
            {
              if( !arg_$43.eql( target_arg_$44 ) )
              {
                failP = T;
              }
            }
            arg = arg.rest();
            arg_$43 = arg.first();
            target_arg = target_arg.rest();
            target_arg_$44 = target_arg.first();
          }
        }
        successP = makeBoolean( NIL == failP );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21065L)
  public static SubLObject psp_frame_specific_constituent_typeP(final SubLObject target_element)
  {
    return makeBoolean( NIL != el_utilities.possibly_nat_p( target_element ) && NIL != conses_high.member( cycl_utilities.nat_functor( target_element ), $list131, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21358L)
  public static SubLObject psp_frame_type_from_constituent_type(final SubLObject constituent_type)
  {
    return cycl_utilities.nat_arg2( constituent_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21468L)
  public static SubLObject psp_constraint_target_includesP(final SubLObject target_set, final SubLObject item, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) )
    {
      return set.set_memberP( item, target_set );
    }
    final SubLObject test_fn = set.set_test( target_set );
    final SubLObject set_contents_var = set.do_set_internal( target_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject target_element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      target_element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, target_element ) && NIL != Functions.funcall( test_fn, item, Functions.funcall( key, target_element ) ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21925L)
  public static SubLObject psp_edge_has_wuP(final SubLObject edge, final SubLObject wu)
  {
    return Equality.eq( psp_chart.get_psp_edge_wu( edge ), wu );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 22009L)
  public static SubLObject psp_det_nbar_agreeP(final SubLObject nbar_edge, final SubLObject target, final SubLObject mother)
  {
    final SubLObject nbar_pos_pred = psp_chart.get_psp_edge_pos_pred( nbar_edge );
    final SubLObject old_dtrs = ( NIL != mother ) ? psp_chart.psp_edge_dtrs( mother ) : NIL;
    final SubLObject detp_edge = ConsesLow.nth( number_utilities.f_1_( target ), old_dtrs );
    final SubLObject det_edge = psp_chart.psp_edge_lexical_head_dtr( detp_edge );
    final SubLObject det_string = psp_chart.get_psp_edge_string( det_edge );
    SubLObject ok_preds = lexicon_accessors.agr_of_det_string( det_string );
    if( NIL != lexicon_vars.name_string_predP( nbar_pos_pred ) )
    {
      SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge( nbar_edge, UNPROVIDED, UNPROVIDED );
      SubLObject denot = NIL;
      denot = csome_list_var.first();
      while ( NIL != csome_list_var)
      {
        if( NIL != rbp_wff.npp_collectionP( parsing_utilities.strip_nl_tags( denot, UNPROVIDED ) ) )
        {
          return T;
        }
        csome_list_var = csome_list_var.rest();
        denot = csome_list_var.first();
      }
      return NIL;
    }
    if( NIL == ok_preds )
    {
      if( NIL != psp_semantics.psp_genl_posP( psp_chart.get_psp_edge_category( det_edge ), $const132$Number_SP, UNPROVIDED ) )
      {
        final SubLObject denots = psp_semantics.psp_semantics_for_edge( det_edge, UNPROVIDED, UNPROVIDED );
        if( NIL == ok_preds )
        {
          SubLObject csome_list_var2 = denots;
          SubLObject denot2 = NIL;
          denot2 = csome_list_var2.first();
          while ( NIL == ok_preds && NIL != csome_list_var2)
          {
            final SubLObject denot_cycl = psp_semantics.psp_cycl_cycl( denot2 );
            if( NIL != parsing_utilities.determiner_number_denotP( denot_cycl ) )
            {
              ok_preds = parsing_utilities.agr_preds_for_number( denot_cycl );
            }
            csome_list_var2 = csome_list_var2.rest();
            denot2 = csome_list_var2.first();
          }
        }
      }
      else
      {
        ok_preds = $list133;
      }
    }
    return makeBoolean( NIL != forts.fort_p( nbar_pos_pred ) && NIL != conses_high.member( nbar_pos_pred, ok_preds, $sym134$GENL_POS_PRED_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23359L)
  public static SubLObject psp_valid_constituent_typeP(final SubLObject type, final SubLObject target)
  {
    return set.set_memberP( psp_rewrite( type ), psp_sub_categories( target ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
  public static SubLObject clear_psp_sub_categories()
  {
    final SubLObject cs = $psp_sub_categories_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
  public static SubLObject remove_psp_sub_categories(final SubLObject target)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $psp_sub_categories_caching_state$.getGlobalValue(), ConsesLow.list( target ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
  public static SubLObject psp_sub_categories_internal(final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject core_type = psp_simplify_if_frame_specific_type( target );
    final SubLObject category = psp_rewrite( core_type );
    final SubLObject ans = set.new_set( Symbols.symbol_function( EQUAL ), $int136$32 );
    if( NIL != forts.fort_p( category ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym66$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const67$EverythingPSC, thread );
        SubLObject cdolist_list_var = genls.all_specs( category, UNPROVIDED, UNPROVIDED );
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          spec = psp_simplify_if_frame_specific_type( spec );
          set.set_add( spec, ans );
          if( NIL != nart_handles.nart_p( spec ) )
          {
            set.set_add( function_terms.nart_to_naut( spec ), ans );
          }
          cdolist_list_var = cdolist_list_var.rest();
          spec = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    set.set_add( target, ans );
    if( NIL != el_utilities.possibly_naut_p( core_type ) )
    {
      final SubLObject nart = function_terms.naut_to_nart( core_type );
      if( NIL != nart_handles.nart_p( nart ) )
      {
        set.set_add( nart, ans );
      }
    }
    if( NIL != el_utilities.possibly_naut_p( target ) )
    {
      final SubLObject nart = function_terms.naut_to_nart( target );
      if( NIL != nart_handles.nart_p( nart ) )
      {
        set.set_add( nart, ans );
      }
    }
    if( NIL != nart_handles.nart_p( target ) )
    {
      set.set_add( function_terms.nart_to_naut( target ), ans );
    }
    set.set_add( core_type, ans );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
  public static SubLObject psp_sub_categories(final SubLObject target)
  {
    SubLObject caching_state = $psp_sub_categories_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym135$PSP_SUB_CATEGORIES, $sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, $int39$128 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, target, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_sub_categories_internal( target ) ) );
      memoization_state.caching_state_put( caching_state, target, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24398L)
  public static SubLObject psp_simplify_if_frame_specific_type(final SubLObject type)
  {
    return ( NIL != psp_frame_specific_constituent_typeP( type ) ) ? cycl_utilities.nat_arg1( type, UNPROVIDED ) : type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
  public static SubLObject clear_psp_sub_pos_preds()
  {
    final SubLObject cs = $psp_sub_pos_preds_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
  public static SubLObject remove_psp_sub_pos_preds(final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_sub_pos_preds_caching_state$.getGlobalValue(), ConsesLow.list( target, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
  public static SubLObject psp_sub_pos_preds_internal(final SubLObject target, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = set.new_set( Symbols.symbol_function( EQ ), $int139$64 );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = genl_predicates.all_spec_predicates( target, UNPROVIDED, UNPROVIDED );
      SubLObject spec_pred = NIL;
      spec_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set.set_add( spec_pred, ans );
        cdolist_list_var = cdolist_list_var.rest();
        spec_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
  public static SubLObject psp_sub_pos_preds(final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    SubLObject caching_state = $psp_sub_pos_preds_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym138$PSP_SUB_POS_PREDS, $sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int39$128 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( target, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( target.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_sub_pos_preds_internal( target, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( target, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
  public static SubLObject clear_psp_frame_type_instances()
  {
    final SubLObject cs = $psp_frame_type_instances_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
  public static SubLObject remove_psp_frame_type_instances(final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $psp_frame_type_instances_caching_state$.getGlobalValue(), ConsesLow.list( target, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
  public static SubLObject psp_frame_type_instances_internal(final SubLObject target, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = set.new_set( Symbols.symbol_function( EQUAL ), $int139$64 );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = isa.all_fort_instances( target, UNPROVIDED, UNPROVIDED );
      SubLObject frame = NIL;
      frame = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set.set_add( frame, ans );
        cdolist_list_var = cdolist_list_var.rest();
        frame = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
  public static SubLObject psp_frame_type_instances(final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = parsing_utilities.psp_lexicon_root_mt( UNPROVIDED );
    }
    SubLObject caching_state = $psp_frame_type_instances_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym141$PSP_FRAME_TYPE_INSTANCES, $sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int39$128 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( target, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( target.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_frame_type_instances_internal( target, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( target, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
  public static SubLObject clear_psp_rewrite()
  {
    final SubLObject cs = $psp_rewrite_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
  public static SubLObject remove_psp_rewrite(final SubLObject obj)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $psp_rewrite_caching_state$.getGlobalValue(), ConsesLow.list( obj ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
  public static SubLObject psp_rewrite_internal(SubLObject obj)
  {
    if( NIL != term.nautP( obj, UNPROVIDED ) )
    {
      final SubLObject nart = narts_high.find_nart( obj );
      obj = ( ( NIL != nart ) ? nart : obj );
    }
    if( NIL == nart_handles.nart_p( obj ) )
    {
      return obj;
    }
    final SubLObject rewrite = kb_mapping_utilities.fpred_value_in_any_mt( obj, $const144$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    return ( NIL != rewrite ) ? rewrite : obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
  public static SubLObject psp_rewrite(final SubLObject obj)
  {
    SubLObject caching_state = $psp_rewrite_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym143$PSP_REWRITE, $sym145$_PSP_REWRITE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, $int121$256 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( psp_rewrite_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25582L)
  public static SubLObject psp_isaP_internal(final SubLObject obj, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym66$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const67$EverythingPSC, thread );
      ans = at_defns.quick_quiet_has_typeP( parsing_utilities.strip_nl_tags( obj, UNPROVIDED ), col, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25582L)
  public static SubLObject psp_isaP(final SubLObject obj, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_isaP_internal( obj, col );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym146$PSP_ISA_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym146$PSP_ISA_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym146$PSP_ISA_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( obj, col );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( obj.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && col.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_isaP_internal( obj, col ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( obj, col ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25785L)
  public static SubLObject psp_genlP_internal(final SubLObject type1, final SubLObject type2)
  {
    return rbp_wff.npp_genlP( type1, type2, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25785L)
  public static SubLObject psp_genlP(final SubLObject type1, final SubLObject type2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return psp_genlP_internal( type1, type2 );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym147$PSP_GENL_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym147$PSP_GENL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym147$PSP_GENL_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( type1, type2 );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( type1.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && type2.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( psp_genlP_internal( type1, type2 ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( type1, type2 ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25877L)
  public static SubLObject psp_rule_new_dtr_constraints(final SubLObject rule, final SubLObject frame)
  {
    if( NIL != psp_rule_arity( rule ) )
    {
      SubLObject new_dtr_constraint_stack = NIL;
      SubLObject cdotimes_end_var;
      SubLObject n;
      for( cdotimes_end_var = psp_rule_arity( rule ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
      {
        if( !n.isZero() )
        {
          new_dtr_constraint_stack = ConsesLow.cons( psp_constraints_on_dtr( number_utilities.f_1X( n ), psp_rule_constraints( rule ) ), new_dtr_constraint_stack );
        }
      }
      return Sequences.reverse( new_dtr_constraint_stack );
    }
    return ( NIL != frame ) ? psp_new_dtr_constraints_from_frame( frame ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 26607L)
  public static SubLObject psp_new_dtr_constraints_from_frame(final SubLObject frame)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( frame == $kw109$UNKNOWN )
    {
      return $kw109$UNKNOWN;
    }
    final SubLObject active_frame = ( NIL != psp_chart.psp_passive_frameP( frame ) ) ? psp_chart.psp_active_frame( frame ) : frame;
    SubLObject ndc_stack = NIL;
    final SubLObject v_arity = lexicon_accessors.subcat_frame_arity( active_frame );
    SubLObject ndc_alist = NIL;
    if( v_arity.isInteger() )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_utilities.psp_lexicon_root_mt( UNPROVIDED ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject cdolist_list_var;
        final SubLObject constraints = cdolist_list_var = psp_constraints_for_frame( active_frame );
        SubLObject active_constraint = NIL;
        active_constraint = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = active_constraint;
          SubLObject n = NIL;
          SubLObject target = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
          n = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
          target = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject constraint = NIL;
            SubLObject existing = conses_high.assoc( n, ndc_alist, UNPROVIDED, UNPROVIDED );
            if( NIL != lexicon_accessors.speech_part_predP( target, UNPROVIDED ) )
            {
              constraint = psp_new_constraint( $const92$POSPredConstraintFn, psp_sub_pos_preds( target, UNPROVIDED ) );
            }
            else
            {
              constraint = psp_new_constraint( $const91$ConstituentTypeConstraintFn, psp_sub_categories( target ) );
            }
            ndc_alist = Sequences.delete( existing, ndc_alist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != existing )
            {
              if( NIL == subl_promotions.memberP( constraint, existing.rest(), $sym149$PSP_SPEC_CONST_CONSTRAINT_, UNPROVIDED ) )
              {
                ConsesLow.rplacd( existing, ConsesLow.cons( constraint, existing.rest() ) );
              }
            }
            else
            {
              existing = ConsesLow.cons( n, ConsesLow.list( constraint ) );
            }
            ndc_alist = ConsesLow.cons( existing, ndc_alist );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list148 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          active_constraint = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      SubLObject n2;
      for( n2 = NIL, n2 = ZERO_INTEGER; n2.numL( v_arity ); n2 = Numbers.add( n2, ONE_INTEGER ) )
      {
        if( NIL == psp_passivized_dtrP( n2, frame ) )
        {
          ndc_stack = ConsesLow.cons( conses_high.assoc( number_utilities.f_1X( n2 ), ndc_alist, UNPROVIDED, UNPROVIDED ).rest(), ndc_stack );
        }
      }
    }
    if( NIL != psp_chart.psp_passive_frameP( frame ) && frame.first() == $kw150$PASSIVE_WITH_BY )
    {
      ndc_stack = psp_add_by_phrase_constraints( ndc_stack );
    }
    return Sequences.reverse( ndc_stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28120L)
  public static SubLObject psp_add_by_phrase_constraints(SubLObject stack)
  {
    stack = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const91$ConstituentTypeConstraintFn, psp_sub_categories( $list151 ) ) ), stack );
    stack = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const91$ConstituentTypeConstraintFn, psp_sub_categories( $const152$NounPhrase ) ) ), stack );
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28444L)
  public static SubLObject psp_passivized_dtrP(final SubLObject n, final SubLObject frame)
  {
    if( !n.isInteger() || !n.numL( TWO_INTEGER ) || NIL == psp_chart.psp_passive_frameP( frame ) )
    {
      return NIL;
    }
    final SubLObject active_frame = psp_chart.psp_active_frame( frame );
    final SubLObject dtr_num = psp_chart.psp_passivized_dtr_num( active_frame, UNPROVIDED );
    return dtr_num.isInteger() ? Numbers.numE( n, Numbers.subtract( dtr_num, TWO_INTEGER ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28911L)
  public static SubLObject psp_constraints_for_frame(final SubLObject frame)
  {
    SubLObject pairs = kb_mapping_utilities.pred_value_tuples( frame, $const153$subcatFrameDependentConstraint, ONE_INTEGER, $list154, UNPROVIDED );
    if( NIL != nart_handles.nart_p( frame ) && cycl_utilities.nat_function( frame ).eql( $const155$PPCompFrameFn ) )
    {
      final SubLObject wu = cycl_utilities.nat_arg2( frame, UNPROVIDED );
      final SubLObject pcase_var = cycl_utilities.nat_arg1( frame, UNPROVIDED );
      if( pcase_var.eql( $const156$TransitivePPFrameType ) )
      {
        pairs = ConsesLow.cons( ConsesLow.list( ONE_INTEGER, ConsesLow.list( $const157$SubcollectionOfWithRelationToFn, $const158$NLWordForm, $const159$lexemeOfWordForm, wu ) ), pairs );
      }
      else if( pcase_var.eql( $const160$DitransitivePPFrameType ) )
      {
        pairs = ConsesLow.cons( ConsesLow.list( TWO_INTEGER, ConsesLow.list( $const157$SubcollectionOfWithRelationToFn, $const158$NLWordForm, $const159$lexemeOfWordForm, wu ) ), pairs );
      }
    }
    return pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 29568L)
  public static SubLObject psp_spec_const_constraintP(final SubLObject c1, final SubLObject c2)
  {
    SubLObject c1_type = NIL;
    SubLObject c1_target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( c1, c1, $list161 );
    c1_type = c1.first();
    SubLObject current = c1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, c1, $list161 );
    c1_target = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject c2_type = NIL;
      SubLObject c2_target = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( c2, c2, $list162 );
      c2_type = c2.first();
      SubLObject current_$46 = c2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$46, c2, $list162 );
      c2_target = current_$46.first();
      current_$46 = current_$46.rest();
      if( NIL == current_$46 )
      {
        return makeBoolean( c1_type.eql( c2_type ) && NIL != set_utilities.set_subsetP( c1_target, c2_target ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( c2, $list162 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( c1, $list161 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 29851L)
  public static SubLObject psp_find_dtr_frame_type(final SubLObject rule, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject frame_type = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( parsing_vars.$psp_rule_lookup_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject rule_fort = psp_rule_fort( rule );
      final SubLObject raw_constraints = kb_mapping_utilities.pred_values( rule_fort, $const63$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == frame_type )
      {
        SubLObject csome_list_var = raw_constraints;
        SubLObject constraint = NIL;
        constraint = csome_list_var.first();
        while ( NIL == frame_type && NIL != csome_list_var)
        {
          if( cycl_utilities.nat_arg1( constraint, UNPROVIDED ).eql( n ) && NIL != psp_frame_specific_raw_constraintP( constraint ) )
          {
            frame_type = psp_frame_type_from_constituent_type( cycl_utilities.nat_arg2( constraint, UNPROVIDED ) );
          }
          csome_list_var = csome_list_var.rest();
          constraint = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return frame_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 35782L)
  public static SubLObject psp_parse_tree_for_edge(final SubLObject edge)
  {
    if( NIL != psp_chart.psp_phrasal_edgeP( edge ) )
    {
      return ConsesLow.cons( psp_chart.psp_edge_rule_fort( edge ), Mapping.mapcar( $sym163$PSP_PARSE_TREE_FOR_EDGE, psp_chart.psp_edge_dtrs( edge ) ) );
    }
    return ConsesLow.list( psp_chart.get_psp_edge_category( edge ), psp_chart.get_psp_edge_string( edge ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 36162L)
  public static SubLObject clear_psp_rules_caches()
  {
    clear_psp_cycl_fails_constraintP();
    clear_psp_sub_categories();
    clear_psp_sub_pos_preds();
    clear_psp_phrase_types();
    clear_psp_rewrite();
    clear_psp_syntactic_constraint_types();
    clear_psp_semantic_constraint_types();
    return NIL;
  }

  public static SubLObject declare_psp_rules_file()
  {
    SubLFiles.declareFunction( me, "phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false );
    new $phrase_structure_parser_rule_p$UnaryFunction();
    SubLFiles.declareFunction( me, "psp_rule_fort", "PSP-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_head", "PSP-RULE-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_phrase_structure_parser_rule", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_phrase_structure_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_psp_rule", "NEW-PSP-RULE", 0, 7, false );
    SubLFiles.declareFunction( me, "psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false );
    SubLFiles.declareMacro( me, "psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT" );
    SubLFiles.declareFunction( me, "psp_rules", "PSP-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false );
    SubLFiles.declareFunction( me, "psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "add_psp_rule", "ADD-PSP-RULE", 7, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_trace", "PSP-TRACE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_untrace", "PSP-UNTRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false );
    SubLFiles.declareMacro( me, "psp_trace_report", "PSP-TRACE-REPORT" );
    SubLFiles.declareMacro( me, "do_psp_trace_report", "DO-PSP-TRACE-REPORT" );
    SubLFiles.declareFunction( me, "psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false );
    SubLFiles.declareFunction( me, "psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false );
    SubLFiles.declareFunction( me, "psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false );
    SubLFiles.declareFunction( me, "psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false );
    SubLFiles.declareFunction( me, "psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false );
    SubLFiles.declareFunction( me, "psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_rewrite", "PSP-REWRITE", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_isaP", "PSP-ISA?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_genlP", "PSP-GENL?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_psp_rules_file()
  {
    $dtp_phrase_structure_parser_rule$ = SubLFiles.defconstant( "*DTP-PHRASE-STRUCTURE-PARSER-RULE*", $sym0$PHRASE_STRUCTURE_PARSER_RULE );
    $psp_rules$ = SubLFiles.defparameter( "*PSP-RULES*", set.new_set( Symbols.symbol_function( EQUALP ), $int39$128 ) );
    $psp_rule_fort_weights$ = SubLFiles.deflexical( "*PSP-RULE-FORT-WEIGHTS*", ConsesLow.list( reader.bq_cons( $const78$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float( $float79$0_5 ) ), reader.bq_cons(
        $const80$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float( $float79$0_5 ) ), reader.bq_cons( $const81$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float( $float79$0_5 ) ),
        reader.bq_cons( $const82$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float( $float79$0_5 ) ) ) );
    $psp_rule_arity_weight$ = SubLFiles.defconstant( "*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float( $float88$0_95 ) );
    $psp_traced_rules$ = SubLFiles.deflexical( "*PSP-TRACED-RULES*", ( maybeDefault( $sym95$_PSP_TRACED_RULES_, $psp_traced_rules$, NIL ) ) );
    $psp_syntactic_constraint_types$ = SubLFiles.deflexical( "*PSP-SYNTACTIC-CONSTRAINT-TYPES*", ( maybeDefault( $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_, $psp_syntactic_constraint_types$, NIL ) ) );
    $psp_semantic_constraint_types$ = SubLFiles.deflexical( "*PSP-SEMANTIC-CONSTRAINT-TYPES*", ( maybeDefault( $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_, $psp_semantic_constraint_types$, NIL ) ) );
    $psp_cycl_fails_constraintP_caching_state$ = SubLFiles.deflexical( "*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", NIL );
    $psp_phrase_types_caching_state$ = SubLFiles.deflexical( "*PSP-PHRASE-TYPES-CACHING-STATE*", NIL );
    $psp_sub_categories_caching_state$ = SubLFiles.deflexical( "*PSP-SUB-CATEGORIES-CACHING-STATE*", NIL );
    $psp_sub_pos_preds_caching_state$ = SubLFiles.deflexical( "*PSP-SUB-POS-PREDS-CACHING-STATE*", NIL );
    $psp_frame_type_instances_caching_state$ = SubLFiles.deflexical( "*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", NIL );
    $psp_rewrite_caching_state$ = SubLFiles.deflexical( "*PSP-REWRITE-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_psp_rules_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), Symbols.symbol_function(
        $sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$PSP_RULE_FORT, $sym10$_CSETF_PSP_RULE_FORT );
    Structures.def_csetf( $sym11$PSP_RULE_ARITY, $sym12$_CSETF_PSP_RULE_ARITY );
    Structures.def_csetf( $sym13$PSP_RULE_CATEGORY, $sym14$_CSETF_PSP_RULE_CATEGORY );
    Structures.def_csetf( $sym15$PSP_RULE_HEAD, $sym16$_CSETF_PSP_RULE_HEAD );
    Structures.def_csetf( $sym17$PSP_RULE_CONSTRAINTS, $sym18$_CSETF_PSP_RULE_CONSTRAINTS );
    Structures.def_csetf( $sym19$PSP_RULE_SEMX, $sym20$_CSETF_PSP_RULE_SEMX );
    Structures.def_csetf( $sym21$PSP_RULE_WEIGHT, $sym22$_CSETF_PSP_RULE_WEIGHT );
    Equality.identity( $sym0$PHRASE_STRUCTURE_PARSER_RULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), Symbols.symbol_function(
        $sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD ) );
    utilities_macros.register_kb_function( $sym40$ADD_PHRASE_STRUCTURE_RULE );
    utilities_macros.register_kb_function( $sym41$REMOVE_PHRASE_STRUCTURE_RULE );
    memoization_state.note_memoized_function( $sym83$PSP_RULE_FORT_WEIGHTS );
    subl_macro_promotions.declare_defglobal( $sym95$_PSP_TRACED_RULES_ );
    subl_macro_promotions.declare_defglobal( $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_ );
    subl_macro_promotions.declare_defglobal( $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_ );
    memoization_state.note_globally_cached_function( $sym116$PSP_CYCL_FAILS_CONSTRAINT_ );
    memoization_state.note_globally_cached_function( $sym125$PSP_PHRASE_TYPES );
    memoization_state.note_memoized_function( $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_ );
    memoization_state.note_globally_cached_function( $sym135$PSP_SUB_CATEGORIES );
    memoization_state.note_globally_cached_function( $sym138$PSP_SUB_POS_PREDS );
    memoization_state.note_globally_cached_function( $sym141$PSP_FRAME_TYPE_INSTANCES );
    memoization_state.note_globally_cached_function( $sym143$PSP_REWRITE );
    memoization_state.note_memoized_function( $sym146$PSP_ISA_ );
    memoization_state.note_memoized_function( $sym147$PSP_GENL_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_psp_rules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_psp_rules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_psp_rules_file();
  }
  static
  {
    me = new psp_rules();
    $dtp_phrase_structure_parser_rule$ = null;
    $psp_rules$ = null;
    $psp_rule_fort_weights$ = null;
    $psp_rule_arity_weight$ = null;
    $psp_traced_rules$ = null;
    $psp_syntactic_constraint_types$ = null;
    $psp_semantic_constraint_types$ = null;
    $psp_cycl_fails_constraintP_caching_state$ = null;
    $psp_phrase_types_caching_state$ = null;
    $psp_sub_categories_caching_state$ = null;
    $psp_sub_pos_preds_caching_state$ = null;
    $psp_frame_type_instances_caching_state$ = null;
    $psp_rewrite_caching_state$ = null;
    $sym0$PHRASE_STRUCTURE_PARSER_RULE = makeSymbol( "PHRASE-STRUCTURE-PARSER-RULE" );
    $sym1$PHRASE_STRUCTURE_PARSER_RULE_P = makeSymbol( "PHRASE-STRUCTURE-PARSER-RULE-P" );
    $list2 = ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "ARITY" ), makeSymbol( "CATEGORY" ), makeSymbol( "HEAD" ), makeSymbol( "CONSTRAINTS" ), makeSymbol( "SEMX" ), makeSymbol( "WEIGHT" ) );
    $list3 = ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "ARITY" ), makeKeyword( "CATEGORY" ), makeKeyword( "HEAD" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "SEMX" ), makeKeyword( "WEIGHT" ) );
    $list4 = ConsesLow.list( makeSymbol( "PSP-RULE-FORT" ), makeSymbol( "PSP-RULE-ARITY" ), makeSymbol( "PSP-RULE-CATEGORY" ), makeSymbol( "PSP-RULE-HEAD" ), makeSymbol( "PSP-RULE-CONSTRAINTS" ), makeSymbol(
        "PSP-RULE-SEMX" ), makeSymbol( "PSP-RULE-WEIGHT" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-PSP-RULE-FORT" ), makeSymbol( "_CSETF-PSP-RULE-ARITY" ), makeSymbol( "_CSETF-PSP-RULE-CATEGORY" ), makeSymbol( "_CSETF-PSP-RULE-HEAD" ), makeSymbol(
        "_CSETF-PSP-RULE-CONSTRAINTS" ), makeSymbol( "_CSETF-PSP-RULE-SEMX" ), makeSymbol( "_CSETF-PSP-RULE-WEIGHT" ) );
    $sym6$PPRINT_PSP_RULE = makeSymbol( "PPRINT-PSP-RULE" );
    $sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PHRASE-STRUCTURE-PARSER-RULE-P" ) );
    $sym9$PSP_RULE_FORT = makeSymbol( "PSP-RULE-FORT" );
    $sym10$_CSETF_PSP_RULE_FORT = makeSymbol( "_CSETF-PSP-RULE-FORT" );
    $sym11$PSP_RULE_ARITY = makeSymbol( "PSP-RULE-ARITY" );
    $sym12$_CSETF_PSP_RULE_ARITY = makeSymbol( "_CSETF-PSP-RULE-ARITY" );
    $sym13$PSP_RULE_CATEGORY = makeSymbol( "PSP-RULE-CATEGORY" );
    $sym14$_CSETF_PSP_RULE_CATEGORY = makeSymbol( "_CSETF-PSP-RULE-CATEGORY" );
    $sym15$PSP_RULE_HEAD = makeSymbol( "PSP-RULE-HEAD" );
    $sym16$_CSETF_PSP_RULE_HEAD = makeSymbol( "_CSETF-PSP-RULE-HEAD" );
    $sym17$PSP_RULE_CONSTRAINTS = makeSymbol( "PSP-RULE-CONSTRAINTS" );
    $sym18$_CSETF_PSP_RULE_CONSTRAINTS = makeSymbol( "_CSETF-PSP-RULE-CONSTRAINTS" );
    $sym19$PSP_RULE_SEMX = makeSymbol( "PSP-RULE-SEMX" );
    $sym20$_CSETF_PSP_RULE_SEMX = makeSymbol( "_CSETF-PSP-RULE-SEMX" );
    $sym21$PSP_RULE_WEIGHT = makeSymbol( "PSP-RULE-WEIGHT" );
    $sym22$_CSETF_PSP_RULE_WEIGHT = makeSymbol( "_CSETF-PSP-RULE-WEIGHT" );
    $kw23$FORT = makeKeyword( "FORT" );
    $kw24$ARITY = makeKeyword( "ARITY" );
    $kw25$CATEGORY = makeKeyword( "CATEGORY" );
    $kw26$HEAD = makeKeyword( "HEAD" );
    $kw27$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw28$SEMX = makeKeyword( "SEMX" );
    $kw29$WEIGHT = makeKeyword( "WEIGHT" );
    $str30$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw31$BEGIN = makeKeyword( "BEGIN" );
    $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE = makeSymbol( "MAKE-PHRASE-STRUCTURE-PARSER-RULE" );
    $kw33$SLOT = makeKeyword( "SLOT" );
    $kw34$END = makeKeyword( "END" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD" );
    $str36$__PSP_RULE___S_ = makeString( "#<PSP-RULE: ~S>" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TARGET" ) ), makeSymbol( "CONSTRAINT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $int39$128 = makeInteger( 128 );
    $sym40$ADD_PHRASE_STRUCTURE_RULE = makeSymbol( "ADD-PHRASE-STRUCTURE-RULE" );
    $sym41$REMOVE_PHRASE_STRUCTURE_RULE = makeSymbol( "REMOVE-PHRASE-STRUCTURE-RULE" );
    $const42$PhraseStructureRule = constant_handles.reader_make_constant_shell( makeString( "PhraseStructureRule" ) );
    $const43$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw44$BREADTH = makeKeyword( "BREADTH" );
    $kw45$QUEUE = makeKeyword( "QUEUE" );
    $kw46$STACK = makeKeyword( "STACK" );
    $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw48$ERROR = makeKeyword( "ERROR" );
    $str49$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym50$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw51$CERROR = makeKeyword( "CERROR" );
    $str52$continue_anyway = makeString( "continue anyway" );
    $kw53$WARN = makeKeyword( "WARN" );
    $str54$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str55$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str56$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list57 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str58$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw59$INITIALIZED = makeKeyword( "INITIALIZED" );
    $const60$psRuleArity = constant_handles.reader_make_constant_shell( makeString( "psRuleArity" ) );
    $const61$psRuleCategory = constant_handles.reader_make_constant_shell( makeString( "psRuleCategory" ) );
    $const62$psRuleSyntacticHeadDtr = constant_handles.reader_make_constant_shell( makeString( "psRuleSyntacticHeadDtr" ) );
    $const63$psRuleConstraint = constant_handles.reader_make_constant_shell( makeString( "psRuleConstraint" ) );
    $list64 = ConsesLow.list( makeSymbol( "C-TYPE" ), makeSymbol( "DTR" ), makeSymbol( "TARGET" ) );
    $kw65$STORED = makeKeyword( "STORED" );
    $sym66$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const67$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const68$psRuleSemanticsFromDtr = constant_handles.reader_make_constant_shell( makeString( "psRuleSemanticsFromDtr" ) );
    $kw69$IDENTITY = makeKeyword( "IDENTITY" );
    $kw70$TEMPLATE = makeKeyword( "TEMPLATE" );
    $const71$psRuleTemplateDtr = constant_handles.reader_make_constant_shell( makeString( "psRuleTemplateDtr" ) );
    $kw72$INSTANCE = makeKeyword( "INSTANCE" );
    $const73$PSBindingFn = constant_handles.reader_make_constant_shell( makeString( "PSBindingFn" ) );
    $kw74$TYPE = makeKeyword( "TYPE" );
    $const75$PSBindingFn_TypeLevel = constant_handles.reader_make_constant_shell( makeString( "PSBindingFn-TypeLevel" ) );
    $const76$psRuleTemplateBindings = constant_handles.reader_make_constant_shell( makeString( "psRuleTemplateBindings" ) );
    $kw77$NONE = makeKeyword( "NONE" );
    $const78$PSRule_NounNounCompound = constant_handles.reader_make_constant_shell( makeString( "PSRule-NounNounCompound" ) );
    $float79$0_5 = makeDouble( 0.5 );
    $const80$PSRule_NameNounCompound = constant_handles.reader_make_constant_shell( makeString( "PSRule-NameNounCompound" ) );
    $const81$PSRule_AdjectiveNameCompound = constant_handles.reader_make_constant_shell( makeString( "PSRule-AdjectiveNameCompound" ) );
    $const82$PSRule_NameNameNounCompound = constant_handles.reader_make_constant_shell( makeString( "PSRule-NameNameNounCompound" ) );
    $sym83$PSP_RULE_FORT_WEIGHTS = makeSymbol( "PSP-RULE-FORT-WEIGHTS" );
    $str84$psRuleWeight = makeString( "psRuleWeight" );
    $list85 = ConsesLow.cons( makeSymbol( "?RULE" ), makeSymbol( "?WEIGHT" ) );
    $list86 = ConsesLow.list( makeSymbol( "?RULE" ), makeSymbol( "?WEIGHT" ) );
    $list87 = ConsesLow.cons( makeSymbol( "RULE" ), makeSymbol( "RAW-WEIGHT" ) );
    $float88$0_95 = makeDouble( 0.95 );
    $kw89$INFINITE_RECURSION_RULE = makeKeyword( "INFINITE-RECURSION-RULE" );
    $list90 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TARGET" ) );
    $const91$ConstituentTypeConstraintFn = constant_handles.reader_make_constant_shell( makeString( "ConstituentTypeConstraintFn" ) );
    $const92$POSPredConstraintFn = constant_handles.reader_make_constant_shell( makeString( "POSPredConstraintFn" ) );
    $kw93$FRAME = makeKeyword( "FRAME" );
    $kw94$STUB = makeKeyword( "STUB" );
    $sym95$_PSP_TRACED_RULES_ = makeSymbol( "*PSP-TRACED-RULES*" );
    $sym96$FORT_P = makeSymbol( "FORT-P" );
    $list97 = ConsesLow.list( makeSymbol( "RULE-FORT" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym98$PWHEN = makeSymbol( "PWHEN" );
    $sym99$PSP_TRACED_RULE_ = makeSymbol( "PSP-TRACED-RULE?" );
    $sym100$DO_PSP_TRACE_REPORT = makeSymbol( "DO-PSP-TRACE-REPORT" );
    $list101 = ConsesLow.list( makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym102$FORMAT = makeSymbol( "FORMAT" );
    $str103$___S___meets_the_first_dtr_constr = makeString( "~&~S~% meets the first-dtr constraints of ~S. Frame = ~S" );
    $sym104$PSP_SEMANTIC_CONSTRAINT_ = makeSymbol( "PSP-SEMANTIC-CONSTRAINT?" );
    $str105$___S____A_constraint__S___ = makeString( "~&~S~% ~A constraint ~S.~%" );
    $str106$failed = makeString( "failed" );
    $str107$met = makeString( "met" );
    $kw108$LIST = makeKeyword( "LIST" );
    $kw109$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str110$___S___failed_constraint__S___S = makeString( "~&~S~% failed constraint ~S: ~S" );
    $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_ = makeSymbol( "*PSP-SYNTACTIC-CONSTRAINT-TYPES*" );
    $const112$PhraseStructureConstraint_Syntact = constant_handles.reader_make_constant_shell( makeString( "PhraseStructureConstraint-Syntactic" ) );
    $const113$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_ = makeSymbol( "*PSP-SEMANTIC-CONSTRAINT-TYPES*" );
    $const115$PhraseStructureConstraint_Semanti = constant_handles.reader_make_constant_shell( makeString( "PhraseStructureConstraint-Semantic" ) );
    $sym116$PSP_CYCL_FAILS_CONSTRAINT_ = makeSymbol( "PSP-CYCL-FAILS-CONSTRAINT?" );
    $list117 = ConsesLow.list( makeSymbol( "C-TYPE" ), makeSymbol( "TARGET" ) );
    $const118$PSRuleIsaConstraintFn = constant_handles.reader_make_constant_shell( makeString( "PSRuleIsaConstraintFn" ) );
    $const119$PSRuleGenlsConstraintFn = constant_handles.reader_make_constant_shell( makeString( "PSRuleGenlsConstraintFn" ) );
    $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_ = makeSymbol( "*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*" );
    $int121$256 = makeInteger( 256 );
    $kw122$GAP = makeKeyword( "GAP" );
    $const123$PrepositionalPhrase = constant_handles.reader_make_constant_shell( makeString( "PrepositionalPhrase" ) );
    $const124$DetNbarAgrConstraintFn = constant_handles.reader_make_constant_shell( makeString( "DetNbarAgrConstraintFn" ) );
    $sym125$PSP_PHRASE_TYPES = makeSymbol( "PSP-PHRASE-TYPES" );
    $const126$NLPhrase = constant_handles.reader_make_constant_shell( makeString( "NLPhrase" ) );
    $sym127$_PSP_PHRASE_TYPES_CACHING_STATE_ = makeSymbol( "*PSP-PHRASE-TYPES-CACHING-STATE*" );
    $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_ = makeSymbol( "PSP-CONSTRAINTS-REQUIRE-PHRASE?" );
    $const129$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $list130 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) ), constant_handles
        .reader_make_constant_shell( makeString( "lexemeOfWordForm" ) ) );
    $list131 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLPhraseWithFrameFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLWordFormWithFrameFn" ) ) );
    $const132$Number_SP = constant_handles.reader_make_constant_shell( makeString( "Number-SP" ) );
    $list133 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ) );
    $sym134$GENL_POS_PRED_ = makeSymbol( "GENL-POS-PRED?" );
    $sym135$PSP_SUB_CATEGORIES = makeSymbol( "PSP-SUB-CATEGORIES" );
    $int136$32 = makeInteger( 32 );
    $sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_ = makeSymbol( "*PSP-SUB-CATEGORIES-CACHING-STATE*" );
    $sym138$PSP_SUB_POS_PREDS = makeSymbol( "PSP-SUB-POS-PREDS" );
    $int139$64 = makeInteger( 64 );
    $sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_ = makeSymbol( "*PSP-SUB-POS-PREDS-CACHING-STATE*" );
    $sym141$PSP_FRAME_TYPE_INSTANCES = makeSymbol( "PSP-FRAME-TYPE-INSTANCES" );
    $sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_ = makeSymbol( "*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*" );
    $sym143$PSP_REWRITE = makeSymbol( "PSP-REWRITE" );
    $const144$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $sym145$_PSP_REWRITE_CACHING_STATE_ = makeSymbol( "*PSP-REWRITE-CACHING-STATE*" );
    $sym146$PSP_ISA_ = makeSymbol( "PSP-ISA?" );
    $sym147$PSP_GENL_ = makeSymbol( "PSP-GENL?" );
    $list148 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "TARGET" ) );
    $sym149$PSP_SPEC_CONST_CONSTRAINT_ = makeSymbol( "PSP-SPEC-CONST-CONSTRAINT?" );
    $kw150$PASSIVE_WITH_BY = makeKeyword( "PASSIVE-WITH-BY" );
    $list151 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) ), constant_handles
        .reader_make_constant_shell( makeString( "lexemeOfWordForm" ) ), constant_handles.reader_make_constant_shell( makeString( "By-TheWord" ) ) );
    $const152$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const153$subcatFrameDependentConstraint = constant_handles.reader_make_constant_shell( makeString( "subcatFrameDependentConstraint" ) );
    $list154 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $const155$PPCompFrameFn = constant_handles.reader_make_constant_shell( makeString( "PPCompFrameFn" ) );
    $const156$TransitivePPFrameType = constant_handles.reader_make_constant_shell( makeString( "TransitivePPFrameType" ) );
    $const157$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const158$NLWordForm = constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) );
    $const159$lexemeOfWordForm = constant_handles.reader_make_constant_shell( makeString( "lexemeOfWordForm" ) );
    $const160$DitransitivePPFrameType = constant_handles.reader_make_constant_shell( makeString( "DitransitivePPFrameType" ) );
    $list161 = ConsesLow.list( makeSymbol( "C1-TYPE" ), makeSymbol( "C1-TARGET" ) );
    $list162 = ConsesLow.list( makeSymbol( "C2-TYPE" ), makeSymbol( "C2-TARGET" ) );
    $sym163$PSP_PARSE_TREE_FOR_EDGE = makeSymbol( "PSP-PARSE-TREE-FOR-EDGE" );
  }

  public static final class $phrase_structure_parser_rule_native
      extends
        SubLStructNative
  {
    public SubLObject $fort;
    public SubLObject $arity;
    public SubLObject $category;
    public SubLObject $head;
    public SubLObject $constraints;
    public SubLObject $semx;
    public SubLObject $weight;
    private static final SubLStructDeclNative structDecl;

    public $phrase_structure_parser_rule_native()
    {
      this.$fort = CommonSymbols.NIL;
      this.$arity = CommonSymbols.NIL;
      this.$category = CommonSymbols.NIL;
      this.$head = CommonSymbols.NIL;
      this.$constraints = CommonSymbols.NIL;
      this.$semx = CommonSymbols.NIL;
      this.$weight = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $phrase_structure_parser_rule_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$fort;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$arity;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$category;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$head;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$constraints;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$semx;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$weight;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$fort = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$arity = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$category = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$head = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$constraints = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$semx = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$weight = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $phrase_structure_parser_rule_native.class, $sym0$PHRASE_STRUCTURE_PARSER_RULE, $sym1$PHRASE_STRUCTURE_PARSER_RULE_P, $list2, $list3, new String[] { "$fort", "$arity",
        "$category", "$head", "$constraints", "$semx", "$weight"
      }, $list4, $list5, $sym6$PPRINT_PSP_RULE );
    }
  }

  public static final class $phrase_structure_parser_rule_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $phrase_structure_parser_rule_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PHRASE-STRUCTURE-PARSER-RULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return phrase_structure_parser_rule_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1561 ms
 * 
 */
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_mapping_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_mapping_macros";
  public static final String myFingerPrint = "184cbd32d9e5be2e0882e3e80514d0e73f00d11a2e04771a54d163f6f77f0ce6";
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
  private static SubLSymbol $simple_term_assertion_list_filtered_caching_state$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PWHEN;
  private static final SubLSymbol $sym2$RELEVANT_PRED_;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$RELEVANT_MT_;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PROGN;
  private static final SubLSymbol $sym7$TRUTH_RELEVANT_P;
  private static final SubLSymbol $sym8$PWHEN_TRUTH_RELEVANT;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$ASSERTION_HAS_TRUTH;
  private static final SubLSymbol $sym11$COR;
  private static final SubLSymbol $sym12$NULL;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$ASSERTION_HAS_DIRECTION_SPEC;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw18$TRUTH;
  private static final SubLSymbol $kw19$DIRECTION;
  private static final SubLSymbol $kw20$DONE;
  private static final SubLSymbol $sym21$DO_LIST;
  private static final SubLSymbol $sym22$PWHEN_ASSERTION_HAS_TRUTH;
  private static final SubLSymbol $sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$DO_ASSERTION_LIST;
  private static final SubLSymbol $sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$GAF;
  private static final SubLSymbol $sym29$GAF_ASSERTION_;
  private static final SubLSymbol $kw30$RULE;
  private static final SubLSymbol $sym31$RULE_ASSERTION_;
  private static final SubLSymbol $sym32$ASSERTION_HAS_TYPE;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym36$UNTIL_MAPPING_FINISHED;
  private static final SubLSymbol $sym37$SOME_ASSERTIONS_INTERNAL;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SOME_ASSERTIONS;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$DO_ASSERTIONS;
  private static final SubLSymbol $sym43$DO_FINAL_INDEX_FROM_SPEC;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$FINAL_INDEX_ITERATOR;
  private static final SubLSymbol $sym47$CLET;
  private static final SubLSymbol $sym48$CUNWIND_PROTECT;
  private static final SubLSymbol $sym49$CSETQ;
  private static final SubLSymbol $sym50$NEW_FINAL_INDEX_ITERATOR;
  private static final SubLSymbol $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL;
  private static final SubLSymbol $sym52$DESTROY_FINAL_INDEX_ITERATOR;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$INDEX;
  private static final SubLSymbol $kw56$PREDICATE;
  private static final SubLSymbol $sym57$PRED_VAR;
  private static final SubLSymbol $sym58$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym61$DO_GAF_ARG_INDEX;
  private static final SubLString $str62$Iterate_over_an_index_of_gaf_asse;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$ASSERTION_VAR;
  private static final SubLSymbol $sym65$GAF_FORMULA;
  private static final SubLSymbol $sym66$DO_GAF_ARG_INDEX_FORMULAS;
  private static final SubLString $str67$Iterate_over_an_index_of_gaf_asse;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$ASSERTION;
  private static final SubLSymbol $sym70$GAF_ARG;
  private static final SubLSymbol $kw71$ANY;
  private static final SubLSymbol $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym73$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw74$ARGNUM_KEYS_ARE_FRESH;
  private static final SubLSymbol $kw75$GAF_ARG;
  private static final SubLSymbol $kw76$PREDICATE_KEYS_ARE_FRESH;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$PRED_VAR;
  private static final SubLSymbol $sym80$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym82$PIF_FEATURE;
  private static final SubLSymbol $kw83$CYC_ALEXANDRIA;
  private static final SubLSymbol $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS;
  private static final SubLSymbol $sym85$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym87$PRED_VAR;
  private static final SubLSymbol $sym88$ASSERTION_VAR;
  private static final SubLSymbol $sym89$NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym90$DO_PREDICATE_EXTENT_INDEX;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$PRED_VAR;
  private static final SubLSymbol $sym93$ASSERTION_VAR;
  private static final SubLSymbol $sym94$NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR;
  private static final SubLSymbol $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym96$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw97$PREDICATE_EXTENT;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$FUNCTION;
  private static final SubLSymbol $sym101$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym104$DO_NART_ARG_INDEX;
  private static final SubLSymbol $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym106$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw107$NART_ARG;
  private static final SubLString $str108$nart_arg_keys_should_never_be_irr;
  private static final SubLSymbol $kw109$FUNCTION_KEYS_ARE_FRESH;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym114$DO_FUNCTION_EXTENT_INDEX;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$TOU;
  private static final SubLSymbol $sym118$GAF_ARG1;
  private static final SubLList $list119;
  private static final SubLObject $const120$termOfUnit;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$DO_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $kw125$SENSE;
  private static final SubLSymbol $kw126$POS;
  private static final SubLSymbol $kw127$NEG;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym135$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw136$SENSE_KEYS_ARE_FRESH;
  private static final SubLSymbol $kw137$PREDICATE_RULE;
  private static final SubLString $str138$predicate_rule_iterator_quiescens;
  private static final SubLSymbol $kw139$MT_KEYS_ARE_FRESH;
  private static final SubLSymbol $sym140$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $sym144$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON;
  private static final SubLSymbol $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX;
  private static final SubLSymbol $kw147$DECONTEXTUALIZED_IST_PREDICATE_RULE;
  private static final SubLString $str148$ist_predicate_rule_iterator_quies;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym153$DO_ISA_RULE_INDEX;
  private static final SubLSymbol $sym154$ISA_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLObject $const155$isa;
  private static final SubLSymbol $kw156$ISA_RULE;
  private static final SubLSymbol $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $sym159$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym162$DO_QUOTED_ISA_RULE_INDEX;
  private static final SubLSymbol $sym163$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLObject $const164$quotedIsa;
  private static final SubLSymbol $kw165$QUOTED_ISA_RULE;
  private static final SubLSymbol $sym166$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym169$DO_GENLS_RULE_INDEX;
  private static final SubLSymbol $sym170$GENLS_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLObject $const171$genls;
  private static final SubLSymbol $kw172$GENLS_RULE;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym177$DO_GENL_MT_RULE_INDEX;
  private static final SubLSymbol $sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLObject $const179$genlMt;
  private static final SubLSymbol $kw180$GENL_MT_RULE;
  private static final SubLString $str181$pred_arg2_rule_iterator_quiescens;
  private static final SubLString $str182$unexpected_pred_in_pred_arg2_inde;
  private static final SubLList $list183;
  private static final SubLSymbol $sym184$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym187$DO_FUNCTION_RULE_INDEX;
  private static final SubLSymbol $sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym190$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw191$FUNCTION_RULE;
  private static final SubLString $str192$function_rule_iterator_quiescense;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym197$DO_EXCEPTION_RULE_INDEX;
  private static final SubLSymbol $sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym200$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw201$EXCEPTION_RULE;
  private static final SubLString $str202$exception_rule_iterator_quiescens;
  private static final SubLSymbol $sym203$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym206$DO_PRAGMA_RULE_INDEX;
  private static final SubLSymbol $sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym209$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLSymbol $kw210$PRAGMA_RULE;
  private static final SubLString $str211$pragma_rule_iterator_quiescense_f;
  private static final SubLList $list212;
  private static final SubLSymbol $sym213$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym216$DO_UNBOUND_PREDICATE_RULE_INDEX;
  private static final SubLSymbol $sym217$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P;
  private static final SubLSymbol $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_;
  private static final SubLSymbol $sym219$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT;
  private static final SubLString $str220$unbound_predicate_rule_iterator_q;
  private static final SubLList $list221;
  private static final SubLList $list222;
  private static final SubLSymbol $kw223$TYPE;
  private static final SubLSymbol $sym224$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym225$DO_MT_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym226$MT_FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym227$DO_MT_INDEX;
  private static final SubLSymbol $sym228$MT_INDEX_ASSERTION_MATCH_P;
  private static final SubLList $list229;
  private static final SubLList $list230;
  private static final SubLSymbol $sym231$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym232$DO_OTHER_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym233$OTHER_FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P;
  private static final SubLSymbol $sym235$DO_OTHER_INDEX;
  private static final SubLSymbol $sym236$OTHER_INDEX_ASSERTION_MATCH_P;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$OTHER_FINAL_INDEX_SPEC_P;
  private static final SubLSymbol $sym239$DO_TERM_INDEX;
  private static final SubLSymbol $kw240$SIMPLE;
  private static final SubLSymbol $kw241$OTHER;
  private static final SubLSymbol $sym242$FINAL_INDEX_SPEC;
  private static final SubLSymbol $sym243$DO_TERM_INDEX_KEY_VALIDATOR;
  private static final SubLSymbol $sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR;
  private static final SubLSymbol $sym245$DO_TERM_INDEX_ASSERTION_MATCH_P;
  private static final SubLString $str246$Iterate_over_all_assertions_index;
  private static final SubLList $list247;
  private static final SubLList $list248;
  private static final SubLSymbol $sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR;
  private static final SubLString $str250$do_broad_mt_index;
  private static final SubLSymbol $sym251$DO_BROAD_MT_INDEX_MATCH_P;
  private static final SubLSymbol $sym252$DO_BROAD_MT_INDEX;
  private static final SubLList $list253;
  private static final SubLSymbol $sym254$WITH_JUST_MT;
  private static final SubLSymbol $sym255$DO_OVERLAP_INDEX;
  private static final SubLSymbol $sym256$FLATTEN;
  private static final SubLSymbol $sym257$ASSERTION_TYPE;
  private static final SubLSymbol $sym258$HLMT_EQUAL_;
  private static final SubLSymbol $sym259$ASSERTION_HLMT;
  private static final SubLSymbol $sym260$PCASE;
  private static final SubLSymbol $sym261$DO_MT_CONTENTS_METHOD;
  private static final SubLSymbol $kw262$MT;
  private static final SubLSymbol $kw263$BROAD_MT;
  private static final SubLList $list264;
  private static final SubLSymbol $sym265$DO_MT_CONTENTS;
  private static final SubLSymbol $sym266$HLMT_P;
  private static final SubLList $list267;
  private static final SubLList $list268;
  private static final SubLSymbol $sym269$GATHER_OVERLAP_INDEX;
  private static final SubLList $list270;
  private static final SubLList $list271;
  private static final SubLSymbol $kw272$METHODS;
  private static final SubLSymbol $sym273$DO_BEST_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym274$DO_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym275$BEST_GAF_LOOKUP_INDEX;
  private static final SubLList $list276;
  private static final SubLSymbol $sym277$L_INDEX;
  private static final SubLSymbol $sym278$METHOD;
  private static final SubLSymbol $sym279$DO_GLI_EXTRACT_METHOD;
  private static final SubLSymbol $sym280$DO_GLI_VIA_GAF_ARG;
  private static final SubLSymbol $sym281$DO_GLI_VIA_PREDICATE_EXTENT;
  private static final SubLSymbol $kw282$OVERLAP;
  private static final SubLSymbol $sym283$DO_GLI_VIA_OVERLAP;
  private static final SubLSymbol $sym284$OTHERWISE;
  private static final SubLSymbol $sym285$DO_GLI_METHOD_ERROR;
  private static final SubLSymbol $kw286$INDEX_TYPE;
  private static final SubLString $str287$Skip_iteration;
  private static final SubLString $str288$Unsupported_method__S_in__S_in_DO;
  private static final SubLSymbol $sym289$TERM;
  private static final SubLSymbol $sym290$ARGNUM;
  private static final SubLSymbol $sym291$PREDICATE;
  private static final SubLSymbol $sym292$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym293$DO_GLI_VGA_EXTRACT_KEYS;
  private static final SubLSymbol $sym294$PIF;
  private static final SubLSymbol $kw295$TERM;
  private static final SubLSymbol $kw296$ARGNUM;
  private static final SubLSymbol $sym297$DO_GLI_VPE_EXTRACT_KEY;
  private static final SubLSymbol $sym298$DO_GLI_VO_EXTRACT_KEY;
  private static final SubLSymbol $kw299$TERMS;
  private static final SubLList $list300;
  private static final SubLList $list301;
  private static final SubLSymbol $sym302$TOU_VAR;
  private static final SubLSymbol $sym303$DO_BEST_NAT_LOOKUP_INDEX;
  private static final SubLList $list304;
  private static final SubLSymbol $sym305$DO_NAT_LOOKUP_INDEX;
  private static final SubLSymbol $sym306$BEST_NAT_LOOKUP_INDEX;
  private static final SubLList $list307;
  private static final SubLSymbol $sym308$L_INDEX;
  private static final SubLSymbol $sym309$METHOD;
  private static final SubLSymbol $sym310$DO_NLI_EXTRACT_METHOD;
  private static final SubLSymbol $sym311$DO_NLI_VIA_NART_ARG;
  private static final SubLSymbol $kw312$FUNCTION_EXTENT;
  private static final SubLSymbol $sym313$DO_NLI_VIA_FUNCTION_EXTENT;
  private static final SubLSymbol $sym314$DO_NLI_VIA_OVERLAP;
  private static final SubLSymbol $sym315$DO_NLI_METHOD_ERROR;
  private static final SubLString $str316$Unsupported_method__S_in__S_in_DO;
  private static final SubLSymbol $sym317$TERM;
  private static final SubLSymbol $sym318$ARGNUM;
  private static final SubLSymbol $sym319$FUNCTOR;
  private static final SubLSymbol $sym320$DO_NLI_VNA_EXTRACT_KEYS;
  private static final SubLSymbol $kw321$FUNCTOR;
  private static final SubLSymbol $sym322$DO_NLI_VFE_EXTRACT_KEY;
  private static final SubLSymbol $sym323$DO_NLI_VO_EXTRACT_KEY;
  private static final SubLSymbol $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_;
  private static final SubLSymbol $sym325$FINAL_INDEX_ITERATOR_FILTERED;
  private static final SubLSymbol $sym326$QUOTE;
  private static final SubLList $list327;
  private static final SubLString $str328$Unexpected_non_simple_index__s;
  private static final SubLList $list329;
  private static final SubLSymbol $kw330$NART;
  private static final SubLList $list331;
  private static final SubLString $str332$unexpected_type__s_in_simple_fina;
  private static final SubLList $list333;
  private static final SubLSymbol $sym334$ASSERTION_VAR;
  private static final SubLSymbol $sym335$CLAUSE_STRUC;
  private static final SubLSymbol $sym336$ASSERTION_GAF_P;
  private static final SubLSymbol $sym337$DO_ITERATOR_WITHOUT_VALUES;
  private static final SubLSymbol $sym338$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR;
  private static final SubLSymbol $sym339$FIRST;
  private static final SubLSymbol $sym340$SECOND;
  private static final SubLSymbol $sym341$ASSERTION_CNF;
  private static final SubLList $list342;
  private static final SubLSymbol $sym343$PUNLESS;
  private static final SubLSymbol $sym344$KBEQ;
  private static final SubLSymbol $sym345$NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR;
  private static final SubLSymbol $sym346$ASSERTION_CLAUSE_STRUC;
  private static final SubLSymbol $sym347$CDOLIST;
  private static final SubLSymbol $sym348$CLAUSE_STRUC_ASSERTIONS;
  private static final SubLList $list349;
  private static final SubLList $list350;
  private static final SubLSymbol $kw351$EXCLUSIVE_;
  private static final SubLSymbol $sym352$ASSERTION_VAR;
  private static final SubLSymbol $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA;
  private static final SubLSymbol $sym354$EXCLUSIVE_VAR;
  private static final SubLSymbol $sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR;
  private static final SubLSymbol $sym356$CAND;
  private static final SubLSymbol $sym357$ASSERTION_P;
  private static final SubLList $list358;
  private static final SubLSymbol $sym359$FINAL_INDEX_P;
  private static final SubLSymbol $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_;
  private static final SubLSymbol $sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED;
  private static final SubLSymbol $sym362$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_;
  private static final SubLInteger $int363$512;
  private static final SubLSymbol $sym364$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED;
  private static final SubLList $list365;
  private static final SubLList $list366;
  private static final SubLSymbol $sym367$EL_FORMULA_P;
  private static final SubLList $list368;
  private static final SubLList $list369;
  private static final SubLObject $const370$abnormal;
  private static final SubLObject $const371$meetsPragmaticRequirement;
  private static final SubLList $list372;
  private static final SubLSymbol $sym373$HLMTS_SEEN_SO_FAR;
  private static final SubLSymbol $sym374$ASSERTION;
  private static final SubLSymbol $sym375$MONAD_VAR;
  private static final SubLList $list376;
  private static final SubLSymbol $sym377$WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym378$LIST;
  private static final SubLObject $const379$MtSpace;
  private static final SubLList $list380;
  private static final SubLSymbol $sym381$ASSERTION_MT;
  private static final SubLSymbol $sym382$HLMT_EQUAL;
  private static final SubLSymbol $sym383$HLMT_MONAD_MT;
  private static final SubLSymbol $sym384$SET_MEMBER_;
  private static final SubLSymbol $sym385$SET_ADD;

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 711L)
  public static SubLObject pwhen_predicate_is_relevant(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym2$RELEVANT_PRED_, predicate ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 990L)
  public static SubLObject pwhen_mt_is_relevant(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym4$RELEVANT_MT_, mt ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1085L)
  public static SubLObject pwhen_truth_relevant(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject truth = NIL;
    SubLObject truth_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    truth = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    truth_spec = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == truth_spec )
    {
      return reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym7$TRUTH_RELEVANT_P, truth, truth_spec ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1278L)
  public static SubLObject truth_relevant_p(final SubLObject truth, final SubLObject truth_spec)
  {
    return makeBoolean( NIL == truth_spec || truth.eql( truth_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1423L)
  public static SubLObject pwhen_assertion_has_truth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    SubLObject truth = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    truth = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == truth )
    {
      return reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) );
    }
    if( NIL != enumeration_types.truth_p( truth ) )
    {
      return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym10$ASSERTION_HAS_TRUTH, assertion, truth ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym11$COR, ConsesLow.list( $sym12$NULL, truth ), ConsesLow.list( $sym10$ASSERTION_HAS_TRUTH, assertion, truth ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1743L)
  public static SubLObject pwhen_assertion_has_direction_spec(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    SubLObject direction_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    direction_spec = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == direction_spec )
    {
      return reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) );
    }
    if( NIL != direction_spec_p( direction_spec ) )
    {
      return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym14$ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym11$COR, ConsesLow.list( $sym12$NULL, direction_spec ), ConsesLow.list( $sym14$ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec ) ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2152L)
  public static SubLObject direction_spec_p(final SubLObject v_object)
  {
    return enumeration_types.direction_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2239L)
  public static SubLObject assertion_has_direction_spec(final SubLObject assertion, final SubLObject direction_spec)
  {
    return assertions_high.assertion_has_direction( assertion, direction_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2374L)
  public static SubLObject do_assertion_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject assertions = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    assertions = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$1, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym21$DO_LIST, ConsesLow.list( var, assertions, $kw20$DONE, done ), ConsesLow.listS( $sym22$PWHEN_ASSERTION_HAS_TRUTH, var, truth, ConsesLow.list( $sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC,
        var, direction ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2626L)
  public static SubLObject do_simple_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      if( NIL == conses_high.member( current_$2, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym25$DO_ASSERTION_LIST, ConsesLow.list( var, ConsesLow.list( $sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, v_term ), $kw18$TRUTH, truth, $kw19$DIRECTION, direction, $kw20$DONE, done ),
        ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2847L)
  public static SubLObject pwhen_assertion_has_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    type = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == type )
    {
      return reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) );
    }
    if( $kw28$GAF == type )
    {
      return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym29$GAF_ASSERTION_, assertion ), ConsesLow.append( body, NIL ) );
    }
    if( $kw30$RULE == type )
    {
      return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym31$RULE_ASSERTION_, assertion ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym11$COR, ConsesLow.list( $sym12$NULL, type ), ConsesLow.list( $sym32$ASSERTION_HAS_TYPE, assertion, type ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3229L)
  public static SubLObject some_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      if( NIL == conses_high.member( current_$3, $list34, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw35$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != done )
    {
      return ConsesLow.list( $sym36$UNTIL_MAPPING_FINISHED, ConsesLow.listS( $sym37$SOME_ASSERTIONS_INTERNAL, ConsesLow.list( var, $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.listS( $sym1$PWHEN, done,
          $list38 ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.listS( $sym37$SOME_ASSERTIONS_INTERNAL, ConsesLow.list( var, $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3612L)
  public static SubLObject some_assertions_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list40 );
      if( NIL == conses_high.member( current_$4, $list41, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw35$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym42$DO_ASSERTIONS, reader.bq_cons( var, ConsesLow.append( ( NIL != progress_message ) ? ConsesLow.list( progress_message ) : NIL, NIL ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3825L)
  public static SubLObject do_final_index_from_spec(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject final_index_spec = NIL;
    SubLObject type = NIL;
    SubLObject truth = NIL;
    SubLObject direction = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final_index_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    truth = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    done = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject final_index_iterator = $sym46$FINAL_INDEX_ITERATOR;
      return ConsesLow.list( $sym47$CLET, ConsesLow.list( final_index_iterator ), ConsesLow.list( $sym48$CUNWIND_PROTECT, ConsesLow.list( $sym6$PROGN, ConsesLow.list( $sym49$CSETQ, final_index_iterator, ConsesLow.list(
          $sym50$NEW_FINAL_INDEX_ITERATOR, final_index_spec, type, truth, direction ) ), ConsesLow.listS( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( assertion_var, final_index_iterator, $kw20$DONE,
              done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym1$PWHEN, final_index_iterator, ConsesLow.list( $sym52$DESTROY_FINAL_INDEX_ITERATOR, final_index_iterator ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 4726L)
  public static SubLObject do_gaf_arg_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
      if( NIL == conses_high.member( current_$5, $list54, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw55$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw56$PREDICATE, current );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred_var = $sym57$PRED_VAR;
    final SubLObject final_index_spec = $sym58$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( pred_var, predicate ) ), ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR, v_term, index, pred_var ), ConsesLow
        .list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec, ConsesLow.list( $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, pred_var ), $kw20$DONE, done ), ConsesLow.listS(
            $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( assertion_var, final_index_spec, $kw28$GAF, truth, direction, done ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 6669L)
  public static SubLObject do_gaf_arg_index_formulas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject formula_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    formula_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list63 );
      if( NIL == conses_high.member( current_$6, $list54, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw55$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw56$PREDICATE, current );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject assertion_var = $sym64$ASSERTION_VAR;
    return ConsesLow.list( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { assertion_var, v_term, $kw55$INDEX, index, $kw56$PREDICATE, predicate, $kw18$TRUTH, truth, $kw19$DIRECTION, direction, $kw20$DONE,
      done
    } ), ConsesLow.listS( $sym47$CLET, ConsesLow.list( ConsesLow.list( formula_var, ConsesLow.list( $sym65$GAF_FORMULA, assertion_var ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 8350L)
  public static SubLObject do_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject gather_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    gather_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list68 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list68 );
      if( NIL == conses_high.member( current_$7, $list54, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list68 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw55$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw56$PREDICATE, current );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject assertion = $sym69$ASSERTION;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( var ), ConsesLow.listS( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { assertion, v_term, $kw55$INDEX, index, $kw56$PREDICATE, predicate, $kw18$TRUTH,
      truth, $kw19$DIRECTION, direction, $kw20$DONE, done
    } ), ConsesLow.list( $sym49$CSETQ, var, ConsesLow.list( $sym70$GAF_ARG, assertion, gather_index ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 9682L)
  public static SubLObject do_gaf_arg_index_key_validator(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate)
  {
    return kb_indexing.gaf_arg_index_key_validator( v_term, argnum, predicate, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 9929L)
  public static SubLObject new_gaf_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject predicate)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      return iteration.new_singleton_iterator( new_gaf_simple_final_index_spec( v_term, ( NIL != argnum ) ? argnum : $kw71$ANY, predicate, NIL ) );
    }
    final SubLObject state = initialize_gaf_arg_final_index_spec_iterator_state( v_term, argnum, predicate );
    return iteration.new_iterator( state, $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym73$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 10658L)
  public static SubLObject initialize_gaf_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate)
  {
    final SubLObject state = Vectors.make_vector( SIX_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, v_term );
    Vectors.set_aref( state, ONE_INTEGER, predicate );
    Vectors.set_aref( state, TWO_INTEGER, $kw74$ARGNUM_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != argnum ) ? ConsesLow.list( argnum ) : kb_indexing.key_gaf_arg_index_cached( v_term, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    Vectors.set_aref( state, FIVE_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11311L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_term(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11436L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11559L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11742L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11885L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12039L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12179L)
  public static SubLObject set_gaf_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12315L)
  public static SubLObject set_gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12454L)
  public static SubLObject set_gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12596L)
  public static SubLObject set_gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FIVE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12731L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state)
  {
    return gaf_arg_final_index_spec_iterator_state_argnum_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12906L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_current_predicate_key(final SubLObject state)
  {
    return gaf_arg_final_index_spec_iterator_state_predicate_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13073L)
  public static SubLObject gaf_arg_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return gaf_arg_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13226L)
  public static SubLObject gaf_arg_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( gaf_arg_final_index_spec_iterator_state_current_argnum_key( state ), gaf_arg_final_index_spec_iterator_state_current_predicate_key( state ),
        gaf_arg_final_index_spec_iterator_state_current_mt_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13540L)
  public static SubLObject gaf_arg_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = gaf_arg_final_index_spec_iterator_state_note( state );
    final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys( state );
    final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys( state );
    return makeBoolean( NIL == argnum_keys || ( NIL == note && NIL != list_utilities.lengthE( argnum_keys, ONE_INTEGER, UNPROVIDED ) && NIL != list_utilities.lengthLE( predicate_keys, ONE_INTEGER, UNPROVIDED )
        && NIL == mt_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 14156L)
  public static SubLObject gaf_arg_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = gaf_arg_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    gaf_arg_final_index_spec_iterator_next_mt_key( state );
    return subl_promotions.values3( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 14434L)
  public static SubLObject gaf_arg_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = gaf_arg_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term( state );
        result = gaf_arg_keylist_to_final_index_spec( v_term, keylist );
      }
      else
      {
        doneP = gaf_arg_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return subl_promotions.values2( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 15379L)
  public static SubLObject gaf_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist)
  {
    return ConsesLow.listS( v_term, $kw75$GAF_ARG, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 15566L)
  public static SubLObject gaf_arg_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject input_predicate = gaf_arg_final_index_spec_iterator_state_predicate( state );
    final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys( state );
    final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject argnum = argnum_keys.first();
    final SubLObject predicate = predicate_keys.first();
    final SubLObject mt = mt_keys.first();
    if( NIL != argnum && NIL != predicate && NIL != mt )
    {
      if( NIL == input_predicate && NIL == pred_relevance_macros.relevant_predP( predicate ) )
      {
        set_gaf_arg_final_index_spec_iterator_state_mt_keys( state, NIL );
        set_gaf_arg_final_index_spec_iterator_state_note( state, NIL );
      }
      else if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( argnum, predicate, mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 16996L)
  public static SubLObject gaf_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys( state );
    final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys( state );
    if( NIL == argnum_keys )
    {
      return T;
    }
    if( NIL == predicate_keys )
    {
      gaf_arg_final_index_spec_iterator_refill_predicate_keys( state );
    }
    else if( NIL == mt_keys )
    {
      gaf_arg_final_index_spec_iterator_refill_mt_keys( state );
    }
    else
    {
      gaf_arg_final_index_spec_iterator_next_mt_key( state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 18196L)
  public static SubLObject gaf_arg_final_index_spec_iterator_refill_predicate_keys(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term( state );
    final SubLObject predicate = gaf_arg_final_index_spec_iterator_state_predicate( state );
    SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys( state );
    if( $kw74$ARGNUM_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note( state ) )
    {
      set_gaf_arg_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      argnum_keys = argnum_keys.rest();
      set_gaf_arg_final_index_spec_iterator_state_argnum_keys( state, argnum_keys );
    }
    final SubLObject argnum_key = argnum_keys.first();
    if( NIL != argnum_key )
    {
      if( NIL != predicate )
      {
        set_gaf_arg_final_index_spec_iterator_state_predicate_keys( state, ConsesLow.list( predicate ) );
      }
      else if( NIL != pred_relevance_macros.only_specified_predicate_list_is_relevantP() )
      {
        set_gaf_arg_final_index_spec_iterator_state_predicate_keys( state, conses_high.copy_list( pred_relevance_macros.$relevant_preds$.getDynamicValue( thread ) ) );
      }
      else
      {
        set_gaf_arg_final_index_spec_iterator_state_predicate_keys( state, kb_indexing.key_gaf_arg_index_cached( v_term, argnum_key, UNPROVIDED ) );
      }
      set_gaf_arg_final_index_spec_iterator_state_note( state, $kw76$PREDICATE_KEYS_ARE_FRESH );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 19781L)
  public static SubLObject gaf_arg_final_index_spec_iterator_refill_mt_keys(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term( state );
    final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys( state );
    SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys( state );
    if( $kw76$PREDICATE_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note( state ) )
    {
      set_gaf_arg_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      predicate_keys = predicate_keys.rest();
      set_gaf_arg_final_index_spec_iterator_state_predicate_keys( state, predicate_keys );
    }
    final SubLObject predicate_key = predicate_keys.first();
    if( NIL != predicate_key )
    {
      if( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() )
      {
        set_gaf_arg_final_index_spec_iterator_state_mt_keys( state, ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) ) );
      }
      else
      {
        final SubLObject argnum_key = argnum_keys.first();
        set_gaf_arg_final_index_spec_iterator_state_mt_keys( state, kb_indexing.key_gaf_arg_index_cached( v_term, argnum_key, predicate_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 21258L)
  public static SubLObject gaf_arg_final_index_spec_iterator_next_mt_key(final SubLObject state)
  {
    final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys( state );
    set_gaf_arg_final_index_spec_iterator_state_mt_keys( state, mt_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 21941L)
  public static SubLObject do_predicate_extent_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      if( NIL == conses_high.member( current_$8, $list78, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw35$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred_var = $sym79$PRED_VAR;
    final SubLObject final_index_spec = $sym80$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( pred_var, predicate ) ), ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var ), ConsesLow.list(
        $sym82$PIF_FEATURE, $kw83$CYC_ALEXANDRIA, ConsesLow.list( $sym6$PROGN, ConsesLow.listS( $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, ConsesLow.list( var, ConsesLow.list(
            $sym85$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR, pred_var, ZERO_INTEGER, NIL, truth, direction ), $kw20$DONE, done, $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.append( body, NIL ) ) ), ConsesLow
                .list( $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, ConsesLow.list( final_index_spec, ConsesLow.list( $sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, pred_var ), $kw20$DONE, done,
                    $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw28$GAF, truth, direction, done ), ConsesLow.append( body,
                        NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 23379L)
  public static SubLObject do_predicate_extent_index_formulas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      if( NIL == conses_high.member( current_$9, $list78, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw35$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred_var = $sym87$PRED_VAR;
    final SubLObject assertion_var = $sym88$ASSERTION_VAR;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( pred_var, predicate ) ), ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var ), ConsesLow.list(
        $sym82$PIF_FEATURE, $kw83$CYC_ALEXANDRIA, ConsesLow.list( $sym6$PROGN, ConsesLow.listS( $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, ConsesLow.list( var, ConsesLow.list(
            $sym89$NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR, pred_var, ZERO_INTEGER, NIL, truth, direction ), $kw20$DONE, done, $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.append( body, NIL ) ) ),
        ConsesLow.list( $sym6$PROGN, ConsesLow.list( $sym90$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( new SubLObject[]
        { assertion_var, predicate, $kw18$TRUTH, truth, $kw19$DIRECTION, direction, $kw20$DONE, done, $kw35$PROGRESS_MESSAGE, progress_message
        } ), ConsesLow.listS( $sym47$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym65$GAF_FORMULA, assertion_var ) ) ), ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 24934L)
  public static SubLObject do_predicate_extent_index_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    SubLObject gather_arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    gather_arg = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list91 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list91 );
      if( NIL == conses_high.member( current_$10, $list78, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw35$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred_var = $sym92$PRED_VAR;
    final SubLObject assertion_var = $sym93$ASSERTION_VAR;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( pred_var, predicate ) ), ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var ), ConsesLow.list(
        $sym82$PIF_FEATURE, $kw83$CYC_ALEXANDRIA, ConsesLow.list( $sym6$PROGN, ConsesLow.listS( $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, ConsesLow.list( var, ConsesLow.list(
            $sym94$NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR, pred_var, gather_arg, ZERO_INTEGER, NIL, truth, direction ), $kw20$DONE, done, $kw35$PROGRESS_MESSAGE, progress_message ), ConsesLow.append( body,
                NIL ) ) ), ConsesLow.list( $sym6$PROGN, ConsesLow.list( $sym90$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( new SubLObject[]
                { assertion_var, predicate, $kw18$TRUTH, truth, $kw19$DIRECTION, direction, $kw20$DONE, done, $kw35$PROGRESS_MESSAGE, progress_message
        } ), ConsesLow.listS( $sym47$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym70$GAF_ARG, assertion_var, gather_arg ) ) ), ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 26536L)
  public static SubLObject do_predicate_extent_index_key_validator(final SubLObject predicate)
  {
    return forts.fort_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 26748L)
  public static SubLObject new_predicate_extent_final_index_spec_iterator(final SubLObject predicate)
  {
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( predicate ) )
    {
      return iteration.new_singleton_iterator( new_gaf_simple_final_index_spec( predicate, NIL, predicate, NIL ) );
    }
    final SubLObject state = initialize_predicate_extent_final_index_spec_iterator_state( predicate );
    return iteration.new_iterator( state, $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym96$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27488L)
  public static SubLObject initialize_predicate_extent_final_index_spec_iterator_state(final SubLObject predicate)
  {
    final SubLObject state = Vectors.make_vector( TWO_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, predicate );
    Vectors.set_aref( state, ONE_INTEGER, kb_indexing.key_predicate_extent_index( predicate ) );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27834L)
  public static SubLObject predicate_extent_final_index_spec_iterator_state_predicate(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27978L)
  public static SubLObject predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28127L)
  public static SubLObject set_predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, ONE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28283L)
  public static SubLObject predicate_extent_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return predicate_extent_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28468L)
  public static SubLObject predicate_extent_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( predicate_extent_final_index_spec_iterator_state_current_mt_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28661L)
  public static SubLObject predicate_extent_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys( state );
    return Types.sublisp_null( mt_keys );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28947L)
  public static SubLObject predicate_extent_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = predicate_extent_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    predicate_extent_final_index_spec_iterator_next_mt_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 29251L)
  public static SubLObject predicate_extent_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = predicate_extent_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject pred = predicate_extent_final_index_spec_iterator_state_predicate( state );
        result = predicate_extent_keylist_to_final_index_spec( pred, keylist );
      }
      else
      {
        doneP = predicate_extent_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 30263L)
  public static SubLObject predicate_extent_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist)
  {
    return ConsesLow.listS( v_term, $kw97$PREDICATE_EXTENT, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 30477L)
  public static SubLObject predicate_extent_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject mt = mt_keys.first();
    if( NIL != mt && NIL != mt_relevance_macros.relevant_mtP( mt ) )
    {
      return ConsesLow.list( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 31062L)
  public static SubLObject predicate_extent_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys( state );
    if( NIL == mt_keys )
    {
      return T;
    }
    predicate_extent_final_index_spec_iterator_next_mt_key( state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 31806L)
  public static SubLObject predicate_extent_final_index_spec_iterator_next_mt_key(final SubLObject state)
  {
    final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys( state );
    set_predicate_extent_final_index_spec_iterator_state_mt_keys( state, mt_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 32075L)
  public static SubLObject do_nart_arg_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list98 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list98 );
      if( NIL == conses_high.member( current_$11, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw55$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject function_tail = cdestructuring_bind.property_list_member( $kw100$FUNCTION, current );
    final SubLObject function = ( NIL != function_tail ) ? conses_high.cadr( function_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym101$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR, v_term, index, function ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec,
        ConsesLow.list( $sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, function ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw28$GAF,
            NIL, NIL, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 33315L)
  public static SubLObject do_nart_arg_index_key_validator(final SubLObject v_term, final SubLObject index, final SubLObject function)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && ( NIL == index || NIL != subl_promotions.positive_integer_p( index ) ) && ( NIL == function || NIL != forts.fort_p( function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 33644L)
  public static SubLObject new_nart_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject function)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( function == UNPROVIDED )
    {
      function = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      return iteration.new_singleton_iterator( new_nart_simple_final_index_spec( v_term, ( NIL != argnum ) ? argnum : $kw71$ANY, function ) );
    }
    final SubLObject state = initialize_nart_arg_final_index_spec_iterator_state( v_term, argnum, function );
    return iteration.new_iterator( state, $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym106$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 34382L)
  public static SubLObject initialize_nart_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject function)
  {
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, v_term );
    Vectors.set_aref( state, ONE_INTEGER, function );
    Vectors.set_aref( state, TWO_INTEGER, $kw74$ARGNUM_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != argnum ) ? ConsesLow.list( argnum ) : kb_indexing.key_nart_arg_index( v_term, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 34983L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_term(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35109L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_function(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35231L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35415L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35559L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35712L)
  public static SubLObject set_nart_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35849L)
  public static SubLObject set_nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35989L)
  public static SubLObject set_nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36131L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state)
  {
    return nart_arg_final_index_spec_iterator_state_argnum_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36308L)
  public static SubLObject nart_arg_final_index_spec_iterator_state_current_function_key(final SubLObject state)
  {
    return nart_arg_final_index_spec_iterator_state_function_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36475L)
  public static SubLObject nart_arg_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( nart_arg_final_index_spec_iterator_state_current_argnum_key( state ), nart_arg_final_index_spec_iterator_state_current_function_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36727L)
  public static SubLObject nart_arg_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = nart_arg_final_index_spec_iterator_state_note( state );
    final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys( state );
    return makeBoolean( NIL == argnum_keys || ( NIL == note && NIL != list_utilities.lengthE( argnum_keys, ONE_INTEGER, UNPROVIDED ) && NIL == function_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 37243L)
  public static SubLObject nart_arg_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = nart_arg_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    nart_arg_final_index_spec_iterator_next_function_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 37529L)
  public static SubLObject nart_arg_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = nart_arg_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term( state );
        result = nart_arg_keylist_to_final_index_spec( v_term, keylist );
      }
      else
      {
        doneP = nart_arg_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 38480L)
  public static SubLObject nart_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist)
  {
    return ConsesLow.listS( v_term, $kw107$NART_ARG, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 38670L)
  public static SubLObject nart_arg_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys( state );
    final SubLObject argnum = argnum_keys.first();
    final SubLObject function = function_keys.first();
    if( NIL != argnum && NIL != function )
    {
      return ConsesLow.list( argnum, function );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 39364L)
  public static SubLObject nart_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys( state );
    final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys( state );
    if( NIL == argnum_keys )
    {
      return T;
    }
    if( NIL == function_keys )
    {
      nart_arg_final_index_spec_iterator_refill_function_keys( state );
    }
    else
    {
      Errors.error( $str108$nart_arg_keys_should_never_be_irr, argnum_keys, function_keys );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 40309L)
  public static SubLObject nart_arg_final_index_spec_iterator_refill_function_keys(final SubLObject state)
  {
    final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term( state );
    final SubLObject function = nart_arg_final_index_spec_iterator_state_function( state );
    SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys( state );
    if( $kw74$ARGNUM_KEYS_ARE_FRESH == nart_arg_final_index_spec_iterator_state_note( state ) )
    {
      set_nart_arg_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      argnum_keys = argnum_keys.rest();
      set_nart_arg_final_index_spec_iterator_state_argnum_keys( state, argnum_keys );
    }
    final SubLObject argnum_key = argnum_keys.first();
    if( NIL != argnum_key )
    {
      if( NIL != function )
      {
        set_nart_arg_final_index_spec_iterator_state_function_keys( state, ConsesLow.list( function ) );
      }
      else
      {
        set_nart_arg_final_index_spec_iterator_state_function_keys( state, kb_indexing.key_nart_arg_index( v_term, argnum_key, UNPROVIDED ) );
      }
      set_nart_arg_final_index_spec_iterator_state_note( state, $kw109$FUNCTION_KEYS_ARE_FRESH );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 41632L)
  public static SubLObject nart_arg_final_index_spec_iterator_next_function_key(final SubLObject state)
  {
    final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys( state );
    set_nart_arg_final_index_spec_iterator_state_function_keys( state, function_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 41907L)
  public static SubLObject do_function_extent_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    function = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list110 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list110 );
      if( NIL == conses_high.member( current_$12, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list110 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym111$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, function ), ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( final_index_spec, ConsesLow.list(
        $sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC, function ) ) ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw28$GAF, truth, direction, done ), ConsesLow.append( body,
            NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 42966L)
  public static SubLObject do_function_extent_index_key_validator(final SubLObject function)
  {
    return forts.fort_p( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 43172L)
  public static SubLObject do_function_narts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    function = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$13, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject tou = $sym117$TOU;
    return ConsesLow.list( $sym114$DO_FUNCTION_EXTENT_INDEX, ConsesLow.list( tou, function, $kw20$DONE, done ), ConsesLow.listS( $sym47$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym118$GAF_ARG1,
        tou ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 43594L)
  public static SubLObject function_extent_final_index_spec(final SubLObject function)
  {
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( function ) )
    {
      return new_gaf_simple_final_index_spec( function, $list119, $const120$termOfUnit, mt_vars.$tou_mt$.getGlobalValue() );
    }
    return reader.bq_cons( function, $list121 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44081L)
  public static SubLObject do_consequent_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      if( NIL == conses_high.member( current_$14, $list123, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym124$DO_PREDICATE_RULE_INDEX, ConsesLow.list( var, predicate, $kw125$SENSE, $kw126$POS, $kw19$DIRECTION, direction, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44563L)
  public static SubLObject do_antecedent_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$15 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      current_$15 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      if( NIL == conses_high.member( current_$15, $list123, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$15 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym124$DO_PREDICATE_RULE_INDEX, ConsesLow.list( var, predicate, $kw125$SENSE, $kw127$NEG, $kw19$DIRECTION, direction, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44887L)
  public static SubLObject do_predicate_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      if( NIL == conses_high.member( current_$16, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list128 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym130$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 46359L)
  public static SubLObject do_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction)
  {
    return makeBoolean( NIL != forts.fort_p( predicate ) && ( NIL == sense || NIL != enumeration_types.sense_p( sense ) ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 46619L)
  public static SubLObject new_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( predicate ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( predicate, sense, $sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_predicate_rule_final_index_spec_iterator_state( predicate, sense, direction );
    return iteration.new_iterator( state, $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym135$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 47414L)
  public static SubLObject initialize_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction)
  {
    final SubLObject state = Vectors.make_vector( SIX_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, predicate );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw136$SENSE_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != sense ) ? ConsesLow.list( sense ) : kb_indexing.key_predicate_rule_index( predicate, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    Vectors.set_aref( state, FIVE_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48084L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48226L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48356L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48546L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48694L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48841L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49002L)
  public static SubLObject set_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49145L)
  public static SubLObject set_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49290L)
  public static SubLObject set_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49432L)
  public static SubLObject set_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FIVE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49581L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state)
  {
    return predicate_rule_final_index_spec_iterator_state_sense_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49768L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return predicate_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49935L)
  public static SubLObject predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return predicate_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 50116L)
  public static SubLObject predicate_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( predicate_rule_final_index_spec_iterator_state_current_sense_key( state ), predicate_rule_final_index_spec_iterator_state_current_mt_key( state ),
        predicate_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 50457L)
  public static SubLObject predicate_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = predicate_rule_final_index_spec_iterator_state_note( state );
    final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == sense_keys || ( NIL == note && NIL != list_utilities.lengthE( sense_keys, ONE_INTEGER, UNPROVIDED ) && NIL != list_utilities.lengthLE( mt_keys, ONE_INTEGER, UNPROVIDED )
        && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 51112L)
  public static SubLObject predicate_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = predicate_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    predicate_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 51417L)
  public static SubLObject predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = predicate_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate( state );
        result = predicate_rule_keylist_to_final_index_spec( predicate, keylist );
      }
      else
      {
        doneP = predicate_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 52425L)
  public static SubLObject predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, $kw137$PREDICATE_RULE, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 52633L)
  public static SubLObject predicate_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject sense = sense_keys.first();
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != sense && NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( sense, mt, direction );
      }
      set_predicate_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 53685L)
  public static SubLObject predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == sense_keys )
    {
      return T;
    }
    if( NIL == mt_keys )
    {
      predicate_rule_final_index_spec_iterator_refill_mt_keys( state );
    }
    else if( NIL == direction_keys )
    {
      predicate_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str138$predicate_rule_iterator_quiescens, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 54880L)
  public static SubLObject predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate( state );
    SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    if( $kw136$SENSE_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_predicate_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      sense_keys = sense_keys.rest();
      set_predicate_rule_final_index_spec_iterator_state_sense_keys( state, sense_keys );
    }
    final SubLObject sense_key = sense_keys.first();
    if( NIL != sense_key )
    {
      if( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() )
      {
        set_predicate_rule_final_index_spec_iterator_state_mt_keys( state, ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) ) );
      }
      else
      {
        set_predicate_rule_final_index_spec_iterator_state_mt_keys( state, kb_indexing.key_predicate_rule_index( predicate, sense_key, UNPROVIDED ) );
      }
      set_predicate_rule_final_index_spec_iterator_state_note( state, $kw139$MT_KEYS_ARE_FRESH );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 56174L)
  public static SubLObject predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate( state );
    final SubLObject direction = predicate_rule_final_index_spec_iterator_state_direction( state );
    final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_predicate_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_predicate_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_predicate_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        final SubLObject sense_key = sense_keys.first();
        set_predicate_rule_final_index_spec_iterator_state_direction_keys( state, kb_indexing.key_predicate_rule_index( predicate, sense_key, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 57624L)
  public static SubLObject predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    set_predicate_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 57922L)
  public static SubLObject do_decontextualized_ist_predicate_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$17 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      current_$17 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      if( NIL == conses_high.member( current_$17, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$17 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list128 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym140$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL,
        ConsesLow.list( final_index_spec, ConsesLow.list( $sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction ), $kw20$DONE, done ), ConsesLow.listS(
            $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 59509L)
  public static SubLObject do_decontextualized_ist_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction)
  {
    return makeBoolean( NIL != forts.fort_p( predicate ) && ( NIL == sense || NIL != enumeration_types.sense_p( sense ) ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 59811L)
  public static SubLObject new_decontextualized_ist_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( predicate ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( predicate, sense, $sym144$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state( predicate, sense, direction );
    return iteration.new_iterator( state, $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON, $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 60753L)
  public static SubLObject initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction)
  {
    final SubLObject state = Vectors.make_vector( SIX_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, predicate );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw136$SENSE_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != sense ) ? ConsesLow.list( sense ) : kb_indexing.key_decontextualized_ist_predicate_rule_index( predicate, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61449L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61612L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61763L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61974L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62143L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62325L)
  public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62489L)
  public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62655L)
  public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62825L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state)
  {
    return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63054L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63277L)
  public static SubLObject decontextualized_ist_predicate_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key( state ), decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(
        state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63610L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note( state );
    final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == sense_keys || ( NIL == note && NIL != list_utilities.lengthE( sense_keys, ONE_INTEGER, UNPROVIDED ) && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 64258L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 64626L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = decontextualized_ist_predicate_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate( state );
        result = decontextualized_ist_predicate_rule_keylist_to_final_index_spec( predicate, keylist );
      }
      else
      {
        doneP = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 65781L)
  public static SubLObject decontextualized_ist_predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, $kw147$DECONTEXTUALIZED_IST_PREDICATE_RULE, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 66052L)
  public static SubLObject decontextualized_ist_predicate_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject sense = sense_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != sense && NIL != direction )
    {
      return ConsesLow.list( sense, direction );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 66755L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == sense_keys )
    {
      return T;
    }
    if( NIL == direction_keys )
    {
      decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str148$ist_predicate_rule_iterator_quies, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 67714L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate( state );
    final SubLObject direction = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction( state );
    SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    if( $kw136$SENSE_KEYS_ARE_FRESH == decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      sense_keys = sense_keys.rest();
      set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys( state, sense_keys );
    }
    final SubLObject sense_key = sense_keys.first();
    if( NIL != sense_key )
    {
      if( NIL != direction )
      {
        set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state, kb_indexing.key_decontextualized_ist_predicate_rule_index( predicate, sense_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 69265L)
  public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 69626L)
  public static SubLObject do_isa_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    collection = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$18 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      current_$18 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      if( NIL == conses_high.member( current_$18, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$18 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym150$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 71130L)
  public static SubLObject do_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction)
  {
    return do_pred_arg2_rule_index_key_validator( collection, sense, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 71320L)
  public static SubLObject new_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( collection ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( collection, sense, $sym154$ISA_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state( $const155$isa, $kw156$ISA_RULE, collection, sense, direction );
    return iteration.new_iterator( state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 72066L)
  public static SubLObject do_quoted_isa_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    collection = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$19 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      current_$19 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      if( NIL == conses_high.member( current_$19, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$19 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym159$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 73642L)
  public static SubLObject do_quoted_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction)
  {
    return do_pred_arg2_rule_index_key_validator( collection, sense, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 73846L)
  public static SubLObject new_quoted_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( collection ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( collection, sense, $sym163$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state( $const164$quotedIsa, $kw165$QUOTED_ISA_RULE, collection, sense, direction );
    return iteration.new_iterator( state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 74626L)
  public static SubLObject do_genls_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    collection = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$20 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      current_$20 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list149 );
      if( NIL == conses_high.member( current_$20, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$20 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym166$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 76152L)
  public static SubLObject do_genls_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction)
  {
    return do_pred_arg2_rule_index_key_validator( collection, sense, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 76346L)
  public static SubLObject new_genls_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( collection ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( collection, sense, $sym170$GENLS_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state( $const171$genls, $kw172$GENLS_RULE, collection, sense, direction );
    return iteration.new_iterator( state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 77102L)
  public static SubLObject do_genl_mt_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject genl_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    genl_mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$21 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list173 );
      current_$21 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list173 );
      if( NIL == conses_high.member( current_$21, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$21 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list173 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym174$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, genl_mt, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, genl_mt, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 78627L)
  public static SubLObject do_genl_mt_rule_index_key_validator(final SubLObject genl_mt, final SubLObject sense, final SubLObject direction)
  {
    return do_pred_arg2_rule_index_key_validator( genl_mt, sense, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 78817L)
  public static SubLObject new_genl_mt_rule_final_index_spec_iterator(final SubLObject genl_mt, SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( genl_mt ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( genl_mt, sense, $sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state( $const179$genlMt, $kw180$GENL_MT_RULE, genl_mt, sense, direction );
    return iteration.new_iterator( state, $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 79570L)
  public static SubLObject do_pred_arg2_rule_index_key_validator(final SubLObject arg2, final SubLObject sense, final SubLObject direction)
  {
    return makeBoolean( NIL != forts.fort_p( arg2 ) && ( NIL == sense || NIL != enumeration_types.sense_p( sense ) ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80037L)
  public static SubLObject initialize_pred_arg2_rule_final_index_spec_iterator_state(final SubLObject pred, final SubLObject top_level_key, final SubLObject arg2, final SubLObject sense, final SubLObject direction)
  {
    final SubLObject state = Vectors.make_vector( EIGHT_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, arg2 );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw136$SENSE_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != sense ) ? ConsesLow.list( sense ) : key_pred_arg2_rule_index( pred, arg2, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    Vectors.set_aref( state, FIVE_INTEGER, NIL );
    Vectors.set_aref( state, SIX_INTEGER, pred );
    Vectors.set_aref( state, SEVEN_INTEGER, top_level_key );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80805L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_arg2(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80937L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81067L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81257L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81405L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81552L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81713L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_pred(final SubLObject state)
  {
    return Vectors.aref( state, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81833L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_top_level_key(final SubLObject state)
  {
    return Vectors.aref( state, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82006L)
  public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82149L)
  public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82294L)
  public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82436L)
  public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FIVE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82585L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state)
  {
    return pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82772L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82939L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 83120L)
  public static SubLObject pred_arg2_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( pred_arg2_rule_final_index_spec_iterator_state_current_sense_key( state ), pred_arg2_rule_final_index_spec_iterator_state_current_mt_key( state ),
        pred_arg2_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 83461L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = pred_arg2_rule_final_index_spec_iterator_state_note( state );
    final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == sense_keys || ( NIL == note && NIL != list_utilities.lengthE( sense_keys, ONE_INTEGER, UNPROVIDED ) && NIL != list_utilities.lengthLE( mt_keys, ONE_INTEGER, UNPROVIDED )
        && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 84116L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = pred_arg2_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    pred_arg2_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 84421L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = pred_arg2_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2( state );
        final SubLObject top_level_key = pred_arg2_rule_final_index_spec_iterator_state_top_level_key( state );
        result = pred_arg2_rule_keylist_to_final_index_spec( arg2, top_level_key, keylist );
      }
      else
      {
        doneP = pred_arg2_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 85519L)
  public static SubLObject pred_arg2_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject top_level_key, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, top_level_key, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 85740L)
  public static SubLObject pred_arg2_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject sense = sense_keys.first();
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != sense && NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( sense, mt, direction );
      }
      set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 86792L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == sense_keys )
    {
      return T;
    }
    if( NIL == mt_keys )
    {
      pred_arg2_rule_final_index_spec_iterator_refill_mt_keys( state );
    }
    else if( NIL == direction_keys )
    {
      pred_arg2_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str181$pred_arg2_rule_iterator_quiescens, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 87987L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred( state );
    final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2( state );
    SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state );
    if( $kw136$SENSE_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_pred_arg2_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      sense_keys = sense_keys.rest();
      set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state, sense_keys );
    }
    final SubLObject sense_key = sense_keys.first();
    if( NIL != sense_key )
    {
      if( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() )
      {
        set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state, ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) ) );
      }
      else
      {
        set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state, key_pred_arg2_rule_index( pred, arg2, sense_key, UNPROVIDED ) );
      }
      set_pred_arg2_rule_final_index_spec_iterator_state_note( state, $kw139$MT_KEYS_ARE_FRESH );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 89345L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred( state );
    final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2( state );
    final SubLObject direction = pred_arg2_rule_final_index_spec_iterator_state_direction( state );
    final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys( state );
    SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_pred_arg2_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        final SubLObject sense_key = sense_keys.first();
        set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state, key_pred_arg2_rule_index( pred, arg2, sense_key, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 90859L)
  public static SubLObject pred_arg2_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state );
    set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 91157L)
  public static SubLObject key_pred_arg2_rule_index(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pred.eql( $const155$isa ) )
    {
      return kb_indexing.key_isa_rule_index( arg2, sense, mt );
    }
    if( pred.eql( $const164$quotedIsa ) )
    {
      return kb_indexing.key_quoted_isa_rule_index( arg2, sense, mt );
    }
    if( pred.eql( $const171$genls ) )
    {
      return kb_indexing.key_genls_rule_index( arg2, sense, mt );
    }
    if( pred.eql( $const179$genlMt ) )
    {
      return kb_indexing.key_genl_mt_rule_index( arg2, sense, mt );
    }
    Errors.error( $str182$unexpected_pred_in_pred_arg2_inde, pred );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 91570L)
  public static SubLObject do_function_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list183 );
    function = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$22 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list183 );
      current_$22 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list183 );
      if( NIL == conses_high.member( current_$22, $list123, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$22 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list183 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym184$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, function, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec,
        ConsesLow.list( $sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, function, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw30$RULE,
            NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 92855L)
  public static SubLObject do_function_rule_index_key_validator(final SubLObject function, final SubLObject direction)
  {
    return makeBoolean( NIL != forts.fort_p( function ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 93060L)
  public static SubLObject new_function_rule_final_index_spec_iterator(final SubLObject function, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( function ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( function, $kw127$NEG, $sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_function_rule_final_index_spec_iterator_state( function, direction );
    return iteration.new_iterator( state, $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym190$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 93831L)
  public static SubLObject initialize_function_rule_final_index_spec_iterator_state(final SubLObject func, final SubLObject direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, func );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw139$MT_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ) ? ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) )
        : kb_indexing.key_function_rule_index( func, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94456L)
  public static SubLObject function_rule_final_index_spec_iterator_state_func(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94587L)
  public static SubLObject function_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94716L)
  public static SubLObject function_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94905L)
  public static SubLObject function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95051L)
  public static SubLObject function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95211L)
  public static SubLObject set_function_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95353L)
  public static SubLObject set_function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95494L)
  public static SubLObject set_function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95642L)
  public static SubLObject function_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return function_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95821L)
  public static SubLObject function_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return function_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96000L)
  public static SubLObject function_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( function_rule_final_index_spec_iterator_state_current_mt_key( state ), function_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96264L)
  public static SubLObject function_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = function_rule_final_index_spec_iterator_state_note( state );
    final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == mt_keys || ( NIL == note && NIL != list_utilities.lengthE( mt_keys, ONE_INTEGER, UNPROVIDED ) && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96796L)
  public static SubLObject function_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = function_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    function_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 97098L)
  public static SubLObject function_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = function_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject func = function_rule_final_index_spec_iterator_state_func( state );
        result = function_rule_keylist_to_final_index_spec( func, keylist );
      }
      else
      {
        doneP = function_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 98084L)
  public static SubLObject function_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, $kw191$FUNCTION_RULE, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 98289L)
  public static SubLObject function_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( mt, direction );
      }
      set_function_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 99204L)
  public static SubLObject function_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == mt_keys )
    {
      return T;
    }
    if( NIL == direction_keys )
    {
      function_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str192$function_rule_iterator_quiescense, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 100167L)
  public static SubLObject function_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject func = function_rule_final_index_spec_iterator_state_func( state );
    final SubLObject direction = function_rule_final_index_spec_iterator_state_direction( state );
    SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == function_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_function_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_function_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_function_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        set_function_rule_final_index_spec_iterator_state_direction_keys( state, kb_indexing.key_function_rule_index( func, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 101449L)
  public static SubLObject function_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys( state );
    set_function_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 101744L)
  public static SubLObject do_exception_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject rule = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    rule = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$23 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      current_$23 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      if( NIL == conses_high.member( current_$23, $list123, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$23 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list193 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym194$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, rule, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec,
        ConsesLow.list( $sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw30$RULE,
            NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 102937L)
  public static SubLObject do_exception_rule_index_key_validator(final SubLObject rule, final SubLObject direction)
  {
    return makeBoolean( NIL != assertions_high.rule_assertionP( rule ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 103157L)
  public static SubLObject new_exception_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( rule ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( rule, $kw126$POS, $sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_exception_rule_final_index_spec_iterator_state( rule, direction );
    return iteration.new_iterator( state, $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym200$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 103976L)
  public static SubLObject initialize_exception_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, rule );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw139$MT_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ) ? ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) )
        : kb_indexing.key_exception_rule_index( rule, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104604L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_rule(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104736L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104866L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105056L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105203L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105364L)
  public static SubLObject set_exception_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105507L)
  public static SubLObject set_exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105649L)
  public static SubLObject set_exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105798L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return exception_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105979L)
  public static SubLObject exception_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return exception_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106160L)
  public static SubLObject exception_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( exception_rule_final_index_spec_iterator_state_current_mt_key( state ), exception_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106427L)
  public static SubLObject exception_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = exception_rule_final_index_spec_iterator_state_note( state );
    final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == mt_keys || ( NIL == note && NIL != list_utilities.lengthE( mt_keys, ONE_INTEGER, UNPROVIDED ) && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106964L)
  public static SubLObject exception_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = exception_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    exception_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 107269L)
  public static SubLObject exception_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = exception_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule( state );
        result = exception_rule_keylist_to_final_index_spec( rule, keylist );
      }
      else
      {
        doneP = exception_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 108262L)
  public static SubLObject exception_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, $kw201$EXCEPTION_RULE, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 108470L)
  public static SubLObject exception_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( mt, direction );
      }
      set_exception_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 109390L)
  public static SubLObject exception_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == mt_keys )
    {
      return T;
    }
    if( NIL == direction_keys )
    {
      exception_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str202$exception_rule_iterator_quiescens, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 110358L)
  public static SubLObject exception_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule( state );
    final SubLObject direction = exception_rule_final_index_spec_iterator_state_direction( state );
    SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == exception_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_exception_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_exception_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_exception_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        set_exception_rule_final_index_spec_iterator_state_direction_keys( state, kb_indexing.key_exception_rule_index( rule, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 111650L)
  public static SubLObject exception_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys( state );
    set_exception_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 111948L)
  public static SubLObject do_pragma_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject rule = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    rule = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      if( NIL == conses_high.member( current_$24, $list123, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list193 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym203$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, rule, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec,
        ConsesLow.list( $sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, $kw30$RULE, NIL,
            direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 113157L)
  public static SubLObject do_pragma_rule_index_key_validator(final SubLObject rule, final SubLObject direction)
  {
    return makeBoolean( NIL != assertions_high.rule_assertionP( rule ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 113359L)
  public static SubLObject new_pragma_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( rule ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( rule, $kw126$POS, $sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_pragma_rule_final_index_spec_iterator_state( rule, direction );
    return iteration.new_iterator( state, $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym209$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114158L)
  public static SubLObject initialize_pragma_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, rule );
    Vectors.set_aref( state, ONE_INTEGER, direction );
    Vectors.set_aref( state, TWO_INTEGER, $kw139$MT_KEYS_ARE_FRESH );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() ) ? ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) )
        : kb_indexing.key_pragma_rule_index( rule, UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114777L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_rule(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114906L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115033L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115220L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115364L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115522L)
  public static SubLObject set_pragma_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, TWO_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115662L)
  public static SubLObject set_pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115801L)
  public static SubLObject set_pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115947L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return pragma_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116122L)
  public static SubLObject pragma_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return pragma_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116297L)
  public static SubLObject pragma_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( pragma_rule_final_index_spec_iterator_state_current_mt_key( state ), pragma_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116555L)
  public static SubLObject pragma_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = pragma_rule_final_index_spec_iterator_state_note( state );
    final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == mt_keys || ( NIL == note && NIL != list_utilities.lengthE( mt_keys, ONE_INTEGER, UNPROVIDED ) && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 117077L)
  public static SubLObject pragma_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = pragma_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    pragma_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 117373L)
  public static SubLObject pragma_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = pragma_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule( state );
        result = pragma_rule_keylist_to_final_index_spec( rule, keylist );
      }
      else
      {
        doneP = pragma_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 118345L)
  public static SubLObject pragma_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist)
  {
    return ConsesLow.listS( pred, $kw210$PRAGMA_RULE, ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 118544L)
  public static SubLObject pragma_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( mt, direction );
      }
      set_pragma_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 119449L)
  public static SubLObject pragma_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == mt_keys )
    {
      return T;
    }
    if( NIL == direction_keys )
    {
      pragma_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str211$pragma_rule_iterator_quiescense_f, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 120402L)
  public static SubLObject pragma_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule( state );
    final SubLObject direction = pragma_rule_final_index_spec_iterator_state_direction( state );
    SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == pragma_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_pragma_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_pragma_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_pragma_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        set_pragma_rule_final_index_spec_iterator_state_direction_keys( state, kb_indexing.key_pragma_rule_index( rule, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 121664L)
  public static SubLObject pragma_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys( state );
    set_pragma_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 121953L)
  public static SubLObject do_unbound_predicate_rule_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list212 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list212 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$25 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list212 );
      current_$25 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list212 );
      if( NIL == conses_high.member( current_$25, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$25 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list212 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw125$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym213$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, sense, direction ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list(
        final_index_spec, ConsesLow.list( $sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, sense, direction ), $kw20$DONE, done ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var,
            final_index_spec, $kw30$RULE, NIL, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 123464L)
  public static SubLObject do_unbound_predicate_rule_index_key_validator(final SubLObject sense, final SubLObject direction)
  {
    return makeBoolean( ( NIL == sense || NIL != enumeration_types.sense_p( sense ) ) && ( NIL == direction || NIL != enumeration_types.direction_p( direction ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 123707L)
  public static SubLObject new_unbound_predicate_rule_final_index_spec_iterator(SubLObject sense, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLObject index_hook = auxiliary_indexing.unbound_rule_index();
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( index_hook ) )
    {
      return iteration.new_singleton_iterator( new_rule_simple_final_index_spec( index_hook, sense, $sym217$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P ) );
    }
    final SubLObject state = initialize_unbound_predicate_rule_final_index_spec_iterator_state( sense, direction );
    return iteration.new_iterator( state, $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym219$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 124559L)
  public static SubLObject initialize_unbound_predicate_rule_final_index_spec_iterator_state(final SubLObject sense, final SubLObject direction)
  {
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, direction );
    Vectors.set_aref( state, ONE_INTEGER, $kw136$SENSE_KEYS_ARE_FRESH );
    Vectors.set_aref( state, TWO_INTEGER, ( NIL != sense ) ? ConsesLow.list( sense ) : auxiliary_indexing.key_unbound_rule_index( UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( state, THREE_INTEGER, NIL );
    Vectors.set_aref( state, FOUR_INTEGER, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125184L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state)
  {
    return Vectors.aref( state, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125334L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state)
  {
    return Vectors.aref( state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125532L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state)
  {
    return Vectors.aref( state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125688L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state)
  {
    return Vectors.aref( state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125843L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state)
  {
    return Vectors.aref( state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126012L)
  public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note)
  {
    Vectors.set_aref( state, ONE_INTEGER, note );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126163L)
  public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, TWO_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126316L)
  public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, THREE_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126466L)
  public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys)
  {
    Vectors.set_aref( state, FOUR_INTEGER, new_keys );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126623L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state)
  {
    return unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126826L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state)
  {
    return unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127009L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state)
  {
    return unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127206L)
  public static SubLObject unbound_predicate_rule_current_keylist(final SubLObject state)
  {
    return ConsesLow.list( unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key( state ), unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key( state ),
        unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127579L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state)
  {
    final SubLObject note = unbound_predicate_rule_final_index_spec_iterator_state_note( state );
    final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    return makeBoolean( NIL == sense_keys || ( NIL == note && NIL != list_utilities.lengthE( sense_keys, ONE_INTEGER, UNPROVIDED ) && NIL != list_utilities.lengthLE( mt_keys, ONE_INTEGER, UNPROVIDED )
        && NIL == direction_keys ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 128282L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject final_index_spec = unbound_predicate_rule_final_index_spec_iterator_quiesce( state );
    final SubLObject doneP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    unbound_predicate_rule_final_index_spec_iterator_next_direction_key( state );
    return Values.values( final_index_spec, state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 128611L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state)
  {
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      final SubLObject keylist = unbound_predicate_rule_current_relevant_keylist( state );
      if( NIL != keylist )
      {
        result = unbound_predicate_rule_keylist_to_final_index_spec( keylist );
      }
      else
      {
        doneP = unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step( state );
      }
    }
    return Values.values( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 129563L)
  public static SubLObject unbound_predicate_rule_keylist_to_final_index_spec(final SubLObject keylist)
  {
    return reader.bq_cons( auxiliary_indexing.unbound_rule_index(), ConsesLow.append( keylist, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 129782L)
  public static SubLObject unbound_predicate_rule_current_relevant_keylist(final SubLObject state)
  {
    final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    final SubLObject sense = sense_keys.first();
    final SubLObject mt = mt_keys.first();
    final SubLObject direction = direction_keys.first();
    if( NIL != sense && NIL != mt && NIL != direction )
    {
      if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
      {
        return ConsesLow.list( sense, mt, direction );
      }
      set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 130882L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state)
  {
    final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    if( NIL == sense_keys )
    {
      return T;
    }
    if( NIL == mt_keys )
    {
      unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys( state );
    }
    else if( NIL == direction_keys )
    {
      unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys( state );
    }
    else
    {
      Errors.error( $str220$unbound_predicate_rule_iterator_q, state );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 132133L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    if( $kw136$SENSE_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_unbound_predicate_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      sense_keys = sense_keys.rest();
      set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state, sense_keys );
    }
    final SubLObject sense_key = sense_keys.first();
    if( NIL != sense_key )
    {
      if( NIL != mt_relevance_macros.only_specified_mt_is_relevantP() )
      {
        set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state, ConsesLow.list( mt_relevance_macros.$mt$.getDynamicValue( thread ) ) );
      }
      else
      {
        set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state, auxiliary_indexing.key_unbound_rule_index( sense_key, UNPROVIDED ) );
      }
      set_unbound_predicate_rule_final_index_spec_iterator_state_note( state, $kw139$MT_KEYS_ARE_FRESH );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 133373L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state)
  {
    final SubLObject direction = unbound_predicate_rule_final_index_spec_iterator_state_direction( state );
    final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys( state );
    SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state );
    if( $kw139$MT_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note( state ) )
    {
      set_unbound_predicate_rule_final_index_spec_iterator_state_note( state, NIL );
    }
    else
    {
      mt_keys = mt_keys.rest();
      set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys( state, mt_keys );
    }
    final SubLObject mt_key = mt_keys.first();
    if( NIL != mt_key )
    {
      if( NIL != direction )
      {
        set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state, ConsesLow.list( direction ) );
      }
      else
      {
        final SubLObject sense_key = sense_keys.first();
        set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state, auxiliary_indexing.key_unbound_rule_index( sense_key, mt_key ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 134799L)
  public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state)
  {
    final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state );
    set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys( state, direction_keys.rest() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 135121L)
  public static SubLObject do_mt_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list221 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list221 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list221 );
    mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$26 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list221 );
      current_$26 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list221 );
      if( NIL == conses_high.member( current_$26, $list222, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$26 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list221 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym224$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym225$DO_MT_INDEX_KEY_VALIDATOR, mt, type ), ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( final_index_spec, ConsesLow.list(
        $sym226$MT_FINAL_INDEX_SPEC, mt ) ) ), ConsesLow.listS( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, type, truth, direction, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136362L)
  public static SubLObject do_mt_index_key_validator(final SubLObject mt, final SubLObject type)
  {
    return makeBoolean( NIL != forts.fort_p( mt ) && NIL == kb_indexing.broad_mtP( mt ) && ( NIL == type || NIL != enumeration_types.assertion_type_p( type ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136609L)
  public static SubLObject mt_final_index_spec(final SubLObject mt)
  {
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( mt ) )
    {
      return new_assertion_simple_final_index_spec( mt, $sym228$MT_INDEX_ASSERTION_MATCH_P );
    }
    return reader.bq_cons( mt, $list229 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136981L)
  public static SubLObject do_other_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$27 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list230 );
      current_$27 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list230 );
      if( NIL == conses_high.member( current_$27, $list222, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$27 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list230 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym231$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym232$DO_OTHER_INDEX_KEY_VALIDATOR, v_term, type ), ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( final_index_spec, ConsesLow.list(
        $sym233$OTHER_FINAL_INDEX_SPEC, v_term ) ) ), ConsesLow.list( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, type, truth, direction, done ), ConsesLow.listS( $sym1$PWHEN, ConsesLow.list(
            $sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P, var ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138404L)
  public static SubLObject do_other_index_key_validator(final SubLObject v_term, final SubLObject type)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && ( NIL == type || NIL != enumeration_types.assertion_type_p( type ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138579L)
  public static SubLObject other_final_index_spec(final SubLObject v_term)
  {
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      return new_assertion_simple_final_index_spec( v_term, $sym236$OTHER_INDEX_ASSERTION_MATCH_P );
    }
    return reader.bq_cons( v_term, $list237 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138972L)
  public static SubLObject other_final_index_spec_p(final SubLObject final_index_spec)
  {
    return makeBoolean( NIL != other_simple_final_index_spec_p( final_index_spec ) || NIL != other_complex_final_index_spec_p( final_index_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139537L)
  public static SubLObject other_simple_final_index_spec_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.first() == $kw240$SIMPLE && conses_high.fourth( v_object ) == $sym236$OTHER_INDEX_ASSERTION_MATCH_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139698L)
  public static SubLObject other_complex_final_index_spec_p(final SubLObject v_object)
  {
    return Equality.eq( $kw241$OTHER, conses_high.second( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139794L)
  public static SubLObject other_index_assertion_match_p(final SubLObject assertion, final SubLObject v_term)
  {
    return simple_indexing.matches_other_index( assertion, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139904L)
  public static SubLObject do_other_index_assertion_match_p(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return makeBoolean( NIL != pred_relevance_macros.relevant_predP( assertions_high.gaf_arg0( assertion ) ) && NIL != mt_relevance_macros.relevant_assertionP( assertion ) );
    }
    return mt_relevance_macros.relevant_assertionP( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 140162L)
  public static SubLObject do_term_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list230 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$28 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list230 );
      current_$28 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list230 );
      if( NIL == conses_high.member( current_$28, $list222, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$28 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list230 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw19$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject final_index_spec = $sym242$FINAL_INDEX_SPEC;
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym243$DO_TERM_INDEX_KEY_VALIDATOR, v_term, type ), ConsesLow.list( $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, ConsesLow.list( final_index_spec, ConsesLow.list(
        $sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, v_term, type ), $kw20$DONE, done ), ConsesLow.list( $sym43$DO_FINAL_INDEX_FROM_SPEC, ConsesLow.list( var, final_index_spec, type, truth, direction, done ), ConsesLow
            .listS( $sym1$PWHEN, ConsesLow.list( $sym245$DO_TERM_INDEX_ASSERTION_MATCH_P, var, final_index_spec ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 141721L)
  public static SubLObject do_term_index_key_validator(final SubLObject v_term, final SubLObject type)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && ( NIL == type || NIL != enumeration_types.assertion_type_p( type ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 141898L)
  public static SubLObject new_term_final_index_spec_iterator(final SubLObject v_term, final SubLObject type)
  {
    SubLObject iterators = NIL;
    if( NIL == type || $kw28$GAF == type )
    {
      if( NIL != do_gaf_arg_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_gaf_arg_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_predicate_extent_index_key_validator( v_term ) )
      {
        iterators = ConsesLow.cons( new_predicate_extent_final_index_spec_iterator( v_term ), iterators );
      }
      if( NIL != do_nart_arg_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_nart_arg_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_function_extent_index_key_validator( v_term ) )
      {
        iterators = ConsesLow.cons( iteration.new_singleton_iterator( function_extent_final_index_spec( v_term ) ), iterators );
      }
    }
    if( NIL == type || $kw30$RULE == type )
    {
      if( NIL != do_predicate_rule_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_predicate_rule_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_isa_rule_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_isa_rule_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_genls_rule_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_genls_rule_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_genl_mt_rule_index_key_validator( v_term, NIL, NIL ) )
      {
        iterators = ConsesLow.cons( new_genl_mt_rule_final_index_spec_iterator( v_term, UNPROVIDED, UNPROVIDED ), iterators );
      }
      if( NIL != do_function_rule_index_key_validator( v_term, NIL ) )
      {
        iterators = ConsesLow.cons( new_function_rule_final_index_spec_iterator( v_term, UNPROVIDED ), iterators );
      }
      if( NIL != do_exception_rule_index_key_validator( v_term, NIL ) )
      {
        iterators = ConsesLow.cons( new_exception_rule_final_index_spec_iterator( v_term, UNPROVIDED ), iterators );
      }
      if( NIL != do_pragma_rule_index_key_validator( v_term, NIL ) )
      {
        iterators = ConsesLow.cons( new_pragma_rule_final_index_spec_iterator( v_term, UNPROVIDED ), iterators );
      }
    }
    if( NIL != do_mt_index_key_validator( v_term, NIL ) )
    {
      iterators = ConsesLow.cons( iteration.new_singleton_iterator( mt_final_index_spec( v_term ) ), iterators );
    }
    if( NIL != do_other_index_key_validator( v_term, NIL ) )
    {
      iterators = ConsesLow.cons( iteration.new_singleton_iterator( other_final_index_spec( v_term ) ), iterators );
    }
    return iteration.new_iterator_iterator( Sequences.nreverse( iterators ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 144091L)
  public static SubLObject do_term_index_assertion_match_p(final SubLObject assertion, final SubLObject final_index_spec)
  {
    if( NIL != other_final_index_spec_p( final_index_spec ) )
    {
      return mt_relevance_macros.relevant_assertionP( assertion );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 144394L)
  public static SubLObject do_broad_mt_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$29 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list247 );
      current_$29 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list247 );
      if( NIL == conses_high.member( current_$29, $list248, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$29 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list247 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR, mt, type ), ConsesLow.list( $sym39$SOME_ASSERTIONS, ConsesLow.list( var, $kw35$PROGRESS_MESSAGE, $str250$do_broad_mt_index,
        $kw20$DONE, done ), ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym251$DO_BROAD_MT_INDEX_MATCH_P, var, mt, type, truth ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145092L)
  public static SubLObject do_broad_mt_index_key_validator(final SubLObject mt, final SubLObject type)
  {
    return makeBoolean( NIL != hlmt.hlmt_p( mt ) && ( NIL == type || NIL != enumeration_types.assertion_type_p( type ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145273L)
  public static SubLObject do_broad_mt_index_match_p(final SubLObject assertion, final SubLObject mt, final SubLObject type, final SubLObject truth)
  {
    return makeBoolean( mt.equal( assertions_high.assertion_mt( assertion ) ) && ( NIL == type || NIL != assertions_high.assertion_has_type( assertion, type ) ) && ( NIL == truth || NIL != assertions_high
        .assertion_has_truth( assertion, truth ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145583L)
  public static SubLObject do_hlmt_contents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list253 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_hlmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list253 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list253 );
    v_hlmt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$30 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list253 );
      current_$30 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list253 );
      if( NIL == conses_high.member( current_$30, $list248, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$30 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list253 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym254$WITH_JUST_MT, v_hlmt, ConsesLow.list( $sym255$DO_OVERLAP_INDEX, ConsesLow.list( var, ConsesLow.list( $sym256$FLATTEN, v_hlmt ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.list(
        $sym1$PWHEN, ConsesLow.list( $sym11$COR, ConsesLow.list( $sym12$NULL, type ), ConsesLow.list( EQ, type, ConsesLow.list( $sym257$ASSERTION_TYPE, var ) ) ), ConsesLow.listS( $sym1$PWHEN, ConsesLow.list(
            $sym258$HLMT_EQUAL_, v_hlmt, ConsesLow.list( $sym259$ASSERTION_HLMT, var ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 146316L)
  public static SubLObject do_mt_contents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list247 );
    mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$31 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list247 );
      current_$31 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list247 );
      if( NIL == conses_high.member( current_$31, $list248, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$31 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list247 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw223$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym260$PCASE, ConsesLow.list( $sym261$DO_MT_CONTENTS_METHOD, mt ), ConsesLow.list( $kw262$MT, ConsesLow.listS( $sym227$DO_MT_INDEX, ConsesLow.list( var, mt, $kw223$TYPE, type, $kw18$TRUTH,
        truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $kw263$BROAD_MT, ConsesLow.listS( $sym252$DO_BROAD_MT_INDEX, ConsesLow.list( var, mt, $kw223$TYPE, type, $kw18$TRUTH, truth,
            $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), $list264 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 147199L)
  public static SubLObject do_mt_contents_method(final SubLObject mt)
  {
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return ( NIL != kb_indexing.broad_mtP( mt ) ) ? $kw263$BROAD_MT : $kw262$MT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 147355L)
  public static SubLObject do_overlap_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject terms = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    terms = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$32 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list267 );
      current_$32 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list267 );
      if( NIL == conses_high.member( current_$32, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$32 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list267 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym25$DO_ASSERTION_LIST, ConsesLow.list( assertion_var, ConsesLow.list( $sym269$GATHER_OVERLAP_INDEX, terms ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 148027L)
  public static SubLObject do_gafs_potentially_matching_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    asent = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$33 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list270 );
      current_$33 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list270 );
      if( NIL == conses_high.member( current_$33, $list271, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$33 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list270 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw272$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym273$DO_BEST_GAF_LOOKUP_INDEX, ConsesLow.list( assertion_var, asent, $kw272$METHODS, v_methods, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 148887L)
  public static SubLObject do_best_gaf_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    asent = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$34 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list270 );
      current_$34 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list270 );
      if( NIL == conses_high.member( current_$34, $list271, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$34 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list270 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw272$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym274$DO_GAF_LOOKUP_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym275$BEST_GAF_LOOKUP_INDEX, asent, truth, v_methods ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 149954L)
  public static SubLObject do_gaf_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$35 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      current_$35 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      if( NIL == conses_high.member( current_$35, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$35 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list276 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject l_index = $sym277$L_INDEX;
    final SubLObject method = $sym278$METHOD;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( l_index, lookup_index ), ConsesLow.list( method, ConsesLow.list( $sym279$DO_GLI_EXTRACT_METHOD, l_index ) ) ), ConsesLow.list( $sym260$PCASE,
        method, ConsesLow.list( $kw75$GAF_ARG, ConsesLow.listS( $sym280$DO_GLI_VIA_GAF_ARG, ConsesLow.list( assertion_var, l_index, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow
            .list( $kw97$PREDICATE_EXTENT, ConsesLow.listS( $sym281$DO_GLI_VIA_PREDICATE_EXTENT, ConsesLow.list( assertion_var, l_index, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ),
        ConsesLow.list( $kw282$OVERLAP, ConsesLow.listS( $sym283$DO_GLI_VIA_OVERLAP, ConsesLow.list( assertion_var, l_index, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $sym284$OTHERWISE, ConsesLow.list( $sym285$DO_GLI_METHOD_ERROR, l_index, method ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 150780L)
  public static SubLObject do_gli_extract_method(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw286$INDEX_TYPE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 150950L)
  public static SubLObject do_gli_method_error(final SubLObject lookup_index, final SubLObject method)
  {
    if( NIL == lookup_index )
    {
      return NIL;
    }
    return Errors.cerror( $str287$Skip_iteration, $str288$Unsupported_method__S_in__S_in_DO, method, lookup_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 151250L)
  public static SubLObject do_gli_via_gaf_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$36 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      current_$36 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      if( NIL == conses_high.member( current_$36, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$36 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list276 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject v_term = $sym289$TERM;
    final SubLObject argnum = $sym290$ARGNUM;
    final SubLObject predicate = $sym291$PREDICATE;
    return ConsesLow.list( $sym292$CMULTIPLE_VALUE_BIND, ConsesLow.list( v_term, argnum, predicate ), ConsesLow.list( $sym293$DO_GLI_VGA_EXTRACT_KEYS, lookup_index ), ConsesLow.list( $sym294$PIF, argnum, ConsesLow.list(
        $sym294$PIF, predicate, ConsesLow.listS( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[]
        { assertion_var, v_term, $kw55$INDEX, argnum, $kw56$PREDICATE, predicate, $kw18$TRUTH, truth, $kw20$DONE, done
        } ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw55$INDEX, argnum, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body,
            NIL ) ) ), ConsesLow.list( $sym294$PIF, predicate, ConsesLow.listS( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw56$PREDICATE, predicate, $kw18$TRUTH, truth, $kw20$DONE, done ),
                ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym61$DO_GAF_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152053L)
  public static SubLObject do_gli_vga_extract_keys(final SubLObject lookup_index)
  {
    return subl_promotions.values3( kb_indexing.lookup_index_get_property( lookup_index, $kw295$TERM, UNPROVIDED ), kb_indexing.lookup_index_get_property( lookup_index, $kw296$ARGNUM, UNPROVIDED ), kb_indexing
        .lookup_index_get_property( lookup_index, $kw56$PREDICATE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152322L)
  public static SubLObject do_gli_via_predicate_extent(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$37 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      current_$37 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      if( NIL == conses_high.member( current_$37, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$37 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list276 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym90$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym297$DO_GLI_VPE_EXTRACT_KEY, lookup_index ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body,
        NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152624L)
  public static SubLObject do_gli_vpe_extract_key(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw56$PREDICATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152784L)
  public static SubLObject do_gli_via_overlap(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$38 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      current_$38 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      if( NIL == conses_high.member( current_$38, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$38 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list276 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym255$DO_OVERLAP_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym298$DO_GLI_VO_EXTRACT_KEY, lookup_index ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 153056L)
  public static SubLObject do_gli_vo_extract_key(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw299$TERMS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 153202L)
  public static SubLObject do_narts_potentially_matching_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject nart_var = NIL;
    SubLObject nart_hl_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    nart_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    nart_hl_formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$39 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list300 );
      current_$39 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list300 );
      if( NIL == conses_high.member( current_$39, $list301, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$39 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw272$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject tou_var = $sym302$TOU_VAR;
    return ConsesLow.list( $sym303$DO_BEST_NAT_LOOKUP_INDEX, ConsesLow.list( tou_var, nart_hl_formula, $kw272$METHODS, v_methods, $kw20$DONE, done ), ConsesLow.listS( $sym47$CLET, ConsesLow.list( ConsesLow.list(
        nart_var, ConsesLow.list( $sym118$GAF_ARG1, tou_var ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 154291L)
  public static SubLObject do_term_of_unit_assertions_potentially_matching_nat_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject nart_hl_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    nart_hl_formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$40 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list304 );
      current_$40 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list304 );
      if( NIL == conses_high.member( current_$40, $list301, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$40 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list304 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw272$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym303$DO_BEST_NAT_LOOKUP_INDEX, ConsesLow.list( assertion_var, nart_hl_formula, $kw272$METHODS, v_methods, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 154938L)
  public static SubLObject do_best_nat_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject nart_hl_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    nart_hl_formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$41 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list304 );
      current_$41 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list304 );
      if( NIL == conses_high.member( current_$41, $list301, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$41 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list304 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw272$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym305$DO_NAT_LOOKUP_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym306$BEST_NAT_LOOKUP_INDEX, nart_hl_formula, v_methods ), $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 155915L)
  public static SubLObject do_nat_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$42 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      current_$42 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      if( NIL == conses_high.member( current_$42, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$42 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list307 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject l_index = $sym308$L_INDEX;
    final SubLObject method = $sym309$METHOD;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( l_index, lookup_index ), ConsesLow.list( method, ConsesLow.list( $sym310$DO_NLI_EXTRACT_METHOD, l_index ) ) ), ConsesLow.list( $sym260$PCASE,
        method, ConsesLow.list( $kw107$NART_ARG, ConsesLow.listS( $sym311$DO_NLI_VIA_NART_ARG, ConsesLow.list( assertion_var, l_index, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $kw312$FUNCTION_EXTENT, ConsesLow.listS( $sym313$DO_NLI_VIA_FUNCTION_EXTENT, ConsesLow.list( assertion_var, l_index, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $kw282$OVERLAP,
                ConsesLow.listS( $sym314$DO_NLI_VIA_OVERLAP, ConsesLow.list( assertion_var, l_index, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym284$OTHERWISE, ConsesLow.list(
                    $sym315$DO_NLI_METHOD_ERROR, l_index, method ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 156567L)
  public static SubLObject do_nli_extract_method(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw286$INDEX_TYPE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 156737L)
  public static SubLObject do_nli_method_error(final SubLObject lookup_index, final SubLObject method)
  {
    if( NIL == lookup_index )
    {
      return NIL;
    }
    return Errors.cerror( $str287$Skip_iteration, $str316$Unsupported_method__S_in__S_in_DO, method, lookup_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 157037L)
  public static SubLObject do_nli_via_nart_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$43 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      current_$43 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      if( NIL == conses_high.member( current_$43, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$43 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list307 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject v_term = $sym317$TERM;
    final SubLObject argnum = $sym318$ARGNUM;
    final SubLObject functor = $sym319$FUNCTOR;
    return ConsesLow.list( $sym292$CMULTIPLE_VALUE_BIND, ConsesLow.list( v_term, argnum, functor ), ConsesLow.list( $sym320$DO_NLI_VNA_EXTRACT_KEYS, lookup_index ), ConsesLow.list( $sym294$PIF, argnum, ConsesLow.list(
        $sym294$PIF, functor, ConsesLow.listS( $sym104$DO_NART_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw55$INDEX, argnum, $kw100$FUNCTION, functor, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ),
        ConsesLow.listS( $sym104$DO_NART_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw55$INDEX, argnum, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym294$PIF, functor, ConsesLow
            .listS( $sym104$DO_NART_ARG_INDEX, ConsesLow.list( assertion_var, v_term, $kw100$FUNCTION, functor, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym104$DO_NART_ARG_INDEX, ConsesLow
                .list( assertion_var, v_term, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 157741L)
  public static SubLObject do_nli_vna_extract_keys(final SubLObject lookup_index)
  {
    return Values.values( kb_indexing.lookup_index_get_property( lookup_index, $kw295$TERM, UNPROVIDED ), kb_indexing.lookup_index_get_property( lookup_index, $kw296$ARGNUM, UNPROVIDED ), kb_indexing
        .lookup_index_get_property( lookup_index, $kw321$FUNCTOR, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158013L)
  public static SubLObject do_nli_via_function_extent(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list307 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$44 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      current_$44 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list307 );
      if( NIL == conses_high.member( current_$44, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$44 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list307 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym114$DO_FUNCTION_EXTENT_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym322$DO_NLI_VFE_EXTRACT_KEY, lookup_index ), $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158283L)
  public static SubLObject do_nli_vfe_extract_key(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw321$FUNCTOR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158440L)
  public static SubLObject do_nli_via_overlap(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject lookup_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    lookup_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$45 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      current_$45 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list276 );
      if( NIL == conses_high.member( current_$45, $list268, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$45 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list276 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw18$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym255$DO_OVERLAP_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym323$DO_NLI_VO_EXTRACT_KEY, lookup_index ), $kw18$TRUTH, truth, $kw20$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158712L)
  public static SubLObject do_nli_vo_extract_key(final SubLObject lookup_index)
  {
    return kb_indexing.lookup_index_get_property( lookup_index, $kw299$TERMS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158858L)
  public static SubLObject simple_final_index_spec_p(final SubLObject final_index_spec)
  {
    return Equality.eq( $kw240$SIMPLE, final_index_spec.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 159493L)
  public static SubLObject simple_final_index_spec_term(final SubLObject final_index_spec)
  {
    return conses_high.second( final_index_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 159593L)
  public static SubLObject new_final_index_iterator(final SubLObject final_index_spec, SubLObject type, SubLObject truth, SubLObject direction)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != simple_final_index_spec_p( final_index_spec ) )
    {
      final SubLObject assertions = simple_term_assertion_list_filtered( final_index_spec, type, truth, direction );
      final SubLObject syntactic_iterator = iteration.new_list_iterator( assertions );
      final SubLObject semantic_iterator = iteration.new_filter_iterator_without_values( syntactic_iterator, $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_, ConsesLow.list( final_index_spec ),
          UNPROVIDED );
      return semantic_iterator;
    }
    final SubLObject iterator = hl_interface_infrastructure.new_hl_store_iterator( ConsesLow.list( $sym325$FINAL_INDEX_ITERATOR_FILTERED, ConsesLow.list( $sym326$QUOTE, final_index_spec ), type, truth, direction ),
        ONE_INTEGER );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 160748L)
  public static SubLObject assertion_semantically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject simple = NIL;
    SubLObject v_term = NIL;
    SubLObject type = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( simple_final_index_spec, simple_final_index_spec, $list327 );
    simple = simple_final_index_spec.first();
    SubLObject current = simple_final_index_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, simple_final_index_spec, $list327 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, simple_final_index_spec, $list327 );
    type = current.first();
    current = ( rest = current.rest() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw240$SIMPLE != simple )
    {
      Errors.error( $str328$Unexpected_non_simple_index__s, simple_final_index_spec );
    }
    if( $kw28$GAF == type )
    {
      SubLObject current_$47;
      final SubLObject datum_$46 = current_$47 = rest;
      SubLObject argnum_spec = NIL;
      SubLObject pred_spec = NIL;
      SubLObject mt_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$47, datum_$46, $list329 );
      argnum_spec = current_$47.first();
      current_$47 = current_$47.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$47, datum_$46, $list329 );
      pred_spec = current_$47.first();
      current_$47 = current_$47.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$47, datum_$46, $list329 );
      mt_spec = current_$47.first();
      current_$47 = current_$47.rest();
      if( NIL == current_$47 )
      {
        if( NIL == mt_spec && NIL == assertion_utilities.assertion_matches_mtP( assertion ) )
        {
          return NIL;
        }
        if( NIL == pred_spec && NIL == pred_relevance_macros.all_preds_are_relevantP() )
        {
          final SubLObject pred = assertions_high.gaf_predicate( assertion );
          if( NIL == pred_relevance_macros.relevant_predP( pred ) )
          {
            return NIL;
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$46, $list329 );
      }
    }
    else
    {
      if( $kw330$NART == type )
      {
        return T;
      }
      if( $kw30$RULE == type )
      {
        if( NIL == assertion_utilities.assertion_matches_mtP( assertion ) )
        {
          return NIL;
        }
      }
      else if( NIL == type )
      {
        SubLObject current_$48;
        final SubLObject datum_$47 = current_$48 = rest;
        SubLObject assertion_func = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$48, datum_$47, $list331 );
        assertion_func = current_$48.first();
        current_$48 = current_$48.rest();
        if( NIL == current_$48 )
        {
          if( $sym228$MT_INDEX_ASSERTION_MATCH_P == assertion_func )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$47, $list331 );
        }
        if( NIL == assertion_utilities.assertion_matches_mtP( assertion ) )
        {
          return NIL;
        }
      }
      else
      {
        Errors.error( $str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 162261L)
  public static SubLObject destroy_final_index_iterator(final SubLObject final_index_iterator)
  {
    return iteration.iteration_finalize( final_index_iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 162499L)
  public static SubLObject do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$50 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list333 );
      current_$50 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list333 );
      if( NIL == conses_high.member( current_$50, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$50 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list333 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject assertion_var = $sym334$ASSERTION_VAR;
    final SubLObject clause_struc = $sym335$CLAUSE_STRUC;
    return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( assertion_var, assertion ) ), ConsesLow.list( $sym82$PIF_FEATURE, $kw83$CYC_ALEXANDRIA, ConsesLow.list( $sym294$PIF, ConsesLow.list(
        $sym336$ASSERTION_GAF_P, assertion_var ), ConsesLow.list( $sym337$DO_ITERATOR_WITHOUT_VALUES, ConsesLow.list( var, ConsesLow.listS( $sym338$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR, ConsesLow.list(
            $sym339$FIRST, ConsesLow.list( $sym340$SECOND, ConsesLow.list( $sym341$ASSERTION_CNF, assertion_var ) ) ), $list342 ), $kw20$DONE, done ), ConsesLow.list( $sym343$PUNLESS, ConsesLow.list( $sym344$KBEQ, var,
                assertion_var ), reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( $sym337$DO_ITERATOR_WITHOUT_VALUES, ConsesLow.list( var, ConsesLow.list(
                    $sym345$NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR, ConsesLow.list( $sym341$ASSERTION_CNF, assertion_var ) ), $kw20$DONE, done ), ConsesLow.list( $sym343$PUNLESS, ConsesLow.list( $sym344$KBEQ, var,
                        assertion_var ), reader.bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) ) ) ) ), ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( clause_struc, ConsesLow.list(
                            $sym346$ASSERTION_CLAUSE_STRUC, assertion_var ) ) ), ConsesLow.list( $sym1$PWHEN, clause_struc, ConsesLow.list( $sym347$CDOLIST, ConsesLow.list( var, ConsesLow.list(
                                $sym348$CLAUSE_STRUC_ASSERTIONS, clause_struc ) ), ConsesLow.list( $sym343$PUNLESS, ConsesLow.list( $sym344$KBEQ, var, assertion_var ), ConsesLow.list( $sym343$PUNLESS, done, reader
                                    .bq_cons( $sym6$PROGN, ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 164308L)
  public static SubLObject new_do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list349 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list349 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list349 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$51 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list349 );
      current_$51 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list349 );
      if( NIL == conses_high.member( current_$51, $list350, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$51 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list349 );
    }
    final SubLObject exclusiveP_tail = cdestructuring_bind.property_list_member( $kw351$EXCLUSIVE_, current );
    final SubLObject exclusiveP = ( NIL != exclusiveP_tail ) ? conses_high.cadr( exclusiveP_tail ) : T;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !assertion.isAtom() )
    {
      final SubLObject assertion_var = $sym352$ASSERTION_VAR;
      return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( assertion_var, assertion ) ), ConsesLow.listS( $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, ConsesLow.list( var, assertion_var,
          $kw351$EXCLUSIVE_, exclusiveP, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( !exclusiveP.isAtom() )
    {
      final SubLObject exclusive_var = $sym354$EXCLUSIVE_VAR;
      return ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( exclusive_var, exclusiveP ) ), ConsesLow.listS( $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, ConsesLow.list( var, assertion,
          $kw351$EXCLUSIVE_, exclusive_var, $kw20$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.list( $sym337$DO_ITERATOR_WITHOUT_VALUES, ConsesLow.list( var, ConsesLow.list( $sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, assertion ), $kw20$DONE, done ), ConsesLow.listS(
        $sym343$PUNLESS, ConsesLow.list( $sym356$CAND, exclusiveP, ConsesLow.list( $sym344$KBEQ, var, assertion ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 165565L)
  public static SubLObject new_assertions_with_same_assertion_formula_iterator(final SubLObject assertion)
  {
    final SubLObject clause_struc = assertions_low.assertion_clause_struc( assertion );
    if( NIL != clause_struc )
    {
      return iteration.new_list_iterator( clause_strucs.clause_struc_assertions( clause_struc ) );
    }
    return iteration.new_singleton_iterator( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 166201L)
  public static SubLObject assertions_with_same_assertion_formula_p(final SubLObject assertion1, final SubLObject assertion2)
  {
    assert NIL != assertion_handles.assertion_p( assertion1 ) : assertion1;
    assert NIL != assertion_handles.assertion_p( assertion2 ) : assertion2;
    if( NIL != kb_utilities.kbeq( assertion1, assertion2 ) )
    {
      return T;
    }
    final SubLObject clause_struc1 = assertions_low.assertion_clause_struc( assertion1 );
    final SubLObject clause_struc2 = assertions_low.assertion_clause_struc( assertion2 );
    return makeBoolean( NIL != clause_strucs.clause_struc_p( clause_struc1 ) && NIL != kb_utilities.kbeq( clause_struc1, clause_struc2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 166897L)
  public static SubLObject final_index_iterator_filtered(final SubLObject final_index_spec, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec)
  {
    SubLObject v_term = NIL;
    SubLObject keys = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( final_index_spec, final_index_spec, $list358 );
    v_term = final_index_spec.first();
    final SubLObject current = keys = final_index_spec.rest();
    final SubLObject final_index = kb_indexing.get_subindex( v_term, keys );
    if( NIL == final_index )
    {
      return NIL;
    }
    assert NIL != kb_indexing_datastructures.final_index_p( final_index ) : final_index;
    final SubLObject raw_iterator = kb_indexing_datastructures.new_final_index_base_iterator( final_index );
    final SubLObject filtered_iterator = iteration.new_filter_iterator_without_values( raw_iterator, $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_, ConsesLow.list( type_spec, truth_spec, direction_spec ),
        UNPROVIDED );
    return filtered_iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 167981L)
  public static SubLObject new_gaf_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject predicate_spec, final SubLObject mt_spec)
  {
    return ConsesLow.list( $kw240$SIMPLE, v_term, $kw28$GAF, argnum_spec, predicate_spec, mt_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 168508L)
  public static SubLObject new_nart_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject functor_spec)
  {
    return ConsesLow.list( $kw240$SIMPLE, v_term, $kw330$NART, argnum_spec, functor_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 168976L)
  public static SubLObject new_rule_simple_final_index_spec(final SubLObject v_term, final SubLObject sense_spec, final SubLObject asent_func)
  {
    return ConsesLow.list( $kw240$SIMPLE, v_term, $kw30$RULE, sense_spec, asent_func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169526L)
  public static SubLObject new_assertion_simple_final_index_spec(final SubLObject v_term, final SubLObject assertion_func)
  {
    return ConsesLow.list( $kw240$SIMPLE, v_term, NIL, assertion_func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
  public static SubLObject clear_simple_term_assertion_list_filtered()
  {
    final SubLObject cs = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
  public static SubLObject remove_simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $simple_term_assertion_list_filtered_caching_state$.getGlobalValue(), ConsesLow.list( simple_final_index_spec, type, truth, direction ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
  public static SubLObject simple_term_assertion_list_filtered_internal(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction)
  {
    SubLObject result = NIL;
    final SubLObject v_term = simple_final_index_spec_term( simple_final_index_spec );
    SubLObject cdolist_list_var = kb_indexing_datastructures.simple_term_assertion_list( v_term );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_syntactically_matches_simple_final_index_specP( assertion, simple_final_index_spec ) && NIL != assertion_utilities.assertion_matches_type_truth_and_directionP( assertion, type, truth,
          direction ) )
      {
        result = ConsesLow.cons( assertion, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
  public static SubLObject simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction)
  {
    SubLObject caching_state = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED, $sym362$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_, $int363$512, EQUAL, FOUR_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym364$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( simple_final_index_spec, type, truth, direction );
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
        if( simple_final_index_spec.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( type.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( truth.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && direction.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( simple_term_assertion_list_filtered_internal( simple_final_index_spec, type, truth, direction ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( simple_final_index_spec, type, truth, direction ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 170733L)
  public static SubLObject assertion_syntactically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject simple = NIL;
    SubLObject v_term = NIL;
    SubLObject type = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( simple_final_index_spec, simple_final_index_spec, $list327 );
    simple = simple_final_index_spec.first();
    SubLObject current = simple_final_index_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, simple_final_index_spec, $list327 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, simple_final_index_spec, $list327 );
    type = current.first();
    current = ( rest = current.rest() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw240$SIMPLE != simple )
    {
      Errors.error( $str328$Unexpected_non_simple_index__s, simple_final_index_spec );
    }
    if( NIL != assertion_matches_syntactic_indexing_typeP( assertion, type ) )
    {
      if( $kw28$GAF == type )
      {
        return gaf_syntactically_matches_simple_gaf_final_index_specP( assertion, v_term, rest );
      }
      if( $kw330$NART == type )
      {
        return tou_syntactically_matches_simple_nart_final_index_specP( assertion, v_term, rest );
      }
      if( $kw30$RULE == type )
      {
        return rule_syntactically_matches_simple_rule_final_index_specP( assertion, v_term, rest );
      }
      if( NIL == type )
      {
        return assertion_syntactically_matches_simple_assertion_final_index_specP( assertion, v_term, rest );
      }
      Errors.error( $str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 171980L)
  public static SubLObject assertion_matches_syntactic_indexing_typeP(final SubLObject assertion, final SubLObject type)
  {
    if( $kw330$NART == type )
    {
      return function_terms.term_of_unit_assertion_p( assertion );
    }
    return assertion_utilities.assertion_matches_typeP( assertion, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 172186L)
  public static SubLObject gaf_syntactically_matches_simple_gaf_final_index_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject gaf_final_index_spec)
  {
    SubLObject argnum_spec = NIL;
    SubLObject predicate_spec = NIL;
    SubLObject mt_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( gaf_final_index_spec, gaf_final_index_spec, $list365 );
    argnum_spec = gaf_final_index_spec.first();
    SubLObject current = gaf_final_index_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, gaf_final_index_spec, $list365 );
    predicate_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, gaf_final_index_spec, $list365 );
    mt_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( ( NIL == predicate_spec || NIL != assertion_utilities.gaf_assertion_has_pred_p( gaf, predicate_spec ) ) && NIL != gaf_matches_simple_argnum_specP( gaf, v_term, argnum_spec ) && ( NIL == mt_spec
          || NIL != assertions_high.assertion_has_mtP( gaf, mt_spec ) ) )
      {
        return T;
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( gaf_final_index_spec, $list365 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 172609L)
  public static SubLObject gaf_matches_simple_argnum_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject argnum_spec)
  {
    if( NIL == argnum_spec )
    {
      return T;
    }
    if( $kw71$ANY == argnum_spec )
    {
      return assertion_utilities.gaf_has_term_in_some_argnumP( gaf, v_term );
    }
    if( argnum_spec.isInteger() )
    {
      return assertion_utilities.gaf_has_term_in_argnumP( gaf, v_term, argnum_spec );
    }
    if( !argnum_spec.isCons() || NIL == list_utilities.lengthE( argnum_spec, TWO_INTEGER, UNPROVIDED ) || !argnum_spec.first().isInteger() )
    {
      return NIL;
    }
    SubLObject n = NIL;
    SubLObject m = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( argnum_spec, argnum_spec, $list366 );
    n = argnum_spec.first();
    SubLObject current = argnum_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, argnum_spec, $list366 );
    m = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( argnum_spec, $list366 );
      return NIL;
    }
    final SubLObject subformula = assertions_high.gaf_arg( gaf, n );
    assert NIL != el_utilities.el_formula_p( subformula ) : subformula;
    if( m == $kw71$ANY )
    {
      return el_utilities.term_is_one_of_argsP( v_term, subformula );
    }
    return el_utilities.formula_has_term_in_argnumP( subformula, v_term, m );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 173775L)
  public static SubLObject tou_syntactically_matches_simple_nart_final_index_specP(final SubLObject tou_gaf, final SubLObject v_term, final SubLObject nart_final_index_spec)
  {
    SubLObject argnum_spec = NIL;
    SubLObject functor_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( nart_final_index_spec, nart_final_index_spec, $list368 );
    argnum_spec = nart_final_index_spec.first();
    SubLObject current = nart_final_index_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, nart_final_index_spec, $list368 );
    functor_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return simple_indexing.matches_nart_arg_index( tou_gaf, v_term, ( $kw71$ANY == argnum_spec ) ? NIL : argnum_spec, functor_spec );
    }
    cdestructuring_bind.cdestructuring_bind_error( nart_final_index_spec, $list368 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 174064L)
  public static SubLObject rule_syntactically_matches_simple_rule_final_index_specP(final SubLObject rule, final SubLObject v_term, final SubLObject rule_final_index_spec)
  {
    SubLObject sense = NIL;
    SubLObject asent_func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( rule_final_index_spec, rule_final_index_spec, $list369 );
    sense = rule_final_index_spec.first();
    SubLObject current = rule_final_index_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, rule_final_index_spec, $list369 );
    asent_func = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP( rule, sense, v_term, asent_func ) )
      {
        return T;
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( rule_final_index_spec, $list369 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 174520L)
  public static SubLObject rule_syntactically_matches_simple_rule_final_index_spec_intP(final SubLObject rule, final SubLObject sense, final SubLObject v_term, final SubLObject asent_func)
  {
    if( NIL == sense )
    {
      return makeBoolean( NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP( rule, $kw127$NEG, v_term, asent_func ) || NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP( rule,
          $kw126$POS, v_term, asent_func ) );
    }
    if( NIL != assertion_handles.valid_assertion_handleP( rule ) )
    {
      final SubLObject asents = clauses.clause_sense_lits( assertions_high.assertion_cnf( rule ), sense );
      SubLObject match = NIL;
      if( NIL == match )
      {
        SubLObject csome_list_var;
        SubLObject asent;
        for( csome_list_var = asents, asent = NIL, asent = csome_list_var.first(); NIL == match && NIL != csome_list_var; match = asent_syntactically_matches_simple_rule_final_index_specP( asent, v_term,
            asent_func ), csome_list_var = csome_list_var.rest(), asent = csome_list_var.first() )
        {
        }
      }
      return match;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175121L)
  public static SubLObject asent_syntactically_matches_simple_rule_final_index_specP(final SubLObject asent, final SubLObject v_term, final SubLObject asent_func)
  {
    SubLObject result = NIL;
    if( asent_func.eql( $sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = predicate_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym154$ISA_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = isa_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym170$GENLS_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = genls_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = genl_mt_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = function_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = exception_rule_index_asent_match_p( asent, v_term );
    }
    else if( asent_func.eql( $sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P ) )
    {
      result = pragma_rule_index_asent_match_p( asent, v_term );
    }
    else
    {
      result = Functions.funcall( asent_func, asent, v_term );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175540L)
  public static SubLObject assertion_syntactically_matches_simple_assertion_final_index_specP(final SubLObject assertion, final SubLObject v_term, final SubLObject assertion_final_index_spec)
  {
    SubLObject assertion_func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( assertion_final_index_spec, assertion_final_index_spec, $list331 );
    assertion_func = assertion_final_index_spec.first();
    final SubLObject current = assertion_final_index_spec.rest();
    if( NIL == current )
    {
      SubLObject result = NIL;
      final SubLObject pcase_var = assertion_func;
      if( pcase_var.eql( $sym228$MT_INDEX_ASSERTION_MATCH_P ) )
      {
        result = mt_index_assertion_match_p( assertion, v_term );
      }
      else
      {
        result = Functions.funcall( assertion_func, assertion, v_term );
      }
      return result;
    }
    cdestructuring_bind.cdestructuring_bind_error( assertion_final_index_spec, $list331 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175868L)
  public static SubLObject predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate)
  {
    return makeBoolean( predicate.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != predicate_rule_index_asent_p( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 176118L)
  public static SubLObject predicate_rule_index_asent_p(final SubLObject asent)
  {
    if( NIL == forts.fort_p( cycl_utilities.atomic_sentence_predicate( asent ) ) )
    {
      return NIL;
    }
    final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate( asent );
    if( pcase_var.eql( $const155$isa ) )
    {
      return makeBoolean( NIL == isa_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const171$genls ) )
    {
      return makeBoolean( NIL == genls_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const179$genlMt ) )
    {
      return makeBoolean( NIL == genl_mt_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const120$termOfUnit ) )
    {
      return makeBoolean( NIL == function_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const370$abnormal ) )
    {
      return makeBoolean( NIL == exception_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const371$meetsPragmaticRequirement ) )
    {
      return makeBoolean( NIL == pragma_rule_index_asent_p( asent ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 177121L)
  public static SubLObject decontextualized_ist_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate)
  {
    return makeBoolean( NIL != el_utilities.ist_predicateP( cycl_utilities.atomic_sentence_predicate( asent ), kb_indexing.spec_preds_of_ist_indexing_enabledP() ) && predicate.eql( el_utilities.literal_predicate(
        cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), UNPROVIDED ) ) && NIL != decontextualized_ist_predicate_rule_index_asent_p( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 177485L)
  public static SubLObject decontextualized_ist_predicate_rule_index_asent_p(final SubLObject asent)
  {
    if( NIL == el_utilities.ist_predicateP( cycl_utilities.atomic_sentence_predicate( asent ), kb_indexing.spec_preds_of_ist_indexing_enabledP() ) )
    {
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject pred = pcase_var = el_utilities.literal_predicate( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), UNPROVIDED );
    if( pcase_var.eql( $const155$isa ) )
    {
      return makeBoolean( NIL == isa_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const171$genls ) )
    {
      return makeBoolean( NIL == genls_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const179$genlMt ) )
    {
      return makeBoolean( NIL == genl_mt_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const120$termOfUnit ) )
    {
      return makeBoolean( NIL == function_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const370$abnormal ) )
    {
      return makeBoolean( NIL == exception_rule_index_asent_p( asent ) );
    }
    if( pcase_var.eql( $const371$meetsPragmaticRequirement ) )
    {
      return makeBoolean( NIL == pragma_rule_index_asent_p( asent ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178529L)
  public static SubLObject isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection)
  {
    return makeBoolean( NIL != isa_rule_index_asent_p( asent ) && collection.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178730L)
  public static SubLObject quoted_isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection)
  {
    return makeBoolean( NIL != quoted_isa_rule_index_asent_p( asent ) && collection.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178951L)
  public static SubLObject isa_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const155$isa.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( cycl_utilities
        .atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179200L)
  public static SubLObject quoted_isa_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const164$quotedIsa.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( cycl_utilities
        .atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179468L)
  public static SubLObject genls_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection)
  {
    return makeBoolean( NIL != genls_rule_index_asent_p( asent ) && collection.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179675L)
  public static SubLObject genls_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const171$genls.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( cycl_utilities
        .atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179930L)
  public static SubLObject genl_mt_rule_index_asent_match_p(final SubLObject asent, final SubLObject genl_mt)
  {
    return makeBoolean( NIL != genl_mt_rule_index_asent_p( asent ) && genl_mt.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180133L)
  public static SubLObject genl_mt_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const179$genlMt.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != forts.fort_p( cycl_utilities
        .atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180392L)
  public static SubLObject function_rule_index_asent_match_p(final SubLObject asent, final SubLObject function)
  {
    return makeBoolean( NIL != function_rule_index_asent_p( asent ) && function.eql( cycl_utilities.formula_operator( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180638L)
  public static SubLObject function_rule_index_asent_p(final SubLObject asent)
  {
    if( $const120$termOfUnit.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) )
    {
      final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      return makeBoolean( NIL != el_utilities.possibly_naut_p( arg2 ) && NIL != forts.fort_p( cycl_utilities.formula_operator( arg2 ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181010L)
  public static SubLObject exception_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule)
  {
    return makeBoolean( NIL != exception_rule_index_asent_p( asent ) && rule.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181210L)
  public static SubLObject exception_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const370$abnormal.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != assertion_handles.assertion_p(
        cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181485L)
  public static SubLObject pragma_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule)
  {
    return makeBoolean( NIL != pragma_rule_index_asent_p( asent ) && rule.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181696L)
  public static SubLObject pragma_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( $const371$meetsPragmaticRequirement.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) && NIL != assertion_handles
        .assertion_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182002L)
  public static SubLObject unbound_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject dummy)
  {
    return unbound_predicate_rule_index_asent_p( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182147L)
  public static SubLObject unbound_predicate_rule_index_asent_p(final SubLObject asent)
  {
    return makeBoolean( NIL == variables.fully_bound_p( cycl_utilities.atomic_sentence_predicate( asent ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182315L)
  public static SubLObject mt_index_assertion_match_p(final SubLObject assertion, final SubLObject mt)
  {
    return hlmt.hlmt_equalP( mt, assertions_high.assertion_mt( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182425L)
  public static SubLObject do_hlmts_with_monadic_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list372 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hlmt_var = NIL;
    SubLObject monad = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list372 );
    hlmt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list372 );
    monad = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$52 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list372 );
      current_$52 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list372 );
      if( NIL == conses_high.member( current_$52, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$52 == $kw17$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list372 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject hlmts_seen_so_far = $sym373$HLMTS_SEEN_SO_FAR;
    final SubLObject assertion = $sym374$ASSERTION;
    final SubLObject monad_var = $sym375$MONAD_VAR;
    return ConsesLow.list( $sym6$PROGN, ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( monad_var, monad ), reader.bq_cons( hlmts_seen_so_far, $list376 ) ), ConsesLow.listS( $sym47$CLET, ConsesLow.list(
        ConsesLow.list( hlmt_var, monad ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym377$WITH_INFERENCE_MT_RELEVANCE, ConsesLow.listS( $sym378$LIST, $const379$MtSpace, monad_var, $list380 ), ConsesLow.list(
            $sym255$DO_OVERLAP_INDEX, ConsesLow.list( assertion, ConsesLow.list( $sym378$LIST, monad_var ), $kw20$DONE, done ), ConsesLow.list( $sym47$CLET, ConsesLow.list( ConsesLow.list( hlmt_var, ConsesLow.list(
                $sym381$ASSERTION_MT, assertion ) ) ), ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym382$HLMT_EQUAL, monad_var, ConsesLow.list( $sym383$HLMT_MONAD_MT, hlmt_var ) ), ConsesLow.list( $sym343$PUNLESS,
                    ConsesLow.list( $sym384$SET_MEMBER_, hlmt_var, hlmts_seen_so_far ), ConsesLow.listS( $sym6$PROGN, ConsesLow.list( $sym385$SET_ADD, hlmt_var, hlmts_seen_so_far ), ConsesLow.append( body,
                        NIL ) ) ) ) ) ) ) ) );
  }

  public static SubLObject declare_kb_mapping_macros_file()
  {
    SubLFiles.declareMacro( me, "pwhen_predicate_is_relevant", "PWHEN-PREDICATE-IS-RELEVANT" );
    SubLFiles.declareMacro( me, "pwhen_mt_is_relevant", "PWHEN-MT-IS-RELEVANT" );
    SubLFiles.declareMacro( me, "pwhen_truth_relevant", "PWHEN-TRUTH-RELEVANT" );
    SubLFiles.declareFunction( me, "truth_relevant_p", "TRUTH-RELEVANT-P", 2, 0, false );
    SubLFiles.declareMacro( me, "pwhen_assertion_has_truth", "PWHEN-ASSERTION-HAS-TRUTH" );
    SubLFiles.declareMacro( me, "pwhen_assertion_has_direction_spec", "PWHEN-ASSERTION-HAS-DIRECTION-SPEC" );
    SubLFiles.declareFunction( me, "direction_spec_p", "DIRECTION-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_has_direction_spec", "ASSERTION-HAS-DIRECTION-SPEC", 2, 0, false );
    SubLFiles.declareMacro( me, "do_assertion_list", "DO-ASSERTION-LIST" );
    SubLFiles.declareMacro( me, "do_simple_index", "DO-SIMPLE-INDEX" );
    SubLFiles.declareMacro( me, "pwhen_assertion_has_type", "PWHEN-ASSERTION-HAS-TYPE" );
    SubLFiles.declareMacro( me, "some_assertions", "SOME-ASSERTIONS" );
    SubLFiles.declareMacro( me, "some_assertions_internal", "SOME-ASSERTIONS-INTERNAL" );
    SubLFiles.declareMacro( me, "do_final_index_from_spec", "DO-FINAL-INDEX-FROM-SPEC" );
    SubLFiles.declareMacro( me, "do_gaf_arg_index", "DO-GAF-ARG-INDEX" );
    SubLFiles.declareMacro( me, "do_gaf_arg_index_formulas", "DO-GAF-ARG-INDEX-FORMULAS" );
    SubLFiles.declareMacro( me, "do_gaf_arg_index_values", "DO-GAF-ARG-INDEX-VALUES" );
    SubLFiles.declareFunction( me, "do_gaf_arg_index_key_validator", "DO-GAF-ARG-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_gaf_arg_final_index_spec_iterator", "NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "initialize_gaf_arg_final_index_spec_iterator_state", "INITIALIZE-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_term", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_predicate", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_note", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_argnum_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_gaf_arg_final_index_spec_iterator_state_note", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_gaf_arg_final_index_spec_iterator_state_argnum_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_gaf_arg_final_index_spec_iterator_state_predicate_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_gaf_arg_final_index_spec_iterator_state_mt_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_current_argnum_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_current_predicate_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-PREDICATE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_state_current_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_current_keylist", "GAF-ARG-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_doneP", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_next", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $gaf_arg_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_quiesce", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_keylist_to_final_index_spec", "GAF-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_current_relevant_keylist", "GAF-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_quiesce_one_step", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_refill_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-PREDICATE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_refill_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_arg_final_index_spec_iterator_next_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_predicate_extent_index", "DO-PREDICATE-EXTENT-INDEX" );
    SubLFiles.declareMacro( me, "do_predicate_extent_index_formulas", "DO-PREDICATE-EXTENT-INDEX-FORMULAS" );
    SubLFiles.declareMacro( me, "do_predicate_extent_index_values", "DO-PREDICATE-EXTENT-INDEX-VALUES" );
    SubLFiles.declareFunction( me, "do_predicate_extent_index_key_validator", "DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_predicate_extent_final_index_spec_iterator", "NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_predicate_extent_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_state_predicate", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_state_mt_keys", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_predicate_extent_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_state_current_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_current_keylist", "PREDICATE-EXTENT-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_doneP", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_next", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $predicate_extent_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_quiesce", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_keylist_to_final_index_spec", "PREDICATE-EXTENT-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_current_relevant_keylist", "PREDICATE-EXTENT-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_quiesce_one_step", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_extent_final_index_spec_iterator_next_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_nart_arg_index", "DO-NART-ARG-INDEX" );
    SubLFiles.declareFunction( me, "do_nart_arg_index_key_validator", "DO-NART-ARG-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_nart_arg_final_index_spec_iterator", "NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "initialize_nart_arg_final_index_spec_iterator_state", "INITIALIZE-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_term", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_function", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_note", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_argnum_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_nart_arg_final_index_spec_iterator_state_note", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_nart_arg_final_index_spec_iterator_state_argnum_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_nart_arg_final_index_spec_iterator_state_function_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_current_argnum_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_state_current_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-FUNCTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_current_keylist", "NART-ARG-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_doneP", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $nart_arg_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_next", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $nart_arg_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_quiesce", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_keylist_to_final_index_spec", "NART-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_current_relevant_keylist", "NART-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_quiesce_one_step", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_refill_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-FUNCTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_arg_final_index_spec_iterator_next_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-FUNCTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_function_extent_index", "DO-FUNCTION-EXTENT-INDEX" );
    SubLFiles.declareFunction( me, "do_function_extent_index_key_validator", "DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_function_narts", "DO-FUNCTION-NARTS" );
    SubLFiles.declareFunction( me, "function_extent_final_index_spec", "FUNCTION-EXTENT-FINAL-INDEX-SPEC", 1, 0, false );
    SubLFiles.declareMacro( me, "do_consequent_rules", "DO-CONSEQUENT-RULES" );
    SubLFiles.declareMacro( me, "do_antecedent_rules", "DO-ANTECEDENT-RULES" );
    SubLFiles.declareMacro( me, "do_predicate_rule_index", "DO-PREDICATE-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_predicate_rule_index_key_validator", "DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_predicate_rule_final_index_spec_iterator", "NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "initialize_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_predicate", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_direction", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_note", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_sense_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_predicate_rule_final_index_spec_iterator_state_note", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_current_sense_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_current_mt_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_state_current_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_current_keylist", "PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_doneP", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_next", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $predicate_rule_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_quiesce", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_keylist_to_final_index_spec", "PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_current_relevant_keylist", "PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_quiesce_one_step", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_refill_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_refill_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_final_index_spec_iterator_next_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_decontextualized_ist_predicate_rule_index", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_decontextualized_ist_predicate_rule_index_key_validator", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_decontextualized_ist_predicate_rule_final_index_spec_iterator", "NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0,
        false );
    SubLFiles.declareFunction( me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0,
        false );
    SubLFiles.declareFunction( me, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0,
        false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0,
        false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY",
        1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_current_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_keylist_to_final_index_spec", "DECONTEXTUALIZED-IST-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_current_relevant_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0,
        false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_isa_rule_index", "DO-ISA-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_isa_rule_index_key_validator", "DO-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_isa_rule_final_index_spec_iterator", "NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareMacro( me, "do_quoted_isa_rule_index", "DO-QUOTED-ISA-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_quoted_isa_rule_index_key_validator", "DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_quoted_isa_rule_final_index_spec_iterator", "NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareMacro( me, "do_genls_rule_index", "DO-GENLS-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_genls_rule_index_key_validator", "DO-GENLS-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_genls_rule_final_index_spec_iterator", "NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareMacro( me, "do_genl_mt_rule_index", "DO-GENL-MT-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_genl_mt_rule_index_key_validator", "DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_genl_mt_rule_final_index_spec_iterator", "NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "do_pred_arg2_rule_index_key_validator", "DO-PRED-ARG2-RULE-INDEX-KEY-VALIDATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "initialize_pred_arg2_rule_final_index_spec_iterator_state", "INITIALIZE-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 5, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_arg2", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-ARG2", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_direction", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_note", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_pred", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_top_level_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-TOP-LEVEL-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_pred_arg2_rule_final_index_spec_iterator_state_note", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_current_sense_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_current_mt_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_state_current_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_current_keylist", "PRED-ARG2-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_doneP", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    new $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction();
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_next", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    new $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction();
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_quiesce", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_keylist_to_final_index_spec", "PRED-ARG2-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_current_relevant_keylist", "PRED-ARG2-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_quiesce_one_step", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_refill_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_refill_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_arg2_rule_final_index_spec_iterator_next_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "key_pred_arg2_rule_index", "KEY-PRED-ARG2-RULE-INDEX", 2, 2, false );
    SubLFiles.declareMacro( me, "do_function_rule_index", "DO-FUNCTION-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_function_rule_index_key_validator", "DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_function_rule_final_index_spec_iterator", "NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_function_rule_final_index_spec_iterator_state", "INITIALIZE-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_func", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_direction", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_note", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_mt_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_function_rule_final_index_spec_iterator_state_note", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_function_rule_final_index_spec_iterator_state_mt_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_function_rule_final_index_spec_iterator_state_direction_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_current_mt_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_state_current_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_current_keylist", "FUNCTION-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_doneP", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_next", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_quiesce", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_keylist_to_final_index_spec", "FUNCTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "function_rule_current_relevant_keylist", "FUNCTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_quiesce_one_step", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_refill_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_final_index_spec_iterator_next_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_exception_rule_index", "DO-EXCEPTION-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_exception_rule_index_key_validator", "DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_exception_rule_final_index_spec_iterator", "NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_exception_rule_final_index_spec_iterator_state", "INITIALIZE-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_rule", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_direction", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_note", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_mt_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_exception_rule_final_index_spec_iterator_state_note", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_exception_rule_final_index_spec_iterator_state_mt_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_exception_rule_final_index_spec_iterator_state_direction_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_current_mt_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_state_current_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_current_keylist", "EXCEPTION-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_doneP", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_next", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_quiesce", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_keylist_to_final_index_spec", "EXCEPTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_current_relevant_keylist", "EXCEPTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_quiesce_one_step", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_refill_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_final_index_spec_iterator_next_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_pragma_rule_index", "DO-PRAGMA-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_pragma_rule_index_key_validator", "DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_pragma_rule_final_index_spec_iterator", "NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_pragma_rule_final_index_spec_iterator_state", "INITIALIZE-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_rule", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_direction", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_note", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_mt_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_pragma_rule_final_index_spec_iterator_state_note", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_pragma_rule_final_index_spec_iterator_state_mt_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_pragma_rule_final_index_spec_iterator_state_direction_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_current_mt_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_state_current_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_current_keylist", "PRAGMA-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_doneP", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_next", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_quiesce", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_keylist_to_final_index_spec", "PRAGMA-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_current_relevant_keylist", "PRAGMA-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_quiesce_one_step", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_refill_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_final_index_spec_iterator_next_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_unbound_predicate_rule_index", "DO-UNBOUND-PREDICATE-RULE-INDEX" );
    SubLFiles.declareFunction( me, "do_unbound_predicate_rule_index_key_validator", "DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_unbound_predicate_rule_final_index_spec_iterator", "NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 0, 2, false );
    SubLFiles.declareFunction( me, "initialize_unbound_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_direction", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_note", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_unbound_predicate_rule_final_index_spec_iterator_state_note", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_current_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_doneP", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_next", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_quiesce", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_keylist_to_final_index_spec", "UNBOUND-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_current_relevant_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_final_index_spec_iterator_next_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_mt_index", "DO-MT-INDEX" );
    SubLFiles.declareFunction( me, "do_mt_index_key_validator", "DO-MT-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_final_index_spec", "MT-FINAL-INDEX-SPEC", 1, 0, false );
    SubLFiles.declareMacro( me, "do_other_index", "DO-OTHER-INDEX" );
    SubLFiles.declareFunction( me, "do_other_index_key_validator", "DO-OTHER-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "other_final_index_spec", "OTHER-FINAL-INDEX-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "other_final_index_spec_p", "OTHER-FINAL-INDEX-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "other_simple_final_index_spec_p", "OTHER-SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "other_complex_final_index_spec_p", "OTHER-COMPLEX-FINAL-INDEX-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "other_index_assertion_match_p", "OTHER-INDEX-ASSERTION-MATCH-P", 2, 0, false );
    new $other_index_assertion_match_p$BinaryFunction();
    SubLFiles.declareFunction( me, "do_other_index_assertion_match_p", "DO-OTHER-INDEX-ASSERTION-MATCH-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_term_index", "DO-TERM-INDEX" );
    SubLFiles.declareFunction( me, "do_term_index_key_validator", "DO-TERM-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_term_final_index_spec_iterator", "NEW-TERM-FINAL-INDEX-SPEC-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "do_term_index_assertion_match_p", "DO-TERM-INDEX-ASSERTION-MATCH-P", 2, 0, false );
    SubLFiles.declareMacro( me, "do_broad_mt_index", "DO-BROAD-MT-INDEX" );
    SubLFiles.declareFunction( me, "do_broad_mt_index_key_validator", "DO-BROAD-MT-INDEX-KEY-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "do_broad_mt_index_match_p", "DO-BROAD-MT-INDEX-MATCH-P", 4, 0, false );
    SubLFiles.declareMacro( me, "do_hlmt_contents", "DO-HLMT-CONTENTS" );
    SubLFiles.declareMacro( me, "do_mt_contents", "DO-MT-CONTENTS" );
    SubLFiles.declareFunction( me, "do_mt_contents_method", "DO-MT-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareMacro( me, "do_overlap_index", "DO-OVERLAP-INDEX" );
    SubLFiles.declareMacro( me, "do_gafs_potentially_matching_formula", "DO-GAFS-POTENTIALLY-MATCHING-FORMULA" );
    SubLFiles.declareMacro( me, "do_best_gaf_lookup_index", "DO-BEST-GAF-LOOKUP-INDEX" );
    SubLFiles.declareMacro( me, "do_gaf_lookup_index", "DO-GAF-LOOKUP-INDEX" );
    SubLFiles.declareFunction( me, "do_gli_extract_method", "DO-GLI-EXTRACT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "do_gli_method_error", "DO-GLI-METHOD-ERROR", 2, 0, false );
    SubLFiles.declareMacro( me, "do_gli_via_gaf_arg", "DO-GLI-VIA-GAF-ARG" );
    SubLFiles.declareFunction( me, "do_gli_vga_extract_keys", "DO-GLI-VGA-EXTRACT-KEYS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_gli_via_predicate_extent", "DO-GLI-VIA-PREDICATE-EXTENT" );
    SubLFiles.declareFunction( me, "do_gli_vpe_extract_key", "DO-GLI-VPE-EXTRACT-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_gli_via_overlap", "DO-GLI-VIA-OVERLAP" );
    SubLFiles.declareFunction( me, "do_gli_vo_extract_key", "DO-GLI-VO-EXTRACT-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_narts_potentially_matching_formula", "DO-NARTS-POTENTIALLY-MATCHING-FORMULA" );
    SubLFiles.declareMacro( me, "do_term_of_unit_assertions_potentially_matching_nat_formula", "DO-TERM-OF-UNIT-ASSERTIONS-POTENTIALLY-MATCHING-NAT-FORMULA" );
    SubLFiles.declareMacro( me, "do_best_nat_lookup_index", "DO-BEST-NAT-LOOKUP-INDEX" );
    SubLFiles.declareMacro( me, "do_nat_lookup_index", "DO-NAT-LOOKUP-INDEX" );
    SubLFiles.declareFunction( me, "do_nli_extract_method", "DO-NLI-EXTRACT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "do_nli_method_error", "DO-NLI-METHOD-ERROR", 2, 0, false );
    SubLFiles.declareMacro( me, "do_nli_via_nart_arg", "DO-NLI-VIA-NART-ARG" );
    SubLFiles.declareFunction( me, "do_nli_vna_extract_keys", "DO-NLI-VNA-EXTRACT-KEYS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_nli_via_function_extent", "DO-NLI-VIA-FUNCTION-EXTENT" );
    SubLFiles.declareFunction( me, "do_nli_vfe_extract_key", "DO-NLI-VFE-EXTRACT-KEY", 1, 0, false );
    SubLFiles.declareMacro( me, "do_nli_via_overlap", "DO-NLI-VIA-OVERLAP" );
    SubLFiles.declareFunction( me, "do_nli_vo_extract_key", "DO-NLI-VO-EXTRACT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_final_index_spec_p", "SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_final_index_spec_term", "SIMPLE-FINAL-INDEX-SPEC-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_final_index_iterator", "NEW-FINAL-INDEX-ITERATOR", 1, 3, false );
    SubLFiles.declareFunction( me, "assertion_semantically_matches_simple_final_index_specP", "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false );
    new $assertion_semantically_matches_simple_final_index_specP$BinaryFunction();
    SubLFiles.declareFunction( me, "destroy_final_index_iterator", "DESTROY-FINAL-INDEX-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_assertions_with_same_assertion_formula", "DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA" );
    SubLFiles.declareMacro( me, "new_do_assertions_with_same_assertion_formula", "NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA" );
    SubLFiles.declareFunction( me, "new_assertions_with_same_assertion_formula_iterator", "NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "assertions_with_same_assertion_formula_p", "ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-P", 2, 0, false );
    SubLFiles.declareFunction( me, "final_index_iterator_filtered", "FINAL-INDEX-ITERATOR-FILTERED", 4, 0, false );
    SubLFiles.declareFunction( me, "new_gaf_simple_final_index_spec", "NEW-GAF-SIMPLE-FINAL-INDEX-SPEC", 4, 0, false );
    SubLFiles.declareFunction( me, "new_nart_simple_final_index_spec", "NEW-NART-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rule_simple_final_index_spec", "NEW-RULE-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "new_assertion_simple_final_index_spec", "NEW-ASSERTION-SIMPLE-FINAL-INDEX-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_simple_term_assertion_list_filtered", "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 0, 0, false );
    new $clear_simple_term_assertion_list_filtered$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_simple_term_assertion_list_filtered", "REMOVE-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false );
    SubLFiles.declareFunction( me, "simple_term_assertion_list_filtered_internal", "SIMPLE-TERM-ASSERTION-LIST-FILTERED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "simple_term_assertion_list_filtered", "SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false );
    SubLFiles.declareFunction( me, "assertion_syntactically_matches_simple_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false );
    SubLFiles.declareFunction( me, "assertion_matches_syntactic_indexing_typeP", "ASSERTION-MATCHES-SYNTACTIC-INDEXING-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_syntactically_matches_simple_gaf_final_index_specP", "GAF-SYNTACTICALLY-MATCHES-SIMPLE-GAF-FINAL-INDEX-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "gaf_matches_simple_argnum_specP", "GAF-MATCHES-SIMPLE-ARGNUM-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "tou_syntactically_matches_simple_nart_final_index_specP", "TOU-SYNTACTICALLY-MATCHES-SIMPLE-NART-FINAL-INDEX-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "rule_syntactically_matches_simple_rule_final_index_specP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "rule_syntactically_matches_simple_rule_final_index_spec_intP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC-INT?", 4, 0, false );
    SubLFiles.declareFunction( me, "asent_syntactically_matches_simple_rule_final_index_specP", "ASENT-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "assertion_syntactically_matches_simple_assertion_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-ASSERTION-FINAL-INDEX-SPEC?", 3, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_index_asent_match_p", "PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "predicate_rule_index_asent_p", "PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_index_asent_match_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    new $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction();
    SubLFiles.declareFunction( me, "decontextualized_ist_predicate_rule_index_asent_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_rule_index_asent_match_p", "ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "quoted_isa_rule_index_asent_match_p", "QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "isa_rule_index_asent_p", "ISA-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_isa_rule_index_asent_p", "QUOTED-ISA-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "genls_rule_index_asent_match_p", "GENLS-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "genls_rule_index_asent_p", "GENLS-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_rule_index_asent_match_p", "GENL-MT-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_rule_index_asent_p", "GENL-MT-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "function_rule_index_asent_match_p", "FUNCTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "function_rule_index_asent_p", "FUNCTION-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_index_asent_match_p", "EXCEPTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "exception_rule_index_asent_p", "EXCEPTION-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_index_asent_match_p", "PRAGMA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "pragma_rule_index_asent_p", "PRAGMA-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_index_asent_match_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_index_asent_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_index_assertion_match_p", "MT-INDEX-ASSERTION-MATCH-P", 2, 0, false );
    SubLFiles.declareMacro( me, "do_hlmts_with_monadic_mt", "DO-HLMTS-WITH-MONADIC-MT" );
    return NIL;
  }

  public static SubLObject init_kb_mapping_macros_file()
  {
    $simple_term_assertion_list_filtered_caching_state$ = SubLFiles.deflexical( "*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_mapping_macros_file()
  {
    access_macros.register_macro_helper( $sym7$TRUTH_RELEVANT_P, $sym8$PWHEN_TRUTH_RELEVANT );
    access_macros.register_macro_helper( $sym37$SOME_ASSERTIONS_INTERNAL, $sym39$SOME_ASSERTIONS );
    access_macros.register_macro_helper( $sym43$DO_FINAL_INDEX_FROM_SPEC, $list44 );
    utilities_macros.register_cyc_api_macro( $sym61$DO_GAF_ARG_INDEX, $list53, $str62$Iterate_over_an_index_of_gaf_asse );
    utilities_macros.register_cyc_api_macro( $sym66$DO_GAF_ARG_INDEX_FORMULAS, $list63, $str67$Iterate_over_an_index_of_gaf_asse );
    access_macros.register_macro_helper( $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR, $sym61$DO_GAF_ARG_INDEX );
    access_macros.register_macro_helper( $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, $sym61$DO_GAF_ARG_INDEX );
    access_macros.register_macro_helper( $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, $sym90$DO_PREDICATE_EXTENT_INDEX );
    access_macros.register_macro_helper( $sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, $sym90$DO_PREDICATE_EXTENT_INDEX );
    access_macros.register_macro_helper( $sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR, $sym104$DO_NART_ARG_INDEX );
    access_macros.register_macro_helper( $sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, $sym104$DO_NART_ARG_INDEX );
    access_macros.register_macro_helper( $sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, $sym114$DO_FUNCTION_EXTENT_INDEX );
    access_macros.register_macro_helper( $sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC, $sym114$DO_FUNCTION_EXTENT_INDEX );
    access_macros.register_macro_helper( $sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym124$DO_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym124$DO_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR, $sym153$DO_ISA_RULE_INDEX );
    access_macros.register_macro_helper( $sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym153$DO_ISA_RULE_INDEX );
    access_macros.register_macro_helper( $sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, $sym162$DO_QUOTED_ISA_RULE_INDEX );
    access_macros.register_macro_helper( $sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym162$DO_QUOTED_ISA_RULE_INDEX );
    access_macros.register_macro_helper( $sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR, $sym169$DO_GENLS_RULE_INDEX );
    access_macros.register_macro_helper( $sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym169$DO_GENLS_RULE_INDEX );
    access_macros.register_macro_helper( $sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, $sym177$DO_GENL_MT_RULE_INDEX );
    access_macros.register_macro_helper( $sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym177$DO_GENL_MT_RULE_INDEX );
    access_macros.register_macro_helper( $sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, $sym187$DO_FUNCTION_RULE_INDEX );
    access_macros.register_macro_helper( $sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym187$DO_FUNCTION_RULE_INDEX );
    access_macros.register_macro_helper( $sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, $sym197$DO_EXCEPTION_RULE_INDEX );
    access_macros.register_macro_helper( $sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym197$DO_EXCEPTION_RULE_INDEX );
    access_macros.register_macro_helper( $sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, $sym206$DO_PRAGMA_RULE_INDEX );
    access_macros.register_macro_helper( $sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym206$DO_PRAGMA_RULE_INDEX );
    access_macros.register_macro_helper( $sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym216$DO_UNBOUND_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym216$DO_UNBOUND_PREDICATE_RULE_INDEX );
    access_macros.register_macro_helper( $sym225$DO_MT_INDEX_KEY_VALIDATOR, $sym227$DO_MT_INDEX );
    access_macros.register_macro_helper( $sym226$MT_FINAL_INDEX_SPEC, $sym227$DO_MT_INDEX );
    access_macros.register_macro_helper( $sym232$DO_OTHER_INDEX_KEY_VALIDATOR, $sym235$DO_OTHER_INDEX );
    access_macros.register_macro_helper( $sym233$OTHER_FINAL_INDEX_SPEC, $sym235$DO_OTHER_INDEX );
    access_macros.register_macro_helper( $sym238$OTHER_FINAL_INDEX_SPEC_P, $sym239$DO_TERM_INDEX );
    access_macros.register_macro_helper( $sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P, $sym235$DO_OTHER_INDEX );
    utilities_macros.register_cyc_api_macro( $sym239$DO_TERM_INDEX, $list230, $str246$Iterate_over_all_assertions_index );
    access_macros.register_macro_helper( $sym243$DO_TERM_INDEX_KEY_VALIDATOR, $sym239$DO_TERM_INDEX );
    access_macros.register_macro_helper( $sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, $sym239$DO_TERM_INDEX );
    access_macros.register_macro_helper( $sym245$DO_TERM_INDEX_ASSERTION_MATCH_P, $sym239$DO_TERM_INDEX );
    access_macros.register_macro_helper( $sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR, $sym252$DO_BROAD_MT_INDEX );
    access_macros.register_macro_helper( $sym251$DO_BROAD_MT_INDEX_MATCH_P, $sym252$DO_BROAD_MT_INDEX );
    access_macros.register_macro_helper( $sym261$DO_MT_CONTENTS_METHOD, $sym265$DO_MT_CONTENTS );
    access_macros.register_macro_helper( $sym279$DO_GLI_EXTRACT_METHOD, $sym274$DO_GAF_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym285$DO_GLI_METHOD_ERROR, $sym274$DO_GAF_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym280$DO_GLI_VIA_GAF_ARG, $sym274$DO_GAF_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym293$DO_GLI_VGA_EXTRACT_KEYS, $sym280$DO_GLI_VIA_GAF_ARG );
    access_macros.register_macro_helper( $sym281$DO_GLI_VIA_PREDICATE_EXTENT, $sym274$DO_GAF_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym297$DO_GLI_VPE_EXTRACT_KEY, $sym281$DO_GLI_VIA_PREDICATE_EXTENT );
    access_macros.register_macro_helper( $sym283$DO_GLI_VIA_OVERLAP, $sym274$DO_GAF_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym298$DO_GLI_VO_EXTRACT_KEY, $sym283$DO_GLI_VIA_OVERLAP );
    access_macros.register_macro_helper( $sym310$DO_NLI_EXTRACT_METHOD, $sym305$DO_NAT_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym315$DO_NLI_METHOD_ERROR, $sym305$DO_NAT_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym311$DO_NLI_VIA_NART_ARG, $sym305$DO_NAT_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym320$DO_NLI_VNA_EXTRACT_KEYS, $sym311$DO_NLI_VIA_NART_ARG );
    access_macros.register_macro_helper( $sym313$DO_NLI_VIA_FUNCTION_EXTENT, $sym305$DO_NAT_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym322$DO_NLI_VFE_EXTRACT_KEY, $sym313$DO_NLI_VIA_FUNCTION_EXTENT );
    access_macros.register_macro_helper( $sym314$DO_NLI_VIA_OVERLAP, $sym305$DO_NAT_LOOKUP_INDEX );
    access_macros.register_macro_helper( $sym323$DO_NLI_VO_EXTRACT_KEY, $sym314$DO_NLI_VIA_OVERLAP );
    access_macros.register_macro_helper( $sym50$NEW_FINAL_INDEX_ITERATOR, $sym43$DO_FINAL_INDEX_FROM_SPEC );
    access_macros.register_macro_helper( $sym52$DESTROY_FINAL_INDEX_ITERATOR, $sym43$DO_FINAL_INDEX_FROM_SPEC );
    access_macros.register_macro_helper( $sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA );
    memoization_state.note_globally_cached_function( $sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_mapping_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_mapping_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_mapping_macros_file();
  }
  static
  {
    me = new kb_mapping_macros();
    $simple_term_assertion_list_filtered_caching_state$ = null;
    $list0 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PWHEN = makeSymbol( "PWHEN" );
    $sym2$RELEVANT_PRED_ = makeSymbol( "RELEVANT-PRED?" );
    $list3 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $list5 = ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-SPEC" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$PROGN = makeSymbol( "PROGN" );
    $sym7$TRUTH_RELEVANT_P = makeSymbol( "TRUTH-RELEVANT-P" );
    $sym8$PWHEN_TRUTH_RELEVANT = makeSymbol( "PWHEN-TRUTH-RELEVANT" );
    $list9 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TRUTH" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$ASSERTION_HAS_TRUTH = makeSymbol( "ASSERTION-HAS-TRUTH" );
    $sym11$COR = makeSymbol( "COR" );
    $sym12$NULL = makeSymbol( "NULL" );
    $list13 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DIRECTION-SPEC" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym14$ASSERTION_HAS_DIRECTION_SPEC = makeSymbol( "ASSERTION-HAS-DIRECTION-SPEC" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ASSERTIONS" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list16 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $kw17$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw18$TRUTH = makeKeyword( "TRUTH" );
    $kw19$DIRECTION = makeKeyword( "DIRECTION" );
    $kw20$DONE = makeKeyword( "DONE" );
    $sym21$DO_LIST = makeSymbol( "DO-LIST" );
    $sym22$PWHEN_ASSERTION_HAS_TRUTH = makeSymbol( "PWHEN-ASSERTION-HAS-TRUTH" );
    $sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC = makeSymbol( "PWHEN-ASSERTION-HAS-DIRECTION-SPEC" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym25$DO_ASSERTION_LIST = makeSymbol( "DO-ASSERTION-LIST" );
    $sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = makeSymbol( "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST" );
    $list27 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TYPE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw28$GAF = makeKeyword( "GAF" );
    $sym29$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $kw30$RULE = makeKeyword( "RULE" );
    $sym31$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $sym32$ASSERTION_HAS_TYPE = makeSymbol( "ASSERTION-HAS-TYPE" );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list34 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw35$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym36$UNTIL_MAPPING_FINISHED = makeSymbol( "UNTIL-MAPPING-FINISHED" );
    $sym37$SOME_ASSERTIONS_INTERNAL = makeSymbol( "SOME-ASSERTIONS-INTERNAL" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAPPING-FINISHED" ) ) );
    $sym39$SOME_ASSERTIONS = makeSymbol( "SOME-ASSERTIONS" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list41 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ) );
    $sym42$DO_ASSERTIONS = makeSymbol( "DO-ASSERTIONS" );
    $sym43$DO_FINAL_INDEX_FROM_SPEC = makeSymbol( "DO-FINAL-INDEX-FROM-SPEC" );
    $list44 = ConsesLow.list( new SubLObject[] { makeSymbol( "DO-GAF-ARG-INDEX" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ), makeSymbol( "DO-NART-ARG-INDEX" ), makeSymbol( "DO-FUNCTION-EXTENT-INDEX" ), makeSymbol(
        "DO-PREDICATE-RULE-INDEX" ), makeSymbol( "DO-ISA-RULE-INDEX" ), makeSymbol( "DO-QUOTED-ISA-RULE-INDEX" ), makeSymbol( "DO-GENLS-RULE-INDEX" ), makeSymbol( "DO-GENL-MT-RULE-INDEX" ), makeSymbol(
            "DO-FUNCTION-RULE-INDEX" ), makeSymbol( "DO-EXCEPTION-RULE-INDEX" ), makeSymbol( "DO-PRAGMA-RULE-INDEX" ), makeSymbol( "DO-UNBOUND-PREDICATE-RULE-INDEX" ), makeSymbol( "DO-MT-INDEX" ), makeSymbol(
                "DO-OTHER-INDEX" ), makeSymbol( "DO-TERM-INDEX" )
    } );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "FINAL-INDEX-SPEC" ), makeSymbol( "TYPE" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$FINAL_INDEX_ITERATOR = makeUninternedSymbol( "FINAL-INDEX-ITERATOR" );
    $sym47$CLET = makeSymbol( "CLET" );
    $sym48$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym49$CSETQ = makeSymbol( "CSETQ" );
    $sym50$NEW_FINAL_INDEX_ITERATOR = makeSymbol( "NEW-FINAL-INDEX-ITERATOR" );
    $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol( "DO-ITERATOR-WITHOUT-VALUES-INTERNAL" );
    $sym52$DESTROY_FINAL_INDEX_ITERATOR = makeSymbol( "DESTROY-FINAL-INDEX-ITERATOR" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "PREDICATE" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list54 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "PREDICATE" ), makeKeyword( "TRUTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $kw55$INDEX = makeKeyword( "INDEX" );
    $kw56$PREDICATE = makeKeyword( "PREDICATE" );
    $sym57$PRED_VAR = makeUninternedSymbol( "PRED-VAR" );
    $sym58$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR = makeSymbol( "DO-GAF-ARG-INDEX-KEY-VALIDATOR" );
    $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR" );
    $sym61$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $str62$Iterate_over_an_index_of_gaf_asse = makeString(
        "Iterate over an index of gaf assertions executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR." );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "PREDICATE" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym64$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym65$GAF_FORMULA = makeSymbol( "GAF-FORMULA" );
    $sym66$DO_GAF_ARG_INDEX_FORMULAS = makeSymbol( "DO-GAF-ARG-INDEX-FORMULAS" );
    $str67$Iterate_over_an_index_of_gaf_asse = makeString(
        "Iterate over an index of gaf assertion formulas executing BODY within the scope of VAR.\nThis version can be significantly faster than do-gaf-arg-index if you don't need the assertions \n -- at least under Alexandria and no slower in non-Alexandria.\nDoes not put a #$not around negated gaf formulas.\nVAR is bound to each GAF formula in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR." );
    $list68 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "GATHER-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "PREDICATE" ),
      makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym69$ASSERTION = makeUninternedSymbol( "ASSERTION" );
    $sym70$GAF_ARG = makeSymbol( "GAF-ARG" );
    $kw71$ANY = makeKeyword( "ANY" );
    $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym73$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw74$ARGNUM_KEYS_ARE_FRESH = makeKeyword( "ARGNUM-KEYS-ARE-FRESH" );
    $kw75$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw76$PREDICATE_KEYS_ARE_FRESH = makeKeyword( "PREDICATE-KEYS-ARE-FRESH" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ), makeSymbol(
        "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list78 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ), makeKeyword( "PROGRESS-MESSAGE" ) );
    $sym79$PRED_VAR = makeUninternedSymbol( "PRED-VAR" );
    $sym80$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol( "DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR" );
    $sym82$PIF_FEATURE = makeSymbol( "PIF-FEATURE" );
    $kw83$CYC_ALEXANDRIA = makeKeyword( "CYC-ALEXANDRIA" );
    $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS = makeSymbol( "DO-ITERATOR-WITHOUT-VALUES-PROGRESS" );
    $sym85$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR" );
    $sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR" );
    $sym87$PRED_VAR = makeUninternedSymbol( "PRED-VAR" );
    $sym88$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym89$NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR" );
    $sym90$DO_PREDICATE_EXTENT_INDEX = makeSymbol( "DO-PREDICATE-EXTENT-INDEX" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "GATHER-ARG" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ),
        makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym92$PRED_VAR = makeUninternedSymbol( "PRED-VAR" );
    $sym93$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym94$NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR" );
    $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym96$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw97$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "FUNCTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list99 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "FUNCTION" ), makeKeyword( "DONE" ) );
    $kw100$FUNCTION = makeKeyword( "FUNCTION" );
    $sym101$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR = makeSymbol( "DO-NART-ARG-INDEX-KEY-VALIDATOR" );
    $sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR" );
    $sym104$DO_NART_ARG_INDEX = makeSymbol( "DO-NART-ARG-INDEX" );
    $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym106$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw107$NART_ARG = makeKeyword( "NART-ARG" );
    $str108$nart_arg_keys_should_never_be_irr = makeString( "nart arg keys should never be irrelevant: ~s ~s" );
    $kw109$FUNCTION_KEYS_ARE_FRESH = makeKeyword( "FUNCTION-KEYS-ARE-FRESH" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "FUNCTION" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym111$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol( "DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR" );
    $sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC = makeSymbol( "FUNCTION-EXTENT-FINAL-INDEX-SPEC" );
    $sym114$DO_FUNCTION_EXTENT_INDEX = makeSymbol( "DO-FUNCTION-EXTENT-INDEX" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "FUNCTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list116 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym117$TOU = makeUninternedSymbol( "TOU" );
    $sym118$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $list119 = ConsesLow.list( TWO_INTEGER, ZERO_INTEGER );
    $const120$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $list121 = ConsesLow.list( makeKeyword( "FUNCTION-EXTENT" ) );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list123 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $sym124$DO_PREDICATE_RULE_INDEX = makeSymbol( "DO-PREDICATE-RULE-INDEX" );
    $kw125$SENSE = makeKeyword( "SENSE" );
    $kw126$POS = makeKeyword( "POS" );
    $kw127$NEG = makeKeyword( "NEG" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list129 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $sym130$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR" );
    $sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "PREDICATE-RULE-INDEX-ASENT-MATCH-P" );
    $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym135$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw136$SENSE_KEYS_ARE_FRESH = makeKeyword( "SENSE-KEYS-ARE-FRESH" );
    $kw137$PREDICATE_RULE = makeKeyword( "PREDICATE-RULE" );
    $str138$predicate_rule_iterator_quiescens = makeString( "predicate-rule iterator quiescense failed with ~s" );
    $kw139$MT_KEYS_ARE_FRESH = makeKeyword( "MT-KEYS-ARE-FRESH" );
    $sym140$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR" );
    $sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol( "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" );
    $sym144$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P" );
    $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON = makeSymbol( "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX = makeSymbol( "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw147$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword( "DECONTEXTUALIZED-IST-PREDICATE-RULE" );
    $str148$ist_predicate_rule_iterator_quies = makeString( "ist-predicate-rule iterator quiescense failed with ~s" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "COLLECTION" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym150$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-ISA-RULE-INDEX-KEY-VALIDATOR" );
    $sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym153$DO_ISA_RULE_INDEX = makeSymbol( "DO-ISA-RULE-INDEX" );
    $sym154$ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "ISA-RULE-INDEX-ASENT-MATCH-P" );
    $const155$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw156$ISA_RULE = makeKeyword( "ISA-RULE" );
    $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $sym159$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR" );
    $sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym162$DO_QUOTED_ISA_RULE_INDEX = makeSymbol( "DO-QUOTED-ISA-RULE-INDEX" );
    $sym163$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P" );
    $const164$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw165$QUOTED_ISA_RULE = makeKeyword( "QUOTED-ISA-RULE" );
    $sym166$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-GENLS-RULE-INDEX-KEY-VALIDATOR" );
    $sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym169$DO_GENLS_RULE_INDEX = makeSymbol( "DO-GENLS-RULE-INDEX" );
    $sym170$GENLS_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "GENLS-RULE-INDEX-ASENT-MATCH-P" );
    $const171$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw172$GENLS_RULE = makeKeyword( "GENLS-RULE" );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "GENL-MT" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym174$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR" );
    $sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym177$DO_GENL_MT_RULE_INDEX = makeSymbol( "DO-GENL-MT-RULE-INDEX" );
    $sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "GENL-MT-RULE-INDEX-ASENT-MATCH-P" );
    $const179$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $kw180$GENL_MT_RULE = makeKeyword( "GENL-MT-RULE" );
    $str181$pred_arg2_rule_iterator_quiescens = makeString( "pred-arg2-rule iterator quiescense failed with ~s" );
    $str182$unexpected_pred_in_pred_arg2_inde = makeString( "unexpected pred in pred-arg2 indexing: ~s" );
    $list183 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "FUNCTION" ), makeSymbol( "&KEY" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym184$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR" );
    $sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym187$DO_FUNCTION_RULE_INDEX = makeSymbol( "DO-FUNCTION-RULE-INDEX" );
    $sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "FUNCTION-RULE-INDEX-ASENT-MATCH-P" );
    $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym190$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw191$FUNCTION_RULE = makeKeyword( "FUNCTION-RULE" );
    $str192$function_rule_iterator_quiescense = makeString( "function-rule iterator quiescense failed with ~s" );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "RULE" ), makeSymbol( "&KEY" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym194$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR" );
    $sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym197$DO_EXCEPTION_RULE_INDEX = makeSymbol( "DO-EXCEPTION-RULE-INDEX" );
    $sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "EXCEPTION-RULE-INDEX-ASENT-MATCH-P" );
    $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym200$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw201$EXCEPTION_RULE = makeKeyword( "EXCEPTION-RULE" );
    $str202$exception_rule_iterator_quiescens = makeString( "exception-rule iterator quiescense failed with ~s" );
    $sym203$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR" );
    $sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym206$DO_PRAGMA_RULE_INDEX = makeSymbol( "DO-PRAGMA-RULE-INDEX" );
    $sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "PRAGMA-RULE-INDEX-ASENT-MATCH-P" );
    $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym209$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $kw210$PRAGMA_RULE = makeKeyword( "PRAGMA-RULE" );
    $str211$pragma_rule_iterator_quiescense_f = makeString( "pragma-rule iterator quiescense failed with ~s" );
    $list212 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym213$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol( "DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR" );
    $sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR" );
    $sym216$DO_UNBOUND_PREDICATE_RULE_INDEX = makeSymbol( "DO-UNBOUND-PREDICATE-RULE-INDEX" );
    $sym217$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol( "UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P" );
    $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol( "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" );
    $sym219$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol( "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" );
    $str220$unbound_predicate_rule_iterator_q = makeString( "unbound-predicate-rule iterator quiescense failed with ~s" );
    $list221 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "MT" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list222 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TRUTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $kw223$TYPE = makeKeyword( "TYPE" );
    $sym224$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym225$DO_MT_INDEX_KEY_VALIDATOR = makeSymbol( "DO-MT-INDEX-KEY-VALIDATOR" );
    $sym226$MT_FINAL_INDEX_SPEC = makeSymbol( "MT-FINAL-INDEX-SPEC" );
    $sym227$DO_MT_INDEX = makeSymbol( "DO-MT-INDEX" );
    $sym228$MT_INDEX_ASSERTION_MATCH_P = makeSymbol( "MT-INDEX-ASSERTION-MATCH-P" );
    $list229 = ConsesLow.list( makeKeyword( "IST" ) );
    $list230 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym231$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym232$DO_OTHER_INDEX_KEY_VALIDATOR = makeSymbol( "DO-OTHER-INDEX-KEY-VALIDATOR" );
    $sym233$OTHER_FINAL_INDEX_SPEC = makeSymbol( "OTHER-FINAL-INDEX-SPEC" );
    $sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol( "DO-OTHER-INDEX-ASSERTION-MATCH-P" );
    $sym235$DO_OTHER_INDEX = makeSymbol( "DO-OTHER-INDEX" );
    $sym236$OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol( "OTHER-INDEX-ASSERTION-MATCH-P" );
    $list237 = ConsesLow.list( makeKeyword( "OTHER" ) );
    $sym238$OTHER_FINAL_INDEX_SPEC_P = makeSymbol( "OTHER-FINAL-INDEX-SPEC-P" );
    $sym239$DO_TERM_INDEX = makeSymbol( "DO-TERM-INDEX" );
    $kw240$SIMPLE = makeKeyword( "SIMPLE" );
    $kw241$OTHER = makeKeyword( "OTHER" );
    $sym242$FINAL_INDEX_SPEC = makeUninternedSymbol( "FINAL-INDEX-SPEC" );
    $sym243$DO_TERM_INDEX_KEY_VALIDATOR = makeSymbol( "DO-TERM-INDEX-KEY-VALIDATOR" );
    $sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR = makeSymbol( "NEW-TERM-FINAL-INDEX-SPEC-ITERATOR" );
    $sym245$DO_TERM_INDEX_ASSERTION_MATCH_P = makeSymbol( "DO-TERM-INDEX-ASSERTION-MATCH-P" );
    $str246$Iterate_over_all_assertions_index = makeString(
        "Iterate over all assertions indexed from TERM executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is indexed from TERM.\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf the assertion is a gaf, then its predicate is relevant (relevance is established outside).\nIf TYPE is non-nil, then assertion has TYPE as its type.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets.\nSee other indexing macros for examples of how this could happen." );
    $list247 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "MT" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list248 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR = makeSymbol( "DO-BROAD-MT-INDEX-KEY-VALIDATOR" );
    $str250$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym251$DO_BROAD_MT_INDEX_MATCH_P = makeSymbol( "DO-BROAD-MT-INDEX-MATCH-P" );
    $sym252$DO_BROAD_MT_INDEX = makeSymbol( "DO-BROAD-MT-INDEX" );
    $list253 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "HLMT" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym254$WITH_JUST_MT = makeSymbol( "WITH-JUST-MT" );
    $sym255$DO_OVERLAP_INDEX = makeSymbol( "DO-OVERLAP-INDEX" );
    $sym256$FLATTEN = makeSymbol( "FLATTEN" );
    $sym257$ASSERTION_TYPE = makeSymbol( "ASSERTION-TYPE" );
    $sym258$HLMT_EQUAL_ = makeSymbol( "HLMT-EQUAL?" );
    $sym259$ASSERTION_HLMT = makeSymbol( "ASSERTION-HLMT" );
    $sym260$PCASE = makeSymbol( "PCASE" );
    $sym261$DO_MT_CONTENTS_METHOD = makeSymbol( "DO-MT-CONTENTS-METHOD" );
    $kw262$MT = makeKeyword( "MT" );
    $kw263$BROAD_MT = makeKeyword( "BROAD-MT" );
    $list264 = ConsesLow.list( ConsesLow.list( makeSymbol( "OTHERWISE" ) ) );
    $sym265$DO_MT_CONTENTS = makeSymbol( "DO-MT-CONTENTS" );
    $sym266$HLMT_P = makeSymbol( "HLMT-P" );
    $list267 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "TERMS" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list268 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $sym269$GATHER_OVERLAP_INDEX = makeSymbol( "GATHER-OVERLAP-INDEX" );
    $list270 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "ASENT" ), makeSymbol( "&KEY" ), makeSymbol( "METHODS" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list271 = ConsesLow.list( makeKeyword( "METHODS" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $kw272$METHODS = makeKeyword( "METHODS" );
    $sym273$DO_BEST_GAF_LOOKUP_INDEX = makeSymbol( "DO-BEST-GAF-LOOKUP-INDEX" );
    $sym274$DO_GAF_LOOKUP_INDEX = makeSymbol( "DO-GAF-LOOKUP-INDEX" );
    $sym275$BEST_GAF_LOOKUP_INDEX = makeSymbol( "BEST-GAF-LOOKUP-INDEX" );
    $list276 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "LOOKUP-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym277$L_INDEX = makeUninternedSymbol( "L-INDEX" );
    $sym278$METHOD = makeUninternedSymbol( "METHOD" );
    $sym279$DO_GLI_EXTRACT_METHOD = makeSymbol( "DO-GLI-EXTRACT-METHOD" );
    $sym280$DO_GLI_VIA_GAF_ARG = makeSymbol( "DO-GLI-VIA-GAF-ARG" );
    $sym281$DO_GLI_VIA_PREDICATE_EXTENT = makeSymbol( "DO-GLI-VIA-PREDICATE-EXTENT" );
    $kw282$OVERLAP = makeKeyword( "OVERLAP" );
    $sym283$DO_GLI_VIA_OVERLAP = makeSymbol( "DO-GLI-VIA-OVERLAP" );
    $sym284$OTHERWISE = makeSymbol( "OTHERWISE" );
    $sym285$DO_GLI_METHOD_ERROR = makeSymbol( "DO-GLI-METHOD-ERROR" );
    $kw286$INDEX_TYPE = makeKeyword( "INDEX-TYPE" );
    $str287$Skip_iteration = makeString( "Skip iteration" );
    $str288$Unsupported_method__S_in__S_in_DO = makeString( "Unsupported method ~S in ~S in DO-GAF-LOOKUP-INDEX" );
    $sym289$TERM = makeUninternedSymbol( "TERM" );
    $sym290$ARGNUM = makeUninternedSymbol( "ARGNUM" );
    $sym291$PREDICATE = makeUninternedSymbol( "PREDICATE" );
    $sym292$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym293$DO_GLI_VGA_EXTRACT_KEYS = makeSymbol( "DO-GLI-VGA-EXTRACT-KEYS" );
    $sym294$PIF = makeSymbol( "PIF" );
    $kw295$TERM = makeKeyword( "TERM" );
    $kw296$ARGNUM = makeKeyword( "ARGNUM" );
    $sym297$DO_GLI_VPE_EXTRACT_KEY = makeSymbol( "DO-GLI-VPE-EXTRACT-KEY" );
    $sym298$DO_GLI_VO_EXTRACT_KEY = makeSymbol( "DO-GLI-VO-EXTRACT-KEY" );
    $kw299$TERMS = makeKeyword( "TERMS" );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART-VAR" ), makeSymbol( "NART-HL-FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "METHODS" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list301 = ConsesLow.list( makeKeyword( "METHODS" ), makeKeyword( "DONE" ) );
    $sym302$TOU_VAR = makeUninternedSymbol( "TOU-VAR" );
    $sym303$DO_BEST_NAT_LOOKUP_INDEX = makeSymbol( "DO-BEST-NAT-LOOKUP-INDEX" );
    $list304 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "NART-HL-FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "METHODS" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym305$DO_NAT_LOOKUP_INDEX = makeSymbol( "DO-NAT-LOOKUP-INDEX" );
    $sym306$BEST_NAT_LOOKUP_INDEX = makeSymbol( "BEST-NAT-LOOKUP-INDEX" );
    $list307 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "LOOKUP-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym308$L_INDEX = makeUninternedSymbol( "L-INDEX" );
    $sym309$METHOD = makeUninternedSymbol( "METHOD" );
    $sym310$DO_NLI_EXTRACT_METHOD = makeSymbol( "DO-NLI-EXTRACT-METHOD" );
    $sym311$DO_NLI_VIA_NART_ARG = makeSymbol( "DO-NLI-VIA-NART-ARG" );
    $kw312$FUNCTION_EXTENT = makeKeyword( "FUNCTION-EXTENT" );
    $sym313$DO_NLI_VIA_FUNCTION_EXTENT = makeSymbol( "DO-NLI-VIA-FUNCTION-EXTENT" );
    $sym314$DO_NLI_VIA_OVERLAP = makeSymbol( "DO-NLI-VIA-OVERLAP" );
    $sym315$DO_NLI_METHOD_ERROR = makeSymbol( "DO-NLI-METHOD-ERROR" );
    $str316$Unsupported_method__S_in__S_in_DO = makeString( "Unsupported method ~S in ~S in DO-NAT-LOOKUP-INDEX" );
    $sym317$TERM = makeUninternedSymbol( "TERM" );
    $sym318$ARGNUM = makeUninternedSymbol( "ARGNUM" );
    $sym319$FUNCTOR = makeUninternedSymbol( "FUNCTOR" );
    $sym320$DO_NLI_VNA_EXTRACT_KEYS = makeSymbol( "DO-NLI-VNA-EXTRACT-KEYS" );
    $kw321$FUNCTOR = makeKeyword( "FUNCTOR" );
    $sym322$DO_NLI_VFE_EXTRACT_KEY = makeSymbol( "DO-NLI-VFE-EXTRACT-KEY" );
    $sym323$DO_NLI_VO_EXTRACT_KEY = makeSymbol( "DO-NLI-VO-EXTRACT-KEY" );
    $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_ = makeSymbol( "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?" );
    $sym325$FINAL_INDEX_ITERATOR_FILTERED = makeSymbol( "FINAL-INDEX-ITERATOR-FILTERED" );
    $sym326$QUOTE = makeSymbol( "QUOTE" );
    $list327 = ConsesLow.listS( makeSymbol( "SIMPLE" ), makeSymbol( "TERM" ), makeSymbol( "TYPE" ), makeSymbol( "REST" ) );
    $str328$Unexpected_non_simple_index__s = makeString( "Unexpected non-simple index ~s" );
    $list329 = ConsesLow.list( makeSymbol( "ARGNUM-SPEC" ), makeSymbol( "PRED-SPEC" ), makeSymbol( "MT-SPEC" ) );
    $kw330$NART = makeKeyword( "NART" );
    $list331 = ConsesLow.list( makeSymbol( "ASSERTION-FUNC" ) );
    $str332$unexpected_type__s_in_simple_fina = makeString( "unexpected type ~s in simple final index spec ~s" );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ASSERTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym334$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym335$CLAUSE_STRUC = makeUninternedSymbol( "CLAUSE-STRUC" );
    $sym336$ASSERTION_GAF_P = makeSymbol( "ASSERTION-GAF-P" );
    $sym337$DO_ITERATOR_WITHOUT_VALUES = makeSymbol( "DO-ITERATOR-WITHOUT-VALUES" );
    $sym338$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR" );
    $sym339$FIRST = makeSymbol( "FIRST" );
    $sym340$SECOND = makeSymbol( "SECOND" );
    $sym341$ASSERTION_CNF = makeSymbol( "ASSERTION-CNF" );
    $list342 = ConsesLow.list( NIL, NIL, NIL );
    $sym343$PUNLESS = makeSymbol( "PUNLESS" );
    $sym344$KBEQ = makeSymbol( "KBEQ" );
    $sym345$NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR = makeSymbol( "NEW-ALEXANDRIA-RULES-WITH-CNF-ITERATOR" );
    $sym346$ASSERTION_CLAUSE_STRUC = makeSymbol( "ASSERTION-CLAUSE-STRUC" );
    $sym347$CDOLIST = makeSymbol( "CDOLIST" );
    $sym348$CLAUSE_STRUC_ASSERTIONS = makeSymbol( "CLAUSE-STRUC-ASSERTIONS" );
    $list349 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "ASSERTION" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "EXCLUSIVE?" ), T ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list350 = ConsesLow.list( makeKeyword( "EXCLUSIVE?" ), makeKeyword( "DONE" ) );
    $kw351$EXCLUSIVE_ = makeKeyword( "EXCLUSIVE?" );
    $sym352$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA = makeSymbol( "NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA" );
    $sym354$EXCLUSIVE_VAR = makeUninternedSymbol( "EXCLUSIVE-VAR" );
    $sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR = makeSymbol( "NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR" );
    $sym356$CAND = makeSymbol( "CAND" );
    $sym357$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list358 = ConsesLow.cons( makeSymbol( "TERM" ), makeSymbol( "KEYS" ) );
    $sym359$FINAL_INDEX_P = makeSymbol( "FINAL-INDEX-P" );
    $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_ = makeSymbol( "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?" );
    $sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol( "SIMPLE-TERM-ASSERTION-LIST-FILTERED" );
    $sym362$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_ = makeSymbol( "*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*" );
    $int363$512 = makeInteger( 512 );
    $sym364$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol( "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED" );
    $list365 = ConsesLow.list( makeSymbol( "ARGNUM-SPEC" ), makeSymbol( "PREDICATE-SPEC" ), makeSymbol( "MT-SPEC" ) );
    $list366 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "M" ) );
    $sym367$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $list368 = ConsesLow.list( makeSymbol( "ARGNUM-SPEC" ), makeSymbol( "FUNCTOR-SPEC" ) );
    $list369 = ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "ASENT-FUNC" ) );
    $const370$abnormal = constant_handles.reader_make_constant_shell( makeString( "abnormal" ) );
    $const371$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "meetsPragmaticRequirement" ) );
    $list372 = ConsesLow.list( ConsesLow.list( makeSymbol( "HLMT-VAR" ), makeSymbol( "MONAD" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym373$HLMTS_SEEN_SO_FAR = makeUninternedSymbol( "HLMTS-SEEN-SO-FAR" );
    $sym374$ASSERTION = makeUninternedSymbol( "ASSERTION" );
    $sym375$MONAD_VAR = makeUninternedSymbol( "MONAD-VAR" );
    $list376 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-SET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), makeInteger( 32 ) ) );
    $sym377$WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" );
    $sym378$LIST = makeSymbol( "LIST" );
    $const379$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $list380 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
    $sym381$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym382$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $sym383$HLMT_MONAD_MT = makeSymbol( "HLMT-MONAD-MT" );
    $sym384$SET_MEMBER_ = makeSymbol( "SET-MEMBER?" );
    $sym385$SET_ADD = makeSymbol( "SET-ADD" );
  }

  public static final class $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gaf_arg_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $gaf_arg_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $gaf_arg_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gaf_arg_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return predicate_extent_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $predicate_extent_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $predicate_extent_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return predicate_extent_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $nart_arg_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $nart_arg_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nart_arg_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $nart_arg_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $nart_arg_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nart_arg_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return predicate_rule_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $predicate_rule_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $predicate_rule_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return predicate_rule_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return decontextualized_ist_predicate_rule_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction
      extends
        UnaryFunction
  {
    public $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pred_arg2_rule_final_index_spec_iterator_doneP( arg1 );
    }
  }

  public static final class $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction
      extends
        UnaryFunction
  {
    public $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pred_arg2_rule_final_index_spec_iterator_next( arg1 );
    }
  }

  public static final class $other_index_assertion_match_p$BinaryFunction
      extends
        BinaryFunction
  {
    public $other_index_assertion_match_p$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "OTHER-INDEX-ASSERTION-MATCH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return other_index_assertion_match_p( arg1, arg2 );
    }
  }

  public static final class $assertion_semantically_matches_simple_final_index_specP$BinaryFunction
      extends
        BinaryFunction
  {
    public $assertion_semantically_matches_simple_final_index_specP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return assertion_semantically_matches_simple_final_index_specP( arg1, arg2 );
    }
  }

  public static final class $clear_simple_term_assertion_list_filtered$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_simple_term_assertion_list_filtered$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_simple_term_assertion_list_filtered();
    }
  }

  public static final class $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction
      extends
        BinaryFunction
  {
    public $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return decontextualized_ist_predicate_rule_index_asent_match_p( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 1982 ms
 * 
 */
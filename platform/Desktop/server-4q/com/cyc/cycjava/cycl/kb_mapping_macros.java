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

public final class kb_mapping_macros extends SubLTranslatedFile
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
    public static SubLObject pwhen_predicate_is_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list0);
        predicate = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym2$RELEVANT_PRED_, predicate), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 990L)
    public static SubLObject pwhen_mt_is_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list3);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym4$RELEVANT_MT_, mt), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1085L)
    public static SubLObject pwhen_truth_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject truth = (SubLObject)kb_mapping_macros.NIL;
        SubLObject truth_spec = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list5);
        truth = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list5);
        truth_spec = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (kb_mapping_macros.NIL == truth_spec) {
            return reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym7$TRUTH_RELEVANT_P, truth, truth_spec), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1278L)
    public static SubLObject truth_relevant_p(final SubLObject truth, final SubLObject truth_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == truth_spec || truth.eql(truth_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1423L)
    public static SubLObject pwhen_assertion_has_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        SubLObject truth = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list9);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list9);
        truth = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (kb_mapping_macros.NIL == truth) {
            return reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        if (kb_mapping_macros.NIL != enumeration_types.truth_p(truth)) {
            return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym10$ASSERTION_HAS_TRUTH, assertion, truth), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym11$COR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym12$NULL, truth), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym10$ASSERTION_HAS_TRUTH, assertion, truth)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 1743L)
    public static SubLObject pwhen_assertion_has_direction_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        SubLObject direction_spec = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list13);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list13);
        direction_spec = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (kb_mapping_macros.NIL == direction_spec) {
            return reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        if (kb_mapping_macros.NIL != direction_spec_p(direction_spec)) {
            return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym14$ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym11$COR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym12$NULL, direction_spec), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym14$ASSERTION_HAS_DIRECTION_SPEC, assertion, direction_spec)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2152L)
    public static SubLObject direction_spec_p(final SubLObject v_object) {
        return enumeration_types.direction_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2239L)
    public static SubLObject assertion_has_direction_spec(final SubLObject assertion, final SubLObject direction_spec) {
        return assertions_high.assertion_has_direction(assertion, direction_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2374L)
    public static SubLObject do_assertion_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject assertions = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list15);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list15);
        assertions = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$1 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list15);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list15);
            if (kb_mapping_macros.NIL == conses_high.member(current_$1, (SubLObject)kb_mapping_macros.$list16, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$1 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list15);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym21$DO_LIST, (SubLObject)ConsesLow.list(var, assertions, (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym22$PWHEN_ASSERTION_HAS_TRUTH, var, truth, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC, var, direction), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2626L)
    public static SubLObject do_simple_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list24);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list24);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$2 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list24);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list24);
            if (kb_mapping_macros.NIL == conses_high.member(current_$2, (SubLObject)kb_mapping_macros.$list16, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$2 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list24);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym25$DO_ASSERTION_LIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, v_term), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw19$DIRECTION, direction, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 2847L)
    public static SubLObject pwhen_assertion_has_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        SubLObject type = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list27);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list27);
        type = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (kb_mapping_macros.NIL == type) {
            return reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        if (kb_mapping_macros.$kw28$GAF == type) {
            return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym29$GAF_ASSERTION_, assertion), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        if (kb_mapping_macros.$kw30$RULE == type) {
            return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym31$RULE_ASSERTION_, assertion), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym11$COR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym12$NULL, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym32$ASSERTION_HAS_TYPE, assertion, type)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3229L)
    public static SubLObject some_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list33);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$3 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list33);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list33);
            if (kb_mapping_macros.NIL == conses_high.member(current_$3, (SubLObject)kb_mapping_macros.$list34, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$3 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list33);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_mapping_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (kb_mapping_macros.NIL != done) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym36$UNTIL_MAPPING_FINISHED, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym37$SOME_ASSERTIONS_INTERNAL, (SubLObject)ConsesLow.list(var, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, done, (SubLObject)kb_mapping_macros.$list38), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym37$SOME_ASSERTIONS_INTERNAL, (SubLObject)ConsesLow.list(var, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3612L)
    public static SubLObject some_assertions_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list40);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list40);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$4 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list40);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list40);
            if (kb_mapping_macros.NIL == conses_high.member(current_$4, (SubLObject)kb_mapping_macros.$list41, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$4 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list40);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_mapping_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym42$DO_ASSERTIONS, reader.bq_cons(var, ConsesLow.append((SubLObject)((kb_mapping_macros.NIL != progress_message) ? ConsesLow.list(progress_message) : kb_mapping_macros.NIL), (SubLObject)kb_mapping_macros.NIL)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 3825L)
    public static SubLObject do_final_index_from_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject final_index_spec = (SubLObject)kb_mapping_macros.NIL;
        SubLObject type = (SubLObject)kb_mapping_macros.NIL;
        SubLObject truth = (SubLObject)kb_mapping_macros.NIL;
        SubLObject direction = (SubLObject)kb_mapping_macros.NIL;
        SubLObject done = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        final_index_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        truth = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list45);
        done = current.first();
        current = current.rest();
        if (kb_mapping_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject final_index_iterator = (SubLObject)kb_mapping_macros.$sym46$FINAL_INDEX_ITERATOR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list(final_index_iterator), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym48$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym49$CSETQ, final_index_iterator, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym50$NEW_FINAL_INDEX_ITERATOR, final_index_spec, type, truth, direction)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(assertion_var, final_index_iterator, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, final_index_iterator, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym52$DESTROY_FINAL_INDEX_ITERATOR, final_index_iterator))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list45);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 4726L)
    public static SubLObject do_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list53);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list53);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$5 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list53);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list53);
            if (kb_mapping_macros.NIL == conses_high.member(current_$5, (SubLObject)kb_mapping_macros.$list54, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$5 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list53);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw55$INDEX, current);
        final SubLObject index = (SubLObject)((kb_mapping_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : kb_mapping_macros.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw56$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((kb_mapping_macros.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pred_var = (SubLObject)kb_mapping_macros.$sym57$PRED_VAR;
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym58$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR, v_term, index, pred_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, pred_var), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(assertion_var, final_index_spec, (SubLObject)kb_mapping_macros.$kw28$GAF, truth, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 6669L)
    public static SubLObject do_gaf_arg_index_formulas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list63);
        formula_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list63);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$6 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list63);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list63);
            if (kb_mapping_macros.NIL == conses_high.member(current_$6, (SubLObject)kb_mapping_macros.$list54, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$6 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list63);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw55$INDEX, current);
        final SubLObject index = (SubLObject)((kb_mapping_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : kb_mapping_macros.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw56$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((kb_mapping_macros.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject assertion_var = (SubLObject)kb_mapping_macros.$sym64$ASSERTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion_var, v_term, kb_mapping_macros.$kw55$INDEX, index, kb_mapping_macros.$kw56$PREDICATE, predicate, kb_mapping_macros.$kw18$TRUTH, truth, kb_mapping_macros.$kw19$DIRECTION, direction, kb_mapping_macros.$kw20$DONE, done }), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(formula_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym65$GAF_FORMULA, assertion_var))), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 8350L)
    public static SubLObject do_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        SubLObject gather_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list68);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list68);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list68);
        gather_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$7 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list68);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list68);
            if (kb_mapping_macros.NIL == conses_high.member(current_$7, (SubLObject)kb_mapping_macros.$list54, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$7 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list68);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw55$INDEX, current);
        final SubLObject index = (SubLObject)((kb_mapping_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : kb_mapping_macros.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw56$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((kb_mapping_macros.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject assertion = (SubLObject)kb_mapping_macros.$sym69$ASSERTION;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list(var), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion, v_term, kb_mapping_macros.$kw55$INDEX, index, kb_mapping_macros.$kw56$PREDICATE, predicate, kb_mapping_macros.$kw18$TRUTH, truth, kb_mapping_macros.$kw19$DIRECTION, direction, kb_mapping_macros.$kw20$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym49$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym70$GAF_ARG, assertion, gather_index)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 9682L)
    public static SubLObject do_gaf_arg_index_key_validator(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        return kb_indexing.gaf_arg_index_key_validator(v_term, argnum, predicate, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 9929L)
    public static SubLObject new_gaf_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject predicate) {
        if (argnum == kb_mapping_macros.UNPROVIDED) {
            argnum = (SubLObject)kb_mapping_macros.NIL;
        }
        if (predicate == kb_mapping_macros.UNPROVIDED) {
            predicate = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(v_term, (SubLObject)((kb_mapping_macros.NIL != argnum) ? argnum : kb_mapping_macros.$kw71$ANY), predicate, (SubLObject)kb_mapping_macros.NIL));
        }
        final SubLObject state = initialize_gaf_arg_final_index_spec_iterator_state(v_term, argnum, predicate);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym73$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 10658L)
    public static SubLObject initialize_gaf_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.SIX_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, v_term);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, predicate);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw74$ARGNUM_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != argnum) ? ConsesLow.list(argnum) : kb_indexing.key_gaf_arg_index_cached(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11311L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_term(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11436L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11559L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11742L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 11885L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12039L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12179L)
    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12315L)
    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12454L)
    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_predicate_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12596L)
    public static SubLObject set_gaf_arg_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12731L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_argnum_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 12906L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_predicate_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_predicate_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13073L)
    public static SubLObject gaf_arg_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return gaf_arg_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13226L)
    public static SubLObject gaf_arg_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(gaf_arg_final_index_spec_iterator_state_current_argnum_key(state), gaf_arg_final_index_spec_iterator_state_current_predicate_key(state), gaf_arg_final_index_spec_iterator_state_current_mt_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 13540L)
    public static SubLObject gaf_arg_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = gaf_arg_final_index_spec_iterator_state_note(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == argnum_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(argnum_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != list_utilities.lengthLE(predicate_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == mt_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 14156L)
    public static SubLObject gaf_arg_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = gaf_arg_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        gaf_arg_final_index_spec_iterator_next_mt_key(state);
        return subl_promotions.values3(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 14434L)
    public static SubLObject gaf_arg_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = gaf_arg_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
                result = gaf_arg_keylist_to_final_index_spec(v_term, keylist);
            }
            else {
                doneP = gaf_arg_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return subl_promotions.values2(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 15379L)
    public static SubLObject gaf_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(v_term, (SubLObject)kb_mapping_macros.$kw75$GAF_ARG, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 15566L)
    public static SubLObject gaf_arg_current_relevant_keylist(final SubLObject state) {
        final SubLObject input_predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject argnum = argnum_keys.first();
        final SubLObject predicate = predicate_keys.first();
        final SubLObject mt = mt_keys.first();
        if (kb_mapping_macros.NIL != argnum && kb_mapping_macros.NIL != predicate && kb_mapping_macros.NIL != mt) {
            if (kb_mapping_macros.NIL == input_predicate && kb_mapping_macros.NIL == pred_relevance_macros.relevant_predP(predicate)) {
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, (SubLObject)kb_mapping_macros.NIL);
                set_gaf_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
            }
            else if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(argnum, predicate, mt);
            }
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 16996L)
    public static SubLObject gaf_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.NIL == argnum_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == predicate_keys) {
            gaf_arg_final_index_spec_iterator_refill_predicate_keys(state);
        }
        else if (kb_mapping_macros.NIL == mt_keys) {
            gaf_arg_final_index_spec_iterator_refill_mt_keys(state);
        }
        else {
            gaf_arg_final_index_spec_iterator_next_mt_key(state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 18196L)
    public static SubLObject gaf_arg_final_index_spec_iterator_refill_predicate_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
        final SubLObject predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
        SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        if (kb_mapping_macros.$kw74$ARGNUM_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state)) {
            set_gaf_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            argnum_keys = argnum_keys.rest();
            set_gaf_arg_final_index_spec_iterator_state_argnum_keys(state, argnum_keys);
        }
        final SubLObject argnum_key = argnum_keys.first();
        if (kb_mapping_macros.NIL != argnum_key) {
            if (kb_mapping_macros.NIL != predicate) {
                set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, (SubLObject)ConsesLow.list(predicate));
            }
            else if (kb_mapping_macros.NIL != pred_relevance_macros.only_specified_predicate_list_is_relevantP()) {
                set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, conses_high.copy_list(pred_relevance_macros.$relevant_preds$.getDynamicValue(thread)));
            }
            else {
                set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, (SubLObject)kb_mapping_macros.UNPROVIDED));
            }
            set_gaf_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.$kw76$PREDICATE_KEYS_ARE_FRESH);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 19781L)
    public static SubLObject gaf_arg_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
        final SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        if (kb_mapping_macros.$kw76$PREDICATE_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state)) {
            set_gaf_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            predicate_keys = predicate_keys.rest();
            set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, predicate_keys);
        }
        final SubLObject predicate_key = predicate_keys.first();
        if (kb_mapping_macros.NIL != predicate_key) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, (SubLObject)ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            }
            else {
                final SubLObject argnum_key = argnum_keys.first();
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, predicate_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 21258L)
    public static SubLObject gaf_arg_final_index_spec_iterator_next_mt_key(final SubLObject state) {
        final SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
        set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 21941L)
    public static SubLObject do_predicate_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$8 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list77);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list77);
            if (kb_mapping_macros.NIL == conses_high.member(current_$8, (SubLObject)kb_mapping_macros.$list78, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$8 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list77);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_mapping_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pred_var = (SubLObject)kb_mapping_macros.$sym79$PRED_VAR;
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym80$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym82$PIF_FEATURE, (SubLObject)kb_mapping_macros.$kw83$CYC_ALEXANDRIA, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym85$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR, pred_var, (SubLObject)kb_mapping_macros.ZERO_INTEGER, (SubLObject)kb_mapping_macros.NIL, truth, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, pred_var), (SubLObject)kb_mapping_macros.$kw20$DONE, done, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw28$GAF, truth, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 23379L)
    public static SubLObject do_predicate_extent_index_formulas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list77);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$9 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list77);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list77);
            if (kb_mapping_macros.NIL == conses_high.member(current_$9, (SubLObject)kb_mapping_macros.$list78, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$9 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list77);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_mapping_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pred_var = (SubLObject)kb_mapping_macros.$sym87$PRED_VAR;
        final SubLObject assertion_var = (SubLObject)kb_mapping_macros.$sym88$ASSERTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym82$PIF_FEATURE, (SubLObject)kb_mapping_macros.$kw83$CYC_ALEXANDRIA, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym89$NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR, pred_var, (SubLObject)kb_mapping_macros.ZERO_INTEGER, (SubLObject)kb_mapping_macros.NIL, truth, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym90$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion_var, predicate, kb_mapping_macros.$kw18$TRUTH, truth, kb_mapping_macros.$kw19$DIRECTION, direction, kb_mapping_macros.$kw20$DONE, done, kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message }), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym65$GAF_FORMULA, assertion_var))), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 24934L)
    public static SubLObject do_predicate_extent_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list91);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        SubLObject gather_arg = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list91);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list91);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list91);
        gather_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$10 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list91);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list91);
            if (kb_mapping_macros.NIL == conses_high.member(current_$10, (SubLObject)kb_mapping_macros.$list78, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$10 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list91);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_mapping_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pred_var = (SubLObject)kb_mapping_macros.$sym92$PRED_VAR;
        final SubLObject assertion_var = (SubLObject)kb_mapping_macros.$sym93$ASSERTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, pred_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym82$PIF_FEATURE, (SubLObject)kb_mapping_macros.$kw83$CYC_ALEXANDRIA, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym94$NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR, pred_var, gather_arg, (SubLObject)kb_mapping_macros.ZERO_INTEGER, (SubLObject)kb_mapping_macros.NIL, truth, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym90$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion_var, predicate, kb_mapping_macros.$kw18$TRUTH, truth, kb_mapping_macros.$kw19$DIRECTION, direction, kb_mapping_macros.$kw20$DONE, done, kb_mapping_macros.$kw35$PROGRESS_MESSAGE, progress_message }), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym70$GAF_ARG, assertion_var, gather_arg))), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 26536L)
    public static SubLObject do_predicate_extent_index_key_validator(final SubLObject predicate) {
        return forts.fort_p(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 26748L)
    public static SubLObject new_predicate_extent_final_index_spec_iterator(final SubLObject predicate) {
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(predicate, (SubLObject)kb_mapping_macros.NIL, predicate, (SubLObject)kb_mapping_macros.NIL));
        }
        final SubLObject state = initialize_predicate_extent_final_index_spec_iterator_state(predicate);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym96$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27488L)
    public static SubLObject initialize_predicate_extent_final_index_spec_iterator_state(final SubLObject predicate) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, predicate);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, kb_indexing.key_predicate_extent_index(predicate));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27834L)
    public static SubLObject predicate_extent_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 27978L)
    public static SubLObject predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28127L)
    public static SubLObject set_predicate_extent_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28283L)
    public static SubLObject predicate_extent_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return predicate_extent_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28468L)
    public static SubLObject predicate_extent_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(predicate_extent_final_index_spec_iterator_state_current_mt_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28661L)
    public static SubLObject predicate_extent_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        return Types.sublisp_null(mt_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 28947L)
    public static SubLObject predicate_extent_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = predicate_extent_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_extent_final_index_spec_iterator_next_mt_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 29251L)
    public static SubLObject predicate_extent_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = predicate_extent_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject pred = predicate_extent_final_index_spec_iterator_state_predicate(state);
                result = predicate_extent_keylist_to_final_index_spec(pred, keylist);
            }
            else {
                doneP = predicate_extent_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 30263L)
    public static SubLObject predicate_extent_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(v_term, (SubLObject)kb_mapping_macros.$kw97$PREDICATE_EXTENT, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 30477L)
    public static SubLObject predicate_extent_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject mt = mt_keys.first();
        if (kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
            return (SubLObject)ConsesLow.list(mt);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 31062L)
    public static SubLObject predicate_extent_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.NIL == mt_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        predicate_extent_final_index_spec_iterator_next_mt_key(state);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 31806L)
    public static SubLObject predicate_extent_final_index_spec_iterator_next_mt_key(final SubLObject state) {
        final SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
        set_predicate_extent_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 32075L)
    public static SubLObject do_nart_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list98);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list98);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$11 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list98);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list98);
            if (kb_mapping_macros.NIL == conses_high.member(current_$11, (SubLObject)kb_mapping_macros.$list99, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$11 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list98);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw55$INDEX, current);
        final SubLObject index = (SubLObject)((kb_mapping_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : kb_mapping_macros.NIL);
        final SubLObject function_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw100$FUNCTION, current);
        final SubLObject function = (SubLObject)((kb_mapping_macros.NIL != function_tail) ? conses_high.cadr(function_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym101$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR, v_term, index, function), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, v_term, index, function), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw28$GAF, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 33315L)
    public static SubLObject do_nart_arg_index_key_validator(final SubLObject v_term, final SubLObject index, final SubLObject function) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && (kb_mapping_macros.NIL == index || kb_mapping_macros.NIL != subl_promotions.positive_integer_p(index)) && (kb_mapping_macros.NIL == function || kb_mapping_macros.NIL != forts.fort_p(function)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 33644L)
    public static SubLObject new_nart_arg_final_index_spec_iterator(final SubLObject v_term, SubLObject argnum, SubLObject function) {
        if (argnum == kb_mapping_macros.UNPROVIDED) {
            argnum = (SubLObject)kb_mapping_macros.NIL;
        }
        if (function == kb_mapping_macros.UNPROVIDED) {
            function = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            return iteration.new_singleton_iterator(new_nart_simple_final_index_spec(v_term, (SubLObject)((kb_mapping_macros.NIL != argnum) ? argnum : kb_mapping_macros.$kw71$ANY), function));
        }
        final SubLObject state = initialize_nart_arg_final_index_spec_iterator_state(v_term, argnum, function);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym106$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 34382L)
    public static SubLObject initialize_nart_arg_final_index_spec_iterator_state(final SubLObject v_term, final SubLObject argnum, final SubLObject function) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, v_term);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, function);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw74$ARGNUM_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != argnum) ? ConsesLow.list(argnum) : kb_indexing.key_nart_arg_index(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 34983L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_term(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35109L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_function(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35231L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35415L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35559L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35712L)
    public static SubLObject set_nart_arg_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35849L)
    public static SubLObject set_nart_arg_final_index_spec_iterator_state_argnum_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 35989L)
    public static SubLObject set_nart_arg_final_index_spec_iterator_state_function_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36131L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_current_argnum_key(final SubLObject state) {
        return nart_arg_final_index_spec_iterator_state_argnum_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36308L)
    public static SubLObject nart_arg_final_index_spec_iterator_state_current_function_key(final SubLObject state) {
        return nart_arg_final_index_spec_iterator_state_function_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36475L)
    public static SubLObject nart_arg_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(nart_arg_final_index_spec_iterator_state_current_argnum_key(state), nart_arg_final_index_spec_iterator_state_current_function_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 36727L)
    public static SubLObject nart_arg_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = nart_arg_final_index_spec_iterator_state_note(state);
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == argnum_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(argnum_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == function_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 37243L)
    public static SubLObject nart_arg_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = nart_arg_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        nart_arg_final_index_spec_iterator_next_function_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 37529L)
    public static SubLObject nart_arg_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = nart_arg_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term(state);
                result = nart_arg_keylist_to_final_index_spec(v_term, keylist);
            }
            else {
                doneP = nart_arg_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 38480L)
    public static SubLObject nart_arg_keylist_to_final_index_spec(final SubLObject v_term, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(v_term, (SubLObject)kb_mapping_macros.$kw107$NART_ARG, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 38670L)
    public static SubLObject nart_arg_current_relevant_keylist(final SubLObject state) {
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        final SubLObject argnum = argnum_keys.first();
        final SubLObject function = function_keys.first();
        if (kb_mapping_macros.NIL != argnum && kb_mapping_macros.NIL != function) {
            return (SubLObject)ConsesLow.list(argnum, function);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 39364L)
    public static SubLObject nart_arg_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        if (kb_mapping_macros.NIL == argnum_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == function_keys) {
            nart_arg_final_index_spec_iterator_refill_function_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str108$nart_arg_keys_should_never_be_irr, argnum_keys, function_keys);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 40309L)
    public static SubLObject nart_arg_final_index_spec_iterator_refill_function_keys(final SubLObject state) {
        final SubLObject v_term = nart_arg_final_index_spec_iterator_state_term(state);
        final SubLObject function = nart_arg_final_index_spec_iterator_state_function(state);
        SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
        if (kb_mapping_macros.$kw74$ARGNUM_KEYS_ARE_FRESH == nart_arg_final_index_spec_iterator_state_note(state)) {
            set_nart_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            argnum_keys = argnum_keys.rest();
            set_nart_arg_final_index_spec_iterator_state_argnum_keys(state, argnum_keys);
        }
        final SubLObject argnum_key = argnum_keys.first();
        if (kb_mapping_macros.NIL != argnum_key) {
            if (kb_mapping_macros.NIL != function) {
                set_nart_arg_final_index_spec_iterator_state_function_keys(state, (SubLObject)ConsesLow.list(function));
            }
            else {
                set_nart_arg_final_index_spec_iterator_state_function_keys(state, kb_indexing.key_nart_arg_index(v_term, argnum_key, (SubLObject)kb_mapping_macros.UNPROVIDED));
            }
            set_nart_arg_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.$kw109$FUNCTION_KEYS_ARE_FRESH);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 41632L)
    public static SubLObject nart_arg_final_index_spec_iterator_next_function_key(final SubLObject state) {
        final SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
        set_nart_arg_final_index_spec_iterator_state_function_keys(state, function_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 41907L)
    public static SubLObject do_function_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list110);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject function = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list110);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list110);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$12 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list110);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list110);
            if (kb_mapping_macros.NIL == conses_high.member(current_$12, (SubLObject)kb_mapping_macros.$list16, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$12 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list110);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym111$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, function), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC, function))), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw28$GAF, truth, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 42966L)
    public static SubLObject do_function_extent_index_key_validator(final SubLObject function) {
        return forts.fort_p(function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 43172L)
    public static SubLObject do_function_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject function = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list115);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list115);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$13 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list115);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list115);
            if (kb_mapping_macros.NIL == conses_high.member(current_$13, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$13 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list115);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject tou = (SubLObject)kb_mapping_macros.$sym117$TOU;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym114$DO_FUNCTION_EXTENT_INDEX, (SubLObject)ConsesLow.list(tou, function, (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym118$GAF_ARG1, tou))), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 43594L)
    public static SubLObject function_extent_final_index_spec(final SubLObject function) {
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(function)) {
            return new_gaf_simple_final_index_spec(function, (SubLObject)kb_mapping_macros.$list119, kb_mapping_macros.$const120$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
        }
        return reader.bq_cons(function, (SubLObject)kb_mapping_macros.$list121);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44081L)
    public static SubLObject do_consequent_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$14 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list122);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list122);
            if (kb_mapping_macros.NIL == conses_high.member(current_$14, (SubLObject)kb_mapping_macros.$list123, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$14 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list122);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym124$DO_PREDICATE_RULE_INDEX, (SubLObject)ConsesLow.list(var, predicate, (SubLObject)kb_mapping_macros.$kw125$SENSE, (SubLObject)kb_mapping_macros.$kw126$POS, (SubLObject)kb_mapping_macros.$kw19$DIRECTION, direction, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44563L)
    public static SubLObject do_antecedent_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list122);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$15 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list122);
            current_$15 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list122);
            if (kb_mapping_macros.NIL == conses_high.member(current_$15, (SubLObject)kb_mapping_macros.$list123, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$15 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list122);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym124$DO_PREDICATE_RULE_INDEX, (SubLObject)ConsesLow.list(var, predicate, (SubLObject)kb_mapping_macros.$kw125$SENSE, (SubLObject)kb_mapping_macros.$kw127$NEG, (SubLObject)kb_mapping_macros.$kw19$DIRECTION, direction, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 44887L)
    public static SubLObject do_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$16 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list128);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list128);
            if (kb_mapping_macros.NIL == conses_high.member(current_$16, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$16 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list128);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym130$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 46359L)
    public static SubLObject do_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != forts.fort_p(predicate) && (kb_mapping_macros.NIL == sense || kb_mapping_macros.NIL != enumeration_types.sense_p(sense)) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 46619L)
    public static SubLObject new_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, (SubLObject)kb_mapping_macros.$sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym135$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 47414L)
    public static SubLObject initialize_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.SIX_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, predicate);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != sense) ? ConsesLow.list(sense) : kb_indexing.key_predicate_rule_index(predicate, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48084L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48226L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48356L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48546L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48694L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 48841L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49002L)
    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49145L)
    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49290L)
    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49432L)
    public static SubLObject set_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49581L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49768L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 49935L)
    public static SubLObject predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 50116L)
    public static SubLObject predicate_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(predicate_rule_final_index_spec_iterator_state_current_sense_key(state), predicate_rule_final_index_spec_iterator_state_current_mt_key(state), predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 50457L)
    public static SubLObject predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == sense_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(sense_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != list_utilities.lengthLE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 51112L)
    public static SubLObject predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 51417L)
    public static SubLObject predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = predicate_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
                result = predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            }
            else {
                doneP = predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 52425L)
    public static SubLObject predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, (SubLObject)kb_mapping_macros.$kw137$PREDICATE_RULE, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 52633L)
    public static SubLObject predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != sense && kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(sense, mt, direction);
            }
            set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 53685L)
    public static SubLObject predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == sense_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == mt_keys) {
            predicate_rule_final_index_spec_iterator_refill_mt_keys(state);
        }
        else if (kb_mapping_macros.NIL == direction_keys) {
            predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str138$predicate_rule_iterator_quiescens, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 54880L)
    public static SubLObject predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
        SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if (kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            sense_keys = sense_keys.rest();
            set_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (kb_mapping_macros.NIL != sense_key) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, (SubLObject)ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            }
            else {
                set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, (SubLObject)kb_mapping_macros.UNPROVIDED));
            }
            set_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 56174L)
    public static SubLObject predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
        final SubLObject direction = predicate_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                final SubLObject sense_key = sense_keys.first();
                set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 57624L)
    public static SubLObject predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 57922L)
    public static SubLObject do_decontextualized_ist_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list128);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$17 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list128);
            current_$17 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list128);
            if (kb_mapping_macros.NIL == conses_high.member(current_$17, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$17 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list128);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym140$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, predicate, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, predicate, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 59509L)
    public static SubLObject do_decontextualized_ist_predicate_rule_index_key_validator(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != forts.fort_p(predicate) && (kb_mapping_macros.NIL == sense || kb_mapping_macros.NIL != enumeration_types.sense_p(sense)) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 59811L)
    public static SubLObject new_decontextualized_ist_predicate_rule_final_index_spec_iterator(final SubLObject predicate, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, (SubLObject)kb_mapping_macros.$sym144$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON, (SubLObject)kb_mapping_macros.$sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 60753L)
    public static SubLObject initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(final SubLObject predicate, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.SIX_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, predicate);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != sense) ? ConsesLow.list(sense) : kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61449L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61612L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61763L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 61974L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62143L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62325L)
    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62489L)
    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62655L)
    public static SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 62825L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63054L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63277L)
    public static SubLObject decontextualized_ist_predicate_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key(state), decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 63610L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == sense_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(sense_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 64258L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 64626L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = decontextualized_ist_predicate_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
                result = decontextualized_ist_predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            }
            else {
                doneP = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 65781L)
    public static SubLObject decontextualized_ist_predicate_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, (SubLObject)kb_mapping_macros.$kw147$DECONTEXTUALIZED_IST_PREDICATE_RULE, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 66052L)
    public static SubLObject decontextualized_ist_predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != sense && kb_mapping_macros.NIL != direction) {
            return (SubLObject)ConsesLow.list(sense, direction);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 66755L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == sense_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == direction_keys) {
            decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str148$ist_predicate_rule_iterator_quies, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 67714L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
        final SubLObject direction = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(state);
        SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if (kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH == decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            sense_keys = sense_keys.rest();
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (kb_mapping_macros.NIL != sense_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, sense_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 69265L)
    public static SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 69626L)
    public static SubLObject do_isa_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject collection = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$18 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            current_$18 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            if (kb_mapping_macros.NIL == conses_high.member(current_$18, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$18 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list149);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym150$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 71130L)
    public static SubLObject do_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 71320L)
    public static SubLObject new_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, (SubLObject)kb_mapping_macros.$sym154$ISA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state(kb_mapping_macros.$const155$isa, (SubLObject)kb_mapping_macros.$kw156$ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 72066L)
    public static SubLObject do_quoted_isa_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject collection = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$19 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            if (kb_mapping_macros.NIL == conses_high.member(current_$19, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$19 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list149);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym159$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 73642L)
    public static SubLObject do_quoted_isa_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 73846L)
    public static SubLObject new_quoted_isa_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, (SubLObject)kb_mapping_macros.$sym163$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state(kb_mapping_macros.$const164$quotedIsa, (SubLObject)kb_mapping_macros.$kw165$QUOTED_ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 74626L)
    public static SubLObject do_genls_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject collection = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list149);
        collection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$20 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list149);
            if (kb_mapping_macros.NIL == conses_high.member(current_$20, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$20 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list149);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym166$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR, collection, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, collection, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 76152L)
    public static SubLObject do_genls_rule_index_key_validator(final SubLObject collection, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 76346L)
    public static SubLObject new_genls_rule_final_index_spec_iterator(final SubLObject collection, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(collection)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, (SubLObject)kb_mapping_macros.$sym170$GENLS_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state(kb_mapping_macros.$const171$genls, (SubLObject)kb_mapping_macros.$kw172$GENLS_RULE, collection, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 77102L)
    public static SubLObject do_genl_mt_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject genl_mt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list173);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list173);
        genl_mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$21 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list173);
            current_$21 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list173);
            if (kb_mapping_macros.NIL == conses_high.member(current_$21, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$21 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list173);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym174$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, genl_mt, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, genl_mt, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 78627L)
    public static SubLObject do_genl_mt_rule_index_key_validator(final SubLObject genl_mt, final SubLObject sense, final SubLObject direction) {
        return do_pred_arg2_rule_index_key_validator(genl_mt, sense, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 78817L)
    public static SubLObject new_genl_mt_rule_final_index_spec_iterator(final SubLObject genl_mt, SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(genl_mt)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(genl_mt, sense, (SubLObject)kb_mapping_macros.$sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state(kb_mapping_macros.$const179$genlMt, (SubLObject)kb_mapping_macros.$kw180$GENL_MT_RULE, genl_mt, sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 79570L)
    public static SubLObject do_pred_arg2_rule_index_key_validator(final SubLObject arg2, final SubLObject sense, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != forts.fort_p(arg2) && (kb_mapping_macros.NIL == sense || kb_mapping_macros.NIL != enumeration_types.sense_p(sense)) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80037L)
    public static SubLObject initialize_pred_arg2_rule_final_index_spec_iterator_state(final SubLObject pred, final SubLObject top_level_key, final SubLObject arg2, final SubLObject sense, final SubLObject direction) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.EIGHT_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, arg2);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != sense) ? ConsesLow.list(sense) : key_pred_arg2_rule_index(pred, arg2, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.SIX_INTEGER, pred);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.SEVEN_INTEGER, top_level_key);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80805L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_arg2(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 80937L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81067L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81257L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81405L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81552L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81713L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_pred(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 81833L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_top_level_key(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82006L)
    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82149L)
    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82294L)
    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82436L)
    public static SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FIVE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82585L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82772L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 82939L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 83120L)
    public static SubLObject pred_arg2_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(pred_arg2_rule_final_index_spec_iterator_state_current_sense_key(state), pred_arg2_rule_final_index_spec_iterator_state_current_mt_key(state), pred_arg2_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 83461L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = pred_arg2_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == sense_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(sense_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != list_utilities.lengthLE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 84116L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = pred_arg2_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pred_arg2_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 84421L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = pred_arg2_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
                final SubLObject top_level_key = pred_arg2_rule_final_index_spec_iterator_state_top_level_key(state);
                result = pred_arg2_rule_keylist_to_final_index_spec(arg2, top_level_key, keylist);
            }
            else {
                doneP = pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 85519L)
    public static SubLObject pred_arg2_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject top_level_key, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, top_level_key, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 85740L)
    public static SubLObject pred_arg2_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != sense && kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(sense, mt, direction);
            }
            set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 86792L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == sense_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == mt_keys) {
            pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(state);
        }
        else if (kb_mapping_macros.NIL == direction_keys) {
            pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str181$pred_arg2_rule_iterator_quiescens, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 87987L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
        final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
        SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        if (kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state)) {
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            sense_keys = sense_keys.rest();
            set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (kb_mapping_macros.NIL != sense_key) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, (SubLObject)ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            }
            else {
                set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, (SubLObject)kb_mapping_macros.UNPROVIDED));
            }
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 89345L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
        final SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
        final SubLObject direction = pred_arg2_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state)) {
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                final SubLObject sense_key = sense_keys.first();
                set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 90859L)
    public static SubLObject pred_arg2_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
        set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 91157L)
    public static SubLObject key_pred_arg2_rule_index(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject mt) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (mt == kb_mapping_macros.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_macros.NIL;
        }
        if (pred.eql(kb_mapping_macros.$const155$isa)) {
            return kb_indexing.key_isa_rule_index(arg2, sense, mt);
        }
        if (pred.eql(kb_mapping_macros.$const164$quotedIsa)) {
            return kb_indexing.key_quoted_isa_rule_index(arg2, sense, mt);
        }
        if (pred.eql(kb_mapping_macros.$const171$genls)) {
            return kb_indexing.key_genls_rule_index(arg2, sense, mt);
        }
        if (pred.eql(kb_mapping_macros.$const179$genlMt)) {
            return kb_indexing.key_genl_mt_rule_index(arg2, sense, mt);
        }
        Errors.error((SubLObject)kb_mapping_macros.$str182$unexpected_pred_in_pred_arg2_inde, pred);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 91570L)
    public static SubLObject do_function_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list183);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject function = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list183);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list183);
        function = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$22 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list183);
            current_$22 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list183);
            if (kb_mapping_macros.NIL == conses_high.member(current_$22, (SubLObject)kb_mapping_macros.$list123, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$22 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list183);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym184$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, function, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, function, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 92855L)
    public static SubLObject do_function_rule_index_key_validator(final SubLObject function, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != forts.fort_p(function) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 93060L)
    public static SubLObject new_function_rule_final_index_spec_iterator(final SubLObject function, SubLObject direction) {
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(function)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(function, (SubLObject)kb_mapping_macros.$kw127$NEG, (SubLObject)kb_mapping_macros.$sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_function_rule_final_index_spec_iterator_state(function, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym190$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 93831L)
    public static SubLObject initialize_function_rule_final_index_spec_iterator_state(final SubLObject func, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, func);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) ? ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_function_rule_index(func, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94456L)
    public static SubLObject function_rule_final_index_spec_iterator_state_func(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94587L)
    public static SubLObject function_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94716L)
    public static SubLObject function_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 94905L)
    public static SubLObject function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95051L)
    public static SubLObject function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95211L)
    public static SubLObject set_function_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95353L)
    public static SubLObject set_function_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95494L)
    public static SubLObject set_function_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95642L)
    public static SubLObject function_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return function_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 95821L)
    public static SubLObject function_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return function_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96000L)
    public static SubLObject function_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(function_rule_final_index_spec_iterator_state_current_mt_key(state), function_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96264L)
    public static SubLObject function_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = function_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == mt_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 96796L)
    public static SubLObject function_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = function_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        function_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 97098L)
    public static SubLObject function_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = function_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject func = function_rule_final_index_spec_iterator_state_func(state);
                result = function_rule_keylist_to_final_index_spec(func, keylist);
            }
            else {
                doneP = function_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 98084L)
    public static SubLObject function_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, (SubLObject)kb_mapping_macros.$kw191$FUNCTION_RULE, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 98289L)
    public static SubLObject function_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(mt, direction);
            }
            set_function_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 99204L)
    public static SubLObject function_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == mt_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == direction_keys) {
            function_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str192$function_rule_iterator_quiescense, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 100167L)
    public static SubLObject function_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject func = function_rule_final_index_spec_iterator_state_func(state);
        final SubLObject direction = function_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == function_rule_final_index_spec_iterator_state_note(state)) {
            set_function_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_function_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_function_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                set_function_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_function_rule_index(func, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 101449L)
    public static SubLObject function_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
        set_function_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 101744L)
    public static SubLObject do_exception_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rule = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        rule = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$23 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list193);
            current_$23 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list193);
            if (kb_mapping_macros.NIL == conses_high.member(current_$23, (SubLObject)kb_mapping_macros.$list123, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$23 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list193);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym194$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, rule, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 102937L)
    public static SubLObject do_exception_rule_index_key_validator(final SubLObject rule, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != assertions_high.rule_assertionP(rule) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 103157L)
    public static SubLObject new_exception_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction) {
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, (SubLObject)kb_mapping_macros.$kw126$POS, (SubLObject)kb_mapping_macros.$sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_exception_rule_final_index_spec_iterator_state(rule, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym200$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 103976L)
    public static SubLObject initialize_exception_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, rule);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) ? ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_exception_rule_index(rule, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104604L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_rule(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104736L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 104866L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105056L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105203L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105364L)
    public static SubLObject set_exception_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105507L)
    public static SubLObject set_exception_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105649L)
    public static SubLObject set_exception_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105798L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return exception_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 105979L)
    public static SubLObject exception_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return exception_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106160L)
    public static SubLObject exception_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(exception_rule_final_index_spec_iterator_state_current_mt_key(state), exception_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106427L)
    public static SubLObject exception_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = exception_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == mt_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 106964L)
    public static SubLObject exception_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = exception_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        exception_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 107269L)
    public static SubLObject exception_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = exception_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule(state);
                result = exception_rule_keylist_to_final_index_spec(rule, keylist);
            }
            else {
                doneP = exception_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 108262L)
    public static SubLObject exception_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, (SubLObject)kb_mapping_macros.$kw201$EXCEPTION_RULE, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 108470L)
    public static SubLObject exception_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(mt, direction);
            }
            set_exception_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 109390L)
    public static SubLObject exception_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == mt_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == direction_keys) {
            exception_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str202$exception_rule_iterator_quiescens, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 110358L)
    public static SubLObject exception_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject rule = exception_rule_final_index_spec_iterator_state_rule(state);
        final SubLObject direction = exception_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = exception_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == exception_rule_final_index_spec_iterator_state_note(state)) {
            set_exception_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_exception_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_exception_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                set_exception_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_exception_rule_index(rule, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 111650L)
    public static SubLObject exception_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = exception_rule_final_index_spec_iterator_state_direction_keys(state);
        set_exception_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 111948L)
    public static SubLObject do_pragma_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rule = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list193);
        rule = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$24 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list193);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list193);
            if (kb_mapping_macros.NIL == conses_high.member(current_$24, (SubLObject)kb_mapping_macros.$list123, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$24 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list193);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym203$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, rule, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, rule, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 113157L)
    public static SubLObject do_pragma_rule_index_key_validator(final SubLObject rule, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != assertions_high.rule_assertionP(rule) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 113359L)
    public static SubLObject new_pragma_rule_final_index_spec_iterator(final SubLObject rule, SubLObject direction) {
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, (SubLObject)kb_mapping_macros.$kw126$POS, (SubLObject)kb_mapping_macros.$sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_pragma_rule_final_index_spec_iterator_state(rule, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym209$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114158L)
    public static SubLObject initialize_pragma_rule_final_index_spec_iterator_state(final SubLObject rule, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, rule);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)((kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) ? ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)) : kb_indexing.key_pragma_rule_index(rule, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114777L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_rule(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 114906L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115033L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115220L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115364L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115522L)
    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115662L)
    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115801L)
    public static SubLObject set_pragma_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 115947L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return pragma_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116122L)
    public static SubLObject pragma_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return pragma_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116297L)
    public static SubLObject pragma_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(pragma_rule_final_index_spec_iterator_state_current_mt_key(state), pragma_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 116555L)
    public static SubLObject pragma_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = pragma_rule_final_index_spec_iterator_state_note(state);
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == mt_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 117077L)
    public static SubLObject pragma_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = pragma_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pragma_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 117373L)
    public static SubLObject pragma_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = pragma_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule(state);
                result = pragma_rule_keylist_to_final_index_spec(rule, keylist);
            }
            else {
                doneP = pragma_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 118345L)
    public static SubLObject pragma_rule_keylist_to_final_index_spec(final SubLObject pred, final SubLObject keylist) {
        return (SubLObject)ConsesLow.listS(pred, (SubLObject)kb_mapping_macros.$kw210$PRAGMA_RULE, ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 118544L)
    public static SubLObject pragma_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(mt, direction);
            }
            set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 119449L)
    public static SubLObject pragma_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == mt_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == direction_keys) {
            pragma_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str211$pragma_rule_iterator_quiescense_f, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 120402L)
    public static SubLObject pragma_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject rule = pragma_rule_final_index_spec_iterator_state_rule(state);
        final SubLObject direction = pragma_rule_final_index_spec_iterator_state_direction(state);
        SubLObject mt_keys = pragma_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == pragma_rule_final_index_spec_iterator_state_note(state)) {
            set_pragma_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_pragma_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_pragma_rule_index(rule, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 121664L)
    public static SubLObject pragma_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = pragma_rule_final_index_spec_iterator_state_direction_keys(state);
        set_pragma_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 121953L)
    public static SubLObject do_unbound_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list212);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list212);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$25 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list212);
            current_$25 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list212);
            if (kb_mapping_macros.NIL == conses_high.member(current_$25, (SubLObject)kb_mapping_macros.$list129, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$25 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list212);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw125$SENSE, current);
        final SubLObject sense = (SubLObject)((kb_mapping_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym213$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, sense, direction), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, sense, direction), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, (SubLObject)kb_mapping_macros.$kw30$RULE, (SubLObject)kb_mapping_macros.NIL, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 123464L)
    public static SubLObject do_unbound_predicate_rule_index_key_validator(final SubLObject sense, final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean((kb_mapping_macros.NIL == sense || kb_mapping_macros.NIL != enumeration_types.sense_p(sense)) && (kb_mapping_macros.NIL == direction || kb_mapping_macros.NIL != enumeration_types.direction_p(direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 123707L)
    public static SubLObject new_unbound_predicate_rule_final_index_spec_iterator(SubLObject sense, SubLObject direction) {
        if (sense == kb_mapping_macros.UNPROVIDED) {
            sense = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        final SubLObject index_hook = auxiliary_indexing.unbound_rule_index();
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(index_hook)) {
            return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(index_hook, sense, (SubLObject)kb_mapping_macros.$sym217$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P));
        }
        final SubLObject state = initialize_unbound_predicate_rule_final_index_spec_iterator_state(sense, direction);
        return iteration.new_iterator(state, (SubLObject)kb_mapping_macros.$sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, (SubLObject)kb_mapping_macros.$sym219$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 124559L)
    public static SubLObject initialize_unbound_predicate_rule_final_index_spec_iterator_state(final SubLObject sense, final SubLObject direction) {
        final SubLObject state = Vectors.make_vector((SubLObject)kb_mapping_macros.FIVE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)((kb_mapping_macros.NIL != sense) ? ConsesLow.list(sense) : auxiliary_indexing.key_unbound_rule_index((SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125184L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125334L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125532L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125688L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 125843L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126012L)
    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_note(final SubLObject state, final SubLObject note) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.ONE_INTEGER, note);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126163L)
    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.TWO_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126316L)
    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.THREE_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126466L)
    public static SubLObject set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(final SubLObject state, final SubLObject new_keys) {
        Vectors.set_aref(state, (SubLObject)kb_mapping_macros.FOUR_INTEGER, new_keys);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126623L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 126826L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127009L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key(final SubLObject state) {
        return unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127206L)
    public static SubLObject unbound_predicate_rule_current_keylist(final SubLObject state) {
        return (SubLObject)ConsesLow.list(unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key(state), unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key(state), unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 127579L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_doneP(final SubLObject state) {
        final SubLObject note = unbound_predicate_rule_final_index_spec_iterator_state_note(state);
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == sense_keys || (kb_mapping_macros.NIL == note && kb_mapping_macros.NIL != list_utilities.lengthE(sense_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != list_utilities.lengthLE(mt_keys, (SubLObject)kb_mapping_macros.ONE_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL == direction_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 128282L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject final_index_spec = unbound_predicate_rule_final_index_spec_iterator_quiesce(state);
        final SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        unbound_predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 128611L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce(final SubLObject state) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL == result && kb_mapping_macros.NIL == doneP) {
            final SubLObject keylist = unbound_predicate_rule_current_relevant_keylist(state);
            if (kb_mapping_macros.NIL != keylist) {
                result = unbound_predicate_rule_keylist_to_final_index_spec(keylist);
            }
            else {
                doneP = unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
            }
        }
        return Values.values(result, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 129563L)
    public static SubLObject unbound_predicate_rule_keylist_to_final_index_spec(final SubLObject keylist) {
        return reader.bq_cons(auxiliary_indexing.unbound_rule_index(), ConsesLow.append(keylist, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 129782L)
    public static SubLObject unbound_predicate_rule_current_relevant_keylist(final SubLObject state) {
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        final SubLObject sense = sense_keys.first();
        final SubLObject mt = mt_keys.first();
        final SubLObject direction = direction_keys.first();
        if (kb_mapping_macros.NIL != sense && kb_mapping_macros.NIL != mt && kb_mapping_macros.NIL != direction) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                return (SubLObject)ConsesLow.list(sense, mt, direction);
            }
            set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)kb_mapping_macros.NIL);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 130882L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step(final SubLObject state) {
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        final SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        if (kb_mapping_macros.NIL == sense_keys) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.NIL == mt_keys) {
            unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys(state);
        }
        else if (kb_mapping_macros.NIL == direction_keys) {
            unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
        }
        else {
            Errors.error((SubLObject)kb_mapping_macros.$str220$unbound_predicate_rule_iterator_q, state);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 132133L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if (kb_mapping_macros.$kw136$SENSE_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            sense_keys = sense_keys.rest();
            set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        final SubLObject sense_key = sense_keys.first();
        if (kb_mapping_macros.NIL != sense_key) {
            if (kb_mapping_macros.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
                set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, (SubLObject)ConsesLow.list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            }
            else {
                set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, auxiliary_indexing.key_unbound_rule_index(sense_key, (SubLObject)kb_mapping_macros.UNPROVIDED));
            }
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 133373L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys(final SubLObject state) {
        final SubLObject direction = unbound_predicate_rule_final_index_spec_iterator_state_direction(state);
        final SubLObject sense_keys = unbound_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        SubLObject mt_keys = unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state);
        if (kb_mapping_macros.$kw139$MT_KEYS_ARE_FRESH == unbound_predicate_rule_final_index_spec_iterator_state_note(state)) {
            set_unbound_predicate_rule_final_index_spec_iterator_state_note(state, (SubLObject)kb_mapping_macros.NIL);
        }
        else {
            mt_keys = mt_keys.rest();
            set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
        }
        final SubLObject mt_key = mt_keys.first();
        if (kb_mapping_macros.NIL != mt_key) {
            if (kb_mapping_macros.NIL != direction) {
                set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, (SubLObject)ConsesLow.list(direction));
            }
            else {
                final SubLObject sense_key = sense_keys.first();
                set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, auxiliary_indexing.key_unbound_rule_index(sense_key, mt_key));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 134799L)
    public static SubLObject unbound_predicate_rule_final_index_spec_iterator_next_direction_key(final SubLObject state) {
        final SubLObject direction_keys = unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
        set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 135121L)
    public static SubLObject do_mt_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list221);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject mt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list221);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list221);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$26 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list221);
            current_$26 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list221);
            if (kb_mapping_macros.NIL == conses_high.member(current_$26, (SubLObject)kb_mapping_macros.$list222, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$26 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list221);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym224$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym225$DO_MT_INDEX_KEY_VALIDATOR, mt, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym226$MT_FINAL_INDEX_SPEC, mt))), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, type, truth, direction, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136362L)
    public static SubLObject do_mt_index_key_validator(final SubLObject mt, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != forts.fort_p(mt) && kb_mapping_macros.NIL == kb_indexing.broad_mtP(mt) && (kb_mapping_macros.NIL == type || kb_mapping_macros.NIL != enumeration_types.assertion_type_p(type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136609L)
    public static SubLObject mt_final_index_spec(final SubLObject mt) {
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(mt)) {
            return new_assertion_simple_final_index_spec(mt, (SubLObject)kb_mapping_macros.$sym228$MT_INDEX_ASSERTION_MATCH_P);
        }
        return reader.bq_cons(mt, (SubLObject)kb_mapping_macros.$list229);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 136981L)
    public static SubLObject do_other_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$27 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list230);
            current_$27 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list230);
            if (kb_mapping_macros.NIL == conses_high.member(current_$27, (SubLObject)kb_mapping_macros.$list222, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$27 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list230);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym231$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym232$DO_OTHER_INDEX_KEY_VALIDATOR, v_term, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym233$OTHER_FINAL_INDEX_SPEC, v_term))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, type, truth, direction, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P, var), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138404L)
    public static SubLObject do_other_index_key_validator(final SubLObject v_term, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && (kb_mapping_macros.NIL == type || kb_mapping_macros.NIL != enumeration_types.assertion_type_p(type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138579L)
    public static SubLObject other_final_index_spec(final SubLObject v_term) {
        if (kb_mapping_macros.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            return new_assertion_simple_final_index_spec(v_term, (SubLObject)kb_mapping_macros.$sym236$OTHER_INDEX_ASSERTION_MATCH_P);
        }
        return reader.bq_cons(v_term, (SubLObject)kb_mapping_macros.$list237);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 138972L)
    public static SubLObject other_final_index_spec_p(final SubLObject final_index_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != other_simple_final_index_spec_p(final_index_spec) || kb_mapping_macros.NIL != other_complex_final_index_spec_p(final_index_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139537L)
    public static SubLObject other_simple_final_index_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.first() == kb_mapping_macros.$kw240$SIMPLE && conses_high.fourth(v_object) == kb_mapping_macros.$sym236$OTHER_INDEX_ASSERTION_MATCH_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139698L)
    public static SubLObject other_complex_final_index_spec_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)kb_mapping_macros.$kw241$OTHER, conses_high.second(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139794L)
    public static SubLObject other_index_assertion_match_p(final SubLObject assertion, final SubLObject v_term) {
        return simple_indexing.matches_other_index(assertion, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 139904L)
    public static SubLObject do_other_index_assertion_match_p(final SubLObject assertion) {
        if (kb_mapping_macros.NIL != assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != pred_relevance_macros.relevant_predP(assertions_high.gaf_arg0(assertion)) && kb_mapping_macros.NIL != mt_relevance_macros.relevant_assertionP(assertion));
        }
        return mt_relevance_macros.relevant_assertionP(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 140162L)
    public static SubLObject do_term_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list230);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$28 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list230);
            current_$28 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list230);
            if (kb_mapping_macros.NIL == conses_high.member(current_$28, (SubLObject)kb_mapping_macros.$list222, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$28 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list230);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw19$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_mapping_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject final_index_spec = (SubLObject)kb_mapping_macros.$sym242$FINAL_INDEX_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym243$DO_TERM_INDEX_KEY_VALIDATOR, v_term, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(final_index_spec, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, v_term, type), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)ConsesLow.list(var, final_index_spec, type, truth, direction, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym245$DO_TERM_INDEX_ASSERTION_MATCH_P, var, final_index_spec), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 141721L)
    public static SubLObject do_term_index_key_validator(final SubLObject v_term, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && (kb_mapping_macros.NIL == type || kb_mapping_macros.NIL != enumeration_types.assertion_type_p(type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 141898L)
    public static SubLObject new_term_final_index_spec_iterator(final SubLObject v_term, final SubLObject type) {
        SubLObject iterators = (SubLObject)kb_mapping_macros.NIL;
        if (kb_mapping_macros.NIL == type || kb_mapping_macros.$kw28$GAF == type) {
            if (kb_mapping_macros.NIL != do_gaf_arg_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_predicate_extent_index_key_validator(v_term)) {
                iterators = (SubLObject)ConsesLow.cons(new_predicate_extent_final_index_spec_iterator(v_term), iterators);
            }
            if (kb_mapping_macros.NIL != do_nart_arg_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_function_extent_index_key_validator(v_term)) {
                iterators = (SubLObject)ConsesLow.cons(iteration.new_singleton_iterator(function_extent_final_index_spec(v_term)), iterators);
            }
        }
        if (kb_mapping_macros.NIL == type || kb_mapping_macros.$kw30$RULE == type) {
            if (kb_mapping_macros.NIL != do_predicate_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_predicate_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_isa_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_isa_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_genls_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_genls_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_genl_mt_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_genl_mt_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_function_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_function_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_exception_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_exception_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
            if (kb_mapping_macros.NIL != do_pragma_rule_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL)) {
                iterators = (SubLObject)ConsesLow.cons(new_pragma_rule_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_macros.UNPROVIDED), iterators);
            }
        }
        if (kb_mapping_macros.NIL != do_mt_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL)) {
            iterators = (SubLObject)ConsesLow.cons(iteration.new_singleton_iterator(mt_final_index_spec(v_term)), iterators);
        }
        if (kb_mapping_macros.NIL != do_other_index_key_validator(v_term, (SubLObject)kb_mapping_macros.NIL)) {
            iterators = (SubLObject)ConsesLow.cons(iteration.new_singleton_iterator(other_final_index_spec(v_term)), iterators);
        }
        return iteration.new_iterator_iterator(Sequences.nreverse(iterators));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 144091L)
    public static SubLObject do_term_index_assertion_match_p(final SubLObject assertion, final SubLObject final_index_spec) {
        if (kb_mapping_macros.NIL != other_final_index_spec_p(final_index_spec)) {
            return mt_relevance_macros.relevant_assertionP(assertion);
        }
        return (SubLObject)kb_mapping_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 144394L)
    public static SubLObject do_broad_mt_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject mt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$29 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list247);
            current_$29 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list247);
            if (kb_mapping_macros.NIL == conses_high.member(current_$29, (SubLObject)kb_mapping_macros.$list248, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$29 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list247);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR, mt, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym39$SOME_ASSERTIONS, (SubLObject)ConsesLow.list(var, (SubLObject)kb_mapping_macros.$kw35$PROGRESS_MESSAGE, (SubLObject)kb_mapping_macros.$str250$do_broad_mt_index, (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym251$DO_BROAD_MT_INDEX_MATCH_P, var, mt, type, truth), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145092L)
    public static SubLObject do_broad_mt_index_key_validator(final SubLObject mt, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != hlmt.hlmt_p(mt) && (kb_mapping_macros.NIL == type || kb_mapping_macros.NIL != enumeration_types.assertion_type_p(type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145273L)
    public static SubLObject do_broad_mt_index_match_p(final SubLObject assertion, final SubLObject mt, final SubLObject type, final SubLObject truth) {
        return (SubLObject)SubLObjectFactory.makeBoolean(mt.equal(assertions_high.assertion_mt(assertion)) && (kb_mapping_macros.NIL == type || kb_mapping_macros.NIL != assertions_high.assertion_has_type(assertion, type)) && (kb_mapping_macros.NIL == truth || kb_mapping_macros.NIL != assertions_high.assertion_has_truth(assertion, truth)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 145583L)
    public static SubLObject do_hlmt_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list253);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_hlmt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list253);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list253);
        v_hlmt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$30 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list253);
            current_$30 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list253);
            if (kb_mapping_macros.NIL == conses_high.member(current_$30, (SubLObject)kb_mapping_macros.$list248, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$30 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list253);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym254$WITH_JUST_MT, v_hlmt, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym255$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym256$FLATTEN, v_hlmt), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym11$COR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym12$NULL, type), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.EQ, type, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym257$ASSERTION_TYPE, var))), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym258$HLMT_EQUAL_, v_hlmt, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym259$ASSERTION_HLMT, var)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 146316L)
    public static SubLObject do_mt_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject mt = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list247);
        mt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$31 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list247);
            current_$31 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list247);
            if (kb_mapping_macros.NIL == conses_high.member(current_$31, (SubLObject)kb_mapping_macros.$list248, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$31 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list247);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw223$TYPE, current);
        final SubLObject type = (SubLObject)((kb_mapping_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym260$PCASE, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym261$DO_MT_CONTENTS_METHOD, mt), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw262$MT, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym227$DO_MT_INDEX, (SubLObject)ConsesLow.list(var, mt, (SubLObject)kb_mapping_macros.$kw223$TYPE, type, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw263$BROAD_MT, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym252$DO_BROAD_MT_INDEX, (SubLObject)ConsesLow.list(var, mt, (SubLObject)kb_mapping_macros.$kw223$TYPE, type, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)kb_mapping_macros.$list264);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 147199L)
    public static SubLObject do_mt_contents_method(final SubLObject mt) {
        assert kb_mapping_macros.NIL != hlmt.hlmt_p(mt) : mt;
        return (SubLObject)((kb_mapping_macros.NIL != kb_indexing.broad_mtP(mt)) ? kb_mapping_macros.$kw263$BROAD_MT : kb_mapping_macros.$kw262$MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 147355L)
    public static SubLObject do_overlap_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list267);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject terms = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list267);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list267);
        terms = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$32 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list267);
            current_$32 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list267);
            if (kb_mapping_macros.NIL == conses_high.member(current_$32, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$32 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list267);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym25$DO_ASSERTION_LIST, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym269$GATHER_OVERLAP_INDEX, terms), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 148027L)
    public static SubLObject do_gafs_potentially_matching_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject asent = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$33 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list270);
            current_$33 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list270);
            if (kb_mapping_macros.NIL == conses_high.member(current_$33, (SubLObject)kb_mapping_macros.$list271, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$33 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list270);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw272$METHODS, current);
        final SubLObject v_methods = (SubLObject)((kb_mapping_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym273$DO_BEST_GAF_LOOKUP_INDEX, (SubLObject)ConsesLow.list(assertion_var, asent, (SubLObject)kb_mapping_macros.$kw272$METHODS, v_methods, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 148887L)
    public static SubLObject do_best_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject asent = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list270);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$34 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list270);
            current_$34 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list270);
            if (kb_mapping_macros.NIL == conses_high.member(current_$34, (SubLObject)kb_mapping_macros.$list271, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$34 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list270);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw272$METHODS, current);
        final SubLObject v_methods = (SubLObject)((kb_mapping_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : kb_mapping_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym275$BEST_GAF_LOOKUP_INDEX, asent, truth, v_methods), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 149954L)
    public static SubLObject do_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$35 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            current_$35 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            if (kb_mapping_macros.NIL == conses_high.member(current_$35, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$35 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list276);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject l_index = (SubLObject)kb_mapping_macros.$sym277$L_INDEX;
        final SubLObject method = (SubLObject)kb_mapping_macros.$sym278$METHOD;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(l_index, lookup_index), (SubLObject)ConsesLow.list(method, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym279$DO_GLI_EXTRACT_METHOD, l_index))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym260$PCASE, method, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw75$GAF_ARG, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym280$DO_GLI_VIA_GAF_ARG, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw97$PREDICATE_EXTENT, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym281$DO_GLI_VIA_PREDICATE_EXTENT, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw282$OVERLAP, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym283$DO_GLI_VIA_OVERLAP, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym284$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym285$DO_GLI_METHOD_ERROR, l_index, method))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 150780L)
    public static SubLObject do_gli_extract_method(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw286$INDEX_TYPE, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 150950L)
    public static SubLObject do_gli_method_error(final SubLObject lookup_index, final SubLObject method) {
        if (kb_mapping_macros.NIL == lookup_index) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        return Errors.cerror((SubLObject)kb_mapping_macros.$str287$Skip_iteration, (SubLObject)kb_mapping_macros.$str288$Unsupported_method__S_in__S_in_DO, method, lookup_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 151250L)
    public static SubLObject do_gli_via_gaf_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$36 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            current_$36 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            if (kb_mapping_macros.NIL == conses_high.member(current_$36, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$36 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list276);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject v_term = (SubLObject)kb_mapping_macros.$sym289$TERM;
        final SubLObject argnum = (SubLObject)kb_mapping_macros.$sym290$ARGNUM;
        final SubLObject predicate = (SubLObject)kb_mapping_macros.$sym291$PREDICATE;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym292$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(v_term, argnum, predicate), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym293$DO_GLI_VGA_EXTRACT_KEYS, lookup_index), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, argnum, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, predicate, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion_var, v_term, kb_mapping_macros.$kw55$INDEX, argnum, kb_mapping_macros.$kw56$PREDICATE, predicate, kb_mapping_macros.$kw18$TRUTH, truth, kb_mapping_macros.$kw20$DONE, done }), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw55$INDEX, argnum, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, predicate, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw56$PREDICATE, predicate, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152053L)
    public static SubLObject do_gli_vga_extract_keys(final SubLObject lookup_index) {
        return subl_promotions.values3(kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw295$TERM, (SubLObject)kb_mapping_macros.UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw296$ARGNUM, (SubLObject)kb_mapping_macros.UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw56$PREDICATE, (SubLObject)kb_mapping_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152322L)
    public static SubLObject do_gli_via_predicate_extent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$37 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            current_$37 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            if (kb_mapping_macros.NIL == conses_high.member(current_$37, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$37 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list276);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym90$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym297$DO_GLI_VPE_EXTRACT_KEY, lookup_index), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152624L)
    public static SubLObject do_gli_vpe_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw56$PREDICATE, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 152784L)
    public static SubLObject do_gli_via_overlap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$38 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            current_$38 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            if (kb_mapping_macros.NIL == conses_high.member(current_$38, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$38 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list276);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym255$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym298$DO_GLI_VO_EXTRACT_KEY, lookup_index), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 153056L)
    public static SubLObject do_gli_vo_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw299$TERMS, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 153202L)
    public static SubLObject do_narts_potentially_matching_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject nart_hl_formula = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list300);
        nart_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list300);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$39 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list300);
            current_$39 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list300);
            if (kb_mapping_macros.NIL == conses_high.member(current_$39, (SubLObject)kb_mapping_macros.$list301, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$39 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list300);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw272$METHODS, current);
        final SubLObject v_methods = (SubLObject)((kb_mapping_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject tou_var = (SubLObject)kb_mapping_macros.$sym302$TOU_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym303$DO_BEST_NAT_LOOKUP_INDEX, (SubLObject)ConsesLow.list(tou_var, nart_hl_formula, (SubLObject)kb_mapping_macros.$kw272$METHODS, v_methods, (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(nart_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym118$GAF_ARG1, tou_var))), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 154291L)
    public static SubLObject do_term_of_unit_assertions_potentially_matching_nat_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject nart_hl_formula = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$40 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list304);
            current_$40 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list304);
            if (kb_mapping_macros.NIL == conses_high.member(current_$40, (SubLObject)kb_mapping_macros.$list301, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$40 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list304);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw272$METHODS, current);
        final SubLObject v_methods = (SubLObject)((kb_mapping_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym303$DO_BEST_NAT_LOOKUP_INDEX, (SubLObject)ConsesLow.list(assertion_var, nart_hl_formula, (SubLObject)kb_mapping_macros.$kw272$METHODS, v_methods, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 154938L)
    public static SubLObject do_best_nat_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject nart_hl_formula = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list304);
        nart_hl_formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$41 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list304);
            current_$41 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list304);
            if (kb_mapping_macros.NIL == conses_high.member(current_$41, (SubLObject)kb_mapping_macros.$list301, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$41 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list304);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw272$METHODS, current);
        final SubLObject v_methods = (SubLObject)((kb_mapping_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym306$BEST_NAT_LOOKUP_INDEX, nart_hl_formula, v_methods), (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 155915L)
    public static SubLObject do_nat_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$42 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            current_$42 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            if (kb_mapping_macros.NIL == conses_high.member(current_$42, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$42 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list307);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject l_index = (SubLObject)kb_mapping_macros.$sym308$L_INDEX;
        final SubLObject method = (SubLObject)kb_mapping_macros.$sym309$METHOD;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(l_index, lookup_index), (SubLObject)ConsesLow.list(method, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym310$DO_NLI_EXTRACT_METHOD, l_index))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym260$PCASE, method, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw107$NART_ARG, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym311$DO_NLI_VIA_NART_ARG, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw312$FUNCTION_EXTENT, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym313$DO_NLI_VIA_FUNCTION_EXTENT, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw282$OVERLAP, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym314$DO_NLI_VIA_OVERLAP, (SubLObject)ConsesLow.list(assertion_var, l_index, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym284$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym315$DO_NLI_METHOD_ERROR, l_index, method))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 156567L)
    public static SubLObject do_nli_extract_method(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw286$INDEX_TYPE, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 156737L)
    public static SubLObject do_nli_method_error(final SubLObject lookup_index, final SubLObject method) {
        if (kb_mapping_macros.NIL == lookup_index) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        return Errors.cerror((SubLObject)kb_mapping_macros.$str287$Skip_iteration, (SubLObject)kb_mapping_macros.$str316$Unsupported_method__S_in__S_in_DO, method, lookup_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 157037L)
    public static SubLObject do_nli_via_nart_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$43 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            current_$43 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            if (kb_mapping_macros.NIL == conses_high.member(current_$43, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$43 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list307);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject v_term = (SubLObject)kb_mapping_macros.$sym317$TERM;
        final SubLObject argnum = (SubLObject)kb_mapping_macros.$sym318$ARGNUM;
        final SubLObject functor = (SubLObject)kb_mapping_macros.$sym319$FUNCTOR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym292$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(v_term, argnum, functor), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym320$DO_NLI_VNA_EXTRACT_KEYS, lookup_index), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, argnum, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, functor, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw55$INDEX, argnum, (SubLObject)kb_mapping_macros.$kw100$FUNCTION, functor, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw55$INDEX, argnum, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, functor, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw100$FUNCTION, functor, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX, (SubLObject)ConsesLow.list(assertion_var, v_term, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 157741L)
    public static SubLObject do_nli_vna_extract_keys(final SubLObject lookup_index) {
        return Values.values(kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw295$TERM, (SubLObject)kb_mapping_macros.UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw296$ARGNUM, (SubLObject)kb_mapping_macros.UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw321$FUNCTOR, (SubLObject)kb_mapping_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158013L)
    public static SubLObject do_nli_via_function_extent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list307);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$44 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            current_$44 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list307);
            if (kb_mapping_macros.NIL == conses_high.member(current_$44, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$44 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list307);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym114$DO_FUNCTION_EXTENT_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym322$DO_NLI_VFE_EXTRACT_KEY, lookup_index), (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158283L)
    public static SubLObject do_nli_vfe_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw321$FUNCTOR, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158440L)
    public static SubLObject do_nli_via_overlap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject lookup_index = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list276);
        lookup_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$45 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            current_$45 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list276);
            if (kb_mapping_macros.NIL == conses_high.member(current_$45, (SubLObject)kb_mapping_macros.$list268, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$45 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list276);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw18$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_mapping_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym255$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym323$DO_NLI_VO_EXTRACT_KEY, lookup_index), (SubLObject)kb_mapping_macros.$kw18$TRUTH, truth, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158712L)
    public static SubLObject do_nli_vo_extract_key(final SubLObject lookup_index) {
        return kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_mapping_macros.$kw299$TERMS, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 158858L)
    public static SubLObject simple_final_index_spec_p(final SubLObject final_index_spec) {
        return Equality.eq((SubLObject)kb_mapping_macros.$kw240$SIMPLE, final_index_spec.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 159493L)
    public static SubLObject simple_final_index_spec_term(final SubLObject final_index_spec) {
        return conses_high.second(final_index_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 159593L)
    public static SubLObject new_final_index_iterator(final SubLObject final_index_spec, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == kb_mapping_macros.UNPROVIDED) {
            type = (SubLObject)kb_mapping_macros.NIL;
        }
        if (truth == kb_mapping_macros.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_macros.NIL;
        }
        if (direction == kb_mapping_macros.UNPROVIDED) {
            direction = (SubLObject)kb_mapping_macros.NIL;
        }
        if (kb_mapping_macros.NIL != simple_final_index_spec_p(final_index_spec)) {
            final SubLObject assertions = simple_term_assertion_list_filtered(final_index_spec, type, truth, direction);
            final SubLObject syntactic_iterator = iteration.new_list_iterator(assertions);
            final SubLObject semantic_iterator = iteration.new_filter_iterator_without_values(syntactic_iterator, (SubLObject)kb_mapping_macros.$sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_, (SubLObject)ConsesLow.list(final_index_spec), (SubLObject)kb_mapping_macros.UNPROVIDED);
            return semantic_iterator;
        }
        final SubLObject iterator = hl_interface_infrastructure.new_hl_store_iterator((SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym325$FINAL_INDEX_ITERATOR_FILTERED, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym326$QUOTE, final_index_spec), type, truth, direction), (SubLObject)kb_mapping_macros.ONE_INTEGER);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 160748L)
    public static SubLObject assertion_semantically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        SubLObject type = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(simple_final_index_spec, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        simple = simple_final_index_spec.first();
        SubLObject current = simple_final_index_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        type = current.first();
        current = (rest = current.rest());
        if (kb_mapping_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_mapping_macros.$kw240$SIMPLE != simple) {
            Errors.error((SubLObject)kb_mapping_macros.$str328$Unexpected_non_simple_index__s, simple_final_index_spec);
        }
        if (kb_mapping_macros.$kw28$GAF == type) {
            SubLObject current_$47;
            final SubLObject datum_$46 = current_$47 = rest;
            SubLObject argnum_spec = (SubLObject)kb_mapping_macros.NIL;
            SubLObject pred_spec = (SubLObject)kb_mapping_macros.NIL;
            SubLObject mt_spec = (SubLObject)kb_mapping_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)kb_mapping_macros.$list329);
            argnum_spec = current_$47.first();
            current_$47 = current_$47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)kb_mapping_macros.$list329);
            pred_spec = current_$47.first();
            current_$47 = current_$47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)kb_mapping_macros.$list329);
            mt_spec = current_$47.first();
            current_$47 = current_$47.rest();
            if (kb_mapping_macros.NIL == current_$47) {
                if (kb_mapping_macros.NIL == mt_spec && kb_mapping_macros.NIL == assertion_utilities.assertion_matches_mtP(assertion)) {
                    return (SubLObject)kb_mapping_macros.NIL;
                }
                if (kb_mapping_macros.NIL == pred_spec && kb_mapping_macros.NIL == pred_relevance_macros.all_preds_are_relevantP()) {
                    final SubLObject pred = assertions_high.gaf_predicate(assertion);
                    if (kb_mapping_macros.NIL == pred_relevance_macros.relevant_predP(pred)) {
                        return (SubLObject)kb_mapping_macros.NIL;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$46, (SubLObject)kb_mapping_macros.$list329);
            }
        }
        else {
            if (kb_mapping_macros.$kw330$NART == type) {
                return (SubLObject)kb_mapping_macros.T;
            }
            if (kb_mapping_macros.$kw30$RULE == type) {
                if (kb_mapping_macros.NIL == assertion_utilities.assertion_matches_mtP(assertion)) {
                    return (SubLObject)kb_mapping_macros.NIL;
                }
            }
            else if (kb_mapping_macros.NIL == type) {
                SubLObject current_$48;
                final SubLObject datum_$47 = current_$48 = rest;
                SubLObject assertion_func = (SubLObject)kb_mapping_macros.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$48, datum_$47, (SubLObject)kb_mapping_macros.$list331);
                assertion_func = current_$48.first();
                current_$48 = current_$48.rest();
                if (kb_mapping_macros.NIL == current_$48) {
                    if (kb_mapping_macros.$sym228$MT_INDEX_ASSERTION_MATCH_P == assertion_func) {
                        return (SubLObject)kb_mapping_macros.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$47, (SubLObject)kb_mapping_macros.$list331);
                }
                if (kb_mapping_macros.NIL == assertion_utilities.assertion_matches_mtP(assertion)) {
                    return (SubLObject)kb_mapping_macros.NIL;
                }
            }
            else {
                Errors.error((SubLObject)kb_mapping_macros.$str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
            }
        }
        return (SubLObject)kb_mapping_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 162261L)
    public static SubLObject destroy_final_index_iterator(final SubLObject final_index_iterator) {
        return iteration.iteration_finalize(final_index_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 162499L)
    public static SubLObject do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list333);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list333);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list333);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$50 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list333);
            current_$50 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list333);
            if (kb_mapping_macros.NIL == conses_high.member(current_$50, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$50 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list333);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject assertion_var = (SubLObject)kb_mapping_macros.$sym334$ASSERTION_VAR;
        final SubLObject clause_struc = (SubLObject)kb_mapping_macros.$sym335$CLAUSE_STRUC;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, assertion)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym82$PIF_FEATURE, (SubLObject)kb_mapping_macros.$kw83$CYC_ALEXANDRIA, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym294$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym336$ASSERTION_GAF_P, assertion_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym337$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym338$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym339$FIRST, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym340$SECOND, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym341$ASSERTION_CNF, assertion_var))), (SubLObject)kb_mapping_macros.$list342), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym343$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym344$KBEQ, var, assertion_var), reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym337$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym345$NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym341$ASSERTION_CNF, assertion_var)), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym343$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym344$KBEQ, var, assertion_var), reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL))))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(clause_struc, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym346$ASSERTION_CLAUSE_STRUC, assertion_var))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, clause_struc, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym347$CDOLIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym348$CLAUSE_STRUC_ASSERTIONS, clause_struc)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym343$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym344$KBEQ, var, assertion_var), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym343$PUNLESS, done, reader.bq_cons((SubLObject)kb_mapping_macros.$sym6$PROGN, ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 164308L)
    public static SubLObject new_do_assertions_with_same_assertion_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list349);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list349);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list349);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$51 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list349);
            current_$51 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list349);
            if (kb_mapping_macros.NIL == conses_high.member(current_$51, (SubLObject)kb_mapping_macros.$list350, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$51 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list349);
        }
        final SubLObject exclusiveP_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw351$EXCLUSIVE_, current);
        final SubLObject exclusiveP = (SubLObject)((kb_mapping_macros.NIL != exclusiveP_tail) ? conses_high.cadr(exclusiveP_tail) : kb_mapping_macros.T);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!assertion.isAtom()) {
            final SubLObject assertion_var = (SubLObject)kb_mapping_macros.$sym352$ASSERTION_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, assertion)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, (SubLObject)ConsesLow.list(var, assertion_var, (SubLObject)kb_mapping_macros.$kw351$EXCLUSIVE_, exclusiveP, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
        }
        if (!exclusiveP.isAtom()) {
            final SubLObject exclusive_var = (SubLObject)kb_mapping_macros.$sym354$EXCLUSIVE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(exclusive_var, exclusiveP)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA, (SubLObject)ConsesLow.list(var, assertion, (SubLObject)kb_mapping_macros.$kw351$EXCLUSIVE_, exclusive_var, (SubLObject)kb_mapping_macros.$kw20$DONE, done), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym337$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, assertion), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym343$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym356$CAND, exclusiveP, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym344$KBEQ, var, assertion)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 165565L)
    public static SubLObject new_assertions_with_same_assertion_formula_iterator(final SubLObject assertion) {
        final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
        if (kb_mapping_macros.NIL != clause_struc) {
            return iteration.new_list_iterator(clause_strucs.clause_struc_assertions(clause_struc));
        }
        return iteration.new_singleton_iterator(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 166201L)
    public static SubLObject assertions_with_same_assertion_formula_p(final SubLObject assertion1, final SubLObject assertion2) {
        assert kb_mapping_macros.NIL != assertion_handles.assertion_p(assertion1) : assertion1;
        assert kb_mapping_macros.NIL != assertion_handles.assertion_p(assertion2) : assertion2;
        if (kb_mapping_macros.NIL != kb_utilities.kbeq(assertion1, assertion2)) {
            return (SubLObject)kb_mapping_macros.T;
        }
        final SubLObject clause_struc1 = assertions_low.assertion_clause_struc(assertion1);
        final SubLObject clause_struc2 = assertions_low.assertion_clause_struc(assertion2);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != clause_strucs.clause_struc_p(clause_struc1) && kb_mapping_macros.NIL != kb_utilities.kbeq(clause_struc1, clause_struc2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 166897L)
    public static SubLObject final_index_iterator_filtered(final SubLObject final_index_spec, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec) {
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        SubLObject keys = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(final_index_spec, final_index_spec, (SubLObject)kb_mapping_macros.$list358);
        v_term = final_index_spec.first();
        final SubLObject current = keys = final_index_spec.rest();
        final SubLObject final_index = kb_indexing.get_subindex(v_term, keys);
        if (kb_mapping_macros.NIL == final_index) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        assert kb_mapping_macros.NIL != kb_indexing_datastructures.final_index_p(final_index) : final_index;
        final SubLObject raw_iterator = kb_indexing_datastructures.new_final_index_base_iterator(final_index);
        final SubLObject filtered_iterator = iteration.new_filter_iterator_without_values(raw_iterator, (SubLObject)kb_mapping_macros.$sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_, (SubLObject)ConsesLow.list(type_spec, truth_spec, direction_spec), (SubLObject)kb_mapping_macros.UNPROVIDED);
        return filtered_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 167981L)
    public static SubLObject new_gaf_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject predicate_spec, final SubLObject mt_spec) {
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw240$SIMPLE, v_term, (SubLObject)kb_mapping_macros.$kw28$GAF, argnum_spec, predicate_spec, mt_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 168508L)
    public static SubLObject new_nart_simple_final_index_spec(final SubLObject v_term, final SubLObject argnum_spec, final SubLObject functor_spec) {
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw240$SIMPLE, v_term, (SubLObject)kb_mapping_macros.$kw330$NART, argnum_spec, functor_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 168976L)
    public static SubLObject new_rule_simple_final_index_spec(final SubLObject v_term, final SubLObject sense_spec, final SubLObject asent_func) {
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw240$SIMPLE, v_term, (SubLObject)kb_mapping_macros.$kw30$RULE, sense_spec, asent_func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169526L)
    public static SubLObject new_assertion_simple_final_index_spec(final SubLObject v_term, final SubLObject assertion_func) {
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$kw240$SIMPLE, v_term, (SubLObject)kb_mapping_macros.NIL, assertion_func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
    public static SubLObject clear_simple_term_assertion_list_filtered() {
        final SubLObject cs = kb_mapping_macros.$simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
        if (kb_mapping_macros.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
    public static SubLObject remove_simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_mapping_macros.$simple_term_assertion_list_filtered_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(simple_final_index_spec, type, truth, direction), (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
    public static SubLObject simple_term_assertion_list_filtered_internal(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        final SubLObject v_term = simple_final_index_spec_term(simple_final_index_spec);
        SubLObject cdolist_list_var = kb_indexing_datastructures.simple_term_assertion_list(v_term);
        SubLObject assertion = (SubLObject)kb_mapping_macros.NIL;
        assertion = cdolist_list_var.first();
        while (kb_mapping_macros.NIL != cdolist_list_var) {
            if (kb_mapping_macros.NIL != assertion_syntactically_matches_simple_final_index_specP(assertion, simple_final_index_spec) && kb_mapping_macros.NIL != assertion_utilities.assertion_matches_type_truth_and_directionP(assertion, type, truth, direction)) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 169868L)
    public static SubLObject simple_term_assertion_list_filtered(final SubLObject simple_final_index_spec, final SubLObject type, final SubLObject truth, final SubLObject direction) {
        SubLObject caching_state = kb_mapping_macros.$simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
        if (kb_mapping_macros.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_mapping_macros.$sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED, (SubLObject)kb_mapping_macros.$sym362$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_, (SubLObject)kb_mapping_macros.$int363$512, (SubLObject)kb_mapping_macros.EQUAL, (SubLObject)kb_mapping_macros.FOUR_INTEGER, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)kb_mapping_macros.$sym364$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(simple_final_index_spec, type, truth, direction);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)kb_mapping_macros.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)kb_mapping_macros.NIL;
            collision = cdolist_list_var.first();
            while (kb_mapping_macros.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (simple_final_index_spec.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (truth.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (kb_mapping_macros.NIL != cached_args && kb_mapping_macros.NIL == cached_args.rest() && direction.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(simple_term_assertion_list_filtered_internal(simple_final_index_spec, type, truth, direction)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(simple_final_index_spec, type, truth, direction));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 170733L)
    public static SubLObject assertion_syntactically_matches_simple_final_index_specP(final SubLObject assertion, final SubLObject simple_final_index_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple = (SubLObject)kb_mapping_macros.NIL;
        SubLObject v_term = (SubLObject)kb_mapping_macros.NIL;
        SubLObject type = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(simple_final_index_spec, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        simple = simple_final_index_spec.first();
        SubLObject current = simple_final_index_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, simple_final_index_spec, (SubLObject)kb_mapping_macros.$list327);
        type = current.first();
        current = (rest = current.rest());
        if (kb_mapping_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_mapping_macros.$kw240$SIMPLE != simple) {
            Errors.error((SubLObject)kb_mapping_macros.$str328$Unexpected_non_simple_index__s, simple_final_index_spec);
        }
        if (kb_mapping_macros.NIL != assertion_matches_syntactic_indexing_typeP(assertion, type)) {
            if (kb_mapping_macros.$kw28$GAF == type) {
                return gaf_syntactically_matches_simple_gaf_final_index_specP(assertion, v_term, rest);
            }
            if (kb_mapping_macros.$kw330$NART == type) {
                return tou_syntactically_matches_simple_nart_final_index_specP(assertion, v_term, rest);
            }
            if (kb_mapping_macros.$kw30$RULE == type) {
                return rule_syntactically_matches_simple_rule_final_index_specP(assertion, v_term, rest);
            }
            if (kb_mapping_macros.NIL == type) {
                return assertion_syntactically_matches_simple_assertion_final_index_specP(assertion, v_term, rest);
            }
            Errors.error((SubLObject)kb_mapping_macros.$str332$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 171980L)
    public static SubLObject assertion_matches_syntactic_indexing_typeP(final SubLObject assertion, final SubLObject type) {
        if (kb_mapping_macros.$kw330$NART == type) {
            return function_terms.term_of_unit_assertion_p(assertion);
        }
        return assertion_utilities.assertion_matches_typeP(assertion, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 172186L)
    public static SubLObject gaf_syntactically_matches_simple_gaf_final_index_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject gaf_final_index_spec) {
        SubLObject argnum_spec = (SubLObject)kb_mapping_macros.NIL;
        SubLObject predicate_spec = (SubLObject)kb_mapping_macros.NIL;
        SubLObject mt_spec = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(gaf_final_index_spec, gaf_final_index_spec, (SubLObject)kb_mapping_macros.$list365);
        argnum_spec = gaf_final_index_spec.first();
        SubLObject current = gaf_final_index_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, gaf_final_index_spec, (SubLObject)kb_mapping_macros.$list365);
        predicate_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, gaf_final_index_spec, (SubLObject)kb_mapping_macros.$list365);
        mt_spec = current.first();
        current = current.rest();
        if (kb_mapping_macros.NIL == current) {
            if ((kb_mapping_macros.NIL == predicate_spec || kb_mapping_macros.NIL != assertion_utilities.gaf_assertion_has_pred_p(gaf, predicate_spec)) && kb_mapping_macros.NIL != gaf_matches_simple_argnum_specP(gaf, v_term, argnum_spec) && (kb_mapping_macros.NIL == mt_spec || kb_mapping_macros.NIL != assertions_high.assertion_has_mtP(gaf, mt_spec))) {
                return (SubLObject)kb_mapping_macros.T;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(gaf_final_index_spec, (SubLObject)kb_mapping_macros.$list365);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 172609L)
    public static SubLObject gaf_matches_simple_argnum_specP(final SubLObject gaf, final SubLObject v_term, final SubLObject argnum_spec) {
        if (kb_mapping_macros.NIL == argnum_spec) {
            return (SubLObject)kb_mapping_macros.T;
        }
        if (kb_mapping_macros.$kw71$ANY == argnum_spec) {
            return assertion_utilities.gaf_has_term_in_some_argnumP(gaf, v_term);
        }
        if (argnum_spec.isInteger()) {
            return assertion_utilities.gaf_has_term_in_argnumP(gaf, v_term, argnum_spec);
        }
        if (!argnum_spec.isCons() || kb_mapping_macros.NIL == list_utilities.lengthE(argnum_spec, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) || !argnum_spec.first().isInteger()) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        SubLObject n = (SubLObject)kb_mapping_macros.NIL;
        SubLObject m = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(argnum_spec, argnum_spec, (SubLObject)kb_mapping_macros.$list366);
        n = argnum_spec.first();
        SubLObject current = argnum_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, argnum_spec, (SubLObject)kb_mapping_macros.$list366);
        m = current.first();
        current = current.rest();
        if (kb_mapping_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(argnum_spec, (SubLObject)kb_mapping_macros.$list366);
            return (SubLObject)kb_mapping_macros.NIL;
        }
        final SubLObject subformula = assertions_high.gaf_arg(gaf, n);
        assert kb_mapping_macros.NIL != el_utilities.el_formula_p(subformula) : subformula;
        if (m == kb_mapping_macros.$kw71$ANY) {
            return el_utilities.term_is_one_of_argsP(v_term, subformula);
        }
        return el_utilities.formula_has_term_in_argnumP(subformula, v_term, m);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 173775L)
    public static SubLObject tou_syntactically_matches_simple_nart_final_index_specP(final SubLObject tou_gaf, final SubLObject v_term, final SubLObject nart_final_index_spec) {
        SubLObject argnum_spec = (SubLObject)kb_mapping_macros.NIL;
        SubLObject functor_spec = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(nart_final_index_spec, nart_final_index_spec, (SubLObject)kb_mapping_macros.$list368);
        argnum_spec = nart_final_index_spec.first();
        SubLObject current = nart_final_index_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, nart_final_index_spec, (SubLObject)kb_mapping_macros.$list368);
        functor_spec = current.first();
        current = current.rest();
        if (kb_mapping_macros.NIL == current) {
            return simple_indexing.matches_nart_arg_index(tou_gaf, v_term, (SubLObject)((kb_mapping_macros.$kw71$ANY == argnum_spec) ? kb_mapping_macros.NIL : argnum_spec), functor_spec);
        }
        cdestructuring_bind.cdestructuring_bind_error(nart_final_index_spec, (SubLObject)kb_mapping_macros.$list368);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 174064L)
    public static SubLObject rule_syntactically_matches_simple_rule_final_index_specP(final SubLObject rule, final SubLObject v_term, final SubLObject rule_final_index_spec) {
        SubLObject sense = (SubLObject)kb_mapping_macros.NIL;
        SubLObject asent_func = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rule_final_index_spec, rule_final_index_spec, (SubLObject)kb_mapping_macros.$list369);
        sense = rule_final_index_spec.first();
        SubLObject current = rule_final_index_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rule_final_index_spec, (SubLObject)kb_mapping_macros.$list369);
        asent_func = current.first();
        current = current.rest();
        if (kb_mapping_macros.NIL == current) {
            if (kb_mapping_macros.NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, sense, v_term, asent_func)) {
                return (SubLObject)kb_mapping_macros.T;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(rule_final_index_spec, (SubLObject)kb_mapping_macros.$list369);
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 174520L)
    public static SubLObject rule_syntactically_matches_simple_rule_final_index_spec_intP(final SubLObject rule, final SubLObject sense, final SubLObject v_term, final SubLObject asent_func) {
        if (kb_mapping_macros.NIL == sense) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, (SubLObject)kb_mapping_macros.$kw127$NEG, v_term, asent_func) || kb_mapping_macros.NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, (SubLObject)kb_mapping_macros.$kw126$POS, v_term, asent_func));
        }
        if (kb_mapping_macros.NIL != assertion_handles.valid_assertion_handleP(rule)) {
            final SubLObject asents = clauses.clause_sense_lits(assertions_high.assertion_cnf(rule), sense);
            SubLObject match = (SubLObject)kb_mapping_macros.NIL;
            if (kb_mapping_macros.NIL == match) {
                SubLObject csome_list_var;
                SubLObject asent;
                for (csome_list_var = asents, asent = (SubLObject)kb_mapping_macros.NIL, asent = csome_list_var.first(); kb_mapping_macros.NIL == match && kb_mapping_macros.NIL != csome_list_var; match = asent_syntactically_matches_simple_rule_final_index_specP(asent, v_term, asent_func), csome_list_var = csome_list_var.rest(), asent = csome_list_var.first()) {}
            }
            return match;
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175121L)
    public static SubLObject asent_syntactically_matches_simple_rule_final_index_specP(final SubLObject asent, final SubLObject v_term, final SubLObject asent_func) {
        SubLObject result = (SubLObject)kb_mapping_macros.NIL;
        if (asent_func.eql((SubLObject)kb_mapping_macros.$sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P)) {
            result = predicate_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym154$ISA_RULE_INDEX_ASENT_MATCH_P)) {
            result = isa_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym170$GENLS_RULE_INDEX_ASENT_MATCH_P)) {
            result = genls_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P)) {
            result = genl_mt_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P)) {
            result = function_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P)) {
            result = exception_rule_index_asent_match_p(asent, v_term);
        }
        else if (asent_func.eql((SubLObject)kb_mapping_macros.$sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P)) {
            result = pragma_rule_index_asent_match_p(asent, v_term);
        }
        else {
            result = Functions.funcall(asent_func, asent, v_term);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175540L)
    public static SubLObject assertion_syntactically_matches_simple_assertion_final_index_specP(final SubLObject assertion, final SubLObject v_term, final SubLObject assertion_final_index_spec) {
        SubLObject assertion_func = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(assertion_final_index_spec, assertion_final_index_spec, (SubLObject)kb_mapping_macros.$list331);
        assertion_func = assertion_final_index_spec.first();
        final SubLObject current = assertion_final_index_spec.rest();
        if (kb_mapping_macros.NIL == current) {
            SubLObject result = (SubLObject)kb_mapping_macros.NIL;
            final SubLObject pcase_var = assertion_func;
            if (pcase_var.eql((SubLObject)kb_mapping_macros.$sym228$MT_INDEX_ASSERTION_MATCH_P)) {
                result = mt_index_assertion_match_p(assertion, v_term);
            }
            else {
                result = Functions.funcall(assertion_func, assertion, v_term);
            }
            return result;
        }
        cdestructuring_bind.cdestructuring_bind_error(assertion_final_index_spec, (SubLObject)kb_mapping_macros.$list331);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 175868L)
    public static SubLObject predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != predicate_rule_index_asent_p(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 176118L)
    public static SubLObject predicate_rule_index_asent_p(final SubLObject asent) {
        if (kb_mapping_macros.NIL == forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent))) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (pcase_var.eql(kb_mapping_macros.$const155$isa)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == isa_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const171$genls)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == genls_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const179$genlMt)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == genl_mt_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const120$termOfUnit)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == function_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const370$abnormal)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == exception_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const371$meetsPragmaticRequirement)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == pragma_rule_index_asent_p(asent));
        }
        return (SubLObject)kb_mapping_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 177121L)
    public static SubLObject decontextualized_ist_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != el_utilities.ist_predicateP(cycl_utilities.atomic_sentence_predicate(asent), kb_indexing.spec_preds_of_ist_indexing_enabledP()) && predicate.eql(el_utilities.literal_predicate(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED), (SubLObject)kb_mapping_macros.UNPROVIDED)) && kb_mapping_macros.NIL != decontextualized_ist_predicate_rule_index_asent_p(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 177485L)
    public static SubLObject decontextualized_ist_predicate_rule_index_asent_p(final SubLObject asent) {
        if (kb_mapping_macros.NIL == el_utilities.ist_predicateP(cycl_utilities.atomic_sentence_predicate(asent), kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
            return (SubLObject)kb_mapping_macros.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = el_utilities.literal_predicate(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED), (SubLObject)kb_mapping_macros.UNPROVIDED);
        if (pcase_var.eql(kb_mapping_macros.$const155$isa)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == isa_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const171$genls)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == genls_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const179$genlMt)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == genl_mt_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const120$termOfUnit)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == function_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const370$abnormal)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == exception_rule_index_asent_p(asent));
        }
        if (pcase_var.eql(kb_mapping_macros.$const371$meetsPragmaticRequirement)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == pragma_rule_index_asent_p(asent));
        }
        return (SubLObject)kb_mapping_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178529L)
    public static SubLObject isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != isa_rule_index_asent_p(asent) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178730L)
    public static SubLObject quoted_isa_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != quoted_isa_rule_index_asent_p(asent) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 178951L)
    public static SubLObject isa_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const155$isa.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179200L)
    public static SubLObject quoted_isa_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const164$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179468L)
    public static SubLObject genls_rule_index_asent_match_p(final SubLObject asent, final SubLObject collection) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != genls_rule_index_asent_p(asent) && collection.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179675L)
    public static SubLObject genls_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const171$genls.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 179930L)
    public static SubLObject genl_mt_rule_index_asent_match_p(final SubLObject asent, final SubLObject genl_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != genl_mt_rule_index_asent_p(asent) && genl_mt.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180133L)
    public static SubLObject genl_mt_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const179$genlMt.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180392L)
    public static SubLObject function_rule_index_asent_match_p(final SubLObject asent, final SubLObject function) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != function_rule_index_asent_p(asent) && function.eql(cycl_utilities.formula_operator(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 180638L)
    public static SubLObject function_rule_index_asent_p(final SubLObject asent) {
        if (kb_mapping_macros.$const120$termOfUnit.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != el_utilities.possibly_naut_p(arg2) && kb_mapping_macros.NIL != forts.fort_p(cycl_utilities.formula_operator(arg2)));
        }
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181010L)
    public static SubLObject exception_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != exception_rule_index_asent_p(asent) && rule.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181210L)
    public static SubLObject exception_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const370$abnormal.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181485L)
    public static SubLObject pragma_rule_index_asent_match_p(final SubLObject asent, final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL != pragma_rule_index_asent_p(asent) && rule.eql(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 181696L)
    public static SubLObject pragma_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.$const371$meetsPragmaticRequirement.eql(cycl_utilities.atomic_sentence_predicate(asent)) && kb_mapping_macros.NIL != el_utilities.formula_arityE(asent, (SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.UNPROVIDED) && kb_mapping_macros.NIL != assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)kb_mapping_macros.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182002L)
    public static SubLObject unbound_predicate_rule_index_asent_match_p(final SubLObject asent, final SubLObject dummy) {
        return unbound_predicate_rule_index_asent_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182147L)
    public static SubLObject unbound_predicate_rule_index_asent_p(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_macros.NIL == variables.fully_bound_p(cycl_utilities.atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182315L)
    public static SubLObject mt_index_assertion_match_p(final SubLObject assertion, final SubLObject mt) {
        return hlmt.hlmt_equalP(mt, assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-macros.lisp", position = 182425L)
    public static SubLObject do_hlmts_with_monadic_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list372);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hlmt_var = (SubLObject)kb_mapping_macros.NIL;
        SubLObject monad = (SubLObject)kb_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list372);
        hlmt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_mapping_macros.$list372);
        monad = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_mapping_macros.NIL;
        SubLObject current_$52 = (SubLObject)kb_mapping_macros.NIL;
        while (kb_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list372);
            current_$52 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_mapping_macros.$list372);
            if (kb_mapping_macros.NIL == conses_high.member(current_$52, (SubLObject)kb_mapping_macros.$list116, (SubLObject)kb_mapping_macros.UNPROVIDED, (SubLObject)kb_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_mapping_macros.T;
            }
            if (current_$52 == kb_mapping_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_mapping_macros.NIL != bad && kb_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_mapping_macros.$list372);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_mapping_macros.$kw20$DONE, current);
        final SubLObject done = (SubLObject)((kb_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject hlmts_seen_so_far = (SubLObject)kb_mapping_macros.$sym373$HLMTS_SEEN_SO_FAR;
        final SubLObject assertion = (SubLObject)kb_mapping_macros.$sym374$ASSERTION;
        final SubLObject monad_var = (SubLObject)kb_mapping_macros.$sym375$MONAD_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(monad_var, monad), reader.bq_cons(hlmts_seen_so_far, (SubLObject)kb_mapping_macros.$list376)), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hlmt_var, monad)), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym377$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym378$LIST, kb_mapping_macros.$const379$MtSpace, monad_var, (SubLObject)kb_mapping_macros.$list380), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym255$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(assertion, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym378$LIST, monad_var), (SubLObject)kb_mapping_macros.$kw20$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym47$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hlmt_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym381$ASSERTION_MT, assertion))), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym382$HLMT_EQUAL, monad_var, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym383$HLMT_MONAD_MT, hlmt_var)), (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym343$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym384$SET_MEMBER_, hlmt_var, hlmts_seen_so_far), (SubLObject)ConsesLow.listS((SubLObject)kb_mapping_macros.$sym6$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_mapping_macros.$sym385$SET_ADD, hlmt_var, hlmts_seen_so_far), ConsesLow.append(body, (SubLObject)kb_mapping_macros.NIL)))))))));
    }
    
    public static SubLObject declare_kb_mapping_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_predicate_is_relevant", "PWHEN-PREDICATE-IS-RELEVANT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_mt_is_relevant", "PWHEN-MT-IS-RELEVANT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_truth_relevant", "PWHEN-TRUTH-RELEVANT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "truth_relevant_p", "TRUTH-RELEVANT-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_assertion_has_truth", "PWHEN-ASSERTION-HAS-TRUTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_assertion_has_direction_spec", "PWHEN-ASSERTION-HAS-DIRECTION-SPEC");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "direction_spec_p", "DIRECTION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertion_has_direction_spec", "ASSERTION-HAS-DIRECTION-SPEC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_assertion_list", "DO-ASSERTION-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_simple_index", "DO-SIMPLE-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "pwhen_assertion_has_type", "PWHEN-ASSERTION-HAS-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "some_assertions", "SOME-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "some_assertions_internal", "SOME-ASSERTIONS-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_final_index_from_spec", "DO-FINAL-INDEX-FROM-SPEC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gaf_arg_index", "DO-GAF-ARG-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gaf_arg_index_formulas", "DO-GAF-ARG-INDEX-FORMULAS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gaf_arg_index_values", "DO-GAF-ARG-INDEX-VALUES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gaf_arg_index_key_validator", "DO-GAF-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_gaf_arg_final_index_spec_iterator", "NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_gaf_arg_final_index_spec_iterator_state", "INITIALIZE-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_term", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_predicate", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_note", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_argnum_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_gaf_arg_final_index_spec_iterator_state_note", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_gaf_arg_final_index_spec_iterator_state_argnum_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_gaf_arg_final_index_spec_iterator_state_predicate_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_gaf_arg_final_index_spec_iterator_state_mt_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_current_argnum_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_current_predicate_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-PREDICATE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_state_current_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_current_keylist", "GAF-ARG-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_doneP", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_next", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $gaf_arg_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_quiesce", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_keylist_to_final_index_spec", "GAF-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_current_relevant_keylist", "GAF-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_quiesce_one_step", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_refill_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-PREDICATE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_refill_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_arg_final_index_spec_iterator_next_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_extent_index", "DO-PREDICATE-EXTENT-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_extent_index_formulas", "DO-PREDICATE-EXTENT-INDEX-FORMULAS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_extent_index_values", "DO-PREDICATE-EXTENT-INDEX-VALUES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_extent_index_key_validator", "DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_predicate_extent_final_index_spec_iterator", "NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_predicate_extent_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_state_predicate", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_state_mt_keys", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_predicate_extent_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_state_current_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_current_keylist", "PREDICATE-EXTENT-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_doneP", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_next", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $predicate_extent_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_quiesce", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_keylist_to_final_index_spec", "PREDICATE-EXTENT-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_current_relevant_keylist", "PREDICATE-EXTENT-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_quiesce_one_step", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_extent_final_index_spec_iterator_next_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nart_arg_index", "DO-NART-ARG-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nart_arg_index_key_validator", "DO-NART-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_nart_arg_final_index_spec_iterator", "NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_nart_arg_final_index_spec_iterator_state", "INITIALIZE-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_term", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_function", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_note", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_argnum_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_nart_arg_final_index_spec_iterator_state_note", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_nart_arg_final_index_spec_iterator_state_argnum_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_nart_arg_final_index_spec_iterator_state_function_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_current_argnum_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_state_current_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-FUNCTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_current_keylist", "NART-ARG-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_doneP", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $nart_arg_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_next", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $nart_arg_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_quiesce", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_keylist_to_final_index_spec", "NART-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_current_relevant_keylist", "NART-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_quiesce_one_step", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_refill_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-FUNCTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "nart_arg_final_index_spec_iterator_next_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-FUNCTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_function_extent_index", "DO-FUNCTION-EXTENT-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_function_extent_index_key_validator", "DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_function_narts", "DO-FUNCTION-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_extent_final_index_spec", "FUNCTION-EXTENT-FINAL-INDEX-SPEC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_consequent_rules", "DO-CONSEQUENT-RULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_antecedent_rules", "DO-ANTECEDENT-RULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_rule_index", "DO-PREDICATE-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_predicate_rule_index_key_validator", "DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_predicate_rule_final_index_spec_iterator", "NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_predicate", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_direction", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_note", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_sense_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_predicate_rule_final_index_spec_iterator_state_note", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_current_sense_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_current_mt_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_state_current_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_current_keylist", "PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_doneP", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_next", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $predicate_rule_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_quiesce", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_keylist_to_final_index_spec", "PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_current_relevant_keylist", "PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_quiesce_one_step", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_refill_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_refill_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_final_index_spec_iterator_next_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_decontextualized_ist_predicate_rule_index", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_decontextualized_ist_predicate_rule_index_key_validator", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_decontextualized_ist_predicate_rule_final_index_spec_iterator", "NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_current_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_next", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_keylist_to_final_index_spec", "DECONTEXTUALIZED-IST-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_current_relevant_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_isa_rule_index", "DO-ISA-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_isa_rule_index_key_validator", "DO-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_isa_rule_final_index_spec_iterator", "NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_quoted_isa_rule_index", "DO-QUOTED-ISA-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_quoted_isa_rule_index_key_validator", "DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_quoted_isa_rule_final_index_spec_iterator", "NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_genls_rule_index", "DO-GENLS-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_genls_rule_index_key_validator", "DO-GENLS-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_genls_rule_final_index_spec_iterator", "NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_genl_mt_rule_index", "DO-GENL-MT-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_genl_mt_rule_index_key_validator", "DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_genl_mt_rule_final_index_spec_iterator", "NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_pred_arg2_rule_index_key_validator", "DO-PRED-ARG2-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_pred_arg2_rule_final_index_spec_iterator_state", "INITIALIZE-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_arg2", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_direction", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_note", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_pred", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_top_level_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-TOP-LEVEL-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pred_arg2_rule_final_index_spec_iterator_state_note", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_current_sense_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_current_mt_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_state_current_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_current_keylist", "PRED-ARG2-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_doneP", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        new $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_next", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        new $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_quiesce", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_keylist_to_final_index_spec", "PRED-ARG2-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_current_relevant_keylist", "PRED-ARG2-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_quiesce_one_step", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_refill_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_refill_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pred_arg2_rule_final_index_spec_iterator_next_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "key_pred_arg2_rule_index", "KEY-PRED-ARG2-RULE-INDEX", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_function_rule_index", "DO-FUNCTION-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_function_rule_index_key_validator", "DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_function_rule_final_index_spec_iterator", "NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_function_rule_final_index_spec_iterator_state", "INITIALIZE-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_func", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_direction", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_note", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_mt_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_function_rule_final_index_spec_iterator_state_note", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_function_rule_final_index_spec_iterator_state_mt_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_function_rule_final_index_spec_iterator_state_direction_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_current_mt_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_state_current_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_current_keylist", "FUNCTION-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_doneP", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_next", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_quiesce", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_keylist_to_final_index_spec", "FUNCTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_current_relevant_keylist", "FUNCTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_quiesce_one_step", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_refill_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_final_index_spec_iterator_next_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_exception_rule_index", "DO-EXCEPTION-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_exception_rule_index_key_validator", "DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_exception_rule_final_index_spec_iterator", "NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_exception_rule_final_index_spec_iterator_state", "INITIALIZE-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_rule", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_direction", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_note", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_mt_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_exception_rule_final_index_spec_iterator_state_note", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_exception_rule_final_index_spec_iterator_state_mt_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_exception_rule_final_index_spec_iterator_state_direction_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_current_mt_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_state_current_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_current_keylist", "EXCEPTION-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_doneP", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_next", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_quiesce", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_keylist_to_final_index_spec", "EXCEPTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_current_relevant_keylist", "EXCEPTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_quiesce_one_step", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_refill_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_final_index_spec_iterator_next_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_pragma_rule_index", "DO-PRAGMA-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_pragma_rule_index_key_validator", "DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_pragma_rule_final_index_spec_iterator", "NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_pragma_rule_final_index_spec_iterator_state", "INITIALIZE-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_rule", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_direction", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_note", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_mt_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pragma_rule_final_index_spec_iterator_state_note", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pragma_rule_final_index_spec_iterator_state_mt_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_pragma_rule_final_index_spec_iterator_state_direction_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_current_mt_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_state_current_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_current_keylist", "PRAGMA-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_doneP", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_next", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_quiesce", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_keylist_to_final_index_spec", "PRAGMA-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_current_relevant_keylist", "PRAGMA-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_quiesce_one_step", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_refill_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_final_index_spec_iterator_next_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_unbound_predicate_rule_index", "DO-UNBOUND-PREDICATE-RULE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_unbound_predicate_rule_index_key_validator", "DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_unbound_predicate_rule_final_index_spec_iterator", "NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "initialize_unbound_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_direction", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_note", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_unbound_predicate_rule_final_index_spec_iterator_state_note", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_current_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_doneP", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_next", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_quiesce", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_keylist_to_final_index_spec", "UNBOUND-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_current_relevant_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_final_index_spec_iterator_next_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_mt_index", "DO-MT-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_mt_index_key_validator", "DO-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "mt_final_index_spec", "MT-FINAL-INDEX-SPEC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_other_index", "DO-OTHER-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_other_index_key_validator", "DO-OTHER-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "other_final_index_spec", "OTHER-FINAL-INDEX-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "other_final_index_spec_p", "OTHER-FINAL-INDEX-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "other_simple_final_index_spec_p", "OTHER-SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "other_complex_final_index_spec_p", "OTHER-COMPLEX-FINAL-INDEX-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "other_index_assertion_match_p", "OTHER-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        new $other_index_assertion_match_p$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_other_index_assertion_match_p", "DO-OTHER-INDEX-ASSERTION-MATCH-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_term_index", "DO-TERM-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_term_index_key_validator", "DO-TERM-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_term_final_index_spec_iterator", "NEW-TERM-FINAL-INDEX-SPEC-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_term_index_assertion_match_p", "DO-TERM-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_broad_mt_index", "DO-BROAD-MT-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_broad_mt_index_key_validator", "DO-BROAD-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_broad_mt_index_match_p", "DO-BROAD-MT-INDEX-MATCH-P", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_hlmt_contents", "DO-HLMT-CONTENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_mt_contents", "DO-MT-CONTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_mt_contents_method", "DO-MT-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_overlap_index", "DO-OVERLAP-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gafs_potentially_matching_formula", "DO-GAFS-POTENTIALLY-MATCHING-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_best_gaf_lookup_index", "DO-BEST-GAF-LOOKUP-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gaf_lookup_index", "DO-GAF-LOOKUP-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_extract_method", "DO-GLI-EXTRACT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_method_error", "DO-GLI-METHOD-ERROR", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_via_gaf_arg", "DO-GLI-VIA-GAF-ARG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_vga_extract_keys", "DO-GLI-VGA-EXTRACT-KEYS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_via_predicate_extent", "DO-GLI-VIA-PREDICATE-EXTENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_vpe_extract_key", "DO-GLI-VPE-EXTRACT-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_via_overlap", "DO-GLI-VIA-OVERLAP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_gli_vo_extract_key", "DO-GLI-VO-EXTRACT-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_narts_potentially_matching_formula", "DO-NARTS-POTENTIALLY-MATCHING-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_term_of_unit_assertions_potentially_matching_nat_formula", "DO-TERM-OF-UNIT-ASSERTIONS-POTENTIALLY-MATCHING-NAT-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_best_nat_lookup_index", "DO-BEST-NAT-LOOKUP-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nat_lookup_index", "DO-NAT-LOOKUP-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_extract_method", "DO-NLI-EXTRACT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_method_error", "DO-NLI-METHOD-ERROR", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_via_nart_arg", "DO-NLI-VIA-NART-ARG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_vna_extract_keys", "DO-NLI-VNA-EXTRACT-KEYS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_via_function_extent", "DO-NLI-VIA-FUNCTION-EXTENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_vfe_extract_key", "DO-NLI-VFE-EXTRACT-KEY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_via_overlap", "DO-NLI-VIA-OVERLAP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "do_nli_vo_extract_key", "DO-NLI-VO-EXTRACT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "simple_final_index_spec_p", "SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "simple_final_index_spec_term", "SIMPLE-FINAL-INDEX-SPEC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_final_index_iterator", "NEW-FINAL-INDEX-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertion_semantically_matches_simple_final_index_specP", "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false);
        new $assertion_semantically_matches_simple_final_index_specP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "destroy_final_index_iterator", "DESTROY-FINAL-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_assertions_with_same_assertion_formula", "DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "new_do_assertions_with_same_assertion_formula", "NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_assertions_with_same_assertion_formula_iterator", "NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertions_with_same_assertion_formula_p", "ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "final_index_iterator_filtered", "FINAL-INDEX-ITERATOR-FILTERED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_gaf_simple_final_index_spec", "NEW-GAF-SIMPLE-FINAL-INDEX-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_nart_simple_final_index_spec", "NEW-NART-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_rule_simple_final_index_spec", "NEW-RULE-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "new_assertion_simple_final_index_spec", "NEW-ASSERTION-SIMPLE-FINAL-INDEX-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "clear_simple_term_assertion_list_filtered", "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 0, 0, false);
        new $clear_simple_term_assertion_list_filtered$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "remove_simple_term_assertion_list_filtered", "REMOVE-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "simple_term_assertion_list_filtered_internal", "SIMPLE-TERM-ASSERTION-LIST-FILTERED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "simple_term_assertion_list_filtered", "SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertion_syntactically_matches_simple_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertion_matches_syntactic_indexing_typeP", "ASSERTION-MATCHES-SYNTACTIC-INDEXING-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_syntactically_matches_simple_gaf_final_index_specP", "GAF-SYNTACTICALLY-MATCHES-SIMPLE-GAF-FINAL-INDEX-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "gaf_matches_simple_argnum_specP", "GAF-MATCHES-SIMPLE-ARGNUM-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "tou_syntactically_matches_simple_nart_final_index_specP", "TOU-SYNTACTICALLY-MATCHES-SIMPLE-NART-FINAL-INDEX-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "rule_syntactically_matches_simple_rule_final_index_specP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "rule_syntactically_matches_simple_rule_final_index_spec_intP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "asent_syntactically_matches_simple_rule_final_index_specP", "ASENT-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "assertion_syntactically_matches_simple_assertion_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-ASSERTION-FINAL-INDEX-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_index_asent_match_p", "PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "predicate_rule_index_asent_p", "PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_index_asent_match_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        new $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "decontextualized_ist_predicate_rule_index_asent_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "isa_rule_index_asent_match_p", "ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "quoted_isa_rule_index_asent_match_p", "QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "isa_rule_index_asent_p", "ISA-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "quoted_isa_rule_index_asent_p", "QUOTED-ISA-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "genls_rule_index_asent_match_p", "GENLS-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "genls_rule_index_asent_p", "GENLS-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "genl_mt_rule_index_asent_match_p", "GENL-MT-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "genl_mt_rule_index_asent_p", "GENL-MT-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_index_asent_match_p", "FUNCTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "function_rule_index_asent_p", "FUNCTION-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_index_asent_match_p", "EXCEPTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "exception_rule_index_asent_p", "EXCEPTION-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_index_asent_match_p", "PRAGMA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "pragma_rule_index_asent_p", "PRAGMA-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_index_asent_match_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "unbound_predicate_rule_index_asent_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_macros", "mt_index_assertion_match_p", "MT-INDEX-ASSERTION-MATCH-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_mapping_macros", "do_hlmts_with_monadic_mt", "DO-HLMTS-WITH-MONADIC-MT");
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    public static SubLObject init_kb_mapping_macros_file() {
        kb_mapping_macros.$simple_term_assertion_list_filtered_caching_state$ = SubLFiles.deflexical("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*", (SubLObject)kb_mapping_macros.NIL);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    public static SubLObject setup_kb_mapping_macros_file() {
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym7$TRUTH_RELEVANT_P, (SubLObject)kb_mapping_macros.$sym8$PWHEN_TRUTH_RELEVANT);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym37$SOME_ASSERTIONS_INTERNAL, (SubLObject)kb_mapping_macros.$sym39$SOME_ASSERTIONS);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC, (SubLObject)kb_mapping_macros.$list44);
        utilities_macros.register_cyc_api_macro((SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX, (SubLObject)kb_mapping_macros.$list53, (SubLObject)kb_mapping_macros.$str62$Iterate_over_an_index_of_gaf_asse);
        utilities_macros.register_cyc_api_macro((SubLObject)kb_mapping_macros.$sym66$DO_GAF_ARG_INDEX_FORMULAS, (SubLObject)kb_mapping_macros.$list63, (SubLObject)kb_mapping_macros.$str67$Iterate_over_an_index_of_gaf_asse);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym61$DO_GAF_ARG_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym90$DO_PREDICATE_EXTENT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym90$DO_PREDICATE_EXTENT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym104$DO_NART_ARG_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym114$DO_FUNCTION_EXTENT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC, (SubLObject)kb_mapping_macros.$sym114$DO_FUNCTION_EXTENT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym124$DO_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym124$DO_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym153$DO_ISA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym153$DO_ISA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym162$DO_QUOTED_ISA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym162$DO_QUOTED_ISA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym169$DO_GENLS_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym169$DO_GENLS_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym177$DO_GENL_MT_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym177$DO_GENL_MT_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym187$DO_FUNCTION_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym187$DO_FUNCTION_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym197$DO_EXCEPTION_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym197$DO_EXCEPTION_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym206$DO_PRAGMA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym206$DO_PRAGMA_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym216$DO_UNBOUND_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym216$DO_UNBOUND_PREDICATE_RULE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym225$DO_MT_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym227$DO_MT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym226$MT_FINAL_INDEX_SPEC, (SubLObject)kb_mapping_macros.$sym227$DO_MT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym232$DO_OTHER_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym235$DO_OTHER_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym233$OTHER_FINAL_INDEX_SPEC, (SubLObject)kb_mapping_macros.$sym235$DO_OTHER_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym238$OTHER_FINAL_INDEX_SPEC_P, (SubLObject)kb_mapping_macros.$sym239$DO_TERM_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P, (SubLObject)kb_mapping_macros.$sym235$DO_OTHER_INDEX);
        utilities_macros.register_cyc_api_macro((SubLObject)kb_mapping_macros.$sym239$DO_TERM_INDEX, (SubLObject)kb_mapping_macros.$list230, (SubLObject)kb_mapping_macros.$str246$Iterate_over_all_assertions_index);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym243$DO_TERM_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym239$DO_TERM_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, (SubLObject)kb_mapping_macros.$sym239$DO_TERM_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym245$DO_TERM_INDEX_ASSERTION_MATCH_P, (SubLObject)kb_mapping_macros.$sym239$DO_TERM_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR, (SubLObject)kb_mapping_macros.$sym252$DO_BROAD_MT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym251$DO_BROAD_MT_INDEX_MATCH_P, (SubLObject)kb_mapping_macros.$sym252$DO_BROAD_MT_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym261$DO_MT_CONTENTS_METHOD, (SubLObject)kb_mapping_macros.$sym265$DO_MT_CONTENTS);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym279$DO_GLI_EXTRACT_METHOD, (SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym285$DO_GLI_METHOD_ERROR, (SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym280$DO_GLI_VIA_GAF_ARG, (SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym293$DO_GLI_VGA_EXTRACT_KEYS, (SubLObject)kb_mapping_macros.$sym280$DO_GLI_VIA_GAF_ARG);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym281$DO_GLI_VIA_PREDICATE_EXTENT, (SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym297$DO_GLI_VPE_EXTRACT_KEY, (SubLObject)kb_mapping_macros.$sym281$DO_GLI_VIA_PREDICATE_EXTENT);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym283$DO_GLI_VIA_OVERLAP, (SubLObject)kb_mapping_macros.$sym274$DO_GAF_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym298$DO_GLI_VO_EXTRACT_KEY, (SubLObject)kb_mapping_macros.$sym283$DO_GLI_VIA_OVERLAP);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym310$DO_NLI_EXTRACT_METHOD, (SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym315$DO_NLI_METHOD_ERROR, (SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym311$DO_NLI_VIA_NART_ARG, (SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym320$DO_NLI_VNA_EXTRACT_KEYS, (SubLObject)kb_mapping_macros.$sym311$DO_NLI_VIA_NART_ARG);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym313$DO_NLI_VIA_FUNCTION_EXTENT, (SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym322$DO_NLI_VFE_EXTRACT_KEY, (SubLObject)kb_mapping_macros.$sym313$DO_NLI_VIA_FUNCTION_EXTENT);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym314$DO_NLI_VIA_OVERLAP, (SubLObject)kb_mapping_macros.$sym305$DO_NAT_LOOKUP_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym323$DO_NLI_VO_EXTRACT_KEY, (SubLObject)kb_mapping_macros.$sym314$DO_NLI_VIA_OVERLAP);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym50$NEW_FINAL_INDEX_ITERATOR, (SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym52$DESTROY_FINAL_INDEX_ITERATOR, (SubLObject)kb_mapping_macros.$sym43$DO_FINAL_INDEX_FROM_SPEC);
        access_macros.register_macro_helper((SubLObject)kb_mapping_macros.$sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR, (SubLObject)kb_mapping_macros.$sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA);
        memoization_state.note_globally_cached_function((SubLObject)kb_mapping_macros.$sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED);
        return (SubLObject)kb_mapping_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_mapping_macros_file();
    }
    
    public void initializeVariables() {
        init_kb_mapping_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_mapping_macros_file();
    }
    
    static {
        me = (SubLFile)new kb_mapping_macros();
        kb_mapping_macros.$simple_term_assertion_list_filtered_caching_state$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym2$RELEVANT_PRED_ = SubLObjectFactory.makeSymbol("RELEVANT-PRED?");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$RELEVANT_MT_ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym7$TRUTH_RELEVANT_P = SubLObjectFactory.makeSymbol("TRUTH-RELEVANT-P");
        $sym8$PWHEN_TRUTH_RELEVANT = SubLObjectFactory.makeSymbol("PWHEN-TRUTH-RELEVANT");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$ASSERTION_HAS_TRUTH = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH");
        $sym11$COR = SubLObjectFactory.makeSymbol("COR");
        $sym12$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$ASSERTION_HAS_DIRECTION_SPEC = SubLObjectFactory.makeSymbol("ASSERTION-HAS-DIRECTION-SPEC");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw17$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw18$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw19$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw20$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym21$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym22$PWHEN_ASSERTION_HAS_TRUTH = SubLObjectFactory.makeSymbol("PWHEN-ASSERTION-HAS-TRUTH");
        $sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC = SubLObjectFactory.makeSymbol("PWHEN-ASSERTION-HAS-DIRECTION-SPEC");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$DO_ASSERTION_LIST = SubLObjectFactory.makeSymbol("DO-ASSERTION-LIST");
        $sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = SubLObjectFactory.makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw28$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym29$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $kw30$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym31$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym32$ASSERTION_HAS_TYPE = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TYPE");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw35$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym36$UNTIL_MAPPING_FINISHED = SubLObjectFactory.makeSymbol("UNTIL-MAPPING-FINISHED");
        $sym37$SOME_ASSERTIONS_INTERNAL = SubLObjectFactory.makeSymbol("SOME-ASSERTIONS-INTERNAL");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPPING-FINISHED")));
        $sym39$SOME_ASSERTIONS = SubLObjectFactory.makeSymbol("SOME-ASSERTIONS");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $sym42$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $sym43$DO_FINAL_INDEX_FROM_SPEC = SubLObjectFactory.makeSymbol("DO-FINAL-INDEX-FROM-SPEC");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-NART-ARG-INDEX"), SubLObjectFactory.makeSymbol("DO-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-ISA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-GENLS-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-FUNCTION-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-MT-INDEX"), SubLObjectFactory.makeSymbol("DO-OTHER-INDEX"), SubLObjectFactory.makeSymbol("DO-TERM-INDEX") });
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-INDEX-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$FINAL_INDEX_ITERATOR = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-ITERATOR");
        $sym47$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym48$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym49$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym50$NEW_FINAL_INDEX_ITERATOR = SubLObjectFactory.makeSymbol("NEW-FINAL-INDEX-ITERATOR");
        $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        $sym52$DESTROY_FINAL_INDEX_ITERATOR = SubLObjectFactory.makeSymbol("DESTROY-FINAL-INDEX-ITERATOR");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw55$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw56$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $sym57$PRED_VAR = SubLObjectFactory.makeUninternedSymbol("PRED-VAR");
        $sym58$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-KEY-VALIDATOR");
        $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR");
        $sym61$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $str62$Iterate_over_an_index_of_gaf_asse = SubLObjectFactory.makeString("Iterate over an index of gaf assertions executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym64$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym65$GAF_FORMULA = SubLObjectFactory.makeSymbol("GAF-FORMULA");
        $sym66$DO_GAF_ARG_INDEX_FORMULAS = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-FORMULAS");
        $str67$Iterate_over_an_index_of_gaf_asse = SubLObjectFactory.makeString("Iterate over an index of gaf assertion formulas executing BODY within the scope of VAR.\nThis version can be significantly faster than do-gaf-arg-index if you don't need the assertions \n -- at least under Alexandria and no slower in non-Alexandria.\nDoes not put a #$not around negated gaf formulas.\nVAR is bound to each GAF formula in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf predicate = NIL, then predicate relevance is established outside.\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("GATHER-INDEX"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("PREDICATE"), SubLObjectFactory.makeSymbol("TRUTH"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("DONE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$ASSERTION = SubLObjectFactory.makeUninternedSymbol("ASSERTION");
        $sym70$GAF_ARG = SubLObjectFactory.makeSymbol("GAF-ARG");
        $kw71$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym72$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym73$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw74$ARGNUM_KEYS_ARE_FRESH = SubLObjectFactory.makeKeyword("ARGNUM-KEYS-ARE-FRESH");
        $kw75$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw76$PREDICATE_KEYS_ARE_FRESH = SubLObjectFactory.makeKeyword("PREDICATE-KEYS-ARE-FRESH");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $sym79$PRED_VAR = SubLObjectFactory.makeUninternedSymbol("PRED-VAR");
        $sym80$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym81$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR");
        $sym82$PIF_FEATURE = SubLObjectFactory.makeSymbol("PIF-FEATURE");
        $kw83$CYC_ALEXANDRIA = SubLObjectFactory.makeKeyword("CYC-ALEXANDRIA");
        $sym84$DO_ITERATOR_WITHOUT_VALUES_PROGRESS = SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        $sym85$NEW_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR");
        $sym86$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR");
        $sym87$PRED_VAR = SubLObjectFactory.makeUninternedSymbol("PRED-VAR");
        $sym88$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym89$NEW_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR");
        $sym90$DO_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym92$PRED_VAR = SubLObjectFactory.makeUninternedSymbol("PRED-VAR");
        $sym93$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym94$NEW_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR");
        $sym95$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym96$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw97$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw100$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $sym101$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym102$DO_NART_ARG_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-NART-ARG-INDEX-KEY-VALIDATOR");
        $sym103$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR");
        $sym104$DO_NART_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-NART-ARG-INDEX");
        $sym105$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym106$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw107$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $str108$nart_arg_keys_should_never_be_irr = SubLObjectFactory.makeString("nart arg keys should never be irrelevant: ~s ~s");
        $kw109$FUNCTION_KEYS_ARE_FRESH = SubLObjectFactory.makeKeyword("FUNCTION-KEYS-ARE-FRESH");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym111$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym112$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR");
        $sym113$FUNCTION_EXTENT_FINAL_INDEX_SPEC = SubLObjectFactory.makeSymbol("FUNCTION-EXTENT-FINAL-INDEX-SPEC");
        $sym114$DO_FUNCTION_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-FUNCTION-EXTENT-INDEX");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym117$TOU = SubLObjectFactory.makeUninternedSymbol("TOU");
        $sym118$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $list119 = ConsesLow.list((SubLObject)kb_mapping_macros.TWO_INTEGER, (SubLObject)kb_mapping_macros.ZERO_INTEGER);
        $const120$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION-EXTENT"));
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym124$DO_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX");
        $kw125$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw126$POS = SubLObjectFactory.makeKeyword("POS");
        $kw127$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym130$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym131$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
        $sym132$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym133$PREDICATE_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("PREDICATE-RULE-INDEX-ASENT-MATCH-P");
        $sym134$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym135$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw136$SENSE_KEYS_ARE_FRESH = SubLObjectFactory.makeKeyword("SENSE-KEYS-ARE-FRESH");
        $kw137$PREDICATE_RULE = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $str138$predicate_rule_iterator_quiescens = SubLObjectFactory.makeString("predicate-rule iterator quiescense failed with ~s");
        $kw139$MT_KEYS_ARE_FRESH = SubLObjectFactory.makeKeyword("MT-KEYS-ARE-FRESH");
        $sym140$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym141$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
        $sym142$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym143$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        $sym144$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P");
        $sym145$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON = SubLObjectFactory.makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym146$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX = SubLObjectFactory.makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw147$DECONTEXTUALIZED_IST_PREDICATE_RULE = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $str148$ist_predicate_rule_iterator_quies = SubLObjectFactory.makeString("ist-predicate-rule iterator quiescense failed with ~s");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym150$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym151$DO_ISA_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-ISA-RULE-INDEX-KEY-VALIDATOR");
        $sym152$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym153$DO_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-ISA-RULE-INDEX");
        $sym154$ISA_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("ISA-RULE-INDEX-ASENT-MATCH-P");
        $const155$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw156$ISA_RULE = SubLObjectFactory.makeKeyword("ISA-RULE");
        $sym157$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym158$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $sym159$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym160$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR");
        $sym161$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym162$DO_QUOTED_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-QUOTED-ISA-RULE-INDEX");
        $sym163$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P");
        $const164$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw165$QUOTED_ISA_RULE = SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE");
        $sym166$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym167$DO_GENLS_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-GENLS-RULE-INDEX-KEY-VALIDATOR");
        $sym168$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym169$DO_GENLS_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-GENLS-RULE-INDEX");
        $sym170$GENLS_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("GENLS-RULE-INDEX-ASENT-MATCH-P");
        $const171$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw172$GENLS_RULE = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym174$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym175$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR");
        $sym176$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym177$DO_GENL_MT_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-GENL-MT-RULE-INDEX");
        $sym178$GENL_MT_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("GENL-MT-RULE-INDEX-ASENT-MATCH-P");
        $const179$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw180$GENL_MT_RULE = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
        $str181$pred_arg2_rule_iterator_quiescens = SubLObjectFactory.makeString("pred-arg2-rule iterator quiescense failed with ~s");
        $str182$unexpected_pred_in_pred_arg2_inde = SubLObjectFactory.makeString("unexpected pred in pred-arg2 indexing: ~s");
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym184$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym185$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR");
        $sym186$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym187$DO_FUNCTION_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-FUNCTION-RULE-INDEX");
        $sym188$FUNCTION_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("FUNCTION-RULE-INDEX-ASENT-MATCH-P");
        $sym189$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym190$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw191$FUNCTION_RULE = SubLObjectFactory.makeKeyword("FUNCTION-RULE");
        $str192$function_rule_iterator_quiescense = SubLObjectFactory.makeString("function-rule iterator quiescense failed with ~s");
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym194$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym195$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR");
        $sym196$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym197$DO_EXCEPTION_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-EXCEPTION-RULE-INDEX");
        $sym198$EXCEPTION_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("EXCEPTION-RULE-INDEX-ASENT-MATCH-P");
        $sym199$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym200$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw201$EXCEPTION_RULE = SubLObjectFactory.makeKeyword("EXCEPTION-RULE");
        $str202$exception_rule_iterator_quiescens = SubLObjectFactory.makeString("exception-rule iterator quiescense failed with ~s");
        $sym203$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym204$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR");
        $sym205$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym206$DO_PRAGMA_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-PRAGMA-RULE-INDEX");
        $sym207$PRAGMA_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("PRAGMA-RULE-INDEX-ASENT-MATCH-P");
        $sym208$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym209$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $kw210$PRAGMA_RULE = SubLObjectFactory.makeKeyword("PRAGMA-RULE");
        $str211$pragma_rule_iterator_quiescense_f = SubLObjectFactory.makeString("pragma-rule iterator quiescense failed with ~s");
        $list212 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym213$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym214$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
        $sym215$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
        $sym216$DO_UNBOUND_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX");
        $sym217$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P = SubLObjectFactory.makeSymbol("UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P");
        $sym218$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
        $sym219$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
        $str220$unbound_predicate_rule_iterator_q = SubLObjectFactory.makeString("unbound-predicate-rule iterator quiescense failed with ~s");
        $list221 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw223$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $sym224$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym225$DO_MT_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-MT-INDEX-KEY-VALIDATOR");
        $sym226$MT_FINAL_INDEX_SPEC = SubLObjectFactory.makeSymbol("MT-FINAL-INDEX-SPEC");
        $sym227$DO_MT_INDEX = SubLObjectFactory.makeSymbol("DO-MT-INDEX");
        $sym228$MT_INDEX_ASSERTION_MATCH_P = SubLObjectFactory.makeSymbol("MT-INDEX-ASSERTION-MATCH-P");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IST"));
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym231$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym232$DO_OTHER_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-OTHER-INDEX-KEY-VALIDATOR");
        $sym233$OTHER_FINAL_INDEX_SPEC = SubLObjectFactory.makeSymbol("OTHER-FINAL-INDEX-SPEC");
        $sym234$DO_OTHER_INDEX_ASSERTION_MATCH_P = SubLObjectFactory.makeSymbol("DO-OTHER-INDEX-ASSERTION-MATCH-P");
        $sym235$DO_OTHER_INDEX = SubLObjectFactory.makeSymbol("DO-OTHER-INDEX");
        $sym236$OTHER_INDEX_ASSERTION_MATCH_P = SubLObjectFactory.makeSymbol("OTHER-INDEX-ASSERTION-MATCH-P");
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OTHER"));
        $sym238$OTHER_FINAL_INDEX_SPEC_P = SubLObjectFactory.makeSymbol("OTHER-FINAL-INDEX-SPEC-P");
        $sym239$DO_TERM_INDEX = SubLObjectFactory.makeSymbol("DO-TERM-INDEX");
        $kw240$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $kw241$OTHER = SubLObjectFactory.makeKeyword("OTHER");
        $sym242$FINAL_INDEX_SPEC = SubLObjectFactory.makeUninternedSymbol("FINAL-INDEX-SPEC");
        $sym243$DO_TERM_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-TERM-INDEX-KEY-VALIDATOR");
        $sym244$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR = SubLObjectFactory.makeSymbol("NEW-TERM-FINAL-INDEX-SPEC-ITERATOR");
        $sym245$DO_TERM_INDEX_ASSERTION_MATCH_P = SubLObjectFactory.makeSymbol("DO-TERM-INDEX-ASSERTION-MATCH-P");
        $str246$Iterate_over_all_assertions_index = SubLObjectFactory.makeString("Iterate over all assertions indexed from TERM executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is indexed from TERM.\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf the assertion is a gaf, then its predicate is relevant (relevance is established outside).\nIf TYPE is non-nil, then assertion has TYPE as its type.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets.\nSee other indexing macros for examples of how this could happen.");
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list248 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym249$DO_BROAD_MT_INDEX_KEY_VALIDATOR = SubLObjectFactory.makeSymbol("DO-BROAD-MT-INDEX-KEY-VALIDATOR");
        $str250$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym251$DO_BROAD_MT_INDEX_MATCH_P = SubLObjectFactory.makeSymbol("DO-BROAD-MT-INDEX-MATCH-P");
        $sym252$DO_BROAD_MT_INDEX = SubLObjectFactory.makeSymbol("DO-BROAD-MT-INDEX");
        $list253 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym254$WITH_JUST_MT = SubLObjectFactory.makeSymbol("WITH-JUST-MT");
        $sym255$DO_OVERLAP_INDEX = SubLObjectFactory.makeSymbol("DO-OVERLAP-INDEX");
        $sym256$FLATTEN = SubLObjectFactory.makeSymbol("FLATTEN");
        $sym257$ASSERTION_TYPE = SubLObjectFactory.makeSymbol("ASSERTION-TYPE");
        $sym258$HLMT_EQUAL_ = SubLObjectFactory.makeSymbol("HLMT-EQUAL?");
        $sym259$ASSERTION_HLMT = SubLObjectFactory.makeSymbol("ASSERTION-HLMT");
        $sym260$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym261$DO_MT_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("DO-MT-CONTENTS-METHOD");
        $kw262$MT = SubLObjectFactory.makeKeyword("MT");
        $kw263$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $list264 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE")));
        $sym265$DO_MT_CONTENTS = SubLObjectFactory.makeSymbol("DO-MT-CONTENTS");
        $sym266$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $list267 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym269$GATHER_OVERLAP_INDEX = SubLObjectFactory.makeSymbol("GATHER-OVERLAP-INDEX");
        $list270 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw272$METHODS = SubLObjectFactory.makeKeyword("METHODS");
        $sym273$DO_BEST_GAF_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("DO-BEST-GAF-LOOKUP-INDEX");
        $sym274$DO_GAF_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-LOOKUP-INDEX");
        $sym275$BEST_GAF_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("BEST-GAF-LOOKUP-INDEX");
        $list276 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym277$L_INDEX = SubLObjectFactory.makeUninternedSymbol("L-INDEX");
        $sym278$METHOD = SubLObjectFactory.makeUninternedSymbol("METHOD");
        $sym279$DO_GLI_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("DO-GLI-EXTRACT-METHOD");
        $sym280$DO_GLI_VIA_GAF_ARG = SubLObjectFactory.makeSymbol("DO-GLI-VIA-GAF-ARG");
        $sym281$DO_GLI_VIA_PREDICATE_EXTENT = SubLObjectFactory.makeSymbol("DO-GLI-VIA-PREDICATE-EXTENT");
        $kw282$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym283$DO_GLI_VIA_OVERLAP = SubLObjectFactory.makeSymbol("DO-GLI-VIA-OVERLAP");
        $sym284$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $sym285$DO_GLI_METHOD_ERROR = SubLObjectFactory.makeSymbol("DO-GLI-METHOD-ERROR");
        $kw286$INDEX_TYPE = SubLObjectFactory.makeKeyword("INDEX-TYPE");
        $str287$Skip_iteration = SubLObjectFactory.makeString("Skip iteration");
        $str288$Unsupported_method__S_in__S_in_DO = SubLObjectFactory.makeString("Unsupported method ~S in ~S in DO-GAF-LOOKUP-INDEX");
        $sym289$TERM = SubLObjectFactory.makeUninternedSymbol("TERM");
        $sym290$ARGNUM = SubLObjectFactory.makeUninternedSymbol("ARGNUM");
        $sym291$PREDICATE = SubLObjectFactory.makeUninternedSymbol("PREDICATE");
        $sym292$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym293$DO_GLI_VGA_EXTRACT_KEYS = SubLObjectFactory.makeSymbol("DO-GLI-VGA-EXTRACT-KEYS");
        $sym294$PIF = SubLObjectFactory.makeSymbol("PIF");
        $kw295$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw296$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
        $sym297$DO_GLI_VPE_EXTRACT_KEY = SubLObjectFactory.makeSymbol("DO-GLI-VPE-EXTRACT-KEY");
        $sym298$DO_GLI_VO_EXTRACT_KEY = SubLObjectFactory.makeSymbol("DO-GLI-VO-EXTRACT-KEY");
        $kw299$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym302$TOU_VAR = SubLObjectFactory.makeUninternedSymbol("TOU-VAR");
        $sym303$DO_BEST_NAT_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("DO-BEST-NAT-LOOKUP-INDEX");
        $list304 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym305$DO_NAT_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("DO-NAT-LOOKUP-INDEX");
        $sym306$BEST_NAT_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("BEST-NAT-LOOKUP-INDEX");
        $list307 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym308$L_INDEX = SubLObjectFactory.makeUninternedSymbol("L-INDEX");
        $sym309$METHOD = SubLObjectFactory.makeUninternedSymbol("METHOD");
        $sym310$DO_NLI_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("DO-NLI-EXTRACT-METHOD");
        $sym311$DO_NLI_VIA_NART_ARG = SubLObjectFactory.makeSymbol("DO-NLI-VIA-NART-ARG");
        $kw312$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $sym313$DO_NLI_VIA_FUNCTION_EXTENT = SubLObjectFactory.makeSymbol("DO-NLI-VIA-FUNCTION-EXTENT");
        $sym314$DO_NLI_VIA_OVERLAP = SubLObjectFactory.makeSymbol("DO-NLI-VIA-OVERLAP");
        $sym315$DO_NLI_METHOD_ERROR = SubLObjectFactory.makeSymbol("DO-NLI-METHOD-ERROR");
        $str316$Unsupported_method__S_in__S_in_DO = SubLObjectFactory.makeString("Unsupported method ~S in ~S in DO-NAT-LOOKUP-INDEX");
        $sym317$TERM = SubLObjectFactory.makeUninternedSymbol("TERM");
        $sym318$ARGNUM = SubLObjectFactory.makeUninternedSymbol("ARGNUM");
        $sym319$FUNCTOR = SubLObjectFactory.makeUninternedSymbol("FUNCTOR");
        $sym320$DO_NLI_VNA_EXTRACT_KEYS = SubLObjectFactory.makeSymbol("DO-NLI-VNA-EXTRACT-KEYS");
        $kw321$FUNCTOR = SubLObjectFactory.makeKeyword("FUNCTOR");
        $sym322$DO_NLI_VFE_EXTRACT_KEY = SubLObjectFactory.makeSymbol("DO-NLI-VFE-EXTRACT-KEY");
        $sym323$DO_NLI_VO_EXTRACT_KEY = SubLObjectFactory.makeSymbol("DO-NLI-VO-EXTRACT-KEY");
        $sym324$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_ = SubLObjectFactory.makeSymbol("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?");
        $sym325$FINAL_INDEX_ITERATOR_FILTERED = SubLObjectFactory.makeSymbol("FINAL-INDEX-ITERATOR-FILTERED");
        $sym326$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list327 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $str328$Unexpected_non_simple_index__s = SubLObjectFactory.makeString("Unexpected non-simple index ~s");
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("MT-SPEC"));
        $kw330$NART = SubLObjectFactory.makeKeyword("NART");
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FUNC"));
        $str332$unexpected_type__s_in_simple_fina = SubLObjectFactory.makeString("unexpected type ~s in simple final index spec ~s");
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym334$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym335$CLAUSE_STRUC = SubLObjectFactory.makeUninternedSymbol("CLAUSE-STRUC");
        $sym336$ASSERTION_GAF_P = SubLObjectFactory.makeSymbol("ASSERTION-GAF-P");
        $sym337$DO_ITERATOR_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES");
        $sym338$NEW_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR");
        $sym339$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym340$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym341$ASSERTION_CNF = SubLObjectFactory.makeSymbol("ASSERTION-CNF");
        $list342 = ConsesLow.list((SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL, (SubLObject)kb_mapping_macros.NIL);
        $sym343$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym344$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $sym345$NEW_ALEXANDRIA_RULES_WITH_CNF_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-RULES-WITH-CNF-ITERATOR");
        $sym346$ASSERTION_CLAUSE_STRUC = SubLObjectFactory.makeSymbol("ASSERTION-CLAUSE-STRUC");
        $sym347$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym348$CLAUSE_STRUC_ASSERTIONS = SubLObjectFactory.makeSymbol("CLAUSE-STRUC-ASSERTIONS");
        $list349 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUSIVE?"), (SubLObject)kb_mapping_macros.T), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list350 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw351$EXCLUSIVE_ = SubLObjectFactory.makeKeyword("EXCLUSIVE?");
        $sym352$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym353$NEW_DO_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("NEW-DO-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA");
        $sym354$EXCLUSIVE_VAR = SubLObjectFactory.makeUninternedSymbol("EXCLUSIVE-VAR");
        $sym355$NEW_ASSERTIONS_WITH_SAME_ASSERTION_FORMULA_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-WITH-SAME-ASSERTION-FORMULA-ITERATOR");
        $sym356$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym357$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list358 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $sym359$FINAL_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-INDEX-P");
        $sym360$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_ = SubLObjectFactory.makeSymbol("ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?");
        $sym361$SIMPLE_TERM_ASSERTION_LIST_FILTERED = SubLObjectFactory.makeSymbol("SIMPLE-TERM-ASSERTION-LIST-FILTERED");
        $sym362$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*");
        $int363$512 = SubLObjectFactory.makeInteger(512);
        $sym364$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED = SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED");
        $list365 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("MT-SPEC"));
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("M"));
        $sym367$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $list368 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTOR-SPEC"));
        $list369 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-FUNC"));
        $const370$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $const371$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $list372 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym373$HLMTS_SEEN_SO_FAR = SubLObjectFactory.makeUninternedSymbol("HLMTS-SEEN-SO-FAR");
        $sym374$ASSERTION = SubLObjectFactory.makeUninternedSymbol("ASSERTION");
        $sym375$MONAD_VAR = SubLObjectFactory.makeUninternedSymbol("MONAD-VAR");
        $list376 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)kb_mapping_macros.EQUAL), (SubLObject)SubLObjectFactory.makeInteger(32)));
        $sym377$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym378$LIST = SubLObjectFactory.makeSymbol("LIST");
        $const379$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $list380 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $sym381$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym382$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $sym383$HLMT_MONAD_MT = SubLObjectFactory.makeSymbol("HLMT-MONAD-MT");
        $sym384$SET_MEMBER_ = SubLObjectFactory.makeSymbol("SET-MEMBER?");
        $sym385$SET_ADD = SubLObjectFactory.makeSymbol("SET-ADD");
    }
    
    public static final class $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.gaf_arg_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $gaf_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $gaf_arg_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.gaf_arg_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.predicate_extent_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $predicate_extent_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $predicate_extent_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.predicate_extent_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $nart_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $nart_arg_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.nart_arg_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $nart_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $nart_arg_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.nart_arg_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.predicate_rule_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $predicate_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.predicate_rule_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.decontextualized_ist_predicate_rule_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.pred_arg2_rule_final_index_spec_iterator_doneP(arg1);
        }
    }
    
    public static final class $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_mapping_macros.pred_arg2_rule_final_index_spec_iterator_next(arg1);
        }
    }
    
    public static final class $other_index_assertion_match_p$BinaryFunction extends BinaryFunction
    {
        public $other_index_assertion_match_p$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OTHER-INDEX-ASSERTION-MATCH-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_mapping_macros.other_index_assertion_match_p(arg1, arg2);
        }
    }
    
    public static final class $assertion_semantically_matches_simple_final_index_specP$BinaryFunction extends BinaryFunction
    {
        public $assertion_semantically_matches_simple_final_index_specP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_mapping_macros.assertion_semantically_matches_simple_final_index_specP(arg1, arg2);
        }
    }
    
    public static final class $clear_simple_term_assertion_list_filtered$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_simple_term_assertion_list_filtered$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED"));
        }
        
        public SubLObject processItem() {
            return kb_mapping_macros.clear_simple_term_assertion_list_filtered();
        }
    }
    
    public static final class $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction extends BinaryFunction
    {
        public $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_mapping_macros.decontextualized_ist_predicate_rule_index_asent_match_p(arg1, arg2);
        }
    }
}

/*

	Total time: 1982 ms
	
*/
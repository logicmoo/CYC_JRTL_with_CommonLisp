package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_implies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyclifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyclifier";
    public static final String myFingerPrint = "31926c63e03bf5c089c7b7b49c42a9143060726762ea0e4a45f9eccc70731c4a";
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9232L)
    public static SubLSymbol $full_cyclifier_quantifier_support$;
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9447L)
    public static SubLSymbol $cyclifiers$;
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 22929L)
    public static SubLSymbol $cyclifier_catch_errorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 23071L)
    private static SubLSymbol $default_cyclifier_parser_factory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 34352L)
    private static SubLSymbol $cyclifier_test_sentences$;
    private static final SubLString $str0$X;
    private static final SubLSymbol $sym1$LF_LITERAL;
    private static final SubLSymbol $sym2$OBJECT;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$PARSE;
    private static final SubLSymbol $sym5$ARGS;
    private static final SubLSymbol $sym6$PREDICATE;
    private static final SubLSymbol $sym7$INSTANCE_COUNT;
    private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS;
    private static final SubLSymbol $sym9$ISOLATED_P;
    private static final SubLSymbol $sym10$INSTANCE_NUMBER;
    private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE;
    private static final SubLSymbol $sym12$PRINT;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLString $str17$__;
    private static final SubLSymbol $sym18$LF_LITERAL_PRINT_METHOD;
    private static final SubLSymbol $sym19$GET_PREDICATE;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym23$LF_LITERAL_GET_PREDICATE_METHOD;
    private static final SubLSymbol $sym24$GET_ARGS;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym27$LF_LITERAL_GET_ARGS_METHOD;
    private static final SubLSymbol $sym28$GET_ARG;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym32$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym33$LF_LITERAL_GET_ARG_METHOD;
    private static final SubLSymbol $sym34$GET_REF;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$LF_LITERAL_GET_REF_METHOD;
    private static final SubLSymbol $sym37$GET_PARSE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym40$LF_LITERAL_GET_PARSE_METHOD;
    private static final SubLSymbol $sym41$UNARY_P;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym44$LF_LITERAL_UNARY_P_METHOD;
    private static final SubLSymbol $sym45$BINARY_P;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
    private static final SubLSymbol $sym48$LF_LITERAL_BINARY_P_METHOD;
    private static final SubLSymbol $sym49$LOGICAL_FORM_INT;
    private static final SubLSymbol $sym50$PHRASE_TREE;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
    private static final SubLSymbol $sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym54$GET_LF_PREDICATE;
    private static final SubLSymbol $sym55$WORD_TREE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLString $str58$NP;
    private static final SubLSymbol $kw59$PROPER_NOUN;
    private static final SubLString $str60$NN;
    private static final SubLSymbol $kw61$NOUN;
    private static final SubLString $str62$VB;
    private static final SubLSymbol $kw63$VERB;
    private static final SubLString $str64$JJ;
    private static final SubLSymbol $kw65$ADJECTIVE;
    private static final SubLString $str66$RB;
    private static final SubLSymbol $kw67$ADVERB;
    private static final SubLString $str68$IN;
    private static final SubLSymbol $kw69$PREPOSITION;
    private static final SubLString $str70$_;
    private static final SubLSymbol $sym71$WORD_TREE_GET_LF_PREDICATE_METHOD;
    private static final SubLSymbol $sym72$VERBAL_WORD_TREE;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
    private static final SubLSymbol $sym75$GET_SEMANTIC_SUBJECT;
    private static final SubLSymbol $sym76$GET_SEMANTIC_OBJECTS;
    private static final SubLSymbol $sym77$GET_VERBAL_COMPLEMENT;
    private static final SubLString $str78$subj;
    private static final SubLSymbol $sym79$GET_REFS;
    private static final SubLString $str80$obj;
    private static final SubLString $str81$clause;
    private static final SubLSymbol $sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym83$MODIFIER_WORD_TREE;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$GET_MODIFIEDS;
    private static final SubLString $str86$modifies;
    private static final SubLSymbol $sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym88$NOMINAL_WORD_TREE;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$GET_COMPLEMENTS;
    private static final SubLString $str91$arg;
    private static final SubLSymbol $sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$GET_STRING;
    private static final SubLString $str96$of;
    private static final SubLSymbol $sym97$GET_OBLIQUE_OBJECT;
    private static final SubLSymbol $sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym99$POSSESSIVE_WORD_TREE;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD;
    private static final SubLSymbol $sym102$GET_MOTHER;
    private static final SubLSymbol $sym103$FIND_FIRST;
    private static final SubLSymbol $sym104$NOMINAL_TREE_P;
    private static final SubLSymbol $sym105$GET_INDEX;
    private static final SubLSymbol $sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD;
    private static final SubLSymbol $sym107$LOGICAL_FORM;
    private static final SubLSymbol $sym108$PARSE_TREE;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$ABSTRACT_LEXICON_P;
    private static final SubLSymbol $sym112$LEXIFY_INT;
    private static final SubLSymbol $sym113$PARSE_TREE_LOGICAL_FORM_METHOD;
    private static final SubLSymbol $sym114$STRINGP;
    private static final SubLSymbol $sym115$LEARN;
    private static final SubLSymbol $sym116$GET;
    private static final SubLSymbol $kw117$FRAME;
    private static final SubLSymbol $kw118$SEMTRANS;
    private static final SubLSymbol $kw119$ACTION;
    private static final SubLSymbol $kw120$SCOPE;
    private static final SubLSymbol $sym121$GET_ROOT;
    private static final SubLSymbol $sym122$CYCLIFIER;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$ERROR_HANDLING;
    private static final SubLSymbol $sym126$SBHL_RESOURCE;
    private static final SubLSymbol $sym127$MEMOIZATION_STATE;
    private static final SubLSymbol $sym128$SCORE;
    private static final SubLSymbol $sym129$NEXT;
    private static final SubLSymbol $sym130$OUTPUT;
    private static final SubLSymbol $sym131$SCORE_FUNCTION;
    private static final SubLSymbol $sym132$RAW_CYCLIFICATIONS;
    private static final SubLSymbol $sym133$RAW_CYCLIFIED_;
    private static final SubLSymbol $sym134$WFF_CHECK_;
    private static final SubLSymbol $sym135$SUBCYCLIFIER_POOL;
    private static final SubLSymbol $sym136$TREE;
    private static final SubLSymbol $sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS;
    private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE;
    private static final SubLSymbol $sym139$HAS_NEXT_;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
    private static final SubLSymbol $sym142$CYCLIFY_INT;
    private static final SubLSymbol $sym143$CYCLIFICATION;
    private static final SubLSymbol $sym144$EL_FORMULA;
    private static final SubLSymbol $sym145$WFF_CHECK;
    private static final SubLSymbol $sym146$CYCLIFIABLE_QUESTION_P;
    private static final SubLObject $const147$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym148$CYCLIFIER_HAS_NEXT__METHOD;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
    private static final SubLSymbol $kw151$BRIEF;
    private static final SubLSymbol $kw152$VERBOSE;
    private static final SubLString $str153$Illegal_output_format__a;
    private static final SubLSymbol $sym154$CYCLIFIER_NEXT_METHOD;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
    private static final SubLSymbol $sym158$CYCLIFIER_WFF_CHECK_METHOD;
    private static final SubLSymbol $kw159$UNKNOWN;
    private static final SubLList $list160;
    private static final SubLSymbol $kw161$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym162$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw163$APPEND;
    private static final SubLString $str164$Unable_to_open__S;
    private static final SubLString $str165$____original__S____output_cycl__S;
    private static final SubLSymbol $sym166$HANDLE_ERROR;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
    private static final SubLSymbol $kw170$THROW;
    private static final SubLSymbol $kw171$WARN;
    private static final SubLSymbol $sym172$CYCLIFIER_HANDLE_ERROR_METHOD;
    private static final SubLObject $const173$InstanceFn;
    private static final SubLSymbol $sym174$BEAUTIFY_CYCLIFICATION;
    private static final SubLSymbol $sym175$CYC_VAR_;
    private static final SubLList $list176;
    private static final SubLObject $const177$and;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$GET_CYCL;
    private static final SubLSymbol $kw180$SUBJECT;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$CYCL;
    private static final SubLObject $const184$PPCompFrameFn;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw187$PARSER;
    private static final SubLSymbol $kw188$LEXICON;
    private static final SubLSymbol $sym189$CYCLIFIER_LEXICON;
    private static final SubLSymbol $sym190$CYCLIFY;
    private static final SubLSymbol $sym191$NEW_STANFORD_PARSER;
    private static final SubLSymbol $kw192$CONTEXT;
    private static final SubLSymbol $sym193$PARSE_TREE_CONTEXT;
    private static final SubLSymbol $sym194$GET_CYCLIFIER;
    private static final SubLString $str195$Sentence__;
    private static final SubLSymbol $sym196$LISTP;
    private static final SubLSymbol $sym197$CYCLIFY_PARSE;
    private static final SubLString $str198$__;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$CONFIDENCE;
    private static final SubLSymbol $sym201$WORD;
    private static final SubLSymbol $sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS;
    private static final SubLSymbol $sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE;
    private static final SubLSymbol $sym204$NUMBERP;
    private static final SubLList $list205;
    private static final SubLSymbol $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
    private static final SubLSymbol $sym207$CYCLIFICATION_GET_CYCL_METHOD;
    private static final SubLSymbol $sym208$GET_WORD;
    private static final SubLList $list209;
    private static final SubLSymbol $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
    private static final SubLSymbol $sym211$CYCLIFICATION_GET_WORD_METHOD;
    private static final SubLSymbol $sym212$GET_CONFIDENCE;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
    private static final SubLSymbol $sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD;
    private static final SubLSymbol $sym216$COPY;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$CYCLIFICATION_COPY_METHOD;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
    private static final SubLString $str221$__CYCLIFICATION_;
    private static final SubLString $str222$_;
    private static final SubLSymbol $sym223$CYCLIFICATION_PRINT_METHOD;
    private static final SubLList $list224;
    private static final SubLList $list225;
    private static final SubLSymbol $sym226$CYCLIFICATION_EL_FORMULA_METHOD;
    private static final SubLSymbol $sym227$FIND;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$CYCLIFICATION_FIND_METHOD;
    private static final SubLSymbol $sym231$SUBSTITUTE;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$CYCLIFICATION_SUBSTITUTE_METHOD;
    private static final SubLString $str235$illegal_cyclification__a;
    private static final SubLSymbol $sym236$YIELD;
    private static final SubLString $str237$Illegal_cyclification__a;
    private static final SubLSymbol $sym238$CYCLIFICATION_SCORE;
    private static final SubLSymbol $sym239$_;
    private static final SubLSymbol $sym240$CDR;
    private static final SubLSymbol $sym241$_;
    private static final SubLSymbol $sym242$QUANTIFIER_SCOPING_SCORE;
    private static final SubLSymbol $sym243$GET_HEAD;
    private static final SubLSymbol $sym244$GET_ABS_INDEX;
    private static final SubLInteger $int245$100;
    private static final SubLList $list246;
    private static final SubLString $str247$sentence___S__;
    private static final SubLSymbol $sym248$INFERENCE_FORMULA_FOLLOWS;
    private static final SubLObject $const249$InferencePSC;
    private static final SubLSymbol $sym250$INSTANCEFN_NAT_;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 943L)
    public static SubLObject new_lf_variable(SubLObject prefix) {
        if (prefix == cyclifier.UNPROVIDED) {
            prefix = (SubLObject)cyclifier.$str0$X;
        }
        return cycl_variables.gentemp_el_var(el_utilities.string_to_el_var_name(prefix));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject get_lf_literal_parse(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym4$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject set_lf_literal_parse(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym4$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject get_lf_literal_args(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym5$ARGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject set_lf_literal_args(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym5$ARGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject get_lf_literal_predicate(final SubLObject lf_literal) {
        return classes.subloop_get_access_protected_instance_slot(lf_literal, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject set_lf_literal_predicate(final SubLObject lf_literal, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lf_literal, value, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject subloop_reserved_initialize_lf_literal_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym7$INSTANCE_COUNT, (SubLObject)cyclifier.ZERO_INTEGER);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject subloop_reserved_initialize_lf_literal_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym9$ISOLATED_P, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym10$INSTANCE_NUMBER, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym6$PREDICATE, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym5$ARGS, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym4$PARSE, (SubLObject)cyclifier.NIL);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1130L)
    public static SubLObject lf_literal_p(final SubLObject lf_literal) {
        return classes.subloop_instanceof_class(lf_literal, (SubLObject)cyclifier.$sym1$LF_LITERAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1644L)
    public static SubLObject new_lf_literal(final SubLObject predicate, final SubLObject v_arguments, final SubLObject parse) {
        final SubLObject literal = object.new_class_instance((SubLObject)cyclifier.$sym1$LF_LITERAL);
        set_lf_literal_predicate(literal, predicate);
        set_lf_literal_args(literal, v_arguments);
        set_lf_literal_parse(literal, parse);
        return literal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 1910L)
    public static SubLObject lf_literal_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject args = get_lf_literal_args(self);
        final SubLObject predicate = get_lf_literal_predicate(self);
        try {
            thread.throwStack.push(cyclifier.$sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                streams_high.write_string(predicate, stream, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
                streams_high.write_char((SubLObject)Characters.CHAR_lparen, stream);
                print_high.princ(args.first(), stream);
                SubLObject cdolist_list_var = args.rest();
                SubLObject arg = (SubLObject)cyclifier.NIL;
                arg = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    streams_high.write_string((SubLObject)cyclifier.$str17$__, stream, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
                    print_high.princ(arg, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                streams_high.write_char((SubLObject)Characters.CHAR_rparen, stream);
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_args(self, args);
                    set_lf_literal_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 2257L)
    public static SubLObject lf_literal_get_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject predicate = get_lf_literal_predicate(self);
        try {
            thread.throwStack.push(cyclifier.$sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD, predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 2387L)
    public static SubLObject lf_literal_get_args_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push(cyclifier.$sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD, args);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_args(self, args);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 2516L)
    public static SubLObject lf_literal_get_arg_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push(cyclifier.$sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                assert cyclifier.NIL != subl_promotions.positive_integer_p(i) : i;
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD, conses_high.nthcdr(number_utilities.f_1_(i), args).first());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_args(self, args);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 2830L)
    public static SubLObject lf_literal_get_ref_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)cyclifier.$sym28$GET_ARG, (SubLObject)cyclifier.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 2969L)
    public static SubLObject lf_literal_get_parse_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject parse = get_lf_literal_parse(self);
        try {
            thread.throwStack.push(cyclifier.$sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD, parse);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 3116L)
    public static SubLObject lf_literal_unary_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push(cyclifier.$sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD, Numbers.numE(Sequences.length(args), (SubLObject)cyclifier.ONE_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_args(self, args);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 3262L)
    public static SubLObject lf_literal_binary_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lf_literal_method = (SubLObject)cyclifier.NIL;
        final SubLObject args = get_lf_literal_args(self);
        try {
            thread.throwStack.push(cyclifier.$sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD, Numbers.numE(Sequences.length(args), (SubLObject)cyclifier.TWO_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lf_literal_args(self, args);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lf_literal_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lf_literal_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 3410L)
    public static SubLObject phrase_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_phrase_tree_method = (SubLObject)cyclifier.NIL;
        final SubLObject daughters = parse_tree.get_phrase_tree_daughters(self);
        try {
            thread.throwStack.push(cyclifier.$sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
            try {
                SubLObject lf = (SubLObject)cyclifier.NIL;
                final SubLObject vector_var = daughters;
                final SubLObject backwardP_var = (SubLObject)cyclifier.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyclifier.NIL, v_iteration = (SubLObject)cyclifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyclifier.ONE_INTEGER)) {
                    element_num = ((cyclifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyclifier.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    lf = ConsesLow.append(lf, methods.funcall_instance_method_with_0_args(daughter, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT));
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, lf);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_phrase_tree_daughters(self, daughters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_phrase_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_phrase_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 3665L)
    public static SubLObject word_tree_get_lf_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)cyclifier.NIL;
        final SubLObject category = parse_tree.get_parse_tree_category(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(cyclifier.$sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject v_class = (SubLObject)cyclifier.NIL;
                SubLObject pos = (SubLObject)cyclifier.NIL;
                if (cyclifier.NIL != word_tree.name_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str58$NP;
                    pos = (SubLObject)cyclifier.$kw59$PROPER_NOUN;
                }
                else if (cyclifier.NIL != word_tree.nominal_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str60$NN;
                    pos = (SubLObject)cyclifier.$kw61$NOUN;
                }
                else if (cyclifier.NIL != word_tree.verbal_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str62$VB;
                    pos = (SubLObject)cyclifier.$kw63$VERB;
                }
                else if (cyclifier.NIL != word_tree.adjectival_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str64$JJ;
                    pos = (SubLObject)cyclifier.$kw65$ADJECTIVE;
                }
                else if (cyclifier.NIL != word_tree.adverbial_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str66$RB;
                    pos = (SubLObject)cyclifier.$kw67$ADVERB;
                }
                else if (cyclifier.NIL != word_tree.prepositional_or_particle_word_tree_p(self)) {
                    v_class = (SubLObject)cyclifier.$str68$IN;
                    pos = (SubLObject)cyclifier.$kw69$PREPOSITION;
                }
                else {
                    v_class = print_high.princ_to_string(category);
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD, Sequences.cconcatenate(Strings.string_downcase(morphology.get_root(string, pos), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED), new SubLObject[] { cyclifier.$str70$_, v_class }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_category(self, category);
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 4413L)
    public static SubLObject verbal_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_word_tree_method = (SubLObject)cyclifier.NIL;
        final SubLObject refs = word_tree.get_word_tree_refs(self);
        try {
            thread.throwStack.push(cyclifier.$sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
            try {
                final SubLObject ref = refs.first();
                SubLObject lf = (SubLObject)ConsesLow.list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym54$GET_LF_PREDICATE), (SubLObject)ConsesLow.list(ref), self));
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym75$GET_SEMANTIC_SUBJECT);
                final SubLObject objects = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym76$GET_SEMANTIC_OBJECTS);
                final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym77$GET_VERBAL_COMPLEMENT);
                final SubLObject cl_complements = (SubLObject)((cyclifier.NIL != verbal_complement) ? ConsesLow.list(verbal_complement) : cyclifier.NIL);
                SubLObject i = (SubLObject)cyclifier.ZERO_INTEGER;
                if (cyclifier.NIL != subject) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(subject, (SubLObject)cyclifier.$sym79$GET_REFS);
                    SubLObject subj_ref = (SubLObject)cyclifier.NIL;
                    subj_ref = cdolist_list_var.first();
                    while (cyclifier.NIL != cdolist_list_var) {
                        lf = (SubLObject)ConsesLow.cons(new_lf_literal((SubLObject)cyclifier.$str78$subj, (SubLObject)ConsesLow.list(ref, subj_ref), self), lf);
                        cdolist_list_var = cdolist_list_var.rest();
                        subj_ref = cdolist_list_var.first();
                    }
                }
                i = (SubLObject)cyclifier.ZERO_INTEGER;
                SubLObject cdolist_list_var = objects;
                SubLObject v_object = (SubLObject)cyclifier.NIL;
                v_object = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    i = Numbers.add(i, (SubLObject)cyclifier.ONE_INTEGER);
                    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(v_object, (SubLObject)cyclifier.$sym79$GET_REFS);
                    SubLObject obj_ref = (SubLObject)cyclifier.NIL;
                    obj_ref = cdolist_list_var_$1.first();
                    while (cyclifier.NIL != cdolist_list_var_$1) {
                        lf = (SubLObject)ConsesLow.cons(new_lf_literal(Sequences.cconcatenate((SubLObject)cyclifier.$str80$obj, PrintLow.write_to_string(i, cyclifier.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list(ref, obj_ref), self), lf);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        obj_ref = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_object = cdolist_list_var.first();
                }
                i = (SubLObject)cyclifier.ZERO_INTEGER;
                cdolist_list_var = cl_complements;
                SubLObject cl_complement = (SubLObject)cyclifier.NIL;
                cl_complement = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    i = Numbers.add(i, (SubLObject)cyclifier.ONE_INTEGER);
                    SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(cl_complement, (SubLObject)cyclifier.$sym79$GET_REFS);
                    SubLObject comp_ref = (SubLObject)cyclifier.NIL;
                    comp_ref = cdolist_list_var_$2.first();
                    while (cyclifier.NIL != cdolist_list_var_$2) {
                        lf = (SubLObject)ConsesLow.cons(new_lf_literal(Sequences.cconcatenate((SubLObject)cyclifier.$str81$clause, PrintLow.write_to_string(i, cyclifier.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list(ref, comp_ref), self), lf);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        comp_ref = cdolist_list_var_$2.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cl_complement = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, Sequences.nreverse(lf));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    word_tree.set_word_tree_refs(self, refs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 5570L)
    public static SubLObject modifier_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym79$GET_REFS).first();
        SubLObject lf = (SubLObject)ConsesLow.list(new_lf_literal(word_tree_get_lf_predicate_method(self), (SubLObject)ConsesLow.list(ref), self));
        SubLObject cdolist_list_var;
        final SubLObject modifieds = cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym85$GET_MODIFIEDS);
        SubLObject modified = (SubLObject)cyclifier.NIL;
        modified = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_0_args(modified, (SubLObject)cyclifier.$sym79$GET_REFS);
            SubLObject modified_ref = (SubLObject)cyclifier.NIL;
            modified_ref = cdolist_list_var_$3.first();
            while (cyclifier.NIL != cdolist_list_var_$3) {
                lf = (SubLObject)ConsesLow.cons(new_lf_literal((SubLObject)cyclifier.$str86$modifies, (SubLObject)ConsesLow.list(ref, modified_ref), self), lf);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                modified_ref = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            modified = cdolist_list_var.first();
        }
        return lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 6058L)
    public static SubLObject nominal_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLObject complements = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym90$GET_COMPLEMENTS);
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym79$GET_REFS).first();
        SubLObject lf = (SubLObject)ConsesLow.list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym54$GET_LF_PREDICATE), (SubLObject)ConsesLow.list(ref), self));
        SubLObject i = (SubLObject)cyclifier.ZERO_INTEGER;
        SubLObject cdolist_list_var = complements;
        SubLObject complement = (SubLObject)cyclifier.NIL;
        complement = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            i = Numbers.add(i, (SubLObject)cyclifier.ONE_INTEGER);
            SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args(complement, (SubLObject)cyclifier.$sym79$GET_REFS);
            SubLObject comp_ref = (SubLObject)cyclifier.NIL;
            comp_ref = cdolist_list_var_$4.first();
            while (cyclifier.NIL != cdolist_list_var_$4) {
                lf = (SubLObject)ConsesLow.cons(new_lf_literal(Sequences.cconcatenate((SubLObject)cyclifier.$str91$arg, PrintLow.write_to_string(i, cyclifier.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list(ref, comp_ref), self), lf);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                comp_ref = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        }
        return lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 6624L)
    public static SubLObject prepositional_or_particle_word_tree_logical_form_int_method(final SubLObject self) {
        if (methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym95$GET_STRING).equalp((SubLObject)cyclifier.$str96$of)) {
            return (SubLObject)cyclifier.NIL;
        }
        final SubLObject ref = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym79$GET_REFS).first();
        SubLObject lf = (SubLObject)ConsesLow.list(new_lf_literal(methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym54$GET_LF_PREDICATE), (SubLObject)ConsesLow.list(ref), self));
        final SubLObject complements = (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym97$GET_OBLIQUE_OBJECT));
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym85$GET_MODIFIEDS).first();
        SubLObject cdolist_list_var;
        final SubLObject mod_refs = cdolist_list_var = (SubLObject)((cyclifier.NIL != modified) ? methods.funcall_instance_method_with_0_args(modified, (SubLObject)cyclifier.$sym79$GET_REFS) : cyclifier.NIL);
        SubLObject mod_ref = (SubLObject)cyclifier.NIL;
        mod_ref = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            lf = (SubLObject)ConsesLow.cons(new_lf_literal((SubLObject)cyclifier.$str86$modifies, (SubLObject)ConsesLow.list(ref, mod_ref), self), lf);
            cdolist_list_var = cdolist_list_var.rest();
            mod_ref = cdolist_list_var.first();
        }
        cdolist_list_var = complements;
        SubLObject complement = (SubLObject)cyclifier.NIL;
        complement = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = methods.funcall_instance_method_with_0_args(complement, (SubLObject)cyclifier.$sym79$GET_REFS);
            SubLObject comp_ref = (SubLObject)cyclifier.NIL;
            comp_ref = cdolist_list_var_$5.first();
            while (cyclifier.NIL != cdolist_list_var_$5) {
                lf = (SubLObject)ConsesLow.cons(new_lf_literal((SubLObject)cyclifier.$str91$arg, (SubLObject)ConsesLow.list(ref, comp_ref), self), lf);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                comp_ref = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        }
        return lf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 7411L)
    public static SubLObject possessive_word_tree_logical_form_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_possessive_word_tree_method = (SubLObject)cyclifier.NIL;
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(cyclifier.$sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
            try {
                SubLObject lf = (SubLObject)cyclifier.NIL;
                final SubLObject complement = methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym90$GET_COMPLEMENTS).first();
                final SubLObject comp_refs = (SubLObject)((cyclifier.NIL != complement) ? methods.funcall_instance_method_with_0_args(complement, (SubLObject)cyclifier.$sym79$GET_REFS) : cyclifier.NIL);
                final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, (SubLObject)cyclifier.$sym102$GET_MOTHER);
                final SubLObject possession = (SubLObject)((cyclifier.NIL != grandmother) ? methods.funcall_instance_method_with_2_args(grandmother, (SubLObject)cyclifier.$sym103$FIND_FIRST, (SubLObject)cyclifier.$sym104$NOMINAL_TREE_P, number_utilities.f_1X(methods.funcall_instance_method_with_0_args(mother, (SubLObject)cyclifier.$sym105$GET_INDEX))) : cyclifier.NIL);
                final SubLObject poss_refs = (SubLObject)((cyclifier.NIL != possession) ? methods.funcall_instance_method_with_0_args(possession, (SubLObject)cyclifier.$sym79$GET_REFS) : cyclifier.NIL);
                SubLObject cdolist_list_var = comp_refs;
                SubLObject comp_ref = (SubLObject)cyclifier.NIL;
                comp_ref = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$6 = poss_refs;
                    SubLObject poss_ref = (SubLObject)cyclifier.NIL;
                    poss_ref = cdolist_list_var_$6.first();
                    while (cyclifier.NIL != cdolist_list_var_$6) {
                        lf = (SubLObject)ConsesLow.cons(new_lf_literal(methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym54$GET_LF_PREDICATE), (SubLObject)ConsesLow.list(comp_ref, poss_ref), self), lf);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        poss_ref = cdolist_list_var_$6.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    comp_ref = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, lf);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_possessive_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 8067L)
    public static SubLObject parse_tree_logical_form_method(final SubLObject self, SubLObject lexicon) {
        if (lexicon == cyclifier.UNPROVIDED) {
            lexicon = (SubLObject)cyclifier.NIL;
        }
        if (cyclifier.NIL != lexicon && !cyclifier.assertionsDisabledSynth && cyclifier.NIL == abstract_lexicon.abstract_lexicon_p(lexicon)) {
            throw new AssertionError(lexicon);
        }
        if (cyclifier.NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(self, (SubLObject)cyclifier.$sym112$LEXIFY_INT, lexicon);
        }
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 8338L)
    public static SubLObject logical_form(final SubLObject english, SubLObject lexicon) {
        if (lexicon == cyclifier.UNPROVIDED) {
            lexicon = (SubLObject)cyclifier.NIL;
        }
        assert cyclifier.NIL != Types.stringp(english) : english;
        if (cyclifier.NIL != lexicon && !cyclifier.assertionsDisabledSynth && cyclifier.NIL == abstract_lexicon.abstract_lexicon_p(lexicon)) {
            throw new AssertionError(lexicon);
        }
        if (cyclifier.NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)cyclifier.$sym115$LEARN, english);
        }
        return methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_2_args(parser.new_charniak_parser((SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)cyclifier.$sym4$PARSE, english, lexicon), (SubLObject)cyclifier.$sym107$LOGICAL_FORM, lexicon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 8614L)
    public static SubLObject formula_keywords(final SubLObject formula) {
        SubLObject keywords = (SubLObject)cyclifier.NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject v_term = (SubLObject)cyclifier.NIL;
        stacks.stack_push(formula, stack);
        while (cyclifier.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = v_term = stacks.stack_pop(stack);
            if (v_term.isKeyword()) {
                final SubLObject item_var = v_term;
                if (cyclifier.NIL == conses_high.member(item_var, keywords, Symbols.symbol_function((SubLObject)cyclifier.EQL), Symbols.symbol_function((SubLObject)cyclifier.IDENTITY))) {
                    keywords = (SubLObject)ConsesLow.cons(item_var, keywords);
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, (SubLObject)cyclifier.UNPROVIDED);
            SubLObject arg = (SubLObject)cyclifier.NIL;
            arg = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return keywords;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 8864L)
    public static SubLObject lexical_keywords(final SubLObject lex) {
        final SubLObject frame = methods.funcall_instance_method_with_1_args(lex, (SubLObject)cyclifier.$sym116$GET, (SubLObject)cyclifier.$kw117$FRAME);
        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, (SubLObject)cyclifier.$sym116$GET, (SubLObject)cyclifier.$kw118$SEMTRANS);
        return Sequences.remove((SubLObject)cyclifier.$kw119$ACTION, Sequences.remove((SubLObject)cyclifier.$kw120$SCOPE, Sequences.remove_duplicates(formula_keywords(rename_variables(semtrans, frame_renaming(frame))), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9532L)
    public static SubLObject get_subcyclifier_pool(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = cyclifier.$cyclifiers$.getDynamicValue(thread);
        SubLObject v_cyclifier = (SubLObject)cyclifier.NIL;
        v_cyclifier = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(tree, (SubLObject)cyclifier.$sym121$GET_ROOT).eql(get_cyclifier_tree(v_cyclifier))) {
                return get_cyclifier_subcyclifier_pool(v_cyclifier);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cyclifier = cdolist_list_var.first();
        }
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_error_handling(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.TWELVE_INTEGER, (SubLObject)cyclifier.$sym125$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_error_handling(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.TWELVE_INTEGER, (SubLObject)cyclifier.$sym125$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_sbhl_resource(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.ELEVEN_INTEGER, (SubLObject)cyclifier.$sym126$SBHL_RESOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_sbhl_resource(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.ELEVEN_INTEGER, (SubLObject)cyclifier.$sym126$SBHL_RESOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_memoization_state(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.TEN_INTEGER, (SubLObject)cyclifier.$sym127$MEMOIZATION_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_memoization_state(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.TEN_INTEGER, (SubLObject)cyclifier.$sym127$MEMOIZATION_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_score(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.NINE_INTEGER, (SubLObject)cyclifier.$sym128$SCORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_score(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.NINE_INTEGER, (SubLObject)cyclifier.$sym128$SCORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_next(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.EIGHT_INTEGER, (SubLObject)cyclifier.$sym129$NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_next(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.EIGHT_INTEGER, (SubLObject)cyclifier.$sym129$NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_output(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.SEVEN_INTEGER, (SubLObject)cyclifier.$sym130$OUTPUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_output(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.SEVEN_INTEGER, (SubLObject)cyclifier.$sym130$OUTPUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_score_function(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.SIX_INTEGER, (SubLObject)cyclifier.$sym131$SCORE_FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_score_function(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.SIX_INTEGER, (SubLObject)cyclifier.$sym131$SCORE_FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_raw_cyclifications(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.FIVE_INTEGER, (SubLObject)cyclifier.$sym132$RAW_CYCLIFICATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_raw_cyclifications(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.FIVE_INTEGER, (SubLObject)cyclifier.$sym132$RAW_CYCLIFICATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.FOUR_INTEGER, (SubLObject)cyclifier.$sym133$RAW_CYCLIFIED_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.FOUR_INTEGER, (SubLObject)cyclifier.$sym133$RAW_CYCLIFIED_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_wff_checkP(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym134$WFF_CHECK_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_wff_checkP(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym134$WFF_CHECK_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym135$SUBCYCLIFIER_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym135$SUBCYCLIFIER_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject get_cyclifier_tree(final SubLObject v_cyclifier) {
        return classes.subloop_get_access_protected_instance_slot(v_cyclifier, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym136$TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject set_cyclifier_tree(final SubLObject v_cyclifier, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyclifier, value, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym136$TREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject subloop_reserved_initialize_cyclifier_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym7$INSTANCE_COUNT, (SubLObject)cyclifier.ZERO_INTEGER);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject subloop_reserved_initialize_cyclifier_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym9$ISOLATED_P, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym10$INSTANCE_NUMBER, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym136$TREE, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym135$SUBCYCLIFIER_POOL, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym134$WFF_CHECK_, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym133$RAW_CYCLIFIED_, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym132$RAW_CYCLIFICATIONS, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym131$SCORE_FUNCTION, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym130$OUTPUT, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym129$NEXT, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym128$SCORE, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym127$MEMOIZATION_STATE, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym126$SBHL_RESOURCE, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym125$ERROR_HANDLING, (SubLObject)cyclifier.NIL);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 9863L)
    public static SubLObject cyclifier_p(final SubLObject v_cyclifier) {
        return classes.subloop_instanceof_class(v_cyclifier, (SubLObject)cyclifier.$sym122$CYCLIFIER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 10577L)
    public static SubLObject cyclifier_has_nextP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = (SubLObject)cyclifier.NIL;
        SubLObject score = get_cyclifier_score(self);
        SubLObject next = get_cyclifier_next(self);
        final SubLObject score_function = get_cyclifier_score_function(self);
        SubLObject raw_cyclifications = get_cyclifier_raw_cyclifications(self);
        SubLObject raw_cyclifiedP = get_cyclifier_raw_cyclifiedP(self);
        final SubLObject wff_checkP = get_cyclifier_wff_checkP(self);
        final SubLObject tree = get_cyclifier_tree(self);
        try {
            thread.throwStack.push(cyclifier.$sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                if (cyclifier.NIL == raw_cyclifiedP) {
                    final SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_complete$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = cyclifier.$cyclifiers$.currentBinding(thread);
                    try {
                        cyclifier_interface.$allow_duplicate_cyclificationsP$.bind((SubLObject)cyclifier.NIL, thread);
                        cyclifier_interface.$cyclification_complete$.bind((SubLObject)cyclifier.NIL, thread);
                        cyclifier.$cyclifiers$.bind((SubLObject)ConsesLow.cons(self, cyclifier.$cyclifiers$.getDynamicValue(thread)), thread);
                        raw_cyclifications = rank_cyclifications(methods.funcall_instance_method_with_0_args(tree, (SubLObject)cyclifier.$sym142$CYCLIFY_INT), score_function);
                        raw_cyclifiedP = (SubLObject)cyclifier.T;
                    }
                    finally {
                        cyclifier.$cyclifiers$.rebind(_prev_bind_3, thread);
                        cyclifier_interface.$cyclification_complete$.rebind(_prev_bind_2, thread);
                        cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                while (cyclifier.NIL == next && cyclifier.NIL != raw_cyclifications) {
                    next = raw_cyclifications.first().first();
                    score = raw_cyclifications.first().rest();
                    next = methods.funcall_class_method_with_1_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym144$EL_FORMULA, next);
                    if (cyclifier.NIL != el_utilities.el_formula_p(next)) {
                        next = el_utilities.el_remove_unnecessary_existentials(next);
                        next = simplifier.fold_equals(next);
                        next = list_utilities.tree_delete((SubLObject)cyclifier.$kw120$SCOPE, beautify_cyclification(next), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
                        if (cyclifier.NIL != wff_checkP) {
                            next = methods.funcall_instance_method_with_1_args(self, (SubLObject)cyclifier.$sym145$WFF_CHECK, next);
                        }
                        if (cyclifier.NIL != next && cyclifier.NIL == methods.funcall_instance_method_with_0_args(tree, (SubLObject)cyclifier.$sym146$CYCLIFIABLE_QUESTION_P)) {
                            next = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(next, cyclifier.$const147$CurrentWorldDataCollectorMt_NonHo, (SubLObject)cyclifier.UNPROVIDED).first();
                        }
                    }
                    raw_cyclifications = raw_cyclifications.rest();
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD, list_utilities.sublisp_boolean(next));
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclifier_score(self, score);
                    set_cyclifier_next(self, next);
                    set_cyclifier_score_function(self, score_function);
                    set_cyclifier_raw_cyclifications(self, raw_cyclifications);
                    set_cyclifier_raw_cyclifiedP(self, raw_cyclifiedP);
                    set_cyclifier_wff_checkP(self, wff_checkP);
                    set_cyclifier_tree(self, tree);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 12328L)
    public static SubLObject cyclifier_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = (SubLObject)cyclifier.NIL;
        SubLObject score = get_cyclifier_score(self);
        SubLObject next = get_cyclifier_next(self);
        final SubLObject output = get_cyclifier_output(self);
        try {
            thread.throwStack.push(cyclifier.$sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                if (cyclifier.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym139$HAS_NEXT_)) {
                    final SubLObject cycl = get_cyclifier_next(self);
                    final SubLObject s = get_cyclifier_score(self);
                    next = (SubLObject)cyclifier.NIL;
                    score = (SubLObject)cyclifier.NIL;
                    final SubLObject pcase_var = output;
                    if (pcase_var.eql((SubLObject)cyclifier.$kw151$BRIEF)) {
                        Dynamic.sublisp_throw((SubLObject)cyclifier.$sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cycl);
                    }
                    else if (pcase_var.eql((SubLObject)cyclifier.$kw152$VERBOSE)) {
                        Dynamic.sublisp_throw((SubLObject)cyclifier.$sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, (SubLObject)ConsesLow.cons(cycl, s));
                    }
                    else {
                        Errors.error((SubLObject)cyclifier.$str153$Illegal_output_format__a, output);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclifier_score(self, score);
                    set_cyclifier_next(self, next);
                    set_cyclifier_output(self, output);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 12735L)
    public static SubLObject cyclifier_wff_check_method(final SubLObject self, SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = (SubLObject)cyclifier.NIL;
        SubLObject sbhl_resource = get_cyclifier_sbhl_resource(self);
        final SubLObject v_memoization_state = get_cyclifier_memoization_state(self);
        try {
            thread.throwStack.push(cyclifier.$sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                SubLObject wffP = (SubLObject)cyclifier.NIL;
                final SubLObject local_state = v_memoization_state;
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)cyclifier.T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            try {
                                thread.resetMultipleValues();
                                final SubLObject wffP_$8 = cyclifier_wffP(narts_high.nart_substitute(cycl), (SubLObject)cyclifier.UNPROVIDED);
                                final SubLObject cycl_$9 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                wffP = wffP_$8;
                                cycl = cycl_$9;
                            }
                            finally {
                                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD, (SubLObject)((cyclifier.NIL != wffP) ? cycl : cyclifier.NIL));
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    set_cyclifier_sbhl_resource(self, sbhl_resource);
                    set_cyclifier_memoization_state(self, v_memoization_state);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 13033L)
    public static SubLObject storing_cyclifier_wff_resultsP() {
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 13516L)
    public static SubLObject cyclifier_wffP(final SubLObject cycl, SubLObject mt) {
        if (mt == cyclifier.UNPROVIDED) {
            mt = (SubLObject)cyclifier.$list160;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)cyclifier.NIL;
        if (cyclifier.NIL != cycl) {
            final SubLObject var_cycl = subst_vars_for_instancefn(cycl);
            if (cyclifier.NIL != cyclifier_wff_intP(var_cycl, mt)) {
                wffP = (SubLObject)cyclifier.T;
            }
        }
        if (cyclifier.NIL != storing_cyclifier_wff_resultsP()) {
            SubLObject ignore_errors_tag = (SubLObject)cyclifier.NIL;
            try {
                thread.throwStack.push(cyclifier.$kw161$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cyclifier.$sym162$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject stream = (SubLObject)cyclifier.NIL;
                        try {
                            stream = compatibility.open_text(parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread), (SubLObject)cyclifier.$kw163$APPEND);
                            if (!stream.isStream()) {
                                Errors.error((SubLObject)cyclifier.$str164$Unable_to_open__S, parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue(thread));
                            }
                            final SubLObject s = stream;
                            PrintLow.format(s, (SubLObject)cyclifier.$str165$____original__S____output_cycl__S, new SubLObject[] { cycl, cycl, wffP, control_vars.kb_loaded() });
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream.isStream()) {
                                    streams_high.close(stream, (SubLObject)cyclifier.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cyclifier.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$kw161$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return Values.values(wffP, cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 14286L)
    public static SubLObject cyclifier_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_method = (SubLObject)cyclifier.NIL;
        final SubLObject error_handling = get_cyclifier_error_handling(self);
        try {
            thread.throwStack.push(cyclifier.$sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql((SubLObject)cyclifier.$kw170$THROW)) {
                    Errors.error(error);
                }
                else if (pcase_var.eql((SubLObject)cyclifier.$kw171$WARN)) {
                    Errors.warn(error);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclifier_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 14430L)
    public static SubLObject subst_vars_for_instancefn(final SubLObject cycl) {
        return conses_high.sublis(create_term_to_var_mapping(cycl), cycl, (SubLObject)cyclifier.EQUAL, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 14545L)
    public static SubLObject create_term_to_var_mapping(final SubLObject cycl) {
        SubLObject mapping = (SubLObject)cyclifier.NIL;
        SubLObject cdolist_list_var = gather_instancefn_terms(cycl);
        SubLObject v_term = (SubLObject)cyclifier.NIL;
        v_term = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            mapping = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(v_term, new_lf_variable(cycl_utilities.formula_arg1(v_term, (SubLObject)cyclifier.UNPROVIDED))), mapping);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return mapping;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 14764L)
    public static SubLObject gather_instancefn_terms(final SubLObject cycl) {
        SubLObject terms = (SubLObject)cyclifier.NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject arg = (SubLObject)cyclifier.NIL;
        stacks.stack_push(cycl, stack);
        while (cyclifier.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = arg = stacks.stack_pop(stack);
            if (cycl_utilities.formula_operator(arg).eql(cyclifier.$const173$InstanceFn)) {
                final SubLObject item_var = arg;
                if (cyclifier.NIL == conses_high.member(item_var, terms, (SubLObject)cyclifier.EQUAL, Symbols.symbol_function((SubLObject)cyclifier.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, (SubLObject)cyclifier.UNPROVIDED);
            SubLObject arg_$13 = (SubLObject)cyclifier.NIL;
            arg_$13 = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                stacks.stack_push(arg_$13, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg_$13 = cdolist_list_var.first();
            }
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 14983L)
    public static SubLObject beautify_cyclification(final SubLObject cycl) {
        final SubLObject operator = cycl_utilities.formula_operator(cycl);
        if (cyclifier.NIL != el_utilities.el_conjunction_p(cycl)) {
            return simplifier.conjoin(Mapping.mapcar((SubLObject)cyclifier.$sym174$BEAUTIFY_CYCLIFICATION, simplifier.lift_conjuncts(cycl_utilities.formula_args(cycl, (SubLObject)cyclifier.UNPROVIDED))), (SubLObject)cyclifier.UNPROVIDED);
        }
        if (cyclifier.NIL != fort_types_interface.quantifier_p(operator)) {
            return ConsesLow.append(conses_high.butlast(cycl, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)ConsesLow.list(beautify_cyclification(quantified_formula(cycl))));
        }
        if (cyclifier.NIL != fort_types_interface.logical_connective_p(operator)) {
            return (SubLObject)ConsesLow.cons(operator, Mapping.mapcar((SubLObject)cyclifier.$sym174$BEAUTIFY_CYCLIFICATION, cycl_utilities.formula_args(cycl, (SubLObject)cyclifier.UNPROVIDED)));
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 15546L)
    public static SubLObject quantified_quantifier(final SubLObject quantified) {
        return cycl_utilities.formula_operator(quantified);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 15637L)
    public static SubLObject quantified_variable(final SubLObject quantified) {
        return conses_high.nthcdr(Numbers.subtract(Sequences.length(quantified), (SubLObject)cyclifier.TWO_INTEGER), quantified).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 15748L)
    public static SubLObject quantified_formula(final SubLObject quantified) {
        return conses_high.last(quantified, (SubLObject)cyclifier.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 15830L)
    public static SubLObject apply_alist(final SubLObject alist, final SubLObject tree, SubLObject test) {
        if (test == cyclifier.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cyclifier.EQL);
        }
        return conses_high.sublis(alist, tree, test, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 15929L)
    public static SubLObject non_singleton_possibly_equal_terms(final SubLObject cycl) {
        SubLObject terms = (SubLObject)cyclifier.NIL;
        SubLObject non_singleton_terms = (SubLObject)cyclifier.NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject clause = (SubLObject)cyclifier.NIL;
        stacks.stack_push(cycl, stack);
        while (cyclifier.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (cyclifier.NIL != el_utilities.literalP(entry)) {
                clause = entry;
                if (cyclifier.NIL != equals_clauseP(clause) && cyclifier.NIL != cycl_utilities.expression_find_if((SubLObject)cyclifier.$sym175$CYC_VAR_, cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)) {
                    SubLObject item_var = cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED);
                    if (cyclifier.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)cyclifier.EQUAL), Symbols.symbol_function((SubLObject)cyclifier.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var, terms);
                    }
                    if (cyclifier.NIL != cycl_utilities.expression_find_if((SubLObject)cyclifier.$sym175$CYC_VAR_, cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)) {
                        item_var = cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED);
                        if (cyclifier.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)cyclifier.EQUAL), Symbols.symbol_function((SubLObject)cyclifier.IDENTITY))) {
                            terms = (SubLObject)ConsesLow.cons(item_var, terms);
                        }
                    }
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, (SubLObject)cyclifier.UNPROVIDED);
            SubLObject arg = (SubLObject)cyclifier.NIL;
            arg = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var2 = terms;
        SubLObject v_term = (SubLObject)cyclifier.NIL;
        v_term = cdolist_list_var2.first();
        while (cyclifier.NIL != cdolist_list_var2) {
            if (cyclifier.NIL != list_utilities.lengthG(cycl_utilities.arg_positions_bfs(v_term, cycl, Symbols.symbol_function((SubLObject)cyclifier.EQUAL)), (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.UNPROVIDED)) {
                non_singleton_terms = (SubLObject)ConsesLow.cons(v_term, non_singleton_terms);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_term = cdolist_list_var2.first();
        }
        return non_singleton_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 17350L)
    public static SubLObject get_assignment(final SubLObject cycl, SubLObject vars) {
        if (vars == cyclifier.UNPROVIDED) {
            vars = el_utilities.sentence_variables(cycl, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        }
        SubLObject v_bindings = (SubLObject)cyclifier.NIL;
        SubLObject to_be_deleted = (SubLObject)cyclifier.NIL;
        final SubLObject stack = stacks.create_stack();
        SubLObject clause = (SubLObject)cyclifier.NIL;
        stacks.stack_push(cycl, stack);
        while (cyclifier.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (cyclifier.NIL != el_utilities.literalP(entry)) {
                clause = entry;
                if (cyclifier.NIL != equals_clauseP(clause)) {
                    if (cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED).equal(cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED))) {
                        to_be_deleted = (SubLObject)ConsesLow.cons(clause, to_be_deleted);
                    }
                    else if (cyclifier.NIL != subl_promotions.memberP(cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED), vars, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)) {
                        v_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED), cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED)), v_bindings);
                    }
                    else if (cyclifier.NIL != subl_promotions.memberP(cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED), vars, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)) {
                        v_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(cycl_utilities.formula_arg2(clause, (SubLObject)cyclifier.UNPROVIDED), cycl_utilities.formula_arg1(clause, (SubLObject)cyclifier.UNPROVIDED)), v_bindings);
                    }
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, (SubLObject)cyclifier.UNPROVIDED);
            SubLObject arg = (SubLObject)cyclifier.NIL;
            arg = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var2 = to_be_deleted;
        clause = (SubLObject)cyclifier.NIL;
        clause = cdolist_list_var2.first();
        while (cyclifier.NIL != cdolist_list_var2) {
            list_utilities.tree_delete(clause, cycl, (SubLObject)cyclifier.EQUAL, (SubLObject)cyclifier.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            clause = cdolist_list_var2.first();
        }
        if (cycl.equal((SubLObject)cyclifier.$list176)) {
            Sequences.delete(cyclifier.$const177$and, cycl, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 18447L)
    public static SubLObject equals_clauseP(final SubLObject cycl) {
        return subl_promotions.memberP(cycl_utilities.formula_operator(cycl), (SubLObject)cyclifier.$list178, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 18644L)
    public static SubLObject quick_sentential_parse_wffP(final SubLObject cycl) {
        return cyclifier_wff_intP(cycl, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 18787L)
    public static SubLObject cyclifier_wff_intP(final SubLObject var_cycl, SubLObject mt) {
        if (mt == cyclifier.UNPROVIDED) {
            mt = (SubLObject)cyclifier.$list160;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)cyclifier.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$use_transcriptP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cyclifier.T, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)cyclifier.NIL, thread);
            control_vars.$use_transcriptP$.bind((SubLObject)cyclifier.NIL, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_2_$16 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)cyclifier.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)cyclifier.T, thread);
                wffP = (SubLObject)SubLObjectFactory.makeBoolean(cyclifier.NIL != constant_arguments_okP(var_cycl, mt) && cyclifier.NIL != variable_arguments_okP(var_cycl, mt));
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$16, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$15, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
            }
        }
        finally {
            control_vars.$use_transcriptP$.rebind(_prev_bind_3, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 19337L)
    public static SubLObject variable_arguments_okP(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)cyclifier.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        try {
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)cyclifier.T, thread);
            okP = at_var_types.inter_formula_var_types_okP(cycl, mt);
        }
        finally {
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 19607L)
    public static SubLObject constant_arguments_okP(final SubLObject cycl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)cyclifier.T;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            okP = at_admitted.admitted_sentence_wrt_asent_arg_constraintsP(cycl);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 19876L)
    public static SubLObject quantify_implicit_subject(final SubLObject cyclification) {
        SubLObject cycl = methods.funcall_instance_method_with_0_args(cyclification, (SubLObject)cyclifier.$sym179$GET_CYCL);
        if (cyclifier.NIL != subl_promotions.memberP((SubLObject)cyclifier.$kw180$SUBJECT, formula_keywords(cycl), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)) {
            cycl = parse_tree.quantify_existentially(rename_variables(cycl, (SubLObject)cyclifier.$list181), (SubLObject)cyclifier.$list182);
            instances.set_slot(cyclification, (SubLObject)cyclifier.$sym183$CYCL, cycl);
        }
        return cyclification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 20255L)
    public static SubLObject required_keywords(final SubLObject lexes) {
        SubLObject keywords = (SubLObject)cyclifier.NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = (SubLObject)cyclifier.NIL;
        rle = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            keywords = ConsesLow.append(formula_keywords(methods.funcall_instance_method_with_1_args(rle_lex(rle), (SubLObject)cyclifier.$sym116$GET, (SubLObject)cyclifier.$kw118$SEMTRANS)), keywords);
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(keywords, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 20628L)
    public static SubLObject rename_variables(SubLObject formula, final SubLObject renaming) {
        SubLObject cdolist_list_var = renaming;
        SubLObject oldXnew = (SubLObject)cyclifier.NIL;
        oldXnew = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            formula = el_utilities.variable_subst(oldXnew.rest(), oldXnew.first(), formula);
            cdolist_list_var = cdolist_list_var.rest();
            oldXnew = cdolist_list_var.first();
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 20965L)
    public static SubLObject frame_renaming(final SubLObject frame) {
        return (SubLObject)((cyclifier.NIL != nart_handles.nart_p(frame) && cycl_utilities.formula_operator(narts_high.nart_el_formula(frame)).eql(cyclifier.$const184$PPCompFrameFn)) ? cyclifier.$list185 : cyclifier.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 21149L)
    public static SubLObject cyclify_int(final SubLObject v_cyclifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = (SubLObject)cyclifier.NIL;
        SubLObject error_message = (SubLObject)cyclifier.NIL;
        if (cyclifier.NIL != cyclifier_catch_errorsP()) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cyclifier.$sym186$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (cyclifier.NIL != v_cyclifier) {
                            while (cyclifier.NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym139$HAS_NEXT_)) {
                                cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym129$NEXT), cycls);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cyclifier.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else if (cyclifier.NIL != v_cyclifier) {
            while (cyclifier.NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym139$HAS_NEXT_)) {
                cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym129$NEXT), cycls);
            }
        }
        if (cyclifier.NIL != error_message) {
            methods.funcall_instance_method_with_1_args(v_cyclifier, (SubLObject)cyclifier.$sym166$HANDLE_ERROR, error_message);
        }
        return Sequences.nreverse(cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 21502L)
    public static SubLObject cyclify_link(final SubLObject english, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cyclifier.NIL != Types.stringp(english) : english;
        SubLObject cyclifier_properties = conses_high.putf(v_properties, (SubLObject)cyclifier.$kw187$PARSER, parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), (SubLObject)cyclifier.$kw171$WARN, (SubLObject)cyclifier.UNPROVIDED));
        cyclifier_properties = list_utilities.maybe_putf(cyclifier_properties, (SubLObject)cyclifier.$kw188$LEXICON, object.new_class_instance((SubLObject)cyclifier.$sym189$CYCLIFIER_LEXICON));
        final SubLObject v_cyclifier = new_cyclifier(english, cyclifier_properties);
        return cyclify_int(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 22073L)
    public static SubLObject cyclify_charniak(final SubLObject english, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        assert cyclifier.NIL != Types.stringp(english) : english;
        final SubLObject v_parser = parser.new_charniak_parser((SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject v_cyclifier = new_cyclifier(english, conses_high.putf(v_properties, (SubLObject)cyclifier.$kw187$PARSER, v_parser));
        return cyclify_int(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 22385L)
    public static SubLObject cyclify_stanford(final SubLObject english, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        assert cyclifier.NIL != Types.stringp(english) : english;
        final SubLObject v_cyclifier = new_cyclifier(english, conses_high.putf(v_properties, (SubLObject)cyclifier.$kw187$PARSER, parser.new_stanford_parser((SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)));
        return cyclify_int(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 22679L)
    public static SubLObject cyclify(final SubLObject english, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        assert cyclifier.NIL != Types.stringp(english) : english;
        final SubLObject v_cyclifier = new_cyclifier(english, v_properties);
        return cyclify_int(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 22983L)
    public static SubLObject cyclifier_catch_errorsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(cyclifier.$cyclifier_catch_errorsP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 23151L)
    public static SubLObject new_cyclifier(final SubLObject english, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject lexicon_tail = cdestructuring_bind.property_list_member((SubLObject)cyclifier.$kw188$LEXICON, current);
        final SubLObject lexicon = (cyclifier.NIL != lexicon_tail) ? conses_high.cadr(lexicon_tail) : object.new_class_instance((SubLObject)cyclifier.$sym189$CYCLIFIER_LEXICON);
        final SubLObject parser_tail = cdestructuring_bind.property_list_member((SubLObject)cyclifier.$kw187$PARSER, current);
        final SubLObject v_parser = (cyclifier.NIL != parser_tail) ? conses_high.cadr(parser_tail) : Functions.funcall(cyclifier.$default_cyclifier_parser_factory$.getDynamicValue(thread));
        final SubLObject context_tail = cdestructuring_bind.property_list_member((SubLObject)cyclifier.$kw192$CONTEXT, current);
        final SubLObject v_context = (cyclifier.NIL != context_tail) ? conses_high.cadr(context_tail) : object.new_class_instance((SubLObject)cyclifier.$sym193$PARSE_TREE_CONTEXT);
        assert cyclifier.NIL != Types.stringp(english) : english;
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)cyclifier.$sym115$LEARN, english);
        final SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, (SubLObject)cyclifier.$sym4$PARSE, english, lexicon, v_context);
        SubLObject v_cyclifier = (SubLObject)cyclifier.NIL;
        SubLObject error = (SubLObject)cyclifier.NIL;
        if (cyclifier.NIL != cyclifier_catch_errorsP()) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cyclifier.$sym186$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        v_cyclifier = (SubLObject)((cyclifier.NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, (SubLObject)cyclifier.$sym194$GET_CYCLIFIER, v_properties) : cyclifier.NIL);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cyclifier.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            v_cyclifier = (SubLObject)((cyclifier.NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, (SubLObject)cyclifier.$sym194$GET_CYCLIFIER, v_properties) : cyclifier.NIL);
        }
        if (cyclifier.NIL != error) {
            methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)cyclifier.$sym166$HANDLE_ERROR, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(error), new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), cyclifier.$str195$Sentence__, format_nil.format_nil_a_no_copy(english) }));
        }
        return v_cyclifier;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 24020L)
    public static SubLObject new_parse_cyclifier(final SubLObject parse, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject context_tail = cdestructuring_bind.property_list_member((SubLObject)cyclifier.$kw192$CONTEXT, current);
        final SubLObject v_context = (cyclifier.NIL != context_tail) ? conses_high.cadr(context_tail) : object.new_class_instance((SubLObject)cyclifier.$sym193$PARSE_TREE_CONTEXT);
        assert cyclifier.NIL != Types.listp(parse) : parse;
        final SubLObject tree = parse_tree.new_parse_tree(parser.retag(parser.strip_shell(parse)), (SubLObject)cyclifier.NIL, v_context);
        return (SubLObject)((cyclifier.NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, (SubLObject)cyclifier.$sym194$GET_CYCLIFIER, v_properties) : cyclifier.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 24503L)
    public static SubLObject cyclify_parse(final SubLObject parse_string, SubLObject v_properties) {
        if (v_properties == cyclifier.UNPROVIDED) {
            v_properties = (SubLObject)cyclifier.NIL;
        }
        assert cyclifier.NIL != Types.stringp(parse_string) : parse_string;
        final SubLObject parse = reader.read_from_string(parse_string, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject v_cyclifier = new_parse_cyclifier(parse, v_properties);
        return cyclify_int(v_cyclifier);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 24864L)
    public static SubLObject free_variable_p(final SubLObject keyword) {
        return string_utilities.starts_with(Symbols.symbol_name(keyword), (SubLObject)cyclifier.$str198$__);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject get_cyclification_confidence(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym200$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject set_cyclification_confidence(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, (SubLObject)cyclifier.THREE_INTEGER, (SubLObject)cyclifier.$sym200$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject get_cyclification_word(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym201$WORD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject set_cyclification_word(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, (SubLObject)cyclifier.TWO_INTEGER, (SubLObject)cyclifier.$sym201$WORD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject get_cyclification_cycl(final SubLObject cyclification) {
        return classes.subloop_get_access_protected_instance_slot(cyclification, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym183$CYCL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject set_cyclification_cycl(final SubLObject cyclification, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclification, value, (SubLObject)cyclifier.ONE_INTEGER, (SubLObject)cyclifier.$sym183$CYCL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject subloop_reserved_initialize_cyclification_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym7$INSTANCE_COUNT, (SubLObject)cyclifier.ZERO_INTEGER);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject subloop_reserved_initialize_cyclification_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym9$ISOLATED_P, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$sym10$INSTANCE_NUMBER, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym183$CYCL, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym201$WORD, (SubLObject)cyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym200$CONFIDENCE, (SubLObject)cyclifier.NIL);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25028L)
    public static SubLObject cyclification_p(final SubLObject cyclification) {
        return classes.subloop_instanceof_class(cyclification, (SubLObject)cyclifier.$sym143$CYCLIFICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25629L)
    public static SubLObject new_cyclification(final SubLObject cycl, final SubLObject word, final SubLObject confidence) {
        assert cyclifier.NIL != Types.numberp(confidence) : confidence;
        final SubLObject cyclification = object.new_class_instance((SubLObject)cyclifier.$sym143$CYCLIFICATION);
        set_cyclification_cycl(cyclification, cycl);
        set_cyclification_word(cyclification, word);
        set_cyclification_confidence(cyclification, confidence);
        return cyclification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 25967L)
    public static SubLObject cyclification_get_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = (SubLObject)cyclifier.NIL;
        final SubLObject cycl = get_cyclification_cycl(self);
        try {
            thread.throwStack.push(cyclifier.$sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, cycl);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclification_cycl(self, cycl);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 26104L)
    public static SubLObject cyclification_get_word_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = (SubLObject)cyclifier.NIL;
        final SubLObject word = get_cyclification_word(self);
        try {
            thread.throwStack.push(cyclifier.$sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, word);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclification_word(self, word);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 26230L)
    public static SubLObject cyclification_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = (SubLObject)cyclifier.NIL;
        final SubLObject confidence = get_cyclification_confidence(self);
        try {
            thread.throwStack.push(cyclifier.$sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, confidence);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclification_confidence(self, confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 26444L)
    public static SubLObject cyclification_copy_method(final SubLObject self) {
        final SubLObject copy = object.new_class_instance((SubLObject)cyclifier.$sym143$CYCLIFICATION);
        set_cyclification_cycl(copy, methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym179$GET_CYCL));
        set_cyclification_word(copy, methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym208$GET_WORD));
        set_cyclification_confidence(copy, methods.funcall_instance_method_with_0_args(self, (SubLObject)cyclifier.$sym212$GET_CONFIDENCE));
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 26807L)
    public static SubLObject cyclification_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclification_method = (SubLObject)cyclifier.NIL;
        final SubLObject cycl = get_cyclification_cycl(self);
        try {
            thread.throwStack.push(cyclifier.$sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
            try {
                streams_high.write_string((SubLObject)cyclifier.$str221$__CYCLIFICATION_, stream, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
                print_high.princ(cycl, stream);
                streams_high.write_string((SubLObject)cyclifier.$str222$_, stream, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)cyclifier.$sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclification_cycl(self, cycl);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclification_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyclifier.$sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclification_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 27065L)
    public static SubLObject cyclification_el_formula_method(final SubLObject self, final SubLObject cyclification_formula) {
        SubLObject result = (SubLObject)cyclifier.NIL;
        if (cyclification_formula.isList()) {
            SubLObject cdolist_list_var = cyclification_formula;
            SubLObject e = (SubLObject)cyclifier.NIL;
            e = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(methods.funcall_class_method_with_1_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym144$EL_FORMULA, e), result);
                cdolist_list_var = cdolist_list_var.rest();
                e = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        if (cyclifier.NIL != cyclification_p(cyclification_formula)) {
            return methods.funcall_class_method_with_1_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym144$EL_FORMULA, methods.funcall_instance_method_with_0_args(cyclification_formula, (SubLObject)cyclifier.$sym179$GET_CYCL));
        }
        return cyclification_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 27573L)
    public static SubLObject cyclification_find_method(final SubLObject self, final SubLObject cyclification, final SubLObject item, SubLObject test) {
        if (test == cyclifier.UNPROVIDED) {
            test = (SubLObject)cyclifier.EQL;
        }
        if (cyclification.isList()) {
            SubLObject result = (SubLObject)cyclifier.NIL;
            if (cyclifier.NIL == result) {
                SubLObject csome_list_var;
                SubLObject e;
                for (csome_list_var = cyclification, e = (SubLObject)cyclifier.NIL, e = csome_list_var.first(); cyclifier.NIL == result && cyclifier.NIL != csome_list_var; result = methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym227$FIND, e, item, test), csome_list_var = csome_list_var.rest(), e = csome_list_var.first()) {}
            }
            return result;
        }
        if (cyclifier.NIL != cyclification_p(cyclification)) {
            return methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym227$FIND, methods.funcall_instance_method_with_0_args(cyclification, (SubLObject)cyclifier.$sym179$GET_CYCL), item, test);
        }
        return Functions.funcall(test, cyclification, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 27997L)
    public static SubLObject cyclification_substitute_method(final SubLObject self, final SubLObject cyclification, final SubLObject v_new, final SubLObject old, SubLObject test) {
        if (test == cyclifier.UNPROVIDED) {
            test = (SubLObject)cyclifier.EQL;
        }
        if (cyclification.isList()) {
            SubLObject new_list = (SubLObject)cyclifier.NIL;
            SubLObject cdolist_list_var = cyclification;
            SubLObject e = (SubLObject)cyclifier.NIL;
            e = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                new_list = (SubLObject)ConsesLow.cons(methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym231$SUBSTITUTE, e, v_new, old), new_list);
                cdolist_list_var = cdolist_list_var.rest();
                e = cdolist_list_var.first();
            }
            return Sequences.nreverse(new_list);
        }
        if (cyclifier.NIL != cyclification_p(cyclification)) {
            final SubLObject new_cyclification = object.new_class_instance((SubLObject)cyclifier.$sym143$CYCLIFICATION);
            set_cyclification_cycl(new_cyclification, methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym231$SUBSTITUTE, methods.funcall_instance_method_with_0_args(cyclification, (SubLObject)cyclifier.$sym179$GET_CYCL), v_new, old));
            set_cyclification_word(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, (SubLObject)cyclifier.$sym208$GET_WORD));
            set_cyclification_confidence(new_cyclification, methods.funcall_instance_method_with_0_args(cyclification, (SubLObject)cyclifier.$sym212$GET_CONFIDENCE));
            return new_cyclification;
        }
        return (cyclifier.NIL != Functions.funcall(test, cyclification, old)) ? v_new : cyclification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 28802L)
    public static SubLObject cyclification_score(final SubLObject sem) {
        if (cyclifier.NIL != cyclification_p(sem)) {
            return Numbers.multiply(methods.funcall_instance_method_with_0_args(sem, (SubLObject)cyclifier.$sym212$GET_CONFIDENCE), cyclification_score(methods.funcall_instance_method_with_0_args(sem, (SubLObject)cyclifier.$sym179$GET_CYCL)));
        }
        if (cyclifier.NIL != list_utilities.non_empty_list_p(sem)) {
            return (SubLObject)cyclifier.ONE_INTEGER;
        }
        if (sem.isKeyword()) {
            return (SubLObject)cyclifier.ONE_INTEGER;
        }
        if (cyclifier.NIL != fort_types_interface.logical_connective_p(sem.first())) {
            SubLObject c = (SubLObject)cyclifier.ONE_INTEGER;
            SubLObject cdolist_list_var = sem.rest();
            SubLObject arg = (SubLObject)cyclifier.NIL;
            arg = cdolist_list_var.first();
            while (cyclifier.NIL != cdolist_list_var) {
                c = Numbers.multiply(c, cyclification_score(arg));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            return c;
        }
        if (cyclifier.NIL != fort_types_interface.quantifier_p(sem.first())) {
            return cyclification_score(quantified_formula(sem));
        }
        if (cyclifier.NIL != el_utilities.literalP(sem)) {
            return (SubLObject)cyclifier.ONE_INTEGER;
        }
        Errors.error((SubLObject)cyclifier.$str235$illegal_cyclification__a, sem);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 29466L)
    public static SubLObject cyclification_coverage(final SubLObject sem) {
        SubLObject length = (SubLObject)cyclifier.ZERO_INTEGER;
        SubLObject cdolist_list_var = cyclification_yield(sem);
        SubLObject word = (SubLObject)cyclifier.NIL;
        word = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            if (cyclifier.NIL == cyclifier_interface.punctuation_word_p(word)) {
                length = Numbers.add(length, (SubLObject)cyclifier.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return Numbers.divide(cyclification_coverage_int(sem), length);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 29788L)
    public static SubLObject cyclification_yield(final SubLObject sem) {
        if (cyclifier.NIL != cyclification_p(sem)) {
            final SubLObject word = methods.funcall_instance_method_with_0_args(sem, (SubLObject)cyclifier.$sym208$GET_WORD);
            final SubLObject tree = methods.funcall_instance_method_with_0_args(word, (SubLObject)cyclifier.$sym121$GET_ROOT);
            return methods.funcall_instance_method_with_0_args(tree, (SubLObject)cyclifier.$sym236$YIELD);
        }
        if (cyclifier.NIL != fort_types_interface.logical_connective_p(sem.first())) {
            return cyclification_yield(sem.rest().first());
        }
        Errors.error((SubLObject)cyclifier.$str237$Illegal_cyclification__a, sem);
        return (SubLObject)cyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 30173L)
    public static SubLObject cyclification_coverage_int(final SubLObject sem) {
        if (cyclifier.NIL != cyclification_p(sem)) {
            final SubLObject new_sem = methods.funcall_instance_method_with_0_args(sem, (SubLObject)cyclifier.$sym179$GET_CYCL);
            if (cyclifier.NIL != cyclification_p(new_sem)) {
                return cyclification_coverage_int(new_sem);
            }
            return number_utilities.f_1X(cyclification_coverage_int(methods.funcall_instance_method_with_0_args(sem, (SubLObject)cyclifier.$sym179$GET_CYCL)));
        }
        else {
            if (sem.isKeyword()) {
                return (SubLObject)cyclifier.ZERO_INTEGER;
            }
            if (cyclifier.NIL != fort_types_interface.logical_connective_p(sem.first())) {
                SubLObject c = (SubLObject)cyclifier.ZERO_INTEGER;
                SubLObject cdolist_list_var = sem.rest();
                SubLObject arg = (SubLObject)cyclifier.NIL;
                arg = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    c = Numbers.add(c, cyclification_coverage_int(arg));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return c;
            }
            if (cyclifier.NIL != fort_types_interface.quantifier_p(sem.first())) {
                return cyclification_coverage_int(quantified_formula(sem));
            }
            if (cyclifier.NIL != el_utilities.literalP(sem)) {
                return (SubLObject)cyclifier.ZERO_INTEGER;
            }
            Errors.error((SubLObject)cyclifier.$str235$illegal_cyclification__a, sem);
            return (SubLObject)cyclifier.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 30804L)
    public static SubLObject rank_cyclifications(final SubLObject cyclifications, SubLObject score_function) {
        if (score_function == cyclifier.UNPROVIDED) {
            score_function = (SubLObject)cyclifier.$sym238$CYCLIFICATION_SCORE;
        }
        SubLObject scored = (SubLObject)cyclifier.NIL;
        SubLObject cdolist_list_var = cyclifications;
        SubLObject cyclification = (SubLObject)cyclifier.NIL;
        cyclification = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            scored = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cyclification, Functions.funcall(score_function, cyclification)), scored);
            cdolist_list_var = cdolist_list_var.rest();
            cyclification = cdolist_list_var.first();
        }
        return Sort.sort(scored, (SubLObject)cyclifier.$sym239$_, (SubLObject)cyclifier.$sym240$CDR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31159L)
    public static SubLObject new_ranked_lex_entry(final SubLObject lex, SubLObject score) {
        if (score == cyclifier.UNPROVIDED) {
            score = (SubLObject)cyclifier.ZERO_INTEGER;
        }
        return (SubLObject)ConsesLow.cons(lex, score);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31310L)
    public static SubLObject rle_lex(final SubLObject rle) {
        return rle.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31362L)
    public static SubLObject rle_confidence(final SubLObject rle) {
        return rle.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31421L)
    public static SubLObject rle_set_lex(final SubLObject rle, final SubLObject lex) {
        return ConsesLow.rplaca(rle, lex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31488L)
    public static SubLObject rle_set_confidence(final SubLObject rle, final SubLObject score) {
        return ConsesLow.rplacd(rle, score);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31566L)
    public static SubLObject rle_sem_equal(final SubLObject rle1, final SubLObject rle2) {
        return Equality.equal(methods.funcall_instance_method_with_1_args(rle_lex(rle1), (SubLObject)cyclifier.$sym116$GET, (SubLObject)cyclifier.$kw118$SEMTRANS), methods.funcall_instance_method_with_1_args(rle_lex(rle2), (SubLObject)cyclifier.$sym116$GET, (SubLObject)cyclifier.$kw118$SEMTRANS));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31706L)
    public static SubLObject ranked_lex_entry_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && obj.rest().isNumber());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 31806L)
    public static SubLObject new_even_lex_entry_distribution(final SubLObject lexes) {
        if (cyclifier.NIL == lexes) {
            return (SubLObject)cyclifier.NIL;
        }
        SubLObject distribution = (SubLObject)cyclifier.NIL;
        final SubLObject confidence = Numbers.divide((SubLObject)cyclifier.ONE_INTEGER, Sequences.length(lexes));
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = (SubLObject)cyclifier.NIL;
        lex = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            distribution = (SubLObject)ConsesLow.cons(new_ranked_lex_entry(lex, confidence), distribution);
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        return distribution;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 32243L)
    public static SubLObject instantiate_scope(final SubLObject unscoped) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject lambda_expressions = partition_unscoped(unscoped);
        SubLObject non_lambda_expressions = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!Sequences.length(non_lambda_expressions).numL((SubLObject)cyclifier.TWO_INTEGER)) {
            non_lambda_expressions = (SubLObject)ConsesLow.list(simplifier.conjoin(non_lambda_expressions, (SubLObject)cyclifier.UNPROVIDED));
        }
        return beta_reduce((SubLObject)((cyclifier.NIL != non_lambda_expressions) ? non_lambda_expressions.first() : cyclifier.NIL), Sequences.reverse(scope_quantifiers(lambda_expressions)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 32722L)
    public static SubLObject scope_quantifiers(final SubLObject lambda_expressions) {
        return Sort.sort(lambda_expressions, (SubLObject)cyclifier.$sym241$_, (SubLObject)cyclifier.$sym242$QUANTIFIER_SCOPING_SCORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 32915L)
    public static SubLObject quantifier_scoping_score(final SubLObject lambda_expression) {
        final SubLObject index = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(lambda_expression, (SubLObject)cyclifier.$sym208$GET_WORD), (SubLObject)cyclifier.$sym243$GET_HEAD), (SubLObject)cyclifier.$sym244$GET_ABS_INDEX);
        return (cyclifier.NIL != cyclification_free_variables(lambda_expression)) ? Numbers.multiply((SubLObject)cyclifier.$int245$100, index) : index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 33287L)
    public static SubLObject cyclification_free_variables(final SubLObject cyclification) {
        return el_utilities.sentence_free_variables(simplifier.fold_equals(methods.funcall_class_method_with_1_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym144$EL_FORMULA, cyclification)), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 33500L)
    public static SubLObject partition_unscoped(final SubLObject unscoped) {
        SubLObject lambda_expressions = (SubLObject)cyclifier.NIL;
        SubLObject non_lambda_expressions = (SubLObject)cyclifier.NIL;
        SubLObject cdolist_list_var = unscoped;
        SubLObject e = (SubLObject)cyclifier.NIL;
        e = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            if (cyclifier.NIL != lambda_expressionP(e)) {
                lambda_expressions = (SubLObject)ConsesLow.cons(e, lambda_expressions);
            }
            else {
                non_lambda_expressions = (SubLObject)ConsesLow.cons(e, non_lambda_expressions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            e = cdolist_list_var.first();
        }
        return Values.values(lambda_expressions, non_lambda_expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 33808L)
    public static SubLObject lambda_expressionP(final SubLObject sem) {
        return methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym227$FIND, sem, (SubLObject)cyclifier.$kw120$SCOPE, (SubLObject)cyclifier.EQL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 33990L)
    public static SubLObject beta_reduce(final SubLObject argument, final SubLObject lambda_expressions) {
        final SubLObject l_term = lambda_expressions.first();
        SubLObject new_l_term = (SubLObject)cyclifier.NIL;
        if (cyclifier.NIL == l_term) {
            return argument;
        }
        new_l_term = methods.funcall_instance_method_with_0_args(l_term, (SubLObject)cyclifier.$sym216$COPY);
        if (cyclifier.NIL != argument) {
            new_l_term = methods.funcall_class_method_with_3_args((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym231$SUBSTITUTE, new_l_term, argument, (SubLObject)cyclifier.$kw120$SCOPE);
        }
        return beta_reduce(new_l_term, lambda_expressions.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 36375L)
    public static SubLObject cyclify_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = object.new_class_instance((SubLObject)cyclifier.$sym189$CYCLIFIER_LEXICON);
        final SubLObject v_parser = parser.new_charniak_parser((SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject v_context = object.new_class_instance((SubLObject)cyclifier.$sym193$PARSE_TREE_CONTEXT);
        SubLObject result = (SubLObject)cyclifier.NIL;
        memoization_state.clear_hl_store_dependent_caches();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = cyclifier.$cyclifier_test_sentences$.getDynamicValue(thread);
                SubLObject sentence = (SubLObject)cyclifier.NIL;
                sentence = cdolist_list_var.first();
                while (cyclifier.NIL != cdolist_list_var) {
                    Errors.warn((SubLObject)cyclifier.$str247$sentence___S__, sentence);
                    final SubLObject tree = methods.funcall_instance_method_with_3_args(v_parser, (SubLObject)cyclifier.$sym4$PARSE, sentence, lexicon, v_context);
                    SubLObject cycls = (SubLObject)cyclifier.NIL;
                    if (cyclifier.NIL != tree) {
                        final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args(tree, (SubLObject)cyclifier.$sym194$GET_CYCLIFIER, (SubLObject)ConsesLow.list((SubLObject)cyclifier.$kw188$LEXICON, lexicon));
                        while (cyclifier.NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym139$HAS_NEXT_)) {
                            cycls = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(v_cyclifier, (SubLObject)cyclifier.$sym129$NEXT), cycls);
                        }
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sentence, cycls), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyclifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 37047L)
    public static SubLObject test_cyclify(final SubLObject sentence, final SubLObject target) {
        assert cyclifier.NIL != Types.stringp(sentence) : sentence;
        assert cyclifier.NIL != Types.stringp(target) : target;
        final SubLObject output = cyclify(sentence, (SubLObject)ConsesLow.list((SubLObject)cyclifier.$kw187$PARSER, parser.new_charniak_parser((SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED)));
        final SubLObject cycl = reader.read_from_string(string_utilities.cyclify_string(target), (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject result = conses_high.subsetp(cycl, output, (SubLObject)cyclifier.$sym248$INFERENCE_FORMULA_FOLLOWS, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject kb = control_vars.kb_loaded();
        final SubLObject revision = system_info.cyc_revision_string();
        return (SubLObject)ConsesLow.list(result, output, kb, revision);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 37762L)
    public static SubLObject inference_formula_follows(final SubLObject consequent, final SubLObject antecedent) {
        final SubLObject canonical_antecedent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(reformulate_instancefns_for_testing(antecedent), cyclifier.$const249$InferencePSC)), cyclifier.$const249$InferencePSC, (SubLObject)cyclifier.UNPROVIDED);
        final SubLObject canonical_consequent = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(czer_main.canonicalize_ask(reformulate_instancefns_for_testing(consequent), cyclifier.$const249$InferencePSC)), cyclifier.$const249$InferencePSC, (SubLObject)cyclifier.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(cyclifier.NIL != removal_modules_formula_implies.inference_formula_implies(canonical_antecedent, canonical_consequent) || cyclifier.NIL != czer_utilities.equals_elP(antecedent, consequent, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 39178L)
    public static SubLObject reformulate_instancefns_for_testing(final SubLObject sentence) {
        SubLObject result = conses_high.copy_list(sentence);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(result, (SubLObject)cyclifier.$sym250$INSTANCEFN_NAT_, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED, (SubLObject)cyclifier.UNPROVIDED);
        SubLObject instancefn = (SubLObject)cyclifier.NIL;
        instancefn = cdolist_list_var.first();
        while (cyclifier.NIL != cdolist_list_var) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(result, (SubLObject)cyclifier.UNPROVIDED);
            result = cycl_utilities.expression_subst((SubLObject)ConsesLow.list(cyclifier.$const173$InstanceFn, new_var), instancefn, result, (SubLObject)cyclifier.EQUAL, (SubLObject)cyclifier.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            instancefn = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier.lisp", position = 39520L)
    public static SubLObject instancefn_natP(final SubLObject obj) {
        return kb_utilities.kbeq(cycl_utilities.formula_arg0(obj), cyclifier.$const173$InstanceFn);
    }
    
    public static SubLObject declare_cyclifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_lf_variable", "NEW-LF-VARIABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_lf_literal_parse", "GET-LF-LITERAL-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_lf_literal_parse", "SET-LF-LITERAL-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_lf_literal_args", "GET-LF-LITERAL-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_lf_literal_args", "SET-LF-LITERAL-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_lf_literal_predicate", "GET-LF-LITERAL-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_lf_literal_predicate", "SET-LF-LITERAL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_lf_literal_class", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_lf_literal_instance", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_p", "LF-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_lf_literal", "NEW-LF-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_print_method", "LF-LITERAL-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_get_predicate_method", "LF-LITERAL-GET-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_get_args_method", "LF-LITERAL-GET-ARGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_get_arg_method", "LF-LITERAL-GET-ARG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_get_ref_method", "LF-LITERAL-GET-REF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_get_parse_method", "LF-LITERAL-GET-PARSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_unary_p_method", "LF-LITERAL-UNARY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lf_literal_binary_p_method", "LF-LITERAL-BINARY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "phrase_tree_logical_form_int_method", "PHRASE-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "word_tree_get_lf_predicate_method", "WORD-TREE-GET-LF-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "verbal_word_tree_logical_form_int_method", "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "modifier_word_tree_logical_form_int_method", "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "nominal_word_tree_logical_form_int_method", "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "prepositional_or_particle_word_tree_logical_form_int_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "possessive_word_tree_logical_form_int_method", "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "parse_tree_logical_form_method", "PARSE-TREE-LOGICAL-FORM-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "logical_form", "LOGICAL-FORM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "formula_keywords", "FORMULA-KEYWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lexical_keywords", "LEXICAL-KEYWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_subcyclifier_pool", "GET-SUBCYCLIFIER-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_error_handling", "GET-CYCLIFIER-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_error_handling", "SET-CYCLIFIER-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_sbhl_resource", "GET-CYCLIFIER-SBHL-RESOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_sbhl_resource", "SET-CYCLIFIER-SBHL-RESOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_memoization_state", "GET-CYCLIFIER-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_memoization_state", "SET-CYCLIFIER-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_score", "GET-CYCLIFIER-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_score", "SET-CYCLIFIER-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_next", "GET-CYCLIFIER-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_next", "SET-CYCLIFIER-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_output", "GET-CYCLIFIER-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_output", "SET-CYCLIFIER-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_score_function", "GET-CYCLIFIER-SCORE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_score_function", "SET-CYCLIFIER-SCORE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_raw_cyclifications", "GET-CYCLIFIER-RAW-CYCLIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_raw_cyclifications", "SET-CYCLIFIER-RAW-CYCLIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_raw_cyclifiedP", "GET-CYCLIFIER-RAW-CYCLIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_raw_cyclifiedP", "SET-CYCLIFIER-RAW-CYCLIFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_wff_checkP", "GET-CYCLIFIER-WFF-CHECK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_wff_checkP", "SET-CYCLIFIER-WFF-CHECK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_subcyclifier_pool", "GET-CYCLIFIER-SUBCYCLIFIER-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_subcyclifier_pool", "SET-CYCLIFIER-SUBCYCLIFIER-POOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclifier_tree", "GET-CYCLIFIER-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclifier_tree", "SET-CYCLIFIER-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_p", "CYCLIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_has_nextP_method", "CYCLIFIER-HAS-NEXT?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_next_method", "CYCLIFIER-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_wff_check_method", "CYCLIFIER-WFF-CHECK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "storing_cyclifier_wff_resultsP", "STORING-CYCLIFIER-WFF-RESULTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_wffP", "CYCLIFIER-WFF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_handle_error_method", "CYCLIFIER-HANDLE-ERROR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subst_vars_for_instancefn", "SUBST-VARS-FOR-INSTANCEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "create_term_to_var_mapping", "CREATE-TERM-TO-VAR-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "gather_instancefn_terms", "GATHER-INSTANCEFN-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "beautify_cyclification", "BEAUTIFY-CYCLIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quantified_quantifier", "QUANTIFIED-QUANTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quantified_variable", "QUANTIFIED-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quantified_formula", "QUANTIFIED-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "apply_alist", "APPLY-ALIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "non_singleton_possibly_equal_terms", "NON-SINGLETON-POSSIBLY-EQUAL-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_assignment", "GET-ASSIGNMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "equals_clauseP", "EQUALS-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quick_sentential_parse_wffP", "QUICK-SENTENTIAL-PARSE-WFF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_wff_intP", "CYCLIFIER-WFF-INT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "variable_arguments_okP", "VARIABLE-ARGUMENTS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "constant_arguments_okP", "CONSTANT-ARGUMENTS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quantify_implicit_subject", "QUANTIFY-IMPLICIT-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "required_keywords", "REQUIRED-KEYWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rename_variables", "RENAME-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "frame_renaming", "FRAME-RENAMING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_int", "CYCLIFY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_link", "CYCLIFY-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_charniak", "CYCLIFY-CHARNIAK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_stanford", "CYCLIFY-STANFORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify", "CYCLIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclifier_catch_errorsP", "CYCLIFIER-CATCH-ERRORS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_cyclifier", "NEW-CYCLIFIER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_parse_cyclifier", "NEW-PARSE-CYCLIFIER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_parse", "CYCLIFY-PARSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "free_variable_p", "FREE-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclification_confidence", "GET-CYCLIFICATION-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclification_confidence", "SET-CYCLIFICATION-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclification_word", "GET-CYCLIFICATION-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclification_word", "SET-CYCLIFICATION-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "get_cyclification_cycl", "GET-CYCLIFICATION-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "set_cyclification_cycl", "SET-CYCLIFICATION-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_cyclification_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "subloop_reserved_initialize_cyclification_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_p", "CYCLIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_cyclification", "NEW-CYCLIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_get_cycl_method", "CYCLIFICATION-GET-CYCL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_get_word_method", "CYCLIFICATION-GET-WORD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_get_confidence_method", "CYCLIFICATION-GET-CONFIDENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_copy_method", "CYCLIFICATION-COPY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_print_method", "CYCLIFICATION-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_el_formula_method", "CYCLIFICATION-EL-FORMULA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_find_method", "CYCLIFICATION-FIND-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_substitute_method", "CYCLIFICATION-SUBSTITUTE-METHOD", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_score", "CYCLIFICATION-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_coverage", "CYCLIFICATION-COVERAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_yield", "CYCLIFICATION-YIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_coverage_int", "CYCLIFICATION-COVERAGE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rank_cyclifications", "RANK-CYCLIFICATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_ranked_lex_entry", "NEW-RANKED-LEX-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rle_lex", "RLE-LEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rle_confidence", "RLE-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rle_set_lex", "RLE-SET-LEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rle_set_confidence", "RLE-SET-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "rle_sem_equal", "RLE-SEM-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "ranked_lex_entry_p", "RANKED-LEX-ENTRY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "new_even_lex_entry_distribution", "NEW-EVEN-LEX-ENTRY-DISTRIBUTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "instantiate_scope", "INSTANTIATE-SCOPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "scope_quantifiers", "SCOPE-QUANTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "quantifier_scoping_score", "QUANTIFIER-SCOPING-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclification_free_variables", "CYCLIFICATION-FREE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "partition_unscoped", "PARTITION-UNSCOPED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "lambda_expressionP", "LAMBDA-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "beta_reduce", "BETA-REDUCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "cyclify_test", "CYCLIFY-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "test_cyclify", "TEST-CYCLIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "inference_formula_follows", "INFERENCE-FORMULA-FOLLOWS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "reformulate_instancefns_for_testing", "REFORMULATE-INSTANCEFNS-FOR-TESTING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier", "instancefn_natP", "INSTANCEFN-NAT?", 1, 0, false);
        return (SubLObject)cyclifier.NIL;
    }
    
    public static SubLObject init_cyclifier_file() {
        cyclifier.$full_cyclifier_quantifier_support$ = SubLFiles.defparameter("*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*", (SubLObject)cyclifier.T);
        cyclifier.$cyclifiers$ = SubLFiles.defparameter("*CYCLIFIERS*", (SubLObject)cyclifier.NIL);
        cyclifier.$cyclifier_catch_errorsP$ = SubLFiles.defparameter("*CYCLIFIER-CATCH-ERRORS?*", (SubLObject)cyclifier.T);
        cyclifier.$default_cyclifier_parser_factory$ = SubLFiles.defparameter("*DEFAULT-CYCLIFIER-PARSER-FACTORY*", (SubLObject)cyclifier.$sym191$NEW_STANFORD_PARSER);
        cyclifier.$cyclifier_test_sentences$ = SubLFiles.defparameter("*CYCLIFIER-TEST-SENTENCES*", (SubLObject)cyclifier.$list246);
        return (SubLObject)cyclifier.NIL;
    }
    
    public static SubLObject setup_cyclifier_file() {
        classes.subloop_new_class((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE);
        subloop_reserved_initialize_lf_literal_class((SubLObject)cyclifier.$sym1$LF_LITERAL);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym12$PRINT, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.$list14, (SubLObject)cyclifier.$list15);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym12$PRINT, (SubLObject)cyclifier.$sym18$LF_LITERAL_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym19$GET_PREDICATE, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list21);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym19$GET_PREDICATE, (SubLObject)cyclifier.$sym23$LF_LITERAL_GET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym24$GET_ARGS, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list25);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym24$GET_ARGS, (SubLObject)cyclifier.$sym27$LF_LITERAL_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym28$GET_ARG, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.$list29, (SubLObject)cyclifier.$list30);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym28$GET_ARG, (SubLObject)cyclifier.$sym33$LF_LITERAL_GET_ARG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym34$GET_REF, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list35);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym34$GET_REF, (SubLObject)cyclifier.$sym36$LF_LITERAL_GET_REF_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym37$GET_PARSE, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list38);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym37$GET_PARSE, (SubLObject)cyclifier.$sym40$LF_LITERAL_GET_PARSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym41$UNARY_P, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list42);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym41$UNARY_P, (SubLObject)cyclifier.$sym44$LF_LITERAL_UNARY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym45$BINARY_P, (SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list46);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym1$LF_LITERAL, (SubLObject)cyclifier.$sym45$BINARY_P, (SubLObject)cyclifier.$sym48$LF_LITERAL_BINARY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym50$PHRASE_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list51);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym50$PHRASE_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym54$GET_LF_PREDICATE, (SubLObject)cyclifier.$sym55$WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list56);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym55$WORD_TREE, (SubLObject)cyclifier.$sym54$GET_LF_PREDICATE, (SubLObject)cyclifier.$sym71$WORD_TREE_GET_LF_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym72$VERBAL_WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list73);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym72$VERBAL_WORD_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym83$MODIFIER_WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list84);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym83$MODIFIER_WORD_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym88$NOMINAL_WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list89);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym88$NOMINAL_WORD_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list94);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym99$POSSESSIVE_WORD_TREE, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list100);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym99$POSSESSIVE_WORD_TREE, (SubLObject)cyclifier.$sym49$LOGICAL_FORM_INT, (SubLObject)cyclifier.$sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym107$LOGICAL_FORM, (SubLObject)cyclifier.$sym108$PARSE_TREE, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.$list109, (SubLObject)cyclifier.$list110);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym108$PARSE_TREE, (SubLObject)cyclifier.$sym107$LOGICAL_FORM, (SubLObject)cyclifier.$sym113$PARSE_TREE_LOGICAL_FORM_METHOD);
        classes.subloop_new_class((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.$list123, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list124);
        classes.class_set_implements_slot_listeners((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE);
        subloop_reserved_initialize_cyclifier_class((SubLObject)cyclifier.$sym122$CYCLIFIER);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym139$HAS_NEXT_, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list140);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym139$HAS_NEXT_, (SubLObject)cyclifier.$sym148$CYCLIFIER_HAS_NEXT__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym129$NEXT, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list149);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym129$NEXT, (SubLObject)cyclifier.$sym154$CYCLIFIER_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym145$WFF_CHECK, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.$list155, (SubLObject)cyclifier.$list156);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym145$WFF_CHECK, (SubLObject)cyclifier.$sym158$CYCLIFIER_WFF_CHECK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym166$HANDLE_ERROR, (SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.$list167, (SubLObject)cyclifier.$list168);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym122$CYCLIFIER, (SubLObject)cyclifier.$sym166$HANDLE_ERROR, (SubLObject)cyclifier.$sym172$CYCLIFIER_HANDLE_ERROR_METHOD);
        access_macros.register_external_symbol((SubLObject)cyclifier.$sym190$CYCLIFY);
        access_macros.register_external_symbol((SubLObject)cyclifier.$sym197$CYCLIFY_PARSE);
        classes.subloop_new_class((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym2$OBJECT, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list199);
        classes.class_set_implements_slot_listeners((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE);
        subloop_reserved_initialize_cyclification_class((SubLObject)cyclifier.$sym143$CYCLIFICATION);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym179$GET_CYCL, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list205);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym179$GET_CYCL, (SubLObject)cyclifier.$sym207$CYCLIFICATION_GET_CYCL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym208$GET_WORD, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list209);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym208$GET_WORD, (SubLObject)cyclifier.$sym211$CYCLIFICATION_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym212$GET_CONFIDENCE, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list213);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym212$GET_CONFIDENCE, (SubLObject)cyclifier.$sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym216$COPY, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.NIL, (SubLObject)cyclifier.$list217);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym216$COPY, (SubLObject)cyclifier.$sym218$CYCLIFICATION_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier.$sym12$PRINT, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list13, (SubLObject)cyclifier.$list14, (SubLObject)cyclifier.$list219);
        methods.subloop_register_instance_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym12$PRINT, (SubLObject)cyclifier.$sym223$CYCLIFICATION_PRINT_METHOD);
        methods.methods_incorporate_class_method((SubLObject)cyclifier.$sym144$EL_FORMULA, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.$list224, (SubLObject)cyclifier.$list225);
        methods.subloop_register_class_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym144$EL_FORMULA, (SubLObject)cyclifier.$sym226$CYCLIFICATION_EL_FORMULA_METHOD);
        methods.methods_incorporate_class_method((SubLObject)cyclifier.$sym227$FIND, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.$list228, (SubLObject)cyclifier.$list229);
        methods.subloop_register_class_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym227$FIND, (SubLObject)cyclifier.$sym230$CYCLIFICATION_FIND_METHOD);
        methods.methods_incorporate_class_method((SubLObject)cyclifier.$sym231$SUBSTITUTE, (SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$list20, (SubLObject)cyclifier.$list232, (SubLObject)cyclifier.$list233);
        methods.subloop_register_class_method((SubLObject)cyclifier.$sym143$CYCLIFICATION, (SubLObject)cyclifier.$sym231$SUBSTITUTE, (SubLObject)cyclifier.$sym234$CYCLIFICATION_SUBSTITUTE_METHOD);
        return (SubLObject)cyclifier.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyclifier_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyclifier_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyclifier_file();
    }
    
    static {
        me = (SubLFile)new cyclifier();
        cyclifier.$full_cyclifier_quantifier_support$ = null;
        cyclifier.$cyclifiers$ = null;
        cyclifier.$cyclifier_catch_errorsP$ = null;
        cyclifier.$default_cyclifier_parser_factory$ = null;
        cyclifier.$cyclifier_test_sentences$ = null;
        $str0$X = SubLObjectFactory.makeString("X");
        $sym1$LF_LITERAL = SubLObjectFactory.makeSymbol("LF-LITERAL");
        $sym2$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ARGS"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REF"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("UNARY-P"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BINARY-P"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym4$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym5$ARGS = SubLObjectFactory.makeSymbol("ARGS");
        $sym6$PREDICATE = SubLObjectFactory.makeSymbol("PREDICATE");
        $sym7$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS");
        $sym9$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym10$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE");
        $sym12$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this literal to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-CHAR"), (SubLObject)Characters.CHAR_lparen, (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-CHAR"), (SubLObject)Characters.CHAR_rparen, (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $str17$__ = SubLObjectFactory.makeString(", ");
        $sym18$LF_LITERAL_PRINT_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-PRINT-METHOD");
        $sym19$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the predicate of this literal"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")));
        $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym23$LF_LITERAL_GET_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-GET-PREDICATE-METHOD");
        $sym24$GET_ARGS = SubLObjectFactory.makeSymbol("GET-ARGS");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of arguments of this lf-literal"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")));
        $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym27$LF_LITERAL_GET_ARGS_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-GET-ARGS-METHOD");
        $sym28$GET_ARG = SubLObjectFactory.makeSymbol("GET-ARG");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param i non-negative-integer; the argument index of the argument to be returned\n   @return lf-variable; the variable in argument position I of this literal, \n   nil if there is none"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")))));
        $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym32$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym33$LF_LITERAL_GET_ARG_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-GET-ARG-METHOD");
        $sym34$GET_REF = SubLObjectFactory.makeSymbol("GET-REF");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return lf-variable; the referent of this literal"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ARG")), (SubLObject)cyclifier.ZERO_INTEGER)));
        $sym36$LF_LITERAL_GET_REF_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-GET-REF-METHOD");
        $sym37$GET_PARSE = SubLObjectFactory.makeSymbol("GET-PARSE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the parse tree whose logical form is this literal"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")));
        $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym40$LF_LITERAL_GET_PARSE_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-GET-PARSE-METHOD");
        $sym41$UNARY_P = SubLObjectFactory.makeSymbol("UNARY-P");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this literal is unary, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)cyclifier.ONE_INTEGER)));
        $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym44$LF_LITERAL_UNARY_P_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-UNARY-P-METHOD");
        $sym45$BINARY_P = SubLObjectFactory.makeSymbol("BINARY-P");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if this literal is binary, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)cyclifier.TWO_INTEGER)));
        $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LF-LITERAL-METHOD");
        $sym48$LF_LITERAL_BINARY_P_METHOD = SubLObjectFactory.makeSymbol("LF-LITERAL-BINARY-P-METHOD");
        $sym49$LOGICAL_FORM_INT = SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT");
        $sym50$PHRASE_TREE = SubLObjectFactory.makeSymbol("PHRASE-TREE");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)cyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOVECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LF"))));
        $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHRASE-TREE-METHOD");
        $sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-LOGICAL-FORM-INT-METHOD");
        $sym54$GET_LF_PREDICATE = SubLObjectFactory.makeSymbol("GET-LF-PREDICATE");
        $sym55$WORD_TREE = SubLObjectFactory.makeSymbol("WORD-TREE");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the predicate name of this word tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("NP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("NN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("VB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("JJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("RB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ADVERB"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("IN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREPOSITION"))), (SubLObject)ConsesLow.list((SubLObject)cyclifier.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-DOWNCASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))), (SubLObject)SubLObjectFactory.makeString("_"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $str58$NP = SubLObjectFactory.makeString("NP");
        $kw59$PROPER_NOUN = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $str60$NN = SubLObjectFactory.makeString("NN");
        $kw61$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $str62$VB = SubLObjectFactory.makeString("VB");
        $kw63$VERB = SubLObjectFactory.makeKeyword("VERB");
        $str64$JJ = SubLObjectFactory.makeString("JJ");
        $kw65$ADJECTIVE = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $str66$RB = SubLObjectFactory.makeString("RB");
        $kw67$ADVERB = SubLObjectFactory.makeKeyword("ADVERB");
        $str68$IN = SubLObjectFactory.makeString("IN");
        $kw69$PREPOSITION = SubLObjectFactory.makeKeyword("PREPOSITION");
        $str70$_ = SubLObjectFactory.makeString("_");
        $sym71$WORD_TREE_GET_LF_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-LF-PREDICATE-METHOD");
        $sym72$VERBAL_WORD_TREE = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this verb"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("REFS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LF-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-COMPLEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)cyclifier.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJ-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)SubLObjectFactory.makeString("subj"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)cyclifier.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("obj"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)cyclifier.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CL-COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("clause"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LF")))));
        $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");
        $sym75$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $sym76$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $sym77$GET_VERBAL_COMPLEMENT = SubLObjectFactory.makeSymbol("GET-VERBAL-COMPLEMENT");
        $str78$subj = SubLObjectFactory.makeString("subj");
        $sym79$GET_REFS = SubLObjectFactory.makeSymbol("GET-REFS");
        $str80$obj = SubLObjectFactory.makeString("obj");
        $str81$clause = SubLObjectFactory.makeString("clause");
        $sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym83$MODIFIER_WORD_TREE = SubLObjectFactory.makeSymbol("MODIFIER-WORD-TREE");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this modifier"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LF-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIEDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)SubLObjectFactory.makeString("modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LF"))));
        $sym85$GET_MODIFIEDS = SubLObjectFactory.makeSymbol("GET-MODIFIEDS");
        $str86$modifies = SubLObjectFactory.makeString("modifies");
        $sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym88$NOMINAL_WORD_TREE = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this noun"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LF-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)cyclifier.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("arg"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LF"))));
        $sym90$GET_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-COMPLEMENTS");
        $str91$arg = SubLObjectFactory.makeString("arg");
        $sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this preposition"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)cyclifier.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("of")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LF-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIEDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-REFS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-REF"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-REFS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)SubLObjectFactory.makeString("modifies"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)SubLObjectFactory.makeString("arg"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LF"))));
        $sym95$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $str96$of = SubLObjectFactory.makeString("of");
        $sym97$GET_OBLIQUE_OBJECT = SubLObjectFactory.makeSymbol("GET-OBLIQUE-OBJECT");
        $sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym99$POSSESSIVE_WORD_TREE = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this possessive"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LF"), (SubLObject)cyclifier.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REFS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GRANDMOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-REFS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("POSSESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMP-REF"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REFS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-REF"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-REFS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LF-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LF-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMP-REF"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-REF")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("LF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LF"))));
        $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");
        $sym102$GET_MOTHER = SubLObjectFactory.makeSymbol("GET-MOTHER");
        $sym103$FIND_FIRST = SubLObjectFactory.makeSymbol("FIND-FIRST");
        $sym104$NOMINAL_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-TREE-P");
        $sym105$GET_INDEX = SubLObjectFactory.makeSymbol("GET-INDEX");
        $sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD = SubLObjectFactory.makeSymbol("POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD");
        $sym107$LOGICAL_FORM = SubLObjectFactory.makeSymbol("LOGICAL-FORM");
        $sym108$PARSE_TREE = SubLObjectFactory.makeSymbol("PARSE-TREE");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the logical form of this parse tree"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-INT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FORM-INT")))));
        $sym111$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym112$LEXIFY_INT = SubLObjectFactory.makeSymbol("LEXIFY-INT");
        $sym113$PARSE_TREE_LOGICAL_FORM_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-LOGICAL-FORM-METHOD");
        $sym114$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym115$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym116$GET = SubLObjectFactory.makeSymbol("GET");
        $kw117$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $kw118$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $kw119$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $kw120$SCOPE = SubLObjectFactory.makeKeyword("SCOPE");
        $sym121$GET_ROOT = SubLObjectFactory.makeSymbol("GET-ROOT");
        $sym122$CYCLIFIER = SubLObjectFactory.makeSymbol("CYCLIFIER");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-TEMPLATE"));
        $list124 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER-POOL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFIED?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-NEXT?"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym125$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym126$SBHL_RESOURCE = SubLObjectFactory.makeSymbol("SBHL-RESOURCE");
        $sym127$MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE");
        $sym128$SCORE = SubLObjectFactory.makeSymbol("SCORE");
        $sym129$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $sym130$OUTPUT = SubLObjectFactory.makeSymbol("OUTPUT");
        $sym131$SCORE_FUNCTION = SubLObjectFactory.makeSymbol("SCORE-FUNCTION");
        $sym132$RAW_CYCLIFICATIONS = SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS");
        $sym133$RAW_CYCLIFIED_ = SubLObjectFactory.makeSymbol("RAW-CYCLIFIED?");
        $sym134$WFF_CHECK_ = SubLObjectFactory.makeSymbol("WFF-CHECK?");
        $sym135$SUBCYCLIFIER_POOL = SubLObjectFactory.makeSymbol("SUBCYCLIFIER-POOL");
        $sym136$TREE = SubLObjectFactory.makeSymbol("TREE");
        $sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS");
        $sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE");
        $sym139$HAS_NEXT_ = SubLObjectFactory.makeSymbol("HAS-NEXT?");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if there is another valid interpretation, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFIED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), (SubLObject)cyclifier.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFICATION-COMPLETE*"), (SubLObject)cyclifier.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFIERS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFIERS*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFICATION-COMPLETE*"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIFIERS*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK-CYCLIFICATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY-INT"))), (SubLObject)SubLObjectFactory.makeSymbol("SCORE-FUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFIED?"), (SubLObject)cyclifier.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-REMOVE-UNNECESSARY-EXISTENTIALS"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOLD-EQUALS"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-DELETE"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEAUTIFY-CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-CHECK")), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-QUESTION-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCLIFICATIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))));
        $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");
        $sym142$CYCLIFY_INT = SubLObjectFactory.makeSymbol("CYCLIFY-INT");
        $sym143$CYCLIFICATION = SubLObjectFactory.makeSymbol("CYCLIFICATION");
        $sym144$EL_FORMULA = SubLObjectFactory.makeSymbol("EL-FORMULA");
        $sym145$WFF_CHECK = SubLObjectFactory.makeSymbol("WFF-CHECK");
        $sym146$CYCLIFIABLE_QUESTION_P = SubLObjectFactory.makeSymbol("CYCLIFIABLE-QUESTION-P");
        $const147$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym148$CYCLIFIER_HAS_NEXT__METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-HAS-NEXT?-METHOD");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return el-formula-p; the next interpretation of this iterator"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-NEXT?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CYCLIFIER-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CYCLIFIER-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)cyclifier.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)cyclifier.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BRIEF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERBOSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("S")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Illegal output format ~a"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT")))))));
        $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");
        $kw151$BRIEF = SubLObjectFactory.makeKeyword("BRIEF");
        $kw152$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $str153$Illegal_output_format__a = SubLObjectFactory.makeString("Illegal output format ~a");
        $sym154$CYCLIFIER_NEXT_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-NEXT-METHOD");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF?"), (SubLObject)cyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESOURCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF?"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-WFF?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-SUBSTITUTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFF?"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")))));
        $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");
        $sym158$CYCLIFIER_WFF_CHECK_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-WFF-CHECK-METHOD");
        $kw159$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $list160 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DataForNLMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $kw161$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym162$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw163$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str164$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str165$____original__S____output_cycl__S = SubLObjectFactory.makeString("~%(:original ~S~% :output-cycl ~S~% :wff? ~S :kb ~S)~%");
        $sym166$HANDLE_ERROR = SubLObjectFactory.makeSymbol("HANDLE-ERROR");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"));
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))));
        $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-METHOD");
        $kw170$THROW = SubLObjectFactory.makeKeyword("THROW");
        $kw171$WARN = SubLObjectFactory.makeKeyword("WARN");
        $sym172$CYCLIFIER_HANDLE_ERROR_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-HANDLE-ERROR-METHOD");
        $const173$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $sym174$BEAUTIFY_CYCLIFICATION = SubLObjectFactory.makeSymbol("BEAUTIFY-CYCLIFICATION");
        $sym175$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $list176 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")));
        $const177$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list178 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")));
        $sym179$GET_CYCL = SubLObjectFactory.makeSymbol("GET-CYCL");
        $kw180$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $list181 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJECT")));
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SUBJECT"));
        $sym183$CYCL = SubLObjectFactory.makeSymbol("CYCL");
        $const184$PPCompFrameFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrameFn"));
        $list185 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("PREP-OBJECT")));
        $sym186$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw187$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $kw188$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $sym189$CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON");
        $sym190$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $sym191$NEW_STANFORD_PARSER = SubLObjectFactory.makeSymbol("NEW-STANFORD-PARSER");
        $kw192$CONTEXT = SubLObjectFactory.makeKeyword("CONTEXT");
        $sym193$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $sym194$GET_CYCLIFIER = SubLObjectFactory.makeSymbol("GET-CYCLIFIER");
        $str195$Sentence__ = SubLObjectFactory.makeString("Sentence: ");
        $sym196$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym197$CYCLIFY_PARSE = SubLObjectFactory.makeSymbol("CYCLIFY-PARSE");
        $str198$__ = SubLObjectFactory.makeString("??");
        $list199 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCL"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTE"), (SubLObject)cyclifier.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym200$CONFIDENCE = SubLObjectFactory.makeSymbol("CONFIDENCE");
        $sym201$WORD = SubLObjectFactory.makeSymbol("WORD");
        $sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS");
        $sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE");
        $sym204$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return el-formula-p; the cycl part of this string semantics"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL")));
        $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");
        $sym207$CYCLIFICATION_GET_CYCL_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-GET-CYCL-METHOD");
        $sym208$GET_WORD = SubLObjectFactory.makeSymbol("GET-WORD");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the string of this cyclification"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")));
        $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");
        $sym211$CYCLIFICATION_GET_WORD_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-GET-WORD-METHOD");
        $sym212$GET_CONFIDENCE = SubLObjectFactory.makeSymbol("GET-CONFIDENCE");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integerp; the confidence that the lex entry of this cyclification\n   is the intended meaning of its word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE")));
        $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");
        $sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-GET-CONFIDENCE-METHOD");
        $sym216$COPY = SubLObjectFactory.makeSymbol("COPY");
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return cyclification-p; a copy of this cyclification"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"))));
        $sym218$CYCLIFICATION_COPY_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-COPY-METHOD");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Pretty-prints this word semantics to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<CYCLIFICATION "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFICATION-METHOD");
        $str221$__CYCLIFICATION_ = SubLObjectFactory.makeString("#<CYCLIFICATION ");
        $str222$_ = SubLObjectFactory.makeString(">");
        $sym223$CYCLIFICATION_PRINT_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-PRINT-METHOD");
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA"));
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)cyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-P"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCL")))))), (SubLObject)ConsesLow.list((SubLObject)cyclifier.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))));
        $sym226$CYCLIFICATION_EL_FORMULA_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-EL-FORMULA-METHOD");
        $sym227$FIND = SubLObjectFactory.makeSymbol("FIND");
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)cyclifier.EQL)));
        $list229 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("TEST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-P"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCL"))), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("TEST")))), (SubLObject)ConsesLow.list((SubLObject)cyclifier.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))))));
        $sym230$CYCLIFICATION_FIND_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-FIND-METHOD");
        $sym231$SUBSTITUTE = SubLObjectFactory.makeSymbol("SUBSTITUTE");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("OLD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)cyclifier.EQL)));
        $list233 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST"), (SubLObject)cyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTE")), (SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("OLD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION-P"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYCL"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("OLD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFICATION-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCLIFICATION")))), (SubLObject)ConsesLow.list((SubLObject)cyclifier.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("OLD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFICATION"))))));
        $sym234$CYCLIFICATION_SUBSTITUTE_METHOD = SubLObjectFactory.makeSymbol("CYCLIFICATION-SUBSTITUTE-METHOD");
        $str235$illegal_cyclification__a = SubLObjectFactory.makeString("illegal cyclification ~a");
        $sym236$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $str237$Illegal_cyclification__a = SubLObjectFactory.makeString("Illegal cyclification ~a");
        $sym238$CYCLIFICATION_SCORE = SubLObjectFactory.makeSymbol("CYCLIFICATION-SCORE");
        $sym239$_ = SubLObjectFactory.makeSymbol(">");
        $sym240$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym241$_ = SubLObjectFactory.makeSymbol("<");
        $sym242$QUANTIFIER_SCOPING_SCORE = SubLObjectFactory.makeSymbol("QUANTIFIER-SCOPING-SCORE");
        $sym243$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym244$GET_ABS_INDEX = SubLObjectFactory.makeSymbol("GET-ABS-INDEX");
        $int245$100 = SubLObjectFactory.makeInteger(100);
        $list246 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("What is the involvement of the armed forces in the chemical weapons process in Lybia?"), SubLObjectFactory.makeString("Who is Prime Minister?"), SubLObjectFactory.makeString("Has India used Chemical Weapons?"), SubLObjectFactory.makeString("Has India used Biological Weapons?"), SubLObjectFactory.makeString("What type of government does Lybia have?"), SubLObjectFactory.makeString("Who is Lybia?"), SubLObjectFactory.makeString("What is the population of Lybia?"), SubLObjectFactory.makeString("What are the major areas of economic growth in Lybia?"), SubLObjectFactory.makeString("What is Lybia's growth domestic product?"), SubLObjectFactory.makeString("Has Lybia used Chemical Weapons?"), SubLObjectFactory.makeString("Does Libya have access to chemical weapons research?"), SubLObjectFactory.makeString("Has Libya stockpiled chemical weapons?"), SubLObjectFactory.makeString("Has Libya used Chemical weapons?"), SubLObjectFactory.makeString("has Libya stored chemical weapons?"), SubLObjectFactory.makeString("Who are Iran's Chemical Weapons Scientists?"), SubLObjectFactory.makeString("what is the distance from Tehran to Baghdad?"), SubLObjectFactory.makeString("how far is Iran from Iraq?"), SubLObjectFactory.makeString("Where are Pakistan's chemical weapons?"), SubLObjectFactory.makeString("What are Pakistan delivery systems?"), SubLObjectFactory.makeString("Who are Pakistans scientists?"), SubLObjectFactory.makeString("Where are Pakistan's chemical facilities?"), SubLObjectFactory.makeString("Where are Pakistan's chemical plants?"), SubLObjectFactory.makeString("What chemicals does Pakistan have?"), SubLObjectFactory.makeString("Where are Pakistan's pesticide plants?"), SubLObjectFactory.makeString("Which scientists are involved in Russia's chemcial weapons program?"), SubLObjectFactory.makeString("What Russian weapons systems are capable of delivering chemical weapons?"), SubLObjectFactory.makeString("Which countries has Russia assisted in chemical weapons?"), SubLObjectFactory.makeString("What Russian NBC weapons facilities store what types of materials?"), SubLObjectFactory.makeString("Who are Russia's chemical scientists?"), SubLObjectFactory.makeString("What chemical weapons does Russia have?"), SubLObjectFactory.makeString("What happened to South Africa's chemical weapons scientists?"), SubLObjectFactory.makeString("What are the current and future development of chemicals in South Africa?"), SubLObjectFactory.makeString("Tell me about Egypt's biological weapons program."), SubLObjectFactory.makeString("Does Egypt possess old technology for biological weapons?") });
        $str247$sentence___S__ = SubLObjectFactory.makeString("sentence: ~S~%");
        $sym248$INFERENCE_FORMULA_FOLLOWS = SubLObjectFactory.makeSymbol("INFERENCE-FORMULA-FOLLOWS");
        $const249$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym250$INSTANCEFN_NAT_ = SubLObjectFactory.makeSymbol("INSTANCEFN-NAT?");
    }
}

/*

	Total time: 1299 ms
	 synthetic 
*/
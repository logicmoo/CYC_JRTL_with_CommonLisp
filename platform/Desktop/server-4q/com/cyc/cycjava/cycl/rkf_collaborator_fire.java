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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_collaborator_fire extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_collaborator_fire";
    public static final String myFingerPrint = "674f51f67656c73b2f59b305474dcc49202d4fafaab2854cbda242b9e2007413";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3235L)
    private static SubLSymbol $cyc_constant_to_mac_fac_term_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3403L)
    private static SubLSymbol $mac_fac_term_to_cyc_term_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 5029L)
    private static SubLSymbol $kqml_end_message_char$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 5952L)
    private static SubLSymbol $kqml_default_read_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7058L)
    public static SubLSymbol $kqml_trace$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLSymbol $dtp_kqml_object$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12241L)
    private static SubLSymbol $kqml_read_table$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12528L)
    private static SubLSymbol $kmql_package_prefixes$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLSymbol $dtp_fire_session$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16794L)
    public static SubLSymbol $current_fire_session$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 23972L)
    private static SubLSymbol $rkf_fire_trace_analogy$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 28368L)
    private static SubLSymbol $fire_server_nil$;
    private static final SubLSymbol $sym0$CONSTANT_P;
    private static final SubLSymbol $sym1$CYC_CONSTANT_TO_MAC_FAC_TERM;
    private static final SubLSymbol $sym2$CYCL_TO_MAC_FAC_TRANSFORM_ISA_TEST;
    private static final SubLSymbol $sym3$CYCL_TO_MAC_FAC_TRANSFORM_ISA_ACT;
    private static final SubLObject $const4$isa;
    private static final SubLSymbol $sym5$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_TEST;
    private static final SubLSymbol $sym6$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_ACT;
    private static final SubLObject $const7$Collection;
    private static final SubLSymbol $sym8$_CYC_CONSTANT_TO_MAC_FAC_TERM_CACHING_STATE_;
    private static final SubLInteger $int9$100;
    private static final SubLSymbol $sym10$MAC_FAC_TERM_TO_CYC_TERM;
    private static final SubLSymbol $sym11$SYMBOLP;
    private static final SubLSymbol $sym12$_MAC_FAC_TERM_TO_CYC_TERM_CACHING_STATE_;
    private static final SubLSymbol $sym13$STRINGP;
    private static final SubLSymbol $kw14$CONTENT;
    private static final SubLString $str15$__KQML_SEND___S;
    private static final SubLInteger $int16$60;
    private static final SubLSymbol $kw17$EOF;
    private static final SubLString $str18$__KQML_READ___S;
    private static final SubLString $str19$__KQML_READ_TIMEOUT___S;
    private static final SubLSymbol $sym20$KQML_OBJECT;
    private static final SubLSymbol $sym21$KQML_OBJECT_P;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym27$KQML_OBJECT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$KQML_OBJECT_PERFORMATIVE;
    private static final SubLSymbol $sym30$_CSETF_KQML_OBJECT_PERFORMATIVE;
    private static final SubLSymbol $sym31$KQML_OBJECT_SENDER;
    private static final SubLSymbol $sym32$_CSETF_KQML_OBJECT_SENDER;
    private static final SubLSymbol $sym33$KQML_OBJECT_RECEIVER;
    private static final SubLSymbol $sym34$_CSETF_KQML_OBJECT_RECEIVER;
    private static final SubLSymbol $sym35$KQML_OBJECT_FROM;
    private static final SubLSymbol $sym36$_CSETF_KQML_OBJECT_FROM;
    private static final SubLSymbol $sym37$KQML_OBJECT_TO;
    private static final SubLSymbol $sym38$_CSETF_KQML_OBJECT_TO;
    private static final SubLSymbol $sym39$KQML_OBJECT_IN_REPLY_TO;
    private static final SubLSymbol $sym40$_CSETF_KQML_OBJECT_IN_REPLY_TO;
    private static final SubLSymbol $sym41$KQML_OBJECT_REPLY_WITH;
    private static final SubLSymbol $sym42$_CSETF_KQML_OBJECT_REPLY_WITH;
    private static final SubLSymbol $sym43$KQML_OBJECT_LANGUAGE;
    private static final SubLSymbol $sym44$_CSETF_KQML_OBJECT_LANGUAGE;
    private static final SubLSymbol $sym45$KQML_OBJECT_ONTOLOGY;
    private static final SubLSymbol $sym46$_CSETF_KQML_OBJECT_ONTOLOGY;
    private static final SubLSymbol $sym47$KQML_OBJECT_CONTENT;
    private static final SubLSymbol $sym48$_CSETF_KQML_OBJECT_CONTENT;
    private static final SubLSymbol $kw49$PERFORMATIVE;
    private static final SubLSymbol $kw50$SENDER;
    private static final SubLSymbol $kw51$RECEIVER;
    private static final SubLSymbol $kw52$FROM;
    private static final SubLSymbol $kw53$TO;
    private static final SubLSymbol $kw54$IN_REPLY_TO;
    private static final SubLSymbol $kw55$REPLY_WITH;
    private static final SubLSymbol $kw56$LANGUAGE;
    private static final SubLSymbol $kw57$ONTOLOGY;
    private static final SubLString $str58$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw59$BEGIN;
    private static final SubLSymbol $sym60$MAKE_KQML_OBJECT;
    private static final SubLSymbol $kw61$SLOT;
    private static final SubLSymbol $kw62$END;
    private static final SubLSymbol $sym63$VISIT_DEFSTRUCT_OBJECT_KQML_OBJECT_METHOD;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$CAND;
    private static final SubLSymbol $sym66$STRING_EQUAL;
    private static final SubLSymbol $sym67$SYMBOL_NAME;
    private static final SubLString $str68$from;
    private static final SubLString $str69$to;
    private static final SubLString $str70$in_reply_to;
    private static final SubLString $str71$reply_with;
    private static final SubLString $str72$language;
    private static final SubLString $str73$ontology;
    private static final SubLString $str74$content;
    private static final SubLSymbol $sym75$LISTP;
    private static final SubLList $list76;
    private static final SubLString $str77$_;
    private static final SubLString $str78$__SENDER_;
    private static final SubLString $str79$__RECEIVER_;
    private static final SubLString $str80$__FROM_;
    private static final SubLString $str81$__TO_;
    private static final SubLString $str82$__IN_REPLY_TO_;
    private static final SubLString $str83$__REPLY_WITH_;
    private static final SubLString $str84$__LANGUAGE_;
    private static final SubLString $str85$__ONTOLOGY_;
    private static final SubLString $str86$__CONTENT_;
    private static final SubLString $str87$_;
    private static final SubLSymbol $sym88$CCONCATENATE;
    private static final SubLString $str89$Message__S_couldn_t_be_parsed;
    private static final SubLSymbol $kw90$PRESERVE;
    private static final SubLList $list91;
    private static final SubLString $str92$;
    private static final SubLString $str93$__KQML_message___;
    private static final SubLString $str94$__A__;
    private static final SubLString $str95$______sender_______A__;
    private static final SubLString $str96$______receiver_____A__;
    private static final SubLString $str97$______from_________A__;
    private static final SubLString $str98$______to___________A__;
    private static final SubLString $str99$______in_reply_to__A__;
    private static final SubLString $str100$______language_____A__;
    private static final SubLString $str101$______ontology_____A__;
    private static final SubLString $str102$______content______A___;
    private static final SubLObject $const103$ReifiableFunction;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$RESPONSE;
    private static final SubLSymbol $sym106$PERFORMATIVE;
    private static final SubLSymbol $sym107$CONTENT;
    private static final SubLSymbol $sym108$RETVAL;
    private static final SubLSymbol $sym109$CODE;
    private static final SubLSymbol $sym110$CLET;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$IGNORE_ERRORS;
    private static final SubLSymbol $sym113$WITH_TCP_CONNECTION;
    private static final SubLSymbol $sym114$FIRE_SESSION_MACHINE;
    private static final SubLSymbol $sym115$FIRE_SESSION_PORT;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$PWHEN;
    private static final SubLSymbol $sym118$KQML_SEND_MESSAGE;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$TELL;
    private static final SubLSymbol $sym121$CSETQ;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$PIF;
    private static final SubLSymbol $sym124$NULL;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$PCOND;
    private static final SubLSymbol $sym127$PERFORMATIVE_EQUAL;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$COR;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$FORMAT;
    private static final SubLString $str133$Unknown_response_type__A;
    private static final SubLSymbol $sym134$RET;
    private static final SubLSymbol $sym135$VALUES;
    private static final SubLSymbol $sym136$FIRE_SESSION;
    private static final SubLSymbol $sym137$FIRE_SESSION_P;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$FIRE_SESSION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$_CSETF_FIRE_SESSION_MACHINE;
    private static final SubLSymbol $sym145$_CSETF_FIRE_SESSION_PORT;
    private static final SubLSymbol $sym146$FIRE_SESSION_KB_PATH;
    private static final SubLSymbol $sym147$_CSETF_FIRE_SESSION_KB_PATH;
    private static final SubLSymbol $sym148$FIRE_SESSION_KB_NAME;
    private static final SubLSymbol $sym149$_CSETF_FIRE_SESSION_KB_NAME;
    private static final SubLSymbol $sym150$FIRE_SESSION_PREDSTYLE;
    private static final SubLSymbol $sym151$_CSETF_FIRE_SESSION_PREDSTYLE;
    private static final SubLSymbol $kw152$MACHINE;
    private static final SubLSymbol $kw153$PORT;
    private static final SubLSymbol $kw154$KB_PATH;
    private static final SubLSymbol $kw155$KB_NAME;
    private static final SubLSymbol $kw156$PREDSTYLE;
    private static final SubLSymbol $sym157$MAKE_FIRE_SESSION;
    private static final SubLSymbol $sym158$VISIT_DEFSTRUCT_OBJECT_FIRE_SESSION_METHOD;
    private static final SubLSymbol $sym159$_CURRENT_FIRE_SESSION_;
    private static final SubLList $list160;
    private static final SubLSymbol $kw161$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym162$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw163$PRIVATE;
    private static final SubLString $str164$unknown;
    private static final SubLString $str165$Message_Error;
    private static final SubLString $str166$tell;
    private static final SubLString $str167$error;
    private static final SubLString $str168$tell_error;
    private static final SubLList $list169;
    private static final SubLString $str170$Invalid_predicate_style__S__;
    private static final SubLSymbol $sym171$OPEN_KB;
    private static final SubLSymbol $kw172$PATH;
    private static final SubLSymbol $kw173$NAME;
    private static final SubLSymbol $kw174$PREDICATE_STYLE;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$NEW_KB;
    private static final SubLSymbol $sym177$DUMP_SME;
    private static final SubLSymbol $kw178$SME_ID;
    private static final SubLSymbol $kw179$FILE;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLSymbol $kw182$ALL;
    private static final SubLSymbol $sym183$RETRIEVE;
    private static final SubLSymbol $kw184$QUERY;
    private static final SubLSymbol $sym185$STORE;
    private static final SubLSymbol $kw186$FACT;
    private static final SubLSymbol $sym187$FORGET;
    private static final SubLSymbol $sym188$LOAD_MELD_FILE;
    private static final SubLSymbol $sym189$LOAD_FLAT_FILE;
    private static final SubLSymbol $kw190$LEGACY_;
    private static final SubLSymbol $kw191$SUPPRESS;
    private static final SubLSymbol $sym192$ASK;
    private static final SubLSymbol $kw193$NUMBER;
    private static final SubLSymbol $sym194$TELL;
    private static final SubLSymbol $sym195$UNTELL;
    private static final SubLSymbol $kw196$CORRESPONDENCES;
    private static final SubLSymbol $kw197$INFERENCES;
    private static final SubLString $str198$_;
    private static final SubLList $list199;
    private static final SubLObject $const200$ist_Information;
    private static final SubLSymbol $sym201$Case;
    private static final SubLSymbol $kw202$STORE;
    private static final SubLSymbol $sym203$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const204$EverythingPSC;
    private static final SubLSymbol $sym205$GENERATE_TERM_NAME;
    private static final SubLString $str206$_A_D;
    private static final SubLString $str207$CYC;
    private static final SubLString $str208$nil;
    private static final SubLObject $const209$matchBetween;
    private static final SubLSymbol $sym210$_MATCH;
    private static final SubLSymbol $sym211$explicit_case_fn;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$and;
    private static final SubLSymbol $sym215$bestMapping;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLList $list222;
    private static final SubLSymbol $sym223$FORT_P;
    private static final SubLSymbol $sym224$_WHAT;
    private static final SubLObject $const225$FunctionalPredicate;
    private static final SubLObject $const226$Function_Denotational;
    private static final SubLObject $const227$Predicate;
    private static final SubLObject $const228$arity;
    private static final SubLObject $const229$genls;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 1281L)
    public static SubLObject cycl_to_mac_fac(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl_to_mac_fac_transform_isa(cycl), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym0$CONSTANT_P), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym1$CYC_CONSTANT_TO_MAC_FAC_TERM), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 1711L)
    public static SubLObject mac_fac_to_cycl(final SubLObject mac_fac) {
        return mac_fac_to_cycl_transform_unary(mac_fac_to_cycl_recursive(mac_fac));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 1888L)
    public static SubLObject mac_fac_to_cycl_recursive(final SubLObject mac_fac) {
        if (mac_fac.isKeyword()) {
            return mac_fac;
        }
        if (mac_fac.isSymbol()) {
            final SubLObject constant = mac_fac_term_to_cyc_term(mac_fac);
            if (rkf_collaborator_fire.NIL != constant_handles.constant_p(constant)) {
                return constant;
            }
            return mac_fac;
        }
        else {
            if (mac_fac.isAtom()) {
                return mac_fac;
            }
            return (SubLObject)ConsesLow.cons(mac_fac_to_cycl_recursive(mac_fac.first()), mac_fac_to_cycl_recursive(mac_fac.rest()));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 2309L)
    public static SubLObject cycl_to_mac_fac_transform_isa(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym2$CYCL_TO_MAC_FAC_TRANSFORM_ISA_TEST), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym3$CYCL_TO_MAC_FAC_TRANSFORM_ISA_ACT), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 2484L)
    public static SubLObject cycl_to_mac_fac_transform_isa_test(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && rkf_collaborator_fire.THREE_INTEGER.numE(Sequences.length(v_object)) && rkf_collaborator_fire.$const4$isa.eql(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 2636L)
    public static SubLObject cycl_to_mac_fac_transform_isa_act(final SubLObject v_object) {
        return (SubLObject)ConsesLow.list(conses_high.third(v_object), conses_high.second(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 2743L)
    public static SubLObject mac_fac_to_cycl_transform_unary(final SubLObject mac_fac) {
        return transform_list_utilities.transform(mac_fac, Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym5$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_TEST), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym6$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_ACT), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 2917L)
    public static SubLObject mac_fac_to_cycl_transform_unary_test(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && rkf_collaborator_fire.TWO_INTEGER.numE(Sequences.length(v_object)) && rkf_collaborator_fire.NIL != forts.fort_p(v_object.first()) && rkf_collaborator_fire.NIL != isa.isa_in_any_mtP(v_object.first(), rkf_collaborator_fire.$const7$Collection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3120L)
    public static SubLObject mac_fac_to_cycl_transform_unary_act(final SubLObject v_object) {
        return (SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, conses_high.second(v_object), v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3235L)
    public static SubLObject clear_cyc_constant_to_mac_fac_term() {
        final SubLObject cs = rkf_collaborator_fire.$cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue();
        if (rkf_collaborator_fire.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3235L)
    public static SubLObject remove_cyc_constant_to_mac_fac_term(final SubLObject constant) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_collaborator_fire.$cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(constant), (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3235L)
    public static SubLObject cyc_constant_to_mac_fac_term_internal(final SubLObject constant) {
        assert rkf_collaborator_fire.NIL != constant_handles.constant_p(constant) : constant;
        return Packages.intern(cyc_name_to_mac_fac_name(constants_high.constant_name(constant)), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3235L)
    public static SubLObject cyc_constant_to_mac_fac_term(final SubLObject constant) {
        SubLObject caching_state = rkf_collaborator_fire.$cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue();
        if (rkf_collaborator_fire.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_collaborator_fire.$sym1$CYC_CONSTANT_TO_MAC_FAC_TERM, (SubLObject)rkf_collaborator_fire.$sym8$_CYC_CONSTANT_TO_MAC_FAC_TERM_CACHING_STATE_, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.EQL, (SubLObject)rkf_collaborator_fire.ONE_INTEGER, (SubLObject)rkf_collaborator_fire.$int9$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constant, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cyc_constant_to_mac_fac_term_internal(constant)));
            memoization_state.caching_state_put(caching_state, constant, results, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3403L)
    public static SubLObject clear_mac_fac_term_to_cyc_term() {
        final SubLObject cs = rkf_collaborator_fire.$mac_fac_term_to_cyc_term_caching_state$.getGlobalValue();
        if (rkf_collaborator_fire.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3403L)
    public static SubLObject remove_mac_fac_term_to_cyc_term(final SubLObject mac_fac_term) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_collaborator_fire.$mac_fac_term_to_cyc_term_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mac_fac_term), (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3403L)
    public static SubLObject mac_fac_term_to_cyc_term_internal(final SubLObject mac_fac_term) {
        assert rkf_collaborator_fire.NIL != Types.symbolp(mac_fac_term) : mac_fac_term;
        final SubLObject constant_name = mac_fac_name_to_cyc_name(Symbols.symbol_name(mac_fac_term));
        final SubLObject constant = constant_completion_high.constant_complete(constant_name, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.T, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED).first();
        if (rkf_collaborator_fire.NIL != constant_handles.constant_p(constant)) {
            return constant;
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3403L)
    public static SubLObject mac_fac_term_to_cyc_term(final SubLObject mac_fac_term) {
        SubLObject caching_state = rkf_collaborator_fire.$mac_fac_term_to_cyc_term_caching_state$.getGlobalValue();
        if (rkf_collaborator_fire.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_collaborator_fire.$sym10$MAC_FAC_TERM_TO_CYC_TERM, (SubLObject)rkf_collaborator_fire.$sym12$_MAC_FAC_TERM_TO_CYC_TERM_CACHING_STATE_, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.EQL, (SubLObject)rkf_collaborator_fire.ONE_INTEGER, (SubLObject)rkf_collaborator_fire.$int9$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mac_fac_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(mac_fac_term_to_cyc_term_internal(mac_fac_term)));
            memoization_state.caching_state_put(caching_state, mac_fac_term, results, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 3712L)
    public static SubLObject cyc_name_to_mac_fac_name(final SubLObject cyc_name) {
        assert rkf_collaborator_fire.NIL != Types.stringp(cyc_name) : cyc_name;
        final SubLObject output_stream = streams_high.make_string_output_stream();
        SubLObject last_char = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject this_char;
        for (cdotimes_end_var = Sequences.length(cyc_name), index = (SubLObject)rkf_collaborator_fire.NIL, index = (SubLObject)rkf_collaborator_fire.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)rkf_collaborator_fire.ONE_INTEGER)) {
            this_char = Strings.sublisp_char(cyc_name, index);
            if (rkf_collaborator_fire.NIL != last_char && ((last_char.eql((SubLObject)Characters.CHAR_hyphen) && rkf_collaborator_fire.NIL != Characters.alpha_char_p(this_char)) || (rkf_collaborator_fire.NIL != Characters.lower_case_p(last_char) && rkf_collaborator_fire.NIL != Characters.upper_case_p(this_char)) || (rkf_collaborator_fire.NIL != Characters.digit_char_p(last_char, (SubLObject)rkf_collaborator_fire.UNPROVIDED) && rkf_collaborator_fire.NIL != Characters.alpha_char_p(this_char)))) {
                streams_high.write_char((SubLObject)Characters.CHAR_hyphen, output_stream);
            }
            streams_high.write_char(Characters.char_upcase(this_char), output_stream);
            last_char = this_char;
        }
        return streams_high.get_output_stream_string(output_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 4406L)
    public static SubLObject mac_fac_name_to_cyc_name(final SubLObject mac_fac_name) {
        assert rkf_collaborator_fire.NIL != Types.stringp(mac_fac_name) : mac_fac_name;
        final SubLObject output_stream = streams_high.make_string_output_stream();
        SubLObject last_char = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject this_char;
        for (cdotimes_end_var = Sequences.length(mac_fac_name), index = (SubLObject)rkf_collaborator_fire.NIL, index = (SubLObject)rkf_collaborator_fire.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)rkf_collaborator_fire.ONE_INTEGER)) {
            this_char = Strings.sublisp_char(mac_fac_name, index);
            if (rkf_collaborator_fire.NIL != last_char && (!last_char.eql((SubLObject)Characters.CHAR_hyphen) || rkf_collaborator_fire.NIL == Characters.alpha_char_p(this_char))) {
                streams_high.write_char(last_char, output_stream);
            }
            last_char = this_char;
        }
        if (rkf_collaborator_fire.NIL != last_char) {
            streams_high.write_char(last_char, output_stream);
        }
        return streams_high.get_output_stream_string(output_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 5336L)
    public static SubLObject kqml_send_message(final SubLObject tcp_channel, final SubLObject sender, final SubLObject receiver, final SubLObject performative, SubLObject content) {
        if (content == rkf_collaborator_fire.UNPROVIDED) {
            content = (SubLObject)rkf_collaborator_fire.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_collaborator_fire.NIL != tcp_channel && rkf_collaborator_fire.NIL != performative) {
            final SubLObject kqml_message_string = kqml_message_to_string(kqml_build_message(performative, sender, receiver, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$kw14$CONTENT, content)));
            kqml_trace((SubLObject)rkf_collaborator_fire.$str15$__KQML_SEND___S, kqml_message_string, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            streams_high.write_string(kqml_message_string, tcp_channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            streams_high.write_char(rkf_collaborator_fire.$kqml_end_message_char$.getDynamicValue(thread), tcp_channel);
            streams_high.force_output(tcp_channel);
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 6015L)
    public static SubLObject kqml_read_message(final SubLObject tcp_channel, SubLObject timeout, SubLObject sleep_time) {
        if (timeout == rkf_collaborator_fire.UNPROVIDED) {
            timeout = rkf_collaborator_fire.$kqml_default_read_timeout$.getGlobalValue();
        }
        if (sleep_time == rkf_collaborator_fire.UNPROVIDED) {
            sleep_time = (SubLObject)rkf_collaborator_fire.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject out_string = streams_high.make_string_output_stream();
        SubLObject wait_time;
        SubLObject cur_char;
        for (wait_time = (SubLObject)rkf_collaborator_fire.ZERO_INTEGER, cur_char = (SubLObject)rkf_collaborator_fire.NIL, cur_char = kqml_read_char(tcp_channel); !cur_char.eql(rkf_collaborator_fire.$kqml_end_message_char$.getDynamicValue(thread)) && !cur_char.eql((SubLObject)rkf_collaborator_fire.$kw17$EOF) && (rkf_collaborator_fire.NIL == timeout || !wait_time.numG(timeout)); cur_char = kqml_read_char(tcp_channel)) {
            if (rkf_collaborator_fire.NIL != cur_char) {
                wait_time = (SubLObject)rkf_collaborator_fire.ZERO_INTEGER;
                streams_high.write_char(cur_char, out_string);
            }
            else {
                wait_time = Numbers.add(wait_time, sleep_time);
                Threads.sleep(sleep_time);
            }
        }
        final SubLObject message_string = streams_high.get_output_stream_string(out_string);
        if (cur_char.eql(rkf_collaborator_fire.$kqml_end_message_char$.getDynamicValue(thread))) {
            kqml_trace((SubLObject)rkf_collaborator_fire.$str18$__KQML_READ___S, message_string, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            return kqml_string_to_message(message_string);
        }
        kqml_trace((SubLObject)rkf_collaborator_fire.$str19$__KQML_READ_TIMEOUT___S, message_string, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 6962L)
    public static SubLObject kqml_read_char(final SubLObject tcp_channel) {
        return streams_high.read_char_no_hang(tcp_channel, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw17$EOF, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7099L)
    public static SubLObject kqml_trace(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == rkf_collaborator_fire.UNPROVIDED) {
            arg1 = (SubLObject)rkf_collaborator_fire.NIL;
        }
        if (arg2 == rkf_collaborator_fire.UNPROVIDED) {
            arg2 = (SubLObject)rkf_collaborator_fire.NIL;
        }
        if (arg3 == rkf_collaborator_fire.UNPROVIDED) {
            arg3 = (SubLObject)rkf_collaborator_fire.NIL;
        }
        if (arg4 == rkf_collaborator_fire.UNPROVIDED) {
            arg4 = (SubLObject)rkf_collaborator_fire.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_collaborator_fire.NIL != rkf_collaborator_fire.$kqml_trace$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), format_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_collaborator_fire.ZERO_INTEGER);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kqml_object_native.class) ? rkf_collaborator_fire.T : rkf_collaborator_fire.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_performative(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_sender(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_receiver(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_from(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_to(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_in_reply_to(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_reply_with(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_language(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_ontology(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject kqml_object_content(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_performative(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_sender(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_receiver(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_from(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_to(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_in_reply_to(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_reply_with(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_language(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_ontology(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject _csetf_kqml_object_content(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject make_kqml_object(SubLObject arglist) {
        if (arglist == rkf_collaborator_fire.UNPROVIDED) {
            arglist = (SubLObject)rkf_collaborator_fire.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kqml_object_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_collaborator_fire.NIL, next = arglist; rkf_collaborator_fire.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw49$PERFORMATIVE)) {
                _csetf_kqml_object_performative(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw50$SENDER)) {
                _csetf_kqml_object_sender(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw51$RECEIVER)) {
                _csetf_kqml_object_receiver(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw52$FROM)) {
                _csetf_kqml_object_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw53$TO)) {
                _csetf_kqml_object_to(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw54$IN_REPLY_TO)) {
                _csetf_kqml_object_in_reply_to(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw55$REPLY_WITH)) {
                _csetf_kqml_object_reply_with(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw56$LANGUAGE)) {
                _csetf_kqml_object_language(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw57$ONTOLOGY)) {
                _csetf_kqml_object_ontology(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw14$CONTENT)) {
                _csetf_kqml_object_content(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_collaborator_fire.$str58$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject visit_defstruct_kqml_object(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw59$BEGIN, (SubLObject)rkf_collaborator_fire.$sym60$MAKE_KQML_OBJECT, (SubLObject)rkf_collaborator_fire.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw49$PERFORMATIVE, kqml_object_performative(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw50$SENDER, kqml_object_sender(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw51$RECEIVER, kqml_object_receiver(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw52$FROM, kqml_object_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw53$TO, kqml_object_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw54$IN_REPLY_TO, kqml_object_in_reply_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw55$REPLY_WITH, kqml_object_reply_with(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw56$LANGUAGE, kqml_object_language(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw57$ONTOLOGY, kqml_object_ontology(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw14$CONTENT, kqml_object_content(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw62$END, (SubLObject)rkf_collaborator_fire.$sym60$MAKE_KQML_OBJECT, (SubLObject)rkf_collaborator_fire.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7311L)
    public static SubLObject visit_defstruct_object_kqml_object_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kqml_object(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7718L)
    public static SubLObject performative_equal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject string = (SubLObject)rkf_collaborator_fire.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list64);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list64);
        string = current.first();
        current = current.rest();
        if (rkf_collaborator_fire.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym65$CAND, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym11$SYMBOLP, value), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym66$STRING_EQUAL, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym67$SYMBOL_NAME, value), string));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list64);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 7864L)
    public static SubLObject kqml_build_message(final SubLObject performative, final SubLObject sender, final SubLObject receiver, SubLObject optional_pairs) {
        if (optional_pairs == rkf_collaborator_fire.UNPROVIDED) {
            optional_pairs = (SubLObject)rkf_collaborator_fire.NIL;
        }
        final SubLObject kqml_object = make_kqml_object((SubLObject)rkf_collaborator_fire.UNPROVIDED);
        _csetf_kqml_object_performative(kqml_object, performative);
        _csetf_kqml_object_sender(kqml_object, sender);
        _csetf_kqml_object_receiver(kqml_object, receiver);
        while (rkf_collaborator_fire.NIL != optional_pairs) {
            final SubLObject slot = optional_pairs.first();
            final SubLObject value = conses_high.second(optional_pairs);
            optional_pairs = conses_high.cddr(optional_pairs);
            if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str68$from, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_from(kqml_object, value);
            }
            else if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str69$to, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_to(kqml_object, value);
            }
            else if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str70$in_reply_to, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_in_reply_to(kqml_object, value);
            }
            else if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str71$reply_with, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_reply_with(kqml_object, value);
            }
            else if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str72$language, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_language(kqml_object, value);
            }
            else if (slot.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str73$ontology, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                _csetf_kqml_object_ontology(kqml_object, value);
            }
            else {
                if (!slot.isSymbol() || rkf_collaborator_fire.NIL == Strings.string_equal(Symbols.symbol_name(slot), (SubLObject)rkf_collaborator_fire.$str74$content, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                    continue;
                }
                _csetf_kqml_object_content(kqml_object, value);
            }
        }
        return kqml_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 9043L)
    public static SubLObject kqml_list_to_message(final SubLObject list) {
        assert rkf_collaborator_fire.NIL != Types.listp(list) : list;
        SubLObject performative = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject sender_key = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject sender = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject receiver_key = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject receiver = (SubLObject)rkf_collaborator_fire.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(list, list, (SubLObject)rkf_collaborator_fire.$list76);
        performative = list.first();
        SubLObject current = list.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, list, (SubLObject)rkf_collaborator_fire.$list76);
        sender_key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, list, (SubLObject)rkf_collaborator_fire.$list76);
        sender = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, list, (SubLObject)rkf_collaborator_fire.$list76);
        receiver_key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, list, (SubLObject)rkf_collaborator_fire.$list76);
        receiver = current.first();
        final SubLObject other_keys;
        current = (other_keys = current.rest());
        return kqml_build_message(performative, sender, receiver, other_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 9377L)
    public static SubLObject kqml_message_to_string(final SubLObject kqml_object) {
        assert rkf_collaborator_fire.NIL != kqml_object_p(kqml_object) : kqml_object;
        SubLObject string_pieces = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$str77$_);
        SubLObject answer_string = (SubLObject)rkf_collaborator_fire.NIL;
        string_pieces = (SubLObject)ConsesLow.cons(Strings.string(kqml_object_performative(kqml_object)), string_pieces);
        if (rkf_collaborator_fire.NIL != kqml_object_sender(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str78$__SENDER_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_sender(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_receiver(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str79$__RECEIVER_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_receiver(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_from(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str80$__FROM_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_from(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_to(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str81$__TO_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_to(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_in_reply_to(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str82$__IN_REPLY_TO_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_in_reply_to(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_reply_with(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str83$__REPLY_WITH_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_reply_with(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_language(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str84$__LANGUAGE_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_language(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_ontology(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str85$__ONTOLOGY_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_ontology(kqml_object)), string_pieces);
        }
        if (rkf_collaborator_fire.NIL != kqml_object_content(kqml_object)) {
            string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str86$__CONTENT_, string_pieces);
            string_pieces = (SubLObject)ConsesLow.cons(print_high.prin1_to_string(kqml_object_content(kqml_object)), string_pieces);
        }
        string_pieces = (SubLObject)ConsesLow.cons((SubLObject)rkf_collaborator_fire.$str87$_, string_pieces);
        string_pieces = Sequences.nreverse(string_pieces);
        answer_string = Functions.apply(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym88$CCONCATENATE), string_pieces);
        return answer_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 11552L)
    public static SubLObject kqml_string_to_message(SubLObject string) {
        assert rkf_collaborator_fire.NIL != Types.stringp(string) : string;
        string = kqml_frob_string(string);
        final SubLObject list = read_from_kqml_string(string, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw17$EOF);
        if (list == rkf_collaborator_fire.$kw17$EOF) {
            Errors.error((SubLObject)rkf_collaborator_fire.$str89$Message__S_couldn_t_be_parsed, string);
        }
        return kqml_list_to_message(list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12065L)
    public static SubLObject create_kqml_read_table() {
        final SubLObject kqml_read_table = reader.copy_readtable((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        reader._csetf_readtable_case(kqml_read_table, (SubLObject)rkf_collaborator_fire.$kw90$PRESERVE);
        return kqml_read_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12306L)
    public static SubLObject read_from_kqml_string(final SubLObject string, final SubLObject eof_error_p, final SubLObject eof_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = reader.$readtable$.currentBinding(thread);
        try {
            reader.$readtable$.bind(rkf_collaborator_fire.$kqml_read_table$.getGlobalValue(), thread);
            result = reader.read_from_string(string, eof_error_p, eof_value, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        finally {
            reader.$readtable$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12629L)
    public static SubLObject kqml_frob_string(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = rkf_collaborator_fire.$kmql_package_prefixes$.getDynamicValue(thread);
        SubLObject prefix = (SubLObject)rkf_collaborator_fire.NIL;
        prefix = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            string = string_utilities.string_subst((SubLObject)rkf_collaborator_fire.$str92$, prefix, string, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            prefix = cdolist_list_var.first();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 12784L)
    public static SubLObject kqml_print_message(final SubLObject kqml_object, SubLObject stream) {
        if (stream == rkf_collaborator_fire.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str93$__KQML_message___);
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str94$__A__, kqml_object_performative(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str95$______sender_______A__, kqml_object_sender(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str96$______receiver_____A__, kqml_object_receiver(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str97$______from_________A__, kqml_object_from(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str98$______to___________A__, kqml_object_to(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str99$______in_reply_to__A__, kqml_object_in_reply_to(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str100$______language_____A__, kqml_object_language(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str101$______ontology_____A__, kqml_object_ontology(kqml_object));
        PrintLow.format(stream, (SubLObject)rkf_collaborator_fire.$str102$______content______A___, kqml_object_content(kqml_object));
        return kqml_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 13720L)
    public static SubLObject cycl_expression_to_kqml_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (rkf_collaborator_fire.NIL != constant_handles.constant_p(expr)) {
            return Packages.intern(constants_high.constant_name(expr), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        if (rkf_collaborator_fire.NIL != nart_handles.nart_p(expr)) {
            return cycl_expression_to_kqml_expression(narts_high.nart_el_formula(expr));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return (SubLObject)ConsesLow.cons(cycl_expression_to_kqml_expression(expr.first()), cycl_expression_to_kqml_expression(expr.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 14200L)
    public static SubLObject kqml_expression_to_cycl_expression(final SubLObject expr) {
        if (expr.isKeyword()) {
            return expr;
        }
        if (expr.isSymbol()) {
            final SubLObject name = Symbols.symbol_name(expr);
            final SubLObject constant = constants_high.find_constant(name);
            return (rkf_collaborator_fire.NIL != constant_handles.constant_p(constant)) ? constant : expr;
        }
        if (expr.isAtom()) {
            return expr;
        }
        if (expr.isCons()) {
            SubLObject part = (SubLObject)ConsesLow.cons(kqml_expression_to_cycl_expression(expr.first()), kqml_expression_to_cycl_expression(expr.rest()));
            if (rkf_collaborator_fire.NIL != is_potential_nat_expressionP(part)) {
                part = kqml_nat_expression_to_nat(part);
            }
            return part;
        }
        return expr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 14820L)
    public static SubLObject is_potential_nat_expressionP(final SubLObject expr) {
        if (expr.isList()) {
            SubLObject result = (SubLObject)rkf_collaborator_fire.NIL;
            result = isa.isa_in_any_mtP(cycl_utilities.formula_arg0(expr), rkf_collaborator_fire.$const103$ReifiableFunction);
            return result;
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 15014L)
    public static SubLObject kqml_nat_expression_to_nat(final SubLObject expr) {
        final SubLObject nart = narts_high.find_nart(expr);
        return (rkf_collaborator_fire.NIL == nart) ? expr : nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 15139L)
    public static SubLObject with_fire_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject session = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject message = (SubLObject)rkf_collaborator_fire.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list104);
        channel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list104);
        session = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list104);
        message = current.first();
        current = current.rest();
        if (rkf_collaborator_fire.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject response = (SubLObject)rkf_collaborator_fire.$sym105$RESPONSE;
            final SubLObject performative = (SubLObject)rkf_collaborator_fire.$sym106$PERFORMATIVE;
            final SubLObject content = (SubLObject)rkf_collaborator_fire.$sym107$CONTENT;
            final SubLObject retval = (SubLObject)rkf_collaborator_fire.$sym108$RETVAL;
            final SubLObject code = (SubLObject)rkf_collaborator_fire.$sym109$CODE;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym110$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(code, (SubLObject)rkf_collaborator_fire.$list111), reader.bq_cons(retval, (SubLObject)rkf_collaborator_fire.$list111), reader.bq_cons(response, (SubLObject)rkf_collaborator_fire.$list111)), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym112$IGNORE_ERRORS, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym113$WITH_TCP_CONNECTION, (SubLObject)ConsesLow.listS(channel, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym114$FIRE_SESSION_MACHINE, session), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym115$FIRE_SESSION_PORT, session), (SubLObject)rkf_collaborator_fire.$list116), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym117$PWHEN, channel, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym118$KQML_SEND_MESSAGE, channel, (SubLObject)rkf_collaborator_fire.$list119, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym114$FIRE_SESSION_MACHINE, session), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message), (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym121$CSETQ, response, (SubLObject)rkf_collaborator_fire.$list122), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym123$PIF, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym124$NULL, response), (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym121$CSETQ, retval, (SubLObject)rkf_collaborator_fire.NIL, code, (SubLObject)rkf_collaborator_fire.$list125), (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym110$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(performative, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym29$KQML_OBJECT_PERFORMATIVE, response)), (SubLObject)ConsesLow.list(content, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym47$KQML_OBJECT_CONTENT, response))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym126$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym127$PERFORMATIVE_EQUAL, performative, (SubLObject)rkf_collaborator_fire.$list128), (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym121$CSETQ, retval, content, code, (SubLObject)rkf_collaborator_fire.$list111)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym65$CAND, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym129$COR, (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym127$PERFORMATIVE_EQUAL, performative, (SubLObject)rkf_collaborator_fire.$list130), (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym127$PERFORMATIVE_EQUAL, performative, (SubLObject)rkf_collaborator_fire.$list131)), content), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym121$CSETQ, retval, (SubLObject)rkf_collaborator_fire.NIL, code, content)), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.T, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym121$CSETQ, retval, (SubLObject)rkf_collaborator_fire.NIL, code, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym132$FORMAT, (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative))))))))))), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym134$RET, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym135$VALUES, retval, code)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list104);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_collaborator_fire.ZERO_INTEGER);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fire_session_native.class) ? rkf_collaborator_fire.T : rkf_collaborator_fire.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_machine(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_port(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_kb_path(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_kb_name(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject fire_session_predstyle(final SubLObject v_object) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject _csetf_fire_session_machine(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject _csetf_fire_session_port(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject _csetf_fire_session_kb_path(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject _csetf_fire_session_kb_name(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject _csetf_fire_session_predstyle(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_fire.NIL != fire_session_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject make_fire_session(SubLObject arglist) {
        if (arglist == rkf_collaborator_fire.UNPROVIDED) {
            arglist = (SubLObject)rkf_collaborator_fire.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fire_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_collaborator_fire.NIL, next = arglist; rkf_collaborator_fire.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw152$MACHINE)) {
                _csetf_fire_session_machine(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw153$PORT)) {
                _csetf_fire_session_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw154$KB_PATH)) {
                _csetf_fire_session_kb_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw155$KB_NAME)) {
                _csetf_fire_session_kb_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw156$PREDSTYLE)) {
                _csetf_fire_session_predstyle(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_collaborator_fire.$str58$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject visit_defstruct_fire_session(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw59$BEGIN, (SubLObject)rkf_collaborator_fire.$sym157$MAKE_FIRE_SESSION, (SubLObject)rkf_collaborator_fire.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw152$MACHINE, fire_session_machine(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw153$PORT, fire_session_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw154$KB_PATH, fire_session_kb_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw155$KB_NAME, fire_session_kb_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw61$SLOT, (SubLObject)rkf_collaborator_fire.$kw156$PREDSTYLE, fire_session_predstyle(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_fire.$kw62$END, (SubLObject)rkf_collaborator_fire.$sym157$MAKE_FIRE_SESSION, (SubLObject)rkf_collaborator_fire.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16572L)
    public static SubLObject visit_defstruct_object_fire_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fire_session(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 16841L)
    public static SubLObject create_fire_session(final SubLObject machine, final SubLObject port) {
        final SubLObject fsession = make_fire_session((SubLObject)rkf_collaborator_fire.UNPROVIDED);
        _csetf_fire_session_machine(fsession, machine);
        _csetf_fire_session_port(fsession, port);
        _csetf_fire_session_kb_path(fsession, (SubLObject)rkf_collaborator_fire.NIL);
        _csetf_fire_session_kb_name(fsession, (SubLObject)rkf_collaborator_fire.NIL);
        _csetf_fire_session_predstyle(fsession, (SubLObject)rkf_collaborator_fire.NIL);
        return fsession;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 17226L)
    public static SubLObject local_fire_session(final SubLObject machine, final SubLObject port) {
        rkf_collaborator_fire.$current_fire_session$.setGlobalValue(create_fire_session(machine, port));
        return rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 17381L)
    public static SubLObject fire_kill_server(SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)rkf_collaborator_fire.$list160;
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 17581L)
    public static SubLObject fire_open_kb(final SubLObject path, final SubLObject name, final SubLObject predstyle, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_collaborator_fire.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rkf_collaborator_fire.NIL == subl_promotions.memberP(predstyle, (SubLObject)rkf_collaborator_fire.$list169, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
            Errors.error((SubLObject)rkf_collaborator_fire.$str170$Invalid_predicate_style__S__, predstyle);
        }
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym171$OPEN_KB, (SubLObject)rkf_collaborator_fire.$kw172$PATH, path, (SubLObject)rkf_collaborator_fire.$kw173$NAME, name, (SubLObject)rkf_collaborator_fire.$kw174$PREDICATE_STYLE, predstyle);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                _csetf_fire_session_kb_path(fsession, path);
                                _csetf_fire_session_kb_name(fsession, name);
                                _csetf_fire_session_predstyle(fsession, predstyle);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 18161L)
    public static SubLObject fire_close_kb(SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fire_end_session(fsession);
        final SubLObject message = (SubLObject)rkf_collaborator_fire.$list175;
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 18419L)
    public static SubLObject fire_new_kb(final SubLObject path, final SubLObject name, final SubLObject predstyle, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym176$NEW_KB, (SubLObject)rkf_collaborator_fire.$kw172$PATH, path, (SubLObject)rkf_collaborator_fire.$kw173$NAME, name, (SubLObject)rkf_collaborator_fire.$kw174$PREDICATE_STYLE, predstyle);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                _csetf_fire_session_kb_path(fsession, path);
                                _csetf_fire_session_kb_name(fsession, name);
                                _csetf_fire_session_predstyle(fsession, predstyle);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 18874L)
    public static SubLObject fire_flush(SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject path = fire_session_kb_path(fsession);
        final SubLObject name = fire_session_kb_name(fsession);
        final SubLObject predstyle = fire_session_predstyle(fsession);
        fire_close_kb(fsession);
        return fire_open_kb(path, name, predstyle, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 19189L)
    public static SubLObject fire_dump_sme(final SubLObject id, final SubLObject filename, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym177$DUMP_SME, (SubLObject)rkf_collaborator_fire.$kw178$SME_ID, id, (SubLObject)rkf_collaborator_fire.$kw179$FILE, filename);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 19426L)
    public static SubLObject fire_start_session(SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)rkf_collaborator_fire.$list180;
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 19645L)
    public static SubLObject fire_end_session(SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)rkf_collaborator_fire.$list181;
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 19840L)
    public static SubLObject fire_retrieve(final SubLObject query, SubLObject number, SubLObject fsession) {
        if (number == rkf_collaborator_fire.UNPROVIDED) {
            number = (SubLObject)rkf_collaborator_fire.$kw182$ALL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym183$RETRIEVE, (SubLObject)rkf_collaborator_fire.$kw184$QUERY, query, number);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 20137L)
    public static SubLObject fire_store(final SubLObject fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym185$STORE, (SubLObject)rkf_collaborator_fire.$kw186$FACT, fact);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 20346L)
    public static SubLObject fire_forget(final SubLObject fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym187$FORGET, (SubLObject)rkf_collaborator_fire.$kw186$FACT, fact);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 20557L)
    public static SubLObject fire_retrieve_cycl(final SubLObject cycl_query, SubLObject number, SubLObject fsession) {
        if (number == rkf_collaborator_fire.UNPROVIDED) {
            number = (SubLObject)rkf_collaborator_fire.$kw182$ALL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = cycl_expression_to_kqml_expression(cycl_query);
        thread.resetMultipleValues();
        final SubLObject answers = fire_retrieve(query, number, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_collaborator_fire.NIL != answers && rkf_collaborator_fire.NIL == status) {
            return kqml_expression_to_cycl_expression(answers);
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 21026L)
    public static SubLObject fire_store_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_store(fact, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 21219L)
    public static SubLObject fire_forget_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_forget(fact, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 21414L)
    public static SubLObject fire_load_meld_file(final SubLObject filename, SubLObject auto_flushP, SubLObject fsession) {
        if (auto_flushP == rkf_collaborator_fire.UNPROVIDED) {
            auto_flushP = (SubLObject)rkf_collaborator_fire.T;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym188$LOAD_MELD_FILE, (SubLObject)rkf_collaborator_fire.$kw179$FILE, filename);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 21825L)
    public static SubLObject fire_load_flat_file(final SubLObject filename, final SubLObject legacyP, SubLObject auto_flushP, SubLObject fsession) {
        if (auto_flushP == rkf_collaborator_fire.UNPROVIDED) {
            auto_flushP = (SubLObject)rkf_collaborator_fire.T;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym189$LOAD_FLAT_FILE, (SubLObject)rkf_collaborator_fire.$kw179$FILE, filename, (SubLObject)rkf_collaborator_fire.$kw190$LEGACY_, legacyP);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 22229L)
    public static SubLObject fire_ask(final SubLObject query, SubLObject number, SubLObject fsession) {
        if (number == rkf_collaborator_fire.UNPROVIDED) {
            number = (SubLObject)rkf_collaborator_fire.$kw182$ALL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)((number == rkf_collaborator_fire.$kw191$SUPPRESS) ? ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym192$ASK, (SubLObject)rkf_collaborator_fire.$kw184$QUERY, query) : ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym192$ASK, (SubLObject)rkf_collaborator_fire.$kw184$QUERY, query, (SubLObject)rkf_collaborator_fire.$kw193$NUMBER, number));
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 22693L)
    public static SubLObject fire_tell(final SubLObject fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym194$TELL, (SubLObject)rkf_collaborator_fire.$kw186$FACT, fact);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 22897L)
    public static SubLObject fire_untell(final SubLObject fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym195$UNTELL, (SubLObject)rkf_collaborator_fire.$kw186$FACT, fact);
        SubLObject code = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject retval = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject response = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject ignore_errors_tag = (SubLObject)rkf_collaborator_fire.NIL;
        try {
            thread.throwStack.push(rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym162$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = (SubLObject)rkf_collaborator_fire.NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), (SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$kw163$PRIVATE);
                        if (rkf_collaborator_fire.NIL != subl_macro_promotions.validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession)) && rkf_collaborator_fire.NIL != channel) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name((SubLObject)rkf_collaborator_fire.$str164$unknown)), fire_session_machine(fsession), (SubLObject)rkf_collaborator_fire.$kw120$TELL, message);
                            response = kqml_read_message(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            if (rkf_collaborator_fire.NIL == response) {
                                retval = (SubLObject)rkf_collaborator_fire.NIL;
                                code = (SubLObject)rkf_collaborator_fire.$str165$Message_Error;
                            }
                            else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str166$tell, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                                    retval = content;
                                    code = (SubLObject)rkf_collaborator_fire.NIL;
                                }
                                else if (((performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str167$error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) || (performative.isSymbol() && rkf_collaborator_fire.NIL != Strings.string_equal(Symbols.symbol_name(performative), (SubLObject)rkf_collaborator_fire.$str168$tell_error, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED))) && rkf_collaborator_fire.NIL != content) {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = content;
                                }
                                else {
                                    retval = (SubLObject)rkf_collaborator_fire.NIL;
                                    code = PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str133$Unknown_response_type__A, performative);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_fire.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_collaborator_fire.NIL != channel) {
                                streams_high.close(channel, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_collaborator_fire.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_fire.$kw161$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(retval, code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 23104L)
    public static SubLObject fire_ask_cycl(final SubLObject cycl_query, SubLObject number, SubLObject fsession) {
        if (number == rkf_collaborator_fire.UNPROVIDED) {
            number = (SubLObject)rkf_collaborator_fire.$kw182$ALL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = cycl_expression_to_kqml_expression(cycl_query);
        thread.resetMultipleValues();
        final SubLObject answers = fire_ask(query, number, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_collaborator_fire.NIL != answers && rkf_collaborator_fire.NIL == status) {
            return kqml_expression_to_cycl_expression(answers);
        }
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 23588L)
    public static SubLObject fire_tell_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_tell(fact, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 23778L)
    public static SubLObject fire_untell_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_untell(fact, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 24162L)
    public static SubLObject make_fire_analogy_of_terms(final SubLObject term_a, final SubLObject term_b, final SubLObject mt, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        SubLObject matcher_fns = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject results = (SubLObject)rkf_collaborator_fire.NIL;
        make_fire_case_for_term(term_a, mt, (SubLObject)rkf_collaborator_fire.$kw120$TELL, fsession);
        make_fire_case_for_term(term_b, mt, (SubLObject)rkf_collaborator_fire.$kw120$TELL, fsession);
        matcher_fns = fire_perform_match_between(term_a, term_b, fsession);
        SubLObject cdolist_list_var;
        matcher_fns = (cdolist_list_var = fire_extract_matcher_functions(matcher_fns));
        SubLObject matcher_function = (SubLObject)rkf_collaborator_fire.NIL;
        matcher_function = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            final SubLObject raw_correspondences = fire_determine_correspondences_for_match(matcher_function, fsession);
            final SubLObject correspondences = fire_align_matched_correspondences(raw_correspondences);
            final SubLObject raw_inferences = fire_find_candidate_inferences_for_match(matcher_function, fsession);
            final SubLObject inferences = fire_extract_candidate_inferences(raw_inferences);
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$kw196$CORRESPONDENCES, correspondences), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$kw197$INFERENCES, inferences)), results);
            cdolist_list_var = cdolist_list_var.rest();
            matcher_function = cdolist_list_var.first();
        }
        fire_trace_analogy_sme(term_a, term_b, mt, matcher_fns, fsession);
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 25272L)
    public static SubLObject fire_trace_analogy_sme(final SubLObject term_a, final SubLObject term_b, final SubLObject mt, final SubLObject matcher_fns, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_collaborator_fire.NIL != rkf_collaborator_fire.$rkf_fire_trace_analogy$.getDynamicValue(thread)) {
            final SubLObject path = fire_session_kb_path(fsession);
            final SubLObject prefix = Sequences.cconcatenate(kb_paths.fort_name(term_a), new SubLObject[] { rkf_collaborator_fire.$str198$_, kb_paths.fort_name(term_b), rkf_collaborator_fire.$str198$_, kb_paths.fort_name(mt) });
            SubLObject cdolist_list_var = matcher_fns;
            SubLObject matcher = (SubLObject)rkf_collaborator_fire.NIL;
            matcher = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = matcher;
                SubLObject function = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject id = (SubLObject)rkf_collaborator_fire.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list199);
                function = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list199);
                id = current.first();
                current = current.rest();
                if (rkf_collaborator_fire.NIL == current) {
                    final SubLObject matcher_id = id;
                    final SubLObject filename = Sequences.cconcatenate(path, new SubLObject[] { prefix, string_utilities.to_string(matcher_id) });
                    fire_dump_sme(matcher_id, filename, fsession);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list199);
                }
                cdolist_list_var = cdolist_list_var.rest();
                matcher = cdolist_list_var.first();
            }
        }
        return fsession;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 25992L)
    public static SubLObject make_fire_case_for_term(final SubLObject v_term, final SubLObject mt, SubLObject style, SubLObject fsession) {
        if (style == rkf_collaborator_fire.UNPROVIDED) {
            style = (SubLObject)rkf_collaborator_fire.$kw120$TELL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject v_case = generate_fire_case_term(v_term);
        SubLObject cdolist_list_var;
        final SubLObject statements = cdolist_list_var = rkf_concept_summarizer.rkf_summarize_all(v_term, mt);
        SubLObject view = (SubLObject)rkf_collaborator_fire.NIL;
        view = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            final SubLObject aspect = view.first();
            SubLObject cdolist_list_var_$16;
            final SubLObject formulas = cdolist_list_var_$16 = conses_high.second(view);
            SubLObject formula = (SubLObject)rkf_collaborator_fire.NIL;
            formula = cdolist_list_var_$16.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var_$16) {
                final SubLObject full_formula;
                final SubLObject el_formula = full_formula = generate_true_el_formula(formula);
                final SubLObject cycl_fact = (SubLObject)ConsesLow.list(rkf_collaborator_fire.$const200$ist_Information, v_case, full_formula);
                make_fire_cycl_statement(cycl_fact, style, fsession);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                formula = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            view = cdolist_list_var.first();
        }
        if (rkf_collaborator_fire.NIL != statements) {
            final SubLObject case_expr = (SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, v_case, (SubLObject)rkf_collaborator_fire.$sym201$Case);
            make_fire_cycl_statement(case_expr, style, fsession);
        }
        return v_case;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 27035L)
    public static SubLObject make_fire_cycl_statement(final SubLObject cycl_expr, SubLObject style, SubLObject fsession) {
        if (style == rkf_collaborator_fire.UNPROVIDED) {
            style = (SubLObject)rkf_collaborator_fire.$kw120$TELL;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject pcase_var = style;
        if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw120$TELL)) {
            fire_tell_cycl(cycl_expr, fsession);
        }
        else if (pcase_var.eql((SubLObject)rkf_collaborator_fire.$kw202$STORE)) {
            fire_store_cycl(cycl_expr, fsession);
        }
        else {
            print_high.print(cycl_expr, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        return cycl_expr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 27385L)
    public static SubLObject generate_true_el_formula(final SubLObject pseudo_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
            assertion = czer_meta.find_assertion_cycl(pseudo_formula, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (rkf_collaborator_fire.NIL == assertion) {
            return pseudo_formula;
        }
        if (assertion.isList()) {
            assertion = assertion.first();
        }
        return uncanonicalizer.assertion_el_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 27733L)
    public static SubLObject generate_term_id(final SubLObject v_term) {
        return (rkf_collaborator_fire.NIL != nart_handles.nart_p(v_term)) ? nart_handles.nart_id(v_term) : constants_high.constant_internal_id(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 27854L)
    public static SubLObject generate_term_name(final SubLObject v_term) {
        if (rkf_collaborator_fire.NIL != constant_handles.constant_p(v_term)) {
            return Sequences.cconcatenate(constants_high.constant_name(v_term), (SubLObject)rkf_collaborator_fire.$str198$_);
        }
        final SubLObject formula = narts_high.nart_el_formula(v_term);
        return Functions.apply((SubLObject)rkf_collaborator_fire.$sym88$CCONCATENATE, Mapping.mapcar((SubLObject)rkf_collaborator_fire.$sym205$GENERATE_TERM_NAME, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 28090L)
    public static SubLObject generate_fire_case_name(final SubLObject v_term) {
        final SubLObject suid = generate_term_id(v_term);
        final SubLObject name = generate_term_name(v_term);
        return PrintLow.format((SubLObject)rkf_collaborator_fire.NIL, (SubLObject)rkf_collaborator_fire.$str206$_A_D, name, suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 28264L)
    public static SubLObject generate_fire_case_term(final SubLObject v_term) {
        return Packages.intern(generate_fire_case_name(v_term), (SubLObject)rkf_collaborator_fire.$str207$CYC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 28515L)
    public static SubLObject fire_perform_match_between(final SubLObject term_a, final SubLObject term_b, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject case_a = generate_fire_case_term(term_a);
        final SubLObject case_b = generate_fire_case_term(term_b);
        return fire_perform_match_between_internal(case_a, case_b, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 28885L)
    public static SubLObject fire_perform_match_between_internal(final SubLObject case_a, final SubLObject case_b, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject case_fn_a = make_fire_casefn_statement(case_a);
        final SubLObject case_fn_b = make_fire_casefn_statement(case_b);
        final SubLObject match = (SubLObject)ConsesLow.list(rkf_collaborator_fire.$const209$matchBetween, case_fn_a, case_fn_b, rkf_collaborator_fire.$fire_server_nil$.getGlobalValue(), (SubLObject)rkf_collaborator_fire.$sym210$_MATCH);
        return fire_ask_cycl(match, (SubLObject)rkf_collaborator_fire.$kw191$SUPPRESS, fsession);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 29415L)
    public static SubLObject make_fire_casefn_statement(final SubLObject v_case) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_fire.$sym211$explicit_case_fn, v_case);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 29508L)
    public static SubLObject fire_enumerate_case(final SubLObject v_term, SubLObject stream, SubLObject fsession) {
        if (stream == rkf_collaborator_fire.UNPROVIDED) {
            stream = (SubLObject)rkf_collaborator_fire.T;
        }
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject v_case = generate_fire_case_term(v_term);
        print_high.print(fire_ask_cycl((SubLObject)ConsesLow.listS(rkf_collaborator_fire.$const4$isa, v_case, (SubLObject)rkf_collaborator_fire.$list212), (SubLObject)rkf_collaborator_fire.$kw182$ALL, fsession), stream);
        print_high.print(fire_ask_cycl((SubLObject)ConsesLow.listS(rkf_collaborator_fire.$const200$ist_Information, make_fire_casefn_statement(v_case), (SubLObject)rkf_collaborator_fire.$list212), (SubLObject)rkf_collaborator_fire.$kw182$ALL, fsession), (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 30036L)
    public static SubLObject fire_extract_matcher_functions(final SubLObject results) {
        SubLObject matcher_functions = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)rkf_collaborator_fire.NIL;
        result = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject predicate = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject case_a = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject case_b = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject the_nil = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject matcher_function = (SubLObject)rkf_collaborator_fire.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list213);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list213);
            case_a = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list213);
            case_b = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list213);
            the_nil = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list213);
            matcher_function = current.first();
            current = current.rest();
            if (rkf_collaborator_fire.NIL == current) {
                matcher_functions = (SubLObject)ConsesLow.cons(matcher_function, matcher_functions);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list213);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return matcher_functions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 30384L)
    public static SubLObject fire_determine_correspondences_for_match(final SubLObject matcher_function, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject query = (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym214$and, (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym215$bestMapping, matcher_function, (SubLObject)rkf_collaborator_fire.$list216), (SubLObject)rkf_collaborator_fire.$list217);
        SubLObject correspondences = (SubLObject)rkf_collaborator_fire.NIL;
        correspondences = fire_ask(query, (SubLObject)rkf_collaborator_fire.$kw191$SUPPRESS, fsession);
        return correspondences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 30942L)
    public static SubLObject fire_align_matched_correspondences(final SubLObject results) {
        SubLObject correspondences = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)rkf_collaborator_fire.NIL;
        result = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject and = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject mapping = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject has_correspondence = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject correspondence = (SubLObject)rkf_collaborator_fire.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list218);
            and = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list218);
            mapping = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list218);
            has_correspondence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list218);
            correspondence = current.first();
            current = current.rest();
            if (rkf_collaborator_fire.NIL == current) {
                SubLObject current_$18;
                final SubLObject datum_$17 = current_$18 = correspondence;
                SubLObject predicate = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject mnfn = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject expression_a = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject expression_b = (SubLObject)rkf_collaborator_fire.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)rkf_collaborator_fire.$list219);
                predicate = current_$18.first();
                current_$18 = current_$18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)rkf_collaborator_fire.$list219);
                mnfn = current_$18.first();
                current_$18 = current_$18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)rkf_collaborator_fire.$list219);
                expression_a = current_$18.first();
                current_$18 = current_$18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)rkf_collaborator_fire.$list219);
                expression_b = current_$18.first();
                current_$18 = current_$18.rest();
                if (rkf_collaborator_fire.NIL == current_$18) {
                    correspondences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(expression_a, expression_b), correspondences);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)rkf_collaborator_fire.$list219);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list218);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return kqml_expression_to_cycl_expression(correspondences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 31474L)
    public static SubLObject fire_find_candidate_inferences_for_match(final SubLObject matcher_function, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject query = (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym214$and, (SubLObject)ConsesLow.listS((SubLObject)rkf_collaborator_fire.$sym215$bestMapping, matcher_function, (SubLObject)rkf_collaborator_fire.$list216), (SubLObject)rkf_collaborator_fire.$list220);
        SubLObject inferences = (SubLObject)rkf_collaborator_fire.NIL;
        inferences = fire_ask(query, (SubLObject)rkf_collaborator_fire.$kw191$SUPPRESS, fsession);
        return inferences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 32025L)
    public static SubLObject fire_extract_candidate_inferences(final SubLObject results) {
        SubLObject inferences = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)rkf_collaborator_fire.NIL;
        result = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject and = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject mapping = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject candinf = (SubLObject)rkf_collaborator_fire.NIL;
            SubLObject content = (SubLObject)rkf_collaborator_fire.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list221);
            and = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list221);
            mapping = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list221);
            candinf = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_collaborator_fire.$list221);
            content = current.first();
            current = current.rest();
            if (rkf_collaborator_fire.NIL == current) {
                SubLObject current_$20;
                final SubLObject datum_$19 = current_$20 = content;
                SubLObject predicate = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject cifn = (SubLObject)rkf_collaborator_fire.NIL;
                SubLObject expression = (SubLObject)rkf_collaborator_fire.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)rkf_collaborator_fire.$list222);
                predicate = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)rkf_collaborator_fire.$list222);
                cifn = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)rkf_collaborator_fire.$list222);
                expression = current_$20.first();
                current_$20 = current_$20.rest();
                if (rkf_collaborator_fire.NIL == current_$20) {
                    inferences = (SubLObject)ConsesLow.cons(expression, inferences);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$19, (SubLObject)rkf_collaborator_fire.$list222);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_fire.$list221);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return kqml_expression_to_cycl_expression(inferences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 32444L)
    public static SubLObject determine_missing_fire_terms(final SubLObject formulas, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLObject terms = list_utilities.tree_gather(formulas, (SubLObject)rkf_collaborator_fire.$sym223$FORT_P, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
        SubLObject missing = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_collaborator_fire.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var) {
            if (rkf_collaborator_fire.NIL != is_undefined_in_fireP(v_term, fsession)) {
                missing = (SubLObject)ConsesLow.cons(v_term, missing);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return missing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 32936L)
    public static SubLObject is_undefined_in_fireP(final SubLObject v_term, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = (SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, v_term, (SubLObject)rkf_collaborator_fire.$sym224$_WHAT);
        thread.resetMultipleValues();
        final SubLObject v_answer = fire_ask_cycl(query, (SubLObject)rkf_collaborator_fire.$kw182$ALL, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Types.sublisp_null(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 33251L)
    public static SubLObject missing_term_classifier(SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicates = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject collections = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject v_instances = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject functions = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject v_term;
        SubLObject cdolist_list_var;
        SubLObject sub_terms;
        SubLObject sub;
        SubLObject item_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        for (v_term = terms.first(), terms = terms.rest(); rkf_collaborator_fire.NIL != v_term; v_term = terms.first(), terms = terms.rest()) {
            if (rkf_collaborator_fire.NIL != nart_handles.nart_p(v_term)) {
                sub_terms = (cdolist_list_var = list_utilities.flatten(narts_high.nart_el_formula(v_term)));
                sub = (SubLObject)rkf_collaborator_fire.NIL;
                sub = cdolist_list_var.first();
                while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                    item_var = sub;
                    if (rkf_collaborator_fire.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)rkf_collaborator_fire.EQL), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var, terms);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                }
            }
            _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
                if (rkf_collaborator_fire.NIL != fort_types_interface.predicateP(v_term)) {
                    predicates = (SubLObject)ConsesLow.cons(v_term, predicates);
                }
                else if (rkf_collaborator_fire.NIL != isa.isaP(v_term, rkf_collaborator_fire.$const225$FunctionalPredicate, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED) || rkf_collaborator_fire.NIL != isa.isaP(v_term, rkf_collaborator_fire.$const226$Function_Denotational, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED)) {
                    functions = (SubLObject)ConsesLow.cons(v_term, functions);
                }
                else if (rkf_collaborator_fire.NIL != fort_types_interface.collectionP(v_term)) {
                    collections = (SubLObject)ConsesLow.cons(v_term, collections);
                }
                else {
                    v_instances = (SubLObject)ConsesLow.cons(v_term, v_instances);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(rkf_collaborator_fire.$const226$Function_Denotational, functions), (SubLObject)ConsesLow.cons(rkf_collaborator_fire.$const227$Predicate, predicates), (SubLObject)ConsesLow.cons(rkf_collaborator_fire.$const7$Collection, collections), (SubLObject)ConsesLow.cons(rkf_collaborator_fire.$const4$isa, v_instances));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 34208L)
    public static SubLObject tell_fire_about_a_predicate(final SubLObject pred, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arity = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject type = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(pred, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            SubLObject instance = (SubLObject)rkf_collaborator_fire.NIL;
            instance = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                type = (SubLObject)ConsesLow.cons(instance, type);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
            v_arity = arity.arity(pred);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const228$arity, pred, v_arity), fsession);
        SubLObject cdolist_list_var2 = type;
        SubLObject item = (SubLObject)rkf_collaborator_fire.NIL;
        item = cdolist_list_var2.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var2) {
            fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, pred, item), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 34695L)
    public static SubLObject tell_fire_about_a_function(final SubLObject func, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(func, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            SubLObject instance = (SubLObject)rkf_collaborator_fire.NIL;
            instance = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                types = (SubLObject)ConsesLow.cons(instance, types);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = types;
        SubLObject type = (SubLObject)rkf_collaborator_fire.NIL;
        type = cdolist_list_var2.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var2) {
            fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, func, type), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type = cdolist_list_var2.first();
        }
        return func;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 35088L)
    public static SubLObject tell_fire_about_a_collection(final SubLObject col, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isas = (SubLObject)rkf_collaborator_fire.NIL;
        SubLObject cols = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(col, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            SubLObject instance = (SubLObject)rkf_collaborator_fire.NIL;
            instance = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                isas = (SubLObject)ConsesLow.cons(instance, isas);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
            isas = (SubLObject)ConsesLow.cons(rkf_collaborator_fire.$const7$Collection, isas);
            final SubLObject collections = cdolist_list_var = genls.min_genls(col, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            SubLObject collection = (SubLObject)rkf_collaborator_fire.NIL;
            collection = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                cols = (SubLObject)ConsesLow.cons(collection, cols);
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = isas;
        SubLObject v_isa = (SubLObject)rkf_collaborator_fire.NIL;
        v_isa = cdolist_list_var2.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var2) {
            fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, col, v_isa), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_isa = cdolist_list_var2.first();
        }
        cdolist_list_var2 = cols;
        SubLObject a_col = (SubLObject)rkf_collaborator_fire.NIL;
        a_col = cdolist_list_var2.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var2) {
            fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const229$genls, col, a_col), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            a_col = cdolist_list_var2.first();
        }
        return col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-fire.lisp", position = 35720L)
    public static SubLObject tell_fire_about_an_instance(final SubLObject v_term, SubLObject fsession) {
        if (fsession == rkf_collaborator_fire.UNPROVIDED) {
            fsession = rkf_collaborator_fire.$current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)rkf_collaborator_fire.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_collaborator_fire.$sym203$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_collaborator_fire.$const204$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(v_term, (SubLObject)rkf_collaborator_fire.UNPROVIDED, (SubLObject)rkf_collaborator_fire.UNPROVIDED);
            SubLObject instance = (SubLObject)rkf_collaborator_fire.NIL;
            instance = cdolist_list_var.first();
            while (rkf_collaborator_fire.NIL != cdolist_list_var) {
                types = (SubLObject)ConsesLow.cons(instance, types);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = types;
        SubLObject type = (SubLObject)rkf_collaborator_fire.NIL;
        type = cdolist_list_var2.first();
        while (rkf_collaborator_fire.NIL != cdolist_list_var2) {
            fire_tell_cycl((SubLObject)ConsesLow.list(rkf_collaborator_fire.$const4$isa, v_term, type), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type = cdolist_list_var2.first();
        }
        return v_term;
    }
    
    public static SubLObject declare_rkf_collaborator_fire_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cycl_to_mac_fac", "CYCL-TO-MAC-FAC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_to_cycl", "MAC-FAC-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_to_cycl_recursive", "MAC-FAC-TO-CYCL-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cycl_to_mac_fac_transform_isa", "CYCL-TO-MAC-FAC-TRANSFORM-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cycl_to_mac_fac_transform_isa_test", "CYCL-TO-MAC-FAC-TRANSFORM-ISA-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cycl_to_mac_fac_transform_isa_act", "CYCL-TO-MAC-FAC-TRANSFORM-ISA-ACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_to_cycl_transform_unary", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_to_cycl_transform_unary_test", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_to_cycl_transform_unary_act", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY-ACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "clear_cyc_constant_to_mac_fac_term", "CLEAR-CYC-CONSTANT-TO-MAC-FAC-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "remove_cyc_constant_to_mac_fac_term", "REMOVE-CYC-CONSTANT-TO-MAC-FAC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cyc_constant_to_mac_fac_term_internal", "CYC-CONSTANT-TO-MAC-FAC-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cyc_constant_to_mac_fac_term", "CYC-CONSTANT-TO-MAC-FAC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "clear_mac_fac_term_to_cyc_term", "CLEAR-MAC-FAC-TERM-TO-CYC-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "remove_mac_fac_term_to_cyc_term", "REMOVE-MAC-FAC-TERM-TO-CYC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_term_to_cyc_term_internal", "MAC-FAC-TERM-TO-CYC-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_term_to_cyc_term", "MAC-FAC-TERM-TO-CYC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cyc_name_to_mac_fac_name", "CYC-NAME-TO-MAC-FAC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "mac_fac_name_to_cyc_name", "MAC-FAC-NAME-TO-CYC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_send_message", "KQML-SEND-MESSAGE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_read_message", "KQML-READ-MESSAGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_read_char", "KQML-READ-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_trace", "KQML-TRACE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_print_function_trampoline", "KQML-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_p", "KQML-OBJECT-P", 1, 0, false);
        new $kqml_object_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_performative", "KQML-OBJECT-PERFORMATIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_sender", "KQML-OBJECT-SENDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_receiver", "KQML-OBJECT-RECEIVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_from", "KQML-OBJECT-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_to", "KQML-OBJECT-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_in_reply_to", "KQML-OBJECT-IN-REPLY-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_reply_with", "KQML-OBJECT-REPLY-WITH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_language", "KQML-OBJECT-LANGUAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_ontology", "KQML-OBJECT-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_object_content", "KQML-OBJECT-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_performative", "_CSETF-KQML-OBJECT-PERFORMATIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_sender", "_CSETF-KQML-OBJECT-SENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_receiver", "_CSETF-KQML-OBJECT-RECEIVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_from", "_CSETF-KQML-OBJECT-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_to", "_CSETF-KQML-OBJECT-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_in_reply_to", "_CSETF-KQML-OBJECT-IN-REPLY-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_reply_with", "_CSETF-KQML-OBJECT-REPLY-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_language", "_CSETF-KQML-OBJECT-LANGUAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_ontology", "_CSETF-KQML-OBJECT-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_kqml_object_content", "_CSETF-KQML-OBJECT-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_kqml_object", "MAKE-KQML-OBJECT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "visit_defstruct_kqml_object", "VISIT-DEFSTRUCT-KQML-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "visit_defstruct_object_kqml_object_method", "VISIT-DEFSTRUCT-OBJECT-KQML-OBJECT-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_collaborator_fire", "performative_equal", "PERFORMATIVE-EQUAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_build_message", "KQML-BUILD-MESSAGE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_list_to_message", "KQML-LIST-TO-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_message_to_string", "KQML-MESSAGE-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_string_to_message", "KQML-STRING-TO-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "create_kqml_read_table", "CREATE-KQML-READ-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "read_from_kqml_string", "READ-FROM-KQML-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_frob_string", "KQML-FROB-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_print_message", "KQML-PRINT-MESSAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "cycl_expression_to_kqml_expression", "CYCL-EXPRESSION-TO-KQML-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_expression_to_cycl_expression", "KQML-EXPRESSION-TO-CYCL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "is_potential_nat_expressionP", "IS-POTENTIAL-NAT-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "kqml_nat_expression_to_nat", "KQML-NAT-EXPRESSION-TO-NAT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_collaborator_fire", "with_fire_connection", "WITH-FIRE-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_print_function_trampoline", "FIRE-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_p", "FIRE-SESSION-P", 1, 0, false);
        new $fire_session_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_machine", "FIRE-SESSION-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_port", "FIRE-SESSION-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_kb_path", "FIRE-SESSION-KB-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_kb_name", "FIRE-SESSION-KB-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_session_predstyle", "FIRE-SESSION-PREDSTYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_fire_session_machine", "_CSETF-FIRE-SESSION-MACHINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_fire_session_port", "_CSETF-FIRE-SESSION-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_fire_session_kb_path", "_CSETF-FIRE-SESSION-KB-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_fire_session_kb_name", "_CSETF-FIRE-SESSION-KB-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "_csetf_fire_session_predstyle", "_CSETF-FIRE-SESSION-PREDSTYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_fire_session", "MAKE-FIRE-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "visit_defstruct_fire_session", "VISIT-DEFSTRUCT-FIRE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "visit_defstruct_object_fire_session_method", "VISIT-DEFSTRUCT-OBJECT-FIRE-SESSION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "create_fire_session", "CREATE-FIRE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "local_fire_session", "LOCAL-FIRE-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_kill_server", "FIRE-KILL-SERVER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_open_kb", "FIRE-OPEN-KB", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_close_kb", "FIRE-CLOSE-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_new_kb", "FIRE-NEW-KB", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_flush", "FIRE-FLUSH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_dump_sme", "FIRE-DUMP-SME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_start_session", "FIRE-START-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_end_session", "FIRE-END-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_retrieve", "FIRE-RETRIEVE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_store", "FIRE-STORE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_forget", "FIRE-FORGET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_retrieve_cycl", "FIRE-RETRIEVE-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_store_cycl", "FIRE-STORE-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_forget_cycl", "FIRE-FORGET-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_load_meld_file", "FIRE-LOAD-MELD-FILE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_load_flat_file", "FIRE-LOAD-FLAT-FILE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_ask", "FIRE-ASK", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_tell", "FIRE-TELL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_untell", "FIRE-UNTELL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_ask_cycl", "FIRE-ASK-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_tell_cycl", "FIRE-TELL-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_untell_cycl", "FIRE-UNTELL-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_fire_analogy_of_terms", "MAKE-FIRE-ANALOGY-OF-TERMS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_trace_analogy_sme", "FIRE-TRACE-ANALOGY-SME", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_fire_case_for_term", "MAKE-FIRE-CASE-FOR-TERM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_fire_cycl_statement", "MAKE-FIRE-CYCL-STATEMENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "generate_true_el_formula", "GENERATE-TRUE-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "generate_term_id", "GENERATE-TERM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "generate_term_name", "GENERATE-TERM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "generate_fire_case_name", "GENERATE-FIRE-CASE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "generate_fire_case_term", "GENERATE-FIRE-CASE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_perform_match_between", "FIRE-PERFORM-MATCH-BETWEEN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_perform_match_between_internal", "FIRE-PERFORM-MATCH-BETWEEN-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "make_fire_casefn_statement", "MAKE-FIRE-CASEFN-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_enumerate_case", "FIRE-ENUMERATE-CASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_extract_matcher_functions", "FIRE-EXTRACT-MATCHER-FUNCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_determine_correspondences_for_match", "FIRE-DETERMINE-CORRESPONDENCES-FOR-MATCH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_align_matched_correspondences", "FIRE-ALIGN-MATCHED-CORRESPONDENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_find_candidate_inferences_for_match", "FIRE-FIND-CANDIDATE-INFERENCES-FOR-MATCH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "fire_extract_candidate_inferences", "FIRE-EXTRACT-CANDIDATE-INFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "determine_missing_fire_terms", "DETERMINE-MISSING-FIRE-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "is_undefined_in_fireP", "IS-UNDEFINED-IN-FIRE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "missing_term_classifier", "MISSING-TERM-CLASSIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "tell_fire_about_a_predicate", "TELL-FIRE-ABOUT-A-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "tell_fire_about_a_function", "TELL-FIRE-ABOUT-A-FUNCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "tell_fire_about_a_collection", "TELL-FIRE-ABOUT-A-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_fire", "tell_fire_about_an_instance", "TELL-FIRE-ABOUT-AN-INSTANCE", 1, 1, false);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    public static SubLObject init_rkf_collaborator_fire_file() {
        rkf_collaborator_fire.$cyc_constant_to_mac_fac_term_caching_state$ = SubLFiles.deflexical("*CYC-CONSTANT-TO-MAC-FAC-TERM-CACHING-STATE*", (SubLObject)rkf_collaborator_fire.NIL);
        rkf_collaborator_fire.$mac_fac_term_to_cyc_term_caching_state$ = SubLFiles.deflexical("*MAC-FAC-TERM-TO-CYC-TERM-CACHING-STATE*", (SubLObject)rkf_collaborator_fire.NIL);
        rkf_collaborator_fire.$kqml_end_message_char$ = SubLFiles.defparameter("*KQML-END-MESSAGE-CHAR*", Characters.code_char((SubLObject)rkf_collaborator_fire.FOURTEEN_INTEGER));
        rkf_collaborator_fire.$kqml_default_read_timeout$ = SubLFiles.deflexical("*KQML-DEFAULT-READ-TIMEOUT*", Numbers.multiply((SubLObject)rkf_collaborator_fire.$int16$60, (SubLObject)rkf_collaborator_fire.THREE_INTEGER));
        rkf_collaborator_fire.$kqml_trace$ = SubLFiles.defparameter("*KQML-TRACE*", (SubLObject)rkf_collaborator_fire.T);
        rkf_collaborator_fire.$dtp_kqml_object$ = SubLFiles.defconstant("*DTP-KQML-OBJECT*", (SubLObject)rkf_collaborator_fire.$sym20$KQML_OBJECT);
        rkf_collaborator_fire.$kqml_read_table$ = SubLFiles.deflexical("*KQML-READ-TABLE*", create_kqml_read_table());
        rkf_collaborator_fire.$kmql_package_prefixes$ = SubLFiles.defparameter("*KMQL-PACKAGE-PREFIXES*", (SubLObject)rkf_collaborator_fire.$list91);
        rkf_collaborator_fire.$dtp_fire_session$ = SubLFiles.defconstant("*DTP-FIRE-SESSION*", (SubLObject)rkf_collaborator_fire.$sym136$FIRE_SESSION);
        rkf_collaborator_fire.$current_fire_session$ = SubLFiles.deflexical("*CURRENT-FIRE-SESSION*", (SubLObject)(maybeDefault((SubLObject)rkf_collaborator_fire.$sym159$_CURRENT_FIRE_SESSION_, rkf_collaborator_fire.$current_fire_session$, rkf_collaborator_fire.NIL)));
        rkf_collaborator_fire.$rkf_fire_trace_analogy$ = SubLFiles.defparameter("*RKF-FIRE-TRACE-ANALOGY*", (SubLObject)rkf_collaborator_fire.NIL);
        rkf_collaborator_fire.$fire_server_nil$ = SubLFiles.defconstant("*FIRE-SERVER-NIL*", Packages.intern((SubLObject)rkf_collaborator_fire.$str208$nil, (SubLObject)rkf_collaborator_fire.$str207$CYC));
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    public static SubLObject setup_rkf_collaborator_fire_file() {
        memoization_state.note_globally_cached_function((SubLObject)rkf_collaborator_fire.$sym1$CYC_CONSTANT_TO_MAC_FAC_TERM);
        memoization_state.note_globally_cached_function((SubLObject)rkf_collaborator_fire.$sym10$MAC_FAC_TERM_TO_CYC_TERM);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_collaborator_fire.$dtp_kqml_object$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym27$KQML_OBJECT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_collaborator_fire.$list28);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym29$KQML_OBJECT_PERFORMATIVE, (SubLObject)rkf_collaborator_fire.$sym30$_CSETF_KQML_OBJECT_PERFORMATIVE);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym31$KQML_OBJECT_SENDER, (SubLObject)rkf_collaborator_fire.$sym32$_CSETF_KQML_OBJECT_SENDER);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym33$KQML_OBJECT_RECEIVER, (SubLObject)rkf_collaborator_fire.$sym34$_CSETF_KQML_OBJECT_RECEIVER);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym35$KQML_OBJECT_FROM, (SubLObject)rkf_collaborator_fire.$sym36$_CSETF_KQML_OBJECT_FROM);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym37$KQML_OBJECT_TO, (SubLObject)rkf_collaborator_fire.$sym38$_CSETF_KQML_OBJECT_TO);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym39$KQML_OBJECT_IN_REPLY_TO, (SubLObject)rkf_collaborator_fire.$sym40$_CSETF_KQML_OBJECT_IN_REPLY_TO);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym41$KQML_OBJECT_REPLY_WITH, (SubLObject)rkf_collaborator_fire.$sym42$_CSETF_KQML_OBJECT_REPLY_WITH);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym43$KQML_OBJECT_LANGUAGE, (SubLObject)rkf_collaborator_fire.$sym44$_CSETF_KQML_OBJECT_LANGUAGE);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym45$KQML_OBJECT_ONTOLOGY, (SubLObject)rkf_collaborator_fire.$sym46$_CSETF_KQML_OBJECT_ONTOLOGY);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym47$KQML_OBJECT_CONTENT, (SubLObject)rkf_collaborator_fire.$sym48$_CSETF_KQML_OBJECT_CONTENT);
        Equality.identity((SubLObject)rkf_collaborator_fire.$sym20$KQML_OBJECT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_collaborator_fire.$dtp_kqml_object$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym63$VISIT_DEFSTRUCT_OBJECT_KQML_OBJECT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_collaborator_fire.$dtp_fire_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym142$FIRE_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_collaborator_fire.$list143);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym114$FIRE_SESSION_MACHINE, (SubLObject)rkf_collaborator_fire.$sym144$_CSETF_FIRE_SESSION_MACHINE);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym115$FIRE_SESSION_PORT, (SubLObject)rkf_collaborator_fire.$sym145$_CSETF_FIRE_SESSION_PORT);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym146$FIRE_SESSION_KB_PATH, (SubLObject)rkf_collaborator_fire.$sym147$_CSETF_FIRE_SESSION_KB_PATH);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym148$FIRE_SESSION_KB_NAME, (SubLObject)rkf_collaborator_fire.$sym149$_CSETF_FIRE_SESSION_KB_NAME);
        Structures.def_csetf((SubLObject)rkf_collaborator_fire.$sym150$FIRE_SESSION_PREDSTYLE, (SubLObject)rkf_collaborator_fire.$sym151$_CSETF_FIRE_SESSION_PREDSTYLE);
        Equality.identity((SubLObject)rkf_collaborator_fire.$sym136$FIRE_SESSION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_collaborator_fire.$dtp_fire_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_fire.$sym158$VISIT_DEFSTRUCT_OBJECT_FIRE_SESSION_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_collaborator_fire.$sym159$_CURRENT_FIRE_SESSION_);
        return (SubLObject)rkf_collaborator_fire.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_collaborator_fire_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_collaborator_fire_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_collaborator_fire_file();
    }
    
    static {
        me = (SubLFile)new rkf_collaborator_fire();
        rkf_collaborator_fire.$cyc_constant_to_mac_fac_term_caching_state$ = null;
        rkf_collaborator_fire.$mac_fac_term_to_cyc_term_caching_state$ = null;
        rkf_collaborator_fire.$kqml_end_message_char$ = null;
        rkf_collaborator_fire.$kqml_default_read_timeout$ = null;
        rkf_collaborator_fire.$kqml_trace$ = null;
        rkf_collaborator_fire.$dtp_kqml_object$ = null;
        rkf_collaborator_fire.$kqml_read_table$ = null;
        rkf_collaborator_fire.$kmql_package_prefixes$ = null;
        rkf_collaborator_fire.$dtp_fire_session$ = null;
        rkf_collaborator_fire.$current_fire_session$ = null;
        rkf_collaborator_fire.$rkf_fire_trace_analogy$ = null;
        rkf_collaborator_fire.$fire_server_nil$ = null;
        $sym0$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym1$CYC_CONSTANT_TO_MAC_FAC_TERM = SubLObjectFactory.makeSymbol("CYC-CONSTANT-TO-MAC-FAC-TERM");
        $sym2$CYCL_TO_MAC_FAC_TRANSFORM_ISA_TEST = SubLObjectFactory.makeSymbol("CYCL-TO-MAC-FAC-TRANSFORM-ISA-TEST");
        $sym3$CYCL_TO_MAC_FAC_TRANSFORM_ISA_ACT = SubLObjectFactory.makeSymbol("CYCL-TO-MAC-FAC-TRANSFORM-ISA-ACT");
        $const4$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym5$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_TEST = SubLObjectFactory.makeSymbol("MAC-FAC-TO-CYCL-TRANSFORM-UNARY-TEST");
        $sym6$MAC_FAC_TO_CYCL_TRANSFORM_UNARY_ACT = SubLObjectFactory.makeSymbol("MAC-FAC-TO-CYCL-TRANSFORM-UNARY-ACT");
        $const7$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym8$_CYC_CONSTANT_TO_MAC_FAC_TERM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CYC-CONSTANT-TO-MAC-FAC-TERM-CACHING-STATE*");
        $int9$100 = SubLObjectFactory.makeInteger(100);
        $sym10$MAC_FAC_TERM_TO_CYC_TERM = SubLObjectFactory.makeSymbol("MAC-FAC-TERM-TO-CYC-TERM");
        $sym11$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym12$_MAC_FAC_TERM_TO_CYC_TERM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAC-FAC-TERM-TO-CYC-TERM-CACHING-STATE*");
        $sym13$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw14$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str15$__KQML_SEND___S = SubLObjectFactory.makeString("~%KQML SEND: ~S");
        $int16$60 = SubLObjectFactory.makeInteger(60);
        $kw17$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str18$__KQML_READ___S = SubLObjectFactory.makeString("~%KQML READ: ~S");
        $str19$__KQML_READ_TIMEOUT___S = SubLObjectFactory.makeString("~%KQML READ TIMEOUT: ~S");
        $sym20$KQML_OBJECT = SubLObjectFactory.makeSymbol("KQML-OBJECT");
        $sym21$KQML_OBJECT_P = SubLObjectFactory.makeSymbol("KQML-OBJECT-P");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PERFORMATIVE"), SubLObjectFactory.makeSymbol("SENDER"), SubLObjectFactory.makeSymbol("RECEIVER"), SubLObjectFactory.makeSymbol("FROM"), SubLObjectFactory.makeSymbol("TO"), SubLObjectFactory.makeSymbol("IN-REPLY-TO"), SubLObjectFactory.makeSymbol("REPLY-WITH"), SubLObjectFactory.makeSymbol("LANGUAGE"), SubLObjectFactory.makeSymbol("ONTOLOGY"), SubLObjectFactory.makeSymbol("CONTENT") });
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PERFORMATIVE"), SubLObjectFactory.makeKeyword("SENDER"), SubLObjectFactory.makeKeyword("RECEIVER"), SubLObjectFactory.makeKeyword("FROM"), SubLObjectFactory.makeKeyword("TO"), SubLObjectFactory.makeKeyword("IN-REPLY-TO"), SubLObjectFactory.makeKeyword("REPLY-WITH"), SubLObjectFactory.makeKeyword("LANGUAGE"), SubLObjectFactory.makeKeyword("ONTOLOGY"), SubLObjectFactory.makeKeyword("CONTENT") });
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("KQML-OBJECT-PERFORMATIVE"), SubLObjectFactory.makeSymbol("KQML-OBJECT-SENDER"), SubLObjectFactory.makeSymbol("KQML-OBJECT-RECEIVER"), SubLObjectFactory.makeSymbol("KQML-OBJECT-FROM"), SubLObjectFactory.makeSymbol("KQML-OBJECT-TO"), SubLObjectFactory.makeSymbol("KQML-OBJECT-IN-REPLY-TO"), SubLObjectFactory.makeSymbol("KQML-OBJECT-REPLY-WITH"), SubLObjectFactory.makeSymbol("KQML-OBJECT-LANGUAGE"), SubLObjectFactory.makeSymbol("KQML-OBJECT-ONTOLOGY"), SubLObjectFactory.makeSymbol("KQML-OBJECT-CONTENT") });
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-PERFORMATIVE"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-SENDER"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-RECEIVER"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-FROM"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-TO"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-IN-REPLY-TO"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-REPLY-WITH"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-LANGUAGE"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-ONTOLOGY"), SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-CONTENT") });
        $sym26$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym27$KQML_OBJECT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KQML-OBJECT-PRINT-FUNCTION-TRAMPOLINE");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KQML-OBJECT-P"));
        $sym29$KQML_OBJECT_PERFORMATIVE = SubLObjectFactory.makeSymbol("KQML-OBJECT-PERFORMATIVE");
        $sym30$_CSETF_KQML_OBJECT_PERFORMATIVE = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-PERFORMATIVE");
        $sym31$KQML_OBJECT_SENDER = SubLObjectFactory.makeSymbol("KQML-OBJECT-SENDER");
        $sym32$_CSETF_KQML_OBJECT_SENDER = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-SENDER");
        $sym33$KQML_OBJECT_RECEIVER = SubLObjectFactory.makeSymbol("KQML-OBJECT-RECEIVER");
        $sym34$_CSETF_KQML_OBJECT_RECEIVER = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-RECEIVER");
        $sym35$KQML_OBJECT_FROM = SubLObjectFactory.makeSymbol("KQML-OBJECT-FROM");
        $sym36$_CSETF_KQML_OBJECT_FROM = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-FROM");
        $sym37$KQML_OBJECT_TO = SubLObjectFactory.makeSymbol("KQML-OBJECT-TO");
        $sym38$_CSETF_KQML_OBJECT_TO = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-TO");
        $sym39$KQML_OBJECT_IN_REPLY_TO = SubLObjectFactory.makeSymbol("KQML-OBJECT-IN-REPLY-TO");
        $sym40$_CSETF_KQML_OBJECT_IN_REPLY_TO = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-IN-REPLY-TO");
        $sym41$KQML_OBJECT_REPLY_WITH = SubLObjectFactory.makeSymbol("KQML-OBJECT-REPLY-WITH");
        $sym42$_CSETF_KQML_OBJECT_REPLY_WITH = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-REPLY-WITH");
        $sym43$KQML_OBJECT_LANGUAGE = SubLObjectFactory.makeSymbol("KQML-OBJECT-LANGUAGE");
        $sym44$_CSETF_KQML_OBJECT_LANGUAGE = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-LANGUAGE");
        $sym45$KQML_OBJECT_ONTOLOGY = SubLObjectFactory.makeSymbol("KQML-OBJECT-ONTOLOGY");
        $sym46$_CSETF_KQML_OBJECT_ONTOLOGY = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-ONTOLOGY");
        $sym47$KQML_OBJECT_CONTENT = SubLObjectFactory.makeSymbol("KQML-OBJECT-CONTENT");
        $sym48$_CSETF_KQML_OBJECT_CONTENT = SubLObjectFactory.makeSymbol("_CSETF-KQML-OBJECT-CONTENT");
        $kw49$PERFORMATIVE = SubLObjectFactory.makeKeyword("PERFORMATIVE");
        $kw50$SENDER = SubLObjectFactory.makeKeyword("SENDER");
        $kw51$RECEIVER = SubLObjectFactory.makeKeyword("RECEIVER");
        $kw52$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw53$TO = SubLObjectFactory.makeKeyword("TO");
        $kw54$IN_REPLY_TO = SubLObjectFactory.makeKeyword("IN-REPLY-TO");
        $kw55$REPLY_WITH = SubLObjectFactory.makeKeyword("REPLY-WITH");
        $kw56$LANGUAGE = SubLObjectFactory.makeKeyword("LANGUAGE");
        $kw57$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $str58$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw59$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym60$MAKE_KQML_OBJECT = SubLObjectFactory.makeSymbol("MAKE-KQML-OBJECT");
        $kw61$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw62$END = SubLObjectFactory.makeKeyword("END");
        $sym63$VISIT_DEFSTRUCT_OBJECT_KQML_OBJECT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KQML-OBJECT-METHOD");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $sym65$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym66$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $sym67$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $str68$from = SubLObjectFactory.makeString("from");
        $str69$to = SubLObjectFactory.makeString("to");
        $str70$in_reply_to = SubLObjectFactory.makeString("in-reply-to");
        $str71$reply_with = SubLObjectFactory.makeString("reply-with");
        $str72$language = SubLObjectFactory.makeString("language");
        $str73$ontology = SubLObjectFactory.makeString("ontology");
        $str74$content = SubLObjectFactory.makeString("content");
        $sym75$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERFORMATIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SENDER-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENDER"), (SubLObject)SubLObjectFactory.makeSymbol("RECEIVER-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RECEIVER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-KEYS"));
        $str77$_ = SubLObjectFactory.makeString("(");
        $str78$__SENDER_ = SubLObjectFactory.makeString(" :SENDER ");
        $str79$__RECEIVER_ = SubLObjectFactory.makeString(" :RECEIVER ");
        $str80$__FROM_ = SubLObjectFactory.makeString(" :FROM ");
        $str81$__TO_ = SubLObjectFactory.makeString(" :TO ");
        $str82$__IN_REPLY_TO_ = SubLObjectFactory.makeString(" :IN-REPLY-TO ");
        $str83$__REPLY_WITH_ = SubLObjectFactory.makeString(" :REPLY-WITH ");
        $str84$__LANGUAGE_ = SubLObjectFactory.makeString(" :LANGUAGE ");
        $str85$__ONTOLOGY_ = SubLObjectFactory.makeString(" :ONTOLOGY ");
        $str86$__CONTENT_ = SubLObjectFactory.makeString(" :CONTENT ");
        $str87$_ = SubLObjectFactory.makeString(")");
        $sym88$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $str89$Message__S_couldn_t_be_parsed = SubLObjectFactory.makeString("Message ~S couldn't be parsed");
        $kw90$PRESERVE = SubLObjectFactory.makeKeyword("PRESERVE");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("COMMON-LISP-USER::"));
        $str92$ = SubLObjectFactory.makeString("");
        $str93$__KQML_message___ = SubLObjectFactory.makeString("~%KQML message:~%");
        $str94$__A__ = SubLObjectFactory.makeString("(~A~%");
        $str95$______sender_______A__ = SubLObjectFactory.makeString("     :sender      ~A~%");
        $str96$______receiver_____A__ = SubLObjectFactory.makeString("     :receiver    ~A~%");
        $str97$______from_________A__ = SubLObjectFactory.makeString("     :from        ~A~%");
        $str98$______to___________A__ = SubLObjectFactory.makeString("     :to          ~A~%");
        $str99$______in_reply_to__A__ = SubLObjectFactory.makeString("     :in-reply-to ~A~%");
        $str100$______language_____A__ = SubLObjectFactory.makeString("     :language    ~A~%");
        $str101$______ontology_____A__ = SubLObjectFactory.makeString("     :ontology    ~A~%");
        $str102$______content______A___ = SubLObjectFactory.makeString("     :content     ~A)~%");
        $const103$ReifiableFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiableFunction"));
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHANNEL"), (SubLObject)SubLObjectFactory.makeSymbol("SESSION"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym105$RESPONSE = SubLObjectFactory.makeUninternedSymbol("RESPONSE");
        $sym106$PERFORMATIVE = SubLObjectFactory.makeUninternedSymbol("PERFORMATIVE");
        $sym107$CONTENT = SubLObjectFactory.makeUninternedSymbol("CONTENT");
        $sym108$RETVAL = SubLObjectFactory.makeUninternedSymbol("RETVAL");
        $sym109$CODE = SubLObjectFactory.makeUninternedSymbol("CODE");
        $sym110$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list111 = ConsesLow.list((SubLObject)rkf_collaborator_fire.NIL);
        $sym112$IGNORE_ERRORS = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $sym113$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $sym114$FIRE_SESSION_MACHINE = SubLObjectFactory.makeSymbol("FIRE-SESSION-MACHINE");
        $sym115$FIRE_SESSION_PORT = SubLObjectFactory.makeSymbol("FIRE-SESSION-PORT");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $sym117$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym118$KQML_SEND_MESSAGE = SubLObjectFactory.makeSymbol("KQML-SEND-MESSAGE");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NETWORK-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MACHINE-NAME"), (SubLObject)SubLObjectFactory.makeString("unknown")));
        $kw120$TELL = SubLObjectFactory.makeKeyword("TELL");
        $sym121$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KQML-READ-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CHANNEL")));
        $sym123$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym124$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Message Error"));
        $sym126$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym127$PERFORMATIVE_EQUAL = SubLObjectFactory.makeSymbol("PERFORMATIVE-EQUAL");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tell"));
        $sym129$COR = SubLObjectFactory.makeSymbol("COR");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("error"));
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tell-error"));
        $sym132$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str133$Unknown_response_type__A = SubLObjectFactory.makeString("Unknown response type ~A");
        $sym134$RET = SubLObjectFactory.makeSymbol("RET");
        $sym135$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym136$FIRE_SESSION = SubLObjectFactory.makeSymbol("FIRE-SESSION");
        $sym137$FIRE_SESSION_P = SubLObjectFactory.makeSymbol("FIRE-SESSION-P");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("KB-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("KB-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PREDSTYLE"));
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("KB-PATH"), (SubLObject)SubLObjectFactory.makeKeyword("KB-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PREDSTYLE"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-KB-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-KB-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-PREDSTYLE"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-KB-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-KB-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-PREDSTYLE"));
        $sym142$FIRE_SESSION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FIRE-SESSION-PRINT-FUNCTION-TRAMPOLINE");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIRE-SESSION-P"));
        $sym144$_CSETF_FIRE_SESSION_MACHINE = SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-MACHINE");
        $sym145$_CSETF_FIRE_SESSION_PORT = SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-PORT");
        $sym146$FIRE_SESSION_KB_PATH = SubLObjectFactory.makeSymbol("FIRE-SESSION-KB-PATH");
        $sym147$_CSETF_FIRE_SESSION_KB_PATH = SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-KB-PATH");
        $sym148$FIRE_SESSION_KB_NAME = SubLObjectFactory.makeSymbol("FIRE-SESSION-KB-NAME");
        $sym149$_CSETF_FIRE_SESSION_KB_NAME = SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-KB-NAME");
        $sym150$FIRE_SESSION_PREDSTYLE = SubLObjectFactory.makeSymbol("FIRE-SESSION-PREDSTYLE");
        $sym151$_CSETF_FIRE_SESSION_PREDSTYLE = SubLObjectFactory.makeSymbol("_CSETF-FIRE-SESSION-PREDSTYLE");
        $kw152$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw153$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw154$KB_PATH = SubLObjectFactory.makeKeyword("KB-PATH");
        $kw155$KB_NAME = SubLObjectFactory.makeKeyword("KB-NAME");
        $kw156$PREDSTYLE = SubLObjectFactory.makeKeyword("PREDSTYLE");
        $sym157$MAKE_FIRE_SESSION = SubLObjectFactory.makeSymbol("MAKE-FIRE-SESSION");
        $sym158$VISIT_DEFSTRUCT_OBJECT_FIRE_SESSION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FIRE-SESSION-METHOD");
        $sym159$_CURRENT_FIRE_SESSION_ = SubLObjectFactory.makeSymbol("*CURRENT-FIRE-SESSION*");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHUTDOWN-SERVER"));
        $kw161$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym162$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw163$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $str164$unknown = SubLObjectFactory.makeString("unknown");
        $str165$Message_Error = SubLObjectFactory.makeString("Message Error");
        $str166$tell = SubLObjectFactory.makeString("tell");
        $str167$error = SubLObjectFactory.makeString("error");
        $str168$tell_error = SubLObjectFactory.makeString("tell-error");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HYPHEN"), (SubLObject)SubLObjectFactory.makeKeyword("MIXED-CASE"));
        $str170$Invalid_predicate_style__S__ = SubLObjectFactory.makeString("Invalid predicate style ~S~%");
        $sym171$OPEN_KB = SubLObjectFactory.makeSymbol("OPEN-KB");
        $kw172$PATH = SubLObjectFactory.makeKeyword("PATH");
        $kw173$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw174$PREDICATE_STYLE = SubLObjectFactory.makeKeyword("PREDICATE-STYLE");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLOSE-KB"));
        $sym176$NEW_KB = SubLObjectFactory.makeSymbol("NEW-KB");
        $sym177$DUMP_SME = SubLObjectFactory.makeSymbol("DUMP-SME");
        $kw178$SME_ID = SubLObjectFactory.makeKeyword("SME-ID");
        $kw179$FILE = SubLObjectFactory.makeKeyword("FILE");
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-SESSION"));
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-SESSION"));
        $kw182$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym183$RETRIEVE = SubLObjectFactory.makeSymbol("RETRIEVE");
        $kw184$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym185$STORE = SubLObjectFactory.makeSymbol("STORE");
        $kw186$FACT = SubLObjectFactory.makeKeyword("FACT");
        $sym187$FORGET = SubLObjectFactory.makeSymbol("FORGET");
        $sym188$LOAD_MELD_FILE = SubLObjectFactory.makeSymbol("LOAD-MELD-FILE");
        $sym189$LOAD_FLAT_FILE = SubLObjectFactory.makeSymbol("LOAD-FLAT-FILE");
        $kw190$LEGACY_ = SubLObjectFactory.makeKeyword("LEGACY?");
        $kw191$SUPPRESS = SubLObjectFactory.makeKeyword("SUPPRESS");
        $sym192$ASK = SubLObjectFactory.makeSymbol("ASK");
        $kw193$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $sym194$TELL = SubLObjectFactory.makeSymbol("TELL");
        $sym195$UNTELL = SubLObjectFactory.makeSymbol("UNTELL");
        $kw196$CORRESPONDENCES = SubLObjectFactory.makeKeyword("CORRESPONDENCES");
        $kw197$INFERENCES = SubLObjectFactory.makeKeyword("INFERENCES");
        $str198$_ = SubLObjectFactory.makeString("-");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $const200$ist_Information = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Information"));
        $sym201$Case = SubLObjectFactory.makeSymbol("Case");
        $kw202$STORE = SubLObjectFactory.makeKeyword("STORE");
        $sym203$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const204$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym205$GENERATE_TERM_NAME = SubLObjectFactory.makeSymbol("GENERATE-TERM-NAME");
        $str206$_A_D = SubLObjectFactory.makeString("~A~D");
        $str207$CYC = SubLObjectFactory.makeString("CYC");
        $str208$nil = SubLObjectFactory.makeString("nil");
        $const209$matchBetween = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("matchBetween"));
        $sym210$_MATCH = SubLObjectFactory.makeSymbol("?MATCH");
        $sym211$explicit_case_fn = SubLObjectFactory.makeSymbol("explicit-case-fn");
        $list212 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT")));
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-A"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-B"), (SubLObject)SubLObjectFactory.makeSymbol("THE-NIL"), (SubLObject)SubLObjectFactory.makeSymbol("MATCHER-FUNCTION"));
        $sym214$and = SubLObjectFactory.makeSymbol("and");
        $sym215$bestMapping = SubLObjectFactory.makeSymbol("bestMapping");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?M"));
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("hasCorrespondence"), (SubLObject)SubLObjectFactory.makeSymbol("?M"), (SubLObject)SubLObjectFactory.makeSymbol("?MH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("correspondenceBetween"), (SubLObject)SubLObjectFactory.makeSymbol("?MH"), (SubLObject)SubLObjectFactory.makeSymbol("?B"), (SubLObject)SubLObjectFactory.makeSymbol("?T")));
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AND"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPING"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-CORRESPONDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CORRESPONDENCE"));
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("MNFN"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-A"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-B"));
        $list220 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("candidateInferenceOf"), (SubLObject)SubLObjectFactory.makeSymbol("?CI"), (SubLObject)SubLObjectFactory.makeSymbol("?M")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("candidateInferenceContent"), (SubLObject)SubLObjectFactory.makeSymbol("?CI"), (SubLObject)SubLObjectFactory.makeSymbol("?INFERENCE")));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AND"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPING"), (SubLObject)SubLObjectFactory.makeSymbol("CANDINF"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"));
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CIFN"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym223$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym224$_WHAT = SubLObjectFactory.makeSymbol("?WHAT");
        $const225$FunctionalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionalPredicate"));
        $const226$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $const227$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const228$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $const229$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
    }
    
    public static final class $kqml_object_native extends SubLStructNative
    {
        public SubLObject $performative;
        public SubLObject $sender;
        public SubLObject $receiver;
        public SubLObject $from;
        public SubLObject $to;
        public SubLObject $in_reply_to;
        public SubLObject $reply_with;
        public SubLObject $language;
        public SubLObject $ontology;
        public SubLObject $content;
        private static final SubLStructDeclNative structDecl;
        
        public $kqml_object_native() {
            this.$performative = (SubLObject)CommonSymbols.NIL;
            this.$sender = (SubLObject)CommonSymbols.NIL;
            this.$receiver = (SubLObject)CommonSymbols.NIL;
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
            this.$in_reply_to = (SubLObject)CommonSymbols.NIL;
            this.$reply_with = (SubLObject)CommonSymbols.NIL;
            this.$language = (SubLObject)CommonSymbols.NIL;
            this.$ontology = (SubLObject)CommonSymbols.NIL;
            this.$content = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kqml_object_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$performative;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$sender;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$receiver;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$from;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$to;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$in_reply_to;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$reply_with;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$language;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$ontology;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$content;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$performative = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$sender = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$receiver = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$from = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$to = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$in_reply_to = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$reply_with = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$language = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$ontology = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$content = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kqml_object_native.class, rkf_collaborator_fire.$sym20$KQML_OBJECT, rkf_collaborator_fire.$sym21$KQML_OBJECT_P, rkf_collaborator_fire.$list22, rkf_collaborator_fire.$list23, new String[] { "$performative", "$sender", "$receiver", "$from", "$to", "$in_reply_to", "$reply_with", "$language", "$ontology", "$content" }, rkf_collaborator_fire.$list24, rkf_collaborator_fire.$list25, rkf_collaborator_fire.$sym26$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $kqml_object_p$UnaryFunction extends UnaryFunction
    {
        public $kqml_object_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KQML-OBJECT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_collaborator_fire.kqml_object_p(arg1);
        }
    }
    
    public static final class $fire_session_native extends SubLStructNative
    {
        public SubLObject $machine;
        public SubLObject $port;
        public SubLObject $kb_path;
        public SubLObject $kb_name;
        public SubLObject $predstyle;
        private static final SubLStructDeclNative structDecl;
        
        public $fire_session_native() {
            this.$machine = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$kb_path = (SubLObject)CommonSymbols.NIL;
            this.$kb_name = (SubLObject)CommonSymbols.NIL;
            this.$predstyle = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fire_session_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$machine;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$port;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$kb_path;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$kb_name;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$predstyle;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$machine = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$kb_path = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$kb_name = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$predstyle = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fire_session_native.class, rkf_collaborator_fire.$sym136$FIRE_SESSION, rkf_collaborator_fire.$sym137$FIRE_SESSION_P, rkf_collaborator_fire.$list138, rkf_collaborator_fire.$list139, new String[] { "$machine", "$port", "$kb_path", "$kb_name", "$predstyle" }, rkf_collaborator_fire.$list140, rkf_collaborator_fire.$list141, rkf_collaborator_fire.$sym26$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $fire_session_p$UnaryFunction extends UnaryFunction
    {
        public $fire_session_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FIRE-SESSION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_collaborator_fire.fire_session_p(arg1);
        }
    }
}

/*

	Total time: 1108 ms
	
*/
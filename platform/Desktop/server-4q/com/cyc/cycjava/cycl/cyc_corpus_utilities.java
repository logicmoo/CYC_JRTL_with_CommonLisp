package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_corpus_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_corpus_utilities";
    public static final String myFingerPrint = "5f849433fca50fee5203dba496dc0db8880f1e5705369d7aa91a154d1112c546";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 1626L)
    private static SubLSymbol $cyc_corpus_client_host$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 1828L)
    private static SubLSymbol $cyc_corpus_client_port$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 2387L)
    private static SubLSymbol $cyc_corpus_client$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9734L)
    private static SubLSymbol $cyc_corpus_dump_task$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$_CYC_CORPUS_CLIENT_HOST_;
    private static final SubLString $str2$ir_cyc_com;
    private static final SubLSymbol $kw3$PARAMETER;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$_CYC_CORPUS_CLIENT_PORT_;
    private static final SubLInteger $int6$6666;
    private static final SubLSymbol $sym7$TCP_CLIENT;
    private static final SubLSymbol $sym8$SET_HOST;
    private static final SubLSymbol $sym9$SET_PORT;
    private static final SubLSymbol $sym10$STRINGP;
    private static final SubLSymbol $sym11$INTEGERP;
    private static final SubLSymbol $sym12$CYC_IR_CLIENT_INTERACTION;
    private static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym14$SET_KEY;
    private static final SubLSymbol $sym15$SET_VALUE;
    private static final SubLSymbol $sym16$BUILD_ANSWER;
    private static final SubLSymbol $sym17$PERFORM_REQUEST;
    private static final SubLSymbol $sym18$REQUEST_STRING;
    private static final SubLSymbol $sym19$GET_ANSWER;
    private static final SubLInteger $int20$100;
    private static final SubLSymbol $sym21$SET_SEARCH_STRING;
    private static final SubLSymbol $sym22$SET_HITNUM;
    private static final SubLSymbol $sym23$OBJECT;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$ANSWER;
    private static final SubLSymbol $sym26$HIT_NUMBER;
    private static final SubLSymbol $sym27$SEARCH_STRING;
    private static final SubLSymbol $sym28$VALUE;
    private static final SubLSymbol $sym29$KEY;
    private static final SubLSymbol $sym30$INSTANCE_COUNT;
    private static final SubLSymbol $sym31$INDEX_DIRECTIVE_TAG;
    private static final SubLString $str32$index;
    private static final SubLSymbol $sym33$SEARCH_DIRECTIVE_TAG;
    private static final SubLString $str34$search;
    private static final SubLSymbol $sym35$SUBL_DIRECTIVE_TAG;
    private static final SubLString $str36$SubL;
    private static final SubLSymbol $sym37$QUERY_TAG;
    private static final SubLString $str38$request;
    private static final SubLSymbol $sym39$QUERY_TYPE_ATTR;
    private static final SubLString $str40$type;
    private static final SubLSymbol $sym41$QUERY_LANGUAGE_ATTR;
    private static final SubLString $str42$language;
    private static final SubLSymbol $sym43$INDEX_TAG;
    private static final SubLString $str44$to_index;
    private static final SubLSymbol $sym45$INDEX_TARGET_ATTR;
    private static final SubLString $str46$target;
    private static final SubLSymbol $sym47$HITNUM_ATTR;
    private static final SubLString $str48$hitnum;
    private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS;
    private static final SubLSymbol $sym50$ISOLATED_P;
    private static final SubLSymbol $sym51$INSTANCE_NUMBER;
    private static final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE;
    private static final SubLSymbol $sym53$INITIALIZE;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLString $str74$_a_is_not_a_positive_integer;
    private static final SubLSymbol $sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym78$XML_WRITER;
    private static final SubLSymbol $sym79$SET_STREAM;
    private static final SubLSymbol $sym80$START_TAG;
    private static final SubLSymbol $sym81$XML_PRINT;
    private static final SubLSymbol $sym82$END_TAG;
    private static final SubLSymbol $sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD;
    private static final SubLString $str87$mapping_Cyc_FORTs;
    private static final SubLSymbol $kw88$SKIP;
    private static final SubLString $str89$__Couldn_t_index__S;
    private static final SubLSymbol $kw90$DONE;
    private static final SubLInteger $int91$300;
    private static final SubLString $str92$_S_is_not_an_existing_directory;
    private static final SubLString $str93$_A_corpus_dump;
    private static final SubLSymbol $sym94$ALL_TERMS_INDEX_FILES_TO_DIR;
    private static final SubLSymbol $sym95$FORT_P;
    private static final SubLString $str96$;
    private static final SubLSymbol $sym97$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const98$EverythingPSC;
    private static final SubLString $str99$_;
    private static final SubLInteger $int100$999;
    private static final SubLSymbol $sym101$DICTIONARY_P;
    private static final SubLInteger $int102$250;
    private static final SubLString $str103$_S;
    private static final SubLInteger $int104$47;
    private static final SubLString $str105$_;
    private static final SubLString $str106$_;
    private static final SubLString $str107$_;
    private static final SubLString $str108$_;
    private static final SubLString $str109$_op_;
    private static final SubLString $str110$_;
    private static final SubLString $str111$_cp_;
    private static final SubLString $str112$_;
    private static final SubLSymbol $kw113$APPEND;
    private static final SubLString $str114$Unable_to_open__S;
    private static final SubLString $str115$_____S;
    private static final SubLString $str116$mapping_Cyc_constants;
    private static final SubLString $str117$mapping_Cyc_NARTs;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 2519L)
    public static SubLObject get_cyc_corpus_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_corpus_utilities.NIL == cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread) && cyc_corpus_utilities.$cyc_corpus_client_host$.getDynamicValue(thread).isString() && cyc_corpus_utilities.$cyc_corpus_client_port$.getDynamicValue(thread).isInteger()) {
            cyc_corpus_utilities.$cyc_corpus_client$.setDynamicValue(object.new_class_instance((SubLObject)cyc_corpus_utilities.$sym7$TCP_CLIENT), thread);
            methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread), (SubLObject)cyc_corpus_utilities.$sym8$SET_HOST, cyc_corpus_utilities.$cyc_corpus_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread), (SubLObject)cyc_corpus_utilities.$sym9$SET_PORT, cyc_corpus_utilities.$cyc_corpus_client_port$.getDynamicValue(thread));
        }
        return cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 3034L)
    public static SubLObject reset_cyc_corpus_client(final SubLObject host, final SubLObject port) {
        assert cyc_corpus_utilities.NIL != Types.stringp(host) : host;
        assert cyc_corpus_utilities.NIL != Types.integerp(port) : port;
        cyc_corpus_utilities.$cyc_corpus_client$.setDynamicValue((SubLObject)cyc_corpus_utilities.NIL);
        cyc_corpus_utilities.$cyc_corpus_client_host$.setDynamicValue(host);
        cyc_corpus_utilities.$cyc_corpus_client_port$.setDynamicValue(port);
        return (SubLObject)cyc_corpus_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 3268L)
    public static SubLObject add_to_cyc_corpus_index(final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION);
        SubLObject result = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject error = (SubLObject)cyc_corpus_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym14$SET_KEY, key);
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym15$SET_VALUE, value);
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym16$BUILD_ANSWER, methods.funcall_instance_method_with_1_args(get_cyc_corpus_client(), (SubLObject)cyc_corpus_utilities.$sym17$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, (SubLObject)cyc_corpus_utilities.$sym18$REQUEST_STRING)));
                    result = methods.funcall_instance_method_with_0_args(interaction, (SubLObject)cyc_corpus_utilities.$sym19$GET_ANSWER);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cyc_corpus_utilities.NIL);
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
        if (cyc_corpus_utilities.NIL == error || cyc_corpus_utilities.NIL != get_cyc_corpus_client()) {}
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 4583L)
    public static SubLObject lookup_cyc_corpus_index(final SubLObject string_to_look_up, SubLObject number_of_hits) {
        if (number_of_hits == cyc_corpus_utilities.UNPROVIDED) {
            number_of_hits = (SubLObject)cyc_corpus_utilities.$int20$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION);
        SubLObject results = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject error = (SubLObject)cyc_corpus_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym21$SET_SEARCH_STRING, string_to_look_up);
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym22$SET_HITNUM, number_of_hits);
                    methods.funcall_instance_method_with_1_args(interaction, (SubLObject)cyc_corpus_utilities.$sym16$BUILD_ANSWER, methods.funcall_instance_method_with_1_args(get_cyc_corpus_client(), (SubLObject)cyc_corpus_utilities.$sym17$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, (SubLObject)cyc_corpus_utilities.$sym18$REQUEST_STRING)));
                    results = methods.funcall_instance_method_with_0_args(interaction, (SubLObject)cyc_corpus_utilities.$sym19$GET_ANSWER);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cyc_corpus_utilities.NIL);
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
        if (cyc_corpus_utilities.NIL == error || cyc_corpus_utilities.NIL != get_cyc_corpus_client()) {}
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.FIVE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym25$ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, (SubLObject)cyc_corpus_utilities.FIVE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym25$ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.FOUR_INTEGER, (SubLObject)cyc_corpus_utilities.$sym26$HIT_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, (SubLObject)cyc_corpus_utilities.FOUR_INTEGER, (SubLObject)cyc_corpus_utilities.$sym26$HIT_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.THREE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym27$SEARCH_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, (SubLObject)cyc_corpus_utilities.THREE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym27$SEARCH_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.TWO_INTEGER, (SubLObject)cyc_corpus_utilities.$sym28$VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, (SubLObject)cyc_corpus_utilities.TWO_INTEGER, (SubLObject)cyc_corpus_utilities.$sym28$VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.ONE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym29$KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, (SubLObject)cyc_corpus_utilities.ONE_INTEGER, (SubLObject)cyc_corpus_utilities.$sym29$KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.NINE_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.NINE_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.EIGHT_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.EIGHT_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.SEVEN_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.SEVEN_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.SIX_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.SIX_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.FIVE_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.FIVE_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.FOUR_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.FOUR_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.THREE_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.THREE_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.TWO_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.TWO_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject get_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject set_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(cyc_ir_client_interaction.isSymbol() ? classes.classes_retrieve_class(cyc_ir_client_interaction) : ((cyc_corpus_utilities.NIL != subloop_structures.class_p(cyc_ir_client_interaction)) ? cyc_ir_client_interaction : ((cyc_corpus_utilities.NIL != subloop_structures.instance_p(cyc_ir_client_interaction)) ? subloop_structures.instance_class(cyc_ir_client_interaction) : cyc_corpus_utilities.NIL)));
        if (cyc_corpus_utilities.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)cyc_corpus_utilities.ONE_INTEGER, value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym23$OBJECT, (SubLObject)cyc_corpus_utilities.$sym30$INSTANCE_COUNT, (SubLObject)cyc_corpus_utilities.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym31$INDEX_DIRECTIVE_TAG, (SubLObject)cyc_corpus_utilities.$str32$index);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym33$SEARCH_DIRECTIVE_TAG, (SubLObject)cyc_corpus_utilities.$str34$search);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym35$SUBL_DIRECTIVE_TAG, (SubLObject)cyc_corpus_utilities.$str36$SubL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym37$QUERY_TAG, (SubLObject)cyc_corpus_utilities.$str38$request);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym39$QUERY_TYPE_ATTR, (SubLObject)cyc_corpus_utilities.$str40$type);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym41$QUERY_LANGUAGE_ATTR, (SubLObject)cyc_corpus_utilities.$str42$language);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym43$INDEX_TAG, (SubLObject)cyc_corpus_utilities.$str44$to_index);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym45$INDEX_TARGET_ATTR, (SubLObject)cyc_corpus_utilities.$str46$target);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym47$HITNUM_ATTR, (SubLObject)cyc_corpus_utilities.$str48$hitnum);
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym23$OBJECT, (SubLObject)cyc_corpus_utilities.$sym50$ISOLATED_P, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym23$OBJECT, (SubLObject)cyc_corpus_utilities.$sym51$INSTANCE_NUMBER, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym29$KEY, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym28$VALUE, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym27$SEARCH_STRING, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym26$HIT_NUMBER, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym25$ANSWER, (SubLObject)cyc_corpus_utilities.NIL);
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 5863L)
    public static SubLObject cyc_ir_client_interaction_p(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_instanceof_class(cyc_ir_client_interaction, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7421L)
    public static SubLObject cyc_ir_client_interaction_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7531L)
    public static SubLObject cyc_ir_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject v_answer = get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = (SubLObject)cyc_corpus_utilities.NIL;
                SubLObject error = (SubLObject)cyc_corpus_utilities.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = reader.read_from_string(response_string, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)cyc_corpus_utilities.NIL);
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
                if (cyc_corpus_utilities.NIL != error) {
                    Errors.warn(error);
                    Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                }
                v_answer = response;
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_answer(self, v_answer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, (SubLObject)cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 7941L)
    public static SubLObject cyc_ir_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject key = get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert cyc_corpus_utilities.NIL != Types.stringp(v_object) : v_object;
                key = v_object;
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_key(self, key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8081L)
    public static SubLObject cyc_ir_client_interaction_set_value_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject value = get_cyc_ir_client_interaction_value(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert cyc_corpus_utilities.NIL != Types.stringp(v_object) : v_object;
                value = v_object;
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_value(self, value);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8225L)
    public static SubLObject cyc_ir_client_interaction_set_search_string_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject search_string = get_cyc_ir_client_interaction_search_string(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert cyc_corpus_utilities.NIL != Types.stringp(v_object) : v_object;
                search_string = v_object;
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_search_string(self, search_string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8385L)
    public static SubLObject cyc_ir_client_interaction_set_hitnum_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject hit_number = get_cyc_ir_client_interaction_hit_number(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert cyc_corpus_utilities.NIL != Types.integerp(v_object) : v_object;
                if (cyc_corpus_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_object.numG((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                    Errors.error((SubLObject)cyc_corpus_utilities.$str74$_a_is_not_a_positive_integer, v_object);
                }
                hit_number = v_object;
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 8596L)
    public static SubLObject cyc_ir_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        final SubLObject hitnum_attr = get_cyc_ir_client_interaction_hitnum_attr(self);
        final SubLObject index_target_attr = get_cyc_ir_client_interaction_index_target_attr(self);
        final SubLObject index_tag = get_cyc_ir_client_interaction_index_tag(self);
        final SubLObject query_language_attr = get_cyc_ir_client_interaction_query_language_attr(self);
        final SubLObject query_type_attr = get_cyc_ir_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_cyc_ir_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_cyc_ir_client_interaction_subl_directive_tag(self);
        final SubLObject search_directive_tag = get_cyc_ir_client_interaction_search_directive_tag(self);
        final SubLObject index_directive_tag = get_cyc_ir_client_interaction_index_directive_tag(self);
        final SubLObject hit_number = get_cyc_ir_client_interaction_hit_number(self);
        final SubLObject search_string = get_cyc_ir_client_interaction_search_string(self);
        final SubLObject value = get_cyc_ir_client_interaction_value(self);
        final SubLObject key = get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                final SubLObject outstream = streams_high.make_string_output_stream();
                final SubLObject v_xml_writer = object.new_class_instance((SubLObject)cyc_corpus_utilities.$sym78$XML_WRITER);
                final SubLObject query_type_tag = (cyc_corpus_utilities.NIL != search_string) ? search_directive_tag : index_directive_tag;
                SubLObject attributes = (SubLObject)ConsesLow.list(query_type_attr, query_type_tag, query_language_attr, subl_directive_tag);
                if (cyc_corpus_utilities.NIL != search_string) {
                    attributes = (SubLObject)ConsesLow.cons(hit_number, attributes);
                    attributes = (SubLObject)ConsesLow.cons(hitnum_attr, attributes);
                }
                methods.funcall_instance_method_with_1_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym79$SET_STREAM, outstream);
                methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym80$START_TAG, query_tag, attributes, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL);
                if (cyc_corpus_utilities.NIL != search_string) {
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym81$XML_PRINT, search_string, (SubLObject)cyc_corpus_utilities.NIL);
                }
                else {
                    methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym80$START_TAG, index_tag, (SubLObject)ConsesLow.list(index_target_attr, key), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym81$XML_PRINT, value, (SubLObject)cyc_corpus_utilities.NIL);
                    methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym82$END_TAG, index_tag, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL);
                }
                methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)cyc_corpus_utilities.$sym82$END_TAG, query_tag, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL);
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, streams_high.get_output_stream_string(outstream));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_hitnum_attr(self, hitnum_attr);
                    set_cyc_ir_client_interaction_index_target_attr(self, index_target_attr);
                    set_cyc_ir_client_interaction_index_tag(self, index_tag);
                    set_cyc_ir_client_interaction_query_language_attr(self, query_language_attr);
                    set_cyc_ir_client_interaction_query_type_attr(self, query_type_attr);
                    set_cyc_ir_client_interaction_query_tag(self, query_tag);
                    set_cyc_ir_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_cyc_ir_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_cyc_ir_client_interaction_index_directive_tag(self, index_directive_tag);
                    set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    set_cyc_ir_client_interaction_search_string(self, search_string);
                    set_cyc_ir_client_interaction_value(self, value);
                    set_cyc_ir_client_interaction_key(self, key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9641L)
    public static SubLObject cyc_ir_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = (SubLObject)cyc_corpus_utilities.NIL;
        final SubLObject v_answer = get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, v_answer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyc_ir_client_interaction_answer(self, v_answer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 9999L)
    public static SubLObject cyc_corpus_dump_complete_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_corpus_utilities.NIL == process_utilities.task_p(cyc_corpus_utilities.$cyc_corpus_dump_task$.getDynamicValue(thread))) {
            return (SubLObject)cyc_corpus_utilities.NIL;
        }
        final SubLObject status = process_utilities.task_completed(cyc_corpus_utilities.$cyc_corpus_dump_task$.getDynamicValue(thread));
        if (cyc_corpus_utilities.NIL != status) {
            cyc_corpus_utilities.$cyc_corpus_dump_task$.setDynamicValue((SubLObject)cyc_corpus_utilities.NIL, thread);
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 10415L)
    public static SubLObject all_terms_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)cyc_corpus_utilities.$str87$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_corpus_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_corpus_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_corpus_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)cyc_corpus_utilities.NIL;
                table_var = cdolist_list_var.first();
                while (cyc_corpus_utilities.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject idx_$1 = idx;
                        if (cyc_corpus_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                            final SubLObject backwardP_var = (SubLObject)cyc_corpus_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject error;
                            SubLObject _prev_bind_0_$2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyc_corpus_utilities.NIL, v_iteration = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER)) {
                                id = ((cyc_corpus_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(fort) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                                    if (cyc_corpus_utilities.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)cyc_corpus_utilities.$kw88$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    error = (SubLObject)cyc_corpus_utilities.NIL;
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term(fort);
                                            }
                                            catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, (SubLObject)cyc_corpus_utilities.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (cyc_corpus_utilities.NIL != error) {
                                        Errors.warn((SubLObject)cyc_corpus_utilities.$str89$__Couldn_t_index__S, fort);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$2 = idx;
                        if (cyc_corpus_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$2);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$2);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$2);
                            final SubLObject v_default = (SubLObject)((cyc_corpus_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) ? cyc_corpus_utilities.NIL : cyc_corpus_utilities.$kw88$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP) || cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    SubLObject error2 = (SubLObject)cyc_corpus_utilities.NIL;
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term(fort2);
                                            }
                                            catch (Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, (SubLObject)cyc_corpus_utilities.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var2) {
                                        error2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (cyc_corpus_utilities.NIL != error2) {
                                        Errors.warn((SubLObject)cyc_corpus_utilities.$str89$__Couldn_t_index__S, fort2);
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_corpus_utilities.$kw90$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 10877L)
    public static SubLObject all_terms_index_files_to_dir(final SubLObject corpus_dir, SubLObject module) {
        if (module == cyc_corpus_utilities.UNPROVIDED) {
            module = (SubLObject)cyc_corpus_utilities.$int91$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_corpus_utilities.NIL == Filesys.probe_file(corpus_dir) || cyc_corpus_utilities.NIL == Filesys.directory_p(corpus_dir)) {
            return Errors.warn((SubLObject)cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary((SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        final SubLObject message = (SubLObject)cyc_corpus_utilities.$str87$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_corpus_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_corpus_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_corpus_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)cyc_corpus_utilities.NIL;
                table_var = cdolist_list_var.first();
                while (cyc_corpus_utilities.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject idx_$6 = idx;
                        if (cyc_corpus_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                            final SubLObject backwardP_var = (SubLObject)cyc_corpus_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_term;
                            SubLObject error;
                            SubLObject _prev_bind_0_$7;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyc_corpus_utilities.NIL, v_iteration = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER)) {
                                id = ((cyc_corpus_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER) : v_iteration);
                                v_term = Vectors.aref(vector_var, id);
                                if (cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(v_term) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                                    if (cyc_corpus_utilities.NIL != id_index.id_index_tombstone_p(v_term)) {
                                        v_term = (SubLObject)cyc_corpus_utilities.$kw88$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                        Storage.gc_ephemeral();
                                    }
                                    error = (SubLObject)cyc_corpus_utilities.NIL;
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                            }
                                            catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, (SubLObject)cyc_corpus_utilities.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (cyc_corpus_utilities.NIL != error) {
                                        Errors.warn((SubLObject)cyc_corpus_utilities.$str89$__Couldn_t_index__S, v_term);
                                    }
                                    times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                }
                            }
                        }
                        final SubLObject idx_$7 = idx;
                        if (cyc_corpus_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                            final SubLObject v_default = (SubLObject)((cyc_corpus_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) ? cyc_corpus_utilities.NIL : cyc_corpus_utilities.$kw88$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject v_term2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP) || cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                        Storage.gc_ephemeral();
                                    }
                                    SubLObject error2 = (SubLObject)cyc_corpus_utilities.NIL;
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)cyc_corpus_utilities.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
                                            }
                                            catch (Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, (SubLObject)cyc_corpus_utilities.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var2) {
                                        error2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (cyc_corpus_utilities.NIL != error2) {
                                        Errors.warn((SubLObject)cyc_corpus_utilities.$str89$__Couldn_t_index__S, v_term2);
                                    }
                                    times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                }
                                id2 = Numbers.add(id2, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 11670L)
    public static SubLObject create_all_terms_index_files_to_dir_task(final SubLObject corpus_dir, SubLObject module) {
        if (module == cyc_corpus_utilities.UNPROVIDED) {
            module = (SubLObject)cyc_corpus_utilities.$int91$300;
        }
        final SubLObject task_name = PrintLow.format((SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$str93$_A_corpus_dump, control_vars.cyc_image_id());
        cyc_corpus_utilities.$cyc_corpus_dump_task$.setDynamicValue(process_utilities.new_task(task_name, (SubLObject)cyc_corpus_utilities.$sym94$ALL_TERMS_INDEX_FILES_TO_DIR, (SubLObject)ConsesLow.list(corpus_dir, module), (SubLObject)cyc_corpus_utilities.UNPROVIDED));
        return task_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 12525L)
    public static SubLObject cyc_corpus_index_term(final SubLObject v_term) {
        assert cyc_corpus_utilities.NIL != forts.fort_p(v_term) : v_term;
        final SubLObject index_key = kb_utilities.hl_external_id_string(v_term);
        final SubLObject index_value = cyc_corpus_build_index_body(v_term);
        if (!index_value.equal((SubLObject)cyc_corpus_utilities.$str96$)) {
            return add_to_cyc_corpus_index(index_key, index_value);
        }
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 14221L)
    public static SubLObject cyc_corpus_build_index_body(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cyc_corpus_utilities.NIL != forts.fort_p(v_term) : v_term;
        SubLObject index_body = (SubLObject)cyc_corpus_utilities.$str96$;
        final SubLObject generations = pph_methods_lexicon.all_phrases_for_term(v_term, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cyc_corpus_utilities.$sym97$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cyc_corpus_utilities.$const98$EverythingPSC, thread);
            final SubLObject term_comment = kb_accessors.comment(v_term, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
            final SubLObject term_cyclist_notes = kb_accessors.cyclist_notes(v_term, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
            if (term_comment.isString()) {
                index_body = Sequences.cconcatenate(index_body, term_comment);
            }
            SubLObject cdolist_list_var = term_cyclist_notes;
            SubLObject note = (SubLObject)cyc_corpus_utilities.NIL;
            note = cdolist_list_var.first();
            while (cyc_corpus_utilities.NIL != cdolist_list_var) {
                if (note.isString()) {
                    index_body = Sequences.cconcatenate(index_body, new SubLObject[] { cyc_corpus_utilities.$str99$_, note });
                }
                cdolist_list_var = cdolist_list_var.rest();
                note = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = generations;
        SubLObject phrase = (SubLObject)cyc_corpus_utilities.NIL;
        phrase = cdolist_list_var2.first();
        while (cyc_corpus_utilities.NIL != cdolist_list_var2) {
            if (phrase.isString()) {
                index_body = Sequences.cconcatenate(index_body, new SubLObject[] { cyc_corpus_utilities.$str99$_, phrase });
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            phrase = cdolist_list_var2.first();
        }
        index_body = string_utilities.strip_chars_meeting_test(index_body, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        return index_body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 15230L)
    public static SubLObject cyc_corpus_read_hits(final SubLObject lookup_string, SubLObject number_of_hits) {
        if (number_of_hits == cyc_corpus_utilities.UNPROVIDED) {
            number_of_hits = (SubLObject)cyc_corpus_utilities.$int20$100;
        }
        final SubLObject hits_list = lookup_cyc_corpus_index(lookup_string, number_of_hits);
        SubLObject hits_forts = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject cdolist_list_var = hits_list;
        SubLObject hit = (SubLObject)cyc_corpus_utilities.NIL;
        hit = cdolist_list_var.first();
        while (cyc_corpus_utilities.NIL != cdolist_list_var) {
            final SubLObject id_string = hit.isString() ? hit : PrintLow.write_to_string(hit, cyc_corpus_utilities.EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject fort = (SubLObject)((cyc_corpus_utilities.NIL != kb_utilities.hl_external_id_string_p(id_string)) ? kb_utilities.find_object_by_hl_external_id_string(id_string) : cyc_corpus_utilities.NIL);
            if (cyc_corpus_utilities.NIL != fort) {
                final SubLObject item_var = fort;
                if (cyc_corpus_utilities.NIL == conses_high.member(item_var, hits_forts, Symbols.symbol_function((SubLObject)cyc_corpus_utilities.EQL), Symbols.symbol_function((SubLObject)cyc_corpus_utilities.IDENTITY))) {
                    hits_forts = (SubLObject)ConsesLow.cons(item_var, hits_forts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            hit = cdolist_list_var.first();
        }
        return hits_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 15879L)
    public static SubLObject truncate_and_make_unique_file_name(final SubLObject file_name, final SubLObject registry, SubLObject ceiling) {
        if (ceiling == cyc_corpus_utilities.UNPROVIDED) {
            ceiling = (SubLObject)cyc_corpus_utilities.$int100$999;
        }
        assert cyc_corpus_utilities.NIL != Types.stringp(file_name) : file_name;
        assert cyc_corpus_utilities.NIL != dictionary.dictionary_p(registry) : registry;
        final SubLObject base = string_utilities.string_first_n((SubLObject)cyc_corpus_utilities.$int102$250, file_name);
        if (cyc_corpus_utilities.NIL == dictionary.dictionary_lookup(registry, base, (SubLObject)cyc_corpus_utilities.UNPROVIDED)) {
            dictionary.dictionary_enter(registry, base, (SubLObject)cyc_corpus_utilities.T);
            return base;
        }
        SubLObject done = (SubLObject)cyc_corpus_utilities.NIL;
        SubLObject result = (SubLObject)cyc_corpus_utilities.NIL;
        while (cyc_corpus_utilities.NIL == done) {
            final SubLObject suffix = PrintLow.format((SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$str103$_S, random.random(ceiling));
            result = Sequences.cconcatenate(base, suffix);
            if (cyc_corpus_utilities.NIL == dictionary.dictionary_lookup(registry, result, (SubLObject)cyc_corpus_utilities.UNPROVIDED)) {
                dictionary.dictionary_enter(registry, result, (SubLObject)cyc_corpus_utilities.T);
                done = (SubLObject)cyc_corpus_utilities.T;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 16988L)
    public static SubLObject index_file_name_for_term(final SubLObject v_term, final SubLObject path_prefix, SubLObject registry) {
        if (registry == cyc_corpus_utilities.UNPROVIDED) {
            registry = (SubLObject)cyc_corpus_utilities.NIL;
        }
        SubLObject filename = kb_paths.fort_name(v_term);
        final SubLObject stripped = string_utilities.strip_final_if_char(path_prefix, Characters.code_char((SubLObject)cyc_corpus_utilities.$int104$47));
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str105$_, (SubLObject)cyc_corpus_utilities.$str99$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str105$_, (SubLObject)cyc_corpus_utilities.$str106$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str105$_, (SubLObject)cyc_corpus_utilities.$str107$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str105$_, (SubLObject)cyc_corpus_utilities.$str108$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str109$_op_, (SubLObject)cyc_corpus_utilities.$str110$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        filename = string_utilities.string_substitute((SubLObject)cyc_corpus_utilities.$str111$_cp_, (SubLObject)cyc_corpus_utilities.$str112$_, filename, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        if (cyc_corpus_utilities.NIL != registry) {
            filename = truncate_and_make_unique_file_name(filename, registry, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        }
        filename = Sequences.cconcatenate(stripped, new SubLObject[] { cyc_corpus_utilities.$str106$_, filename });
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 17853L)
    public static SubLObject cyc_corpus_index_term_to_file(final SubLObject v_term, final SubLObject corpus_dir, SubLObject registry) {
        if (registry == cyc_corpus_utilities.UNPROVIDED) {
            registry = (SubLObject)cyc_corpus_utilities.NIL;
        }
        SubLObject written = (SubLObject)cyc_corpus_utilities.NIL;
        final SubLObject index_body = cyc_corpus_build_index_body(v_term);
        final SubLObject out_file = index_file_name_for_term(v_term, corpus_dir, registry);
        SubLObject stream = (SubLObject)cyc_corpus_utilities.NIL;
        try {
            stream = compatibility.open_text(out_file, (SubLObject)cyc_corpus_utilities.$kw113$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)cyc_corpus_utilities.$str114$Unable_to_open__S, out_file);
            }
            final SubLObject stream_$11 = stream;
            PrintLow.format(stream_$11, (SubLObject)cyc_corpus_utilities.$str103$_S, kb_utilities.hl_external_id_string(v_term));
            PrintLow.format(stream_$11, (SubLObject)cyc_corpus_utilities.$str115$_____S, index_body);
            written = (SubLObject)cyc_corpus_utilities.T;
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cyc_corpus_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return written;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 18743L)
    public static SubLObject all_constants_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == cyc_corpus_utilities.UNPROVIDED) {
            module = (SubLObject)cyc_corpus_utilities.$int91$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_corpus_utilities.NIL == Filesys.probe_file(corpus_dir) || cyc_corpus_utilities.NIL == Filesys.directory_p(corpus_dir)) {
            return Errors.warn((SubLObject)cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)cyc_corpus_utilities.$str116$mapping_Cyc_constants;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        assert cyc_corpus_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_corpus_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_corpus_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_corpus_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$12 = idx;
                if (cyc_corpus_utilities.NIL == id_index.id_index_objects_empty_p(idx_$12, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                    final SubLObject idx_$13 = idx_$12;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$13, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                        final SubLObject backwardP_var = (SubLObject)cyc_corpus_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyc_corpus_utilities.NIL, v_iteration = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER)) {
                            id = ((cyc_corpus_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER) : v_iteration);
                            constant = Vectors.aref(vector_var, id);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(constant) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                                if (cyc_corpus_utilities.NIL != id_index.id_index_tombstone_p(constant)) {
                                    constant = (SubLObject)cyc_corpus_utilities.$kw88$SKIP;
                                }
                                if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(constant, corpus_dir, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
                                times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$14 = idx_$12;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$14) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$14);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$14);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$14);
                        final SubLObject v_default = (SubLObject)((cyc_corpus_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) ? cyc_corpus_utilities.NIL : cyc_corpus_utilities.$kw88$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP) || cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(constant2)) {
                                if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(constant2, corpus_dir, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
                                times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 19347L)
    public static SubLObject all_narts_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == cyc_corpus_utilities.UNPROVIDED) {
            module = (SubLObject)cyc_corpus_utilities.$int91$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_corpus_utilities.NIL == Filesys.probe_file(corpus_dir) || cyc_corpus_utilities.NIL == Filesys.directory_p(corpus_dir)) {
            return Errors.warn((SubLObject)cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary((SubLObject)cyc_corpus_utilities.UNPROVIDED, (SubLObject)cyc_corpus_utilities.UNPROVIDED);
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)cyc_corpus_utilities.$str117$mapping_Cyc_NARTs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        assert cyc_corpus_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_corpus_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_corpus_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_corpus_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$16 = idx;
                if (cyc_corpus_utilities.NIL == id_index.id_index_objects_empty_p(idx_$16, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                    final SubLObject idx_$17 = idx_$16;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$17, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$17);
                        final SubLObject backwardP_var = (SubLObject)cyc_corpus_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_term;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyc_corpus_utilities.NIL, v_iteration = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER)) {
                            id = ((cyc_corpus_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER) : v_iteration);
                            v_term = Vectors.aref(vector_var, id);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(v_term) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                                if (cyc_corpus_utilities.NIL != id_index.id_index_tombstone_p(v_term)) {
                                    v_term = (SubLObject)cyc_corpus_utilities.$kw88$SKIP;
                                }
                                if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$18 = idx_$16;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$18) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$18);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$18);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$18);
                        final SubLObject v_default = (SubLObject)((cyc_corpus_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) ? cyc_corpus_utilities.NIL : cyc_corpus_utilities.$kw88$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject v_term2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP) || cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                if (Numbers.mod(times, module).numE((SubLObject)cyc_corpus_utilities.ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
                                times = Numbers.add(times, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-corpus-utilities.lisp", position = 19851L)
    public static SubLObject all_narts_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)cyc_corpus_utilities.$str117$mapping_Cyc_NARTs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER;
        assert cyc_corpus_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_corpus_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_corpus_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_corpus_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$20 = idx;
                if (cyc_corpus_utilities.NIL == id_index.id_index_objects_empty_p(idx_$20, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                    final SubLObject idx_$21 = idx_$20;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$21, (SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$21);
                        final SubLObject backwardP_var = (SubLObject)cyc_corpus_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject cycl_nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cyc_corpus_utilities.NIL, v_iteration = (SubLObject)cyc_corpus_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER)) {
                            id = ((cyc_corpus_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cyc_corpus_utilities.ONE_INTEGER) : v_iteration);
                            cycl_nart = Vectors.aref(vector_var, id);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(cycl_nart) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                                if (cyc_corpus_utilities.NIL != id_index.id_index_tombstone_p(cycl_nart)) {
                                    cycl_nart = (SubLObject)cyc_corpus_utilities.$kw88$SKIP;
                                }
                                cyc_corpus_index_term(cycl_nart);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$22 = idx_$20;
                    if (cyc_corpus_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$22) || cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$22);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$22);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$22);
                        final SubLObject v_default = (SubLObject)((cyc_corpus_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP)) ? cyc_corpus_utilities.NIL : cyc_corpus_utilities.$kw88$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject cycl_nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (cyc_corpus_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cyc_corpus_utilities.$kw88$SKIP) || cyc_corpus_utilities.NIL == id_index.id_index_tombstone_p(cycl_nart2)) {
                                cyc_corpus_index_term(cycl_nart2);
                                sofar = Numbers.add(sofar, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)cyc_corpus_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_corpus_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_corpus_utilities.$kw90$DONE;
    }
    
    public static SubLObject declare_cyc_corpus_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_corpus_client", "GET-CYC-CORPUS-CLIENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "reset_cyc_corpus_client", "RESET-CYC-CORPUS-CLIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "add_to_cyc_corpus_index", "ADD-TO-CYC-CORPUS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "lookup_cyc_corpus_index", "LOOKUP-CYC-CORPUS-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_answer", "GET-CYC-IR-CLIENT-INTERACTION-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_answer", "SET-CYC-IR-CLIENT-INTERACTION-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_hit_number", "GET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_hit_number", "SET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_search_string", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_search_string", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_value", "GET-CYC-IR-CLIENT-INTERACTION-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_value", "SET-CYC-IR-CLIENT-INTERACTION-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_key", "GET-CYC-IR-CLIENT-INTERACTION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_key", "SET-CYC-IR-CLIENT-INTERACTION-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_hitnum_attr", "GET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_hitnum_attr", "SET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_index_target_attr", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_index_target_attr", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_index_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_index_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_query_language_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_query_language_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_query_type_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_query_type_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_query_tag", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_query_tag", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_subl_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_subl_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_search_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_search_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "get_cyc_ir_client_interaction_index_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "set_cyc_ir_client_interaction_index_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "subloop_reserved_initialize_cyc_ir_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "subloop_reserved_initialize_cyc_ir_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_p", "CYC-IR-CLIENT-INTERACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_initialize_method", "CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_build_answer_method", "CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_set_key_method", "CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_set_value_method", "CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_set_search_string_method", "CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_set_hitnum_method", "CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_request_string_method", "CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_ir_client_interaction_get_answer_method", "CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_corpus_dump_complete_p", "CYC-CORPUS-DUMP-COMPLETE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "all_terms_indexed", "ALL-TERMS-INDEXED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "all_terms_index_files_to_dir", "ALL-TERMS-INDEX-FILES-TO-DIR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "create_all_terms_index_files_to_dir_task", "CREATE-ALL-TERMS-INDEX-FILES-TO-DIR-TASK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_corpus_index_term", "CYC-CORPUS-INDEX-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_corpus_build_index_body", "CYC-CORPUS-BUILD-INDEX-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_corpus_read_hits", "CYC-CORPUS-READ-HITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "truncate_and_make_unique_file_name", "TRUNCATE-AND-MAKE-UNIQUE-FILE-NAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "index_file_name_for_term", "INDEX-FILE-NAME-FOR-TERM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "cyc_corpus_index_term_to_file", "CYC-CORPUS-INDEX-TERM-TO-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "all_constants_index_files", "ALL-CONSTANTS-INDEX-FILES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "all_narts_index_files", "ALL-NARTS-INDEX-FILES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_corpus_utilities", "all_narts_indexed", "ALL-NARTS-INDEXED", 0, 0, false);
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    public static SubLObject init_cyc_corpus_utilities_file() {
        cyc_corpus_utilities.$cyc_corpus_client_host$ = SubLFiles.defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper((SubLObject)(cyc_corpus_utilities.$list0.isSymbol() ? Symbols.symbol_value((SubLObject)cyc_corpus_utilities.$list0) : cyc_corpus_utilities.$list0), (SubLObject)cyc_corpus_utilities.$sym1$_CYC_CORPUS_CLIENT_HOST_, (SubLObject)(cyc_corpus_utilities.$str2$ir_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)cyc_corpus_utilities.$str2$ir_cyc_com) : cyc_corpus_utilities.$str2$ir_cyc_com), (SubLObject)cyc_corpus_utilities.$kw3$PARAMETER, (SubLObject)cyc_corpus_utilities.UNPROVIDED));
        cyc_corpus_utilities.$cyc_corpus_client_port$ = SubLFiles.defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper((SubLObject)(cyc_corpus_utilities.$list4.isSymbol() ? Symbols.symbol_value((SubLObject)cyc_corpus_utilities.$list4) : cyc_corpus_utilities.$list4), (SubLObject)cyc_corpus_utilities.$sym5$_CYC_CORPUS_CLIENT_PORT_, (SubLObject)(cyc_corpus_utilities.$int6$6666.isSymbol() ? Symbols.symbol_value((SubLObject)cyc_corpus_utilities.$int6$6666) : cyc_corpus_utilities.$int6$6666), (SubLObject)cyc_corpus_utilities.$kw3$PARAMETER, (SubLObject)cyc_corpus_utilities.UNPROVIDED));
        cyc_corpus_utilities.$cyc_corpus_client$ = SubLFiles.defparameter("*CYC-CORPUS-CLIENT*", (SubLObject)cyc_corpus_utilities.NIL);
        cyc_corpus_utilities.$cyc_corpus_dump_task$ = SubLFiles.defvar("*CYC-CORPUS-DUMP-TASK*", (SubLObject)cyc_corpus_utilities.NIL);
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    public static SubLObject setup_cyc_corpus_utilities_file() {
        classes.subloop_new_class((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym23$OBJECT, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$list24);
        classes.class_set_implements_slot_listeners((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_cyc_ir_client_interaction_class((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym53$INITIALIZE, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list54, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$list55);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym53$INITIALIZE, (SubLObject)cyc_corpus_utilities.$sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym16$BUILD_ANSWER, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.$list58, (SubLObject)cyc_corpus_utilities.$list59);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym16$BUILD_ANSWER, (SubLObject)cyc_corpus_utilities.$sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym14$SET_KEY, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.$list62, (SubLObject)cyc_corpus_utilities.$list63);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym14$SET_KEY, (SubLObject)cyc_corpus_utilities.$sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym15$SET_VALUE, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.$list62, (SubLObject)cyc_corpus_utilities.$list66);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym15$SET_VALUE, (SubLObject)cyc_corpus_utilities.$sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym21$SET_SEARCH_STRING, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.$list62, (SubLObject)cyc_corpus_utilities.$list69);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym21$SET_SEARCH_STRING, (SubLObject)cyc_corpus_utilities.$sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym22$SET_HITNUM, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.$list62, (SubLObject)cyc_corpus_utilities.$list72);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym22$SET_HITNUM, (SubLObject)cyc_corpus_utilities.$sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym18$REQUEST_STRING, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$list76);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym18$REQUEST_STRING, (SubLObject)cyc_corpus_utilities.$sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyc_corpus_utilities.$sym19$GET_ANSWER, (SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$list57, (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.$list84);
        methods.subloop_register_instance_method((SubLObject)cyc_corpus_utilities.$sym12$CYC_IR_CLIENT_INTERACTION, (SubLObject)cyc_corpus_utilities.$sym19$GET_ANSWER, (SubLObject)cyc_corpus_utilities.$sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        return (SubLObject)cyc_corpus_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_corpus_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_corpus_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_corpus_utilities_file();
    }
    
    static {
        me = (SubLFile)new cyc_corpus_utilities();
        cyc_corpus_utilities.$cyc_corpus_client_host$ = null;
        cyc_corpus_utilities.$cyc_corpus_client_port$ = null;
        cyc_corpus_utilities.$cyc_corpus_client$ = null;
        cyc_corpus_utilities.$cyc_corpus_dump_task$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.cyc-corpus-client-host"));
        $sym1$_CYC_CORPUS_CLIENT_HOST_ = SubLObjectFactory.makeSymbol("*CYC-CORPUS-CLIENT-HOST*");
        $str2$ir_cyc_com = SubLObjectFactory.makeString("ir.cyc.com");
        $kw3$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.cyc-corpus-client-port"));
        $sym5$_CYC_CORPUS_CLIENT_PORT_ = SubLObjectFactory.makeSymbol("*CYC-CORPUS-CLIENT-PORT*");
        $int6$6666 = SubLObjectFactory.makeInteger(6666);
        $sym7$TCP_CLIENT = SubLObjectFactory.makeSymbol("TCP-CLIENT");
        $sym8$SET_HOST = SubLObjectFactory.makeSymbol("SET-HOST");
        $sym9$SET_PORT = SubLObjectFactory.makeSymbol("SET-PORT");
        $sym10$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym11$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym12$CYC_IR_CLIENT_INTERACTION = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION");
        $sym13$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym14$SET_KEY = SubLObjectFactory.makeSymbol("SET-KEY");
        $sym15$SET_VALUE = SubLObjectFactory.makeSymbol("SET-VALUE");
        $sym16$BUILD_ANSWER = SubLObjectFactory.makeSymbol("BUILD-ANSWER");
        $sym17$PERFORM_REQUEST = SubLObjectFactory.makeSymbol("PERFORM-REQUEST");
        $sym18$REQUEST_STRING = SubLObjectFactory.makeSymbol("REQUEST-STRING");
        $sym19$GET_ANSWER = SubLObjectFactory.makeSymbol("GET-ANSWER");
        $int20$100 = SubLObjectFactory.makeInteger(100);
        $sym21$SET_SEARCH_STRING = SubLObjectFactory.makeSymbol("SET-SEARCH-STRING");
        $sym22$SET_HITNUM = SubLObjectFactory.makeSymbol("SET-HITNUM");
        $sym23$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list24 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("index")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("search")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("SubL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("request")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("type")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("language")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("to-index")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-TARGET-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("target")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HITNUM-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("hitnum")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIT-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym25$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym26$HIT_NUMBER = SubLObjectFactory.makeSymbol("HIT-NUMBER");
        $sym27$SEARCH_STRING = SubLObjectFactory.makeSymbol("SEARCH-STRING");
        $sym28$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $sym29$KEY = SubLObjectFactory.makeSymbol("KEY");
        $sym30$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym31$INDEX_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("INDEX-DIRECTIVE-TAG");
        $str32$index = SubLObjectFactory.makeString("index");
        $sym33$SEARCH_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG");
        $str34$search = SubLObjectFactory.makeString("search");
        $sym35$SUBL_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG");
        $str36$SubL = SubLObjectFactory.makeString("SubL");
        $sym37$QUERY_TAG = SubLObjectFactory.makeSymbol("QUERY-TAG");
        $str38$request = SubLObjectFactory.makeString("request");
        $sym39$QUERY_TYPE_ATTR = SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR");
        $str40$type = SubLObjectFactory.makeString("type");
        $sym41$QUERY_LANGUAGE_ATTR = SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR");
        $str42$language = SubLObjectFactory.makeString("language");
        $sym43$INDEX_TAG = SubLObjectFactory.makeSymbol("INDEX-TAG");
        $str44$to_index = SubLObjectFactory.makeString("to-index");
        $sym45$INDEX_TARGET_ATTR = SubLObjectFactory.makeSymbol("INDEX-TARGET-ATTR");
        $str46$target = SubLObjectFactory.makeString("target");
        $sym47$HITNUM_ATTR = SubLObjectFactory.makeSymbol("HITNUM-ATTR");
        $str48$hitnum = SubLObjectFactory.makeString("hitnum");
        $sym49$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS");
        $sym50$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym51$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym52$SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE");
        $sym53$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym56$CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING"));
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym61$CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym65$CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym68$CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym71$CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)cyc_corpus_utilities.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("~a is not a positive integer"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HIT-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $str74$_a_is_not_a_positive_integer = SubLObjectFactory.makeString("~a is not a positive integer");
        $sym75$CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-DIRECTIVE-TAG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("HIT-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("HITNUM-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-STRING"), (SubLObject)cyc_corpus_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)cyc_corpus_utilities.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-TARGET-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)cyc_corpus_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-TAG"), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)cyc_corpus_utilities.NIL, (SubLObject)cyc_corpus_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-OUTPUT-STREAM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")))));
        $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym78$XML_WRITER = SubLObjectFactory.makeSymbol("XML-WRITER");
        $sym79$SET_STREAM = SubLObjectFactory.makeSymbol("SET-STREAM");
        $sym80$START_TAG = SubLObjectFactory.makeSymbol("START-TAG");
        $sym81$XML_PRINT = SubLObjectFactory.makeSymbol("XML-PRINT");
        $sym82$END_TAG = SubLObjectFactory.makeSymbol("END-TAG");
        $sym83$CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")));
        $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");
        $sym86$CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD = SubLObjectFactory.makeSymbol("CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD");
        $str87$mapping_Cyc_FORTs = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $kw88$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str89$__Couldn_t_index__S = SubLObjectFactory.makeString("~%Couldn't index ~S");
        $kw90$DONE = SubLObjectFactory.makeKeyword("DONE");
        $int91$300 = SubLObjectFactory.makeInteger(300);
        $str92$_S_is_not_an_existing_directory = SubLObjectFactory.makeString("~S is not an existing directory");
        $str93$_A_corpus_dump = SubLObjectFactory.makeString("~A-corpus-dump");
        $sym94$ALL_TERMS_INDEX_FILES_TO_DIR = SubLObjectFactory.makeSymbol("ALL-TERMS-INDEX-FILES-TO-DIR");
        $sym95$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str96$ = SubLObjectFactory.makeString("");
        $sym97$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const98$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str99$_ = SubLObjectFactory.makeString(" ");
        $int100$999 = SubLObjectFactory.makeInteger(999);
        $sym101$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $int102$250 = SubLObjectFactory.makeInteger(250);
        $str103$_S = SubLObjectFactory.makeString("~S");
        $int104$47 = SubLObjectFactory.makeInteger(47);
        $str105$_ = SubLObjectFactory.makeString("_");
        $str106$_ = SubLObjectFactory.makeString("/");
        $str107$_ = SubLObjectFactory.makeString(";");
        $str108$_ = SubLObjectFactory.makeString(":");
        $str109$_op_ = SubLObjectFactory.makeString("_op_");
        $str110$_ = SubLObjectFactory.makeString("(");
        $str111$_cp_ = SubLObjectFactory.makeString("_cp_");
        $str112$_ = SubLObjectFactory.makeString(")");
        $kw113$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str114$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str115$_____S = SubLObjectFactory.makeString("~%~%~S");
        $str116$mapping_Cyc_constants = SubLObjectFactory.makeString("mapping Cyc constants");
        $str117$mapping_Cyc_NARTs = SubLObjectFactory.makeString("mapping Cyc NARTs");
    }
}

/*

	Total time: 703 ms
	
*/
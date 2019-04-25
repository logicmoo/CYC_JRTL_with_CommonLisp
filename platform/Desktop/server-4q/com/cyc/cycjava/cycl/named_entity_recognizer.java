package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.quirk.answer;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class named_entity_recognizer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.named_entity_recognizer";
    public static final String myFingerPrint = "0d7f251724304dff562b077d2d946abe6792daa0e6dea0ca4d8b7af496e5726b";
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12201L)
    private static SubLSymbol $break_named_entityP$;
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
    private static SubLSymbol $named_entityP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17716L)
    public static SubLSymbol $stanford_ner_host$;
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17935L)
    public static SubLSymbol $stanford_ner_port$;
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 20785L)
    private static SubLSymbol $resporator_to_cycl_map$;
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23670L)
    private static SubLSymbol $place_tightening_lexicon$;
    private static final SubLSymbol $sym0$NAMED_ENTITY;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CONFIDENCE;
    private static final SubLSymbol $sym4$CYC;
    private static final SubLSymbol $sym5$SOURCE;
    private static final SubLSymbol $sym6$TYPE;
    private static final SubLSymbol $sym7$STRING;
    private static final SubLSymbol $sym8$INSTANCE_COUNT;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS;
    private static final SubLSymbol $sym10$ISOLATED_P;
    private static final SubLSymbol $sym11$INSTANCE_NUMBER;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE;
    private static final SubLSymbol $sym13$PRINT;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLString $str18$__NE__;
    private static final SubLString $str19$_;
    private static final SubLString $str20$_;
    private static final SubLSymbol $sym21$NAMED_ENTITY_PRINT_METHOD;
    private static final SubLSymbol $sym22$GET_STRING;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym26$NAMED_ENTITY_GET_STRING_METHOD;
    private static final SubLSymbol $sym27$GET_TYPE;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym30$NAMED_ENTITY_GET_TYPE_METHOD;
    private static final SubLSymbol $sym31$GET_CYC;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym34$NAMED_ENTITY_GET_CYC_METHOD;
    private static final SubLSymbol $sym35$GET_CONFIDENCE;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD;
    private static final SubLSymbol $sym39$GET_SOURCE;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym42$NAMED_ENTITY_GET_SOURCE_METHOD;
    private static final SubLSymbol $sym43$CONTEXTUALIZED_NAMED_ENTITY;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SUBTYPES;
    private static final SubLSymbol $sym46$OFFSETS;
    private static final SubLSymbol $sym47$CONTEXT;
    private static final SubLSymbol $sym48$LEXICON;
    private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS;
    private static final SubLSymbol $sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE;
    private static final SubLSymbol $sym51$GET_LEXICON;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym54$IGNORE_CACHE;
    private static final SubLSymbol $sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD;
    private static final SubLSymbol $sym56$SET_LEXICON;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
    private static final SubLSymbol $sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD;
    private static final SubLSymbol $sym61$LISTP;
    private static final SubLSymbol $sym62$TIGHTEN_TYPE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD;
    private static final SubLObject $const66$Person;
    private static final SubLString $str67$Who;
    private static final SubLString $str68$What;
    private static final SubLString $str69$is;
    private static final SubLString $str70$_;
    private static final SubLSymbol $sym71$PARSE;
    private static final SubLSymbol $sym72$DEFINITIONAL_QUESTION;
    private static final SubLSymbol $sym73$LEXIFY;
    private static final SubLSymbol $sym74$EXTRACT;
    private static final SubLObject $const75$Organization;
    private static final SubLSymbol $sym76$GET_CONTENT;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD;
    private static final SubLSymbol $sym79$GET_PARSE_TREE;
    private static final SubLSymbol $kw80$BEST_ONLY;
    private static final SubLSymbol $sym81$GET_HEAD_DAUGHTERS;
    private static final SubLSymbol $sym82$LEXIFY_SENTENCE;
    private static final SubLSymbol $sym83$DENOTS_OF_PS_HARVEST_NBARS;
    private static final SubLList $list84;
    private static final SubLSymbol $kw85$NONE;
    private static final SubLSymbol $sym86$NAMED_ENTITY_;
    private static final SubLSymbol $sym87$STRINGP;
    private static final SubLSymbol $sym88$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym89$STANFORD_NER;
    private static final SubLSymbol $sym90$O;
    private static final SubLSymbol $sym91$_EXIT;
    private static final SubLSymbol $sym92$RUN;
    private static final SubLString $str93$Error___S_occured_in_NAMED_ENTITY;
    private static final SubLSymbol $sym94$_NAMED_ENTITY__CACHING_STATE_;
    private static final SubLSymbol $sym95$NAMED_ENTITY_RECOGNIZER;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$KNOWN_CYC_TYPES;
    private static final SubLSymbol $sym100$TYPE_MAP;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS;
    private static final SubLSymbol $sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE;
    private static final SubLSymbol $sym105$TO_CYC;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD;
    private static final SubLSymbol $sym109$STANFORD_NER_TO_CYC_METHOD;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$STANFORD_NER_RUN_METHOD;
    private static final SubLString $str113$;
    private static final SubLString $str114$_;
    private static final SubLSymbol $sym115$MERGE_CLUSTERS;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLObject $const118$Place;
    private static final SubLString $str119$_;
    private static final SubLString $str120$__;
    private static final SubLSymbol $sym121$LOCATION;
    private static final SubLSymbol $sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD;
    private static final SubLSymbol $sym123$GET;
    private static final SubLSymbol $kw124$DENOT;
    private static final SubLObject $const125$State_US;
    private static final SubLObject $const126$InferencePSC;
    private static final SubLSymbol $sym127$_STANFORD_NER_HOST_;
    private static final SubLString $str128$localhost;
    private static final SubLSymbol $sym129$_STANFORD_NER_PORT_;
    private static final SubLInteger $int130$6666;
    private static final SubLString $str131$The_cat_sat_on_the_mat_;
    private static final SubLSymbol $kw132$PUBLIC;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$RESPORATOR;
    private static final SubLSymbol $sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS;
    private static final SubLSymbol $sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$NEXT_RESPORATOR_ENTITY;
    private static final SubLSymbol $sym139$RESPORATOR_RUN_METHOD;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD;
    private static final SubLInteger $int144$100;
    private static final SubLObject $const145$GuruQAMt;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$DATE;
    private static final SubLObject $const148$EnduringThing_Localized;
    private static final SubLObject $const149$InstanceNamedFn_Ternary;
    private static final SubLObject $const150$State_UnitedStates;
    private static final SubLObject $const151$GeopoliticalEntityNamedFn;
    private static final SubLSymbol $sym152$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $kw153$OFF;
    private static final SubLSymbol $sym154$SET_LEARNERS;
    private static final SubLSymbol $kw155$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym156$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym157$PATTERN_MATCHES_FORMULA;
    private static final SubLSymbol $sym158$NE_TEST_TIGHTEN_TYPE;
    private static final SubLSymbol $kw159$TEST;
    private static final SubLSymbol $sym160$NE_TEST_FUNC;
    private static final SubLSymbol $kw161$OWNER;
    private static final SubLSymbol $kw162$CLASSES;
    private static final SubLList $list163;
    private static final SubLSymbol $kw164$KB;
    private static final SubLSymbol $kw165$FULL;
    private static final SubLSymbol $kw166$WORKING_;
    private static final SubLList $list167;
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject get_named_entity_confidence(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, (SubLObject)named_entity_recognizer.FIVE_INTEGER, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject set_named_entity_confidence(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, (SubLObject)named_entity_recognizer.FIVE_INTEGER, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject get_named_entity_cyc(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, (SubLObject)named_entity_recognizer.FOUR_INTEGER, (SubLObject)named_entity_recognizer.$sym4$CYC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject set_named_entity_cyc(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, (SubLObject)named_entity_recognizer.FOUR_INTEGER, (SubLObject)named_entity_recognizer.$sym4$CYC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject get_named_entity_source(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, (SubLObject)named_entity_recognizer.THREE_INTEGER, (SubLObject)named_entity_recognizer.$sym5$SOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject set_named_entity_source(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, (SubLObject)named_entity_recognizer.THREE_INTEGER, (SubLObject)named_entity_recognizer.$sym5$SOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject get_named_entity_type(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, (SubLObject)named_entity_recognizer.TWO_INTEGER, (SubLObject)named_entity_recognizer.$sym6$TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject set_named_entity_type(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, (SubLObject)named_entity_recognizer.TWO_INTEGER, (SubLObject)named_entity_recognizer.$sym6$TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject get_named_entity_string(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, (SubLObject)named_entity_recognizer.ONE_INTEGER, (SubLObject)named_entity_recognizer.$sym7$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject set_named_entity_string(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, (SubLObject)named_entity_recognizer.ONE_INTEGER, (SubLObject)named_entity_recognizer.$sym7$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject subloop_reserved_initialize_named_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym8$INSTANCE_COUNT, (SubLObject)named_entity_recognizer.ZERO_INTEGER);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject subloop_reserved_initialize_named_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym10$ISOLATED_P, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym11$INSTANCE_NUMBER, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym7$STRING, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym6$TYPE, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym5$SOURCE, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym4$CYC, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE, (SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 970L)
    public static SubLObject named_entity_p(final SubLObject named_entity) {
        return classes.subloop_instanceof_class(named_entity, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 1723L)
    public static SubLObject new_named_entity(final SubLObject string, final SubLObject type, SubLObject source, SubLObject confidence, SubLObject cyc) {
        if (confidence == named_entity_recognizer.UNPROVIDED) {
            confidence = (SubLObject)named_entity_recognizer.NIL;
        }
        if (cyc == named_entity_recognizer.UNPROVIDED) {
            cyc = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLObject ne = object.new_class_instance((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym7$STRING, string);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym6$TYPE, type);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym5$SOURCE, source);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE, confidence);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym4$CYC, cyc);
        return ne;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2218L)
    public static SubLObject named_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject type = get_named_entity_type(self);
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                streams_high.write_string((SubLObject)named_entity_recognizer.$str18$__NE__, stream, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                streams_high.write_string(string, stream, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                streams_high.write_string((SubLObject)named_entity_recognizer.$str19$_, stream, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                print_high.princ(type, stream);
                streams_high.write_string((SubLObject)named_entity_recognizer.$str20$_, stream, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_type(self, type);
                    set_named_entity_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2515L)
    public static SubLObject named_entity_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2647L)
    public static SubLObject named_entity_get_type_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject type = get_named_entity_type(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, type);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_type(self, type);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2777L)
    public static SubLObject named_entity_get_cyc_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject cyc = get_named_entity_cyc(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, cyc);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_cyc(self, cyc);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 2901L)
    public static SubLObject named_entity_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject confidence = get_named_entity_confidence(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, confidence);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_confidence(self, confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3041L)
    public static SubLObject named_entity_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject source = get_named_entity_source(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, source);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_named_entity_source(self, source);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject get_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, (SubLObject)named_entity_recognizer.NINE_INTEGER, (SubLObject)named_entity_recognizer.$sym45$SUBTYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject set_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, (SubLObject)named_entity_recognizer.NINE_INTEGER, (SubLObject)named_entity_recognizer.$sym45$SUBTYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject get_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, (SubLObject)named_entity_recognizer.EIGHT_INTEGER, (SubLObject)named_entity_recognizer.$sym46$OFFSETS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject set_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, (SubLObject)named_entity_recognizer.EIGHT_INTEGER, (SubLObject)named_entity_recognizer.$sym46$OFFSETS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject get_contextualized_named_entity_context(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, (SubLObject)named_entity_recognizer.SEVEN_INTEGER, (SubLObject)named_entity_recognizer.$sym47$CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject set_contextualized_named_entity_context(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, (SubLObject)named_entity_recognizer.SEVEN_INTEGER, (SubLObject)named_entity_recognizer.$sym47$CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject get_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, (SubLObject)named_entity_recognizer.SIX_INTEGER, (SubLObject)named_entity_recognizer.$sym48$LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject set_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, (SubLObject)named_entity_recognizer.SIX_INTEGER, (SubLObject)named_entity_recognizer.$sym48$LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject subloop_reserved_initialize_contextualized_named_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym8$INSTANCE_COUNT, (SubLObject)named_entity_recognizer.ZERO_INTEGER);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject subloop_reserved_initialize_contextualized_named_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym10$ISOLATED_P, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym11$INSTANCE_NUMBER, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym7$STRING, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym6$TYPE, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym5$SOURCE, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym4$CYC, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym48$LEXICON, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym47$CONTEXT, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym46$OFFSETS, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym45$SUBTYPES, (SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3194L)
    public static SubLObject contextualized_named_entity_p(final SubLObject contextualized_named_entity) {
        return classes.subloop_instanceof_class(contextualized_named_entity, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 3944L)
    public static SubLObject new_contextualized_named_entity(final SubLObject string, final SubLObject type, SubLObject source, final SubLObject v_context, final SubLObject offsets, SubLObject confidence, SubLObject cyc) {
        if (confidence == named_entity_recognizer.UNPROVIDED) {
            confidence = (SubLObject)named_entity_recognizer.NIL;
        }
        if (cyc == named_entity_recognizer.UNPROVIDED) {
            cyc = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLObject ne = object.new_class_instance((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym7$STRING, string);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym6$TYPE, type);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym5$SOURCE, source);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym47$CONTEXT, v_context);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym46$OFFSETS, offsets);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym3$CONFIDENCE, confidence);
        instances.set_slot(ne, (SubLObject)named_entity_recognizer.$sym4$CYC, cyc);
        return ne;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4584L)
    public static SubLObject contextualized_named_entity_get_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                if (named_entity_recognizer.NIL == lexicon) {
                    lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
                    methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)named_entity_recognizer.$sym54$IGNORE_CACHE);
                }
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4831L)
    public static SubLObject contextualized_named_entity_set_lexicon_method(final SubLObject self, final SubLObject lex) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                lexicon = lex;
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 4979L)
    public static SubLObject denot_collections(final SubLObject denots, SubLObject base_collection) {
        if (base_collection == named_entity_recognizer.UNPROVIDED) {
            base_collection = (SubLObject)named_entity_recognizer.NIL;
        }
        assert named_entity_recognizer.NIL != Types.listp(denots) : denots;
        SubLObject results = (SubLObject)named_entity_recognizer.NIL;
        SubLObject cdolist_list_var = denots;
        SubLObject denot = (SubLObject)named_entity_recognizer.NIL;
        denot = cdolist_list_var.first();
        while (named_entity_recognizer.NIL != cdolist_list_var) {
            if (named_entity_recognizer.NIL != fort_types_interface.isa_collectionP(denot, (SubLObject)named_entity_recognizer.UNPROVIDED) && named_entity_recognizer.NIL == disjoint_with.collections_disjointP(base_collection, denot, (SubLObject)named_entity_recognizer.UNPROVIDED)) {
                final SubLObject item_var = denot;
                if (named_entity_recognizer.NIL == conses_high.member(item_var, results, Symbols.symbol_function((SubLObject)named_entity_recognizer.EQL), Symbols.symbol_function((SubLObject)named_entity_recognizer.IDENTITY))) {
                    results = (SubLObject)ConsesLow.cons(item_var, results);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 5388L)
    public static SubLObject contextualized_named_entity_tighten_type_method(final SubLObject self, SubLObject respect_ner_typeP, SubLObject lexical_lookup_onlyP) {
        if (respect_ner_typeP == named_entity_recognizer.UNPROVIDED) {
            respect_ner_typeP = (SubLObject)named_entity_recognizer.T;
        }
        if (lexical_lookup_onlyP == named_entity_recognizer.UNPROVIDED) {
            lexical_lookup_onlyP = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = (SubLObject)named_entity_recognizer.NIL;
        SubLObject subtypes = get_contextualized_named_entity_subtypes(self);
        final SubLObject v_context = get_contextualized_named_entity_context(self);
        final SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        final SubLObject cyc = get_named_entity_cyc(self);
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                final SubLObject v_parser = parser.new_stanford_parser((SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                final SubLObject question_word = (SubLObject)(cyc.eql(named_entity_recognizer.$const66$Person) ? named_entity_recognizer.$str67$Who : named_entity_recognizer.$str68$What);
                final SubLObject question_string = string_utilities.bunge((SubLObject)ConsesLow.list(question_word, (SubLObject)named_entity_recognizer.$str69$is, Sequences.cconcatenate(string, (SubLObject)named_entity_recognizer.$str70$_)), (SubLObject)named_entity_recognizer.UNPROVIDED);
                final SubLObject question_parse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)named_entity_recognizer.$sym71$PARSE, question_string);
                final SubLObject v_question = object.new_class_instance((SubLObject)named_entity_recognizer.$sym72$DEFINITIONAL_QUESTION);
                final SubLObject passage = search_engine.new_simple_passage(v_context);
                final SubLObject lexicon_$1 = methods.funcall_instance_method_with_0_args(self, (SubLObject)named_entity_recognizer.$sym51$GET_LEXICON);
                SubLObject answers = (SubLObject)named_entity_recognizer.NIL;
                SubLObject tighter_types = (SubLObject)named_entity_recognizer.NIL;
                SubLObject answer_strings = (SubLObject)named_entity_recognizer.NIL;
                final SubLObject entity_string = methods.funcall_instance_method_with_0_args(self, (SubLObject)named_entity_recognizer.$sym22$GET_STRING);
                question.set_question_string(v_question, question_string);
                if (named_entity_recognizer.NIL != question_parse) {
                    methods.funcall_instance_method_with_1_args(question_parse, (SubLObject)named_entity_recognizer.$sym73$LEXIFY, lexicon_$1);
                }
                question.set_question_parse(v_question, question_parse);
                answers = methods.funcall_instance_method_with_1_args(v_question, (SubLObject)named_entity_recognizer.$sym74$EXTRACT, passage);
                if (!cyc.eql(named_entity_recognizer.$const75$Organization)) {
                    answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(v_question, entity_string, search_engine.new_simple_passage(entity_string), (SubLObject)named_entity_recognizer.ONE_INTEGER, (SubLObject)named_entity_recognizer.UNPROVIDED), answers);
                }
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        SubLObject cdolist_list_var = answers;
                        SubLObject v_answer = (SubLObject)named_entity_recognizer.NIL;
                        v_answer = cdolist_list_var.first();
                        while (named_entity_recognizer.NIL != cdolist_list_var) {
                            final SubLObject answer_string = methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)named_entity_recognizer.$sym76$GET_CONTENT);
                            if (named_entity_recognizer.NIL != string_utilities.substringP(answer_string, entity_string, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED) || (named_entity_recognizer.NIL == string_utilities.ends_with_start_of(entity_string, answer_string, (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.$list77) && named_entity_recognizer.NIL == string_utilities.ends_with_start_of(answer_string, entity_string, (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.$list77))) {
                                thread.resetMultipleValues();
                                final SubLObject new_tighter_types = tighter_types_from_answer(v_answer, lexicon_$1, entity_string, (SubLObject)((named_entity_recognizer.NIL != respect_ner_typeP) ? cyc : named_entity_recognizer.NIL), lexical_lookup_onlyP);
                                final SubLObject answer_string_$2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                answer_strings = (SubLObject)ConsesLow.cons(answer_string_$2, answer_strings);
                                tighter_types = conses_high.union(tighter_types, new_tighter_types, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            v_answer = cdolist_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
                subtypes = tighter_types;
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, (SubLObject)ConsesLow.list(tighter_types, answer_strings));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_contextualized_named_entity_subtypes(self, subtypes);
                    set_contextualized_named_entity_context(self, v_context);
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    set_named_entity_cyc(self, cyc);
                    set_named_entity_string(self, string);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 7327L)
    public static SubLObject tighter_types_from_answer(final SubLObject v_answer, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, SubLObject lexical_lookup_onlyP) {
        if (lexical_lookup_onlyP == named_entity_recognizer.UNPROVIDED) {
            lexical_lookup_onlyP = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tighter_types = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject trees = get_trees_to_head(methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)named_entity_recognizer.$sym79$GET_PARSE_TREE));
        SubLObject type_string = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)named_entity_recognizer.NIL, thread);
            parsing_vars.$psp_return_mode$.bind((SubLObject)named_entity_recognizer.$kw80$BEST_ONLY, thread);
            if (named_entity_recognizer.NIL == trees) {
                type_string = lexicon_utilities.strip_determiner(methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)named_entity_recognizer.$sym76$GET_CONTENT), (SubLObject)named_entity_recognizer.UNPROVIDED);
                tighter_types = tighter_types_from_string(type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP);
            }
            else if (named_entity_recognizer.NIL == tighter_types) {
                SubLObject csome_list_var = trees;
                SubLObject tree = (SubLObject)named_entity_recognizer.NIL;
                tree = csome_list_var.first();
                while (named_entity_recognizer.NIL == tighter_types && named_entity_recognizer.NIL != csome_list_var) {
                    final SubLObject answer_string = methods.funcall_instance_method_with_0_args(tree, (SubLObject)named_entity_recognizer.$sym22$GET_STRING);
                    type_string = lexicon_utilities.strip_determiner(answer_string, (SubLObject)named_entity_recognizer.UNPROVIDED);
                    tighter_types = tighter_types_from_string(type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP);
                    csome_list_var = csome_list_var.rest();
                    tree = csome_list_var.first();
                }
            }
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_2, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(tighter_types, type_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 8628L)
    public static SubLObject tighter_types_from_string(final SubLObject type_string, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, final SubLObject lexical_lookup_onlyP) {
        SubLObject tighter_types = (SubLObject)named_entity_recognizer.NIL;
        if (named_entity_recognizer.NIL == string_acceptably_short_for_ps_parseP(type_string, lexicon, (SubLObject)named_entity_recognizer.UNPROVIDED) || named_entity_recognizer.NIL != lexical_lookup_onlyP) {
            final SubLObject doc = document_annotation_widgets.new_tagged_document(type_string, lexicon, (SubLObject)named_entity_recognizer.T, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
            final SubLObject types = Sequences.remove_duplicates(concepts_from_document(doc), (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
            tighter_types = denot_collections(types, cyc_type);
        }
        else {
            final SubLObject v_psp_lexicon = psp_lexicon.new_psp_lexicon_from_term_lexicon(lexicon);
            tighter_types = denot_collections(denots_of_ps_harvest_nbars(type_string, (SubLObject)named_entity_recognizer.NIL, entity_string, v_psp_lexicon), cyc_type);
        }
        return tighter_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 9308L)
    public static SubLObject concepts_from_document(final SubLObject doc) {
        SubLObject result = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)named_entity_recognizer.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$4;
        SubLObject backwardP_var_$5;
        SubLObject length_$6;
        SubLObject v_iteration_$7;
        SubLObject element_num_$8;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$9;
        SubLObject cycl;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)named_entity_recognizer.NIL, v_iteration = (SubLObject)named_entity_recognizer.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)named_entity_recognizer.ONE_INTEGER)) {
            element_num = ((named_entity_recognizer.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)named_entity_recognizer.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$4 = document.paragraph_sentences(paragraph);
            backwardP_var_$5 = (SubLObject)named_entity_recognizer.NIL;
            for (length_$6 = Sequences.length(vector_var_$4), v_iteration_$7 = (SubLObject)named_entity_recognizer.NIL, v_iteration_$7 = (SubLObject)named_entity_recognizer.ZERO_INTEGER; v_iteration_$7.numL(length_$6); v_iteration_$7 = Numbers.add(v_iteration_$7, (SubLObject)named_entity_recognizer.ONE_INTEGER)) {
                element_num_$8 = ((named_entity_recognizer.NIL != backwardP_var_$5) ? Numbers.subtract(length_$6, v_iteration_$7, (SubLObject)named_entity_recognizer.ONE_INTEGER) : v_iteration_$7);
                sentence = Vectors.aref(vector_var_$4, element_num_$8);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)named_entity_recognizer.NIL;
                word = cdolist_list_var.first();
                while (named_entity_recognizer.NIL != cdolist_list_var) {
                    cdolist_list_var_$9 = document.word_cycls(word);
                    cycl = (SubLObject)named_entity_recognizer.NIL;
                    cycl = cdolist_list_var_$9.first();
                    while (named_entity_recognizer.NIL != cdolist_list_var_$9) {
                        result = (SubLObject)ConsesLow.cons(cycl, result);
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        cycl = cdolist_list_var_$9.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 9489L)
    public static SubLObject get_trees_to_head(final SubLObject tree) {
        SubLObject nominals = (SubLObject)((named_entity_recognizer.NIL != tree) ? ConsesLow.list(tree) : named_entity_recognizer.NIL);
        SubLObject current_descendent;
        for (SubLObject descendents = (SubLObject)((named_entity_recognizer.NIL != parse_tree.phrase_tree_p(tree)) ? methods.funcall_instance_method_with_0_args(tree, (SubLObject)named_entity_recognizer.$sym81$GET_HEAD_DAUGHTERS) : named_entity_recognizer.NIL); named_entity_recognizer.NIL != descendents; descendents = Sequences.cconcatenate(descendents, methods.funcall_instance_method_with_0_args(current_descendent, (SubLObject)named_entity_recognizer.$sym81$GET_HEAD_DAUGHTERS))) {
            current_descendent = descendents.first();
            nominals = (SubLObject)ConsesLow.cons(current_descendent, nominals);
            descendents = descendents.rest();
            if (named_entity_recognizer.NIL != parse_tree.phrase_tree_p(current_descendent)) {}
        }
        return Sequences.nreverse(nominals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10082L)
    public static SubLObject string_acceptably_short_for_ps_parseP(final SubLObject string, final SubLObject lexicon, SubLObject max_words) {
        if (max_words == named_entity_recognizer.UNPROVIDED) {
            max_words = (SubLObject)named_entity_recognizer.FOUR_INTEGER;
        }
        final SubLObject sent = document.new_sentence(string, (SubLObject)named_entity_recognizer.UNPROVIDED);
        final SubLObject lexified = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)named_entity_recognizer.$sym82$LEXIFY_SENTENCE, sent);
        return Numbers.numLE(document.sentence_length(lexified), max_words);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10327L)
    public static SubLObject denots_of_ps_harvest_nbars_internal(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon) {
        if (non_trivialP == named_entity_recognizer.UNPROVIDED) {
            non_trivialP = (SubLObject)named_entity_recognizer.T;
        }
        if (forbidden_string == named_entity_recognizer.UNPROVIDED) {
            forbidden_string = (SubLObject)named_entity_recognizer.NIL;
        }
        if (lexicon == named_entity_recognizer.UNPROVIDED) {
            lexicon = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_result = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject v_psp_chart = psp_syntax.psp_chart_for_string(string, lexicon, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        SubLObject result_cycls = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject chart = v_psp_chart;
        final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$10 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    base_result = psp_main.ps_harvest_nbars(string, non_trivialP, (SubLObject)named_entity_recognizer.UNPROVIDED);
                    final SubLObject max_length = Sequences.length(get_max_span_from_psp_result(base_result, (SubLObject)((named_entity_recognizer.NIL != string_utilities.substringP(string, forbidden_string, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED)) ? forbidden_string : named_entity_recognizer.NIL)));
                    SubLObject cdolist_list_var = base_result;
                    SubLObject span_and_answers = (SubLObject)named_entity_recognizer.NIL;
                    span_and_answers = cdolist_list_var.first();
                    while (named_entity_recognizer.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = span_and_answers;
                        SubLObject span = (SubLObject)named_entity_recognizer.NIL;
                        SubLObject cycls = (SubLObject)named_entity_recognizer.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)named_entity_recognizer.$list84);
                        span = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)named_entity_recognizer.$list84);
                        cycls = current.first();
                        current = current.rest();
                        if (named_entity_recognizer.NIL == current) {
                            if (Sequences.length(span).numE(max_length)) {
                                result_cycls = Sequences.cconcatenate(result_cycls, cycls);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)named_entity_recognizer.$list84);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        span_and_answers = cdolist_list_var.first();
                    }
                }
                finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$10, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result_cycls, (SubLObject)named_entity_recognizer.EQUALP, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 10327L)
    public static SubLObject denots_of_ps_harvest_nbars(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon) {
        if (non_trivialP == named_entity_recognizer.UNPROVIDED) {
            non_trivialP = (SubLObject)named_entity_recognizer.T;
        }
        if (forbidden_string == named_entity_recognizer.UNPROVIDED) {
            forbidden_string = (SubLObject)named_entity_recognizer.NIL;
        }
        if (lexicon == named_entity_recognizer.UNPROVIDED) {
            lexicon = (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)named_entity_recognizer.NIL;
        if (named_entity_recognizer.NIL == v_memoization_state) {
            return denots_of_ps_harvest_nbars_internal(string, non_trivialP, forbidden_string, lexicon);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)named_entity_recognizer.$sym83$DENOTS_OF_PS_HARVEST_NBARS, (SubLObject)named_entity_recognizer.UNPROVIDED);
        if (named_entity_recognizer.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)named_entity_recognizer.$sym83$DENOTS_OF_PS_HARVEST_NBARS, (SubLObject)named_entity_recognizer.FOUR_INTEGER, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)named_entity_recognizer.$sym83$DENOTS_OF_PS_HARVEST_NBARS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, non_trivialP, forbidden_string, lexicon);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)named_entity_recognizer.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)named_entity_recognizer.NIL;
            collision = cdolist_list_var.first();
            while (named_entity_recognizer.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (non_trivialP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (forbidden_string.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (named_entity_recognizer.NIL != cached_args && named_entity_recognizer.NIL == cached_args.rest() && lexicon.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(denots_of_ps_harvest_nbars_internal(string, non_trivialP, forbidden_string, lexicon)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, non_trivialP, forbidden_string, lexicon));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 11240L)
    public static SubLObject get_max_span_from_psp_result(final SubLObject psp_result, final SubLObject forbidden_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forbidden_span = (SubLObject)named_entity_recognizer.NIL;
        if (named_entity_recognizer.NIL == psp_result) {
            return (SubLObject)named_entity_recognizer.NIL;
        }
        if (named_entity_recognizer.NIL != forbidden_string) {
            final SubLObject chart_$12;
            final SubLObject chart = chart_$12 = psp_syntax.psp_chart_for_string(forbidden_string, psp_lexicon.get_default_psp_lexicon((SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED), (SubLObject)named_entity_recognizer.$kw85$NONE, (SubLObject)named_entity_recognizer.NIL);
            final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_$12);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$13 = parsing_vars.$psp_chart$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_chart$.bind(chart_$12, thread);
                        forbidden_span = psp_main.psp_token_list_from_span(psp_chart.psp_chart_max_span());
                    }
                    finally {
                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject first_span = psp_result.first().first();
        if (!forbidden_span.equal(first_span)) {
            return first_span;
        }
        return conses_high.second(psp_result).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
    public static SubLObject clear_named_entityP() {
        final SubLObject cs = named_entity_recognizer.$named_entityP_caching_state$.getGlobalValue();
        if (named_entity_recognizer.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
    public static SubLObject remove_named_entityP(final SubLObject sent, final SubLObject ans) {
        return memoization_state.caching_state_remove_function_results_with_args(named_entity_recognizer.$named_entityP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sent, ans), (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
    public static SubLObject named_entityP_internal(final SubLObject sent, final SubLObject ans) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert named_entity_recognizer.NIL != Types.stringp(sent) : sent;
        assert named_entity_recognizer.NIL != Types.stringp(ans) : ans;
        SubLObject error = (SubLObject)named_entity_recognizer.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)named_entity_recognizer.$sym88$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (named_entity_recognizer.NIL == string_utilities.empty_string_p(sent) && named_entity_recognizer.NIL == string_utilities.empty_string_p(ans)) {
                        final SubLObject ner = object.new_class_instance((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER);
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(ner, (SubLObject)named_entity_recognizer.$sym92$RUN, sent);
                        SubLObject named_entity_disjunction = (SubLObject)named_entity_recognizer.NIL;
                        named_entity_disjunction = cdolist_list_var.first();
                        while (named_entity_recognizer.NIL != cdolist_list_var) {
                            SubLObject cdolist_list_var_$15 = named_entity_disjunction;
                            SubLObject named_entity = (SubLObject)named_entity_recognizer.NIL;
                            named_entity = cdolist_list_var_$15.first();
                            while (named_entity_recognizer.NIL != cdolist_list_var_$15) {
                                if (!named_entity_recognizer.$sym90$O.eql(methods.funcall_instance_method_with_0_args(named_entity, (SubLObject)named_entity_recognizer.$sym27$GET_TYPE)) && named_entity_recognizer.NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(named_entity, (SubLObject)named_entity_recognizer.$sym22$GET_STRING), ans, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED)) {
                                    return methods.funcall_instance_method_with_0_args(named_entity, (SubLObject)named_entity_recognizer.$sym31$GET_CYC);
                                }
                                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                named_entity = cdolist_list_var_$15.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            named_entity_disjunction = cdolist_list_var.first();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)named_entity_recognizer.NIL);
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
        if (named_entity_recognizer.NIL != error && named_entity_recognizer.NIL != named_entity_recognizer.$break_named_entityP$.getDynamicValue(thread)) {
            Errors.sublisp_break((SubLObject)named_entity_recognizer.$str93$Error___S_occured_in_NAMED_ENTITY, new SubLObject[] { error });
        }
        return Values.values((SubLObject)named_entity_recognizer.NIL, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 12334L)
    public static SubLObject named_entityP(final SubLObject sent, final SubLObject ans) {
        SubLObject caching_state = named_entity_recognizer.$named_entityP_caching_state$.getGlobalValue();
        if (named_entity_recognizer.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)named_entity_recognizer.$sym86$NAMED_ENTITY_, (SubLObject)named_entity_recognizer.$sym94$_NAMED_ENTITY__CACHING_STATE_, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.TWO_INTEGER, (SubLObject)named_entity_recognizer.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sent, ans);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)named_entity_recognizer.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)named_entity_recognizer.NIL;
            collision = cdolist_list_var.first();
            while (named_entity_recognizer.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (named_entity_recognizer.NIL != cached_args && named_entity_recognizer.NIL == cached_args.rest() && ans.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(named_entityP_internal(sent, ans)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sent, ans));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13560L)
    public static SubLObject named_entity_recognizer_p(final SubLObject v_named_entity_recognizer) {
        return interfaces.subloop_instanceof_interface(v_named_entity_recognizer, (SubLObject)named_entity_recognizer.$sym95$NAMED_ENTITY_RECOGNIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject get_stanford_ner_known_cyc_types(final SubLObject stanford_ner) {
        final SubLObject v_class = (SubLObject)(stanford_ner.isSymbol() ? classes.classes_retrieve_class(stanford_ner) : ((named_entity_recognizer.NIL != subloop_structures.class_p(stanford_ner)) ? stanford_ner : ((named_entity_recognizer.NIL != subloop_structures.instance_p(stanford_ner)) ? subloop_structures.instance_class(stanford_ner) : named_entity_recognizer.NIL)));
        if (named_entity_recognizer.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)named_entity_recognizer.$sym99$KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)named_entity_recognizer.TWO_INTEGER);
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject set_stanford_ner_known_cyc_types(final SubLObject stanford_ner, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(stanford_ner.isSymbol() ? classes.classes_retrieve_class(stanford_ner) : ((named_entity_recognizer.NIL != subloop_structures.class_p(stanford_ner)) ? stanford_ner : ((named_entity_recognizer.NIL != subloop_structures.instance_p(stanford_ner)) ? subloop_structures.instance_class(stanford_ner) : named_entity_recognizer.NIL)));
        if (named_entity_recognizer.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)named_entity_recognizer.$sym99$KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)named_entity_recognizer.TWO_INTEGER, value);
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject get_stanford_ner_type_map(final SubLObject stanford_ner) {
        final SubLObject v_class = (SubLObject)(stanford_ner.isSymbol() ? classes.classes_retrieve_class(stanford_ner) : ((named_entity_recognizer.NIL != subloop_structures.class_p(stanford_ner)) ? stanford_ner : ((named_entity_recognizer.NIL != subloop_structures.instance_p(stanford_ner)) ? subloop_structures.instance_class(stanford_ner) : named_entity_recognizer.NIL)));
        if (named_entity_recognizer.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)named_entity_recognizer.$sym100$TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)named_entity_recognizer.ONE_INTEGER);
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject set_stanford_ner_type_map(final SubLObject stanford_ner, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(stanford_ner.isSymbol() ? classes.classes_retrieve_class(stanford_ner) : ((named_entity_recognizer.NIL != subloop_structures.class_p(stanford_ner)) ? stanford_ner : ((named_entity_recognizer.NIL != subloop_structures.instance_p(stanford_ner)) ? subloop_structures.instance_class(stanford_ner) : named_entity_recognizer.NIL)));
        if (named_entity_recognizer.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)named_entity_recognizer.$sym100$TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)named_entity_recognizer.ONE_INTEGER, value);
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject subloop_reserved_initialize_stanford_ner_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym8$INSTANCE_COUNT, (SubLObject)named_entity_recognizer.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym100$TYPE_MAP, (SubLObject)named_entity_recognizer.$list101);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym99$KNOWN_CYC_TYPES, (SubLObject)named_entity_recognizer.$list102);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject subloop_reserved_initialize_stanford_ner_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym10$ISOLATED_P, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym11$INSTANCE_NUMBER, (SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 13737L)
    public static SubLObject stanford_ner_p(final SubLObject stanford_ner) {
        return classes.subloop_instanceof_class(stanford_ner, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 14258L)
    public static SubLObject stanford_ner_to_cyc_method(final SubLObject self, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_stanford_ner_method = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject type_map = get_stanford_ner_type_map(self);
        try {
            thread.throwStack.push(named_entity_recognizer.$sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)named_entity_recognizer.$sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD, conses_high.assoc(type, type_map, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED).rest());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)named_entity_recognizer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_stanford_ner_type_map(self, type_map);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_stanford_ner_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_stanford_ner_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 14354L)
    public static SubLObject stanford_ner_run_method(final SubLObject self, final SubLObject text) {
        assert named_entity_recognizer.NIL != Types.stringp(text) : text;
        final SubLObject stanford_tokens = stanford_ner(text, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        SubLObject latest_string = stanford_tokens.first();
        SubLObject latest_type = Packages.intern(conses_high.second(stanford_tokens), (SubLObject)named_entity_recognizer.UNPROVIDED);
        SubLObject entities = (SubLObject)named_entity_recognizer.NIL;
        SubLObject tokens = (SubLObject)named_entity_recognizer.NIL;
        SubLObject string = (SubLObject)named_entity_recognizer.NIL;
        SubLObject type = (SubLObject)named_entity_recognizer.NIL;
        tokens = conses_high.cddr(stanford_tokens);
        string = tokens.first();
        type = Packages.intern(conses_high.second(tokens), (SubLObject)named_entity_recognizer.UNPROVIDED);
        while (named_entity_recognizer.NIL != tokens) {
            if (type.eql(latest_type) && !named_entity_recognizer.$sym90$O.eql(type)) {
                latest_string = build_mwl(latest_string, string);
            }
            else {
                entities = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_contextualized_named_entity(latest_string, latest_type, self, text, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, methods.funcall_instance_method_with_1_args(self, (SubLObject)named_entity_recognizer.$sym105$TO_CYC, latest_type))), entities);
                latest_string = string;
                latest_type = type;
            }
            tokens = conses_high.cddr(tokens);
            string = tokens.first();
            type = Packages.intern(conses_high.second(tokens), (SubLObject)named_entity_recognizer.UNPROVIDED);
        }
        entities = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_contextualized_named_entity(latest_string, latest_type, self, text, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, methods.funcall_instance_method_with_1_args(self, (SubLObject)named_entity_recognizer.$sym105$TO_CYC, latest_type))), entities);
        return Sequences.nreverse(entities);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 15787L)
    public static SubLObject build_mwl(final SubLObject s1, final SubLObject s3) {
        return Sequences.cconcatenate(s1, new SubLObject[] { (named_entity_recognizer.NIL != string_utilities.punctuation_string_p(s3)) ? named_entity_recognizer.$str113$ : named_entity_recognizer.$str114$_, s3 });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 15946L)
    public static SubLObject stanford_ner_merge_clusters_method(final SubLObject self, final SubLObject clusters, final SubLObject lexicon) {
        SubLObject new_clusters = (SubLObject)named_entity_recognizer.NIL;
        SubLObject prev_ne = (SubLObject)named_entity_recognizer.NIL;
        SubLObject ante_prev_ne = (SubLObject)named_entity_recognizer.NIL;
        SubLObject list_var = (SubLObject)named_entity_recognizer.NIL;
        SubLObject cluster = (SubLObject)named_entity_recognizer.NIL;
        SubLObject cluster_num = (SubLObject)named_entity_recognizer.NIL;
        list_var = clusters;
        cluster = list_var.first();
        for (cluster_num = (SubLObject)named_entity_recognizer.ZERO_INTEGER; named_entity_recognizer.NIL != list_var; list_var = list_var.rest(), cluster = list_var.first(), cluster_num = Numbers.add((SubLObject)named_entity_recognizer.ONE_INTEGER, cluster_num)) {
            final SubLObject ne = cluster.first();
            if (named_entity_recognizer.NIL != prev_ne && named_entity_recognizer.NIL != ante_prev_ne && methods.funcall_instance_method_with_0_args(ne, (SubLObject)named_entity_recognizer.$sym31$GET_CYC).equal(named_entity_recognizer.$const118$Place) && named_entity_recognizer.$str119$_.equal(methods.funcall_instance_method_with_0_args(prev_ne, (SubLObject)named_entity_recognizer.$sym22$GET_STRING)) && methods.funcall_instance_method_with_0_args(ante_prev_ne, (SubLObject)named_entity_recognizer.$sym31$GET_CYC).equal(named_entity_recognizer.$const118$Place) && named_entity_recognizer.NIL != ne_has_state_denotP(lexicon, ne) && named_entity_recognizer.NIL == ne_has_state_denotP(lexicon, ante_prev_ne)) {
                final SubLObject new_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(methods.funcall_instance_method_with_0_args(ante_prev_ne, (SubLObject)named_entity_recognizer.$sym22$GET_STRING)), new SubLObject[] { named_entity_recognizer.$str120$__, format_nil.format_nil_a_no_copy(methods.funcall_instance_method_with_0_args(ne, (SubLObject)named_entity_recognizer.$sym22$GET_STRING)) });
                final SubLObject type = (SubLObject)named_entity_recognizer.$sym121$LOCATION;
                final SubLObject text = instances.get_slot(ne, (SubLObject)named_entity_recognizer.$sym47$CONTEXT);
                prev_ne = new_contextualized_named_entity(new_string, type, self, text, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, methods.funcall_instance_method_with_1_args(self, (SubLObject)named_entity_recognizer.$sym105$TO_CYC, type));
                ante_prev_ne = conses_high.caar(new_clusters);
                new_clusters = new_clusters.rest();
            }
            else {
                if (named_entity_recognizer.NIL != ante_prev_ne) {
                    new_clusters = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ante_prev_ne), new_clusters);
                }
                ante_prev_ne = prev_ne;
                prev_ne = ne;
            }
        }
        if (named_entity_recognizer.NIL != ante_prev_ne) {
            new_clusters = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ante_prev_ne), new_clusters);
        }
        if (named_entity_recognizer.NIL != prev_ne) {
            new_clusters = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(prev_ne), new_clusters);
        }
        return Sequences.nreverse(new_clusters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 17461L)
    public static SubLObject ne_has_state_denotP(final SubLObject lexicon, final SubLObject ne) {
        final SubLObject string = methods.funcall_instance_method_with_0_args(ne, (SubLObject)named_entity_recognizer.$sym22$GET_STRING);
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)named_entity_recognizer.$sym123$GET, string);
        SubLObject entry = (SubLObject)named_entity_recognizer.NIL;
        entry = cdolist_list_var.first();
        while (named_entity_recognizer.NIL != cdolist_list_var) {
            if (named_entity_recognizer.NIL != isa.isaP(methods.funcall_instance_method_with_1_args(entry, (SubLObject)named_entity_recognizer.$sym123$GET, (SubLObject)named_entity_recognizer.$kw124$DENOT), named_entity_recognizer.$const125$State_US, named_entity_recognizer.$const126$InferencePSC, (SubLObject)named_entity_recognizer.UNPROVIDED)) {
                return (SubLObject)named_entity_recognizer.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 18069L)
    public static SubLObject stanford_ner_ping(SubLObject host, SubLObject port) {
        if (host == named_entity_recognizer.UNPROVIDED) {
            host = named_entity_recognizer.$stanford_ner_host$.getDynamicValue();
        }
        if (port == named_entity_recognizer.UNPROVIDED) {
            port = named_entity_recognizer.$stanford_ner_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)named_entity_recognizer.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)named_entity_recognizer.$sym88$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    stanford_ner((SubLObject)named_entity_recognizer.$str131$The_cat_sat_on_the_mat_, host, port);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)named_entity_recognizer.NIL);
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
        return (SubLObject)SubLObjectFactory.makeBoolean(named_entity_recognizer.NIL == error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 18415L)
    public static SubLObject stanford_ner(final SubLObject string, SubLObject host, SubLObject port) {
        if (host == named_entity_recognizer.UNPROVIDED) {
            host = named_entity_recognizer.$stanford_ner_host$.getDynamicValue();
        }
        if (port == named_entity_recognizer.UNPROVIDED) {
            port = named_entity_recognizer.$stanford_ner_port$.getDynamicValue();
        }
        SubLObject result = (SubLObject)named_entity_recognizer.NIL;
        SubLObject stream = (SubLObject)named_entity_recognizer.NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(host, port, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$kw132$PUBLIC);
            if (named_entity_recognizer.NIL != subl_macro_promotions.validate_tcp_connection(stream, host, port)) {
                print_high.princ(string, stream);
                streams_high.terpri(stream);
                streams_high.finish_output(stream);
                result = string_utilities.split_string(string_utilities.trim_whitespace(streams_high.read_line(stream, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED)), (SubLObject)named_entity_recognizer.$list133);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)named_entity_recognizer.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (named_entity_recognizer.NIL != stream) {
                    streams_high.close(stream, (SubLObject)named_entity_recognizer.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
    public static SubLObject subloop_reserved_initialize_resporator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym8$INSTANCE_COUNT, (SubLObject)named_entity_recognizer.ZERO_INTEGER);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
    public static SubLObject subloop_reserved_initialize_resporator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym10$ISOLATED_P, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$sym11$INSTANCE_NUMBER, (SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19295L)
    public static SubLObject resporator_p(final SubLObject resporator) {
        return classes.subloop_instanceof_class(resporator, (SubLObject)named_entity_recognizer.$sym134$RESPORATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19478L)
    public static SubLObject resporator_run_method(final SubLObject self, final SubLObject text) {
        assert named_entity_recognizer.NIL != Types.stringp(text) : text;
        SubLObject entities = (SubLObject)named_entity_recognizer.NIL;
        SubLObject tokens = (SubLObject)named_entity_recognizer.NIL;
        SubLObject entity = (SubLObject)named_entity_recognizer.NIL;
        SubLObject card = (SubLObject)named_entity_recognizer.NIL;
        tokens = external_interfaces.resporator(text, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        entity = methods.funcall_instance_method_with_1_args(self, (SubLObject)named_entity_recognizer.$sym138$NEXT_RESPORATOR_ENTITY, tokens);
        card = Sequences.length(entity);
        while (named_entity_recognizer.NIL != entity) {
            entities = (SubLObject)ConsesLow.cons(entity, entities);
            tokens = conses_high.nthcdr(card, tokens);
            entity = methods.funcall_instance_method_with_1_args(self, (SubLObject)named_entity_recognizer.$sym138$NEXT_RESPORATOR_ENTITY, tokens);
            card = Sequences.length(entity);
        }
        return Sequences.nreverse(entities);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 19915L)
    public static SubLObject resporator_next_resporator_entity_method(final SubLObject self, final SubLObject tokens) {
        if (named_entity_recognizer.NIL == tokens) {
            return (SubLObject)named_entity_recognizer.NIL;
        }
        final SubLObject first = tokens.first();
        SubLObject disjunction = (SubLObject)ConsesLow.list(new_named_entity(first.rest(), first.first(), self, (SubLObject)named_entity_recognizer.NIL, resporator_to_cycl(first.first())));
        final SubLObject type = first.first();
        final SubLObject string = first.rest();
        SubLObject types_so_far = (SubLObject)ConsesLow.list(type);
        SubLObject cdolist_list_var = tokens.rest();
        SubLObject typeXstring = (SubLObject)named_entity_recognizer.NIL;
        typeXstring = cdolist_list_var.first();
        while (named_entity_recognizer.NIL != cdolist_list_var) {
            if (!typeXstring.rest().equal(string) || named_entity_recognizer.NIL != conses_high.member(typeXstring.first(), types_so_far, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED)) {
                return disjunction;
            }
            disjunction = (SubLObject)ConsesLow.cons(new_named_entity(typeXstring.rest(), typeXstring.first(), self, (SubLObject)named_entity_recognizer.NIL, resporator_to_cycl(typeXstring.first())), disjunction);
            types_so_far = (SubLObject)ConsesLow.cons(typeXstring.first(), types_so_far);
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        }
        return disjunction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 20851L)
    public static SubLObject build_resporator_to_cycl_map() {
        final SubLObject map = Hashtables.make_hash_table((SubLObject)named_entity_recognizer.$int144$100, Symbols.symbol_function((SubLObject)named_entity_recognizer.EQL), (SubLObject)named_entity_recognizer.UNPROVIDED);
        SubLObject cdolist_list_var = (SubLObject)named_entity_recognizer.$list146;
        SubLObject predicate = (SubLObject)named_entity_recognizer.NIL;
        predicate = cdolist_list_var.first();
        while (named_entity_recognizer.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$16 = kb_mapping.gather_predicate_extent_index(predicate, named_entity_recognizer.$const145$GuruQAMt, (SubLObject)named_entity_recognizer.UNPROVIDED);
            SubLObject assertion = (SubLObject)named_entity_recognizer.NIL;
            assertion = cdolist_list_var_$16.first();
            while (named_entity_recognizer.NIL != cdolist_list_var_$16) {
                Hashtables.sethash(Packages.intern(string_utilities.strip_final(assertions_high.gaf_arg1(assertion), (SubLObject)named_entity_recognizer.UNPROVIDED), (SubLObject)named_entity_recognizer.UNPROVIDED), map, assertions_high.gaf_arg2(assertion));
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                assertion = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21269L)
    public static SubLObject maybe_initialize_resporator_to_cycl_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (named_entity_recognizer.NIL == named_entity_recognizer.$resporator_to_cycl_map$.getDynamicValue(thread)) {
            named_entity_recognizer.$resporator_to_cycl_map$.setDynamicValue(build_resporator_to_cycl_map(), thread);
        }
        return (SubLObject)named_entity_recognizer.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21446L)
    public static SubLObject resporator_to_cycl(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(type, named_entity_recognizer.$resporator_to_cycl_map$.getDynamicValue(thread), (SubLObject)named_entity_recognizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21537L)
    public static SubLObject get_nament_instance_meaning(final SubLObject nament) {
        if (named_entity_recognizer.$sym147$DATE.eql(methods.funcall_instance_method_with_0_args(nament, (SubLObject)named_entity_recognizer.$sym27$GET_TYPE))) {
            return date_utilities.parse_date_from_string_fast(methods.funcall_instance_method_with_0_args(nament, (SubLObject)named_entity_recognizer.$sym22$GET_STRING), (SubLObject)named_entity_recognizer.T, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        }
        if (named_entity_recognizer.$sym121$LOCATION.eql(methods.funcall_instance_method_with_0_args(nament, (SubLObject)named_entity_recognizer.$sym27$GET_TYPE))) {
            return get_specific_place_from_string(methods.funcall_instance_method_with_0_args(nament, (SubLObject)named_entity_recognizer.$sym22$GET_STRING));
        }
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 21893L)
    public static SubLObject get_specific_place_from_string(final SubLObject string) {
        SubLObject more_specific_places = (SubLObject)named_entity_recognizer.NIL;
        final SubLObject lexicon = get_place_tightening_lexicon();
        final SubLObject entity_doc = document_annotation_widgets.new_tagged_document(string, lexicon, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        final SubLObject downcased_entity_doc = document_annotation_widgets.new_tagged_document(Strings.string_downcase(string, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED), lexicon, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
        final SubLObject last_word_index = Numbers.subtract(document.document_word_length(entity_doc), (SubLObject)named_entity_recognizer.ONE_INTEGER);
        final SubLObject head_word = document.document_get_word(entity_doc, last_word_index);
        final SubLObject downcased_head_word = document.document_get_word(downcased_entity_doc, last_word_index);
        SubLObject cdolist_list_var;
        final SubLObject head_word_cycls = cdolist_list_var = Sequences.cconcatenate(document.word_cycls(downcased_head_word), document.word_cycls(head_word));
        SubLObject head_word_cycl = (SubLObject)named_entity_recognizer.NIL;
        head_word_cycl = cdolist_list_var.first();
        while (named_entity_recognizer.NIL != cdolist_list_var) {
            if (named_entity_recognizer.NIL != genls.genlsP(head_word_cycl, named_entity_recognizer.$const148$EnduringThing_Localized, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED)) {
                more_specific_places = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(named_entity_recognizer.$const149$InstanceNamedFn_Ternary, string, head_word_cycl, Guids.guid_to_string(Guids.new_guid())), more_specific_places);
            }
            if (named_entity_recognizer.NIL != isa.isaP(head_word_cycl, named_entity_recognizer.$const150$State_UnitedStates, named_entity_recognizer.$const126$InferencePSC, (SubLObject)named_entity_recognizer.UNPROVIDED) && named_entity_recognizer.TWO_INTEGER.numGE(last_word_index) && named_entity_recognizer.$str119$_.equal(document.word_string(document.document_get_word(entity_doc, Numbers.subtract(last_word_index, (SubLObject)named_entity_recognizer.ONE_INTEGER))))) {
                final SubLObject place_name_string = document.sentence_reconstruct_substring((SubLObject)named_entity_recognizer.ZERO_INTEGER, Numbers.subtract(last_word_index, (SubLObject)named_entity_recognizer.ONE_INTEGER), document.word_mother(head_word));
                more_specific_places = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(named_entity_recognizer.$const151$GeopoliticalEntityNamedFn, place_name_string, head_word_cycl), more_specific_places);
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_word_cycl = cdolist_list_var.first();
        }
        return more_specific_places;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23725L)
    public static SubLObject clear_place_tightening_lexicon() {
        named_entity_recognizer.$place_tightening_lexicon$.setDynamicValue((SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 23830L)
    public static SubLObject get_place_tightening_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (named_entity_recognizer.NIL == term_lexicon.term_lexicon_p(named_entity_recognizer.$place_tightening_lexicon$.getDynamicValue(thread))) {
            named_entity_recognizer.$place_tightening_lexicon$.setDynamicValue(concept_tagger.make_default_concept_tagger_lexicon(), thread);
            methods.funcall_instance_method_with_1_args(named_entity_recognizer.$place_tightening_lexicon$.getDynamicValue(thread), (SubLObject)named_entity_recognizer.$sym152$SET_CASE_SENSITIVITY, (SubLObject)named_entity_recognizer.$kw153$OFF);
            methods.funcall_instance_method_with_1_args(named_entity_recognizer.$place_tightening_lexicon$.getDynamicValue(thread), (SubLObject)named_entity_recognizer.$sym154$SET_LEARNERS, (SubLObject)named_entity_recognizer.NIL);
            methods.funcall_instance_method_with_0_args(named_entity_recognizer.$place_tightening_lexicon$.getDynamicValue(thread), (SubLObject)named_entity_recognizer.$sym54$IGNORE_CACHE);
        }
        return named_entity_recognizer.$place_tightening_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
    public static SubLObject ne_test_tighten_type(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_types = (SubLObject)named_entity_recognizer.NIL;
        SubLObject ignore_errors_tag = (SubLObject)named_entity_recognizer.NIL;
        try {
            thread.throwStack.push(named_entity_recognizer.$kw155$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)named_entity_recognizer.$sym156$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject start_pos = Sequences.search(term_string, passage_string, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                    final SubLObject ne = new_contextualized_named_entity(term_string, base_type, (SubLObject)named_entity_recognizer.NIL, passage_string, (SubLObject)ConsesLow.list(start_pos), (SubLObject)named_entity_recognizer.UNPROVIDED, (SubLObject)named_entity_recognizer.UNPROVIDED);
                    result_types = methods.funcall_instance_method_with_0_args(ne, (SubLObject)named_entity_recognizer.$sym62$TIGHTEN_TYPE).first();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)named_entity_recognizer.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)named_entity_recognizer.$kw155$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return result_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
    public static SubLObject ne_test_tighten_type_undesired_return(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type) {
        return ne_test_tighten_type(passage_string, term_string, base_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
    public static SubLObject ne_test_func(final SubLObject thing1, final SubLObject thing2) {
        return conses_high.member(narts_high.nart_substitute(czer_main.canonicalize_term(thing2, (SubLObject)named_entity_recognizer.UNPROVIDED)), czer_main.canonicalize_term(thing1, (SubLObject)named_entity_recognizer.UNPROVIDED), (SubLObject)named_entity_recognizer.$sym157$PATTERN_MATCHES_FORMULA, (SubLObject)named_entity_recognizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/named-entity-recognizer.lisp", position = 24902L)
    public static SubLObject ne_test_func_not_member(final SubLObject thing1, final SubLObject thing2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(named_entity_recognizer.NIL == subl_promotions.memberP(narts_high.nart_substitute(czer_main.canonicalize_term(thing2, (SubLObject)named_entity_recognizer.UNPROVIDED)), czer_main.canonicalize_term(thing1, (SubLObject)named_entity_recognizer.UNPROVIDED), (SubLObject)named_entity_recognizer.EQUAL, (SubLObject)named_entity_recognizer.UNPROVIDED));
    }
    
    public static SubLObject declare_named_entity_recognizer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_named_entity_confidence", "GET-NAMED-ENTITY-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_named_entity_confidence", "SET-NAMED-ENTITY-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_named_entity_cyc", "GET-NAMED-ENTITY-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_named_entity_cyc", "SET-NAMED-ENTITY-CYC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_named_entity_source", "GET-NAMED-ENTITY-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_named_entity_source", "SET-NAMED-ENTITY-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_named_entity_type", "GET-NAMED-ENTITY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_named_entity_type", "SET-NAMED-ENTITY-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_named_entity_string", "GET-NAMED-ENTITY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_named_entity_string", "SET-NAMED-ENTITY-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_p", "NAMED-ENTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "new_named_entity", "NEW-NAMED-ENTITY", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_print_method", "NAMED-ENTITY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_get_string_method", "NAMED-ENTITY-GET-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_get_type_method", "NAMED-ENTITY-GET-TYPE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_get_cyc_method", "NAMED-ENTITY-GET-CYC-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_get_confidence_method", "NAMED-ENTITY-GET-CONFIDENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_get_source_method", "NAMED-ENTITY-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_contextualized_named_entity_subtypes", "GET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_contextualized_named_entity_subtypes", "SET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_contextualized_named_entity_offsets", "GET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_contextualized_named_entity_offsets", "SET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_contextualized_named_entity_context", "GET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_contextualized_named_entity_context", "SET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_contextualized_named_entity_lexicon", "GET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_contextualized_named_entity_lexicon", "SET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_contextualized_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_contextualized_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "contextualized_named_entity_p", "CONTEXTUALIZED-NAMED-ENTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "new_contextualized_named_entity", "NEW-CONTEXTUALIZED-NAMED-ENTITY", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "contextualized_named_entity_get_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "contextualized_named_entity_set_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "denot_collections", "DENOT-COLLECTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "contextualized_named_entity_tighten_type_method", "CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "tighter_types_from_answer", "TIGHTER-TYPES-FROM-ANSWER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "tighter_types_from_string", "TIGHTER-TYPES-FROM-STRING", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "concepts_from_document", "CONCEPTS-FROM-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_trees_to_head", "GET-TREES-TO-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "string_acceptably_short_for_ps_parseP", "STRING-ACCEPTABLY-SHORT-FOR-PS-PARSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "denots_of_ps_harvest_nbars_internal", "DENOTS-OF-PS-HARVEST-NBARS-INTERNAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "denots_of_ps_harvest_nbars", "DENOTS-OF-PS-HARVEST-NBARS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_max_span_from_psp_result", "GET-MAX-SPAN-FROM-PSP-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "clear_named_entityP", "CLEAR-NAMED-ENTITY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "remove_named_entityP", "REMOVE-NAMED-ENTITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entityP_internal", "NAMED-ENTITY?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entityP", "NAMED-ENTITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "named_entity_recognizer_p", "NAMED-ENTITY-RECOGNIZER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_stanford_ner_known_cyc_types", "GET-STANFORD-NER-KNOWN-CYC-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_stanford_ner_known_cyc_types", "SET-STANFORD-NER-KNOWN-CYC-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_stanford_ner_type_map", "GET-STANFORD-NER-TYPE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "set_stanford_ner_type_map", "SET-STANFORD-NER-TYPE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_stanford_ner_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_stanford_ner_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner_p", "STANFORD-NER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner_to_cyc_method", "STANFORD-NER-TO-CYC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner_run_method", "STANFORD-NER-RUN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "build_mwl", "BUILD-MWL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner_merge_clusters_method", "STANFORD-NER-MERGE-CLUSTERS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "ne_has_state_denotP", "NE-HAS-STATE-DENOT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner_ping", "STANFORD-NER-PING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "stanford_ner", "STANFORD-NER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_resporator_class", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "subloop_reserved_initialize_resporator_instance", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "resporator_p", "RESPORATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "resporator_run_method", "RESPORATOR-RUN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "resporator_next_resporator_entity_method", "RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "build_resporator_to_cycl_map", "BUILD-RESPORATOR-TO-CYCL-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "maybe_initialize_resporator_to_cycl_map", "MAYBE-INITIALIZE-RESPORATOR-TO-CYCL-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "resporator_to_cycl", "RESPORATOR-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_nament_instance_meaning", "GET-NAMENT-INSTANCE-MEANING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_specific_place_from_string", "GET-SPECIFIC-PLACE-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "clear_place_tightening_lexicon", "CLEAR-PLACE-TIGHTENING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "get_place_tightening_lexicon", "GET-PLACE-TIGHTENING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "ne_test_tighten_type", "NE-TEST-TIGHTEN-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "ne_test_tighten_type_undesired_return", "NE-TEST-TIGHTEN-TYPE-UNDESIRED-RETURN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "ne_test_func", "NE-TEST-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.named_entity_recognizer", "ne_test_func_not_member", "NE-TEST-FUNC-NOT-MEMBER", 2, 0, false);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    public static SubLObject init_named_entity_recognizer_file() {
        named_entity_recognizer.$break_named_entityP$ = SubLFiles.defparameter("*BREAK-NAMED-ENTITY?*", (SubLObject)named_entity_recognizer.NIL);
        named_entity_recognizer.$named_entityP_caching_state$ = SubLFiles.deflexical("*NAMED-ENTITY?-CACHING-STATE*", (SubLObject)named_entity_recognizer.NIL);
        named_entity_recognizer.$stanford_ner_host$ = SubLFiles.defparameter("*STANFORD-NER-HOST*", (SubLObject)named_entity_recognizer.$str128$localhost);
        named_entity_recognizer.$stanford_ner_port$ = SubLFiles.defparameter("*STANFORD-NER-PORT*", (SubLObject)named_entity_recognizer.$int130$6666);
        named_entity_recognizer.$resporator_to_cycl_map$ = SubLFiles.defvar("*RESPORATOR-TO-CYCL-MAP*", (SubLObject)named_entity_recognizer.NIL);
        named_entity_recognizer.$place_tightening_lexicon$ = SubLFiles.defparameter("*PLACE-TIGHTENING-LEXICON*", (SubLObject)named_entity_recognizer.NIL);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    public static SubLObject setup_named_entity_recognizer_file() {
        classes.subloop_new_class((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE);
        subloop_reserved_initialize_named_entity_class((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym13$PRINT, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list14, (SubLObject)named_entity_recognizer.$list15, (SubLObject)named_entity_recognizer.$list16);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym13$PRINT, (SubLObject)named_entity_recognizer.$sym21$NAMED_ENTITY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym22$GET_STRING, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list24);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym22$GET_STRING, (SubLObject)named_entity_recognizer.$sym26$NAMED_ENTITY_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym27$GET_TYPE, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list28);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym27$GET_TYPE, (SubLObject)named_entity_recognizer.$sym30$NAMED_ENTITY_GET_TYPE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym31$GET_CYC, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list32);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym31$GET_CYC, (SubLObject)named_entity_recognizer.$sym34$NAMED_ENTITY_GET_CYC_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym35$GET_CONFIDENCE, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list36);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym35$GET_CONFIDENCE, (SubLObject)named_entity_recognizer.$sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym39$GET_SOURCE, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list40);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym39$GET_SOURCE, (SubLObject)named_entity_recognizer.$sym42$NAMED_ENTITY_GET_SOURCE_METHOD);
        classes.subloop_new_class((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym0$NAMED_ENTITY, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list44);
        classes.class_set_implements_slot_listeners((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE);
        subloop_reserved_initialize_contextualized_named_entity_class((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY);
        methods.methods_incorporate_class_method((SubLObject)named_entity_recognizer.$sym51$GET_LEXICON, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list52);
        methods.subloop_register_class_method((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym51$GET_LEXICON, (SubLObject)named_entity_recognizer.$sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD);
        methods.methods_incorporate_class_method((SubLObject)named_entity_recognizer.$sym56$SET_LEXICON, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.$list57, (SubLObject)named_entity_recognizer.$list58);
        methods.subloop_register_class_method((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym56$SET_LEXICON, (SubLObject)named_entity_recognizer.$sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym62$TIGHTEN_TYPE, (SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.$list63, (SubLObject)named_entity_recognizer.$list64);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym43$CONTEXTUALIZED_NAMED_ENTITY, (SubLObject)named_entity_recognizer.$sym62$TIGHTEN_TYPE, (SubLObject)named_entity_recognizer.$sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD);
        memoization_state.note_memoized_function((SubLObject)named_entity_recognizer.$sym83$DENOTS_OF_PS_HARVEST_NBARS);
        memoization_state.note_globally_cached_function((SubLObject)named_entity_recognizer.$sym86$NAMED_ENTITY_);
        interfaces.new_interface((SubLObject)named_entity_recognizer.$sym95$NAMED_ENTITY_RECOGNIZER, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list96);
        classes.subloop_new_class((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$list97, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list98);
        classes.class_set_implements_slot_listeners((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE);
        subloop_reserved_initialize_stanford_ner_class((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER);
        methods.methods_incorporate_class_method((SubLObject)named_entity_recognizer.$sym105$TO_CYC, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$list14, (SubLObject)named_entity_recognizer.$list106, (SubLObject)named_entity_recognizer.$list107);
        methods.subloop_register_class_method((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym105$TO_CYC, (SubLObject)named_entity_recognizer.$sym109$STANFORD_NER_TO_CYC_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym92$RUN, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.$list110, (SubLObject)named_entity_recognizer.$list111);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym92$RUN, (SubLObject)named_entity_recognizer.$sym112$STANFORD_NER_RUN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym115$MERGE_CLUSTERS, (SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.$list116, (SubLObject)named_entity_recognizer.$list117);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym89$STANFORD_NER, (SubLObject)named_entity_recognizer.$sym115$MERGE_CLUSTERS, (SubLObject)named_entity_recognizer.$sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD);
        access_macros.register_external_symbol((SubLObject)named_entity_recognizer.$sym127$_STANFORD_NER_HOST_);
        access_macros.register_external_symbol((SubLObject)named_entity_recognizer.$sym129$_STANFORD_NER_PORT_);
        classes.subloop_new_class((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$sym1$OBJECT, (SubLObject)named_entity_recognizer.$list97, (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.$list96);
        classes.class_set_implements_slot_listeners((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE);
        subloop_reserved_initialize_resporator_class((SubLObject)named_entity_recognizer.$sym134$RESPORATOR);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym92$RUN, (SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$list23, (SubLObject)named_entity_recognizer.$list110, (SubLObject)named_entity_recognizer.$list137);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$sym92$RUN, (SubLObject)named_entity_recognizer.$sym139$RESPORATOR_RUN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)named_entity_recognizer.$sym138$NEXT_RESPORATOR_ENTITY, (SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$list140, (SubLObject)named_entity_recognizer.$list141, (SubLObject)named_entity_recognizer.$list142);
        methods.subloop_register_instance_method((SubLObject)named_entity_recognizer.$sym134$RESPORATOR, (SubLObject)named_entity_recognizer.$sym138$NEXT_RESPORATOR_ENTITY, (SubLObject)named_entity_recognizer.$sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD);
        generic_testing.define_test_case_table_int((SubLObject)named_entity_recognizer.$sym158$NE_TEST_TIGHTEN_TYPE, (SubLObject)ConsesLow.list(new SubLObject[] { named_entity_recognizer.$kw159$TEST, Symbols.symbol_function((SubLObject)named_entity_recognizer.$sym160$NE_TEST_FUNC), named_entity_recognizer.$kw161$OWNER, named_entity_recognizer.NIL, named_entity_recognizer.$kw162$CLASSES, named_entity_recognizer.$list163, named_entity_recognizer.$kw164$KB, named_entity_recognizer.$kw165$FULL, named_entity_recognizer.$kw166$WORKING_, named_entity_recognizer.T }), (SubLObject)named_entity_recognizer.$list167);
        return (SubLObject)named_entity_recognizer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_named_entity_recognizer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_named_entity_recognizer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_named_entity_recognizer_file();
    }
    
    static {
        me = (SubLFile)new named_entity_recognizer();
        named_entity_recognizer.$break_named_entityP$ = null;
        named_entity_recognizer.$named_entityP_caching_state$ = null;
        named_entity_recognizer.$stanford_ner_host$ = null;
        named_entity_recognizer.$stanford_ner_port$ = null;
        named_entity_recognizer.$resporator_to_cycl_map$ = null;
        named_entity_recognizer.$place_tightening_lexicon$ = null;
        $sym0$NAMED_ENTITY = SubLObjectFactory.makeSymbol("NAMED-ENTITY");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TYPE"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym3$CONFIDENCE = SubLObjectFactory.makeSymbol("CONFIDENCE");
        $sym4$CYC = SubLObjectFactory.makeSymbol("CYC");
        $sym5$SOURCE = SubLObjectFactory.makeSymbol("SOURCE");
        $sym6$TYPE = SubLObjectFactory.makeSymbol("TYPE");
        $sym7$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym8$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS");
        $sym10$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym11$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE");
        $sym13$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this named entity to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<NE: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("/"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $str18$__NE__ = SubLObjectFactory.makeString("#<NE: ");
        $str19$_ = SubLObjectFactory.makeString("/");
        $str20$_ = SubLObjectFactory.makeString(">");
        $sym21$NAMED_ENTITY_PRINT_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-PRINT-METHOD");
        $sym22$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the string of this named-entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $sym26$NAMED_ENTITY_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-GET-STRING-METHOD");
        $sym27$GET_TYPE = SubLObjectFactory.makeSymbol("GET-TYPE");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return object; the native type of this named-entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")));
        $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $sym30$NAMED_ENTITY_GET_TYPE_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-GET-TYPE-METHOD");
        $sym31$GET_CYC = SubLObjectFactory.makeSymbol("GET-CYC");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the cyc type of this named-entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYC")));
        $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $sym34$NAMED_ENTITY_GET_CYC_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-GET-CYC-METHOD");
        $sym35$GET_CONFIDENCE = SubLObjectFactory.makeSymbol("GET-CONFIDENCE");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the confidence of this named-entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE")));
        $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $sym38$NAMED_ENTITY_GET_CONFIDENCE_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-GET-CONFIDENCE-METHOD");
        $sym39$GET_SOURCE = SubLObjectFactory.makeSymbol("GET-SOURCE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return named-entity-recognizer-p; the ner that created this named-entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE")));
        $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");
        $sym42$NAMED_ENTITY_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("NAMED-ENTITY-GET-SOURCE-METHOD");
        $sym43$CONTEXTUALIZED_NAMED_ENTITY = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-NAMED-ENTITY");
        $list44 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSETS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXICON"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LEXICON"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTEXT"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OFFSETS"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTEN-TYPE"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym45$SUBTYPES = SubLObjectFactory.makeSymbol("SUBTYPES");
        $sym46$OFFSETS = SubLObjectFactory.makeSymbol("OFFSETS");
        $sym47$CONTEXT = SubLObjectFactory.makeSymbol("CONTEXT");
        $sym48$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym49$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS");
        $sym50$SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE");
        $sym51$GET_LEXICON = SubLObjectFactory.makeSymbol("GET-LEXICON");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return the lexicon of this entity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")));
        $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");
        $sym54$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $sym55$CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD");
        $sym56$SET_LEXICON = SubLObjectFactory.makeSymbol("SET-LEXICON");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LEXICON term-lexicon-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("LEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")));
        $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");
        $sym60$CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD");
        $sym61$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym62$TIGHTEN_TYPE = SubLObjectFactory.makeSymbol("TIGHTEN-TYPE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPECT-NER-TYPE?"), (SubLObject)named_entity_recognizer.T), (SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-LOOKUP-ONLY?"));
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STANFORD-PARSER"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQL, (SubLObject)SubLObjectFactory.makeSymbol("CYC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)SubLObjectFactory.makeString("Who"), (SubLObject)SubLObjectFactory.makeString("What"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-WORD"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("?"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-STRING"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SIMPLE-PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXICON")))), SubLObjectFactory.makeSymbol("ANSWERS"), SubLObjectFactory.makeSymbol("TIGHTER-TYPES"), SubLObjectFactory.makeSymbol("ANSWER-STRINGS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))) }), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-QUESTION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-QUESTION-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-PARSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQL, (SubLObject)SubLObjectFactory.makeSymbol("CYC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SIMPLE-PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING")), (SubLObject)named_entity_recognizer.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENDS-WITH-START-OF"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)named_entity_recognizer.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" ")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENDS-WITH-START-OF"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)named_entity_recognizer.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" ")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TIGHTER-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIGHTER-TYPES-FROM-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RESPECT-NER-TYPE?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-LOOKUP-ONLY?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTER-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTER-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TIGHTER-TYPES")))))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTYPES"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTER-TYPES")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TIGHTER-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-STRINGS"))) }));
        $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");
        $const66$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $str67$Who = SubLObjectFactory.makeString("Who");
        $str68$What = SubLObjectFactory.makeString("What");
        $str69$is = SubLObjectFactory.makeString("is");
        $str70$_ = SubLObjectFactory.makeString("?");
        $sym71$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym72$DEFINITIONAL_QUESTION = SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION");
        $sym73$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym74$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $const75$Organization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"));
        $sym76$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "));
        $sym78$CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD");
        $sym79$GET_PARSE_TREE = SubLObjectFactory.makeSymbol("GET-PARSE-TREE");
        $kw80$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
        $sym81$GET_HEAD_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS");
        $sym82$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym83$DENOTS_OF_PS_HARVEST_NBARS = SubLObjectFactory.makeSymbol("DENOTS-OF-PS-HARVEST-NBARS");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"));
        $kw85$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym86$NAMED_ENTITY_ = SubLObjectFactory.makeSymbol("NAMED-ENTITY?");
        $sym87$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym88$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym89$STANFORD_NER = SubLObjectFactory.makeSymbol("STANFORD-NER");
        $sym90$O = SubLObjectFactory.makeSymbol("O");
        $sym91$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym92$RUN = SubLObjectFactory.makeSymbol("RUN");
        $str93$Error___S_occured_in_NAMED_ENTITY = SubLObjectFactory.makeString("Error: ~S occured in NAMED-ENTITY? ~%");
        $sym94$_NAMED_ENTITY__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NAMED-ENTITY?-CACHING-STATE*");
        $sym95$NAMED_ENTITY_RECOGNIZER = SubLObjectFactory.makeSymbol("NAMED-ENTITY-RECOGNIZER");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAMED-ENTITY-RECOGNIZER"));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PERSON"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ORGANIZATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LOCATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-CYC-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TO-CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym99$KNOWN_CYC_TYPES = SubLObjectFactory.makeSymbol("KNOWN-CYC-TYPES");
        $sym100$TYPE_MAP = SubLObjectFactory.makeSymbol("TYPE-MAP");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PERSON"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ORGANIZATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LOCATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"))));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")));
        $sym103$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS");
        $sym104$SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE");
        $sym105$TO_CYC = SubLObjectFactory.makeSymbol("TO-CYC");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-MAP")))));
        $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-STANFORD-NER-METHOD");
        $sym109$STANFORD_NER_TO_CYC_METHOD = SubLObjectFactory.makeSymbol("STANFORD-NER-TO-CYC-METHOD");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns the entities recognized by this Stanford named-entity recognizer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-NER"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-TOKENS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"), (SubLObject)named_entity_recognizer.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("STANFORD-TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQL, (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("O")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUILD-MWL"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-CYC")), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE")))), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-CYC")), (SubLObject)SubLObjectFactory.makeSymbol("LATEST-TYPE")))), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES")))));
        $sym112$STANFORD_NER_RUN_METHOD = SubLObjectFactory.makeSymbol("STANFORD-NER-RUN-METHOD");
        $str113$ = SubLObjectFactory.makeString("");
        $str114$_ = SubLObjectFactory.makeString(" ");
        $sym115$MERGE_CLUSTERS = SubLObjectFactory.makeSymbol("MERGE-CLUSTERS");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTERS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merges clusters that the Stanford NER doesn't merge appropriately.  In particular, this merges \n   CITY, STATE cluster, since the NER returns <CITY/PLACE> <,/O> <STATE/PLACE> for things like\n   'Austin, Texas', and returns <CITY/PLACE> <,/O> <STATE/ORGANIZATION> for things like 'Austin, TX'"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS")), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQUAL, (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NE-HAS-STATE-DENOT?"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("NE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NE-HAS-STATE-DENOT?"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-NIL"), (SubLObject)SubLObjectFactory.makeString("~A, ~A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOCATION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)named_entity_recognizer.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TO-CYC")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS")))), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)SubLObjectFactory.makeSymbol("NE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ANTE-PREV-NE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-NE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLUSTERS")))));
        $const118$Place = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"));
        $str119$_ = SubLObjectFactory.makeString(",");
        $str120$__ = SubLObjectFactory.makeString(", ");
        $sym121$LOCATION = SubLObjectFactory.makeSymbol("LOCATION");
        $sym122$STANFORD_NER_MERGE_CLUSTERS_METHOD = SubLObjectFactory.makeSymbol("STANFORD-NER-MERGE-CLUSTERS-METHOD");
        $sym123$GET = SubLObjectFactory.makeSymbol("GET");
        $kw124$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $const125$State_US = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("State-US"));
        $const126$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym127$_STANFORD_NER_HOST_ = SubLObjectFactory.makeSymbol("*STANFORD-NER-HOST*");
        $str128$localhost = SubLObjectFactory.makeString("localhost");
        $sym129$_STANFORD_NER_PORT_ = SubLObjectFactory.makeSymbol("*STANFORD-NER-PORT*");
        $int130$6666 = SubLObjectFactory.makeInteger(6666);
        $str131$The_cat_sat_on_the_mat_ = SubLObjectFactory.makeString("The cat sat on the mat.");
        $kw132$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $list133 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_slash);
        $sym134$RESPORATOR = SubLObjectFactory.makeSymbol("RESPORATOR");
        $sym135$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS");
        $sym136$SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns the entities recognized by this resporator"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"), (SubLObject)named_entity_recognizer.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)SubLObjectFactory.makeSymbol("CARD"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-RESPORATOR-ENTITY")), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-RESPORATOR-ENTITY")), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CARD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES")))));
        $sym138$NEXT_RESPORATOR_ENTITY = SubLObjectFactory.makeSymbol("NEXT-RESPORATOR-ENTITY");
        $sym139$RESPORATOR_RUN_METHOD = SubLObjectFactory.makeSymbol("RESPORATOR-RUN-METHOD");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TOKENS listp;\n   @return listp; a disjunctively interpreted list of named-entity, all with the same\n   string and different types, resulting from a single occurrence in the input text"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)named_entity_recognizer.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAMED-ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPES-SO-FAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)named_entity_recognizer.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-SO-FAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAMED-ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)named_entity_recognizer.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")))), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-SO-FAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTION"))));
        $sym143$RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD = SubLObjectFactory.makeSymbol("RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD");
        $int144$100 = SubLObjectFactory.makeInteger(100);
        $const145$GuruQAMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GuruQAMt"));
        $list146 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("guruqaGenlsToken")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("guruqaTypeToken")));
        $sym147$DATE = SubLObjectFactory.makeSymbol("DATE");
        $const148$EnduringThing_Localized = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnduringThing-Localized"));
        $const149$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $const150$State_UnitedStates = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("State-UnitedStates"));
        $const151$GeopoliticalEntityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntityNamedFn"));
        $sym152$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $kw153$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym154$SET_LEARNERS = SubLObjectFactory.makeSymbol("SET-LEARNERS");
        $kw155$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym156$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym157$PATTERN_MATCHES_FORMULA = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA");
        $sym158$NE_TEST_TIGHTEN_TYPE = SubLObjectFactory.makeSymbol("NE-TEST-TIGHTEN-TYPE");
        $kw159$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym160$NE_TEST_FUNC = SubLObjectFactory.makeSymbol("NE-TEST-FUNC");
        $kw161$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw162$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-PARSING-TEST-CASES"));
        $kw164$KB = SubLObjectFactory.makeKeyword("KB");
        $kw165$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw166$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list167 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Canadian linguist George Lakoff lives in the woods"), (SubLObject)SubLObjectFactory.makeString("George Lakoff"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CitizenFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Canada"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CanadianPerson"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Linguist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Linguist")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CitizenFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Canada"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CanadianPerson")))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("British chef Paul Cunningham opened a new restaurant last week"), (SubLObject)SubLObjectFactory.makeString("Paul Cunningham"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BritishPerson")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Chef"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Chef")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CitizenFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedKingdomOfGreatBritainAndNorthernIreland")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CitizenFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedKingdomOfGreatBritainAndNorthernIreland"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Chef"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa - President of Sri Lanka - was assassinated."), (SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PresidentOfOrganization"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("president")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SriLanka")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa, President of Sri Lanka, was assassinated."), (SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PresidentOfOrganization"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("president")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SriLanka")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa (President of Sri Lanka) was assassinated."), (SubLObject)SubLObjectFactory.makeString("Ranasinghe Premadasa"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PresidentOfOrganization"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("president")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SriLanka")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("In 2004 he released Spooked, which was recorded with country/folk duo Gillian Welch and David Rawlings."), (SubLObject)SubLObjectFactory.makeString("country/folk duo"), (SubLObject)named_entity_recognizer.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Duo-MusicalPerformanceGroup")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("institutionalFocus")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FolkMusic")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("He is undergoing a medial septal myectomy."), (SubLObject)SubLObjectFactory.makeString("medial septal myectomy"), (SubLObject)named_entity_recognizer.NIL), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalMyectomy"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Salle Moulay Abdellah is an indoor sporting arena located in Rabat, Morocco. The capacity of the arena is 10,000 people."), (SubLObject)SubLObjectFactory.makeString("Salle Moulay Abdellah"), (SubLObject)named_entity_recognizer.NIL), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stadium"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The Hazaras even boasted a prime minister, Sultan Ali Keshtmand, in the mid-1980s."), (SubLObject)SubLObjectFactory.makeString("Sultan Ali Keshtmand"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimeMinister-HeadOfGovernment"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Assadullah Sarwari replaced him with a Banner leader, Sultan Ali Keshtmand."), (SubLObject)SubLObjectFactory.makeString("Sultan Ali Keshtmand"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Leader"))) });
    }
}

/*

	Total time: 707 ms
	
*/
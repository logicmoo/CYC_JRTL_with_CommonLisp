package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class random_thought_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.random_thought_generator";
    public static final String myFingerPrint = "23d9d65387a8bc7b35f48e55cebb3daa4fb4f20b115ed6abd19165de34310e7f";
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 9901L)
    private static SubLSymbol $random_thought_server_host$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 10167L)
    private static SubLSymbol $random_thought_server_port$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 10369L)
    private static SubLSymbol $remote_random_thought_image$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 11055L)
    private static SubLSymbol $remote_random_thought_connection_pool$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 11158L)
    private static SubLSymbol $remote_random_thought_connection_pool_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 11285L)
    private static SubLSymbol $remote_random_thought_connection_pool_max_size$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 14834L)
    private static SubLSymbol $random_thought_generators_for_users$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLSymbol $dtp_random_thought_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 19102L)
    private static SubLSymbol $print_rtg_notesP$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLObject $const2$Guest;
    private static final SubLSymbol $sym3$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym4$STRINGP;
    private static final SubLSymbol $kw5$OUTPUT;
    private static final SubLString $str6$Unable_to_open__S;
    private static final SubLString $str7$Generating_;
    private static final SubLString $str8$_random_thoughts___;
    private static final SubLString $str9$random_thoughts;
    private static final SubLSymbol $kw10$UNINITIALIZED;
    private static final SubLList $list11;
    private static final SubLString $str12$thoughts;
    private static final SubLString $str13$Exporting_random_thoughts_to_;
    private static final SubLSymbol $kw14$SKIP;
    private static final SubLList $list15;
    private static final SubLString $str16$Parsing_XML_stream___;
    private static final SubLString $str17$thoughts_about;
    private static final SubLString $str18$topic_id;
    private static final SubLString $str19$thought;
    private static final SubLString $str20$Expected__thought___got__S;
    private static final SubLString $str21$assertion_id;
    private static final SubLString $str22$paraphrase;
    private static final SubLString $str23$string;
    private static final SubLString $str24$_____;
    private static final SubLString $str25$___;
    private static final SubLString $str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_;
    private static final SubLString $str27$___D____A_____A_____A_____A_____A;
    private static final SubLString $str28$_;
    private static final SubLString $str29$__;
    private static final SubLSymbol $sym30$FORT_P;
    private static final SubLString $str31$term;
    private static final SubLSymbol $sym32$VALID_NON_EMPTY_RANDOM_THOUGHT_P;
    private static final SubLSymbol $kw33$TOPIC;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_RANDOM_THOUGHT_SERVER_HOST_;
    private static final SubLString $str36$random_thoughts_cyc_com;
    private static final SubLSymbol $kw37$PARAMETER;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$_RANDOM_THOUGHT_SERVER_PORT_;
    private static final SubLInteger $int40$3634;
    private static final SubLSymbol $sym41$_REMOTE_RANDOM_THOUGHT_IMAGE_;
    private static final SubLSymbol $kw42$CFASL;
    private static final SubLSymbol $sym43$_REMOTE_RANDOM_THOUGHT_CONNECTION_POOL_;
    private static final SubLString $str44$Remote_Random_Thought_Connection_;
    private static final SubLSymbol $kw45$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym46$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw47$NOT_TRIED;
    private static final SubLSymbol $sym48$NEXT_RANDOM_THOUGHT_FOR_USER;
    private static final SubLSymbol $sym49$QUOTE;
    private static final SubLSymbol $sym50$PROGN;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym53$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str54$Could_not_open_a_connection_to__s;
    private static final SubLSymbol $sym55$_RANDOM_THOUGHT_GENERATORS_FOR_USERS_;
    private static final SubLSymbol $sym56$RANDOM_THOUGHT_GENERATOR;
    private static final SubLSymbol $sym57$RANDOM_THOUGHT_GENERATOR_P;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$PPRINT_RANDOM_THOUGHT_GENERATOR;
    private static final SubLSymbol $sym63$RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$RTG_STRUCT_USER;
    private static final SubLSymbol $sym66$_CSETF_RTG_STRUCT_USER;
    private static final SubLSymbol $sym67$RTG_STRUCT_DONE_ASSERTIONS;
    private static final SubLSymbol $sym68$_CSETF_RTG_STRUCT_DONE_ASSERTIONS;
    private static final SubLSymbol $sym69$RTG_STRUCT_GENERATOR_THREAD;
    private static final SubLSymbol $sym70$_CSETF_RTG_STRUCT_GENERATOR_THREAD;
    private static final SubLSymbol $sym71$RTG_STRUCT_QUEUE;
    private static final SubLSymbol $sym72$_CSETF_RTG_STRUCT_QUEUE;
    private static final SubLSymbol $sym73$RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT;
    private static final SubLSymbol $sym74$_CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT;
    private static final SubLSymbol $sym75$RTG_STRUCT_TOPICAL_THOUGHTS;
    private static final SubLSymbol $sym76$_CSETF_RTG_STRUCT_TOPICAL_THOUGHTS;
    private static final SubLSymbol $kw77$USER;
    private static final SubLSymbol $kw78$DONE_ASSERTIONS;
    private static final SubLSymbol $kw79$GENERATOR_THREAD;
    private static final SubLSymbol $kw80$QUEUE;
    private static final SubLSymbol $kw81$MOST_RECENTLY_ADDED_THOUGHT;
    private static final SubLSymbol $kw82$TOPICAL_THOUGHTS;
    private static final SubLString $str83$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw84$BEGIN;
    private static final SubLSymbol $sym85$MAKE_RANDOM_THOUGHT_GENERATOR;
    private static final SubLSymbol $kw86$SLOT;
    private static final SubLSymbol $kw87$END;
    private static final SubLSymbol $sym88$VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD;
    private static final SubLString $str89$__RTG_for__S___S_done__A__;
    private static final SubLString $str90$_queued;
    private static final SubLString $str91$exhausted;
    private static final SubLSymbol $kw92$EXHAUSTED;
    private static final SubLSymbol $kw93$NEW_TOPIC;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$PWHEN;
    private static final SubLSymbol $sym96$_PRINT_RTG_NOTES__;
    private static final SubLSymbol $sym97$APPLY;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$CONS;
    private static final SubLSymbol $sym100$LIST;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$FORMAT;
    private static final SubLString $str103$__Registering_interest_of__S_in__;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$NOW;
    private static final SubLSymbol $kw106$REQUIRE_TOPICAL_;
    private static final SubLString $str107$__Waiting_for_new_thoughts_about_;
    private static final SubLFloat $float108$0_5;
    private static final SubLString $str109$___A_out_of_thoughts_about__S__;
    private static final SubLString $str110$Totally;
    private static final SubLString $str111$Temporarily;
    private static final SubLString $str112$Random_Thought_Generator;
    private static final SubLSymbol $sym113$KEEP_RANDOM_THOUGHT_GENERATOR_FULL;
    private static final SubLInteger $int114$25;
    private static final SubLFloat $float115$1_5;
    private static final SubLInteger $int116$1000;
    private static final SubLString $str117$__Filling__S__;
    private static final SubLList $list118;
    private static final SubLString $str119$___S_is_now_full__;
    private static final SubLString $str120$_S_is_not_in_an_updatable_state;
    private static final SubLString $str121$__New_thought_concerning__S_____S;
    private static final SubLSymbol $sym122$OPEN_CYC_FORT;
    private static final SubLSymbol $sym123$POTENTIALLY_PORN_RELATED_;
    private static final SubLObject $const124$PotentiallyPornRelated;
    private static final SubLSymbol $kw125$IGNORE;
    private static final SubLSymbol $kw126$GAF;
    private static final SubLSymbol $kw127$TRUE;
    private static final SubLString $str128$__Found__S_GAF_assertions_about__;
    private static final SubLString $str129$___Top_level_CycL___S;
    private static final SubLList $list130;
    private static final SubLSymbol $kw131$NEW_ARG_FROM_ASSERTION;
    private static final SubLSymbol $kw132$REUSE_MOST_RECENTLY_ADDED_TOPIC;
    private static final SubLSymbol $kw133$RANDOM;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 878L)
    public static SubLObject random_thought_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != empty_random_thought_p(v_object) || random_thought_generator.NIL != non_empty_random_thought_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 1199L)
    public static SubLObject empty_random_thought_p(final SubLObject v_object) {
        return Equality.equal(v_object, (SubLObject)random_thought_generator.$list0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 1289L)
    public static SubLObject non_empty_random_thought_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)random_thought_generator.$list1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 1559L)
    public static SubLObject xml_output_random_thoughts(final SubLObject number_of_thoughts, final SubLObject filename, SubLObject user) {
        if (user == random_thought_generator.UNPROVIDED) {
            user = random_thought_generator.$const2$Guest;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert random_thought_generator.NIL != subl_promotions.positive_integer_p(number_of_thoughts) : number_of_thoughts;
        assert random_thought_generator.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)random_thought_generator.NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)random_thought_generator.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)random_thought_generator.$kw5$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)random_thought_generator.$str6$Unable_to_open__S, filename);
            }
            _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.xml_header((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind((SubLObject)random_thought_generator.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)random_thought_generator.NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)random_thought_generator.T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                            try {
                                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)random_thought_generator.$str7$Generating_, new SubLObject[] { format_nil.format_nil_d_no_copy(number_of_thoughts), random_thought_generator.$str8$_random_thoughts___ }));
                                try {
                                    final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)random_thought_generator.$str9$random_thoughts, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.$kw10$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)random_thought_generator.$kw10$UNINITIALIZED, thread);
                                            xml_utilities.xml_terpri();
                                            SubLObject i;
                                            for (i = (SubLObject)random_thought_generator.NIL, i = (SubLObject)random_thought_generator.ZERO_INTEGER; i.numL(number_of_thoughts); i = Numbers.add(i, (SubLObject)random_thought_generator.ONE_INTEGER)) {
                                                xml_output_random_thought(next_random_thought_for_user(user, (SubLObject)random_thought_generator.$list11));
                                                xml_utilities.xml_terpri();
                                                streams_high.force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                                                utilities_macros.note_percent_progress(i, number_of_thoughts);
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)random_thought_generator.$str9$random_thoughts);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    utilities_macros.noting_percent_progress_postamble();
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)random_thought_generator.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return number_of_thoughts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 2324L)
    public static SubLObject xml_output_random_thoughts_for_terms(final SubLObject number_of_terms, final SubLObject filename, SubLObject start_after_fort) {
        if (start_after_fort == random_thought_generator.UNPROVIDED) {
            start_after_fort = (SubLObject)random_thought_generator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (random_thought_generator.NIL != number_of_terms && !random_thought_generator.assertionsDisabledInClass && random_thought_generator.NIL == subl_promotions.positive_integer_p(number_of_terms)) {
            throw new AssertionError(number_of_terms);
        }
        assert random_thought_generator.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)random_thought_generator.NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)random_thought_generator.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)random_thought_generator.$kw5$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)random_thought_generator.$str6$Unable_to_open__S, filename);
            }
            _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.xml_header((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
                SubLObject done_count = (SubLObject)random_thought_generator.ZERO_INTEGER;
                SubLObject doneP = (SubLObject)random_thought_generator.NIL;
                SubLObject ok_to_startP = Types.sublisp_null(start_after_fort);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        try {
                            final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)random_thought_generator.$str12$thoughts, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.$kw10$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)random_thought_generator.$kw10$UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    final SubLObject message = Sequences.cconcatenate((SubLObject)random_thought_generator.$str13$Exporting_random_thoughts_to_, format_nil.format_nil_s_no_copy(filename));
                                    final SubLObject total = forts.fort_count();
                                    SubLObject sofar = (SubLObject)random_thought_generator.ZERO_INTEGER;
                                    final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)random_thought_generator.ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)random_thought_generator.NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)random_thought_generator.T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                        try {
                                            utilities_macros.noting_percent_progress_preamble(message);
                                            SubLObject rest;
                                            SubLObject idx;
                                            SubLObject table_var;
                                            SubLObject idx_$14;
                                            SubLObject vector_var;
                                            SubLObject backwardP_var;
                                            SubLObject length;
                                            SubLObject current;
                                            SubLObject datum;
                                            SubLObject start;
                                            SubLObject end;
                                            SubLObject delta;
                                            SubLObject end_var;
                                            SubLObject id;
                                            SubLObject fort;
                                            SubLObject thoughts;
                                            SubLObject idx_$15;
                                            SubLObject sparse;
                                            SubLObject id2;
                                            SubLObject end_id;
                                            SubLObject v_default;
                                            SubLObject fort2;
                                            SubLObject thoughts2;
                                            for (rest = (SubLObject)random_thought_generator.NIL, rest = forts.do_forts_tables(); random_thought_generator.NIL == doneP && random_thought_generator.NIL != rest; rest = rest.rest()) {
                                                table_var = (idx = rest.first());
                                                if (random_thought_generator.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)random_thought_generator.$kw14$SKIP)) {
                                                    idx_$14 = idx;
                                                    if (random_thought_generator.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)random_thought_generator.$kw14$SKIP)) {
                                                        vector_var = id_index.id_index_dense_objects(idx_$14);
                                                        backwardP_var = (SubLObject)random_thought_generator.NIL;
                                                        length = Sequences.length(vector_var);
                                                        datum = (current = (SubLObject)((random_thought_generator.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)random_thought_generator.ONE_INTEGER), (SubLObject)random_thought_generator.MINUS_ONE_INTEGER, (SubLObject)random_thought_generator.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)random_thought_generator.ZERO_INTEGER, length, (SubLObject)random_thought_generator.ONE_INTEGER)));
                                                        start = (SubLObject)random_thought_generator.NIL;
                                                        end = (SubLObject)random_thought_generator.NIL;
                                                        delta = (SubLObject)random_thought_generator.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)random_thought_generator.$list15);
                                                        start = current.first();
                                                        current = current.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)random_thought_generator.$list15);
                                                        end = current.first();
                                                        current = current.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)random_thought_generator.$list15);
                                                        delta = current.first();
                                                        current = current.rest();
                                                        if (random_thought_generator.NIL == current) {
                                                            if (random_thought_generator.NIL == doneP) {
                                                                for (end_var = end, id = (SubLObject)random_thought_generator.NIL, id = start; random_thought_generator.NIL == doneP && random_thought_generator.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                                                    fort = Vectors.aref(vector_var, id);
                                                                    if (random_thought_generator.NIL == id_index.id_index_tombstone_p(fort) || random_thought_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)random_thought_generator.$kw14$SKIP)) {
                                                                        if (random_thought_generator.NIL != id_index.id_index_tombstone_p(fort)) {
                                                                            fort = (SubLObject)random_thought_generator.$kw14$SKIP;
                                                                        }
                                                                        sofar = Numbers.add(sofar, (SubLObject)random_thought_generator.ONE_INTEGER);
                                                                        utilities_macros.note_percent_progress(sofar, total);
                                                                        if (random_thought_generator.NIL != ok_to_startP && random_thought_generator.NIL != open_cyc_fort(fort) && random_thought_generator.NIL == fort_types_interface.predicate_p(fort)) {
                                                                            thoughts = all_random_thoughts_on_topic(fort);
                                                                            if (random_thought_generator.NIL != list_utilities.non_empty_list_p(thoughts)) {
                                                                                xml_output_random_thoughts_for_term(fort, thoughts);
                                                                                xml_utilities.xml_terpri();
                                                                                done_count = Numbers.add(done_count, (SubLObject)random_thought_generator.ONE_INTEGER);
                                                                                if (random_thought_generator.NIL != number_of_terms) {
                                                                                    doneP = Numbers.numGE(done_count, number_of_terms);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (fort.eql(start_after_fort)) {
                                                                            ok_to_startP = (SubLObject)random_thought_generator.T;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)random_thought_generator.$list15);
                                                        }
                                                    }
                                                    idx_$15 = idx;
                                                    if (random_thought_generator.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15) || random_thought_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)random_thought_generator.$kw14$SKIP)) {
                                                        sparse = id_index.id_index_sparse_objects(idx_$15);
                                                        id2 = id_index.id_index_sparse_id_threshold(idx_$15);
                                                        end_id = id_index.id_index_next_id(idx_$15);
                                                        v_default = (SubLObject)((random_thought_generator.NIL != id_index.id_index_skip_tombstones_p((SubLObject)random_thought_generator.$kw14$SKIP)) ? random_thought_generator.NIL : random_thought_generator.$kw14$SKIP);
                                                        while (id2.numL(end_id) && random_thought_generator.NIL == doneP) {
                                                            fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                                            if (random_thought_generator.NIL == id_index.id_index_skip_tombstones_p((SubLObject)random_thought_generator.$kw14$SKIP) || random_thought_generator.NIL == id_index.id_index_tombstone_p(fort2)) {
                                                                sofar = Numbers.add(sofar, (SubLObject)random_thought_generator.ONE_INTEGER);
                                                                utilities_macros.note_percent_progress(sofar, total);
                                                                if (random_thought_generator.NIL != ok_to_startP && random_thought_generator.NIL != open_cyc_fort(fort2) && random_thought_generator.NIL == fort_types_interface.predicate_p(fort2)) {
                                                                    thoughts2 = all_random_thoughts_on_topic(fort2);
                                                                    if (random_thought_generator.NIL != list_utilities.non_empty_list_p(thoughts2)) {
                                                                        xml_output_random_thoughts_for_term(fort2, thoughts2);
                                                                        xml_utilities.xml_terpri();
                                                                        done_count = Numbers.add(done_count, (SubLObject)random_thought_generator.ONE_INTEGER);
                                                                        if (random_thought_generator.NIL != number_of_terms) {
                                                                            doneP = Numbers.numGE(done_count, number_of_terms);
                                                                        }
                                                                    }
                                                                }
                                                                if (fort2.eql(start_after_fort)) {
                                                                    ok_to_startP = (SubLObject)random_thought_generator.T;
                                                                }
                                                            }
                                                            id2 = Numbers.add(id2, (SubLObject)random_thought_generator.ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                utilities_macros.noting_percent_progress_postamble();
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)random_thought_generator.$str12$thoughts);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)random_thought_generator.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 3493L)
    public static SubLObject sql_output_random_thoughts_from_xml(final SubLObject xml_stream, final SubLObject output_filename, SubLObject id_tracker) {
        if (id_tracker == random_thought_generator.UNPROVIDED) {
            id_tracker = integer_sequence_generator.new_integer_sequence_generator((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(xml_stream, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL);
        SubLObject row_count = (SubLObject)random_thought_generator.ZERO_INTEGER;
        final SubLObject max_rows_per_insert_statement = (SubLObject)random_thought_generator.TEN_INTEGER;
        SubLObject written_some_rowP = (SubLObject)random_thought_generator.NIL;
        SubLObject stream = (SubLObject)random_thought_generator.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)random_thought_generator.NIL, thread);
                stream = compatibility.open_text(output_filename, (SubLObject)random_thought_generator.$kw5$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)random_thought_generator.$str6$Unable_to_open__S, output_filename);
            }
            final SubLObject sql_stream = stream;
            write_random_thought_sql_header(sql_stream);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)random_thought_generator.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)random_thought_generator.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)random_thought_generator.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)random_thought_generator.$str16$Parsing_XML_stream___);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    iteration.iteration_next(token_iterator);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    while (random_thought_generator.NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), (SubLObject)random_thought_generator.$str17$thoughts_about)) {
                        iteration.iteration_next(token_iterator);
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    }
                    while (random_thought_generator.NIL == xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), (SubLObject)random_thought_generator.$str12$thoughts)) {
                        final SubLObject sexpr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, (SubLObject)random_thought_generator.UNPROVIDED);
                        final SubLObject topic_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, (SubLObject)random_thought_generator.$str18$topic_id);
                        final SubLObject topic = kb_utilities.find_object_by_compact_hl_external_id_string(topic_id);
                        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(sexpr);
                        if (random_thought_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sexpr_type.equal((SubLObject)random_thought_generator.$str19$thought)) {
                            Errors.error((SubLObject)random_thought_generator.$str20$Expected__thought___got__S, sexpr_type);
                        }
                        final SubLObject assertion_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, (SubLObject)random_thought_generator.$str21$assertion_id);
                        final SubLObject assertion = kb_utilities.find_object_by_compact_hl_external_id_string(assertion_id);
                        if (random_thought_generator.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)random_thought_generator.UNPROVIDED)) {
                            final SubLObject paraphrase_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, (SubLObject)random_thought_generator.$str22$paraphrase);
                            final SubLObject paraphrase = xml_parsing_utilities.xml_sexpr_attribute_value(paraphrase_sexpr, (SubLObject)random_thought_generator.$str23$string);
                            if (paraphrase.isString()) {
                                final SubLObject thought_num = next_random_thought_num_for_topic(id_tracker, topic);
                                if (random_thought_generator.NIL != written_some_rowP) {
                                    if (Numbers.mod(row_count, max_rows_per_insert_statement).isZero()) {
                                        PrintLow.format(sql_stream, (SubLObject)random_thought_generator.$str24$_____);
                                        write_random_thought_sql_header(sql_stream);
                                    }
                                    else {
                                        PrintLow.format(sql_stream, (SubLObject)random_thought_generator.$str25$___);
                                    }
                                }
                                write_random_thought_sql_row(thought_num, topic, assertion, paraphrase, sql_stream);
                                written_some_rowP = (SubLObject)random_thought_generator.T;
                                row_count = Numbers.add(row_count, (SubLObject)random_thought_generator.ONE_INTEGER);
                            }
                        }
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                        while (random_thought_generator.NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), (SubLObject)random_thought_generator.$str17$thoughts_about)) {
                            iteration.iteration_next(token_iterator);
                            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                        }
                        thread.resetMultipleValues();
                        final SubLObject done = xml_parsing_utilities.xml_token_iterator_progress(token_iterator);
                        final SubLObject total = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        utilities_macros.note_percent_progress(done, total);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
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
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
            PrintLow.format(sql_stream, (SubLObject)random_thought_generator.$str24$_____);
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)random_thought_generator.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return Values.values(output_filename, id_tracker);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 6144L)
    public static SubLObject next_random_thought_num_for_topic(final SubLObject id_tracker, final SubLObject topic) {
        return integer_sequence_generator.integer_sequence_generator_next(id_tracker);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 6285L)
    public static SubLObject write_random_thought_sql_header(final SubLObject sql_stream) {
        print_high.princ((SubLObject)random_thought_generator.$str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_, sql_stream);
        streams_high.terpri(sql_stream);
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 6527L)
    public static SubLObject write_random_thought_sql_row(final SubLObject thought_num, final SubLObject topic, final SubLObject assertion, final SubLObject paraphrase, final SubLObject sql_stream) {
        assert random_thought_generator.NIL != Types.stringp(paraphrase) : paraphrase;
        PrintLow.format(sql_stream, (SubLObject)random_thought_generator.$str27$___D____A_____A_____A_____A_____A, new SubLObject[] { thought_num, kb_utilities.compact_hl_external_id_string(topic), topic, kb_utilities.compact_hl_external_id_string(assertion), uncanonicalizer.assertion_el_formula(assertion), uncanonicalizer.assertion_elmt(assertion), (random_thought_generator.NIL != Sequences.find((SubLObject)Characters.CHAR_quote, paraphrase, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED)) ? string_utilities.replace_substring(paraphrase, (SubLObject)random_thought_generator.$str28$_, (SubLObject)random_thought_generator.$str29$__) : paraphrase });
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 7035L)
    public static SubLObject xml_output_random_thoughts_for_term(final SubLObject v_term, SubLObject thoughts) {
        if (thoughts == random_thought_generator.UNPROVIDED) {
            thoughts = all_random_thoughts_on_topic(v_term);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert random_thought_generator.NIL != forts.fort_p(v_term) : v_term;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)random_thought_generator.$str17$thoughts_about, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str31$term, kb_utilities.compact_hl_external_id_string(v_term)), (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.$kw10$UNINITIALIZED);
                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)random_thought_generator.$kw10$UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    SubLObject cdolist_list_var = thoughts;
                    SubLObject thought = (SubLObject)random_thought_generator.NIL;
                    thought = cdolist_list_var.first();
                    while (random_thought_generator.NIL != cdolist_list_var) {
                        xml_output_random_thought(thought);
                        xml_utilities.xml_terpri();
                        streams_high.force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                        cdolist_list_var = cdolist_list_var.rest();
                        thought = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)random_thought_generator.$str17$thoughts_about);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 7427L)
    public static SubLObject xml_output_random_thought(final SubLObject random_thought) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert random_thought_generator.NIL != valid_non_empty_random_thought_p(random_thought) : random_thought;
        final SubLObject attributes = (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str18$topic_id, kb_utilities.compact_hl_external_id_string(random_thought.first()), (SubLObject)random_thought_generator.$str21$assertion_id, kb_utilities.compact_hl_external_id_string(conses_high.second(random_thought)));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)random_thought_generator.$str19$thought, attributes, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.$kw10$UNINITIALIZED);
                final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)random_thought_generator.$kw10$UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    pph_html.xml_output_pph_javalist(conses_high.third(random_thought));
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)random_thought_generator.$str19$thought);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 7933L)
    public static SubLObject valid_non_empty_random_thought_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != non_empty_random_thought_p(v_object) && random_thought_generator.NIL != forts.valid_fortP(v_object.first()) && random_thought_generator.NIL != assertion_handles.valid_assertionP(conses_high.second(v_object), (SubLObject)random_thought_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 8122L)
    public static SubLObject next_random_thought_for_user(final SubLObject user, SubLObject parameters) {
        if (parameters == random_thought_generator.UNPROVIDED) {
            parameters = (SubLObject)random_thought_generator.NIL;
        }
        assert random_thought_generator.NIL != forts.fort_p(user) : user;
        final SubLObject rtg = find_or_create_random_thought_generator_for_user(user);
        if (random_thought_generator.NIL != conses_high.getf(parameters, (SubLObject)random_thought_generator.$kw33$TOPIC, (SubLObject)random_thought_generator.NIL)) {
            return next_random_thought_with_suggested_topic(rtg, parameters);
        }
        return next_random_thought_without_suggested_topic(rtg, parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 8821L)
    public static SubLObject thcl_assertion_seen_by_cyclistP(final SubLObject assertion, final SubLObject cyclist) {
        if (random_thought_generator.NIL == forts.fort_p(cyclist)) {
            return (SubLObject)random_thought_generator.NIL;
        }
        final SubLObject rtg = find_random_thought_generator_for_user(cyclist);
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != rtg && random_thought_generator.NIL != set.set_memberP(assertion, rtg_done_assertions(rtg)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 9148L)
    public static SubLObject number_of_queued_random_thoughts_for_user(final SubLObject user) {
        assert random_thought_generator.NIL != forts.fort_p(user) : user;
        final SubLObject rtg = find_random_thought_generator_for_user(user);
        return (SubLObject)((random_thought_generator.NIL != rtg) ? queues.queue_size(rtg_queue(rtg)) : random_thought_generator.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 9447L)
    public static SubLObject number_of_used_random_thoughts_for_user(final SubLObject user) {
        assert random_thought_generator.NIL != forts.fort_p(user) : user;
        final SubLObject rtg = find_random_thought_generator_for_user(user);
        return (SubLObject)((random_thought_generator.NIL != rtg) ? Numbers.subtract(set.set_size(rtg_done_assertions(rtg)), number_of_queued_random_thoughts_for_user(user)) : random_thought_generator.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 10478L)
    public static SubLObject remote_random_thought_image() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (random_thought_generator.NIL == remote_image.remote_image_p(random_thought_generator.$remote_random_thought_image$.getGlobalValue())) {
            set_remote_random_thought_image(random_thought_generator.$random_thought_server_host$.getDynamicValue(thread), random_thought_generator.$random_thought_server_port$.getDynamicValue(thread), (SubLObject)random_thought_generator.$kw42$CFASL);
        }
        return random_thought_generator.$remote_random_thought_image$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 10736L)
    public static SubLObject set_remote_random_thought_image(final SubLObject machine, final SubLObject port, final SubLObject protocol) {
        random_thought_generator.$remote_random_thought_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p(random_thought_generator.$remote_random_thought_image$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 10946L)
    public static SubLObject unset_remote_random_thought_image() {
        random_thought_generator.$remote_random_thought_image$.setGlobalValue((SubLObject)random_thought_generator.NIL);
        return (SubLObject)random_thought_generator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 11357L)
    public static SubLObject clear_remote_random_thought_connection_pool() {
        for (SubLObject q = random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p(q); random_thought_generator.NIL == done_var; done_var = queues.queue_empty_p(q)) {
            final SubLObject connection = queues.dequeue(q);
            remote_image.close_remote_image_connection(connection);
        }
        return (SubLObject)random_thought_generator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 11553L)
    public static SubLObject random_thought_server_hostXport() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = (SubLObject)random_thought_generator.NIL;
        SubLObject port = (SubLObject)random_thought_generator.NIL;
        SubLObject ignore_errors_tag = (SubLObject)random_thought_generator.NIL;
        try {
            thread.throwStack.push(random_thought_generator.$kw45$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)random_thought_generator.$sym46$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject connection = get_free_random_thought_connection();
                    SubLObject success_var = (SubLObject)random_thought_generator.NIL;
                    try {
                        if (random_thought_generator.NIL != open_remote_random_thought_connection_p(connection)) {
                            final SubLObject image = remote_image.remote_image_connection_image(connection);
                            final SubLObject cfasl_port = remote_image.remote_image_port(image);
                            host = remote_image.remote_image_machine(image);
                            port = Numbers.subtract(cfasl_port, system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
                            release_random_thought_connection(connection);
                        }
                        success_var = (SubLObject)random_thought_generator.T;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (random_thought_generator.NIL == success_var) {
                                remote_image.close_remote_image_connection(connection);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)random_thought_generator.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)random_thought_generator.$kw45$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(host, port);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 12169L)
    public static SubLObject next_random_thought_for_user_from_remote_server(final SubLObject user, final SubLObject parameters) {
        SubLObject thought;
        for (thought = (SubLObject)random_thought_generator.$kw47$NOT_TRIED; random_thought_generator.NIL != thought && random_thought_generator.NIL == valid_non_empty_random_thought_p(thought); thought = next_random_thought_for_user_from_remote_server_int(user, parameters)) {}
        return thought;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 12473L)
    public static SubLObject next_random_thought_for_user_from_remote_server_int(final SubLObject user, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject api_request = (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym48$NEXT_RANDOM_THOUGHT_FOR_USER, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym49$QUOTE, user), (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym49$QUOTE, parameters));
        final SubLObject augmented_api_request = (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym50$PROGN, (SubLObject)random_thought_generator.$list51, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym52$MULTIPLE_VALUE_LIST, api_request));
        SubLObject results_list = (SubLObject)random_thought_generator.NIL;
        SubLObject connection = (SubLObject)random_thought_generator.NIL;
        SubLObject error_message = (SubLObject)random_thought_generator.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)random_thought_generator.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    connection = get_free_random_thought_connection();
                    SubLObject success_var = (SubLObject)random_thought_generator.NIL;
                    try {
                        results_list = remote_image.remote_image_connection_eval(connection, augmented_api_request);
                        release_random_thought_connection(connection);
                        success_var = (SubLObject)random_thought_generator.T;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (random_thought_generator.NIL == success_var) {
                                remote_image.close_remote_image_connection(connection);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)random_thought_generator.NIL);
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
        if (random_thought_generator.NIL != error_message) {
            Errors.warn(error_message);
        }
        return (SubLObject)((random_thought_generator.NIL != results_list) ? subl_promotions.values_list(results_list) : random_thought_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 13249L)
    public static SubLObject create_remote_random_thought_connection() {
        final SubLObject v_remote_image = remote_random_thought_image();
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        if (random_thought_generator.NIL != remote_image.remote_image_connection_p(connection)) {
            remote_image.open_remote_image_connection(connection);
            return connection;
        }
        return Errors.error((SubLObject)random_thought_generator.$str54$Could_not_open_a_connection_to__s, v_remote_image);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 13613L)
    public static SubLObject release_random_thought_connection(final SubLObject connection) {
        SubLObject release = (SubLObject)random_thought_generator.NIL;
        try {
            release = Locks.seize_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            if (queues.queue_size(random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue()).numGE(random_thought_generator.$remote_random_thought_connection_pool_max_size$.getGlobalValue())) {
                remote_image.close_remote_image_connection(connection);
            }
            else {
                queues.enqueue(connection, random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue());
            }
        }
        finally {
            if (random_thought_generator.NIL != release) {
                Locks.release_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return (SubLObject)random_thought_generator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 14062L)
    public static SubLObject open_remote_random_thought_connection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != remote_image.remote_image_connection_p(v_object) && random_thought_generator.NIL != streams_high.open_stream_p(remote_image.remote_image_connection_channel(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 14242L)
    public static SubLObject get_free_random_thought_connection() {
        SubLObject connection = (SubLObject)random_thought_generator.NIL;
        SubLObject release = (SubLObject)random_thought_generator.NIL;
        try {
            release = Locks.seize_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            for (SubLObject q = random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue(), done_var = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != connection || random_thought_generator.NIL != queues.queue_empty_p(q)); random_thought_generator.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != connection || random_thought_generator.NIL != queues.queue_empty_p(q))) {
                final SubLObject candidate = queues.dequeue(q);
                if (random_thought_generator.NIL != open_remote_random_thought_connection_p(candidate)) {
                    connection = candidate;
                }
            }
            if (random_thought_generator.NIL == connection) {
                connection = create_remote_random_thought_connection();
            }
        }
        finally {
            if (random_thought_generator.NIL != release) {
                Locks.release_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 14945L)
    public static SubLObject register_random_thought_generator(final SubLObject rtg, final SubLObject user) {
        return dictionary.dictionary_enter(random_thought_generator.$random_thought_generators_for_users$.getGlobalValue(), user, rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15082L)
    public static SubLObject find_random_thought_generator_for_user(final SubLObject user) {
        return dictionary.dictionary_lookup(random_thought_generator.$random_thought_generators_for_users$.getGlobalValue(), user, (SubLObject)random_thought_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject random_thought_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_random_thought_generator(v_object, stream, (SubLObject)random_thought_generator.ZERO_INTEGER);
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject random_thought_generator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $random_thought_generator_native.class) ? random_thought_generator.T : random_thought_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_user(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_done_assertions(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_generator_thread(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_queue(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_most_recently_added_thought(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject rtg_struct_topical_thoughts(final SubLObject v_object) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_user(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_done_assertions(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_generator_thread(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_queue(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_most_recently_added_thought(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject _csetf_rtg_struct_topical_thoughts(final SubLObject v_object, final SubLObject value) {
        assert random_thought_generator.NIL != random_thought_generator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject make_random_thought_generator(SubLObject arglist) {
        if (arglist == random_thought_generator.UNPROVIDED) {
            arglist = (SubLObject)random_thought_generator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $random_thought_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)random_thought_generator.NIL, next = arglist; random_thought_generator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)random_thought_generator.$kw77$USER)) {
                _csetf_rtg_struct_user(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw78$DONE_ASSERTIONS)) {
                _csetf_rtg_struct_done_assertions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw79$GENERATOR_THREAD)) {
                _csetf_rtg_struct_generator_thread(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw80$QUEUE)) {
                _csetf_rtg_struct_queue(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw81$MOST_RECENTLY_ADDED_THOUGHT)) {
                _csetf_rtg_struct_most_recently_added_thought(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw82$TOPICAL_THOUGHTS)) {
                _csetf_rtg_struct_topical_thoughts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)random_thought_generator.$str83$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject visit_defstruct_random_thought_generator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw84$BEGIN, (SubLObject)random_thought_generator.$sym85$MAKE_RANDOM_THOUGHT_GENERATOR, (SubLObject)random_thought_generator.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw77$USER, rtg_struct_user(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw78$DONE_ASSERTIONS, rtg_struct_done_assertions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw79$GENERATOR_THREAD, rtg_struct_generator_thread(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw80$QUEUE, rtg_struct_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw81$MOST_RECENTLY_ADDED_THOUGHT, rtg_struct_most_recently_added_thought(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw86$SLOT, (SubLObject)random_thought_generator.$kw82$TOPICAL_THOUGHTS, rtg_struct_topical_thoughts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)random_thought_generator.$kw87$END, (SubLObject)random_thought_generator.$sym85$MAKE_RANDOM_THOUGHT_GENERATOR, (SubLObject)random_thought_generator.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15221L)
    public static SubLObject visit_defstruct_object_random_thought_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_random_thought_generator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15664L)
    public static SubLObject rtg_user(final SubLObject rtg) {
        return rtg_struct_user(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15727L)
    public static SubLObject rtg_done_assertions(final SubLObject rtg) {
        return rtg_struct_done_assertions(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15812L)
    public static SubLObject rtg_generator_thread(final SubLObject rtg) {
        return rtg_struct_generator_thread(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 15899L)
    public static SubLObject rtg_set_generator_thread(final SubLObject rtg, final SubLObject process) {
        _csetf_rtg_struct_generator_thread(rtg, process);
        return process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16024L)
    public static SubLObject rtg_queue(final SubLObject rtg) {
        return rtg_struct_queue(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16089L)
    public static SubLObject rtg_most_recently_added_thought(final SubLObject rtg) {
        return rtg_struct_most_recently_added_thought(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16198L)
    public static SubLObject rtg_set_most_recently_added_thought(final SubLObject rtg, final SubLObject thought) {
        _csetf_rtg_struct_most_recently_added_thought(rtg, thought);
        return thought;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16345L)
    public static SubLObject rtg_topical_thoughts(final SubLObject rtg) {
        return rtg_struct_topical_thoughts(rtg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16432L)
    public static SubLObject rtg_set_topical_thoughts(final SubLObject rtg, final SubLObject thoughts) {
        _csetf_rtg_struct_topical_thoughts(rtg, thoughts);
        return thoughts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16560L)
    public static SubLObject pprint_random_thought_generator(final SubLObject rtg, SubLObject stream, SubLObject depth) {
        if (stream == random_thought_generator.UNPROVIDED) {
            stream = (SubLObject)random_thought_generator.NIL;
        }
        if (depth == random_thought_generator.UNPROVIDED) {
            depth = (SubLObject)random_thought_generator.NIL;
        }
        PrintLow.format(stream, (SubLObject)random_thought_generator.$str89$__RTG_for__S___S_done__A__, new SubLObject[] { rtg_struct_user(rtg), set.set_size(rtg_struct_done_assertions(rtg)), (random_thought_generator.NIL != queues.queue_p(rtg_struct_queue(rtg))) ? Sequences.cconcatenate(format_nil.format_nil_s_no_copy(queues.queue_size(rtg_struct_queue(rtg))), (SubLObject)random_thought_generator.$str90$_queued) : random_thought_generator.$str91$exhausted });
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 16926L)
    public static SubLObject find_or_create_random_thought_generator_for_user(final SubLObject user) {
        assert random_thought_generator.NIL != forts.fort_p(user) : user;
        final SubLObject existing = find_random_thought_generator_for_user(user);
        return (random_thought_generator.NIL != existing) ? existing : new_random_thought_generator_for_user(user);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 17170L)
    public static SubLObject empty_thought() {
        return (SubLObject)random_thought_generator.$list0;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 17228L)
    public static SubLObject new_random_thought_generator_for_user(final SubLObject user) {
        final SubLObject rtg = new_random_thought_generator();
        _csetf_rtg_struct_user(rtg, user);
        register_random_thought_generator(rtg, user);
        find_or_create_random_thought_generator_thread(rtg, (SubLObject)random_thought_generator.UNPROVIDED);
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 17498L)
    public static SubLObject new_random_thought_generator() {
        final SubLObject rtg = make_random_thought_generator((SubLObject)ConsesLow.list(new SubLObject[] { random_thought_generator.$kw77$USER, random_thought_generator.NIL, random_thought_generator.$kw78$DONE_ASSERTIONS, set.new_set((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED), random_thought_generator.$kw80$QUEUE, queues.create_queue((SubLObject)random_thought_generator.UNPROVIDED), random_thought_generator.$kw81$MOST_RECENTLY_ADDED_THOUGHT, empty_thought(), random_thought_generator.$kw82$TOPICAL_THOUGHTS, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)random_thought_generator.EQL), (SubLObject)random_thought_generator.UNPROVIDED) }));
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 17799L)
    public static SubLObject note_rtg_exhausted(final SubLObject rtg) {
        rtg_set_generator_thread(rtg, (SubLObject)random_thought_generator.$kw92$EXHAUSTED);
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 17898L)
    public static SubLObject random_thought_generator_exhausted_p(final SubLObject rtg) {
        return Equality.eq((SubLObject)random_thought_generator.$kw92$EXHAUSTED, rtg_generator_thread(rtg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 18010L)
    public static SubLObject random_thoughts_on_topic_exhausted_p(final SubLObject data) {
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == data.rest() || random_thought_generator.$kw92$EXHAUSTED.eql(data.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 18137L)
    public static SubLObject note_random_thoughts_on_topic_exhausted(final SubLObject data) {
        return ConsesLow.rplacd(data, (SubLObject)random_thought_generator.$kw92$EXHAUSTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 18235L)
    public static SubLObject random_thought_generator_full_p(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_fullP;
        SubLObject iteration_state;
        for (not_fullP = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == random_thought_generator_queue_full_p(rtg, target_size)), iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rtg_topical_thoughts(rtg))); random_thought_generator.NIL == not_fullP && random_thought_generator.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (!data.isCons() || (random_thought_generator.NIL == random_thoughts_on_topic_exhausted_p(data) && random_thought_generator.NIL == data.first())) {
                not_fullP = (SubLObject)random_thought_generator.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == not_fullP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 18638L)
    public static SubLObject random_thought_generator_queue_full_p(final SubLObject rtg, final SubLObject target_size) {
        return Numbers.numGE(queues.queue_size(rtg_queue(rtg)), target_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 18766L)
    public static SubLObject declare_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        if (random_thought_generator.NIL == dictionary.dictionary_lookup(topical_thoughts, topic, (SubLObject)random_thought_generator.NIL)) {
            register_interest_in_random_thoughts_about_topic(rtg, topic);
            dictionary.dictionary_enter(topical_thoughts, topic, (SubLObject)random_thought_generator.$kw93$NEW_TOPIC);
        }
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 19149L)
    public static SubLObject rtg_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = (SubLObject)random_thought_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)random_thought_generator.$list94);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)random_thought_generator.$sym95$PWHEN, (SubLObject)random_thought_generator.$sym96$_PRINT_RTG_NOTES__, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym97$APPLY, (SubLObject)random_thought_generator.$list98, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$sym99$CONS, (SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.listS((SubLObject)random_thought_generator.$sym100$LIST, format_str, ConsesLow.append(args, (SubLObject)random_thought_generator.NIL)))), (SubLObject)random_thought_generator.$list101);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 19312L)
    public static SubLObject register_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert random_thought_generator.NIL != forts.fort_p(topic) : topic;
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str103$__Registering_interest_of__S_in__, rtg_user(rtg), topic)));
            streams_high.force_output((SubLObject)random_thought_generator.T);
        }
        dictionary.dictionary_enter(topical_thoughts, topic, (SubLObject)random_thought_generator.$kw93$NEW_TOPIC);
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 19622L)
    public static SubLObject all_random_thoughts_on_topic(final SubLObject topic) {
        assert random_thought_generator.NIL != forts.fort_p(topic) : topic;
        final SubLObject rtg = new_random_thought_generator();
        SubLObject thoughts = (SubLObject)random_thought_generator.NIL;
        SubLObject doneP = (SubLObject)random_thought_generator.NIL;
        while (random_thought_generator.NIL == doneP) {
            final SubLObject thought = next_random_thought_with_suggested_topic(rtg, (SubLObject)ConsesLow.listS((SubLObject)random_thought_generator.$kw33$TOPIC, topic, (SubLObject)random_thought_generator.$list104));
            if (random_thought_generator.NIL != empty_random_thought_p(thought)) {
                doneP = (SubLObject)random_thought_generator.T;
            }
            else {
                thoughts = (SubLObject)ConsesLow.cons(thought, thoughts);
            }
        }
        Threads.kill_process(rtg_generator_thread(rtg));
        return thoughts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 20086L)
    public static SubLObject next_random_thought_with_suggested_topic(final SubLObject rtg, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject topic_tail = cdestructuring_bind.property_list_member((SubLObject)random_thought_generator.$kw33$TOPIC, parameters);
        final SubLObject topic = (SubLObject)((random_thought_generator.NIL != topic_tail) ? conses_high.cadr(topic_tail) : random_thought_generator.NIL);
        final SubLObject now_tail = cdestructuring_bind.property_list_member((SubLObject)random_thought_generator.$kw105$NOW, parameters);
        final SubLObject now = (SubLObject)((random_thought_generator.NIL != now_tail) ? conses_high.cadr(now_tail) : random_thought_generator.T);
        final SubLObject require_topicalP_tail = cdestructuring_bind.property_list_member((SubLObject)random_thought_generator.$kw106$REQUIRE_TOPICAL_, parameters);
        final SubLObject require_topicalP = (SubLObject)((random_thought_generator.NIL != require_topicalP_tail) ? conses_high.cadr(require_topicalP_tail) : random_thought_generator.NIL);
        register_interest_in_random_thoughts_about_topic(rtg, topic);
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        SubLObject existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, (SubLObject)random_thought_generator.NIL);
        SubLObject thought = (SubLObject)random_thought_generator.NIL;
        if (!existing_info.isCons() && random_thought_generator.NIL == now) {
            final SubLObject generator_thread = find_or_create_random_thought_generator_thread(rtg, (SubLObject)random_thought_generator.T);
            SubLObject stopP = (SubLObject)random_thought_generator.NIL;
            if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str107$__Waiting_for_new_thoughts_about_, topic)));
                streams_high.force_output((SubLObject)random_thought_generator.T);
            }
            while (random_thought_generator.NIL == stopP) {
                existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, (SubLObject)random_thought_generator.NIL);
                Threads.sleep((SubLObject)random_thought_generator.$float108$0_5);
                stopP = (SubLObject)SubLObjectFactory.makeBoolean(existing_info.isCons() || random_thought_generator.NIL == Threads.valid_process_p(generator_thread));
            }
        }
        if (existing_info.isCons()) {
            thought = existing_info.first();
            final SubLObject freshly_exhaustedP = Types.sublisp_null(existing_info.rest());
            final SubLObject known_exhaustedP = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != freshly_exhaustedP || random_thought_generator.NIL != random_thoughts_on_topic_exhausted_p(existing_info));
            if (random_thought_generator.NIL != freshly_exhaustedP) {
                note_random_thoughts_on_topic_exhausted(existing_info);
            }
            if (random_thought_generator.NIL == thought) {
                if ((random_thought_generator.NIL != freshly_exhaustedP || random_thought_generator.NIL == known_exhaustedP) && random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                    Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str109$___A_out_of_thoughts_about__S__, (SubLObject)((random_thought_generator.NIL != known_exhaustedP) ? random_thought_generator.$str110$Totally : random_thought_generator.$str111$Temporarily), topic)));
                    streams_high.force_output((SubLObject)random_thought_generator.T);
                }
                if (random_thought_generator.NIL == now && random_thought_generator.NIL == known_exhaustedP) {
                    final SubLObject generator_thread2 = find_or_create_random_thought_generator_thread(rtg, (SubLObject)random_thought_generator.UNPROVIDED);
                    SubLObject stopP2 = (SubLObject)random_thought_generator.NIL;
                    if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                        Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str107$__Waiting_for_new_thoughts_about_, topic)));
                        streams_high.force_output((SubLObject)random_thought_generator.T);
                    }
                    while (random_thought_generator.NIL == stopP2) {
                        Threads.sleep((SubLObject)random_thought_generator.$float108$0_5);
                        thought = existing_info.first();
                        stopP2 = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != thought || random_thought_generator.NIL == existing_info.rest() || random_thought_generator.NIL == Threads.valid_process_p(generator_thread2));
                    }
                }
            }
            ConsesLow.rplaca(existing_info, (SubLObject)random_thought_generator.NIL);
        }
        else if (random_thought_generator.NIL == dictionary.dictionary_lookup(topical_thoughts, topic, (SubLObject)random_thought_generator.NIL)) {
            register_interest_in_random_thoughts_about_topic(rtg, topic);
        }
        return (random_thought_generator.NIL != thought) ? thought : ((random_thought_generator.NIL != require_topicalP) ? empty_thought() : next_random_thought_without_suggested_topic(rtg, parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 22129L)
    public static SubLObject next_random_thought_without_suggested_topic(SubLObject rtg, final SubLObject parameters) {
        final SubLObject queue = rtg_queue(rtg);
        SubLObject thought = empty_thought();
        if (random_thought_generator.NIL != queues.queue_empty_p(queue) && random_thought_generator.NIL != random_thought_generator_exhausted_p(rtg)) {
            set.clear_set(rtg_done_assertions(rtg));
            rtg = new_random_thought_generator_for_user(rtg_user(rtg));
        }
        for (SubLObject generator_thread = find_or_create_random_thought_generator_thread(rtg, (SubLObject)random_thought_generator.UNPROVIDED), dont_waitP = conses_high.getf(parameters, (SubLObject)random_thought_generator.$kw105$NOW, (SubLObject)random_thought_generator.T), stopP = (SubLObject)random_thought_generator.NIL; random_thought_generator.NIL == stopP; stopP = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != dont_waitP || random_thought_generator.NIL != thought.first() || random_thought_generator.NIL == Threads.valid_process_p(generator_thread))) {
            thought = queues.dequeue(queue);
        }
        return thought;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 22930L)
    public static SubLObject find_or_create_random_thought_generator_thread(final SubLObject rtg, SubLObject topical_onlyP) {
        if (topical_onlyP == random_thought_generator.UNPROVIDED) {
            topical_onlyP = (SubLObject)random_thought_generator.NIL;
        }
        SubLObject generator_thread = rtg_generator_thread(rtg);
        if (random_thought_generator.NIL == Threads.valid_process_p(generator_thread)) {
            generator_thread = process_utilities.make_cyc_server_process_with_args((SubLObject)random_thought_generator.$str112$Random_Thought_Generator, (SubLObject)random_thought_generator.$sym113$KEEP_RANDOM_THOUGHT_GENERATOR_FULL, (SubLObject)ConsesLow.list(rtg, (SubLObject)((random_thought_generator.NIL != topical_onlyP) ? random_thought_generator.ZERO_INTEGER : random_thought_generator.$int114$25)));
            SubLObject doneP = (SubLObject)random_thought_generator.NIL;
            SubLObject interval_ms = (SubLObject)random_thought_generator.ONE_INTEGER;
            final SubLObject increase_factor = (SubLObject)random_thought_generator.$float115$1_5;
            final SubLObject max_ms = (SubLObject)random_thought_generator.NIL;
            while (random_thought_generator.NIL == doneP) {
                doneP = Threads.valid_process_p(generator_thread);
                if (random_thought_generator.NIL == doneP) {
                    Threads.sleep(Numbers.divide(interval_ms, (SubLObject)random_thought_generator.$int116$1000));
                    if (interval_ms.numGE(max_ms)) {
                        continue;
                    }
                    final SubLObject new_interval = Numbers.multiply(interval_ms, increase_factor);
                    interval_ms = Numbers.min(new_interval, max_ms);
                }
            }
            rtg_set_generator_thread(rtg, generator_thread);
        }
        return generator_thread;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 23767L)
    public static SubLObject keep_random_thought_generator_full(final SubLObject rtg, SubLObject target_size, SubLObject check_interval) {
        if (target_size == random_thought_generator.UNPROVIDED) {
            target_size = (SubLObject)random_thought_generator.$int114$25;
        }
        if (check_interval == random_thought_generator.UNPROVIDED) {
            check_interval = (SubLObject)random_thought_generator.TEN_INTEGER;
        }
        while (random_thought_generator.NIL == random_thought_generator_exhausted_p(rtg)) {
            if (random_thought_generator.NIL != random_thought_generator_full_p(rtg, target_size)) {
                Threads.sleep(check_interval);
            }
            else {
                fill_random_thought_generator(rtg, target_size);
            }
        }
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 24087L)
    public static SubLObject fill_random_thought_generator(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str117$__Filling__S__, rtg)));
            streams_high.force_output((SubLObject)random_thought_generator.T);
        }
        SubLObject new_entries = (SubLObject)random_thought_generator.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rtg_topical_thoughts(rtg))); random_thought_generator.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (random_thought_generator.$kw93$NEW_TOPIC.eql(data)) {
                new_entries = list_utilities.alist_enter(new_entries, topic, update_random_thought_data(new_random_thought_data_for_topic(topic), topic, rtg), (SubLObject)random_thought_generator.UNPROVIDED);
            }
            else if (random_thought_generator.NIL == data.first() && random_thought_generator.NIL == random_thoughts_on_topic_exhausted_p(data)) {
                new_entries = list_utilities.alist_enter(new_entries, topic, update_random_thought_data(data, topic, rtg), (SubLObject)random_thought_generator.UNPROVIDED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var = new_entries;
        SubLObject cons = (SubLObject)random_thought_generator.NIL;
        cons = cdolist_list_var.first();
        while (random_thought_generator.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject topic2 = (SubLObject)random_thought_generator.NIL;
            SubLObject new_data = (SubLObject)random_thought_generator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)random_thought_generator.$list118);
            topic2 = current.first();
            current = (new_data = current.rest());
            dictionary.dictionary_enter(rtg_topical_thoughts(rtg), topic2, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        if (random_thought_generator.NIL != list_utilities.empty_list_p(new_entries)) {
            fill_random_thought_generator_queue(rtg, target_size);
        }
        if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str119$___S_is_now_full__, rtg)));
            streams_high.force_output((SubLObject)random_thought_generator.T);
        }
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 24927L)
    public static SubLObject update_random_thought_data(final SubLObject data, final SubLObject topic, final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (random_thought_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!data.isCons() || random_thought_generator.NIL != data.first())) {
            Errors.error((SubLObject)random_thought_generator.$str120$_S_is_not_in_an_updatable_state, data);
        }
        while (random_thought_generator.NIL == data.first() && random_thought_generator.NIL != data.rest()) {
            thread.resetMultipleValues();
            final SubLObject remaining = list_utilities.random_delete(data.rest());
            final SubLObject candidate = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ConsesLow.rplacd(data, remaining);
            final SubLObject really_newP = set.set_add(candidate, rtg_done_assertions(rtg));
            if (random_thought_generator.NIL != really_newP && random_thought_generator.NIL != open_cyc_formula(candidate) && random_thought_generator.NIL != thcl.thcl_formulaP(candidate, (SubLObject)random_thought_generator.UNPROVIDED) && random_thought_generator.NIL == potentially_porn_relatedP(candidate)) {
                final SubLObject paraphrase = thcl_paraphrase_for_assertion(candidate);
                if (random_thought_generator.NIL == paraphrase) {
                    continue;
                }
                if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                    Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str121$__New_thought_concerning__S_____S, topic, pph_utilities.pph_javalist_string(paraphrase))));
                    streams_high.force_output((SubLObject)random_thought_generator.T);
                }
                ConsesLow.rplaca(data, (SubLObject)ConsesLow.list(topic, candidate, paraphrase));
            }
        }
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 25709L)
    public static SubLObject open_cyc_formula(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == list_utilities.find_if_not((SubLObject)random_thought_generator.$sym122$OPEN_CYC_FORT, cycl_utilities.expression_gather(formula, (SubLObject)random_thought_generator.$sym30$FORT_P, (SubLObject)random_thought_generator.T, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED), (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 25838L)
    public static SubLObject open_cyc_fort_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)random_thought_generator.NIL;
        SubLObject ignore_errors_tag = (SubLObject)random_thought_generator.NIL;
        try {
            thread.throwStack.push(random_thought_generator.$kw45$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)random_thought_generator.$sym46$IGNORE_ERRORS_HANDLER), thread);
                try {
                    ans = owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)random_thought_generator.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)random_thought_generator.$kw45$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 25838L)
    public static SubLObject open_cyc_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)random_thought_generator.NIL;
        if (random_thought_generator.NIL == v_memoization_state) {
            return open_cyc_fort_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)random_thought_generator.$sym122$OPEN_CYC_FORT, (SubLObject)random_thought_generator.UNPROVIDED);
        if (random_thought_generator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)random_thought_generator.$sym122$OPEN_CYC_FORT, (SubLObject)random_thought_generator.ONE_INTEGER, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.EQL, (SubLObject)random_thought_generator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)random_thought_generator.$sym122$OPEN_CYC_FORT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(open_cyc_fort_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, (SubLObject)random_thought_generator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 26018L)
    public static SubLObject potentially_porn_relatedP_internal(final SubLObject obj) {
        if (random_thought_generator.NIL != forts.fort_p(obj)) {
            return isa.quoted_isa_in_any_mtP(obj, random_thought_generator.$const124$PotentiallyPornRelated);
        }
        if (random_thought_generator.NIL != el_utilities.el_formula_p(obj)) {
            SubLObject result = (SubLObject)random_thought_generator.NIL;
            final SubLObject args = cycl_utilities.formula_args(obj, (SubLObject)random_thought_generator.$kw125$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)random_thought_generator.NIL, rest = args; random_thought_generator.NIL == result && random_thought_generator.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                if (random_thought_generator.NIL != potentially_porn_relatedP(arg)) {
                    result = (SubLObject)random_thought_generator.T;
                }
            }
            return result;
        }
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 26018L)
    public static SubLObject potentially_porn_relatedP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)random_thought_generator.NIL;
        if (random_thought_generator.NIL == v_memoization_state) {
            return potentially_porn_relatedP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, (SubLObject)random_thought_generator.UNPROVIDED);
        if (random_thought_generator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, (SubLObject)random_thought_generator.ONE_INTEGER, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.EQL, (SubLObject)random_thought_generator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(potentially_porn_relatedP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)random_thought_generator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 26357L)
    public static SubLObject new_random_thought_data_for_topic(final SubLObject topic) {
        return (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.NIL, gafs_about_topic(topic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 26461L)
    public static SubLObject gafs_about_topic(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = (SubLObject)random_thought_generator.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(thcl.random_thcl_assertion_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject preds_to_skip = set.new_set(Symbols.symbol_function((SubLObject)random_thought_generator.EQL), (SubLObject)random_thought_generator.UNPROVIDED);
            final SubLObject pred_var = (SubLObject)random_thought_generator.NIL;
            if (random_thought_generator.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, (SubLObject)random_thought_generator.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, (SubLObject)random_thought_generator.NIL, pred_var);
                SubLObject done_var = (SubLObject)random_thought_generator.NIL;
                final SubLObject token_var = (SubLObject)random_thought_generator.NIL;
                while (random_thought_generator.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (random_thought_generator.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)random_thought_generator.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)random_thought_generator.$kw126$GAF, (SubLObject)random_thought_generator.$kw127$TRUE, (SubLObject)random_thought_generator.NIL);
                            SubLObject done_var_$24 = (SubLObject)random_thought_generator.NIL;
                            final SubLObject token_var_$25 = (SubLObject)random_thought_generator.NIL;
                            while (random_thought_generator.NIL == done_var_$24) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                final SubLObject valid_$26 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$25.eql(gaf));
                                if (random_thought_generator.NIL != valid_$26) {
                                    final SubLObject pred = assertions_high.gaf_arg0(gaf);
                                    if (random_thought_generator.NIL == set.set_memberP(pred, preds_to_skip)) {
                                        if (random_thought_generator.NIL == gaf_about_topicP(gaf, topic, pred)) {
                                            set.set_add(pred, preds_to_skip);
                                        }
                                        else {
                                            gafs = (SubLObject)ConsesLow.cons(gaf, gafs);
                                        }
                                    }
                                }
                                done_var_$24 = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == valid_$26);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)random_thought_generator.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (random_thought_generator.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (random_thought_generator.NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            Functions.apply((SubLObject)random_thought_generator.$sym102$FORMAT, (SubLObject)ConsesLow.cons((SubLObject)random_thought_generator.T, (SubLObject)ConsesLow.list((SubLObject)random_thought_generator.$str128$__Found__S_GAF_assertions_about__, Sequences.length(gafs), topic)));
            streams_high.force_output((SubLObject)random_thought_generator.T);
        }
        return gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 26987L)
    public static SubLObject gaf_about_topicP(final SubLObject gaf, final SubLObject topic, SubLObject pred) {
        if (pred == random_thought_generator.UNPROVIDED) {
            pred = assertions_high.gaf_arg0(gaf);
        }
        SubLObject min_count = (SubLObject)random_thought_generator.NIL;
        SubLObject min_topic_count = (SubLObject)random_thought_generator.NIL;
        SubLObject argnum = (SubLObject)random_thought_generator.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(gaf, (SubLObject)random_thought_generator.$kw125$IGNORE);
        SubLObject arg = (SubLObject)random_thought_generator.NIL;
        arg = cdolist_list_var.first();
        while (random_thought_generator.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)random_thought_generator.ONE_INTEGER);
            final SubLObject count = kb_indexing.num_gaf_arg_index(arg, argnum, pred, (SubLObject)random_thought_generator.UNPROVIDED);
            if (arg.eql(topic) && (random_thought_generator.NIL == min_topic_count || count.numL(min_topic_count))) {
                min_topic_count = count;
            }
            else if (random_thought_generator.NIL == min_count || count.numL(min_count)) {
                min_count = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(random_thought_generator.NIL != min_topic_count && (random_thought_generator.NIL == min_count || min_topic_count.numLE(min_count)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 27512L)
    public static SubLObject fill_random_thought_generator_queue(final SubLObject rtg, final SubLObject target_size) {
        while (random_thought_generator.NIL == random_thought_generator_exhausted_p(rtg) && random_thought_generator.NIL == random_thought_generator_queue_full_p(rtg, target_size)) {
            add_random_thought_to_rtg(rtg);
        }
        return rtg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 27754L)
    public static SubLObject add_random_thought_to_rtg(final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = rtg_user(rtg);
        final SubLObject most_recently_added_thought = rtg_most_recently_added_thought(rtg);
        SubLObject next_thought = (SubLObject)random_thought_generator.NIL;
        SubLObject next_term = next_thcl_topic(most_recently_added_thought);
        SubLObject next_assertion = (SubLObject)random_thought_generator.NIL;
        SubLObject next_assertion_paraphrase = (SubLObject)random_thought_generator.NIL;
        if (random_thought_generator.NIL == next_term) {
            thread.resetMultipleValues();
            final SubLObject next_term_$28 = thcl.random_thcl_constant_and_assertion(user);
            final SubLObject next_assertion_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            next_term = next_term_$28;
            next_assertion = next_assertion_$29;
        }
        else if (random_thought_generator.NIL == next_assertion) {
            next_assertion = thcl.random_thcl_assertion(next_term, user);
            if (random_thought_generator.NIL == next_assertion) {
                thread.resetMultipleValues();
                final SubLObject next_term_$29 = thcl.random_thcl_constant_and_assertion(user);
                final SubLObject next_assertion_$30 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                next_term = next_term_$29;
                next_assertion = next_assertion_$30;
            }
        }
        SubLObject triedP = (SubLObject)random_thought_generator.NIL;
        while (random_thought_generator.NIL == next_assertion_paraphrase) {
            if (random_thought_generator.NIL != triedP) {
                next_assertion = thcl.random_thcl_assertion(next_term, user);
                if (random_thought_generator.NIL == next_assertion) {
                    thread.resetMultipleValues();
                    final SubLObject next_term_$30 = thcl.random_thcl_constant_and_assertion(user);
                    final SubLObject next_assertion_$31 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    next_term = next_term_$30;
                    next_assertion = next_assertion_$31;
                }
            }
            if (random_thought_generator.NIL != next_assertion) {
                next_assertion_paraphrase = thcl_paraphrase_for_assertion(next_assertion);
                triedP = (SubLObject)random_thought_generator.T;
                set.set_add(next_assertion, rtg_done_assertions(rtg));
            }
        }
        if (random_thought_generator.NIL == next_assertion || random_thought_generator.NIL == next_assertion_paraphrase) {
            note_rtg_exhausted(rtg);
        }
        else {
            next_thought = (SubLObject)ConsesLow.list(next_term, next_assertion, next_assertion_paraphrase);
        }
        if (random_thought_generator.NIL != next_thought) {
            queues.enqueue(next_thought, rtg_queue(rtg));
            rtg_set_most_recently_added_thought(rtg, next_thought);
        }
        return next_thought;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 29231L)
    public static SubLObject thcl_paraphrase_for_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paraphrase = (SubLObject)random_thought_generator.NIL;
        SubLObject error_message = (SubLObject)random_thought_generator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind((SubLObject)random_thought_generator.ONE_INTEGER, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)random_thought_generator.NIL, thread);
            pph_error.$pph_error_handling_onP$.bind((SubLObject)random_thought_generator.T, thread);
            if (random_thought_generator.NIL != pph_error.pph_break_on_errorP()) {
                paraphrase = pph_main.generate_phrase_for_java(assertion, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
            }
            else {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$34 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)random_thought_generator.$sym53$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            paraphrase = pph_main.generate_phrase_for_java(assertion, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)random_thought_generator.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$34, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && random_thought_generator.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)random_thought_generator.$str129$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        }
        finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_3, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((random_thought_generator.NIL == paraphrase || random_thought_generator.NIL != thcl_paraphrase_unacceptableP(pph_utilities.pph_javalist_string(paraphrase))) ? random_thought_generator.NIL : paraphrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 29631L)
    public static SubLObject thcl_paraphrase_unacceptableP(final SubLObject string) {
        if (random_thought_generator.NIL == string_utilities.non_empty_stringP(string)) {
            return (SubLObject)random_thought_generator.T;
        }
        if (random_thought_generator.NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), string, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED)) {
            return (SubLObject)random_thought_generator.T;
        }
        return (SubLObject)random_thought_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 29907L)
    public static SubLObject next_thcl_topic(final SubLObject most_recently_added_thought) {
        SubLObject next_term = (SubLObject)random_thought_generator.NIL;
        final SubLObject method = choose_thcl_topic_selection_method();
        SubLObject v_term = (SubLObject)random_thought_generator.NIL;
        SubLObject assertion = (SubLObject)random_thought_generator.NIL;
        SubLObject assertion_paraphrase = (SubLObject)random_thought_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(most_recently_added_thought, most_recently_added_thought, (SubLObject)random_thought_generator.$list130);
        v_term = most_recently_added_thought.first();
        SubLObject current = most_recently_added_thought.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, most_recently_added_thought, (SubLObject)random_thought_generator.$list130);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, most_recently_added_thought, (SubLObject)random_thought_generator.$list130);
        assertion_paraphrase = current.first();
        current = current.rest();
        if (random_thought_generator.NIL == current) {
            final SubLObject pcase_var = method;
            if (pcase_var.eql((SubLObject)random_thought_generator.$kw131$NEW_ARG_FROM_ASSERTION)) {
                if (random_thought_generator.NIL != assertion) {
                    final SubLObject args = cycl_utilities.formula_args(uncanonicalizer.assertion_el_formula(assertion), (SubLObject)random_thought_generator.$kw125$IGNORE);
                    SubLObject rest;
                    SubLObject arg;
                    for (rest = (SubLObject)random_thought_generator.NIL, rest = args; random_thought_generator.NIL == next_term && random_thought_generator.NIL != rest; rest = rest.rest()) {
                        arg = rest.first();
                        if (!arg.eql(v_term) && random_thought_generator.NIL != thcl.thcl_constantP(arg, (SubLObject)random_thought_generator.UNPROVIDED)) {
                            next_term = arg;
                        }
                    }
                }
                if (random_thought_generator.NIL == next_term) {
                    next_term = v_term;
                }
            }
            else if (pcase_var.eql((SubLObject)random_thought_generator.$kw132$REUSE_MOST_RECENTLY_ADDED_TOPIC)) {
                next_term = v_term;
            }
            else {
                next_term = (SubLObject)random_thought_generator.NIL;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(most_recently_added_thought, (SubLObject)random_thought_generator.$list130);
        }
        return next_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/random-thought-generator.lisp", position = 30581L)
    public static SubLObject choose_thcl_topic_selection_method() {
        final SubLObject pcase_var;
        final SubLObject pick_a_number = pcase_var = random.random((SubLObject)random_thought_generator.SIXTEEN_INTEGER);
        if (pcase_var.eql((SubLObject)random_thought_generator.ZERO_INTEGER)) {
            return (SubLObject)random_thought_generator.$kw133$RANDOM;
        }
        if (pcase_var.eql((SubLObject)random_thought_generator.ONE_INTEGER) || pcase_var.eql((SubLObject)random_thought_generator.TWO_INTEGER)) {
            return (SubLObject)random_thought_generator.$kw132$REUSE_MOST_RECENTLY_ADDED_TOPIC;
        }
        return (SubLObject)random_thought_generator.$kw131$NEW_ARG_FROM_ASSERTION;
    }
    
    public static SubLObject declare_random_thought_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_p", "RANDOM-THOUGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "empty_random_thought_p", "EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "non_empty_random_thought_p", "NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "xml_output_random_thoughts", "XML-OUTPUT-RANDOM-THOUGHTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "xml_output_random_thoughts_for_terms", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERMS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "sql_output_random_thoughts_from_xml", "SQL-OUTPUT-RANDOM-THOUGHTS-FROM-XML", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_num_for_topic", "NEXT-RANDOM-THOUGHT-NUM-FOR-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "write_random_thought_sql_header", "WRITE-RANDOM-THOUGHT-SQL-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "write_random_thought_sql_row", "WRITE-RANDOM-THOUGHT-SQL-ROW", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "xml_output_random_thoughts_for_term", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "xml_output_random_thought", "XML-OUTPUT-RANDOM-THOUGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "valid_non_empty_random_thought_p", "VALID-NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_for_user", "NEXT-RANDOM-THOUGHT-FOR-USER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "thcl_assertion_seen_by_cyclistP", "THCL-ASSERTION-SEEN-BY-CYCLIST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "number_of_queued_random_thoughts_for_user", "NUMBER-OF-QUEUED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "number_of_used_random_thoughts_for_user", "NUMBER-OF-USED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "remote_random_thought_image", "REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "set_remote_random_thought_image", "SET-REMOTE-RANDOM-THOUGHT-IMAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "unset_remote_random_thought_image", "UNSET-REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "clear_remote_random_thought_connection_pool", "CLEAR-REMOTE-RANDOM-THOUGHT-CONNECTION-POOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_server_hostXport", "RANDOM-THOUGHT-SERVER-HOST&PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_for_user_from_remote_server", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_for_user_from_remote_server_int", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "create_remote_random_thought_connection", "CREATE-REMOTE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "release_random_thought_connection", "RELEASE-RANDOM-THOUGHT-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "open_remote_random_thought_connection_p", "OPEN-REMOTE-RANDOM-THOUGHT-CONNECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "get_free_random_thought_connection", "GET-FREE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "register_random_thought_generator", "REGISTER-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "find_random_thought_generator_for_user", "FIND-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_generator_print_function_trampoline", "RANDOM-THOUGHT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_generator_p", "RANDOM-THOUGHT-GENERATOR-P", 1, 0, false);
        new $random_thought_generator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_user", "RTG-STRUCT-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_done_assertions", "RTG-STRUCT-DONE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_generator_thread", "RTG-STRUCT-GENERATOR-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_queue", "RTG-STRUCT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_most_recently_added_thought", "RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_struct_topical_thoughts", "RTG-STRUCT-TOPICAL-THOUGHTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_user", "_CSETF-RTG-STRUCT-USER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_done_assertions", "_CSETF-RTG-STRUCT-DONE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_generator_thread", "_CSETF-RTG-STRUCT-GENERATOR-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_queue", "_CSETF-RTG-STRUCT-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_most_recently_added_thought", "_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "_csetf_rtg_struct_topical_thoughts", "_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "make_random_thought_generator", "MAKE-RANDOM-THOUGHT-GENERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "visit_defstruct_random_thought_generator", "VISIT-DEFSTRUCT-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "visit_defstruct_object_random_thought_generator_method", "VISIT-DEFSTRUCT-OBJECT-RANDOM-THOUGHT-GENERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_user", "RTG-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_done_assertions", "RTG-DONE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_generator_thread", "RTG-GENERATOR-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_set_generator_thread", "RTG-SET-GENERATOR-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_queue", "RTG-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_most_recently_added_thought", "RTG-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_set_most_recently_added_thought", "RTG-SET-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_topical_thoughts", "RTG-TOPICAL-THOUGHTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "rtg_set_topical_thoughts", "RTG-SET-TOPICAL-THOUGHTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "pprint_random_thought_generator", "PPRINT-RANDOM-THOUGHT-GENERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "find_or_create_random_thought_generator_for_user", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "empty_thought", "EMPTY-THOUGHT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "new_random_thought_generator_for_user", "NEW-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "new_random_thought_generator", "NEW-RANDOM-THOUGHT-GENERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "note_rtg_exhausted", "NOTE-RTG-EXHAUSTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_generator_exhausted_p", "RANDOM-THOUGHT-GENERATOR-EXHAUSTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thoughts_on_topic_exhausted_p", "RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "note_random_thoughts_on_topic_exhausted", "NOTE-RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_generator_full_p", "RANDOM-THOUGHT-GENERATOR-FULL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "random_thought_generator_queue_full_p", "RANDOM-THOUGHT-GENERATOR-QUEUE-FULL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "declare_interest_in_random_thoughts_about_topic", "DECLARE-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.random_thought_generator", "rtg_note", "RTG-NOTE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "register_interest_in_random_thoughts_about_topic", "REGISTER-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "all_random_thoughts_on_topic", "ALL-RANDOM-THOUGHTS-ON-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_with_suggested_topic", "NEXT-RANDOM-THOUGHT-WITH-SUGGESTED-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_random_thought_without_suggested_topic", "NEXT-RANDOM-THOUGHT-WITHOUT-SUGGESTED-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "find_or_create_random_thought_generator_thread", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-THREAD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "keep_random_thought_generator_full", "KEEP-RANDOM-THOUGHT-GENERATOR-FULL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "fill_random_thought_generator", "FILL-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "update_random_thought_data", "UPDATE-RANDOM-THOUGHT-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "open_cyc_formula", "OPEN-CYC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "open_cyc_fort_internal", "OPEN-CYC-FORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "open_cyc_fort", "OPEN-CYC-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "potentially_porn_relatedP_internal", "POTENTIALLY-PORN-RELATED?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "potentially_porn_relatedP", "POTENTIALLY-PORN-RELATED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "new_random_thought_data_for_topic", "NEW-RANDOM-THOUGHT-DATA-FOR-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "gafs_about_topic", "GAFS-ABOUT-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "gaf_about_topicP", "GAF-ABOUT-TOPIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "fill_random_thought_generator_queue", "FILL-RANDOM-THOUGHT-GENERATOR-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "add_random_thought_to_rtg", "ADD-RANDOM-THOUGHT-TO-RTG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "thcl_paraphrase_for_assertion", "THCL-PARAPHRASE-FOR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "thcl_paraphrase_unacceptableP", "THCL-PARAPHRASE-UNACCEPTABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "next_thcl_topic", "NEXT-THCL-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.random_thought_generator", "choose_thcl_topic_selection_method", "CHOOSE-THCL-TOPIC-SELECTION-METHOD", 0, 0, false);
        return (SubLObject)random_thought_generator.NIL;
    }
    
    public static SubLObject init_random_thought_generator_file() {
        random_thought_generator.$random_thought_server_host$ = SubLFiles.defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper((SubLObject)(random_thought_generator.$list34.isSymbol() ? Symbols.symbol_value((SubLObject)random_thought_generator.$list34) : random_thought_generator.$list34), (SubLObject)random_thought_generator.$sym35$_RANDOM_THOUGHT_SERVER_HOST_, (SubLObject)(random_thought_generator.$str36$random_thoughts_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)random_thought_generator.$str36$random_thoughts_cyc_com) : random_thought_generator.$str36$random_thoughts_cyc_com), (SubLObject)random_thought_generator.$kw37$PARAMETER, (SubLObject)random_thought_generator.UNPROVIDED));
        random_thought_generator.$random_thought_server_port$ = SubLFiles.defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper((SubLObject)(random_thought_generator.$list38.isSymbol() ? Symbols.symbol_value((SubLObject)random_thought_generator.$list38) : random_thought_generator.$list38), (SubLObject)random_thought_generator.$sym39$_RANDOM_THOUGHT_SERVER_PORT_, (SubLObject)(random_thought_generator.$int40$3634.isSymbol() ? Symbols.symbol_value((SubLObject)random_thought_generator.$int40$3634) : random_thought_generator.$int40$3634), (SubLObject)random_thought_generator.$kw37$PARAMETER, (SubLObject)random_thought_generator.UNPROVIDED));
        random_thought_generator.$remote_random_thought_image$ = SubLFiles.deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", (SubLObject)((random_thought_generator.NIL != Symbols.boundp((SubLObject)random_thought_generator.$sym41$_REMOTE_RANDOM_THOUGHT_IMAGE_)) ? random_thought_generator.$remote_random_thought_image$.getGlobalValue() : random_thought_generator.NIL));
        random_thought_generator.$remote_random_thought_connection_pool$ = SubLFiles.deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", (random_thought_generator.NIL != Symbols.boundp((SubLObject)random_thought_generator.$sym43$_REMOTE_RANDOM_THOUGHT_CONNECTION_POOL_)) ? random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue() : queues.create_queue((SubLObject)random_thought_generator.UNPROVIDED));
        random_thought_generator.$remote_random_thought_connection_pool_lock$ = SubLFiles.deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", Locks.make_lock((SubLObject)random_thought_generator.$str44$Remote_Random_Thought_Connection_));
        random_thought_generator.$remote_random_thought_connection_pool_max_size$ = SubLFiles.deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*", (SubLObject)random_thought_generator.NINE_INTEGER);
        random_thought_generator.$random_thought_generators_for_users$ = SubLFiles.deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", (random_thought_generator.NIL != Symbols.boundp((SubLObject)random_thought_generator.$sym55$_RANDOM_THOUGHT_GENERATORS_FOR_USERS_)) ? random_thought_generator.$random_thought_generators_for_users$.getGlobalValue() : dictionary.new_dictionary((SubLObject)random_thought_generator.UNPROVIDED, (SubLObject)random_thought_generator.UNPROVIDED));
        random_thought_generator.$dtp_random_thought_generator$ = SubLFiles.defconstant("*DTP-RANDOM-THOUGHT-GENERATOR*", (SubLObject)random_thought_generator.$sym56$RANDOM_THOUGHT_GENERATOR);
        random_thought_generator.$print_rtg_notesP$ = SubLFiles.defparameter("*PRINT-RTG-NOTES?*", (SubLObject)random_thought_generator.NIL);
        return (SubLObject)random_thought_generator.NIL;
    }
    
    public static SubLObject setup_random_thought_generator_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)random_thought_generator.$sym41$_REMOTE_RANDOM_THOUGHT_IMAGE_);
        subl_macro_promotions.declare_defglobal((SubLObject)random_thought_generator.$sym43$_REMOTE_RANDOM_THOUGHT_CONNECTION_POOL_);
        subl_macro_promotions.declare_defglobal((SubLObject)random_thought_generator.$sym55$_RANDOM_THOUGHT_GENERATORS_FOR_USERS_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)random_thought_generator.$sym63$RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)random_thought_generator.$list64);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym65$RTG_STRUCT_USER, (SubLObject)random_thought_generator.$sym66$_CSETF_RTG_STRUCT_USER);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym67$RTG_STRUCT_DONE_ASSERTIONS, (SubLObject)random_thought_generator.$sym68$_CSETF_RTG_STRUCT_DONE_ASSERTIONS);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym69$RTG_STRUCT_GENERATOR_THREAD, (SubLObject)random_thought_generator.$sym70$_CSETF_RTG_STRUCT_GENERATOR_THREAD);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym71$RTG_STRUCT_QUEUE, (SubLObject)random_thought_generator.$sym72$_CSETF_RTG_STRUCT_QUEUE);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym73$RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT, (SubLObject)random_thought_generator.$sym74$_CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT);
        Structures.def_csetf((SubLObject)random_thought_generator.$sym75$RTG_STRUCT_TOPICAL_THOUGHTS, (SubLObject)random_thought_generator.$sym76$_CSETF_RTG_STRUCT_TOPICAL_THOUGHTS);
        Equality.identity((SubLObject)random_thought_generator.$sym56$RANDOM_THOUGHT_GENERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)random_thought_generator.$sym88$VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)random_thought_generator.$sym62$PPRINT_RANDOM_THOUGHT_GENERATOR);
        memoization_state.note_memoized_function((SubLObject)random_thought_generator.$sym122$OPEN_CYC_FORT);
        memoization_state.note_memoized_function((SubLObject)random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_);
        return (SubLObject)random_thought_generator.NIL;
    }
    
    public void declareFunctions() {
        declare_random_thought_generator_file();
    }
    
    public void initializeVariables() {
        init_random_thought_generator_file();
    }
    
    public void runTopLevelForms() {
        setup_random_thought_generator_file();
    }
    
    static {
        me = (SubLFile)new random_thought_generator();
        random_thought_generator.$random_thought_server_host$ = null;
        random_thought_generator.$random_thought_server_port$ = null;
        random_thought_generator.$remote_random_thought_image$ = null;
        random_thought_generator.$remote_random_thought_connection_pool$ = null;
        random_thought_generator.$remote_random_thought_connection_pool_lock$ = null;
        random_thought_generator.$remote_random_thought_connection_pool_max_size$ = null;
        random_thought_generator.$random_thought_generators_for_users$ = null;
        random_thought_generator.$dtp_random_thought_generator$ = null;
        random_thought_generator.$print_rtg_notesP$ = null;
        $list0 = ConsesLow.list((SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL, (SubLObject)random_thought_generator.NIL);
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-JAVALIST-P")));
        $const2$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $sym3$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym4$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw5$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str6$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str7$Generating_ = SubLObjectFactory.makeString("Generating ");
        $str8$_random_thoughts___ = SubLObjectFactory.makeString(" random thoughts...");
        $str9$random_thoughts = SubLObjectFactory.makeString("random-thoughts");
        $kw10$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)random_thought_generator.NIL);
        $str12$thoughts = SubLObjectFactory.makeString("thoughts");
        $str13$Exporting_random_thoughts_to_ = SubLObjectFactory.makeString("Exporting random thoughts to ");
        $kw14$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $str16$Parsing_XML_stream___ = SubLObjectFactory.makeString("Parsing XML stream...");
        $str17$thoughts_about = SubLObjectFactory.makeString("thoughts-about");
        $str18$topic_id = SubLObjectFactory.makeString("topic-id");
        $str19$thought = SubLObjectFactory.makeString("thought");
        $str20$Expected__thought___got__S = SubLObjectFactory.makeString("Expected 'thought', got ~S");
        $str21$assertion_id = SubLObjectFactory.makeString("assertion-id");
        $str22$paraphrase = SubLObjectFactory.makeString("paraphrase");
        $str23$string = SubLObjectFactory.makeString("string");
        $str24$_____ = SubLObjectFactory.makeString(";~%~%");
        $str25$___ = SubLObjectFactory.makeString(",~%");
        $str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_ = SubLObjectFactory.makeString("INSERT INTO THOUGHTS(INTERNAL_ID, TERM_EID, TERM_CYCL, ASRTN_EID, ASRTN_CYCL_SENTENCE, ASRTN_MT, ASRTN_PARAPHRASE) VALUES");
        $str27$___D____A_____A_____A_____A_____A = SubLObjectFactory.makeString(" (~D, '~A', '~A', '~A', '~A', '~A', '~A')");
        $str28$_ = SubLObjectFactory.makeString("'");
        $str29$__ = SubLObjectFactory.makeString("''");
        $sym30$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str31$term = SubLObjectFactory.makeString("term");
        $sym32$VALID_NON_EMPTY_RANDOM_THOUGHT_P = SubLObjectFactory.makeSymbol("VALID-NON-EMPTY-RANDOM-THOUGHT-P");
        $kw33$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.random-thought-server.host"));
        $sym35$_RANDOM_THOUGHT_SERVER_HOST_ = SubLObjectFactory.makeSymbol("*RANDOM-THOUGHT-SERVER-HOST*");
        $str36$random_thoughts_cyc_com = SubLObjectFactory.makeString("random-thoughts.cyc.com");
        $kw37$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.random-thought-server.port"));
        $sym39$_RANDOM_THOUGHT_SERVER_PORT_ = SubLObjectFactory.makeSymbol("*RANDOM-THOUGHT-SERVER-PORT*");
        $int40$3634 = SubLObjectFactory.makeInteger(3634);
        $sym41$_REMOTE_RANDOM_THOUGHT_IMAGE_ = SubLObjectFactory.makeSymbol("*REMOTE-RANDOM-THOUGHT-IMAGE*");
        $kw42$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym43$_REMOTE_RANDOM_THOUGHT_CONNECTION_POOL_ = SubLObjectFactory.makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*");
        $str44$Remote_Random_Thought_Connection_ = SubLObjectFactory.makeString("Remote Random Thought Connection Pool Lock");
        $kw45$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym46$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw47$NOT_TRIED = SubLObjectFactory.makeKeyword("NOT-TRIED");
        $sym48$NEXT_RANDOM_THOUGHT_FOR_USER = SubLObjectFactory.makeSymbol("NEXT-RANDOM-THOUGHT-FOR-USER");
        $sym49$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym50$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*"), (SubLObject)random_thought_generator.T);
        $sym52$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym53$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str54$Could_not_open_a_connection_to__s = SubLObjectFactory.makeString("Could not open a connection to ~s");
        $sym55$_RANDOM_THOUGHT_GENERATORS_FOR_USERS_ = SubLObjectFactory.makeSymbol("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*");
        $sym56$RANDOM_THOUGHT_GENERATOR = SubLObjectFactory.makeSymbol("RANDOM-THOUGHT-GENERATOR");
        $sym57$RANDOM_THOUGHT_GENERATOR_P = SubLObjectFactory.makeSymbol("RANDOM-THOUGHT-GENERATOR-P");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USER"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR-THREAD"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("MOST-RECENTLY-ADDED-THOUGHT"), (SubLObject)SubLObjectFactory.makeSymbol("TOPICAL-THOUGHTS"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("GENERATOR-THREAD"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("MOST-RECENTLY-ADDED-THOUGHT"), (SubLObject)SubLObjectFactory.makeKeyword("TOPICAL-THOUGHTS"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-USER"), (SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-DONE-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-GENERATOR-THREAD"), (SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), (SubLObject)SubLObjectFactory.makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-USER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-DONE-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-GENERATOR-THREAD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS"));
        $sym62$PPRINT_RANDOM_THOUGHT_GENERATOR = SubLObjectFactory.makeSymbol("PPRINT-RANDOM-THOUGHT-GENERATOR");
        $sym63$RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RANDOM-THOUGHT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RANDOM-THOUGHT-GENERATOR-P"));
        $sym65$RTG_STRUCT_USER = SubLObjectFactory.makeSymbol("RTG-STRUCT-USER");
        $sym66$_CSETF_RTG_STRUCT_USER = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-USER");
        $sym67$RTG_STRUCT_DONE_ASSERTIONS = SubLObjectFactory.makeSymbol("RTG-STRUCT-DONE-ASSERTIONS");
        $sym68$_CSETF_RTG_STRUCT_DONE_ASSERTIONS = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-DONE-ASSERTIONS");
        $sym69$RTG_STRUCT_GENERATOR_THREAD = SubLObjectFactory.makeSymbol("RTG-STRUCT-GENERATOR-THREAD");
        $sym70$_CSETF_RTG_STRUCT_GENERATOR_THREAD = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-GENERATOR-THREAD");
        $sym71$RTG_STRUCT_QUEUE = SubLObjectFactory.makeSymbol("RTG-STRUCT-QUEUE");
        $sym72$_CSETF_RTG_STRUCT_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-QUEUE");
        $sym73$RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT = SubLObjectFactory.makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT");
        $sym74$_CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT");
        $sym75$RTG_STRUCT_TOPICAL_THOUGHTS = SubLObjectFactory.makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS");
        $sym76$_CSETF_RTG_STRUCT_TOPICAL_THOUGHTS = SubLObjectFactory.makeSymbol("_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS");
        $kw77$USER = SubLObjectFactory.makeKeyword("USER");
        $kw78$DONE_ASSERTIONS = SubLObjectFactory.makeKeyword("DONE-ASSERTIONS");
        $kw79$GENERATOR_THREAD = SubLObjectFactory.makeKeyword("GENERATOR-THREAD");
        $kw80$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw81$MOST_RECENTLY_ADDED_THOUGHT = SubLObjectFactory.makeKeyword("MOST-RECENTLY-ADDED-THOUGHT");
        $kw82$TOPICAL_THOUGHTS = SubLObjectFactory.makeKeyword("TOPICAL-THOUGHTS");
        $str83$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw84$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym85$MAKE_RANDOM_THOUGHT_GENERATOR = SubLObjectFactory.makeSymbol("MAKE-RANDOM-THOUGHT-GENERATOR");
        $kw86$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw87$END = SubLObjectFactory.makeKeyword("END");
        $sym88$VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RANDOM-THOUGHT-GENERATOR-METHOD");
        $str89$__RTG_for__S___S_done__A__ = SubLObjectFactory.makeString("#<RTG for ~S (~S done ~A)>");
        $str90$_queued = SubLObjectFactory.makeString(" queued");
        $str91$exhausted = SubLObjectFactory.makeString("exhausted");
        $kw92$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $kw93$NEW_TOPIC = SubLObjectFactory.makeKeyword("NEW-TOPIC");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym95$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym96$_PRINT_RTG_NOTES__ = SubLObjectFactory.makeSymbol("*PRINT-RTG-NOTES?*");
        $sym97$APPLY = SubLObjectFactory.makeSymbol("APPLY");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $sym99$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym100$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)random_thought_generator.T));
        $sym102$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str103$__Registering_interest_of__S_in__ = SubLObjectFactory.makeString("~&Registering interest of ~S in ~S~%");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)random_thought_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("REQUIRE-TOPICAL?"), (SubLObject)random_thought_generator.T);
        $kw105$NOW = SubLObjectFactory.makeKeyword("NOW");
        $kw106$REQUIRE_TOPICAL_ = SubLObjectFactory.makeKeyword("REQUIRE-TOPICAL?");
        $str107$__Waiting_for_new_thoughts_about_ = SubLObjectFactory.makeString("~&Waiting for new thoughts about ~S~%");
        $float108$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str109$___A_out_of_thoughts_about__S__ = SubLObjectFactory.makeString("~&~A out of thoughts about ~S~%");
        $str110$Totally = SubLObjectFactory.makeString("Totally");
        $str111$Temporarily = SubLObjectFactory.makeString("Temporarily");
        $str112$Random_Thought_Generator = SubLObjectFactory.makeString("Random Thought Generator");
        $sym113$KEEP_RANDOM_THOUGHT_GENERATOR_FULL = SubLObjectFactory.makeSymbol("KEEP-RANDOM-THOUGHT-GENERATOR-FULL");
        $int114$25 = SubLObjectFactory.makeInteger(25);
        $float115$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $int116$1000 = SubLObjectFactory.makeInteger(1000);
        $str117$__Filling__S__ = SubLObjectFactory.makeString("~&Filling ~S~%");
        $list118 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TOPIC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DATA"));
        $str119$___S_is_now_full__ = SubLObjectFactory.makeString("~&~S is now full~%");
        $str120$_S_is_not_in_an_updatable_state = SubLObjectFactory.makeString("~S is not in an updatable state");
        $str121$__New_thought_concerning__S_____S = SubLObjectFactory.makeString("~&New thought concerning ~S:~% ~S~%");
        $sym122$OPEN_CYC_FORT = SubLObjectFactory.makeSymbol("OPEN-CYC-FORT");
        $sym123$POTENTIALLY_PORN_RELATED_ = SubLObjectFactory.makeSymbol("POTENTIALLY-PORN-RELATED?");
        $const124$PotentiallyPornRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PotentiallyPornRelated"));
        $kw125$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw126$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw127$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str128$__Found__S_GAF_assertions_about__ = SubLObjectFactory.makeString("~&Found ~S GAF assertions about ~S~%");
        $str129$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-PARAPHRASE"));
        $kw131$NEW_ARG_FROM_ASSERTION = SubLObjectFactory.makeKeyword("NEW-ARG-FROM-ASSERTION");
        $kw132$REUSE_MOST_RECENTLY_ADDED_TOPIC = SubLObjectFactory.makeKeyword("REUSE-MOST-RECENTLY-ADDED-TOPIC");
        $kw133$RANDOM = SubLObjectFactory.makeKeyword("RANDOM");
    }
    
    public static final class $random_thought_generator_native extends SubLStructNative
    {
        public SubLObject $user;
        public SubLObject $done_assertions;
        public SubLObject $generator_thread;
        public SubLObject $queue;
        public SubLObject $most_recently_added_thought;
        public SubLObject $topical_thoughts;
        private static final SubLStructDeclNative structDecl;
        
        public $random_thought_generator_native() {
            this.$user = (SubLObject)CommonSymbols.NIL;
            this.$done_assertions = (SubLObject)CommonSymbols.NIL;
            this.$generator_thread = (SubLObject)CommonSymbols.NIL;
            this.$queue = (SubLObject)CommonSymbols.NIL;
            this.$most_recently_added_thought = (SubLObject)CommonSymbols.NIL;
            this.$topical_thoughts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$random_thought_generator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$user;
        }
        
        public SubLObject getField3() {
            return this.$done_assertions;
        }
        
        public SubLObject getField4() {
            return this.$generator_thread;
        }
        
        public SubLObject getField5() {
            return this.$queue;
        }
        
        public SubLObject getField6() {
            return this.$most_recently_added_thought;
        }
        
        public SubLObject getField7() {
            return this.$topical_thoughts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$user = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$done_assertions = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$generator_thread = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$queue = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$most_recently_added_thought = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$topical_thoughts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$random_thought_generator_native.class, random_thought_generator.$sym56$RANDOM_THOUGHT_GENERATOR, random_thought_generator.$sym57$RANDOM_THOUGHT_GENERATOR_P, random_thought_generator.$list58, random_thought_generator.$list59, new String[] { "$user", "$done_assertions", "$generator_thread", "$queue", "$most_recently_added_thought", "$topical_thoughts" }, random_thought_generator.$list60, random_thought_generator.$list61, random_thought_generator.$sym62$PPRINT_RANDOM_THOUGHT_GENERATOR);
        }
    }
    
    public static final class $random_thought_generator_p$UnaryFunction extends UnaryFunction
    {
        public $random_thought_generator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RANDOM-THOUGHT-GENERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return random_thought_generator.random_thought_generator_p(arg1);
        }
    }
}

/*

	Total time: 837 ms
	 synthetic 
*/
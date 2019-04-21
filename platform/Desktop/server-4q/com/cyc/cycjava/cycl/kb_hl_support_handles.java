package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_support_handles extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_hl_support_handles";
    public static final String myFingerPrint = "48175200b43472ddb69d11018560f928ede8e1cc919575d2daa20ccc34693917";
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 1089L)
    private static SubLSymbol $kb_hl_supports_from_ids$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6147L)
    private static SubLSymbol $new_kb_hl_support_id_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLSymbol $dtp_kb_hl_support$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9370L)
    public static SubLSymbol $print_kb_hl_support_hl_supportP$;
    private static final SubLSymbol $sym0$_KB_HL_SUPPORTS_FROM_IDS_;
    private static final SubLSymbol $sym1$KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw5$PROGRESS_MESSAGE;
    private static final SubLString $str6$mapping_Cyc_KB_HL_supports;
    private static final SubLSymbol $kw7$DONE;
    private static final SubLSymbol $sym8$S_ID;
    private static final SubLSymbol $sym9$S_HANDLE;
    private static final SubLSymbol $sym10$DO_ID_INDEX;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ORDERED;
    private static final SubLSymbol $sym13$CLET;
    private static final SubLSymbol $sym14$RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR;
    private static final SubLSymbol $sym15$DO_KB_HL_SUPPORTS;
    private static final SubLSymbol $kw16$PAGED_OUT;
    private static final SubLSymbol $sym17$DO_KB_HL_SUPPORTS_TABLE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE;
    private static final SubLSymbol $sym20$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE;
    private static final SubLSymbol $sym21$_NEW_KB_HL_SUPPORT_ID_THRESHOLD_;
    private static final SubLSymbol $kw22$ALL;
    private static final SubLString $str23$Determining_maximum_KB_HL_support;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLSymbol $kw25$SKIP;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$DO_KB_SUID_TABLE_STARTING_AT_ID;
    private static final SubLSymbol $sym30$KB_HL_SUPPORT;
    private static final SubLSymbol $sym31$KB_HL_SUPPORT_P;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$PRINT_KB_HL_SUPPORT;
    private static final SubLSymbol $sym37$KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$KB_HLS_ID;
    private static final SubLSymbol $sym40$_CSETF_KB_HLS_ID;
    private static final SubLSymbol $kw41$ID;
    private static final SubLString $str42$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw43$BEGIN;
    private static final SubLSymbol $sym44$MAKE_KB_HL_SUPPORT;
    private static final SubLSymbol $kw45$SLOT;
    private static final SubLSymbol $kw46$END;
    private static final SubLSymbol $sym47$VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_METHOD;
    private static final SubLString $str48$_The_CFASL_invalid_KB_HL_support_;
    private static final SubLString $str49$___s_;
    private static final SubLString $str50$__KB_HL_SUPPORT__s_;
    private static final SubLInteger $int51$787;
    private static final SubLSymbol $sym52$SXHASH_KB_HL_SUPPORT_METHOD;
    private static final SubLList $list53;
    private static final SubLString $str54$Return_T_iff_OBJECT_is_a_CycL_KB_;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$FIXNUMP;
    private static final SubLString $str57$Freeing_KB_HL_supports;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 1395L)
    public static SubLObject new_kb_hl_supports_iterator() {
        return iteration.new_indirect_iterator(id_index.new_id_index_iterator(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue()), (SubLObject)kb_hl_support_handles.$sym1$KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT, (SubLObject)kb_hl_support_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 1784L)
    public static SubLObject do_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_hl_support_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list2);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject current_$1 = (SubLObject)kb_hl_support_handles.NIL;
        while (kb_hl_support_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list2);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list2);
            if (kb_hl_support_handles.NIL == conses_high.member(current_$1, (SubLObject)kb_hl_support_handles.$list3, (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_support_handles.T;
            }
            if (current_$1 == kb_hl_support_handles.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_support_handles.NIL != bad && kb_hl_support_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_support_handles.$list2);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_hl_support_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_hl_support_handles.$str6$mapping_Cyc_KB_HL_supports);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw7$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_support_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_support_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject s_id = (SubLObject)kb_hl_support_handles.$sym8$S_ID;
        final SubLObject s_handle = (SubLObject)kb_hl_support_handles.$sym9$S_HANDLE;
        return (SubLObject)ConsesLow.list((SubLObject)kb_hl_support_handles.$sym10$DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { s_id, s_handle, kb_hl_support_handles.$list11, kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, progress_message, kb_hl_support_handles.$kw12$ORDERED, kb_hl_support_handles.T, kb_hl_support_handles.$kw7$DONE, done }), (SubLObject)ConsesLow.listS((SubLObject)kb_hl_support_handles.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_hl_support_handles.$sym14$RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR, s_id, s_handle))), ConsesLow.append(body, (SubLObject)kb_hl_support_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 2409L)
    public static SubLObject resolve_kb_hl_support_id_value_pair(final SubLObject id, SubLObject support) {
        if (kb_hl_support_handles.$kw16$PAGED_OUT == support) {
            support = find_kb_hl_support_by_id(id);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 2610L)
    public static SubLObject do_kb_hl_supports_table() {
        return kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 2723L)
    public static SubLObject kb_hl_supports_table_tuple_to_kb_hl_support(final SubLObject tuple) {
        SubLObject id = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject payload = (SubLObject)kb_hl_support_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)kb_hl_support_handles.$list18);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)kb_hl_support_handles.$list18);
        payload = current.first();
        current = current.rest();
        if (kb_hl_support_handles.NIL == current) {
            return find_kb_hl_support_by_id(id);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)kb_hl_support_handles.$list18);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 2905L)
    public static SubLObject kb_hl_support_argument_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
        final SubLObject argument = kb_hl_supports_low.kb_hl_support_content_get_argument(content);
        return argument;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 3244L)
    public static SubLObject kb_hl_support_arguments_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
        final SubLObject argument = kb_hl_supports_low.kb_hl_support_content_get_argument(content);
        return (SubLObject)ConsesLow.list(argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 3491L)
    public static SubLObject kb_hl_support_dependents_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
        final SubLObject dependents = kb_hl_supports_low.kb_hl_support_content_get_dependents(content);
        return set_contents.set_contents_element_list(dependents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 3769L)
    public static SubLObject setup_kb_hl_support_index_table() {
        if (kb_hl_support_handles.NIL != kb_hl_supports_low.$kb_hl_support_index$.getGlobalValue()) {
            return (SubLObject)kb_hl_support_handles.NIL;
        }
        kb_hl_supports_low.$kb_hl_support_index$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_hl_support_handles.EQ), (SubLObject)kb_hl_support_handles.UNPROVIDED));
        return (SubLObject)kb_hl_support_handles.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 4008L)
    public static SubLObject setup_kb_hl_support_id_tables(final SubLObject size, final SubLObject exactP) {
        if (kb_hl_support_handles.NIL == kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue()) {
            kb_hl_support_handles.$kb_hl_supports_from_ids$.setGlobalValue(id_index.new_id_index(size, (SubLObject)kb_hl_support_handles.ZERO_INTEGER));
        }
        kb_hl_support_manager.setup_kb_hl_support_content_table(size, exactP);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 4313L)
    public static SubLObject finalize_kb_hl_supports(SubLObject max_kb_hl_support_id) {
        if (max_kb_hl_support_id == kb_hl_support_handles.UNPROVIDED) {
            max_kb_hl_support_id = (SubLObject)kb_hl_support_handles.NIL;
        }
        set_next_kb_hl_support_id(max_kb_hl_support_id);
        set_new_kb_hl_support_id_threshold(next_kb_hl_support_id());
        if (kb_hl_support_handles.NIL == max_kb_hl_support_id) {
            optimize_kb_hl_support_id_tables();
        }
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 4698L)
    public static SubLObject optimize_kb_hl_support_id_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), (SubLObject)kb_hl_support_handles.UNPROVIDED);
            kb_hl_support_manager.optimize_kb_hl_support_content_table(id_index.id_index_count(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue()));
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 4921L)
    public static SubLObject clear_kb_hl_support_id_tables() {
        id_index.clear_id_index(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue());
        kb_hl_support_manager.clear_kb_hl_support_content_table();
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 5067L)
    public static SubLObject create_kb_hl_support_dump_id_table() {
        return id_index.new_indirect_compact_id_index(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 5238L)
    public static SubLObject kb_hl_support_count() {
        return (SubLObject)((kb_hl_support_handles.NIL != kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue()) ? id_index.id_index_count(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue()) : kb_hl_support_handles.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 5557L)
    public static SubLObject lookup_kb_hl_support_by_id(final SubLObject id) {
        final SubLObject support = id_index.id_index_lookup(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), id, (SubLObject)kb_hl_support_handles.UNPROVIDED);
        if (kb_hl_support_handles.NIL == support) {
            return (SubLObject)kb_hl_support_handles.NIL;
        }
        if (kb_hl_support_handles.$kw16$PAGED_OUT == support) {
            return make_kb_hl_support_shell(id);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6049L)
    public static SubLObject next_kb_hl_support_id() {
        return id_index.id_index_next_id(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6297L)
    public static SubLObject new_kb_hl_support_id_threshold() {
        return (kb_hl_support_handles.NIL != kb_hl_support_handles.$new_kb_hl_support_id_threshold$.getGlobalValue()) ? kb_hl_support_handles.$new_kb_hl_support_id_threshold$.getGlobalValue() : kb_hl_support_manager.get_file_backed_kb_hl_support_id_threshold();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6507L)
    public static SubLObject set_new_kb_hl_support_id_threshold(final SubLObject id) {
        kb_hl_support_handles.$new_kb_hl_support_id_threshold$.setGlobalValue(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6622L)
    public static SubLObject old_kb_hl_support_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)kb_hl_support_handles.ZERO_INTEGER), id_index.id_index_old_and_new_object_counts(do_kb_hl_supports_table(), new_kb_hl_support_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 6837L)
    public static SubLObject new_kb_hl_support_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)kb_hl_support_handles.ONE_INTEGER), id_index.id_index_old_and_new_object_counts(do_kb_hl_supports_table(), new_kb_hl_support_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 7052L)
    public static SubLObject missing_kb_hl_support_id_set() {
        return set_utilities.construct_set_from_list(id_index.id_index_missing_ids(do_kb_hl_supports_table(), (SubLObject)kb_hl_support_handles.$kw22$ALL, (SubLObject)kb_hl_support_handles.UNPROVIDED), (SubLObject)kb_hl_support_handles.EQL, (SubLObject)kb_hl_support_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 7317L)
    public static SubLObject set_next_kb_hl_support_id(SubLObject max_kb_hl_support_id) {
        if (max_kb_hl_support_id == kb_hl_support_handles.UNPROVIDED) {
            max_kb_hl_support_id = (SubLObject)kb_hl_support_handles.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = (SubLObject)kb_hl_support_handles.MINUS_ONE_INTEGER;
        if (kb_hl_support_handles.NIL != max_kb_hl_support_id) {
            max = max_kb_hl_support_id;
        }
        else {
            final SubLObject idx = do_kb_hl_supports_table();
            final SubLObject mess = (SubLObject)kb_hl_support_handles.$str23$Determining_maximum_KB_HL_support;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_hl_support_handles.ZERO_INTEGER;
            assert kb_hl_support_handles.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_support_handles.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_support_handles.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_support_handles.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$2 = idx;
                    if (kb_hl_support_handles.NIL == id_index.id_index_objects_empty_p(idx_$2, (SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                        final SubLObject idx_$3 = idx_$2;
                        if (kb_hl_support_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                            final SubLObject backwardP_var = (SubLObject)kb_hl_support_handles.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject s_id;
                            SubLObject s_handle;
                            SubLObject kb_hl_support;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_support_handles.NIL, v_iteration = (SubLObject)kb_hl_support_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_support_handles.ONE_INTEGER)) {
                                s_id = ((kb_hl_support_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_support_handles.ONE_INTEGER) : v_iteration);
                                s_handle = Vectors.aref(vector_var, s_id);
                                if (kb_hl_support_handles.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                                    if (kb_hl_support_handles.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                        s_handle = (SubLObject)kb_hl_support_handles.$kw25$SKIP;
                                    }
                                    kb_hl_support = resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                    max = Numbers.max(max, kb_hl_support_id(kb_hl_support));
                                    sofar = Numbers.add(sofar, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$4 = idx_$2;
                        if (kb_hl_support_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4) || kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
                            SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$4);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$4);
                            final SubLObject v_default = (SubLObject)((kb_hl_support_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) ? kb_hl_support_handles.NIL : kb_hl_support_handles.$kw25$SKIP);
                            while (s_id2.numL(end_id)) {
                                final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                if (kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP) || kb_hl_support_handles.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                    final SubLObject kb_hl_support2 = resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                    max = Numbers.max(max, kb_hl_support_id(kb_hl_support2));
                                    sofar = Numbers.add(sofar, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_support_handles.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject next_id = Numbers.add(max, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
        id_index.set_id_index_next_id(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), next_id);
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 7764L)
    public static SubLObject register_kb_hl_support_id(final SubLObject id, final SubLObject kb_hl_support) {
        reset_kb_hl_support_id(kb_hl_support, id);
        return id_index.id_index_enter(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), id, kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 7941L)
    public static SubLObject deregister_kb_hl_support_id(final SubLObject id) {
        return id_index.id_index_remove(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 8049L)
    public static SubLObject make_kb_hl_support_id() {
        return id_index.id_index_reserve(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 8196L)
    public static SubLObject do_old_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_hl_support_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list26);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject current_$6 = (SubLObject)kb_hl_support_handles.NIL;
        while (kb_hl_support_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list26);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list26);
            if (kb_hl_support_handles.NIL == conses_high.member(current_$6, (SubLObject)kb_hl_support_handles.$list3, (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_support_handles.T;
            }
            if (current_$6 == kb_hl_support_handles.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_support_handles.NIL != bad && kb_hl_support_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_support_handles.$list26);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_hl_support_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_hl_support_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw7$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_support_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_support_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_support_handles.$sym27$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, (SubLObject)ConsesLow.list(var, (SubLObject)kb_hl_support_handles.$list11, (SubLObject)kb_hl_support_handles.$list28, (SubLObject)kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_hl_support_handles.$kw7$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_support_handles.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 8584L)
    public static SubLObject do_new_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_hl_support_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_support_handles.$list26);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_support_handles.NIL;
        SubLObject current_$7 = (SubLObject)kb_hl_support_handles.NIL;
        while (kb_hl_support_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list26);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_support_handles.$list26);
            if (kb_hl_support_handles.NIL == conses_high.member(current_$7, (SubLObject)kb_hl_support_handles.$list3, (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_support_handles.T;
            }
            if (current_$7 == kb_hl_support_handles.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_support_handles.NIL != bad && kb_hl_support_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_support_handles.$list26);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_hl_support_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_hl_support_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_support_handles.$kw7$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_support_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_support_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_support_handles.$sym29$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(var, (SubLObject)kb_hl_support_handles.$list11, (SubLObject)kb_hl_support_handles.$list28, (SubLObject)kb_hl_support_handles.$kw5$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_hl_support_handles.$kw7$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_support_handles.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject kb_hl_support_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kb_hl_support(v_object, stream, (SubLObject)kb_hl_support_handles.ZERO_INTEGER);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject kb_hl_support_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kb_hl_support_native.class) ? kb_hl_support_handles.T : kb_hl_support_handles.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject kb_hls_id(final SubLObject v_object) {
        assert kb_hl_support_handles.NIL != kb_hl_support_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject _csetf_kb_hls_id(final SubLObject v_object, final SubLObject value) {
        assert kb_hl_support_handles.NIL != kb_hl_support_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject make_kb_hl_support(SubLObject arglist) {
        if (arglist == kb_hl_support_handles.UNPROVIDED) {
            arglist = (SubLObject)kb_hl_support_handles.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kb_hl_support_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kb_hl_support_handles.NIL, next = arglist; kb_hl_support_handles.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kb_hl_support_handles.$kw41$ID)) {
                _csetf_kb_hls_id(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kb_hl_support_handles.$str42$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject visit_defstruct_kb_hl_support(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_hl_support_handles.$kw43$BEGIN, (SubLObject)kb_hl_support_handles.$sym44$MAKE_KB_HL_SUPPORT, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_hl_support_handles.$kw45$SLOT, (SubLObject)kb_hl_support_handles.$kw41$ID, kb_hls_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_hl_support_handles.$kw46$END, (SubLObject)kb_hl_support_handles.$sym44$MAKE_KB_HL_SUPPORT, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9217L)
    public static SubLObject visit_defstruct_object_kb_hl_support_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_hl_support(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9429L)
    public static SubLObject print_kb_hl_support(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.eql(cfasl_kb_methods.cfasl_invalid_kb_hl_support())) {
            PrintLow.format(stream, (SubLObject)kb_hl_support_handles.$str48$_The_CFASL_invalid_KB_HL_support_);
        }
        else if (kb_hl_support_handles.NIL != kb_hl_support_handles.$print_kb_hl_support_hl_supportP$.getDynamicValue(thread) && kb_hl_support_handles.NIL != valid_kb_hl_supportP(v_object, (SubLObject)kb_hl_support_handles.UNPROVIDED)) {
            PrintLow.format(stream, (SubLObject)kb_hl_support_handles.$str49$___s_, kb_hl_supports_low.kb_hl_support_hl_support_int(v_object));
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_support_handles.$str50$__KB_HL_SUPPORT__s_, kb_hls_id(v_object));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9838L)
    public static SubLObject sxhash_kb_hl_support_method(final SubLObject v_object) {
        final SubLObject id = kb_hls_id(v_object);
        return (SubLObject)(id.isInteger() ? id : kb_hl_support_handles.$int51$787);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 9959L)
    public static SubLObject get_kb_hl_support() {
        SubLObject kb_hl_support = (SubLObject)kb_hl_support_handles.NIL;
        kb_hl_support = make_kb_hl_support((SubLObject)kb_hl_support_handles.UNPROVIDED);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 10228L)
    public static SubLObject new_kb_hl_support(final SubLObject id) {
        SubLObject kb_hl_support = (SubLObject)kb_hl_support_handles.NIL;
        kb_hl_support = make_kb_hl_support((SubLObject)kb_hl_support_handles.UNPROVIDED);
        _csetf_kb_hls_id(kb_hl_support, id);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 10471L)
    public static SubLObject free_kb_hl_support(final SubLObject kb_hl_support) {
        _csetf_kb_hls_id(kb_hl_support, (SubLObject)kb_hl_support_handles.NIL);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 10604L)
    public static SubLObject kb_hl_support_get_id(final SubLObject kb_hl_support) {
        return kb_hls_id(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 10900L)
    public static SubLObject hl_justify_for_kb_hl_support(final SubLObject hl_support) {
        return Sequences.remove(hl_support, hl_supports.hl_support_justify(hl_support), Symbols.symbol_function((SubLObject)kb_hl_support_handles.EQUAL), (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED, (SubLObject)kb_hl_support_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 11027L)
    public static SubLObject valid_kb_hl_support_handleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_support_handles.NIL != kb_hl_support_p(v_object) && kb_hl_support_handles.NIL != kb_hl_support_handle_validP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 11164L)
    public static SubLObject valid_kb_hl_supportP(final SubLObject v_object, SubLObject robustP) {
        if (robustP == kb_hl_support_handles.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_support_handles.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_support_handles.NIL != valid_kb_hl_support_handleP(v_object) && (kb_hl_support_handles.NIL == robustP || kb_hl_support_handles.NIL != kb_hl_supports_low.valid_kb_hl_support_contentP(kb_hl_supports_low.kb_hl_support_content(v_object), robustP)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 11382L)
    public static SubLObject mark_available_kb_hl_supports(final SubLObject max_id, SubLObject deleted_set) {
        if (deleted_set == kb_hl_support_handles.UNPROVIDED) {
            deleted_set = (SubLObject)kb_hl_support_handles.NIL;
        }
        id_index.fill_id_index_dense_space(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), (SubLObject)kb_hl_support_handles.$kw16$PAGED_OUT, max_id);
        if (kb_hl_support_handles.NIL != set.set_p(deleted_set)) {
            final SubLObject set_contents_var = set.do_set_internal(deleted_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deleted_id;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_hl_support_handles.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_hl_support_handles.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deleted_id = set_contents.do_set_contents_next(basis_object, state);
                if (kb_hl_support_handles.NIL != set_contents.do_set_contents_element_validP(state, deleted_id)) {
                    id_index.id_index_remove(kb_hl_support_handles.$kb_hl_supports_from_ids$.getGlobalValue(), deleted_id);
                }
            }
        }
        return max_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 11700L)
    public static SubLObject make_kb_hl_support_shell(SubLObject id) {
        if (kb_hl_support_handles.NIL == id) {
            id = make_kb_hl_support_id();
        }
        assert kb_hl_support_handles.NIL != Types.fixnump(id) : id;
        final SubLObject kb_hl_support = get_kb_hl_support();
        register_kb_hl_support_id(id, kb_hl_support);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 12031L)
    public static SubLObject create_sample_invalid_kb_hl_support() {
        return make_kb_hl_support((SubLObject)kb_hl_support_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 12181L)
    public static SubLObject partition_create_invalid_kb_hl_support() {
        return make_kb_hl_support((SubLObject)kb_hl_support_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 12297L)
    public static SubLObject free_all_kb_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_hl_supports_low.clear_kb_hl_support_index();
        final SubLObject idx = do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_support_handles.$str57$Freeing_KB_HL_supports;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_support_handles.ZERO_INTEGER;
        assert kb_hl_support_handles.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_support_handles.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_support_handles.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_support_handles.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (kb_hl_support_handles.NIL == id_index.id_index_objects_empty_p(idx_$8, (SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (kb_hl_support_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_support_handles.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject content;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_support_handles.NIL, v_iteration = (SubLObject)kb_hl_support_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_support_handles.ONE_INTEGER)) {
                            s_id = ((kb_hl_support_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_support_handles.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_support_handles.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                                if (kb_hl_support_handles.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_support_handles.$kw25$SKIP;
                                }
                                kb_hl_support = resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
                                free_kb_hl_support(kb_hl_support);
                                if (kb_hl_support_handles.NIL != content) {
                                    kb_hl_supports_low.free_kb_hl_support_content(content);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if (kb_hl_support_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                        final SubLObject v_default = (SubLObject)((kb_hl_support_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP)) ? kb_hl_support_handles.NIL : kb_hl_support_handles.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_support_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_support_handles.$kw25$SKIP) || kb_hl_support_handles.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject content2 = kb_hl_supports_low.kb_hl_support_content(kb_hl_support2);
                                free_kb_hl_support(kb_hl_support2);
                                if (kb_hl_support_handles.NIL != content2) {
                                    kb_hl_supports_low.free_kb_hl_support_content(content2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_support_handles.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_support_handles.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_kb_hl_support_id_tables();
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 12771L)
    public static SubLObject kb_hl_support_id(final SubLObject kb_hl_support) {
        return kb_hl_support_get_id(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 12878L)
    public static SubLObject reset_kb_hl_support_id(final SubLObject kb_hl_support, final SubLObject new_id) {
        _csetf_kb_hls_id(kb_hl_support, new_id);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 13263L)
    public static SubLObject kb_hl_support_handle_validP(final SubLObject kb_hl_support) {
        return Types.integerp(kb_hl_support_get_id(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-handles.lisp", position = 13712L)
    public static SubLObject find_kb_hl_support_by_id(final SubLObject id) {
        return lookup_kb_hl_support_by_id(id);
    }
    
    public static SubLObject declare_kb_hl_support_handles_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "new_kb_hl_supports_iterator", "NEW-KB-HL-SUPPORTS-ITERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_support_handles", "do_kb_hl_supports", "DO-KB-HL-SUPPORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "resolve_kb_hl_support_id_value_pair", "RESOLVE-KB-HL-SUPPORT-ID-VALUE-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "do_kb_hl_supports_table", "DO-KB-HL-SUPPORTS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_supports_table_tuple_to_kb_hl_support", "KB-HL-SUPPORTS-TABLE-TUPLE-TO-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_argument_int", "KB-HL-SUPPORT-ARGUMENT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_arguments_int", "KB-HL-SUPPORT-ARGUMENTS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_dependents_int", "KB-HL-SUPPORT-DEPENDENTS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "setup_kb_hl_support_index_table", "SETUP-KB-HL-SUPPORT-INDEX-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "setup_kb_hl_support_id_tables", "SETUP-KB-HL-SUPPORT-ID-TABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "finalize_kb_hl_supports", "FINALIZE-KB-HL-SUPPORTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "optimize_kb_hl_support_id_tables", "OPTIMIZE-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "clear_kb_hl_support_id_tables", "CLEAR-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "create_kb_hl_support_dump_id_table", "CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_count", "KB-HL-SUPPORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "lookup_kb_hl_support_by_id", "LOOKUP-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "next_kb_hl_support_id", "NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "new_kb_hl_support_id_threshold", "NEW-KB-HL-SUPPORT-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "set_new_kb_hl_support_id_threshold", "SET-NEW-KB-HL-SUPPORT-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "old_kb_hl_support_count", "OLD-KB-HL-SUPPORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "new_kb_hl_support_count", "NEW-KB-HL-SUPPORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "missing_kb_hl_support_id_set", "MISSING-KB-HL-SUPPORT-ID-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "set_next_kb_hl_support_id", "SET-NEXT-KB-HL-SUPPORT-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "register_kb_hl_support_id", "REGISTER-KB-HL-SUPPORT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "deregister_kb_hl_support_id", "DEREGISTER-KB-HL-SUPPORT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "make_kb_hl_support_id", "MAKE-KB-HL-SUPPORT-ID", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_support_handles", "do_old_kb_hl_supports", "DO-OLD-KB-HL-SUPPORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_support_handles", "do_new_kb_hl_supports", "DO-NEW-KB-HL-SUPPORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_print_function_trampoline", "KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_p", "KB-HL-SUPPORT-P", 1, 0, false);
        new $kb_hl_support_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hls_id", "KB-HLS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "_csetf_kb_hls_id", "_CSETF-KB-HLS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "make_kb_hl_support", "MAKE-KB-HL-SUPPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "visit_defstruct_kb_hl_support", "VISIT-DEFSTRUCT-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "visit_defstruct_object_kb_hl_support_method", "VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "print_kb_hl_support", "PRINT-KB-HL-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "sxhash_kb_hl_support_method", "SXHASH-KB-HL-SUPPORT-METHOD", 1, 0, false);
        new $sxhash_kb_hl_support_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "get_kb_hl_support", "GET-KB-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "new_kb_hl_support", "NEW-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "free_kb_hl_support", "FREE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_get_id", "KB-HL-SUPPORT-GET-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "hl_justify_for_kb_hl_support", "HL-JUSTIFY-FOR-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "valid_kb_hl_support_handleP", "VALID-KB-HL-SUPPORT-HANDLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "valid_kb_hl_supportP", "VALID-KB-HL-SUPPORT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "mark_available_kb_hl_supports", "MARK-AVAILABLE-KB-HL-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "make_kb_hl_support_shell", "MAKE-KB-HL-SUPPORT-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "create_sample_invalid_kb_hl_support", "CREATE-SAMPLE-INVALID-KB-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "partition_create_invalid_kb_hl_support", "PARTITION-CREATE-INVALID-KB-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "free_all_kb_hl_support", "FREE-ALL-KB-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_id", "KB-HL-SUPPORT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "reset_kb_hl_support_id", "RESET-KB-HL-SUPPORT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "kb_hl_support_handle_validP", "KB-HL-SUPPORT-HANDLE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_handles", "find_kb_hl_support_by_id", "FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    public static SubLObject init_kb_hl_support_handles_file() {
        kb_hl_support_handles.$kb_hl_supports_from_ids$ = SubLFiles.deflexical("*KB-HL-SUPPORTS-FROM-IDS*", (SubLObject)(maybeDefault((SubLObject)kb_hl_support_handles.$sym0$_KB_HL_SUPPORTS_FROM_IDS_, kb_hl_support_handles.$kb_hl_supports_from_ids$, kb_hl_support_handles.NIL)));
        kb_hl_support_handles.$new_kb_hl_support_id_threshold$ = SubLFiles.deflexical("*NEW-KB-HL-SUPPORT-ID-THRESHOLD*", (SubLObject)(maybeDefault((SubLObject)kb_hl_support_handles.$sym21$_NEW_KB_HL_SUPPORT_ID_THRESHOLD_, kb_hl_support_handles.$new_kb_hl_support_id_threshold$, kb_hl_support_handles.NIL)));
        kb_hl_support_handles.$dtp_kb_hl_support$ = SubLFiles.defconstant("*DTP-KB-HL-SUPPORT*", (SubLObject)kb_hl_support_handles.$sym30$KB_HL_SUPPORT);
        kb_hl_support_handles.$print_kb_hl_support_hl_supportP$ = SubLFiles.defparameter("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*", (SubLObject)kb_hl_support_handles.T);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    public static SubLObject setup_kb_hl_support_handles_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_hl_support_handles.$sym0$_KB_HL_SUPPORTS_FROM_IDS_);
        access_macros.register_macro_helper((SubLObject)kb_hl_support_handles.$sym14$RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR, (SubLObject)kb_hl_support_handles.$sym15$DO_KB_HL_SUPPORTS);
        access_macros.register_macro_helper((SubLObject)kb_hl_support_handles.$sym17$DO_KB_HL_SUPPORTS_TABLE, (SubLObject)kb_hl_support_handles.$sym15$DO_KB_HL_SUPPORTS);
        utilities_macros.note_funcall_helper_function((SubLObject)kb_hl_support_handles.$sym1$KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT);
        access_macros.register_macro_helper((SubLObject)kb_hl_support_handles.$sym19$CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE, (SubLObject)kb_hl_support_handles.$sym20$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_hl_support_handles.$sym21$_NEW_KB_HL_SUPPORT_ID_THRESHOLD_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_hl_support_handles.$sym37$KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kb_hl_support_handles.$list38);
        Structures.def_csetf((SubLObject)kb_hl_support_handles.$sym39$KB_HLS_ID, (SubLObject)kb_hl_support_handles.$sym40$_CSETF_KB_HLS_ID);
        Equality.identity((SubLObject)kb_hl_support_handles.$sym30$KB_HL_SUPPORT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_hl_support_handles.$sym47$VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_hl_support_handles.$sym52$SXHASH_KB_HL_SUPPORT_METHOD));
        utilities_macros.register_cyc_api_function((SubLObject)kb_hl_support_handles.$sym31$KB_HL_SUPPORT_P, (SubLObject)kb_hl_support_handles.$list53, (SubLObject)kb_hl_support_handles.$str54$Return_T_iff_OBJECT_is_a_CycL_KB_, (SubLObject)kb_hl_support_handles.NIL, (SubLObject)kb_hl_support_handles.$list55);
        return (SubLObject)kb_hl_support_handles.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_hl_support_handles_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_hl_support_handles_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_hl_support_handles_file();
    }
    
    static {
        me = (SubLFile)new kb_hl_support_handles();
        kb_hl_support_handles.$kb_hl_supports_from_ids$ = null;
        kb_hl_support_handles.$new_kb_hl_support_id_threshold$ = null;
        kb_hl_support_handles.$dtp_kb_hl_support$ = null;
        kb_hl_support_handles.$print_kb_hl_support_hl_supportP$ = null;
        $sym0$_KB_HL_SUPPORTS_FROM_IDS_ = SubLObjectFactory.makeSymbol("*KB-HL-SUPPORTS-FROM-IDS*");
        $sym1$KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-HL-SUPPORTS-TABLE-TUPLE-TO-KB-HL-SUPPORT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc KB HL supports")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw4$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw5$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str6$mapping_Cyc_KB_HL_supports = SubLObjectFactory.makeString("mapping Cyc KB HL supports");
        $kw7$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym8$S_ID = SubLObjectFactory.makeUninternedSymbol("S-ID");
        $sym9$S_HANDLE = SubLObjectFactory.makeUninternedSymbol("S-HANDLE");
        $sym10$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-KB-HL-SUPPORTS-TABLE"));
        $kw12$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $sym13$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym14$RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR = SubLObjectFactory.makeSymbol("RESOLVE-KB-HL-SUPPORT-ID-VALUE-PAIR");
        $sym15$DO_KB_HL_SUPPORTS = SubLObjectFactory.makeSymbol("DO-KB-HL-SUPPORTS");
        $kw16$PAGED_OUT = SubLObjectFactory.makeKeyword("PAGED-OUT");
        $sym17$DO_KB_HL_SUPPORTS_TABLE = SubLObjectFactory.makeSymbol("DO-KB-HL-SUPPORTS-TABLE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $sym19$CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE");
        $sym20$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");
        $sym21$_NEW_KB_HL_SUPPORT_ID_THRESHOLD_ = SubLObjectFactory.makeSymbol("*NEW-KB-HL-SUPPORT-ID-THRESHOLD*");
        $kw22$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str23$Determining_maximum_KB_HL_support = SubLObjectFactory.makeString("Determining maximum KB HL support ID");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw25$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym27$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KB-HL-SUPPORT-ID-THRESHOLD"));
        $sym29$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");
        $sym30$KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT");
        $sym31$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-HLS-ID"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-HLS-ID"));
        $sym36$PRINT_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("PRINT-KB-HL-SUPPORT");
        $sym37$KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P"));
        $sym39$KB_HLS_ID = SubLObjectFactory.makeSymbol("KB-HLS-ID");
        $sym40$_CSETF_KB_HLS_ID = SubLObjectFactory.makeSymbol("_CSETF-KB-HLS-ID");
        $kw41$ID = SubLObjectFactory.makeKeyword("ID");
        $str42$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw43$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym44$MAKE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-KB-HL-SUPPORT");
        $kw45$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw46$END = SubLObjectFactory.makeKeyword("END");
        $sym47$VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-METHOD");
        $str48$_The_CFASL_invalid_KB_HL_support_ = SubLObjectFactory.makeString("<The CFASL invalid KB HL support>");
        $str49$___s_ = SubLObjectFactory.makeString("#<~s>");
        $str50$__KB_HL_SUPPORT__s_ = SubLObjectFactory.makeString("#<KB HL SUPPORT ~s>");
        $int51$787 = SubLObjectFactory.makeInteger(787);
        $sym52$SXHASH_KB_HL_SUPPORT_METHOD = SubLObjectFactory.makeSymbol("SXHASH-KB-HL-SUPPORT-METHOD");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str54$Return_T_iff_OBJECT_is_a_CycL_KB_ = SubLObjectFactory.makeString("Return T iff OBJECT is a CycL KB HL support");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym56$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $str57$Freeing_KB_HL_supports = SubLObjectFactory.makeString("Freeing KB HL supports");
    }
    
    public static final class $kb_hl_support_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $kb_hl_support_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kb_hl_support_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kb_hl_support_native.class, kb_hl_support_handles.$sym30$KB_HL_SUPPORT, kb_hl_support_handles.$sym31$KB_HL_SUPPORT_P, kb_hl_support_handles.$list32, kb_hl_support_handles.$list33, new String[] { "$id" }, kb_hl_support_handles.$list34, kb_hl_support_handles.$list35, kb_hl_support_handles.$sym36$PRINT_KB_HL_SUPPORT);
        }
    }
    
    public static final class $kb_hl_support_p$UnaryFunction extends UnaryFunction
    {
        public $kb_hl_support_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KB-HL-SUPPORT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_hl_support_handles.kb_hl_support_p(arg1);
        }
    }
    
    public static final class $sxhash_kb_hl_support_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_kb_hl_support_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-KB-HL-SUPPORT-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_hl_support_handles.sxhash_kb_hl_support_method(arg1);
        }
    }
}

/*

	Total time: 290 ms
	
*/
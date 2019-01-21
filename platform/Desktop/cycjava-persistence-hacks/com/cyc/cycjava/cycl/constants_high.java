// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class constants_high extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constants_high";
    public static final String myFingerPrint = "841191859c8a0b679f830e1d25d1965e82a7c59af185c8b00ff928c275ae2ddd";
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9380L)
    public static SubLSymbol $constant_external_id_equivalence_map$;
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13439L)
    private static SubLSymbol $constant_legacy_guid_date$;
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19292L)
    public static SubLSymbol $constant_dump_id_table$;
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20144L)
    public static SubLSymbol $constant_name_obfuscation_fn$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$NUM;
    private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
    private static final SubLString $str5$mapping_constants_for_sweep;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$PIF;
    private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym9$PROGRESS_CSOME;
    private static final SubLSymbol $sym10$CONSTANTS_AROUND;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$DO_CONSTANTS;
    private static final SubLSymbol $sym13$CONSTANT_NAME_SPEC_P;
    private static final SubLSymbol $sym14$CONSTANT_EXTERNAL_ID_P;
    private static final SubLSymbol $sym15$CREATE_CONSTANT;
    private static final SubLList $list16;
    private static final SubLString $str17$Return_a_new_constant_named_NAME_;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$STRINGP;
    private static final SubLSymbol $sym21$FIND_OR_CREATE_CONSTANT;
    private static final SubLString $str22$Return_the_constant_with_NAME_if_;
    private static final SubLList $list23;
    private static final SubLString $str24$TMP;
    private static final SubLString $str25$_A__A;
    private static final SubLSymbol $sym26$GENTEMP_CONSTANT;
    private static final SubLList $list27;
    private static final SubLString $str28$Create_and_return_a_temporary_con;
    private static final SubLList $list29;
    private static final SubLString $str30$;
    private static final SubLSymbol $kw31$UPCASE;
    private static final SubLSymbol $kw32$DOWNCASE;
    private static final SubLString $str33$T;
    private static final SubLString $str34$T_;
    private static final SubLSymbol $sym35$CONSTANT_P;
    private static final SubLSymbol $sym36$REMOVE_CONSTANT;
    private static final SubLList $list37;
    private static final SubLString $str38$Remove_CONSTANT_from_the_KB_;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$FIND_CONSTANT;
    private static final SubLList $list42;
    private static final SubLString $str43$Return_the_constant_with_NAME__or;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$CONSTANT_NAME;
    private static final SubLString $str46$Return_the_name_of_CONSTANT_or__u;
    private static final SubLSymbol $sym47$GUID_P;
    private static final SubLSymbol $sym48$GUID_STRING_P;
    private static final SubLSymbol $sym49$RENAME_CONSTANT;
    private static final SubLList $list50;
    private static final SubLString $str51$Rename_CONSTANT_to_have_NEW_NAME_;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$CONSTANT_INTERNAL_ID;
    private static final SubLString $str54$Return_the_internal_id_of_CONSTAN;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CONSTANT_INTERNAL_ID_P;
    private static final SubLSymbol $sym57$FIND_CONSTANT_BY_INTERNAL_ID;
    private static final SubLList $list58;
    private static final SubLString $str59$Return_the_constant_with_internal;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$CLET;
    private static final SubLSymbol $sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_;
    private static final SubLSymbol $sym64$CONSTANT_EXTERNAL_ID;
    private static final SubLString $str65$Return_the_external_id_of_CONSTAN;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$FIND_CONSTANT_BY_EXTERNAL_ID;
    private static final SubLList $list68;
    private static final SubLString $str69$Return_the_constant_with_EXTERNAL;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$LISTP;
    private static final SubLSymbol $sym72$CONSTANT_INFO_FROM_GUID_STRINGS;
    private static final SubLList $list73;
    private static final SubLString $str74$Returns_a_list_of_constant_info_i;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$CONSTANT_INFO_FROM_NAME_STRINGS;
    private static final SubLList $list78;
    private static final SubLString $str79$Returns_a_list_of_constant_info_i;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$CONSTANT_LEGACY_ID_P;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLSymbol $kw85$UNNAMED;
    private static final SubLString $str86$cyc;
    private static final SubLSymbol $sym87$CONSTANT_NAMESPACE;
    private static final SubLString $str88$Return_the_namespace_to_which_the;
    private static final SubLSymbol $sym89$CONSTANT_NAME_WITHIN_NAMESPACE;
    private static final SubLString $str90$Return_the_constant_name_within_i;
    private static final SubLSymbol $sym91$TRUE;
    private static final SubLSymbol $sym92$RANDOM_CONSTANT;
    private static final SubLList $list93;
    private static final SubLString $str94$Return_a_randomly_chosen_constant;
    private static final SubLInteger $int95$500;
    private static final SubLSymbol $sym96$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym97$REGULAR_EXPRESSION_P;
    private static final SubLString $str98$Error__A___A__compiling_regular_e;
    private static final SubLSymbol $kw99$SKIP;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$WITH_CONSTANT_NAME_OBFUSCATION;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$_CONSTANT_NAME_OBFUSCATION_FN_;
    private static final SubLInteger $int105$100;
    private static final SubLSymbol $sym106$FIND_CONSTANT_BY_SUID;
	private static final boolean $find_renamed$ = false;
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 1074L)
    public static SubLObject do_recent_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)constants_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list0);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)constants_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)constants_high.NIL;
        SubLObject current_$1 = (SubLObject)constants_high.NIL;
        while (constants_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constants_high.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constants_high.$list0);
            if (constants_high.NIL == conses_high.member(current_$1, (SubLObject)constants_high.$list1, (SubLObject)constants_high.UNPROVIDED, (SubLObject)constants_high.UNPROVIDED)) {
                bad = (SubLObject)constants_high.T;
            }
            if (current_$1 == constants_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (constants_high.NIL != bad && constants_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constants_high.$list0);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)constants_high.$kw3$NUM, current);
        final SubLObject num = (SubLObject)((constants_high.NIL != num_tail) ? conses_high.cadr(num_tail) : constants_high.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)constants_high.$kw4$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((constants_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : constants_high.$str5$mapping_constants_for_sweep);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)constants_high.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((constants_high.NIL != done_tail) ? conses_high.cadr(done_tail) : constants_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)constants_high.$sym7$PIF, (SubLObject)ConsesLow.list((SubLObject)constants_high.$sym8$POSITIVE_INTEGER_P, num), (SubLObject)ConsesLow.listS((SubLObject)constants_high.$sym9$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)constants_high.$sym10$CONSTANTS_AROUND, (SubLObject)constants_high.$list11, num, num), progress_message, done), ConsesLow.append(body, (SubLObject)constants_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)constants_high.$sym12$DO_CONSTANTS, (SubLObject)ConsesLow.list(var, progress_message, (SubLObject)constants_high.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)constants_high.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 1727L)
    public static SubLObject create_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == constants_high.UNPROVIDED) {
            external_id = (SubLObject)constants_high.NIL;
        }
        enforceType(name, constants_high.$sym13$CONSTANT_NAME_SPEC_P);
        if (constants_high.NIL != external_id) {
            enforceType(external_id, constants_high.$sym14$CONSTANT_EXTERNAL_ID_P);
        }
        if (constants_high.NIL == external_id) {
            external_id = make_constant_external_id();
        }
        SubLObject result = (SubLObject)constants_high.NIL;
        result = constants_interface.kb_create_constant(name, external_id);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 2278L)
    public static SubLObject find_or_create_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == constants_high.UNPROVIDED) {
            external_id = (SubLObject)constants_high.NIL;
        }
        enforceType(name, constants_high.$sym20$STRINGP);
        final SubLObject constant = find_constant(name);
        if (constants_high.NIL != installed_constant_p(constant)) {
            return constant;
        }
        return create_constant(name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 2724L)
    public static SubLObject gentemp_constant(final SubLObject start_name, SubLObject prefix) {
        if (prefix == constants_high.UNPROVIDED) {
            prefix = (SubLObject)constants_high.$str24$TMP;
        }
        enforceType(start_name, constants_high.$sym20$STRINGP);
        final SubLObject name = constant_completion_high.uniquify_constant_name(PrintLow.format((SubLObject)constants_high.NIL, (SubLObject)constants_high.$str25$_A__A, prefix, start_name), (SubLObject)constants_high.UNPROVIDED);
        final SubLObject constant = create_constant(name, (SubLObject)constants_high.UNPROVIDED);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 3084L)
    public static SubLObject suggest_constant_name(final SubLObject string, SubLObject prefix, SubLObject suffix, SubLObject initial_case, SubLObject uniquifyP, SubLObject sequentialP) {
        if (prefix == constants_high.UNPROVIDED) {
            prefix = (SubLObject)constants_high.$str30$;
        }
        if (suffix == constants_high.UNPROVIDED) {
            suffix = (SubLObject)constants_high.$str30$;
        }
        if (initial_case == constants_high.UNPROVIDED) {
            initial_case = (SubLObject)constants_high.$kw31$UPCASE;
        }
        if (uniquifyP == constants_high.UNPROVIDED) {
            uniquifyP = (SubLObject)constants_high.T;
        }
        if (sequentialP == constants_high.UNPROVIDED) {
            sequentialP = (SubLObject)constants_high.NIL;
        }
        SubLObject name = (SubLObject)constants_high.NIL;
        SubLObject stream = (SubLObject)constants_high.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject string_var = unicode_strings.utf8_string_to_subl_string(string);
            SubLObject end_var_$2;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject valid_charP;
            for (end_var = (end_var_$2 = Sequences.length(string_var)), char_num = (SubLObject)constants_high.NIL, char_num = (SubLObject)constants_high.ZERO_INTEGER; !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                valid_charP = constant_completion_high.valid_constant_name_char_p(v_char);
                if (v_char.eql((SubLObject)Characters.CHAR_space)) {
                    initial_case = (SubLObject)constants_high.$kw31$UPCASE;
                }
                else if (constants_high.NIL != valid_charP && initial_case == constants_high.$kw31$UPCASE) {
                    print_high.princ(Characters.char_upcase(v_char), stream);
                    initial_case = (SubLObject)constants_high.NIL;
                }
                else if (constants_high.NIL != valid_charP && initial_case == constants_high.$kw32$DOWNCASE) {
                    print_high.princ(Characters.char_downcase(v_char), stream);
                    initial_case = (SubLObject)constants_high.NIL;
                }
                else if (constants_high.NIL != valid_charP) {
                    print_high.princ(v_char, stream);
                }
            }
            name = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)constants_high.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)constants_high.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (name.equalp((SubLObject)constants_high.$str33$T)) {
            name = (SubLObject)constants_high.$str34$T_;
        }
        name = Sequences.cconcatenate(prefix, new SubLObject[] { name, suffix });
        if (constants_high.NIL != uniquifyP) {
            name = constant_completion_high.uniquify_constant_name(name, sequentialP);
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 4275L)
    public static SubLObject remove_constant(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        remove_everything_about_constant(constant);
        if (constants_high.NIL != tms.tms_please_kill_this_term_for_me(constant)) {
            return constant;
        }
        return constants_interface.kb_remove_constant(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 4621L)
    public static SubLObject remove_everything_about_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constants_high.NIL != constant_handles.constant_p(constant) : constant;
        final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding(thread);
        try {
            hl_macros.$forts_being_removed$.bind((SubLObject)ConsesLow.cons(constant, hl_macros.$forts_being_removed$.getDynamicValue(thread)), thread);
            if (constants_high.NIL != term.reified_skolem_fn_in_any_mtP(constant, (SubLObject)constants_high.T, (SubLObject)constants_high.T)) {
                skolems.remove_defn_of_skolem(constant, (SubLObject)constants_high.UNPROVIDED);
            }
            if (constants_high.NIL != kb_control_vars.time_kb_loaded_p() && constants_high.NIL != sbhl_time_utilities.sbhl_temporality_term_p(constant)) {
                sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures(constant);
            }
            narts_high.remove_dependent_narts(constant);
            bookkeeping_store.unassert_all_bookkeeping_gafs_on_term(constant);
            kb_indexing.remove_term_indices(constant);
            kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term(constant);
            cardinality_estimates.clear_cardinality_estimates(constant);
        }
        finally {
            hl_macros.$forts_being_removed$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)constants_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 5869L)
    public static SubLObject find_constant(final SubLObject name) {
        enforceType(name, constants_high.$sym20$STRINGP);
        SubLObject constant = constants_interface.kb_lookup_constant_by_name(name);
        if($find_renamed$ && constant==NIL) {
        	
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6116L)
    public static SubLObject constant_name(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        return constants_interface.kb_constant_name(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6284L)
    public static SubLObject constant_guid(final SubLObject constant) {
        assert constants_high.NIL != constant_handles.constant_p(constant) : constant;
        return (SubLObject)((constants_high.NIL != constant_handles.constant_handle_validP(constant)) ? constants_interface.kb_constant_guid(constant) : constants_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6477L)
    public static SubLObject constant_merged_guid(final SubLObject constant) {
        assert constants_high.NIL != constant_handles.constant_p(constant) : constant;
        return (SubLObject)((constants_high.NIL != constant_handles.constant_handle_validP(constant)) ? constants_interface.kb_constant_merged_guid(constant) : constants_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6691L)
    public static SubLObject find_constant_by_guid(final SubLObject guid) {
        assert constants_high.NIL != Guids.guid_p(guid) : guid;
        return constants_interface.kb_lookup_constant_by_guid(guid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 6866L)
    public static SubLObject find_constant_by_guid_string(final SubLObject guid_string) {
        assert constants_high.NIL != Guids.guid_string_p(guid_string) : guid_string;
        return find_constant_by_guid(Guids.string_to_guid(guid_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7138L)
    public static SubLObject rename_constant(final SubLObject constant, final SubLObject new_name) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        enforceType(new_name, constants_high.$sym20$STRINGP);
        return constants_interface.kb_rename_constant(constant, new_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7462L)
    public static SubLObject constant_internal_id(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        return constant_handles.constant_suid(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 7844L)
    public static SubLObject constant_internal_id_from_external_id(final SubLObject external_id) {
        final SubLObject constant = find_constant_by_external_id(external_id);
        return (SubLObject)((constants_high.NIL != constant) ? constant_internal_id(constant) : constants_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8037L)
    public static SubLObject find_constant_by_internal_id(final SubLObject id) {
        enforceType(id, constants_high.$sym56$CONSTANT_INTERNAL_ID_P);
        return constant_handles.find_constant_by_suid(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8274L)
    public static SubLObject constant_internal_id_p(final SubLObject v_object) {
        return Types.integerp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8407L)
    public static SubLObject constant_internal_id_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject suid_1 = constant_handles.constant_suid(constant1);
        final SubLObject suid_2 = constant_handles.constant_suid(constant2);
        if (constants_high.NIL != suid_1 && constants_high.NIL != suid_2) {
            return Numbers.numL(suid_1, suid_2);
        }
        if (constants_high.NIL == suid_1 && constants_high.NIL == suid_2) {
            return (SubLObject)constants_high.NIL;
        }
        return Types.sublisp_null(suid_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 8873L)
    public static SubLObject installed_constant_p(final SubLObject v_object) {
        return constant_handles.valid_constant_handleP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9027L)
    public static SubLObject uninstalled_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constants_high.NIL != constant_handles.constant_p(v_object) && constants_high.NIL == installed_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9230L)
    public static SubLObject new_constant_internal_id_threshold() {
        return constant_handles.new_constant_suid_threshold();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9674L)
    public static SubLObject with_constant_external_id_equivalence_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject id_map = (SubLObject)constants_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list61);
        id_map = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)constants_high.$sym62$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)constants_high.$sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_, id_map)), ConsesLow.append(body, (SubLObject)constants_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 9835L)
    public static SubLObject prefered_constant_external_id_wrt_equivalence(SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constants_high.NIL != map_utilities.map_p(constants_high.$constant_external_id_equivalence_map$.getDynamicValue(thread))) {
            external_id = map_utilities.map_get_without_values(constants_high.$constant_external_id_equivalence_map$.getDynamicValue(thread), external_id, external_id);
        }
        return external_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10102L)
    public static SubLObject constant_external_id(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        return constant_guid(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10317L)
    public static SubLObject constant_name_from_internal_id(final SubLObject internal_id) {
        final SubLObject constant = find_constant_by_internal_id(internal_id);
        return (SubLObject)((constants_high.NIL != constant_handles.constant_p(constant)) ? constant_name(constant) : constants_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10509L)
    public static SubLObject find_constant_by_external_id(SubLObject external_id) {
        enforceType(external_id, constants_high.$sym14$CONSTANT_EXTERNAL_ID_P);
        external_id = prefered_constant_external_id_wrt_equivalence(external_id);
        return find_constant_by_guid(external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10855L)
    public static SubLObject constant_external_id_p(final SubLObject v_object) {
        return Guids.guid_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 10986L)
    public static SubLObject constant_has_external_id(final SubLObject constant, final SubLObject external_id) {
        assert constants_high.NIL != constant_handles.constant_p(constant) : constant;
        assert constants_high.NIL != constant_external_id_p(external_id) : external_id;
        final SubLObject guid = constant_guid(constant);
        return Guids.guidE(guid, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 11276L)
    public static SubLObject constant_external_id_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject guid_1 = constant_guid(constant1);
        final SubLObject guid_2 = constant_guid(constant2);
        if (constants_high.NIL != guid_1 && constants_high.NIL != guid_2) {
            return Guids.guidL(guid_1, guid_2);
        }
        if (constants_high.NIL == guid_1 && constants_high.NIL == guid_2) {
            return (SubLObject)constants_high.NIL;
        }
        return Types.sublisp_null(guid_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 11746L)
    public static SubLObject constant_info_from_guid_strings(final SubLObject guid_string_list) {
        enforceType(guid_string_list, constants_high.$sym71$LISTP);
        SubLObject constant_info_list = (SubLObject)constants_high.NIL;
        SubLObject constant = (SubLObject)constants_high.NIL;
        SubLObject cdolist_list_var = guid_string_list;
        SubLObject guid_string = (SubLObject)constants_high.NIL;
        guid_string = cdolist_list_var.first();
        while (constants_high.NIL != cdolist_list_var) {
            constant = find_constant_by_external_id(Guids.string_to_guid(guid_string));
            if (constants_high.NIL != constant) {
                constant_info_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(guid_string, constant_name(constant)), constant_info_list);
            }
            else {
                constant_info_list = (SubLObject)ConsesLow.cons((SubLObject)constants_high.NIL, constant_info_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            guid_string = cdolist_list_var.first();
        }
        return Sequences.nreverse(constant_info_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 12365L)
    public static SubLObject constant_info_from_name_strings(final SubLObject name_string_list) {
        enforceType(name_string_list, constants_high.$sym71$LISTP);
        SubLObject constant_info_list = (SubLObject)constants_high.NIL;
        SubLObject constant = (SubLObject)constants_high.NIL;
        SubLObject cdolist_list_var = name_string_list;
        SubLObject name_string = (SubLObject)constants_high.NIL;
        name_string = cdolist_list_var.first();
        while (constants_high.NIL != cdolist_list_var) {
            constant = find_constant(name_string);
            if (constants_high.NIL != constant) {
                constant_info_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(constant_guid(constant), constant_name(constant)), constant_info_list);
            }
            else {
                constant_info_list = (SubLObject)ConsesLow.cons((SubLObject)constants_high.NIL, constant_info_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name_string = cdolist_list_var.first();
        }
        return Sequences.nreverse(constant_info_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 12965L)
    public static SubLObject make_constant_external_id() {
        return make_constant_guid();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13132L)
    public static SubLObject make_skolem_id() {
        return make_constant_external_id();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13380L)
    public static SubLObject make_constant_guid() {
        return Guids.new_guid();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13637L)
    public static SubLObject make_constant_legacy_guid(final SubLObject legacy_id) {
        assert constants_high.NIL != constant_legacy_id_p(legacy_id) : legacy_id;
        SubLObject current;
        final SubLObject datum = current = constants_high.$constant_legacy_guid_date$.getGlobalValue();
        SubLObject month = (SubLObject)constants_high.NIL;
        SubLObject day = (SubLObject)constants_high.NIL;
        SubLObject year = (SubLObject)constants_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list83);
        month = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list83);
        day = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list83);
        year = current.first();
        current = current.rest();
        if (constants_high.NIL == current) {
            return Guids.make_date_relative_guid(year, month, day, legacy_id);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constants_high.$list83);
        return (SubLObject)constants_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 13933L)
    public static SubLObject constant_guid_to_legacy_id(final SubLObject guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constants_high.NIL != Guids.guid_p(guid) : guid;
        if (constants_high.NIL != Guids.date_relative_guid_p(guid)) {
            thread.resetMultipleValues();
            final SubLObject given_year = Guids.crack_date_relative_guid(guid);
            final SubLObject given_month = thread.secondMultipleValue();
            final SubLObject given_day = thread.thirdMultipleValue();
            final SubLObject legacy_id = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = constants_high.$constant_legacy_guid_date$.getGlobalValue();
            SubLObject legacy_month = (SubLObject)constants_high.NIL;
            SubLObject legacy_day = (SubLObject)constants_high.NIL;
            SubLObject legacy_year = (SubLObject)constants_high.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list84);
            legacy_month = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list84);
            legacy_day = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list84);
            legacy_year = current.first();
            current = current.rest();
            if (constants_high.NIL == current) {
                if (legacy_year.numE(given_year) && legacy_month.numE(given_month) && legacy_day.numE(given_day)) {
                    return legacy_id;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constants_high.$list84);
            }
        }
        return (SubLObject)constants_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 14440L)
    public static SubLObject constant_legacy_id(final SubLObject constant) {
        return constant_guid_to_legacy_id(constant_guid(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 14821L)
    public static SubLObject find_constant_by_legacy_id(final SubLObject legacy_id) {
        return find_constant_by_guid(make_constant_legacy_guid(legacy_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15011L)
    public static SubLObject constant_legacy_id_p(final SubLObject v_object) {
        return Types.integerp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15087L)
    public static SubLObject unnamed_constant_p(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constants_high.NIL != constant_handles.constant_p(constant) && constants_high.$kw85$UNNAMED == constant_name(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15331L)
    public static SubLObject constant_namespace(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        final SubLObject delim = string_utilities.char_position((SubLObject)Characters.CHAR_colon, constant_name(constant), (SubLObject)constants_high.UNPROVIDED);
        if (constants_high.NIL != delim) {
            return Sequences.subseq(constant_name(constant), (SubLObject)constants_high.ZERO_INTEGER, delim);
        }
        return (SubLObject)constants_high.$str86$cyc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 15806L)
    public static SubLObject constant_name_within_namespace(final SubLObject constant) {
        enforceType(constant, constants_high.$sym35$CONSTANT_P);
        final SubLObject delim = string_utilities.char_position((SubLObject)Characters.CHAR_colon, constant_name(constant), (SubLObject)constants_high.UNPROVIDED);
        if (constants_high.NIL != delim) {
            return Sequences.subseq(constant_name(constant), Numbers.add(delim, (SubLObject)constants_high.ONE_INTEGER), (SubLObject)constants_high.UNPROVIDED);
        }
        return constant_name(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 16254L)
    public static SubLObject random_constant(SubLObject test) {
        if (test == constants_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)constants_high.$sym91$TRUE);
        }
        return constants_low.random_constant_internal(test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 16929L)
    public static SubLObject sample_constants(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == constants_high.UNPROVIDED) {
            n = (SubLObject)constants_high.$int95$500;
        }
        if (allow_repeatsP == constants_high.UNPROVIDED) {
            allow_repeatsP = (SubLObject)constants_high.NIL;
        }
        if (test == constants_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)constants_high.$sym91$TRUE);
        }
        assert constants_high.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (constants_high.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)constants_high.NIL;
            SubLObject i;
            for (i = (SubLObject)constants_high.NIL, i = (SubLObject)constants_high.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)constants_high.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_constant(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)constants_high.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_constant(test), result, Symbols.symbol_function((SubLObject)constants_high.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 17518L)
    public static SubLObject constant_grep(final SubLObject regular_expression, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == constants_high.UNPROVIDED) {
            comp_options = (SubLObject)constants_high.NIL;
        }
        if (match_options == constants_high.UNPROVIDED) {
            match_options = (SubLObject)constants_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constants_high.NIL != regular_expressions.regular_expression_p(regular_expression) : regular_expression;
        SubLObject matches = (SubLObject)constants_high.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (constants_high.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)constants_high.$str98$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = constant_grep_pattern(pattern, match_options);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)constants_high.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (constants_high.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 17518L)
    public static SubLObject constant_grep_pattern(final SubLObject pattern, SubLObject match_options) {
        if (match_options == constants_high.UNPROVIDED) {
            match_options = (SubLObject)constants_high.NIL;
        }
        SubLObject matches = (SubLObject)constants_high.NIL;
        final SubLObject idx = constant_handles.do_constants_table();
        if (constants_high.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)constants_high.$kw99$SKIP)) {
            final SubLObject idx_$3 = idx;
            if (constants_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)constants_high.$kw99$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                final SubLObject backwardP_var = (SubLObject)constants_high.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject constant;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)constants_high.NIL, v_iteration = (SubLObject)constants_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)constants_high.ONE_INTEGER)) {
                    id = ((constants_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)constants_high.ONE_INTEGER) : v_iteration);
                    constant = Vectors.aref(vector_var, id);
                    if (constants_high.NIL == id_index.id_index_tombstone_p(constant) || constants_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)constants_high.$kw99$SKIP)) {
                        if (constants_high.NIL != id_index.id_index_tombstone_p(constant)) {
                            constant = (SubLObject)constants_high.$kw99$SKIP;
                        }
                        if (constants_high.NIL != list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_within_string(pattern, constant_name(constant), match_options, (SubLObject)constants_high.NIL, (SubLObject)constants_high.UNPROVIDED, (SubLObject)constants_high.UNPROVIDED))) {
                            matches = (SubLObject)ConsesLow.cons(constant, matches);
                        }
                    }
                }
            }
            final SubLObject idx_$4 = idx;
            if (constants_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4) || constants_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)constants_high.$kw99$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$4);
                final SubLObject end_id = id_index.id_index_next_id(idx_$4);
                final SubLObject v_default = (SubLObject)((constants_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)constants_high.$kw99$SKIP)) ? constants_high.NIL : constants_high.$kw99$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if ((constants_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)constants_high.$kw99$SKIP) || constants_high.NIL == id_index.id_index_tombstone_p(constant2)) && constants_high.NIL != list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_within_string(pattern, constant_name(constant2), match_options, (SubLObject)constants_high.NIL, (SubLObject)constants_high.UNPROVIDED, (SubLObject)constants_high.UNPROVIDED))) {
                        matches = (SubLObject)ConsesLow.cons(constant2, matches);
                    }
                    id2 = Numbers.add(id2, (SubLObject)constants_high.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18435L)
    public static SubLObject constant_checkpoint_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constants_high.NIL != list_utilities.proper_list_p(v_object) && constants_high.NIL != list_utilities.lengthE(v_object, (SubLObject)constants_high.TWO_INTEGER, (SubLObject)constants_high.UNPROVIDED) && constants_high.NIL != list_utilities.every_in_list((SubLObject)constants_high.$sym96$NON_NEGATIVE_INTEGER_P, v_object, (SubLObject)constants_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18723L)
    public static SubLObject new_constant_checkpoint() {
        final SubLObject constant_count = constant_handles.constant_count();
        final SubLObject next_constant_id = constant_handles.next_constant_suid();
        return (SubLObject)ConsesLow.list(constant_count, next_constant_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 18973L)
    public static SubLObject constant_checkpoint_currentP(final SubLObject constant_checkpoint) {
        SubLObject checkpoint_count = (SubLObject)constants_high.NIL;
        SubLObject checkpoint_next_id = (SubLObject)constants_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constant_checkpoint, constant_checkpoint, (SubLObject)constants_high.$list100);
        checkpoint_count = constant_checkpoint.first();
        SubLObject current = constant_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constant_checkpoint, (SubLObject)constants_high.$list100);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (constants_high.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(checkpoint_count.numE(constant_handles.constant_count()) && checkpoint_next_id.numE(constant_handles.next_constant_suid()));
        }
        cdestructuring_bind.cdestructuring_bind_error(constant_checkpoint, (SubLObject)constants_high.$list100);
        return (SubLObject)constants_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19510L)
    public static SubLObject constant_dump_id(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = constant_internal_id(constant);
        final SubLObject dump_table = constants_high.$constant_dump_id_table$.getDynamicValue(thread);
        if (constants_high.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)constants_high.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19783L)
    public static SubLObject find_constant_by_dump_id(final SubLObject dump_id) {
        return find_constant_by_internal_id(dump_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 19937L)
    public static SubLObject with_constant_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constants_high.$sym62$CLET, (SubLObject)constants_high.$list101, ConsesLow.append(body, (SubLObject)constants_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20498L)
    public static SubLObject constant_dump_name(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constants_high.$constant_name_obfuscation_fn$.getDynamicValue(thread).isFunctionSpec()) {
            return Functions.funcall(constants_high.$constant_name_obfuscation_fn$.getDynamicValue(thread), constant);
        }
        return constant_name(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20703L)
    public static SubLObject with_constant_name_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject obfuscate_fn = (SubLObject)constants_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constants_high.$list103);
        obfuscate_fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)constants_high.$sym62$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)constants_high.$sym104$_CONSTANT_NAME_OBFUSCATION_FN_, obfuscate_fn)), ConsesLow.append(body, (SubLObject)constants_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 20987L)
    public static SubLObject constants_around_constant(final SubLObject constant, SubLObject total, SubLObject before, SubLObject after) {
        if (total == constants_high.UNPROVIDED) {
            total = (SubLObject)constants_high.$int105$100;
        }
        if (before == constants_high.UNPROVIDED) {
            before = (SubLObject)constants_high.ZERO_INTEGER;
        }
        if (after == constants_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert constants_high.NIL != constant_handles.constant_p(constant) : constant;
        return constants_around(constant_handles.constant_suid(constant), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constants-high.lisp", position = 21474L)
    public static SubLObject constants_around(final SubLObject constant_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == constants_high.UNPROVIDED) {
            total = (SubLObject)constants_high.$int105$100;
        }
        if (before == constants_high.UNPROVIDED) {
            before = (SubLObject)constants_high.ZERO_INTEGER;
        }
        if (after == constants_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert constants_high.NIL != subl_promotions.non_negative_integer_p(constant_id) : constant_id;
        return assertions_high.kb_objects_around_id((SubLObject)constants_high.$sym106$FIND_CONSTANT_BY_SUID, (SubLObject)constants_high.ZERO_INTEGER, constant_id, constant_handles.next_constant_suid(), total, before, after);
    }
    
    public static SubLObject declare_constants_high_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constants_high", "do_recent_constants", "DO-RECENT-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "create_constant", "CREATE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "remove_constant", "REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant", "FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_name", "CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_guid", "CONSTANT-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "rename_constant", "RENAME-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constants_high", "with_constant_external_id_equivalence_map", "WITH-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "prefered_constant_external_id_wrt_equivalence", "PREFERED-CONSTANT-EXTERNAL-ID-WRT-EQUIVALENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "random_constant", "RANDOM-CONSTANT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_grep", "CONSTANT-GREP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constants_high", "with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constant_dump_name", "CONSTANT-DUMP-NAME", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constants_high", "with_constant_name_obfuscation", "WITH-CONSTANT-NAME-OBFUSCATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constants_around_constant", "CONSTANTS-AROUND-CONSTANT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constants_high", "constants_around", "CONSTANTS-AROUND", 1, 3, false);
        return (SubLObject)constants_high.NIL;
    }
    
    public static SubLObject init_constants_high_file() {
        constants_high.$constant_external_id_equivalence_map$ = SubLFiles.defparameter("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", (SubLObject)constants_high.NIL);
        constants_high.$constant_legacy_guid_date$ = SubLFiles.deflexical("*CONSTANT-LEGACY-GUID-DATE*", (SubLObject)constants_high.$list81);
        constants_high.$constant_dump_id_table$ = SubLFiles.defparameter("*CONSTANT-DUMP-ID-TABLE*", (SubLObject)constants_high.NIL);
        constants_high.$constant_name_obfuscation_fn$ = SubLFiles.defparameter("*CONSTANT-NAME-OBFUSCATION-FN*", (SubLObject)constants_high.NIL);
        return (SubLObject)constants_high.NIL;
    }
    
    public static SubLObject setup_constants_high_file() {
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym15$CREATE_CONSTANT, (SubLObject)constants_high.$list16, (SubLObject)constants_high.$str17$Return_a_new_constant_named_NAME_, (SubLObject)constants_high.$list18, (SubLObject)constants_high.$list19);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym21$FIND_OR_CREATE_CONSTANT, (SubLObject)constants_high.$list16, (SubLObject)constants_high.$str22$Return_the_constant_with_NAME_if_, (SubLObject)constants_high.$list23, (SubLObject)constants_high.$list19);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym26$GENTEMP_CONSTANT, (SubLObject)constants_high.$list27, (SubLObject)constants_high.$str28$Create_and_return_a_temporary_con, (SubLObject)constants_high.$list29, (SubLObject)constants_high.$list19);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym36$REMOVE_CONSTANT, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str38$Remove_CONSTANT_from_the_KB_, (SubLObject)constants_high.$list39, (SubLObject)constants_high.$list40);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym41$FIND_CONSTANT, (SubLObject)constants_high.$list42, (SubLObject)constants_high.$str43$Return_the_constant_with_NAME__or, (SubLObject)constants_high.$list23, (SubLObject)constants_high.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym45$CONSTANT_NAME, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str46$Return_the_name_of_CONSTANT_or__u, (SubLObject)constants_high.$list39, (SubLObject)constants_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym49$RENAME_CONSTANT, (SubLObject)constants_high.$list50, (SubLObject)constants_high.$str51$Rename_CONSTANT_to_have_NEW_NAME_, (SubLObject)constants_high.$list52, (SubLObject)constants_high.$list19);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym53$CONSTANT_INTERNAL_ID, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str54$Return_the_internal_id_of_CONSTAN, (SubLObject)constants_high.$list39, (SubLObject)constants_high.$list55);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym57$FIND_CONSTANT_BY_INTERNAL_ID, (SubLObject)constants_high.$list58, (SubLObject)constants_high.$str59$Return_the_constant_with_internal, (SubLObject)constants_high.$list60, (SubLObject)constants_high.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym64$CONSTANT_EXTERNAL_ID, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str65$Return_the_external_id_of_CONSTAN, (SubLObject)constants_high.$list39, (SubLObject)constants_high.$list66);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym67$FIND_CONSTANT_BY_EXTERNAL_ID, (SubLObject)constants_high.$list68, (SubLObject)constants_high.$str69$Return_the_constant_with_EXTERNAL, (SubLObject)constants_high.$list70, (SubLObject)constants_high.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym72$CONSTANT_INFO_FROM_GUID_STRINGS, (SubLObject)constants_high.$list73, (SubLObject)constants_high.$str74$Returns_a_list_of_constant_info_i, (SubLObject)constants_high.$list75, (SubLObject)constants_high.$list76);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym77$CONSTANT_INFO_FROM_NAME_STRINGS, (SubLObject)constants_high.$list78, (SubLObject)constants_high.$str79$Returns_a_list_of_constant_info_i, (SubLObject)constants_high.$list80, (SubLObject)constants_high.$list76);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym87$CONSTANT_NAMESPACE, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str88$Return_the_namespace_to_which_the, (SubLObject)constants_high.$list39, (SubLObject)constants_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym89$CONSTANT_NAME_WITHIN_NAMESPACE, (SubLObject)constants_high.$list37, (SubLObject)constants_high.$str90$Return_the_constant_name_within_i, (SubLObject)constants_high.$list39, (SubLObject)constants_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constants_high.$sym92$RANDOM_CONSTANT, (SubLObject)constants_high.$list93, (SubLObject)constants_high.$str94$Return_a_randomly_chosen_constant, (SubLObject)constants_high.NIL, (SubLObject)constants_high.$list19);
        access_macros.register_external_symbol((SubLObject)constants_high.$sym102$WITH_CONSTANT_NAME_OBFUSCATION);
        return (SubLObject)constants_high.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_constants_high_file();
    }
    
    @Override
	public void initializeVariables() {
        init_constants_high_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_constants_high_file();
    }
    
    static {
        me = (SubLFile)new constants_high();
        constants_high.$constant_external_id_equivalence_map$ = null;
        constants_high.$constant_legacy_guid_date$ = null;
        constants_high.$constant_dump_id_table$ = null;
        constants_high.$constant_name_obfuscation_fn$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping constants for sweep")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw4$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str5$mapping_constants_for_sweep = SubLObjectFactory.makeString("mapping constants for sweep");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym8$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym9$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $sym10$CONSTANTS_AROUND = SubLObjectFactory.makeSymbol("CONSTANTS-AROUND");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-CONSTANT-SUID"));
        $sym12$DO_CONSTANTS = SubLObjectFactory.makeSymbol("DO-CONSTANTS");
        $sym13$CONSTANT_NAME_SPEC_P = SubLObjectFactory.makeSymbol("CONSTANT-NAME-SPEC-P");
        $sym14$CONSTANT_EXTERNAL_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P");
        $sym15$CREATE_CONSTANT = SubLObjectFactory.makeSymbol("CREATE-CONSTANT");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str17$Return_a_new_constant_named_NAME_ = SubLObjectFactory.makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $sym20$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym21$FIND_OR_CREATE_CONSTANT = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-CONSTANT");
        $str22$Return_the_constant_with_NAME_if_ = SubLObjectFactory.makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $str24$TMP = SubLObjectFactory.makeString("TMP");
        $str25$_A__A = SubLObjectFactory.makeString("~A-~A");
        $sym26$GENTEMP_CONSTANT = SubLObjectFactory.makeSymbol("GENTEMP-CONSTANT");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeString("TMP")));
        $str28$Create_and_return_a_temporary_con = SubLObjectFactory.makeString("Create and return a temporary constant whose name is based on START-NAME");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $str30$ = SubLObjectFactory.makeString("");
        $kw31$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $kw32$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
        $str33$T = SubLObjectFactory.makeString("T");
        $str34$T_ = SubLObjectFactory.makeString("T-");
        $sym35$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym36$REMOVE_CONSTANT = SubLObjectFactory.makeSymbol("REMOVE-CONSTANT");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"));
        $str38$Remove_CONSTANT_from_the_KB_ = SubLObjectFactory.makeString("Remove CONSTANT from the KB.");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym41$FIND_CONSTANT = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str43$Return_the_constant_with_NAME__or = SubLObjectFactory.makeString("Return the constant with NAME, or NIL if not present.");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $sym45$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $str46$Return_the_name_of_CONSTANT_or__u = SubLObjectFactory.makeString("Return the name of CONSTANT or :unnamed.");
        $sym47$GUID_P = SubLObjectFactory.makeSymbol("GUID-P");
        $sym48$GUID_STRING_P = SubLObjectFactory.makeSymbol("GUID-STRING-P");
        $sym49$RENAME_CONSTANT = SubLObjectFactory.makeSymbol("RENAME-CONSTANT");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"));
        $str51$Rename_CONSTANT_to_have_NEW_NAME_ = SubLObjectFactory.makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $sym53$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $str54$Return_the_internal_id_of_CONSTAN = SubLObjectFactory.makeString("Return the internal id of CONSTANT.");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID-P")));
        $sym56$CONSTANT_INTERNAL_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID-P");
        $sym57$FIND_CONSTANT_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $str59$Return_the_constant_with_internal = SubLObjectFactory.makeString("Return the constant with internal ID, or NIL if not present.");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID-P")));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym62$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym63$_CONSTANT_EXTERNAL_ID_EQUIVALENCE_MAP_ = SubLObjectFactory.makeSymbol("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*");
        $sym64$CONSTANT_EXTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID");
        $str65$Return_the_external_id_of_CONSTAN = SubLObjectFactory.makeString("Return the external id of CONSTANT.");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P")));
        $sym67$FIND_CONSTANT_BY_EXTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-EXTERNAL-ID");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str69$Return_the_constant_with_EXTERNAL = SubLObjectFactory.makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P")));
        $sym71$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym72$CONSTANT_INFO_FROM_GUID_STRINGS = SubLObjectFactory.makeSymbol("CONSTANT-INFO-FROM-GUID-STRINGS");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING-LIST"));
        $str74$Returns_a_list_of_constant_info_i = SubLObjectFactory.makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym77$CONSTANT_INFO_FROM_NAME_STRINGS = SubLObjectFactory.makeSymbol("CONSTANT-INFO-FROM-NAME-STRINGS");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-LIST"));
        $str79$Returns_a_list_of_constant_info_i = SubLObjectFactory.makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $list81 = ConsesLow.list((SubLObject)constants_high.SEVEN_INTEGER, (SubLObject)constants_high.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1969));
        $sym82$CONSTANT_LEGACY_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-LEGACY-ID-P");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEGACY-MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("LEGACY-DAY"), (SubLObject)SubLObjectFactory.makeSymbol("LEGACY-YEAR"));
        $kw85$UNNAMED = SubLObjectFactory.makeKeyword("UNNAMED");
        $str86$cyc = SubLObjectFactory.makeString("cyc");
        $sym87$CONSTANT_NAMESPACE = SubLObjectFactory.makeSymbol("CONSTANT-NAMESPACE");
        $str88$Return_the_namespace_to_which_the = SubLObjectFactory.makeString("Return the namespace to which the constant belongs.");
        $sym89$CONSTANT_NAME_WITHIN_NAMESPACE = SubLObjectFactory.makeSymbol("CONSTANT-NAME-WITHIN-NAMESPACE");
        $str90$Return_the_constant_name_within_i = SubLObjectFactory.makeString("Return the constant name within its namespace.");
        $sym91$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym92$RANDOM_CONSTANT = SubLObjectFactory.makeSymbol("RANDOM-CONSTANT");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"))));
        $str94$Return_a_randomly_chosen_constant = SubLObjectFactory.makeString("Return a randomly chosen constant that satisfies TEST");
        $int95$500 = SubLObjectFactory.makeInteger(500);
        $sym96$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym97$REGULAR_EXPRESSION_P = SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION-P");
        $str98$Error__A___A__compiling_regular_e = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $kw99$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-NEXT-ID"));
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-DUMP-ID"))));
        $sym102$WITH_CONSTANT_NAME_OBFUSCATION = SubLObjectFactory.makeSymbol("WITH-CONSTANT-NAME-OBFUSCATION");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBFUSCATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$_CONSTANT_NAME_OBFUSCATION_FN_ = SubLObjectFactory.makeSymbol("*CONSTANT-NAME-OBFUSCATION-FN*");
        $int105$100 = SubLObjectFactory.makeInteger(100);
        $sym106$FIND_CONSTANT_BY_SUID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-SUID");
    }
}

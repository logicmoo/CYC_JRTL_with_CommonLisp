package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_file extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_file";
    public static final String myFingerPrint = "b76359d913e21333624ec30daf4790e275c7a9fce50a380398279cc60a2ed9bb";
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 634L)
    private static SubLSymbol $ke_action_dispatch_table$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 750L)
    private static SubLSymbol $ke_state_defaults$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1007L)
    private static SubLSymbol $ke_file_reserved_words$;
    private static final SubLSymbol $kw0$MT;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CAR;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REPLACE;
    private static final SubLString $str6$___s____s;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$ASSERTION_ID;
    private static final SubLSymbol $kw9$LOCAL;
    private static final SubLSymbol $kw10$REMOTE;
    private static final SubLString $str11$_____;
    private static final SubLSymbol $sym12$EXCEPT_KE_CHARS;
    private static final SubLList $list13;
    private static final SubLString $str14$_;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$EOF;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$CCONCATENATE;
    private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const22$EverythingPSC;
    private static final SubLObject $const23$UnaryPredicate;
    private static final SubLObject $const24$Predicate;
    private static final SubLString $str25$_;
    private static final SubLList $list26;
    private static final SubLString $str27$_;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLString $str32$__;
    private static final SubLSymbol $kw33$MALFORMED;
    private static final SubLSymbol $kw34$CONS;
    private static final SubLSymbol $kw35$OK_TOKEN_FORMS;
    private static final SubLString $str36$___s_token_strings_loaded_;
    private static final SubLString $str37$___s_token_strings_processed_;
    private static final SubLString $str38$_____s_is_not_a_stream_or_a_strin;
    private static final SubLSymbol $kw39$REVERSE;
    private static final SubLString $str40$____Processing_token_strings____;
    private static final SubLSymbol $sym41$STRING_LESSP;
    private static final SubLString $str42$__Malformed_token_list___s;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLString $str47$in;
    private static final SubLString $str48$mt;
    private static final SubLString $str49$default;
    private static final SubLList $list50;
    private static final SubLString $str51$truth;
    private static final SubLString $str52$value;
    private static final SubLList $list53;
    private static final SubLString $str54$tv;
    private static final SubLList $list55;
    private static final SubLString $str56$access;
    private static final SubLString $str57$level;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$DEFAULT_MT;
    private static final SubLSymbol $kw60$CONSTANT;
    private static final SubLSymbol $kw61$TV;
    private static final SubLSymbol $kw62$UNKNOWN;
    private static final SubLSymbol $kw63$DIRECTION;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$DEFAULT;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$MONOTONIC;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$FORWARD;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$BACKWARD;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$CODE;
    private static final SubLString $str75$enter;
    private static final SubLSymbol $kw76$MODE;
    private static final SubLSymbol $kw77$ENTER;
    private static final SubLString $str78$delete;
    private static final SubLSymbol $kw79$DELETE;
    private static final SubLObject $const80$equiv;
    private static final SubLObject $const81$implies;
    private static final SubLSymbol $sym82$QUOTE;
    private static final SubLSymbol $kw83$ALREADY_IN_KB;
    private static final SubLSymbol $kw84$APPEND;
    private static final SubLSymbol $kw85$FORMS_TO_EVAL;
    private static final SubLSymbol $sym86$KE_ASSERT;
    private static final SubLSymbol $sym87$KE_UNASSERT;
    private static final SubLSymbol $sym88$KE_BLAST;
    private static final SubLList $list89;
    private static final SubLSymbol $kw90$NOT_IN_KB;
    private static final SubLObject $const91$BinaryPredicate;
    private static final SubLSymbol $kw92$ALREADY_CONSTANTS;
    private static final SubLSymbol $kw93$ADJOIN;
    private static final SubLSymbol $sym94$KE_RENAME;
    private static final SubLSymbol $sym95$KE_KILL;
    private static final SubLSymbol $kw96$NOT_VALID_CONSTANTS;
    private static final SubLSymbol $kw97$SINGLE;
    private static final SubLString $str98$___a_s;
    private static final SubLString $str99$_____a_s;
    private static final SubLList $list100;
    private static final SubLString $str101$_________________________________;
    private static final SubLString $str102$____;
    private static final SubLString $str103$_______s_in__s;
    private static final SubLString $str104$_______s_is_not_in__s;
    private static final SubLString $str105$____New_forms_to_evaluate_;
    private static final SubLSymbol $kw106$DOUBLE;
    private static final SubLString $str107$__Evaluate_the_form_above_now__;
    private static final SubLString $str108$__Evaluate_the__s_forms_above_now;
    private static final SubLString $str109$__One_form_evaluated_;
    private static final SubLString $str110$___s_forms_evaluated_;
    private static final SubLString $str111$____Please_check_the_input_file__;
    private static final SubLString $str112$These_assertions_are_already_in_t;
    private static final SubLString $str113$These_assertions_are_not_in_the_K;
    private static final SubLString $str114$These_strings_are_not_names_of_va;
    private static final SubLString $str115$These_strings_are_already_the_nam;
    private static final SubLString $str116$____Returning_to_Lisp_Interactor_;
    private static final SubLSymbol $kw117$UNKNOWNS;
    private static final SubLString $str118$____Waiting_for_create_operations;
    private static final SubLString $str119$____Problem_loading_file__s_;
    private static final SubLString $str120$____The_file_contains_fatal_synta;
    private static final SubLString $str121$____Please_check_the_input_file_f;
    private static final SubLString $str122$____Unknown_constants__or_constan;
    private static final SubLString $str123$____Make_Cyc_constants_of_the_str;
    private static final SubLString $str124$__OK___Be_sure_to_give_new_consta;
    private static final SubLSymbol $kw125$INPUT;
    private static final SubLString $str126$Unable_to_open__S;
    private static final SubLString $str127$__Sorry___s_is_not_known_to_be_a_;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1394L)
    public static SubLObject make_ke_state_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.make_indexed_vector(ke_utilities.$ke_state_keys$.getDynamicValue(thread), (SubLObject)ke_file.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1540L)
    public static SubLObject get_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = cyclist.isString() ? fi.fi_find_int(cyclist) : cyclist;
        return misc_utilities.get_indexed_obj(user, ke_utilities.$ke_state$.getDynamicValue(thread), (SubLObject)ke_file.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 1854L)
    public static SubLObject add_ke_vector(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vec = get_ke_state(cyclist);
        if (vec.isVector() && ke_file.NIL != Numbers.numNE(Sequences.length(ke_utilities.$ke_state_keys$.getDynamicValue(thread)), Sequences.length(vec))) {
            ke_utilities.$ke_state$.setDynamicValue(Sequences.remove(cyclist, ke_utilities.$ke_state$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)ke_file.EQUAL), Symbols.symbol_function((SubLObject)ke_file.$sym3$CAR), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED), thread);
            vec = make_ke_state_vector();
            ke_utilities.$ke_state$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
        }
        else if (ke_file.NIL == vec) {
            vec = make_ke_state_vector();
            ke_utilities.$ke_state$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
        }
        return reset_ke_state(cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2394L)
    public static SubLObject reset_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = ke_utilities.$ke_state_keys$.getDynamicValue(thread);
        SubLObject pair = (SubLObject)ke_file.NIL;
        pair = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            final SubLObject key = pair.first();
            final SubLObject v_default = conses_high.assoc(key, ke_file.$ke_state_defaults$.getDynamicValue(thread), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED).rest();
            if (ke_file.NIL == subl_promotions.memberP(key, (SubLObject)ke_file.$list4, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
                ke_utilities.change_ke_value(cyclist, key, (SubLObject)ke_file.$kw5$REPLACE, v_default);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return get_ke_state(cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2719L)
    public static SubLObject return_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)ke_file.NIL;
        SubLObject cdolist_list_var = Mapping.mapcar(Symbols.symbol_function((SubLObject)ke_file.$sym3$CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
        SubLObject key = (SubLObject)ke_file.NIL;
        key = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, ke_utilities.ke_value(cyclist, key)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return Sequences.reverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 2903L)
    public static SubLObject print_ke_state(final SubLObject cyclist) {
        final SubLObject result = return_ke_state(cyclist);
        if (result.isCons()) {
            SubLObject cdolist_list_var = result;
            SubLObject x = (SubLObject)ke_file.NIL;
            x = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str6$___s____s, x.first(), conses_high.second(x));
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            }
        }
        else {
            print_high.print(result, (SubLObject)ke_file.UNPROVIDED);
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3116L)
    public static SubLObject clear_ke_state(final SubLObject cyclist, SubLObject key_list, SubLObject exception_list) {
        if (key_list == ke_file.UNPROVIDED) {
            key_list = (SubLObject)ke_file.NIL;
        }
        if (exception_list == ke_file.UNPROVIDED) {
            exception_list = (SubLObject)ke_file.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_keys = Mapping.mapcar(Symbols.symbol_function((SubLObject)ke_file.$sym3$CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
        SubLObject cdolist_list_var;
        final SubLObject keys_to_use = cdolist_list_var = ((ke_file.NIL != key_list) ? key_list : ((ke_file.NIL != exception_list) ? conses_high.set_difference(all_keys, exception_list, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) : all_keys));
        SubLObject key = (SubLObject)ke_file.NIL;
        key = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            ke_utilities.change_ke_value(cyclist, key, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return get_ke_state(cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3716L)
    public static SubLObject blast_ke_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke_set_dispatch_table();
        ke_utilities.$ke_state$.setDynamicValue((SubLObject)ke_file.NIL, thread);
        return ke_utilities.$ke_state$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 3858L)
    public static SubLObject ke_init(final SubLObject cyclist) {
        add_ke_vector(cyclist);
        clear_ke_state(cyclist, (SubLObject)ke_file.NIL, (SubLObject)ke_file.$list4);
        reset_ke_state(cyclist);
        ke_set_dispatch_table();
        return get_ke_state(cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 4091L)
    public static SubLObject ke_set_dispatch_table() {
        ke_file.$ke_action_dispatch_table$.setDynamicValue((SubLObject)ke_file.$list7);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5149L)
    public static SubLObject dispatch_on_test(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_pairs = (SubLObject)ke_file.NIL;
        SubLObject pair = (SubLObject)ke_file.NIL;
        SubLObject matchP = (SubLObject)ke_file.NIL;
        table_pairs = ke_file.$ke_action_dispatch_table$.getDynamicValue(thread);
        for (pair = table_pairs.first(), matchP = Functions.funcall(pair.first(), token_list); ke_file.NIL == matchP; matchP = Functions.funcall(pair.first(), token_list)) {
            table_pairs = table_pairs.rest();
            pair = table_pairs.first();
        }
        Functions.funcall(pair.rest(), token_list);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5627L)
    public static SubLObject ids_from_sentence(final SubLObject sentence, SubLObject mt) {
        if (ke_file.NIL == forts.fort_p(mt) && mt.isCons()) {
            mt = narts_high.find_nart(mt);
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)ke_file.$sym8$ASSERTION_ID), fi.sentence_assertions(sentence, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 5897L)
    public static SubLObject source_type(final SubLObject sentence, SubLObject mt) {
        if (ke_file.NIL == forts.fort_p(mt) && mt.isCons()) {
            mt = narts_high.find_nart(mt);
        }
        final SubLObject assertions = fi.sentence_assertions(sentence, mt);
        SubLObject type = (SubLObject)ke_file.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = (SubLObject)ke_file.NIL;
        ass = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            if (ke_file.NIL != assertion_handles.assertion_p(ass)) {
                if (ke_file.NIL != assertions_high.asserted_assertionP(ass)) {
                    type = (SubLObject)ke_file.$kw9$LOCAL;
                }
                else if (type != ke_file.$kw9$LOCAL) {
                    type = (SubLObject)ke_file.$kw10$REMOTE;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6365L)
    public static SubLObject filter_out_ok_constants(final SubLObject list) {
        SubLObject ans = (SubLObject)ke_file.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject string = (SubLObject)ke_file.NIL;
        string = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            final SubLObject constant = fi.fi_find_int(string);
            if (ke_file.NIL == constant) {
                final SubLObject item_var = string;
                if (ke_file.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)ke_file.EQUALP), Symbols.symbol_function((SubLObject)ke_file.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6703L)
    public static SubLObject except_ke_chars(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL == Sequences.find(v_char, (SubLObject)ke_file.$str11$_____, Symbols.symbol_function((SubLObject)ke_file.EQUAL), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 6787L)
    public static SubLObject get_unknown_constants(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = (SubLObject)ke_file.NIL;
        SubLObject cdolist_list_var;
        final SubLObject words = cdolist_list_var = string_utilities.break_words(string, Symbols.symbol_function((SubLObject)ke_file.$sym12$EXCEPT_KE_CHARS), (SubLObject)ke_file.T);
        SubLObject w = (SubLObject)ke_file.NIL;
        w = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            final SubLObject first_char = Strings.sublisp_char(w, (SubLObject)ke_file.ZERO_INTEGER);
            if (ke_file.NIL == Sequences.find(first_char, (SubLObject)ke_file.$list13, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL == cycl_variables.el_var_nameP(w) && ke_file.NIL == number_utilities.number_string_p(w) && ke_file.NIL == Sequences.find(w, ke_file.$ke_file_reserved_words$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
                final SubLObject item_var = w;
                if (ke_file.NIL == conses_high.member(item_var, constants, Symbols.symbol_function((SubLObject)ke_file.EQUAL), Symbols.symbol_function((SubLObject)ke_file.IDENTITY))) {
                    constants = (SubLObject)ConsesLow.cons(item_var, constants);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            w = cdolist_list_var.first();
        }
        constants = filter_out_ok_constants(constants);
        return constants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 7395L)
    public static SubLObject frob_comments(final SubLObject string) {
        if (ke_file.NIL != string_utilities.substringP((SubLObject)ke_file.$str14$_, string, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            final SubLObject len = Sequences.length(string);
            SubLObject inside_dqP = (SubLObject)ke_file.NIL;
            SubLObject i;
            SubLObject ch;
            for (i = (SubLObject)ke_file.NIL, i = (SubLObject)ke_file.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)ke_file.ONE_INTEGER)) {
                ch = Vectors.aref(string, i);
                if (ke_file.NIL == Characters.charE(ch, (SubLObject)Characters.CHAR_semicolon) && i.numE(Numbers.subtract(len, (SubLObject)ke_file.ONE_INTEGER))) {
                    return string;
                }
                if (ke_file.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_semicolon) && ke_file.NIL == inside_dqP) {
                    return Sequences.subseq(string, (SubLObject)ke_file.ZERO_INTEGER, i);
                }
                if (ke_file.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_quotation) && ke_file.NIL == inside_dqP) {
                    inside_dqP = (SubLObject)ke_file.T;
                }
                else if (ke_file.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_quotation) && ke_file.NIL != inside_dqP) {
                    inside_dqP = (SubLObject)ke_file.NIL;
                }
            }
            return (SubLObject)ke_file.NIL;
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8068L)
    public static SubLObject count_tokens(final SubLObject token, final SubLObject list) {
        SubLObject count = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject string = (SubLObject)ke_file.NIL;
        string = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            if (string.equalp(token)) {
                count = Numbers.add(count, (SubLObject)ke_file.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8308L)
    public static SubLObject lpP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_lparen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8395L)
    public static SubLObject rpP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_rparen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8483L)
    public static SubLObject spaceP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_space);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8581L)
    public static SubLObject lbrP(final SubLObject ch) {
        return list_utilities.sublisp_boolean(Sequences.find(Characters.char_code(ch), (SubLObject)ke_file.$list15, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8694L)
    public static SubLObject tabP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_tab);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8786L)
    public static SubLObject dquoteP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_quotation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8877L)
    public static SubLObject periodP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_period);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 8968L)
    public static SubLObject semiP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_semicolon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9057L)
    public static SubLObject colonP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_colon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9147L)
    public static SubLObject dol_signP(final SubLObject ch) {
        return Characters.charE(ch, (SubLObject)Characters.CHAR_dollar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9240L)
    public static SubLObject whitespace_char_p(final SubLObject ch) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL != Sequences.find(ch, (SubLObject)ke_file.$list16, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) || ke_file.NIL == ke_utilities.printable_ascii_charP(ch));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 9361L)
    public static SubLObject ke_file_tokenize_string(SubLObject string) {
        if (ke_file.NIL == string_utilities.non_empty_stringP(string)) {
            return (SubLObject)ke_file.NIL;
        }
        string = Strings.string_trim((SubLObject)ke_file.$list17, string);
        SubLObject token_list = (SubLObject)ke_file.NIL;
        SubLObject inside_dqP = (SubLObject)ke_file.NIL;
        SubLObject p1 = (SubLObject)ke_file.ZERO_INTEGER;
        final SubLObject len = Sequences.length(string);
        SubLObject lps = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject rps = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject p2;
        SubLObject ch1;
        SubLObject ch2;
        SubLObject p3;
        SubLObject ch3;
        for (p2 = (SubLObject)ke_file.NIL, p2 = (SubLObject)ke_file.ZERO_INTEGER; p2.numL(len); p2 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER)) {
            ch1 = Strings.sublisp_char(string, p1);
            ch2 = Strings.sublisp_char(string, p2);
            p3 = (SubLObject)(p2.numL(Numbers.subtract(len, (SubLObject)ke_file.ONE_INTEGER)) ? Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER) : ke_file.NIL);
            ch3 = (SubLObject)((ke_file.NIL != p3) ? Strings.sublisp_char(string, p3) : ke_file.NIL);
            if (ke_file.NIL == inside_dqP) {
                if (ke_file.NIL != lpP(ch2)) {
                    lps = Numbers.add(lps, (SubLObject)ke_file.ONE_INTEGER);
                }
                else if (ke_file.NIL != rpP(ch2)) {
                    rps = Numbers.add(rps, (SubLObject)ke_file.ONE_INTEGER);
                }
            }
            if (p2.numE(Numbers.subtract(len, (SubLObject)ke_file.ONE_INTEGER)) && p2.numGE(p1) && ke_file.NIL == spaceP(ch2)) {
                token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, len), token_list);
            }
            else if (ke_file.NIL != spaceP(ch1) && ke_file.NIL != spaceP(ch2)) {
                p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
            }
            else if (ke_file.NIL != spaceP(ch2) && lps.numE(rps) && ke_file.NIL == inside_dqP) {
                token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), token_list);
                p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
            }
            else if (ke_file.NIL != colonP(ch2) && ke_file.NIL != whitespace_char_p(ch3) && p2.numG(p1) && ke_file.NIL == inside_dqP) {
                token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), token_list);
                p1 = p2;
            }
            else if (ke_file.NIL != colonP(ch1) && ke_file.NIL != whitespace_char_p(ch3) && p2.numG(p1) && ke_file.NIL == inside_dqP) {
                token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), token_list);
                p1 = p2;
            }
            else if (ke_file.NIL != rpP(ch2) && ke_file.NIL == inside_dqP) {
                if (lps.numE(rps)) {
                    token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER)), token_list);
                    p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
                }
            }
            else if (ke_file.NIL != dquoteP(ch2) && ke_file.NIL != inside_dqP) {
                inside_dqP = (SubLObject)ke_file.NIL;
                if (lps.numE(rps)) {
                    token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER)), token_list);
                    p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
                }
            }
            else if (ke_file.NIL != dquoteP(ch2)) {
                inside_dqP = (SubLObject)ke_file.T;
                if (p2.numG(p1) && lps.numE(rps)) {
                    token_list = (SubLObject)ConsesLow.cons(Sequences.subseq(string, p1, p2), token_list);
                    p1 = p2;
                }
            }
        }
        return Sequences.nreverse(token_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 11214L)
    public static SubLObject ke_read_from_stream(final SubLObject stream) {
        SubLObject temp;
        SubLObject inside_dqP;
        SubLObject inside_commentP;
        SubLObject lps;
        SubLObject rps;
        SubLObject ch;
        for (temp = (SubLObject)ke_file.NIL, inside_dqP = (SubLObject)ke_file.NIL, inside_commentP = (SubLObject)ke_file.NIL, lps = (SubLObject)ke_file.ZERO_INTEGER, rps = (SubLObject)ke_file.ZERO_INTEGER, ch = (SubLObject)ke_file.NIL, ch = streams_high.read_char(stream, (SubLObject)ke_file.NIL, (SubLObject)ke_file.$kw18$EOF, (SubLObject)ke_file.UNPROVIDED); ch != ke_file.$kw18$EOF && ke_file.NIL != ch && (ke_file.NIL == Characters.charE(ch, (SubLObject)Characters.CHAR_period) || ke_file.NIL == conses_high.set_difference(temp, (SubLObject)ke_file.$list19, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) || !lps.numE(rps) || ke_file.NIL != inside_dqP || ke_file.NIL != inside_commentP); ch = streams_high.read_char(stream, (SubLObject)ke_file.NIL, (SubLObject)ke_file.$kw18$EOF, (SubLObject)ke_file.UNPROVIDED)) {
            if (ke_file.NIL != semiP(ch) && ke_file.NIL == inside_dqP) {
                inside_commentP = (SubLObject)ke_file.T;
            }
            else if (ke_file.NIL != inside_commentP && ke_file.NIL != lbrP(ch)) {
                inside_commentP = (SubLObject)ke_file.NIL;
            }
            else if (ke_file.NIL == inside_commentP) {
                if (ke_file.NIL != dquoteP(ch) && ke_file.NIL != inside_dqP) {
                    inside_dqP = (SubLObject)ke_file.NIL;
                }
                else if (ke_file.NIL != dquoteP(ch)) {
                    inside_dqP = (SubLObject)ke_file.T;
                }
                else if (ke_file.NIL != lpP(ch) && ke_file.NIL == inside_dqP) {
                    lps = Numbers.add(lps, (SubLObject)ke_file.ONE_INTEGER);
                }
                else if (ke_file.NIL != rpP(ch) && ke_file.NIL == inside_dqP) {
                    rps = Numbers.add(rps, (SubLObject)ke_file.ONE_INTEGER);
                }
                if ((ke_file.NIL != lbrP(ch) || ke_file.NIL != tabP(ch)) && ke_file.NIL == inside_dqP) {
                    temp = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_space, temp);
                }
                else if (ke_file.NIL == periodP(ch) || ke_file.NIL != inside_dqP || !lps.numE(rps)) {
                    temp = (SubLObject)ConsesLow.cons(ch, temp);
                }
            }
        }
        if (ke_file.NIL != conses_high.set_difference(temp, (SubLObject)ke_file.$list19, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            return string_utilities.char_list_to_string(Sequences.nreverse(temp));
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 12524L)
    public static SubLObject ke_input_from_string(final SubLObject string) {
        SubLObject ans = (SubLObject)ke_file.NIL;
        SubLObject temp = (SubLObject)ke_file.NIL;
        SubLObject inside_dqP = (SubLObject)ke_file.NIL;
        SubLObject inside_commentP = (SubLObject)ke_file.NIL;
        SubLObject lps = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject rps = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject p1 = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject len;
        SubLObject p2;
        SubLObject ch;
        SubLObject ss;
        SubLObject endP;
        SubLObject ss2;
        for (len = Sequences.length(string), p2 = (SubLObject)ke_file.NIL, p2 = (SubLObject)ke_file.ZERO_INTEGER; p2.numL(len); p2 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, p2);
            if (ke_file.NIL != semiP(ch) && ke_file.NIL == inside_dqP) {
                if (ke_file.NIL == inside_commentP && p2.numG(p1)) {
                    ss = Sequences.subseq(string, p1, p2);
                    if (ke_file.NIL == string_utilities.all_chars_EP((SubLObject)Characters.CHAR_space, ss)) {
                        temp = (SubLObject)ConsesLow.cons(ss, temp);
                    }
                    p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
                }
                inside_commentP = (SubLObject)ke_file.T;
            }
            else if (ke_file.NIL != inside_commentP && ke_file.NIL != lbrP(ch)) {
                inside_commentP = (SubLObject)ke_file.NIL;
                p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
            }
            else if (ke_file.NIL == inside_commentP) {
                endP = Numbers.numE(p2, Numbers.subtract(len, (SubLObject)ke_file.ONE_INTEGER));
                if ((ke_file.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_period) && lps.numE(rps) && ke_file.NIL == inside_dqP) || ke_file.NIL != endP) {
                    if (p2.numG(p1)) {
                        ss2 = Sequences.subseq(string, p1, (ke_file.NIL != endP) ? Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER) : p2);
                        if (ke_file.NIL == string_utilities.all_chars_EP((SubLObject)Characters.CHAR_space, ss2)) {
                            temp = (SubLObject)ConsesLow.cons(ss2, temp);
                            temp = Sequences.nreverse(temp);
                            ans = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)ke_file.$sym20$CCONCATENATE), temp.first(), temp.rest()), ans);
                            temp = (SubLObject)ke_file.NIL;
                        }
                    }
                    p1 = Numbers.add(p2, (SubLObject)ke_file.ONE_INTEGER);
                }
                else if (ke_file.NIL != dquoteP(ch) && ke_file.NIL != inside_dqP) {
                    inside_dqP = (SubLObject)ke_file.NIL;
                }
                else if (ke_file.NIL != dquoteP(ch)) {
                    inside_dqP = (SubLObject)ke_file.T;
                }
                else if (ke_file.NIL != lpP(ch) && ke_file.NIL == inside_dqP) {
                    lps = Numbers.add(lps, (SubLObject)ke_file.ONE_INTEGER);
                }
                else if (ke_file.NIL != rpP(ch) && ke_file.NIL == inside_dqP) {
                    rps = Numbers.add(rps, (SubLObject)ke_file.ONE_INTEGER);
                }
                else if (ke_file.NIL != lbrP(ch) || ke_file.NIL != tabP(ch)) {
                    Vectors.set_aref(string, p2, (SubLObject)Characters.CHAR_space);
                }
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 13971L)
    public static SubLObject nested_parens_in_stringP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && string_utilities.count_chars_in_string(string, (SubLObject)Characters.CHAR_lparen).numG((SubLObject)ke_file.ONE_INTEGER) && ke_file.NIL != ke_utilities.parens_equalP(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14133L)
    public static SubLObject unary_predicateP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)ke_file.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_file.$sym21$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(ke_file.$const22$EverythingPSC, thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL != constant_handles.valid_constantP(obj, (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL != isa.isaP(obj, ke_file.$const23$UnaryPredicate, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14307L)
    public static SubLObject non_unary_predicateP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)ke_file.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_file.$sym21$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(ke_file.$const22$EverythingPSC, thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL != constant_handles.valid_constantP(obj, (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL != isa.isaP(obj, ke_file.$const24$Predicate, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL == unary_predicateP(obj));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 14518L)
    public static SubLObject malformedP(final SubLObject token_list) {
        final SubLObject colon_tokens = count_tokens((SubLObject)ke_file.$str25$_, token_list);
        final SubLObject len = Sequences.length(token_list);
        final SubLObject first_token = token_list.first();
        final SubLObject second_token = conses_high.second(token_list);
        final SubLObject third_token = conses_high.third(token_list);
        final SubLObject fourth_token = conses_high.fourth(token_list);
        final SubLObject c1 = fi.fi_find_int(first_token);
        return (SubLObject)SubLObjectFactory.makeBoolean((ke_file.NIL != Sequences.find(first_token, (SubLObject)ke_file.$list26, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED) && (ke_file.NIL != Numbers.numNE(len, (SubLObject)ke_file.FOUR_INTEGER) || ke_file.NIL == string_utilities.substringP((SubLObject)ke_file.$str27$_, fourth_token, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED))) || ((ke_file.NIL != subl_promotions.memberP(first_token, (SubLObject)ke_file.$list28, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) || ke_file.NIL != unary_predicateP(c1)) && ke_file.NIL != Numbers.numNE(len, (SubLObject)ke_file.ONE_INTEGER)) || (colon_tokens.numE((SubLObject)ke_file.ZERO_INTEGER) && ke_file.NIL == subl_promotions.memberP(first_token, (SubLObject)ke_file.$list28, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED)) || (ke_file.NIL != non_unary_predicateP(c1) && len.numL((SubLObject)ke_file.THREE_INTEGER)) || (len.numE((SubLObject)ke_file.ONE_INTEGER) && colon_tokens.numG((SubLObject)ke_file.ZERO_INTEGER)) || colon_tokens.numG((SubLObject)ke_file.ONE_INTEGER) || (colon_tokens.numE((SubLObject)ke_file.ONE_INTEGER) && ke_file.NIL == subl_promotions.memberP((SubLObject)ke_file.$str25$_, (SubLObject)ConsesLow.list(second_token, third_token), Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED)) || (ke_file.NIL != subl_promotions.memberP(first_token, (SubLObject)ke_file.$list29, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL != Numbers.numNE(len, (SubLObject)ke_file.THREE_INTEGER)) || (ke_file.NIL != nested_parens_in_stringP(third_token) && ke_file.NIL != string_utilities.some_are_substringsP((SubLObject)ke_file.$list30, third_token, (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL == subl_promotions.memberP(first_token, (SubLObject)ke_file.$list31, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 15955L)
    public static SubLObject tokenize_read(SubLObject source, SubLObject noisy) {
        if (noisy == ke_file.UNPROVIDED) {
            noisy = (SubLObject)ke_file.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_file.NIL != noisy) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str32$__);
        }
        SubLObject count = (SubLObject)ke_file.ZERO_INTEGER;
        SubLObject haltP = (SubLObject)ke_file.NIL;
        if (source.isStream()) {
            SubLObject token_expr;
            for (token_expr = (SubLObject)ke_file.NIL, token_expr = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread))); ke_file.NIL != token_expr && ke_file.NIL == haltP; token_expr = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)))) {
                if (ke_file.NIL != malformedP(token_expr)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_expr);
                    haltP = (SubLObject)ke_file.T;
                }
                else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS, (SubLObject)ke_file.$kw34$CONS, token_expr);
                }
                count = Numbers.add(count, (SubLObject)ke_file.ONE_INTEGER);
                if (ke_file.NIL != noisy && count.numG((SubLObject)ke_file.ZERO_INTEGER) && Numbers.mod(count, (SubLObject)ke_file.TEN_INTEGER).numE((SubLObject)ke_file.ZERO_INTEGER)) {
                    PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str36$___s_token_strings_loaded_, count);
                }
            }
        }
        else if (source.isString()) {
            SubLObject cdolist_list_var = ke_input_from_string(source);
            SubLObject string = (SubLObject)ke_file.NIL;
            string = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                final SubLObject token_expr2 = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(string, html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)));
                if (ke_file.NIL != malformedP(token_expr2)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_expr2);
                }
                else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS, (SubLObject)ke_file.$kw34$CONS, token_expr2);
                }
                count = Numbers.add(count, (SubLObject)ke_file.ONE_INTEGER);
                if (ke_file.NIL != noisy && count.numG((SubLObject)ke_file.ZERO_INTEGER) && Numbers.mod(count, (SubLObject)ke_file.TEN_INTEGER).numE((SubLObject)ke_file.ZERO_INTEGER)) {
                    PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str37$___s_token_strings_processed_, count);
                }
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str38$_____s_is_not_a_stream_or_a_strin, source);
        }
        if (ke_file.NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        }
        if (ke_file.NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        }
        if ((ke_file.NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED) || ke_file.NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS)) && ke_file.NIL != noisy) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str40$____Processing_token_strings____);
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 17976L)
    public static SubLObject unknown_constants_among_tokens(final SubLObject token_forms) {
        SubLObject unknowns = (SubLObject)ke_file.NIL;
        SubLObject cdolist_list_var = token_forms;
        SubLObject token_list = (SubLObject)ke_file.NIL;
        token_list = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = token_list;
            SubLObject token = (SubLObject)ke_file.NIL;
            token = cdolist_list_var_$1.first();
            while (ke_file.NIL != cdolist_list_var_$1) {
                if (ke_file.NIL == dquoteP(Strings.sublisp_char(token, (SubLObject)ke_file.ZERO_INTEGER))) {
                    unknowns = conses_high.union(unknowns, get_unknown_constants(token), Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                token = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            token_list = cdolist_list_var.first();
        }
        return Sort.sort(unknowns, Symbols.symbol_function((SubLObject)ke_file.$sym41$STRING_LESSP), (SubLObject)ke_file.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18484L)
    public static SubLObject give_upP(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_file.NIL != ke_utilities.$ke_debug$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str42$__Malformed_token_list___s, token_list);
        }
        return (SubLObject)ke_file.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18669L)
    public static SubLObject constant_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.THREE_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list43, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 18932L)
    public static SubLObject rename_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.FOUR_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list44, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19170L)
    public static SubLObject mode_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.ONE_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list45, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19373L)
    public static SubLObject probably_unaryP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.ONE_INTEGER) && ke_file.NIL == subl_promotions.memberP(token_list.first(), (SubLObject)ke_file.$list28, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19601L)
    public static SubLObject kill_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numGE((SubLObject)ke_file.THREE_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list46, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 19834L)
    public static SubLObject mt_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.FOUR_INTEGER) && token_list.first().equalp((SubLObject)ke_file.$str47$in) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str48$mt) && conses_high.third(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20098L)
    public static SubLObject default_mt_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numE((SubLObject)ke_file.FOUR_INTEGER) && token_list.first().equalp((SubLObject)ke_file.$str49$default) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str48$mt) && conses_high.third(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20383L)
    public static SubLObject el_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numGE((SubLObject)ke_file.THREE_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list50, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 20614L)
    public static SubLObject tv_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean((Sequences.length(token_list).numE((SubLObject)ke_file.FOUR_INTEGER) && token_list.first().equalp((SubLObject)ke_file.$str51$truth) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str52$value) && conses_high.third(token_list).equalp((SubLObject)ke_file.$str25$_) && ke_file.NIL != conses_high.member(conses_high.fourth(token_list), (SubLObject)ke_file.$list53, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED)) || (Sequences.length(token_list).numE((SubLObject)ke_file.THREE_INTEGER) && token_list.first().equalp((SubLObject)ke_file.$str54$tv) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_) && ke_file.NIL != conses_high.member(conses_high.third(token_list), (SubLObject)ke_file.$list53, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 21269L)
    public static SubLObject direction_dirP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean((Sequences.length(token_list).numE((SubLObject)ke_file.THREE_INTEGER) && ke_file.NIL != conses_high.member(token_list.first(), (SubLObject)ke_file.$list55, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_)) || (Sequences.length(token_list).numE((SubLObject)ke_file.FOUR_INTEGER) && token_list.first().equalp((SubLObject)ke_file.$str56$access) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str57$level) && conses_high.third(token_list).equalp((SubLObject)ke_file.$str25$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 21691L)
    public static SubLObject probably_non_unaryP(final SubLObject token_list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(token_list).numGE((SubLObject)ke_file.THREE_INTEGER) && ke_file.NIL == conses_high.member(token_list.first(), (SubLObject)ke_file.$list58, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED) && conses_high.second(token_list).equalp((SubLObject)ke_file.$str25$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 22102L)
    public static SubLObject set_constant(final SubLObject token_list) {
        final SubLObject last_token = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        final SubLObject constant = ke_utilities.cycl_from_string(last_token);
        final SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw59$DEFAULT_MT);
        if (ke_file.NIL != constant) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw60$CONSTANT, (SubLObject)ke_file.$kw5$REPLACE, constant);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT, (SubLObject)ke_file.$kw5$REPLACE, (ke_file.NIL != default_mt) ? default_mt : mt_vars.$default_assert_mt$.getGlobalValue());
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
            return constant;
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 22930L)
    public static SubLObject set_mt(final SubLObject token_list) {
        final SubLObject last_token = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        final SubLObject mt = ke_utilities.cycl_from_string(last_token);
        if (ke_file.NIL != mt) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT, (SubLObject)ke_file.$kw5$REPLACE, mt);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw59$DEFAULT_MT, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.NIL);
            return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 23429L)
    public static SubLObject set_default_mt(final SubLObject token_list) {
        final SubLObject last_token = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        final SubLObject mt = ke_utilities.cycl_from_string(last_token);
        if (ke_file.NIL != mt) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw59$DEFAULT_MT, (SubLObject)ke_file.$kw5$REPLACE, mt);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT, (SubLObject)ke_file.$kw5$REPLACE, mt);
            return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw59$DEFAULT_MT);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 23942L)
    public static SubLObject set_tv(final SubLObject token_list) {
        final SubLObject tv = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        if (ke_file.NIL != Sequences.find(tv, (SubLObject)ke_file.$list64, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw65$DEFAULT);
        }
        else if (ke_file.NIL != Sequences.find(tv, (SubLObject)ke_file.$list66, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw67$MONOTONIC);
        }
        else if (ke_file.NIL != Sequences.find(tv, (SubLObject)ke_file.$list68, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        }
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 24546L)
    public static SubLObject set_direction(final SubLObject token_list) {
        final SubLObject token = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        if (ke_file.NIL != Sequences.find(token, (SubLObject)ke_file.$list69, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw70$FORWARD);
        }
        else if (ke_file.NIL != Sequences.find(token, (SubLObject)ke_file.$list71, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw72$BACKWARD);
        }
        else if (ke_file.NIL != Sequences.find(token, (SubLObject)ke_file.$list73, Symbols.symbol_function((SubLObject)ke_file.EQUALP), (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw74$CODE);
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        }
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25208L)
    public static SubLObject set_mode(final SubLObject token_list) {
        final SubLObject token = token_list.first();
        if (token.equalp((SubLObject)ke_file.$str75$enter)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw77$ENTER);
        }
        else if (token.equalp((SubLObject)ke_file.$str78$delete)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw79$DELETE);
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        }
        return ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25574L)
    public static SubLObject set_direction_to_use(final SubLObject expr) {
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION).equal((SubLObject)ke_file.$kw62$UNKNOWN) && ke_file.NIL == list_utilities.cons_tree_find(ke_file.$const80$equiv, expr, Symbols.symbol_function((SubLObject)ke_file.EQUAL), (SubLObject)ke_file.UNPROVIDED) && ke_file.NIL == list_utilities.cons_tree_find(ke_file.$const81$implies, expr, Symbols.symbol_function((SubLObject)ke_file.EQUAL), (SubLObject)ke_file.UNPROVIDED)) {
            return (SubLObject)ke_file.$kw70$FORWARD;
        }
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION) == ke_file.$kw70$FORWARD) {
            return (SubLObject)ke_file.$kw70$FORWARD;
        }
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION) == ke_file.$kw74$CODE) {
            return (SubLObject)ke_file.$kw74$CODE;
        }
        return (SubLObject)ke_file.$kw72$BACKWARD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 25967L)
    public static SubLObject already_in_kbP(final SubLObject expr, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_file.NIL != html_ke_file.$check_for_existing_assertions$.getDynamicValue(thread)) {
            if (ke_file.NIL == forts.fort_p(mt) && mt.isCons()) {
                mt = narts_high.find_nart(mt);
            }
            if (ke_file.NIL != forts.fort_p(mt)) {
                thread.resetMultipleValues();
                final SubLObject assertions = fi.sentence_assertions(expr, mt);
                final SubLObject all_present = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL != assertions && ke_file.NIL != all_present);
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 26370L)
    public static SubLObject handle_el_expr(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE);
        final SubLObject last_token = conses_high.last(token_list, (SubLObject)ke_file.UNPROVIDED).first();
        final SubLObject expr = ke_utilities.cycl_from_string(last_token);
        final SubLObject quoted_expr = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, expr);
        final SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw59$DEFAULT_MT);
        final SubLObject mt = (ke_file.NIL != default_mt) ? default_mt : ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT);
        final SubLObject quoted_mt = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, mt);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(expr.first());
        final SubLObject direction_to_use = set_direction_to_use(expr);
        if (ke_file.NIL != expr) {
            final SubLObject pcase_var = mode;
            if (pcase_var.eql((SubLObject)ke_file.$kw77$ENTER)) {
                if (ke_file.NIL != already_in_kbP(expr, mt)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw83$ALREADY_IN_KB, (SubLObject)ke_file.$kw84$APPEND, ids_from_sentence(expr, mt));
                }
                else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym86$KE_ASSERT, quoted_expr, quoted_mt, tv_to_use, direction_to_use));
                }
            }
            else if (pcase_var.eql((SubLObject)ke_file.$kw79$DELETE)) {
                final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)ke_file.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)ke_file.T, thread);
                    final SubLObject type = source_type(expr, mt);
                    final SubLObject form = (SubLObject)((type == ke_file.$kw9$LOCAL) ? ConsesLow.list((SubLObject)ke_file.$sym87$KE_UNASSERT, quoted_expr, quoted_mt) : ((type == ke_file.$kw10$REMOTE) ? ConsesLow.list((SubLObject)ke_file.$sym88$KE_BLAST, quoted_expr, quoted_mt) : ConsesLow.list(expr, mt)));
                    if (ke_file.NIL != subl_promotions.memberP(type, (SubLObject)ke_file.$list89, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, form);
                    }
                    else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw90$NOT_IN_KB, (SubLObject)ke_file.$kw34$CONS, form);
                    }
                }
                finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 27905L)
    public static SubLObject non_binary_predicateP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_file.NIL != fort_types_interface.predicate_p(pred) && ke_file.NIL == isa.isa_in_any_mtP(pred, ke_file.$const91$BinaryPredicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 28039L)
    public static SubLObject handle_probably_non_unary(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw60$CONSTANT);
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE);
        final SubLObject first_token = token_list.first();
        final SubLObject pred = ke_utilities.cycl_from_string(first_token);
        final SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
        final SubLObject direction_to_use = set_direction_to_use(pred);
        final SubLObject quoted_mt = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, mt);
        SubLObject cdolist_list_var = conses_high.cddr(token_list);
        SubLObject string = (SubLObject)ke_file.NIL;
        string = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            final SubLObject v_term = ke_utilities.cycl_from_string(string);
            final SubLObject literal = (SubLObject)ConsesLow.list(pred, constant, v_term);
            final SubLObject alt_lit = (SubLObject)((ke_file.NIL != non_binary_predicateP(pred)) ? ConsesLow.append((SubLObject)ConsesLow.list(pred, constant), v_term) : ke_file.NIL);
            final SubLObject entry_form = (ke_file.NIL != alt_lit) ? alt_lit : literal;
            final SubLObject quoted_entry_form = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, entry_form);
            if (ke_file.NIL != pred && ke_file.NIL != v_term) {
                final SubLObject pcase_var = mode;
                if (pcase_var.eql((SubLObject)ke_file.$kw77$ENTER)) {
                    if (ke_file.NIL != already_in_kbP(entry_form, mt)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw83$ALREADY_IN_KB, (SubLObject)ke_file.$kw84$APPEND, ids_from_sentence(entry_form, mt));
                    }
                    else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym86$KE_ASSERT, quoted_entry_form, quoted_mt, tv_to_use, direction_to_use));
                    }
                }
                else if (pcase_var.eql((SubLObject)ke_file.$kw79$DELETE)) {
                    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        control_vars.$within_assert$.bind((SubLObject)ke_file.NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind((SubLObject)ke_file.NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind((SubLObject)ke_file.NIL, thread);
                        wff_utilities.$check_var_typesP$.bind((SubLObject)ke_file.NIL, thread);
                        czer_vars.$simplify_literalP$.bind((SubLObject)ke_file.NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind((SubLObject)ke_file.NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind((SubLObject)ke_file.NIL, thread);
                        wff_vars.$validate_constantsP$.bind((SubLObject)ke_file.NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)ke_file.T, thread);
                        final SubLObject type = source_type(entry_form, mt);
                        final SubLObject form = (SubLObject)((type == ke_file.$kw9$LOCAL) ? ConsesLow.list((SubLObject)ke_file.$sym87$KE_UNASSERT, quoted_entry_form, quoted_mt) : ((type == ke_file.$kw10$REMOTE) ? ConsesLow.list((SubLObject)ke_file.$sym88$KE_BLAST, quoted_entry_form, quoted_mt) : ConsesLow.list(entry_form, mt)));
                        if (ke_file.NIL != subl_promotions.memberP(type, (SubLObject)ke_file.$list89, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, form);
                        }
                        else {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw90$NOT_IN_KB, (SubLObject)ke_file.$kw34$CONS, form);
                        }
                    }
                    finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                        control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 29989L)
    public static SubLObject handle_probably_unary(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw60$CONSTANT);
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw76$MODE);
        final SubLObject first_token = token_list.first();
        final SubLObject pred = ke_utilities.cycl_from_string(first_token);
        final SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw0$MT);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
        final SubLObject direction_to_use = set_direction_to_use(pred);
        final SubLObject quoted_mt = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, mt);
        final SubLObject literal = (SubLObject)ConsesLow.list(pred, constant);
        final SubLObject quoted_literal = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, literal);
        if (ke_file.NIL != pred && ke_file.NIL != constant) {
            final SubLObject pcase_var = mode;
            if (pcase_var.eql((SubLObject)ke_file.$kw77$ENTER)) {
                if (ke_file.NIL != already_in_kbP(literal, mt)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw83$ALREADY_IN_KB, (SubLObject)ke_file.$kw84$APPEND, ids_from_sentence(literal, mt));
                }
                else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym86$KE_ASSERT, quoted_literal, quoted_mt, tv_to_use, direction_to_use));
                }
            }
            else if (pcase_var.eql((SubLObject)ke_file.$kw79$DELETE)) {
                final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)ke_file.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)ke_file.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)ke_file.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)ke_file.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)ke_file.T, thread);
                    final SubLObject type = source_type(literal, mt);
                    final SubLObject form = (SubLObject)((type == ke_file.$kw9$LOCAL) ? ConsesLow.list((SubLObject)ke_file.$sym87$KE_UNASSERT, quoted_literal, quoted_mt) : ((type == ke_file.$kw10$REMOTE) ? ConsesLow.list((SubLObject)ke_file.$sym88$KE_BLAST, quoted_literal, quoted_mt) : ConsesLow.list(literal, mt)));
                    if (ke_file.NIL != subl_promotions.memberP(type, (SubLObject)ke_file.$list89, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, form);
                    }
                    else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw90$NOT_IN_KB, (SubLObject)ke_file.$kw34$CONS, form);
                    }
                }
                finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw61$TV, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw63$DIRECTION, (SubLObject)ke_file.$kw5$REPLACE, (SubLObject)ke_file.$kw62$UNKNOWN);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 31626L)
    public static SubLObject handle_rename(final SubLObject token_list) {
        final SubLObject constant = ke_utilities.cycl_from_string(conses_high.third(token_list));
        final SubLObject new_name = ke_utilities.cycl_from_string(conses_high.fourth(token_list));
        if (ke_file.NIL != constant && ke_file.NIL != new_name) {
            if (ke_file.NIL != fi.fi_find_int(new_name)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw92$ALREADY_CONSTANTS, (SubLObject)ke_file.$kw93$ADJOIN, new_name);
            }
            else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym94$KE_RENAME, constant, new_name));
            }
        }
        else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32132L)
    public static SubLObject handle_kill(final SubLObject token_list) {
        SubLObject cdolist_list_var;
        final SubLObject strings = cdolist_list_var = conses_high.cddr(token_list);
        SubLObject string = (SubLObject)ke_file.NIL;
        string = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            final SubLObject obj = ke_utilities.cycl_from_string(string);
            if (ke_file.NIL != obj) {
                if (ke_file.NIL != misc_kb_utilities.constant_or_natP(obj)) {
                    final SubLObject quoted_obj = (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym82$QUOTE, obj);
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw34$CONS, (SubLObject)ConsesLow.list((SubLObject)ke_file.$sym95$KE_KILL, quoted_obj));
                }
                else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw96$NOT_VALID_CONSTANTS, (SubLObject)ke_file.$kw34$CONS, string);
                }
            }
            else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32675L)
    public static SubLObject handle_problem(final SubLObject token_list) {
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw34$CONS, token_list);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 32986L)
    public static SubLObject print_list(final SubLObject list_of_objs, final SubLObject stream, SubLObject spacing, SubLObject indent) {
        if (spacing == ke_file.UNPROVIDED) {
            spacing = (SubLObject)ke_file.$kw97$SINGLE;
        }
        if (indent == ke_file.UNPROVIDED) {
            indent = (SubLObject)ke_file.ZERO_INTEGER;
        }
        final SubLObject ind_str = Strings.make_string(indent, (SubLObject)ke_file.UNPROVIDED);
        if (spacing == ke_file.$kw97$SINGLE) {
            SubLObject cdolist_list_var = list_of_objs;
            SubLObject obj = (SubLObject)ke_file.NIL;
            obj = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)ke_file.$str98$___a_s, ind_str, obj);
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = list_of_objs;
            SubLObject obj = (SubLObject)ke_file.NIL;
            obj = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)ke_file.$str99$_____a_s, ind_str, obj);
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 33358L)
    public static SubLObject build_eval_form_list() {
        final SubLObject token_lists = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS);
        clear_ke_state(operation_communication.the_cyclist(), (SubLObject)ke_file.$list100, (SubLObject)ke_file.UNPROVIDED);
        SubLObject cdolist_list_var = token_lists;
        SubLObject tl = (SubLObject)ke_file.NIL;
        tl = cdolist_list_var.first();
        while (ke_file.NIL != cdolist_list_var) {
            dispatch_on_test(tl);
            cdolist_list_var = cdolist_list_var.rest();
            tl = cdolist_list_var.first();
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw83$ALREADY_IN_KB, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw90$NOT_IN_KB, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw96$NOT_VALID_CONSTANTS, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw92$ALREADY_CONSTANTS, (SubLObject)ke_file.$kw39$REVERSE, (SubLObject)ke_file.UNPROVIDED);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34187L)
    public static SubLObject print_forms_2(final SubLObject forms, SubLObject message) {
        if (message == ke_file.UNPROVIDED) {
            message = (SubLObject)ke_file.NIL;
        }
        if (ke_file.NIL != forms) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str101$_________________________________);
            if (message.isString()) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str102$____);
                PrintLow.format((SubLObject)ke_file.T, message);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = (SubLObject)ke_file.NIL;
            x = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                final SubLObject ass = assertion_handles.find_assertion_by_id(x);
                final SubLObject cycl = misc_kb_utilities.make_lispy_form(ass);
                final SubLObject mt = assertions_high.assertion_mt(ass);
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str103$_______s_in__s, cycl, mt);
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34604L)
    public static SubLObject print_forms_3(final SubLObject forms, SubLObject message) {
        if (message == ke_file.UNPROVIDED) {
            message = (SubLObject)ke_file.NIL;
        }
        if (ke_file.NIL != forms) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str101$_________________________________);
            if (message.isString()) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str102$____);
                PrintLow.format((SubLObject)ke_file.T, message);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = (SubLObject)ke_file.NIL;
            x = cdolist_list_var.first();
            while (ke_file.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str104$_______s_is_not_in__s, x.first(), conses_high.second(x));
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 34939L)
    public static SubLObject print_forms_1(final SubLObject forms, SubLObject message) {
        if (message == ke_file.UNPROVIDED) {
            message = (SubLObject)ke_file.NIL;
        }
        if (ke_file.NIL != forms) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str101$_________________________________);
            if (message.isString()) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str102$____);
                PrintLow.format((SubLObject)ke_file.T, message);
            }
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str32$__);
            print_list(forms, (SubLObject)ke_file.T, (SubLObject)ke_file.$kw97$SINGLE, (SubLObject)ke_file.TWO_INTEGER);
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 35236L)
    public static SubLObject present_forms_to_eval(final SubLObject forms_to_eval) {
        if (ke_file.NIL != forms_to_eval) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str101$_________________________________);
            final SubLObject len = Sequences.length(forms_to_eval);
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str105$____New_forms_to_evaluate_);
            print_list(forms_to_eval, (SubLObject)ke_file.T, (SubLObject)ke_file.$kw106$DOUBLE, (SubLObject)ke_file.TWO_INTEGER);
            if (ke_file.NIL != (len.numE((SubLObject)ke_file.ONE_INTEGER) ? UserIO.user_confirm((SubLObject)ke_file.$str107$__Evaluate_the_form_above_now__) : UserIO.user_confirm(PrintLow.format((SubLObject)ke_file.NIL, (SubLObject)ke_file.$str108$__Evaluate_the__s_forms_above_now, len)))) {
                SubLObject cdolist_list_var = forms_to_eval;
                SubLObject f = (SubLObject)ke_file.NIL;
                f = cdolist_list_var.first();
                while (ke_file.NIL != cdolist_list_var) {
                    Eval.eval(f);
                    cdolist_list_var = cdolist_list_var.rest();
                    f = cdolist_list_var.first();
                }
                if (len.numE((SubLObject)ke_file.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str109$__One_form_evaluated_);
                }
                else {
                    PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str110$___s_forms_evaluated_, len);
                }
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 35839L)
    public static SubLObject maybe_eval_forms() {
        final SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED);
        final SubLObject forms_to_eval = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw85$FORMS_TO_EVAL);
        final SubLObject already_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw83$ALREADY_IN_KB);
        final SubLObject not_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw90$NOT_IN_KB);
        final SubLObject not_valid_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw96$NOT_VALID_CONSTANTS);
        final SubLObject already_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw92$ALREADY_CONSTANTS);
        if (ke_file.NIL != malformed) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str111$____Please_check_the_input_file__);
            print_list(malformed, (SubLObject)ke_file.T, (SubLObject)ke_file.$kw106$DOUBLE, (SubLObject)ke_file.TWO_INTEGER);
        }
        else {
            print_forms_2(already_in_kb, (SubLObject)ke_file.$str112$These_assertions_are_already_in_t);
            print_forms_3(not_in_kb, (SubLObject)ke_file.$str113$These_assertions_are_not_in_the_K);
            print_forms_1(not_valid_constants, (SubLObject)ke_file.$str114$These_strings_are_not_names_of_va);
            print_forms_1(already_constants, (SubLObject)ke_file.$str115$These_strings_are_already_the_nam);
            present_forms_to_eval(forms_to_eval);
        }
        graceful_quit();
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 36945L)
    public static SubLObject graceful_quit() {
        PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str116$____Returning_to_Lisp_Interactor_);
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37042L)
    public static SubLObject unknown_constants_in_listP(final SubLObject list) {
        if (ke_file.NIL == list) {
            return (SubLObject)ke_file.NIL;
        }
        if (ke_file.NIL == fi.fi_find_int(list.first())) {
            return (SubLObject)ke_file.T;
        }
        return unknown_constants_in_listP(list.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37264L)
    public static SubLObject check_and_poll() {
        final SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw117$UNKNOWNS);
        if (ke_file.NIL == unknown_constants_in_listP(unknowns)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw117$UNKNOWNS, (SubLObject)ke_file.UNPROVIDED, (SubLObject)ke_file.UNPROVIDED);
            return (SubLObject)ke_file.T;
        }
        if (ke_file.NIL != UserIO.user_confirm((SubLObject)ke_file.$str118$____Waiting_for_create_operations)) {
            return check_and_poll();
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 37637L)
    public static SubLObject check_and_maybe_eval(final SubLObject file) {
        final SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw33$MALFORMED);
        final SubLObject ok = ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw35$OK_TOKEN_FORMS);
        if (ke_file.NIL == malformed && ke_file.NIL == ok) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str119$____Problem_loading_file__s_, file);
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str120$____The_file_contains_fatal_synta);
            graceful_quit();
        }
        else if (ke_file.NIL != malformed) {
            PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str121$____Please_check_the_input_file_f);
            print_list(malformed, (SubLObject)ke_file.T, (SubLObject)ke_file.$kw106$DOUBLE, (SubLObject)ke_file.TWO_INTEGER);
            graceful_quit();
        }
        else if (ke_file.NIL != ok) {
            final SubLObject unknowns = unknown_constants_among_tokens(ok);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw117$UNKNOWNS, (SubLObject)ke_file.$kw5$REPLACE, unknowns);
            if (ke_file.NIL != unknowns) {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str122$____Unknown_constants__or_constan);
                print_list(ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw117$UNKNOWNS), (SubLObject)ke_file.T, (SubLObject)ke_file.$kw97$SINGLE, (SubLObject)ke_file.TWO_INTEGER);
                if (ke_file.NIL != UserIO.user_confirm((SubLObject)ke_file.$str123$____Make_Cyc_constants_of_the_str)) {
                    PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str124$__OK___Be_sure_to_give_new_consta);
                    ke_utilities.constantify(ke_utilities.ke_value(operation_communication.the_cyclist(), (SubLObject)ke_file.$kw117$UNKNOWNS));
                    if (ke_file.NIL != check_and_poll()) {
                        build_eval_form_list();
                        maybe_eval_forms();
                    }
                }
                else {
                    graceful_quit();
                }
            }
            else {
                build_eval_form_list();
                maybe_eval_forms();
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-file.lisp", position = 39058L)
    public static SubLObject ke_file(final SubLObject cyclist, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_cyclist = operation_communication.the_cyclist();
        try {
            operation_communication.set_the_cyclist(cyclist.isString() ? fi.fi_find_int(cyclist) : cyclist);
            SubLObject v_boolean = (SubLObject)ke_file.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_file.$sym21$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_file.$const22$EverythingPSC, thread);
                v_boolean = kb_accessors.human_cyclistP(operation_communication.the_cyclist());
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (ke_file.NIL != operation_communication.the_cyclist() && ke_file.NIL != v_boolean) {
                ke_init(operation_communication.the_cyclist());
                SubLObject stream = (SubLObject)ke_file.NIL;
                try {
                    stream = compatibility.open_text(file, (SubLObject)ke_file.$kw125$INPUT);
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ke_file.$str126$Unable_to_open__S, file);
                    }
                    final SubLObject str = stream;
                    tokenize_read(str, (SubLObject)ke_file.T);
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_file.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ke_file.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                check_and_maybe_eval(file);
            }
            else {
                PrintLow.format((SubLObject)ke_file.T, (SubLObject)ke_file.$str127$__Sorry___s_is_not_known_to_be_a_, cyclist);
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_file.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                operation_communication.set_the_cyclist(old_cyclist);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)ke_file.NIL;
    }
    
    public static SubLObject declare_ke_file_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "make_ke_state_vector", "MAKE-KE-STATE-VECTOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "get_ke_state", "GET-KE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "add_ke_vector", "ADD-KE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "reset_ke_state", "RESET-KE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "return_ke_state", "RETURN-KE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "print_ke_state", "PRINT-KE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "clear_ke_state", "CLEAR-KE-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "blast_ke_state", "BLAST-KE-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_init", "KE-INIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_set_dispatch_table", "KE-SET-DISPATCH-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "dispatch_on_test", "DISPATCH-ON-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ids_from_sentence", "IDS-FROM-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "source_type", "SOURCE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "filter_out_ok_constants", "FILTER-OUT-OK-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "except_ke_chars", "EXCEPT-KE-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "get_unknown_constants", "GET-UNKNOWN-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "frob_comments", "FROB-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "count_tokens", "COUNT-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "lpP", "LP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "rpP", "RP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "spaceP", "SPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "lbrP", "LBR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "tabP", "TAB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "dquoteP", "DQUOTE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "periodP", "PERIOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "semiP", "SEMI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "colonP", "COLON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "dol_signP", "DOL-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "whitespace_char_p", "WHITESPACE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_file_tokenize_string", "KE-FILE-TOKENIZE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_read_from_stream", "KE-READ-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_input_from_string", "KE-INPUT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "nested_parens_in_stringP", "NESTED-PARENS-IN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "unary_predicateP", "UNARY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "non_unary_predicateP", "NON-UNARY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "malformedP", "MALFORMED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "tokenize_read", "TOKENIZE-READ", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "unknown_constants_among_tokens", "UNKNOWN-CONSTANTS-AMONG-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "give_upP", "GIVE-UP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "constant_dirP", "CONSTANT-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "rename_dirP", "RENAME-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "mode_dirP", "MODE-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "probably_unaryP", "PROBABLY-UNARY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "kill_dirP", "KILL-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "mt_dirP", "MT-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "default_mt_dirP", "DEFAULT-MT-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "el_dirP", "EL-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "tv_dirP", "TV-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "direction_dirP", "DIRECTION-DIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "probably_non_unaryP", "PROBABLY-NON-UNARY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_constant", "SET-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_mt", "SET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_default_mt", "SET-DEFAULT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_tv", "SET-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_direction", "SET-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_mode", "SET-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "set_direction_to_use", "SET-DIRECTION-TO-USE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "already_in_kbP", "ALREADY-IN-KB?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_el_expr", "HANDLE-EL-EXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "non_binary_predicateP", "NON-BINARY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_probably_non_unary", "HANDLE-PROBABLY-NON-UNARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_probably_unary", "HANDLE-PROBABLY-UNARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_rename", "HANDLE-RENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_kill", "HANDLE-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "handle_problem", "HANDLE-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "print_list", "PRINT-LIST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "build_eval_form_list", "BUILD-EVAL-FORM-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "print_forms_2", "PRINT-FORMS-2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "print_forms_3", "PRINT-FORMS-3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "print_forms_1", "PRINT-FORMS-1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "present_forms_to_eval", "PRESENT-FORMS-TO-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "maybe_eval_forms", "MAYBE-EVAL-FORMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "graceful_quit", "GRACEFUL-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "unknown_constants_in_listP", "UNKNOWN-CONSTANTS-IN-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "check_and_poll", "CHECK-AND-POLL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "check_and_maybe_eval", "CHECK-AND-MAYBE-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_file", "ke_file", "KE-FILE", 2, 0, false);
        return (SubLObject)ke_file.NIL;
    }
    
    public static SubLObject init_ke_file_file() {
        ke_file.$ke_action_dispatch_table$ = SubLFiles.defparameter("*KE-ACTION-DISPATCH-TABLE*", (SubLObject)ke_file.NIL);
        ke_file.$ke_state_defaults$ = SubLFiles.defparameter("*KE-STATE-DEFAULTS*", reader.bq_cons(reader.bq_cons((SubLObject)ke_file.$kw0$MT, mt_vars.$default_assert_mt$.getGlobalValue()), (SubLObject)ke_file.$list1));
        ke_file.$ke_file_reserved_words$ = SubLFiles.defparameter("*KE-FILE-RESERVED-WORDS*", (SubLObject)ke_file.$list2);
        return (SubLObject)ke_file.NIL;
    }
    
    public static SubLObject setup_ke_file_file() {
        return (SubLObject)ke_file.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ke_file_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ke_file_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ke_file_file();
    }
    
    static {
        me = (SubLFile)new ke_file();
        ke_file.$ke_action_dispatch_table$ = null;
        ke_file.$ke_state_defaults$ = null;
        ke_file.$ke_file_reserved_words$ = null;
        $kw0$MT = SubLObjectFactory.makeKeyword("MT");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("ENTER")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("APPLICATION"), (SubLObject)SubLObjectFactory.makeKeyword("KE-FILE")));
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("EL"), SubLObjectFactory.makeString("F"), SubLObjectFactory.makeString("nil"), SubLObjectFactory.makeString("t"), SubLObjectFactory.makeString("Unit"), SubLObjectFactory.makeString("Constant"), SubLObjectFactory.makeString("Access"), SubLObjectFactory.makeString("Level"), SubLObjectFactory.makeString("AL"), SubLObjectFactory.makeString("Direction"), SubLObjectFactory.makeString("D"), SubLObjectFactory.makeString("In"), SubLObjectFactory.makeString("Mt"), SubLObjectFactory.makeString("forward"), SubLObjectFactory.makeString(":forward"), SubLObjectFactory.makeString("backward"), SubLObjectFactory.makeString(":backward"), SubLObjectFactory.makeString("code"), SubLObjectFactory.makeString(":code"), SubLObjectFactory.makeString("default"), SubLObjectFactory.makeString(":default"), SubLObjectFactory.makeString("monotonic"), SubLObjectFactory.makeString(":monotonic"), SubLObjectFactory.makeString("unknown"), SubLObjectFactory.makeString(":unknown"), SubLObjectFactory.makeString("TV"), SubLObjectFactory.makeString("Truth"), SubLObjectFactory.makeString("Value"), SubLObjectFactory.makeString("enter"), SubLObjectFactory.makeString("delete"), SubLObjectFactory.makeString("rename"), SubLObjectFactory.makeString("kill") });
        $sym3$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-HISTORY"));
        $kw5$REPLACE = SubLObjectFactory.makeKeyword("REPLACE");
        $str6$___s____s = SubLObjectFactory.makeString("~%~s : ~s");
        $list7 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MT-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-MT-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEFAULT-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("EL-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-EL-EXPR")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TV-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TV")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MODE-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("SET-MODE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RENAME-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-RENAME")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KILL-DIR?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-KILL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROBABLY-UNARY?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-PROBABLY-UNARY")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROBABLY-NON-UNARY?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-PROBABLY-NON-UNARY")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GIVE-UP?"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-PROBLEM")) });
        $sym8$ASSERTION_ID = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $kw9$LOCAL = SubLObjectFactory.makeKeyword("LOCAL");
        $kw10$REMOTE = SubLObjectFactory.makeKeyword("REMOTE");
        $str11$_____ = SubLObjectFactory.makeString(" #$()");
        $sym12$EXCEPT_KE_CHARS = SubLObjectFactory.makeSymbol("EXCEPT-KE-CHARS");
        $list13 = ConsesLow.list((SubLObject)Characters.CHAR_colon, (SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_period);
        $str14$_ = SubLObjectFactory.makeString(";");
        $list15 = ConsesLow.list((SubLObject)ke_file.TEN_INTEGER, (SubLObject)ke_file.THIRTEEN_INTEGER);
        $list16 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab);
        $list17 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_period);
        $kw18$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list19 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $sym20$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym21$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const22$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const23$UnaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"));
        $const24$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $str25$_ = SubLObjectFactory.makeString(":");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rename"), (SubLObject)SubLObjectFactory.makeString(":rename"));
        $str27$_ = SubLObjectFactory.makeString("\"");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("enter"), (SubLObject)SubLObjectFactory.makeString("delete"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("EL"), (SubLObject)SubLObjectFactory.makeString("F"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(implies "), (SubLObject)SubLObjectFactory.makeString("(and "), (SubLObject)SubLObjectFactory.makeString("(thereExist"), (SubLObject)SubLObjectFactory.makeString("(or "));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("EL"), (SubLObject)SubLObjectFactory.makeString("F"), (SubLObject)SubLObjectFactory.makeString("english"), (SubLObject)SubLObjectFactory.makeString("comment"), (SubLObject)SubLObjectFactory.makeString("future"), (SubLObject)SubLObjectFactory.makeString("cyclistNotes"), (SubLObject)SubLObjectFactory.makeString("ist"), (SubLObject)SubLObjectFactory.makeString("informStatement"));
        $str32$__ = SubLObjectFactory.makeString("~%");
        $kw33$MALFORMED = SubLObjectFactory.makeKeyword("MALFORMED");
        $kw34$CONS = SubLObjectFactory.makeKeyword("CONS");
        $kw35$OK_TOKEN_FORMS = SubLObjectFactory.makeKeyword("OK-TOKEN-FORMS");
        $str36$___s_token_strings_loaded_ = SubLObjectFactory.makeString("~%~s token strings loaded.");
        $str37$___s_token_strings_processed_ = SubLObjectFactory.makeString("~%~s token strings processed.");
        $str38$_____s_is_not_a_stream_or_a_strin = SubLObjectFactory.makeString("~%~%~s is not a stream or a string.");
        $kw39$REVERSE = SubLObjectFactory.makeKeyword("REVERSE");
        $str40$____Processing_token_strings____ = SubLObjectFactory.makeString("~%~%Processing token strings ...");
        $sym41$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $str42$__Malformed_token_list___s = SubLObjectFactory.makeString("~%Malformed token list: ~s");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unit"), (SubLObject)SubLObjectFactory.makeString("constant"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rename"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("delete"), (SubLObject)SubLObjectFactory.makeString("enter"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("kill"));
        $str47$in = SubLObjectFactory.makeString("in");
        $str48$mt = SubLObjectFactory.makeString("mt");
        $str49$default = SubLObjectFactory.makeString("default");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("el"), (SubLObject)SubLObjectFactory.makeString("f"));
        $str51$truth = SubLObjectFactory.makeString("truth");
        $str52$value = SubLObjectFactory.makeString("value");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":default"), (SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)SubLObjectFactory.makeString(":monotonic"), (SubLObject)SubLObjectFactory.makeString("monotonic"), (SubLObject)SubLObjectFactory.makeString(":unknown"), (SubLObject)SubLObjectFactory.makeString("unknown"));
        $str54$tv = SubLObjectFactory.makeString("tv");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("al"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeString("d"));
        $str56$access = SubLObjectFactory.makeString("access");
        $str57$level = SubLObjectFactory.makeString("level");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("unit"), SubLObjectFactory.makeString("in"), SubLObjectFactory.makeString("el"), SubLObjectFactory.makeString("f"), SubLObjectFactory.makeString("access"), SubLObjectFactory.makeString("al"), SubLObjectFactory.makeString("constant"), SubLObjectFactory.makeString("d"), SubLObjectFactory.makeString("direction"), SubLObjectFactory.makeString("tv"), SubLObjectFactory.makeString("truth"), SubLObjectFactory.makeString("enter"), SubLObjectFactory.makeString("delete"), SubLObjectFactory.makeString("kill"), SubLObjectFactory.makeString("rename") });
        $kw59$DEFAULT_MT = SubLObjectFactory.makeKeyword("DEFAULT-MT");
        $kw60$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw61$TV = SubLObjectFactory.makeKeyword("TV");
        $kw62$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw63$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":default"), (SubLObject)SubLObjectFactory.makeString("default"));
        $kw65$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":monotonic"), (SubLObject)SubLObjectFactory.makeString("monotonic"));
        $kw67$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":unknown"), (SubLObject)SubLObjectFactory.makeString("unknown"));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":forward"), (SubLObject)SubLObjectFactory.makeString("forward"), (SubLObject)SubLObjectFactory.makeString("0"));
        $kw70$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":backward"), (SubLObject)SubLObjectFactory.makeString("backward"), (SubLObject)SubLObjectFactory.makeString("4"));
        $kw72$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":code"), (SubLObject)SubLObjectFactory.makeString("code"));
        $kw74$CODE = SubLObjectFactory.makeKeyword("CODE");
        $str75$enter = SubLObjectFactory.makeString("enter");
        $kw76$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw77$ENTER = SubLObjectFactory.makeKeyword("ENTER");
        $str78$delete = SubLObjectFactory.makeString("delete");
        $kw79$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $const80$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $const81$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $sym82$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw83$ALREADY_IN_KB = SubLObjectFactory.makeKeyword("ALREADY-IN-KB");
        $kw84$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $kw85$FORMS_TO_EVAL = SubLObjectFactory.makeKeyword("FORMS-TO-EVAL");
        $sym86$KE_ASSERT = SubLObjectFactory.makeSymbol("KE-ASSERT");
        $sym87$KE_UNASSERT = SubLObjectFactory.makeSymbol("KE-UNASSERT");
        $sym88$KE_BLAST = SubLObjectFactory.makeSymbol("KE-BLAST");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL"), (SubLObject)SubLObjectFactory.makeKeyword("REMOTE"));
        $kw90$NOT_IN_KB = SubLObjectFactory.makeKeyword("NOT-IN-KB");
        $const91$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $kw92$ALREADY_CONSTANTS = SubLObjectFactory.makeKeyword("ALREADY-CONSTANTS");
        $kw93$ADJOIN = SubLObjectFactory.makeKeyword("ADJOIN");
        $sym94$KE_RENAME = SubLObjectFactory.makeSymbol("KE-RENAME");
        $sym95$KE_KILL = SubLObjectFactory.makeSymbol("KE-KILL");
        $kw96$NOT_VALID_CONSTANTS = SubLObjectFactory.makeKeyword("NOT-VALID-CONSTANTS");
        $kw97$SINGLE = SubLObjectFactory.makeKeyword("SINGLE");
        $str98$___a_s = SubLObjectFactory.makeString("~%~a~s");
        $str99$_____a_s = SubLObjectFactory.makeString("~%~%~a~s");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-IN-KB"), (SubLObject)SubLObjectFactory.makeKeyword("MALFORMED"), (SubLObject)SubLObjectFactory.makeKeyword("FORMS-TO-EVAL"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-IN-KB"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-VALID-CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("ALREADY-CONSTANTS"));
        $str101$_________________________________ = SubLObjectFactory.makeString("~%~%-------------------------------------------------------");
        $str102$____ = SubLObjectFactory.makeString("~%~%");
        $str103$_______s_in__s = SubLObjectFactory.makeString("~%~%  ~s in ~s");
        $str104$_______s_is_not_in__s = SubLObjectFactory.makeString("~%~%  ~s is not in ~s");
        $str105$____New_forms_to_evaluate_ = SubLObjectFactory.makeString("~%~%New forms to evaluate:");
        $kw106$DOUBLE = SubLObjectFactory.makeKeyword("DOUBLE");
        $str107$__Evaluate_the_form_above_now__ = SubLObjectFactory.makeString("~%Evaluate the form above now? ");
        $str108$__Evaluate_the__s_forms_above_now = SubLObjectFactory.makeString("~%Evaluate the ~s forms above now? ");
        $str109$__One_form_evaluated_ = SubLObjectFactory.makeString("~%One form evaluated.");
        $str110$___s_forms_evaluated_ = SubLObjectFactory.makeString("~%~s forms evaluated.");
        $str111$____Please_check_the_input_file__ = SubLObjectFactory.makeString("~%~%Please check the input file.~%Some expressions cannot be coerced into CycL.~%Some of these token lists may be malformed:");
        $str112$These_assertions_are_already_in_t = SubLObjectFactory.makeString("These assertions are already in the KB:");
        $str113$These_assertions_are_not_in_the_K = SubLObjectFactory.makeString("These assertions are not in the KB.~%They cannot be deleted:");
        $str114$These_strings_are_not_names_of_va = SubLObjectFactory.makeString("These strings are not names of valid constants.~%They cannot be killed:");
        $str115$These_strings_are_already_the_nam = SubLObjectFactory.makeString("These strings are already the names of constants.~%They cannot be used for renaming:");
        $str116$____Returning_to_Lisp_Interactor_ = SubLObjectFactory.makeString("~%~%Returning to Lisp Interactor.");
        $kw117$UNKNOWNS = SubLObjectFactory.makeKeyword("UNKNOWNS");
        $str118$____Waiting_for_create_operations = SubLObjectFactory.makeString("~%~%Waiting for create operations to be processed...~%Do you want to try to continue now? ");
        $str119$____Problem_loading_file__s_ = SubLObjectFactory.makeString("~%~%Problem loading file ~s.");
        $str120$____The_file_contains_fatal_synta = SubLObjectFactory.makeString("~%~%The file contains fatal syntax errors, or~%cannot be located by the pathname given.");
        $str121$____Please_check_the_input_file_f = SubLObjectFactory.makeString("~%~%Please check the input file for missing parens or periods,~%wrong number of arguments, etc.~%~%These token lists are malformed:");
        $str122$____Unknown_constants__or_constan = SubLObjectFactory.makeString("~%~%Unknown constants, or constants missing ids:~%");
        $str123$____Make_Cyc_constants_of_the_str = SubLObjectFactory.makeString("~%~%Make Cyc constants of the strings listed above? ");
        $str124$__OK___Be_sure_to_give_new_consta = SubLObjectFactory.makeString("~%OK.  Be sure to give new constants an #$isa.~%Be sure to give new collections a #$genls.~%Be sure to give new microtheories a #$genlMt.");
        $kw125$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str126$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str127$__Sorry___s_is_not_known_to_be_a_ = SubLObjectFactory.makeString("~%Sorry, ~s is not known to be a Cyclist.");
    }
}

/*

	Total time: 525 ms
	
*/
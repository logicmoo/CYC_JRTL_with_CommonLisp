package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_utilities";
    public static final String myFingerPrint = "9cacac2f2ae7b6d195d0fab6857479fc8c58c0726adaa88e0fd2abfa370de66a";
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 878L)
    public static SubLSymbol $ke_state$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1036L)
    public static SubLSymbol $ke_debug$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1076L)
    public static SubLSymbol $ke_state_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1699L)
    public static SubLSymbol $ke_non_constant_name_chars$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REPLACE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$INVALID_CONSTANT_NAME_CHAR_P;
    private static final SubLString $str5$nil;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_EXIT;
    private static final SubLInteger $int9$31;
    private static final SubLInteger $int10$127;
    private static final SubLSymbol $kw11$TV;
    private static final SubLSymbol $kw12$UNKNOWN;
    private static final SubLObject $const13$DefaultMonotonicPredicate;
    private static final SubLSymbol $kw14$MONOTONIC;
    private static final SubLSymbol $kw15$DEFAULT;
    private static final SubLSymbol $kw16$ALREADY_CREATED;
    private static final SubLSymbol $kw17$CONS;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1903L)
    public static SubLObject ke_value(final SubLObject cyclist, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.get_vector_indexed_val(cyclist, ke_utilities.$ke_state$.getDynamicValue(thread), key, ke_utilities.$ke_state_keys$.getDynamicValue(thread), (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2090L)
    public static SubLObject change_ke_value(final SubLObject cyclist, final SubLObject key, SubLObject method, SubLObject v_new) {
        if (method == ke_utilities.UNPROVIDED) {
            method = (SubLObject)ke_utilities.$kw2$REPLACE;
        }
        if (v_new == ke_utilities.UNPROVIDED) {
            v_new = (SubLObject)ke_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.update_vector_indexed_val(cyclist, ke_utilities.$ke_state$.getDynamicValue(thread), key, ke_utilities.$ke_state_keys$.getDynamicValue(thread), v_new, method, Symbols.symbol_function((SubLObject)ke_utilities.EQUAL), Symbols.symbol_function((SubLObject)ke_utilities.EQUAL), Symbols.symbol_function((SubLObject)ke_utilities.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2300L)
    public static SubLObject parens_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject left = string_utilities.count_chars_in_string(string, (SubLObject)Characters.CHAR_lparen);
            final SubLObject right = string_utilities.count_chars_in_string(string, (SubLObject)Characters.CHAR_rparen);
            return Numbers.numE(left, right);
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2550L)
    public static SubLObject dqs_equalP(final SubLObject string) {
        if (string.isString()) {
            final SubLObject n = string_utilities.count_chars_in_string(string, (SubLObject)Characters.CHAR_quotation);
            return Numbers.evenp(n);
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2739L)
    public static SubLObject hdify_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString() || !Sequences.length(string).numG((SubLObject)ke_utilities.ZERO_INTEGER)) {
            return (SubLObject)ke_utilities.NIL;
        }
        final SubLObject temp = Strings.make_string(Numbers.add((SubLObject)ke_utilities.ONE_INTEGER, Numbers.multiply(Sequences.length(string), (SubLObject)ke_utilities.TWO_INTEGER)), (SubLObject)ke_utilities.UNPROVIDED);
        SubLObject i = (SubLObject)ke_utilities.ZERO_INTEGER;
        SubLObject inside_dqP = (SubLObject)ke_utilities.NIL;
        final SubLObject len = Sequences.length(string);
        SubLObject temp_i = (SubLObject)ke_utilities.NIL;
        temp_i = (SubLObject)ke_utilities.ZERO_INTEGER;
        while (!i.numGE(len)) {
            final SubLObject lc = Strings.sublisp_char(string, i);
            final SubLObject fc = (SubLObject)(Numbers.subtract(i, (SubLObject)ke_utilities.ONE_INTEGER).numGE((SubLObject)ke_utilities.ZERO_INTEGER) ? Strings.sublisp_char(string, Numbers.subtract(i, (SubLObject)ke_utilities.ONE_INTEGER)) : ke_utilities.NIL);
            final SubLObject nc1 = (SubLObject)(Numbers.add(i, (SubLObject)ke_utilities.ONE_INTEGER).numL(len) ? Strings.sublisp_char(string, Numbers.add(i, (SubLObject)ke_utilities.ONE_INTEGER)) : ke_utilities.NIL);
            final SubLObject nc2 = (SubLObject)(Numbers.add(i, (SubLObject)ke_utilities.TWO_INTEGER).numL(len) ? Strings.sublisp_char(string, Numbers.add(i, (SubLObject)ke_utilities.TWO_INTEGER)) : ke_utilities.NIL);
            final SubLObject nc3 = (SubLObject)(Numbers.add(i, (SubLObject)ke_utilities.THREE_INTEGER).numL(len) ? Strings.sublisp_char(string, Numbers.add(i, (SubLObject)ke_utilities.THREE_INTEGER)) : ke_utilities.NIL);
            if (ke_utilities.NIL == Sequences.find(lc, ke_utilities.$ke_non_constant_name_chars$.getDynamicValue(thread), (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED) && (!lc.isChar() || ke_utilities.NIL == Sequences.find(Characters.char_code(lc), (SubLObject)ke_utilities.$list3, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED)) && ke_utilities.NIL == inside_dqP && ke_utilities.NIL == string_utilities.digit_stringP(Sequences.subseq(string, i, Sequences.position_if(Symbols.symbol_function((SubLObject)ke_utilities.$sym4$INVALID_CONSTANT_NAME_CHAR_P), string, Symbols.symbol_function((SubLObject)ke_utilities.IDENTITY), i, (SubLObject)ke_utilities.UNPROVIDED))) && (!lc.eql((SubLObject)Characters.CHAR_hyphen) || !nc1.isChar() || ke_utilities.NIL == Characters.digit_char_p(nc1, (SubLObject)ke_utilities.UNPROVIDED)) && (!string_utilities.char_list_to_string((SubLObject)ConsesLow.list(lc, nc1, nc2)).equalp((SubLObject)ke_utilities.$str5$nil) || ke_utilities.NIL == Sequences.find(nc3, (SubLObject)ke_utilities.$list6, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED)) && (ke_utilities.NIL != Sequences.find(fc, (SubLObject)ke_utilities.$list7, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED) || ke_utilities.NIL == fc)) {
                Vectors.set_aref(temp, temp_i, (SubLObject)Characters.CHAR_hash);
                temp_i = Numbers.add(temp_i, (SubLObject)ke_utilities.ONE_INTEGER);
                Vectors.set_aref(temp, temp_i, constant_reader.constant_reader_macro_char());
                temp_i = Numbers.add(temp_i, (SubLObject)ke_utilities.ONE_INTEGER);
                Vectors.set_aref(temp, temp_i, lc);
                i = Numbers.add(i, (SubLObject)ke_utilities.ONE_INTEGER);
            }
            else if (ke_utilities.NIL == inside_dqP && fc.eql((SubLObject)Characters.CHAR_quote)) {
                temp_i = Numbers.subtract(temp_i, (SubLObject)ke_utilities.ONE_INTEGER);
                Vectors.set_aref(temp, temp_i, lc);
                i = Numbers.add(i, (SubLObject)ke_utilities.ONE_INTEGER);
            }
            else {
                Vectors.set_aref(temp, temp_i, lc);
                i = Numbers.add(i, (SubLObject)ke_utilities.ONE_INTEGER);
            }
            if (ke_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, lc) && ke_utilities.NIL == inside_dqP) {
                inside_dqP = (SubLObject)ke_utilities.T;
            }
            else if (ke_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, lc) && ke_utilities.NIL != inside_dqP) {
                inside_dqP = (SubLObject)ke_utilities.NIL;
            }
            temp_i = Numbers.add(temp_i, (SubLObject)ke_utilities.ONE_INTEGER);
        }
        final SubLObject ans = string_utilities.trim_sides(temp, (SubLObject)ke_utilities.UNPROVIDED);
        if (Sequences.length(ans).numGE((SubLObject)ke_utilities.ZERO_INTEGER)) {
            return ans;
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 4698L)
    public static SubLObject cycl_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_utilities.NIL != string_utilities.non_empty_stringP(string)) {
            if (ke_utilities.NIL != constant_completion_high.valid_constant_name_p(string)) {
                final SubLObject constant = constants_high.find_constant(string);
                if (ke_utilities.NIL != constant_handles.valid_constantP(constant, (SubLObject)ke_utilities.UNPROVIDED)) {
                    return constant;
                }
            }
            if (ke_utilities.NIL != kb_utilities.compact_hl_external_id_stringP(string)) {
                final SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string(string);
                if (ke_utilities.NIL != cycl_grammar.cycl_expression_p(v_term)) {
                    return v_term;
                }
            }
            else if (ke_utilities.NIL != kb_utilities.hl_external_id_string_p(string)) {
                final SubLObject v_term = kb_utilities.find_object_by_hl_external_id_string(string);
                if (ke_utilities.NIL != cycl_grammar.cycl_expression_p(v_term)) {
                    return v_term;
                }
            }
            else if (ke_utilities.NIL != Guids.guid_string_p(string)) {
                final SubLObject v_term = constants_high.find_constant_by_guid_string(string);
                if (ke_utilities.NIL != v_term) {
                    return v_term;
                }
            }
            else if (ke_utilities.NIL != parens_equalP(string) && ke_utilities.NIL != dqs_equalP(string)) {
                final SubLObject _prev_bind_0 = control_vars.$read_require_constant_exists$.currentBinding(thread);
                try {
                    control_vars.$read_require_constant_exists$.bind((SubLObject)ke_utilities.T, thread);
                    SubLObject cycl = reader.read_from_string_ignoring_errors(hdify_string(string), (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED);
                    if (ke_utilities.NIL == cycl) {
                        cycl = reader.read_from_string_ignoring_errors(hdify_string(kb_utilities.string_remove_nart_affixes(string)), (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED);
                    }
                    return cycl;
                }
                finally {
                    control_vars.$read_require_constant_exists$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 5853L)
    public static SubLObject fort_from_string(final SubLObject string) {
        SubLObject v_term = cycl_from_string(string);
        if (ke_utilities.NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        if (ke_utilities.NIL != term.hl_ground_nautP(v_term)) {
            v_term = narts_high.find_nart(v_term);
            if (ke_utilities.NIL != nart_handles.nart_p(v_term)) {
                return v_term;
            }
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6138L)
    public static SubLObject nart_from_string(final SubLObject string) {
        final SubLObject v_term = cycl_from_string(string);
        return nart_from_string_int(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6307L)
    public static SubLObject nart_from_string_int(SubLObject v_term) {
        if (ke_utilities.NIL != nart_handles.nart_p(v_term)) {
            return v_term;
        }
        if (ke_utilities.NIL != term.hl_ground_nautP(v_term)) {
            v_term = narts_high.find_nart(v_term);
            if (ke_utilities.NIL != nart_handles.nart_p(v_term)) {
                return v_term;
            }
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6502L)
    public static SubLObject nat_from_string(final SubLObject string) {
        final SubLObject v_term = cycl_from_string(string);
        final SubLObject nart = nart_from_string_int(v_term);
        if (ke_utilities.NIL != nart) {
            return nart;
        }
        if (ke_utilities.NIL != term.closed_nautP(v_term, (SubLObject)ke_utilities.UNPROVIDED)) {
            return v_term;
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6787L)
    public static SubLObject printable_ascii_charP(final SubLObject character) {
        final SubLObject code = Characters.char_code(character);
        return (SubLObject)SubLObjectFactory.makeBoolean(code.numG((SubLObject)ke_utilities.$int9$31) && code.numL((SubLObject)ke_utilities.$int10$127));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6923L)
    public static SubLObject strip_garbage_chars(final SubLObject string, SubLObject embedded_strings_tooP) {
        if (embedded_strings_tooP == ke_utilities.UNPROVIDED) {
            embedded_strings_tooP = (SubLObject)ke_utilities.NIL;
        }
        SubLObject inside_dqP = (SubLObject)ke_utilities.NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject code;
        for (end_var = (end_var_$1 = Sequences.length(string)), i = (SubLObject)ke_utilities.NIL, i = (SubLObject)ke_utilities.ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string, i);
            code = Characters.char_code(ch);
            if (ke_utilities.NIL != Characters.charE(ch, (SubLObject)Characters.CHAR_quotation)) {
                inside_dqP = (SubLObject)SubLObjectFactory.makeBoolean(ke_utilities.NIL == inside_dqP);
            }
            if (ke_utilities.NIL == printable_ascii_charP(ch) && (ke_utilities.NIL == inside_dqP || ke_utilities.NIL == conses_high.member(code, (SubLObject)ke_utilities.$list3, (SubLObject)ke_utilities.UNPROVIDED, (SubLObject)ke_utilities.UNPROVIDED) || ke_utilities.NIL != embedded_strings_tooP)) {
                Strings.set_char(string, i, (SubLObject)Characters.CHAR_space);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 7454L)
    public static SubLObject set_tv_to_use(final SubLObject predicate) {
        if (ke_value(operation_communication.the_cyclist(), (SubLObject)ke_utilities.$kw11$TV).equal((SubLObject)ke_utilities.$kw12$UNKNOWN) && ke_utilities.NIL != isa.isa_in_any_mtP(predicate, ke_utilities.$const13$DefaultMonotonicPredicate)) {
            return (SubLObject)ke_utilities.$kw14$MONOTONIC;
        }
        if (ke_value(operation_communication.the_cyclist(), (SubLObject)ke_utilities.$kw11$TV) == ke_utilities.$kw14$MONOTONIC) {
            return (SubLObject)ke_utilities.$kw14$MONOTONIC;
        }
        return (SubLObject)ke_utilities.$kw15$DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 7796L)
    public static SubLObject constantify(final SubLObject strings) {
        SubLObject cdolist_list_var = strings;
        SubLObject s = (SubLObject)ke_utilities.NIL;
        s = cdolist_list_var.first();
        while (ke_utilities.NIL != cdolist_list_var) {
            if (ke_utilities.NIL == subl_promotions.memberP(s, ke_value(operation_communication.the_cyclist(), (SubLObject)ke_utilities.$kw16$ALREADY_CREATED), Symbols.symbol_function((SubLObject)ke_utilities.EQUALP), (SubLObject)ke_utilities.UNPROVIDED)) {
                ke.ke_create(s);
                change_ke_value(operation_communication.the_cyclist(), (SubLObject)ke_utilities.$kw16$ALREADY_CREATED, (SubLObject)ke_utilities.$kw17$CONS, s);
            }
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        }
        return (SubLObject)ke_utilities.NIL;
    }
    
    public static SubLObject declare_ke_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "ke_value", "KE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "change_ke_value", "CHANGE-KE-VALUE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "parens_equalP", "PARENS-EQUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "dqs_equalP", "DQS-EQUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "hdify_string", "HDIFY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "cycl_from_string", "CYCL-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "fort_from_string", "FORT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "nart_from_string", "NART-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "nart_from_string_int", "NART-FROM-STRING-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "nat_from_string", "NAT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "printable_ascii_charP", "PRINTABLE-ASCII-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "strip_garbage_chars", "STRIP-GARBAGE-CHARS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "set_tv_to_use", "SET-TV-TO-USE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_utilities", "constantify", "CONSTANTIFY", 1, 0, false);
        return (SubLObject)ke_utilities.NIL;
    }
    
    public static SubLObject init_ke_utilities_file() {
        ke_utilities.$ke_state$ = SubLFiles.defparameter("*KE-STATE*", (SubLObject)ke_utilities.NIL);
        ke_utilities.$ke_debug$ = SubLFiles.defparameter("*KE-DEBUG*", (SubLObject)ke_utilities.NIL);
        ke_utilities.$ke_state_keys$ = SubLFiles.defparameter("*KE-STATE-KEYS*", (SubLObject)ke_utilities.$list0);
        ke_utilities.$ke_non_constant_name_chars$ = SubLFiles.defparameter("*KE-NON-CONSTANT-NAME-CHARS*", (SubLObject)ke_utilities.$list1);
        return (SubLObject)ke_utilities.NIL;
    }
    
    public static SubLObject setup_ke_utilities_file() {
        return (SubLObject)ke_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ke_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ke_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ke_utilities_file();
    }
    
    static {
        me = (SubLFile)new ke_utilities();
        ke_utilities.$ke_state$ = null;
        ke_utilities.$ke_debug$ = null;
        ke_utilities.$ke_state_keys$ = null;
        ke_utilities.$ke_non_constant_name_chars$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)ke_utilities.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)ke_utilities.ONE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)ke_utilities.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ke_utilities.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWNS"), (SubLObject)ke_utilities.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-CREATED"), (SubLObject)ke_utilities.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OK-TOKEN-FORMS"), (SubLObject)ke_utilities.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MALFORMED"), (SubLObject)ke_utilities.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-IN-KB"), (SubLObject)ke_utilities.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORMS-TO-EVAL"), (SubLObject)ke_utilities.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MODE"), (SubLObject)ke_utilities.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-HISTORY"), (SubLObject)ke_utilities.ELEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-IN-KB"), (SubLObject)ke_utilities.TWELVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-VALID-CONSTANTS"), (SubLObject)ke_utilities.THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-CONSTANTS"), (SubLObject)ke_utilities.FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("APPLICATION"), (SubLObject)ke_utilities.FIFTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-MT"), (SubLObject)ke_utilities.SIXTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIALOG-SCRIPT"), (SubLObject)ke_utilities.SEVENTEEN_INTEGER) });
        $list1 = ConsesLow.list(new SubLObject[] { Characters.CHAR_space, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_hash, Characters.CHAR_percent, Characters.CHAR_question, Characters.CHAR_dollar, Characters.CHAR_colon });
        $kw2$REPLACE = SubLObjectFactory.makeKeyword("REPLACE");
        $list3 = ConsesLow.list((SubLObject)ke_utilities.NINE_INTEGER, (SubLObject)ke_utilities.TEN_INTEGER, (SubLObject)ke_utilities.THIRTEEN_INTEGER);
        $sym4$INVALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");
        $str5$nil = SubLObjectFactory.makeString("nil");
        $list6 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_rparen);
        $list7 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_lparen);
        $sym8$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $int9$31 = SubLObjectFactory.makeInteger(31);
        $int10$127 = SubLObjectFactory.makeInteger(127);
        $kw11$TV = SubLObjectFactory.makeKeyword("TV");
        $kw12$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const13$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate"));
        $kw14$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw15$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw16$ALREADY_CREATED = SubLObjectFactory.makeKeyword("ALREADY-CREATED");
        $kw17$CONS = SubLObjectFactory.makeKeyword("CONS");
    }
}

/*

	Total time: 226 ms
	
*/
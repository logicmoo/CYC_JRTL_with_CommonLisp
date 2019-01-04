package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class morphological_word_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.morphological_word_parser";
    public static final String myFingerPrint = "1dc8aae2bf501da3d488932018cc5cf77796841e70e9f0e19b8627090a2f33a8";
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
    private static SubLSymbol $complex_word_string_is_speech_partP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
    private static SubLSymbol $parse_complex_word_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16550L)
    private static SubLSymbol $mwp_initializedP$;
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$WORD_DENOT;
    private static final SubLSymbol $kw5$WORD_POS_PRED;
    private static final SubLSymbol $kw6$WORD_UNIT;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$BASE;
    private static final SubLSymbol $kw10$AFFIX;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$SEM_PRED;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$SPEECH_PART_;
    private static final SubLSymbol $sym17$KEYWORDP;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$FIRST;
    private static final SubLSymbol $sym25$SECOND;
    private static final SubLSymbol $sym26$THIRD;
    private static final SubLSymbol $sym27$SPEECH_PART_PRED_;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$LEXICAL_WORD_;
    private static final SubLSymbol $sym31$POS_OF_PRED;
    private static final SubLSymbol $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_;
    private static final SubLSymbol $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_;
    private static final SubLInteger $int34$200;
    private static final SubLSymbol $sym35$PARSE_COMPLEX_WORD_STRING;
    private static final SubLSymbol $sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_;
    private static final SubLInteger $int37$1000;
    private static final SubLSymbol $sym38$CLEAR_PARSE_COMPLEX_WORD_STRING;
    private static final SubLSymbol $sym39$_MWP_INITIALIZED__;
    private static final SubLSymbol $sym40$MWP_PSEUDO_FUNCTION_P;
    private static final SubLSymbol $kw41$APPLY_AFFIX;
    private static final SubLSymbol $kw42$DENOT_OF;
    private static final SubLString $str43$Morphological_Word_Parser;
    private static final SubLString $str44$Morphological_Word_Parser_Test_Su;
    private static final SubLList $list45;
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 928L)
    public static SubLObject parse_affixes(final SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == morphological_word_parser.UNPROVIDED) {
            suppress_fake_denotsP = (SubLObject)morphological_word_parser.T;
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$1;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$1 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list1);
                    current_$1 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list1);
                    if (morphological_word_parser.NIL == conses_high.member(current_$1, (SubLObject)morphological_word_parser.$list2, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$1 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list1);
                }
                word_denot_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw4$WORD_DENOT, current);
                word_denot = (SubLObject)((morphological_word_parser.NIL != word_denot_tail) ? conses_high.cadr(word_denot_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL);
                if ((morphological_word_parser.NIL != word_denot || morphological_word_parser.NIL != word_pos_pred || morphological_word_parser.NIL != word_unit) && morphological_word_parser.NIL != denot_acceptableP(word_denot, suppress_fake_denotsP)) {
                    item_var = (SubLObject)ConsesLow.list(word_denot, word_pos_pred, word_unit);
                    if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 1830L)
    public static SubLObject derived_nl_trie_words(final SubLObject word_string) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        mwp_check_initializations();
        return morph_word.derived_nl_trie_words_int(word_string, (SubLObject)morphological_word_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 2199L)
    public static SubLObject mwp_find_stems(final SubLObject word_string) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$2;
        SubLObject base_tail;
        SubLObject base;
        SubLObject affix_tail;
        SubLObject affix;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$2 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list7);
                    current_$2 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list7);
                    if (morphological_word_parser.NIL == conses_high.member(current_$2, (SubLObject)morphological_word_parser.$list8, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$2 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list7);
                }
                base_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw9$BASE, current);
                base = (SubLObject)((morphological_word_parser.NIL != base_tail) ? conses_high.cadr(base_tail) : morphological_word_parser.NIL);
                affix_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw10$AFFIX, current);
                affix = (SubLObject)((morphological_word_parser.NIL != affix_tail) ? conses_high.cadr(affix_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                item_var = (SubLObject)ConsesLow.list(base, affix, word_pos_pred);
                if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 2715L)
    public static SubLObject denots_of_complex_word_string(final SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == morphological_word_parser.UNPROVIDED) {
            suppress_fake_denotsP = (SubLObject)morphological_word_parser.T;
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject denots = (SubLObject)morphological_word_parser.NIL;
        SubLObject sem_pred_lists = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$3;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$3 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list11);
                    current_$3 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list11);
                    if (morphological_word_parser.NIL == conses_high.member(current_$3, (SubLObject)morphological_word_parser.$list12, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$3 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list11);
                }
                word_denot_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw4$WORD_DENOT, current);
                word_denot = (SubLObject)((morphological_word_parser.NIL != word_denot_tail) ? conses_high.cadr(word_denot_tail) : morphological_word_parser.NIL);
                sem_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw13$SEM_PRED, current);
                sem_pred = (SubLObject)((morphological_word_parser.NIL != sem_pred_tail) ? conses_high.cadr(sem_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != word_denot && morphological_word_parser.NIL != denot_acceptableP(word_denot, suppress_fake_denotsP) && morphological_word_parser.NIL == subl_promotions.memberP(word_denot, denots, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    denots = (SubLObject)ConsesLow.cons(word_denot, denots);
                    sem_pred_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sem_pred), sem_pred_lists);
                }
            }
        }
        return Values.values(denots, sem_pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 3799L)
    public static SubLObject denots_of_complex_word_stringXpos_pred(final SubLObject word_string, final SubLObject pos_pred, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == morphological_word_parser.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == morphological_word_parser.UNPROVIDED) {
            suppress_fake_denotsP = (SubLObject)morphological_word_parser.T;
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject denots = (SubLObject)morphological_word_parser.NIL;
        SubLObject sem_pred_lists = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$4;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$4 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    current_$4 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    if (morphological_word_parser.NIL == conses_high.member(current_$4, (SubLObject)morphological_word_parser.$list15, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$4 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list14);
                }
                word_denot_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw4$WORD_DENOT, current);
                word_denot = (SubLObject)((morphological_word_parser.NIL != word_denot_tail) ? conses_high.cadr(word_denot_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                sem_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw13$SEM_PRED, current);
                sem_pred = (SubLObject)((morphological_word_parser.NIL != sem_pred_tail) ? conses_high.cadr(sem_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pos_pred, mt) && morphological_word_parser.NIL != denot_acceptableP(word_denot, suppress_fake_denotsP) && morphological_word_parser.NIL == subl_promotions.memberP(word_denot, denots, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    denots = (SubLObject)ConsesLow.cons(word_denot, denots);
                    sem_pred_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sem_pred), sem_pred_lists);
                }
            }
        }
        return Values.values(denots, sem_pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 5185L)
    public static SubLObject denots_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == morphological_word_parser.UNPROVIDED) {
            suppress_fake_denotsP = (SubLObject)morphological_word_parser.T;
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.speech_partP(speech_part, (SubLObject)morphological_word_parser.UNPROVIDED) : speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject denots = (SubLObject)morphological_word_parser.NIL;
        SubLObject sem_pred_lists = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$5;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$5 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    current_$5 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    if (morphological_word_parser.NIL == conses_high.member(current_$5, (SubLObject)morphological_word_parser.$list15, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$5 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list14);
                }
                word_denot_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw4$WORD_DENOT, current);
                word_denot = (SubLObject)((morphological_word_parser.NIL != word_denot_tail) ? conses_high.cadr(word_denot_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                sem_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw13$SEM_PRED, current);
                sem_pred = (SubLObject)((morphological_word_parser.NIL != sem_pred_tail) ? conses_high.cadr(sem_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, (SubLObject)morphological_word_parser.UNPROVIDED) && morphological_word_parser.NIL != denot_acceptableP(word_denot, suppress_fake_denotsP) && morphological_word_parser.NIL == subl_promotions.memberP(word_denot, denots, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    denots = (SubLObject)ConsesLow.cons(word_denot, denots);
                    sem_pred_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sem_pred), sem_pred_lists);
                }
            }
        }
        return Values.values(denots, sem_pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 6556L)
    public static SubLObject denots_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == morphological_word_parser.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == morphological_word_parser.UNPROVIDED) {
            suppress_fake_denotsP = (SubLObject)morphological_word_parser.T;
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != Types.keywordp(pos_keyword) : pos_keyword;
        final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject denots = (SubLObject)morphological_word_parser.NIL;
        SubLObject sem_pred_lists = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$6;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$6 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    current_$6 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list14);
                    if (morphological_word_parser.NIL == conses_high.member(current_$6, (SubLObject)morphological_word_parser.$list15, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$6 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list14);
                }
                word_denot_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw4$WORD_DENOT, current);
                word_denot = (SubLObject)((morphological_word_parser.NIL != word_denot_tail) ? conses_high.cadr(word_denot_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                sem_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw13$SEM_PRED, current);
                sem_pred = (SubLObject)((morphological_word_parser.NIL != sem_pred_tail) ? conses_high.cadr(sem_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL), (SubLObject)morphological_word_parser.UNPROVIDED) && morphological_word_parser.NIL != denot_acceptableP(word_denot, suppress_fake_denotsP) && morphological_word_parser.NIL == subl_promotions.memberP(word_denot, denots, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    denots = (SubLObject)ConsesLow.cons(word_denot, denots);
                    sem_pred_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sem_pred), sem_pred_lists);
                }
            }
        }
        return Values.values(denots, sem_pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 8024L)
    public static SubLObject words_of_complex_word_string(final SubLObject word_string) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$7;
        SubLObject word_unit_tail;
        SubLObject item_var;
        SubLObject word_unit;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$7 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list18);
                    current_$7 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list18);
                    if (morphological_word_parser.NIL == conses_high.member(current_$7, (SubLObject)morphological_word_parser.$list19, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$7 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list18);
                }
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (item_var = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL));
                if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 8657L)
    public static SubLObject words_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.speech_partP(speech_part, (SubLObject)morphological_word_parser.UNPROVIDED) : speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject words_to_preds = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$8;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse) && morphological_word_parser.NIL != morph_word.mwp_parse_complex_p(parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$8 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    current_$8 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    if (morphological_word_parser.NIL == conses_high.member(current_$8, (SubLObject)morphological_word_parser.$list21, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$8 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list20);
                }
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    words_to_preds = list_utilities.alist_pushnew(words_to_preds, word_unit, word_pos_pred, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL));
                }
            }
        }
        return Values.values(list_utilities.alist_keys(words_to_preds), list_utilities.alist_values(words_to_preds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 9737L)
    public static SubLObject words_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt) {
        if (mt == morphological_word_parser.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != Types.keywordp(pos_keyword) : pos_keyword;
        final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject triples = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$9;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse) && morphological_word_parser.NIL != morph_word.mwp_parse_complex_p(parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$9 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list22);
                    current_$9 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list22);
                    if (morphological_word_parser.NIL == conses_high.member(current_$9, (SubLObject)morphological_word_parser.$list23, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$9 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list22);
                }
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                sem_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw13$SEM_PRED, current);
                sem_pred = (SubLObject)((morphological_word_parser.NIL != sem_pred_tail) ? conses_high.cadr(sem_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL), (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    item_var = (SubLObject)ConsesLow.list(word_unit, word_pos_pred, sem_pred);
                    if (morphological_word_parser.NIL == conses_high.member(item_var, triples, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                        triples = (SubLObject)ConsesLow.cons(item_var, triples);
                    }
                }
            }
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym24$FIRST), triples), Mapping.mapcar(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym25$SECOND), triples), Mapping.mapcar(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym26$THIRD), triples));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 11011L)
    public static SubLObject words_of_complex_word_stringXpred(final SubLObject word_string, final SubLObject pred) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)morphological_word_parser.UNPROVIDED) : pred;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$10;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse) && morphological_word_parser.NIL != morph_word.mwp_parse_complex_p(parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$10 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    current_$10 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    if (morphological_word_parser.NIL == conses_high.member(current_$10, (SubLObject)morphological_word_parser.$list21, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$10 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list20);
                }
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pred, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    item_var = word_unit;
                    if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQUAL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 11911L)
    public static SubLObject preds_of_complex_word_string(final SubLObject word_string) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$11;
        SubLObject word_pos_pred_tail;
        SubLObject item_var;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse) && morphological_word_parser.NIL != morph_word.mwp_parse_complex_p(parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$11 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list28);
                    current_$11 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list28);
                    if (morphological_word_parser.NIL == conses_high.member(current_$11, (SubLObject)morphological_word_parser.$list29, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$11 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list28);
                }
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (item_var = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL));
                if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 12592L)
    public static SubLObject preds_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.lexical_wordP(word) : word;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        SubLObject ans = (SubLObject)morphological_word_parser.NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$12;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse) && morphological_word_parser.NIL != morph_word.mwp_parse_complex_p(parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$12 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    current_$12 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list20);
                    if (morphological_word_parser.NIL == conses_high.member(current_$12, (SubLObject)morphological_word_parser.$list21, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$12 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list20);
                }
                word_unit_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw6$WORD_UNIT, current);
                word_unit = (SubLObject)((morphological_word_parser.NIL != word_unit_tail) ? conses_high.cadr(word_unit_tail) : morphological_word_parser.NIL);
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != czer_utilities.equals_elP(word_unit, word, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    item_var = word_pos_pred;
                    if (morphological_word_parser.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL), Symbols.symbol_function((SubLObject)morphological_word_parser.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 13541L)
    public static SubLObject pos_of_complex_word_string(final SubLObject word_string) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        final SubLObject word_pos_preds = preds_of_complex_word_string(word_string);
        return list_utilities.mapcar_unique(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym31$POS_OF_PRED), word_pos_preds, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14085L)
    public static SubLObject pos_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.lexical_wordP(word) : word;
        final SubLObject word_pos_preds = preds_of_complex_word_stringXword(word_string, word);
        return list_utilities.mapcar_unique(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym31$POS_OF_PRED), word_pos_preds, Symbols.symbol_function((SubLObject)morphological_word_parser.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
    public static SubLObject clear_complex_word_string_is_speech_partP() {
        final SubLObject cs = morphological_word_parser.$complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
        if (morphological_word_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
    public static SubLObject remove_complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args(morphological_word_parser.$complex_word_string_is_speech_partP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_string, speech_part), (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
    public static SubLObject complex_word_string_is_speech_partP_internal(final SubLObject word_string, final SubLObject speech_part) {
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        assert morphological_word_parser.NIL != lexicon_accessors.speech_partP(speech_part, (SubLObject)morphological_word_parser.UNPROVIDED) : speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, (SubLObject)morphological_word_parser.UNPROVIDED);
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$13;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)morphological_word_parser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); morphological_word_parser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (morphological_word_parser.NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = (current = parse);
                allow_other_keys_p = (SubLObject)morphological_word_parser.NIL;
                rest = current;
                bad = (SubLObject)morphological_word_parser.NIL;
                current_$13 = (SubLObject)morphological_word_parser.NIL;
                while (morphological_word_parser.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list28);
                    current_$13 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)morphological_word_parser.$list28);
                    if (morphological_word_parser.NIL == conses_high.member(current_$13, (SubLObject)morphological_word_parser.$list29, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                        bad = (SubLObject)morphological_word_parser.T;
                    }
                    if (current_$13 == morphological_word_parser.$kw3$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (morphological_word_parser.NIL != bad && morphological_word_parser.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphological_word_parser.$list28);
                }
                word_pos_pred_tail = cdestructuring_bind.property_list_member((SubLObject)morphological_word_parser.$kw5$WORD_POS_PRED, current);
                word_pos_pred = (SubLObject)((morphological_word_parser.NIL != word_pos_pred_tail) ? conses_high.cadr(word_pos_pred_tail) : morphological_word_parser.NIL);
                if (morphological_word_parser.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, (SubLObject)morphological_word_parser.UNPROVIDED)) {
                    return (SubLObject)morphological_word_parser.T;
                }
            }
        }
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
    public static SubLObject complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part) {
        SubLObject caching_state = morphological_word_parser.$complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
        if (morphological_word_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)morphological_word_parser.$sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_, (SubLObject)morphological_word_parser.$sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_, (SubLObject)morphological_word_parser.$int34$200, (SubLObject)morphological_word_parser.EQUAL, (SubLObject)morphological_word_parser.TWO_INTEGER, (SubLObject)morphological_word_parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)morphological_word_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)morphological_word_parser.NIL;
            collision = cdolist_list_var.first();
            while (morphological_word_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (morphological_word_parser.NIL != cached_args && morphological_word_parser.NIL == cached_args.rest() && speech_part.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(complex_word_string_is_speech_partP_internal(word_string, speech_part)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word_string, speech_part));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
    public static SubLObject clear_parse_complex_word_string() {
        final SubLObject cs = morphological_word_parser.$parse_complex_word_string_caching_state$.getGlobalValue();
        if (morphological_word_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
    public static SubLObject remove_parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == morphological_word_parser.UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(morphological_word_parser.$parse_complex_word_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_string, wff_filter_level), (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
    public static SubLObject parse_complex_word_string_internal(final SubLObject word_string, final SubLObject wff_filter_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert morphological_word_parser.NIL != Types.stringp(word_string) : word_string;
        mwp_check_initializations();
        final SubLObject word = morph_word.new_morph_word(word_string);
        final SubLObject _prev_bind_0 = lexicon_vars.$mwp_wff_filter_level$.currentBinding(thread);
        try {
            lexicon_vars.$mwp_wff_filter_level$.bind(wff_filter_level, thread);
            morph_word.morph_word_parse_affixes(word, (SubLObject)morphological_word_parser.UNPROVIDED);
        }
        finally {
            lexicon_vars.$mwp_wff_filter_level$.rebind(_prev_bind_0, thread);
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
    public static SubLObject parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == morphological_word_parser.UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        SubLObject caching_state = morphological_word_parser.$parse_complex_word_string_caching_state$.getGlobalValue();
        if (morphological_word_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)morphological_word_parser.$sym35$PARSE_COMPLEX_WORD_STRING, (SubLObject)morphological_word_parser.$sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_, (SubLObject)morphological_word_parser.$int37$1000, (SubLObject)morphological_word_parser.EQUAL, (SubLObject)morphological_word_parser.TWO_INTEGER, (SubLObject)morphological_word_parser.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)morphological_word_parser.$sym38$CLEAR_PARSE_COMPLEX_WORD_STRING);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, wff_filter_level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)morphological_word_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)morphological_word_parser.NIL;
            collision = cdolist_list_var.first();
            while (morphological_word_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (morphological_word_parser.NIL != cached_args && morphological_word_parser.NIL == cached_args.rest() && wff_filter_level.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(parse_complex_word_string_internal(word_string, wff_filter_level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word_string, wff_filter_level));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16386L)
    public static SubLObject mwp_check_initializations() {
        if (morphological_word_parser.NIL == mwp_initializedP()) {
            initialize_mwp();
        }
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16594L)
    public static SubLObject mwp_initializedP() {
        return morphological_word_parser.$mwp_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16658L)
    public static SubLObject initialize_mwp() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)morphological_word_parser.T, thread);
            mwp_affix_matcher.mwp_suffix_matcher_init();
            mwp_affix_matcher.mwp_prefix_matcher_init();
            mwp_rule.mwp_rule_constraint_table_init();
            mwp_rule.mwp_rule_spec_table_init();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        morphological_word_parser.$mwp_initializedP$.setGlobalValue((SubLObject)morphological_word_parser.T);
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16965L)
    public static SubLObject note_mwp_needs_reinitialization() {
        morphological_word_parser.$mwp_initializedP$.setGlobalValue((SubLObject)morphological_word_parser.NIL);
        clear_complex_word_string_is_speech_partP();
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17186L)
    public static SubLObject denot_acceptableP(final SubLObject denot, final SubLObject suppress_fake_denotsP) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphological_word_parser.NIL == suppress_fake_denotsP || morphological_word_parser.NIL == fake_derived_denotation_p(denot));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17417L)
    public static SubLObject fake_derived_denotation_p(final SubLObject v_object) {
        return cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)morphological_word_parser.$sym40$MWP_PSEUDO_FUNCTION_P), v_object, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17677L)
    public static SubLObject mwp_pseudo_function_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object == morphological_word_parser.$kw41$APPLY_AFFIX || v_object == morphological_word_parser.$kw42$DENOT_OF);
    }
    
    public static SubLObject declare_morphological_word_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "parse_affixes", "PARSE-AFFIXES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "derived_nl_trie_words", "DERIVED-NL-TRIE-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "mwp_find_stems", "MWP-FIND-STEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "denots_of_complex_word_string", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "denots_of_complex_word_stringXpos_pred", "DENOTS-OF-COMPLEX-WORD-STRING&POS-PRED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "denots_of_complex_word_stringXspeech_part", "DENOTS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "denots_of_complex_word_stringXpos", "DENOTS-OF-COMPLEX-WORD-STRING&POS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "words_of_complex_word_string", "WORDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "words_of_complex_word_stringXspeech_part", "WORDS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "words_of_complex_word_stringXpos", "WORDS-OF-COMPLEX-WORD-STRING&POS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "words_of_complex_word_stringXpred", "WORDS-OF-COMPLEX-WORD-STRING&PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "preds_of_complex_word_string", "PREDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "preds_of_complex_word_stringXword", "PREDS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "pos_of_complex_word_string", "POS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "pos_of_complex_word_stringXword", "POS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "clear_complex_word_string_is_speech_partP", "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "remove_complex_word_string_is_speech_partP", "REMOVE-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "complex_word_string_is_speech_partP_internal", "COMPLEX-WORD-STRING-IS-SPEECH-PART?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "complex_word_string_is_speech_partP", "COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "clear_parse_complex_word_string", "CLEAR-PARSE-COMPLEX-WORD-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "remove_parse_complex_word_string", "REMOVE-PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "parse_complex_word_string_internal", "PARSE-COMPLEX-WORD-STRING-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "parse_complex_word_string", "PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "mwp_check_initializations", "MWP-CHECK-INITIALIZATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "mwp_initializedP", "MWP-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "initialize_mwp", "INITIALIZE-MWP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "note_mwp_needs_reinitialization", "NOTE-MWP-NEEDS-REINITIALIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "denot_acceptableP", "DENOT-ACCEPTABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "fake_derived_denotation_p", "FAKE-DERIVED-DENOTATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphological_word_parser", "mwp_pseudo_function_p", "MWP-PSEUDO-FUNCTION-P", 1, 0, false);
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    public static SubLObject init_morphological_word_parser_file() {
        morphological_word_parser.$complex_word_string_is_speech_partP_caching_state$ = SubLFiles.deflexical("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*", (SubLObject)morphological_word_parser.NIL);
        morphological_word_parser.$parse_complex_word_string_caching_state$ = SubLFiles.deflexical("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*", (SubLObject)morphological_word_parser.NIL);
        morphological_word_parser.$mwp_initializedP$ = SubLFiles.deflexical("*MWP-INITIALIZED?*", (SubLObject)((morphological_word_parser.NIL != Symbols.boundp((SubLObject)morphological_word_parser.$sym39$_MWP_INITIALIZED__)) ? morphological_word_parser.$mwp_initializedP$.getGlobalValue() : morphological_word_parser.NIL));
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    public static SubLObject setup_morphological_word_parser_file() {
        memoization_state.note_globally_cached_function((SubLObject)morphological_word_parser.$sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_);
        memoization_state.note_globally_cached_function((SubLObject)morphological_word_parser.$sym35$PARSE_COMPLEX_WORD_STRING);
        subl_macro_promotions.declare_defglobal((SubLObject)morphological_word_parser.$sym39$_MWP_INITIALIZED__);
        sunit_external.define_test_category((SubLObject)morphological_word_parser.$str43$Morphological_Word_Parser, (SubLObject)morphological_word_parser.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)morphological_word_parser.$str44$Morphological_Word_Parser_Test_Su, (SubLObject)morphological_word_parser.$list45, (SubLObject)morphological_word_parser.UNPROVIDED, (SubLObject)morphological_word_parser.UNPROVIDED);
        return (SubLObject)morphological_word_parser.NIL;
    }
    
    public void declareFunctions() {
        declare_morphological_word_parser_file();
    }
    
    public void initializeVariables() {
        init_morphological_word_parser_file();
    }
    
    public void runTopLevelForms() {
        setup_morphological_word_parser_file();
    }
    
    static {
        me = (SubLFile)new morphological_word_parser();
        morphological_word_parser.$complex_word_string_is_speech_partP_caching_state$ = null;
        morphological_word_parser.$parse_complex_word_string_caching_state$ = null;
        morphological_word_parser.$mwp_initializedP$ = null;
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$WORD_DENOT = SubLObjectFactory.makeKeyword("WORD-DENOT");
        $kw5$WORD_POS_PRED = SubLObjectFactory.makeKeyword("WORD-POS-PRED");
        $kw6$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BASE"), (SubLObject)SubLObjectFactory.makeSymbol("AFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASE"), (SubLObject)SubLObjectFactory.makeKeyword("AFFIX"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"));
        $kw9$BASE = SubLObjectFactory.makeKeyword("BASE");
        $kw10$AFFIX = SubLObjectFactory.makeKeyword("AFFIX");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("SEM-PRED"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("SEM-PRED"));
        $kw13$SEM_PRED = SubLObjectFactory.makeKeyword("SEM-PRED");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SEM-PRED"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-DENOT"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("SEM-PRED"));
        $sym16$SPEECH_PART_ = SubLObjectFactory.makeSymbol("SPEECH-PART?");
        $sym17$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SEM-PRED"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("SEM-PRED"));
        $sym24$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym25$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym26$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym27$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-POS-PRED"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WORD-POS-PRED"));
        $sym30$LEXICAL_WORD_ = SubLObjectFactory.makeSymbol("LEXICAL-WORD?");
        $sym31$POS_OF_PRED = SubLObjectFactory.makeSymbol("POS-OF-PRED");
        $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_ = SubLObjectFactory.makeSymbol("COMPLEX-WORD-STRING-IS-SPEECH-PART?");
        $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*");
        $int34$200 = SubLObjectFactory.makeInteger(200);
        $sym35$PARSE_COMPLEX_WORD_STRING = SubLObjectFactory.makeSymbol("PARSE-COMPLEX-WORD-STRING");
        $sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*");
        $int37$1000 = SubLObjectFactory.makeInteger(1000);
        $sym38$CLEAR_PARSE_COMPLEX_WORD_STRING = SubLObjectFactory.makeSymbol("CLEAR-PARSE-COMPLEX-WORD-STRING");
        $sym39$_MWP_INITIALIZED__ = SubLObjectFactory.makeSymbol("*MWP-INITIALIZED?*");
        $sym40$MWP_PSEUDO_FUNCTION_P = SubLObjectFactory.makeSymbol("MWP-PSEUDO-FUNCTION-P");
        $kw41$APPLY_AFFIX = SubLObjectFactory.makeKeyword("APPLY-AFFIX");
        $kw42$DENOT_OF = SubLObjectFactory.makeKeyword("DENOT-OF");
        $str43$Morphological_Word_Parser = SubLObjectFactory.makeString("Morphological Word Parser");
        $str44$Morphological_Word_Parser_Test_Su = SubLObjectFactory.makeString("Morphological Word Parser Test Suite");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Morphological Word Parser"));
    }
}

/*

	Total time: 268 ms
	
*/
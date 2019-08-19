/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class morphology extends SubLTranslatedFile {

  //// Constructor

  private morphology() {}
  public static final SubLFile me = new morphology();
  public static final String myName = "com.cyc.cycjava_1.cycl.morphology";

  //// Definitions

  @SubL(source = "cycl/morphology.lisp", position = 1960) 
  private static SubLSymbol $vowels$ = null;

  /** List of vowel character pairs that often occur within a single syllable */
  @SubL(source = "cycl/morphology.lisp", position = 2078) 
  private static SubLSymbol $bigraph_vowels$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2283) 
  private static SubLSymbol $sibilant_endings$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2355) 
  private static SubLSymbol $consonants$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2412) 
  private static SubLSymbol $doublers$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2462) 
  private static SubLSymbol $unstressed_latin_pfxs$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2549) 
  private static SubLSymbol $special_ate_cases$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2735) 
  private static SubLSymbol $liquids$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 2821) 
  private static SubLSymbol $vowelsX_plus_y$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 17513) 
  private static SubLSymbol $aes_do_orthographic_change_fns$ = null;

  public static final class $aes_add_e_before_s$BinaryFunction extends BinaryFunction {
    public $aes_add_e_before_s$BinaryFunction() { super(extractFunctionNamed("AES-ADD-E-BEFORE-S")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12884"); }
  }

  public static final class $aes_change_y_to_i$BinaryFunction extends BinaryFunction {
    public $aes_change_y_to_i$BinaryFunction() { super(extractFunctionNamed("AES-CHANGE-Y-TO-I")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12890"); }
  }

  public static final class $aes_ble_to_bil_before_ity$BinaryFunction extends BinaryFunction {
    public $aes_ble_to_bil_before_ity$BinaryFunction() { super(extractFunctionNamed("AES-BLE-TO-BIL-BEFORE-ITY")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12885"); }
  }

  public static final class $aes_change_aic_to_ac$BinaryFunction extends BinaryFunction {
    public $aes_change_aic_to_ac$BinaryFunction() { super(extractFunctionNamed("AES-CHANGE-AIC-TO-AC")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12886"); }
  }

  public static final class $aes_strip_final_e$BinaryFunction extends BinaryFunction {
    public $aes_strip_final_e$BinaryFunction() { super(extractFunctionNamed("AES-STRIP-FINAL-E")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12895"); }
  }

  public static final class $aes_strip_final_vowels_before_ic$BinaryFunction extends BinaryFunction {
    public $aes_strip_final_vowels_before_ic$BinaryFunction() { super(extractFunctionNamed("AES-STRIP-FINAL-VOWELS-BEFORE-IC")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12896"); }
  }

  public static final class $aes_change_ie_to_y$BinaryFunction extends BinaryFunction {
    public $aes_change_ie_to_y$BinaryFunction() { super(extractFunctionNamed("AES-CHANGE-IE-TO-Y")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12888"); }
  }

  public static final class $aes_change_ism_to_ist$BinaryFunction extends BinaryFunction {
    public $aes_change_ism_to_ist$BinaryFunction() { super(extractFunctionNamed("AES-CHANGE-ISM-TO-IST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12889"); }
  }

  public static final class $aes_change_ceive_to_cept$BinaryFunction extends BinaryFunction {
    public $aes_change_ceive_to_cept$BinaryFunction() { super(extractFunctionNamed("AES-CHANGE-CEIVE-TO-CEPT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12887"); }
  }

  public static final class $aes_remove_able_le_before_ly$BinaryFunction extends BinaryFunction {
    public $aes_remove_able_le_before_ly$BinaryFunction() { super(extractFunctionNamed("AES-REMOVE-ABLE-LE-BEFORE-LY")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12894"); }
  }

  public static final class $aes_geminate_last$BinaryFunction extends BinaryFunction {
    public $aes_geminate_last$BinaryFunction() { super(extractFunctionNamed("AES-GEMINATE-LAST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12893"); }
  }

  public static final class $aes_able_to_ate$BinaryFunction extends BinaryFunction {
    public $aes_able_to_ate$BinaryFunction() { super(extractFunctionNamed("AES-ABLE-TO-ATE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12883"); }
  }

  /** Maximum number of syllables for comparative and superlative adjectives that use -er */
  @SubL(source = "cycl/morphology.lisp", position = 23306) 
  private static SubLSymbol $comparative_syllable_cutoff$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 23815) 
  private static SubLSymbol $more_prefix$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 23860) 
  private static SubLSymbol $most_prefix$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 29529) 
  private static SubLSymbol $english_possessive_pronouns$ = null;

  @SubL(source = "cycl/morphology.lisp", position = 38032) 
  private static SubLSymbol $find_stem_memoized_caching_state$ = null;

  /** @hack, but I have no idea what the consequences of a larger fix might be... or why downcasing occurs at all. --TW */
  @SubL(source = "cycl/morphology.lisp", position = 43923) 
  public static SubLSymbol $preserve_case_in_singular_regP$ = null;

  /** part-of-speech keywords currently supported */
  @SubL(source = "cycl/morphology.lisp", position = 51441) 
  private static SubLSymbol $pos_keywords$ = null;

  public static final SubLObject declare_morphology_file() {
    //declareFunction("get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
    //declareFunction("estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
    //declareFunction("monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
    //declareFunction("polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
    //declareFunction("vowel_charP", "VOWEL-CHAR?", 1, 1, false);
    //declareFunction("consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
    //declareFunction("get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
    //declareFunction("ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
    //declareFunction("starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
    //declareFunction("ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
    //declareFunction("starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
    //declareFunction("single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
    //declareFunction("ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
    //declareFunction("starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
    //declareFunction("ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
    //declareFunction("ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
    //declareFunction("make_geminate", "MAKE-GEMINATE", 2, 0, false);
    //declareFunction("geminate_last", "GEMINATE-LAST", 1, 0, false);
    //declareFunction("correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
    //declareFunction("regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
    //declareFunction("suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
    //declareFunction("generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
    //declareFunction("generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
    //declareFunction("generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
    //declareFunction("add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
    //declareFunction("aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
    //declareFunction("aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
    //declareFunction("aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
    //declareFunction("ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
    //declareFunction("aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false); new $aes_add_e_before_s$BinaryFunction();
    //declareFunction("aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false); new $aes_change_y_to_i$BinaryFunction();
    //declareFunction("aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false); new $aes_ble_to_bil_before_ity$BinaryFunction();
    //declareFunction("aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false); new $aes_change_aic_to_ac$BinaryFunction();
    //declareFunction("aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false); new $aes_strip_final_e$BinaryFunction();
    //declareFunction("aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false); new $aes_strip_final_vowels_before_ic$BinaryFunction();
    //declareFunction("aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false); new $aes_change_ie_to_y$BinaryFunction();
    //declareFunction("aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false); new $aes_change_ism_to_ist$BinaryFunction();
    //declareFunction("aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false); new $aes_change_ceive_to_cept$BinaryFunction();
    //declareFunction("aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false); new $aes_remove_able_le_before_ly$BinaryFunction();
    //declareFunction("aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false); new $aes_geminate_last$BinaryFunction();
    //declareFunction("aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false); new $aes_able_to_ate$BinaryFunction();
    //declareFunction("try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
    //declareFunction("most_form", "MOST-FORM", 1, 0, false);
    //declareFunction("more_form", "MORE-FORM", 1, 0, false);
    //declareFunction("most_form_p", "MOST-FORM-P", 1, 0, false);
    //declareFunction("more_form_p", "MORE-FORM-P", 1, 0, false);
    //declareFunction("more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
    //declareFunction("comparative_reg", "COMPARATIVE-REG", 1, 0, false);
    //declareFunction("comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
    //declareFunction("superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
    //declareFunction("superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
    //declareFunction("past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
    //declareFunction("gerund_reg", "GERUND-REG", 1, 0, false);
    //declareFunction("third_sg_reg", "THIRD-SG-REG", 1, 0, false);
    //declareFunction("plural_reg", "PLURAL-REG", 1, 0, false);
    //declareFunction("pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
    //declareFunction("infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
    //declareFunction("infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
    //declareFunction("possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
    //declareFunction("english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
    //declareFunction("english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
    //declareFunction("locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
    //declareFunction("not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
    //declareFunction("english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
    //declareFunction("pluralize_string", "PLURALIZE-STRING", 1, 1, false);
    //declareFunction("singularize_string", "SINGULARIZE-STRING", 1, 1, false);
    //declareFunction("has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
    //declareFunction("has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
    //declareFunction("is_word", "IS-WORD", 1, 0, false);
    //declareFunction("is_noun", "IS-NOUN", 1, 0, false);
    //declareFunction("is_verb", "IS-VERB", 1, 0, false);
    //declareFunction("is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
    //declareFunction("clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
    //declareFunction("remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
    //declareFunction("find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
    //declareFunction("find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
    //declareFunction("find_stem", "FIND-STEM", 1, 1, false);
    //declareFunction("inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
    //declareFunction("agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
    //declareFunction("third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
    //declareFunction("plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
    //declareFunction("singular_reg", "SINGULAR-REG", 1, 0, false);
    //declareFunction("plural_nounP", "PLURAL-NOUN?", 1, 0, false);
    //declareFunction("infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
    //declareFunction("progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
    //declareFunction("perfect_stringP", "PERFECT-STRING?", 1, 0, false);
    //declareFunction("f_3sg_stringP", "3SG-STRING?", 1, 0, false);
    //declareFunction("numberspp", "NUMBERSPP", 1, 0, false);
    //declareFunction("comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
    //declareFunction("superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
    //declareFunction("pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
    //declareFunction("proper_nounp", "PROPER-NOUNP", 1, 0, false);
    //declareFunction("verbp", "VERBP", 1, 0, false);
    //declareFunction("nounp", "NOUNP", 1, 0, false);
    //declareFunction("adjectivep", "ADJECTIVEP", 1, 0, false);
    //declareFunction("adverbp", "ADVERBP", 1, 0, false);
    //declareFunction("pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
    //declareFunction("root_predicate", "ROOT-PREDICATE", 1, 0, false);
    //declareFunction("get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
    //declareFunction("get_root", "GET-ROOT", 1, 1, false);
    //declareFunction("expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_morphology_file() {
    $vowels$ = defconstant("*VOWELS*", $str0$aeiou);
    $bigraph_vowels$ = defconstant("*BIGRAPH-VOWELS*", $list1);
    $sibilant_endings$ = defconstant("*SIBILANT-ENDINGS*", $list2);
    $consonants$ = defconstant("*CONSONANTS*", $str3$bcdfghjklmnprstvxz);
    $doublers$ = defconstant("*DOUBLERS*", $str4$bdfgklmnprtvz);
    $unstressed_latin_pfxs$ = defconstant("*UNSTRESSED-LATIN-PFXS*", $list5);
    $special_ate_cases$ = defconstant("*SPECIAL-ATE-CASES*", $list6);
    $liquids$ = defconstant("*LIQUIDS*", $list7);
    $vowelsX_plus_y$ = defconstant("*VOWELS*-PLUS-Y*", Sequences.cconcatenate($vowels$.getGlobalValue(), $str8$y));
    $aes_do_orthographic_change_fns$ = deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list28);
    $comparative_syllable_cutoff$ = deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER);
    $more_prefix$ = defconstant("*MORE-PREFIX*", $str62$more_);
    $most_prefix$ = defconstant("*MOST-PREFIX*", $str63$most_);
    $english_possessive_pronouns$ = defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list72);
    $find_stem_memoized_caching_state$ = deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL);
    $preserve_case_in_singular_regP$ = defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL);
    $pos_keywords$ = defparameter("*POS-KEYWORDS*", $list162);
    return NIL;
  }

  public static final SubLObject setup_morphology_file() {
        memoization_state.note_globally_cached_function($sym82$FIND_STEM_MEMOIZED);
    access_macros.register_external_symbol($sym96$PLURAL_NOUN_TO_SG);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$aeiou = makeString("aeiou");
  public static final SubLList $list1 = list(new SubLObject[] {makeString("ai"), makeString("au"), makeString("ay"), makeString("ea"), makeString("ee"), makeString("ei"), makeString("eu"), makeString("ie"), makeString("io"), makeString("oa"), makeString("oi"), makeString("oo"), makeString("ou"), makeString("ow"), makeString("oy"), makeString("ui")});
  public static final SubLList $list2 = list(makeString("ss"), makeString("x"), makeString("sh"), makeString("ch"), makeString("z"), makeString("s"));
  public static final SubLString $str3$bcdfghjklmnprstvxz = makeString("bcdfghjklmnprstvxz");
  public static final SubLString $str4$bdfgklmnprtvz = makeString("bdfgklmnprtvz");
  public static final SubLList $list5 = list(makeString("re"), makeString("de"), makeString("dis"), makeString("mis"), makeString("un"), makeString("in"), makeString("ex"));
  public static final SubLList $list6 = list(new SubLObject[] {makeString("evaporate"), makeString("appreciate"), makeString("associate"), makeString("accommodate"), makeString("affiliate"), makeString("applicate"), makeString("navigate"), makeString("calculate"), makeString("abdicate"), makeString("estimate"), makeString("emulate"), makeString("educate")});
  public static final SubLList $list7 = list(makeString("l"), makeString("r"));
  public static final SubLString $str8$y = makeString("y");
  public static final SubLString $str9$ly = makeString("ly");
  public static final SubLString $str10$qw = makeString("qw");
  public static final SubLString $str11$q = makeString("q");
  public static final SubLString $str12$u = makeString("u");
  public static final SubLObject $const13$comparativeDegree = constant_handles.reader_make_constant_shell(makeString("comparativeDegree"));
  public static final SubLSymbol $sym14$COMPARATIVE_REG = makeSymbol("COMPARATIVE-REG");
  public static final SubLObject $const15$superlativeDegree = constant_handles.reader_make_constant_shell(makeString("superlativeDegree"));
  public static final SubLSymbol $sym16$SUPERLATIVE_REG = makeSymbol("SUPERLATIVE-REG");
  public static final SubLObject $const17$comparativeAdverb = constant_handles.reader_make_constant_shell(makeString("comparativeAdverb"));
  public static final SubLSymbol $sym18$COMPARATIVE_ADVERB_REG = makeSymbol("COMPARATIVE-ADVERB-REG");
  public static final SubLObject $const19$superlativeAdverb = constant_handles.reader_make_constant_shell(makeString("superlativeAdverb"));
  public static final SubLSymbol $sym20$SUPERLATIVE_ADVERB_REG = makeSymbol("SUPERLATIVE-ADVERB-REG");
  public static final SubLObject $const21$regularSuffix = constant_handles.reader_make_constant_shell(makeString("regularSuffix"));
  public static final SubLObject $const22$EnglishLexiconMt = constant_handles.reader_make_constant_shell(makeString("EnglishLexiconMt"));
  public static final SubLList $list23 = list(constant_handles.reader_make_constant_shell(makeString("regularDegree")), constant_handles.reader_make_constant_shell(makeString("regularAdverb")));
  public static final SubLList $list24 = list(constant_handles.reader_make_constant_shell(makeString("comparativeDegree")), constant_handles.reader_make_constant_shell(makeString("superlativeDegree")), constant_handles.reader_make_constant_shell(makeString("comparativeAdverb")), constant_handles.reader_make_constant_shell(makeString("superlativeAdverb")));
  public static final SubLSymbol $sym25$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str26$ = makeString("");
  public static final SubLList $list27 = cons(makeSymbol("CHANGE-FN"), makeSymbol("TYPE"));
  public static final SubLList $list28 = list(new SubLObject[] {cons(makeSymbol("AES-CHANGE-Y-TO-I"), makeKeyword("BOTH")), cons(makeSymbol("AES-ABLE-TO-ATE"), makeKeyword("BASE")), cons(makeSymbol("AES-GEMINATE-LAST"), makeKeyword("BASE")), cons(makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-AIC-TO-AC"), makeKeyword("BASE")), cons(makeSymbol("AES-STRIP-FINAL-E"), makeKeyword("BASE")), cons(makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-IE-TO-Y"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-ISM-TO-IST"), makeKeyword("BASE")), cons(makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), makeKeyword("BASE")), cons(makeSymbol("AES-ADD-E-BEFORE-S"), makeKeyword("SUFFIX"))});
  public static final SubLList $list29 = list(makeKeyword("BOTH"), makeKeyword("BASE"));
  public static final SubLList $list30 = list(makeKeyword("BOTH"), makeKeyword("SUFFIX"));
  public static final SubLString $str31$s = makeString("s");
  public static final SubLString $str32$e = makeString("e");
  public static final SubLString $str33$i = makeString("i");
  public static final SubLString $str34$ity = makeString("ity");
  public static final SubLString $str35$ble = makeString("ble");
  public static final SubLString $str36$il = makeString("il");
  public static final SubLString $str37$at = makeString("at");
  public static final SubLString $str38$ai = makeString("ai");
  public static final SubLString $str39$ing = makeString("ing");
  public static final SubLString $str40$ie = makeString("ie");
  public static final SubLString $str41$ism = makeString("ism");
  public static final SubLString $str42$ist = makeString("ist");
  public static final SubLString $str43$ceive = makeString("ceive");
  public static final SubLString $str44$ion = makeString("ion");
  public static final SubLString $str45$ive = makeString("ive");
  public static final SubLString $str46$pt = makeString("pt");
  public static final SubLString $str47$able = makeString("able");
  public static final SubLString $str48$ible = makeString("ible");
  public static final SubLString $str49$le = makeString("le");
  public static final SubLString $str50$z = makeString("z");
  public static final SubLString $str51$ize = makeString("ize");
  public static final SubLString $str52$ise = makeString("ise");
  public static final SubLString $str53$al = makeString("al");
  public static final SubLString $str54$er = makeString("er");
  public static final SubLString $str55$or = makeString("or");
  public static final SubLString $str56$fer = makeString("fer");
  public static final SubLString $str57$ffer = makeString("ffer");
  public static final SubLString $str58$id = makeString("id");
  public static final SubLList $list59 = list(makeString("n"), makeString("l"), makeString("t"));
  public static final SubLString $str60$ate = makeString("ate");
  public static final SubLString $str61$ed = makeString("ed");
  public static final SubLString $str62$more_ = makeString("more ");
  public static final SubLString $str63$most_ = makeString("most ");
  public static final SubLString $str64$est = makeString("est");
  public static final SubLObject $const65$pastTense_Universal = constant_handles.reader_make_constant_shell(makeString("pastTense-Universal"));
  public static final SubLObject $const66$infinitive = constant_handles.reader_make_constant_shell(makeString("infinitive"));
  public static final SubLObject $const67$gerund = constant_handles.reader_make_constant_shell(makeString("gerund"));
  public static final SubLObject $const68$thirdPersonSg_Present = constant_handles.reader_make_constant_shell(makeString("thirdPersonSg-Present"));
  public static final SubLObject $const69$plural = constant_handles.reader_make_constant_shell(makeString("plural"));
  public static final SubLObject $const70$singular = constant_handles.reader_make_constant_shell(makeString("singular"));
  public static final SubLObject $const71$presentParticiple = constant_handles.reader_make_constant_shell(makeString("presentParticiple"));
  public static final SubLList $list72 = list(new SubLObject[] {cons(makeString("I"), makeString("my")), cons(makeString("me"), makeString("my")), cons(makeString("you"), makeString("your")), cons(makeString("he"), makeString("his")), cons(makeString("him"), makeString("his")), cons(makeString("him or her"), makeString("his or her")), cons(makeString("he or she"), makeString("his or her")), cons(makeString("she"), makeString("her")), cons(makeString("her"), makeString("her")), cons(makeString("it"), makeString("its")), cons(makeString("we"), makeString("our")), cons(makeString("us"), makeString("our")), cons(makeString("they"), makeString("their")), cons(makeString("them"), makeString("their")), cons(makeString("there"), makeString("that place's")), cons(makeString("here"), makeString("this place's"))});
  public static final SubLSymbol $kw73$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLString $str74$_s = makeString("'s");
  public static final SubLString $str75$_ = makeString(" ");
  public static final SubLObject $const76$GeographicalRegion = constant_handles.reader_make_constant_shell(makeString("GeographicalRegion"));
  public static final SubLString $str77$in = makeString("in");
  public static final SubLObject $const78$SurfaceRegion_Underspecified = constant_handles.reader_make_constant_shell(makeString("SurfaceRegion-Underspecified"));
  public static final SubLString $str79$on = makeString("on");
  public static final SubLObject $const80$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));
  public static final SubLSymbol $kw81$ANY = makeKeyword("ANY");
  public static final SubLSymbol $sym82$FIND_STEM_MEMOIZED = makeSymbol("FIND-STEM-MEMOIZED");
  public static final SubLSymbol $sym83$_FIND_STEM_MEMOIZED_CACHING_STATE_ = makeSymbol("*FIND-STEM-MEMOIZED-CACHING-STATE*");
  public static final SubLInteger $int84$16384 = makeInteger(16384);
  public static final SubLSymbol $sym85$CLEAR_FIND_STEM_MEMOIZED = makeSymbol("CLEAR-FIND-STEM-MEMOIZED");
  public static final SubLSymbol $kw86$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str87$ies = makeString("ies");
  public static final SubLString $str88$ss = makeString("ss");
  public static final SubLList $list89 = list(makeString("o"), makeString("ch"), makeString("x"), makeString("sh"), makeString("z"), makeString("s"));
  public static final SubLSymbol $kw90$VERB = makeKeyword("VERB");
  public static final SubLString $str91$ied = makeString("ied");
  public static final SubLString $str92$l = makeString("l");
  public static final SubLString $str93$d = makeString("d");
  public static final SubLString $str94$r = makeString("r");
  public static final SubLString $str95$es = makeString("es");
  public static final SubLSymbol $sym96$PLURAL_NOUN_TO_SG = makeSymbol("PLURAL-NOUN-TO-SG");
  public static final SubLString $str97$us = makeString("us");
  public static final SubLList $list98 = list(Characters.CHAR_r, Characters.CHAR_h, Characters.CHAR_t, Characters.CHAR_n);
  public static final SubLList $list99 = list(makeString("ch"), makeString("sh"), makeString("x"), makeString("z"));
  public static final SubLString $str100$en = makeString("en");
  public static final SubLObject $const101$Number_SP = constant_handles.reader_make_constant_shell(makeString("Number-SP"));
  public static final SubLObject $const102$ProperCountNoun = constant_handles.reader_make_constant_shell(makeString("ProperCountNoun"));
  public static final SubLObject $const103$CountNoun = constant_handles.reader_make_constant_shell(makeString("CountNoun"));
  public static final SubLObject $const104$Adjective = constant_handles.reader_make_constant_shell(makeString("Adjective"));
  public static final SubLObject $const105$Verb = constant_handles.reader_make_constant_shell(makeString("Verb"));
  public static final SubLObject $const106$Adverb = constant_handles.reader_make_constant_shell(makeString("Adverb"));
  public static final SubLString $str107$yze = makeString("yze");
  public static final SubLString $str108$ify = makeString("ify");
  public static final SubLString $str109$logy = makeString("logy");
  public static final SubLString $str110$ette = makeString("ette");
  public static final SubLString $str111$ess = makeString("ess");
  public static final SubLString $str112$eer = makeString("eer");
  public static final SubLString $str113$omy = makeString("omy");
  public static final SubLString $str114$ics = makeString("ics");
  public static final SubLString $str115$geny = makeString("geny");
  public static final SubLString $str116$ium = makeString("ium");
  public static final SubLString $str117$cracy = makeString("cracy");
  public static final SubLString $str118$itis = makeString("itis");
  public static final SubLString $str119$oma = makeString("oma");
  public static final SubLString $str120$lysis = makeString("lysis");
  public static final SubLString $str121$hood = makeString("hood");
  public static final SubLString $str122$ship = makeString("ship");
  public static final SubLString $str123$lty = makeString("lty");
  public static final SubLString $str124$meter = makeString("meter");
  public static final SubLString $str125$morph = makeString("morph");
  public static final SubLString $str126$morphy = makeString("morphy");
  public static final SubLString $str127$osis = makeString("osis");
  public static final SubLString $str128$stery = makeString("stery");
  public static final SubLString $str129$ence = makeString("ence");
  public static final SubLString $str130$tude = makeString("tude");
  public static final SubLString $str131$ance = makeString("ance");
  public static final SubLString $str132$graphy = makeString("graphy");
  public static final SubLString $str133$ment = makeString("ment");
  public static final SubLString $str134$age = makeString("age");
  public static final SubLString $str135$dom = makeString("dom");
  public static final SubLString $str136$ery = makeString("ery");
  public static final SubLString $str137$ite = makeString("ite");
  public static final SubLString $str138$let = makeString("let");
  public static final SubLString $str139$ling = makeString("ling");
  public static final SubLString $str140$ster = makeString("ster");
  public static final SubLString $str141$ant = makeString("ant");
  public static final SubLString $str142$ee = makeString("ee");
  public static final SubLString $str143$ese = makeString("ese");
  public static final SubLString $str144$an = makeString("an");
  public static final SubLString $str145$ical = makeString("ical");
  public static final SubLString $str146$ous = makeString("ous");
  public static final SubLString $str147$less = makeString("less");
  public static final SubLString $str148$ier = makeString("ier");
  public static final SubLString $str149$nant = makeString("nant");
  public static final SubLString $str150$thic = makeString("thic");
  public static final SubLString $str151$etic = makeString("etic");
  public static final SubLString $str152$itic = makeString("itic");
  public static final SubLString $str153$ful = makeString("ful");
  public static final SubLString $str154$ish = makeString("ish");
  public static final SubLString $str155$like = makeString("like");
  public static final SubLString $str156$ial = makeString("ial");
  public static final SubLString $str157$esque = makeString("esque");
  public static final SubLString $str158$ic = makeString("ic");
  public static final SubLString $str159$wise = makeString("wise");
  public static final SubLString $str160$ward = makeString("ward");
  public static final SubLString $str161$wards = makeString("wards");
  public static final SubLList $list162 = list(makeKeyword("NOUN"), makeKeyword("PROPER-NOUN"), makeKeyword("VERB"), makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"), makeKeyword("PREPOSITION"));
  public static final SubLSymbol $kw163$PROPER_NOUN = makeKeyword("PROPER-NOUN");
  public static final SubLObject $const164$pnSingular = constant_handles.reader_make_constant_shell(makeString("pnSingular"));
  public static final SubLSymbol $kw165$NOUN = makeKeyword("NOUN");
  public static final SubLSymbol $kw166$ADJECTIVE = makeKeyword("ADJECTIVE");
  public static final SubLObject $const167$regularDegree = constant_handles.reader_make_constant_shell(makeString("regularDegree"));
  public static final SubLSymbol $kw168$ADVERB = makeKeyword("ADVERB");
  public static final SubLObject $const169$regularAdverb = constant_handles.reader_make_constant_shell(makeString("regularAdverb"));
  public static final SubLSymbol $kw170$PREPOSITION = makeKeyword("PREPOSITION");
  public static final SubLObject $const171$prepositionStrings = constant_handles.reader_make_constant_shell(makeString("prepositionStrings"));
  public static final SubLString $str172$be = makeString("be");
  public static final SubLSymbol $sym173$POS_KEYWORD_P = makeSymbol("POS-KEYWORD-P");
  public static final SubLObject $const174$Be_Contracted = constant_handles.reader_make_constant_shell(makeString("Be-Contracted"));
  public static final SubLObject $const175$Be_TheWord = constant_handles.reader_make_constant_shell(makeString("Be-TheWord"));
  public static final SubLObject $const176$Will_Contracted = constant_handles.reader_make_constant_shell(makeString("Will-Contracted"));
  public static final SubLObject $const177$Will_TheModal = constant_handles.reader_make_constant_shell(makeString("Will-TheModal"));
  public static final SubLObject $const178$Have_Contracted = constant_handles.reader_make_constant_shell(makeString("Have-Contracted"));
  public static final SubLObject $const179$Have_TheWord = constant_handles.reader_make_constant_shell(makeString("Have-TheWord"));
  public static final SubLObject $const180$Would_Contracted = constant_handles.reader_make_constant_shell(makeString("Would-Contracted"));
  public static final SubLObject $const181$Would_TheWord = constant_handles.reader_make_constant_shell(makeString("Would-TheWord"));

  //// Initializers

  public void declareFunctions() {
    declare_morphology_file();
  }

  public void initializeVariables() {
    init_morphology_file();
  }

  public void runTopLevelForms() {
    setup_morphology_file();
  }

}

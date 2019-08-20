/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wordnet extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new wordnet();



    // deflexical
    // Definitions
    @LispMethod(comment = "A representative sample of the KB constants that Wordnet depends on.\ndeflexical")
    /**
     * A representative sample of the KB constants that Wordnet depends on.
     */
    private static final SubLSymbol $wordnet_core_constants$ = makeSymbol("*WORDNET-CORE-CONSTANTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("synonymousExternalConcept"));

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol LOAD_WORDNET = makeSymbol("LOAD-WORDNET");

    /**
     * Determines whether portion of the KB necessary for WORDNET is loaded.
     * This is the KB analogue of the #+Cyc-Wordnet feature.
     */
    @LispMethod(comment = "Determines whether portion of the KB necessary for WORDNET is loaded.\r\nThis is the KB analogue of the #+Cyc-Wordnet feature.\nDetermines whether portion of the KB necessary for WORDNET is loaded.\nThis is the KB analogue of the #+Cyc-Wordnet feature.")
    public static final SubLObject initialize_wordnet_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $wordnet_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_wordnet_kb_loaded();
        } else {
            kb_control_vars.unset_wordnet_kb_loaded();
        }
        return kb_control_vars.wordnet_kb_loaded_p();
    }

    @LispMethod(comment = "Determines whether portion of the KB necessary for WORDNET is loaded.\r\nThis is the KB analogue of the #+Cyc-Wordnet feature.\nDetermines whether portion of the KB necessary for WORDNET is loaded.\nThis is the KB analogue of the #+Cyc-Wordnet feature.")
    public static SubLObject initialize_wordnet_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $wordnet_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_wordnet_kb_loaded();
        } else {
            kb_control_vars.unset_wordnet_kb_loaded();
        }
        return kb_control_vars.wordnet_kb_loaded_p();
    }

    /**
     * Return T iff STRING is a word in wordnet with POS as the part-of-speech.
     */
    @LispMethod(comment = "Return T iff STRING is a word in wordnet with POS as the part-of-speech.")
    public static final SubLObject wordnet_word_p_alt(SubLObject string, SubLObject pos) {
        return NIL;
    }

    @LispMethod(comment = "Return T iff STRING is a word in wordnet with POS as the part-of-speech.")
    public static SubLObject wordnet_word_p(final SubLObject string, final SubLObject pos) {
        return NIL;
    }

    /**
     * Given STRING, return a list of pos keywords corresponding to the parts of speech the string has in WordNet.
     */
    @LispMethod(comment = "Given STRING, return a list of pos keywords corresponding to the parts of speech the string has in WordNet.")
    public static final SubLObject pos_according_to_wn_alt(SubLObject string) {
        return NIL;
    }

    @LispMethod(comment = "Given STRING, return a list of pos keywords corresponding to the parts of speech the string has in WordNet.")
    public static SubLObject pos_according_to_wn(final SubLObject string) {
        return NIL;
    }/**
     * Given STRING, return a list of pos keywords corresponding to the parts of speech the string has in WordNet.
     */


    /**
     * Given a STRING, find a list of possible wnwords.
     * For each wnword, find corresponding Cyc-terms for it.
     * The PART-OF-SPEECH can be passed optionally.  It could be one of the following:
     * 1. :adverb
     * 2. :verb
     * 3. :adjective
     * 4. :noun
     * If a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.
     */
    @LispMethod(comment = "Given a STRING, find a list of possible wnwords.\r\nFor each wnword, find corresponding Cyc-terms for it.\r\nThe PART-OF-SPEECH can be passed optionally.  It could be one of the following:\r\n1. :adverb\r\n2. :verb\r\n3. :adjective\r\n4. :noun\r\nIf a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.\nGiven a STRING, find a list of possible wnwords.\nFor each wnword, find corresponding Cyc-terms for it.\nThe PART-OF-SPEECH can be passed optionally.  It could be one of the following:\n1. :adverb\n2. :verb\n3. :adjective\n4. :noun\nIf a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.")
    public static final SubLObject wn_direct_denots_of_string_alt(SubLObject string, SubLObject part_of_speech) {
        if (part_of_speech == UNPROVIDED) {
            part_of_speech = NIL;
        }
        return NIL;
    }

    @LispMethod(comment = "Given a STRING, find a list of possible wnwords.\r\nFor each wnword, find corresponding Cyc-terms for it.\r\nThe PART-OF-SPEECH can be passed optionally.  It could be one of the following:\r\n1. :adverb\r\n2. :verb\r\n3. :adjective\r\n4. :noun\r\nIf a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.\nGiven a STRING, find a list of possible wnwords.\nFor each wnword, find corresponding Cyc-terms for it.\nThe PART-OF-SPEECH can be passed optionally.  It could be one of the following:\n1. :adverb\n2. :verb\n3. :adjective\n4. :noun\nIf a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.")
    public static SubLObject wn_direct_denots_of_string(final SubLObject string, SubLObject part_of_speech) {
        if (part_of_speech == UNPROVIDED) {
            part_of_speech = NIL;
        }
        return NIL;
    }/**
     * Given a STRING, find a list of possible wnwords.
     * For each wnword, find corresponding Cyc-terms for it.
     * The PART-OF-SPEECH can be passed optionally.  It could be one of the following:
     * 1. :adverb
     * 2. :verb
     * 3. :adjective
     * 4. :noun
     * If a PART-OF-SPEECH is not passed, then iterate over all the above-mentioned values.
     */


    /**
     *
     *
     * @param STRINGP
     * 		e.g. bush
     * @param KEYWORDP
     * 		e.g. :noun
     * @return list of denotations, built up as follows:
    start with the @see denots-of-string&pos
    loop through each synset of term-string
    if the synset has a term, add it to the list to be returned
    otherwise, loop through each word of the synset (other than the original)
    get the @see denots-of-string&pos for that word
    loop through that word's synsets
    if none of them mention the denot, add it to the list to be returned
    if one mentions it, see whether the list of synonyms includes the original term
    if it does, add the denot to the list to be returned
    otherwise reject it
    Example: scrub has a synset which includes bush. bush has denots which presently
    include #$Bush and #$PubicHair. bush also has synsets which mention #$Bush
    and #$PubicHair as their terms. neither of these denots' synonym lists include
    scrub, so both are rejected.
     * @unknown when leveraging a synonym's denots, it's arguable that we shouldn't be crossing
    the #$GerundiveNoun line. for example, when bush is passed to this function,
    #$Scrubbing is one of the answers, since one synset is bush/scrub/chaparral.
    this is obviously bad in this case, but it's not clear we can justify throwing
    out all such matches
     * @unknown this algorithm doesn't, and can't, catch violations which Wordnet doesn't know
    about.  e.g., if the denots of bush mistakenly included #$Bush-MusicGroup, well,
    none of bush's synsets of #$Bush-MusicGroup as their term, so it's allowed to be
    added to the list, even though we observers know this to be wrong.
     * @unknown if wordnet doesn't know about term-string at all, this function will simply
    return the rests of denots-of-string&pos
     * @unknown twylie
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\te.g. bush\r\n@param KEYWORDP\r\n\t\te.g. :noun\r\n@return list of denotations, built up as follows:\r\nstart with the @see denots-of-string&pos\r\nloop through each synset of term-string\r\nif the synset has a term, add it to the list to be returned\r\notherwise, loop through each word of the synset (other than the original)\r\nget the @see denots-of-string&pos for that word\r\nloop through that word\'s synsets\r\nif none of them mention the denot, add it to the list to be returned\r\nif one mentions it, see whether the list of synonyms includes the original term\r\nif it does, add the denot to the list to be returned\r\notherwise reject it\r\nExample: scrub has a synset which includes bush. bush has denots which presently\r\ninclude #$Bush and #$PubicHair. bush also has synsets which mention #$Bush\r\nand #$PubicHair as their terms. neither of these denots\' synonym lists include\r\nscrub, so both are rejected.\r\n@unknown when leveraging a synonym\'s denots, it\'s arguable that we shouldn\'t be crossing\r\nthe #$GerundiveNoun line. for example, when bush is passed to this function,\r\n#$Scrubbing is one of the answers, since one synset is bush/scrub/chaparral.\r\nthis is obviously bad in this case, but it\'s not clear we can justify throwing\r\nout all such matches\r\n@unknown this algorithm doesn\'t, and can\'t, catch violations which Wordnet doesn\'t know\r\nabout.  e.g., if the denots of bush mistakenly included #$Bush-MusicGroup, well,\r\nnone of bush\'s synsets of #$Bush-MusicGroup as their term, so it\'s allowed to be\r\nadded to the list, even though we observers know this to be wrong.\r\n@unknown if wordnet doesn\'t know about term-string at all, this function will simply\r\nreturn the rests of denots-of-string&pos\r\n@unknown twylie")
    public static final SubLObject denots_of_stringXpos_with_synset_boosters_alt(SubLObject term_string, SubLObject pos) {
        return NIL;
    }

    /**
     *
     *
     * @param STRINGP
     * 		e.g. bush
     * @param KEYWORDP
     * 		e.g. :noun
     * @return list of denotations, built up as follows:
    start with the @see denots-of-string&pos
    loop through each synset of term-string
    if the synset has a term, add it to the list to be returned
    otherwise, loop through each word of the synset (other than the original)
    get the @see denots-of-string&pos for that word
    loop through that word's synsets
    if none of them mention the denot, add it to the list to be returned
    if one mentions it, see whether the list of synonyms includes the original term
    if it does, add the denot to the list to be returned
    otherwise reject it
    Example: scrub has a synset which includes bush. bush has denots which presently
    include #$Bush and #$PubicHair. bush also has synsets which mention #$Bush
    and #$PubicHair as their terms. neither of these denots' synonym lists include
    scrub, so both are rejected.
     * @unknown when leveraging a synonym's denots, it's arguable that we shouldn't be crossing
    the #$GerundiveNoun line. for example, when bush is passed to this function,
    #$Scrubbing is one of the answers, since one synset is bush/scrub/chaparral.
    this is obviously bad in this case, but it's not clear we can justify throwing
    out all such matches
     * @unknown this algorithm doesn't, and can't, catch violations which Wordnet doesn't know
    about.  e.g., if the denots of bush mistakenly included #$Bush-MusicGroup, well,
    none of bush's synsets of #$Bush-MusicGroup as their term, so it's allowed to be
    added to the list, even though we observers know this to be wrong.
     * @unknown if wordnet doesn't know about term-string at all, this function will simply
    return the rests of denots-of-string&pos
     * @unknown twylie
     */
    @LispMethod(comment = "@param STRINGP\r\n\t\te.g. bush\r\n@param KEYWORDP\r\n\t\te.g. :noun\r\n@return list of denotations, built up as follows:\r\nstart with the @see denots-of-string&pos\r\nloop through each synset of term-string\r\nif the synset has a term, add it to the list to be returned\r\notherwise, loop through each word of the synset (other than the original)\r\nget the @see denots-of-string&pos for that word\r\nloop through that word\'s synsets\r\nif none of them mention the denot, add it to the list to be returned\r\nif one mentions it, see whether the list of synonyms includes the original term\r\nif it does, add the denot to the list to be returned\r\notherwise reject it\r\nExample: scrub has a synset which includes bush. bush has denots which presently\r\ninclude #$Bush and #$PubicHair. bush also has synsets which mention #$Bush\r\nand #$PubicHair as their terms. neither of these denots\' synonym lists include\r\nscrub, so both are rejected.\r\n@unknown when leveraging a synonym\'s denots, it\'s arguable that we shouldn\'t be crossing\r\nthe #$GerundiveNoun line. for example, when bush is passed to this function,\r\n#$Scrubbing is one of the answers, since one synset is bush/scrub/chaparral.\r\nthis is obviously bad in this case, but it\'s not clear we can justify throwing\r\nout all such matches\r\n@unknown this algorithm doesn\'t, and can\'t, catch violations which Wordnet doesn\'t know\r\nabout.  e.g., if the denots of bush mistakenly included #$Bush-MusicGroup, well,\r\nnone of bush\'s synsets of #$Bush-MusicGroup as their term, so it\'s allowed to be\r\nadded to the list, even though we observers know this to be wrong.\r\n@unknown if wordnet doesn\'t know about term-string at all, this function will simply\r\nreturn the rests of denots-of-string&pos\r\n@unknown twylie")
    public static SubLObject denots_of_stringXpos_with_synset_boosters(final SubLObject term_string, final SubLObject pos) {
        return NIL;
    }

    public static final SubLObject load_wordnet_alt(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return NIL;
    }

    public static SubLObject load_wordnet(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return NIL;
    }

    public static SubLObject declare_wordnet_file() {
        declareFunction("initialize_wordnet_kb_feature", "INITIALIZE-WORDNET-KB-FEATURE", 0, 0, false);
        declareFunction("wordnet_word_p", "WORDNET-WORD-P", 2, 0, false);
        declareFunction("pos_according_to_wn", "POS-ACCORDING-TO-WN", 1, 0, false);
        declareFunction("wn_direct_denots_of_string", "WN-DIRECT-DENOTS-OF-STRING", 1, 1, false);
        declareFunction("denots_of_stringXpos_with_synset_boosters", "DENOTS-OF-STRING&POS-WITH-SYNSET-BOOSTERS", 2, 0, false);
        declareFunction("load_wordnet", "LOAD-WORDNET", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_wordnet_file() {
        deflexical("*WORDNET-CORE-CONSTANTS*", $list0);
        return NIL;
    }

    public static SubLObject setup_wordnet_file() {
        define_obsolete_register(LOAD_WORDNET, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wordnet_file();
    }

    @Override
    public void initializeVariables() {
        init_wordnet_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wordnet_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("synonymousExternalConcept"));
}

/**
 * Total time: 100 ms
 */

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-WORDNET-IMPORT-COMMENT
 * source file: /cyc/top/cycl/wordnet-import/cb-wordnet-import-comment.lisp
 * created:     2019/07/03 17:38:12
 */
public final class cb_wordnet_import_comment extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt65$ = makeString("");

    public static final SubLFile me = new cb_wordnet_import_comment();

 public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment";


    // defconstant
    // the comment textarea width
    /**
     * the comment textarea width
     */
    @LispMethod(comment = "the comment textarea width\ndefconstant")
    private static final SubLSymbol $wni_comment_textarea_width$ = makeSymbol("*WNI-COMMENT-TEXTAREA-WIDTH*");

    // defconstant
    // the comment textarea height
    /**
     * the comment textarea height
     */
    @LispMethod(comment = "the comment textarea height\ndefconstant")
    private static final SubLSymbol $wni_comment_textarea_height$ = makeSymbol("*WNI-COMMENT-TEXTAREA-HEIGHT*");

    static private final SubLString $str1$WordNet_Import___Comment = makeString("WordNet Import - Comment");

    private static final SubLSymbol WNI_CONCEPT_COMMENT = makeSymbol("WNI-CONCEPT-COMMENT");

    private static final SubLString $str9$synset_id = makeString("synset-id");

    private static final SubLString $str10$genl_terms = makeString("genl-terms");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $str12$workflow_alist = makeString("workflow-alist");

    private static final SubLString $$$comment = makeString("comment");

    private static final SubLString $$$finish = makeString("finish");

    private static final SubLString $str15$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    private static final SubLString $str16$in_workflow_ = makeString("in-workflow?");

    private static final SubLString $$$t = makeString("t");

    private static final SubLSymbol WNI_CONCEPT_COMMENT_INPUT = makeSymbol("WNI-CONCEPT-COMMENT-INPUT");

    private static final SubLSymbol WNI_CONCEPT_COMMENT_EXISTING_TERM = makeSymbol("WNI-CONCEPT-COMMENT-EXISTING-TERM");

    private static final SubLString $$$term = makeString("term");

    private static final SubLSymbol WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT = makeSymbol("WNI-CONCEPT-COMMENT-EXISTING-TERM-INPUT");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol $CB_WORDNET_IMPORT_CONCEPT_NAME = makeKeyword("CB-WORDNET-IMPORT-CONCEPT-NAME");

    private static final SubLString $str25$cb_wordnet_import_concept_name_ht = makeString("cb-wordnet-import-concept-name.html");

    private static final SubLString $$$Is_this_a_good_comment_for_ = makeString("Is this a good comment for ");

    private static final SubLString $str27$_ = makeString("?");

    private static final SubLString $str28$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str29$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str34$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str40$wni_concept_comment_input = makeString("wni-concept-comment-input");

    private static final SubLString $str41$_S = makeString("~S");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Continue_Workflow = makeString("Continue Workflow");

    private static final SubLString $$$next = makeString("next");

    private static final SubLString $$$Finish = makeString("Finish");

    private static final SubLString $$$Next_Workflow = makeString("Next Workflow");

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str48$__ = makeString("#$");

    private static final SubLString $str51$Is_this_a_good_comment_for_the_ex = makeString("Is this a good comment for the existing term ");



    private static final SubLString $str53$wni_concept_comment_existing_term = makeString("wni-concept-comment-existing-term-input");







    private static final SubLString $str57$A_sub_collection_of_ = makeString("A sub-collection of ");

    private static final SubLString $str58$___Each_instance_is_ = makeString(".  Each instance is ");

    private static final SubLString $str59$_ = makeString(".");

    private static final SubLString $$$An_instance_of_ = makeString("An instance of ");

    private static final SubLString $str61$__ = makeString(". ");

    private static final SubLString $$$any = makeString("any");

    private static final SubLString $$$any_ = makeString("any ");



    private static final SubLString $$$anything = makeString("anything");

    private static final SubLString $$$something = makeString("something");

    private static final SubLString $$$someone = makeString("someone");



    private static final SubLString $str69$A_collection_of_events__ = makeString("A collection of events; ");

    private static final SubLString $str70$A_collection_of_situations__ = makeString("A collection of situations; ");

    private static final SubLString $$$a_subcollection_of_ = makeString("a subcollection of ");

    private static final SubLString $$$to_ = makeString("to ");

    private static final SubLObject $$WNVerbFrame_8 = reader_make_constant_shell("WNVerbFrame-8");

    private static final SubLObject $$WNVerbFrame_2 = reader_make_constant_shell("WNVerbFrame-2");

    private static final SubLString $str75$ = makeString("");

    private static final SubLObject $$WNVerbFrame_1 = reader_make_constant_shell("WNVerbFrame-1");

    private static final SubLObject $$WNVerbFrame_9 = reader_make_constant_shell("WNVerbFrame-9");

    private static final SubLObject $$WNVerbFrame_11 = reader_make_constant_shell("WNVerbFrame-11");

    private static final SubLObject $$WNVerbFrame_22 = reader_make_constant_shell("WNVerbFrame-22");

    private static final SubLObject $$WNVerbFrame_4 = reader_make_constant_shell("WNVerbFrame-4");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $$$_with_respect_to_ = makeString(" with respect to ");

    private static final SubLString $str84$__of_ = makeString(", of ");

    private static final SubLString $str85$__as_of_ = makeString(", as of ");

    private static final SubLString $str86$_someone__of_ = makeString(" someone; of ");

    private static final SubLString $$$_they_are_ = makeString(" they are ");

    private static final SubLString $$$_one_is_ = makeString(" one is ");

    private static final SubLString $$$_their = makeString(" their");

    private static final SubLString $str90$_one_s = makeString(" one's");

    private static final SubLString $str91$_one_s_ = makeString(" one's ");

    private static final SubLString $$$_your_ = makeString(" your ");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $$$_ofs_ = makeString(" ofs ");

    private static final SubLString $$$theirself = makeString("theirself");

    private static final SubLString $$$oneself = makeString("oneself");

    private static final SubLString $$$_his_ = makeString(" his ");

    private static final SubLString $$$_be_ = makeString(" be ");

    private static final SubLString $$$_is_ = makeString(" is ");

    private static final SubLString $$$In_each_ = makeString("In each ");

    private static final SubLString $str101$__ = makeString(", ");

    private static final SubLString $str102$__ = makeString("; ");

    private static final SubLString $str103$_ = makeString(",");

    private static final SubLString $$$be = makeString("be");

    private static final SubLString $$$is = makeString("is");

    private static final SubLString $$$else = makeString("else");

    // Definitions
    /**
     * Retrieves data and formats the page for commenting the imported WordNet synset.
     *
     * @param args;
     * 		listp, of synset, genl-terms and name
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for commenting the imported WordNet synset.\r\n\r\n@param args;\r\n\t\tlistp, of synset, genl-terms and name\r\n@return nil")
    public static final SubLObject wni_concept_comment_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt1$WordNet_Import___Comment);
        } else {
            {
                SubLObject synset = args.first();
                SubLObject genl_terms = second(args);
                SubLObject name = third(args);
                SubLObject workflow_alist = fourth(args);
                SubLTrampolineFile.checkType(synset, NAUT_P);
                {
                    SubLObject list_var = genl_terms;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                SubLTrampolineFile.checkType(name, STRINGP);
                SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
                com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_concept_comment_internal(synset, genl_terms, name, workflow_alist);
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Retrieves data and formats the page for commenting the imported WordNet synset.
     *
     * @param args;
     * 		listp, of synset, genl-terms and name
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for commenting the imported WordNet synset.\r\n\r\n@param args;\r\n\t\tlistp, of synset, genl-terms and name\r\n@return nil")
    public static SubLObject wni_concept_comment(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str1$WordNet_Import___Comment);
        } else {
            final SubLObject synset = args.first();
            final SubLObject genl_terms = second(args);
            final SubLObject name = third(args);
            final SubLObject workflow_alist = fourth(args);
            assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
            final SubLObject list_var = genl_terms;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
            assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
            wni_concept_comment_internal(synset, genl_terms, name, workflow_alist);
        }
        return NIL;
    }

    /**
     * Handles user input from the web page that comments an imported WordNet synset.
     *
     * @param args;
     * 		comment field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that comments an imported WordNet synset.\r\n\r\n@param args;\r\n\t\tcomment field and the button selected\r\n@return nil")
    public static final SubLObject wni_concept_comment_input_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        {
            SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str_alt8$synset_id, args));
            SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str_alt9$genl_terms, args));
            SubLObject name = html_extract_input($$$name, args);
            SubLObject workflow_alist = read_from_string(html_extract_input($str_alt11$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject comment = html_extract_input($$$comment, args);
            SubLObject finishP = sublisp_boolean(html_extract_input($$$finish, args));
            SubLObject nowP = NIL;
            SubLObject v_term = NIL;
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject list_var = genl_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            SubLTrampolineFile.checkType(comment, STRINGP);
            v_term = cb_wordnet_utilities.wni_complete_after_comment(synset, genl_terms, name, workflow_alist, comment, nowP);
            if (NIL != finishP) {
                agenda.ensure_agenda_running();
                cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
            } else {
                {
                    SubLObject unmapped_hypernym_chain = alist_lookup(workflow_alist, $str_alt14$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
                    SubLObject in_workflowP = Strings.stringE(alist_lookup(workflow_alist, $str_alt15$in_workflow_, EQUAL, UNPROVIDED), $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != unmapped_hypernym_chain) {
                        cb_wordnet_import_concept_match.wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, in_workflowP));
                    } else {
                        if (NIL != in_workflowP) {
                            cb_wordnet_import_concept_match.wni_concept_match(UNPROVIDED);
                        } else {
                            agenda.ensure_agenda_running();
                            cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Handles user input from the web page that comments an imported WordNet synset.
     *
     * @param args;
     * 		comment field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that comments an imported WordNet synset.\r\n\r\n@param args;\r\n\t\tcomment field and the button selected\r\n@return nil")
    public static SubLObject wni_concept_comment_input(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str9$synset_id, args));
        final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str10$genl_terms, args));
        final SubLObject name = html_extract_input($$$name, args);
        final SubLObject workflow_alist = read_from_string(html_extract_input($str12$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject comment = html_extract_input($$$comment, args);
        final SubLObject finishP = list_utilities.sublisp_boolean(html_extract_input($$$finish, args));
        final SubLObject nowP = NIL;
        SubLObject v_term = NIL;
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        final SubLObject list_var = genl_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        v_term = cb_wordnet_utilities.wni_complete_after_comment(synset, genl_terms, name, workflow_alist, comment, nowP);
        if (NIL != finishP) {
            agenda.ensure_agenda_running();
            cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
        } else {
            final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup(workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
            final SubLObject in_workflowP = Strings.stringE(list_utilities.alist_lookup(workflow_alist, $str16$in_workflow_, EQUAL, UNPROVIDED), $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != unmapped_hypernym_chain) {
                cb_wordnet_import_concept_match.wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, in_workflowP));
            } else
                if (NIL != in_workflowP) {
                    cb_wordnet_import_concept_match.wni_concept_match(UNPROVIDED);
                } else {
                    agenda.ensure_agenda_running();
                    cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
                }

        }
        return NIL;
    }

    /**
     * Presents an imported WordNet comment for an existing Cyc term that lacks a comment.
     *
     * @param args;
    listp
     * 		
     * @return nil
     */
    @LispMethod(comment = "Presents an imported WordNet comment for an existing Cyc term that lacks a comment.\r\n\r\n@param args;\nlistp\r\n\t\t\r\n@return nil")
    public static final SubLObject wni_concept_comment_existing_term_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt1$WordNet_Import___Comment);
        } else {
            {
                SubLObject synset = args.first();
                SubLObject genl_terms = second(args);
                SubLObject v_term = third(args);
                SubLObject workflow_alist = fourth(args);
                SubLTrampolineFile.checkType(synset, NAUT_P);
                {
                    SubLObject list_var = genl_terms;
                    SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                    {
                        SubLObject cdolist_list_var = list_var;
                        SubLObject elem = NIL;
                        for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(elem, FORT_P);
                        }
                    }
                }
                SubLTrampolineFile.checkType(v_term, FORT_P);
                SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
                com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_concept_comment_existing_term_internal(synset, genl_terms, v_term, workflow_alist);
            }
        }
        return NIL;
    }

    /**
     * Presents an imported WordNet comment for an existing Cyc term that lacks a comment.
     *
     * @param args;
    		listp
     * 		
     * @return nil
     */
    @LispMethod(comment = "Presents an imported WordNet comment for an existing Cyc term that lacks a comment.\r\n\r\n@param args;\n\t\tlistp\r\n\t\t\r\n@return nil")
    public static SubLObject wni_concept_comment_existing_term(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str1$WordNet_Import___Comment);
        } else {
            final SubLObject synset = args.first();
            final SubLObject genl_terms = second(args);
            final SubLObject v_term = third(args);
            final SubLObject workflow_alist = fourth(args);
            assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
            final SubLObject list_var = genl_terms;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
            assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
            wni_concept_comment_existing_term_internal(synset, genl_terms, v_term, workflow_alist);
        }
        return NIL;
    }

    /**
     * Handles user input from the web page that comments a Cyc term that lacks a comment.
     *
     * @param args;
     * 		comment field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that comments a Cyc term that lacks a comment.\r\n\r\n@param args;\r\n\t\tcomment field and the button selected\r\n@return nil")
    public static final SubLObject wni_concept_comment_existing_term_input_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        {
            SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str_alt8$synset_id, args));
            SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str_alt9$genl_terms, args));
            SubLObject v_term = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($$$term, args)).first();
            SubLObject workflow_alist = read_from_string(html_extract_input($str_alt11$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject finishP = sublisp_boolean(html_extract_input($$$finish, args));
            SubLObject comment = html_extract_input($$$comment, args);
            SubLObject nowP = NIL;
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            SubLTrampolineFile.checkType(comment, STRINGP);
            SubLTrampolineFile.checkType(finishP, BOOLEANP);
            cb_wordnet_utilities.wni_complete_after_comment_existing_term(synset, genl_terms, v_term, workflow_alist, comment, nowP);
            if (NIL != finishP) {
                agenda.ensure_agenda_running();
                cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
            } else {
                {
                    SubLObject unmapped_hypernym_chain = alist_lookup(workflow_alist, $str_alt14$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
                    SubLObject in_workflowP = Strings.stringE(alist_lookup(workflow_alist, $str_alt15$in_workflow_, EQUAL, UNPROVIDED), $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != unmapped_hypernym_chain) {
                        cb_wordnet_import_concept_match.wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, in_workflowP));
                    } else {
                        cb_wordnet_import_concept_match.wni_concept_match(UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Handles user input from the web page that comments a Cyc term that lacks a comment.
     *
     * @param args;
     * 		comment field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that comments a Cyc term that lacks a comment.\r\n\r\n@param args;\r\n\t\tcomment field and the button selected\r\n@return nil")
    public static SubLObject wni_concept_comment_existing_term_input(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str9$synset_id, args));
        final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str10$genl_terms, args));
        final SubLObject v_term = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($$$term, args)).first();
        final SubLObject workflow_alist = read_from_string(html_extract_input($str12$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject finishP = list_utilities.sublisp_boolean(html_extract_input($$$finish, args));
        final SubLObject comment = html_extract_input($$$comment, args);
        final SubLObject nowP = NIL;
        final SubLObject list_var = genl_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        assert NIL != booleanp(finishP) : "! booleanp(finishP) " + ("Types.booleanp(finishP) " + "CommonSymbols.NIL != Types.booleanp(finishP) ") + finishP;
        cb_wordnet_utilities.wni_complete_after_comment_existing_term(synset, genl_terms, v_term, workflow_alist, comment, nowP);
        if (NIL != finishP) {
            agenda.ensure_agenda_running();
            cb_frames.cb_term_frame_internal(cb_term_identifier(v_term));
        } else {
            final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup(workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
            final SubLObject in_workflowP = Strings.stringE(list_utilities.alist_lookup(workflow_alist, $str16$in_workflow_, EQUAL, UNPROVIDED), $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != unmapped_hypernym_chain) {
                cb_wordnet_import_concept_match.wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, in_workflowP));
            } else {
                cb_wordnet_import_concept_match.wni_concept_match(UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Create the web page that comments the imported WordNet synset.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; listp of the synset's genls
     * @param name
     * 		; stringp, the name for the imported synset
     * @param workflow-alist
     * 		; alist-p
     */
    @LispMethod(comment = "Create the web page that comments the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; listp of the synset\'s genls\r\n@param name\r\n\t\t; stringp, the name for the imported synset\r\n@param workflow-alist\r\n\t\t; alist-p")
    public static final SubLObject wni_concept_comment_internal_alt(SubLObject synset, SubLObject genl_terms, SubLObject name, SubLObject workflow_alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject list_var = genl_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
            {
                SubLObject title = cconcatenate($str_alt25$Is_this_a_good_comment_for_, new SubLObject[]{ name, $str_alt26$_ });
                SubLObject title_var = title;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt29$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt30$wni_concept_comment_input, T, UNPROVIDED);
                                                    html_hidden_input($str_alt8$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                                                    html_hidden_input($str_alt9$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                                                    html_hidden_input($$$name, name, UNPROVIDED);
                                                    html_hidden_input($str_alt11$workflow_alist, format(NIL, $str_alt31$_S, workflow_alist), UNPROVIDED);
                                                    cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
                                                    html_indent(TWO_INTEGER);
                                                    html_script_utilities.html_clear_input_button($$$comment, $$$Clear);
                                                    html_indent(TWO_INTEGER);
                                                    if (NIL != alist_lookup(workflow_alist, $str_alt14$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
                                                        html_submit_input($$$Continue_Workflow, $$$next, UNPROVIDED);
                                                    } else {
                                                        html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Next_Workflow, $$$next, UNPROVIDED);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$comment);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != $wni_comment_textarea_width$.getGlobalValue()) {
                                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($wni_comment_textarea_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != $wni_comment_textarea_height$.getGlobalValue()) {
                                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($wni_comment_textarea_height$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$virtual);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_comment(synset, cconcatenate($str_alt38$__, name), genls.min_col(genl_terms, UNPROVIDED, UNPROVIDED)));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject cdolist_list_var = genl_terms;
                                                        SubLObject genl_term = NIL;
                                                        for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                                                            cb_wordnet_utilities.wni_html_termXcomment(genl_term, T);
                                                        }
                                                    }
                                                    cb_wordnet_utilities.wni_html_up_arrow(NIL != wordnet_import.wni_synset_collectionP(synset) ? ((SubLObject) ($GENLS)) : $ISA);
                                                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            agenda.ensure_agenda_running();
            return NIL;
        }
    }

    /**
     * Create the web page that comments the imported WordNet synset.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; listp of the synset's genls
     * @param name
     * 		; stringp, the name for the imported synset
     * @param workflow-alist
     * 		; alist-p
     */
    @LispMethod(comment = "Create the web page that comments the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; listp of the synset\'s genls\r\n@param name\r\n\t\t; stringp, the name for the imported synset\r\n@param workflow-alist\r\n\t\t; alist-p")
    public static SubLObject wni_concept_comment_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        final SubLObject title_var;
        final SubLObject title = title_var = cconcatenate($$$Is_this_a_good_comment_for_, new SubLObject[]{ name, $str27$_ });
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str29$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str34$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str40$wni_concept_comment_input, T, UNPROVIDED);
                            html_hidden_input($str9$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                            html_hidden_input($str10$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                            html_hidden_input($$$name, name, UNPROVIDED);
                            html_hidden_input($str12$workflow_alist, format(NIL, $str41$_S, workflow_alist), UNPROVIDED);
                            cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_script_utilities.html_clear_input_button($$$comment, $$$Clear, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            if (NIL != list_utilities.alist_lookup(workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
                                html_submit_input($$$Continue_Workflow, $$$next, UNPROVIDED);
                            } else {
                                html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Next_Workflow, $$$next, UNPROVIDED);
                            }
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$comment);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != $wni_comment_textarea_width$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_comment_textarea_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != $wni_comment_textarea_height$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_comment_textarea_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(wni_suggest_comment(synset, cconcatenate($str48$__, name), genls.min_col(genl_terms, UNPROVIDED, UNPROVIDED)));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            SubLObject cdolist_list_var2 = genl_terms;
                            SubLObject genl_term = NIL;
                            genl_term = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                cb_wordnet_utilities.wni_html_termXcomment(genl_term, T);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                genl_term = cdolist_list_var2.first();
                            } 
                            cb_wordnet_utilities.wni_html_up_arrow(NIL != wordnet_import.wni_synset_collectionP(synset) ? $GENLS : $ISA);
                            cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        agenda.ensure_agenda_running();
        return NIL;
    }

    /**
     * Create the web page that suggests a WordNet comment for a term that lacks a comment.
     *
     * @param synset
     * 		; naut-p
     * @param term
     * 		; fort-p
     */
    @LispMethod(comment = "Create the web page that suggests a WordNet comment for a term that lacks a comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param term\r\n\t\t; fort-p")
    public static final SubLObject wni_concept_comment_existing_term_internal_alt(SubLObject synset, SubLObject genl_terms, SubLObject v_term, SubLObject workflow_alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject list_var = genl_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject title = cconcatenate($str_alt41$Is_this_a_good_comment_for_the_ex, string_utilities.to_string(fort_el_formula(v_term)));
                SubLObject genl_term = genls.min_col(append(genl_terms, NIL != wordnet_import.wni_synset_collectionP(synset) ? ((SubLObject) (genls.genls(v_term, $$EverythingPSC, UNPROVIDED))) : isa.isa(v_term, $$EverythingPSC, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                SubLObject title_var = title;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt29$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt43$wni_concept_comment_existing_term, T, UNPROVIDED);
                                                    html_hidden_input($str_alt8$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                                                    html_hidden_input($str_alt9$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                                                    html_hidden_input($$$term, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(list(v_term)), UNPROVIDED);
                                                    html_hidden_input($str_alt11$workflow_alist, format(NIL, $str_alt31$_S, workflow_alist), UNPROVIDED);
                                                    cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
                                                    html_indent(TWO_INTEGER);
                                                    html_script_utilities.html_clear_input_button($$$comment, $$$Clear);
                                                    html_indent(TWO_INTEGER);
                                                    if (NIL != alist_lookup(workflow_alist, $str_alt14$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
                                                        html_submit_input($$$Continue_Workflow, $$$next, UNPROVIDED);
                                                    } else {
                                                        html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Next_Workflow, $$$next, UNPROVIDED);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$comment);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != $wni_comment_textarea_width$.getGlobalValue()) {
                                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($wni_comment_textarea_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != $wni_comment_textarea_height$.getGlobalValue()) {
                                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($wni_comment_textarea_height$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($$$virtual);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_comment(synset, string_utilities.to_string(fort_el_formula(v_term)), genl_term));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            agenda.ensure_agenda_running();
            return NIL;
        }
    }

    /**
     * Create the web page that suggests a WordNet comment for a term that lacks a comment.
     *
     * @param synset
     * 		; naut-p
     * @param term
     * 		; fort-p
     */
    @LispMethod(comment = "Create the web page that suggests a WordNet comment for a term that lacks a comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param term\r\n\t\t; fort-p")
    public static SubLObject wni_concept_comment_existing_term_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject title = cconcatenate($str51$Is_this_a_good_comment_for_the_ex, string_utilities.to_string(forts.fort_el_formula(v_term)));
        final SubLObject genl_term = genls.min_col(append(genl_terms, NIL != wordnet_import.wni_synset_collectionP(synset) ? genls.genls(v_term, $$EverythingPSC, UNPROVIDED) : isa.isa(v_term, $$EverythingPSC, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str29$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str34$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str53$wni_concept_comment_existing_term, T, UNPROVIDED);
                            html_hidden_input($str9$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                            html_hidden_input($str10$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                            html_hidden_input($$$term, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(list(v_term)), UNPROVIDED);
                            html_hidden_input($str12$workflow_alist, format(NIL, $str41$_S, workflow_alist), UNPROVIDED);
                            cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_script_utilities.html_clear_input_button($$$comment, $$$Clear, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            if (NIL != list_utilities.alist_lookup(workflow_alist, $str15$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
                                html_submit_input($$$Continue_Workflow, $$$next, UNPROVIDED);
                            } else {
                                html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Next_Workflow, $$$next, UNPROVIDED);
                            }
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$comment);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != $wni_comment_textarea_width$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_comment_textarea_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != $wni_comment_textarea_height$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_comment_textarea_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(wni_suggest_comment(synset, string_utilities.to_string(forts.fort_el_formula(v_term)), genl_term));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        agenda.ensure_agenda_running();
        return NIL;
    }

    /**
     * Returns a suggested comment for the given imported SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param name
     * 		; stringp
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param name\r\n\t\t; stringp\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static final SubLObject wni_suggest_comment_alt(SubLObject synset, SubLObject name, SubLObject genl_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        {
            SubLObject comment = NIL;
            SubLObject pos = wordnet_import.wni_synset_pos(synset);
            if (pos == $$Noun) {
                comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_noun_comment(synset, genl_term);
            } else {
                if (pos == $$Verb) {
                    comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_comment(synset, name, genl_term);
                } else {
                    if (pos == $$Adjective) {
                        comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_adjective_comment(synset, genl_term);
                    } else {
                        comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_adverb_comment(synset, genl_term);
                    }
                }
            }
            comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_common_comment_substitutions(comment);
            SubLTrampolineFile.checkType(comment, STRINGP);
            return comment;
        }
    }

    /**
     * Returns a suggested comment for the given imported SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param name
     * 		; stringp
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param name\r\n\t\t; stringp\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static SubLObject wni_suggest_comment(final SubLObject synset, final SubLObject name, final SubLObject genl_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        SubLObject comment = NIL;
        final SubLObject pos = wordnet_import.wni_synset_pos(synset);
        if (pos.eql($$Noun)) {
            comment = wni_suggest_noun_comment(synset, genl_term);
        } else
            if (pos.eql($$Verb)) {
                comment = wni_suggest_verb_comment(synset, name, genl_term);
            } else
                if (pos.eql($$Adjective)) {
                    comment = wni_suggest_adjective_comment(synset, genl_term);
                } else {
                    comment = wni_suggest_adverb_comment(synset, genl_term);
                }


        comment = wni_common_comment_substitutions(comment);
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns a suggested comment for the given imported noun SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported noun SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static final SubLObject wni_suggest_noun_comment_alt(SubLObject synset, SubLObject genl_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        {
            SubLObject comment = NIL;
            SubLObject gloss = wordnet_import.wni_synset_gloss(synset);
            comment = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? ((SubLObject) (cconcatenate($str_alt47$A_sub_collection_of_, new SubLObject[]{ string_utilities.to_string(fort_el_formula(genl_term)), $str_alt48$___Each_instance_is_, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_gloss_with_determiner(gloss), $str_alt49$_ }))) : cconcatenate($str_alt50$An_instance_of_, new SubLObject[]{ string_utilities.to_string(fort_el_formula(genl_term)), $str_alt51$__, string_utilities.capitalize_first(gloss), $str_alt49$_ });
            SubLTrampolineFile.checkType(comment, STRINGP);
            return comment;
        }
    }

    /**
     * Returns a suggested comment for the given imported noun SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported noun SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static SubLObject wni_suggest_noun_comment(final SubLObject synset, final SubLObject genl_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        SubLObject comment = NIL;
        final SubLObject gloss = wordnet_import.wni_synset_gloss(synset);
        comment = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? cconcatenate($str57$A_sub_collection_of_, new SubLObject[]{ string_utilities.to_string(forts.fort_el_formula(genl_term)), $str58$___Each_instance_is_, wni_gloss_with_determiner(gloss), $str59$_ }) : cconcatenate($$$An_instance_of_, new SubLObject[]{ string_utilities.to_string(forts.fort_el_formula(genl_term)), $str61$__, string_utilities.capitalize_first(gloss), $str59$_ });
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns the given GLOSS with an appropriate determiner if it is needed at the start of the gloss.
     */
    @LispMethod(comment = "Returns the given GLOSS with an appropriate determiner if it is needed at the start of the gloss.")
    public static final SubLObject wni_gloss_with_determiner_alt(SubLObject gloss) {
        SubLTrampolineFile.checkType(gloss, STRINGP);
        {
            SubLObject first_gloss_word = string_utilities.split_string(gloss, UNPROVIDED).first();
            if (NIL != Strings.stringE(first_gloss_word, $$$any, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return string_utilities.bunge(pph_utilities.add_determiner(string_utilities.pre_remove(gloss, $str_alt53$any_, UNPROVIDED)), UNPROVIDED);
            } else {
                if ((((NIL != lexicon_accessors.string_is_posP(first_gloss_word, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(first_gloss_word, $$$anything, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != Strings.stringE(first_gloss_word, $$$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != Strings.stringE(first_gloss_word, $$$someone, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    return gloss;
                } else {
                    return string_utilities.bunge(pph_utilities.add_determiner(gloss), UNPROVIDED);
                }
            }
        }
    }

    /**
     * Returns the given GLOSS with an appropriate determiner if it is needed at the start of the gloss.
     */
    @LispMethod(comment = "Returns the given GLOSS with an appropriate determiner if it is needed at the start of the gloss.")
    public static SubLObject wni_gloss_with_determiner(final SubLObject gloss) {
        assert NIL != stringp(gloss) : "! stringp(gloss) " + ("Types.stringp(gloss) " + "CommonSymbols.NIL != Types.stringp(gloss) ") + gloss;
        final SubLObject first_gloss_word = string_utilities.split_string(gloss, UNPROVIDED).first();
        if (NIL != Strings.stringE(first_gloss_word, $$$any, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.bunge(pph_utilities.add_determiner(string_utilities.pre_remove(gloss, $$$any_, UNPROVIDED)), UNPROVIDED);
        }
        if ((((NIL != lexicon_accessors.string_is_posP(first_gloss_word, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(first_gloss_word, $$$anything, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != Strings.stringE(first_gloss_word, $$$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != Strings.stringE(first_gloss_word, $$$someone, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return gloss;
        }
        return string_utilities.bunge(pph_utilities.add_determiner(gloss), UNPROVIDED);
    }

    /**
     * Returns a suggested comment for the given imported adjective SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported adjective SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static final SubLObject wni_suggest_adjective_comment_alt(SubLObject synset, SubLObject genl_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        {
            SubLObject comment = NIL;
            SubLObject gloss = wordnet_import.wni_synset_gloss(synset);
            comment = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? ((SubLObject) (cconcatenate($str_alt47$A_sub_collection_of_, new SubLObject[]{ string_utilities.to_string(fort_el_formula(genl_term)), $str_alt48$___Each_instance_is_, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_gloss_with_determiner(gloss), $str_alt49$_ }))) : cconcatenate($str_alt50$An_instance_of_, new SubLObject[]{ string_utilities.to_string(fort_el_formula(genl_term)), $str_alt51$__, string_utilities.capitalize_first(gloss), $str_alt49$_ });
            SubLTrampolineFile.checkType(comment, STRINGP);
            return comment;
        }
    }

    /**
     * Returns a suggested comment for the given imported adjective SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported adjective SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static SubLObject wni_suggest_adjective_comment(final SubLObject synset, final SubLObject genl_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        SubLObject comment = NIL;
        final SubLObject gloss = wordnet_import.wni_synset_gloss(synset);
        comment = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? cconcatenate($str57$A_sub_collection_of_, new SubLObject[]{ string_utilities.to_string(forts.fort_el_formula(genl_term)), $str58$___Each_instance_is_, wni_gloss_with_determiner(gloss), $str59$_ }) : cconcatenate($$$An_instance_of_, new SubLObject[]{ string_utilities.to_string(forts.fort_el_formula(genl_term)), $str61$__, string_utilities.capitalize_first(gloss), $str59$_ });
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns a suggested comment for the given imported verb SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param name
     * 		; stringp
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported verb SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param name\r\n\t\t; stringp\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static final SubLObject wni_suggest_verb_comment_alt(SubLObject synset, SubLObject name, SubLObject genl_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        {
            SubLObject comment = NIL;
            SubLObject first_phrase = (NIL != genls.genlP(genl_term, $$Event, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($str_alt59$A_collection_of_events__)) : $str_alt60$A_collection_of_situations__;
            SubLObject second_phrase = cconcatenate($str_alt61$a_subcollection_of_, new SubLObject[]{ string_utilities.to_string(fort_el_formula(genl_term)), $str_alt51$__ });
            SubLObject third_phrase = NIL;
            SubLObject gloss = string_utilities.strip_header(wordnet_import.wni_synset_gloss(synset), $str_alt62$to_);
            SubLObject verb_frame = wordnet_import.wni_most_general_synset_verb_frame(synset);
            SubLObject pcase_var = verb_frame;
            if (pcase_var.eql($$WNVerbFrame_8)) {
                third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$someone, $$$something);
            } else {
                if (pcase_var.eql($$WNVerbFrame_2)) {
                    third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$someone, $str_alt65$);
                } else {
                    if (pcase_var.eql($$WNVerbFrame_1)) {
                        third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$something, $str_alt65$);
                    } else {
                        if (pcase_var.eql($$WNVerbFrame_9)) {
                            third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$someone, $$$someone);
                        } else {
                            if (pcase_var.eql($$WNVerbFrame_11)) {
                                third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$something, $$$something);
                            } else {
                                if (pcase_var.eql($$WNVerbFrame_22)) {
                                    third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$someone, $str_alt65$);
                                } else {
                                    if (pcase_var.eql($$WNVerbFrame_4)) {
                                        third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$someone, $str_alt65$);
                                    } else {
                                        third_phrase = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_suggest_verb_frame(name, gloss, $$$something, $$$something);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            comment = cconcatenate(first_phrase, new SubLObject[]{ second_phrase, third_phrase, $str_alt49$_ });
            comment = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_verb_comment_substitutions(comment);
            SubLTrampolineFile.checkType(comment, STRINGP);
            return comment;
        }
    }

    /**
     * Returns a suggested comment for the given imported verb SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param name
     * 		; stringp
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported verb SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param name\r\n\t\t; stringp\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static SubLObject wni_suggest_verb_comment(final SubLObject synset, final SubLObject name, final SubLObject genl_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        SubLObject comment = NIL;
        final SubLObject first_phrase = (NIL != genls.genlP(genl_term, $$Event, UNPROVIDED, UNPROVIDED)) ? $str69$A_collection_of_events__ : $str70$A_collection_of_situations__;
        final SubLObject second_phrase = cconcatenate($$$a_subcollection_of_, new SubLObject[]{ string_utilities.to_string(forts.fort_el_formula(genl_term)), $str61$__ });
        SubLObject third_phrase = NIL;
        final SubLObject gloss = string_utilities.strip_header(wordnet_import.wni_synset_gloss(synset), $$$to_);
        final SubLObject pcase_var;
        final SubLObject verb_frame = pcase_var = wordnet_import.wni_most_general_synset_verb_frame(synset);
        if (pcase_var.eql($$WNVerbFrame_8)) {
            third_phrase = wni_suggest_verb_frame(name, gloss, $$$someone, $$$something);
        } else
            if (pcase_var.eql($$WNVerbFrame_2)) {
                third_phrase = wni_suggest_verb_frame(name, gloss, $$$someone, $str75$);
            } else
                if (pcase_var.eql($$WNVerbFrame_1)) {
                    third_phrase = wni_suggest_verb_frame(name, gloss, $$$something, $str75$);
                } else
                    if (pcase_var.eql($$WNVerbFrame_9)) {
                        third_phrase = wni_suggest_verb_frame(name, gloss, $$$someone, $$$someone);
                    } else
                        if (pcase_var.eql($$WNVerbFrame_11)) {
                            third_phrase = wni_suggest_verb_frame(name, gloss, $$$something, $$$something);
                        } else
                            if (pcase_var.eql($$WNVerbFrame_22)) {
                                third_phrase = wni_suggest_verb_frame(name, gloss, $$$someone, $str75$);
                            } else
                                if (pcase_var.eql($$WNVerbFrame_4)) {
                                    third_phrase = wni_suggest_verb_frame(name, gloss, $$$someone, $str75$);
                                } else {
                                    third_phrase = wni_suggest_verb_frame(name, gloss, $$$something, $$$something);
                                }






        comment = cconcatenate(first_phrase, new SubLObject[]{ second_phrase, third_phrase, $str59$_ });
        comment = wni_verb_comment_substitutions(comment);
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns the COMMENT after performing common string substitutions.
     *
     * @param comment
     * 		; stringp, the comment
     * @return stringp
     */
    @LispMethod(comment = "Returns the COMMENT after performing common string substitutions.\r\n\r\n@param comment\r\n\t\t; stringp, the comment\r\n@return stringp")
    public static final SubLObject wni_common_comment_substitutions_alt(SubLObject comment) {
        SubLTrampolineFile.checkType(comment, STRINGP);
        comment = string_utilities.string_substitute($str_alt71$_, $str_alt72$__, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt73$_with_respect_to_, $str_alt74$__of_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt73$_with_respect_to_, $str_alt75$__as_of_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt71$_, $str_alt76$_someone__of_, comment, UNPROVIDED);
        SubLTrampolineFile.checkType(comment, STRINGP);
        return comment;
    }

    /**
     * Returns the COMMENT after performing common string substitutions.
     *
     * @param comment
     * 		; stringp, the comment
     * @return stringp
     */
    @LispMethod(comment = "Returns the COMMENT after performing common string substitutions.\r\n\r\n@param comment\r\n\t\t; stringp, the comment\r\n@return stringp")
    public static SubLObject wni_common_comment_substitutions(SubLObject comment) {
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        comment = string_utilities.string_substitute($$$_, $$$__, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_with_respect_to_, $str84$__of_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_with_respect_to_, $str85$__as_of_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_, $str86$_someone__of_, comment, UNPROVIDED);
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns the COMMENT after performing verb-specific string substitutions.
     *
     * @param comment
     * 		; stringp, the comment
     * @return stringp
     */
    @LispMethod(comment = "Returns the COMMENT after performing verb-specific string substitutions.\r\n\r\n@param comment\r\n\t\t; stringp, the comment\r\n@return stringp")
    public static final SubLObject wni_verb_comment_substitutions_alt(SubLObject comment) {
        SubLTrampolineFile.checkType(comment, STRINGP);
        comment = string_utilities.string_substitute($str_alt77$_they_are_, $str_alt78$_one_is_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt79$_their, $str_alt80$_one_s, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt81$_one_s_, $str_alt82$_your_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt83$_of_, $str_alt84$_ofs_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$theirself, $$$oneself, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt79$_their, $str_alt87$_his_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str_alt88$_be_, $str_alt89$_is_, comment, UNPROVIDED);
        SubLTrampolineFile.checkType(comment, STRINGP);
        return comment;
    }

    /**
     * Returns the COMMENT after performing verb-specific string substitutions.
     *
     * @param comment
     * 		; stringp, the comment
     * @return stringp
     */
    @LispMethod(comment = "Returns the COMMENT after performing verb-specific string substitutions.\r\n\r\n@param comment\r\n\t\t; stringp, the comment\r\n@return stringp")
    public static SubLObject wni_verb_comment_substitutions(SubLObject comment) {
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        comment = string_utilities.string_substitute($$$_they_are_, $$$_one_is_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_their, $str90$_one_s, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($str91$_one_s_, $$$_your_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_of_, $$$_ofs_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$theirself, $$$oneself, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_their, $$$_his_, comment, UNPROVIDED);
        comment = string_utilities.string_substitute($$$_be_, $$$_is_, comment, UNPROVIDED);
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    /**
     * Returns a suggested comment phrase for the given GLOSS and term NAME having the verb frame: SUBJECT ----s OBJECT.
     *
     * @param name
     * 		; stringp
     * @param gloss
     * 		; stringp
     * @param subject
     * 		; stringp
     * @param object
     * 		; stringp
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment phrase for the given GLOSS and term NAME having the verb frame: SUBJECT ----s OBJECT.\r\n\r\n@param name\r\n\t\t; stringp\r\n@param gloss\r\n\t\t; stringp\r\n@param subject\r\n\t\t; stringp\r\n@param object\r\n\t\t; stringp\r\n@return stringp")
    public static final SubLObject wni_suggest_verb_frame_alt(SubLObject name, SubLObject gloss, SubLObject subject, SubLObject v_object) {
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(gloss, STRINGP);
        SubLTrampolineFile.checkType(subject, STRINGP);
        SubLTrampolineFile.checkType(v_object, STRINGP);
        {
            SubLObject phrase = NIL;
            phrase = cconcatenate($str_alt90$In_each_, new SubLObject[]{ name, $str_alt91$__, subject, $str_alt71$_, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_pluralize(gloss, v_object, Strings.stringE(subject, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) });
            SubLTrampolineFile.checkType(phrase, STRINGP);
            return phrase;
        }
    }

    /**
     * Returns a suggested comment phrase for the given GLOSS and term NAME having the verb frame: SUBJECT ----s OBJECT.
     *
     * @param name
     * 		; stringp
     * @param gloss
     * 		; stringp
     * @param subject
     * 		; stringp
     * @param object
     * 		; stringp
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment phrase for the given GLOSS and term NAME having the verb frame: SUBJECT ----s OBJECT.\r\n\r\n@param name\r\n\t\t; stringp\r\n@param gloss\r\n\t\t; stringp\r\n@param subject\r\n\t\t; stringp\r\n@param object\r\n\t\t; stringp\r\n@return stringp")
    public static SubLObject wni_suggest_verb_frame(final SubLObject name, final SubLObject gloss, final SubLObject subject, final SubLObject v_object) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(gloss) : "! stringp(gloss) " + ("Types.stringp(gloss) " + "CommonSymbols.NIL != Types.stringp(gloss) ") + gloss;
        assert NIL != stringp(subject) : "! stringp(subject) " + ("Types.stringp(subject) " + "CommonSymbols.NIL != Types.stringp(subject) ") + subject;
        assert NIL != stringp(v_object) : "! stringp(v_object) " + "Types.stringp error :" + v_object;
        SubLObject phrase = NIL;
        phrase = cconcatenate($$$In_each_, new SubLObject[]{ name, $str101$__, subject, $$$_, wni_pluralize(gloss, v_object, Strings.stringE(subject, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) });
        assert NIL != stringp(phrase) : "! stringp(phrase) " + ("Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) ") + phrase;
        return phrase;
    }

    /**
     * Returns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD
     * if the gloss ends in a preposition.
     *
     * @param gloss
     * 		; stringp
     * @param suffix-word
     * 		; stringp
     * @param else-word?
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD\r\nif the gloss ends in a preposition.\r\n\r\n@param gloss\r\n\t\t; stringp\r\n@param suffix-word\r\n\t\t; stringp\r\n@param else-word?\r\n\t\t\r\n@return stringp\nReturns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD\nif the gloss ends in a preposition.")
    public static final SubLObject wni_pluralize_alt(SubLObject gloss, SubLObject suffix_word, SubLObject else_wordP) {
        if (suffix_word == UNPROVIDED) {
            suffix_word = NIL;
        }
        if (else_wordP == UNPROVIDED) {
            else_wordP = NIL;
        }
        SubLTrampolineFile.checkType(gloss, STRINGP);
        if (NIL != suffix_word) {
            SubLTrampolineFile.checkType(suffix_word, STRINGP);
        }
        {
            SubLObject phrase = NIL;
            SubLObject semicolon_index = string_utilities.char_position(CHAR_semicolon, gloss, UNPROVIDED);
            if (NIL != semicolon_index) {
                phrase = cconcatenate(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_pluralize(subseq(gloss, ZERO_INTEGER, semicolon_index), suffix_word, UNPROVIDED), new SubLObject[]{ $str_alt92$__, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_comment.wni_pluralize(string_utilities.left_trim_whitespace(subseq(gloss, add(semicolon_index, ONE_INTEGER), UNPROVIDED)), suffix_word, UNPROVIDED) });
            } else {
                {
                    SubLObject words = string_utilities.split_string(gloss, UNPROVIDED);
                    SubLObject first_word = words.first();
                    SubLObject last_word = last_one(words);
                    rplaca(words, NIL != string_utilities.ends_with(first_word, $str_alt93$_, UNPROVIDED) ? ((SubLObject) (cconcatenate(morphology.infinitive_to_third_sing(string_utilities.post_remove(first_word, $str_alt93$_, UNPROVIDED)), $str_alt93$_))) : NIL != Strings.stringE(first_word, $$$be, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) ($$$is)) : morphology.infinitive_to_third_sing(first_word));
                    if (NIL != suffix_word) {
                        if (NIL != lexicon_accessors.preposition_stringP(last_word, UNPROVIDED)) {
                            nadd_to_end(suffix_word, words);
                        } else {
                            if (length(words).numG(ONE_INTEGER) && (NIL != lexicon_accessors.preposition_stringP(second(words), UNPROVIDED))) {
                                words = (NIL != else_wordP) ? ((SubLObject) (append(list(words.first(), suffix_word, $$$else), words.rest()))) : append(list(words.first(), suffix_word), words.rest());
                            }
                        }
                        phrase = string_utilities.bunge(words, UNPROVIDED);
                    }
                }
            }
            SubLTrampolineFile.checkType(phrase, STRINGP);
            return phrase;
        }
    }

    /**
     * Returns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD
     * if the gloss ends in a preposition.
     *
     * @param gloss
     * 		; stringp
     * @param suffix-word
     * 		; stringp
     * @param else-word?
     * 		
     * @return stringp
     */
    @LispMethod(comment = "Returns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD\r\nif the gloss ends in a preposition.\r\n\r\n@param gloss\r\n\t\t; stringp\r\n@param suffix-word\r\n\t\t; stringp\r\n@param else-word?\r\n\t\t\r\n@return stringp\nReturns a pluralized phrase by changing the first GLOSS word to a plural form, and appends the SUFFIX-WORD\nif the gloss ends in a preposition.")
    public static SubLObject wni_pluralize(final SubLObject gloss, SubLObject suffix_word, SubLObject else_wordP) {
        if (suffix_word == UNPROVIDED) {
            suffix_word = NIL;
        }
        if (else_wordP == UNPROVIDED) {
            else_wordP = NIL;
        }
        assert NIL != stringp(gloss) : "! stringp(gloss) " + ("Types.stringp(gloss) " + "CommonSymbols.NIL != Types.stringp(gloss) ") + gloss;
        if (((NIL != suffix_word) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(suffix_word))) {
            throw new AssertionError(suffix_word);
        }
        SubLObject phrase = NIL;
        final SubLObject semicolon_index = string_utilities.char_position(CHAR_semicolon, gloss, UNPROVIDED);
        if (NIL != semicolon_index) {
            phrase = cconcatenate(wni_pluralize(subseq(gloss, ZERO_INTEGER, semicolon_index), suffix_word, UNPROVIDED), new SubLObject[]{ $str102$__, wni_pluralize(string_utilities.left_trim_whitespace(subseq(gloss, add(semicolon_index, ONE_INTEGER), UNPROVIDED)), suffix_word, UNPROVIDED) });
        } else {
            SubLObject words = string_utilities.split_string(gloss, UNPROVIDED);
            final SubLObject first_word = words.first();
            final SubLObject last_word = list_utilities.last_one(words);
            rplaca(words, NIL != string_utilities.ends_with(first_word, $str103$_, UNPROVIDED) ? cconcatenate(morphology.infinitive_to_third_sing(string_utilities.post_remove(first_word, $str103$_, UNPROVIDED)), $str103$_) : NIL != Strings.stringE(first_word, $$$be, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? $$$is : morphology.infinitive_to_third_sing(first_word));
            if (NIL != suffix_word) {
                if (NIL != lexicon_accessors.preposition_stringP(last_word, UNPROVIDED)) {
                    list_utilities.nadd_to_end(suffix_word, words);
                } else
                    if (length(words).numG(ONE_INTEGER) && (NIL != lexicon_accessors.preposition_stringP(second(words), UNPROVIDED))) {
                        words = (NIL != else_wordP) ? append(list(words.first(), suffix_word, $$$else), words.rest()) : append(list(words.first(), suffix_word), words.rest());
                    }

                phrase = string_utilities.bunge(words, UNPROVIDED);
            }
        }
        assert NIL != stringp(phrase) : "! stringp(phrase) " + ("Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) ") + phrase;
        return phrase;
    }

    static private final SubLString $str_alt1$WordNet_Import___Comment = makeString("WordNet Import - Comment");

    static private final SubLString $str_alt8$synset_id = makeString("synset-id");

    static private final SubLString $str_alt9$genl_terms = makeString("genl-terms");

    static private final SubLString $str_alt11$workflow_alist = makeString("workflow-alist");

    static private final SubLString $str_alt14$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    static private final SubLString $str_alt15$in_workflow_ = makeString("in-workflow?");

    /**
     * Returns a suggested comment for the given imported adverb SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported adverb SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static final SubLObject wni_suggest_adverb_comment_alt(SubLObject synset, SubLObject genl_term) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(genl_term, FORT_P);
        {
            SubLObject comment = NIL;
            SubLObject gloss = wordnet_import.wni_synset_gloss(synset);
            comment = gloss;
            SubLTrampolineFile.checkType(comment, STRINGP);
            return comment;
        }
    }

    /**
     * Returns a suggested comment for the given imported adverb SYNSET based upon its gloss.
     *
     * @param synset
     * 		; naut-p
     * @param genl-term
     * 		; fort-p
     * @return stringp
     */
    @LispMethod(comment = "Returns a suggested comment for the given imported adverb SYNSET based upon its gloss.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-term\r\n\t\t; fort-p\r\n@return stringp")
    public static SubLObject wni_suggest_adverb_comment(final SubLObject synset, final SubLObject genl_term) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(genl_term) : "! forts.fort_p(genl_term) " + ("forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) ") + genl_term;
        SubLObject comment = NIL;
        final SubLObject gloss = comment = wordnet_import.wni_synset_gloss(synset);
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        return comment;
    }

    public static SubLObject declare_cb_wordnet_import_comment_file() {
        declareFunction("wni_concept_comment", "WNI-CONCEPT-COMMENT", 1, 0, false);
        declareFunction("wni_concept_comment_input", "WNI-CONCEPT-COMMENT-INPUT", 1, 0, false);
        declareFunction("wni_concept_comment_existing_term", "WNI-CONCEPT-COMMENT-EXISTING-TERM", 1, 0, false);
        declareFunction("wni_concept_comment_existing_term_input", "WNI-CONCEPT-COMMENT-EXISTING-TERM-INPUT", 1, 0, false);
        declareFunction("wni_concept_comment_internal", "WNI-CONCEPT-COMMENT-INTERNAL", 4, 0, false);
        declareFunction("wni_concept_comment_existing_term_internal", "WNI-CONCEPT-COMMENT-EXISTING-TERM-INTERNAL", 4, 0, false);
        declareFunction("wni_suggest_comment", "WNI-SUGGEST-COMMENT", 3, 0, false);
        declareFunction("wni_suggest_noun_comment", "WNI-SUGGEST-NOUN-COMMENT", 2, 0, false);
        declareFunction("wni_gloss_with_determiner", "WNI-GLOSS-WITH-DETERMINER", 1, 0, false);
        declareFunction("wni_suggest_adjective_comment", "WNI-SUGGEST-ADJECTIVE-COMMENT", 2, 0, false);
        declareFunction("wni_suggest_verb_comment", "WNI-SUGGEST-VERB-COMMENT", 3, 0, false);
        declareFunction("wni_common_comment_substitutions", "WNI-COMMON-COMMENT-SUBSTITUTIONS", 1, 0, false);
        declareFunction("wni_verb_comment_substitutions", "WNI-VERB-COMMENT-SUBSTITUTIONS", 1, 0, false);
        declareFunction("wni_suggest_verb_frame", "WNI-SUGGEST-VERB-FRAME", 4, 0, false);
        declareFunction("wni_pluralize", "WNI-PLURALIZE", 1, 2, false);
        declareFunction("wni_suggest_adverb_comment", "WNI-SUGGEST-ADVERB-COMMENT", 2, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt24$cb_wordnet_import_concept_name_ht = makeString("cb-wordnet-import-concept-name.html");

    static private final SubLString $str_alt25$Is_this_a_good_comment_for_ = makeString("Is this a good comment for ");

    static private final SubLString $str_alt26$_ = makeString("?");

    static private final SubLString $str_alt28$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt29$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt30$wni_concept_comment_input = makeString("wni-concept-comment-input");

    static private final SubLString $str_alt31$_S = makeString("~S");

    static private final SubLString $str_alt38$__ = makeString("#$");

    static private final SubLString $str_alt41$Is_this_a_good_comment_for_the_ex = makeString("Is this a good comment for the existing term ");

    static private final SubLString $str_alt43$wni_concept_comment_existing_term = makeString("wni-concept-comment-existing-term-input");

    public static SubLObject init_cb_wordnet_import_comment_file() {
        defconstant("*WNI-COMMENT-TEXTAREA-WIDTH*", $int$80);
        defconstant("*WNI-COMMENT-TEXTAREA-HEIGHT*", FIVE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_cb_wordnet_import_comment_file_alt() {
        html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT);
        html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_INPUT);
        html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM);
        html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT);
        sethash($CB_WORDNET_IMPORT_CONCEPT_NAME, $cb_help_definitions$.getGlobalValue(), list($str_alt24$cb_wordnet_import_concept_name_ht, NIL));
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_comment_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_INPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT, $HTML_HANDLER);
            sethash($CB_WORDNET_IMPORT_CONCEPT_NAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str25$cb_wordnet_import_concept_name_ht, NIL));
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT);
            html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_INPUT);
            html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM);
            html_macros.note_html_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT);
            sethash($CB_WORDNET_IMPORT_CONCEPT_NAME, $cb_help_definitions$.getGlobalValue(), list($str_alt24$cb_wordnet_import_concept_name_ht, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_comment_file_Previous() {
        html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_INPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_CONCEPT_COMMENT_EXISTING_TERM_INPUT, $HTML_HANDLER);
        sethash($CB_WORDNET_IMPORT_CONCEPT_NAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str25$cb_wordnet_import_concept_name_ht, NIL));
        return NIL;
    }

    static private final SubLString $str_alt47$A_sub_collection_of_ = makeString("A sub-collection of ");

    static private final SubLString $str_alt48$___Each_instance_is_ = makeString(".  Each instance is ");

    static private final SubLString $str_alt49$_ = makeString(".");

    static private final SubLString $str_alt50$An_instance_of_ = makeString("An instance of ");

    static private final SubLString $str_alt51$__ = makeString(". ");

    static private final SubLString $str_alt53$any_ = makeString("any ");

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_import_comment_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_import_comment_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_import_comment_file();
    }

    static {
    }

    static private final SubLString $str_alt59$A_collection_of_events__ = makeString("A collection of events; ");

    static private final SubLString $str_alt60$A_collection_of_situations__ = makeString("A collection of situations; ");

    static private final SubLString $str_alt61$a_subcollection_of_ = makeString("a subcollection of ");

    static private final SubLString $str_alt62$to_ = makeString("to ");

    static private final SubLString $str_alt71$_ = makeString(" ");

    static private final SubLString $str_alt72$__ = makeString("  ");

    static private final SubLString $str_alt73$_with_respect_to_ = makeString(" with respect to ");

    static private final SubLString $str_alt74$__of_ = makeString(", of ");

    static private final SubLString $str_alt75$__as_of_ = makeString(", as of ");

    static private final SubLString $str_alt76$_someone__of_ = makeString(" someone; of ");

    static private final SubLString $str_alt77$_they_are_ = makeString(" they are ");

    static private final SubLString $str_alt78$_one_is_ = makeString(" one is ");

    static private final SubLString $str_alt79$_their = makeString(" their");

    static private final SubLString $str_alt80$_one_s = makeString(" one's");

    static private final SubLString $str_alt81$_one_s_ = makeString(" one's ");

    static private final SubLString $str_alt82$_your_ = makeString(" your ");

    static private final SubLString $str_alt83$_of_ = makeString(" of ");

    static private final SubLString $str_alt84$_ofs_ = makeString(" ofs ");

    static private final SubLString $str_alt87$_his_ = makeString(" his ");

    static private final SubLString $str_alt88$_be_ = makeString(" be ");

    static private final SubLString $str_alt89$_is_ = makeString(" is ");

    static private final SubLString $str_alt90$In_each_ = makeString("In each ");

    static private final SubLString $str_alt91$__ = makeString(", ");

    static private final SubLString $str_alt92$__ = makeString("; ");

    static private final SubLString $str_alt93$_ = makeString(",");
}

/**
 * Total time: 415 ms synthetic
 */

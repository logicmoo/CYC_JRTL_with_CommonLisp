package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_preference_module_generation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_preference_module_generation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_preference_module_generation";

    public static final String myFingerPrint = "b33d5788c1a2b19abe39b757d7eb76c3929e0de2cd2a7cd0712acfe8f138fc48";



    // Internal Constants
    public static final SubLSymbol $sks_preference_modules_cache$ = makeSymbol("*SKS-PREFERENCE-MODULES-CACHE*");













    public static final SubLString $str7$sksi_preference_module_ = makeString("sksi-preference-module-");

    public static SubLObject note_sks_preference_module(final SubLObject sks, final SubLObject pref_mod) {
        return dictionary_utilities.dictionary_push($sks_preference_modules_cache$.getGlobalValue(), sks, pref_mod);
    }

    public static SubLObject unnote_sks_preference_modules(final SubLObject sks) {
        return dictionary.dictionary_remove($sks_preference_modules_cache$.getGlobalValue(), sks);
    }

    public static SubLObject sksi_preference_modules_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sks_preference_modules_cache$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pref_mods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            count = add(count, length(pref_mods));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }

    public static SubLObject register_sksi_preference_module_for_sks(final SubLObject sks, final SubLObject required_pattern, final SubLObject sense, final SubLObject pred, final SubLObject pred_list, final SubLObject mt, final SubLObject preference_level) {
        final SubLObject name = sksi_make_preference_module_name(required_pattern, sense);
        SubLObject plist = list($SENSE, sense, $REQUIRED_MT, mt, $REQUIRED_PATTERN, required_pattern, $PREFERENCE_LEVEL, preference_level);
        SubLObject pref_mod = NIL;
        if (NIL != pred) {
            plist = putf(plist, $PREDICATE, pred);
        } else {
            plist = putf(plist, $ANY_PREDICATES, pred_list);
        }
        pref_mod = preference_modules.inference_preference_module(name, plist);
        note_sks_preference_module(sks, pref_mod);
        return pref_mod;
    }

    public static SubLObject sksi_make_preference_module_name(final SubLObject required_pattern, final SubLObject sense) {
        SubLObject doc_string = sksi_removal_module_generation.sksi_make_documentation_string_from_required_pattern_and_sense(required_pattern, sense);
        doc_string = Strings.string_downcase(doc_string, UNPROVIDED, UNPROVIDED);
        doc_string = cconcatenate($str7$sksi_preference_module_, doc_string);
        return removal_module_utilities.determine_hl_module_name(doc_string, sense);
    }

    public static SubLObject deregister_sksi_preference_modules_for_sks(final SubLObject sks) {
        SubLObject cdolist_list_var;
        final SubLObject sks_pref_mods = cdolist_list_var = dictionary.dictionary_lookup($sks_preference_modules_cache$.getGlobalValue(), sks, UNPROVIDED);
        SubLObject pref_mod = NIL;
        pref_mod = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            preference_modules.deregister_preference_module(pref_mod);
            cdolist_list_var = cdolist_list_var.rest();
            pref_mod = cdolist_list_var.first();
        } 
        unnote_sks_preference_modules(sks);
        return length(sks_pref_mods);
    }

    public static SubLObject deregister_all_sksi_preference_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sks_preference_modules_cache$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sks_pref_mods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = sks_pref_mods;
            SubLObject pref_mod = NIL;
            pref_mod = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                preference_modules.deregister_preference_module(pref_mod);
                cdolist_list_var = cdolist_list_var.rest();
                pref_mod = cdolist_list_var.first();
            } 
            count = add(count, length(sks_pref_mods));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary($sks_preference_modules_cache$.getGlobalValue());
        return count;
    }

    public static SubLObject declare_sksi_preference_module_generation_file() {
        declareFunction(me, "note_sks_preference_module", "NOTE-SKS-PREFERENCE-MODULE", 2, 0, false);
        declareFunction(me, "unnote_sks_preference_modules", "UNNOTE-SKS-PREFERENCE-MODULES", 1, 0, false);
        declareFunction(me, "sksi_preference_modules_count", "SKSI-PREFERENCE-MODULES-COUNT", 0, 0, false);
        declareFunction(me, "register_sksi_preference_module_for_sks", "REGISTER-SKSI-PREFERENCE-MODULE-FOR-SKS", 7, 0, false);
        declareFunction(me, "sksi_make_preference_module_name", "SKSI-MAKE-PREFERENCE-MODULE-NAME", 2, 0, false);
        declareFunction(me, "deregister_sksi_preference_modules_for_sks", "DEREGISTER-SKSI-PREFERENCE-MODULES-FOR-SKS", 1, 0, false);
        declareFunction(me, "deregister_all_sksi_preference_modules", "DEREGISTER-ALL-SKSI-PREFERENCE-MODULES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_preference_module_generation_file() {
        deflexical("*SKS-PREFERENCE-MODULES-CACHE*", SubLSystemTrampolineFile.maybeDefault($sks_preference_modules_cache$, $sks_preference_modules_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_sksi_preference_module_generation_file() {
        declare_defglobal($sks_preference_modules_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_preference_module_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_preference_module_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_preference_module_generation_file();
    }

    
}

/**
 * Total time: 79 ms
 */

package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.file_vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_link_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities";
    public static final String myFingerPrint = "8aa4117758636a57f4773a106e5bed23d28a6c54e8e7d17e54daf783bf038100";
    private static final SubLString $str0$Direction__a__Mt__a__Tv__a___a__;
    private static final SubLSymbol $sym1$SBHL_MODULE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 934L)
    public static SubLObject print_sbhl_direction_link(final SubLObject node, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (sbhl_link_utilities.NIL != d_link) {
            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
            SubLObject direction = (SubLObject)sbhl_link_utilities.NIL;
            direction = cdolist_list_var.first();
            while (sbhl_link_utilities.NIL != cdolist_list_var) {
                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if (sbhl_link_utilities.NIL != mt_links) {
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_link_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject tv_links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject iteration_state_$1;
                        for (iteration_state_$1 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_link_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$1); iteration_state_$1 = dictionary_contents.do_dictionary_contents_next(iteration_state_$1)) {
                            thread.resetMultipleValues();
                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$1);
                            final SubLObject link_nodes = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            PrintLow.format((SubLObject)sbhl_link_utilities.T, (SubLObject)sbhl_link_utilities.$str0$Direction__a__Mt__a__Tv__a___a__, new SubLObject[] { direction, mt, tv, link_nodes });
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$1);
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                cdolist_list_var = cdolist_list_var.rest();
                direction = cdolist_list_var.first();
            }
        }
        return (SubLObject)sbhl_link_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 1256L)
    public static SubLObject empty_tv_link_p(final SubLObject tv, final SubLObject tv_links) {
        return set.set_or_list_emptyP(sbhl_links.get_sbhl_link_nodes(tv_links, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 1876L)
    public static SubLObject empty_tv_links_p(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_link_utilities.T;
        SubLObject not_emptyP;
        SubLObject iteration_state;
        for (not_emptyP = (SubLObject)sbhl_link_utilities.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_link_utilities.NIL == not_emptyP && sbhl_link_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_link_utilities.NIL != links) {
                not_emptyP = (SubLObject)sbhl_link_utilities.T;
                result = (SubLObject)sbhl_link_utilities.NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2182L)
    public static SubLObject empty_mt_link_p(final SubLObject mt, final SubLObject mt_links) {
        final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
        if (sbhl_link_utilities.NIL != tv_links) {
            return empty_tv_links_p(tv_links);
        }
        return (SubLObject)sbhl_link_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2442L)
    public static SubLObject empty_mt_links_p(final SubLObject mt_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_link_utilities.T;
        SubLObject not_emptyP;
        SubLObject iteration_state;
        for (not_emptyP = (SubLObject)sbhl_link_utilities.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_link_utilities.NIL == not_emptyP && sbhl_link_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_link_utilities.NIL == empty_tv_links_p(tv_links)) {
                not_emptyP = (SubLObject)sbhl_link_utilities.T;
                result = (SubLObject)sbhl_link_utilities.NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2789L)
    public static SubLObject empty_direction_link_p(final SubLObject direction, final SubLObject d_link) {
        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_link_utilities.UNPROVIDED));
        if (sbhl_link_utilities.NIL != mt_links) {
            return empty_mt_links_p(mt_links);
        }
        return (SubLObject)sbhl_link_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 3082L)
    public static SubLObject empty_graph_link_p(final SubLObject node, final SubLObject module) {
        assert sbhl_link_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_link_utilities.T;
        SubLObject not_emptyP = (SubLObject)sbhl_link_utilities.NIL;
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (sbhl_link_utilities.NIL != d_link) {
            SubLObject rest;
            SubLObject direction;
            SubLObject mt_links;
            for (rest = (SubLObject)sbhl_link_utilities.NIL, rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); sbhl_link_utilities.NIL == not_emptyP && sbhl_link_utilities.NIL != rest; rest = rest.rest()) {
                direction = rest.first();
                mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if (sbhl_link_utilities.NIL != mt_links && sbhl_link_utilities.NIL == empty_mt_links_p(mt_links)) {
                    not_emptyP = (SubLObject)sbhl_link_utilities.T;
                    result = (SubLObject)sbhl_link_utilities.NIL;
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 3515L)
    public static SubLObject valid_sbhl_graph_link_p(final SubLObject node, final SubLObject module) {
        SubLObject invalidP = (SubLObject)sbhl_link_utilities.NIL;
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (sbhl_link_utilities.NIL != d_link) {
            SubLObject rest;
            SubLObject direction;
            SubLObject mt_links;
            for (rest = (SubLObject)sbhl_link_utilities.NIL, rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); sbhl_link_utilities.NIL == invalidP && sbhl_link_utilities.NIL != rest; rest = rest.rest()) {
                direction = rest.first();
                mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if (sbhl_link_utilities.NIL != mt_links && sbhl_link_utilities.NIL == sbhl_links.sbhl_wf_mt_links_p(mt_links)) {
                    invalidP = (SubLObject)sbhl_link_utilities.T;
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_link_utilities.NIL == invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 4251L)
    public static SubLObject valid_sbhl_module_p(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject invalid_links = dictionary.new_dictionary((SubLObject)sbhl_link_utilities.UNPROVIDED, (SubLObject)sbhl_link_utilities.UNPROVIDED);
        SubLObject invalidP = (SubLObject)sbhl_link_utilities.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_link_utilities.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
            SubLObject link = (SubLObject)sbhl_link_utilities.NIL;
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)sbhl_link_utilities.NIL; sbhl_link_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_link_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sbhl_link_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject node = (SubLObject)sbhl_link_utilities.NIL;
                    SubLObject impl_value = (SubLObject)sbhl_link_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_utilities.$list2);
                    node = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_utilities.$list2);
                    impl_value = current.first();
                    current = current.rest();
                    if (sbhl_link_utilities.NIL == current) {
                        if (sbhl_link_utilities.NIL == file_vector_utilities.file_vector_reference_p(impl_value) || sbhl_link_utilities.NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value)) {
                            link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), (SubLObject)sbhl_link_utilities.NIL, node, (SubLObject)sbhl_link_utilities.UNPROVIDED);
                            if (sbhl_link_utilities.NIL == valid_sbhl_graph_link_p(node, module)) {
                                invalidP = (SubLObject)sbhl_link_utilities.T;
                                dictionary.dictionary_enter(invalid_links, node, link);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_link_utilities.$list2);
                    }
                }
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        if (sbhl_link_utilities.NIL != invalidP) {
            return Values.values((SubLObject)sbhl_link_utilities.NIL, invalid_links);
        }
        return (SubLObject)sbhl_link_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 4757L)
    public static SubLObject valid_sbhl_links_p(final SubLObject node) {
        SubLObject invalid_link_modules = (SubLObject)sbhl_link_utilities.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_link_utilities.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_link_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_link_utilities.NIL;
            SubLObject module = (SubLObject)sbhl_link_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_utilities.$list3);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_link_utilities.NIL == valid_sbhl_graph_link_p(node, module)) {
                invalid_link_modules = (SubLObject)ConsesLow.cons(module, invalid_link_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        if (sbhl_link_utilities.NIL != invalid_link_modules) {
            return invalid_link_modules;
        }
        return (SubLObject)sbhl_link_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 5254L)
    public static SubLObject valid_sbhl_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject invalid_modules = dictionary.new_dictionary((SubLObject)sbhl_link_utilities.UNPROVIDED, (SubLObject)sbhl_link_utilities.UNPROVIDED);
        SubLObject invalidP = (SubLObject)sbhl_link_utilities.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_link_utilities.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_link_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_link_utilities.NIL;
            SubLObject module = (SubLObject)sbhl_link_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_utilities.$list3);
            key = current.first();
            current = (module = current.rest());
            thread.resetMultipleValues();
            final SubLObject module_valid_p = valid_sbhl_module_p(module);
            final SubLObject invalid_links_in_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_link_utilities.NIL == module_valid_p) {
                invalidP = (SubLObject)sbhl_link_utilities.T;
                dictionary.dictionary_enter(invalid_modules, module, invalid_links_in_module);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        if (sbhl_link_utilities.NIL != invalidP) {
            return Values.values((SubLObject)sbhl_link_utilities.NIL, invalid_modules);
        }
        return (SubLObject)sbhl_link_utilities.T;
    }
    
    public static SubLObject declare_sbhl_link_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "print_sbhl_direction_link", "PRINT-SBHL-DIRECTION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_tv_link_p", "EMPTY-TV-LINK-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_tv_links_p", "EMPTY-TV-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_mt_link_p", "EMPTY-MT-LINK-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_mt_links_p", "EMPTY-MT-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_direction_link_p", "EMPTY-DIRECTION-LINK-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "empty_graph_link_p", "EMPTY-GRAPH-LINK-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "valid_sbhl_graph_link_p", "VALID-SBHL-GRAPH-LINK-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "valid_sbhl_module_p", "VALID-SBHL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "valid_sbhl_links_p", "VALID-SBHL-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities", "valid_sbhl_p", "VALID-SBHL-P", 0, 0, false);
        return (SubLObject)sbhl_link_utilities.NIL;
    }
    
    public static SubLObject init_sbhl_link_utilities_file() {
        return (SubLObject)sbhl_link_utilities.NIL;
    }
    
    public static SubLObject setup_sbhl_link_utilities_file() {
        return (SubLObject)sbhl_link_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_link_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_link_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_link_utilities_file();
    }
    
    static {
        me = (SubLFile)new sbhl_link_utilities();
        $str0$Direction__a__Mt__a__Tv__a___a__ = SubLObjectFactory.makeString("Direction ~a, Mt ~a, Tv ~a: ~a~%");
        $sym1$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("IMPL-VALUE"));
        $list3 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
    }
}

/*

	Total time: 112 ms
	
*/
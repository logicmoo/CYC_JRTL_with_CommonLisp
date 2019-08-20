/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols_simple;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.file_vector_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-LINK-UTILITIES
 * source file: /cyc/top/cycl/sbhl/sbhl-link-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class sbhl_link_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_link_utilities();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Direction__a__Mt__a__Tv__a___a__ = makeString("Direction ~a, Mt ~a, Tv ~a: ~a~%");

    static private final SubLList $list2 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLList $list3 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));

    // Definitions
    /**
     * prints the direction link fields and substructures
     */
    @LispMethod(comment = "prints the direction link fields and substructures")
    public static final SubLObject print_sbhl_direction_link_alt(SubLObject node, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
                if (NIL != d_link) {
                    {
                        SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                        SubLObject direction = NIL;
                        for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                            {
                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                if (NIL != mt_links) {
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject tv_links = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject iteration_state_1 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_1)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_1);
                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            format(T, $str_alt0$Direction__a__Mt__a__Tv__a___a__, new SubLObject[]{ direction, mt, tv, link_nodes });
                                                            iteration_state_1 = dictionary_contents.do_dictionary_contents_next(iteration_state_1);
                                                        }
                                                    } 
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_1);
                                                }
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "prints the direction link fields and substructures")
    public static SubLObject print_sbhl_direction_link(final SubLObject node, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL != d_link) {
            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
            SubLObject direction = NIL;
            direction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if (NIL != mt_links) {
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject tv_links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject iteration_state_$1;
                        for (iteration_state_$1 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$1); iteration_state_$1 = dictionary_contents.do_dictionary_contents_next(iteration_state_$1)) {
                            thread.resetMultipleValues();
                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$1);
                            final SubLObject link_nodes = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            format(T, $str0$Direction__a__Mt__a__Tv__a___a__, new SubLObject[]{ direction, mt, tv, link_nodes });
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$1);
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                cdolist_list_var = cdolist_list_var.rest();
                direction = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Accessor: determines if the tv-link in TV-LINKS associated with TV is empty
     */
    @LispMethod(comment = "Accessor: determines if the tv-link in TV-LINKS associated with TV is empty")
    public static final SubLObject empty_tv_link_p_alt(SubLObject tv, SubLObject tv_links) {
        return sublisp_null(sbhl_links.get_sbhl_link_nodes(tv_links, tv));
    }

    @LispMethod(comment = "Accessor: determines if the tv-link in TV-LINKS associated with TV is empty")
    public static SubLObject empty_tv_link_p(final SubLObject tv, final SubLObject tv_links) {
        return set.set_or_list_emptyP(sbhl_links.get_sbhl_link_nodes(tv_links, tv));
    }/**
     * Accessor: determines if the tv-link in TV-LINKS associated with TV is empty
     */


    /**
     * Accessor: determines if all truth value fields of TV-LINK are NIL.
     */
    @LispMethod(comment = "Accessor: determines if all truth value fields of TV-LINK are NIL.")
    public static final SubLObject empty_tv_links_p_alt(SubLObject tv_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = T;
                SubLObject not_emptyP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                while (!((NIL != not_emptyP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != links) {
                            not_emptyP = T;
                            result = NIL;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    @LispMethod(comment = "Accessor: determines if all truth value fields of TV-LINK are NIL.")
    public static SubLObject empty_tv_links_p(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = T;
        SubLObject not_emptyP;
        SubLObject iteration_state;
        for (not_emptyP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == not_emptyP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != links) {
                not_emptyP = T;
                result = NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }/**
     * Accessor: determines if all truth value fields of TV-LINK are NIL.
     */


    /**
     * Accessor: takes MT and MT-LINKS and determines if all tv-link substructures are empty.
     */
    @LispMethod(comment = "Accessor: takes MT and MT-LINKS and determines if all tv-link substructures are empty.")
    public static final SubLObject empty_mt_link_p_alt(SubLObject mt, SubLObject mt_links) {
        {
            SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
            if (NIL != tv_links) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.empty_tv_links_p(tv_links);
            } else {
                return T;
            }
        }
    }

    @LispMethod(comment = "Accessor: takes MT and MT-LINKS and determines if all tv-link substructures are empty.")
    public static SubLObject empty_mt_link_p(final SubLObject mt, final SubLObject mt_links) {
        final SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
        if (NIL != tv_links) {
            return empty_tv_links_p(tv_links);
        }
        return T;
    }/**
     * Accessor: takes MT and MT-LINKS and determines if all tv-link substructures are empty.
     */


    /**
     * Accessor: determines if the MT-LINKS structure has completely empty substructures
     */
    @LispMethod(comment = "Accessor: determines if the MT-LINKS structure has completely empty substructures")
    public static final SubLObject empty_mt_links_p_alt(SubLObject mt_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = T;
                SubLObject not_emptyP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                while (!((NIL != not_emptyP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject tv_links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.empty_tv_links_p(tv_links)) {
                            not_emptyP = T;
                            result = NIL;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    @LispMethod(comment = "Accessor: determines if the MT-LINKS structure has completely empty substructures")
    public static SubLObject empty_mt_links_p(final SubLObject mt_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = T;
        SubLObject not_emptyP;
        SubLObject iteration_state;
        for (not_emptyP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == not_emptyP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == empty_tv_links_p(tv_links)) {
                not_emptyP = T;
                result = NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }/**
     * Accessor: determines if the MT-LINKS structure has completely empty substructures
     */


    /**
     * Accessor: takes direction-link D-LINK and determines if all substructures are empty.
     */
    @LispMethod(comment = "Accessor: takes direction-link D-LINK and determines if all substructures are empty.")
    public static final SubLObject empty_direction_link_p_alt(SubLObject direction, SubLObject d_link) {
        {
            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            if (NIL != mt_links) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.empty_mt_links_p(mt_links);
            } else {
                return T;
            }
        }
    }

    @LispMethod(comment = "Accessor: takes direction-link D-LINK and determines if all substructures are empty.")
    public static SubLObject empty_direction_link_p(final SubLObject direction, final SubLObject d_link) {
        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (NIL != mt_links) {
            return empty_mt_links_p(mt_links);
        }
        return T;
    }/**
     * Accessor: takes direction-link D-LINK and determines if all substructures are empty.
     */


    /**
     * Accessor: takes NODE and determines emptiness of the fields of the direction link that NODE and that MODULE / *sbhl-module* specify.
     */
    @LispMethod(comment = "Accessor: takes NODE and determines emptiness of the fields of the direction link that NODE and that MODULE / *sbhl-module* specify.")
    public static final SubLObject empty_graph_link_p_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject result = T;
            SubLObject not_emptyP = NIL;
            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
            if (NIL != d_link) {
                {
                    SubLObject rest = NIL;
                    for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); !((NIL != not_emptyP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject direction = rest.first();
                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                            if (NIL != mt_links) {
                                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.empty_mt_links_p(mt_links)) {
                                    not_emptyP = T;
                                    result = NIL;
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Accessor: takes NODE and determines emptiness of the fields of the direction link that NODE and that MODULE / *sbhl-module* specify.")
    public static SubLObject empty_graph_link_p(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = T;
        SubLObject not_emptyP = NIL;
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL != d_link) {
            SubLObject rest;
            SubLObject direction;
            SubLObject mt_links;
            for (rest = NIL, rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); (NIL == not_emptyP) && (NIL != rest); rest = rest.rest()) {
                direction = rest.first();
                mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if ((NIL != mt_links) && (NIL == empty_mt_links_p(mt_links))) {
                    not_emptyP = T;
                    result = NIL;
                }
            }
        }
        return result;
    }/**
     * Accessor: takes NODE and determines emptiness of the fields of the direction link that NODE and that MODULE / *sbhl-module* specify.
     */


    /**
     * Accessor: returns whether there is valid link structure within all of the fields of the direction link specificified by NODE and current *sbhl-graph*.
     */
    @LispMethod(comment = "Accessor: returns whether there is valid link structure within all of the fields of the direction link specificified by NODE and current *sbhl-graph*.")
    public static final SubLObject valid_sbhl_graph_link_p_alt(SubLObject node, SubLObject module) {
        {
            SubLObject invalidP = NIL;
            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
            if (NIL != d_link) {
                {
                    SubLObject rest = NIL;
                    for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); !((NIL != invalidP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject direction = rest.first();
                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                            if (NIL != mt_links) {
                                if (NIL == sbhl_links.sbhl_wf_mt_links_p(mt_links)) {
                                    invalidP = T;
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == invalidP);
        }
    }

    @LispMethod(comment = "Accessor: returns whether there is valid link structure within all of the fields of the direction link specificified by NODE and current *sbhl-graph*.")
    public static SubLObject valid_sbhl_graph_link_p(final SubLObject node, final SubLObject module) {
        SubLObject invalidP = NIL;
        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL != d_link) {
            SubLObject rest;
            SubLObject direction;
            SubLObject mt_links;
            for (rest = NIL, rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); (NIL == invalidP) && (NIL != rest); rest = rest.rest()) {
                direction = rest.first();
                mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                if ((NIL != mt_links) && (NIL == sbhl_links.sbhl_wf_mt_links_p(mt_links))) {
                    invalidP = T;
                }
            }
        }
        return makeBoolean(NIL == invalidP);
    }/**
     * Accessor: returns whether there is valid link structure within all of the fields of the direction link specificified by NODE and current *sbhl-graph*.
     */


    /**
     * checks @see valid-sbhl-graph-link-p for each entry in the graph for MODULE / *sbhl-module*. returns the list of invalid '(node link) pairs, or boolean t, if valid.
     */
    @LispMethod(comment = "checks @see valid-sbhl-graph-link-p for each entry in the graph for MODULE / *sbhl-module*. returns the list of invalid \'(node link) pairs, or boolean t, if valid.")
    public static final SubLObject valid_sbhl_module_p_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject invalid_links = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject invalidP = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        {
                            SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
                            SubLObject link = NIL;
                            SubLObject iterator = map_utilities.new_map_iterator(map);
                            SubLObject done_var = NIL;
                            while (NIL == done_var) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject var = iteration.iteration_next(iterator);
                                    SubLObject valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        {
                                            SubLObject datum = var;
                                            SubLObject current = datum;
                                            SubLObject node = NIL;
                                            SubLObject impl_value = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                            node = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                            impl_value = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                    link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, node, UNPROVIDED);
                                                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.valid_sbhl_graph_link_p(node, module)) {
                                                        invalidP = T;
                                                        dictionary.dictionary_enter(invalid_links, node, link);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt2);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != invalidP) {
                    return values(NIL, invalid_links);
                }
            }
            return T;
        }
    }

    @LispMethod(comment = "checks @see valid-sbhl-graph-link-p for each entry in the graph for MODULE / *sbhl-module*. returns the list of invalid \'(node link) pairs, or boolean t, if valid.")
    public static SubLObject valid_sbhl_module_p(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject invalid_links = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject invalidP = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
            SubLObject link = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject node = NIL;
                    SubLObject impl_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list2);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list2);
                    impl_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                            link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, node, UNPROVIDED);
                            if (NIL == valid_sbhl_graph_link_p(node, module)) {
                                invalidP = T;
                                dictionary.dictionary_enter(invalid_links, node, link);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list2);
                    }
                }
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        if (NIL != invalidP) {
            return values(NIL, invalid_links);
        }
        return T;
    }

    /**
     * checks @see valid-sbhl-graph-link-p for NODE in each sbhl module. returns the list of invalid modules, or boolean t, if links for NODE in all modules are valid.
     */
    @LispMethod(comment = "checks @see valid-sbhl-graph-link-p for NODE in each sbhl module. returns the list of invalid modules, or boolean t, if links for NODE in all modules are valid.")
    public static final SubLObject valid_sbhl_links_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject invalid_link_modules = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.valid_sbhl_graph_link_p(node, module)) {
                            invalid_link_modules = cons(module, invalid_link_modules);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                if (NIL != invalid_link_modules) {
                    return invalid_link_modules;
                }
            }
            return T;
        }
    }

    @LispMethod(comment = "checks @see valid-sbhl-graph-link-p for NODE in each sbhl module. returns the list of invalid modules, or boolean t, if links for NODE in all modules are valid.")
    public static SubLObject valid_sbhl_links_p(final SubLObject node) {
        SubLObject invalid_link_modules = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = module = current.rest();
            if (NIL == valid_sbhl_graph_link_p(node, module)) {
                invalid_link_modules = cons(module, invalid_link_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        if (NIL != invalid_link_modules) {
            return invalid_link_modules;
        }
        return T;
    }/**
     * checks @see valid-sbhl-graph-link-p for NODE in each sbhl module. returns the list of invalid modules, or boolean t, if links for NODE in all modules are valid.
     */


    public static final SubLObject valid_sbhl_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject invalid_modules = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject invalidP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject module_valid_p = com.cyc.cycjava.cycl.sbhl.sbhl_link_utilities.valid_sbhl_module_p(module);
                            SubLObject invalid_links_in_module = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == module_valid_p) {
                                invalidP = T;
                                dictionary.dictionary_enter(invalid_modules, module, invalid_links_in_module);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                if (NIL != invalidP) {
                    return values(NIL, invalid_modules);
                } else {
                    return T;
                }
            }
        }
    }

    public static SubLObject valid_sbhl_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject invalid_modules = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject invalidP = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = module = current.rest();
            thread.resetMultipleValues();
            final SubLObject module_valid_p = valid_sbhl_module_p(module);
            final SubLObject invalid_links_in_module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == module_valid_p) {
                invalidP = T;
                dictionary.dictionary_enter(invalid_modules, module, invalid_links_in_module);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        if (NIL != invalidP) {
            return values(NIL, invalid_modules);
        }
        return T;
    }

    public static SubLObject declare_sbhl_link_utilities_file() {
        declareFunction("print_sbhl_direction_link", "PRINT-SBHL-DIRECTION-LINK", 2, 0, false);
        declareFunction("empty_tv_link_p", "EMPTY-TV-LINK-P", 2, 0, false);
        declareFunction("empty_tv_links_p", "EMPTY-TV-LINKS-P", 1, 0, false);
        declareFunction("empty_mt_link_p", "EMPTY-MT-LINK-P", 2, 0, false);
        declareFunction("empty_mt_links_p", "EMPTY-MT-LINKS-P", 1, 0, false);
        declareFunction("empty_direction_link_p", "EMPTY-DIRECTION-LINK-P", 2, 0, false);
        declareFunction("empty_graph_link_p", "EMPTY-GRAPH-LINK-P", 2, 0, false);
        declareFunction("valid_sbhl_graph_link_p", "VALID-SBHL-GRAPH-LINK-P", 2, 0, false);
        declareFunction("valid_sbhl_module_p", "VALID-SBHL-MODULE-P", 1, 0, false);
        declareFunction("valid_sbhl_links_p", "VALID-SBHL-LINKS-P", 1, 0, false);
        declareFunction("valid_sbhl_p", "VALID-SBHL-P", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_link_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_link_utilities_file() {
        return NIL;
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
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Direction__a__Mt__a__Tv__a___a__ = makeString("Direction ~a, Mt ~a, Tv ~a: ~a~%");

    static private final SubLList $list_alt2 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));
}

/**
 * Total time: 112 ms
 */

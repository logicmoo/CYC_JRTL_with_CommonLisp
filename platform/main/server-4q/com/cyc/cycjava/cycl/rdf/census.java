/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.owl.owl_importer2;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CENSUS
 *  source file: /cyc/top/cycl/rdf/census.lisp
 *  created:     2019/07/03 17:38:13
 */
public final class census extends SubLTranslatedFile implements V02 {
    // // Constructor
    private census() {
    }

    public static final SubLFile me = new census();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.census";

    // // Definitions
    public static final SubLObject import_census_universe_definitions(SubLObject cyclist, SubLObject mapping_mt) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = $list_alt0;
        }
        {
            SubLObject v_graph = slurp_census_universe_definitions();
            owl_importer2.import_owl_triples_from_rdf_graph(v_graph, czer_main.canonicalize_term(mapping_mt, UNPROVIDED), cyclist);
        }
        return NIL;
    }

    public static final SubLObject get_census_universes() {
        {
            SubLObject query = $str_alt1$PREFIX_rdf___http___www_w3_org_19;
            SubLObject result_set = sparql_utilities.sparql_query_vars(query, $list_alt2, $str_alt3$www_rdfabout_com, UNPROVIDED, UNPROVIDED);
            SubLObject universes = NIL;
            SubLObject cdolist_list_var = result_set;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject item_var = result.first();
                    if (NIL == member(item_var, universes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        universes = cons(item_var, universes);
                    }
                }
                {
                    SubLObject var = second(result);
                    if (NIL != var) {
                        {
                            SubLObject item_var = var;
                            if (NIL == member(item_var, universes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                universes = cons(item_var, universes);
                            }
                        }
                    }
                }
            }
            return universes;
        }
    }

    public static final SubLObject slurp_census_universe_definitions() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_graph = rdf_graph.new_rdf_graph();
                SubLObject list_var = get_census_universes();
                utilities_macros.$progress_note$.setDynamicValue($str_alt4$Slurping_Census_universe_predicat, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject universe = NIL;
                            for (universe = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , universe = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_input_stream(sparql_utilities.sparql_describe(universe, $str_alt3$www_rdfabout_com, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL);
                                        {
                                            SubLObject _prev_bind_0_1 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                            try {
                                                utilities_macros.$silent_progressP$.bind(T, thread);
                                                rdf_parser.parse_rdfXxml_stream_to_graph(stream, $str_alt5$tag_govshare_info_2005_rdf_census, v_graph);
                                            } finally {
                                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                close(stream, UNPROVIDED);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_graph;
            }
        }
    }

    public static final SubLObject declare_census_file() {
        declareFunction("import_census_universe_definitions", "IMPORT-CENSUS-UNIVERSE-DEFINITIONS", 0, 2, false);
        declareFunction("get_census_universes", "GET-CENSUS-UNIVERSES", 0, 0, false);
        declareFunction("slurp_census_universe_definitions", "SLURP-CENSUS-UNIVERSE-DEFINITIONS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_census_file() {
        return NIL;
    }

    public static final SubLObject setup_census_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(constant_handles.reader_make_constant_shell(makeString("MappingMtFn")), constant_handles.reader_make_constant_shell(makeString("2000USCensusDataTripleStore")));

    static private final SubLString $str_alt1$PREFIX_rdf___http___www_w3_org_19 = makeString("PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\nSELECT ?universe ?slice WHERE {\n { ?universe <tag:govshare.info,2005:rdf/census/hasSlice> ?slice }\n UNION\n { ?universe rdf:type <tag:govshare.info,2005:rdf/census/Universe> }\n}");

    static private final SubLList $list_alt2 = list(makeString("universe"), makeString("slice"));

    static private final SubLString $str_alt3$www_rdfabout_com = makeString("www.rdfabout.com");

    static private final SubLString $str_alt4$Slurping_Census_universe_predicat = makeString("Slurping Census universe predicate definitions...");

    static private final SubLString $str_alt5$tag_govshare_info_2005_rdf_census = makeString("tag:govshare.info,2005:rdf/census/");

    // // Initializers
    public void declareFunctions() {
        declare_census_file();
    }

    public void initializeVariables() {
        init_census_file();
    }

    public void runTopLevelForms() {
        setup_census_file();
    }
}


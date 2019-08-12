/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CLUSTERING
 * source file: /cyc/top/cycl/clustering.lisp
 * created:     2019/07/03 17:38:53
 */
public final class clustering extends SubLTranslatedFile implements V12 {
    public static final class $cluster_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.clustering.$cluster_native.this.$elements;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.clustering.$cluster_native.this.$subclusters;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.clustering.$cluster_native.this.$elements = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.clustering.$cluster_native.this.$subclusters = value;
        }

        public SubLObject $elements = Lisp.NIL;

        public SubLObject $subclusters = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.clustering.$cluster_native.class, CLUSTER, CLUSTER_P, $list_alt3, $list_alt4, new String[]{ "$elements", "$subclusters" }, $list_alt5, $list_alt6, PRINT_CLUSTER);
    }

    public static final SubLFile me = new clustering();

 public static final String myName = "com.cyc.cycjava.cycl.clustering";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cluster_element_sim_cache$ = makeSymbol("*CLUSTER-ELEMENT-SIM-CACHE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cluster$ = makeSymbol("*DTP-CLUSTER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$a_cache_for_the_similarity_betwee = makeString("a cache for the similarity between individual cluster elements");

    private static final SubLSymbol CLUSTER_P = makeSymbol("CLUSTER-P");

    static private final SubLList $list3 = list(makeSymbol("ELEMENTS"), makeSymbol("SUBCLUSTERS"));

    static private final SubLList $list4 = list(makeKeyword("ELEMENTS"), makeKeyword("SUBCLUSTERS"));

    static private final SubLList $list5 = list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER-SUBCLUSTERS"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-CLUSTER-ELEMENTS"), makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS"));

    private static final SubLSymbol PRINT_CLUSTER = makeSymbol("PRINT-CLUSTER");

    private static final SubLSymbol CLUSTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CLUSTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CLUSTER-P"));

    private static final SubLSymbol CLUSTER_ELEMENTS = makeSymbol("CLUSTER-ELEMENTS");

    private static final SubLSymbol _CSETF_CLUSTER_ELEMENTS = makeSymbol("_CSETF-CLUSTER-ELEMENTS");

    private static final SubLSymbol CLUSTER_SUBCLUSTERS = makeSymbol("CLUSTER-SUBCLUSTERS");

    private static final SubLSymbol _CSETF_CLUSTER_SUBCLUSTERS = makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CLUSTER = makeSymbol("MAKE-CLUSTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CLUSTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CLUSTER-METHOD");

    private static final SubLString $str22$__CLUSTER__ = makeString("#<CLUSTER: ");

    private static final SubLString $str23$_ = makeString(">");

    public static final SubLObject cluster_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_cluster(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cluster_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cluster(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cluster_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.clustering.$cluster_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cluster_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.clustering.$cluster_native.class ? T : NIL;
    }

    public static final SubLObject cluster_elements_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CLUSTER_P);
        return v_object.getField2();
    }

    public static SubLObject cluster_elements(final SubLObject v_object) {
        assert NIL != cluster_p(v_object) : "! clustering.cluster_p(v_object) " + "clustering.cluster_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cluster_subclusters_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CLUSTER_P);
        return v_object.getField3();
    }

    public static SubLObject cluster_subclusters(final SubLObject v_object) {
        assert NIL != cluster_p(v_object) : "! clustering.cluster_p(v_object) " + "clustering.cluster_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_cluster_elements_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CLUSTER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cluster_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != cluster_p(v_object) : "! clustering.cluster_p(v_object) " + "clustering.cluster_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cluster_subclusters_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CLUSTER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cluster_subclusters(final SubLObject v_object, final SubLObject value) {
        assert NIL != cluster_p(v_object) : "! clustering.cluster_p(v_object) " + "clustering.cluster_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_cluster_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.clustering.$cluster_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ELEMENTS)) {
                        _csetf_cluster_elements(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SUBCLUSTERS)) {
                            _csetf_cluster_subclusters(v_new, current_value);
                        } else {
                            Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cluster(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.clustering.$cluster_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ELEMENTS)) {
                _csetf_cluster_elements(v_new, current_value);
            } else
                if (pcase_var.eql($SUBCLUSTERS)) {
                    _csetf_cluster_subclusters(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cluster(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CLUSTER, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ELEMENTS, cluster_elements(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBCLUSTERS, cluster_subclusters(obj));
        funcall(visitor_fn, obj, $END, MAKE_CLUSTER, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cluster_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cluster(obj, visitor_fn);
    }

    /**
     * Print CLUSTER to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Print CLUSTER to STREAM, ignoring DEPTH")
    public static final SubLObject print_cluster_alt(SubLObject cluster, SubLObject stream, SubLObject depth) {
        return pprint_cluster(cluster, stream, ZERO_INTEGER);
    }

    /**
     * Print CLUSTER to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Print CLUSTER to STREAM, ignoring DEPTH")
    public static SubLObject print_cluster(final SubLObject cluster, final SubLObject stream, final SubLObject depth) {
        return pprint_cluster(cluster, stream, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of elements in CLUSTER
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of elements in CLUSTER")
    public static final SubLObject cluster_cardinality_alt(SubLObject cluster) {
        SubLTrampolineFile.checkType(cluster, CLUSTER_P);
        return length(cluster_elements(cluster));
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of elements in CLUSTER
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of elements in CLUSTER")
    public static SubLObject cluster_cardinality(final SubLObject cluster) {
        assert NIL != cluster_p(cluster) : "! clustering.cluster_p(cluster) " + ("clustering.cluster_p(cluster) " + "CommonSymbols.NIL != clustering.cluster_p(cluster) ") + cluster;
        return length(cluster_elements(cluster));
    }

    /**
     *
     *
     * @return boolan; t if CLUSTER1 is larger than CLUSTER2, nil otherwise
     */
    @LispMethod(comment = "@return boolan; t if CLUSTER1 is larger than CLUSTER2, nil otherwise")
    public static final SubLObject clusterG_alt(SubLObject cluster1, SubLObject cluster2) {
        SubLTrampolineFile.checkType(cluster1, CLUSTER_P);
        SubLTrampolineFile.checkType(cluster2, CLUSTER_P);
        return numG(cluster_cardinality(cluster1), cluster_cardinality(cluster2));
    }

    /**
     *
     *
     * @return boolan; t if CLUSTER1 is larger than CLUSTER2, nil otherwise
     */
    @LispMethod(comment = "@return boolan; t if CLUSTER1 is larger than CLUSTER2, nil otherwise")
    public static SubLObject clusterG(final SubLObject cluster1, final SubLObject cluster2) {
        assert NIL != cluster_p(cluster1) : "! clustering.cluster_p(cluster1) " + ("clustering.cluster_p(cluster1) " + "CommonSymbols.NIL != clustering.cluster_p(cluster1) ") + cluster1;
        assert NIL != cluster_p(cluster2) : "! clustering.cluster_p(cluster2) " + ("clustering.cluster_p(cluster2) " + "CommonSymbols.NIL != clustering.cluster_p(cluster2) ") + cluster2;
        return numG(cluster_cardinality(cluster1), cluster_cardinality(cluster2));
    }

    /**
     * Pretty-prints CLUSTER to STREAM, indenting LEVEL
     */
    @LispMethod(comment = "Pretty-prints CLUSTER to STREAM, indenting LEVEL")
    public static final SubLObject pprint_cluster_alt(SubLObject cluster, SubLObject stream, SubLObject level) {
        {
            SubLObject indent = FOUR_INTEGER;
            SubLObject base_column = multiply(level, indent);
            string_utilities.indent(stream, base_column);
            write_string($str_alt16$__CLUSTER__, stream, UNPROVIDED, UNPROVIDED);
            if (NIL != cluster_subclusters(cluster)) {
                terpri(stream);
                {
                    SubLObject cdolist_list_var = cluster_subclusters(cluster);
                    SubLObject subcluster = NIL;
                    for (subcluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcluster = cdolist_list_var.first()) {
                        pprint_cluster(subcluster, stream, number_utilities.f_1X(level));
                    }
                }
                string_utilities.indent(stream, base_column);
            } else {
                princ(cluster_elements(cluster), stream);
            }
            write_string($str_alt17$_, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            return cluster;
        }
    }

    /**
     * Pretty-prints CLUSTER to STREAM, indenting LEVEL
     */
    @LispMethod(comment = "Pretty-prints CLUSTER to STREAM, indenting LEVEL")
    public static SubLObject pprint_cluster(final SubLObject cluster, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = FOUR_INTEGER;
        final SubLObject base_column = multiply(level, indent);
        string_utilities.indent(stream, base_column);
        write_string($str22$__CLUSTER__, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != cluster_subclusters(cluster)) {
            terpri(stream);
            SubLObject cdolist_list_var = cluster_subclusters(cluster);
            SubLObject subcluster = NIL;
            subcluster = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pprint_cluster(subcluster, stream, number_utilities.f_1X(level));
                cdolist_list_var = cdolist_list_var.rest();
                subcluster = cdolist_list_var.first();
            } 
            string_utilities.indent(stream, base_column);
        } else {
            princ(cluster_elements(cluster), stream);
        }
        write_string($str23$_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        return cluster;
    }

    /**
     *
     *
     * @param ELEMENTS
     * 		listp; a list of arbitrary comparable objects
     * @return cluster-p; a new cluster containing ELEMENTS
     */
    @LispMethod(comment = "@param ELEMENTS\r\n\t\tlistp; a list of arbitrary comparable objects\r\n@return cluster-p; a new cluster containing ELEMENTS")
    public static final SubLObject new_cluster_alt(SubLObject elements) {
        {
            SubLObject cluster = make_cluster(UNPROVIDED);
            _csetf_cluster_elements(cluster, elements);
            return cluster;
        }
    }

    /**
     *
     *
     * @param ELEMENTS
     * 		listp; a list of arbitrary comparable objects
     * @return cluster-p; a new cluster containing ELEMENTS
     */
    @LispMethod(comment = "@param ELEMENTS\r\n\t\tlistp; a list of arbitrary comparable objects\r\n@return cluster-p; a new cluster containing ELEMENTS")
    public static SubLObject new_cluster(final SubLObject elements) {
        final SubLObject cluster = make_cluster(UNPROVIDED);
        _csetf_cluster_elements(cluster, elements);
        return cluster;
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return clusterp; a new cluster made up of clusters CLUSTER1 and CLUSTER2
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return clusterp; a new cluster made up of clusters CLUSTER1 and CLUSTER2")
    public static final SubLObject cluster_merge_alt(SubLObject cluster1, SubLObject cluster2) {
        {
            SubLObject cluster = make_cluster(UNPROVIDED);
            _csetf_cluster_elements(cluster, append(cluster_elements(cluster1), cluster_elements(cluster2)));
            _csetf_cluster_subclusters(cluster, list(cluster1, cluster2));
            return cluster;
        }
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return clusterp; a new cluster made up of clusters CLUSTER1 and CLUSTER2
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return clusterp; a new cluster made up of clusters CLUSTER1 and CLUSTER2")
    public static SubLObject cluster_merge(final SubLObject cluster1, final SubLObject cluster2) {
        final SubLObject cluster3 = make_cluster(UNPROVIDED);
        _csetf_cluster_elements(cluster3, append(cluster_elements(cluster1), cluster_elements(cluster2)));
        _csetf_cluster_subclusters(cluster3, list(cluster1, cluster2));
        return cluster3;
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return numberp; the complete-link similarity between CLUSTER1 and CLUSTER2,
    according to SIM-FUNC. Complete link similarity between two clusters
    is the similarity of their most dissimilar members
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return numberp; the complete-link similarity between CLUSTER1 and CLUSTER2,\r\naccording to SIM-FUNC. Complete link similarity between two clusters\r\nis the similarity of their most dissimilar members")
    public static final SubLObject cluster_complete_link_sim_alt(SubLObject cluster1, SubLObject cluster2, SubLObject sim_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject elements1 = cluster_elements(cluster1);
                SubLObject elements2 = cluster_elements(cluster2);
                SubLObject min_sim = funcall(sim_func, elements1.first(), elements2.first());
                SubLObject sim = NIL;
                SubLObject cdolist_list_var = elements1;
                SubLObject element1 = NIL;
                for (element1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element1 = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_1 = elements2;
                        SubLObject element2 = NIL;
                        for (element2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , element2 = cdolist_list_var_1.first()) {
                            sim = gethash(cons(element1, element2), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                            if (NIL == sim) {
                                sim = gethash(cons(element2, element1), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                            }
                            if (sim.numL(min_sim)) {
                                min_sim = sim;
                            }
                        }
                    }
                }
                return min_sim;
            }
        }
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return numberp; the complete-link similarity between CLUSTER1 and CLUSTER2,
    according to SIM-FUNC. Complete link similarity between two clusters
    is the similarity of their most dissimilar members
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return numberp; the complete-link similarity between CLUSTER1 and CLUSTER2,\r\naccording to SIM-FUNC. Complete link similarity between two clusters\r\nis the similarity of their most dissimilar members")
    public static SubLObject cluster_complete_link_sim(final SubLObject cluster1, final SubLObject cluster2, final SubLObject sim_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements1 = cluster_elements(cluster1);
        final SubLObject elements2 = cluster_elements(cluster2);
        SubLObject min_sim = funcall(sim_func, elements1.first(), elements2.first());
        SubLObject sim = NIL;
        SubLObject cdolist_list_var = elements1;
        SubLObject element1 = NIL;
        element1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = elements2;
            SubLObject element2 = NIL;
            element2 = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                sim = gethash(cons(element1, element2), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == sim) {
                    sim = gethash(cons(element2, element1), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                }
                if (sim.numL(min_sim)) {
                    min_sim = sim;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                element2 = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            element1 = cdolist_list_var.first();
        } 
        return min_sim;
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return numberp; the single-link similarity between CLUSTER1 and CLUSTER2,
    according to SIM-FUNC. Single link similarity between two clusters
    is the similarity of their similar members
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return numberp; the single-link similarity between CLUSTER1 and CLUSTER2,\r\naccording to SIM-FUNC. Single link similarity between two clusters\r\nis the similarity of their similar members")
    public static final SubLObject cluster_single_link_sim_alt(SubLObject cluster1, SubLObject cluster2, SubLObject sim_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject elements1 = cluster_elements(cluster1);
                SubLObject elements2 = cluster_elements(cluster2);
                SubLObject max_sim = funcall(sim_func, elements1.first(), elements2.first());
                SubLObject sim = NIL;
                SubLObject cdolist_list_var = elements1;
                SubLObject element1 = NIL;
                for (element1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element1 = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_2 = elements2;
                        SubLObject element2 = NIL;
                        for (element2 = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , element2 = cdolist_list_var_2.first()) {
                            sim = gethash(cons(element1, element2), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                            if (NIL == sim) {
                                sim = gethash(cons(element2, element1), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                            }
                            if (sim.numG(max_sim)) {
                                max_sim = sim;
                            }
                        }
                    }
                }
                return max_sim;
            }
        }
    }

    /**
     *
     *
     * @param CLUSTER1
    cluster-p
     * 		
     * @param CLUSTER2
    cluster-p
     * 		
     * @return numberp; the single-link similarity between CLUSTER1 and CLUSTER2,
    according to SIM-FUNC. Single link similarity between two clusters
    is the similarity of their similar members
     */
    @LispMethod(comment = "@param CLUSTER1\ncluster-p\r\n\t\t\r\n@param CLUSTER2\ncluster-p\r\n\t\t\r\n@return numberp; the single-link similarity between CLUSTER1 and CLUSTER2,\r\naccording to SIM-FUNC. Single link similarity between two clusters\r\nis the similarity of their similar members")
    public static SubLObject cluster_single_link_sim(final SubLObject cluster1, final SubLObject cluster2, final SubLObject sim_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements1 = cluster_elements(cluster1);
        final SubLObject elements2 = cluster_elements(cluster2);
        SubLObject max_sim = funcall(sim_func, elements1.first(), elements2.first());
        SubLObject sim = NIL;
        SubLObject cdolist_list_var = elements1;
        SubLObject element1 = NIL;
        element1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = elements2;
            SubLObject element2 = NIL;
            element2 = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                sim = gethash(cons(element1, element2), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == sim) {
                    sim = gethash(cons(element2, element1), $cluster_element_sim_cache$.getDynamicValue(thread), UNPROVIDED);
                }
                if (sim.numG(max_sim)) {
                    max_sim = sim;
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                element2 = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            element1 = cdolist_list_var.first();
        } 
        return max_sim;
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp; a list of objects to be clustered
     * @param SIM-FUNC
     * 		symbolp; a binary function symbol returning a similarity
     * 		value when applied to any two of OBJECTS, with higher values indicating
     * 		higher similarity
     * @param K
     * 		positive-ineger-p; the desired number of clusters
     * @param MIN-SIM
     * 		nil or numberp; the minimal similarity required for two object
     * 		to end up in the same cluster
     * @return listp; a list of at least K clusters of OBJECTS, using SIM-FUNC, and
    stopping to cluster if either (i) K clusters are reached, or (ii) the minimum
    similarity required of two objects ending up in the same cluster by MIN-SIM
    is reached, whichever comes first
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp; a list of objects to be clustered\r\n@param SIM-FUNC\r\n\t\tsymbolp; a binary function symbol returning a similarity\r\n\t\tvalue when applied to any two of OBJECTS, with higher values indicating\r\n\t\thigher similarity\r\n@param K\r\n\t\tpositive-ineger-p; the desired number of clusters\r\n@param MIN-SIM\r\n\t\tnil or numberp; the minimal similarity required for two object\r\n\t\tto end up in the same cluster\r\n@return listp; a list of at least K clusters of OBJECTS, using SIM-FUNC, and\r\nstopping to cluster if either (i) K clusters are reached, or (ii) the minimum\r\nsimilarity required of two objects ending up in the same cluster by MIN-SIM\r\nis reached, whichever comes first")
    public static final SubLObject cluster_alt(SubLObject objects, SubLObject sim_func, SubLObject k, SubLObject min_sim) {
        if (k == UNPROVIDED) {
            k = ONE_INTEGER;
        }
        if (min_sim == UNPROVIDED) {
            min_sim = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(objects, LISTP);
            SubLTrampolineFile.checkType(sim_func, SYMBOLP);
            SubLTrampolineFile.checkType(k, POSITIVE_INTEGER_P);
            {
                SubLObject v_clustering = NIL;
                SubLObject sim_limit_reachedP = NIL;
                SubLObject cluster1 = NIL;
                SubLObject cluster2 = NIL;
                SubLObject sim = NIL;
                initialize_cluster_sim_cache(objects, sim_func);
                {
                    SubLObject cdolist_list_var = objects;
                    SubLObject v_object = NIL;
                    for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                        v_clustering = cons(new_cluster(list(v_object)), v_clustering);
                    }
                }
                while (!(length(v_clustering).numLE(k) || (NIL != sim_limit_reachedP))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cluster1_3 = cluster_max_sim(v_clustering, sim_func);
                        SubLObject cluster2_4 = thread.secondMultipleValue();
                        SubLObject sim_5 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        cluster1 = cluster1_3;
                        cluster2 = cluster2_4;
                        sim = sim_5;
                    }
                    if (NIL != min_sim) {
                        sim_limit_reachedP = numL(sim, min_sim);
                    }
                    if (NIL == sim_limit_reachedP) {
                        v_clustering = delete(cluster1, v_clustering, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        v_clustering = delete(cluster2, v_clustering, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        v_clustering = cons(cluster_merge(cluster1, cluster2), v_clustering);
                    }
                } 
                finalize_cluster_sim_cache();
                return v_clustering;
            }
        }
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp; a list of objects to be clustered
     * @param SIM-FUNC
     * 		symbolp; a binary function symbol returning a similarity
     * 		value when applied to any two of OBJECTS, with higher values indicating
     * 		higher similarity
     * @param K
     * 		positive-ineger-p; the desired number of clusters
     * @param MIN-SIM
     * 		nil or numberp; the minimal similarity required for two object
     * 		to end up in the same cluster
     * @return listp; a list of at least K clusters of OBJECTS, using SIM-FUNC, and
    stopping to cluster if either (i) K clusters are reached, or (ii) the minimum
    similarity required of two objects ending up in the same cluster by MIN-SIM
    is reached, whichever comes first
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp; a list of objects to be clustered\r\n@param SIM-FUNC\r\n\t\tsymbolp; a binary function symbol returning a similarity\r\n\t\tvalue when applied to any two of OBJECTS, with higher values indicating\r\n\t\thigher similarity\r\n@param K\r\n\t\tpositive-ineger-p; the desired number of clusters\r\n@param MIN-SIM\r\n\t\tnil or numberp; the minimal similarity required for two object\r\n\t\tto end up in the same cluster\r\n@return listp; a list of at least K clusters of OBJECTS, using SIM-FUNC, and\r\nstopping to cluster if either (i) K clusters are reached, or (ii) the minimum\r\nsimilarity required of two objects ending up in the same cluster by MIN-SIM\r\nis reached, whichever comes first")
    public static SubLObject cluster(final SubLObject objects, final SubLObject sim_func, SubLObject k, SubLObject min_sim) {
        if (k == UNPROVIDED) {
            k = ONE_INTEGER;
        }
        if (min_sim == UNPROVIDED) {
            min_sim = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(objects) : "! listp(objects) " + ("Types.listp(objects) " + "CommonSymbols.NIL != Types.listp(objects) ") + objects;
        assert NIL != symbolp(sim_func) : "! symbolp(sim_func) " + ("Types.symbolp(sim_func) " + "CommonSymbols.NIL != Types.symbolp(sim_func) ") + sim_func;
        assert NIL != subl_promotions.positive_integer_p(k) : "! subl_promotions.positive_integer_p(k) " + ("subl_promotions.positive_integer_p(k) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(k) ") + k;
        SubLObject v_clustering = NIL;
        SubLObject sim_limit_reachedP = NIL;
        SubLObject cluster1 = NIL;
        SubLObject cluster2 = NIL;
        SubLObject sim = NIL;
        initialize_cluster_sim_cache(objects, sim_func);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_clustering = cons(new_cluster(list(v_object)), v_clustering);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        while ((!length(v_clustering).numLE(k)) && (NIL == sim_limit_reachedP)) {
            thread.resetMultipleValues();
            final SubLObject cluster1_$3 = cluster_max_sim(v_clustering, sim_func);
            final SubLObject cluster2_$4 = thread.secondMultipleValue();
            final SubLObject sim_$5 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            cluster1 = cluster1_$3;
            cluster2 = cluster2_$4;
            sim = sim_$5;
            if (NIL != min_sim) {
                sim_limit_reachedP = numL(sim, min_sim);
            }
            if (NIL == sim_limit_reachedP) {
                v_clustering = delete(cluster1, v_clustering, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_clustering = delete(cluster2, v_clustering, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_clustering = cons(cluster_merge(cluster1, cluster2), v_clustering);
            }
        } 
        finalize_cluster_sim_cache();
        return v_clustering;
    }

    /**
     *
     *
     * @param CLUSTERING
    listp;
     * 		
     * @param SIM-FUNC
     * 		symbolp; a binary function symbol returning a similarity
     * 		value when applied to any two of OBJECTS, with higher values indicating
     * 		higher similarity
     * @return values; the two most similar clusters in CLUSTERING, according to SIM-FUNC,
    and their similarity
     */
    @LispMethod(comment = "@param CLUSTERING\nlistp;\r\n\t\t\r\n@param SIM-FUNC\r\n\t\tsymbolp; a binary function symbol returning a similarity\r\n\t\tvalue when applied to any two of OBJECTS, with higher values indicating\r\n\t\thigher similarity\r\n@return values; the two most similar clusters in CLUSTERING, according to SIM-FUNC,\r\nand their similarity")
    public static final SubLObject cluster_max_sim_alt(SubLObject v_clustering, SubLObject sim_func) {
        {
            SubLObject max_pair = cons(v_clustering.first(), second(v_clustering));
            SubLObject max_sim = cluster_complete_link_sim(max_pair.first(), max_pair.rest(), sim_func);
            SubLObject i = ZERO_INTEGER;
            SubLObject sim = NIL;
            SubLObject cdolist_list_var = v_clustering;
            SubLObject cluster1 = NIL;
            for (cluster1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cluster1 = cdolist_list_var.first()) {
                i = add(i, ONE_INTEGER);
                {
                    SubLObject cdolist_list_var_6 = nthcdr(i, v_clustering);
                    SubLObject cluster2 = NIL;
                    for (cluster2 = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , cluster2 = cdolist_list_var_6.first()) {
                        sim = cluster_complete_link_sim(cluster1, cluster2, sim_func);
                        if (sim.numGE(max_sim)) {
                            max_pair = cons(cluster1, cluster2);
                            max_sim = sim;
                        }
                    }
                }
            }
            return values(max_pair.first(), max_pair.rest(), max_sim);
        }
    }

    /**
     *
     *
     * @param CLUSTERING
    listp;
     * 		
     * @param SIM-FUNC
     * 		symbolp; a binary function symbol returning a similarity
     * 		value when applied to any two of OBJECTS, with higher values indicating
     * 		higher similarity
     * @return values; the two most similar clusters in CLUSTERING, according to SIM-FUNC,
    and their similarity
     */
    @LispMethod(comment = "@param CLUSTERING\nlistp;\r\n\t\t\r\n@param SIM-FUNC\r\n\t\tsymbolp; a binary function symbol returning a similarity\r\n\t\tvalue when applied to any two of OBJECTS, with higher values indicating\r\n\t\thigher similarity\r\n@return values; the two most similar clusters in CLUSTERING, according to SIM-FUNC,\r\nand their similarity")
    public static SubLObject cluster_max_sim(final SubLObject v_clustering, final SubLObject sim_func) {
        SubLObject max_pair = cons(v_clustering.first(), second(v_clustering));
        SubLObject max_sim = cluster_complete_link_sim(max_pair.first(), max_pair.rest(), sim_func);
        SubLObject i = ZERO_INTEGER;
        SubLObject sim = NIL;
        SubLObject cdolist_list_var = v_clustering;
        SubLObject cluster1 = NIL;
        cluster1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            i = add(i, ONE_INTEGER);
            SubLObject cdolist_list_var_$6 = nthcdr(i, v_clustering);
            SubLObject cluster2 = NIL;
            cluster2 = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                sim = cluster_complete_link_sim(cluster1, cluster2, sim_func);
                if (sim.numGE(max_sim)) {
                    max_pair = cons(cluster1, cluster2);
                    max_sim = sim;
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                cluster2 = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cluster1 = cdolist_list_var.first();
        } 
        return values(max_pair.first(), max_pair.rest(), max_sim);
    }

    /**
     * stores the pairwise similarities of ELEMENTS in *cluster-element-sim-cache*
     */
    @LispMethod(comment = "stores the pairwise similarities of ELEMENTS in *cluster-element-sim-cache*")
    public static final SubLObject initialize_cluster_sim_cache_alt(SubLObject elements, SubLObject sim_func) {
        SubLTrampolineFile.checkType(elements, LISTP);
        SubLTrampolineFile.checkType(sim_func, SYMBOLP);
        {
            SubLObject i = ZERO_INTEGER;
            SubLObject v_cache = make_hash_table(number_utilities.square(length(elements)), EQUAL, UNPROVIDED);
            SubLObject cdolist_list_var = elements;
            SubLObject element1 = NIL;
            for (element1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element1 = cdolist_list_var.first()) {
                i = add(i, ONE_INTEGER);
                {
                    SubLObject remaining = NIL;
                    SubLObject element2 = NIL;
                    for (remaining = nthcdr(i, elements), element2 = remaining.first(); NIL != remaining; remaining = remaining.rest() , element2 = remaining.first()) {
                        sethash(cons(element1, element2), v_cache, funcall(sim_func, element1, element2));
                    }
                }
            }
            $cluster_element_sim_cache$.setDynamicValue(v_cache);
            return v_cache;
        }
    }

    @LispMethod(comment = "stores the pairwise similarities of ELEMENTS in *cluster-element-sim-cache*")
    public static SubLObject initialize_cluster_sim_cache(final SubLObject elements, final SubLObject sim_func) {
        assert NIL != listp(elements) : "! listp(elements) " + ("Types.listp(elements) " + "CommonSymbols.NIL != Types.listp(elements) ") + elements;
        assert NIL != symbolp(sim_func) : "! symbolp(sim_func) " + ("Types.symbolp(sim_func) " + "CommonSymbols.NIL != Types.symbolp(sim_func) ") + sim_func;
        SubLObject i = ZERO_INTEGER;
        final SubLObject v_cache = make_hash_table(number_utilities.square(length(elements)), EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = elements;
        SubLObject element1 = NIL;
        element1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            i = add(i, ONE_INTEGER);
            SubLObject remaining = NIL;
            SubLObject element2 = NIL;
            remaining = nthcdr(i, elements);
            element2 = remaining.first();
            while (NIL != remaining) {
                sethash(cons(element1, element2), v_cache, funcall(sim_func, element1, element2));
                remaining = remaining.rest();
                element2 = remaining.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            element1 = cdolist_list_var.first();
        } 
        $cluster_element_sim_cache$.setDynamicValue(v_cache);
        return v_cache;
    }/**
     * stores the pairwise similarities of ELEMENTS in *cluster-element-sim-cache*
     */


    /**
     * clearn the cluster similarity cache
     */
    @LispMethod(comment = "clearn the cluster similarity cache")
    public static final SubLObject finalize_cluster_sim_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash($cluster_element_sim_cache$.getDynamicValue(thread));
            $cluster_element_sim_cache$.setDynamicValue(NIL, thread);
            return $cluster_element_sim_cache$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "clearn the cluster similarity cache")
    public static SubLObject finalize_cluster_sim_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($cluster_element_sim_cache$.getDynamicValue(thread));
        $cluster_element_sim_cache$.setDynamicValue(NIL, thread);
        return $cluster_element_sim_cache$.getDynamicValue(thread);
    }/**
     * clearn the cluster similarity cache
     */


    public static SubLObject declare_clustering_file() {
        declareFunction("cluster_print_function_trampoline", "CLUSTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cluster_p", "CLUSTER-P", 1, 0, false);
        new clustering.$cluster_p$UnaryFunction();
        declareFunction("cluster_elements", "CLUSTER-ELEMENTS", 1, 0, false);
        declareFunction("cluster_subclusters", "CLUSTER-SUBCLUSTERS", 1, 0, false);
        declareFunction("_csetf_cluster_elements", "_CSETF-CLUSTER-ELEMENTS", 2, 0, false);
        declareFunction("_csetf_cluster_subclusters", "_CSETF-CLUSTER-SUBCLUSTERS", 2, 0, false);
        declareFunction("make_cluster", "MAKE-CLUSTER", 0, 1, false);
        declareFunction("visit_defstruct_cluster", "VISIT-DEFSTRUCT-CLUSTER", 2, 0, false);
        declareFunction("visit_defstruct_object_cluster_method", "VISIT-DEFSTRUCT-OBJECT-CLUSTER-METHOD", 2, 0, false);
        declareFunction("print_cluster", "PRINT-CLUSTER", 3, 0, false);
        declareFunction("cluster_cardinality", "CLUSTER-CARDINALITY", 1, 0, false);
        declareFunction("clusterG", "CLUSTER>", 2, 0, false);
        declareFunction("pprint_cluster", "PPRINT-CLUSTER", 3, 0, false);
        declareFunction("new_cluster", "NEW-CLUSTER", 1, 0, false);
        declareFunction("cluster_merge", "CLUSTER-MERGE", 2, 0, false);
        declareFunction("cluster_complete_link_sim", "CLUSTER-COMPLETE-LINK-SIM", 3, 0, false);
        declareFunction("cluster_single_link_sim", "CLUSTER-SINGLE-LINK-SIM", 3, 0, false);
        declareFunction("cluster", "CLUSTER", 2, 2, false);
        declareFunction("cluster_max_sim", "CLUSTER-MAX-SIM", 2, 0, false);
        declareFunction("initialize_cluster_sim_cache", "INITIALIZE-CLUSTER-SIM-CACHE", 2, 0, false);
        declareFunction("finalize_cluster_sim_cache", "FINALIZE-CLUSTER-SIM-CACHE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_clustering_file() {
        defparameter("*CLUSTER-ELEMENT-SIM-CACHE*", $str0$a_cache_for_the_similarity_betwee);
        defconstant("*DTP-CLUSTER*", CLUSTER);
        return NIL;
    }

    public static SubLObject setup_clustering_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cluster$.getGlobalValue(), symbol_function(CLUSTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(CLUSTER_ELEMENTS, _CSETF_CLUSTER_ELEMENTS);
        def_csetf(CLUSTER_SUBCLUSTERS, _CSETF_CLUSTER_SUBCLUSTERS);
        identity(CLUSTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cluster$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CLUSTER_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_clustering_file();
    }

    @Override
    public void initializeVariables() {
        init_clustering_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_clustering_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$a_cache_for_the_similarity_betwee = makeString("a cache for the similarity between individual cluster elements");

    public static final class $cluster_p$UnaryFunction extends UnaryFunction {
        public $cluster_p$UnaryFunction() {
            super(extractFunctionNamed("CLUSTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cluster_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("ELEMENTS"), makeSymbol("SUBCLUSTERS"));

    static private final SubLList $list_alt4 = list(makeKeyword("ELEMENTS"), makeKeyword("SUBCLUSTERS"));

    static private final SubLList $list_alt5 = list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER-SUBCLUSTERS"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-CLUSTER-ELEMENTS"), makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS"));

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__CLUSTER__ = makeString("#<CLUSTER: ");

    static private final SubLString $str_alt17$_ = makeString(">");
}

/**
 * Total time: 156 ms
 */

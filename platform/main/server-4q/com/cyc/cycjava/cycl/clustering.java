package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.clustering;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.clustering.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.clustering.*; 
 public final class clustering extends SubLTranslatedFile {
    public static final SubLFile me = new clustering();

    public static final String myName = "com.cyc.cycjava.cycl.clustering";

    public static final String myFingerPrint = "2dd193c87115efd6025d63ef9c4775fa034490727f6a7c111ee0b63757826813";

    // defparameter
    private static final SubLSymbol $cluster_element_sim_cache$ = makeSymbol("*CLUSTER-ELEMENT-SIM-CACHE*");

    // defconstant
    public static final SubLSymbol $dtp_cluster$ = makeSymbol("*DTP-CLUSTER*");

    // Internal Constants
    public static final SubLString $str0$a_cache_for_the_similarity_betwee = makeString("a cache for the similarity between individual cluster elements");



    public static final SubLSymbol CLUSTER_P = makeSymbol("CLUSTER-P");

    public static final SubLList $list3 = list(makeSymbol("ELEMENTS"), makeSymbol("SUBCLUSTERS"));

    public static final SubLList $list4 = list(makeKeyword("ELEMENTS"), makeKeyword("SUBCLUSTERS"));

    public static final SubLList $list5 = list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER-SUBCLUSTERS"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-CLUSTER-ELEMENTS"), makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS"));

    public static final SubLSymbol PRINT_CLUSTER = makeSymbol("PRINT-CLUSTER");

    public static final SubLSymbol CLUSTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CLUSTER-PRINT-FUNCTION-TRAMPOLINE");

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







    public static SubLObject cluster_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cluster(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cluster_p(final SubLObject v_object) {
        return v_object.getClass() == $cluster_native.class ? T : NIL;
    }

    public static SubLObject cluster_elements(final SubLObject v_object) {
        assert NIL != cluster_p(v_object) : "clustering.cluster_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cluster_subclusters(final SubLObject v_object) {
        assert NIL != cluster_p(v_object) : "clustering.cluster_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_cluster_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != cluster_p(v_object) : "clustering.cluster_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cluster_subclusters(final SubLObject v_object, final SubLObject value) {
        assert NIL != cluster_p(v_object) : "clustering.cluster_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_cluster(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cluster_native();
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

    public static SubLObject print_cluster(final SubLObject cluster, final SubLObject stream, final SubLObject depth) {
        return pprint_cluster(cluster, stream, ZERO_INTEGER);
    }

    public static SubLObject cluster_cardinality(final SubLObject cluster) {
        assert NIL != cluster_p(cluster) : "clustering.cluster_p(cluster) " + "CommonSymbols.NIL != clustering.cluster_p(cluster) " + cluster;
        return length(cluster_elements(cluster));
    }

    public static SubLObject clusterG(final SubLObject cluster1, final SubLObject cluster2) {
        assert NIL != cluster_p(cluster1) : "clustering.cluster_p(cluster1) " + "CommonSymbols.NIL != clustering.cluster_p(cluster1) " + cluster1;
        assert NIL != cluster_p(cluster2) : "clustering.cluster_p(cluster2) " + "CommonSymbols.NIL != clustering.cluster_p(cluster2) " + cluster2;
        return numG(cluster_cardinality(cluster1), cluster_cardinality(cluster2));
    }

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

    public static SubLObject new_cluster(final SubLObject elements) {
        final SubLObject cluster = make_cluster(UNPROVIDED);
        _csetf_cluster_elements(cluster, elements);
        return cluster;
    }

    public static SubLObject cluster_merge(final SubLObject cluster1, final SubLObject cluster2) {
        final SubLObject cluster3 = make_cluster(UNPROVIDED);
        _csetf_cluster_elements(cluster3, append(cluster_elements(cluster1), cluster_elements(cluster2)));
        _csetf_cluster_subclusters(cluster3, list(cluster1, cluster2));
        return cluster3;
    }

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

    public static SubLObject cluster(final SubLObject objects, final SubLObject sim_func, SubLObject k, SubLObject min_sim) {
        if (k == UNPROVIDED) {
            k = ONE_INTEGER;
        }
        if (min_sim == UNPROVIDED) {
            min_sim = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(objects) : "Types.listp(objects) " + "CommonSymbols.NIL != Types.listp(objects) " + objects;
        assert NIL != symbolp(sim_func) : "Types.symbolp(sim_func) " + "CommonSymbols.NIL != Types.symbolp(sim_func) " + sim_func;
        assert NIL != subl_promotions.positive_integer_p(k) : "subl_promotions.positive_integer_p(k) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(k) " + k;
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

    public static SubLObject initialize_cluster_sim_cache(final SubLObject elements, final SubLObject sim_func) {
        assert NIL != listp(elements) : "Types.listp(elements) " + "CommonSymbols.NIL != Types.listp(elements) " + elements;
        assert NIL != symbolp(sim_func) : "Types.symbolp(sim_func) " + "CommonSymbols.NIL != Types.symbolp(sim_func) " + sim_func;
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
    }

    public static SubLObject finalize_cluster_sim_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($cluster_element_sim_cache$.getDynamicValue(thread));
        $cluster_element_sim_cache$.setDynamicValue(NIL, thread);
        return $cluster_element_sim_cache$.getDynamicValue(thread);
    }

    public static SubLObject declare_clustering_file() {
        declareFunction(me, "cluster_print_function_trampoline", "CLUSTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cluster_p", "CLUSTER-P", 1, 0, false);
        new clustering.$cluster_p$UnaryFunction();
        declareFunction(me, "cluster_elements", "CLUSTER-ELEMENTS", 1, 0, false);
        declareFunction(me, "cluster_subclusters", "CLUSTER-SUBCLUSTERS", 1, 0, false);
        declareFunction(me, "_csetf_cluster_elements", "_CSETF-CLUSTER-ELEMENTS", 2, 0, false);
        declareFunction(me, "_csetf_cluster_subclusters", "_CSETF-CLUSTER-SUBCLUSTERS", 2, 0, false);
        declareFunction(me, "make_cluster", "MAKE-CLUSTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_cluster", "VISIT-DEFSTRUCT-CLUSTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cluster_method", "VISIT-DEFSTRUCT-OBJECT-CLUSTER-METHOD", 2, 0, false);
        declareFunction(me, "print_cluster", "PRINT-CLUSTER", 3, 0, false);
        declareFunction(me, "cluster_cardinality", "CLUSTER-CARDINALITY", 1, 0, false);
        declareFunction(me, "clusterG", "CLUSTER>", 2, 0, false);
        declareFunction(me, "pprint_cluster", "PPRINT-CLUSTER", 3, 0, false);
        declareFunction(me, "new_cluster", "NEW-CLUSTER", 1, 0, false);
        declareFunction(me, "cluster_merge", "CLUSTER-MERGE", 2, 0, false);
        declareFunction(me, "cluster_complete_link_sim", "CLUSTER-COMPLETE-LINK-SIM", 3, 0, false);
        declareFunction(me, "cluster_single_link_sim", "CLUSTER-SINGLE-LINK-SIM", 3, 0, false);
        declareFunction(me, "cluster", "CLUSTER", 2, 2, false);
        declareFunction(me, "cluster_max_sim", "CLUSTER-MAX-SIM", 2, 0, false);
        declareFunction(me, "initialize_cluster_sim_cache", "INITIALIZE-CLUSTER-SIM-CACHE", 2, 0, false);
        declareFunction(me, "finalize_cluster_sim_cache", "FINALIZE-CLUSTER-SIM-CACHE", 0, 0, false);
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

    public static final class $cluster_native extends SubLStructNative {
        public SubLObject $elements;

        public SubLObject $subclusters;

        private static final SubLStructDeclNative structDecl;

        private $cluster_native() {
            this.$elements = Lisp.NIL;
            this.$subclusters = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$elements;
        }

        @Override
        public SubLObject getField3() {
            return this.$subclusters;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$elements = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$subclusters = value;
        }

        static {
            structDecl = makeStructDeclNative($cluster_native.class, CLUSTER, CLUSTER_P, $list3, $list4, new String[]{ "$elements", "$subclusters" }, $list5, $list6, PRINT_CLUSTER);
        }
    }

    public static final class $cluster_p$UnaryFunction extends UnaryFunction {
        public $cluster_p$UnaryFunction() {
            super(extractFunctionNamed("CLUSTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cluster_p(arg1);
        }
    }
}

/**
 * Total time: 156 ms
 */

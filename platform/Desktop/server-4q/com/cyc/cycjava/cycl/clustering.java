package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clustering extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.clustering";
    public static final String myFingerPrint = "2dd193c87115efd6025d63ef9c4775fa034490727f6a7c111ee0b63757826813";
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1421L)
    private static SubLSymbol $cluster_element_sim_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLSymbol $dtp_cluster$;
    private static final SubLString $str0$a_cache_for_the_similarity_betwee;
    private static final SubLSymbol $sym1$CLUSTER;
    private static final SubLSymbol $sym2$CLUSTER_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_CLUSTER;
    private static final SubLSymbol $sym8$CLUSTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CLUSTER_ELEMENTS;
    private static final SubLSymbol $sym11$_CSETF_CLUSTER_ELEMENTS;
    private static final SubLSymbol $sym12$CLUSTER_SUBCLUSTERS;
    private static final SubLSymbol $sym13$_CSETF_CLUSTER_SUBCLUSTERS;
    private static final SubLSymbol $kw14$ELEMENTS;
    private static final SubLSymbol $kw15$SUBCLUSTERS;
    private static final SubLString $str16$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw17$BEGIN;
    private static final SubLSymbol $sym18$MAKE_CLUSTER;
    private static final SubLSymbol $kw19$SLOT;
    private static final SubLSymbol $kw20$END;
    private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_CLUSTER_METHOD;
    private static final SubLString $str22$__CLUSTER__;
    private static final SubLString $str23$_;
    private static final SubLSymbol $sym24$LISTP;
    private static final SubLSymbol $sym25$SYMBOLP;
    private static final SubLSymbol $sym26$POSITIVE_INTEGER_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject cluster_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cluster(v_object, stream, (SubLObject)clustering.ZERO_INTEGER);
        return (SubLObject)clustering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject cluster_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cluster_native.class) ? clustering.T : clustering.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject cluster_elements(final SubLObject v_object) {
        assert clustering.NIL != cluster_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject cluster_subclusters(final SubLObject v_object) {
        assert clustering.NIL != cluster_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject _csetf_cluster_elements(final SubLObject v_object, final SubLObject value) {
        assert clustering.NIL != cluster_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject _csetf_cluster_subclusters(final SubLObject v_object, final SubLObject value) {
        assert clustering.NIL != cluster_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject make_cluster(SubLObject arglist) {
        if (arglist == clustering.UNPROVIDED) {
            arglist = (SubLObject)clustering.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cluster_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)clustering.NIL, next = arglist; clustering.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)clustering.$kw14$ELEMENTS)) {
                _csetf_cluster_elements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)clustering.$kw15$SUBCLUSTERS)) {
                _csetf_cluster_subclusters(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)clustering.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject visit_defstruct_cluster(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)clustering.$kw17$BEGIN, (SubLObject)clustering.$sym18$MAKE_CLUSTER, (SubLObject)clustering.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)clustering.$kw19$SLOT, (SubLObject)clustering.$kw14$ELEMENTS, cluster_elements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)clustering.$kw19$SLOT, (SubLObject)clustering.$kw15$SUBCLUSTERS, cluster_subclusters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)clustering.$kw20$END, (SubLObject)clustering.$sym18$MAKE_CLUSTER, (SubLObject)clustering.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1591L)
    public static SubLObject visit_defstruct_object_cluster_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cluster(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1797L)
    public static SubLObject print_cluster(final SubLObject cluster, final SubLObject stream, final SubLObject depth) {
        return pprint_cluster(cluster, stream, (SubLObject)clustering.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 1957L)
    public static SubLObject cluster_cardinality(final SubLObject cluster) {
        assert clustering.NIL != cluster_p(cluster) : cluster;
        return Sequences.length(cluster_elements(cluster));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 2151L)
    public static SubLObject clusterG(final SubLObject cluster1, final SubLObject cluster2) {
        assert clustering.NIL != cluster_p(cluster1) : cluster1;
        assert clustering.NIL != cluster_p(cluster2) : cluster2;
        return Numbers.numG(cluster_cardinality(cluster1), cluster_cardinality(cluster2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 2412L)
    public static SubLObject pprint_cluster(final SubLObject cluster, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = (SubLObject)clustering.FOUR_INTEGER;
        final SubLObject base_column = Numbers.multiply(level, indent);
        string_utilities.indent(stream, base_column);
        streams_high.write_string((SubLObject)clustering.$str22$__CLUSTER__, stream, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED);
        if (clustering.NIL != cluster_subclusters(cluster)) {
            streams_high.terpri(stream);
            SubLObject cdolist_list_var = cluster_subclusters(cluster);
            SubLObject subcluster = (SubLObject)clustering.NIL;
            subcluster = cdolist_list_var.first();
            while (clustering.NIL != cdolist_list_var) {
                pprint_cluster(subcluster, stream, number_utilities.f_1X(level));
                cdolist_list_var = cdolist_list_var.rest();
                subcluster = cdolist_list_var.first();
            }
            string_utilities.indent(stream, base_column);
        }
        else {
            print_high.princ(cluster_elements(cluster), stream);
        }
        streams_high.write_string((SubLObject)clustering.$str23$_, stream, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED);
        streams_high.terpri(stream);
        return cluster;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 2971L)
    public static SubLObject new_cluster(final SubLObject elements) {
        final SubLObject cluster = make_cluster((SubLObject)clustering.UNPROVIDED);
        _csetf_cluster_elements(cluster, elements);
        return cluster;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 3236L)
    public static SubLObject cluster_merge(final SubLObject cluster1, final SubLObject cluster2) {
        final SubLObject cluster3 = make_cluster((SubLObject)clustering.UNPROVIDED);
        _csetf_cluster_elements(cluster3, ConsesLow.append(cluster_elements(cluster1), cluster_elements(cluster2)));
        _csetf_cluster_subclusters(cluster3, (SubLObject)ConsesLow.list(cluster1, cluster2));
        return cluster3;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 3654L)
    public static SubLObject cluster_complete_link_sim(final SubLObject cluster1, final SubLObject cluster2, final SubLObject sim_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements1 = cluster_elements(cluster1);
        final SubLObject elements2 = cluster_elements(cluster2);
        SubLObject min_sim = Functions.funcall(sim_func, elements1.first(), elements2.first());
        SubLObject sim = (SubLObject)clustering.NIL;
        SubLObject cdolist_list_var = elements1;
        SubLObject element1 = (SubLObject)clustering.NIL;
        element1 = cdolist_list_var.first();
        while (clustering.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = elements2;
            SubLObject element2 = (SubLObject)clustering.NIL;
            element2 = cdolist_list_var_$1.first();
            while (clustering.NIL != cdolist_list_var_$1) {
                sim = Hashtables.gethash((SubLObject)ConsesLow.cons(element1, element2), clustering.$cluster_element_sim_cache$.getDynamicValue(thread), (SubLObject)clustering.UNPROVIDED);
                if (clustering.NIL == sim) {
                    sim = Hashtables.gethash((SubLObject)ConsesLow.cons(element2, element1), clustering.$cluster_element_sim_cache$.getDynamicValue(thread), (SubLObject)clustering.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 4458L)
    public static SubLObject cluster_single_link_sim(final SubLObject cluster1, final SubLObject cluster2, final SubLObject sim_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements1 = cluster_elements(cluster1);
        final SubLObject elements2 = cluster_elements(cluster2);
        SubLObject max_sim = Functions.funcall(sim_func, elements1.first(), elements2.first());
        SubLObject sim = (SubLObject)clustering.NIL;
        SubLObject cdolist_list_var = elements1;
        SubLObject element1 = (SubLObject)clustering.NIL;
        element1 = cdolist_list_var.first();
        while (clustering.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = elements2;
            SubLObject element2 = (SubLObject)clustering.NIL;
            element2 = cdolist_list_var_$2.first();
            while (clustering.NIL != cdolist_list_var_$2) {
                sim = Hashtables.gethash((SubLObject)ConsesLow.cons(element1, element2), clustering.$cluster_element_sim_cache$.getDynamicValue(thread), (SubLObject)clustering.UNPROVIDED);
                if (clustering.NIL == sim) {
                    sim = Hashtables.gethash((SubLObject)ConsesLow.cons(element2, element1), clustering.$cluster_element_sim_cache$.getDynamicValue(thread), (SubLObject)clustering.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 5248L)
    public static SubLObject cluster(final SubLObject objects, final SubLObject sim_func, SubLObject k, SubLObject min_sim) {
        if (k == clustering.UNPROVIDED) {
            k = (SubLObject)clustering.ONE_INTEGER;
        }
        if (min_sim == clustering.UNPROVIDED) {
            min_sim = (SubLObject)clustering.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert clustering.NIL != Types.listp(objects) : objects;
        assert clustering.NIL != Types.symbolp(sim_func) : sim_func;
        assert clustering.NIL != subl_promotions.positive_integer_p(k) : k;
        SubLObject v_clustering = (SubLObject)clustering.NIL;
        SubLObject sim_limit_reachedP = (SubLObject)clustering.NIL;
        SubLObject cluster1 = (SubLObject)clustering.NIL;
        SubLObject cluster2 = (SubLObject)clustering.NIL;
        SubLObject sim = (SubLObject)clustering.NIL;
        initialize_cluster_sim_cache(objects, sim_func);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)clustering.NIL;
        v_object = cdolist_list_var.first();
        while (clustering.NIL != cdolist_list_var) {
            v_clustering = (SubLObject)ConsesLow.cons(new_cluster((SubLObject)ConsesLow.list(v_object)), v_clustering);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        while (!Sequences.length(v_clustering).numLE(k) && clustering.NIL == sim_limit_reachedP) {
            thread.resetMultipleValues();
            final SubLObject cluster1_$3 = cluster_max_sim(v_clustering, sim_func);
            final SubLObject cluster2_$4 = thread.secondMultipleValue();
            final SubLObject sim_$5 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            cluster1 = cluster1_$3;
            cluster2 = cluster2_$4;
            sim = sim_$5;
            if (clustering.NIL != min_sim) {
                sim_limit_reachedP = Numbers.numL(sim, min_sim);
            }
            if (clustering.NIL == sim_limit_reachedP) {
                v_clustering = Sequences.delete(cluster1, v_clustering, (SubLObject)clustering.EQ, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED);
                v_clustering = Sequences.delete(cluster2, v_clustering, (SubLObject)clustering.EQ, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED, (SubLObject)clustering.UNPROVIDED);
                v_clustering = (SubLObject)ConsesLow.cons(cluster_merge(cluster1, cluster2), v_clustering);
            }
        }
        finalize_cluster_sim_cache();
        return v_clustering;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 7023L)
    public static SubLObject cluster_max_sim(final SubLObject v_clustering, final SubLObject sim_func) {
        SubLObject max_pair = (SubLObject)ConsesLow.cons(v_clustering.first(), conses_high.second(v_clustering));
        SubLObject max_sim = cluster_complete_link_sim(max_pair.first(), max_pair.rest(), sim_func);
        SubLObject i = (SubLObject)clustering.ZERO_INTEGER;
        SubLObject sim = (SubLObject)clustering.NIL;
        SubLObject cdolist_list_var = v_clustering;
        SubLObject cluster1 = (SubLObject)clustering.NIL;
        cluster1 = cdolist_list_var.first();
        while (clustering.NIL != cdolist_list_var) {
            i = Numbers.add(i, (SubLObject)clustering.ONE_INTEGER);
            SubLObject cdolist_list_var_$6 = conses_high.nthcdr(i, v_clustering);
            SubLObject cluster2 = (SubLObject)clustering.NIL;
            cluster2 = cdolist_list_var_$6.first();
            while (clustering.NIL != cdolist_list_var_$6) {
                sim = cluster_complete_link_sim(cluster1, cluster2, sim_func);
                if (sim.numGE(max_sim)) {
                    max_pair = (SubLObject)ConsesLow.cons(cluster1, cluster2);
                    max_sim = sim;
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                cluster2 = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            cluster1 = cdolist_list_var.first();
        }
        return Values.values(max_pair.first(), max_pair.rest(), max_sim);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 7873L)
    public static SubLObject initialize_cluster_sim_cache(final SubLObject elements, final SubLObject sim_func) {
        assert clustering.NIL != Types.listp(elements) : elements;
        assert clustering.NIL != Types.symbolp(sim_func) : sim_func;
        SubLObject i = (SubLObject)clustering.ZERO_INTEGER;
        final SubLObject v_cache = Hashtables.make_hash_table(number_utilities.square(Sequences.length(elements)), (SubLObject)clustering.EQUAL, (SubLObject)clustering.UNPROVIDED);
        SubLObject cdolist_list_var = elements;
        SubLObject element1 = (SubLObject)clustering.NIL;
        element1 = cdolist_list_var.first();
        while (clustering.NIL != cdolist_list_var) {
            i = Numbers.add(i, (SubLObject)clustering.ONE_INTEGER);
            SubLObject remaining = (SubLObject)clustering.NIL;
            SubLObject element2 = (SubLObject)clustering.NIL;
            remaining = conses_high.nthcdr(i, elements);
            element2 = remaining.first();
            while (clustering.NIL != remaining) {
                Hashtables.sethash((SubLObject)ConsesLow.cons(element1, element2), v_cache, Functions.funcall(sim_func, element1, element2));
                remaining = remaining.rest();
                element2 = remaining.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            element1 = cdolist_list_var.first();
        }
        clustering.$cluster_element_sim_cache$.setDynamicValue(v_cache);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clustering.lisp", position = 8543L)
    public static SubLObject finalize_cluster_sim_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.clrhash(clustering.$cluster_element_sim_cache$.getDynamicValue(thread));
        clustering.$cluster_element_sim_cache$.setDynamicValue((SubLObject)clustering.NIL, thread);
        return clustering.$cluster_element_sim_cache$.getDynamicValue(thread);
    }
    
    public static SubLObject declare_clustering_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_print_function_trampoline", "CLUSTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_p", "CLUSTER-P", 1, 0, false);
        new $cluster_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_elements", "CLUSTER-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_subclusters", "CLUSTER-SUBCLUSTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "_csetf_cluster_elements", "_CSETF-CLUSTER-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "_csetf_cluster_subclusters", "_CSETF-CLUSTER-SUBCLUSTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "make_cluster", "MAKE-CLUSTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "visit_defstruct_cluster", "VISIT-DEFSTRUCT-CLUSTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "visit_defstruct_object_cluster_method", "VISIT-DEFSTRUCT-OBJECT-CLUSTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "print_cluster", "PRINT-CLUSTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_cardinality", "CLUSTER-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "clusterG", "CLUSTER>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "pprint_cluster", "PPRINT-CLUSTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "new_cluster", "NEW-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_merge", "CLUSTER-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_complete_link_sim", "CLUSTER-COMPLETE-LINK-SIM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_single_link_sim", "CLUSTER-SINGLE-LINK-SIM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster", "CLUSTER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "cluster_max_sim", "CLUSTER-MAX-SIM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "initialize_cluster_sim_cache", "INITIALIZE-CLUSTER-SIM-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clustering", "finalize_cluster_sim_cache", "FINALIZE-CLUSTER-SIM-CACHE", 0, 0, false);
        return (SubLObject)clustering.NIL;
    }
    
    public static SubLObject init_clustering_file() {
        clustering.$cluster_element_sim_cache$ = SubLFiles.defparameter("*CLUSTER-ELEMENT-SIM-CACHE*", (SubLObject)clustering.$str0$a_cache_for_the_similarity_betwee);
        clustering.$dtp_cluster$ = SubLFiles.defconstant("*DTP-CLUSTER*", (SubLObject)clustering.$sym1$CLUSTER);
        return (SubLObject)clustering.NIL;
    }
    
    public static SubLObject setup_clustering_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), clustering.$dtp_cluster$.getGlobalValue(), Symbols.symbol_function((SubLObject)clustering.$sym8$CLUSTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)clustering.$list9);
        Structures.def_csetf((SubLObject)clustering.$sym10$CLUSTER_ELEMENTS, (SubLObject)clustering.$sym11$_CSETF_CLUSTER_ELEMENTS);
        Structures.def_csetf((SubLObject)clustering.$sym12$CLUSTER_SUBCLUSTERS, (SubLObject)clustering.$sym13$_CSETF_CLUSTER_SUBCLUSTERS);
        Equality.identity((SubLObject)clustering.$sym1$CLUSTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), clustering.$dtp_cluster$.getGlobalValue(), Symbols.symbol_function((SubLObject)clustering.$sym21$VISIT_DEFSTRUCT_OBJECT_CLUSTER_METHOD));
        return (SubLObject)clustering.NIL;
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
        me = (SubLFile)new clustering();
        clustering.$cluster_element_sim_cache$ = null;
        clustering.$dtp_cluster$ = null;
        $str0$a_cache_for_the_similarity_betwee = SubLObjectFactory.makeString("a cache for the similarity between individual cluster elements");
        $sym1$CLUSTER = SubLObjectFactory.makeSymbol("CLUSTER");
        $sym2$CLUSTER_P = SubLObjectFactory.makeSymbol("CLUSTER-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLUSTERS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("SUBCLUSTERS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-SUBCLUSTERS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CLUSTER-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS"));
        $sym7$PRINT_CLUSTER = SubLObjectFactory.makeSymbol("PRINT-CLUSTER");
        $sym8$CLUSTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CLUSTER-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-P"));
        $sym10$CLUSTER_ELEMENTS = SubLObjectFactory.makeSymbol("CLUSTER-ELEMENTS");
        $sym11$_CSETF_CLUSTER_ELEMENTS = SubLObjectFactory.makeSymbol("_CSETF-CLUSTER-ELEMENTS");
        $sym12$CLUSTER_SUBCLUSTERS = SubLObjectFactory.makeSymbol("CLUSTER-SUBCLUSTERS");
        $sym13$_CSETF_CLUSTER_SUBCLUSTERS = SubLObjectFactory.makeSymbol("_CSETF-CLUSTER-SUBCLUSTERS");
        $kw14$ELEMENTS = SubLObjectFactory.makeKeyword("ELEMENTS");
        $kw15$SUBCLUSTERS = SubLObjectFactory.makeKeyword("SUBCLUSTERS");
        $str16$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw17$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym18$MAKE_CLUSTER = SubLObjectFactory.makeSymbol("MAKE-CLUSTER");
        $kw19$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw20$END = SubLObjectFactory.makeKeyword("END");
        $sym21$VISIT_DEFSTRUCT_OBJECT_CLUSTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CLUSTER-METHOD");
        $str22$__CLUSTER__ = SubLObjectFactory.makeString("#<CLUSTER: ");
        $str23$_ = SubLObjectFactory.makeString(">");
        $sym24$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym25$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym26$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
    }
    
    public static final class $cluster_native extends SubLStructNative
    {
        public SubLObject $elements;
        public SubLObject $subclusters;
        private static final SubLStructDeclNative structDecl;
        
        public $cluster_native() {
            this.$elements = (SubLObject)CommonSymbols.NIL;
            this.$subclusters = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cluster_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$cluster_native.class, clustering.$sym1$CLUSTER, clustering.$sym2$CLUSTER_P, clustering.$list3, clustering.$list4, new String[] { "$elements", "$subclusters" }, clustering.$list5, clustering.$list6, clustering.$sym7$PRINT_CLUSTER);
        }
    }
    
    public static final class $cluster_p$UnaryFunction extends UnaryFunction
    {
        public $cluster_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLUSTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clustering.cluster_p(arg1);
        }
    }
}

/*

	Total time: 156 ms
	
*/
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.exp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NEURAL-NET
 * source file: /cyc/top/cycl/neural-net.lisp
 * created:     2019/07/03 17:37:41
 */
public final class neural_net extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new neural_net();

 public static final String myName = "com.cyc.cycjava.cycl.neural_net";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_neural_net$ = makeSymbol("*DTP-NEURAL-NET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_nn_input_node$ = makeSymbol("*DTP-NN-INPUT-NODE*");

    // deflexical
    /**
     * From Champ0_19.gnm, with the first list of weights moved to the end (the bias
     * node weights)
     */
    @LispMethod(comment = "From Champ0_19.gnm, with the first list of weights moved to the end (the bias\r\nnode weights)\ndeflexical\nFrom Champ0_19.gnm, with the first list of weights moved to the end (the bias\nnode weights)")
    private static final SubLSymbol $rl_tactician_neural_net_weights_list$ = makeSymbol("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $test_rl_tactician_evaluate_neural_net_tolerance$ = makeSymbol("*TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-TOLERANCE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol NEURAL_NET = makeSymbol("NEURAL-NET");

    private static final SubLSymbol NEURAL_NET_P = makeSymbol("NEURAL-NET-P");

    static private final SubLList $list2 = list(makeSymbol("INPUT-NODES"));

    static private final SubLList $list3 = list(makeKeyword("INPUT-NODES"));

    static private final SubLList $list4 = list(makeSymbol("NN-INPUT-NODES"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-NN-INPUT-NODES"));

    private static final SubLSymbol NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEURAL-NET-P"));

    private static final SubLSymbol NN_INPUT_NODES = makeSymbol("NN-INPUT-NODES");

    private static final SubLSymbol _CSETF_NN_INPUT_NODES = makeSymbol("_CSETF-NN-INPUT-NODES");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_NEURAL_NET = makeSymbol("MAKE-NEURAL-NET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEURAL-NET-METHOD");

    private static final SubLString $str19$Expected__s_to_be__a_elements_lon = makeString("Expected ~s to be ~a elements long.");

    private static final SubLFloat $float$4_924273 = makeDouble(4.924273);

    private static final SubLSymbol NN_INPUT_NODE = makeSymbol("NN-INPUT-NODE");

    private static final SubLSymbol NN_INPUT_NODE_P = makeSymbol("NN-INPUT-NODE-P");

    private static final SubLList $list23 = list(makeSymbol("VALUE"), makeSymbol("WEIGHTS"));

    private static final SubLList $list24 = list(makeKeyword("VALUE"), makeKeyword("WEIGHTS"));

    private static final SubLList $list25 = list(makeSymbol("NNIN-VALUE"), makeSymbol("NNIN-WEIGHTS"));

    private static final SubLList $list26 = list(makeSymbol("_CSETF-NNIN-VALUE"), makeSymbol("_CSETF-NNIN-WEIGHTS"));

    private static final SubLSymbol NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list28 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NN-INPUT-NODE-P"));

    private static final SubLSymbol NNIN_VALUE = makeSymbol("NNIN-VALUE");

    private static final SubLSymbol _CSETF_NNIN_VALUE = makeSymbol("_CSETF-NNIN-VALUE");

    private static final SubLSymbol NNIN_WEIGHTS = makeSymbol("NNIN-WEIGHTS");

    private static final SubLSymbol _CSETF_NNIN_WEIGHTS = makeSymbol("_CSETF-NNIN-WEIGHTS");

    private static final SubLSymbol MAKE_NN_INPUT_NODE = makeSymbol("MAKE-NN-INPUT-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NN-INPUT-NODE-METHOD");

    private static final SubLList $list39 = list(new SubLObject[]{ list(makeDouble(-0.227514), makeDouble(-0.395681), makeDouble(-0.392587), makeDouble(-0.304583), makeDouble(0.717281)), list(makeDouble(0.466911), makeDouble(-1.01181), makeDouble(0.515608), makeDouble(0.186695), makeDouble(-0.173123)), list(makeDouble(0.691837), makeDouble(-0.39004), makeDouble(1.27718), makeDouble(0.0985643), makeDouble(-0.459222)), list(makeDouble(-0.14361), makeDouble(-0.100166), makeDouble(-0.409217), makeDouble(0.703923), makeDouble(0.0986236)), list(makeDouble(-0.558941), makeDouble(-0.654273), makeDouble(0.875859), makeDouble(-0.547818), makeDouble(0.464239)), list(makeDouble(-0.0898241), makeDouble(1.16297), makeDouble(-0.140286), makeDouble(0.727112), makeDouble(-0.0571363)), list(makeDouble(0.33211), makeDouble(0.804213), makeDouble(-0.500794), makeDouble(0.0836377), makeDouble(-0.119423)), list(makeDouble(-0.27839), makeDouble(-0.424287), makeDouble(0.0972779), makeDouble(-0.0641412), makeDouble(-0.324519)), list(makeDouble(-0.04071), makeDouble(-1.03764), makeDouble(-1.1684), makeDouble(-0.285568), makeDouble(0.322287)), list(makeDouble(0.35157), makeDouble(-0.0978135), makeDouble(-0.649702), makeDouble(1.0535), makeDouble(0.83717)), list(makeDouble(-0.0862237), makeDouble(0.22735), makeDouble(-1.21319), makeDouble(-0.531121), makeDouble(-0.486909)), list(makeDouble(0.256012), makeDouble(0.852522), makeDouble(-0.7396), makeDouble(0.233292), makeDouble(-0.0850184)), list(makeDouble(0.704154), makeDouble(-0.182174), makeDouble(0.169152), makeDouble(-1.2787), makeDouble(-0.400246)), list(makeDouble(0.242133), makeDouble(-0.671766), makeDouble(-1.05614), makeDouble(-0.0740336), makeDouble(-0.0432617)), list(makeDouble(-0.871448), makeDouble(0.0101277), makeDouble(0.221434), makeDouble(-0.0241337), makeDouble(-0.717193)), list(makeDouble(-0.228881), makeDouble(-0.132546), makeDouble(-0.240634), makeDouble(0.935199), makeDouble(0.111408)), list(makeDouble(0.456088), makeDouble(-0.189828), makeDouble(0.06841), makeDouble(-0.112433), makeDouble(-0.254772)), list(makeDouble(0.0838212), makeDouble(-0.901167), makeDouble(0.555404), makeDouble(0.126584), makeDouble(-1.13132)), list(makeDouble(0.927022), makeDouble(-0.294691), makeDouble(0.735027), makeDouble(0.42247), makeDouble(0.263537)), list(makeDouble(0.229667), makeDouble(-0.76629), makeDouble(1.13279), makeDouble(0.0468138), makeDouble(-0.392014)), list(makeDouble(0.565153), makeDouble(-0.082501), makeDouble(0.208606), makeDouble(0.101688), makeDouble(-0.672053)) });

    private static final SubLSymbol $rl_tactician_neural_net$ = makeSymbol("*RL-TACTICIAN-NEURAL-NET*");



    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLFloat $float$0_03 = makeDouble(0.03);

    private static final SubLFloat $float$0_97 = makeDouble(0.97);

    private static final SubLSymbol TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE = makeSymbol("TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-WITH-SOME-TOLERANCE");

    private static final SubLList $list52 = list(new SubLObject[]{ list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.85)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.94)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.24)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, ZERO_INTEGER, makeDouble(0.84)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeDouble(0.95)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, ZERO_INTEGER, makeDouble(0.28)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.97)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.87)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.02)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, makeDouble(0.97)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, ONE_INTEGER, makeDouble(0.91)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, ONE_INTEGER, makeDouble(0.04)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.017)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.018)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, THREE_INTEGER, makeDouble(0.012)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, FOUR_INTEGER, makeDouble(0.066)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.0019)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.53)), T), list(list(makeInteger(4000), THREE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.05)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, FOUR_INTEGER, makeDouble(0.0017)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, FOUR_INTEGER, makeDouble(0.066)), T) });

    public static final SubLObject neural_net_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject neural_net_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject neural_net_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.neural_net.$neural_net_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject neural_net_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.neural_net.$neural_net_native.class ? T : NIL;
    }

    public static final SubLObject nn_input_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NEURAL_NET_P);
        return v_object.getField2();
    }

    public static SubLObject nn_input_nodes(final SubLObject v_object) {
        assert NIL != neural_net_p(v_object) : "! neural_net.neural_net_p(v_object) " + "neural_net.neural_net_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_nn_input_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NEURAL_NET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_nn_input_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != neural_net_p(v_object) : "! neural_net.neural_net_p(v_object) " + "neural_net.neural_net_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_neural_net_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.neural_net.$neural_net_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INPUT_NODES)) {
                        _csetf_nn_input_nodes(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_neural_net(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.neural_net.$neural_net_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INPUT_NODES)) {
                _csetf_nn_input_nodes(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_neural_net(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NEURAL_NET, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INPUT_NODES, nn_input_nodes(obj));
        funcall(visitor_fn, obj, $END, MAKE_NEURAL_NET, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_neural_net_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_neural_net(obj, visitor_fn);
    }

    /**
     *
     *
     * @param WEIGHTS-LIST
     * 		listp; a list of lists.
     * 		The length of WEIGHTS-LIST is the number of input nodes.
     * 		The length of each list in WEIGHTS-LIST is the number of output nodes.
     */
    @LispMethod(comment = "@param WEIGHTS-LIST\r\n\t\tlistp; a list of lists.\r\n\t\tThe length of WEIGHTS-LIST is the number of input nodes.\r\n\t\tThe length of each list in WEIGHTS-LIST is the number of output nodes.")
    public static final SubLObject new_neural_net_alt(SubLObject weights_list) {
        SubLTrampolineFile.checkType(weights_list, CONSP);
        {
            SubLObject nn = make_neural_net(UNPROVIDED);
            SubLObject input_nodes = NIL;
            SubLObject cdolist_list_var = weights_list;
            SubLObject weights = NIL;
            for (weights = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , weights = cdolist_list_var.first()) {
                {
                    SubLObject node = new_nn_input_node(ZERO_INTEGER, weights);
                    input_nodes = cons(node, input_nodes);
                }
            }
            input_nodes = nreverse(input_nodes);
            _csetf_nn_input_nodes(nn, input_nodes);
            return nn;
        }
    }

    /**
     *
     *
     * @param WEIGHTS-LIST
     * 		listp; a list of lists.
     * 		The length of WEIGHTS-LIST is the number of input nodes.
     * 		The length of each list in WEIGHTS-LIST is the number of output nodes.
     */
    @LispMethod(comment = "@param WEIGHTS-LIST\r\n\t\tlistp; a list of lists.\r\n\t\tThe length of WEIGHTS-LIST is the number of input nodes.\r\n\t\tThe length of each list in WEIGHTS-LIST is the number of output nodes.")
    public static SubLObject new_neural_net(final SubLObject weights_list) {
        assert NIL != consp(weights_list) : "! consp(weights_list) " + ("Types.consp(weights_list) " + "CommonSymbols.NIL != Types.consp(weights_list) ") + weights_list;
        final SubLObject nn = make_neural_net(UNPROVIDED);
        SubLObject input_nodes = NIL;
        SubLObject cdolist_list_var = weights_list;
        SubLObject weights = NIL;
        weights = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node = new_nn_input_node(ZERO_INTEGER, weights);
            input_nodes = cons(node, input_nodes);
            cdolist_list_var = cdolist_list_var.rest();
            weights = cdolist_list_var.first();
        } 
        input_nodes = nreverse(input_nodes);
        _csetf_nn_input_nodes(nn, input_nodes);
        return nn;
    }

    public static final SubLObject neural_net_input_nodes_alt(SubLObject nn) {
        SubLTrampolineFile.checkType(nn, NEURAL_NET_P);
        return nn_input_nodes(nn);
    }

    public static SubLObject neural_net_input_nodes(final SubLObject nn) {
        assert NIL != neural_net_p(nn) : "! neural_net.neural_net_p(nn) " + ("neural_net.neural_net_p(nn) " + "CommonSymbols.NIL != neural_net.neural_net_p(nn) ") + nn;
        return nn_input_nodes(nn);
    }

    public static final SubLObject neural_net_input_node_count_alt(SubLObject nn) {
        SubLTrampolineFile.checkType(nn, NEURAL_NET_P);
        return length(neural_net_input_nodes(nn));
    }

    public static SubLObject neural_net_input_node_count(final SubLObject nn) {
        assert NIL != neural_net_p(nn) : "! neural_net.neural_net_p(nn) " + ("neural_net.neural_net_p(nn) " + "CommonSymbols.NIL != neural_net.neural_net_p(nn) ") + nn;
        return length(neural_net_input_nodes(nn));
    }

    public static final SubLObject neural_net_set_inputs_alt(SubLObject nn, SubLObject values) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(nn, NEURAL_NET_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.lengthE(values, neural_net_input_node_count(nn), UNPROVIDED)) {
                    Errors.error($str_alt13$Expected__s_to_be__a_elements_lon, values, neural_net_input_node_count(nn));
                }
            }
            {
                SubLObject node = NIL;
                SubLObject node_1 = NIL;
                SubLObject value = NIL;
                SubLObject value_2 = NIL;
                for (node = neural_net_input_nodes(nn), node_1 = node.first(), value = values, value_2 = value.first(); !((NIL == value) && (NIL == node)); node = node.rest() , node_1 = node.first() , value = value.rest() , value_2 = value.first()) {
                    nn_input_node_set_value(node_1, value_2);
                }
            }
            return nn;
        }
    }

    public static SubLObject neural_net_set_inputs(final SubLObject nn, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != neural_net_p(nn) : "! neural_net.neural_net_p(nn) " + ("neural_net.neural_net_p(nn) " + "CommonSymbols.NIL != neural_net.neural_net_p(nn) ") + nn;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(values, neural_net_input_node_count(nn), UNPROVIDED))) {
            Errors.error($str19$Expected__s_to_be__a_elements_lon, values, neural_net_input_node_count(nn));
        }
        SubLObject node = NIL;
        SubLObject node_$1 = NIL;
        SubLObject value = NIL;
        SubLObject value_$2 = NIL;
        node = neural_net_input_nodes(nn);
        node_$1 = node.first();
        value = values;
        value_$2 = value.first();
        while ((NIL != value) || (NIL != node)) {
            nn_input_node_set_value(node_$1, value_$2);
            node = node.rest();
            node_$1 = node.first();
            value = value.rest();
            value_$2 = value.first();
        } 
        return nn;
    }

    /**
     * This is a signmoidal activation function, which is an S-shaped squashing function
     * It smoothly limits the amplitude of the output of a neuron to between 0 and 1
     * It is a helper to the neural-activation function get_active_out
     * It is made inline so it can execute quickly since it is at every non-sensor
     * node in a network.
     * NOTE:  In order to make node insertion in the middle of a link possible,
     * the signmoid can be shifted to the right and more steeply sloped:
     * slope=4.924273
     * constant= 2.4621365
     * These parameters optimize mean squared error between the old output,
     * and an output of a node inserted in the middle of a link between
     * the old output and some other node.
     * When not right-shifted, the steepened slope is closest to a linear
     * ascent as possible between -0.5 and 0.5
     */
    @LispMethod(comment = "This is a signmoidal activation function, which is an S-shaped squashing function\r\nIt smoothly limits the amplitude of the output of a neuron to between 0 and 1\r\nIt is a helper to the neural-activation function get_active_out\r\nIt is made inline so it can execute quickly since it is at every non-sensor\r\nnode in a network.\r\nNOTE:  In order to make node insertion in the middle of a link possible,\r\nthe signmoid can be shifted to the right and more steeply sloped:\r\nslope=4.924273\r\nconstant= 2.4621365\r\nThese parameters optimize mean squared error between the old output,\r\nand an output of a node inserted in the middle of a link between\r\nthe old output and some other node.\r\nWhen not right-shifted, the steepened slope is closest to a linear\r\nascent as possible between -0.5 and 0.5\nThis is a signmoidal activation function, which is an S-shaped squashing function\nIt smoothly limits the amplitude of the output of a neuron to between 0 and 1\nIt is a helper to the neural-activation function get_active_out\nIt is made inline so it can execute quickly since it is at every non-sensor\nnode in a network.\nNOTE:  In order to make node insertion in the middle of a link possible,\nthe signmoid can be shifted to the right and more steeply sloped:\nslope=4.924273\nconstant= 2.4621365\nThese parameters optimize mean squared error between the old output,\nand an output of a node inserted in the middle of a link between\nthe old output and some other node.\nWhen not right-shifted, the steepened slope is closest to a linear\nascent as possible between -0.5 and 0.5")
    public static final SubLObject sigmoid_alt(SubLObject activesum) {
        {
            SubLObject slope = $float$4_924273;
            return invert(number_utilities.f_1X(exp(minus(multiply(slope, activesum)))));
        }
    }

    /**
     * This is a signmoidal activation function, which is an S-shaped squashing function
     * It smoothly limits the amplitude of the output of a neuron to between 0 and 1
     * It is a helper to the neural-activation function get_active_out
     * It is made inline so it can execute quickly since it is at every non-sensor
     * node in a network.
     * NOTE:  In order to make node insertion in the middle of a link possible,
     * the signmoid can be shifted to the right and more steeply sloped:
     * slope=4.924273
     * constant= 2.4621365
     * These parameters optimize mean squared error between the old output,
     * and an output of a node inserted in the middle of a link between
     * the old output and some other node.
     * When not right-shifted, the steepened slope is closest to a linear
     * ascent as possible between -0.5 and 0.5
     */
    @LispMethod(comment = "This is a signmoidal activation function, which is an S-shaped squashing function\r\nIt smoothly limits the amplitude of the output of a neuron to between 0 and 1\r\nIt is a helper to the neural-activation function get_active_out\r\nIt is made inline so it can execute quickly since it is at every non-sensor\r\nnode in a network.\r\nNOTE:  In order to make node insertion in the middle of a link possible,\r\nthe signmoid can be shifted to the right and more steeply sloped:\r\nslope=4.924273\r\nconstant= 2.4621365\r\nThese parameters optimize mean squared error between the old output,\r\nand an output of a node inserted in the middle of a link between\r\nthe old output and some other node.\r\nWhen not right-shifted, the steepened slope is closest to a linear\r\nascent as possible between -0.5 and 0.5\nThis is a signmoidal activation function, which is an S-shaped squashing function\nIt smoothly limits the amplitude of the output of a neuron to between 0 and 1\nIt is a helper to the neural-activation function get_active_out\nIt is made inline so it can execute quickly since it is at every non-sensor\nnode in a network.\nNOTE:  In order to make node insertion in the middle of a link possible,\nthe signmoid can be shifted to the right and more steeply sloped:\nslope=4.924273\nconstant= 2.4621365\nThese parameters optimize mean squared error between the old output,\nand an output of a node inserted in the middle of a link between\nthe old output and some other node.\nWhen not right-shifted, the steepened slope is closest to a linear\nascent as possible between -0.5 and 0.5")
    public static SubLObject sigmoid(final SubLObject activesum) {
        final SubLObject slope = $float$4_924273;
        return invert(number_utilities.f_1X(exp(minus(multiply(slope, activesum)))));
    }

    public static final SubLObject nn_input_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject nn_input_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject nn_input_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.neural_net.$nn_input_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject nn_input_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.neural_net.$nn_input_node_native.class ? T : NIL;
    }

    public static final SubLObject nnin_value_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NN_INPUT_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject nnin_value(final SubLObject v_object) {
        assert NIL != nn_input_node_p(v_object) : "! neural_net.nn_input_node_p(v_object) " + "neural_net.nn_input_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject nnin_weights_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NN_INPUT_NODE_P);
        return v_object.getField3();
    }

    public static SubLObject nnin_weights(final SubLObject v_object) {
        assert NIL != nn_input_node_p(v_object) : "! neural_net.nn_input_node_p(v_object) " + "neural_net.nn_input_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_nnin_value_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NN_INPUT_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_nnin_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != nn_input_node_p(v_object) : "! neural_net.nn_input_node_p(v_object) " + "neural_net.nn_input_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nnin_weights_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NN_INPUT_NODE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_nnin_weights(final SubLObject v_object, final SubLObject value) {
        assert NIL != nn_input_node_p(v_object) : "! neural_net.nn_input_node_p(v_object) " + "neural_net.nn_input_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_nn_input_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.neural_net.$nn_input_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($VALUE)) {
                        _csetf_nnin_value(v_new, current_value);
                    } else {
                        if (pcase_var.eql($WEIGHTS)) {
                            _csetf_nnin_weights(v_new, current_value);
                        } else {
                            Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_nn_input_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.neural_net.$nn_input_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VALUE)) {
                _csetf_nnin_value(v_new, current_value);
            } else
                if (pcase_var.eql($WEIGHTS)) {
                    _csetf_nnin_weights(v_new, current_value);
                } else {
                    Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_nn_input_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NN_INPUT_NODE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VALUE, nnin_value(obj));
        funcall(visitor_fn, obj, $SLOT, $WEIGHTS, nnin_weights(obj));
        funcall(visitor_fn, obj, $END, MAKE_NN_INPUT_NODE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_nn_input_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nn_input_node(obj, visitor_fn);
    }

    public static final SubLObject new_nn_input_node_alt(SubLObject value, SubLObject weights) {
        SubLTrampolineFile.checkType(value, NUMBERP);
        SubLTrampolineFile.checkType(weights, CONSP);
        {
            SubLObject list_var = weights;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, NUMBERP);
                }
            }
        }
        {
            SubLObject node = make_nn_input_node(UNPROVIDED);
            _csetf_nnin_value(node, value);
            _csetf_nnin_weights(node, weights);
            return node;
        }
    }

    public static SubLObject new_nn_input_node(final SubLObject value, final SubLObject weights) {
        assert NIL != numberp(value) : "! numberp(value) " + ("Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) ") + value;
        assert NIL != consp(weights) : "! consp(weights) " + ("Types.consp(weights) " + "CommonSymbols.NIL != Types.consp(weights) ") + weights;
        assert NIL != list_utilities.non_dotted_list_p(weights) : "! list_utilities.non_dotted_list_p(weights) " + ("list_utilities.non_dotted_list_p(weights) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(weights) ") + weights;
        SubLObject cdolist_list_var = weights;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != numberp(elem) : "! numberp(elem) " + ("Types.numberp(elem) " + "CommonSymbols.NIL != Types.numberp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject node = make_nn_input_node(UNPROVIDED);
        _csetf_nnin_value(node, value);
        _csetf_nnin_weights(node, weights);
        return node;
    }

    public static final SubLObject nn_input_node_value_alt(SubLObject node) {
        SubLTrampolineFile.checkType(node, NN_INPUT_NODE_P);
        return nnin_value(node);
    }

    public static SubLObject nn_input_node_value(final SubLObject node) {
        assert NIL != nn_input_node_p(node) : "! neural_net.nn_input_node_p(node) " + ("neural_net.nn_input_node_p(node) " + "CommonSymbols.NIL != neural_net.nn_input_node_p(node) ") + node;
        return nnin_value(node);
    }

    public static final SubLObject nn_input_node_weights_alt(SubLObject node) {
        SubLTrampolineFile.checkType(node, NN_INPUT_NODE_P);
        return nnin_weights(node);
    }

    public static SubLObject nn_input_node_weights(final SubLObject node) {
        assert NIL != nn_input_node_p(node) : "! neural_net.nn_input_node_p(node) " + ("neural_net.nn_input_node_p(node) " + "CommonSymbols.NIL != neural_net.nn_input_node_p(node) ") + node;
        return nnin_weights(node);
    }

    public static final SubLObject nn_input_node_set_value_alt(SubLObject node, SubLObject value) {
        SubLTrampolineFile.checkType(node, NN_INPUT_NODE_P);
        SubLTrampolineFile.checkType(value, NUMBERP);
        _csetf_nnin_value(node, value);
        return node;
    }

    public static SubLObject nn_input_node_set_value(final SubLObject node, final SubLObject value) {
        assert NIL != nn_input_node_p(node) : "! neural_net.nn_input_node_p(node) " + ("neural_net.nn_input_node_p(node) " + "CommonSymbols.NIL != neural_net.nn_input_node_p(node) ") + node;
        assert NIL != numberp(value) : "! numberp(value) " + ("Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) ") + value;
        _csetf_nnin_value(node, value);
        return node;
    }

    public static final SubLObject rl_tactician_initialize_neural_net_alt() {
        $rl_tactician_neural_net$.setGlobalValue(new_neural_net($rl_tactician_neural_net_weights_list$.getGlobalValue()));
        return T;
    }

    public static SubLObject rl_tactician_initialize_neural_net() {
        $rl_tactician_neural_net$.setGlobalValue(new_neural_net($rl_tactician_neural_net_weights_list$.getGlobalValue()));
        return T;
    }

    public static final SubLObject rl_tactician_neural_net_alt() {
        if (NIL == $rl_tactician_neural_net$.getGlobalValue()) {
            rl_tactician_initialize_neural_net();
        }
        return $rl_tactician_neural_net$.getGlobalValue();
    }

    public static SubLObject rl_tactician_neural_net() {
        if (NIL == $rl_tactician_neural_net$.getGlobalValue()) {
            rl_tactician_initialize_neural_net();
        }
        return $rl_tactician_neural_net$.getGlobalValue();
    }

    public static final SubLObject rl_tactician_evaluate_neural_net_alt(SubLObject productivity, SubLObject completeness, SubLObject preference_level, SubLObject tactic_type) {
        {
            SubLObject nn = rl_tactician_neural_net();
            rl_tactician_set_neural_net_input_values(nn, productivity, completeness, preference_level, tactic_type);
            return rl_tactician_compute_neural_net_output(nn, tactic_type);
        }
    }

    public static SubLObject rl_tactician_evaluate_neural_net(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type) {
        final SubLObject nn = rl_tactician_neural_net();
        rl_tactician_set_neural_net_input_values(nn, productivity, completeness, preference_level, tactic_type);
        return rl_tactician_compute_neural_net_output(nn, tactic_type);
    }

    public static final SubLObject rl_tactician_set_neural_net_input_values_alt(SubLObject nn, SubLObject productivity, SubLObject completeness, SubLObject preference_level, SubLObject tactic_type) {
        {
            SubLObject values = rl_tactician_compute_neural_net_input_values(productivity, completeness, preference_level, tactic_type);
            neural_net_set_inputs(nn, values);
        }
        return nn;
    }

    public static SubLObject rl_tactician_set_neural_net_input_values(final SubLObject nn, final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type) {
        final SubLObject values = rl_tactician_compute_neural_net_input_values(productivity, completeness, preference_level, tactic_type);
        neural_net_set_inputs(nn, values);
        return nn;
    }

    public static final SubLObject rl_tactician_compute_neural_net_input_values_alt(SubLObject productivity, SubLObject completeness, SubLObject preference_level, SubLObject tactic_type) {
        {
            SubLObject values = make_list($int$21, ZERO_INTEGER);
            SubLObject start = multiply(FOUR_INTEGER, tactic_type);
            SubLObject productivity_value = add($float$0_01, number_utilities.log10(number_utilities.f_1X(number_utilities.log10(number_utilities.f_1X(productivity)))));
            SubLObject completeness_or_preference_level = max(completeness, preference_level);
            set_nth(start, values, productivity_value);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(THREE_INTEGER); i = add(i, ONE_INTEGER)) {
                    set_nth(add(start, ONE_INTEGER, i), values, $float$0_03);
                }
            }
            set_nth(add(start, completeness_or_preference_level), values, $float$0_97);
            set_nth(TWENTY_INTEGER, values, $float$0_03);
            return values;
        }
    }

    public static SubLObject rl_tactician_compute_neural_net_input_values(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type) {
        final SubLObject values = make_list($int$21, ZERO_INTEGER);
        final SubLObject start = multiply(FOUR_INTEGER, tactic_type);
        final SubLObject productivity_value = add($float$0_01, number_utilities.log10(number_utilities.f_1X(number_utilities.log10(number_utilities.f_1X(productivity)))));
        final SubLObject completeness_or_preference_level = max(completeness, preference_level);
        set_nth(start, values, productivity_value);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(THREE_INTEGER); i = add(i, ONE_INTEGER)) {
            set_nth(add(start, ONE_INTEGER, i), values, $float$0_03);
        }
        set_nth(add(start, completeness_or_preference_level), values, $float$0_97);
        set_nth(TWENTY_INTEGER, values, $float$0_03);
        return values;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("INPUT-NODES"));

    static private final SubLList $list_alt3 = list(makeKeyword("INPUT-NODES"));

    static private final SubLList $list_alt4 = list(makeSymbol("NN-INPUT-NODES"));

    public static final SubLObject rl_tactician_compute_neural_net_output_alt(SubLObject nn, SubLObject tactic_type) {
        {
            SubLObject sum = ZERO_INTEGER;
            SubLObject indexes = rl_tactician_indexes_we_care_about(tactic_type);
            SubLObject cdolist_list_var = indexes;
            SubLObject i = NIL;
            for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                {
                    SubLObject input_node = nth(i, neural_net_input_nodes(nn));
                    SubLObject input_value = nn_input_node_value(input_node);
                    SubLObject weight = nth(tactic_type, nn_input_node_weights(input_node));
                    SubLObject partial_sum = multiply(input_value, weight);
                    sum = add(sum, partial_sum);
                }
            }
            return sigmoid(sum);
        }
    }

    public static SubLObject rl_tactician_compute_neural_net_output(final SubLObject nn, final SubLObject tactic_type) {
        SubLObject sum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject indexes = cdolist_list_var = rl_tactician_indexes_we_care_about(tactic_type);
        SubLObject i = NIL;
        i = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_node = nth(i, neural_net_input_nodes(nn));
            final SubLObject input_value = nn_input_node_value(input_node);
            final SubLObject weight = nth(tactic_type, nn_input_node_weights(input_node));
            final SubLObject partial_sum = multiply(input_value, weight);
            sum = add(sum, partial_sum);
            cdolist_list_var = cdolist_list_var.rest();
            i = cdolist_list_var.first();
        } 
        return sigmoid(sum);
    }

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-NN-INPUT-NODES"));

    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt13$Expected__s_to_be__a_elements_lon = makeString("Expected ~s to be ~a elements long.");

    public static final SubLObject rl_tactician_indexes_we_care_about_alt(SubLObject tactic_type) {
        {
            SubLObject indexes = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(FOUR_INTEGER); i = add(i, ONE_INTEGER)) {
                indexes = cons(add(i, multiply(FOUR_INTEGER, tactic_type)), indexes);
            }
            indexes = cons(TWENTY_INTEGER, indexes);
            return nreverse(indexes);
        }
    }

    public static SubLObject rl_tactician_indexes_we_care_about(final SubLObject tactic_type) {
        SubLObject indexes = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(FOUR_INTEGER); i = add(i, ONE_INTEGER)) {
            indexes = cons(add(i, multiply(FOUR_INTEGER, tactic_type)), indexes);
        }
        indexes = cons(TWENTY_INTEGER, indexes);
        return nreverse(indexes);
    }

    static private final SubLList $list_alt17 = list(makeSymbol("VALUE"), makeSymbol("WEIGHTS"));

    static private final SubLList $list_alt18 = list(makeKeyword("VALUE"), makeKeyword("WEIGHTS"));

    static private final SubLList $list_alt19 = list(makeSymbol("NNIN-VALUE"), makeSymbol("NNIN-WEIGHTS"));

    static private final SubLList $list_alt20 = list(makeSymbol("_CSETF-NNIN-VALUE"), makeSymbol("_CSETF-NNIN-WEIGHTS"));

    public static final SubLObject test_rl_tactician_evaluate_neural_net_with_some_tolerance_alt(SubLObject productivity, SubLObject completeness, SubLObject preference_level, SubLObject tactic_type, SubLObject expected_result) {
        {
            SubLObject actual_result = rl_tactician_evaluate_neural_net(productivity, completeness, preference_level, tactic_type);
            return number_utilities.tolerance_E(actual_result, expected_result, $test_rl_tactician_evaluate_neural_net_tolerance$.getGlobalValue());
        }
    }

    public static SubLObject test_rl_tactician_evaluate_neural_net_with_some_tolerance(final SubLObject productivity, final SubLObject completeness, final SubLObject preference_level, final SubLObject tactic_type, final SubLObject expected_result) {
        final SubLObject actual_result = rl_tactician_evaluate_neural_net(productivity, completeness, preference_level, tactic_type);
        return number_utilities.tolerance_E(actual_result, expected_result, $test_rl_tactician_evaluate_neural_net_tolerance$.getGlobalValue());
    }

    public static SubLObject declare_neural_net_file() {
        declareFunction("neural_net_print_function_trampoline", "NEURAL-NET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("neural_net_p", "NEURAL-NET-P", 1, 0, false);
        new neural_net.$neural_net_p$UnaryFunction();
        declareFunction("nn_input_nodes", "NN-INPUT-NODES", 1, 0, false);
        declareFunction("_csetf_nn_input_nodes", "_CSETF-NN-INPUT-NODES", 2, 0, false);
        declareFunction("make_neural_net", "MAKE-NEURAL-NET", 0, 1, false);
        declareFunction("visit_defstruct_neural_net", "VISIT-DEFSTRUCT-NEURAL-NET", 2, 0, false);
        declareFunction("visit_defstruct_object_neural_net_method", "VISIT-DEFSTRUCT-OBJECT-NEURAL-NET-METHOD", 2, 0, false);
        declareFunction("new_neural_net", "NEW-NEURAL-NET", 1, 0, false);
        declareFunction("neural_net_input_nodes", "NEURAL-NET-INPUT-NODES", 1, 0, false);
        declareFunction("neural_net_input_node_count", "NEURAL-NET-INPUT-NODE-COUNT", 1, 0, false);
        declareFunction("neural_net_set_inputs", "NEURAL-NET-SET-INPUTS", 2, 0, false);
        declareFunction("sigmoid", "SIGMOID", 1, 0, false);
        declareFunction("nn_input_node_print_function_trampoline", "NN-INPUT-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("nn_input_node_p", "NN-INPUT-NODE-P", 1, 0, false);
        new neural_net.$nn_input_node_p$UnaryFunction();
        declareFunction("nnin_value", "NNIN-VALUE", 1, 0, false);
        declareFunction("nnin_weights", "NNIN-WEIGHTS", 1, 0, false);
        declareFunction("_csetf_nnin_value", "_CSETF-NNIN-VALUE", 2, 0, false);
        declareFunction("_csetf_nnin_weights", "_CSETF-NNIN-WEIGHTS", 2, 0, false);
        declareFunction("make_nn_input_node", "MAKE-NN-INPUT-NODE", 0, 1, false);
        declareFunction("visit_defstruct_nn_input_node", "VISIT-DEFSTRUCT-NN-INPUT-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_nn_input_node_method", "VISIT-DEFSTRUCT-OBJECT-NN-INPUT-NODE-METHOD", 2, 0, false);
        declareFunction("new_nn_input_node", "NEW-NN-INPUT-NODE", 2, 0, false);
        declareFunction("nn_input_node_value", "NN-INPUT-NODE-VALUE", 1, 0, false);
        declareFunction("nn_input_node_weights", "NN-INPUT-NODE-WEIGHTS", 1, 0, false);
        declareFunction("nn_input_node_set_value", "NN-INPUT-NODE-SET-VALUE", 2, 0, false);
        declareFunction("rl_tactician_initialize_neural_net", "RL-TACTICIAN-INITIALIZE-NEURAL-NET", 0, 0, false);
        declareFunction("rl_tactician_neural_net", "RL-TACTICIAN-NEURAL-NET", 0, 0, false);
        declareFunction("rl_tactician_evaluate_neural_net", "RL-TACTICIAN-EVALUATE-NEURAL-NET", 4, 0, false);
        declareFunction("rl_tactician_set_neural_net_input_values", "RL-TACTICIAN-SET-NEURAL-NET-INPUT-VALUES", 5, 0, false);
        declareFunction("rl_tactician_compute_neural_net_input_values", "RL-TACTICIAN-COMPUTE-NEURAL-NET-INPUT-VALUES", 4, 0, false);
        declareFunction("rl_tactician_compute_neural_net_output", "RL-TACTICIAN-COMPUTE-NEURAL-NET-OUTPUT", 2, 0, false);
        declareFunction("rl_tactician_indexes_we_care_about", "RL-TACTICIAN-INDEXES-WE-CARE-ABOUT", 1, 0, false);
        declareFunction("test_rl_tactician_evaluate_neural_net_with_some_tolerance", "TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-WITH-SOME-TOLERANCE", 5, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt30 = list(new SubLObject[]{ list(makeDouble(-0.227514), makeDouble(-0.395681), makeDouble(-0.392587), makeDouble(-0.304583), makeDouble(0.717281)), list(makeDouble(0.466911), makeDouble(-1.01181), makeDouble(0.515608), makeDouble(0.186695), makeDouble(-0.173123)), list(makeDouble(0.691837), makeDouble(-0.39004), makeDouble(1.27718), makeDouble(0.0985643), makeDouble(-0.459222)), list(makeDouble(-0.14361), makeDouble(-0.100166), makeDouble(-0.409217), makeDouble(0.703923), makeDouble(0.0986236)), list(makeDouble(-0.558941), makeDouble(-0.654273), makeDouble(0.875859), makeDouble(-0.547818), makeDouble(0.464239)), list(makeDouble(-0.0898241), makeDouble(1.16297), makeDouble(-0.140286), makeDouble(0.727112), makeDouble(-0.0571363)), list(makeDouble(0.33211), makeDouble(0.804213), makeDouble(-0.500794), makeDouble(0.0836377), makeDouble(-0.119423)), list(makeDouble(-0.27839), makeDouble(-0.424287), makeDouble(0.0972779), makeDouble(-0.0641412), makeDouble(-0.324519)), list(makeDouble(-0.04071), makeDouble(-1.03764), makeDouble(-1.1684), makeDouble(-0.285568), makeDouble(0.322287)), list(makeDouble(0.35157), makeDouble(-0.0978135), makeDouble(-0.649702), makeDouble(1.0535), makeDouble(0.83717)), list(makeDouble(-0.0862237), makeDouble(0.22735), makeDouble(-1.21319), makeDouble(-0.531121), makeDouble(-0.486909)), list(makeDouble(0.256012), makeDouble(0.852522), makeDouble(-0.7396), makeDouble(0.233292), makeDouble(-0.0850184)), list(makeDouble(0.704154), makeDouble(-0.182174), makeDouble(0.169152), makeDouble(-1.2787), makeDouble(-0.400246)), list(makeDouble(0.242133), makeDouble(-0.671766), makeDouble(-1.05614), makeDouble(-0.0740336), makeDouble(-0.0432617)), list(makeDouble(-0.871448), makeDouble(0.0101277), makeDouble(0.221434), makeDouble(-0.0241337), makeDouble(-0.717193)), list(makeDouble(-0.228881), makeDouble(-0.132546), makeDouble(-0.240634), makeDouble(0.935199), makeDouble(0.111408)), list(makeDouble(0.456088), makeDouble(-0.189828), makeDouble(0.06841), makeDouble(-0.112433), makeDouble(-0.254772)), list(makeDouble(0.0838212), makeDouble(-0.901167), makeDouble(0.555404), makeDouble(0.126584), makeDouble(-1.13132)), list(makeDouble(0.927022), makeDouble(-0.294691), makeDouble(0.735027), makeDouble(0.42247), makeDouble(0.263537)), list(makeDouble(0.229667), makeDouble(-0.76629), makeDouble(1.13279), makeDouble(0.0468138), makeDouble(-0.392014)), list(makeDouble(0.565153), makeDouble(-0.082501), makeDouble(0.208606), makeDouble(0.101688), makeDouble(-0.672053)) });

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.85)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.94)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.24)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, ZERO_INTEGER, makeDouble(0.84)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeDouble(0.95)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, ZERO_INTEGER, makeDouble(0.28)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.97)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.87)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER, makeDouble(0.02)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, makeDouble(0.97)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, ONE_INTEGER, makeDouble(0.91)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, ONE_INTEGER, makeDouble(0.04)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.017)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.018)), T), list(list(makeInteger(3000), THREE_INTEGER, ZERO_INTEGER, THREE_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, THREE_INTEGER, makeDouble(0.012)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, FOUR_INTEGER, makeDouble(0.066)), T), list(list(makeInteger(1000), ONE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.0019)), T), list(list(makeInteger(2000), TWO_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.53)), T), list(list(makeInteger(4000), THREE_INTEGER, ZERO_INTEGER, FOUR_INTEGER, makeDouble(0.05)), T), list(list(makeInteger(4000), ZERO_INTEGER, ONE_INTEGER, FOUR_INTEGER, makeDouble(0.0017)), T), list(list(makeInteger(100), ZERO_INTEGER, TWO_INTEGER, FOUR_INTEGER, makeDouble(0.58)), T), list(list(makeInteger(50), ZERO_INTEGER, THREE_INTEGER, FOUR_INTEGER, makeDouble(0.066)), T) });

    public static final SubLObject init_neural_net_file_alt() {
        defconstant("*DTP-NEURAL-NET*", NEURAL_NET);
        defconstant("*DTP-NN-INPUT-NODE*", NN_INPUT_NODE);
        deflexical("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list_alt30);
        deflexical("*RL-TACTICIAN-NEURAL-NET*", NIL != boundp($rl_tactician_neural_net$) ? ((SubLObject) ($rl_tactician_neural_net$.getGlobalValue())) : NIL);
        deflexical("*TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-TOLERANCE*", $float$0_01);
        return NIL;
    }

    public static SubLObject init_neural_net_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-NEURAL-NET*", NEURAL_NET);
            defconstant("*DTP-NN-INPUT-NODE*", NN_INPUT_NODE);
            deflexical("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list39);
            deflexical("*RL-TACTICIAN-NEURAL-NET*", SubLTrampolineFile.maybeDefault($rl_tactician_neural_net$, $rl_tactician_neural_net$, NIL));
            deflexical("*TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-TOLERANCE*", $float$0_01);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list_alt30);
            deflexical("*RL-TACTICIAN-NEURAL-NET*", NIL != boundp($rl_tactician_neural_net$) ? ((SubLObject) ($rl_tactician_neural_net$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_neural_net_file_Previous() {
        defconstant("*DTP-NEURAL-NET*", NEURAL_NET);
        defconstant("*DTP-NN-INPUT-NODE*", NN_INPUT_NODE);
        deflexical("*RL-TACTICIAN-NEURAL-NET-WEIGHTS-LIST*", $list39);
        deflexical("*RL-TACTICIAN-NEURAL-NET*", SubLTrampolineFile.maybeDefault($rl_tactician_neural_net$, $rl_tactician_neural_net$, NIL));
        deflexical("*TEST-RL-TACTICIAN-EVALUATE-NEURAL-NET-TOLERANCE*", $float$0_01);
        return NIL;
    }

    public static final SubLObject setup_neural_net_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), symbol_function(NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(NN_INPUT_NODES, _CSETF_NN_INPUT_NODES);
        identity(NEURAL_NET);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), symbol_function(NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(NNIN_VALUE, _CSETF_NNIN_VALUE);
        def_csetf(NNIN_WEIGHTS, _CSETF_NNIN_WEIGHTS);
        identity(NN_INPUT_NODE);
        declare_defglobal($rl_tactician_neural_net$);
        define_test_case_table_int(TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt44);
        return NIL;
    }

    public static SubLObject setup_neural_net_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), symbol_function(NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(NN_INPUT_NODES, _CSETF_NN_INPUT_NODES);
            identity(NEURAL_NET);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), symbol_function(NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list28);
            def_csetf(NNIN_VALUE, _CSETF_NNIN_VALUE);
            def_csetf(NNIN_WEIGHTS, _CSETF_NNIN_WEIGHTS);
            identity(NN_INPUT_NODE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD));
            declare_defglobal($rl_tactician_neural_net$);
            define_test_case_table_int(TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list52);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt44);
        }
        return NIL;
    }

    public static SubLObject setup_neural_net_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), symbol_function(NEURAL_NET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(NN_INPUT_NODES, _CSETF_NN_INPUT_NODES);
        identity(NEURAL_NET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_neural_net$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NEURAL_NET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), symbol_function(NN_INPUT_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list28);
        def_csetf(NNIN_VALUE, _CSETF_NNIN_VALUE);
        def_csetf(NNIN_WEIGHTS, _CSETF_NNIN_WEIGHTS);
        identity(NN_INPUT_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nn_input_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NN_INPUT_NODE_METHOD));
        declare_defglobal($rl_tactician_neural_net$);
        define_test_case_table_int(TEST_RL_TACTICIAN_EVALUATE_NEURAL_NET_WITH_SOME_TOLERANCE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list52);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_neural_net_file();
    }

    @Override
    public void initializeVariables() {
        init_neural_net_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_neural_net_file();
    }

    

    public static final class $neural_net_native extends SubLStructNative {
        public SubLObject $input_nodes;

        private static final SubLStructDeclNative structDecl;

        public $neural_net_native() {
            neural_net.$neural_net_native.this.$input_nodes = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return neural_net.$neural_net_native.this.$input_nodes;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return neural_net.$neural_net_native.this.$input_nodes = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.neural_net.$neural_net_native.class, NEURAL_NET, NEURAL_NET_P, $list2, $list3, new String[]{ "$input_nodes" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $neural_net_p$UnaryFunction extends UnaryFunction {
        public $neural_net_p$UnaryFunction() {
            super(extractFunctionNamed("NEURAL-NET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return neural_net_p(arg1);
        }
    }

    public static final class $nn_input_node_native extends SubLStructNative {
        public SubLObject $value;

        public SubLObject $weights;

        private static final SubLStructDeclNative structDecl;

        public $nn_input_node_native() {
            neural_net.$nn_input_node_native.this.$value = Lisp.NIL;
            neural_net.$nn_input_node_native.this.$weights = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return neural_net.$nn_input_node_native.this.$value;
        }

        @Override
        public SubLObject getField3() {
            return neural_net.$nn_input_node_native.this.$weights;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return neural_net.$nn_input_node_native.this.$value = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return neural_net.$nn_input_node_native.this.$weights = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.neural_net.$nn_input_node_native.class, NN_INPUT_NODE, NN_INPUT_NODE_P, $list23, $list24, new String[]{ "$value", "$weights" }, $list25, $list26, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $nn_input_node_p$UnaryFunction extends UnaryFunction {
        public $nn_input_node_p$UnaryFunction() {
            super(extractFunctionNamed("NN-INPUT-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nn_input_node_p(arg1);
        }
    }
}

/**
 * Total time: 165 ms
 */

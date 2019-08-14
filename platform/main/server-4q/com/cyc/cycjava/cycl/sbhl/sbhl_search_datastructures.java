/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.vector_utilities;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-SEARCH-DATASTRUCTURES
 * source file: /cyc/top/cycl/sbhl/sbhl-search-datastructures.lisp
 * created:     2019/07/03 17:37:18
 */
public final class sbhl_search_datastructures extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $sbhl_stack_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.this.$num;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.this.$elements;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.this.$num = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.this.$elements = value;
        }

        public SubLObject $num = Lisp.NIL;

        public SubLObject $elements = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.class, SBHL_STACK, SBHL_STACK_P, $list_alt2, $list_alt3, new String[]{ "$num", "$elements" }, $list_alt4, $list_alt5, PRINT_SBHL_STACK);
    }

    public static final SubLFile me = new sbhl_search_datastructures();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_stack$ = makeSymbol("*DTP-SBHL-STACK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_link_node_search_state$ = makeSymbol("*DTP-SBHL-LINK-NODE-SEARCH-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SBHL_STACK = makeSymbol("SBHL-STACK");

    private static final SubLSymbol SBHL_STACK_P = makeSymbol("SBHL-STACK-P");

    static private final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"));

    static private final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"));

    static private final SubLList $list4 = list(makeSymbol("SBHL-STACK-NUM"), makeSymbol("SBHL-STACK-ELEMENTS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SBHL-STACK-NUM"), makeSymbol("_CSETF-SBHL-STACK-ELEMENTS"));

    private static final SubLSymbol PRINT_SBHL_STACK = makeSymbol("PRINT-SBHL-STACK");

    private static final SubLSymbol SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-STACK-P"));

    private static final SubLSymbol SBHL_STACK_NUM = makeSymbol("SBHL-STACK-NUM");

    private static final SubLSymbol _CSETF_SBHL_STACK_NUM = makeSymbol("_CSETF-SBHL-STACK-NUM");

    private static final SubLSymbol SBHL_STACK_ELEMENTS = makeSymbol("SBHL-STACK-ELEMENTS");

    private static final SubLSymbol _CSETF_SBHL_STACK_ELEMENTS = makeSymbol("_CSETF-SBHL-STACK-ELEMENTS");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SBHL_STACK = makeSymbol("MAKE-SBHL-STACK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-STACK-METHOD");

    private static final SubLString $str21$size_ = makeString("size=");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_P = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-P");

    static private final SubLList $list25 = list(makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("PARENT-NODE"), makeSymbol("GENL-INVERSE-MODE?"), makeSymbol("LINK-GENERATOR"));

    private static final SubLList $list26 = list($NODE, makeKeyword("MODULE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("PARENT-NODE"), makeKeyword("GENL-INVERSE-MODE?"), makeKeyword("LINK-GENERATOR"));

    private static final SubLList $list27 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));

    private static final SubLList $list28 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));

    private static final SubLSymbol PRINT_SBHL_LINK_NODE_SEARCH_STATE = makeSymbol("PRINT-SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list31 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-P"));

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_NODE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_MODULE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_MT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_TV = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");

    private static final SubLSymbol $sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");

    private static final SubLSymbol _CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");

    private static final SubLSymbol $kw54$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");

    private static final SubLSymbol MAKE_SBHL_LINK_NODE_SEARCH_STATE = makeSymbol("MAKE-SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-METHOD");

    private static final SubLString $str58$__a____a_ = makeString("(~a : ~a)");

    private static final SubLString $str59$Node_______________a__ = makeString("Node:             ~a~%");

    private static final SubLString $str60$Module_____________a__ = makeString("Module:           ~a~%");

    private static final SubLString $str61$Direction__________a__ = makeString("Direction:        ~a~%");

    private static final SubLString $str62$Mt_________________a__ = makeString("Mt:               ~a~%");

    private static final SubLString $str63$TV_________________a__ = makeString("TV:               ~a~%");

    private static final SubLString $str64$Parent_Node________a__ = makeString("Parent Node:      ~a~%");

    private static final SubLString $str65$genlInverse_mode___a__ = makeString("genlInverse mode: ~a~%");

    private static final SubLString $str66$Link_Generator_____a__ = makeString("Link Generator:   ~a~%");

    public static final SubLObject sbhl_stack_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.print_sbhl_stack(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_search_datastructures.print_sbhl_stack(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_stack_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_stack_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_stack_num_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_STACK_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_stack_num(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_stack_p(v_object) : "! sbhl_search_datastructures.sbhl_stack_p(v_object) " + "sbhl_search_datastructures.sbhl_stack_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_stack_elements_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_STACK_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_stack_elements(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_stack_p(v_object) : "! sbhl_search_datastructures.sbhl_stack_p(v_object) " + "sbhl_search_datastructures.sbhl_stack_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_sbhl_stack_num_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_STACK_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_stack_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_stack_p(v_object) : "! sbhl_search_datastructures.sbhl_stack_p(v_object) " + "sbhl_search_datastructures.sbhl_stack_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_stack_elements_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_STACK_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_stack_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_stack_p(v_object) : "! sbhl_search_datastructures.sbhl_stack_p(v_object) " + "sbhl_search_datastructures.sbhl_stack_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_sbhl_stack_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NUM)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_num(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ELEMENTS)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_elements(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_stack(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                sbhl_search_datastructures._csetf_sbhl_stack_num(v_new, current_value);
            } else
                if (pcase_var.eql($ELEMENTS)) {
                    sbhl_search_datastructures._csetf_sbhl_stack_elements(v_new, current_value);
                } else {
                    Errors.error(sbhl_search_datastructures.$str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_stack(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_search_datastructures.MAKE_SBHL_STACK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, sbhl_search_datastructures.sbhl_stack_num(obj));
        funcall(visitor_fn, obj, $SLOT, $ELEMENTS, sbhl_search_datastructures.sbhl_stack_elements(obj));
        funcall(visitor_fn, obj, $END, sbhl_search_datastructures.MAKE_SBHL_STACK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_search_datastructures.visit_defstruct_sbhl_stack(obj, visitor_fn);
    }

    public static final SubLObject print_sbhl_stack_alt(SubLObject sbhl_stack, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(sbhl_stack, stream);
            } else {
                {
                    SubLObject v_object = sbhl_stack;
                    SubLObject stream_1 = stream;
                    write_string($str_alt15$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    write_string($str_alt17$size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_size(sbhl_stack), stream);
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return sbhl_stack;
        }
    }

    public static SubLObject print_sbhl_stack(final SubLObject sbhl_stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(sbhl_stack, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, sbhl_stack, T, T);
            write_string(sbhl_search_datastructures.$str21$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(sbhl_search_datastructures.sbhl_stack_size(sbhl_stack), stream);
            print_macros.print_unreadable_object_postamble(stream, sbhl_stack, T, T);
        }
        return sbhl_stack;
    }

    public static final SubLObject new_sbhl_stack_alt(SubLObject size) {
        if (size == UNPROVIDED) {
            size = THIRTEEN_INTEGER;
        }
        SubLTrampolineFile.checkType(size, POSITIVE_INTEGER_P);
        {
            SubLObject stack = com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.make_sbhl_stack(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_num(stack, ZERO_INTEGER);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_elements(stack, make_vector(size, UNPROVIDED));
            return stack;
        }
    }

    public static SubLObject new_sbhl_stack(SubLObject size) {
        if (size == UNPROVIDED) {
            size = THIRTEEN_INTEGER;
        }
        assert NIL != subl_promotions.positive_integer_p(size) : "! subl_promotions.positive_integer_p(size) " + ("subl_promotions.positive_integer_p(size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(size) ") + size;
        final SubLObject stack = sbhl_search_datastructures.make_sbhl_stack(UNPROVIDED);
        sbhl_search_datastructures._csetf_sbhl_stack_num(stack, ZERO_INTEGER);
        sbhl_search_datastructures._csetf_sbhl_stack_elements(stack, make_vector(size, UNPROVIDED));
        return stack;
    }

    public static final SubLObject sbhl_stack_size_alt(SubLObject sbhl_stack) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack);
    }

    public static SubLObject sbhl_stack_size(final SubLObject sbhl_stack) {
        return sbhl_search_datastructures.sbhl_stack_num(sbhl_stack);
    }

    public static final SubLObject sbhl_stack_emptyP_alt(SubLObject sbhl_stack) {
        return zerop(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack));
    }

    public static SubLObject sbhl_stack_emptyP(final SubLObject sbhl_stack) {
        return zerop(sbhl_search_datastructures.sbhl_stack_num(sbhl_stack));
    }

    public static final SubLObject sbhl_stack_push_alt(SubLObject item, SubLObject sbhl_stack) {
        if (com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack).numGE(length(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack)))) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_elements(sbhl_stack, vector_utilities.grow_vector(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), NIL, TWO_INTEGER));
        }
        set_aref(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), item);
        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, add(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
        return sbhl_stack;
    }

    public static SubLObject sbhl_stack_push(final SubLObject item, final SubLObject sbhl_stack) {
        if (sbhl_search_datastructures.sbhl_stack_num(sbhl_stack).numGE(length(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack)))) {
            sbhl_search_datastructures._csetf_sbhl_stack_elements(sbhl_stack, vector_utilities.grow_vector(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), NIL, TWO_INTEGER));
        }
        set_aref(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), item);
        sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, add(sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
        return sbhl_stack;
    }

    public static final SubLObject sbhl_stack_pop_alt(SubLObject sbhl_stack) {
        {
            SubLObject item = NIL;
            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_emptyP(sbhl_stack)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, subtract(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
                item = aref(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack));
                set_aref(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), NIL);
            }
            return item;
        }
    }

    public static SubLObject sbhl_stack_pop(final SubLObject sbhl_stack) {
        SubLObject item = NIL;
        if (NIL == sbhl_search_datastructures.sbhl_stack_emptyP(sbhl_stack)) {
            sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, subtract(sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
            item = aref(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), sbhl_search_datastructures.sbhl_stack_num(sbhl_stack));
            set_aref(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), NIL);
        }
        return item;
    }

    public static final SubLObject sbhl_stack_peek_alt(SubLObject sbhl_stack) {
        {
            SubLObject item = NIL;
            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_emptyP(sbhl_stack)) {
                item = aref(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), subtract(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
            }
            return item;
        }
    }

    public static SubLObject sbhl_stack_peek(final SubLObject sbhl_stack) {
        SubLObject item = NIL;
        if (NIL == sbhl_search_datastructures.sbhl_stack_emptyP(sbhl_stack)) {
            item = aref(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), subtract(sbhl_search_datastructures.sbhl_stack_num(sbhl_stack), ONE_INTEGER));
        }
        return item;
    }

    public static final SubLObject clear_sbhl_stack_alt(SubLObject sbhl_stack) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, ZERO_INTEGER);
        vector_utilities.reset_vector(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), NIL);
        return sbhl_stack;
    }

    public static SubLObject clear_sbhl_stack(final SubLObject sbhl_stack) {
        sbhl_search_datastructures._csetf_sbhl_stack_num(sbhl_stack, ZERO_INTEGER);
        vector_utilities.reset_vector(sbhl_search_datastructures.sbhl_stack_elements(sbhl_stack), NIL);
        return sbhl_stack;
    }

    public static final SubLObject sbhl_link_node_search_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.print_sbhl_link_node_search_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_link_node_search_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_search_datastructures.print_sbhl_link_node_search_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_link_node_search_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_link_node_search_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_link_node_search_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_link_node_search_state_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_link_node_search_state_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_link_node_search_state_node(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_link_node_search_state_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_link_node_search_state_module(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_link_node_search_state_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_link_node_search_state_direction(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sbhl_link_node_search_state_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject sbhl_link_node_search_state_mt(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sbhl_link_node_search_state_tv_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject sbhl_link_node_search_state_tv(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sbhl_link_node_search_state_parent_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject sbhl_link_node_search_state_parent_node(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sbhl_link_node_search_state_genl_inverse_modeP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sbhl_link_node_search_state_link_generator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject sbhl_link_node_search_state_link_generator(final SubLObject v_object) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_tv_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_tv(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_parent_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_parent_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_genl_inverse_modeP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_link_generator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_link_generator(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) : "! sbhl_search_datastructures.sbhl_link_node_search_state_p(v_object) " + "sbhl_search_datastructures.sbhl_link_node_search_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_sbhl_link_node_search_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_link_node_search_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NODE)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_node(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MODULE)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_module(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DIRECTION)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_direction(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MT)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_mt(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TV)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_tv(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PARENT_NODE)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_parent_node(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($kw50$GENL_INVERSE_MODE_)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_genl_inverse_modeP(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($LINK_GENERATOR)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_link_generator(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_link_node_search_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_link_node_search_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NODE)) {
                sbhl_search_datastructures._csetf_sbhl_link_node_search_state_node(v_new, current_value);
            } else
                if (pcase_var.eql($MODULE)) {
                    sbhl_search_datastructures._csetf_sbhl_link_node_search_state_module(v_new, current_value);
                } else
                    if (pcase_var.eql($DIRECTION)) {
                        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_direction(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            sbhl_search_datastructures._csetf_sbhl_link_node_search_state_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($TV)) {
                                sbhl_search_datastructures._csetf_sbhl_link_node_search_state_tv(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARENT_NODE)) {
                                    sbhl_search_datastructures._csetf_sbhl_link_node_search_state_parent_node(v_new, current_value);
                                } else
                                    if (pcase_var.eql(sbhl_search_datastructures.$kw54$GENL_INVERSE_MODE_)) {
                                        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_genl_inverse_modeP(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($LINK_GENERATOR)) {
                                            sbhl_search_datastructures._csetf_sbhl_link_node_search_state_link_generator(v_new, current_value);
                                        } else {
                                            Errors.error(sbhl_search_datastructures.$str15$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_link_node_search_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_search_datastructures.MAKE_SBHL_LINK_NODE_SEARCH_STATE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NODE, sbhl_search_datastructures.sbhl_link_node_search_state_node(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE, sbhl_search_datastructures.sbhl_link_node_search_state_module(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, sbhl_search_datastructures.sbhl_link_node_search_state_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, sbhl_search_datastructures.sbhl_link_node_search_state_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $TV, sbhl_search_datastructures.sbhl_link_node_search_state_tv(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_NODE, sbhl_search_datastructures.sbhl_link_node_search_state_parent_node(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_search_datastructures.$kw54$GENL_INVERSE_MODE_, sbhl_search_datastructures.sbhl_link_node_search_state_genl_inverse_modeP(obj));
        funcall(visitor_fn, obj, $SLOT, $LINK_GENERATOR, sbhl_search_datastructures.sbhl_link_node_search_state_link_generator(obj));
        funcall(visitor_fn, obj, $END, sbhl_search_datastructures.MAKE_SBHL_LINK_NODE_SEARCH_STATE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_link_node_search_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_search_datastructures.visit_defstruct_sbhl_link_node_search_state(obj, visitor_fn);
    }

    public static final SubLObject print_sbhl_link_node_search_state_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_2 = v_object;
                    SubLObject stream_3 = stream;
                    write_string($str_alt15$__, stream_3, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_2), new SubLObject[]{ $STREAM, stream_3 });
                    write_char(CHAR_space, stream_3);
                    format(stream, $str_alt52$__a____a_, sbhl_module_vars.get_sbhl_module_link_pred(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_module(v_object)), com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_node(v_object));
                    write_char(CHAR_space, stream_3);
                    write(pointer(v_object_2), new SubLObject[]{ $STREAM, stream_3, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_3);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_sbhl_link_node_search_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, sbhl_search_datastructures.$str58$__a____a_, sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_datastructures.sbhl_link_node_search_state_module(v_object)), sbhl_search_datastructures.sbhl_link_node_search_state_node(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_sbhl_link_node_search_state_alt(SubLObject node, SubLObject module, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject parent_node, SubLObject genl_inverse_modeP, SubLObject link_generator) {
        if (link_generator == UNPROVIDED) {
            link_generator = NIL;
        }
        {
            SubLObject search_state = com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.make_sbhl_link_node_search_state(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_node(search_state, node);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_module(search_state, module);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_direction(search_state, direction);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_mt(search_state, mt);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_tv(search_state, tv);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_parent_node(search_state, parent_node);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_genl_inverse_modeP(search_state, genl_inverse_modeP);
            com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures._csetf_sbhl_link_node_search_state_link_generator(search_state, link_generator);
            return search_state;
        }
    }

    public static SubLObject new_sbhl_link_node_search_state(final SubLObject node, final SubLObject module, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject parent_node, final SubLObject genl_inverse_modeP, SubLObject link_generator) {
        if (link_generator == UNPROVIDED) {
            link_generator = NIL;
        }
        final SubLObject search_state = sbhl_search_datastructures.make_sbhl_link_node_search_state(UNPROVIDED);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_node(search_state, node);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_module(search_state, module);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_direction(search_state, direction);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_mt(search_state, mt);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_tv(search_state, tv);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_parent_node(search_state, parent_node);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_genl_inverse_modeP(search_state, genl_inverse_modeP);
        sbhl_search_datastructures._csetf_sbhl_link_node_search_state_link_generator(search_state, link_generator);
        return search_state;
    }

    public static final SubLObject get_sbhl_link_node_search_state_node_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_node(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_node(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_node(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_module_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_module(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_module(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_module(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_direction_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_direction(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_mt_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_mt(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_mt(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_mt(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_tv_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_tv(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_tv(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_tv(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_parent_node_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_parent_node(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_genl_inverse_modeP_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
    }

    public static final SubLObject get_sbhl_link_node_search_state_link_generator_alt(SubLObject sbhl_link_node_search_state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state);
    }

    public static SubLObject get_sbhl_link_node_search_state_link_generator(final SubLObject sbhl_link_node_search_state) {
        return sbhl_search_datastructures.sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state);
    }

    public static final SubLObject print_sbhl_link_node_search_state_contents_alt(SubLObject sbhl_link_node_search_state, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt53$Node_______________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_node(sbhl_link_node_search_state));
        format(stream, $str_alt54$Module_____________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_module(sbhl_link_node_search_state));
        format(stream, $str_alt55$Direction__________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_direction(sbhl_link_node_search_state));
        format(stream, $str_alt56$Mt_________________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_mt(sbhl_link_node_search_state));
        format(stream, $str_alt57$TV_________________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_tv(sbhl_link_node_search_state));
        format(stream, $str_alt58$Parent_Node________a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state));
        format(stream, $str_alt59$genlInverse_mode___a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state));
        format(stream, $str_alt60$Link_Generator_____a__, com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state));
        return NIL;
    }

    public static SubLObject print_sbhl_link_node_search_state_contents(final SubLObject sbhl_link_node_search_state, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, sbhl_search_datastructures.$str59$Node_______________a__, sbhl_search_datastructures.sbhl_link_node_search_state_node(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str60$Module_____________a__, sbhl_search_datastructures.sbhl_link_node_search_state_module(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str61$Direction__________a__, sbhl_search_datastructures.sbhl_link_node_search_state_direction(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str62$Mt_________________a__, sbhl_search_datastructures.sbhl_link_node_search_state_mt(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str63$TV_________________a__, sbhl_search_datastructures.sbhl_link_node_search_state_tv(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str64$Parent_Node________a__, sbhl_search_datastructures.sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str65$genlInverse_mode___a__, sbhl_search_datastructures.sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state));
        format(stream, sbhl_search_datastructures.$str66$Link_Generator_____a__, sbhl_search_datastructures.sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state));
        return NIL;
    }

    public static SubLObject declare_sbhl_search_datastructures_file() {
        declareFunction("sbhl_stack_print_function_trampoline", "SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_stack_p", "SBHL-STACK-P", 1, 0, false);
        new sbhl_search_datastructures.$sbhl_stack_p$UnaryFunction();
        declareFunction("sbhl_stack_num", "SBHL-STACK-NUM", 1, 0, false);
        declareFunction("sbhl_stack_elements", "SBHL-STACK-ELEMENTS", 1, 0, false);
        declareFunction("_csetf_sbhl_stack_num", "_CSETF-SBHL-STACK-NUM", 2, 0, false);
        declareFunction("_csetf_sbhl_stack_elements", "_CSETF-SBHL-STACK-ELEMENTS", 2, 0, false);
        declareFunction("make_sbhl_stack", "MAKE-SBHL-STACK", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_stack", "VISIT-DEFSTRUCT-SBHL-STACK", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_stack_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-STACK-METHOD", 2, 0, false);
        declareFunction("print_sbhl_stack", "PRINT-SBHL-STACK", 3, 0, false);
        declareFunction("new_sbhl_stack", "NEW-SBHL-STACK", 0, 1, false);
        declareFunction("sbhl_stack_size", "SBHL-STACK-SIZE", 1, 0, false);
        declareFunction("sbhl_stack_emptyP", "SBHL-STACK-EMPTY?", 1, 0, false);
        declareFunction("sbhl_stack_push", "SBHL-STACK-PUSH", 2, 0, false);
        declareFunction("sbhl_stack_pop", "SBHL-STACK-POP", 1, 0, false);
        declareFunction("sbhl_stack_peek", "SBHL-STACK-PEEK", 1, 0, false);
        declareFunction("clear_sbhl_stack", "CLEAR-SBHL-STACK", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_link_node_search_state_p", "SBHL-LINK-NODE-SEARCH-STATE-P", 1, 0, false);
        new sbhl_search_datastructures.$sbhl_link_node_search_state_p$UnaryFunction();
        declareFunction("sbhl_link_node_search_state_node", "SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_module", "SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_direction", "SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_mt", "SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_tv", "SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_parent_node", "SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_genl_inverse_modeP", "SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_link_generator", "SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_module", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_direction", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_mt", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_tv", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_parent_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_genl_inverse_modeP", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_link_generator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 2, 0, false);
        declareFunction("make_sbhl_link_node_search_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_link_node_search_state", "VISIT-DEFSTRUCT-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_link_node_search_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-METHOD", 2, 0, false);
        declareFunction("print_sbhl_link_node_search_state", "PRINT-SBHL-LINK-NODE-SEARCH-STATE", 3, 0, false);
        declareFunction("new_sbhl_link_node_search_state", "NEW-SBHL-LINK-NODE-SEARCH-STATE", 7, 1, false);
        declareFunction("get_sbhl_link_node_search_state_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_direction", "GET-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_mt", "GET-SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_tv", "GET-SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_parent_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_genl_inverse_modeP", "GET-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_link_generator", "GET-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
        declareFunction("print_sbhl_link_node_search_state_contents", "PRINT-SBHL-LINK-NODE-SEARCH-STATE-CONTENTS", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SBHL-STACK-NUM"), makeSymbol("SBHL-STACK-ELEMENTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SBHL-STACK-NUM"), makeSymbol("_CSETF-SBHL-STACK-ELEMENTS"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$__ = makeString("#<");

    static private final SubLString $str_alt17$size_ = makeString("size=");

    static private final SubLList $list_alt22 = list(makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("PARENT-NODE"), makeSymbol("GENL-INVERSE-MODE?"), makeSymbol("LINK-GENERATOR"));

    static private final SubLList $list_alt23 = list($NODE, makeKeyword("MODULE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("PARENT-NODE"), makeKeyword("GENL-INVERSE-MODE?"), makeKeyword("LINK-GENERATOR"));

    static private final SubLList $list_alt24 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));

    public static SubLObject init_sbhl_search_datastructures_file() {
        defconstant("*DTP-SBHL-STACK*", sbhl_search_datastructures.SBHL_STACK);
        defconstant("*DTP-SBHL-LINK-NODE-SEARCH-STATE*", sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE);
        return NIL;
    }

    public static final SubLObject setup_sbhl_search_datastructures_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_stack$.getGlobalValue(), symbol_function(SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SBHL_STACK_NUM, _CSETF_SBHL_STACK_NUM);
        def_csetf(SBHL_STACK_ELEMENTS, _CSETF_SBHL_STACK_ELEMENTS);
        identity(SBHL_STACK);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state$.getGlobalValue(), symbol_function(SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_NODE, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_MODULE, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_DIRECTION, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_MT, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_TV, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE);
        def_csetf($sym40$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR, _CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR);
        identity(SBHL_LINK_NODE_SEARCH_STATE);
        return NIL;
    }

    public static SubLObject setup_sbhl_search_datastructures_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), symbol_function(sbhl_search_datastructures.SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_search_datastructures.$list8);
            def_csetf(sbhl_search_datastructures.SBHL_STACK_NUM, sbhl_search_datastructures._CSETF_SBHL_STACK_NUM);
            def_csetf(sbhl_search_datastructures.SBHL_STACK_ELEMENTS, sbhl_search_datastructures._CSETF_SBHL_STACK_ELEMENTS);
            identity(sbhl_search_datastructures.SBHL_STACK);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), symbol_function(sbhl_search_datastructures.VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), symbol_function(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_search_datastructures.$list31);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_NODE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_MODULE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_DIRECTION, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_MT, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_TV, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE);
            def_csetf(sbhl_search_datastructures.$sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, sbhl_search_datastructures.$sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
            def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR);
            identity(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), symbol_function(sbhl_search_datastructures.VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym40$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_search_datastructures_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), symbol_function(sbhl_search_datastructures.SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_search_datastructures.$list8);
        def_csetf(sbhl_search_datastructures.SBHL_STACK_NUM, sbhl_search_datastructures._CSETF_SBHL_STACK_NUM);
        def_csetf(sbhl_search_datastructures.SBHL_STACK_ELEMENTS, sbhl_search_datastructures._CSETF_SBHL_STACK_ELEMENTS);
        identity(sbhl_search_datastructures.SBHL_STACK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), symbol_function(sbhl_search_datastructures.VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), symbol_function(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_search_datastructures.$list31);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_NODE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_MODULE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_DIRECTION, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_MT, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_TV, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE);
        def_csetf(sbhl_search_datastructures.$sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, sbhl_search_datastructures.$sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
        def_csetf(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR, sbhl_search_datastructures._CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR);
        identity(sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), symbol_function(sbhl_search_datastructures.VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt25 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));

    @Override
    public void declareFunctions() {
        sbhl_search_datastructures.declare_sbhl_search_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_search_datastructures.init_sbhl_search_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_search_datastructures.setup_sbhl_search_datastructures_file();
    }

    static {
    }

    static private final SubLSymbol $sym40$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");

    static private final SubLSymbol $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");

    public static final SubLSymbol $kw50$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");

    static private final SubLString $str_alt52$__a____a_ = makeString("(~a : ~a)");

    static private final SubLString $str_alt53$Node_______________a__ = makeString("Node:             ~a~%");

    static private final SubLString $str_alt54$Module_____________a__ = makeString("Module:           ~a~%");

    static private final SubLString $str_alt55$Direction__________a__ = makeString("Direction:        ~a~%");

    static private final SubLString $str_alt56$Mt_________________a__ = makeString("Mt:               ~a~%");

    public static final class $sbhl_stack_p$UnaryFunction extends UnaryFunction {
        public $sbhl_stack_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-STACK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_search_datastructures.sbhl_stack_p(arg1);
        }
    }

    static private final SubLString $str_alt57$TV_________________a__ = makeString("TV:               ~a~%");

    static private final SubLString $str_alt58$Parent_Node________a__ = makeString("Parent Node:      ~a~%");

    static private final SubLString $str_alt59$genlInverse_mode___a__ = makeString("genlInverse mode: ~a~%");

    static private final SubLString $str_alt60$Link_Generator_____a__ = makeString("Link Generator:   ~a~%");

    public static final class $sbhl_link_node_search_state_native extends SubLStructNative {
        public SubLObject $node;

        public SubLObject $module;

        public SubLObject $direction;

        public SubLObject $mt;

        public SubLObject $tv;

        public SubLObject $parent_node;

        public SubLObject $genl_inverse_modeP;

        public SubLObject $link_generator;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_link_node_search_state_native() {
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$node = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$module = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$direction = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$mt = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$tv = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$parent_node = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$genl_inverse_modeP = Lisp.NIL;
            sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$link_generator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$node;
        }

        @Override
        public SubLObject getField3() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$module;
        }

        @Override
        public SubLObject getField4() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$direction;
        }

        @Override
        public SubLObject getField5() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$tv;
        }

        @Override
        public SubLObject getField7() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$parent_node;
        }

        @Override
        public SubLObject getField8() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$genl_inverse_modeP;
        }

        @Override
        public SubLObject getField9() {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$link_generator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$node = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$module = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$direction = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$tv = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$parent_node = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$genl_inverse_modeP = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return sbhl_search_datastructures.$sbhl_link_node_search_state_native.this.$link_generator = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures.$sbhl_link_node_search_state_native.class, sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE, sbhl_search_datastructures.SBHL_LINK_NODE_SEARCH_STATE_P, sbhl_search_datastructures.$list25, sbhl_search_datastructures.$list26, new String[]{ "$node", "$module", "$direction", "$mt", "$tv", "$parent_node", "$genl_inverse_modeP", "$link_generator" }, sbhl_search_datastructures.$list27, sbhl_search_datastructures.$list28, sbhl_search_datastructures.PRINT_SBHL_LINK_NODE_SEARCH_STATE);
        }
    }

    public static final class $sbhl_link_node_search_state_p$UnaryFunction extends UnaryFunction {
        public $sbhl_link_node_search_state_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-LINK-NODE-SEARCH-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_search_datastructures.sbhl_link_node_search_state_p(arg1);
        }
    }
}

/**
 * Total time: 120 ms
 */

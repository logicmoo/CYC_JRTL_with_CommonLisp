/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_module;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-LINKS
 * source file: /cyc/top/cycl/sbhl/sbhl-links.lisp
 * created:     2019/07/03 17:37:25
 */
public final class sbhl_links extends SubLTranslatedFile implements V12 {
    public static final class $sbhl_undirected_link_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native.this.$links;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native.this.$links = value;
        }

        public SubLObject $links = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native.class, SBHL_UNDIRECTED_LINK, SBHL_UNDIRECTED_LINK_P, $list_alt19, $list_alt20, new String[]{ "$links" }, $list_alt21, $list_alt22, PRINT_LINK);
    }

    public static final SubLFile me = new sbhl_links();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_links";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_directed_link$ = makeSymbol("*DTP-SBHL-DIRECTED-LINK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_undirected_link$ = makeSymbol("*DTP-SBHL-UNDIRECTED-LINK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SBHL_DIRECTED_LINK = makeSymbol("SBHL-DIRECTED-LINK");

    private static final SubLSymbol SBHL_DIRECTED_LINK_P = makeSymbol("SBHL-DIRECTED-LINK-P");

    private static final SubLInteger $int$220 = makeInteger(220);

    static private final SubLList $list3 = list(makeSymbol("PREDICATE-LINKS"), makeSymbol("INVERSE-LINKS"));

    static private final SubLList $list4 = list(makeKeyword("PREDICATE-LINKS"), makeKeyword("INVERSE-LINKS"));

    static private final SubLList $list5 = list(makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    private static final SubLSymbol PRINT_LINK = makeSymbol("PRINT-LINK");

    private static final SubLSymbol SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-DIRECTED-LINK-P"));

    private static final SubLSymbol SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS");

    private static final SubLSymbol _CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS");

    private static final SubLSymbol SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS");

    private static final SubLSymbol _CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SBHL_DIRECTED_LINK = makeSymbol("MAKE-SBHL-DIRECTED-LINK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD");

    private static final SubLSymbol SBHL_UNDIRECTED_LINK = makeSymbol("SBHL-UNDIRECTED-LINK");

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_P = makeSymbol("SBHL-UNDIRECTED-LINK-P");

    private static final SubLInteger $int$221 = makeInteger(221);

    private static final SubLList $list25 = list(makeSymbol("LINKS"));

    private static final SubLList $list26 = list(makeKeyword("LINKS"));

    private static final SubLList $list27 = list(makeSymbol("SBHL-UNDIRECTED-LINK-LINKS"));

    private static final SubLList $list28 = list(makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS"));

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list30 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-UNDIRECTED-LINK-P"));

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("SBHL-UNDIRECTED-LINK-LINKS");

    private static final SubLSymbol _CSETF_SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS");

    private static final SubLSymbol MAKE_SBHL_UNDIRECTED_LINK = makeSymbol("MAKE-SBHL-UNDIRECTED-LINK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD");

    private static final SubLString $str38$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str43$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLSymbol SBHL_DIRECTED_DIRECTION_P = makeSymbol("SBHL-DIRECTED-DIRECTION-P");

    private static final SubLSymbol SBHL_MT_LINKS_OBJECT_P = makeSymbol("SBHL-MT-LINKS-OBJECT-P");

    private static final SubLSymbol SBHL_TV_LINKS_OBJECT_P = makeSymbol("SBHL-TV-LINKS-OBJECT-P");

    private static final SubLSymbol SBHL_MT_OBJECT_P = makeSymbol("SBHL-MT-OBJECT-P");

    private static final SubLSymbol SBHL_LINK_TRUTH_VALUE_P = makeSymbol("SBHL-LINK-TRUTH-VALUE-P");

    private static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    private static final SubLString $str50$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLSymbol SBHL_LINK_NODES_OBJECT_P = makeSymbol("SBHL-LINK-NODES-OBJECT-P");

    public static final SubLObject sbhl_directed_link_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_links.print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_directed_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_links.print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_directed_link_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_directed_link_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_directed_link_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_directed_link_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_directed_link_predicate_links_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_DIRECTED_LINK_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_directed_link_predicate_links(final SubLObject v_object) {
        assert NIL != sbhl_links.sbhl_directed_link_p(v_object) : "! sbhl_links.sbhl_directed_link_p(v_object) " + "sbhl_links.sbhl_directed_link_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_directed_link_inverse_links_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_DIRECTED_LINK_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_directed_link_inverse_links(final SubLObject v_object) {
        assert NIL != sbhl_links.sbhl_directed_link_p(v_object) : "! sbhl_links.sbhl_directed_link_p(v_object) " + "sbhl_links.sbhl_directed_link_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_sbhl_directed_link_predicate_links_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_DIRECTED_LINK_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_directed_link_predicate_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_links.sbhl_directed_link_p(v_object) : "! sbhl_links.sbhl_directed_link_p(v_object) " + "sbhl_links.sbhl_directed_link_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_directed_link_inverse_links_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_DIRECTED_LINK_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_directed_link_inverse_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_links.sbhl_directed_link_p(v_object) : "! sbhl_links.sbhl_directed_link_p(v_object) " + "sbhl_links.sbhl_directed_link_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_sbhl_directed_link_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_directed_link_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PREDICATE_LINKS)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_directed_link_predicate_links(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INVERSE_LINKS)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_directed_link_inverse_links(v_new, current_value);
                        } else {
                            Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_directed_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_directed_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PREDICATE_LINKS)) {
                sbhl_links._csetf_sbhl_directed_link_predicate_links(v_new, current_value);
            } else
                if (pcase_var.eql($INVERSE_LINKS)) {
                    sbhl_links._csetf_sbhl_directed_link_inverse_links(v_new, current_value);
                } else {
                    Errors.error(sbhl_links.$str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_directed_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_links.MAKE_SBHL_DIRECTED_LINK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PREDICATE_LINKS, sbhl_links.sbhl_directed_link_predicate_links(obj));
        funcall(visitor_fn, obj, $SLOT, $INVERSE_LINKS, sbhl_links.sbhl_directed_link_inverse_links(obj));
        funcall(visitor_fn, obj, $END, sbhl_links.MAKE_SBHL_DIRECTED_LINK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_directed_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_links.visit_defstruct_sbhl_directed_link(obj, visitor_fn);
    }

    public static final SubLObject sbhl_undirected_link_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_links.print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_undirected_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_links.print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_undirected_link_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_undirected_link_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_undirected_link_links_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_UNDIRECTED_LINK_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_undirected_link_links(final SubLObject v_object) {
        assert NIL != sbhl_links.sbhl_undirected_link_p(v_object) : "! sbhl_links.sbhl_undirected_link_p(v_object) " + "sbhl_links.sbhl_undirected_link_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_sbhl_undirected_link_links_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_UNDIRECTED_LINK_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_undirected_link_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_links.sbhl_undirected_link_p(v_object) : "! sbhl_links.sbhl_undirected_link_p(v_object) " + "sbhl_links.sbhl_undirected_link_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_sbhl_undirected_link_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LINKS)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_undirected_link_links(v_new, current_value);
                    } else {
                        Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_undirected_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_undirected_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINKS)) {
                sbhl_links._csetf_sbhl_undirected_link_links(v_new, current_value);
            } else {
                Errors.error(sbhl_links.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_undirected_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_links.MAKE_SBHL_UNDIRECTED_LINK, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LINKS, sbhl_links.sbhl_undirected_link_links(obj));
        funcall(visitor_fn, obj, $END, sbhl_links.MAKE_SBHL_UNDIRECTED_LINK, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_undirected_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_links.visit_defstruct_sbhl_undirected_link(obj, visitor_fn);
    }

    public static final SubLObject print_link_alt(SubLObject link, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(link, stream);
            } else {
                {
                    SubLObject v_object = link;
                    SubLObject stream_1 = stream;
                    write_string($str_alt27$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_link(final SubLObject link, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(link, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, link, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, link, T, T);
        }
        return NIL;
    }

    /**
     * Constructor: @return sbhl-directed-link-p; with MT-LINKS in the DIRECTION field
     */
    @LispMethod(comment = "Constructor: @return sbhl-directed-link-p; with MT-LINKS in the DIRECTION field")
    public static final SubLObject create_sbhl_directed_link_alt(SubLObject direction, SubLObject mt_links) {
        {
            SubLObject direction_link = com.cyc.cycjava.cycl.sbhl.sbhl_links.make_sbhl_directed_link(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_links.set_sbhl_directed_link(direction_link, direction, mt_links);
            return direction_link;
        }
    }

    /**
     * Constructor: @return sbhl-directed-link-p; with MT-LINKS in the DIRECTION field
     */
    @LispMethod(comment = "Constructor: @return sbhl-directed-link-p; with MT-LINKS in the DIRECTION field")
    public static SubLObject create_sbhl_directed_link(final SubLObject direction, final SubLObject mt_links) {
        final SubLObject direction_link = sbhl_links.make_sbhl_directed_link(UNPROVIDED);
        sbhl_links.set_sbhl_directed_link(direction_link, direction, mt_links);
        return direction_link;
    }

    /**
     * Constructor: @return sbhl-undirected-link-p; with MT-LINKS in the links field
     */
    @LispMethod(comment = "Constructor: @return sbhl-undirected-link-p; with MT-LINKS in the links field")
    public static final SubLObject create_sbhl_undirected_link_alt(SubLObject mt_links) {
        {
            SubLObject direction_link = com.cyc.cycjava.cycl.sbhl.sbhl_links.make_sbhl_undirected_link(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_links.set_sbhl_undirected_link(direction_link, mt_links);
            return direction_link;
        }
    }

    /**
     * Constructor: @return sbhl-undirected-link-p; with MT-LINKS in the links field
     */
    @LispMethod(comment = "Constructor: @return sbhl-undirected-link-p; with MT-LINKS in the links field")
    public static SubLObject create_sbhl_undirected_link(final SubLObject mt_links) {
        final SubLObject direction_link = sbhl_links.make_sbhl_undirected_link(UNPROVIDED);
        sbhl_links.set_sbhl_undirected_link(direction_link, mt_links);
        return direction_link;
    }

    /**
     * Constructor: @return sbhl-direction-link-p; with direction field DIRECTION filled with MT-LINKS. uses MODULE / *sbhl-module* to assess whether links are directed
     */
    @LispMethod(comment = "Constructor: @return sbhl-direction-link-p; with direction field DIRECTION filled with MT-LINKS. uses MODULE / *sbhl-module* to assess whether links are directed")
    public static final SubLObject create_sbhl_direction_link_alt(SubLObject direction, SubLObject mt_links, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction_link = NIL;
            direction_link = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_links.create_sbhl_directed_link(direction, mt_links))) : com.cyc.cycjava.cycl.sbhl.sbhl_links.create_sbhl_undirected_link(mt_links);
            return direction_link;
        }
    }

    /**
     * Constructor: @return sbhl-direction-link-p; with direction field DIRECTION filled with MT-LINKS. uses MODULE / *sbhl-module* to assess whether links are directed
     */
    @LispMethod(comment = "Constructor: @return sbhl-direction-link-p; with direction field DIRECTION filled with MT-LINKS. uses MODULE / *sbhl-module* to assess whether links are directed")
    public static SubLObject create_sbhl_direction_link(final SubLObject direction, final SubLObject mt_links, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject direction_link = NIL;
        direction_link = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? sbhl_links.create_sbhl_directed_link(direction, mt_links) : sbhl_links.create_sbhl_undirected_link(mt_links);
        return direction_link;
    }

    /**
     * Accessor: @return booleanp; is D-LINK either an sbhl-directed-link or sbhl-undirected-link, or neither.
     */
    @LispMethod(comment = "Accessor: @return booleanp; is D-LINK either an sbhl-directed-link or sbhl-undirected-link, or neither.")
    public static final SubLObject sbhl_direction_link_p_alt(SubLObject d_link) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_directed_link_p(d_link)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_undirected_link_p(d_link)));
    }

    /**
     * Accessor: @return booleanp; is D-LINK either an sbhl-directed-link or sbhl-undirected-link, or neither.
     */
    @LispMethod(comment = "Accessor: @return booleanp; is D-LINK either an sbhl-directed-link or sbhl-undirected-link, or neither.")
    public static SubLObject sbhl_direction_link_p(final SubLObject d_link) {
        return makeBoolean((NIL != sbhl_links.sbhl_directed_link_p(d_link)) || (NIL != sbhl_links.sbhl_undirected_link_p(d_link)));
    }

    /**
     * Accessor: @return booleanp; whether NODE has any sbhl links in PRED / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has any sbhl links in PRED / *sbhl-module*")
    public static final SubLObject any_sbhl_links_p_alt(SubLObject node, SubLObject pred) {
        return list_utilities.sublisp_boolean(sbhl_graphs.get_sbhl_graph_link(node, get_sbhl_module(pred)));
    }

    /**
     * Accessor: @return booleanp; whether NODE has any sbhl links in PRED / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has any sbhl links in PRED / *sbhl-module*")
    public static SubLObject any_sbhl_links_p(final SubLObject node, final SubLObject pred) {
        return list_utilities.sublisp_boolean(sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(pred)));
    }

    /**
     * Accessor: @return booleanp; whether NODE has any forward sbhl links in PRED / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has any forward sbhl links in PRED / *sbhl-module*")
    public static final SubLObject any_sbhl_predicate_links_p_alt(SubLObject node, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, pred, SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, pred, SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, pred, SBHL_PREDICATE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, pred, SBHL_PREDICATE_P);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject module = get_sbhl_module(pred);
                SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
                if (NIL != direction_link) {
                    if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
                        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_directed_link_predicate_links(direction_link));
                    } else {
                        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_undirected_link_links(direction_link));
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accessor: @return booleanp; whether NODE has any forward sbhl links in PRED / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE has any forward sbhl links in PRED / *sbhl-module*")
    public static SubLObject any_sbhl_predicate_links_p(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_utilities.sbhl_predicate_p(pred))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, pred, sbhl_links.SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, pred, sbhl_links.SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, pred, sbhl_links.SBHL_PREDICATE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, pred, sbhl_links.SBHL_PREDICATE_P);
                    }


        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL == direction_link) {
            return NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.sublisp_boolean(sbhl_links.sbhl_directed_link_predicate_links(direction_link));
        }
        return list_utilities.sublisp_boolean(sbhl_links.sbhl_undirected_link_links(direction_link));
    }

    /**
     * Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of DIRECTED-LINK
     */
    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of DIRECTED-LINK")
    public static final SubLObject get_sbhl_directed_mt_links_alt(SubLObject directed_link, SubLObject direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (direction == sbhl_link_vars.get_sbhl_forward_directed_direction()) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_directed_link_predicate_links(directed_link);
            } else {
                if (direction == sbhl_link_vars.get_sbhl_backward_directed_direction()) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_directed_link_inverse_links(directed_link);
                } else {
                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                        if (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction)) {
                            {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                                        } else {
                                            Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                                        }
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

    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of DIRECTED-LINK")
    public static SubLObject get_sbhl_directed_mt_links(final SubLObject directed_link, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            return sbhl_links.sbhl_directed_link_predicate_links(directed_link);
        }
        if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
            return sbhl_links.sbhl_directed_link_inverse_links(directed_link);
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P);
                    }


        }
        return NIL;
    }

    /**
     * Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of UNDIRECTED-LINK
     */
    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of UNDIRECTED-LINK")
    public static final SubLObject get_sbhl_undirected_mt_links_alt(SubLObject undirected_link) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_undirected_link_links(undirected_link);
    }

    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of UNDIRECTED-LINK")
    public static SubLObject get_sbhl_undirected_mt_links(final SubLObject undirected_link) {
        return sbhl_links.sbhl_undirected_link_links(undirected_link);
    }

    /**
     * Accessor: @return the sbhl-mt-links in the DIRECTION field of DIRECTION-LINK. uses MODULE / *sbhl-module* to assess whether links are directed.
     */
    @LispMethod(comment = "Accessor: @return the sbhl-mt-links in the DIRECTION field of DIRECTION-LINK. uses MODULE / *sbhl-module* to assess whether links are directed.")
    public static final SubLObject get_sbhl_mt_links_alt(SubLObject direction_link, SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject mt_links = NIL;
            mt_links = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_directed_mt_links(direction_link, direction))) : com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_undirected_mt_links(direction_link);
            return mt_links;
        }
    }

    /**
     * Accessor: @return the sbhl-mt-links in the DIRECTION field of DIRECTION-LINK. uses MODULE / *sbhl-module* to assess whether links are directed.
     */
    @LispMethod(comment = "Accessor: @return the sbhl-mt-links in the DIRECTION field of DIRECTION-LINK. uses MODULE / *sbhl-module* to assess whether links are directed.")
    public static SubLObject get_sbhl_mt_links(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject mt_links = NIL;
        mt_links = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? sbhl_links.get_sbhl_directed_mt_links(direction_link, direction) : sbhl_links.get_sbhl_undirected_mt_links(direction_link);
        return mt_links;
    }

    /**
     * Modifier: Sets the DIRECTION field of DIRECTED-LINK to be VALUE
     */
    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTED-LINK to be VALUE")
    public static final SubLObject set_sbhl_directed_link_alt(SubLObject directed_link, SubLObject direction, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_directed_link_p(directed_link)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != value) {
                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_mt_links_object_p(value)) {
                        {
                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                                    } else {
                                        Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (direction == sbhl_link_vars.get_sbhl_forward_directed_direction()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_directed_link_predicate_links(directed_link, value);
            } else {
                if (direction == sbhl_link_vars.get_sbhl_backward_directed_direction()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_directed_link_inverse_links(directed_link, value);
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Sets the DIRECTION field of DIRECTED-LINK to be VALUE
     */
    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTED-LINK to be VALUE")
    public static SubLObject set_sbhl_directed_link(final SubLObject directed_link, final SubLObject direction, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_directed_link_p(directed_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, directed_link, sbhl_links.SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, directed_link, sbhl_links.SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, directed_link, sbhl_links.SBHL_DIRECTED_LINK_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, directed_link, sbhl_links.SBHL_DIRECTED_LINK_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, direction, sbhl_links.SBHL_DIRECTED_DIRECTION_P);
                    }


        }
        if (((NIL != value) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_links.sbhl_mt_links_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            sbhl_links._csetf_sbhl_directed_link_predicate_links(directed_link, value);
        } else
            if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
                sbhl_links._csetf_sbhl_directed_link_inverse_links(directed_link, value);
            }

        return NIL;
    }

    /**
     * Modifier: Sets the links field of UNDIRECTED-LINK to be VALUE. ensures DIRECTION is :link
     */
    @LispMethod(comment = "Modifier: Sets the links field of UNDIRECTED-LINK to be VALUE. ensures DIRECTION is :link")
    public static final SubLObject set_sbhl_undirected_link_alt(SubLObject undirected_link, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_undirected_link_p(undirected_link)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != value) {
                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_mt_links_object_p(value)) {
                        {
                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                                    } else {
                                        Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_links._csetf_sbhl_undirected_link_links(undirected_link, value);
            return NIL;
        }
    }

    /**
     * Modifier: Sets the links field of UNDIRECTED-LINK to be VALUE. ensures DIRECTION is :link
     */
    @LispMethod(comment = "Modifier: Sets the links field of UNDIRECTED-LINK to be VALUE. ensures DIRECTION is :link")
    public static SubLObject set_sbhl_undirected_link(final SubLObject undirected_link, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_undirected_link_p(undirected_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, undirected_link, sbhl_links.SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, undirected_link, sbhl_links.SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, undirected_link, sbhl_links.SBHL_UNDIRECTED_LINK_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, undirected_link, sbhl_links.SBHL_UNDIRECTED_LINK_P);
                    }


        }
        if (((NIL != value) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_links.sbhl_mt_links_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        sbhl_links._csetf_sbhl_undirected_link_links(undirected_link, value);
        return NIL;
    }

    /**
     * Modifier: Sets the DIRECTION field of DIRECTION-LINK to be VALUE. uses MODULE / *sbhl-module* to assess whether links are directed.
     */
    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTION-LINK to be VALUE. uses MODULE / *sbhl-module* to assess whether links are directed.")
    public static final SubLObject set_sbhl_direction_link_alt(SubLObject direction_link, SubLObject direction, SubLObject value, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            com.cyc.cycjava.cycl.sbhl.sbhl_links.set_sbhl_directed_link(direction_link, direction, value);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_links.set_sbhl_undirected_link(direction_link, value);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTION-LINK to be VALUE. uses MODULE / *sbhl-module* to assess whether links are directed.")
    public static SubLObject set_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject value, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            sbhl_links.set_sbhl_directed_link(direction_link, direction, value);
        } else {
            sbhl_links.set_sbhl_undirected_link(direction_link, value);
        }
        return NIL;
    }/**
     * Modifier: Sets the DIRECTION field of DIRECTION-LINK to be VALUE. uses MODULE / *sbhl-module* to assess whether links are directed.
     */


    /**
     * Modifier: Sets the DIRECTION field of DIRECTION-LINK to NIL. @see set-sbhl-direction-link.
     */
    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTION-LINK to NIL. @see set-sbhl-direction-link.")
    public static final SubLObject remove_sbhl_direction_link_alt(SubLObject direction_link, SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        com.cyc.cycjava.cycl.sbhl.sbhl_links.set_sbhl_direction_link(direction_link, direction, NIL, module);
        return NIL;
    }

    @LispMethod(comment = "Modifier: Sets the DIRECTION field of DIRECTION-LINK to NIL. @see set-sbhl-direction-link.")
    public static SubLObject remove_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        sbhl_links.set_sbhl_direction_link(direction_link, direction, NIL, module);
        return NIL;
    }/**
     * Modifier: Sets the DIRECTION field of DIRECTION-LINK to NIL. @see set-sbhl-direction-link.
     */


    /**
     * Constructor: @return sbhl-mt-links; with an entry with key MT and value TV-LINKS
     */
    @LispMethod(comment = "Constructor: @return sbhl-mt-links; with an entry with key MT and value TV-LINKS")
    public static final SubLObject create_sbhl_mt_links_alt(SubLObject mt, SubLObject tv_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject mt_links = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                dictionary.dictionary_enter(mt_links, mt, tv_links);
                return mt_links;
            }
        }
    }

    /**
     * Constructor: @return sbhl-mt-links; with an entry with key MT and value TV-LINKS
     */
    @LispMethod(comment = "Constructor: @return sbhl-mt-links; with an entry with key MT and value TV-LINKS")
    public static SubLObject create_sbhl_mt_links(final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                    }


        }
        final SubLObject mt_links = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        dictionary.dictionary_enter(mt_links, mt, tv_links);
        return mt_links;
    }

    /**
     * Accessor: @return booleanp; whether OBJECT is a dictionary.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a dictionary.")
    public static final SubLObject sbhl_mt_links_object_p_alt(SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a dictionary.")
    public static SubLObject sbhl_mt_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }/**
     * Accessor: @return booleanp; whether OBJECT is a dictionary.
     */


    /**
     * Accessor: @return booleanp; whether MT-LINKS is a dictionary, with keys (mts) passing the test @hack fort-p. all values in mt-links dictionary must pass the test @see sbhl-tv-links-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MT-LINKS is a dictionary, with keys (mts) passing the test @hack fort-p. all values in mt-links dictionary must pass the test @see sbhl-tv-links-p.")
    public static final SubLObject sbhl_wf_mt_links_p_alt(SubLObject mt_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject invalidP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                while (!((NIL != invalidP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject tv_links = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != sbhl_link_vars.sbhl_mt_object_p(mt)) {
                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_wf_tv_links_p(tv_links)) {
                                invalidP = T;
                            }
                        } else {
                            invalidP = T;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(NIL == invalidP);
            }
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MT-LINKS is a dictionary, with keys (mts) passing the test @hack fort-p. all values in mt-links dictionary must pass the test @see sbhl-tv-links-p.")
    public static SubLObject sbhl_wf_mt_links_p(final SubLObject mt_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == invalidP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sbhl_link_vars.sbhl_mt_object_p(mt)) {
                if (NIL == sbhl_links.sbhl_wf_tv_links_p(tv_links)) {
                    invalidP = T;
                }
            } else {
                invalidP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == invalidP);
    }/**
     * Accessor: @return booleanp; whether MT-LINKS is a dictionary, with keys (mts) passing the test @hack fort-p. all values in mt-links dictionary must pass the test @see sbhl-tv-links-p.
     */


    /**
     * Accessor: @return sbhl-mt-links-object-p; the mt-links structure with DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links structure with DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_graph_mt_links_alt(SubLObject node, SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module);
    }

    @LispMethod(comment = "Accessor: @return sbhl-mt-links-object-p; the mt-links structure with DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_graph_mt_links(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_links.get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module);
    }/**
     * Accessor: @return sbhl-mt-links-object-p; the mt-links structure with DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*
     */


    /**
     * Accessor: @return listp; the mt keys for the mt-links structure within the DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return listp; the mt keys for the mt-links structure within the DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_graph_link_mts_alt(SubLObject node, SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return dictionary.dictionary_keys(com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_graph_mt_links(node, direction, module));
    }

    @LispMethod(comment = "Accessor: @return listp; the mt keys for the mt-links structure within the DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_graph_link_mts(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return dictionary.dictionary_keys(sbhl_links.get_sbhl_graph_mt_links(node, direction, module));
    }/**
     * Accessor: @return listp; the mt keys for the mt-links structure within the DIRECTION field of the sbhl-direction-link corresponding to NODE and MODULE / *sbhl-module*
     */


    /**
     * Accessor: @return sbhl-tv-links-p; the tv-links stucture after hashing on MT within MT-LINKS
     */
    @LispMethod(comment = "Accessor: @return sbhl-tv-links-p; the tv-links stucture after hashing on MT within MT-LINKS")
    public static final SubLObject get_sbhl_tv_links_alt(SubLObject mt_links, SubLObject mt) {
        return dictionary.dictionary_lookup_without_values(mt_links, mt, UNPROVIDED);
    }

    @LispMethod(comment = "Accessor: @return sbhl-tv-links-p; the tv-links stucture after hashing on MT within MT-LINKS")
    public static SubLObject get_sbhl_tv_links(final SubLObject mt_links, final SubLObject mt) {
        return dictionary.dictionary_lookup_without_values(mt_links, mt, UNPROVIDED);
    }/**
     * Accessor: @return sbhl-tv-links-p; the tv-links stucture after hashing on MT within MT-LINKS
     */


    /**
     * Modifier: sets the value corresponding to key MT in MT-LINKS to be TV-LINKS
     */
    @LispMethod(comment = "Modifier: sets the value corresponding to key MT in MT-LINKS to be TV-LINKS")
    public static final SubLObject set_sbhl_mt_links_alt(SubLObject mt_links, SubLObject mt, SubLObject tv_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tv_links) {
                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                        {
                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                    } else {
                                        Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                    if (NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
                        {
                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                    } else {
                                        Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                    }
                                }
                            }
                        }
                    }
                }
                dictionary.dictionary_enter(mt_links, mt, tv_links);
            } else {
                dictionary.dictionary_remove(mt_links, mt);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: sets the value corresponding to key MT in MT-LINKS to be TV-LINKS")
    public static SubLObject set_sbhl_mt_links(final SubLObject mt_links, final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tv_links) {
            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql($ERROR)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($CERROR)) {
                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($WARN)) {
                            Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                        } else {
                            Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                        }


            }
            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql($ERROR)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($CERROR)) {
                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($WARN)) {
                            Errors.warn(sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                        } else {
                            Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                        }


            }
            dictionary.dictionary_enter(mt_links, mt, tv_links);
        } else {
            dictionary.dictionary_remove(mt_links, mt);
        }
        return NIL;
    }/**
     * Modifier: sets the value corresponding to key MT in MT-LINKS to be TV-LINKS
     */


    /**
     * Modifier: removes the value and key corresponding to MT from the sbhl-direction-link specified by NODE and DIRECTION wrt MODULE / *sbhl-module* (@see get-sbhl-graph-link)
     */
    @LispMethod(comment = "Modifier: removes the value and key corresponding to MT from the sbhl-direction-link specified by NODE and DIRECTION wrt MODULE / *sbhl-module* (@see get-sbhl-graph-link)")
    public static final SubLObject remove_sbhl_mt_link_from_graph_alt(SubLObject node, SubLObject mt, SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
            dictionary.dictionary_remove(com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_mt_links(direction_link, direction, module), mt);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: removes the value and key corresponding to MT from the sbhl-direction-link specified by NODE and DIRECTION wrt MODULE / *sbhl-module* (@see get-sbhl-graph-link)")
    public static SubLObject remove_sbhl_mt_link_from_graph(final SubLObject node, final SubLObject mt, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        dictionary.dictionary_remove(sbhl_links.get_sbhl_mt_links(direction_link, direction, module), mt);
        return NIL;
    }/**
     * Modifier: removes the value and key corresponding to MT from the sbhl-direction-link specified by NODE and DIRECTION wrt MODULE / *sbhl-module* (@see get-sbhl-graph-link)
     */


    /**
     * Modifier: removes the value and key corresponding to MT from the mt-links specified by NODE wrt *sbhl-module* (@see get-sbhl-graph-link). requires *sbhl-module* to be defined in order to have correct removal from direction links.
     */
    @LispMethod(comment = "Modifier: removes the value and key corresponding to MT from the mt-links specified by NODE wrt *sbhl-module* (@see get-sbhl-graph-link). requires *sbhl-module* to be defined in order to have correct removal from direction links.")
    public static final SubLObject remove_sbhl_mt_link_from_relevant_directions_alt(SubLObject node, SubLObject mt, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_links.remove_sbhl_mt_link_from_graph(node, mt, direction, module);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: removes the value and key corresponding to MT from the mt-links specified by NODE wrt *sbhl-module* (@see get-sbhl-graph-link). requires *sbhl-module* to be defined in order to have correct removal from direction links.")
    public static SubLObject remove_sbhl_mt_link_from_relevant_directions(final SubLObject node, final SubLObject mt, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_links.remove_sbhl_mt_link_from_graph(node, mt, direction, module);
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Modifier: removes the value and key corresponding to MT from the mt-links specified by NODE wrt *sbhl-module* (@see get-sbhl-graph-link). requires *sbhl-module* to be defined in order to have correct removal from direction links.
     */


    /**
     * Modifier: removes data from the MT slot of MT-LINKS.
     */
    @LispMethod(comment = "Modifier: removes data from the MT slot of MT-LINKS.")
    public static final SubLObject remove_sbhl_mt_link_alt(SubLObject mt_links, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_mt_links_object_p(mt_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary.dictionary_remove(mt_links, mt);
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: removes data from the MT slot of MT-LINKS.")
    public static SubLObject remove_sbhl_mt_link(final SubLObject mt_links, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_mt_links_object_p(mt_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, mt_links, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt_links, sbhl_links.SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, mt_links, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt_links, sbhl_links.SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, mt, sbhl_links.SBHL_MT_OBJECT_P);
                    }


        }
        dictionary.dictionary_remove(mt_links, mt);
        return NIL;
    }/**
     * Modifier: removes data from the MT slot of MT-LINKS.
     */


    /**
     * Constructor: returns new sbhl-truth-value-link with value at TRUTH set to '(NODE)
     */
    @LispMethod(comment = "Constructor: returns new sbhl-truth-value-link with value at TRUTH set to \'(NODE)")
    public static final SubLObject create_sbhl_tv_links_alt(SubLObject truth, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject tv_links = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                com.cyc.cycjava.cycl.sbhl.sbhl_links.push_onto_sbhl_tv_links(tv_links, truth, node);
                return tv_links;
            }
        }
    }

    @LispMethod(comment = "Constructor: returns new sbhl-truth-value-link with value at TRUTH set to \'(NODE)")
    public static SubLObject create_sbhl_tv_links(final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    }


        }
        final SubLObject tv_links = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        sbhl_links.push_onto_sbhl_tv_links(tv_links, truth, node);
        return tv_links;
    }/**
     * Constructor: returns new sbhl-truth-value-link with value at TRUTH set to '(NODE)
     */


    /**
     * Accessor: @return booleanp; whether OBJECT is a @see dictionary-p
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a @see dictionary-p")
    public static final SubLObject sbhl_tv_links_object_p_alt(SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a @see dictionary-p")
    public static SubLObject sbhl_tv_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }/**
     * Accessor: @return booleanp; whether OBJECT is a @see dictionary-p
     */


    /**
     * Accessor: @return booleanp; whether tv-links is a dictionary, with keys only those of the *sbhl-truths*, and values only lists of forts. @hack fort-p should be replaced by check for suid term.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether tv-links is a dictionary, with keys only those of the *sbhl-truths*, and values only lists of forts. @hack fort-p should be replaced by check for suid term.")
    public static final SubLObject sbhl_wf_tv_links_p_alt(SubLObject tv_links) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject invalidP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                while (!((NIL != invalidP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject tv_link = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                            if (NIL == invalidP) {
                                {
                                    SubLObject csome_list_var = tv_link;
                                    SubLObject linked_node = NIL;
                                    for (linked_node = csome_list_var.first(); !((NIL != invalidP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , linked_node = csome_list_var.first()) {
                                        if (NIL == sbhl_link_vars.sbhl_node_object_p(linked_node)) {
                                            invalidP = T;
                                        }
                                    }
                                }
                            }
                        } else {
                            invalidP = T;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(NIL == invalidP);
            }
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether tv-links is a dictionary, with keys only those of the *sbhl-truths*, and values only lists of forts. @hack fort-p should be replaced by check for suid term.")
    public static SubLObject sbhl_wf_tv_links_p(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == invalidP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                final SubLObject sol = tv_link;
                if (NIL != set.set_p(sol)) {
                    final SubLObject set_contents_var = set.do_set_internal(sol);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject linked_node;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == invalidP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        linked_node = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, linked_node)) && (NIL == sbhl_link_vars.sbhl_node_object_p(linked_node))) {
                            invalidP = T;
                        }
                    }
                } else
                    if (sol.isList()) {
                        if (NIL == invalidP) {
                            SubLObject csome_list_var = sol;
                            SubLObject linked_node2 = NIL;
                            linked_node2 = csome_list_var.first();
                            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                                if (NIL == sbhl_link_vars.sbhl_node_object_p(linked_node2)) {
                                    invalidP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                linked_node2 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error(sbhl_links.$str50$_A_is_neither_SET_P_nor_LISTP_, sol);
                    }

            } else {
                invalidP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == invalidP);
    }/**
     * Accessor: @return booleanp; whether tv-links is a dictionary, with keys only those of the *sbhl-truths*, and values only lists of forts. @hack fort-p should be replaced by check for suid term.
     */


    /**
     * Accessor: @return sbhl-tv-links-p; the tv-links structure after retreiving direction links specified by NODE within *sbhl-module* and accessing the DIRECTION field to get the mt-links. The tv-links are then returned by accessing the value at MT in the tv-links.
     */
    @LispMethod(comment = "Accessor: @return sbhl-tv-links-p; the tv-links structure after retreiving direction links specified by NODE within *sbhl-module* and accessing the DIRECTION field to get the mt-links. The tv-links are then returned by accessing the value at MT in the tv-links.")
    public static final SubLObject get_sbhl_graph_tv_links_alt(SubLObject node, SubLObject direction, SubLObject mt, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_tv_links(com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module), mt);
    }

    @LispMethod(comment = "Accessor: @return sbhl-tv-links-p; the tv-links structure after retreiving direction links specified by NODE within *sbhl-module* and accessing the DIRECTION field to get the mt-links. The tv-links are then returned by accessing the value at MT in the tv-links.")
    public static SubLObject get_sbhl_graph_tv_links(final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_links.get_sbhl_tv_links(sbhl_links.get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module), mt);
    }/**
     * Accessor: @return sbhl-tv-links-p; the tv-links structure after retreiving direction links specified by NODE within *sbhl-module* and accessing the DIRECTION field to get the mt-links. The tv-links are then returned by accessing the value at MT in the tv-links.
     */


    /**
     * Accessor: @return listp; within the value at TRUTH in TV-LINKS
     */
    @LispMethod(comment = "Accessor: @return listp; within the value at TRUTH in TV-LINKS")
    public static final SubLObject get_sbhl_link_nodes_alt(SubLObject tv_links, SubLObject truth) {
        return dictionary.dictionary_lookup(tv_links, truth, UNPROVIDED);
    }

    @LispMethod(comment = "Accessor: @return listp; within the value at TRUTH in TV-LINKS")
    public static SubLObject get_sbhl_link_nodes(final SubLObject tv_links, final SubLObject truth) {
        return dictionary.dictionary_lookup(tv_links, truth, UNPROVIDED);
    }/**
     * Accessor: @return listp; within the value at TRUTH in TV-LINKS
     */


    /**
     * Accessor: @return booleanp; whether NODE is a member of TV-LINKS corresponding to TRUTH. @see get-sbhl-link-nodes. @see member?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is a member of TV-LINKS corresponding to TRUTH. @see get-sbhl-link-nodes. @see member?")
    public static final SubLObject member_of_tv_linksP_alt(SubLObject node, SubLObject truth, SubLObject tv_links) {
        if (NIL != dictionary.dictionary_p(tv_links)) {
            return subl_promotions.memberP(node, com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_link_nodes(tv_links, truth), UNPROVIDED, UNPROVIDED);
        } else {
            return NIL;
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is a member of TV-LINKS corresponding to TRUTH. @see get-sbhl-link-nodes. @see member?")
    public static SubLObject member_of_tv_linksP(final SubLObject node, final SubLObject truth, final SubLObject tv_links) {
        if (NIL != dictionary.dictionary_p(tv_links)) {
            return set.set_or_list_memberP(node, sbhl_links.get_sbhl_link_nodes(tv_links, truth));
        }
        return NIL;
    }/**
     * Accessor: @return booleanp; whether NODE is a member of TV-LINKS corresponding to TRUTH. @see get-sbhl-link-nodes. @see member?
     */


    /**
     * Accessor: @return booleanp; whether TV-LINKS contain any true link nodes.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether TV-LINKS contain any true link nodes.")
    public static final SubLObject any_sbhl_true_link_nodes_p_alt(SubLObject tv_links) {
        {
            SubLObject foundP = NIL;
            SubLObject cdolist_list_var = sbhl_link_vars.$sbhl_true_link_truth_values$.getGlobalValue();
            SubLObject truth = NIL;
            for (truth = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , truth = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_links.get_sbhl_link_nodes(tv_links, truth)) {
                    foundP = T;
                }
            }
            return foundP;
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether TV-LINKS contain any true link nodes.")
    public static SubLObject any_sbhl_true_link_nodes_p(final SubLObject tv_links) {
        SubLObject foundP = NIL;
        final SubLObject sol = sbhl_link_vars.$sbhl_true_link_truth_values$.getGlobalValue();
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject truth;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                truth = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, truth)) && (NIL != sbhl_links.get_sbhl_link_nodes(tv_links, truth))) {
                    foundP = T;
                }
            }
        } else
            if (sol.isList()) {
                SubLObject csome_list_var = sol;
                SubLObject truth2 = NIL;
                truth2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != sbhl_links.get_sbhl_link_nodes(tv_links, truth2)) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    truth2 = csome_list_var.first();
                } 
            } else {
                Errors.error(sbhl_links.$str50$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        return foundP;
    }/**
     * Accessor: @return booleanp; whether TV-LINKS contain any true link nodes.
     */


    /**
     * Modifier: sets value at TRUTH in TV-LINK to be VALUE
     */
    @LispMethod(comment = "Modifier: sets value at TRUTH in TV-LINK to be VALUE")
    public static final SubLObject set_sbhl_tv_links_alt(SubLObject tv_links, SubLObject truth, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_nodes_object_p(value)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary.dictionary_enter(tv_links, truth, value);
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: sets value at TRUTH in TV-LINK to be VALUE")
    public static SubLObject set_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if (value.isList()) {
            final SubLObject node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = value;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(item, node_set);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            value = node_set;
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_nodes_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_LINK_NODES_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, value, sbhl_links.SBHL_LINK_NODES_OBJECT_P);
                    }


        }
        dictionary.dictionary_enter(tv_links, truth, value);
        return NIL;
    }/**
     * Modifier: sets value at TRUTH in TV-LINK to be VALUE
     */


    /**
     * Modifier: pushes NODE onto head of value at TRUTH in TV-LINKS. @return sbhl-tv-links-p
     */
    @LispMethod(comment = "Modifier: pushes NODE onto head of value at TRUTH in TV-LINKS. @return sbhl-tv-links-p")
    public static final SubLObject push_onto_sbhl_tv_links_alt(SubLObject tv_links, SubLObject truth, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary_utilities.dictionary_push(tv_links, truth, node);
            return tv_links;
        }
    }

    @LispMethod(comment = "Modifier: pushes NODE onto head of value at TRUTH in TV-LINKS. @return sbhl-tv-links-p")
    public static SubLObject push_onto_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    }


        }
        SubLObject node_set = sbhl_links.get_sbhl_link_nodes(tv_links, truth);
        if (NIL == node_set) {
            node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        if (node_set.isList()) {
            sbhl_links.tv_links_to_set_from_list(tv_links);
            node_set = sbhl_links.get_sbhl_link_nodes(tv_links, truth);
        }
        set.set_add(node, node_set);
        return tv_links;
    }/**
     * Modifier: pushes NODE onto head of value at TRUTH in TV-LINKS. @return sbhl-tv-links-p
     */


    public static SubLObject tv_links_to_set_from_list(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dictionary_contents = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (tv_link.isList()) {
                final SubLObject node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = tv_link;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set.set_add(item, node_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                new_dictionary_contents = cons(cons(truth, node_set), new_dictionary_contents);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(tv_links);
        SubLObject cdolist_list_var2 = new_dictionary_contents;
        SubLObject entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            dictionary.dictionary_enter(tv_links, entry.first(), entry.rest());
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        return tv_links;
    }

    /**
     * Modifier: removes NODE from the links corresponding to TRUTH within TV-LINKS. @return sbhl-tv-links-p
     */
    @LispMethod(comment = "Modifier: removes NODE from the links corresponding to TRUTH within TV-LINKS. @return sbhl-tv-links-p")
    public static final SubLObject remove_sbhl_tv_link_node_alt(SubLObject tv_links, SubLObject truth, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary_utilities.dictionary_delete_first_from_value(tv_links, truth, node, UNPROVIDED);
            return tv_links;
        }
    }

    /**
     * Modifier: removes NODE from the links corresponding to TRUTH within TV-LINKS. @return sbhl-tv-links-p
     */
    @LispMethod(comment = "Modifier: removes NODE from the links corresponding to TRUTH within TV-LINKS. @return sbhl-tv-links-p")
    public static SubLObject remove_sbhl_tv_link_node(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, node, sbhl_links.SBHL_NODE_OBJECT_P);
                    }


        }
        SubLObject node_set = sbhl_links.get_sbhl_link_nodes(tv_links, truth);
        if (node_set.isList()) {
            if (NIL == node_set) {
                return tv_links;
            }
            final SubLObject anode_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            set_utilities.set_add_all(node_set, anode_set);
            node_set = anode_set;
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        set.set_remove(node, node_set);
        return tv_links;
    }

    /**
     * Modifier: removes data corresponding to TRUTH within TV-LINKS.
     */
    @LispMethod(comment = "Modifier: removes data corresponding to TRUTH within TV-LINKS.")
    public static final SubLObject remove_sbhl_tv_link_alt(SubLObject tv_links, SubLObject truth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_links.sbhl_tv_links_object_p(tv_links)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                } else {
                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary.dictionary_remove(tv_links, truth);
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: removes data corresponding to TRUTH within TV-LINKS.")
    public static SubLObject remove_sbhl_tv_link(final SubLObject tv_links, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, tv_links, sbhl_links.SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn(sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_links.$$$continue_anyway, sbhl_links.$str38$_A_is_not_a__A, truth, sbhl_links.SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        dictionary.dictionary_remove(tv_links, truth);
        return NIL;
    }/**
     * Modifier: removes data corresponding to TRUTH within TV-LINKS.
     */


    public static SubLObject declare_sbhl_links_file() {
        declareFunction("sbhl_directed_link_print_function_trampoline", "SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_directed_link_p", "SBHL-DIRECTED-LINK-P", 1, 0, false);
        new sbhl_links.$sbhl_directed_link_p$UnaryFunction();
        declareFunction("sbhl_directed_link_predicate_links", "SBHL-DIRECTED-LINK-PREDICATE-LINKS", 1, 0, false);
        declareFunction("sbhl_directed_link_inverse_links", "SBHL-DIRECTED-LINK-INVERSE-LINKS", 1, 0, false);
        declareFunction("_csetf_sbhl_directed_link_predicate_links", "_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS", 2, 0, false);
        declareFunction("_csetf_sbhl_directed_link_inverse_links", "_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS", 2, 0, false);
        declareFunction("make_sbhl_directed_link", "MAKE-SBHL-DIRECTED-LINK", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_directed_link", "VISIT-DEFSTRUCT-SBHL-DIRECTED-LINK", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_directed_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction("sbhl_undirected_link_print_function_trampoline", "SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_undirected_link_p", "SBHL-UNDIRECTED-LINK-P", 1, 0, false);
        new sbhl_links.$sbhl_undirected_link_p$UnaryFunction();
        declareFunction("sbhl_undirected_link_links", "SBHL-UNDIRECTED-LINK-LINKS", 1, 0, false);
        declareFunction("_csetf_sbhl_undirected_link_links", "_CSETF-SBHL-UNDIRECTED-LINK-LINKS", 2, 0, false);
        declareFunction("make_sbhl_undirected_link", "MAKE-SBHL-UNDIRECTED-LINK", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_undirected_link", "VISIT-DEFSTRUCT-SBHL-UNDIRECTED-LINK", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_undirected_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction("print_link", "PRINT-LINK", 3, 0, false);
        declareFunction("create_sbhl_directed_link", "CREATE-SBHL-DIRECTED-LINK", 2, 0, false);
        declareFunction("create_sbhl_undirected_link", "CREATE-SBHL-UNDIRECTED-LINK", 1, 0, false);
        declareFunction("create_sbhl_direction_link", "CREATE-SBHL-DIRECTION-LINK", 3, 0, false);
        declareFunction("sbhl_direction_link_p", "SBHL-DIRECTION-LINK-P", 1, 0, false);
        declareFunction("any_sbhl_links_p", "ANY-SBHL-LINKS-P", 2, 0, false);
        declareFunction("any_sbhl_predicate_links_p", "ANY-SBHL-PREDICATE-LINKS-P", 2, 0, false);
        declareFunction("get_sbhl_directed_mt_links", "GET-SBHL-DIRECTED-MT-LINKS", 2, 0, false);
        declareFunction("get_sbhl_undirected_mt_links", "GET-SBHL-UNDIRECTED-MT-LINKS", 1, 0, false);
        declareFunction("get_sbhl_mt_links", "GET-SBHL-MT-LINKS", 3, 0, false);
        declareFunction("set_sbhl_directed_link", "SET-SBHL-DIRECTED-LINK", 3, 0, false);
        declareFunction("set_sbhl_undirected_link", "SET-SBHL-UNDIRECTED-LINK", 2, 0, false);
        declareFunction("set_sbhl_direction_link", "SET-SBHL-DIRECTION-LINK", 4, 0, false);
        declareFunction("remove_sbhl_direction_link", "REMOVE-SBHL-DIRECTION-LINK", 3, 0, false);
        declareFunction("create_sbhl_mt_links", "CREATE-SBHL-MT-LINKS", 2, 0, false);
        declareFunction("sbhl_mt_links_object_p", "SBHL-MT-LINKS-OBJECT-P", 1, 0, false);
        declareFunction("sbhl_wf_mt_links_p", "SBHL-WF-MT-LINKS-P", 1, 0, false);
        declareFunction("get_sbhl_graph_mt_links", "GET-SBHL-GRAPH-MT-LINKS", 3, 0, false);
        declareFunction("get_sbhl_graph_link_mts", "GET-SBHL-GRAPH-LINK-MTS", 3, 0, false);
        declareFunction("get_sbhl_tv_links", "GET-SBHL-TV-LINKS", 2, 0, false);
        declareFunction("set_sbhl_mt_links", "SET-SBHL-MT-LINKS", 3, 0, false);
        declareFunction("remove_sbhl_mt_link_from_graph", "REMOVE-SBHL-MT-LINK-FROM-GRAPH", 4, 0, false);
        declareFunction("remove_sbhl_mt_link_from_relevant_directions", "REMOVE-SBHL-MT-LINK-FROM-RELEVANT-DIRECTIONS", 3, 0, false);
        declareFunction("remove_sbhl_mt_link", "REMOVE-SBHL-MT-LINK", 2, 0, false);
        declareFunction("create_sbhl_tv_links", "CREATE-SBHL-TV-LINKS", 2, 0, false);
        declareFunction("sbhl_tv_links_object_p", "SBHL-TV-LINKS-OBJECT-P", 1, 0, false);
        declareFunction("sbhl_wf_tv_links_p", "SBHL-WF-TV-LINKS-P", 1, 0, false);
        declareFunction("get_sbhl_graph_tv_links", "GET-SBHL-GRAPH-TV-LINKS", 4, 0, false);
        declareFunction("get_sbhl_link_nodes", "GET-SBHL-LINK-NODES", 2, 0, false);
        declareFunction("member_of_tv_linksP", "MEMBER-OF-TV-LINKS?", 3, 0, false);
        declareFunction("any_sbhl_true_link_nodes_p", "ANY-SBHL-TRUE-LINK-NODES-P", 1, 0, false);
        declareFunction("set_sbhl_tv_links", "SET-SBHL-TV-LINKS", 3, 0, false);
        declareFunction("push_onto_sbhl_tv_links", "PUSH-ONTO-SBHL-TV-LINKS", 3, 0, false);
        declareFunction("tv_links_to_set_from_list", "TV-LINKS-TO-SET-FROM-LIST", 1, 0, false);
        declareFunction("remove_sbhl_tv_link_node", "REMOVE-SBHL-TV-LINK-NODE", 3, 0, false);
        declareFunction("remove_sbhl_tv_link", "REMOVE-SBHL-TV-LINK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_links_file() {
        defconstant("*DTP-SBHL-DIRECTED-LINK*", sbhl_links.SBHL_DIRECTED_LINK);
        defconstant("*DTP-SBHL-UNDIRECTED-LINK*", sbhl_links.SBHL_UNDIRECTED_LINK);
        return NIL;
    }

    public static SubLObject setup_sbhl_links_file() {
        register_method($print_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), symbol_function(sbhl_links.SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_links.$list9);
        def_csetf(sbhl_links.SBHL_DIRECTED_LINK_PREDICATE_LINKS, sbhl_links._CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS);
        def_csetf(sbhl_links.SBHL_DIRECTED_LINK_INVERSE_LINKS, sbhl_links._CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS);
        identity(sbhl_links.SBHL_DIRECTED_LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), symbol_function(sbhl_links.VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), symbol_function(sbhl_links.SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_links.$list30);
        def_csetf(sbhl_links.SBHL_UNDIRECTED_LINK_LINKS, sbhl_links._CSETF_SBHL_UNDIRECTED_LINK_LINKS);
        identity(sbhl_links.SBHL_UNDIRECTED_LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), symbol_function(sbhl_links.VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        sbhl_links.declare_sbhl_links_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_links.init_sbhl_links_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_links.setup_sbhl_links_file();
    }

    static {
    }

    public static final class $sbhl_directed_link_native extends SubLStructNative {
        public SubLObject $predicate_links;

        public SubLObject $inverse_links;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_directed_link_native() {
            sbhl_links.$sbhl_directed_link_native.this.$predicate_links = Lisp.NIL;
            sbhl_links.$sbhl_directed_link_native.this.$inverse_links = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sbhl_links.$sbhl_directed_link_native.this.$predicate_links;
        }

        @Override
        public SubLObject getField3() {
            return sbhl_links.$sbhl_directed_link_native.this.$inverse_links;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sbhl_links.$sbhl_directed_link_native.this.$predicate_links = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sbhl_links.$sbhl_directed_link_native.this.$inverse_links = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_links.$sbhl_directed_link_native.class, sbhl_links.SBHL_DIRECTED_LINK, sbhl_links.SBHL_DIRECTED_LINK_P, sbhl_links.$list3, sbhl_links.$list4, new String[]{ "$predicate_links", "$inverse_links" }, sbhl_links.$list5, sbhl_links.$list6, sbhl_links.PRINT_LINK);
        }
    }

    public static final class $sbhl_directed_link_p$UnaryFunction extends UnaryFunction {
        public $sbhl_directed_link_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-DIRECTED-LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_links.sbhl_directed_link_p(arg1);
        }
    }

    public static final class $sbhl_undirected_link_p$UnaryFunction extends UnaryFunction {
        public $sbhl_undirected_link_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-UNDIRECTED-LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_links.sbhl_undirected_link_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("PREDICATE-LINKS"), makeSymbol("INVERSE-LINKS"));

    static private final SubLList $list_alt4 = list(makeKeyword("PREDICATE-LINKS"), makeKeyword("INVERSE-LINKS"));

    static private final SubLList $list_alt5 = list(makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt19 = list(makeSymbol("LINKS"));

    static private final SubLList $list_alt20 = list(makeKeyword("LINKS"));

    static private final SubLList $list_alt21 = list(makeSymbol("SBHL-UNDIRECTED-LINK-LINKS"));

    static private final SubLList $list_alt22 = list(makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS"));

    static private final SubLString $str_alt27$__ = makeString("#<");

    static private final SubLString $str_alt32$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
}

/**
 * Total time: 288 ms
 */

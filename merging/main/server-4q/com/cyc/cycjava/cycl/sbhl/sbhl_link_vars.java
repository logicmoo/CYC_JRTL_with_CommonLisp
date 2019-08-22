/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-LINK-VARS
 * source file: /cyc/top/cycl/sbhl/sbhl-link-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class sbhl_link_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_link_vars();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_vars";


    // deflexical
    // Definitions
    // valid sbhl link directions
    /**
     * valid sbhl link directions
     */
    @LispMethod(comment = "valid sbhl link directions\ndeflexical")
    private static final SubLSymbol $sbhl_directions$ = makeSymbol("*SBHL-DIRECTIONS*");

    // deflexical
    // valid sbhl link directions for sbhl directed links
    /**
     * valid sbhl link directions for sbhl directed links
     */
    @LispMethod(comment = "valid sbhl link directions for sbhl directed links\ndeflexical")
    private static final SubLSymbol $sbhl_directed_directions$ = makeSymbol("*SBHL-DIRECTED-DIRECTIONS*");

    // deflexical
    // valid sbhl link direction for forward direction of sbhl-directed-links.
    /**
     * valid sbhl link direction for forward direction of sbhl-directed-links.
     */
    @LispMethod(comment = "valid sbhl link direction for forward direction of sbhl-directed-links.\ndeflexical")
    private static final SubLSymbol $sbhl_forward_directed_direction$ = makeSymbol("*SBHL-FORWARD-DIRECTED-DIRECTION*");

    // deflexical
    /**
     * valid sbhl link direction for forward direction of sbhl-directed-links as a
     * list.
     */
    @LispMethod(comment = "valid sbhl link direction for forward direction of sbhl-directed-links as a\r\nlist.\ndeflexical\nvalid sbhl link direction for forward direction of sbhl-directed-links as a\nlist.")
    private static final SubLSymbol $sbhl_forward_directed_direction_as_list$ = makeSymbol("*SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST*");

    // deflexical
    // valid sbhl link direction for backward direction of sbhl-directed-links.
    /**
     * valid sbhl link direction for backward direction of sbhl-directed-links.
     */
    @LispMethod(comment = "valid sbhl link direction for backward direction of sbhl-directed-links.\ndeflexical")
    private static final SubLSymbol $sbhl_backward_directed_direction$ = makeSymbol("*SBHL-BACKWARD-DIRECTED-DIRECTION*");

    // deflexical
    /**
     * valid sbhl link direction for backward direction of sbhl-directed-links as a
     * list.
     */
    @LispMethod(comment = "valid sbhl link direction for backward direction of sbhl-directed-links as a\r\nlist.\ndeflexical\nvalid sbhl link direction for backward direction of sbhl-directed-links as a\nlist.")
    private static final SubLSymbol $sbhl_backward_directed_direction_as_list$ = makeSymbol("*SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST*");

    // deflexical
    // valid sbhl link direction for undirected links
    /**
     * valid sbhl link direction for undirected links
     */
    @LispMethod(comment = "valid sbhl link direction for undirected links\ndeflexical")
    private static final SubLSymbol $sbhl_undirected_direction$ = makeSymbol("*SBHL-UNDIRECTED-DIRECTION*");

    // deflexical
    // valid sbhl link direction for undirected links in list form
    /**
     * valid sbhl link direction for undirected links in list form
     */
    @LispMethod(comment = "valid sbhl link direction for undirected links in list form\ndeflexical")
    private static final SubLSymbol $sbhl_undirected_direction_as_list$ = makeSymbol("*SBHL-UNDIRECTED-DIRECTION-AS-LIST*");

    // deflexical
    // valid sbhl link truth values
    /**
     * valid sbhl link truth values
     */
    @LispMethod(comment = "valid sbhl link truth values\ndeflexical")
    private static final SubLSymbol $sbhl_link_truth_values$ = makeSymbol("*SBHL-LINK-TRUTH-VALUES*");

    // defparameter
    // Determines whether to iterate over sbhl links in random order
    /**
     * Determines whether to iterate over sbhl links in random order
     */
    @LispMethod(comment = "Determines whether to iterate over sbhl links in random order\ndefparameter")
    public static final SubLSymbol $sbhl_randomize_lists_p$ = makeSymbol("*SBHL-RANDOMIZE-LISTS-P*");

    // defparameter
    // Parameter for link mt, rebound during link iteration.
    /**
     * Parameter for link mt, rebound during link iteration.
     */
    @LispMethod(comment = "Parameter for link mt, rebound during link iteration.\ndefparameter")
    public static final SubLSymbol $sbhl_link_mt$ = makeSymbol("*SBHL-LINK-MT*");

    // defparameter
    // Parameter for link tv, rebound during link iteration.
    /**
     * Parameter for link tv, rebound during link iteration.
     */
    @LispMethod(comment = "Parameter for link tv, rebound during link iteration.\ndefparameter")
    public static final SubLSymbol $sbhl_link_tv$ = makeSymbol("*SBHL-LINK-TV*");

    // defparameter
    /**
     * Parameter for the saving the information for which function which was used to
     * create the current link-node.
     */
    @LispMethod(comment = "Parameter for the saving the information for which function which was used to\r\ncreate the current link-node.\ndefparameter\nParameter for the saving the information for which function which was used to\ncreate the current link-node.")
    public static final SubLSymbol $sbhl_link_generator$ = makeSymbol("*SBHL-LINK-GENERATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $sbhl_rw_lock$ = makeSymbol("*SBHL-RW-LOCK*");

    // defparameter
    // obsolete
    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete\ndefparameter")
    public static final SubLSymbol $added_assertion$ = makeSymbol("*ADDED-ASSERTION*");

    // defparameter
    // obsolete
    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete\ndefparameter")
    public static final SubLSymbol $added_source$ = makeSymbol("*ADDED-SOURCE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"), $LINK);

    static private final SubLList $list1 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));

    static private final SubLList $list3 = list(makeKeyword("PREDICATE"));

    static private final SubLList $list5 = list(makeKeyword("INVERSE"));

    static private final SubLList $list7 = list($LINK);

    static private final SubLString $str9$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_DIRECTION_P = makeSymbol("SBHL-DIRECTION-P");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str14$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list15 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_link_direction$ = makeSymbol("*SBHL-LINK-DIRECTION*");

    static private final SubLList $list18 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-OPPOSITE-LINK-DIRECTION"))));

    private static final SubLSymbol WITH_SBHL_LINK_DIRECTION = makeSymbol("WITH-SBHL-LINK-DIRECTION");

    static private final SubLList $list20 = list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));

    static private final SubLList $list21 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_SBHL_MODULE_FORWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");

    static private final SubLList $list23 = list(makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));

    static private final SubLList $list24 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"), reader_make_constant_shell("MonotonicallyFalse"), reader_make_constant_shell("DefaultFalse"));

    static private final SubLList $list25 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"));

    static private final SubLList $list26 = list(list(makeSymbol("TRUTH-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_SET_OR_LIST = makeSymbol("DO-SET-OR-LIST");

    public static final SubLSymbol $sbhl_true_link_truth_values$ = makeSymbol("*SBHL-TRUE-LINK-TRUTH-VALUES*");









    private static final SubLString $str39$could_not_compute_an_SBHL_tv_from = makeString("could not compute an SBHL tv from ~s and ~s");

    static private final SubLList $list40 = list(list(makeSymbol("*SBHL-RANDOMIZE-LISTS-P*"), T));

    private static final SubLList $list41 = list(list(makeSymbol("ELT-VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym42$NEW_LIST = makeUninternedSymbol("NEW-LIST");

    private static final SubLList $list44 = list(makeSymbol("SBHL-RANDOMIZE-LISTS-P"));

    private static final SubLSymbol RANDOMIZE_LIST = makeSymbol("RANDOMIZE-LIST");

    private static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    private static final SubLString $$$SBHL = makeString("SBHL");

    private static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

    private static final SubLList $list49 = list(makeSymbol("*SBHL-RW-LOCK*"));

    private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    /**
     *
     *
     * @return booleanp; is DIRECTION a member of *sbhl-directions*?
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION a member of *sbhl-directions*?")
    public static final SubLObject sbhl_direction_p_alt(SubLObject direction) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_directed_direction_p(direction)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_undirected_direction_p(direction)));
    }

    /**
     *
     *
     * @return booleanp; is DIRECTION a member of *sbhl-directions*?
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION a member of *sbhl-directions*?")
    public static SubLObject sbhl_direction_p(final SubLObject direction) {
        return makeBoolean((NIL != sbhl_directed_direction_p(direction)) || (NIL != sbhl_undirected_direction_p(direction)));
    }

    /**
     *
     *
     * @return booleanp; is DIRECTION a member of *sbhl-directed-directions*?
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION a member of *sbhl-directed-directions*?")
    public static final SubLObject sbhl_directed_direction_p_alt(SubLObject direction) {
        return makeBoolean((direction == $sbhl_forward_directed_direction$.getGlobalValue()) || (direction == $sbhl_backward_directed_direction$.getGlobalValue()));
    }

    /**
     *
     *
     * @return booleanp; is DIRECTION a member of *sbhl-directed-directions*?
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION a member of *sbhl-directed-directions*?")
    public static SubLObject sbhl_directed_direction_p(final SubLObject direction) {
        return makeBoolean(direction.eql($sbhl_forward_directed_direction$.getGlobalValue()) || direction.eql($sbhl_backward_directed_direction$.getGlobalValue()));
    }

    /**
     *
     *
     * @return booleanp; is DIRECTION the direction used for sbhl undirected links
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION the direction used for sbhl undirected links")
    public static final SubLObject sbhl_undirected_direction_p_alt(SubLObject direction) {
        return eq(direction, $sbhl_undirected_direction$.getGlobalValue());
    }

    /**
     *
     *
     * @return booleanp; is DIRECTION the direction used for sbhl undirected links
     */
    @LispMethod(comment = "@return booleanp; is DIRECTION the direction used for sbhl undirected links")
    public static SubLObject sbhl_undirected_direction_p(final SubLObject direction) {
        return eq(direction, $sbhl_undirected_direction$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp; *sbhl-directed-directions*
     */
    @LispMethod(comment = "@return listp; *sbhl-directed-directions*")
    public static final SubLObject get_sbhl_directed_directions_alt() {
        return $sbhl_directed_directions$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; *sbhl-directed-directions*
     */
    @LispMethod(comment = "@return listp; *sbhl-directed-directions*")
    public static SubLObject get_sbhl_directed_directions() {
        return $sbhl_directed_directions$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; the keyword for the forward direction of @see *sbhl-directed-directions*.
     */
    @LispMethod(comment = "@return keywordp; the keyword for the forward direction of @see *sbhl-directed-directions*.")
    public static final SubLObject get_sbhl_forward_directed_direction_alt() {
        return $sbhl_forward_directed_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; the keyword for the forward direction of @see *sbhl-directed-directions*.
     */
    @LispMethod(comment = "@return keywordp; the keyword for the forward direction of @see *sbhl-directed-directions*.")
    public static SubLObject get_sbhl_forward_directed_direction() {
        return $sbhl_forward_directed_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return booleanp; whether DIRECTION is the @see get-sbhl-forward-directed-direction.
     */
    @LispMethod(comment = "@return booleanp; whether DIRECTION is the @see get-sbhl-forward-directed-direction.")
    public static final SubLObject sbhl_forward_directed_direction_p_alt(SubLObject direction) {
        return eq(direction, com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_forward_directed_direction());
    }

    /**
     *
     *
     * @return booleanp; whether DIRECTION is the @see get-sbhl-forward-directed-direction.
     */
    @LispMethod(comment = "@return booleanp; whether DIRECTION is the @see get-sbhl-forward-directed-direction.")
    public static SubLObject sbhl_forward_directed_direction_p(final SubLObject direction) {
        return eq(direction, get_sbhl_forward_directed_direction());
    }

    /**
     *
     *
     * @return listp; @see *sbhl-forward-directed-direction-as-list*.
     */
    @LispMethod(comment = "@return listp; @see *sbhl-forward-directed-direction-as-list*.")
    public static final SubLObject get_sbhl_forward_directed_direction_as_list_alt() {
        return $sbhl_forward_directed_direction_as_list$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; @see *sbhl-forward-directed-direction-as-list*.
     */
    @LispMethod(comment = "@return listp; @see *sbhl-forward-directed-direction-as-list*.")
    public static SubLObject get_sbhl_forward_directed_direction_as_list() {
        return $sbhl_forward_directed_direction_as_list$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; the keyword for the backward direction of @see *sbhl-directed-directions*.
     */
    @LispMethod(comment = "@return keywordp; the keyword for the backward direction of @see *sbhl-directed-directions*.")
    public static final SubLObject get_sbhl_backward_directed_direction_alt() {
        return $sbhl_backward_directed_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; the keyword for the backward direction of @see *sbhl-directed-directions*.
     */
    @LispMethod(comment = "@return keywordp; the keyword for the backward direction of @see *sbhl-directed-directions*.")
    public static SubLObject get_sbhl_backward_directed_direction() {
        return $sbhl_backward_directed_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return booleanp; whether DIRECTION is the @see get-sbhl-backward-directed-direction.
     */
    @LispMethod(comment = "@return booleanp; whether DIRECTION is the @see get-sbhl-backward-directed-direction.")
    public static final SubLObject sbhl_backward_directed_direction_p_alt(SubLObject direction) {
        return eq(direction, com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_backward_directed_direction());
    }

    /**
     *
     *
     * @return booleanp; whether DIRECTION is the @see get-sbhl-backward-directed-direction.
     */
    @LispMethod(comment = "@return booleanp; whether DIRECTION is the @see get-sbhl-backward-directed-direction.")
    public static SubLObject sbhl_backward_directed_direction_p(final SubLObject direction) {
        return eq(direction, get_sbhl_backward_directed_direction());
    }

    /**
     *
     *
     * @return listp; @see *sbhl-backward-directed-direction-as-list*.
     */
    @LispMethod(comment = "@return listp; @see *sbhl-backward-directed-direction-as-list*.")
    public static final SubLObject get_sbhl_backward_directed_direction_as_list_alt() {
        return $sbhl_backward_directed_direction_as_list$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; @see *sbhl-backward-directed-direction-as-list*.
     */
    @LispMethod(comment = "@return listp; @see *sbhl-backward-directed-direction-as-list*.")
    public static SubLObject get_sbhl_backward_directed_direction_as_list() {
        return $sbhl_backward_directed_direction_as_list$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; @see *sbhl-undirected-direction*
     */
    @LispMethod(comment = "@return keywordp; @see *sbhl-undirected-direction*")
    public static final SubLObject get_sbhl_undirected_direction_alt() {
        return $sbhl_undirected_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return keywordp; @see *sbhl-undirected-direction*
     */
    @LispMethod(comment = "@return keywordp; @see *sbhl-undirected-direction*")
    public static SubLObject get_sbhl_undirected_direction() {
        return $sbhl_undirected_direction$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; *sbhl-undirected-direction-as-list*
     */
    @LispMethod(comment = "@return listp; *sbhl-undirected-direction-as-list*")
    public static final SubLObject get_sbhl_undirected_direction_as_list_alt() {
        return $sbhl_undirected_direction_as_list$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; *sbhl-undirected-direction-as-list*
     */
    @LispMethod(comment = "@return listp; *sbhl-undirected-direction-as-list*")
    public static SubLObject get_sbhl_undirected_direction_as_list() {
        return $sbhl_undirected_direction_as_list$.getGlobalValue();
    }

    /**
     * Accessor. @return sbhl-link-direction-p. @see *sbhl-link-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-link-direction-p. @see *sbhl-link-direction*")
    public static final SubLObject get_sbhl_link_direction_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_link_direction$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return sbhl-link-direction-p. @see *sbhl-link-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-link-direction-p. @see *sbhl-link-direction*")
    public static SubLObject get_sbhl_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_link_direction$.getDynamicValue(thread);
    }

    /**
     * Accessor. @return sbhl-link-direction-p; the opposite direction for directed links. Undirected links still return undirected direction.
     */
    @LispMethod(comment = "Accessor. @return sbhl-link-direction-p; the opposite direction for directed links. Undirected links still return undirected direction.")
    public static final SubLObject get_sbhl_opposite_link_direction_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_forward_directed_direction()) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_backward_directed_direction();
            } else {
                if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_backward_directed_direction()) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_forward_directed_direction();
                } else {
                    if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_undirected_direction()) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_undirected_direction();
                    } else {
                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_direction_p($sbhl_link_direction$.getDynamicValue(thread))) {
                                {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                                            } else {
                                                Errors.warn($str_alt14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                                            }
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

    /**
     * Accessor. @return sbhl-link-direction-p; the opposite direction for directed links. Undirected links still return undirected direction.
     */
    @LispMethod(comment = "Accessor. @return sbhl-link-direction-p; the opposite direction for directed links. Undirected links still return undirected direction.")
    public static SubLObject get_sbhl_opposite_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (get_sbhl_link_direction().eql(get_sbhl_forward_directed_direction())) {
            return get_sbhl_backward_directed_direction();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_backward_directed_direction())) {
            return get_sbhl_forward_directed_direction();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_undirected_direction())) {
            return get_sbhl_undirected_direction();
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_direction_p($sbhl_link_direction$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                    } else {
                        Errors.warn($str14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                    }


        }
        return NIL;
    }

    /**
     * Accessor. @return listp; the list containing only current value of @see *sbhl-link-direction*
     */
    @LispMethod(comment = "Accessor. @return listp; the list containing only current value of @see *sbhl-link-direction*")
    public static final SubLObject get_sbhl_link_direction_as_list_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_forward_directed_direction()) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_forward_directed_direction_as_list();
            } else {
                if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_backward_directed_direction()) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_backward_directed_direction_as_list();
                } else {
                    if (com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_link_direction() == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_undirected_direction()) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.get_sbhl_undirected_direction_as_list();
                    } else {
                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_direction_p($sbhl_link_direction$.getDynamicValue(thread))) {
                                {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                                            } else {
                                                Errors.warn($str_alt14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str_alt9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                                            }
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

    /**
     * Accessor. @return listp; the list containing only current value of @see *sbhl-link-direction*
     */
    @LispMethod(comment = "Accessor. @return listp; the list containing only current value of @see *sbhl-link-direction*")
    public static SubLObject get_sbhl_link_direction_as_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (get_sbhl_link_direction().eql(get_sbhl_forward_directed_direction())) {
            return get_sbhl_forward_directed_direction_as_list();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_backward_directed_direction())) {
            return get_sbhl_backward_directed_direction_as_list();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_undirected_direction())) {
            return get_sbhl_undirected_direction_as_list();
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_direction_p($sbhl_link_direction$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                    } else {
                        Errors.warn($str14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str9$_A_is_not_a__A, $sbhl_link_direction$.getDynamicValue(thread), SBHL_DIRECTION_P);
                    }


        }
        return NIL;
    }

    /**
     * Binds *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-link-direction*")
    public static final SubLObject with_sbhl_link_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject direction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            direction = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_link_direction$, direction)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-link-direction*")
    public static SubLObject with_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        direction = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_link_direction$, direction)), append(body, NIL));
    }

    /**
     * Binds *sbhl-link-direction* to its opposite. @see get-sbhl-opposite-link-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to its opposite. @see get-sbhl-opposite-link-direction")
    public static final SubLObject with_sbhl_opposite_link_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt18, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-link-direction* to its opposite. @see get-sbhl-opposite-link-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to its opposite. @see get-sbhl-opposite-link-direction")
    public static SubLObject with_sbhl_opposite_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list18, append(body, NIL));
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction")
    public static final SubLObject with_sbhl_forward_link_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_LINK_DIRECTION, $list_alt20, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction")
    public static SubLObject with_sbhl_forward_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_LINK_DIRECTION, $list20, append(body, NIL));
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction, for MODULE (or *sbhl-module*, if MODULE is nil)
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction, for MODULE (or *sbhl-module*, if MODULE is nil)")
    public static final SubLObject with_sbhl_forward_link_direction_for_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            module = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_SBHL_LINK_DIRECTION, list(GET_SBHL_MODULE_FORWARD_DIRECTION, module), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction, for MODULE (or *sbhl-module*, if MODULE is nil)
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-forward-direction, for MODULE (or *sbhl-module*, if MODULE is nil)")
    public static SubLObject with_sbhl_forward_link_direction_for_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_SBHL_LINK_DIRECTION, list(GET_SBHL_MODULE_FORWARD_DIRECTION, module), append(body, NIL));
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-backward-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-backward-direction")
    public static final SubLObject with_sbhl_backward_link_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_LINK_DIRECTION, $list_alt23, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-link-direction* to @see get-sbhl-module-backward-direction
     */
    @LispMethod(comment = "Binds *sbhl-link-direction* to @see get-sbhl-module-backward-direction")
    public static SubLObject with_sbhl_backward_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_LINK_DIRECTION, $list23, append(body, NIL));
    }

    public static final SubLObject do_sbhl_true_link_truths_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject truth_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    truth_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt26);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(SMART_CSOME, list(truth_var, $sbhl_true_link_truth_values$, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt26);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_sbhl_true_link_truths(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject truth_var = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        truth_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SET_OR_LIST, list(truth_var, $sbhl_true_link_truth_values$, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    /**
     *
     *
     * @return fort-p; the the #$HLTruthValue corresponding to TRUTH and STRENGTH
     */
    @LispMethod(comment = "@return fort-p; the the #$HLTruthValue corresponding to TRUTH and STRENGTH")
    public static final SubLObject truth_strength_to_sbhl_tv_alt(SubLObject truth, SubLObject strength) {
        if ((truth == $TRUE) && (strength == $MONOTONIC)) {
            return $$MonotonicallyTrue;
        } else {
            if ((truth == $TRUE) && (strength == $DEFAULT)) {
                return $$DefaultTrue;
            } else {
                if ((truth == $FALSE) && (strength == $MONOTONIC)) {
                    return $$MonotonicallyFalse;
                } else {
                    if ((truth == $FALSE) && (strength == $DEFAULT)) {
                        return $$DefaultFalse;
                    } else {
                        if (truth == $UNKNOWN) {
                            return $UNKNOWN;
                        } else {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt38$could_not_compute_an_SBHL_tv_from, truth, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return fort-p; the the #$HLTruthValue corresponding to TRUTH and STRENGTH
     */
    @LispMethod(comment = "@return fort-p; the the #$HLTruthValue corresponding to TRUTH and STRENGTH")
    public static SubLObject truth_strength_to_sbhl_tv(final SubLObject truth, final SubLObject strength) {
        if ((truth == $TRUE) && (strength == $MONOTONIC)) {
            return $$MonotonicallyTrue;
        }
        if ((truth == $TRUE) && (strength == $DEFAULT)) {
            return $$DefaultTrue;
        }
        if ((truth == $FALSE) && (strength == $MONOTONIC)) {
            return $$MonotonicallyFalse;
        }
        if ((truth == $FALSE) && (strength == $DEFAULT)) {
            return $$DefaultFalse;
        }
        if (truth == $UNKNOWN) {
            return $UNKNOWN;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$could_not_compute_an_SBHL_tv_from, truth, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return fort-p; the #$HLTruthValue corresponding to SUPPORT-TV.
     */
    @LispMethod(comment = "@return fort-p; the #$HLTruthValue corresponding to SUPPORT-TV.")
    public static final SubLObject support_tv_to_sbhl_tv_alt(SubLObject support_tv) {
        {
            SubLObject truth = enumeration_types.tv_truth(support_tv);
            SubLObject strength = enumeration_types.tv_strength(support_tv);
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.truth_strength_to_sbhl_tv(truth, strength);
        }
    }

    /**
     *
     *
     * @return fort-p; the #$HLTruthValue corresponding to SUPPORT-TV.
     */
    @LispMethod(comment = "@return fort-p; the #$HLTruthValue corresponding to SUPPORT-TV.")
    public static SubLObject support_tv_to_sbhl_tv(final SubLObject support_tv) {
        final SubLObject truth = enumeration_types.tv_truth(support_tv);
        final SubLObject strength = enumeration_types.tv_strength(support_tv);
        return truth_strength_to_sbhl_tv(truth, strength);
    }

    /**
     *
     *
     * @return booleanp; whether TRUTH is a member of *sbhl-link-truth-values*
     */
    @LispMethod(comment = "@return booleanp; whether TRUTH is a member of *sbhl-link-truth-values*")
    public static final SubLObject sbhl_link_truth_value_p_alt(SubLObject truth) {
        return subl_promotions.memberP(truth, $sbhl_link_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether TRUTH is a member of *sbhl-link-truth-values*
     */
    @LispMethod(comment = "@return booleanp; whether TRUTH is a member of *sbhl-link-truth-values*")
    public static SubLObject sbhl_link_truth_value_p(final SubLObject truth) {
        return subl_promotions.memberP(truth, $sbhl_link_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor: @return booleanp; whether OBJECT is a list of sbhl nodes. @see sbhl-node-object-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a list of sbhl nodes. @see sbhl-node-object-p.")
    public static final SubLObject sbhl_link_nodes_object_p_alt(SubLObject v_object) {
        {
            SubLObject invalidP = NIL;
            if (v_object.isList()) {
                if (NIL == invalidP) {
                    {
                        SubLObject csome_list_var = v_object;
                        SubLObject link_object = NIL;
                        for (link_object = csome_list_var.first(); !((NIL != invalidP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , link_object = csome_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.sbhl_node_object_p(link_object)) {
                                invalidP = T;
                            }
                        }
                    }
                }
            } else {
                invalidP = T;
            }
            return makeBoolean(NIL == invalidP);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT is a list of sbhl nodes. @see sbhl-node-object-p.")
    public static SubLObject sbhl_link_nodes_object_p(final SubLObject v_object) {
        SubLObject invalidP = NIL;
        if (v_object.isList()) {
            if (NIL == invalidP) {
                SubLObject csome_list_var = v_object;
                SubLObject link_object = NIL;
                link_object = csome_list_var.first();
                while ((NIL == invalidP) && (NIL != csome_list_var)) {
                    if (NIL == sbhl_node_object_p(link_object)) {
                        invalidP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    link_object = csome_list_var.first();
                } 
            }
        } else {
            invalidP = T;
        }
        return makeBoolean(NIL == invalidP);
    }

    /**
     * Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl node
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl node")
    public static final SubLObject sbhl_node_object_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != sbhl_time_utilities.sbhl_time_node_object_p(v_object)));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl node")
    public static SubLObject sbhl_node_object_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != sbhl_time_utilities.sbhl_time_node_object_p(v_object)));
    }

    /**
     * Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl mt
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl mt")
    public static final SubLObject sbhl_mt_object_p_alt(SubLObject v_object) {
        return hlmt.chlmt_p(v_object);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether OBJECT has valid structure to be an sbhl mt")
    public static SubLObject sbhl_mt_object_p(final SubLObject v_object) {
        return hlmt.chlmt_p(v_object);
    }

    /**
     * Binds @see *sbhl-randomize-lists-p* to T.
     */
    @LispMethod(comment = "Binds @see *sbhl-randomize-lists-p* to T.")
    public static final SubLObject with_sbhl_randomized_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt39, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds @see *sbhl-randomize-lists-p* to T.")
    public static SubLObject with_sbhl_randomized(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list40, append(body, NIL));
    }/**
     * Binds @see *sbhl-randomize-lists-p* to T.
     */


    /**
     * Accessor: @return booleanp; @see *sbhl-randomize-lists-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp; @see *sbhl-randomize-lists-p*")
    public static final SubLObject sbhl_randomize_lists_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_randomize_lists_p$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; @see *sbhl-randomize-lists-p*")
    public static SubLObject sbhl_randomize_lists_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_randomize_lists_p$.getDynamicValue(thread);
    }/**
     * Accessor: @return booleanp; @see *sbhl-randomize-lists-p*
     */


    /**
     * Iterator over LIST. If @see sbhl-randomize-lists-p, iterates over LIST in a random order, binding ELT-VAR to each element in turn. Iterates until LIST is exhausted or DONE-VAR is non-nil.
     */
    @LispMethod(comment = "Iterator over LIST. If @see sbhl-randomize-lists-p, iterates over LIST in a random order, binding ELT-VAR to each element in turn. Iterates until LIST is exhausted or DONE-VAR is non-nil.")
    public static final SubLObject sbhl_csome_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject elt_var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    elt_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt40);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject new_list = $sym41$NEW_LIST;
                                return list(CLET, list(list(new_list, list(FIF, $list_alt43, list(RANDOMIZE_LIST, list), list))), listS(SMART_CSOME, list(elt_var, new_list, done_var), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt40);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator over LIST. If @see sbhl-randomize-lists-p, iterates over LIST in a random order, binding ELT-VAR to each element in turn. Iterates until LIST is exhausted or DONE-VAR is non-nil.
     */
    @LispMethod(comment = "Iterator over LIST. If @see sbhl-randomize-lists-p, iterates over LIST in a random order, binding ELT-VAR to each element in turn. Iterates until LIST is exhausted or DONE-VAR is non-nil.")
    public static SubLObject sbhl_csome(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elt_var = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        elt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        list = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list41);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject new_list = $sym42$NEW_LIST;
            return list(CLET, list(list(new_list, list(FIF, $list44, list(RANDOMIZE_LIST, list), list))), listS(SMART_CSOME, list(elt_var, new_list, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list41);
        return NIL;
    }

    /**
     * Accessor: @return sbhl-node-object-p; @see *sbhl-link-mt*
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; @see *sbhl-link-mt*")
    public static final SubLObject get_sbhl_link_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_link_mt$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; @see *sbhl-link-mt*")
    public static SubLObject get_sbhl_link_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_link_mt$.getDynamicValue(thread);
    }/**
     * Accessor: @return sbhl-node-object-p; @see *sbhl-link-mt*
     */


    /**
     * Accessor: @return sbhl-node-object-p; @see *sbhl-link-tv*
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; @see *sbhl-link-tv*")
    public static final SubLObject get_sbhl_link_tv_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_link_tv$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; @see *sbhl-link-tv*")
    public static SubLObject get_sbhl_link_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_link_tv$.getDynamicValue(thread);
    }/**
     * Accessor: @return sbhl-node-object-p; @see *sbhl-link-tv*
     */


    /**
     * Accessor: @return function-spec-p; @see *sbhl-link-generator*
     */
    @LispMethod(comment = "Accessor: @return function-spec-p; @see *sbhl-link-generator*")
    public static final SubLObject get_sbhl_link_generator_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_link_generator$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return function-spec-p; @see *sbhl-link-generator*")
    public static SubLObject get_sbhl_link_generator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_link_generator$.getDynamicValue(thread);
    }/**
     * Accessor: @return function-spec-p; @see *sbhl-link-generator*
     */


    public static final SubLObject with_sbhl_writer_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_WRITER_LOCK, $list_alt47, append(body, NIL));
        }
    }

    public static SubLObject with_sbhl_writer_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_WRITER_LOCK, $list49, append(body, NIL));
    }

    public static final SubLObject with_sbhl_reader_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_READER_LOCK, $list_alt47, append(body, NIL));
        }
    }

    public static SubLObject with_sbhl_reader_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_READER_LOCK, $list49, append(body, NIL));
    }

    public static SubLObject declare_sbhl_link_vars_file() {
        declareFunction("sbhl_direction_p", "SBHL-DIRECTION-P", 1, 0, false);
        declareFunction("sbhl_directed_direction_p", "SBHL-DIRECTED-DIRECTION-P", 1, 0, false);
        declareFunction("sbhl_undirected_direction_p", "SBHL-UNDIRECTED-DIRECTION-P", 1, 0, false);
        declareFunction("get_sbhl_directed_directions", "GET-SBHL-DIRECTED-DIRECTIONS", 0, 0, false);
        declareFunction("get_sbhl_forward_directed_direction", "GET-SBHL-FORWARD-DIRECTED-DIRECTION", 0, 0, false);
        declareFunction("sbhl_forward_directed_direction_p", "SBHL-FORWARD-DIRECTED-DIRECTION-P", 1, 0, false);
        declareFunction("get_sbhl_forward_directed_direction_as_list", "GET-SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        declareFunction("get_sbhl_backward_directed_direction", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION", 0, 0, false);
        declareFunction("sbhl_backward_directed_direction_p", "SBHL-BACKWARD-DIRECTED-DIRECTION-P", 1, 0, false);
        declareFunction("get_sbhl_backward_directed_direction_as_list", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        declareFunction("get_sbhl_undirected_direction", "GET-SBHL-UNDIRECTED-DIRECTION", 0, 0, false);
        declareFunction("get_sbhl_undirected_direction_as_list", "GET-SBHL-UNDIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        declareFunction("get_sbhl_link_direction", "GET-SBHL-LINK-DIRECTION", 0, 0, false);
        declareFunction("get_sbhl_opposite_link_direction", "GET-SBHL-OPPOSITE-LINK-DIRECTION", 0, 0, false);
        declareFunction("get_sbhl_link_direction_as_list", "GET-SBHL-LINK-DIRECTION-AS-LIST", 0, 0, false);
        declareMacro("with_sbhl_link_direction", "WITH-SBHL-LINK-DIRECTION");
        declareMacro("with_sbhl_opposite_link_direction", "WITH-SBHL-OPPOSITE-LINK-DIRECTION");
        declareMacro("with_sbhl_forward_link_direction", "WITH-SBHL-FORWARD-LINK-DIRECTION");
        declareMacro("with_sbhl_forward_link_direction_for_module", "WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");
        declareMacro("with_sbhl_backward_link_direction", "WITH-SBHL-BACKWARD-LINK-DIRECTION");
        declareMacro("do_sbhl_true_link_truths", "DO-SBHL-TRUE-LINK-TRUTHS");
        declareFunction("truth_strength_to_sbhl_tv", "TRUTH-STRENGTH-TO-SBHL-TV", 2, 0, false);
        declareFunction("support_tv_to_sbhl_tv", "SUPPORT-TV-TO-SBHL-TV", 1, 0, false);
        declareFunction("sbhl_link_truth_value_p", "SBHL-LINK-TRUTH-VALUE-P", 1, 0, false);
        declareFunction("sbhl_link_nodes_object_p", "SBHL-LINK-NODES-OBJECT-P", 1, 0, false);
        declareFunction("sbhl_node_object_p", "SBHL-NODE-OBJECT-P", 1, 0, false);
        declareFunction("sbhl_mt_object_p", "SBHL-MT-OBJECT-P", 1, 0, false);
        declareMacro("with_sbhl_randomized", "WITH-SBHL-RANDOMIZED");
        declareFunction("sbhl_randomize_lists_p", "SBHL-RANDOMIZE-LISTS-P", 0, 0, false);
        declareMacro("sbhl_csome", "SBHL-CSOME");
        declareFunction("get_sbhl_link_mt", "GET-SBHL-LINK-MT", 0, 0, false);
        declareFunction("get_sbhl_link_tv", "GET-SBHL-LINK-TV", 0, 0, false);
        declareFunction("get_sbhl_link_generator", "GET-SBHL-LINK-GENERATOR", 0, 0, false);
        declareMacro("with_sbhl_writer_lock", "WITH-SBHL-WRITER-LOCK");
        declareMacro("with_sbhl_reader_lock", "WITH-SBHL-READER-LOCK");
        return NIL;
    }

    public static SubLObject init_sbhl_link_vars_file() {
        deflexical("*SBHL-DIRECTIONS*", $list0);
        deflexical("*SBHL-DIRECTED-DIRECTIONS*", $list1);
        deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION*", $PREDICATE);
        deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST*", $list3);
        deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION*", $INVERSE);
        deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST*", $list5);
        deflexical("*SBHL-UNDIRECTED-DIRECTION*", $LINK);
        deflexical("*SBHL-UNDIRECTED-DIRECTION-AS-LIST*", $list7);
        defparameter("*SBHL-LINK-DIRECTION*", NIL);
        deflexical("*SBHL-LINK-TRUTH-VALUES*", $list24);
        deflexical("*SBHL-TRUE-LINK-TRUTH-VALUES*", $list25);
        defparameter("*SBHL-RANDOMIZE-LISTS-P*", NIL);
        defparameter("*SBHL-LINK-MT*", NIL);
        defparameter("*SBHL-LINK-TV*", NIL);
        defparameter("*SBHL-LINK-GENERATOR*", NIL);
        deflexical("*SBHL-RW-LOCK*", ReadWriteLocks.new_rw_lock($$$SBHL));
        defparameter("*ADDED-ASSERTION*", NIL);
        defparameter("*ADDED-SOURCE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_link_vars_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_link_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_link_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_link_vars_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"), $LINK);

    static private final SubLList $list_alt1 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));

    static private final SubLList $list_alt3 = list(makeKeyword("PREDICATE"));

    static private final SubLList $list_alt5 = list(makeKeyword("INVERSE"));

    static private final SubLList $list_alt7 = list($LINK);

    static private final SubLString $str_alt9$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt14$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list_alt15 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-OPPOSITE-LINK-DIRECTION"))));

    static private final SubLList $list_alt20 = list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));

    static private final SubLList $list_alt21 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")));

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"), reader_make_constant_shell("MonotonicallyFalse"), reader_make_constant_shell("DefaultFalse"));

    static private final SubLList $list_alt25 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("TRUTH-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt38$could_not_compute_an_SBHL_tv_from = makeString("could not compute an SBHL tv from ~s and ~s");

    static private final SubLList $list_alt39 = list(list(makeSymbol("*SBHL-RANDOMIZE-LISTS-P*"), T));

    static private final SubLList $list_alt40 = list(list(makeSymbol("ELT-VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym41$NEW_LIST = makeUninternedSymbol("NEW-LIST");

    static private final SubLList $list_alt43 = list(makeSymbol("SBHL-RANDOMIZE-LISTS-P"));

    static private final SubLList $list_alt47 = list(makeSymbol("*SBHL-RW-LOCK*"));
}

/**
 * Total time: 124 ms
 */

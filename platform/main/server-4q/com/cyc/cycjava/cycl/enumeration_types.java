/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ENUMERATION-TYPES
 * source file: /cyc/top/cycl/enumeration-types.lisp
 * created:     2019/07/03 17:37:18
 */
public final class enumeration_types extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new enumeration_types();

 public static final String myName = "com.cyc.cycjava.cycl.enumeration_types";


    // defconstant
    // Definitions
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $valid_directions$ = makeSymbol("*VALID-DIRECTIONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $valid_assertion_types$ = makeSymbol("*VALID-ASSERTION-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $valid_el_strengths$ = makeSymbol("*VALID-EL-STRENGTHS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $valid_truths$ = makeSymbol("*VALID-TRUTHS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $valid_senses$ = makeSymbol("*VALID-SENSES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $valid_hl_truth_values$ = makeSymbol("*VALID-HL-TRUTH-VALUES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $term_args$ = makeSymbol("*TERM-ARGS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"), $CODE);

    static private final SubLList $list2 = list(makeSymbol("OBJECT"));

    static private final SubLString $str3$Return_T_iff_OBJECT_is_a_valid_as = makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");

    static private final SubLList $list4 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list5 = list(makeKeyword("GAF"), $RULE);

    static private final SubLList $list6 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));

    static private final SubLString $str8$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");

    static private final SubLList $list10 = list($TRUE, makeKeyword("UNKNOWN"), makeKeyword("FALSE"));

    static private final SubLString $str15$Returns_T_iff_OBJECT_is_a_valid_C = makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");

    static private final SubLString $str16$_S_is_not_a_TRUTH_P = makeString("~S is not a TRUTH-P");

    static private final SubLString $str19$_unknown_cannot_be_converted_into = makeString(":unknown cannot be converted into a boolean");

    static private final SubLList $list20 = list(makeKeyword("NEG"), makeKeyword("POS"));

    static private final SubLString $str22$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");

    static private final SubLString $str23$_S_is_not_a_SENSE_P = makeString("~S is not a SENSE-P");

    static private final SubLList $list24 = list(makeKeyword("TRUE-MON"), makeKeyword("TRUE-DEF"), makeKeyword("UNKNOWN"), makeKeyword("FALSE-DEF"), makeKeyword("FALSE-MON"), makeKeyword("UNKNOWN-MON"));

    private static final SubLString $str32$_S_does_not_satisfy_TV_P = makeString("~S does not satisfy TV-P");

    private static final SubLString $str33$_S_is_not_a_STRENGTH_P = makeString("~S is not a STRENGTH-P");

    private static final SubLList $list34 = list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword("NEG"), makeKeyword("POS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword("IST"), makeKeyword("OTHER") });

    public static final SubLObject valid_directions_alt() {
        return $valid_directions$.getGlobalValue();
    }

    public static SubLObject valid_directions() {
        return $valid_directions$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a valid assertion inference direction
     * :backward :forward or :code.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid assertion inference direction\r\n:backward :forward or :code.\nReturn T iff OBJECT is a valid assertion inference direction\n:backward :forward or :code.")
    public static final SubLObject direction_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_directions$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a valid assertion inference direction
     * :backward :forward or :code.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid assertion inference direction\r\n:backward :forward or :code.\nReturn T iff OBJECT is a valid assertion inference direction\n:backward :forward or :code.")
    public static SubLObject direction_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_directions$.getGlobalValue());
    }

    public static final SubLObject encode_direction_alt(SubLObject direction) {
        return position(direction, com.cyc.cycjava.cycl.enumeration_types.valid_directions(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject encode_direction(final SubLObject direction) {
        return position(direction, valid_directions(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject decode_direction_alt(SubLObject fixnum) {
        return nth(fixnum, com.cyc.cycjava.cycl.enumeration_types.valid_directions());
    }

    public static SubLObject decode_direction(final SubLObject fixnum) {
        return nth(fixnum, valid_directions());
    }

    /**
     * Return T iff OBJECT is a valid CycL assertion type
     * :gaf or :rule.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL assertion type\r\n:gaf or :rule.\nReturn T iff OBJECT is a valid CycL assertion type\n:gaf or :rule.")
    public static final SubLObject assertion_type_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_assertion_types$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a valid CycL assertion type
     * :gaf or :rule.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL assertion type\r\n:gaf or :rule.\nReturn T iff OBJECT is a valid CycL assertion type\n:gaf or :rule.")
    public static SubLObject assertion_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_assertion_types$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a valid CycL assertion strength
     * :default or :monotonic.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL assertion strength\r\n:default or :monotonic.\nReturn T iff OBJECT is a valid CycL assertion strength\n:default or :monotonic.")
    public static final SubLObject el_strength_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_el_strengths$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a valid CycL assertion strength
     * :default or :monotonic.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL assertion strength\r\n:default or :monotonic.\nReturn T iff OBJECT is a valid CycL assertion strength\n:default or :monotonic.")
    public static SubLObject el_strength_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_el_strengths$.getGlobalValue());
    }

    public static final SubLObject el_strength_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.enumeration_types.el_strength_p(v_object)) || ($UNSPECIFIED == v_object));
    }

    public static SubLObject el_strength_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_strength_p(v_object)) || ($UNSPECIFIED == v_object));
    }

    /**
     * Return T iff STRENGTH2 is subsumed by STRENGTH1
     */
    @LispMethod(comment = "Return T iff STRENGTH2 is subsumed by STRENGTH1")
    public static final SubLObject el_strength_implies_alt(SubLObject strength1, SubLObject strength2) {
        return makeBoolean(NIL == list_utilities.position_L(strength1, strength2, $valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return T iff STRENGTH2 is subsumed by STRENGTH1
     */
    @LispMethod(comment = "Return T iff STRENGTH2 is subsumed by STRENGTH1")
    public static SubLObject el_strength_implies(final SubLObject strength1, final SubLObject strength2) {
        return makeBoolean(NIL == list_utilities.position_L(strength1, strength2, $valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject valid_truths_alt() {
        return $valid_truths$.getGlobalValue();
    }

    public static SubLObject valid_truths() {
        return $valid_truths$.getGlobalValue();
    }

    /**
     * Returns T iff OBJECT is a valid CycL truth
     * :true :false or :unknown.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid CycL truth\r\n:true :false or :unknown.\nReturns T iff OBJECT is a valid CycL truth\n:true :false or :unknown.")
    public static final SubLObject truth_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object == $TRUE) || (v_object == $FALSE)) || (v_object == $UNKNOWN));
    }

    /**
     * Returns T iff OBJECT is a valid CycL truth
     * :true :false or :unknown.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid CycL truth\r\n:true :false or :unknown.\nReturns T iff OBJECT is a valid CycL truth\n:true :false or :unknown.")
    public static SubLObject truth_p(final SubLObject v_object) {
        return makeBoolean(((v_object == $TRUE) || (v_object == $FALSE)) || (v_object == $UNKNOWN));
    }

    public static final SubLObject inverse_truth_alt(SubLObject truth) {
        {
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                return $FALSE;
            } else {
                if (pcase_var.eql($FALSE)) {
                    return $TRUE;
                } else {
                    if (pcase_var.eql($UNKNOWN)) {
                        return $UNKNOWN;
                    } else {
                        return Errors.error($str_alt16$_S_is_not_a_TRUTH_P, truth);
                    }
                }
            }
        }
    }

    public static SubLObject inverse_truth(final SubLObject truth) {
        if (truth.eql($TRUE)) {
            return $FALSE;
        }
        if (truth.eql($FALSE)) {
            return $TRUE;
        }
        if (truth.eql($UNKNOWN)) {
            return $UNKNOWN;
        }
        return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
    }

    public static final SubLObject truth_sense_alt(SubLObject truth) {
        {
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                return $POS;
            } else {
                if (pcase_var.eql($FALSE)) {
                    return $NEG;
                } else {
                    if (pcase_var.eql($UNKNOWN)) {
                        return $NEG;
                    } else {
                        return Errors.error($str_alt16$_S_is_not_a_TRUTH_P, truth);
                    }
                }
            }
        }
    }

    public static SubLObject truth_sense(final SubLObject truth) {
        if (truth.eql($TRUE)) {
            return $POS;
        }
        if (truth.eql($FALSE)) {
            return $NEG;
        }
        if (truth.eql($UNKNOWN)) {
            return $NEG;
        }
        return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
    }

    public static final SubLObject truth_boolean_alt(SubLObject truth) {
        {
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                return T;
            } else {
                if (pcase_var.eql($FALSE)) {
                    return NIL;
                } else {
                    if (pcase_var.eql($UNKNOWN)) {
                        Errors.error($str_alt19$_unknown_cannot_be_converted_into);
                    } else {
                        return Errors.error($str_alt16$_S_is_not_a_TRUTH_P, truth);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject truth_boolean(final SubLObject truth) {
        if (truth.eql($TRUE)) {
            return T;
        }
        if (truth.eql($FALSE)) {
            return NIL;
        }
        if (truth.eql($UNKNOWN)) {
            Errors.error($str19$_unknown_cannot_be_converted_into);
            return NIL;
        }
        return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
    }

    public static final SubLObject boolean_truth_alt(SubLObject v_boolean) {
        return NIL != v_boolean ? ((SubLObject) ($TRUE)) : $FALSE;
    }

    public static SubLObject boolean_truth(final SubLObject v_boolean) {
        return NIL != v_boolean ? $TRUE : $FALSE;
    }

    public static SubLObject boolean_to_match_count(final SubLObject v_boolean) {
        return NIL != v_boolean ? ONE_INTEGER : ZERO_INTEGER;
    }

    /**
     * Return T iff OBJECT is a valid CycL literal sense
     * :neg or :pos.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL literal sense\r\n:neg or :pos.\nReturn T iff OBJECT is a valid CycL literal sense\n:neg or :pos.")
    public static final SubLObject sense_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_senses$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a valid CycL literal sense
     * :neg or :pos.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid CycL literal sense\r\n:neg or :pos.\nReturn T iff OBJECT is a valid CycL literal sense\n:neg or :pos.")
    public static SubLObject sense_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_senses$.getGlobalValue());
    }

    public static final SubLObject inverse_sense_alt(SubLObject sense) {
        {
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS)) {
                return $NEG;
            } else {
                if (pcase_var.eql($NEG)) {
                    return $POS;
                } else {
                    return Errors.error($str_alt23$_S_is_not_a_SENSE_P, sense);
                }
            }
        }
    }

    public static SubLObject inverse_sense(final SubLObject sense) {
        if (sense.eql($POS)) {
            return $NEG;
        }
        if (sense.eql($NEG)) {
            return $POS;
        }
        return Errors.error($str23$_S_is_not_a_SENSE_P, sense);
    }

    public static final SubLObject sense_truth_alt(SubLObject sense) {
        {
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS)) {
                return $TRUE;
            } else {
                if (pcase_var.eql($NEG)) {
                    return $FALSE;
                } else {
                    return Errors.error($str_alt23$_S_is_not_a_SENSE_P, sense);
                }
            }
        }
    }

    public static SubLObject sense_truth(final SubLObject sense) {
        if (sense.eql($POS)) {
            return $TRUE;
        }
        if (sense.eql($NEG)) {
            return $FALSE;
        }
        return Errors.error($str23$_S_is_not_a_SENSE_P, sense);
    }

    public static final SubLObject valid_hl_truth_values_alt() {
        return $valid_hl_truth_values$.getGlobalValue();
    }

    public static SubLObject valid_hl_truth_values() {
        return $valid_hl_truth_values$.getGlobalValue();
    }

    /**
     * Returns T iff OBJECT is a valid CycL HL truth value.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid CycL HL truth value.")
    public static final SubLObject tv_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_truth_values$.getGlobalValue());
    }

    /**
     * Returns T iff OBJECT is a valid CycL HL truth value.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a valid CycL HL truth value.")
    public static SubLObject tv_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_truth_values$.getGlobalValue());
    }

    public static final SubLObject encode_tv_alt(SubLObject tv) {
        return position(tv, com.cyc.cycjava.cycl.enumeration_types.valid_hl_truth_values(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject encode_tv(final SubLObject tv) {
        return position(tv, valid_hl_truth_values(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject decode_tv_alt(SubLObject fixnum) {
        return nth(fixnum, com.cyc.cycjava.cycl.enumeration_types.valid_hl_truth_values());
    }

    public static SubLObject decode_tv(final SubLObject fixnum) {
        return nth(fixnum, valid_hl_truth_values());
    }

    public static final SubLObject tv_strength_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE_DEF)) {
                return $DEFAULT;
            } else {
                if (pcase_var.eql($TRUE_MON)) {
                    return $MONOTONIC;
                } else {
                    if (pcase_var.eql($FALSE_DEF)) {
                        return $DEFAULT;
                    } else {
                        if (pcase_var.eql($FALSE_MON)) {
                            return $MONOTONIC;
                        } else {
                            if (pcase_var.eql($UNKNOWN)) {
                                return $DEFAULT;
                            } else {
                                return Errors.error($str_alt31$_S_does_not_satisfy_TV_P, tv);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject tv_strength(final SubLObject tv) {
        if (tv.eql($TRUE_DEF)) {
            return $DEFAULT;
        }
        if (tv.eql($TRUE_MON)) {
            return $MONOTONIC;
        }
        if (tv.eql($FALSE_DEF)) {
            return $DEFAULT;
        }
        if (tv.eql($FALSE_MON)) {
            return $MONOTONIC;
        }
        if (tv.eql($UNKNOWN)) {
            return $DEFAULT;
        }
        if (tv.eql($UNKNOWN_MON)) {
            return $MONOTONIC;
        }
        return Errors.error($str32$_S_does_not_satisfy_TV_P, tv);
    }

    public static final SubLObject tv_truth_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE_DEF)) {
                return $TRUE;
            } else {
                if (pcase_var.eql($TRUE_MON)) {
                    return $TRUE;
                } else {
                    if (pcase_var.eql($FALSE_DEF)) {
                        return $FALSE;
                    } else {
                        if (pcase_var.eql($FALSE_MON)) {
                            return $FALSE;
                        } else {
                            if (pcase_var.eql($UNKNOWN)) {
                                return $UNKNOWN;
                            } else {
                                return Errors.error($str_alt31$_S_does_not_satisfy_TV_P, tv);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject tv_truth(final SubLObject tv) {
        if (tv.eql($TRUE_DEF)) {
            return $TRUE;
        }
        if (tv.eql($TRUE_MON)) {
            return $TRUE;
        }
        if (tv.eql($FALSE_DEF)) {
            return $FALSE;
        }
        if (tv.eql($FALSE_MON)) {
            return $FALSE;
        }
        if (tv.eql($UNKNOWN)) {
            return $UNKNOWN;
        }
        if (tv.eql($UNKNOWN_MON)) {
            return $UNKNOWN;
        }
        return Errors.error($str32$_S_does_not_satisfy_TV_P, tv);
    }

    public static final SubLObject inverse_tv_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE_MON)) {
                return $FALSE_MON;
            } else {
                if (pcase_var.eql($TRUE_DEF)) {
                    return $FALSE_DEF;
                } else {
                    if (pcase_var.eql($FALSE_MON)) {
                        return $TRUE_MON;
                    } else {
                        if (pcase_var.eql($FALSE_DEF)) {
                            return $TRUE_DEF;
                        } else {
                            if (pcase_var.eql($UNKNOWN)) {
                                return $UNKNOWN;
                            } else {
                                return Errors.error($str_alt31$_S_does_not_satisfy_TV_P, tv);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject inverse_tv(final SubLObject tv) {
        if (tv.eql($TRUE_MON)) {
            return $FALSE_MON;
        }
        if (tv.eql($TRUE_DEF)) {
            return $FALSE_DEF;
        }
        if (tv.eql($FALSE_MON)) {
            return $TRUE_MON;
        }
        if (tv.eql($FALSE_DEF)) {
            return $TRUE_DEF;
        }
        if (tv.eql($UNKNOWN)) {
            return $UNKNOWN;
        }
        if (tv.eql($UNKNOWN_MON)) {
            return $UNKNOWN_MON;
        }
        return Errors.error($str32$_S_does_not_satisfy_TV_P, tv);
    }

    public static final SubLObject tv_trueP_alt(SubLObject tv) {
        return makeBoolean((tv == $TRUE_DEF) || (tv == $TRUE_MON));
    }

    public static SubLObject tv_trueP(final SubLObject tv) {
        return makeBoolean((tv == $TRUE_DEF) || (tv == $TRUE_MON));
    }

    public static final SubLObject tv_falseP_alt(SubLObject tv) {
        return makeBoolean((tv == $FALSE_DEF) || (tv == $FALSE_MON));
    }

    public static SubLObject tv_falseP(final SubLObject tv) {
        return makeBoolean((tv == $FALSE_DEF) || (tv == $FALSE_MON));
    }

    public static SubLObject tv_unknownP(final SubLObject tv) {
        return makeBoolean((tv == $UNKNOWN) || (tv == $UNKNOWN_MON));
    }

    public static final SubLObject tv_sense_alt(SubLObject tv) {
        return com.cyc.cycjava.cycl.enumeration_types.truth_sense(com.cyc.cycjava.cycl.enumeration_types.tv_truth(tv));
    }

    public static SubLObject tv_sense(final SubLObject tv) {
        return truth_sense(tv_truth(tv));
    }

    public static final SubLObject tv_from_truth_strength_alt(SubLObject truth, SubLObject strength) {
        {
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                {
                    SubLObject pcase_var_1 = strength;
                    if (pcase_var_1.eql($DEFAULT)) {
                        return $TRUE_DEF;
                    } else {
                        if (pcase_var_1.eql($MONOTONIC)) {
                            return $TRUE_MON;
                        } else {
                            return Errors.error($str_alt32$_S_is_not_a_STRENGTH_P, strength);
                        }
                    }
                }
            } else {
                if (pcase_var.eql($FALSE)) {
                    {
                        SubLObject pcase_var_2 = strength;
                        if (pcase_var_2.eql($DEFAULT)) {
                            return $FALSE_DEF;
                        } else {
                            if (pcase_var_2.eql($MONOTONIC)) {
                                return $FALSE_MON;
                            } else {
                                return Errors.error($str_alt32$_S_is_not_a_STRENGTH_P, strength);
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($UNKNOWN)) {
                        return $UNKNOWN;
                    } else {
                        return Errors.error($str_alt16$_S_is_not_a_TRUTH_P, truth);
                    }
                }
            }
        }
    }

    public static SubLObject tv_from_truth_strength(final SubLObject truth, final SubLObject strength) {
        if (truth.eql($TRUE)) {
            if (strength.eql($DEFAULT)) {
                return $TRUE_DEF;
            }
            if (strength.eql($MONOTONIC)) {
                return $TRUE_MON;
            }
            return Errors.error($str33$_S_is_not_a_STRENGTH_P, strength);
        } else
            if (truth.eql($FALSE)) {
                if (strength.eql($DEFAULT)) {
                    return $FALSE_DEF;
                }
                if (strength.eql($MONOTONIC)) {
                    return $FALSE_MON;
                }
                return Errors.error($str33$_S_is_not_a_STRENGTH_P, strength);
            } else {
                if (!truth.eql($UNKNOWN)) {
                    return Errors.error($str16$_S_is_not_a_TRUTH_P, truth);
                }
                if (strength.eql($DEFAULT)) {
                    return $UNKNOWN;
                }
                if (strength.eql($MONOTONIC)) {
                    return $UNKNOWN_MON;
                }
                return Errors.error($str33$_S_is_not_a_STRENGTH_P, strength);
            }

    }

    public static final SubLObject tv_from_sense_strength_alt(SubLObject sense, SubLObject strength) {
        return com.cyc.cycjava.cycl.enumeration_types.tv_from_truth_strength(com.cyc.cycjava.cycl.enumeration_types.sense_truth(sense), strength);
    }

    public static SubLObject tv_from_sense_strength(final SubLObject sense, final SubLObject strength) {
        return tv_from_truth_strength(sense_truth(sense), strength);
    }

    public static final SubLObject term_arg_p_alt(SubLObject v_object) {
        return member(v_object, $term_args$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_arg_p(final SubLObject v_object) {
        return member(v_object, $term_args$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_enumeration_types_file() {
        declareFunction("valid_directions", "VALID-DIRECTIONS", 0, 0, false);
        declareFunction("direction_p", "DIRECTION-P", 1, 0, false);
        declareFunction("encode_direction", "ENCODE-DIRECTION", 1, 0, false);
        declareFunction("decode_direction", "DECODE-DIRECTION", 1, 0, false);
        declareFunction("assertion_type_p", "ASSERTION-TYPE-P", 1, 0, false);
        declareFunction("el_strength_p", "EL-STRENGTH-P", 1, 0, false);
        declareFunction("el_strength_spec_p", "EL-STRENGTH-SPEC-P", 1, 0, false);
        declareFunction("el_strength_implies", "EL-STRENGTH-IMPLIES", 2, 0, false);
        declareFunction("valid_truths", "VALID-TRUTHS", 0, 0, false);
        declareFunction("truth_p", "TRUTH-P", 1, 0, false);
        declareFunction("inverse_truth", "INVERSE-TRUTH", 1, 0, false);
        declareFunction("truth_sense", "TRUTH-SENSE", 1, 0, false);
        declareFunction("truth_boolean", "TRUTH-BOOLEAN", 1, 0, false);
        declareFunction("boolean_truth", "BOOLEAN-TRUTH", 1, 0, false);
        declareFunction("boolean_to_match_count", "BOOLEAN-TO-MATCH-COUNT", 1, 0, false);
        declareFunction("sense_p", "SENSE-P", 1, 0, false);
        declareFunction("inverse_sense", "INVERSE-SENSE", 1, 0, false);
        declareFunction("sense_truth", "SENSE-TRUTH", 1, 0, false);
        declareFunction("valid_hl_truth_values", "VALID-HL-TRUTH-VALUES", 0, 0, false);
        declareFunction("tv_p", "TV-P", 1, 0, false);
        declareFunction("encode_tv", "ENCODE-TV", 1, 0, false);
        declareFunction("decode_tv", "DECODE-TV", 1, 0, false);
        declareFunction("tv_strength", "TV-STRENGTH", 1, 0, false);
        declareFunction("tv_truth", "TV-TRUTH", 1, 0, false);
        declareFunction("inverse_tv", "INVERSE-TV", 1, 0, false);
        declareFunction("tv_trueP", "TV-TRUE?", 1, 0, false);
        declareFunction("tv_falseP", "TV-FALSE?", 1, 0, false);
        declareFunction("tv_unknownP", "TV-UNKNOWN?", 1, 0, false);
        declareFunction("tv_sense", "TV-SENSE", 1, 0, false);
        declareFunction("tv_from_truth_strength", "TV-FROM-TRUTH-STRENGTH", 2, 0, false);
        declareFunction("tv_from_sense_strength", "TV-FROM-SENSE-STRENGTH", 2, 0, false);
        declareFunction("term_arg_p", "TERM-ARG-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_enumeration_types_file_alt() {
        defconstant("*VALID-DIRECTIONS*", $list_alt0);
        defconstant("*VALID-ASSERTION-TYPES*", $list_alt5);
        defconstant("*VALID-EL-STRENGTHS*", $list_alt6);
        defconstant("*VALID-TRUTHS*", $list_alt10);
        defconstant("*VALID-SENSES*", $list_alt20);
        defconstant("*VALID-HL-TRUTH-VALUES*", $list_alt24);
        defconstant("*TERM-ARGS*", $list_alt33);
        return NIL;
    }

    public static SubLObject init_enumeration_types_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*VALID-DIRECTIONS*", $list0);
            defconstant("*VALID-ASSERTION-TYPES*", $list5);
            defconstant("*VALID-EL-STRENGTHS*", $list6);
            defconstant("*VALID-TRUTHS*", $list10);
            defconstant("*VALID-SENSES*", $list20);
            defconstant("*VALID-HL-TRUTH-VALUES*", $list24);
            defconstant("*TERM-ARGS*", $list34);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*TERM-ARGS*", $list_alt33);
        }
        return NIL;
    }

    public static SubLObject init_enumeration_types_file_Previous() {
        defconstant("*VALID-DIRECTIONS*", $list0);
        defconstant("*VALID-ASSERTION-TYPES*", $list5);
        defconstant("*VALID-EL-STRENGTHS*", $list6);
        defconstant("*VALID-TRUTHS*", $list10);
        defconstant("*VALID-SENSES*", $list20);
        defconstant("*VALID-HL-TRUTH-VALUES*", $list24);
        defconstant("*TERM-ARGS*", $list34);
        return NIL;
    }

    public static SubLObject setup_enumeration_types_file() {
        register_cyc_api_function(DIRECTION_P, $list2, $str3$Return_T_iff_OBJECT_is_a_valid_as, NIL, $list4);
        register_cyc_api_function(EL_STRENGTH_P, $list2, $str8$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4);
        register_cyc_api_function(TRUTH_P, $list2, $str15$Returns_T_iff_OBJECT_is_a_valid_C, NIL, NIL);
        register_cyc_api_function(SENSE_P, $list2, $str22$Return_T_iff_OBJECT_is_a_valid_Cy, NIL, $list4);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_enumeration_types_file();
    }

    @Override
    public void initializeVariables() {
        init_enumeration_types_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_enumeration_types_file();
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"), $CODE);

    static {
    }

    static private final SubLList $list_alt2 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt3$Return_T_iff_OBJECT_is_a_valid_as = makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");

    static private final SubLList $list_alt4 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt5 = list(makeKeyword("GAF"), $RULE);

    static private final SubLList $list_alt6 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));

    static private final SubLString $str_alt8$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");

    static private final SubLList $list_alt10 = list($TRUE, makeKeyword("UNKNOWN"), makeKeyword("FALSE"));

    static private final SubLString $str_alt15$Returns_T_iff_OBJECT_is_a_valid_C = makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");

    static private final SubLString $str_alt16$_S_is_not_a_TRUTH_P = makeString("~S is not a TRUTH-P");

    static private final SubLString $str_alt19$_unknown_cannot_be_converted_into = makeString(":unknown cannot be converted into a boolean");

    static private final SubLList $list_alt20 = list(makeKeyword("NEG"), makeKeyword("POS"));

    static private final SubLString $str_alt22$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");

    static private final SubLString $str_alt23$_S_is_not_a_SENSE_P = makeString("~S is not a SENSE-P");

    static private final SubLList $list_alt24 = list(makeKeyword("TRUE-MON"), makeKeyword("TRUE-DEF"), makeKeyword("UNKNOWN"), makeKeyword("FALSE-DEF"), makeKeyword("FALSE-MON"));

    static private final SubLString $str_alt31$_S_does_not_satisfy_TV_P = makeString("~S does not satisfy TV-P");

    static private final SubLString $str_alt32$_S_is_not_a_STRENGTH_P = makeString("~S is not a STRENGTH-P");

    static private final SubLList $list_alt33 = list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword("NEG"), makeKeyword("POS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword("IST"), makeKeyword("OTHER") });
}

/**
 * Total time: 135 ms
 */

package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class enumeration_types extends SubLTranslatedFile {
    public static final SubLFile me = new enumeration_types();

    public static final String myName = "com.cyc.cycjava.cycl.enumeration_types";

    public static final String myFingerPrint = "355d25ed60969111974def2c913c9f19628ea0aeba921f86e70d06f23133101c";

    // defconstant
    // Definitions
    private static final SubLSymbol $valid_directions$ = makeSymbol("*VALID-DIRECTIONS*");

    // defconstant
    private static final SubLSymbol $valid_assertion_types$ = makeSymbol("*VALID-ASSERTION-TYPES*");

    // defconstant
    public static final SubLSymbol $valid_el_strengths$ = makeSymbol("*VALID-EL-STRENGTHS*");

    // defconstant
    private static final SubLSymbol $valid_truths$ = makeSymbol("*VALID-TRUTHS*");

    // defconstant
    public static final SubLSymbol $valid_senses$ = makeSymbol("*VALID-SENSES*");

    // defconstant
    private static final SubLSymbol $valid_hl_truth_values$ = makeSymbol("*VALID-HL-TRUTH-VALUES*");

    // defconstant
    public static final SubLSymbol $term_args$ = makeSymbol("*TERM-ARGS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"), makeKeyword("CODE"));



    public static final SubLList $list2 = list(makeSymbol("OBJECT"));

    public static final SubLString $str3$Return_T_iff_OBJECT_is_a_valid_as = makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");

    public static final SubLList $list4 = list(makeSymbol("BOOLEANP"));

    public static final SubLList $list5 = list(makeKeyword("GAF"), makeKeyword("RULE"));

    public static final SubLList $list6 = list(makeKeyword("DEFAULT"), makeKeyword("MONOTONIC"));



    public static final SubLString $str8$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");



    public static final SubLList $list10 = list(makeKeyword("TRUE"), makeKeyword("UNKNOWN"), makeKeyword("FALSE"));









    public static final SubLString $str15$Returns_T_iff_OBJECT_is_a_valid_C = makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");

    public static final SubLString $str16$_S_is_not_a_TRUTH_P = makeString("~S is not a TRUTH-P");





    public static final SubLString $str19$_unknown_cannot_be_converted_into = makeString(":unknown cannot be converted into a boolean");

    public static final SubLList $list20 = list(makeKeyword("NEG"), makeKeyword("POS"));



    public static final SubLString $str22$Return_T_iff_OBJECT_is_a_valid_Cy = makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");

    public static final SubLString $str23$_S_is_not_a_SENSE_P = makeString("~S is not a SENSE-P");

    public static final SubLList $list24 = list(makeKeyword("TRUE-MON"), makeKeyword("TRUE-DEF"), makeKeyword("UNKNOWN"), makeKeyword("FALSE-DEF"), makeKeyword("FALSE-MON"), makeKeyword("UNKNOWN-MON"));















    private static final SubLString $str32$_S_does_not_satisfy_TV_P = makeString("~S does not satisfy TV-P");

    private static final SubLString $str33$_S_is_not_a_STRENGTH_P = makeString("~S is not a STRENGTH-P");

    private static final SubLList $list34 = list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, ZERO_INTEGER, makeKeyword("NEG"), makeKeyword("POS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, makeKeyword("IST"), makeKeyword("OTHER") });

    public static SubLObject valid_directions() {
        return $valid_directions$.getGlobalValue();
    }

    public static SubLObject direction_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_directions$.getGlobalValue());
    }

    public static SubLObject encode_direction(final SubLObject direction) {
        return position(direction, valid_directions(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject decode_direction(final SubLObject fixnum) {
        return nth(fixnum, valid_directions());
    }

    public static SubLObject assertion_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_assertion_types$.getGlobalValue());
    }

    public static SubLObject el_strength_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_el_strengths$.getGlobalValue());
    }

    public static SubLObject el_strength_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_strength_p(v_object)) || ($UNSPECIFIED == v_object));
    }

    public static SubLObject el_strength_implies(final SubLObject strength1, final SubLObject strength2) {
        return makeBoolean(NIL == list_utilities.position_L(strength1, strength2, $valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject valid_truths() {
        return $valid_truths$.getGlobalValue();
    }

    public static SubLObject truth_p(final SubLObject v_object) {
        return makeBoolean(((v_object == $TRUE) || (v_object == $FALSE)) || (v_object == $UNKNOWN));
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

    public static SubLObject boolean_truth(final SubLObject v_boolean) {
        return NIL != v_boolean ? $TRUE : $FALSE;
    }

    public static SubLObject boolean_to_match_count(final SubLObject v_boolean) {
        return NIL != v_boolean ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static SubLObject sense_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_senses$.getGlobalValue());
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

    public static SubLObject sense_truth(final SubLObject sense) {
        if (sense.eql($POS)) {
            return $TRUE;
        }
        if (sense.eql($NEG)) {
            return $FALSE;
        }
        return Errors.error($str23$_S_is_not_a_SENSE_P, sense);
    }

    public static SubLObject valid_hl_truth_values() {
        return $valid_hl_truth_values$.getGlobalValue();
    }

    public static SubLObject tv_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_truth_values$.getGlobalValue());
    }

    public static SubLObject encode_tv(final SubLObject tv) {
        return position(tv, valid_hl_truth_values(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject decode_tv(final SubLObject fixnum) {
        return nth(fixnum, valid_hl_truth_values());
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

    public static SubLObject tv_trueP(final SubLObject tv) {
        return makeBoolean((tv == $TRUE_DEF) || (tv == $TRUE_MON));
    }

    public static SubLObject tv_falseP(final SubLObject tv) {
        return makeBoolean((tv == $FALSE_DEF) || (tv == $FALSE_MON));
    }

    public static SubLObject tv_unknownP(final SubLObject tv) {
        return makeBoolean((tv == $UNKNOWN) || (tv == $UNKNOWN_MON));
    }

    public static SubLObject tv_sense(final SubLObject tv) {
        return truth_sense(tv_truth(tv));
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

    public static SubLObject tv_from_sense_strength(final SubLObject sense, final SubLObject strength) {
        return tv_from_truth_strength(sense_truth(sense), strength);
    }

    public static SubLObject term_arg_p(final SubLObject v_object) {
        return member(v_object, $term_args$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_enumeration_types_file() {
        declareFunction(me, "valid_directions", "VALID-DIRECTIONS", 0, 0, false);
        declareFunction(me, "direction_p", "DIRECTION-P", 1, 0, false);
        declareFunction(me, "encode_direction", "ENCODE-DIRECTION", 1, 0, false);
        declareFunction(me, "decode_direction", "DECODE-DIRECTION", 1, 0, false);
        declareFunction(me, "assertion_type_p", "ASSERTION-TYPE-P", 1, 0, false);
        declareFunction(me, "el_strength_p", "EL-STRENGTH-P", 1, 0, false);
        declareFunction(me, "el_strength_spec_p", "EL-STRENGTH-SPEC-P", 1, 0, false);
        declareFunction(me, "el_strength_implies", "EL-STRENGTH-IMPLIES", 2, 0, false);
        declareFunction(me, "valid_truths", "VALID-TRUTHS", 0, 0, false);
        declareFunction(me, "truth_p", "TRUTH-P", 1, 0, false);
        declareFunction(me, "inverse_truth", "INVERSE-TRUTH", 1, 0, false);
        declareFunction(me, "truth_sense", "TRUTH-SENSE", 1, 0, false);
        declareFunction(me, "truth_boolean", "TRUTH-BOOLEAN", 1, 0, false);
        declareFunction(me, "boolean_truth", "BOOLEAN-TRUTH", 1, 0, false);
        declareFunction(me, "boolean_to_match_count", "BOOLEAN-TO-MATCH-COUNT", 1, 0, false);
        declareFunction(me, "sense_p", "SENSE-P", 1, 0, false);
        declareFunction(me, "inverse_sense", "INVERSE-SENSE", 1, 0, false);
        declareFunction(me, "sense_truth", "SENSE-TRUTH", 1, 0, false);
        declareFunction(me, "valid_hl_truth_values", "VALID-HL-TRUTH-VALUES", 0, 0, false);
        declareFunction(me, "tv_p", "TV-P", 1, 0, false);
        declareFunction(me, "encode_tv", "ENCODE-TV", 1, 0, false);
        declareFunction(me, "decode_tv", "DECODE-TV", 1, 0, false);
        declareFunction(me, "tv_strength", "TV-STRENGTH", 1, 0, false);
        declareFunction(me, "tv_truth", "TV-TRUTH", 1, 0, false);
        declareFunction(me, "inverse_tv", "INVERSE-TV", 1, 0, false);
        declareFunction(me, "tv_trueP", "TV-TRUE?", 1, 0, false);
        declareFunction(me, "tv_falseP", "TV-FALSE?", 1, 0, false);
        declareFunction(me, "tv_unknownP", "TV-UNKNOWN?", 1, 0, false);
        declareFunction(me, "tv_sense", "TV-SENSE", 1, 0, false);
        declareFunction(me, "tv_from_truth_strength", "TV-FROM-TRUTH-STRENGTH", 2, 0, false);
        declareFunction(me, "tv_from_sense_strength", "TV-FROM-SENSE-STRENGTH", 2, 0, false);
        declareFunction(me, "term_arg_p", "TERM-ARG-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_enumeration_types_file() {
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

    
}

/**
 * Total time: 135 ms
 */

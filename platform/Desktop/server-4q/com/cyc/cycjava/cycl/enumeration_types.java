package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class enumeration_types extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.enumeration_types";
    public static final String myFingerPrint = "355d25ed60969111974def2c913c9f19628ea0aeba921f86e70d06f23133101c";
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 936L)
    private static SubLSymbol $valid_directions$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1481L)
    private static SubLSymbol $valid_assertion_types$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1777L)
    public static SubLSymbol $valid_el_strengths$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2389L)
    private static SubLSymbol $valid_truths$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3820L)
    public static SubLSymbol $valid_senses$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4388L)
    private static SubLSymbol $valid_hl_truth_values$;
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6860L)
    public static SubLSymbol $term_args$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$DIRECTION_P;
    private static final SubLList $list2;
    private static final SubLString $str3$Return_T_iff_OBJECT_is_a_valid_as;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$EL_STRENGTH_P;
    private static final SubLString $str8$Return_T_iff_OBJECT_is_a_valid_Cy;
    private static final SubLSymbol $kw9$UNSPECIFIED;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$TRUE;
    private static final SubLSymbol $kw12$FALSE;
    private static final SubLSymbol $kw13$UNKNOWN;
    private static final SubLSymbol $sym14$TRUTH_P;
    private static final SubLString $str15$Returns_T_iff_OBJECT_is_a_valid_C;
    private static final SubLString $str16$_S_is_not_a_TRUTH_P;
    private static final SubLSymbol $kw17$POS;
    private static final SubLSymbol $kw18$NEG;
    private static final SubLString $str19$_unknown_cannot_be_converted_into;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$SENSE_P;
    private static final SubLString $str22$Return_T_iff_OBJECT_is_a_valid_Cy;
    private static final SubLString $str23$_S_is_not_a_SENSE_P;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$TRUE_DEF;
    private static final SubLSymbol $kw26$DEFAULT;
    private static final SubLSymbol $kw27$TRUE_MON;
    private static final SubLSymbol $kw28$MONOTONIC;
    private static final SubLSymbol $kw29$FALSE_DEF;
    private static final SubLSymbol $kw30$FALSE_MON;
    private static final SubLSymbol $kw31$UNKNOWN_MON;
    private static final SubLString $str32$_S_does_not_satisfy_TV_P;
    private static final SubLString $str33$_S_is_not_a_STRENGTH_P;
    private static final SubLList $list34;
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1060L)
    public static SubLObject valid_directions() {
        return enumeration_types.$valid_directions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1117L)
    public static SubLObject direction_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, enumeration_types.$valid_directions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1323L)
    public static SubLObject encode_direction(final SubLObject direction) {
        return Sequences.position(direction, valid_directions(), (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1408L)
    public static SubLObject decode_direction(final SubLObject fixnum) {
        return ConsesLow.nth(fixnum, valid_directions());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1611L)
    public static SubLObject assertion_type_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, enumeration_types.$valid_assertion_types$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 1896L)
    public static SubLObject el_strength_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, enumeration_types.$valid_el_strengths$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2096L)
    public static SubLObject el_strength_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(enumeration_types.NIL != el_strength_p(v_object) || enumeration_types.$kw9$UNSPECIFIED == v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2208L)
    public static SubLObject el_strength_implies(final SubLObject strength1, final SubLObject strength2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(enumeration_types.NIL == list_utilities.position_L(strength1, strength2, enumeration_types.$valid_el_strengths$.getGlobalValue(), (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2497L)
    public static SubLObject valid_truths() {
        return enumeration_types.$valid_truths$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2546L)
    public static SubLObject truth_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object == enumeration_types.$kw11$TRUE || v_object == enumeration_types.$kw12$FALSE || v_object == enumeration_types.$kw13$UNKNOWN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 2820L)
    public static SubLObject inverse_truth(final SubLObject truth) {
        if (truth.eql((SubLObject)enumeration_types.$kw11$TRUE)) {
            return (SubLObject)enumeration_types.$kw12$FALSE;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw12$FALSE)) {
            return (SubLObject)enumeration_types.$kw11$TRUE;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            return (SubLObject)enumeration_types.$kw13$UNKNOWN;
        }
        return Errors.error((SubLObject)enumeration_types.$str16$_S_is_not_a_TRUTH_P, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3016L)
    public static SubLObject truth_sense(final SubLObject truth) {
        if (truth.eql((SubLObject)enumeration_types.$kw11$TRUE)) {
            return (SubLObject)enumeration_types.$kw17$POS;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw12$FALSE)) {
            return (SubLObject)enumeration_types.$kw18$NEG;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            return (SubLObject)enumeration_types.$kw18$NEG;
        }
        return Errors.error((SubLObject)enumeration_types.$str16$_S_is_not_a_TRUTH_P, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3322L)
    public static SubLObject truth_boolean(final SubLObject truth) {
        if (truth.eql((SubLObject)enumeration_types.$kw11$TRUE)) {
            return (SubLObject)enumeration_types.T;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw12$FALSE)) {
            return (SubLObject)enumeration_types.NIL;
        }
        if (truth.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            Errors.error((SubLObject)enumeration_types.$str19$_unknown_cannot_be_converted_into);
            return (SubLObject)enumeration_types.NIL;
        }
        return Errors.error((SubLObject)enumeration_types.$str16$_S_is_not_a_TRUTH_P, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3557L)
    public static SubLObject boolean_truth(final SubLObject v_boolean) {
        return (SubLObject)((enumeration_types.NIL != v_boolean) ? enumeration_types.$kw11$TRUE : enumeration_types.$kw12$FALSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3693L)
    public static SubLObject boolean_to_match_count(final SubLObject v_boolean) {
        return (SubLObject)((enumeration_types.NIL != v_boolean) ? enumeration_types.ONE_INTEGER : enumeration_types.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 3905L)
    public static SubLObject sense_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, enumeration_types.$valid_senses$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4077L)
    public static SubLObject inverse_sense(final SubLObject sense) {
        if (sense.eql((SubLObject)enumeration_types.$kw17$POS)) {
            return (SubLObject)enumeration_types.$kw18$NEG;
        }
        if (sense.eql((SubLObject)enumeration_types.$kw18$NEG)) {
            return (SubLObject)enumeration_types.$kw17$POS;
        }
        return Errors.error((SubLObject)enumeration_types.$str23$_S_is_not_a_SENSE_P, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4232L)
    public static SubLObject sense_truth(final SubLObject sense) {
        if (sense.eql((SubLObject)enumeration_types.$kw17$POS)) {
            return (SubLObject)enumeration_types.$kw11$TRUE;
        }
        if (sense.eql((SubLObject)enumeration_types.$kw18$NEG)) {
            return (SubLObject)enumeration_types.$kw12$FALSE;
        }
        return Errors.error((SubLObject)enumeration_types.$str23$_S_is_not_a_SENSE_P, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4535L)
    public static SubLObject valid_hl_truth_values() {
        return enumeration_types.$valid_hl_truth_values$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4602L)
    public static SubLObject tv_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, enumeration_types.$valid_hl_truth_values$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4735L)
    public static SubLObject encode_tv(final SubLObject tv) {
        return Sequences.position(tv, valid_hl_truth_values(), (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4804L)
    public static SubLObject decode_tv(final SubLObject fixnum) {
        return ConsesLow.nth(fixnum, valid_hl_truth_values());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 4875L)
    public static SubLObject tv_strength(final SubLObject tv) {
        if (tv.eql((SubLObject)enumeration_types.$kw25$TRUE_DEF)) {
            return (SubLObject)enumeration_types.$kw26$DEFAULT;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw27$TRUE_MON)) {
            return (SubLObject)enumeration_types.$kw28$MONOTONIC;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw29$FALSE_DEF)) {
            return (SubLObject)enumeration_types.$kw26$DEFAULT;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw30$FALSE_MON)) {
            return (SubLObject)enumeration_types.$kw28$MONOTONIC;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            return (SubLObject)enumeration_types.$kw26$DEFAULT;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw31$UNKNOWN_MON)) {
            return (SubLObject)enumeration_types.$kw28$MONOTONIC;
        }
        return Errors.error((SubLObject)enumeration_types.$str32$_S_does_not_satisfy_TV_P, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5180L)
    public static SubLObject tv_truth(final SubLObject tv) {
        if (tv.eql((SubLObject)enumeration_types.$kw25$TRUE_DEF)) {
            return (SubLObject)enumeration_types.$kw11$TRUE;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw27$TRUE_MON)) {
            return (SubLObject)enumeration_types.$kw11$TRUE;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw29$FALSE_DEF)) {
            return (SubLObject)enumeration_types.$kw12$FALSE;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw30$FALSE_MON)) {
            return (SubLObject)enumeration_types.$kw12$FALSE;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            return (SubLObject)enumeration_types.$kw13$UNKNOWN;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw31$UNKNOWN_MON)) {
            return (SubLObject)enumeration_types.$kw13$UNKNOWN;
        }
        return Errors.error((SubLObject)enumeration_types.$str32$_S_does_not_satisfy_TV_P, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5466L)
    public static SubLObject inverse_tv(final SubLObject tv) {
        if (tv.eql((SubLObject)enumeration_types.$kw27$TRUE_MON)) {
            return (SubLObject)enumeration_types.$kw30$FALSE_MON;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw25$TRUE_DEF)) {
            return (SubLObject)enumeration_types.$kw29$FALSE_DEF;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw30$FALSE_MON)) {
            return (SubLObject)enumeration_types.$kw27$TRUE_MON;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw29$FALSE_DEF)) {
            return (SubLObject)enumeration_types.$kw25$TRUE_DEF;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
            return (SubLObject)enumeration_types.$kw13$UNKNOWN;
        }
        if (tv.eql((SubLObject)enumeration_types.$kw31$UNKNOWN_MON)) {
            return (SubLObject)enumeration_types.$kw31$UNKNOWN_MON;
        }
        return Errors.error((SubLObject)enumeration_types.$str32$_S_does_not_satisfy_TV_P, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5774L)
    public static SubLObject tv_trueP(final SubLObject tv) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tv == enumeration_types.$kw25$TRUE_DEF || tv == enumeration_types.$kw27$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5853L)
    public static SubLObject tv_falseP(final SubLObject tv) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tv == enumeration_types.$kw29$FALSE_DEF || tv == enumeration_types.$kw30$FALSE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 5935L)
    public static SubLObject tv_unknownP(final SubLObject tv) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tv == enumeration_types.$kw13$UNKNOWN || tv == enumeration_types.$kw31$UNKNOWN_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6019L)
    public static SubLObject tv_sense(final SubLObject tv) {
        return truth_sense(tv_truth(tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6079L)
    public static SubLObject tv_from_truth_strength(final SubLObject truth, final SubLObject strength) {
        if (truth.eql((SubLObject)enumeration_types.$kw11$TRUE)) {
            if (strength.eql((SubLObject)enumeration_types.$kw26$DEFAULT)) {
                return (SubLObject)enumeration_types.$kw25$TRUE_DEF;
            }
            if (strength.eql((SubLObject)enumeration_types.$kw28$MONOTONIC)) {
                return (SubLObject)enumeration_types.$kw27$TRUE_MON;
            }
            return Errors.error((SubLObject)enumeration_types.$str33$_S_is_not_a_STRENGTH_P, strength);
        }
        else if (truth.eql((SubLObject)enumeration_types.$kw12$FALSE)) {
            if (strength.eql((SubLObject)enumeration_types.$kw26$DEFAULT)) {
                return (SubLObject)enumeration_types.$kw29$FALSE_DEF;
            }
            if (strength.eql((SubLObject)enumeration_types.$kw28$MONOTONIC)) {
                return (SubLObject)enumeration_types.$kw30$FALSE_MON;
            }
            return Errors.error((SubLObject)enumeration_types.$str33$_S_is_not_a_STRENGTH_P, strength);
        }
        else {
            if (!truth.eql((SubLObject)enumeration_types.$kw13$UNKNOWN)) {
                return Errors.error((SubLObject)enumeration_types.$str16$_S_is_not_a_TRUTH_P, truth);
            }
            if (strength.eql((SubLObject)enumeration_types.$kw26$DEFAULT)) {
                return (SubLObject)enumeration_types.$kw13$UNKNOWN;
            }
            if (strength.eql((SubLObject)enumeration_types.$kw28$MONOTONIC)) {
                return (SubLObject)enumeration_types.$kw31$UNKNOWN_MON;
            }
            return Errors.error((SubLObject)enumeration_types.$str33$_S_is_not_a_STRENGTH_P, strength);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6738L)
    public static SubLObject tv_from_sense_strength(final SubLObject sense, final SubLObject strength) {
        return tv_from_truth_strength(sense_truth(sense), strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumeration-types.lisp", position = 6991L)
    public static SubLObject term_arg_p(final SubLObject v_object) {
        return conses_high.member(v_object, enumeration_types.$term_args$.getGlobalValue(), (SubLObject)enumeration_types.UNPROVIDED, (SubLObject)enumeration_types.UNPROVIDED);
    }
    
    public static SubLObject declare_enumeration_types_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "valid_directions", "VALID-DIRECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "direction_p", "DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "encode_direction", "ENCODE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "decode_direction", "DECODE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "assertion_type_p", "ASSERTION-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "el_strength_p", "EL-STRENGTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "el_strength_spec_p", "EL-STRENGTH-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "el_strength_implies", "EL-STRENGTH-IMPLIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "valid_truths", "VALID-TRUTHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "truth_p", "TRUTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "inverse_truth", "INVERSE-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "truth_sense", "TRUTH-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "truth_boolean", "TRUTH-BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "boolean_truth", "BOOLEAN-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "boolean_to_match_count", "BOOLEAN-TO-MATCH-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "sense_p", "SENSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "inverse_sense", "INVERSE-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "sense_truth", "SENSE-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "valid_hl_truth_values", "VALID-HL-TRUTH-VALUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_p", "TV-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "encode_tv", "ENCODE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "decode_tv", "DECODE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_strength", "TV-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_truth", "TV-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "inverse_tv", "INVERSE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_trueP", "TV-TRUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_falseP", "TV-FALSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_unknownP", "TV-UNKNOWN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_sense", "TV-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_from_truth_strength", "TV-FROM-TRUTH-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "tv_from_sense_strength", "TV-FROM-SENSE-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumeration_types", "term_arg_p", "TERM-ARG-P", 1, 0, false);
        return (SubLObject)enumeration_types.NIL;
    }
    
    public static SubLObject init_enumeration_types_file() {
        enumeration_types.$valid_directions$ = SubLFiles.defconstant("*VALID-DIRECTIONS*", (SubLObject)enumeration_types.$list0);
        enumeration_types.$valid_assertion_types$ = SubLFiles.defconstant("*VALID-ASSERTION-TYPES*", (SubLObject)enumeration_types.$list5);
        enumeration_types.$valid_el_strengths$ = SubLFiles.defconstant("*VALID-EL-STRENGTHS*", (SubLObject)enumeration_types.$list6);
        enumeration_types.$valid_truths$ = SubLFiles.defconstant("*VALID-TRUTHS*", (SubLObject)enumeration_types.$list10);
        enumeration_types.$valid_senses$ = SubLFiles.defconstant("*VALID-SENSES*", (SubLObject)enumeration_types.$list20);
        enumeration_types.$valid_hl_truth_values$ = SubLFiles.defconstant("*VALID-HL-TRUTH-VALUES*", (SubLObject)enumeration_types.$list24);
        enumeration_types.$term_args$ = SubLFiles.defconstant("*TERM-ARGS*", (SubLObject)enumeration_types.$list34);
        return (SubLObject)enumeration_types.NIL;
    }
    
    public static SubLObject setup_enumeration_types_file() {
        utilities_macros.register_cyc_api_function((SubLObject)enumeration_types.$sym1$DIRECTION_P, (SubLObject)enumeration_types.$list2, (SubLObject)enumeration_types.$str3$Return_T_iff_OBJECT_is_a_valid_as, (SubLObject)enumeration_types.NIL, (SubLObject)enumeration_types.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)enumeration_types.$sym7$EL_STRENGTH_P, (SubLObject)enumeration_types.$list2, (SubLObject)enumeration_types.$str8$Return_T_iff_OBJECT_is_a_valid_Cy, (SubLObject)enumeration_types.NIL, (SubLObject)enumeration_types.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)enumeration_types.$sym14$TRUTH_P, (SubLObject)enumeration_types.$list2, (SubLObject)enumeration_types.$str15$Returns_T_iff_OBJECT_is_a_valid_C, (SubLObject)enumeration_types.NIL, (SubLObject)enumeration_types.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)enumeration_types.$sym21$SENSE_P, (SubLObject)enumeration_types.$list2, (SubLObject)enumeration_types.$str22$Return_T_iff_OBJECT_is_a_valid_Cy, (SubLObject)enumeration_types.NIL, (SubLObject)enumeration_types.$list4);
        return (SubLObject)enumeration_types.NIL;
    }
    
    public void declareFunctions() {
        declare_enumeration_types_file();
    }
    
    public void initializeVariables() {
        init_enumeration_types_file();
    }
    
    public void runTopLevelForms() {
        setup_enumeration_types_file();
    }
    
    static {
        me = (SubLFile)new enumeration_types();
        enumeration_types.$valid_directions$ = null;
        enumeration_types.$valid_assertion_types$ = null;
        enumeration_types.$valid_el_strengths$ = null;
        enumeration_types.$valid_truths$ = null;
        enumeration_types.$valid_senses$ = null;
        enumeration_types.$valid_hl_truth_values$ = null;
        enumeration_types.$term_args$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("CODE"));
        $sym1$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str3$Return_T_iff_OBJECT_is_a_valid_as = SubLObjectFactory.makeString("Return T iff OBJECT is a valid assertion inference direction\n :backward :forward or :code.");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GAF"), (SubLObject)SubLObjectFactory.makeKeyword("RULE"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"));
        $sym7$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $str8$Return_T_iff_OBJECT_is_a_valid_Cy = SubLObjectFactory.makeString("Return T iff OBJECT is a valid CycL assertion strength \n :default or :monotonic.");
        $kw9$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $kw11$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw12$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw13$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym14$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $str15$Returns_T_iff_OBJECT_is_a_valid_C = SubLObjectFactory.makeString("Returns T iff OBJECT is a valid CycL truth\n :true :false or :unknown.");
        $str16$_S_is_not_a_TRUTH_P = SubLObjectFactory.makeString("~S is not a TRUTH-P");
        $kw17$POS = SubLObjectFactory.makeKeyword("POS");
        $kw18$NEG = SubLObjectFactory.makeKeyword("NEG");
        $str19$_unknown_cannot_be_converted_into = SubLObjectFactory.makeString(":unknown cannot be converted into a boolean");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("POS"));
        $sym21$SENSE_P = SubLObjectFactory.makeSymbol("SENSE-P");
        $str22$Return_T_iff_OBJECT_is_a_valid_Cy = SubLObjectFactory.makeString("Return T iff OBJECT is a valid CycL literal sense\n :neg or :pos.");
        $str23$_S_is_not_a_SENSE_P = SubLObjectFactory.makeString("~S is not a SENSE-P");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-MON"));
        $kw25$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw26$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw27$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw28$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw29$FALSE_DEF = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $kw30$FALSE_MON = SubLObjectFactory.makeKeyword("FALSE-MON");
        $kw31$UNKNOWN_MON = SubLObjectFactory.makeKeyword("UNKNOWN-MON");
        $str32$_S_does_not_satisfy_TV_P = SubLObjectFactory.makeString("~S does not satisfy TV-P");
        $str33$_S_is_not_a_STRENGTH_P = SubLObjectFactory.makeString("~S is not a STRENGTH-P");
        $list34 = ConsesLow.list(new SubLObject[] { enumeration_types.ONE_INTEGER, enumeration_types.TWO_INTEGER, enumeration_types.ZERO_INTEGER, SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("POS"), enumeration_types.THREE_INTEGER, enumeration_types.FOUR_INTEGER, enumeration_types.FIVE_INTEGER, SubLObjectFactory.makeKeyword("IST"), SubLObjectFactory.makeKeyword("OTHER") });
    }
}

/*

	Total time: 135 ms
	
*/
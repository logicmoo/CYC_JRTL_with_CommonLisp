package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_api_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_api_datastructures";
    public static final String myFingerPrint = "9709e7d3d966034d339936172e000cdbf8ef64753a616dfa4807a41dc263a8e4";
    private static final SubLSymbol $sym0$NEW_NL_OUTPUT_SPEC;
    private static final SubLSymbol $sym1$KEYWORDP;
    private static final SubLSymbol $sym2$NL_INTERPRETATION_SPEC_P;
    private static final SubLSymbol $kw3$SUBL;
    private static final SubLSymbol $kw4$XML;
    private static final SubLSymbol $kw5$CYCL;
    private static final SubLSymbol $kw6$PRAGMATICS;
    private static final SubLSymbol $sym7$NEW_NL_INTERPRETATION_SPEC;
    private static final SubLList $list8;
    private static final SubLString $str9$construct_a_new_default_NL_interp;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLString $str12$;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$NL_INTERP_SPEC_REQUEST_CYCL;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$NL_INTERP_SPEC_RETURN_CYCL_;
    private static final SubLSymbol $kw18$WEIGHT;
    private static final SubLSymbol $sym19$NL_INTERP_SPEC_REQUEST_WEIGHT;
    private static final SubLSymbol $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_;
    private static final SubLSymbol $kw21$JUSTIFICATION;
    private static final SubLSymbol $sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION;
    private static final SubLSymbol $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_;
    private static final SubLSymbol $kw24$PHRASE_TYPES;
    private static final SubLSymbol $sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES;
    private static final SubLSymbol $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_;
    private static final SubLSymbol $kw27$INFLECTIONS;
    private static final SubLSymbol $sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS;
    private static final SubLSymbol $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_;
    private static final SubLSymbol $sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS;
    private static final SubLSymbol $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_;
    private static final SubLSymbol $sym32$NEW_NL_INTERPRETATION;
    private static final SubLSymbol $sym33$NL_INTERPRETATION_P;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$PLIST_ENTER;
    private static final SubLSymbol $sym37$SET_NL_INTERP_CYCL;
    private static final SubLString $str38$set_the_CycL_value_for_INTERP_to_;
    private static final SubLSymbol $sym39$GET_NL_INTERP_CYCL;
    private static final SubLList $list40;
    private static final SubLString $str41$Returns_the_CycL_currently_specif;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SET_NL_INTERP_PRAGMATICS;
    private static final SubLString $str46$set_the_pragmatic_features_for_IN;
    private static final SubLSymbol $sym47$GET_NL_INTERP_PRAGMATICS;
    private static final SubLString $str48$Returns_the_pragmatic_features_sp;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$SET_NL_INTERP_WEIGHT;
    private static final SubLString $str52$set_the_weight_for_INTERP_to_WEIG;
    private static final SubLSymbol $sym53$GET_NL_INTERP_WEIGHT;
    private static final SubLString $str54$Returns_the_weight_currently_spec;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$SET_NL_INTERP_JUSTIFICATION;
    private static final SubLString $str58$set_the_justification_for_INTERP_;
    private static final SubLSymbol $sym59$GET_NL_INTERP_JUSTIFICATION;
    private static final SubLString $str60$Returns_the_justification_current;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$SET_NL_INTERP_PHRASE_TYPES;
    private static final SubLString $str64$set_the_phrase_types_for_INTERP_t;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$PUTF;
    private static final SubLSymbol $sym67$ADD_NL_INTERP_PHRASE_TYPE;
    private static final SubLString $str68$add_PHRASE_TYPES_to_the_phrase_ty;
    private static final SubLSymbol $sym69$GET_NL_INTERP_PHRASE_TYPES;
    private static final SubLString $str70$Returns_the_phrase_types_currentl;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$SET_NL_INTERP_HEAD_INFLECTIONS;
    private static final SubLString $str74$set_the_inflections__speech_part_;
    private static final SubLSymbol $sym75$GET_NL_INTERP_HEAD_INFLECTIONS;
    private static final SubLString $str76$returns_the_inflections_predicate;
    private static final SubLString $str77$NLInterpretation;
    private static final SubLSymbol $kw78$UNINITIALIZED;
    private static final SubLString $str79$Cycl;
    private static final SubLString $str80$Weight;
    private static final SubLString $str81$PhraseType;
    private static final SubLString $str82$HeadInflection;
    private static final SubLString $str83$justification;
    private static final SubLString $str84$status;
    private static final SubLString $str85$unimplemented;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 844L)
    public static SubLObject new_nl_output_spec(final SubLObject output_type, SubLObject interp_spec) {
        if (interp_spec == nl_api_datastructures.UNPROVIDED) {
            interp_spec = (SubLObject)nl_api_datastructures.NIL;
        }
        enforceType(output_type, nl_api_datastructures.$sym1$KEYWORDP);
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        final SubLObject desired_interp_spec = (nl_api_datastructures.NIL != interp_spec) ? interp_spec : new_nl_interpretation_spec((SubLObject)nl_api_datastructures.UNPROVIDED);
        final SubLObject result = (SubLObject)ConsesLow.list(output_type, desired_interp_spec);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1721L)
    public static SubLObject output_spec_interp_spec(final SubLObject obj) {
        return conses_high.second(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1792L)
    public static SubLObject subl_output_spec_p(final SubLObject obj) {
        return Equality.eq(obj.first(), (SubLObject)nl_api_datastructures.$kw3$SUBL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1868L)
    public static SubLObject xml_output_spec_p(final SubLObject obj) {
        return Equality.eq(obj.first(), (SubLObject)nl_api_datastructures.$kw4$XML);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 1942L)
    public static SubLObject new_nl_interpretation_spec(SubLObject plist) {
        if (plist == nl_api_datastructures.UNPROVIDED) {
            plist = (SubLObject)nl_api_datastructures.NIL;
        }
        if (nl_api_datastructures.NIL != list_utilities.non_empty_list_p(plist)) {
            return plist;
        }
        return new_nl_interpretation((SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$kw5$CYCL, (SubLObject)nl_api_datastructures.T, (SubLObject)nl_api_datastructures.$kw6$PRAGMATICS, (SubLObject)nl_api_datastructures.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2607L)
    public static SubLObject nl_interpretation_spec_p(final SubLObject obj) {
        return nl_interpretation_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2719L)
    public static SubLObject nl_interp_spec_request_cycl(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw5$CYCL, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 2902L)
    public static SubLObject nl_interp_spec_return_cyclP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw5$CYCL, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3001L)
    public static SubLObject nl_interp_spec_request_weight(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw18$WEIGHT, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3187L)
    public static SubLObject nl_interp_spec_return_weightP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw18$WEIGHT, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3290L)
    public static SubLObject nl_interp_spec_request_justification(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw21$JUSTIFICATION, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3490L)
    public static SubLObject nl_interp_spec_return_justificationP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw21$JUSTIFICATION, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3607L)
    public static SubLObject nl_interp_spec_request_phrase_types(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3805L)
    public static SubLObject nl_interp_spec_return_phrase_typesP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 3920L)
    public static SubLObject nl_interp_spec_request_head_inflections(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw27$INFLECTIONS, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4170L)
    public static SubLObject nl_interp_spec_return_head_inflectionsP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw27$INFLECTIONS, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4291L)
    public static SubLObject nl_interp_spec_request_pragmatics(SubLObject interp_spec) {
        enforceType(interp_spec, nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P);
        interp_spec = conses_high.putf(interp_spec, (SubLObject)nl_api_datastructures.$kw6$PRAGMATICS, (SubLObject)nl_api_datastructures.T);
        return interp_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4485L)
    public static SubLObject nl_interp_spec_return_pragmaticsP(final SubLObject interp_spec) {
        return conses_high.getf(interp_spec, (SubLObject)nl_api_datastructures.$kw6$PRAGMATICS, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4596L)
    public static SubLObject new_nl_interpretation(SubLObject plist) {
        if (plist == nl_api_datastructures.UNPROVIDED) {
            plist = (SubLObject)nl_api_datastructures.NIL;
        }
        if (nl_api_datastructures.NIL != nl_interpretation_p(plist)) {
            return plist;
        }
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4893L)
    public static SubLObject nl_interpretation_p(final SubLObject item) {
        return list_utilities.property_list_p(item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 4998L)
    public static SubLObject set_nl_interp_cycl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject cycl = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list35);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list35);
        cycl = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw5$CYCL, cycl);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list35);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5133L)
    public static SubLObject get_nl_interp_cycl(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw5$CYCL, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5344L)
    public static SubLObject set_nl_interp_pragmatics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject value = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list44);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list44);
        value = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw6$PRAGMATICS, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list44);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5501L)
    public static SubLObject get_nl_interp_pragmatics(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw6$PRAGMATICS, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5774L)
    public static SubLObject set_nl_interp_weight(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject weight = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list50);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list50);
        weight = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw18$WEIGHT, weight);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list50);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 5914L)
    public static SubLObject get_nl_interp_weight(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw18$WEIGHT, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6126L)
    public static SubLObject set_nl_interp_justification(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject justification = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list56);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list56);
        justification = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw21$JUSTIFICATION, justification);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list56);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6308L)
    public static SubLObject get_nl_interp_justification(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw21$JUSTIFICATION, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6551L)
    public static SubLObject set_nl_interp_phrase_types(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject phrase_types = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list62);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list62);
        phrase_types = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, phrase_types);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list62);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6727L)
    public static SubLObject add_nl_interp_phrase_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject phrase_type = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list65);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list65);
        phrase_type = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym66$PUTF, interp, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, reader.bq_cons(phrase_type, conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, (SubLObject)nl_api_datastructures.UNPROVIDED)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list65);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 6928L)
    public static SubLObject get_nl_interp_phrase_types(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw24$PHRASE_TYPES, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7168L)
    public static SubLObject set_nl_interp_head_inflections(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)nl_api_datastructures.NIL;
        SubLObject inflections = (SubLObject)nl_api_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list72);
        interp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_api_datastructures.$list72);
        inflections = current.first();
        current = current.rest();
        if (nl_api_datastructures.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$sym36$PLIST_ENTER, interp, (SubLObject)nl_api_datastructures.$kw27$INFLECTIONS, inflections);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_api_datastructures.$list72);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7368L)
    public static SubLObject get_nl_interp_head_inflections(final SubLObject interp) {
        enforceType(interp, nl_api_datastructures.$sym33$NL_INTERPRETATION_P);
        return conses_high.getf(interp, (SubLObject)nl_api_datastructures.$kw27$INFLECTIONS, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 7645L)
    public static SubLObject nl_interp_to_xml(final SubLObject nl_interp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml = (SubLObject)nl_api_datastructures.NIL;
        final SubLObject attributes = (SubLObject)nl_api_datastructures.NIL;
        SubLObject stream = (SubLObject)nl_api_datastructures.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                try {
                    final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str77$NLInterpretation, attributes, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str79$Cycl, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
                                        cycml_generator.cycml_serialize_object(get_nl_interp_cycl(nl_interp));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)nl_api_datastructures.$str79$Cycl);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            if (nl_api_datastructures.NIL != get_nl_interp_weight(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str80$Weight, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
                                            xml_utilities.xml_print(get_nl_interp_weight(nl_interp), (SubLObject)nl_api_datastructures.UNPROVIDED);
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)nl_api_datastructures.$str80$Weight);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            if (nl_api_datastructures.NIL != get_nl_interp_justification(nl_interp)) {
                                nl_interp_justification_to_xml(get_nl_interp_justification(nl_interp));
                            }
                            if (nl_api_datastructures.NIL != get_nl_interp_phrase_types(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str81$PhraseType, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var = get_nl_interp_phrase_types(nl_interp);
                                            SubLObject phrase_type = (SubLObject)nl_api_datastructures.NIL;
                                            phrase_type = cdolist_list_var.first();
                                            while (nl_api_datastructures.NIL != cdolist_list_var) {
                                                cycml_generator.cycml_serialize_object(phrase_type);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                phrase_type = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)nl_api_datastructures.$str81$PhraseType);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            if (nl_api_datastructures.NIL != get_nl_interp_head_inflections(nl_interp)) {
                                try {
                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str82$HeadInflection, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var = get_nl_interp_head_inflections(nl_interp);
                                            SubLObject inflection = (SubLObject)nl_api_datastructures.NIL;
                                            inflection = cdolist_list_var.first();
                                            while (nl_api_datastructures.NIL != cdolist_list_var) {
                                                cycml_generator.cycml_serialize_object(inflection);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                inflection = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)nl_api_datastructures.$str82$HeadInflection);
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)nl_api_datastructures.$str77$NLInterpretation);
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_api_datastructures.T, thread);
                final SubLObject _values6 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)nl_api_datastructures.UNPROVIDED);
                Values.restoreValuesFromVector(_values6);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return xml;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8581L)
    public static SubLObject nl_interp_justification_to_xml(final SubLObject just) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal((SubLObject)nl_api_datastructures.$str83$justification, (SubLObject)ConsesLow.list((SubLObject)nl_api_datastructures.$str84$status, (SubLObject)nl_api_datastructures.$str85$unimplemented), (SubLObject)nl_api_datastructures.T, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED);
            final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind((SubLObject)nl_api_datastructures.$kw78$UNINITIALIZED, thread);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8729L)
    public static SubLObject cycls_from_nl_interps(final SubLObject interps) {
        return Sequences.remove_duplicates(Mapping.mapcar((SubLObject)nl_api_datastructures.$sym39$GET_NL_INTERP_CYCL, interps), (SubLObject)nl_api_datastructures.UNPROVIDED, (SubLObject)nl_api_datastructures.UNPROVIDED, (SubLObject)nl_api_datastructures.UNPROVIDED, (SubLObject)nl_api_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-api-datastructures.lisp", position = 8846L)
    public static SubLObject nl_justification_p(final SubLObject obj) {
        return Types.listp(obj);
    }
    
    public static SubLObject declare_nl_api_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "new_nl_output_spec", "NEW-NL-OUTPUT-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "output_spec_interp_spec", "OUTPUT-SPEC-INTERP-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "subl_output_spec_p", "SUBL-OUTPUT-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "xml_output_spec_p", "XML-OUTPUT-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "new_nl_interpretation_spec", "NEW-NL-INTERPRETATION-SPEC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interpretation_spec_p", "NL-INTERPRETATION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_cycl", "NL-INTERP-SPEC-REQUEST-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_cyclP", "NL-INTERP-SPEC-RETURN-CYCL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_weight", "NL-INTERP-SPEC-REQUEST-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_weightP", "NL-INTERP-SPEC-RETURN-WEIGHT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_justification", "NL-INTERP-SPEC-REQUEST-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_justificationP", "NL-INTERP-SPEC-RETURN-JUSTIFICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_phrase_types", "NL-INTERP-SPEC-REQUEST-PHRASE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_phrase_typesP", "NL-INTERP-SPEC-RETURN-PHRASE-TYPES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_head_inflections", "NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_head_inflectionsP", "NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_request_pragmatics", "NL-INTERP-SPEC-REQUEST-PRAGMATICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_spec_return_pragmaticsP", "NL-INTERP-SPEC-RETURN-PRAGMATICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "new_nl_interpretation", "NEW-NL-INTERPRETATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interpretation_p", "NL-INTERPRETATION-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_cycl", "SET-NL-INTERP-CYCL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_cycl", "GET-NL-INTERP-CYCL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_pragmatics", "SET-NL-INTERP-PRAGMATICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_pragmatics", "GET-NL-INTERP-PRAGMATICS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_weight", "SET-NL-INTERP-WEIGHT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_weight", "GET-NL-INTERP-WEIGHT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_justification", "SET-NL-INTERP-JUSTIFICATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_justification", "GET-NL-INTERP-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_phrase_types", "SET-NL-INTERP-PHRASE-TYPES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "add_nl_interp_phrase_type", "ADD-NL-INTERP-PHRASE-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_phrase_types", "GET-NL-INTERP-PHRASE-TYPES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_api_datastructures", "set_nl_interp_head_inflections", "SET-NL-INTERP-HEAD-INFLECTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "get_nl_interp_head_inflections", "GET-NL-INTERP-HEAD-INFLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_to_xml", "NL-INTERP-TO-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_interp_justification_to_xml", "NL-INTERP-JUSTIFICATION-TO-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "cycls_from_nl_interps", "CYCLS-FROM-NL-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_api_datastructures", "nl_justification_p", "NL-JUSTIFICATION-P", 1, 0, false);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    public static SubLObject init_nl_api_datastructures_file() {
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    public static SubLObject setup_nl_api_datastructures_file() {
        access_macros.register_external_symbol((SubLObject)nl_api_datastructures.$sym0$NEW_NL_OUTPUT_SPEC);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym7$NEW_NL_INTERPRETATION_SPEC, (SubLObject)nl_api_datastructures.$list8, (SubLObject)nl_api_datastructures.$str9$construct_a_new_default_NL_interp, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym2$NL_INTERPRETATION_SPEC_P, (SubLObject)nl_api_datastructures.$list11, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$list13);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym14$NL_INTERP_SPEC_REQUEST_CYCL, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym17$NL_INTERP_SPEC_RETURN_CYCL_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym19$NL_INTERP_SPEC_REQUEST_WEIGHT, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym20$NL_INTERP_SPEC_RETURN_WEIGHT_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.$list16, (SubLObject)nl_api_datastructures.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_, (SubLObject)nl_api_datastructures.$list15, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.NIL);
        access_macros.register_external_symbol((SubLObject)nl_api_datastructures.$sym32$NEW_NL_INTERPRETATION);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym33$NL_INTERPRETATION_P, (SubLObject)nl_api_datastructures.$list34, (SubLObject)nl_api_datastructures.$str12$, (SubLObject)nl_api_datastructures.NIL, (SubLObject)nl_api_datastructures.$list13);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym37$SET_NL_INTERP_CYCL, (SubLObject)nl_api_datastructures.$list35, (SubLObject)nl_api_datastructures.$str38$set_the_CycL_value_for_INTERP_to_);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym39$GET_NL_INTERP_CYCL, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str41$Returns_the_CycL_currently_specif, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list43);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym45$SET_NL_INTERP_PRAGMATICS, (SubLObject)nl_api_datastructures.$list44, (SubLObject)nl_api_datastructures.$str46$set_the_pragmatic_features_for_IN);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym47$GET_NL_INTERP_PRAGMATICS, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str48$Returns_the_pragmatic_features_sp, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list49);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym51$SET_NL_INTERP_WEIGHT, (SubLObject)nl_api_datastructures.$list50, (SubLObject)nl_api_datastructures.$str52$set_the_weight_for_INTERP_to_WEIG);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym53$GET_NL_INTERP_WEIGHT, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str54$Returns_the_weight_currently_spec, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list55);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym57$SET_NL_INTERP_JUSTIFICATION, (SubLObject)nl_api_datastructures.$list56, (SubLObject)nl_api_datastructures.$str58$set_the_justification_for_INTERP_);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym59$GET_NL_INTERP_JUSTIFICATION, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str60$Returns_the_justification_current, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list61);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym63$SET_NL_INTERP_PHRASE_TYPES, (SubLObject)nl_api_datastructures.$list62, (SubLObject)nl_api_datastructures.$str64$set_the_phrase_types_for_INTERP_t);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym67$ADD_NL_INTERP_PHRASE_TYPE, (SubLObject)nl_api_datastructures.$list65, (SubLObject)nl_api_datastructures.$str68$add_PHRASE_TYPES_to_the_phrase_ty);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym69$GET_NL_INTERP_PHRASE_TYPES, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str70$Returns_the_phrase_types_currentl, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list71);
        utilities_macros.register_cyc_api_macro((SubLObject)nl_api_datastructures.$sym73$SET_NL_INTERP_HEAD_INFLECTIONS, (SubLObject)nl_api_datastructures.$list72, (SubLObject)nl_api_datastructures.$str74$set_the_inflections__speech_part_);
        utilities_macros.register_cyc_api_function((SubLObject)nl_api_datastructures.$sym75$GET_NL_INTERP_HEAD_INFLECTIONS, (SubLObject)nl_api_datastructures.$list40, (SubLObject)nl_api_datastructures.$str76$returns_the_inflections_predicate, (SubLObject)nl_api_datastructures.$list42, (SubLObject)nl_api_datastructures.$list71);
        return (SubLObject)nl_api_datastructures.NIL;
    }
    
    public void declareFunctions() {
        declare_nl_api_datastructures_file();
    }
    
    public void initializeVariables() {
        init_nl_api_datastructures_file();
    }
    
    public void runTopLevelForms() {
        setup_nl_api_datastructures_file();
    }
    
    static {
        me = (SubLFile)new nl_api_datastructures();
        $sym0$NEW_NL_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("NEW-NL-OUTPUT-SPEC");
        $sym1$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym2$NL_INTERPRETATION_SPEC_P = SubLObjectFactory.makeSymbol("NL-INTERPRETATION-SPEC-P");
        $kw3$SUBL = SubLObjectFactory.makeKeyword("SUBL");
        $kw4$XML = SubLObjectFactory.makeKeyword("XML");
        $kw5$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw6$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $sym7$NEW_NL_INTERPRETATION_SPEC = SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION-SPEC");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $str9$construct_a_new_default_NL_interp = SubLObjectFactory.makeString("construct a new default NL interpretation specification.  By default, the interpretation-spec will direct\n   the parsers to return only the CycL of the interpretation");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-INTERPRETATION-SPEC-P"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ"));
        $str12$ = SubLObjectFactory.makeString("");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"));
        $sym14$NL_INTERP_SPEC_REQUEST_CYCL = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-CYCL");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP-SPEC"));
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("NL-INTERPRETATION-SPEC-P")));
        $sym17$NL_INTERP_SPEC_RETURN_CYCL_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-CYCL?");
        $kw18$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $sym19$NL_INTERP_SPEC_REQUEST_WEIGHT = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-WEIGHT");
        $sym20$NL_INTERP_SPEC_RETURN_WEIGHT_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-WEIGHT?");
        $kw21$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $sym22$NL_INTERP_SPEC_REQUEST_JUSTIFICATION = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-JUSTIFICATION");
        $sym23$NL_INTERP_SPEC_RETURN_JUSTIFICATION_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-JUSTIFICATION?");
        $kw24$PHRASE_TYPES = SubLObjectFactory.makeKeyword("PHRASE-TYPES");
        $sym25$NL_INTERP_SPEC_REQUEST_PHRASE_TYPES = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-PHRASE-TYPES");
        $sym26$NL_INTERP_SPEC_RETURN_PHRASE_TYPES_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-PHRASE-TYPES?");
        $kw27$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $sym28$NL_INTERP_SPEC_REQUEST_HEAD_INFLECTIONS = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-HEAD-INFLECTIONS");
        $sym29$NL_INTERP_SPEC_RETURN_HEAD_INFLECTIONS_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-HEAD-INFLECTIONS?");
        $sym30$NL_INTERP_SPEC_REQUEST_PRAGMATICS = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-REQUEST-PRAGMATICS");
        $sym31$NL_INTERP_SPEC_RETURN_PRAGMATICS_ = SubLObjectFactory.makeSymbol("NL-INTERP-SPEC-RETURN-PRAGMATICS?");
        $sym32$NEW_NL_INTERPRETATION = SubLObjectFactory.makeSymbol("NEW-NL-INTERPRETATION");
        $sym33$NL_INTERPRETATION_P = SubLObjectFactory.makeSymbol("NL-INTERPRETATION-P");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $sym36$PLIST_ENTER = SubLObjectFactory.makeSymbol("PLIST-ENTER");
        $sym37$SET_NL_INTERP_CYCL = SubLObjectFactory.makeSymbol("SET-NL-INTERP-CYCL");
        $str38$set_the_CycL_value_for_INTERP_to_ = SubLObjectFactory.makeString("set the CycL value for INTERP to CYCL");
        $sym39$GET_NL_INTERP_CYCL = SubLObjectFactory.makeSymbol("GET-NL-INTERP-CYCL");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"));
        $str41$Returns_the_CycL_currently_specif = SubLObjectFactory.makeString("Returns the CycL currently specified on INTERP");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("NL-INTERPRETATION-P")));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULA-P"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym45$SET_NL_INTERP_PRAGMATICS = SubLObjectFactory.makeSymbol("SET-NL-INTERP-PRAGMATICS");
        $str46$set_the_pragmatic_features_for_IN = SubLObjectFactory.makeString("set the pragmatic features for INTERP to VALUE");
        $sym47$GET_NL_INTERP_PRAGMATICS = SubLObjectFactory.makeSymbol("GET-NL-INTERP-PRAGMATICS");
        $str48$Returns_the_pragmatic_features_sp = SubLObjectFactory.makeString("Returns the pragmatic features specified for INTERP, which are each of the form\n   (PRAGMATIC-FEATURE MT)");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $sym51$SET_NL_INTERP_WEIGHT = SubLObjectFactory.makeSymbol("SET-NL-INTERP-WEIGHT");
        $str52$set_the_weight_for_INTERP_to_WEIG = SubLObjectFactory.makeString("set the weight for INTERP to WEIGHT");
        $sym53$GET_NL_INTERP_WEIGHT = SubLObjectFactory.makeSymbol("GET-NL-INTERP-WEIGHT");
        $str54$Returns_the_weight_currently_spec = SubLObjectFactory.makeString("Returns the weight currently specified on INTERP");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-P"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $sym57$SET_NL_INTERP_JUSTIFICATION = SubLObjectFactory.makeSymbol("SET-NL-INTERP-JUSTIFICATION");
        $str58$set_the_justification_for_INTERP_ = SubLObjectFactory.makeString("set the justification for INTERP to JUSTIFICATION");
        $sym59$GET_NL_INTERP_JUSTIFICATION = SubLObjectFactory.makeSymbol("GET-NL-INTERP-JUSTIFICATION");
        $str60$Returns_the_justification_current = SubLObjectFactory.makeString("Returns the justification currently specified on INTERP");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-JUSTIFICATION-P"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TYPES"));
        $sym63$SET_NL_INTERP_PHRASE_TYPES = SubLObjectFactory.makeSymbol("SET-NL-INTERP-PHRASE-TYPES");
        $str64$set_the_phrase_types_for_INTERP_t = SubLObjectFactory.makeString("set the phrase-types for INTERP to PHRASE-TYPES");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TYPE"));
        $sym66$PUTF = SubLObjectFactory.makeSymbol("PUTF");
        $sym67$ADD_NL_INTERP_PHRASE_TYPE = SubLObjectFactory.makeSymbol("ADD-NL-INTERP-PHRASE-TYPE");
        $str68$add_PHRASE_TYPES_to_the_phrase_ty = SubLObjectFactory.makeString("add PHRASE-TYPES to the phrase-types for INTERP");
        $sym69$GET_NL_INTERP_PHRASE_TYPES = SubLObjectFactory.makeSymbol("GET-NL-INTERP-PHRASE-TYPES");
        $str70$Returns_the_phrase_types_currentl = SubLObjectFactory.makeString("Returns the phrase-types currently specified on INTERP");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM-P")));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"));
        $sym73$SET_NL_INTERP_HEAD_INFLECTIONS = SubLObjectFactory.makeSymbol("SET-NL-INTERP-HEAD-INFLECTIONS");
        $str74$set_the_inflections__speech_part_ = SubLObjectFactory.makeString("set the inflections (speech-part-predicates) for INTERP to INFLECTIONS");
        $sym75$GET_NL_INTERP_HEAD_INFLECTIONS = SubLObjectFactory.makeSymbol("GET-NL-INTERP-HEAD-INFLECTIONS");
        $str76$returns_the_inflections_predicate = SubLObjectFactory.makeString("returns the inflections predicates that are used in the head word for this interpretation");
        $str77$NLInterpretation = SubLObjectFactory.makeString("NLInterpretation");
        $kw78$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str79$Cycl = SubLObjectFactory.makeString("Cycl");
        $str80$Weight = SubLObjectFactory.makeString("Weight");
        $str81$PhraseType = SubLObjectFactory.makeString("PhraseType");
        $str82$HeadInflection = SubLObjectFactory.makeString("HeadInflection");
        $str83$justification = SubLObjectFactory.makeString("justification");
        $str84$status = SubLObjectFactory.makeString("status");
        $str85$unimplemented = SubLObjectFactory.makeString("unimplemented");
    }
}

/*

	Total time: 331 ms
	
*/
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parameter_specification_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new parameter_specification_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.parameter_specification_utilities";

    public static final String myFingerPrint = "ddc3341a9be35f9e7f55de87f1206006dc6ec6b7560655f7d80e29e68582c735";

    private static final SubLList $list0 = list(reader_make_constant_shell(makeString("QueryFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("EL-SET")));

    private static final SubLSymbol EL_SET = makeSymbol("EL-SET");



    private static final SubLObject $const3$softwareParameterValueInSpecifica = reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    private static final SubLList $list4 = list(ONE_INTEGER, TWO_INTEGER);





    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$TheEmptySet = reader_make_constant_shell(makeString("TheEmptySet"));

    private static final SubLObject $$PlusInfinity = reader_make_constant_shell(makeString("PlusInfinity"));



    private static final SubLObject $$softwareParameterShortDescription = reader_make_constant_shell(makeString("softwareParameterShortDescription"));



    private static final SubLObject $$softwareParameterLongDescription = reader_make_constant_shell(makeString("softwareParameterLongDescription"));

    private static final SubLObject $const15$defaultSoftwareParameterValueInSo = reader_make_constant_shell(makeString("defaultSoftwareParameterValueInSoftwareObject"));

    private static final SubLObject $$subLIdentifier = reader_make_constant_shell(makeString("subLIdentifier"));

    private static final SubLObject $$CycAPIMt = reader_make_constant_shell(makeString("CycAPIMt"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    private static final SubLObject $const19$alternateSoftwareParameterValueIn = reader_make_constant_shell(makeString("alternateSoftwareParameterValueInSoftwareObject"));

    private static final SubLObject $const20$softwareParameterValueDomainInSof = reader_make_constant_shell(makeString("softwareParameterValueDomainInSoftwareObject"));

    private static final SubLObject $const21$softwareParameterValueShortDescri = reader_make_constant_shell(makeString("softwareParameterValueShortDescription"));

    private static final SubLObject $const22$softwareParameterValueLongDescrip = reader_make_constant_shell(makeString("softwareParameterValueLongDescription"));

    public static SubLObject parameter_specification_tuples(final SubLObject parameter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(parameter_spec, $list0);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject el_set = list_utilities.alist_lookup_without_values(v_bindings, EL_SET, UNPROVIDED, UNPROVIDED);
            SubLObject tuples = NIL;
            SubLObject cdolist_list_var = el_set_items(el_set);
            SubLObject el_list = NIL;
            el_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tuples = cons(el_list_items(el_list), tuples);
                cdolist_list_var = cdolist_list_var.rest();
                el_list = cdolist_list_var.first();
            } 
            return tuples;
        }
        assert NIL != forts.fort_p(parameter_spec) : "forts.fort_p(parameter_spec) " + "CommonSymbols.NIL != forts.fort_p(parameter_spec) " + parameter_spec;
        SubLObject tuples2 = kb_mapping_utilities.pred_value_tuples_in_any_mt(parameter_spec, $const3$softwareParameterValueInSpecifica, THREE_INTEGER, $list4, UNPROVIDED);
        tuples2 = delete_duplicates(tuples2, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
        return tuples2;
    }

    public static SubLObject parameter_from_keyword(final SubLObject keyword, final SubLObject domain) {
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, domain);
    }

    public static SubLObject keyword_from_parameter(final SubLObject parameter) {
        assert NIL != forts.fort_p(parameter) : "forts.fort_p(parameter) " + "CommonSymbols.NIL != forts.fort_p(parameter) " + parameter;
        return subl_identifier.sublid_from_cyc_entity(parameter);
    }

    public static SubLObject parse_standard_parameter_value(final SubLObject value) {
        if (value.eql($$False)) {
            return NIL;
        }
        if (value.eql($$True)) {
            return T;
        }
        if (value.eql($$TheEmptySet)) {
            return NIL;
        }
        if (value.eql($$PlusInfinity)) {
            return $POSITIVE_INFINITY;
        }
        if (NIL != subl_escape_p(value)) {
            return subl_escape_subl(value);
        }
        if (NIL != el_list_p(value)) {
            return el_list_items(value);
        }
        return value;
    }

    public static SubLObject encode_parameter_value(final SubLObject value) {
        if (value == NIL) {
            return $$False;
        }
        if (value == T) {
            return $$True;
        }
        if (value == $POSITIVE_INFINITY) {
            return $$PlusInfinity;
        }
        if (value.isKeyword()) {
            return make_cycl_subl_symbol(value);
        }
        if (value.isCons()) {
            return make_el_list(value, UNPROVIDED);
        }
        return value;
    }

    public static SubLObject software_parameter_short_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, $$softwareParameterShortDescription, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject software_parameter_long_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, $$softwareParameterLongDescription, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject software_parameter_default_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const15$defaultSoftwareParameterValueInSo, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $TRUE);
        if (NIL != gaf) {
            SubLObject default_value = assertions_high.gaf_arg2(gaf);
            if (NIL != forts.fort_p(default_value)) {
                thread.resetMultipleValues();
                final SubLObject v_subl_identifier = software_parameter_value_subl_identifier(default_value);
                final SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != foundP) {
                    default_value = v_subl_identifier;
                }
            }
            return default_value;
        }
        return NIL;
    }

    public static SubLObject software_parameter_value_subl_identifier(final SubLObject parameter) {
        final SubLObject value = kb_mapping_utilities.fpred_value_in_mt(parameter, $$subLIdentifier, $$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != el_formula_with_operator_p(value, $$SubLQuoteFn)) {
            return values(cycl_utilities.nat_arg1(value, UNPROVIDED), T);
        }
        return values(value, list_utilities.sublisp_boolean(value));
    }

    public static SubLObject software_parameter_alternate_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const19$alternateSoftwareParameterValueIn, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $TRUE);
        if (NIL != gaf) {
            return assertions_high.gaf_arg2(gaf);
        }
        return NIL;
    }

    public static SubLObject software_parameter_value_domain_in_software_object(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts($const20$softwareParameterValueDomainInSof, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $TRUE);
        if (NIL != gaf) {
            return assertions_high.gaf_arg2(gaf);
        }
        return NIL;
    }

    public static SubLObject software_parameter_value_short_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, $const21$softwareParameterValueShortDescri, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject software_parameter_value_long_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, $const22$softwareParameterValueLongDescrip, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject declare_parameter_specification_utilities_file() {
        declareFunction(me, "parameter_specification_tuples", "PARAMETER-SPECIFICATION-TUPLES", 1, 0, false);
        declareFunction(me, "parameter_from_keyword", "PARAMETER-FROM-KEYWORD", 2, 0, false);
        declareFunction(me, "keyword_from_parameter", "KEYWORD-FROM-PARAMETER", 1, 0, false);
        declareFunction(me, "parse_standard_parameter_value", "PARSE-STANDARD-PARAMETER-VALUE", 1, 0, false);
        declareFunction(me, "encode_parameter_value", "ENCODE-PARAMETER-VALUE", 1, 0, false);
        declareFunction(me, "software_parameter_short_description", "SOFTWARE-PARAMETER-SHORT-DESCRIPTION", 2, 0, false);
        declareFunction(me, "software_parameter_long_description", "SOFTWARE-PARAMETER-LONG-DESCRIPTION", 2, 0, false);
        declareFunction(me, "software_parameter_default_value", "SOFTWARE-PARAMETER-DEFAULT-VALUE", 3, 0, false);
        declareFunction(me, "software_parameter_value_subl_identifier", "SOFTWARE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false);
        declareFunction(me, "software_parameter_alternate_value", "SOFTWARE-PARAMETER-ALTERNATE-VALUE", 3, 0, false);
        declareFunction(me, "software_parameter_value_domain_in_software_object", "SOFTWARE-PARAMETER-VALUE-DOMAIN-IN-SOFTWARE-OBJECT", 3, 0, false);
        declareFunction(me, "software_parameter_value_short_description", "SOFTWARE-PARAMETER-VALUE-SHORT-DESCRIPTION", 2, 0, false);
        declareFunction(me, "software_parameter_value_long_description", "SOFTWARE-PARAMETER-VALUE-LONG-DESCRIPTION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_parameter_specification_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_parameter_specification_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parameter_specification_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_parameter_specification_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parameter_specification_utilities_file();
    }

    
}

/**
 * Total time: 96 ms
 */

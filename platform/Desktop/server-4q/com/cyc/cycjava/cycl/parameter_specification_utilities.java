package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parameter_specification_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.parameter_specification_utilities";
    public static final String myFingerPrint = "ddc3341a9be35f9e7f55de87f1206006dc6ec6b7560655f7d80e29e68582c735";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$EL_SET;
    private static final SubLSymbol $sym2$FORT_P;
    private static final SubLObject $const3$softwareParameterValueInSpecifica;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$FIRST;
    private static final SubLSymbol $sym6$KEYWORDP;
    private static final SubLObject $const7$False;
    private static final SubLObject $const8$True;
    private static final SubLObject $const9$TheEmptySet;
    private static final SubLObject $const10$PlusInfinity;
    private static final SubLSymbol $kw11$POSITIVE_INFINITY;
    private static final SubLObject $const12$softwareParameterShortDescription;
    private static final SubLSymbol $kw13$TRUE;
    private static final SubLObject $const14$softwareParameterLongDescription;
    private static final SubLObject $const15$defaultSoftwareParameterValueInSo;
    private static final SubLObject $const16$subLIdentifier;
    private static final SubLObject $const17$CycAPIMt;
    private static final SubLObject $const18$SubLQuoteFn;
    private static final SubLObject $const19$alternateSoftwareParameterValueIn;
    private static final SubLObject $const20$softwareParameterValueDomainInSof;
    private static final SubLObject $const21$softwareParameterValueShortDescri;
    private static final SubLObject $const22$softwareParameterValueLongDescrip;
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 932L)
    public static SubLObject parameter_specification_tuples(final SubLObject parameter_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(parameter_spec, (SubLObject)parameter_specification_utilities.$list0);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (parameter_specification_utilities.NIL != success) {
            final SubLObject el_set = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)parameter_specification_utilities.$sym1$EL_SET, (SubLObject)parameter_specification_utilities.UNPROVIDED, (SubLObject)parameter_specification_utilities.UNPROVIDED);
            SubLObject tuples = (SubLObject)parameter_specification_utilities.NIL;
            SubLObject cdolist_list_var = el_utilities.el_set_items(el_set);
            SubLObject el_list = (SubLObject)parameter_specification_utilities.NIL;
            el_list = cdolist_list_var.first();
            while (parameter_specification_utilities.NIL != cdolist_list_var) {
                tuples = (SubLObject)ConsesLow.cons(el_utilities.el_list_items(el_list), tuples);
                cdolist_list_var = cdolist_list_var.rest();
                el_list = cdolist_list_var.first();
            }
            return tuples;
        }
        assert parameter_specification_utilities.NIL != forts.fort_p(parameter_spec) : parameter_spec;
        SubLObject tuples2 = kb_mapping_utilities.pred_value_tuples_in_any_mt(parameter_spec, parameter_specification_utilities.$const3$softwareParameterValueInSpecifica, (SubLObject)parameter_specification_utilities.THREE_INTEGER, (SubLObject)parameter_specification_utilities.$list4, (SubLObject)parameter_specification_utilities.UNPROVIDED);
        tuples2 = Sequences.delete_duplicates(tuples2, Symbols.symbol_function((SubLObject)parameter_specification_utilities.EQ), Symbols.symbol_function((SubLObject)parameter_specification_utilities.$sym5$FIRST), (SubLObject)parameter_specification_utilities.UNPROVIDED, (SubLObject)parameter_specification_utilities.UNPROVIDED);
        return tuples2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1676L)
    public static SubLObject parameter_from_keyword(final SubLObject keyword, final SubLObject domain) {
        assert parameter_specification_utilities.NIL != Types.keywordp(keyword) : keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, domain);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1813L)
    public static SubLObject keyword_from_parameter(final SubLObject parameter) {
        assert parameter_specification_utilities.NIL != forts.fort_p(parameter) : parameter;
        return subl_identifier.sublid_from_cyc_entity(parameter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1940L)
    public static SubLObject parse_standard_parameter_value(final SubLObject value) {
        if (value.eql(parameter_specification_utilities.$const7$False)) {
            return (SubLObject)parameter_specification_utilities.NIL;
        }
        if (value.eql(parameter_specification_utilities.$const8$True)) {
            return (SubLObject)parameter_specification_utilities.T;
        }
        if (value.eql(parameter_specification_utilities.$const9$TheEmptySet)) {
            return (SubLObject)parameter_specification_utilities.NIL;
        }
        if (value.eql(parameter_specification_utilities.$const10$PlusInfinity)) {
            return (SubLObject)parameter_specification_utilities.$kw11$POSITIVE_INFINITY;
        }
        if (parameter_specification_utilities.NIL != el_utilities.subl_escape_p(value)) {
            return el_utilities.subl_escape_subl(value);
        }
        if (parameter_specification_utilities.NIL != el_utilities.el_list_p(value)) {
            return el_utilities.el_list_items(value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2324L)
    public static SubLObject encode_parameter_value(final SubLObject value) {
        if (value == parameter_specification_utilities.NIL) {
            return parameter_specification_utilities.$const7$False;
        }
        if (value == parameter_specification_utilities.T) {
            return parameter_specification_utilities.$const8$True;
        }
        if (value == parameter_specification_utilities.$kw11$POSITIVE_INFINITY) {
            return parameter_specification_utilities.$const10$PlusInfinity;
        }
        if (value.isKeyword()) {
            return el_utilities.make_cycl_subl_symbol(value);
        }
        if (value.isCons()) {
            return el_utilities.make_el_list(value, (SubLObject)parameter_specification_utilities.UNPROVIDED);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2666L)
    public static SubLObject software_parameter_short_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, parameter_specification_utilities.$const12$softwareParameterShortDescription, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2822L)
    public static SubLObject software_parameter_long_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, parameter_specification_utilities.$const14$softwareParameterLongDescription, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2976L)
    public static SubLObject software_parameter_default_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(parameter_specification_utilities.$const15$defaultSoftwareParameterValueInSo, parameter, software_object, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.THREE_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
        if (parameter_specification_utilities.NIL != gaf) {
            SubLObject default_value = assertions_high.gaf_arg2(gaf);
            if (parameter_specification_utilities.NIL != forts.fort_p(default_value)) {
                thread.resetMultipleValues();
                final SubLObject v_subl_identifier = software_parameter_value_subl_identifier(default_value);
                final SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (parameter_specification_utilities.NIL != foundP) {
                    default_value = v_subl_identifier;
                }
            }
            return default_value;
        }
        return (SubLObject)parameter_specification_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 3495L)
    public static SubLObject software_parameter_value_subl_identifier(final SubLObject parameter) {
        final SubLObject value = kb_mapping_utilities.fpred_value_in_mt(parameter, parameter_specification_utilities.$const16$subLIdentifier, parameter_specification_utilities.$const17$CycAPIMt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
        if (parameter_specification_utilities.NIL != el_utilities.el_formula_with_operator_p(value, parameter_specification_utilities.$const18$SubLQuoteFn)) {
            return Values.values(cycl_utilities.nat_arg1(value, (SubLObject)parameter_specification_utilities.UNPROVIDED), (SubLObject)parameter_specification_utilities.T);
        }
        return Values.values(value, list_utilities.sublisp_boolean(value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 3794L)
    public static SubLObject software_parameter_alternate_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(parameter_specification_utilities.$const19$alternateSoftwareParameterValueIn, parameter, software_object, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.THREE_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
        if (parameter_specification_utilities.NIL != gaf) {
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)parameter_specification_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4065L)
    public static SubLObject software_parameter_value_domain_in_software_object(final SubLObject parameter, final SubLObject software_object, final SubLObject mt) {
        final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(parameter_specification_utilities.$const20$softwareParameterValueDomainInSof, parameter, software_object, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.THREE_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
        if (parameter_specification_utilities.NIL != gaf) {
            return assertions_high.gaf_arg2(gaf);
        }
        return (SubLObject)parameter_specification_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4350L)
    public static SubLObject software_parameter_value_short_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, parameter_specification_utilities.$const21$softwareParameterValueShortDescri, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4519L)
    public static SubLObject software_parameter_value_long_description(final SubLObject parameter, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(parameter, parameter_specification_utilities.$const22$softwareParameterValueLongDescrip, mt, (SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER, (SubLObject)parameter_specification_utilities.$kw13$TRUE);
    }
    
    public static SubLObject declare_parameter_specification_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "parameter_specification_tuples", "PARAMETER-SPECIFICATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "parameter_from_keyword", "PARAMETER-FROM-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "keyword_from_parameter", "KEYWORD-FROM-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "parse_standard_parameter_value", "PARSE-STANDARD-PARAMETER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "encode_parameter_value", "ENCODE-PARAMETER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_short_description", "SOFTWARE-PARAMETER-SHORT-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_long_description", "SOFTWARE-PARAMETER-LONG-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_default_value", "SOFTWARE-PARAMETER-DEFAULT-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_value_subl_identifier", "SOFTWARE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_alternate_value", "SOFTWARE-PARAMETER-ALTERNATE-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_value_domain_in_software_object", "SOFTWARE-PARAMETER-VALUE-DOMAIN-IN-SOFTWARE-OBJECT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_value_short_description", "SOFTWARE-PARAMETER-VALUE-SHORT-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parameter_specification_utilities", "software_parameter_value_long_description", "SOFTWARE-PARAMETER-VALUE-LONG-DESCRIPTION", 2, 0, false);
        return (SubLObject)parameter_specification_utilities.NIL;
    }
    
    public static SubLObject init_parameter_specification_utilities_file() {
        return (SubLObject)parameter_specification_utilities.NIL;
    }
    
    public static SubLObject setup_parameter_specification_utilities_file() {
        return (SubLObject)parameter_specification_utilities.NIL;
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
    
    static {
        me = (SubLFile)new parameter_specification_utilities();
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SET")));
        $sym1$EL_SET = SubLObjectFactory.makeSymbol("EL-SET");
        $sym2$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const3$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $list4 = ConsesLow.list((SubLObject)parameter_specification_utilities.ONE_INTEGER, (SubLObject)parameter_specification_utilities.TWO_INTEGER);
        $sym5$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym6$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $const7$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const8$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const9$TheEmptySet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $const10$PlusInfinity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $kw11$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $const12$softwareParameterShortDescription = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterShortDescription"));
        $kw13$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const14$softwareParameterLongDescription = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterLongDescription"));
        $const15$defaultSoftwareParameterValueInSo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultSoftwareParameterValueInSoftwareObject"));
        $const16$subLIdentifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $const17$CycAPIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $const18$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $const19$alternateSoftwareParameterValueIn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("alternateSoftwareParameterValueInSoftwareObject"));
        $const20$softwareParameterValueDomainInSof = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueDomainInSoftwareObject"));
        $const21$softwareParameterValueShortDescri = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueShortDescription"));
        $const22$softwareParameterValueLongDescrip = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueLongDescription"));
    }
}

/*

	Total time: 96 ms
	
*/
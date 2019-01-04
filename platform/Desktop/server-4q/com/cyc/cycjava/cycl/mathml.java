package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mathml extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mathml";
    public static final String myFingerPrint = "1abbbb5ccd16a45db8574d36464824fb4dc1e23657eb4469e8dffe84a6723332";
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 910L)
    public static SubLSymbol $mathml_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 990L)
    private static SubLSymbol $mathml_stacked$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1074L)
    public static SubLSymbol $mathml_heavy_operatorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1748L)
    private static SubLSymbol $mathml_atom_map$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3406L)
    private static SubLSymbol $html_glyph_code_for_denot_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3704L)
    private static SubLSymbol $serializable_units_of_measure_mathml_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3852L)
    private static SubLSymbol $strike_and_replace_mathml_numerator_with$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3923L)
    private static SubLSymbol $strike_and_replace_mathml_denominator_with$;
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 18904L)
    private static SubLSymbol $mathml_demo_items$;
    private static final SubLString $str0$http___www_w3_org_1998_Math_MathM;
    private static final SubLSymbol $sym1$XML_TAG;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$XML_ELEMENT;
    private static final SubLString $str4$mrow;
    private static final SubLSymbol $sym5$PIF;
    private static final SubLSymbol $sym6$_MATHML_STACKED_;
    private static final SubLSymbol $sym7$PROGN;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLString $str11$math;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLString $str15$mo;
    private static final SubLString $str16$largeop;
    private static final SubLString $str17$true;
    private static final SubLString $str18$false;
    private static final SubLString $str19$mathvariant;
    private static final SubLString $str20$bold;
    private static final SubLString $str21$normal;
    private static final SubLSymbol $kw22$UNINITIALIZED;
    private static final SubLObject $const23$Pi_Number;
    private static final SubLString $str24$mi;
    private static final SubLString $str25$_pi_;
    private static final SubLObject $const26$TimeOfDay_PM;
    private static final SubLString $str27$PM;
    private static final SubLObject $const28$TimeOfDay_AM;
    private static final SubLString $str29$AM;
    private static final SubLSymbol $kw30$SPACE;
    private static final SubLString $str31$_;
    private static final SubLString $str32$_A;
    private static final SubLSymbol $sym33$HTML_GLYPH_CODE_FOR_DENOT;
    private static final SubLObject $const34$htmlGlyphCode;
    private static final SubLObject $const35$symbolDenotes;
    private static final SubLSymbol $sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_;
    private static final SubLSymbol $sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT;
    private static final SubLSymbol $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML;
    private static final SubLObject $const39$CompoundDurationFn;
    private static final SubLObject $const40$UnitOfMeasure;
    private static final SubLSymbol $sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLObject $const45$singular;
    private static final SubLObject $const46$plural;
    private static final SubLString $str47$mspace;
    private static final SubLString $str48$width;
    private static final SubLString $str49$_5em;
    private static final SubLList $list50;
    private static final SubLObject $const51$MathQuantFn;
    private static final SubLObject $const52$MathLongDivisionStatementFn;
    private static final SubLObject $const53$MathVarFn;
    private static final SubLObject $const54$ParenthesizedMathFn;
    private static final SubLString $str55$mfenced;
    private static final SubLObject $const56$BracketedMathFn;
    private static final SubLList $list57;
    private static final SubLObject $const58$PowerExpressionFn;
    private static final SubLString $str59$msup;
    private static final SubLObject $const60$PrefixMinusFn;
    private static final SubLObject $const61$AbsoluteValueExpressionFn;
    private static final SubLString $str62$_;
    private static final SubLObject $const63$PaddedExpressionFn;
    private static final SubLString $str64$msgroup;
    private static final SubLString $str65$position;
    private static final SubLObject $const66$MathExpressionFn;
    private static final SubLObject $const67$HorizontalDivideFn;
    private static final SubLString $str68$mfrac;
    private static final SubLObject $const69$NthRootExpressionFn;
    private static final SubLList $list70;
    private static final SubLString $str71$msqrt;
    private static final SubLString $str72$mroot;
    private static final SubLObject $const73$MixedFractionFn;
    private static final SubLString $str74$mn;
    private static final SubLObject $const75$NegativeMixedFractionFn;
    private static final SubLObject $const76$SimpleFractionFn;
    private static final SubLObject $const77$DecimalFractionFn;
    private static final SubLObject $const78$StrikeNumeratorAndReplaceWithFn;
    private static final SubLObject $const79$StrikeDenominatorAndReplaceWithFn;
    private static final SubLObject $const80$InfixSlashDivideFn;
    private static final SubLList $list81;
    private static final SubLObject $const82$FunctionOfVarsFn;
    private static final SubLString $str83$_;
    private static final SubLString $str84$_;
    private static final SubLString $str85$_;
    private static final SubLObject $const86$TimeExpressionFn;
    private static final SubLString $str87$_;
    private static final SubLString $str88$_2__0d;
    private static final SubLSymbol $sym89$GENERATE_PHRASE;
    private static final SubLObject $const90$MathStackedEqualsStatementFn;
    private static final SubLSymbol $kw91$IGNORE;
    private static final SubLString $str92$msline;
    private static final SubLString $str93$mstack;
    private static final SubLObject $const94$InsertNumberAtDigitsFn;
    private static final SubLObject $const95$StrikeAndReplaceDigitsFn;
    private static final SubLString $str96$Can_t_serialize__S_expressions_;
    private static final SubLList $list97;
    private static final SubLString $str98$Can_t_compute_digit_count_of__A;
    private static final SubLList $list99;
    private static final SubLString $str100$menclose;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLString $str103$notation;
    private static final SubLString $str104$updiagonalstrike;
    private static final SubLObject $const105$StackedAdditionExpressionFn;
    private static final SubLObject $const106$InfixPlusFn;
    private static final SubLObject $const107$StackedMultiplicationExpressionFn;
    private static final SubLObject $const108$InfixTimesFn;
    private static final SubLObject $const109$StackedSubtractionExpressionFn;
    private static final SubLObject $const110$InfixMinusFn;
    private static final SubLString $str111$Unable_to_serialize_simple_stacke;
    private static final SubLString $str112$msrow;
    private static final SubLList $list113;
    private static final SubLString $str114$mscarries;
    private static final SubLString $str115$none;
    private static final SubLList $list116;
    private static final SubLString $str117$mscarry;
    private static final SubLList $list118;
    private static final SubLString $str119$mlongdiv;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLString $str123$length;
    private static final SubLObject $list124;
    private static final SubLSymbol $sym125$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const126$EverythingPSC;
    private static final SubLObject $const127$mathExpressionNATRenderAs;
    private static final SubLSymbol $kw128$GAF;
    private static final SubLList $list129;
    private static final SubLString $str130$background_color__;
    private static final SubLString $str131$CycL;
    private static final SubLString $str132$HTML;
    private static final SubLString $str133$MathML;
    private static final SubLInteger $int134$32;
    private static final SubLSymbol $sym135$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym136$SERIALIZE_MATHML_TO_STRING;
    private static final SubLSymbol $kw137$TEST;
    private static final SubLSymbol $kw138$OWNER;
    private static final SubLSymbol $kw139$CLASSES;
    private static final SubLSymbol $kw140$KB;
    private static final SubLSymbol $kw141$FULL;
    private static final SubLSymbol $kw142$WORKING_;
    private static final SubLList $list143;
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1192L)
    public static SubLObject serializing_mathml(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)mathml.$sym1$XML_TAG, (SubLObject)mathml.$list2, ConsesLow.append(body, (SubLObject)mathml.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1341L)
    public static SubLObject mathml_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)mathml.$sym3$XML_ELEMENT, (SubLObject)mathml.$str4$mrow, (SubLObject)mathml.NIL, ConsesLow.append(body, (SubLObject)mathml.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1427L)
    public static SubLObject with_stacked_math(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)mathml.$sym5$PIF, (SubLObject)mathml.$sym6$_MATHML_STACKED_, reader.bq_cons((SubLObject)mathml.$sym7$PROGN, ConsesLow.append(body, (SubLObject)mathml.NIL)), (SubLObject)ConsesLow.list((SubLObject)mathml.$sym8$CLET, (SubLObject)mathml.$list9, (SubLObject)ConsesLow.list((SubLObject)mathml.$sym1$XML_TAG, (SubLObject)mathml.$list10, reader.bq_cons((SubLObject)mathml.$sym7$PROGN, ConsesLow.append(body, (SubLObject)mathml.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 1625L)
    public static SubLObject serialize_mathml(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str11$math, (SubLObject)mathml.$list12, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, mathml.$mathml_namespace$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(mathml.$mathml_namespace$.getGlobalValue(), thread);
                    xml_utilities.xml_terpri();
                    serialize_mathml_int(obj);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str11$math);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 2638L)
    public static SubLObject lookup_mathml_atom(final SubLObject obj) {
        return list_utilities.alist_lookup(mathml.$mathml_atom_map$.getGlobalValue(), obj, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 2726L)
    public static SubLObject serialize_mathml_atom(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = lookup_mathml_atom(obj);
        if (mathml.NIL != data) {
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject markup = (SubLObject)mathml.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list14);
            markup = current.first();
            current = current.rest();
            final SubLObject comment = (SubLObject)(current.isCons() ? current.first() : mathml.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)mathml.$list14);
            current = current.rest();
            if (mathml.NIL == current) {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str15$mo, (SubLObject)ConsesLow.list((SubLObject)mathml.$str16$largeop, (SubLObject)((mathml.NIL != mathml.$mathml_heavy_operatorsP$.getDynamicValue(thread)) ? mathml.$str17$true : mathml.$str18$false), (SubLObject)mathml.$str19$mathvariant, (SubLObject)((mathml.NIL != mathml.$mathml_heavy_operatorsP$.getDynamicValue(thread)) ? mathml.$str20$bold : mathml.$str21$normal)), (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            xml_utilities.xml_markup(markup);
                            if (mathml.NIL != comment) {
                                xml_utilities.xml_comment(comment);
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str15$mo);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mathml.$list14);
            }
        }
        else if (mathml.$const23$Pi_Number.eql(obj)) {
            try {
                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str24$mi, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                        xml_utilities.xml_markup((SubLObject)mathml.$str25$_pi_);
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str24$mi);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                }
            }
        }
        else if (mathml.$const26$TimeOfDay_PM.eql(obj)) {
            xml_utilities.xml_print((SubLObject)mathml.$str27$PM, (SubLObject)mathml.UNPROVIDED);
        }
        else if (mathml.$const28$TimeOfDay_AM.eql(obj)) {
            xml_utilities.xml_print((SubLObject)mathml.$str29$AM, (SubLObject)mathml.UNPROVIDED);
        }
        else if (mathml.$kw30$SPACE == obj) {
            xml_utilities.xml_print((SubLObject)mathml.$str31$_, (SubLObject)mathml.UNPROVIDED);
        }
        else {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)mathml.$str32$_A, obj);
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3406L)
    public static SubLObject clear_html_glyph_code_for_denot() {
        final SubLObject cs = mathml.$html_glyph_code_for_denot_caching_state$.getGlobalValue();
        if (mathml.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3406L)
    public static SubLObject remove_html_glyph_code_for_denot(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args(mathml.$html_glyph_code_for_denot_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(obj), (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3406L)
    public static SubLObject html_glyph_code_for_denot_internal(final SubLObject obj) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(obj, mathml.$const35$symbolDenotes, (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.UNPROVIDED);
        SubLObject symbol = (SubLObject)mathml.NIL;
        symbol = cdolist_list_var.first();
        while (mathml.NIL != cdolist_list_var) {
            final SubLObject glyph_code = kb_mapping_utilities.fpred_value_in_any_mt(symbol, mathml.$const34$htmlGlyphCode, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
            if (mathml.NIL != glyph_code) {
                return glyph_code;
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3406L)
    public static SubLObject html_glyph_code_for_denot(final SubLObject obj) {
        SubLObject caching_state = mathml.$html_glyph_code_for_denot_caching_state$.getGlobalValue();
        if (mathml.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)mathml.$sym33$HTML_GLYPH_CODE_FOR_DENOT, (SubLObject)mathml.$sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_, (SubLObject)mathml.NIL, (SubLObject)mathml.EQUAL, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)mathml.$sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_glyph_code_for_denot_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)mathml.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3704L)
    public static SubLObject clear_serializable_units_of_measure_mathml() {
        final SubLObject cs = mathml.$serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
        if (mathml.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3704L)
    public static SubLObject remove_serializable_units_of_measure_mathml() {
        return memoization_state.caching_state_remove_function_results_with_args(mathml.$serializable_units_of_measure_mathml_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mathml.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3704L)
    public static SubLObject serializable_units_of_measure_mathml_internal() {
        return Sequences.remove(mathml.$const39$CompoundDurationFn, isa.all_instances_in_all_mts(mathml.$const40$UnitOfMeasure), (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3704L)
    public static SubLObject serializable_units_of_measure_mathml() {
        SubLObject caching_state = mathml.$serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
        if (mathml.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)mathml.$sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML, (SubLObject)mathml.$sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_, (SubLObject)mathml.NIL, (SubLObject)mathml.EQL, (SubLObject)mathml.ZERO_INTEGER, (SubLObject)mathml.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)mathml.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(serializable_units_of_measure_mathml_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)mathml.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 3995L)
    public static SubLObject serialize_mathml_int(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mathml.NIL != collection_defns.cycl_atomic_term_p(obj)) {
            serialize_mathml_atom(obj);
        }
        else {
            final SubLObject arg0 = cycl_utilities.formula_arg0(obj);
            if (mathml.NIL != subl_promotions.memberP(arg0, (SubLObject)mathml.$list42, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED)) {
                final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                serialize_mathml_int(arg0);
                serialize_mathml_int(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                xml_utilities.xml_end_tag_internal(name_var);
            }
            else if (mathml.NIL != subl_promotions.memberP(arg0, (SubLObject)mathml.$list43, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED)) {
                final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                SubLObject cdolist_list_var = cycl_utilities.formula_args(obj, (SubLObject)mathml.UNPROVIDED).rest();
                SubLObject arg2 = (SubLObject)mathml.NIL;
                arg2 = cdolist_list_var.first();
                while (mathml.NIL != cdolist_list_var) {
                    serialize_mathml_int(arg0);
                    serialize_mathml_int(arg2);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg2 = cdolist_list_var.first();
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
            else if (mathml.NIL != conses_high.member(arg0, (SubLObject)mathml.$list44, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED)) {
                serialize_mathml_simple_stacked_math_expression(obj);
            }
            else if (mathml.NIL != subl_promotions.memberP(narts_high.nart_substitute(arg0), serializable_units_of_measure_mathml(), Symbols.symbol_function((SubLObject)mathml.EQUAL), (SubLObject)mathml.UNPROVIDED)) {
                final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                serialize_mathml_quantity((SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED)));
                final SubLObject number = cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED);
                final SubLObject agr = number.eql((SubLObject)mathml.ONE_INTEGER) ? mathml.$const45$singular : mathml.$const46$plural;
                final SubLObject unit_string = pph_main.generate_phrase(arg0, (SubLObject)ConsesLow.list(agr), (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str47$mspace, (SubLObject)ConsesLow.list((SubLObject)mathml.$str48$width, (SubLObject)mathml.$str49$_5em), (SubLObject)mathml.T, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str24$mi, (SubLObject)mathml.$list50, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), unit_string);
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str24$mi);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
            else {
                final SubLObject pcase_var = arg0;
                if (pcase_var.eql(mathml.$const51$MathQuantFn)) {
                    serialize_mathml_quantity(cycl_utilities.nat_args(obj, (SubLObject)mathml.UNPROVIDED));
                }
                else if (pcase_var.eql(mathml.$const52$MathLongDivisionStatementFn)) {
                    serialize_mathml_long_division(obj);
                }
                else if (pcase_var.eql(mathml.$const53$MathVarFn)) {
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str24$mi, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str24$mi);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                        }
                    }
                }
                else if (pcase_var.eql(mathml.$const54$ParenthesizedMathFn)) {
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str55$mfenced, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                final SubLObject name_var2 = (SubLObject)mathml.$str4$mrow;
                                xml_utilities.xml_start_tag_internal(name_var2, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                xml_utilities.xml_end_tag_internal(name_var2);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str55$mfenced);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
                        }
                    }
                }
                else if (pcase_var.eql(mathml.$const56$BracketedMathFn)) {
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str55$mfenced, (SubLObject)mathml.$list57, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                final SubLObject name_var2 = (SubLObject)mathml.$str4$mrow;
                                xml_utilities.xml_start_tag_internal(name_var2, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                xml_utilities.xml_end_tag_internal(name_var2);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str55$mfenced);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_8, thread);
                        }
                    }
                }
                else if (pcase_var.eql(mathml.$const58$PowerExpressionFn)) {
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str59$msup, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                serialize_mathml_int(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str59$msup);
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                        }
                    }
                }
                else if (pcase_var.eql(mathml.$const60$PrefixMinusFn)) {
                    final SubLObject name_var3 = (SubLObject)mathml.$str4$mrow;
                    xml_utilities.xml_start_tag_internal(name_var3, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                    serialize_mathml_int(arg0);
                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                    xml_utilities.xml_end_tag_internal(name_var3);
                }
                else if (pcase_var.eql(mathml.$const61$AbsoluteValueExpressionFn)) {
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str15$mo, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)mathml.$str62$_);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values6 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str15$mo);
                            Values.restoreValuesFromVector(_values6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                        }
                    }
                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                    try {
                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str15$mo, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)mathml.$str62$_);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values7 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str15$mo);
                            Values.restoreValuesFromVector(_values7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_11, thread);
                        }
                    }
                }
                else if (pcase_var.eql(mathml.$const63$PaddedExpressionFn)) {
                    final SubLObject position = cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED);
                    try {
                        final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str64$msgroup, (SubLObject)ConsesLow.list((SubLObject)mathml.$str65$position, position), (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values8 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str64$msgroup);
                            Values.restoreValuesFromVector(_values8);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
                        }
                    }
                }
                else {
                    if (pcase_var.eql(mathml.$const66$MathExpressionFn)) {
                        return serialize_mathml_int(math_expression_utilities.infix_math_expression_to_prefix_format(obj));
                    }
                    if (pcase_var.eql(mathml.$const67$HorizontalDivideFn)) {
                        try {
                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str68$mfrac, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                    serialize_mathml_int(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values9 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str68$mfrac);
                                Values.restoreValuesFromVector(_values9);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const69$NthRootExpressionFn)) {
                        if (cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED).equal((SubLObject)mathml.$list70)) {
                            try {
                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str71$msqrt, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                        serialize_mathml_int(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                    final SubLObject _values10 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str71$msqrt);
                                    Values.restoreValuesFromVector(_values10);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                                }
                            }
                        }
                        else {
                            try {
                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str72$mroot, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                        serialize_mathml_int(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                                        serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                    final SubLObject _values11 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str72$mroot);
                                    Values.restoreValuesFromVector(_values11);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_17, thread);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const73$MixedFractionFn)) {
                        final SubLObject name_var3 = (SubLObject)mathml.$str4$mrow;
                        xml_utilities.xml_start_tag_internal(name_var3, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values12 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values12);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_18, thread);
                            }
                        }
                        serialize_mathml_simple_fraction(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED), cycl_utilities.nat_arg3(obj, (SubLObject)mathml.UNPROVIDED));
                        xml_utilities.xml_end_tag_internal(name_var3);
                    }
                    else if (pcase_var.eql(mathml.$const75$NegativeMixedFractionFn)) {
                        serialize_mathml_int(el_utilities.make_unary_formula(mathml.$const51$MathQuantFn, el_utilities.make_unary_formula(mathml.$const60$PrefixMinusFn, el_utilities.make_el_formula(mathml.$const73$MixedFractionFn, cycl_utilities.nat_args(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.UNPROVIDED))));
                    }
                    else if (pcase_var.eql(mathml.$const76$SimpleFractionFn)) {
                        serialize_mathml_simple_fraction(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED), cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                    }
                    else if (pcase_var.eql(mathml.$const77$DecimalFractionFn)) {
                        serialize_mathml_decimal(obj);
                    }
                    else if (pcase_var.eql(mathml.$const78$StrikeNumeratorAndReplaceWithFn)) {
                        final SubLObject _prev_bind_4 = mathml.$strike_and_replace_mathml_numerator_with$.currentBinding(thread);
                        try {
                            mathml.$strike_and_replace_mathml_numerator_with$.bind(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED), thread);
                            serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                        }
                        finally {
                            mathml.$strike_and_replace_mathml_numerator_with$.rebind(_prev_bind_4, thread);
                        }
                    }
                    else if (pcase_var.eql(mathml.$const79$StrikeDenominatorAndReplaceWithFn)) {
                        final SubLObject _prev_bind_4 = mathml.$strike_and_replace_mathml_denominator_with$.currentBinding(thread);
                        try {
                            mathml.$strike_and_replace_mathml_denominator_with$.bind(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED), thread);
                            serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                        }
                        finally {
                            mathml.$strike_and_replace_mathml_denominator_with$.rebind(_prev_bind_4, thread);
                        }
                    }
                    else if (pcase_var.eql(mathml.$const80$InfixSlashDivideFn)) {
                        try {
                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str68$mfrac, (SubLObject)mathml.$list81, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                    serialize_mathml_int(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values13 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str68$mfrac);
                                Values.restoreValuesFromVector(_values13);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_19, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const82$FunctionOfVarsFn)) {
                        try {
                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str24$mi, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)mathml.$str32$_A, cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values14 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str24$mi);
                                Values.restoreValuesFromVector(_values14);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_20, thread);
                            }
                        }
                        serialize_mathml_int(arg0);
                        try {
                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str15$mo, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup((SubLObject)mathml.$str83$_);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values15 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str15$mo);
                                Values.restoreValuesFromVector(_values15);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_21, thread);
                            }
                        }
                        SubLObject list_var = (SubLObject)mathml.NIL;
                        SubLObject arg2 = (SubLObject)mathml.NIL;
                        SubLObject num = (SubLObject)mathml.NIL;
                        list_var = cycl_utilities.nat_args(obj, (SubLObject)mathml.UNPROVIDED).rest();
                        arg2 = list_var.first();
                        for (num = (SubLObject)mathml.ZERO_INTEGER; mathml.NIL != list_var; list_var = list_var.rest(), arg2 = list_var.first(), num = Numbers.add((SubLObject)mathml.ONE_INTEGER, num)) {
                            if (!num.numE((SubLObject)mathml.ZERO_INTEGER)) {
                                xml_utilities.xml_markup((SubLObject)mathml.$str84$_);
                            }
                            serialize_mathml_int(arg2);
                        }
                        try {
                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str15$mo, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup((SubLObject)mathml.$str85$_);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values16 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str15$mo);
                                Values.restoreValuesFromVector(_values16);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_22, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const86$TimeExpressionFn)) {
                        serialize_mathml_int(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED));
                        xml_utilities.xml_print((SubLObject)mathml.$str87$_, (SubLObject)mathml.UNPROVIDED);
                        serialize_mathml_int(PrintLow.format((SubLObject)mathml.NIL, (SubLObject)mathml.$str88$_2__0d, cycl_utilities.formula_arg3(obj, (SubLObject)mathml.UNPROVIDED)));
                        if (mathml.NIL != cycl_utilities.formula_arg4(obj, (SubLObject)mathml.UNPROVIDED)) {
                            xml_utilities.xml_print((SubLObject)mathml.$str87$_, (SubLObject)mathml.UNPROVIDED);
                            serialize_mathml_int(PrintLow.format((SubLObject)mathml.NIL, (SubLObject)mathml.$str88$_2__0d, cycl_utilities.formula_arg4(obj, (SubLObject)mathml.UNPROVIDED)));
                        }
                        serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                    }
                    else if (pcase_var.eql(mathml.$const39$CompoundDurationFn)) {
                        final SubLObject strings = Mapping.mapcar((SubLObject)mathml.$sym89$GENERATE_PHRASE, cycl_utilities.formula_args(obj, (SubLObject)mathml.UNPROVIDED));
                        try {
                            final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    xml_utilities.xml_markup(string_utilities.join_strings(strings, (SubLObject)mathml.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values17 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values17);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_23, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const90$MathStackedEqualsStatementFn)) {
                        if (mathml.NIL != mathml.$mathml_stacked$.getDynamicValue(thread)) {
                            SubLObject arg_num = (SubLObject)mathml.ZERO_INTEGER;
                            SubLObject cdolist_list_var2;
                            final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(obj, (SubLObject)mathml.$kw91$IGNORE);
                            SubLObject arg3 = (SubLObject)mathml.NIL;
                            arg3 = cdolist_list_var2.first();
                            while (mathml.NIL != cdolist_list_var2) {
                                arg_num = Numbers.add(arg_num, (SubLObject)mathml.ONE_INTEGER);
                                if (!arg_num.eql((SubLObject)mathml.ONE_INTEGER)) {
                                    try {
                                        final SubLObject _prev_bind_24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str92$msline, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_25, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_24, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                            final SubLObject _values18 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str92$msline);
                                            Values.restoreValuesFromVector(_values18);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_26, thread);
                                        }
                                    }
                                }
                                serialize_mathml_int(arg3);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg3 = cdolist_list_var2.first();
                            }
                        }
                        else {
                            final SubLObject _prev_bind_4 = mathml.$mathml_stacked$.currentBinding(thread);
                            try {
                                mathml.$mathml_stacked$.bind((SubLObject)mathml.T, thread);
                                try {
                                    final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str93$mstack, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                            SubLObject arg_num2 = (SubLObject)mathml.ZERO_INTEGER;
                                            SubLObject cdolist_list_var3;
                                            final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(obj, (SubLObject)mathml.$kw91$IGNORE);
                                            SubLObject arg4 = (SubLObject)mathml.NIL;
                                            arg4 = cdolist_list_var3.first();
                                            while (mathml.NIL != cdolist_list_var3) {
                                                arg_num2 = Numbers.add(arg_num2, (SubLObject)mathml.ONE_INTEGER);
                                                if (!arg_num2.eql((SubLObject)mathml.ONE_INTEGER)) {
                                                    try {
                                                        final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str92$msline, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                                            final SubLObject _values19 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str92$msline);
                                                            Values.restoreValuesFromVector(_values19);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                                        }
                                                    }
                                                }
                                                serialize_mathml_int(arg4);
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                arg4 = cdolist_list_var3.first();
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                        final SubLObject _values20 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str93$mstack);
                                        Values.restoreValuesFromVector(_values20);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                            finally {
                                mathml.$mathml_stacked$.rebind(_prev_bind_4, thread);
                            }
                        }
                    }
                    else if (pcase_var.eql(mathml.$const94$InsertNumberAtDigitsFn)) {
                        serialize_mathml_carries(obj);
                    }
                    else if (pcase_var.eql(mathml.$const95$StrikeAndReplaceDigitsFn)) {
                        serialize_mathml_strikethrough(obj);
                    }
                    else {
                        Errors.error((SubLObject)mathml.$str96$Can_t_serialize__S_expressions_, arg0);
                    }
                }
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 9664L)
    public static SubLObject math_expr_digit_count(final SubLObject obj) {
        if (obj.isNumber()) {
            return Sequences.length(format_nil.format_nil_a(obj));
        }
        if (cycl_utilities.formula_arg0(obj).eql(mathml.$const51$MathQuantFn) && cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED).isNumber()) {
            return Sequences.length(format_nil.format_nil_a(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED)));
        }
        if (cycl_utilities.formula_arg0(obj).eql(mathml.$const63$PaddedExpressionFn)) {
            return Numbers.add(Numbers.abs(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED)), math_expr_digit_count(cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED)));
        }
        if (cycl_utilities.formula_arg0(obj).eql(mathml.$const51$MathQuantFn) && cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED)).eql(mathml.$const77$DecimalFractionFn)) {
            if (mathml.NIL != cycl_utilities.formula_arg((SubLObject)mathml.TWO_INTEGER, cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.UNPROVIDED) && cycl_utilities.formula_arg((SubLObject)mathml.TWO_INTEGER, cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.UNPROVIDED).numG((SubLObject)mathml.ZERO_INTEGER)) {
                return Numbers.add((SubLObject)mathml.ONE_INTEGER, math_expr_digit_count(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.UNPROVIDED)));
            }
            return math_expr_digit_count(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.UNPROVIDED));
        }
        else {
            if (cycl_utilities.formula_arg0(obj).eql(mathml.$const94$InsertNumberAtDigitsFn)) {
                return math_expr_digit_count(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
            }
            if (mathml.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(obj), (SubLObject)mathml.$list97, (SubLObject)mathml.EQUAL, (SubLObject)mathml.UNPROVIDED)) {
                SubLObject max = (SubLObject)mathml.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(obj, (SubLObject)mathml.$kw91$IGNORE);
                SubLObject arg = (SubLObject)mathml.NIL;
                arg = cdolist_list_var.first();
                while (mathml.NIL != cdolist_list_var) {
                    final SubLObject digit_count = math_expr_digit_count(arg);
                    max = Numbers.max(max, digit_count);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return max;
            }
            Errors.error((SubLObject)mathml.$str98$Can_t_compute_digit_count_of__A, obj);
            return (SubLObject)mathml.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 10855L)
    public static SubLObject serialize_mathml_decimal(final SubLObject obj) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(obj, (SubLObject)mathml.UNPROVIDED);
        SubLObject integer = (SubLObject)mathml.NIL;
        SubLObject backward_decimal_location = (SubLObject)mathml.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list99);
        integer = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list99);
        backward_decimal_location = current.first();
        current = current.rest();
        final SubLObject repeating_count = (SubLObject)(current.isCons() ? current.first() : mathml.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)mathml.$list99);
        current = current.rest();
        if (mathml.NIL == current) {
            final SubLObject integer_string = print_high.princ_to_string(integer);
            return (mathml.NIL != repeating_count) ? serialize_mathml_repeating_decimal(integer_string, backward_decimal_location, repeating_count) : serialize_mathml_non_repeating_decimal(integer_string, backward_decimal_location);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mathml.$list99);
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 11286L)
    public static SubLObject serialize_mathml_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location, final SubLObject repeating_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject repeat_start = Numbers.subtract(Sequences.length(integer_string), repeating_count);
        final SubLObject repeating_string = string_utilities.substring(integer_string, repeat_start, (SubLObject)mathml.UNPROVIDED);
        final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
        serialize_mathml_non_repeating_decimal(string_utilities.substring(integer_string, (SubLObject)mathml.ZERO_INTEGER, repeat_start), backward_decimal_location);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str100$menclose, (SubLObject)mathml.$list101, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                xml_utilities.xml_print(repeating_string, (SubLObject)mathml.UNPROVIDED);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str100$menclose);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal(name_var);
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 12255L)
    public static SubLObject serialize_mathml_non_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject decimal_location = Numbers.subtract(Sequences.length(integer_string), backward_decimal_location);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                    SubLObject end_var_$35;
                    SubLObject end_var;
                    SubLObject char_num;
                    SubLObject v_char;
                    for (end_var = (end_var_$35 = Sequences.length(integer_string)), char_num = (SubLObject)mathml.NIL, char_num = (SubLObject)mathml.ZERO_INTEGER; !char_num.numGE(end_var_$35); char_num = number_utilities.f_1X(char_num)) {
                        v_char = Strings.sublisp_char(integer_string, char_num);
                        if (char_num.eql(decimal_location)) {
                            xml_utilities.xml_print((SubLObject)Characters.CHAR_period, (SubLObject)mathml.UNPROVIDED);
                        }
                        xml_utilities.xml_print(v_char, (SubLObject)mathml.UNPROVIDED);
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 12654L)
    public static SubLObject serialize_mathml_quantity(final SubLObject quantity_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_free_arg = quantity_args.isList() ? Sequences.remove((SubLObject)mathml.$kw30$SPACE, quantity_args, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED).first() : quantity_args;
        if (keyword_free_arg.isNumber()) {
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = quantity_args;
                        SubLObject arg = (SubLObject)mathml.NIL;
                        arg = cdolist_list_var.first();
                        while (mathml.NIL != cdolist_list_var) {
                            serialize_mathml_int(arg);
                            cdolist_list_var = cdolist_list_var.rest();
                            arg = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            xml_utilities.xml_terpri();
        }
        else if (mathml.NIL != formula_pattern_match.formula_matches_pattern(keyword_free_arg, (SubLObject)mathml.$list102)) {
            serialize_mathml_int((SubLObject)ConsesLow.list(mathml.$const60$PrefixMinusFn, (SubLObject)ConsesLow.list(mathml.$const51$MathQuantFn, cycl_utilities.nat_arg1(keyword_free_arg, (SubLObject)mathml.UNPROVIDED))));
        }
        else {
            SubLObject cdolist_list_var2 = quantity_args;
            SubLObject arg2 = (SubLObject)mathml.NIL;
            arg2 = cdolist_list_var2.first();
            while (mathml.NIL != cdolist_list_var2) {
                serialize_mathml_int(arg2);
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg2 = cdolist_list_var2.first();
            }
        }
        return quantity_args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 13465L)
    public static SubLObject serialize_mathml_simple_fraction(final SubLObject numerator, final SubLObject denominator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str68$mfrac, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                    if (mathml.NIL != mathml.$strike_and_replace_mathml_numerator_with$.getDynamicValue(thread)) {
                        final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
                        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                        final SubLObject name_var_$38 = (SubLObject)mathml.$str100$menclose;
                        xml_utilities.xml_start_tag_internal(name_var_$38, (SubLObject)ConsesLow.list((SubLObject)mathml.$str103$notation, (SubLObject)mathml.$str104$updiagonalstrike), (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(numerator);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$38);
                        try {
                            final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(mathml.$strike_and_replace_mathml_numerator_with$.getDynamicValue(thread));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    }
                    else {
                        try {
                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(numerator);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                    }
                    if (mathml.NIL != mathml.$strike_and_replace_mathml_denominator_with$.getDynamicValue(thread)) {
                        final SubLObject name_var = (SubLObject)mathml.$str4$mrow;
                        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                        final SubLObject name_var_$39 = (SubLObject)mathml.$str100$menclose;
                        xml_utilities.xml_start_tag_internal(name_var_$39, (SubLObject)ConsesLow.list((SubLObject)mathml.$str103$notation, (SubLObject)mathml.$str104$updiagonalstrike), (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(denominator);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$43, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$39);
                        try {
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(mathml.$strike_and_replace_mathml_denominator_with$.getDynamicValue(thread));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$44, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    }
                    else {
                        try {
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                    serialize_mathml_int(denominator);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str74$mn);
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values7 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str68$mfrac);
                Values.restoreValuesFromVector(_values7);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 14292L)
    public static SubLObject serialize_mathml_simple_stacked_math_expression(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)mathml.NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(obj);
        if (pcase_var.eql(mathml.$const105$StackedAdditionExpressionFn)) {
            operator = mathml.$const106$InfixPlusFn;
        }
        else if (pcase_var.eql(mathml.$const107$StackedMultiplicationExpressionFn)) {
            operator = mathml.$const108$InfixTimesFn;
        }
        else if (pcase_var.eql(mathml.$const109$StackedSubtractionExpressionFn)) {
            operator = mathml.$const110$InfixMinusFn;
        }
        else {
            Errors.error((SubLObject)mathml.$str111$Unable_to_serialize_simple_stacke, obj);
        }
        if (mathml.NIL != mathml.$mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject v_arity = el_utilities.formula_arity(obj, (SubLObject)mathml.UNPROVIDED);
            SubLObject arg_num = (SubLObject)mathml.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(obj, (SubLObject)mathml.$kw91$IGNORE);
            SubLObject arg = (SubLObject)mathml.NIL;
            arg = cdolist_list_var.first();
            while (mathml.NIL != cdolist_list_var) {
                arg_num = Numbers.add(arg_num, (SubLObject)mathml.ONE_INTEGER);
                if (arg_num.eql((SubLObject)mathml.ONE_INTEGER)) {
                    if (arg_num.eql(v_arity)) {
                        serialize_mathml_int(operator);
                    }
                    serialize_mathml_int(arg);
                }
                else if (arg_num.eql(v_arity) && mathml.NIL == padded_expression_p(arg)) {
                    try {
                        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str112$msrow, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$64 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                serialize_mathml_int(operator);
                                serialize_mathml_int(arg);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$64, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str112$msrow);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
                else {
                    serialize_mathml_int(arg);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        else {
            final SubLObject _prev_bind_4 = mathml.$mathml_stacked$.currentBinding(thread);
            try {
                mathml.$mathml_stacked$.bind((SubLObject)mathml.T, thread);
                try {
                    final SubLObject _prev_bind_0_$65 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str93$mstack, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$66 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            final SubLObject v_arity2 = el_utilities.formula_arity(obj, (SubLObject)mathml.UNPROVIDED);
                            SubLObject arg_num2 = (SubLObject)mathml.ZERO_INTEGER;
                            SubLObject cdolist_list_var2;
                            final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(obj, (SubLObject)mathml.$kw91$IGNORE);
                            SubLObject arg2 = (SubLObject)mathml.NIL;
                            arg2 = cdolist_list_var2.first();
                            while (mathml.NIL != cdolist_list_var2) {
                                arg_num2 = Numbers.add(arg_num2, (SubLObject)mathml.ONE_INTEGER);
                                if (arg_num2.eql((SubLObject)mathml.ONE_INTEGER)) {
                                    if (arg_num2.eql(v_arity2)) {
                                        serialize_mathml_int(operator);
                                    }
                                    serialize_mathml_int(arg2);
                                }
                                else if (arg_num2.eql(v_arity2) && mathml.NIL == padded_expression_p(arg2)) {
                                    try {
                                        final SubLObject _prev_bind_0_$67 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$68 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str112$msrow, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$68 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                serialize_mathml_int(operator);
                                                serialize_mathml_int(arg2);
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$68, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$68, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str112$msrow);
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                        }
                                    }
                                }
                                else {
                                    serialize_mathml_int(arg2);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg2 = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$65, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str93$mstack);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            }
            finally {
                mathml.$mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 15315L)
    public static SubLObject padded_expression_p(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(mathml.NIL != cycl_grammar.cycl_nat_p(arg) && cycl_utilities.formula_operator(arg).eql(mathml.$const63$PaddedExpressionFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 15446L)
    public static SubLObject serialize_mathml_carries(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mathml.NIL != mathml.$mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject carries = (SubLObject)ConsesLow.make_list(Numbers.add((SubLObject)mathml.ONE_INTEGER, max_carry_index(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED))), (SubLObject)mathml.NIL);
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.$kw91$IGNORE);
            SubLObject carry_list = (SubLObject)mathml.NIL;
            carry_list = cdolist_list_var.first();
            while (mathml.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = carry_list;
                SubLObject l = (SubLObject)mathml.NIL;
                SubLObject position = (SubLObject)mathml.NIL;
                SubLObject value = (SubLObject)mathml.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                l = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                position = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                value = current.first();
                current = current.rest();
                if (mathml.NIL == current) {
                    ConsesLow.set_nth(position, carries, value);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mathml.$list113);
                }
                cdolist_list_var = cdolist_list_var.rest();
                carry_list = cdolist_list_var.first();
            }
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str114$mscarries, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$72 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                        SubLObject cdolist_list_var2 = Sequences.nreverse(carries);
                        SubLObject carry_value = (SubLObject)mathml.NIL;
                        carry_value = cdolist_list_var2.first();
                        while (mathml.NIL != cdolist_list_var2) {
                            if (mathml.NIL != carry_value) {
                                serialize_mathml_int((SubLObject)ConsesLow.list(mathml.$const51$MathQuantFn, carry_value));
                            }
                            else {
                                try {
                                    final SubLObject _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$74 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str115$none, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$74, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str115$none);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            carry_value = cdolist_list_var2.first();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$72, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str114$mscarries);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
        }
        else {
            final SubLObject _prev_bind_4 = mathml.$mathml_stacked$.currentBinding(thread);
            try {
                mathml.$mathml_stacked$.bind((SubLObject)mathml.T, thread);
                try {
                    final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str93$mstack, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            final SubLObject carries2 = (SubLObject)ConsesLow.make_list(Numbers.add((SubLObject)mathml.ONE_INTEGER, max_carry_index(cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED))), (SubLObject)mathml.NIL);
                            SubLObject cdolist_list_var3;
                            final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.$kw91$IGNORE);
                            SubLObject carry_list2 = (SubLObject)mathml.NIL;
                            carry_list2 = cdolist_list_var3.first();
                            while (mathml.NIL != cdolist_list_var3) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = carry_list2;
                                SubLObject i = (SubLObject)mathml.NIL;
                                SubLObject position2 = (SubLObject)mathml.NIL;
                                SubLObject value2 = (SubLObject)mathml.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                i = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                position2 = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                value2 = current2.first();
                                current2 = current2.rest();
                                if (mathml.NIL == current2) {
                                    ConsesLow.set_nth(position2, carries2, value2);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)mathml.$list113);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                carry_list2 = cdolist_list_var3.first();
                            }
                            try {
                                final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$75 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str114$mscarries, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var4 = Sequences.nreverse(carries2);
                                        SubLObject carry_value2 = (SubLObject)mathml.NIL;
                                        carry_value2 = cdolist_list_var4.first();
                                        while (mathml.NIL != cdolist_list_var4) {
                                            if (mathml.NIL != carry_value2) {
                                                serialize_mathml_int((SubLObject)ConsesLow.list(mathml.$const51$MathQuantFn, carry_value2));
                                            }
                                            else {
                                                try {
                                                    final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$76 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str115$none, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$81, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$76, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$80, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                                        final SubLObject _values3 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str115$none);
                                                        Values.restoreValuesFromVector(_values3);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                                                    }
                                                }
                                            }
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            carry_value2 = cdolist_list_var4.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$75, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str114$mscarries);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                            serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str93$mstack);
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                    }
                }
            }
            finally {
                mathml.$mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 16009L)
    public static SubLObject max_carry_index(final SubLObject carry_list) {
        SubLObject max_index = (SubLObject)mathml.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(carry_list, (SubLObject)mathml.$kw91$IGNORE);
        SubLObject carry = (SubLObject)mathml.NIL;
        carry = cdolist_list_var.first();
        while (mathml.NIL != cdolist_list_var) {
            if (cycl_utilities.nat_arg1(carry, (SubLObject)mathml.UNPROVIDED).numG(max_index)) {
                max_index = cycl_utilities.nat_arg1(carry, (SubLObject)mathml.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            carry = cdolist_list_var.first();
        }
        return max_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 16290L)
    public static SubLObject serialize_mathml_strikethrough(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mathml.NIL != mathml.$mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject replacements = (SubLObject)ConsesLow.make_list(math_expr_digit_count(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED)), (SubLObject)mathml.NIL);
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.$kw91$IGNORE);
            SubLObject replacement_list = (SubLObject)mathml.NIL;
            replacement_list = cdolist_list_var.first();
            while (mathml.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = replacement_list;
                SubLObject l = (SubLObject)mathml.NIL;
                SubLObject position = (SubLObject)mathml.NIL;
                SubLObject value = (SubLObject)mathml.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                l = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                position = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list113);
                value = current.first();
                current = current.rest();
                if (mathml.NIL == current) {
                    ConsesLow.set_nth(position, replacements, value);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mathml.$list113);
                }
                cdolist_list_var = cdolist_list_var.rest();
                replacement_list = cdolist_list_var.first();
            }
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str114$mscarries, (SubLObject)mathml.$list116, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                        SubLObject cdolist_list_var2 = Sequences.nreverse(replacements);
                        SubLObject replacement_value = (SubLObject)mathml.NIL;
                        replacement_value = cdolist_list_var2.first();
                        while (mathml.NIL != cdolist_list_var2) {
                            if (mathml.NIL != replacement_value) {
                                serialize_mathml_int((SubLObject)ConsesLow.list(mathml.$const51$MathQuantFn, replacement_value));
                            }
                            else {
                                try {
                                    final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str117$mscarry, (SubLObject)mathml.$list118, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str115$none, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$91, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str115$none);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$90, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str117$mscarry);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                    }
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            replacement_value = cdolist_list_var2.first();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str114$mscarries);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
        }
        else {
            final SubLObject _prev_bind_4 = mathml.$mathml_stacked$.currentBinding(thread);
            try {
                mathml.$mathml_stacked$.bind((SubLObject)mathml.T, thread);
                try {
                    final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str93$mstack, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            final SubLObject replacements2 = (SubLObject)ConsesLow.make_list(math_expr_digit_count(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED)), (SubLObject)mathml.NIL);
                            SubLObject cdolist_list_var3;
                            final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.$kw91$IGNORE);
                            SubLObject replacement_list2 = (SubLObject)mathml.NIL;
                            replacement_list2 = cdolist_list_var3.first();
                            while (mathml.NIL != cdolist_list_var3) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = replacement_list2;
                                SubLObject i = (SubLObject)mathml.NIL;
                                SubLObject position2 = (SubLObject)mathml.NIL;
                                SubLObject value2 = (SubLObject)mathml.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                i = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                position2 = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list113);
                                value2 = current2.first();
                                current2 = current2.rest();
                                if (mathml.NIL == current2) {
                                    ConsesLow.set_nth(position2, replacements2, value2);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)mathml.$list113);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                replacement_list2 = cdolist_list_var3.first();
                            }
                            try {
                                final SubLObject _prev_bind_0_$97 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str114$mscarries, (SubLObject)mathml.$list116, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$98 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var4 = Sequences.nreverse(replacements2);
                                        SubLObject replacement_value2 = (SubLObject)mathml.NIL;
                                        replacement_value2 = cdolist_list_var4.first();
                                        while (mathml.NIL != cdolist_list_var4) {
                                            if (mathml.NIL != replacement_value2) {
                                                serialize_mathml_int((SubLObject)ConsesLow.list(mathml.$const51$MathQuantFn, replacement_value2));
                                            }
                                            else {
                                                try {
                                                    final SubLObject _prev_bind_0_$99 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str117$mscarry, (SubLObject)mathml.$list118, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$100 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                            try {
                                                                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str115$none, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                                                    final SubLObject _values4 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str115$none);
                                                                    Values.restoreValuesFromVector(_values4);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$100, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$99, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                                        final SubLObject _values5 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str117$mscarry);
                                                        Values.restoreValuesFromVector(_values5);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                                    }
                                                }
                                            }
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            replacement_value2 = cdolist_list_var4.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$98, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$97, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                    final SubLObject _values6 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str114$mscarries);
                                    Values.restoreValuesFromVector(_values6);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                }
                            }
                            serialize_mathml_int(cycl_utilities.formula_arg1(obj, (SubLObject)mathml.UNPROVIDED));
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                        final SubLObject _values7 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str93$mstack);
                        Values.restoreValuesFromVector(_values7);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                    }
                }
            }
            finally {
                mathml.$mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 16989L)
    public static SubLObject serialize_mathml_long_division(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject divisor = cycl_utilities.nat_arg2(obj, (SubLObject)mathml.UNPROVIDED);
        final SubLObject v_answer = cycl_utilities.nat_arg3(obj, (SubLObject)mathml.UNPROVIDED);
        final SubLObject dividend = cycl_utilities.nat_arg1(obj, (SubLObject)mathml.UNPROVIDED);
        final SubLObject long_args = Sequences.subseq(cycl_utilities.nat_args(obj, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.THREE_INTEGER, (SubLObject)mathml.UNPROVIDED);
        final SubLObject long_arg_count = Sequences.length(long_args);
        SubLObject current_addend_count = (SubLObject)mathml.ONE_INTEGER;
        SubLObject current_max_addend_digit_count = (SubLObject)mathml.ZERO_INTEGER;
        SubLObject within_addend_group = (SubLObject)mathml.NIL;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str119$mlongdiv, (SubLObject)mathml.$list120, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    serialize_mathml_int(divisor);
                    if (mathml.NIL != v_answer) {
                        serialize_mathml_int(v_answer);
                    }
                    else {
                        final SubLObject _prev_bind_0_$113 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$114 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str74$mn, (SubLObject)mathml.NIL, (SubLObject)mathml.T, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$114 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$114, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$114, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$113, thread);
                        }
                    }
                    if (mathml.NIL != cycl_grammar.cycl_nat_p(dividend) && cycl_utilities.nat_arg0(dividend).eql(mathml.$const51$MathQuantFn) && cycl_utilities.nat_arg1(dividend, (SubLObject)mathml.UNPROVIDED).isInteger()) {
                        serialize_mathml_int((SubLObject)ConsesLow.listS(mathml.$const51$MathQuantFn, cycl_utilities.nat_arg1(dividend, (SubLObject)mathml.UNPROVIDED), (SubLObject)mathml.$list121));
                    }
                    else {
                        serialize_mathml_int(dividend);
                    }
                    try {
                        final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str64$msgroup, (SubLObject)mathml.$list122, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                xml_utilities.xml_terpri();
                                SubLObject list_var = (SubLObject)mathml.NIL;
                                SubLObject arg = (SubLObject)mathml.NIL;
                                SubLObject arg_num = (SubLObject)mathml.NIL;
                                list_var = long_args;
                                arg = list_var.first();
                                for (arg_num = (SubLObject)mathml.ZERO_INTEGER; mathml.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), arg_num = Numbers.add((SubLObject)mathml.ONE_INTEGER, arg_num)) {
                                    if (mathml.NIL == within_addend_group) {
                                        xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str64$msgroup, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.UNPROVIDED, (SubLObject)mathml.UNPROVIDED);
                                        xml_utilities.$xml_indentation_level$.setDynamicValue(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.xml_terpri();
                                        within_addend_group = (SubLObject)mathml.T;
                                    }
                                    serialize_mathml_int(arg);
                                    current_addend_count = Numbers.add(current_addend_count, (SubLObject)mathml.ONE_INTEGER);
                                    current_max_addend_digit_count = Numbers.max(current_max_addend_digit_count, math_expr_digit_count(arg));
                                    if (current_addend_count.numGE((SubLObject)mathml.TWO_INTEGER)) {
                                        if (!Numbers.add(arg_num, (SubLObject)mathml.ONE_INTEGER).eql(long_arg_count)) {
                                            final SubLObject _prev_bind_0_$117 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal((SubLObject)mathml.$str92$msline, (SubLObject)ConsesLow.list((SubLObject)mathml.$str123$length, current_max_addend_digit_count), (SubLObject)mathml.T, (SubLObject)mathml.NIL, (SubLObject)mathml.$kw22$UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)mathml.$kw22$UNINITIALIZED, thread);
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            }
                                            finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            xml_utilities.xml_terpri();
                                        }
                                        if (!Numbers.add(arg_num, (SubLObject)mathml.TWO_INTEGER).eql(long_arg_count)) {
                                            current_max_addend_digit_count = (SubLObject)mathml.ZERO_INTEGER;
                                            current_addend_count = (SubLObject)mathml.ZERO_INTEGER;
                                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str64$msgroup);
                                            xml_utilities.$xml_indentation_level$.setDynamicValue(Numbers.subtract(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), xml_utilities.$xml_indentation_amount$.getDynamicValue(thread)), thread);
                                            xml_utilities.xml_terpri();
                                            within_addend_group = (SubLObject)mathml.NIL;
                                        }
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$116, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$115, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$115, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str64$msgroup);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                        }
                    }
                    if (mathml.NIL != within_addend_group) {
                        xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str64$msgroup);
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)mathml.$str119$mlongdiv);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 25989L)
    public static SubLObject mathml_demo() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject color = (SubLObject)mathml.NIL;
        SubLObject test_items = mathml.$mathml_demo_items$.getGlobalValue();
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mathml.$sym125$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(mathml.$const126$EverythingPSC, thread);
            final SubLObject pred_var = mathml.$const127$mathExpressionNATRenderAs;
            if (mathml.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)mathml.NIL;
                final SubLObject _prev_bind_0_$123 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$124 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)mathml.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)mathml.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)mathml.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)mathml.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((mathml.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : mathml.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)mathml.NIL;
                    final SubLObject token_var = (SubLObject)mathml.NIL;
                    while (mathml.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (mathml.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)mathml.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)mathml.$kw128$GAF, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL);
                                SubLObject done_var_$125 = (SubLObject)mathml.NIL;
                                final SubLObject token_var_$126 = (SubLObject)mathml.NIL;
                                while (mathml.NIL == done_var_$125) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$126);
                                    final SubLObject valid_$127 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$126.eql(gaf));
                                    if (mathml.NIL != valid_$127) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                        SubLObject math_expression = (SubLObject)mathml.NIL;
                                        SubLObject html = (SubLObject)mathml.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list129);
                                        math_expression = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mathml.$list129);
                                        html = current.first();
                                        current = current.rest();
                                        if (mathml.NIL == current) {
                                            test_items = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(math_expression, html), test_items);
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mathml.$list129);
                                        }
                                    }
                                    done_var_$125 = (SubLObject)SubLObjectFactory.makeBoolean(mathml.NIL == valid_$127);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (mathml.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(mathml.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$124, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$123, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
        html_utilities.html_markup((SubLObject)mathml.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
            final SubLObject style = Sequences.cconcatenate((SubLObject)mathml.$str130$background_color__, format_nil.format_nil_a_no_copy(html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue()));
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (mathml.NIL != style) {
                html_utilities.html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(style));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
            final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                    html_utilities.html_princ((SubLObject)mathml.$str131$CycL);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                    html_utilities.html_princ((SubLObject)mathml.$str132$HTML);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                    html_utilities.html_princ((SubLObject)mathml.$str133$MathML);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)mathml.UNPROVIDED);
            SubLObject color_toggle = (SubLObject)mathml.NIL;
            SubLObject list_var = (SubLObject)mathml.NIL;
            SubLObject item = (SubLObject)mathml.NIL;
            SubLObject ignore_me = (SubLObject)mathml.NIL;
            list_var = test_items;
            item = list_var.first();
            for (ignore_me = (SubLObject)mathml.ZERO_INTEGER; mathml.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), ignore_me = Numbers.add((SubLObject)mathml.ONE_INTEGER, ignore_me)) {
                if (mathml.NIL != color_toggle) {
                    color_toggle = (SubLObject)mathml.NIL;
                }
                else {
                    color_toggle = (SubLObject)mathml.T;
                }
                color = ((mathml.NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue());
                SubLObject current2;
                final SubLObject datum2 = current2 = item;
                SubLObject math_expression2 = (SubLObject)mathml.NIL;
                SubLObject html2 = (SubLObject)mathml.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list129);
                math_expression2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)mathml.$list129);
                html2 = current2.first();
                current2 = current2.rest();
                if (mathml.NIL == current2) {
                    final SubLObject style2 = Sequences.cconcatenate((SubLObject)mathml.$str130$background_color__, format_nil.format_nil_a_no_copy(color));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (mathml.NIL != style2) {
                        html_utilities.html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align(style2));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)mathml.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                    final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                            cb_utilities.cb_form(math_expression2, (SubLObject)mathml.ZERO_INTEGER, (SubLObject)mathml.T);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                        final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                            if (mathml.NIL != list_utilities.lengthL(html2, (SubLObject)mathml.$int134$32, (SubLObject)mathml.UNPROVIDED)) {
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_utilities.html_markup(html2);
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html2);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)mathml.UNPROVIDED);
                        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)mathml.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$133 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                                SubLObject err_msg = (SubLObject)mathml.NIL;
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$134 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)mathml.$sym135$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            serialize_mathml(item.first());
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)mathml.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$134, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (mathml.NIL != err_msg) {
                                    html_utilities.html_princ_strong(err_msg);
                                }
                            }
                            finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)mathml.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)mathml.$list129);
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)mathml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mathml.lisp", position = 27330L)
    public static SubLObject serialize_mathml_to_string(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject str = (SubLObject)mathml.NIL;
        SubLObject stream = (SubLObject)mathml.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                serialize_mathml(obj);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            str = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mathml.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)mathml.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return str;
    }
    
    public static SubLObject declare_mathml_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mathml", "serializing_mathml", "SERIALIZING-MATHML");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mathml", "mathml_row", "MATHML-ROW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mathml", "with_stacked_math", "WITH-STACKED-MATH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml", "SERIALIZE-MATHML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "lookup_mathml_atom", "LOOKUP-MATHML-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_atom", "SERIALIZE-MATHML-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "clear_html_glyph_code_for_denot", "CLEAR-HTML-GLYPH-CODE-FOR-DENOT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "remove_html_glyph_code_for_denot", "REMOVE-HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "html_glyph_code_for_denot_internal", "HTML-GLYPH-CODE-FOR-DENOT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "html_glyph_code_for_denot", "HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "clear_serializable_units_of_measure_mathml", "CLEAR-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "remove_serializable_units_of_measure_mathml", "REMOVE-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serializable_units_of_measure_mathml_internal", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serializable_units_of_measure_mathml", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_int", "SERIALIZE-MATHML-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "math_expr_digit_count", "MATH-EXPR-DIGIT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_decimal", "SERIALIZE-MATHML-DECIMAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_repeating_decimal", "SERIALIZE-MATHML-REPEATING-DECIMAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_non_repeating_decimal", "SERIALIZE-MATHML-NON-REPEATING-DECIMAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_quantity", "SERIALIZE-MATHML-QUANTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_simple_fraction", "SERIALIZE-MATHML-SIMPLE-FRACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_simple_stacked_math_expression", "SERIALIZE-MATHML-SIMPLE-STACKED-MATH-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "padded_expression_p", "PADDED-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_carries", "SERIALIZE-MATHML-CARRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "max_carry_index", "MAX-CARRY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_strikethrough", "SERIALIZE-MATHML-STRIKETHROUGH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_long_division", "SERIALIZE-MATHML-LONG-DIVISION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "mathml_demo", "MATHML-DEMO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mathml", "serialize_mathml_to_string", "SERIALIZE-MATHML-TO-STRING", 1, 0, false);
        return (SubLObject)mathml.NIL;
    }
    
    public static SubLObject init_mathml_file() {
        mathml.$mathml_namespace$ = SubLFiles.deflexical("*MATHML-NAMESPACE*", (SubLObject)mathml.$str0$http___www_w3_org_1998_Math_MathM);
        mathml.$mathml_stacked$ = SubLFiles.defparameter("*MATHML-STACKED*", (SubLObject)mathml.NIL);
        mathml.$mathml_heavy_operatorsP$ = SubLFiles.defparameter("*MATHML-HEAVY-OPERATORS?*", (SubLObject)mathml.NIL);
        mathml.$mathml_atom_map$ = SubLFiles.deflexical("*MATHML-ATOM-MAP*", (SubLObject)mathml.$list13);
        mathml.$html_glyph_code_for_denot_caching_state$ = SubLFiles.deflexical("*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*", (SubLObject)mathml.NIL);
        mathml.$serializable_units_of_measure_mathml_caching_state$ = SubLFiles.deflexical("*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*", (SubLObject)mathml.NIL);
        mathml.$strike_and_replace_mathml_numerator_with$ = SubLFiles.defparameter("*STRIKE-AND-REPLACE-MATHML-NUMERATOR-WITH*", (SubLObject)mathml.NIL);
        mathml.$strike_and_replace_mathml_denominator_with$ = SubLFiles.defparameter("*STRIKE-AND-REPLACE-MATHML-DENOMINATOR-WITH*", (SubLObject)mathml.NIL);
        mathml.$mathml_demo_items$ = SubLFiles.deflexical("*MATHML-DEMO-ITEMS*", mathml.$list124);
        return (SubLObject)mathml.NIL;
    }
    
    public static SubLObject setup_mathml_file() {
        memoization_state.note_globally_cached_function((SubLObject)mathml.$sym33$HTML_GLYPH_CODE_FOR_DENOT);
        memoization_state.note_globally_cached_function((SubLObject)mathml.$sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML);
        generic_testing.define_test_case_table_int((SubLObject)mathml.$sym136$SERIALIZE_MATHML_TO_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { mathml.$kw137$TEST, mathml.EQUAL, mathml.$kw138$OWNER, mathml.NIL, mathml.$kw139$CLASSES, mathml.NIL, mathml.$kw140$KB, mathml.$kw141$FULL, mathml.$kw142$WORKING_, mathml.T }), (SubLObject)mathml.$list143);
        return (SubLObject)mathml.NIL;
    }
    
    private static SubLObject _constant_124_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Foot-UnitOfMeasure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(656), (SubLObject)mathml.TWO_INTEGER)))), (SubLObject)SubLObjectFactory.makeString(".2 + 6.56 feet")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathStackedEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InsertNumberAtDigitsFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(1094), (SubLObject)mathml.ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)mathml.ZERO_INTEGER, (SubLObject)mathml.ONE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(45)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(77745), (SubLObject)mathml.THREE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(145), (SubLObject)mathml.THREE_INTEGER))), (SubLObject)SubLObjectFactory.makeString("Stacked version of 109.4 + 45 + 77.745, where .145 has been done so far in the stacked addition, and a 1 has been carried over the 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(314), (SubLObject)mathml.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("3.14")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(8675309), (SubLObject)mathml.FOUR_INTEGER, (SubLObject)mathml.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("867.5309 (with bar over 09)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("A")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pi-Number"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("r")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER)))), (SubLObject)SubLObjectFactory.makeString("A = pi r^2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrikeNumeratorAndReplaceWithFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)mathml.EIGHT_INTEGER, (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)mathml.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrikeDenominatorAndReplaceWithFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)mathml.EIGHT_INTEGER), (SubLObject)mathml.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("<del>8</del>1/7 x 35/<del>8</del>1")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM")), (SubLObject)mathml.TWELVE_INTEGER, (SubLObject)mathml.FIVE_INTEGER), (SubLObject)SubLObjectFactory.makeString("12:05PM")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM")), (SubLObject)mathml.TWELVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(45)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM")), (SubLObject)mathml.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(40))), (SubLObject)SubLObjectFactory.makeString("12:45PM - 4:40PM")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 + z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeString("2 1/3")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegativeMixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeString("-2 1/3")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.THREE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.TWO_INTEGER))), (SubLObject)SubLObjectFactory.makeString("1 2/3 x 2 1/2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)mathml.THREE_INTEGER, (SubLObject)mathml.FIVE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.TWO_INTEGER))), (SubLObject)SubLObjectFactory.makeString("3/5 / 1/2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 + z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.EIGHT_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y"))), (SubLObject)SubLObjectFactory.makeString("9 + 8 + z + y")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.EIGHT_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y"))), (SubLObject)SubLObjectFactory.makeString("9 + 8 + z + y")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 - z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 - z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 x z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.TWO_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.FOUR_INTEGER))), (SubLObject)SubLObjectFactory.makeString("1/2 x 1/4")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 x z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 . z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 . z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbsoluteValueExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("abs(9)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("-3")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("X^2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeDouble(3.14)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.EIGHT_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER))), (SubLObject)SubLObjectFactory.makeString("3.14 x 8^2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeDouble(3.14)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.EIGHT_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("3.14 x 8^2")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BracketedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("[9]")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("(9)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x")), (SubLObject)SubLObjectFactory.makeString("var x")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)SubLObjectFactory.makeString("9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HorizontalDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HorizontalDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x with obelus")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x with obelus")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixSlashDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x with slash")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixSlashDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)SubLObjectFactory.makeString("9/x with slash")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("cube root of 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionOfVarsFn")), (SubLObject)SubLObjectFactory.makeString("f"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y"))), (SubLObject)SubLObjectFactory.makeString("f(x,y)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 2 = 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanOrEqualStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 3 >= 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanOrEqualStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 1 <= 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 3 > 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.ONE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 1 < 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathNotEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("7 + 3 != 9")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 / (square-root of Y) > z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathUnknownStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.NINE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("z"))), (SubLObject)SubLObjectFactory.makeString("9 / (square-root of Y) ?>=<? z")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)SubLObjectFactory.makeInteger(220))), (SubLObject)SubLObjectFactory.makeString("220V")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mole-ChemicalCountUnit")), (SubLObject)SubLObjectFactory.makeInteger(1320))), (SubLObject)SubLObjectFactory.makeString("1320 moles")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfCountFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Battery"))), (SubLObject)mathml.TWELVE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("12 batteries")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("2 1/3 volts")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)mathml.SEVEN_INTEGER), (SubLObject)mathml.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeString("(7 volts) / 3")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER)))), (SubLObject)SubLObjectFactory.makeString("(-2 1/3)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BracketedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER))))), (SubLObject)SubLObjectFactory.makeString("[-(2 1/3)]")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.ZERO_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)mathml.TWO_INTEGER, (SubLObject)mathml.ONE_INTEGER, (SubLObject)mathml.THREE_INTEGER)))), (SubLObject)SubLObjectFactory.makeString("0 - (-2 1/3)")), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HorizontalDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("b"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("b")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("c")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("a"))))), (SubLObject)SubLObjectFactory.makeString("x = (-b +/- (square root of (b^2 - 4ac))) / 2a")) });
    }
    
    public void declareFunctions() {
        declare_mathml_file();
    }
    
    public void initializeVariables() {
        init_mathml_file();
    }
    
    public void runTopLevelForms() {
        setup_mathml_file();
    }
    
    static {
        me = (SubLFile)new mathml();
        mathml.$mathml_namespace$ = null;
        mathml.$mathml_stacked$ = null;
        mathml.$mathml_heavy_operatorsP$ = null;
        mathml.$mathml_atom_map$ = null;
        mathml.$html_glyph_code_for_denot_caching_state$ = null;
        mathml.$serializable_units_of_measure_mathml_caching_state$ = null;
        mathml.$strike_and_replace_mathml_numerator_with$ = null;
        mathml.$strike_and_replace_mathml_denominator_with$ = null;
        mathml.$mathml_demo_items$ = null;
        $str0$http___www_w3_org_1998_Math_MathM = SubLObjectFactory.makeString("http://www.w3.org/1998/Math/MathML");
        $sym1$XML_TAG = SubLObjectFactory.makeSymbol("XML-TAG");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("math"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("overflow"), (SubLObject)SubLObjectFactory.makeString("linebreak"))), (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)mathml.NIL, (SubLObject)SubLObjectFactory.makeSymbol("*MATHML-NAMESPACE*"));
        $sym3$XML_ELEMENT = SubLObjectFactory.makeSymbol("XML-ELEMENT");
        $str4$mrow = SubLObjectFactory.makeString("mrow");
        $sym5$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym6$_MATHML_STACKED_ = SubLObjectFactory.makeSymbol("*MATHML-STACKED*");
        $sym7$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MATHML-STACKED*"), (SubLObject)mathml.T));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mstack"));
        $str11$math = SubLObjectFactory.makeString("math");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("overflow"), (SubLObject)SubLObjectFactory.makeString("linebreak"));
        $list13 = ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)SubLObjectFactory.makeString("+")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)SubLObjectFactory.makeString("&#x2212;"), (SubLObject)SubLObjectFactory.makeString("MINUS")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)SubLObjectFactory.makeString("&#x2212;"), (SubLObject)SubLObjectFactory.makeString("MINUS")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusMinusFn")), (SubLObject)SubLObjectFactory.makeString("&#xB1;"), (SubLObject)SubLObjectFactory.makeString("PLUS/MINUS")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)SubLObjectFactory.makeString("&#xD7;"), (SubLObject)SubLObjectFactory.makeString("MULT SIGN")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)SubLObjectFactory.makeString("&#x2062;"), (SubLObject)SubLObjectFactory.makeString("INVISIBLE TIMES")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)SubLObjectFactory.makeString("&#x22C5;"), (SubLObject)SubLObjectFactory.makeString("DOT PRODUCT SIGN")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)SubLObjectFactory.makeString("&#x00F7;"), (SubLObject)SubLObjectFactory.makeString("OBELUS")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), (SubLObject)SubLObjectFactory.makeString("=")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanOrEqualStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x2265;"), (SubLObject)SubLObjectFactory.makeString("GREATER THAN OR EQUAL")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x3E;"), (SubLObject)SubLObjectFactory.makeString("GREATER THAN")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanOrEqualStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x2264;"), (SubLObject)SubLObjectFactory.makeString("LESS THAN OR EQUAL")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x3C;"), (SubLObject)SubLObjectFactory.makeString("LESS THAN")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathNotEqualsStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x2260;"), (SubLObject)SubLObjectFactory.makeString("NOT EQUAL")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathUnknownStatementFn")), (SubLObject)SubLObjectFactory.makeString("&#x2A8B;"), (SubLObject)SubLObjectFactory.makeString("UNKNOWN STATEMENT")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionOfVarsFn")), (SubLObject)SubLObjectFactory.makeString("&#x2061;"), (SubLObject)SubLObjectFactory.makeString("FUNCTION APPLICATION")) });
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $str15$mo = SubLObjectFactory.makeString("mo");
        $str16$largeop = SubLObjectFactory.makeString("largeop");
        $str17$true = SubLObjectFactory.makeString("true");
        $str18$false = SubLObjectFactory.makeString("false");
        $str19$mathvariant = SubLObjectFactory.makeString("mathvariant");
        $str20$bold = SubLObjectFactory.makeString("bold");
        $str21$normal = SubLObjectFactory.makeString("normal");
        $kw22$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $const23$Pi_Number = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pi-Number"));
        $str24$mi = SubLObjectFactory.makeString("mi");
        $str25$_pi_ = SubLObjectFactory.makeString("&pi;");
        $const26$TimeOfDay_PM = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM"));
        $str27$PM = SubLObjectFactory.makeString("PM");
        $const28$TimeOfDay_AM = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-AM"));
        $str29$AM = SubLObjectFactory.makeString("AM");
        $kw30$SPACE = SubLObjectFactory.makeKeyword("SPACE");
        $str31$_ = SubLObjectFactory.makeString(" ");
        $str32$_A = SubLObjectFactory.makeString("~A");
        $sym33$HTML_GLYPH_CODE_FOR_DENOT = SubLObjectFactory.makeSymbol("HTML-GLYPH-CODE-FOR-DENOT");
        $const34$htmlGlyphCode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("htmlGlyphCode"));
        $const35$symbolDenotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("symbolDenotes"));
        $sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*");
        $sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT = SubLObjectFactory.makeSymbol("CLEAR-HTML-GLYPH-CODE-FOR-DENOT");
        $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML = SubLObjectFactory.makeSymbol("SERIALIZABLE-UNITS-OF-MEASURE-MATHML");
        $const39$CompoundDurationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompoundDurationFn"));
        $const40$UnitOfMeasure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"));
        $sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*");
        $list42 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathNotEqualsStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLessThanOrEqualStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathGreaterThanOrEqualStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathUnknownStatementFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")));
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusMinusFn")));
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedSubtractionExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedMultiplicationExpressionFn")));
        $const45$singular = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"));
        $const46$plural = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural"));
        $str47$mspace = SubLObjectFactory.makeString("mspace");
        $str48$width = SubLObjectFactory.makeString("width");
        $str49$_5em = SubLObjectFactory.makeString(".5em");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mathvariant"), (SubLObject)SubLObjectFactory.makeString("normal"), (SubLObject)SubLObjectFactory.makeString("class"), (SubLObject)SubLObjectFactory.makeString("MathML-Unit"));
        $const51$MathQuantFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn"));
        $const52$MathLongDivisionStatementFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathLongDivisionStatementFn"));
        $const53$MathVarFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn"));
        $const54$ParenthesizedMathFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn"));
        $str55$mfenced = SubLObjectFactory.makeString("mfenced");
        $const56$BracketedMathFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BracketedMathFn"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("open"), (SubLObject)SubLObjectFactory.makeString("["), (SubLObject)SubLObjectFactory.makeString("close"), (SubLObject)SubLObjectFactory.makeString("]"));
        $const58$PowerExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn"));
        $str59$msup = SubLObjectFactory.makeString("msup");
        $const60$PrefixMinusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn"));
        $const61$AbsoluteValueExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbsoluteValueExpressionFn"));
        $str62$_ = SubLObjectFactory.makeString("|");
        $const63$PaddedExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PaddedExpressionFn"));
        $str64$msgroup = SubLObjectFactory.makeString("msgroup");
        $str65$position = SubLObjectFactory.makeString("position");
        $const66$MathExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn"));
        $const67$HorizontalDivideFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HorizontalDivideFn"));
        $str68$mfrac = SubLObjectFactory.makeString("mfrac");
        $const69$NthRootExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn"));
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.TWO_INTEGER);
        $str71$msqrt = SubLObjectFactory.makeString("msqrt");
        $str72$mroot = SubLObjectFactory.makeString("mroot");
        $const73$MixedFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn"));
        $str74$mn = SubLObjectFactory.makeString("mn");
        $const75$NegativeMixedFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegativeMixedFractionFn"));
        $const76$SimpleFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn"));
        $const77$DecimalFractionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFractionFn"));
        $const78$StrikeNumeratorAndReplaceWithFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrikeNumeratorAndReplaceWithFn"));
        $const79$StrikeDenominatorAndReplaceWithFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrikeDenominatorAndReplaceWithFn"));
        $const80$InfixSlashDivideFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixSlashDivideFn"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bevelled"), (SubLObject)SubLObjectFactory.makeString("true"));
        $const82$FunctionOfVarsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionOfVarsFn"));
        $str83$_ = SubLObjectFactory.makeString("(");
        $str84$_ = SubLObjectFactory.makeString(",");
        $str85$_ = SubLObjectFactory.makeString(")");
        $const86$TimeExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn"));
        $str87$_ = SubLObjectFactory.makeString(":");
        $str88$_2__0d = SubLObjectFactory.makeString("~2,'0d");
        $sym89$GENERATE_PHRASE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $const90$MathStackedEqualsStatementFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathStackedEqualsStatementFn"));
        $kw91$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str92$msline = SubLObjectFactory.makeString("msline");
        $str93$mstack = SubLObjectFactory.makeString("mstack");
        $const94$InsertNumberAtDigitsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InsertNumberAtDigitsFn"));
        $const95$StrikeAndReplaceDigitsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrikeAndReplaceDigitsFn"));
        $str96$Can_t_serialize__S_expressions_ = SubLObjectFactory.makeString("Can't serialize ~S expressions.");
        $list97 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedSubtractionExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedMultiplicationExpressionFn")));
        $str98$Can_t_compute_digit_count_of__A = SubLObjectFactory.makeString("Can't compute digit-count of ~A");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("BACKWARD-DECIMAL-LOCATION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("REPEATING-COUNT"));
        $str100$menclose = SubLObjectFactory.makeString("menclose");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("notation"), (SubLObject)SubLObjectFactory.makeString("top"));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinusFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str103$notation = SubLObjectFactory.makeString("notation");
        $str104$updiagonalstrike = SubLObjectFactory.makeString("updiagonalstrike");
        $const105$StackedAdditionExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn"));
        $const106$InfixPlusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn"));
        $const107$StackedMultiplicationExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedMultiplicationExpressionFn"));
        $const108$InfixTimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn"));
        $const109$StackedSubtractionExpressionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedSubtractionExpressionFn"));
        $const110$InfixMinusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn"));
        $str111$Unable_to_serialize_simple_stacke = SubLObjectFactory.makeString("Unable to serialize simple stacked math expression: ~S");
        $str112$msrow = SubLObjectFactory.makeString("msrow");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("L"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str114$mscarries = SubLObjectFactory.makeString("mscarries");
        $str115$none = SubLObjectFactory.makeString("none");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("crossout"), (SubLObject)SubLObjectFactory.makeString("updiagonalstrike"));
        $str117$mscarry = SubLObjectFactory.makeString("mscarry");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("crossout"), (SubLObject)SubLObjectFactory.makeString("none"));
        $str119$mlongdiv = SubLObjectFactory.makeString("mlongdiv");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("longdivstyle"), (SubLObject)SubLObjectFactory.makeString("lefttop"));
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPACE"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("position"), (SubLObject)SubLObjectFactory.makeString("0"), (SubLObject)SubLObjectFactory.makeString("shift"), (SubLObject)SubLObjectFactory.makeString("-1"));
        $str123$length = SubLObjectFactory.makeString("length");
        $list124 = _constant_124_initializer();
        $sym125$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const126$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const127$mathExpressionNATRenderAs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mathExpressionNATRenderAs"));
        $kw128$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATH-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("HTML"));
        $str130$background_color__ = SubLObjectFactory.makeString("background-color: ");
        $str131$CycL = SubLObjectFactory.makeString("CycL");
        $str132$HTML = SubLObjectFactory.makeString("HTML");
        $str133$MathML = SubLObjectFactory.makeString("MathML");
        $int134$32 = SubLObjectFactory.makeInteger(32);
        $sym135$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym136$SERIALIZE_MATHML_TO_STRING = SubLObjectFactory.makeSymbol("SERIALIZE-MATHML-TO-STRING");
        $kw137$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw138$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw139$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw140$KB = SubLObjectFactory.makeKeyword("KB");
        $kw141$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw142$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("x"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)SubLObjectFactory.makeInteger(60))))), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mrow><mrow><mn>3</mn>\n <mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n </mo><mi>x\n </mi></mrow><mo largeop=\"false\" mathvariant=\"normal\">=\n </mo><mrow><mn>60</mn>\n <mspace width=\".5em\"/><mi mathvariant=\"normal\" class=\"MathML-Unit\">volts\n </mi></mrow></mrow>\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HorizontalDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplicitTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SIX_INTEGER)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathVarFn")), (SubLObject)SubLObjectFactory.makeString("y"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrefixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)mathml.SIX_INTEGER)))), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mfrac><mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n  </mo><mi>y\n  </mi></mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow>\n </mfrac>\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathStackedEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedMultiplicationExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(123)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(321))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(123)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(2460)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(36900))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(39483)))), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mn>123</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">&#xD7;<!--MULT SIGN-->\n   </mo><mn>321</mn>\n   \n  </msrow><msline>\n  </msline><mn>123</mn>\n  <mn>2460</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>36900</mn>\n   \n  </msrow><msline>\n  </msline><mn>39483</mn>\n  \n </mstack>\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathStackedEqualsStatementFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StackedAdditionExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InsertNumberAtDigitsFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(6969)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)mathml.THREE_INTEGER, (SubLObject)mathml.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)mathml.FOUR_INTEGER, (SubLObject)mathml.ONE_INTEGER))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(23230)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(464600))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)SubLObjectFactory.makeInteger(4799)))), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mscarries><mn>1</mn>\n   <mn>1</mn>\n   <none>\n   </none><none>\n   </none><none>\n   </none>\n  </mscarries><mn>6969</mn>\n  <mn>23230</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>464600</mn>\n   \n  </msrow><msline>\n  </msline><mn>4799</mn>\n  \n </mstack>\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM")), (SubLObject)mathml.EIGHT_INTEGER, (SubLObject)mathml.FIVE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05PM\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeExpressionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeOfDay-PM")), (SubLObject)mathml.EIGHT_INTEGER, (SubLObject)mathml.FIVE_INTEGER, (SubLObject)mathml.THREE_INTEGER)), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05:03PM\n</math>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompoundDurationFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HoursDuration")), (SubLObject)mathml.EIGHT_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinutesDuration")), (SubLObject)mathml.FIVE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondsDuration")), (SubLObject)mathml.FOUR_INTEGER))), (SubLObject)SubLObjectFactory.makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mn>8 hours, 5 minutes, 4 seconds\n </mn>\n</math>")));
    }
}

/*

	Total time: 5339 ms
	
*/
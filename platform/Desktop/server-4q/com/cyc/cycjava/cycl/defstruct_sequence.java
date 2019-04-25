package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class defstruct_sequence extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.defstruct_sequence";
    public static final String myFingerPrint = "74bc1645a3516a62f3cb2740149792a024130333d99fe0af169bd6e25c6ae1e0";
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$VECTOR;
    private static final SubLSymbol $sym2$DEFSTRUCT_VECTOR;
    private static final SubLString $str3$A_simplified_version_of_DEFSTRUCT;
    private static final SubLSymbol $kw4$LIST;
    private static final SubLSymbol $sym5$DEFSTRUCT_LIST;
    private static final SubLString $str6$A_simplified_version_of_DEFSTRUCT;
    private static final SubLSymbol $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR;
    private static final SubLSymbol $sym8$DEFSTRUCT_LIST_CONSTRUCTOR;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$DEFINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RET;
    private static final SubLSymbol $sym13$CAND;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$_;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$QUOTE;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$CHECK_TYPE;
    private static final SubLSymbol $sym26$OBJECT;
    private static final SubLSymbol $sym27$AREF;
    private static final SubLSymbol $sym28$NTH;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$SET_AREF;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$SET_NTH;
    private static final SubLSymbol $sym34$PROGN;
    private static final SubLString $str35$_P;
    private static final SubLString $str36$MAKE_;
    private static final SubLString $str37$_;
    private static final SubLString $str38$SET_;
    private static final SubLSymbol $sym39$DEFSTRUCT_SEQUENCE_INTERNAL;
    private static final SubLSymbol $kw40$TEST;
    private static final SubLSymbol $kw41$OWNER;
    private static final SubLSymbol $kw42$CLASSES;
    private static final SubLSymbol $kw43$KB;
    private static final SubLSymbol $kw44$TINY;
    private static final SubLSymbol $kw45$WORKING_;
    private static final SubLList $list46;
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 980L)
    public static SubLObject defstruct_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)defstruct_sequence.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list0);
        name = current.first();
        current = current.rest();
        if (defstruct_sequence.NIL == current) {
            final SubLObject v_slots;
            current = (v_slots = temp);
            return defstruct_sequence_internal((SubLObject)defstruct_sequence.$kw1$VECTOR, name, v_slots);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defstruct_sequence.$list0);
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 1604L)
    public static SubLObject defstruct_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)defstruct_sequence.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list0);
        name = current.first();
        current = current.rest();
        if (defstruct_sequence.NIL == current) {
            final SubLObject v_slots;
            current = (v_slots = temp);
            return defstruct_sequence_internal((SubLObject)defstruct_sequence.$kw4$LIST, name, v_slots);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defstruct_sequence.$list0);
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2253L)
    public static SubLObject defstruct_vector_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters) {
        final SubLObject vector = Vectors.make_vector(size, (SubLObject)defstruct_sequence.NIL);
        Vectors.set_aref(vector, (SubLObject)defstruct_sequence.ZERO_INTEGER, type);
        SubLObject remainder;
        SubLObject parameter;
        SubLObject value;
        SubLObject index;
        for (remainder = (SubLObject)defstruct_sequence.NIL, remainder = parameters; defstruct_sequence.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            parameter = remainder.first();
            value = conses_high.cadr(remainder);
            index = Sequences.position(parameter, slot_keys, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED);
            Vectors.set_aref(vector, number_utilities.f_1X(index), value);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2644L)
    public static SubLObject defstruct_list_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters) {
        final SubLObject list = (SubLObject)ConsesLow.make_list(size, (SubLObject)defstruct_sequence.NIL);
        ConsesLow.set_nth((SubLObject)defstruct_sequence.ZERO_INTEGER, list, type);
        SubLObject remainder;
        SubLObject parameter;
        SubLObject value;
        SubLObject index;
        for (remainder = (SubLObject)defstruct_sequence.NIL, remainder = parameters; defstruct_sequence.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            parameter = remainder.first();
            value = conses_high.cadr(remainder);
            index = Sequences.position(parameter, slot_keys, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED, (SubLObject)defstruct_sequence.UNPROVIDED);
            ConsesLow.set_nth(number_utilities.f_1X(index), list, value);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 2963L)
    public static SubLObject defstruct_sequence_internal(final SubLObject type, final SubLObject name, final SubLObject v_slots) {
        final SubLObject data = defstruct_sequence_data(name, v_slots);
        SubLObject current;
        final SubLObject datum = current = data;
        SubLObject predicate = (SubLObject)defstruct_sequence.NIL;
        SubLObject constructor = (SubLObject)defstruct_sequence.NIL;
        SubLObject slot_keys = (SubLObject)defstruct_sequence.NIL;
        SubLObject getter_setter_pairs = (SubLObject)defstruct_sequence.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list9);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list9);
        constructor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list9);
        slot_keys = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)defstruct_sequence.$list9);
        getter_setter_pairs = current.first();
        current = current.rest();
        if (defstruct_sequence.NIL == current) {
            final SubLObject size = Numbers.add((SubLObject)defstruct_sequence.ONE_INTEGER, Sequences.length(v_slots));
            SubLObject predicate_method = (SubLObject)defstruct_sequence.NIL;
            SubLObject constructor_method = (SubLObject)defstruct_sequence.NIL;
            SubLObject getter_methods = (SubLObject)defstruct_sequence.NIL;
            SubLObject setter_methods = (SubLObject)defstruct_sequence.NIL;
            if (type.eql((SubLObject)defstruct_sequence.$kw1$VECTOR)) {
                predicate_method = (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, predicate, (SubLObject)defstruct_sequence.$list11, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym13$CAND, (SubLObject)defstruct_sequence.$list14, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym15$_, size, (SubLObject)defstruct_sequence.$list16), (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.EQ, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, name), (SubLObject)defstruct_sequence.$list18))));
            }
            else if (type.eql((SubLObject)defstruct_sequence.$kw4$LIST)) {
                predicate_method = (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, predicate, (SubLObject)defstruct_sequence.$list11, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym13$CAND, (SubLObject)defstruct_sequence.$list19, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.EQ, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, name), (SubLObject)defstruct_sequence.$list20), (SubLObject)defstruct_sequence.$list21, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym15$_, size, (SubLObject)defstruct_sequence.$list16))));
            }
            if (type.eql((SubLObject)defstruct_sequence.$kw1$VECTOR)) {
                constructor_method = (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, constructor, (SubLObject)defstruct_sequence.$list22, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, name), size, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, slot_keys), (SubLObject)defstruct_sequence.$list23)));
            }
            else if (type.eql((SubLObject)defstruct_sequence.$kw4$LIST)) {
                constructor_method = (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, constructor, (SubLObject)defstruct_sequence.$list22, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym8$DEFSTRUCT_LIST_CONSTRUCTOR, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, name), size, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, slot_keys), (SubLObject)defstruct_sequence.$list23)));
            }
            SubLObject index = (SubLObject)defstruct_sequence.ZERO_INTEGER;
            SubLObject cdolist_list_var = getter_setter_pairs;
            SubLObject getter_setter_pair = (SubLObject)defstruct_sequence.NIL;
            getter_setter_pair = cdolist_list_var.first();
            while (defstruct_sequence.NIL != cdolist_list_var) {
                index = Numbers.add(index, (SubLObject)defstruct_sequence.ONE_INTEGER);
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = getter_setter_pair;
                SubLObject getter = (SubLObject)defstruct_sequence.NIL;
                SubLObject setter = (SubLObject)defstruct_sequence.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)defstruct_sequence.$list24);
                getter = current_$2.first();
                current_$2 = current_$2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)defstruct_sequence.$list24);
                setter = current_$2.first();
                current_$2 = current_$2.rest();
                if (defstruct_sequence.NIL == current_$2) {
                    if (type.eql((SubLObject)defstruct_sequence.$kw1$VECTOR)) {
                        getter_methods = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, getter, (SubLObject)defstruct_sequence.$list11, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym25$CHECK_TYPE, (SubLObject)defstruct_sequence.$sym26$OBJECT, predicate), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym27$AREF, (SubLObject)defstruct_sequence.$sym26$OBJECT, index))), getter_methods);
                    }
                    else if (type.eql((SubLObject)defstruct_sequence.$kw4$LIST)) {
                        getter_methods = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym10$DEFINE, getter, (SubLObject)defstruct_sequence.$list11, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym25$CHECK_TYPE, (SubLObject)defstruct_sequence.$sym26$OBJECT, predicate), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym12$RET, (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym28$NTH, index, (SubLObject)defstruct_sequence.$list11))), getter_methods);
                    }
                    if (type.eql((SubLObject)defstruct_sequence.$kw1$VECTOR)) {
                        setter_methods = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym10$DEFINE, setter, (SubLObject)defstruct_sequence.$list29, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym25$CHECK_TYPE, (SubLObject)defstruct_sequence.$sym26$OBJECT, predicate), (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym30$SET_AREF, (SubLObject)defstruct_sequence.$sym26$OBJECT, index, (SubLObject)defstruct_sequence.$list31), (SubLObject)defstruct_sequence.$list32), setter_methods);
                    }
                    else if (type.eql((SubLObject)defstruct_sequence.$kw4$LIST)) {
                        setter_methods = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym10$DEFINE, setter, (SubLObject)defstruct_sequence.$list29, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym25$CHECK_TYPE, (SubLObject)defstruct_sequence.$sym26$OBJECT, predicate), (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym33$SET_NTH, index, (SubLObject)defstruct_sequence.$list29), (SubLObject)defstruct_sequence.$list32), setter_methods);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)defstruct_sequence.$list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                getter_setter_pair = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.listS((SubLObject)defstruct_sequence.$sym34$PROGN, predicate_method, constructor_method, ConsesLow.append(Sequences.nreverse(getter_methods), Sequences.nreverse(setter_methods), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.IDENTITY, (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.$sym17$QUOTE, name)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)defstruct_sequence.$list9);
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/defstruct-sequence.lisp", position = 5093L)
    public static SubLObject defstruct_sequence_data(final SubLObject name, final SubLObject v_slots) {
        final SubLObject predicate = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), (SubLObject)defstruct_sequence.$str35$_P), control_vars.$cyc_package$.getGlobalValue());
        final SubLObject constructor = Packages.intern(Sequences.cconcatenate((SubLObject)defstruct_sequence.$str36$MAKE_, format_nil.format_nil_a_no_copy(name)), control_vars.$cyc_package$.getGlobalValue());
        SubLObject slot_keys = (SubLObject)defstruct_sequence.NIL;
        SubLObject getter_setter_pairs = (SubLObject)defstruct_sequence.NIL;
        SubLObject cdolist_list_var = v_slots;
        SubLObject slot = (SubLObject)defstruct_sequence.NIL;
        slot = cdolist_list_var.first();
        while (defstruct_sequence.NIL != cdolist_list_var) {
            final SubLObject slot_key = Symbols.make_keyword(slot);
            final SubLObject getter = Packages.intern(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[] { defstruct_sequence.$str37$_, format_nil.format_nil_a_no_copy(slot) }), control_vars.$cyc_package$.getGlobalValue());
            final SubLObject setter = Packages.intern(Sequences.cconcatenate((SubLObject)defstruct_sequence.$str38$SET_, new SubLObject[] { format_nil.format_nil_a_no_copy(name), defstruct_sequence.$str37$_, format_nil.format_nil_a_no_copy(slot) }), control_vars.$cyc_package$.getGlobalValue());
            slot_keys = (SubLObject)ConsesLow.cons(slot_key, slot_keys);
            getter_setter_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(getter, setter), getter_setter_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(predicate, constructor, Sequences.nreverse(slot_keys), Sequences.nreverse(getter_setter_pairs));
    }
    
    public static SubLObject declare_defstruct_sequence_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_vector", "DEFSTRUCT-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_list", "DEFSTRUCT-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_vector_constructor", "DEFSTRUCT-VECTOR-CONSTRUCTOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_list_constructor", "DEFSTRUCT-LIST-CONSTRUCTOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_sequence_internal", "DEFSTRUCT-SEQUENCE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.defstruct_sequence", "defstruct_sequence_data", "DEFSTRUCT-SEQUENCE-DATA", 2, 0, false);
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    public static SubLObject init_defstruct_sequence_file() {
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    public static SubLObject setup_defstruct_sequence_file() {
        utilities_macros.register_cyc_api_macro((SubLObject)defstruct_sequence.$sym2$DEFSTRUCT_VECTOR, (SubLObject)defstruct_sequence.$list0, (SubLObject)defstruct_sequence.$str3$A_simplified_version_of_DEFSTRUCT);
        utilities_macros.register_cyc_api_macro((SubLObject)defstruct_sequence.$sym5$DEFSTRUCT_LIST, (SubLObject)defstruct_sequence.$list0, (SubLObject)defstruct_sequence.$str6$A_simplified_version_of_DEFSTRUCT);
        access_macros.register_external_symbol((SubLObject)defstruct_sequence.$sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR);
        access_macros.register_macro_helper((SubLObject)defstruct_sequence.$sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR, (SubLObject)defstruct_sequence.$sym2$DEFSTRUCT_VECTOR);
        access_macros.register_external_symbol((SubLObject)defstruct_sequence.$sym8$DEFSTRUCT_LIST_CONSTRUCTOR);
        access_macros.register_macro_helper((SubLObject)defstruct_sequence.$sym8$DEFSTRUCT_LIST_CONSTRUCTOR, (SubLObject)defstruct_sequence.$sym5$DEFSTRUCT_LIST);
        generic_testing.define_test_case_table_int((SubLObject)defstruct_sequence.$sym39$DEFSTRUCT_SEQUENCE_INTERNAL, (SubLObject)ConsesLow.list(new SubLObject[] { defstruct_sequence.$kw40$TEST, Symbols.symbol_function((SubLObject)defstruct_sequence.EQUAL), defstruct_sequence.$kw41$OWNER, defstruct_sequence.NIL, defstruct_sequence.$kw42$CLASSES, defstruct_sequence.NIL, defstruct_sequence.$kw43$KB, defstruct_sequence.$kw44$TINY, defstruct_sequence.$kw45$WORKING_, defstruct_sequence.T }), (SubLObject)defstruct_sequence.$list46);
        return (SubLObject)defstruct_sequence.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_defstruct_sequence_file();
    }
    
    @Override
	public void initializeVariables() {
        init_defstruct_sequence_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_defstruct_sequence_file();
    }
    
    static {
        me = (SubLFile)new defstruct_sequence();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS"));
        $kw1$VECTOR = SubLObjectFactory.makeKeyword("VECTOR");
        $sym2$DEFSTRUCT_VECTOR = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR");
        $str3$A_simplified_version_of_DEFSTRUCT = SubLObjectFactory.makeString("A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $kw4$LIST = SubLObjectFactory.makeKeyword("LIST");
        $sym5$DEFSTRUCT_LIST = SubLObjectFactory.makeSymbol("DEFSTRUCT-LIST");
        $str6$A_simplified_version_of_DEFSTRUCT = SubLObjectFactory.makeString("A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");
        $sym7$DEFSTRUCT_VECTOR_CONSTRUCTOR = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR");
        $sym8$DEFSTRUCT_LIST_CONSTRUCTOR = SubLObjectFactory.makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCTOR"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("GETTER-SETTER-PAIRS"));
        $sym10$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym12$RET = SubLObjectFactory.makeSymbol("RET");
        $sym13$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTORP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym15$_ = SubLObjectFactory.makeSymbol("=");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")));
        $sym17$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.ZERO_INTEGER));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPER-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("SETTER"));
        $sym25$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym26$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym27$AREF = SubLObjectFactory.makeSymbol("AREF");
        $sym28$NTH = SubLObjectFactory.makeSymbol("NTH");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym30$SET_AREF = SubLObjectFactory.makeSymbol("SET-AREF");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")));
        $sym33$SET_NTH = SubLObjectFactory.makeSymbol("SET-NTH");
        $sym34$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $str35$_P = SubLObjectFactory.makeString("-P");
        $str36$MAKE_ = SubLObjectFactory.makeString("MAKE-");
        $str37$_ = SubLObjectFactory.makeString("-");
        $str38$SET_ = SubLObjectFactory.makeString("SET-");
        $sym39$DEFSTRUCT_SEQUENCE_INTERNAL = SubLObjectFactory.makeSymbol("DEFSTRUCT-SEQUENCE-INTERNAL");
        $kw40$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw41$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw42$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw43$KB = SubLObjectFactory.makeKeyword("KB");
        $kw44$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw45$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("KMG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ONE"), (SubLObject)SubLObjectFactory.makeSymbol("TWO"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTORP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)defstruct_sequence.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.ZERO_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-KMG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG")), (SubLObject)defstruct_sequence.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ONE"), (SubLObject)SubLObjectFactory.makeKeyword("TWO"))), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-ONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-TWO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KMG-ONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KMG-TWO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)defstruct_sequence.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.IDENTITY, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("KMG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ONE"), (SubLObject)SubLObjectFactory.makeSymbol("TWO"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPER-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)defstruct_sequence.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-KMG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG")), (SubLObject)defstruct_sequence.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ONE"), (SubLObject)SubLObjectFactory.makeKeyword("TWO"))), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-ONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)defstruct_sequence.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-TWO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)defstruct_sequence.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KMG-ONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)defstruct_sequence.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KMG-TWO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("KMG-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)defstruct_sequence.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)defstruct_sequence.IDENTITY, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KMG"))))));
    }
}

/*

	Total time: 174 ms
	
*/
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subcyclifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subcyclifier";
    public static final String myFingerPrint = "1a52cdac748c469de4d3d2df790c311e2fdac9b16423af009d40d9ad0051083f";
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLSymbol $dtp_cyclifier_pool$;
    private static final SubLSymbol $sym0$SUBCYCLIFIER;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$PROGN;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$DATE_CYCLIFIER;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$INSTANCE_COUNT;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS;
    private static final SubLSymbol $sym10$ISOLATED_P;
    private static final SubLSymbol $sym11$INSTANCE_NUMBER;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE;
    private static final SubLSymbol $sym13$APPLICABLE_P;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$GET_SISTER;
    private static final SubLSymbol $sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD;
    private static final SubLSymbol $sym19$CYCLIFY;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$GET_REFS;
    private static final SubLSymbol $sym22$GET_STRING;
    private static final SubLObject $const23$equals;
    private static final SubLSymbol $sym24$DATE_CYCLIFIER_CYCLIFY_METHOD;
    private static final SubLSymbol $sym25$CYCLIFIER_POOL;
    private static final SubLSymbol $sym26$CYCLIFIER_POOL_P;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$CYCLIFIER_POOL_PRINT;
    private static final SubLSymbol $sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$CYCLIFIER_POOL_CYCLIFIERS;
    private static final SubLSymbol $sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS;
    private static final SubLSymbol $kw36$CYCLIFIERS;
    private static final SubLString $str37$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw38$BEGIN;
    private static final SubLSymbol $sym39$MAKE_CYCLIFIER_POOL;
    private static final SubLSymbol $kw40$SLOT;
    private static final SubLSymbol $kw41$END;
    private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD;
    private static final SubLString $str43$__CYCLIFIER_POOL__;
    private static final SubLString $str44$_;
    private static final SubLSymbol $sym45$LISTP;
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 1586L)
    public static SubLObject subcyclifier_p(final SubLObject v_subcyclifier) {
        return interfaces.subloop_instanceof_interface(v_subcyclifier, (SubLObject)subcyclifier.$sym0$SUBCYCLIFIER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 1839L)
    public static SubLObject with_subcyclifier_assistance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)subcyclifier.$sym2$PROGN, (SubLObject)subcyclifier.$list3, ConsesLow.append(body, (SubLObject)subcyclifier.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2098L)
    public static SubLObject subcyclifier_cyclify(final SubLObject tree) {
        final SubLObject pool = cyclifier.get_subcyclifier_pool(tree);
        if (subcyclifier.NIL != pool) {
            return cyclifier_pool_cyclify(pool, tree);
        }
        return (SubLObject)subcyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2251L)
    public static SubLObject subloop_reserved_initialize_date_cyclifier_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subcyclifier.$sym5$OBJECT, (SubLObject)subcyclifier.$sym8$INSTANCE_COUNT, (SubLObject)subcyclifier.ZERO_INTEGER);
        return (SubLObject)subcyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2251L)
    public static SubLObject subloop_reserved_initialize_date_cyclifier_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subcyclifier.$sym5$OBJECT, (SubLObject)subcyclifier.$sym10$ISOLATED_P, (SubLObject)subcyclifier.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subcyclifier.$sym5$OBJECT, (SubLObject)subcyclifier.$sym11$INSTANCE_NUMBER, (SubLObject)subcyclifier.NIL);
        return (SubLObject)subcyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2251L)
    public static SubLObject date_cyclifier_p(final SubLObject date_cyclifier) {
        return classes.subloop_instanceof_class(date_cyclifier, (SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2455L)
    public static SubLObject date_cyclifier_applicable_p_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(subcyclifier.NIL != cyclifier_interface.cyclifiable_noun_phrase_p(tree) && subcyclifier.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)subcyclifier.$sym17$GET_SISTER, (SubLObject)subcyclifier.MINUS_ONE_INTEGER) && subcyclifier.NIL != cyclifier_interface.prepositional_or_particle_word_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)subcyclifier.$sym17$GET_SISTER, (SubLObject)subcyclifier.MINUS_ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 2842L)
    public static SubLObject date_cyclifier_cyclify_method(final SubLObject self, final SubLObject tree) {
        if (subcyclifier.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)subcyclifier.$sym13$APPLICABLE_P, tree)) {
            final SubLObject ref = methods.funcall_instance_method_with_0_args(tree, (SubLObject)subcyclifier.$sym21$GET_REFS).first();
            final SubLObject dates0 = (SubLObject)((subcyclifier.NIL != ref) ? date_utilities.parse_date_from_string(methods.funcall_instance_method_with_0_args(tree, (SubLObject)subcyclifier.$sym22$GET_STRING)) : subcyclifier.NIL);
            SubLObject dates2 = (SubLObject)subcyclifier.NIL;
            SubLObject cdolist_list_var = dates0;
            SubLObject date = (SubLObject)subcyclifier.NIL;
            date = cdolist_list_var.first();
            while (subcyclifier.NIL != cdolist_list_var) {
                dates2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(subcyclifier.$const23$equals, ref, date), dates2);
                cdolist_list_var = cdolist_list_var.rest();
                date = cdolist_list_var.first();
            }
            return dates2;
        }
        return (SubLObject)subcyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject cyclifier_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cyclifier_pool_print(v_object, stream, (SubLObject)subcyclifier.ZERO_INTEGER);
        return (SubLObject)subcyclifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject cyclifier_pool_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cyclifier_pool_native.class) ? subcyclifier.T : subcyclifier.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject cyclifier_pool_cyclifiers(final SubLObject v_object) {
        assert subcyclifier.NIL != cyclifier_pool_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject _csetf_cyclifier_pool_cyclifiers(final SubLObject v_object, final SubLObject value) {
        assert subcyclifier.NIL != cyclifier_pool_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject make_cyclifier_pool(SubLObject arglist) {
        if (arglist == subcyclifier.UNPROVIDED) {
            arglist = (SubLObject)subcyclifier.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cyclifier_pool_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subcyclifier.NIL, next = arglist; subcyclifier.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subcyclifier.$kw36$CYCLIFIERS)) {
                _csetf_cyclifier_pool_cyclifiers(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subcyclifier.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject visit_defstruct_cyclifier_pool(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subcyclifier.$kw38$BEGIN, (SubLObject)subcyclifier.$sym39$MAKE_CYCLIFIER_POOL, (SubLObject)subcyclifier.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subcyclifier.$kw40$SLOT, (SubLObject)subcyclifier.$kw36$CYCLIFIERS, cyclifier_pool_cyclifiers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subcyclifier.$kw41$END, (SubLObject)subcyclifier.$sym39$MAKE_CYCLIFIER_POOL, (SubLObject)subcyclifier.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3298L)
    public static SubLObject visit_defstruct_object_cyclifier_pool_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyclifier_pool(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3435L)
    public static SubLObject cyclifier_pool_print(final SubLObject pool, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)subcyclifier.$str43$__CYCLIFIER_POOL__, stream, (SubLObject)subcyclifier.UNPROVIDED, (SubLObject)subcyclifier.UNPROVIDED);
        print_high.princ(cyclifier_pool_cyclifiers(pool), stream);
        streams_high.write_string((SubLObject)subcyclifier.$str44$_, stream, (SubLObject)subcyclifier.UNPROVIDED, (SubLObject)subcyclifier.UNPROVIDED);
        return pool;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 3691L)
    public static SubLObject new_cyclifier_pool(final SubLObject cyclifiers) {
        assert subcyclifier.NIL != Types.listp(cyclifiers) : cyclifiers;
        final SubLObject pool = make_cyclifier_pool((SubLObject)subcyclifier.UNPROVIDED);
        SubLObject cdolist_list_var = Sequences.reverse(cyclifiers);
        SubLObject v_cyclifier = (SubLObject)subcyclifier.NIL;
        v_cyclifier = cdolist_list_var.first();
        while (subcyclifier.NIL != cdolist_list_var) {
            cyclifier_pool_add(pool, v_cyclifier);
            cdolist_list_var = cdolist_list_var.rest();
            v_cyclifier = cdolist_list_var.first();
        }
        return pool;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 4066L)
    public static SubLObject cyclifier_pool_add(final SubLObject pool, final SubLObject v_cyclifier) {
        assert subcyclifier.NIL != cyclifier_pool_p(pool) : pool;
        _csetf_cyclifier_pool_cyclifiers(pool, (SubLObject)ConsesLow.cons(v_cyclifier, cyclifier_pool_cyclifiers(pool)));
        return pool;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcyclifier.lisp", position = 4342L)
    public static SubLObject cyclifier_pool_cyclify(final SubLObject pool, final SubLObject v_object) {
        assert subcyclifier.NIL != cyclifier_pool_p(pool) : pool;
        SubLObject result = (SubLObject)subcyclifier.NIL;
        if (subcyclifier.NIL == result) {
            SubLObject csome_list_var = cyclifier_pool_cyclifiers(pool);
            SubLObject v_cyclifier = (SubLObject)subcyclifier.NIL;
            v_cyclifier = csome_list_var.first();
            while (subcyclifier.NIL == result && subcyclifier.NIL != csome_list_var) {
                if (subcyclifier.NIL != methods.funcall_instance_method_with_1_args(v_cyclifier, (SubLObject)subcyclifier.$sym13$APPLICABLE_P, v_object)) {
                    result = methods.funcall_instance_method_with_1_args(v_cyclifier, (SubLObject)subcyclifier.$sym19$CYCLIFY, v_object);
                }
                csome_list_var = csome_list_var.rest();
                v_cyclifier = csome_list_var.first();
            }
        }
        return result;
    }
    
    public static SubLObject declare_subcyclifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "subcyclifier_p", "SUBCYCLIFIER-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subcyclifier", "with_subcyclifier_assistance", "WITH-SUBCYCLIFIER-ASSISTANCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "subcyclifier_cyclify", "SUBCYCLIFIER-CYCLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "subloop_reserved_initialize_date_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "subloop_reserved_initialize_date_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "date_cyclifier_p", "DATE-CYCLIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "date_cyclifier_applicable_p_method", "DATE-CYCLIFIER-APPLICABLE-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "date_cyclifier_cyclify_method", "DATE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_print_function_trampoline", "CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_p", "CYCLIFIER-POOL-P", 1, 0, false);
        new $cyclifier_pool_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_cyclifiers", "CYCLIFIER-POOL-CYCLIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "_csetf_cyclifier_pool_cyclifiers", "_CSETF-CYCLIFIER-POOL-CYCLIFIERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "make_cyclifier_pool", "MAKE-CYCLIFIER-POOL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "visit_defstruct_cyclifier_pool", "VISIT-DEFSTRUCT-CYCLIFIER-POOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "visit_defstruct_object_cyclifier_pool_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_print", "CYCLIFIER-POOL-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "new_cyclifier_pool", "NEW-CYCLIFIER-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_add", "CYCLIFIER-POOL-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcyclifier", "cyclifier_pool_cyclify", "CYCLIFIER-POOL-CYCLIFY", 2, 0, false);
        return (SubLObject)subcyclifier.NIL;
    }
    
    public static SubLObject init_subcyclifier_file() {
        subcyclifier.$dtp_cyclifier_pool$ = SubLFiles.defconstant("*DTP-CYCLIFIER-POOL*", (SubLObject)subcyclifier.$sym25$CYCLIFIER_POOL);
        return (SubLObject)subcyclifier.NIL;
    }
    
    public static SubLObject setup_subcyclifier_file() {
        interfaces.new_interface((SubLObject)subcyclifier.$sym0$SUBCYCLIFIER, (SubLObject)subcyclifier.NIL, (SubLObject)subcyclifier.NIL, (SubLObject)subcyclifier.$list1);
        classes.subloop_new_class((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$sym5$OBJECT, (SubLObject)subcyclifier.$list6, (SubLObject)subcyclifier.NIL, (SubLObject)subcyclifier.$list7);
        classes.class_set_implements_slot_listeners((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE);
        subloop_reserved_initialize_date_cyclifier_class((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER);
        methods.methods_incorporate_instance_method((SubLObject)subcyclifier.$sym13$APPLICABLE_P, (SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$list14, (SubLObject)subcyclifier.$list15, (SubLObject)subcyclifier.$list16);
        methods.subloop_register_instance_method((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$sym13$APPLICABLE_P, (SubLObject)subcyclifier.$sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subcyclifier.$sym19$CYCLIFY, (SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$list14, (SubLObject)subcyclifier.$list15, (SubLObject)subcyclifier.$list20);
        methods.subloop_register_instance_method((SubLObject)subcyclifier.$sym4$DATE_CYCLIFIER, (SubLObject)subcyclifier.$sym19$CYCLIFY, (SubLObject)subcyclifier.$sym24$DATE_CYCLIFIER_CYCLIFY_METHOD);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subcyclifier.$dtp_cyclifier_pool$.getGlobalValue(), Symbols.symbol_function((SubLObject)subcyclifier.$sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subcyclifier.$list33);
        Structures.def_csetf((SubLObject)subcyclifier.$sym34$CYCLIFIER_POOL_CYCLIFIERS, (SubLObject)subcyclifier.$sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS);
        Equality.identity((SubLObject)subcyclifier.$sym25$CYCLIFIER_POOL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subcyclifier.$dtp_cyclifier_pool$.getGlobalValue(), Symbols.symbol_function((SubLObject)subcyclifier.$sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD));
        return (SubLObject)subcyclifier.NIL;
    }
    
    public void declareFunctions() {
        declare_subcyclifier_file();
    }
    
    public void initializeVariables() {
        init_subcyclifier_file();
    }
    
    public void runTopLevelForms() {
        setup_subcyclifier_file();
    }
    
    static {
        me = (SubLFile)new subcyclifier();
        subcyclifier.$dtp_cyclifier_pool$ = null;
        $sym0$SUBCYCLIFIER = SubLObjectFactory.makeSymbol("SUBCYCLIFIER");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))));
        $sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SUBCYCLIFIER-POOL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)subcyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-CYCLIFY"), (SubLObject)SubLObjectFactory.makeSymbol("POOL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")))));
        $sym4$DATE_CYCLIFIER = SubLObjectFactory.makeSymbol("DATE-CYCLIFIER");
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCYCLIFIER"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym8$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS");
        $sym10$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym11$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE");
        $sym13$APPLICABLE_P = SubLObjectFactory.makeSymbol("APPLICABLE-P");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-interface-p; the tree to be checked for applicability of this cyclifier\n   @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-NOUN-PHRASE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)subcyclifier.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)subcyclifier.MINUS_ONE_INTEGER)))));
        $sym17$GET_SISTER = SubLObjectFactory.makeSymbol("GET-SISTER");
        $sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD = SubLObjectFactory.makeSymbol("DATE-CYCLIFIER-APPLICABLE-P-METHOD");
        $sym19$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-interface-p; the tree that needs cyclification\n   @return listp; a list of cycl translations of TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATES0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATES"), (SubLObject)subcyclifier.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("DATES0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)SubLObjectFactory.makeSymbol("DATES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DATES")))));
        $sym21$GET_REFS = SubLObjectFactory.makeSymbol("GET-REFS");
        $sym22$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $const23$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym24$DATE_CYCLIFIER_CYCLIFY_METHOD = SubLObjectFactory.makeSymbol("DATE-CYCLIFIER-CYCLIFY-METHOD");
        $sym25$CYCLIFIER_POOL = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL");
        $sym26$CYCLIFIER_POOL_P = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-P");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIERS"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCLIFIERS"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-CYCLIFIERS"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS"));
        $sym31$CYCLIFIER_POOL_PRINT = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-PRINT");
        $sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-P"));
        $sym34$CYCLIFIER_POOL_CYCLIFIERS = SubLObjectFactory.makeSymbol("CYCLIFIER-POOL-CYCLIFIERS");
        $sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS = SubLObjectFactory.makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS");
        $kw36$CYCLIFIERS = SubLObjectFactory.makeKeyword("CYCLIFIERS");
        $str37$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw38$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym39$MAKE_CYCLIFIER_POOL = SubLObjectFactory.makeSymbol("MAKE-CYCLIFIER-POOL");
        $kw40$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw41$END = SubLObjectFactory.makeKeyword("END");
        $sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD");
        $str43$__CYCLIFIER_POOL__ = SubLObjectFactory.makeString("#<CYCLIFIER-POOL: ");
        $str44$_ = SubLObjectFactory.makeString(">");
        $sym45$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    }
    
    public static final class $cyclifier_pool_native extends SubLStructNative
    {
        public SubLObject $cyclifiers;
        private static final SubLStructDeclNative structDecl;
        
        public $cyclifier_pool_native() {
            this.$cyclifiers = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cyclifier_pool_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cyclifiers;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cyclifiers = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cyclifier_pool_native.class, subcyclifier.$sym25$CYCLIFIER_POOL, subcyclifier.$sym26$CYCLIFIER_POOL_P, subcyclifier.$list27, subcyclifier.$list28, new String[] { "$cyclifiers" }, subcyclifier.$list29, subcyclifier.$list30, subcyclifier.$sym31$CYCLIFIER_POOL_PRINT);
        }
    }
    
    public static final class $cyclifier_pool_p$UnaryFunction extends UnaryFunction
    {
        public $cyclifier_pool_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCLIFIER-POOL-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return subcyclifier.cyclifier_pool_p(arg1);
        }
    }
}

/*

	Total time: 169 ms
	
*/
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shelfs extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shelfs";
    public static final String myFingerPrint = "8bdcf061171a1d02bf9d01396f9e31fbe5211b35ebb68b60bd482bdee12e4d2d";
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLSymbol $dtp_shelf_info$;
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLSymbol $dtp_shelf$;
    private static final SubLSymbol $sym0$SHELF_INFO;
    private static final SubLSymbol $sym1$SHELF_INFO_P;
    private static final SubLInteger $int2$134;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$SHELF_INFO_KEY;
    private static final SubLSymbol $sym11$_CSETF_SHELF_INFO_KEY;
    private static final SubLSymbol $sym12$SHELF_INFO_TEST;
    private static final SubLSymbol $sym13$_CSETF_SHELF_INFO_TEST;
    private static final SubLSymbol $sym14$SHELF_INFO_COMPARE;
    private static final SubLSymbol $sym15$_CSETF_SHELF_INFO_COMPARE;
    private static final SubLSymbol $sym16$SHELF_INFO_MINOR_LIMIT;
    private static final SubLSymbol $sym17$_CSETF_SHELF_INFO_MINOR_LIMIT;
    private static final SubLSymbol $sym18$SHELF_INFO_MAJOR_LIMIT;
    private static final SubLSymbol $sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT;
    private static final SubLSymbol $kw20$KEY;
    private static final SubLSymbol $kw21$TEST;
    private static final SubLSymbol $kw22$COMPARE;
    private static final SubLSymbol $kw23$MINOR_LIMIT;
    private static final SubLSymbol $kw24$MAJOR_LIMIT;
    private static final SubLString $str25$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw26$BEGIN;
    private static final SubLSymbol $sym27$MAKE_SHELF_INFO;
    private static final SubLSymbol $kw28$SLOT;
    private static final SubLSymbol $kw29$END;
    private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD;
    private static final SubLSymbol $sym31$SHELF;
    private static final SubLSymbol $sym32$SHELF_P;
    private static final SubLInteger $int33$135;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PRINT_SHELF;
    private static final SubLSymbol $sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$_CSETF_SHELF_INFO;
    private static final SubLSymbol $sym42$SHELF_PAYLOAD;
    private static final SubLSymbol $sym43$_CSETF_SHELF_PAYLOAD;
    private static final SubLSymbol $sym44$SHELF_SIZE;
    private static final SubLSymbol $sym45$_CSETF_SHELF_SIZE;
    private static final SubLSymbol $kw46$INFO;
    private static final SubLSymbol $kw47$PAYLOAD;
    private static final SubLSymbol $kw48$SIZE;
    private static final SubLSymbol $sym49$MAKE_SHELF;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD;
    private static final SubLString $str51$_D_items;
    private static final SubLString $str52$__unfinalized_;
    private static final SubLString $str53$Finalizing__S_before_its_time_;
    private static final SubLString $str54$_S_has_already_been_finalized_;
    private static final SubLString $str55$Shelf__S_being_finalized_with_les;
    private static final SubLSymbol $sym56$NULL;
    private static final SubLString $str57$Finalize_it_;
    private static final SubLString $str58$_S_has_not_been_finalized_;
    private static final SubLList $list59;
    private static final SubLString $str60$do_shelf;
    private static final SubLSymbol $sym61$SHELF_VAR;
    private static final SubLSymbol $sym62$PAYLOAD;
    private static final SubLSymbol $sym63$I;
    private static final SubLSymbol $sym64$VECTOR;
    private static final SubLSymbol $sym65$DATA;
    private static final SubLSymbol $sym66$CLET;
    private static final SubLSymbol $sym67$CSETQ;
    private static final SubLSymbol $sym68$_PROGRESS_NOTE_;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$_PROGRESS_TOTAL_;
    private static final SubLSymbol $sym71$SHELF_APPROXIMATE_COUNT;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym74$PIF;
    private static final SubLSymbol $sym75$SHELF_FINALIZED_P;
    private static final SubLSymbol $sym76$VECTORP;
    private static final SubLSymbol $sym77$CDOTIMES;
    private static final SubLSymbol $sym78$LENGTH;
    private static final SubLSymbol $sym79$AREF;
    private static final SubLSymbol $sym80$PWHEN;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$PROGN;
    private static final SubLSymbol $sym83$CDOLIST;
    private static final SubLSymbol $sym84$CDAR;
    private static final SubLSymbol $sym85$CDR;
    private static final SubLSymbol $sym86$CAR;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$SHELF_VAR;
    private static final SubLSymbol $sym89$VECTOR;
    private static final SubLSymbol $sym90$LOW;
    private static final SubLSymbol $sym91$HIGH;
    private static final SubLSymbol $sym92$I;
    private static final SubLSymbol $sym93$LENGTH;
    private static final SubLSymbol $sym94$PUNLESS;
    private static final SubLSymbol $sym95$FINALIZE_SHELF;
    private static final SubLSymbol $sym96$REARRANGE_SHELF;
    private static final SubLSymbol $sym97$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym98$BSEARCH_SHELF_VECTOR_RANGE;
    private static final SubLSymbol $sym99$CDO;
    private static final SubLSymbol $sym100$_;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$CNOT;
    private static final SubLSymbol $sym103$_;
    private static final SubLSymbol $sym104$CSETF;
    private static final SubLSymbol $sym105$_;
    private static final SubLList $list106;
    private static final SubLString $str107$Ignore_the_addition_;
    private static final SubLString $str108$Attempt_to_add__S_to__S_;
    private static final SubLSymbol $sym109$ITERATOR_SHELF_DONE;
    private static final SubLSymbol $sym110$ITERATOR_SHELF_NEXT;
    private static final SubLSymbol $sym111$VECTOR;
    private static final SubLSymbol $sym112$BOOLEAN;
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)shelfs.ZERO_INTEGER);
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $shelf_info_native.class) ? shelfs.T : shelfs.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_key(final SubLObject v_object) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_test(final SubLObject v_object) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_compare(final SubLObject v_object) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_minor_limit(final SubLObject v_object) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject shelf_info_major_limit(final SubLObject v_object) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject _csetf_shelf_info_key(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject _csetf_shelf_info_test(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject _csetf_shelf_info_compare(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject _csetf_shelf_info_minor_limit(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject _csetf_shelf_info_major_limit(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject make_shelf_info(SubLObject arglist) {
        if (arglist == shelfs.UNPROVIDED) {
            arglist = (SubLObject)shelfs.NIL;
        }
        final SubLObject v_new = (SubLObject)new $shelf_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)shelfs.NIL, next = arglist; shelfs.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)shelfs.$kw20$KEY)) {
                _csetf_shelf_info_key(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw21$TEST)) {
                _csetf_shelf_info_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw22$COMPARE)) {
                _csetf_shelf_info_compare(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw23$MINOR_LIMIT)) {
                _csetf_shelf_info_minor_limit(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw24$MAJOR_LIMIT)) {
                _csetf_shelf_info_major_limit(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)shelfs.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject visit_defstruct_shelf_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw26$BEGIN, (SubLObject)shelfs.$sym27$MAKE_SHELF_INFO, (SubLObject)shelfs.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw20$KEY, shelf_info_key(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw21$TEST, shelf_info_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw22$COMPARE, shelf_info_compare(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw23$MINOR_LIMIT, shelf_info_minor_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw24$MAJOR_LIMIT, shelf_info_major_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw29$END, (SubLObject)shelfs.$sym27$MAKE_SHELF_INFO, (SubLObject)shelfs.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4054L)
    public static SubLObject visit_defstruct_object_shelf_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_shelf_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject shelf_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_shelf(v_object, stream, (SubLObject)shelfs.ZERO_INTEGER);
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject shelf_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $shelf_native.class) ? shelfs.T : shelfs.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject shelf_info(final SubLObject v_object) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject shelf_payload(final SubLObject v_object) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject shelf_size(final SubLObject v_object) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject _csetf_shelf_info(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject _csetf_shelf_payload(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject _csetf_shelf_size(final SubLObject v_object, final SubLObject value) {
        assert shelfs.NIL != shelf_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject make_shelf(SubLObject arglist) {
        if (arglist == shelfs.UNPROVIDED) {
            arglist = (SubLObject)shelfs.NIL;
        }
        final SubLObject v_new = (SubLObject)new $shelf_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)shelfs.NIL, next = arglist; shelfs.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)shelfs.$kw46$INFO)) {
                _csetf_shelf_info(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw47$PAYLOAD)) {
                _csetf_shelf_payload(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)shelfs.$kw48$SIZE)) {
                _csetf_shelf_size(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)shelfs.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject visit_defstruct_shelf(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw26$BEGIN, (SubLObject)shelfs.$sym49$MAKE_SHELF, (SubLObject)shelfs.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw46$INFO, shelf_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw47$PAYLOAD, shelf_payload(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw28$SLOT, (SubLObject)shelfs.$kw48$SIZE, shelf_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)shelfs.$kw29$END, (SubLObject)shelfs.$sym49$MAKE_SHELF, (SubLObject)shelfs.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4160L)
    public static SubLObject visit_defstruct_object_shelf_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_shelf(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4270L)
    public static SubLObject shelf_finalized_p(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        return (SubLObject)SubLObjectFactory.makeBoolean(payload.isVector() || !payload.first().isNumber());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4478L)
    public static SubLObject print_shelf(final SubLObject shelf, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shelfs.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(shelf, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, shelf, (SubLObject)shelfs.T, (SubLObject)shelfs.T);
            PrintLow.format(stream, (SubLObject)shelfs.$str51$_D_items, shelf_approximate_count(shelf));
            if (shelfs.NIL == shelf_finalized_p(shelf)) {
                streams_high.write_string((SubLObject)shelfs.$str52$__unfinalized_, stream, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, shelf, (SubLObject)shelfs.T, (SubLObject)shelfs.T);
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 4763L)
    public static SubLObject allocate_shelf(final SubLObject size, final SubLObject info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject shelf = make_shelf((SubLObject)shelfs.UNPROVIDED);
        _csetf_shelf_info(shelf, info);
        if (shelfs.NIL != size) {
            SubLObject vector = (SubLObject)shelfs.NIL;
            final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                vector = Vectors.make_vector(size, (SubLObject)shelfs.UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
            }
            _csetf_shelf_payload(shelf, (SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, vector));
        }
        else {
            _csetf_shelf_payload(shelf, (SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, (SubLObject)shelfs.NIL));
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 5075L)
    public static SubLObject initial_add_to_shelf(final SubLObject item, final SubLObject shelf) {
        if (shelfs.NIL != shelf_finalized_p(shelf)) {
            add_to_shelf(item, shelf);
        }
        else {
            final SubLObject payload = shelf_payload(shelf);
            final SubLObject data = payload.rest();
            final SubLObject idx = payload.first();
            if (data.isVector()) {
                if (idx.numGE(Sequences.length(data))) {
                    Errors.warn((SubLObject)shelfs.$str53$Finalizing__S_before_its_time_, shelf);
                    finalize_shelf(shelf);
                    add_to_shelf(item, shelf);
                }
                else {
                    Vectors.set_aref(data, idx, item);
                    ConsesLow.rplaca(payload, Numbers.add(payload.first(), (SubLObject)shelfs.ONE_INTEGER));
                }
            }
            else {
                ConsesLow.rplacd(payload, (SubLObject)ConsesLow.cons(item, payload.rest()));
                ConsesLow.rplaca(payload, Numbers.add(payload.first(), (SubLObject)shelfs.ONE_INTEGER));
            }
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 5662L)
    public static SubLObject finalize_shelf(final SubLObject shelf) {
        if (shelfs.NIL != shelf_finalized_p(shelf)) {
            Errors.warn((SubLObject)shelfs.$str54$_S_has_already_been_finalized_, shelf);
        }
        else {
            SubLObject payload = shelf_payload(shelf);
            final SubLObject count = payload.first();
            final SubLObject info = shelf_info(shelf);
            SubLObject data = payload.rest();
            SubLObject vector = (SubLObject)shelfs.NIL;
            if (data.isVector()) {
                if (count.numL(Sequences.length(data))) {
                    Errors.warn((SubLObject)shelfs.$str55$Shelf__S_being_finalized_with_les, shelf, Sequences.length(data));
                    vector = Vectors.make_vector(count, (SubLObject)shelfs.UNPROVIDED);
                    SubLObject i;
                    for (i = (SubLObject)shelfs.NIL, i = (SubLObject)shelfs.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)shelfs.ONE_INTEGER)) {
                        Vectors.set_aref(vector, i, Vectors.aref(data, i));
                    }
                }
                else {
                    vector = data;
                }
            }
            else {
                vector = Vectors.make_vector(payload.first(), (SubLObject)shelfs.UNPROVIDED);
                SubLObject current;
                SubLObject j;
                for (current = (SubLObject)shelfs.NIL, j = (SubLObject)shelfs.NIL, current = data, j = (SubLObject)shelfs.ZERO_INTEGER; shelfs.NIL != current; current = current.rest(), j = Numbers.add(j, (SubLObject)shelfs.ONE_INTEGER)) {
                    Vectors.set_aref(vector, j, current.first());
                }
            }
            Sort.sort(vector, shelf_info_compare(info), shelf_info_key(info));
            _csetf_shelf_payload(shelf, vector);
            payload = (SubLObject)shelfs.NIL;
            data = (SubLObject)shelfs.NIL;
            vector = (SubLObject)shelfs.NIL;
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 6760L)
    public static SubLObject shelf_count(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return payload.first();
        }
        if (payload.isVector()) {
            return list_utilities.count_if_not(Symbols.symbol_function((SubLObject)shelfs.$sym56$NULL), payload, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED);
        }
        SubLObject count = (SubLObject)shelfs.ZERO_INTEGER;
        count = Numbers.add(count, conses_high.caar(payload));
        SubLObject cdolist_list_var = payload.rest();
        SubLObject vector = (SubLObject)shelfs.NIL;
        vector = cdolist_list_var.first();
        while (shelfs.NIL != cdolist_list_var) {
            count = Numbers.add(count, list_utilities.count_if_not(Symbols.symbol_function((SubLObject)shelfs.$sym56$NULL), vector, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            vector = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 7145L)
    public static SubLObject shelf_approximate_count(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return payload.first();
        }
        if (payload.isVector()) {
            return Sequences.length(payload);
        }
        SubLObject count = (SubLObject)shelfs.ZERO_INTEGER;
        count = Numbers.add(count, conses_high.caar(payload));
        SubLObject cdolist_list_var = payload.rest();
        SubLObject vector = (SubLObject)shelfs.NIL;
        vector = cdolist_list_var.first();
        while (shelfs.NIL != cdolist_list_var) {
            count = Numbers.add(count, Sequences.length(vector));
            cdolist_list_var = cdolist_list_var.rest();
            vector = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 7546L)
    public static SubLObject shelf_major_count(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return payload.first();
        }
        if (payload.isVector()) {
            return Sequences.length(payload);
        }
        return Sequences.length(conses_high.last(payload, (SubLObject)shelfs.UNPROVIDED).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 7849L)
    public static SubLObject shelf_minor_count(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return (SubLObject)shelfs.ZERO_INTEGER;
        }
        if (payload.isVector()) {
            return (SubLObject)shelfs.ZERO_INTEGER;
        }
        SubLObject count = (SubLObject)shelfs.ZERO_INTEGER;
        SubLObject vectors;
        for (vectors = (SubLObject)shelfs.NIL, vectors = payload.rest(); shelfs.NIL != vectors.rest(); vectors = vectors.rest()) {
            count = Numbers.add(count, Sequences.length(vectors.first()));
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 8228L)
    public static SubLObject shelf_extra_count(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return (SubLObject)shelfs.ZERO_INTEGER;
        }
        if (payload.isVector()) {
            return (SubLObject)shelfs.ZERO_INTEGER;
        }
        return conses_high.caar(payload);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 8477L)
    public static SubLObject rearrange_shelf(final SubLObject shelf) {
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            Errors.cerror((SubLObject)shelfs.$str57$Finalize_it_, (SubLObject)shelfs.$str58$_S_has_not_been_finalized_, shelf);
            finalize_shelf(shelf);
        }
        final SubLObject new_vector = Vectors.make_vector(shelf_count(shelf), (SubLObject)shelfs.UNPROVIDED);
        final SubLObject payload = shelf_payload(shelf);
        SubLObject idx = (SubLObject)shelfs.ZERO_INTEGER;
        if (payload.isVector()) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject item;
            for (cdotimes_end_var = Sequences.length(payload), i = (SubLObject)shelfs.NIL, i = (SubLObject)shelfs.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)shelfs.ONE_INTEGER)) {
                item = Vectors.aref(payload, i);
                if (shelfs.NIL != item) {
                    Vectors.set_aref(new_vector, idx, item);
                    idx = Numbers.add(idx, (SubLObject)shelfs.ONE_INTEGER);
                }
            }
        }
        else {
            SubLObject cdolist_list_var = conses_high.cdar(payload);
            SubLObject item2 = (SubLObject)shelfs.NIL;
            item2 = cdolist_list_var.first();
            while (shelfs.NIL != cdolist_list_var) {
                Vectors.set_aref(new_vector, idx, item2);
                idx = Numbers.add(idx, (SubLObject)shelfs.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            }
            cdolist_list_var = payload.rest();
            SubLObject vector = (SubLObject)shelfs.NIL;
            vector = cdolist_list_var.first();
            while (shelfs.NIL != cdolist_list_var) {
                SubLObject cdotimes_end_var2;
                SubLObject j;
                SubLObject item3;
                for (cdotimes_end_var2 = Sequences.length(vector), j = (SubLObject)shelfs.NIL, j = (SubLObject)shelfs.ZERO_INTEGER; j.numL(cdotimes_end_var2); j = Numbers.add(j, (SubLObject)shelfs.ONE_INTEGER)) {
                    item3 = Vectors.aref(vector, j);
                    if (shelfs.NIL != item3) {
                        Vectors.set_aref(new_vector, idx, item3);
                        idx = Numbers.add(idx, (SubLObject)shelfs.ONE_INTEGER);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                vector = cdolist_list_var.first();
            }
        }
        final SubLObject info = shelf_info(shelf);
        Sort.sort(new_vector, shelf_info_compare(info), shelf_info_key(info));
        _csetf_shelf_payload(shelf, new_vector);
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 9470L)
    public static SubLObject tidy_shelf(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        final SubLObject vector = Vectors.make_vector(conses_high.caar(payload), (SubLObject)shelfs.UNPROVIDED);
        SubLObject idx = (SubLObject)shelfs.ZERO_INTEGER;
        SubLObject cdolist_list_var = conses_high.cdar(payload);
        SubLObject item = (SubLObject)shelfs.NIL;
        item = cdolist_list_var.first();
        while (shelfs.NIL != cdolist_list_var) {
            Vectors.set_aref(vector, idx, item);
            idx = Numbers.add(idx, (SubLObject)shelfs.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        final SubLObject info = shelf_info(shelf);
        Sort.sort(vector, shelf_info_compare(info), shelf_info_key(info));
        _csetf_shelf_payload(shelf, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, (SubLObject)shelfs.NIL), vector, payload.rest()));
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 9951L)
    public static SubLObject do_shelf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)shelfs.NIL;
        SubLObject shelf = (SubLObject)shelfs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list59);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list59);
        shelf = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : shelfs.$str60$do_shelf);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)shelfs.$list59);
        current = current.rest();
        if (shelfs.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject shelf_var = (SubLObject)shelfs.$sym61$SHELF_VAR;
            final SubLObject payload = (SubLObject)shelfs.$sym62$PAYLOAD;
            final SubLObject i = (SubLObject)shelfs.$sym63$I;
            final SubLObject vector = (SubLObject)shelfs.$sym64$VECTOR;
            final SubLObject data = (SubLObject)shelfs.$sym65$DATA;
            return (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(shelf_var, shelf), (SubLObject)ConsesLow.list(payload, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym42$SHELF_PAYLOAD, shelf_var))), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym67$CSETQ, (SubLObject)shelfs.$sym68$_PROGRESS_NOTE_, message), (SubLObject)shelfs.$list69, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym67$CSETQ, (SubLObject)shelfs.$sym70$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym71$SHELF_APPROXIMATE_COUNT, shelf_var)), (SubLObject)shelfs.$list72, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym73$NOTING_PERCENT_PROGRESS, (SubLObject)shelfs.$sym68$_PROGRESS_NOTE_, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym74$PIF, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym75$SHELF_FINALIZED_P, shelf_var), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym74$PIF, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym76$VECTORP, payload), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym77$CDOTIMES, (SubLObject)ConsesLow.list(i, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym78$LENGTH, payload)), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym79$AREF, payload, i))), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym80$PWHEN, var, ConsesLow.append(body, (SubLObject)shelfs.NIL)), (SubLObject)shelfs.$list81)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym82$PROGN, (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym83$CDOLIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym84$CDAR, payload)), ConsesLow.append(body, (SubLObject)shelfs.$list81)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym83$CDOLIST, (SubLObject)ConsesLow.list(vector, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym85$CDR, payload)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym77$CDOTIMES, (SubLObject)ConsesLow.list(i, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym78$LENGTH, vector)), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym79$AREF, vector, i))), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym80$PWHEN, var, ConsesLow.append(body, (SubLObject)shelfs.NIL)), (SubLObject)shelfs.$list81))))), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym82$PROGN, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(data, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym85$CDR, payload))), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym74$PIF, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym76$VECTORP, data), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym77$CDOTIMES, (SubLObject)ConsesLow.list(i, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym86$CAR, payload)), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym79$AREF, payload, i))), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym80$PWHEN, var, ConsesLow.append(body, (SubLObject)shelfs.NIL)), (SubLObject)shelfs.$list81)), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym83$CDOLIST, (SubLObject)ConsesLow.list(var, data), ConsesLow.append(body, (SubLObject)shelfs.$list81))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shelfs.$list59);
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 11505L)
    public static SubLObject map_shelf(final SubLObject function, final SubLObject shelf, SubLObject message) {
        if (message == shelfs.UNPROVIDED) {
            message = (SubLObject)shelfs.$str60$do_shelf;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject payload = shelf_payload(shelf);
        utilities_macros.$progress_note$.setDynamicValue(message, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(shelf_approximate_count(shelf), thread);
        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)shelfs.ZERO_INTEGER, thread);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)shelfs.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)shelfs.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)shelfs.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                if (shelfs.NIL != shelf_finalized_p(shelf)) {
                    if (payload.isVector()) {
                        SubLObject cdotimes_end_var;
                        SubLObject i;
                        SubLObject item;
                        for (cdotimes_end_var = Sequences.length(payload), i = (SubLObject)shelfs.NIL, i = (SubLObject)shelfs.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)shelfs.ONE_INTEGER)) {
                            item = Vectors.aref(payload, i);
                            if (shelfs.NIL != item) {
                                Functions.funcall(function, item);
                            }
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)shelfs.ONE_INTEGER), thread);
                        }
                    }
                    else {
                        SubLObject cdolist_list_var = conses_high.cdar(payload);
                        SubLObject item2 = (SubLObject)shelfs.NIL;
                        item2 = cdolist_list_var.first();
                        while (shelfs.NIL != cdolist_list_var) {
                            Functions.funcall(function, item2);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)shelfs.ONE_INTEGER), thread);
                            cdolist_list_var = cdolist_list_var.rest();
                            item2 = cdolist_list_var.first();
                        }
                        cdolist_list_var = payload.rest();
                        SubLObject vector = (SubLObject)shelfs.NIL;
                        vector = cdolist_list_var.first();
                        while (shelfs.NIL != cdolist_list_var) {
                            SubLObject cdotimes_end_var2;
                            SubLObject j;
                            SubLObject item3;
                            for (cdotimes_end_var2 = Sequences.length(vector), j = (SubLObject)shelfs.NIL, j = (SubLObject)shelfs.ZERO_INTEGER; j.numL(cdotimes_end_var2); j = Numbers.add(j, (SubLObject)shelfs.ONE_INTEGER)) {
                                item3 = Vectors.aref(vector, j);
                                if (shelfs.NIL != item3) {
                                    Functions.funcall(function, item3);
                                }
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)shelfs.ONE_INTEGER), thread);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            vector = cdolist_list_var.first();
                        }
                    }
                }
                else {
                    final SubLObject data = payload.rest();
                    if (data.isVector()) {
                        SubLObject cdotimes_end_var3;
                        SubLObject k;
                        SubLObject item4;
                        for (cdotimes_end_var3 = payload.first(), k = (SubLObject)shelfs.NIL, k = (SubLObject)shelfs.ZERO_INTEGER; k.numL(cdotimes_end_var3); k = Numbers.add(k, (SubLObject)shelfs.ONE_INTEGER)) {
                            item4 = Vectors.aref(payload, k);
                            if (shelfs.NIL != item4) {
                                Functions.funcall(function, item4);
                            }
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)shelfs.ONE_INTEGER), thread);
                        }
                    }
                    else {
                        SubLObject cdolist_list_var2 = data;
                        SubLObject item = (SubLObject)shelfs.NIL;
                        item = cdolist_list_var2.first();
                        while (shelfs.NIL != cdolist_list_var2) {
                            Functions.funcall(function, item);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)shelfs.ONE_INTEGER), thread);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            item = cdolist_list_var2.first();
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shelfs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 11649L)
    public static SubLObject do_shelf_from(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list87);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)shelfs.NIL;
        SubLObject shelf = (SubLObject)shelfs.NIL;
        SubLObject item = (SubLObject)shelfs.NIL;
        SubLObject forwardp = (SubLObject)shelfs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list87);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list87);
        shelf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list87);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shelfs.$list87);
        forwardp = current.first();
        current = current.rest();
        if (shelfs.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject shelf_var = (SubLObject)shelfs.$sym88$SHELF_VAR;
            final SubLObject vector = (SubLObject)shelfs.$sym89$VECTOR;
            final SubLObject low = (SubLObject)shelfs.$sym90$LOW;
            final SubLObject high = (SubLObject)shelfs.$sym91$HIGH;
            final SubLObject i = (SubLObject)shelfs.$sym92$I;
            final SubLObject length = (SubLObject)shelfs.$sym93$LENGTH;
            return (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(shelf_var, shelf), var), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym94$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym75$SHELF_FINALIZED_P, shelf_var), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym95$FINALIZE_SHELF, shelf_var)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym94$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym76$VECTORP, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym42$SHELF_PAYLOAD, shelf_var)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym96$REARRANGE_SHELF, shelf_var)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(vector, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym42$SHELF_PAYLOAD, shelf_var)), (SubLObject)ConsesLow.list(length, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym78$LENGTH, vector))), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym97$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(low, high), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym98$BSEARCH_SHELF_VECTOR_RANGE, item, vector, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym0$SHELF_INFO, shelf_var)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym74$PIF, forwardp, (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym99$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(i, high, (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym100$_, i, (SubLObject)shelfs.$list101))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shelfs.$sym102$CNOT, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym103$_, i, length))), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym104$CSETF, var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym79$AREF, vector, i)), ConsesLow.append(body, (SubLObject)shelfs.NIL)), (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym99$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(i, low, (SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym105$_, i, (SubLObject)shelfs.$list101))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)shelfs.$sym103$_, i, (SubLObject)shelfs.$list106)), (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym104$CSETF, var, (SubLObject)ConsesLow.list((SubLObject)shelfs.$sym79$AREF, vector, i)), ConsesLow.append(body, (SubLObject)shelfs.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shelfs.$list87);
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 12519L)
    public static SubLObject map_shelf_from(final SubLObject function, final SubLObject shelf, final SubLObject item, final SubLObject forwardp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject elt = (SubLObject)shelfs.NIL;
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            finalize_shelf(shelf);
        }
        if (!shelf_payload(shelf).isVector()) {
            rearrange_shelf(shelf);
        }
        final SubLObject vector = shelf_payload(shelf);
        final SubLObject length = Sequences.length(vector);
        thread.resetMultipleValues();
        final SubLObject low = bsearch_shelf_vector_range(item, vector, shelf_info(shelf));
        final SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (shelfs.NIL != forwardp) {
            SubLObject i;
            for (i = (SubLObject)shelfs.NIL, i = high; i.numL(length); i = Numbers.add(i, (SubLObject)shelfs.ONE_INTEGER)) {
                elt = Vectors.aref(vector, i);
                Functions.funcall(function, elt);
            }
        }
        else {
            SubLObject i;
            for (i = (SubLObject)shelfs.NIL, i = low; !i.numL((SubLObject)shelfs.ZERO_INTEGER); i = Numbers.subtract(i, (SubLObject)shelfs.ONE_INTEGER)) {
                elt = Vectors.aref(vector, i);
                Functions.funcall(function, elt);
            }
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 12660L)
    public static SubLObject add_to_shelf(final SubLObject item, final SubLObject shelf) {
        if (shelfs.NIL != item) {
            if (shelfs.NIL != shelf_finalized_p(shelf)) {
                final SubLObject info = shelf_info(shelf);
                SubLObject payload = shelf_payload(shelf);
                if (!payload.isCons()) {
                    payload = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, (SubLObject)shelfs.NIL), payload);
                    _csetf_shelf_payload(shelf, payload);
                }
                ConsesLow.rplacd(payload.first(), (SubLObject)ConsesLow.cons(item, conses_high.cdar(payload)));
                ConsesLow.rplaca(payload.first(), Numbers.add(conses_high.caar(payload), (SubLObject)shelfs.ONE_INTEGER));
                final SubLObject major = shelf_info_major_limit(info);
                if (major.isFunction()) {
                    if (shelfs.NIL != Functions.funcall(major, shelf)) {
                        rearrange_shelf(shelf);
                        return item;
                    }
                }
                else if (major.isNumber() && shelf_approximate_count(shelf).numGE(major)) {
                    rearrange_shelf(shelf);
                    return item;
                }
                final SubLObject minor = shelf_info_minor_limit(info);
                if (minor.isFunction()) {
                    if (shelfs.NIL != Functions.funcall(minor, shelf)) {
                        tidy_shelf(shelf);
                        return item;
                    }
                }
                else if (minor.isNumber() && conses_high.caar(payload).numGE(minor)) {
                    tidy_shelf(shelf);
                    return item;
                }
            }
            else {
                initial_add_to_shelf(item, shelf);
            }
        }
        else {
            Errors.cerror((SubLObject)shelfs.$str107$Ignore_the_addition_, (SubLObject)shelfs.$str108$Attempt_to_add__S_to__S_, item, shelf);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 13913L)
    public static SubLObject bsearch_shelf_vector(final SubLObject item, final SubLObject vector, final SubLObject info) {
        final SubLObject compare = shelf_info_compare(info);
        final SubLObject test = shelf_info_test(info);
        final SubLObject key = shelf_info_key(info);
        return vector_utilities.binary_search_vector(item, vector, compare, test, key, Symbols.symbol_function((SubLObject)shelfs.$sym56$NULL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 14150L)
    public static SubLObject bsearch_shelf_vector_range(final SubLObject item, final SubLObject vector, final SubLObject info) {
        final SubLObject compare = shelf_info_compare(info);
        final SubLObject test = shelf_info_test(info);
        final SubLObject key = shelf_info_key(info);
        return vector_utilities.binary_search_vector_range(item, vector, compare, test, key, Symbols.symbol_function((SubLObject)shelfs.$sym56$NULL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 14401L)
    public static SubLObject delete_from_shelf(final SubLObject item, final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        final SubLObject info = shelf_info(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            ConsesLow.rplacd(payload, Sequences.delete(item, payload.rest(), shelf_info_test(info), shelf_info_key(info), (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED));
            ConsesLow.rplaca(payload, Sequences.length(payload.rest()));
            return item;
        }
        if (!payload.isVector()) {
            SubLObject cdolist_list_var = payload.rest();
            SubLObject vector = (SubLObject)shelfs.NIL;
            vector = cdolist_list_var.first();
            while (shelfs.NIL != cdolist_list_var) {
                final SubLObject idx = bsearch_shelf_vector(item, vector, info);
                if (shelfs.NIL != idx) {
                    Vectors.set_aref(vector, idx, (SubLObject)shelfs.NIL);
                    return item;
                }
                cdolist_list_var = cdolist_list_var.rest();
                vector = cdolist_list_var.first();
            }
            final SubLObject extras = payload.first();
            ConsesLow.rplacd(extras, Sequences.delete(item, extras.rest(), shelf_info_test(info), shelf_info_key(info), (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED));
            ConsesLow.rplaca(extras, Sequences.length(extras.rest()));
            return item;
        }
        final SubLObject idx2 = bsearch_shelf_vector(item, payload, info);
        if (shelfs.NIL != idx2) {
            Vectors.set_aref(payload, idx2, (SubLObject)shelfs.NIL);
            return item;
        }
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 15340L)
    public static SubLObject clear_shelf(final SubLObject shelf) {
        if (shelfs.NIL != shelf_finalized_p(shelf)) {
            _csetf_shelf_payload(shelf, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, (SubLObject)shelfs.NIL), (SubLObject)shelfs.NIL));
        }
        else {
            _csetf_shelf_payload(shelf, (SubLObject)ConsesLow.cons((SubLObject)shelfs.ZERO_INTEGER, (SubLObject)shelfs.NIL));
        }
        return shelf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 15529L)
    public static SubLObject find_in_shelf(final SubLObject item, final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        final SubLObject info = shelf_info(shelf);
        if (shelfs.NIL == shelf_finalized_p(shelf)) {
            return Sequences.find(item, payload.rest(), shelf_info_test(info), shelf_info_key(info), (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED);
        }
        if (!payload.isVector()) {
            SubLObject cdolist_list_var = payload.rest();
            SubLObject vector = (SubLObject)shelfs.NIL;
            vector = cdolist_list_var.first();
            while (shelfs.NIL != cdolist_list_var) {
                final SubLObject idx = bsearch_shelf_vector(item, vector, info);
                if (shelfs.NIL != idx) {
                    return Vectors.aref(vector, idx);
                }
                cdolist_list_var = cdolist_list_var.rest();
                vector = cdolist_list_var.first();
            }
            return Sequences.find(item, conses_high.cdar(payload), shelf_info_test(info), shelf_info_key(info), (SubLObject)shelfs.UNPROVIDED, (SubLObject)shelfs.UNPROVIDED);
        }
        final SubLObject idx2 = bsearch_shelf_vector(item, payload, info);
        if (shelfs.NIL != idx2) {
            return Vectors.aref(payload, idx2);
        }
        return (SubLObject)shelfs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 16224L)
    public static SubLObject shelf_ten_percent_full_p(final SubLObject shelf) {
        return Numbers.numGE(shelf_extra_count(shelf), Numbers.integerDivide(shelf_major_count(shelf), (SubLObject)shelfs.TEN_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 16390L)
    public static SubLObject shelf_full_p(final SubLObject shelf) {
        return Numbers.numGE(shelf_minor_count(shelf), shelf_major_count(shelf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 16490L)
    public static SubLObject new_shelf_iterator(final SubLObject shelf) {
        assert shelfs.NIL != shelf_p(shelf) : shelf;
        return iteration.new_iterator(make_iterator_shelf_state(shelf), (SubLObject)shelfs.$sym109$ITERATOR_SHELF_DONE, (SubLObject)shelfs.$sym110$ITERATOR_SHELF_NEXT, (SubLObject)shelfs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 16787L)
    public static SubLObject make_iterator_shelf_state(final SubLObject shelf) {
        final SubLObject payload = shelf_payload(shelf);
        SubLObject vectors = (SubLObject)shelfs.NIL;
        if (payload.isVector()) {
            vectors = (SubLObject)ConsesLow.list(payload);
        }
        else if (shelfs.NIL != shelf_finalized_p(shelf)) {
            vectors = (SubLObject)ConsesLow.cons(Functions.apply(Symbols.symbol_function((SubLObject)shelfs.$sym111$VECTOR), conses_high.cdar(payload)), conses_high.copy_list(payload.rest()));
        }
        else {
            vectors = (SubLObject)ConsesLow.list(Functions.apply(Symbols.symbol_function((SubLObject)shelfs.$sym111$VECTOR), payload));
        }
        final SubLObject initial_iterator = new_shelf_vector_iterator(vectors.first());
        return (SubLObject)ConsesLow.list(initial_iterator, vectors);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 17755L)
    public static SubLObject new_shelf_vector_iterator(final SubLObject vector) {
        assert shelfs.NIL != Types.vectorp(vector) : vector;
        return iteration.new_filter_iterator(iteration.new_vector_iterator(vector), Symbols.symbol_function((SubLObject)shelfs.$sym112$BOOLEAN), (SubLObject)shelfs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 17908L)
    public static SubLObject iterator_shelf_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(shelfs.NIL != iteration.iteration_done(state.first()) && shelfs.NIL == conses_high.second(state).rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shelfs.lisp", position = 18034L)
    public static SubLObject iterator_shelf_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = state.first();
        SubLObject vectors = conses_high.second(state);
        while (true) {
            thread.resetMultipleValues();
            final SubLObject iterator_item = iteration.iteration_next(iterator);
            final SubLObject iterator_valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (shelfs.NIL != iterator_valid) {
                return Values.values(iterator_item, state, (SubLObject)shelfs.NIL);
            }
            if (shelfs.NIL == vectors.rest()) {
                return Values.values((SubLObject)shelfs.NIL, state, (SubLObject)shelfs.T);
            }
            vectors = vectors.rest();
            ConsesLow.set_nth((SubLObject)shelfs.ONE_INTEGER, state, vectors);
            iterator = new_shelf_vector_iterator(vectors.first());
            ConsesLow.set_nth((SubLObject)shelfs.ZERO_INTEGER, state, iterator);
        }
    }
    
    public static SubLObject declare_shelfs_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_print_function_trampoline", "SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_p", "SHELF-INFO-P", 1, 0, false);
        new $shelf_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_key", "SHELF-INFO-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_test", "SHELF-INFO-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_compare", "SHELF-INFO-COMPARE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_minor_limit", "SHELF-INFO-MINOR-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info_major_limit", "SHELF-INFO-MAJOR-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info_key", "_CSETF-SHELF-INFO-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info_test", "_CSETF-SHELF-INFO-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info_compare", "_CSETF-SHELF-INFO-COMPARE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info_minor_limit", "_CSETF-SHELF-INFO-MINOR-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info_major_limit", "_CSETF-SHELF-INFO-MAJOR-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "make_shelf_info", "MAKE-SHELF-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "visit_defstruct_shelf_info", "VISIT-DEFSTRUCT-SHELF-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "visit_defstruct_object_shelf_info_method", "VISIT-DEFSTRUCT-OBJECT-SHELF-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_print_function_trampoline", "SHELF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_p", "SHELF-P", 1, 0, false);
        new $shelf_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_info", "SHELF-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_payload", "SHELF-PAYLOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_size", "SHELF-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_info", "_CSETF-SHELF-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_payload", "_CSETF-SHELF-PAYLOAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "_csetf_shelf_size", "_CSETF-SHELF-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "make_shelf", "MAKE-SHELF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "visit_defstruct_shelf", "VISIT-DEFSTRUCT-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "visit_defstruct_object_shelf_method", "VISIT-DEFSTRUCT-OBJECT-SHELF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_finalized_p", "SHELF-FINALIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "print_shelf", "PRINT-SHELF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "allocate_shelf", "ALLOCATE-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "initial_add_to_shelf", "INITIAL-ADD-TO-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "finalize_shelf", "FINALIZE-SHELF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_count", "SHELF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_approximate_count", "SHELF-APPROXIMATE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_major_count", "SHELF-MAJOR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_minor_count", "SHELF-MINOR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_extra_count", "SHELF-EXTRA-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "rearrange_shelf", "REARRANGE-SHELF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "tidy_shelf", "TIDY-SHELF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shelfs", "do_shelf", "DO-SHELF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "map_shelf", "MAP-SHELF", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shelfs", "do_shelf_from", "DO-SHELF-FROM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "map_shelf_from", "MAP-SHELF-FROM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "add_to_shelf", "ADD-TO-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "bsearch_shelf_vector", "BSEARCH-SHELF-VECTOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "bsearch_shelf_vector_range", "BSEARCH-SHELF-VECTOR-RANGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "delete_from_shelf", "DELETE-FROM-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "clear_shelf", "CLEAR-SHELF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "find_in_shelf", "FIND-IN-SHELF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_ten_percent_full_p", "SHELF-TEN-PERCENT-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "shelf_full_p", "SHELF-FULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "new_shelf_iterator", "NEW-SHELF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "make_iterator_shelf_state", "MAKE-ITERATOR-SHELF-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "new_shelf_vector_iterator", "NEW-SHELF-VECTOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "iterator_shelf_done", "ITERATOR-SHELF-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shelfs", "iterator_shelf_next", "ITERATOR-SHELF-NEXT", 1, 0, false);
        return (SubLObject)shelfs.NIL;
    }
    
    public static SubLObject init_shelfs_file() {
        shelfs.$dtp_shelf_info$ = SubLFiles.defconstant("*DTP-SHELF-INFO*", (SubLObject)shelfs.$sym0$SHELF_INFO);
        shelfs.$dtp_shelf$ = SubLFiles.defconstant("*DTP-SHELF*", (SubLObject)shelfs.$sym31$SHELF);
        return (SubLObject)shelfs.NIL;
    }
    
    public static SubLObject setup_shelfs_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), shelfs.$dtp_shelf_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)shelfs.$sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)shelfs.$list9);
        Structures.def_csetf((SubLObject)shelfs.$sym10$SHELF_INFO_KEY, (SubLObject)shelfs.$sym11$_CSETF_SHELF_INFO_KEY);
        Structures.def_csetf((SubLObject)shelfs.$sym12$SHELF_INFO_TEST, (SubLObject)shelfs.$sym13$_CSETF_SHELF_INFO_TEST);
        Structures.def_csetf((SubLObject)shelfs.$sym14$SHELF_INFO_COMPARE, (SubLObject)shelfs.$sym15$_CSETF_SHELF_INFO_COMPARE);
        Structures.def_csetf((SubLObject)shelfs.$sym16$SHELF_INFO_MINOR_LIMIT, (SubLObject)shelfs.$sym17$_CSETF_SHELF_INFO_MINOR_LIMIT);
        Structures.def_csetf((SubLObject)shelfs.$sym18$SHELF_INFO_MAJOR_LIMIT, (SubLObject)shelfs.$sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT);
        Equality.identity((SubLObject)shelfs.$sym0$SHELF_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), shelfs.$dtp_shelf_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)shelfs.$sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), shelfs.$dtp_shelf$.getGlobalValue(), Symbols.symbol_function((SubLObject)shelfs.$sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)shelfs.$list40);
        Structures.def_csetf((SubLObject)shelfs.$sym0$SHELF_INFO, (SubLObject)shelfs.$sym41$_CSETF_SHELF_INFO);
        Structures.def_csetf((SubLObject)shelfs.$sym42$SHELF_PAYLOAD, (SubLObject)shelfs.$sym43$_CSETF_SHELF_PAYLOAD);
        Structures.def_csetf((SubLObject)shelfs.$sym44$SHELF_SIZE, (SubLObject)shelfs.$sym45$_CSETF_SHELF_SIZE);
        Equality.identity((SubLObject)shelfs.$sym31$SHELF);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), shelfs.$dtp_shelf$.getGlobalValue(), Symbols.symbol_function((SubLObject)shelfs.$sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD));
        return (SubLObject)shelfs.NIL;
    }
    
    public void declareFunctions() {
        declare_shelfs_file();
    }
    
    public void initializeVariables() {
        init_shelfs_file();
    }
    
    public void runTopLevelForms() {
        setup_shelfs_file();
    }
    
    static {
        me = (SubLFile)new shelfs();
        shelfs.$dtp_shelf_info$ = null;
        shelfs.$dtp_shelf$ = null;
        $sym0$SHELF_INFO = SubLObjectFactory.makeSymbol("SHELF-INFO");
        $sym1$SHELF_INFO_P = SubLObjectFactory.makeSymbol("SHELF-INFO-P");
        $int2$134 = SubLObjectFactory.makeInteger(134);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPARE"), (SubLObject)SubLObjectFactory.makeSymbol("MINOR-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("MAJOR-LIMIT"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("COMPARE"), (SubLObject)SubLObjectFactory.makeKeyword("MINOR-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("MAJOR-LIMIT"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-COMPARE"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-MINOR-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-MAJOR-LIMIT"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-COMPARE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-MINOR-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-MAJOR-LIMIT"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$SHELF_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SHELF-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO-P"));
        $sym10$SHELF_INFO_KEY = SubLObjectFactory.makeSymbol("SHELF-INFO-KEY");
        $sym11$_CSETF_SHELF_INFO_KEY = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-KEY");
        $sym12$SHELF_INFO_TEST = SubLObjectFactory.makeSymbol("SHELF-INFO-TEST");
        $sym13$_CSETF_SHELF_INFO_TEST = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-TEST");
        $sym14$SHELF_INFO_COMPARE = SubLObjectFactory.makeSymbol("SHELF-INFO-COMPARE");
        $sym15$_CSETF_SHELF_INFO_COMPARE = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-COMPARE");
        $sym16$SHELF_INFO_MINOR_LIMIT = SubLObjectFactory.makeSymbol("SHELF-INFO-MINOR-LIMIT");
        $sym17$_CSETF_SHELF_INFO_MINOR_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-MINOR-LIMIT");
        $sym18$SHELF_INFO_MAJOR_LIMIT = SubLObjectFactory.makeSymbol("SHELF-INFO-MAJOR-LIMIT");
        $sym19$_CSETF_SHELF_INFO_MAJOR_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO-MAJOR-LIMIT");
        $kw20$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw21$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw22$COMPARE = SubLObjectFactory.makeKeyword("COMPARE");
        $kw23$MINOR_LIMIT = SubLObjectFactory.makeKeyword("MINOR-LIMIT");
        $kw24$MAJOR_LIMIT = SubLObjectFactory.makeKeyword("MAJOR-LIMIT");
        $str25$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw26$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym27$MAKE_SHELF_INFO = SubLObjectFactory.makeSymbol("MAKE-SHELF-INFO");
        $kw28$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw29$END = SubLObjectFactory.makeKeyword("END");
        $sym30$VISIT_DEFSTRUCT_OBJECT_SHELF_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SHELF-INFO-METHOD");
        $sym31$SHELF = SubLObjectFactory.makeSymbol("SHELF");
        $sym32$SHELF_P = SubLObjectFactory.makeSymbol("SHELF-P");
        $int33$135 = SubLObjectFactory.makeInteger(135);
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFO"), (SubLObject)SubLObjectFactory.makeKeyword("PAYLOAD"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHELF-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-SIZE"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SHELF-SIZE"));
        $sym38$PRINT_SHELF = SubLObjectFactory.makeSymbol("PRINT-SHELF");
        $sym39$SHELF_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SHELF-PRINT-FUNCTION-TRAMPOLINE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF-P"));
        $sym41$_CSETF_SHELF_INFO = SubLObjectFactory.makeSymbol("_CSETF-SHELF-INFO");
        $sym42$SHELF_PAYLOAD = SubLObjectFactory.makeSymbol("SHELF-PAYLOAD");
        $sym43$_CSETF_SHELF_PAYLOAD = SubLObjectFactory.makeSymbol("_CSETF-SHELF-PAYLOAD");
        $sym44$SHELF_SIZE = SubLObjectFactory.makeSymbol("SHELF-SIZE");
        $sym45$_CSETF_SHELF_SIZE = SubLObjectFactory.makeSymbol("_CSETF-SHELF-SIZE");
        $kw46$INFO = SubLObjectFactory.makeKeyword("INFO");
        $kw47$PAYLOAD = SubLObjectFactory.makeKeyword("PAYLOAD");
        $kw48$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $sym49$MAKE_SHELF = SubLObjectFactory.makeSymbol("MAKE-SHELF");
        $sym50$VISIT_DEFSTRUCT_OBJECT_SHELF_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SHELF-METHOD");
        $str51$_D_items = SubLObjectFactory.makeString("~D items");
        $str52$__unfinalized_ = SubLObjectFactory.makeString(" (unfinalized)");
        $str53$Finalizing__S_before_its_time_ = SubLObjectFactory.makeString("Finalizing ~S before its time.");
        $str54$_S_has_already_been_finalized_ = SubLObjectFactory.makeString("~S has already been finalized.");
        $str55$Shelf__S_being_finalized_with_les = SubLObjectFactory.makeString("Shelf ~S being finalized with less than expected ~D items.");
        $sym56$NULL = SubLObjectFactory.makeSymbol("NULL");
        $str57$Finalize_it_ = SubLObjectFactory.makeString("Finalize it.");
        $str58$_S_has_not_been_finalized_ = SubLObjectFactory.makeString("~S has not been finalized.");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("do-shelf"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str60$do_shelf = SubLObjectFactory.makeString("do-shelf");
        $sym61$SHELF_VAR = SubLObjectFactory.makeUninternedSymbol("SHELF-VAR");
        $sym62$PAYLOAD = SubLObjectFactory.makeUninternedSymbol("PAYLOAD");
        $sym63$I = SubLObjectFactory.makeUninternedSymbol("I");
        $sym64$VECTOR = SubLObjectFactory.makeUninternedSymbol("VECTOR");
        $sym65$DATA = SubLObjectFactory.makeUninternedSymbol("DATA");
        $sym66$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym67$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym68$_PROGRESS_NOTE_ = SubLObjectFactory.makeSymbol("*PROGRESS-NOTE*");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-START-TIME*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")));
        $sym70$_PROGRESS_TOTAL_ = SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*");
        $sym71$SHELF_APPROXIMATE_COUNT = SubLObjectFactory.makeSymbol("SHELF-APPROXIMATE-COUNT");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), (SubLObject)shelfs.ZERO_INTEGER);
        $sym73$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym74$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym75$SHELF_FINALIZED_P = SubLObjectFactory.makeSymbol("SHELF-FINALIZED-P");
        $sym76$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym77$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym78$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym79$AREF = SubLObjectFactory.makeSymbol("AREF");
        $sym80$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*")));
        $sym82$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym83$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym84$CDAR = SubLObjectFactory.makeSymbol("CDAR");
        $sym85$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym86$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SHELF"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("FORWARDP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym88$SHELF_VAR = SubLObjectFactory.makeUninternedSymbol("SHELF-VAR");
        $sym89$VECTOR = SubLObjectFactory.makeUninternedSymbol("VECTOR");
        $sym90$LOW = SubLObjectFactory.makeUninternedSymbol("LOW");
        $sym91$HIGH = SubLObjectFactory.makeUninternedSymbol("HIGH");
        $sym92$I = SubLObjectFactory.makeUninternedSymbol("I");
        $sym93$LENGTH = SubLObjectFactory.makeUninternedSymbol("LENGTH");
        $sym94$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym95$FINALIZE_SHELF = SubLObjectFactory.makeSymbol("FINALIZE-SHELF");
        $sym96$REARRANGE_SHELF = SubLObjectFactory.makeSymbol("REARRANGE-SHELF");
        $sym97$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym98$BSEARCH_SHELF_VECTOR_RANGE = SubLObjectFactory.makeSymbol("BSEARCH-SHELF-VECTOR-RANGE");
        $sym99$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym100$_ = SubLObjectFactory.makeSymbol("+");
        $list101 = ConsesLow.list((SubLObject)shelfs.ONE_INTEGER);
        $sym102$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym103$_ = SubLObjectFactory.makeSymbol("<");
        $sym104$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym105$_ = SubLObjectFactory.makeSymbol("-");
        $list106 = ConsesLow.list((SubLObject)shelfs.ZERO_INTEGER);
        $str107$Ignore_the_addition_ = SubLObjectFactory.makeString("Ignore the addition.");
        $str108$Attempt_to_add__S_to__S_ = SubLObjectFactory.makeString("Attempt to add ~S to ~S.");
        $sym109$ITERATOR_SHELF_DONE = SubLObjectFactory.makeSymbol("ITERATOR-SHELF-DONE");
        $sym110$ITERATOR_SHELF_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-SHELF-NEXT");
        $sym111$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym112$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
    }
    
    public static final class $shelf_info_native extends SubLStructNative
    {
        public SubLObject $key;
        public SubLObject $test;
        public SubLObject $compare;
        public SubLObject $minor_limit;
        public SubLObject $major_limit;
        private static final SubLStructDeclNative structDecl;
        
        public $shelf_info_native() {
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$compare = (SubLObject)CommonSymbols.NIL;
            this.$minor_limit = (SubLObject)CommonSymbols.NIL;
            this.$major_limit = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$shelf_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$key;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject getField4() {
            return this.$compare;
        }
        
        public SubLObject getField5() {
            return this.$minor_limit;
        }
        
        public SubLObject getField6() {
            return this.$major_limit;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$key = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$compare = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$minor_limit = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$major_limit = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$shelf_info_native.class, shelfs.$sym0$SHELF_INFO, shelfs.$sym1$SHELF_INFO_P, shelfs.$list3, shelfs.$list4, new String[] { "$key", "$test", "$compare", "$minor_limit", "$major_limit" }, shelfs.$list5, shelfs.$list6, shelfs.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $shelf_info_p$UnaryFunction extends UnaryFunction
    {
        public $shelf_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SHELF-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return shelfs.shelf_info_p(arg1);
        }
    }
    
    public static final class $shelf_native extends SubLStructNative
    {
        public SubLObject $info;
        public SubLObject $payload;
        public SubLObject $size;
        private static final SubLStructDeclNative structDecl;
        
        public $shelf_native() {
            this.$info = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
            this.$size = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$shelf_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$info;
        }
        
        public SubLObject getField3() {
            return this.$payload;
        }
        
        public SubLObject getField4() {
            return this.$size;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$info = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$payload = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$size = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$shelf_native.class, shelfs.$sym31$SHELF, shelfs.$sym32$SHELF_P, shelfs.$list34, shelfs.$list35, new String[] { "$info", "$payload", "$size" }, shelfs.$list36, shelfs.$list37, shelfs.$sym38$PRINT_SHELF);
        }
    }
    
    public static final class $shelf_p$UnaryFunction extends UnaryFunction
    {
        public $shelf_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SHELF-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return shelfs.shelf_p(arg1);
        }
    }
}

/*

	Total time: 349 ms
	
*/
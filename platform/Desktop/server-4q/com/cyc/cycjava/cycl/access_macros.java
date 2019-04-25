package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class access_macros extends SubLTranslatedFile 
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.access_macros";
    public static final String myFingerPrint = "a98d211a863b331c3aec51778ccd65ce209743b0928b0082a20f04d05815608d";
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13572L)
    private static SubLSymbol $external_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 17409L)
    private static SubLSymbol $external_access_methods$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$PROCLAIM;
    private static final SubLSymbol $sym3$QUOTE;
    private static final SubLSymbol $sym4$FACCESS;
    private static final SubLSymbol $sym5$PUBLIC;
    private static final SubLSymbol $sym6$DEFINE;
    private static final SubLSymbol $sym7$PROTECTED;
    private static final SubLSymbol $sym8$PRIVATE;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw12$MACRO;
    private static final SubLString $str13$Macro_or_list_of_macros_must_be_s;
    private static final SubLSymbol $sym14$REGISTER_MACRO_HELPER;
    private static final SubLSymbol $sym15$DEFINE_PROTECTED;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$DEFMACRO;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$DEFMACRO_PROTECTED;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$VACCESS;
    private static final SubLSymbol $sym22$DEFCONSTANT;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$DEFLEXICAL;
    private static final SubLSymbol $sym25$DEFPARAMETER;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$DEFPARAMETER_PROTECTED;
    private static final SubLSymbol $sym28$DEFPARAMETER_MACRO_HELPER;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$DEFGLOBAL;
    private static final SubLSymbol $sym31$DEFVAR;
    private static final SubLSymbol $sym32$DEFVAR_PROTECTED;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$REPLACEMENTS;
    private static final SubLString $str36$Method_or_list_of_methods_must_be;
    private static final SubLSymbol $sym37$DEFINE_OBSOLETE_REGISTER;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$DEFMACRO_OBSOLETE_WARNING;
    private static final SubLString $str40$Macro__S_is_obsolete;
    private static final SubLString $str41$____use_;
    private static final SubLString $str42$_S_;
    private static final SubLString $str43$instead_;
    private static final SubLString $str44$_A;
    private static final SubLSymbol $sym45$_EXTERNAL_SYMBOLS_;
    private static final SubLInteger $int46$400;
    private static final SubLSymbol $sym47$STRING_LESSP;
    private static final SubLSymbol $sym48$SYMBOL_NAME;
    private static final SubLSymbol $sym49$REGISTER_EXTERNAL_SYMBOL;
    private static final SubLSymbol $sym50$DEFINE_PUBLIC;
    private static final SubLSymbol $sym51$DEFMACRO_PUBLIC;
    private static final SubLSymbol $sym52$DEFCONSTANT_PUBLIC;
    private static final SubLSymbol $sym53$DEFLEXICAL_PUBLIC;
    private static final SubLSymbol $sym54$DEFPARAMETER_PUBLIC;
    private static final SubLSymbol $sym55$DEFGLOBAL_PUBLIC;
    private static final SubLSymbol $sym56$DEFVAR_PUBLIC;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$MACRO_HELPER_FOR;
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 851L)
    public static SubLObject define_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym5$PUBLIC, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym6$DEFINE, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1210L)
    public static SubLObject define_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym7$PROTECTED, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym6$DEFINE, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1533L)
    public static SubLObject define_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym8$PRIVATE, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym6$DEFINE, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 1796L)
    public static SubLObject define_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list9);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list9);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$1 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list9);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list9);
            if (access_macros.NIL == conses_high.member(current_$1, (SubLObject)access_macros.$list10, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$1 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list9);
        }
        final SubLObject macro_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw12$MACRO, current);
        final SubLObject macro = (SubLObject)((access_macros.NIL != macro_tail) ? conses_high.cadr(macro_tail) : access_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(macro)) {
            Errors.error((SubLObject)access_macros.$str13$Macro_or_list_of_macros_must_be_s, macro);
        }
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym14$REGISTER_MACRO_HELPER, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, macro)), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym15$DEFINE_PROTECTED, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2376L)
    public static SubLObject symbol_or_symbol_list_p(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return (SubLObject)access_macros.T;
        }
        if (v_object.isAtom()) {
            return (SubLObject)access_macros.NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject item = (SubLObject)access_macros.NIL;
        item = cdolist_list_var.first();
        while (access_macros.NIL != cdolist_list_var) {
            if (!item.isSymbol()) {
                return (SubLObject)access_macros.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)access_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2588L)
    public static SubLObject defmacro_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject pattern = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym5$PUBLIC, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym17$DEFMACRO, name, pattern, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 2949L)
    public static SubLObject defmacro_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject pattern = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym7$PROTECTED, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym17$DEFMACRO, name, pattern, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 3268L)
    public static SubLObject defmacro_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject pattern = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list16);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym4$FACCESS, (SubLObject)access_macros.$sym8$PRIVATE, name))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym17$DEFMACRO, name, pattern, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 3525L)
    public static SubLObject defmacro_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject pattern = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list18);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list18);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$2 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list18);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list18);
            if (access_macros.NIL == conses_high.member(current_$2, (SubLObject)access_macros.$list10, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$2 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list18);
        }
        final SubLObject macro_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw12$MACRO, current);
        final SubLObject macro = (SubLObject)((access_macros.NIL != macro_tail) ? conses_high.cadr(macro_tail) : access_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(macro)) {
            Errors.error((SubLObject)access_macros.$str13$Macro_or_list_of_macros_must_be_s, macro);
        }
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym14$REGISTER_MACRO_HELPER, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, macro)), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym19$DEFMACRO_PROTECTED, name, pattern, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4046L)
    public static SubLObject defconstant_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym5$PUBLIC, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym22$DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4499L)
    public static SubLObject defconstant_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym7$PROTECTED, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym22$DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 4905L)
    public static SubLObject defconstant_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym8$PRIVATE, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym22$DEFCONSTANT, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 5229L)
    public static SubLObject deflexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym5$PUBLIC, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym24$DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 5676L)
    public static SubLObject deflexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym7$PROTECTED, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym24$DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6079L)
    public static SubLObject deflexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym8$PRIVATE, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym24$DEFLEXICAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6400L)
    public static SubLObject defparameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym5$PUBLIC, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym25$DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 6859L)
    public static SubLObject defparameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym7$PROTECTED, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym25$DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 7268L)
    public static SubLObject defparameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym8$PRIVATE, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym25$DEFPARAMETER, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 7595L)
    public static SubLObject defparameter_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list26);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$3 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list26);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list26);
            if (access_macros.NIL == conses_high.member(current_$3, (SubLObject)access_macros.$list10, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$3 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list26);
        }
        final SubLObject macro_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw12$MACRO, current);
        final SubLObject macro = (SubLObject)((access_macros.NIL != macro_tail) ? conses_high.cadr(macro_tail) : access_macros.NIL);
        current = temp;
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list26);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list26);
        current = current.rest();
        if (access_macros.NIL == current) {
            if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(macro)) {
                Errors.error((SubLObject)access_macros.$str13$Macro_or_list_of_macros_must_be_s, macro);
            }
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym27$DEFPARAMETER_PROTECTED, variable, initialization, documentation);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list26);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 8256L)
    public static SubLObject defglobal_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym5$PUBLIC, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym30$DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 8697L)
    public static SubLObject defglobal_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym7$PROTECTED, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym30$DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9097L)
    public static SubLObject defglobal_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym8$PRIVATE, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym30$DEFGLOBAL, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9415L)
    public static SubLObject defvar_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym5$PUBLIC, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym31$DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 9838L)
    public static SubLObject defvar_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym7$PROTECTED, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym31$DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 10229L)
    public static SubLObject defvar_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym2$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym21$VACCESS, (SubLObject)access_macros.$sym8$PRIVATE, variable))), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym31$DEFVAR, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 10538L)
    public static SubLObject defvar_macro_helper(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list26);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$4 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list26);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list26);
            if (access_macros.NIL == conses_high.member(current_$4, (SubLObject)access_macros.$list10, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$4 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list26);
        }
        final SubLObject macro_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw12$MACRO, current);
        final SubLObject macro = (SubLObject)((access_macros.NIL != macro_tail) ? conses_high.cadr(macro_tail) : access_macros.NIL);
        current = temp;
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list26);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list26);
        current = current.rest();
        if (access_macros.NIL == current) {
            if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(macro)) {
                Errors.error((SubLObject)access_macros.$str13$Macro_or_list_of_macros_must_be_s, macro);
            }
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym32$DEFVAR_PROTECTED, variable, initialization, documentation);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list26);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 11100L)
    public static SubLObject define_obsolete(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list33);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list33);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$5 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list33);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list33);
            if (access_macros.NIL == conses_high.member(current_$5, (SubLObject)access_macros.$list34, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$5 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list33);
        }
        final SubLObject replacements_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw35$REPLACEMENTS, current);
        SubLObject replacements = (SubLObject)((access_macros.NIL != replacements_tail) ? conses_high.cadr(replacements_tail) : access_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(replacements)) {
            Errors.error((SubLObject)access_macros.$str36$Method_or_list_of_methods_must_be, replacements);
        }
        if (!replacements.isList()) {
            replacements = (SubLObject)ConsesLow.list(replacements);
        }
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym37$DEFINE_OBSOLETE_REGISTER, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, ConsesLow.append(replacements, (SubLObject)access_macros.NIL))), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym15$DEFINE_PROTECTED, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 11830L)
    public static SubLObject define_obsolete_register(final SubLObject v_obsolete, final SubLObject replacements) {
        return v_obsolete;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 12192L)
    public static SubLObject defmacro_obsolete(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject pattern = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list38);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list38);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)access_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)access_macros.NIL;
        SubLObject current_$6 = (SubLObject)access_macros.NIL;
        while (access_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list38);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)access_macros.$list38);
            if (access_macros.NIL == conses_high.member(current_$6, (SubLObject)access_macros.$list34, (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED)) {
                bad = (SubLObject)access_macros.T;
            }
            if (current_$6 == access_macros.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (access_macros.NIL != bad && access_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list38);
        }
        final SubLObject replacements_tail = cdestructuring_bind.property_list_member((SubLObject)access_macros.$kw35$REPLACEMENTS, current);
        SubLObject replacements = (SubLObject)((access_macros.NIL != replacements_tail) ? conses_high.cadr(replacements_tail) : access_macros.NIL);
        SubLObject body;
        current = (body = temp);
        if (access_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && access_macros.NIL == symbol_or_symbol_list_p(replacements)) {
            Errors.error((SubLObject)access_macros.$str36$Method_or_list_of_methods_must_be, replacements);
        }
        if (!replacements.isList()) {
            replacements = (SubLObject)ConsesLow.list(replacements);
        }
        SubLObject documentation = (SubLObject)access_macros.NIL;
        if (body.first().isString()) {
            documentation = body.first();
            body = body.rest();
        }
        return (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym19$DEFMACRO_PROTECTED, name, pattern, ConsesLow.append((SubLObject)((access_macros.NIL != documentation) ? ConsesLow.list(documentation) : access_macros.NIL), (SubLObject)((access_macros.NIL != replacements) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)access_macros.$sym39$DEFMACRO_OBSOLETE_WARNING, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, ConsesLow.append(replacements, (SubLObject)access_macros.NIL)))) : access_macros.NIL), body, (SubLObject)access_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13089L)
    public static SubLObject defmacro_obsolete_warning(final SubLObject v_obsolete, final SubLObject replacements) {
        SubLObject string = (SubLObject)access_macros.NIL;
        SubLObject stream = (SubLObject)access_macros.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            PrintLow.format(stream, (SubLObject)access_macros.$str40$Macro__S_is_obsolete, v_obsolete);
            if (access_macros.NIL != replacements) {
                print_high.princ((SubLObject)access_macros.$str41$____use_, stream);
                SubLObject cdolist_list_var = replacements;
                SubLObject replacement = (SubLObject)access_macros.NIL;
                replacement = cdolist_list_var.first();
                while (access_macros.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)access_macros.$str42$_S_, replacement);
                    cdolist_list_var = cdolist_list_var.rest();
                    replacement = cdolist_list_var.first();
                }
                print_high.princ((SubLObject)access_macros.$str43$instead_, stream);
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)access_macros.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)access_macros.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Errors.warn((SubLObject)access_macros.$str44$_A, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13838L)
    public static SubLObject register_external_symbol(final SubLObject symbol) {
        Hashtables.sethash(symbol, access_macros.$external_symbols$.getGlobalValue(), (SubLObject)access_macros.T);
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 13955L)
    public static SubLObject external_symbol_p(final SubLObject v_object) {
        return Hashtables.gethash_without_values(v_object, access_macros.$external_symbols$.getGlobalValue(), (SubLObject)access_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14061L)
    public static SubLObject external_function_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isFunctionSpec() && !v_object.isMacroOperator() && access_macros.NIL != external_symbol_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14222L)
    public static SubLObject external_macro_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isMacroOperator() && access_macros.NIL != external_symbol_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14348L)
    public static SubLObject all_external_symbols() {
        SubLObject external_symbols = (SubLObject)access_macros.NIL;
        SubLObject symbol = (SubLObject)access_macros.NIL;
        SubLObject value = (SubLObject)access_macros.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(access_macros.$external_symbols$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                external_symbols = (SubLObject)ConsesLow.cons(symbol, external_symbols);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        external_symbols = Sort.sort(external_symbols, Symbols.symbol_function((SubLObject)access_macros.$sym47$STRING_LESSP), Symbols.symbol_function((SubLObject)access_macros.$sym48$SYMBOL_NAME));
        return external_symbols;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14641L)
    public static SubLObject define_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name)), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym50$DEFINE_PUBLIC, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 14995L)
    public static SubLObject defmacro_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)access_macros.NIL;
        SubLObject arglist = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list0);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, name)), (SubLObject)ConsesLow.listS((SubLObject)access_macros.$sym51$DEFMACRO_PUBLIC, name, arglist, ConsesLow.append(body, (SubLObject)access_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 15350L)
    public static SubLObject defconstant_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        SubLObject initialization = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list20);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list20);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym52$DEFCONSTANT_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list20);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 15766L)
    public static SubLObject deflexical_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym53$DEFLEXICAL_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 16179L)
    public static SubLObject defparameter_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym54$DEFPARAMETER_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 16598L)
    public static SubLObject defglobal_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym55$DEFGLOBAL_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 17008L)
    public static SubLObject defvar_external(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)access_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)access_macros.$list23);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : access_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)access_macros.$list23);
        current = current.rest();
        if (access_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym49$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym3$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)access_macros.$sym56$DEFVAR_PUBLIC, variable, initialization, documentation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)access_macros.$list23);
        return (SubLObject)access_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18069L)
    public static SubLObject register_macro_helper(final SubLObject helper, final SubLObject macro) {
        SubLObject macros = Symbols.get(helper, (SubLObject)access_macros.$kw58$MACRO_HELPER_FOR, (SubLObject)access_macros.UNPROVIDED);
        if (macro.isCons()) {
            SubLObject cdolist_list_var = macro;
            SubLObject one_macro = (SubLObject)access_macros.NIL;
            one_macro = cdolist_list_var.first();
            while (access_macros.NIL != cdolist_list_var) {
                final SubLObject item_var = one_macro;
                if (access_macros.NIL == conses_high.member(item_var, macros, Symbols.symbol_function((SubLObject)access_macros.EQL), Symbols.symbol_function((SubLObject)access_macros.IDENTITY))) {
                    macros = (SubLObject)ConsesLow.cons(item_var, macros);
                }
                cdolist_list_var = cdolist_list_var.rest();
                one_macro = cdolist_list_var.first();
            }
        }
        else if (access_macros.NIL == conses_high.member(macro, macros, Symbols.symbol_function((SubLObject)access_macros.EQL), Symbols.symbol_function((SubLObject)access_macros.IDENTITY))) {
            macros = (SubLObject)ConsesLow.cons(macro, macros);
        }
        Symbols.put(helper, (SubLObject)access_macros.$kw58$MACRO_HELPER_FOR, macros);
        return helper;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18437L)
    public static SubLObject macro_helper_for_macroP(final SubLObject helper, final SubLObject macro) {
        return conses_high.member(macro, Symbols.get(helper, (SubLObject)access_macros.$kw58$MACRO_HELPER_FOR, (SubLObject)access_macros.UNPROVIDED), (SubLObject)access_macros.UNPROVIDED, (SubLObject)access_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/access-macros.lisp", position = 18550L)
    public static SubLObject macro_helper_for_any_of_macrosP(final SubLObject helper, final SubLObject macros) {
        SubLObject helperP = (SubLObject)access_macros.NIL;
        if (access_macros.NIL == helperP) {
            SubLObject csome_list_var = macros;
            SubLObject macro = (SubLObject)access_macros.NIL;
            macro = csome_list_var.first();
            while (access_macros.NIL == helperP && access_macros.NIL != csome_list_var) {
                if (access_macros.NIL != macro_helper_for_macroP(helper, macro)) {
                    helperP = macro;
                }
                csome_list_var = csome_list_var.rest();
                macro = csome_list_var.first();
            }
        }
        return helperP;
    }
    
    public static SubLObject declare_access_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_public", "DEFINE-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_protected", "DEFINE-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_private", "DEFINE-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_macro_helper", "DEFINE-MACRO-HELPER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "symbol_or_symbol_list_p", "SYMBOL-OR-SYMBOL-LIST-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_public", "DEFMACRO-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_protected", "DEFMACRO-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_private", "DEFMACRO-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_macro_helper", "DEFMACRO-MACRO-HELPER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defconstant_public", "DEFCONSTANT-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defconstant_protected", "DEFCONSTANT-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defconstant_private", "DEFCONSTANT-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "deflexical_public", "DEFLEXICAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "deflexical_protected", "DEFLEXICAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "deflexical_private", "DEFLEXICAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defparameter_public", "DEFPARAMETER-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defparameter_protected", "DEFPARAMETER-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defparameter_private", "DEFPARAMETER-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defparameter_macro_helper", "DEFPARAMETER-MACRO-HELPER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defglobal_public", "DEFGLOBAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defglobal_protected", "DEFGLOBAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defglobal_private", "DEFGLOBAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defvar_public", "DEFVAR-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defvar_protected", "DEFVAR-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defvar_private", "DEFVAR-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defvar_macro_helper", "DEFVAR-MACRO-HELPER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_obsolete", "DEFINE-OBSOLETE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "define_obsolete_register", "DEFINE-OBSOLETE-REGISTER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_obsolete", "DEFMACRO-OBSOLETE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "defmacro_obsolete_warning", "DEFMACRO-OBSOLETE-WARNING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "register_external_symbol", "REGISTER-EXTERNAL-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "external_symbol_p", "EXTERNAL-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "external_function_p", "EXTERNAL-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "external_macro_p", "EXTERNAL-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "all_external_symbols", "ALL-EXTERNAL-SYMBOLS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "define_external", "DEFINE-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defmacro_external", "DEFMACRO-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defconstant_external", "DEFCONSTANT-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "deflexical_external", "DEFLEXICAL-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defparameter_external", "DEFPARAMETER-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defglobal_external", "DEFGLOBAL-EXTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.access_macros", "defvar_external", "DEFVAR-EXTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "register_macro_helper", "REGISTER-MACRO-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "macro_helper_for_macroP", "MACRO-HELPER-FOR-MACRO?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.access_macros", "macro_helper_for_any_of_macrosP", "MACRO-HELPER-FOR-ANY-OF-MACROS?", 2, 0, false);
        return (SubLObject)access_macros.NIL;
    }
    
    public static SubLObject init_access_macros_file() {
        access_macros.$external_symbols$ = SubLFiles.deflexical("*EXTERNAL-SYMBOLS*", maybeDefault((SubLObject)access_macros.$sym45$_EXTERNAL_SYMBOLS_, access_macros.$external_symbols$, ()->(Hashtables.make_hash_table((SubLObject)access_macros.$int46$400, Symbols.symbol_function((SubLObject)access_macros.EQ), (SubLObject)access_macros.UNPROVIDED))));
        access_macros.$external_access_methods$ = SubLFiles.deflexical("*EXTERNAL-ACCESS-METHODS*", (SubLObject)access_macros.$list57);
        return (SubLObject)access_macros.NIL;
    }
    
    public static SubLObject setup_access_macros_file() {
        meta_macros.declare_indention_pattern((SubLObject)access_macros.$sym28$DEFPARAMETER_MACRO_HELPER, (SubLObject)access_macros.$list29);
        SubLObject cdolist_list_var = access_macros.$external_access_methods$.getGlobalValue();
        SubLObject symbol = (SubLObject)access_macros.NIL;
        symbol = cdolist_list_var.first();
        while (access_macros.NIL != cdolist_list_var) {
            register_external_symbol(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        return (SubLObject)access_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_access_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_access_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_access_macros_file();
    }
    
    static {
        me = (SubLFile)new access_macros();
        access_macros.$external_symbols$ = null;
        access_macros.$external_access_methods$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$PROCLAIM = SubLObjectFactory.makeSymbol("PROCLAIM");
        $sym3$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym4$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
        $sym5$PUBLIC = SubLObjectFactory.makeSymbol("PUBLIC");
        $sym6$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym7$PROTECTED = SubLObjectFactory.makeSymbol("PROTECTED");
        $sym8$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MACRO")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACRO"));
        $kw11$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw12$MACRO = SubLObjectFactory.makeKeyword("MACRO");
        $str13$Macro_or_list_of_macros_must_be_s = SubLObjectFactory.makeString("Macro or list of macros must be specified, not ~a");
        $sym14$REGISTER_MACRO_HELPER = SubLObjectFactory.makeSymbol("REGISTER-MACRO-HELPER");
        $sym15$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym17$DEFMACRO = SubLObjectFactory.makeSymbol("DEFMACRO");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MACRO")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym19$DEFMACRO_PROTECTED = SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym21$VACCESS = SubLObjectFactory.makeSymbol("VACCESS");
        $sym22$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym24$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $sym25$DEFPARAMETER = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MACRO")), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym27$DEFPARAMETER_PROTECTED = SubLObjectFactory.makeSymbol("DEFPARAMETER-PROTECTED");
        $sym28$DEFPARAMETER_MACRO_HELPER = SubLObjectFactory.makeSymbol("DEFPARAMETER-MACRO-HELPER");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym30$DEFGLOBAL = SubLObjectFactory.makeSymbol("DEFGLOBAL");
        $sym31$DEFVAR = SubLObjectFactory.makeSymbol("DEFVAR");
        $sym32$DEFVAR_PROTECTED = SubLObjectFactory.makeSymbol("DEFVAR-PROTECTED");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENTS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REPLACEMENTS"));
        $kw35$REPLACEMENTS = SubLObjectFactory.makeKeyword("REPLACEMENTS");
        $str36$Method_or_list_of_methods_must_be = SubLObjectFactory.makeString("Method or list of methods must be specified, not ~a");
        $sym37$DEFINE_OBSOLETE_REGISTER = SubLObjectFactory.makeSymbol("DEFINE-OBSOLETE-REGISTER");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENTS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$DEFMACRO_OBSOLETE_WARNING = SubLObjectFactory.makeSymbol("DEFMACRO-OBSOLETE-WARNING");
        $str40$Macro__S_is_obsolete = SubLObjectFactory.makeString("Macro ~S is obsolete");
        $str41$____use_ = SubLObjectFactory.makeString(" -- use ");
        $str42$_S_ = SubLObjectFactory.makeString("~S ");
        $str43$instead_ = SubLObjectFactory.makeString("instead.");
        $str44$_A = SubLObjectFactory.makeString("~A");
        $sym45$_EXTERNAL_SYMBOLS_ = SubLObjectFactory.makeSymbol("*EXTERNAL-SYMBOLS*");
        $int46$400 = SubLObjectFactory.makeInteger(400);
        $sym47$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym48$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym49$REGISTER_EXTERNAL_SYMBOL = SubLObjectFactory.makeSymbol("REGISTER-EXTERNAL-SYMBOL");
        $sym50$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym51$DEFMACRO_PUBLIC = SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC");
        $sym52$DEFCONSTANT_PUBLIC = SubLObjectFactory.makeSymbol("DEFCONSTANT-PUBLIC");
        $sym53$DEFLEXICAL_PUBLIC = SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC");
        $sym54$DEFPARAMETER_PUBLIC = SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC");
        $sym55$DEFGLOBAL_PUBLIC = SubLObjectFactory.makeSymbol("DEFGLOBAL-PUBLIC");
        $sym56$DEFVAR_PUBLIC = SubLObjectFactory.makeSymbol("DEFVAR-PUBLIC");
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DEFINE-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-MACRO-HELPER"), SubLObjectFactory.makeSymbol("DEFMACRO-PRIVATE"), SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED"), SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC"), SubLObjectFactory.makeSymbol("DEFMACRO-MACRO-HELPER"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PRIVATE"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PROTECTED"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PUBLIC"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PROTECTED"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC"), SubLObjectFactory.makeSymbol("DEFVAR-PRIVATE"), SubLObjectFactory.makeSymbol("DEFVAR-PROTECTED"), SubLObjectFactory.makeSymbol("DEFVAR-PUBLIC") });
        $kw58$MACRO_HELPER_FOR = SubLObjectFactory.makeKeyword("MACRO-HELPER-FOR");
    }
}

/*

	Total time: 221 ms
	
*/
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.gt_modules;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.search;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transitivity;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-INTEGRITY
 *  source file: /cyc/top/cycl/thesaurus/tm-integrity.lisp
 *  created:     2019/07/03 17:38:30
 */
public final class tm_integrity extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_integrity() {
    }

    public static final SubLFile me = new tm_integrity();

    public static final String myName = "com.cyc.cycjava.cycl.thesaurus.tm_integrity";

    // // Definitions
    /**
     * table of fix specifications for tm integrity violations
     */
    // defparameter
    public static final SubLSymbol $tmi_fix_from_id$ = makeSymbol("*TMI-FIX-FROM-ID*");

    /**
     * The types of operations to fix integrity violations.  For each, there needs to be a
     * show method (see tm-show-fix-choices), and a perform method (see tm-perform-fix)
     */
    // defparameter
    public static final SubLSymbol $tmi_fix_ops$ = makeSymbol("*TMI-FIX-OPS*");

    /**
     * A-list of <thesaurus-or-relation> - <hashtable> pairs to keep track of unique violations
     */
    // defparameter
    public static final SubLSymbol $tm_unique_violations_hashes$ = makeSymbol("*TM-UNIQUE-VIOLATIONS-HASHES*");

    /**
     * Do not ever set this - Only rebind it.  It is intended to be used to keep track
     * of what object is being used as an index into *tm-unique-violations-hashes*
     * during an integrity check.  Callers can use this value if non-nil when calling
     * the accessors below.  If nil, they should use some other default such as
     * the thesaurus of the relevant fix for the violation.
     */
    // defparameter
    public static final SubLSymbol $tm_unique_violation_hashes_index_object$ = makeSymbol("*TM-UNIQUE-VIOLATION-HASHES-INDEX-OBJECT*");

    public static final SubLObject tm_add_to_unique_violations_hashes(SubLObject thesaurus_or_relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = make_hash_table($int$256, symbol_function(EQUAL), UNPROVIDED);
                $tm_unique_violations_hashes$.setDynamicValue(cons(cons(thesaurus_or_relation, table), $tm_unique_violations_hashes$.getDynamicValue(thread)), thread);
                return table;
            }
        }
    }

    public static final SubLObject tm_unique_violations_hash_of_object(SubLObject thesaurus_or_relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assoc(thesaurus_or_relation, $tm_unique_violations_hashes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        }
    }

    public static final SubLObject tm_clear_unique_violations_of_object(SubLObject thesaurus_or_relation) {
        {
            SubLObject table = tm_unique_violations_hash_of_object(thesaurus_or_relation);
            if (NIL != table) {
                return clrhash(table);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_record_violation(SubLObject violation, SubLObject thesaurus_or_relation) {
        {
            SubLObject table = tm_unique_violations_hash_of_object(thesaurus_or_relation);
            if (NIL != table) {
                return sethash(violation, table, $CURRENT);
            }
        }
        return NIL;
    }

    /**
     * Returns T IFF the violation is not equal to one already found, and updates
     * tm-unique-violations-hashes* if it's new
     */
    public static final SubLObject tm_unique_violationP(SubLObject violation, SubLObject thesaurus_or_relation) {
        {
            SubLObject table = tm_unique_violations_hash_of_object(thesaurus_or_relation);
            if (NIL == table) {
                table = tm_add_to_unique_violations_hashes(thesaurus_or_relation);
            }
            {
                SubLObject foundP = gethash(violation, table, UNPROVIDED);
                if (NIL != foundP) {
                    return NIL;
                } else {
                    return tm_record_violation(violation, thesaurus_or_relation);
                }
            }
        }
    }

    /**
     * Returns T IFF the violation is not equal to one already found, and updates
     * tm-unique-violations-hashes* if it's new.
     */
    public static final SubLObject tm_unique_violation_in_relevant_thesaurusP(SubLObject violation) {
        {
            SubLObject index_object = tm_violation_index(violation);
            return tm_unique_violationP(violation, index_object);
        }
    }

    /**
     * Removes VIOLATION from *tm-unique-violations-hashes*.
     */
    public static final SubLObject tm_remove_violation_from_unique_hash(SubLObject violation) {
        {
            SubLObject thesaurus_or_relation = tm_violation_index(violation);
            SubLObject table = tm_unique_violations_hash_of_object(thesaurus_or_relation);
            if (NIL != table) {
                remhash(violation, table);
            }
            return NIL;
        }
    }

    public static final class $tmi_fix_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return tm_integrity.$tmi_fix_native.structDecl;
        }

        public SubLObject getField2() {
            return $id;
        }

        public SubLObject getField3() {
            return $module;
        }

        public SubLObject getField4() {
            return $op;
        }

        public SubLObject getField5() {
            return $data;
        }

        public SubLObject getField6() {
            return $violator;
        }

        public SubLObject getField7() {
            return $v_data;
        }

        public SubLObject getField8() {
            return $mt;
        }

        public SubLObject getField9() {
            return $superior;
        }

        public SubLObject getField10() {
            return $inferior;
        }

        public SubLObject getField11() {
            return $alternates;
        }

        public SubLObject getField12() {
            return $alist;
        }

        public SubLObject setField2(SubLObject value) {
            return $id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $module = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $op = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $data = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $violator = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $v_data = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $mt = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $superior = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $inferior = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $alternates = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $alist = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $module = Lisp.NIL;

        public SubLObject $op = Lisp.NIL;

        public SubLObject $data = Lisp.NIL;

        public SubLObject $violator = Lisp.NIL;

        public SubLObject $v_data = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        public SubLObject $superior = Lisp.NIL;

        public SubLObject $inferior = Lisp.NIL;

        public SubLObject $alternates = Lisp.NIL;

        public SubLObject $alist = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(tm_integrity.$tmi_fix_native.class, TMI_FIX, TMI_FIX_P, $list_alt6, $list_alt7, new String[]{ "$id", "$module", "$op", "$data", "$violator", "$v_data", "$mt", "$superior", "$inferior", "$alternates", "$alist" }, $list_alt8, $list_alt9, PRINT_TMI_FIX);
    }

    // defconstant
    public static final SubLSymbol $dtp_tmi_fix$ = makeSymbol("*DTP-TMI-FIX*");

    public static final SubLObject tmi_fix_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_tmi_fix(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tmi_fix_p(SubLObject v_object) {
        return v_object.getClass() == tm_integrity.$tmi_fix_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $tmi_fix_p$UnaryFunction extends UnaryFunction {
        public $tmi_fix_p$UnaryFunction() {
            super(extractFunctionNamed("TMI-FIX-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return tmi_fix_p(arg1);
        }
    }

    public static final SubLObject tmi_fix_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField2();
    }

    public static final SubLObject tmi_fix_module(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField3();
    }

    public static final SubLObject tmi_fix_op(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField4();
    }

    public static final SubLObject tmi_fix_data(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField5();
    }

    public static final SubLObject tmi_fix_violator(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField6();
    }

    public static final SubLObject tmi_fix_v_data(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField7();
    }

    public static final SubLObject tmi_fix_mt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField8();
    }

    public static final SubLObject tmi_fix_superior(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField9();
    }

    public static final SubLObject tmi_fix_inferior(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField10();
    }

    public static final SubLObject tmi_fix_alternates(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField11();
    }

    public static final SubLObject tmi_fix_alist(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.getField12();
    }

    public static final SubLObject _csetf_tmi_fix_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tmi_fix_module(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tmi_fix_op(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tmi_fix_data(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tmi_fix_violator(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tmi_fix_v_data(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tmi_fix_mt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tmi_fix_superior(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tmi_fix_inferior(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tmi_fix_alternates(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tmi_fix_alist(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        return v_object.setField12(value);
    }

    public static final SubLObject make_tmi_fix(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new tm_integrity.$tmi_fix_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_tmi_fix_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULE)) {
                            _csetf_tmi_fix_module(v_new, current_value);
                        } else
                            if (pcase_var.eql($OP)) {
                                _csetf_tmi_fix_op(v_new, current_value);
                            } else
                                if (pcase_var.eql($DATA)) {
                                    _csetf_tmi_fix_data(v_new, current_value);
                                } else
                                    if (pcase_var.eql($VIOLATOR)) {
                                        _csetf_tmi_fix_violator(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($V_DATA)) {
                                            _csetf_tmi_fix_v_data(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MT)) {
                                                _csetf_tmi_fix_mt(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SUPERIOR)) {
                                                    _csetf_tmi_fix_superior(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($INFERIOR)) {
                                                        _csetf_tmi_fix_inferior(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ALTERNATES)) {
                                                            _csetf_tmi_fix_alternates(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($ALIST)) {
                                                                _csetf_tmi_fix_alist(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt45$Invalid_slot__S_for_construction_, current_arg);
                                                            }










                }
            }
            return v_new;
        }
    }

    public static final SubLObject sxhash_tmi_fix_method(SubLObject v_object) {
        {
            SubLObject id = tmi_fix_id(v_object);
            return id.isInteger() ? ((SubLObject) (Sxhash.sxhash(id))) : ZERO_INTEGER;
        }
    }

    /**
     * Free list for TMI-FIX objects
     */
    // deflexical
    private static final SubLSymbol $tmi_fix_free_list$ = makeSymbol("*TMI-FIX-FREE-LIST*");

    /**
     * Lock for TMI-FIX object free list
     */
    // deflexical
    private static final SubLSymbol $tmi_fix_free_lock$ = makeSymbol("*TMI-FIX-FREE-LOCK*");

    /**
     * Make a new TMI-FIX in the static area
     */
    public static final SubLObject make_static_tmi_fix() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        v_object = make_tmi_fix(UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Initialize a TMI-FIX for use
     */
    public static final SubLObject init_tmi_fix(SubLObject fix) {
        _csetf_tmi_fix_id(fix, NIL);
        _csetf_tmi_fix_module(fix, NIL);
        _csetf_tmi_fix_op(fix, NIL);
        _csetf_tmi_fix_data(fix, NIL);
        _csetf_tmi_fix_violator(fix, NIL);
        _csetf_tmi_fix_v_data(fix, NIL);
        _csetf_tmi_fix_mt(fix, NIL);
        _csetf_tmi_fix_superior(fix, NIL);
        _csetf_tmi_fix_inferior(fix, NIL);
        _csetf_tmi_fix_alternates(fix, NIL);
        _csetf_tmi_fix_alist(fix, NIL);
        return fix;
    }

    /**
     * Check if OBJECT is a TMI-FIX that has been explicitly freed
     */
    public static final SubLObject free_tmi_fix_p(SubLObject v_object) {
        return makeBoolean((NIL != tmi_fix_p(v_object)) && (tmi_fix_module(v_object) == $FREE));
    }

    /**
     * Place a TMI-FIX onto the free list
     */
    public static final SubLObject free_tmi_fix(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TMI_FIX_P);
        if (NIL == free_tmi_fix_p(v_object)) {
            v_object = init_tmi_fix(v_object);
            _csetf_tmi_fix_module(v_object, $FREE);
            if (NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                {
                    SubLObject lock = $tmi_fix_free_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_tmi_fix_id(v_object, $tmi_fix_free_list$.getGlobalValue());
                        $tmi_fix_free_list$.setGlobalValue(v_object);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Get a TMI-FIX from the free list, or make a new one if needed
     */
    public static final SubLObject get_tmi_fix() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                if (NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                    return init_tmi_fix(make_static_tmi_fix());
                } else {
                    return init_tmi_fix(make_tmi_fix(UNPROVIDED));
                }
            }
            {
                SubLObject v_object = NIL;
                SubLObject found = NIL;
                SubLObject lock = $tmi_fix_free_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    v_object = $tmi_fix_free_list$.getGlobalValue();
                    for (; !((NIL != found) || (NIL == v_object));) {
                        if (NIL != free_tmi_fix_p(v_object)) {
                            $tmi_fix_free_list$.setGlobalValue(tmi_fix_id(v_object));
                            found = T;
                        } else {
                            v_object = tmi_fix_id(v_object);
                        }
                    }
                    if (NIL == found) {
                        if (NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                            v_object = make_static_tmi_fix();
                        } else {
                            v_object = make_tmi_fix(UNPROVIDED);
                        }
                        $tmi_fix_free_list$.setGlobalValue(NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return init_tmi_fix(v_object);
            }
        }
    }

    public static final SubLObject print_tmi_fix(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt49$__fix__S__S__S_, new SubLObject[]{ tmi_fix_module(v_object), tmi_fix_op(v_object), tmi_fix_violator(v_object) });
        return v_object;
    }

    public static final SubLObject remove_tmi_fix(SubLObject fix) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = tmi_fix_id(fix);
                remhash(id, $tmi_fix_from_id$.getDynamicValue(thread));
                free_tmi_fix(fix);
                return NIL;
            }
        }
    }

    /**
     * Return the tmi-fix with ID, or NIL if not present.
     */
    public static final SubLObject find_tmi_fix_by_id(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(id, FIXNUMP);
            return gethash(id, $tmi_fix_from_id$.getDynamicValue(thread), NIL);
        }
    }

    /**
     * Create a new tmi-fix node for integrity module MODULE with operator OP.
     */
    public static final SubLObject create_tmi_fix(SubLObject module, SubLObject op, SubLObject alist) {
        if (alist == UNPROVIDED) {
            alist = NIL;
        }
        SubLTrampolineFile.checkType(module, $sym51$TMI_MODULE_);
        SubLTrampolineFile.checkType(op, $sym52$TMI_FIX_OP_);
        {
            SubLObject tmi_fix = make_tmi_fix_shell(UNPROVIDED);
            _csetf_tmi_fix_module(tmi_fix, module);
            _csetf_tmi_fix_op(tmi_fix, op);
            {
                SubLObject cdolist_list_var = alist;
                SubLObject prop_value = NIL;
                for (prop_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prop_value = cdolist_list_var.first()) {
                    if (prop_value.isCons()) {
                        {
                            SubLObject datum = prop_value;
                            SubLObject current = datum;
                            SubLObject property = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt53);
                            property = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt53);
                            value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pcase_var = property;
                                    if (pcase_var.eql($DATA)) {
                                        _csetf_tmi_fix_data(tmi_fix, value);
                                    } else
                                        if (pcase_var.eql($VIOLATOR)) {
                                            _csetf_tmi_fix_violator(tmi_fix, value);
                                        } else
                                            if (pcase_var.eql($V_DATA)) {
                                                _csetf_tmi_fix_v_data(tmi_fix, value);
                                            } else
                                                if (pcase_var.eql($MT)) {
                                                    _csetf_tmi_fix_mt(tmi_fix, value);
                                                } else
                                                    if (pcase_var.eql($ALTERNATES)) {
                                                        _csetf_tmi_fix_alternates(tmi_fix, value);
                                                    } else
                                                        if (pcase_var.eql($SUPERIOR)) {
                                                            _csetf_tmi_fix_superior(tmi_fix, value);
                                                        } else
                                                            if (pcase_var.eql($INFERIOR)) {
                                                                _csetf_tmi_fix_inferior(tmi_fix, value);
                                                            } else {
                                                                if (property.isKeyword()) {
                                                                    _csetf_tmi_fix_alist(tmi_fix, cons(prop_value, tmi_fix_alist(tmi_fix)));
                                                                }
                                                            }






                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt53);
                            }
                        }
                    }
                }
            }
            connect_tmi_fix(tmi_fix);
            return tmi_fix;
        }
    }

    public static final SubLObject tmi_moduleP(SubLObject v_object) {
        return keywordp(v_object);
    }

    public static final SubLObject tmi_fix_opP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, $tmi_fix_ops$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject connect_tmi_fix(SubLObject fix) {
        return fix;
    }

    public static final SubLObject make_tmi_fix_shell(SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != id) {
                SubLTrampolineFile.checkType(id, FIXNUMP);
            } else {
                id = make_tmi_fix_id();
            }
            {
                SubLObject tmi_fix = get_tmi_fix();
                _csetf_tmi_fix_id(tmi_fix, id);
                sethash(id, $tmi_fix_from_id$.getDynamicValue(thread), tmi_fix);
                return tmi_fix;
            }
        }
    }

    /**
     * Return a unique integer id for a tmi-fix
     */
    public static final SubLObject make_tmi_fix_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = random.random($int$16777216);
                SubLObject tmi_fix = NIL;
                for (tmi_fix = gethash(id, $tmi_fix_from_id$.getDynamicValue(thread), NIL); NIL != tmi_fix; tmi_fix = gethash(id, $tmi_fix_from_id$.getDynamicValue(thread), NIL)) {
                    id = add(id, ONE_INTEGER);
                }
                return id;
            }
        }
    }

    public static final SubLObject add_fix_alternates(SubLObject fixes) {
        {
            SubLObject cdolist_list_var = fixes;
            SubLObject fix = NIL;
            for (fix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fix = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = fixes;
                    SubLObject alternate = NIL;
                    for (alternate = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , alternate = cdolist_list_var_1.first()) {
                        if (!fix.eql(alternate)) {
                            {
                                SubLObject item_var = tmi_fix_id(alternate);
                                if (NIL == member(item_var, tmi_fix_alternates(fix), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    _csetf_tmi_fix_alternates(fix, cons(item_var, tmi_fix_alternates(fix)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return fixes;
    }

    /**
     * Used internally by tm-integrity-check-concept
     */
    // defparameter
    public static final SubLSymbol $tm_concept_assertion_violations$ = makeSymbol("*TM-CONCEPT-ASSERTION-VIOLATIONS*");

    /**
     * Used internally by tm-integrity-check-concept
     */
    // defparameter
    public static final SubLSymbol $tm_concept_predicate_violations$ = makeSymbol("*TM-CONCEPT-PREDICATE-VIOLATIONS*");

    /**
     * Used internally by tm-integrity-check-predicate
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_predicate_table$ = makeSymbol("*TM-INTEGRITY-PREDICATE-TABLE*");

    /**
     * Are interactive fixes to tm-integrity violations permited?
     */
    // defparameter
    public static final SubLSymbol $tm_permit_user_fixesP$ = makeSymbol("*TM-PERMIT-USER-FIXES?*");

    /**
     * Are automatic fixes to tm-integrity violations permited?
     */
    // defparameter
    public static final SubLSymbol $tm_permit_auto_fixesP$ = makeSymbol("*TM-PERMIT-AUTO-FIXES?*");

    // defparameter
    public static final SubLSymbol $tm_perform_concept_checksP$ = makeSymbol("*TM-PERFORM-CONCEPT-CHECKS?*");

    // defparameter
    public static final SubLSymbol $tm_perform_predicate_checksP$ = makeSymbol("*TM-PERFORM-PREDICATE-CHECKS?*");

    // defparameter
    public static final SubLSymbol $tm_perform_assertion_checksP$ = makeSymbol("*TM-PERFORM-ASSERTION-CHECKS?*");

    /**
     * Perform all integrity checking of thesaurus ASSERTION
     * Return a list of integrity violations.
     */
    public static final SubLObject tm_integrity_check_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = tm_relevant_thesaurus_of_assertion(assertion);
                SubLObject v_modules = tm_integrity_modules(thesaurus);
                SubLObject violations = NIL;
                SubLObject unique_index = (NIL != $tm_unique_violation_hashes_index_object$.getDynamicValue(thread)) ? ((SubLObject) ($tm_unique_violation_hashes_index_object$.getDynamicValue(thread))) : thesaurus;
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    if (tm_integrity_module_level(module) == $ASSERTION) {
                        {
                            SubLObject test_func = tm_integrity_module_test(module);
                            if (NIL != test_func) {
                                {
                                    SubLObject violation_data = funcall(test_func, assertion);
                                    if (NIL != violation_data) {
                                        violations = cons(tm_make_violation(module, violation_data, unique_index), violations);
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(violations);
            }
        }
    }

    /**
     * Perform all integrity checking of thesaurus PREDICATE
     * Return a list of integrity violations.
     */
    public static final SubLObject tm_integrity_check_predicate(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                if (NIL == tm_integrity_check_predicate_doneP(assertions_high.gaf_arg0(assertion))) {
                    {
                        SubLObject thesaurus = tm_relevant_thesaurus_of_assertion(assertion);
                        SubLObject v_modules = tm_integrity_modules(thesaurus);
                        SubLObject violations = NIL;
                        SubLObject unique_index = (NIL != $tm_unique_violation_hashes_index_object$.getDynamicValue(thread)) ? ((SubLObject) ($tm_unique_violation_hashes_index_object$.getDynamicValue(thread))) : thesaurus;
                        SubLObject cdolist_list_var = v_modules;
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            if (tm_integrity_module_level(module) == $PREDICATE) {
                                {
                                    SubLObject test_func = tm_integrity_module_test(module);
                                    if (NIL != test_func) {
                                        {
                                            SubLObject violation_data = funcall(test_func, assertion);
                                            if (NIL != violation_data) {
                                                violations = cons(tm_make_violation(module, violation_data, unique_index), violations);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return nreverse(violations);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Perform all integrity checking of CONCEPT in THESAURUS.
     * Return a list of integrity violations.
     */
    public static final SubLObject tm_integrity_check_concept(SubLObject concept, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_modules = tm_integrity_modules(thesaurus);
                SubLObject concept_level_violations = NIL;
                SubLObject predicate_level_violations = NIL;
                SubLObject assertion_level_violations = NIL;
                SubLObject unique_index = (NIL != $tm_unique_violation_hashes_index_object$.getDynamicValue(thread)) ? ((SubLObject) ($tm_unique_violation_hashes_index_object$.getDynamicValue(thread))) : thesaurus;
                if (NIL != $tm_perform_concept_checksP$.getDynamicValue(thread)) {
                    {
                        SubLObject cdolist_list_var = v_modules;
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            if (tm_integrity_module_level(module) == $CONCEPT) {
                                {
                                    SubLObject test_func = tm_integrity_module_test(module);
                                    if (NIL != test_func) {
                                        {
                                            SubLObject violation_data = funcall(test_func, concept, thesaurus);
                                            if (NIL != violation_data) {
                                                concept_level_violations = cons(tm_make_violation(module, violation_data, unique_index), concept_level_violations);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != $tm_perform_predicate_checksP$.getDynamicValue(thread)) {
                    {
                        SubLObject _prev_bind_0 = $tm_concept_predicate_violations$.currentBinding(thread);
                        try {
                            $tm_concept_predicate_violations$.bind(NIL, thread);
                            clrhash($tm_integrity_predicate_table$.getDynamicValue(thread));
                            kb_mapping.map_gaf_arg_index(symbol_function(TM_INTEGRITY_CHECK_CONCEPT_PREDICATE), concept, ONE_INTEGER, NIL, $TRUE, thesaurus);
                            kb_mapping.map_gaf_arg_index(symbol_function(TM_INTEGRITY_CHECK_CONCEPT_PREDICATE), concept, TWO_INTEGER, NIL, $TRUE, thesaurus);
                            predicate_level_violations = $tm_concept_predicate_violations$.getDynamicValue(thread);
                        } finally {
                            $tm_concept_predicate_violations$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != $tm_perform_assertion_checksP$.getDynamicValue(thread)) {
                    {
                        SubLObject _prev_bind_0 = $tm_concept_assertion_violations$.currentBinding(thread);
                        try {
                            $tm_concept_assertion_violations$.bind(NIL, thread);
                            kb_mapping.map_gaf_arg_index(symbol_function(TM_INTEGRITY_CHECK_CONCEPT_ASSERTION), concept, ONE_INTEGER, NIL, $TRUE, thesaurus);
                            kb_mapping.map_gaf_arg_index(symbol_function(TM_INTEGRITY_CHECK_CONCEPT_ASSERTION), concept, TWO_INTEGER, NIL, $TRUE, thesaurus);
                            assertion_level_violations = $tm_concept_assertion_violations$.getDynamicValue(thread);
                        } finally {
                            $tm_concept_assertion_violations$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(nconc(assertion_level_violations, predicate_level_violations, concept_level_violations));
            }
        }
    }

    public static final SubLObject tm_integrity_check_concept_predicate(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_concept_predicate_violations$.setDynamicValue(nconc(tm_integrity_check_predicate(assertion), $tm_concept_predicate_violations$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject tm_integrity_check_concept_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_concept_assertion_violations$.setDynamicValue(nconc(tm_integrity_check_assertion(assertion), $tm_concept_assertion_violations$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject tm_integrity_check_predicate_doneP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            return gethash(predicate, $tm_integrity_predicate_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject tm_integrity_check_predicate_done(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(predicate, $tm_integrity_predicate_table$.getDynamicValue(thread), T);
        }
    }

    /**
     * Return a user-presentable message string describing VIOLATION.
     * Return NIL if one couldn't be computed.
     */
    public static final SubLObject tm_integrity_violation_message(SubLObject violation) {
        {
            SubLObject module = tm_violation_module(violation);
            SubLObject data = tm_violation_data(violation);
            if (module.isSymbol()) {
                {
                    SubLObject message_func = tm_integrity_module_message(module);
                    if (NIL != message_func) {
                        {
                            SubLObject message = funcall(message_func, data);
                            if (NIL != message) {
                                return message;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_handle_integrity_violations(SubLObject violations) {
        return Mapping.mapcar(symbol_function(TM_HANDLE_INTEGRITY_VIOLATION), violations);
    }

    /**
     * Perform the default fixer method for integrity VIOLATION (if any).
     * Return T if a method exists and was performed, else NIL.
     */
    public static final SubLObject tm_handle_integrity_violation(SubLObject violation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = tm_violation_module(violation);
                SubLObject data = tm_violation_data(violation);
                if (module.isSymbol()) {
                    if (NIL != $tm_permit_auto_fixesP$.getDynamicValue(thread)) {
                        {
                            SubLObject fixer = tm_integrity_module_fixer(module);
                            if (NIL != fixer) {
                                if (NIL != funcall(fixer, data)) {
                                    return T;
                                }
                            }
                        }
                    }
                    if (NIL != $tm_permit_user_fixesP$.getDynamicValue(thread)) {
                        {
                            SubLObject user_fixer = tm_integrity_module_user_fixer(module);
                            if (NIL != user_fixer) {
                                funcall(user_fixer, data);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * When gathering violations in batch and writing them to a file,
     * perform the default fixer if there is one and if USER-ID is set, and output a remark to STREAM;
     * else, just write the violation out to STREAM.
     */
    public static final SubLObject tm_batch_handle_integrity_violation(SubLObject violation, SubLObject stream, SubLObject user_id) {
        if (user_id == UNPROVIDED) {
            user_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(violation, TM_VIOLATION_P);
            {
                SubLObject module = tm_violation_module(violation);
                SubLObject data = tm_violation_data(violation);
                SubLObject fixed_how = NIL;
                if (NIL == tm_violation_still_thereP(violation)) {
                    format(stream, $str_alt65$____This_violation_is_no_longer_p, tm_integrity_violation_message(violation));
                    return NIL;
                }
                if ((NIL != $tm_permit_auto_fixesP$.getDynamicValue(thread)) && (NIL != user_id)) {
                    {
                        SubLObject _prev_bind_0 = tm_datastructures.$tm_user$.currentBinding(thread);
                        try {
                            tm_datastructures.$tm_user$.bind(user_id, thread);
                            {
                                SubLObject fixer = tm_integrity_module_fixer(module);
                                if (NIL != fixer) {
                                    fixed_how = funcall(fixer, data);
                                }
                            }
                        } finally {
                            tm_datastructures.$tm_user$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                format(stream, $str_alt66$____Violation___A, tm_integrity_violation_message(violation));
                if (NIL != fixed_how) {
                    format(stream, $str_alt67$__Status__Fixed_automatically____, fixed_how);
                } else {
                    format(stream, $str_alt68$__Status__Still_extant);
                }
                return NIL;
            }
        }
    }

    public static final SubLObject tm_fix_still_relevant_by_idP(SubLObject id) {
        {
            SubLObject fix = find_tmi_fix_by_id(id);
            if (NIL != fix) {
                return tm_fix_still_relevantP(fix);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_fix_still_relevantP(SubLObject fix) {
        SubLTrampolineFile.checkType(fix, TMI_FIX_P);
        {
            SubLObject module = tmi_fix_module(fix);
            SubLObject violator = tmi_fix_violator(fix);
            SubLObject test_func = tm_integrity_module_test(module);
            if (NIL != test_func) {
                {
                    SubLObject pcase_var = tm_integrity_module_level(module);
                    if (pcase_var.eql($ASSERTION)) {
                        return funcall(test_func, violator);
                    } else
                        if (pcase_var.eql($PREDICATE)) {
                            return funcall(test_func, violator);
                        } else
                            if (pcase_var.eql($CONSTANT)) {
                                return funcall(test_func, violator, tmi_fix_mt(fix));
                            }


                }
            }
        }
        return NIL;
    }

    /**
     * Returns T IFF VIOLATION is still present.
     */
    public static final SubLObject tm_violation_still_thereP(SubLObject violation) {
        {
            SubLObject module = tm_violation_module(violation);
            SubLObject data = tm_violation_data(violation);
            SubLObject test = tm_integrity_module_test(module);
            if (NIL != test) {
                {
                    SubLObject pcase_var = module;
                    if (pcase_var.eql($TM_SINGLE_ENTRY_FORMAT) || pcase_var.eql($TM_SINGLE_ENTRY_LEXPRED)) {
                        if (NIL != assertions_high.valid_assertion(second(data), UNPROVIDED)) {
                            return funcall(test, second(data));
                        }
                    } else
                        if (pcase_var.eql($TM_BT_NOT_RT_INDIRECT) || pcase_var.eql($TM_NO_PT)) {
                            if (NIL != assertions_high.valid_assertion(data.first(), UNPROVIDED)) {
                                return funcall(test, data.first());
                            }
                        } else
                            if (pcase_var.eql($TM_PT_AND_UF)) {
                                if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
                                    return funcall(test, tm_datastructures.sign_concept(data), tm_datastructures.sign_thesaurus(data));
                                }
                            } else
                                if (pcase_var.eql($TM_NOT_BT_NOT_TOP)) {
                                    if ((NIL != forts.valid_fortP(data.first())) && (NIL != forts.valid_fortP(second(data)))) {
                                        return funcall(test, data.first(), second(data));
                                    }
                                } else
                                    if (pcase_var.eql($TM_NO_PT)) {
                                        if (NIL != assertions_high.valid_assertion(data.first(), UNPROVIDED)) {
                                            return funcall(test, data.first());
                                        }
                                    } else {
                                        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
                                            return funcall(test, data);
                                        }
                                    }




                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_make_violation(SubLObject module, SubLObject data, SubLObject index_object) {
        return list(module, data, index_object);
    }

    public static final SubLObject tm_violation_module(SubLObject violation) {
        return violation.first();
    }

    public static final SubLObject tm_violation_data(SubLObject violation) {
        return second(violation);
    }

    public static final SubLObject tm_violation_index(SubLObject violation) {
        return third(violation);
    }

    public static final SubLObject tm_violation_p(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((v_object.isList() && (NIL != list_utilities.tripleP(v_object))) && (NIL != member(v_object.first(), $tm_integrity_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
        }
    }

    /**
     * Methods which are available for doing integrity checking.
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_modules$ = makeSymbol("*TM-INTEGRITY-MODULES*");

    /**
     * Preconditions: (cor (null mt) (mt? mt)) => T
     * Postconditions: Returns a list of integrity modules to currently use (possibly
     * sensitive to dynamic environment).  If mt is specified, then if
     * specific integrity module use for mt is known (usually only if
     * (thesaurus? mt) is also true) returns a list that corresponds to
     * that information.
     */
    public static final SubLObject tm_integrity_modules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, $sym76$MT_);
        }
        if (NIL == tm_internals.thesaurusP(mt)) {
            return tm_all_integrity_modules();
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tm_all_integrity_modules();
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                if (tm_internals.tm_use_integrity_module_for_thesaurusP(mt, module).eql(tm_internals.$tm_use_integrity_module$.getGlobalValue())) {
                    result = cons(module, result);
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject tm_all_integrity_modules() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_integrity_modules$.getDynamicValue(thread);
        }
    }

    // defparameter
    public static final SubLSymbol $tm_integrity_module_plist_indicators$ = makeSymbol("*TM-INTEGRITY-MODULE-PLIST-INDICATORS*");

    /**
     * Names to show to user of what the modules are called.
     */
    // defparameter
    private static final SubLSymbol $tm_integrity_module_default_short_descriptions$ = makeSymbol("*TM-INTEGRITY-MODULE-DEFAULT-SHORT-DESCRIPTIONS*");

    public static final SubLObject tm_integrity_module(SubLObject name, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $tm_integrity_module_plist_indicators$.getDynamicValue(thread);
                SubLObject indicator = NIL;
                for (indicator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indicator = cdolist_list_var.first()) {
                    remprop(name, indicator);
                }
            }
            {
                SubLObject indicator = NIL;
                SubLObject value = NIL;
                for (indicator = plist.first(), value = second(plist); NIL != plist; indicator = plist.first() , value = second(plist)) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == member(indicator, $tm_integrity_module_plist_indicators$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt78$_S_was_not_a_valid_integrity_modu, indicator);
                        }
                    }
                    put(name, indicator, value);
                    plist = cddr(plist);
                }
            }
            {
                SubLObject item_var = name;
                if (NIL == member(item_var, $tm_integrity_modules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $tm_integrity_modules$.setDynamicValue(cons(item_var, $tm_integrity_modules$.getDynamicValue(thread)), thread);
                }
            }
            put(name, $NAME_AS_STRING, format(NIL, $str_alt80$_s, name));
            if (NIL == subl_promotions.memberP(name, $tm_integrity_module_default_short_descriptions$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR))) {
                $tm_integrity_module_default_short_descriptions$.setDynamicValue(cons(cons(name, format(NIL, $str_alt82$_A, name)), $tm_integrity_module_default_short_descriptions$.getDynamicValue(thread)), thread);
            }
            return name;
        }
    }

    public static final SubLObject tm_integrity_module_level(SubLObject module) {
        return get(module, $LEVEL, $ASSERTION);
    }

    public static final SubLObject tm_integrity_module_required(SubLObject module) {
        return get(module, $REQUIRED, NIL);
    }

    public static final SubLObject tm_integrity_module_test(SubLObject module) {
        return get(module, $TEST, NIL);
    }

    public static final SubLObject tm_integrity_module_message(SubLObject module) {
        return get(module, $MESSAGE, TM_INTEGRITY_DEFAULT_MESSAGE);
    }

    public static final SubLObject tm_integrity_module_fixer(SubLObject module) {
        return get(module, $FIXER, NIL);
    }

    public static final SubLObject tm_integrity_module_user_fixer(SubLObject module) {
        return get(module, $USER_FIXER, NIL);
    }

    public static final SubLObject tm_integrity_module_description(SubLObject module) {
        return get(module, $MODULE_DESCRIPTION, $str_alt91$);
    }

    public static final SubLObject tm_integrity_module_name_as_string(SubLObject module) {
        return get(module, $NAME_AS_STRING, NIL);
    }

    public static final SubLObject tm_integrity_module_short_description(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return get(module, $SHORT_DESCRIPTION, assoc(module, $tm_integrity_module_default_short_descriptions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest());
        }
    }

    public static final SubLObject tm_integrity_default_message(SubLObject datum) {
        return format(NIL, $str_alt93$Integrity_violation_due_to____S, datum);
    }

    public static final SubLObject tm_integrity_unassert_assertion(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return tm_integrity_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static final SubLObject tm_integrity_unassert(SubLObject formula, SubLObject thesaurus) {
        {
            SubLObject ans = NIL;
            ans = tm_io.tm_unassert(formula, thesaurus);
            return ans;
        }
    }

    public static final SubLObject tm_integrity_rename_term(SubLObject concept, SubLObject new_string, SubLObject thesaurus) {
        {
            SubLObject ans = NIL;
            SubLObject old_string = tm_datastructures.concept_term(concept, thesaurus);
            ans = makeBoolean((NIL != tm_io.tm_assert(list($$preferredTerm, concept, new_string), thesaurus, UNPROVIDED)) && (NIL != tm_io.tm_unassert(list($$preferredTerm, concept, old_string), thesaurus)));
            return ans;
        }
    }

    public static final SubLObject tm_integrity_splice_out_term(SubLObject sign) {
        {
            SubLObject concept = tm_datastructures.sign_concept(sign);
            SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
            SubLObject commands = tm_internals.kill_term_fi_commands_top_level(concept, thesaurus, NIL);
            SubLObject narrowers = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject broaders = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject failedP = NIL;
            {
                SubLObject cdolist_list_var = narrowers;
                SubLObject narrower = NIL;
                for (narrower = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_2 = broaders;
                        SubLObject broader = NIL;
                        for (broader = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , broader = cdolist_list_var_2.first()) {
                            commands = cons(list(TM_ASSERT, list(QUOTE, list($$broaderTerm, narrower, broader)), thesaurus), commands);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = commands;
                SubLObject command = NIL;
                for (command = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , command = cdolist_list_var.first()) {
                    failedP = makeBoolean(NIL == eval(command));
                }
            }
            return makeBoolean(NIL == failedP);
        }
    }

    public static final SubLObject tm_integrity_remove_stoplist_word(SubLObject string) {
        {
            SubLObject ans = NIL;
            ans = tm_io.tm_unassert(list($$tmStoplistWord, string), tm_datastructures.$tm_mt$.getGlobalValue());
            return ans;
        }
    }

    public static final SubLObject tm_integrity_assert(SubLObject formula, SubLObject thesaurus) {
        {
            SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
            SubLObject arg1 = el_utilities.literal_arg1(formula, UNPROVIDED);
            SubLObject arg2 = el_utilities.literal_arg2(formula, UNPROVIDED);
            SubLObject op = tm_datastructures.get_tm_op();
            SubLObject op_3 = op;
            tm_datastructures._csetf_tm_op_opcode(op_3, $ADD);
            tm_datastructures._csetf_tm_op_relation(op_3, predicate);
            tm_datastructures._csetf_tm_op_inverseP(op_3, NIL);
            tm_datastructures._csetf_tm_op_args(op_3, list(arg1, arg2));
            tm_datastructures._csetf_tm_op_thesaurus(op_3, thesaurus);
            tm_datastructures._csetf_tm_op_status(op_3, NIL);
            tm_datastructures._csetf_tm_op_verifyP(op_3, NIL);
            tm_datastructures._csetf_tm_op_hiddenP(op_3, NIL);
            tm_datastructures._csetf_tm_op_description(op_3, NIL);
            tm_datastructures._csetf_tm_op_description_args(op_3, NIL);
            if (NIL.isString()) {
                html_tm_editing.set_op_english(op_3, NIL);
            } else {
                html_tm_editing.set_op_english(op_3, UNPROVIDED);
            }
            html_tm_editing.check_and_perform_operation(op);
        }
        return NIL;
    }

    /**
     * For integrity purposes, the relevant thesaurus is the assertion-mt, unless the
     * predicate is topInThesaurus, then it's the arg2.
     */
    public static final SubLObject tm_relevant_thesaurus_of_assertion(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (assertions_high.gaf_arg0(assertion) == $$topInThesaurus) {
            return assertions_high.gaf_arg2(assertion);
        } else {
            return assertions_high.assertion_mt(assertion);
        }
    }

    /**
     * Table of specifications for fixes of integrity violations
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_user_fixes_table$ = makeSymbol("*TM-INTEGRITY-USER-FIXES-TABLE*");

    public static final SubLObject tm_record_integrity_fix(SubLObject module, SubLObject op, SubLObject alist) {
        if (alist == UNPROVIDED) {
            alist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fix = create_tmi_fix(module, op, alist);
                SubLObject id = tmi_fix_id(fix);
                sethash(id, $tm_integrity_user_fixes_table$.getDynamicValue(thread), fix);
                return fix;
            }
        }
    }

    public static final SubLObject tm_remove_integrity_fix(SubLObject fix) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fix, TMI_FIX_P);
            {
                SubLObject id = tmi_fix_id(fix);
                remhash(id, $tm_integrity_user_fixes_table$.getDynamicValue(thread));
                remove_tmi_fix(fix);
                return NIL;
            }
        }
    }

    public static final SubLObject tm_remove_integrity_fix_from_id(SubLObject id) {
        tm_remove_integrity_fix(find_tmi_fix_by_id(id));
        return NIL;
    }

    public static final SubLObject tm_remove_all_integrity_fixes() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdohash_table = $tm_integrity_user_fixes_table$.getDynamicValue(thread);
                SubLObject id = NIL;
                SubLObject fix = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id = getEntryKey(cdohash_entry);
                            fix = getEntryValue(cdohash_entry);
                            tm_remove_integrity_fix(fix);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_all_integrity_fixes() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fixes = NIL;
                SubLObject cdohash_table = $tm_integrity_user_fixes_table$.getDynamicValue(thread);
                SubLObject id = NIL;
                SubLObject fix = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id = getEntryKey(cdohash_entry);
                            fix = getEntryValue(cdohash_entry);
                            fixes = cons(fix, fixes);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return fixes;
            }
        }
    }

    public static final SubLObject tm_integrity_restricted_relation_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject relation = el_utilities.literal_predicate(formula, UNPROVIDED);
                if (NIL != tm_internals.relation_restricted_in_thesaurusP(relation, mt)) {
                    return assertion;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_restricted_relation_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject relation = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(data), ONE_INTEGER);
                return format(NIL, $str_alt102$_A_is_restricted_from_use_in_thes, relation, tm_internals.thesaurus_name(thesaurus));
            }
        } else {
            return $str_alt103$Unable_to_print_violation__some_p;
        }
    }

    public static final SubLObject tm_integrity_restricted_relation_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject formula = assertions_high.gaf_formula(data);
            SubLObject relation = el_utilities.literal_predicate(formula, UNPROVIDED);
            SubLObject asserts = cons(data, list(kb_indexing.find_gaf(list($$tmRelationRestrictedFrom, relation, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue())));
            return list(tm_record_integrity_fix($TM_RESTRICTED_RELATION, $UNRESTRICT, list(list($MT, thesaurus), list($DATA, asserts), list($VIOLATOR, data), list($V_DATA, data))));
        }
    }

    public static final SubLObject tm_integrity_bt_cycle_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (el_utilities.literal_predicate(formula, UNPROVIDED) == $$broaderTerm) {
                    {
                        SubLObject concept = el_utilities.literal_arg1(formula, UNPROVIDED);
                        SubLObject v_super = el_utilities.literal_arg2(formula, UNPROVIDED);
                        if (((NIL != transitivity.gtm_in_mt($$broaderTerm, $SUPERIOR_, assertions_high.assertion_mt(assertion), concept, v_super, UNPROVIDED)) && (NIL != tm_internals.concept_in_thesaurusP(concept, mt))) && (NIL != tm_internals.concept_in_thesaurusP(v_super, mt))) {
                            return assertion;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_bt_cycle_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject term1 = tm_datastructures.concept_term(assertions_high.gaf_arg1(data), thesaurus);
                SubLObject term2 = tm_datastructures.concept_term(assertions_high.gaf_arg2(data), thesaurus);
                SubLObject relation = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(data), ONE_INTEGER);
                return format(NIL, $str_alt109$___A___A___A___is_part_of_a_BT_cy, new SubLObject[]{ term1, relation, term2, tm_internals.thesaurus_name(thesaurus) });
            }
        } else {
            return $str_alt110$Unable_to_print_violation__some_t;
        }
    }

    public static final SubLObject tm_integrity_bt_cycle_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject concept = assertions_high.gaf_arg1(data);
            SubLObject v_super = assertions_high.gaf_arg2(data);
            SubLObject mal_asserts = cons(data, transitivity.gtm_in_mt($$broaderTerm, $kw111$WHY_SUPERIOR_, thesaurus, concept, v_super, UNPROVIDED));
            return list(tm_record_integrity_fix($TM_BT_CYCLE, $REMOVE_ONE, list(list($MT, thesaurus), list($DATA, mal_asserts), list($VIOLATOR, data), list($V_DATA, data))));
        }
    }

    public static final SubLObject tm_integrity_nt_redundant_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject subsumedP = NIL;
                if (el_utilities.literal_predicate(formula, UNPROVIDED) == $$broaderTerm) {
                    {
                        SubLObject concept = el_utilities.literal_arg1(formula, UNPROVIDED);
                        SubLObject v_super = el_utilities.literal_arg2(formula, UNPROVIDED);
                        if (NIL == subsumedP) {
                            {
                                SubLObject csome_list_var = remove(v_super, gt_modules.broader_terms(concept, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject local_broader = NIL;
                                for (local_broader = csome_list_var.first(); !((NIL != subsumedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , local_broader = csome_list_var.first()) {
                                    subsumedP = gt_modules.broader_termP(local_broader, v_super, mt);
                                }
                            }
                        }
                    }
                }
                if (NIL != subsumedP) {
                    return assertion;
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_nt_redundant_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject term1 = tm_datastructures.concept_term(assertions_high.gaf_arg1(data), thesaurus);
                SubLObject term2 = tm_datastructures.concept_term(assertions_high.gaf_arg2(data), thesaurus);
                SubLObject relation = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(data), ONE_INTEGER);
                return format(NIL, $str_alt115$___A___A___A___is_a_redundant_BT_, new SubLObject[]{ term1, relation, term2, tm_internals.thesaurus_name(thesaurus) });
            }
        } else {
            return $str_alt116$Unable_to_print_violation__some_p;
        }
    }

    public static final SubLObject tm_integrity_nt_redundant_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject string = html_tm_editing.tm_format_thesaurus_assertion(data);
            tm_integrity_unassert_assertion(data);
            return format(NIL, $str_alt117$Deleted__A, string);
        }
    }

    public static final SubLObject tm_integrity_nt_redundant_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            return list(tm_record_integrity_fix($TM_NT_REDUNDANT, $REMOVE, list(list($MT, thesaurus), list($DATA, data), list($VIOLATOR, data), list($V_DATA, data))));
        }
    }

    public static final SubLObject tm_integrity_irreflexive_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                if (NIL != kb_accessors.irreflexive_predicateP(predicate)) {
                    if (predicate != $$preferredTerm) {
                        if (el_utilities.literal_arg1(formula, UNPROVIDED).equal(el_utilities.literal_arg2(formula, UNPROVIDED)) && (NIL != tm_internals.concept_in_thesaurusP(el_utilities.literal_arg1(formula, UNPROVIDED), mt))) {
                            return assertion;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_irreflexive_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject term1 = tm_datastructures.concept_term(assertions_high.gaf_arg1(data), thesaurus);
                SubLObject relation = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(data), ONE_INTEGER);
                return format(NIL, $str_alt121$__A__cannot_be_related_to_itself_, term1, relation);
            }
        } else {
            return $str_alt122$Unable_to_print_violation__Some_t;
        }
    }

    public static final SubLObject tm_integrity_irreflexive_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject string = html_tm_editing.tm_format_thesaurus_assertion(data);
            tm_integrity_unassert_assertion(data);
            return format(NIL, $str_alt117$Deleted__A, string);
        }
    }

    public static final SubLObject tm_integrity_disjoint_pt_uf_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject string = assertions_high.gaf_arg2(assertion);
                SubLObject pcase_var = el_utilities.literal_predicate(formula, UNPROVIDED);
                if (pcase_var.eql($$preferredTerm)) {
                    {
                        SubLObject uf_constants = tm_internals.concepts_from_term_lexpred_in_thesaurus(string, $$useFor, thesaurus);
                        SubLObject foundP = NIL;
                        if (NIL == foundP) {
                            {
                                SubLObject csome_list_var = uf_constants;
                                SubLObject uf_constant = NIL;
                                for (uf_constant = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , uf_constant = csome_list_var.first()) {
                                    if (!uf_constant.equal(el_utilities.literal_arg1(formula, UNPROVIDED))) {
                                        foundP = T;
                                    }
                                }
                            }
                        }
                        if (NIL != foundP) {
                            return assertion;
                        }
                    }
                } else
                    if (pcase_var.eql($$useFor)) {
                        {
                            SubLObject pt_constants = tm_internals.concepts_from_term_lexpred_in_thesaurus(string, $$preferredTerm, thesaurus);
                            SubLObject foundP = NIL;
                            if (NIL == foundP) {
                                {
                                    SubLObject csome_list_var = pt_constants;
                                    SubLObject pt_constant = NIL;
                                    for (pt_constant = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pt_constant = csome_list_var.first()) {
                                        if (!pt_constant.equal(el_utilities.literal_arg1(formula, UNPROVIDED))) {
                                            foundP = T;
                                        }
                                    }
                                }
                            }
                            if (NIL != foundP) {
                                return assertion;
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $use_for_string$ = makeSymbol("*USE-FOR-STRING*");

    public static final SubLObject express_as_uf(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return format(NIL, $str_alt126$___A__UF__S_, string, $use_for_string$.getDynamicValue(thread));
        }
    }

    public static final SubLObject tm_integrity_disjoint_pt_uf_message(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(data, ASSERTION_P);
            if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
                {
                    SubLObject thesaurus = assertions_high.assertion_mt(data);
                    SubLObject use_for = assertions_high.gaf_arg2(data);
                    SubLObject preferred_terms = NIL;
                    SubLObject use_for_facts = NIL;
                    SubLObject cdolist_list_var = tm_internals.concepts_from_term_lexpred_in_thesaurus(use_for, $$useFor, thesaurus);
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = tm_datastructures.concept_term(concept, thesaurus);
                            if (NIL == member(item_var, preferred_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                preferred_terms = cons(item_var, preferred_terms);
                            }
                        }
                    }
                    {
                        SubLObject _prev_bind_0 = $use_for_string$.currentBinding(thread);
                        try {
                            $use_for_string$.bind(use_for, thread);
                            use_for_facts = string_utilities.stringify_items(preferred_terms, symbol_function(EXPRESS_AS_UF), $str_alt128$__, $str_alt129$_and_);
                        } finally {
                            $use_for_string$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return format(NIL, $str_alt130$__A__is_a_preferred_term_in__A__s, new SubLObject[]{ use_for, tm_internals.thesaurus_name(thesaurus), use_for_facts });
                }
            } else {
                return $str_alt131$Unable_to_print_violation__Some_t;
            }
        }
    }

    public static final SubLObject tm_integrity_disjoint_pt_uf_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject string = assertions_high.gaf_arg2(data);
            SubLObject fix_1 = NIL;
            SubLObject preferred_asserts = NIL;
            SubLObject fix_2 = NIL;
            SubLObject use_for_asserts = NIL;
            preferred_asserts = tm_lexical_index.lexpred_signs_in_thesaurus(string, $$preferredTerm, thesaurus);
            use_for_asserts = tm_lexical_index.lexpred_signs_in_thesaurus(string, $$useFor, thesaurus);
            fix_1 = tm_record_integrity_fix($TM_DISJOINT_PT_UF, $DELETE_ALL_TERMS, list(list($MT, thesaurus), list($DATA, preferred_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            fix_2 = tm_record_integrity_fix($TM_DISJOINT_PT_UF, $REMOVE_ALL, list(list($MT, thesaurus), list($DATA, use_for_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            add_fix_alternates(list(fix_1, fix_2));
            return list(fix_1, fix_2);
        }
    }

    public static final SubLObject tm_integrity_unique_pt_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                if ($$preferredTerm == el_utilities.literal_predicate(formula, UNPROVIDED)) {
                    {
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject concept = assertions_high.gaf_arg1(assertion);
                        SubLObject string = assertions_high.gaf_arg2(assertion);
                        SubLObject cdolist_list_var = tm_internals.concepts_from_term_lexpred_in_thesaurus(string, $$preferredTerm, thesaurus);
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            if (NIL == equals.equalsP(concept, v_term, UNPROVIDED, UNPROVIDED)) {
                                return assertion;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_unique_pt_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject string = assertions_high.gaf_arg2(data);
                return format(NIL, $str_alt136$__A__is_in__A_more_than_once_as_a, string, tm_internals.thesaurus_name(thesaurus));
            }
        } else {
            return $str_alt137$Unable_to_print_violation__Some_s;
        }
    }

    public static final SubLObject tm_integrity_unique_pt_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject string = assertions_high.gaf_arg2(data);
            SubLObject fix_1 = NIL;
            SubLObject fix_2 = NIL;
            SubLObject fix_3 = NIL;
            SubLObject preferred_asserts = NIL;
            preferred_asserts = tm_lexical_index.lexpred_signs_in_thesaurus(string, $$preferredTerm, thesaurus);
            fix_1 = tm_record_integrity_fix($TM_UNIQUE_PT, $RETAIN_ONE_TERM, list(list($MT, thesaurus), list($DATA, preferred_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            fix_2 = tm_record_integrity_fix($TM_UNIQUE_PT, $MERGE_ALL, list(list($MT, thesaurus), list($DATA, preferred_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            fix_3 = tm_record_integrity_fix($TM_UNIQUE_PT, $RETAIN_ONE, list(list($MT, thesaurus), list($DATA, preferred_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            add_fix_alternates(list(fix_1, fix_2, fix_3));
            return list(fix_1, fix_2, fix_3);
        }
    }

    public static final SubLObject tm_integrity_unique_uf_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                if ($$useFor == el_utilities.literal_predicate(formula, UNPROVIDED)) {
                    {
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject concept = assertions_high.gaf_arg1(assertion);
                        SubLObject string = assertions_high.gaf_arg2(assertion);
                        if (NIL != tm_internals.concept_in_thesaurusP(concept, thesaurus)) {
                            {
                                SubLObject cdolist_list_var = tm_internals.concepts_from_term_lexpred_in_thesaurus(string, $$useFor, thesaurus);
                                SubLObject v_term = NIL;
                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                    if (NIL == equals.equalsP(concept, v_term, UNPROVIDED, UNPROVIDED)) {
                                        return assertion;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_unique_uf_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject string = assertions_high.gaf_arg2(data);
                return format(NIL, $str_alt143$__A__is_in__A_more_than_once_as_a, string, tm_internals.thesaurus_name(thesaurus));
            }
        } else {
            return $str_alt144$Unable_to_print_violation__Some_s;
        }
    }

    public static final SubLObject tm_integrity_unique_uf_user_fixer(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(data, ASSERTION_P);
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject string = assertions_high.gaf_arg2(data);
                SubLObject uf_asserts = NIL;
                SubLObject cdolist_list_var = tm_internals.concepts_from_term_lexpred_in_thesaurus(string, $$useFor, thesaurus);
                SubLObject constant = NIL;
                for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(thesaurus, thread);
                            {
                                SubLObject pred_var = $$useFor;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            {
                                                                SubLObject done_var_4 = NIL;
                                                                SubLObject token_var_5 = NIL;
                                                                while (NIL == done_var_4) {
                                                                    {
                                                                        SubLObject uf_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                        SubLObject valid_6 = makeBoolean(token_var_5 != uf_assert);
                                                                        if (NIL != valid_6) {
                                                                            if (string.equalp(assertions_high.gaf_arg2(uf_assert))) {
                                                                                uf_asserts = cons(uf_assert, uf_asserts);
                                                                            }
                                                                        }
                                                                        done_var_4 = makeBoolean(NIL == valid_6);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return tm_record_integrity_fix($TM_UNIQUE_UF, $RETAIN_ONE, list(list($MT, thesaurus), list($DATA, uf_asserts), list($VIOLATOR, data), list($V_DATA, data)));
            }
        }
    }

    /**
     * Preconditions: (cor (null mt) (mt? mt))
     * Postconditions: If the rule should currently be enforced for thesaurus
     * (possibly in op checking etc.), then returns T, else nil.
     */
    public static final SubLObject tm_enforce_unique_uf_rule_for_thesaurusP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == mt) {
            return T;
        }
        SubLTrampolineFile.checkType(mt, $sym76$MT_);
        return tm_internals.tm_use_integrity_module_for_thesaurus_p(mt, $TM_UNIQUE_UF);
    }

    public static final SubLObject tm_integrity_top_not_bt_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject v_term = el_utilities.literal_arg1(formula, UNPROVIDED);
                SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                SubLObject thesaurus = NIL;
                if (predicate == $$topInThesaurus) {
                    thesaurus = el_utilities.literal_arg2(formula, UNPROVIDED);
                } else {
                    thesaurus = assertions_high.assertion_mt(assertion);
                }
                if ((NIL != kb_indexing_datastructures.indexed_term_p(v_term)) && (NIL != tm_internals.concept_in_thesaurusP(v_term, thesaurus))) {
                    {
                        SubLObject pcase_var = predicate;
                        if (pcase_var.eql($$broaderTerm)) {
                            if (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$topInThesaurus, v_term, thesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                return assertion;
                            }
                        } else
                            if (pcase_var.eql($$topInThesaurus)) {
                                if (NIL != kb_mapping_utilities.some_pred_value_in_mt(v_term, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED)) {
                                    return assertion;
                                }
                            }

                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_top_not_bt_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject concept = assertions_high.gaf_arg1(data);
                return format(NIL, $str_alt149$__A__is_a_top_term__yet_has_BTs_i, tm_datastructures.concept_term(concept, thesaurus), tm_internals.thesaurus_name(thesaurus));
            }
        } else {
            return $str_alt150$Unable_to_print_violation__Some_t;
        }
    }

    public static final SubLObject tm_integrity_top_not_bt_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject v_term = assertions_high.gaf_arg1(data);
            tm_integrity_unassert(list($$topInThesaurus, v_term, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue());
            return format(NIL, $str_alt151$Demoted___a__from_top_term_status, tm_datastructures.concept_term(v_term, thesaurus), tm_internals.thesaurus_name(thesaurus));
        }
    }

    public static final SubLObject tm_integrity_uf_or_pt_stoplist_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            if ((NIL != tm_internals.tm_lexical_predicateP(assertions_high.gaf_arg0(assertion))) && (NIL != tm_internals.concept_in_thesaurusP(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion)))) {
                {
                    SubLObject string = assertions_high.gaf_arg2(assertion);
                    if (string.isString()) {
                        if (NIL != tm_datastructures.tm_stoplist_wordP(string)) {
                            return assertion;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_uf_or_pt_stoplist_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject string = assertions_high.gaf_arg2(data);
                return format(NIL, $str_alt154$stoplist_word___A__is_a_Use_For_o, string, tm_internals.thesaurus_name(thesaurus));
            }
        } else {
            return $str_alt155$Unable_to_print_violation__Some_s;
        }
    }

    public static final SubLObject tm_integrity_uf_or_pt_stoplist_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject v_term = assertions_high.gaf_arg1(data);
            SubLObject string = assertions_high.gaf_arg2(data);
            SubLObject fix_1 = NIL;
            SubLObject fix_2 = NIL;
            SubLObject fix_3 = NIL;
            fix_1 = tm_record_integrity_fix($TM_UF_OR_PT_STOPLIST, $REMOVE_STOPLIST_WORD, list(list($MT, thesaurus), list($DATA, string), list($VIOLATOR, data), list($V_DATA, data)));
            fix_2 = tm_record_integrity_fix($TM_UF_OR_PT_STOPLIST, $RENAME_TERM, list(list($MT, thesaurus), list($DATA, v_term), list($VIOLATOR, data), list($V_DATA, data)));
            fix_3 = tm_record_integrity_fix($TM_UF_OR_PT_STOPLIST, $SPLICE_OUT_TERM, list(list($MT, thesaurus), list($DATA, v_term), list($VIOLATOR, data), list($V_DATA, data)));
            add_fix_alternates(list(fix_1, fix_2, fix_3));
            return list(fix_1, fix_2, fix_3);
        }
    }

    public static final SubLObject tm_integrity_no_pt_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject predicate = assertions_high.gaf_arg0(assertion);
                SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                if (predicate == $$topInThesaurus) {
                    if (NIL == tm_internals.concept_in_thesaurusP(arg1, arg2)) {
                        return list(assertion, arg1);
                    }
                } else {
                    if ((NIL != forts.valid_fortP(arg1)) && (NIL == tm_internals.concept_in_thesaurusP(arg1, thesaurus))) {
                        return list(assertion, arg1);
                    }
                    if ((NIL != forts.valid_fortP(arg2)) && (NIL == tm_internals.concept_in_thesaurusP(arg2, thesaurus))) {
                        return list(assertion, arg2);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_no_pt_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, CONSP);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject assertion = NIL;
            SubLObject concept = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt162);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt162);
            concept = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLTrampolineFile.checkType(assertion, ASSERTION_P);
                SubLTrampolineFile.checkType(concept, FORT_P);
                if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != forts.valid_fortP(concept))) {
                    {
                        SubLObject predicate = assertions_high.gaf_arg0(assertion);
                        SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                        SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject cyc_name = (NIL != constant_handles.constant_p(concept)) ? ((SubLObject) (constants_high.constant_name(concept))) : string_utilities.object_to_string(narts_high.nart_el_formula(concept));
                        if (predicate == $$topInThesaurus) {
                            return format(NIL, $str_alt163$The_concept__A_has_no_preferred_t, new SubLObject[]{ cyc_name, tm_internals.thesaurus_name(arg2), tm_internals.thesaurus_name(arg2) });
                        } else {
                            return format(NIL, $str_alt164$The_concept__A_has_no_preferred_t, new SubLObject[]{ cyc_name, tm_internals.thesaurus_name(thesaurus), concept == arg1 ? ((SubLObject) (tm_internals.tm_pt_or_string_in_thesaurus(arg2, thesaurus))) : tm_internals.tm_pt_or_string_in_thesaurus(arg1, thesaurus), concept == arg1 ? ((SubLObject) (tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER))) : tm_internals.tm_pred_arg_symbol(predicate, TWO_INTEGER) });
                        }
                    }
                } else {
                    return $str_alt165$Unable_to_print_violation__Some_c;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt162);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_no_pt_user_fixer(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(data, CONSP);
            {
                SubLObject datum = data;
                SubLObject current = datum;
                SubLObject assertion = NIL;
                SubLObject concept = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt162);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt162);
                concept = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLTrampolineFile.checkType(assertion, ASSERTION_P);
                    SubLTrampolineFile.checkType(concept, FORT_P);
                    {
                        SubLObject predicate = assertions_high.gaf_arg0(assertion);
                        SubLObject thesaurus = NIL;
                        SubLObject top_asserts = NIL;
                        SubLObject mal_asserts = NIL;
                        SubLObject real_mal_asserts = NIL;
                        SubLObject fix_1 = NIL;
                        SubLObject fix_2 = NIL;
                        if (predicate == $$topInThesaurus) {
                            thesaurus = assertions_high.gaf_arg2(assertion);
                        } else {
                            thesaurus = assertions_high.assertion_mt(assertion);
                        }
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                mal_asserts = kb_mapping.gather_term_assertions(concept, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = mal_asserts;
                            SubLObject v_assert = NIL;
                            for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                                if (assertions_high.assertion_mt(v_assert).equal(thesaurus)) {
                                    real_mal_asserts = cons(v_assert, real_mal_asserts);
                                }
                            }
                            mal_asserts = real_mal_asserts;
                        }
                        top_asserts = kb_indexing.find_gaf(list($$topInThesaurus, concept, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue());
                        if (NIL != top_asserts) {
                            top_asserts = list(top_asserts);
                        }
                        mal_asserts = nconc(mal_asserts, top_asserts);
                        fix_1 = tm_record_integrity_fix($TM_NO_PT, $REMOVE_ALL, list(list($MT, thesaurus), list($DATA, mal_asserts), list($VIOLATOR, assertion), list($V_DATA, data)));
                        fix_2 = tm_record_integrity_fix($TM_NO_PT, $RENAME_TERM, list(list($MT, thesaurus), list($DATA, concept), list($VIOLATOR, assertion), list($V_DATA, data)));
                        add_fix_alternates(list(fix_1, fix_2));
                        return list(fix_1, fix_2);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt162);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_integrity_single_entry_format_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                if (!(((predicate == $$preferredTerm) || (predicate == $$useFor)) || (NIL != tm_internals.tm_lexical_predicateP(predicate)))) {
                    if ((NIL == forts.valid_fortP(el_utilities.literal_arg1(formula, UNPROVIDED))) || (NIL != tm_internals.concept_in_thesaurusP(el_utilities.literal_arg1(formula, UNPROVIDED), mt))) {
                        if ((NIL == forts.valid_fortP(el_utilities.literal_arg2(formula, UNPROVIDED))) || (NIL != tm_internals.concept_in_thesaurusP(el_utilities.literal_arg2(formula, UNPROVIDED), mt))) {
                            if (NIL != kb_accessors.arg_n_single_entry_formatP(predicate, ONE_INTEGER, mt)) {
                                if (NIL == arg_type.literal_single_entry_okP(formula, ONE_INTEGER, mt)) {
                                    return list(ONE_INTEGER, assertion);
                                }
                            }
                            if (NIL != kb_accessors.arg_n_single_entry_formatP(predicate, TWO_INTEGER, mt)) {
                                if (NIL == arg_type.literal_single_entry_okP(formula, TWO_INTEGER, mt)) {
                                    return list(TWO_INTEGER, assertion);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_single_entry_format_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), INTEGERP);
        SubLTrampolineFile.checkType(second(data), ASSERTION_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt169);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    {
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject relation = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(assertion), ONE_INTEGER);
                        SubLObject ind_term = tm_datastructures.concept_term(arg.numE(ONE_INTEGER) ? ((SubLObject) (assertions_high.gaf_arg2(assertion))) : assertions_high.gaf_arg1(assertion), thesaurus);
                        SubLObject dep_terms = NIL;
                        SubLObject cdolist_list_var = arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(assertion), arg, thesaurus, assertion);
                        SubLObject v_assert = NIL;
                        for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                            {
                                SubLObject bad_arg = NIL;
                                SubLObject pcase_var = tm_internals.tm_relation_argtype(assertions_high.gaf_arg0(assertion), arg);
                                if (pcase_var.eql($CONSTANT)) {
                                    bad_arg = tm_datastructures.concept_term(assertions_high.gaf_arg(v_assert, arg), thesaurus);
                                } else {
                                    bad_arg = assertions_high.gaf_arg(v_assert, arg);
                                }
                                {
                                    SubLObject item_var = bad_arg;
                                    if (NIL == member(item_var, dep_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        dep_terms = cons(item_var, dep_terms);
                                    }
                                }
                            }
                        }
                        return format(NIL, $str_alt170$__A__can_be_related_to_at_most_on, new SubLObject[]{ ind_term, relation, string_utilities.stringify_items(dep_terms, symbol_function(IDENTITY), $str_alt128$__, $str_alt129$_and_) });
                    }
                } else {
                    return $str_alt171$Unable_to_print_violation__some_t;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt169);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_single_entry_format_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), INTEGERP);
        SubLTrampolineFile.checkType(second(data), ASSERTION_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt169);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                    SubLObject mal_asserts = arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(assertion), arg, thesaurus, assertion);
                    return list(tm_record_integrity_fix($TM_SINGLE_ENTRY_FORMAT, $RETAIN_ONE, list(list($MT, thesaurus), list($DATA, mal_asserts), list($VIOLATOR, assertion), list($V_DATA, data), list($ARGUMENT, arg))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt169);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_single_entry_lexpred_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject predicate = assertions_high.gaf_arg0(assertion);
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL != tm_internals.tm_lexical_predicateP(predicate)) {
                    if (!((predicate == $$preferredTerm) || (predicate == $$useFor))) {
                        if ((NIL == forts.valid_fortP(el_utilities.literal_arg1(formula, UNPROVIDED))) || (NIL != tm_internals.concept_in_thesaurusP(el_utilities.literal_arg1(formula, UNPROVIDED), mt))) {
                            if ((NIL == forts.valid_fortP(el_utilities.literal_arg2(formula, UNPROVIDED))) || (NIL != tm_internals.concept_in_thesaurusP(el_utilities.literal_arg2(formula, UNPROVIDED), mt))) {
                                if (NIL != kb_accessors.arg_n_single_entry_formatP(predicate, ONE_INTEGER, mt)) {
                                    {
                                        SubLObject string = el_utilities.literal_arg2(formula, UNPROVIDED);
                                        SubLObject string_signs = tm_lexical_index.lexpred_signs_in_thesaurus(string, predicate, mt);
                                        if (NIL == list_utilities.singletonP(string_signs)) {
                                            return list(ONE_INTEGER, assertion);
                                        }
                                    }
                                }
                                if (NIL != kb_accessors.arg_n_single_entry_formatP(predicate, TWO_INTEGER, mt)) {
                                    if (NIL == arg_type.literal_single_entry_okP(formula, TWO_INTEGER, mt)) {
                                        return list(TWO_INTEGER, assertion);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_single_entry_lexpred_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), INTEGERP);
        SubLTrampolineFile.checkType(second(data), ASSERTION_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt169);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    {
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject predicate = assertions_high.gaf_arg0(assertion);
                        SubLObject relation = tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER);
                        SubLObject ind_term = (arg.numE(ONE_INTEGER)) ? ((SubLObject) (assertions_high.gaf_arg2(assertion))) : tm_datastructures.concept_term(assertions_high.gaf_arg1(assertion), thesaurus);
                        SubLObject mal_asserts = (arg.numE(ONE_INTEGER)) ? ((SubLObject) (tm_lexical_index.lexpred_signs_in_thesaurus(ind_term, predicate, thesaurus))) : arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(assertion), arg, thesaurus, assertion);
                        SubLObject dep_terms = NIL;
                        SubLObject cdolist_list_var = mal_asserts;
                        SubLObject v_assert = NIL;
                        for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                            {
                                SubLObject bad_arg = NIL;
                                if (arg == ONE_INTEGER) {
                                    bad_arg = tm_datastructures.concept_term(assertions_high.gaf_arg1(v_assert), thesaurus);
                                } else {
                                    bad_arg = assertions_high.gaf_arg2(v_assert);
                                }
                                {
                                    SubLObject item_var = bad_arg;
                                    if (NIL == member(item_var, dep_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        dep_terms = cons(item_var, dep_terms);
                                    }
                                }
                            }
                        }
                        return format(NIL, $str_alt170$__A__can_be_related_to_at_most_on, new SubLObject[]{ ind_term, relation, string_utilities.stringify_items(dep_terms, symbol_function(IDENTITY), $str_alt128$__, $str_alt129$_and_) });
                    }
                } else {
                    return $str_alt174$Unable_to_print_violation__some_t;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt169);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_single_entry_lexpred_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), INTEGERP);
        SubLTrampolineFile.checkType(second(data), ASSERTION_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject arg = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt169);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt169);
            assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                    SubLObject predicate = assertions_high.gaf_arg0(assertion);
                    SubLObject mal_asserts = NIL;
                    if (arg == ONE_INTEGER) {
                        mal_asserts = tm_lexical_index.lexpred_signs_in_thesaurus(assertions_high.gaf_arg2(assertion), predicate, thesaurus);
                    } else {
                        mal_asserts = arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(assertion), arg, thesaurus, assertion);
                    }
                    return list(tm_record_integrity_fix($TM_SINGLE_ENTRY_LEXPRED, $RETAIN_ONE, list(list($MT, thesaurus), list($DATA, mal_asserts), list($VIOLATOR, assertion), list($V_DATA, data), list($ARGUMENT, arg))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt169);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_multiple_pt_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                if (predicate == $$preferredTerm) {
                    if (NIL != kb_accessors.arg_n_single_entry_formatP(predicate, TWO_INTEGER, mt)) {
                        if (NIL == arg_type.literal_single_entry_okP(formula, TWO_INTEGER, mt)) {
                            return assertion;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_multiple_pt_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject concept = tm_datastructures.concept_term(assertions_high.gaf_arg1(data), thesaurus);
                SubLObject dep_terms = NIL;
                SubLObject cdolist_list_var = arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(data), TWO_INTEGER, thesaurus, data);
                SubLObject v_assert = NIL;
                for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                    {
                        SubLObject item_var = assertions_high.gaf_arg2(v_assert);
                        if (NIL == member(item_var, dep_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            dep_terms = cons(item_var, dep_terms);
                        }
                    }
                }
                return format(NIL, $str_alt176$The_concept_underlying___A__can_b, new SubLObject[]{ concept, tm_internals.thesaurus_name(thesaurus), string_utilities.stringify_items(dep_terms, symbol_function(TM_SINGLE_QUOTE), $str_alt128$__, $str_alt129$_and_) });
            }
        } else {
            return $str_alt178$Unable_to_print_violation__Some_c;
        }
    }

    public static final SubLObject tm_multiple_pt_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        {
            SubLObject thesaurus = assertions_high.assertion_mt(data);
            SubLObject mal_asserts = arg_type.why_not_literal_single_entry_okP(assertions_high.gaf_formula(data), TWO_INTEGER, thesaurus, data);
            return list(tm_record_integrity_fix($TM_MULTIPLE_PT, $RETAIN_ONE, list(list($MT, thesaurus), list($DATA, mal_asserts), list($VIOLATOR, data), list($V_DATA, data))));
        }
    }

    public static final SubLObject tm_integrity_bt_not_rt_test(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject formula = assertions_high.gaf_formula(assertion);
                    SubLObject term1 = el_utilities.literal_arg1(formula, UNPROVIDED);
                    SubLObject term2 = el_utilities.literal_arg2(formula, UNPROVIDED);
                    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                    SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                    SubLObject result = NIL;
                    if ((predicate == $$broaderTerm) || (predicate == $$relatedTerm)) {
                        if ((NIL != tm_internals.concept_in_thesaurusP(term1, thesaurus)) && (NIL != tm_internals.concept_in_thesaurusP(term2, thesaurus))) {
                            {
                                SubLObject pcase_var = predicate;
                                if (pcase_var.eql($$broaderTerm)) {
                                    if ((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term1, term2, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term2, term1, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                        result = assertion;
                                    }
                                } else
                                    if (pcase_var.eql($$relatedTerm)) {
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                                result = kb_mapping_utilities.pred_u_v_holds_gafs($$broaderTerm, term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                                                if (NIL == result) {
                                                    result = kb_mapping_utilities.pred_u_v_holds_gafs($$broaderTerm, term2, term1, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                                                }
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }

                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_integrity_bt_not_rt_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject formula = assertions_high.gaf_formula(data);
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                SubLObject concept1 = el_utilities.literal_arg1(formula, UNPROVIDED);
                SubLObject term1 = tm_datastructures.concept_term(concept1, thesaurus);
                SubLObject concept2 = el_utilities.literal_arg2(formula, UNPROVIDED);
                SubLObject term2 = tm_datastructures.concept_term(concept2, thesaurus);
                return format(NIL, $str_alt183$___A__BT___A___and____A__RT___A__, new SubLObject[]{ term1, term2, term1, term2, tm_internals.thesaurus_name(thesaurus) });
            }
        } else {
            return $str_alt184$Unable_to_print_violation__Some_p;
        }
    }

    public static final SubLObject tm_integrity_bt_not_rt_user_fixer(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(data, ASSERTION_P);
            {
                SubLObject fix_1 = NIL;
                SubLObject fix_2 = NIL;
                SubLObject thesaurus = assertions_high.assertion_mt(data);
                thread.resetMultipleValues();
                {
                    SubLObject bt_assert = bt_rt_asserts(data);
                    SubLObject rt_asset = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    fix_1 = tm_record_integrity_fix($TM_BT_NOT_RT, $REMOVE, list(list($MT, thesaurus), list($DATA, bt_assert), list($VIOLATOR, data), list($V_DATA, data)));
                    fix_2 = tm_record_integrity_fix($TM_BT_NOT_RT, $REMOVE, list(list($MT, thesaurus), list($DATA, rt_asset), list($VIOLATOR, data), list($V_DATA, data)));
                    add_fix_alternates(list(fix_1, fix_2));
                    return list(fix_1, fix_2);
                }
            }
        }
    }

    public static final SubLObject bt_rt_asserts(SubLObject assertion) {
        {
            SubLObject formula = assertions_high.gaf_formula(assertion);
            SubLObject term1 = el_utilities.literal_arg1(formula, UNPROVIDED);
            SubLObject term2 = el_utilities.literal_arg2(formula, UNPROVIDED);
            SubLObject thesaurus = assertions_high.assertion_mt(assertion);
            SubLObject bt_assert = NIL;
            SubLObject rt_assert = NIL;
            SubLObject pcase_var = el_utilities.literal_predicate(formula, UNPROVIDED);
            if (pcase_var.eql($$broaderTerm)) {
                bt_assert = assertion;
                rt_assert = rt_assertion(term1, term2, thesaurus);
            } else
                if (pcase_var.eql($$relatedTerm)) {
                    rt_assert = assertion;
                    bt_assert = bt_assertion(term1, term2, thesaurus);
                }

            return values(bt_assert, rt_assert);
        }
    }

    /**
     * return the #$relatedTerm assertion relating arg1 and arg2, if there is one
     * (note: #$relatedTerm is symmetric so arg-order must be canonical)
     */
    public static final SubLObject rt_assertion(SubLObject arg1, SubLObject arg2, SubLObject thesaurus) {
        return kb_indexing.find_assertion(caar(czer_main.canonicalize_cycl(list($$relatedTerm, arg1, arg2), thesaurus)), thesaurus);
    }

    /**
     * return the #$broaderTerm assertion relating arg1 and arg2, if there is one
     */
    public static final SubLObject bt_assertion(SubLObject arg1, SubLObject arg2, SubLObject thesaurus) {
        {
            SubLObject assertion = kb_indexing.find_gaf(list($$broaderTerm, arg1, arg2), thesaurus);
            if (NIL != assertion) {
                return assertion;
            } else {
                return kb_indexing.find_gaf(list($$broaderTerm, arg2, arg1), thesaurus);
            }
        }
    }

    public static final SubLObject tm_integrity_bt_not_rt_indirect_test(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                SubLObject term1 = el_utilities.literal_arg1(formula, UNPROVIDED);
                SubLObject term2 = el_utilities.literal_arg2(formula, UNPROVIDED);
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                if ((predicate == $$broaderTerm) || (predicate == $$relatedTerm)) {
                    if ((NIL != tm_internals.concept_in_thesaurusP(term1, thesaurus)) && (NIL != tm_internals.concept_in_thesaurusP(term2, thesaurus))) {
                        {
                            SubLObject pcase_var = predicate;
                            if (pcase_var.eql($$broaderTerm)) {
                                {
                                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term1, $$relatedTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject term3 = NIL;
                                    for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                        if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term2, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term2, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                            return list(assertion, term2, $$relatedTerm, term3);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term1, $$relatedTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                    SubLObject term3 = NIL;
                                    for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                        if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term2, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term2, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                            return list(assertion, term2, $$relatedTerm, term3);
                                        }
                                    }
                                }
                            } else
                                if (pcase_var.eql($$relatedTerm)) {
                                    {
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term1, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject term3 = NIL;
                                        for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                            if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term2, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term2, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                                return list(assertion, term2, $$relatedTerm, term3);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term1, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                        SubLObject term3 = NIL;
                                        for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                            if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term2, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term2, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                                return list(assertion, term2, $$relatedTerm, term3);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term2, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject term3 = NIL;
                                        for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                            if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term1, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term1, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                                return list(assertion, term1, $$relatedTerm, term3);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_mt(term2, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                        SubLObject term3 = NIL;
                                        for (term3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term3 = cdolist_list_var.first()) {
                                            if (((NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term3, term1, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$relatedTerm, term1, term3, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != tm_internals.concept_in_thesaurusP(term3, thesaurus))) {
                                                return list(assertion, term1, $$relatedTerm, term3);
                                            }
                                        }
                                    }
                                }

                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_bt_not_rt_indirect_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject assertion = NIL;
            SubLObject pivot_term = NIL;
            SubLObject linking_pred = NIL;
            SubLObject indirect_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt187);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            pivot_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            linking_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            indirect_term = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != forts.valid_fortP(pivot_term))) && (NIL != forts.valid_fortP(linking_pred))) && (NIL != forts.valid_fortP(indirect_term))) {
                    {
                        SubLObject formula = assertions_high.gaf_formula(assertion);
                        SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                        SubLObject term1 = el_utilities.literal_arg1(formula, UNPROVIDED);
                        SubLObject term2 = el_utilities.literal_arg2(formula, UNPROVIDED);
                        SubLObject non_pivot_term = (pivot_term == term1) ? ((SubLObject) (term2)) : term1;
                        SubLObject missing_link = (predicate == linking_pred) ? ((SubLObject) ($$broaderTerm)) : $$relatedTerm;
                        SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                        SubLObject tm_pred = tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER);
                        SubLObject tm_miss = tm_internals.tm_pred_arg_symbol(missing_link, ONE_INTEGER);
                        SubLObject tm_link = tm_internals.tm_pred_arg_symbol(linking_pred, ONE_INTEGER);
                        return format(NIL, $str_alt188$_a_cannot_be_related_both_to__a_b, new SubLObject[]{ tm_datastructures.concept_term(pivot_term, thesaurus), tm_datastructures.concept_term(non_pivot_term, thesaurus), NIL != tm_pred ? ((SubLObject) (tm_pred)) : predicate, tm_datastructures.concept_term(indirect_term, thesaurus), NIL != tm_link ? ((SubLObject) (tm_link)) : linking_pred, tm_datastructures.concept_term(non_pivot_term, thesaurus), tm_datastructures.concept_term(indirect_term, thesaurus), NIL != tm_miss ? ((SubLObject) (tm_miss)) : missing_link, tm_internals.thesaurus_name(thesaurus) });
                    }
                } else {
                    return $str_alt189$Unable_to_print_violation_;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt187);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_bt_not_rt_indirect_user_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject assertion = NIL;
            SubLObject pivot_term = NIL;
            SubLObject linking_pred = NIL;
            SubLObject indirect_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt187);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            pivot_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            linking_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            indirect_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject formula = assertions_high.gaf_formula(assertion);
                    SubLObject predicate = el_utilities.literal_predicate(formula, UNPROVIDED);
                    SubLObject term1 = el_utilities.literal_arg1(formula, UNPROVIDED);
                    SubLObject term2 = el_utilities.literal_arg2(formula, UNPROVIDED);
                    SubLObject non_pivot_term = (pivot_term == term1) ? ((SubLObject) (term2)) : term1;
                    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                    SubLObject linking_assertion = NIL;
                    SubLObject indirect_assertion = NIL;
                    SubLObject pcase_var = linking_pred;
                    if (pcase_var.eql($$relatedTerm)) {
                        linking_assertion = rt_assertion(pivot_term, indirect_term, thesaurus);
                    } else
                        if (pcase_var.eql($$broaderTerm)) {
                            linking_assertion = bt_assertion(pivot_term, indirect_term, thesaurus);
                        }

                    if ((predicate == $$relatedTerm) && (linking_pred == $$relatedTerm)) {
                        indirect_assertion = bt_assertion(non_pivot_term, indirect_term, thesaurus);
                    } else {
                        indirect_assertion = rt_assertion(non_pivot_term, indirect_term, thesaurus);
                    }
                    return list(tm_record_integrity_fix($TM_BT_NOT_RT_INDIRECT, $REMOVE_ONE, list(list($MT, thesaurus), list($DATA, list(assertion, linking_assertion, indirect_assertion)), list($VIOLATOR, assertion), list($V_DATA, data))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt187);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_pt_and_uf_test(SubLObject concept, SubLObject thesaurus) {
        {
            SubLObject pt = tm_datastructures.concept_term(concept, thesaurus);
            SubLObject ufs = tm_internals.use_fors_in_thesaurus(concept, thesaurus);
            if (NIL != find(pt, ufs, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return tm_lexical_index.lexpred_signs_in_thesaurus(pt, $$preferredTerm, thesaurus).first();
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_pt_and_uf_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, SIGNP);
        if (NIL != assertions_high.valid_assertion(data, UNPROVIDED)) {
            {
                SubLObject thesaurus = tm_internals.thesaurus_name(tm_datastructures.sign_thesaurus(data));
                SubLObject string = tm_datastructures.sign_term(data);
                return format(NIL, $str_alt192$_S_is_both_a_PT_and_a_UF_in__A, string, thesaurus);
            }
        } else {
            return $str_alt193$Unable_to_print_violation__some_s;
        }
    }

    public static final SubLObject tm_integrity_pt_and_uf_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, SIGNP);
        {
            SubLObject thesaurus = tm_datastructures.sign_thesaurus(data);
            SubLObject string = tm_datastructures.sign_term(data);
            SubLObject uf_signs = tm_lexical_index.lexpred_signs_in_thesaurus(string, $$useFor, thesaurus);
            SubLObject assertion_strings = NIL;
            {
                SubLObject cdolist_list_var = uf_signs;
                SubLObject uf_sign = NIL;
                for (uf_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uf_sign = cdolist_list_var.first()) {
                    assertion_strings = cons(html_tm_editing.tm_format_thesaurus_assertion(uf_sign), assertion_strings);
                }
            }
            {
                SubLObject cdolist_list_var = uf_signs;
                SubLObject uf_sign = NIL;
                for (uf_sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uf_sign = cdolist_list_var.first()) {
                    tm_integrity_unassert(list($$useFor, tm_datastructures.sign_concept(uf_sign), tm_datastructures.sign_term(uf_sign)), thesaurus);
                }
            }
            return format(NIL, $str_alt194$Deleted__a, string_utilities.stringify_items(assertion_strings, symbol_function(IDENTITY), $str_alt128$__, $str_alt129$_and_));
        }
    }

    public static final SubLObject tm_integrity_not_bt_not_top_test(SubLObject concept, SubLObject thesaurus) {
        if (NIL != tm_internals.concept_in_thesaurusP(concept, thesaurus)) {
            if (NIL == kb_mapping_utilities.some_pred_value_in_mt(concept, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED)) {
                if (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt($$topInThesaurus, concept, thesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return list(concept, thesaurus);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_not_bt_not_top_message(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), FORT_P);
        SubLTrampolineFile.checkType(second(data), FORT_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject constant = NIL;
            SubLObject thesaurus = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            constant = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt196);
            thesaurus = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != tm_internals.thesaurusP(thesaurus)) && (NIL != forts.valid_fortP(constant))) {
                    return format(NIL, $str_alt197$__A__has_no_BTs__but_is_not_known, tm_datastructures.concept_term(constant, thesaurus), tm_internals.thesaurus_name(thesaurus));
                } else {
                    return $str_alt198$Unable_to_print_violation__Some_t;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt196);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_not_bt_not_top_fixer(SubLObject data) {
        SubLTrampolineFile.checkType(data, LISTP);
        SubLTrampolineFile.checkType(data.first(), FORT_P);
        SubLTrampolineFile.checkType(second(data), FORT_P);
        {
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject constant = NIL;
            SubLObject thesaurus = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt196);
            constant = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt196);
            thesaurus = current.first();
            current = current.rest();
            if (NIL == current) {
                tm_integrity_assert(list($$topInThesaurus, constant, thesaurus), tm_datastructures.$tm_mt$.getGlobalValue());
                return format(NIL, $str_alt199$Made___A__a_top_term_in__A, tm_datastructures.concept_term(constant, thesaurus), tm_internals.thesaurus_name(thesaurus));
            } else {
                cdestructuring_bind_error(datum, $list_alt196);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_perform_remove_all_fix(SubLObject fix) {
        {
            SubLObject assertions = tmi_fix_data(fix);
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                tm_integrity_unassert_assertion(assertion);
            }
        }
        return T;
    }

    public static final SubLObject tm_perform_remove_one_fix(SubLObject fix, SubLObject assertion_id) {
        if (assertion_id.isString()) {
            assertion_id = read_from_string_ignoring_errors(assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (assertion_id.isFixnum()) {
            {
                SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    tm_integrity_unassert_assertion(assertion);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_perform_retain_one_fix(SubLObject fix, SubLObject assertion_id) {
        if (assertion_id.isString()) {
            assertion_id = read_from_string_ignoring_errors(assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (assertion_id.isFixnum()) {
            {
                SubLObject assertions = tmi_fix_data(fix);
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (assertion_handles.assertion_id(assertion) != assertion_id) {
                        tm_integrity_unassert_assertion(assertion);
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject tm_perform_merge_all_fix(SubLObject fix) {
        {
            SubLObject signs = tmi_fix_data(fix);
            SubLObject result = tm_datastructures.sign_concept(signs.first());
            SubLObject quitP = NIL;
            if (NIL == quitP) {
                {
                    SubLObject csome_list_var = signs.rest();
                    SubLObject sign = NIL;
                    for (sign = csome_list_var.first(); !((NIL != quitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sign = csome_list_var.first()) {
                        result = tm_io.tm_merge_concepts(result, tm_datastructures.sign_concept(sign));
                        if (NIL == result) {
                            quitP = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject tm_perform_remove_fix(SubLObject fix) {
        {
            SubLObject assertion = tmi_fix_data(fix);
            tm_integrity_unassert_assertion(assertion);
        }
        return T;
    }

    public static final SubLObject tm_perform_remove_stoplist_fix(SubLObject fix) {
        {
            SubLObject string = tmi_fix_data(fix);
            tm_integrity_remove_stoplist_word(string);
        }
        return T;
    }

    public static final SubLObject ok_nameP(SubLObject string, SubLObject thesaurus) {
        if (string.isString()) {
            if (!(((NIL != tm_datastructures.tm_stoplist_wordP(string)) || (NIL != tm_lexical_index.lexpred_signs_in_thesaurus(string, $$preferredTerm, thesaurus))) || (NIL != tm_lexical_index.lexpred_signs_in_thesaurus(string, $$useFor, thesaurus)))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject tm_perform_rename_term_fix(SubLObject fix, SubLObject new_name) {
        {
            SubLObject concept = tmi_fix_data(fix);
            SubLObject thesaurus = tmi_fix_mt(fix);
            if (NIL == ok_nameP(new_name, thesaurus)) {
                return NIL;
            }
            tm_integrity_rename_term(concept, new_name, thesaurus);
        }
        return T;
    }

    public static final SubLObject tm_perform_splice_out_term_fix(SubLObject fix) {
        {
            SubLObject concept = tmi_fix_data(fix);
            SubLObject thesaurus = tmi_fix_mt(fix);
            SubLObject sign = tm_datastructures.sign_from_concept(concept, $$preferredTerm, thesaurus);
            if (NIL != sign) {
                tm_integrity_splice_out_term(sign);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject tm_perform_retain_one_term_fix(SubLObject fix, SubLObject term_id) {
        if (term_id.isString()) {
            term_id = read_from_string_ignoring_errors(term_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (term_id.isFixnum()) {
            {
                SubLObject signs = tmi_fix_data(fix);
                SubLObject cdolist_list_var = signs;
                SubLObject sign = NIL;
                for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                    if (misc_kb_utilities.get_term_id(tm_datastructures.sign_concept(sign)) != term_id) {
                        tm_integrity_splice_out_term(sign);
                    }
                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject tm_perform_delete_all_terms_fix(SubLObject fix) {
        {
            SubLObject signs = tmi_fix_data(fix);
            SubLObject cdolist_list_var = signs;
            SubLObject sign = NIL;
            for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                tm_integrity_splice_out_term(sign);
            }
        }
        return T;
    }

    public static final SubLObject tm_perform_fix(SubLObject fix, SubLObject other_fix_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = tmi_fix_op(fix);
                if (pcase_var.eql($UNRESTRICT)) {
                    return tm_perform_remove_one_fix(fix, other_fix_info);
                } else
                    if (pcase_var.eql($REMOVE_ALL)) {
                        return tm_perform_remove_all_fix(fix);
                    } else
                        if (pcase_var.eql($REMOVE_ONE)) {
                            return tm_perform_remove_one_fix(fix, other_fix_info);
                        } else
                            if (pcase_var.eql($RETAIN_ONE)) {
                                return tm_perform_retain_one_fix(fix, other_fix_info);
                            } else
                                if (pcase_var.eql($MERGE_ALL)) {
                                    return tm_perform_merge_all_fix(fix);
                                } else
                                    if (pcase_var.eql($REMOVE)) {
                                        return tm_perform_remove_fix(fix);
                                    } else
                                        if (pcase_var.eql($REMOVE_STOPLIST_WORD)) {
                                            return tm_perform_remove_stoplist_fix(fix);
                                        } else
                                            if (pcase_var.eql($RENAME_TERM)) {
                                                return tm_perform_rename_term_fix(fix, other_fix_info);
                                            } else
                                                if (pcase_var.eql($SPLICE_OUT_TERM)) {
                                                    return tm_perform_splice_out_term_fix(fix);
                                                } else
                                                    if (pcase_var.eql($RETAIN_ONE_TERM)) {
                                                        return tm_perform_retain_one_term_fix(fix, other_fix_info);
                                                    } else
                                                        if (pcase_var.eql($DELETE_ALL_TERMS)) {
                                                            return tm_perform_delete_all_terms_fix(fix);
                                                        } else {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt201$Unknown_fix_type__A, tmi_fix_op(fix));
                                                        }










            }
            return NIL;
        }
    }

    public static final SubLObject tm_diagnose_thesaurus_assertions(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                kb_mapping.map_mt_index(symbol_function(TM_DIAGNOSE_ONE_ASSERTION), thesaurus, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_8, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                                kb_mapping.map_gaf_arg_index(symbol_function(TM_DIAGNOSE_ONE_ASSERTION), thesaurus, TWO_INTEGER, $$topInThesaurus, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        violations = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    public static final SubLObject tm_diagnose_thesaurus_concepts(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_perform_assertion_checksP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_concept_predicate_violations$.currentBinding(thread);
                    try {
                        $tm_perform_assertion_checksP$.bind(NIL, thread);
                        $tm_concept_predicate_violations$.bind(NIL, thread);
                        violations = tm_diagnose_thesaurus_signs(thesaurus);
                    } finally {
                        $tm_concept_predicate_violations$.rebind(_prev_bind_1, thread);
                        $tm_perform_assertion_checksP$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    public static final SubLObject tm_diagnose_thesaurus_signs(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violations = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_DIAGNOSE_ONE_SIGN), $$preferredTerm, NIL, thesaurus);
                        violations = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    /**
     * This variable may be bound and used by calling
     * functions, although it is not directly used in the integrity checker.  Only a dynamically rebound copy
     * of it should ever be set, never the actual variable. This is intended to have either the value nil
     * or a KB predicate constant
     */
    // defvar
    public static final SubLSymbol $tm_relation_to_check_all_uses_of$ = makeSymbol("*TM-RELATION-TO-CHECK-ALL-USES-OF*");

    /**
     * Note this function may only be called by administrators since it will
     * set the current thesauri to include all thesauri.
     */
    public static final SubLObject tm_diagnose_all_uses_of_relation(SubLObject relation_constant, SubLObject user) {
        if (user == UNPROVIDED) {
            user = tm_datastructures.$tm_user$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri = tm_internals.all_thesauri();
                SubLObject violations = NIL;
                if (NIL == tm_internals.privelegedP(user, $$$administrator)) {
                    Errors.error($str_alt205$_a_is_not_authorized_to_perform_t);
                    return NIL;
                }
                SubLTrampolineFile.checkType(relation_constant, FORT_P);
                tm_datastructures.change_tm_value(user, $THESAURI, thesauri, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(thesauri, thread);
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(TM_DIAGNOSE_ONE_ASSERTION), relation_constant, UNPROVIDED, UNPROVIDED);
                        violations = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return violations;
            }
        }
    }

    public static final SubLObject tm_diagnose_one_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            control_vars.$mapping_answer$.setDynamicValue(nconc(tm_integrity_check_assertion(assertion), tm_integrity_check_predicate(assertion), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject tm_diagnose_one_sign(SubLObject sign) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sign, SIGNP);
            control_vars.$mapping_answer$.setDynamicValue(nconc(tm_integrity_check_concept(tm_datastructures.sign_concept(sign), tm_datastructures.sign_thesaurus(sign)), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject tm_diagnose_one_thesaurus_object(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        tm_diagnose_one_assertion(assertion);
                        result = control_vars.$mapping_answer$.getDynamicValue(thread);
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        control_vars.$mapping_answer$.bind(NIL, thread);
                        if (NIL != tm_datastructures.signp(assertion)) {
                            tm_diagnose_one_sign(assertion);
                            result = nconc(control_vars.$mapping_answer$.getDynamicValue(thread), result);
                        }
                    } finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * A-list of (<mt> . <search>) pairs
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_searches$ = makeSymbol("*TM-INTEGRITY-SEARCHES*");

    // defparameter
    public static final SubLSymbol $tm_integrity_searches_lock$ = makeSymbol("*TM-INTEGRITY-SEARCHES-LOCK*");

    /**
     * A-list of (<predicate> . (<search> <status> <user>)) pairs
     */
    // defparameter
    private static final SubLSymbol $tm_relation_integrity_searches$ = makeSymbol("*TM-RELATION-INTEGRITY-SEARCHES*");

    // defparameter
    private static final SubLSymbol $tm_relation_integrity_searches_lock$ = makeSymbol("*TM-RELATION-INTEGRITY-SEARCHES-LOCK*");

    /**
     * The default number of integrity violations to get
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_number_cutoff$ = makeSymbol("*TM-INTEGRITY-NUMBER-CUTOFF*");

    /**
     * The default amount of time to look for integrity violations.
     */
    // defparameter
    public static final SubLSymbol $tm_integrity_time_cutoff$ = makeSymbol("*TM-INTEGRITY-TIME-CUTOFF*");

    /**
     * for use with TM-INTEGRITY-INIT-HASH-ASSERTION
     */
    // defparameter
    private static final SubLSymbol $tm_integrity_init_assertion_hash$ = makeSymbol("*TM-INTEGRITY-INIT-ASSERTION-HASH*");

    public static final SubLObject integrity_check_needed_for_relationP(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
                {
                    SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = eql(value_on_relation_integrity_state_list(state_list_for_relation_integrity_check(relation_constant), $STATUS), $NEEDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject integrity_check_in_progress_for_relationP(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
                {
                    SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = eql(value_on_relation_integrity_state_list(state_list_for_relation_integrity_check(relation_constant), $STATUS), $IN_PROGRESS);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tm_relation_integrity_searches_in_progress() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = Mapping.mapcar(symbol_function(FIRST), list_utilities.remove_if_not(symbol_function($sym216$INTEGRITY_CHECK_IN_PROGRESS_ACCORDING_TO_STATE_), $tm_relation_integrity_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tm_relation_integrity_searches_needed() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = Mapping.mapcar(symbol_function(FIRST), list_utilities.remove_if_not(symbol_function($sym217$INTEGRITY_CHECK_NEEDED_ACCORDING_TO_STATE_), $tm_relation_integrity_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * relation-state must be listp.  Expected to be of form
     * (<predicate> . (<search> <status> <user>))
     */
    public static final SubLObject integrity_check_in_progress_according_to_stateP(SubLObject relation_state) {
        SubLTrampolineFile.checkType(relation_state, LISTP);
        return eql(third(relation_state), $IN_PROGRESS);
    }

    /**
     * relation-state must be listp.  Expected to be of form
     * (<predicate> . (<search> <status> <user>))
     */
    public static final SubLObject integrity_check_needed_according_to_stateP(SubLObject relation_state) {
        SubLTrampolineFile.checkType(relation_state, LISTP);
        return eql(third(relation_state), $NEEDED);
    }

    public static final SubLObject state_list_for_relation_integrity_check(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
            return assoc(relation_constant, $tm_relation_integrity_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        }
    }

    public static final SubLObject value_on_relation_integrity_state_list(SubLObject relation_state, SubLObject field) {
        SubLTrampolineFile.checkType(relation_state, LISTP);
        if (NIL == relation_state) {
            return NIL;
        } else
            if (field.eql($SEARCH)) {
                return relation_state.first();
            } else
                if (field.eql($STATUS)) {
                    return second(relation_state);
                } else
                    if (field.eql($USER)) {
                        return third(relation_state);
                    } else {
                        Errors.error($str_alt220$Unknown_type__a_of_value, field);
                        return NIL;
                    }



    }

    /**
     * Return the existing integrity violation search for RELATION-CONSTANT, if any
     */
    public static final SubLObject tm_relation_integrity_search(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
                {
                    SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = value_on_relation_integrity_state_list(state_list_for_relation_integrity_check(relation_constant), $SEARCH);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return the user for RELATION entry, if any
     */
    public static final SubLObject tm_relation_integrity_search_user(SubLObject relation_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
                {
                    SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = value_on_relation_integrity_state_list(state_list_for_relation_integrity_check(relation_constant), $USER);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Clear the note that integrity violation search for RELATION is needed
     * , if any.  Remove entry from table if state is :needed
     */
    public static final SubLObject tm_clear_relation_integrity_search_needed(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation, $sym211$THESAURUS_PREDICATE_);
            {
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != integrity_check_needed_for_relationP(relation)) {
                        $tm_relation_integrity_searches$.setDynamicValue(delete(relation, $tm_relation_integrity_searches$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Clear the integrity violation search for RELATION, if any
     * Remove entry from table if state is :in-progress
     */
    public static final SubLObject tm_clear_relation_integrity_search(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation, $sym211$THESAURUS_PREDICATE_);
            {
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject v_search = tm_relation_integrity_search(relation);
                        if (NIL != v_search) {
                            {
                                SubLObject cdolist_list_var = search.search_tree(v_search);
                                SubLObject top_node = NIL;
                                for (top_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_node = cdolist_list_var.first()) {
                                    tm_free_entire_integrity_search_tree(top_node);
                                }
                            }
                            search._csetf_search_state(v_search, NIL);
                        }
                        if (NIL != integrity_check_in_progress_for_relationP(relation)) {
                            $tm_relation_integrity_searches$.setDynamicValue(delete(relation, $tm_relation_integrity_searches$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Add an entry for an integrity violation search for RELATION.
     * Default is to add an entry that shows a search is needed.  It is the
     * callers responsibility to ensure there is no current entry for
     * relation; though it is at this function's discretion to clear any
     * already existing search. When user is nil, user is stored as
     * "Unknown".
     */
    public static final SubLObject tm_add_relation_integrity_search(SubLObject relation, SubLObject v_search, SubLObject status, SubLObject user) {
        if (v_search == UNPROVIDED) {
            v_search = NIL;
        }
        if (status == UNPROVIDED) {
            status = $NEEDED;
        }
        if (user == UNPROVIDED) {
            user = tm_datastructures.$tm_user$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation, $sym211$THESAURUS_PREDICATE_);
            {
                SubLObject user_value = (NIL == user) ? ((SubLObject) ($$$Unknown)) : user;
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $tm_relation_integrity_searches$.setDynamicValue(cons(cons(relation, list(v_search, status, user_value)), $tm_relation_integrity_searches$.getDynamicValue(thread)), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * If an entry does not exist for relation, adds an entry for an
     * integrity violation search for RELATION.  Default is to add an entry
     * that shows a search is needed.  If there is an entry replaces it's
     * value state with those given by search status *tm-user* It is the
     * callers responsibility to ensure there is no current entry or only one
     * entry for relation; though it is at this function's discretion to
     * clear any already existing search.  When user is nil, user is stored as
     * "Unknown".
     */
    public static final SubLObject tm_update_state_relation_integrity_search(SubLObject relation, SubLObject v_search, SubLObject status, SubLObject user) {
        if (v_search == UNPROVIDED) {
            v_search = NIL;
        }
        if (status == UNPROVIDED) {
            status = $NEEDED;
        }
        if (user == UNPROVIDED) {
            user = tm_datastructures.$tm_user$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation, $sym211$THESAURUS_PREDICATE_);
            {
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject current_entry = assoc(relation, $tm_relation_integrity_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        SubLObject user_value = (NIL == user) ? ((SubLObject) ($$$Unknown)) : user;
                        if (NIL != current_entry) {
                            rplacd(current_entry, list(v_search, status, user_value));
                        } else {
                            tm_add_relation_integrity_search(relation, v_search, status, user);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Clear all relation integrity violation searches
     */
    public static final SubLObject tm_clear_all_relation_integrity_searches() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_relation_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    Mapping.mapc(symbol_function(TM_CLEAR_INTEGRITY_SEARCH), tm_relation_integrity_searches_in_progress(), EMPTY_SUBL_OBJECT_ARRAY);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns a list of THESAURI for which an integrity violation search is in progress
     */
    public static final SubLObject tm_integrity_searches_in_progress() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = Mapping.mapcar(symbol_function(CAR), $tm_integrity_searches$.getDynamicValue(thread));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return the existing integrity violation search for THESAURUS, if any
     */
    public static final SubLObject tm_integrity_search(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = assoc(thesaurus, $tm_integrity_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Clear the integrity violation search for THESAURUS-or-RELATION, if any
     */
    public static final SubLObject tm_clear_integrity_search(SubLObject thesaurus_or_relation) {
        SubLTrampolineFile.checkType(thesaurus_or_relation, FORT_P);
        if (NIL != tm_internals.thesaurus_predicateP(thesaurus_or_relation)) {
            return tm_clear_relation_integrity_search(thesaurus_or_relation);
        } else
            if (NIL != tm_internals.thesaurusP(thesaurus_or_relation)) {
                return tm_clear_thesaurus_integrity_search(thesaurus_or_relation);
            } else {
                Errors.error($$$Unknown_Type);
                return NIL;
            }

    }

    /**
     * Clear the integrity violation search for THESAURUS, if any
     */
    public static final SubLObject tm_clear_thesaurus_integrity_search(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, $sym224$THESAURUS_);
            {
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject v_search = tm_integrity_search(thesaurus);
                        if (NIL != v_search) {
                            {
                                SubLObject cdolist_list_var = search.search_tree(v_search);
                                SubLObject top_node = NIL;
                                for (top_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_node = cdolist_list_var.first()) {
                                    tm_free_entire_integrity_search_tree(top_node);
                                }
                            }
                            search._csetf_search_state(v_search, NIL);
                            $tm_integrity_searches$.setDynamicValue(delete(thesaurus, $tm_integrity_searches$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Clear all thesaurus integrity violation searches
     */
    public static final SubLObject tm_clear_all_integrity_searches() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    Mapping.mapc(symbol_function(TM_CLEAR_INTEGRITY_SEARCH), tm_integrity_searches_in_progress(), EMPTY_SUBL_OBJECT_ARRAY);
                    $tm_integrity_searches$.setDynamicValue(NIL, thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Return a new integrity violation search for THESAURUS.  Clears out
     * the old search if there is one. If present, START-CONCEPT indicates
     * that the search should start with that concept and check all its
     * narrower terms recursively.
     */
    public static final SubLObject tm_new_integrity_search(SubLObject thesaurus, SubLObject start_concept) {
        if (start_concept == UNPROVIDED) {
            start_concept = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_clear_unique_violations_of_object(thesaurus);
                    tm_clear_integrity_search(thesaurus);
                    {
                        SubLObject assertion_table = tm_integrity_init_seen_table(thesaurus, start_concept);
                        SubLObject v_search = tm_new_integrity_search_int(thesaurus, assertion_table);
                        $tm_integrity_searches$.setDynamicValue(cons(cons(thesaurus, v_search), $tm_integrity_searches$.getDynamicValue(thread)), thread);
                        result = v_search;
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return a new integrity violation search for uses of relation-constant in thesaurus.
     * Thesaurus should either be :all or a thesaurus.  In either case it is the responsibility
     * of the caller of this function to make sure the thesauri are active.
     */
    public static final SubLObject tm_new_relation_integrity_search(SubLObject relation_constant, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject num_predicate_extent_index = ZERO_INTEGER;
                SubLObject assertion_table = NIL;
                SubLObject v_search = NIL;
                SubLObject thesauri = NIL;
                SubLTrampolineFile.checkType(relation_constant, $sym211$THESAURUS_PREDICATE_);
                if (thesaurus.eql($ALL)) {
                    thesauri = tm_internals.all_thesauri();
                } else {
                    SubLTrampolineFile.checkType(thesaurus, $sym224$THESAURUS_);
                    thesauri = list(thesaurus);
                }
                tm_clear_unique_violations_of_object(relation_constant);
                {
                    SubLObject cdolist_list_var = thesauri;
                    SubLObject thesaurus_10 = NIL;
                    for (thesaurus_10 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_10 = cdolist_list_var.first()) {
                        num_predicate_extent_index = add(num_predicate_extent_index, kb_indexing.num_predicate_extent_index(relation_constant, thesaurus_10));
                    }
                }
                tm_clear_integrity_search(relation_constant);
                {
                    SubLObject _prev_bind_0 = $tm_integrity_init_assertion_hash$.currentBinding(thread);
                    try {
                        $tm_integrity_init_assertion_hash$.bind(make_hash_table(num_predicate_extent_index, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject _prev_bind_0_11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                mt_relevance_macros.$relevant_mts$.bind(thesauri, thread);
                                kb_mapping.map_predicate_extent_index(symbol_function(TM_INTEGRITY_INIT_HASH_ASSERTION), relation_constant, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        assertion_table = $tm_integrity_init_assertion_hash$.getDynamicValue(thread);
                    } finally {
                        $tm_integrity_init_assertion_hash$.rebind(_prev_bind_0, thread);
                    }
                }
                v_search = tm_new_integrity_search_int(relation_constant, assertion_table);
                tm_update_state_relation_integrity_search(relation_constant, v_search, $IN_PROGRESS, UNPROVIDED);
                return v_search;
            }
        }
    }

    /**
     * Continue integrity violation SEARCH until time or number cutoffs are met.
     * Values returned:
     * 1: list of list of integrity violations
     * 2: reason search ended: one of :NUMBER :TIME or :EXHAUST
     */
    public static final SubLObject tm_continue_integrity_search(SubLObject v_search, SubLObject number_cutoff, SubLObject time_cutoff) {
        if (number_cutoff == UNPROVIDED) {
            number_cutoff = $tm_integrity_number_cutoff$.getDynamicValue();
        }
        if (time_cutoff == UNPROVIDED) {
            time_cutoff = $tm_integrity_time_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_search, SEARCH_STRUC_P);
            {
                SubLObject reason = NIL;
                SubLObject v_answer = NIL;
                SubLObject lock = $tm_integrity_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject _prev_bind_0 = search.$reclaim_dead_end_search_nodes$.currentBinding(thread);
                        SubLObject _prev_bind_1 = search.$dead_end_node_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = search.$reclaim_dead_end_node_function$.currentBinding(thread);
                        try {
                            search.$reclaim_dead_end_search_nodes$.bind(T, thread);
                            search.$dead_end_node_function$.bind(TM_INTEGRITY_DEAD_END_NODE, thread);
                            search.$reclaim_dead_end_node_function$.bind(TM_INTEGRITY_RECLAIM_SEARCH_NODE, thread);
                            reason = search.generic_search(v_search, number_cutoff, time_cutoff, NIL);
                        } finally {
                            search.$reclaim_dead_end_node_function$.rebind(_prev_bind_2, thread);
                            search.$dead_end_node_function$.rebind(_prev_bind_1, thread);
                            search.$reclaim_dead_end_search_nodes$.rebind(_prev_bind_0, thread);
                        }
                    }
                    v_answer = search.search_goals(v_search);
                    if (reason == $EXHAUST) {
                        {
                            SubLObject thesaurus_or_relation = search.search_state(v_search).first();
                            tm_clear_integrity_search(thesaurus_or_relation);
                        }
                    } else {
                        search._csetf_search_goals(v_search, NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return values(v_answer, reason);
            }
        }
    }

    /**
     * Return a new integrity search for THESAURUS-or-RELATION which will check all assertions
     * in ASSERTION-TABLE.  THESAURUS-or-RELATION should be either or THESAURUS or a RELATION
     */
    public static final SubLObject tm_new_integrity_search_int(SubLObject thesaurus_or_relation, SubLObject assertion_table) {
        {
            SubLObject v_search = search.new_search(TM_INTEGRITY_NO_LEAVES_P, TM_INTEGRITY_NEXT_NODE, TM_INTEGRITY_GOAL_P, TM_INTEGRITY_ADD_GOAL, TM_INTEGRITY_OPTIONS, TM_INTEGRITY_EXPAND, TM_INTEGRITY_ADD_NODE, TM_INTEGRITY_TOO_DEEP_P, UNPROVIDED, UNPROVIDED);
            tm_integrity_initialize_search(v_search, thesaurus_or_relation);
            search.add_search_start_node(v_search, hash_table_utilities.list_table_keys(assertion_table));
            tm_integrity_increment_total_count(v_search, hash_table_count(assertion_table));
            clrhash(assertion_table);
            return v_search;
        }
    }

    public static final SubLObject tm_integrity_initialize_search(SubLObject v_search, SubLObject thesaurus_or_relation) {
        {
            SubLObject total_count = ZERO_INTEGER;
            SubLObject seen = ZERO_INTEGER;
            search._csetf_search_state(v_search, list(thesaurus_or_relation, total_count, seen));
            search._csetf_search_goals(v_search, NIL);
            search._csetf_search_leaves(v_search, NIL);
            search._csetf_search_tree(v_search, NIL);
            return v_search;
        }
    }

    public static final SubLObject tm_integrity_no_leaves_p(SubLObject leaves) {
        return sublisp_null(leaves);
    }

    public static final SubLObject tm_integrity_next_node(SubLObject leaves) {
        return values(last(leaves, UNPROVIDED).first(), butlast(leaves, UNPROVIDED));
    }

    public static final SubLObject tm_integrity_goal_p(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            if (state.isCons() && (NIL == assertion_handles.assertion_p(state.first()))) {
                return tm_unique_violationP(state, search.search_state(search.snode_search(node)).first());
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_add_goal(SubLObject node, SubLObject goals) {
        {
            SubLObject state = search.snode_state(node);
            return values(cons(state, goals), T);
        }
    }

    public static final SubLObject tm_integrity_options(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            SubLObject assertion = state.first();
            if (NIL != assertion_handles.assertion_p(assertion)) {
                return $list_alt240;
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_expand(SubLObject node, SubLObject option) {
        {
            SubLObject pcase_var = option;
            if (pcase_var.eql($INTEGRITY_CHECK)) {
                return tm_integrity_integrity_expand(node);
            } else
                if (pcase_var.eql($CDR)) {
                    return tm_integrity_cdr_expand(node);
                }

        }
        return NIL;
    }

    public static final SubLObject tm_integrity_add_node(SubLObject node, SubLObject leaves) {
        return cons(node, leaves);
    }

    public static final SubLObject tm_integrity_too_deep_p(SubLObject node, SubLObject depth_cut) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_increment_seen(SubLObject v_search, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        {
            SubLObject datum = search.search_state(v_search);
            SubLObject current = datum;
            SubLObject thesaurus = NIL;
            SubLObject total_count = NIL;
            SubLObject seen = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt243);
            thesaurus = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            total_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            seen = current.first();
            current = current.rest();
            if (NIL == current) {
                search._csetf_search_state(v_search, list(thesaurus, total_count, add(seen, delta)));
            } else {
                cdestructuring_bind_error(datum, $list_alt243);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_increment_total_count(SubLObject v_search, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        {
            SubLObject datum = search.search_state(v_search);
            SubLObject current = datum;
            SubLObject thesaurus = NIL;
            SubLObject total_count = NIL;
            SubLObject seen = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt243);
            thesaurus = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            total_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            seen = current.first();
            current = current.rest();
            if (NIL == current) {
                search._csetf_search_state(v_search, list(thesaurus, add(total_count, delta), seen));
            } else {
                cdestructuring_bind_error(datum, $list_alt243);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_integrity_expand(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            if (state.isList()) {
                {
                    SubLObject assertion_list = state;
                    SubLObject assertion = assertion_list.first();
                    SubLObject violations = NIL;
                    if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                        violations = tm_diagnose_one_thesaurus_object(assertion);
                    }
                    tm_integrity_increment_seen(search.snode_search(node), UNPROVIDED);
                    return Mapping.mapcar(symbol_function(NEW_SEARCH_NODE), violations);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_cdr_expand(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            if (state.isList()) {
                {
                    SubLObject assertion_list = state;
                    SubLObject next = assertion_list.rest();
                    if (NIL != next) {
                        search._csetf_snode_state(node, next);
                        return list(node);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_dead_end_node(SubLObject node) {
        return makeBoolean((NIL != search.search_node_p(node)) && (NIL == search.snode_options(node)));
    }

    public static final SubLObject tm_integrity_reclaim_search_node(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject parent = search.snode_parent(node);
                if (NIL != search.search_node_p(parent)) {
                    {
                        SubLObject siblings = search.snode_children(parent);
                        search._csetf_snode_children(parent, delete(node, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        tm_free_entire_integrity_search_tree(node);
                        if (NIL != tm_integrity_dead_end_node(parent)) {
                            tm_integrity_reclaim_search_node(parent);
                        }
                    }
                } else {
                    {
                        SubLObject v_search = search.snode_search(node);
                        if ((NIL != search.search_struc_p(v_search)) && (NIL != member(node, search.search_tree(v_search), UNPROVIDED, UNPROVIDED))) {
                            search.remove_search_start_node(v_search, node);
                            tm_free_entire_integrity_search_tree(node);
                        } else {
                            Errors.cerror($str_alt245$So_don_t, $str_alt246$Cannot_reclaim_strange_node__S, node);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_free_entire_integrity_search_tree(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject cdolist_list_var = search.snode_children(node);
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    tm_free_entire_integrity_search_tree(child);
                }
            }
            search.free_search_node(node);
        }
        return NIL;
    }

    /**
     * utility table for initializing assertion list for integrity search
     */
    public static final SubLObject tm_integrity_init_hash_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(assertion, $tm_integrity_init_assertion_hash$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(assertion, $tm_integrity_init_assertion_hash$.getDynamicValue(thread), $NOTED);
            }
            return NIL;
        }
    }

    /**
     * returns a hashtable containting all the assertions to check for THESAURUS.
     * If START-CONCEPT is nil, table will contain all assertions of THESAURUS.  Otherwise,
     * it holds assertions of START-CONCEPT and all its narrower terms.
     */
    public static final SubLObject tm_integrity_init_seen_table(SubLObject thesaurus, SubLObject start_concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject seen_table = NIL;
                if (NIL != start_concept) {
                    {
                        SubLObject init_search = tm_new_integrity_initialization_search(thesaurus, start_concept);
                        seen_table = do_integrity_initialization_search(init_search);
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = $tm_integrity_init_assertion_hash$.currentBinding(thread);
                        try {
                            $tm_integrity_init_assertion_hash$.bind(make_hash_table($int$1000, UNPROVIDED, UNPROVIDED), thread);
                            {
                                SubLObject _prev_bind_0_12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                    kb_mapping.map_mt_index(symbol_function(TM_INTEGRITY_INIT_HASH_ASSERTION), thesaurus, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                            {
                                SubLObject _prev_bind_0_13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                                    kb_mapping.map_gaf_arg_index(symbol_function(TM_INTEGRITY_INIT_HASH_ASSERTION), thesaurus, TWO_INTEGER, $$topInThesaurus, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                            seen_table = $tm_integrity_init_assertion_hash$.getDynamicValue(thread);
                        } finally {
                            $tm_integrity_init_assertion_hash$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return seen_table;
            }
        }
    }

    /**
     * Do SEARCH exhaustively. Returns a hastable, containing all assertions to be checked.
     */
    public static final SubLObject do_integrity_initialization_search(SubLObject v_search) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_search, SEARCH_STRUC_P);
            {
                SubLObject reason = NIL;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = search.$reclaim_dead_end_search_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_1 = search.$dead_end_node_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = search.$reclaim_dead_end_node_function$.currentBinding(thread);
                    try {
                        search.$reclaim_dead_end_search_nodes$.bind(T, thread);
                        search.$dead_end_node_function$.bind(TM_INTEGRITY_INIT_DEAD_END_NODE, thread);
                        search.$reclaim_dead_end_node_function$.bind(TM_INTEGRITY_INIT_RECLAIM_SEARCH_NODE, thread);
                        reason = search.generic_search(v_search, NIL, NIL, NIL);
                        {
                            SubLObject datum = search.search_state(v_search);
                            SubLObject current = datum;
                            SubLObject thesaurus = NIL;
                            SubLObject table = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt251);
                            thesaurus = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt251);
                            table = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                result = table;
                            } else {
                                cdestructuring_bind_error(datum, $list_alt251);
                            }
                        }
                        if (reason == $EXHAUST) {
                            {
                                SubLObject cdolist_list_var = search.search_tree(v_search);
                                SubLObject top_node = NIL;
                                for (top_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_node = cdolist_list_var.first()) {
                                    tm_free_entire_integrity_init_search_tree(top_node);
                                }
                                search._csetf_search_state(v_search, NIL);
                            }
                        } else {
                            search._csetf_search_goals(v_search, NIL);
                        }
                    } finally {
                        search.$reclaim_dead_end_node_function$.rebind(_prev_bind_2, thread);
                        search.$dead_end_node_function$.rebind(_prev_bind_1, thread);
                        search.$reclaim_dead_end_search_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return a new integrity-initialization search for THESAURUS.
     * START-CONCEPT is a concept at which to start the search.
     */
    public static final SubLObject tm_new_integrity_initialization_search(SubLObject thesaurus, SubLObject start_concept) {
        SubLTrampolineFile.checkType(thesaurus, FORT_P);
        {
            SubLObject v_search = tm_new_integrity_initialization_search_int(thesaurus, start_concept);
            return v_search;
        }
    }

    public static final SubLObject tm_new_integrity_initialization_search_int(SubLObject thesaurus, SubLObject start_concept) {
        {
            SubLObject v_search = search.new_search(TM_INTEGRITY_INIT_NO_LEAVES_P, TM_INTEGRITY_INIT_NEXT_NODE, TM_INTEGRITY_INIT_GOAL_P, TM_INTEGRITY_INIT_ADD_GOAL, TM_INTEGRITY_INIT_OPTIONS, TM_INTEGRITY_INIT_EXPAND, TM_INTEGRITY_INIT_ADD_NODE, TM_INTEGRITY_INIT_TOO_DEEP_P, UNPROVIDED, UNPROVIDED);
            SubLObject mark_table = make_hash_table($int$1000, UNPROVIDED, UNPROVIDED);
            search._csetf_search_state(v_search, list(thesaurus, mark_table));
            search._csetf_search_goals(v_search, NIL);
            search._csetf_search_leaves(v_search, NIL);
            search._csetf_search_tree(v_search, NIL);
            search.add_search_start_node(v_search, start_concept);
            return v_search;
        }
    }

    public static final SubLObject tm_integrity_init_no_leaves_p(SubLObject leaves) {
        return sublisp_null(leaves);
    }

    public static final SubLObject tm_integrity_init_next_node(SubLObject leaves) {
        return values(leaves.first(), leaves.rest());
    }

    public static final SubLObject tm_integrity_init_goal_p(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            return eq(state, $DONE);
        }
    }

    public static final SubLObject tm_integrity_init_add_goal(SubLObject node, SubLObject goals) {
        return values(goals, T);
    }

    public static final SubLObject tm_integrity_init_options(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            if (NIL != forts.fort_p(state)) {
                return $list_alt261;
            }
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_init_expand(SubLObject node, SubLObject option) {
        {
            SubLObject pcase_var = option;
            if (pcase_var.eql($NT)) {
                return tm_integrity_init_nt_expand(node);
            } else
                if (pcase_var.eql($ASSERTIONS)) {
                    return tm_integrity_init_assertions_expand(node);
                }

        }
        return NIL;
    }

    public static final SubLObject tm_integrity_init_add_node(SubLObject node, SubLObject leaves) {
        return cons(node, leaves);
    }

    public static final SubLObject tm_integrity_init_too_deep_p(SubLObject node, SubLObject depth_cut) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_init_nt_expand(SubLObject node) {
        {
            SubLObject datum = search.search_state(search.snode_search(node));
            SubLObject current = datum;
            SubLObject thesaurus = NIL;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt251);
            thesaurus = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt251);
            table = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = search.snode_state(node);
                    if (NIL != forts.fort_p(state)) {
                        {
                            SubLObject concept = state;
                            SubLObject narrower_terms = kb_mapping_utilities.pred_values_in_mt(concept, $$broaderTerm, thesaurus, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                            if (NIL != narrower_terms) {
                                {
                                    SubLObject children = NIL;
                                    SubLObject cdolist_list_var = narrower_terms;
                                    SubLObject narrower_term = NIL;
                                    for (narrower_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower_term = cdolist_list_var.first()) {
                                        children = cons(search.new_search_node(narrower_term), children);
                                    }
                                    return children;
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt251);
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $tm_integrity_init_table$ = makeSymbol("*TM-INTEGRITY-INIT-TABLE*");

    public static final SubLObject tm_note_integrity_init_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(assertion, $tm_integrity_init_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(assertion, $tm_integrity_init_table$.getDynamicValue(thread), $NOTED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_integrity_init_assertions_expand(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = search.search_state(search.snode_search(node));
                SubLObject current = datum;
                SubLObject thesaurus = NIL;
                SubLObject table = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt251);
                thesaurus = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt251);
                table = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = search.snode_state(node);
                        {
                            SubLObject _prev_bind_0 = $tm_integrity_init_table$.currentBinding(thread);
                            try {
                                $tm_integrity_init_table$.bind(table, thread);
                                if (NIL != forts.fort_p(state)) {
                                    {
                                        SubLObject concept = state;
                                        {
                                            SubLObject _prev_bind_0_14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                                kb_mapping.map_term(symbol_function(TM_NOTE_INTEGRITY_INIT_ASSERTION), concept);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                                                kb_mapping.map_gaf_arg_index(symbol_function(TM_NOTE_INTEGRITY_INIT_ASSERTION), concept, ONE_INTEGER, $$topInThesaurus, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $tm_integrity_init_table$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt251);
                }
            }
            return list(search.new_search_node($DONE));
        }
    }

    public static final SubLObject tm_integrity_init_dead_end_node(SubLObject node) {
        return makeBoolean((NIL != search.search_node_p(node)) && (NIL == search.snode_children(node)));
    }

    public static final SubLObject tm_integrity_init_reclaim_search_node(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject parent = search.snode_parent(node);
                if (NIL != search.search_node_p(parent)) {
                    {
                        SubLObject siblings = search.snode_children(parent);
                        search._csetf_snode_children(parent, delete(node, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        tm_free_entire_integrity_init_search_tree(node);
                        if (NIL != tm_integrity_init_dead_end_node(parent)) {
                            tm_integrity_init_reclaim_search_node(parent);
                        }
                    }
                } else {
                    {
                        SubLObject v_search = search.snode_search(node);
                        if ((NIL != search.search_struc_p(v_search)) && (NIL != member(node, search.search_tree(v_search), UNPROVIDED, UNPROVIDED))) {
                            search.remove_search_start_node(v_search, node);
                            tm_free_entire_integrity_init_search_tree(node);
                        } else {
                            Errors.cerror($str_alt245$So_don_t, $str_alt246$Cannot_reclaim_strange_node__S, node);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_free_entire_integrity_init_search_tree(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject cdolist_list_var = search.snode_children(node);
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    tm_free_entire_integrity_init_search_tree(child);
                }
            }
            search.free_search_node(node);
        }
        return NIL;
    }

    /**
     * Utility for doing a full integrity sweep of the thesaurus with THESAURUS-NAME,
     * and storing the violations found, if any, in OUTFILE.  If USER-ID is specified,
     * violations that can be automatically fixed will be fixed.
     */
    public static final SubLObject batch_integrity(SubLObject thesaurus_name, SubLObject outfile, SubLObject user_id) {
        if (user_id == UNPROVIDED) {
            user_id = NIL;
        }
        if (NIL != user_id) {
            if (NIL == tm_internals.tm_recognized_userP(user_id)) {
                return format(NIL, $str_alt265$The_user_ID___A__is_not_a_known_u, user_id);
            }
        }
        {
            SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
            SubLObject violations = NIL;
            if (NIL == tm_internals.thesaurusP(thesaurus)) {
                Errors.error($str_alt266$The_name__A_doesn_t_refer_to_a_kn, thesaurus_name);
            }
            violations = cconcatenate(tm_diagnose_thesaurus_assertions(thesaurus), new SubLObject[]{ tm_diagnose_thesaurus_concepts(thesaurus), tm_diagnose_thesaurus_signs(thesaurus) });
            violations = remove_duplicates(violations, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == violations) {
                return format(NIL, $str_alt267$There_were_no_integrity_violation, thesaurus_name);
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt269$Unable_to_open__S, outfile);
                    }
                    {
                        SubLObject out = stream;
                        SubLObject cdolist_list_var = violations;
                        SubLObject violation = NIL;
                        for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation = cdolist_list_var.first()) {
                            tm_batch_handle_integrity_violation(violation, out, user_id);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        }
        return format(NIL, $str_alt270$Violations_are_in__A, outfile);
    }

    /**
     * Utility for deleting all uses of the relation identified by RELATION-NAME from the thesaurus named
     * THESAURUS-NAME.  The operations will be performed by the user idenitified by USER-ID, and will be
     * transcripted.
     */
    public static final SubLObject batch_delete_relation_from_thesaurus(SubLObject relation_name, SubLObject thesaurus_name, SubLObject user_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_internals.tm_recognized_userP(user_id)) {
                return format(NIL, $str_alt265$The_user_ID___A__is_not_a_known_u, user_id);
            }
            {
                SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                SubLObject relation = tm_internals.relation_constant_from_abbreviation(relation_name);
                SubLObject inverse = tm_internals.inverse_relation(relation_name);
                SubLObject success_count = ZERO_INTEGER;
                SubLObject failure_count = ZERO_INTEGER;
                if (NIL == tm_internals.thesaurusP(thesaurus)) {
                    Errors.error($str_alt266$The_name__A_doesn_t_refer_to_a_kn, thesaurus_name);
                }
                if (NIL == tm_internals.thesaurus_predicateP(relation)) {
                    Errors.error($str_alt271$The_name__A_doesn_t_refer_to_a_kn, relation_name);
                }
                {
                    SubLObject _prev_bind_0 = tm_datastructures.$tm_user$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        tm_datastructures.$tm_user$.bind(user_id, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        {
                            SubLObject pred_var = relation;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_16 = NIL;
                                                            SubLObject token_var_17 = NIL;
                                                            while (NIL == done_var_16) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                    SubLObject valid_18 = makeBoolean(token_var_17 != assertion);
                                                                    if (NIL != valid_18) {
                                                                        if (NIL != tm_io.tm_load_unassert_assertion(assertion)) {
                                                                            success_count = add(success_count, ONE_INTEGER);
                                                                        } else {
                                                                            failure_count = add(failure_count, ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    done_var_16 = makeBoolean(NIL == valid_18);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        tm_datastructures.$tm_user$.rebind(_prev_bind_0, thread);
                    }
                }
                return format(NIL, $str_alt272$_A_uses_of__A_A_were_removed_from, new SubLObject[]{ success_count, relation_name, NIL != inverse ? ((SubLObject) (format(NIL, $str_alt273$_and_of_its_inverse___A, inverse))) : $str_alt91$, thesaurus_name, failure_count });
            }
        }
    }

    public static final SubLObject declare_tm_integrity_file() {
        declareFunction("tm_add_to_unique_violations_hashes", "TM-ADD-TO-UNIQUE-VIOLATIONS-HASHES", 1, 0, false);
        declareFunction("tm_unique_violations_hash_of_object", "TM-UNIQUE-VIOLATIONS-HASH-OF-OBJECT", 1, 0, false);
        declareFunction("tm_clear_unique_violations_of_object", "TM-CLEAR-UNIQUE-VIOLATIONS-OF-OBJECT", 1, 0, false);
        declareFunction("tm_record_violation", "TM-RECORD-VIOLATION", 2, 0, false);
        declareFunction("tm_unique_violationP", "TM-UNIQUE-VIOLATION?", 2, 0, false);
        declareFunction("tm_unique_violation_in_relevant_thesaurusP", "TM-UNIQUE-VIOLATION-IN-RELEVANT-THESAURUS?", 1, 0, false);
        declareFunction("tm_remove_violation_from_unique_hash", "TM-REMOVE-VIOLATION-FROM-UNIQUE-HASH", 1, 0, false);
        declareFunction("tmi_fix_print_function_trampoline", "TMI-FIX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tmi_fix_p", "TMI-FIX-P", 1, 0, false);
        new tm_integrity.$tmi_fix_p$UnaryFunction();
        declareFunction("tmi_fix_id", "TMI-FIX-ID", 1, 0, false);
        declareFunction("tmi_fix_module", "TMI-FIX-MODULE", 1, 0, false);
        declareFunction("tmi_fix_op", "TMI-FIX-OP", 1, 0, false);
        declareFunction("tmi_fix_data", "TMI-FIX-DATA", 1, 0, false);
        declareFunction("tmi_fix_violator", "TMI-FIX-VIOLATOR", 1, 0, false);
        declareFunction("tmi_fix_v_data", "TMI-FIX-V-DATA", 1, 0, false);
        declareFunction("tmi_fix_mt", "TMI-FIX-MT", 1, 0, false);
        declareFunction("tmi_fix_superior", "TMI-FIX-SUPERIOR", 1, 0, false);
        declareFunction("tmi_fix_inferior", "TMI-FIX-INFERIOR", 1, 0, false);
        declareFunction("tmi_fix_alternates", "TMI-FIX-ALTERNATES", 1, 0, false);
        declareFunction("tmi_fix_alist", "TMI-FIX-ALIST", 1, 0, false);
        declareFunction("_csetf_tmi_fix_id", "_CSETF-TMI-FIX-ID", 2, 0, false);
        declareFunction("_csetf_tmi_fix_module", "_CSETF-TMI-FIX-MODULE", 2, 0, false);
        declareFunction("_csetf_tmi_fix_op", "_CSETF-TMI-FIX-OP", 2, 0, false);
        declareFunction("_csetf_tmi_fix_data", "_CSETF-TMI-FIX-DATA", 2, 0, false);
        declareFunction("_csetf_tmi_fix_violator", "_CSETF-TMI-FIX-VIOLATOR", 2, 0, false);
        declareFunction("_csetf_tmi_fix_v_data", "_CSETF-TMI-FIX-V-DATA", 2, 0, false);
        declareFunction("_csetf_tmi_fix_mt", "_CSETF-TMI-FIX-MT", 2, 0, false);
        declareFunction("_csetf_tmi_fix_superior", "_CSETF-TMI-FIX-SUPERIOR", 2, 0, false);
        declareFunction("_csetf_tmi_fix_inferior", "_CSETF-TMI-FIX-INFERIOR", 2, 0, false);
        declareFunction("_csetf_tmi_fix_alternates", "_CSETF-TMI-FIX-ALTERNATES", 2, 0, false);
        declareFunction("_csetf_tmi_fix_alist", "_CSETF-TMI-FIX-ALIST", 2, 0, false);
        declareFunction("make_tmi_fix", "MAKE-TMI-FIX", 0, 1, false);
        declareFunction("sxhash_tmi_fix_method", "SXHASH-TMI-FIX-METHOD", 1, 0, false);
        declareFunction("make_static_tmi_fix", "MAKE-STATIC-TMI-FIX", 0, 0, false);
        declareFunction("init_tmi_fix", "INIT-TMI-FIX", 1, 0, false);
        declareFunction("free_tmi_fix_p", "FREE-TMI-FIX-P", 1, 0, false);
        declareFunction("free_tmi_fix", "FREE-TMI-FIX", 1, 0, false);
        declareFunction("get_tmi_fix", "GET-TMI-FIX", 0, 0, false);
        declareFunction("print_tmi_fix", "PRINT-TMI-FIX", 3, 0, false);
        declareFunction("remove_tmi_fix", "REMOVE-TMI-FIX", 1, 0, false);
        declareFunction("find_tmi_fix_by_id", "FIND-TMI-FIX-BY-ID", 1, 0, false);
        declareFunction("create_tmi_fix", "CREATE-TMI-FIX", 2, 1, false);
        declareFunction("tmi_moduleP", "TMI-MODULE?", 1, 0, false);
        declareFunction("tmi_fix_opP", "TMI-FIX-OP?", 1, 0, false);
        declareFunction("connect_tmi_fix", "CONNECT-TMI-FIX", 1, 0, false);
        declareFunction("make_tmi_fix_shell", "MAKE-TMI-FIX-SHELL", 0, 1, false);
        declareFunction("make_tmi_fix_id", "MAKE-TMI-FIX-ID", 0, 0, false);
        declareFunction("add_fix_alternates", "ADD-FIX-ALTERNATES", 1, 0, false);
        declareFunction("tm_integrity_check_assertion", "TM-INTEGRITY-CHECK-ASSERTION", 1, 0, false);
        declareFunction("tm_integrity_check_predicate", "TM-INTEGRITY-CHECK-PREDICATE", 1, 0, false);
        declareFunction("tm_integrity_check_concept", "TM-INTEGRITY-CHECK-CONCEPT", 2, 0, false);
        declareFunction("tm_integrity_check_concept_predicate", "TM-INTEGRITY-CHECK-CONCEPT-PREDICATE", 1, 0, false);
        declareFunction("tm_integrity_check_concept_assertion", "TM-INTEGRITY-CHECK-CONCEPT-ASSERTION", 1, 0, false);
        declareFunction("tm_integrity_check_predicate_doneP", "TM-INTEGRITY-CHECK-PREDICATE-DONE?", 1, 0, false);
        declareFunction("tm_integrity_check_predicate_done", "TM-INTEGRITY-CHECK-PREDICATE-DONE", 1, 0, false);
        declareFunction("tm_integrity_violation_message", "TM-INTEGRITY-VIOLATION-MESSAGE", 1, 0, false);
        declareFunction("tm_handle_integrity_violations", "TM-HANDLE-INTEGRITY-VIOLATIONS", 1, 0, false);
        declareFunction("tm_handle_integrity_violation", "TM-HANDLE-INTEGRITY-VIOLATION", 1, 0, false);
        declareFunction("tm_batch_handle_integrity_violation", "TM-BATCH-HANDLE-INTEGRITY-VIOLATION", 2, 1, false);
        declareFunction("tm_fix_still_relevant_by_idP", "TM-FIX-STILL-RELEVANT-BY-ID?", 1, 0, false);
        declareFunction("tm_fix_still_relevantP", "TM-FIX-STILL-RELEVANT?", 1, 0, false);
        declareFunction("tm_violation_still_thereP", "TM-VIOLATION-STILL-THERE?", 1, 0, false);
        declareFunction("tm_make_violation", "TM-MAKE-VIOLATION", 3, 0, false);
        declareFunction("tm_violation_module", "TM-VIOLATION-MODULE", 1, 0, false);
        declareFunction("tm_violation_data", "TM-VIOLATION-DATA", 1, 0, false);
        declareFunction("tm_violation_index", "TM-VIOLATION-INDEX", 1, 0, false);
        declareFunction("tm_violation_p", "TM-VIOLATION-P", 1, 0, false);
        declareFunction("tm_integrity_modules", "TM-INTEGRITY-MODULES", 0, 1, false);
        declareFunction("tm_all_integrity_modules", "TM-ALL-INTEGRITY-MODULES", 0, 0, false);
        declareFunction("tm_integrity_module", "TM-INTEGRITY-MODULE", 2, 0, false);
        declareFunction("tm_integrity_module_level", "TM-INTEGRITY-MODULE-LEVEL", 1, 0, false);
        declareFunction("tm_integrity_module_required", "TM-INTEGRITY-MODULE-REQUIRED", 1, 0, false);
        declareFunction("tm_integrity_module_test", "TM-INTEGRITY-MODULE-TEST", 1, 0, false);
        declareFunction("tm_integrity_module_message", "TM-INTEGRITY-MODULE-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_module_fixer", "TM-INTEGRITY-MODULE-FIXER", 1, 0, false);
        declareFunction("tm_integrity_module_user_fixer", "TM-INTEGRITY-MODULE-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_module_description", "TM-INTEGRITY-MODULE-DESCRIPTION", 1, 0, false);
        declareFunction("tm_integrity_module_name_as_string", "TM-INTEGRITY-MODULE-NAME-AS-STRING", 1, 0, false);
        declareFunction("tm_integrity_module_short_description", "TM-INTEGRITY-MODULE-SHORT-DESCRIPTION", 1, 0, false);
        declareFunction("tm_integrity_default_message", "TM-INTEGRITY-DEFAULT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_unassert_assertion", "TM-INTEGRITY-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction("tm_integrity_unassert", "TM-INTEGRITY-UNASSERT", 2, 0, false);
        declareFunction("tm_integrity_rename_term", "TM-INTEGRITY-RENAME-TERM", 3, 0, false);
        declareFunction("tm_integrity_splice_out_term", "TM-INTEGRITY-SPLICE-OUT-TERM", 1, 0, false);
        declareFunction("tm_integrity_remove_stoplist_word", "TM-INTEGRITY-REMOVE-STOPLIST-WORD", 1, 0, false);
        declareFunction("tm_integrity_assert", "TM-INTEGRITY-ASSERT", 2, 0, false);
        declareFunction("tm_relevant_thesaurus_of_assertion", "TM-RELEVANT-THESAURUS-OF-ASSERTION", 1, 0, false);
        declareFunction("tm_record_integrity_fix", "TM-RECORD-INTEGRITY-FIX", 2, 1, false);
        declareFunction("tm_remove_integrity_fix", "TM-REMOVE-INTEGRITY-FIX", 1, 0, false);
        declareFunction("tm_remove_integrity_fix_from_id", "TM-REMOVE-INTEGRITY-FIX-FROM-ID", 1, 0, false);
        declareFunction("tm_remove_all_integrity_fixes", "TM-REMOVE-ALL-INTEGRITY-FIXES", 0, 0, false);
        declareFunction("tm_all_integrity_fixes", "TM-ALL-INTEGRITY-FIXES", 0, 0, false);
        declareFunction("tm_integrity_restricted_relation_test", "TM-INTEGRITY-RESTRICTED-RELATION-TEST", 1, 0, false);
        declareFunction("tm_integrity_restricted_relation_message", "TM-INTEGRITY-RESTRICTED-RELATION-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_restricted_relation_user_fixer", "TM-INTEGRITY-RESTRICTED-RELATION-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_bt_cycle_test", "TM-INTEGRITY-BT-CYCLE-TEST", 1, 0, false);
        declareFunction("tm_integrity_bt_cycle_message", "TM-INTEGRITY-BT-CYCLE-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_bt_cycle_user_fixer", "TM-INTEGRITY-BT-CYCLE-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_nt_redundant_test", "TM-INTEGRITY-NT-REDUNDANT-TEST", 1, 0, false);
        declareFunction("tm_integrity_nt_redundant_message", "TM-INTEGRITY-NT-REDUNDANT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_nt_redundant_fixer", "TM-INTEGRITY-NT-REDUNDANT-FIXER", 1, 0, false);
        declareFunction("tm_integrity_nt_redundant_user_fixer", "TM-INTEGRITY-NT-REDUNDANT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_irreflexive_test", "TM-INTEGRITY-IRREFLEXIVE-TEST", 1, 0, false);
        declareFunction("tm_integrity_irreflexive_message", "TM-INTEGRITY-IRREFLEXIVE-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_irreflexive_fixer", "TM-INTEGRITY-IRREFLEXIVE-FIXER", 1, 0, false);
        declareFunction("tm_integrity_disjoint_pt_uf_test", "TM-INTEGRITY-DISJOINT-PT-UF-TEST", 1, 0, false);
        declareFunction("express_as_uf", "EXPRESS-AS-UF", 1, 0, false);
        declareFunction("tm_integrity_disjoint_pt_uf_message", "TM-INTEGRITY-DISJOINT-PT-UF-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_disjoint_pt_uf_user_fixer", "TM-INTEGRITY-DISJOINT-PT-UF-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_unique_pt_test", "TM-INTEGRITY-UNIQUE-PT-TEST", 1, 0, false);
        declareFunction("tm_integrity_unique_pt_message", "TM-INTEGRITY-UNIQUE-PT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_unique_pt_user_fixer", "TM-INTEGRITY-UNIQUE-PT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_unique_uf_test", "TM-INTEGRITY-UNIQUE-UF-TEST", 1, 0, false);
        declareFunction("tm_integrity_unique_uf_message", "TM-INTEGRITY-UNIQUE-UF-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_unique_uf_user_fixer", "TM-INTEGRITY-UNIQUE-UF-USER-FIXER", 1, 0, false);
        declareFunction("tm_enforce_unique_uf_rule_for_thesaurusP", "TM-ENFORCE-UNIQUE-UF-RULE-FOR-THESAURUS?", 0, 1, false);
        declareFunction("tm_integrity_top_not_bt_test", "TM-INTEGRITY-TOP-NOT-BT-TEST", 1, 0, false);
        declareFunction("tm_integrity_top_not_bt_message", "TM-INTEGRITY-TOP-NOT-BT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_top_not_bt_fixer", "TM-INTEGRITY-TOP-NOT-BT-FIXER", 1, 0, false);
        declareFunction("tm_integrity_uf_or_pt_stoplist_test", "TM-INTEGRITY-UF-OR-PT-STOPLIST-TEST", 1, 0, false);
        declareFunction("tm_integrity_uf_or_pt_stoplist_message", "TM-INTEGRITY-UF-OR-PT-STOPLIST-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_uf_or_pt_stoplist_user_fixer", "TM-INTEGRITY-UF-OR-PT-STOPLIST-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_no_pt_test", "TM-INTEGRITY-NO-PT-TEST", 1, 0, false);
        declareFunction("tm_integrity_no_pt_message", "TM-INTEGRITY-NO-PT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_no_pt_user_fixer", "TM-INTEGRITY-NO-PT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_single_entry_format_test", "TM-INTEGRITY-SINGLE-ENTRY-FORMAT-TEST", 1, 0, false);
        declareFunction("tm_integrity_single_entry_format_message", "TM-INTEGRITY-SINGLE-ENTRY-FORMAT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_single_entry_format_user_fixer", "TM-INTEGRITY-SINGLE-ENTRY-FORMAT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_single_entry_lexpred_test", "TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-TEST", 1, 0, false);
        declareFunction("tm_integrity_single_entry_lexpred_message", "TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_single_entry_lexpred_user_fixer", "TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-USER-FIXER", 1, 0, false);
        declareFunction("tm_multiple_pt_test", "TM-MULTIPLE-PT-TEST", 1, 0, false);
        declareFunction("tm_multiple_pt_message", "TM-MULTIPLE-PT-MESSAGE", 1, 0, false);
        declareFunction("tm_multiple_pt_user_fixer", "TM-MULTIPLE-PT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_bt_not_rt_test", "TM-INTEGRITY-BT-NOT-RT-TEST", 1, 0, false);
        declareFunction("tm_integrity_bt_not_rt_message", "TM-INTEGRITY-BT-NOT-RT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_bt_not_rt_user_fixer", "TM-INTEGRITY-BT-NOT-RT-USER-FIXER", 1, 0, false);
        declareFunction("bt_rt_asserts", "BT-RT-ASSERTS", 1, 0, false);
        declareFunction("rt_assertion", "RT-ASSERTION", 3, 0, false);
        declareFunction("bt_assertion", "BT-ASSERTION", 3, 0, false);
        declareFunction("tm_integrity_bt_not_rt_indirect_test", "TM-INTEGRITY-BT-NOT-RT-INDIRECT-TEST", 1, 0, false);
        declareFunction("tm_integrity_bt_not_rt_indirect_message", "TM-INTEGRITY-BT-NOT-RT-INDIRECT-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_bt_not_rt_indirect_user_fixer", "TM-INTEGRITY-BT-NOT-RT-INDIRECT-USER-FIXER", 1, 0, false);
        declareFunction("tm_integrity_pt_and_uf_test", "TM-INTEGRITY-PT-AND-UF-TEST", 2, 0, false);
        declareFunction("tm_integrity_pt_and_uf_message", "TM-INTEGRITY-PT-AND-UF-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_pt_and_uf_fixer", "TM-INTEGRITY-PT-AND-UF-FIXER", 1, 0, false);
        declareFunction("tm_integrity_not_bt_not_top_test", "TM-INTEGRITY-NOT-BT-NOT-TOP-TEST", 2, 0, false);
        declareFunction("tm_integrity_not_bt_not_top_message", "TM-INTEGRITY-NOT-BT-NOT-TOP-MESSAGE", 1, 0, false);
        declareFunction("tm_integrity_not_bt_not_top_fixer", "TM-INTEGRITY-NOT-BT-NOT-TOP-FIXER", 1, 0, false);
        declareFunction("tm_perform_remove_all_fix", "TM-PERFORM-REMOVE-ALL-FIX", 1, 0, false);
        declareFunction("tm_perform_remove_one_fix", "TM-PERFORM-REMOVE-ONE-FIX", 2, 0, false);
        declareFunction("tm_perform_retain_one_fix", "TM-PERFORM-RETAIN-ONE-FIX", 2, 0, false);
        declareFunction("tm_perform_merge_all_fix", "TM-PERFORM-MERGE-ALL-FIX", 1, 0, false);
        declareFunction("tm_perform_remove_fix", "TM-PERFORM-REMOVE-FIX", 1, 0, false);
        declareFunction("tm_perform_remove_stoplist_fix", "TM-PERFORM-REMOVE-STOPLIST-FIX", 1, 0, false);
        declareFunction("ok_nameP", "OK-NAME?", 2, 0, false);
        declareFunction("tm_perform_rename_term_fix", "TM-PERFORM-RENAME-TERM-FIX", 2, 0, false);
        declareFunction("tm_perform_splice_out_term_fix", "TM-PERFORM-SPLICE-OUT-TERM-FIX", 1, 0, false);
        declareFunction("tm_perform_retain_one_term_fix", "TM-PERFORM-RETAIN-ONE-TERM-FIX", 2, 0, false);
        declareFunction("tm_perform_delete_all_terms_fix", "TM-PERFORM-DELETE-ALL-TERMS-FIX", 1, 0, false);
        declareFunction("tm_perform_fix", "TM-PERFORM-FIX", 2, 0, false);
        declareFunction("tm_diagnose_thesaurus_assertions", "TM-DIAGNOSE-THESAURUS-ASSERTIONS", 1, 0, false);
        declareFunction("tm_diagnose_thesaurus_concepts", "TM-DIAGNOSE-THESAURUS-CONCEPTS", 1, 0, false);
        declareFunction("tm_diagnose_thesaurus_signs", "TM-DIAGNOSE-THESAURUS-SIGNS", 1, 0, false);
        declareFunction("tm_diagnose_all_uses_of_relation", "TM-DIAGNOSE-ALL-USES-OF-RELATION", 1, 1, false);
        declareFunction("tm_diagnose_one_assertion", "TM-DIAGNOSE-ONE-ASSERTION", 1, 0, false);
        declareFunction("tm_diagnose_one_sign", "TM-DIAGNOSE-ONE-SIGN", 1, 0, false);
        declareFunction("tm_diagnose_one_thesaurus_object", "TM-DIAGNOSE-ONE-THESAURUS-OBJECT", 1, 0, false);
        declareFunction("integrity_check_needed_for_relationP", "INTEGRITY-CHECK-NEEDED-FOR-RELATION?", 1, 0, false);
        declareFunction("integrity_check_in_progress_for_relationP", "INTEGRITY-CHECK-IN-PROGRESS-FOR-RELATION?", 1, 0, false);
        declareFunction("tm_relation_integrity_searches_in_progress", "TM-RELATION-INTEGRITY-SEARCHES-IN-PROGRESS", 0, 0, false);
        declareFunction("tm_relation_integrity_searches_needed", "TM-RELATION-INTEGRITY-SEARCHES-NEEDED", 0, 0, false);
        declareFunction("integrity_check_in_progress_according_to_stateP", "INTEGRITY-CHECK-IN-PROGRESS-ACCORDING-TO-STATE?", 1, 0, false);
        declareFunction("integrity_check_needed_according_to_stateP", "INTEGRITY-CHECK-NEEDED-ACCORDING-TO-STATE?", 1, 0, false);
        declareFunction("state_list_for_relation_integrity_check", "STATE-LIST-FOR-RELATION-INTEGRITY-CHECK", 1, 0, false);
        declareFunction("value_on_relation_integrity_state_list", "VALUE-ON-RELATION-INTEGRITY-STATE-LIST", 2, 0, false);
        declareFunction("tm_relation_integrity_search", "TM-RELATION-INTEGRITY-SEARCH", 1, 0, false);
        declareFunction("tm_relation_integrity_search_user", "TM-RELATION-INTEGRITY-SEARCH-USER", 1, 0, false);
        declareFunction("tm_clear_relation_integrity_search_needed", "TM-CLEAR-RELATION-INTEGRITY-SEARCH-NEEDED", 1, 0, false);
        declareFunction("tm_clear_relation_integrity_search", "TM-CLEAR-RELATION-INTEGRITY-SEARCH", 1, 0, false);
        declareFunction("tm_add_relation_integrity_search", "TM-ADD-RELATION-INTEGRITY-SEARCH", 1, 3, false);
        declareFunction("tm_update_state_relation_integrity_search", "TM-UPDATE-STATE-RELATION-INTEGRITY-SEARCH", 1, 3, false);
        declareFunction("tm_clear_all_relation_integrity_searches", "TM-CLEAR-ALL-RELATION-INTEGRITY-SEARCHES", 0, 0, false);
        declareFunction("tm_integrity_searches_in_progress", "TM-INTEGRITY-SEARCHES-IN-PROGRESS", 0, 0, false);
        declareFunction("tm_integrity_search", "TM-INTEGRITY-SEARCH", 1, 0, false);
        declareFunction("tm_clear_integrity_search", "TM-CLEAR-INTEGRITY-SEARCH", 1, 0, false);
        declareFunction("tm_clear_thesaurus_integrity_search", "TM-CLEAR-THESAURUS-INTEGRITY-SEARCH", 1, 0, false);
        declareFunction("tm_clear_all_integrity_searches", "TM-CLEAR-ALL-INTEGRITY-SEARCHES", 0, 0, false);
        declareFunction("tm_new_integrity_search", "TM-NEW-INTEGRITY-SEARCH", 1, 1, false);
        declareFunction("tm_new_relation_integrity_search", "TM-NEW-RELATION-INTEGRITY-SEARCH", 2, 0, false);
        declareFunction("tm_continue_integrity_search", "TM-CONTINUE-INTEGRITY-SEARCH", 1, 2, false);
        declareFunction("tm_new_integrity_search_int", "TM-NEW-INTEGRITY-SEARCH-INT", 2, 0, false);
        declareFunction("tm_integrity_initialize_search", "TM-INTEGRITY-INITIALIZE-SEARCH", 2, 0, false);
        declareFunction("tm_integrity_no_leaves_p", "TM-INTEGRITY-NO-LEAVES-P", 1, 0, false);
        declareFunction("tm_integrity_next_node", "TM-INTEGRITY-NEXT-NODE", 1, 0, false);
        declareFunction("tm_integrity_goal_p", "TM-INTEGRITY-GOAL-P", 1, 0, false);
        declareFunction("tm_integrity_add_goal", "TM-INTEGRITY-ADD-GOAL", 2, 0, false);
        declareFunction("tm_integrity_options", "TM-INTEGRITY-OPTIONS", 1, 0, false);
        declareFunction("tm_integrity_expand", "TM-INTEGRITY-EXPAND", 2, 0, false);
        declareFunction("tm_integrity_add_node", "TM-INTEGRITY-ADD-NODE", 2, 0, false);
        declareFunction("tm_integrity_too_deep_p", "TM-INTEGRITY-TOO-DEEP-P", 0, 2, false);
        declareFunction("tm_integrity_increment_seen", "TM-INTEGRITY-INCREMENT-SEEN", 1, 1, false);
        declareFunction("tm_integrity_increment_total_count", "TM-INTEGRITY-INCREMENT-TOTAL-COUNT", 1, 1, false);
        declareFunction("tm_integrity_integrity_expand", "TM-INTEGRITY-INTEGRITY-EXPAND", 1, 0, false);
        declareFunction("tm_integrity_cdr_expand", "TM-INTEGRITY-CDR-EXPAND", 1, 0, false);
        declareFunction("tm_integrity_dead_end_node", "TM-INTEGRITY-DEAD-END-NODE", 1, 0, false);
        declareFunction("tm_integrity_reclaim_search_node", "TM-INTEGRITY-RECLAIM-SEARCH-NODE", 1, 0, false);
        declareFunction("tm_free_entire_integrity_search_tree", "TM-FREE-ENTIRE-INTEGRITY-SEARCH-TREE", 1, 0, false);
        declareFunction("tm_integrity_init_hash_assertion", "TM-INTEGRITY-INIT-HASH-ASSERTION", 1, 0, false);
        declareFunction("tm_integrity_init_seen_table", "TM-INTEGRITY-INIT-SEEN-TABLE", 2, 0, false);
        declareFunction("do_integrity_initialization_search", "DO-INTEGRITY-INITIALIZATION-SEARCH", 1, 0, false);
        declareFunction("tm_new_integrity_initialization_search", "TM-NEW-INTEGRITY-INITIALIZATION-SEARCH", 2, 0, false);
        declareFunction("tm_new_integrity_initialization_search_int", "TM-NEW-INTEGRITY-INITIALIZATION-SEARCH-INT", 2, 0, false);
        declareFunction("tm_integrity_init_no_leaves_p", "TM-INTEGRITY-INIT-NO-LEAVES-P", 1, 0, false);
        declareFunction("tm_integrity_init_next_node", "TM-INTEGRITY-INIT-NEXT-NODE", 1, 0, false);
        declareFunction("tm_integrity_init_goal_p", "TM-INTEGRITY-INIT-GOAL-P", 1, 0, false);
        declareFunction("tm_integrity_init_add_goal", "TM-INTEGRITY-INIT-ADD-GOAL", 2, 0, false);
        declareFunction("tm_integrity_init_options", "TM-INTEGRITY-INIT-OPTIONS", 1, 0, false);
        declareFunction("tm_integrity_init_expand", "TM-INTEGRITY-INIT-EXPAND", 2, 0, false);
        declareFunction("tm_integrity_init_add_node", "TM-INTEGRITY-INIT-ADD-NODE", 2, 0, false);
        declareFunction("tm_integrity_init_too_deep_p", "TM-INTEGRITY-INIT-TOO-DEEP-P", 0, 2, false);
        declareFunction("tm_integrity_init_nt_expand", "TM-INTEGRITY-INIT-NT-EXPAND", 1, 0, false);
        declareFunction("tm_note_integrity_init_assertion", "TM-NOTE-INTEGRITY-INIT-ASSERTION", 1, 0, false);
        declareFunction("tm_integrity_init_assertions_expand", "TM-INTEGRITY-INIT-ASSERTIONS-EXPAND", 1, 0, false);
        declareFunction("tm_integrity_init_dead_end_node", "TM-INTEGRITY-INIT-DEAD-END-NODE", 1, 0, false);
        declareFunction("tm_integrity_init_reclaim_search_node", "TM-INTEGRITY-INIT-RECLAIM-SEARCH-NODE", 1, 0, false);
        declareFunction("tm_free_entire_integrity_init_search_tree", "TM-FREE-ENTIRE-INTEGRITY-INIT-SEARCH-TREE", 1, 0, false);
        declareFunction("batch_integrity", "BATCH-INTEGRITY", 2, 1, false);
        declareFunction("batch_delete_relation_from_thesaurus", "BATCH-DELETE-RELATION-FROM-THESAURUS", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_integrity_file() {
        defparameter("*TMI-FIX-FROM-ID*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
        defparameter("*TMI-FIX-OPS*", $list_alt1);
        defparameter("*TM-UNIQUE-VIOLATIONS-HASHES*", NIL);
        defparameter("*TM-UNIQUE-VIOLATION-HASHES-INDEX-OBJECT*", NIL);
        defconstant("*DTP-TMI-FIX*", TMI_FIX);
        deflexical("*TMI-FIX-FREE-LIST*", NIL);
        deflexical("*TMI-FIX-FREE-LOCK*", make_lock($str_alt47$TMI_FIX_resource_lock));
        defparameter("*TM-CONCEPT-ASSERTION-VIOLATIONS*", NIL);
        defparameter("*TM-CONCEPT-PREDICATE-VIOLATIONS*", NIL);
        defparameter("*TM-INTEGRITY-PREDICATE-TABLE*", make_hash_table($int$128, UNPROVIDED, UNPROVIDED));
        defparameter("*TM-PERMIT-USER-FIXES?*", T);
        defparameter("*TM-PERMIT-AUTO-FIXES?*", T);
        defparameter("*TM-PERFORM-CONCEPT-CHECKS?*", T);
        defparameter("*TM-PERFORM-PREDICATE-CHECKS?*", T);
        defparameter("*TM-PERFORM-ASSERTION-CHECKS?*", T);
        defparameter("*TM-INTEGRITY-MODULES*", NIL);
        defparameter("*TM-INTEGRITY-MODULE-PLIST-INDICATORS*", $list_alt77);
        defparameter("*TM-INTEGRITY-MODULE-DEFAULT-SHORT-DESCRIPTIONS*", NIL);
        defparameter("*TM-INTEGRITY-USER-FIXES-TABLE*", make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
        defparameter("*USE-FOR-STRING*", NIL);
        defvar("*TM-RELATION-TO-CHECK-ALL-USES-OF*", NIL);
        defparameter("*TM-INTEGRITY-SEARCHES*", NIL);
        defparameter("*TM-INTEGRITY-SEARCHES-LOCK*", make_lock($$$Integrity_Searches_Lock));
        defparameter("*TM-RELATION-INTEGRITY-SEARCHES*", NIL);
        defparameter("*TM-RELATION-INTEGRITY-SEARCHES-LOCK*", make_lock($str_alt209$Lock_for_Variable_Storing_Relatio));
        defparameter("*TM-INTEGRITY-NUMBER-CUTOFF*", ONE_INTEGER);
        defparameter("*TM-INTEGRITY-TIME-CUTOFF*", $int$30);
        defparameter("*TM-INTEGRITY-INIT-ASSERTION-HASH*", NIL);
        defparameter("*TM-INTEGRITY-INIT-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tm_integrity_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_tmi_fix$.getGlobalValue(), symbol_function(TMI_FIX_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TMI_FIX_ID, _CSETF_TMI_FIX_ID);
        def_csetf(TMI_FIX_MODULE, _CSETF_TMI_FIX_MODULE);
        def_csetf(TMI_FIX_OP, _CSETF_TMI_FIX_OP);
        def_csetf(TMI_FIX_DATA, _CSETF_TMI_FIX_DATA);
        def_csetf(TMI_FIX_VIOLATOR, _CSETF_TMI_FIX_VIOLATOR);
        def_csetf(TMI_FIX_V_DATA, _CSETF_TMI_FIX_V_DATA);
        def_csetf(TMI_FIX_MT, _CSETF_TMI_FIX_MT);
        def_csetf(TMI_FIX_SUPERIOR, _CSETF_TMI_FIX_SUPERIOR);
        def_csetf(TMI_FIX_INFERIOR, _CSETF_TMI_FIX_INFERIOR);
        def_csetf(TMI_FIX_ALTERNATES, _CSETF_TMI_FIX_ALTERNATES);
        def_csetf(TMI_FIX_ALIST, _CSETF_TMI_FIX_ALIST);
        identity(TMI_FIX);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tmi_fix$.getGlobalValue(), symbol_function(SXHASH_TMI_FIX_METHOD));
        tm_integrity_module($TM_RESTRICTED_RELATION, $list_alt107);
        tm_integrity_module($TM_BT_CYCLE, $list_alt114);
        tm_integrity_module($TM_NT_REDUNDANT, $list_alt120);
        tm_integrity_module($TM_IRREFLEXIVE, $list_alt124);
        tm_integrity_module($TM_DISJOINT_PT_UF, $list_alt135);
        tm_integrity_module($TM_UNIQUE_PT, $list_alt142);
        tm_integrity_module($TM_UNIQUE_UF, $list_alt148);
        tm_integrity_module($TM_TOP_NOT_BT, $list_alt153);
        tm_integrity_module($TM_UF_OR_PT_STOPLIST, $list_alt160);
        tm_integrity_module($TM_NO_PT, $list_alt166);
        tm_integrity_module($TM_SINGLE_ENTRY_FORMAT, $list_alt173);
        tm_integrity_module($TM_SINGLE_ENTRY_LEXPRED, $list_alt175);
        tm_integrity_module($TM_MULTIPLE_PT, $list_alt180);
        tm_integrity_module($TM_BT_NOT_RT, $list_alt186);
        tm_integrity_module($TM_BT_NOT_RT_INDIRECT, $list_alt190);
        tm_integrity_module($TM_PT_AND_UF, $list_alt195);
        tm_integrity_module($TM_NOT_BT_NOT_TOP, $list_alt200);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("UNRESTRICT"), makeKeyword("REMOVE-ALL"), makeKeyword("REMOVE-ONE"), makeKeyword("RETAIN-ONE"), makeKeyword("MERGE-ALL"), makeKeyword("REMOVE"), makeKeyword("REMOVE-STOPLIST-WORD"), makeKeyword("RENAME-TERM"), makeKeyword("SPLICE-OUT-TERM"), makeKeyword("RETAIN-ONE-TERM"), makeKeyword("DELETE-ALL-TERMS") });



    private static final SubLSymbol TMI_FIX = makeSymbol("TMI-FIX");

    private static final SubLSymbol TMI_FIX_P = makeSymbol("TMI-FIX-P");

    public static final SubLInteger $int$202 = makeInteger(202);

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("MODULE"), makeSymbol("OP"), makeSymbol("DATA"), makeSymbol("VIOLATOR"), makeSymbol("V-DATA"), makeSymbol("MT"), makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("ALTERNATES"), makeSymbol("ALIST") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("MODULE"), makeKeyword("OP"), $DATA, makeKeyword("VIOLATOR"), makeKeyword("V-DATA"), makeKeyword("MT"), makeKeyword("SUPERIOR"), makeKeyword("INFERIOR"), makeKeyword("ALTERNATES"), makeKeyword("ALIST") });

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("TMI-FIX-ID"), makeSymbol("TMI-FIX-MODULE"), makeSymbol("TMI-FIX-OP"), makeSymbol("TMI-FIX-DATA"), makeSymbol("TMI-FIX-VIOLATOR"), makeSymbol("TMI-FIX-V-DATA"), makeSymbol("TMI-FIX-MT"), makeSymbol("TMI-FIX-SUPERIOR"), makeSymbol("TMI-FIX-INFERIOR"), makeSymbol("TMI-FIX-ALTERNATES"), makeSymbol("TMI-FIX-ALIST") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("_CSETF-TMI-FIX-ID"), makeSymbol("_CSETF-TMI-FIX-MODULE"), makeSymbol("_CSETF-TMI-FIX-OP"), makeSymbol("_CSETF-TMI-FIX-DATA"), makeSymbol("_CSETF-TMI-FIX-VIOLATOR"), makeSymbol("_CSETF-TMI-FIX-V-DATA"), makeSymbol("_CSETF-TMI-FIX-MT"), makeSymbol("_CSETF-TMI-FIX-SUPERIOR"), makeSymbol("_CSETF-TMI-FIX-INFERIOR"), makeSymbol("_CSETF-TMI-FIX-ALTERNATES"), makeSymbol("_CSETF-TMI-FIX-ALIST") });

    private static final SubLSymbol PRINT_TMI_FIX = makeSymbol("PRINT-TMI-FIX");

    private static final SubLSymbol TMI_FIX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TMI-FIX-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TMI_FIX_ID = makeSymbol("TMI-FIX-ID");

    public static final SubLSymbol _CSETF_TMI_FIX_ID = makeSymbol("_CSETF-TMI-FIX-ID");

    private static final SubLSymbol TMI_FIX_MODULE = makeSymbol("TMI-FIX-MODULE");

    public static final SubLSymbol _CSETF_TMI_FIX_MODULE = makeSymbol("_CSETF-TMI-FIX-MODULE");

    private static final SubLSymbol TMI_FIX_OP = makeSymbol("TMI-FIX-OP");

    public static final SubLSymbol _CSETF_TMI_FIX_OP = makeSymbol("_CSETF-TMI-FIX-OP");

    private static final SubLSymbol TMI_FIX_DATA = makeSymbol("TMI-FIX-DATA");

    public static final SubLSymbol _CSETF_TMI_FIX_DATA = makeSymbol("_CSETF-TMI-FIX-DATA");

    private static final SubLSymbol TMI_FIX_VIOLATOR = makeSymbol("TMI-FIX-VIOLATOR");

    public static final SubLSymbol _CSETF_TMI_FIX_VIOLATOR = makeSymbol("_CSETF-TMI-FIX-VIOLATOR");

    private static final SubLSymbol TMI_FIX_V_DATA = makeSymbol("TMI-FIX-V-DATA");

    public static final SubLSymbol _CSETF_TMI_FIX_V_DATA = makeSymbol("_CSETF-TMI-FIX-V-DATA");

    private static final SubLSymbol TMI_FIX_MT = makeSymbol("TMI-FIX-MT");

    public static final SubLSymbol _CSETF_TMI_FIX_MT = makeSymbol("_CSETF-TMI-FIX-MT");

    private static final SubLSymbol TMI_FIX_SUPERIOR = makeSymbol("TMI-FIX-SUPERIOR");

    public static final SubLSymbol _CSETF_TMI_FIX_SUPERIOR = makeSymbol("_CSETF-TMI-FIX-SUPERIOR");

    private static final SubLSymbol TMI_FIX_INFERIOR = makeSymbol("TMI-FIX-INFERIOR");

    public static final SubLSymbol _CSETF_TMI_FIX_INFERIOR = makeSymbol("_CSETF-TMI-FIX-INFERIOR");

    private static final SubLSymbol TMI_FIX_ALTERNATES = makeSymbol("TMI-FIX-ALTERNATES");

    public static final SubLSymbol _CSETF_TMI_FIX_ALTERNATES = makeSymbol("_CSETF-TMI-FIX-ALTERNATES");

    private static final SubLSymbol TMI_FIX_ALIST = makeSymbol("TMI-FIX-ALIST");

    public static final SubLSymbol _CSETF_TMI_FIX_ALIST = makeSymbol("_CSETF-TMI-FIX-ALIST");





    private static final SubLSymbol $OP = makeKeyword("OP");



    private static final SubLSymbol $VIOLATOR = makeKeyword("VIOLATOR");

    private static final SubLSymbol $V_DATA = makeKeyword("V-DATA");







    private static final SubLSymbol $ALTERNATES = makeKeyword("ALTERNATES");



    static private final SubLString $str_alt45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol SXHASH_TMI_FIX_METHOD = makeSymbol("SXHASH-TMI-FIX-METHOD");

    static private final SubLString $str_alt47$TMI_FIX_resource_lock = makeString("TMI-FIX resource lock");



    static private final SubLString $str_alt49$__fix__S__S__S_ = makeString("#<fix:~S:~S:~S>");



    static private final SubLSymbol $sym51$TMI_MODULE_ = makeSymbol("TMI-MODULE?");

    static private final SubLSymbol $sym52$TMI_FIX_OP_ = makeSymbol("TMI-FIX-OP?");

    static private final SubLList $list_alt53 = list(makeSymbol("PROPERTY"), makeSymbol("VALUE"));

    public static final SubLInteger $int$16777216 = makeInteger(16777216);

    public static final SubLInteger $int$128 = makeInteger(128);







    private static final SubLSymbol TM_INTEGRITY_CHECK_CONCEPT_PREDICATE = makeSymbol("TM-INTEGRITY-CHECK-CONCEPT-PREDICATE");



    private static final SubLSymbol TM_INTEGRITY_CHECK_CONCEPT_ASSERTION = makeSymbol("TM-INTEGRITY-CHECK-CONCEPT-ASSERTION");



    private static final SubLSymbol TM_HANDLE_INTEGRITY_VIOLATION = makeSymbol("TM-HANDLE-INTEGRITY-VIOLATION");

    private static final SubLSymbol TM_VIOLATION_P = makeSymbol("TM-VIOLATION-P");

    static private final SubLString $str_alt65$____This_violation_is_no_longer_p = makeString("~%~%This violation is no longer present: ~A");

    static private final SubLString $str_alt66$____Violation___A = makeString("~%~%Violation: ~A");

    static private final SubLString $str_alt67$__Status__Fixed_automatically____ = makeString("~%Status: Fixed automatically -- ~A");

    static private final SubLString $str_alt68$__Status__Still_extant = makeString("~%Status: Still extant");



    private static final SubLSymbol $TM_SINGLE_ENTRY_FORMAT = makeKeyword("TM-SINGLE-ENTRY-FORMAT");

    private static final SubLSymbol $TM_SINGLE_ENTRY_LEXPRED = makeKeyword("TM-SINGLE-ENTRY-LEXPRED");

    private static final SubLSymbol $TM_BT_NOT_RT_INDIRECT = makeKeyword("TM-BT-NOT-RT-INDIRECT");

    private static final SubLSymbol $TM_NO_PT = makeKeyword("TM-NO-PT");

    private static final SubLSymbol $TM_PT_AND_UF = makeKeyword("TM-PT-AND-UF");

    private static final SubLSymbol $TM_NOT_BT_NOT_TOP = makeKeyword("TM-NOT-BT-NOT-TOP");

    static private final SubLSymbol $sym76$MT_ = makeSymbol("MT?");

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("REQUIRED"), $TEST, makeKeyword("MESSAGE"), makeKeyword("FIXER"), makeKeyword("USER-FIXER"), makeKeyword("NAME-AS-STRING"), makeKeyword("MODULE-DESCRIPTION"), makeKeyword("SHORT-DESCRIPTION") });

    static private final SubLString $str_alt78$_S_was_not_a_valid_integrity_modu = makeString("~S was not a valid integrity module parameter");

    private static final SubLSymbol $NAME_AS_STRING = makeKeyword("NAME-AS-STRING");

    static private final SubLString $str_alt80$_s = makeString("~s");



    static private final SubLString $str_alt82$_A = makeString("~A");

    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");







    private static final SubLSymbol TM_INTEGRITY_DEFAULT_MESSAGE = makeSymbol("TM-INTEGRITY-DEFAULT-MESSAGE");

    private static final SubLSymbol $FIXER = makeKeyword("FIXER");

    private static final SubLSymbol $USER_FIXER = makeKeyword("USER-FIXER");

    private static final SubLSymbol $MODULE_DESCRIPTION = makeKeyword("MODULE-DESCRIPTION");

    static private final SubLString $str_alt91$ = makeString("");

    private static final SubLSymbol $SHORT_DESCRIPTION = makeKeyword("SHORT-DESCRIPTION");

    static private final SubLString $str_alt93$Integrity_violation_due_to____S = makeString("Integrity violation due to : ~S");



    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    private static final SubLSymbol TM_ASSERT = makeSymbol("TM-ASSERT");



    public static final SubLObject $$tmStoplistWord = constant_handles.reader_make_constant_shell(makeString("tmStoplistWord"));



    public static final SubLObject $$topInThesaurus = constant_handles.reader_make_constant_shell(makeString("topInThesaurus"));

    static private final SubLString $str_alt102$_A_is_restricted_from_use_in_thes = makeString("~A is restricted from use in thesaurus ~A");

    static private final SubLString $str_alt103$Unable_to_print_violation__some_p = makeString("Unable to print violation; some predicate is restricted from use in some thesaurus.");

    public static final SubLObject $$tmRelationRestrictedFrom = constant_handles.reader_make_constant_shell(makeString("tmRelationRestrictedFrom"));

    private static final SubLSymbol $TM_RESTRICTED_RELATION = makeKeyword("TM-RESTRICTED-RELATION");

    private static final SubLSymbol $UNRESTRICT = makeKeyword("UNRESTRICT");

    static private final SubLList $list_alt107 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-RESTRICTED-RELATION-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-RESTRICTED-RELATION-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-RESTRICTED-RELATION-USER-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify assertions that use relations which \nare restricted from usgae in the thesaurus specified."), makeKeyword("SHORT-DESCRIPTION"), makeString("If a relation is restricted from being used in this thesaurus, do not allow its use here.") });



    static private final SubLString $str_alt109$___A___A___A___is_part_of_a_BT_cy = makeString("[`~A' ~A `~A'] is part of a BT cycle in ~A");

    static private final SubLString $str_alt110$Unable_to_print_violation__some_t = makeString("Unable to print violation; some terms were part of a BT cycle in some thesaurus.");

    public static final SubLSymbol $kw111$WHY_SUPERIOR_ = makeKeyword("WHY-SUPERIOR?");

    private static final SubLSymbol $TM_BT_CYCLE = makeKeyword("TM-BT-CYCLE");

    private static final SubLSymbol $REMOVE_ONE = makeKeyword("REMOVE-ONE");

    static private final SubLList $list_alt114 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-BT-CYCLE-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-BT-CYCLE-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-BT-CYCLE-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify loops or cycles in the chains made of Broader\nTerm/Narrower Term links.  Example of rule violation:\n\n              \"Tadpole\" BT \"Frog\"\n              \"Frog\" BT \"Amphibian\"\n              \"Amphibian\" BT \"Vertebrate\"\n              \"Vertebrate\" BT \"Tadpole\""), makeKeyword("SHORT-DESCRIPTION"), makeString("No BT/NT Cycles") });

    static private final SubLString $str_alt115$___A___A___A___is_a_redundant_BT_ = makeString("[`~A' ~A `~A'] is a redundant BT/NT relation in ~A");

    static private final SubLString $str_alt116$Unable_to_print_violation__some_p = makeString("Unable to print violation; some pair of terms had a redundant BT/NT relationship in some thesaurus.");

    static private final SubLString $str_alt117$Deleted__A = makeString("Deleted ~A");

    private static final SubLSymbol $TM_NT_REDUNDANT = makeKeyword("TM-NT-REDUNDANT");



    static private final SubLList $list_alt120 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-NT-REDUNDANT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-NT-REDUNDANT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-NT-REDUNDANT-USER-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule identifies redundant BT/NT Links.  If term A is a broader\nterm of B, and B is a broader term of C, then term A should not be a\nbroader term of C. Example of rule violation:\n\n              \"Frog\" BT \"Amphibian\" \"Amphibian\" BT \"Vertebrate\" \"Frog\" BT \"Vertebrate\""), makeKeyword("SHORT-DESCRIPTION"), makeString("No redundant BT/NT links") });

    static private final SubLString $str_alt121$__A__cannot_be_related_to_itself_ = makeString("`~A' cannot be related to itself via ~A");

    static private final SubLString $str_alt122$Unable_to_print_violation__Some_t = makeString("Unable to print violation; Some term was related to itself via an irreflexive relation.");

    private static final SubLSymbol $TM_IRREFLEXIVE = makeKeyword("TM-IRREFLEXIVE");

    static private final SubLList $list_alt124 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-IRREFLEXIVE-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-IRREFLEXIVE-MESSAGE"), makeKeyword("FIXER"), makeSymbol("TM-INTEGRITY-IRREFLEXIVE-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify self-loops when prohibited. \n         Example of rule violation:\n\n              \"Kumquat\" RT \"Kumquat\""), makeKeyword("SHORT-DESCRIPTION"), makeString("No term is related to itself (by any irreflexive relations).") });

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    static private final SubLString $str_alt126$___A__UF__S_ = makeString("[`~A' UF ~S]");

    private static final SubLSymbol EXPRESS_AS_UF = makeSymbol("EXPRESS-AS-UF");

    static private final SubLString $str_alt128$__ = makeString(", ");

    static private final SubLString $str_alt129$_and_ = makeString(" and ");

    static private final SubLString $str_alt130$__A__is_a_preferred_term_in__A__s = makeString("`~A' is a preferred term in ~A, so the following can't also hold: ~A");

    static private final SubLString $str_alt131$Unable_to_print_violation__Some_t = makeString("Unable to print violation; Some term was both a PT and a UF in some thesaurus.");

    private static final SubLSymbol $TM_DISJOINT_PT_UF = makeKeyword("TM-DISJOINT-PT-UF");

    private static final SubLSymbol $DELETE_ALL_TERMS = makeKeyword("DELETE-ALL-TERMS");



    static private final SubLList $list_alt135 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-DISJOINT-PT-UF-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-DISJOINT-PT-UF-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-DISJOINT-PT-UF-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify strings used both as preferred terms and as\n\"UseFor\" terms.  Example of rule violation:\n\n              \"Garbanzo\" BT \"Legume\"\n              \"Chickpea\" UF \"Garbanzo\""), makeKeyword("SHORT-DESCRIPTION"), makeString("No term can be both a preferred term and an alternative \"Use For\" term within a thesaurus.") });

    static private final SubLString $str_alt136$__A__is_in__A_more_than_once_as_a = makeString("`~A' is in ~A more than once as a preferred term!");

    static private final SubLString $str_alt137$Unable_to_print_violation__Some_s = makeString("Unable to print violation; Some string appeared more than once as a PT in the same thesaurus.");

    private static final SubLSymbol $TM_UNIQUE_PT = makeKeyword("TM-UNIQUE-PT");

    private static final SubLSymbol $RETAIN_ONE_TERM = makeKeyword("RETAIN-ONE-TERM");

    private static final SubLSymbol $MERGE_ALL = makeKeyword("MERGE-ALL");

    private static final SubLSymbol $RETAIN_ONE = makeKeyword("RETAIN-ONE");

    static private final SubLList $list_alt142 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-UNIQUE-PT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-UNIQUE-PT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-UNIQUE-PT-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify distinct concepts that share a common\npreferred term.  Example of rule violation:\n\n              A preferred term \"Bank\" representing the two underlying Cyc concepts Riverbank and\n              BankCompany."), makeKeyword("SHORT-DESCRIPTION"), makeString("No two underlying concepts can have the same preferred term.") });

    static private final SubLString $str_alt143$__A__is_in__A_more_than_once_as_a = makeString("`~A' is in ~A more than once as a use for!");

    static private final SubLString $str_alt144$Unable_to_print_violation__Some_s = makeString("Unable to print violation; Some string appeared in some thesaurus more than once as a UF.");





    private static final SubLSymbol $TM_UNIQUE_UF = makeKeyword("TM-UNIQUE-UF");

    static private final SubLList $list_alt148 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-UNIQUE-UF-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-UNIQUE-UF-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-UNIQUE-UF-USER-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify distinct concepts that share a common \n\"Use For\" string.  Example of rule violation:\n\n              \"Buckshot\" UF \"Shot\"\n              \"Injection\" UF \"Shot\""), makeKeyword("SHORT-DESCRIPTION"), makeString("No two distinct preferred terms can have the same alternative, or \"Use For\", term.") });

    static private final SubLString $str_alt149$__A__is_a_top_term__yet_has_BTs_i = makeString("`~A' is a top term, yet has BTs in ~A");

    static private final SubLString $str_alt150$Unable_to_print_violation__Some_t = makeString("Unable to print violation; Some term was a top term in some thesaurus but had BTs there.");

    static private final SubLString $str_alt151$Demoted___a__from_top_term_status = makeString("Demoted `~a' from top term status in ~A.");

    private static final SubLSymbol $TM_TOP_NOT_BT = makeKeyword("TM-TOP-NOT-BT");

    static private final SubLList $list_alt153 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-TOP-NOT-BT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-TOP-NOT-BT-MESSAGE"), makeKeyword("FIXER"), makeSymbol("TM-INTEGRITY-TOP-NOT-BT-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify purported top concepts that have broader\nterms.  Example of rule violation:\n\n              A term \"Thing\" declared to be a top, but with: \"Thing\" BT \"Entity\"."), makeKeyword("SHORT-DESCRIPTION"), makeString("A \"top\" term must have no broader terms (BTs).") });

    static private final SubLString $str_alt154$stoplist_word___A__is_a_Use_For_o = makeString("stoplist word `~A' is a Use-For or Preferred Term in ~A");

    static private final SubLString $str_alt155$Unable_to_print_violation__Some_s = makeString("Unable to print violation; Some stoplist word was in some thesaurus as a UF or PT.");

    private static final SubLSymbol $TM_UF_OR_PT_STOPLIST = makeKeyword("TM-UF-OR-PT-STOPLIST");

    private static final SubLSymbol $REMOVE_STOPLIST_WORD = makeKeyword("REMOVE-STOPLIST-WORD");

    private static final SubLSymbol $RENAME_TERM = makeKeyword("RENAME-TERM");

    private static final SubLSymbol $SPLICE_OUT_TERM = makeKeyword("SPLICE-OUT-TERM");

    static private final SubLList $list_alt160 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-UF-OR-PT-STOPLIST-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-UF-OR-PT-STOPLIST-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-UF-OR-PT-STOPLIST-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify concepts which have a stoplist word as a\npreferred term or a \"Use For\" term.  Example of rule violation:\n\n              \"Of\" as a preferred term, when \"of\" is on the stoplist."), makeKeyword("SHORT-DESCRIPTION"), makeString("A word on the stoplist cannot be either a preferred term or an alternative, \"Use For\" term.") });



    static private final SubLList $list_alt162 = list(makeSymbol("ASSERTION"), makeSymbol("CONCEPT"));

    static private final SubLString $str_alt163$The_concept__A_has_no_preferred_t = makeString("The concept ~A has no preferred term in ~A, yet is a top term in ~A.");

    static private final SubLString $str_alt164$The_concept__A_has_no_preferred_t = makeString("The concept ~A has no preferred term in ~A, yet is related to `~A' by ~A.");

    static private final SubLString $str_alt165$Unable_to_print_violation__Some_c = makeString("Unable to print violation; Some concept had no preferred term in some thesaurus, yet was mentioned there.");

    static private final SubLList $list_alt166 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("ASSERTION"), $TEST, makeSymbol("TM-INTEGRITY-NO-PT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-NO-PT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-NO-PT-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify thesaurus assertions involving concepts\nwhich are not actually in that thesaurus. Links (relations) to\nnon-existent preferred terms will be flagged as errors.  Example of\nrule violation:\n\n              A link to the term \"Apocynacea\", where no preferred term \"Apocynacea\" is actually in the\n              thesaurus.\n              If a BT relation were claimed to this term, an error message reporting this would be:\n              \"Error: not a term in the active thesauri: BT Apocynacea\""), makeKeyword("SHORT-DESCRIPTION"), makeString("Every term, string and relation in a thesaurus must be linked to a known preferred term.") });





    static private final SubLList $list_alt169 = list(makeSymbol("ARG"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt170$__A__can_be_related_to_at_most_on = makeString("`~A' can be related to at most one item via ~A but is related to each of ~A");

    static private final SubLString $str_alt171$Unable_to_print_violation__some_t = makeString("Unable to print violation; some thesaurus fact violated a cardinality constraint on some relation.");



    static private final SubLList $list_alt173 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("PREDICATE"), $TEST, makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-FORMAT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-FORMAT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-FORMAT-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify multiple related terms for the any non-lexical relation\nwhen prohibited.  Example of rule violation:\n\n              \"John Anderson\" SOC-SEC-NUMBER \"405-66-8034\"\n              \"John Anderson\" SOC-SEC-NUMBER \"555-00-1212\"\n              while the SOC-SEC-NUMBER relation is defined as one-to-one. \n              or: \n              \"Ranitidine\" USE \"Zantac\"\n              \"Ranitidine\" USE \"Ranitidine Hydrochloride\"\n              while the relation \"USE\" (meaning use preferred term) is defined as many-to-one."), makeKeyword("SHORT-DESCRIPTION"), makeString("If a non-lexical relation is one-to-one, one-to-many, or many-to-one, only one term is allowed to be related by that relation.") });

    static private final SubLString $str_alt174$Unable_to_print_violation__some_t = makeString("Unable to print violation; some thesaurus fact violated a cardinality constraint on a lexical relation.");

    static private final SubLList $list_alt175 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("PREDICATE"), $TEST, makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-SINGLE-ENTRY-LEXPRED-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify multiple related terms for any lexical relation\nwhen prohibited.  Example of rule violation:\n\n              \"antiulcer agent\" LEXPRED \"anti-ulcer agent\"\n              \"gastrointestinal agent\" LEXPRED \"anti-ulcer agent\"\n              while the relation \"LEXPRED\"  is defined as many-to-one.\n              or: \n              \"anti-ulcer agent\" LEXPRED2 \"antiulcer agent\"\n              \"anti-ulcer agent\" LEXPRED2 \"gastrointestinal agent\"\n              while the relation \"LEXPRED2\"  is defined as one-to-many."), makeKeyword("SHORT-DESCRIPTION"), makeString("If a lexical relation is one-to-one, one-to-many, or many-to-one, only one term is allowed to be related by that relation.") });

    static private final SubLString $str_alt176$The_concept_underlying___A__can_b = makeString("The concept underlying `~A' can be used for at most one preferred term within a thesuarus, but in ~A it is used for each of ~A");

    private static final SubLSymbol TM_SINGLE_QUOTE = makeSymbol("TM-SINGLE-QUOTE");

    static private final SubLString $str_alt178$Unable_to_print_violation__Some_c = makeString("Unable to print violation; Some concept has multiple PTs in some thesaurus.");

    private static final SubLSymbol $TM_MULTIPLE_PT = makeKeyword("TM-MULTIPLE-PT");

    static private final SubLList $list_alt180 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("PREDICATE"), $TEST, makeSymbol("TM-MULTIPLE-PT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-MULTIPLE-PT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-MULTIPLE-PT-USER-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify multiple preferred term strings for a given\n  thesaurus concept.  Example of rule violation:\n\n              The concept (in the Cyc system) of a Sofa-PieceOfFurniture represented by two different\n              preferred terms \"Sofa\" and \"Couch\"."), makeKeyword("SHORT-DESCRIPTION"), makeString("An underlying concept may have only one preferred term, no more.") });

    public static final SubLObject $$relatedTerm = constant_handles.reader_make_constant_shell(makeString("relatedTerm"));



    static private final SubLString $str_alt183$___A__BT___A___and____A__RT___A__ = makeString("[`~A' BT `~A'] and [`~A' RT `~A'] are both true in ~A");

    static private final SubLString $str_alt184$Unable_to_print_violation__Some_p = makeString("Unable to print violation; Some pair of terms were related by both BT and RT in some thesaurus.");

    private static final SubLSymbol $TM_BT_NOT_RT = makeKeyword("TM-BT-NOT-RT");

    static private final SubLList $list_alt186 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("PREDICATE"), $TEST, makeSymbol("TM-INTEGRITY-BT-NOT-RT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-BT-NOT-RT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-BT-NOT-RT-USER-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify pairs of concepts related by both Broader Term\nand Related Term.  Example of rule violation:\n\n              \"Paris\" BT \"France\" \n              \"Paris\" RT \"France\""), makeKeyword("SHORT-DESCRIPTION"), makeString("A term may not be related by BT and RT to the same term.") });

    static private final SubLList $list_alt187 = list(makeSymbol("ASSERTION"), makeSymbol("PIVOT-TERM"), makeSymbol("LINKING-PRED"), makeSymbol("INDIRECT-TERM"));

    static private final SubLString $str_alt188$_a_cannot_be_related_both_to__a_b = makeString("~a cannot be related both to ~a by ~a and to ~a by ~a (since ~a is also related to ~a by ~a) in ~a");

    static private final SubLString $str_alt189$Unable_to_print_violation_ = makeString("Unable to print violation.");

    static private final SubLList $list_alt190 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("PREDICATE"), $TEST, makeSymbol("TM-INTEGRITY-BT-NOT-RT-INDIRECT-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-BT-NOT-RT-INDIRECT-MESSAGE"), makeKeyword("USER-FIXER"), makeSymbol("TM-INTEGRITY-BT-NOT-RT-INDIRECT-USER-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify pairs of concepts that are related by Broader\nTerm/Narrower Term and are both related by Related Term to a common\nthird term. (No RT-BT-RT triangles.)  Example of rule violation:\n\n              \"US Private First Class\" BT \"US Soldier\"\n              \"US Private First Class\" RT \"US Army\"\n              \"US Soldier\" RT \"US Army\""), makeKeyword("SHORT-DESCRIPTION"), makeString("A term and its BT cannot both have RT relations to the same term.") });

    private static final SubLSymbol SIGNP = makeSymbol("SIGNP");

    static private final SubLString $str_alt192$_S_is_both_a_PT_and_a_UF_in__A = makeString("~S is both a PT and a UF in ~A");

    static private final SubLString $str_alt193$Unable_to_print_violation__some_s = makeString("Unable to print violation; some string was both a PT and a UF in some thesaurus.");

    static private final SubLString $str_alt194$Deleted__a = makeString("Deleted ~a");

    static private final SubLList $list_alt195 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("CONCEPT"), $TEST, makeSymbol("TM-INTEGRITY-PT-AND-UF-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-PT-AND-UF-MESSAGE"), makeKeyword("FIXER"), makeSymbol("TM-INTEGRITY-PT-AND-UF-FIXER"), makeKeyword("REQUIRED"), T, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify concepts which have a given string as both a\npreferred term and a \"Use For\" term.  Example of rule violation:\n\n              A preferred term \"Screening\" (meaning window screen) along with \"Screening\" as an alternative\n              \"Use For\" term for the preferred term \"Testing\"."), makeKeyword("SHORT-DESCRIPTION"), makeString("No concept can have the same string as a preferred term and an alternative \"Use For\" term.") });

    static private final SubLList $list_alt196 = list(makeSymbol("CONSTANT"), makeSymbol("THESAURUS"));

    static private final SubLString $str_alt197$__A__has_no_BTs__but_is_not_known = makeString("`~A' has no BTs, but is not known to be a top term in ~A");

    static private final SubLString $str_alt198$Unable_to_print_violation__Some_t = makeString("Unable to print violation; Some term had no BTs in some thesaurus, yet was not known to be a top term there.");

    static private final SubLString $str_alt199$Made___A__a_top_term_in__A = makeString("Made `~A' a top term in ~A");

    static private final SubLList $list_alt200 = list(new SubLObject[]{ makeKeyword("LEVEL"), makeKeyword("CONCEPT"), $TEST, makeSymbol("TM-INTEGRITY-NOT-BT-NOT-TOP-TEST"), makeKeyword("MESSAGE"), makeSymbol("TM-INTEGRITY-NOT-BT-NOT-TOP-MESSAGE"), makeKeyword("FIXER"), makeSymbol("TM-INTEGRITY-NOT-BT-NOT-TOP-FIXER"), makeKeyword("REQUIRED"), NIL, makeKeyword("MODULE-DESCRIPTION"), makeString("This rule will identify concepts that have no Broader Terms but are\nnot \"tops\". (I.e., No orphans.)  Example of rule violation:\n\n              A non-\"top\" term, \"Levodopa Syrup Product\" with no BTs."), makeKeyword("SHORT-DESCRIPTION"), makeString("If a term has no BT, it must be a \"top\".") });

    static private final SubLString $str_alt201$Unknown_fix_type__A = makeString("Unknown fix type ~A");

    private static final SubLSymbol TM_DIAGNOSE_ONE_ASSERTION = makeSymbol("TM-DIAGNOSE-ONE-ASSERTION");

    private static final SubLSymbol TM_DIAGNOSE_ONE_SIGN = makeSymbol("TM-DIAGNOSE-ONE-SIGN");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt205$_a_is_not_authorized_to_perform_t = makeString("~a is not authorized to perform this type of integrity check.");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");



    static private final SubLString $$$Integrity_Searches_Lock = makeString("Integrity Searches Lock");

    static private final SubLString $str_alt209$Lock_for_Variable_Storing_Relatio = makeString("Lock for Variable Storing Relation Integrity Searches");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLSymbol $sym211$THESAURUS_PREDICATE_ = makeSymbol("THESAURUS-PREDICATE?");









    static private final SubLSymbol $sym216$INTEGRITY_CHECK_IN_PROGRESS_ACCORDING_TO_STATE_ = makeSymbol("INTEGRITY-CHECK-IN-PROGRESS-ACCORDING-TO-STATE?");

    static private final SubLSymbol $sym217$INTEGRITY_CHECK_NEEDED_ACCORDING_TO_STATE_ = makeSymbol("INTEGRITY-CHECK-NEEDED-ACCORDING-TO-STATE?");





    static private final SubLString $str_alt220$Unknown_type__a_of_value = makeString("Unknown type ~a of value");

    static private final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLSymbol TM_CLEAR_INTEGRITY_SEARCH = makeSymbol("TM-CLEAR-INTEGRITY-SEARCH");

    static private final SubLString $$$Unknown_Type = makeString("Unknown Type");

    static private final SubLSymbol $sym224$THESAURUS_ = makeSymbol("THESAURUS?");





    private static final SubLSymbol TM_INTEGRITY_INIT_HASH_ASSERTION = makeSymbol("TM-INTEGRITY-INIT-HASH-ASSERTION");

    private static final SubLSymbol SEARCH_STRUC_P = makeSymbol("SEARCH-STRUC-P");

    private static final SubLSymbol TM_INTEGRITY_DEAD_END_NODE = makeSymbol("TM-INTEGRITY-DEAD-END-NODE");

    private static final SubLSymbol TM_INTEGRITY_RECLAIM_SEARCH_NODE = makeSymbol("TM-INTEGRITY-RECLAIM-SEARCH-NODE");



    private static final SubLSymbol TM_INTEGRITY_NO_LEAVES_P = makeSymbol("TM-INTEGRITY-NO-LEAVES-P");

    private static final SubLSymbol TM_INTEGRITY_NEXT_NODE = makeSymbol("TM-INTEGRITY-NEXT-NODE");

    private static final SubLSymbol TM_INTEGRITY_GOAL_P = makeSymbol("TM-INTEGRITY-GOAL-P");

    private static final SubLSymbol TM_INTEGRITY_ADD_GOAL = makeSymbol("TM-INTEGRITY-ADD-GOAL");

    private static final SubLSymbol TM_INTEGRITY_OPTIONS = makeSymbol("TM-INTEGRITY-OPTIONS");

    private static final SubLSymbol TM_INTEGRITY_EXPAND = makeSymbol("TM-INTEGRITY-EXPAND");

    private static final SubLSymbol TM_INTEGRITY_ADD_NODE = makeSymbol("TM-INTEGRITY-ADD-NODE");

    private static final SubLSymbol TM_INTEGRITY_TOO_DEEP_P = makeSymbol("TM-INTEGRITY-TOO-DEEP-P");

    static private final SubLList $list_alt240 = list(makeKeyword("INTEGRITY-CHECK"), makeKeyword("CDR"));

    private static final SubLSymbol $INTEGRITY_CHECK = makeKeyword("INTEGRITY-CHECK");



    static private final SubLList $list_alt243 = list(makeSymbol("THESAURUS"), makeSymbol("TOTAL-COUNT"), makeSymbol("SEEN"));

    private static final SubLSymbol NEW_SEARCH_NODE = makeSymbol("NEW-SEARCH-NODE");

    static private final SubLString $str_alt245$So_don_t = makeString("So don't");

    static private final SubLString $str_alt246$Cannot_reclaim_strange_node__S = makeString("Cannot reclaim strange node ~S");





    private static final SubLSymbol TM_INTEGRITY_INIT_DEAD_END_NODE = makeSymbol("TM-INTEGRITY-INIT-DEAD-END-NODE");

    private static final SubLSymbol TM_INTEGRITY_INIT_RECLAIM_SEARCH_NODE = makeSymbol("TM-INTEGRITY-INIT-RECLAIM-SEARCH-NODE");

    static private final SubLList $list_alt251 = list(makeSymbol("THESAURUS"), makeSymbol("TABLE"));

    private static final SubLSymbol TM_INTEGRITY_INIT_NO_LEAVES_P = makeSymbol("TM-INTEGRITY-INIT-NO-LEAVES-P");

    private static final SubLSymbol TM_INTEGRITY_INIT_NEXT_NODE = makeSymbol("TM-INTEGRITY-INIT-NEXT-NODE");

    private static final SubLSymbol TM_INTEGRITY_INIT_GOAL_P = makeSymbol("TM-INTEGRITY-INIT-GOAL-P");

    private static final SubLSymbol TM_INTEGRITY_INIT_ADD_GOAL = makeSymbol("TM-INTEGRITY-INIT-ADD-GOAL");

    private static final SubLSymbol TM_INTEGRITY_INIT_OPTIONS = makeSymbol("TM-INTEGRITY-INIT-OPTIONS");

    private static final SubLSymbol TM_INTEGRITY_INIT_EXPAND = makeSymbol("TM-INTEGRITY-INIT-EXPAND");

    private static final SubLSymbol TM_INTEGRITY_INIT_ADD_NODE = makeSymbol("TM-INTEGRITY-INIT-ADD-NODE");

    private static final SubLSymbol TM_INTEGRITY_INIT_TOO_DEEP_P = makeSymbol("TM-INTEGRITY-INIT-TOO-DEEP-P");



    static private final SubLList $list_alt261 = list(makeKeyword("ASSERTIONS"), makeKeyword("NT"));





    private static final SubLSymbol TM_NOTE_INTEGRITY_INIT_ASSERTION = makeSymbol("TM-NOTE-INTEGRITY-INIT-ASSERTION");

    static private final SubLString $str_alt265$The_user_ID___A__is_not_a_known_u = makeString("The user ID, ~A, is not a known user.");

    static private final SubLString $str_alt266$The_name__A_doesn_t_refer_to_a_kn = makeString("The name ~A doesn't refer to a known thesaurus.");

    static private final SubLString $str_alt267$There_were_no_integrity_violation = makeString("There were no integrity violations in ~A");



    static private final SubLString $str_alt269$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt270$Violations_are_in__A = makeString("Violations are in ~A");

    static private final SubLString $str_alt271$The_name__A_doesn_t_refer_to_a_kn = makeString("The name ~A doesn't refer to a known thesaurus relation.");

    static private final SubLString $str_alt272$_A_uses_of__A_A_were_removed_from = makeString("~A uses of ~A~A were removed from ~A.  ~A uses could not be removed.");

    static private final SubLString $str_alt273$_and_of_its_inverse___A = makeString(" and of its inverse, ~A");

    // // Initializers
    public void declareFunctions() {
        declare_tm_integrity_file();
    }

    public void initializeVariables() {
        init_tm_integrity_file();
    }

    public void runTopLevelForms() {
        setup_tm_integrity_file();
    }
}


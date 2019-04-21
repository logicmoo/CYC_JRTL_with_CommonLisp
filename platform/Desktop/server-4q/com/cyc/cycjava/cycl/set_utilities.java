package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class set_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.set_utilities";
    public static final String myFingerPrint = "b192466ff655771fc9f9edd0f26129a63a1cd68173b7b2fb4eb2e1b1a29e03ba";
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 734L)
    public static SubLSymbol $empty_set$;
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLSymbol $dtp_sliding_window$;
    private static final SubLSymbol $sym0$_EMPTY_SET_;
    private static final SubLSymbol $sym1$SET_P;
    private static final SubLSymbol $sym2$LISTP;
    private static final SubLSymbol $sym3$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym4$SET_SIZE;
    private static final SubLSymbol $sym5$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym6$SET_CONTENTS_P;
    private static final SubLSymbol $sym7$SET_CONTENTS_SIZE;
    private static final SubLSymbol $sym8$_;
    private static final SubLSymbol $sym9$SET_TEST;
    private static final SubLSymbol $sym10$MAKE_SET_FROM_LIST;
    private static final SubLList $list11;
    private static final SubLString $str12$_A__;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw16$DONE;
    private static final SubLSymbol $sym17$CLET;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$DO_SET;
    private static final SubLSymbol $sym20$CINC;
    private static final SubLSymbol $sym21$SLIDING_WINDOW;
    private static final SubLSymbol $sym22$SLIDING_WINDOW_P;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$SLDWND_WINDOW;
    private static final SubLSymbol $sym31$_CSETF_SLDWND_WINDOW;
    private static final SubLSymbol $sym32$SLDWND_SET_A;
    private static final SubLSymbol $sym33$_CSETF_SLDWND_SET_A;
    private static final SubLSymbol $sym34$SLDWND_SET_B;
    private static final SubLSymbol $sym35$_CSETF_SLDWND_SET_B;
    private static final SubLSymbol $sym36$SLDWND_WINDOW_A;
    private static final SubLSymbol $sym37$_CSETF_SLDWND_WINDOW_A;
    private static final SubLSymbol $sym38$SLDWND_WINDOW_B;
    private static final SubLSymbol $sym39$_CSETF_SLDWND_WINDOW_B;
    private static final SubLSymbol $kw40$WINDOW;
    private static final SubLSymbol $kw41$SET_A;
    private static final SubLSymbol $kw42$SET_B;
    private static final SubLSymbol $kw43$WINDOW_A;
    private static final SubLSymbol $kw44$WINDOW_B;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_SLIDING_WINDOW;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD;
    private static final SubLSymbol $sym51$TEST_SLIDING_WINDOWS;
    private static final SubLSymbol $kw52$TEST;
    private static final SubLSymbol $kw53$OWNER;
    private static final SubLSymbol $kw54$CLASSES;
    private static final SubLSymbol $kw55$KB;
    private static final SubLSymbol $kw56$TINY;
    private static final SubLSymbol $kw57$WORKING_;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$SUCCESS;
    private static final SubLString $str60$Set__A_is_not_co_extensional_with;
    private static final SubLSymbol $kw61$FAILURE;
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 783L)
    public static SubLObject set_arbitrary_element(final SubLObject v_set) {
        SubLObject result = (SubLObject)set_utilities.NIL;
        SubLObject foundP = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == foundP && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                result = element;
                foundP = (SubLObject)set_utilities.T;
            }
        }
        return Values.values(result, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1021L)
    public static SubLObject set_arbitrary_element_without_values(final SubLObject v_set, SubLObject v_default) {
        if (v_default == set_utilities.UNPROVIDED) {
            v_default = (SubLObject)set_utilities.NIL;
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                return element;
            }
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1232L)
    public static SubLObject set_contents_arbitrary_element(final SubLObject v_set_contents) {
        SubLObject result = (SubLObject)set_utilities.NIL;
        SubLObject foundP;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (foundP = (SubLObject)set_utilities.NIL, basis_object = set_contents.do_set_contents_basis_object(v_set_contents), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, v_set_contents); set_utilities.NIL == foundP && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                result = element;
                foundP = (SubLObject)set_utilities.T;
            }
        }
        return Values.values(result, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1515L)
    public static SubLObject set_contents_arbitrary_element_without_values(final SubLObject v_set_contents, SubLObject v_default) {
        if (v_default == set_utilities.UNPROVIDED) {
            v_default = (SubLObject)set_utilities.NIL;
        }
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(v_set_contents), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, v_set_contents); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                return element;
            }
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1771L)
    public static SubLObject set_remove_random_element(final SubLObject v_set) {
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        final SubLObject element = set.set_random_element(v_set);
        set.set_remove(element, v_set);
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 2148L)
    public static SubLObject set_union(final SubLObject sets, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = (SubLObject)set_utilities.NIL;
        }
        assert set_utilities.NIL != Types.listp(sets) : sets;
        if (set_utilities.NIL == test) {
            test = default_test_function_for_sets(sets);
        }
        assert set_utilities.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        if (set_utilities.NIL != list_utilities.find_if_not((SubLObject)set_utilities.$sym1$SET_P, sets, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED)) {
            return (SubLObject)set_utilities.NIL;
        }
        if (set_utilities.NIL == sets) {
            return set.new_set(test, (SubLObject)set_utilities.UNPROVIDED);
        }
        final SubLObject size = number_utilities.maximum(Mapping.mapcar((SubLObject)set_utilities.$sym4$SET_SIZE, sets), (SubLObject)set_utilities.UNPROVIDED);
        final SubLObject result = set.new_set(test, size);
        SubLObject cdolist_list_var = sets;
        SubLObject v_set = (SubLObject)set_utilities.NIL;
        v_set = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject elem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                elem = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                    set.set_add(elem, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 2767L)
    public static SubLObject set_contents_union(final SubLObject set_contents_list, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        assert set_utilities.NIL != list_utilities.non_dotted_list_p(set_contents_list) : set_contents_list;
        SubLObject cdolist_list_var = set_contents_list;
        SubLObject elem = (SubLObject)set_utilities.NIL;
        elem = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            assert set_utilities.NIL != set_contents.set_contents_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (set_utilities.NIL == set_contents_list) {
            return set_contents.new_set_contents((SubLObject)set_utilities.ZERO_INTEGER, test);
        }
        if (set_utilities.NIL != list_utilities.singletonP(set_contents_list)) {
            return set_contents.copy_set_contents(set_contents_list.first());
        }
        final SubLObject size = number_utilities.maximum(Mapping.mapcar((SubLObject)set_utilities.$sym7$SET_CONTENTS_SIZE, set_contents_list), (SubLObject)set_utilities.UNPROVIDED);
        SubLObject union = set_contents.new_set_contents(size, test);
        SubLObject cdolist_list_var2 = set_contents_list;
        SubLObject v_set_contents = (SubLObject)set_utilities.NIL;
        v_set_contents = cdolist_list_var2.first();
        while (set_utilities.NIL != cdolist_list_var2) {
            final SubLObject set_contents_var = v_set_contents;
            SubLObject basis_object;
            SubLObject state;
            SubLObject element;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                element = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                    union = set_contents.set_contents_add(element, union, (SubLObject)set_utilities.UNPROVIDED);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_set_contents = cdolist_list_var2.first();
        }
        return union;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 3345L)
    public static SubLObject set_intersection(final SubLObject sets, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = (SubLObject)set_utilities.NIL;
        }
        assert set_utilities.NIL != Types.listp(sets) : sets;
        if (set_utilities.NIL == test) {
            test = default_test_function_for_sets(sets);
        }
        assert set_utilities.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        if (set_utilities.NIL != list_utilities.find_if_not((SubLObject)set_utilities.$sym1$SET_P, sets, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED)) {
            return (SubLObject)set_utilities.NIL;
        }
        if (set_utilities.NIL == sets) {
            return set.new_set(test, (SubLObject)set_utilities.UNPROVIDED);
        }
        final SubLObject smallest_set = list_utilities.extremal(sets, Symbols.symbol_function((SubLObject)set_utilities.$sym8$_), (SubLObject)set_utilities.$sym4$SET_SIZE);
        final SubLObject size = set.set_size(smallest_set);
        final SubLObject result = set.new_set(test, size);
        final SubLObject set_contents_var = set.do_set_internal(smallest_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        SubLObject not_in_intersectionP;
        SubLObject csome_list_var;
        SubLObject v_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                not_in_intersectionP = (SubLObject)set_utilities.NIL;
                if (set_utilities.NIL == not_in_intersectionP) {
                    csome_list_var = sets;
                    v_set = (SubLObject)set_utilities.NIL;
                    v_set = csome_list_var.first();
                    while (set_utilities.NIL == not_in_intersectionP && set_utilities.NIL != csome_list_var) {
                        if (!v_set.eql(smallest_set) && set_utilities.NIL == set.set_memberP(elem, v_set)) {
                            not_in_intersectionP = (SubLObject)set_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_set = csome_list_var.first();
                    }
                }
                if (set_utilities.NIL == not_in_intersectionP) {
                    set.set_add(elem, result);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 4230L)
    public static SubLObject set_contents_intersection(final SubLObject set_contents_list, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        assert set_utilities.NIL != list_utilities.non_dotted_list_p(set_contents_list) : set_contents_list;
        SubLObject cdolist_list_var = set_contents_list;
        SubLObject elem = (SubLObject)set_utilities.NIL;
        elem = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            assert set_utilities.NIL != set_contents.set_contents_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (set_utilities.NIL == set_contents_list) {
            return set_contents.new_set_contents((SubLObject)set_utilities.ZERO_INTEGER, test);
        }
        if (set_utilities.NIL != list_utilities.singletonP(set_contents_list)) {
            return set_contents.copy_set_contents(set_contents_list.first());
        }
        SubLObject intersection = set_contents.new_set_contents((SubLObject)set_utilities.ZERO_INTEGER, test);
        if (set_utilities.NIL != set_contents_list) {
            final SubLObject set_contents_var;
            final SubLObject smallest = set_contents_var = list_utilities.extremal(set_contents_list, Symbols.symbol_function((SubLObject)set_utilities.$sym8$_), (SubLObject)set_utilities.$sym7$SET_CONTENTS_SIZE);
            SubLObject basis_object;
            SubLObject state;
            SubLObject element;
            SubLObject not_in_intersectionP;
            SubLObject csome_list_var;
            SubLObject v_set_contents;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                element = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                    not_in_intersectionP = (SubLObject)set_utilities.NIL;
                    if (set_utilities.NIL == not_in_intersectionP) {
                        csome_list_var = set_contents_list;
                        v_set_contents = (SubLObject)set_utilities.NIL;
                        v_set_contents = csome_list_var.first();
                        while (set_utilities.NIL == not_in_intersectionP && set_utilities.NIL != csome_list_var) {
                            if (!v_set_contents.eql(smallest) && set_utilities.NIL == set_contents.set_contents_memberP(element, v_set_contents, test)) {
                                not_in_intersectionP = (SubLObject)set_utilities.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            v_set_contents = csome_list_var.first();
                        }
                    }
                    if (set_utilities.NIL == not_in_intersectionP) {
                        intersection = set_contents.set_contents_add(element, intersection, test);
                    }
                }
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5118L)
    public static SubLObject sets_intersectP(final SubLObject sets) {
        assert set_utilities.NIL != Types.listp(sets) : sets;
        if (set_utilities.NIL == sets) {
            return (SubLObject)set_utilities.NIL;
        }
        final SubLObject smallest_set = list_utilities.extremal(sets, Symbols.symbol_function((SubLObject)set_utilities.$sym8$_), (SubLObject)set_utilities.$sym4$SET_SIZE);
        final SubLObject set_contents_var = set.do_set_internal(smallest_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        SubLObject cdolist_list_var;
        SubLObject v_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                cdolist_list_var = sets;
                v_set = (SubLObject)set_utilities.NIL;
                v_set = cdolist_list_var.first();
                while (set_utilities.NIL != cdolist_list_var) {
                    if (!v_set.eql(smallest_set) && set_utilities.NIL != set.set_memberP(elem, v_set)) {
                        return (SubLObject)set_utilities.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_set = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)set_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5512L)
    public static SubLObject set_intersection_fraction(final SubLObject set1, final SubLObject set2) {
        final SubLObject smaller_set = set.set_size(set1).numLE(set.set_size(set2)) ? set1 : set2;
        final SubLObject larger_set = set.set_size(set1).numLE(set.set_size(set2)) ? set2 : set1;
        final SubLObject total = set.set_size(smaller_set);
        SubLObject common = (SubLObject)set_utilities.ZERO_INTEGER;
        if (total.numE((SubLObject)set_utilities.ZERO_INTEGER)) {
            return (SubLObject)set_utilities.ZERO_INTEGER;
        }
        final SubLObject set_contents_var = set.do_set_internal(smaller_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL != set.set_memberP(element, larger_set)) {
                common = Numbers.add(common, (SubLObject)set_utilities.ONE_INTEGER);
            }
        }
        return Numbers.divide(common, total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5985L)
    public static SubLObject sets_intersect_by(final SubLObject set1, final SubLObject set2, final SubLObject amount) {
        if (set.set_size(set1).numL(amount)) {
            return (SubLObject)set_utilities.NIL;
        }
        if (set.set_size(set2).numL(amount)) {
            return (SubLObject)set_utilities.NIL;
        }
        final SubLObject smaller_set = set.set_size(set1).numLE(set.set_size(set2)) ? set1 : set2;
        final SubLObject larger_set = set.set_size(set1).numLE(set.set_size(set2)) ? set2 : set1;
        SubLObject match_count = amount;
        final SubLObject set_contents_var = set.do_set_internal(smaller_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL != set.set_memberP(element, larger_set)) {
                match_count = Numbers.subtract(match_count, (SubLObject)set_utilities.ONE_INTEGER);
                if (match_count.isZero()) {
                    return (SubLObject)set_utilities.T;
                }
            }
        }
        return (SubLObject)set_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 6691L)
    public static SubLObject set_minus(final SubLObject set1, final SubLObject set2, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = (SubLObject)set_utilities.NIL;
        }
        assert set_utilities.NIL != set.set_p(set1) : set1;
        assert set_utilities.NIL != set.set_p(set2) : set2;
        if (set_utilities.NIL == test) {
            test = default_test_function_for_sets((SubLObject)ConsesLow.list(set1, set2));
        }
        assert set_utilities.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        final SubLObject v_set = set.new_set(test, (SubLObject)set_utilities.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(set1);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL == set.set_memberP(element, set2)) {
                set.set_add(element, v_set);
            }
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7232L)
    public static SubLObject set_nprune(final SubLObject keepers, final SubLObject goners) {
        final SubLObject set_contents_var = set.do_set_internal(goners);
        SubLObject basis_object;
        SubLObject state;
        SubLObject goner;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            goner = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, goner)) {
                set.set_remove(goner, keepers);
            }
        }
        return keepers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7495L)
    public static SubLObject set_prune(final SubLObject keepers, final SubLObject goners) {
        return set_nprune(set.copy_set(keepers), goners);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7719L)
    public static SubLObject sets_coextensionalP(final SubLObject set1, final SubLObject set2) {
        assert set_utilities.NIL != set.set_p(set1) : set1;
        assert set_utilities.NIL != set.set_p(set2) : set2;
        if (set1.eql(set2)) {
            return (SubLObject)set_utilities.T;
        }
        if (!set.set_size(set1).eql(set.set_size(set2))) {
            return (SubLObject)set_utilities.NIL;
        }
        SubLObject failP = (SubLObject)set_utilities.NIL;
        SubLObject set_contents_var = set.do_set_internal(set1);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_of_set1;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == failP && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element_of_set1 = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element_of_set1) && set_utilities.NIL == set.set_memberP(element_of_set1, set2)) {
                failP = (SubLObject)set_utilities.T;
            }
        }
        if (set_utilities.NIL == failP && !set.set_test(set1).eql(set.set_test(set2))) {
            set_contents_var = set.do_set_internal(set2);
            SubLObject element_of_set2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == failP && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                element_of_set2 = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element_of_set2) && set_utilities.NIL == set.set_memberP(element_of_set2, set1)) {
                    failP = (SubLObject)set_utilities.T;
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(set_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 8397L)
    public static SubLObject default_test_function_for_sets(final SubLObject sets) {
        final SubLObject first_set_test = set.set_test(sets.first());
        if (set_utilities.NIL == Sequences.remove(first_set_test, sets, Symbols.symbol_function((SubLObject)set_utilities.EQ), (SubLObject)set_utilities.$sym9$SET_TEST, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED)) {
            return first_set_test;
        }
        return set.$new_set_default_test_function$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 8764L)
    public static SubLObject set_subsetP(final SubLObject small, final SubLObject large) {
        assert set_utilities.NIL != set.set_p(small) : small;
        assert set_utilities.NIL != set.set_p(large) : large;
        SubLObject failP = (SubLObject)set_utilities.NIL;
        if (set.set_size(small).numG(set.set_size(large)) && set.set_test(small).eql(set.set_test(large))) {
            failP = (SubLObject)set_utilities.T;
        }
        final SubLObject set_contents_var = set.do_set_internal(small);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == failP && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, elem) && set_utilities.NIL == set.set_memberP(elem, large)) {
                failP = (SubLObject)set_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(set_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9266L)
    public static SubLObject set_subset_anyP(final SubLObject small, final SubLObject large_sets) {
        SubLObject cdolist_list_var = large_sets;
        SubLObject large = (SubLObject)set_utilities.NIL;
        large = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            if (set_utilities.NIL != set_subsetP(small, large)) {
                return (SubLObject)set_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            large = cdolist_list_var.first();
        }
        return (SubLObject)set_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9481L)
    public static SubLObject set_find(final SubLObject item, final SubLObject v_set, SubLObject test, SubLObject key) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        SubLObject found = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == found && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, element))) {
                found = element;
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9788L)
    public static SubLObject set_find_if(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        SubLObject found = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == found && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL != Functions.funcall(test, Functions.funcall(key, element))) {
                found = element;
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10086L)
    public static SubLObject set_find_if_not(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        SubLObject found = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == found && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL == Functions.funcall(test, Functions.funcall(key, element))) {
                found = element;
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10389L)
    public static SubLObject set_remove_if(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        SubLObject doomed = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL != Functions.funcall(test, Functions.funcall(key, element))) {
                doomed = (SubLObject)ConsesLow.cons(element, doomed);
            }
        }
        SubLObject cdolist_list_var = doomed;
        SubLObject element2 = (SubLObject)set_utilities.NIL;
        element2 = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            set.set_remove(element2, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element2 = cdolist_list_var.first();
        }
        return Values.values(v_set, list_utilities.non_empty_list_p(doomed));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10868L)
    public static SubLObject set_remove_if_not(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        assert set_utilities.NIL != set.set_p(v_set) : v_set;
        SubLObject doomed = (SubLObject)set_utilities.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element) && set_utilities.NIL == Functions.funcall(test, Functions.funcall(key, element))) {
                doomed = (SubLObject)ConsesLow.cons(element, doomed);
            }
        }
        SubLObject cdolist_list_var = doomed;
        SubLObject element2 = (SubLObject)set_utilities.NIL;
        element2 = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            set.set_remove(element2, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element2 = cdolist_list_var.first();
        }
        return Values.values(v_set, list_utilities.non_empty_list_p(doomed));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11353L)
    public static SubLObject construct_set_from_list(final SubLObject list, SubLObject test, SubLObject size) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        if (size == set_utilities.UNPROVIDED) {
            size = Sequences.length(list);
        }
        final SubLObject v_set = set.new_set(test, size);
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)set_utilities.NIL;
        elem = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            set.set_add(elem, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11591L)
    public static SubLObject construct_set_contents_from_list(final SubLObject list, SubLObject test, SubLObject size) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        if (size == set_utilities.UNPROVIDED) {
            size = Sequences.length(list);
        }
        SubLObject v_set_contents = set_contents.new_set_contents(size, test);
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)set_utilities.NIL;
        elem = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            v_set_contents = set_contents.set_contents_add(elem, v_set_contents, test);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return v_set_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11937L)
    public static SubLObject new_singleton_set(final SubLObject element, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        final SubLObject v_set = set.new_set(test, (SubLObject)set_utilities.ONE_INTEGER);
        set.set_add(element, v_set);
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12132L)
    public static SubLObject make_set_from_list(final SubLObject list, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = set.$new_set_default_test_function$.getGlobalValue();
        }
        return construct_set_from_list(list, test, Sequences.length(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12412L)
    public static SubLObject any_in_set(final SubLObject func, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)set_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)set_utilities.IDENTITY)) || key == set_utilities.IDENTITY) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == result && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = Functions.funcall(func, item);
                }
            }
        }
        else {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == result && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = Functions.funcall(func, Functions.funcall(key, item));
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12730L)
    public static SubLObject every_in_set(final SubLObject func, final SubLObject v_set, SubLObject key) {
        if (key == set_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)set_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)set_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)set_utilities.IDENTITY)) || key == set_utilities.IDENTITY) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == result && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = (SubLObject)SubLObjectFactory.makeBoolean(set_utilities.NIL == Functions.funcall(func, item));
                }
            }
        }
        else {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == result && set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = (SubLObject)SubLObjectFactory.makeBoolean(set_utilities.NIL == Functions.funcall(func, Functions.funcall(key, item)));
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(set_utilities.NIL == result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13071L)
    public static SubLObject print_set_contents(final SubLObject v_set, SubLObject stream) {
        if (stream == set_utilities.UNPROVIDED) {
            stream = (SubLObject)set_utilities.T;
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                PrintLow.format(stream, (SubLObject)set_utilities.$str12$_A__, item);
            }
        }
        return (SubLObject)set_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13200L)
    public static SubLObject set_add_all(final SubLObject elements, final SubLObject v_set) {
        SubLObject cdolist_list_var = elements;
        SubLObject element = (SubLObject)set_utilities.NIL;
        element = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            set.set_add(element, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13313L)
    public static SubLObject set_add_set(final SubLObject v_set, final SubLObject resulting_set) {
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elt = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                set.set_add(elt, resulting_set);
            }
        }
        return resulting_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13508L)
    public static SubLObject set_remove_all(final SubLObject elements, final SubLObject v_set) {
        SubLObject cdolist_list_var = elements;
        SubLObject element = (SubLObject)set_utilities.NIL;
        element = cdolist_list_var.first();
        while (set_utilities.NIL != cdolist_list_var) {
            set.set_remove(element, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13627L)
    public static SubLObject set_nmerge(final SubLObject target_set, final SubLObject source_set) {
        assert set_utilities.NIL != set.set_p(target_set) : target_set;
        assert set_utilities.NIL != set.set_p(source_set) : source_set;
        final SubLObject set_contents_var = set.do_set_internal(source_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set_utilities.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                set.set_add(element, target_set);
            }
        }
        return target_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13904L)
    public static SubLObject do_set_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set_utilities.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem = (SubLObject)set_utilities.NIL;
        SubLObject counter = (SubLObject)set_utilities.NIL;
        SubLObject v_set = (SubLObject)set_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set_utilities.$list13);
        elem = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set_utilities.$list13);
        counter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set_utilities.$list13);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)set_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)set_utilities.NIL;
        SubLObject current_$1 = (SubLObject)set_utilities.NIL;
        while (set_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set_utilities.$list13);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set_utilities.$list13);
            if (set_utilities.NIL == conses_high.member(current_$1, (SubLObject)set_utilities.$list14, (SubLObject)set_utilities.UNPROVIDED, (SubLObject)set_utilities.UNPROVIDED)) {
                bad = (SubLObject)set_utilities.T;
            }
            if (current_$1 == set_utilities.$kw15$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (set_utilities.NIL != bad && set_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)set_utilities.$list13);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)set_utilities.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((set_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : set_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)set_utilities.$sym17$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(counter, (SubLObject)set_utilities.$list18)), (SubLObject)ConsesLow.listS((SubLObject)set_utilities.$sym19$DO_SET, (SubLObject)ConsesLow.list(elem, v_set, (SubLObject)set_utilities.$kw16$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)set_utilities.$sym20$CINC, counter)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sliding_window_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)set_utilities.ZERO_INTEGER);
        return (SubLObject)set_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sliding_window_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sliding_window_native.class) ? set_utilities.T : set_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sldwnd_window(final SubLObject v_object) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sldwnd_set_a(final SubLObject v_object) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sldwnd_set_b(final SubLObject v_object) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sldwnd_window_a(final SubLObject v_object) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject sldwnd_window_b(final SubLObject v_object) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject _csetf_sldwnd_window(final SubLObject v_object, final SubLObject value) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject _csetf_sldwnd_set_a(final SubLObject v_object, final SubLObject value) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject _csetf_sldwnd_set_b(final SubLObject v_object, final SubLObject value) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject _csetf_sldwnd_window_a(final SubLObject v_object, final SubLObject value) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject _csetf_sldwnd_window_b(final SubLObject v_object, final SubLObject value) {
        assert set_utilities.NIL != sliding_window_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject make_sliding_window(SubLObject arglist) {
        if (arglist == set_utilities.UNPROVIDED) {
            arglist = (SubLObject)set_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sliding_window_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)set_utilities.NIL, next = arglist; set_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)set_utilities.$kw40$WINDOW)) {
                _csetf_sldwnd_window(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)set_utilities.$kw41$SET_A)) {
                _csetf_sldwnd_set_a(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)set_utilities.$kw42$SET_B)) {
                _csetf_sldwnd_set_b(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)set_utilities.$kw43$WINDOW_A)) {
                _csetf_sldwnd_window_a(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)set_utilities.$kw44$WINDOW_B)) {
                _csetf_sldwnd_window_b(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)set_utilities.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject visit_defstruct_sliding_window(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw46$BEGIN, (SubLObject)set_utilities.$sym47$MAKE_SLIDING_WINDOW, (SubLObject)set_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw48$SLOT, (SubLObject)set_utilities.$kw40$WINDOW, sldwnd_window(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw48$SLOT, (SubLObject)set_utilities.$kw41$SET_A, sldwnd_set_a(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw48$SLOT, (SubLObject)set_utilities.$kw42$SET_B, sldwnd_set_b(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw48$SLOT, (SubLObject)set_utilities.$kw43$WINDOW_A, sldwnd_window_a(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw48$SLOT, (SubLObject)set_utilities.$kw44$WINDOW_B, sldwnd_window_b(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set_utilities.$kw49$END, (SubLObject)set_utilities.$sym47$MAKE_SLIDING_WINDOW, (SubLObject)set_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
    public static SubLObject visit_defstruct_object_sliding_window_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sliding_window(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14934L)
    public static SubLObject new_sliding_window(final SubLObject window_size, SubLObject test) {
        if (test == set_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)set_utilities.EQL);
        }
        final SubLObject slw = make_sliding_window((SubLObject)set_utilities.UNPROVIDED);
        _csetf_sldwnd_window(slw, window_size);
        _csetf_sldwnd_set_a(slw, set.new_set(test, window_size));
        _csetf_sldwnd_set_b(slw, set.new_set(test, window_size));
        _csetf_sldwnd_window_a(slw, queues.create_queue((SubLObject)set_utilities.UNPROVIDED));
        _csetf_sldwnd_window_b(slw, queues.create_queue((SubLObject)set_utilities.UNPROVIDED));
        return slw;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 15563L)
    public static SubLObject sliding_window_add_a(final SubLObject element, final SubLObject slw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = sldwnd_set_a(slw);
        final SubLObject window = sldwnd_window_a(slw);
        final SubLObject window_size = sldwnd_window(slw);
        thread.resetMultipleValues();
        final SubLObject newP = sliding_window_add_element(element, v_set, window, window_size);
        final SubLObject old_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(newP, old_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16055L)
    public static SubLObject sliding_window_add_b(final SubLObject element, final SubLObject slw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = sldwnd_set_b(slw);
        final SubLObject window = sldwnd_window_b(slw);
        final SubLObject window_size = sldwnd_window(slw);
        thread.resetMultipleValues();
        final SubLObject newP = sliding_window_add_element(element, v_set, window, window_size);
        final SubLObject old_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(newP, old_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16545L)
    public static SubLObject sliding_window_overlapP(final SubLObject slw, final SubLObject amount) {
        return sets_intersect_by(sldwnd_set_a(slw), sldwnd_set_b(slw), amount);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16834L)
    public static SubLObject sliding_window_intersection(final SubLObject slw) {
        final SubLObject set_a = sldwnd_set_a(slw);
        final SubLObject set_b = sldwnd_set_b(slw);
        final SubLObject test = set.set_test(set_a);
        return set_intersection((SubLObject)ConsesLow.list(set_a, set_b), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 17110L)
    public static SubLObject sliding_window_add_element(final SubLObject element, final SubLObject v_set, final SubLObject window, final SubLObject window_size) {
        final SubLObject new_comer = set.set_add(element, v_set);
        if (set_utilities.NIL == list_utilities.sublisp_boolean(new_comer)) {
            queues.remqueue(element, window, set.set_test(v_set));
            queues.enqueue(element, window);
            return Values.values((SubLObject)set_utilities.NIL, (SubLObject)set_utilities.NIL);
        }
        queues.enqueue(element, window);
        if (window_size.numL(set.set_size(v_set))) {
            final SubLObject loser = queues.dequeue(window);
            set.set_remove(loser, v_set);
            return Values.values((SubLObject)set_utilities.T, loser);
        }
        return Values.values((SubLObject)set_utilities.T, (SubLObject)set_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 18100L)
    public static SubLObject test_sliding_windows(final SubLObject list_a, final SubLObject list_b, final SubLObject window, final SubLObject shared) {
        final SubLObject test = (SubLObject)set_utilities.EQUAL;
        final SubLObject amount = Sequences.length(shared);
        final SubLObject shared_set = construct_set_from_list(shared, test, amount);
        final SubLObject slw = new_sliding_window(window, test);
        for (SubLObject cursor_a = list_a, cursor_b = list_b; set_utilities.NIL != list_utilities.sublisp_boolean(cursor_a) || set_utilities.NIL != list_utilities.sublisp_boolean(cursor_b); cursor_a = cursor_a.rest(), cursor_b = cursor_b.rest()) {
            sliding_window_add_a(cursor_a.first(), slw);
            sliding_window_add_b(cursor_b.first(), slw);
            if (set_utilities.NIL != sliding_window_overlapP(slw, amount)) {
                final SubLObject intersection = sliding_window_intersection(slw);
                if (set_utilities.NIL != sets_coextensionalP(intersection, shared_set)) {
                    return (SubLObject)set_utilities.$kw59$SUCCESS;
                }
                Errors.error((SubLObject)set_utilities.$str60$Set__A_is_not_co_extensional_with, intersection, shared_set);
            }
        }
        return (SubLObject)set_utilities.$kw61$FAILURE;
    }
    
    public static SubLObject declare_set_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_arbitrary_element", "SET-ARBITRARY-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_arbitrary_element_without_values", "SET-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_contents_arbitrary_element", "SET-CONTENTS-ARBITRARY-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_contents_arbitrary_element_without_values", "SET-CONTENTS-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_remove_random_element", "SET-REMOVE-RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_union", "SET-UNION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_contents_union", "SET-CONTENTS-UNION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_intersection", "SET-INTERSECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_contents_intersection", "SET-CONTENTS-INTERSECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sets_intersectP", "SETS-INTERSECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_intersection_fraction", "SET-INTERSECTION-FRACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sets_intersect_by", "SETS-INTERSECT-BY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_minus", "SET-MINUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_nprune", "SET-NPRUNE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_prune", "SET-PRUNE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sets_coextensionalP", "SETS-COEXTENSIONAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "default_test_function_for_sets", "DEFAULT-TEST-FUNCTION-FOR-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_subsetP", "SET-SUBSET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_subset_anyP", "SET-SUBSET-ANY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_find", "SET-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_find_if", "SET-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_find_if_not", "SET-FIND-IF-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_remove_if", "SET-REMOVE-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_remove_if_not", "SET-REMOVE-IF-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "construct_set_from_list", "CONSTRUCT-SET-FROM-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "construct_set_contents_from_list", "CONSTRUCT-SET-CONTENTS-FROM-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "new_singleton_set", "NEW-SINGLETON-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "make_set_from_list", "MAKE-SET-FROM-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "any_in_set", "ANY-IN-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "every_in_set", "EVERY-IN-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "print_set_contents", "PRINT-SET-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_add_all", "SET-ADD-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_add_set", "SET-ADD-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_remove_all", "SET-REMOVE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "set_nmerge", "SET-NMERGE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.set_utilities", "do_set_numbered", "DO-SET-NUMBERED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_print_function_trampoline", "SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_p", "SLIDING-WINDOW-P", 1, 0, false);
        new $sliding_window_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sldwnd_window", "SLDWND-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sldwnd_set_a", "SLDWND-SET-A", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sldwnd_set_b", "SLDWND-SET-B", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sldwnd_window_a", "SLDWND-WINDOW-A", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sldwnd_window_b", "SLDWND-WINDOW-B", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "_csetf_sldwnd_window", "_CSETF-SLDWND-WINDOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "_csetf_sldwnd_set_a", "_CSETF-SLDWND-SET-A", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "_csetf_sldwnd_set_b", "_CSETF-SLDWND-SET-B", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "_csetf_sldwnd_window_a", "_CSETF-SLDWND-WINDOW-A", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "_csetf_sldwnd_window_b", "_CSETF-SLDWND-WINDOW-B", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "make_sliding_window", "MAKE-SLIDING-WINDOW", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "visit_defstruct_sliding_window", "VISIT-DEFSTRUCT-SLIDING-WINDOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "visit_defstruct_object_sliding_window_method", "VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "new_sliding_window", "NEW-SLIDING-WINDOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_add_a", "SLIDING-WINDOW-ADD-A", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_add_b", "SLIDING-WINDOW-ADD-B", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_overlapP", "SLIDING-WINDOW-OVERLAP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_intersection", "SLIDING-WINDOW-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "sliding_window_add_element", "SLIDING-WINDOW-ADD-ELEMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set_utilities", "test_sliding_windows", "TEST-SLIDING-WINDOWS", 4, 0, false);
        return (SubLObject)set_utilities.NIL;
    }
    
    public static SubLObject init_set_utilities_file() {
        set_utilities.$empty_set$ = SubLFiles.deflexical("*EMPTY-SET*", maybeDefault((SubLObject)set_utilities.$sym0$_EMPTY_SET_, set_utilities.$empty_set$, ()->(set.new_set(Symbols.symbol_function((SubLObject)set_utilities.EQ), (SubLObject)set_utilities.ZERO_INTEGER))));
        set_utilities.$dtp_sliding_window$ = SubLFiles.defconstant("*DTP-SLIDING-WINDOW*", (SubLObject)set_utilities.$sym21$SLIDING_WINDOW);
        return (SubLObject)set_utilities.NIL;
    }
    
    public static SubLObject setup_set_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)set_utilities.$sym0$_EMPTY_SET_);
        access_macros.define_obsolete_register((SubLObject)set_utilities.$sym10$MAKE_SET_FROM_LIST, (SubLObject)set_utilities.$list11);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), Symbols.symbol_function((SubLObject)set_utilities.$sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)set_utilities.$list29);
        Structures.def_csetf((SubLObject)set_utilities.$sym30$SLDWND_WINDOW, (SubLObject)set_utilities.$sym31$_CSETF_SLDWND_WINDOW);
        Structures.def_csetf((SubLObject)set_utilities.$sym32$SLDWND_SET_A, (SubLObject)set_utilities.$sym33$_CSETF_SLDWND_SET_A);
        Structures.def_csetf((SubLObject)set_utilities.$sym34$SLDWND_SET_B, (SubLObject)set_utilities.$sym35$_CSETF_SLDWND_SET_B);
        Structures.def_csetf((SubLObject)set_utilities.$sym36$SLDWND_WINDOW_A, (SubLObject)set_utilities.$sym37$_CSETF_SLDWND_WINDOW_A);
        Structures.def_csetf((SubLObject)set_utilities.$sym38$SLDWND_WINDOW_B, (SubLObject)set_utilities.$sym39$_CSETF_SLDWND_WINDOW_B);
        Equality.identity((SubLObject)set_utilities.$sym21$SLIDING_WINDOW);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), Symbols.symbol_function((SubLObject)set_utilities.$sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)set_utilities.$sym51$TEST_SLIDING_WINDOWS, (SubLObject)ConsesLow.list(new SubLObject[] { set_utilities.$kw52$TEST, set_utilities.EQL, set_utilities.$kw53$OWNER, set_utilities.NIL, set_utilities.$kw54$CLASSES, set_utilities.NIL, set_utilities.$kw55$KB, set_utilities.$kw56$TINY, set_utilities.$kw57$WORKING_, set_utilities.T }), (SubLObject)set_utilities.$list58);
        return (SubLObject)set_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_set_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_set_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_set_utilities_file();
    }
    
    static {
        me = (SubLFile)new set_utilities();
        set_utilities.$empty_set$ = null;
        set_utilities.$dtp_sliding_window$ = null;
        $sym0$_EMPTY_SET_ = SubLObjectFactory.makeSymbol("*EMPTY-SET*");
        $sym1$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $sym2$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym3$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym4$SET_SIZE = SubLObjectFactory.makeSymbol("SET-SIZE");
        $sym5$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym6$SET_CONTENTS_P = SubLObjectFactory.makeSymbol("SET-CONTENTS-P");
        $sym7$SET_CONTENTS_SIZE = SubLObjectFactory.makeSymbol("SET-CONTENTS-SIZE");
        $sym8$_ = SubLObjectFactory.makeSymbol("<");
        $sym9$SET_TEST = SubLObjectFactory.makeSymbol("SET-TEST");
        $sym10$MAKE_SET_FROM_LIST = SubLObjectFactory.makeSymbol("MAKE-SET-FROM-LIST");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-SET-FROM-LIST"));
        $str12$_A__ = SubLObjectFactory.makeString("~A~%");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEM"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw15$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw16$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym17$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list18 = ConsesLow.list((SubLObject)set_utilities.ZERO_INTEGER);
        $sym19$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym20$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym21$SLIDING_WINDOW = SubLObjectFactory.makeSymbol("SLIDING-WINDOW");
        $sym22$SLIDING_WINDOW_P = SubLObjectFactory.makeSymbol("SLIDING-WINDOW-P");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("SET-A"), (SubLObject)SubLObjectFactory.makeSymbol("SET-B"), (SubLObject)SubLObjectFactory.makeSymbol("WINDOW-A"), (SubLObject)SubLObjectFactory.makeSymbol("WINDOW-B"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WINDOW"), (SubLObject)SubLObjectFactory.makeKeyword("SET-A"), (SubLObject)SubLObjectFactory.makeKeyword("SET-B"), (SubLObject)SubLObjectFactory.makeKeyword("WINDOW-A"), (SubLObject)SubLObjectFactory.makeKeyword("WINDOW-B"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLDWND-WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("SLDWND-SET-A"), (SubLObject)SubLObjectFactory.makeSymbol("SLDWND-SET-B"), (SubLObject)SubLObjectFactory.makeSymbol("SLDWND-WINDOW-A"), (SubLObject)SubLObjectFactory.makeSymbol("SLDWND-WINDOW-B"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLDWND-SET-A"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLDWND-SET-B"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW-A"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW-B"));
        $sym27$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SLIDING-WINDOW-P"));
        $sym30$SLDWND_WINDOW = SubLObjectFactory.makeSymbol("SLDWND-WINDOW");
        $sym31$_CSETF_SLDWND_WINDOW = SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW");
        $sym32$SLDWND_SET_A = SubLObjectFactory.makeSymbol("SLDWND-SET-A");
        $sym33$_CSETF_SLDWND_SET_A = SubLObjectFactory.makeSymbol("_CSETF-SLDWND-SET-A");
        $sym34$SLDWND_SET_B = SubLObjectFactory.makeSymbol("SLDWND-SET-B");
        $sym35$_CSETF_SLDWND_SET_B = SubLObjectFactory.makeSymbol("_CSETF-SLDWND-SET-B");
        $sym36$SLDWND_WINDOW_A = SubLObjectFactory.makeSymbol("SLDWND-WINDOW-A");
        $sym37$_CSETF_SLDWND_WINDOW_A = SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW-A");
        $sym38$SLDWND_WINDOW_B = SubLObjectFactory.makeSymbol("SLDWND-WINDOW-B");
        $sym39$_CSETF_SLDWND_WINDOW_B = SubLObjectFactory.makeSymbol("_CSETF-SLDWND-WINDOW-B");
        $kw40$WINDOW = SubLObjectFactory.makeKeyword("WINDOW");
        $kw41$SET_A = SubLObjectFactory.makeKeyword("SET-A");
        $kw42$SET_B = SubLObjectFactory.makeKeyword("SET-B");
        $kw43$WINDOW_A = SubLObjectFactory.makeKeyword("WINDOW-A");
        $kw44$WINDOW_B = SubLObjectFactory.makeKeyword("WINDOW-B");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_SLIDING_WINDOW = SubLObjectFactory.makeSymbol("MAKE-SLIDING-WINDOW");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD");
        $sym51$TEST_SLIDING_WINDOWS = SubLObjectFactory.makeSymbol("TEST-SLIDING-WINDOWS");
        $kw52$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw53$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw54$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw55$KB = SubLObjectFactory.makeKeyword("KB");
        $kw56$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw57$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { set_utilities.TEN_INTEGER, set_utilities.NINE_INTEGER, set_utilities.EIGHT_INTEGER, set_utilities.SEVEN_INTEGER, set_utilities.SIX_INTEGER, set_utilities.FIVE_INTEGER, set_utilities.FOUR_INTEGER, set_utilities.THREE_INTEGER, set_utilities.TWO_INTEGER, set_utilities.ONE_INTEGER }), (SubLObject)ConsesLow.list((SubLObject)set_utilities.EIGHT_INTEGER, (SubLObject)set_utilities.SEVEN_INTEGER, (SubLObject)set_utilities.SIX_INTEGER, (SubLObject)set_utilities.FIVE_INTEGER, (SubLObject)set_utilities.FOUR_INTEGER, (SubLObject)set_utilities.THREE_INTEGER, (SubLObject)set_utilities.TWO_INTEGER, (SubLObject)set_utilities.ONE_INTEGER), (SubLObject)set_utilities.FIVE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)set_utilities.EIGHT_INTEGER, (SubLObject)set_utilities.SEVEN_INTEGER, (SubLObject)set_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { set_utilities.TWELVE_INTEGER, set_utilities.ELEVEN_INTEGER, set_utilities.TEN_INTEGER, set_utilities.EIGHT_INTEGER, set_utilities.SEVEN_INTEGER, set_utilities.FIVE_INTEGER, set_utilities.FOUR_INTEGER, set_utilities.THREE_INTEGER, set_utilities.TWO_INTEGER, set_utilities.ONE_INTEGER }), (SubLObject)ConsesLow.list(new SubLObject[] { set_utilities.TEN_INTEGER, set_utilities.NINE_INTEGER, set_utilities.EIGHT_INTEGER, set_utilities.SEVEN_INTEGER, set_utilities.SIX_INTEGER, set_utilities.FIVE_INTEGER, set_utilities.FOUR_INTEGER, set_utilities.THREE_INTEGER, set_utilities.TWO_INTEGER, set_utilities.ONE_INTEGER }), (SubLObject)set_utilities.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)set_utilities.EIGHT_INTEGER, (SubLObject)set_utilities.SEVEN_INTEGER, (SubLObject)set_utilities.FIVE_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $kw59$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str60$Set__A_is_not_co_extensional_with = SubLObjectFactory.makeString("Set ~A is not co-extensional with expected set ~A.");
        $kw61$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
    }
    
    public static final class $sliding_window_native extends SubLStructNative
    {
        public SubLObject $window;
        public SubLObject $set_a;
        public SubLObject $set_b;
        public SubLObject $window_a;
        public SubLObject $window_b;
        private static final SubLStructDeclNative structDecl;
        
        public $sliding_window_native() {
            this.$window = (SubLObject)CommonSymbols.NIL;
            this.$set_a = (SubLObject)CommonSymbols.NIL;
            this.$set_b = (SubLObject)CommonSymbols.NIL;
            this.$window_a = (SubLObject)CommonSymbols.NIL;
            this.$window_b = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sliding_window_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$window;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$set_a;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$set_b;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$window_a;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$window_b;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$window = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$set_a = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$set_b = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$window_a = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$window_b = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sliding_window_native.class, set_utilities.$sym21$SLIDING_WINDOW, set_utilities.$sym22$SLIDING_WINDOW_P, set_utilities.$list23, set_utilities.$list24, new String[] { "$window", "$set_a", "$set_b", "$window_a", "$window_b" }, set_utilities.$list25, set_utilities.$list26, set_utilities.$sym27$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sliding_window_p$UnaryFunction extends UnaryFunction
    {
        public $sliding_window_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SLIDING-WINDOW-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return set_utilities.sliding_window_p(arg1);
        }
    }
}

/*

	Total time: 335 ms
	
*/
package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_member_of_list extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list";
    public static final String myFingerPrint = "25a320dc88bfc478418ec060a75ec7b0fdd0acf6e70184f8c63dcc8915e242ff";
    private static final SubLObject $const0$memberOfList;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_MEMBER_OF_LIST_CHECK;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_MEMBER_OF_LIST_UNIFY;
    private static final SubLList $list9;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1020L)
    public static SubLObject removal_member_of_list_check_int(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_member_of_list.UNPROVIDED);
        SubLObject element = (SubLObject)removal_modules_member_of_list.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = (SubLObject)removal_modules_member_of_list.NIL;
        SubLObject elements = (SubLObject)removal_modules_member_of_list.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        thelist = current.first();
        current = (elements = current.rest());
        current = temp;
        if (removal_modules_member_of_list.NIL == current) {
            return conses_high.member(element, elements, Symbols.symbol_function((SubLObject)removal_modules_member_of_list.EQUAL), (SubLObject)removal_modules_member_of_list.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_member_of_list.$list3);
        return (SubLObject)removal_modules_member_of_list.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1493L)
    public static SubLObject removal_member_of_list_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_member_of_list.UNPROVIDED) {
            sense = (SubLObject)removal_modules_member_of_list.NIL;
        }
        return removal_member_of_list_check_int(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 2298L)
    public static SubLObject removal_not_member_of_list_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_member_of_list.UNPROVIDED) {
            sense = (SubLObject)removal_modules_member_of_list.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_member_of_list.NIL == removal_member_of_list_check_int(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3161L)
    public static SubLObject removal_member_of_list_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_member_of_list.UNPROVIDED) {
            sense = (SubLObject)removal_modules_member_of_list.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_member_of_list.UNPROVIDED);
        SubLObject element = (SubLObject)removal_modules_member_of_list.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = (SubLObject)removal_modules_member_of_list.NIL;
        SubLObject elements = (SubLObject)removal_modules_member_of_list.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_member_of_list.$list3);
        thelist = current.first();
        current = (elements = current.rest());
        current = temp;
        if (removal_modules_member_of_list.NIL == current) {
            return Sequences.length(elements);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_member_of_list.$list3);
        return (SubLObject)removal_modules_member_of_list.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3572L)
    public static SubLObject removal_member_of_list_unify_generate(final SubLObject the_list) {
        return iteration.new_list_iterator(cycl_utilities.formula_args(the_list, (SubLObject)removal_modules_member_of_list.UNPROVIDED));
    }
    
    public static SubLObject declare_removal_modules_member_of_list_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list", "removal_member_of_list_check_int", "REMOVAL-MEMBER-OF-LIST-CHECK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list", "removal_member_of_list_check", "REMOVAL-MEMBER-OF-LIST-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list", "removal_not_member_of_list_check", "REMOVAL-NOT-MEMBER-OF-LIST-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list", "removal_member_of_list_unify_cost", "REMOVAL-MEMBER-OF-LIST-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list", "removal_member_of_list_unify_generate", "REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE", 1, 0, false);
        return (SubLObject)removal_modules_member_of_list.NIL;
    }
    
    public static SubLObject init_removal_modules_member_of_list_file() {
        return (SubLObject)removal_modules_member_of_list.NIL;
    }
    
    public static SubLObject setup_removal_modules_member_of_list_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_member_of_list.$const0$memberOfList);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_member_of_list.$kw1$POS, removal_modules_member_of_list.$const0$memberOfList, (SubLObject)removal_modules_member_of_list.TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_member_of_list.$kw2$NEG, removal_modules_member_of_list.$const0$memberOfList);
        inference_modules.inference_removal_module((SubLObject)removal_modules_member_of_list.$kw4$REMOVAL_MEMBER_OF_LIST_CHECK, (SubLObject)removal_modules_member_of_list.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_member_of_list.$kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK, (SubLObject)removal_modules_member_of_list.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_member_of_list.$kw8$REMOVAL_MEMBER_OF_LIST_UNIFY, (SubLObject)removal_modules_member_of_list.$list9);
        return (SubLObject)removal_modules_member_of_list.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_member_of_list_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_member_of_list_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_member_of_list_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_member_of_list();
        $const0$memberOfList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THELIST"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS")));
        $kw4$REMOVAL_MEMBER_OF_LIST_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-MEMBER-OF-LIST-CHECK");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MEMBER-OF-LIST-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))") });
        $kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-MEMBER-OF-LIST-CHECK");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NOT-MEMBER-OF-LIST-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))") });
        $kw8$REMOVAL_MEMBER_OF_LIST_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MEMBER-OF-LIST-UNIFY");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("THE-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("THE-LIST"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("THE-LIST"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))") });
    }
}

/*

	Total time: 30 ms
	
*/
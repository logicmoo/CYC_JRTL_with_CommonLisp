package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deck extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.deck";
    public static final String myFingerPrint = "2c9cb4d6c59cfd261cec6fde466ae4a22377ac81f053bfa23d0dacb169906488";
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLSymbol $dtp_deck$;
    private static final SubLSymbol $sym0$DECK;
    private static final SubLSymbol $sym1$DECK_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_DECK;
    private static final SubLSymbol $sym7$DECK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DECK_TYPE;
    private static final SubLSymbol $sym10$_CSETF_DECK_TYPE;
    private static final SubLSymbol $sym11$DECK_DATA;
    private static final SubLSymbol $sym12$_CSETF_DECK_DATA;
    private static final SubLSymbol $kw13$TYPE;
    private static final SubLSymbol $kw14$DATA;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_DECK;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_DECK_METHOD;
    private static final SubLSymbol $kw21$QUEUE;
    private static final SubLSymbol $kw22$STACK;
    private static final SubLSymbol $sym23$DECK_TYPE_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject deck_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_deck(v_object, stream, (SubLObject)deck.ZERO_INTEGER);
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject deck_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $deck_native.class) ? deck.T : deck.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject deck_type(final SubLObject v_object) {
        assert deck.NIL != deck_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject deck_data(final SubLObject v_object) {
        assert deck.NIL != deck_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject _csetf_deck_type(final SubLObject v_object, final SubLObject value) {
        assert deck.NIL != deck_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject _csetf_deck_data(final SubLObject v_object, final SubLObject value) {
        assert deck.NIL != deck_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject make_deck(SubLObject arglist) {
        if (arglist == deck.UNPROVIDED) {
            arglist = (SubLObject)deck.NIL;
        }
        final SubLObject v_new = (SubLObject)new $deck_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)deck.NIL, next = arglist; deck.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)deck.$kw13$TYPE)) {
                _csetf_deck_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)deck.$kw14$DATA)) {
                _csetf_deck_data(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)deck.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject visit_defstruct_deck(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)deck.$kw16$BEGIN, (SubLObject)deck.$sym17$MAKE_DECK, (SubLObject)deck.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)deck.$kw18$SLOT, (SubLObject)deck.$kw13$TYPE, deck_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deck.$kw18$SLOT, (SubLObject)deck.$kw14$DATA, deck_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deck.$kw19$END, (SubLObject)deck.$sym17$MAKE_DECK, (SubLObject)deck.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 929L)
    public static SubLObject visit_defstruct_object_deck_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deck(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 992L)
    public static SubLObject print_deck(final SubLObject v_deck, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (deck.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_deck, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_deck, (SubLObject)deck.T, (SubLObject)deck.T);
            print_high.princ(deck_type(v_deck), stream);
            print_high.princ(deck_size(v_deck), stream);
            print_macros.print_unreadable_object_postamble(stream, v_deck, (SubLObject)deck.T, (SubLObject)deck.T);
        }
        return v_deck;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 1205L)
    public static SubLObject deck_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deck.$kw21$QUEUE == v_object || deck.$kw22$STACK == v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 1357L)
    public static SubLObject create_deck(final SubLObject type) {
        assert deck.NIL != deck_type_p(type) : type;
        final SubLObject v_deck = make_deck((SubLObject)deck.UNPROVIDED);
        if (type.eql((SubLObject)deck.$kw21$QUEUE)) {
            _csetf_deck_type(v_deck, (SubLObject)deck.$kw21$QUEUE);
            _csetf_deck_data(v_deck, queues.create_queue((SubLObject)deck.UNPROVIDED));
        }
        else if (type.eql((SubLObject)deck.$kw22$STACK)) {
            _csetf_deck_type(v_deck, (SubLObject)deck.$kw22$STACK);
            _csetf_deck_data(v_deck, stacks.create_stack());
        }
        return v_deck;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 1720L)
    public static SubLObject clear_deck(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            queues.clear_queue(deck_data(v_deck));
        }
        else if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            stacks.clear_stack(deck_data(v_deck));
        }
        return v_deck;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 1940L)
    public static SubLObject deck_empty_p(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            return queues.queue_empty_p(deck_data(v_deck));
        }
        if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            return stacks.stack_empty_p(deck_data(v_deck));
        }
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 2167L)
    public static SubLObject deck_size(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            return queues.queue_size(deck_data(v_deck));
        }
        if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            return stacks.stack_size(deck_data(v_deck));
        }
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 2396L)
    public static SubLObject deck_elements(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            return queues.queue_elements(deck_data(v_deck));
        }
        if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            return stacks.stack_elements(deck_data(v_deck));
        }
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 2637L)
    public static SubLObject deck_push(final SubLObject elt, final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            queues.enqueue(elt, deck_data(v_deck));
        }
        else if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            stacks.stack_push(elt, deck_data(v_deck));
        }
        return v_deck;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 2882L)
    public static SubLObject deck_pop(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            return queues.dequeue(deck_data(v_deck));
        }
        if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            return stacks.stack_pop(deck_data(v_deck));
        }
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 3126L)
    public static SubLObject deck_peek(final SubLObject v_deck) {
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            return queues.queue_peek(deck_data(v_deck));
        }
        if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            return stacks.stack_peek(deck_data(v_deck));
        }
        return (SubLObject)deck.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deck.lisp", position = 3382L)
    public static SubLObject remdeck(final SubLObject item, final SubLObject v_deck, SubLObject test) {
        if (test == deck.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)deck.EQL);
        }
        assert deck.NIL != deck_p(v_deck) : v_deck;
        final SubLObject pcase_var = deck_type(v_deck);
        if (pcase_var.eql((SubLObject)deck.$kw21$QUEUE)) {
            queues.remqueue(item, deck_data(v_deck), test);
        }
        else if (pcase_var.eql((SubLObject)deck.$kw22$STACK)) {
            stacks.stack_delete(item, deck_data(v_deck), test);
        }
        return v_deck;
    }
    
    public static SubLObject declare_deck_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_print_function_trampoline", "DECK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_p", "DECK-P", 1, 0, false);
        new $deck_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_type", "DECK-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_data", "DECK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "_csetf_deck_type", "_CSETF-DECK-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "_csetf_deck_data", "_CSETF-DECK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "make_deck", "MAKE-DECK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "visit_defstruct_deck", "VISIT-DEFSTRUCT-DECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "visit_defstruct_object_deck_method", "VISIT-DEFSTRUCT-OBJECT-DECK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "print_deck", "PRINT-DECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_type_p", "DECK-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "create_deck", "CREATE-DECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "clear_deck", "CLEAR-DECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_empty_p", "DECK-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_size", "DECK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_elements", "DECK-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_push", "DECK-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_pop", "DECK-POP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "deck_peek", "DECK-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deck", "remdeck", "REMDECK", 2, 1, false);
        return (SubLObject)deck.NIL;
    }
    
    public static SubLObject init_deck_file() {
        deck.$dtp_deck$ = SubLFiles.defconstant("*DTP-DECK*", (SubLObject)deck.$sym0$DECK);
        return (SubLObject)deck.NIL;
    }
    
    public static SubLObject setup_deck_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), deck.$dtp_deck$.getGlobalValue(), Symbols.symbol_function((SubLObject)deck.$sym7$DECK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)deck.$list8);
        Structures.def_csetf((SubLObject)deck.$sym9$DECK_TYPE, (SubLObject)deck.$sym10$_CSETF_DECK_TYPE);
        Structures.def_csetf((SubLObject)deck.$sym11$DECK_DATA, (SubLObject)deck.$sym12$_CSETF_DECK_DATA);
        Equality.identity((SubLObject)deck.$sym0$DECK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), deck.$dtp_deck$.getGlobalValue(), Symbols.symbol_function((SubLObject)deck.$sym20$VISIT_DEFSTRUCT_OBJECT_DECK_METHOD));
        return (SubLObject)deck.NIL;
    }
    
    public void declareFunctions() {
        declare_deck_file();
    }
    
    public void initializeVariables() {
        init_deck_file();
    }
    
    public void runTopLevelForms() {
        setup_deck_file();
    }
    
    static {
        me = (SubLFile)new deck();
        deck.$dtp_deck$ = null;
        $sym0$DECK = SubLObjectFactory.makeSymbol("DECK");
        $sym1$DECK_P = SubLObjectFactory.makeSymbol("DECK-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DATA"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DECK-DATA"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DECK-DATA"));
        $sym6$PRINT_DECK = SubLObjectFactory.makeSymbol("PRINT-DECK");
        $sym7$DECK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DECK-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DECK-P"));
        $sym9$DECK_TYPE = SubLObjectFactory.makeSymbol("DECK-TYPE");
        $sym10$_CSETF_DECK_TYPE = SubLObjectFactory.makeSymbol("_CSETF-DECK-TYPE");
        $sym11$DECK_DATA = SubLObjectFactory.makeSymbol("DECK-DATA");
        $sym12$_CSETF_DECK_DATA = SubLObjectFactory.makeSymbol("_CSETF-DECK-DATA");
        $kw13$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw14$DATA = SubLObjectFactory.makeKeyword("DATA");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_DECK = SubLObjectFactory.makeSymbol("MAKE-DECK");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_DECK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DECK-METHOD");
        $kw21$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw22$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym23$DECK_TYPE_P = SubLObjectFactory.makeSymbol("DECK-TYPE-P");
    }
    
    public static final class $deck_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $deck_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$deck_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$deck_native.class, deck.$sym0$DECK, deck.$sym1$DECK_P, deck.$list2, deck.$list3, new String[] { "$type", "$data" }, deck.$list4, deck.$list5, deck.$sym6$PRINT_DECK);
        }
    }
    
    public static final class $deck_p$UnaryFunction extends UnaryFunction
    {
        public $deck_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DECK-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return deck.deck_p(arg1);
        }
    }
}

/*

	Total time: 176 ms
	
*/
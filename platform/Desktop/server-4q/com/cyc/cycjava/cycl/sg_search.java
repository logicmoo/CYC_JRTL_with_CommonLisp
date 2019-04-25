package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sg_search extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sg_search";
    public static final String myFingerPrint = "20abba4feb618e29f35949b5031159cf04c8bc05b8180dee40f811b91106e613";
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 979L)
    private static SubLSymbol $sg_container_accessor_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2410L)
    private static SubLSymbol $sg_search_valid_types$;
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2631L)
    private static SubLSymbol $sg_search_type_container_map$;
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2890L)
    public static SubLSymbol $sg_current_node$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$SEARCH_TYPE;
    private static final SubLSymbol $kw5$PRIORITY_QUEUE;
    private static final SubLSymbol $kw6$RANKING_FUNCTION;
    private static final SubLSymbol $sym7$_;
    private static final SubLSymbol $kw8$SG_SEARCH_TYPE;
    private static final SubLString $str9$__SG_SEARCH__TYPE__a_;
    private static final SubLSymbol $kw10$EXPAND_FUNCTION;
    private static final SubLSymbol $kw11$DEPTH_EXCEDED_FUNCTION;
    private static final SubLSymbol $kw12$OPTIONS_FUNCTION;
    private static final SubLSymbol $kw13$GOAL_FUNCTION;
    private static final SubLSymbol $kw14$ADD_GOAL_FUNCTION;
    private static final SubLSymbol $kw15$ACTIVE_MODULES;
    private static final SubLSymbol $sym16$SG_CONTAINER_EMPTY_P;
    private static final SubLSymbol $sym17$SG_CONTAINER_NEXT_NODE;
    private static final SubLSymbol $sym18$SG_CONTAINER_ADD;
    private static final SubLSymbol $sym19$SG_PRINT_SEARCH;
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1418L)
    public static SubLObject sg_container_type(final SubLObject container) {
        final SubLObject doneP = (SubLObject)sg_search.NIL;
        SubLObject result = (SubLObject)sg_search.NIL;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject type;
        SubLObject func_list;
        for (rest = (SubLObject)sg_search.NIL, rest = sg_search.$sg_container_accessor_table$.getGlobalValue(); sg_search.NIL == doneP && sg_search.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            type = (SubLObject)sg_search.NIL;
            func_list = (SubLObject)sg_search.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sg_search.$list1);
            type = current.first();
            current = (func_list = current.rest());
            if (sg_search.NIL != Functions.funcall(func_list.first(), container)) {
                result = type;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1672L)
    public static SubLObject sg_create_container(final SubLObject type) {
        final SubLObject func = conses_high.sixth(conses_high.assoc(type, sg_search.$sg_container_accessor_table$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED));
        return Functions.funcall(func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1813L)
    public static SubLObject sg_container_empty_p(final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = conses_high.third(conses_high.assoc(type, sg_search.$sg_container_accessor_table$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED));
        return Functions.funcall(pred, container);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2014L)
    public static SubLObject sg_container_add(final SubLObject item, final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = conses_high.fourth(conses_high.assoc(type, sg_search.$sg_container_accessor_table$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED));
        return Functions.funcall(pred, item, container);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2217L)
    public static SubLObject sg_container_next(final SubLObject container) {
        final SubLObject type = sg_container_type(container);
        final SubLObject pred = conses_high.fifth(conses_high.assoc(type, sg_search.$sg_container_accessor_table$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED));
        return Functions.funcall(pred, container);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2537L)
    public static SubLObject sg_valid_search_type_p(final SubLObject type) {
        return conses_high.member(type, sg_search.$sg_search_valid_types$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2779L)
    public static SubLObject sg_search_type_container(final SubLObject type) {
        return conses_high.second(conses_high.assoc(type, sg_search.$sg_search_type_container_map$.getGlobalValue(), (SubLObject)sg_search.UNPROVIDED, (SubLObject)sg_search.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3083L)
    public static SubLObject sg_container_next_node(final SubLObject container) {
        final SubLObject next_node = sg_container_next(container);
        return Values.values(next_node, container);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3230L)
    public static SubLObject sg_search_create_container(final SubLObject v_search, final SubLObject search_properties) {
        final SubLObject type = conses_high.getf(search_properties, (SubLObject)sg_search.$kw4$SEARCH_TYPE, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject container_type = sg_search_type_container(type);
        SubLObject container = (SubLObject)sg_search.NIL;
        final SubLObject pcase_var = container_type;
        if (pcase_var.eql((SubLObject)sg_search.$kw5$PRIORITY_QUEUE)) {
            final SubLObject ranking_func = conses_high.getf(search_properties, (SubLObject)sg_search.$kw6$RANKING_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
            container = queues.create_p_queue((SubLObject)sg_search.NIL, ranking_func, Symbols.symbol_function((SubLObject)sg_search.$sym7$_));
        }
        else {
            container = sg_create_container(container_type);
        }
        search._csetf_search_leaves(v_search, container);
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3788L)
    public static SubLObject sg_search_type(final SubLObject v_search) {
        return conses_high.getf(search.search_state(v_search), (SubLObject)sg_search.$kw8$SG_SEARCH_TYPE, (SubLObject)sg_search.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3891L)
    public static SubLObject sg_print_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)sg_search.$str9$__SG_SEARCH__TYPE__a_, sg_search_type(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 4045L)
    public static SubLObject new_sg_search(SubLObject state, final SubLObject search_properties) {
        final SubLObject type = conses_high.getf(search_properties, (SubLObject)sg_search.$kw4$SEARCH_TYPE, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject expand = conses_high.getf(search_properties, (SubLObject)sg_search.$kw10$EXPAND_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject too_deep_p = conses_high.getf(search_properties, (SubLObject)sg_search.$kw11$DEPTH_EXCEDED_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject options = conses_high.getf(search_properties, (SubLObject)sg_search.$kw12$OPTIONS_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject goal_p = conses_high.getf(search_properties, (SubLObject)sg_search.$kw13$GOAL_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject add_goal = conses_high.getf(search_properties, (SubLObject)sg_search.$kw14$ADD_GOAL_FUNCTION, (SubLObject)sg_search.UNPROVIDED);
        final SubLObject active_modules = conses_high.getf(search_properties, (SubLObject)sg_search.$kw15$ACTIVE_MODULES, (SubLObject)sg_search.UNPROVIDED);
        SubLObject v_search = (SubLObject)sg_search.NIL;
        state = conses_high.putf(state, (SubLObject)sg_search.$kw8$SG_SEARCH_TYPE, type);
        state = conses_high.putf(state, (SubLObject)sg_search.$kw15$ACTIVE_MODULES, active_modules);
        v_search = search.new_search((SubLObject)sg_search.$sym16$SG_CONTAINER_EMPTY_P, (SubLObject)sg_search.$sym17$SG_CONTAINER_NEXT_NODE, goal_p, add_goal, options, expand, (SubLObject)sg_search.$sym18$SG_CONTAINER_ADD, too_deep_p, state, (SubLObject)sg_search.$sym19$SG_PRINT_SEARCH);
        v_search = sg_search_create_container(v_search, search_properties);
        return v_search;
    }
    
    public static SubLObject declare_sg_search_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_container_type", "SG-CONTAINER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_create_container", "SG-CREATE-CONTAINER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_container_empty_p", "SG-CONTAINER-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_container_add", "SG-CONTAINER-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_container_next", "SG-CONTAINER-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_valid_search_type_p", "SG-VALID-SEARCH-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_search_type_container", "SG-SEARCH-TYPE-CONTAINER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_container_next_node", "SG-CONTAINER-NEXT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_search_create_container", "SG-SEARCH-CREATE-CONTAINER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_search_type", "SG-SEARCH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "sg_print_search", "SG-PRINT-SEARCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sg_search", "new_sg_search", "NEW-SG-SEARCH", 2, 0, false);
        return (SubLObject)sg_search.NIL;
    }
    
    public static SubLObject init_sg_search_file() {
        sg_search.$sg_container_accessor_table$ = SubLFiles.deflexical("*SG-CONTAINER-ACCESSOR-TABLE*", (SubLObject)sg_search.$list0);
        sg_search.$sg_search_valid_types$ = SubLFiles.deflexical("*SG-SEARCH-VALID-TYPES*", (SubLObject)sg_search.$list2);
        sg_search.$sg_search_type_container_map$ = SubLFiles.deflexical("*SG-SEARCH-TYPE-CONTAINER-MAP*", (SubLObject)sg_search.$list3);
        sg_search.$sg_current_node$ = SubLFiles.defparameter("*SG-CURRENT-NODE*", (SubLObject)sg_search.NIL);
        return (SubLObject)sg_search.NIL;
    }
    
    public static SubLObject setup_sg_search_file() {
        return (SubLObject)sg_search.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sg_search_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sg_search_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sg_search_file();
    }
    
    static {
        me = (SubLFile)new sg_search();
        sg_search.$sg_container_accessor_table$ = null;
        sg_search.$sg_search_valid_types$ = null;
        sg_search.$sg_search_type_container_map$ = null;
        sg_search.$sg_current_node$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIORITY-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY-QUEUE-P"), (SubLObject)SubLObjectFactory.makeSymbol("P-QUEUE-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("P-ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("P-DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-P-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STACK"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-P"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-PUSH"), (SubLObject)SubLObjectFactory.makeSymbol("STACK-POP"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $list1 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC-LIST"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("BEST-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("BREADTH-FIRST"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("STACK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BREADTH-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEST-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY-QUEUE")));
        $kw4$SEARCH_TYPE = SubLObjectFactory.makeKeyword("SEARCH-TYPE");
        $kw5$PRIORITY_QUEUE = SubLObjectFactory.makeKeyword("PRIORITY-QUEUE");
        $kw6$RANKING_FUNCTION = SubLObjectFactory.makeKeyword("RANKING-FUNCTION");
        $sym7$_ = SubLObjectFactory.makeSymbol(">");
        $kw8$SG_SEARCH_TYPE = SubLObjectFactory.makeKeyword("SG-SEARCH-TYPE");
        $str9$__SG_SEARCH__TYPE__a_ = SubLObjectFactory.makeString("#<SG-SEARCH :TYPE ~a>");
        $kw10$EXPAND_FUNCTION = SubLObjectFactory.makeKeyword("EXPAND-FUNCTION");
        $kw11$DEPTH_EXCEDED_FUNCTION = SubLObjectFactory.makeKeyword("DEPTH-EXCEDED-FUNCTION");
        $kw12$OPTIONS_FUNCTION = SubLObjectFactory.makeKeyword("OPTIONS-FUNCTION");
        $kw13$GOAL_FUNCTION = SubLObjectFactory.makeKeyword("GOAL-FUNCTION");
        $kw14$ADD_GOAL_FUNCTION = SubLObjectFactory.makeKeyword("ADD-GOAL-FUNCTION");
        $kw15$ACTIVE_MODULES = SubLObjectFactory.makeKeyword("ACTIVE-MODULES");
        $sym16$SG_CONTAINER_EMPTY_P = SubLObjectFactory.makeSymbol("SG-CONTAINER-EMPTY-P");
        $sym17$SG_CONTAINER_NEXT_NODE = SubLObjectFactory.makeSymbol("SG-CONTAINER-NEXT-NODE");
        $sym18$SG_CONTAINER_ADD = SubLObjectFactory.makeSymbol("SG-CONTAINER-ADD");
        $sym19$SG_PRINT_SEARCH = SubLObjectFactory.makeSymbol("SG-PRINT-SEARCH");
    }
}

/*

	Total time: 31 ms
	
*/
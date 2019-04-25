package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_markable extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_markable";
    public static final String myFingerPrint = "eadfbb3ae0c746a8d3199acd44a8338b32efa89d8cbb366d0b8cbd4264164676";
    private static final SubLSymbol $sym0$SUBLOOP_MARKABLE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$SUBLOOP_MARKABLE_TEMPLATE;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CLEAR_ALL_MARKS;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ADD_MARK;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$REMOVE_MARK;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$HAS_MARK_P;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-markable.lisp", position = 822L)
    public static SubLObject subloop_markable_p(final SubLObject v_subloop_markable) {
        return interfaces.subloop_instanceof_interface(v_subloop_markable, (SubLObject)subloop_markable.$sym0$SUBLOOP_MARKABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-markable.lisp", position = 1061L)
    public static SubLObject subloop_markable_template_p(final SubLObject subloop_markable_template) {
        return interfaces.subloop_instanceof_interface(subloop_markable_template, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE);
    }
    
    public static SubLObject declare_subloop_markable_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_markable", "subloop_markable_p", "SUBLOOP-MARKABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_markable", "subloop_markable_template_p", "SUBLOOP-MARKABLE-TEMPLATE-P", 1, 0, false);
        return (SubLObject)subloop_markable.NIL;
    }
    
    public static SubLObject init_subloop_markable_file() {
        return (SubLObject)subloop_markable.NIL;
    }
    
    public static SubLObject setup_subloop_markable_file() {
        interfaces.new_interface((SubLObject)subloop_markable.$sym0$SUBLOOP_MARKABLE, (SubLObject)subloop_markable.NIL, (SubLObject)subloop_markable.NIL, (SubLObject)subloop_markable.$list1);
        interfaces.new_interface((SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list3, (SubLObject)subloop_markable.$list4, (SubLObject)subloop_markable.$list5);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_markable.$sym6$CLEAR_ALL_MARKS, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list7, (SubLObject)subloop_markable.NIL, (SubLObject)subloop_markable.$list8);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_markable.$sym9$ADD_MARK, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list7, (SubLObject)subloop_markable.$list10, (SubLObject)subloop_markable.$list11);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_markable.$sym12$REMOVE_MARK, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list7, (SubLObject)subloop_markable.$list10, (SubLObject)subloop_markable.$list13);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_markable.$sym14$HAS_MARK_P, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list7, (SubLObject)subloop_markable.$list10, (SubLObject)subloop_markable.$list15);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_markable.$sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$sym2$SUBLOOP_MARKABLE_TEMPLATE, (SubLObject)subloop_markable.$list7, (SubLObject)subloop_markable.NIL, (SubLObject)subloop_markable.$list17);
        return (SubLObject)subloop_markable.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subloop_markable_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subloop_markable_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subloop_markable_file();
    }
    
    static {
        me = (SubLFile)new subloop_markable();
        $sym0$SUBLOOP_MARKABLE = SubLObjectFactory.makeSymbol("SUBLOOP-MARKABLE");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-ALL-MARKS"), (SubLObject)subloop_markable.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-MARK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-MARK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-MARK-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym2$SUBLOOP_MARKABLE_TEMPLATE = SubLObjectFactory.makeSymbol("SUBLOOP-MARKABLE-TEMPLATE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-MARKABLE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-MARKABLE")));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MARKS-INTERNAL"), (SubLObject)subloop_markable.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-MARKS-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MARKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE"), (SubLObject)subloop_markable.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym6$CLEAR_ALL_MARKS = SubLObjectFactory.makeSymbol("CLEAR-ALL-MARKS");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_markable.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_markable.NIL));
        $sym9$ADD_MARK = SubLObjectFactory.makeSymbol("ADD-MARK");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MARK"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-MARKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("MARK"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("MARK"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-MARKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-MARKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MARK")));
        $sym12$REMOVE_MARK = SubLObjectFactory.makeSymbol("REMOVE-MARK");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("MARK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MARK")));
        $sym14$HAS_MARK_P = SubLObjectFactory.makeSymbol("HAS-MARK-P");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("MARK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)subloop_markable.T, (SubLObject)subloop_markable.NIL)));
        $sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE = SubLObjectFactory.makeSymbol("INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MARKS-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_markable.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
    }
}

/*

	Total time: 88 ms
	
*/
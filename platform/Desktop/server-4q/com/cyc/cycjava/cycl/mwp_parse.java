package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mwp_parse extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mwp_parse";
    public static final String myFingerPrint = "921fd79759a98a8deac852060ad70d2fe9e69a15b6ece7b9cf0ee0216f10b465";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$MWP_PARSE_P;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CSETQ;
    private static final SubLSymbol $sym4$PUTF;
    private static final SubLSymbol $kw5$TYPE;
    private static final SubLSymbol $kw6$DENOT;
    private static final SubLSymbol $kw7$POS_PRED;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym10$MWP_PARSE_SET_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1223L)
    public static SubLObject mwp_parse_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1338L)
    public static SubLObject new_mwp_parse() {
        return mwp_parse_copy((SubLObject)mwp_parse.$list0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1423L)
    public static SubLObject mwp_parse_copy(final SubLObject parse) {
        assert mwp_parse.NIL != mwp_parse_p(parse) : parse;
        return conses_high.copy_list(parse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1525L)
    public static SubLObject mwp_parse_lookup(final SubLObject v_mwp_parse, final SubLObject key) {
        return conses_high.getf(v_mwp_parse, key, (SubLObject)mwp_parse.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1646L)
    public static SubLObject mwp_parse_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_mwp_parse = (SubLObject)mwp_parse.NIL;
        SubLObject key = (SubLObject)mwp_parse.NIL;
        SubLObject value = (SubLObject)mwp_parse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mwp_parse.$list2);
        v_mwp_parse = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mwp_parse.$list2);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mwp_parse.$list2);
        value = current.first();
        current = current.rest();
        if (mwp_parse.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)mwp_parse.$sym3$CSETQ, v_mwp_parse, (SubLObject)ConsesLow.list((SubLObject)mwp_parse.$sym4$PUTF, v_mwp_parse, key, value));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mwp_parse.$list2);
        return (SubLObject)mwp_parse.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1870L)
    public static SubLObject mwp_parse_type(final SubLObject v_mwp_parse) {
        assert mwp_parse.NIL != mwp_parse_p(v_mwp_parse) : v_mwp_parse;
        return conses_high.getf(v_mwp_parse, (SubLObject)mwp_parse.$kw5$TYPE, (SubLObject)mwp_parse.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 1985L)
    public static SubLObject mwp_parse_denot(final SubLObject v_mwp_parse) {
        assert mwp_parse.NIL != mwp_parse_p(v_mwp_parse) : v_mwp_parse;
        return conses_high.getf(v_mwp_parse, (SubLObject)mwp_parse.$kw6$DENOT, (SubLObject)mwp_parse.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2102L)
    public static SubLObject mwp_parse_pos_pred(final SubLObject v_mwp_parse) {
        assert mwp_parse.NIL != mwp_parse_p(v_mwp_parse) : v_mwp_parse;
        return conses_high.getf(v_mwp_parse, (SubLObject)mwp_parse.$kw7$POS_PRED, (SubLObject)mwp_parse.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2225L)
    public static SubLObject mwp_parse_destructuring_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = (SubLObject)mwp_parse.NIL;
        SubLObject parse = (SubLObject)mwp_parse.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mwp_parse.$list8);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mwp_parse.$list8);
        parse = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mwp_parse.$sym9$CDESTRUCTURING_BIND, pattern, parse, ConsesLow.append(body, (SubLObject)mwp_parse.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2360L)
    public static SubLObject mwp_parse_set_p(final SubLObject obj) {
        return set.set_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2623L)
    public static SubLObject new_mwp_parse_set() {
        return set.new_set(Symbols.symbol_function((SubLObject)mwp_parse.EQUAL), (SubLObject)mwp_parse.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2690L)
    public static SubLObject mwp_parse_set_add(final SubLObject v_set, final SubLObject parse) {
        return set.set_add(parse, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 2830L)
    public static SubLObject mwp_parse_set_union(final SubLObject sets) {
        final SubLObject ok_sets = list_utilities.remove_if_not((SubLObject)mwp_parse.$sym10$MWP_PARSE_SET_P, sets, (SubLObject)mwp_parse.UNPROVIDED, (SubLObject)mwp_parse.UNPROVIDED, (SubLObject)mwp_parse.UNPROVIDED, (SubLObject)mwp_parse.UNPROVIDED);
        return (mwp_parse.NIL != ok_sets) ? set_utilities.set_union(ok_sets, Symbols.symbol_function((SubLObject)mwp_parse.EQUAL)) : new_mwp_parse_set();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mwp-parse.lisp", position = 3023L)
    public static SubLObject mwp_parse_set_copy(final SubLObject v_set) {
        return set_utilities.construct_set_from_list(set.set_element_list(v_set), Symbols.symbol_function((SubLObject)mwp_parse.EQUAL), (SubLObject)mwp_parse.UNPROVIDED);
    }
    
    public static SubLObject declare_mwp_parse_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_p", "MWP-PARSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "new_mwp_parse", "NEW-MWP-PARSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_copy", "MWP-PARSE-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_lookup", "MWP-PARSE-LOOKUP", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_update", "MWP-PARSE-UPDATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_type", "MWP-PARSE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_denot", "MWP-PARSE-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_pos_pred", "MWP-PARSE-POS-PRED", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_destructuring_bind", "MWP-PARSE-DESTRUCTURING-BIND");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_set_p", "MWP-PARSE-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "new_mwp_parse_set", "NEW-MWP-PARSE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_set_add", "MWP-PARSE-SET-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_set_union", "MWP-PARSE-SET-UNION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mwp_parse", "mwp_parse_set_copy", "MWP-PARSE-SET-COPY", 1, 0, false);
        return (SubLObject)mwp_parse.NIL;
    }
    
    public static SubLObject init_mwp_parse_file() {
        return (SubLObject)mwp_parse.NIL;
    }
    
    public static SubLObject setup_mwp_parse_file() {
        return (SubLObject)mwp_parse.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_mwp_parse_file();
    }
    
    @Override
	public void initializeVariables() {
        init_mwp_parse_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_mwp_parse_file();
    }
    
    static {
        me = (SubLFile)new mwp_parse();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS"), (SubLObject)mwp_parse.T);
        $sym1$MWP_PARSE_P = SubLObjectFactory.makeSymbol("MWP-PARSE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MWP-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym3$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym4$PUTF = SubLObjectFactory.makeSymbol("PUTF");
        $kw5$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw6$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw7$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym9$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym10$MWP_PARSE_SET_P = SubLObjectFactory.makeSymbol("MWP-PARSE-SET-P");
    }
}

/*

	Total time: 94 ms
	
*/
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion_interface extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_interface";
    public static final String myFingerPrint = "19be7027efccf598d4148d8970f0f917a121ea7805de0483c33f599d58cef964";
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLSymbol $sym1$FIXNUMP;
    private static final SubLSymbol $sym2$KB_CONSTANT_COMPLETE_EXACT;
    private static final SubLSymbol $sym3$QUOTE;
    private static final SubLList $list4;
    private static final SubLString $str5$Return_a_valid_constant_whose_nam;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$BOOLEANP;
    private static final SubLSymbol $sym9$KB_CONSTANT_COMPLETE;
    private static final SubLList $list10;
    private static final SubLString $str11$Return_all_valid_constants_with_P;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$KB_CONSTANT_APROPOS;
    private static final SubLList $list15;
    private static final SubLString $str16$Return_all_valid_constants_with_S;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$KB_CONSTANT_POSTFIX;
    private static final SubLList $list19;
    private static final SubLString $str20$Return_all_valid_constants_with_P;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym23$KB_N_CONSTANTS_BEFORE;
    private static final SubLList $list24;
    private static final SubLString $str25$Return_the_N_constants_with_names;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$KB_N_CONSTANTS_AFTER;
    private static final SubLString $str28$Return_the_N_constants_with_names;
    private static final SubLSymbol $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL;
    private static final SubLSymbol $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 846L)
    public static SubLObject kb_constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(string, constant_completion_interface.$sym0$STRINGP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym2$KB_CONSTANT_COMPLETE_EXACT, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, string), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_complete_exact_internal(string, start, end);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 1651L)
    public static SubLObject kb_constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.NIL;
        }
        if (exact_lengthP == constant_completion_interface.UNPROVIDED) {
            exact_lengthP = (SubLObject)constant_completion_interface.NIL;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(prefix, constant_completion_interface.$sym0$STRINGP);
        enforceType(case_sensitiveP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(exact_lengthP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym9$KB_CONSTANT_COMPLETE, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, prefix), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, case_sensitiveP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, exact_lengthP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_complete_internal(prefix, case_sensitiveP, exact_lengthP, start, end);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 2765L)
    public static SubLObject kb_constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.NIL;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(substring, constant_completion_interface.$sym0$STRINGP);
        enforceType(case_sensitiveP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym14$KB_CONSTANT_APROPOS, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, substring), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, case_sensitiveP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_apropos_internal(substring, case_sensitiveP, start, end);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 3745L)
    public static SubLObject kb_constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.NIL;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(postfix, constant_completion_interface.$sym0$STRINGP);
        enforceType(case_sensitiveP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym18$KB_CONSTANT_POSTFIX, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, postfix), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, case_sensitiveP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_postfix_internal(postfix, case_sensitiveP, start, end);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 4720L)
    public static SubLObject kb_n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.NIL;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        if (strictP == constant_completion_interface.UNPROVIDED) {
            strictP = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(n, constant_completion_interface.$sym22$NON_NEGATIVE_INTEGER_P);
        enforceType(string, constant_completion_interface.$sym0$STRINGP);
        enforceType(case_sensitiveP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym23$KB_N_CONSTANTS_BEFORE, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, n), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, string), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, case_sensitiveP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, strictP)));
        }
        final SubLObject result = constant_completion_low.kb_n_constants_before_internal(n, string, case_sensitiveP, start, end, strictP);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 5798L)
    public static SubLObject kb_n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.NIL;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        if (strictP == constant_completion_interface.UNPROVIDED) {
            strictP = (SubLObject)constant_completion_interface.NIL;
        }
        enforceType(n, constant_completion_interface.$sym22$NON_NEGATIVE_INTEGER_P);
        enforceType(string, constant_completion_interface.$sym0$STRINGP);
        enforceType(case_sensitiveP, constant_completion_interface.$sym8$BOOLEANP);
        enforceType(start, constant_completion_interface.$sym1$FIXNUMP);
        if (constant_completion_interface.NIL != end) {
            enforceType(end, constant_completion_interface.$sym1$FIXNUMP);
        }
        if (constant_completion_interface.NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym27$KB_N_CONSTANTS_AFTER, (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, n), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, string), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, case_sensitiveP), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, start), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, end), (SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym3$QUOTE, strictP)));
        }
        final SubLObject result = constant_completion_low.kb_n_constants_after_internal(n, string, case_sensitiveP, start, end, strictP);
        if (constant_completion_interface.NIL != result) {
            return result;
        }
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 6871L)
    public static SubLObject kb_new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == constant_completion_interface.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_interface.T;
        }
        if (buffer_size == constant_completion_interface.UNPROVIDED) {
            buffer_size = (SubLObject)constant_completion_interface.ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(forwardP)), buffer_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 7153L)
    public static SubLObject kb_new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == constant_completion_interface.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_interface.T;
        }
        if (start == constant_completion_interface.UNPROVIDED) {
            start = (SubLObject)constant_completion_interface.ZERO_INTEGER;
        }
        if (end == constant_completion_interface.UNPROVIDED) {
            end = (SubLObject)constant_completion_interface.NIL;
        }
        if (forwardP == constant_completion_interface.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_interface.T;
        }
        if (buffer_size == constant_completion_interface.UNPROVIDED) {
            buffer_size = (SubLObject)constant_completion_interface.ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator((SubLObject)ConsesLow.list((SubLObject)constant_completion_interface.$sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(string), list_utilities.quotify(case_sensitiveP), list_utilities.quotify(start), list_utilities.quotify(end), list_utilities.quotify(forwardP)), buffer_size);
    }
    
    public static SubLObject declare_constant_completion_interface_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_constant_complete_exact", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_constant_complete", "KB-CONSTANT-COMPLETE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_constant_apropos", "KB-CONSTANT-APROPOS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_constant_postfix", "KB-CONSTANT-POSTFIX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_n_constants_before", "KB-N-CONSTANTS-BEFORE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_n_constants_after", "KB-N-CONSTANTS-AFTER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_new_constant_completion_iterator", "KB-NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_interface", "kb_new_directed_constant_completion_iterator", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    public static SubLObject init_constant_completion_interface_file() {
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    public static SubLObject setup_constant_completion_interface_file() {
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym2$KB_CONSTANT_COMPLETE_EXACT, (SubLObject)constant_completion_interface.$list4, (SubLObject)constant_completion_interface.$str5$Return_a_valid_constant_whose_nam, (SubLObject)constant_completion_interface.$list6, (SubLObject)constant_completion_interface.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym9$KB_CONSTANT_COMPLETE, (SubLObject)constant_completion_interface.$list10, (SubLObject)constant_completion_interface.$str11$Return_all_valid_constants_with_P, (SubLObject)constant_completion_interface.$list12, (SubLObject)constant_completion_interface.$list13);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym14$KB_CONSTANT_APROPOS, (SubLObject)constant_completion_interface.$list15, (SubLObject)constant_completion_interface.$str16$Return_all_valid_constants_with_S, (SubLObject)constant_completion_interface.$list17, (SubLObject)constant_completion_interface.$list13);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym18$KB_CONSTANT_POSTFIX, (SubLObject)constant_completion_interface.$list19, (SubLObject)constant_completion_interface.$str20$Return_all_valid_constants_with_P, (SubLObject)constant_completion_interface.$list21, (SubLObject)constant_completion_interface.$list13);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym23$KB_N_CONSTANTS_BEFORE, (SubLObject)constant_completion_interface.$list24, (SubLObject)constant_completion_interface.$str25$Return_the_N_constants_with_names, (SubLObject)constant_completion_interface.$list26, (SubLObject)constant_completion_interface.$list13);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_interface.$sym27$KB_N_CONSTANTS_AFTER, (SubLObject)constant_completion_interface.$list24, (SubLObject)constant_completion_interface.$str28$Return_the_N_constants_with_names, (SubLObject)constant_completion_interface.$list26, (SubLObject)constant_completion_interface.$list13);
        return (SubLObject)constant_completion_interface.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_constant_completion_interface_file();
    }
    
    @Override
	public void initializeVariables() {
        init_constant_completion_interface_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_constant_completion_interface_file();
    }
    
    static {
        me = (SubLFile)new constant_completion_interface();
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym1$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $sym2$KB_CONSTANT_COMPLETE_EXACT = SubLObjectFactory.makeSymbol("KB-CONSTANT-COMPLETE-EXACT");
        $sym3$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_interface.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str5$Return_a_valid_constant_whose_nam = SubLObjectFactory.makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $sym8$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym9$KB_CONSTANT_COMPLETE = SubLObjectFactory.makeSymbol("KB-CONSTANT-COMPLETE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("EXACT-LENGTH?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_interface.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str11$Return_all_valid_constants_with_P = SubLObjectFactory.makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXACT-LENGTH?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $sym14$KB_CONSTANT_APROPOS = SubLObjectFactory.makeSymbol("KB-CONSTANT-APROPOS");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_interface.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str16$Return_all_valid_constants_with_S = SubLObjectFactory.makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $sym18$KB_CONSTANT_POSTFIX = SubLObjectFactory.makeSymbol("KB-CONSTANT-POSTFIX");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSTFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_interface.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str20$Return_all_valid_constants_with_P = SubLObjectFactory.makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSTFIX"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $sym22$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym23$KB_N_CONSTANTS_BEFORE = SubLObjectFactory.makeSymbol("KB-N-CONSTANTS-BEFORE");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_interface.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("STRICT?"));
        $str25$Return_the_N_constants_with_names = SubLObjectFactory.makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $sym27$KB_N_CONSTANTS_AFTER = SubLObjectFactory.makeSymbol("KB-N-CONSTANTS-AFTER");
        $str28$Return_the_N_constants_with_names = SubLObjectFactory.makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");
        $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL = SubLObjectFactory.makeSymbol("KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL");
        $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL = SubLObjectFactory.makeSymbol("KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL");
    }
}

/*

	Total time: 55 ms
	
*/
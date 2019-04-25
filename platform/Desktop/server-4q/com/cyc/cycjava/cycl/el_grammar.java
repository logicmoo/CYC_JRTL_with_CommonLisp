package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_grammar extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.el_grammar";
    public static final String myFingerPrint = "9c6b172de675f1cda7b8e8735986fe64cb2b7072d1154ef8cdf656040ec1c6e8";
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 776L)
    public static SubLObject why_not_el_sentence(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result1 = (SubLObject)el_grammar.NIL;
        SubLObject result2 = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject res1 = cycl_grammar.why_not_cycl_sentence(v_object);
            final SubLObject res2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result1 = res1;
            result2 = res2;
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result1, result2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 1182L)
    public static SubLObject el_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 1407L)
    public static SubLObject el_non_formula_sentence_p(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(el_grammar.NIL == el_utilities.el_formula_p(sentence) && el_grammar.NIL != el_sentence_p(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 1691L)
    public static SubLObject non_el_formula_sentence_p(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(el_grammar.NIL == el_utilities.el_formula_p(sentence) && el_grammar.NIL != cycl_grammar.cycl_sentence_p(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 1995L)
    public static SubLObject el_sentence_sequence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_sentence_sequence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 2247L)
    public static SubLObject el_unary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_unary_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 2490L)
    public static SubLObject el_binary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_binary_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 2736L)
    public static SubLObject el_ternary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_ternary_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 2985L)
    public static SubLObject el_quaternary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_quaternary_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 3243L)
    public static SubLObject el_quintary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_quintary_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 3495L)
    public static SubLObject el_variable_arity_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_variable_arity_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 3765L)
    public static SubLObject el_regularly_quantified_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_regularly_quantified_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 4053L)
    public static SubLObject el_bounded_existential_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_bounded_existential_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 4338L)
    public static SubLObject el_quantified_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_quantified_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 4596L)
    public static SubLObject el_literal_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_literal_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 4818L)
    public static SubLObject el_atomic_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_atomic_sentence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 5064L)
    public static SubLObject el_argument_sequence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_argument_sequence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 5316L)
    public static SubLObject el_predicate_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_predicate_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 5551L)
    public static SubLObject el_nat_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_nat_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 5761L)
    public static SubLObject el_function_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_function_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 5986L)
    public static SubLObject el_expression_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_expression_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 6217L)
    public static SubLObject el_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_term_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 6430L)
    public static SubLObject el_denotational_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_denotational_term_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-grammar.lisp", position = 6682L)
    public static SubLObject el_represented_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)el_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)el_grammar.NIL, thread);
            result = cycl_grammar.cycl_represented_term_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_el_grammar_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "why_not_el_sentence", "WHY-NOT-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_sentence_p", "EL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_non_formula_sentence_p", "EL-NON-FORMULA-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "non_el_formula_sentence_p", "NON-EL-FORMULA-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_sentence_sequence_p", "EL-SENTENCE-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_unary_sentence_p", "EL-UNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_binary_sentence_p", "EL-BINARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_ternary_sentence_p", "EL-TERNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_quaternary_sentence_p", "EL-QUATERNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_quintary_sentence_p", "EL-QUINTARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_variable_arity_sentence_p", "EL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_regularly_quantified_sentence_p", "EL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_bounded_existential_sentence_p", "EL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_quantified_sentence_p", "EL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_literal_p", "EL-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_atomic_sentence_p", "EL-ATOMIC-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_argument_sequence_p", "EL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_predicate_syntax_p", "EL-PREDICATE-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_nat_p", "EL-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_function_p", "EL-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_expression_p", "EL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_term_p", "EL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_denotational_term_p", "EL-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_grammar", "el_represented_term_p", "EL-REPRESENTED-TERM-P", 1, 0, false);
        return (SubLObject)el_grammar.NIL;
    }
    
    public static SubLObject init_el_grammar_file() {
        return (SubLObject)el_grammar.NIL;
    }
    
    public static SubLObject setup_el_grammar_file() {
        return (SubLObject)el_grammar.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_el_grammar_file();
    }
    
    @Override
	public void initializeVariables() {
        init_el_grammar_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_el_grammar_file();
    }
    
    static {
        me = (SubLFile)new el_grammar();
    }
}

/*

	Total time: 921 ms
	
*/
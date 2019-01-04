package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class test_case_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.test_case_generator";
    public static final String myFingerPrint = "f2b523af83910aacd935fe520254223fa8f68f4060f10c1d5e0b86fc9dc905e6";
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18264L)
    private static SubLSymbol $parse_tree_test_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18453L)
    private static SubLSymbol $parse_tree_syntax_test_file$;
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18592L)
    private static SubLSymbol $cyclifier_test_file$;
    private static final SubLSymbol $sym0$SYMBOLP;
    private static final SubLSymbol $sym1$STRINGP;
    private static final SubLSymbol $sym2$LISTP;
    private static final SubLString $str3$No_such_file___a;
    private static final SubLSymbol $kw4$APPEND;
    private static final SubLString $str5$Unable_to_open__S;
    private static final SubLString $str6$Appending_test_cases_to_;
    private static final SubLString $str7$___;
    private static final SubLSymbol $kw8$INPUT;
    private static final SubLString $str9$_;
    private static final SubLSymbol $sym10$NEW;
    private static final SubLSymbol $sym11$GET_TEST_CASE_DEF;
    private static final SubLSymbol $sym12$GET_TEST_CASE_COMMENT;
    private static final SubLString $str13$Appending_test_case_to_;
    private static final SubLSymbol $sym14$TEST_CASE_GENERATOR;
    private static final SubLSymbol $sym15$OBJECT;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$NAME;
    private static final SubLSymbol $sym18$DATUM;
    private static final SubLSymbol $sym19$CATEGORIES;
    private static final SubLSymbol $sym20$SYSTEM;
    private static final SubLSymbol $sym21$MODULE;
    private static final SubLSymbol $sym22$INSTANCE_COUNT;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS;
    private static final SubLSymbol $sym24$ISOLATED_P;
    private static final SubLSymbol $sym25$INSTANCE_NUMBER;
    private static final SubLSymbol $sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$TEST_CASE_GENERATOR_NEW_METHOD;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$GET_METHOD_DEFS;
    private static final SubLSymbol $sym33$GET_METHOD_DECLS;
    private static final SubLSymbol $sym34$GET_TEST_CASE_DECL;
    private static final SubLSymbol $sym35$GET_SETUP_DEF;
    private static final SubLSymbol $sym36$GET_CLEANUP_DEF;
    private static final SubLSymbol $sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
    private static final SubLSymbol $sym41$DEF_SETUP_METHOD;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
    private static final SubLSymbol $sym46$DEF_CLEANUP_METHOD;
    private static final SubLSymbol $sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$DEF_INSTANCE_METHOD;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD;
    private static final SubLString $str55$_________TEST___a_____CATEGORIES_;
    private static final SubLSymbol $sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD;
    private static final SubLSymbol $sym57$CYCLIFIER_TEST_CASE_GENERATOR;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$PARSE_EXPRESSION;
    private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS;
    private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD;
    private static final SubLSymbol $sym67$DEFINE_TEST_CASE;
    private static final SubLSymbol $kw68$CATEGORIES;
    private static final SubLSymbol $sym69$QUOTE;
    private static final SubLSymbol $sym70$PARSE_TREE;
    private static final SubLSymbol $kw71$INSTANCE;
    private static final SubLSymbol $kw72$PRIVATE;
    private static final SubLSymbol $kw73$VALUE;
    private static final SubLSymbol $sym74$NEW_PARSE_TREE;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD;
    private static final SubLString $str80$TEST_1;
    private static final SubLSymbol $sym81$CYCLIFY;
    private static final SubLSymbol $sym82$FAIL_UNLESS_EQUAL;
    private static final SubLSymbol $sym83$SELF;
    private static final SubLList $list84;
    private static final SubLString $str85$_cyclify__;
    private static final SubLString $str86$_______;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$DEF_TEST_METHOD;
    private static final SubLSymbol $sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD;
    private static final SubLSymbol $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
    private static final SubLSymbol $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
    private static final SubLSymbol $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR;
    private static final SubLSymbol $sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD;
    private static final SubLSymbol $kw96$CLASS;
    private static final SubLSymbol $sym97$PROCESS_MODIFIERS;
    private static final SubLSymbol $sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD;
    private static final SubLList $list101;
    private static final SubLString $str102$TEST_;
    private static final SubLSymbol $sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD;
    private static final SubLSymbol $sym104$FIM;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$LIST;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$GET_DESCENDANT;
    private static final SubLString $str109$_;
    private static final SubLString $str110$_;
    private static final SubLString $str111$__;
    private static final SubLSymbol $sym112$GET_CATEGORY;
    private static final SubLSymbol $sym113$GET_STRING;
    private static final SubLString $str114$_;
    private static final SubLString $str115$______;
    private static final SubLString $str116$_;
    private static final SubLString $str117$TEST_CASE_;
    private static final SubLSymbol $sym118$IMPLEMENTS_METHOD_P;
    private static final SubLSymbol $sym119$GET_PATH;
    private static final SubLSymbol $kw120$DFR2L;
    private static final SubLSymbol $kw121$DFL2R;
    private static final SubLString $str122$_S_is_not_one_of__S;
    private static final SubLSymbol $sym123$EVAL;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$EQUALS_EL_;
    private static final SubLString $str126$__cvs_head_cycorp_cyc_top_tests_;
    private static final SubLString $str127$_parse_tree_syntax_tests_lisp;
    private static final SubLString $str128$cyclifier_tests_lisp;
    private static final SubLList $list129;
    private static final SubLString $str130$parse_tree;
    private static final SubLString $str131$cycl;
    private static final SubLList $list132;
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 1530L)
    public static SubLObject add_test_cases(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert test_case_generator.NIL != Types.symbolp(generator_class) : generator_class;
        assert test_case_generator.NIL != Types.stringp(module) : module;
        assert test_case_generator.NIL != Types.stringp(system) : system;
        assert test_case_generator.NIL != Types.listp(categories) : categories;
        assert test_case_generator.NIL != Types.stringp(in_file) : in_file;
        assert test_case_generator.NIL != Types.stringp(out_file) : out_file;
        if (test_case_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && test_case_generator.NIL == Filesys.probe_file(in_file)) {
            Errors.error((SubLObject)test_case_generator.$str3$No_such_file___a, in_file);
        }
        SubLObject i = (SubLObject)test_case_generator.ZERO_INTEGER;
        SubLObject stream = (SubLObject)test_case_generator.NIL;
        try {
            stream = compatibility.open_text(out_file, (SubLObject)test_case_generator.$kw4$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)test_case_generator.$str5$Unable_to_open__S, out_file);
            }
            final SubLObject out = stream;
            print_high.princ((SubLObject)test_case_generator.$str6$Appending_test_cases_to_, (SubLObject)test_case_generator.UNPROVIDED);
            print_high.princ(out_file, (SubLObject)test_case_generator.UNPROVIDED);
            print_high.princ((SubLObject)test_case_generator.$str7$___, (SubLObject)test_case_generator.UNPROVIDED);
            streams_high.terpri((SubLObject)test_case_generator.UNPROVIDED);
            SubLObject stream_$1 = (SubLObject)test_case_generator.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)test_case_generator.NIL, thread);
                    stream_$1 = compatibility.open_text(in_file, (SubLObject)test_case_generator.$kw8$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$1.isStream()) {
                    Errors.error((SubLObject)test_case_generator.$str5$Unable_to_open__S, in_file);
                }
                final SubLObject infile = stream_$1;
                if (infile.isStream()) {
                    SubLObject datum;
                    SubLObject generator;
                    SubLObject declaration;
                    SubLObject definitions;
                    for (datum = (SubLObject)test_case_generator.NIL, datum = file_utilities.cdolines_get_next_line(infile); test_case_generator.NIL != datum; datum = file_utilities.cdolines_get_next_line(infile)) {
                        if (test_case_generator.NIL != string_utilities.whitespace_stringP(datum) || test_case_generator.NIL != string_utilities.starts_with(datum, (SubLObject)test_case_generator.$str9$_)) {
                            print_high.prin1(datum, out);
                            streams_high.terpri(out);
                        }
                        else {
                            generator = methods.funcall_class_method_with_4_args(generator_class, (SubLObject)test_case_generator.$sym10$NEW, module, system, datum, categories);
                            thread.resetMultipleValues();
                            declaration = methods.funcall_instance_method_with_0_args(generator, (SubLObject)test_case_generator.$sym11$GET_TEST_CASE_DEF);
                            definitions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            print_high.princ(datum, (SubLObject)test_case_generator.UNPROVIDED);
                            streams_high.terpri((SubLObject)test_case_generator.UNPROVIDED);
                            dump_test_case(methods.funcall_instance_method_with_0_args(generator, (SubLObject)test_case_generator.$sym12$GET_TEST_CASE_COMMENT), declaration, definitions, out);
                            i = Numbers.add(i, Numbers.subtract(Sequences.length(definitions), (SubLObject)test_case_generator.TWO_INTEGER));
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$1.isStream()) {
                        streams_high.close(stream_$1, (SubLObject)test_case_generator.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)test_case_generator.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 3311L)
    public static SubLObject add_test_case(final SubLObject generator_class, final SubLObject module, final SubLObject system, final SubLObject categories, final SubLObject datum, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert test_case_generator.NIL != Types.symbolp(generator_class) : generator_class;
        assert test_case_generator.NIL != Types.stringp(module) : module;
        assert test_case_generator.NIL != Types.stringp(system) : system;
        assert test_case_generator.NIL != Types.listp(categories) : categories;
        assert test_case_generator.NIL != Types.stringp(out_file) : out_file;
        SubLObject i = (SubLObject)test_case_generator.NIL;
        SubLObject stream = (SubLObject)test_case_generator.NIL;
        try {
            stream = compatibility.open_text(out_file, (SubLObject)test_case_generator.$kw4$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)test_case_generator.$str5$Unable_to_open__S, out_file);
            }
            final SubLObject out = stream;
            print_high.princ((SubLObject)test_case_generator.$str13$Appending_test_case_to_, (SubLObject)test_case_generator.UNPROVIDED);
            print_high.princ(out_file, (SubLObject)test_case_generator.UNPROVIDED);
            print_high.princ((SubLObject)test_case_generator.$str7$___, (SubLObject)test_case_generator.UNPROVIDED);
            streams_high.terpri((SubLObject)test_case_generator.UNPROVIDED);
            final SubLObject generator = methods.funcall_class_method_with_4_args(generator_class, (SubLObject)test_case_generator.$sym10$NEW, module, system, datum, categories);
            thread.resetMultipleValues();
            final SubLObject declaration = methods.funcall_instance_method_with_0_args(generator, (SubLObject)test_case_generator.$sym11$GET_TEST_CASE_DEF);
            final SubLObject definitions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            print_high.princ(datum, (SubLObject)test_case_generator.UNPROVIDED);
            streams_high.terpri((SubLObject)test_case_generator.UNPROVIDED);
            dump_test_case(methods.funcall_instance_method_with_0_args(generator, (SubLObject)test_case_generator.$sym12$GET_TEST_CASE_COMMENT), declaration, definitions, out);
            i = Numbers.subtract(Sequences.length(definitions), (SubLObject)test_case_generator.TWO_INTEGER);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)test_case_generator.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject get_test_case_generator_name(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, (SubLObject)test_case_generator.FIVE_INTEGER, (SubLObject)test_case_generator.$sym17$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject set_test_case_generator_name(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, (SubLObject)test_case_generator.FIVE_INTEGER, (SubLObject)test_case_generator.$sym17$NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject get_test_case_generator_datum(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, (SubLObject)test_case_generator.FOUR_INTEGER, (SubLObject)test_case_generator.$sym18$DATUM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject set_test_case_generator_datum(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, (SubLObject)test_case_generator.FOUR_INTEGER, (SubLObject)test_case_generator.$sym18$DATUM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject get_test_case_generator_categories(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, (SubLObject)test_case_generator.THREE_INTEGER, (SubLObject)test_case_generator.$sym19$CATEGORIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject set_test_case_generator_categories(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, (SubLObject)test_case_generator.THREE_INTEGER, (SubLObject)test_case_generator.$sym19$CATEGORIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject get_test_case_generator_system(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, (SubLObject)test_case_generator.TWO_INTEGER, (SubLObject)test_case_generator.$sym20$SYSTEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject set_test_case_generator_system(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, (SubLObject)test_case_generator.TWO_INTEGER, (SubLObject)test_case_generator.$sym20$SYSTEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject get_test_case_generator_module(final SubLObject v_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(v_test_case_generator, (SubLObject)test_case_generator.ONE_INTEGER, (SubLObject)test_case_generator.$sym21$MODULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject set_test_case_generator_module(final SubLObject v_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_test_case_generator, value, (SubLObject)test_case_generator.ONE_INTEGER, (SubLObject)test_case_generator.$sym21$MODULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject subloop_reserved_initialize_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym22$INSTANCE_COUNT, (SubLObject)test_case_generator.ZERO_INTEGER);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject subloop_reserved_initialize_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym24$ISOLATED_P, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym25$INSTANCE_NUMBER, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym21$MODULE, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym20$SYSTEM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym19$CATEGORIES, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym18$DATUM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym17$NAME, (SubLObject)test_case_generator.NIL);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 4629L)
    public static SubLObject test_case_generator_p(final SubLObject v_test_case_generator) {
        return classes.subloop_instanceof_class(v_test_case_generator, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 5441L)
    public static SubLObject test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        assert test_case_generator.NIL != Types.listp(categories0) : categories0;
        final SubLObject generator = object.new_class_instance(self);
        set_test_case_generator_module(generator, module0);
        set_test_case_generator_system(generator, system0);
        set_test_case_generator_datum(generator, datum0);
        set_test_case_generator_categories(generator, categories0);
        set_test_case_generator_name(generator, new_test_case_name());
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 6326L)
    public static SubLObject test_case_generator_get_test_case_def_method(final SubLObject self) {
        final SubLObject method_definitions = methods.funcall_instance_method_with_0_args(self, (SubLObject)test_case_generator.$sym32$GET_METHOD_DEFS);
        final SubLObject method_declarations = methods.funcall_instance_method_with_1_args(self, (SubLObject)test_case_generator.$sym33$GET_METHOD_DECLS, method_definitions);
        final SubLObject test_case_declaration = methods.funcall_instance_method_with_1_args(self, (SubLObject)test_case_generator.$sym34$GET_TEST_CASE_DECL, method_declarations);
        return Values.values(test_case_declaration, (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)test_case_generator.$sym35$GET_SETUP_DEF), (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(self, (SubLObject)test_case_generator.$sym36$GET_CLEANUP_DEF), method_definitions)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 6887L)
    public static SubLObject test_case_generator_get_setup_def_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push(test_case_generator.$sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym41$DEF_SETUP_METHOD, reader.bq_cons(name, (SubLObject)test_case_generator.$list38), (SubLObject)test_case_generator.$list42));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_case_generator_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7070L)
    public static SubLObject test_case_generator_get_cleanup_def_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push(test_case_generator.$sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym46$DEF_CLEANUP_METHOD, reader.bq_cons(name, (SubLObject)test_case_generator.$list38), (SubLObject)test_case_generator.$list42));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_case_generator_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7261L)
    public static SubLObject test_case_generator_get_method_decls_method(final SubLObject self, final SubLObject method_definitions) {
        SubLObject declarations = (SubLObject)test_case_generator.NIL;
        SubLObject cdolist_list_var = method_definitions;
        SubLObject method_def = (SubLObject)test_case_generator.NIL;
        method_def = cdolist_list_var.first();
        while (test_case_generator.NIL != cdolist_list_var) {
            final SubLObject method_name = conses_high.second(method_def).first();
            declarations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym50$DEF_INSTANCE_METHOD, method_name, (SubLObject)test_case_generator.$list51), declarations);
            cdolist_list_var = cdolist_list_var.rest();
            method_def = cdolist_list_var.first();
        }
        return Sequences.nreverse(declarations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 7686L)
    public static SubLObject test_case_generator_get_test_case_comment_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject datum = get_test_case_generator_datum(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        try {
            thread.throwStack.push(test_case_generator.$sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD, PrintLow.format((SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$str55$_________TEST___a_____CATEGORIES_, new SubLObject[] { datum, categories, numeric_date_utilities.get_universal_date((SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED), system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.remote_ops_processed(), Environment.get_user_name((SubLObject)test_case_generator.UNPROVIDED) }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_case_generator_datum(self, datum);
                    set_test_case_generator_categories(self, categories);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
    public static SubLObject get_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(cyclifier_test_case_generator, (SubLObject)test_case_generator.SIX_INTEGER, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
    public static SubLObject set_cyclifier_test_case_generator_parse_expression(final SubLObject cyclifier_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyclifier_test_case_generator, value, (SubLObject)test_case_generator.SIX_INTEGER, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
    public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym22$INSTANCE_COUNT, (SubLObject)test_case_generator.ZERO_INTEGER);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
    public static SubLObject subloop_reserved_initialize_cyclifier_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym24$ISOLATED_P, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym25$INSTANCE_NUMBER, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym21$MODULE, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym20$SYSTEM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym19$CATEGORIES, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym18$DATUM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym17$NAME, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION, (SubLObject)test_case_generator.NIL);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8098L)
    public static SubLObject cyclifier_test_case_generator_p(final SubLObject cyclifier_test_case_generator) {
        return classes.subloop_instanceof_class(cyclifier_test_case_generator, (SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 8436L)
    public static SubLObject cyclifier_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, (SubLObject)test_case_generator.$sym10$NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, conses_high.second(parser.charniak_parse(datum0, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED).first()));
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 9171L)
    public static SubLObject cyclifier_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        final SubLObject system = get_test_case_generator_system(self);
        final SubLObject module = get_test_case_generator_module(self);
        try {
            thread.throwStack.push(test_case_generator.$sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym67$DEFINE_TEST_CASE, (SubLObject)ConsesLow.list(name, module, system, (SubLObject)test_case_generator.$kw68$CATEGORIES, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, categories)), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym70$PARSE_TREE, (SubLObject)test_case_generator.$kw71$INSTANCE, (SubLObject)test_case_generator.$kw72$PRIVATE, (SubLObject)test_case_generator.$kw73$VALUE, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym74$NEW_PARSE_TREE, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, parse_expression))), (SubLObject)test_case_generator.$list75, (SubLObject)test_case_generator.$list76, ConsesLow.append(method_declarations, (SubLObject)test_case_generator.NIL)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_categories(self, categories);
                    set_test_case_generator_system(self, system);
                    set_test_case_generator_module(self, module);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 9698L)
    public static SubLObject cyclifier_test_case_generator_get_method_defs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyclifier_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject parse_expression = get_cyclifier_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject datum = get_test_case_generator_datum(self);
        try {
            thread.throwStack.push(test_case_generator.$sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
            try {
                final SubLObject method_name = Packages.intern((SubLObject)test_case_generator.$str80$TEST_1, (SubLObject)test_case_generator.UNPROVIDED);
                final SubLObject cycls = methods.funcall_instance_method_with_0_args(parse_tree.new_parse_tree(parse_expression, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED), (SubLObject)test_case_generator.$sym81$CYCLIFY);
                final SubLObject method_body = (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym82$FAIL_UNLESS_EQUAL, (SubLObject)test_case_generator.$sym83$SELF, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, cycls), (SubLObject)test_case_generator.$list84, Sequences.cconcatenate((SubLObject)test_case_generator.$str85$_cyclify__, new SubLObject[] { datum, test_case_generator.$str86$_______, print_high.princ_to_string(cycls) }), (SubLObject)test_case_generator.$list87);
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym88$DEF_TEST_METHOD, (SubLObject)ConsesLow.listS(method_name, name, (SubLObject)test_case_generator.$list38), (SubLObject)test_case_generator.NIL, method_body)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cyclifier_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_datum(self, datum);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyclifier_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyclifier_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
    public static SubLObject get_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_syntax_test_case_generator, (SubLObject)test_case_generator.SIX_INTEGER, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
    public static SubLObject set_parse_tree_syntax_test_case_generator_parse_expression(final SubLObject parse_tree_syntax_test_case_generator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_syntax_test_case_generator, value, (SubLObject)test_case_generator.SIX_INTEGER, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
    public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym22$INSTANCE_COUNT, (SubLObject)test_case_generator.ZERO_INTEGER);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
    public static SubLObject subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym24$ISOLATED_P, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.$sym25$INSTANCE_NUMBER, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym21$MODULE, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym20$SYSTEM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym19$CATEGORIES, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym18$DATUM, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym17$NAME, (SubLObject)test_case_generator.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym59$PARSE_EXPRESSION, (SubLObject)test_case_generator.NIL);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10258L)
    public static SubLObject parse_tree_syntax_test_case_generator_p(final SubLObject parse_tree_syntax_test_case_generator) {
        return classes.subloop_instanceof_class(parse_tree_syntax_test_case_generator, (SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 10606L)
    public static SubLObject parse_tree_syntax_test_case_generator_new_method(final SubLObject self, final SubLObject module0, final SubLObject system0, final SubLObject datum0, final SubLObject categories0) {
        final SubLObject generator = methods.funcall_class_super_method_with_4_args(self, (SubLObject)test_case_generator.$sym10$NEW, module0, system0, datum0, categories0);
        set_cyclifier_test_case_generator_parse_expression(generator, conses_high.second(parser.charniak_parse(datum0, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED).first()));
        return generator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 11353L)
    public static SubLObject parse_tree_syntax_test_case_generator_get_test_case_decl_method(final SubLObject self, final SubLObject method_declarations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        final SubLObject categories = get_test_case_generator_categories(self);
        final SubLObject system = get_test_case_generator_system(self);
        final SubLObject module = get_test_case_generator_module(self);
        try {
            thread.throwStack.push(test_case_generator.$sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym67$DEFINE_TEST_CASE, (SubLObject)ConsesLow.list(name, module, system, (SubLObject)test_case_generator.$kw68$CATEGORIES, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, categories)), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym70$PARSE_TREE, (SubLObject)test_case_generator.$kw96$CLASS, (SubLObject)test_case_generator.$kw72$PRIVATE, (SubLObject)test_case_generator.$kw73$VALUE, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym97$PROCESS_MODIFIERS, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym74$NEW_PARSE_TREE, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, parse_expression)))), (SubLObject)test_case_generator.$list75, (SubLObject)test_case_generator.$list76, ConsesLow.append(method_declarations, (SubLObject)test_case_generator.NIL)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    set_test_case_generator_categories(self, categories);
                    set_test_case_generator_system(self, system);
                    set_test_case_generator_module(self, module);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_syntax_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 11905L)
    public static SubLObject parse_tree_syntax_test_case_generator_get_method_defs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_syntax_test_case_generator_method = (SubLObject)test_case_generator.NIL;
        final SubLObject parse_expression = get_parse_tree_syntax_test_case_generator_parse_expression(self);
        final SubLObject name = get_test_case_generator_name(self);
        try {
            thread.throwStack.push(test_case_generator.$sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
            try {
                final SubLObject v_parse_tree = parse_tree.process_modifiers(parse_tree.new_parse_tree(parse_expression, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED));
                final SubLObject test_data = get_parse_tree_test_data_recursively(v_parse_tree, (SubLObject)test_case_generator.$list101);
                SubLObject i = (SubLObject)test_case_generator.ZERO_INTEGER;
                SubLObject method_definitions = (SubLObject)test_case_generator.NIL;
                SubLObject cdolist_list_var = test_data;
                SubLObject test_datum = (SubLObject)test_case_generator.NIL;
                test_datum = cdolist_list_var.first();
                while (test_case_generator.NIL != cdolist_list_var) {
                    i = Numbers.add(i, (SubLObject)test_case_generator.ONE_INTEGER);
                    final SubLObject method_name = Packages.intern(Sequences.cconcatenate((SubLObject)test_case_generator.$str102$TEST_, print_high.princ_to_string(i)), (SubLObject)test_case_generator.UNPROVIDED);
                    final SubLObject method_body = new_fail_unless_call(test_datum, v_parse_tree);
                    method_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym88$DEF_TEST_METHOD, (SubLObject)ConsesLow.listS(method_name, name, (SubLObject)test_case_generator.$list38), (SubLObject)test_case_generator.NIL, method_body), method_definitions);
                    cdolist_list_var = cdolist_list_var.rest();
                    test_datum = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)test_case_generator.$sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD, Sequences.nreverse(method_definitions));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)test_case_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_syntax_test_case_generator_parse_expression(self, parse_expression);
                    set_test_case_generator_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_syntax_test_case_generator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)test_case_generator.$sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_syntax_test_case_generator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 12683L)
    public static SubLObject new_fail_unless_call(final SubLObject test_datum, final SubLObject v_parse_tree) {
        final SubLObject tree_path = test_datum.first();
        final SubLObject method_call = conses_high.second(test_datum);
        final SubLObject method_name = method_call.first();
        final SubLObject method_args = method_call.rest();
        final SubLObject result_paths = conses_high.third(test_datum);
        SubLObject result_calls = (SubLObject)test_case_generator.NIL;
        SubLObject result = (SubLObject)test_case_generator.NIL;
        if (test_case_generator.NIL == result_paths) {
            result = (SubLObject)test_case_generator.NIL;
        }
        else if (test_case_generator.NIL != Sequences.find_if((SubLObject)test_case_generator.$sym2$LISTP, result_paths, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED, (SubLObject)test_case_generator.UNPROVIDED)) {
            SubLObject cdolist_list_var = result_paths;
            SubLObject result_path = (SubLObject)test_case_generator.NIL;
            result_path = cdolist_list_var.first();
            while (test_case_generator.NIL != cdolist_list_var) {
                result_calls = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym104$FIM, (SubLObject)test_case_generator.$sym70$PARSE_TREE, (SubLObject)test_case_generator.$list105, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, result_path)), result_calls);
                cdolist_list_var = cdolist_list_var.rest();
                result_path = cdolist_list_var.first();
            }
            result = Sequences.nreverse(result_calls);
            result = (SubLObject)ConsesLow.cons((SubLObject)test_case_generator.$sym106$LIST, result);
        }
        else {
            result = (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym104$FIM, (SubLObject)test_case_generator.$sym70$PARSE_TREE, (SubLObject)test_case_generator.$list105, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, result_paths));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym82$FAIL_UNLESS_EQUAL, (SubLObject)test_case_generator.$sym83$SELF, (SubLObject)ConsesLow.listS((SubLObject)test_case_generator.$sym104$FIM, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym104$FIM, (SubLObject)test_case_generator.$sym70$PARSE_TREE, (SubLObject)test_case_generator.$list105, (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, tree_path)), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$sym69$QUOTE, method_name), ConsesLow.append(method_args, (SubLObject)test_case_generator.NIL)), result, new_syntax_test_failure_explanation(tree_path, method_call, result_paths, v_parse_tree), (SubLObject)test_case_generator.$list107);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 13730L)
    public static SubLObject new_syntax_test_failure_explanation(final SubLObject tree_path, final SubLObject method_call, final SubLObject result_paths, final SubLObject v_parse_tree) {
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parse_tree, (SubLObject)test_case_generator.$sym108$GET_DESCENDANT, tree_path);
        final SubLObject method_name = method_call.first();
        final SubLObject args = method_call.rest();
        final SubLObject results = classes_utilities.apply_instance_method(tree, method_call.first(), method_call.rest());
        SubLObject result_strings = (SubLObject)test_case_generator.NIL;
        SubLObject result_string = (SubLObject)test_case_generator.NIL;
        SubLObject explanation = Sequences.cconcatenate((SubLObject)test_case_generator.$str109$_, print_high.princ_to_string(method_name));
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)test_case_generator.NIL;
        arg = cdolist_list_var.first();
        while (test_case_generator.NIL != cdolist_list_var) {
            explanation = Sequences.cconcatenate(explanation, new SubLObject[] { test_case_generator.$str110$_, print_high.princ_to_string(arg) });
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        explanation = Sequences.cconcatenate(explanation, new SubLObject[] { test_case_generator.$str111$__, print_high.princ_to_string(methods.funcall_instance_method_with_0_args(tree, (SubLObject)test_case_generator.$sym112$GET_CATEGORY)), test_case_generator.$str110$_, methods.funcall_instance_method_with_0_args(tree, (SubLObject)test_case_generator.$sym113$GET_STRING), test_case_generator.$str114$_ });
        if (test_case_generator.NIL != list_utilities.non_empty_list_p(results)) {
            cdolist_list_var = results;
            SubLObject result = (SubLObject)test_case_generator.NIL;
            result = cdolist_list_var.first();
            while (test_case_generator.NIL != cdolist_list_var) {
                result_strings = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)test_case_generator.$str109$_, new SubLObject[] { print_high.princ_to_string(methods.funcall_instance_method_with_0_args(result, (SubLObject)test_case_generator.$sym112$GET_CATEGORY)), test_case_generator.$str110$_, methods.funcall_instance_method_with_0_args(result, (SubLObject)test_case_generator.$sym113$GET_STRING), test_case_generator.$str114$_ }), result_strings);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
            result_string = string_utilities.bunge(Sequences.nreverse(result_strings), (SubLObject)test_case_generator.UNPROVIDED);
        }
        else if (test_case_generator.NIL != parse_tree.parse_tree_p(results)) {
            result_string = Sequences.cconcatenate((SubLObject)test_case_generator.$str109$_, new SubLObject[] { print_high.princ_to_string(methods.funcall_instance_method_with_0_args(results, (SubLObject)test_case_generator.$sym112$GET_CATEGORY)), test_case_generator.$str110$_, methods.funcall_instance_method_with_0_args(results, (SubLObject)test_case_generator.$sym113$GET_STRING), test_case_generator.$str114$_ });
        }
        else {
            result_string = print_high.princ_to_string(results);
        }
        explanation = Sequences.cconcatenate(explanation, new SubLObject[] { test_case_generator.$str115$______, result_string, test_case_generator.$str116$_ });
        return explanation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 15282L)
    public static SubLObject new_test_case_name() {
        return Packages.intern(Sequences.cconcatenate((SubLObject)test_case_generator.$str117$TEST_CASE_, print_high.princ_to_string(Time.get_internal_real_time())), (SubLObject)test_case_generator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 15515L)
    public static SubLObject get_parse_tree_test_data(final SubLObject v_parse_tree, final SubLObject method_calls) {
        SubLObject test_data = (SubLObject)test_case_generator.NIL;
        SubLObject cdolist_list_var = method_calls;
        SubLObject method_call = (SubLObject)test_case_generator.NIL;
        method_call = cdolist_list_var.first();
        while (test_case_generator.NIL != cdolist_list_var) {
            final SubLObject method = method_call.first();
            final SubLObject args = method_call.rest();
            SubLObject results = (SubLObject)test_case_generator.NIL;
            SubLObject returned = (SubLObject)test_case_generator.NIL;
            if (test_case_generator.NIL != methods.funcall_instance_method_with_1_args(v_parse_tree, (SubLObject)test_case_generator.$sym118$IMPLEMENTS_METHOD_P, method)) {
                returned = classes_utilities.apply_instance_method(v_parse_tree, method, args);
                if (returned.isList()) {
                    SubLObject cdolist_list_var_$2 = returned;
                    SubLObject result = (SubLObject)test_case_generator.NIL;
                    result = cdolist_list_var_$2.first();
                    while (test_case_generator.NIL != cdolist_list_var_$2) {
                        results = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(result, (SubLObject)test_case_generator.$sym119$GET_PATH), results);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        result = cdolist_list_var_$2.first();
                    }
                    results = Sequences.nreverse(results);
                }
                else {
                    results = methods.funcall_instance_method_with_0_args(returned, (SubLObject)test_case_generator.$sym119$GET_PATH);
                }
                test_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(v_parse_tree, (SubLObject)test_case_generator.$sym119$GET_PATH), method_call, results), test_data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method_call = cdolist_list_var.first();
        }
        return test_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 16582L)
    public static SubLObject get_parse_tree_test_data_recursively(final SubLObject v_parse_tree, final SubLObject method_calls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_data = (SubLObject)test_case_generator.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)test_case_generator.$kw120$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)test_case_generator.$kw121$DFL2R, (SubLObject)test_case_generator.$kw120$DFR2L);
        SubLObject sub = (SubLObject)test_case_generator.NIL;
        if (test_case_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && test_case_generator.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)test_case_generator.EQ), (SubLObject)test_case_generator.UNPROVIDED)) {
            Errors.error((SubLObject)test_case_generator.$str122$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(v_parse_tree, stack);
        while (test_case_generator.NIL == stacks.stack_empty_p(stack)) {
            sub = stacks.stack_pop(stack);
            test_data = ConsesLow.append(get_parse_tree_test_data(sub, method_calls), test_data);
            if (test_case_generator.NIL != parse_tree.phrase_tree_p(sub)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)test_case_generator.$kw121$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)test_case_generator.NIL, v_iteration = (SubLObject)test_case_generator.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)test_case_generator.ONE_INTEGER)) {
                    element_num = ((test_case_generator.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)test_case_generator.ONE_INTEGER) : v_iteration);
                    daughter = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
        }
        return test_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17294L)
    public static SubLObject eval_test_case(final SubLObject declaration, final SubLObject definitions) {
        Eval.eval(declaration);
        Mapping.mapcar((SubLObject)test_case_generator.$sym123$EVAL, definitions);
        return (SubLObject)test_case_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17522L)
    public static SubLObject dump_test_case(final SubLObject comment, final SubLObject declaration, final SubLObject definitions, final SubLObject out) {
        print_high.princ(comment, out);
        streams_high.terpri(out);
        print_high.princ((SubLObject)test_case_generator.$list124, out);
        streams_high.terpri(out);
        streams_high.terpri(out);
        print_high.prin1(declaration, out);
        streams_high.terpri(out);
        streams_high.terpri(out);
        SubLObject cdolist_list_var = definitions;
        SubLObject definition = (SubLObject)test_case_generator.NIL;
        definition = cdolist_list_var.first();
        while (test_case_generator.NIL != cdolist_list_var) {
            print_high.prin1(definition, out);
            streams_high.terpri(out);
            streams_high.terpri(out);
            cdolist_list_var = cdolist_list_var.rest();
            definition = cdolist_list_var.first();
        }
        streams_high.terpri(out);
        return Sequences.length(definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 17959L)
    public static SubLObject cycls_equal_p(final SubLObject cycls1, final SubLObject cycls2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(cycls1).numE(Sequences.length(cycls2)) && test_case_generator.NIL != conses_high.subsetp(cycls1, cycls2, (SubLObject)test_case_generator.$sym125$EQUALS_EL_, (SubLObject)test_case_generator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 18714L)
    public static SubLObject add_syntax_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == test_case_generator.UNPROVIDED) {
            out_file = test_case_generator.$parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == test_case_generator.UNPROVIDED) {
            categories = (SubLObject)test_case_generator.$list129;
        }
        return add_test_cases((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$str130$parse_tree, (SubLObject)test_case_generator.$str131$cycl, categories, in_file, out_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 19184L)
    public static SubLObject add_syntax_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == test_case_generator.UNPROVIDED) {
            out_file = test_case_generator.$parse_tree_syntax_test_file$.getDynamicValue();
        }
        if (categories == test_case_generator.UNPROVIDED) {
            categories = (SubLObject)test_case_generator.$list129;
        }
        return add_test_case((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$str130$parse_tree, (SubLObject)test_case_generator.$str131$cycl, categories, sentence, out_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 19638L)
    public static SubLObject add_cyclifier_test_cases(final SubLObject in_file, SubLObject out_file, SubLObject categories) {
        if (out_file == test_case_generator.UNPROVIDED) {
            out_file = test_case_generator.$cyclifier_test_file$.getDynamicValue();
        }
        if (categories == test_case_generator.UNPROVIDED) {
            categories = (SubLObject)test_case_generator.$list132;
        }
        return add_test_cases((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$str130$parse_tree, (SubLObject)test_case_generator.$str131$cycl, categories, in_file, out_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/test-case-generator.lisp", position = 20085L)
    public static SubLObject add_cyclifier_test_case(final SubLObject sentence, SubLObject out_file, SubLObject categories) {
        if (out_file == test_case_generator.UNPROVIDED) {
            out_file = test_case_generator.$cyclifier_test_file$.getDynamicValue();
        }
        if (categories == test_case_generator.UNPROVIDED) {
            categories = (SubLObject)test_case_generator.$list132;
        }
        return add_test_case((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$str130$parse_tree, (SubLObject)test_case_generator.$str131$cycl, categories, sentence, out_file);
    }
    
    public static SubLObject declare_test_case_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_test_cases", "ADD-TEST-CASES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_test_case", "ADD-TEST-CASE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_test_case_generator_name", "GET-TEST-CASE-GENERATOR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_test_case_generator_name", "SET-TEST-CASE-GENERATOR-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_test_case_generator_datum", "GET-TEST-CASE-GENERATOR-DATUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_test_case_generator_datum", "SET-TEST-CASE-GENERATOR-DATUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_test_case_generator_categories", "GET-TEST-CASE-GENERATOR-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_test_case_generator_categories", "SET-TEST-CASE-GENERATOR-CATEGORIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_test_case_generator_system", "GET-TEST-CASE-GENERATOR-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_test_case_generator_system", "SET-TEST-CASE-GENERATOR-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_test_case_generator_module", "GET-TEST-CASE-GENERATOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_test_case_generator_module", "SET-TEST-CASE-GENERATOR-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_p", "TEST-CASE-GENERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_new_method", "TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_get_test_case_def_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_get_setup_def_method", "TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_get_cleanup_def_method", "TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_get_method_decls_method", "TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "test_case_generator_get_test_case_comment_method", "TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_cyclifier_test_case_generator_parse_expression", "GET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_cyclifier_test_case_generator_parse_expression", "SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_cyclifier_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_cyclifier_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "cyclifier_test_case_generator_p", "CYCLIFIER-TEST-CASE-GENERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "cyclifier_test_case_generator_new_method", "CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "cyclifier_test_case_generator_get_test_case_decl_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "cyclifier_test_case_generator_get_method_defs_method", "CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_parse_tree_syntax_test_case_generator_parse_expression", "GET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "set_parse_tree_syntax_test_case_generator_parse_expression", "SET-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-PARSE-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "subloop_reserved_initialize_parse_tree_syntax_test_case_generator_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "parse_tree_syntax_test_case_generator_p", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "parse_tree_syntax_test_case_generator_new_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "parse_tree_syntax_test_case_generator_get_test_case_decl_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "parse_tree_syntax_test_case_generator_get_method_defs_method", "PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "new_fail_unless_call", "NEW-FAIL-UNLESS-CALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "new_syntax_test_failure_explanation", "NEW-SYNTAX-TEST-FAILURE-EXPLANATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "new_test_case_name", "NEW-TEST-CASE-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_parse_tree_test_data", "GET-PARSE-TREE-TEST-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "get_parse_tree_test_data_recursively", "GET-PARSE-TREE-TEST-DATA-RECURSIVELY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "eval_test_case", "EVAL-TEST-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "dump_test_case", "DUMP-TEST-CASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "cycls_equal_p", "CYCLS-EQUAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_syntax_test_cases", "ADD-SYNTAX-TEST-CASES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_syntax_test_case", "ADD-SYNTAX-TEST-CASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_cyclifier_test_cases", "ADD-CYCLIFIER-TEST-CASES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.test_case_generator", "add_cyclifier_test_case", "ADD-CYCLIFIER-TEST-CASE", 1, 2, false);
        return (SubLObject)test_case_generator.NIL;
    }
    
    public static SubLObject init_test_case_generator_file() {
        test_case_generator.$parse_tree_test_directory$ = SubLFiles.defparameter("*PARSE-TREE-TEST-DIRECTORY*", (SubLObject)test_case_generator.$str126$__cvs_head_cycorp_cyc_top_tests_);
        test_case_generator.$parse_tree_syntax_test_file$ = SubLFiles.defparameter("*PARSE-TREE-SYNTAX-TEST-FILE*", Sequences.cconcatenate(test_case_generator.$parse_tree_test_directory$.getDynamicValue(), (SubLObject)test_case_generator.$str127$_parse_tree_syntax_tests_lisp));
        test_case_generator.$cyclifier_test_file$ = SubLFiles.defparameter("*CYCLIFIER-TEST-FILE*", Sequences.cconcatenate(test_case_generator.$parse_tree_test_directory$.getDynamicValue(), (SubLObject)test_case_generator.$str128$cyclifier_tests_lisp));
        return (SubLObject)test_case_generator.NIL;
    }
    
    public static SubLObject setup_test_case_generator_file() {
        classes.subloop_new_class((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym15$OBJECT, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.T, (SubLObject)test_case_generator.$list16);
        classes.class_set_implements_slot_listeners((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE);
        subloop_reserved_initialize_test_case_generator_class((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method((SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list27, (SubLObject)test_case_generator.$list28, (SubLObject)test_case_generator.$list29);
        methods.subloop_register_class_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym30$TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym11$GET_TEST_CASE_DEF, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list27, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list31);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym11$GET_TEST_CASE_DEF, (SubLObject)test_case_generator.$sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym35$GET_SETUP_DEF, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list39);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym35$GET_SETUP_DEF, (SubLObject)test_case_generator.$sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym36$GET_CLEANUP_DEF, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list44);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym36$GET_CLEANUP_DEF, (SubLObject)test_case_generator.$sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym33$GET_METHOD_DECLS, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.$list48, (SubLObject)test_case_generator.$list49);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym33$GET_METHOD_DECLS, (SubLObject)test_case_generator.$sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym12$GET_TEST_CASE_COMMENT, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list53);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym12$GET_TEST_CASE_COMMENT, (SubLObject)test_case_generator.$sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD);
        classes.subloop_new_class((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list58);
        classes.class_set_implements_slot_listeners((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC);
        subloop_reserved_initialize_cyclifier_test_case_generator_class((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method((SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.$list28, (SubLObject)test_case_generator.$list62);
        methods.subloop_register_class_method((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym34$GET_TEST_CASE_DECL, (SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.$list64, (SubLObject)test_case_generator.$list65);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym34$GET_TEST_CASE_DECL, (SubLObject)test_case_generator.$sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym32$GET_METHOD_DEFS, (SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list78);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym57$CYCLIFIER_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym32$GET_METHOD_DEFS, (SubLObject)test_case_generator.$sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD);
        classes.subloop_new_class((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym14$TEST_CASE_GENERATOR, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list58);
        classes.class_set_implements_slot_listeners((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        classes.subloop_note_instance_initialization_function((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        subloop_reserved_initialize_parse_tree_syntax_test_case_generator_class((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR);
        methods.methods_incorporate_class_method((SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.$list28, (SubLObject)test_case_generator.$list62);
        methods.subloop_register_class_method((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym10$NEW, (SubLObject)test_case_generator.$sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym34$GET_TEST_CASE_DECL, (SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.$list64, (SubLObject)test_case_generator.$list94);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym34$GET_TEST_CASE_DECL, (SubLObject)test_case_generator.$sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)test_case_generator.$sym32$GET_METHOD_DEFS, (SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$list38, (SubLObject)test_case_generator.NIL, (SubLObject)test_case_generator.$list99);
        methods.subloop_register_instance_method((SubLObject)test_case_generator.$sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR, (SubLObject)test_case_generator.$sym32$GET_METHOD_DEFS, (SubLObject)test_case_generator.$sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD);
        return (SubLObject)test_case_generator.NIL;
    }
    
    public void declareFunctions() {
        declare_test_case_generator_file();
    }
    
    public void initializeVariables() {
        init_test_case_generator_file();
    }
    
    public void runTopLevelForms() {
        setup_test_case_generator_file();
    }
    
    static {
        me = (SubLFile)new test_case_generator();
        test_case_generator.$parse_tree_test_directory$ = null;
        test_case_generator.$parse_tree_syntax_test_file$ = null;
        test_case_generator.$cyclifier_test_file$ = null;
        $sym0$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym1$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym2$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str3$No_such_file___a = SubLObjectFactory.makeString("No such file: ~a");
        $kw4$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str5$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str6$Appending_test_cases_to_ = SubLObjectFactory.makeString("Appending test cases to ");
        $str7$___ = SubLObjectFactory.makeString("...");
        $kw8$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str9$_ = SubLObjectFactory.makeString(";");
        $sym10$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym11$GET_TEST_CASE_DEF = SubLObjectFactory.makeSymbol("GET-TEST-CASE-DEF");
        $sym12$GET_TEST_CASE_COMMENT = SubLObjectFactory.makeSymbol("GET-TEST-CASE-COMMENT");
        $str13$Appending_test_case_to_ = SubLObjectFactory.makeString("Appending test case to ");
        $sym14$TEST_CASE_GENERATOR = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR");
        $sym15$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list16 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATUM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEST-CASE-DEF"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SETUP-DEF"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CLEANUP-DEF"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHOD-DEFS"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHOD-DECLS"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEST-CASE-DECL"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEST-CASE-COMMENT"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym17$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym18$DATUM = SubLObjectFactory.makeSymbol("DATUM");
        $sym19$CATEGORIES = SubLObjectFactory.makeSymbol("CATEGORIES");
        $sym20$SYSTEM = SubLObjectFactory.makeSymbol("SYSTEM");
        $sym21$MODULE = SubLObjectFactory.makeSymbol("MODULE");
        $sym22$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-CLASS");
        $sym24$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym25$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym26$SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_GENERATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-GENERATOR-INSTANCE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE0"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM0"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM0"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES0"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES0"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TEST-CASE-GENERATOR-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TEST-CASE-GENERATOR-SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TEST-CASE-GENERATOR-DATUM"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TEST-CASE-GENERATOR-CATEGORIES"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TEST-CASE-GENERATOR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEST-CASE-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"))));
        $sym30$TEST_CASE_GENERATOR_NEW_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-NEW-METHOD");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return values; 1. a declaration of the test case and methods\n                   2. a definition of the test case and methods"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHOD-DEFS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLARATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHOD-DECLS")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-CASE-DECLARATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEST-CASE-DECL")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLARATIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-CASE-DECLARATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SETUP-DEF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CLEANUP-DEF"))), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS")))))));
        $sym32$GET_METHOD_DEFS = SubLObjectFactory.makeSymbol("GET-METHOD-DEFS");
        $sym33$GET_METHOD_DECLS = SubLObjectFactory.makeSymbol("GET-METHOD-DECLS");
        $sym34$GET_TEST_CASE_DECL = SubLObjectFactory.makeSymbol("GET-TEST-CASE-DECL");
        $sym35$GET_SETUP_DEF = SubLObjectFactory.makeSymbol("GET-SETUP-DEF");
        $sym36$GET_CLEANUP_DEF = SubLObjectFactory.makeSymbol("GET-CLEANUP-DEF");
        $sym37$TEST_CASE_GENERATOR_GET_TEST_CASE_DEF_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-DEF-METHOD");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a definition of a setup method"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-SETUP-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)test_case_generator.NIL))))));
        $sym40$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");
        $sym41$DEF_SETUP_METHOD = SubLObjectFactory.makeSymbol("DEF-SETUP-METHOD");
        $list42 = ConsesLow.list((SubLObject)test_case_generator.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)test_case_generator.NIL));
        $sym43$TEST_CASE_GENERATOR_GET_SETUP_DEF_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-GET-SETUP-DEF-METHOD");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a definition of a cleanup method"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-CLEANUP-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)test_case_generator.NIL))))));
        $sym45$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");
        $sym46$DEF_CLEANUP_METHOD = SubLObjectFactory.makeSymbol("DEF-CLEANUP-METHOD");
        $sym47$TEST_CASE_GENERATOR_GET_CLEANUP_DEF_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-GET-CLEANUP-DEF-METHOD");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of method declarations for each method in METHOD-DEFINITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECLARATIONS"), (SubLObject)test_case_generator.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEF"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")))), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATIONS")))));
        $sym50$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $list51 = ConsesLow.list((SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $sym52$TEST_CASE_GENERATOR_GET_METHOD_DECLS_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-GET-METHOD-DECLS-METHOD");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; a comment string for the test case this generator generates"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORMAT"), test_case_generator.NIL, SubLObjectFactory.makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%"), SubLObjectFactory.makeSymbol("DATUM"), SubLObjectFactory.makeSymbol("CATEGORIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-DATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-REVISION-STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-LOADED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOTE-OPS-PROCESSED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-USER-NAME")) })));
        $sym54$OUTER_CATCH_FOR_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-GENERATOR-METHOD");
        $str55$_________TEST___a_____CATEGORIES_ = SubLObjectFactory.makeString(";;;;~%;; TEST: ~a~%;; CATEGORIES: ~a~%;;~%;; DATE: ~a~%;; REVISION: ~a~%;; KB: ~a.~a~%;; USER: ~a~%;;;;~%");
        $sym56$TEST_CASE_GENERATOR_GET_TEST_CASE_COMMENT_METHOD = SubLObjectFactory.makeSymbol("TEST-CASE-GENERATOR-GET-TEST-CASE-COMMENT-METHOD");
        $sym57$CYCLIFIER_TEST_CASE_GENERATOR = SubLObjectFactory.makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEST-CASE-DECL"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHOD-DEFS"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym59$PARSE_EXPRESSION = SubLObjectFactory.makeSymbol("PARSE-EXPRESSION");
        $sym60$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-CLASS");
        $sym61$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_TEST_CASE_GENERATOR_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-TEST-CASE-GENERATOR-INSTANCE");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MODULE0 stringp; the module of the test case\n   @param SYSTEM0 stringp; the system of the test case\n   @param DATUM0 objectp; the datum for which to generate the test case\n   @param CATEGORIES listp; the categories the test case belongs to\n   @return test-case-generator; a new test case generator for MODULE0 in SYSTEM0 belonging\n   to CATEGORIES0 and generating tests operating on DATA0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW")), (SubLObject)SubLObjectFactory.makeSymbol("MODULE0"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM0"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM0"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES0")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CYCLIFIER-TEST-CASE-GENERATOR-PARSE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARNIAK-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM0"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"))));
        $sym63$CYCLIFIER_TEST_CASE_GENERATOR_NEW_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-NEW-METHOD");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLARATIONS"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SETUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEANUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLARATIONS"), (SubLObject)test_case_generator.NIL))));
        $sym66$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");
        $sym67$DEFINE_TEST_CASE = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE");
        $kw68$CATEGORIES = SubLObjectFactory.makeKeyword("CATEGORIES");
        $sym69$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym70$PARSE_TREE = SubLObjectFactory.makeSymbol("PARSE-TREE");
        $kw71$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $kw72$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw73$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $sym74$NEW_PARSE_TREE = SubLObjectFactory.makeSymbol("NEW-PARSE-TREE");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SETUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEANUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $sym77$CYCLIFIER_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of definitions of all test methods"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)SubLObjectFactory.makeString("TEST-1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-BODY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL-UNLESS-EQUAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("(cyclify \""), (SubLObject)SubLObjectFactory.makeSymbol("DATUM"), (SubLObject)SubLObjectFactory.makeString("\") =/= "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-EQUAL-P"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-TEST-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")))), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeSymbol("METHOD-BODY"))))));
        $sym79$OUTER_CATCH_FOR_CYCLIFIER_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCLIFIER-TEST-CASE-GENERATOR-METHOD");
        $str80$TEST_1 = SubLObjectFactory.makeString("TEST-1");
        $sym81$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $sym82$FAIL_UNLESS_EQUAL = SubLObjectFactory.makeSymbol("FAIL-UNLESS-EQUAL");
        $sym83$SELF = SubLObjectFactory.makeSymbol("SELF");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY")));
        $str85$_cyclify__ = SubLObjectFactory.makeString("(cyclify \"");
        $str86$_______ = SubLObjectFactory.makeString("\") =/= ");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS-EQUAL-P")));
        $sym88$DEF_TEST_METHOD = SubLObjectFactory.makeSymbol("DEF-TEST-METHOD");
        $sym89$CYCLIFIER_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");
        $sym90$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = SubLObjectFactory.makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR");
        $sym91$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-CLASS");
        $sym92$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-INSTANCE");
        $sym93$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_NEW_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-NEW-METHOD");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return values; 1. a declaration of the test case and methods\n                     2. a definition of the test case and methods"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-MODIFIERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SETUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEANUP"), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DECLARATIONS"), (SubLObject)test_case_generator.NIL))));
        $sym95$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");
        $kw96$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $sym97$PROCESS_MODIFIERS = SubLObjectFactory.makeSymbol("PROCESS-MODIFIERS");
        $sym98$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_TEST_CASE_DECL_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-TEST-CASE-DECL-METHOD");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of definitions of all test methods"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-MODIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-EXPRESSION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-TEST-DATA-RECURSIVELY"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)test_case_generator.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS"), (SubLObject)test_case_generator.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-DATUM"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("TEST-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("I"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-BODY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FAIL-UNLESS-CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-DATUM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-TEST-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")))), (SubLObject)test_case_generator.NIL, (SubLObject)SubLObjectFactory.makeSymbol("METHOD-BODY")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DEFINITIONS")))));
        $sym100$OUTER_CATCH_FOR_PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-METHOD");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS")));
        $str102$TEST_ = SubLObjectFactory.makeString("TEST-");
        $sym103$PARSE_TREE_SYNTAX_TEST_CASE_GENERATOR_GET_METHOD_DEFS_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-SYNTAX-TEST-CASE-GENERATOR-GET-METHOD-DEFS-METHOD");
        $sym104$FIM = SubLObjectFactory.makeSymbol("FIM");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DESCENDANT"));
        $sym106$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)test_case_generator.EQUAL));
        $sym108$GET_DESCENDANT = SubLObjectFactory.makeSymbol("GET-DESCENDANT");
        $str109$_ = SubLObjectFactory.makeString("(");
        $str110$_ = SubLObjectFactory.makeString(" ");
        $str111$__ = SubLObjectFactory.makeString(" (");
        $sym112$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym113$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $str114$_ = SubLObjectFactory.makeString(")");
        $str115$______ = SubLObjectFactory.makeString(") =/= ");
        $str116$_ = SubLObjectFactory.makeString(".");
        $str117$TEST_CASE_ = SubLObjectFactory.makeString("TEST-CASE-");
        $sym118$IMPLEMENTS_METHOD_P = SubLObjectFactory.makeSymbol("IMPLEMENTS-METHOD-P");
        $sym119$GET_PATH = SubLObjectFactory.makeSymbol("GET-PATH");
        $kw120$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $kw121$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $str122$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $sym123$EVAL = SubLObjectFactory.makeSymbol("EVAL");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN-PACKAGE"), (SubLObject)SubLObjectFactory.makeString("CYC"));
        $sym125$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $str126$__cvs_head_cycorp_cyc_top_tests_ = SubLObjectFactory.makeString("~/cvs/head/cycorp/cyc/top/tests/");
        $str127$_parse_tree_syntax_tests_lisp = SubLObjectFactory.makeString("/parse-tree-syntax-tests.lisp");
        $str128$cyclifier_tests_lisp = SubLObjectFactory.makeString("cyclifier-tests.lisp");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Parse Tree Syntax Test"));
        $str130$parse_tree = SubLObjectFactory.makeString("parse-tree");
        $str131$cycl = SubLObjectFactory.makeString("cycl");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Cyclifier Test"));
    }
}

/*

	Total time: 498 ms
	
*/
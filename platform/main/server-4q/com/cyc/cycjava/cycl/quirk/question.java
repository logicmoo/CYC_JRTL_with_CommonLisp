package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nl_trie;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.shallow_parser;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class question extends SubLTranslatedFile {
    public static final SubLFile me = new question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.question";

    public static final String myFingerPrint = "511271deee2d79eeebb44a31612a9bdd85747e32ef5b143a01f9f447c5594dce";

    // defvar
    // Definitions
    // the standard parser to first parse the question string
    private static final SubLSymbol $question_parser$ = makeSymbol("*QUESTION-PARSER*");

    // defvar
    // the standard lexicon to first lexify the parsed question
    private static final SubLSymbol $question_lexicon$ = makeSymbol("*QUESTION-LEXICON*");

    // defvar
    private static final SubLSymbol $sksi_registered$ = makeSymbol("*SKSI-REGISTERED*");

    // defvar
    private static final SubLSymbol $cyc_to_resporator_map$ = makeSymbol("*CYC-TO-RESPORATOR-MAP*");

    public static SubLObject initialize_question() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $question_parser$.getDynamicValue(thread)) {
            $question_parser$.setDynamicValue(parser.new_stanford_parser($WARN, $int$30), thread);
        }
        if (NIL == $question_lexicon$.getDynamicValue(thread)) {
            $question_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
        }
        if (NIL == $sksi_registered$.getDynamicValue(thread)) {
            sksi_sks_manager.register_sksi_removal_modules_for_skses($list3);
            $sksi_registered$.setDynamicValue(T, thread);
        }
        return NIL;
    }

    public static SubLObject get_question_corpora(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, SIX_INTEGER, CORPORA);
    }

    public static SubLObject set_question_corpora(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, SIX_INTEGER, CORPORA);
    }

    public static SubLObject get_question_answer_types(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static SubLObject set_question_answer_types(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static SubLObject get_question_parse(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FOUR_INTEGER, PARSE);
    }

    public static SubLObject set_question_parse(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FOUR_INTEGER, PARSE);
    }

    public static SubLObject get_question_string(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, THREE_INTEGER, STRING);
    }

    public static SubLObject set_question_string(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, THREE_INTEGER, STRING);
    }

    public static SubLObject get_question_learnable_types(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_learnable_types(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_max_confidence(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_max_confidence(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_max_candidates(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_max_candidates(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_chunker(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_chunker(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_tagger(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_tagger(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_parser(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_parser(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_question_lexicon(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_question_lexicon(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, TAGGER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CHUNKER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CANDIDATES, TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CONFIDENCE, TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEARNABLE_TYPES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        return NIL;
    }

    public static SubLObject question_p(final SubLObject v_question) {
        return classes.subloop_instanceof_class(v_question, QUESTION);
    }

    public static SubLObject question_classify_method(final SubLObject self, final SubLObject tree) {
        if (NIL == parse_tree.question_tree_p(tree)) {
            return NIL;
        }
        final SubLObject class_stack = stacks.create_stack();
        SubLObject qclasses = NIL;
        stacks.stack_push(self, class_stack);
        while (NIL == stacks.stack_empty_p(class_stack)) {
            final SubLObject qclass = stacks.stack_pop(class_stack);
            if (NIL != methods.funcall_class_method_with_1_args(qclass, $sym30$ISA_, tree)) {
                qclasses = cons(qclass, qclasses);
            }
            SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args(qclass, CHILD_CLASSES);
            SubLObject child_class = NIL;
            child_class = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                stacks.stack_push(child_class, class_stack);
                cdolist_list_var = cdolist_list_var.rest();
                child_class = cdolist_list_var.first();
            } 
        } 
        return qclasses;
    }

    public static SubLObject question_isaP_method(final SubLObject self, final SubLObject tree) {
        return parse_tree.question_tree_p(tree);
    }

    public static SubLObject question_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        SubLObject learnable_types = get_question_learnable_types(self);
        SubLObject chunker = get_question_chunker(self);
        SubLObject tagger = get_question_tagger(self);
        SubLObject v_parser = get_question_parser(self);
        SubLObject lexicon = get_question_lexicon(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                search_engine.information_request_initialize_method(self);
                if (NIL == lexicon) {
                    lexicon = object.new_class_instance(TERM_LEXICON);
                }
                if (NIL == v_parser) {
                    v_parser = parser.new_stanford_parser($WARN, $int$30);
                }
                if (NIL == tagger) {
                    tagger = pos_tagger.get_tagger();
                }
                if (NIL == chunker) {
                    chunker = shallow_parser.new_shallow_parser($WARN, TEN_INTEGER);
                }
                if (NIL == learnable_types) {
                    learnable_types = get_learnable_types();
                }
                sublisp_throw($sym37$OUTER_CATCH_FOR_QUESTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_learnable_types(self, learnable_types);
                    set_question_chunker(self, chunker);
                    set_question_tagger(self, tagger);
                    set_question_parser(self, v_parser);
                    set_question_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject question_augment_terms_method(final SubLObject self, final SubLObject terms, final SubLObject corpus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word_graph = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    word_graph = external_interfaces.get_word_graph(terms, list(list($$$index, external_interfaces.get_word_graph_path(corpus))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.warn($str44$Could_not_get_augmentation_terms_, terms);
        }
        if (word_graph.isCons()) {
            return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(word_graph), GET_PATH_LABELS, terms);
        }
        return NIL;
    }

    public static SubLObject question_require_percentage_method(final SubLObject self) {
        return $int$100;
    }

    public static SubLObject np_term_match(final SubLObject np, final SubLObject v_term, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        final SubLObject head = methods.funcall_instance_method_with_0_args(np, GET_HEAD);
        final SubLObject head_words = (NIL != head) ? string_utilities.split_string(methods.funcall_instance_method_with_0_args(head, GET_STRING), UNPROVIDED) : NIL;
        final SubLObject term_words = string_utilities.split_string(v_term, UNPROVIDED);
        return makeBoolean((NIL != intersection(head_words, term_words, test, UNPROVIDED)) && (NIL != string_utilities.substringP(v_term, methods.funcall_instance_method_with_0_args(np, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject question_tree_type_match_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject answer_types = get_question_answer_types(self);
        try {
            thread.throwStack.push($sym55$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                final SubLObject head = methods.funcall_instance_method_with_0_args(tree, GET_HEAD);
                SubLObject i = NIL;
                SubLObject denot = NIL;
                SubLObject score = NIL;
                SubLObject incompatibleP = NIL;
                if (NIL != head) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS);
                    SubLObject keyword = NIL;
                    keyword = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != tree_match(head, keyword)) {
                            sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        keyword = cdolist_list_var.first();
                    } 
                    cdolist_list_var = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
                    SubLObject lex = NIL;
                    lex = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                        SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(self, ANSWER_TYPES);
                        SubLObject type_path = NIL;
                        type_path = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            i = length(type_path);
                            incompatibleP = NIL;
                            if (NIL == incompatibleP) {
                                SubLObject csome_list_var;
                                SubLObject required_type;
                                for (csome_list_var = type_path, required_type = NIL, required_type = csome_list_var.first(); (NIL == incompatibleP) && (NIL != csome_list_var); incompatibleP = incompatible_p(denot, required_type) , i = subtract(i, ONE_INTEGER) , csome_list_var = csome_list_var.rest() , required_type = csome_list_var.first()) {
                                    score = number_utilities.f_1X(log(i, TWO_INTEGER));
                                    if (NIL != at_utilities.more_specific_p(denot, required_type, UNPROVIDED)) {
                                        sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, score);
                                    }
                                }
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            type_path = cdolist_list_var_$1.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        lex = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answer_types(self, answer_types);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject question_answer_types_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject question_get_keywords_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject parse = get_question_parse(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                SubLObject keywords = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, YIELD);
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != content_category_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))) {
                        keywords = cons(word, keywords);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                sublisp_throw($sym64$OUTER_CATCH_FOR_QUESTION_METHOD, keywords);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject question_get_keystrings_method(final SubLObject self) {
        return Mapping.mapcar(symbol_function(WORD_TREE_GET_STRING_METHOD), question_get_keywords_method(self));
    }

    public static SubLObject question_candidate_answer_p_method(final SubLObject self, final SubLObject tree) {
        return numG(methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, tree), $float$0_3);
    }

    public static SubLObject new_question(final SubLObject string, SubLObject corpora, SubLObject v_class) {
        if (corpora == UNPROVIDED) {
            corpora = $list76;
        }
        if (v_class == UNPROVIDED) {
            v_class = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(corpora) : "Types.listp(corpora) " + "CommonSymbols.NIL != Types.listp(corpora) " + corpora;
        initialize_question();
        methods.funcall_instance_method_with_1_args($question_lexicon$.getDynamicValue(thread), LEARN, string);
        final SubLObject parse = methods.funcall_instance_method_with_1_args($question_parser$.getDynamicValue(thread), PARSE, string);
        SubLObject v_question = NIL;
        if (NIL != parse) {
            methods.funcall_instance_method_with_1_args(parse, LEXIFY, $question_lexicon$.getDynamicValue(thread));
            if (NIL == v_class) {
                v_class = methods.funcall_class_method_with_1_args(QUESTION, CLASSIFY, parse).first();
            }
            if (NIL != v_class) {
                v_question = object.new_class_instance(v_class);
                set_question_string(v_question, string);
                set_question_corpora(v_question, corpora);
                set_question_parse(v_question, parse);
            }
        }
        return v_question;
    }

    public static SubLObject question_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject string = get_question_string(self);
        try {
            thread.throwStack.push($sym84$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                write_string($str85$__, stream, UNPROVIDED, UNPROVIDED);
                princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                write_string($str86$__, stream, UNPROVIDED, UNPROVIDED);
                write_string(string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str87$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym84$OUTER_CATCH_FOR_QUESTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject question_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject string = get_question_string(self);
        try {
            thread.throwStack.push($sym91$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                sublisp_throw($sym91$OUTER_CATCH_FOR_QUESTION_METHOD, string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject question_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject max_candidates = get_question_max_candidates(self);
        final SubLObject timeout = search_engine.get_information_request_timeout(self);
        try {
            thread.throwStack.push($sym95$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                final SubLObject texts = set.new_set(EQUAL, UNPROVIDED);
                SubLObject enoughP = NIL;
                SubLObject i = ZERO_INTEGER;
                SubLObject candidates = NIL;
                final SubLObject cutoff = methods.funcall_instance_method_with_0_args(self, ANSWER_CARDINALITY);
                SubLObject timed_outP = NIL;
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(timeout, tag);
                                if (NIL == enoughP) {
                                    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, QUERIFY);
                                    SubLObject query = NIL;
                                    query = csome_list_var.first();
                                    while ((NIL == enoughP) && (NIL != csome_list_var)) {
                                        if (NIL == enoughP) {
                                            SubLObject csome_list_var_$3 = methods.funcall_instance_method_with_0_args(query, ANSWER);
                                            SubLObject passage = NIL;
                                            passage = csome_list_var_$3.first();
                                            while ((NIL == enoughP) && (NIL != csome_list_var_$3)) {
                                                if (NIL == set.set_memberP(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), texts)) {
                                                    set.set_add(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), texts);
                                                    if (NIL == enoughP) {
                                                        SubLObject csome_list_var_$4 = methods.funcall_instance_method_with_1_args(self, EXTRACT, passage);
                                                        SubLObject candidate = NIL;
                                                        candidate = csome_list_var_$4.first();
                                                        while ((NIL == enoughP) && (NIL != csome_list_var_$4)) {
                                                            candidates = cons(candidate, candidates);
                                                            i = add(i, ONE_INTEGER);
                                                            enoughP = numG(i, max_candidates);
                                                            csome_list_var_$4 = csome_list_var_$4.rest();
                                                            candidate = csome_list_var_$4.first();
                                                        } 
                                                    }
                                                }
                                                csome_list_var_$3 = csome_list_var_$3.rest();
                                                passage = csome_list_var_$3.first();
                                            } 
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        query = csome_list_var.first();
                                    } 
                                }
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != timed_outP) {
                    Errors.warn($str100$Answering__a_timed_out_after__a_s, self, timeout);
                }
                if (NIL != candidates) {
                    sublisp_throw($sym95$OUTER_CATCH_FOR_QUESTION_METHOD, list_utilities.first_n(cutoff, methods.funcall_class_method_with_1_args(candidates.first(), SELECT, candidates)));
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_question_max_candidates(self, max_candidates);
                    search_engine.set_information_request_timeout(self, timeout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var2, $sym95$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    public static SubLObject get_learnable_types() {
        SubLObject learnable_types = NIL;
        SubLObject cdolist_list_var = $list104;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6 = kb_mapping.gather_predicate_extent_index(predicate, $$GuruQAMt, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                learnable_types = cons(assertions_high.gaf_arg2(assertion), learnable_types);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                assertion = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return remove_duplicates(learnable_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject incompatible_p(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = (NIL != fort_types_interface.collection_in_any_mtP(v_term)) ? disjoint_with.disjoint_withP(v_term, collection, UNPROVIDED, UNPROVIDED) : isa.not_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject new_parse_vector(final SubLObject parse) {
        assert NIL != parse_tree.parse_tree_p(parse) : "parse_tree.parse_tree_p(parse) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(parse) " + parse;
        final SubLObject vec = sparse_vector.new_sparse_vector(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, YIELD);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != content_category_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))) {
                SubLObject cdolist_list_var_$7 = string_utilities.split_string(methods.funcall_instance_method_with_0_args(word, GET_STRING), UNPROVIDED);
                SubLObject string = NIL;
                string = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    sparse_vector.svector_inc(vec, morphology.get_root(string, UNPROVIDED));
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    string = cdolist_list_var_$7.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return vec;
    }

    public static SubLObject new_string_vector(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject vec = sparse_vector.new_sparse_vector(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, UNPROVIDED)));
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != content_category_p(document.word_category(word))) {
                sparse_vector.svector_inc(vec, morphology.get_root(document.word_string(word), UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return vec;
    }

    public static SubLObject tree_match(final SubLObject tree1, final SubLObject tree2) {
        final SubLObject vec1 = new_parse_vector(tree1);
        final SubLObject vec2 = new_parse_vector(tree2);
        return numG(scenario.safe_svector_cosine_angle(vec1, vec2, UNPROVIDED), $float$0_8);
    }

    public static SubLObject word_implies(final SubLObject word_tree1, final SubLObject word_tree2) {
        assert NIL != word_tree.word_tree_p(word_tree1) : "word_tree.word_tree_p(word_tree1) " + "CommonSymbols.NIL != word_tree.word_tree_p(word_tree1) " + word_tree1;
        assert NIL != word_tree.word_tree_p(word_tree2) : "word_tree.word_tree_p(word_tree2) " + "CommonSymbols.NIL != word_tree.word_tree_p(word_tree2) " + word_tree2;
        if ((NIL != parse_tree.verbal_tree_p(word_tree1)) && (NIL != parse_tree.verbal_tree_p(word_tree2))) {
            final SubLObject lexes1 = methods.funcall_instance_method_with_0_args(word_tree1, GET_LEXES);
            final SubLObject lexes2 = methods.funcall_instance_method_with_0_args(word_tree2, GET_LEXES);
            SubLObject cdolist_list_var = lexes1;
            SubLObject lex1 = NIL;
            lex1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$8 = lexes2;
                SubLObject lex2 = NIL;
                lex2 = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    if (NIL != at_utilities.more_specific_p(methods.funcall_instance_method_with_1_args(lex1, GET, $DENOT), methods.funcall_instance_method_with_1_args(lex2, GET, $DENOT), UNPROVIDED)) {
                        return T;
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    lex2 = cdolist_list_var_$8.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                lex1 = cdolist_list_var.first();
            } 
        }
        return equalp(morphology.find_stem(last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree1, GET_STRING), UNPROVIDED), UNPROVIDED).first(), UNPROVIDED), morphology.find_stem(last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree2, GET_STRING), UNPROVIDED), UNPROVIDED).first(), UNPROVIDED));
    }

    public static SubLObject position_mean(final SubLObject yield, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject positions = NIL;
        SubLObject position = ZERO_INTEGER;
        SubLObject found = NIL;
        SubLObject cdolist_list_var = yield;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            position = add(position, ONE_INTEGER);
            SubLObject cdolist_list_var_$9 = keywords;
            SubLObject keyword = NIL;
            keyword = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                if (NIL != word_implies(word, keyword)) {
                    positions = cons(position, positions);
                    final SubLObject item_var = methods.funcall_instance_method_with_0_args(keyword, GET_STRING);
                    if (NIL == member(item_var, found, EQUAL, symbol_function(IDENTITY))) {
                        found = cons(item_var, found);
                    }
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                keyword = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        if (NIL != positions) {
            thread.resetMultipleValues();
            final SubLObject deviation = number_utilities.standard_deviation_from_population(positions);
            final SubLObject mean = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(deviation, mean, length(found));
        }
        return NIL;
    }

    public static SubLObject split_yield(final SubLObject yield, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject deviation = position_mean(yield, keywords);
        final SubLObject mean = thread.secondMultipleValue();
        final SubLObject found = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rounded_mean = (mean.isNumber()) ? round(mean, UNPROVIDED) : NIL;
        if (NIL != rounded_mean) {
            return values(nreverse(list_utilities.first_n(rounded_mean, yield)), nthcdr(rounded_mean, yield), deviation, found);
        }
        return NIL;
    }

    public static SubLObject build_cyc_to_resporator_map() {
        final SubLObject map = make_hash_table($int$100, symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = $list104;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = kb_mapping.gather_predicate_extent_index(predicate, $$GuruQAMt, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                sethash(assertions_high.gaf_arg2(assertion), map, intern(string_utilities.strip_final(assertions_high.gaf_arg1(assertion), UNPROVIDED), UNPROVIDED));
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                assertion = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return map;
    }

    public static SubLObject cyc_to_resporator(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$cyc_to_resporator_map$.getDynamicValue(thread).isHashtable()) {
            $cyc_to_resporator_map$.setDynamicValue(build_cyc_to_resporator_map(), thread);
        }
        return gethash(constant, $cyc_to_resporator_map$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject sentencify(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject tokens = nl_trie.nl_trie_string_tokenize(separate_punctuation(string));
        final SubLObject length = length(tokens);
        final SubLObject sentence = document.new_sentence(UNPROVIDED, UNPROVIDED);
        final SubLObject words = make_vector(length, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_aref(words, i, document.new_word(list($STRING, token)));
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        document._csetf_sign_constituents(sentence, words);
        return sentence;
    }

    public static SubLObject separate_punctuation(SubLObject string) {
        string = string_utilities.string_substitute($str111$__, $str112$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str113$__, $str114$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str115$__, $str116$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str117$__, $str118$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str119$__, $str120$_, string, UNPROVIDED);
        if (NIL != string_utilities.ends_with(string, $str121$_, UNPROVIDED)) {
            set_aref(string, number_utilities.f_1_(length(string)), CHAR_space);
            string = cconcatenate(string, $str121$_);
        }
        return string;
    }

    public static SubLObject word_alternations(final SubLObject word, final SubLObject pos, final SubLObject lexicon) {
        final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, word);
        SubLObject variants = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_1_args(lex, GET, $CYC_POS).eql(pos)) {
                SubLObject cdolist_list_var_$11 = lexicon_accessors.get_strings_of_type(methods.funcall_instance_method_with_1_args(lex, GET, $WORD_UNIT), methods.funcall_instance_method_with_1_args(lex, GET, $CYC_POS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject variant = NIL;
                variant = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    final SubLObject item_var = variant;
                    if (NIL == member(item_var, variants, EQUAL, symbol_function(IDENTITY))) {
                        variants = cons(item_var, variants);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    variant = cdolist_list_var_$11.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        if (NIL == variants) {
            variants = cons(word, variants);
        }
        return variants;
    }

    public static SubLObject content_category_p(final SubLObject category) {
        return member(category, $list124, EQ, UNPROVIDED);
    }

    public static SubLObject test_questions(SubLObject file, SubLObject question_type) {
        if (file == UNPROVIDED) {
            file = $str125$_cyc_quirk_trec_questions_trec_qu;
        }
        if (question_type == UNPROVIDED) {
            question_type = QUESTION_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(file) : "Types.stringp(file) " + "CommonSymbols.NIL != Types.stringp(file) " + file;
        SubLObject i = ZERO_INTEGER;
        SubLObject tokens = NIL;
        SubLObject v_question = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str128$Unable_to_open__S, file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    if (NIL == string_utilities.starts_with(line, $str129$_)) {
                        i = add(i, ONE_INTEGER);
                        tokens = string_utilities.split_string(line, $list130);
                        v_question = new_question(tokens.first(), string_utilities.split_string(second(tokens), $list131), UNPROVIDED);
                        if ((NIL != v_question) && (NIL != funcall(question_type, v_question))) {
                            princ(i, UNPROVIDED);
                            princ($str132$__, UNPROVIDED);
                            princ(v_question, UNPROVIDED);
                            terpri(UNPROVIDED);
                            princ(methods.funcall_instance_method_with_0_args(v_question, ANSWER), UNPROVIDED);
                            terpri(UNPROVIDED);
                            terpri(UNPROVIDED);
                        }
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject test_scenario_questions(final SubLObject question_triples) {
        assert NIL != listp(question_triples) : "Types.listp(question_triples) " + "CommonSymbols.NIL != Types.listp(question_triples) " + question_triples;
        SubLObject v_question = NIL;
        SubLObject cdolist_list_var = question_triples;
        SubLObject question_triple = NIL;
        question_triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_question = new_question(third(question_triple), UNPROVIDED, UNPROVIDED);
            if (NIL != question_p(v_question)) {
                princ(question_triple.first(), UNPROVIDED);
                princ($str132$__, UNPROVIDED);
                princ(v_question, UNPROVIDED);
                terpri(UNPROVIDED);
                princ(methods.funcall_instance_method_with_0_args(v_question, ANSWER), UNPROVIDED);
                terpri(UNPROVIDED);
                terpri(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            question_triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_question_file() {
        declareFunction(me, "initialize_question", "INITIALIZE-QUESTION", 0, 0, false);
        declareFunction(me, "get_question_corpora", "GET-QUESTION-CORPORA", 1, 0, false);
        declareFunction(me, "set_question_corpora", "SET-QUESTION-CORPORA", 2, 0, false);
        declareFunction(me, "get_question_answer_types", "GET-QUESTION-ANSWER-TYPES", 1, 0, false);
        declareFunction(me, "set_question_answer_types", "SET-QUESTION-ANSWER-TYPES", 2, 0, false);
        declareFunction(me, "get_question_parse", "GET-QUESTION-PARSE", 1, 0, false);
        declareFunction(me, "set_question_parse", "SET-QUESTION-PARSE", 2, 0, false);
        declareFunction(me, "get_question_string", "GET-QUESTION-STRING", 1, 0, false);
        declareFunction(me, "set_question_string", "SET-QUESTION-STRING", 2, 0, false);
        declareFunction(me, "get_question_learnable_types", "GET-QUESTION-LEARNABLE-TYPES", 1, 0, false);
        declareFunction(me, "set_question_learnable_types", "SET-QUESTION-LEARNABLE-TYPES", 2, 0, false);
        declareFunction(me, "get_question_max_confidence", "GET-QUESTION-MAX-CONFIDENCE", 1, 0, false);
        declareFunction(me, "set_question_max_confidence", "SET-QUESTION-MAX-CONFIDENCE", 2, 0, false);
        declareFunction(me, "get_question_max_candidates", "GET-QUESTION-MAX-CANDIDATES", 1, 0, false);
        declareFunction(me, "set_question_max_candidates", "SET-QUESTION-MAX-CANDIDATES", 2, 0, false);
        declareFunction(me, "get_question_chunker", "GET-QUESTION-CHUNKER", 1, 0, false);
        declareFunction(me, "set_question_chunker", "SET-QUESTION-CHUNKER", 2, 0, false);
        declareFunction(me, "get_question_tagger", "GET-QUESTION-TAGGER", 1, 0, false);
        declareFunction(me, "set_question_tagger", "SET-QUESTION-TAGGER", 2, 0, false);
        declareFunction(me, "get_question_parser", "GET-QUESTION-PARSER", 1, 0, false);
        declareFunction(me, "set_question_parser", "SET-QUESTION-PARSER", 2, 0, false);
        declareFunction(me, "get_question_lexicon", "GET-QUESTION-LEXICON", 1, 0, false);
        declareFunction(me, "set_question_lexicon", "SET-QUESTION-LEXICON", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_question_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_question_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "question_p", "QUESTION-P", 1, 0, false);
        declareFunction(me, "question_classify_method", "QUESTION-CLASSIFY-METHOD", 2, 0, false);
        declareFunction(me, "question_isaP_method", "QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "question_initialize_method", "QUESTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "question_augment_terms_method", "QUESTION-AUGMENT-TERMS-METHOD", 3, 0, false);
        declareFunction(me, "question_require_percentage_method", "QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false);
        declareFunction(me, "np_term_match", "NP-TERM-MATCH", 2, 1, false);
        declareFunction(me, "question_tree_type_match_method", "QUESTION-TREE-TYPE-MATCH-METHOD", 2, 0, false);
        declareFunction(me, "question_answer_types_method", "QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction(me, "question_get_keywords_method", "QUESTION-GET-KEYWORDS-METHOD", 1, 0, false);
        declareFunction(me, "question_get_keystrings_method", "QUESTION-GET-KEYSTRINGS-METHOD", 1, 0, false);
        declareFunction(me, "question_candidate_answer_p_method", "QUESTION-CANDIDATE-ANSWER-P-METHOD", 2, 0, false);
        declareFunction(me, "new_question", "NEW-QUESTION", 1, 2, false);
        declareFunction(me, "question_print_method", "QUESTION-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "question_get_string_method", "QUESTION-GET-STRING-METHOD", 1, 0, false);
        declareFunction(me, "question_answer_method", "QUESTION-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "get_learnable_types", "GET-LEARNABLE-TYPES", 0, 0, false);
        declareFunction(me, "incompatible_p", "INCOMPATIBLE-P", 2, 0, false);
        declareFunction(me, "new_parse_vector", "NEW-PARSE-VECTOR", 1, 0, false);
        declareFunction(me, "new_string_vector", "NEW-STRING-VECTOR", 1, 0, false);
        declareFunction(me, "tree_match", "TREE-MATCH", 2, 0, false);
        declareFunction(me, "word_implies", "WORD-IMPLIES", 2, 0, false);
        declareFunction(me, "position_mean", "POSITION-MEAN", 2, 0, false);
        declareFunction(me, "split_yield", "SPLIT-YIELD", 2, 0, false);
        declareFunction(me, "build_cyc_to_resporator_map", "BUILD-CYC-TO-RESPORATOR-MAP", 0, 0, false);
        declareFunction(me, "cyc_to_resporator", "CYC-TO-RESPORATOR", 1, 0, false);
        declareFunction(me, "sentencify", "SENTENCIFY", 1, 0, false);
        declareFunction(me, "separate_punctuation", "SEPARATE-PUNCTUATION", 1, 0, false);
        declareFunction(me, "word_alternations", "WORD-ALTERNATIONS", 3, 0, false);
        declareFunction(me, "content_category_p", "CONTENT-CATEGORY-P", 1, 0, false);
        declareFunction(me, "test_questions", "TEST-QUESTIONS", 0, 2, false);
        declareFunction(me, "test_scenario_questions", "TEST-SCENARIO-QUESTIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_question_file() {
        defvar("*QUESTION-PARSER*", NIL);
        defvar("*QUESTION-LEXICON*", NIL);
        defvar("*SKSI-REGISTERED*", NIL);
        defvar("*CYC-TO-RESPORATOR-MAP*", NIL);
        return NIL;
    }

    public static SubLObject setup_question_file() {
        classes.subloop_new_class(QUESTION, INFORMATION_REQUEST, NIL, NIL, $list6);
        classes.class_set_implements_slot_listeners(QUESTION, NIL);
        classes.subloop_note_class_initialization_function(QUESTION, SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(QUESTION, SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE);
        subloop_reserved_initialize_question_class(QUESTION);
        methods.methods_incorporate_class_method(CLASSIFY, QUESTION, $list27, $list28, $list29);
        methods.subloop_register_class_method(QUESTION, CLASSIFY, QUESTION_CLASSIFY_METHOD);
        methods.methods_incorporate_class_method($sym30$ISA_, QUESTION, $list27, $list28, $list33);
        methods.subloop_register_class_method(QUESTION, $sym30$ISA_, $sym34$QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, QUESTION, $list27, NIL, $list36);
        methods.subloop_register_instance_method(QUESTION, INITIALIZE, QUESTION_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(AUGMENT_TERMS, QUESTION, $list27, $list40, $list41);
        methods.subloop_register_class_method(QUESTION, AUGMENT_TERMS, QUESTION_AUGMENT_TERMS_METHOD);
        methods.methods_incorporate_class_method(REQUIRE_PERCENTAGE, QUESTION, $list27, NIL, $list48);
        methods.subloop_register_class_method(QUESTION, REQUIRE_PERCENTAGE, QUESTION_REQUIRE_PERCENTAGE_METHOD);
        methods.methods_incorporate_instance_method(TREE_TYPE_MATCH, QUESTION, $list27, $list28, $list54);
        methods.subloop_register_instance_method(QUESTION, TREE_TYPE_MATCH, QUESTION_TREE_TYPE_MATCH_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, QUESTION, $list27, NIL, $list61);
        methods.subloop_register_instance_method(QUESTION, ANSWER_TYPES, QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method(GET_KEYWORDS, QUESTION, $list27, NIL, $list63);
        methods.subloop_register_instance_method(QUESTION, GET_KEYWORDS, QUESTION_GET_KEYWORDS_METHOD);
        methods.methods_incorporate_instance_method(GET_KEYSTRINGS, QUESTION, $list27, NIL, $list69);
        methods.subloop_register_instance_method(QUESTION, GET_KEYSTRINGS, QUESTION_GET_KEYSTRINGS_METHOD);
        methods.methods_incorporate_instance_method(CANDIDATE_ANSWER_P, QUESTION, $list27, $list28, $list73);
        methods.subloop_register_instance_method(QUESTION, CANDIDATE_ANSWER_P, QUESTION_CANDIDATE_ANSWER_P_METHOD);
        methods.methods_incorporate_instance_method(PRINT, QUESTION, $list27, $list82, $list83);
        methods.subloop_register_instance_method(QUESTION, PRINT, QUESTION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, QUESTION, $list89, NIL, $list90);
        methods.subloop_register_instance_method(QUESTION, GET_STRING, QUESTION_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(ANSWER, QUESTION, $list89, NIL, $list94);
        methods.subloop_register_instance_method(QUESTION, ANSWER, QUESTION_ANSWER_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_question_file();
    }

    @Override
    public void initializeVariables() {
        init_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_question_file();
    }



    private static final SubLInteger $int$30 = makeInteger(30);



    public static final SubLList $list3 = list(reader_make_constant_shell(makeString("Usgs-KS")), reader_make_constant_shell(makeString("NGA-KS")));





    public static final SubLList $list6 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("CHUNKER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("MAX-CANDIDATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TWENTY_INTEGER), list(makeSymbol("MAX-CONFIDENCE"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TEN_INTEGER), list(makeSymbol("LEARNABLE-TYPES"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWER-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CLASSIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("AUGMENT-TERMS"), list(makeSymbol("TERMS"), makeSymbol("CORPUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-PERCENTAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CANDIDATE-ANSWER-P"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORDS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYSTRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")) });



























    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE");

    public static final SubLSymbol CLASSIFY = makeSymbol("CLASSIFY");

    public static final SubLList $list27 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list28 = list(makeSymbol("TREE"));

    public static final SubLList $list29 = list(makeString("@param TREE parse-tree-p; the parse tree to be classified\n   @return symbolp, the question class of PARSE, or nil if there is none\n   This happens by iterating over all subclasses of questions (via \n   introspection) and calling the \'isa\' predicate with TREE as its argument.\n   If TREE does qualify as a question tree of a subclass, \'isa?\' will return \n   t and that class will be added to the list of questions that TREE qualifies\n   as"), list(makeSymbol("PUNLESS"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-STACK"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("QCLASSES"), NIL)), list(makeSymbol("STACK-PUSH"), makeSymbol("SELF"), makeSymbol("CLASS-STACK")), list(makeSymbol("UNTIL"), list(makeSymbol("STACK-EMPTY-P"), makeSymbol("CLASS-STACK")), list(makeSymbol("CLET"), list(list(makeSymbol("QCLASS"), list(makeSymbol("STACK-POP"), makeSymbol("CLASS-STACK")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(makeSymbol("QUOTE"), makeSymbol("ISA?")), makeSymbol("TREE")), list(makeSymbol("CPUSH"), makeSymbol("QCLASS"), makeSymbol("QCLASSES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD-CLASS"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(makeSymbol("QUOTE"), makeSymbol("CHILD-CLASSES")))), list(makeSymbol("STACK-PUSH"), makeSymbol("CHILD-CLASS"), makeSymbol("CLASS-STACK"))))), list(makeSymbol("RET"), makeSymbol("QCLASSES"))));

    public static final SubLSymbol $sym30$ISA_ = makeSymbol("ISA?");

    public static final SubLSymbol CHILD_CLASSES = makeSymbol("CHILD-CLASSES");

    public static final SubLSymbol QUESTION_CLASSIFY_METHOD = makeSymbol("QUESTION-CLASSIFY-METHOD");

    public static final SubLList $list33 = list(makeString("@param TREE parse-tree-p; the tree for which we need to decide whether it can \n   be this kind of question\n   @return boolean; t if TREE is this kind of question, nil otherwise\n   @note each subclass of question needs to implement this method to recognize a \n   parse tree as a particular kind of question, otherwise, it\'ll default to nil"), list(makeSymbol("RET"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE"))));

    public static final SubLSymbol $sym34$QUESTION_ISA__METHOD = makeSymbol("QUESTION-ISA?-METHOD");



    public static final SubLList $list36 = list(makeString("Initializes all class slots in question"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("TERM-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-STANFORD-PARSER"), makeKeyword("WARN"), makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(makeSymbol("PUNLESS"), makeSymbol("CHUNKER"), list(makeSymbol("CSETQ"), makeSymbol("CHUNKER"), list(makeSymbol("NEW-SHALLOW-PARSER"), makeKeyword("WARN"), TEN_INTEGER))), list(makeSymbol("PUNLESS"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("CSETQ"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("GET-LEARNABLE-TYPES")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    public static final SubLSymbol QUESTION_INITIALIZE_METHOD = makeSymbol("QUESTION-INITIALIZE-METHOD");



    public static final SubLList $list40 = list(makeSymbol("TERMS"), makeSymbol("CORPUS"));

    public static final SubLList $list41 = list(makeString("@param TERMS listp; a list of strings to topically augment with related terms\n   @return listp; a list of terms topically related to TERMS"), list(makeSymbol("CLET"), list(makeSymbol("WORD-GRAPH"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("WORD-GRAPH"), list(makeSymbol("GET-WORD-GRAPH"), makeSymbol("TERMS"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeString("index"), list(makeSymbol("GET-WORD-GRAPH-PATH"), makeSymbol("CORPUS"))))))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("Could not get augmentation terms for ~S"), makeSymbol("TERMS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("WORD-GRAPH")), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("MAKE-GRAPH-FROM-STRING-LISTS"), makeSymbol("WORD-GRAPH")), list(makeSymbol("QUOTE"), makeSymbol("GET-PATH-LABELS")), makeSymbol("TERMS"))))));



    public static final SubLString $$$index = makeString("index");

    public static final SubLString $str44$Could_not_get_augmentation_terms_ = makeString("Could not get augmentation terms for ~S");

    public static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    public static final SubLSymbol QUESTION_AUGMENT_TERMS_METHOD = makeSymbol("QUESTION-AUGMENT-TERMS-METHOD");



    public static final SubLList $list48 = list(makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), list(makeSymbol("RET"), makeInteger(100)));



    public static final SubLSymbol QUESTION_REQUIRE_PERCENTAGE_METHOD = makeSymbol("QUESTION-REQUIRE-PERCENTAGE-METHOD");





    public static final SubLSymbol TREE_TYPE_MATCH = makeSymbol("TREE-TYPE-MATCH");

    public static final SubLList $list54 = list(makeString("@param TREE parse-tree-p; a possible answer for this question\n   @return numberp; a score for how well TREE matches the answer types this question requires"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))), makeSymbol("I"), makeSymbol("DENOT"), makeSymbol("SCORE"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORDS")))), list(makeSymbol("PWHEN"), list(makeSymbol("TREE-MATCH"), makeSymbol("HEAD"), makeSymbol("KEYWORD")), list(makeSymbol("RET"), ZERO_INTEGER))), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("DENOT"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-PATH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-TYPES")))), list(makeSymbol("CSETQ"), makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("TYPE-PATH"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), NIL), list(makeSymbol("CSOME"), list(makeSymbol("REQUIRED-TYPE"), makeSymbol("TYPE-PATH"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), list(makeSymbol("1+"), list(makeSymbol("LOG"), makeSymbol("I"), TWO_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE")), list(makeSymbol("RET"), makeSymbol("SCORE"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), list(makeSymbol("INCOMPATIBLE-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE"))), list(makeSymbol("CDEC"), makeSymbol("I"))))))), list(makeSymbol("RET"), ZERO_INTEGER));

    public static final SubLSymbol $sym55$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");









    public static final SubLSymbol QUESTION_TREE_TYPE_MATCH_METHOD = makeSymbol("QUESTION-TREE-TYPE-MATCH-METHOD");

    public static final SubLList $list61 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol QUESTION_ANSWER_TYPES_METHOD = makeSymbol("QUESTION-ANSWER-TYPES-METHOD");

    public static final SubLList $list63 = list(makeString("@return listp; the non-functional or content strings of this question"), list(makeSymbol("CLET"), list(list(makeSymbol("KEYWORDS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CONTENT-CATEGORY-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("KEYWORDS")))), list(makeSymbol("RET"), makeSymbol("KEYWORDS"))));

    public static final SubLSymbol $sym64$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");





    public static final SubLSymbol QUESTION_GET_KEYWORDS_METHOD = makeSymbol("QUESTION-GET-KEYWORDS-METHOD");



    public static final SubLList $list69 = list(makeString("@return listp; the non-functional or content strings of this question"), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("WORD-TREE-GET-STRING-METHOD")), list(makeSymbol("GET-KEYWORDS"), makeSymbol("SELF")))));

    public static final SubLSymbol WORD_TREE_GET_STRING_METHOD = makeSymbol("WORD-TREE-GET-STRING-METHOD");

    public static final SubLSymbol QUESTION_GET_KEYSTRINGS_METHOD = makeSymbol("QUESTION-GET-KEYSTRINGS-METHOD");



    public static final SubLList $list73 = list(makeString("@return boolanp; t if TREE is considered to be a candidate answer to this question\n   on semantic grounds, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TREE-TYPE-MATCH")), makeSymbol("TREE")), makeDouble(0.3))));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    public static final SubLSymbol QUESTION_CANDIDATE_ANSWER_P_METHOD = makeSymbol("QUESTION-CANDIDATE-ANSWER-P-METHOD");

    public static final SubLList $list76 = list(makeString("AQUAINT"));











    public static final SubLList $list82 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list83 = list(makeString("Prints QUESTION to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym84$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    public static final SubLString $str85$__ = makeString("#<");

    public static final SubLString $str86$__ = makeString(": ");

    public static final SubLString $str87$_ = makeString(">");

    public static final SubLSymbol QUESTION_PRINT_METHOD = makeSymbol("QUESTION-PRINT-METHOD");

    public static final SubLList $list89 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list90 = list(makeString("@return stringp; the surface string of QUESTION"), list(makeSymbol("RET"), makeSymbol("STRING")));

    public static final SubLSymbol $sym91$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    public static final SubLSymbol QUESTION_GET_STRING_METHOD = makeSymbol("QUESTION-GET-STRING-METHOD");



    public static final SubLList $list94 = list(makeString("@return listp; a list of answers to this question"), list(makeSymbol("CLET"), list(list(makeSymbol("TEXTS"), list(makeSymbol("NEW-SET"), list(makeSymbol("QUOTE"), EQUAL))), list(makeSymbol("ENOUGH?"), NIL), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CANDIDATES"), NIL), list(makeSymbol("CUTOFF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-CARDINALITY")))), makeSymbol("TIMED-OUT?")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), list(makeSymbol("CSOME"), list(makeSymbol("QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("QUERIFY"))), makeSymbol("ENOUGH?")), list(makeSymbol("CSOME"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("QUERY"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER"))), makeSymbol("ENOUGH?")), list(makeSymbol("PUNLESS"), list(makeSymbol("SET-MEMBER?"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("SET-ADD"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("CSOME"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT")), makeSymbol("PASSAGE")), makeSymbol("ENOUGH?")), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CSETQ"), makeSymbol("ENOUGH?"), list(makeSymbol(">"), makeSymbol("I"), makeSymbol("MAX-CANDIDATES")))))))), list(makeSymbol("PWHEN"), makeSymbol("TIMED-OUT?"), list(makeSymbol("WARN"), makeString("Answering ~a timed out after ~a seconds~%"), makeSymbol("SELF"), makeSymbol("TIMEOUT"))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATES"), list(makeSymbol("RET"), list(makeSymbol("FIRST-N"), makeSymbol("CUTOFF"), list(makeSymbol("FCM"), list(makeSymbol("FIRST"), makeSymbol("CANDIDATES")), list(makeSymbol("QUOTE"), makeSymbol("SELECT")), makeSymbol("CANDIDATES")))))));

    public static final SubLSymbol $sym95$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");









    public static final SubLString $str100$Answering__a_timed_out_after__a_s = makeString("Answering ~a timed out after ~a seconds~%");



    public static final SubLSymbol QUESTION_ANSWER_METHOD = makeSymbol("QUESTION-ANSWER-METHOD");

    private static final SubLObject $$GuruQAMt = reader_make_constant_shell(makeString("GuruQAMt"));

    public static final SubLList $list104 = list(reader_make_constant_shell(makeString("guruqaGenlsToken")), reader_make_constant_shell(makeString("guruqaTypeToken")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLFloat $float$0_8 = makeDouble(0.8);





    public static final SubLString $str111$__ = makeString(" ,");

    public static final SubLString $str112$_ = makeString(",");

    public static final SubLString $str113$__ = makeString(" ;");

    public static final SubLString $str114$_ = makeString(";");

    public static final SubLString $str115$__ = makeString(" :");

    public static final SubLString $str116$_ = makeString(":");

    public static final SubLString $str117$__ = makeString("( ");

    public static final SubLString $str118$_ = makeString("(");

    public static final SubLString $str119$__ = makeString(" )");

    public static final SubLString $str120$_ = makeString(")");

    public static final SubLString $str121$_ = makeString(".");





    public static final SubLList $list124 = list(new SubLObject[]{ makeKeyword("NNP"), makeKeyword("NP"), makeKeyword("NNPS"), makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("JJ"), makeKeyword("VBP"), makeKeyword("VB"), makeKeyword("VBD"), makeKeyword("VBG"), makeKeyword("VBN"), makeKeyword("VBZ"), makeKeyword("CD") });

    public static final SubLString $str125$_cyc_quirk_trec_questions_trec_qu = makeString("/cyc/quirk/trec-questions/trec-questions.txt");

    public static final SubLSymbol QUESTION_P = makeSymbol("QUESTION-P");



    public static final SubLString $str128$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str129$_ = makeString("#");

    public static final SubLList $list130 = list(CHAR_tab);

    public static final SubLList $list131 = list(CHAR_space);

    public static final SubLString $str132$__ = makeString(". ");

    
}

/**
 * Total time: 499 ms
 */

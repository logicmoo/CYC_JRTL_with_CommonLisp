/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUESTION
 * source file: /cyc/top/cycl/quirk/question.lisp
 * created:     2019/07/03 17:39:01
 */
public final class question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new question();



    // defvar
    // Definitions
    // the standard parser to first parse the question string
    /**
     * the standard parser to first parse the question string
     */
    @LispMethod(comment = "the standard parser to first parse the question string\ndefvar")
    private static final SubLSymbol $question_parser$ = makeSymbol("*QUESTION-PARSER*");

    // defvar
    // the standard lexicon to first lexify the parsed question
    /**
     * the standard lexicon to first lexify the parsed question
     */
    @LispMethod(comment = "the standard lexicon to first lexify the parsed question\ndefvar")
    private static final SubLSymbol $question_lexicon$ = makeSymbol("*QUESTION-LEXICON*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $sksi_registered$ = makeSymbol("*SKSI-REGISTERED*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $cyc_to_resporator_map$ = makeSymbol("*CYC-TO-RESPORATOR-MAP*");

    public static final SubLObject initialize_question_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $question_parser$.getDynamicValue(thread)) {
                $question_parser$.setDynamicValue(parser.new_stanford_parser($WARN, $int$30), thread);
            }
            if (NIL == $question_lexicon$.getDynamicValue(thread)) {
                $question_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
            }
            if (NIL == $sksi_registered$.getDynamicValue(thread)) {
                sksi_sks_manager.register_sksi_removal_modules_for_skses($list_alt3);
                $sksi_registered$.setDynamicValue(T, thread);
            }
            return NIL;
        }
    }

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

    public static final SubLObject get_question_corpora_alt(SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, SIX_INTEGER, CORPORA);
    }

    public static SubLObject get_question_corpora(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, SIX_INTEGER, CORPORA);
    }

    public static final SubLObject set_question_corpora_alt(SubLObject v_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, SIX_INTEGER, CORPORA);
    }

    public static SubLObject set_question_corpora(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, SIX_INTEGER, CORPORA);
    }

    public static final SubLObject get_question_answer_types_alt(SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static SubLObject get_question_answer_types(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static final SubLObject set_question_answer_types_alt(SubLObject v_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static SubLObject set_question_answer_types(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FIVE_INTEGER, ANSWER_TYPES);
    }

    public static final SubLObject get_question_parse_alt(SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FOUR_INTEGER, PARSE);
    }

    public static SubLObject get_question_parse(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, FOUR_INTEGER, PARSE);
    }

    public static final SubLObject set_question_parse_alt(SubLObject v_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FOUR_INTEGER, PARSE);
    }

    public static SubLObject set_question_parse(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, FOUR_INTEGER, PARSE);
    }

    public static final SubLObject get_question_string_alt(SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, THREE_INTEGER, STRING);
    }

    public static SubLObject get_question_string(final SubLObject v_question) {
        return classes.subloop_get_access_protected_instance_slot(v_question, THREE_INTEGER, STRING);
    }

    public static final SubLObject set_question_string_alt(SubLObject v_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, THREE_INTEGER, STRING);
    }

    public static SubLObject set_question_string(final SubLObject v_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_question, value, THREE_INTEGER, STRING);
    }

    public static final SubLObject get_question_learnable_types_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_learnable_types(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_learnable_types_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_learnable_types(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_max_confidence_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_max_confidence(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_max_confidence_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_max_confidence(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_max_candidates_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_max_candidates(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_max_candidates_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_max_candidates(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_chunker_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_chunker(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_chunker_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_chunker(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CHUNKER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_tagger_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_tagger(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_tagger_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_tagger(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_parser_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_parser(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_parser_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_parser(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_question_lexicon_alt(SubLObject v_question) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_question_lexicon(final SubLObject v_question) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_question_lexicon_alt(SubLObject v_question, SubLObject value) {
        {
            SubLObject v_class = (v_question.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_question))) : NIL != subloop_structures.class_p(v_question) ? ((SubLObject) (v_question)) : NIL != subloop_structures.instance_p(v_question) ? ((SubLObject) (subloop_structures.instance_class(v_question))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_question_lexicon(final SubLObject v_question, final SubLObject value) {
        final SubLObject v_class = (v_question.isSymbol()) ? classes.classes_retrieve_class(v_question) : NIL != subloop_structures.class_p(v_question) ? v_question : NIL != subloop_structures.instance_p(v_question) ? subloop_structures.instance_class(v_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_question_class_alt(SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_question_instance_alt(SubLObject new_instance) {
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

    public static final SubLObject question_p_alt(SubLObject v_question) {
        return classes.subloop_instanceof_class(v_question, QUESTION);
    }

    public static SubLObject question_p(final SubLObject v_question) {
        return classes.subloop_instanceof_class(v_question, QUESTION);
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; the parse tree to be classified
     * @return symbolp, the question class of PARSE, or nil if there is none
    This happens by iterating over all subclasses of questions (via
    introspection) and calling the 'isa' predicate with TREE as its argument.
    If TREE does qualify as a question tree of a subclass, 'isa?' will return
    t and that class will be added to the list of questions that TREE qualifies
    as
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; the parse tree to be classified\r\n@return symbolp, the question class of PARSE, or nil if there is none\r\nThis happens by iterating over all subclasses of questions (via\r\nintrospection) and calling the \'isa\' predicate with TREE as its argument.\r\nIf TREE does qualify as a question tree of a subclass, \'isa?\' will return\r\nt and that class will be added to the list of questions that TREE qualifies\r\nas")
    public static final SubLObject question_classify_method_alt(SubLObject self, SubLObject tree) {
        if (NIL == parse_tree.question_tree_p(tree)) {
            return NIL;
        }
        {
            SubLObject class_stack = stacks.create_stack();
            SubLObject qclasses = NIL;
            stacks.stack_push(self, class_stack);
            while (NIL == stacks.stack_empty_p(class_stack)) {
                {
                    SubLObject qclass = stacks.stack_pop(class_stack);
                    if (NIL != methods.funcall_class_method_with_1_args(qclass, $sym30$ISA_, tree)) {
                        qclasses = cons(qclass, qclasses);
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args(qclass, CHILD_CLASSES);
                        SubLObject child_class = NIL;
                        for (child_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child_class = cdolist_list_var.first()) {
                            stacks.stack_push(child_class, class_stack);
                        }
                    }
                }
            } 
            return qclasses;
        }
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; the parse tree to be classified
     * @return symbolp, the question class of PARSE, or nil if there is none
    This happens by iterating over all subclasses of questions (via
    introspection) and calling the 'isa' predicate with TREE as its argument.
    If TREE does qualify as a question tree of a subclass, 'isa?' will return
    t and that class will be added to the list of questions that TREE qualifies
    as
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; the parse tree to be classified\r\n@return symbolp, the question class of PARSE, or nil if there is none\r\nThis happens by iterating over all subclasses of questions (via\r\nintrospection) and calling the \'isa\' predicate with TREE as its argument.\r\nIf TREE does qualify as a question tree of a subclass, \'isa?\' will return\r\nt and that class will be added to the list of questions that TREE qualifies\r\nas")
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

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; the tree for which we need to decide whether it can
     * 		be this kind of question
     * @return boolean; t if TREE is this kind of question, nil otherwise
     * @unknown each subclass of question needs to implement this method to recognize a
    parse tree as a particular kind of question, otherwise, it'll default to nil
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; the tree for which we need to decide whether it can\r\n\t\tbe this kind of question\r\n@return boolean; t if TREE is this kind of question, nil otherwise\r\n@unknown each subclass of question needs to implement this method to recognize a\r\nparse tree as a particular kind of question, otherwise, it\'ll default to nil")
    public static final SubLObject question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return parse_tree.question_tree_p(tree);
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; the tree for which we need to decide whether it can
     * 		be this kind of question
     * @return boolean; t if TREE is this kind of question, nil otherwise
     * @unknown each subclass of question needs to implement this method to recognize a
    parse tree as a particular kind of question, otherwise, it'll default to nil
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; the tree for which we need to decide whether it can\r\n\t\tbe this kind of question\r\n@return boolean; t if TREE is this kind of question, nil otherwise\r\n@unknown each subclass of question needs to implement this method to recognize a\r\nparse tree as a particular kind of question, otherwise, it\'ll default to nil")
    public static SubLObject question_isaP_method(final SubLObject self, final SubLObject tree) {
        return parse_tree.question_tree_p(tree);
    }

    /**
     * Initializes all class slots in question
     */
    @LispMethod(comment = "Initializes all class slots in question")
    public static final SubLObject question_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject learnable_types = com.cyc.cycjava.cycl.quirk.question.get_question_learnable_types(self);
            SubLObject chunker = com.cyc.cycjava.cycl.quirk.question.get_question_chunker(self);
            SubLObject tagger = com.cyc.cycjava.cycl.quirk.question.get_question_tagger(self);
            SubLObject v_parser = com.cyc.cycjava.cycl.quirk.question.get_question_parser(self);
            SubLObject lexicon = com.cyc.cycjava.cycl.quirk.question.get_question_lexicon(self);
            try {
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
                        learnable_types = com.cyc.cycjava.cycl.quirk.question.get_learnable_types();
                    }
                    sublisp_throw($sym37$OUTER_CATCH_FOR_QUESTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.question.set_question_learnable_types(self, learnable_types);
                            com.cyc.cycjava.cycl.quirk.question.set_question_chunker(self, chunker);
                            com.cyc.cycjava.cycl.quirk.question.set_question_tagger(self, tagger);
                            com.cyc.cycjava.cycl.quirk.question.set_question_parser(self, v_parser);
                            com.cyc.cycjava.cycl.quirk.question.set_question_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    /**
     * Initializes all class slots in question
     */
    @LispMethod(comment = "Initializes all class slots in question")
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

    /**
     *
     *
     * @param TERMS
     * 		listp; a list of strings to topically augment with related terms
     * @return listp; a list of terms topically related to TERMS
     */
    @LispMethod(comment = "@param TERMS\r\n\t\tlistp; a list of strings to topically augment with related terms\r\n@return listp; a list of terms topically related to TERMS")
    public static final SubLObject question_augment_terms_method_alt(SubLObject self, SubLObject terms, SubLObject corpus) {
        {
            SubLObject word_graph = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            word_graph = external_interfaces.get_word_graph(terms, list(list($$$index, external_interfaces.get_word_graph_path(corpus))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                Errors.warn($str_alt44$Could_not_get_augmentation_terms_, terms);
            }
            if (word_graph.isCons()) {
                return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(word_graph), GET_PATH_LABELS, terms);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TERMS
     * 		listp; a list of strings to topically augment with related terms
     * @return listp; a list of terms topically related to TERMS
     */
    @LispMethod(comment = "@param TERMS\r\n\t\tlistp; a list of strings to topically augment with related terms\r\n@return listp; a list of terms topically related to TERMS")
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

    /**
     *
     *
     * @return positive-integer-p; the percentage of total confidence weight of candidate
    answers to be returned as actual answers
     */
    @LispMethod(comment = "@return positive-integer-p; the percentage of total confidence weight of candidate\r\nanswers to be returned as actual answers")
    public static final SubLObject question_require_percentage_method_alt(SubLObject self) {
        return $int$100;
    }

    /**
     *
     *
     * @return positive-integer-p; the percentage of total confidence weight of candidate
    answers to be returned as actual answers
     */
    @LispMethod(comment = "@return positive-integer-p; the percentage of total confidence weight of candidate\r\nanswers to be returned as actual answers")
    public static SubLObject question_require_percentage_method(final SubLObject self) {
        return $int$100;
    }

    public static final SubLObject np_term_match_alt(SubLObject np, SubLObject v_term, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        {
            SubLObject head = methods.funcall_instance_method_with_0_args(np, GET_HEAD);
            SubLObject head_words = (NIL != head) ? ((SubLObject) (string_utilities.split_string(methods.funcall_instance_method_with_0_args(head, GET_STRING), UNPROVIDED))) : NIL;
            SubLObject term_words = string_utilities.split_string(v_term, UNPROVIDED);
            return makeBoolean((NIL != intersection(head_words, term_words, test, UNPROVIDED)) && (NIL != string_utilities.substringP(v_term, methods.funcall_instance_method_with_0_args(np, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
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

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; a possible answer for this question
     * @return numberp; a score for how well TREE matches the answer types this question requires
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; a possible answer for this question\r\n@return numberp; a score for how well TREE matches the answer types this question requires")
    public static final SubLObject question_tree_type_match_method_alt(SubLObject self, SubLObject tree) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject answer_types = com.cyc.cycjava.cycl.quirk.question.get_question_answer_types(self);
            try {
                try {
                    {
                        SubLObject head = methods.funcall_instance_method_with_0_args(tree, GET_HEAD);
                        SubLObject i = NIL;
                        SubLObject denot = NIL;
                        SubLObject score = NIL;
                        SubLObject incompatibleP = NIL;
                        if (NIL != head) {
                            {
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS);
                                SubLObject keyword = NIL;
                                for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.quirk.question.tree_match(head, keyword)) {
                                        sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
                                SubLObject lex = NIL;
                                for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                                    denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                                    {
                                        SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(self, ANSWER_TYPES);
                                        SubLObject type_path = NIL;
                                        for (type_path = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , type_path = cdolist_list_var_1.first()) {
                                            i = length(type_path);
                                            incompatibleP = NIL;
                                            if (NIL == incompatibleP) {
                                                {
                                                    SubLObject csome_list_var = type_path;
                                                    SubLObject required_type = NIL;
                                                    for (required_type = csome_list_var.first(); !((NIL != incompatibleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , required_type = csome_list_var.first()) {
                                                        score = number_utilities.f_1X(log(i, TWO_INTEGER));
                                                        if (NIL != at_utilities.more_specific_p(denot, required_type, UNPROVIDED)) {
                                                            sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, score);
                                                        }
                                                        incompatibleP = com.cyc.cycjava.cycl.quirk.question.incompatible_p(denot, required_type);
                                                        i = subtract(i, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.question.set_question_answer_types(self, answer_types);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-p; a possible answer for this question
     * @return numberp; a score for how well TREE matches the answer types this question requires
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-p; a possible answer for this question\r\n@return numberp; a score for how well TREE matches the answer types this question requires")
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

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static final SubLObject question_answer_types_method_alt(SubLObject self) {
        return NIL;
    }

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static SubLObject question_answer_types_method(final SubLObject self) {
        return NIL;
    }

    /**
     *
     *
     * @return listp; the non-functional or content strings of this question
     */
    @LispMethod(comment = "@return listp; the non-functional or content strings of this question")
    public static final SubLObject question_get_keywords_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject parse = com.cyc.cycjava.cycl.quirk.question.get_question_parse(self);
            try {
                try {
                    {
                        SubLObject keywords = NIL;
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, YIELD);
                        SubLObject word = NIL;
                        for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.quirk.question.content_category_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))) {
                                keywords = cons(word, keywords);
                            }
                        }
                        sublisp_throw($sym64$OUTER_CATCH_FOR_QUESTION_METHOD, keywords);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    /**
     *
     *
     * @return listp; the non-functional or content strings of this question
     */
    @LispMethod(comment = "@return listp; the non-functional or content strings of this question")
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

    /**
     *
     *
     * @return listp; the non-functional or content strings of this question
     */
    @LispMethod(comment = "@return listp; the non-functional or content strings of this question")
    public static final SubLObject question_get_keystrings_method_alt(SubLObject self) {
        return Mapping.mapcar(symbol_function(WORD_TREE_GET_STRING_METHOD), com.cyc.cycjava.cycl.quirk.question.question_get_keywords_method(self));
    }

    /**
     *
     *
     * @return listp; the non-functional or content strings of this question
     */
    @LispMethod(comment = "@return listp; the non-functional or content strings of this question")
    public static SubLObject question_get_keystrings_method(final SubLObject self) {
        return Mapping.mapcar(symbol_function(WORD_TREE_GET_STRING_METHOD), question_get_keywords_method(self));
    }

    /**
     *
     *
     * @return boolanp; t if TREE is considered to be a candidate answer to this question
    on semantic grounds, nil otherwise
     */
    @LispMethod(comment = "@return boolanp; t if TREE is considered to be a candidate answer to this question\r\non semantic grounds, nil otherwise")
    public static final SubLObject question_candidate_answer_p_method_alt(SubLObject self, SubLObject tree) {
        return numG(methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, tree), $float$0_3);
    }

    /**
     *
     *
     * @return boolanp; t if TREE is considered to be a candidate answer to this question
    on semantic grounds, nil otherwise
     */
    @LispMethod(comment = "@return boolanp; t if TREE is considered to be a candidate answer to this question\r\non semantic grounds, nil otherwise")
    public static SubLObject question_candidate_answer_p_method(final SubLObject self, final SubLObject tree) {
        return numG(methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, tree), $float$0_3);
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; an English question string
     * @return question-p; a question object from STRING if one could be obtained,
    NIL otherwise
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; an English question string\r\n@return question-p; a question object from STRING if one could be obtained,\r\nNIL otherwise")
    public static final SubLObject new_question_alt(SubLObject string, SubLObject corpora, SubLObject v_class) {
        if (corpora == UNPROVIDED) {
            corpora = $list_alt76;
        }
        if (v_class == UNPROVIDED) {
            v_class = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            SubLTrampolineFile.checkType(corpora, LISTP);
            com.cyc.cycjava.cycl.quirk.question.initialize_question();
            methods.funcall_instance_method_with_1_args($question_lexicon$.getDynamicValue(thread), LEARN, string);
            {
                SubLObject parse = methods.funcall_instance_method_with_1_args($question_parser$.getDynamicValue(thread), PARSE, string);
                SubLObject v_question = NIL;
                if (NIL != parse) {
                    methods.funcall_instance_method_with_1_args(parse, LEXIFY, $question_lexicon$.getDynamicValue(thread));
                    if (NIL == v_class) {
                        v_class = methods.funcall_class_method_with_1_args(QUESTION, CLASSIFY, parse).first();
                    }
                    if (NIL != v_class) {
                        v_question = object.new_class_instance(v_class);
                        com.cyc.cycjava.cycl.quirk.question.set_question_string(v_question, string);
                        com.cyc.cycjava.cycl.quirk.question.set_question_corpora(v_question, corpora);
                        com.cyc.cycjava.cycl.quirk.question.set_question_parse(v_question, parse);
                    }
                }
                return v_question;
            }
        }
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; an English question string
     * @return question-p; a question object from STRING if one could be obtained,
    NIL otherwise
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; an English question string\r\n@return question-p; a question object from STRING if one could be obtained,\r\nNIL otherwise")
    public static SubLObject new_question(final SubLObject string, SubLObject corpora, SubLObject v_class) {
        if (corpora == UNPROVIDED) {
            corpora = $list76;
        }
        if (v_class == UNPROVIDED) {
            v_class = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        assert NIL != listp(corpora) : "! listp(corpora) " + ("Types.listp(corpora) " + "CommonSymbols.NIL != Types.listp(corpora) ") + corpora;
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

    /**
     * Prints QUESTION to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints QUESTION to STREAM, ignoring DEPTH")
    public static final SubLObject question_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject string = com.cyc.cycjava.cycl.quirk.question.get_question_string(self);
            try {
                try {
                    write_string($str_alt85$__, stream, UNPROVIDED, UNPROVIDED);
                    princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                    write_string($str_alt86$__, stream, UNPROVIDED, UNPROVIDED);
                    write_string(string, stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt87$_, stream, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym84$OUTER_CATCH_FOR_QUESTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.question.set_question_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    @LispMethod(comment = "Prints QUESTION to STREAM, ignoring DEPTH")
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
    }/**
     * Prints QUESTION to STREAM, ignoring DEPTH
     */


    /**
     *
     *
     * @return stringp; the surface string of QUESTION
     */
    @LispMethod(comment = "@return stringp; the surface string of QUESTION")
    public static final SubLObject question_get_string_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject string = com.cyc.cycjava.cycl.quirk.question.get_question_string(self);
            try {
                try {
                    sublisp_throw($sym91$OUTER_CATCH_FOR_QUESTION_METHOD, string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.question.set_question_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    /**
     *
     *
     * @return stringp; the surface string of QUESTION
     */
    @LispMethod(comment = "@return stringp; the surface string of QUESTION")
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

    /**
     *
     *
     * @return listp; a list of answers to this question
     */
    @LispMethod(comment = "@return listp; a list of answers to this question")
    public static final SubLObject question_answer_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_question_method = NIL;
                SubLObject max_candidates = com.cyc.cycjava.cycl.quirk.question.get_question_max_candidates(self);
                SubLObject timeout = search_engine.get_information_request_timeout(self);
                try {
                    try {
                        {
                            SubLObject texts = set.new_set(EQUAL, UNPROVIDED);
                            SubLObject enoughP = NIL;
                            SubLObject i = ZERO_INTEGER;
                            SubLObject candidates = NIL;
                            SubLObject cutoff = methods.funcall_instance_method_with_0_args(self, ANSWER_CARDINALITY);
                            SubLObject timed_outP = NIL;
                            SubLObject tag = with_timeout_make_tag();
                            try {
                                {
                                    SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                                    try {
                                        $within_with_timeout$.bind(T, thread);
                                        {
                                            SubLObject timer = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer = with_timeout_start_timer(timeout, tag);
                                                        if (NIL == enoughP) {
                                                            {
                                                                SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, QUERIFY);
                                                                SubLObject query = NIL;
                                                                for (query = csome_list_var.first(); !((NIL != enoughP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                                                                    if (NIL == enoughP) {
                                                                        {
                                                                            SubLObject csome_list_var_3 = methods.funcall_instance_method_with_0_args(query, ANSWER);
                                                                            SubLObject passage = NIL;
                                                                            for (passage = csome_list_var_3.first(); !((NIL != enoughP) || (NIL == csome_list_var_3)); csome_list_var_3 = csome_list_var_3.rest() , passage = csome_list_var_3.first()) {
                                                                                if (NIL == set.set_memberP(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), texts)) {
                                                                                    set.set_add(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), texts);
                                                                                    if (NIL == enoughP) {
                                                                                        {
                                                                                            SubLObject csome_list_var_4 = methods.funcall_instance_method_with_1_args(self, EXTRACT, passage);
                                                                                            SubLObject candidate = NIL;
                                                                                            for (candidate = csome_list_var_4.first(); !((NIL != enoughP) || (NIL == csome_list_var_4)); csome_list_var_4 = csome_list_var_4.rest() , candidate = csome_list_var_4.first()) {
                                                                                                candidates = cons(candidate, candidates);
                                                                                                i = add(i, ONE_INTEGER);
                                                                                                enoughP = numG(i, max_candidates);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        with_timeout_stop_timer(timer);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        $within_with_timeout$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            if (NIL != timed_outP) {
                                Errors.warn($str_alt100$Answering__a_timed_out_after__a_s, self, timeout);
                            }
                            if (NIL != candidates) {
                                sublisp_throw($sym95$OUTER_CATCH_FOR_QUESTION_METHOD, list_utilities.first_n(cutoff, methods.funcall_class_method_with_1_args(candidates.first(), SELECT, candidates)));
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.question.set_question_max_candidates(self, max_candidates);
                                search_engine.set_information_request_timeout(self, timeout);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_QUESTION_METHOD);
                }
                return catch_var_for_question_method;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of answers to this question
     */
    @LispMethod(comment = "@return listp; a list of answers to this question")
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

    /**
     *
     *
     * @return listp; a list of the types of answers searched for in answering questions
     */
    @LispMethod(comment = "@return listp; a list of the types of answers searched for in answering questions")
    public static final SubLObject get_learnable_types_alt() {
        {
            SubLObject learnable_types = NIL;
            SubLObject cdolist_list_var = $list_alt104;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_6 = kb_mapping.gather_predicate_extent_index(predicate, $$GuruQAMt, UNPROVIDED);
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , assertion = cdolist_list_var_6.first()) {
                        learnable_types = cons(assertions_high.gaf_arg2(assertion), learnable_types);
                    }
                }
            }
            return remove_duplicates(learnable_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp; a list of the types of answers searched for in answering questions
     */
    @LispMethod(comment = "@return listp; a list of the types of answers searched for in answering questions")
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

    /**
     *
     *
     * @return booleanp; t if TERM1 is probably incompatible with TERM2, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TERM1 is probably incompatible with TERM2, nil otherwise")
    public static final SubLObject incompatible_p_alt(SubLObject v_term, SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = (NIL != fort_types_interface.collection_in_any_mtP(v_term)) ? ((SubLObject) (disjoint_with.disjoint_withP(v_term, collection, UNPROVIDED, UNPROVIDED))) : isa.not_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t if TERM1 is probably incompatible with TERM2, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TERM1 is probably incompatible with TERM2, nil otherwise")
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

    /**
     *
     *
     * @param PARSE
    parse-tree-p;
     * 		
     * @return sparse-vector-p; a vector representation of PARSE
     */
    @LispMethod(comment = "@param PARSE\nparse-tree-p;\r\n\t\t\r\n@return sparse-vector-p; a vector representation of PARSE")
    public static final SubLObject new_parse_vector_alt(SubLObject parse) {
        SubLTrampolineFile.checkType(parse, PARSE_TREE_P);
        {
            SubLObject vec = sparse_vector.new_sparse_vector(EQUALP, UNPROVIDED);
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(parse, YIELD);
            SubLObject word = NIL;
            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.quirk.question.content_category_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))) {
                    {
                        SubLObject cdolist_list_var_7 = string_utilities.split_string(methods.funcall_instance_method_with_0_args(word, GET_STRING), UNPROVIDED);
                        SubLObject string = NIL;
                        for (string = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , string = cdolist_list_var_7.first()) {
                            sparse_vector.svector_inc(vec, morphology.get_root(string, UNPROVIDED));
                        }
                    }
                }
            }
            return vec;
        }
    }

    /**
     *
     *
     * @param PARSE
    parse-tree-p;
     * 		
     * @return sparse-vector-p; a vector representation of PARSE
     */
    @LispMethod(comment = "@param PARSE\nparse-tree-p;\r\n\t\t\r\n@return sparse-vector-p; a vector representation of PARSE")
    public static SubLObject new_parse_vector(final SubLObject parse) {
        assert NIL != parse_tree.parse_tree_p(parse) : "! parse_tree.parse_tree_p(parse) " + ("parse_tree.parse_tree_p(parse) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(parse) ") + parse;
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

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return sparse-vector-p; a vector representation of PARSE
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return sparse-vector-p; a vector representation of PARSE")
    public static final SubLObject new_string_vector_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject vec = sparse_vector.new_sparse_vector(EQUALP, UNPROVIDED);
            SubLObject vector_var = document.sentence_yield(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, UNPROVIDED)));
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    if (NIL != com.cyc.cycjava.cycl.quirk.question.content_category_p(document.word_category(word))) {
                        sparse_vector.svector_inc(vec, morphology.get_root(document.word_string(word), UNPROVIDED));
                    }
                }
            }
            return vec;
        }
    }

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return sparse-vector-p; a vector representation of PARSE
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return sparse-vector-p; a vector representation of PARSE")
    public static SubLObject new_string_vector(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
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

    /**
     *
     *
     * @return booleanp; t if TREE1 and TREE2's string are close enough to match, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TREE1 and TREE2\'s string are close enough to match, nil otherwise")
    public static final SubLObject tree_match_alt(SubLObject tree1, SubLObject tree2) {
        {
            SubLObject vec1 = com.cyc.cycjava.cycl.quirk.question.new_parse_vector(tree1);
            SubLObject vec2 = com.cyc.cycjava.cycl.quirk.question.new_parse_vector(tree2);
            return numG(scenario.safe_svector_cosine_angle(vec1, vec2, UNPROVIDED), $float$0_8);
        }
    }

    /**
     *
     *
     * @return booleanp; t if TREE1 and TREE2's string are close enough to match, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TREE1 and TREE2\'s string are close enough to match, nil otherwise")
    public static SubLObject tree_match(final SubLObject tree1, final SubLObject tree2) {
        final SubLObject vec1 = new_parse_vector(tree1);
        final SubLObject vec2 = new_parse_vector(tree2);
        return numG(scenario.safe_svector_cosine_angle(vec1, vec2, UNPROVIDED), $float$0_8);
    }

    /**
     *
     *
     * @return booleanp; t if WORD-TREE1 semantically implies WORD-TREE2, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if WORD-TREE1 semantically implies WORD-TREE2, nil otherwise")
    public static final SubLObject word_implies_alt(SubLObject word_tree1, SubLObject word_tree2) {
        SubLTrampolineFile.checkType(word_tree1, WORD_TREE_P);
        SubLTrampolineFile.checkType(word_tree2, WORD_TREE_P);
        if ((NIL != parse_tree.verbal_tree_p(word_tree1)) && (NIL != parse_tree.verbal_tree_p(word_tree2))) {
            {
                SubLObject lexes1 = methods.funcall_instance_method_with_0_args(word_tree1, GET_LEXES);
                SubLObject lexes2 = methods.funcall_instance_method_with_0_args(word_tree2, GET_LEXES);
                SubLObject cdolist_list_var = lexes1;
                SubLObject lex1 = NIL;
                for (lex1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex1 = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_8 = lexes2;
                        SubLObject lex2 = NIL;
                        for (lex2 = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , lex2 = cdolist_list_var_8.first()) {
                            if (NIL != at_utilities.more_specific_p(methods.funcall_instance_method_with_1_args(lex1, GET, $DENOT), methods.funcall_instance_method_with_1_args(lex2, GET, $DENOT), UNPROVIDED)) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return equalp(morphology.find_stem(last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree1, GET_STRING), UNPROVIDED), UNPROVIDED).first(), UNPROVIDED), morphology.find_stem(last(string_utilities.split_string(methods.funcall_instance_method_with_0_args(word_tree2, GET_STRING), UNPROVIDED), UNPROVIDED).first(), UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp; t if WORD-TREE1 semantically implies WORD-TREE2, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if WORD-TREE1 semantically implies WORD-TREE2, nil otherwise")
    public static SubLObject word_implies(final SubLObject word_tree1, final SubLObject word_tree2) {
        assert NIL != word_tree.word_tree_p(word_tree1) : "! word_tree.word_tree_p(word_tree1) " + ("word_tree.word_tree_p(word_tree1) " + "CommonSymbols.NIL != word_tree.word_tree_p(word_tree1) ") + word_tree1;
        assert NIL != word_tree.word_tree_p(word_tree2) : "! word_tree.word_tree_p(word_tree2) " + ("word_tree.word_tree_p(word_tree2) " + "CommonSymbols.NIL != word_tree.word_tree_p(word_tree2) ") + word_tree2;
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

    /**
     *
     *
     * @return positive-integer-p; the medium index of all of KEYWORDS in list
    of word trees YIELD
     */
    @LispMethod(comment = "@return positive-integer-p; the medium index of all of KEYWORDS in list\r\nof word trees YIELD")
    public static final SubLObject position_mean_alt(SubLObject yield, SubLObject keywords) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject positions = NIL;
                SubLObject position = ZERO_INTEGER;
                SubLObject found = NIL;
                SubLObject cdolist_list_var = yield;
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    position = add(position, ONE_INTEGER);
                    {
                        SubLObject cdolist_list_var_9 = keywords;
                        SubLObject keyword = NIL;
                        for (keyword = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , keyword = cdolist_list_var_9.first()) {
                            if (NIL != com.cyc.cycjava.cycl.quirk.question.word_implies(word, keyword)) {
                                positions = cons(position, positions);
                                {
                                    SubLObject item_var = methods.funcall_instance_method_with_0_args(keyword, GET_STRING);
                                    if (NIL == member(item_var, found, EQUAL, symbol_function(IDENTITY))) {
                                        found = cons(item_var, found);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != positions) {
                    thread.resetMultipleValues();
                    {
                        SubLObject deviation = number_utilities.standard_deviation_from_population(positions);
                        SubLObject mean = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values(deviation, mean, length(found));
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return positive-integer-p; the medium index of all of KEYWORDS in list
    of word trees YIELD
     */
    @LispMethod(comment = "@return positive-integer-p; the medium index of all of KEYWORDS in list\r\nof word trees YIELD")
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

    /**
     *
     *
     * @return listp listp numberp numberp; four values: all word in YIELD before and all
    after the avg position of KEYWORDS, the deviation from the avg position, the
    number of elements in KEYWORDS found in YIELD
     */
    @LispMethod(comment = "@return listp listp numberp numberp; four values: all word in YIELD before and all\r\nafter the avg position of KEYWORDS, the deviation from the avg position, the\r\nnumber of elements in KEYWORDS found in YIELD")
    public static final SubLObject split_yield_alt(SubLObject yield, SubLObject keywords) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject deviation = com.cyc.cycjava.cycl.quirk.question.position_mean(yield, keywords);
                SubLObject mean = thread.secondMultipleValue();
                SubLObject found = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject rounded_mean = (mean.isNumber()) ? ((SubLObject) (round(mean, UNPROVIDED))) : NIL;
                    if (NIL != rounded_mean) {
                        return values(nreverse(list_utilities.first_n(rounded_mean, yield)), nthcdr(rounded_mean, yield), deviation, found);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp listp numberp numberp; four values: all word in YIELD before and all
    after the avg position of KEYWORDS, the deviation from the avg position, the
    number of elements in KEYWORDS found in YIELD
     */
    @LispMethod(comment = "@return listp listp numberp numberp; four values: all word in YIELD before and all\r\nafter the avg position of KEYWORDS, the deviation from the avg position, the\r\nnumber of elements in KEYWORDS found in YIELD")
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

    /**
     *
     *
     * @return hashtable-p; a mapping from resporator types to cycl types
     */
    @LispMethod(comment = "@return hashtable-p; a mapping from resporator types to cycl types")
    public static final SubLObject build_cyc_to_resporator_map_alt() {
        {
            SubLObject map = make_hash_table($int$100, symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = $list_alt104;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_10 = kb_mapping.gather_predicate_extent_index(predicate, $$GuruQAMt, UNPROVIDED);
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , assertion = cdolist_list_var_10.first()) {
                        sethash(assertions_high.gaf_arg2(assertion), map, intern(string_utilities.strip_final(assertions_high.gaf_arg1(assertion), UNPROVIDED), UNPROVIDED));
                    }
                }
            }
            return map;
        }
    }

    /**
     *
     *
     * @return hashtable-p; a mapping from resporator types to cycl types
     */
    @LispMethod(comment = "@return hashtable-p; a mapping from resporator types to cycl types")
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

    /**
     *
     *
     * @param CONSTANT
    constantp;
     * 		
     * @return symbolp; the resporator equivalent of CONSTANT
     */
    @LispMethod(comment = "@param CONSTANT\nconstantp;\r\n\t\t\r\n@return symbolp; the resporator equivalent of CONSTANT")
    public static final SubLObject cyc_to_resporator_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$cyc_to_resporator_map$.getDynamicValue(thread).isHashtable()) {
                $cyc_to_resporator_map$.setDynamicValue(com.cyc.cycjava.cycl.quirk.question.build_cyc_to_resporator_map(), thread);
            }
            return gethash(constant, $cyc_to_resporator_map$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param CONSTANT
    constantp;
     * 		
     * @return symbolp; the resporator equivalent of CONSTANT
     */
    @LispMethod(comment = "@param CONSTANT\nconstantp;\r\n\t\t\r\n@return symbolp; the resporator equivalent of CONSTANT")
    public static SubLObject cyc_to_resporator(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$cyc_to_resporator_map$.getDynamicValue(thread).isHashtable()) {
            $cyc_to_resporator_map$.setDynamicValue(build_cyc_to_resporator_map(), thread);
        }
        return gethash(constant, $cyc_to_resporator_map$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     *
     *
     * @return sentence-p; a sentence build from STRING
     */
    @LispMethod(comment = "@return sentence-p; a sentence build from STRING")
    public static final SubLObject sentencify_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject tokens = nl_trie.nl_trie_string_tokenize(com.cyc.cycjava.cycl.quirk.question.separate_punctuation(string));
            SubLObject length = length(tokens);
            SubLObject sentence = document.new_sentence(UNPROVIDED, UNPROVIDED);
            SubLObject words = make_vector(length, UNPROVIDED);
            SubLObject i = ZERO_INTEGER;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                set_aref(words, i, document.new_word(list($STRING, token)));
                i = add(i, ONE_INTEGER);
            }
            document._csetf_sign_constituents(sentence, words);
            return sentence;
        }
    }

    /**
     *
     *
     * @return sentence-p; a sentence build from STRING
     */
    @LispMethod(comment = "@return sentence-p; a sentence build from STRING")
    public static SubLObject sentencify(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
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

    public static final SubLObject separate_punctuation_alt(SubLObject string) {
        string = string_utilities.string_substitute($str_alt111$__, $str_alt112$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str_alt113$__, $str_alt114$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str_alt115$__, $str_alt116$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str_alt117$__, $str_alt118$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str_alt119$__, $str_alt120$_, string, UNPROVIDED);
        if (NIL != string_utilities.ends_with(string, $str_alt121$_, UNPROVIDED)) {
            set_aref(string, number_utilities.f_1_(length(string)), CHAR_space);
            string = cconcatenate(string, $str_alt121$_);
        }
        return string;
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

    /**
     * I wish word-variants would work
     */
    @LispMethod(comment = "I wish word-variants would work")
    public static final SubLObject word_alternations_alt(SubLObject word, SubLObject pos, SubLObject lexicon) {
        {
            SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, word);
            SubLObject variants = NIL;
            SubLObject cdolist_list_var = lexes;
            SubLObject lex = NIL;
            for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                if (methods.funcall_instance_method_with_1_args(lex, GET, $CYC_POS) == pos) {
                    {
                        SubLObject cdolist_list_var_11 = lexicon_accessors.get_strings_of_type(methods.funcall_instance_method_with_1_args(lex, GET, $WORD_UNIT), methods.funcall_instance_method_with_1_args(lex, GET, $CYC_POS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject variant = NIL;
                        for (variant = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , variant = cdolist_list_var_11.first()) {
                            {
                                SubLObject item_var = variant;
                                if (NIL == member(item_var, variants, EQUAL, symbol_function(IDENTITY))) {
                                    variants = cons(item_var, variants);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == variants) {
                variants = cons(word, variants);
            }
            return variants;
        }
    }

    @LispMethod(comment = "I wish word-variants would work")
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
    }/**
     * I wish word-variants would work
     */


    public static final SubLObject content_category_p_alt(SubLObject category) {
        return member(category, $list_alt124, EQ, UNPROVIDED);
    }

    public static SubLObject content_category_p(final SubLObject category) {
        return member(category, $list124, EQ, UNPROVIDED);
    }

    /**
     * Answers each question in FILE. FILE must contain one question per line
     */
    @LispMethod(comment = "Answers each question in FILE. FILE must contain one question per line")
    public static final SubLObject test_questions_alt(SubLObject file, SubLObject question_type) {
        if (file == UNPROVIDED) {
            file = $str_alt125$_cyc_quirk_trec_questions_trec_qu;
        }
        if (question_type == UNPROVIDED) {
            question_type = QUESTION_P;
        }
        SubLTrampolineFile.checkType(file, STRINGP);
        {
            SubLObject i = ZERO_INTEGER;
            SubLObject tokens = NIL;
            SubLObject v_question = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(file, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt128$Unable_to_open__S, file);
                }
                {
                    SubLObject infile = stream;
                    if (infile.isStream()) {
                        {
                            SubLObject line = NIL;
                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                if (NIL == string_utilities.starts_with(line, $str_alt129$_)) {
                                    i = add(i, ONE_INTEGER);
                                    tokens = string_utilities.split_string(line, $list_alt130);
                                    v_question = com.cyc.cycjava.cycl.quirk.question.new_question(tokens.first(), string_utilities.split_string(second(tokens), $list_alt131), UNPROVIDED);
                                    if ((NIL != v_question) && (NIL != funcall(question_type, v_question))) {
                                        princ(i, UNPROVIDED);
                                        princ($str_alt132$__, UNPROVIDED);
                                        princ(v_question, UNPROVIDED);
                                        terpri(UNPROVIDED);
                                        princ(methods.funcall_instance_method_with_0_args(v_question, ANSWER), UNPROVIDED);
                                        terpri(UNPROVIDED);
                                        terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Answers each question in FILE. FILE must contain one question per line")
    public static SubLObject test_questions(SubLObject file, SubLObject question_type) {
        if (file == UNPROVIDED) {
            file = $str125$_cyc_quirk_trec_questions_trec_qu;
        }
        if (question_type == UNPROVIDED) {
            question_type = QUESTION_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(file) : "! stringp(file) " + ("Types.stringp(file) " + "CommonSymbols.NIL != Types.stringp(file) ") + file;
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
    }/**
     * Answers each question in FILE. FILE must contain one question per line
     */


    public static final SubLObject test_scenario_questions_alt(SubLObject question_triples) {
        SubLTrampolineFile.checkType(question_triples, LISTP);
        {
            SubLObject v_question = NIL;
            SubLObject cdolist_list_var = question_triples;
            SubLObject question_triple = NIL;
            for (question_triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , question_triple = cdolist_list_var.first()) {
                v_question = com.cyc.cycjava.cycl.quirk.question.new_question(third(question_triple), UNPROVIDED, UNPROVIDED);
                if (NIL != com.cyc.cycjava.cycl.quirk.question.question_p(v_question)) {
                    princ(question_triple.first(), UNPROVIDED);
                    princ($str_alt132$__, UNPROVIDED);
                    princ(v_question, UNPROVIDED);
                    terpri(UNPROVIDED);
                    princ(methods.funcall_instance_method_with_0_args(v_question, ANSWER), UNPROVIDED);
                    terpri(UNPROVIDED);
                    terpri(UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject test_scenario_questions(final SubLObject question_triples) {
        assert NIL != listp(question_triples) : "! listp(question_triples) " + ("Types.listp(question_triples) " + "CommonSymbols.NIL != Types.listp(question_triples) ") + question_triples;
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
        declareFunction("initialize_question", "INITIALIZE-QUESTION", 0, 0, false);
        declareFunction("get_question_corpora", "GET-QUESTION-CORPORA", 1, 0, false);
        declareFunction("set_question_corpora", "SET-QUESTION-CORPORA", 2, 0, false);
        declareFunction("get_question_answer_types", "GET-QUESTION-ANSWER-TYPES", 1, 0, false);
        declareFunction("set_question_answer_types", "SET-QUESTION-ANSWER-TYPES", 2, 0, false);
        declareFunction("get_question_parse", "GET-QUESTION-PARSE", 1, 0, false);
        declareFunction("set_question_parse", "SET-QUESTION-PARSE", 2, 0, false);
        declareFunction("get_question_string", "GET-QUESTION-STRING", 1, 0, false);
        declareFunction("set_question_string", "SET-QUESTION-STRING", 2, 0, false);
        declareFunction("get_question_learnable_types", "GET-QUESTION-LEARNABLE-TYPES", 1, 0, false);
        declareFunction("set_question_learnable_types", "SET-QUESTION-LEARNABLE-TYPES", 2, 0, false);
        declareFunction("get_question_max_confidence", "GET-QUESTION-MAX-CONFIDENCE", 1, 0, false);
        declareFunction("set_question_max_confidence", "SET-QUESTION-MAX-CONFIDENCE", 2, 0, false);
        declareFunction("get_question_max_candidates", "GET-QUESTION-MAX-CANDIDATES", 1, 0, false);
        declareFunction("set_question_max_candidates", "SET-QUESTION-MAX-CANDIDATES", 2, 0, false);
        declareFunction("get_question_chunker", "GET-QUESTION-CHUNKER", 1, 0, false);
        declareFunction("set_question_chunker", "SET-QUESTION-CHUNKER", 2, 0, false);
        declareFunction("get_question_tagger", "GET-QUESTION-TAGGER", 1, 0, false);
        declareFunction("set_question_tagger", "SET-QUESTION-TAGGER", 2, 0, false);
        declareFunction("get_question_parser", "GET-QUESTION-PARSER", 1, 0, false);
        declareFunction("set_question_parser", "SET-QUESTION-PARSER", 2, 0, false);
        declareFunction("get_question_lexicon", "GET-QUESTION-LEXICON", 1, 0, false);
        declareFunction("set_question_lexicon", "SET-QUESTION-LEXICON", 2, 0, false);
        declareFunction("subloop_reserved_initialize_question_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_question_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("question_p", "QUESTION-P", 1, 0, false);
        declareFunction("question_classify_method", "QUESTION-CLASSIFY-METHOD", 2, 0, false);
        declareFunction("question_isaP_method", "QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("question_initialize_method", "QUESTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("question_augment_terms_method", "QUESTION-AUGMENT-TERMS-METHOD", 3, 0, false);
        declareFunction("question_require_percentage_method", "QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false);
        declareFunction("np_term_match", "NP-TERM-MATCH", 2, 1, false);
        declareFunction("question_tree_type_match_method", "QUESTION-TREE-TYPE-MATCH-METHOD", 2, 0, false);
        declareFunction("question_answer_types_method", "QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction("question_get_keywords_method", "QUESTION-GET-KEYWORDS-METHOD", 1, 0, false);
        declareFunction("question_get_keystrings_method", "QUESTION-GET-KEYSTRINGS-METHOD", 1, 0, false);
        declareFunction("question_candidate_answer_p_method", "QUESTION-CANDIDATE-ANSWER-P-METHOD", 2, 0, false);
        declareFunction("new_question", "NEW-QUESTION", 1, 2, false);
        declareFunction("question_print_method", "QUESTION-PRINT-METHOD", 3, 0, false);
        declareFunction("question_get_string_method", "QUESTION-GET-STRING-METHOD", 1, 0, false);
        declareFunction("question_answer_method", "QUESTION-ANSWER-METHOD", 1, 0, false);
        declareFunction("get_learnable_types", "GET-LEARNABLE-TYPES", 0, 0, false);
        declareFunction("incompatible_p", "INCOMPATIBLE-P", 2, 0, false);
        declareFunction("new_parse_vector", "NEW-PARSE-VECTOR", 1, 0, false);
        declareFunction("new_string_vector", "NEW-STRING-VECTOR", 1, 0, false);
        declareFunction("tree_match", "TREE-MATCH", 2, 0, false);
        declareFunction("word_implies", "WORD-IMPLIES", 2, 0, false);
        declareFunction("position_mean", "POSITION-MEAN", 2, 0, false);
        declareFunction("split_yield", "SPLIT-YIELD", 2, 0, false);
        declareFunction("build_cyc_to_resporator_map", "BUILD-CYC-TO-RESPORATOR-MAP", 0, 0, false);
        declareFunction("cyc_to_resporator", "CYC-TO-RESPORATOR", 1, 0, false);
        declareFunction("sentencify", "SENTENCIFY", 1, 0, false);
        declareFunction("separate_punctuation", "SEPARATE-PUNCTUATION", 1, 0, false);
        declareFunction("word_alternations", "WORD-ALTERNATIONS", 3, 0, false);
        declareFunction("content_category_p", "CONTENT-CATEGORY-P", 1, 0, false);
        declareFunction("test_questions", "TEST-QUESTIONS", 0, 2, false);
        declareFunction("test_scenario_questions", "TEST-SCENARIO-QUESTIONS", 1, 0, false);
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



    static private final SubLList $list3 = list(reader_make_constant_shell("Usgs-KS"), reader_make_constant_shell("NGA-KS"));

    static private final SubLList $list6 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("CHUNKER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("MAX-CANDIDATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TWENTY_INTEGER), list(makeSymbol("MAX-CONFIDENCE"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TEN_INTEGER), list(makeSymbol("LEARNABLE-TYPES"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWER-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CLASSIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("AUGMENT-TERMS"), list(makeSymbol("TERMS"), makeSymbol("CORPUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-PERCENTAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CANDIDATE-ANSWER-P"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORDS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYSTRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE");

    private static final SubLSymbol CLASSIFY = makeSymbol("CLASSIFY");

    static private final SubLList $list27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list28 = list(makeSymbol("TREE"));

    static private final SubLList $list29 = list(makeString("@param TREE parse-tree-p; the parse tree to be classified\n   @return symbolp, the question class of PARSE, or nil if there is none\n   This happens by iterating over all subclasses of questions (via \n   introspection) and calling the \'isa\' predicate with TREE as its argument.\n   If TREE does qualify as a question tree of a subclass, \'isa?\' will return \n   t and that class will be added to the list of questions that TREE qualifies\n   as"), list(makeSymbol("PUNLESS"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-STACK"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("QCLASSES"), NIL)), list(makeSymbol("STACK-PUSH"), makeSymbol("SELF"), makeSymbol("CLASS-STACK")), list(makeSymbol("UNTIL"), list(makeSymbol("STACK-EMPTY-P"), makeSymbol("CLASS-STACK")), list(makeSymbol("CLET"), list(list(makeSymbol("QCLASS"), list(makeSymbol("STACK-POP"), makeSymbol("CLASS-STACK")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(QUOTE, makeSymbol("ISA?")), makeSymbol("TREE")), list(makeSymbol("CPUSH"), makeSymbol("QCLASS"), makeSymbol("QCLASSES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD-CLASS"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(QUOTE, makeSymbol("CHILD-CLASSES")))), list(makeSymbol("STACK-PUSH"), makeSymbol("CHILD-CLASS"), makeSymbol("CLASS-STACK"))))), list(RET, makeSymbol("QCLASSES"))));

    static private final SubLSymbol $sym30$ISA_ = makeSymbol("ISA?");

    private static final SubLSymbol CHILD_CLASSES = makeSymbol("CHILD-CLASSES");

    private static final SubLSymbol QUESTION_CLASSIFY_METHOD = makeSymbol("QUESTION-CLASSIFY-METHOD");

    static private final SubLList $list33 = list(makeString("@param TREE parse-tree-p; the tree for which we need to decide whether it can \n   be this kind of question\n   @return boolean; t if TREE is this kind of question, nil otherwise\n   @note each subclass of question needs to implement this method to recognize a \n   parse tree as a particular kind of question, otherwise, it\'ll default to nil"), list(RET, list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE"))));

    static private final SubLSymbol $sym34$QUESTION_ISA__METHOD = makeSymbol("QUESTION-ISA?-METHOD");

    static private final SubLList $list36 = list(makeString("Initializes all class slots in question"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("TERM-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-STANFORD-PARSER"), $WARN, makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(makeSymbol("PUNLESS"), makeSymbol("CHUNKER"), list(makeSymbol("CSETQ"), makeSymbol("CHUNKER"), list(makeSymbol("NEW-SHALLOW-PARSER"), $WARN, TEN_INTEGER))), list(makeSymbol("PUNLESS"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("CSETQ"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("GET-LEARNABLE-TYPES")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    private static final SubLSymbol QUESTION_INITIALIZE_METHOD = makeSymbol("QUESTION-INITIALIZE-METHOD");

    static private final SubLList $list40 = list(makeSymbol("TERMS"), makeSymbol("CORPUS"));

    static private final SubLList $list41 = list(makeString("@param TERMS listp; a list of strings to topically augment with related terms\n   @return listp; a list of terms topically related to TERMS"), list(makeSymbol("CLET"), list(makeSymbol("WORD-GRAPH"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("WORD-GRAPH"), list(makeSymbol("GET-WORD-GRAPH"), makeSymbol("TERMS"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeString("index"), list(makeSymbol("GET-WORD-GRAPH-PATH"), makeSymbol("CORPUS"))))))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("Could not get augmentation terms for ~S"), makeSymbol("TERMS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("WORD-GRAPH")), list(RET, list(makeSymbol("FIM"), list(makeSymbol("MAKE-GRAPH-FROM-STRING-LISTS"), makeSymbol("WORD-GRAPH")), list(QUOTE, makeSymbol("GET-PATH-LABELS")), makeSymbol("TERMS"))))));

    static private final SubLString $$$index = makeString("index");

    static private final SubLString $str44$Could_not_get_augmentation_terms_ = makeString("Could not get augmentation terms for ~S");

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("Usgs-KS"), reader_make_constant_shell("NGA-KS"));

    private static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    private static final SubLSymbol QUESTION_AUGMENT_TERMS_METHOD = makeSymbol("QUESTION-AUGMENT-TERMS-METHOD");

    static private final SubLList $list_alt6 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("CHUNKER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("MAX-CANDIDATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TWENTY_INTEGER), list(makeSymbol("MAX-CONFIDENCE"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), TEN_INTEGER), list(makeSymbol("LEARNABLE-TYPES"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWER-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CLASSIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("AUGMENT-TERMS"), list(makeSymbol("TERMS"), makeSymbol("CORPUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-PERCENTAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CANDIDATE-ANSWER-P"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORDS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYSTRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")) });

    static private final SubLList $list48 = list(makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), list(RET, makeInteger(100)));

    private static final SubLSymbol QUESTION_REQUIRE_PERCENTAGE_METHOD = makeSymbol("QUESTION-REQUIRE-PERCENTAGE-METHOD");

    private static final SubLSymbol TREE_TYPE_MATCH = makeSymbol("TREE-TYPE-MATCH");

    static private final SubLList $list54 = list(makeString("@param TREE parse-tree-p; a possible answer for this question\n   @return numberp; a score for how well TREE matches the answer types this question requires"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-HEAD")))), makeSymbol("I"), makeSymbol("DENOT"), makeSymbol("SCORE"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS")))), list(makeSymbol("PWHEN"), list(makeSymbol("TREE-MATCH"), makeSymbol("HEAD"), makeSymbol("KEYWORD")), list(RET, ZERO_INTEGER))), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("DENOT"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-PATH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-TYPES")))), list(makeSymbol("CSETQ"), makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("TYPE-PATH"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), NIL), list(makeSymbol("CSOME"), list(makeSymbol("REQUIRED-TYPE"), makeSymbol("TYPE-PATH"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), list(makeSymbol("1+"), list(makeSymbol("LOG"), makeSymbol("I"), TWO_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE")), list(RET, makeSymbol("SCORE"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), list(makeSymbol("INCOMPATIBLE-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE"))), list(makeSymbol("CDEC"), makeSymbol("I"))))))), list(RET, ZERO_INTEGER));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    private static final SubLSymbol QUESTION_TREE_TYPE_MATCH_METHOD = makeSymbol("QUESTION-TREE-TYPE-MATCH-METHOD");

    static private final SubLList $list_alt27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt28 = list(makeSymbol("TREE"));

    static private final SubLList $list61 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, NIL));

    static private final SubLList $list_alt29 = list(makeString("@param TREE parse-tree-p; the parse tree to be classified\n   @return symbolp, the question class of PARSE, or nil if there is none\n   This happens by iterating over all subclasses of questions (via \n   introspection) and calling the \'isa\' predicate with TREE as its argument.\n   If TREE does qualify as a question tree of a subclass, \'isa?\' will return \n   t and that class will be added to the list of questions that TREE qualifies\n   as"), list(makeSymbol("PUNLESS"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-STACK"), list(makeSymbol("CREATE-STACK"))), list(makeSymbol("QCLASSES"), NIL)), list(makeSymbol("STACK-PUSH"), makeSymbol("SELF"), makeSymbol("CLASS-STACK")), list(makeSymbol("UNTIL"), list(makeSymbol("STACK-EMPTY-P"), makeSymbol("CLASS-STACK")), list(makeSymbol("CLET"), list(list(makeSymbol("QCLASS"), list(makeSymbol("STACK-POP"), makeSymbol("CLASS-STACK")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(QUOTE, makeSymbol("ISA?")), makeSymbol("TREE")), list(makeSymbol("CPUSH"), makeSymbol("QCLASS"), makeSymbol("QCLASSES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD-CLASS"), list(makeSymbol("FCM"), makeSymbol("QCLASS"), list(QUOTE, makeSymbol("CHILD-CLASSES")))), list(makeSymbol("STACK-PUSH"), makeSymbol("CHILD-CLASS"), makeSymbol("CLASS-STACK"))))), list(RET, makeSymbol("QCLASSES"))));

    private static final SubLSymbol QUESTION_ANSWER_TYPES_METHOD = makeSymbol("QUESTION-ANSWER-TYPES-METHOD");

    static private final SubLList $list63 = list(makeString("@return listp; the non-functional or content strings of this question"), list(makeSymbol("CLET"), list(list(makeSymbol("KEYWORDS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CONTENT-CATEGORY-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("KEYWORDS")))), list(RET, makeSymbol("KEYWORDS"))));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    private static final SubLSymbol QUESTION_GET_KEYWORDS_METHOD = makeSymbol("QUESTION-GET-KEYWORDS-METHOD");

    static private final SubLList $list69 = list(makeString("@return listp; the non-functional or content strings of this question"), list(RET, list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("WORD-TREE-GET-STRING-METHOD")), list(makeSymbol("GET-KEYWORDS"), makeSymbol("SELF")))));

    private static final SubLSymbol WORD_TREE_GET_STRING_METHOD = makeSymbol("WORD-TREE-GET-STRING-METHOD");

    private static final SubLSymbol QUESTION_GET_KEYSTRINGS_METHOD = makeSymbol("QUESTION-GET-KEYSTRINGS-METHOD");

    static private final SubLList $list73 = list(makeString("@return boolanp; t if TREE is considered to be a candidate answer to this question\n   on semantic grounds, nil otherwise"), list(RET, list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("TREE")), makeDouble(0.3))));

    static private final SubLList $list_alt33 = list(makeString("@param TREE parse-tree-p; the tree for which we need to decide whether it can \n   be this kind of question\n   @return boolean; t if TREE is this kind of question, nil otherwise\n   @note each subclass of question needs to implement this method to recognize a \n   parse tree as a particular kind of question, otherwise, it\'ll default to nil"), list(RET, list(makeSymbol("QUESTION-TREE-P"), makeSymbol("TREE"))));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    private static final SubLSymbol QUESTION_CANDIDATE_ANSWER_P_METHOD = makeSymbol("QUESTION-CANDIDATE-ANSWER-P-METHOD");

    static private final SubLList $list76 = list(makeString("AQUAINT"));

    static private final SubLList $list82 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt36 = list(makeString("Initializes all class slots in question"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("TERM-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-STANFORD-PARSER"), $WARN, makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(makeSymbol("PUNLESS"), makeSymbol("CHUNKER"), list(makeSymbol("CSETQ"), makeSymbol("CHUNKER"), list(makeSymbol("NEW-SHALLOW-PARSER"), $WARN, TEN_INTEGER))), list(makeSymbol("PUNLESS"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("CSETQ"), makeSymbol("LEARNABLE-TYPES"), list(makeSymbol("GET-LEARNABLE-TYPES")))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list83 = list(makeString("Prints QUESTION to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    static private final SubLString $str85$__ = makeString("#<");

    static private final SubLString $str86$__ = makeString(": ");

    static private final SubLString $str87$_ = makeString(">");

    private static final SubLSymbol QUESTION_PRINT_METHOD = makeSymbol("QUESTION-PRINT-METHOD");

    static private final SubLList $list89 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list90 = list(makeString("@return stringp; the surface string of QUESTION"), list(RET, makeSymbol("STRING")));

    static private final SubLList $list_alt40 = list(makeSymbol("TERMS"), makeSymbol("CORPUS"));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    static private final SubLList $list_alt41 = list(makeString("@param TERMS listp; a list of strings to topically augment with related terms\n   @return listp; a list of terms topically related to TERMS"), list(makeSymbol("CLET"), list(makeSymbol("WORD-GRAPH"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("WORD-GRAPH"), list(makeSymbol("GET-WORD-GRAPH"), makeSymbol("TERMS"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeString("index"), list(makeSymbol("GET-WORD-GRAPH-PATH"), makeSymbol("CORPUS"))))))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("Could not get augmentation terms for ~S"), makeSymbol("TERMS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("WORD-GRAPH")), list(RET, list(makeSymbol("FIM"), list(makeSymbol("MAKE-GRAPH-FROM-STRING-LISTS"), makeSymbol("WORD-GRAPH")), list(QUOTE, makeSymbol("GET-PATH-LABELS")), makeSymbol("TERMS"))))));

    private static final SubLSymbol QUESTION_GET_STRING_METHOD = makeSymbol("QUESTION-GET-STRING-METHOD");

    static private final SubLList $list94 = list(makeString("@return listp; a list of answers to this question"), list(makeSymbol("CLET"), list(list(makeSymbol("TEXTS"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL))), list(makeSymbol("ENOUGH?"), NIL), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CANDIDATES"), NIL), list(makeSymbol("CUTOFF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-CARDINALITY")))), makeSymbol("TIMED-OUT?")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), list(makeSymbol("CSOME"), list(makeSymbol("QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("QUERIFY"))), makeSymbol("ENOUGH?")), list(makeSymbol("CSOME"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("QUERY"), list(QUOTE, makeSymbol("ANSWER"))), makeSymbol("ENOUGH?")), list(makeSymbol("PUNLESS"), list(makeSymbol("SET-MEMBER?"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("SET-ADD"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("CSOME"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXTRACT")), makeSymbol("PASSAGE")), makeSymbol("ENOUGH?")), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CSETQ"), makeSymbol("ENOUGH?"), list(makeSymbol(">"), makeSymbol("I"), makeSymbol("MAX-CANDIDATES")))))))), list(makeSymbol("PWHEN"), makeSymbol("TIMED-OUT?"), list(makeSymbol("WARN"), makeString("Answering ~a timed out after ~a seconds~%"), makeSymbol("SELF"), makeSymbol("TIMEOUT"))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATES"), list(RET, list(makeSymbol("FIRST-N"), makeSymbol("CUTOFF"), list(makeSymbol("FCM"), list(makeSymbol("FIRST"), makeSymbol("CANDIDATES")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("CANDIDATES")))))));

    static private final SubLString $str_alt44$Could_not_get_augmentation_terms_ = makeString("Could not get augmentation terms for ~S");

    static private final SubLList $list_alt48 = list(makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), list(RET, makeInteger(100)));

    static private final SubLList $list_alt54 = list(makeString("@param TREE parse-tree-p; a possible answer for this question\n   @return numberp; a score for how well TREE matches the answer types this question requires"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-HEAD")))), makeSymbol("I"), makeSymbol("DENOT"), makeSymbol("SCORE"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS")))), list(makeSymbol("PWHEN"), list(makeSymbol("TREE-MATCH"), makeSymbol("HEAD"), makeSymbol("KEYWORD")), list(RET, ZERO_INTEGER))), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("DENOT"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-PATH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-TYPES")))), list(makeSymbol("CSETQ"), makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("TYPE-PATH"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), NIL), list(makeSymbol("CSOME"), list(makeSymbol("REQUIRED-TYPE"), makeSymbol("TYPE-PATH"), makeSymbol("INCOMPATIBLE?")), list(makeSymbol("CSETQ"), makeSymbol("SCORE"), list(makeSymbol("1+"), list(makeSymbol("LOG"), makeSymbol("I"), TWO_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE")), list(RET, makeSymbol("SCORE"))), list(makeSymbol("CSETQ"), makeSymbol("INCOMPATIBLE?"), list(makeSymbol("INCOMPATIBLE-P"), makeSymbol("DENOT"), makeSymbol("REQUIRED-TYPE"))), list(makeSymbol("CDEC"), makeSymbol("I"))))))), list(RET, ZERO_INTEGER));

    static private final SubLSymbol $sym95$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    static private final SubLString $str100$Answering__a_timed_out_after__a_s = makeString("Answering ~a timed out after ~a seconds~%");

    private static final SubLSymbol QUESTION_ANSWER_METHOD = makeSymbol("QUESTION-ANSWER-METHOD");



    static private final SubLList $list104 = list(reader_make_constant_shell("guruqaGenlsToken"), reader_make_constant_shell("guruqaTypeToken"));



    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    static private final SubLString $str111$__ = makeString(" ,");

    static private final SubLString $str112$_ = makeString(",");

    static private final SubLString $str113$__ = makeString(" ;");

    static private final SubLString $str114$_ = makeString(";");

    static private final SubLString $str115$__ = makeString(" :");

    static private final SubLString $str116$_ = makeString(":");

    static private final SubLString $str117$__ = makeString("( ");

    static private final SubLString $str118$_ = makeString("(");

    static private final SubLString $str119$__ = makeString(" )");

    static private final SubLString $str120$_ = makeString(")");

    static private final SubLString $str121$_ = makeString(".");

    static private final SubLList $list124 = list(new SubLObject[]{ makeKeyword("NNP"), makeKeyword("NP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("JJ"), makeKeyword("VBP"), makeKeyword("VB"), makeKeyword("VBD"), makeKeyword("VBG"), makeKeyword("VBN"), makeKeyword("VBZ"), makeKeyword("CD") });

    static private final SubLList $list_alt61 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, NIL));

    static private final SubLString $str125$_cyc_quirk_trec_questions_trec_qu = makeString("/cyc/quirk/trec-questions/trec-questions.txt");

    private static final SubLSymbol QUESTION_P = makeSymbol("QUESTION-P");

    static private final SubLString $str128$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt63 = list(makeString("@return listp; the non-functional or content strings of this question"), list(makeSymbol("CLET"), list(list(makeSymbol("KEYWORDS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CONTENT-CATEGORY-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("KEYWORDS")))), list(RET, makeSymbol("KEYWORDS"))));

    static private final SubLString $str129$_ = makeString("#");

    static private final SubLList $list130 = list(CHAR_tab);

    static private final SubLList $list131 = list(CHAR_space);

    static private final SubLString $str132$__ = makeString(". ");

    static {
    }

    static private final SubLList $list_alt69 = list(makeString("@return listp; the non-functional or content strings of this question"), list(RET, list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("WORD-TREE-GET-STRING-METHOD")), list(makeSymbol("GET-KEYWORDS"), makeSymbol("SELF")))));

    static private final SubLList $list_alt73 = list(makeString("@return boolanp; t if TREE is considered to be a candidate answer to this question\n   on semantic grounds, nil otherwise"), list(RET, list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("TREE")), makeDouble(0.3))));

    static private final SubLList $list_alt76 = list(makeString("AQUAINT"));

    static private final SubLList $list_alt82 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt83 = list(makeString("Prints QUESTION to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt85$__ = makeString("#<");

    static private final SubLString $str_alt86$__ = makeString(": ");

    static private final SubLString $str_alt87$_ = makeString(">");

    static private final SubLList $list_alt89 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt90 = list(makeString("@return stringp; the surface string of QUESTION"), list(RET, makeSymbol("STRING")));

    static private final SubLList $list_alt94 = list(makeString("@return listp; a list of answers to this question"), list(makeSymbol("CLET"), list(list(makeSymbol("TEXTS"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL))), list(makeSymbol("ENOUGH?"), NIL), list(makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CANDIDATES"), NIL), list(makeSymbol("CUTOFF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-CARDINALITY")))), makeSymbol("TIMED-OUT?")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), list(makeSymbol("CSOME"), list(makeSymbol("QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("QUERIFY"))), makeSymbol("ENOUGH?")), list(makeSymbol("CSOME"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("QUERY"), list(QUOTE, makeSymbol("ANSWER"))), makeSymbol("ENOUGH?")), list(makeSymbol("PUNLESS"), list(makeSymbol("SET-MEMBER?"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("SET-ADD"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("TEXTS")), list(makeSymbol("CSOME"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXTRACT")), makeSymbol("PASSAGE")), makeSymbol("ENOUGH?")), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CSETQ"), makeSymbol("ENOUGH?"), list(makeSymbol(">"), makeSymbol("I"), makeSymbol("MAX-CANDIDATES")))))))), list(makeSymbol("PWHEN"), makeSymbol("TIMED-OUT?"), list(makeSymbol("WARN"), makeString("Answering ~a timed out after ~a seconds~%"), makeSymbol("SELF"), makeSymbol("TIMEOUT"))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATES"), list(RET, list(makeSymbol("FIRST-N"), makeSymbol("CUTOFF"), list(makeSymbol("FCM"), list(makeSymbol("FIRST"), makeSymbol("CANDIDATES")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("CANDIDATES")))))));

    static private final SubLString $str_alt100$Answering__a_timed_out_after__a_s = makeString("Answering ~a timed out after ~a seconds~%");

    static private final SubLList $list_alt104 = list(reader_make_constant_shell("guruqaGenlsToken"), reader_make_constant_shell("guruqaTypeToken"));

    static private final SubLString $str_alt111$__ = makeString(" ,");

    static private final SubLString $str_alt112$_ = makeString(",");

    static private final SubLString $str_alt113$__ = makeString(" ;");

    static private final SubLString $str_alt114$_ = makeString(";");

    static private final SubLString $str_alt115$__ = makeString(" :");

    static private final SubLString $str_alt116$_ = makeString(":");

    static private final SubLString $str_alt117$__ = makeString("( ");

    static private final SubLString $str_alt118$_ = makeString("(");

    static private final SubLString $str_alt119$__ = makeString(" )");

    static private final SubLString $str_alt120$_ = makeString(")");

    static private final SubLString $str_alt121$_ = makeString(".");

    static private final SubLList $list_alt124 = list(new SubLObject[]{ makeKeyword("NNP"), makeKeyword("NP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("JJ"), makeKeyword("VBP"), makeKeyword("VB"), makeKeyword("VBD"), makeKeyword("VBG"), makeKeyword("VBN"), makeKeyword("VBZ"), makeKeyword("CD") });

    static private final SubLString $str_alt125$_cyc_quirk_trec_questions_trec_qu = makeString("/cyc/quirk/trec-questions/trec-questions.txt");

    static private final SubLString $str_alt128$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt129$_ = makeString("#");

    static private final SubLList $list_alt130 = list(CHAR_tab);

    static private final SubLList $list_alt131 = list(CHAR_space);

    static private final SubLString $str_alt132$__ = makeString(". ");
}

/**
 * Total time: 499 ms
 */

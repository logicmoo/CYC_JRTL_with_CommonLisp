/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.wordnet;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      NOUN-LEARNER-NOUN-CLASSES
 *  source file: /cyc/top/cycl/nl-stats/noun-learner-noun-classes.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class noun_learner_noun_classes extends SubLTranslatedFile implements V02 {
    // // Constructor
    private noun_learner_noun_classes() {
    }

    public static final SubLFile me = new noun_learner_noun_classes();


    // // Definitions
    // defparameter
    public static final SubLSymbol $warn_about_noun_serializationP$ = makeSymbol("*WARN-ABOUT-NOUN-SERIALIZATION?*");

    public static final SubLObject new_lexicon_for_noun_class() {
        {
            SubLObject lexicon = object.new_class_instance(QUIRK_LEXICON);
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
            instances.set_slot(lexicon, EXCLUDE_PREDICATES, remove($$preferredNameString, instances.get_slot(lexicon, EXCLUDE_PREDICATES), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return lexicon;
        }
    }

    public static final SubLObject get_noun_collection_or_individualP(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, ELEVEN_INTEGER, $sym8$COLLECTION_OR_INDIVIDUAL_);
    }

    public static final SubLObject set_noun_collection_or_individualP(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, ELEVEN_INTEGER, $sym8$COLLECTION_OR_INDIVIDUAL_);
    }

    public static final SubLObject get_noun_no_notable_instances_of_refined_tagP(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, TEN_INTEGER, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_);
    }

    public static final SubLObject set_noun_no_notable_instances_of_refined_tagP(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, TEN_INTEGER, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_);
    }

    public static final SubLObject get_noun_appearances_in_all_caps_with_the(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, NINE_INTEGER, APPEARANCES_IN_ALL_CAPS_WITH_THE);
    }

    public static final SubLObject set_noun_appearances_in_all_caps_with_the(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, NINE_INTEGER, APPEARANCES_IN_ALL_CAPS_WITH_THE);
    }

    public static final SubLObject get_noun_appearances_in_all_caps(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, EIGHT_INTEGER, APPEARANCES_IN_ALL_CAPS);
    }

    public static final SubLObject set_noun_appearances_in_all_caps(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, EIGHT_INTEGER, APPEARANCES_IN_ALL_CAPS);
    }

    public static final SubLObject get_noun_appearances_with_determiner(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, SEVEN_INTEGER, APPEARANCES_WITH_DETERMINER);
    }

    public static final SubLObject set_noun_appearances_with_determiner(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, SEVEN_INTEGER, APPEARANCES_WITH_DETERMINER);
    }

    public static final SubLObject get_noun_appearances_as_plural(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, SIX_INTEGER, APPEARANCES_AS_PLURAL);
    }

    public static final SubLObject set_noun_appearances_as_plural(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, SIX_INTEGER, APPEARANCES_AS_PLURAL);
    }

    public static final SubLObject get_noun_status_in_cyc(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, FIVE_INTEGER, STATUS_IN_CYC);
    }

    public static final SubLObject set_noun_status_in_cyc(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, FIVE_INTEGER, STATUS_IN_CYC);
    }

    public static final SubLObject get_noun_refined_tag(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, FOUR_INTEGER, REFINED_TAG);
    }

    public static final SubLObject set_noun_refined_tag(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, FOUR_INTEGER, REFINED_TAG);
    }

    public static final SubLObject get_noun_total_count_as_whole_noun(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, THREE_INTEGER, TOTAL_COUNT_AS_WHOLE_NOUN);
    }

    public static final SubLObject set_noun_total_count_as_whole_noun(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, THREE_INTEGER, TOTAL_COUNT_AS_WHOLE_NOUN);
    }

    public static final SubLObject get_noun_learned(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, TWO_INTEGER, LEARNED);
    }

    public static final SubLObject set_noun_learned(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, TWO_INTEGER, LEARNED);
    }

    public static final SubLObject get_noun_string(SubLObject noun) {
        return classes.subloop_get_access_protected_instance_slot(noun, ONE_INTEGER, STRING);
    }

    public static final SubLObject set_noun_string(SubLObject noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(noun, value, ONE_INTEGER, STRING);
    }

    public static final SubLObject get_noun_lexicon(SubLObject noun) {
        {
            SubLObject v_class = (noun.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(noun))) : NIL != subloop_structures.class_p(noun) ? ((SubLObject) (noun)) : NIL != subloop_structures.instance_p(noun) ? ((SubLObject) (subloop_structures.instance_class(noun))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_noun_lexicon(SubLObject noun, SubLObject value) {
        {
            SubLObject v_class = (noun.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(noun))) : NIL != subloop_structures.class_p(noun) ? ((SubLObject) (noun)) : NIL != subloop_structures.instance_p(noun) ? ((SubLObject) (subloop_structures.instance_class(noun))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_noun_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, NOUN, LEXICON, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_noun_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, TOTAL_COUNT_AS_WHOLE_NOUN, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, REFINED_TAG, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STATUS_IN_CYC, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_AS_PLURAL, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_WITH_DETERMINER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS_WITH_THE, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym8$COLLECTION_OR_INDIVIDUAL_, NIL);
        return NIL;
    }

    public static final SubLObject noun_p(SubLObject noun) {
        return classes.subloop_instanceof_class(noun, NOUN);
    }

    /**
     * Is the denotation DENOT demonstrably inconsistent with the tag TAG?
     */
    public static final SubLObject noun_inconsistentP_method(SubLObject self, SubLObject tag, SubLObject denot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != methods.funcall_class_method_with_2_args(self, $sym29$CONSISTENT_, tag, denot)) {
                return NIL;
            } else {
                {
                    SubLObject result = T;
                    if (NIL != fort_types_interface.collection_p(denot)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                result = disjoint_with.disjoint_withP(tag, denot, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        result = isa.not_isa_in_any_mtP(denot, tag);
                    }
                    if (NIL != result) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                result = makeBoolean(!((NIL != removal_modules_conceptually_related.conceptually_relatedP(tag, denot, UNPROVIDED, UNPROVIDED)) || (NIL != removal_modules_conceptually_related.conceptually_relatedP(denot, tag, UNPROVIDED, UNPROVIDED))));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     * Is the denotation DENOT demonstrably consistent with the tag TAG?
     */
    public static final SubLObject noun_consistentP_method(SubLObject self, SubLObject tag, SubLObject denot) {
        return NIL != fort_types_interface.collection_p(denot) ? ((SubLObject) (makeBoolean((NIL != genls.genl_in_any_mtP(denot, tag)) || (NIL != genls.genl_in_any_mtP(tag, denot))))) : isa.isa_in_any_mtP(denot, tag);
    }

    public static final SubLObject noun_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject lexicon = get_noun_lexicon(self);
            SubLObject collection_or_individualP = get_noun_collection_or_individualP(self);
            SubLObject no_notable_instances_of_refined_tagP = get_noun_no_notable_instances_of_refined_tagP(self);
            SubLObject appearances_in_all_caps_with_the = get_noun_appearances_in_all_caps_with_the(self);
            SubLObject appearances_in_all_caps = get_noun_appearances_in_all_caps(self);
            SubLObject appearances_with_determiner = get_noun_appearances_with_determiner(self);
            SubLObject appearances_as_plural = get_noun_appearances_as_plural(self);
            SubLObject status_in_cyc = get_noun_status_in_cyc(self);
            SubLObject refined_tag = get_noun_refined_tag(self);
            SubLObject total_count_as_whole_noun = get_noun_total_count_as_whole_noun(self);
            try {
                try {
                    object.object_initialize_method(self);
                    if (NIL == lexicon) {
                        lexicon = new_lexicon_for_noun_class();
                    }
                    total_count_as_whole_noun = ZERO_INTEGER;
                    refined_tag = $DONT_KNOW_YET;
                    status_in_cyc = $DONT_KNOW_YET;
                    appearances_as_plural = ZERO_INTEGER;
                    appearances_with_determiner = ZERO_INTEGER;
                    appearances_in_all_caps = ZERO_INTEGER;
                    appearances_in_all_caps_with_the = ZERO_INTEGER;
                    no_notable_instances_of_refined_tagP = $DONT_KNOW_YET;
                    collection_or_individualP = $DONT_KNOW_YET;
                    sublisp_throw($sym37$OUTER_CATCH_FOR_NOUN_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_lexicon(self, lexicon);
                            set_noun_collection_or_individualP(self, collection_or_individualP);
                            set_noun_no_notable_instances_of_refined_tagP(self, no_notable_instances_of_refined_tagP);
                            set_noun_appearances_in_all_caps_with_the(self, appearances_in_all_caps_with_the);
                            set_noun_appearances_in_all_caps(self, appearances_in_all_caps);
                            set_noun_appearances_with_determiner(self, appearances_with_determiner);
                            set_noun_appearances_as_plural(self, appearances_as_plural);
                            set_noun_status_in_cyc(self, status_in_cyc);
                            set_noun_refined_tag(self, refined_tag);
                            set_noun_total_count_as_whole_noun(self, total_count_as_whole_noun);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    /**
     * Reinitialize the cyc-term-valued and keyword-valued slots to :DONT-KNOW-YET.
     * (Don't touch the integer-valued slots.)
     */
    public static final SubLObject noun_reinitialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject collection_or_individualP = get_noun_collection_or_individualP(self);
            SubLObject no_notable_instances_of_refined_tagP = get_noun_no_notable_instances_of_refined_tagP(self);
            SubLObject status_in_cyc = get_noun_status_in_cyc(self);
            SubLObject refined_tag = get_noun_refined_tag(self);
            try {
                try {
                    refined_tag = $DONT_KNOW_YET;
                    status_in_cyc = $DONT_KNOW_YET;
                    no_notable_instances_of_refined_tagP = $DONT_KNOW_YET;
                    collection_or_individualP = $DONT_KNOW_YET;
                    sublisp_throw($sym43$OUTER_CATCH_FOR_NOUN_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_collection_or_individualP(self, collection_or_individualP);
                            set_noun_no_notable_instances_of_refined_tagP(self, no_notable_instances_of_refined_tagP);
                            set_noun_status_in_cyc(self, status_in_cyc);
                            set_noun_refined_tag(self, refined_tag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = get_noun_string(self);
                SubLSystemTrampolineFile.checkType(self, INSTANCE_P);
                {
                    SubLObject instance = self;
                    SubLObject stream_1 = stream;
                    if (NIL != $print_readably$.getDynamicValue(thread)) {
                        print_not_readable(instance, stream_1);
                    } else {
                        {
                            SubLObject v_object = instance;
                            SubLObject stream_2 = stream_1;
                            write_string($str_alt50$__, stream_2, UNPROVIDED, UNPROVIDED);
                            write_char(CHAR_space, stream_2);
                            princ(subloop_structures.class_name(subloop_structures.instance_class(instance)), stream_1);
                            write_char(CHAR_space, stream_1);
                            prin1(string, stream);
                            write_char(CHAR_greater, stream_2);
                        }
                    }
                }
                return self;
            }
        }
    }

    public static final SubLObject noun_get_string_method(SubLObject self) {
        {
            SubLObject string = get_noun_string(self);
            return string;
        }
    }

    public static final SubLObject noun_number_of_words_method(SubLObject self) {
        return string_utilities.number_of_words(methods.funcall_instance_method_with_0_args(self, GET_STRING));
    }

    public static final SubLObject noun_get_total_count_as_whole_noun_method(SubLObject self) {
        {
            SubLObject total_count_as_whole_noun = get_noun_total_count_as_whole_noun(self);
            return total_count_as_whole_noun;
        }
    }

    public static final SubLObject noun_increment_total_count_as_whole_noun_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject total_count_as_whole_noun = get_noun_total_count_as_whole_noun(self);
            try {
                try {
                    total_count_as_whole_noun = add(total_count_as_whole_noun, ONE_INTEGER);
                    sublisp_throw($sym66$OUTER_CATCH_FOR_NOUN_METHOD, total_count_as_whole_noun);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_total_count_as_whole_noun(self, total_count_as_whole_noun);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_get_refined_tag_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject refined_tag = get_noun_refined_tag(self);
            try {
                try {
                    if (refined_tag == $DONT_KNOW_YET) {
                        refined_tag = methods.funcall_instance_method_with_0_args(self, REFINE_TAG);
                    }
                    sublisp_throw($sym70$OUTER_CATCH_FOR_NOUN_METHOD, refined_tag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_refined_tag(self, refined_tag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_get_tag_method(SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_REFINED_TAG);
    }

    public static final SubLObject noun_get_top_n_tags_method(SubLObject self, SubLObject n, SubLObject recalculate_if_existsP) {
        if (n == UNPROVIDED) {
            n = FIVE_INTEGER;
        }
        if (recalculate_if_existsP == UNPROVIDED) {
            recalculate_if_existsP = NIL;
        }
        {
            SubLObject ranking = methods.funcall_instance_method_with_2_args(self, GET_TAG_RANKING, n, recalculate_if_existsP);
            if (ranking.isKeyword()) {
                return ranking;
            } else {
                return Mapping.mapcar(symbol_function(FIRST), ranking);
            }
        }
    }

    /**
     * Where did COLLECTION rank among the calculated conjectures for this noun?
     *
     * @return integerp or NIL (if it's not among the ranked conjectures) or keywordp (if we don't have any ranking)
     */
    public static final SubLObject noun_get_ranking_of_method(SubLObject self, SubLObject collection) {
        SubLSystemTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject ranking = methods.funcall_instance_method_with_0_args(self, GET_TAG_RANKING);
            if (ranking.isKeyword()) {
                return ranking;
            } else {
                return position(collection, ranking, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject noun_get_status_in_cyc_method(SubLObject self) {
        {
            SubLObject status_in_cyc = get_noun_status_in_cyc(self);
            if (status_in_cyc == $DONT_KNOW_YET) {
                methods.funcall_instance_method_with_0_args(self, GET_REFINED_TAG);
                return get_noun_status_in_cyc(self);
            } else {
                return status_in_cyc;
            }
        }
    }

    public static final SubLObject noun_get_meanings_in_cyc_method(SubLObject self) {
        {
            SubLObject lexicon = get_noun_lexicon(self);
            SubLObject string = get_noun_string(self);
            SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
            SubLObject meanings = NIL;
            SubLObject cdolist_list_var = lexes;
            SubLObject lex = NIL;
            for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                if (NIL != methods.funcall_instance_method_with_0_args(lex, $sym94$NOUN_)) {
                    {
                        SubLObject item_var = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                        if (NIL == member(item_var, meanings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            meanings = cons(item_var, meanings);
                        }
                    }
                }
            }
            return meanings;
        }
    }

    public static final SubLObject noun_get_best_meaning_in_cyc_method(SubLObject self) {
        {
            SubLObject meanings = methods.funcall_instance_method_with_0_args(self, GET_MEANINGS_IN_CYC);
            return NIL != list_utilities.non_empty_list_p(meanings) ? ((SubLObject) (meanings.first())) : NIL;
        }
    }

    public static final SubLObject noun_get_appearances_as_plural_method(SubLObject self) {
        {
            SubLObject appearances_as_plural = get_noun_appearances_as_plural(self);
            return appearances_as_plural;
        }
    }

    public static final SubLObject noun_increment_appearances_as_plural_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject appearances_as_plural = get_noun_appearances_as_plural(self);
            try {
                try {
                    appearances_as_plural = add(appearances_as_plural, ONE_INTEGER);
                    sublisp_throw($sym105$OUTER_CATCH_FOR_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_appearances_as_plural(self, appearances_as_plural);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_get_appearances_with_determiner_method(SubLObject self) {
        {
            SubLObject appearances_with_determiner = get_noun_appearances_with_determiner(self);
            return appearances_with_determiner;
        }
    }

    public static final SubLObject noun_increment_appearances_with_determiner_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject appearances_with_determiner = get_noun_appearances_with_determiner(self);
            try {
                try {
                    appearances_with_determiner = add(appearances_with_determiner, ONE_INTEGER);
                    sublisp_throw($sym112$OUTER_CATCH_FOR_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_appearances_with_determiner(self, appearances_with_determiner);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_get_appearances_in_all_caps_method(SubLObject self) {
        {
            SubLObject appearances_in_all_caps = get_noun_appearances_in_all_caps(self);
            return appearances_in_all_caps;
        }
    }

    public static final SubLObject noun_increment_appearances_in_all_caps_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject appearances_in_all_caps = get_noun_appearances_in_all_caps(self);
            try {
                try {
                    appearances_in_all_caps = add(appearances_in_all_caps, ONE_INTEGER);
                    sublisp_throw($sym119$OUTER_CATCH_FOR_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_appearances_in_all_caps(self, appearances_in_all_caps);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_get_appearances_in_all_caps_with_the_method(SubLObject self) {
        {
            SubLObject appearances_in_all_caps_with_the = get_noun_appearances_in_all_caps_with_the(self);
            return appearances_in_all_caps_with_the;
        }
    }

    public static final SubLObject noun_increment_appearances_in_all_caps_with_the_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject appearances_in_all_caps_with_the = get_noun_appearances_in_all_caps_with_the(self);
            try {
                try {
                    appearances_in_all_caps_with_the = add(appearances_in_all_caps_with_the, ONE_INTEGER);
                    sublisp_throw($sym126$OUTER_CATCH_FOR_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_appearances_in_all_caps_with_the(self, appearances_in_all_caps_with_the);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    public static final SubLObject noun_no_notable_instances_of_refined_tagP_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject no_notable_instances_of_refined_tagP = get_noun_no_notable_instances_of_refined_tagP(self);
            SubLObject refined_tag = get_noun_refined_tag(self);
            try {
                try {
                    if (no_notable_instances_of_refined_tagP == $DONT_KNOW_YET) {
                        if (refined_tag == $DONT_KNOW_YET) {
                            Errors.error($str_alt130$Can_t_tell_if_there_are_no_notabl, self);
                        } else {
                            no_notable_instances_of_refined_tagP = makeBoolean((NIL != forts.fort_p(refined_tag)) && (NIL != list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(list($$noNotableInstances, refined_tag), $$InferencePSC, UNPROVIDED))));
                        }
                    }
                    sublisp_throw($sym129$OUTER_CATCH_FOR_NOUN_METHOD, no_notable_instances_of_refined_tagP);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_no_notable_instances_of_refined_tagP(self, no_notable_instances_of_refined_tagP);
                            set_noun_refined_tag(self, refined_tag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym129$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    /**
     *
     *
     * @return keywordp: :COLLECTION or :INDIVIDUAL; the best guess based on capitalization, pluralization, etc. of SELF
     */
    public static final SubLObject noun_collection_or_individualP_method(SubLObject self) {
        {
            SubLObject catch_var_for_noun_method = NIL;
            SubLObject collection_or_individualP = get_noun_collection_or_individualP(self);
            try {
                try {
                    if (collection_or_individualP == $DONT_KNOW_YET) {
                        collection_or_individualP = methods.funcall_instance_method_with_0_args(self, $sym136$COLLECTION_OR_INDIVIDUAL__INT);
                    }
                    sublisp_throw($sym135$OUTER_CATCH_FOR_NOUN_METHOD, collection_or_individualP);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_noun_collection_or_individualP(self, collection_or_individualP);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym135$OUTER_CATCH_FOR_NOUN_METHOD);
            }
            return catch_var_for_noun_method;
        }
    }

    /**
     *
     *
     * @return collection-p or keywordp; the best tag for this noun, refined using lexicon and Wordnet, OR
    :DONT-CARE or :CANT-TELL if there is insufficient data
    As a side effect, sets the slot STATUS-IN-CYC
     */
    public static final SubLObject noun_refine_tag_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_noun_method = NIL;
                SubLObject status_in_cyc = get_noun_status_in_cyc(self);
                SubLObject string = get_noun_string(self);
                try {
                    try {
                        {
                            SubLObject basic_tag = methods.funcall_instance_method_with_0_args(self, GET_BASIC_TAG);
                            if (basic_tag.isKeyword()) {
                                status_in_cyc = $DONT_CARE;
                                sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                            } else
                                if (NIL != kb_accessors.kb_individual_p(basic_tag)) {
                                    if (NIL != methods.funcall_instance_method_with_1_args(self, $sym142$LEXIFIES_FORT_, basic_tag)) {
                                        status_in_cyc = $KNOWN_AND_LEXIFIED;
                                    } else {
                                        status_in_cyc = $KNOWN_BUT_UNLEXIFIED;
                                    }
                                    sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                                } else
                                    if (NIL != fort_types_interface.collection_p(basic_tag)) {
                                        {
                                            SubLObject denots = methods.funcall_instance_method_with_0_args(self, GET_MEANINGS_IN_CYC);
                                            SubLObject denots_filtered = NIL;
                                            {
                                                SubLObject cdolist_list_var = denots;
                                                SubLObject denot = NIL;
                                                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                    if ((NIL != forts.fort_p(denot)) && (NIL == methods.funcall_class_method_with_2_args(self, $sym25$INCONSISTENT_, basic_tag, denot))) {
                                                        {
                                                            SubLObject item_var = denot;
                                                            if (NIL == member(item_var, denots_filtered, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                denots_filtered = cons(item_var, denots_filtered);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL != denots_filtered) {
                                                status_in_cyc = $KNOWN_AND_LEXIFIED;
                                                if (NIL != complex_noun_p(self)) {
                                                    sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, $IGNORE);
                                                } else {
                                                    {
                                                        SubLObject specs_of_tag_among_denots = NIL;
                                                        SubLObject cdolist_list_var = denots_filtered;
                                                        SubLObject denot = NIL;
                                                        for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                            if ((NIL != fort_types_interface.collection_p(denot)) && (NIL != genls.genl_in_any_mtP(denot, basic_tag))) {
                                                                specs_of_tag_among_denots = cons(denot, specs_of_tag_among_denots);
                                                            }
                                                        }
                                                        if (NIL != list_utilities.singletonP(specs_of_tag_among_denots)) {
                                                            sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, specs_of_tag_among_denots.first());
                                                        } else
                                                            if (NIL == specs_of_tag_among_denots) {
                                                                sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                                                            } else {
                                                                {
                                                                    SubLObject min_ceiling_cols = NIL;
                                                                    SubLObject all_specs_of_basic_tag = NIL;
                                                                    {
                                                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                        try {
                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                            all_specs_of_basic_tag = genls.all_specs(basic_tag, UNPROVIDED, UNPROVIDED);
                                                                            min_ceiling_cols = genls.min_ceiling_cols(specs_of_tag_among_denots, all_specs_of_basic_tag, UNPROVIDED, UNPROVIDED);
                                                                        } finally {
                                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    if (NIL == min_ceiling_cols) {
                                                                        Errors.warn($str_alt146$_S__basic_tag___S__specs_of_tag_a, self, basic_tag, specs_of_tag_among_denots);
                                                                        sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                                                                    }
                                                                    sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, min_ceiling_cols.first());
                                                                }
                                                            }

                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject denots_from_wn = wordnet.denots_of_stringXpos_with_synset_boosters(string, $NOUN);
                                                    SubLObject denots_from_wn_filtered = NIL;
                                                    SubLObject cdolist_list_var = denots_from_wn;
                                                    SubLObject denot = NIL;
                                                    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                        if (NIL != methods.funcall_class_method_with_2_args(self, $sym29$CONSISTENT_, basic_tag, denot)) {
                                                            denots_from_wn_filtered = cons(denot, denots_from_wn_filtered);
                                                        }
                                                    }
                                                    if (NIL != denots_from_wn_filtered) {
                                                        status_in_cyc = $KNOWN_BUT_UNLEXIFIED;
                                                        sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, denots_from_wn_filtered.first());
                                                    } else {
                                                        status_in_cyc = $UNKNOWN;
                                                        sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Errors.warn($str_alt149$_S_is_not_a_keyword__individual__, basic_tag);
                                        status_in_cyc = $PROBLEM;
                                        sublisp_throw($sym139$OUTER_CATCH_FOR_NOUN_METHOD, basic_tag);
                                    }


                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_noun_status_in_cyc(self, status_in_cyc);
                                set_noun_string(self, string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_noun_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_NOUN_METHOD);
                }
                return catch_var_for_noun_method;
            }
        }
    }

    public static final SubLObject noun_collection_or_individualP_int_method(SubLObject self) {
        {
            SubLObject no_notable_instances_of_refined_tagP = get_noun_no_notable_instances_of_refined_tagP(self);
            SubLObject appearances_in_all_caps_with_the = get_noun_appearances_in_all_caps_with_the(self);
            SubLObject appearances_in_all_caps = get_noun_appearances_in_all_caps(self);
            SubLObject appearances_with_determiner = get_noun_appearances_with_determiner(self);
            SubLObject appearances_as_plural = get_noun_appearances_as_plural(self);
            SubLObject total_count_as_whole_noun = get_noun_total_count_as_whole_noun(self);
            SubLObject votes_for_collection = ZERO_INTEGER;
            SubLObject votes_for_individual = ZERO_INTEGER;
            if (NIL != methods.funcall_instance_method_with_0_args(self, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_)) {
                votes_for_collection = add(votes_for_collection, SEVEN_INTEGER);
            }
            if (!total_count_as_whole_noun.isZero()) {
                votes_for_collection = add(votes_for_collection, multiply(THREE_INTEGER, divide(appearances_as_plural, total_count_as_whole_noun)));
                votes_for_collection = add(votes_for_collection, multiply(THREE_INTEGER, divide(appearances_with_determiner, total_count_as_whole_noun)));
            }
            if (NIL == methods.funcall_instance_method_with_0_args(self, $sym154$HEAD_IN_WORDNET_)) {
                votes_for_individual = add(votes_for_individual, TWO_INTEGER);
            }
            if (!total_count_as_whole_noun.isZero()) {
                votes_for_individual = add(votes_for_individual, multiply(FIVE_INTEGER, divide(appearances_in_all_caps_with_the, total_count_as_whole_noun)));
                votes_for_individual = add(votes_for_individual, multiply(ONE_INTEGER, divide(appearances_in_all_caps, total_count_as_whole_noun)));
            }
            if (votes_for_collection.numGE(votes_for_individual)) {
                return $COLLECTION;
            } else {
                return $INDIVIDUAL;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether this noun's string is associated with FORT in the lexicon
     */
    public static final SubLObject noun_lexifies_fortP_method(SubLObject self, SubLObject fort) {
        {
            SubLObject lexicon = get_noun_lexicon(self);
            SubLObject string = get_noun_string(self);
            SubLSystemTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
                SubLObject result = NIL;
                if (NIL == result) {
                    {
                        SubLObject csome_list_var = lexes;
                        SubLObject lex = NIL;
                        for (lex = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lex = csome_list_var.first()) {
                            if (fort == methods.funcall_instance_method_with_1_args(lex, GET, $DENOT)) {
                                result = T;
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject get_simple_noun_complex_nouns(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, NINETEEN_INTEGER, COMPLEX_NOUNS);
    }

    public static final SubLObject set_simple_noun_complex_nouns(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, NINETEEN_INTEGER, COMPLEX_NOUNS);
    }

    public static final SubLObject get_simple_noun_confidence_in_calculated_tag(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, EIGHTEEN_INTEGER, CONFIDENCE_IN_CALCULATED_TAG);
    }

    public static final SubLObject set_simple_noun_confidence_in_calculated_tag(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, EIGHTEEN_INTEGER, CONFIDENCE_IN_CALCULATED_TAG);
    }

    public static final SubLObject get_simple_noun_typicality_sum_by_collection(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, SEVENTEEN_INTEGER, TYPICALITY_SUM_BY_COLLECTION);
    }

    public static final SubLObject set_simple_noun_typicality_sum_by_collection(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, SEVENTEEN_INTEGER, TYPICALITY_SUM_BY_COLLECTION);
    }

    public static final SubLObject get_simple_noun_in_wordnetP(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, SIXTEEN_INTEGER, $sym167$IN_WORDNET_);
    }

    public static final SubLObject set_simple_noun_in_wordnetP(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, SIXTEEN_INTEGER, $sym167$IN_WORDNET_);
    }

    public static final SubLObject get_simple_noun_count_as_object_by_verb(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, FIFTEEN_INTEGER, COUNT_AS_OBJECT_BY_VERB);
    }

    public static final SubLObject set_simple_noun_count_as_object_by_verb(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, FIFTEEN_INTEGER, COUNT_AS_OBJECT_BY_VERB);
    }

    public static final SubLObject get_simple_noun_count_as_subject_by_verb(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, FOURTEEN_INTEGER, COUNT_AS_SUBJECT_BY_VERB);
    }

    public static final SubLObject set_simple_noun_count_as_subject_by_verb(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, FOURTEEN_INTEGER, COUNT_AS_SUBJECT_BY_VERB);
    }

    public static final SubLObject get_simple_noun_total_count_as_object(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, THIRTEEN_INTEGER, TOTAL_COUNT_AS_OBJECT);
    }

    public static final SubLObject set_simple_noun_total_count_as_object(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, THIRTEEN_INTEGER, TOTAL_COUNT_AS_OBJECT);
    }

    public static final SubLObject get_simple_noun_total_count_as_subject(SubLObject simple_noun) {
        return classes.subloop_get_access_protected_instance_slot(simple_noun, TWELVE_INTEGER, TOTAL_COUNT_AS_SUBJECT);
    }

    public static final SubLObject set_simple_noun_total_count_as_subject(SubLObject simple_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_noun, value, TWELVE_INTEGER, TOTAL_COUNT_AS_SUBJECT);
    }

    public static final SubLObject subloop_reserved_initialize_simple_noun_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, NOUN, LEXICON, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_simple_noun_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, TOTAL_COUNT_AS_WHOLE_NOUN, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, REFINED_TAG, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STATUS_IN_CYC, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_AS_PLURAL, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_WITH_DETERMINER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS_WITH_THE, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym8$COLLECTION_OR_INDIVIDUAL_, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, TOTAL_COUNT_AS_SUBJECT, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, TOTAL_COUNT_AS_OBJECT, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, COUNT_AS_SUBJECT_BY_VERB, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, COUNT_AS_OBJECT_BY_VERB, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, $sym167$IN_WORDNET_, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, TYPICALITY_SUM_BY_COLLECTION, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, CONFIDENCE_IN_CALCULATED_TAG, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_NOUN, COMPLEX_NOUNS, NIL);
        return NIL;
    }

    public static final SubLObject simple_noun_p(SubLObject simple_noun) {
        return classes.subloop_instanceof_class(simple_noun, SIMPLE_NOUN);
    }

    public static final SubLObject new_simple_noun(SubLObject learned, SubLObject noun_string) {
        SubLSystemTrampolineFile.checkType(noun_string, SINGLE_WORD_STRING_P);
        {
            SubLObject new_noun = object.new_class_instance(SIMPLE_NOUN);
            set_noun_learned(new_noun, learned);
            set_noun_string(new_noun, noun_string);
            return new_noun;
        }
    }

    public static final SubLObject simple_noun_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject confidence_in_calculated_tag = get_simple_noun_confidence_in_calculated_tag(self);
            SubLObject typicality_sum_by_collection = get_simple_noun_typicality_sum_by_collection(self);
            SubLObject in_wordnetP = get_simple_noun_in_wordnetP(self);
            SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
            SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
            SubLObject total_count_as_object = get_simple_noun_total_count_as_object(self);
            SubLObject total_count_as_subject = get_simple_noun_total_count_as_subject(self);
            try {
                try {
                    noun_initialize_method(self);
                    total_count_as_subject = ZERO_INTEGER;
                    total_count_as_object = ZERO_INTEGER;
                    count_as_subject_by_verb = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    count_as_object_by_verb = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    in_wordnetP = $DONT_KNOW_YET;
                    typicality_sum_by_collection = $DONT_KNOW_YET;
                    confidence_in_calculated_tag = $DONT_KNOW_YET;
                    sublisp_throw($sym176$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_confidence_in_calculated_tag(self, confidence_in_calculated_tag);
                            set_simple_noun_typicality_sum_by_collection(self, typicality_sum_by_collection);
                            set_simple_noun_in_wordnetP(self, in_wordnetP);
                            set_simple_noun_count_as_object_by_verb(self, count_as_object_by_verb);
                            set_simple_noun_count_as_subject_by_verb(self, count_as_subject_by_verb);
                            set_simple_noun_total_count_as_object(self, total_count_as_object);
                            set_simple_noun_total_count_as_subject(self, total_count_as_subject);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym176$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    /**
     * Reinitialize the cyc-term-valued and keyword-valued slots to :DONT-KNOW-YET.
     * (Don't touch the integer-valued slots.)
     */
    public static final SubLObject simple_noun_reinitialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject confidence_in_calculated_tag = get_simple_noun_confidence_in_calculated_tag(self);
            SubLObject typicality_sum_by_collection = get_simple_noun_typicality_sum_by_collection(self);
            SubLObject in_wordnetP = get_simple_noun_in_wordnetP(self);
            try {
                try {
                    noun_reinitialize_method(self);
                    in_wordnetP = $DONT_KNOW_YET;
                    typicality_sum_by_collection = $DONT_KNOW_YET;
                    confidence_in_calculated_tag = $DONT_KNOW_YET;
                    sublisp_throw($sym179$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_confidence_in_calculated_tag(self, confidence_in_calculated_tag);
                            set_simple_noun_typicality_sum_by_collection(self, typicality_sum_by_collection);
                            set_simple_noun_in_wordnetP(self, in_wordnetP);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym179$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_get_basic_tag_method(SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_CALCULATED_TAG);
    }

    public static final SubLObject simple_noun_get_tag_ranking_method(SubLObject self, SubLObject max_length, SubLObject recalculate_if_existsP) {
        if (max_length == UNPROVIDED) {
            max_length = NIL;
        }
        if (recalculate_if_existsP == UNPROVIDED) {
            recalculate_if_existsP = NIL;
        }
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject typicality_sum_by_collection = get_simple_noun_typicality_sum_by_collection(self);
            try {
                try {
                    if (NIL != max_length) {
                        SubLSystemTrampolineFile.checkType(max_length, POSITIVE_INTEGER_P);
                    }
                    if ((NIL != recalculate_if_existsP) || (typicality_sum_by_collection == $DONT_KNOW_YET)) {
                        typicality_sum_by_collection = methods.funcall_instance_method_with_0_args(self, CALCULATE_TYPICALITY_SUM_BY_COLLECTION);
                    }
                    sublisp_throw($sym186$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, (NIL != max_length) && typicality_sum_by_collection.isList() ? ((SubLObject) (list_utilities.first_n(max_length, typicality_sum_by_collection))) : typicality_sum_by_collection);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_typicality_sum_by_collection(self, typicality_sum_by_collection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym186$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_get_confidence_level_method(SubLObject self) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject confidence_in_calculated_tag = get_simple_noun_confidence_in_calculated_tag(self);
            try {
                try {
                    if (confidence_in_calculated_tag == $DONT_KNOW_YET) {
                        confidence_in_calculated_tag = methods.funcall_instance_method_with_0_args(self, CALCULATE_CONFIDENCE_IN_CALCULATED_TAG);
                    }
                    sublisp_throw($sym192$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, confidence_in_calculated_tag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_confidence_in_calculated_tag(self, confidence_in_calculated_tag);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym192$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_head_in_wordnetP_method(SubLObject self) {
        {
            SubLObject in_wordnetP = get_simple_noun_in_wordnetP(self);
            return methods.funcall_instance_method_with_0_args(self, $sym167$IN_WORDNET_);
        }
    }

    public static final SubLObject simple_noun_get_total_count_method(SubLObject self, SubLObject relation) {
        if (relation == UNPROVIDED) {
            relation = NIL;
        }
        {
            SubLObject total_count_as_object = get_simple_noun_total_count_as_object(self);
            SubLObject total_count_as_subject = get_simple_noun_total_count_as_subject(self);
            if (NIL != relation) {
                SubLSystemTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
            }
            {
                SubLObject pcase_var = relation;
                if (pcase_var.eql($SUBJ)) {
                    return total_count_as_subject;
                } else
                    if (pcase_var.eql($OBJ)) {
                        return total_count_as_object;
                    } else
                        if (pcase_var.eql(NIL)) {
                            return add(total_count_as_subject, total_count_as_object);
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject simple_noun_get_total_count_as_head_of_complex_nouns_method(SubLObject self) {
        return subtract(methods.funcall_instance_method_with_0_args(self, GET_TOTAL_COUNT), methods.funcall_instance_method_with_0_args(self, GET_TOTAL_COUNT_AS_WHOLE_NOUN));
    }

    public static final SubLObject simple_noun_get_count_with_verb_method(SubLObject self, SubLObject verb, SubLObject relation) {
        if (relation == UNPROVIDED) {
            relation = NIL;
        }
        {
            SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
            SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
            SubLSystemTrampolineFile.checkType(verb, STRINGP);
            if (NIL != relation) {
                SubLSystemTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
            }
            {
                SubLObject pcase_var = relation;
                if (pcase_var.eql($SUBJ)) {
                    return dictionary.dictionary_lookup(count_as_subject_by_verb, verb, ZERO_INTEGER);
                } else
                    if (pcase_var.eql($OBJ)) {
                        return dictionary.dictionary_lookup(count_as_object_by_verb, verb, ZERO_INTEGER);
                    } else
                        if (pcase_var.eql(NIL)) {
                            return add(methods.funcall_instance_method_with_2_args(self, GET_COUNT_WITH_VERB, verb, $SUBJ), methods.funcall_instance_method_with_2_args(self, GET_COUNT_WITH_VERB, verb, $OBJ));
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject simple_noun_record_occurrence_with_verb_method(SubLObject self, SubLObject verb, SubLObject relation) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
            SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
            SubLObject total_count_as_object = get_simple_noun_total_count_as_object(self);
            SubLObject total_count_as_subject = get_simple_noun_total_count_as_subject(self);
            try {
                try {
                    SubLSystemTrampolineFile.checkType(verb, STRINGP);
                    SubLSystemTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
                    {
                        SubLObject pcase_var = relation;
                        if (pcase_var.eql($SUBJ)) {
                            total_count_as_subject = add(total_count_as_subject, ONE_INTEGER);
                            dictionary_utilities.dictionary_increment(count_as_subject_by_verb, verb, UNPROVIDED);
                        } else
                            if (pcase_var.eql($OBJ)) {
                                total_count_as_object = add(total_count_as_object, ONE_INTEGER);
                                dictionary_utilities.dictionary_increment(count_as_object_by_verb, verb, UNPROVIDED);
                            }

                    }
                    sublisp_throw($sym215$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_count_as_object_by_verb(self, count_as_object_by_verb);
                            set_simple_noun_count_as_subject_by_verb(self, count_as_subject_by_verb);
                            set_simple_noun_total_count_as_object(self, total_count_as_object);
                            set_simple_noun_total_count_as_subject(self, total_count_as_subject);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_in_wordnetP_method(SubLObject self) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject in_wordnetP = get_simple_noun_in_wordnetP(self);
            SubLObject string = get_noun_string(self);
            try {
                try {
                    if (in_wordnetP == $DONT_KNOW_YET) {
                        in_wordnetP = wordnet.wordnet_word_p(string, $NOUN);
                    }
                    sublisp_throw($sym218$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, in_wordnetP);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_in_wordnetP(self, in_wordnetP);
                            set_noun_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_get_calculated_tag_method(SubLObject self, SubLObject recalculate_if_existsP) {
        if (recalculate_if_existsP == UNPROVIDED) {
            recalculate_if_existsP = NIL;
        }
        {
            SubLObject result = methods.funcall_instance_method_with_2_args(self, GET_TOP_N_TAGS, ONE_INTEGER, recalculate_if_existsP);
            if (result.isKeyword()) {
                return result;
            } else {
                return result.first();
            }
        }
    }

    public static final SubLObject simple_noun_print_counts_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
                SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
                SubLObject string = get_noun_string(self);
                format(T, $str_alt225$__Counts_by_verb_for__S__, string);
                format(T, $str_alt226$__As_subject___);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_subject_by_verb));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            format(T, $str_alt227$_S_____S____selectiveness___S___, new SubLObject[]{ verb, count, verb_argument_lookups.selectiveness_wrt_subject(verb) });
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                format(T, $str_alt228$__As_object___);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_object_by_verb));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            format(T, $str_alt227$_S_____S____selectiveness___S___, new SubLObject[]{ verb, count, verb_argument_lookups.selectiveness_wrt_object(verb) });
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return NIL;
            }
        }
    }

    public static final SubLObject simple_noun_why_not_tagged_as_method(SubLObject self, SubLObject better_tag) {
        {
            SubLObject learned = get_noun_learned(self);
            return methods.funcall_instance_method_with_2_args(learned, WHY_NOT_TAGGED_AS_INT, self, better_tag);
        }
    }

    public static final SubLObject simple_noun_link_complex_noun_method(SubLObject self, SubLObject complex_noun) {
        {
            SubLObject catch_var_for_simple_noun_method = NIL;
            SubLObject complex_nouns = get_simple_noun_complex_nouns(self);
            try {
                try {
                    SubLSystemTrampolineFile.checkType(complex_noun, COMPLEX_NOUN_P);
                    complex_nouns = cons(complex_noun, complex_nouns);
                    sublisp_throw($sym238$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_simple_noun_complex_nouns(self, complex_nouns);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
            }
            return catch_var_for_simple_noun_method;
        }
    }

    public static final SubLObject simple_noun_get_complex_nouns_headed_by_this_noun_method(SubLObject self) {
        {
            SubLObject complex_nouns = get_simple_noun_complex_nouns(self);
            return copy_list(complex_nouns);
        }
    }

    /**
     * Meant to be called by the noun learner tool, written in java.
     *
     * @return listp; (complex?, string, status-in-cyc, refined-tag, conjecture-ranking, confidence-level, collection?,
    complex-noun-strings, count-as-subject-by-verb, count-as-object-by-verb)
    The conjecture ranking will have a length of at most MAX-RANKING-LENGTH
     */
    public static final SubLObject simple_noun_javafy_method(SubLObject self, SubLObject max_ranking_length) {
        if (max_ranking_length == UNPROVIDED) {
            max_ranking_length = $int$200;
        }
        {
            SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
            SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
            SubLObject collection_or_individualP = get_noun_collection_or_individualP(self);
            SubLObject collectionP = eq(methods.funcall_instance_method_with_0_args(self, $sym8$COLLECTION_OR_INDIVIDUAL_), $COLLECTION);
            SubLObject complex_noun_strings = NIL;
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN);
            SubLObject complex_noun = NIL;
            for (complex_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , complex_noun = cdolist_list_var.first()) {
                complex_noun_strings = cons(methods.funcall_instance_method_with_0_args(complex_noun, GET_STRING), complex_noun_strings);
            }
            return list(new SubLObject[]{ NIL, methods.funcall_instance_method_with_0_args(self, GET_STRING), methods.funcall_instance_method_with_0_args(self, GET_STATUS_IN_CYC), methods.funcall_instance_method_with_0_args(self, GET_REFINED_TAG), methods.funcall_instance_method_with_1_args(self, GET_TAG_RANKING, max_ranking_length), methods.funcall_instance_method_with_0_args(self, GET_CONFIDENCE_LEVEL), collectionP, nreverse(complex_noun_strings), dictionary_utilities.dictionary_to_alist(count_as_subject_by_verb), dictionary_utilities.dictionary_to_alist(count_as_object_by_verb) });
        }
    }

    public static final SubLObject simple_noun_calculate_typicality_sum_by_collection_method(SubLObject self) {
        {
            SubLObject learned = get_noun_learned(self);
            return methods.funcall_instance_method_with_1_args(learned, CALCULATE_TYPICALITY_SUM_BY_COLLECTION, self);
        }
    }

    /**
     * Measure how confident we should be in the tag that we calculate for this simple noun.
     * Our confidence is a function of the selectiveness of the verbs with which the noun occurred.
     * More specifically, it's the product of:
     * the sum of the selectiveness values for all verbs with which the noun occurred, and
     * the selectiveness value of the most selective verb with which the noun occurred.
     */
    public static final SubLObject simple_noun_calculate_confidence_in_calculated_tag_method(SubLObject self, SubLObject selectiveness_metric) {
        if (selectiveness_metric == UNPROVIDED) {
            selectiveness_metric = symbol_function(SELECTIVENESS);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_simple_noun_method = NIL;
                SubLObject count_as_object_by_verb = get_simple_noun_count_as_object_by_verb(self);
                SubLObject count_as_subject_by_verb = get_simple_noun_count_as_subject_by_verb(self);
                try {
                    try {
                        {
                            SubLObject selectiveness_sum = ZERO_INTEGER;
                            SubLObject selectiveness_max = ZERO_INTEGER;
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_subject_by_verb));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject count = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject selectiveness = funcall(selectiveness_metric, verb, $SUBJ);
                                            if (NIL != selectiveness) {
                                                selectiveness_sum = add(selectiveness_sum, multiply(selectiveness, count));
                                                if (selectiveness.numG(selectiveness_max)) {
                                                    selectiveness_max = selectiveness;
                                                }
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_object_by_verb));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject count = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject selectiveness = funcall(selectiveness_metric, verb, $OBJ);
                                            if (NIL != selectiveness) {
                                                selectiveness_sum = add(selectiveness_sum, multiply(selectiveness, count));
                                                if (selectiveness.numG(selectiveness_max)) {
                                                    selectiveness_max = selectiveness;
                                                }
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            sublisp_throw($sym254$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD, multiply(selectiveness_sum, selectiveness_max));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_simple_noun_count_as_object_by_verb(self, count_as_object_by_verb);
                                set_simple_noun_count_as_subject_by_verb(self, count_as_subject_by_verb);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_simple_noun_method = Errors.handleThrowable(ccatch_env_var, $sym254$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD);
                }
                return catch_var_for_simple_noun_method;
            }
        }
    }

    /**
     * This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.
     * This overrides the default serialization for instances.  This is in order to avoid the recursion that would otherwise
     * result, since each noun has a reference to a learned-noun that refers back to it, and there are circular
     * references among complex nouns and their heads.
     */
    public static final SubLObject simple_noun_cfasl_output_method(SubLObject self, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $warn_about_noun_serializationP$.getDynamicValue(thread)) {
                Errors.warn($str_alt260$CFASL_OUTPUT_called_on_a_NOUN___I);
            }
            {
                SubLObject v_class = subloop_structures.instance_class(self);
                SubLObject class_name = subloop_structures.class_name(v_class);
                cfasl_output(class_name, stream);
                {
                    SubLObject v_class_3 = v_class;
                    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_3);
                    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_3);
                    SubLObject instance_slots = append(compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist);
                    instance_slots = delete(INSTANCE_NUMBER, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    instance_slots = delete(LEARNED, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject number_of_slots = length(instance_slots);
                        cfasl_output(number_of_slots, stream);
                        {
                            SubLObject slot_name = NIL;
                            SubLObject cdolist_list_var = instance_slots;
                            SubLObject slot = NIL;
                            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                slot_name = slots.slot_name(slot);
                                {
                                    SubLObject slot_value = eval(list(INLINE_GET_SLOT, list(slot_name, class_name), self));
                                    if (slot_name == COMPLEX_NOUNS) {
                                        {
                                            SubLObject complex_nouns_as_strings = NIL;
                                            SubLObject cdolist_list_var_4 = slot_value;
                                            SubLObject complex_noun = NIL;
                                            for (complex_noun = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , complex_noun = cdolist_list_var_4.first()) {
                                                complex_nouns_as_strings = cons(methods.funcall_instance_method_with_0_args(complex_noun, GET_STRING), complex_nouns_as_strings);
                                            }
                                            slot_value = nreverse(complex_nouns_as_strings);
                                        }
                                    }
                                    cfasl_output(slot_name, stream);
                                    cfasl_output(slot_value, stream);
                                }
                            }
                        }
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject get_complex_noun_head(SubLObject complex_noun) {
        return classes.subloop_get_access_protected_instance_slot(complex_noun, TWELVE_INTEGER, HEAD);
    }

    public static final SubLObject set_complex_noun_head(SubLObject complex_noun, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(complex_noun, value, TWELVE_INTEGER, HEAD);
    }

    public static final SubLObject subloop_reserved_initialize_complex_noun_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, NOUN, LEXICON, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_complex_noun_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, TOTAL_COUNT_AS_WHOLE_NOUN, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, REFINED_TAG, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, STATUS_IN_CYC, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_AS_PLURAL, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_WITH_DETERMINER, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, APPEARANCES_IN_ALL_CAPS_WITH_THE, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_, NIL);
        classes.subloop_initialize_slot(new_instance, NOUN, $sym8$COLLECTION_OR_INDIVIDUAL_, NIL);
        classes.subloop_initialize_slot(new_instance, COMPLEX_NOUN, HEAD, NIL);
        return NIL;
    }

    public static final SubLObject complex_noun_p(SubLObject complex_noun) {
        return classes.subloop_instanceof_class(complex_noun, COMPLEX_NOUN);
    }

    /**
     *
     *
     * @param HEAD-NOUN;
     * 		simple-noun-p
     */
    public static final SubLObject new_complex_noun(SubLObject learned, SubLObject noun_string, SubLObject head_noun) {
        SubLSystemTrampolineFile.checkType(noun_string, MULTI_WORD_STRING);
        {
            SubLObject new_noun = object.new_class_instance(COMPLEX_NOUN);
            set_noun_learned(new_noun, learned);
            set_noun_string(new_noun, noun_string);
            set_complex_noun_head(new_noun, head_noun);
            return new_noun;
        }
    }

    public static final SubLObject complex_noun_get_basic_tag_method(SubLObject self) {
        {
            SubLObject head = get_complex_noun_head(self);
            SubLObject total_count_as_whole_noun = get_noun_total_count_as_whole_noun(self);
            SubLObject learned = get_noun_learned(self);
            if (total_count_as_whole_noun.numL(methods.funcall_instance_method_with_0_args(learned, GET_NOUN_RELEVANCE_COUNT_THRESHOLD))) {
                return $DONT_CARE;
            } else {
                return methods.funcall_instance_method_with_0_args(head, GET_REFINED_TAG);
            }
        }
    }

    public static final SubLObject complex_noun_get_tag_ranking_method(SubLObject self, SubLObject max_length, SubLObject recalculate_if_existsP) {
        if (max_length == UNPROVIDED) {
            max_length = NIL;
        }
        if (recalculate_if_existsP == UNPROVIDED) {
            recalculate_if_existsP = NIL;
        }
        {
            SubLObject head = get_complex_noun_head(self);
            return methods.funcall_instance_method_with_2_args(head, GET_TAG_RANKING, max_length, recalculate_if_existsP);
        }
    }

    public static final SubLObject complex_noun_get_confidence_level_method(SubLObject self) {
        {
            SubLObject head = get_complex_noun_head(self);
            return methods.funcall_instance_method_with_0_args(head, GET_CONFIDENCE_LEVEL);
        }
    }

    public static final SubLObject complex_noun_head_in_wordnetP_method(SubLObject self) {
        {
            SubLObject head = get_complex_noun_head(self);
            return methods.funcall_instance_method_with_0_args(head, $sym167$IN_WORDNET_);
        }
    }

    public static final SubLObject complex_noun_get_head_method(SubLObject self) {
        {
            SubLObject head = get_complex_noun_head(self);
            return head;
        }
    }

    /**
     * The conjecture ranking will have a length of at most MAX-RANKING-LENGTH
     */
    public static final SubLObject complex_noun_javafy_method(SubLObject self, SubLObject max_ranking_length) {
        if (max_ranking_length == UNPROVIDED) {
            max_ranking_length = $int$200;
        }
        {
            SubLObject collection_or_individualP = get_noun_collection_or_individualP(self);
            SubLObject collectionP = eq(methods.funcall_instance_method_with_0_args(self, $sym8$COLLECTION_OR_INDIVIDUAL_), $COLLECTION);
            return list(new SubLObject[]{ T, methods.funcall_instance_method_with_0_args(self, GET_STRING), methods.funcall_instance_method_with_0_args(self, GET_STATUS_IN_CYC), methods.funcall_instance_method_with_0_args(self, GET_REFINED_TAG), methods.funcall_instance_method_with_1_args(self, GET_TAG_RANKING, max_ranking_length), methods.funcall_instance_method_with_0_args(self, GET_CONFIDENCE_LEVEL), collectionP, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, GET_HEAD), GET_STRING), dictionary_utilities.dictionary_to_alist(get_simple_noun_count_as_subject_by_verb(methods.funcall_instance_method_with_0_args(self, GET_HEAD))), dictionary_utilities.dictionary_to_alist(get_simple_noun_count_as_object_by_verb(methods.funcall_instance_method_with_0_args(self, GET_HEAD))) });
        }
    }

    /**
     * This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.
     * This overrides the default serialization for instances.  This is in order to avoid the recursion that would otherwise
     * result, since each noun has a reference to a learned-noun that refers back to it, and there are circular
     * references among complex nouns and their heads.
     */
    public static final SubLObject complex_noun_cfasl_output_method(SubLObject self, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $warn_about_noun_serializationP$.getDynamicValue(thread)) {
                Errors.warn($str_alt260$CFASL_OUTPUT_called_on_a_NOUN___I);
            }
            {
                SubLObject v_class = subloop_structures.instance_class(self);
                SubLObject class_name = subloop_structures.class_name(v_class);
                cfasl_output(class_name, stream);
                {
                    SubLObject v_class_5 = v_class;
                    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_5);
                    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_5);
                    SubLObject instance_slots = append(compiled_instance_slot_access_alist, compiled_instance_boolean_slot_access_alist);
                    instance_slots = delete(INSTANCE_NUMBER, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    instance_slots = delete(LEARNED, instance_slots, symbol_function(EQ), SLOT_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject number_of_slots = length(instance_slots);
                        cfasl_output(number_of_slots, stream);
                        {
                            SubLObject slot_name = NIL;
                            SubLObject cdolist_list_var = instance_slots;
                            SubLObject slot = NIL;
                            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                slot_name = slots.slot_name(slot);
                                {
                                    SubLObject slot_value = eval(list(INLINE_GET_SLOT, list(slot_name, class_name), self));
                                    if (slot_name == HEAD) {
                                        slot_value = methods.funcall_instance_method_with_0_args(slot_value, GET_STRING);
                                    }
                                    cfasl_output(slot_name, stream);
                                    cfasl_output(slot_value, stream);
                                }
                            }
                        }
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject declare_noun_learner_noun_classes_file() {
        declareFunction("new_lexicon_for_noun_class", "NEW-LEXICON-FOR-NOUN-CLASS", 0, 0, false);
        declareFunction("get_noun_collection_or_individualP", "GET-NOUN-COLLECTION-OR-INDIVIDUAL?", 1, 0, false);
        declareFunction("set_noun_collection_or_individualP", "SET-NOUN-COLLECTION-OR-INDIVIDUAL?", 2, 0, false);
        declareFunction("get_noun_no_notable_instances_of_refined_tagP", "GET-NOUN-NO-NOTABLE-INSTANCES-OF-REFINED-TAG?", 1, 0, false);
        declareFunction("set_noun_no_notable_instances_of_refined_tagP", "SET-NOUN-NO-NOTABLE-INSTANCES-OF-REFINED-TAG?", 2, 0, false);
        declareFunction("get_noun_appearances_in_all_caps_with_the", "GET-NOUN-APPEARANCES-IN-ALL-CAPS-WITH-THE", 1, 0, false);
        declareFunction("set_noun_appearances_in_all_caps_with_the", "SET-NOUN-APPEARANCES-IN-ALL-CAPS-WITH-THE", 2, 0, false);
        declareFunction("get_noun_appearances_in_all_caps", "GET-NOUN-APPEARANCES-IN-ALL-CAPS", 1, 0, false);
        declareFunction("set_noun_appearances_in_all_caps", "SET-NOUN-APPEARANCES-IN-ALL-CAPS", 2, 0, false);
        declareFunction("get_noun_appearances_with_determiner", "GET-NOUN-APPEARANCES-WITH-DETERMINER", 1, 0, false);
        declareFunction("set_noun_appearances_with_determiner", "SET-NOUN-APPEARANCES-WITH-DETERMINER", 2, 0, false);
        declareFunction("get_noun_appearances_as_plural", "GET-NOUN-APPEARANCES-AS-PLURAL", 1, 0, false);
        declareFunction("set_noun_appearances_as_plural", "SET-NOUN-APPEARANCES-AS-PLURAL", 2, 0, false);
        declareFunction("get_noun_status_in_cyc", "GET-NOUN-STATUS-IN-CYC", 1, 0, false);
        declareFunction("set_noun_status_in_cyc", "SET-NOUN-STATUS-IN-CYC", 2, 0, false);
        declareFunction("get_noun_refined_tag", "GET-NOUN-REFINED-TAG", 1, 0, false);
        declareFunction("set_noun_refined_tag", "SET-NOUN-REFINED-TAG", 2, 0, false);
        declareFunction("get_noun_total_count_as_whole_noun", "GET-NOUN-TOTAL-COUNT-AS-WHOLE-NOUN", 1, 0, false);
        declareFunction("set_noun_total_count_as_whole_noun", "SET-NOUN-TOTAL-COUNT-AS-WHOLE-NOUN", 2, 0, false);
        declareFunction("get_noun_learned", "GET-NOUN-LEARNED", 1, 0, false);
        declareFunction("set_noun_learned", "SET-NOUN-LEARNED", 2, 0, false);
        declareFunction("get_noun_string", "GET-NOUN-STRING", 1, 0, false);
        declareFunction("set_noun_string", "SET-NOUN-STRING", 2, 0, false);
        declareFunction("get_noun_lexicon", "GET-NOUN-LEXICON", 1, 0, false);
        declareFunction("set_noun_lexicon", "SET-NOUN-LEXICON", 2, 0, false);
        declareFunction("subloop_reserved_initialize_noun_class", "SUBLOOP-RESERVED-INITIALIZE-NOUN-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_noun_instance", "SUBLOOP-RESERVED-INITIALIZE-NOUN-INSTANCE", 1, 0, false);
        declareFunction("noun_p", "NOUN-P", 1, 0, false);
        declareFunction("noun_inconsistentP_method", "NOUN-INCONSISTENT?-METHOD", 3, 0, false);
        declareFunction("noun_consistentP_method", "NOUN-CONSISTENT?-METHOD", 3, 0, false);
        declareFunction("noun_initialize_method", "NOUN-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("noun_reinitialize_method", "NOUN-REINITIALIZE-METHOD", 1, 0, false);
        declareFunction("noun_print_method", "NOUN-PRINT-METHOD", 3, 0, false);
        declareFunction("noun_get_string_method", "NOUN-GET-STRING-METHOD", 1, 0, false);
        declareFunction("noun_number_of_words_method", "NOUN-NUMBER-OF-WORDS-METHOD", 1, 0, false);
        declareFunction("noun_get_total_count_as_whole_noun_method", "NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD", 1, 0, false);
        declareFunction("noun_increment_total_count_as_whole_noun_method", "NOUN-INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD", 1, 0, false);
        declareFunction("noun_get_refined_tag_method", "NOUN-GET-REFINED-TAG-METHOD", 1, 0, false);
        declareFunction("noun_get_tag_method", "NOUN-GET-TAG-METHOD", 1, 0, false);
        declareFunction("noun_get_top_n_tags_method", "NOUN-GET-TOP-N-TAGS-METHOD", 1, 2, false);
        declareFunction("noun_get_ranking_of_method", "NOUN-GET-RANKING-OF-METHOD", 2, 0, false);
        declareFunction("noun_get_status_in_cyc_method", "NOUN-GET-STATUS-IN-CYC-METHOD", 1, 0, false);
        declareFunction("noun_get_meanings_in_cyc_method", "NOUN-GET-MEANINGS-IN-CYC-METHOD", 1, 0, false);
        declareFunction("noun_get_best_meaning_in_cyc_method", "NOUN-GET-BEST-MEANING-IN-CYC-METHOD", 1, 0, false);
        declareFunction("noun_get_appearances_as_plural_method", "NOUN-GET-APPEARANCES-AS-PLURAL-METHOD", 1, 0, false);
        declareFunction("noun_increment_appearances_as_plural_method", "NOUN-INCREMENT-APPEARANCES-AS-PLURAL-METHOD", 1, 0, false);
        declareFunction("noun_get_appearances_with_determiner_method", "NOUN-GET-APPEARANCES-WITH-DETERMINER-METHOD", 1, 0, false);
        declareFunction("noun_increment_appearances_with_determiner_method", "NOUN-INCREMENT-APPEARANCES-WITH-DETERMINER-METHOD", 1, 0, false);
        declareFunction("noun_get_appearances_in_all_caps_method", "NOUN-GET-APPEARANCES-IN-ALL-CAPS-METHOD", 1, 0, false);
        declareFunction("noun_increment_appearances_in_all_caps_method", "NOUN-INCREMENT-APPEARANCES-IN-ALL-CAPS-METHOD", 1, 0, false);
        declareFunction("noun_get_appearances_in_all_caps_with_the_method", "NOUN-GET-APPEARANCES-IN-ALL-CAPS-WITH-THE-METHOD", 1, 0, false);
        declareFunction("noun_increment_appearances_in_all_caps_with_the_method", "NOUN-INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE-METHOD", 1, 0, false);
        declareFunction("noun_no_notable_instances_of_refined_tagP_method", "NOUN-NO-NOTABLE-INSTANCES-OF-REFINED-TAG?-METHOD", 1, 0, false);
        declareFunction("noun_collection_or_individualP_method", "NOUN-COLLECTION-OR-INDIVIDUAL?-METHOD", 1, 0, false);
        declareFunction("noun_refine_tag_method", "NOUN-REFINE-TAG-METHOD", 1, 0, false);
        declareFunction("noun_collection_or_individualP_int_method", "NOUN-COLLECTION-OR-INDIVIDUAL?-INT-METHOD", 1, 0, false);
        declareFunction("noun_lexifies_fortP_method", "NOUN-LEXIFIES-FORT?-METHOD", 2, 0, false);
        declareFunction("get_simple_noun_complex_nouns", "GET-SIMPLE-NOUN-COMPLEX-NOUNS", 1, 0, false);
        declareFunction("set_simple_noun_complex_nouns", "SET-SIMPLE-NOUN-COMPLEX-NOUNS", 2, 0, false);
        declareFunction("get_simple_noun_confidence_in_calculated_tag", "GET-SIMPLE-NOUN-CONFIDENCE-IN-CALCULATED-TAG", 1, 0, false);
        declareFunction("set_simple_noun_confidence_in_calculated_tag", "SET-SIMPLE-NOUN-CONFIDENCE-IN-CALCULATED-TAG", 2, 0, false);
        declareFunction("get_simple_noun_typicality_sum_by_collection", "GET-SIMPLE-NOUN-TYPICALITY-SUM-BY-COLLECTION", 1, 0, false);
        declareFunction("set_simple_noun_typicality_sum_by_collection", "SET-SIMPLE-NOUN-TYPICALITY-SUM-BY-COLLECTION", 2, 0, false);
        declareFunction("get_simple_noun_in_wordnetP", "GET-SIMPLE-NOUN-IN-WORDNET?", 1, 0, false);
        declareFunction("set_simple_noun_in_wordnetP", "SET-SIMPLE-NOUN-IN-WORDNET?", 2, 0, false);
        declareFunction("get_simple_noun_count_as_object_by_verb", "GET-SIMPLE-NOUN-COUNT-AS-OBJECT-BY-VERB", 1, 0, false);
        declareFunction("set_simple_noun_count_as_object_by_verb", "SET-SIMPLE-NOUN-COUNT-AS-OBJECT-BY-VERB", 2, 0, false);
        declareFunction("get_simple_noun_count_as_subject_by_verb", "GET-SIMPLE-NOUN-COUNT-AS-SUBJECT-BY-VERB", 1, 0, false);
        declareFunction("set_simple_noun_count_as_subject_by_verb", "SET-SIMPLE-NOUN-COUNT-AS-SUBJECT-BY-VERB", 2, 0, false);
        declareFunction("get_simple_noun_total_count_as_object", "GET-SIMPLE-NOUN-TOTAL-COUNT-AS-OBJECT", 1, 0, false);
        declareFunction("set_simple_noun_total_count_as_object", "SET-SIMPLE-NOUN-TOTAL-COUNT-AS-OBJECT", 2, 0, false);
        declareFunction("get_simple_noun_total_count_as_subject", "GET-SIMPLE-NOUN-TOTAL-COUNT-AS-SUBJECT", 1, 0, false);
        declareFunction("set_simple_noun_total_count_as_subject", "SET-SIMPLE-NOUN-TOTAL-COUNT-AS-SUBJECT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_simple_noun_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-NOUN-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_simple_noun_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-NOUN-INSTANCE", 1, 0, false);
        declareFunction("simple_noun_p", "SIMPLE-NOUN-P", 1, 0, false);
        declareFunction("new_simple_noun", "NEW-SIMPLE-NOUN", 2, 0, false);
        declareFunction("simple_noun_initialize_method", "SIMPLE-NOUN-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("simple_noun_reinitialize_method", "SIMPLE-NOUN-REINITIALIZE-METHOD", 1, 0, false);
        declareFunction("simple_noun_get_basic_tag_method", "SIMPLE-NOUN-GET-BASIC-TAG-METHOD", 1, 0, false);
        declareFunction("simple_noun_get_tag_ranking_method", "SIMPLE-NOUN-GET-TAG-RANKING-METHOD", 1, 2, false);
        declareFunction("simple_noun_get_confidence_level_method", "SIMPLE-NOUN-GET-CONFIDENCE-LEVEL-METHOD", 1, 0, false);
        declareFunction("simple_noun_head_in_wordnetP_method", "SIMPLE-NOUN-HEAD-IN-WORDNET?-METHOD", 1, 0, false);
        declareFunction("simple_noun_get_total_count_method", "SIMPLE-NOUN-GET-TOTAL-COUNT-METHOD", 1, 1, false);
        declareFunction("simple_noun_get_total_count_as_head_of_complex_nouns_method", "SIMPLE-NOUN-GET-TOTAL-COUNT-AS-HEAD-OF-COMPLEX-NOUNS-METHOD", 1, 0, false);
        declareFunction("simple_noun_get_count_with_verb_method", "SIMPLE-NOUN-GET-COUNT-WITH-VERB-METHOD", 2, 1, false);
        declareFunction("simple_noun_record_occurrence_with_verb_method", "SIMPLE-NOUN-RECORD-OCCURRENCE-WITH-VERB-METHOD", 3, 0, false);
        declareFunction("simple_noun_in_wordnetP_method", "SIMPLE-NOUN-IN-WORDNET?-METHOD", 1, 0, false);
        declareFunction("simple_noun_get_calculated_tag_method", "SIMPLE-NOUN-GET-CALCULATED-TAG-METHOD", 1, 1, false);
        declareFunction("simple_noun_print_counts_method", "SIMPLE-NOUN-PRINT-COUNTS-METHOD", 1, 0, false);
        declareFunction("simple_noun_why_not_tagged_as_method", "SIMPLE-NOUN-WHY-NOT-TAGGED-AS-METHOD", 2, 0, false);
        declareFunction("simple_noun_link_complex_noun_method", "SIMPLE-NOUN-LINK-COMPLEX-NOUN-METHOD", 2, 0, false);
        declareFunction("simple_noun_get_complex_nouns_headed_by_this_noun_method", "SIMPLE-NOUN-GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN-METHOD", 1, 0, false);
        declareFunction("simple_noun_javafy_method", "SIMPLE-NOUN-JAVAFY-METHOD", 1, 1, false);
        declareFunction("simple_noun_calculate_typicality_sum_by_collection_method", "SIMPLE-NOUN-CALCULATE-TYPICALITY-SUM-BY-COLLECTION-METHOD", 1, 0, false);
        declareFunction("simple_noun_calculate_confidence_in_calculated_tag_method", "SIMPLE-NOUN-CALCULATE-CONFIDENCE-IN-CALCULATED-TAG-METHOD", 1, 1, false);
        declareFunction("simple_noun_cfasl_output_method", "SIMPLE-NOUN-CFASL-OUTPUT-METHOD", 2, 0, false);
        declareFunction("get_complex_noun_head", "GET-COMPLEX-NOUN-HEAD", 1, 0, false);
        declareFunction("set_complex_noun_head", "SET-COMPLEX-NOUN-HEAD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_complex_noun_class", "SUBLOOP-RESERVED-INITIALIZE-COMPLEX-NOUN-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_complex_noun_instance", "SUBLOOP-RESERVED-INITIALIZE-COMPLEX-NOUN-INSTANCE", 1, 0, false);
        declareFunction("complex_noun_p", "COMPLEX-NOUN-P", 1, 0, false);
        declareFunction("new_complex_noun", "NEW-COMPLEX-NOUN", 3, 0, false);
        declareFunction("complex_noun_get_basic_tag_method", "COMPLEX-NOUN-GET-BASIC-TAG-METHOD", 1, 0, false);
        declareFunction("complex_noun_get_tag_ranking_method", "COMPLEX-NOUN-GET-TAG-RANKING-METHOD", 1, 2, false);
        declareFunction("complex_noun_get_confidence_level_method", "COMPLEX-NOUN-GET-CONFIDENCE-LEVEL-METHOD", 1, 0, false);
        declareFunction("complex_noun_head_in_wordnetP_method", "COMPLEX-NOUN-HEAD-IN-WORDNET?-METHOD", 1, 0, false);
        declareFunction("complex_noun_get_head_method", "COMPLEX-NOUN-GET-HEAD-METHOD", 1, 0, false);
        declareFunction("complex_noun_javafy_method", "COMPLEX-NOUN-JAVAFY-METHOD", 1, 1, false);
        declareFunction("complex_noun_cfasl_output_method", "COMPLEX-NOUN-CFASL-OUTPUT-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_noun_learner_noun_classes_file() {
        defparameter("*WARN-ABOUT-NOUN-SERIALIZATION?*", T);
        return NIL;
    }

    public static final SubLObject setup_noun_learner_noun_classes_file() {
                classes.subloop_new_class(NOUN, OBJECT, NIL, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(NOUN, NIL);
        classes.subloop_note_class_initialization_function(NOUN, SUBLOOP_RESERVED_INITIALIZE_NOUN_CLASS);
        classes.subloop_note_instance_initialization_function(NOUN, SUBLOOP_RESERVED_INITIALIZE_NOUN_INSTANCE);
        subloop_reserved_initialize_noun_class(NOUN);
        methods.methods_incorporate_class_method($sym25$INCONSISTENT_, NOUN, $list_alt26, $list_alt27, $list_alt28);
        methods.subloop_register_class_method(NOUN, $sym25$INCONSISTENT_, $sym32$NOUN_INCONSISTENT__METHOD);
        methods.methods_incorporate_class_method($sym29$CONSISTENT_, NOUN, $list_alt26, $list_alt27, $list_alt33);
        methods.subloop_register_class_method(NOUN, $sym29$CONSISTENT_, $sym34$NOUN_CONSISTENT__METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, NOUN, $list_alt26, NIL, $list_alt36);
        methods.subloop_register_instance_method(NOUN, INITIALIZE, NOUN_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(REINITIALIZE, NOUN, $list_alt41, NIL, $list_alt42);
        methods.subloop_register_instance_method(NOUN, REINITIALIZE, NOUN_REINITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, NOUN, $list_alt46, $list_alt47, $list_alt48);
        methods.subloop_register_instance_method(NOUN, PRINT, NOUN_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, NOUN, $list_alt46, NIL, $list_alt56);
        methods.subloop_register_instance_method(NOUN, GET_STRING, NOUN_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_WORDS, NOUN, $list_alt46, NIL, $list_alt59);
        methods.subloop_register_instance_method(NOUN, NUMBER_OF_WORDS, NOUN_NUMBER_OF_WORDS_METHOD);
        methods.methods_incorporate_instance_method(GET_TOTAL_COUNT_AS_WHOLE_NOUN, NOUN, $list_alt46, NIL, $list_alt62);
        methods.subloop_register_instance_method(NOUN, GET_TOTAL_COUNT_AS_WHOLE_NOUN, NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD);
        methods.methods_incorporate_instance_method(INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN, NOUN, $list_alt41, NIL, $list_alt65);
        methods.subloop_register_instance_method(NOUN, INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN, NOUN_INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD);
        methods.methods_incorporate_instance_method(GET_REFINED_TAG, NOUN, $list_alt41, NIL, $list_alt69);
        methods.subloop_register_instance_method(NOUN, GET_REFINED_TAG, NOUN_GET_REFINED_TAG_METHOD);
        methods.methods_incorporate_instance_method(GET_TAG, NOUN, $list_alt74, NIL, $list_alt75);
        methods.subloop_register_instance_method(NOUN, GET_TAG, NOUN_GET_TAG_METHOD);
        methods.methods_incorporate_instance_method(GET_TOP_N_TAGS, NOUN, $list_alt41, $list_alt78, $list_alt79);
        methods.subloop_register_instance_method(NOUN, GET_TOP_N_TAGS, NOUN_GET_TOP_N_TAGS_METHOD);
        methods.methods_incorporate_instance_method(GET_RANKING_OF, NOUN, $list_alt46, $list_alt84, $list_alt85);
        methods.subloop_register_instance_method(NOUN, GET_RANKING_OF, NOUN_GET_RANKING_OF_METHOD);
        methods.methods_incorporate_instance_method(GET_STATUS_IN_CYC, NOUN, $list_alt46, NIL, $list_alt89);
        methods.subloop_register_instance_method(NOUN, GET_STATUS_IN_CYC, NOUN_GET_STATUS_IN_CYC_METHOD);
        methods.methods_incorporate_instance_method(GET_MEANINGS_IN_CYC, NOUN, $list_alt46, NIL, $list_alt92);
        methods.subloop_register_instance_method(NOUN, GET_MEANINGS_IN_CYC, NOUN_GET_MEANINGS_IN_CYC_METHOD);
        methods.methods_incorporate_instance_method(GET_BEST_MEANING_IN_CYC, NOUN, $list_alt46, NIL, $list_alt98);
        methods.subloop_register_instance_method(NOUN, GET_BEST_MEANING_IN_CYC, NOUN_GET_BEST_MEANING_IN_CYC_METHOD);
        methods.methods_incorporate_instance_method(GET_APPEARANCES_AS_PLURAL, NOUN, $list_alt46, NIL, $list_alt101);
        methods.subloop_register_instance_method(NOUN, GET_APPEARANCES_AS_PLURAL, NOUN_GET_APPEARANCES_AS_PLURAL_METHOD);
        methods.methods_incorporate_instance_method(INCREMENT_APPEARANCES_AS_PLURAL, NOUN, $list_alt41, NIL, $list_alt104);
        methods.subloop_register_instance_method(NOUN, INCREMENT_APPEARANCES_AS_PLURAL, NOUN_INCREMENT_APPEARANCES_AS_PLURAL_METHOD);
        methods.methods_incorporate_instance_method(GET_APPEARANCES_WITH_DETERMINER, NOUN, $list_alt46, NIL, $list_alt108);
        methods.subloop_register_instance_method(NOUN, GET_APPEARANCES_WITH_DETERMINER, NOUN_GET_APPEARANCES_WITH_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method(INCREMENT_APPEARANCES_WITH_DETERMINER, NOUN, $list_alt41, NIL, $list_alt111);
        methods.subloop_register_instance_method(NOUN, INCREMENT_APPEARANCES_WITH_DETERMINER, NOUN_INCREMENT_APPEARANCES_WITH_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method(GET_APPEARANCES_IN_ALL_CAPS, NOUN, $list_alt46, NIL, $list_alt115);
        methods.subloop_register_instance_method(NOUN, GET_APPEARANCES_IN_ALL_CAPS, NOUN_GET_APPEARANCES_IN_ALL_CAPS_METHOD);
        methods.methods_incorporate_instance_method(INCREMENT_APPEARANCES_IN_ALL_CAPS, NOUN, $list_alt41, NIL, $list_alt118);
        methods.subloop_register_instance_method(NOUN, INCREMENT_APPEARANCES_IN_ALL_CAPS, NOUN_INCREMENT_APPEARANCES_IN_ALL_CAPS_METHOD);
        methods.methods_incorporate_instance_method(GET_APPEARANCES_IN_ALL_CAPS_WITH_THE, NOUN, $list_alt46, NIL, $list_alt122);
        methods.subloop_register_instance_method(NOUN, GET_APPEARANCES_IN_ALL_CAPS_WITH_THE, NOUN_GET_APPEARANCES_IN_ALL_CAPS_WITH_THE_METHOD);
        methods.methods_incorporate_instance_method(INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE, NOUN, $list_alt41, NIL, $list_alt125);
        methods.subloop_register_instance_method(NOUN, INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE, NOUN_INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE_METHOD);
        methods.methods_incorporate_instance_method($sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_, NOUN, $list_alt41, NIL, $list_alt128);
        methods.subloop_register_instance_method(NOUN, $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_, $sym133$NOUN_NO_NOTABLE_INSTANCES_OF_REFINED_TAG__METHOD);
        methods.methods_incorporate_instance_method($sym8$COLLECTION_OR_INDIVIDUAL_, NOUN, $list_alt41, NIL, $list_alt134);
        methods.subloop_register_instance_method(NOUN, $sym8$COLLECTION_OR_INDIVIDUAL_, $sym137$NOUN_COLLECTION_OR_INDIVIDUAL__METHOD);
        methods.methods_incorporate_instance_method(REFINE_TAG, NOUN, $list_alt26, NIL, $list_alt138);
        methods.subloop_register_instance_method(NOUN, REFINE_TAG, NOUN_REFINE_TAG_METHOD);
        methods.methods_incorporate_instance_method($sym136$COLLECTION_OR_INDIVIDUAL__INT, NOUN, $list_alt152, NIL, $list_alt153);
        methods.subloop_register_instance_method(NOUN, $sym136$COLLECTION_OR_INDIVIDUAL__INT, $sym157$NOUN_COLLECTION_OR_INDIVIDUAL__INT_METHOD);
        methods.methods_incorporate_instance_method($sym142$LEXIFIES_FORT_, NOUN, $list_alt152, $list_alt158, $list_alt159);
        methods.subloop_register_instance_method(NOUN, $sym142$LEXIFIES_FORT_, $sym161$NOUN_LEXIFIES_FORT__METHOD);
        classes.subloop_new_class(SIMPLE_NOUN, NOUN, NIL, NIL, $list_alt163);
        classes.class_set_implements_slot_listeners(SIMPLE_NOUN, NIL);
        classes.subloop_note_class_initialization_function(SIMPLE_NOUN, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_NOUN_CLASS);
        classes.subloop_note_instance_initialization_function(SIMPLE_NOUN, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_NOUN_INSTANCE);
        subloop_reserved_initialize_simple_noun_class(SIMPLE_NOUN);
        methods.methods_incorporate_instance_method(INITIALIZE, SIMPLE_NOUN, $list_alt26, NIL, $list_alt175);
        methods.subloop_register_instance_method(SIMPLE_NOUN, INITIALIZE, SIMPLE_NOUN_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(REINITIALIZE, SIMPLE_NOUN, $list_alt41, NIL, $list_alt178);
        methods.subloop_register_instance_method(SIMPLE_NOUN, REINITIALIZE, SIMPLE_NOUN_REINITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_BASIC_TAG, SIMPLE_NOUN, $list_alt74, NIL, $list_alt181);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_BASIC_TAG, SIMPLE_NOUN_GET_BASIC_TAG_METHOD);
        methods.methods_incorporate_instance_method(GET_TAG_RANKING, SIMPLE_NOUN, $list_alt41, $list_alt184, $list_alt185);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_TAG_RANKING, SIMPLE_NOUN_GET_TAG_RANKING_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE_LEVEL, SIMPLE_NOUN, $list_alt41, NIL, $list_alt191);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_CONFIDENCE_LEVEL, SIMPLE_NOUN_GET_CONFIDENCE_LEVEL_METHOD);
        methods.methods_incorporate_instance_method($sym154$HEAD_IN_WORDNET_, SIMPLE_NOUN, $list_alt46, NIL, $list_alt195);
        methods.subloop_register_instance_method(SIMPLE_NOUN, $sym154$HEAD_IN_WORDNET_, $sym196$SIMPLE_NOUN_HEAD_IN_WORDNET__METHOD);
        methods.methods_incorporate_instance_method(GET_TOTAL_COUNT, SIMPLE_NOUN, $list_alt46, $list_alt198, $list_alt199);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_TOTAL_COUNT, SIMPLE_NOUN_GET_TOTAL_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_TOTAL_COUNT_AS_HEAD_OF_COMPLEX_NOUNS, SIMPLE_NOUN, $list_alt74, NIL, $list_alt205);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_TOTAL_COUNT_AS_HEAD_OF_COMPLEX_NOUNS, SIMPLE_NOUN_GET_TOTAL_COUNT_AS_HEAD_OF_COMPLEX_NOUNS_METHOD);
        methods.methods_incorporate_instance_method(GET_COUNT_WITH_VERB, SIMPLE_NOUN, $list_alt46, $list_alt208, $list_alt209);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_COUNT_WITH_VERB, SIMPLE_NOUN_GET_COUNT_WITH_VERB_METHOD);
        methods.methods_incorporate_instance_method(RECORD_OCCURRENCE_WITH_VERB, SIMPLE_NOUN, $list_alt41, $list_alt213, $list_alt214);
        methods.subloop_register_instance_method(SIMPLE_NOUN, RECORD_OCCURRENCE_WITH_VERB, SIMPLE_NOUN_RECORD_OCCURRENCE_WITH_VERB_METHOD);
        methods.methods_incorporate_instance_method($sym167$IN_WORDNET_, SIMPLE_NOUN, $list_alt41, NIL, $list_alt217);
        methods.subloop_register_instance_method(SIMPLE_NOUN, $sym167$IN_WORDNET_, $sym219$SIMPLE_NOUN_IN_WORDNET__METHOD);
        methods.methods_incorporate_instance_method(GET_CALCULATED_TAG, SIMPLE_NOUN, $list_alt41, $list_alt220, $list_alt221);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_CALCULATED_TAG, SIMPLE_NOUN_GET_CALCULATED_TAG_METHOD);
        methods.methods_incorporate_instance_method(PRINT_COUNTS, SIMPLE_NOUN, $list_alt46, NIL, $list_alt224);
        methods.subloop_register_instance_method(SIMPLE_NOUN, PRINT_COUNTS, SIMPLE_NOUN_PRINT_COUNTS_METHOD);
        methods.methods_incorporate_instance_method(WHY_NOT_TAGGED_AS, SIMPLE_NOUN, $list_alt46, $list_alt231, $list_alt232);
        methods.subloop_register_instance_method(SIMPLE_NOUN, WHY_NOT_TAGGED_AS, SIMPLE_NOUN_WHY_NOT_TAGGED_AS_METHOD);
        methods.methods_incorporate_instance_method(LINK_COMPLEX_NOUN, SIMPLE_NOUN, $list_alt26, $list_alt236, $list_alt237);
        methods.subloop_register_instance_method(SIMPLE_NOUN, LINK_COMPLEX_NOUN, SIMPLE_NOUN_LINK_COMPLEX_NOUN_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN, SIMPLE_NOUN, $list_alt46, NIL, $list_alt242);
        methods.subloop_register_instance_method(SIMPLE_NOUN, GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN, SIMPLE_NOUN_GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN_METHOD);
        methods.methods_incorporate_instance_method(JAVAFY, SIMPLE_NOUN, $list_alt46, $list_alt245, $list_alt246);
        methods.subloop_register_instance_method(SIMPLE_NOUN, JAVAFY, SIMPLE_NOUN_JAVAFY_METHOD);
        methods.methods_incorporate_instance_method(CALCULATE_TYPICALITY_SUM_BY_COLLECTION, SIMPLE_NOUN, $list_alt152, NIL, $list_alt249);
        methods.subloop_register_instance_method(SIMPLE_NOUN, CALCULATE_TYPICALITY_SUM_BY_COLLECTION, SIMPLE_NOUN_CALCULATE_TYPICALITY_SUM_BY_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(CALCULATE_CONFIDENCE_IN_CALCULATED_TAG, SIMPLE_NOUN, $list_alt26, $list_alt251, $list_alt252);
        methods.subloop_register_instance_method(SIMPLE_NOUN, CALCULATE_CONFIDENCE_IN_CALCULATED_TAG, SIMPLE_NOUN_CALCULATE_CONFIDENCE_IN_CALCULATED_TAG_METHOD);
        methods.methods_incorporate_instance_method(CFASL_OUTPUT, SIMPLE_NOUN, $list_alt257, $list_alt258, $list_alt259);
        methods.subloop_register_instance_method(SIMPLE_NOUN, CFASL_OUTPUT, SIMPLE_NOUN_CFASL_OUTPUT_METHOD);
        classes.subloop_new_class(COMPLEX_NOUN, NOUN, NIL, NIL, $list_alt265);
        classes.class_set_implements_slot_listeners(COMPLEX_NOUN, NIL);
        classes.subloop_note_class_initialization_function(COMPLEX_NOUN, SUBLOOP_RESERVED_INITIALIZE_COMPLEX_NOUN_CLASS);
        classes.subloop_note_instance_initialization_function(COMPLEX_NOUN, SUBLOOP_RESERVED_INITIALIZE_COMPLEX_NOUN_INSTANCE);
        subloop_reserved_initialize_complex_noun_class(COMPLEX_NOUN);
        methods.methods_incorporate_instance_method(GET_BASIC_TAG, COMPLEX_NOUN, $list_alt46, NIL, $list_alt270);
        methods.subloop_register_instance_method(COMPLEX_NOUN, GET_BASIC_TAG, COMPLEX_NOUN_GET_BASIC_TAG_METHOD);
        methods.methods_incorporate_instance_method(GET_TAG_RANKING, COMPLEX_NOUN, $list_alt46, $list_alt184, $list_alt273);
        methods.subloop_register_instance_method(COMPLEX_NOUN, GET_TAG_RANKING, COMPLEX_NOUN_GET_TAG_RANKING_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE_LEVEL, COMPLEX_NOUN, $list_alt46, NIL, $list_alt275);
        methods.subloop_register_instance_method(COMPLEX_NOUN, GET_CONFIDENCE_LEVEL, COMPLEX_NOUN_GET_CONFIDENCE_LEVEL_METHOD);
        methods.methods_incorporate_instance_method($sym154$HEAD_IN_WORDNET_, COMPLEX_NOUN, $list_alt46, NIL, $list_alt277);
        methods.subloop_register_instance_method(COMPLEX_NOUN, $sym154$HEAD_IN_WORDNET_, $sym278$COMPLEX_NOUN_HEAD_IN_WORDNET__METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD, COMPLEX_NOUN, $list_alt46, NIL, $list_alt280);
        methods.subloop_register_instance_method(COMPLEX_NOUN, GET_HEAD, COMPLEX_NOUN_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method(JAVAFY, COMPLEX_NOUN, $list_alt46, $list_alt245, $list_alt282);
        methods.subloop_register_instance_method(COMPLEX_NOUN, JAVAFY, COMPLEX_NOUN_JAVAFY_METHOD);
        methods.methods_incorporate_instance_method(CFASL_OUTPUT, COMPLEX_NOUN, $list_alt257, $list_alt258, $list_alt284);
        methods.subloop_register_instance_method(COMPLEX_NOUN, CFASL_OUTPUT, COMPLEX_NOUN_CFASL_OUTPUT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");





    private static final SubLSymbol EXCLUDE_PREDICATES = makeSymbol("EXCLUDE-PREDICATES");

    public static final SubLObject $$preferredNameString = constant_handles.reader_make_constant_shell(makeString("preferredNameString"));





    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("VALUE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEARNED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REFINED-TAG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATUS-IN-CYC"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPEARANCES-AS-PLURAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPEARANCES-WITH-DETERMINER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPEARANCES-IN-ALL-CAPS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("INCONSISTENT?"), list(makeSymbol("TAG"), makeSymbol("DENOT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CONSISTENT?"), list(makeSymbol("TAG"), makeSymbol("DENOT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REINITIALIZE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-OF-WORDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFINED-TAG"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TAG"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOP-N-TAGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("N")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANKING-OF"), list(makeSymbol("COLLECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATUS-IN-CYC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MEANINGS-IN-CYC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BEST-MEANING-IN-CYC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPEARANCES-AS-PLURAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-APPEARANCES-AS-PLURAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPEARANCES-WITH-DETERMINER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-APPEARANCES-WITH-DETERMINER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPEARANCES-IN-ALL-CAPS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPEARANCES-IN-ALL-CAPS-WITH-THE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BASIC-TAG"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TAG-RANKING"), list(makeSymbol("&OPTIONAL"), makeSymbol("MAX-LENGTH"), makeSymbol("RECALCULATE-IF-EXISTS?")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE-LEVEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HEAD-IN-WORDNET?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REFINE-TAG"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLLECTION-OR-INDIVIDUAL?-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFIES-FORT?"), list(makeSymbol("FORT")), makeKeyword("PROTECTED")) });

    static private final SubLSymbol $sym8$COLLECTION_OR_INDIVIDUAL_ = makeSymbol("COLLECTION-OR-INDIVIDUAL?");

    static private final SubLSymbol $sym9$NO_NOTABLE_INSTANCES_OF_REFINED_TAG_ = makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?");

    private static final SubLSymbol APPEARANCES_IN_ALL_CAPS_WITH_THE = makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE");

    private static final SubLSymbol APPEARANCES_IN_ALL_CAPS = makeSymbol("APPEARANCES-IN-ALL-CAPS");

    private static final SubLSymbol APPEARANCES_WITH_DETERMINER = makeSymbol("APPEARANCES-WITH-DETERMINER");

    private static final SubLSymbol APPEARANCES_AS_PLURAL = makeSymbol("APPEARANCES-AS-PLURAL");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOUN_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOUN-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOUN_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOUN-INSTANCE");

    static private final SubLSymbol $sym25$INCONSISTENT_ = makeSymbol("INCONSISTENT?");

    static private final SubLList $list_alt26 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt27 = list(makeSymbol("TAG"), makeSymbol("DENOT"));

    static private final SubLList $list_alt28 = list(makeString("Is the denotation DENOT demonstrably inconsistent with the tag TAG?"), list(makeSymbol("PIF"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CONSISTENT?")), makeSymbol("TAG"), makeSymbol("DENOT")), list(RET, NIL), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), T)), list(makeSymbol("PIF"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DISJOINT-WITH?"), makeSymbol("TAG"), makeSymbol("DENOT")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("NOT-ISA-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("TAG")))), list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("CONCEPTUALLY-RELATED?"), makeSymbol("TAG"), makeSymbol("DENOT")), list(makeSymbol("CONCEPTUALLY-RELATED?"), makeSymbol("DENOT"), makeSymbol("TAG"))))))), list(RET, makeSymbol("RESULT")))));

    static private final SubLSymbol $sym29$CONSISTENT_ = makeSymbol("CONSISTENT?");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym32$NOUN_INCONSISTENT__METHOD = makeSymbol("NOUN-INCONSISTENT?-METHOD");

    static private final SubLList $list_alt33 = list(makeString("Is the denotation DENOT demonstrably consistent with the tag TAG?"), list(RET, list(makeSymbol("FIF"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")), list(makeSymbol("COR"), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("TAG")), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("TAG"), makeSymbol("DENOT"))), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("TAG")))));

    static private final SubLSymbol $sym34$NOUN_CONSISTENT__METHOD = makeSymbol("NOUN-CONSISTENT?-METHOD");



    static private final SubLList $list_alt36 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-LEXICON-FOR-NOUN-CLASS")))), list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("REFINED-TAG"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-AS-PLURAL"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-WITH-DETERMINER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-IN-ALL-CAPS"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("DONT-KNOW-YET")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol $DONT_KNOW_YET = makeKeyword("DONT-KNOW-YET");

    private static final SubLSymbol NOUN_INITIALIZE_METHOD = makeSymbol("NOUN-INITIALIZE-METHOD");

    private static final SubLSymbol REINITIALIZE = makeSymbol("REINITIALIZE");

    static private final SubLList $list_alt41 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt42 = list(makeString("Reinitialize the cyc-term-valued and keyword-valued slots to :DONT-KNOW-YET.\n   (Don\'t touch the integer-valued slots.)"), list(makeSymbol("CSETQ"), makeSymbol("REFINED-TAG"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("DONT-KNOW-YET")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_REINITIALIZE_METHOD = makeSymbol("NOUN-REINITIALIZE-METHOD");



    static private final SubLList $list_alt46 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt47 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINT-CLASS-INSTANCE"), list(makeSymbol("SELF"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("STRING"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));



    static private final SubLString $str_alt50$__ = makeString("#<");



    static private final SubLString $str_alt52$__A = makeString("-~A");



    private static final SubLSymbol NOUN_PRINT_METHOD = makeSymbol("NOUN-PRINT-METHOD");



    static private final SubLList $list_alt56 = list(list(RET, makeSymbol("STRING")));

    private static final SubLSymbol NOUN_GET_STRING_METHOD = makeSymbol("NOUN-GET-STRING-METHOD");

    private static final SubLSymbol NUMBER_OF_WORDS = makeSymbol("NUMBER-OF-WORDS");

    static private final SubLList $list_alt59 = list(list(RET, list(makeSymbol("NUMBER-OF-WORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))))));

    private static final SubLSymbol NOUN_NUMBER_OF_WORDS_METHOD = makeSymbol("NOUN-NUMBER-OF-WORDS-METHOD");



    static private final SubLList $list_alt62 = list(list(RET, makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")));

    private static final SubLSymbol NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD = makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD");

    private static final SubLSymbol INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN = makeSymbol("INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN");

    static private final SubLList $list_alt65 = list(list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"), list(makeSymbol("+"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"), ONE_INTEGER)), list(RET, makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD = makeSymbol("NOUN-INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD");



    static private final SubLList $list_alt69 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("REFINED-TAG"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("REFINED-TAG"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REFINE-TAG"))))), list(RET, makeSymbol("REFINED-TAG")));

    static private final SubLSymbol $sym70$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol REFINE_TAG = makeSymbol("REFINE-TAG");

    private static final SubLSymbol NOUN_GET_REFINED_TAG_METHOD = makeSymbol("NOUN-GET-REFINED-TAG-METHOD");



    static private final SubLList $list_alt74 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt75 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFINED-TAG")))));

    private static final SubLSymbol NOUN_GET_TAG_METHOD = makeSymbol("NOUN-GET-TAG-METHOD");

    private static final SubLSymbol GET_TOP_N_TAGS = makeSymbol("GET-TOP-N-TAGS");

    static private final SubLList $list_alt78 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("N"), FIVE_INTEGER), makeSymbol("RECALCULATE-IF-EXISTS?"));

    static private final SubLList $list_alt79 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RANKING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TAG-RANKING")), makeSymbol("N"), makeSymbol("RECALCULATE-IF-EXISTS?")))), list(makeSymbol("PIF"), list(makeSymbol("KEYWORDP"), makeSymbol("RANKING")), list(RET, makeSymbol("RANKING")), list(RET, list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("FIRST")), makeSymbol("RANKING"))))));

    private static final SubLSymbol GET_TAG_RANKING = makeSymbol("GET-TAG-RANKING");



    private static final SubLSymbol NOUN_GET_TOP_N_TAGS_METHOD = makeSymbol("NOUN-GET-TOP-N-TAGS-METHOD");

    private static final SubLSymbol GET_RANKING_OF = makeSymbol("GET-RANKING-OF");

    static private final SubLList $list_alt84 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt85 = list(makeString("Where did COLLECTION rank among the calculated conjectures for this noun?\n   @return integerp or NIL (if it\'s not among the ranked conjectures) or keywordp (if we don\'t have any ranking)"), list(makeSymbol("CHECK-TYPE"), makeSymbol("COLLECTION"), makeSymbol("COLLECTION-P")), list(makeSymbol("CLET"), list(list(makeSymbol("RANKING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TAG-RANKING"))))), list(makeSymbol("PIF"), list(makeSymbol("KEYWORDP"), makeSymbol("RANKING")), list(RET, makeSymbol("RANKING")), list(RET, list(makeSymbol("POSITION"), makeSymbol("COLLECTION"), makeSymbol("RANKING"), list(makeSymbol("FUNCTION"), EQ), list(makeSymbol("FUNCTION"), makeSymbol("FIRST")))))));



    private static final SubLSymbol NOUN_GET_RANKING_OF_METHOD = makeSymbol("NOUN-GET-RANKING-OF-METHOD");



    static private final SubLList $list_alt89 = list(list(makeSymbol("PIF"), list(EQ, makeSymbol("STATUS-IN-CYC"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("PROGN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))), list(RET, list(makeSymbol("GET-NOUN-STATUS-IN-CYC"), makeSymbol("SELF")))), list(RET, makeSymbol("STATUS-IN-CYC"))));

    private static final SubLSymbol NOUN_GET_STATUS_IN_CYC_METHOD = makeSymbol("NOUN-GET-STATUS-IN-CYC-METHOD");

    private static final SubLSymbol GET_MEANINGS_IN_CYC = makeSymbol("GET-MEANINGS-IN-CYC");

    static private final SubLList $list_alt92 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING"))), list(makeSymbol("MEANINGS"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("LEX"), makeSymbol("LEXES")), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("NOUN?"))), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")), makeSymbol("MEANINGS"), list(makeSymbol("FUNCTION"), EQUAL)))), list(RET, makeSymbol("MEANINGS"))));



    static private final SubLSymbol $sym94$NOUN_ = makeSymbol("NOUN?");



    private static final SubLSymbol NOUN_GET_MEANINGS_IN_CYC_METHOD = makeSymbol("NOUN-GET-MEANINGS-IN-CYC-METHOD");

    private static final SubLSymbol GET_BEST_MEANING_IN_CYC = makeSymbol("GET-BEST-MEANING-IN-CYC");

    static private final SubLList $list_alt98 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MEANINGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MEANINGS-IN-CYC"))))), list(RET, list(makeSymbol("FWHEN"), list(makeSymbol("NON-EMPTY-LIST-P"), makeSymbol("MEANINGS")), list(makeSymbol("FIRST"), makeSymbol("MEANINGS"))))));

    private static final SubLSymbol NOUN_GET_BEST_MEANING_IN_CYC_METHOD = makeSymbol("NOUN-GET-BEST-MEANING-IN-CYC-METHOD");

    private static final SubLSymbol GET_APPEARANCES_AS_PLURAL = makeSymbol("GET-APPEARANCES-AS-PLURAL");

    static private final SubLList $list_alt101 = list(list(RET, makeSymbol("APPEARANCES-AS-PLURAL")));

    private static final SubLSymbol NOUN_GET_APPEARANCES_AS_PLURAL_METHOD = makeSymbol("NOUN-GET-APPEARANCES-AS-PLURAL-METHOD");

    private static final SubLSymbol INCREMENT_APPEARANCES_AS_PLURAL = makeSymbol("INCREMENT-APPEARANCES-AS-PLURAL");

    static private final SubLList $list_alt104 = list(list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-AS-PLURAL"), list(makeSymbol("+"), makeSymbol("APPEARANCES-AS-PLURAL"), ONE_INTEGER)), list(RET, NIL));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_INCREMENT_APPEARANCES_AS_PLURAL_METHOD = makeSymbol("NOUN-INCREMENT-APPEARANCES-AS-PLURAL-METHOD");

    private static final SubLSymbol GET_APPEARANCES_WITH_DETERMINER = makeSymbol("GET-APPEARANCES-WITH-DETERMINER");

    static private final SubLList $list_alt108 = list(list(RET, makeSymbol("APPEARANCES-WITH-DETERMINER")));

    private static final SubLSymbol NOUN_GET_APPEARANCES_WITH_DETERMINER_METHOD = makeSymbol("NOUN-GET-APPEARANCES-WITH-DETERMINER-METHOD");

    private static final SubLSymbol INCREMENT_APPEARANCES_WITH_DETERMINER = makeSymbol("INCREMENT-APPEARANCES-WITH-DETERMINER");

    static private final SubLList $list_alt111 = list(list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-WITH-DETERMINER"), list(makeSymbol("+"), makeSymbol("APPEARANCES-WITH-DETERMINER"), ONE_INTEGER)), list(RET, NIL));

    static private final SubLSymbol $sym112$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_INCREMENT_APPEARANCES_WITH_DETERMINER_METHOD = makeSymbol("NOUN-INCREMENT-APPEARANCES-WITH-DETERMINER-METHOD");

    private static final SubLSymbol GET_APPEARANCES_IN_ALL_CAPS = makeSymbol("GET-APPEARANCES-IN-ALL-CAPS");

    static private final SubLList $list_alt115 = list(list(RET, makeSymbol("APPEARANCES-IN-ALL-CAPS")));

    private static final SubLSymbol NOUN_GET_APPEARANCES_IN_ALL_CAPS_METHOD = makeSymbol("NOUN-GET-APPEARANCES-IN-ALL-CAPS-METHOD");

    private static final SubLSymbol INCREMENT_APPEARANCES_IN_ALL_CAPS = makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS");

    static private final SubLList $list_alt118 = list(list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-IN-ALL-CAPS"), list(makeSymbol("+"), makeSymbol("APPEARANCES-IN-ALL-CAPS"), ONE_INTEGER)), list(RET, NIL));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_INCREMENT_APPEARANCES_IN_ALL_CAPS_METHOD = makeSymbol("NOUN-INCREMENT-APPEARANCES-IN-ALL-CAPS-METHOD");

    private static final SubLSymbol GET_APPEARANCES_IN_ALL_CAPS_WITH_THE = makeSymbol("GET-APPEARANCES-IN-ALL-CAPS-WITH-THE");

    static private final SubLList $list_alt122 = list(list(RET, makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE")));

    private static final SubLSymbol NOUN_GET_APPEARANCES_IN_ALL_CAPS_WITH_THE_METHOD = makeSymbol("NOUN-GET-APPEARANCES-IN-ALL-CAPS-WITH-THE-METHOD");

    private static final SubLSymbol INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE = makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE");

    static private final SubLList $list_alt125 = list(list(makeSymbol("CSETQ"), makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE"), list(makeSymbol("+"), makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE"), ONE_INTEGER)), list(RET, NIL));

    static private final SubLSymbol $sym126$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol NOUN_INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE_METHOD = makeSymbol("NOUN-INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE-METHOD");

    static private final SubLList $list_alt128 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("PIF"), list(EQ, makeSymbol("REFINED-TAG"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("ERROR"), makeString("Can't tell if there are no notable instances of the tag of ~S because I don't know the tag yet!"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"), list(makeSymbol("CAND"), list(makeSymbol("FORT-P"), makeSymbol("REFINED-TAG")), list(makeSymbol("BOOLEAN"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell(makeString("noNotableInstances")), makeSymbol("REFINED-TAG")), constant_handles.reader_make_constant_shell(makeString("InferencePSC")))))))), list(RET, makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?")));

    static private final SubLSymbol $sym129$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    static private final SubLString $str_alt130$Can_t_tell_if_there_are_no_notabl = makeString("Can't tell if there are no notable instances of the tag of ~S because I don't know the tag yet!");

    public static final SubLObject $$noNotableInstances = constant_handles.reader_make_constant_shell(makeString("noNotableInstances"));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    static private final SubLSymbol $sym133$NOUN_NO_NOTABLE_INSTANCES_OF_REFINED_TAG__METHOD = makeSymbol("NOUN-NO-NOTABLE-INSTANCES-OF-REFINED-TAG?-METHOD");

    static private final SubLList $list_alt134 = list(makeString("@return keywordp: :COLLECTION or :INDIVIDUAL; the best guess based on capitalization, pluralization, etc. of SELF"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?-INT"))))), list(RET, makeSymbol("COLLECTION-OR-INDIVIDUAL?")));

    static private final SubLSymbol $sym135$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    static private final SubLSymbol $sym136$COLLECTION_OR_INDIVIDUAL__INT = makeSymbol("COLLECTION-OR-INDIVIDUAL?-INT");

    static private final SubLSymbol $sym137$NOUN_COLLECTION_OR_INDIVIDUAL__METHOD = makeSymbol("NOUN-COLLECTION-OR-INDIVIDUAL?-METHOD");

    static private final SubLList $list_alt138 = list(makeString("@return collection-p or keywordp; the best tag for this noun, refined using lexicon and Wordnet, OR\n                                     :DONT-CARE or :CANT-TELL if there is insufficient data\n   As a side effect, sets the slot STATUS-IN-CYC"), list(makeSymbol("CLET"), list(list(makeSymbol("BASIC-TAG"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASIC-TAG"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("KEYWORDP"), makeSymbol("BASIC-TAG")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("DONT-CARE")), list(RET, makeSymbol("BASIC-TAG"))), list(list(makeSymbol("KB-INDIVIDUAL-P"), makeSymbol("BASIC-TAG")), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFIES-FORT?")), makeSymbol("BASIC-TAG")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("KNOWN-AND-LEXIFIED")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("KNOWN-BUT-UNLEXIFIED"))), list(RET, makeSymbol("BASIC-TAG"))), list(list(makeSymbol("COLLECTION-P"), makeSymbol("BASIC-TAG")), list(makeSymbol("CLET"), list(list(makeSymbol("DENOTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MEANINGS-IN-CYC")))), list(makeSymbol("DENOTS-FILTERED"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FORT-P"), makeSymbol("DENOT")), list(makeSymbol("CNOT"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INCONSISTENT?")), makeSymbol("BASIC-TAG"), makeSymbol("DENOT")))), list(makeSymbol("CPUSHNEW"), makeSymbol("DENOT"), makeSymbol("DENOTS-FILTERED")))), list(makeSymbol("PIF"), makeSymbol("DENOTS-FILTERED"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("KNOWN-AND-LEXIFIED")), list(makeSymbol("PIF"), list(makeSymbol("COMPLEX-NOUN-P"), makeSymbol("SELF")), list(RET, makeKeyword("IGNORE")), list(makeSymbol("CLET"), list(list(makeSymbol("SPECS-OF-TAG-AMONG-DENOTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS-FILTERED")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("BASIC-TAG"))), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS")))), list(makeSymbol("PCOND"), list(list(makeSymbol("SINGLETON?"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS")), list(RET, list(makeSymbol("FIRST"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS")))), list(list(makeSymbol("NULL"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS")), list(RET, makeSymbol("BASIC-TAG"))), list(T, list(makeSymbol("CLET"), list(makeSymbol("MIN-CEILING-COLS"), makeSymbol("ALL-SPECS-OF-BASIC-TAG")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("ALL-SPECS-OF-BASIC-TAG"), list(makeSymbol("ALL-SPECS"), makeSymbol("BASIC-TAG"))), list(makeSymbol("CSETQ"), makeSymbol("MIN-CEILING-COLS"), list(makeSymbol("MIN-CEILING-COLS"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS"), makeSymbol("ALL-SPECS-OF-BASIC-TAG")))), list(makeSymbol("PUNLESS"), makeSymbol("MIN-CEILING-COLS"), list(makeSymbol("WARN"), makeString("~S~%basic-tag: ~S~%specs-of-tag-among-denots: ~S~%min-ceiling-cols: NIL"), makeSymbol("SELF"), makeSymbol("BASIC-TAG"), makeSymbol("SPECS-OF-TAG-AMONG-DENOTS")), list(RET, makeSymbol("BASIC-TAG"))), list(RET, list(makeSymbol("FIRST"), makeSymbol("MIN-CEILING-COLS"))))))))), list(makeSymbol("CLET"), list(list(makeSymbol("DENOTS-FROM-WN"), list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-WORDNET"), list(makeSymbol("DENOTS-OF-STRING&POS-WITH-SYNSET-BOOSTERS"), makeSymbol("STRING"), $NOUN))), list(makeSymbol("DENOTS-FROM-WN-FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS-FROM-WN")), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CONSISTENT?")), makeSymbol("BASIC-TAG"), makeSymbol("DENOT")), list(makeSymbol("CPUSH"), makeSymbol("DENOT"), makeSymbol("DENOTS-FROM-WN-FILTERED")))), list(makeSymbol("PIF"), makeSymbol("DENOTS-FROM-WN-FILTERED"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("KNOWN-BUT-UNLEXIFIED")), list(RET, list(makeSymbol("FIRST"), makeSymbol("DENOTS-FROM-WN-FILTERED")))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("UNKNOWN")), list(RET, makeSymbol("BASIC-TAG")))))))), list(T, list(makeSymbol("WARN"), makeString("~S is not a keyword, individual, or collection."), makeSymbol("BASIC-TAG")), list(makeSymbol("CSETQ"), makeSymbol("STATUS-IN-CYC"), makeKeyword("PROBLEM")), list(RET, makeSymbol("BASIC-TAG"))))));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-METHOD");

    private static final SubLSymbol GET_BASIC_TAG = makeSymbol("GET-BASIC-TAG");



    static private final SubLSymbol $sym142$LEXIFIES_FORT_ = makeSymbol("LEXIFIES-FORT?");

    private static final SubLSymbol $KNOWN_AND_LEXIFIED = makeKeyword("KNOWN-AND-LEXIFIED");

    private static final SubLSymbol $KNOWN_BUT_UNLEXIFIED = makeKeyword("KNOWN-BUT-UNLEXIFIED");



    static private final SubLString $str_alt146$_S__basic_tag___S__specs_of_tag_a = makeString("~S~%basic-tag: ~S~%specs-of-tag-among-denots: ~S~%min-ceiling-cols: NIL");





    static private final SubLString $str_alt149$_S_is_not_a_keyword__individual__ = makeString("~S is not a keyword, individual, or collection.");



    private static final SubLSymbol NOUN_REFINE_TAG_METHOD = makeSymbol("NOUN-REFINE-TAG-METHOD");

    static private final SubLList $list_alt152 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt153 = list(list(makeSymbol("IGNORE"), makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?")), list(makeSymbol("CLET"), list(list(makeSymbol("VOTES-FOR-COLLECTION"), ZERO_INTEGER), list(makeSymbol("VOTES-FOR-INDIVIDUAL"), ZERO_INTEGER)), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NO-NOTABLE-INSTANCES-OF-REFINED-TAG?"))), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-COLLECTION"), SEVEN_INTEGER)), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-COLLECTION"), list(makeSymbol("*"), THREE_INTEGER, list(makeSymbol("/"), makeSymbol("APPEARANCES-AS-PLURAL"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")))), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-COLLECTION"), list(makeSymbol("*"), THREE_INTEGER, list(makeSymbol("/"), makeSymbol("APPEARANCES-WITH-DETERMINER"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"))))), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-WORDNET"), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HEAD-IN-WORDNET?"))), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-INDIVIDUAL"), TWO_INTEGER))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-INDIVIDUAL"), list(makeSymbol("*"), FIVE_INTEGER, list(makeSymbol("/"), makeSymbol("APPEARANCES-IN-ALL-CAPS-WITH-THE"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN")))), list(makeSymbol("CINC"), makeSymbol("VOTES-FOR-INDIVIDUAL"), list(makeSymbol("*"), ONE_INTEGER, list(makeSymbol("/"), makeSymbol("APPEARANCES-IN-ALL-CAPS"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"))))), list(makeSymbol("PIF"), list(makeSymbol(">="), makeSymbol("VOTES-FOR-COLLECTION"), makeSymbol("VOTES-FOR-INDIVIDUAL")), list(RET, makeKeyword("COLLECTION")), list(RET, makeKeyword("INDIVIDUAL")))));

    static private final SubLSymbol $sym154$HEAD_IN_WORDNET_ = makeSymbol("HEAD-IN-WORDNET?");





    static private final SubLSymbol $sym157$NOUN_COLLECTION_OR_INDIVIDUAL__INT_METHOD = makeSymbol("NOUN-COLLECTION-OR-INDIVIDUAL?-INT-METHOD");

    static private final SubLList $list_alt158 = list(makeSymbol("FORT"));

    static private final SubLList $list_alt159 = list(makeString("@return booleanp; Whether this noun's string is associated with FORT in the lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING"))), makeSymbol("RESULT")), list(makeSymbol("CSOME"), list(makeSymbol("LEX"), makeSymbol("LEXES"), makeSymbol("RESULT")), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("FORT"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT"))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), T))), list(RET, makeSymbol("RESULT"))));



    static private final SubLSymbol $sym161$NOUN_LEXIFIES_FORT__METHOD = makeSymbol("NOUN-LEXIFIES-FORT?-METHOD");



    static private final SubLList $list_alt163 = list(new SubLObject[]{ list(makeSymbol("TOTAL-COUNT-AS-SUBJECT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TOTAL-COUNT-AS-OBJECT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COUNT-AS-OBJECT-BY-VERB"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IN-WORDNET?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPICALITY-SUM-BY-COLLECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE-IN-CALCULATED-TAG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COMPLEX-NOUNS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOTAL-COUNT"), list(makeSymbol("&OPTIONAL"), makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOTAL-COUNT-AS-HEAD-OF-COMPLEX-NOUNS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT-WITH-VERB"), list(makeSymbol("VERB"), makeSymbol("&OPTIONAL"), makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-OCCURRENCE-WITH-VERB"), list(makeSymbol("VERB"), makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IN-WORDNET?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CALCULATED-TAG"), list(makeSymbol("&OPTIONAL"), makeSymbol("RECALCULATE-IF-EXISTS?")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-COUNTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WHY-NOT-TAGGED-AS"), list(makeSymbol("BETTER-TAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-COMPLEX-NOUN"), list(makeSymbol("COMPLEX-NOUN")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("JAVAFY"), list(makeSymbol("&OPTIONAL"), makeSymbol("MAX-RANKING-LENGTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CALCULATE-CONFIDENCE-IN-CALCULATED-TAG"), list(makeSymbol("&OPTIONAL"), makeSymbol("SELECTIVENESS-METRIC")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CFASL-OUTPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")) });



    private static final SubLSymbol CONFIDENCE_IN_CALCULATED_TAG = makeSymbol("CONFIDENCE-IN-CALCULATED-TAG");



    static private final SubLSymbol $sym167$IN_WORDNET_ = makeSymbol("IN-WORDNET?");





    private static final SubLSymbol TOTAL_COUNT_AS_OBJECT = makeSymbol("TOTAL-COUNT-AS-OBJECT");

    private static final SubLSymbol TOTAL_COUNT_AS_SUBJECT = makeSymbol("TOTAL-COUNT-AS-SUBJECT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_NOUN_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-NOUN-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_NOUN_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-NOUN-INSTANCE");

    private static final SubLSymbol SINGLE_WORD_STRING_P = makeSymbol("SINGLE-WORD-STRING-P");

    static private final SubLList $list_alt175 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-SUBJECT"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-OBJECT"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("CSETQ"), makeSymbol("COUNT-AS-OBJECT-BY-VERB"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("CSETQ"), makeSymbol("IN-WORDNET?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("TYPICALITY-SUM-BY-COLLECTION"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE-IN-CALCULATED-TAG"), makeKeyword("DONT-KNOW-YET")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym176$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol SIMPLE_NOUN_INITIALIZE_METHOD = makeSymbol("SIMPLE-NOUN-INITIALIZE-METHOD");

    static private final SubLList $list_alt178 = list(makeString("Reinitialize the cyc-term-valued and keyword-valued slots to :DONT-KNOW-YET.\n   (Don\'t touch the integer-valued slots.)"), list(makeSymbol("REINITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("IN-WORDNET?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("TYPICALITY-SUM-BY-COLLECTION"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE-IN-CALCULATED-TAG"), makeKeyword("DONT-KNOW-YET")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym179$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol SIMPLE_NOUN_REINITIALIZE_METHOD = makeSymbol("SIMPLE-NOUN-REINITIALIZE-METHOD");

    static private final SubLList $list_alt181 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CALCULATED-TAG")))));

    private static final SubLSymbol GET_CALCULATED_TAG = makeSymbol("GET-CALCULATED-TAG");

    private static final SubLSymbol SIMPLE_NOUN_GET_BASIC_TAG_METHOD = makeSymbol("SIMPLE-NOUN-GET-BASIC-TAG-METHOD");

    static private final SubLList $list_alt184 = list(makeSymbol("&OPTIONAL"), makeSymbol("MAX-LENGTH"), makeSymbol("RECALCULATE-IF-EXISTS?"));

    static private final SubLList $list_alt185 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("MAX-LENGTH"), makeSymbol("POSITIVE-INTEGER-P")), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("RECALCULATE-IF-EXISTS?"), list(EQ, makeSymbol("TYPICALITY-SUM-BY-COLLECTION"), makeKeyword("DONT-KNOW-YET"))), list(makeSymbol("CSETQ"), makeSymbol("TYPICALITY-SUM-BY-COLLECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION"))))), list(RET, list(makeSymbol("FIF"), list(makeSymbol("CAND"), makeSymbol("MAX-LENGTH"), list(makeSymbol("LISTP"), makeSymbol("TYPICALITY-SUM-BY-COLLECTION"))), list(makeSymbol("FIRST-N"), makeSymbol("MAX-LENGTH"), makeSymbol("TYPICALITY-SUM-BY-COLLECTION")), makeSymbol("TYPICALITY-SUM-BY-COLLECTION"))));

    static private final SubLSymbol $sym186$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");



    private static final SubLSymbol CALCULATE_TYPICALITY_SUM_BY_COLLECTION = makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION");

    private static final SubLSymbol SIMPLE_NOUN_GET_TAG_RANKING_METHOD = makeSymbol("SIMPLE-NOUN-GET-TAG-RANKING-METHOD");



    static private final SubLList $list_alt191 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("CONFIDENCE-IN-CALCULATED-TAG"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("CONFIDENCE-IN-CALCULATED-TAG"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CALCULATE-CONFIDENCE-IN-CALCULATED-TAG"))))), list(RET, makeSymbol("CONFIDENCE-IN-CALCULATED-TAG")));

    static private final SubLSymbol $sym192$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol CALCULATE_CONFIDENCE_IN_CALCULATED_TAG = makeSymbol("CALCULATE-CONFIDENCE-IN-CALCULATED-TAG");

    private static final SubLSymbol SIMPLE_NOUN_GET_CONFIDENCE_LEVEL_METHOD = makeSymbol("SIMPLE-NOUN-GET-CONFIDENCE-LEVEL-METHOD");

    static private final SubLList $list_alt195 = list(list(makeSymbol("IGNORE"), makeSymbol("IN-WORDNET?")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("IN-WORDNET?")))));

    static private final SubLSymbol $sym196$SIMPLE_NOUN_HEAD_IN_WORDNET__METHOD = makeSymbol("SIMPLE-NOUN-HEAD-IN-WORDNET?-METHOD");



    static private final SubLList $list_alt198 = list(makeSymbol("&OPTIONAL"), makeSymbol("RELATION"));

    static private final SubLList $list_alt199 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("RELATION"), makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P")), list(makeSymbol("PCASE"), makeSymbol("RELATION"), list($SUBJ, list(RET, makeSymbol("TOTAL-COUNT-AS-SUBJECT"))), list(makeKeyword("OBJ"), list(RET, makeSymbol("TOTAL-COUNT-AS-OBJECT"))), list(list(NIL), list(RET, list(makeSymbol("+"), makeSymbol("TOTAL-COUNT-AS-SUBJECT"), makeSymbol("TOTAL-COUNT-AS-OBJECT"))))));

    private static final SubLSymbol NL_STATS_SUPPORTED_VERB_ARG_POSITION_P = makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P");





    private static final SubLSymbol SIMPLE_NOUN_GET_TOTAL_COUNT_METHOD = makeSymbol("SIMPLE-NOUN-GET-TOTAL-COUNT-METHOD");

    private static final SubLSymbol GET_TOTAL_COUNT_AS_HEAD_OF_COMPLEX_NOUNS = makeSymbol("GET-TOTAL-COUNT-AS-HEAD-OF-COMPLEX-NOUNS");

    static private final SubLList $list_alt205 = list(list(RET, list(makeSymbol("-"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))))));

    private static final SubLSymbol SIMPLE_NOUN_GET_TOTAL_COUNT_AS_HEAD_OF_COMPLEX_NOUNS_METHOD = makeSymbol("SIMPLE-NOUN-GET-TOTAL-COUNT-AS-HEAD-OF-COMPLEX-NOUNS-METHOD");

    private static final SubLSymbol GET_COUNT_WITH_VERB = makeSymbol("GET-COUNT-WITH-VERB");

    static private final SubLList $list_alt208 = list(makeSymbol("VERB"), makeSymbol("&OPTIONAL"), makeSymbol("RELATION"));

    static private final SubLList $list_alt209 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("VERB"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("RELATION"), makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P")), list(makeSymbol("PCASE"), makeSymbol("RELATION"), list($SUBJ, list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), makeSymbol("VERB"), ZERO_INTEGER))), list(makeKeyword("OBJ"), list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("COUNT-AS-OBJECT-BY-VERB"), makeSymbol("VERB"), ZERO_INTEGER))), list(list(NIL), list(RET, list(makeSymbol("+"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COUNT-WITH-VERB")), makeSymbol("VERB"), $SUBJ), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COUNT-WITH-VERB")), makeSymbol("VERB"), makeKeyword("OBJ")))))));



    private static final SubLSymbol SIMPLE_NOUN_GET_COUNT_WITH_VERB_METHOD = makeSymbol("SIMPLE-NOUN-GET-COUNT-WITH-VERB-METHOD");

    private static final SubLSymbol RECORD_OCCURRENCE_WITH_VERB = makeSymbol("RECORD-OCCURRENCE-WITH-VERB");

    static private final SubLList $list_alt213 = list(makeSymbol("VERB"), makeSymbol("RELATION"));

    static private final SubLList $list_alt214 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("VERB"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("RELATION"), makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P")), list(makeSymbol("PCASE"), makeSymbol("RELATION"), list($SUBJ, list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-SUBJECT"), list(makeSymbol("+"), makeSymbol("TOTAL-COUNT-AS-SUBJECT"), ONE_INTEGER)), list(makeSymbol("DICTIONARY-INCREMENT"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), makeSymbol("VERB"))), list(makeKeyword("OBJ"), list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COUNT-AS-OBJECT"), list(makeSymbol("+"), makeSymbol("TOTAL-COUNT-AS-OBJECT"), ONE_INTEGER)), list(makeSymbol("DICTIONARY-INCREMENT"), makeSymbol("COUNT-AS-OBJECT-BY-VERB"), makeSymbol("VERB")))), list(RET, NIL));

    static private final SubLSymbol $sym215$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol SIMPLE_NOUN_RECORD_OCCURRENCE_WITH_VERB_METHOD = makeSymbol("SIMPLE-NOUN-RECORD-OCCURRENCE-WITH-VERB-METHOD");

    static private final SubLList $list_alt217 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("IN-WORDNET?"), makeKeyword("DONT-KNOW-YET")), list(makeSymbol("CSETQ"), makeSymbol("IN-WORDNET?"), list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-WORDNET"), list(makeSymbol("WORDNET-WORD-P"), makeSymbol("STRING"), $NOUN)))), list(RET, makeSymbol("IN-WORDNET?")));

    static private final SubLSymbol $sym218$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    static private final SubLSymbol $sym219$SIMPLE_NOUN_IN_WORDNET__METHOD = makeSymbol("SIMPLE-NOUN-IN-WORDNET?-METHOD");

    static private final SubLList $list_alt220 = list(makeSymbol("&OPTIONAL"), makeSymbol("RECALCULATE-IF-EXISTS?"));

    static private final SubLList $list_alt221 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TOP-N-TAGS")), ONE_INTEGER, makeSymbol("RECALCULATE-IF-EXISTS?")))), list(makeSymbol("PIF"), list(makeSymbol("KEYWORDP"), makeSymbol("RESULT")), list(RET, makeSymbol("RESULT")), list(RET, list(makeSymbol("FIRST"), makeSymbol("RESULT"))))));

    private static final SubLSymbol SIMPLE_NOUN_GET_CALCULATED_TAG_METHOD = makeSymbol("SIMPLE-NOUN-GET-CALCULATED-TAG-METHOD");

    private static final SubLSymbol PRINT_COUNTS = makeSymbol("PRINT-COUNTS");

    static private final SubLList $list_alt224 = list(list(makeSymbol("FORMAT"), T, makeString("~&Counts by verb for ~S~%"), makeSymbol("STRING")), list(makeSymbol("FORMAT"), T, makeString("~%As subject:~%")), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB")), list(makeSymbol("FORMAT"), T, makeString("~S -> ~S   (selectiveness: ~S)~%"), makeSymbol("VERB"), makeSymbol("COUNT"), list(makeSymbol("SELECTIVENESS-WRT-SUBJECT"), makeSymbol("VERB")))), list(makeSymbol("FORMAT"), T, makeString("~%As object:~%")), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("COUNT-AS-OBJECT-BY-VERB")), list(makeSymbol("FORMAT"), T, makeString("~S -> ~S   (selectiveness: ~S)~%"), makeSymbol("VERB"), makeSymbol("COUNT"), list(makeSymbol("SELECTIVENESS-WRT-OBJECT"), makeSymbol("VERB")))), list(RET, NIL));

    static private final SubLString $str_alt225$__Counts_by_verb_for__S__ = makeString("~&Counts by verb for ~S~%");

    static private final SubLString $str_alt226$__As_subject___ = makeString("~%As subject:~%");

    static private final SubLString $str_alt227$_S_____S____selectiveness___S___ = makeString("~S -> ~S   (selectiveness: ~S)~%");

    static private final SubLString $str_alt228$__As_object___ = makeString("~%As object:~%");

    private static final SubLSymbol SIMPLE_NOUN_PRINT_COUNTS_METHOD = makeSymbol("SIMPLE-NOUN-PRINT-COUNTS-METHOD");

    private static final SubLSymbol WHY_NOT_TAGGED_AS = makeSymbol("WHY-NOT-TAGGED-AS");

    static private final SubLList $list_alt231 = list(makeSymbol("BETTER-TAG"));

    static private final SubLList $list_alt232 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("LEARNED"), list(QUOTE, makeSymbol("WHY-NOT-TAGGED-AS-INT")), makeSymbol("SELF"), makeSymbol("BETTER-TAG"))));

    private static final SubLSymbol WHY_NOT_TAGGED_AS_INT = makeSymbol("WHY-NOT-TAGGED-AS-INT");

    private static final SubLSymbol SIMPLE_NOUN_WHY_NOT_TAGGED_AS_METHOD = makeSymbol("SIMPLE-NOUN-WHY-NOT-TAGGED-AS-METHOD");

    private static final SubLSymbol LINK_COMPLEX_NOUN = makeSymbol("LINK-COMPLEX-NOUN");

    static private final SubLList $list_alt236 = list(makeSymbol("COMPLEX-NOUN"));

    static private final SubLList $list_alt237 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("COMPLEX-NOUN"), makeSymbol("COMPLEX-NOUN-P")), list(makeSymbol("CPUSH"), makeSymbol("COMPLEX-NOUN"), makeSymbol("COMPLEX-NOUNS")), list(RET, NIL));

    static private final SubLSymbol $sym238$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol COMPLEX_NOUN_P = makeSymbol("COMPLEX-NOUN-P");

    private static final SubLSymbol SIMPLE_NOUN_LINK_COMPLEX_NOUN_METHOD = makeSymbol("SIMPLE-NOUN-LINK-COMPLEX-NOUN-METHOD");

    private static final SubLSymbol GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN = makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN");

    static private final SubLList $list_alt242 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("COMPLEX-NOUNS"))));

    private static final SubLSymbol SIMPLE_NOUN_GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN_METHOD = makeSymbol("SIMPLE-NOUN-GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN-METHOD");

    private static final SubLSymbol JAVAFY = makeSymbol("JAVAFY");

    static private final SubLList $list_alt245 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MAX-RANKING-LENGTH"), makeInteger(200)));

    static private final SubLList $list_alt246 = list(makeString("Meant to be called by the noun learner tool, written in java.\n   @return listp; (complex?, string, status-in-cyc, refined-tag, conjecture-ranking, confidence-level, collection?,\n                   complex-noun-strings, count-as-subject-by-verb, count-as-object-by-verb)\n   The conjecture ranking will have a length of at most MAX-RANKING-LENGTH"), list(makeSymbol("IGNORE"), makeSymbol("COLLECTION-OR-INDIVIDUAL?")), list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTION?"), list(EQ, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?"))), makeKeyword("COLLECTION"))), list(makeSymbol("COMPLEX-NOUN-STRINGS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN")))), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("COMPLEX-NOUN-STRINGS"))), list(RET, list(new SubLObject[]{ makeSymbol("LIST"), NIL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TAG-RANKING")), makeSymbol("MAX-RANKING-LENGTH")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL"))), makeSymbol("COLLECTION?"), list(makeSymbol("NREVERSE"), makeSymbol("COMPLEX-NOUN-STRINGS")), list(makeSymbol("DICTIONARY-TO-ALIST"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB")), list(makeSymbol("DICTIONARY-TO-ALIST"), makeSymbol("COUNT-AS-OBJECT-BY-VERB")) }))));

    public static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol SIMPLE_NOUN_JAVAFY_METHOD = makeSymbol("SIMPLE-NOUN-JAVAFY-METHOD");

    static private final SubLList $list_alt249 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("LEARNED"), list(QUOTE, makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION")), makeSymbol("SELF"))));

    private static final SubLSymbol SIMPLE_NOUN_CALCULATE_TYPICALITY_SUM_BY_COLLECTION_METHOD = makeSymbol("SIMPLE-NOUN-CALCULATE-TYPICALITY-SUM-BY-COLLECTION-METHOD");

    static private final SubLList $list_alt251 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("SELECTIVENESS-METRIC"), list(makeSymbol("FUNCTION"), makeSymbol("SELECTIVENESS"))));

    static private final SubLList $list_alt252 = list(makeString("Measure how confident we should be in the tag that we calculate for this simple noun.\n   Our confidence is a function of the selectiveness of the verbs with which the noun occurred.\n   More specifically, it\'s the product of:\n     the sum of the selectiveness values for all verbs with which the noun occurred, and\n     the selectiveness value of the most selective verb with which the noun occurred."), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTIVENESS-SUM"), ZERO_INTEGER), list(makeSymbol("SELECTIVENESS-MAX"), ZERO_INTEGER)), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB")), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTIVENESS"), list(makeSymbol("FUNCALL"), makeSymbol("SELECTIVENESS-METRIC"), makeSymbol("VERB"), $SUBJ))), list(makeSymbol("PWHEN"), makeSymbol("SELECTIVENESS"), list(makeSymbol("CSETQ"), makeSymbol("SELECTIVENESS-SUM"), list(makeSymbol("+"), makeSymbol("SELECTIVENESS-SUM"), list(makeSymbol("*"), makeSymbol("SELECTIVENESS"), makeSymbol("COUNT")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("SELECTIVENESS"), makeSymbol("SELECTIVENESS-MAX")), list(makeSymbol("CSETQ"), makeSymbol("SELECTIVENESS-MAX"), makeSymbol("SELECTIVENESS")))))), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("COUNT-AS-OBJECT-BY-VERB")), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTIVENESS"), list(makeSymbol("FUNCALL"), makeSymbol("SELECTIVENESS-METRIC"), makeSymbol("VERB"), makeKeyword("OBJ")))), list(makeSymbol("PWHEN"), makeSymbol("SELECTIVENESS"), list(makeSymbol("CSETQ"), makeSymbol("SELECTIVENESS-SUM"), list(makeSymbol("+"), makeSymbol("SELECTIVENESS-SUM"), list(makeSymbol("*"), makeSymbol("SELECTIVENESS"), makeSymbol("COUNT")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("SELECTIVENESS"), makeSymbol("SELECTIVENESS-MAX")), list(makeSymbol("CSETQ"), makeSymbol("SELECTIVENESS-MAX"), makeSymbol("SELECTIVENESS")))))), list(RET, list(makeSymbol("*"), makeSymbol("SELECTIVENESS-SUM"), makeSymbol("SELECTIVENESS-MAX")))));



    static private final SubLSymbol $sym254$OUTER_CATCH_FOR_SIMPLE_NOUN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-NOUN-METHOD");

    private static final SubLSymbol SIMPLE_NOUN_CALCULATE_CONFIDENCE_IN_CALCULATED_TAG_METHOD = makeSymbol("SIMPLE-NOUN-CALCULATE-CONFIDENCE-IN-CALCULATED-TAG-METHOD");



    static private final SubLList $list_alt257 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt258 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt259 = list(makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   This overrides the default serialization for instances.  This is in order to avoid the recursion that would otherwise\n   result, since each noun has a reference to a learned-noun that refers back to it, and there are circular\n   references among complex nouns and their heads."), list(makeSymbol("PWHEN"), makeSymbol("*WARN-ABOUT-NOUN-SERIALIZATION?*"), list(makeSymbol("WARN"), makeString("CFASL-OUTPUT called on a NOUN.  It will not be the same on deserialization."))), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("CLASS-NAME"), makeSymbol("STREAM")), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("APPEND"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("INSTANCE-NUMBER")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("LEARNED")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CLET"), list(list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("LENGTH"), makeSymbol("INSTANCE-SLOTS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("STREAM")), list(makeSymbol("CDOSLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("INSTANCE-SLOTS")), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-VALUE"), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-GET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("SELF"))))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("SLOT-NAME"), list(QUOTE, makeSymbol("COMPLEX-NOUNS"))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUNS-AS-STRINGS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUN"), makeSymbol("SLOT-VALUE")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("COMPLEX-NOUNS-AS-STRINGS"))), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("NREVERSE"), makeSymbol("COMPLEX-NOUNS-AS-STRINGS"))))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-NAME"), makeSymbol("STREAM")), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-VALUE"), makeSymbol("STREAM")))))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt260$CFASL_OUTPUT_called_on_a_NOUN___I = makeString("CFASL-OUTPUT called on a NOUN.  It will not be the same on deserialization.");





    private static final SubLSymbol SIMPLE_NOUN_CFASL_OUTPUT_METHOD = makeSymbol("SIMPLE-NOUN-CFASL-OUTPUT-METHOD");



    static private final SubLList $list_alt265 = list(list(makeSymbol("HEAD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CFASL-OUTPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("JAVAFY"), list(makeSymbol("&OPTIONAL"), makeSymbol("MAX-RANKING-LENGTH")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPLEX_NOUN_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPLEX-NOUN-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPLEX_NOUN_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPLEX-NOUN-INSTANCE");

    private static final SubLSymbol MULTI_WORD_STRING = makeSymbol("MULTI-WORD-STRING");

    static private final SubLList $list_alt270 = list(list(makeSymbol("PIF"), list(makeSymbol("<"), makeSymbol("TOTAL-COUNT-AS-WHOLE-NOUN"), list(makeSymbol("FIM"), makeSymbol("LEARNED"), list(QUOTE, makeSymbol("GET-NOUN-RELEVANCE-COUNT-THRESHOLD")))), list(RET, makeKeyword("DONT-CARE")), list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))))));

    private static final SubLSymbol GET_NOUN_RELEVANCE_COUNT_THRESHOLD = makeSymbol("GET-NOUN-RELEVANCE-COUNT-THRESHOLD");

    private static final SubLSymbol COMPLEX_NOUN_GET_BASIC_TAG_METHOD = makeSymbol("COMPLEX-NOUN-GET-BASIC-TAG-METHOD");

    static private final SubLList $list_alt273 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-TAG-RANKING")), makeSymbol("MAX-LENGTH"), makeSymbol("RECALCULATE-IF-EXISTS?"))));

    private static final SubLSymbol COMPLEX_NOUN_GET_TAG_RANKING_METHOD = makeSymbol("COMPLEX-NOUN-GET-TAG-RANKING-METHOD");

    static private final SubLList $list_alt275 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))));

    private static final SubLSymbol COMPLEX_NOUN_GET_CONFIDENCE_LEVEL_METHOD = makeSymbol("COMPLEX-NOUN-GET-CONFIDENCE-LEVEL-METHOD");

    static private final SubLList $list_alt277 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("IN-WORDNET?")))));

    static private final SubLSymbol $sym278$COMPLEX_NOUN_HEAD_IN_WORDNET__METHOD = makeSymbol("COMPLEX-NOUN-HEAD-IN-WORDNET?-METHOD");



    static private final SubLList $list_alt280 = list(list(RET, makeSymbol("HEAD")));

    private static final SubLSymbol COMPLEX_NOUN_GET_HEAD_METHOD = makeSymbol("COMPLEX-NOUN-GET-HEAD-METHOD");

    static private final SubLList $list_alt282 = list(makeString("The conjecture ranking will have a length of at most MAX-RANKING-LENGTH"), list(makeSymbol("IGNORE"), makeSymbol("COLLECTION-OR-INDIVIDUAL?")), list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTION?"), list(EQ, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?"))), makeKeyword("COLLECTION")))), list(RET, list(new SubLObject[]{ makeSymbol("LIST"), T, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TAG-RANKING")), makeSymbol("MAX-RANKING-LENGTH")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL"))), makeSymbol("COLLECTION?"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-HEAD"))), list(QUOTE, makeSymbol("GET-STRING"))), list(makeSymbol("DICTIONARY-TO-ALIST"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-SUBJECT-BY-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("DICTIONARY-TO-ALIST"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-OBJECT-BY-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-HEAD"))))) }))));

    private static final SubLSymbol COMPLEX_NOUN_JAVAFY_METHOD = makeSymbol("COMPLEX-NOUN-JAVAFY-METHOD");

    static private final SubLList $list_alt284 = list(makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   This overrides the default serialization for instances.  This is in order to avoid the recursion that would otherwise\n   result, since each noun has a reference to a learned-noun that refers back to it, and there are circular\n   references among complex nouns and their heads."), list(makeSymbol("PWHEN"), makeSymbol("*WARN-ABOUT-NOUN-SERIALIZATION?*"), list(makeSymbol("WARN"), makeString("CFASL-OUTPUT called on a NOUN.  It will not be the same on deserialization."))), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CLASS-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("CLASS-NAME"), makeSymbol("STREAM")), list(makeSymbol("WITH-CLASS"), makeSymbol("CLASS"), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("APPEND"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("INSTANCE-NUMBER")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("DELETE"), list(QUOTE, makeSymbol("LEARNED")), makeSymbol("INSTANCE-SLOTS"), list(makeSymbol("FUNCTION"), EQ), list(QUOTE, makeSymbol("SLOT-NAME")))), list(makeSymbol("CLET"), list(list(makeSymbol("NUMBER-OF-SLOTS"), list(makeSymbol("LENGTH"), makeSymbol("INSTANCE-SLOTS")))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("NUMBER-OF-SLOTS"), makeSymbol("STREAM")), list(makeSymbol("CDOSLOTS"), list(makeSymbol("SLOT-NAME"), NIL, NIL, NIL, NIL, makeSymbol("INSTANCE-SLOTS")), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-VALUE"), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-GET-SLOT")), list(makeSymbol("BQ-LIST"), makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("SELF"))))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("SLOT-NAME"), list(QUOTE, makeSymbol("HEAD"))), list(makeSymbol("CSETQ"), makeSymbol("SLOT-VALUE"), list(makeSymbol("FIM"), makeSymbol("SLOT-VALUE"), list(QUOTE, makeSymbol("GET-STRING"))))), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-NAME"), makeSymbol("STREAM")), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SLOT-VALUE"), makeSymbol("STREAM")))))))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol COMPLEX_NOUN_CFASL_OUTPUT_METHOD = makeSymbol("COMPLEX-NOUN-CFASL-OUTPUT-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_noun_learner_noun_classes_file();
    }

    public void initializeVariables() {
        init_noun_learner_noun_classes_file();
    }

    public void runTopLevelForms() {
        setup_noun_learner_noun_classes_file();
    }
}


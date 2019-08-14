/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-LEXIFIER
 *  source file: /cyc/top/cycl/cyblack/cyblack-lexifier.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_lexifier extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_lexifier() {
    }

    public static final SubLFile me = new cyblack_lexifier();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_lexifier";

    // // Definitions
    public static final SubLObject cyblack_lexeme_p(SubLObject cyblack_lexeme) {
        return interfaces.subloop_instanceof_interface(cyblack_lexeme, CYBLACK_LEXEME);
    }

    public static final SubLObject get_cyblack_basic_lexeme_category(SubLObject cyblack_basic_lexeme) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexeme, TWO_INTEGER, CATEGORY);
    }

    public static final SubLObject set_cyblack_basic_lexeme_category(SubLObject cyblack_basic_lexeme, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexeme, value, TWO_INTEGER, CATEGORY);
    }

    public static final SubLObject get_cyblack_basic_lexeme_token(SubLObject cyblack_basic_lexeme) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexeme, ONE_INTEGER, TOKEN);
    }

    public static final SubLObject set_cyblack_basic_lexeme_token(SubLObject cyblack_basic_lexeme, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexeme, value, ONE_INTEGER, TOKEN);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lexeme_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lexeme_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXEME, TOKEN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXEME, CATEGORY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_lexeme_p(SubLObject cyblack_basic_lexeme) {
        return classes.subloop_instanceof_class(cyblack_basic_lexeme, CYBLACK_BASIC_LEXEME);
    }

    public static final SubLObject cyblack_basic_lexeme_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_lexeme_method = NIL;
            SubLObject category = get_cyblack_basic_lexeme_category(self);
            SubLObject token = get_cyblack_basic_lexeme_token(self);
            try {
                try {
                    object.object_initialize_method(self);
                    token = NIL;
                    category = NIL;
                    sublisp_throw($sym16$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexeme_category(self, category);
                            set_cyblack_basic_lexeme_token(self, token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexeme_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD);
            }
            return catch_var_for_cyblack_basic_lexeme_method;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject category = get_cyblack_basic_lexeme_category(self);
            SubLObject token = get_cyblack_basic_lexeme_token(self);
            format(stream, $str_alt22$__LEXEME__token__S__category__S_, token, category);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_get_token_method(SubLObject self) {
        {
            SubLObject token = get_cyblack_basic_lexeme_token(self);
            return token;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_set_token_method(SubLObject self, SubLObject new_token) {
        {
            SubLObject catch_var_for_cyblack_basic_lexeme_method = NIL;
            SubLObject token = get_cyblack_basic_lexeme_token(self);
            try {
                try {
                    token = new_token;
                    sublisp_throw($sym31$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD, new_token);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexeme_token(self, token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexeme_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD);
            }
            return catch_var_for_cyblack_basic_lexeme_method;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_get_category_method(SubLObject self) {
        {
            SubLObject category = get_cyblack_basic_lexeme_category(self);
            return category;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_set_category_method(SubLObject self, SubLObject new_category) {
        {
            SubLObject catch_var_for_cyblack_basic_lexeme_method = NIL;
            SubLObject category = get_cyblack_basic_lexeme_category(self);
            try {
                try {
                    category = new_category;
                    sublisp_throw($sym39$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD, new_category);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexeme_category(self, category);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexeme_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD);
            }
            return catch_var_for_cyblack_basic_lexeme_method;
        }
    }

    public static final SubLObject cyblack_basic_lexeme_to_association_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_lexeme_method = NIL;
            SubLObject category = get_cyblack_basic_lexeme_category(self);
            SubLObject token = get_cyblack_basic_lexeme_token(self);
            try {
                try {
                    if ((NIL != token) && (NIL != category)) {
                        sublisp_throw($sym43$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD, list(token, category));
                    }
                    sublisp_throw($sym43$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexeme_category(self, category);
                            set_cyblack_basic_lexeme_token(self, token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexeme_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD);
            }
            return catch_var_for_cyblack_basic_lexeme_method;
        }
    }

    public static final SubLObject cyblack_lexifier_p(SubLObject v_cyblack_lexifier) {
        return interfaces.subloop_instanceof_interface(v_cyblack_lexifier, CYBLACK_LEXIFIER);
    }

    public static final SubLObject get_cyblack_basic_lexifier_source(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, SIX_INTEGER, SOURCE);
    }

    public static final SubLObject set_cyblack_basic_lexifier_source(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, SIX_INTEGER, SOURCE);
    }

    public static final SubLObject get_cyblack_basic_lexifier_categories(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, FIVE_INTEGER, CATEGORIES);
    }

    public static final SubLObject set_cyblack_basic_lexifier_categories(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, FIVE_INTEGER, CATEGORIES);
    }

    public static final SubLObject get_cyblack_basic_lexifier_state(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, FOUR_INTEGER, STATE);
    }

    public static final SubLObject set_cyblack_basic_lexifier_state(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, FOUR_INTEGER, STATE);
    }

    public static final SubLObject get_cyblack_basic_lexifier_token_classifier(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, THREE_INTEGER, TOKEN_CLASSIFIER);
    }

    public static final SubLObject set_cyblack_basic_lexifier_token_classifier(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, THREE_INTEGER, TOKEN_CLASSIFIER);
    }

    public static final SubLObject get_cyblack_basic_lexifier_token_reader(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, TWO_INTEGER, TOKEN_READER);
    }

    public static final SubLObject set_cyblack_basic_lexifier_token_reader(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, TWO_INTEGER, TOKEN_READER);
    }

    public static final SubLObject get_cyblack_basic_lexifier_lexeme_class(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lexifier, ONE_INTEGER, LEXEME_CLASS);
    }

    public static final SubLObject set_cyblack_basic_lexifier_lexeme_class(SubLObject cyblack_basic_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lexifier, value, ONE_INTEGER, LEXEME_CLASS);
    }

    public static final SubLObject get_cyblack_basic_lexifier_default_lexeme_class(SubLObject cyblack_basic_lexifier) {
        {
            SubLObject v_class = (cyblack_basic_lexifier.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_lexifier))) : NIL != subloop_structures.class_p(cyblack_basic_lexifier) ? ((SubLObject) (cyblack_basic_lexifier)) : NIL != subloop_structures.instance_p(cyblack_basic_lexifier) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_lexifier))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_LEXEME_CLASS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_basic_lexifier_default_lexeme_class(SubLObject cyblack_basic_lexifier, SubLObject value) {
        {
            SubLObject v_class = (cyblack_basic_lexifier.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_lexifier))) : NIL != subloop_structures.class_p(cyblack_basic_lexifier) ? ((SubLObject) (cyblack_basic_lexifier)) : NIL != subloop_structures.instance_p(cyblack_basic_lexifier) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_lexifier))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_LEXEME_CLASS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lexifier_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXEME);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lexifier_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, LEXEME_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_READER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_CLASSIFIER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_lexifier_p(SubLObject cyblack_basic_lexifier) {
        return classes.subloop_instanceof_class(cyblack_basic_lexifier, CYBLACK_BASIC_LEXIFIER);
    }

    public static final SubLObject cyblack_basic_lexifier_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject source = get_cyblack_basic_lexifier_source(self);
            SubLObject categories = get_cyblack_basic_lexifier_categories(self);
            SubLObject state = get_cyblack_basic_lexifier_state(self);
            SubLObject token_classifier = get_cyblack_basic_lexifier_token_classifier(self);
            SubLObject token_reader = get_cyblack_basic_lexifier_token_reader(self);
            SubLObject lexeme_class = get_cyblack_basic_lexifier_lexeme_class(self);
            try {
                try {
                    object.object_initialize_method(self);
                    lexeme_class = NIL;
                    token_reader = NIL;
                    token_classifier = NIL;
                    state = NIL;
                    categories = NIL;
                    source = NIL;
                    sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_source(self, source);
                            set_cyblack_basic_lexifier_categories(self, categories);
                            set_cyblack_basic_lexifier_state(self, state);
                            set_cyblack_basic_lexifier_token_classifier(self, token_classifier);
                            set_cyblack_basic_lexifier_token_reader(self, token_reader);
                            set_cyblack_basic_lexifier_lexeme_class(self, lexeme_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        object.object_print_method(self, stream, depth);
        return self;
    }

    public static final SubLObject cyblack_basic_lexifier_get_default_lexeme_class_method(SubLObject self) {
        {
            SubLObject default_lexeme_class = get_cyblack_basic_lexifier_default_lexeme_class(self);
            return default_lexeme_class;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_default_lexeme_class_method(SubLObject self, SubLObject new_default_lexeme_class) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject default_lexeme_class = get_cyblack_basic_lexifier_default_lexeme_class(self);
            try {
                try {
                    default_lexeme_class = new_default_lexeme_class;
                    sublisp_throw($sym70$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_default_lexeme_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_default_lexeme_class(self, default_lexeme_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    /**
     * Returns the class of lexeme to be returned by NEW-LEXEME and GET-LEXEME.  If the
     * LEXEME-CLASS slot has a value other than NIL, that value is returned, otherwise the
     * value of the class slot DEFAULT-LEXEME-CLASS is returned.
     */
    public static final SubLObject cyblack_basic_lexifier_get_lexeme_class_method(SubLObject self) {
        {
            SubLObject default_lexeme_class = get_cyblack_basic_lexifier_default_lexeme_class(self);
            SubLObject lexeme_class = get_cyblack_basic_lexifier_lexeme_class(self);
            return NIL != lexeme_class ? ((SubLObject) (lexeme_class)) : default_lexeme_class;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_lexeme_class_method(SubLObject self, SubLObject new_lexeme_class) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject lexeme_class = get_cyblack_basic_lexifier_lexeme_class(self);
            try {
                try {
                    lexeme_class = new_lexeme_class;
                    sublisp_throw($sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_lexeme_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_lexeme_class(self, lexeme_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_get_token_reader_method(SubLObject self) {
        {
            SubLObject token_reader = get_cyblack_basic_lexifier_token_reader(self);
            return token_reader;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_token_reader_method(SubLObject self, SubLObject new_token_reader) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject token_reader = get_cyblack_basic_lexifier_token_reader(self);
            try {
                try {
                    token_reader = new_token_reader;
                    sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_token_reader);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_token_reader(self, token_reader);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_get_token_classifier_method(SubLObject self) {
        {
            SubLObject token_classifier = get_cyblack_basic_lexifier_token_classifier(self);
            return token_classifier;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_token_classifier_method(SubLObject self, SubLObject new_token_classifier) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject token_classifier = get_cyblack_basic_lexifier_token_classifier(self);
            try {
                try {
                    token_classifier = new_token_classifier;
                    sublisp_throw($sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_token_classifier);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_token_classifier(self, token_classifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    /**
     * Returns a new instance of the class returned by GET-LEXEME-CLASS.
     */
    public static final SubLObject cyblack_basic_lexifier_new_lexeme_method(SubLObject self) {
        return object.new_class_instance(cyblack_basic_lexifier_get_lexeme_class_method(self));
    }

    /**
     * Gets the next token, looks up its category, creates a LEXEME using an instance returned
     * by NEW-LEXEME, sets the token and category of this new lexeme, and the returns the LEXEME.
     * If GET-TOKEN returns NIL, this method returns NIL.
     */
    public static final SubLObject cyblack_basic_lexifier_get_lexeme_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject default_lexeme_class = get_cyblack_basic_lexifier_default_lexeme_class(self);
            SubLObject state = get_cyblack_basic_lexifier_state(self);
            SubLObject token_classifier = get_cyblack_basic_lexifier_token_classifier(self);
            SubLObject token_reader = get_cyblack_basic_lexifier_token_reader(self);
            SubLObject lexeme_class = get_cyblack_basic_lexifier_lexeme_class(self);
            try {
                try {
                    if ((((NIL != default_lexeme_class) || (NIL != lexeme_class)) && (NIL != token_reader)) && (NIL != token_classifier)) {
                        {
                            SubLObject next_token = NIL;
                            SubLObject token_category = NIL;
                            if (NIL != state) {
                                if (NIL != subloop_structures.instance_p(state)) {
                                    next_token = methods.funcall_instance_method_with_0_args(state, token_reader);
                                    token_category = (NIL != next_token) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(state, token_classifier, next_token))) : NIL;
                                } else {
                                    next_token = funcall(token_reader, state);
                                    token_category = (NIL != next_token) ? ((SubLObject) (funcall(token_classifier, state, next_token))) : NIL;
                                }
                            } else {
                                next_token = funcall(token_reader);
                                token_category = (NIL != next_token) ? ((SubLObject) (funcall(token_classifier, next_token))) : NIL;
                            }
                            if (NIL != next_token) {
                                {
                                    SubLObject lexeme = cyblack_basic_lexifier_new_lexeme_method(self);
                                    methods.funcall_instance_method_with_1_args(lexeme, SET_TOKEN, next_token);
                                    methods.funcall_instance_method_with_1_args(lexeme, SET_CATEGORY, token_category);
                                    sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, lexeme);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_default_lexeme_class(self, default_lexeme_class);
                            set_cyblack_basic_lexifier_state(self, state);
                            set_cyblack_basic_lexifier_token_classifier(self, token_classifier);
                            set_cyblack_basic_lexifier_token_reader(self, token_reader);
                            set_cyblack_basic_lexifier_lexeme_class(self, lexeme_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_get_state_method(SubLObject self) {
        {
            SubLObject state = get_cyblack_basic_lexifier_state(self);
            return state;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_state_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject state = get_cyblack_basic_lexifier_state(self);
            try {
                try {
                    state = new_state;
                    sublisp_throw($sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_state(self, state);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_get_categories_method(SubLObject self) {
        {
            SubLObject categories = get_cyblack_basic_lexifier_categories(self);
            return categories;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_categories_method(SubLObject self, SubLObject new_categories) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject categories = get_cyblack_basic_lexifier_categories(self);
            try {
                try {
                    categories = copy_list(new_categories);
                    sublisp_throw($sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_categories);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_categories(self, categories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_get_souce_method(SubLObject self) {
        {
            SubLObject source = get_cyblack_basic_lexifier_source(self);
            return source;
        }
    }

    public static final SubLObject cyblack_basic_lexifier_set_source_method(SubLObject self, SubLObject new_source) {
        {
            SubLObject catch_var_for_cyblack_basic_lexifier_method = NIL;
            SubLObject source = get_cyblack_basic_lexifier_source(self);
            try {
                try {
                    source = new_source;
                    sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD, new_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lexifier_source(self, source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD);
            }
            return catch_var_for_cyblack_basic_lexifier_method;
        }
    }

    /**
     * The implementation of this method depends upon the nature of the value
     * of the SOURCE slot.  If one needs to perform some task on SOURCE in
     * or to prepare it for use, the code for that task should be specified
     * in the method that overrides this OPEN-SOURCE method.  For example,
     * if your derived class places a stream in SOURCE, you may need to override
     * this method to open the stream.  If your derived class uses a list,
     * then you may need to set a pointer to the head of the list.
     */
    public static final SubLObject cyblack_basic_lexifier_open_source_method(SubLObject self) {
        return NIL;
    }

    /**
     * Override to provide cleanup functionality for terminating access of
     * SOURCE.
     */
    public static final SubLObject cyblack_basic_lexifier_close_souce_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_test_lexifier_input_list_pointer(SubLObject test_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(test_lexifier, EIGHT_INTEGER, INPUT_LIST_POINTER);
    }

    public static final SubLObject set_test_lexifier_input_list_pointer(SubLObject test_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_lexifier, value, EIGHT_INTEGER, INPUT_LIST_POINTER);
    }

    public static final SubLObject get_test_lexifier_lexicon(SubLObject test_lexifier) {
        return classes.subloop_get_access_protected_instance_slot(test_lexifier, SEVEN_INTEGER, LEXICON);
    }

    public static final SubLObject set_test_lexifier_lexicon(SubLObject test_lexifier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_lexifier, value, SEVEN_INTEGER, LEXICON);
    }

    public static final SubLObject subloop_reserved_initialize_test_lexifier_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXEME);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_lexifier_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, LEXEME_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_READER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_CLASSIFIER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_LEXIFIER, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_LEXIFIER, INPUT_LIST_POINTER, NIL);
        return NIL;
    }

    public static final SubLObject test_lexifier_p(SubLObject test_lexifier) {
        return classes.subloop_instanceof_class(test_lexifier, TEST_LEXIFIER);
    }

    public static final SubLObject test_lexifier_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject input_list_pointer = get_test_lexifier_input_list_pointer(self);
            SubLObject lexicon = get_test_lexifier_lexicon(self);
            SubLObject state = get_cyblack_basic_lexifier_state(self);
            SubLObject token_classifier = get_cyblack_basic_lexifier_token_classifier(self);
            SubLObject token_reader = get_cyblack_basic_lexifier_token_reader(self);
            SubLObject lexeme_class = get_cyblack_basic_lexifier_lexeme_class(self);
            try {
                try {
                    cyblack_basic_lexifier_initialize_method(self);
                    lexeme_class = NIL;
                    token_reader = GET_NEXT_TOKEN;
                    token_classifier = LOOK_UP_CATEGORY;
                    state = self;
                    lexicon = $list_alt143;
                    input_list_pointer = NIL;
                    sublisp_throw($sym140$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_input_list_pointer(self, input_list_pointer);
                            set_test_lexifier_lexicon(self, lexicon);
                            set_cyblack_basic_lexifier_state(self, state);
                            set_cyblack_basic_lexifier_token_classifier(self, token_classifier);
                            set_cyblack_basic_lexifier_token_reader(self, token_reader);
                            set_cyblack_basic_lexifier_lexeme_class(self, lexeme_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject test_lexifier_get_lexicon_method(SubLObject self) {
        {
            SubLObject lexicon = get_test_lexifier_lexicon(self);
            return lexicon;
        }
    }

    public static final SubLObject test_lexifier_set_lexicon_method(SubLObject self, SubLObject new_lexicon) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject input_list_pointer = get_test_lexifier_input_list_pointer(self);
            SubLObject lexicon = get_test_lexifier_lexicon(self);
            try {
                try {
                    lexicon = new_lexicon;
                    input_list_pointer = NIL;
                    sublisp_throw($sym151$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, lexicon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_input_list_pointer(self, input_list_pointer);
                            set_test_lexifier_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject test_lexifier_open_source_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject input_list_pointer = get_test_lexifier_input_list_pointer(self);
            SubLObject source = get_cyblack_basic_lexifier_source(self);
            try {
                try {
                    input_list_pointer = source;
                    sublisp_throw($sym154$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_input_list_pointer(self, input_list_pointer);
                            set_cyblack_basic_lexifier_source(self, source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject test_lexifier_close_souce_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject input_list_pointer = get_test_lexifier_input_list_pointer(self);
            try {
                try {
                    input_list_pointer = NIL;
                    sublisp_throw($sym157$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_input_list_pointer(self, input_list_pointer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject test_lexifier_get_next_token_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject input_list_pointer = get_test_lexifier_input_list_pointer(self);
            try {
                try {
                    if (NIL != input_list_pointer) {
                        {
                            SubLObject next_token = input_list_pointer.first();
                            input_list_pointer = input_list_pointer.rest();
                            sublisp_throw($sym160$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, next_token);
                        }
                    }
                    sublisp_throw($sym160$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_input_list_pointer(self, input_list_pointer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject test_lexifier_look_up_category_method(SubLObject self, SubLObject token) {
        {
            SubLObject catch_var_for_test_lexifier_method = NIL;
            SubLObject lexicon = get_test_lexifier_lexicon(self);
            try {
                try {
                    if (NIL != token) {
                        {
                            SubLObject association = assoc(token, lexicon, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != association) {
                                sublisp_throw($sym164$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, cadr(association));
                            }
                        }
                    }
                    sublisp_throw($sym164$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_lexifier_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_lexifier_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD);
            }
            return catch_var_for_test_lexifier_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_test_lexifier_test1_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXEME);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_lexifier_test1_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, LEXEME_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_READER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, TOKEN_CLASSIFIER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LEXIFIER, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_LEXIFIER, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_LEXIFIER, INPUT_LIST_POINTER, NIL);
        return NIL;
    }

    public static final SubLObject test_lexifier_test1_p(SubLObject test_lexifier_test1) {
        return classes.subloop_instanceof_class(test_lexifier_test1, TEST_LEXIFIER_TEST1);
    }

    public static final SubLObject test_lexifier_test1_initialize_method(SubLObject self) {
        test_lexifier_initialize_method(self);
        cyblack_basic_lexifier_set_source_method(self, $list_alt172);
        return self;
    }

    public static final SubLObject declare_cyblack_lexifier_file() {
        declareFunction("cyblack_lexeme_p", "CYBLACK-LEXEME-P", 1, 0, false);
        declareFunction("get_cyblack_basic_lexeme_category", "GET-CYBLACK-BASIC-LEXEME-CATEGORY", 1, 0, false);
        declareFunction("set_cyblack_basic_lexeme_category", "SET-CYBLACK-BASIC-LEXEME-CATEGORY", 2, 0, false);
        declareFunction("get_cyblack_basic_lexeme_token", "GET-CYBLACK-BASIC-LEXEME-TOKEN", 1, 0, false);
        declareFunction("set_cyblack_basic_lexeme_token", "SET-CYBLACK-BASIC-LEXEME-TOKEN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lexeme_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXEME-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lexeme_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXEME-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_lexeme_p", "CYBLACK-BASIC-LEXEME-P", 1, 0, false);
        declareFunction("cyblack_basic_lexeme_initialize_method", "CYBLACK-BASIC-LEXEME-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexeme_print_method", "CYBLACK-BASIC-LEXEME-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_lexeme_get_token_method", "CYBLACK-BASIC-LEXEME-GET-TOKEN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexeme_set_token_method", "CYBLACK-BASIC-LEXEME-SET-TOKEN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexeme_get_category_method", "CYBLACK-BASIC-LEXEME-GET-CATEGORY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexeme_set_category_method", "CYBLACK-BASIC-LEXEME-SET-CATEGORY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexeme_to_association_method", "CYBLACK-BASIC-LEXEME-TO-ASSOCIATION-METHOD", 1, 0, false);
        declareFunction("cyblack_lexifier_p", "CYBLACK-LEXIFIER-P", 1, 0, false);
        declareFunction("get_cyblack_basic_lexifier_source", "GET-CYBLACK-BASIC-LEXIFIER-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_source", "SET-CYBLACK-BASIC-LEXIFIER-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_categories", "GET-CYBLACK-BASIC-LEXIFIER-CATEGORIES", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_categories", "SET-CYBLACK-BASIC-LEXIFIER-CATEGORIES", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_state", "GET-CYBLACK-BASIC-LEXIFIER-STATE", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_state", "SET-CYBLACK-BASIC-LEXIFIER-STATE", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_token_classifier", "GET-CYBLACK-BASIC-LEXIFIER-TOKEN-CLASSIFIER", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_token_classifier", "SET-CYBLACK-BASIC-LEXIFIER-TOKEN-CLASSIFIER", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_token_reader", "GET-CYBLACK-BASIC-LEXIFIER-TOKEN-READER", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_token_reader", "SET-CYBLACK-BASIC-LEXIFIER-TOKEN-READER", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_lexeme_class", "GET-CYBLACK-BASIC-LEXIFIER-LEXEME-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_lexeme_class", "SET-CYBLACK-BASIC-LEXIFIER-LEXEME-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_lexifier_default_lexeme_class", "GET-CYBLACK-BASIC-LEXIFIER-DEFAULT-LEXEME-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_lexifier_default_lexeme_class", "SET-CYBLACK-BASIC-LEXIFIER-DEFAULT-LEXEME-CLASS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lexifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXIFIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lexifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXIFIER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_p", "CYBLACK-BASIC-LEXIFIER-P", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_initialize_method", "CYBLACK-BASIC-LEXIFIER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_print_method", "CYBLACK-BASIC-LEXIFIER-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_lexifier_get_default_lexeme_class_method", "CYBLACK-BASIC-LEXIFIER-GET-DEFAULT-LEXEME-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_default_lexeme_class_method", "CYBLACK-BASIC-LEXIFIER-SET-DEFAULT-LEXEME-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_get_lexeme_class_method", "CYBLACK-BASIC-LEXIFIER-GET-LEXEME-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_lexeme_class_method", "CYBLACK-BASIC-LEXIFIER-SET-LEXEME-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_get_token_reader_method", "CYBLACK-BASIC-LEXIFIER-GET-TOKEN-READER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_token_reader_method", "CYBLACK-BASIC-LEXIFIER-SET-TOKEN-READER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_get_token_classifier_method", "CYBLACK-BASIC-LEXIFIER-GET-TOKEN-CLASSIFIER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_token_classifier_method", "CYBLACK-BASIC-LEXIFIER-SET-TOKEN-CLASSIFIER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_new_lexeme_method", "CYBLACK-BASIC-LEXIFIER-NEW-LEXEME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_get_lexeme_method", "CYBLACK-BASIC-LEXIFIER-GET-LEXEME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_get_state_method", "CYBLACK-BASIC-LEXIFIER-GET-STATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_state_method", "CYBLACK-BASIC-LEXIFIER-SET-STATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_get_categories_method", "CYBLACK-BASIC-LEXIFIER-GET-CATEGORIES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_categories_method", "CYBLACK-BASIC-LEXIFIER-SET-CATEGORIES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_get_souce_method", "CYBLACK-BASIC-LEXIFIER-GET-SOUCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_set_source_method", "CYBLACK-BASIC-LEXIFIER-SET-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_lexifier_open_source_method", "CYBLACK-BASIC-LEXIFIER-OPEN-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_lexifier_close_souce_method", "CYBLACK-BASIC-LEXIFIER-CLOSE-SOUCE-METHOD", 1, 0, false);
        declareFunction("get_test_lexifier_input_list_pointer", "GET-TEST-LEXIFIER-INPUT-LIST-POINTER", 1, 0, false);
        declareFunction("set_test_lexifier_input_list_pointer", "SET-TEST-LEXIFIER-INPUT-LIST-POINTER", 2, 0, false);
        declareFunction("get_test_lexifier_lexicon", "GET-TEST-LEXIFIER-LEXICON", 1, 0, false);
        declareFunction("set_test_lexifier_lexicon", "SET-TEST-LEXIFIER-LEXICON", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_lexifier_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_lexifier_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-INSTANCE", 1, 0, false);
        declareFunction("test_lexifier_p", "TEST-LEXIFIER-P", 1, 0, false);
        declareFunction("test_lexifier_initialize_method", "TEST-LEXIFIER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_lexifier_get_lexicon_method", "TEST-LEXIFIER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction("test_lexifier_set_lexicon_method", "TEST-LEXIFIER-SET-LEXICON-METHOD", 2, 0, false);
        declareFunction("test_lexifier_open_source_method", "TEST-LEXIFIER-OPEN-SOURCE-METHOD", 1, 0, false);
        declareFunction("test_lexifier_close_souce_method", "TEST-LEXIFIER-CLOSE-SOUCE-METHOD", 1, 0, false);
        declareFunction("test_lexifier_get_next_token_method", "TEST-LEXIFIER-GET-NEXT-TOKEN-METHOD", 1, 0, false);
        declareFunction("test_lexifier_look_up_category_method", "TEST-LEXIFIER-LOOK-UP-CATEGORY-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_lexifier_test1_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-TEST1-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_lexifier_test1_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-TEST1-INSTANCE", 1, 0, false);
        declareFunction("test_lexifier_test1_p", "TEST-LEXIFIER-TEST1-P", 1, 0, false);
        declareFunction("test_lexifier_test1_initialize_method", "TEST-LEXIFIER-TEST1-INITIALIZE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_lexifier_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_lexifier_file() {
                interfaces.new_interface(CYBLACK_LEXEME, NIL, NIL, $list_alt1);
        classes.subloop_new_class(CYBLACK_BASIC_LEXEME, OBJECT, $list_alt4, NIL, $list_alt5);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_LEXEME, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_LEXEME, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXEME_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_LEXEME, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXEME_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_lexeme_class(CYBLACK_BASIC_LEXEME);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_LEXEME, $list_alt14, NIL, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, INITIALIZE, CYBLACK_BASIC_LEXEME_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_LEXEME, $list_alt19, $list_alt20, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, PRINT, CYBLACK_BASIC_LEXEME_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_TOKEN, CYBLACK_BASIC_LEXEME, $list_alt19, NIL, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, GET_TOKEN, CYBLACK_BASIC_LEXEME_GET_TOKEN_METHOD);
        methods.methods_incorporate_instance_method(SET_TOKEN, CYBLACK_BASIC_LEXEME, $list_alt28, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, SET_TOKEN, CYBLACK_BASIC_LEXEME_SET_TOKEN_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORY, CYBLACK_BASIC_LEXEME, $list_alt19, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, GET_CATEGORY, CYBLACK_BASIC_LEXEME_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(SET_CATEGORY, CYBLACK_BASIC_LEXEME, $list_alt28, $list_alt37, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, SET_CATEGORY, CYBLACK_BASIC_LEXEME_SET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(TO_ASSOCIATION, CYBLACK_BASIC_LEXEME, $list_alt28, NIL, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXEME, TO_ASSOCIATION, CYBLACK_BASIC_LEXEME_TO_ASSOCIATION_METHOD);
        interfaces.new_interface(CYBLACK_LEXIFIER, NIL, NIL, $list_alt46);
        classes.subloop_new_class(CYBLACK_BASIC_LEXIFIER, OBJECT, $list_alt48, T, $list_alt49);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_LEXIFIER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_LEXIFIER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXIFIER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_LEXIFIER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXIFIER_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_lexifier_class(CYBLACK_BASIC_LEXIFIER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_LEXIFIER, $list_alt14, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, INITIALIZE, CYBLACK_BASIC_LEXIFIER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_LEXIFIER, $list_alt19, $list_alt20, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, PRINT, CYBLACK_BASIC_LEXIFIER_PRINT_METHOD);
        methods.methods_incorporate_class_method(GET_DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt65);
        methods.subloop_register_class_method(CYBLACK_BASIC_LEXIFIER, GET_DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER_GET_DEFAULT_LEXEME_CLASS_METHOD);
        methods.methods_incorporate_class_method(SET_DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt68, $list_alt69);
        methods.subloop_register_class_method(CYBLACK_BASIC_LEXIFIER, SET_DEFAULT_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER_SET_DEFAULT_LEXEME_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER_GET_LEXEME_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt76, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_LEXEME_CLASS, CYBLACK_BASIC_LEXIFIER_SET_LEXEME_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_TOKEN_READER, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_TOKEN_READER, CYBLACK_BASIC_LEXIFIER_GET_TOKEN_READER_METHOD);
        methods.methods_incorporate_instance_method(SET_TOKEN_READER, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt84, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_TOKEN_READER, CYBLACK_BASIC_LEXIFIER_SET_TOKEN_READER_METHOD);
        methods.methods_incorporate_instance_method(GET_TOKEN_CLASSIFIER, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_TOKEN_CLASSIFIER, CYBLACK_BASIC_LEXIFIER_GET_TOKEN_CLASSIFIER_METHOD);
        methods.methods_incorporate_instance_method(SET_TOKEN_CLASSIFIER, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt92, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_TOKEN_CLASSIFIER, CYBLACK_BASIC_LEXIFIER_SET_TOKEN_CLASSIFIER_METHOD);
        methods.methods_incorporate_instance_method(NEW_LEXEME, CYBLACK_BASIC_LEXIFIER, $list_alt14, NIL, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, NEW_LEXEME, CYBLACK_BASIC_LEXIFIER_NEW_LEXEME_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXEME, CYBLACK_BASIC_LEXIFIER, $list_alt28, NIL, $list_alt100);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_LEXEME, CYBLACK_BASIC_LEXIFIER_GET_LEXEME_METHOD);
        methods.methods_incorporate_instance_method(GET_STATE, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_STATE, CYBLACK_BASIC_LEXIFIER_GET_STATE_METHOD);
        methods.methods_incorporate_instance_method(SET_STATE, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt107, $list_alt108);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_STATE, CYBLACK_BASIC_LEXIFIER_SET_STATE_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORIES, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_CATEGORIES, CYBLACK_BASIC_LEXIFIER_GET_CATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(SET_CATEGORIES, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt115, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_CATEGORIES, CYBLACK_BASIC_LEXIFIER_SET_CATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(GET_SOUCE, CYBLACK_BASIC_LEXIFIER, $list_alt19, NIL, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, GET_SOUCE, CYBLACK_BASIC_LEXIFIER_GET_SOUCE_METHOD);
        methods.methods_incorporate_instance_method(SET_SOURCE, CYBLACK_BASIC_LEXIFIER, $list_alt28, $list_alt123, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, SET_SOURCE, CYBLACK_BASIC_LEXIFIER_SET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(OPEN_SOURCE, CYBLACK_BASIC_LEXIFIER, $list_alt28, NIL, $list_alt128);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, OPEN_SOURCE, CYBLACK_BASIC_LEXIFIER_OPEN_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(CLOSE_SOUCE, CYBLACK_BASIC_LEXIFIER, $list_alt28, NIL, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LEXIFIER, CLOSE_SOUCE, CYBLACK_BASIC_LEXIFIER_CLOSE_SOUCE_METHOD);
        classes.subloop_new_class(TEST_LEXIFIER, CYBLACK_BASIC_LEXIFIER, NIL, NIL, $list_alt134);
        classes.class_set_implements_slot_listeners(TEST_LEXIFIER, NIL);
        classes.subloop_note_class_initialization_function(TEST_LEXIFIER, SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_LEXIFIER, SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_INSTANCE);
        subloop_reserved_initialize_test_lexifier_class(TEST_LEXIFIER);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_LEXIFIER, $list_alt14, NIL, $list_alt139);
        methods.subloop_register_instance_method(TEST_LEXIFIER, INITIALIZE, TEST_LEXIFIER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXICON, TEST_LEXIFIER, $list_alt19, NIL, $list_alt146);
        methods.subloop_register_instance_method(TEST_LEXIFIER, GET_LEXICON, TEST_LEXIFIER_GET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXICON, TEST_LEXIFIER, $list_alt28, $list_alt149, $list_alt150);
        methods.subloop_register_instance_method(TEST_LEXIFIER, SET_LEXICON, TEST_LEXIFIER_SET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(OPEN_SOURCE, TEST_LEXIFIER, $list_alt28, NIL, $list_alt153);
        methods.subloop_register_instance_method(TEST_LEXIFIER, OPEN_SOURCE, TEST_LEXIFIER_OPEN_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(CLOSE_SOUCE, TEST_LEXIFIER, $list_alt28, NIL, $list_alt156);
        methods.subloop_register_instance_method(TEST_LEXIFIER, CLOSE_SOUCE, TEST_LEXIFIER_CLOSE_SOUCE_METHOD);
        methods.methods_incorporate_instance_method(GET_NEXT_TOKEN, TEST_LEXIFIER, $list_alt28, NIL, $list_alt159);
        methods.subloop_register_instance_method(TEST_LEXIFIER, GET_NEXT_TOKEN, TEST_LEXIFIER_GET_NEXT_TOKEN_METHOD);
        methods.methods_incorporate_instance_method(LOOK_UP_CATEGORY, TEST_LEXIFIER, $list_alt28, $list_alt162, $list_alt163);
        methods.subloop_register_instance_method(TEST_LEXIFIER, LOOK_UP_CATEGORY, TEST_LEXIFIER_LOOK_UP_CATEGORY_METHOD);
        classes.subloop_new_class(TEST_LEXIFIER_TEST1, TEST_LEXIFIER, NIL, NIL, $list_alt167);
        classes.class_set_implements_slot_listeners(TEST_LEXIFIER_TEST1, NIL);
        classes.subloop_note_class_initialization_function(TEST_LEXIFIER_TEST1, SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_TEST1_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_LEXIFIER_TEST1, SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_TEST1_INSTANCE);
        subloop_reserved_initialize_test_lexifier_test1_class(TEST_LEXIFIER_TEST1);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_LEXIFIER_TEST1, $list_alt170, NIL, $list_alt171);
        methods.subloop_register_instance_method(TEST_LEXIFIER_TEST1, INITIALIZE, TEST_LEXIFIER_TEST1_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_LEXEME = makeSymbol("CYBLACK-LEXEME");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOKEN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOKEN"), list(makeSymbol("NEW-TOKEN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-ASSOCIATION"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_LEXEME = makeSymbol("CYBLACK-BASIC-LEXEME");



    static private final SubLList $list_alt4 = list(makeSymbol("CYBLACK-LEXEME"));

    static private final SubLList $list_alt5 = list(new SubLObject[]{ list(makeSymbol("TOKEN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOKEN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOKEN"), list(makeSymbol("NEW-TOKEN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-ASSOCIATION"), NIL, makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXEME_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXEME-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXEME_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXEME-INSTANCE");



    static private final SubLList $list_alt14 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt15 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TOKEN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym16$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXEME-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-INITIALIZE-METHOD");



    static private final SubLList $list_alt19 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt20 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<LEXEME: token=~S; category=~S>"), makeSymbol("TOKEN"), makeSymbol("CATEGORY")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt22$__LEXEME__token__S__category__S_ = makeString("#<LEXEME: token=~S; category=~S>");

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-PRINT-METHOD");

    private static final SubLSymbol GET_TOKEN = makeSymbol("GET-TOKEN");

    static private final SubLList $list_alt25 = list(list(RET, makeSymbol("TOKEN")));

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_GET_TOKEN_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-GET-TOKEN-METHOD");

    private static final SubLSymbol SET_TOKEN = makeSymbol("SET-TOKEN");

    static private final SubLList $list_alt28 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt29 = list(makeSymbol("NEW-TOKEN"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("CSETQ"), makeSymbol("TOKEN"), makeSymbol("NEW-TOKEN")), list(RET, makeSymbol("NEW-TOKEN")));

    static private final SubLSymbol $sym31$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXEME-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_SET_TOKEN_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-SET-TOKEN-METHOD");



    static private final SubLList $list_alt34 = list(list(RET, makeSymbol("CATEGORY")));

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_GET_CATEGORY_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-GET-CATEGORY-METHOD");

    private static final SubLSymbol SET_CATEGORY = makeSymbol("SET-CATEGORY");

    static private final SubLList $list_alt37 = list(makeSymbol("NEW-CATEGORY"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), makeSymbol("NEW-CATEGORY")), list(RET, makeSymbol("NEW-CATEGORY")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXEME-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_SET_CATEGORY_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-SET-CATEGORY-METHOD");

    private static final SubLSymbol TO_ASSOCIATION = makeSymbol("TO-ASSOCIATION");

    static private final SubLList $list_alt42 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TOKEN"), makeSymbol("CATEGORY")), list(RET, list(makeSymbol("LIST"), makeSymbol("TOKEN"), makeSymbol("CATEGORY")))), list(RET, NIL));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXEME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXEME-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXEME_TO_ASSOCIATION_METHOD = makeSymbol("CYBLACK-BASIC-LEXEME-TO-ASSOCIATION-METHOD");

    private static final SubLSymbol CYBLACK_LEXIFIER = makeSymbol("CYBLACK-LEXIFIER");

    static private final SubLList $list_alt46 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXEME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORIES"), list(makeSymbol("NEW-CATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOUCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOURCE"), list(makeSymbol("NEW-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OPEN-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-SOUCE"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER = makeSymbol("CYBLACK-BASIC-LEXIFIER");

    static private final SubLList $list_alt48 = list(makeSymbol("CYBLACK-LEXIFIER"));

    static private final SubLList $list_alt49 = list(new SubLObject[]{ list(makeSymbol("DEFAULT-LEXEME-CLASS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-LEXEME"))), list(makeSymbol("LEXEME-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TOKEN-READER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TOKEN-CLASSIFIER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DEFAULT-LEXEME-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SET-DEFAULT-LEXEME-CLASS"), list(makeSymbol("NEW-DEFAULT-LEXEME-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXEME-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXEME-CLASS"), list(makeSymbol("NEW-LEXEME-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOKEN-READER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOKEN-READER"), list(makeSymbol("NEW-TOKEN-READER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOKEN-CLASSIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOKEN-CLASSIFIER"), list(makeSymbol("NEW-TOKEN-CLASSIFIER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-LEXEME"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXEME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORIES"), list(makeSymbol("NEW-CATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOUCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOURCE"), list(makeSymbol("NEW-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OPEN-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-SOUCE"), NIL, makeKeyword("PUBLIC")) });













    private static final SubLSymbol DEFAULT_LEXEME_CLASS = makeSymbol("DEFAULT-LEXEME-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXIFIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXIFIER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LEXIFIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LEXIFIER-INSTANCE");

    static private final SubLList $list_alt59 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LEXEME-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TOKEN-READER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TOKEN-CLASSIFIER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-INITIALIZE-METHOD");

    static private final SubLList $list_alt62 = list(list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-PRINT-METHOD");

    private static final SubLSymbol GET_DEFAULT_LEXEME_CLASS = makeSymbol("GET-DEFAULT-LEXEME-CLASS");

    static private final SubLList $list_alt65 = list(list(RET, makeSymbol("DEFAULT-LEXEME-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_DEFAULT_LEXEME_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-DEFAULT-LEXEME-CLASS-METHOD");

    private static final SubLSymbol SET_DEFAULT_LEXEME_CLASS = makeSymbol("SET-DEFAULT-LEXEME-CLASS");

    static private final SubLList $list_alt68 = list(makeSymbol("NEW-DEFAULT-LEXEME-CLASS"));

    static private final SubLList $list_alt69 = list(list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-LEXEME-CLASS"), makeSymbol("NEW-DEFAULT-LEXEME-CLASS")), list(RET, makeSymbol("NEW-DEFAULT-LEXEME-CLASS")));

    static private final SubLSymbol $sym70$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_DEFAULT_LEXEME_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-DEFAULT-LEXEME-CLASS-METHOD");

    private static final SubLSymbol GET_LEXEME_CLASS = makeSymbol("GET-LEXEME-CLASS");

    static private final SubLList $list_alt73 = list(makeString("Returns the class of lexeme to be returned by NEW-LEXEME and GET-LEXEME.  If the\n   LEXEME-CLASS slot has a value other than NIL, that value is returned, otherwise the\n   value of the class slot DEFAULT-LEXEME-CLASS is returned."), list(RET, list(makeSymbol("FIF"), makeSymbol("LEXEME-CLASS"), makeSymbol("LEXEME-CLASS"), makeSymbol("DEFAULT-LEXEME-CLASS"))));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_LEXEME_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-LEXEME-CLASS-METHOD");

    private static final SubLSymbol SET_LEXEME_CLASS = makeSymbol("SET-LEXEME-CLASS");

    static private final SubLList $list_alt76 = list(makeSymbol("NEW-LEXEME-CLASS"));

    static private final SubLList $list_alt77 = list(list(makeSymbol("CSETQ"), makeSymbol("LEXEME-CLASS"), makeSymbol("NEW-LEXEME-CLASS")), list(RET, makeSymbol("NEW-LEXEME-CLASS")));

    static private final SubLSymbol $sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_LEXEME_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-LEXEME-CLASS-METHOD");

    private static final SubLSymbol GET_TOKEN_READER = makeSymbol("GET-TOKEN-READER");

    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("TOKEN-READER")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_TOKEN_READER_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-TOKEN-READER-METHOD");

    private static final SubLSymbol SET_TOKEN_READER = makeSymbol("SET-TOKEN-READER");

    static private final SubLList $list_alt84 = list(makeSymbol("NEW-TOKEN-READER"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("CSETQ"), makeSymbol("TOKEN-READER"), makeSymbol("NEW-TOKEN-READER")), list(RET, makeSymbol("NEW-TOKEN-READER")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_TOKEN_READER_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-TOKEN-READER-METHOD");

    private static final SubLSymbol GET_TOKEN_CLASSIFIER = makeSymbol("GET-TOKEN-CLASSIFIER");

    static private final SubLList $list_alt89 = list(list(RET, makeSymbol("TOKEN-CLASSIFIER")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_TOKEN_CLASSIFIER_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-TOKEN-CLASSIFIER-METHOD");

    private static final SubLSymbol SET_TOKEN_CLASSIFIER = makeSymbol("SET-TOKEN-CLASSIFIER");

    static private final SubLList $list_alt92 = list(makeSymbol("NEW-TOKEN-CLASSIFIER"));

    static private final SubLList $list_alt93 = list(list(makeSymbol("CSETQ"), makeSymbol("TOKEN-CLASSIFIER"), makeSymbol("NEW-TOKEN-CLASSIFIER")), list(RET, makeSymbol("NEW-TOKEN-CLASSIFIER")));

    static private final SubLSymbol $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_TOKEN_CLASSIFIER_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-TOKEN-CLASSIFIER-METHOD");

    private static final SubLSymbol NEW_LEXEME = makeSymbol("NEW-LEXEME");

    static private final SubLList $list_alt97 = list(makeString("Returns a new instance of the class returned by GET-LEXEME-CLASS."), list(RET, list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("GET-LEXEME-CLASS"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_NEW_LEXEME_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-NEW-LEXEME-METHOD");

    private static final SubLSymbol GET_LEXEME = makeSymbol("GET-LEXEME");

    static private final SubLList $list_alt100 = list(makeString("Gets the next token, looks up its category, creates a LEXEME using an instance returned\n   by NEW-LEXEME, sets the token and category of this new lexeme, and the returns the LEXEME.\n   If GET-TOKEN returns NIL, this method returns NIL."), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("COR"), makeSymbol("DEFAULT-LEXEME-CLASS"), makeSymbol("LEXEME-CLASS")), makeSymbol("TOKEN-READER"), makeSymbol("TOKEN-CLASSIFIER")), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-TOKEN"), NIL), list(makeSymbol("TOKEN-CATEGORY"), NIL)), list(makeSymbol("PIF"), makeSymbol("STATE"), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("STATE")), list(makeSymbol("CSETQ"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATE"), makeSymbol("TOKEN-READER")), makeSymbol("TOKEN-CATEGORY"), list(makeSymbol("FIF"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATE"), makeSymbol("TOKEN-CLASSIFIER"), makeSymbol("NEXT-TOKEN")), NIL)), list(makeSymbol("CSETQ"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL"), makeSymbol("TOKEN-READER"), makeSymbol("STATE")), makeSymbol("TOKEN-CATEGORY"), list(makeSymbol("FIF"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL"), makeSymbol("TOKEN-CLASSIFIER"), makeSymbol("STATE"), makeSymbol("NEXT-TOKEN")), NIL))), list(makeSymbol("CSETQ"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL"), makeSymbol("TOKEN-READER")), makeSymbol("TOKEN-CATEGORY"), list(makeSymbol("FIF"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("FUNCALL"), makeSymbol("TOKEN-CLASSIFIER"), makeSymbol("NEXT-TOKEN")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("NEXT-TOKEN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEXEME"), list(makeSymbol("NEW-LEXEME"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("SET-TOKEN")), makeSymbol("NEXT-TOKEN")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("SET-CATEGORY")), makeSymbol("TOKEN-CATEGORY")), list(RET, makeSymbol("LEXEME")))))), list(RET, NIL));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_LEXEME_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-LEXEME-METHOD");

    private static final SubLSymbol GET_STATE = makeSymbol("GET-STATE");

    static private final SubLList $list_alt104 = list(list(RET, makeSymbol("STATE")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_STATE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-STATE-METHOD");

    private static final SubLSymbol SET_STATE = makeSymbol("SET-STATE");

    static private final SubLList $list_alt107 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt108 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_STATE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-STATE-METHOD");



    static private final SubLList $list_alt112 = list(list(RET, makeSymbol("CATEGORIES")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_CATEGORIES_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-CATEGORIES-METHOD");

    private static final SubLSymbol SET_CATEGORIES = makeSymbol("SET-CATEGORIES");

    static private final SubLList $list_alt115 = list(makeSymbol("NEW-CATEGORIES"));

    static private final SubLList $list_alt116 = list(list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-CATEGORIES"))), list(RET, makeSymbol("NEW-CATEGORIES")));

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_CATEGORIES_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-CATEGORIES-METHOD");

    private static final SubLSymbol GET_SOUCE = makeSymbol("GET-SOUCE");

    static private final SubLList $list_alt120 = list(list(RET, makeSymbol("SOURCE")));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_GET_SOUCE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-GET-SOUCE-METHOD");



    static private final SubLList $list_alt123 = list(makeSymbol("NEW-SOURCE"));

    static private final SubLList $list_alt124 = list(list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), makeSymbol("NEW-SOURCE")), list(RET, makeSymbol("NEW-SOURCE")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LEXIFIER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_SET_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-SET-SOURCE-METHOD");

    private static final SubLSymbol OPEN_SOURCE = makeSymbol("OPEN-SOURCE");

    static private final SubLList $list_alt128 = list(makeString("The implementation of this method depends upon the nature of the value\n   of the SOURCE slot.  If one needs to perform some task on SOURCE in\n   or to prepare it for use, the code for that task should be specified\n   in the method that overrides this OPEN-SOURCE method.  For example,\n   if your derived class places a stream in SOURCE, you may need to override\n   this method to open the stream.  If your derived class uses a list,\n   then you may need to set a pointer to the head of the list."), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_OPEN_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-OPEN-SOURCE-METHOD");

    private static final SubLSymbol CLOSE_SOUCE = makeSymbol("CLOSE-SOUCE");

    static private final SubLList $list_alt131 = list(makeString("Override to provide cleanup functionality for terminating access of\n   SOURCE."), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_LEXIFIER_CLOSE_SOUCE_METHOD = makeSymbol("CYBLACK-BASIC-LEXIFIER-CLOSE-SOUCE-METHOD");

    private static final SubLSymbol TEST_LEXIFIER = makeSymbol("TEST-LEXIFIER");

    static private final SubLList $list_alt134 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INPUT-LIST-POINTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXICON"), list(makeSymbol("NEW-LEXICON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OPEN-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE-SOUCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NEXT-TOKEN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOOK-UP-CATEGORY"), list(makeSymbol("TOKEN")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-INSTANCE");

    static private final SubLList $list_alt139 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LEXEME-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TOKEN-READER"), list(QUOTE, makeSymbol("GET-NEXT-TOKEN"))), list(makeSymbol("CSETQ"), makeSymbol("TOKEN-CLASSIFIER"), list(QUOTE, makeSymbol("LOOK-UP-CATEGORY"))), list(makeSymbol("CSETQ"), makeSymbol("STATE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(QUOTE, list(new SubLObject[]{ list(makeSymbol("THE"), makeSymbol("DET")), list(makeSymbol("MAN"), makeSymbol("N")), list(makeSymbol("WOMAN"), makeSymbol("N")), list(makeSymbol("CAT"), makeSymbol("N")), list(makeSymbol("DOG"), makeSymbol("N")), list(makeSymbol("LOVES"), makeSymbol("V")), list(makeSymbol("THINKS"), makeSymbol("V")), list(makeSymbol("HATES"), makeSymbol("V")), list(makeSymbol("$"), makeSymbol("$")) }))), list(makeSymbol("CSETQ"), makeSymbol("INPUT-LIST-POINTER"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol GET_NEXT_TOKEN = makeSymbol("GET-NEXT-TOKEN");

    private static final SubLSymbol LOOK_UP_CATEGORY = makeSymbol("LOOK-UP-CATEGORY");

    static private final SubLList $list_alt143 = list(new SubLObject[]{ list(makeSymbol("THE"), makeSymbol("DET")), list(makeSymbol("MAN"), makeSymbol("N")), list(makeSymbol("WOMAN"), makeSymbol("N")), list(makeSymbol("CAT"), makeSymbol("N")), list(makeSymbol("DOG"), makeSymbol("N")), list(makeSymbol("LOVES"), makeSymbol("V")), list(makeSymbol("THINKS"), makeSymbol("V")), list(makeSymbol("HATES"), makeSymbol("V")), list(makeSymbol("$"), makeSymbol("$")) });

    private static final SubLSymbol TEST_LEXIFIER_INITIALIZE_METHOD = makeSymbol("TEST-LEXIFIER-INITIALIZE-METHOD");

    private static final SubLSymbol GET_LEXICON = makeSymbol("GET-LEXICON");

    static private final SubLList $list_alt146 = list(list(RET, makeSymbol("LEXICON")));

    private static final SubLSymbol TEST_LEXIFIER_GET_LEXICON_METHOD = makeSymbol("TEST-LEXIFIER-GET-LEXICON-METHOD");



    static private final SubLList $list_alt149 = list(makeSymbol("NEW-LEXICON"));

    static private final SubLList $list_alt150 = list(list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), makeSymbol("NEW-LEXICON")), list(makeSymbol("CSETQ"), makeSymbol("INPUT-LIST-POINTER"), NIL), list(RET, makeSymbol("LEXICON")));

    static private final SubLSymbol $sym151$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_SET_LEXICON_METHOD = makeSymbol("TEST-LEXIFIER-SET-LEXICON-METHOD");

    static private final SubLList $list_alt153 = list(list(makeSymbol("CSETQ"), makeSymbol("INPUT-LIST-POINTER"), makeSymbol("SOURCE")), list(RET, NIL));

    static private final SubLSymbol $sym154$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_OPEN_SOURCE_METHOD = makeSymbol("TEST-LEXIFIER-OPEN-SOURCE-METHOD");

    static private final SubLList $list_alt156 = list(list(makeSymbol("CSETQ"), makeSymbol("INPUT-LIST-POINTER"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_CLOSE_SOUCE_METHOD = makeSymbol("TEST-LEXIFIER-CLOSE-SOUCE-METHOD");

    static private final SubLList $list_alt159 = list(list(makeSymbol("PWHEN"), makeSymbol("INPUT-LIST-POINTER"), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-TOKEN"), list(makeSymbol("CAR"), makeSymbol("INPUT-LIST-POINTER")))), list(makeSymbol("CPOP"), makeSymbol("INPUT-LIST-POINTER")), list(RET, makeSymbol("NEXT-TOKEN")))), list(RET, NIL));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_GET_NEXT_TOKEN_METHOD = makeSymbol("TEST-LEXIFIER-GET-NEXT-TOKEN-METHOD");

    static private final SubLList $list_alt162 = list(makeSymbol("TOKEN"));

    static private final SubLList $list_alt163 = list(list(makeSymbol("PWHEN"), makeSymbol("TOKEN"), list(makeSymbol("CLET"), list(list(makeSymbol("ASSOCIATION"), list(makeSymbol("ASSOC"), makeSymbol("TOKEN"), makeSymbol("LEXICON"), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("PWHEN"), makeSymbol("ASSOCIATION"), list(RET, list(makeSymbol("CADR"), makeSymbol("ASSOCIATION")))))), list(RET, NIL));

    static private final SubLSymbol $sym164$OUTER_CATCH_FOR_TEST_LEXIFIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LEXIFIER-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_LOOK_UP_CATEGORY_METHOD = makeSymbol("TEST-LEXIFIER-LOOK-UP-CATEGORY-METHOD");

    private static final SubLSymbol TEST_LEXIFIER_TEST1 = makeSymbol("TEST-LEXIFIER-TEST1");

    static private final SubLList $list_alt167 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_TEST1_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-TEST1-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LEXIFIER_TEST1_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LEXIFIER-TEST1-INSTANCE");

    static private final SubLList $list_alt170 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt171 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SOURCE"), makeSymbol("SELF"), list(QUOTE, list(new SubLObject[]{ makeSymbol("THE"), makeSymbol("MAN"), makeSymbol("THINKS"), makeSymbol("THE"), makeSymbol("WOMAN"), makeSymbol("HATES"), makeSymbol("THE"), makeSymbol("DOG"), makeSymbol("$") }))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt172 = list(new SubLObject[]{ makeSymbol("THE"), makeSymbol("MAN"), makeSymbol("THINKS"), makeSymbol("THE"), makeSymbol("WOMAN"), makeSymbol("HATES"), makeSymbol("THE"), makeSymbol("DOG"), makeSymbol("$") });

    private static final SubLSymbol TEST_LEXIFIER_TEST1_INITIALIZE_METHOD = makeSymbol("TEST-LEXIFIER-TEST1-INITIALIZE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_lexifier_file();
    }

    public void initializeVariables() {
        init_cyblack_lexifier_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_lexifier_file();
    }
}


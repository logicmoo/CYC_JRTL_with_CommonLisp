/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_testing;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-CACHE
 * source file: /cyc/top/cycl/sksi/sksi-testing/sksi-cache.lisp
 * created:     2019/07/03 17:38:35
 */
public final class sksi_cache extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_cache();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_language_spoken_table$ = makeSymbol("*SKSI-LANGUAGE-SPOKEN-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_language_spoken_table_name$ = makeSymbol("*SKSI-LANGUAGE-SPOKEN-TABLE-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_language_spoken_field_list$ = makeSymbol("*SKSI-LANGUAGE-SPOKEN-FIELD-LIST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ list(makeString("Goolsbey"), makeString("EnglishLanguage")), list(makeString("Goolsbey"), makeString("GermanLanguage")), list(makeString("Kahlert"), makeString("EnglishLanguage")), list(makeString("Kahlert"), makeString("GermanLanguage")), list(makeString("Pace"), makeString("EnglishLanguage")), list(makeString("Pace"), makeString("FinnishLanguage")), list(makeString("Hagen"), makeString("Magyarul")), list(makeString("SDeVoy"), makeString("EnglishLanguage")), list(makeString("SDeVoy"), makeString("SpanishLanguage")), list(makeString("Zelal"), makeString("Turkce")) });

    static private final SubLString $str1$Person_Languages = makeString("Person_Languages");

    static private final SubLList $list2 = list(makeString("PERSON"), makeString("LANGUAGE"));

    static private final SubLList $list3 = list(makeSymbol("TUPLE-PERSON"), makeSymbol("TUPLE-LANGUAGE"));

    static private final SubLList $list4 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLString $$$PERSON = makeString("PERSON");

    static private final SubLString $$$LANGUAGE = makeString("LANGUAGE");

    static private final SubLString $str7$boolean_CSQL_expression__a_encoun = makeString("boolean CSQL expression ~a encountered when select expression expected");

    static private final SubLList $list8 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    static private final SubLString $str9$CSQL_expression__a_selects_fields = makeString("CSQL expression ~a selects fields, not a boolean check expression");

    static private final SubLList $list10 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("INTO-OR-FROM"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"));

    static private final SubLList $list11 = list(makeSymbol("VALUES-KEYWORD"), makeSymbol("FIELD-VALUE-LIST"));

    static private final SubLString $str13$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :values");

    public static final SubLObject sksi_language_spoken_person_language_check_guts_alt(SubLObject person, SubLObject language) {
        {
            SubLObject answers = NIL;
            if (NIL == answers) {
                {
                    SubLObject csome_list_var = $sksi_language_spoken_table$.getGlobalValue();
                    SubLObject tuple = NIL;
                    for (tuple = csome_list_var.first(); !((NIL != answers) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , tuple = csome_list_var.first()) {
                        {
                            SubLObject datum = tuple;
                            SubLObject current = datum;
                            SubLObject tuple_person = NIL;
                            SubLObject tuple_language = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt3);
                            tuple_person = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt3);
                            tuple_language = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (person.equal(tuple_person) && language.equal(tuple_language)) {
                                    {
                                        SubLObject v_answer = list(EMPTY_SUBL_OBJECT_ARRAY);
                                        answers = cons(v_answer, answers);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt3);
                            }
                        }
                    }
                }
            }
            return answers;
        }
    }

    public static SubLObject sksi_language_spoken_person_language_check_guts(final SubLObject person, final SubLObject language) {
        SubLObject answers = NIL;
        if (NIL == answers) {
            SubLObject csome_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            tuple = csome_list_var.first();
            while ((NIL == answers) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject tuple_person = NIL;
                SubLObject tuple_language = NIL;
                destructuring_bind_must_consp(current, datum, $list3);
                tuple_person = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list3);
                tuple_language = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (person.equal(tuple_person) && language.equal(tuple_language)) {
                        final SubLObject v_answer = list(EMPTY_SUBL_OBJECT_ARRAY);
                        answers = cons(v_answer, answers);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list3);
                }
                csome_list_var = csome_list_var.rest();
                tuple = csome_list_var.first();
            } 
        }
        return answers;
    }

    public static final SubLObject sksi_language_spoken_persons_by_language_guts_alt(SubLObject language) {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject tuple_person = NIL;
                    SubLObject tuple_language = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_language = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (language.equal(tuple_language)) {
                            answers = cons(tuple_person, answers);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return answers;
        }
    }

    public static SubLObject sksi_language_spoken_persons_by_language_guts(final SubLObject language) {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject tuple_person = NIL;
            SubLObject tuple_language = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_person = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_language = current.first();
            current = current.rest();
            if (NIL == current) {
                if (language.equal(tuple_language)) {
                    answers = cons(tuple_person, answers);
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return answers;
    }

    public static final SubLObject sksi_language_spoken_languages_by_person_guts_alt(SubLObject person) {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject tuple_person = NIL;
                    SubLObject tuple_language = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_language = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (person.equal(tuple_person)) {
                            answers = cons(tuple_language, answers);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return answers;
        }
    }

    public static SubLObject sksi_language_spoken_languages_by_person_guts(final SubLObject person) {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject tuple_person = NIL;
            SubLObject tuple_language = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_person = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_language = current.first();
            current = current.rest();
            if (NIL == current) {
                if (person.equal(tuple_person)) {
                    answers = cons(tuple_language, answers);
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return answers;
    }

    public static final SubLObject sksi_language_spoken_languages_and_persons_guts_alt() {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject tuple_person = NIL;
                    SubLObject tuple_language = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_language = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject v_answer = list(tuple_person, tuple_language);
                            answers = cons(v_answer, answers);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return answers;
        }
    }

    public static SubLObject sksi_language_spoken_languages_and_persons_guts() {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject tuple_person = NIL;
            SubLObject tuple_language = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_person = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_language = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject v_answer = list(tuple_person, tuple_language);
                answers = cons(v_answer, answers);
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return answers;
    }

    public static final SubLObject sksi_language_spoken_persons_guts_alt() {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject tuple_person = NIL;
                    SubLObject tuple_language = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_language = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        answers = cons(tuple_person, answers);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_language_spoken_persons_guts() {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject tuple_person = NIL;
            SubLObject tuple_language = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_person = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_language = current.first();
            current = current.rest();
            if (NIL == current) {
                answers = cons(tuple_person, answers);
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sksi_language_spoken_languages_guts_alt() {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject tuple_person = NIL;
                    SubLObject tuple_language = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_person = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    tuple_language = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        answers = cons(tuple_language, answers);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sksi_language_spoken_languages_guts() {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject tuple_person = NIL;
            SubLObject tuple_language = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_person = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            tuple_language = current.first();
            current = current.rest();
            if (NIL == current) {
                answers = cons(tuple_language, answers);
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Determine whether this person really has this language.
     */
    @LispMethod(comment = "Determine whether this person really has this language.")
    public static final SubLObject sksi_language_spoken_person_language_check_alt(SubLObject person, SubLObject language) {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_person_language_check_guts(person, language);
    }

    /**
     * Determine whether this person really has this language.
     */
    @LispMethod(comment = "Determine whether this person really has this language.")
    public static SubLObject sksi_language_spoken_person_language_check(final SubLObject person, final SubLObject language) {
        return sksi_language_spoken_person_language_check_guts(person, language);
    }

    /**
     * Determine the persons based on the language set.
     */
    @LispMethod(comment = "Determine the persons based on the language set.")
    public static final SubLObject sksi_language_spoken_persons_by_language_alt(SubLObject language) {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_persons_by_language_guts(language);
    }

    /**
     * Determine the persons based on the language set.
     */
    @LispMethod(comment = "Determine the persons based on the language set.")
    public static SubLObject sksi_language_spoken_persons_by_language(final SubLObject language) {
        return sksi_language_spoken_persons_by_language_guts(language);
    }

    /**
     * Determine the languages based on the person.
     */
    @LispMethod(comment = "Determine the languages based on the person.")
    public static final SubLObject sksi_language_spoken_languages_by_person_alt(SubLObject person) {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages_by_person_guts(person);
    }

    /**
     * Determine the languages based on the person.
     */
    @LispMethod(comment = "Determine the languages based on the person.")
    public static SubLObject sksi_language_spoken_languages_by_person(final SubLObject person) {
        return sksi_language_spoken_languages_by_person_guts(person);
    }

    /**
     * Determine the persons based on the language set.
     */
    @LispMethod(comment = "Determine the persons based on the language set.")
    public static final SubLObject sksi_language_spoken_languages_and_persons_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages_and_persons_guts();
    }

    /**
     * Determine the persons based on the language set.
     */
    @LispMethod(comment = "Determine the persons based on the language set.")
    public static SubLObject sksi_language_spoken_languages_and_persons() {
        return sksi_language_spoken_languages_and_persons_guts();
    }

    public static final SubLObject sksi_language_spoken_persons_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_persons_guts();
    }

    public static SubLObject sksi_language_spoken_persons() {
        return sksi_language_spoken_persons_guts();
    }

    public static final SubLObject sksi_language_spoken_languages_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages_guts();
    }

    public static SubLObject sksi_language_spoken_languages() {
        return sksi_language_spoken_languages_guts();
    }

    public static final SubLObject generate_language_spoken_iterator_from_csql_alt(SubLObject csql) {
        {
            SubLObject datum = csql;
            SubLObject current = datum;
            SubLObject select_keyword = NIL;
            SubLObject fields = NIL;
            SubLObject from = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            select_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            from = current.first();
            current = current.rest();
            {
                SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt4);
                current = current.rest();
                if (NIL == current) {
                    if (NIL != list_utilities.doubletonP(fields)) {
                        return iteration.new_list_iterator(com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages_and_persons());
                    } else {
                        if (NIL != list_utilities.singletonP(fields)) {
                            {
                                SubLObject field = fields.first();
                                SubLObject field_name = second(field);
                                if (field_name.equal($$$PERSON)) {
                                    {
                                        SubLObject language = third(second(where).first());
                                        if (NIL != language) {
                                            return sksi_result_set_iterators.new_sksi_list_iterator(com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_persons_by_language(language));
                                        } else {
                                            return sksi_result_set_iterators.new_sksi_list_iterator(com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_persons());
                                        }
                                    }
                                } else {
                                    if (field_name.equal($$$LANGUAGE)) {
                                        {
                                            SubLObject person = third(second(where).first());
                                            if (NIL != person) {
                                                return sksi_result_set_iterators.new_sksi_list_iterator(com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages_by_person(person));
                                            } else {
                                                return sksi_result_set_iterators.new_sksi_list_iterator(com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_languages());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt7$boolean_CSQL_expression__a_encoun, csql);
                            return NIL;
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt4);
                }
            }
        }
        return NIL;
    }

    public static SubLObject generate_language_spoken_iterator_from_csql(final SubLObject csql) {
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list4);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list4);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list4);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list4);
        current = current.rest();
        if (NIL == current) {
            if (NIL != list_utilities.doubletonP(fields)) {
                return iteration.new_list_iterator(sksi_language_spoken_languages_and_persons());
            }
            if (NIL == list_utilities.singletonP(fields)) {
                Errors.error($str7$boolean_CSQL_expression__a_encoun, csql);
                return NIL;
            }
            final SubLObject field = fields.first();
            final SubLObject field_name = second(field);
            if (field_name.equal($$$PERSON)) {
                final SubLObject language = third(second(where).first());
                if (NIL != language) {
                    return sksi_result_set_iterators.new_sksi_list_iterator(sksi_language_spoken_persons_by_language(language));
                }
                return sksi_result_set_iterators.new_sksi_list_iterator(sksi_language_spoken_persons());
            } else
                if (field_name.equal($$$LANGUAGE)) {
                    final SubLObject person = third(second(where).first());
                    if (NIL != person) {
                        return sksi_result_set_iterators.new_sksi_list_iterator(sksi_language_spoken_languages_by_person(person));
                    }
                    return sksi_result_set_iterators.new_sksi_list_iterator(sksi_language_spoken_languages());
                }

        } else {
            cdestructuring_bind_error(csql, $list4);
        }
        return NIL;
    }

    public static final SubLObject generate_language_spoken_boolean_from_csql_alt(SubLObject csql) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = csql;
                SubLObject current = datum;
                SubLObject select_keyword = NIL;
                SubLObject fields = NIL;
                SubLObject from = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt4);
                select_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                fields = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                from = current.first();
                current = current.rest();
                {
                    SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt4);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!fields.equal($list_alt8)) {
                                Errors.error($str_alt9$CSQL_expression__a_selects_fields, csql);
                            }
                        }
                        {
                            SubLObject person = third(second(where).first());
                            SubLObject language = third(second(second(where)));
                            return com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache.sksi_language_spoken_person_language_check(person, language);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject generate_language_spoken_boolean_from_csql(final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list4);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list4);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list4);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list4);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!fields.equal($list8))) {
                Errors.error($str9$CSQL_expression__a_selects_fields, csql);
            }
            final SubLObject person = third(second(where).first());
            final SubLObject language = third(second(second(where)));
            return sksi_language_spoken_person_language_check(person, language);
        }
        cdestructuring_bind_error(csql, $list4);
        return NIL;
    }

    public static final SubLObject sksi_store_or_delete_raw_value_in_language_spoken_cache_alt(SubLObject csql) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = csql;
                SubLObject current = datum;
                SubLObject operator_keyword = NIL;
                SubLObject into_or_from = NIL;
                SubLObject fields = NIL;
                SubLObject field_values = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt10);
                operator_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                into_or_from = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                fields = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt10);
                field_values = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_1 = field_values;
                        SubLObject current_2 = datum_1;
                        SubLObject values_keyword = NIL;
                        SubLObject field_value_list = NIL;
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt11);
                        values_keyword = current_2.first();
                        current_2 = current_2.rest();
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt11);
                        field_value_list = current_2.first();
                        current_2 = current_2.rest();
                        if (NIL == current_2) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($VALUES != values_keyword) {
                                    Errors.error($str_alt13$malformed_csql_subexpression__a__, values_keyword);
                                }
                            }
                            {
                                SubLObject pcase_var = operator_keyword;
                                if (pcase_var.eql($INSERT)) {
                                    $sksi_language_spoken_table$.setGlobalValue(cons(field_value_list, $sksi_language_spoken_table$.getGlobalValue()));
                                } else {
                                    if (pcase_var.eql($DELETE)) {
                                        $sksi_language_spoken_table$.setGlobalValue(remove(field_value_list, $sksi_language_spoken_table$.getGlobalValue(), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    }
                                }
                            }
                            return $sksi_language_spoken_table$.getGlobalValue();
                        } else {
                            cdestructuring_bind_error(datum_1, $list_alt11);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt10);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_store_or_delete_raw_value_in_language_spoken_cache(final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator_keyword = NIL;
        SubLObject into_or_from = NIL;
        SubLObject fields = NIL;
        SubLObject field_values = NIL;
        destructuring_bind_must_consp(csql, csql, $list10);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list10);
        into_or_from = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list10);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list10);
        field_values = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = field_values;
            SubLObject values_keyword = NIL;
            SubLObject field_value_list = NIL;
            destructuring_bind_must_consp(current_$2, datum_$1, $list11);
            values_keyword = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list11);
            field_value_list = current_$2.first();
            current_$2 = current_$2.rest();
            if (NIL == current_$2) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($VALUES != values_keyword)) {
                    Errors.error($str13$malformed_csql_subexpression__a__, values_keyword);
                }
                final SubLObject pcase_var = operator_keyword;
                if (pcase_var.eql($INSERT)) {
                    $sksi_language_spoken_table$.setGlobalValue(cons(field_value_list, $sksi_language_spoken_table$.getGlobalValue()));
                } else
                    if (pcase_var.eql($DELETE)) {
                        $sksi_language_spoken_table$.setGlobalValue(remove(field_value_list, $sksi_language_spoken_table$.getGlobalValue(), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }

                return $sksi_language_spoken_table$.getGlobalValue();
            }
            cdestructuring_bind_error(datum_$1, $list11);
        } else {
            cdestructuring_bind_error(csql, $list10);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_cache_file() {
        declareFunction("sksi_language_spoken_person_language_check_guts", "SKSI-LANGUAGE-SPOKEN-PERSON-LANGUAGE-CHECK-GUTS", 2, 0, false);
        declareFunction("sksi_language_spoken_persons_by_language_guts", "SKSI-LANGUAGE-SPOKEN-PERSONS-BY-LANGUAGE-GUTS", 1, 0, false);
        declareFunction("sksi_language_spoken_languages_by_person_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-BY-PERSON-GUTS", 1, 0, false);
        declareFunction("sksi_language_spoken_languages_and_persons_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-AND-PERSONS-GUTS", 0, 0, false);
        declareFunction("sksi_language_spoken_persons_guts", "SKSI-LANGUAGE-SPOKEN-PERSONS-GUTS", 0, 0, false);
        declareFunction("sksi_language_spoken_languages_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS", 0, 0, false);
        declareFunction("sksi_language_spoken_person_language_check", "SKSI-LANGUAGE-SPOKEN-PERSON-LANGUAGE-CHECK", 2, 0, false);
        declareFunction("sksi_language_spoken_persons_by_language", "SKSI-LANGUAGE-SPOKEN-PERSONS-BY-LANGUAGE", 1, 0, false);
        declareFunction("sksi_language_spoken_languages_by_person", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-BY-PERSON", 1, 0, false);
        declareFunction("sksi_language_spoken_languages_and_persons", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-AND-PERSONS", 0, 0, false);
        declareFunction("sksi_language_spoken_persons", "SKSI-LANGUAGE-SPOKEN-PERSONS", 0, 0, false);
        declareFunction("sksi_language_spoken_languages", "SKSI-LANGUAGE-SPOKEN-LANGUAGES", 0, 0, false);
        declareFunction("generate_language_spoken_iterator_from_csql", "GENERATE-LANGUAGE-SPOKEN-ITERATOR-FROM-CSQL", 1, 0, false);
        declareFunction("generate_language_spoken_boolean_from_csql", "GENERATE-LANGUAGE-SPOKEN-BOOLEAN-FROM-CSQL", 1, 0, false);
        declareFunction("sksi_store_or_delete_raw_value_in_language_spoken_cache", "SKSI-STORE-OR-DELETE-RAW-VALUE-IN-LANGUAGE-SPOKEN-CACHE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_cache_file() {
        deflexical("*SKSI-LANGUAGE-SPOKEN-TABLE*", $list0);
        deflexical("*SKSI-LANGUAGE-SPOKEN-TABLE-NAME*", $str1$Person_Languages);
        deflexical("*SKSI-LANGUAGE-SPOKEN-FIELD-LIST*", $list2);
        return NIL;
    }

    public static SubLObject setup_sksi_cache_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_cache_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ list(makeString("Goolsbey"), makeString("EnglishLanguage")), list(makeString("Goolsbey"), makeString("GermanLanguage")), list(makeString("Kahlert"), makeString("EnglishLanguage")), list(makeString("Kahlert"), makeString("GermanLanguage")), list(makeString("Pace"), makeString("EnglishLanguage")), list(makeString("Pace"), makeString("FinnishLanguage")), list(makeString("Hagen"), makeString("Magyarul")), list(makeString("SDeVoy"), makeString("EnglishLanguage")), list(makeString("SDeVoy"), makeString("SpanishLanguage")), list(makeString("Zelal"), makeString("Turkce")) });

    static private final SubLString $str_alt1$Person_Languages = makeString("Person_Languages");

    static private final SubLList $list_alt2 = list(makeString("PERSON"), makeString("LANGUAGE"));

    static private final SubLList $list_alt3 = list(makeSymbol("TUPLE-PERSON"), makeSymbol("TUPLE-LANGUAGE"));

    static private final SubLList $list_alt4 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLString $str_alt7$boolean_CSQL_expression__a_encoun = makeString("boolean CSQL expression ~a encountered when select expression expected");

    static private final SubLList $list_alt8 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    static private final SubLString $str_alt9$CSQL_expression__a_selects_fields = makeString("CSQL expression ~a selects fields, not a boolean check expression");

    static private final SubLList $list_alt10 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("INTO-OR-FROM"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"));

    static private final SubLList $list_alt11 = list(makeSymbol("VALUES-KEYWORD"), makeSymbol("FIELD-VALUE-LIST"));

    static private final SubLString $str_alt13$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :values");
}

/**
 * Total time: 110 ms
 */

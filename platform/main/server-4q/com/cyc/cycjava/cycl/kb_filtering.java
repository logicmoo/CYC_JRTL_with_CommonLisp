/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-FILTERING
 * source file: /cyc/top/cycl/kb-filtering.lisp
 * created:     2019/07/03 17:37:51
 */
public final class kb_filtering extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kb_filtering();







    // Definitions
    /**
     * returns all #$CycLConstants such that
     * #$myCreationPurpose of each constant is in PROJECTS and
     * #$myCreationTime is between START-DATE and END-DATE inclusive.
     *
     * @param PROJECTS
     * 		; a #$Cyc-BasedProject or a list of them.
     * @param START-DATE
     * 		; a #$CycUniversalDate
     * @param END-DATE
     * 		; a #$CycUniversalDate
     * @param CYCLIST
     * 		; a #$Cyclist.
     */
    @LispMethod(comment = "returns all #$CycLConstants such that\r\n#$myCreationPurpose of each constant is in PROJECTS and\r\n#$myCreationTime is between START-DATE and END-DATE inclusive.\r\n\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or a list of them.\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate\r\n@param CYCLIST\r\n\t\t; a #$Cyclist.\nreturns all #$CycLConstants such that\n#$myCreationPurpose of each constant is in PROJECTS and\n#$myCreationTime is between START-DATE and END-DATE inclusive.")
    public static final SubLObject constants_for_projects_between_alt(SubLObject projects, SubLObject start_date, SubLObject end_date, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (NIL != forts.fort_p(projects)) {
            projects = list(projects);
        }
        return com.cyc.cycjava.cycl.kb_filtering.filter_constants_by_projects(kb_utilities.constants_created_between(start_date, end_date, cyclist), projects);
    }

    @LispMethod(comment = "returns all #$CycLConstants such that\r\n#$myCreationPurpose of each constant is in PROJECTS and\r\n#$myCreationTime is between START-DATE and END-DATE inclusive.\r\n\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or a list of them.\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate\r\n@param CYCLIST\r\n\t\t; a #$Cyclist.\nreturns all #$CycLConstants such that\n#$myCreationPurpose of each constant is in PROJECTS and\n#$myCreationTime is between START-DATE and END-DATE inclusive.")
    public static SubLObject constants_for_projects_between(SubLObject projects, final SubLObject start_date, final SubLObject end_date, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (NIL != forts.fort_p(projects)) {
            projects = list(projects);
        }
        return filter_constants_by_projects(kb_utilities.constants_created_between(start_date, end_date, cyclist), projects);
    }

    /**
     * returns all #$CycLAssertions such that
     * #$assertionAssertPurpose of each assertion is in PROJECTS and
     * #$assertionAssertTime is between START-DATE and END-DATE inclusive.
     *
     * @param PROJECTS
     * 		; a #$Cyc-BasedProject or a list of them.
     * @param START-DATE
     * 		; a #$CycUniversalDate.
     * @param END-DATE
     * 		; a #$CycUniversalDate.
     * @param CYCLIST
     * 		; a #$Cyclist.
     */
    @LispMethod(comment = "returns all #$CycLAssertions such that\r\n#$assertionAssertPurpose of each assertion is in PROJECTS and\r\n#$assertionAssertTime is between START-DATE and END-DATE inclusive.\r\n\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or a list of them.\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param CYCLIST\r\n\t\t; a #$Cyclist.\nreturns all #$CycLAssertions such that\n#$assertionAssertPurpose of each assertion is in PROJECTS and\n#$assertionAssertTime is between START-DATE and END-DATE inclusive.")
    public static final SubLObject assertions_for_projects_between_alt(SubLObject projects, SubLObject start_date, SubLObject end_date, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (NIL != forts.fort_p(projects)) {
            projects = list(projects);
        }
        return com.cyc.cycjava.cycl.kb_filtering.filter_assertions_by_projects(kb_utilities.assertions_between(start_date, end_date, cyclist), projects);
    }

    @LispMethod(comment = "returns all #$CycLAssertions such that\r\n#$assertionAssertPurpose of each assertion is in PROJECTS and\r\n#$assertionAssertTime is between START-DATE and END-DATE inclusive.\r\n\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or a list of them.\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param CYCLIST\r\n\t\t; a #$Cyclist.\nreturns all #$CycLAssertions such that\n#$assertionAssertPurpose of each assertion is in PROJECTS and\n#$assertionAssertTime is between START-DATE and END-DATE inclusive.")
    public static SubLObject assertions_for_projects_between(SubLObject projects, final SubLObject start_date, final SubLObject end_date, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (NIL != forts.fort_p(projects)) {
            projects = list(projects);
        }
        return filter_assertions_by_projects(kb_utilities.assertions_between(start_date, end_date, cyclist), projects);
    }

    /**
     * returns CONSTANTS whose #$myCreationPurpose is in PROJECTS.
     *
     * @param CONSTANTS;
     * 		a list of constants.
     * @param PROJECTS;
     * 		a #$Cyc-BasedProject or list of them.
     */
    @LispMethod(comment = "returns CONSTANTS whose #$myCreationPurpose is in PROJECTS.\r\n\r\n@param CONSTANTS;\r\n\t\ta list of constants.\r\n@param PROJECTS;\r\n\t\ta #$Cyc-BasedProject or list of them.")
    public static final SubLObject filter_constants_by_projects_alt(SubLObject constants, SubLObject projects) {
        {
            SubLObject result = NIL;
            if (projects.isAtom()) {
                projects = list(projects);
            }
            {
                SubLObject cdolist_list_var = constants;
                SubLObject v_const = NIL;
                for (v_const = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_const = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(bookkeeping_store.creation_purpose(v_const, UNPROVIDED), projects, UNPROVIDED, UNPROVIDED)) {
                        result = cons(v_const, result);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "returns CONSTANTS whose #$myCreationPurpose is in PROJECTS.\r\n\r\n@param CONSTANTS;\r\n\t\ta list of constants.\r\n@param PROJECTS;\r\n\t\ta #$Cyc-BasedProject or list of them.")
    public static SubLObject filter_constants_by_projects(final SubLObject constants, SubLObject projects) {
        SubLObject result = NIL;
        if (projects.isAtom()) {
            projects = list(projects);
        }
        SubLObject cdolist_list_var = constants;
        SubLObject v_const = NIL;
        v_const = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(bookkeeping_store.creation_purpose(v_const, UNPROVIDED), projects, UNPROVIDED, UNPROVIDED)) {
                result = cons(v_const, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_const = cdolist_list_var.first();
        } 
        return result;
    }/**
     * returns CONSTANTS whose #$myCreationPurpose is in PROJECTS.
     *
     * @param CONSTANTS;
     * 		a list of constants.
     * @param PROJECTS;
     * 		a #$Cyc-BasedProject or list of them.
     */


    /**
     * returns ASSERTIONS such that their #$assertionAssertPurpose is in PROJECTS.
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param PROJECTS
     * 		; a #$Cyc-BasedProject or list of them.
     */
    @LispMethod(comment = "returns ASSERTIONS such that their #$assertionAssertPurpose is in PROJECTS.\r\n\r\n@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or list of them.")
    public static final SubLObject filter_assertions_by_projects_alt(SubLObject assertions, SubLObject projects) {
        {
            SubLObject result = NIL;
            if (projects.isAtom()) {
                projects = list(projects);
            }
            {
                SubLObject cdolist_list_var = assertions;
                SubLObject assn = NIL;
                for (assn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assn = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(assertions_high.asserted_why(assn), projects, UNPROVIDED, UNPROVIDED)) {
                        result = cons(assn, result);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "returns ASSERTIONS such that their #$assertionAssertPurpose is in PROJECTS.\r\n\r\n@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param PROJECTS\r\n\t\t; a #$Cyc-BasedProject or list of them.")
    public static SubLObject filter_assertions_by_projects(final SubLObject assertions, SubLObject projects) {
        SubLObject result = NIL;
        if (projects.isAtom()) {
            projects = list(projects);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assn = NIL;
        assn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(assertions_high.asserted_why(assn), projects, UNPROVIDED, UNPROVIDED)) {
                result = cons(assn, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assn = cdolist_list_var.first();
        } 
        return result;
    }/**
     * returns ASSERTIONS such that their #$assertionAssertPurpose is in PROJECTS.
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param PROJECTS
     * 		; a #$Cyc-BasedProject or list of them.
     */


    /**
     * returns ASSERTIONS such their #$assertionAssertBy is in CYCLISTS.
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param CYCLISTS
     * 		; a #$Cyclist or list of them
     */
    @LispMethod(comment = "returns ASSERTIONS such their #$assertionAssertBy is in CYCLISTS.\r\n\r\n@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param CYCLISTS\r\n\t\t; a #$Cyclist or list of them")
    public static final SubLObject filter_assertions_by_cyclists_alt(SubLObject assertions, SubLObject cyclists) {
        {
            SubLObject result = NIL;
            if (NIL != forts.fort_p(cyclists)) {
                cyclists = list(cyclists);
            }
            {
                SubLObject cdolist_list_var = assertions;
                SubLObject assn = NIL;
                for (assn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assn = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(assertions_high.asserted_by(assn), cyclists, UNPROVIDED, UNPROVIDED)) {
                        result = cons(assn, result);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "returns ASSERTIONS such their #$assertionAssertBy is in CYCLISTS.\r\n\r\n@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param CYCLISTS\r\n\t\t; a #$Cyclist or list of them")
    public static SubLObject filter_assertions_by_cyclists(final SubLObject assertions, SubLObject cyclists) {
        SubLObject result = NIL;
        if (NIL != forts.fort_p(cyclists)) {
            cyclists = list(cyclists);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assn = NIL;
        assn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(assertions_high.asserted_by(assn), cyclists, UNPROVIDED, UNPROVIDED)) {
                result = cons(assn, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assn = cdolist_list_var.first();
        } 
        return result;
    }/**
     * returns ASSERTIONS such their #$assertionAssertBy is in CYCLISTS.
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param CYCLISTS
     * 		; a #$Cyclist or list of them
     */


    /**
     *
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param START-DATE
     * 		; a #$CycUniversalDate.
     * @param END-DATE
     * 		; a #$CycUniversalDate.
     * 		
     * 		returns a list of assertions such that #$assertionAssertTime (i.e. their assertion date) is between
     * 		START-DATE and END-DATE inclusive.
     */
    @LispMethod(comment = "@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate.\r\n\t\t\r\n\t\treturns a list of assertions such that #$assertionAssertTime (i.e. their assertion date) is between\r\n\t\tSTART-DATE and END-DATE inclusive.")
    public static final SubLObject filter_assertions_by_dates_alt(SubLObject assertions, SubLObject start_date, SubLObject end_date) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assn = NIL;
            for (assn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assn = cdolist_list_var.first()) {
                {
                    SubLObject date = assertions_high.asserted_when(assn);
                    if (((NIL != date) && date.numGE(start_date)) && date.numLE(end_date)) {
                        result = cons(assn, result);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param ASSERTIONS
     * 		; a list of #$Assertions
     * @param START-DATE
     * 		; a #$CycUniversalDate.
     * @param END-DATE
     * 		; a #$CycUniversalDate.
     * 		
     * 		returns a list of assertions such that #$assertionAssertTime (i.e. their assertion date) is between
     * 		START-DATE and END-DATE inclusive.
     */
    @LispMethod(comment = "@param ASSERTIONS\r\n\t\t; a list of #$Assertions\r\n@param START-DATE\r\n\t\t; a #$CycUniversalDate.\r\n@param END-DATE\r\n\t\t; a #$CycUniversalDate.\r\n\t\t\r\n\t\treturns a list of assertions such that #$assertionAssertTime (i.e. their assertion date) is between\r\n\t\tSTART-DATE and END-DATE inclusive.")
    public static SubLObject filter_assertions_by_dates(final SubLObject assertions, final SubLObject start_date, final SubLObject end_date) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assn = NIL;
        assn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date = assertions_high.asserted_when(assn);
            if (((NIL != date) && date.numGE(start_date)) && date.numLE(end_date)) {
                result = cons(assn, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assn = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * Returns T if TERM is not a legal arg 2 for #$myCreationPurpose.  Errors out if TERM is not a fort.
     */
    @LispMethod(comment = "Returns T if TERM is not a legal arg 2 for #$myCreationPurpose.  Errors out if TERM is not a fort.")
    public static final SubLObject my_creation_purpose_arg2_okP_alt(SubLObject v_term) {
        return at_admitted.admitted_argumentP(v_term, TWO_INTEGER, $$myCreationPurpose, $$BookkeepingMt);
    }

    @LispMethod(comment = "Returns T if TERM is not a legal arg 2 for #$myCreationPurpose.  Errors out if TERM is not a fort.")
    public static SubLObject my_creation_purpose_arg2_okP(final SubLObject v_term) {
        return at_admitted.admitted_argumentP(v_term, TWO_INTEGER, $$myCreationPurpose, $$BookkeepingMt);
    }/**
     * Returns T if TERM is not a legal arg 2 for #$myCreationPurpose.  Errors out if TERM is not a fort.
     */


    public static SubLObject declare_kb_filtering_file() {
        declareFunction("constants_for_projects_between", "CONSTANTS-FOR-PROJECTS-BETWEEN", 3, 1, false);
        declareFunction("assertions_for_projects_between", "ASSERTIONS-FOR-PROJECTS-BETWEEN", 3, 1, false);
        declareFunction("filter_constants_by_projects", "FILTER-CONSTANTS-BY-PROJECTS", 2, 0, false);
        declareFunction("filter_assertions_by_projects", "FILTER-ASSERTIONS-BY-PROJECTS", 2, 0, false);
        declareFunction("filter_assertions_by_cyclists", "FILTER-ASSERTIONS-BY-CYCLISTS", 2, 0, false);
        declareFunction("filter_assertions_by_dates", "FILTER-ASSERTIONS-BY-DATES", 3, 0, false);
        declareFunction("my_creation_purpose_arg2_okP", "MY-CREATION-PURPOSE-ARG2-OK?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_filtering_file() {
        return NIL;
    }

    public static SubLObject setup_kb_filtering_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_filtering_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_filtering_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_filtering_file();
    }

    static {
    }
}

/**
 * Total time: 100 ms
 */

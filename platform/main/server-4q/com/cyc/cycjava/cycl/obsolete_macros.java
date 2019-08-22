package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class obsolete_macros extends SubLTranslatedFile {
    public static final SubLFile me = new obsolete_macros();

    public static final String myName = "com.cyc.cycjava.cycl.obsolete_macros";

    public static final String myFingerPrint = "e50e4d64f3f3c35f003e4fc623b37b2e482f37b96303cb18c4d72edea69aa80d";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("ATT")), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLSymbol HTML_MARKUP_WRAPPER = makeSymbol("HTML-MARKUP-WRAPPER");

    public static final SubLList $list4 = list(makeSymbol("*HTML-FORM-HEAD*"), makeSymbol("*HTML-FORM-TAIL*"));



    public static final SubLList $list6 = list(list(makeSymbol("*HTML-SAFE-PRINT*"), NIL));

    public static final SubLSymbol HTML_ATTRIBUTE = makeSymbol("HTML-ATTRIBUTE");

    public static final SubLList $list8 = list(makeSymbol("*HTML-FORM-ACTION*"));

    public static final SubLList $list9 = list(makeSymbol("*HTML-FORM-METHOD*"));

    public static final SubLSymbol HTML_MARKUP_BODY = makeSymbol("HTML-MARKUP-BODY");

    public static final SubLList $list11 = list(list(makeSymbol("*WITHIN-HTML-FORM*"), T));

    public static final SubLList $list12 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*HTML-INPUT-HEAD*"));

    public static final SubLList $list13 = list(list(makeSymbol("HTML-CHAR"), CHAR_greater));

    public static final SubLList $list14 = list(makeSymbol("*HTML-INPUT-TYPE*"));

    public static final SubLList $list15 = list(makeSymbol("*HTML-INPUT-NAME*"));

    public static final SubLList $list16 = list(makeSymbol("*HTML-INPUT-VALUE*"));

    public static final SubLList $list17 = list(list(makeSymbol("*HTML-SAFE-PRINT*"), T));

    public static final SubLList $list18 = list(makeSymbol("*HTML-INPUT-SIZE*"));

    public static final SubLList $list19 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*HTML-INPUT-CHECKED*"));

    public static final SubLList $list20 = list(makeSymbol("*HTML-SELECT-HEAD*"), makeSymbol("*HTML-SELECT-TAIL*"));

    public static final SubLList $list21 = list(makeSymbol("*HTML-SELECT-NAME*"));

    public static final SubLList $list22 = list(makeSymbol("*HTML-SELECT-SIZE*"));

    public static final SubLList $list23 = list(makeSymbol("HTML-PRINC"), makeSymbol("*HTML-SELECT-MULTIPLE*"));

    public static final SubLList $list24 = list(makeSymbol("*HTML-OPTION-HEAD*"), makeSymbol("*HTML-OPTION-TAIL*"));

    public static final SubLList $list25 = list(makeSymbol("HTML-PRINC"), makeSymbol("*HTML-OPTION-SELECTED*"));

    public static final SubLList $list26 = list(makeSymbol("*HTML-TEXTAREA-HEAD*"), makeSymbol("*HTML-TEXTAREA-TAIL*"));

    public static final SubLList $list27 = list(makeSymbol("*HTML-TEXTAREA-NAME*"));

    public static final SubLList $list28 = list(makeSymbol("*HTML-TEXTAREA-COLS*"));

    public static final SubLList $list29 = list(makeSymbol("*HTML-TEXTAREA-ROWS*"));

    public static final SubLList $list30 = list(makeSymbol("*HTML-ANCHOR-HEAD*"), makeSymbol("*HTML-ANCHOR-TAIL*"));

    public static final SubLList $list31 = list(makeSymbol("*HTML-ANCHOR-HREF*"));

    public static final SubLList $list32 = list(makeSymbol("*HTML-ANCHOR-NAME*"));

    public static final SubLList $list33 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*HTML-IMAGE-HEAD*"));

    public static final SubLList $list34 = list(makeSymbol("*HTML-IMAGE-SRC*"));

    public static final SubLList $list35 = list(makeSymbol("*HTML-IMAGE-ALT*"));

    public static final SubLList $list36 = list(makeSymbol("*HTML-IMAGE-BORDER*"));

    public static final SubLList $list37 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_AS = makeSymbol("MAP-AS");

    public static final SubLList $list39 = list(makeSymbol("DO-GAF-ARG-INDEX"));











    public static final SubLList $list45 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_AS_IN_MT = makeSymbol("MAP-AS-IN-MT");

    public static final SubLList $list47 = list(makeSymbol("WITH-JUST-MT"), makeSymbol("DO-GAF-ARG-INDEX"));

    public static final SubLSymbol WITH_JUST_MT = makeSymbol("WITH-JUST-MT");

    public static final SubLList $list49 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_AS_IN_MTS = makeSymbol("MAP-AS-IN-MTS");

    public static final SubLList $list51 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("DO-GAF-ARG-INDEX"));



    public static final SubLSymbol MAP_AS_IN_ANY_MT = makeSymbol("MAP-AS-IN-ANY-MT");

    public static final SubLList $list54 = list(makeSymbol("WITH-ALL-MTS"), makeSymbol("DO-GAF-ARG-INDEX"));



    public static final SubLList $list56 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_AS_IN_RELEVANT_MTS = makeSymbol("MAP-AS-IN-RELEVANT-MTS");

    public static final SubLList $list58 = list(makeSymbol("POSSIBLY-IN-MT"), makeSymbol("DO-GAF-ARG-INDEX"));



    public static final SubLList $list60 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_US = makeSymbol("MAP-US");

    public static final SubLList $list62 = list(makeSymbol("DO-GAF-ARG-INDEX-VALUES"));

    public static final SubLSymbol DO_GAF_ARG_INDEX_VALUES = makeSymbol("DO-GAF-ARG-INDEX-VALUES");

    public static final SubLList $list64 = list(list(new SubLObject[]{ makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), makeSymbol("TRUTH") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_US_IN_MT = makeSymbol("MAP-US-IN-MT");

    public static final SubLList $list66 = list(makeSymbol("WITH-JUST-MT"), makeSymbol("DO-GAF-ARG-INDEX-VALUES"));

    public static final SubLList $list67 = list(list(new SubLObject[]{ makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), makeSymbol("TRUTH") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_US_IN_MTS = makeSymbol("MAP-US-IN-MTS");

    public static final SubLList $list69 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("DO-GAF-ARG-INDEX-VALUES"));

    public static final SubLSymbol MAP_US_IN_ANY_MT = makeSymbol("MAP-US-IN-ANY-MT");

    public static final SubLList $list71 = list(makeSymbol("WITH-ALL-MTS"), makeSymbol("DO-GAF-ARG-INDEX-VALUES"));

    public static final SubLList $list72 = list(list(new SubLObject[]{ makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), makeSymbol("TRUTH") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol MAP_US_IN_RELEVANT_MTS = makeSymbol("MAP-US-IN-RELEVANT-MTS");

    public static final SubLList $list74 = list(makeSymbol("POSSIBLY-IN-MT"), makeSymbol("DO-GAF-ARG-INDEX-VALUES"));

    public static final SubLSymbol DO_ARG_INDEX = makeSymbol("DO-ARG-INDEX");

    public static final SubLSymbol DO_ARG_INDEX_IN_MT = makeSymbol("DO-ARG-INDEX-IN-MT");

    public static final SubLSymbol DO_ARG_INDEX_IN_MTS = makeSymbol("DO-ARG-INDEX-IN-MTS");

    public static final SubLSymbol DO_ARG_INDEX_IN_ANY_MT = makeSymbol("DO-ARG-INDEX-IN-ANY-MT");

    public static final SubLSymbol DO_ARG_INDEX_IN_RELEVANT_MTS = makeSymbol("DO-ARG-INDEX-IN-RELEVANT-MTS");

    public static final SubLSymbol DO_ARG_INDEX_VALUES = makeSymbol("DO-ARG-INDEX-VALUES");

    public static final SubLSymbol DO_ARG_INDEX_VALUES_IN_MT = makeSymbol("DO-ARG-INDEX-VALUES-IN-MT");

    public static final SubLSymbol DO_ARG_INDEX_VALUES_IN_MTS = makeSymbol("DO-ARG-INDEX-VALUES-IN-MTS");

    public static final SubLSymbol DO_ARG_INDEX_VALUES_IN_ANY_MT = makeSymbol("DO-ARG-INDEX-VALUES-IN-ANY-MT");

    public static final SubLSymbol DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS = makeSymbol("DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS");

    public static final SubLList $list85 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_PRED_INDEX = makeSymbol("DO-PRED-INDEX");

    public static final SubLList $list87 = list(makeSymbol("DO-PREDICATE-EXTENT-INDEX"));



    public static final SubLList $list89 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_PRED_INDEX_IN_MT = makeSymbol("DO-PRED-INDEX-IN-MT");

    public static final SubLList $list91 = list(makeSymbol("WITH-JUST-MT"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"));

    public static final SubLList $list92 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_PRED_INDEX_IN_MTS = makeSymbol("DO-PRED-INDEX-IN-MTS");

    public static final SubLList $list94 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"));

    public static final SubLSymbol DO_PRED_INDEX_IN_ANY_MT = makeSymbol("DO-PRED-INDEX-IN-ANY-MT");

    public static final SubLList $list96 = list(makeSymbol("WITH-ALL-MTS"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"));

    public static final SubLList $list97 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_PRED_INDEX_IN_RELEVANT_MTS = makeSymbol("DO-PRED-INDEX-IN-RELEVANT-MTS");

    public static final SubLList $list99 = list(makeSymbol("POSSIBLY-IN-MT"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"));

    public static final SubLList $list100 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol RELEVANT_PRED_MAP_AS = makeSymbol("RELEVANT-PRED-MAP-AS");

    public static final SubLList $list102 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list103 = list(makeKeyword("INDEX"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol DO_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol("DO-GAF-ARG-INDEX-RELEVANT-PRED");

    public static final SubLList $list107 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_AS = makeSymbol("GP-MAP-AS");

    public static final SubLList $list109 = list(makeSymbol("DO-GAF-ARG-INDEX-GP"));



    public static final SubLList $list111 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_AS_IN_MT = makeSymbol("GP-MAP-AS-IN-MT");

    public static final SubLList $list113 = list(makeSymbol("WITH-MT"), makeSymbol("DO-GAF-ARG-INDEX-GP"));



    public static final SubLList $list115 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_AS_IN_MTS = makeSymbol("GP-MAP-AS-IN-MTS");

    public static final SubLList $list117 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("DO-GAF-ARG-INDEX-GP"));

    public static final SubLSymbol GP_MAP_AS_IN_ANY_MT = makeSymbol("GP-MAP-AS-IN-ANY-MT");

    public static final SubLList $list119 = list(makeSymbol("WITH-ALL-MTS"), makeSymbol("DO-GAF-ARG-INDEX-GP"));

    public static final SubLSymbol GP_MAP_AS_IN_RELEVANT_MTS = makeSymbol("GP-MAP-AS-IN-RELEVANT-MTS");

    public static final SubLList $list121 = list(makeSymbol("POSSIBLY-IN-MT"), makeSymbol("DO-GAF-ARG-INDEX-GP"));

    public static final SubLList $list122 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_US = makeSymbol("GP-MAP-US");

    public static final SubLList $list124 = list(makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));

    public static final SubLSymbol DO_GAF_ARG_INDEX_VALUES_GP = makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP");

    public static final SubLList $list126 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_US_IN_MT = makeSymbol("GP-MAP-US-IN-MT");

    public static final SubLList $list128 = list(makeSymbol("WITH-MT"), makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));

    public static final SubLList $list129 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_US_IN_MTS = makeSymbol("GP-MAP-US-IN-MTS");

    public static final SubLList $list131 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));

    public static final SubLSymbol GP_MAP_US_IN_ANY_MT = makeSymbol("GP-MAP-US-IN-ANY-MT");

    public static final SubLList $list133 = list(makeSymbol("WITH-ALL-MTS"), makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));

    public static final SubLList $list134 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GP_MAP_US_IN_RELEVANT_MTS = makeSymbol("GP-MAP-US-IN-RELEVANT-MTS");

    public static final SubLList $list136 = list(makeSymbol("POSSIBLY-IN-MT"), makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));

    public static final SubLList $list137 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc NATs"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_NATs = makeString("mapping Cyc NATs");

    public static final SubLSymbol DO_NATS = makeSymbol("DO-NATS");

    public static final SubLList $list140 = list(makeSymbol("DO-NARTS"));

    public static final SubLSymbol DO_NARTS = makeSymbol("DO-NARTS");

    public static final SubLList $list142 = list(list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol WITH_PRIVATE_TCP_CONNECTION = makeSymbol("WITH-PRIVATE-TCP-CONNECTION");

    public static final SubLList $list144 = list(makeSymbol("WITH-TCP-CONNECTION"));



    public static final SubLList $list146 = list(makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));

    public static SubLObject html_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject att = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        att = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(HTML_MARKUP, att), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject html_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list4, listS(CLET, $list6, append(body, NIL)));
    }

    public static SubLObject html_form_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list8, append(body, NIL));
    }

    public static SubLObject html_form_method(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list9, append(body, NIL));
    }

    public static SubLObject html_form_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_BODY, listS(CLET, $list11, append(body, NIL)));
    }

    public static SubLObject html_input(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list12, listS(CLET, $list6, append(body, NIL)), $list13);
    }

    public static SubLObject html_input_type(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list14, append(body, NIL));
    }

    public static SubLObject html_input_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list15, append(body, NIL));
    }

    public static SubLObject html_input_value(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_ATTRIBUTE, $list16, listS(CLET, $list17, append(body, NIL)));
    }

    public static SubLObject html_input_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list18, append(body, NIL));
    }

    public static SubLObject html_input_checked(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list19;
    }

    public static SubLObject html_select(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list20, listS(CLET, $list6, append(body, NIL)));
    }

    public static SubLObject html_select_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list21, append(body, NIL));
    }

    public static SubLObject html_select_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list22, append(body, NIL));
    }

    public static SubLObject html_select_multiple(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list23;
    }

    public static SubLObject html_select_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_MARKUP_BODY, append(body, NIL));
    }

    public static SubLObject html_option(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list24, listS(CLET, $list6, append(body, NIL)));
    }

    public static SubLObject html_option_selected(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list25;
    }

    public static SubLObject html_option_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_MARKUP_BODY, append(body, NIL));
    }

    public static SubLObject html_textarea(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list26, listS(CLET, $list6, append(body, NIL)));
    }

    public static SubLObject html_textarea_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list27, append(body, NIL));
    }

    public static SubLObject html_textarea_cols(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list28, append(body, NIL));
    }

    public static SubLObject html_textarea_rows(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list29, append(body, NIL));
    }

    public static SubLObject html_textarea_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_MARKUP_BODY, append(body, NIL));
    }

    public static SubLObject html_anchor(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list30, listS(CLET, $list6, append(body, NIL)));
    }

    public static SubLObject html_anchor_href(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list31, append(body, NIL));
    }

    public static SubLObject html_anchor_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list32, append(body, NIL));
    }

    public static SubLObject html_anchor_linktext(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_MARKUP_BODY, append(body, NIL));
    }

    public static SubLObject html_image(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list33, listS(CLET, $list6, append(body, NIL)), $list13);
    }

    public static SubLObject html_image_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list34, append(body, NIL));
    }

    public static SubLObject html_image_alt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list35, append(body, NIL));
    }

    public static SubLObject html_image_border(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_ATTRIBUTE, $list36, append(body, NIL));
    }

    public static SubLObject map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_AS, $list39);
            return listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject map_as_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_AS_IN_MT, $list47);
            return list(WITH_JUST_MT, mt, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject map_as_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_AS_IN_MTS, $list51);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject map_as_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_AS_IN_ANY_MT, $list54);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_AS_IN_RELEVANT_MTS, $list58);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static SubLObject map_us(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_US, $list62);
            return listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject map_us_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_US_IN_MT, $list66);
            return list(WITH_JUST_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject map_us_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_US_IN_MTS, $list69);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    public static SubLObject map_us_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_US_IN_ANY_MT, $list71);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list72);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(MAP_US_IN_RELEVANT_MTS, $list74);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list72);
        return NIL;
    }

    public static SubLObject do_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX, $list39);
            return listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject do_arg_index_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_IN_MT, $list47);
            return list(WITH_JUST_MT, mt, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject do_arg_index_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_IN_MTS, $list51);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject do_arg_index_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list37);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_IN_ANY_MT, $list54);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject do_arg_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list56);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_IN_RELEVANT_MTS, $list58);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static SubLObject do_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_VALUES, $list62);
            return listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject do_arg_index_values_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list64);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_VALUES_IN_MT, $list66);
            return list(WITH_JUST_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject do_arg_index_values_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list67);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_VALUES_IN_MTS, $list69);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    public static SubLObject do_arg_index_values_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list60);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_VALUES_IN_ANY_MT, $list71);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject do_arg_index_values_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list72);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list72);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS, $list74);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES, list(new SubLObject[]{ var, v_term, gather_arg, $PREDICATE, pred, $INDEX, index_arg, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list72);
        return NIL;
    }

    public static SubLObject do_pred_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        done = current.first();
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list85);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_PRED_INDEX, $list87);
            return listS(DO_PREDICATE_EXTENT_INDEX, list(var, pred, $TRUTH, truth, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    public static SubLObject do_pred_index_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list89);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        mt = current.first();
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list89);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_PRED_INDEX_IN_MT, $list91);
            return list(WITH_JUST_MT, mt, listS(DO_PREDICATE_EXTENT_INDEX, list(var, pred, $TRUTH, truth, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list89);
        return NIL;
    }

    public static SubLObject do_pred_index_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        mts = current.first();
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list92);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_PRED_INDEX_IN_MTS, $list94);
            return list(WITH_MT_LIST, mts, listS(DO_PREDICATE_EXTENT_INDEX, list(var, pred, $TRUTH, truth, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list92);
        return NIL;
    }

    public static SubLObject do_pred_index_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        done = current.first();
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list85);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_PRED_INDEX_IN_ANY_MT, $list96);
            return list(WITH_ALL_MTS, listS(DO_PREDICATE_EXTENT_INDEX, list(var, pred, $TRUTH, truth, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    public static SubLObject do_pred_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list97);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list97);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_PRED_INDEX_IN_RELEVANT_MTS, $list99);
            return list(POSSIBLY_IN_MT, mt, listS(DO_PREDICATE_EXTENT_INDEX, list(var, pred, $TRUTH, truth, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list97);
        return NIL;
    }

    public static SubLObject relevant_pred_map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list100);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(RELEVANT_PRED_MAP_AS, $list39);
            return listS(DO_GAF_ARG_INDEX, list(var, v_term, $INDEX, index, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list100);
        return NIL;
    }

    public static SubLObject do_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list102);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list102);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list102);
            if (NIL == member(current_$1, $list103, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list102);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        defmacro_obsolete_warning(DO_GAF_ARG_INDEX_RELEVANT_PRED, $list39);
        return listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ assertion_var, v_term, $INDEX, index, $TRUTH, truth, $DIRECTION, direction, $DONE, done }), append(body, NIL));
    }

    public static SubLObject gp_map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list107);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list107);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_AS, $list109);
            return listS(DO_GAF_ARG_INDEX_GP, list(var, v_term, pred, $INDEX, index, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list107);
        return NIL;
    }

    public static SubLObject gp_map_as_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list111);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_AS_IN_MT, $list113);
            return list(WITH_MT, mt, listS(DO_GAF_ARG_INDEX_GP, list(var, v_term, pred, $INDEX, index, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list111);
        return NIL;
    }

    public static SubLObject gp_map_as_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list115);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_AS_IN_MTS, $list117);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX_GP, list(var, v_term, pred, $INDEX, index, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list115);
        return NIL;
    }

    public static SubLObject gp_map_as_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list107);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list107);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list107);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_AS_IN_ANY_MT, $list119);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX_GP, list(var, v_term, pred, $INDEX, index, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list107);
        return NIL;
    }

    public static SubLObject gp_map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list111);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_AS_IN_RELEVANT_MTS, $list121);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX_GP, list(var, v_term, pred, $INDEX, index, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list111);
        return NIL;
    }

    public static SubLObject gp_map_us(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list122);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list122);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list122);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_US, $list124);
            return listS(DO_GAF_ARG_INDEX_VALUES_GP, list(var, v_term, gather_arg, pred, $INDEX, index_arg, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list122);
        return NIL;
    }

    public static SubLObject gp_map_us_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list126);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list126);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list126);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_US_IN_MT, $list128);
            return list(WITH_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES_GP, list(var, v_term, gather_arg, pred, $INDEX, index_arg, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list126);
        return NIL;
    }

    public static SubLObject gp_map_us_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        SubLObject mts = NIL;
        destructuring_bind_must_consp(current, datum, $list129);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list129);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list129);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_US_IN_MTS, $list131);
            return list(WITH_MT_LIST, mts, listS(DO_GAF_ARG_INDEX_VALUES_GP, list(var, v_term, gather_arg, pred, $INDEX, index_arg, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list129);
        return NIL;
    }

    public static SubLObject gp_map_us_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list122);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list122);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list122);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_US_IN_ANY_MT, $list133);
            return list(WITH_ALL_MTS, listS(DO_GAF_ARG_INDEX_VALUES_GP, list(var, v_term, gather_arg, pred, $INDEX, index_arg, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list122);
        return NIL;
    }

    public static SubLObject gp_map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list134);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list134);
        current = current.rest();
        final SubLObject index_arg = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list134);
        current = current.rest();
        final SubLObject gather_arg = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list134);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(GP_MAP_US_IN_RELEVANT_MTS, $list136);
            return list(POSSIBLY_IN_MT, mt, listS(DO_GAF_ARG_INDEX_VALUES_GP, list(var, v_term, gather_arg, pred, $INDEX, index_arg, $DONE, done), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list134);
        return NIL;
    }

    public static SubLObject do_nats(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        var = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$mapping_Cyc_NATs;
        destructuring_bind_must_listp(current, datum, $list137);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DO_NATS, $list140);
            return listS(DO_NARTS, list(var, message), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list137);
        return NIL;
    }

    public static SubLObject with_private_tcp_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bi_stream = NIL;
        SubLObject host = NIL;
        SubLObject port = NIL;
        destructuring_bind_must_consp(current, datum, $list142);
        bi_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        host = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        port = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(WITH_PRIVATE_TCP_CONNECTION, $list144);
            return listS(WITH_TCP_CONNECTION, listS(bi_stream, host, port, $list146), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list142);
        return NIL;
    }

    public static SubLObject declare_obsolete_macros_file() {
        declareMacro(me, "html_attribute", "HTML-ATTRIBUTE");
        declareMacro(me, "html_form", "HTML-FORM");
        declareMacro(me, "html_form_url", "HTML-FORM-URL");
        declareMacro(me, "html_form_method", "HTML-FORM-METHOD");
        declareMacro(me, "html_form_body", "HTML-FORM-BODY");
        declareMacro(me, "html_input", "HTML-INPUT");
        declareMacro(me, "html_input_type", "HTML-INPUT-TYPE");
        declareMacro(me, "html_input_name", "HTML-INPUT-NAME");
        declareMacro(me, "html_input_value", "HTML-INPUT-VALUE");
        declareMacro(me, "html_input_size", "HTML-INPUT-SIZE");
        declareMacro(me, "html_input_checked", "HTML-INPUT-CHECKED");
        declareMacro(me, "html_select", "HTML-SELECT");
        declareMacro(me, "html_select_name", "HTML-SELECT-NAME");
        declareMacro(me, "html_select_size", "HTML-SELECT-SIZE");
        declareMacro(me, "html_select_multiple", "HTML-SELECT-MULTIPLE");
        declareMacro(me, "html_select_body", "HTML-SELECT-BODY");
        declareMacro(me, "html_option", "HTML-OPTION");
        declareMacro(me, "html_option_selected", "HTML-OPTION-SELECTED");
        declareMacro(me, "html_option_body", "HTML-OPTION-BODY");
        declareMacro(me, "html_textarea", "HTML-TEXTAREA");
        declareMacro(me, "html_textarea_name", "HTML-TEXTAREA-NAME");
        declareMacro(me, "html_textarea_cols", "HTML-TEXTAREA-COLS");
        declareMacro(me, "html_textarea_rows", "HTML-TEXTAREA-ROWS");
        declareMacro(me, "html_textarea_body", "HTML-TEXTAREA-BODY");
        declareMacro(me, "html_anchor", "HTML-ANCHOR");
        declareMacro(me, "html_anchor_href", "HTML-ANCHOR-HREF");
        declareMacro(me, "html_anchor_name", "HTML-ANCHOR-NAME");
        declareMacro(me, "html_anchor_linktext", "HTML-ANCHOR-LINKTEXT");
        declareMacro(me, "html_image", "HTML-IMAGE");
        declareMacro(me, "html_image_url", "HTML-IMAGE-URL");
        declareMacro(me, "html_image_alt", "HTML-IMAGE-ALT");
        declareMacro(me, "html_image_border", "HTML-IMAGE-BORDER");
        declareMacro(me, "map_as", "MAP-AS");
        declareMacro(me, "map_as_in_mt", "MAP-AS-IN-MT");
        declareMacro(me, "map_as_in_mts", "MAP-AS-IN-MTS");
        declareMacro(me, "map_as_in_any_mt", "MAP-AS-IN-ANY-MT");
        declareMacro(me, "map_as_in_relevant_mts", "MAP-AS-IN-RELEVANT-MTS");
        declareMacro(me, "map_us", "MAP-US");
        declareMacro(me, "map_us_in_mt", "MAP-US-IN-MT");
        declareMacro(me, "map_us_in_mts", "MAP-US-IN-MTS");
        declareMacro(me, "map_us_in_any_mt", "MAP-US-IN-ANY-MT");
        declareMacro(me, "map_us_in_relevant_mts", "MAP-US-IN-RELEVANT-MTS");
        declareMacro(me, "do_arg_index", "DO-ARG-INDEX");
        declareMacro(me, "do_arg_index_in_mt", "DO-ARG-INDEX-IN-MT");
        declareMacro(me, "do_arg_index_in_mts", "DO-ARG-INDEX-IN-MTS");
        declareMacro(me, "do_arg_index_in_any_mt", "DO-ARG-INDEX-IN-ANY-MT");
        declareMacro(me, "do_arg_index_in_relevant_mts", "DO-ARG-INDEX-IN-RELEVANT-MTS");
        declareMacro(me, "do_arg_index_values", "DO-ARG-INDEX-VALUES");
        declareMacro(me, "do_arg_index_values_in_mt", "DO-ARG-INDEX-VALUES-IN-MT");
        declareMacro(me, "do_arg_index_values_in_mts", "DO-ARG-INDEX-VALUES-IN-MTS");
        declareMacro(me, "do_arg_index_values_in_any_mt", "DO-ARG-INDEX-VALUES-IN-ANY-MT");
        declareMacro(me, "do_arg_index_values_in_relevant_mts", "DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS");
        declareMacro(me, "do_pred_index", "DO-PRED-INDEX");
        declareMacro(me, "do_pred_index_in_mt", "DO-PRED-INDEX-IN-MT");
        declareMacro(me, "do_pred_index_in_mts", "DO-PRED-INDEX-IN-MTS");
        declareMacro(me, "do_pred_index_in_any_mt", "DO-PRED-INDEX-IN-ANY-MT");
        declareMacro(me, "do_pred_index_in_relevant_mts", "DO-PRED-INDEX-IN-RELEVANT-MTS");
        declareMacro(me, "relevant_pred_map_as", "RELEVANT-PRED-MAP-AS");
        declareMacro(me, "do_gaf_arg_index_relevant_pred", "DO-GAF-ARG-INDEX-RELEVANT-PRED");
        declareMacro(me, "gp_map_as", "GP-MAP-AS");
        declareMacro(me, "gp_map_as_in_mt", "GP-MAP-AS-IN-MT");
        declareMacro(me, "gp_map_as_in_mts", "GP-MAP-AS-IN-MTS");
        declareMacro(me, "gp_map_as_in_any_mt", "GP-MAP-AS-IN-ANY-MT");
        declareMacro(me, "gp_map_as_in_relevant_mts", "GP-MAP-AS-IN-RELEVANT-MTS");
        declareMacro(me, "gp_map_us", "GP-MAP-US");
        declareMacro(me, "gp_map_us_in_mt", "GP-MAP-US-IN-MT");
        declareMacro(me, "gp_map_us_in_mts", "GP-MAP-US-IN-MTS");
        declareMacro(me, "gp_map_us_in_any_mt", "GP-MAP-US-IN-ANY-MT");
        declareMacro(me, "gp_map_us_in_relevant_mts", "GP-MAP-US-IN-RELEVANT-MTS");
        declareMacro(me, "do_nats", "DO-NATS");
        declareMacro(me, "with_private_tcp_connection", "WITH-PRIVATE-TCP-CONNECTION");
        return NIL;
    }

    public static SubLObject init_obsolete_macros_file() {
        return NIL;
    }

    public static SubLObject setup_obsolete_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_obsolete_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_obsolete_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_obsolete_macros_file();
    }

    
}

/**
 * Total time: 480 ms
 */

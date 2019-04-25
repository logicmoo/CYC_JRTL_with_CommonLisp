package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_generation_api_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_generation_api_macros";
    public static final String myFingerPrint = "4f2e68e8ce89f6ffbf72c7debbe300c02f18331051c65abe750492046e3af350";
    private static final SubLSymbol $sym0$CYCL_TERM_TO_NL_STRING;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$PPH_PARAMS;
    private static final SubLSymbol $kw5$DEFAULT;
    private static final SubLSymbol $sym6$CYCL_TERM_TO_NL_STRING_INTERNAL;
    private static final SubLSymbol $sym7$CYCL_TERM_TO_NL;
    private static final SubLSymbol $sym8$CYCL_TERM_TO_NL_INTERNAL;
    private static final SubLSymbol $sym9$CYCL_TERMS_TO_NL;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CYCL_TERMS_TO_NL_INTERNAL;
    private static final SubLSymbol $sym12$CYCL_TERMS_TO_NL_STRINGS;
    private static final SubLSymbol $sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL;
    private static final SubLSymbol $sym14$CYCL_TERM_TO_SEARCH_QUERY;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$ENGINE;
    private static final SubLSymbol $kw18$MAX_WORDS;
    private static final SubLSymbol $sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL;
    private static final SubLSymbol $sym20$PPH_OUTPUT_MAP_TO_TEXT;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$USE_BULLETED_LISTS_;
    private static final SubLSymbol $kw24$BULLETED_LIST_INDENT_LEVEL;
    private static final SubLSymbol $kw25$ALLOW_UTF8_;
    private static final SubLSymbol $kw26$USE_BLANKS_FOR_VARS_;
    private static final SubLSymbol $sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL;
    private static final SubLSymbol $sym28$PPH_OUTPUT_MAP_TO_HTML;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$TAG_FUNCTION;
    private static final SubLSymbol $sym32$PPH_ANCHOR_TAGS_FOR_TERM;
    private static final SubLSymbol $kw33$LINK_ARG0_;
    private static final SubLSymbol $sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL;
    private static final SubLSymbol $sym35$QUOTE;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 854L)
    public static SubLObject cycl_term_to_nl_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list1);
        cycl_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$1 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list1);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$1, (SubLObject)nl_generation_api_macros.$list2, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$1 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list1);
        }
        final SubLObject pph_params_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw4$PPH_PARAMS, current);
        final SubLObject pph_params = (SubLObject)((nl_generation_api_macros.NIL != pph_params_tail) ? conses_high.cadr(pph_params_tail) : nl_generation_api_macros.$kw5$DEFAULT);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym6$CYCL_TERM_TO_NL_STRING_INTERNAL, cycl_term, pph_params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 1021L)
    public static SubLObject cycl_term_to_nl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list1);
        cycl_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$2 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list1);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list1);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$2, (SubLObject)nl_generation_api_macros.$list2, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$2 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list1);
        }
        final SubLObject pph_params_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw4$PPH_PARAMS, current);
        final SubLObject pph_params = (SubLObject)((nl_generation_api_macros.NIL != pph_params_tail) ? conses_high.cadr(pph_params_tail) : nl_generation_api_macros.$kw5$DEFAULT);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym8$CYCL_TERM_TO_NL_INTERNAL, cycl_term, pph_params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 1173L)
    public static SubLObject cycl_terms_to_nl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term_list = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list10);
        cycl_term_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$3 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list10);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list10);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$3, (SubLObject)nl_generation_api_macros.$list2, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$3 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list10);
        }
        final SubLObject pph_params_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw4$PPH_PARAMS, current);
        final SubLObject pph_params = (SubLObject)((nl_generation_api_macros.NIL != pph_params_tail) ? conses_high.cadr(pph_params_tail) : nl_generation_api_macros.$kw5$DEFAULT);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym11$CYCL_TERMS_TO_NL_INTERNAL, cycl_term_list, pph_params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2103L)
    public static SubLObject cycl_terms_to_nl_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term_list = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list10);
        cycl_term_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$4 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list10);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list10);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$4, (SubLObject)nl_generation_api_macros.$list2, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$4 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list10);
        }
        final SubLObject pph_params_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw4$PPH_PARAMS, current);
        final SubLObject pph_params = (SubLObject)((nl_generation_api_macros.NIL != pph_params_tail) ? conses_high.cadr(pph_params_tail) : nl_generation_api_macros.$kw5$DEFAULT);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL, cycl_term_list, pph_params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2283L)
    public static SubLObject cycl_term_to_search_query(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list15);
        cycl_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$5 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list15);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list15);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$5, (SubLObject)nl_generation_api_macros.$list16, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$5 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list15);
        }
        final SubLObject engine_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw17$ENGINE, current);
        final SubLObject engine = (SubLObject)((nl_generation_api_macros.NIL != engine_tail) ? conses_high.cadr(engine_tail) : nl_generation_api_macros.NIL);
        final SubLObject max_words_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw18$MAX_WORDS, current);
        final SubLObject max_words = (SubLObject)((nl_generation_api_macros.NIL != max_words_tail) ? conses_high.cadr(max_words_tail) : nl_generation_api_macros.NIL);
        final SubLObject pph_params_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw4$PPH_PARAMS, current);
        final SubLObject pph_params = (SubLObject)((nl_generation_api_macros.NIL != pph_params_tail) ? conses_high.cadr(pph_params_tail) : nl_generation_api_macros.$kw5$DEFAULT);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, cycl_term, engine, max_words, pph_params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2506L)
    public static SubLObject pph_output_map_to_text(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list21);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$6 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list21);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list21);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$6, (SubLObject)nl_generation_api_macros.$list22, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$6 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list21);
        }
        final SubLObject use_bulleted_listsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw23$USE_BULLETED_LISTS_, current);
        final SubLObject use_bulleted_listsP = (SubLObject)((nl_generation_api_macros.NIL != use_bulleted_listsP_tail) ? conses_high.cadr(use_bulleted_listsP_tail) : nl_generation_api_macros.NIL);
        final SubLObject bulleted_list_indent_level_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw24$BULLETED_LIST_INDENT_LEVEL, current);
        final SubLObject bulleted_list_indent_level = (SubLObject)((nl_generation_api_macros.NIL != bulleted_list_indent_level_tail) ? conses_high.cadr(bulleted_list_indent_level_tail) : nl_generation_api_macros.ZERO_INTEGER);
        final SubLObject allow_utf8P_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw25$ALLOW_UTF8_, current);
        final SubLObject allow_utf8P = (SubLObject)((nl_generation_api_macros.NIL != allow_utf8P_tail) ? conses_high.cadr(allow_utf8P_tail) : nl_generation_api_macros.NIL);
        final SubLObject use_blanks_for_varsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw26$USE_BLANKS_FOR_VARS_, current);
        final SubLObject use_blanks_for_varsP = (SubLObject)((nl_generation_api_macros.NIL != use_blanks_for_varsP_tail) ? conses_high.cadr(use_blanks_for_varsP_tail) : nl_generation_api_macros.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, map, use_bulleted_listsP, bulleted_list_indent_level, allow_utf8P, use_blanks_for_varsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 3102L)
    public static SubLObject pph_output_map_to_html(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject map = (SubLObject)nl_generation_api_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_generation_api_macros.$list29);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_generation_api_macros.NIL;
        SubLObject current_$7 = (SubLObject)nl_generation_api_macros.NIL;
        while (nl_generation_api_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list29);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_generation_api_macros.$list29);
            if (nl_generation_api_macros.NIL == conses_high.member(current_$7, (SubLObject)nl_generation_api_macros.$list30, (SubLObject)nl_generation_api_macros.UNPROVIDED, (SubLObject)nl_generation_api_macros.UNPROVIDED)) {
                bad = (SubLObject)nl_generation_api_macros.T;
            }
            if (current_$7 == nl_generation_api_macros.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_generation_api_macros.NIL != bad && nl_generation_api_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_generation_api_macros.$list29);
        }
        final SubLObject tag_function_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw31$TAG_FUNCTION, current);
        final SubLObject tag_function = (SubLObject)((nl_generation_api_macros.NIL != tag_function_tail) ? conses_high.cadr(tag_function_tail) : nl_generation_api_macros.$sym32$PPH_ANCHOR_TAGS_FOR_TERM);
        final SubLObject use_bulleted_listsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw23$USE_BULLETED_LISTS_, current);
        final SubLObject use_bulleted_listsP = (SubLObject)((nl_generation_api_macros.NIL != use_bulleted_listsP_tail) ? conses_high.cadr(use_bulleted_listsP_tail) : nl_generation_api_macros.T);
        final SubLObject bulleted_list_indent_level_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw24$BULLETED_LIST_INDENT_LEVEL, current);
        final SubLObject bulleted_list_indent_level = (SubLObject)((nl_generation_api_macros.NIL != bulleted_list_indent_level_tail) ? conses_high.cadr(bulleted_list_indent_level_tail) : nl_generation_api_macros.ZERO_INTEGER);
        final SubLObject link_arg0P_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw33$LINK_ARG0_, current);
        final SubLObject link_arg0P = (SubLObject)((nl_generation_api_macros.NIL != link_arg0P_tail) ? conses_high.cadr(link_arg0P_tail) : nl_generation_api_macros.T);
        final SubLObject use_blanks_for_varsP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_generation_api_macros.$kw26$USE_BLANKS_FOR_VARS_, current);
        final SubLObject use_blanks_for_varsP = (SubLObject)((nl_generation_api_macros.NIL != use_blanks_for_varsP_tail) ? conses_high.cadr(use_blanks_for_varsP_tail) : nl_generation_api_macros.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL, map, (SubLObject)ConsesLow.list((SubLObject)nl_generation_api_macros.$sym35$QUOTE, tag_function), use_bulleted_listsP, bulleted_list_indent_level, link_arg0P, use_blanks_for_varsP);
    }
    
    public static SubLObject declare_nl_generation_api_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "cycl_term_to_nl_string", "CYCL-TERM-TO-NL-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "cycl_term_to_nl", "CYCL-TERM-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "cycl_terms_to_nl", "CYCL-TERMS-TO-NL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "cycl_terms_to_nl_strings", "CYCL-TERMS-TO-NL-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "cycl_term_to_search_query", "CYCL-TERM-TO-SEARCH-QUERY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "pph_output_map_to_text", "PPH-OUTPUT-MAP-TO-TEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_generation_api_macros", "pph_output_map_to_html", "PPH-OUTPUT-MAP-TO-HTML");
        return (SubLObject)nl_generation_api_macros.NIL;
    }
    
    public static SubLObject init_nl_generation_api_macros_file() {
        return (SubLObject)nl_generation_api_macros.NIL;
    }
    
    public static SubLObject setup_nl_generation_api_macros_file() {
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym0$CYCL_TERM_TO_NL_STRING);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym7$CYCL_TERM_TO_NL);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym9$CYCL_TERMS_TO_NL);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym12$CYCL_TERMS_TO_NL_STRINGS);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym14$CYCL_TERM_TO_SEARCH_QUERY);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym20$PPH_OUTPUT_MAP_TO_TEXT);
        access_macros.register_external_symbol((SubLObject)nl_generation_api_macros.$sym28$PPH_OUTPUT_MAP_TO_HTML);
        return (SubLObject)nl_generation_api_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nl_generation_api_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nl_generation_api_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nl_generation_api_macros_file();
    }
    
    static {
        me = (SubLFile)new nl_generation_api_macros();
        $sym0$CYCL_TERM_TO_NL_STRING = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL-STRING");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PARAMS"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PPH-PARAMS"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$PPH_PARAMS = SubLObjectFactory.makeKeyword("PPH-PARAMS");
        $kw5$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym6$CYCL_TERM_TO_NL_STRING_INTERNAL = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL-STRING-INTERNAL");
        $sym7$CYCL_TERM_TO_NL = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL");
        $sym8$CYCL_TERM_TO_NL_INTERNAL = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-NL-INTERNAL");
        $sym9$CYCL_TERMS_TO_NL = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PARAMS"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $sym11$CYCL_TERMS_TO_NL_INTERNAL = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL-INTERNAL");
        $sym12$CYCL_TERMS_TO_NL_STRINGS = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL-STRINGS");
        $sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL = SubLObjectFactory.makeSymbol("CYCL-TERMS-TO-NL-STRINGS-INTERNAL");
        $sym14$CYCL_TERM_TO_SEARCH_QUERY = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ENGINE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PARAMS"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENGINE"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-WORDS"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PARAMS"));
        $kw17$ENGINE = SubLObjectFactory.makeKeyword("ENGINE");
        $kw18$MAX_WORDS = SubLObjectFactory.makeKeyword("MAX-WORDS");
        $sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL = SubLObjectFactory.makeSymbol("CYCL-TERM-TO-SEARCH-QUERY-INTERNAL");
        $sym20$PPH_OUTPUT_MAP_TO_TEXT = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("USE-BULLETED-LISTS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)nl_generation_api_macros.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-UTF8?"), (SubLObject)SubLObjectFactory.makeSymbol("USE-BLANKS-FOR-VARS?"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-UTF8?"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?"));
        $kw23$USE_BULLETED_LISTS_ = SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?");
        $kw24$BULLETED_LIST_INDENT_LEVEL = SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL");
        $kw25$ALLOW_UTF8_ = SubLObjectFactory.makeKeyword("ALLOW-UTF8?");
        $kw26$USE_BLANKS_FOR_VARS_ = SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?");
        $sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-TEXT-INTERNAL");
        $sym28$PPH_OUTPUT_MAP_TO_HTML = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-HTML");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-BULLETED-LISTS?"), (SubLObject)nl_generation_api_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)nl_generation_api_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-ARG0?"), (SubLObject)nl_generation_api_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-BLANKS-FOR-VARS?"), (SubLObject)nl_generation_api_macros.NIL));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TAG-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BULLETED-LISTS?"), (SubLObject)SubLObjectFactory.makeKeyword("BULLETED-LIST-INDENT-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("LINK-ARG0?"), (SubLObject)SubLObjectFactory.makeKeyword("USE-BLANKS-FOR-VARS?"));
        $kw31$TAG_FUNCTION = SubLObjectFactory.makeKeyword("TAG-FUNCTION");
        $sym32$PPH_ANCHOR_TAGS_FOR_TERM = SubLObjectFactory.makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM");
        $kw33$LINK_ARG0_ = SubLObjectFactory.makeKeyword("LINK-ARG0?");
        $sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL = SubLObjectFactory.makeSymbol("PPH-OUTPUT-MAP-TO-HTML-INTERNAL");
        $sym35$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
    }
}

/*

	Total time: 117 ms
	
*/
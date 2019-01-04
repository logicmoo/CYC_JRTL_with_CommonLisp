package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class word_linkage extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.word_linkage";
    public static final String myFingerPrint = "74f41c909befcfed3681910ffd3448fb453dae7f639d9343ad38ce0a5feb80bf";
    private static final SubLSymbol $sym0$WORD_LINKAGE_WORD;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$LEXES;
    private static final SubLSymbol $sym4$RIGHT_LINKS;
    private static final SubLSymbol $sym5$LEFT_LINKS;
    private static final SubLSymbol $sym6$INDEX;
    private static final SubLSymbol $sym7$POS;
    private static final SubLSymbol $sym8$STRING;
    private static final SubLSymbol $sym9$LINKAGE;
    private static final SubLSymbol $sym10$INSTANCE_COUNT;
    private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS;
    private static final SubLSymbol $sym12$ISOLATED_P;
    private static final SubLSymbol $sym13$INSTANCE_NUMBER;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE;
    private static final SubLSymbol $sym15$LINK_NAME;
    private static final SubLSymbol $sym16$PRINT;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLString $str21$__LW;
    private static final SubLString $str22$_;
    private static final SubLString $str23$___;
    private static final SubLString $str24$_;
    private static final SubLSymbol $sym25$WORD_LINKAGE_WORD_PRINT_METHOD;
    private static final SubLSymbol $sym26$GET_LINKAGE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD;
    private static final SubLSymbol $sym31$GET_STRING;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD;
    private static final SubLSymbol $sym35$GET_ABS_INDEX;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD;
    private static final SubLSymbol $sym39$GET_POS;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym42$WORD_LINKAGE_WORD_GET_POS_METHOD;
    private static final SubLSymbol $sym43$GET_CATEGORY;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD;
    private static final SubLSymbol $sym46$GET_INDEX;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD;
    private static final SubLSymbol $sym50$GET_LEXES;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD;
    private static final SubLSymbol $sym54$GET_LEFT_LINKS;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym58$REGEX_PATTERN_P;
    private static final SubLSymbol $sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD;
    private static final SubLSymbol $sym60$GET_RIGHT_LINKS;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD;
    private static final SubLSymbol $sym64$GET_LINKS;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD;
    private static final SubLSymbol $sym67$GET_DIRECTLY_RELATED;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$LEFT;
    private static final SubLSymbol $kw71$RIGHT;
    private static final SubLString $str72$Invalid_link_direction__a;
    private static final SubLSymbol $sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD;
    private static final SubLSymbol $sym74$GET_RELATED;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD;
    private static final SubLSymbol $sym78$LEXIFY;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$GET;
    private static final SubLSymbol $sym83$POS_FILTER_LEXES;
    private static final SubLSymbol $sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD;
    private static final SubLSymbol $kw87$PENN_TAGS;
    private static final SubLSymbol $kw88$BACKOFF_PENN_TAGS;
    private static final SubLFloat $float89$0_75;
    private static final SubLSymbol $sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$WORD_LINKAGE;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$TREE_STRING;
    private static final SubLSymbol $sym95$DIAGRAM;
    private static final SubLSymbol $sym96$WORDS;
    private static final SubLSymbol $sym97$LINKS;
    private static final SubLSymbol $sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS;
    private static final SubLSymbol $sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE;
    private static final SubLString $str100$ID;
    private static final SubLSymbol $sym101$INCOMPLETE_LINK_;
    private static final SubLSymbol $sym102$VECTOR;
    private static final SubLString $str103$word_linkage;
    private static final SubLString $str104$_a_is_not_a_linkage_xml_string;
    private static final SubLString $str105$words;
    private static final SubLString $str106$links;
    private static final SubLString $str107$cat;
    private static final SubLString $str108$_;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLSymbol $kw111$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw112$OPTIONS;
    private static final SubLSymbol $kw113$LEXICON;
    private static final SubLSymbol $kw114$USE_STANDARDIZED_WORD_STRINGS_;
    private static final SubLSymbol $sym115$STRINGP;
    private static final SubLSymbol $sym116$LISTP;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym119$WORD_LINKAGE_PRINT_METHOD;
    private static final SubLSymbol $sym120$PRINT_DIAGRAM;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD;
    private static final SubLSymbol $sym124$XML;
    private static final SubLList $list125;
    private static final SubLString $str126$_word_linkage___;
    private static final SubLString $str127$_words___;
    private static final SubLString $str128$__words___;
    private static final SubLString $str129$__word_linkage___;
    private static final SubLSymbol $sym130$WORD_LINKAGE_XML_METHOD;
    private static final SubLString $str131$_word_cat___a___a__word___;
    private static final SubLSymbol $sym132$LENGTH;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym135$WORD_LINKAGE_LENGTH_METHOD;
    private static final SubLSymbol $sym136$GET_TREE_STRING;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD;
    private static final SubLSymbol $sym140$GET_WORD;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym144$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym145$WORD_LINKAGE_GET_WORD_METHOD;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$ABSTRACT_LEXICON_P;
    private static final SubLSymbol $sym148$WORD_LINKAGE_LEXIFY_METHOD;
    private static final SubLSymbol $sym149$YIELD;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$WORD_LINKAGE_YIELD_METHOD;
    private static final SubLSymbol $sym152$SEARCH;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD;
    private static final SubLSymbol $sym156$WORD_LINKAGE_SEARCH_METHOD;
    private static final SubLSymbol $sym157$WORD_LINKAGE_P;
    private static final SubLList $list158;
    private static final SubLString $str159$Failure_causing_word___S_has_link;
    private static final SubLSymbol $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_;
    private static final SubLSymbol $kw161$TEST;
    private static final SubLSymbol $kw162$OWNER;
    private static final SubLSymbol $kw163$CLASSES;
    private static final SubLSymbol $kw164$KB;
    private static final SubLSymbol $kw165$FULL;
    private static final SubLSymbol $kw166$WORKING_;
    private static final SubLList $list167;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_lexes(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.SEVEN_INTEGER, (SubLObject)word_linkage.$sym3$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_lexes(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.SEVEN_INTEGER, (SubLObject)word_linkage.$sym3$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_right_links(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.SIX_INTEGER, (SubLObject)word_linkage.$sym4$RIGHT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_right_links(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.SIX_INTEGER, (SubLObject)word_linkage.$sym4$RIGHT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_left_links(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.FIVE_INTEGER, (SubLObject)word_linkage.$sym5$LEFT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_left_links(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.FIVE_INTEGER, (SubLObject)word_linkage.$sym5$LEFT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_index(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.FOUR_INTEGER, (SubLObject)word_linkage.$sym6$INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_index(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.FOUR_INTEGER, (SubLObject)word_linkage.$sym6$INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_pos(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.THREE_INTEGER, (SubLObject)word_linkage.$sym7$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_pos(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.THREE_INTEGER, (SubLObject)word_linkage.$sym7$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_string(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.TWO_INTEGER, (SubLObject)word_linkage.$sym8$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_string(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.TWO_INTEGER, (SubLObject)word_linkage.$sym8$STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject get_word_linkage_word_linkage(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, (SubLObject)word_linkage.ONE_INTEGER, (SubLObject)word_linkage.$sym9$LINKAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject set_word_linkage_word_linkage(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, (SubLObject)word_linkage.ONE_INTEGER, (SubLObject)word_linkage.$sym9$LINKAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject subloop_reserved_initialize_word_linkage_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym10$INSTANCE_COUNT, (SubLObject)word_linkage.ZERO_INTEGER);
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject subloop_reserved_initialize_word_linkage_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym12$ISOLATED_P, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym13$INSTANCE_NUMBER, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym9$LINKAGE, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym8$STRING, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym7$POS, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym6$INDEX, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym5$LEFT_LINKS, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym4$RIGHT_LINKS, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym3$LEXES, (SubLObject)word_linkage.NIL);
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 1466L)
    public static SubLObject word_linkage_word_p(final SubLObject word_linkage_word) {
        return classes.subloop_instanceof_class(word_linkage_word, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 2605L)
    public static SubLObject new_word_linkage_word(final SubLObject v_linkage, final SubLObject stringXpos, final SubLObject index, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = object.new_class_instance((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD);
        thread.resetMultipleValues();
        final SubLObject string = linkage.split_link_word(stringXpos);
        final SubLObject link_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject v_class = linkage.get_link_word_class(string, link_pos, Mapping.mapcar((SubLObject)word_linkage.$sym15$LINK_NAME, llinks), Mapping.mapcar((SubLObject)word_linkage.$sym15$LINK_NAME, rlinks), penn_pos);
        final SubLObject derived_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        instances.set_slot(word, (SubLObject)word_linkage.$sym9$LINKAGE, v_linkage);
        instances.set_slot(word, (SubLObject)word_linkage.$sym8$STRING, string);
        instances.set_slot(word, (SubLObject)word_linkage.$sym7$POS, derived_pos);
        instances.set_slot(word, (SubLObject)word_linkage.$sym6$INDEX, index);
        instances.set_slot(word, (SubLObject)word_linkage.$sym5$LEFT_LINKS, llinks);
        instances.set_slot(word, (SubLObject)word_linkage.$sym4$RIGHT_LINKS, rlinks);
        SubLObject cdolist_list_var = llinks;
        SubLObject llink = (SubLObject)word_linkage.NIL;
        llink = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            linkage._csetf_link_right_word(llink, word);
            cdolist_list_var = cdolist_list_var.rest();
            llink = cdolist_list_var.first();
        }
        cdolist_list_var = rlinks;
        SubLObject rlink = (SubLObject)word_linkage.NIL;
        rlink = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            linkage._csetf_link_left_word(rlink, word);
            cdolist_list_var = cdolist_list_var.rest();
            rlink = cdolist_list_var.first();
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 3692L)
    public static SubLObject word_linkage_word_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject pos = get_word_linkage_word_pos(self);
        final SubLObject string = get_word_linkage_word_string(self);
        try {
            thread.throwStack.push(word_linkage.$sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                streams_high.write_string((SubLObject)word_linkage.$str21$__LW, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
                streams_high.write_string((SubLObject)word_linkage.$str22$_, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
                print_high.princ(pos, stream);
                streams_high.write_string((SubLObject)word_linkage.$str23$___, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
                streams_high.write_string(string, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
                streams_high.write_string((SubLObject)word_linkage.$str24$_, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_pos(self, pos);
                    set_word_linkage_word_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4018L)
    public static SubLObject word_linkage_word_get_linkage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject v_linkage = get_word_linkage_word_linkage(self);
        try {
            thread.throwStack.push(word_linkage.$sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, v_linkage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_linkage(self, v_linkage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4163L)
    public static SubLObject word_linkage_word_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject string = get_word_linkage_word_string(self);
        try {
            thread.throwStack.push(word_linkage.$sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4295L)
    public static SubLObject word_linkage_word_get_abs_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject index = get_word_linkage_word_index(self);
        try {
            thread.throwStack.push(word_linkage.$sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_index(self, index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4430L)
    public static SubLObject word_linkage_word_get_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject pos = get_word_linkage_word_pos(self);
        try {
            thread.throwStack.push(word_linkage.$sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, pos);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4558L)
    public static SubLObject word_linkage_word_get_category_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)word_linkage.$sym39$GET_POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4707L)
    public static SubLObject word_linkage_word_get_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject index = get_word_linkage_word_index(self);
        try {
            thread.throwStack.push(word_linkage.$sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_index(self, index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4829L)
    public static SubLObject word_linkage_word_get_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject lexes = get_word_linkage_word_lexes(self);
        try {
            thread.throwStack.push(word_linkage.$sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 4960L)
    public static SubLObject word_linkage_word_get_left_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == word_linkage.UNPROVIDED) {
            link_pattern = (SubLObject)word_linkage.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject left_links = get_word_linkage_word_left_links(self);
        try {
            thread.throwStack.push(word_linkage.$sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                if (word_linkage.NIL != link_pattern && !word_linkage.assertionsDisabledInClass && word_linkage.NIL == regular_expressions.regex_pattern_p(link_pattern)) {
                    throw new AssertionError(link_pattern);
                }
                if (word_linkage.NIL == link_pattern) {
                    Dynamic.sublisp_throw((SubLObject)word_linkage.$sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, left_links);
                }
                SubLObject links = (SubLObject)word_linkage.NIL;
                SubLObject cdolist_list_var = left_links;
                SubLObject link = (SubLObject)word_linkage.NIL;
                link = cdolist_list_var.first();
                while (word_linkage.NIL != cdolist_list_var) {
                    if (word_linkage.NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                        links = (SubLObject)ConsesLow.cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_left_links(self, left_links);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5305L)
    public static SubLObject word_linkage_word_get_right_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == word_linkage.UNPROVIDED) {
            link_pattern = (SubLObject)word_linkage.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        final SubLObject right_links = get_word_linkage_word_right_links(self);
        try {
            thread.throwStack.push(word_linkage.$sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                if (word_linkage.NIL != link_pattern && !word_linkage.assertionsDisabledInClass && word_linkage.NIL == regular_expressions.regex_pattern_p(link_pattern)) {
                    throw new AssertionError(link_pattern);
                }
                if (word_linkage.NIL == link_pattern) {
                    Dynamic.sublisp_throw((SubLObject)word_linkage.$sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, right_links);
                }
                SubLObject links = (SubLObject)word_linkage.NIL;
                SubLObject cdolist_list_var = right_links;
                SubLObject link = (SubLObject)word_linkage.NIL;
                link = cdolist_list_var.first();
                while (word_linkage.NIL != cdolist_list_var) {
                    if (word_linkage.NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                        links = (SubLObject)ConsesLow.cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_right_links(self, right_links);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5653L)
    public static SubLObject word_linkage_word_get_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == word_linkage.UNPROVIDED) {
            link_pattern = (SubLObject)word_linkage.NIL;
        }
        if (word_linkage.NIL != link_pattern && !word_linkage.assertionsDisabledInClass && word_linkage.NIL == regular_expressions.regex_pattern_p(link_pattern)) {
            throw new AssertionError(link_pattern);
        }
        return ConsesLow.append(methods.funcall_instance_method_with_1_args(self, (SubLObject)word_linkage.$sym54$GET_LEFT_LINKS, link_pattern), methods.funcall_instance_method_with_1_args(self, (SubLObject)word_linkage.$sym60$GET_RIGHT_LINKS, link_pattern));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 5918L)
    public static SubLObject word_linkage_word_get_directly_related_method(final SubLObject self, final SubLObject pattern_keyword, SubLObject direction) {
        if (direction == word_linkage.UNPROVIDED) {
            direction = (SubLObject)word_linkage.NIL;
        }
        final SubLObject link_pattern = linkage.get_link_pattern(pattern_keyword);
        final SubLObject link_getter = (SubLObject)((word_linkage.NIL == direction) ? word_linkage.$sym64$GET_LINKS : (direction.eql((SubLObject)word_linkage.$kw70$LEFT) ? word_linkage.$sym54$GET_LEFT_LINKS : (direction.eql((SubLObject)word_linkage.$kw71$RIGHT) ? word_linkage.$sym60$GET_RIGHT_LINKS : Errors.error((SubLObject)word_linkage.$str72$Invalid_link_direction__a, direction))));
        SubLObject words = (SubLObject)word_linkage.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, link_getter, link_pattern);
        SubLObject link = (SubLObject)word_linkage.NIL;
        link = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            if (linkage.link_left_word(link).eql(self)) {
                words = (SubLObject)ConsesLow.cons(linkage.link_right_word(link), words);
            }
            else {
                words = (SubLObject)ConsesLow.cons(linkage.link_left_word(link), words);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 6640L)
    public static SubLObject word_linkage_word_get_related_method(final SubLObject self, final SubLObject link_path) {
        if (word_linkage.NIL == link_path) {
            return (SubLObject)ConsesLow.list(self);
        }
        SubLObject words = (SubLObject)word_linkage.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)word_linkage.$sym67$GET_DIRECTLY_RELATED, link_path.first());
        SubLObject related = (SubLObject)word_linkage.NIL;
        related = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            words = ConsesLow.append(methods.funcall_instance_method_with_1_args(related, (SubLObject)word_linkage.$sym74$GET_RELATED, link_path.rest()), words);
            cdolist_list_var = cdolist_list_var.rest();
            related = cdolist_list_var.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 7102L)
    public static SubLObject word_linkage_word_lexify_method(final SubLObject self, final SubLObject lexicon) {
        SubLObject filtered = (SubLObject)word_linkage.NIL;
        final SubLObject string = instances.get_slot(self, (SubLObject)word_linkage.$sym8$STRING);
        instances.set_slot(self, (SubLObject)word_linkage.$sym3$LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)word_linkage.$sym82$GET, string)));
        if (word_linkage.NIL != instances.get_slot(self, (SubLObject)word_linkage.$sym3$LEXES)) {
            filtered = methods.funcall_instance_method_with_0_args(self, (SubLObject)word_linkage.$sym83$POS_FILTER_LEXES);
        }
        instances.set_slot(self, (SubLObject)word_linkage.$sym3$LEXES, filtered);
        return instances.get_slot(self, (SubLObject)word_linkage.$sym3$LEXES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 7869L)
    public static SubLObject word_linkage_word_pos_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = (SubLObject)word_linkage.NIL;
        SubLObject lexes = get_word_linkage_word_lexes(self);
        final SubLObject pos = get_word_linkage_word_pos(self);
        try {
            thread.throwStack.push(word_linkage.$sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                SubLObject filtered = (SubLObject)word_linkage.NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = (SubLObject)word_linkage.NIL;
                rle = cdolist_list_var.first();
                while (word_linkage.NIL != cdolist_list_var) {
                    if (word_linkage.NIL != conses_high.member(instances.get_slot(self, (SubLObject)word_linkage.$sym7$POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_linkage.$sym82$GET, (SubLObject)word_linkage.$kw87$PENN_TAGS), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, (SubLObject)word_linkage.ONE_INTEGER);
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    else if (word_linkage.NIL != conses_high.member(instances.get_slot(self, (SubLObject)word_linkage.$sym7$POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)word_linkage.$sym82$GET, (SubLObject)word_linkage.$kw88$BACKOFF_PENN_TAGS), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, (SubLObject)word_linkage.$float89$0_75);
                        filtered = (SubLObject)ConsesLow.cons(rle, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                lexes = filtered;
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_word_lexes(self, lexes);
                    set_word_linkage_word_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8409L)
    public static SubLObject wall_word_linkage_wordP(final SubLObject word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(word_linkage.NIL != word_linkage_word_p(word) && word_linkage.NIL == methods.funcall_instance_method_with_0_args(word, (SubLObject)word_linkage.$sym39$GET_POS) && word_linkage.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, (SubLObject)word_linkage.$sym31$GET_STRING), (SubLObject)word_linkage.$list91, Symbols.symbol_function((SubLObject)word_linkage.EQUAL), (SubLObject)word_linkage.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject get_word_linkage_tree_string(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, (SubLObject)word_linkage.FOUR_INTEGER, (SubLObject)word_linkage.$sym94$TREE_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject set_word_linkage_tree_string(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, (SubLObject)word_linkage.FOUR_INTEGER, (SubLObject)word_linkage.$sym94$TREE_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject get_word_linkage_diagram(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, (SubLObject)word_linkage.THREE_INTEGER, (SubLObject)word_linkage.$sym95$DIAGRAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject set_word_linkage_diagram(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, (SubLObject)word_linkage.THREE_INTEGER, (SubLObject)word_linkage.$sym95$DIAGRAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject get_word_linkage_words(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, (SubLObject)word_linkage.TWO_INTEGER, (SubLObject)word_linkage.$sym96$WORDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject set_word_linkage_words(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, (SubLObject)word_linkage.TWO_INTEGER, (SubLObject)word_linkage.$sym96$WORDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject get_word_linkage_links(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, (SubLObject)word_linkage.ONE_INTEGER, (SubLObject)word_linkage.$sym97$LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject set_word_linkage_links(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, (SubLObject)word_linkage.ONE_INTEGER, (SubLObject)word_linkage.$sym97$LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject subloop_reserved_initialize_word_linkage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym10$INSTANCE_COUNT, (SubLObject)word_linkage.ZERO_INTEGER);
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject subloop_reserved_initialize_word_linkage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym12$ISOLATED_P, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.$sym13$INSTANCE_NUMBER, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym97$LINKS, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym96$WORDS, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym95$DIAGRAM, (SubLObject)word_linkage.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym94$TREE_STRING, (SubLObject)word_linkage.NIL);
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 8709L)
    public static SubLObject word_linkage_p(final SubLObject v_word_linkage) {
        return classes.subloop_instanceof_class(v_word_linkage, (SubLObject)word_linkage.$sym92$WORD_LINKAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 9536L)
    public static SubLObject new_word_linkage_from_link_structure(final SubLObject link_structure, final SubLObject tagged_sent, final SubLObject input_sentence, final SubLObject respect_id_linksP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_linkage = object.new_class_instance((SubLObject)word_linkage.$sym92$WORD_LINKAGE);
        final SubLObject word_count = linkage.ls_number_of_words(link_structure);
        final SubLObject link_count = linkage.ls_number_of_links(link_structure);
        final SubLObject links = Vectors.make_vector(link_count, (SubLObject)word_linkage.UNPROVIDED);
        final SubLObject word_links = Vectors.make_vector(word_count, (SubLObject)word_linkage.UNPROVIDED);
        SubLObject idiom_offset = (SubLObject)word_linkage.ZERO_INTEGER;
        final SubLObject tagged_sent_length = document.sentence_length(tagged_sent);
        SubLObject words = (SubLObject)word_linkage.NIL;
        SubLObject idiom_word_ids = (SubLObject)word_linkage.NIL;
        SubLObject idioms = (SubLObject)word_linkage.NIL;
        SubLObject llinksXrlinks = (SubLObject)word_linkage.NIL;
        SubLObject link_name = (SubLObject)word_linkage.NIL;
        SubLObject index = (SubLObject)word_linkage.NIL;
        SubLObject string = (SubLObject)word_linkage.NIL;
        SubLObject pos = (SubLObject)word_linkage.NIL;
        SubLObject wi;
        for (wi = (SubLObject)word_linkage.NIL, wi = (SubLObject)word_linkage.ZERO_INTEGER; wi.numL(word_count); wi = Numbers.add(wi, (SubLObject)word_linkage.ONE_INTEGER)) {
            Vectors.set_aref(word_links, wi, (SubLObject)ConsesLow.cons((SubLObject)word_linkage.NIL, (SubLObject)word_linkage.NIL));
        }
        SubLObject li;
        for (li = (SubLObject)word_linkage.NIL, li = (SubLObject)word_linkage.ZERO_INTEGER; li.numL(link_count); li = Numbers.add(li, (SubLObject)word_linkage.ONE_INTEGER)) {
            index = linkage.ls_lword_index_of_link(link_structure, li);
            llinksXrlinks = Vectors.aref(word_links, index);
            ConsesLow.rplacd(llinksXrlinks, (SubLObject)ConsesLow.cons(li, llinksXrlinks.rest()));
            index = linkage.ls_rword_index_of_link(link_structure, li);
            llinksXrlinks = Vectors.aref(word_links, index);
            ConsesLow.rplaca(llinksXrlinks, (SubLObject)ConsesLow.cons(li, llinksXrlinks.first()));
        }
        SubLObject llinks;
        SubLObject rlinks;
        SubLObject llink;
        SubLObject rlink;
        SubLObject string_$1;
        SubLObject idioms_$2;
        SubLObject cdolist_list_var;
        SubLObject llink_id;
        SubLObject rlink_id;
        for (wi = (SubLObject)word_linkage.NIL, wi = (SubLObject)word_linkage.ZERO_INTEGER; wi.numL(word_count); wi = Numbers.add(wi, (SubLObject)word_linkage.ONE_INTEGER)) {
            if (word_linkage.NIL == subl_promotions.memberP(wi, idiom_word_ids, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)) {
                llinks = (SubLObject)word_linkage.NIL;
                rlinks = (SubLObject)word_linkage.NIL;
                llink = (SubLObject)word_linkage.NIL;
                rlink = (SubLObject)word_linkage.NIL;
                thread.resetMultipleValues();
                string_$1 = retrieve_link_word(wi, link_structure, word_links, input_sentence);
                idioms_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                string = string_$1;
                idioms = idioms_$2;
                idiom_word_ids = ConsesLow.append(idioms, idiom_word_ids);
                pos = (SubLObject)((wi.numL((SubLObject)word_linkage.ONE_INTEGER) || wi.numG(tagged_sent_length)) ? word_linkage.NIL : document.word_category(document.sentence_get(tagged_sent, number_utilities.f_1_((word_linkage.NIL != idioms) ? conses_high.last(idioms, (SubLObject)word_linkage.UNPROVIDED).first() : wi))));
                if (word_linkage.NIL != idioms) {
                    llinksXrlinks = get_idiom_links(idioms, word_links, link_structure);
                }
                else {
                    llinksXrlinks = Vectors.aref(word_links, wi);
                }
                cdolist_list_var = llinksXrlinks.first();
                llink_id = (SubLObject)word_linkage.NIL;
                llink_id = cdolist_list_var.first();
                while (word_linkage.NIL != cdolist_list_var) {
                    link_name = linkage.ls_name_of_link(link_structure, llink_id);
                    llink = Vectors.aref(links, llink_id);
                    if (word_linkage.NIL == llink) {
                        llink = linkage.new_link(link_name);
                        Vectors.set_aref(links, llink_id, llink);
                    }
                    llinks = (SubLObject)ConsesLow.cons(llink, llinks);
                    cdolist_list_var = cdolist_list_var.rest();
                    llink_id = cdolist_list_var.first();
                }
                cdolist_list_var = llinksXrlinks.rest();
                rlink_id = (SubLObject)word_linkage.NIL;
                rlink_id = cdolist_list_var.first();
                while (word_linkage.NIL != cdolist_list_var) {
                    link_name = linkage.ls_name_of_link(link_structure, rlink_id);
                    if (word_linkage.NIL == string_utilities.starts_with(link_name, (SubLObject)word_linkage.$str100$ID)) {
                        rlink = Vectors.aref(links, rlink_id);
                        if (word_linkage.NIL == rlink) {
                            rlink = linkage.new_link(link_name);
                            Vectors.set_aref(links, rlink_id, rlink);
                        }
                        rlinks = (SubLObject)ConsesLow.cons(rlink, rlinks);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rlink_id = cdolist_list_var.first();
                }
                words = (SubLObject)ConsesLow.cons(new_word_linkage_word(v_linkage, string, Numbers.subtract(wi, idiom_offset), llinks, rlinks, pos), words);
                if (word_linkage.NIL != idioms) {
                    idiom_offset = Numbers.add(idiom_offset, Numbers.subtract(conses_high.second(idioms), idioms.first()));
                }
            }
        }
        SubLObject cdolist_list_var2 = words;
        SubLObject word = (SubLObject)word_linkage.NIL;
        word = cdolist_list_var2.first();
        while (word_linkage.NIL != cdolist_list_var2) {
            instances.set_slot(word, (SubLObject)word_linkage.$sym5$LEFT_LINKS, Sequences.remove_if((SubLObject)word_linkage.$sym101$INCOMPLETE_LINK_, get_word_linkage_word_left_links(word), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED));
            instances.set_slot(word, (SubLObject)word_linkage.$sym4$RIGHT_LINKS, Sequences.remove_if((SubLObject)word_linkage.$sym101$INCOMPLETE_LINK_, get_word_linkage_word_right_links(word), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED));
            cdolist_list_var2 = cdolist_list_var2.rest();
            word = cdolist_list_var2.first();
        }
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym95$DIAGRAM, linkage.ls_diagram(link_structure));
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym97$LINKS, Sequences.remove_if((SubLObject)word_linkage.$sym101$INCOMPLETE_LINK_, links, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED));
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym96$WORDS, Functions.apply((SubLObject)word_linkage.$sym102$VECTOR, Sequences.nreverse(words)));
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym94$TREE_STRING, linkage.ls_tree(link_structure));
        return v_linkage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 13906L)
    public static SubLObject xml_to_word_linkage(final SubLObject xml) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_string_tokenize(xml, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED));
        if (word_linkage.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && word_linkage.NIL == Strings.stringE(xml_parsing_utilities.xml_sexpr_type(sexpr), (SubLObject)word_linkage.$str103$word_linkage, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)) {
            Errors.error((SubLObject)word_linkage.$str104$_a_is_not_a_linkage_xml_string, sexpr);
        }
        final SubLObject v_linkage = object.new_class_instance((SubLObject)word_linkage.$sym92$WORD_LINKAGE);
        final SubLObject words_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, (SubLObject)word_linkage.$str105$words);
        final SubLObject words = words_sexpr_to_word_vector(words_sexpr);
        final SubLObject links_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, (SubLObject)word_linkage.$str106$links);
        SubLObject i = (SubLObject)word_linkage.ZERO_INTEGER;
        SubLObject links = (SubLObject)word_linkage.NIL;
        final SubLObject vector_var = words;
        final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
            element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
            word = Vectors.aref(vector_var, element_num);
            instances.set_slot(word, (SubLObject)word_linkage.$sym9$LINKAGE, v_linkage);
            instances.set_slot(word, (SubLObject)word_linkage.$sym6$INDEX, i);
            i = Numbers.add(i, (SubLObject)word_linkage.ONE_INTEGER);
        }
        links = linkage.xml_sexpr_to_links(links_sexpr, words);
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym97$LINKS, links);
        instances.set_slot(v_linkage, (SubLObject)word_linkage.$sym96$WORDS, words);
        return v_linkage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 14918L)
    public static SubLObject words_sexpr_to_word_vector(final SubLObject words_sexpr) {
        final SubLObject xml_words = xml_parsing_utilities.xml_sexpr_daughters(words_sexpr, (SubLObject)word_linkage.UNPROVIDED);
        final SubLObject words = Vectors.make_vector(Sequences.length(xml_words), (SubLObject)word_linkage.UNPROVIDED);
        SubLObject i = (SubLObject)word_linkage.ZERO_INTEGER;
        SubLObject cdolist_list_var = xml_words;
        SubLObject xml_word = (SubLObject)word_linkage.NIL;
        xml_word = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            final SubLObject lw = object.new_class_instance((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD);
            instances.set_slot(lw, (SubLObject)word_linkage.$sym8$STRING, xml_parsing_utilities.xml_sexpr_daughters(xml_word, (SubLObject)word_linkage.UNPROVIDED).first());
            instances.set_slot(lw, (SubLObject)word_linkage.$sym7$POS, Symbols.make_keyword(xml_parsing_utilities.xml_sexpr_attribute_value(xml_word, (SubLObject)word_linkage.$str107$cat)));
            Vectors.set_aref(words, i, lw);
            i = Numbers.add(i, (SubLObject)word_linkage.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            xml_word = cdolist_list_var.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 15450L)
    public static SubLObject retrieve_link_word(final SubLObject word, final SubLObject link_structure, final SubLObject word_links, final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rlinks = Vectors.aref(word_links, word).rest();
        SubLObject idiom_link = find_link_id((SubLObject)word_linkage.$str100$ID, link_structure, rlinks);
        SubLObject string = (SubLObject)word_linkage.NIL;
        SubLObject pos = (SubLObject)word_linkage.NIL;
        SubLObject idioms = (SubLObject)word_linkage.NIL;
        SubLObject idiom_parts = (SubLObject)word_linkage.NIL;
        thread.resetMultipleValues();
        final SubLObject string_$3 = linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, word));
        final SubLObject pos_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$3;
        pos = pos_$4;
        if (word_linkage.NIL != idiom_link) {
            idioms = (SubLObject)ConsesLow.cons(word, idioms);
            idiom_parts = (SubLObject)ConsesLow.cons(string, idiom_parts);
            while (word_linkage.NIL != idiom_link) {
                final SubLObject wi = linkage.ls_rword_index_of_link(link_structure, idiom_link);
                idiom_parts = (SubLObject)ConsesLow.cons(linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, wi)), idiom_parts);
                rlinks = Vectors.aref(word_links, wi).rest();
                idiom_link = find_link_id((SubLObject)word_linkage.$str100$ID, link_structure, rlinks);
                idioms = (SubLObject)ConsesLow.cons(wi, idioms);
            }
            string = string_utilities.bunge_according_to_string(Sequences.nreverse(idiom_parts), input_sentence, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
        }
        if (word_linkage.NIL != pos) {
            string = Sequences.cconcatenate(string, new SubLObject[] { word_linkage.$str108$_, print_high.princ_to_string(pos) });
        }
        return Values.values(string, Sequences.nreverse(idioms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 16826L)
    public static SubLObject find_link_id(final SubLObject link_name, final SubLObject link_structure, final SubLObject links) {
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)word_linkage.NIL;
        link = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            if (word_linkage.NIL != string_utilities.starts_with(linkage.ls_name_of_link(link_structure, link), link_name)) {
                return link;
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 17006L)
    public static SubLObject get_idiom_links(final SubLObject idiom_ids, final SubLObject word_links, final SubLObject link_structure) {
        SubLObject llinks = (SubLObject)word_linkage.NIL;
        SubLObject rlinks = (SubLObject)word_linkage.NIL;
        SubLObject dup_link_id = (SubLObject)word_linkage.NIL;
        SubLObject cdolist_list_var = idiom_ids;
        SubLObject word_id = (SubLObject)word_linkage.NIL;
        word_id = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = Vectors.aref(word_links, word_id).first();
            SubLObject llink_id = (SubLObject)word_linkage.NIL;
            llink_id = cdolist_list_var_$5.first();
            while (word_linkage.NIL != cdolist_list_var_$5) {
                SubLObject internal_linkP;
                SubLObject remaining;
                SubLObject wi;
                for (internal_linkP = (SubLObject)word_linkage.NIL, remaining = (SubLObject)word_linkage.NIL, wi = (SubLObject)word_linkage.NIL, remaining = idiom_ids, wi = remaining.first(); word_linkage.NIL == internal_linkP && !wi.numGE(word_id); internal_linkP = (SubLObject)SubLObjectFactory.makeBoolean(word_linkage.NIL != internal_linkP || word_linkage.NIL != conses_high.member(llink_id, Vectors.aref(word_links, wi).rest(), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)), remaining = remaining.rest(), wi = remaining.first()) {}
                dup_link_id = link_member_p(llink_id, llinks, link_structure);
                if (word_linkage.NIL != dup_link_id) {
                    Vectors.set_aref(linkage.ls_links(link_structure), llink_id, (SubLObject)word_linkage.NIL);
                }
                else if (word_linkage.NIL == internal_linkP) {
                    llinks = (SubLObject)ConsesLow.cons(llink_id, llinks);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                llink_id = cdolist_list_var_$5.first();
            }
            SubLObject cdolist_list_var_$6 = Vectors.aref(word_links, word_id).rest();
            SubLObject rlink_id = (SubLObject)word_linkage.NIL;
            rlink_id = cdolist_list_var_$6.first();
            while (word_linkage.NIL != cdolist_list_var_$6) {
                SubLObject internal_linkP;
                SubLObject remaining;
                SubLObject wi;
                for (internal_linkP = (SubLObject)word_linkage.NIL, remaining = (SubLObject)word_linkage.NIL, wi = (SubLObject)word_linkage.NIL, remaining = Sequences.reverse(idiom_ids), wi = remaining.first(); word_linkage.NIL == internal_linkP && !wi.numLE(word_id); internal_linkP = (SubLObject)SubLObjectFactory.makeBoolean(word_linkage.NIL != internal_linkP || word_linkage.NIL != conses_high.member(rlink_id, Vectors.aref(word_links, wi).first(), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)), remaining = remaining.rest(), wi = remaining.first()) {}
                dup_link_id = link_member_p(rlink_id, rlinks, link_structure);
                if (word_linkage.NIL != dup_link_id) {
                    Vectors.set_aref(linkage.ls_links(link_structure), rlink_id, (SubLObject)word_linkage.NIL);
                }
                else if (word_linkage.NIL == internal_linkP) {
                    rlinks = (SubLObject)ConsesLow.cons(rlink_id, rlinks);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                rlink_id = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word_id = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.cons(llinks, rlinks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19063L)
    public static SubLObject incomplete_linkP(final SubLObject link) {
        if (word_linkage.NIL != link) {
            return (SubLObject)SubLObjectFactory.makeBoolean(word_linkage.NIL == linkage.link_left_word(link) || word_linkage.NIL == linkage.link_right_word(link));
        }
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19267L)
    public static SubLObject link_member_p(final SubLObject link_id, final SubLObject links, final SubLObject link_structure) {
        final SubLObject name = linkage.ls_name_of_link(link_structure, link_id);
        final SubLObject left_word = linkage.ls_lword_index_of_link(link_structure, link_id);
        final SubLObject right_word = linkage.ls_rword_index_of_link(link_structure, link_id);
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)word_linkage.NIL;
        link = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            if (word_linkage.NIL != name && word_linkage.NIL != linkage.ls_name_of_link(link_structure, link) && word_linkage.NIL != Strings.stringE(name, linkage.ls_name_of_link(link_structure, link), (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED) && (left_word.numE(linkage.ls_lword_index_of_link(link_structure, link)) || right_word.numE(linkage.ls_rword_index_of_link(link_structure, link)))) {
                return linkage.ls_link(link_structure, link);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 19980L)
    public static SubLObject new_word_linkages(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == word_linkage.UNPROVIDED) {
            v_properties = (SubLObject)word_linkage.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = (SubLObject)word_linkage.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)word_linkage.NIL;
        SubLObject current_$7 = (SubLObject)word_linkage.NIL;
        while (word_linkage.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)word_linkage.$list109);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)word_linkage.$list109);
            if (word_linkage.NIL == conses_high.member(current_$7, (SubLObject)word_linkage.$list110, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED)) {
                bad = (SubLObject)word_linkage.T;
            }
            if (current_$7 == word_linkage.$kw111$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (word_linkage.NIL != bad && word_linkage.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)word_linkage.$list109);
        }
        final SubLObject options_tail = cdestructuring_bind.property_list_member((SubLObject)word_linkage.$kw112$OPTIONS, current);
        final SubLObject options = (word_linkage.NIL != options_tail) ? conses_high.cadr(options_tail) : linkage.$link_parse_options$.getDynamicValue(thread);
        final SubLObject lexicon_tail = cdestructuring_bind.property_list_member((SubLObject)word_linkage.$kw113$LEXICON, current);
        final SubLObject lexicon = (SubLObject)((word_linkage.NIL != lexicon_tail) ? conses_high.cadr(lexicon_tail) : word_linkage.NIL);
        final SubLObject use_standardized_word_stringsP_tail = cdestructuring_bind.property_list_member((SubLObject)word_linkage.$kw114$USE_STANDARDIZED_WORD_STRINGS_, current);
        final SubLObject use_standardized_word_stringsP = (SubLObject)((word_linkage.NIL != use_standardized_word_stringsP_tail) ? conses_high.cadr(use_standardized_word_stringsP_tail) : word_linkage.T);
        assert word_linkage.NIL != Types.stringp(sentence) : sentence;
        assert word_linkage.NIL != Types.listp(options) : options;
        final SubLObject link_structures = linkage.link_parse(sentence, options, lexicon, use_standardized_word_stringsP);
        SubLObject linkages = (SubLObject)word_linkage.NIL;
        SubLObject tagged_sent = (SubLObject)word_linkage.NIL;
        if (word_linkage.NIL == link_structures) {
            return (SubLObject)word_linkage.NIL;
        }
        tagged_sent = linkage.words_to_sentence(linkage.ls_words(link_structures.first()));
        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
        linkage.auxify_sentence(tagged_sent);
        SubLObject cdolist_list_var = link_structures;
        SubLObject link_structure = (SubLObject)word_linkage.NIL;
        link_structure = cdolist_list_var.first();
        while (word_linkage.NIL != cdolist_list_var) {
            linkages = (SubLObject)ConsesLow.cons(new_word_linkage_from_link_structure(link_structure, tagged_sent, sentence, (SubLObject)((word_linkage.NIL != lexicon) ? word_linkage.T : word_linkage.NIL)), linkages);
            cdolist_list_var = cdolist_list_var.rest();
            link_structure = cdolist_list_var.first();
        }
        return linkages;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 21433L)
    public static SubLObject new_word_linkage(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == word_linkage.UNPROVIDED) {
            v_properties = (SubLObject)word_linkage.NIL;
        }
        linkage.ensure_linkage_initialized();
        return new_word_linkages(sentence, v_properties).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 21766L)
    public static SubLObject word_linkage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push(word_linkage.$sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                final SubLObject vector_var = words;
                final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject word;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
                    element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
                    word = Vectors.aref(vector_var, element_num);
                    print_high.princ(word, stream);
                    streams_high.terpri(stream);
                }
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_words(self, words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22034L)
    public static SubLObject word_linkage_print_diagram_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject diagram = get_word_linkage_diagram(self);
        try {
            thread.throwStack.push(word_linkage.$sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                print_high.princ(diagram, (SubLObject)word_linkage.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, (SubLObject)word_linkage.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_diagram(self, diagram);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22166L)
    public static SubLObject word_linkage_xml_method(final SubLObject self) {
        SubLObject xml = (SubLObject)word_linkage.NIL;
        final SubLObject indent = (SubLObject)word_linkage.ZERO_INTEGER;
        SubLObject stream = (SubLObject)word_linkage.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            PrintLow.format(stream, (SubLObject)word_linkage.$str126$_word_linkage___);
            string_utilities.tab(Numbers.add(indent, (SubLObject)word_linkage.THREE_INTEGER), stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)word_linkage.$str127$_words___);
            SubLObject word = (SubLObject)word_linkage.NIL;
            final SubLObject vector_var = instances.get_slot(self, (SubLObject)word_linkage.$sym96$WORDS);
            final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject w;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
                element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
                w = (word = Vectors.aref(vector_var, element_num));
                word_linkage_word_xml(word, stream, Numbers.add(indent, (SubLObject)word_linkage.SIX_INTEGER));
            }
            string_utilities.tab(Numbers.add(indent, (SubLObject)word_linkage.THREE_INTEGER), stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)word_linkage.$str128$__words___);
            linkage.links_xml(get_word_linkage_links(self), stream, Numbers.add(indent, (SubLObject)word_linkage.THREE_INTEGER));
            PrintLow.format(stream, (SubLObject)word_linkage.$str129$__word_linkage___);
            xml = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)word_linkage.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)word_linkage.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return xml;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 22741L)
    public static SubLObject word_linkage_word_xml(final SubLObject lw, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED, (SubLObject)word_linkage.UNPROVIDED);
        return PrintLow.format(stream, (SubLObject)word_linkage.$str131$_word_cat___a___a__word___, methods.funcall_instance_method_with_0_args(lw, (SubLObject)word_linkage.$sym43$GET_CATEGORY), methods.funcall_instance_method_with_0_args(lw, (SubLObject)word_linkage.$sym31$GET_STRING));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23021L)
    public static SubLObject word_linkage_length_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push(word_linkage.$sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, Numbers.subtract(Sequences.length(words), (SubLObject)word_linkage.TWO_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_words(self, words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23170L)
    public static SubLObject word_linkage_get_tree_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject tree_string = get_word_linkage_tree_string(self);
        try {
            thread.throwStack.push(word_linkage.$sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, tree_string);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_tree_string(self, tree_string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23319L)
    public static SubLObject word_linkage_get_word_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push(word_linkage.$sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                assert word_linkage.NIL != subl_promotions.non_negative_integer_p(i) : i;
                if (!i.numG(number_utilities.f_1_(Sequences.length(words)))) {
                    Dynamic.sublisp_throw((SubLObject)word_linkage.$sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, Vectors.aref(words, i));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_words(self, words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23581L)
    public static SubLObject word_linkage_lexify_method(final SubLObject self, final SubLObject lexicon) {
        assert word_linkage.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : lexicon;
        SubLObject word = (SubLObject)word_linkage.NIL;
        final SubLObject vector_var = instances.get_slot(self, (SubLObject)word_linkage.$sym96$WORDS);
        final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
            element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            methods.funcall_instance_method_with_1_args(word, (SubLObject)word_linkage.$sym78$LEXIFY, lexicon);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 23912L)
    public static SubLObject word_linkage_yield_method(final SubLObject self) {
        SubLObject yield = (SubLObject)word_linkage.NIL;
        SubLObject word = (SubLObject)word_linkage.NIL;
        final SubLObject vector_var = instances.get_slot(self, (SubLObject)word_linkage.$sym96$WORDS);
        final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
            element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            yield = (SubLObject)ConsesLow.cons(word, yield);
        }
        return Sequences.nreverse(yield);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 24071L)
    public static SubLObject word_linkage_search_method(final SubLObject self, final SubLObject word_string, SubLObject n) {
        if (n == word_linkage.UNPROVIDED) {
            n = (SubLObject)word_linkage.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = (SubLObject)word_linkage.NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push(word_linkage.$sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                assert word_linkage.NIL != Types.stringp(word_string) : word_string;
                assert word_linkage.NIL != subl_promotions.non_negative_integer_p(n) : n;
                SubLObject counter = (SubLObject)word_linkage.ZERO_INTEGER;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = Sequences.length(words), i = (SubLObject)word_linkage.NIL, i = (SubLObject)word_linkage.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)word_linkage.ONE_INTEGER)) {
                    if (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, (SubLObject)word_linkage.$sym140$GET_WORD, i), (SubLObject)word_linkage.$sym31$GET_STRING).equalp(word_string)) {
                        counter = Numbers.add(counter, (SubLObject)word_linkage.ONE_INTEGER);
                        if (counter.numE(n)) {
                            Dynamic.sublisp_throw((SubLObject)word_linkage.$sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args(self, (SubLObject)word_linkage.$sym140$GET_WORD, i));
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)word_linkage.$sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, (SubLObject)word_linkage.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_linkage.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_linkage_words(self, words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)word_linkage.$sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 24514L)
    public static SubLObject word_linkage_failedP(final SubLObject v_word_linkage, SubLObject verboseP) {
        if (verboseP == word_linkage.UNPROVIDED) {
            verboseP = (SubLObject)word_linkage.NIL;
        }
        assert word_linkage.NIL != word_linkage_p(v_word_linkage) : v_word_linkage;
        SubLObject word = (SubLObject)word_linkage.NIL;
        final SubLObject vector_var = instances.get_slot(v_word_linkage, (SubLObject)word_linkage.$sym96$WORDS);
        final SubLObject backwardP_var = (SubLObject)word_linkage.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)word_linkage.NIL, v_iteration = (SubLObject)word_linkage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)word_linkage.ONE_INTEGER)) {
            element_num = ((word_linkage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)word_linkage.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            if (word_linkage.NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, (SubLObject)word_linkage.$sym39$GET_POS), (SubLObject)word_linkage.$list158, Symbols.symbol_function((SubLObject)word_linkage.EQ), (SubLObject)word_linkage.UNPROVIDED) && word_linkage.NIL == methods.funcall_instance_method_with_0_args(word, (SubLObject)word_linkage.$sym64$GET_LINKS)) {
                if (word_linkage.NIL != verboseP) {
                    PrintLow.format((SubLObject)word_linkage.T, (SubLObject)word_linkage.$str159$Failure_causing_word___S_has_link, word, methods.funcall_instance_method_with_0_args(word, (SubLObject)word_linkage.$sym64$GET_LINKS));
                }
                return (SubLObject)word_linkage.T;
            }
        }
        return (SubLObject)word_linkage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-linkage.lisp", position = 25118L)
    public static SubLObject word_linkage_with_retokenization_failedP(final SubLObject nl_sentence) {
        return word_linkage_failedP(new_word_linkage(nl_sentence, (SubLObject)ConsesLow.list((SubLObject)word_linkage.$kw113$LEXICON, semtrans_lexicon.new_semtrans_lexicon())), (SubLObject)word_linkage.UNPROVIDED);
    }
    
    public static SubLObject declare_word_linkage_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_lexes", "GET-WORD-LINKAGE-WORD-LEXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_lexes", "SET-WORD-LINKAGE-WORD-LEXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_right_links", "GET-WORD-LINKAGE-WORD-RIGHT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_right_links", "SET-WORD-LINKAGE-WORD-RIGHT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_left_links", "GET-WORD-LINKAGE-WORD-LEFT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_left_links", "SET-WORD-LINKAGE-WORD-LEFT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_index", "GET-WORD-LINKAGE-WORD-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_index", "SET-WORD-LINKAGE-WORD-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_pos", "GET-WORD-LINKAGE-WORD-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_pos", "SET-WORD-LINKAGE-WORD-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_string", "GET-WORD-LINKAGE-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_string", "SET-WORD-LINKAGE-WORD-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_word_linkage", "GET-WORD-LINKAGE-WORD-LINKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_word_linkage", "SET-WORD-LINKAGE-WORD-LINKAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "subloop_reserved_initialize_word_linkage_word_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "subloop_reserved_initialize_word_linkage_word_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_p", "WORD-LINKAGE-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "new_word_linkage_word", "NEW-WORD-LINKAGE-WORD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_print_method", "WORD-LINKAGE-WORD-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_linkage_method", "WORD-LINKAGE-WORD-GET-LINKAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_string_method", "WORD-LINKAGE-WORD-GET-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_abs_index_method", "WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_pos_method", "WORD-LINKAGE-WORD-GET-POS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_category_method", "WORD-LINKAGE-WORD-GET-CATEGORY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_index_method", "WORD-LINKAGE-WORD-GET-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_lexes_method", "WORD-LINKAGE-WORD-GET-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_left_links_method", "WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_right_links_method", "WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_links_method", "WORD-LINKAGE-WORD-GET-LINKS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_directly_related_method", "WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_get_related_method", "WORD-LINKAGE-WORD-GET-RELATED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_lexify_method", "WORD-LINKAGE-WORD-LEXIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_pos_filter_lexes_method", "WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "wall_word_linkage_wordP", "WALL-WORD-LINKAGE-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_tree_string", "GET-WORD-LINKAGE-TREE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_tree_string", "SET-WORD-LINKAGE-TREE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_diagram", "GET-WORD-LINKAGE-DIAGRAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_diagram", "SET-WORD-LINKAGE-DIAGRAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_words", "GET-WORD-LINKAGE-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_words", "SET-WORD-LINKAGE-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_word_linkage_links", "GET-WORD-LINKAGE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "set_word_linkage_links", "SET-WORD-LINKAGE-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "subloop_reserved_initialize_word_linkage_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "subloop_reserved_initialize_word_linkage_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_p", "WORD-LINKAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "new_word_linkage_from_link_structure", "NEW-WORD-LINKAGE-FROM-LINK-STRUCTURE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "xml_to_word_linkage", "XML-TO-WORD-LINKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "words_sexpr_to_word_vector", "WORDS-SEXPR-TO-WORD-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "retrieve_link_word", "RETRIEVE-LINK-WORD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "find_link_id", "FIND-LINK-ID", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "get_idiom_links", "GET-IDIOM-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "incomplete_linkP", "INCOMPLETE-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "link_member_p", "LINK-MEMBER-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "new_word_linkages", "NEW-WORD-LINKAGES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "new_word_linkage", "NEW-WORD-LINKAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_print_method", "WORD-LINKAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_print_diagram_method", "WORD-LINKAGE-PRINT-DIAGRAM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_xml_method", "WORD-LINKAGE-XML-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_word_xml", "WORD-LINKAGE-WORD-XML", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_length_method", "WORD-LINKAGE-LENGTH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_get_tree_string_method", "WORD-LINKAGE-GET-TREE-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_get_word_method", "WORD-LINKAGE-GET-WORD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_lexify_method", "WORD-LINKAGE-LEXIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_yield_method", "WORD-LINKAGE-YIELD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_search_method", "WORD-LINKAGE-SEARCH-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_failedP", "WORD-LINKAGE-FAILED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_linkage", "word_linkage_with_retokenization_failedP", "WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?", 1, 0, false);
        return (SubLObject)word_linkage.NIL;
    }
    
    public static SubLObject init_word_linkage_file() {
        return (SubLObject)word_linkage.NIL;
    }
    
    public static SubLObject setup_word_linkage_file() {
        classes.subloop_new_class((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE);
        subloop_reserved_initialize_word_linkage_word_class((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym16$PRINT, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list18, (SubLObject)word_linkage.$list19);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym16$PRINT, (SubLObject)word_linkage.$sym25$WORD_LINKAGE_WORD_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym26$GET_LINKAGE, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list28);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym26$GET_LINKAGE, (SubLObject)word_linkage.$sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym31$GET_STRING, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list32);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym31$GET_STRING, (SubLObject)word_linkage.$sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym35$GET_ABS_INDEX, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list36);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym35$GET_ABS_INDEX, (SubLObject)word_linkage.$sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym39$GET_POS, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list40);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym39$GET_POS, (SubLObject)word_linkage.$sym42$WORD_LINKAGE_WORD_GET_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym43$GET_CATEGORY, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list44);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym43$GET_CATEGORY, (SubLObject)word_linkage.$sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym46$GET_INDEX, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list47);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym46$GET_INDEX, (SubLObject)word_linkage.$sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym50$GET_LEXES, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list51);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym50$GET_LEXES, (SubLObject)word_linkage.$sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym54$GET_LEFT_LINKS, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list55, (SubLObject)word_linkage.$list56);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym54$GET_LEFT_LINKS, (SubLObject)word_linkage.$sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym60$GET_RIGHT_LINKS, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list55, (SubLObject)word_linkage.$list61);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym60$GET_RIGHT_LINKS, (SubLObject)word_linkage.$sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym64$GET_LINKS, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list55, (SubLObject)word_linkage.$list65);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym64$GET_LINKS, (SubLObject)word_linkage.$sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym67$GET_DIRECTLY_RELATED, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list68, (SubLObject)word_linkage.$list69);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym67$GET_DIRECTLY_RELATED, (SubLObject)word_linkage.$sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym74$GET_RELATED, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.$list75, (SubLObject)word_linkage.$list76);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym74$GET_RELATED, (SubLObject)word_linkage.$sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym78$LEXIFY, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list79, (SubLObject)word_linkage.$list80, (SubLObject)word_linkage.$list81);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym78$LEXIFY, (SubLObject)word_linkage.$sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym83$POS_FILTER_LEXES, (SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$list17, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list85);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym0$WORD_LINKAGE_WORD, (SubLObject)word_linkage.$sym83$POS_FILTER_LEXES, (SubLObject)word_linkage.$sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD);
        classes.subloop_new_class((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym1$OBJECT, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list93);
        classes.class_set_implements_slot_listeners((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE);
        subloop_reserved_initialize_word_linkage_class((SubLObject)word_linkage.$sym92$WORD_LINKAGE);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym16$PRINT, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.$list18, (SubLObject)word_linkage.$list117);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym16$PRINT, (SubLObject)word_linkage.$sym119$WORD_LINKAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym120$PRINT_DIAGRAM, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list121);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym120$PRINT_DIAGRAM, (SubLObject)word_linkage.$sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym124$XML, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list125);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym124$XML, (SubLObject)word_linkage.$sym130$WORD_LINKAGE_XML_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym132$LENGTH, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list133);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym132$LENGTH, (SubLObject)word_linkage.$sym135$WORD_LINKAGE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym136$GET_TREE_STRING, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list137);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym136$GET_TREE_STRING, (SubLObject)word_linkage.$sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym140$GET_WORD, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.$list141, (SubLObject)word_linkage.$list142);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym140$GET_WORD, (SubLObject)word_linkage.$sym145$WORD_LINKAGE_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym78$LEXIFY, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.$list80, (SubLObject)word_linkage.$list146);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym78$LEXIFY, (SubLObject)word_linkage.$sym148$WORD_LINKAGE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym149$YIELD, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.NIL, (SubLObject)word_linkage.$list150);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym149$YIELD, (SubLObject)word_linkage.$sym151$WORD_LINKAGE_YIELD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)word_linkage.$sym152$SEARCH, (SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$list27, (SubLObject)word_linkage.$list153, (SubLObject)word_linkage.$list154);
        methods.subloop_register_instance_method((SubLObject)word_linkage.$sym92$WORD_LINKAGE, (SubLObject)word_linkage.$sym152$SEARCH, (SubLObject)word_linkage.$sym156$WORD_LINKAGE_SEARCH_METHOD);
        generic_testing.define_test_case_table_int((SubLObject)word_linkage.$sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, (SubLObject)ConsesLow.list(new SubLObject[] { word_linkage.$kw161$TEST, word_linkage.EQ, word_linkage.$kw162$OWNER, word_linkage.NIL, word_linkage.$kw163$CLASSES, word_linkage.NIL, word_linkage.$kw164$KB, word_linkage.$kw165$FULL, word_linkage.$kw166$WORKING_, word_linkage.NIL }), (SubLObject)word_linkage.$list167);
        return (SubLObject)word_linkage.NIL;
    }
    
    public void declareFunctions() {
        declare_word_linkage_file();
    }
    
    public void initializeVariables() {
        init_word_linkage_file();
    }
    
    public void runTopLevelForms() {
        setup_word_linkage_file();
    }
    
    static {
        me = (SubLFile)new word_linkage();
        $sym0$WORD_LINKAGE_WORD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKAGE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT-LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RIGHT-LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LINKAGE"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ABS-INDEX"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POS"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEFT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RIGHT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTLY-RELATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RELATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS-FILTER-LEXES"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym3$LEXES = SubLObjectFactory.makeSymbol("LEXES");
        $sym4$RIGHT_LINKS = SubLObjectFactory.makeSymbol("RIGHT-LINKS");
        $sym5$LEFT_LINKS = SubLObjectFactory.makeSymbol("LEFT-LINKS");
        $sym6$INDEX = SubLObjectFactory.makeSymbol("INDEX");
        $sym7$POS = SubLObjectFactory.makeSymbol("POS");
        $sym8$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym9$LINKAGE = SubLObjectFactory.makeSymbol("LINKAGE");
        $sym10$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym11$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS");
        $sym12$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym13$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE");
        $sym15$LINK_NAME = SubLObjectFactory.makeSymbol("LINK-NAME");
        $sym16$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Prints this link word to STREAM, ignoring DEPTH"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<LW"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("("), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("): "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $str21$__LW = SubLObjectFactory.makeString("#<LW");
        $str22$_ = SubLObjectFactory.makeString("(");
        $str23$___ = SubLObjectFactory.makeString("): ");
        $str24$_ = SubLObjectFactory.makeString(">");
        $sym25$WORD_LINKAGE_WORD_PRINT_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-PRINT-METHOD");
        $sym26$GET_LINKAGE = SubLObjectFactory.makeSymbol("GET-LINKAGE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-linkage-p; the linkage this word is a part of"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LINKAGE")));
        $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym30$WORD_LINKAGE_WORD_GET_LINKAGE_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-LINKAGE-METHOD");
        $sym31$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return string; the surface string of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym34$WORD_LINKAGE_WORD_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-STRING-METHOD");
        $sym35$GET_ABS_INDEX = SubLObjectFactory.makeSymbol("GET-ABS-INDEX");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the absolute index of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")));
        $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym38$WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD");
        $sym39$GET_POS = SubLObjectFactory.makeSymbol("GET-POS");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the part of speech of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POS")));
        $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym42$WORD_LINKAGE_WORD_GET_POS_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-POS-METHOD");
        $sym43$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return keywordp; the part of speech of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-POS")))));
        $sym45$WORD_LINKAGE_WORD_GET_CATEGORY_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-CATEGORY-METHOD");
        $sym46$GET_INDEX = SubLObjectFactory.makeSymbol("GET-INDEX");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the index of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")));
        $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym49$WORD_LINKAGE_WORD_GET_INDEX_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-INDEX-METHOD");
        $sym50$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the lexical items for this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")));
        $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym53$WORD_LINKAGE_WORD_GET_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-LEXES-METHOD");
        $sym54$GET_LEFT_LINKS = SubLObjectFactory.makeSymbol("GET-LEFT-LINKS");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"));
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-PATTERN-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEFT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LEFT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGEX-MATCH?"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"))));
        $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym58$REGEX_PATTERN_P = SubLObjectFactory.makeSymbol("REGEX-PATTERN-P");
        $sym59$WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD");
        $sym60$GET_RIGHT_LINKS = SubLObjectFactory.makeSymbol("GET-RIGHT-LINKS");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-PATTERN-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGEX-MATCH?"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"))));
        $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $sym63$WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD");
        $sym64$GET_LINKS = SubLObjectFactory.makeSymbol("GET-LINKS");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-PATTERN-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEFT-LINKS")), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RIGHT-LINKS")), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN")))));
        $sym66$WORD_LINKAGE_WORD_GET_LINKS_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-LINKS-METHOD");
        $sym67$GET_DIRECTLY_RELATED = SubLObjectFactory.makeSymbol("GET-DIRECTLY-RELATED");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PATTERN-KEYWORD keywordp;\n   @return list; the list of words that is related to this word via \n     PATTERN-KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LINK-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-GETTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_linkage.EQL, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("LEFT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEFT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)word_linkage.EQL, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RIGHT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)word_linkage.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Invalid link direction ~a"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"))))), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATTERN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)word_linkage.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-LEFT-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-RIGHT-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-LEFT-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"))));
        $kw70$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw71$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str72$Invalid_link_direction__a = SubLObjectFactory.makeString("Invalid link direction ~a");
        $sym73$WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD");
        $sym74$GET_RELATED = SubLObjectFactory.makeSymbol("GET-RELATED");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LINK-PATH list; a sequence of link-patterns\n   @return list; the list of words that is related to this word via LINK-PATH, \n      in that order"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTLY-RELATED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RELATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RELATED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH"))), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"))));
        $sym77$WORD_LINKAGE_WORD_GET_RELATED_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-GET-RELATED-METHOD");
        $sym78$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify this word with\n   @return listp; the list of lex entries used to lexify this word\n   @side-effects alters this word's lexes slot\n   see @xref link-word:lexify; this is a simpler version of that function"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_linkage.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-FILTER-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))))));
        $sym82$GET = SubLObjectFactory.makeSymbol("GET");
        $sym83$POS_FILTER_LEXES = SubLObjectFactory.makeSymbol("POS-FILTER-LEXES");
        $sym84$WORD_LINKAGE_WORD_LEXIFY_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-LEXIFY-METHOD");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Removes any lexical entries that don't match the part-of-speech of this word"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)word_linkage.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)word_linkage.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeDouble(0.75)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))));
        $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");
        $kw87$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $kw88$BACKOFF_PENN_TAGS = SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS");
        $float89$0_75 = (SubLFloat)SubLObjectFactory.makeDouble(0.75);
        $sym90$WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("LEFT-WALL"), (SubLObject)SubLObjectFactory.makeString("RIGHT-WALL"));
        $sym92$WORD_LINKAGE = SubLObjectFactory.makeSymbol("WORD-LINKAGE");
        $list93 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGRAM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-DIAGRAM"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TREE-STRING"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)word_linkage.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym94$TREE_STRING = SubLObjectFactory.makeSymbol("TREE-STRING");
        $sym95$DIAGRAM = SubLObjectFactory.makeSymbol("DIAGRAM");
        $sym96$WORDS = SubLObjectFactory.makeSymbol("WORDS");
        $sym97$LINKS = SubLObjectFactory.makeSymbol("LINKS");
        $sym98$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS");
        $sym99$SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE");
        $str100$ID = SubLObjectFactory.makeString("ID");
        $sym101$INCOMPLETE_LINK_ = SubLObjectFactory.makeSymbol("INCOMPLETE-LINK?");
        $sym102$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $str103$word_linkage = SubLObjectFactory.makeString("word-linkage");
        $str104$_a_is_not_a_linkage_xml_string = SubLObjectFactory.makeString("~a is not a linkage xml string");
        $str105$words = SubLObjectFactory.makeString("words");
        $str106$links = SubLObjectFactory.makeString("links");
        $str107$cat = SubLObjectFactory.makeString("cat");
        $str108$_ = SubLObjectFactory.makeString(".");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("*LINK-PARSE-OPTIONS*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)word_linkage.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-STANDARDIZED-WORD-STRINGS?"), (SubLObject)word_linkage.T));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("USE-STANDARDIZED-WORD-STRINGS?"));
        $kw111$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw112$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $kw113$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw114$USE_STANDARDIZED_WORD_STRINGS_ = SubLObjectFactory.makeKeyword("USE-STANDARDIZED-WORD-STRINGS?");
        $sym115$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym116$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this word-linkage to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOVECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym119$WORD_LINKAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-PRINT-METHOD");
        $sym120$PRINT_DIAGRAM = SubLObjectFactory.makeSymbol("PRINT-DIAGRAM");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this word-linkage's diagram"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGRAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_linkage.NIL));
        $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym123$WORD_LINKAGE_PRINT_DIAGRAM_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-PRINT-DIAGRAM-METHOD");
        $sym124$XML = SubLObjectFactory.makeSymbol("XML");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the XML string representation of this linkage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)word_linkage.ZERO_INTEGER)), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("XML")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("<word-linkage>~%")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)word_linkage.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("<words>~%")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-LINKAGE-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-LINKAGE-WORD-XML"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)word_linkage.SIX_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)word_linkage.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("</words>~%")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKS-XML"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORD-LINKAGE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)word_linkage.THREE_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("</word-linkage>~%")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("XML"))));
        $str126$_word_linkage___ = SubLObjectFactory.makeString("<word-linkage>~%");
        $str127$_words___ = SubLObjectFactory.makeString("<words>~%");
        $str128$__words___ = SubLObjectFactory.makeString("</words>~%");
        $str129$__word_linkage___ = SubLObjectFactory.makeString("</word-linkage>~%");
        $sym130$WORD_LINKAGE_XML_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-XML-METHOD");
        $str131$_word_cat___a___a__word___ = SubLObjectFactory.makeString("<word cat=\"~a\">~a</word>~%");
        $sym132$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return integerp; the number of words in this word-linkage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)word_linkage.TWO_INTEGER)));
        $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym135$WORD_LINKAGE_LENGTH_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-LENGTH-METHOD");
        $sym136$GET_TREE_STRING = SubLObjectFactory.makeSymbol("GET-TREE-STRING");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the tree of this word-linkage, as a string"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-STRING")));
        $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym139$WORD_LINKAGE_GET_TREE_STRING_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-GET-TREE-STRING-METHOD");
        $sym140$GET_WORD = SubLObjectFactory.makeSymbol("GET-WORD");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param I non-negative-integer\n   @return word-linkage-word-p; the Ith word of this word-linkage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("I")))));
        $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym144$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym145$WORD_LINKAGE_GET_WORD_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-GET-WORD-METHOD");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify with\n   @return word-linkage-p; this word-linkage destructively lexified with \n     lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-LINKAGE-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym147$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym148$WORD_LINKAGE_LEXIFY_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-LEXIFY-METHOD");
        $sym149$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-LINKAGE-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))));
        $sym151$WORD_LINKAGE_YIELD_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-YIELD-METHOD");
        $sym152$SEARCH = SubLObjectFactory.makeSymbol("SEARCH");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)word_linkage.ONE_INTEGER));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return word-linkage-word-p; the Nth word with string WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)word_linkage.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)word_linkage.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD")), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORD")), (SubLObject)SubLObjectFactory.makeSymbol("I")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)word_linkage.NIL)));
        $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");
        $sym156$WORD_LINKAGE_SEARCH_METHOD = SubLObjectFactory.makeSymbol("WORD-LINKAGE-SEARCH-METHOD");
        $sym157$WORD_LINKAGE_P = SubLObjectFactory.makeSymbol("WORD-LINKAGE-P");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CC"), (SubLObject)SubLObjectFactory.makeKeyword(","));
        $str159$Failure_causing_word___S_has_link = SubLObjectFactory.makeString("Failure-causing word: ~S has links: ~S~%");
        $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_ = SubLObjectFactory.makeSymbol("WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?");
        $kw161$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw162$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw163$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw164$KB = SubLObjectFactory.makeKeyword("KB");
        $kw165$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw166$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("You are likely to find a grape in grocery store")), (SubLObject)word_linkage.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Canfor Corporation today reported net income of $18.9 million for the first quarter of 2006, or $0.13 per share on a diluted basis.")), (SubLObject)word_linkage.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The man, the woman and the child slept")), (SubLObject)word_linkage.NIL));
    }
}

/*

	Total time: 664 ms
	 synthetic 
*/